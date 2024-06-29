import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public class class537 extends class484 {

    @OriginalMember(owner = "client!vda", name = "A", descriptor = "Ltca;")
    public class611 field7460;

    @OriginalMember(owner = "client!vda", name = "F", descriptor = "S")
    private short field7465;

    @OriginalMember(owner = "client!vda", name = "C", descriptor = "S")
    private short field7462;

    @OriginalMember(owner = "client!vda", name = "E", descriptor = "S")
    private short field7464;

    @OriginalMember(owner = "client!vda", name = "D", descriptor = "S")
    private short field7463;

    @OriginalMember(owner = "client!vda", name = "z", descriptor = "S")
    private short field7459;

    @OriginalMember(owner = "client!vda", name = "y", descriptor = "I")
    private int field7458;

    @OriginalMember(owner = "client!vda", name = "B", descriptor = "I")
    private int field7461;

    @OriginalMember(owner = "client!vda", name = "G", descriptor = "S")
    private short field7466;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "()V")
    private final void method3112() {
        int var1 = this.field7460.field8667.field2816;
        if (this.field7460.field8667.field2813[var1] != null) {
            this.field7460.field8667.field2813[var1].method3114();
        }
        this.field7460.field8667.field2813[var1] = this;
        this.field7466 = (short) this.field7460.field8667.field2816;
        this.field7460.field8667.field2816 = var1 + 1 & 8191;
        this.field7460.field8685.method1734(this, 0);
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lha;J)V")
    public final void method3113(class475 arg0, long arg1) {
        int var4 = super.field6681 >> class679.field9600 + 12;
        int var5 = super.field6685 >> class679.field9600 + 12;
        int var6 = super.field6684 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class42.field520 && var5 >= 0 && var5 < class681.field9665) {
            class187 var7 = this.field7460.field8667;
            class623 var8 = this.field7460.field8676;
            class419[] var9 = class678.field9594;
            int var10 = var7.field2825;
            class172 var11 = class514.field7096[var7.field2825][var4][var5];
            if (var11 != null) {
                var10 = var11.field2599;
            }
            int var12 = var9[var10].method2476(var5, var4, -1);
            int var13;
            if (var10 < class169.field2565 - 1) {
                var13 = var9[var10 + 1].method2476(var5, var4, -1);
            } else {
                var13 = var12 - (8 << class679.field9600);
            }
            if (var8.field8820) {
                if (var8.field8854 == -1 && var6 > var12) {
                    this.method3114();
                    return;
                }
                if (var8.field8854 >= 0 && var6 > var9[var8.field8854].method2476(var5, var4, -1)) {
                    this.method3114();
                    return;
                }
                if (var8.field8801 == -1 && var6 < var13) {
                    this.method3114();
                    return;
                }
                if (var8.field8801 >= 0 && var6 < var9[var8.field8801 + 1].method2476(var5, var4, -1)) {
                    this.method3114();
                    return;
                }
            }
            int var14;
            for (var14 = class169.field2565 - 1; var14 > 0 && var6 > var9[var14].method2476(var5, var4, -1); --var14) {
            }
            if (var8.field8808 && var14 == 0 && var6 > var9[0].method2476(var5, var4, -1)) {
                this.method3114();
            } else if (class169.field2565 - 1 == var14 && var9[var14].method2476(var5, var4, -1) - var6 > 8 << class679.field9600) {
                this.method3114();
            } else {
                class172 var15 = class514.field7096[var14][var4][var5];
                if (var15 == null) {
                    if (var14 == 0 || class514.field7096[0][var4][var5] == null) {
                        var15 = class514.field7096[0][var4][var5] = new class172(0);
                    }
                    boolean var16 = class514.field7096[0][var4][var5].field2592 != null;
                    if (var14 == 3 && var16) {
                        this.method3114();
                        return;
                    }
                    for (int var17 = 1; var17 <= var14; ++var17) {
                        if (class514.field7096[var17][var4][var5] == null) {
                            var15 = class514.field7096[var17][var4][var5] = new class172(var17);
                            if (var16) {
                                ++var15.field2599;
                            }
                        }
                    }
                }
                if (var8.field8827) {
                    int var18 = super.field6681 >> 12;
                    int var19 = super.field6685 >> 12;
                    if (var15.field2593 != null) {
                        class248 var20 = var15.field2593.method205((byte) 45, arg0);
                        if (var20 != null && var20.method1649(-116, var6, var19, var18)) {
                            this.method3114();
                            return;
                        }
                    }
                    if (var15.field2600 != null) {
                        class248 var21 = var15.field2600.method205((byte) 45, arg0);
                        if (var21 != null && var21.method1649(-117, var6, var19, var18)) {
                            this.method3114();
                            return;
                        }
                    }
                    if (var15.field2595 != null) {
                        class248 var22 = var15.field2595.method205((byte) 45, arg0);
                        if (var22 != null && var22.method1649(-65, var6, var19, var18)) {
                            this.method3114();
                            return;
                        }
                    }
                    for (class11 var23 = var15.field2594; var23 != null; var23 = var23.field145) {
                        class248 var24 = var23.field143.method205((byte) 45, arg0);
                        if (var24 != null && var24.method1649(-43, var6, var19, var18)) {
                            this.method3114();
                            return;
                        }
                    }
                }
                var7.field2827.field9377.method2126(this, -90);
            }
        } else {
            this.method3114();
        }
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "()V")
    public final void method3114() {
        this.field7460.field8667.field2813[this.field7466] = null;
        class174.field2630[class273.field3839] = this;
        class273.field3839 = class273.field3839 + 1 & 1023;
        this.method781(5555);
        this.method1207((byte) -1);
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Ltca;IIIIIIIIIIIZZ)V")
    public final void method3115(class611 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field7460 = arg0;
        super.field6681 = arg1 << 12;
        super.field6684 = arg2 << 12;
        super.field6685 = arg3 << 12;
        super.field6683 = arg9;
        this.field7462 = this.field7465 = (short) arg8;
        super.field6689 = arg10;
        super.field6687 = arg11;
        super.field6690 = arg13;
        this.field7464 = (short) arg4;
        this.field7463 = (short) arg5;
        this.field7459 = (short) arg6;
        this.field7458 = arg7;
        super.field6688 = this.field7460.field8669.field4766;
        this.method3112();
    }

    @OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(Ltca;IIIIIIIIIIIZZ)V")
    public class537(class611 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field7460 = arg0;
        super.field6681 = arg1 << 12;
        super.field6684 = arg2 << 12;
        super.field6685 = arg3 << 12;
        super.field6683 = arg9;
        this.field7462 = this.field7465 = (short) arg8;
        super.field6689 = arg10;
        super.field6687 = arg11;
        super.field6690 = arg13;
        this.field7464 = (short) arg4;
        this.field7463 = (short) arg5;
        this.field7459 = (short) arg6;
        this.field7458 = arg7;
        super.field6688 = this.field7460.field8669.field4766;
        this.method3112();
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(JI)V")
    public final void method3116(long arg0, int arg1) {
        this.field7465 = (short) (this.field7465 - arg1);
        if (this.field7465 <= 0) {
            this.method3114();
        } else {
            int var4 = super.field6681 >> 12;
            int var5 = super.field6684 >> 12;
            int var6 = super.field6685 >> 12;
            class187 var7 = this.field7460.field8667;
            class623 var8 = this.field7460.field8676;
            if (var8.field8790 != 0) {
                if (this.field7462 - this.field7465 <= var8.field8806) {
                    int var9 = var8.field8813 * arg1 + (this.field7461 >> 16 & 255) + (super.field6683 >> 8 & 65280);
                    int var10 = var8.field8793 * arg1 + (this.field7461 >> 8 & 255) + (super.field6683 & 65280);
                    int var11 = var8.field8796 * arg1 + (super.field6683 << 8 & 65280) + (this.field7461 & 255);
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
                    super.field6683 &= -16777216;
                    super.field6683 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field7461 &= -16777216;
                    this.field7461 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field7462 - this.field7465 <= var8.field8815) {
                    int var12 = var8.field8810 * arg1 + (this.field7461 >> 24 & 255) + (super.field6683 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field6683 &= 16777215;
                    super.field6683 |= (var12 & 65280) << 16;
                    this.field7461 &= 16777215;
                    this.field7461 |= (var12 & 255) << 24;
                }
            }
            if (var8.field8807 != -1 && this.field7462 - this.field7465 <= var8.field8795) {
                this.field7458 += var8.field8834 * arg1;
            }
            if (var8.field8837 != -1 && this.field7462 - this.field7465 <= var8.field8832) {
                super.field6689 += var8.field8803 * arg1;
            }
            double var13 = (double) this.field7464;
            double var15 = (double) this.field7463;
            double var17 = (double) this.field7459;
            boolean var19 = false;
            if (var8.field8845 == 1) {
                int var20 = var4 - this.field7460.field8678.field6365;
                int var21 = var5 - this.field7460.field8678.field6358;
                int var22 = var6 - this.field7460.field8678.field6354;
                int var23 = (int) Math.sqrt((double) (var22 * var22 + var20 * var20 + var21 * var21)) >> 2;
                long var24 = (long) (var8.field8811 * var23 * arg1);
                this.field7458 = (int) ((long) this.field7458 - ((long) this.field7458 * var24 >> 18));
            } else if (var8.field8845 == 2) {
                int var26 = var4 - this.field7460.field8678.field6365;
                int var27 = var5 - this.field7460.field8678.field6358;
                int var28 = var6 - this.field7460.field8678.field6354;
                int var29 = var28 * var28 + var26 * var26 + var27 * var27;
                long var30 = (long) (var8.field8811 * var29 * arg1);
                this.field7458 = (int) ((long) this.field7458 - ((long) this.field7458 * var30 >> 28));
            }
            if (var8.field8822 != null) {
                class766 var32 = var7.field2823.field9375;
                for (class766 var33 = var32.field10591; var32 != var33; var33 = var33.field10591) {
                    class135 var34 = (class135) var33;
                    class119 var35 = var34.field2247;
                    if (var35.field2034 != 1) {
                        boolean var36 = false;
                        for (int var37 = 0; var37 < var8.field8822.length; ++var37) {
                            if (var8.field8822[var37] == var35.field2032) {
                                var36 = true;
                                break;
                            }
                        }
                        if (var36) {
                            double var38 = (double) (var4 - var34.field2251);
                            double var40 = (double) (var5 - var34.field2249);
                            double var42 = (double) (var6 - var34.field2253);
                            double var44 = var42 * var42 + var38 * var38 + var40 * var40;
                            if (!(var44 > (double) var35.field2024)) {
                                double var46 = Math.sqrt(var44);
                                if (var46 == 0.0D) {
                                    var46 = 1.0D;
                                }
                                double var48 = ((double) var34.field2250 * var42 + (double) var34.field2248 * var38 + (double) var35.field2037 * var40) * 65535.0D / ((double) var35.field2019 * var46);
                                if (!(var48 < (double) var35.field2038)) {
                                    double var50 = 0.0D;
                                    if (var35.field2033 == 1) {
                                        var50 = var46 / 16.0D * (double) var35.field2039;
                                    } else if (var35.field2033 == 2) {
                                        var50 = var46 / 16.0D * (var46 / 16.0D) * (double) var35.field2039;
                                    }
                                    if (var35.field2023 == 0) {
                                        if (var35.field2041 == 0) {
                                            var13 += ((double) var34.field2248 - var50) * (double) arg1;
                                            var15 += ((double) var35.field2037 - var50) * (double) arg1;
                                            var17 += ((double) var34.field2250 - var50) * (double) arg1;
                                            var19 = true;
                                        } else {
                                            super.field6681 = (int) ((double) super.field6681 + ((double) var34.field2248 - var50) * (double) arg1);
                                            super.field6684 = (int) ((double) super.field6684 + ((double) var35.field2037 - var50) * (double) arg1);
                                            super.field6685 = (int) ((double) super.field6685 + ((double) var34.field2250 - var50) * (double) arg1);
                                        }
                                    } else {
                                        double var52 = var38 / var46 * (double) var35.field2019;
                                        double var54 = var40 / var46 * (double) var35.field2019;
                                        double var56 = var42 / var46 * (double) var35.field2019;
                                        if (var35.field2041 == 0) {
                                            var13 += (double) arg1 * var52;
                                            var15 += (double) arg1 * var54;
                                            var17 += (double) arg1 * var56;
                                            var19 = true;
                                        } else {
                                            super.field6681 = (int) ((double) super.field6681 + (double) arg1 * var52);
                                            super.field6684 = (int) ((double) super.field6684 + (double) arg1 * var54);
                                            super.field6685 = (int) ((double) super.field6685 + (double) arg1 * var56);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field8855 != null) {
                for (int var58 = 0; var58 < var8.field8855.length; ++var58) {
                    class135 var59 = (class135) class74.field1141.method4270((long) var8.field8855[var58], (byte) 87);
                    while (var59 != null) {
                        class119 var60 = var59.field2247;
                        double var61 = (double) (var4 - var59.field2251);
                        double var63 = (double) (var5 - var59.field2249);
                        double var65 = (double) (var6 - var59.field2253);
                        double var67 = var65 * var65 + var61 * var61 + var63 * var63;
                        if (var67 > (double) var60.field2024) {
                            var59 = (class135) class74.field1141.method4268((byte) 69);
                        } else {
                            double var69 = Math.sqrt(var67);
                            if (var69 == 0.0D) {
                                var69 = 1.0D;
                            }
                            double var71 = ((double) var59.field2250 * var65 + (double) var59.field2248 * var61 + (double) var60.field2037 * var63) * 65535.0D / ((double) var60.field2019 * var69);
                            if (var71 < (double) var60.field2038) {
                                var59 = (class135) class74.field1141.method4268((byte) 69);
                            } else {
                                double var73 = 0.0D;
                                if (var60.field2033 == 1) {
                                    var73 = var69 / 16.0D * (double) var60.field2039;
                                } else if (var60.field2033 == 2) {
                                    var73 = var69 / 16.0D * (var69 / 16.0D) * (double) var60.field2039;
                                }
                                if (var60.field2023 == 0) {
                                    if (var60.field2041 == 0) {
                                        var13 += ((double) var59.field2248 - var73) * (double) arg1;
                                        var15 += ((double) var60.field2037 - var73) * (double) arg1;
                                        var17 += ((double) var59.field2250 - var73) * (double) arg1;
                                        var19 = true;
                                    } else {
                                        super.field6681 = (int) ((double) super.field6681 + ((double) var59.field2248 - var73) * (double) arg1);
                                        super.field6684 = (int) ((double) super.field6684 + ((double) var60.field2037 - var73) * (double) arg1);
                                        super.field6685 = (int) ((double) super.field6685 + ((double) var59.field2250 - var73) * (double) arg1);
                                    }
                                } else {
                                    double var75 = var61 / var69 * (double) var60.field2019;
                                    double var77 = var63 / var69 * (double) var60.field2019;
                                    double var79 = var65 / var69 * (double) var60.field2019;
                                    if (var60.field2041 == 0) {
                                        var13 += (double) arg1 * var75;
                                        var15 += (double) arg1 * var77;
                                        var17 += (double) arg1 * var79;
                                        var19 = true;
                                    } else {
                                        super.field6681 = (int) ((double) super.field6681 + (double) arg1 * var75);
                                        super.field6684 = (int) ((double) super.field6684 + (double) arg1 * var77);
                                        super.field6685 = (int) ((double) super.field6685 + (double) arg1 * var79);
                                    }
                                }
                                var59 = (class135) class74.field1141.method4268((byte) 69);
                            }
                        }
                    }
                }
            }
            if (var8.field8817 != null) {
                if (var8.field8816 == null) {
                    var8.field8816 = new int[var8.field8817.length];
                    for (int var81 = 0; var81 < var8.field8817.length; ++var81) {
                        class306.method1889(var8.field8817[var81], false);
                        var8.field8816[var81] = ((class725) class639.field9007.method4253((long) var8.field8817[var81], -1)).field10098;
                    }
                }
                for (int var82 = 0; var82 < var8.field8816.length; ++var82) {
                    class119 var83 = class778.field10672[var8.field8816[var82]];
                    if (var83.field2041 == 0) {
                        var13 += (double) (var83.field2036 * arg1);
                        var15 += (double) (var83.field2037 * arg1);
                        var17 += (double) (var83.field2027 * arg1);
                        var19 = true;
                    } else {
                        super.field6681 += var83.field2036 * arg1;
                        super.field6684 += var83.field2037 * arg1;
                        super.field6685 += var83.field2027 * arg1;
                    }
                }
            }
            if (var19) {
                while (true) {
                    if (!(var13 > 32767.0D) && !(var15 > 32767.0D) && !(var17 > 32767.0D) && !(var13 < -32767.0D) && !(var15 < -32767.0D) && !(var17 < -32767.0D)) {
                        this.field7464 = (short) ((int) var13);
                        this.field7463 = (short) ((int) var15);
                        this.field7459 = (short) ((int) var17);
                        break;
                    }
                    var13 /= 2.0D;
                    var15 /= 2.0D;
                    var17 /= 2.0D;
                    this.field7458 <<= 1;
                }
            }
            super.field6681 = (int) ((long) super.field6681 + ((long) (this.field7458 << 2) * (long) this.field7464 >> 23) * (long) arg1);
            super.field6684 = (int) ((long) super.field6684 + ((long) (this.field7458 << 2) * (long) this.field7463 >> 23) * (long) arg1);
            super.field6685 = (int) ((long) super.field6685 + ((long) (this.field7458 << 2) * (long) this.field7459 >> 23) * (long) arg1);
        }
    }
}
