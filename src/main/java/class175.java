import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class175 extends class184 {

    @OriginalMember(owner = "client!gg", name = "z", descriptor = "Lmh;")
    private class634 field2704;

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "Lraa;")
    private class609 field2697;

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "Lwh;")
    private class148 field2695;

    @OriginalMember(owner = "client!gg", name = "y", descriptor = "I")
    private int field2703;

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "I")
    private int field2696;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "I")
    private int field2691;

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
    private int field2694;

    @OriginalMember(owner = "client!gg", name = "J", descriptor = "[[F")
    private float[][] field2714;

    @OriginalMember(owner = "client!gg", name = "C", descriptor = "[[F")
    private float[][] field2707;

    @OriginalMember(owner = "client!gg", name = "w", descriptor = "[[F")
    private float[][] field2701;

    @OriginalMember(owner = "client!gg", name = "K", descriptor = "I")
    private int field2715;

    @OriginalMember(owner = "client!gg", name = "F", descriptor = "Lcl;")
    private class268 field2710;

    @OriginalMember(owner = "client!gg", name = "x", descriptor = "Lwia;")
    private class761 field2702;

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "Lcl;")
    private class268 field2699;

    @OriginalMember(owner = "client!gg", name = "E", descriptor = "Lgh;")
    private class550 field2709;

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "Lrg;")
    private class645 field2698;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "Lsea;")
    private class699 field2692;

    @OriginalMember(owner = "client!gg", name = "B", descriptor = "Lhe;")
    private class372 field2706;

    @OriginalMember(owner = "client!gg", name = "D", descriptor = "Lfa;")
    public static class235 field2708 = new class235(9, 0, 4, 1);

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
    private int field2693;

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!gg", name = "A", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!gg", name = "G", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!gg", name = "H", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!gg", name = "I", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIIII)V")
    private final void method1241(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2705++;
        long var8 = -1L;
        int var10 = (arg2 << this.field2704.field3955) + arg1;
        int var11 = (arg4 << this.field2704.field3955) + arg5;
        int var12 = this.field2704.method1786(var11, (byte) 113, var10);
        if ((arg1 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | (long) var11 << 16 & 0xFFFFL << 16;
            class184 var13 = this.field2706.method2287(var8, (byte) -117);
            if (var13 != null) {
                this.method1242(((class250) var13).field3618, (byte) 123);
                return;
            }
        }
        short var14 = (short) (this.field2693++);
        if (var8 != -1L) {
            this.field2706.method2278((byte) -36, var8, new class250(var14));
        }
        if (arg0 != -20863) {
            return;
        }
        float var15;
        float var16;
        float var17;
        if (arg1 == 0 && arg5 == 0) {
            var15 = this.field2701[arg3][arg6];
            var16 = this.field2714[arg3][arg6];
            var17 = this.field2707[arg3][arg6];
        } else if (this.field2704.field3965 == arg1 && arg5 == 0) {
            var17 = this.field2707[arg3 + 1][arg6];
            var15 = this.field2701[arg3 + 1][arg6];
            var16 = this.field2714[arg3 + 1][arg6];
        } else if (this.field2704.field3965 == arg1 && this.field2704.field3965 == arg5) {
            var16 = this.field2714[arg3 + 1][arg6 + 1];
            var15 = this.field2701[arg3 + 1][arg6 + 1];
            var17 = this.field2707[arg3 + 1][arg6 + 1];
        } else if (arg1 == 0 && this.field2704.field3965 == arg5) {
            var17 = this.field2707[arg3][arg6 + 1];
            var16 = this.field2714[arg3][arg6 + 1];
            var15 = this.field2701[arg3][arg6 + 1];
        } else {
            float var18 = (float) arg1 / (float) this.field2704.field3965;
            float var19 = (float) arg5 / (float) this.field2704.field3965;
            float var20 = this.field2701[arg3][arg6];
            float var21 = this.field2714[arg3][arg6];
            float var22 = this.field2707[arg3][arg6];
            float var23 = this.field2701[arg3 + 1][arg6];
            float var24 = this.field2714[arg3 + 1][arg6];
            float var25 = (this.field2701[arg3][arg6 + 1] - var20) * var18 + var20;
            float var26 = (this.field2707[arg3][arg6 + 1] - var22) * var18 + var22;
            float var27 = (this.field2701[arg3 + 1][arg6 + 1] - var23) * var18 + var23;
            float var28 = (this.field2714[arg3 + 1][arg6 + 1] - var24) * var18 + var24;
            float var29 = this.field2707[arg3 + 1][arg6];
            float var30 = (this.field2714[arg3][arg6 + 1] - var21) * var18 + var21;
            var16 = (var28 - var30) * var19 + var30;
            var15 = (var27 - var25) * var19 + var25;
            float var31 = (this.field2707[arg3 + 1][arg6 + 1] - var29) * var18 + var29;
            var17 = (var31 - var26) * var19 + var26;
        }
        float var32 = (float) (this.field2697.method3533(false) - var10);
        float var33 = (float) (this.field2697.method3536(arg0 ^ 0xFFFFF0AD) - var12);
        float var34 = (float) (this.field2697.method3531(20597) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var32 * var36;
        float var38 = var34 * var36;
        float var39 = var33 * var36;
        float var40 = var35 / (float) this.field2697.method3537(6490);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var17 * var38 + var15 * var37 + var16 * var39;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field2697.method3534(arg0 + 20739);
        int var45 = (int) ((float) ((var44 & 0xFFF740) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFFDB) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (this.field2695.field2211) {
            this.field2692.method3968(arg0 ^ 0xFFFFAC55, (float) var10);
            this.field2692.method3968(724, (float) var12);
            this.field2692.method3968(724, (float) var11);
        } else {
            this.field2692.method3967((byte) 38, (float) var10);
            this.field2692.method3967((byte) 38, (float) var12);
            this.field2692.method3967((byte) 38, (float) var11);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        this.field2692.method3730(arg0 + 20977, var45);
        this.field2692.method3730(105, var46);
        this.field2692.method3730(arg0 ^ 0xFFFFAEE7, var47);
        this.field2692.method3730(123, 255);
        this.method1242(var14, (byte) 122);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(SB)V")
    private final void method1242(short arg0, byte arg1) {
        field2713++;
        if (this.field2695.field2211) {
            this.field2698.method3702(arg0, (byte) -124);
        } else {
            this.field2698.method3758(arg0, 1394247496);
        }
        if (arg1 <= 121) {
            method1243(-109);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
    public static void method1243(int arg0) {
        if (arg0 != -256) {
            method1246(25, -38, null, 37);
        }
        field2708 = null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II[[ZII)V")
    public final void method1244(int arg0, int arg1, boolean[][] arg2, int arg3, int arg4) {
        field2711++;
        if (this.field2709 == null) {
            return;
        }
        if (arg1 != 0) {
            this.field2694 = -120;
        }
        if (this.field2703 > arg0 + arg3 || arg0 - arg3 > this.field2696 || (arg4 + arg3) < this.field2691 || (arg4 - arg3) > this.field2694) {
            return;
        }
        for (int var6 = this.field2691; var6 <= this.field2694; var6++) {
            for (int var7 = this.field2703; var7 <= this.field2696; var7++) {
                int var8 = var7 - arg0;
                int var9 = var6 - arg4;
                if (var8 > (-arg3) && arg3 > var8 && var9 > -arg3 && arg3 > var9 && arg2[arg3 + var8][arg3 + var9]) {
                    this.field2695.method1054(arg1 ^ 0x3, (int) (this.field2697.method3535((byte) -41) * 255.0F) << 24);
                    this.field2695.method1048(this.field2710, 16384, this.field2699, null, null);
                    this.field2695.method1064(false, 4, this.field2709, 0, this.field2715);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V")
    public static final void method1245(boolean arg0) {
        field2712++;
        class502.field7131++;
        class468 var1 = class93.method734(class29.field284, class123.field1665, 8174);
        if (arg0) {
            field2708 = null;
        }
        var1.field6839.method3730(126, class756.method4219((byte) 8));
        var1.field6839.method3702(class501.field7123, (byte) -108);
        var1.field6839.method3702(class510.field7263, (byte) -109);
        var1.field6839.method3730(103, class63.field916.field10183.method1426(17503));
        class120.method872((byte) 60, var1);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IILjava/awt/Canvas;I)Lkf;")
    public static final class255 method1246(int arg0, int arg1, Canvas arg2, int arg3) {
        if (arg0 != -1209375263) {
            field2708 = null;
        }
        field2700++;
        try {
            Class var4 = Class.forName("pj");
            class255 var5 = (class255) var4.getDeclaredConstructor().newInstance();
            var5.method1018(arg1, arg3, arg2, 2);
            return var5;
        } catch (Throwable var7) {
            class658 var6 = new class658();
            var6.method1018(arg1, arg3, arg2, 2);
            return var6;
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
    public static final void method1247(int arg0) {
        if (arg0 == 0) {
            if (class686.field9489 == 2) {
                class449.field6662[0].method1387(class379.field5736[0]);
                class449.field6662[1].method1387(class379.field5736[1]);
            } else if (class686.field9489 == 3) {
                class449.field6662[0].method1387(class379.field5736[0]);
                class449.field6662[1].method1387(class379.field5736[1]);
                class449.field6662[2].method1387(class379.field5736[2]);
            } else {
                class449.field6662[0].method1387(class379.field5736[0]);
                class449.field6662[1].method1387(class379.field5736[1]);
                class449.field6662[2].method1387(class379.field5736[2]);
                class449.field6662[3].method1387(class379.field5736[3]);
            }
        } else if (arg0 == 1) {
            if (class686.field9489 == 2) {
                class449.field6662[0].method1387(class379.field5736[2]);
            } else if (class686.field9489 == 3) {
                class449.field6662[0].method1387(class379.field5736[3]);
                class449.field6662[1].method1387(class379.field5736[4]);
            } else {
                class449.field6662[0].method1387(class379.field5736[4]);
                class449.field6662[1].method1387(class379.field5736[5]);
                class449.field6662[2].method1387(class379.field5736[6]);
            }
        } else if (arg0 == 2) {
            if (class686.field9489 == 2) {
                class449.field6662[0].method1387(class379.field5736[3]);
                return;
            }
            if (class686.field9489 == 3) {
                class449.field6662[0].method1387(class379.field5736[5]);
                return;
            }
            class449.field6662[0].method1387(class379.field5736[7]);
        }
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lwh;Lmh;Lraa;[I)V")
    public class175(class148 arg0, class634 arg1, class609 arg2, int[] arg3) {
        this.field2704 = arg1;
        this.field2697 = arg2;
        this.field2695 = arg0;
        int var5 = this.field2697.method3537(6490) - (arg1.field3965 >> 1);
        this.field2703 = this.field2697.method3533(false) - var5 >> arg1.field3955;
        this.field2696 = this.field2697.method3533(false) + var5 >> arg1.field3955;
        this.field2691 = this.field2697.method3531(20597) - var5 >> arg1.field3955;
        this.field2694 = this.field2697.method3531(20597) + var5 >> arg1.field3955;
        int var6 = this.field2696 + 1 - this.field2703;
        int var7 = this.field2694 + 1 - this.field2691;
        this.field2714 = new float[var6 + 1][var7 + 1];
        this.field2707 = new float[var6 + 1][var7 + 1];
        this.field2701 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var25 = this.field2691 + var8;
            if (var25 > 0 && (this.field2704.field3962 - 1) > var25) {
                for (int var26 = 0; var26 <= var6; var26++) {
                    int var27 = this.field2703 + var26;
                    if (var27 > 0 && this.field2704.field3963 - 1 > var27) {
                        int var28 = arg1.method1787(var27 + 1, 19646, var25) - arg1.method1787(var27 - 1, 19646, var25);
                        int var29 = arg1.method1787(var27, 19646, var25 + 1) - arg1.method1787(var27, 19646, var25 - 1);
                        float var30 = (float) (1.0D / Math.sqrt((double) (var28 * var28 + var29 * var29 + 65536)));
                        this.field2701[var26][var8] = (float) var28 * var30;
                        this.field2714[var26][var8] = var30 * -256.0F;
                        this.field2707[var26][var8] = (float) var29 * var30;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field2691; var10 <= this.field2694; var10++) {
            if (var10 >= 0 && arg1.field3962 > var10) {
                for (int var21 = this.field2703; var21 <= this.field2696; var21++) {
                    if (var21 >= 0 && var21 < arg1.field3963) {
                        int var22 = arg3[var9];
                        int[] var23 = arg1.field8876[var21][var10];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                int var24 = 0;
                                while (var23.length > var24) {
                                    if (var23[var24++] != -1 && var23[var24++] != -1 && var23[var24++] != -1) {
                                        this.field2715 += 3;
                                    }
                                }
                            } else {
                                this.field2715 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field2696 - this.field2703;
            }
        }
        if (this.field2715 <= 0) {
            this.field2710 = null;
            this.field2702 = null;
            this.field2699 = null;
            this.field2709 = null;
        } else {
            this.field2698 = new class645(this.field2715 * 2);
            this.field2692 = new class699(this.field2715 * 16);
            this.field2706 = new class372(class432.method2684(this.field2715, -21774));
            int var11 = 0;
            int var12 = 0;
            for (int var13 = this.field2691; var13 <= this.field2694; var13++) {
                if (var13 >= 0 && arg1.field3962 > var13) {
                    int var14 = 0;
                    for (int var15 = this.field2703; var15 <= this.field2696; var15++) {
                        if (var15 >= 0 && arg1.field3963 > var15) {
                            int var16 = arg3[var11];
                            int[] var17 = arg1.field8876[var15][var13];
                            if (var17 != null && var16 != 0) {
                                if (var16 == 1) {
                                    int[] var18 = arg1.field8871[var15][var13];
                                    int[] var19 = arg1.field8885[var15][var13];
                                    int var20 = 0;
                                    label111: while (true) {
                                        while (true) {
                                            if (var20 >= var17.length) {
                                                break label111;
                                            }
                                            if (var17[var20] == -1 || var17[var20 + 1] == -1 || var17[var20 + 2] == -1) {
                                                var20 += 3;
                                            } else {
                                                this.method1241(-20863, var18[var20], var15, var14, var13, var19[var20], var12);
                                                var20++;
                                                this.method1241(-20863, var18[var20], var15, var14, var13, var19[var20], var12);
                                                var20++;
                                                this.method1241(-20863, var18[var20], var15, var14, var13, var19[var20], var12);
                                                var20++;
                                            }
                                        }
                                    }
                                } else if (var16 == 3) {
                                    this.method1241(-20863, 0, var15, var14, var13, 0, var12);
                                    this.method1241(-20863, arg1.field3965, var15, var14, var13, 0, var12);
                                    this.method1241(-20863, 0, var15, var14, var13, arg1.field3965, var12);
                                } else if (var16 == 2) {
                                    this.method1241(-20863, arg1.field3965, var15, var14, var13, 0, var12);
                                    this.method1241(-20863, arg1.field3965, var15, var14, var13, arg1.field3965, var12);
                                    this.method1241(-20863, 0, var15, var14, var13, 0, var12);
                                } else if (var16 == 5) {
                                    this.method1241(-20863, arg1.field3965, var15, var14, var13, arg1.field3965, var12);
                                    this.method1241(-20863, 0, var15, var14, var13, arg1.field3965, var12);
                                    this.method1241(-20863, arg1.field3965, var15, var14, var13, 0, var12);
                                } else if (var16 == 4) {
                                    this.method1241(-20863, 0, var15, var14, var13, arg1.field3965, var12);
                                    this.method1241(-20863, 0, var15, var14, var13, 0, var12);
                                    this.method1241(-20863, arg1.field3965, var15, var14, var13, arg1.field3965, var12);
                                }
                            }
                        }
                        var14++;
                        var11++;
                    }
                } else {
                    var11 += this.field2696 - this.field2703;
                }
                var12++;
            }
            this.field2709 = this.field2695.method1079(false, this.field2698.field9068, this.field2698.field9084, 5123, -123);
            this.field2702 = this.field2695.method1046(false, 770, this.field2692.field9068, this.field2692.field9084, 16);
            this.field2710 = new class268(this.field2702, 5126, 3, 0);
            this.field2699 = new class268(this.field2702, 5121, 4, 12);
        }
        this.field2698 = null;
        this.field2692 = null;
        this.field2706 = null;
        this.field2701 = this.field2714 = this.field2707 = null;
    }
}
