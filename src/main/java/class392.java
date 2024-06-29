import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class392 extends class777 {

    @OriginalMember(owner = "client!om", name = "F", descriptor = "Lbj;")
    public class255 field5897;

    @OriginalMember(owner = "client!om", name = "J", descriptor = "S")
    private short field5896;

    @OriginalMember(owner = "client!om", name = "G", descriptor = "S")
    private short field5892;

    @OriginalMember(owner = "client!om", name = "L", descriptor = "S")
    private short field5900;

    @OriginalMember(owner = "client!om", name = "E", descriptor = "S")
    private short field5898;

    @OriginalMember(owner = "client!om", name = "K", descriptor = "S")
    private short field5894;

    @OriginalMember(owner = "client!om", name = "M", descriptor = "I")
    private int field5899;

    @OriginalMember(owner = "client!om", name = "I", descriptor = "I")
    private int field5895;

    @OriginalMember(owner = "client!om", name = "N", descriptor = "S")
    private short field5893;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "()V")
    public final void method3112() {
        this.field5897.field3958.field9098[this.field5893] = null;
        class783.field11411[class274.field4143] = this;
        class274.field4143 = class274.field4143 + 1 & 1023;
        this.method4696(-95);
        this.method1879(0);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lha;J)V")
    public final void method3113(class66 arg0, long arg1) {
        int var4 = super.field11286 >> class602.field8828 + 12;
        int var5 = super.field11290 >> class602.field8828 + 12;
        int var6 = super.field11291 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class132.field1543 && var5 >= 0 && var5 < class216.field3296) {
            class619 var7 = this.field5897.field3958;
            class242 var8 = this.field5897.field3955;
            class294[] var9 = class555.field8261;
            int var10 = var7.field9104;
            class96 var11 = class734.field10683[var7.field9104][var4][var5];
            if (var11 != null) {
                var10 = var11.field1083;
            }
            int var12 = var9[var10].method2407(var5, var4, -113);
            int var13;
            if (var10 < class501.field7246 - 1) {
                var13 = var9[var10 + 1].method2407(var5, var4, -106);
            } else {
                var13 = var12 - (8 << class602.field8828);
            }
            if (var8.field3653) {
                if (var8.field3672 == -1 && var6 > var12) {
                    this.method3112();
                    return;
                }
                if (var8.field3672 >= 0 && var6 > var9[var8.field3672].method2407(var5, var4, 67)) {
                    this.method3112();
                    return;
                }
                if (var8.field3700 == -1 && var6 < var13) {
                    this.method3112();
                    return;
                }
                if (var8.field3700 >= 0 && var6 < var9[var8.field3700 + 1].method2407(var5, var4, 112)) {
                    this.method3112();
                    return;
                }
            }
            int var14;
            for (var14 = class501.field7246 - 1; var14 > 0 && var6 > var9[var14].method2407(var5, var4, -119); --var14) {
            }
            if (var8.field3680 && var14 == 0 && var6 > var9[0].method2407(var5, var4, 115)) {
                this.method3112();
            } else if (class501.field7246 - 1 == var14 && var9[var14].method2407(var5, var4, 94) - var6 > 8 << class602.field8828) {
                this.method3112();
            } else {
                class96 var15 = class734.field10683[var14][var4][var5];
                if (var15 == null) {
                    if (var14 == 0 || class734.field10683[0][var4][var5] == null) {
                        var15 = class734.field10683[0][var4][var5] = new class96(0);
                    }
                    boolean var16 = class734.field10683[0][var4][var5].field1088 != null;
                    if (var14 == 3 && var16) {
                        this.method3112();
                        return;
                    }
                    for (int var17 = 1; var17 <= var14; ++var17) {
                        if (class734.field10683[var17][var4][var5] == null) {
                            var15 = class734.field10683[var17][var4][var5] = new class96(var17);
                            if (var16) {
                                ++var15.field1083;
                            }
                        }
                    }
                }
                if (var8.field3669) {
                    int var18 = super.field11286 >> 12;
                    int var19 = super.field11290 >> 12;
                    if (var15.field1082 != null) {
                        class260 var20 = var15.field1082.method1086(arg0, 105);
                        if (var20 != null && var20.method2190(var19, -110, var6, var18)) {
                            this.method3112();
                            return;
                        }
                    }
                    if (var15.field1079 != null) {
                        class260 var21 = var15.field1079.method1086(arg0, 75);
                        if (var21 != null && var21.method2190(var19, -87, var6, var18)) {
                            this.method3112();
                            return;
                        }
                    }
                    if (var15.field1081 != null) {
                        class260 var22 = var15.field1081.method1086(arg0, 79);
                        if (var22 != null && var22.method2190(var19, -89, var6, var18)) {
                            this.method3112();
                            return;
                        }
                    }
                    for (class681 var23 = var15.field1085; var23 != null; var23 = var23.field9865) {
                        class260 var24 = var23.field9867.method1086(arg0, 92);
                        if (var24 != null && var24.method2190(var19, -94, var6, var18)) {
                            this.method3112();
                            return;
                        }
                    }
                }
                var7.field9103.field8599.method3907((byte) -22, this);
            }
        } else {
            this.method3112();
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lbj;IIIIIIIIIIIZZ)V")
    public final void method3114(class255 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field5897 = arg0;
        super.field11286 = arg1 << 12;
        super.field11291 = arg2 << 12;
        super.field11290 = arg3 << 12;
        super.field11285 = arg9;
        this.field5892 = this.field5896 = (short) arg8;
        super.field11289 = arg10;
        super.field11282 = arg11;
        super.field11283 = arg13;
        this.field5900 = (short) arg4;
        this.field5898 = (short) arg5;
        this.field5894 = (short) arg6;
        this.field5899 = arg7;
        super.field11280 = this.field5897.field3960.field9522;
        this.method3116();
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(JI)V")
    public final void method3115(long arg0, int arg1) {
        this.field5896 = (short) (this.field5896 - arg1);
        if (this.field5896 <= 0) {
            this.method3112();
        } else {
            int var4 = super.field11286 >> 12;
            int var5 = super.field11291 >> 12;
            int var6 = super.field11290 >> 12;
            class619 var7 = this.field5897.field3958;
            class242 var8 = this.field5897.field3955;
            if (var8.field3673 != 0) {
                if (this.field5892 - this.field5896 <= var8.field3675) {
                    int var9 = var8.field3685 * arg1 + (super.field11285 >> 8 & 65280) + (this.field5895 >> 16 & 255);
                    int var10 = var8.field3660 * arg1 + (this.field5895 >> 8 & 255) + (super.field11285 & 65280);
                    int var11 = var8.field3718 * arg1 + (super.field11285 << 8 & 65280) + (this.field5895 & 255);
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
                    super.field11285 &= -16777216;
                    super.field11285 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field5895 &= -16777216;
                    this.field5895 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field5892 - this.field5896 <= var8.field3701) {
                    int var12 = var8.field3696 * arg1 + (super.field11285 >> 16 & 65280) + (this.field5895 >> 24 & 255);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field11285 &= 16777215;
                    super.field11285 |= (var12 & 65280) << 16;
                    this.field5895 &= 16777215;
                    this.field5895 |= (var12 & 255) << 24;
                }
            }
            if (var8.field3684 != -1 && this.field5892 - this.field5896 <= var8.field3708) {
                this.field5899 += var8.field3693 * arg1;
            }
            if (var8.field3717 != -1 && this.field5892 - this.field5896 <= var8.field3710) {
                super.field11289 += var8.field3671 * arg1;
            }
            double var13 = (double) this.field5900;
            double var15 = (double) this.field5898;
            double var17 = (double) this.field5894;
            boolean var19 = false;
            if (var8.field3651 == 1) {
                int var20 = var4 - this.field5897.field3957.field5957;
                int var21 = var5 - this.field5897.field3957.field5962;
                int var22 = var6 - this.field5897.field3957.field5963;
                int var23 = (int) Math.sqrt((double) (var22 * var22 + var20 * var20 + var21 * var21)) >> 2;
                long var24 = (long) (var8.field3699 * var23 * arg1);
                this.field5899 = (int) ((long) this.field5899 - ((long) this.field5899 * var24 >> 18));
            } else if (var8.field3651 == 2) {
                int var26 = var4 - this.field5897.field3957.field5957;
                int var27 = var5 - this.field5897.field3957.field5962;
                int var28 = var6 - this.field5897.field3957.field5963;
                int var29 = var28 * var28 + var26 * var26 + var27 * var27;
                long var30 = (long) (var8.field3699 * var29 * arg1);
                this.field5899 = (int) ((long) this.field5899 - ((long) this.field5899 * var30 >> 28));
            }
            if (var8.field3722 != null) {
                class206 var32 = var7.field9101.field7374;
                for (class206 var33 = var32.field3180; var32 != var33; var33 = var33.field3180) {
                    class554 var34 = (class554) var33;
                    class542 var35 = var34.field8254;
                    if (var35.field8113 != 1) {
                        boolean var36 = false;
                        for (int var37 = 0; var37 < var8.field3722.length; ++var37) {
                            if (var8.field3722[var37] == var35.field8116) {
                                var36 = true;
                                break;
                            }
                        }
                        if (var36) {
                            double var38 = (double) (var4 - var34.field8256);
                            double var40 = (double) (var5 - var34.field8248);
                            double var42 = (double) (var6 - var34.field8251);
                            double var44 = var42 * var42 + var38 * var38 + var40 * var40;
                            if (!(var44 > (double) var35.field8109)) {
                                double var46 = Math.sqrt(var44);
                                if (var46 == 0.0D) {
                                    var46 = 1.0D;
                                }
                                double var48 = ((double) var34.field8245 * var42 + (double) var34.field8250 * var38 + (double) var35.field8112 * var40) * 65535.0D / ((double) var35.field8111 * var46);
                                if (!(var48 < (double) var35.field8108)) {
                                    double var50 = 0.0D;
                                    if (var35.field8118 == 1) {
                                        var50 = var46 / 16.0D * (double) var35.field8123;
                                    } else if (var35.field8118 == 2) {
                                        var50 = var46 / 16.0D * (var46 / 16.0D) * (double) var35.field8123;
                                    }
                                    if (var35.field8126 == 0) {
                                        if (var35.field8125 == 0) {
                                            var13 += ((double) var34.field8250 - var50) * (double) arg1;
                                            var15 += ((double) var35.field8112 - var50) * (double) arg1;
                                            var17 += ((double) var34.field8245 - var50) * (double) arg1;
                                            var19 = true;
                                        } else {
                                            super.field11286 = (int) ((double) super.field11286 + ((double) var34.field8250 - var50) * (double) arg1);
                                            super.field11291 = (int) ((double) super.field11291 + ((double) var35.field8112 - var50) * (double) arg1);
                                            super.field11290 = (int) ((double) super.field11290 + ((double) var34.field8245 - var50) * (double) arg1);
                                        }
                                    } else {
                                        double var52 = var38 / var46 * (double) var35.field8111;
                                        double var54 = var40 / var46 * (double) var35.field8111;
                                        double var56 = var42 / var46 * (double) var35.field8111;
                                        if (var35.field8125 == 0) {
                                            var13 += (double) arg1 * var52;
                                            var15 += (double) arg1 * var54;
                                            var17 += (double) arg1 * var56;
                                            var19 = true;
                                        } else {
                                            super.field11286 = (int) ((double) super.field11286 + (double) arg1 * var52);
                                            super.field11291 = (int) ((double) super.field11291 + (double) arg1 * var54);
                                            super.field11290 = (int) ((double) super.field11290 + (double) arg1 * var56);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field3694 != null) {
                for (int var58 = 0; var58 < var8.field3694.length; ++var58) {
                    class554 var59 = (class554) class411.field6071.method1012((long) var8.field3694[var58], 0);
                    while (var59 != null) {
                        class542 var60 = var59.field8254;
                        double var61 = (double) (var4 - var59.field8256);
                        double var63 = (double) (var5 - var59.field8248);
                        double var65 = (double) (var6 - var59.field8251);
                        double var67 = var65 * var65 + var61 * var61 + var63 * var63;
                        if (var67 > (double) var60.field8109) {
                            var59 = (class554) class411.field6071.method1016(29);
                        } else {
                            double var69 = Math.sqrt(var67);
                            if (var69 == 0.0D) {
                                var69 = 1.0D;
                            }
                            double var71 = ((double) var59.field8245 * var65 + (double) var59.field8250 * var61 + (double) var60.field8112 * var63) * 65535.0D / ((double) var60.field8111 * var69);
                            if (var71 < (double) var60.field8108) {
                                var59 = (class554) class411.field6071.method1016(22);
                            } else {
                                double var73 = 0.0D;
                                if (var60.field8118 == 1) {
                                    var73 = var69 / 16.0D * (double) var60.field8123;
                                } else if (var60.field8118 == 2) {
                                    var73 = var69 / 16.0D * (var69 / 16.0D) * (double) var60.field8123;
                                }
                                if (var60.field8126 == 0) {
                                    if (var60.field8125 == 0) {
                                        var13 += ((double) var59.field8250 - var73) * (double) arg1;
                                        var15 += ((double) var60.field8112 - var73) * (double) arg1;
                                        var17 += ((double) var59.field8245 - var73) * (double) arg1;
                                        var19 = true;
                                    } else {
                                        super.field11286 = (int) ((double) super.field11286 + ((double) var59.field8250 - var73) * (double) arg1);
                                        super.field11291 = (int) ((double) super.field11291 + ((double) var60.field8112 - var73) * (double) arg1);
                                        super.field11290 = (int) ((double) super.field11290 + ((double) var59.field8245 - var73) * (double) arg1);
                                    }
                                } else {
                                    double var75 = var61 / var69 * (double) var60.field8111;
                                    double var77 = var63 / var69 * (double) var60.field8111;
                                    double var79 = var65 / var69 * (double) var60.field8111;
                                    if (var60.field8125 == 0) {
                                        var13 += (double) arg1 * var75;
                                        var15 += (double) arg1 * var77;
                                        var17 += (double) arg1 * var79;
                                        var19 = true;
                                    } else {
                                        super.field11286 = (int) ((double) super.field11286 + (double) arg1 * var75);
                                        super.field11291 = (int) ((double) super.field11291 + (double) arg1 * var77);
                                        super.field11290 = (int) ((double) super.field11290 + (double) arg1 * var79);
                                    }
                                }
                                var59 = (class554) class411.field6071.method1016(40);
                            }
                        }
                    }
                }
            }
            if (var8.field3650 != null) {
                if (var8.field3656 == null) {
                    var8.field3656 = new int[var8.field3650.length];
                    for (int var81 = 0; var81 < var8.field3650.length; ++var81) {
                        class360.method2930(115, var8.field3650[var81]);
                        var8.field3656[var81] = ((class609) class680.field9858.method977((long) var8.field3650[var81], 1)).field8902;
                    }
                }
                for (int var82 = 0; var82 < var8.field3656.length; ++var82) {
                    class542 var83 = class587.field8640[var8.field3656[var82]];
                    if (var83.field8125 == 0) {
                        var13 += (double) (var83.field8120 * arg1);
                        var15 += (double) (var83.field8112 * arg1);
                        var17 += (double) (var83.field8127 * arg1);
                        var19 = true;
                    } else {
                        super.field11286 += var83.field8120 * arg1;
                        super.field11291 += var83.field8112 * arg1;
                        super.field11290 += var83.field8127 * arg1;
                    }
                }
            }
            if (var19) {
                while (true) {
                    if (!(var13 > 32767.0D) && !(var15 > 32767.0D) && !(var17 > 32767.0D) && !(var13 < -32767.0D) && !(var15 < -32767.0D) && !(var17 < -32767.0D)) {
                        this.field5900 = (short) ((int) var13);
                        this.field5898 = (short) ((int) var15);
                        this.field5894 = (short) ((int) var17);
                        break;
                    }
                    var13 /= 2.0D;
                    var15 /= 2.0D;
                    var17 /= 2.0D;
                    this.field5899 <<= 1;
                }
            }
            super.field11286 = (int) ((long) super.field11286 + ((long) (this.field5899 << 2) * (long) this.field5900 >> 23) * (long) arg1);
            super.field11291 = (int) ((long) super.field11291 + ((long) (this.field5899 << 2) * (long) this.field5898 >> 23) * (long) arg1);
            super.field11290 = (int) ((long) super.field11290 + ((long) (this.field5899 << 2) * (long) this.field5894 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "()V")
    private final void method3116() {
        int var1 = this.field5897.field3958.field9100;
        if (this.field5897.field3958.field9098[var1] != null) {
            this.field5897.field3958.field9098[var1].method3112();
        }
        this.field5897.field3958.field9098[var1] = this;
        this.field5893 = (short) this.field5897.field3958.field9100;
        this.field5897.field3958.field9100 = var1 + 1 & 8191;
        this.field5897.field3962.method4541((byte) 50, this);
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lbj;IIIIIIIIIIIZZ)V")
    public class392(class255 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field5897 = arg0;
        super.field11286 = arg1 << 12;
        super.field11291 = arg2 << 12;
        super.field11290 = arg3 << 12;
        super.field11285 = arg9;
        this.field5892 = this.field5896 = (short) arg8;
        super.field11289 = arg10;
        super.field11282 = arg11;
        super.field11283 = arg13;
        this.field5900 = (short) arg4;
        this.field5898 = (short) arg5;
        this.field5894 = (short) arg6;
        this.field5899 = arg7;
        super.field11280 = this.field5897.field3960.field9522;
        this.method3116();
    }
}
