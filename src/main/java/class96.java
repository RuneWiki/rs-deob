import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.Proxy.Type;
import java.nio.charset.Charset;
import java.util.List;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oia")
public class class96 extends class769 {

    @OriginalMember(owner = "client!oia", name = "e", descriptor = "Ljava/net/ProxySelector;")
    private ProxySelector field1345 = ProxySelector.getDefault();

    @OriginalMember(owner = "client!oia", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field1346;

    @OriginalMember(owner = "client!oia", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field1347;

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(ILjava/net/Proxy;)Ljava/net/Socket;")
    private final Socket method757(int arg0, Proxy arg1) throws IOException {
        if (arg1.type() == Type.DIRECT) {
            return this.method4257(false);
        }
        SocketAddress var3 = arg1.address();
        if (arg0 != 0) {
            return (Socket) null;
        } else if ((var3 instanceof InetSocketAddress)) {
            InetSocketAddress var4 = (InetSocketAddress) var3;
            if (arg1.type() == Type.HTTP) {
                String var5 = null;
                try {
                    Class var6 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                    Method var7 = var6.getDeclaredMethod("getProxyAuth", field1346 == null ? (field1346 = method759("java.lang.String")) : field1346, Integer.TYPE);
                    var7.setAccessible(true);
                    Object var8 = var7.invoke(null, var4.getHostName(), Integer.valueOf(var4.getPort()));
                    if (var8 != null) {
                        Method var9 = var6.getDeclaredMethod("supportsPreemptiveAuthorization");
                        var9.setAccessible(true);
                        if ((Boolean) var9.invoke(var8)) {
                            Method var10 = var6.getDeclaredMethod("getHeaderName");
                            var10.setAccessible(true);
                            Method var11 = var6.getDeclaredMethod("getHeaderValue", field1347 == null ? (field1347 = method759("java.net.URL")) : field1347, field1346 == null ? (field1346 = method759("java.lang.String")) : field1346);
                            var11.setAccessible(true);
                            String var12 = (String) var10.invoke(var8);
                            String var13 = (String) var11.invoke(var8, new URL("https://" + this.field10597 + "/"), "https");
                            var5 = var12 + ": " + var13;
                        }
                    }
                } catch (Exception var16) {
                }
                return this.httpProxyConnect(var4.getHostName(), var4.getPort(), var5);
            } else if (arg1.type() == Type.SOCKS) {
                Socket var15 = new Socket(arg1);
                var15.connect(new InetSocketAddress(this.field10597, this.field10596));
                return var15;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oia", name = "b", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method758(int arg0) throws IOException {
        int var2 = -43 / ((-arg0 - 36) / 49);
        boolean var3 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
        if (!var3) {
            System.setProperty("java.net.useSystemProxies", "true");
        }
        boolean var4 = this.field10596 == 443;
        List var5;
        List var6;
        try {
            var5 = this.field1345.select(new URI((var4 ? "https" : "http") + "://" + this.field10597));
            var6 = this.field1345.select(new URI((var4 ? "http" : "https") + "://" + this.field10597));
        } catch (URISyntaxException var19) {
            return this.method4257(false);
        }
        var5.addAll(var6);
        Object[] var8 = var5.toArray();
        class370 var9 = null;
        Object[] var10 = var8;
        for (int var11 = 0; var11 < var10.length; var11++) {
            Object var12 = var10[var11];
            Proxy var13 = (Proxy) var12;
            try {
                Socket var14 = this.method757(0, var13);
                if (var14 != null) {
                    return var14;
                }
            } catch (class370 var17) {
                var9 = var17;
            } catch (IOException var18) {
            }
        }
        if (var9 != null) {
            throw var9;
        }
        return this.method4257(false);
    }

    @OriginalMember(owner = "client!oia", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
    private final Socket httpProxyConnect(String arg0, int arg1, String arg2) throws IOException {
        Socket var4 = new Socket(arg0, arg1);
        var4.setSoTimeout(10000);
        OutputStream var5 = var4.getOutputStream();
        if (arg2 == null) {
            var5.write(("CONNECT " + this.field10597 + ":" + this.field10596 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
        } else {
            var5.write(("CONNECT " + this.field10597 + ":" + this.field10596 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
        }
        var5.flush();
        BufferedReader var6 = new BufferedReader(new InputStreamReader(var4.getInputStream()));
        String var7 = var6.readLine();
        if (var7 != null) {
            if (var7.startsWith("HTTP/1.0 200") || var7.startsWith("HTTP/1.1 200")) {
                return var4;
            }
            if (var7.startsWith("HTTP/1.0 407") || var7.startsWith("HTTP/1.1 407")) {
                int var8 = 0;
                String var9 = var6.readLine();
                String var10 = "proxy-authenticate: ";
                while (var9 != null && var8 < 50) {
                    if (var9.toLowerCase().startsWith(var10)) {
                        String var11 = var9.substring(var10.length()).trim();
                        int var12 = var11.indexOf(32);
                        if (var12 != -1) {
                            var11 = var11.substring(0, var12);
                        }
                        throw new class370(var11);
                    }
                    var9 = var6.readLine();
                    var8++;
                }
                throw new class370("");
            }
        }
        var5.close();
        var6.close();
        var4.close();
        return null;
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method759(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
