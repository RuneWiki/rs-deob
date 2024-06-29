import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class205 extends class627 {

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "Lqh;")
    private class74 field2599;

    @OriginalMember(owner = "client!lg", name = "G", descriptor = "Lpk;")
    private class621 field2620;

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "Leq;")
    private class357 field2602;

    @OriginalMember(owner = "client!lg", name = "E", descriptor = "I")
    private int field2618;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
    private int field2600;

    @OriginalMember(owner = "client!lg", name = "y", descriptor = "I")
    private int field2612;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "I")
    private int field2601;

    @OriginalMember(owner = "client!lg", name = "F", descriptor = "[[F")
    private float[][] field2619;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "[[F")
    private float[][] field2598;

    @OriginalMember(owner = "client!lg", name = "D", descriptor = "[[F")
    private float[][] field2617;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
    private int field2597;

    @OriginalMember(owner = "client!lg", name = "A", descriptor = "Lur;")
    private class355 field2614;

    @OriginalMember(owner = "client!lg", name = "B", descriptor = "Lqe;")
    private class88 field2615;

    @OriginalMember(owner = "client!lg", name = "t", descriptor = "Lqe;")
    private class88 field2607;

    @OriginalMember(owner = "client!lg", name = "H", descriptor = "Ljb;")
    private class719 field2621;

    @OriginalMember(owner = "client!lg", name = "C", descriptor = "Ltn;")
    private class179 field2616;

    @OriginalMember(owner = "client!lg", name = "v", descriptor = "Lwb;")
    private class552 field2609;

    @OriginalMember(owner = "client!lg", name = "u", descriptor = "Lsga;")
    private class583 field2608;

    @OriginalMember(owner = "client!lg", name = "x", descriptor = "I")
    public static int field2611 = 13156520;

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!lg", name = "q", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!lg", name = "s", descriptor = "I")
    private int field2606;

    @OriginalMember(owner = "client!lg", name = "z", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!lg", name = "I", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!lg", name = "w", descriptor = "Lkfa;")
    public static class407 field2610;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II[[ZBI)V", line = 6)
    public final void method1265(int arg0, int arg1, boolean[][] arg2, byte arg3, int arg4) {
        field2603++;
        if (this.field2621 == null || (arg0 + arg4) < this.field2618 || this.field2600 < arg4 - arg0 || (arg0 + arg1) < this.field2612 || this.field2601 < arg1 - arg0) {
            return;
        }
        if (arg3 < 36) {
            this.field2602 = null;
        }
        for (int var6 = this.field2612; var6 <= this.field2601; var6++) {
            for (int var7 = this.field2618; var7 <= this.field2600; var7++) {
                int var8 = var7 - arg4;
                int var9 = var6 - arg1;
                if (var8 > -arg0 && arg0 > var8 && var9 > (-arg0) && arg0 > var9 && arg2[var8 + arg0][arg0 + var9]) {
                    this.field2602.method2118((int) (this.field2620.method3405(false) * 255.0F) << 24, -15182);
                    this.field2602.method2181(null, this.field2607, this.field2615, null, 15063);
                    this.field2602.method2183(this.field2597, 0, -30308, 4, this.field2621);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(SI)V", line = 66)
    private final void method1266(short arg0, int arg1) {
        if (this.field2602.field5025) {
            this.field2616.method1157(arg0, (byte) 119);
        } else {
            this.field2616.method1098(arg0, (byte) -88);
        }
        int var3 = 126 % ((18 - arg1) / 36);
        field2605++;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIII)V", line = 90)
    private final void method1267(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2622++;
        long var8 = (long) arg0;
        int var10 = (arg5 << this.field2599.field5570) + arg2;
        int var11 = (arg4 << this.field2599.field5570) + arg3;
        int var12 = this.field2599.method2382((byte) 19, var11, var10);
        if ((arg2 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) var11 << 16 & 0xFFFFL << 16 | (long) var10 & 0xFFFFL;
            class627 var13 = this.field2608.method3248(var8, 0);
            if (var13 != null) {
                this.method1266(((class397) var13).field5516, arg0 ^ 0x73);
                return;
            }
        }
        short var14 = (short) (this.field2606++);
        if (var8 != -1L) {
            this.field2608.method3249(var8, new class397(var14), (byte) -107);
        }
        float var15;
        float var16;
        float var17;
        if (arg2 == 0 && arg3 == 0) {
            var15 = this.field2619[arg6][arg1];
            var16 = this.field2598[arg6][arg1];
            var17 = this.field2617[arg6][arg1];
        } else if (this.field2599.field5561 == arg2 && arg3 == 0) {
            var16 = this.field2598[arg6 + 1][arg1];
            var17 = this.field2617[arg6 + 1][arg1];
            var15 = this.field2619[arg6 + 1][arg1];
        } else if (this.field2599.field5561 == arg2 && this.field2599.field5561 == arg3) {
            var15 = this.field2619[arg6 + 1][arg1 + 1];
            var17 = this.field2617[arg6 + 1][arg1 + 1];
            var16 = this.field2598[arg6 + 1][arg1 + 1];
        } else if (arg2 == 0 && this.field2599.field5561 == arg3) {
            var16 = this.field2598[arg6][arg1 + 1];
            var15 = this.field2619[arg6][arg1 + 1];
            var17 = this.field2617[arg6][arg1 + 1];
        } else {
            float var18 = (float) arg2 / (float) this.field2599.field5561;
            float var19 = (float) arg3 / (float) this.field2599.field5561;
            float var20 = this.field2619[arg6][arg1];
            float var21 = this.field2617[arg6][arg1];
            float var22 = this.field2598[arg6][arg1];
            float var23 = this.field2619[arg6 + 1][arg1];
            float var24 = this.field2617[arg6 + 1][arg1];
            float var25 = (this.field2619[arg6][arg1 + 1] - var20) * var18 + var20;
            float var26 = (this.field2598[arg6][arg1 + 1] - var22) * var18 + var22;
            float var27 = (this.field2617[arg6][arg1 + 1] - var21) * var18 + var21;
            float var28 = (this.field2619[arg6 + 1][arg1 + 1] - var23) * var18 + var23;
            float var29 = this.field2598[arg6 + 1][arg1];
            float var30 = (this.field2617[arg6 + 1][arg1 + 1] - var24) * var18 + var24;
            var17 = (var30 - var27) * var19 + var27;
            float var31 = (this.field2598[arg6 + 1][arg1 + 1] - var29) * var18 + var29;
            var15 = (var28 - var25) * var19 + var25;
            var16 = (var31 - var26) * var19 + var26;
        }
        float var32 = (float) (this.field2620.method3402(true) - var10);
        float var33 = (float) (this.field2620.method3403((byte) 42) - var12);
        float var34 = (float) (this.field2620.method3404(-1) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var32 * var36;
        float var38 = var34 * var36;
        float var39 = var33 * var36;
        float var40 = var35 / (float) this.field2620.method3399((byte) -108);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var16 * var38 + var15 * var37 + var17 * var39;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field2620.method3401(4);
        int var45 = (int) ((float) ((var44 & 0xFFCEFE) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (this.field2602.field5025) {
            this.field2609.method3144((float) var10, false);
            this.field2609.method3144((float) var12, false);
            this.field2609.method3144((float) var11, false);
        } else {
            this.field2609.method3145((float) var10, arg0);
            this.field2609.method3145((float) var12, arg0);
            this.field2609.method3145((float) var11, arg0);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        this.field2609.method1141(var45, arg0 ^ 0xFFFFFF98);
        this.field2609.method1141(var46, 117);
        this.field2609.method1141(var47, 33);
        this.field2609.method1141(255, 118);
        this.method1266(var14, -77);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V", line = 256)
    public static void method1268(int arg0) {
        if (arg0 != 255) {
            field2611 = -16;
        }
        field2610 = null;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)Lfj;", line = 266)
    public static final class82 method1269(int arg0) {
        field2613++;
        if (arg0 != 1) {
            field2611 = 38;
        }
        return class83.method589(1, true);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIZ)V", line = 279)
    public static final void method1270(int arg0, int arg1, boolean arg2) {
        if (arg1 != 1) {
            field2611 = -46;
        }
        field2604++;
        if (arg2) {
            class650 var3 = class314.method1837(class607.field8422, true, class625.field8727);
            var3.field8928.method1157(arg0, (byte) 115);
            class108.method745(var3, arg1 - 120);
        } else {
            class445.method2621(class512.field7215, arg0, -1);
        }
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Leq;Lqh;Lpk;[I)V", line = 313)
    public class205(class357 arg0, class74 arg1, class621 arg2, int[] arg3) {
        this.field2599 = arg1;
        this.field2620 = arg2;
        this.field2602 = arg0;
        int var5 = this.field2620.method3399((byte) -108) - (arg1.field5561 >> 1);
        this.field2618 = this.field2620.method3402(true) - var5 >> arg1.field5570;
        this.field2600 = var5 + this.field2620.method3402(true) >> arg1.field5570;
        this.field2612 = this.field2620.method3404(-1) - var5 >> arg1.field5570;
        this.field2601 = var5 + this.field2620.method3404(-1) >> arg1.field5570;
        int var6 = this.field2600 + 1 - this.field2618;
        int var7 = this.field2601 + 1 - this.field2612;
        this.field2619 = new float[var6 + 1][var7 + 1];
        this.field2598 = new float[var6 + 1][var7 + 1];
        this.field2617 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var25 = this.field2612 + var8;
            if (var25 > 0 && var25 < this.field2599.field5562 - 1) {
                for (int var26 = 0; var26 <= var6; var26++) {
                    int var27 = var26 + this.field2618;
                    if (var27 > 0 && (this.field2599.field5569 - 1) > var27) {
                        int var28 = arg1.method2381(-89, var27 + 1, var25) - arg1.method2381(-109, var27 - 1, var25);
                        int var29 = arg1.method2381(-109, var27, var25 + 1) - arg1.method2381(-125, var27, var25 - 1);
                        float var30 = (float) (1.0D / Math.sqrt((double) (var28 * var28 - (-(var29 * var29) - 65536))));
                        this.field2619[var26][var8] = (float) var28 * var30;
                        this.field2617[var26][var8] = var30 * -256.0F;
                        this.field2598[var26][var8] = (float) var29 * var30;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field2612; var10 <= this.field2601; var10++) {
            if (var10 >= 0 && arg1.field5562 > var10) {
                for (int var21 = this.field2618; var21 <= this.field2600; var21++) {
                    if (var21 >= 0 && var21 < arg1.field5569) {
                        int var22 = arg3[var9];
                        int[] var23 = arg1.field981[var21][var10];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                int var24 = 0;
                                while (var23.length > var24) {
                                    if (var23[var24++] != -1 && var23[var24++] != -1 && var23[var24++] != -1) {
                                        this.field2597 += 3;
                                    }
                                }
                            } else {
                                this.field2597 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field2600 - this.field2618;
            }
        }
        if (this.field2597 <= 0) {
            this.field2614 = null;
            this.field2615 = null;
            this.field2607 = null;
            this.field2621 = null;
        } else {
            this.field2616 = new class179(this.field2597 * 2);
            this.field2609 = new class552(this.field2597 * 16);
            this.field2608 = new class583(class353.method2103(69, this.field2597));
            int var11 = 0;
            int var12 = 0;
            for (int var13 = this.field2612; var13 <= this.field2601; var13++) {
                if (var13 >= 0 && var13 < arg1.field5562) {
                    int var14 = 0;
                    for (int var15 = this.field2618; var15 <= this.field2600; var15++) {
                        if (var15 >= 0 && arg1.field5569 > var15) {
                            int var16 = arg3[var11];
                            int[] var17 = arg1.field981[var15][var13];
                            if (var17 != null && var16 != 0) {
                                if (var16 == 1) {
                                    int[] var18 = arg1.field1000[var15][var13];
                                    int[] var19 = arg1.field979[var15][var13];
                                    int var20 = 0;
                                    label110: while (true) {
                                        while (true) {
                                            if (var20 >= var17.length) {
                                                break label110;
                                            }
                                            if (var17[var20] == -1 || var17[var20 + 1] == -1 || var17[var20 + 2] == -1) {
                                                var20 += 3;
                                            } else {
                                                this.method1267(-1, var12, var18[var20], var19[var20], var13, var15, var14);
                                                var20++;
                                                this.method1267(-1, var12, var18[var20], var19[var20], var13, var15, var14);
                                                var20++;
                                                this.method1267(-1, var12, var18[var20], var19[var20], var13, var15, var14);
                                                var20++;
                                            }
                                        }
                                    }
                                } else if (var16 == 3) {
                                    this.method1267(-1, var12, 0, 0, var13, var15, var14);
                                    this.method1267(-1, var12, arg1.field5561, 0, var13, var15, var14);
                                    this.method1267(-1, var12, 0, arg1.field5561, var13, var15, var14);
                                } else if (var16 == 2) {
                                    this.method1267(-1, var12, arg1.field5561, 0, var13, var15, var14);
                                    this.method1267(-1, var12, arg1.field5561, arg1.field5561, var13, var15, var14);
                                    this.method1267(-1, var12, 0, 0, var13, var15, var14);
                                } else if (var16 == 5) {
                                    this.method1267(-1, var12, arg1.field5561, arg1.field5561, var13, var15, var14);
                                    this.method1267(-1, var12, 0, arg1.field5561, var13, var15, var14);
                                    this.method1267(-1, var12, arg1.field5561, 0, var13, var15, var14);
                                } else if (var16 == 4) {
                                    this.method1267(-1, var12, 0, arg1.field5561, var13, var15, var14);
                                    this.method1267(-1, var12, 0, 0, var13, var15, var14);
                                    this.method1267(-1, var12, arg1.field5561, arg1.field5561, var13, var15, var14);
                                }
                            }
                        }
                        var11++;
                        var14++;
                    }
                } else {
                    var11 += this.field2600 - this.field2618;
                }
                var12++;
            }
            this.field2621 = this.field2602.method2172(this.field2616.field2325, 5123, -1, false, this.field2616.field2354);
            this.field2614 = this.field2602.method2180(16, this.field2609.field2354, this.field2609.field2325, true, false);
            this.field2607 = new class88(this.field2614, 5126, 3, 0);
            this.field2615 = new class88(this.field2614, 5121, 4, 12);
        }
        this.field2609 = null;
        this.field2619 = this.field2617 = this.field2598 = null;
        this.field2616 = null;
        this.field2608 = null;
    }
}
