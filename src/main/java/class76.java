import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class76 extends class338 {

    @OriginalMember(owner = "client!wn", name = "n", descriptor = "Lfs;")
    private class349 field849;

    @OriginalMember(owner = "client!wn", name = "p", descriptor = "Lge;")
    private class103 field851;

    @OriginalMember(owner = "client!wn", name = "u", descriptor = "Lql;")
    private class346 field856;

    @OriginalMember(owner = "client!wn", name = "A", descriptor = "I")
    private int field862;

    @OriginalMember(owner = "client!wn", name = "s", descriptor = "I")
    private int field854;

    @OriginalMember(owner = "client!wn", name = "t", descriptor = "I")
    private int field855;

    @OriginalMember(owner = "client!wn", name = "v", descriptor = "I")
    private int field857;

    @OriginalMember(owner = "client!wn", name = "z", descriptor = "[[F")
    private float[][] field861;

    @OriginalMember(owner = "client!wn", name = "m", descriptor = "[[F")
    private float[][] field848;

    @OriginalMember(owner = "client!wn", name = "r", descriptor = "[[F")
    private float[][] field853;

    @OriginalMember(owner = "client!wn", name = "w", descriptor = "Lbb;")
    private class135 field858;

    @OriginalMember(owner = "client!wn", name = "x", descriptor = "Lbb;")
    private class135 field859;

    @OriginalMember(owner = "client!wn", name = "o", descriptor = "Lcl;")
    private class313 field850;

    @OriginalMember(owner = "client!wn", name = "q", descriptor = "Lip;")
    private class49 field852;

    @OriginalMember(owner = "client!wn", name = "C", descriptor = "Ltq;")
    private class250 field864;

    @OriginalMember(owner = "client!wn", name = "D", descriptor = "Lhn;")
    private class255 field865;

    @OriginalMember(owner = "client!wn", name = "y", descriptor = "Luc;")
    private class58 field860;

    @OriginalMember(owner = "client!wn", name = "B", descriptor = "I")
    private int field863;

    @OriginalMember(owner = "client!wn", name = "E", descriptor = "I")
    private int field866;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIII[[Z)V", line = 8)
    public final void method428(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4) {
        if (arg3 > -41) {
            this.field848 = (float[][]) ((float[][]) null);
        }
        if (this.field850 == null || this.field862 > arg1 + arg2 || (arg2 - arg1) > this.field854 || arg0 + arg1 < this.field855 || arg0 - arg1 > this.field857) {
            return;
        }
        for (int var6 = this.field855; var6 <= this.field857; var6++) {
            for (int var7 = this.field862; var7 <= this.field854; var7++) {
                int var8 = var7 - arg2;
                int var9 = var6 - arg0;
                if (var8 > -arg1 && var8 < arg1 && (-arg1) < var9 && arg1 > var9 && arg4[arg1 + var8][var9 + arg1]) {
                    this.field856.method2077((int) (this.field849.field4852 * 255.0F) << 24);
                    this.field856.method2037(this.field858);
                    this.field856.method2082(this.field859);
                    this.field856.method2088();
                    this.field856.method2041(this.field850, 4, 0, this.field866);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(SB)V", line = 68)
    private final void method429(short arg0, byte arg1) {
        if (arg1 >= -43) {
            this.method428(31, -17, 122, 86, (boolean[][]) ((boolean[][]) null));
        }
        if (this.field856.field4736) {
            this.field864.method1346(122, arg0);
        } else {
            this.field864.method1370((byte) -36, arg0);
        }
        this.field866++;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIIIII)V", line = 84)
    private final void method430(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        long var8 = -1L;
        int var10 = (arg0 << this.field851.field1249) + arg2;
        int var11 = (arg3 << this.field851.field1249) + arg4;
        int var12 = this.field851.method265(var10, var11);
        if ((arg2 & 0x7F) == 0 || (arg4 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | (long) var11 & 0xFFFFL << 16;
            class338 var13 = this.field860.method308(var8, (byte) -96);
            if (var13 != null) {
                this.method429(((class164) var13).field2092, (byte) -44);
                return;
            }
        }
        short var14 = (short) (this.field863++);
        if (var8 != -1L) {
            this.field860.method314(var8, new class164(var14), 7079);
        }
        int var15 = 60 / ((arg5 - 1) / 33);
        float var16;
        float var17;
        float var18;
        if (arg2 == 0 && arg4 == 0) {
            var16 = this.field848[arg1][arg6];
            var17 = this.field853[arg1][arg6];
            var18 = this.field861[arg1][arg6];
        } else if (this.field851.field1248 == arg2 && arg4 == 0) {
            var16 = this.field848[arg1 + 1][arg6];
            var17 = this.field853[arg1 + 1][arg6];
            var18 = this.field861[arg1 + 1][arg6];
        } else if (this.field851.field1248 == arg2 && this.field851.field1248 == arg4) {
            var16 = this.field848[arg1 + 1][arg6 + 1];
            var18 = this.field861[arg1 + 1][arg6 + 1];
            var17 = this.field853[arg1 + 1][arg6 + 1];
        } else if (arg2 == 0 && this.field851.field1248 == arg4) {
            var17 = this.field853[arg1][arg6 + 1];
            var16 = this.field848[arg1][arg6 + 1];
            var18 = this.field861[arg1][arg6 + 1];
        } else {
            float var19 = (float) arg2 / (float) this.field851.field1248;
            float var20 = (float) arg4 / (float) this.field851.field1248;
            float var21 = this.field853[arg1][arg6];
            float var22 = this.field848[arg1][arg6];
            float var23 = this.field861[arg1][arg6];
            float var24 = this.field853[arg1 + 1][arg6];
            float var25 = this.field848[arg1 + 1][arg6];
            float var26 = (this.field848[arg1 + 1][arg6 + 1] - var25) * var19 + var25;
            float var27 = (this.field853[arg1 + 1][arg6 + 1] - var24) * var19 + var24;
            float var28 = (this.field861[arg1][arg6 + 1] - var23) * var19 + var23;
            float var29 = (this.field848[arg1][arg6 + 1] - var22) * var19 + var22;
            float var30 = (this.field853[arg1][arg6 + 1] - var21) * var19 + var21;
            float var31 = this.field861[arg1 + 1][arg6];
            float var32 = (this.field861[arg1 + 1][arg6 + 1] - var31) * var19 + var31;
            var16 = (var26 - var29) * var20 + var29;
            var17 = (var27 - var30) * var20 + var30;
            var18 = (var32 - var28) * var20 + var28;
        }
        float var33 = (float) (this.field849.field4853 - var10);
        float var34 = (float) (this.field849.field4849 - var12);
        float var35 = (float) (this.field849.field4851 - var11);
        float var36 = (float) Math.sqrt((double) (var35 * var35 + var33 * var33 + var34 * var34));
        float var37 = 1.0F / var36;
        float var38 = var34 * var37;
        float var39 = var33 * var37;
        float var40 = var35 * var37;
        float var41 = var36 / (float) this.field849.field4855;
        float var42 = 1.0F - (var41 * var41);
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var18 * var40 + var16 * var38 + var17 * var39;
        if (var43 < 0.0F) {
            var43 = 0.0F;
        }
        float var44 = var42 * var43 * 2.0F;
        if (var44 > 1.0F) {
            var44 = 1.0F;
        }
        int var45 = this.field849.field4848;
        int var46 = (int) ((float) ((var45 & 0xFFEF16) >> 16) * var44);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) ((var45 & 0xFF16) >> 8) * var44);
        if (var47 > 255) {
            var47 = 255;
        }
        int var48 = (int) ((float) (var45 & 0xFF) * var44);
        if (var48 > 255) {
            var48 = 255;
        }
        if (this.field856.field4736) {
            this.field865.method1442(-127, (float) var10);
            this.field865.method1442(-128, (float) var12);
            this.field865.method1442(-128, (float) var11);
        } else {
            this.field865.method1441((float) var10, false);
            this.field865.method1441((float) var12, false);
            this.field865.method1441((float) var11, false);
        }
        this.field865.method1386(-222840624, var46);
        this.field865.method1386(-222840624, var47);
        this.field865.method1386(-222840624, var48);
        this.field865.method1386(-222840624, 255);
        this.method429(var14, (byte) -115);
    }

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lql;Lge;Lfs;[I)V", line = 262)
    public class76(class346 arg0, class103 arg1, class349 arg2, int[] arg3) {
        this.field849 = arg2;
        this.field851 = arg1;
        this.field856 = arg0;
        int var5 = this.field849.field4855 - (arg1.field1248 >> 1);
        this.field862 = this.field849.field4853 - var5 >> arg1.field1249;
        this.field854 = this.field849.field4853 + var5 >> arg1.field1249;
        this.field855 = this.field849.field4851 - var5 >> arg1.field1249;
        this.field857 = this.field849.field4851 + var5 >> arg1.field1249;
        int var6 = this.field854 + 1 - this.field862;
        int var7 = this.field857 + 1 - this.field855;
        this.field861 = new float[var6 + 1][var7 + 1];
        this.field848 = new float[var6 + 1][var7 + 1];
        this.field853 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var9 = var8 + this.field855;
            if (var9 > 0 && (this.field851.field550 - 1) > var9) {
                for (int var10 = 0; var10 <= var6; var10++) {
                    int var11 = this.field862 + var10;
                    if (var11 > 0 && var11 < this.field851.field556 - 1) {
                        int var12 = arg1.method271(var11 + 1, var9) - arg1.method271(var11 - 1, var9);
                        int var13 = arg1.method271(var11, var9 + 1) - arg1.method271(var11, var9 - 1);
                        float var14 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + (var13 * var13) + 65536)));
                        this.field853[var10][var8] = (float) var12 * var14;
                        this.field848[var10][var8] = var14 * -256.0F;
                        this.field861[var10][var8] = (float) var13 * var14;
                    }
                }
            }
        }
        int var15 = 0;
        int var16 = 0;
        for (int var17 = this.field855; var17 <= this.field857; var17++) {
            if (var17 >= 0 && var17 < arg1.field550) {
                for (int var18 = this.field862; var18 <= this.field854; var18++) {
                    if (var18 >= 0 && arg1.field556 > var18) {
                        int var19 = arg3[var16];
                        int[] var20 = arg1.field1255[var18][var17];
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
                var16 += this.field854 - this.field862;
            }
        }
        if (var15 <= 0) {
            this.field858 = null;
            this.field859 = null;
            this.field850 = null;
            this.field852 = null;
        } else {
            this.field864 = new class250(var15 * 2);
            this.field865 = new class255(var15 * 16);
            this.field860 = new class58(class322.method1853(108, var15));
            int var21 = 0;
            int var22 = 0;
            for (int var23 = this.field855; var23 <= this.field857; var23++) {
                if (var23 >= 0 && arg1.field550 > var23) {
                    int var24 = 0;
                    for (int var25 = this.field862; var25 <= this.field854; var25++) {
                        if (var25 >= 0 && var25 < arg1.field556) {
                            int var26 = arg3[var21];
                            int[] var27 = arg1.field1255[var25][var23];
                            int[] var28 = arg1.field1236[var25][var23];
                            if (var27 != null && var26 != 0) {
                                if (var26 == 1) {
                                    for (int var29 = 0; var29 < var27.length; var29++) {
                                        this.method430(var25, var24, var27[var29], var23, var28[var29], 126, var22);
                                    }
                                } else if (var26 == 3) {
                                    this.method430(var25, var24, 0, var23, 0, 109, var22);
                                    this.method430(var25, var24, arg1.field1248, var23, 0, -110, var22);
                                    this.method430(var25, var24, 0, var23, arg1.field1248, 102, var22);
                                } else if (var26 == 2) {
                                    this.method430(var25, var24, arg1.field1248, var23, 0, -127, var22);
                                    this.method430(var25, var24, arg1.field1248, var23, arg1.field1248, -120, var22);
                                    this.method430(var25, var24, 0, var23, 0, -41, var22);
                                } else if (var26 == 5) {
                                    this.method430(var25, var24, arg1.field1248, var23, arg1.field1248, 46, var22);
                                    this.method430(var25, var24, 0, var23, arg1.field1248, -107, var22);
                                    this.method430(var25, var24, arg1.field1248, var23, 0, -35, var22);
                                } else if (var26 == 4) {
                                    this.method430(var25, var24, 0, var23, arg1.field1248, -45, var22);
                                    this.method430(var25, var24, 0, var23, 0, 70, var22);
                                    this.method430(var25, var24, arg1.field1248, var23, arg1.field1248, 43, var22);
                                }
                            }
                        }
                        var24++;
                        var21++;
                    }
                } else {
                    var21 += this.field854 - this.field862;
                }
                var22++;
            }
            this.field850 = this.field856.method2076(5123, this.field864.field3406, this.field864.field3389, false);
            this.field852 = this.field856.method2034(16, this.field865.field3406, this.field865.field3389, false);
            this.field858 = new class135(this.field856, this.field852, 5126, 3, 0);
            this.field859 = new class135(this.field856, this.field852, 5121, 4, 12);
        }
        this.field865 = null;
        this.field860 = null;
        this.field864 = null;
        this.field853 = this.field848 = this.field861 = (float[][]) null;
    }
}
