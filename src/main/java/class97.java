import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class97 extends class441 {

    @OriginalMember(owner = "client!ps", name = "x", descriptor = "Lrba;")
    public class434 field1687;

    @OriginalMember(owner = "client!ps", name = "y", descriptor = "S")
    private short field1688;

    @OriginalMember(owner = "client!ps", name = "w", descriptor = "S")
    private short field1686;

    @OriginalMember(owner = "client!ps", name = "C", descriptor = "S")
    private short field1692;

    @OriginalMember(owner = "client!ps", name = "B", descriptor = "S")
    private short field1691;

    @OriginalMember(owner = "client!ps", name = "A", descriptor = "S")
    private short field1690;

    @OriginalMember(owner = "client!ps", name = "z", descriptor = "I")
    private int field1689;

    @OriginalMember(owner = "client!ps", name = "v", descriptor = "I")
    private int field1685;

    @OriginalMember(owner = "client!ps", name = "u", descriptor = "S")
    private short field1684;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "()V")
    public final void method909() {
        this.field1687.field6196.field5587[this.field1684] = null;
        class134.field2248[client.field4219] = this;
        client.field4219 = client.field4219 + 1 & 1023;
        this.method4018(false);
        this.method2536(-108);
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "()V")
    private final void method910() {
        int var1 = this.field1687.field6196.field5588;
        if (this.field1687.field6196.field5587[var1] != null) {
            this.field1687.field6196.field5587[var1].method909();
        }
        this.field1687.field6196.field5587[var1] = this;
        this.field1684 = (short) this.field1687.field6196.field5588;
        this.field1687.field6196.field5588 = var1 + 1 & 8191;
        this.field1687.field6190.method1298(-98, this);
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lha;J)V")
    public final void method911(class59 arg0, long arg1) {
        int var4 = super.field6271 >> class130.field2185 + 12;
        int var5 = super.field6269 >> class130.field2185 + 12;
        int var6 = super.field6276 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class434.field6208 && var5 >= 0 && var5 < class432.field6185) {
            class385 var7 = this.field1687.field6196;
            class226 var8 = this.field1687.field6198;
            class281[] var9 = class683.field9250;
            int var10 = var7.field5595;
            class384 var11 = class649.field8928[var7.field5595][var4][var5];
            if (var11 != null) {
                var10 = var11.field5570;
            }
            int var12 = var9[var10].method1851((byte) -86, var5, var4);
            int var13;
            if (var10 < class510.field7094 - 1) {
                var13 = var9[var10 + 1].method1851((byte) -86, var5, var4);
            } else {
                var13 = var12 - (8 << class130.field2185);
            }
            if (var8.field3239) {
                if (var8.field3226 == -1 && var6 > var12) {
                    this.method909();
                    return;
                }
                if (var8.field3226 >= 0 && var6 > var9[var8.field3226].method1851((byte) -86, var5, var4)) {
                    this.method909();
                    return;
                }
                if (var8.field3265 == -1 && var6 < var13) {
                    this.method909();
                    return;
                }
                if (var8.field3265 >= 0 && var6 < var9[var8.field3265 + 1].method1851((byte) -86, var5, var4)) {
                    this.method909();
                    return;
                }
            }
            int var14;
            for (var14 = class510.field7094 - 1; var14 > 0 && var6 > var9[var14].method1851((byte) -86, var5, var4); --var14) {
            }
            if (var8.field3218 && var14 == 0 && var6 > var9[0].method1851((byte) -86, var5, var4)) {
                this.method909();
            } else if (class510.field7094 - 1 == var14 && var9[var14].method1851((byte) -86, var5, var4) - var6 > 8 << class130.field2185) {
                this.method909();
            } else {
                class384 var15 = class649.field8928[var14][var4][var5];
                if (var15 == null) {
                    if (var14 == 0 || class649.field8928[0][var4][var5] == null) {
                        var15 = class649.field8928[0][var4][var5] = new class384(0);
                    }
                    boolean var16 = class649.field8928[0][var4][var5].field5571 != null;
                    if (var14 == 3 && var16) {
                        this.method909();
                        return;
                    }
                    for (int var17 = 1; var17 <= var14; ++var17) {
                        if (class649.field8928[var17][var4][var5] == null) {
                            var15 = class649.field8928[var17][var4][var5] = new class384(var17);
                            if (var16) {
                                ++var15.field5570;
                            }
                        }
                    }
                }
                if (var8.field3266) {
                    int var18 = super.field6271 >> 12;
                    int var19 = super.field6269 >> 12;
                    if (var15.field5577 != null) {
                        class132 var20 = var15.field5577.method40(arg0, 7);
                        if (var20 != null && var20.method1090(-14735, var19, var6, var18)) {
                            this.method909();
                            return;
                        }
                    }
                    if (var15.field5574 != null) {
                        class132 var21 = var15.field5574.method40(arg0, 7);
                        if (var21 != null && var21.method1090(-14735, var19, var6, var18)) {
                            this.method909();
                            return;
                        }
                    }
                    if (var15.field5573 != null) {
                        class132 var22 = var15.field5573.method40(arg0, 7);
                        if (var22 != null && var22.method1090(-14735, var19, var6, var18)) {
                            this.method909();
                            return;
                        }
                    }
                    for (class474 var23 = var15.field5567; var23 != null; var23 = var23.field6621) {
                        class132 var24 = var23.field6623.method40(arg0, 7);
                        if (var24 != null && var24.method1090(-14735, var19, var6, var18)) {
                            this.method909();
                            return;
                        }
                    }
                }
                var7.field5593.field3774.method3046(this, true);
            }
        } else {
            this.method909();
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lrba;IIIIIIIIIIIZZ)V")
    public final void method912(class434 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field1687 = arg0;
        super.field6271 = arg1 << 12;
        super.field6276 = arg2 << 12;
        super.field6269 = arg3 << 12;
        super.field6270 = arg9;
        this.field1686 = this.field1688 = (short) arg8;
        super.field6273 = arg10;
        super.field6272 = arg11;
        super.field6274 = arg13;
        this.field1692 = (short) arg4;
        this.field1691 = (short) arg5;
        this.field1690 = (short) arg6;
        this.field1689 = arg7;
        super.field6275 = this.field1687.field6193.field6032;
        this.method910();
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(JI)V")
    public final void method913(long arg0, int arg1) {
        this.field1688 = (short) (this.field1688 - arg1);
        if (this.field1688 <= 0) {
            this.method909();
        } else {
            int var4 = super.field6271 >> 12;
            int var5 = super.field6276 >> 12;
            int var6 = super.field6269 >> 12;
            class385 var7 = this.field1687.field6196;
            class226 var8 = this.field1687.field6198;
            if (var8.field3228 != 0) {
                if (this.field1686 - this.field1688 <= var8.field3215) {
                    int var9 = var8.field3268 * arg1 + (this.field1685 >> 16 & 255) + (super.field6270 >> 8 & 65280);
                    int var10 = var8.field3263 * arg1 + (this.field1685 >> 8 & 255) + (super.field6270 & 65280);
                    int var11 = var8.field3247 * arg1 + (super.field6270 << 8 & 65280) + (this.field1685 & 255);
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
                    super.field6270 &= -16777216;
                    super.field6270 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field1685 &= -16777216;
                    this.field1685 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field1686 - this.field1688 <= var8.field3223) {
                    int var12 = var8.field3258 * arg1 + (this.field1685 >> 24 & 255) + (super.field6270 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field6270 &= 16777215;
                    super.field6270 |= (var12 & 65280) << 16;
                    this.field1685 &= 16777215;
                    this.field1685 |= (var12 & 255) << 24;
                }
            }
            if (var8.field3246 != -1 && this.field1686 - this.field1688 <= var8.field3225) {
                this.field1689 += var8.field3219 * arg1;
            }
            if (var8.field3269 != -1 && this.field1686 - this.field1688 <= var8.field3230) {
                super.field6273 += var8.field3281 * arg1;
            }
            double var13 = (double) this.field1692;
            double var15 = (double) this.field1691;
            double var17 = (double) this.field1690;
            boolean var19 = false;
            if (var8.field3278 == 1) {
                int var20 = var4 - this.field1687.field6201.field9276;
                int var21 = var5 - this.field1687.field6201.field9270;
                int var22 = var6 - this.field1687.field6201.field9274;
                int var23 = (int) Math.sqrt((double) (var22 * var22 + var20 * var20 + var21 * var21)) >> 2;
                long var24 = (long) (var8.field3279 * var23 * arg1);
                this.field1689 = (int) ((long) this.field1689 - ((long) this.field1689 * var24 >> 18));
            } else if (var8.field3278 == 2) {
                int var26 = var4 - this.field1687.field6201.field9276;
                int var27 = var5 - this.field1687.field6201.field9270;
                int var28 = var6 - this.field1687.field6201.field9274;
                int var29 = var28 * var28 + var26 * var26 + var27 * var27;
                long var30 = (long) (var8.field3279 * var29 * arg1);
                this.field1689 = (int) ((long) this.field1689 - ((long) this.field1689 * var30 >> 28));
            }
            if (var8.field3244 != null) {
                class362 var32 = var7.field5591.field2642;
                for (class362 var33 = var32.field5207; var32 != var33; var33 = var33.field5207) {
                    class336 var34 = (class336) var33;
                    class558 var35 = var34.field4736;
                    if (var35.field7721 != 1) {
                        boolean var36 = false;
                        for (int var37 = 0; var37 < var8.field3244.length; ++var37) {
                            if (var8.field3244[var37] == var35.field7728) {
                                var36 = true;
                                break;
                            }
                        }
                        if (var36) {
                            double var38 = (double) (var4 - var34.field4744);
                            double var40 = (double) (var5 - var34.field4738);
                            double var42 = (double) (var6 - var34.field4742);
                            double var44 = var42 * var42 + var38 * var38 + var40 * var40;
                            if (!(var44 > (double) var35.field7726)) {
                                double var46 = Math.sqrt(var44);
                                if (var46 == 0.0D) {
                                    var46 = 1.0D;
                                }
                                double var48 = ((double) var34.field4739 * var42 + (double) var34.field4737 * var38 + (double) var35.field7715 * var40) * 65535.0D / ((double) var35.field7724 * var46);
                                if (!(var48 < (double) var35.field7723)) {
                                    double var50 = 0.0D;
                                    if (var35.field7714 == 1) {
                                        var50 = var46 / 16.0D * (double) var35.field7729;
                                    } else if (var35.field7714 == 2) {
                                        var50 = var46 / 16.0D * (var46 / 16.0D) * (double) var35.field7729;
                                    }
                                    if (var35.field7717 == 0) {
                                        if (var35.field7722 == 0) {
                                            var13 += ((double) var34.field4737 - var50) * (double) arg1;
                                            var15 += ((double) var35.field7715 - var50) * (double) arg1;
                                            var17 += ((double) var34.field4739 - var50) * (double) arg1;
                                            var19 = true;
                                        } else {
                                            super.field6271 = (int) ((double) super.field6271 + ((double) var34.field4737 - var50) * (double) arg1);
                                            super.field6276 = (int) ((double) super.field6276 + ((double) var35.field7715 - var50) * (double) arg1);
                                            super.field6269 = (int) ((double) super.field6269 + ((double) var34.field4739 - var50) * (double) arg1);
                                        }
                                    } else {
                                        double var52 = var38 / var46 * (double) var35.field7724;
                                        double var54 = var40 / var46 * (double) var35.field7724;
                                        double var56 = var42 / var46 * (double) var35.field7724;
                                        if (var35.field7722 == 0) {
                                            var13 += (double) arg1 * var52;
                                            var15 += (double) arg1 * var54;
                                            var17 += (double) arg1 * var56;
                                            var19 = true;
                                        } else {
                                            super.field6271 = (int) ((double) super.field6271 + (double) arg1 * var52);
                                            super.field6276 = (int) ((double) super.field6276 + (double) arg1 * var54);
                                            super.field6269 = (int) ((double) super.field6269 + (double) arg1 * var56);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field3222 != null) {
                for (int var58 = 0; var58 < var8.field3222.length; ++var58) {
                    class336 var59 = (class336) class641.field8829.method1190((long) var8.field3222[var58], (byte) 121);
                    while (var59 != null) {
                        class558 var60 = var59.field4736;
                        double var61 = (double) (var4 - var59.field4744);
                        double var63 = (double) (var5 - var59.field4738);
                        double var65 = (double) (var6 - var59.field4742);
                        double var67 = var65 * var65 + var61 * var61 + var63 * var63;
                        if (var67 > (double) var60.field7726) {
                            var59 = (class336) class641.field8829.method1192(true);
                        } else {
                            double var69 = Math.sqrt(var67);
                            if (var69 == 0.0D) {
                                var69 = 1.0D;
                            }
                            double var71 = ((double) var59.field4739 * var65 + (double) var59.field4737 * var61 + (double) var60.field7715 * var63) * 65535.0D / ((double) var60.field7724 * var69);
                            if (var71 < (double) var60.field7723) {
                                var59 = (class336) class641.field8829.method1192(true);
                            } else {
                                double var73 = 0.0D;
                                if (var60.field7714 == 1) {
                                    var73 = var69 / 16.0D * (double) var60.field7729;
                                } else if (var60.field7714 == 2) {
                                    var73 = var69 / 16.0D * (var69 / 16.0D) * (double) var60.field7729;
                                }
                                if (var60.field7717 == 0) {
                                    if (var60.field7722 == 0) {
                                        var13 += ((double) var59.field4737 - var73) * (double) arg1;
                                        var15 += ((double) var60.field7715 - var73) * (double) arg1;
                                        var17 += ((double) var59.field4739 - var73) * (double) arg1;
                                        var19 = true;
                                    } else {
                                        super.field6271 = (int) ((double) super.field6271 + ((double) var59.field4737 - var73) * (double) arg1);
                                        super.field6276 = (int) ((double) super.field6276 + ((double) var60.field7715 - var73) * (double) arg1);
                                        super.field6269 = (int) ((double) super.field6269 + ((double) var59.field4739 - var73) * (double) arg1);
                                    }
                                } else {
                                    double var75 = var61 / var69 * (double) var60.field7724;
                                    double var77 = var63 / var69 * (double) var60.field7724;
                                    double var79 = var65 / var69 * (double) var60.field7724;
                                    if (var60.field7722 == 0) {
                                        var13 += (double) arg1 * var75;
                                        var15 += (double) arg1 * var77;
                                        var17 += (double) arg1 * var79;
                                        var19 = true;
                                    } else {
                                        super.field6271 = (int) ((double) super.field6271 + (double) arg1 * var75);
                                        super.field6276 = (int) ((double) super.field6276 + (double) arg1 * var77);
                                        super.field6269 = (int) ((double) super.field6269 + (double) arg1 * var79);
                                    }
                                }
                                var59 = (class336) class641.field8829.method1192(true);
                            }
                        }
                    }
                }
            }
            if (var8.field3237 != null) {
                if (var8.field3227 == null) {
                    var8.field3227 = new int[var8.field3237.length];
                    for (int var81 = 0; var81 < var8.field3237.length; ++var81) {
                        class513.method3003(false, var8.field3237[var81]);
                        var8.field3227[var81] = ((class113) class275.field3864.method1465((long) var8.field3237[var81], -6008)).field1945;
                    }
                }
                for (int var82 = 0; var82 < var8.field3227.length; ++var82) {
                    class558 var83 = class207.field2970[var8.field3227[var82]];
                    if (var83.field7722 == 0) {
                        var13 += (double) (var83.field7716 * arg1);
                        var15 += (double) (var83.field7715 * arg1);
                        var17 += (double) (var83.field7719 * arg1);
                        var19 = true;
                    } else {
                        super.field6271 += var83.field7716 * arg1;
                        super.field6276 += var83.field7715 * arg1;
                        super.field6269 += var83.field7719 * arg1;
                    }
                }
            }
            if (var19) {
                while (true) {
                    if (!(var13 > 32767.0D) && !(var15 > 32767.0D) && !(var17 > 32767.0D) && !(var13 < -32767.0D) && !(var15 < -32767.0D) && !(var17 < -32767.0D)) {
                        this.field1692 = (short) ((int) var13);
                        this.field1691 = (short) ((int) var15);
                        this.field1690 = (short) ((int) var17);
                        break;
                    }
                    var13 /= 2.0D;
                    var15 /= 2.0D;
                    var17 /= 2.0D;
                    this.field1689 <<= 1;
                }
            }
            super.field6271 = (int) ((long) super.field6271 + ((long) (this.field1689 << 2) * (long) this.field1692 >> 23) * (long) arg1);
            super.field6276 = (int) ((long) super.field6276 + ((long) (this.field1689 << 2) * (long) this.field1691 >> 23) * (long) arg1);
            super.field6269 = (int) ((long) super.field6269 + ((long) (this.field1689 << 2) * (long) this.field1690 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lrba;IIIIIIIIIIIZZ)V")
    public class97(class434 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field1687 = arg0;
        super.field6271 = arg1 << 12;
        super.field6276 = arg2 << 12;
        super.field6269 = arg3 << 12;
        super.field6270 = arg9;
        this.field1686 = this.field1688 = (short) arg8;
        super.field6273 = arg10;
        super.field6272 = arg11;
        super.field6274 = arg13;
        this.field1692 = (short) arg4;
        this.field1691 = (short) arg5;
        this.field1690 = (short) arg6;
        this.field1689 = arg7;
        super.field6275 = this.field1687.field6193.field6032;
        this.method910();
    }
}
