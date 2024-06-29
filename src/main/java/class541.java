import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class541 {

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "[F")
    private float[] field7310 = new float[16];

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "Lwu;")
    private class340 field7318 = new class340(786336);

    @OriginalMember(owner = "client!pm", name = "r", descriptor = "I")
    private int field7324 = class55.method457(24266, 1600);

    @OriginalMember(owner = "client!pm", name = "v", descriptor = "[[Lwd;")
    private class247[][] field7328 = new class247[64][768];

    @OriginalMember(owner = "client!pm", name = "y", descriptor = "[I")
    private int[] field7331 = new int[8191];

    @OriginalMember(owner = "client!pm", name = "x", descriptor = "I")
    private int field7330 = 0;

    @OriginalMember(owner = "client!pm", name = "w", descriptor = "[[Lwd;")
    private class247[][] field7329 = new class247[1600][64];

    @OriginalMember(owner = "client!pm", name = "z", descriptor = "[I")
    private int[] field7332 = new int[64];

    @OriginalMember(owner = "client!pm", name = "A", descriptor = "[I")
    private int[] field7333 = new int[1600];

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
    public static int field7315 = 0;

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "[C")
    private static char[] field7320 = new char[64];

    @OriginalMember(owner = "client!pm", name = "u", descriptor = "Z")
    public static boolean field7327;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
    public static int field7307;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
    public static int field7308;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
    public static int field7309;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
    public static int field7311;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    public static int field7312;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
    public static int field7313;

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "I")
    public static int field7314;

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
    public static int field7316;

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "I")
    public static int field7319;

    @OriginalMember(owner = "client!pm", name = "s", descriptor = "I")
    public static int field7325;

    @OriginalMember(owner = "client!pm", name = "p", descriptor = "Leq;")
    private class194 field7322;

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "Lmca;")
    public static class29 field7317;

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "Lmq;")
    private class470 field7321;

    @OriginalMember(owner = "client!pm", name = "q", descriptor = "Lmq;")
    private class470 field7323;

    @OriginalMember(owner = "client!pm", name = "t", descriptor = "Lmq;")
    private class470 field7326;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)V")
    public static final void method3051(int arg0, int arg1) {
        if (arg0 != 1307501036) {
            method3060((byte) 85);
        }
        field7314++;
        class193.field2746.method3754(arg1, true);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIBII)V")
    public static final void method3052(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field7319++;
        class51 var5 = class703.method3938(-1989279584, arg3, 8);
        var5.method402((byte) 62);
        var5.field605 = arg0;
        if (arg2 <= 60) {
            method3052(48, -30, (byte) -67, 113, 1);
        }
        var5.field603 = arg4;
        var5.field604 = arg1;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)Z")
    public static final boolean method3053(byte arg0) {
        int var1 = -76 % ((arg0 - 52) / 58);
        field7309++;
        return class137.field1948 > 0;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZLlj;I)V")
    private final void method3054(boolean arg0, class565 arg1, int arg2) {
        OpenGL.glGetFloatv(2982, this.field7310, 0);
        field7307++;
        float var4 = this.field7310[0];
        float var5 = this.field7310[4];
        float var6 = this.field7310[8];
        float var7 = this.field7310[1];
        float var8 = this.field7310[5];
        float var9 = this.field7310[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        if (arg0) {
            this.method3061(null, -108, 43);
        }
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field7318.field6892 = 0;
        float var18 = var9 - var6;
        if (arg1.field7921) {
            for (int var44 = arg2 - 1; var44 >= 0; var44--) {
                int var45 = this.field7333[var44] <= 64 ? this.field7333[var44] : 64;
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class247 var59 = this.field7329[var44][var46];
                        int var60 = var59.field3384;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field3389 >> 12);
                        float var66 = (float) (var59.field3387 >> 12);
                        float var67 = (float) (var59.field3381 >> 12);
                        int var68 = var59.field3379 >> 12;
                        this.field7318.method1987(0.0F, -368862280);
                        this.field7318.method1987(0.0F, -368862280);
                        this.field7318.method1987((float) (-var68) * var10 + var65, -368862280);
                        this.field7318.method1987((float) (-var68) * var11 + var66, -368862280);
                        this.field7318.method1987((float) (-var68) * var12 + var67, -368862280);
                        this.field7318.method2817(var61, true);
                        this.field7318.method2817(var62, true);
                        this.field7318.method2817(var63, true);
                        this.field7318.method2817(var64, true);
                        this.field7318.method1987(1.0F, -368862280);
                        this.field7318.method1987(0.0F, -368862280);
                        this.field7318.method1987((float) var68 * var13 + var65, -368862280);
                        this.field7318.method1987((float) var68 * var14 + var66, -368862280);
                        this.field7318.method1987((float) var68 * var15 + var67, -368862280);
                        this.field7318.method2817(var61, true);
                        this.field7318.method2817(var62, !arg0);
                        this.field7318.method2817(var63, true);
                        this.field7318.method2817(var64, !arg0);
                        this.field7318.method1987(1.0F, -368862280);
                        this.field7318.method1987(1.0F, -368862280);
                        this.field7318.method1987((float) var68 * var10 + var65, -368862280);
                        this.field7318.method1987((float) var68 * var11 + var66, -368862280);
                        this.field7318.method1987((float) var68 * var12 + var67, -368862280);
                        this.field7318.method2817(var61, true);
                        this.field7318.method2817(var62, true);
                        this.field7318.method2817(var63, true);
                        this.field7318.method2817(var64, true);
                        this.field7318.method1987(0.0F, -368862280);
                        this.field7318.method1987(1.0F, -368862280);
                        this.field7318.method1987((float) var68 * var16 + var65, -368862280);
                        this.field7318.method1987((float) var68 * var17 + var66, -368862280);
                        this.field7318.method1987((float) var68 * var18 + var67, -368862280);
                        this.field7318.method2817(var61, true);
                        this.field7318.method2817(var62, true);
                        this.field7318.method2817(var63, true);
                        this.field7318.method2817(var64, true);
                    }
                    if (this.field7333[var44] > 64) {
                        int var47 = this.field7333[var44] - 64 - 1;
                        for (int var48 = this.field7332[var47] - 1; var48 >= 0; var48--) {
                            class247 var49 = this.field7328[var47][var48];
                            int var50 = var49.field3384;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field3389 >> 12);
                            float var56 = (float) (var49.field3387 >> 12);
                            float var57 = (float) (var49.field3381 >> 12);
                            int var58 = var49.field3379 >> 12;
                            this.field7318.method1987(0.0F, -368862280);
                            this.field7318.method1987(0.0F, -368862280);
                            this.field7318.method1987((float) (-var58) * var10 + var55, -368862280);
                            this.field7318.method1987((float) (-var58) * var11 + var56, -368862280);
                            this.field7318.method1987((float) (-var58) * var12 + var57, -368862280);
                            this.field7318.method2817(var51, true);
                            this.field7318.method2817(var52, true);
                            this.field7318.method2817(var53, true);
                            this.field7318.method2817(var54, !arg0);
                            this.field7318.method1987(1.0F, -368862280);
                            this.field7318.method1987(0.0F, -368862280);
                            this.field7318.method1987((float) var58 * var13 + var55, -368862280);
                            this.field7318.method1987((float) var58 * var14 + var56, -368862280);
                            this.field7318.method1987((float) var58 * var15 + var57, -368862280);
                            this.field7318.method2817(var51, true);
                            this.field7318.method2817(var52, true);
                            this.field7318.method2817(var53, true);
                            this.field7318.method2817(var54, !arg0);
                            this.field7318.method1987(1.0F, -368862280);
                            this.field7318.method1987(1.0F, -368862280);
                            this.field7318.method1987((float) var58 * var10 + var55, -368862280);
                            this.field7318.method1987((float) var58 * var11 + var56, -368862280);
                            this.field7318.method1987((float) var58 * var12 + var57, -368862280);
                            this.field7318.method2817(var51, !arg0);
                            this.field7318.method2817(var52, true);
                            this.field7318.method2817(var53, true);
                            this.field7318.method2817(var54, !arg0);
                            this.field7318.method1987(0.0F, -368862280);
                            this.field7318.method1987(1.0F, -368862280);
                            this.field7318.method1987((float) var58 * var16 + var55, -368862280);
                            this.field7318.method1987((float) var58 * var17 + var56, -368862280);
                            this.field7318.method1987((float) var58 * var18 + var57, -368862280);
                            this.field7318.method2817(var51, true);
                            this.field7318.method2817(var52, true);
                            this.field7318.method2817(var53, true);
                            this.field7318.method2817(var54, true);
                        }
                    }
                }
            }
        } else {
            for (int var19 = arg2 - 1; var19 >= 0; var19--) {
                int var20 = this.field7333[var19] > 64 ? 64 : this.field7333[var19];
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class247 var34 = this.field7329[var19][var21];
                        int var35 = var34.field3384;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field3389 >> 12);
                        float var41 = (float) (var34.field3387 >> 12);
                        float var42 = (float) (var34.field3381 >> 12);
                        int var43 = var34.field3379 >> 12;
                        this.field7318.method1992(0.0F, 23507);
                        this.field7318.method1992(0.0F, 23507);
                        this.field7318.method1992((float) (-var43) * var10 + var40, 23507);
                        this.field7318.method1992((float) (-var43) * var11 + var41, 23507);
                        this.field7318.method1992((float) (-var43) * var12 + var42, 23507);
                        this.field7318.method2817(var36, !arg0);
                        this.field7318.method2817(var37, !arg0);
                        this.field7318.method2817(var38, true);
                        this.field7318.method2817(var39, true);
                        this.field7318.method1992(1.0F, 23507);
                        this.field7318.method1992(0.0F, 23507);
                        this.field7318.method1992((float) var43 * var13 + var40, 23507);
                        this.field7318.method1992((float) var43 * var14 + var41, 23507);
                        this.field7318.method1992((float) var43 * var15 + var42, 23507);
                        this.field7318.method2817(var36, true);
                        this.field7318.method2817(var37, true);
                        this.field7318.method2817(var38, true);
                        this.field7318.method2817(var39, !arg0);
                        this.field7318.method1992(1.0F, 23507);
                        this.field7318.method1992(1.0F, 23507);
                        this.field7318.method1992((float) var43 * var10 + var40, 23507);
                        this.field7318.method1992((float) var43 * var11 + var41, 23507);
                        this.field7318.method1992((float) var43 * var12 + var42, 23507);
                        this.field7318.method2817(var36, !arg0);
                        this.field7318.method2817(var37, true);
                        this.field7318.method2817(var38, !arg0);
                        this.field7318.method2817(var39, true);
                        this.field7318.method1992(0.0F, 23507);
                        this.field7318.method1992(1.0F, 23507);
                        this.field7318.method1992((float) var43 * var16 + var40, 23507);
                        this.field7318.method1992((float) var43 * var17 + var41, 23507);
                        this.field7318.method1992((float) var43 * var18 + var42, 23507);
                        this.field7318.method2817(var36, true);
                        this.field7318.method2817(var37, !arg0);
                        this.field7318.method2817(var38, true);
                        this.field7318.method2817(var39, true);
                    }
                    if (this.field7333[var19] > 64) {
                        int var22 = this.field7333[var19] - 64 - 1;
                        for (int var23 = this.field7332[var22] - 1; var23 >= 0; var23--) {
                            class247 var24 = this.field7328[var22][var23];
                            int var25 = var24.field3384;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field3389 >> 12);
                            float var31 = (float) (var24.field3387 >> 12);
                            float var32 = (float) (var24.field3381 >> 12);
                            int var33 = var24.field3379 >> 12;
                            this.field7318.method1992(0.0F, 23507);
                            this.field7318.method1992(0.0F, 23507);
                            this.field7318.method1992((float) (-var33) * var10 + var30, 23507);
                            this.field7318.method1992((float) (-var33) * var11 + var31, 23507);
                            this.field7318.method1992((float) (-var33) * var12 + var32, 23507);
                            this.field7318.method2817(var26, !arg0);
                            this.field7318.method2817(var27, true);
                            this.field7318.method2817(var28, true);
                            this.field7318.method2817(var29, !arg0);
                            this.field7318.method1992(1.0F, 23507);
                            this.field7318.method1992(0.0F, 23507);
                            this.field7318.method1992((float) var33 * var13 + var30, 23507);
                            this.field7318.method1992((float) var33 * var14 + var31, 23507);
                            this.field7318.method1992((float) var33 * var15 + var32, 23507);
                            this.field7318.method2817(var26, true);
                            this.field7318.method2817(var27, true);
                            this.field7318.method2817(var28, !arg0);
                            this.field7318.method2817(var29, true);
                            this.field7318.method1992(1.0F, 23507);
                            this.field7318.method1992(1.0F, 23507);
                            this.field7318.method1992((float) var33 * var10 + var30, 23507);
                            this.field7318.method1992((float) var33 * var11 + var31, 23507);
                            this.field7318.method1992((float) var33 * var12 + var32, 23507);
                            this.field7318.method2817(var26, true);
                            this.field7318.method2817(var27, true);
                            this.field7318.method2817(var28, true);
                            this.field7318.method2817(var29, true);
                            this.field7318.method1992(0.0F, 23507);
                            this.field7318.method1992(1.0F, 23507);
                            this.field7318.method1992((float) var33 * var16 + var30, 23507);
                            this.field7318.method1992((float) var33 * var17 + var31, 23507);
                            this.field7318.method1992((float) var33 * var18 + var32, 23507);
                            this.field7318.method2817(var26, true);
                            this.field7318.method2817(var27, true);
                            this.field7318.method2817(var28, true);
                            this.field7318.method2817(var29, !arg0);
                        }
                    }
                }
            }
        }
        if (this.field7318.field6892 != 0) {
            this.field7322.method595(24, this.field7318.field6855, this.field7318.field6892, -24007);
            arg1.method3208(this.field7321, (byte) -115, null, this.field7326, this.field7323);
            arg1.method3212(7, 0, this.field7318.field6892 / 24, 18744);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILlj;)V")
    private final void method3055(int arg0, class565 arg1) {
        arg1.method3213(true, -69);
        int var3 = -64 / ((arg0 + 55) / 32);
        field7311++;
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (class574.field8118 != arg1.field7943) {
            arg1.method105(class574.field8118);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BLdk;Llj;I)V")
    public final void method3056(byte arg0, class472 arg1, class565 arg2, int arg3) {
        field7316++;
        if (arg2.field7866 == null) {
            return;
        }
        if (arg3 < 0) {
            this.method3058(arg2, -1309);
        } else {
            this.method3061(arg2, 16385, arg3);
        }
        float var5 = arg2.field7866.field7576;
        float var6 = arg2.field7866.field7556;
        float var7 = arg2.field7866.field7558;
        float var8 = arg2.field7866.field7560;
        try {
            int var9 = 0 / ((arg0 + 27) / 38);
            int var10 = 0;
            int var11 = Integer.MAX_VALUE;
            int var12 = 0;
            class698 var13 = arg1.field6493.field8428;
            for (class698 var14 = var13.field9901; var14 != var13; var14 = var14.field9901) {
                class247 var15 = (class247) var14;
                int var16 = (int) ((float) (var15.field3381 >> 12) * var7 + (float) (var15.field3389 >> 12) * var5 + (float) (var15.field3387 >> 12) * var6 + var8);
                if (var16 < var11) {
                    var11 = var16;
                }
                this.field7331[var10++] = var16;
                if (var12 < var16) {
                    var12 = var16;
                }
            }
            int var17 = var12 - var11;
            int var18;
            if ((var17 + 2) > 1600) {
                var18 = class55.method457(24266, var17) + 1 - this.field7324;
                var17 = (var17 >> var18) + 2;
            } else {
                var17 += 2;
                var18 = 0;
            }
            class698 var19 = var13.field9901;
            int var20 = 0;
            int var21 = -2;
            boolean var22 = true;
            boolean var23 = true;
            while (var13 != var19) {
                this.field7330 = 0;
                for (int var24 = 0; var24 < var17; var24++) {
                    this.field7333[var24] = 0;
                }
                for (int var25 = 0; var25 < 64; var25++) {
                    this.field7332[var25] = 0;
                }
                while (var13 != var19) {
                    class247 var26 = (class247) var19;
                    if (var23) {
                        var22 = var26.field3385;
                        var21 = var26.field3382;
                        var23 = false;
                    }
                    if (var20 > 0 && (var26.field3382 != var21 || var22 != var26.field3385)) {
                        var23 = true;
                        break;
                    }
                    int var27 = this.field7331[var20++] - var11 >> var18;
                    if (var27 < 1600) {
                        if (this.field7333[var27] < 64) {
                            this.field7329[var27][this.field7333[var27]++] = var26;
                        } else {
                            label102: {
                                if (this.field7333[var27] == 64) {
                                    if (this.field7330 == 64) {
                                        break label102;
                                    }
                                    this.field7333[var27] += (this.field7330++) + 1;
                                }
                                this.field7328[this.field7333[var27] - 64 - 1][this.field7332[this.field7333[var27] - 1 - 64]++] = var26;
                            }
                        }
                    }
                    var19 = var19.field9901;
                }
                if (var21 < 0) {
                    arg2.method3238(-7056, -1);
                } else {
                    arg2.method3238(-7056, var21);
                }
                if (var22 && class574.field8118 != arg2.field7943) {
                    arg2.method105(class574.field8118);
                } else if (arg2.field7943 != 1.0F) {
                    arg2.method105(1.0F);
                }
                this.method3054(false, arg2, var17);
            }
        } catch (Exception var28) {
        }
        this.method3055(-115, arg2);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIIBIII)V")
    public static final void method3057(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        field7313++;
        class9.field72[class631.field8755++] = new class209(arg8, arg0, arg1, arg4, arg4, arg1, arg6, arg2, arg2, arg6, arg7, arg7, arg3, arg3);
        if (arg5 != 49) {
            method3052(-87, 93, (byte) 80, 83, 29);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Llj;I)V")
    private final void method3058(class565 arg0, int arg1) {
        class574.field8118 = arg0.field7943;
        field7308++;
        arg0.method3209((byte) -118);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg0.method3213(false, -47);
        if (arg1 != -1309) {
            this.field7329 = null;
        }
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(Llj;I)V")
    public final void method3059(class565 arg0, int arg1) {
        this.field7322 = arg0.method3221(-7946, 196584, true, null, 24);
        field7312++;
        if (arg1 != 23563) {
            this.field7332 = null;
        }
        this.field7321 = new class470(this.field7322, 5126, 2, 0);
        this.field7326 = new class470(this.field7322, 5126, 3, 8);
        this.field7323 = new class470(this.field7322, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(B)V")
    public static void method3060(byte arg0) {
        field7320 = null;
        field7317 = null;
        if (arg0 != -23) {
            method3051(-58, -86);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Llj;II)V")
    private final void method3061(class565 arg0, int arg1, int arg2) {
        class574.field8118 = arg0.field7943;
        field7325++;
        arg0.method3207((float) arg2, arg1 - 16389);
        arg0.method3169(false);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(arg1);
        arg0.method3213(false, -120);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field7320[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field7320[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field7320[var2] = (char) (var2 - 4);
        }
        field7320[62] = '+';
        field7320[63] = '/';
        field7327 = false;
    }
}
