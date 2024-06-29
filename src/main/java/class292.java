import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class292 extends class169 {

    @OriginalMember(owner = "client!ko", name = "L", descriptor = "Lss;")
    public class274 field4288;

    @OriginalMember(owner = "client!ko", name = "K", descriptor = "S")
    private short field4287;

    @OriginalMember(owner = "client!ko", name = "P", descriptor = "S")
    private short field4292;

    @OriginalMember(owner = "client!ko", name = "N", descriptor = "S")
    private short field4290;

    @OriginalMember(owner = "client!ko", name = "M", descriptor = "S")
    private short field4289;

    @OriginalMember(owner = "client!ko", name = "I", descriptor = "S")
    private short field4285;

    @OriginalMember(owner = "client!ko", name = "J", descriptor = "I")
    private int field4286;

    @OriginalMember(owner = "client!ko", name = "O", descriptor = "I")
    private int field4291;

    @OriginalMember(owner = "client!ko", name = "H", descriptor = "S")
    private short field4284;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lr;J)V", line = 5)
    public final void method1798(class98 arg0, long arg1) {
        int var4 = super.field2395 >> class125.field1831 + 12;
        int var5 = super.field2393 >> class125.field1831 + 12;
        int var6 = super.field2386 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class91.field1390 && var5 >= 0 && var5 < class575.field8372) {
            class16 var7 = this.field4288.field3572;
            class112 var8 = this.field4288.field3576;
            class682[] var9 = class178.field2480;
            int var10 = var7.field345;
            class44 var11 = class603.field8695[var7.field345][var4][var5];
            if (var11 != null) {
                var10 = var11.field677;
            }
            int var12 = var9[var10].method3822(var5, var4, 0);
            int var13;
            if (var10 < class555.field8157 - 1) {
                var13 = var9[var10 + 1].method3822(var5, var4, 0);
            } else {
                var13 = var12 - (8 << class125.field1831);
            }
            if (var8.field1695) {
                if (var8.field1701 == -1 && var6 > var12) {
                    this.method1799();
                    return;
                }
                if (var8.field1701 >= 0 && var6 > var9[var8.field1701].method3822(var5, var4, 0)) {
                    this.method1799();
                    return;
                }
                if (var8.field1680 == -1 && var6 < var13) {
                    this.method1799();
                    return;
                }
                if (var8.field1680 >= 0 && var6 < var9[var8.field1680 + 1].method3822(var5, var4, 0)) {
                    this.method1799();
                    return;
                }
            }
            int var14;
            for (var14 = class555.field8157 - 1; var14 > 0 && var6 > var9[var14].method3822(var5, var4, 0); --var14) {
            }
            if (var8.field1663 && var14 == 0 && var6 > var9[0].method3822(var5, var4, 0)) {
                this.method1799();
            } else if (class555.field8157 - 1 == var14 && var9[var14].method3822(var5, var4, 0) - var6 > 8 << class125.field1831) {
                this.method1799();
            } else {
                class44 var15 = class603.field8695[var14][var4][var5];
                if (var15 == null) {
                    if (var14 == 0 || class603.field8695[0][var4][var5] == null) {
                        var15 = class603.field8695[0][var4][var5] = new class44(0);
                    }
                    boolean var16 = class603.field8695[0][var4][var5].field666 != null;
                    if (var14 == 3 && var16) {
                        this.method1799();
                        return;
                    }
                    for (int var17 = 1; var17 <= var14; ++var17) {
                        if (class603.field8695[var17][var4][var5] == null) {
                            var15 = class603.field8695[var17][var4][var5] = new class44(var17);
                            if (var16) {
                                ++var15.field677;
                            }
                        }
                    }
                }
                if (var8.field1682) {
                    int var18 = super.field2395 >> 12;
                    int var19 = super.field2393 >> 12;
                    if (var15.field668 != null) {
                        class62 var20 = var15.field668.method268(arg0, 0);
                        if (var20 != null && var20.method383((byte) 54, var6, var19, var18)) {
                            this.method1799();
                            return;
                        }
                    }
                    if (var15.field670 != null) {
                        class62 var21 = var15.field670.method268(arg0, 0);
                        if (var21 != null && var21.method383((byte) 54, var6, var19, var18)) {
                            this.method1799();
                            return;
                        }
                    }
                    if (var15.field672 != null) {
                        class62 var22 = var15.field672.method268(arg0, 0);
                        if (var22 != null && var22.method383((byte) 54, var6, var19, var18)) {
                            this.method1799();
                            return;
                        }
                    }
                    for (class361 var23 = var15.field667; var23 != null; var23 = var23.field5299) {
                        class62 var24 = var23.field5301.method268(arg0, 0);
                        if (var24 != null && var24.method383((byte) 54, var6, var19, var18)) {
                            this.method1799();
                            return;
                        }
                    }
                }
                var7.field346.field8978.method2625(120, this);
            }
        } else {
            this.method1799();
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "()V", line = 178)
    public final void method1799() {
        this.field4288.field3572.field337[this.field4284] = null;
        class91.field1384[class27.field474] = this;
        class27.field474 = class27.field474 + 1 & 1023;
        this.method300((byte) 61);
        this.method2481(1);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(JI)V", line = 185)
    public final void method1800(long arg0, int arg1) {
        this.field4287 = (short) (this.field4287 - arg1);
        if (this.field4287 <= 0) {
            this.method1799();
        } else {
            int var4 = super.field2395 >> 12;
            int var5 = super.field2386 >> 12;
            int var6 = super.field2393 >> 12;
            class16 var7 = this.field4288.field3572;
            class112 var8 = this.field4288.field3576;
            if (var8.field1716 != 0) {
                if (this.field4292 - this.field4287 <= var8.field1653) {
                    int var9 = var8.field1676 * arg1 + (this.field4291 >> 16 & 255) + (super.field2384 >> 8 & 65280);
                    int var10 = var8.field1655 * arg1 + (this.field4291 >> 8 & 255) + (super.field2384 & 65280);
                    int var11 = var8.field1650 * arg1 + (super.field2384 << 8 & 65280) + (this.field4291 & 255);
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
                    super.field2384 &= -16777216;
                    super.field2384 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field4291 &= -16777216;
                    this.field4291 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field4292 - this.field4287 <= var8.field1666) {
                    int var12 = var8.field1693 * arg1 + (this.field4291 >> 24 & 255) + (super.field2384 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field2384 &= 16777215;
                    super.field2384 |= (var12 & 65280) << 16;
                    this.field4291 &= 16777215;
                    this.field4291 |= (var12 & 255) << 24;
                }
            }
            if (var8.field1664 != -1 && this.field4292 - this.field4287 <= var8.field1646) {
                this.field4286 += var8.field1684 * arg1;
            }
            if (var8.field1671 != -1 && this.field4292 - this.field4287 <= var8.field1670) {
                super.field2391 += var8.field1702 * arg1;
            }
            double var13 = (double) this.field4290;
            double var15 = (double) this.field4289;
            double var17 = (double) this.field4285;
            boolean var19 = false;
            if (var8.field1710 == 1) {
                int var20 = var4 - this.field4288.field3573.field4807;
                int var21 = var5 - this.field4288.field3573.field4813;
                int var22 = var6 - this.field4288.field3573.field4812;
                int var23 = (int) Math.sqrt((double) (var22 * var22 + var20 * var20 + var21 * var21)) >> 2;
                long var24 = (long) (var8.field1674 * var23 * arg1);
                this.field4286 = (int) ((long) this.field4286 - ((long) this.field4286 * var24 >> 18));
            } else if (var8.field1710 == 2) {
                int var26 = var4 - this.field4288.field3573.field4807;
                int var27 = var5 - this.field4288.field3573.field4813;
                int var28 = var6 - this.field4288.field3573.field4812;
                int var29 = var28 * var28 + var26 * var26 + var27 * var27;
                long var30 = (long) (var8.field1674 * var29 * arg1);
                this.field4286 = (int) ((long) this.field4286 - ((long) this.field4286 * var30 >> 28));
            }
            if (var8.field1692 != null) {
                class381 var32 = var7.field344.field4475;
                for (class381 var33 = var32.field5737; var32 != var33; var33 = var33.field5737) {
                    class29 var34 = (class29) var33;
                    class696 var35 = var34.field504;
                    if (var35.field9805 != 1) {
                        boolean var36 = false;
                        for (int var37 = 0; var37 < var8.field1692.length; ++var37) {
                            if (var8.field1692[var37] == var35.field9802) {
                                var36 = true;
                                break;
                            }
                        }
                        if (var36) {
                            double var38 = (double) (var4 - var34.field495);
                            double var40 = (double) (var5 - var34.field502);
                            double var42 = (double) (var6 - var34.field503);
                            double var44 = var42 * var42 + var38 * var38 + var40 * var40;
                            if (!(var44 > (double) var35.field9804)) {
                                double var46 = Math.sqrt(var44);
                                if (var46 == 0.0D) {
                                    var46 = 1.0D;
                                }
                                double var48 = ((double) var34.field501 * var42 + (double) var34.field497 * var38 + (double) var35.field9807 * var40) * 65535.0D / ((double) var35.field9800 * var46);
                                if (!(var48 < (double) var35.field9806)) {
                                    double var50 = 0.0D;
                                    if (var35.field9791 == 1) {
                                        var50 = var46 / 16.0D * (double) var35.field9798;
                                    } else if (var35.field9791 == 2) {
                                        var50 = var46 / 16.0D * (var46 / 16.0D) * (double) var35.field9798;
                                    }
                                    if (var35.field9797 == 0) {
                                        if (var35.field9801 == 0) {
                                            var13 += ((double) var34.field497 - var50) * (double) arg1;
                                            var15 += ((double) var35.field9807 - var50) * (double) arg1;
                                            var17 += ((double) var34.field501 - var50) * (double) arg1;
                                            var19 = true;
                                        } else {
                                            super.field2395 = (int) ((double) super.field2395 + ((double) var34.field497 - var50) * (double) arg1);
                                            super.field2386 = (int) ((double) super.field2386 + ((double) var35.field9807 - var50) * (double) arg1);
                                            super.field2393 = (int) ((double) super.field2393 + ((double) var34.field501 - var50) * (double) arg1);
                                        }
                                    } else {
                                        double var52 = var38 / var46 * (double) var35.field9800;
                                        double var54 = var40 / var46 * (double) var35.field9800;
                                        double var56 = var42 / var46 * (double) var35.field9800;
                                        if (var35.field9801 == 0) {
                                            var13 += (double) arg1 * var52;
                                            var15 += (double) arg1 * var54;
                                            var17 += (double) arg1 * var56;
                                            var19 = true;
                                        } else {
                                            super.field2395 = (int) ((double) super.field2395 + (double) arg1 * var52);
                                            super.field2386 = (int) ((double) super.field2386 + (double) arg1 * var54);
                                            super.field2393 = (int) ((double) super.field2393 + (double) arg1 * var56);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field1719 != null) {
                for (int var58 = 0; var58 < var8.field1719.length; ++var58) {
                    class29 var59 = (class29) class124.field1818.method1568((byte) 100, (long) var8.field1719[var58]);
                    while (var59 != null) {
                        class696 var60 = var59.field504;
                        double var61 = (double) (var4 - var59.field495);
                        double var63 = (double) (var5 - var59.field502);
                        double var65 = (double) (var6 - var59.field503);
                        double var67 = var65 * var65 + var61 * var61 + var63 * var63;
                        if (var67 > (double) var60.field9804) {
                            var59 = (class29) class124.field1818.method1570(-1);
                        } else {
                            double var69 = Math.sqrt(var67);
                            if (var69 == 0.0D) {
                                var69 = 1.0D;
                            }
                            double var71 = ((double) var59.field501 * var65 + (double) var59.field497 * var61 + (double) var60.field9807 * var63) * 65535.0D / ((double) var60.field9800 * var69);
                            if (var71 < (double) var60.field9806) {
                                var59 = (class29) class124.field1818.method1570(-1);
                            } else {
                                double var73 = 0.0D;
                                if (var60.field9791 == 1) {
                                    var73 = var69 / 16.0D * (double) var60.field9798;
                                } else if (var60.field9791 == 2) {
                                    var73 = var69 / 16.0D * (var69 / 16.0D) * (double) var60.field9798;
                                }
                                if (var60.field9797 == 0) {
                                    if (var60.field9801 == 0) {
                                        var13 += ((double) var59.field497 - var73) * (double) arg1;
                                        var15 += ((double) var60.field9807 - var73) * (double) arg1;
                                        var17 += ((double) var59.field501 - var73) * (double) arg1;
                                        var19 = true;
                                    } else {
                                        super.field2395 = (int) ((double) super.field2395 + ((double) var59.field497 - var73) * (double) arg1);
                                        super.field2386 = (int) ((double) super.field2386 + ((double) var60.field9807 - var73) * (double) arg1);
                                        super.field2393 = (int) ((double) super.field2393 + ((double) var59.field501 - var73) * (double) arg1);
                                    }
                                } else {
                                    double var75 = var61 / var69 * (double) var60.field9800;
                                    double var77 = var63 / var69 * (double) var60.field9800;
                                    double var79 = var65 / var69 * (double) var60.field9800;
                                    if (var60.field9801 == 0) {
                                        var13 += (double) arg1 * var75;
                                        var15 += (double) arg1 * var77;
                                        var17 += (double) arg1 * var79;
                                        var19 = true;
                                    } else {
                                        super.field2395 = (int) ((double) super.field2395 + (double) arg1 * var75);
                                        super.field2386 = (int) ((double) super.field2386 + (double) arg1 * var77);
                                        super.field2393 = (int) ((double) super.field2393 + (double) arg1 * var79);
                                    }
                                }
                                var59 = (class29) class124.field1818.method1570(-1);
                            }
                        }
                    }
                }
            }
            if (var8.field1709 != null) {
                if (var8.field1660 == null) {
                    var8.field1660 = new int[var8.field1709.length];
                    for (int var81 = 0; var81 < var8.field1709.length; ++var81) {
                        class108.method819(var8.field1709[var81], (byte) 32);
                        var8.field1660[var81] = ((class258) class614.field8856.method2002((byte) -111, (long) var8.field1709[var81])).field3352;
                    }
                }
                for (int var82 = 0; var82 < var8.field1660.length; ++var82) {
                    class696 var83 = class81.field1316[var8.field1660[var82]];
                    if (var83.field9801 == 0) {
                        var13 += (double) (var83.field9803 * arg1);
                        var15 += (double) (var83.field9807 * arg1);
                        var17 += (double) (var83.field9795 * arg1);
                        var19 = true;
                    } else {
                        super.field2395 += var83.field9803 * arg1;
                        super.field2386 += var83.field9807 * arg1;
                        super.field2393 += var83.field9795 * arg1;
                    }
                }
            }
            if (var19) {
                while (true) {
                    if (!(var13 > 32767.0D) && !(var15 > 32767.0D) && !(var17 > 32767.0D) && !(var13 < -32767.0D) && !(var15 < -32767.0D) && !(var17 < -32767.0D)) {
                        this.field4290 = (short) ((int) var13);
                        this.field4289 = (short) ((int) var15);
                        this.field4285 = (short) ((int) var17);
                        break;
                    }
                    var13 /= 2.0D;
                    var15 /= 2.0D;
                    var17 /= 2.0D;
                    this.field4286 <<= 1;
                }
            }
            super.field2395 = (int) ((long) super.field2395 + ((long) (this.field4286 << 2) * (long) this.field4290 >> 23) * (long) arg1);
            super.field2386 = (int) ((long) super.field2386 + ((long) (this.field4286 << 2) * (long) this.field4289 >> 23) * (long) arg1);
            super.field2393 = (int) ((long) super.field2393 + ((long) (this.field4286 << 2) * (long) this.field4285 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lss;IIIIIIIIIIIZZ)V", line = 586)
    public final void method1801(class274 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field4288 = arg0;
        super.field2395 = arg1 << 12;
        super.field2386 = arg2 << 12;
        super.field2393 = arg3 << 12;
        super.field2384 = arg9;
        this.field4292 = this.field4287 = (short) arg8;
        super.field2391 = arg10;
        super.field2392 = arg11;
        super.field2394 = arg13;
        this.field4290 = (short) arg4;
        this.field4289 = (short) arg5;
        this.field4285 = (short) arg6;
        this.field4286 = arg7;
        super.field2382 = this.field4288.field3571.field507;
        this.method1802();
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "()V", line = 607)
    private final void method1802() {
        int var1 = this.field4288.field3572.field336;
        if (this.field4288.field3572.field337[var1] != null) {
            this.field4288.field3572.field337[var1].method1799();
        }
        this.field4288.field3572.field337[var1] = this;
        this.field4284 = (short) this.field4288.field3572.field336;
        this.field4288.field3572.field336 = var1 + 1 & 8191;
        this.field4288.field3575.method2368(0, this);
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lss;IIIIIIIIIIIZZ)V", line = 616)
    public class292(class274 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field4288 = arg0;
        super.field2395 = arg1 << 12;
        super.field2386 = arg2 << 12;
        super.field2393 = arg3 << 12;
        super.field2384 = arg9;
        this.field4292 = this.field4287 = (short) arg8;
        super.field2391 = arg10;
        super.field2392 = arg11;
        super.field2394 = arg13;
        this.field4290 = (short) arg4;
        this.field4289 = (short) arg5;
        this.field4285 = (short) arg6;
        this.field4286 = arg7;
        super.field2382 = this.field4288.field3571.field507;
        this.method1802();
    }
}
