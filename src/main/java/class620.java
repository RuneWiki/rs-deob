import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class620 extends class659 {

    @OriginalMember(owner = "client!rj", name = "C", descriptor = "Lrea;")
    public class220 field8396;

    @OriginalMember(owner = "client!rj", name = "w", descriptor = "Lqf;")
    public class708 field8391;

    @OriginalMember(owner = "client!rj", name = "E", descriptor = "Ljea;")
    public static class474 field8397 = new class474(7, -1);

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "I")
    public int field8386;

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "I")
    public static int field8387;

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "I")
    public static int field8388;

    @OriginalMember(owner = "client!rj", name = "u", descriptor = "I")
    public int field8389;

    @OriginalMember(owner = "client!rj", name = "v", descriptor = "I")
    public static int field8390;

    @OriginalMember(owner = "client!rj", name = "x", descriptor = "I")
    public int field8392;

    @OriginalMember(owner = "client!rj", name = "y", descriptor = "I")
    public int field8393;

    @OriginalMember(owner = "client!rj", name = "z", descriptor = "I")
    public static int field8394;

    @OriginalMember(owner = "client!rj", name = "F", descriptor = "I")
    public int field8398;

    @OriginalMember(owner = "client!rj", name = "A", descriptor = "J")
    public static long field8395;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V")
    public final void method3432(int arg0) {
        field8390++;
        if (arg0 != 12524) {
            this.method3432(20);
        }
        this.field8392 = this.field8396.field2846;
        this.field8398 = this.field8396.field2848;
        this.field8393 = this.field8396.field2853;
        if (this.field8396.field2845 != null) {
            this.field8396.field2845.method812(this.field8391.field9682, this.field8391.field9680, this.field8391.field9684, class419.field6018);
        }
        this.field8389 = class419.field6018[2];
        this.field8386 = class419.field6018[0];
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIIII)V")
    public static final void method3433(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field8388++;
        for (class704 var7 = (class704) class325.field4620.method2189((byte) 45); var7 != null; var7 = (class704) class325.field4620.method2192(0)) {
            if (var7.field9633 <= class572.field7788) {
                var7.method3310(arg4 ^ 0x7660);
            } else {
                class592.method3330(arg3, (var7.field9636 << 9) + 256, arg0, var7.field9637 * 2, arg6 >> 1, var7.field9634, 13962, arg2 >> 1, (var7.field9632 << 9) + 256);
                class88.field1251.method561(var7.field9638 | 0xFF000000, var7.field9641, 0, arg4 ^ 0x6F, arg1 + class548.field7567[1], arg5 - -class548.field7567[0]);
            }
        }
        if (arg4 != 1) {
            field8397 = null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Leq;IIIIIIIIIB)Z")
    public static final boolean method3434(class224 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte arg10) {
        field8394++;
        int var11 = arg3;
        int var12 = arg8;
        int var13 = -52 / ((-arg10 - 59) / 33);
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg3 - var14;
        class437.field6319[var14][var15] = 99;
        int var17 = arg8 - var15;
        class85.field1207[var14][var15] = 0;
        byte var18 = 0;
        int var19 = 0;
        class58.field761[var18] = arg3;
        byte var10001 = var18;
        int var27 = var18 + 1;
        class560.field7681[var10001] = arg8;
        int[][] var20 = arg0.field2908;
        while (var27 != var19) {
            var12 = class560.field7681[var19];
            var11 = class58.field761[var19];
            int var21 = var12 - var17;
            int var22 = var11 - var16;
            int var23 = var12 - arg0.field2912;
            int var24 = var11 - arg0.field2896;
            var19 = var19 + 1 & 0xFFF;
            if (arg2 == -4) {
                if (arg4 == var11 && arg5 == var12) {
                    class399.field5715 = var12;
                    class6.field44 = var11;
                    return true;
                }
            } else if (arg2 == -3) {
                if (class452.method2688(arg4, var11, 1, -65535, arg5, arg6, 1, arg9, var12)) {
                    class6.field44 = var11;
                    class399.field5715 = var12;
                    return true;
                }
            } else if (arg2 == -2) {
                if (arg0.method1435(32, arg6, arg9, 1, arg1, 1, arg5, arg4, var12, var11)) {
                    class6.field44 = var11;
                    class399.field5715 = var12;
                    return true;
                }
            } else if (arg2 == -1) {
                if (arg0.method1434(arg6, 1, arg4, arg9, arg1, arg5, var12, 256, var11)) {
                    class399.field5715 = var12;
                    class6.field44 = var11;
                    return true;
                }
            } else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
                if (arg0.method1430(arg2, arg4, 1, arg5, true, arg7, var11, var12)) {
                    class399.field5715 = var12;
                    class6.field44 = var11;
                    return true;
                }
            } else if (arg0.method1423(var12, var11, (byte) 59, 1, arg4, arg5, arg2, arg7)) {
                class399.field5715 = var12;
                class6.field44 = var11;
                return true;
            }
            int var26 = class85.field1207[var22][var21] + 1;
            if (var22 > 0 && class437.field6319[var22 - 1][var21] == 0 && (var20[var24 - 1][var23] & 0x42240000) == 0) {
                class58.field761[var27] = var11 - 1;
                class560.field7681[var27] = var12;
                var27 = var27 + 1 & 0xFFF;
                class437.field6319[var22 - 1][var21] = 2;
                class85.field1207[var22 - 1][var21] = var26;
            }
            if (var22 < 127 && class437.field6319[var22 + 1][var21] == 0 && (var20[var24 + 1][var23] & 0x60240000) == 0) {
                class58.field761[var27] = var11 + 1;
                class560.field7681[var27] = var12;
                var27 = var27 + 1 & 0xFFF;
                class437.field6319[var22 + 1][var21] = 8;
                class85.field1207[var22 + 1][var21] = var26;
            }
            if (var21 > 0 && class437.field6319[var22][var21 - 1] == 0 && (var20[var24][var23 - 1] & 0x40A40000) == 0) {
                class58.field761[var27] = var11;
                class560.field7681[var27] = var12 - 1;
                class437.field6319[var22][var21 - 1] = 1;
                var27 = var27 + 1 & 0xFFF;
                class85.field1207[var22][var21 - 1] = var26;
            }
            if (var21 < 127 && class437.field6319[var22][var21 + 1] == 0 && (var20[var24][var23 + 1] & 0x48240000) == 0) {
                class58.field761[var27] = var11;
                class560.field7681[var27] = var12 + 1;
                var27 = var27 + 1 & 0xFFF;
                class437.field6319[var22][var21 + 1] = 4;
                class85.field1207[var22][var21 + 1] = var26;
            }
            if (var22 > 0 && var21 > 0 && class437.field6319[var22 - 1][var21 - 1] == 0 && (var20[var24 - 1][var23 - 1] & 0x43A40000) == 0 && (var20[var24 - 1][var23] & 0x42240000) == 0 && (var20[var24][var23 - 1] & 0x40A40000) == 0) {
                class58.field761[var27] = var11 - 1;
                class560.field7681[var27] = var12 - 1;
                var27 = var27 + 1 & 0xFFF;
                class437.field6319[var22 - 1][var21 - 1] = 3;
                class85.field1207[var22 - 1][var21 - 1] = var26;
            }
            if (var22 < 127 && var21 > 0 && class437.field6319[var22 + 1][var21 - 1] == 0 && (var20[var24 + 1][var23 - 1] & 0x60E40000) == 0 && (var20[var24 + 1][var23] & 0x60240000) == 0 && (var20[var24][var23 - 1] & 0x40A40000) == 0) {
                class58.field761[var27] = var11 + 1;
                class560.field7681[var27] = var12 - 1;
                class437.field6319[var22 + 1][var21 - 1] = 9;
                var27 = var27 + 1 & 0xFFF;
                class85.field1207[var22 + 1][var21 - 1] = var26;
            }
            if (var22 > 0 && var21 < 127 && class437.field6319[var22 - 1][var21 + 1] == 0 && (var20[var24 - 1][var23 + 1] & 0x4E240000) == 0 && (var20[var24 - 1][var23] & 0x42240000) == 0 && (var20[var24][var23 + 1] & 0x48240000) == 0) {
                class58.field761[var27] = var11 - 1;
                class560.field7681[var27] = var12 + 1;
                class437.field6319[var22 - 1][var21 + 1] = 6;
                var27 = var27 + 1 & 0xFFF;
                class85.field1207[var22 - 1][var21 + 1] = var26;
            }
            if (var22 < 127 && var21 < 127 && class437.field6319[var22 + 1][var21 + 1] == 0 && (var20[var24 + 1][var23 + 1] & 0x78240000) == 0 && (var20[var24 + 1][var23] & 0x60240000) == 0 && (var20[var24][var23 + 1] & 0x48240000) == 0) {
                class58.field761[var27] = var11 + 1;
                class560.field7681[var27] = var12 + 1;
                class437.field6319[var22 + 1][var21 + 1] = 12;
                var27 = var27 + 1 & 0xFFF;
                class85.field1207[var22 + 1][var21 + 1] = var26;
            }
        }
        class399.field5715 = var12;
        class6.field44 = var11;
        return false;
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(I)V")
    public static void method3435(int arg0) {
        field8397 = null;
        if (arg0 != -5950) {
            field8397 = null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lrea;Lls;)V")
    public class620(class220 arg0, class150 arg1) {
        this.field8396 = arg0;
        this.field8391 = this.field8396.method1408(69);
        this.method3432(12524);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IFIBFFII)[F")
    public static final float[] method3436(int arg0, float arg1, int arg2, byte arg3, float arg4, float arg5, int arg6, int arg7) {
        field8387++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg6 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg6 * 0.024543693F));
        var8[4] = 1.0F;
        var8[0] = var10;
        var8[2] = var11;
        var8[1] = 0.0F;
        if (arg3 != 56) {
            return null;
        }
        var8[3] = 0.0F;
        var8[8] = var10;
        float var12 = 1.0F - var10;
        var8[6] = -var11;
        var8[7] = 0.0F;
        var8[5] = 0.0F;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = (float) arg0 / 32767.0F;
        float var16 = 0.0F;
        float var17 = 1.0F - var15;
        float var18 = -((float) Math.sqrt((double) (1.0F - var15 * var15)));
        float var19 = (float) Math.sqrt((double) (arg2 * arg2 + arg7 * arg7));
        if (var19 == 0.0F && var15 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg7) / var19;
                var16 = (float) arg2 / var19;
            }
            var13[2] = var14 * var16 * var17;
            var13[4] = var15;
            var13[5] = var14 * var18;
            var13[6] = var14 * var16 * var17;
            var13[0] = var14 * var14 * var17 + var15;
            var13[1] = var16 * var18;
            var13[7] = -var14 * var18;
            var13[8] = var16 * var16 * var17 + var15;
            var13[3] = -var16 * var18;
            var9[0] = var8[2] * var13[6] + var8[1] * var13[3] + var8[0] * var13[0];
            var9[1] = var8[2] * var13[7] + var8[0] * var13[1] + var8[1] * var13[4];
            var9[3] = var8[5] * var13[6] + var8[3] * var13[0] + var8[4] * var13[3];
            var9[2] = var8[2] * var13[8] + var8[1] * var13[5] + var8[0] * var13[2];
            var9[4] = var8[5] * var13[7] + var8[4] * var13[4] + var8[3] * var13[1];
            var9[5] = var8[5] * var13[8] + var8[4] * var13[5] + var8[3] * var13[2];
            var9[6] = var8[8] * var13[6] + var8[7] * var13[3] + var8[6] * var13[0];
            var9[7] = var8[8] * var13[7] + var8[6] * var13[1] + var8[7] * var13[4];
            var9[8] = var8[8] * var13[8] + var8[7] * var13[5] + var8[6] * var13[2];
        }
        var9[5] *= arg5;
        var9[8] *= arg1;
        var9[6] *= arg1;
        var9[1] *= arg4;
        var9[4] *= arg5;
        var9[2] *= arg4;
        var9[0] *= arg4;
        var9[7] *= arg1;
        var9[3] *= arg5;
        return var9;
    }
}
