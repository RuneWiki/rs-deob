import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class202 extends class26 {

    @OriginalMember(owner = "client!fe", name = "K", descriptor = "Lfp;")
    public class575 field2553;

    @OriginalMember(owner = "client!fe", name = "E", descriptor = "S")
    private short field2547;

    @OriginalMember(owner = "client!fe", name = "D", descriptor = "S")
    private short field2546;

    @OriginalMember(owner = "client!fe", name = "G", descriptor = "S")
    private short field2549;

    @OriginalMember(owner = "client!fe", name = "I", descriptor = "S")
    private short field2551;

    @OriginalMember(owner = "client!fe", name = "A", descriptor = "S")
    private short field2545;

    @OriginalMember(owner = "client!fe", name = "J", descriptor = "I")
    private int field2552;

    @OriginalMember(owner = "client!fe", name = "H", descriptor = "I")
    private int field2550;

    @OriginalMember(owner = "client!fe", name = "F", descriptor = "S")
    private short field2548;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lr;J)V", line = 6)
    public final void method1216(class566 arg0, long arg1) {
        int var4 = super.field393 >> class52.field775 + 12;
        int var5 = super.field388 >> class52.field775 + 12;
        int var6 = super.field390 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class429.field5383 && var5 >= 0 && var5 < class37.field508) {
            class93 var7 = this.field2553.field8025;
            class446 var8 = this.field2553.field8020;
            class272[] var9 = class491.field6485;
            int var10 = var7.field1304;
            class75 var11 = class270.field3423[var7.field1304][var4][var5];
            if (var11 != null) {
                var10 = var11.field1028;
            }
            int var12 = var9[var10].method1562(var5, (byte) 51, var4);
            int var13;
            if (var10 < class391.field4927 - 1) {
                var13 = var9[var10 + 1].method1562(var5, (byte) 51, var4);
            } else {
                var13 = var12 - (8 << class52.field775);
            }
            if (var8.field5672) {
                if (var8.field5693 == -1 && var6 > var12) {
                    this.method1218();
                    return;
                }
                if (var8.field5693 >= 0 && var6 > var9[var8.field5693].method1562(var5, (byte) 51, var4)) {
                    this.method1218();
                    return;
                }
                if (var8.field5725 == -1 && var6 < var13) {
                    this.method1218();
                    return;
                }
                if (var8.field5725 >= 0 && var6 < var9[var8.field5725 + 1].method1562(var5, (byte) 51, var4)) {
                    this.method1218();
                    return;
                }
            }
            int var14;
            for (var14 = class391.field4927 - 1; var14 > 0 && var6 > var9[var14].method1562(var5, (byte) 51, var4); --var14) {
            }
            if (var8.field5713 && var14 == 0 && var6 > var9[0].method1562(var5, (byte) 51, var4)) {
                this.method1218();
            } else if (class391.field4927 - 1 == var14 && var9[var14].method1562(var5, (byte) 51, var4) - var6 > 8 << class52.field775) {
                this.method1218();
            } else {
                class75 var15 = class270.field3423[var14][var4][var5];
                if (var15 == null) {
                    if (var14 == 0 || class270.field3423[0][var4][var5] == null) {
                        var15 = class270.field3423[0][var4][var5] = new class75(0);
                    }
                    boolean var16 = class270.field3423[0][var4][var5].field1023 != null;
                    if (var14 == 3 && var16) {
                        this.method1218();
                        return;
                    }
                    for (int var17 = 1; var17 <= var14; ++var17) {
                        if (class270.field3423[var17][var4][var5] == null) {
                            var15 = class270.field3423[var17][var4][var5] = new class75(var17);
                            if (var16) {
                                ++var15.field1028;
                            }
                        }
                    }
                }
                if (var8.field5685) {
                    int var18 = super.field393 >> 12;
                    int var19 = super.field388 >> 12;
                    if (var15.field1030 != null) {
                        class362 var20 = var15.field1030.method82(arg0, -1660704056);
                        if (var20 != null && var20.method1988(var18, var19, -41, var6)) {
                            this.method1218();
                            return;
                        }
                    }
                    if (var15.field1026 != null) {
                        class362 var21 = var15.field1026.method82(arg0, -1660704056);
                        if (var21 != null && var21.method1988(var18, var19, 5, var6)) {
                            this.method1218();
                            return;
                        }
                    }
                    if (var15.field1031 != null) {
                        class362 var22 = var15.field1031.method82(arg0, -1660704056);
                        if (var22 != null && var22.method1988(var18, var19, 126, var6)) {
                            this.method1218();
                            return;
                        }
                    }
                    for (class138 var23 = var15.field1024; var23 != null; var23 = var23.field1789) {
                        class362 var24 = var23.field1786.method82(arg0, -1660704056);
                        if (var24 != null && var24.method1988(var18, var19, -51, var6)) {
                            this.method1218();
                            return;
                        }
                    }
                }
                var7.field1302.field399.method850((byte) 126, this);
            }
        } else {
            this.method1218();
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(JI)V", line = 179)
    public final void method1217(long arg0, int arg1) {
        this.field2547 = (short) (this.field2547 - arg1);
        if (this.field2547 <= 0) {
            this.method1218();
        } else {
            int var4 = super.field393 >> 12;
            int var5 = super.field390 >> 12;
            int var6 = super.field388 >> 12;
            class93 var7 = this.field2553.field8025;
            class446 var8 = this.field2553.field8020;
            if (var8.field5718 != 0) {
                if (this.field2546 - this.field2547 <= var8.field5680) {
                    int var9 = var8.field5721 * arg1 + (super.field386 >> 8 & 65280) + (this.field2550 >> 16 & 255);
                    int var10 = var8.field5687 * arg1 + (this.field2550 >> 8 & 255) + (super.field386 & 65280);
                    int var11 = var8.field5665 * arg1 + (super.field386 << 8 & 65280) + (this.field2550 & 255);
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
                    super.field386 &= -16777216;
                    super.field386 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field2550 &= -16777216;
                    this.field2550 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field2546 - this.field2547 <= var8.field5723) {
                    int var12 = var8.field5709 * arg1 + (super.field386 >> 16 & 65280) + (this.field2550 >> 24 & 255);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field386 &= 16777215;
                    super.field386 |= (var12 & 65280) << 16;
                    this.field2550 &= 16777215;
                    this.field2550 |= (var12 & 255) << 24;
                }
            }
            if (var8.field5668 != -1 && this.field2546 - this.field2547 <= var8.field5719) {
                this.field2552 += var8.field5710 * arg1;
            }
            if (var8.field5698 != -1 && this.field2546 - this.field2547 <= var8.field5702) {
                super.field385 += var8.field5663 * arg1;
            }
            double var13 = (double) this.field2549;
            double var15 = (double) this.field2551;
            double var17 = (double) this.field2545;
            boolean var19 = false;
            if (var8.field5684 == 1) {
                int var20 = var4 - this.field2553.field8017.field8292;
                int var21 = var5 - this.field2553.field8017.field8308;
                int var22 = var6 - this.field2553.field8017.field8300;
                int var23 = (int) Math.sqrt((double) (var22 * var22 + var20 * var20 + var21 * var21)) >> 2;
                long var24 = (long) (var8.field5730 * var23 * arg1);
                this.field2552 = (int) ((long) this.field2552 - ((long) this.field2552 * var24 >> 18));
            } else if (var8.field5684 == 2) {
                int var26 = var4 - this.field2553.field8017.field8292;
                int var27 = var5 - this.field2553.field8017.field8308;
                int var28 = var6 - this.field2553.field8017.field8300;
                int var29 = var28 * var28 + var26 * var26 + var27 * var27;
                long var30 = (long) (var8.field5730 * var29 * arg1);
                this.field2552 = (int) ((long) this.field2552 - ((long) this.field2552 * var30 >> 28));
            }
            if (var8.field5697 != null) {
                class329 var32 = var7.field1298.field541;
                for (class329 var33 = var32.field4201; var32 != var33; var33 = var33.field4201) {
                    class682 var34 = (class682) var33;
                    class422 var35 = var34.field9586;
                    if (var35.field5290 != 1) {
                        boolean var36 = false;
                        for (int var37 = 0; var37 < var8.field5697.length; ++var37) {
                            if (var8.field5697[var37] == var35.field5298) {
                                var36 = true;
                                break;
                            }
                        }
                        if (var36) {
                            double var38 = (double) (var4 - var34.field9583);
                            double var40 = (double) (var5 - var34.field9590);
                            double var42 = (double) (var6 - var34.field9585);
                            double var44 = var42 * var42 + var38 * var38 + var40 * var40;
                            if (!(var44 > (double) var35.field5305)) {
                                double var46 = Math.sqrt(var44);
                                if (var46 == 0.0D) {
                                    var46 = 1.0D;
                                }
                                double var48 = ((double) var34.field9584 * var42 + (double) var34.field9589 * var38 + (double) var35.field5303 * var40) * 65535.0D / ((double) var35.field5304 * var46);
                                if (!(var48 < (double) var35.field5297)) {
                                    double var50 = 0.0D;
                                    if (var35.field5300 == 1) {
                                        var50 = var46 / 16.0D * (double) var35.field5296;
                                    } else if (var35.field5300 == 2) {
                                        var50 = var46 / 16.0D * (var46 / 16.0D) * (double) var35.field5296;
                                    }
                                    if (var35.field5299 == 0) {
                                        if (var35.field5295 == 0) {
                                            var13 += ((double) var34.field9589 - var50) * (double) arg1;
                                            var15 += ((double) var35.field5303 - var50) * (double) arg1;
                                            var17 += ((double) var34.field9584 - var50) * (double) arg1;
                                            var19 = true;
                                        } else {
                                            super.field393 = (int) ((double) super.field393 + ((double) var34.field9589 - var50) * (double) arg1);
                                            super.field390 = (int) ((double) super.field390 + ((double) var35.field5303 - var50) * (double) arg1);
                                            super.field388 = (int) ((double) super.field388 + ((double) var34.field9584 - var50) * (double) arg1);
                                        }
                                    } else {
                                        double var52 = var38 / var46 * (double) var35.field5304;
                                        double var54 = var40 / var46 * (double) var35.field5304;
                                        double var56 = var42 / var46 * (double) var35.field5304;
                                        if (var35.field5295 == 0) {
                                            var13 += (double) arg1 * var52;
                                            var15 += (double) arg1 * var54;
                                            var17 += (double) arg1 * var56;
                                            var19 = true;
                                        } else {
                                            super.field393 = (int) ((double) super.field393 + (double) arg1 * var52);
                                            super.field390 = (int) ((double) super.field390 + (double) arg1 * var54);
                                            super.field388 = (int) ((double) super.field388 + (double) arg1 * var56);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field5695 != null) {
                for (int var58 = 0; var58 < var8.field5695.length; ++var58) {
                    class682 var59 = (class682) class160.field2096.method1421(-1, (long) var8.field5695[var58]);
                    while (var59 != null) {
                        class422 var60 = var59.field9586;
                        double var61 = (double) (var4 - var59.field9583);
                        double var63 = (double) (var5 - var59.field9590);
                        double var65 = (double) (var6 - var59.field9585);
                        double var67 = var65 * var65 + var61 * var61 + var63 * var63;
                        if (var67 > (double) var60.field5305) {
                            var59 = (class682) class160.field2096.method1425(23986);
                        } else {
                            double var69 = Math.sqrt(var67);
                            if (var69 == 0.0D) {
                                var69 = 1.0D;
                            }
                            double var71 = ((double) var59.field9584 * var65 + (double) var59.field9589 * var61 + (double) var60.field5303 * var63) * 65535.0D / ((double) var60.field5304 * var69);
                            if (var71 < (double) var60.field5297) {
                                var59 = (class682) class160.field2096.method1425(23986);
                            } else {
                                double var73 = 0.0D;
                                if (var60.field5300 == 1) {
                                    var73 = var69 / 16.0D * (double) var60.field5296;
                                } else if (var60.field5300 == 2) {
                                    var73 = var69 / 16.0D * (var69 / 16.0D) * (double) var60.field5296;
                                }
                                if (var60.field5299 == 0) {
                                    if (var60.field5295 == 0) {
                                        var13 += ((double) var59.field9589 - var73) * (double) arg1;
                                        var15 += ((double) var60.field5303 - var73) * (double) arg1;
                                        var17 += ((double) var59.field9584 - var73) * (double) arg1;
                                        var19 = true;
                                    } else {
                                        super.field393 = (int) ((double) super.field393 + ((double) var59.field9589 - var73) * (double) arg1);
                                        super.field390 = (int) ((double) super.field390 + ((double) var60.field5303 - var73) * (double) arg1);
                                        super.field388 = (int) ((double) super.field388 + ((double) var59.field9584 - var73) * (double) arg1);
                                    }
                                } else {
                                    double var75 = var61 / var69 * (double) var60.field5304;
                                    double var77 = var63 / var69 * (double) var60.field5304;
                                    double var79 = var65 / var69 * (double) var60.field5304;
                                    if (var60.field5295 == 0) {
                                        var13 += (double) arg1 * var75;
                                        var15 += (double) arg1 * var77;
                                        var17 += (double) arg1 * var79;
                                        var19 = true;
                                    } else {
                                        super.field393 = (int) ((double) super.field393 + (double) arg1 * var75);
                                        super.field390 = (int) ((double) super.field390 + (double) arg1 * var77);
                                        super.field388 = (int) ((double) super.field388 + (double) arg1 * var79);
                                    }
                                }
                                var59 = (class682) class160.field2096.method1425(23986);
                            }
                        }
                    }
                }
            }
            if (var8.field5734 != null) {
                if (var8.field5704 == null) {
                    var8.field5704 = new int[var8.field5734.length];
                    for (int var81 = 0; var81 < var8.field5734.length; ++var81) {
                        class119.method644(var8.field5734[var81], false);
                        var8.field5704[var81] = ((class262) class78.field1076.method399(-32748, (long) var8.field5734[var81])).field3229;
                    }
                }
                for (int var82 = 0; var82 < var8.field5704.length; ++var82) {
                    class422 var83 = class463.field5907[var8.field5704[var82]];
                    if (var83.field5295 == 0) {
                        var13 += (double) (var83.field5302 * arg1);
                        var15 += (double) (var83.field5303 * arg1);
                        var17 += (double) (var83.field5292 * arg1);
                        var19 = true;
                    } else {
                        super.field393 += var83.field5302 * arg1;
                        super.field390 += var83.field5303 * arg1;
                        super.field388 += var83.field5292 * arg1;
                    }
                }
            }
            if (var19) {
                while (true) {
                    if (!(var13 > 32767.0D) && !(var15 > 32767.0D) && !(var17 > 32767.0D) && !(var13 < -32767.0D) && !(var15 < -32767.0D) && !(var17 < -32767.0D)) {
                        this.field2549 = (short) ((int) var13);
                        this.field2551 = (short) ((int) var15);
                        this.field2545 = (short) ((int) var17);
                        break;
                    }
                    var13 /= 2.0D;
                    var15 /= 2.0D;
                    var17 /= 2.0D;
                    this.field2552 <<= 1;
                }
            }
            super.field393 = (int) ((long) super.field393 + ((long) (this.field2552 << 2) * (long) this.field2549 >> 23) * (long) arg1);
            super.field390 = (int) ((long) super.field390 + ((long) (this.field2552 << 2) * (long) this.field2551 >> 23) * (long) arg1);
            super.field388 = (int) ((long) super.field388 + ((long) (this.field2552 << 2) * (long) this.field2545 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "()V", line = 575)
    public final void method1218() {
        this.field2553.field8025.field1296[this.field2548] = null;
        class508.field6875[class11.field195] = this;
        class11.field195 = class11.field195 + 1 & 1023;
        this.method3146(2);
        this.method1132(10511);
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "()V", line = 587)
    private final void method1219() {
        int var1 = this.field2553.field8025.field1294;
        if (this.field2553.field8025.field1296[var1] != null) {
            this.field2553.field8025.field1296[var1].method1218();
        }
        this.field2553.field8025.field1296[var1] = this;
        this.field2548 = (short) this.field2553.field8025.field1294;
        this.field2553.field8025.field1294 = var1 + 1 & 8191;
        this.field2553.field8027.method801(this, 80);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lfp;IIIIIIIIIIIZZ)V", line = 598)
    public final void method1220(class575 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field2553 = arg0;
        super.field393 = arg1 << 12;
        super.field390 = arg2 << 12;
        super.field388 = arg3 << 12;
        super.field386 = arg9;
        this.field2546 = this.field2547 = (short) arg8;
        super.field385 = arg10;
        super.field398 = arg11;
        super.field384 = arg13;
        this.field2549 = (short) arg4;
        this.field2551 = (short) arg5;
        this.field2545 = (short) arg6;
        this.field2552 = arg7;
        super.field391 = this.field2553.field8013.field875;
        this.method1219();
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lfp;IIIIIIIIIIIZZ)V", line = 616)
    public class202(class575 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field2553 = arg0;
        super.field393 = arg1 << 12;
        super.field390 = arg2 << 12;
        super.field388 = arg3 << 12;
        super.field386 = arg9;
        this.field2546 = this.field2547 = (short) arg8;
        super.field385 = arg10;
        super.field398 = arg11;
        super.field384 = arg13;
        this.field2549 = (short) arg4;
        this.field2551 = (short) arg5;
        this.field2545 = (short) arg6;
        this.field2552 = arg7;
        super.field391 = this.field2553.field8013.field875;
        this.method1219();
    }
}
