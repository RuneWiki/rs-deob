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

@OriginalClass("client!aca")
public class class543 extends class434 {

    @OriginalMember(owner = "client!aca", name = "n", descriptor = "Ljava/net/ProxySelector;")
    private ProxySelector field7986 = ProxySelector.getDefault();

    @OriginalMember(owner = "client!aca", name = "o", descriptor = "Ljava/lang/Class;")
    public static Class field7987;

    @OriginalMember(owner = "client!aca", name = "p", descriptor = "Ljava/lang/Class;")
    public static Class field7988;

    @OriginalMember(owner = "client!aca", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;", line = 13)
    private final Socket httpProxyConnect(String arg0, int arg1, String arg2) throws IOException {
        Socket var4 = new Socket(arg0, arg1);
        var4.setSoTimeout(10000);
        OutputStream var5 = var4.getOutputStream();
        if (arg2 == null) {
            var5.write(("CONNECT " + this.field6242 + ":" + this.field6240 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
        } else {
            var5.write(("CONNECT " + this.field6242 + ":" + this.field6240 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
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
                        throw new class419(var11);
                    }
                    var8++;
                    var9 = var6.readLine();
                }
                throw new class419("");
            }
        }
        var5.close();
        var6.close();
        var4.close();
        return null;
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(Ljava/net/Proxy;B)Ljava/net/Socket;", line = 86)
    private final Socket method3193(Proxy arg0, byte arg1) throws IOException {
        int var3 = -99 % ((arg1 - 71) / 50);
        if (arg0.type() == Type.DIRECT) {
            return this.method2547(67);
        }
        SocketAddress var4 = arg0.address();
        if (!var4 instanceof InetSocketAddress) {
            return null;
        }
        InetSocketAddress var5 = (InetSocketAddress) var4;
        if (arg0.type() == Type.HTTP) {
            String var7 = null;
            try {
                Class var8 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                Method var9 = var8.getDeclaredMethod("getProxyAuth", field7987 == null ? (field7987 = method3194("java.lang.String")) : field7987, Integer.TYPE);
                var9.setAccessible(true);
                Object var10 = var9.invoke(null, var5.getHostName(), Integer.valueOf(var5.getPort()));
                if (var10 != null) {
                    Method var11 = var8.getDeclaredMethod("supportsPreemptiveAuthorization");
                    var11.setAccessible(true);
                    if ((Boolean) var11.invoke(var10)) {
                        Method var12 = var8.getDeclaredMethod("getHeaderName");
                        var12.setAccessible(true);
                        Method var13 = var8.getDeclaredMethod("getHeaderValue", field7988 == null ? (field7988 = method3194("java.net.URL")) : field7988, field7987 == null ? (field7987 = method3194("java.lang.String")) : field7987);
                        var13.setAccessible(true);
                        String var14 = (String) var12.invoke(var10);
                        String var15 = (String) var13.invoke(var10, new URL("https://" + this.field6242 + "/"), "https");
                        var7 = var14 + ": " + var15;
                    }
                }
            } catch (Exception var17) {
            }
            return this.httpProxyConnect(var5.getHostName(), var5.getPort(), var7);
        } else if (arg0.type() == Type.SOCKS) {
            Socket var6 = new Socket(arg0);
            var6.connect(new InetSocketAddress(this.field6242, this.field6240));
            return var6;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 117)
    public static Class method3194(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(I)Ljava/net/Socket;", line = 162)
    public final Socket method2546(int arg0) throws IOException {
        boolean var2 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
        if (arg0 != 4) {
            return (Socket) null;
        }
        if (!var2) {
            System.setProperty("java.net.useSystemProxies", "true");
        }
        boolean var3 = this.field6240 == 443;
        List var4;
        List var5;
        try {
            var4 = this.field7986.select(new URI((var3 ? "https" : "http") + "://" + this.field6242));
            var5 = this.field7986.select(new URI((var3 ? "http" : "https") + "://" + this.field6242));
        } catch (URISyntaxException var18) {
            return this.method2547(arg0 + 120);
        }
        var4.addAll(var5);
        Object[] var7 = var4.toArray();
        class419 var8 = null;
        Object[] var9 = var7;
        for (int var10 = 0; var10 < var9.length; var10++) {
            Object var11 = var9[var10];
            Proxy var12 = (Proxy) var11;
            try {
                Socket var13 = this.method3193(var12, (byte) -29);
                if (var13 != null) {
                    return var13;
                }
            } catch (class419 var16) {
                var8 = var16;
            } catch (IOException var17) {
            }
        }
        if (var8 != null) {
            throw var8;
        }
        return this.method2547(114);
    }
}
