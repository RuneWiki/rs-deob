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

@OriginalClass("client!dea")
public class class261 extends class753 {

    @OriginalMember(owner = "client!dea", name = "i", descriptor = "Ljava/net/ProxySelector;")
    private ProxySelector field3110 = ProxySelector.getDefault();

    @OriginalMember(owner = "client!dea", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field3111;

    @OriginalMember(owner = "client!dea", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field3112;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method1566(int arg0) throws IOException {
        boolean var2 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
        if (!var2) {
            System.setProperty("java.net.useSystemProxies", "true");
        }
        boolean var3 = this.field10439 == 443;
        List var4;
        List var5;
        try {
            var4 = this.field3110.select(new URI((var3 ? "https" : "http") + "://" + this.field10442));
            var5 = this.field3110.select(new URI((var3 ? "http" : "https") + "://" + this.field10442));
        } catch (URISyntaxException var18) {
            return this.method4209(false);
        }
        var4.addAll(var5);
        Object[] var7 = var4.toArray();
        class480 var8 = null;
        Object[] var9 = var7;
        for (int var10 = arg0; var10 < var9.length; var10++) {
            Object var11 = var9[var10];
            Proxy var12 = (Proxy) var11;
            try {
                Socket var13 = this.method1567(56, var12);
                if (var13 != null) {
                    return var13;
                }
            } catch (class480 var16) {
                var8 = var16;
            } catch (IOException var17) {
            }
        }
        if (var8 != null) {
            throw var8;
        }
        return this.method4209(false);
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(ILjava/net/Proxy;)Ljava/net/Socket;")
    private final Socket method1567(int arg0, Proxy arg1) throws IOException {
        if (arg1.type() == Type.DIRECT) {
            return this.method4209(false);
        }
        SocketAddress var3 = arg1.address();
        if (!(var3 instanceof InetSocketAddress)) {
            return null;
        }
        int var4 = 26 % ((arg0 + 27) / 40);
        InetSocketAddress var5 = (InetSocketAddress) var3;
        if (arg1.type() == Type.HTTP) {
            String var6 = null;
            try {
                Class var7 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                Method var8 = var7.getDeclaredMethod("getProxyAuth", field3111 == null ? (field3111 = method1568("java.lang.String")) : field3111, Integer.TYPE);
                var8.setAccessible(true);
                Object var9 = var8.invoke(null, var5.getHostName(), Integer.valueOf(var5.getPort()));
                if (var9 != null) {
                    Method var10 = var7.getDeclaredMethod("supportsPreemptiveAuthorization");
                    var10.setAccessible(true);
                    if ((Boolean) var10.invoke(var9)) {
                        Method var11 = var7.getDeclaredMethod("getHeaderName");
                        var11.setAccessible(true);
                        Method var12 = var7.getDeclaredMethod("getHeaderValue", field3112 == null ? (field3112 = method1568("java.net.URL")) : field3112, field3111 == null ? (field3111 = method1568("java.lang.String")) : field3111);
                        var12.setAccessible(true);
                        String var13 = (String) var11.invoke(var9);
                        String var14 = (String) var12.invoke(var9, new URL("https://" + this.field10442 + "/"), "https");
                        var6 = var13 + ": " + var14;
                    }
                }
            } catch (Exception var17) {
            }
            return this.httpProxyConnect(var5.getHostName(), var5.getPort(), var6);
        } else if (arg1.type() == Type.SOCKS) {
            Socket var16 = new Socket(arg1);
            var16.connect(new InetSocketAddress(this.field10442, this.field10439));
            return var16;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dea", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
    private final Socket httpProxyConnect(String arg0, int arg1, String arg2) throws IOException {
        Socket var4 = new Socket(arg0, arg1);
        var4.setSoTimeout(10000);
        OutputStream var5 = var4.getOutputStream();
        if (arg2 == null) {
            var5.write(("CONNECT " + this.field10442 + ":" + this.field10439 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
        } else {
            var5.write(("CONNECT " + this.field10442 + ":" + this.field10439 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
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
                        throw new class480(var11);
                    }
                    var10 = var6.readLine();
                    var8++;
                }
                throw new class480("");
            }
        }
        var5.close();
        var6.close();
        var4.close();
        return null;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1568(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
