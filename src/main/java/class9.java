import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public class class9 {

    @OriginalMember(owner = "client!hba", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field108 = new String[] { method75(method74("[\u0003<\u001dx\u001b")), method75(method74("]\u00141_")), method75(method74("[\u0003<\u001d}\u001b")), method75(method74("HOs\u001dD")), method75(method74("[\u0003<\u001d{\u001b")), method75(method74("[\u0003<\u001dz\u001b")) };

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "Z")
    public static boolean field103 = false;

    @OriginalMember(owner = "client!hba", name = "f", descriptor = "I")
    public static int field104 = 0;

    @OriginalMember(owner = "client!hba", name = "e", descriptor = "Lua;")
    public static class696 field106 = new class696(1);

    @OriginalMember(owner = "client!hba", name = "c", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!hba", name = "d", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!hba", name = "g", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "Laca;")
    public static class760 field102;

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(B)V")
    public static final void method70(byte arg0) {
        try {
            class369.field5987 = false;
            field107++;
            class30.method318(-88);
            if (arg0 != 49) {
                method72(16, -6, 101, 78, null, -69, null, -1.0595933F, 123, -0.86008495F, -26, false);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field108[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(IBIIII)V")
    public static final void method71(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            field101++;
            int var6 = 0;
            int var7 = arg2;
            if (arg1 >= -48) {
                method72(10, 108, -63, 65, null, 8, null, 1.1669012F, 3, 1.2619448F, 2, false);
            }
            int var8 = arg4 * arg4;
            int var9 = arg2 * arg2;
            int var10 = var9 << 1;
            int var11 = var8 << 1;
            int var12 = arg2 << 1;
            int var13 = (1 - var12) * var8 + var10;
            int var14 = var9 - (var12 - 1) * var11;
            int var15 = var8 << 2;
            int var16 = var9 << 2;
            int var17 = ((var6 << 1) + 3) * var10;
            int var18 = ((arg2 << 1) - 3) * var11;
            int var19 = (var6 + 1) * var16;
            class545.method4051(arg0 - arg4, arg3, arg0 + arg4, class193.field3047[arg5], -124);
            int var20 = (arg2 - 1) * var15;
            while (var7 > 0) {
                if (var13 < 0) {
                    while (var13 < 0) {
                        var14 += var19;
                        var13 += var17;
                        var6++;
                        var19 += var16;
                        var17 += var16;
                    }
                }
                if (var14 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var6++;
                    var17 += var16;
                    var19 += var16;
                }
                var13 += -var20;
                var14 += -var18;
                var7--;
                var18 -= var15;
                var20 -= var15;
                int var21 = arg5 - var7;
                int var22 = arg5 + var7;
                int var23 = arg0 + var6;
                int var24 = arg0 - var6;
                class545.method4051(var24, arg3, var23, class193.field3047[var21], -106);
                class545.method4051(var24, arg3, var23, class193.field3047[var22], -128);
            }
        } catch (RuntimeException var26) {
            throw class590.method4333(var26, field108[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(IIII[FI[FFIFIZ)V")
    public static final void method72(int arg0, int arg1, int arg2, int arg3, float[] arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9, int arg10, boolean arg11) {
        try {
            field105++;
            int var23 = arg8 - arg5;
            int var21 = arg0 - arg2;
            int var22 = arg3 - arg10;
            float var12 = arg4[2] * (float) var22 + arg4[1] * (float) var23 + arg4[0] * (float) var21;
            float var13 = arg4[5] * (float) var22 + arg4[3] * (float) var21 + arg4[4] * (float) var23;
            float var14 = arg4[8] * (float) var22 + arg4[6] * (float) var21 + arg4[7] * (float) var23;
            float var15 = (float) Math.atan2((double) var12, (double) var14) / 6.2831855F + 0.5F;
            if (arg7 != 1.0F) {
                var15 = arg7 * var15;
            }
            float var16 = var13 + arg9 + 0.5F;
            if (!arg11) {
                method72(48, 51, -57, 30, null, 83, null, -1.7791417F, 58, 0.11340074F, -112, false);
            }
            if (arg1 == 1) {
                float var18 = var15;
                var15 = -var16;
                var16 = var18;
            } else if (arg1 == 2) {
                var15 = -var15;
                var16 = -var16;
            } else if (arg1 == 3) {
                float var17 = var15;
                var15 = var16;
                var16 = -var17;
            }
            arg6[0] = var15;
            arg6[1] = var16;
        } catch (RuntimeException var20) {
            throw class590.method4333(var20, field108[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field108[1] : field108[3]) + ',' + arg5 + ',' + (arg6 == null ? field108[1] : field108[3]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(I)V")
    public static void method73(int arg0) {
        try {
            field106 = null;
            if (arg0 != -3) {
                method73(-62);
            }
            field102 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field108[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method74(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x39);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method75(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 51;
                    break;
                case 1:
                    var10005 = 97;
                    break;
                case 2:
                    var10005 = 93;
                    break;
                case 3:
                    var10005 = 51;
                    break;
                default:
                    var10005 = 57;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
