import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class76 extends class359 {

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "Lpo;")
    private class332 field847;

    @OriginalMember(owner = "client!wk", name = "w", descriptor = "Lvg;")
    private class33 field857;

    @OriginalMember(owner = "client!wk", name = "u", descriptor = "Lwa;")
    private class365 field855;

    @OriginalMember(owner = "client!wk", name = "t", descriptor = "I")
    private int field854;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "I")
    private int field844;

    @OriginalMember(owner = "client!wk", name = "A", descriptor = "I")
    private int field861;

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "I")
    private int field851;

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "[[F")
    private float[][] field849;

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "[[F")
    private float[][] field852;

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "[[F")
    private float[][] field848;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "Leo;")
    private class163 field846;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "Lti;")
    private class254 field843;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "Lpe;")
    private class363 field845;

    @OriginalMember(owner = "client!wk", name = "z", descriptor = "Lpe;")
    private class363 field860;

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "Lbk;")
    private class211 field850;

    @OriginalMember(owner = "client!wk", name = "y", descriptor = "Lfe;")
    private class340 field859;

    @OriginalMember(owner = "client!wk", name = "x", descriptor = "Lcs;")
    private class189 field858;

    @OriginalMember(owner = "client!wk", name = "s", descriptor = "I")
    private int field853;

    @OriginalMember(owner = "client!wk", name = "v", descriptor = "I")
    private int field856;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I[[ZIII)V", line = 15)
    public final void method432(int arg0, boolean[][] arg1, int arg2, int arg3, int arg4) {
        if (this.field846 == null || arg2 + arg3 < this.field854 || this.field844 < arg2 - arg3 || (arg3 + arg4) < this.field861 || (arg4 - arg3) > this.field851) {
            return;
        }
        for (int var6 = this.field861; var6 <= this.field851; var6++) {
            for (int var7 = this.field854; var7 <= this.field844; var7++) {
                int var8 = var7 - arg2;
                int var9 = var6 - arg4;
                if (var8 > -arg3 && var8 < arg3 && var9 > -arg3 && var9 < arg3 && arg1[var8 + arg3][var9 + arg3]) {
                    this.field847.method2090((int) (this.field857.field312 * 255.0F) << 24);
                    this.field847.method2077(this.field860);
                    this.field847.method2111(this.field845);
                    this.field847.method2114();
                    this.field847.method2107(this.field846, 4, 0, this.field856);
                    return;
                }
            }
        }
        if (arg0 >= -117) {
            this.field861 = -29;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BS)V", line = 76)
    private final void method433(byte arg0, short arg1) {
        if (this.field847.field4779) {
            this.field850.method1380(arg1, (byte) -8);
        } else {
            this.field850.method1339((byte) 3, arg1);
        }
        if (arg0 == 120) {
            this.field856++;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIIII)V", line = 92)
    private final void method434(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        long var8 = -1L;
        int var10 = (arg5 << this.field855.field5303) + arg4;
        int var11 = (arg6 << this.field855.field5303) + arg3;
        int var12 = this.field855.method1991(var10, var11);
        if ((arg4 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = ((long) var11 & 0xFFFFL) << 16 | (long) var10 & 0xFFFFL;
            class359 var13 = this.field858.method1204((byte) -94, var8);
            if (var13 != null) {
                this.method433((byte) 120, ((class341) var13).field5024);
                return;
            }
        }
        short var14 = (short) (this.field853++);
        if (var8 != -1L) {
            this.field858.method1202(-1, var8, new class341(var14));
        }
        float var15;
        float var16;
        float var17;
        if (arg4 == 0 && arg3 == 0) {
            var15 = this.field852[arg0][arg1];
            var16 = this.field849[arg0][arg1];
            var17 = this.field848[arg0][arg1];
        } else if (this.field855.field5306 == arg4 && arg3 == 0) {
            var16 = this.field849[arg0 + 1][arg1];
            var15 = this.field852[arg0 + 1][arg1];
            var17 = this.field848[arg0 + 1][arg1];
        } else if (this.field855.field5306 == arg4 && this.field855.field5306 == arg3) {
            var17 = this.field848[arg0 + 1][arg1 + 1];
            var15 = this.field852[arg0 + 1][arg1 + 1];
            var16 = this.field849[arg0 + 1][arg1 + 1];
        } else if (arg4 == 0 && this.field855.field5306 == arg3) {
            var15 = this.field852[arg0][arg1 + 1];
            var17 = this.field848[arg0][arg1 + 1];
            var16 = this.field849[arg0][arg1 + 1];
        } else {
            float var18 = (float) arg4 / (float) this.field855.field5306;
            float var19 = (float) arg3 / (float) this.field855.field5306;
            float var20 = this.field848[arg0][arg1];
            float var21 = this.field849[arg0][arg1];
            float var22 = this.field852[arg0][arg1];
            float var23 = this.field848[arg0 + 1][arg1];
            float var24 = this.field849[arg0 + 1][arg1];
            float var25 = (this.field852[arg0][arg1 + 1] - var22) * var18 + var22;
            float var26 = this.field852[arg0 + 1][arg1];
            float var27 = (this.field848[arg0][arg1 + 1] - var20) * var18 + var20;
            float var28 = (this.field849[arg0 + 1][arg1 + 1] - var24) * var18 + var24;
            float var29 = (this.field849[arg0][arg1 + 1] - var21) * var18 + var21;
            float var30 = (this.field848[arg0 + 1][arg1 + 1] - var23) * var18 + var23;
            float var31 = (this.field852[arg0 + 1][arg1 + 1] - var26) * var18 + var26;
            var17 = (var30 - var27) * var19 + var27;
            var16 = (var28 - var29) * var19 + var29;
            var15 = (var31 - var25) * var19 + var25;
        }
        float var32 = (float) (this.field857.field309 - var10);
        float var33 = (float) (this.field857.field304 - var12);
        float var34 = (float) (this.field857.field311 - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var34 * var36;
        float var38 = var33 * var36;
        float var39 = var32 * var36;
        float var40 = var35 / (float) this.field857.field307;
        float var41 = (float) arg2 - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var15 * var37 + var16 * var38 + var17 * var39;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field857.field305;
        int var45 = (int) ((float) ((var44 & 0xFFBDD5) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFF45) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (this.field847.field4779) {
            this.field859.method2186((float) var10, arg2 ^ 0x5263);
            this.field859.method2186((float) var12, 21090);
            this.field859.method2186((float) var11, 21090);
        } else {
            this.field859.method2187((float) var10, -16092);
            this.field859.method2187((float) var12, -16092);
            this.field859.method2187((float) var11, -16092);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        this.field859.method1396(21375, var45);
        this.field859.method1396(21375, var46);
        this.field859.method1396(21375, var47);
        this.field859.method1396(arg2 ^ 0x537E, 255);
        this.method433((byte) 120, var14);
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lpo;Lwa;Lvg;[I)V", line = 259)
    public class76(class332 arg0, class365 arg1, class33 arg2, int[] arg3) {
        this.field847 = arg0;
        this.field857 = arg2;
        this.field855 = arg1;
        int var5 = this.field857.field307 - (arg1.field5306 >> 1);
        this.field854 = this.field857.field309 - var5 >> arg1.field5303;
        this.field844 = this.field857.field309 + var5 >> arg1.field5303;
        this.field861 = this.field857.field311 - var5 >> arg1.field5303;
        this.field851 = this.field857.field311 + var5 >> arg1.field5303;
        int var6 = this.field844 + 1 - this.field854;
        int var7 = this.field851 + 1 - this.field861;
        this.field849 = new float[var6 + 1][var7 + 1];
        this.field852 = new float[var6 + 1][var7 + 1];
        this.field848 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var9 = this.field861 + var8;
            if (var9 > 0 && var9 < this.field855.field4531 - 1) {
                for (int var10 = 0; var10 <= var6; var10++) {
                    int var11 = this.field854 + var10;
                    if (var11 > 0 && var11 < (this.field855.field4530 - 1)) {
                        int var12 = arg1.method1990(var11 + 1, var9) - arg1.method1990(var11 - 1, var9);
                        int var13 = arg1.method1990(var11, var9 + 1) - arg1.method1990(var11, var9 - 1);
                        float var14 = (float) (1.0D / Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536)));
                        this.field848[var10][var8] = (float) var12 * var14;
                        this.field849[var10][var8] = var14 * -256.0F;
                        this.field852[var10][var8] = (float) var13 * var14;
                    }
                }
            }
        }
        int var15 = 0;
        int var16 = 0;
        for (int var17 = this.field861; var17 <= this.field851; var17++) {
            if (var17 >= 0 && var17 < arg1.field4531) {
                for (int var18 = this.field854; var18 <= this.field844; var18++) {
                    if (var18 >= 0 && var18 < arg1.field4530) {
                        int var19 = arg3[var16];
                        int[] var20 = arg1.field5309[var18][var17];
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
                var16 += this.field844 - this.field854;
            }
        }
        if (var15 <= 0) {
            this.field846 = null;
            this.field843 = null;
            this.field845 = null;
            this.field860 = null;
        } else {
            this.field850 = new class211(var15 * 2);
            this.field859 = new class340(var15 * 16);
            this.field858 = new class189(class279.method1761(false, var15));
            int var21 = 0;
            int var22 = 0;
            for (int var23 = this.field861; var23 <= this.field851; var23++) {
                if (var23 >= 0 && arg1.field4531 > var23) {
                    int var24 = 0;
                    for (int var25 = this.field854; var25 <= this.field844; var25++) {
                        if (var25 >= 0 && var25 < arg1.field4530) {
                            int var26 = arg3[var21];
                            int[] var27 = arg1.field5309[var25][var23];
                            int[] var28 = arg1.field5305[var25][var23];
                            if (var27 != null && var26 != 0) {
                                if (var26 == 1) {
                                    for (int var29 = 0; var29 < var27.length; var29++) {
                                        this.method434(var24, var22, 1, var28[var29], var27[var29], var25, var23);
                                    }
                                } else if (var26 == 3) {
                                    this.method434(var24, var22, 1, 0, 0, var25, var23);
                                    this.method434(var24, var22, 1, 0, arg1.field5306, var25, var23);
                                    this.method434(var24, var22, 1, arg1.field5306, 0, var25, var23);
                                } else if (var26 == 2) {
                                    this.method434(var24, var22, 1, 0, arg1.field5306, var25, var23);
                                    this.method434(var24, var22, 1, arg1.field5306, arg1.field5306, var25, var23);
                                    this.method434(var24, var22, 1, 0, 0, var25, var23);
                                } else if (var26 == 5) {
                                    this.method434(var24, var22, 1, arg1.field5306, arg1.field5306, var25, var23);
                                    this.method434(var24, var22, 1, arg1.field5306, 0, var25, var23);
                                    this.method434(var24, var22, 1, 0, arg1.field5306, var25, var23);
                                } else if (var26 == 4) {
                                    this.method434(var24, var22, 1, arg1.field5306, 0, var25, var23);
                                    this.method434(var24, var22, 1, 0, 0, var25, var23);
                                    this.method434(var24, var22, 1, arg1.field5306, arg1.field5306, var25, var23);
                                }
                            }
                        }
                        var21++;
                        var24++;
                    }
                } else {
                    var21 += this.field844 - this.field854;
                }
                var22++;
            }
            this.field846 = this.field847.method2101(5123, this.field850.field2867, this.field850.field2888, false);
            this.field843 = this.field847.method2106(16, this.field859.field2867, this.field859.field2888, false);
            this.field860 = new class363(this.field847, this.field843, 5126, 3, 0);
            this.field845 = new class363(this.field847, this.field843, 5121, 4, 12);
        }
        this.field848 = this.field849 = this.field852 = (float[][]) null;
        this.field859 = null;
        this.field858 = null;
        this.field850 = null;
    }
}
