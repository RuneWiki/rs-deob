import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class572 extends class29 {

    @OriginalMember(owner = "client!a", name = "T", descriptor = "Lwh;")
    public class131 field8354;

    @OriginalMember(owner = "client!a", name = "N", descriptor = "S")
    private short field8348;

    @OriginalMember(owner = "client!a", name = "P", descriptor = "S")
    private short field8350;

    @OriginalMember(owner = "client!a", name = "O", descriptor = "S")
    private short field8349;

    @OriginalMember(owner = "client!a", name = "Q", descriptor = "S")
    private short field8351;

    @OriginalMember(owner = "client!a", name = "S", descriptor = "S")
    private short field8353;

    @OriginalMember(owner = "client!a", name = "M", descriptor = "I")
    private int field8347;

    @OriginalMember(owner = "client!a", name = "L", descriptor = "I")
    private int field8346;

    @OriginalMember(owner = "client!a", name = "R", descriptor = "S")
    private short field8352;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()V")
    public final void method3345() {
        this.field8354.field1667.field9768[this.field8352] = null;
        class275.field3765[class551.field8013] = this;
        class551.field8013 = class551.field8013 + 1 & 1023;
        this.method2564((byte) 2);
        this.method3420((byte) -109);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(JI)V")
    public final void method3346(long arg0, int arg1) {
        this.field8348 = (short) (this.field8348 - arg1);
        if (this.field8348 <= 0) {
            this.method3345();
        } else {
            int var4 = super.field624 >> 12;
            int var5 = super.field623 >> 12;
            int var6 = super.field625 >> 12;
            class684 var7 = this.field8354.field1667;
            class216 var8 = this.field8354.field1671;
            if (var8.field2787 != 0) {
                if (this.field8350 - this.field8348 <= var8.field2792) {
                    int var9 = var8.field2798 * arg1 + (this.field8346 >> 16 & 255) + (super.field618 >> 8 & 65280);
                    int var10 = var8.field2808 * arg1 + (this.field8346 >> 8 & 255) + (super.field618 & 65280);
                    int var11 = var8.field2743 * arg1 + (super.field618 << 8 & 65280) + (this.field8346 & 255);
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
                    super.field618 &= -16777216;
                    super.field618 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field8346 &= -16777216;
                    this.field8346 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field8350 - this.field8348 <= var8.field2770) {
                    int var12 = var8.field2755 * arg1 + (this.field8346 >> 24 & 255) + (super.field618 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field618 &= 16777215;
                    super.field618 |= (var12 & 65280) << 16;
                    this.field8346 &= 16777215;
                    this.field8346 |= (var12 & 255) << 24;
                }
            }
            if (var8.field2790 != -1 && this.field8350 - this.field8348 <= var8.field2805) {
                this.field8347 += var8.field2776 * arg1;
            }
            if (var8.field2780 != -1 && this.field8350 - this.field8348 <= var8.field2788) {
                super.field622 += var8.field2795 * arg1;
            }
            double var13 = (double) this.field8349;
            double var15 = (double) this.field8351;
            double var17 = (double) this.field8353;
            boolean var19 = false;
            if (var8.field2764 == 1) {
                int var20 = var4 - this.field8354.field1660.field2196;
                int var21 = var5 - this.field8354.field1660.field2188;
                int var22 = var6 - this.field8354.field1660.field2198;
                int var23 = (int) Math.sqrt((double) (var22 * var22 + var20 * var20 + var21 * var21)) >> 2;
                long var24 = (long) (var8.field2752 * var23 * arg1);
                this.field8347 = (int) ((long) this.field8347 - ((long) this.field8347 * var24 >> 18));
            } else if (var8.field2764 == 2) {
                int var26 = var4 - this.field8354.field1660.field2196;
                int var27 = var5 - this.field8354.field1660.field2188;
                int var28 = var6 - this.field8354.field1660.field2198;
                int var29 = var28 * var28 + var26 * var26 + var27 * var27;
                long var30 = (long) (var8.field2752 * var29 * arg1);
                this.field8347 = (int) ((long) this.field8347 - ((long) this.field8347 * var30 >> 28));
            }
            if (var8.field2789 != null) {
                class513 var32 = var7.field9775.field2232;
                for (class513 var33 = var32.field7520; var32 != var33; var33 = var33.field7520) {
                    class355 var34 = (class355) var33;
                    class705 var35 = var34.field4746;
                    if (var35.field9971 != 1) {
                        boolean var36 = false;
                        for (int var37 = 0; var37 < var8.field2789.length; ++var37) {
                            if (var8.field2789[var37] == var35.field9966) {
                                var36 = true;
                                break;
                            }
                        }
                        if (var36) {
                            double var38 = (double) (var4 - var34.field4743);
                            double var40 = (double) (var5 - var34.field4740);
                            double var42 = (double) (var6 - var34.field4737);
                            double var44 = var42 * var42 + var38 * var38 + var40 * var40;
                            if (!(var44 > (double) var35.field9975)) {
                                double var46 = Math.sqrt(var44);
                                if (var46 == 0.0D) {
                                    var46 = 1.0D;
                                }
                                double var48 = ((double) var34.field4739 * var42 + (double) var34.field4744 * var38 + (double) var35.field9968 * var40) * 65535.0D / ((double) var35.field9980 * var46);
                                if (!(var48 < (double) var35.field9977)) {
                                    double var50 = 0.0D;
                                    if (var35.field9982 == 1) {
                                        var50 = var46 / 16.0D * (double) var35.field9974;
                                    } else if (var35.field9982 == 2) {
                                        var50 = var46 / 16.0D * (var46 / 16.0D) * (double) var35.field9974;
                                    }
                                    if (var35.field9973 == 0) {
                                        if (var35.field9979 == 0) {
                                            var13 += ((double) var34.field4744 - var50) * (double) arg1;
                                            var15 += ((double) var35.field9968 - var50) * (double) arg1;
                                            var17 += ((double) var34.field4739 - var50) * (double) arg1;
                                            var19 = true;
                                        } else {
                                            super.field624 = (int) ((double) super.field624 + ((double) var34.field4744 - var50) * (double) arg1);
                                            super.field623 = (int) ((double) super.field623 + ((double) var35.field9968 - var50) * (double) arg1);
                                            super.field625 = (int) ((double) super.field625 + ((double) var34.field4739 - var50) * (double) arg1);
                                        }
                                    } else {
                                        double var52 = var38 / var46 * (double) var35.field9980;
                                        double var54 = var40 / var46 * (double) var35.field9980;
                                        double var56 = var42 / var46 * (double) var35.field9980;
                                        if (var35.field9979 == 0) {
                                            var13 += (double) arg1 * var52;
                                            var15 += (double) arg1 * var54;
                                            var17 += (double) arg1 * var56;
                                            var19 = true;
                                        } else {
                                            super.field624 = (int) ((double) super.field624 + (double) arg1 * var52);
                                            super.field623 = (int) ((double) super.field623 + (double) arg1 * var54);
                                            super.field625 = (int) ((double) super.field625 + (double) arg1 * var56);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field2757 != null) {
                for (int var58 = 0; var58 < var8.field2757.length; ++var58) {
                    class355 var59 = (class355) class470.field6570.method2210((long) var8.field2757[var58], 89);
                    while (var59 != null) {
                        class705 var60 = var59.field4746;
                        double var61 = (double) (var4 - var59.field4743);
                        double var63 = (double) (var5 - var59.field4740);
                        double var65 = (double) (var6 - var59.field4737);
                        double var67 = var65 * var65 + var61 * var61 + var63 * var63;
                        if (var67 > (double) var60.field9975) {
                            var59 = (class355) class470.field6570.method2209(2);
                        } else {
                            double var69 = Math.sqrt(var67);
                            if (var69 == 0.0D) {
                                var69 = 1.0D;
                            }
                            double var71 = ((double) var59.field4739 * var65 + (double) var59.field4744 * var61 + (double) var60.field9968 * var63) * 65535.0D / ((double) var60.field9980 * var69);
                            if (var71 < (double) var60.field9977) {
                                var59 = (class355) class470.field6570.method2209(2);
                            } else {
                                double var73 = 0.0D;
                                if (var60.field9982 == 1) {
                                    var73 = var69 / 16.0D * (double) var60.field9974;
                                } else if (var60.field9982 == 2) {
                                    var73 = var69 / 16.0D * (var69 / 16.0D) * (double) var60.field9974;
                                }
                                if (var60.field9973 == 0) {
                                    if (var60.field9979 == 0) {
                                        var13 += ((double) var59.field4744 - var73) * (double) arg1;
                                        var15 += ((double) var60.field9968 - var73) * (double) arg1;
                                        var17 += ((double) var59.field4739 - var73) * (double) arg1;
                                        var19 = true;
                                    } else {
                                        super.field624 = (int) ((double) super.field624 + ((double) var59.field4744 - var73) * (double) arg1);
                                        super.field623 = (int) ((double) super.field623 + ((double) var60.field9968 - var73) * (double) arg1);
                                        super.field625 = (int) ((double) super.field625 + ((double) var59.field4739 - var73) * (double) arg1);
                                    }
                                } else {
                                    double var75 = var61 / var69 * (double) var60.field9980;
                                    double var77 = var63 / var69 * (double) var60.field9980;
                                    double var79 = var65 / var69 * (double) var60.field9980;
                                    if (var60.field9979 == 0) {
                                        var13 += (double) arg1 * var75;
                                        var15 += (double) arg1 * var77;
                                        var17 += (double) arg1 * var79;
                                        var19 = true;
                                    } else {
                                        super.field624 = (int) ((double) super.field624 + (double) arg1 * var75);
                                        super.field623 = (int) ((double) super.field623 + (double) arg1 * var77);
                                        super.field625 = (int) ((double) super.field625 + (double) arg1 * var79);
                                    }
                                }
                                var59 = (class355) class470.field6570.method2209(2);
                            }
                        }
                    }
                }
            }
            if (var8.field2756 != null) {
                if (var8.field2760 == null) {
                    var8.field2760 = new int[var8.field2756.length];
                    for (int var81 = 0; var81 < var8.field2756.length; ++var81) {
                        class323.method1875(var8.field2756[var81], (byte) -104);
                        var8.field2760[var81] = ((class556) class346.field4539.method3678((long) var8.field2756[var81], -119)).field8043;
                    }
                }
                for (int var82 = 0; var82 < var8.field2760.length; ++var82) {
                    class705 var83 = class190.field2325[var8.field2760[var82]];
                    if (var83.field9979 == 0) {
                        var13 += (double) (var83.field9969 * arg1);
                        var15 += (double) (var83.field9968 * arg1);
                        var17 += (double) (var83.field9970 * arg1);
                        var19 = true;
                    } else {
                        super.field624 += var83.field9969 * arg1;
                        super.field623 += var83.field9968 * arg1;
                        super.field625 += var83.field9970 * arg1;
                    }
                }
            }
            if (var19) {
                while (true) {
                    if (!(var13 > 32767.0D) && !(var15 > 32767.0D) && !(var17 > 32767.0D) && !(var13 < -32767.0D) && !(var15 < -32767.0D) && !(var17 < -32767.0D)) {
                        this.field8349 = (short) ((int) var13);
                        this.field8351 = (short) ((int) var15);
                        this.field8353 = (short) ((int) var17);
                        break;
                    }
                    var13 /= 2.0D;
                    var15 /= 2.0D;
                    var17 /= 2.0D;
                    this.field8347 <<= 1;
                }
            }
            super.field624 = (int) ((long) super.field624 + ((long) (this.field8347 << 2) * (long) this.field8349 >> 23) * (long) arg1);
            super.field623 = (int) ((long) super.field623 + ((long) (this.field8347 << 2) * (long) this.field8351 >> 23) * (long) arg1);
            super.field625 = (int) ((long) super.field625 + ((long) (this.field8347 << 2) * (long) this.field8353 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "()V")
    private final void method3347() {
        int var1 = this.field8354.field1667.field9773;
        if (this.field8354.field1667.field9768[var1] != null) {
            this.field8354.field1667.field9768[var1].method3345();
        }
        this.field8354.field1667.field9768[var1] = this;
        this.field8352 = (short) this.field8354.field1667.field9773;
        this.field8354.field1667.field9773 = var1 + 1 & 8191;
        this.field8354.field1669.method2071((byte) 100, this);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lr;J)V")
    public final void method3348(class165 arg0, long arg1) {
        int var4 = super.field624 >> class295.field3981 + 12;
        int var5 = super.field625 >> class295.field3981 + 12;
        int var6 = super.field623 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class455.field6393 && var5 >= 0 && var5 < class302.field4057) {
            class684 var7 = this.field8354.field1667;
            class216 var8 = this.field8354.field1671;
            class37[] var9 = class155.field1899;
            int var10 = var7.field9777;
            class433 var11 = class281.field3808[var7.field9777][var4][var5];
            if (var11 != null) {
                var10 = var11.field6205;
            }
            int var12 = var9[var10].method437(93, var5, var4);
            int var13;
            if (var10 < class663.field9391 - 1) {
                var13 = var9[var10 + 1].method437(87, var5, var4);
            } else {
                var13 = var12 - (8 << class295.field3981);
            }
            if (var8.field2749) {
                if (var8.field2802 == -1 && var6 > var12) {
                    this.method3345();
                    return;
                }
                if (var8.field2802 >= 0 && var6 > var9[var8.field2802].method437(90, var5, var4)) {
                    this.method3345();
                    return;
                }
                if (var8.field2762 == -1 && var6 < var13) {
                    this.method3345();
                    return;
                }
                if (var8.field2762 >= 0 && var6 < var9[var8.field2762 + 1].method437(118, var5, var4)) {
                    this.method3345();
                    return;
                }
            }
            int var14;
            for (var14 = class663.field9391 - 1; var14 > 0 && var6 > var9[var14].method437(107, var5, var4); --var14) {
            }
            if (var8.field2741 && var14 == 0 && var6 > var9[0].method437(106, var5, var4)) {
                this.method3345();
            } else if (class663.field9391 - 1 == var14 && var9[var14].method437(123, var5, var4) - var6 > 8 << class295.field3981) {
                this.method3345();
            } else {
                class433 var15 = class281.field3808[var14][var4][var5];
                if (var15 == null) {
                    if (var14 == 0 || class281.field3808[0][var4][var5] == null) {
                        var15 = class281.field3808[0][var4][var5] = new class433(0);
                    }
                    boolean var16 = class281.field3808[0][var4][var5].field6207 != null;
                    if (var14 == 3 && var16) {
                        this.method3345();
                        return;
                    }
                    for (int var17 = 1; var17 <= var14; ++var17) {
                        if (class281.field3808[var17][var4][var5] == null) {
                            var15 = class281.field3808[var17][var4][var5] = new class433(var17);
                            if (var16) {
                                ++var15.field6205;
                            }
                        }
                    }
                }
                if (var8.field2765) {
                    int var18 = super.field624 >> 12;
                    int var19 = super.field625 >> 12;
                    if (var15.field6217 != null) {
                        class229 var20 = var15.field6217.method161((byte) 119, arg0);
                        if (var20 != null && var20.method1388(var19, true, var18, var6)) {
                            this.method3345();
                            return;
                        }
                    }
                    if (var15.field6210 != null) {
                        class229 var21 = var15.field6210.method161((byte) 117, arg0);
                        if (var21 != null && var21.method1388(var19, true, var18, var6)) {
                            this.method3345();
                            return;
                        }
                    }
                    if (var15.field6221 != null) {
                        class229 var22 = var15.field6221.method161((byte) 108, arg0);
                        if (var22 != null && var22.method1388(var19, true, var18, var6)) {
                            this.method3345();
                            return;
                        }
                    }
                    for (class182 var23 = var15.field6218; var23 != null; var23 = var23.field2226) {
                        class229 var24 = var23.field2227.method161((byte) 126, arg0);
                        if (var24 != null && var24.method1388(var19, true, var18, var6)) {
                            this.method3345();
                            return;
                        }
                    }
                }
                var7.field9780.field6248.method870(this, (byte) 106);
            }
        } else {
            this.method3345();
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lwh;IIIIIIIIIIIZZ)V")
    public final void method3349(class131 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field8354 = arg0;
        super.field624 = arg1 << 12;
        super.field623 = arg2 << 12;
        super.field625 = arg3 << 12;
        super.field618 = arg9;
        this.field8350 = this.field8348 = (short) arg8;
        super.field622 = arg10;
        super.field626 = arg11;
        super.field620 = arg13;
        this.field8349 = (short) arg4;
        this.field8351 = (short) arg5;
        this.field8353 = (short) arg6;
        this.field8347 = arg7;
        super.field619 = this.field8354.field1674.field3713;
        this.method3347();
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Lwh;IIIIIIIIIIIZZ)V")
    public class572(class131 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field8354 = arg0;
        super.field624 = arg1 << 12;
        super.field623 = arg2 << 12;
        super.field625 = arg3 << 12;
        super.field618 = arg9;
        this.field8350 = this.field8348 = (short) arg8;
        super.field622 = arg10;
        super.field626 = arg11;
        super.field620 = arg13;
        this.field8349 = (short) arg4;
        this.field8351 = (short) arg5;
        this.field8353 = (short) arg6;
        this.field8347 = arg7;
        super.field619 = this.field8354.field1674.field3713;
        this.method3347();
    }
}
