import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class150 extends class526 {

    @OriginalMember(owner = "client!be", name = "O", descriptor = "Lh;")
    private class377 field2317;

    @OriginalMember(owner = "client!be", name = "I", descriptor = "S")
    private short field2311;

    @OriginalMember(owner = "client!be", name = "M", descriptor = "S")
    private short field2315;

    @OriginalMember(owner = "client!be", name = "K", descriptor = "S")
    private short field2313;

    @OriginalMember(owner = "client!be", name = "N", descriptor = "S")
    private short field2316;

    @OriginalMember(owner = "client!be", name = "G", descriptor = "S")
    private short field2309;

    @OriginalMember(owner = "client!be", name = "L", descriptor = "I")
    private int field2314;

    @OriginalMember(owner = "client!be", name = "J", descriptor = "I")
    private int field2312;

    @OriginalMember(owner = "client!be", name = "H", descriptor = "S")
    private short field2310;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(J)V", line = 8)
    public final void method1086(long arg0) {
        int var3 = super.field7678 >> class295.field3991 + 12;
        int var4 = super.field7682 >> class295.field3991 + 12;
        int var5 = super.field7679 >> 12;
        if (var5 <= 0 && var5 >= -262144 && var3 >= 0 && var3 < class124.field1916 && var4 >= 0 && var4 < class177.field2664) {
            class471 var6 = this.field2317.field5437;
            class529 var7 = this.field2317.field5429;
            class11[] var8 = class492.field7122;
            int var9 = var8[var6.field6793].method85(var3, var4);
            int var10;
            if (var6.field6793 < class265.field3571 - 1) {
                var10 = var8[var6.field6793 + 1].method85(var3, var4);
            } else {
                var10 = var9 - (8 << class295.field3991);
            }
            if (var7.field7768) {
                if (var7.field7774 == -1 && var5 > var9) {
                    this.method1090();
                    return;
                }
                if (var7.field7774 >= 0 && var5 > var8[var7.field7774].method85(var3, var4)) {
                    this.method1090();
                    return;
                }
                if (var7.field7775 == -1 && var5 < var10) {
                    this.method1090();
                    return;
                }
                if (var7.field7775 >= 0 && var5 < var8[var7.field7775 + 1].method85(var3, var4)) {
                    this.method1090();
                    return;
                }
            }
            if (var3 >= var6.field6797 && var3 <= var6.field6796 && var4 >= var6.field6794 && var4 <= var6.field6799 && var5 <= var9 && var5 >= var10) {
                var6.field6792.field4875.method898(104, this);
            } else {
                int var11;
                for (var11 = class265.field3571 - 1; var11 > 0 && var5 > var8[var11].method85(var3, var4); --var11) {
                }
                if (var11 == 0 && var5 > var8[0].method85(var3, var4)) {
                    this.method1090();
                } else if (class265.field3571 - 1 == var11 && var8[var11].method85(var3, var4) - var5 > 8 << class295.field3991) {
                    this.method1090();
                } else {
                    class532 var12 = class103.field1632[var11][var3][var4];
                    if (var12 == null) {
                        if (var11 == 0) {
                            var12 = class103.field1632[0][var3][var4] = new class532(0, var3, var4);
                        }
                        boolean var13 = class103.field1632[0][var3][var4].field7829 != null;
                        if (var11 == 3 && var13) {
                            this.method1090();
                            return;
                        }
                        for (int var14 = 1; var14 <= var11; ++var14) {
                            if (class103.field1632[var14][var3][var4] == null) {
                                var12 = class103.field1632[var14][var3][var4] = new class532(var14, var3, var4);
                                if (var13) {
                                    ++var12.field7842;
                                }
                            }
                        }
                    }
                    if (var12.field7836 == null) {
                        var12.field7836 = new class334();
                        var12.field7841 = (byte) ((int) (arg0 & 255L));
                    } else if ((byte) ((int) (arg0 & 255L)) != var12.field7841) {
                        var12.field7836.field4875.method895(3);
                        var12.field7836.field4877 = false;
                        var12.field7841 = (byte) ((int) (arg0 & 255L));
                    }
                    var12.field7836.field4875.method898(88, this);
                }
            }
        } else {
            this.method1090();
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(JI)V", line = 137)
    public final void method1087(long arg0, int arg1) {
        this.field2311 = (short) (this.field2311 - arg1);
        if (this.field2311 <= 0) {
            this.method1090();
        } else {
            int var4 = super.field7678 >> 12;
            int var5 = super.field7679 >> 12;
            int var6 = super.field7682 >> 12;
            class471 var7 = this.field2317.field5437;
            class529 var8 = this.field2317.field5429;
            if (var8.field7732 != 0) {
                if (this.field2315 - this.field2311 <= var8.field7745) {
                    int var9 = var8.field7763 * arg1 + (super.field7680 >> 8 & 65280) + (this.field2312 >> 16 & 255);
                    int var10 = var8.field7751 * arg1 + (this.field2312 >> 8 & 255) + (super.field7680 & 65280);
                    int var11 = var8.field7777 * arg1 + (super.field7680 << 8 & 65280) + (this.field2312 & 255);
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
                    super.field7680 &= -16777216;
                    super.field7680 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field2312 &= -16777216;
                    this.field2312 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field2315 - this.field2311 <= var8.field7784) {
                    int var12 = var8.field7776 * arg1 + (super.field7680 >> 16 & 65280) + (this.field2312 >> 24 & 255);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field7680 &= 16777215;
                    super.field7680 |= (var12 & 65280) << 16;
                    this.field2312 &= 16777215;
                    this.field2312 |= (var12 & 255) << 24;
                }
            }
            if (var8.field7783 != -1 && this.field2315 - this.field2311 <= var8.field7752) {
                this.field2314 += var8.field7762 * arg1;
            }
            if (var8.field7757 != -1 && this.field2315 - this.field2311 <= var8.field7724) {
                super.field7676 += var8.field7720 * arg1;
            }
            int var13 = this.field2313;
            int var14 = this.field2316;
            int var15 = this.field2309;
            boolean var16 = false;
            if (var8.field7759 == 1) {
                int var17 = var4 - this.field2317.field5419;
                int var18 = var5 - this.field2317.field5423;
                int var19 = var6 - this.field2317.field5418;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field7723 * var20 * arg1);
                this.field2314 = (int) ((long) this.field2314 - ((long) this.field2314 * var21 >> 18));
            } else if (var8.field7759 == 2) {
                int var23 = var4 - this.field2317.field5419;
                int var24 = var5 - this.field2317.field5423;
                int var25 = var6 - this.field2317.field5418;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field7723 * var26 * arg1);
                this.field2314 = (int) ((long) this.field2314 - ((long) this.field2314 * var27 >> 28));
            }
            if (var8.field7719 != null) {
                class476 var29 = var7.field6790.field7789;
                for (class476 var30 = var29.field6884; var29 != var30; var30 = var30.field6884) {
                    class96 var31 = (class96) var30;
                    class363 var32 = var31.field1547;
                    if (var32.field5207 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field7719.length; ++var34) {
                            if (var8.field7719[var34] == var32.field5214) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field1549;
                            int var36 = var5 - var31.field1551;
                            int var37 = var6 - var31.field1546;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field5222) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field1544 * var37 + var31.field1548 * var35 + var32.field5209 * var36) * 65535L / (long) (var32.field5204 * var40);
                                if (var41 >= (long) var32.field5202) {
                                    int var43 = 0;
                                    if (var32.field5220 == 1) {
                                        var43 = (var40 >> 4) * var32.field5205;
                                    } else if (var32.field5220 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field5205;
                                    }
                                    if (var32.field5215 == 0) {
                                        if (var32.field5211 == 0) {
                                            var13 += (var31.field1548 - var43) * arg1;
                                            var14 += (var32.field5209 - var43) * arg1;
                                            var15 += (var31.field1544 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field7678 += (var31.field1548 - var43) * arg1;
                                            super.field7679 += (var32.field5209 - var43) * arg1;
                                            super.field7682 += (var31.field1544 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field5204;
                                        int var45 = (var36 << 15) / var40 * var32.field5204;
                                        int var46 = (var37 << 15) / var40 * var32.field5204;
                                        if (var32.field5211 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field7678 += arg1 * var44 >> 15;
                                            super.field7679 += arg1 * var45 >> 15;
                                            super.field7682 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field7766 != null) {
                for (int var47 = 0; var47 < var8.field7766.length; ++var47) {
                    class96 var48 = (class96) class53.field759.method2564((long) var8.field7766[var47], -4530);
                    while (var48 != null) {
                        class363 var49 = var48.field1547;
                        int var50 = var4 - var48.field1549;
                        int var51 = var5 - var48.field1551;
                        int var52 = var6 - var48.field1546;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field5222) {
                            var48 = (class96) class53.field759.method2565(true);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field1544 * var52 + var48.field1548 * var50 + var49.field5209 * var51) * 65535L / (long) (var49.field5204 * var55);
                            if (var56 < (long) var49.field5202) {
                                var48 = (class96) class53.field759.method2565(true);
                            } else {
                                int var58 = 0;
                                if (var49.field5220 == 1) {
                                    var58 = (var55 >> 4) * var49.field5205;
                                } else if (var49.field5220 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field5205;
                                }
                                if (var49.field5215 == 0) {
                                    if (var49.field5211 == 0) {
                                        var13 += (var48.field1548 - var58) * arg1;
                                        var14 += (var49.field5209 - var58) * arg1;
                                        var15 += (var48.field1544 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field7678 += (var48.field1548 - var58) * arg1;
                                        super.field7679 += (var49.field5209 - var58) * arg1;
                                        super.field7682 += (var48.field1544 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field5204;
                                    int var60 = (var51 << 15) / var55 * var49.field5204;
                                    int var61 = (var52 << 15) / var55 * var49.field5204;
                                    if (var49.field5211 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field7678 += arg1 * var59 >> 15;
                                        super.field7679 += arg1 * var60 >> 15;
                                        super.field7682 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class96) class53.field759.method2565(true);
                            }
                        }
                    }
                }
            }
            if (var8.field7747 != null) {
                if (var8.field7781 == null) {
                    var8.field7781 = new int[var8.field7747.length];
                    for (int var62 = 0; var62 < var8.field7747.length; ++var62) {
                        class509.method3013(var8.field7747[var62], -14838);
                        var8.field7781[var62] = ((class437) class331.field4494.method1592((byte) -25, (long) var8.field7747[var62])).field6308;
                    }
                }
                for (int var63 = 0; var63 < var8.field7781.length; ++var63) {
                    class363 var64 = class80.field1128[var8.field7781[var63]];
                    if (var64.field5211 == 0) {
                        var13 += var64.field5206 * arg1;
                        var14 += var64.field5209 * arg1;
                        var15 += var64.field5208 * arg1;
                        var16 = true;
                    } else {
                        super.field7678 += var64.field5206 * arg1;
                        super.field7679 += var64.field5209 * arg1;
                        super.field7682 += var64.field5208 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field2313 = (short) var13;
                        this.field2316 = (short) var14;
                        this.field2309 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field2314 <<= 1;
                }
            }
            super.field7678 = (int) ((long) super.field7678 + ((long) this.field2313 * (long) this.field2314 >> 23) * (long) arg1);
            super.field7679 = (int) ((long) super.field7679 + ((long) this.field2316 * (long) this.field2314 >> 23) * (long) arg1);
            super.field7682 = (int) ((long) super.field7682 + ((long) this.field2309 * (long) this.field2314 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "()V", line = 535)
    private final void method1088() {
        int var1 = this.field2317.field5437.field6784;
        if (this.field2317.field5437.field6788[var1] != null) {
            this.field2317.field5437.field6788[var1].method1090();
        }
        this.field2317.field5437.field6788[var1] = this;
        this.field2310 = (short) this.field2317.field5437.field6784;
        this.field2317.field5437.field6784 = var1 + 1 & 8191;
        this.field2317.field5412.method2599(1256, this);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lh;IIIIIIIIIIIZZ)V", line = 545)
    public final void method1089(class377 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field2317 = arg0;
        super.field7678 = arg1 << 12;
        super.field7679 = arg2 << 12;
        super.field7682 = arg3 << 12;
        super.field7680 = arg9;
        this.field2315 = this.field2311 = (short) arg8;
        super.field7676 = arg10;
        super.field7683 = arg11;
        super.field7685 = arg13;
        this.field2313 = (short) arg4;
        this.field2316 = (short) arg5;
        this.field2309 = (short) arg6;
        this.field2314 = arg7;
        super.field7684 = this.field2317.field5422.field736;
        this.method1088();
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "()V", line = 565)
    private final void method1090() {
        this.field2317.field5437.field6788[this.field2310] = null;
        class26.field357[class323.field4435] = this;
        class323.field4435 = class323.field4435 + 1 & 1023;
        this.method2861((byte) 47);
        this.method2529((byte) 108);
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lh;IIIIIIIIIIIZZ)V", line = 571)
    public class150(class377 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field2317 = arg0;
        super.field7678 = arg1 << 12;
        super.field7679 = arg2 << 12;
        super.field7682 = arg3 << 12;
        super.field7680 = arg9;
        this.field2315 = this.field2311 = (short) arg8;
        super.field7676 = arg10;
        super.field7683 = arg11;
        super.field7685 = arg13;
        this.field2313 = (short) arg4;
        this.field2316 = (short) arg5;
        this.field2309 = (short) arg6;
        this.field2314 = arg7;
        super.field7684 = this.field2317.field5422.field736;
        this.method1088();
    }
}
