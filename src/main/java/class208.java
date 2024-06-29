import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class208 extends class471 {

    @OriginalMember(owner = "client!tj", name = "E", descriptor = "[Ljava/lang/String;")
    private static final String[] field3195 = new String[] { method1838(method1837("+oH\u0013\n")), method1838(method1837("+oH\u0011\n")), method1838(method1837("+oH\u0010\n")) };

    @OriginalMember(owner = "client!tj", name = "A", descriptor = "Ldv;")
    public static class685 field3191 = new class685(0, 2, 2, 1);

    @OriginalMember(owner = "client!tj", name = "y", descriptor = "F")
    public static float field3187;

    @OriginalMember(owner = "client!tj", name = "C", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!tj", name = "B", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!tj", name = "w", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!tj", name = "z", descriptor = "Luia;")
    public static class381 field3189;

    @OriginalMember(owner = "client!tj", name = "x", descriptor = "Ljava/lang/String;")
    public static String field3188;

    @OriginalMember(owner = "client!tj", name = "D", descriptor = "[Lfs;")
    public static class581[] field3193;

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(IIIIIF)V", line = 3)
    public class208(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(B)V", line = 10)
    public static void method1834(byte arg0) {
        try {
            field3188 = null;
            field3191 = null;
            if (arg0 != 87) {
                method1834((byte) 9);
            }
            field3189 = null;
            field3193 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3195[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(FB)V", line = 23)
    public final void method1835(float arg0, byte arg1) {
        try {
            ++field3194;
            if (arg1 != -20) {
                field3192 = 111;
            }
            super.field6838 = arg0;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3195[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIII)V", line = 37)
    public final void method1836(int arg0, int arg1, int arg2, int arg3) {
        try {
            super.field6837 = arg3;
            super.field6839 = arg1;
            if (arg0 < -50) {
                super.field6846 = arg2;
                ++field3190;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3195[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!tj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1837(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 34);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1838(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 95;
                    break;
                case 1:
                    var10005 = 5;
                    break;
                case 2:
                    var10005 = 102;
                    break;
                case 3:
                    var10005 = 82;
                    break;
                default:
                    var10005 = 34;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
