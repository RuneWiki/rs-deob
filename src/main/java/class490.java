import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class490 extends class35 {

    @OriginalMember(owner = "client!ik", name = "B", descriptor = "Llg;")
    private class22 field6882;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "Lnm;")
    private class254 field6867;

    @OriginalMember(owner = "client!ik", name = "z", descriptor = "Lma;")
    private class233 field6880;

    @OriginalMember(owner = "client!ik", name = "A", descriptor = "I")
    private int field6881;

    @OriginalMember(owner = "client!ik", name = "r", descriptor = "I")
    private int field6872;

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "I")
    private int field6871;

    @OriginalMember(owner = "client!ik", name = "u", descriptor = "I")
    private int field6875;

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "[[F")
    private float[][] field6869;

    @OriginalMember(owner = "client!ik", name = "w", descriptor = "[[F")
    private float[][] field6877;

    @OriginalMember(owner = "client!ik", name = "v", descriptor = "[[F")
    private float[][] field6876;

    @OriginalMember(owner = "client!ik", name = "E", descriptor = "Lre;")
    private class446 field6884;

    @OriginalMember(owner = "client!ik", name = "x", descriptor = "Lob;")
    private class292 field6878;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "Lfa;")
    private class371 field6866;

    @OriginalMember(owner = "client!ik", name = "D", descriptor = "Lgs;")
    private class407 field6883;

    @OriginalMember(owner = "client!ik", name = "t", descriptor = "Lec;")
    private class101 field6874;

    @OriginalMember(owner = "client!ik", name = "y", descriptor = "Ljt;")
    private class377 field6879;

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "Ljt;")
    private class377 field6868;

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "I")
    private int field6870;

    @OriginalMember(owner = "client!ik", name = "s", descriptor = "I")
    private int field6873;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(III[[ZB)V")
    public final void method2857(int arg0, int arg1, int arg2, boolean[][] arg3, byte arg4) {
        if (this.field6883 == null || arg1 + arg2 < this.field6881 || arg1 - arg2 > this.field6872 || this.field6871 > arg0 + arg2 || this.field6875 < (arg0 - arg2)) {
            return;
        }
        int var6 = this.field6871;
        if (arg4 != -22) {
            this.field6869 = (float[][]) ((float[][]) null);
        }
        while (this.field6875 >= var6) {
            for (int var7 = this.field6881; var7 <= this.field6872; var7++) {
                int var8 = var7 - arg1;
                int var9 = var6 - arg0;
                if (-arg2 < var8 && arg2 > var8 && var9 > -arg2 && var9 < arg2 && arg3[arg2 + var8][var9 + arg2]) {
                    this.field6867.method1677((int) (this.field6880.field3418 * 255.0F) << 24);
                    this.field6867.method1674(this.field6879, (class377) null, this.field6868, (class377) null);
                    this.field6867.method1664(this.field6883, 4, 0, this.field6873);
                    return;
                }
            }
            var6++;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIBIIII)V")
    private final void method2858(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        long var8 = -1L;
        int var10 = arg5 + (arg1 << this.field6882.field278);
        int var11 = (arg4 << this.field6882.field278) + arg3;
        int var12 = this.field6882.method204(var10, var11);
        if ((arg5 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = ((long) var11 & 0xFFFFL) << 16 | (long) var10 & 0xFFFFL;
            class35 var13 = this.field6866.method2305(var8, (byte) 101);
            if (var13 != null) {
                this.method2859((byte) -88, ((class231) var13).field3393);
                return;
            }
        }
        short var14 = (short) (this.field6870++);
        if (var8 != -1L) {
            this.field6866.method2307(var8, new class231(var14), (byte) -44);
        }
        float var15;
        float var16;
        float var17;
        if (arg5 == 0 && arg3 == 0) {
            var15 = this.field6877[arg6][arg0];
            var16 = this.field6869[arg6][arg0];
            var17 = this.field6876[arg6][arg0];
        } else if (this.field6882.field286 == arg5 && arg3 == 0) {
            var16 = this.field6869[arg6 + 1][arg0];
            var17 = this.field6876[arg6 + 1][arg0];
            var15 = this.field6877[arg6 + 1][arg0];
        } else if (this.field6882.field286 == arg5 && this.field6882.field286 == arg3) {
            var15 = this.field6877[arg6 + 1][arg0 + 1];
            var17 = this.field6876[arg6 + 1][arg0 + 1];
            var16 = this.field6869[arg6 + 1][arg0 + 1];
        } else if (arg5 == 0 && this.field6882.field286 == arg3) {
            var15 = this.field6877[arg6][arg0 + 1];
            var17 = this.field6876[arg6][arg0 + 1];
            var16 = this.field6869[arg6][arg0 + 1];
        } else {
            float var18 = (float) arg5 / (float) this.field6882.field286;
            float var19 = (float) arg3 / (float) this.field6882.field286;
            float var20 = this.field6869[arg6][arg0];
            float var21 = this.field6877[arg6][arg0];
            float var22 = this.field6876[arg6][arg0];
            float var23 = this.field6869[arg6 + 1][arg0];
            float var24 = this.field6877[arg6 + 1][arg0];
            float var25 = (this.field6869[arg6][arg0 + 1] - var20) * var18 + var20;
            float var26 = (this.field6877[arg6][arg0 + 1] - var21) * var18 + var21;
            float var27 = (this.field6876[arg6][arg0 + 1] - var22) * var18 + var22;
            float var28 = (this.field6869[arg6 + 1][arg0 + 1] - var23) * var18 + var23;
            float var29 = (this.field6877[arg6 + 1][arg0 + 1] - var24) * var18 + var24;
            float var30 = this.field6876[arg6 + 1][arg0];
            float var31 = (this.field6876[arg6 + 1][arg0 + 1] - var30) * var18 + var30;
            var15 = (var29 - var26) * var19 + var26;
            var16 = (var28 - var25) * var19 + var25;
            var17 = (var31 - var27) * var19 + var27;
        }
        float var32 = (float) (this.field6880.field3414 - var10);
        float var33 = (float) (this.field6880.field3416 - var12);
        float var34 = (float) (this.field6880.field3413 - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var33 * var36;
        float var38 = var34 * var36;
        float var39 = var32 * var36;
        float var40 = var35 / (float) this.field6880.field3407;
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
        int var44 = this.field6880.field3409;
        int var45 = (int) ((float) ((var44 & 0xFFFF22) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFF2E) >> 8) * var43);
        if (arg2 != 30) {
            this.method2859((byte) 96, (short) 53);
        }
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field6867.field3742) {
            this.field6878.method1842((byte) -64, (float) var10);
            this.field6878.method1842((byte) -64, (float) var12);
            this.field6878.method1842((byte) -64, (float) var11);
        } else {
            this.field6878.method1841((float) var10, (byte) -122);
            this.field6878.method1841((float) var12, (byte) 100);
            this.field6878.method1841((float) var11, (byte) -69);
        }
        this.field6878.method2619((byte) 6, var45);
        this.field6878.method2619((byte) 41, var46);
        this.field6878.method2619((byte) -124, var47);
        this.field6878.method2619((byte) 106, 255);
        this.method2859((byte) -124, var14);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BS)V")
    private final void method2859(byte arg0, short arg1) {
        if (this.field6867.field3742) {
            this.field6884.method2592(arg1, (byte) -106);
        } else {
            this.field6884.method2623(arg1, (byte) -101);
        }
        int var3 = 89 / ((-arg0 - 38) / 37);
        this.field6873++;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lnm;Llg;Lma;[I)V")
    public class490(class254 arg0, class22 arg1, class233 arg2, int[] arg3) {
        this.field6882 = arg1;
        this.field6867 = arg0;
        this.field6880 = arg2;
        int var5 = this.field6880.field3407 - (arg1.field286 >> 1);
        this.field6881 = this.field6880.field3414 - var5 >> arg1.field278;
        this.field6872 = this.field6880.field3414 + var5 >> arg1.field278;
        this.field6871 = this.field6880.field3413 - var5 >> arg1.field278;
        this.field6875 = this.field6880.field3413 + var5 >> arg1.field278;
        int var6 = this.field6872 + 1 - this.field6881;
        int var7 = this.field6875 + 1 - this.field6871;
        this.field6869 = new float[var6 + 1][var7 + 1];
        this.field6877 = new float[var6 + 1][var7 + 1];
        this.field6876 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var9 = this.field6871 + var8;
            if (var9 > 0 && var9 < this.field6882.field690 - 1) {
                for (int var10 = 0; var10 <= var6; var10++) {
                    int var11 = this.field6881 + var10;
                    if (var11 > 0 && var11 < this.field6882.field686 - 1) {
                        int var12 = arg1.method199(var11 + 1, var9) - arg1.method199(var11 - 1, var9);
                        int var13 = arg1.method199(var11, var9 + 1) - arg1.method199(var11, var9 - 1);
                        float var14 = (float) (1.0D / Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536)));
                        this.field6869[var10][var8] = (float) var12 * var14;
                        this.field6877[var10][var8] = var14 * -256.0F;
                        this.field6876[var10][var8] = (float) var13 * var14;
                    }
                }
            }
        }
        int var15 = 0;
        int var16 = 0;
        for (int var17 = this.field6871; var17 <= this.field6875; var17++) {
            if (var17 >= 0 && arg1.field690 > var17) {
                for (int var18 = this.field6881; var18 <= this.field6872; var18++) {
                    if (var18 >= 0 && arg1.field686 > var18) {
                        int var19 = arg3[var16];
                        int[] var20 = arg1.field270[var18][var17];
                        if (var20 != null && var19 != 0) {
                            if (var19 == 1) {
                                var15 += var20.length;
                            } else {
                                var15 += 3;
                            }
                        }
                    }
                    var16++;
                }
            } else {
                var16 += this.field6872 - this.field6881;
            }
        }
        if (var15 > 0) {
            this.field6884 = new class446(var15 * 2);
            this.field6878 = new class292(var15 * 16);
            this.field6866 = new class371(class158.method1078((byte) -86, var15));
            int var21 = 0;
            int var22 = 0;
            for (int var23 = this.field6871; var23 <= this.field6875; var23++) {
                if (var23 >= 0 && arg1.field690 > var23) {
                    int var24 = 0;
                    for (int var25 = this.field6881; var25 <= this.field6872; var25++) {
                        if (var25 >= 0 && var25 < arg1.field686) {
                            int var26 = arg3[var21];
                            int[] var27 = arg1.field270[var25][var23];
                            int[] var28 = arg1.field265[var25][var23];
                            if (var27 != null && var26 != 0) {
                                if (var26 == 1) {
                                    for (int var29 = 0; var29 < var27.length; var29++) {
                                        this.method2858(var22, var25, (byte) 30, var28[var29], var23, var27[var29], var24);
                                    }
                                } else if (var26 == 3) {
                                    this.method2858(var22, var25, (byte) 30, 0, var23, 0, var24);
                                    this.method2858(var22, var25, (byte) 30, 0, var23, arg1.field286, var24);
                                    this.method2858(var22, var25, (byte) 30, arg1.field286, var23, 0, var24);
                                } else if (var26 == 2) {
                                    this.method2858(var22, var25, (byte) 30, 0, var23, arg1.field286, var24);
                                    this.method2858(var22, var25, (byte) 30, arg1.field286, var23, arg1.field286, var24);
                                    this.method2858(var22, var25, (byte) 30, 0, var23, 0, var24);
                                } else if (var26 == 5) {
                                    this.method2858(var22, var25, (byte) 30, arg1.field286, var23, arg1.field286, var24);
                                    this.method2858(var22, var25, (byte) 30, arg1.field286, var23, 0, var24);
                                    this.method2858(var22, var25, (byte) 30, 0, var23, arg1.field286, var24);
                                } else if (var26 == 4) {
                                    this.method2858(var22, var25, (byte) 30, arg1.field286, var23, 0, var24);
                                    this.method2858(var22, var25, (byte) 30, 0, var23, 0, var24);
                                    this.method2858(var22, var25, (byte) 30, arg1.field286, var23, arg1.field286, var24);
                                }
                            }
                        }
                        var21++;
                        var24++;
                    }
                } else {
                    var21 += this.field6872 - this.field6881;
                }
                var22++;
            }
            this.field6883 = this.field6867.method1670(5123, this.field6884.field6316, this.field6884.field6315, false);
            this.field6874 = this.field6867.method1644(16, this.field6878.field6316, this.field6878.field6315, false);
            this.field6879 = new class377(this.field6867, this.field6874, 5126, 3, 0);
            this.field6868 = new class377(this.field6867, this.field6874, 5121, 4, 12);
        } else {
            this.field6879 = null;
            this.field6874 = null;
            this.field6868 = null;
            this.field6883 = null;
        }
        this.field6884 = null;
        this.field6869 = this.field6877 = this.field6876 = (float[][]) null;
        this.field6866 = null;
        this.field6878 = null;
    }
}
