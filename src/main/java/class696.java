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

@OriginalClass("client!hda")
public class class696 extends class320 {

    @OriginalMember(owner = "client!hda", name = "j", descriptor = "Ljava/net/ProxySelector;")
    private ProxySelector field9755 = ProxySelector.getDefault();

    @OriginalMember(owner = "client!hda", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field9756;

    @OriginalMember(owner = "client!hda", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field9757;

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method1604(int arg0) throws IOException {
        int var2 = 53 / ((arg0 + 20) / 59);
        boolean var3 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
        if (!var3) {
            System.setProperty("java.net.useSystemProxies", "true");
        }
        boolean var4 = this.field5012 == 443;
        List var5;
        List var6;
        try {
            var5 = this.field9755.select(new URI((var4 ? "https" : "http") + "://" + this.field5008));
            var6 = this.field9755.select(new URI((var4 ? "http" : "https") + "://" + this.field5008));
        } catch (URISyntaxException var19) {
            return this.method2176(true);
        }
        var5.addAll(var6);
        Object[] var8 = var5.toArray();
        class191 var9 = null;
        Object[] var10 = var8;
        for (int var11 = 0; var11 < var10.length; var11++) {
            Object var12 = var10[var11];
            Proxy var13 = (Proxy) var12;
            try {
                Socket var14 = this.method3927(var13, 0);
                if (var14 != null) {
                    return var14;
                }
            } catch (class191 var17) {
                var9 = var17;
            } catch (IOException var18) {
            }
        }
        if (var9 != null) {
            throw var9;
        }
        return this.method2176(true);
    }

    @OriginalMember(owner = "client!hda", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
    private final Socket httpProxyConnect(String arg0, int arg1, String arg2) throws IOException {
        Socket var4 = new Socket(arg0, arg1);
        var4.setSoTimeout(10000);
        OutputStream var5 = var4.getOutputStream();
        if (arg2 == null) {
            var5.write(("CONNECT " + this.field5008 + ":" + this.field5012 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
        } else {
            var5.write(("CONNECT " + this.field5008 + ":" + this.field5012 + " HTTP/1.0\n" + arg2 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
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
                        throw new class191(var11);
                    }
                    var8++;
                }
                throw new class191("");
            }
        }
        var5.close();
        var6.close();
        var4.close();
        return null;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(Ljava/net/Proxy;I)Ljava/net/Socket;")
    private final Socket method3927(Proxy arg0, int arg1) throws IOException {
        if (arg0.type() == Type.DIRECT) {
            return this.method2176(true);
        }
        SocketAddress var3 = arg0.address();
        if (!var3 instanceof InetSocketAddress) {
            return null;
        }
        InetSocketAddress var4 = (InetSocketAddress) var3;
        if (arg0.type() == Type.HTTP) {
            String var6 = null;
            try {
                Class var7 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                Method var8 = var7.getDeclaredMethod("getProxyAuth", field9756 == null ? (field9756 = method3928("java.lang.String")) : field9756, Integer.TYPE);
                var8.setAccessible(true);
                Object var9 = var8.invoke(null, var4.getHostName(), Integer.valueOf(var4.getPort()));
                if (var9 != null) {
                    Method var10 = var7.getDeclaredMethod("supportsPreemptiveAuthorization");
                    var10.setAccessible(true);
                    if ((Boolean) var10.invoke(var9)) {
                        Method var11 = var7.getDeclaredMethod("getHeaderName");
                        var11.setAccessible(true);
                        Method var12 = var7.getDeclaredMethod("getHeaderValue", field9757 == null ? (field9757 = method3928("java.net.URL")) : field9757, field9756 == null ? (field9756 = method3928("java.lang.String")) : field9756);
                        var12.setAccessible(true);
                        String var13 = (String) var11.invoke(var9);
                        String var14 = (String) var12.invoke(var9, new URL("https://" + this.field5008 + "/"), "https");
                        var6 = var13 + ": " + var14;
                    }
                }
            } catch (Exception var16) {
            }
            return this.httpProxyConnect(var4.getHostName(), var4.getPort(), var6);
        } else if (arg0.type() == Type.SOCKS) {
            Socket var5 = new Socket(arg0);
            var5.connect(new InetSocketAddress(this.field5008, this.field5012));
            return var5;
        } else {
            if (arg1 != 0) {
                this.field9755 = null;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3928(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
