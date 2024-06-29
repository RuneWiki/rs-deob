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

@OriginalClass("client!ak")
public class class368 extends class308 {

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "Ljava/net/ProxySelector;")
    private ProxySelector field5627 = ProxySelector.getDefault();

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5630 = new String[] { method2981(method2980("\u0005FKBB\u0004GHb_\u0013VVBY\u001fE^sX\u0002[T@D\fRO[B\u0018")), method2981(method2980("\u001eGOB^L\u001c\u0014")), method2981(method2980("\u001cRMS\u0003\u001aRUU\u0003%GI[C\u0011")), method2981(method2980("\u0011VOzH\u0017W^@{\u0017_NW")), method2981(method2980("\u001eGOB^")), method2981(method2980("\u0011VOb_\u0019KBsX\u0002[")), method2981(method2980("L\u0013")), method2981(method2980("\u0005FU\u001cC\u0013G\u0015EZ\u0001\u001dK@B\u0002\\X]AX[OF]XrNFE\u0013]O[N\u0017GR]C?]]]")), method2981(method2980("\u001cRMS\u0003\u0018VO\u001cx$\u007f")), method2981(method2980("\u0011VOzH\u0017W^@c\u0017^^")), method2981(method2980("\u0006ATJT[RNFE\u0013]O[N\u0017G^\b\r")), method2981(method2980("|9")), method2981(method2980(">gob\u0002G\u001d\n\u0012\u0019F\u0004")), method2981(method2980("5|u|h5g\u001b")), method2981(method2980(">gob\u0002G\u001d\u000b\u0012\u0019F\u0004")), method2981(method2980(">gob\u0002G\u001d\n\u0012\u001fF\u0003")), method2981(method2980("V{of}Y\u0002\u0015\u0002'|")), method2981(method2980("V{of}Y\u0002\u0015\u0002'")), method2981(method2980(">gob\u0002G\u001d\u000b\u0012\u001fF\u0003")), method2981(method2980("?`t\u001f\u0015N\u0006\u0002\u001f\u001c")), method2981(method2980("\u001eGOB")), method2981(method2980("L\u001c\u0014")), method2981(method2980("\u0002ANW")), method2981(method2980("\u001cRMS\u0003\u0018VO\u001cX\u0005VhK^\u0002VVb_\u0019KRW^")) };

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field5628;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field5629;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZLjava/net/Proxy;)Ljava/net/Socket;", line = 12)
    private final Socket method2978(boolean arg0, Proxy arg1) throws IOException {
        if (arg1.type() == Type.DIRECT) {
            return this.method2613(-21675);
        }
        SocketAddress var3 = arg1.address();
        if (!(var3 instanceof InetSocketAddress)) {
            return null;
        }
        InetSocketAddress var4 = (InetSocketAddress) var3;
        if (arg1.type() == Type.HTTP) {
            String var6 = null;
            try {
                Class var7 = Class.forName(field5630[7]);
                Method var8 = var7.getDeclaredMethod(field5630[5], field5628 == null ? (field5628 = method2979(field5630[2])) : field5628, Integer.TYPE);
                var8.setAccessible(true);
                Object var9 = var8.invoke(null, var4.getHostName(), Integer.valueOf(var4.getPort()));
                if (var9 != null) {
                    Method var10 = var7.getDeclaredMethod(field5630[0]);
                    var10.setAccessible(true);
                    if ((Boolean) var10.invoke(var9)) {
                        Method var11 = var7.getDeclaredMethod(field5630[9]);
                        var11.setAccessible(true);
                        Method var12 = var7.getDeclaredMethod(field5630[3], field5629 == null ? (field5629 = method2979(field5630[8])) : field5629, field5628 == null ? (field5628 = method2979(field5630[2])) : field5628);
                        var12.setAccessible(true);
                        String var13 = (String) var11.invoke(var9);
                        String var14 = (String) var12.invoke(var9, new URL(field5630[1] + this.field4837 + "/"), field5630[4]);
                        var6 = var13 + field5630[6] + var14;
                    }
                }
            } catch (Exception var16) {
            }
            return this.httpProxyConnect(var4.getHostName(), var4.getPort(), var6);
        } else if (arg1.type() == Type.SOCKS) {
            Socket var5 = new Socket(arg1);
            var5.connect(new InetSocketAddress(this.field4837, this.field4841));
            return var5;
        } else {
            if (arg0) {
                this.field5627 = null;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 39)
    public static Class method2979(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!ak", name = "httpProxyConnect", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;", line = 89)
    private final Socket httpProxyConnect(String arg0, int arg1, String arg2) throws IOException {
        Socket var4 = new Socket(arg0, arg1);
        var4.setSoTimeout(10000);
        OutputStream var5 = var4.getOutputStream();
        if (arg2 == null) {
            var5.write((field5630[13] + this.field4837 + ":" + this.field4841 + field5630[16]).getBytes(Charset.forName(field5630[19])));
        } else {
            var5.write((field5630[13] + this.field4837 + ":" + this.field4841 + field5630[17] + arg2 + field5630[11]).getBytes(Charset.forName(field5630[19])));
        }
        var5.flush();
        BufferedReader var6 = new BufferedReader(new InputStreamReader(var4.getInputStream()));
        String var7 = var6.readLine();
        if (var7 != null) {
            if (var7.startsWith(field5630[18]) || var7.startsWith(field5630[15])) {
                return var4;
            }
            if (var7.startsWith(field5630[14]) || var7.startsWith(field5630[12])) {
                int var8 = 0;
                String var9 = var6.readLine();
                String var10 = field5630[10];
                while (var9 != null && var8 < 50) {
                    if (var9.toLowerCase().startsWith(var10)) {
                        String var11 = var9.substring(var10.length()).trim();
                        int var12 = var11.indexOf(32);
                        if (var12 != -1) {
                            var11 = var11.substring(0, var12);
                        }
                        throw new class264(var11);
                    }
                    var9 = var6.readLine();
                    var8++;
                }
                throw new class264("");
            }
        }
        var5.close();
        var6.close();
        var4.close();
        return null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)Ljava/net/Socket;", line = 164)
    public final Socket method2610(byte arg0) throws IOException {
        boolean var2 = Boolean.parseBoolean(System.getProperty(field5630[23]));
        if (!var2) {
            System.setProperty(field5630[23], field5630[22]);
        }
        int var3 = 24 / ((-arg0 - 40) / 55);
        boolean var4 = this.field4841 == 443;
        List var5;
        List var6;
        try {
            var5 = this.field5627.select(new URI((var4 ? field5630[4] : field5630[20]) + field5630[21] + this.field4837));
            var6 = this.field5627.select(new URI((var4 ? field5630[20] : field5630[4]) + field5630[21] + this.field4837));
        } catch (URISyntaxException var19) {
            return this.method2613(-21675);
        }
        var5.addAll(var6);
        Object[] var8 = var5.toArray();
        class264 var9 = null;
        Object[] var10 = var8;
        for (int var11 = 0; var11 < var10.length; var11++) {
            Object var12 = var10[var11];
            Proxy var13 = (Proxy) var12;
            try {
                Socket var14 = this.method2978(false, var13);
                if (var14 != null) {
                    return var14;
                }
            } catch (class264 var17) {
                var9 = var17;
            } catch (IOException var18) {
            }
        }
        if (var9 != null) {
            throw var9;
        }
        return this.method2613(-21675);
    }

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2980(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2981(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 118;
                    break;
                case 1:
                    var10005 = 51;
                    break;
                case 2:
                    var10005 = 59;
                    break;
                case 3:
                    var10005 = 50;
                    break;
                default:
                    var10005 = 45;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
