import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class267 extends class147 {

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "Lhq;")
    private class190 field3839;

    @OriginalMember(owner = "client!ni", name = "F", descriptor = "Lic;")
    private class246 field3854;

    @OriginalMember(owner = "client!ni", name = "B", descriptor = "Lto;")
    private class296 field3850;

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "I")
    private int field3838;

    @OriginalMember(owner = "client!ni", name = "y", descriptor = "I")
    private int field3847;

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "I")
    private int field3845;

    @OriginalMember(owner = "client!ni", name = "t", descriptor = "I")
    private int field3842;

    @OriginalMember(owner = "client!ni", name = "E", descriptor = "[[F")
    private float[][] field3853;

    @OriginalMember(owner = "client!ni", name = "D", descriptor = "[[F")
    private float[][] field3852;

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "[[F")
    private float[][] field3840;

    @OriginalMember(owner = "client!ni", name = "u", descriptor = "Lvt;")
    private class179 field3843;

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "Lkc;")
    private class472 field3846;

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "Lwb;")
    private class45 field3844;

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "Lhs;")
    private class455 field3848;

    @OriginalMember(owner = "client!ni", name = "G", descriptor = "Leb;")
    private class416 field3855;

    @OriginalMember(owner = "client!ni", name = "A", descriptor = "Lfh;")
    private class228 field3849;

    @OriginalMember(owner = "client!ni", name = "s", descriptor = "Lfh;")
    private class228 field3841;

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
    private int field3837;

    @OriginalMember(owner = "client!ni", name = "C", descriptor = "I")
    private int field3851;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IB[[ZII)V", line = 13)
    public final void method1617(int arg0, byte arg1, boolean[][] arg2, int arg3, int arg4) {
        if (this.field3848 == null || this.field3838 > (arg0 + arg4) || this.field3847 < (arg0 - arg4) || this.field3845 > arg3 + arg4) {
            return;
        }
        int var6 = -70 / ((17 - arg1) / 61);
        if (arg3 - arg4 > this.field3842) {
            return;
        }
        for (int var7 = this.field3845; var7 <= this.field3842; var7++) {
            for (int var8 = this.field3838; var8 <= this.field3847; var8++) {
                int var9 = var8 - arg0;
                int var10 = var7 - arg3;
                if (var9 > (-arg4) && arg4 > var9 && -arg4 < var10 && arg4 > var10 && arg2[arg4 + var9][arg4 + var10]) {
                    this.field3854.method1411((int) (this.field3839.field2604 * 255.0F) << 24);
                    this.field3854.method1412(this.field3849, (class228) null, this.field3841, (class228) null);
                    this.field3854.method1399(this.field3848, 4, 0, this.field3837);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIIII)V", line = 72)
    private final void method1618(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        long var8 = -1L;
        int var10 = (arg6 << this.field3850.field4376) + arg2;
        int var11 = (arg4 << this.field3850.field4376) + arg5;
        int var12 = this.field3850.method1857(var10, var11);
        if ((arg2 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
            var8 = ((long) var11 & 0xFFFFL) << 16 | (long) var10 & 0xFFFFL;
            class147 var13 = this.field3844.method233(119, var8);
            if (var13 != null) {
                this.method1619((byte) -111, ((class251) var13).field3521);
                return;
            }
        }
        short var14 = (short) (this.field3851++);
        if (var8 != -1L) {
            this.field3844.method234(-117, var8, new class251(var14));
        }
        float var15;
        float var16;
        float var17;
        if (arg2 == 0 && arg5 == 0) {
            var15 = this.field3852[arg1][arg0];
            var16 = this.field3853[arg1][arg0];
            var17 = this.field3840[arg1][arg0];
        } else if (this.field3850.field4383 == arg2 && arg5 == 0) {
            var16 = this.field3853[arg1 + 1][arg0];
            var17 = this.field3840[arg1 + 1][arg0];
            var15 = this.field3852[arg1 + 1][arg0];
        } else if (this.field3850.field4383 == arg2 && this.field3850.field4383 == arg5) {
            var16 = this.field3853[arg1 + 1][arg0 + 1];
            var15 = this.field3852[arg1 + 1][arg0 + 1];
            var17 = this.field3840[arg1 + 1][arg0 + 1];
        } else if (arg2 == 0 && this.field3850.field4383 == arg5) {
            var15 = this.field3852[arg1][arg0 + 1];
            var17 = this.field3840[arg1][arg0 + 1];
            var16 = this.field3853[arg1][arg0 + 1];
        } else {
            float var18 = (float) arg2 / (float) this.field3850.field4383;
            float var19 = (float) arg5 / (float) this.field3850.field4383;
            float var20 = this.field3852[arg1][arg0];
            float var21 = this.field3840[arg1][arg0];
            float var22 = this.field3853[arg1][arg0];
            float var23 = this.field3852[arg1 + 1][arg0];
            float var24 = this.field3840[arg1 + 1][arg0];
            float var25 = (this.field3852[arg1 + 1][arg0 + 1] - var23) * var18 + var23;
            float var26 = this.field3853[arg1 + 1][arg0];
            float var27 = (this.field3852[arg1][arg0 + 1] - var20) * var18 + var20;
            float var28 = (this.field3840[arg1 + 1][arg0 + 1] - var24) * var18 + var24;
            float var29 = (this.field3840[arg1][arg0 + 1] - var21) * var18 + var21;
            float var30 = (this.field3853[arg1][arg0 + 1] - var22) * var18 + var22;
            var15 = (var25 - var27) * var19 + var27;
            var17 = (var28 - var29) * var19 + var29;
            float var31 = (this.field3853[arg1 + 1][arg0 + 1] - var26) * var18 + var26;
            var16 = (var31 - var30) * var19 + var30;
        }
        float var32 = (float) (this.field3839.field2607 - var10);
        float var33 = (float) (this.field3839.field2602 - var12);
        float var34 = (float) (this.field3839.field2605 - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var34 * var36;
        float var38 = var33 * var36;
        float var39 = var32 * var36;
        float var40 = var35 / (float) this.field3839.field2601;
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var16 * var37 + var15 * var39 + var17 * var38;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field3839.field2606;
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (arg3 != -28902) {
            this.field3839 = (class190) null;
        }
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFFA7) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (this.field3854.field3370) {
            this.field3846.method2788((float) var10, arg3 ^ 0x4F1FD382);
            this.field3846.method2788((float) var12, -1327473512);
            this.field3846.method2788((float) var11, -1327473512);
        } else {
            this.field3846.method2787(true, (float) var10);
            this.field3846.method2787(true, (float) var12);
            this.field3846.method2787(true, (float) var11);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        this.field3846.method909(var45, arg3 ^ 0x70E5);
        this.field3846.method909(var46, -1);
        this.field3846.method909(var47, -1);
        this.field3846.method909(255, -1);
        this.method1619((byte) -124, var14);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BS)V", line = 243)
    private final void method1619(byte arg0, short arg1) {
        if (this.field3854.field3370) {
            this.field3843.method884(arg1, true);
        } else {
            this.field3843.method880(true, arg1);
        }
        this.field3837++;
        int var3 = -14 % ((arg0 + 20) / 36);
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lic;Lto;Lhq;[I)V", line = 257)
    public class267(class246 arg0, class296 arg1, class190 arg2, int[] arg3) {
        this.field3839 = arg2;
        this.field3854 = arg0;
        this.field3850 = arg1;
        int var5 = this.field3839.field2601 - (arg1.field4383 >> 1);
        this.field3838 = this.field3839.field2607 - var5 >> arg1.field4376;
        this.field3847 = this.field3839.field2607 + var5 >> arg1.field4376;
        this.field3845 = this.field3839.field2605 - var5 >> arg1.field4376;
        this.field3842 = this.field3839.field2605 + var5 >> arg1.field4376;
        int var6 = this.field3847 - (this.field3838 - 1);
        int var7 = this.field3842 + 1 - this.field3845;
        this.field3853 = new float[var6 + 1][var7 + 1];
        this.field3852 = new float[var6 + 1][var7 + 1];
        this.field3840 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var9 = this.field3845 + var8;
            if (var9 > 0 && (this.field3850.field6324 - 1) > var9) {
                for (int var10 = 0; var10 <= var6; var10++) {
                    int var11 = this.field3838 + var10;
                    if (var11 > 0 && this.field3850.field6326 - 1 > var11) {
                        int var12 = arg1.method1861(var11 + 1, var9) - arg1.method1861(var11 - 1, var9);
                        int var13 = arg1.method1861(var11, var9 + 1) - arg1.method1861(var11, var9 - 1);
                        float var14 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + var13 * var13 + 65536)));
                        this.field3852[var10][var8] = (float) var12 * var14;
                        this.field3840[var10][var8] = var14 * -256.0F;
                        this.field3853[var10][var8] = (float) var13 * var14;
                    }
                }
            }
        }
        int var15 = 0;
        int var16 = 0;
        for (int var17 = this.field3845; var17 <= this.field3842; var17++) {
            if (var17 >= 0 && arg1.field6324 > var17) {
                for (int var18 = this.field3838; var18 <= this.field3847; var18++) {
                    if (var18 >= 0 && arg1.field6326 > var18) {
                        int var19 = arg3[var16];
                        int[] var20 = arg1.field4370[var18][var17];
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
                var16 += this.field3847 - this.field3838;
            }
        }
        if (var15 > 0) {
            this.field3843 = new class179(var15 * 2);
            this.field3846 = new class472(var15 * 16);
            this.field3844 = new class45(class93.method459(-719824240, var15));
            int var21 = 0;
            int var22 = 0;
            for (int var23 = this.field3845; var23 <= this.field3842; var23++) {
                if (var23 >= 0 && arg1.field6324 > var23) {
                    int var24 = 0;
                    for (int var25 = this.field3838; var25 <= this.field3847; var25++) {
                        if (var25 >= 0 && arg1.field6326 > var25) {
                            int var26 = arg3[var21];
                            int[] var27 = arg1.field4370[var25][var23];
                            int[] var28 = arg1.field4384[var25][var23];
                            if (var27 != null && var26 != 0) {
                                if (var26 == 1) {
                                    for (int var29 = 0; var29 < var27.length; var29++) {
                                        this.method1618(var22, var24, var27[var29], -28902, var23, var28[var29], var25);
                                    }
                                } else if (var26 == 3) {
                                    this.method1618(var22, var24, 0, -28902, var23, 0, var25);
                                    this.method1618(var22, var24, arg1.field4383, -28902, var23, 0, var25);
                                    this.method1618(var22, var24, 0, -28902, var23, arg1.field4383, var25);
                                } else if (var26 == 2) {
                                    this.method1618(var22, var24, arg1.field4383, -28902, var23, 0, var25);
                                    this.method1618(var22, var24, arg1.field4383, -28902, var23, arg1.field4383, var25);
                                    this.method1618(var22, var24, 0, -28902, var23, 0, var25);
                                } else if (var26 == 5) {
                                    this.method1618(var22, var24, arg1.field4383, -28902, var23, arg1.field4383, var25);
                                    this.method1618(var22, var24, 0, -28902, var23, arg1.field4383, var25);
                                    this.method1618(var22, var24, arg1.field4383, -28902, var23, 0, var25);
                                } else if (var26 == 4) {
                                    this.method1618(var22, var24, 0, -28902, var23, arg1.field4383, var25);
                                    this.method1618(var22, var24, 0, -28902, var23, 0, var25);
                                    this.method1618(var22, var24, arg1.field4383, -28902, var23, arg1.field4383, var25);
                                }
                            }
                        }
                        var21++;
                        var24++;
                    }
                } else {
                    var21 += this.field3847 - this.field3838;
                }
                var22++;
            }
            this.field3848 = this.field3854.method1435(5123, this.field3843.field2159, this.field3843.field2206, false);
            this.field3855 = this.field3854.method1361(16, this.field3846.field2159, this.field3846.field2206, false);
            this.field3849 = new class228(this.field3854, this.field3855, 5126, 3, 0);
            this.field3841 = new class228(this.field3854, this.field3855, 5121, 4, 12);
        } else {
            this.field3855 = null;
            this.field3848 = null;
            this.field3841 = null;
            this.field3849 = null;
        }
        this.field3846 = null;
        this.field3844 = null;
        this.field3852 = this.field3840 = this.field3853 = (float[][]) null;
        this.field3843 = null;
    }
}
