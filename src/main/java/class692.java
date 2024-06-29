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

@OriginalClass("client!bca")
public class class692 extends class547 {

    @OriginalMember(owner = "client!bca", name = "j", descriptor = "Ljava/net/ProxySelector;")
    private ProxySelector field9966 = ProxySelector.getDefault();

    @OriginalMember(owner = "client!bca", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9969 = new String[] { method5031(method5030("y\u0005u\u00002\u0000\u007f\u0010p/\u0001a")), method5031(method5030("r\u001eo\u001eXr\u0005\u0001")), method5031(method5030("y\u0005u\u00002\u0000\u007f\u0010p)\u0001f")), method5031(method5030("\u0011\u0019u\u0004M\u001e`\u000f`\u0017")), method5031(method5030("A#N(d\u001c0T$uT?U9~P%Dj=")), method5031(method5030("y\u0005u\u00002\u0000\u007f\u0011p)\u0001f")), method5031(method5030("y\u0005u\u00002\u0000\u007f\u0011p/\u0001a")), method5031(method5030("\u0011\u0019u\u0004M\u001e`\u000f`\u0017;")), method5031(method5030(";[")), method5031(method5030("x\u0002n}%\td\u0018},")), method5031(method5030("E#T5")), method5031(method5030("\u000b~\u000e")), method5031(method5030("Y%U ")), method5031(method5030("Y%U n")), method5031(method5030("[0W13_4U~hB4r)nE4L\u0000o^)H5n")), method5031(method5030("V4U\u0018xP5D\"KP=T5")), method5031(method5030("V4U\u0000o^)X\u0011hE9")), method5031(method5030("B$O~sT%\u000f'jF\u007fQ\"rE>B?q\u001f9U$m\u001f\u0010T$uT?U9~P%H?sx?G?")), method5031(method5030("B$Q rC%R\u0000oT4L iX'D\u0011hE9N\"tK0U9r_")), method5031(method5030("[0W13]0O73b%S9sV")), method5031(method5030("Y%U n\u000b~\u000e")), method5031(method5030("\u000bq")), method5031(method5030("[0W13_4U~Hc\u001d")), method5031(method5030("V4U\u0018xP5D\"SP<D")) };

    @OriginalMember(owner = "client!bca", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field9967;

    @OriginalMember(owner = "client!bca", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field9968;

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(Ljava/net/Proxy;I)Ljava/net/Socket;")
    private final Socket method5028(Proxy arg0, int arg1) throws IOException {
        if (arg0.type() == Type.DIRECT) {
            return this.method4062(102);
        }
        SocketAddress var3 = arg0.address();
        int var4 = -46 % ((arg1 - 48) / 32);
        if (!var3 instanceof InetSocketAddress) {
            return null;
        }
        InetSocketAddress var5 = (InetSocketAddress) var3;
        if (arg0.type() == Type.HTTP) {
            String var6 = null;
            try {
                Class var7 = Class.forName(field9969[17]);
                Method var8 = var7.getDeclaredMethod(field9969[16], field9967 == null ? (field9967 = method5029(field9969[19])) : field9967, Integer.TYPE);
                var8.setAccessible(true);
                Object var9 = var8.invoke(null, var5.getHostName(), Integer.valueOf(var5.getPort()));
                if (var9 != null) {
                    Method var10 = var7.getDeclaredMethod(field9969[18]);
                    var10.setAccessible(true);
                    if ((Boolean) var10.invoke(var9)) {
                        Method var11 = var7.getDeclaredMethod(field9969[23]);
                        var11.setAccessible(true);
                        Method var12 = var7.getDeclaredMethod(field9969[15], field9968 == null ? (field9968 = method5029(field9969[22])) : field9968, field9967 == null ? (field9967 = method5029(field9969[19])) : field9967);
                        var12.setAccessible(true);
                        String var13 = (String) var11.invoke(var9);
                        String var14 = (String) var12.invoke(var9, new URL(field9969[20] + this.field8039 + "/"), field9969[13]);
                        var6 = var13 + field9969[21] + var14;
                    }
                }
            } catch (Exception var17) {
            }
            return this.httpProxyConnect(var5.getHostName(), var5.getPort(), var6);
        } else if (arg0.type() == Type.SOCKS) {
            Socket var16 = new Socket(arg0);
            var16.connect(new InetSocketAddress(this.field8039, this.field8038));
            return var16;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bca", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;")
    private final Socket httpProxyConnect(String arg0, int arg1, String arg2) throws IOException {
        Socket var4 = new Socket(arg0, arg1);
        var4.setSoTimeout(10000);
        OutputStream var5 = var4.getOutputStream();
        if (arg2 == null) {
            var5.write((field9969[1] + this.field8039 + ":" + this.field8038 + field9969[7]).getBytes(Charset.forName(field9969[9])));
        } else {
            var5.write((field9969[1] + this.field8039 + ":" + this.field8038 + field9969[3] + arg2 + field9969[8]).getBytes(Charset.forName(field9969[9])));
        }
        var5.flush();
        BufferedReader var6 = new BufferedReader(new InputStreamReader(var4.getInputStream()));
        String var7 = var6.readLine();
        if (var7 != null) {
            if (var7.startsWith(field9969[6]) || var7.startsWith(field9969[0])) {
                return var4;
            }
            if (var7.startsWith(field9969[5]) || var7.startsWith(field9969[2])) {
                int var8 = 0;
                String var9 = field9969[4];
                for (String var10 = var6.readLine(); var10 != null && var8 < 50; var10 = var6.readLine()) {
                    if (var10.toLowerCase().startsWith(var9)) {
                        String var11 = var10.substring(var9.length()).trim();
                        int var12 = var11.indexOf(32);
                        if (var12 != -1) {
                            var11 = var11.substring(0, var12);
                        }
                        throw new class27(var11);
                    }
                    var8++;
                }
                throw new class27("");
            }
        }
        var5.close();
        var6.close();
        var4.close();
        return null;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method4061(int arg0) throws IOException {
        boolean var2 = Boolean.parseBoolean(System.getProperty(field9969[14]));
        if (!var2) {
            System.setProperty(field9969[14], field9969[10]);
        }
        boolean var3 = this.field8038 == 443;
        List var4;
        List var5;
        try {
            var4 = this.field9966.select(new URI((var3 ? field9969[13] : field9969[12]) + field9969[11] + this.field8039));
            var5 = this.field9966.select(new URI((var3 ? field9969[12] : field9969[13]) + field9969[11] + this.field8039));
        } catch (URISyntaxException var18) {
            return this.method4062(47);
        }
        var4.addAll(var5);
        Object[] var7 = var4.toArray();
        class27 var8 = null;
        Object[] var9 = var7;
        for (int var10 = arg0; var10 < var9.length; var10++) {
            Object var11 = var9[var10];
            Proxy var12 = (Proxy) var11;
            try {
                Socket var13 = this.method5028(var12, -40);
                if (var13 != null) {
                    return var13;
                }
            } catch (class27 var16) {
                var8 = var16;
            } catch (IOException var17) {
            }
        }
        if (var8 != null) {
            throw var8;
        }
        return this.method4062(arg0 + 43);
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method5029(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!bca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5030(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5031(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 49;
                    break;
                case 1:
                    var10005 = 81;
                    break;
                case 2:
                    var10005 = 33;
                    break;
                case 3:
                    var10005 = 80;
                    break;
                default:
                    var10005 = 29;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
