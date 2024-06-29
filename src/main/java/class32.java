import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class32 extends class744 {

    @OriginalMember(owner = "client!ia", name = "F", descriptor = "Lta;")
    public class638 field500;

    @OriginalMember(owner = "client!ia", name = "E", descriptor = "S")
    private short field499;

    @OriginalMember(owner = "client!ia", name = "D", descriptor = "S")
    private short field498;

    @OriginalMember(owner = "client!ia", name = "G", descriptor = "S")
    private short field501;

    @OriginalMember(owner = "client!ia", name = "H", descriptor = "S")
    private short field502;

    @OriginalMember(owner = "client!ia", name = "J", descriptor = "S")
    private short field504;

    @OriginalMember(owner = "client!ia", name = "K", descriptor = "I")
    private int field505;

    @OriginalMember(owner = "client!ia", name = "I", descriptor = "I")
    private int field503;

    @OriginalMember(owner = "client!ia", name = "L", descriptor = "S")
    private short field506;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(JI)V")
    public final void method304(long arg0, int arg1) {
        this.field499 = (short) (this.field499 - arg1);
        if (this.field499 <= 0) {
            this.method308();
        } else {
            int var4 = super.field10383 >> 12;
            int var5 = super.field10388 >> 12;
            int var6 = super.field10387 >> 12;
            class428 var7 = this.field500.field8822;
            class332 var8 = this.field500.field8836;
            if (var8.field4213 != 0) {
                if (this.field498 - this.field499 <= var8.field4217) {
                    int var9 = var8.field4259 * arg1 + (super.field10380 >> 8 & 65280) + (this.field503 >> 16 & 255);
                    int var10 = var8.field4236 * arg1 + (this.field503 >> 8 & 255) + (super.field10380 & 65280);
                    int var11 = var8.field4226 * arg1 + (super.field10380 << 8 & 65280) + (this.field503 & 255);
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
                    super.field10380 &= -16777216;
                    super.field10380 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field503 &= -16777216;
                    this.field503 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field498 - this.field499 <= var8.field4260) {
                    int var12 = var8.field4271 * arg1 + (super.field10380 >> 16 & 65280) + (this.field503 >> 24 & 255);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field10380 &= 16777215;
                    super.field10380 |= (var12 & 65280) << 16;
                    this.field503 &= 16777215;
                    this.field503 |= (var12 & 255) << 24;
                }
            }
            if (var8.field4267 != -1 && this.field498 - this.field499 <= var8.field4277) {
                this.field505 += var8.field4214 * arg1;
            }
            if (var8.field4223 != -1 && this.field498 - this.field499 <= var8.field4232) {
                super.field10379 += var8.field4268 * arg1;
            }
            double var13 = (double) this.field501;
            double var15 = (double) this.field502;
            double var17 = (double) this.field504;
            boolean var19 = false;
            if (var8.field4235 == 1) {
                int var20 = var4 - this.field500.field8831.field3520;
                int var21 = var5 - this.field500.field8831.field3526;
                int var22 = var6 - this.field500.field8831.field3527;
                int var23 = (int) Math.sqrt((double) (var22 * var22 + var20 * var20 + var21 * var21)) >> 2;
                long var24 = (long) (var8.field4274 * var23 * arg1);
                this.field505 = (int) ((long) this.field505 - ((long) this.field505 * var24 >> 18));
            } else if (var8.field4235 == 2) {
                int var26 = var4 - this.field500.field8831.field3520;
                int var27 = var5 - this.field500.field8831.field3526;
                int var28 = var6 - this.field500.field8831.field3527;
                int var29 = var28 * var28 + var26 * var26 + var27 * var27;
                long var30 = (long) (var8.field4274 * var29 * arg1);
                this.field505 = (int) ((long) this.field505 - ((long) this.field505 * var30 >> 28));
            }
            if (var8.field4233 != null) {
                class627 var32 = var7.field6078.field7718;
                for (class627 var33 = var32.field8744; var32 != var33; var33 = var33.field8744) {
                    class593 var34 = (class593) var33;
                    class496 var35 = var34.field8253;
                    if (var35.field7013 != 1) {
                        boolean var36 = false;
                        for (int var37 = 0; var37 < var8.field4233.length; ++var37) {
                            if (var8.field4233[var37] == var35.field7008) {
                                var36 = true;
                                break;
                            }
                        }
                        if (var36) {
                            double var38 = (double) (var4 - var34.field8254);
                            double var40 = (double) (var5 - var34.field8257);
                            double var42 = (double) (var6 - var34.field8262);
                            double var44 = var42 * var42 + var38 * var38 + var40 * var40;
                            if (!(var44 > (double) var35.field7017)) {
                                double var46 = Math.sqrt(var44);
                                if (var46 == 0.0D) {
                                    var46 = 1.0D;
                                }
                                double var48 = ((double) var34.field8259 * var42 + (double) var34.field8250 * var38 + (double) var35.field7022 * var40) * 65535.0D / ((double) var35.field7025 * var46);
                                if (!(var48 < (double) var35.field7007)) {
                                    double var50 = 0.0D;
                                    if (var35.field7010 == 1) {
                                        var50 = var46 / 16.0D * (double) var35.field7006;
                                    } else if (var35.field7010 == 2) {
                                        var50 = var46 / 16.0D * (var46 / 16.0D) * (double) var35.field7006;
                                    }
                                    if (var35.field7015 == 0) {
                                        if (var35.field7018 == 0) {
                                            var13 += ((double) var34.field8250 - var50) * (double) arg1;
                                            var15 += ((double) var35.field7022 - var50) * (double) arg1;
                                            var17 += ((double) var34.field8259 - var50) * (double) arg1;
                                            var19 = true;
                                        } else {
                                            super.field10383 = (int) ((double) super.field10383 + ((double) var34.field8250 - var50) * (double) arg1);
                                            super.field10388 = (int) ((double) super.field10388 + ((double) var35.field7022 - var50) * (double) arg1);
                                            super.field10387 = (int) ((double) super.field10387 + ((double) var34.field8259 - var50) * (double) arg1);
                                        }
                                    } else {
                                        double var52 = var38 / var46 * (double) var35.field7025;
                                        double var54 = var40 / var46 * (double) var35.field7025;
                                        double var56 = var42 / var46 * (double) var35.field7025;
                                        if (var35.field7018 == 0) {
                                            var13 += (double) arg1 * var52;
                                            var15 += (double) arg1 * var54;
                                            var17 += (double) arg1 * var56;
                                            var19 = true;
                                        } else {
                                            super.field10383 = (int) ((double) super.field10383 + (double) arg1 * var52);
                                            super.field10388 = (int) ((double) super.field10388 + (double) arg1 * var54);
                                            super.field10387 = (int) ((double) super.field10387 + (double) arg1 * var56);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field4248 != null) {
                for (int var58 = 0; var58 < var8.field4248.length; ++var58) {
                    class593 var59 = (class593) class168.field2216.method3528(12014, (long) var8.field4248[var58]);
                    while (var59 != null) {
                        class496 var60 = var59.field8253;
                        double var61 = (double) (var4 - var59.field8254);
                        double var63 = (double) (var5 - var59.field8257);
                        double var65 = (double) (var6 - var59.field8262);
                        double var67 = var65 * var65 + var61 * var61 + var63 * var63;
                        if (var67 > (double) var60.field7017) {
                            var59 = (class593) class168.field2216.method3522((byte) 96);
                        } else {
                            double var69 = Math.sqrt(var67);
                            if (var69 == 0.0D) {
                                var69 = 1.0D;
                            }
                            double var71 = ((double) var59.field8259 * var65 + (double) var59.field8250 * var61 + (double) var60.field7022 * var63) * 65535.0D / ((double) var60.field7025 * var69);
                            if (var71 < (double) var60.field7007) {
                                var59 = (class593) class168.field2216.method3522((byte) 47);
                            } else {
                                double var73 = 0.0D;
                                if (var60.field7010 == 1) {
                                    var73 = var69 / 16.0D * (double) var60.field7006;
                                } else if (var60.field7010 == 2) {
                                    var73 = var69 / 16.0D * (var69 / 16.0D) * (double) var60.field7006;
                                }
                                if (var60.field7015 == 0) {
                                    if (var60.field7018 == 0) {
                                        var13 += ((double) var59.field8250 - var73) * (double) arg1;
                                        var15 += ((double) var60.field7022 - var73) * (double) arg1;
                                        var17 += ((double) var59.field8259 - var73) * (double) arg1;
                                        var19 = true;
                                    } else {
                                        super.field10383 = (int) ((double) super.field10383 + ((double) var59.field8250 - var73) * (double) arg1);
                                        super.field10388 = (int) ((double) super.field10388 + ((double) var60.field7022 - var73) * (double) arg1);
                                        super.field10387 = (int) ((double) super.field10387 + ((double) var59.field8259 - var73) * (double) arg1);
                                    }
                                } else {
                                    double var75 = var61 / var69 * (double) var60.field7025;
                                    double var77 = var63 / var69 * (double) var60.field7025;
                                    double var79 = var65 / var69 * (double) var60.field7025;
                                    if (var60.field7018 == 0) {
                                        var13 += (double) arg1 * var75;
                                        var15 += (double) arg1 * var77;
                                        var17 += (double) arg1 * var79;
                                        var19 = true;
                                    } else {
                                        super.field10383 = (int) ((double) super.field10383 + (double) arg1 * var75);
                                        super.field10388 = (int) ((double) super.field10388 + (double) arg1 * var77);
                                        super.field10387 = (int) ((double) super.field10387 + (double) arg1 * var79);
                                    }
                                }
                                var59 = (class593) class168.field2216.method3522((byte) 79);
                            }
                        }
                    }
                }
            }
            if (var8.field4280 != null) {
                if (var8.field4269 == null) {
                    var8.field4269 = new int[var8.field4280.length];
                    for (int var81 = 0; var81 < var8.field4280.length; ++var81) {
                        class565.method3191(var8.field4280[var81], 1);
                        var8.field4269[var81] = ((class394) class326.field4170.method3248((long) var8.field4280[var81], 0)).field5494;
                    }
                }
                for (int var82 = 0; var82 < var8.field4269.length; ++var82) {
                    class496 var83 = class168.field2221[var8.field4269[var82]];
                    if (var83.field7018 == 0) {
                        var13 += (double) (var83.field7021 * arg1);
                        var15 += (double) (var83.field7022 * arg1);
                        var17 += (double) (var83.field7024 * arg1);
                        var19 = true;
                    } else {
                        super.field10383 += var83.field7021 * arg1;
                        super.field10388 += var83.field7022 * arg1;
                        super.field10387 += var83.field7024 * arg1;
                    }
                }
            }
            if (var19) {
                while (true) {
                    if (!(var13 > 32767.0D) && !(var15 > 32767.0D) && !(var17 > 32767.0D) && !(var13 < -32767.0D) && !(var15 < -32767.0D) && !(var17 < -32767.0D)) {
                        this.field501 = (short) ((int) var13);
                        this.field502 = (short) ((int) var15);
                        this.field504 = (short) ((int) var17);
                        break;
                    }
                    var13 /= 2.0D;
                    var15 /= 2.0D;
                    var17 /= 2.0D;
                    this.field505 <<= 1;
                }
            }
            super.field10383 = (int) ((long) super.field10383 + ((long) (this.field505 << 2) * (long) this.field501 >> 23) * (long) arg1);
            super.field10388 = (int) ((long) super.field10388 + ((long) (this.field505 << 2) * (long) this.field502 >> 23) * (long) arg1);
            super.field10387 = (int) ((long) super.field10387 + ((long) (this.field505 << 2) * (long) this.field504 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lha;J)V")
    public final void method305(class454 arg0, long arg1) {
        int var4 = super.field10383 >> class455.field6383 + 12;
        int var5 = super.field10387 >> class455.field6383 + 12;
        int var6 = super.field10388 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class90.field1142 && var5 >= 0 && var5 < class665.field9107) {
            class428 var7 = this.field500.field8822;
            class332 var8 = this.field500.field8836;
            class402[] var9 = class517.field7282;
            int var10 = var7.field6079;
            class73 var11 = class495.field7002[var7.field6079][var4][var5];
            if (var11 != null) {
                var10 = var11.field963;
            }
            int var12 = var9[var10].method2381(-112, var4, var5);
            int var13;
            if (var10 < class126.field1511 - 1) {
                var13 = var9[var10 + 1].method2381(-92, var4, var5);
            } else {
                var13 = var12 - (8 << class455.field6383);
            }
            if (var8.field4241) {
                if (var8.field4254 == -1 && var6 > var12) {
                    this.method308();
                    return;
                }
                if (var8.field4254 >= 0 && var6 > var9[var8.field4254].method2381(-96, var4, var5)) {
                    this.method308();
                    return;
                }
                if (var8.field4263 == -1 && var6 < var13) {
                    this.method308();
                    return;
                }
                if (var8.field4263 >= 0 && var6 < var9[var8.field4263 + 1].method2381(-104, var4, var5)) {
                    this.method308();
                    return;
                }
            }
            int var14;
            for (var14 = class126.field1511 - 1; var14 > 0 && var6 > var9[var14].method2381(-111, var4, var5); --var14) {
            }
            if (var8.field4258 && var14 == 0 && var6 > var9[0].method2381(-113, var4, var5)) {
                this.method308();
            } else if (class126.field1511 - 1 == var14 && var9[var14].method2381(-97, var4, var5) - var6 > 8 << class455.field6383) {
                this.method308();
            } else {
                class73 var15 = class495.field7002[var14][var4][var5];
                if (var15 == null) {
                    if (var14 == 0 || class495.field7002[0][var4][var5] == null) {
                        var15 = class495.field7002[0][var4][var5] = new class73(0);
                    }
                    boolean var16 = class495.field7002[0][var4][var5].field962 != null;
                    if (var14 == 3 && var16) {
                        this.method308();
                        return;
                    }
                    for (int var17 = 1; var17 <= var14; ++var17) {
                        if (class495.field7002[var17][var4][var5] == null) {
                            var15 = class495.field7002[var17][var4][var5] = new class73(var17);
                            if (var16) {
                                ++var15.field963;
                            }
                        }
                    }
                }
                if (var8.field4211) {
                    int var18 = super.field10383 >> 12;
                    int var19 = super.field10387 >> 12;
                    if (var15.field973 != null) {
                        class152 var20 = var15.field973.method520(arg0, (byte) 125);
                        if (var20 != null && var20.method945(var6, var19, -127, var18)) {
                            this.method308();
                            return;
                        }
                    }
                    if (var15.field961 != null) {
                        class152 var21 = var15.field961.method520(arg0, (byte) 122);
                        if (var21 != null && var21.method945(var6, var19, -123, var18)) {
                            this.method308();
                            return;
                        }
                    }
                    if (var15.field966 != null) {
                        class152 var22 = var15.field966.method520(arg0, (byte) 117);
                        if (var22 != null && var22.method945(var6, var19, -122, var18)) {
                            this.method308();
                            return;
                        }
                    }
                    for (class456 var23 = var15.field969; var23 != null; var23 = var23.field6389) {
                        class152 var24 = var23.field6384.method520(arg0, (byte) 120);
                        if (var24 != null && var24.method945(var6, var19, -121, var18)) {
                            this.method308();
                            return;
                        }
                    }
                }
                var7.field6082.field8363.method2031(1, this);
            }
        } else {
            this.method308();
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "()V")
    private final void method306() {
        int var1 = this.field500.field8822.field6074;
        if (this.field500.field8822.field6076[var1] != null) {
            this.field500.field8822.field6076[var1].method308();
        }
        this.field500.field8822.field6076[var1] = this;
        this.field506 = (short) this.field500.field8822.field6074;
        this.field500.field8822.field6074 = var1 + 1 & 8191;
        this.field500.field8835.method1840(18, this);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lta;IIIIIIIIIIIZZ)V")
    public final void method307(class638 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field500 = arg0;
        super.field10383 = arg1 << 12;
        super.field10388 = arg2 << 12;
        super.field10387 = arg3 << 12;
        super.field10380 = arg9;
        this.field498 = this.field499 = (short) arg8;
        super.field10379 = arg10;
        super.field10385 = arg11;
        super.field10384 = arg13;
        this.field501 = (short) arg4;
        this.field502 = (short) arg5;
        this.field504 = (short) arg6;
        this.field505 = arg7;
        super.field10382 = this.field500.field8820.field2398;
        this.method306();
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "()V")
    public final void method308() {
        this.field500.field8822.field6076[this.field506] = null;
        class700.field9880[class556.field7802] = this;
        class556.field7802 = class556.field7802 + 1 & 1023;
        this.method3869(true);
        this.method1768((byte) 125);
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lta;IIIIIIIIIIIZZ)V")
    public class32(class638 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field500 = arg0;
        super.field10383 = arg1 << 12;
        super.field10388 = arg2 << 12;
        super.field10387 = arg3 << 12;
        super.field10380 = arg9;
        this.field498 = this.field499 = (short) arg8;
        super.field10379 = arg10;
        super.field10385 = arg11;
        super.field10384 = arg13;
        this.field501 = (short) arg4;
        this.field502 = (short) arg5;
        this.field504 = (short) arg6;
        this.field505 = arg7;
        super.field10382 = this.field500.field8820.field2398;
        this.method306();
    }
}
