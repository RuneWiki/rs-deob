import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fja")
public class class200 extends class216 {

    @OriginalMember(owner = "client!fja", name = "I", descriptor = "Lbia;")
    public class341 field2814;

    @OriginalMember(owner = "client!fja", name = "M", descriptor = "S")
    private short field2818;

    @OriginalMember(owner = "client!fja", name = "N", descriptor = "S")
    private short field2819;

    @OriginalMember(owner = "client!fja", name = "L", descriptor = "S")
    private short field2817;

    @OriginalMember(owner = "client!fja", name = "Q", descriptor = "S")
    private short field2822;

    @OriginalMember(owner = "client!fja", name = "P", descriptor = "S")
    private short field2821;

    @OriginalMember(owner = "client!fja", name = "O", descriptor = "I")
    private int field2820;

    @OriginalMember(owner = "client!fja", name = "K", descriptor = "I")
    private int field2816;

    @OriginalMember(owner = "client!fja", name = "J", descriptor = "S")
    private short field2815;

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "(Lha;J)V", line = 4)
    public final void method1291(class473 arg0, long arg1) {
        int var4 = super.field2979 >> class732.field10110 + 12;
        int var5 = super.field2978 >> class732.field10110 + 12;
        int var6 = super.field2982 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class414.field5796 && var5 >= 0 && var5 < class704.field9799) {
            class388 var7 = this.field2814.field4938;
            class542 var8 = this.field2814.field4945;
            class418[] var9 = class661.field9303;
            int var10 = var7.field5534;
            class472 var11 = class59.field688[var7.field5534][var4][var5];
            if (var11 != null) {
                var10 = var11.field6546;
            }
            int var12 = var9[var10].method2525(var4, var5, (byte) 114);
            int var13;
            if (var10 < class266.field3869 - 1) {
                var13 = var9[var10 + 1].method2525(var4, var5, (byte) 114);
            } else {
                var13 = var12 - (8 << class732.field10110);
            }
            if (var8.field7527) {
                if (var8.field7489 == -1 && var6 > var12) {
                    this.method1293();
                    return;
                }
                if (var8.field7489 >= 0 && var6 > var9[var8.field7489].method2525(var4, var5, (byte) 114)) {
                    this.method1293();
                    return;
                }
                if (var8.field7543 == -1 && var6 < var13) {
                    this.method1293();
                    return;
                }
                if (var8.field7543 >= 0 && var6 < var9[var8.field7543 + 1].method2525(var4, var5, (byte) 114)) {
                    this.method1293();
                    return;
                }
            }
            int var14;
            for (var14 = class266.field3869 - 1; var14 > 0 && var6 > var9[var14].method2525(var4, var5, (byte) 114); --var14) {
            }
            if (var8.field7546 && var14 == 0 && var6 > var9[0].method2525(var4, var5, (byte) 114)) {
                this.method1293();
            } else if (class266.field3869 - 1 == var14 && var9[var14].method2525(var4, var5, (byte) 114) - var6 > 8 << class732.field10110) {
                this.method1293();
            } else {
                class472 var15 = class59.field688[var14][var4][var5];
                if (var15 == null) {
                    if (var14 == 0 || class59.field688[0][var4][var5] == null) {
                        var15 = class59.field688[0][var4][var5] = new class472(0);
                    }
                    boolean var16 = class59.field688[0][var4][var5].field6549 != null;
                    if (var14 == 3 && var16) {
                        this.method1293();
                        return;
                    }
                    for (int var17 = 1; var17 <= var14; ++var17) {
                        if (class59.field688[var17][var4][var5] == null) {
                            var15 = class59.field688[var17][var4][var5] = new class472(var17);
                            if (var16) {
                                ++var15.field6546;
                            }
                        }
                    }
                }
                if (var8.field7522) {
                    int var18 = super.field2979 >> 12;
                    int var19 = super.field2978 >> 12;
                    if (var15.field6548 != null) {
                        class491 var20 = var15.field6548.method72(arg0, -5047);
                        if (var20 != null && var20.method2903(var18, var19, var6, (byte) 4)) {
                            this.method1293();
                            return;
                        }
                    }
                    if (var15.field6544 != null) {
                        class491 var21 = var15.field6544.method72(arg0, -5047);
                        if (var21 != null && var21.method2903(var18, var19, var6, (byte) 4)) {
                            this.method1293();
                            return;
                        }
                    }
                    if (var15.field6540 != null) {
                        class491 var22 = var15.field6540.method72(arg0, -5047);
                        if (var22 != null && var22.method2903(var18, var19, var6, (byte) 4)) {
                            this.method1293();
                            return;
                        }
                    }
                    for (class44 var23 = var15.field6551; var23 != null; var23 = var23.field466) {
                        class491 var24 = var23.field465.method72(arg0, -5047);
                        if (var24 != null && var24.method2903(var18, var19, var6, (byte) 4)) {
                            this.method1293();
                            return;
                        }
                    }
                }
                var7.field5536.field9929.method1788(-2, this);
            }
        } else {
            this.method1293();
        }
    }

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "(JI)V", line = 177)
    public final void method1292(long arg0, int arg1) {
        this.field2818 = (short) (this.field2818 - arg1);
        if (this.field2818 <= 0) {
            this.method1293();
        } else {
            int var4 = super.field2979 >> 12;
            int var5 = super.field2982 >> 12;
            int var6 = super.field2978 >> 12;
            class388 var7 = this.field2814.field4938;
            class542 var8 = this.field2814.field4945;
            if (var8.field7500 != 0) {
                if (this.field2819 - this.field2818 <= var8.field7511) {
                    int var9 = var8.field7497 * arg1 + (super.field2983 >> 8 & 65280) + (this.field2816 >> 16 & 255);
                    int var10 = var8.field7532 * arg1 + (this.field2816 >> 8 & 255) + (super.field2983 & 65280);
                    int var11 = var8.field7544 * arg1 + (super.field2983 << 8 & 65280) + (this.field2816 & 255);
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
                    super.field2983 &= -16777216;
                    super.field2983 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field2816 &= -16777216;
                    this.field2816 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field2819 - this.field2818 <= var8.field7518) {
                    int var12 = var8.field7536 * arg1 + (super.field2983 >> 16 & 65280) + (this.field2816 >> 24 & 255);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field2983 &= 16777215;
                    super.field2983 |= (var12 & 65280) << 16;
                    this.field2816 &= 16777215;
                    this.field2816 |= (var12 & 255) << 24;
                }
            }
            if (var8.field7556 != -1 && this.field2819 - this.field2818 <= var8.field7524) {
                this.field2820 += var8.field7503 * arg1;
            }
            if (var8.field7505 != -1 && this.field2819 - this.field2818 <= var8.field7557) {
                super.field2975 += var8.field7501 * arg1;
            }
            double var13 = (double) this.field2817;
            double var15 = (double) this.field2822;
            double var17 = (double) this.field2821;
            boolean var19 = false;
            if (var8.field7529 == 1) {
                int var20 = var4 - this.field2814.field4940.field10834;
                int var21 = var5 - this.field2814.field4940.field10841;
                int var22 = var6 - this.field2814.field4940.field10836;
                int var23 = (int) Math.sqrt((double) (var22 * var22 + var20 * var20 + var21 * var21)) >> 2;
                long var24 = (long) (var8.field7541 * var23 * arg1);
                this.field2820 = (int) ((long) this.field2820 - ((long) this.field2820 * var24 >> 18));
            } else if (var8.field7529 == 2) {
                int var26 = var4 - this.field2814.field4940.field10834;
                int var27 = var5 - this.field2814.field4940.field10841;
                int var28 = var6 - this.field2814.field4940.field10836;
                int var29 = var28 * var28 + var26 * var26 + var27 * var27;
                long var30 = (long) (var8.field7541 * var29 * arg1);
                this.field2820 = (int) ((long) this.field2820 - ((long) this.field2820 * var30 >> 28));
            }
            if (var8.field7491 != null) {
                class69 var32 = var7.field5532.field2103;
                for (class69 var33 = var32.field767; var32 != var33; var33 = var33.field767) {
                    class152 var34 = (class152) var33;
                    class691 var35 = var34.field1991;
                    if (var35.field9645 != 1) {
                        boolean var36 = false;
                        for (int var37 = 0; var37 < var8.field7491.length; ++var37) {
                            if (var8.field7491[var37] == var35.field9640) {
                                var36 = true;
                                break;
                            }
                        }
                        if (var36) {
                            double var38 = (double) (var4 - var34.field1986);
                            double var40 = (double) (var5 - var34.field1987);
                            double var42 = (double) (var6 - var34.field1995);
                            double var44 = var42 * var42 + var38 * var38 + var40 * var40;
                            if (!(var44 > (double) var35.field9637)) {
                                double var46 = Math.sqrt(var44);
                                if (var46 == 0.0D) {
                                    var46 = 1.0D;
                                }
                                double var48 = ((double) var34.field1990 * var42 + (double) var34.field1993 * var38 + (double) var35.field9653 * var40) * 65535.0D / ((double) var35.field9654 * var46);
                                if (!(var48 < (double) var35.field9638)) {
                                    double var50 = 0.0D;
                                    if (var35.field9641 == 1) {
                                        var50 = var46 / 16.0D * (double) var35.field9648;
                                    } else if (var35.field9641 == 2) {
                                        var50 = var46 / 16.0D * (var46 / 16.0D) * (double) var35.field9648;
                                    }
                                    if (var35.field9642 == 0) {
                                        if (var35.field9643 == 0) {
                                            var13 += ((double) var34.field1993 - var50) * (double) arg1;
                                            var15 += ((double) var35.field9653 - var50) * (double) arg1;
                                            var17 += ((double) var34.field1990 - var50) * (double) arg1;
                                            var19 = true;
                                        } else {
                                            super.field2979 = (int) ((double) super.field2979 + ((double) var34.field1993 - var50) * (double) arg1);
                                            super.field2982 = (int) ((double) super.field2982 + ((double) var35.field9653 - var50) * (double) arg1);
                                            super.field2978 = (int) ((double) super.field2978 + ((double) var34.field1990 - var50) * (double) arg1);
                                        }
                                    } else {
                                        double var52 = var38 / var46 * (double) var35.field9654;
                                        double var54 = var40 / var46 * (double) var35.field9654;
                                        double var56 = var42 / var46 * (double) var35.field9654;
                                        if (var35.field9643 == 0) {
                                            var13 += (double) arg1 * var52;
                                            var15 += (double) arg1 * var54;
                                            var17 += (double) arg1 * var56;
                                            var19 = true;
                                        } else {
                                            super.field2979 = (int) ((double) super.field2979 + (double) arg1 * var52);
                                            super.field2982 = (int) ((double) super.field2982 + (double) arg1 * var54);
                                            super.field2978 = (int) ((double) super.field2978 + (double) arg1 * var56);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field7512 != null) {
                for (int var58 = 0; var58 < var8.field7512.length; ++var58) {
                    class152 var59 = (class152) class750.field10359.method263((long) var8.field7512[var58], -1);
                    while (var59 != null) {
                        class691 var60 = var59.field1991;
                        double var61 = (double) (var4 - var59.field1986);
                        double var63 = (double) (var5 - var59.field1987);
                        double var65 = (double) (var6 - var59.field1995);
                        double var67 = var65 * var65 + var61 * var61 + var63 * var63;
                        if (var67 > (double) var60.field9637) {
                            var59 = (class152) class750.field10359.method261(-1);
                        } else {
                            double var69 = Math.sqrt(var67);
                            if (var69 == 0.0D) {
                                var69 = 1.0D;
                            }
                            double var71 = ((double) var59.field1990 * var65 + (double) var59.field1993 * var61 + (double) var60.field9653 * var63) * 65535.0D / ((double) var60.field9654 * var69);
                            if (var71 < (double) var60.field9638) {
                                var59 = (class152) class750.field10359.method261(-1);
                            } else {
                                double var73 = 0.0D;
                                if (var60.field9641 == 1) {
                                    var73 = var69 / 16.0D * (double) var60.field9648;
                                } else if (var60.field9641 == 2) {
                                    var73 = var69 / 16.0D * (var69 / 16.0D) * (double) var60.field9648;
                                }
                                if (var60.field9642 == 0) {
                                    if (var60.field9643 == 0) {
                                        var13 += ((double) var59.field1993 - var73) * (double) arg1;
                                        var15 += ((double) var60.field9653 - var73) * (double) arg1;
                                        var17 += ((double) var59.field1990 - var73) * (double) arg1;
                                        var19 = true;
                                    } else {
                                        super.field2979 = (int) ((double) super.field2979 + ((double) var59.field1993 - var73) * (double) arg1);
                                        super.field2982 = (int) ((double) super.field2982 + ((double) var60.field9653 - var73) * (double) arg1);
                                        super.field2978 = (int) ((double) super.field2978 + ((double) var59.field1990 - var73) * (double) arg1);
                                    }
                                } else {
                                    double var75 = var61 / var69 * (double) var60.field9654;
                                    double var77 = var63 / var69 * (double) var60.field9654;
                                    double var79 = var65 / var69 * (double) var60.field9654;
                                    if (var60.field9643 == 0) {
                                        var13 += (double) arg1 * var75;
                                        var15 += (double) arg1 * var77;
                                        var17 += (double) arg1 * var79;
                                        var19 = true;
                                    } else {
                                        super.field2979 = (int) ((double) super.field2979 + (double) arg1 * var75);
                                        super.field2982 = (int) ((double) super.field2982 + (double) arg1 * var77);
                                        super.field2978 = (int) ((double) super.field2978 + (double) arg1 * var79);
                                    }
                                }
                                var59 = (class152) class750.field10359.method261(-1);
                            }
                        }
                    }
                }
            }
            if (var8.field7516 != null) {
                if (var8.field7499 == null) {
                    var8.field7499 = new int[var8.field7516.length];
                    for (int var81 = 0; var81 < var8.field7516.length; ++var81) {
                        class47.method388(var8.field7516[var81], 1);
                        var8.field7499[var81] = ((class324) class175.field2209.method3669(false, (long) var8.field7516[var81])).field4575;
                    }
                }
                for (int var82 = 0; var82 < var8.field7499.length; ++var82) {
                    class691 var83 = class132.field1694[var8.field7499[var82]];
                    if (var83.field9643 == 0) {
                        var13 += (double) (var83.field9647 * arg1);
                        var15 += (double) (var83.field9653 * arg1);
                        var17 += (double) (var83.field9635 * arg1);
                        var19 = true;
                    } else {
                        super.field2979 += var83.field9647 * arg1;
                        super.field2982 += var83.field9653 * arg1;
                        super.field2978 += var83.field9635 * arg1;
                    }
                }
            }
            if (var19) {
                while (true) {
                    if (!(var13 > 32767.0D) && !(var15 > 32767.0D) && !(var17 > 32767.0D) && !(var13 < -32767.0D) && !(var15 < -32767.0D) && !(var17 < -32767.0D)) {
                        this.field2817 = (short) ((int) var13);
                        this.field2822 = (short) ((int) var15);
                        this.field2821 = (short) ((int) var17);
                        break;
                    }
                    var13 /= 2.0D;
                    var15 /= 2.0D;
                    var17 /= 2.0D;
                    this.field2820 <<= 1;
                }
            }
            super.field2979 = (int) ((long) super.field2979 + ((long) (this.field2820 << 2) * (long) this.field2817 >> 23) * (long) arg1);
            super.field2982 = (int) ((long) super.field2982 + ((long) (this.field2820 << 2) * (long) this.field2822 >> 23) * (long) arg1);
            super.field2978 = (int) ((long) super.field2978 + ((long) (this.field2820 << 2) * (long) this.field2821 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "()V", line = 572)
    public final void method1293() {
        this.field2814.field4938.field5529[this.field2815] = null;
        class285.field4105[class588.field8292] = this;
        class588.field8292 = class588.field8292 + 1 & 1023;
        this.method2773(60);
        this.method2002(true);
    }

    @OriginalMember(owner = "client!fja", name = "b", descriptor = "()V", line = 580)
    private final void method1294() {
        int var1 = this.field2814.field4938.field5530;
        if (this.field2814.field4938.field5529[var1] != null) {
            this.field2814.field4938.field5529[var1].method1293();
        }
        this.field2814.field4938.field5529[var1] = this;
        this.field2815 = (short) this.field2814.field4938.field5530;
        this.field2814.field4938.field5530 = var1 + 1 & 8191;
        this.field2814.field4935.method3100(this, true);
    }

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "(Lbia;IIIIIIIIIIIZZ)V", line = 592)
    public final void method1295(class341 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field2814 = arg0;
        super.field2979 = arg1 << 12;
        super.field2982 = arg2 << 12;
        super.field2978 = arg3 << 12;
        super.field2983 = arg9;
        this.field2819 = this.field2818 = (short) arg8;
        super.field2975 = arg10;
        super.field2976 = arg11;
        super.field2972 = arg13;
        this.field2817 = (short) arg4;
        this.field2822 = (short) arg5;
        this.field2821 = (short) arg6;
        this.field2820 = arg7;
        super.field2977 = this.field2814.field4937.field8758;
        this.method1294();
    }

    @OriginalMember(owner = "client!fja", name = "<init>", descriptor = "(Lbia;IIIIIIIIIIIZZ)V", line = 616)
    public class200(class341 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field2814 = arg0;
        super.field2979 = arg1 << 12;
        super.field2982 = arg2 << 12;
        super.field2978 = arg3 << 12;
        super.field2983 = arg9;
        this.field2819 = this.field2818 = (short) arg8;
        super.field2975 = arg10;
        super.field2976 = arg11;
        super.field2972 = arg13;
        this.field2817 = (short) arg4;
        this.field2822 = (short) arg5;
        this.field2821 = (short) arg6;
        this.field2820 = arg7;
        super.field2977 = this.field2814.field4937.field8758;
        this.method1294();
    }
}
