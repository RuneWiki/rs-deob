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

@OriginalClass("client!vh")
public class class136 extends class36 {

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "Ljava/net/ProxySelector;")
    private ProxySelector field1615 = ProxySelector.getDefault();

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field1616;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "Ljava/lang/Class;")
    public static Class field1617;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ljava/net/Proxy;Z)Ljava/net/Socket;")
    private final Socket method850(Proxy arg0, boolean arg1) throws IOException {
        if (!arg1) {
            this.field1615 = null;
        }
        if (arg0.type() == Type.DIRECT) {
            return this.method322((byte) 127);
        }
        SocketAddress var3 = arg0.address();
        if (!(var3 instanceof InetSocketAddress)) {
            return null;
        }
        InetSocketAddress var4 = (InetSocketAddress) var3;
        if (arg0.type() == Type.HTTP) {
            String var6 = null;
            try {
                Class var7 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                Method var8 = var7.getDeclaredMethod("getProxyAuth", field1616 == null ? (field1616 = method851("java.lang.String")) : field1616, Integer.TYPE);
                var8.setAccessible(true);
                Object var9 = var8.invoke(null, var4.getHostName(), Integer.valueOf(var4.getPort()));
                if (var9 != null) {
                    Method var10 = var7.getDeclaredMethod("supportsPreemptiveAuthorization");
                    var10.setAccessible(true);
                    if ((Boolean) var10.invoke(var9)) {
                        Method var11 = var7.getDeclaredMethod("getHeaderName");
                        var11.setAccessible(true);
                        Method var12 = var7.getDeclaredMethod("getHeaderValue", field1617 == null ? (field1617 = method851("java.net.URL")) : field1617, field1616 == null ? (field1616 = method851("java.lang.String")) : field1616);
                        var12.setAccessible(true);
                        String var13 = (String) var11.invoke(var9);
                        String var14 = (String) var12.invoke(var9, new URL("https://" + this.field536 + "/"), "https");
                        var6 = var13 + ": " + var14;
                    }
                }
            } catch (Exception var16) {
            }
            return this.httpProxyConnect(var4.getHostName(), var4.getPort(), var6);
        } else if (arg0.type() == Type.SOCKS) {
            Socket var5 = new Socket(arg0);
            var5.connect(new InetSocketAddress(this.field536, this.field538));
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
    private final Socket httpProxyConnect(String arg0, int arg1, String arg2) throws IOException {
        Socket var4 = new Socket(arg0, arg1);
        var4.setSoTimeout(10000);
        OutputStream var5 = var4.getOutputStream();
        if (arg2 == null) {
            var5.write(("CONNECT " + this.field536 + ":" + this.field538 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
        } else {
            var5.write(("CONNECT " + this.field536 + ":" + this.field538 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
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
                String var9 = "proxy-authenticate: ";
                String var10 = var6.readLine();
                while (var10 != null && var8 < 50) {
                    if (var10.toLowerCase().startsWith(var9)) {
                        String var11 = var10.substring(var9.length()).trim();
                        int var12 = var11.indexOf(32);
                        if (var12 != -1) {
                            var11 = var11.substring(0, var12);
                        }
                        throw new class295(var11);
                    }
                    var10 = var6.readLine();
                    var8++;
                }
                throw new class295("");
            }
        }
        var5.close();
        var6.close();
        var4.close();
        return null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method323(int arg0) throws IOException {
        boolean var2 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
        if (!var2) {
            System.setProperty("java.net.useSystemProxies", "true");
        }
        boolean var3 = this.field538 == 443;
        if (arg0 != 4096) {
            return (Socket) null;
        }
        List var4;
        List var5;
        try {
            var4 = this.field1615.select(new URI((var3 ? "https" : "http") + "://" + this.field536));
            var5 = this.field1615.select(new URI((var3 ? "http" : "https") + "://" + this.field536));
        } catch (URISyntaxException var18) {
            return this.method322((byte) 127);
        }
        var4.addAll(var5);
        Object[] var7 = var4.toArray();
        class295 var8 = null;
        Object[] var9 = var7;
        for (int var10 = 0; var10 < var9.length; var10++) {
            Object var11 = var9[var10];
            Proxy var12 = (Proxy) var11;
            try {
                Socket var13 = this.method850(var12, true);
                if (var13 != null) {
                    return var13;
                }
            } catch (class295 var16) {
                var8 = var16;
            } catch (IOException var17) {
            }
        }
        if (var8 != null) {
            throw var8;
        }
        return this.method322((byte) 126);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method851(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
