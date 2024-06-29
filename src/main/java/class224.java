import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class224 extends class578 {

    @OriginalMember(owner = "client!tl", name = "x", descriptor = "Z")
    public boolean field3243 = true;

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "Z")
    public boolean field3259 = false;

    @OriginalMember(owner = "client!tl", name = "E", descriptor = "[Ljava/lang/String;")
    private static final String[] field3264 = new String[] { method1876(method1875("I\u0003)\"E")), method1876(method1875("FA)M\u0010")), method1876(method1875("I\u0003)'E")), method1876(method1875("S\u001ak\u000f")), method1876(method1875("I\u0003)!E")), method1876(method1875("I\u0003) E")) };

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "Lmv;")
    public static class125 field3244 = new class125(21, -1);

    @OriginalMember(owner = "client!tl", name = "z", descriptor = "I")
    public static int field3261 = 1;

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "Lsb;")
    public static class261 field3260 = new class261(59, 0);

    @OriginalMember(owner = "client!tl", name = "C", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "I")
    public int field3246;

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "I")
    public int field3247;

    @OriginalMember(owner = "client!tl", name = "y", descriptor = "I")
    public int field3248;

    @OriginalMember(owner = "client!tl", name = "v", descriptor = "I")
    public int field3249;

    @OriginalMember(owner = "client!tl", name = "u", descriptor = "I")
    public int field3250;

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!tl", name = "D", descriptor = "I")
    public int field3252;

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!tl", name = "t", descriptor = "I")
    public int field3255;

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "I")
    public int field3256;

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "I")
    public int field3258;

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "I")
    public int field3262;

    @OriginalMember(owner = "client!tl", name = "B", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "Lao;")
    public class626 field3245;

    @OriginalMember(owner = "client!tl", name = "w", descriptor = "[I")
    public static int[] field3254;

    @OriginalMember(owner = "client!tl", name = "A", descriptor = "[Ljava/lang/String;")
    public static String[] field3257;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)Z", line = 5)
    public static final boolean method1871(int arg0, int arg1, int arg2) {
        try {
            field3253++;
            if (arg1 > -27) {
                method1874(-27);
            }
            return class765.method5525((byte) -37, arg0, arg2) | (arg0 & 0x800) != 0 || class478.method3704(arg0, -1557, arg2);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3264[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(BJ)I", line = 17)
    public static final int method1872(byte arg0, long arg1) {
        try {
            field3242++;
            int var3 = 29 % ((-arg0 - 31) / 61);
            return (int) (arg1 / 86400000L) - 11745;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field3264[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZILlga;JIII)V", line = 32)
    public static final void method1873(boolean arg0, int arg1, class47 arg2, long arg3, int arg4, int arg5, int arg6) {
        try {
            if (arg6 < -4) {
                class168.method1415(arg4, arg5, arg2, arg3, -11707, arg0, arg1, 0);
                field3251++;
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field3264[2] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field3264[3] : field3264[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V", line = 44)
    public static void method1874(int arg0) {
        try {
            field3254 = null;
            field3244 = null;
            if (arg0 != 6939) {
                field3263 = 49;
            }
            field3257 = null;
            field3260 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3264[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tl", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1875(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tl", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1876(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 61;
                    break;
                case 1:
                    var10005 = 111;
                    break;
                case 2:
                    var10005 = 7;
                    break;
                case 3:
                    var10005 = 99;
                    break;
                default:
                    var10005 = 109;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
