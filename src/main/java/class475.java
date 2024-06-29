import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class475 {

    @OriginalMember(owner = "client!ci", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7244 = new String[] { method3640(method3639("&Q\u0010\nN")), method3640(method3639("&Q\u0010\fN")), method3640(method3639("\"]J\u0018\n$LX'\u0014(u|-\u0007+k[:\u0010 J")), method3640(method3639("/YH)H)YP/H\u0006T_;\u0015")), method3640(method3639("\r]_8\"0UNh\u0015 LK8F JL'\u0014\u007f")), method3640(method3639("+]I\u0018\n$LX'\u0014(uf\n\u0003$Vn:\t=A")), method3640(method3639("/YH)\u001ekU_&\u0007\"]S-\b1\u0016s\n\u0003$Vm-\u00143]L\u000b\t+V[+\u0012,WP")), method3640(method3639("&Q\u0010\u000bN")), method3640(method3639("/YH)H)YP/H\u0016LL!\b\"")), method3640(method3639("&WSf\u00150V\u0010%\u0007+YY-\u000b VJr\u0012<H[u.*Lm8\t1|W)\u0001+WM<\u000f&")), method3640(method3639("&WSf\u00150V\u0010%\u0007+YY-\u000b VJf.*Lm8\t1|W)\u0001+WM<\u000f&uf\n\u0003$V")), method3640(method3639("/YH)H)YP/H(YP)\u0001 U[&\u0012ku_&\u0007\"]S-\b1~_+\u0012*JG")), method3640(method3639("&Q\u0010\tN")) };

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field7237 = 0;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public static int field7239;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    public static int field7240;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public static int field7241;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "J")
    public static long field7236;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ci", name = "d", descriptor = "Ljava/lang/Class;")
    public static Class field7242;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ci", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field7243;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "[Lhk;")
    public static class107[] field7238;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IB)V")
    public static final void method3634(int arg0, byte arg1) {
        try {
            field7241++;
            if (arg1 == 16) {
                class551 var2 = class380.method3113(-114, (long) arg0, 17);
                var2.method4089(arg1 ^ 0x2F);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7244[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public static final synchronized void method3635(int arg0) {
        try {
            field7240++;
            if (class346.field5618 == null) {
                try {
                    Class var1 = Class.forName(field7244[11]);
                    Method var2 = var1.getDeclaredMethod(field7244[2], null);
                    if (arg0 != 0) {
                        method3634(68, (byte) -115);
                    }
                    Object var3 = var2.invoke(null, (Object[]) null);
                    Method var4 = var1.getMethod(field7244[5], Class.forName(field7244[6]), field7242 == null ? (field7242 = method3638(field7244[8])) : field7242, field7243 == null ? (field7243 = method3638(field7244[3])) : field7243);
                    class346.field5618 = var4.invoke(null, var3, field7244[9], Class.forName(field7244[10]));
                } catch (Exception var7) {
                    System.out.println(field7244[4]);
                    var7.printStackTrace();
                }
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field7244[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)V")
    public static void method3636(int arg0) {
        try {
            field7238 = null;
            if (arg0 != 0) {
                field7238 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7244[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZZ)Z")
    public static boolean method3637(boolean arg0, boolean arg1) {
        try {
            return arg0 | arg1;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7244[1] + arg0 + ',' + arg1 + ')');
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3638(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ci", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3639(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x66);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ci", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3640(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 69;
                    break;
                case 1:
                    var10005 = 56;
                    break;
                case 2:
                    var10005 = 62;
                    break;
                case 3:
                    var10005 = 72;
                    break;
                default:
                    var10005 = 102;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
