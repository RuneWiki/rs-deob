import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class360 extends class220 {

    @OriginalMember(owner = "client!ho", name = "R", descriptor = "I")
    public int field5263 = 4;

    @OriginalMember(owner = "client!ho", name = "Z", descriptor = "[B")
    private byte[] field5270 = new byte[512];

    @OriginalMember(owner = "client!ho", name = "db", descriptor = "I")
    public int field5274 = 4;

    @OriginalMember(owner = "client!ho", name = "ab", descriptor = "I")
    public int field5271 = 4;

    @OriginalMember(owner = "client!ho", name = "eb", descriptor = "I")
    public int field5275 = 1638;

    @OriginalMember(owner = "client!ho", name = "hb", descriptor = "I")
    public int field5278 = 0;

    @OriginalMember(owner = "client!ho", name = "Q", descriptor = "Z")
    public boolean field5262 = true;

    @OriginalMember(owner = "client!ho", name = "jb", descriptor = "Lwe;")
    public static class24 field5280 = new class24(64);

    @OriginalMember(owner = "client!ho", name = "lb", descriptor = "I")
    public static int field5282 = 0;

    @OriginalMember(owner = "client!ho", name = "mb", descriptor = "S")
    public static short field5283 = 1;

    @OriginalMember(owner = "client!ho", name = "S", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!ho", name = "T", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!ho", name = "U", descriptor = "I")
    public static int field5266;

    @OriginalMember(owner = "client!ho", name = "V", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!ho", name = "X", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!ho", name = "Y", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!ho", name = "bb", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!ho", name = "cb", descriptor = "I")
    public static int field5273;

    @OriginalMember(owner = "client!ho", name = "fb", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!ho", name = "ib", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!ho", name = "kb", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!ho", name = "P", descriptor = "[S")
    private short[] field5261;

    @OriginalMember(owner = "client!ho", name = "gb", descriptor = "[S")
    private short[] field5277;

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "(I)V")
    public final void method440(int arg0) {
        this.field5270 = class7.method58(false, this.field5278);
        if (arg0 != 0) {
            field5280 = null;
        }
        ++field5281;
        this.method2363((byte) 101);
        for (int var2 = this.field5271 + -1; var2 >= 1; --var2) {
            short var3 = this.field5261[var2];
            if (~var3 < -9) {
                return;
            }
            if (~var3 > 7) {
                return;
            }
            --this.field5271;
        }
    }

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        ++field5267;
        int[] var3 = super.field3125.method2005(arg1, (byte) -100);
        if (arg0 != -11543) {
            method2367((class433) null, true);
        }
        if (super.field3125.field4676) {
            this.method2365(6967, var3, arg1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "(B)V")
    public static final void method2362(byte arg0) {
        class411 var1 = class310.field4436;
        synchronized (class310.field4436) {
            class318.field4544 = class284.field4149;
            ++class368.field5476;
            if (class37.field603 >= 0) {
                while (~class37.field603 != ~class122.field1625) {
                    int var2 = class271.field3972[class122.field1625];
                    class122.field1625 = class122.field1625 + 1 & 127;
                    if (var2 < 0) {
                        class1.field5[~var2] = false;
                    } else {
                        class1.field5[var2] = true;
                    }
                }
            } else {
                for (int var3 = 0; ~var3 > -113; ++var3) {
                    class1.field5[var3] = false;
                }
                class37.field603 = class122.field1625;
            }
            class284.field4149 = class411.field6143;
            if (arg0 != -75) {
                method2366((byte) 124);
            }
        }
        ++field5268;
    }

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "(B)V")
    private final void method2363(byte arg0) {
        int var2 = -32 % ((17 - arg0) / 54);
        if (this.field5275 <= 0) {
            if (this.field5261 != null && this.field5261.length == this.field5271) {
                this.field5277 = new short[this.field5271];
                for (int var3 = 0; ~var3 > ~this.field5271; ++var3) {
                    this.field5277[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
                }
            }
        } else {
            this.field5261 = new short[this.field5271];
            this.field5277 = new short[this.field5271];
            for (int var4 = 0; ~var4 > ~this.field5271; ++var4) {
                this.field5261[var4] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field5275 / 4096.0F), (double) var4)));
                this.field5277[var4] = (short) ((int) Math.pow(2.0D, (double) var4));
            }
        }
        ++field5266;
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "()V")
    public class360() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IBLil;)V")
    public final void method2(int arg0, byte arg1, class265 arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (~arg0 == -7) {
                                    this.field5263 = arg2.method1697(126);
                                }
                            } else {
                                this.field5274 = arg2.method1697(93);
                            }
                        } else {
                            this.field5278 = arg2.method1697(-115);
                        }
                    } else {
                        this.field5274 = this.field5263 = arg2.method1697(arg1 + 151);
                    }
                } else {
                    this.field5275 = arg2.method1698(1625554944);
                    if (this.field5275 < 0) {
                        this.field5261 = new short[this.field5271];
                        for (int var5 = 0; ~this.field5271 < ~var5; ++var5) {
                            this.field5261[var5] = (short) arg2.method1698(1625554944);
                        }
                    }
                }
            } else {
                this.field5271 = arg2.method1697(62);
            }
        } else {
            this.field5262 = ~arg2.method1697(-32) == -2;
        }
        ++field5265;
        if (arg1 != -49) {
            method2362((byte) -99);
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lro;B)Ljava/lang/String;")
    public static final String method2364(class249 arg0, byte arg1) {
        ++field5276;
        if (arg1 != 90) {
            return null;
        } else if (client.method1572(arg0).method1149((byte) 122) == 0) {
            return null;
        } else if (arg0.field3630 != null && ~arg0.field3630.trim().length() != -1) {
            return arg0.field3630;
        } else {
            return class381.field5720 ? "Hidden-use" : null;
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I[II)V")
    public final void method2365(int arg0, int[] arg1, int arg2) {
        ++field5273;
        int var4 = class58.field831[arg2] * this.field5263;
        if (this.field5271 != 1) {
            short var5 = this.field5261[0];
            if (var5 > 8 || ~var5 > 7) {
                int var6 = this.field5277[0] << 12;
                int var7 = this.field5274 * var6 >> 12;
                int var8 = this.field5263 * var6 >> 12;
                int var9 = var4 * var6 >> 12;
                int var10 = var9 >> 12;
                int var11 = var10 - -1;
                if (var8 <= var11) {
                    var11 = 0;
                }
                int var12 = var9 & 4095;
                int var13 = 255 & this.field5270[255 & var11];
                int var14 = this.field5270[255 & var10] & 255;
                int var15 = class276.field4044[var12];
                for (int var16 = 0; var16 < class344.field5043; ++var16) {
                    int var36 = class160.field2096[var16] * this.field5274;
                    int var37 = this.method2368(var12, var6 * var36 >> 12, (byte) -102, var7, var15, var14, var13);
                    arg1[var16] = var5 * var37 >> 12;
                }
            }
            for (int var17 = 1; this.field5271 > var17; ++var17) {
                short var18 = this.field5261[var17];
                if (~var18 < -9 || ~var18 > 7) {
                    int var19 = this.field5277[var17] << 12;
                    int var20 = var4 * var19 >> 12;
                    int var21 = this.field5274 * var19 >> 12;
                    int var22 = this.field5263 * var19 >> 12;
                    int var23 = var20 >> 12;
                    int var24 = var23 + 1;
                    if (~var22 >= ~var24) {
                        var24 = 0;
                    }
                    int var25 = var20 & 4095;
                    int var26 = class276.field4044[var25];
                    int var27 = 255 & this.field5270[var23 & 255];
                    int var28 = this.field5270[255 & var24] & 255;
                    if (this.field5262 && ~(this.field5271 + -1) == ~var17) {
                        for (int var29 = 0; var29 < class344.field5043; ++var29) {
                            int var30 = class160.field2096[var29] * this.field5274;
                            int var31 = this.method2368(var25, var19 * var30 >> 12, (byte) -102, var21, var26, var27, var28);
                            int var32 = arg1[var29] - -(var18 * var31 >> 12);
                            arg1[var29] = (var32 >> 1) + 2048;
                        }
                    } else {
                        for (int var33 = 0; ~var33 > ~class344.field5043; ++var33) {
                            int var34 = class160.field2096[var33] * this.field5274;
                            int var35 = this.method2368(var25, var19 * var34 >> 12, (byte) -102, var21, var26, var27, var28);
                            arg1[var33] += var18 * var35 >> 12;
                        }
                    }
                }
            }
        } else {
            short var38 = this.field5261[0];
            int var39 = this.field5277[0] << 12;
            int var40 = var4 * var39 >> 12;
            int var41 = this.field5263 * var39 >> 12;
            int var42 = this.field5274 * var39 >> 12;
            int var43 = var40 >> 12;
            int var44 = var43 + 1;
            if (var44 >= var41) {
                var44 = 0;
            }
            int var45 = var40 & 4095;
            int var46 = this.field5270[255 & var43] & 255;
            int var47 = class276.field4044[var45];
            int var48 = 255 & this.field5270[var44 & 255];
            if (this.field5262) {
                for (int var49 = 0; class344.field5043 > var49; ++var49) {
                    int var50 = class160.field2096[var49] * this.field5274;
                    int var51 = this.method2368(var45, var39 * var50 >> 12, (byte) -102, var42, var47, var46, var48);
                    int var52 = var38 * var51 >> 12;
                    arg1[var49] = 2048 - -(var52 >> 1);
                }
            } else {
                for (int var53 = 0; ~class344.field5043 < ~var53; ++var53) {
                    int var54 = class160.field2096[var53] * this.field5274;
                    int var55 = this.method2368(var45, var39 * var54 >> 12, (byte) -102, var42, var47, var46, var48);
                    arg1[var53] = var38 * var55 >> 12;
                }
            }
        }
        if (arg0 != 6967) {
            this.method2363((byte) 120);
        }
    }

    @OriginalMember(owner = "client!ho", name = "h", descriptor = "(B)V")
    public static void method2366(byte arg0) {
        if (arg0 == 112) {
            field5280 = null;
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lg;Z)V")
    public static final void method2367(class433 arg0, boolean arg1) {
        ++field5264;
        arg0.field6384 = null;
        int var2 = arg0.field6381.length;
        if (arg1) {
            for (int var3 = 0; var3 < var2; ++var3) {
                arg0.field6381[var3].field2970 = false;
            }
            class146[] var4 = class308.field4401;
            synchronized (class308.field4401) {
                if (~var2 > ~class308.field4401.length && class151.field1980[var2] < 200) {
                    class308.field4401[var2].method974(arg0, (byte) -121);
                    int var10002 = class151.field1980[var2]++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIBIIII)I")
    private final int method2368(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field5272;
        int var8 = arg1 >> 12;
        int var9 = var8 + 1;
        if (~var9 <= ~arg3) {
            var9 = 0;
        }
        int var10 = var8 & 255;
        int var11 = arg1 & 4095;
        int var12 = arg0 + -4096;
        int var13 = var9 & 255;
        int var14 = var11 + -4096;
        int var15 = class276.field4044[var11];
        int var16 = this.field5270[var10 - -arg5] & 3;
        int var17;
        if (var16 <= 1) {
            var17 = var16 == 0 ? arg0 + var11 : -var11 + arg0;
        } else {
            var17 = ~var16 != -3 ? -arg0 + -var11 : var11 - arg0;
        }
        if (arg2 != -102) {
            this.field5278 = -90;
        }
        int var18 = 3 & this.field5270[arg5 + var13];
        int var19;
        if (~var18 < -2) {
            var19 = var18 == 2 ? -arg0 + var14 : -arg0 + -var14;
        } else {
            var19 = var18 != 0 ? arg0 - var14 : arg0 + var14;
        }
        int var20 = ((-var17 + var19) * var15 >> 12) + var17;
        int var21 = this.field5270[var10 - -arg6] & 3;
        int var22;
        if (~var21 < -2) {
            var22 = ~var21 == -3 ? -var12 + var11 : -var11 + -var12;
        } else {
            var22 = ~var21 != -1 ? -var11 + var12 : var11 + var12;
        }
        int var23 = 3 & this.field5270[arg6 + var13];
        int var24;
        if (~var23 < -2) {
            var24 = var23 == 2 ? -var12 + var14 : -var12 + -var14;
        } else {
            var24 = var23 != 0 ? var12 - var14 : var12 + var14;
        }
        int var25 = ((-var22 + var24) * var15 >> 12) + var22;
        return ((-var20 + var25) * arg4 >> 12) + var20;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIII)V")
    public static final void method2369(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5279;
        int var6 = 0;
        int var7 = arg3;
        int var8 = arg1 * arg1;
        int var9 = arg3 * arg3;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg3 << 1;
        int var13 = (1 - var12) * var8 - -var10;
        int var14 = var9 - (var12 + -1) * var11;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        if (arg2 != 4096) {
            field5282 = 65;
        }
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg3 << 1) + -3) * var11;
        int var19 = (var6 - -1) * var16;
        class370.method2440(arg0 + arg1, class227.field3201[arg5], arg4, -arg1 + arg0, 122);
        int var20 = (arg3 + -1) * var15;
        while (~var7 < -1) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var17 += var16;
                    var19 += var16;
                    ++var6;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var19 += var16;
                var17 += var16;
                ++var6;
            }
            var14 += -var18;
            var13 += -var20;
            --var7;
            var18 -= var15;
            var20 -= var15;
            int var21 = -var7 + arg5;
            int var22 = arg5 + var7;
            int var23 = arg0 + var6;
            int var24 = -var6 + arg0;
            class370.method2440(var23, class227.field3201[var21], arg4, var24, arg2 + -3982);
            class370.method2440(var23, class227.field3201[var22], arg4, var24, arg2 + -4032);
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIBIIII)V")
    public static final void method2370(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field5269;
        int var8 = 0;
        int var9 = arg7;
        int var10 = 0;
        int var11 = -arg2 + arg6;
        int var12 = arg7 - arg2;
        int var13 = arg6 * arg6;
        int var14 = arg7 * arg7;
        if (arg3 != 96) {
            field5280 = null;
        }
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg7 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = -((var21 + -1) * var18) + var14;
        int var25 = (1 - var22) * var15 + var19;
        int var26 = -((var22 + -1) * var20) + var16;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 + -3) * var20;
        int var35 = var28;
        int var36 = (arg7 + -1) * var27;
        int var37 = var30;
        if (arg4 >= class180.field2375 && arg4 <= class50.field695) {
            int[] var38 = class227.field3201[arg4];
            int var39 = class143.method950(-15543, class297.field4268, class203.field2942, -arg6 + arg5);
            int var40 = class143.method950(-15543, class297.field4268, class203.field2942, arg5 + arg6);
            int var41 = class143.method950(arg3 ^ -15575, class297.field4268, class203.field2942, -var11 + arg5);
            int var42 = class143.method950(-15543, class297.field4268, class203.field2942, arg5 + var11);
            class370.method2440(var41, var38, arg0, var39, 90);
            class370.method2440(var42, var38, arg1, var41, 102);
            class370.method2440(var40, var38, arg0, var42, 67);
        }
        int var43 = (var12 - 1) * var29;
        while (var9 > 0) {
            boolean var44 = var12 >= var9;
            if (~var23 > -1) {
                while (~var23 > -1) {
                    var23 += var31;
                    var24 += var35;
                    ++var8;
                    var35 += var28;
                    var31 += var28;
                }
            }
            if (var44) {
                if (~var25 > -1) {
                    while (~var25 > -1) {
                        var25 += var33;
                        var26 += var37;
                        var37 += var30;
                        ++var10;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    ++var10;
                    var33 += var30;
                    var37 += var30;
                }
                var25 += -var43;
                var26 += -var34;
                var43 -= var29;
                var34 -= var29;
            }
            if (~var24 > -1) {
                var24 += var35;
                var23 += var31;
                var35 += var28;
                var31 += var28;
                ++var8;
            }
            var24 += -var32;
            var23 += -var36;
            var32 -= var27;
            --var9;
            var36 -= var27;
            int var45 = -var9 + arg4;
            int var46 = arg4 - -var9;
            if (~class180.field2375 >= ~var46 && ~var45 >= ~class50.field695) {
                int var47 = class143.method950(arg3 + -15639, class297.field4268, class203.field2942, arg5 + var8);
                int var48 = class143.method950(-15543, class297.field4268, class203.field2942, -var8 + arg5);
                if (var44) {
                    int var49 = class143.method950(-15543, class297.field4268, class203.field2942, arg5 + var10);
                    int var50 = class143.method950(-15543, class297.field4268, class203.field2942, -var10 + arg5);
                    if (var45 >= class180.field2375) {
                        int[] var51 = class227.field3201[var45];
                        class370.method2440(var50, var51, arg0, var48, 94);
                        class370.method2440(var49, var51, arg1, var50, 95);
                        class370.method2440(var47, var51, arg0, var49, 84);
                    }
                    if (~var46 >= ~class50.field695) {
                        int[] var52 = class227.field3201[var46];
                        class370.method2440(var50, var52, arg0, var48, 123);
                        class370.method2440(var49, var52, arg1, var50, 117);
                        class370.method2440(var47, var52, arg0, var49, 107);
                    }
                } else {
                    if (~class180.field2375 >= ~var45) {
                        class370.method2440(var47, class227.field3201[var45], arg0, var48, arg3 ^ 47);
                    }
                    if (class50.field695 >= var46) {
                        class370.method2440(var47, class227.field3201[var46], arg0, var48, 90);
                    }
                }
            }
        }
    }
}
