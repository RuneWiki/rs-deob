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

@OriginalClass("client!dv")
public class class609 extends class408 {

    @OriginalMember(owner = "client!dv", name = "h", descriptor = "Ljava/net/ProxySelector;")
    private ProxySelector field8743 = ProxySelector.getDefault();

    @OriginalMember(owner = "client!dv", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field8744;

    @OriginalMember(owner = "client!dv", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field8745;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(ILjava/net/Proxy;)Ljava/net/Socket;", line = 13)
    private final Socket method3498(int arg0, Proxy arg1) throws IOException {
        if (arg1.type() == Type.DIRECT) {
            return this.method2469((byte) 80);
        }
        SocketAddress var3 = arg1.address();
        if (arg0 != -22282) {
            return (Socket) null;
        } else if ((var3 instanceof InetSocketAddress)) {
            InetSocketAddress var4 = (InetSocketAddress) var3;
            if (arg1.type() == Type.HTTP) {
                String var6 = null;
                try {
                    Class var7 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                    Method var8 = var7.getDeclaredMethod("getProxyAuth", field8744 == null ? (field8744 = method3499("java.lang.String")) : field8744, Integer.TYPE);
                    var8.setAccessible(true);
                    Object var9 = var8.invoke(null, var4.getHostName(), Integer.valueOf(var4.getPort()));
                    if (var9 != null) {
                        Method var10 = var7.getDeclaredMethod("supportsPreemptiveAuthorization");
                        var10.setAccessible(true);
                        if ((Boolean) var10.invoke(var9)) {
                            Method var11 = var7.getDeclaredMethod("getHeaderName");
                            var11.setAccessible(true);
                            Method var12 = var7.getDeclaredMethod("getHeaderValue", field8745 == null ? (field8745 = method3499("java.net.URL")) : field8745, field8744 == null ? (field8744 = method3499("java.lang.String")) : field8744);
                            var12.setAccessible(true);
                            String var13 = (String) var11.invoke(var9);
                            String var14 = (String) var12.invoke(var9, new URL("https://" + this.field5790 + "/"), "https");
                            var6 = var13 + ": " + var14;
                        }
                    }
                } catch (Exception var16) {
                }
                return this.httpProxyConnect(var4.getHostName(), var4.getPort(), var6);
            } else if (arg1.type() == Type.SOCKS) {
                Socket var5 = new Socket(arg1);
                var5.connect(new InetSocketAddress(this.field5790, this.field5787));
                return var5;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 45)
    public static Class method3499(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!dv", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;", line = 92)
    private final Socket httpProxyConnect(String arg0, int arg1, String arg2) throws IOException {
        Socket var4 = new Socket(arg0, arg1);
        var4.setSoTimeout(10000);
        OutputStream var5 = var4.getOutputStream();
        if (arg2 == null) {
            var5.write(("CONNECT " + this.field5790 + ":" + this.field5787 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
        } else {
            var5.write(("CONNECT " + this.field5790 + ":" + this.field5787 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
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
                        throw new class437(var11);
                    }
                    var10 = var6.readLine();
                    var8++;
                }
                throw new class437("");
            }
        }
        var5.close();
        var6.close();
        var4.close();
        return null;
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(I)Ljava/net/Socket;", line = 174)
    public final Socket method765(int arg0) throws IOException {
        boolean var2 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
        if (!var2) {
            System.setProperty("java.net.useSystemProxies", "true");
        }
        boolean var3 = this.field5787 == 443;
        List var4;
        List var5;
        try {
            var4 = this.field8743.select(new URI((var3 ? "https" : "http") + "://" + this.field5790));
            var5 = this.field8743.select(new URI((var3 ? "http" : "https") + "://" + this.field5790));
        } catch (URISyntaxException var18) {
            return this.method2469((byte) 80);
        }
        if (arg0 != 512) {
            this.field8743 = null;
        }
        var4.addAll(var5);
        Object[] var7 = var4.toArray();
        class437 var8 = null;
        Object[] var9 = var7;
        for (int var10 = 0; var10 < var9.length; var10++) {
            Object var11 = var9[var10];
            Proxy var12 = (Proxy) var11;
            try {
                Socket var13 = this.method3498(-22282, var12);
                if (var13 != null) {
                    return var13;
                }
            } catch (class437 var16) {
                var8 = var16;
            } catch (IOException var17) {
            }
        }
        if (var8 != null) {
            throw var8;
        }
        return this.method2469((byte) 80);
    }
}
