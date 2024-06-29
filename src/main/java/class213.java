import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class213 {

    @OriginalMember(owner = "client!oc", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3369 = new String[] { method1922(method1921("IQ-?s")), method1922(method1921("IQ-<s")), method1922(method1921("IQ->s")), method1922(method1921("IQ-9s")) };

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "Z")
    public static boolean field3361 = false;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "Lhl;")
    public static class556 field3362 = new class556(24, 1);

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "Lhl;")
    public static class556 field3366 = new class556(29, -1);

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "Z")
    public static boolean field3368 = false;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "Lda;")
    public static class64 field3367;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "[I")
    public static int[] field3359;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "[Laba;")
    public static class185[] field3363;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(FFFB)I", line = 8)
    public static final int method1917(float arg0, float arg1, float arg2, byte arg3) {
        try {
            if (arg3 != -92) {
                method1920(44, 20, 80);
            }
            field3364++;
            float var4 = (arg2 < 0.0F) ? -arg2 : arg2;
            float var5 = arg0 < 0.0F ? -arg0 : arg0;
            float var6 = (arg1 < 0.0F) ? -arg1 : arg1;
            if (var5 > var4 && var6 < var5) {
                return (arg0 > 0.0F) ? 0 : 1;
            } else if (var6 > var4 && var6 > var5) {
                return arg1 > 0.0F ? 2 : 3;
            } else if ((arg2 > 0.0F)) {
                return 4;
            } else {
                return 5;
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field3369[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V", line = 51)
    public static void method1918(byte arg0) {
        try {
            field3359 = null;
            field3366 = null;
            field3362 = null;
            field3363 = null;
            field3367 = null;
            int var1 = -74 / ((arg0 + 8) / 52);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3369[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIIII)Z", line = 64)
    public static final boolean method1919(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            field3360++;
            int var7 = 15 % ((arg1 - 30) / 55);
            int var8 = arg0 + arg4;
            int var9 = arg3 + arg6;
            int var10 = arg2 + arg5;
            if (!class728.method5281(var8, arg0, arg0, var10, var10, var9, var9, -119, arg5, var9)) {
                return false;
            } else if (class728.method5281(var8, arg0, var8, var10, arg5, var9, var9, 61, arg5, var9)) {
                if (class764.field11211 <= arg0) {
                    if (!class728.method5281(var8, var8, var8, var10, arg5, arg3, var9, 25, var10, var9)) {
                        return false;
                    }
                    if (!class728.method5281(var8, var8, var8, arg5, arg5, arg3, var9, -100, var10, arg3)) {
                        return false;
                    }
                } else if (!class728.method5281(arg0, arg0, arg0, var10, arg5, arg3, var9, -95, var10, var9)) {
                    return false;
                } else if (!class728.method5281(arg0, arg0, arg0, arg5, arg5, arg3, var9, -114, var10, arg3)) {
                    return false;
                }
                if (arg5 >= class97.field1421) {
                    if (!class728.method5281(var8, arg0, arg0, var10, var10, arg3, var9, 57, var10, var9)) {
                        return false;
                    }
                    if (!class728.method5281(var8, arg0, var8, var10, var10, arg3, var9, 1, var10, arg3)) {
                        return false;
                    }
                } else if (!class728.method5281(var8, arg0, arg0, arg5, arg5, arg3, var9, -89, arg5, var9)) {
                    return false;
                } else if (!class728.method5281(var8, arg0, var8, arg5, arg5, arg3, var9, -115, arg5, arg3)) {
                    return false;
                }
                return true;
            } else {
                return false;
            }
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field3369[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)Z", line = 137)
    public static final boolean method1920(int arg0, int arg1, int arg2) {
        try {
            if (arg2 == 5) {
                field3365++;
                return (arg1 & 0x800) != 0;
            } else {
                return false;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3369[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!oc", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1921(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oc", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1922(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 38;
                    break;
                case 1:
                    var10005 = 50;
                    break;
                case 2:
                    var10005 = 3;
                    break;
                case 3:
                    var10005 = 125;
                    break;
                default:
                    var10005 = 91;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
