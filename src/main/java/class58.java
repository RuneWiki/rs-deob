import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class58 extends class56 {

    @OriginalMember(owner = "client!cd", name = "I", descriptor = "Lga;")
    private class213 field663;

    @OriginalMember(owner = "client!cd", name = "H", descriptor = "S")
    private short field662;

    @OriginalMember(owner = "client!cd", name = "M", descriptor = "S")
    private short field667;

    @OriginalMember(owner = "client!cd", name = "K", descriptor = "S")
    private short field665;

    @OriginalMember(owner = "client!cd", name = "P", descriptor = "S")
    private short field670;

    @OriginalMember(owner = "client!cd", name = "N", descriptor = "S")
    private short field668;

    @OriginalMember(owner = "client!cd", name = "O", descriptor = "I")
    private int field669;

    @OriginalMember(owner = "client!cd", name = "L", descriptor = "I")
    private int field666;

    @OriginalMember(owner = "client!cd", name = "J", descriptor = "S")
    private short field664;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(J)V", line = 7)
    public final void method325(long arg0) {
        int var3 = super.field650 >> 19;
        int var4 = super.field643 >> 19;
        int var5 = super.field646 >> class419.field5720;
        if (var5 <= 0 && var5 >= -65535 && var3 >= 0 && var3 < class43.field512 && var4 >= 0 && var4 < class262.field3367) {
            class69 var6 = this.field663.field2633;
            class295 var7 = this.field663.field2605;
            class279[] var8 = class304.field4096;
            int var9 = var8[var6.field842].method1050(var3, var4);
            int var10;
            if (var6.field842 < 3) {
                var10 = var8[var6.field842 + 1].method1050(var3, var4);
            } else {
                var10 = var9 - 1024;
            }
            if (var7.field3878) {
                if (var7.field3938 == -1 && var5 > var9) {
                    this.method329();
                    return;
                }
                if (var7.field3938 >= 0 && var5 > var8[var7.field3938].method1050(var3, var4)) {
                    this.method329();
                    return;
                }
                if (var7.field3910 == -1 && var5 < var10) {
                    this.method329();
                    return;
                }
                if (var7.field3910 >= 0 && var5 < var8[var7.field3910 + 1].method1050(var3, var4)) {
                    this.method329();
                    return;
                }
            }
            if (var3 >= var6.field845 && var3 <= var6.field844 && var4 >= var6.field841 && var4 <= var6.field844 && var5 <= var9 && var5 >= var10) {
                var6.field839.field3847.method429(-127, this);
            } else {
                byte var11 = 3;
                if (var5 > var8[1].method1050(var3, var4)) {
                    var11 = 0;
                } else if (var5 > var8[2].method1050(var3, var4)) {
                    var11 = 1;
                } else if (var5 > var8[3].method1050(var3, var4)) {
                    var11 = 2;
                } else if (var5 < var8[3].method1050(var3, var4) - 1024) {
                    this.method329();
                    return;
                }
                class316 var12 = class347.field4722[var11][var3][var4];
                if (var12 == null) {
                    boolean var13 = class347.field4722[0][var3][var4].field4271 != null;
                    if (var11 == 3 && var13) {
                        this.method329();
                        return;
                    }
                    for (int var14 = 1; var14 <= var11; ++var14) {
                        if (class347.field4722[var14][var3][var4] == null) {
                            var12 = class347.field4722[var14][var3][var4] = new class316(var14, var3, var4);
                            if (var13) {
                                ++var12.field4250;
                            }
                        }
                    }
                }
                if (var12.field4249 == null) {
                    var12.field4249 = new class291();
                    var12.field4272 = (byte) ((int) (arg0 & 255L));
                } else if ((byte) ((int) (arg0 & 255L)) != var12.field4272) {
                    var12.field4249 = new class291();
                    var12.field4272 = (byte) ((int) (arg0 & 255L));
                }
                var12.field4249.field3847.method429(82, this);
            }
        } else {
            this.method329();
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "()V", line = 135)
    private final void method326() {
        int var1 = this.field663.field2633.field832;
        if (this.field663.field2633.field829[var1] != null) {
            this.field663.field2633.field829[var1].method329();
        }
        this.field663.field2633.field829[var1] = this;
        this.field664 = (short) this.field663.field2633.field832;
        this.field663.field2633.field832 = var1 + 1 & 8191;
        this.field663.field2628.method1833(this, 10209);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(JI)V", line = 145)
    public final void method327(long arg0, int arg1) {
        this.field662 = (short) (this.field662 - arg1);
        if (this.field662 <= 0) {
            this.method329();
        } else {
            int var4 = super.field650 >> class419.field5720;
            int var5 = super.field646 >> class419.field5720;
            int var6 = super.field643 >> class419.field5720;
            class69 var7 = this.field663.field2633;
            class295 var8 = this.field663.field2605;
            if (var8.field3891 != 0) {
                if (this.field667 - this.field662 <= var8.field3907) {
                    int var9 = var8.field3908 * arg1 + (this.field666 >> 16 & 255) + (super.field641 >> 8 & 65280);
                    int var10 = var8.field3903 * arg1 + (this.field666 >> 8 & 255) + (super.field641 & 65280);
                    int var11 = var8.field3880 * arg1 + (super.field641 << 8 & 65280) + (this.field666 & 255);
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
                    super.field641 &= -16777216;
                    super.field641 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field666 &= -16777216;
                    this.field666 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field667 - this.field662 <= var8.field3892) {
                    int var12 = var8.field3925 * arg1 + (this.field666 >> 24 & 255) + (super.field641 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field641 &= 16777215;
                    super.field641 |= (var12 & 65280) << 16;
                    this.field666 &= 16777215;
                    this.field666 |= (var12 & 255) << 24;
                }
            }
            if (var8.field3933 != -1 && this.field667 - this.field662 <= var8.field3931) {
                this.field669 += var8.field3913 * arg1;
            }
            if (var8.field3911 != -1 && this.field667 - this.field662 <= var8.field3887) {
                super.field640 += var8.field3923 * arg1;
            }
            int var13 = this.field665;
            int var14 = this.field670;
            int var15 = this.field668;
            boolean var16 = false;
            if (var8.field3883 == 1) {
                int var17 = var4 - this.field663.field2625;
                int var18 = var5 - this.field663.field2622;
                int var19 = var6 - this.field663.field2606;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field3884 * var20 * arg1);
                this.field669 = (int) ((long) this.field669 - ((long) this.field669 * var21 >> 18));
            } else if (var8.field3883 == 2) {
                int var23 = var4 - this.field663.field2625;
                int var24 = var5 - this.field663.field2622;
                int var25 = var6 - this.field663.field2606;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field3884 * var26 * arg1);
                this.field669 = (int) ((long) this.field669 - ((long) this.field669 * var27 >> 28));
            }
            if (var8.field3901 != null) {
                class43 var29 = var7.field838.field3483;
                for (class43 var30 = var29.field508; var29 != var30; var30 = var30.field508) {
                    class169 var31 = (class169) var30;
                    class208 var32 = var31.field1976;
                    if (var32.field2520 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field3901.length; ++var34) {
                            if (var8.field3901[var34] == var32.field2517) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field1971;
                            int var36 = var5 - var31.field1970;
                            int var37 = var6 - var31.field1975;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field2539) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field1981 * var37 + var31.field1982 * var35 + var32.field2522 * var36) * 65535L / (long) (var32.field2533 * var40);
                                if (var41 >= (long) var32.field2531) {
                                    int var43 = 0;
                                    if (var32.field2536 == 1) {
                                        var43 = (var40 >> 4) * var32.field2514;
                                    } else if (var32.field2536 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field2514;
                                    }
                                    if (var32.field2510 == 0) {
                                        if (var32.field2538 == 0) {
                                            var13 += (var31.field1982 - var43) * arg1;
                                            var14 += (var32.field2522 - var43) * arg1;
                                            var15 += (var31.field1981 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field650 += (var31.field1982 - var43) * arg1;
                                            super.field646 += (var32.field2522 - var43) * arg1;
                                            super.field643 += (var31.field1981 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field2533;
                                        int var45 = (var36 << 15) / var40 * var32.field2533;
                                        int var46 = (var37 << 15) / var40 * var32.field2533;
                                        if (var32.field2538 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field650 += arg1 * var44 >> 15;
                                            super.field646 += arg1 * var45 >> 15;
                                            super.field643 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field3906 != null) {
                for (int var47 = 0; var47 < var8.field3906.length; ++var47) {
                    class169 var48 = (class169) class345.field4691.method1171((byte) 110, (long) var8.field3906[var47]);
                    while (var48 != null) {
                        class208 var49 = var48.field1976;
                        int var50 = var4 - var48.field1971;
                        int var51 = var5 - var48.field1970;
                        int var52 = var6 - var48.field1975;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field2539) {
                            var48 = (class169) class345.field4691.method1172(121);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field1981 * var52 + var48.field1982 * var50 + var49.field2522 * var51) * 65535L / (long) (var49.field2533 * var55);
                            if (var56 < (long) var49.field2531) {
                                var48 = (class169) class345.field4691.method1172(112);
                            } else {
                                int var58 = 0;
                                if (var49.field2536 == 1) {
                                    var58 = (var55 >> 4) * var49.field2514;
                                } else if (var49.field2536 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field2514;
                                }
                                if (var49.field2510 == 0) {
                                    if (var49.field2538 == 0) {
                                        var13 += (var48.field1982 - var58) * arg1;
                                        var14 += (var49.field2522 - var58) * arg1;
                                        var15 += (var48.field1981 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field650 += (var48.field1982 - var58) * arg1;
                                        super.field646 += (var49.field2522 - var58) * arg1;
                                        super.field643 += (var48.field1981 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field2533;
                                    int var60 = (var51 << 15) / var55 * var49.field2533;
                                    int var61 = (var52 << 15) / var55 * var49.field2533;
                                    if (var49.field2538 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field650 += arg1 * var59 >> 15;
                                        super.field646 += arg1 * var60 >> 15;
                                        super.field643 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class169) class345.field4691.method1172(123);
                            }
                        }
                    }
                }
            }
            if (var8.field3902 != null) {
                if (var8.field3904 == null) {
                    var8.field3904 = new int[var8.field3902.length];
                    for (int var62 = 0; var62 < var8.field3902.length; ++var62) {
                        class104.method619(var8.field3902[var62], (byte) -86);
                        var8.field3904[var62] = ((class369) class347.field4714.method2218(1, (long) var8.field3902[var62])).field5032;
                    }
                }
                for (int var63 = 0; var63 < var8.field3904.length; ++var63) {
                    class208 var64 = class98.field1148[var8.field3904[var63]];
                    if (var64.field2538 == 0) {
                        var13 += var64.field2526 * arg1;
                        var14 += var64.field2522 * arg1;
                        var15 += var64.field2521 * arg1;
                        var16 = true;
                    } else {
                        super.field650 += var64.field2526 * arg1;
                        super.field646 += var64.field2522 * arg1;
                        super.field643 += var64.field2521 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field665 = (short) var13;
                        this.field670 = (short) var14;
                        this.field668 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field669 <<= 1;
                }
            }
            super.field650 = (int) ((long) super.field650 + ((long) this.field665 * (long) this.field669 >> 23) * (long) arg1);
            super.field646 = (int) ((long) super.field646 + ((long) this.field670 * (long) this.field669 >> 23) * (long) arg1);
            super.field643 = (int) ((long) super.field643 + ((long) this.field668 * (long) this.field669 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lga;IIIIIIIIIIIZ)V", line = 540)
    public final void method328(class213 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        this.field663 = arg0;
        super.field650 = arg1 << class419.field5720;
        super.field646 = arg2 << class419.field5720;
        super.field643 = arg3 << class419.field5720;
        super.field641 = arg9;
        this.field667 = this.field662 = (short) arg8;
        super.field640 = arg10;
        super.field645 = arg11;
        this.field665 = (short) arg4;
        this.field670 = (short) arg5;
        this.field668 = (short) arg6;
        this.field669 = arg7;
        super.field647 = this.field663.field2616.field1201;
        this.method326();
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "()V", line = 559)
    private final void method329() {
        this.field663.field2633.field829[this.field664] = null;
        class276.field3579[class161.field1877] = this;
        class161.field1877 = class161.field1877 + 1 & 1023;
        this.method358(42);
        this.method920((byte) -59);
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lga;IIIIIIIIIIIZ)V", line = 569)
    public class58(class213 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        this.field663 = arg0;
        super.field650 = arg1 << class419.field5720;
        super.field646 = arg2 << class419.field5720;
        super.field643 = arg3 << class419.field5720;
        super.field641 = arg9;
        this.field667 = this.field662 = (short) arg8;
        super.field640 = arg10;
        super.field645 = arg11;
        this.field665 = (short) arg4;
        this.field670 = (short) arg5;
        this.field668 = (short) arg6;
        this.field669 = arg7;
        super.field647 = this.field663.field2616.field1201;
        this.method326();
    }
}
