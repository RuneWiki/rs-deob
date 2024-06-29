import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class239 {

    @OriginalMember(owner = "client!rt", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3628 = new String[] { method2052(method2051("\b[E\u0002k")), method2052(method2051("\b[E7,)[\u0019*-\u001d\u0007")), method2052(method2051("\b[E\u0000k")), method2052(method2051("\u0001\u0001Em>")), method2052(method2051("\b[E\u0007k")), method2052(method2051("\u0014Z\u0007/")), method2052(method2051("\b[E\u0001k")) };

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "Lel;")
    public static class573 field3621 = new class573(105, 0);

    @OriginalMember(owner = "client!rt", name = "g", descriptor = "Lto;")
    public static class8 field3624 = new class8(method2052(method2051("\t[\u000e//\u001b]\u000f\"4\u0014")), method2052(method2051(")[\u000e//\u001b]K\u0007\"\rA")), 1);

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "F")
    public static float field3623;

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!rt", name = "f", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!rt", name = "h", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Z)V", line = 3)
    public static void method2047(boolean arg0) {
        try {
            field3621 = null;
            if (arg0) {
                method2050(-28, -8, -30, true, 17, -21);
            }
            field3624 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3628[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rt", name = "toString", descriptor = "()Ljava/lang/String;", line = 14)
    public final String toString() {
        try {
            field3625++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3628[1] + ')');
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(BFFIFI[BIFILjf;IF)V", line = 25)
    public static final void method2048(byte arg0, float arg1, float arg2, int arg3, float arg4, int arg5, byte[] arg6, int arg7, float arg8, int arg9, class227 arg10, int arg11, float arg12) {
        try {
            field3620++;
            for (int var13 = 0; var13 < arg7; var13++) {
                class308.method2611(arg1, arg8, arg3, var13, arg2, arg10, arg5, arg12, arg7, 0, arg6, arg9, arg11, arg4);
                arg11 += arg3 * arg9;
            }
            if (arg0 >= -113) {
                field3626 = 78;
            }
        } catch (RuntimeException var15) {
            throw class759.method5498(var15, field3628[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 == null ? field3628[5] : field3628[3]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + (arg10 == null ? field3628[5] : field3628[3]) + ',' + arg11 + ',' + arg12 + ')');
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)[Lvaa;", line = 55)
    public static final class494[] method2049(byte arg0) {
        try {
            field3627++;
            return arg0 < 82 ? null : new class494[] { class494.field7099, class417.field6138, class235.field3540, class638.field9279, class149.field1834, class625.field9136, class67.field710, class724.field10464, class759.field11002, class544.field8132 };
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3628[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIIZII)V", line = 68)
    public static final void method2050(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        try {
            if (arg0 < 1) {
                arg0 = 1;
            }
            if (arg2 != -29580) {
                method2047(true);
            }
            field3622++;
            if (arg4 < 1) {
                arg4 = 1;
            }
            int var6 = arg4 - 334;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 100) {
                var6 = 100;
            }
            int var7 = (class341.field5305 - class534.field7822) * var6 / 100 + class534.field7822;
            if (var7 < class695.field10143) {
                var7 = class695.field10143;
            } else if (class336.field5243 < var7) {
                var7 = class336.field5243;
            }
            int var8 = var7 * 512 * arg4 / (arg0 * 334);
            if (class483.field6979 > var8) {
                short var12 = class483.field6979;
                var7 = var12 * 334 * arg0 / (arg4 * 512);
                if (class336.field5243 < var7) {
                    var7 = class336.field5243;
                    int var13 = arg4 * var7 * 512 / (var12 * 334);
                    int var14 = (arg0 - var13) / 2;
                    if (arg3) {
                        class610.field8913.method553();
                        class610.field8913.method593(-16777216, arg5, (byte) -82, arg4, var14, arg1);
                        class610.field8913.method593(-16777216, arg0 + arg5 - var14, (byte) -82, arg4, var14, arg1);
                    }
                    arg5 += var14;
                    arg0 -= var14 * 2;
                }
            } else if (class604.field8858 < var8) {
                short var9 = class604.field8858;
                var7 = arg0 * 334 * var9 / (arg4 * 512);
                if (var7 < class695.field10143) {
                    var7 = class695.field10143;
                    int var10 = arg0 * 334 * var9 / (var7 * 512);
                    int var11 = (arg4 - var10) / 2;
                    if (arg3) {
                        class610.field8913.method553();
                        class610.field8913.method593(-16777216, arg5, (byte) -82, var11, arg0, arg1);
                        class610.field8913.method593(-16777216, arg5, (byte) -82, var11, arg0, arg1 + arg4 - var11);
                    }
                    arg1 += var11;
                    arg4 -= var11 * 2;
                }
            }
            class655.field9463 = arg1;
            class344.field5337 = (short) arg0;
            class515.field7441 = (short) arg4;
            class517.field7482 = arg4 * var7 / 334;
            class630.field9217 = arg5;
        } catch (RuntimeException var16) {
            throw class759.method5498(var16, field3628[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!rt", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2051(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x43);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rt", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2052(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 122;
                    break;
                case 1:
                    var10005 = 47;
                    break;
                case 2:
                    var10005 = 107;
                    break;
                case 3:
                    var10005 = 67;
                    break;
                default:
                    var10005 = 67;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
