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

@OriginalClass("client!bea")
public class class700 extends class364 {

    @OriginalMember(owner = "client!bea", name = "k", descriptor = "Ljava/net/ProxySelector;")
    private ProxySelector field9861 = ProxySelector.getDefault();

    @OriginalMember(owner = "client!bea", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field9862;

    @OriginalMember(owner = "client!bea", name = "m", descriptor = "Ljava/lang/Class;")
    public static Class field9863;

    @OriginalMember(owner = "client!bea", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
    private final Socket httpProxyConnect(String arg0, int arg1, String arg2) throws IOException {
        Socket var4 = new Socket(arg0, arg1);
        var4.setSoTimeout(10000);
        OutputStream var5 = var4.getOutputStream();
        if (arg2 == null) {
            var5.write(("CONNECT " + this.field4806 + ":" + this.field4814 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
        } else {
            var5.write(("CONNECT " + this.field4806 + ":" + this.field4814 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
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
                        throw new class663(var11);
                    }
                    var8++;
                    var9 = var6.readLine();
                }
                throw new class663("");
            }
        }
        var5.close();
        var6.close();
        var4.close();
        return null;
    }

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method1662(int arg0) throws IOException {
        boolean var2 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
        if (!var2) {
            System.setProperty("java.net.useSystemProxies", "true");
        }
        boolean var3 = this.field4814 == 443;
        List var4;
        List var5;
        try {
            var4 = this.field9861.select(new URI((var3 ? "https" : "http") + "://" + this.field4806));
            var5 = this.field9861.select(new URI((var3 ? "http" : "https") + "://" + this.field4806));
        } catch (URISyntaxException var19) {
            return this.method2125((byte) -108);
        }
        var4.addAll(var5);
        Object[] var7 = var4.toArray();
        int var8 = -38 / ((arg0 + 43) / 42);
        class663 var9 = null;
        Object[] var10 = var7;
        for (int var11 = 0; var11 < var10.length; var11++) {
            Object var12 = var10[var11];
            Proxy var13 = (Proxy) var12;
            try {
                Socket var14 = this.method3937(-444, var13);
                if (var14 != null) {
                    return var14;
                }
            } catch (class663 var17) {
                var9 = var17;
            } catch (IOException var18) {
            }
        }
        if (var9 != null) {
            throw var9;
        }
        return this.method2125((byte) -77);
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(ILjava/net/Proxy;)Ljava/net/Socket;")
    private final Socket method3937(int arg0, Proxy arg1) throws IOException {
        if (arg1.type() == Type.DIRECT) {
            return this.method2125((byte) -62);
        }
        if (arg0 != -444) {
            this.field9861 = null;
        }
        SocketAddress var3 = arg1.address();
        if (!var3 instanceof InetSocketAddress) {
            return null;
        }
        InetSocketAddress var4 = (InetSocketAddress) var3;
        if (arg1.type() == Type.HTTP) {
            String var6 = null;
            try {
                Class var7 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                Method var8 = var7.getDeclaredMethod("getProxyAuth", field9862 == null ? (field9862 = method3938("java.lang.String")) : field9862, Integer.TYPE);
                var8.setAccessible(true);
                Object var9 = var8.invoke(null, var4.getHostName(), Integer.valueOf(var4.getPort()));
                if (var9 != null) {
                    Method var10 = var7.getDeclaredMethod("supportsPreemptiveAuthorization");
                    var10.setAccessible(true);
                    if ((Boolean) var10.invoke(var9)) {
                        Method var11 = var7.getDeclaredMethod("getHeaderName");
                        var11.setAccessible(true);
                        Method var12 = var7.getDeclaredMethod("getHeaderValue", field9863 == null ? (field9863 = method3938("java.net.URL")) : field9863, field9862 == null ? (field9862 = method3938("java.lang.String")) : field9862);
                        var12.setAccessible(true);
                        String var13 = (String) var11.invoke(var9);
                        String var14 = (String) var12.invoke(var9, new URL("https://" + this.field4806 + "/"), "https");
                        var6 = var13 + ": " + var14;
                    }
                }
            } catch (Exception var16) {
            }
            return this.httpProxyConnect(var4.getHostName(), var4.getPort(), var6);
        } else if (arg1.type() == Type.SOCKS) {
            Socket var5 = new Socket(arg1);
            var5.connect(new InetSocketAddress(this.field4806, this.field4814));
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3938(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
