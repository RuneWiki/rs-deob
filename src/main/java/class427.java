import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class427 extends class387 {

    @OriginalMember(owner = "client!nk", name = "I", descriptor = "Lpt;")
    public class441 field5907;

    @OriginalMember(owner = "client!nk", name = "E", descriptor = "S")
    private short field5903;

    @OriginalMember(owner = "client!nk", name = "F", descriptor = "S")
    private short field5904;

    @OriginalMember(owner = "client!nk", name = "J", descriptor = "S")
    private short field5908;

    @OriginalMember(owner = "client!nk", name = "H", descriptor = "S")
    private short field5906;

    @OriginalMember(owner = "client!nk", name = "G", descriptor = "S")
    private short field5905;

    @OriginalMember(owner = "client!nk", name = "D", descriptor = "I")
    private int field5902;

    @OriginalMember(owner = "client!nk", name = "L", descriptor = "I")
    private int field5910;

    @OriginalMember(owner = "client!nk", name = "K", descriptor = "S")
    private short field5909;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lpt;IIIIIIIIIIIZZ)V")
    public final void method2597(class441 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field5907 = arg0;
        super.field5402 = arg1 << 12;
        super.field5411 = arg2 << 12;
        super.field5404 = arg3 << 12;
        super.field5407 = arg9;
        this.field5904 = this.field5903 = (short) arg8;
        super.field5406 = arg10;
        super.field5401 = arg11;
        super.field5410 = arg13;
        this.field5908 = (short) arg4;
        this.field5906 = (short) arg5;
        this.field5905 = (short) arg6;
        this.field5902 = arg7;
        super.field5408 = this.field5907.field6053.field793;
        this.method2601();
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lha;J)V")
    public final void method2598(class545 arg0, long arg1) {
        int var4 = super.field5402 >> class509.field7106 + 12;
        int var5 = super.field5404 >> class509.field7106 + 12;
        int var6 = super.field5411 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class485.field6556 && var5 >= 0 && var5 < class314.field4059) {
            class198 var7 = this.field5907.field6042;
            class160 var8 = this.field5907.field6039;
            class339[] var9 = class52.field741;
            int var10 = var7.field2873;
            class38 var11 = class352.field4549[var7.field2873][var4][var5];
            if (var11 != null) {
                var10 = var11.field535;
            }
            int var12 = var9[var10].method1959(123, var5, var4);
            int var13;
            if (var10 < class214.field3021 - 1) {
                var13 = var9[var10 + 1].method1959(127, var5, var4);
            } else {
                var13 = var12 - (8 << class509.field7106);
            }
            if (var8.field2179) {
                if (var8.field2211 == -1 && var6 > var12) {
                    this.method2600();
                    return;
                }
                if (var8.field2211 >= 0 && var6 > var9[var8.field2211].method1959(123, var5, var4)) {
                    this.method2600();
                    return;
                }
                if (var8.field2217 == -1 && var6 < var13) {
                    this.method2600();
                    return;
                }
                if (var8.field2217 >= 0 && var6 < var9[var8.field2217 + 1].method1959(125, var5, var4)) {
                    this.method2600();
                    return;
                }
            }
            int var14;
            for (var14 = class214.field3021 - 1; var14 > 0 && var6 > var9[var14].method1959(125, var5, var4); --var14) {
            }
            if (var8.field2151 && var14 == 0 && var6 > var9[0].method1959(125, var5, var4)) {
                this.method2600();
            } else if (class214.field3021 - 1 == var14 && var9[var14].method1959(127, var5, var4) - var6 > 8 << class509.field7106) {
                this.method2600();
            } else {
                class38 var15 = class352.field4549[var14][var4][var5];
                if (var15 == null) {
                    if (var14 == 0 || class352.field4549[0][var4][var5] == null) {
                        var15 = class352.field4549[0][var4][var5] = new class38(0);
                    }
                    boolean var16 = class352.field4549[0][var4][var5].field531 != null;
                    if (var14 == 3 && var16) {
                        this.method2600();
                        return;
                    }
                    for (int var17 = 1; var17 <= var14; ++var17) {
                        if (class352.field4549[var17][var4][var5] == null) {
                            var15 = class352.field4549[var17][var4][var5] = new class38(var17);
                            if (var16) {
                                ++var15.field535;
                            }
                        }
                    }
                }
                if (var8.field2155) {
                    int var18 = super.field5402 >> 12;
                    int var19 = super.field5404 >> 12;
                    if (var15.field539 != null) {
                        class551 var20 = var15.field539.method274(0, arg0);
                        if (var20 != null && var20.method3293(var18, -28467, var6, var19)) {
                            this.method2600();
                            return;
                        }
                    }
                    if (var15.field540 != null) {
                        class551 var21 = var15.field540.method274(0, arg0);
                        if (var21 != null && var21.method3293(var18, -28467, var6, var19)) {
                            this.method2600();
                            return;
                        }
                    }
                    if (var15.field532 != null) {
                        class551 var22 = var15.field532.method274(0, arg0);
                        if (var22 != null && var22.method3293(var18, -28467, var6, var19)) {
                            this.method2600();
                            return;
                        }
                    }
                    for (class590 var23 = var15.field538; var23 != null; var23 = var23.field8467) {
                        class551 var24 = var23.field8468.method274(0, arg0);
                        if (var24 != null && var24.method3293(var18, -28467, var6, var19)) {
                            this.method2600();
                            return;
                        }
                    }
                }
                var7.field2875.field4410.method2959(-111, this);
            }
        } else {
            this.method2600();
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(JI)V")
    public final void method2599(long arg0, int arg1) {
        this.field5903 = (short) (this.field5903 - arg1);
        if (this.field5903 <= 0) {
            this.method2600();
        } else {
            int var4 = super.field5402 >> 12;
            int var5 = super.field5411 >> 12;
            int var6 = super.field5404 >> 12;
            class198 var7 = this.field5907.field6042;
            class160 var8 = this.field5907.field6039;
            if (var8.field2166 != 0) {
                if (this.field5904 - this.field5903 <= var8.field2205) {
                    int var9 = var8.field2193 * arg1 + (this.field5910 >> 16 & 255) + (super.field5407 >> 8 & 65280);
                    int var10 = var8.field2169 * arg1 + (this.field5910 >> 8 & 255) + (super.field5407 & 65280);
                    int var11 = var8.field2159 * arg1 + (super.field5407 << 8 & 65280) + (this.field5910 & 255);
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > 65535) {
                        var9 = 65535;
                    }
                    if (var10 < 0) {
                        var10 = 0;
                    } else if (var10 > 65535) {
                        var10 = 65535;
                    }
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 65535) {
                        var11 = 65535;
                    }
                    super.field5407 &= -16777216;
                    super.field5407 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field5910 &= -16777216;
                    this.field5910 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field5904 - this.field5903 <= var8.field2178) {
                    int var12 = var8.field2186 * arg1 + (this.field5910 >> 24 & 255) + (super.field5407 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field5407 &= 16777215;
                    super.field5407 |= (var12 & 65280) << 16;
                    this.field5910 &= 16777215;
                    this.field5910 |= (var12 & 255) << 24;
                }
            }
            if (var8.field2180 != -1 && this.field5904 - this.field5903 <= var8.field2154) {
                this.field5902 += var8.field2213 * arg1;
            }
            if (var8.field2176 != -1 && this.field5904 - this.field5903 <= var8.field2212) {
                super.field5406 += var8.field2182 * arg1;
            }
            double var13 = (double) this.field5908;
            double var15 = (double) this.field5906;
            double var17 = (double) this.field5905;
            boolean var19 = false;
            if (var8.field2183 == 1) {
                int var20 = var4 - this.field5907.field6046.field4322;
                int var21 = var5 - this.field5907.field6046.field4323;
                int var22 = var6 - this.field5907.field6046.field4324;
                int var23 = (int) Math.sqrt((double) (var22 * var22 + var20 * var20 + var21 * var21)) >> 2;
                long var24 = (long) (var8.field2199 * var23 * arg1);
                this.field5902 = (int) ((long) this.field5902 - ((long) this.field5902 * var24 >> 18));
            } else if (var8.field2183 == 2) {
                int var26 = var4 - this.field5907.field6046.field4322;
                int var27 = var5 - this.field5907.field6046.field4323;
                int var28 = var6 - this.field5907.field6046.field4324;
                int var29 = var28 * var28 + var26 * var26 + var27 * var27;
                long var30 = (long) (var8.field2199 * var29 * arg1);
                this.field5902 = (int) ((long) this.field5902 - ((long) this.field5902 * var30 >> 28));
            }
            if (var8.field2168 != null) {
                class513 var32 = var7.field2870.field7324;
                for (class513 var33 = var32.field7165; var32 != var33; var33 = var33.field7165) {
                    class196 var34 = (class196) var33;
                    class451 var35 = var34.field2828;
                    if (var35.field6209 != 1) {
                        boolean var36 = false;
                        for (int var37 = 0; var37 < var8.field2168.length; ++var37) {
                            if (var8.field2168[var37] == var35.field6207) {
                                var36 = true;
                                break;
                            }
                        }
                        if (var36) {
                            double var38 = (double) (var4 - var34.field2830);
                            double var40 = (double) (var5 - var34.field2833);
                            double var42 = (double) (var6 - var34.field2825);
                            double var44 = var42 * var42 + var38 * var38 + var40 * var40;
                            if (!(var44 > (double) var35.field6214)) {
                                double var46 = Math.sqrt(var44);
                                if (var46 == 0.0D) {
                                    var46 = 1.0D;
                                }
                                double var48 = ((double) var34.field2834 * var42 + (double) var34.field2826 * var38 + (double) var35.field6213 * var40) * 65535.0D / ((double) var35.field6204 * var46);
                                if (!(var48 < (double) var35.field6202)) {
                                    double var50 = 0.0D;
                                    if (var35.field6212 == 1) {
                                        var50 = var46 / 16.0D * (double) var35.field6205;
                                    } else if (var35.field6212 == 2) {
                                        var50 = var46 / 16.0D * (var46 / 16.0D) * (double) var35.field6205;
                                    }
                                    if (var35.field6198 == 0) {
                                        if (var35.field6199 == 0) {
                                            var13 += ((double) var34.field2826 - var50) * (double) arg1;
                                            var15 += ((double) var35.field6213 - var50) * (double) arg1;
                                            var17 += ((double) var34.field2834 - var50) * (double) arg1;
                                            var19 = true;
                                        } else {
                                            super.field5402 = (int) ((double) super.field5402 + ((double) var34.field2826 - var50) * (double) arg1);
                                            super.field5411 = (int) ((double) super.field5411 + ((double) var35.field6213 - var50) * (double) arg1);
                                            super.field5404 = (int) ((double) super.field5404 + ((double) var34.field2834 - var50) * (double) arg1);
                                        }
                                    } else {
                                        double var52 = var38 / var46 * (double) var35.field6204;
                                        double var54 = var40 / var46 * (double) var35.field6204;
                                        double var56 = var42 / var46 * (double) var35.field6204;
                                        if (var35.field6199 == 0) {
                                            var13 += (double) arg1 * var52;
                                            var15 += (double) arg1 * var54;
                                            var17 += (double) arg1 * var56;
                                            var19 = true;
                                        } else {
                                            super.field5402 = (int) ((double) super.field5402 + (double) arg1 * var52);
                                            super.field5411 = (int) ((double) super.field5411 + (double) arg1 * var54);
                                            super.field5404 = (int) ((double) super.field5404 + (double) arg1 * var56);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field2194 != null) {
                for (int var58 = 0; var58 < var8.field2194.length; ++var58) {
                    class196 var59 = (class196) class651.field9207.method1435(4741, (long) var8.field2194[var58]);
                    while (var59 != null) {
                        class451 var60 = var59.field2828;
                        double var61 = (double) (var4 - var59.field2830);
                        double var63 = (double) (var5 - var59.field2833);
                        double var65 = (double) (var6 - var59.field2825);
                        double var67 = var65 * var65 + var61 * var61 + var63 * var63;
                        if (var67 > (double) var60.field6214) {
                            var59 = (class196) class651.field9207.method1444(-1);
                        } else {
                            double var69 = Math.sqrt(var67);
                            if (var69 == 0.0D) {
                                var69 = 1.0D;
                            }
                            double var71 = ((double) var59.field2834 * var65 + (double) var59.field2826 * var61 + (double) var60.field6213 * var63) * 65535.0D / ((double) var60.field6204 * var69);
                            if (var71 < (double) var60.field6202) {
                                var59 = (class196) class651.field9207.method1444(-1);
                            } else {
                                double var73 = 0.0D;
                                if (var60.field6212 == 1) {
                                    var73 = var69 / 16.0D * (double) var60.field6205;
                                } else if (var60.field6212 == 2) {
                                    var73 = var69 / 16.0D * (var69 / 16.0D) * (double) var60.field6205;
                                }
                                if (var60.field6198 == 0) {
                                    if (var60.field6199 == 0) {
                                        var13 += ((double) var59.field2826 - var73) * (double) arg1;
                                        var15 += ((double) var60.field6213 - var73) * (double) arg1;
                                        var17 += ((double) var59.field2834 - var73) * (double) arg1;
                                        var19 = true;
                                    } else {
                                        super.field5402 = (int) ((double) super.field5402 + ((double) var59.field2826 - var73) * (double) arg1);
                                        super.field5411 = (int) ((double) super.field5411 + ((double) var60.field6213 - var73) * (double) arg1);
                                        super.field5404 = (int) ((double) super.field5404 + ((double) var59.field2834 - var73) * (double) arg1);
                                    }
                                } else {
                                    double var75 = var61 / var69 * (double) var60.field6204;
                                    double var77 = var63 / var69 * (double) var60.field6204;
                                    double var79 = var65 / var69 * (double) var60.field6204;
                                    if (var60.field6199 == 0) {
                                        var13 += (double) arg1 * var75;
                                        var15 += (double) arg1 * var77;
                                        var17 += (double) arg1 * var79;
                                        var19 = true;
                                    } else {
                                        super.field5402 = (int) ((double) super.field5402 + (double) arg1 * var75);
                                        super.field5411 = (int) ((double) super.field5411 + (double) arg1 * var77);
                                        super.field5404 = (int) ((double) super.field5404 + (double) arg1 * var79);
                                    }
                                }
                                var59 = (class196) class651.field9207.method1444(-1);
                            }
                        }
                    }
                }
            }
            if (var8.field2204 != null) {
                if (var8.field2207 == null) {
                    var8.field2207 = new int[var8.field2204.length];
                    for (int var81 = 0; var81 < var8.field2204.length; ++var81) {
                        class94.method645(-1, var8.field2204[var81]);
                        var8.field2207[var81] = ((class285) class175.field2386.method1381(true, (long) var8.field2204[var81])).field3770;
                    }
                }
                for (int var82 = 0; var82 < var8.field2207.length; ++var82) {
                    class451 var83 = class76.field1046[var8.field2207[var82]];
                    if (var83.field6199 == 0) {
                        var13 += (double) (var83.field6195 * arg1);
                        var15 += (double) (var83.field6213 * arg1);
                        var17 += (double) (var83.field6200 * arg1);
                        var19 = true;
                    } else {
                        super.field5402 += var83.field6195 * arg1;
                        super.field5411 += var83.field6213 * arg1;
                        super.field5404 += var83.field6200 * arg1;
                    }
                }
            }
            if (var19) {
                while (true) {
                    if (!(var13 > 32767.0D) && !(var15 > 32767.0D) && !(var17 > 32767.0D) && !(var13 < -32767.0D) && !(var15 < -32767.0D) && !(var17 < -32767.0D)) {
                        this.field5908 = (short) ((int) var13);
                        this.field5906 = (short) ((int) var15);
                        this.field5905 = (short) ((int) var17);
                        break;
                    }
                    var13 /= 2.0D;
                    var15 /= 2.0D;
                    var17 /= 2.0D;
                    this.field5902 <<= 1;
                }
            }
            super.field5402 = (int) ((long) super.field5402 + ((long) (this.field5902 << 2) * (long) this.field5908 >> 23) * (long) arg1);
            super.field5411 = (int) ((long) super.field5411 + ((long) (this.field5902 << 2) * (long) this.field5906 >> 23) * (long) arg1);
            super.field5404 = (int) ((long) super.field5404 + ((long) (this.field5902 << 2) * (long) this.field5905 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "()V")
    public final void method2600() {
        this.field5907.field6042.field2862[this.field5909] = null;
        class231.field3213[class602.field8616] = this;
        class602.field8616 = class602.field8616 + 1 & 1023;
        this.method1(81);
        this.method2784(1670470983);
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "()V")
    private final void method2601() {
        int var1 = this.field5907.field6042.field2864;
        if (this.field5907.field6042.field2862[var1] != null) {
            this.field5907.field6042.field2862[var1].method2600();
        }
        this.field5907.field6042.field2862[var1] = this;
        this.field5909 = (short) this.field5907.field6042.field2864;
        this.field5907.field6042.field2864 = var1 + 1 & 8191;
        this.field5907.field6044.method1946(-110, this);
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lpt;IIIIIIIIIIIZZ)V")
    public class427(class441 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field5907 = arg0;
        super.field5402 = arg1 << 12;
        super.field5411 = arg2 << 12;
        super.field5404 = arg3 << 12;
        super.field5407 = arg9;
        this.field5904 = this.field5903 = (short) arg8;
        super.field5406 = arg10;
        super.field5401 = arg11;
        super.field5410 = arg13;
        this.field5908 = (short) arg4;
        this.field5906 = (short) arg5;
        this.field5905 = (short) arg6;
        this.field5902 = arg7;
        super.field5408 = this.field5907.field6053.field793;
        this.method2601();
    }
}
