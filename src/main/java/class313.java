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

@OriginalClass("client!wt")
public class class313 extends class173 {

    @OriginalMember(owner = "client!wt", name = "h", descriptor = "Ljava/net/ProxySelector;")
    private ProxySelector field4233 = ProxySelector.getDefault();

    @OriginalMember(owner = "client!wt", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field4234;

    @OriginalMember(owner = "client!wt", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field4235;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILjava/net/Proxy;)Ljava/net/Socket;", line = 12)
    private final Socket method1873(int arg0, Proxy arg1) throws IOException {
        if (arg1.type() == Type.DIRECT) {
            return this.method998((byte) -53);
        }
        SocketAddress var3 = arg1.address();
        if (!(var3 instanceof InetSocketAddress)) {
            return null;
        }
        InetSocketAddress var4 = (InetSocketAddress) var3;
        if (arg1.type() == Type.HTTP) {
            String var6 = null;
            try {
                Class var7 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                Method var8 = var7.getDeclaredMethod("getProxyAuth", field4234 == null ? (field4234 = method1874("java.lang.String")) : field4234, Integer.TYPE);
                var8.setAccessible(true);
                Object var9 = var8.invoke(null, var4.getHostName(), Integer.valueOf(var4.getPort()));
                if (var9 != null) {
                    Method var10 = var7.getDeclaredMethod("supportsPreemptiveAuthorization");
                    var10.setAccessible(true);
                    if ((Boolean) var10.invoke(var9)) {
                        Method var11 = var7.getDeclaredMethod("getHeaderName");
                        var11.setAccessible(true);
                        Method var12 = var7.getDeclaredMethod("getHeaderValue", field4235 == null ? (field4235 = method1874("java.net.URL")) : field4235, field4234 == null ? (field4234 = method1874("java.lang.String")) : field4234);
                        var12.setAccessible(true);
                        String var13 = (String) var11.invoke(var9);
                        String var14 = (String) var12.invoke(var9, new URL("https://" + this.field2143 + "/"), "https");
                        var6 = var13 + ": " + var14;
                    }
                }
            } catch (Exception var16) {
            }
            return this.httpProxyConnect(var4.getHostName(), var4.getPort(), var6);
        } else if (arg1.type() == Type.SOCKS) {
            Socket var5 = new Socket(arg1);
            var5.connect(new InetSocketAddress(this.field2143, this.field2149));
            return var5;
        } else {
            if (arg0 != -6562) {
                this.field4233 = null;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 39)
    public static Class method1874(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)Ljava/net/Socket;", line = 89)
    public final Socket method995(int arg0) throws IOException {
        if (arg0 != -2) {
            return (Socket) null;
        }
        boolean var2 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
        if (!var2) {
            System.setProperty("java.net.useSystemProxies", "true");
        }
        boolean var3 = this.field2149 == 443;
        List var4;
        List var5;
        try {
            var4 = this.field4233.select(new URI((var3 ? "https" : "http") + "://" + this.field2143));
            var5 = this.field4233.select(new URI((var3 ? "http" : "https") + "://" + this.field2143));
        } catch (URISyntaxException var18) {
            return this.method998((byte) -53);
        }
        var4.addAll(var5);
        Object[] var7 = var4.toArray();
        class149 var8 = null;
        Object[] var9 = var7;
        for (int var10 = 0; var10 < var9.length; var10++) {
            Object var11 = var9[var10];
            Proxy var12 = (Proxy) var11;
            try {
                Socket var13 = this.method1873(-6562, var12);
                if (var13 != null) {
                    return var13;
                }
            } catch (class149 var16) {
                var8 = var16;
            } catch (IOException var17) {
            }
        }
        if (var8 != null) {
            throw var8;
        }
        return this.method998((byte) -53);
    }

    @OriginalMember(owner = "client!wt", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;", line = 162)
    private final Socket httpProxyConnect(String arg0, int arg1, String arg2) throws IOException {
        Socket var4 = new Socket(arg0, arg1);
        var4.setSoTimeout(10000);
        OutputStream var5 = var4.getOutputStream();
        if (arg2 == null) {
            var5.write(("CONNECT " + this.field2143 + ":" + this.field2149 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
        } else {
            var5.write(("CONNECT " + this.field2143 + ":" + this.field2149 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
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
                for (String var10 = var6.readLine(); var10 != null && var8 < 50; var10 = var6.readLine()) {
                    if (var10.toLowerCase().startsWith(var9)) {
                        String var11 = var10.substring(var9.length()).trim();
                        int var12 = var11.indexOf(32);
                        if (var12 != -1) {
                            var11 = var11.substring(0, var12);
                        }
                        throw new class149(var11);
                    }
                    var8++;
                }
                throw new class149("");
            }
        }
        var5.close();
        var6.close();
        var4.close();
        return null;
    }
}
