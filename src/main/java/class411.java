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

@OriginalClass("client!maa")
public class class411 extends class244 {

    @OriginalMember(owner = "client!maa", name = "g", descriptor = "Ljava/net/ProxySelector;")
    private ProxySelector field6112 = ProxySelector.getDefault();

    @OriginalMember(owner = "client!maa", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field6113;

    @OriginalMember(owner = "client!maa", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field6114;

    @OriginalMember(owner = "client!maa", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;", line = 13)
    private final Socket httpProxyConnect(String arg0, int arg1, String arg2) throws IOException {
        Socket var4 = new Socket(arg0, arg1);
        var4.setSoTimeout(10000);
        OutputStream var5 = var4.getOutputStream();
        if (arg2 == null) {
            var5.write(("CONNECT " + this.field3233 + ":" + this.field3238 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
        } else {
            var5.write(("CONNECT " + this.field3233 + ":" + this.field3238 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
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
                        throw new class54(var11);
                    }
                    var9 = var6.readLine();
                    var8++;
                }
                throw new class54("");
            }
        }
        var5.close();
        var6.close();
        var4.close();
        return null;
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(Ljava/net/Proxy;I)Ljava/net/Socket;", line = 86)
    private final Socket method2517(Proxy arg0, int arg1) throws IOException {
        if (arg0.type() == Type.DIRECT) {
            return this.method1495(arg1 + 1);
        }
        SocketAddress var3 = arg0.address();
        if (!var3 instanceof InetSocketAddress) {
            return null;
        }
        InetSocketAddress var4 = (InetSocketAddress) var3;
        if (arg1 != 0) {
            this.field6112 = null;
        }
        if (arg0.type() == Type.HTTP) {
            String var5 = null;
            try {
                Class var6 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                Method var7 = var6.getDeclaredMethod("getProxyAuth", field6113 == null ? (field6113 = method2518("java.lang.String")) : field6113, Integer.TYPE);
                var7.setAccessible(true);
                Object var8 = var7.invoke(null, var4.getHostName(), Integer.valueOf(var4.getPort()));
                if (var8 != null) {
                    Method var9 = var6.getDeclaredMethod("supportsPreemptiveAuthorization");
                    var9.setAccessible(true);
                    if ((Boolean) var9.invoke(var8)) {
                        Method var10 = var6.getDeclaredMethod("getHeaderName");
                        var10.setAccessible(true);
                        Method var11 = var6.getDeclaredMethod("getHeaderValue", field6114 == null ? (field6114 = method2518("java.net.URL")) : field6114, field6113 == null ? (field6113 = method2518("java.lang.String")) : field6113);
                        var11.setAccessible(true);
                        String var12 = (String) var10.invoke(var8);
                        String var13 = (String) var11.invoke(var8, new URL("https://" + this.field3233 + "/"), "https");
                        var5 = var12 + ": " + var13;
                    }
                }
            } catch (Exception var16) {
            }
            return this.httpProxyConnect(var4.getHostName(), var4.getPort(), var5);
        } else if (arg0.type() == Type.SOCKS) {
            Socket var15 = new Socket(arg0);
            var15.connect(new InetSocketAddress(this.field3233, this.field3238));
            return var15;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 110)
    public static Class method2518(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(I)Ljava/net/Socket;", line = 164)
    public final Socket method1136(int arg0) throws IOException {
        boolean var2 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
        if (!var2) {
            System.setProperty("java.net.useSystemProxies", "true");
        }
        boolean var3 = this.field3238 == 443;
        List var4;
        List var5;
        try {
            var4 = this.field6112.select(new URI((var3 ? "https" : "http") + "://" + this.field3233));
            var5 = this.field6112.select(new URI((var3 ? "http" : "https") + "://" + this.field3233));
        } catch (URISyntaxException var19) {
            return this.method1495(1);
        }
        var4.addAll(var5);
        Object[] var7 = var4.toArray();
        int var8 = -12 / ((19 - arg0) / 58);
        class54 var9 = null;
        Object[] var10 = var7;
        for (int var11 = 0; var11 < var10.length; var11++) {
            Object var12 = var10[var11];
            Proxy var13 = (Proxy) var12;
            try {
                Socket var14 = this.method2517(var13, 0);
                if (var14 != null) {
                    return var14;
                }
            } catch (class54 var17) {
                var9 = var17;
            } catch (IOException var18) {
            }
        }
        if (var9 != null) {
            throw var9;
        }
        return this.method1495(1);
    }
}
