import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class217 extends class471 {

    @OriginalMember(owner = "client!gg", name = "N", descriptor = "Lpj;")
    private class178 field3281;

    @OriginalMember(owner = "client!gg", name = "K", descriptor = "S")
    private short field3279;

    @OriginalMember(owner = "client!gg", name = "H", descriptor = "S")
    private short field3276;

    @OriginalMember(owner = "client!gg", name = "O", descriptor = "S")
    private short field3282;

    @OriginalMember(owner = "client!gg", name = "M", descriptor = "S")
    private short field3280;

    @OriginalMember(owner = "client!gg", name = "G", descriptor = "S")
    private short field3275;

    @OriginalMember(owner = "client!gg", name = "I", descriptor = "I")
    private int field3277;

    @OriginalMember(owner = "client!gg", name = "P", descriptor = "I")
    private int field3283;

    @OriginalMember(owner = "client!gg", name = "J", descriptor = "S")
    private short field3278;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "()V")
    private final void method1497() {
        this.field3281.field2754.field5605[this.field3278] = null;
        class443.field6593[class129.field1918] = this;
        class129.field1918 = class129.field1918 + 1 & 1023;
        this.method2069(-11);
        this.method2260(0);
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "()V")
    private final void method1498() {
        int var1 = this.field3281.field2754.field5608;
        if (this.field3281.field2754.field5605[var1] != null) {
            this.field3281.field2754.field5605[var1].method1497();
        }
        this.field3281.field2754.field5605[var1] = this;
        this.field3278 = (short) this.field3281.field2754.field5608;
        this.field3281.field2754.field5608 = var1 + 1 & 8191;
        this.field3281.field2734.method1082(this, -66);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(J)V")
    public final void method1499(long arg0) {
        int var3 = super.field6911 >> class295.field4543 + 12;
        int var4 = super.field6920 >> class295.field4543 + 12;
        int var5 = super.field6919 >> 12;
        if (var5 <= 0 && var5 >= -262144 && var3 >= 0 && var3 < class474.field6947 && var4 >= 0 && var4 < class443.field6603) {
            class382 var6 = this.field3281.field2754;
            class534 var7 = this.field3281.field2745;
            class11[] var8 = class407.field6024;
            int var9 = var8[var6.field5619].method56(var3, var4);
            int var10;
            if (var6.field5619 < class183.field2802 - 1) {
                var10 = var8[var6.field5619 + 1].method56(var3, var4);
            } else {
                var10 = var9 - (8 << class295.field4543);
            }
            if (var7.field7799) {
                if (var7.field7797 == -1 && var5 > var9) {
                    this.method1497();
                    return;
                }
                if (var7.field7797 >= 0 && var5 > var8[var7.field7797].method56(var3, var4)) {
                    this.method1497();
                    return;
                }
                if (var7.field7846 == -1 && var5 < var10) {
                    this.method1497();
                    return;
                }
                if (var7.field7846 >= 0 && var5 < var8[var7.field7846 + 1].method56(var3, var4)) {
                    this.method1497();
                    return;
                }
            }
            if (var3 >= var6.field5621 && var3 <= var6.field5623 && var4 >= var6.field5618 && var4 <= var6.field5622 && var5 <= var9 && var5 >= var10) {
                var6.field5616.field4847.method1451(this, -1);
            } else {
                int var11;
                for (var11 = class183.field2802 - 1; var11 > 0 && var5 > var8[var11].method56(var3, var4); --var11) {
                }
                if (var11 == 0 && var5 > var8[0].method56(var3, var4)) {
                    this.method1497();
                } else if (class183.field2802 - 1 == var11 && var8[var11].method56(var3, var4) - var5 > 8 << class295.field4543) {
                    this.method1497();
                } else {
                    class281 var12 = class348.field5192[var11][var3][var4];
                    if (var12 == null) {
                        if (var11 == 0) {
                            var12 = class348.field5192[0][var3][var4] = new class281(0, var3, var4);
                        }
                        boolean var13 = class348.field5192[0][var3][var4].field4372 != null;
                        if (var11 == 3 && var13) {
                            this.method1497();
                            return;
                        }
                        for (int var14 = 1; var14 <= var11; ++var14) {
                            if (class348.field5192[var14][var3][var4] == null) {
                                var12 = class348.field5192[var14][var3][var4] = new class281(var14, var3, var4);
                                if (var13) {
                                    ++var12.field4373;
                                }
                            }
                        }
                    }
                    if (var12.field4385 == null) {
                        var12.field4385 = new class320();
                        var12.field4377 = (byte) ((int) (arg0 & 255L));
                    } else if ((byte) ((int) (arg0 & 255L)) != var12.field4377) {
                        var12.field4385.field4847.method1450(-25864);
                        var12.field4385.field4853 = false;
                        var12.field4377 = (byte) ((int) (arg0 & 255L));
                    }
                    var12.field4385.field4847.method1451(this, -1);
                }
            }
        } else {
            this.method1497();
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(JI)V")
    public final void method1500(long arg0, int arg1) {
        this.field3279 = (short) (this.field3279 - arg1);
        if (this.field3279 <= 0) {
            this.method1497();
        } else {
            int var4 = super.field6911 >> 12;
            int var5 = super.field6919 >> 12;
            int var6 = super.field6920 >> 12;
            class382 var7 = this.field3281.field2754;
            class534 var8 = this.field3281.field2745;
            if (var8.field7850 != 0) {
                if (this.field3276 - this.field3279 <= var8.field7827) {
                    int var9 = var8.field7849 * arg1 + (super.field6908 >> 8 & 65280) + (this.field3283 >> 16 & 255);
                    int var10 = var8.field7831 * arg1 + (this.field3283 >> 8 & 255) + (super.field6908 & 65280);
                    int var11 = var8.field7856 * arg1 + (super.field6908 << 8 & 65280) + (this.field3283 & 255);
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
                    super.field6908 &= -16777216;
                    super.field6908 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field3283 &= -16777216;
                    this.field3283 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field3276 - this.field3279 <= var8.field7823) {
                    int var12 = var8.field7853 * arg1 + (super.field6908 >> 16 & 65280) + (this.field3283 >> 24 & 255);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field6908 &= 16777215;
                    super.field6908 |= (var12 & 65280) << 16;
                    this.field3283 &= 16777215;
                    this.field3283 |= (var12 & 255) << 24;
                }
            }
            if (var8.field7822 != -1 && this.field3276 - this.field3279 <= var8.field7843) {
                this.field3277 += var8.field7792 * arg1;
            }
            if (var8.field7836 != -1 && this.field3276 - this.field3279 <= var8.field7798) {
                super.field6910 += var8.field7813 * arg1;
            }
            int var13 = this.field3282;
            int var14 = this.field3280;
            int var15 = this.field3275;
            boolean var16 = false;
            if (var8.field7829 == 1) {
                int var17 = var4 - this.field3281.field2726;
                int var18 = var5 - this.field3281.field2735;
                int var19 = var6 - this.field3281.field2736;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field7816 * var20 * arg1);
                this.field3277 = (int) ((long) this.field3277 - ((long) this.field3277 * var21 >> 18));
            } else if (var8.field7829 == 2) {
                int var23 = var4 - this.field3281.field2726;
                int var24 = var5 - this.field3281.field2735;
                int var25 = var6 - this.field3281.field2736;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field7816 * var26 * arg1);
                this.field3277 = (int) ((long) this.field3277 - ((long) this.field3277 * var27 >> 28));
            }
            if (var8.field7787 != null) {
                class130 var29 = var7.field5615.field690;
                for (class130 var30 = var29.field1934; var29 != var30; var30 = var30.field1934) {
                    class374 var31 = (class374) var30;
                    class508 var32 = var31.field5532;
                    if (var32.field7395 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field7787.length; ++var34) {
                            if (var8.field7787[var34] == var32.field7399) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field5531;
                            int var36 = var5 - var31.field5530;
                            int var37 = var6 - var31.field5525;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field7398) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field5524 * var37 + var31.field5535 * var35 + var32.field7400 * var36) * 65535L / (long) (var32.field7381 * var40);
                                if (var41 >= (long) var32.field7390) {
                                    int var43 = 0;
                                    if (var32.field7396 == 1) {
                                        var43 = (var40 >> 4) * var32.field7393;
                                    } else if (var32.field7396 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field7393;
                                    }
                                    if (var32.field7387 == 0) {
                                        if (var32.field7389 == 0) {
                                            var13 += (var31.field5535 - var43) * arg1;
                                            var14 += (var32.field7400 - var43) * arg1;
                                            var15 += (var31.field5524 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field6911 += (var31.field5535 - var43) * arg1;
                                            super.field6919 += (var32.field7400 - var43) * arg1;
                                            super.field6920 += (var31.field5524 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field7381;
                                        int var45 = (var36 << 15) / var40 * var32.field7381;
                                        int var46 = (var37 << 15) / var40 * var32.field7381;
                                        if (var32.field7389 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field6911 += arg1 * var44 >> 15;
                                            super.field6919 += arg1 * var45 >> 15;
                                            super.field6920 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field7844 != null) {
                for (int var47 = 0; var47 < var8.field7844.length; ++var47) {
                    class374 var48 = (class374) class472.field6928.method2786((long) var8.field7844[var47], 107);
                    while (var48 != null) {
                        class508 var49 = var48.field5532;
                        int var50 = var4 - var48.field5531;
                        int var51 = var5 - var48.field5530;
                        int var52 = var6 - var48.field5525;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field7398) {
                            var48 = (class374) class472.field6928.method2788(false);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field5524 * var52 + var48.field5535 * var50 + var49.field7400 * var51) * 65535L / (long) (var49.field7381 * var55);
                            if (var56 < (long) var49.field7390) {
                                var48 = (class374) class472.field6928.method2788(false);
                            } else {
                                int var58 = 0;
                                if (var49.field7396 == 1) {
                                    var58 = (var55 >> 4) * var49.field7393;
                                } else if (var49.field7396 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field7393;
                                }
                                if (var49.field7387 == 0) {
                                    if (var49.field7389 == 0) {
                                        var13 += (var48.field5535 - var58) * arg1;
                                        var14 += (var49.field7400 - var58) * arg1;
                                        var15 += (var48.field5524 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field6911 += (var48.field5535 - var58) * arg1;
                                        super.field6919 += (var49.field7400 - var58) * arg1;
                                        super.field6920 += (var48.field5524 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field7381;
                                    int var60 = (var51 << 15) / var55 * var49.field7381;
                                    int var61 = (var52 << 15) / var55 * var49.field7381;
                                    if (var49.field7389 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field6911 += arg1 * var59 >> 15;
                                        super.field6919 += arg1 * var60 >> 15;
                                        super.field6920 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class374) class472.field6928.method2788(false);
                            }
                        }
                    }
                }
            }
            if (var8.field7806 != null) {
                if (var8.field7830 == null) {
                    var8.field7830 = new int[var8.field7806.length];
                    for (int var62 = 0; var62 < var8.field7806.length; ++var62) {
                        class96.method806(false, var8.field7806[var62]);
                        var8.field7830[var62] = ((class50) class162.field2452.method358((byte) 38, (long) var8.field7806[var62])).field771;
                    }
                }
                for (int var63 = 0; var63 < var8.field7830.length; ++var63) {
                    class508 var64 = class394.field5742[var8.field7830[var63]];
                    if (var64.field7389 == 0) {
                        var13 += var64.field7386 * arg1;
                        var14 += var64.field7400 * arg1;
                        var15 += var64.field7384 * arg1;
                        var16 = true;
                    } else {
                        super.field6911 += var64.field7386 * arg1;
                        super.field6919 += var64.field7400 * arg1;
                        super.field6920 += var64.field7384 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field3282 = (short) var13;
                        this.field3280 = (short) var14;
                        this.field3275 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field3277 <<= 1;
                }
            }
            super.field6911 = (int) ((long) super.field6911 + ((long) this.field3282 * (long) this.field3277 >> 23) * (long) arg1);
            super.field6919 = (int) ((long) super.field6919 + ((long) this.field3280 * (long) this.field3277 >> 23) * (long) arg1);
            super.field6920 = (int) ((long) super.field6920 + ((long) this.field3275 * (long) this.field3277 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lpj;IIIIIIIIIIIZZ)V")
    public final void method1501(class178 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field3281 = arg0;
        super.field6911 = arg1 << 12;
        super.field6919 = arg2 << 12;
        super.field6920 = arg3 << 12;
        super.field6908 = arg9;
        this.field3276 = this.field3279 = (short) arg8;
        super.field6910 = arg10;
        super.field6918 = arg11;
        super.field6914 = arg13;
        this.field3282 = (short) arg4;
        this.field3280 = (short) arg5;
        this.field3275 = (short) arg6;
        this.field3277 = arg7;
        super.field6916 = this.field3281.field2755.field6958;
        this.method1498();
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lpj;IIIIIIIIIIIZZ)V")
    public class217(class178 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field3281 = arg0;
        super.field6911 = arg1 << 12;
        super.field6919 = arg2 << 12;
        super.field6920 = arg3 << 12;
        super.field6908 = arg9;
        this.field3276 = this.field3279 = (short) arg8;
        super.field6910 = arg10;
        super.field6918 = arg11;
        super.field6914 = arg13;
        this.field3282 = (short) arg4;
        this.field3280 = (short) arg5;
        this.field3275 = (short) arg6;
        this.field3277 = arg7;
        super.field6916 = this.field3281.field2755.field6958;
        this.method1498();
    }
}
