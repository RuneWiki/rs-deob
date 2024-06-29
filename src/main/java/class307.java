import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class307 extends class311 {

    @OriginalMember(owner = "client!ul", name = "C", descriptor = "Lmm;")
    private class357 field4175;

    @OriginalMember(owner = "client!ul", name = "A", descriptor = "Leb;")
    private class384 field4173;

    @OriginalMember(owner = "client!ul", name = "B", descriptor = "Lbn;")
    private class155 field4174;

    @OriginalMember(owner = "client!ul", name = "G", descriptor = "I")
    private int field4178;

    @OriginalMember(owner = "client!ul", name = "r", descriptor = "I")
    private int field4164;

    @OriginalMember(owner = "client!ul", name = "z", descriptor = "I")
    private int field4172;

    @OriginalMember(owner = "client!ul", name = "y", descriptor = "I")
    private int field4171;

    @OriginalMember(owner = "client!ul", name = "I", descriptor = "[[F")
    private float[][] field4180;

    @OriginalMember(owner = "client!ul", name = "q", descriptor = "[[F")
    private float[][] field4163;

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "[[F")
    private float[][] field4162;

    @OriginalMember(owner = "client!ul", name = "x", descriptor = "Ldc;")
    private class377 field4170;

    @OriginalMember(owner = "client!ul", name = "H", descriptor = "Lq;")
    private class205 field4179;

    @OriginalMember(owner = "client!ul", name = "E", descriptor = "Lvl;")
    private class376 field4177;

    @OriginalMember(owner = "client!ul", name = "v", descriptor = "Lvl;")
    private class376 field4168;

    @OriginalMember(owner = "client!ul", name = "D", descriptor = "Lrg;")
    private class366 field4176;

    @OriginalMember(owner = "client!ul", name = "w", descriptor = "Led;")
    private class299 field4169;

    @OriginalMember(owner = "client!ul", name = "u", descriptor = "Ltn;")
    private class109 field4167;

    @OriginalMember(owner = "client!ul", name = "s", descriptor = "I")
    private int field4165;

    @OriginalMember(owner = "client!ul", name = "t", descriptor = "I")
    private int field4166;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(II[[ZII)V", line = 7)
    public final void method1848(int arg0, int arg1, boolean[][] arg2, int arg3, int arg4) {
        if (this.field4170 == null) {
            return;
        }
        if (arg0 != 30463) {
            this.method1849((short) 115, 14);
        }
        if (arg3 + arg4 < this.field4178 || this.field4164 < arg4 - arg3 || this.field4172 > (arg1 + arg3) || (arg1 - arg3) > this.field4171) {
            return;
        }
        for (int var6 = this.field4172; var6 <= this.field4171; var6++) {
            for (int var7 = this.field4178; var7 <= this.field4164; var7++) {
                int var8 = var7 - arg4;
                int var9 = var6 - arg1;
                if (var8 > (-arg3) && var8 < arg3 && (-arg3) < var9 && var9 < arg3 && arg2[arg3 + var8][var9 + arg3]) {
                    this.field4175.method2170((int) (this.field4174.field2209 * 255.0F) << 24);
                    this.field4175.method2143(this.field4177, (class376) null, this.field4168, (class376) null);
                    this.field4175.method2176(this.field4170, 4, 0, this.field4166);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(SI)V", line = 67)
    private final void method1849(short arg0, int arg1) {
        if (this.field4175.field4829) {
            this.field4176.method2275(arg1 ^ 0x79, arg0);
        } else {
            this.field4176.method2271(-125, arg0);
        }
        if (arg1 == 1) {
            this.field4166++;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZIIIIII)V", line = 86)
    private final void method1850(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        long var8 = -1L;
        int var10 = (arg6 << this.field4173.field5282) + arg3;
        int var11 = (arg5 << this.field4173.field5282) + arg2;
        int var12 = this.field4173.method331(var10, var11);
        if ((arg3 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var8 = (long) var11 & 0xFFFFL << 16 | (long) var10 & 0xFFFFL;
            class311 var13 = this.field4167.method837((byte) -72, var8);
            if (var13 != null) {
                this.method1849(((class102) var13).field1410, 1);
                return;
            }
        }
        short var14 = (short) (this.field4165++);
        if (var8 != -1L) {
            this.field4167.method835(4, new class102(var14), var8);
        }
        float var15;
        float var16;
        float var17;
        if (arg3 == 0 && arg2 == 0) {
            var15 = this.field4163[arg4][arg1];
            var16 = this.field4162[arg4][arg1];
            var17 = this.field4180[arg4][arg1];
        } else if (this.field4173.field5285 == arg3 && arg2 == 0) {
            var16 = this.field4162[arg4 + 1][arg1];
            var17 = this.field4180[arg4 + 1][arg1];
            var15 = this.field4163[arg4 + 1][arg1];
        } else if (this.field4173.field5285 == arg3 && this.field4173.field5285 == arg2) {
            var15 = this.field4163[arg4 + 1][arg1 + 1];
            var16 = this.field4162[arg4 + 1][arg1 + 1];
            var17 = this.field4180[arg4 + 1][arg1 + 1];
        } else if (arg3 == 0 && this.field4173.field5285 == arg2) {
            var16 = this.field4162[arg4][arg1 + 1];
            var17 = this.field4180[arg4][arg1 + 1];
            var15 = this.field4163[arg4][arg1 + 1];
        } else {
            float var18 = (float) arg3 / (float) this.field4173.field5285;
            float var19 = (float) arg2 / (float) this.field4173.field5285;
            float var20 = this.field4163[arg4][arg1];
            float var21 = this.field4180[arg4][arg1];
            float var22 = this.field4162[arg4][arg1];
            float var23 = this.field4163[arg4 + 1][arg1];
            float var24 = this.field4180[arg4 + 1][arg1];
            float var25 = (this.field4180[arg4 + 1][arg1 + 1] - var24) * var18 + var24;
            float var26 = (this.field4163[arg4 + 1][arg1 + 1] - var23) * var18 + var23;
            float var27 = (this.field4180[arg4][arg1 + 1] - var21) * var18 + var21;
            float var28 = this.field4162[arg4 + 1][arg1];
            float var29 = (this.field4162[arg4][arg1 + 1] - var22) * var18 + var22;
            float var30 = (this.field4163[arg4][arg1 + 1] - var20) * var18 + var20;
            var15 = (var26 - var30) * var19 + var30;
            var17 = (var25 - var27) * var19 + var27;
            float var31 = (this.field4162[arg4 + 1][arg1 + 1] - var28) * var18 + var28;
            var16 = (var31 - var29) * var19 + var29;
        }
        float var32 = (float) (this.field4174.field2204 - var10);
        float var33 = (float) (this.field4174.field2205 - var12);
        float var34 = (float) (this.field4174.field2212 - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var32 * var36;
        float var38 = var34 * var36;
        float var39 = var33 * var36;
        float var40 = var35 / (float) this.field4174.field2206;
        float var41 = 1.0F - var40 * var40;
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
        int var44 = this.field4174.field2203;
        int var45 = (int) ((float) ((var44 & 0xFF3637) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFF5E) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (this.field4175.field4829) {
            this.field4169.method1823((byte) -111, (float) var10);
            this.field4169.method1823((byte) -98, (float) var12);
            this.field4169.method1823((byte) -95, (float) var11);
        } else {
            this.field4169.method1824((float) var10, 10330);
            this.field4169.method1824((float) var12, 10330);
            this.field4169.method1824((float) var11, 10330);
        }
        if (!arg0) {
            this.method1849((short) -112, 64);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        this.field4169.method2280(var45, 1537846408);
        this.field4169.method2280(var46, 1537846408);
        this.field4169.method2280(var47, 1537846408);
        this.field4169.method2280(255, 1537846408);
        this.method1849(var14, 1);
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lmm;Leb;Lbn;[I)V", line = 256)
    public class307(class357 arg0, class384 arg1, class155 arg2, int[] arg3) {
        this.field4175 = arg0;
        this.field4173 = arg1;
        this.field4174 = arg2;
        int var5 = this.field4174.field2206 - (arg1.field5285 >> 1);
        this.field4178 = this.field4174.field2204 - var5 >> arg1.field5282;
        this.field4164 = this.field4174.field2204 + var5 >> arg1.field5282;
        this.field4172 = this.field4174.field2212 - var5 >> arg1.field5282;
        this.field4171 = this.field4174.field2212 + var5 >> arg1.field5282;
        int var6 = this.field4164 + 1 - this.field4178;
        int var7 = this.field4171 + 1 - this.field4172;
        this.field4180 = new float[var6 + 1][var7 + 1];
        this.field4163 = new float[var6 + 1][var7 + 1];
        this.field4162 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var9 = var8 + this.field4172;
            if (var9 > 0 && (this.field4173.field4382 - 1) > var9) {
                for (int var10 = 0; var10 <= var6; var10++) {
                    int var11 = var10 + this.field4178;
                    if (var11 > 0 && this.field4173.field4384 - 1 > var11) {
                        int var12 = arg1.method329(var11 + 1, var9) - arg1.method329(var11 - 1, var9);
                        int var13 = arg1.method329(var11, var9 + 1) - arg1.method329(var11, var9 - 1);
                        float var14 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + var13 * var13 + 65536)));
                        this.field4163[var10][var8] = (float) var12 * var14;
                        this.field4180[var10][var8] = var14 * -256.0F;
                        this.field4162[var10][var8] = (float) var13 * var14;
                    }
                }
            }
        }
        int var15 = 0;
        int var16 = 0;
        for (int var17 = this.field4172; var17 <= this.field4171; var17++) {
            if (var17 >= 0 && arg1.field4382 > var17) {
                for (int var18 = this.field4178; var18 <= this.field4164; var18++) {
                    if (var18 >= 0 && arg1.field4384 > var18) {
                        int var19 = arg3[var16];
                        int[] var20 = arg1.field5288[var18][var17];
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
                var16 += this.field4164 - this.field4178;
            }
        }
        if (var15 <= 0) {
            this.field4170 = null;
            this.field4179 = null;
            this.field4177 = null;
            this.field4168 = null;
        } else {
            this.field4176 = new class366(var15 * 2);
            this.field4169 = new class299(var15 * 16);
            this.field4167 = new class109(class177.method1249((byte) -124, var15));
            int var21 = 0;
            int var22 = 0;
            for (int var23 = this.field4172; var23 <= this.field4171; var23++) {
                if (var23 >= 0 && var23 < arg1.field4382) {
                    int var24 = 0;
                    for (int var25 = this.field4178; var25 <= this.field4164; var25++) {
                        if (var25 >= 0 && arg1.field4384 > var25) {
                            int var26 = arg3[var21];
                            int[] var27 = arg1.field5288[var25][var23];
                            int[] var28 = arg1.field5283[var25][var23];
                            if (var27 != null && var26 != 0) {
                                if (var26 == 1) {
                                    for (int var29 = 0; var29 < var27.length; var29++) {
                                        this.method1850(true, var22, var28[var29], var27[var29], var24, var23, var25);
                                    }
                                } else if (var26 == 3) {
                                    this.method1850(true, var22, 0, 0, var24, var23, var25);
                                    this.method1850(true, var22, 0, arg1.field5285, var24, var23, var25);
                                    this.method1850(true, var22, arg1.field5285, 0, var24, var23, var25);
                                } else if (var26 == 2) {
                                    this.method1850(true, var22, 0, arg1.field5285, var24, var23, var25);
                                    this.method1850(true, var22, arg1.field5285, arg1.field5285, var24, var23, var25);
                                    this.method1850(true, var22, 0, 0, var24, var23, var25);
                                } else if (var26 == 5) {
                                    this.method1850(true, var22, arg1.field5285, arg1.field5285, var24, var23, var25);
                                    this.method1850(true, var22, arg1.field5285, 0, var24, var23, var25);
                                    this.method1850(true, var22, 0, arg1.field5285, var24, var23, var25);
                                } else if (var26 == 4) {
                                    this.method1850(true, var22, arg1.field5285, 0, var24, var23, var25);
                                    this.method1850(true, var22, 0, 0, var24, var23, var25);
                                    this.method1850(true, var22, arg1.field5285, arg1.field5285, var24, var23, var25);
                                }
                            }
                        }
                        var21++;
                        var24++;
                    }
                } else {
                    var21 += this.field4164 - this.field4178;
                }
                var22++;
            }
            this.field4170 = this.field4175.method2207(5123, this.field4176.field5076, this.field4176.field5048, false);
            this.field4179 = this.field4175.method2177(16, this.field4169.field5076, this.field4169.field5048, false);
            this.field4177 = new class376(this.field4175, this.field4179, 5126, 3, 0);
            this.field4168 = new class376(this.field4175, this.field4179, 5121, 4, 12);
        }
        this.field4167 = null;
        this.field4176 = null;
        this.field4163 = this.field4180 = this.field4162 = (float[][]) null;
        this.field4169 = null;
    }
}
