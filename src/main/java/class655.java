import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class655 extends class547 {

    @OriginalMember(owner = "client!rs", name = "T", descriptor = "Lkl;")
    public class79 field9190;

    @OriginalMember(owner = "client!rs", name = "P", descriptor = "S")
    private short field9186;

    @OriginalMember(owner = "client!rs", name = "R", descriptor = "S")
    private short field9188;

    @OriginalMember(owner = "client!rs", name = "S", descriptor = "S")
    private short field9189;

    @OriginalMember(owner = "client!rs", name = "O", descriptor = "S")
    private short field9185;

    @OriginalMember(owner = "client!rs", name = "L", descriptor = "S")
    private short field9182;

    @OriginalMember(owner = "client!rs", name = "M", descriptor = "I")
    private int field9183;

    @OriginalMember(owner = "client!rs", name = "Q", descriptor = "I")
    private int field9187;

    @OriginalMember(owner = "client!rs", name = "N", descriptor = "S")
    private short field9184;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "()V", line = 6)
    private final void method3789() {
        int var1 = this.field9190.field1103.field8757;
        if (this.field9190.field1103.field8761[var1] != null) {
            this.field9190.field1103.field8761[var1].method3791();
        }
        this.field9190.field1103.field8761[var1] = this;
        this.field9184 = (short) this.field9190.field1103.field8757;
        this.field9190.field1103.field8757 = var1 + 1 & 8191;
        this.field9190.field1105.method1616(22437, this);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lha;J)V", line = 20)
    public final void method3790(class60 arg0, long arg1) {
        int var4 = super.field7801 >> class459.field6769 + 12;
        int var5 = super.field7806 >> class459.field6769 + 12;
        int var6 = super.field7808 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class34.field356 && var5 >= 0 && var5 < class565.field8040) {
            class626 var7 = this.field9190.field1103;
            class516 var8 = this.field9190.field1099;
            class280[] var9 = class582.field8287;
            int var10 = var7.field8768;
            class186 var11 = class80.field1136[var7.field8768][var4][var5];
            if (var11 != null) {
                var10 = var11.field2831;
            }
            int var12 = var9[var10].method1787(var4, 19646, var5);
            int var13;
            if (var10 < class409.field6165 - 1) {
                var13 = var9[var10 + 1].method1787(var4, 19646, var5);
            } else {
                var13 = var12 - (8 << class459.field6769);
            }
            if (var8.field7378) {
                if (var8.field7336 == -1 && var6 > var12) {
                    this.method3791();
                    return;
                }
                if (var8.field7336 >= 0 && var6 > var9[var8.field7336].method1787(var4, 19646, var5)) {
                    this.method3791();
                    return;
                }
                if (var8.field7376 == -1 && var6 < var13) {
                    this.method3791();
                    return;
                }
                if (var8.field7376 >= 0 && var6 < var9[var8.field7376 + 1].method1787(var4, 19646, var5)) {
                    this.method3791();
                    return;
                }
            }
            int var14;
            for (var14 = class409.field6165 - 1; var14 > 0 && var6 > var9[var14].method1787(var4, 19646, var5); --var14) {
            }
            if (var8.field7369 && var14 == 0 && var6 > var9[0].method1787(var4, 19646, var5)) {
                this.method3791();
            } else if (class409.field6165 - 1 == var14 && var9[var14].method1787(var4, 19646, var5) - var6 > 8 << class459.field6769) {
                this.method3791();
            } else {
                class186 var15 = class80.field1136[var14][var4][var5];
                if (var15 == null) {
                    if (var14 == 0 || class80.field1136[0][var4][var5] == null) {
                        var15 = class80.field1136[0][var4][var5] = new class186(0);
                    }
                    boolean var16 = class80.field1136[0][var4][var5].field2842 != null;
                    if (var14 == 3 && var16) {
                        this.method3791();
                        return;
                    }
                    for (int var17 = 1; var17 <= var14; ++var17) {
                        if (class80.field1136[var17][var4][var5] == null) {
                            var15 = class80.field1136[var17][var4][var5] = new class186(var17);
                            if (var16) {
                                ++var15.field2831;
                            }
                        }
                    }
                }
                if (var8.field7324) {
                    int var18 = super.field7801 >> 12;
                    int var19 = super.field7806 >> 12;
                    if (var15.field2834 != null) {
                        class286 var20 = var15.field2834.method325(arg0, 92160000);
                        if (var20 != null && var20.method1826(var6, var18, var19, false)) {
                            this.method3791();
                            return;
                        }
                    }
                    if (var15.field2841 != null) {
                        class286 var21 = var15.field2841.method325(arg0, 92160000);
                        if (var21 != null && var21.method1826(var6, var18, var19, false)) {
                            this.method3791();
                            return;
                        }
                    }
                    if (var15.field2844 != null) {
                        class286 var22 = var15.field2844.method325(arg0, 92160000);
                        if (var22 != null && var22.method1826(var6, var18, var19, false)) {
                            this.method3791();
                            return;
                        }
                    }
                    for (class754 var23 = var15.field2830; var23 != null; var23 = var23.field10537) {
                        class286 var24 = var23.field10542.method325(arg0, 92160000);
                        if (var24 != null && var24.method1826(var6, var18, var19, false)) {
                            this.method3791();
                            return;
                        }
                    }
                }
                var7.field8765.field8738.method2539(this, 0);
            }
        } else {
            this.method3791();
        }
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "()V", line = 193)
    public final void method3791() {
        this.field9190.field1103.field8761[this.field9184] = null;
        class514.field7296[class627.field8774] = this;
        class627.field8774 = class627.field8774 + 1 & 1023;
        this.method385((byte) -7);
        this.method2247(0);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lkl;IIIIIIIIIIIZZ)V", line = 201)
    public final void method3792(class79 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field9190 = arg0;
        super.field7801 = arg1 << 12;
        super.field7808 = arg2 << 12;
        super.field7806 = arg3 << 12;
        super.field7804 = arg9;
        this.field9188 = this.field9186 = (short) arg8;
        super.field7800 = arg10;
        super.field7810 = arg11;
        super.field7809 = arg13;
        this.field9189 = (short) arg4;
        this.field9185 = (short) arg5;
        this.field9182 = (short) arg6;
        this.field9183 = arg7;
        super.field7803 = this.field9190.field1101.field6767;
        this.method3789();
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(JI)V", line = 221)
    public final void method3793(long arg0, int arg1) {
        this.field9186 = (short) (this.field9186 - arg1);
        if (this.field9186 <= 0) {
            this.method3791();
        } else {
            int var4 = super.field7801 >> 12;
            int var5 = super.field7808 >> 12;
            int var6 = super.field7806 >> 12;
            class626 var7 = this.field9190.field1103;
            class516 var8 = this.field9190.field1099;
            if (var8.field7338 != 0) {
                if (this.field9188 - this.field9186 <= var8.field7368) {
                    int var9 = var8.field7353 * arg1 + (this.field9187 >> 16 & 255) + (super.field7804 >> 8 & 65280);
                    int var10 = var8.field7381 * arg1 + (this.field9187 >> 8 & 255) + (super.field7804 & 65280);
                    int var11 = var8.field7351 * arg1 + (super.field7804 << 8 & 65280) + (this.field9187 & 255);
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
                    super.field7804 &= -16777216;
                    super.field7804 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field9187 &= -16777216;
                    this.field9187 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field9188 - this.field9186 <= var8.field7343) {
                    int var12 = var8.field7366 * arg1 + (this.field9187 >> 24 & 255) + (super.field7804 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field7804 &= 16777215;
                    super.field7804 |= (var12 & 65280) << 16;
                    this.field9187 &= 16777215;
                    this.field9187 |= (var12 & 255) << 24;
                }
            }
            if (var8.field7318 != -1 && this.field9188 - this.field9186 <= var8.field7364) {
                this.field9183 += var8.field7345 * arg1;
            }
            if (var8.field7362 != -1 && this.field9188 - this.field9186 <= var8.field7310) {
                super.field7800 += var8.field7309 * arg1;
            }
            double var13 = (double) this.field9189;
            double var15 = (double) this.field9185;
            double var17 = (double) this.field9182;
            boolean var19 = false;
            if (var8.field7328 == 1) {
                int var20 = var4 - this.field9190.field1110.field2520;
                int var21 = var5 - this.field9190.field1110.field2528;
                int var22 = var6 - this.field9190.field1110.field2516;
                int var23 = (int) Math.sqrt((double) (var22 * var22 + var20 * var20 + var21 * var21)) >> 2;
                long var24 = (long) (var8.field7361 * var23 * arg1);
                this.field9183 = (int) ((long) this.field9183 - ((long) this.field9183 * var24 >> 18));
            } else if (var8.field7328 == 2) {
                int var26 = var4 - this.field9190.field1110.field2520;
                int var27 = var5 - this.field9190.field1110.field2528;
                int var28 = var6 - this.field9190.field1110.field2516;
                int var29 = var28 * var28 + var26 * var26 + var27 * var27;
                long var30 = (long) (var8.field7361 * var29 * arg1);
                this.field9183 = (int) ((long) this.field9183 - ((long) this.field9183 * var30 >> 28));
            }
            if (var8.field7308 != null) {
                class184 var32 = var7.field8764.field2590;
                for (class184 var33 = var32.field2812; var32 != var33; var33 = var33.field2812) {
                    class462 var34 = (class462) var33;
                    class741 var35 = var34.field6811;
                    if (var35.field10389 != 1) {
                        boolean var36 = false;
                        for (int var37 = 0; var37 < var8.field7308.length; ++var37) {
                            if (var8.field7308[var37] == var35.field10397) {
                                var36 = true;
                                break;
                            }
                        }
                        if (var36) {
                            double var38 = (double) (var4 - var34.field6815);
                            double var40 = (double) (var5 - var34.field6810);
                            double var42 = (double) (var6 - var34.field6813);
                            double var44 = var42 * var42 + var38 * var38 + var40 * var40;
                            if (!(var44 > (double) var35.field10396)) {
                                double var46 = Math.sqrt(var44);
                                if (var46 == 0.0D) {
                                    var46 = 1.0D;
                                }
                                double var48 = ((double) var34.field6808 * var42 + (double) var34.field6814 * var38 + (double) var35.field10391 * var40) * 65535.0D / ((double) var35.field10400 * var46);
                                if (!(var48 < (double) var35.field10394)) {
                                    double var50 = 0.0D;
                                    if (var35.field10401 == 1) {
                                        var50 = var46 / 16.0D * (double) var35.field10384;
                                    } else if (var35.field10401 == 2) {
                                        var50 = var46 / 16.0D * (var46 / 16.0D) * (double) var35.field10384;
                                    }
                                    if (var35.field10392 == 0) {
                                        if (var35.field10395 == 0) {
                                            var13 += ((double) var34.field6814 - var50) * (double) arg1;
                                            var15 += ((double) var35.field10391 - var50) * (double) arg1;
                                            var17 += ((double) var34.field6808 - var50) * (double) arg1;
                                            var19 = true;
                                        } else {
                                            super.field7801 = (int) ((double) super.field7801 + ((double) var34.field6814 - var50) * (double) arg1);
                                            super.field7808 = (int) ((double) super.field7808 + ((double) var35.field10391 - var50) * (double) arg1);
                                            super.field7806 = (int) ((double) super.field7806 + ((double) var34.field6808 - var50) * (double) arg1);
                                        }
                                    } else {
                                        double var52 = var38 / var46 * (double) var35.field10400;
                                        double var54 = var40 / var46 * (double) var35.field10400;
                                        double var56 = var42 / var46 * (double) var35.field10400;
                                        if (var35.field10395 == 0) {
                                            var13 += (double) arg1 * var52;
                                            var15 += (double) arg1 * var54;
                                            var17 += (double) arg1 * var56;
                                            var19 = true;
                                        } else {
                                            super.field7801 = (int) ((double) super.field7801 + (double) arg1 * var52);
                                            super.field7808 = (int) ((double) super.field7808 + (double) arg1 * var54);
                                            super.field7806 = (int) ((double) super.field7806 + (double) arg1 * var56);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field7348 != null) {
                for (int var58 = 0; var58 < var8.field7348.length; ++var58) {
                    class462 var59 = (class462) class624.field8739.method665((long) var8.field7348[var58], -1);
                    while (var59 != null) {
                        class741 var60 = var59.field6811;
                        double var61 = (double) (var4 - var59.field6815);
                        double var63 = (double) (var5 - var59.field6810);
                        double var65 = (double) (var6 - var59.field6813);
                        double var67 = var65 * var65 + var61 * var61 + var63 * var63;
                        if (var67 > (double) var60.field10396) {
                            var59 = (class462) class624.field8739.method667(-18653);
                        } else {
                            double var69 = Math.sqrt(var67);
                            if (var69 == 0.0D) {
                                var69 = 1.0D;
                            }
                            double var71 = ((double) var59.field6808 * var65 + (double) var59.field6814 * var61 + (double) var60.field10391 * var63) * 65535.0D / ((double) var60.field10400 * var69);
                            if (var71 < (double) var60.field10394) {
                                var59 = (class462) class624.field8739.method667(-18653);
                            } else {
                                double var73 = 0.0D;
                                if (var60.field10401 == 1) {
                                    var73 = var69 / 16.0D * (double) var60.field10384;
                                } else if (var60.field10401 == 2) {
                                    var73 = var69 / 16.0D * (var69 / 16.0D) * (double) var60.field10384;
                                }
                                if (var60.field10392 == 0) {
                                    if (var60.field10395 == 0) {
                                        var13 += ((double) var59.field6814 - var73) * (double) arg1;
                                        var15 += ((double) var60.field10391 - var73) * (double) arg1;
                                        var17 += ((double) var59.field6808 - var73) * (double) arg1;
                                        var19 = true;
                                    } else {
                                        super.field7801 = (int) ((double) super.field7801 + ((double) var59.field6814 - var73) * (double) arg1);
                                        super.field7808 = (int) ((double) super.field7808 + ((double) var60.field10391 - var73) * (double) arg1);
                                        super.field7806 = (int) ((double) super.field7806 + ((double) var59.field6808 - var73) * (double) arg1);
                                    }
                                } else {
                                    double var75 = var61 / var69 * (double) var60.field10400;
                                    double var77 = var63 / var69 * (double) var60.field10400;
                                    double var79 = var65 / var69 * (double) var60.field10400;
                                    if (var60.field10395 == 0) {
                                        var13 += (double) arg1 * var75;
                                        var15 += (double) arg1 * var77;
                                        var17 += (double) arg1 * var79;
                                        var19 = true;
                                    } else {
                                        super.field7801 = (int) ((double) super.field7801 + (double) arg1 * var75);
                                        super.field7808 = (int) ((double) super.field7808 + (double) arg1 * var77);
                                        super.field7806 = (int) ((double) super.field7806 + (double) arg1 * var79);
                                    }
                                }
                                var59 = (class462) class624.field8739.method667(-18653);
                            }
                        }
                    }
                }
            }
            if (var8.field7339 != null) {
                if (var8.field7360 == null) {
                    var8.field7360 = new int[var8.field7339.length];
                    for (int var81 = 0; var81 < var8.field7339.length; ++var81) {
                        class658.method3799(var8.field7339[var81], true);
                        var8.field7360[var81] = ((class317) class237.field3436.method2287((long) var8.field7339[var81], (byte) -117)).field4518;
                    }
                }
                for (int var82 = 0; var82 < var8.field7360.length; ++var82) {
                    class741 var83 = class467.field6836[var8.field7360[var82]];
                    if (var83.field10395 == 0) {
                        var13 += (double) (var83.field10390 * arg1);
                        var15 += (double) (var83.field10391 * arg1);
                        var17 += (double) (var83.field10393 * arg1);
                        var19 = true;
                    } else {
                        super.field7801 += var83.field10390 * arg1;
                        super.field7808 += var83.field10391 * arg1;
                        super.field7806 += var83.field10393 * arg1;
                    }
                }
            }
            if (var19) {
                while (true) {
                    if (!(var13 > 32767.0D) && !(var15 > 32767.0D) && !(var17 > 32767.0D) && !(var13 < -32767.0D) && !(var15 < -32767.0D) && !(var17 < -32767.0D)) {
                        this.field9189 = (short) ((int) var13);
                        this.field9185 = (short) ((int) var15);
                        this.field9182 = (short) ((int) var17);
                        break;
                    }
                    var13 /= 2.0D;
                    var15 /= 2.0D;
                    var17 /= 2.0D;
                    this.field9183 <<= 1;
                }
            }
            super.field7801 = (int) ((long) super.field7801 + ((long) (this.field9183 << 2) * (long) this.field9189 >> 23) * (long) arg1);
            super.field7808 = (int) ((long) super.field7808 + ((long) (this.field9183 << 2) * (long) this.field9185 >> 23) * (long) arg1);
            super.field7806 = (int) ((long) super.field7806 + ((long) (this.field9183 << 2) * (long) this.field9182 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(Lkl;IIIIIIIIIIIZZ)V", line = 616)
    public class655(class79 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field9190 = arg0;
        super.field7801 = arg1 << 12;
        super.field7808 = arg2 << 12;
        super.field7806 = arg3 << 12;
        super.field7804 = arg9;
        this.field9188 = this.field9186 = (short) arg8;
        super.field7800 = arg10;
        super.field7810 = arg11;
        super.field7809 = arg13;
        this.field9189 = (short) arg4;
        this.field9185 = (short) arg5;
        this.field9182 = (short) arg6;
        this.field9183 = arg7;
        super.field7803 = this.field9190.field1101.field6767;
        this.method3789();
    }
}
