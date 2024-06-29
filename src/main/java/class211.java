import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public class class211 extends class424 {

    @OriginalMember(owner = "client!iba", name = "F", descriptor = "Lpn;")
    private class296 field2733;

    @OriginalMember(owner = "client!iba", name = "z", descriptor = "Lwo;")
    private class295 field2727;

    @OriginalMember(owner = "client!iba", name = "K", descriptor = "Lji;")
    private class622 field2738;

    @OriginalMember(owner = "client!iba", name = "E", descriptor = "I")
    private int field2732;

    @OriginalMember(owner = "client!iba", name = "J", descriptor = "I")
    private int field2737;

    @OriginalMember(owner = "client!iba", name = "I", descriptor = "I")
    private int field2736;

    @OriginalMember(owner = "client!iba", name = "v", descriptor = "I")
    private int field2723;

    @OriginalMember(owner = "client!iba", name = "C", descriptor = "[[F")
    private float[][] field2730;

    @OriginalMember(owner = "client!iba", name = "q", descriptor = "[[F")
    private float[][] field2718;

    @OriginalMember(owner = "client!iba", name = "A", descriptor = "[[F")
    private float[][] field2728;

    @OriginalMember(owner = "client!iba", name = "s", descriptor = "Lfd;")
    private class418 field2720;

    @OriginalMember(owner = "client!iba", name = "x", descriptor = "Lph;")
    private class703 field2725;

    @OriginalMember(owner = "client!iba", name = "N", descriptor = "Lbc;")
    private class9 field2741;

    @OriginalMember(owner = "client!iba", name = "n", descriptor = "Lul;")
    private class439 field2715;

    @OriginalMember(owner = "client!iba", name = "t", descriptor = "Lsj;")
    private class373 field2721;

    @OriginalMember(owner = "client!iba", name = "r", descriptor = "Lvv;")
    private class414 field2719;

    @OriginalMember(owner = "client!iba", name = "H", descriptor = "Lvv;")
    private class414 field2735;

    @OriginalMember(owner = "client!iba", name = "G", descriptor = "I")
    private int field2734;

    @OriginalMember(owner = "client!iba", name = "u", descriptor = "I")
    public static int field2722 = 0;

    @OriginalMember(owner = "client!iba", name = "o", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!iba", name = "p", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!iba", name = "w", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!iba", name = "y", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!iba", name = "B", descriptor = "I")
    private int field2729;

    @OriginalMember(owner = "client!iba", name = "D", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!iba", name = "L", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!iba", name = "M", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!iba", name = "O", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(III)Z")
    public static final boolean method1354(int arg0, int arg1, int arg2) {
        field2724++;
        if (arg0 >= -16) {
            method1355(-103);
        }
        return (arg1 & 0x580) != 0;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(I)V")
    public static final void method1355(int arg0) {
        for (int var1 = 0; var1 < 100; var1++) {
            class53.field719[var1] = true;
        }
        if (arg0 != -21784) {
            method1358((byte) 58, -18, 67);
        }
        field2726++;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(IB)V")
    public static final void method1356(int arg0, byte arg1) {
        field2717++;
        class693.field9478 = -1;
        if (arg0 == 37) {
            class706.field9836 = 3.0F;
        } else if (arg0 == 50) {
            class706.field9836 = 4.0F;
        } else if (arg0 == 75) {
            class706.field9836 = 6.0F;
        } else if (arg0 == 100) {
            class706.field9836 = 8.0F;
        } else if (arg0 == 200) {
            class706.field9836 = 16.0F;
        }
        class693.field9478 = -1;
        if (arg1 <= 49) {
            field2722 = -118;
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(IIIBIII)V")
    private final void method1357(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field2739++;
        long var8 = -1L;
        int var10 = (arg0 << this.field2727.field1168) + arg6;
        int var11 = (arg1 << this.field2727.field1168) + arg2;
        int var12 = this.field2727.method669(var10, var11);
        if ((arg6 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var8 = 0xFFFFL << 16 & (long) var11 << 16 | (long) var10 & 0xFFFFL;
            class424 var13 = this.field2741.method39(var8, 31750);
            if (var13 != null) {
                this.method1359(((class419) var13).field5426, 1);
                return;
            }
        }
        short var14 = (short) (this.field2729++);
        if (var8 != -1L) {
            this.field2741.method38(new class419(var14), 103, var8);
        }
        float var15;
        float var16;
        float var17;
        if (arg6 == 0 && arg2 == 0) {
            var15 = this.field2718[arg4][arg5];
            var16 = this.field2730[arg4][arg5];
            var17 = this.field2728[arg4][arg5];
        } else if (this.field2727.field1163 == arg6 && arg2 == 0) {
            var17 = this.field2728[arg4 + 1][arg5];
            var16 = this.field2730[arg4 + 1][arg5];
            var15 = this.field2718[arg4 + 1][arg5];
        } else if (this.field2727.field1163 == arg6 && this.field2727.field1163 == arg2) {
            var17 = this.field2728[arg4 + 1][arg5 + 1];
            var16 = this.field2730[arg4 + 1][arg5 + 1];
            var15 = this.field2718[arg4 + 1][arg5 + 1];
        } else if (arg6 == 0 && this.field2727.field1163 == arg2) {
            var16 = this.field2730[arg4][arg5 + 1];
            var15 = this.field2718[arg4][arg5 + 1];
            var17 = this.field2728[arg4][arg5 + 1];
        } else {
            float var18 = (float) arg6 / (float) this.field2727.field1163;
            float var19 = (float) arg2 / (float) this.field2727.field1163;
            float var20 = this.field2730[arg4][arg5];
            float var21 = this.field2728[arg4][arg5];
            float var22 = this.field2718[arg4][arg5];
            float var23 = this.field2730[arg4 + 1][arg5];
            float var24 = this.field2728[arg4 + 1][arg5];
            float var25 = (this.field2730[arg4 + 1][arg5 + 1] - var23) * var18 + var23;
            float var26 = this.field2718[arg4 + 1][arg5];
            float var27 = (this.field2730[arg4][arg5 + 1] - var20) * var18 + var20;
            float var28 = (this.field2718[arg4][arg5 + 1] - var22) * var18 + var22;
            float var29 = (this.field2728[arg4][arg5 + 1] - var21) * var18 + var21;
            float var30 = (this.field2728[arg4 + 1][arg5 + 1] - var24) * var18 + var24;
            var16 = (var25 - var27) * var19 + var27;
            float var31 = (this.field2718[arg4 + 1][arg5 + 1] - var26) * var18 + var26;
            var17 = (var30 - var29) * var19 + var29;
            var15 = (var31 - var28) * var19 + var28;
        }
        float var32 = (float) (this.field2733.method1754(72) - var10);
        float var33 = (float) (this.field2733.method1753((byte) 127) - var12);
        float var34 = (float) (this.field2733.method1755(119) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var33 * var36;
        float var38 = var32 * var36;
        float var39 = var34 * var36;
        float var40 = var35 / (float) this.field2733.method1752(51);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var15 * var39 + var16 * var38 + var17 * var37;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        if (arg3 >= -115) {
            this.field2735 = null;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field2733.method1751(119);
        int var45 = (int) ((float) ((var44 & 0xFFC263) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field2738.field8631) {
            this.field2725.method3847((float) var10, -90);
            this.field2725.method3847((float) var12, -99);
            this.field2725.method3847((float) var11, -44);
        } else {
            this.field2725.method3846((float) var10, -12);
            this.field2725.method3846((float) var12, -92);
            this.field2725.method3846((float) var11, -31);
        }
        this.field2725.method2352(true, var45);
        this.field2725.method2352(true, var46);
        this.field2725.method2352(true, var47);
        this.field2725.method2352(true, 255);
        this.method1359(var14, 1);
    }

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "(BII)B")
    public static final byte method1358(byte arg0, int arg1, int arg2) {
        if (arg0 != 124) {
            field2742 = 57;
        }
        field2731++;
        if (arg1 == 9) {
            return (byte) ((arg2 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(SI)V")
    private final void method1359(short arg0, int arg1) {
        if (this.field2738.field8631) {
            this.field2720.method2386(arg0, 1103587288);
        } else {
            this.field2720.method2356(arg0, -18174);
        }
        if (arg1 == 1) {
            field2716++;
            this.field2734++;
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(III[[ZI)V")
    public final void method1360(int arg0, int arg1, int arg2, boolean[][] arg3, int arg4) {
        field2740++;
        if (this.field2715 == null || this.field2732 > (arg1 + arg4) || arg1 - arg4 > this.field2737 || (arg0 + arg4) < this.field2736) {
            return;
        }
        if (arg2 != 255) {
            this.field2736 = 54;
        }
        if (arg0 - arg4 > this.field2723) {
            return;
        }
        for (int var6 = this.field2736; var6 <= this.field2723; var6++) {
            for (int var7 = this.field2732; var7 <= this.field2737; var7++) {
                int var8 = var7 - arg1;
                int var9 = var6 - arg0;
                if (-arg4 < var8 && arg4 > var8 && var9 > (-arg4) && var9 < arg4 && arg3[arg4 + var8][arg4 + var9]) {
                    this.field2738.method3421((byte) -29, (int) (this.field2733.method1756((byte) 124) * 255.0F) << 24);
                    this.field2738.method3420(this.field2735, null, true, null, this.field2719);
                    this.field2738.method3464(this.field2734, 4, this.field2715, 95, 0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(Lji;Lwo;Lpn;[I)V")
    public class211(class622 arg0, class295 arg1, class296 arg2, int[] arg3) {
        this.field2733 = arg2;
        this.field2727 = arg1;
        this.field2738 = arg0;
        int var5 = this.field2733.method1752(78) - (arg1.field1163 >> 1);
        this.field2732 = this.field2733.method1754(84) - var5 >> arg1.field1168;
        this.field2737 = this.field2733.method1754(85) + var5 >> arg1.field1168;
        this.field2736 = this.field2733.method1755(118) - var5 >> arg1.field1168;
        this.field2723 = var5 + this.field2733.method1755(93) >> arg1.field1168;
        int var6 = this.field2737 + 1 - this.field2732;
        int var7 = this.field2723 - (this.field2736 - 1);
        this.field2730 = new float[var6 + 1][var7 + 1];
        this.field2718 = new float[var6 + 1][var7 + 1];
        this.field2728 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var26 = this.field2736 + var8;
            if (var26 > 0 && this.field2727.field1164 - 1 > var26) {
                for (int var27 = 0; var27 <= var6; var27++) {
                    int var28 = this.field2732 + var27;
                    if (var28 > 0 && var28 < this.field2727.field1166 - 1) {
                        int var29 = arg1.method668(var28 + 1, var26) - arg1.method668(var28 - 1, var26);
                        int var30 = arg1.method668(var28, var26 + 1) - arg1.method668(var28, var26 - 1);
                        float var31 = (float) (1.0D / Math.sqrt((double) (var29 * var29 + (var30 * var30) + 65536)));
                        this.field2730[var27][var8] = (float) var29 * var31;
                        this.field2728[var27][var8] = var31 * -256.0F;
                        this.field2718[var27][var8] = (float) var30 * var31;
                    }
                }
            }
        }
        byte var9 = 0;
        int var10 = 0;
        for (int var11 = this.field2736; var11 <= this.field2723; var11++) {
            if (var11 >= 0 && arg1.field1164 > var11) {
                for (int var22 = this.field2732; var22 <= this.field2737; var22++) {
                    if (var22 >= 0 && var22 < arg1.field1166) {
                        int var23 = arg3[var10];
                        int[] var24 = arg1.field3826[var22][var11];
                        if (var24 != null && var23 != 0) {
                            if (var23 == 1) {
                                int var25 = 0;
                                while (var25 < var24.length) {
                                    if (var24[var25++] != -1 && var24[var25++] != -1 && var24[var25++] != -1) {
                                        this.field2734 += 3;
                                    }
                                }
                            } else {
                                this.field2734 += 3;
                            }
                        }
                    }
                    var10++;
                }
            } else {
                var10 += this.field2737 - this.field2732;
            }
        }
        if (var9 > 0) {
            this.field2720 = new class418(var9 * 2);
            this.field2725 = new class703(var9 * 16);
            this.field2741 = new class9(class426.method2447(var9, 250));
            int var12 = 0;
            int var13 = 0;
            for (int var14 = this.field2736; var14 <= this.field2723; var14++) {
                if (var14 >= 0 && var14 < arg1.field1164) {
                    int var15 = 0;
                    for (int var16 = this.field2732; var16 <= this.field2737; var16++) {
                        if (var16 >= 0 && var16 < arg1.field1166) {
                            int var17 = arg3[var13];
                            int[] var18 = arg1.field3826[var16][var14];
                            if (var18 != null && var17 != 0) {
                                if (var17 == 1) {
                                    int[] var19 = arg1.field3847[var16][var14];
                                    int[] var20 = arg1.field3828[var16][var14];
                                    int var21 = 0;
                                    label110: while (true) {
                                        while (true) {
                                            if (var18.length <= var21) {
                                                break label110;
                                            }
                                            if (var18[var21] == -1 || var18[var21 + 1] == -1 || var18[var21 + 2] == -1) {
                                                var21 += 3;
                                            } else {
                                                this.method1357(var16, var14, var20[var21], (byte) -120, var15, var12, var19[var21]);
                                                var21++;
                                                this.method1357(var16, var14, var20[var21], (byte) -126, var15, var12, var19[var21]);
                                                var21++;
                                                this.method1357(var16, var14, var20[var21], (byte) -118, var15, var12, var19[var21]);
                                                var21++;
                                            }
                                        }
                                    }
                                } else if (var17 == 3) {
                                    this.method1357(var16, var14, 0, (byte) -119, var15, var12, 0);
                                    this.method1357(var16, var14, 0, (byte) -126, var15, var12, arg1.field1163);
                                    this.method1357(var16, var14, arg1.field1163, (byte) -118, var15, var12, 0);
                                } else if (var17 == 2) {
                                    this.method1357(var16, var14, 0, (byte) -117, var15, var12, arg1.field1163);
                                    this.method1357(var16, var14, arg1.field1163, (byte) -128, var15, var12, arg1.field1163);
                                    this.method1357(var16, var14, 0, (byte) -118, var15, var12, 0);
                                } else if (var17 == 5) {
                                    this.method1357(var16, var14, arg1.field1163, (byte) -121, var15, var12, arg1.field1163);
                                    this.method1357(var16, var14, arg1.field1163, (byte) -128, var15, var12, 0);
                                    this.method1357(var16, var14, 0, (byte) -127, var15, var12, arg1.field1163);
                                } else if (var17 == 4) {
                                    this.method1357(var16, var14, arg1.field1163, (byte) -120, var15, var12, 0);
                                    this.method1357(var16, var14, 0, (byte) -123, var15, var12, 0);
                                    this.method1357(var16, var14, arg1.field1163, (byte) -122, var15, var12, arg1.field1163);
                                }
                            }
                        }
                        var15++;
                        var13++;
                    }
                } else {
                    var13 += this.field2737 - this.field2732;
                }
                var12++;
            }
            this.field2715 = this.field2738.method3470(5123, (byte) -128, false, this.field2720.field5393, this.field2720.field5367);
            this.field2721 = this.field2738.method3433(this.field2725.field5367, false, false, this.field2725.field5393, 16);
            this.field2719 = new class414(this.field2721, 5126, 3, 0);
            this.field2735 = new class414(this.field2721, 5121, 4, 12);
        } else {
            this.field2735 = null;
            this.field2715 = null;
            this.field2719 = null;
            this.field2721 = null;
        }
        this.field2720 = null;
        this.field2741 = null;
        this.field2730 = this.field2728 = this.field2718 = null;
        this.field2725 = null;
    }
}
