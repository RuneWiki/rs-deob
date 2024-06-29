import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class230 extends class119 {

    @OriginalMember(owner = "client!oi", name = "J", descriptor = "Lbt;")
    public class118 field2845;

    @OriginalMember(owner = "client!oi", name = "G", descriptor = "S")
    private short field2842;

    @OriginalMember(owner = "client!oi", name = "H", descriptor = "S")
    private short field2843;

    @OriginalMember(owner = "client!oi", name = "I", descriptor = "S")
    private short field2844;

    @OriginalMember(owner = "client!oi", name = "F", descriptor = "S")
    private short field2841;

    @OriginalMember(owner = "client!oi", name = "L", descriptor = "S")
    private short field2847;

    @OriginalMember(owner = "client!oi", name = "E", descriptor = "I")
    private int field2840;

    @OriginalMember(owner = "client!oi", name = "K", descriptor = "I")
    private int field2846;

    @OriginalMember(owner = "client!oi", name = "D", descriptor = "S")
    private short field2839;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "()V", line = 5)
    private final void method1377() {
        int var1 = this.field2845.field1313.field4272;
        if (this.field2845.field1313.field4277[var1] != null) {
            this.field2845.field1313.field4277[var1].method1380();
        }
        this.field2845.field1313.field4277[var1] = this;
        this.field2839 = (short) this.field2845.field1313.field4272;
        this.field2845.field1313.field4272 = var1 + 1 & 8191;
        this.field2845.field1312.method1670((byte) -78, this);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(JI)V", line = 15)
    public final void method1378(long arg0, int arg1) {
        this.field2842 = (short) (this.field2842 - arg1);
        if (this.field2842 <= 0) {
            this.method1380();
        } else {
            int var4 = super.field1337 >> 12;
            int var5 = super.field1328 >> 12;
            int var6 = super.field1335 >> 12;
            class339 var7 = this.field2845.field1313;
            class610 var8 = this.field2845.field1305;
            if (var8.field8536 != 0) {
                if (this.field2843 - this.field2842 <= var8.field8544) {
                    int var9 = var8.field8552 * arg1 + (this.field2846 >> 16 & 255) + (super.field1330 >> 8 & 65280);
                    int var10 = var8.field8589 * arg1 + (this.field2846 >> 8 & 255) + (super.field1330 & 65280);
                    int var11 = var8.field8528 * arg1 + (super.field1330 << 8 & 65280) + (this.field2846 & 255);
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
                    super.field1330 &= -16777216;
                    super.field1330 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field2846 &= -16777216;
                    this.field2846 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field2843 - this.field2842 <= var8.field8532) {
                    int var12 = var8.field8563 * arg1 + (this.field2846 >> 24 & 255) + (super.field1330 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field1330 &= 16777215;
                    super.field1330 |= (var12 & 65280) << 16;
                    this.field2846 &= 16777215;
                    this.field2846 |= (var12 & 255) << 24;
                }
            }
            if (var8.field8585 != -1 && this.field2843 - this.field2842 <= var8.field8590) {
                this.field2840 += var8.field8531 * arg1;
            }
            if (var8.field8547 != -1 && this.field2843 - this.field2842 <= var8.field8588) {
                super.field1333 += var8.field8525 * arg1;
            }
            double var13 = (double) this.field2844;
            double var15 = (double) this.field2841;
            double var17 = (double) this.field2847;
            boolean var19 = false;
            if (var8.field8566 == 1) {
                int var20 = var4 - this.field2845.field1310.field921;
                int var21 = var5 - this.field2845.field1310.field929;
                int var22 = var6 - this.field2845.field1310.field931;
                int var23 = (int) Math.sqrt((double) (var22 * var22 + var20 * var20 + var21 * var21)) >> 2;
                long var24 = (long) (var8.field8545 * var23 * arg1);
                this.field2840 = (int) ((long) this.field2840 - ((long) this.field2840 * var24 >> 18));
            } else if (var8.field8566 == 2) {
                int var26 = var4 - this.field2845.field1310.field921;
                int var27 = var5 - this.field2845.field1310.field929;
                int var28 = var6 - this.field2845.field1310.field931;
                int var29 = var28 * var28 + var26 * var26 + var27 * var27;
                long var30 = (long) (var8.field8545 * var29 * arg1);
                this.field2840 = (int) ((long) this.field2840 - ((long) this.field2840 * var30 >> 28));
            }
            if (var8.field8576 != null) {
                class333 var32 = var7.field4278.field8677;
                for (class333 var33 = var32.field4181; var32 != var33; var33 = var33.field4181) {
                    class563 var34 = (class563) var33;
                    class695 var35 = var34.field8049;
                    if (var35.field9735 != 1) {
                        boolean var36 = false;
                        for (int var37 = 0; var37 < var8.field8576.length; ++var37) {
                            if (var8.field8576[var37] == var35.field9743) {
                                var36 = true;
                                break;
                            }
                        }
                        if (var36) {
                            double var38 = (double) (var4 - var34.field8040);
                            double var40 = (double) (var5 - var34.field8043);
                            double var42 = (double) (var6 - var34.field8039);
                            double var44 = var42 * var42 + var38 * var38 + var40 * var40;
                            if (!(var44 > (double) var35.field9747)) {
                                double var46 = Math.sqrt(var44);
                                if (var46 == 0.0D) {
                                    var46 = 1.0D;
                                }
                                double var48 = ((double) var34.field8037 * var42 + (double) var34.field8041 * var38 + (double) var35.field9751 * var40) * 65535.0D / ((double) var35.field9753 * var46);
                                if (!(var48 < (double) var35.field9754)) {
                                    double var50 = 0.0D;
                                    if (var35.field9741 == 1) {
                                        var50 = var46 / 16.0D * (double) var35.field9736;
                                    } else if (var35.field9741 == 2) {
                                        var50 = var46 / 16.0D * (var46 / 16.0D) * (double) var35.field9736;
                                    }
                                    if (var35.field9749 == 0) {
                                        if (var35.field9737 == 0) {
                                            var13 += ((double) var34.field8041 - var50) * (double) arg1;
                                            var15 += ((double) var35.field9751 - var50) * (double) arg1;
                                            var17 += ((double) var34.field8037 - var50) * (double) arg1;
                                            var19 = true;
                                        } else {
                                            super.field1337 = (int) ((double) super.field1337 + ((double) var34.field8041 - var50) * (double) arg1);
                                            super.field1328 = (int) ((double) super.field1328 + ((double) var35.field9751 - var50) * (double) arg1);
                                            super.field1335 = (int) ((double) super.field1335 + ((double) var34.field8037 - var50) * (double) arg1);
                                        }
                                    } else {
                                        double var52 = var38 / var46 * (double) var35.field9753;
                                        double var54 = var40 / var46 * (double) var35.field9753;
                                        double var56 = var42 / var46 * (double) var35.field9753;
                                        if (var35.field9737 == 0) {
                                            var13 += (double) arg1 * var52;
                                            var15 += (double) arg1 * var54;
                                            var17 += (double) arg1 * var56;
                                            var19 = true;
                                        } else {
                                            super.field1337 = (int) ((double) super.field1337 + (double) arg1 * var52);
                                            super.field1328 = (int) ((double) super.field1328 + (double) arg1 * var54);
                                            super.field1335 = (int) ((double) super.field1335 + (double) arg1 * var56);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field8535 != null) {
                for (int var58 = 0; var58 < var8.field8535.length; ++var58) {
                    class563 var59 = (class563) class165.field1838.method682(-123, (long) var8.field8535[var58]);
                    while (var59 != null) {
                        class695 var60 = var59.field8049;
                        double var61 = (double) (var4 - var59.field8040);
                        double var63 = (double) (var5 - var59.field8043);
                        double var65 = (double) (var6 - var59.field8039);
                        double var67 = var65 * var65 + var61 * var61 + var63 * var63;
                        if (var67 > (double) var60.field9747) {
                            var59 = (class563) class165.field1838.method680(-27978);
                        } else {
                            double var69 = Math.sqrt(var67);
                            if (var69 == 0.0D) {
                                var69 = 1.0D;
                            }
                            double var71 = ((double) var59.field8037 * var65 + (double) var59.field8041 * var61 + (double) var60.field9751 * var63) * 65535.0D / ((double) var60.field9753 * var69);
                            if (var71 < (double) var60.field9754) {
                                var59 = (class563) class165.field1838.method680(-27978);
                            } else {
                                double var73 = 0.0D;
                                if (var60.field9741 == 1) {
                                    var73 = var69 / 16.0D * (double) var60.field9736;
                                } else if (var60.field9741 == 2) {
                                    var73 = var69 / 16.0D * (var69 / 16.0D) * (double) var60.field9736;
                                }
                                if (var60.field9749 == 0) {
                                    if (var60.field9737 == 0) {
                                        var13 += ((double) var59.field8041 - var73) * (double) arg1;
                                        var15 += ((double) var60.field9751 - var73) * (double) arg1;
                                        var17 += ((double) var59.field8037 - var73) * (double) arg1;
                                        var19 = true;
                                    } else {
                                        super.field1337 = (int) ((double) super.field1337 + ((double) var59.field8041 - var73) * (double) arg1);
                                        super.field1328 = (int) ((double) super.field1328 + ((double) var60.field9751 - var73) * (double) arg1);
                                        super.field1335 = (int) ((double) super.field1335 + ((double) var59.field8037 - var73) * (double) arg1);
                                    }
                                } else {
                                    double var75 = var61 / var69 * (double) var60.field9753;
                                    double var77 = var63 / var69 * (double) var60.field9753;
                                    double var79 = var65 / var69 * (double) var60.field9753;
                                    if (var60.field9737 == 0) {
                                        var13 += (double) arg1 * var75;
                                        var15 += (double) arg1 * var77;
                                        var17 += (double) arg1 * var79;
                                        var19 = true;
                                    } else {
                                        super.field1337 = (int) ((double) super.field1337 + (double) arg1 * var75);
                                        super.field1328 = (int) ((double) super.field1328 + (double) arg1 * var77);
                                        super.field1335 = (int) ((double) super.field1335 + (double) arg1 * var79);
                                    }
                                }
                                var59 = (class563) class165.field1838.method680(-27978);
                            }
                        }
                    }
                }
            }
            if (var8.field8573 != null) {
                if (var8.field8558 == null) {
                    var8.field8558 = new int[var8.field8573.length];
                    for (int var81 = 0; var81 < var8.field8573.length; ++var81) {
                        class87.method454(-7, var8.field8573[var81]);
                        var8.field8558[var81] = ((class22) class471.field6753.method3669((long) var8.field8573[var81], -1)).field168;
                    }
                }
                for (int var82 = 0; var82 < var8.field8558.length; ++var82) {
                    class695 var83 = class490.field7125[var8.field8558[var82]];
                    if (var83.field9737 == 0) {
                        var13 += (double) (var83.field9738 * arg1);
                        var15 += (double) (var83.field9751 * arg1);
                        var17 += (double) (var83.field9750 * arg1);
                        var19 = true;
                    } else {
                        super.field1337 += var83.field9738 * arg1;
                        super.field1328 += var83.field9751 * arg1;
                        super.field1335 += var83.field9750 * arg1;
                    }
                }
            }
            if (var19) {
                while (true) {
                    if (!(var13 > 32767.0D) && !(var15 > 32767.0D) && !(var17 > 32767.0D) && !(var13 < -32767.0D) && !(var15 < -32767.0D) && !(var17 < -32767.0D)) {
                        this.field2844 = (short) ((int) var13);
                        this.field2841 = (short) ((int) var15);
                        this.field2847 = (short) ((int) var17);
                        break;
                    }
                    var13 /= 2.0D;
                    var15 /= 2.0D;
                    var17 /= 2.0D;
                    this.field2840 <<= 1;
                }
            }
            super.field1337 = (int) ((long) super.field1337 + ((long) (this.field2840 << 2) * (long) this.field2844 >> 23) * (long) arg1);
            super.field1328 = (int) ((long) super.field1328 + ((long) (this.field2840 << 2) * (long) this.field2841 >> 23) * (long) arg1);
            super.field1335 = (int) ((long) super.field1335 + ((long) (this.field2840 << 2) * (long) this.field2847 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lr;J)V", line = 411)
    public final void method1379(class564 arg0, long arg1) {
        int var4 = super.field1337 >> class559.field7984 + 12;
        int var5 = super.field1335 >> class559.field7984 + 12;
        int var6 = super.field1328 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class122.field1369 && var5 >= 0 && var5 < class247.field3058) {
            class339 var7 = this.field2845.field1313;
            class610 var8 = this.field2845.field1305;
            class274[] var9 = class156.field1743;
            int var10 = var7.field4280;
            class499 var11 = class487.field7044[var7.field4280][var4][var5];
            if (var11 != null) {
                var10 = var11.field7211;
            }
            int var12 = var9[var10].method1608(var5, 840, var4);
            int var13;
            if (var10 < class612.field8618 - 1) {
                var13 = var9[var10 + 1].method1608(var5, 840, var4);
            } else {
                var13 = var12 - (8 << class559.field7984);
            }
            if (var8.field8534) {
                if (var8.field8578 == -1 && var6 > var12) {
                    this.method1380();
                    return;
                }
                if (var8.field8578 >= 0 && var6 > var9[var8.field8578].method1608(var5, 840, var4)) {
                    this.method1380();
                    return;
                }
                if (var8.field8581 == -1 && var6 < var13) {
                    this.method1380();
                    return;
                }
                if (var8.field8581 >= 0 && var6 < var9[var8.field8581 + 1].method1608(var5, 840, var4)) {
                    this.method1380();
                    return;
                }
            }
            int var14;
            for (var14 = class612.field8618 - 1; var14 > 0 && var6 > var9[var14].method1608(var5, 840, var4); --var14) {
            }
            if (var8.field8527 && var14 == 0 && var6 > var9[0].method1608(var5, 840, var4)) {
                this.method1380();
            } else if (class612.field8618 - 1 == var14 && var9[var14].method1608(var5, 840, var4) - var6 > 8 << class559.field7984) {
                this.method1380();
            } else {
                class499 var15 = class487.field7044[var14][var4][var5];
                if (var15 == null) {
                    if (var14 == 0 || class487.field7044[0][var4][var5] == null) {
                        var15 = class487.field7044[0][var4][var5] = new class499(0);
                    }
                    boolean var16 = class487.field7044[0][var4][var5].field7225 != null;
                    if (var14 == 3 && var16) {
                        this.method1380();
                        return;
                    }
                    for (int var17 = 1; var17 <= var14; ++var17) {
                        if (class487.field7044[var17][var4][var5] == null) {
                            var15 = class487.field7044[var17][var4][var5] = new class499(var17);
                            if (var16) {
                                ++var15.field7211;
                            }
                        }
                    }
                }
                if (var8.field8574) {
                    int var18 = super.field1337 >> 12;
                    int var19 = super.field1335 >> 12;
                    if (var15.field7218 != null) {
                        class676 var20 = var15.field7218.method185(arg0, 64);
                        if (var20 != null && var20.method3732(var19, var18, 16384, var6)) {
                            this.method1380();
                            return;
                        }
                    }
                    if (var15.field7223 != null) {
                        class676 var21 = var15.field7223.method185(arg0, 115);
                        if (var21 != null && var21.method3732(var19, var18, 16384, var6)) {
                            this.method1380();
                            return;
                        }
                    }
                    if (var15.field7230 != null) {
                        class676 var22 = var15.field7230.method185(arg0, 56);
                        if (var22 != null && var22.method3732(var19, var18, 16384, var6)) {
                            this.method1380();
                            return;
                        }
                    }
                    for (class245 var23 = var15.field7215; var23 != null; var23 = var23.field3027) {
                        class676 var24 = var23.field3029.method185(arg0, 76);
                        if (var24 != null && var24.method3732(var19, var18, 16384, var6)) {
                            this.method1380();
                            return;
                        }
                    }
                }
                var7.field4283.field4171.method395(this, false);
            }
        } else {
            this.method1380();
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "()V", line = 584)
    public final void method1380() {
        this.field2845.field1313.field4277[this.field2839] = null;
        class285.field3564[class555.field7932] = this;
        class555.field7932 = class555.field7932 + 1 & 1023;
        this.method1821(64);
        this.method3006((byte) 118);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lbt;IIIIIIIIIIIZZ)V", line = 592)
    public final void method1381(class118 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field2845 = arg0;
        super.field1337 = arg1 << 12;
        super.field1328 = arg2 << 12;
        super.field1335 = arg3 << 12;
        super.field1330 = arg9;
        this.field2843 = this.field2842 = (short) arg8;
        super.field1333 = arg10;
        super.field1331 = arg11;
        super.field1332 = arg13;
        this.field2844 = (short) arg4;
        this.field2841 = (short) arg5;
        this.field2847 = (short) arg6;
        this.field2840 = arg7;
        super.field1325 = this.field2845.field1309.field943;
        this.method1377();
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lbt;IIIIIIIIIIIZZ)V", line = 616)
    public class230(class118 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field2845 = arg0;
        super.field1337 = arg1 << 12;
        super.field1328 = arg2 << 12;
        super.field1335 = arg3 << 12;
        super.field1330 = arg9;
        this.field2843 = this.field2842 = (short) arg8;
        super.field1333 = arg10;
        super.field1331 = arg11;
        super.field1332 = arg13;
        this.field2844 = (short) arg4;
        this.field2841 = (short) arg5;
        this.field2847 = (short) arg6;
        this.field2840 = arg7;
        super.field1325 = this.field2845.field1309.field943;
        this.method1377();
    }
}
