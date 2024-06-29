import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public class class336 extends class468 {

    @OriginalMember(owner = "client!uea", name = "S", descriptor = "Lut;")
    public class135 field4879;

    @OriginalMember(owner = "client!uea", name = "M", descriptor = "S")
    private short field4873;

    @OriginalMember(owner = "client!uea", name = "B", descriptor = "S")
    private short field4871;

    @OriginalMember(owner = "client!uea", name = "P", descriptor = "S")
    private short field4876;

    @OriginalMember(owner = "client!uea", name = "N", descriptor = "S")
    private short field4874;

    @OriginalMember(owner = "client!uea", name = "R", descriptor = "S")
    private short field4878;

    @OriginalMember(owner = "client!uea", name = "Q", descriptor = "I")
    private int field4877;

    @OriginalMember(owner = "client!uea", name = "L", descriptor = "I")
    private int field4872;

    @OriginalMember(owner = "client!uea", name = "O", descriptor = "S")
    private short field4875;

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "()V")
    private final void method2132() {
        int var1 = this.field4879.field1981.field9164;
        if (this.field4879.field1981.field9159[var1] != null) {
            this.field4879.field1981.field9159[var1].method2134();
        }
        this.field4879.field1981.field9159[var1] = this;
        this.field4875 = (short) this.field4879.field1981.field9164;
        this.field4879.field1981.field9164 = var1 + 1 & 8191;
        this.field4879.field1979.method106(this, (byte) 119);
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(Lha;J)V")
    public final void method2133(class65 arg0, long arg1) {
        int var4 = super.field6493 >> class26.field388 + 12;
        int var5 = super.field6488 >> class26.field388 + 12;
        int var6 = super.field6486 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class405.field5875 && var5 >= 0 && var5 < class710.field9947) {
            class663 var7 = this.field4879.field1981;
            class571 var8 = this.field4879.field1990;
            class296[] var9 = class528.field7227;
            int var10 = var7.field9170;
            class243 var11 = class626.field8501[var7.field9170][var4][var5];
            if (var11 != null) {
                var10 = var11.field3275;
            }
            int var12 = var9[var10].method1880(var4, false, var5);
            int var13;
            if (var10 < class315.field4541 - 1) {
                var13 = var9[var10 + 1].method1880(var4, false, var5);
            } else {
                var13 = var12 - (8 << class26.field388);
            }
            if (var8.field7593) {
                if (var8.field7598 == -1 && var6 > var12) {
                    this.method2134();
                    return;
                }
                if (var8.field7598 >= 0 && var6 > var9[var8.field7598].method1880(var4, false, var5)) {
                    this.method2134();
                    return;
                }
                if (var8.field7639 == -1 && var6 < var13) {
                    this.method2134();
                    return;
                }
                if (var8.field7639 >= 0 && var6 < var9[var8.field7639 + 1].method1880(var4, false, var5)) {
                    this.method2134();
                    return;
                }
            }
            int var14;
            for (var14 = class315.field4541 - 1; var14 > 0 && var6 > var9[var14].method1880(var4, false, var5); --var14) {
            }
            if (var8.field7603 && var14 == 0 && var6 > var9[0].method1880(var4, false, var5)) {
                this.method2134();
            } else if (class315.field4541 - 1 == var14 && var9[var14].method1880(var4, false, var5) - var6 > 8 << class26.field388) {
                this.method2134();
            } else {
                class243 var15 = class626.field8501[var14][var4][var5];
                if (var15 == null) {
                    if (var14 == 0 || class626.field8501[0][var4][var5] == null) {
                        var15 = class626.field8501[0][var4][var5] = new class243(0);
                    }
                    boolean var16 = class626.field8501[0][var4][var5].field3281 != null;
                    if (var14 == 3 && var16) {
                        this.method2134();
                        return;
                    }
                    for (int var17 = 1; var17 <= var14; ++var17) {
                        if (class626.field8501[var17][var4][var5] == null) {
                            var15 = class626.field8501[var17][var4][var5] = new class243(var17);
                            if (var16) {
                                ++var15.field3275;
                            }
                        }
                    }
                }
                if (var8.field7599) {
                    int var18 = super.field6493 >> 12;
                    int var19 = super.field6488 >> 12;
                    if (var15.field3270 != null) {
                        class574 var20 = var15.field3270.method27(arg0, (byte) -126);
                        if (var20 != null && var20.method3212(var19, var6, (byte) -126, var18)) {
                            this.method2134();
                            return;
                        }
                    }
                    if (var15.field3269 != null) {
                        class574 var21 = var15.field3269.method27(arg0, (byte) -126);
                        if (var21 != null && var21.method3212(var19, var6, (byte) -122, var18)) {
                            this.method2134();
                            return;
                        }
                    }
                    if (var15.field3280 != null) {
                        class574 var22 = var15.field3280.method27(arg0, (byte) -126);
                        if (var22 != null && var22.method3212(var19, var6, (byte) -125, var18)) {
                            this.method2134();
                            return;
                        }
                    }
                    for (class48 var23 = var15.field3272; var23 != null; var23 = var23.field726) {
                        class574 var24 = var23.field725.method27(arg0, (byte) -126);
                        if (var24 != null && var24.method3212(var19, var6, (byte) -95, var18)) {
                            this.method2134();
                            return;
                        }
                    }
                }
                var7.field9172.field7049.method633((byte) 45, this);
            }
        } else {
            this.method2134();
        }
    }

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "()V")
    public final void method2134() {
        this.field4879.field1981.field9159[this.field4875] = null;
        class592.field7969[class461.field6389] = this;
        class461.field6389 = class461.field6389 + 1 & 1023;
        this.method2922((byte) -80);
        this.method2599((byte) 82);
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(JI)V")
    public final void method2135(long arg0, int arg1) {
        this.field4873 = (short) (this.field4873 - arg1);
        if (this.field4873 <= 0) {
            this.method2134();
        } else {
            int var4 = super.field6493 >> 12;
            int var5 = super.field6486 >> 12;
            int var6 = super.field6488 >> 12;
            class663 var7 = this.field4879.field1981;
            class571 var8 = this.field4879.field1990;
            if (var8.field7609 != 0) {
                if (this.field4871 - this.field4873 <= var8.field7594) {
                    int var9 = var8.field7638 * arg1 + (super.field6497 >> 8 & 65280) + (this.field4872 >> 16 & 255);
                    int var10 = var8.field7659 * arg1 + (this.field4872 >> 8 & 255) + (super.field6497 & 65280);
                    int var11 = var8.field7656 * arg1 + (super.field6497 << 8 & 65280) + (this.field4872 & 255);
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
                    super.field6497 &= -16777216;
                    super.field6497 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field4872 &= -16777216;
                    this.field4872 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field4871 - this.field4873 <= var8.field7644) {
                    int var12 = var8.field7651 * arg1 + (super.field6497 >> 16 & 65280) + (this.field4872 >> 24 & 255);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field6497 &= 16777215;
                    super.field6497 |= (var12 & 65280) << 16;
                    this.field4872 &= 16777215;
                    this.field4872 |= (var12 & 255) << 24;
                }
            }
            if (var8.field7619 != -1 && this.field4871 - this.field4873 <= var8.field7657) {
                this.field4877 += var8.field7596 * arg1;
            }
            if (var8.field7653 != -1 && this.field4871 - this.field4873 <= var8.field7658) {
                super.field6487 += var8.field7648 * arg1;
            }
            double var13 = (double) this.field4876;
            double var15 = (double) this.field4874;
            double var17 = (double) this.field4878;
            boolean var19 = false;
            if (var8.field7632 == 1) {
                int var20 = var4 - this.field4879.field1987.field1134;
                int var21 = var5 - this.field4879.field1987.field1123;
                int var22 = var6 - this.field4879.field1987.field1133;
                int var23 = (int) Math.sqrt((double) (var22 * var22 + var20 * var20 + var21 * var21)) >> 2;
                long var24 = (long) (var8.field7642 * var23 * arg1);
                this.field4877 = (int) ((long) this.field4877 - ((long) this.field4877 * var24 >> 18));
            } else if (var8.field7632 == 2) {
                int var26 = var4 - this.field4879.field1987.field1134;
                int var27 = var5 - this.field4879.field1987.field1123;
                int var28 = var6 - this.field4879.field1987.field1133;
                int var29 = var28 * var28 + var26 * var26 + var27 * var27;
                long var30 = (long) (var8.field7642 * var29 * arg1);
                this.field4877 = (int) ((long) this.field4877 - ((long) this.field4877 * var30 >> 28));
            }
            if (var8.field7613 != null) {
                class101 var32 = var7.field9169.field5921;
                for (class101 var33 = var32.field1412; var32 != var33; var33 = var33.field1412) {
                    class467 var34 = (class467) var33;
                    class230 var35 = var34.field6480;
                    if (var35.field3140 != 1) {
                        boolean var36 = false;
                        for (int var37 = 0; var37 < var8.field7613.length; ++var37) {
                            if (var8.field7613[var37] == var35.field3128) {
                                var36 = true;
                                break;
                            }
                        }
                        if (var36) {
                            double var38 = (double) (var4 - var34.field6483);
                            double var40 = (double) (var5 - var34.field6475);
                            double var42 = (double) (var6 - var34.field6478);
                            double var44 = var42 * var42 + var38 * var38 + var40 * var40;
                            if (!(var44 > (double) var35.field3127)) {
                                double var46 = Math.sqrt(var44);
                                if (var46 == 0.0D) {
                                    var46 = 1.0D;
                                }
                                double var48 = ((double) var34.field6481 * var42 + (double) var34.field6477 * var38 + (double) var35.field3126 * var40) * 65535.0D / ((double) var35.field3132 * var46);
                                if (!(var48 < (double) var35.field3130)) {
                                    double var50 = 0.0D;
                                    if (var35.field3129 == 1) {
                                        var50 = var46 / 16.0D * (double) var35.field3131;
                                    } else if (var35.field3129 == 2) {
                                        var50 = var46 / 16.0D * (var46 / 16.0D) * (double) var35.field3131;
                                    }
                                    if (var35.field3143 == 0) {
                                        if (var35.field3136 == 0) {
                                            var13 += ((double) var34.field6477 - var50) * (double) arg1;
                                            var15 += ((double) var35.field3126 - var50) * (double) arg1;
                                            var17 += ((double) var34.field6481 - var50) * (double) arg1;
                                            var19 = true;
                                        } else {
                                            super.field6493 = (int) ((double) super.field6493 + ((double) var34.field6477 - var50) * (double) arg1);
                                            super.field6486 = (int) ((double) super.field6486 + ((double) var35.field3126 - var50) * (double) arg1);
                                            super.field6488 = (int) ((double) super.field6488 + ((double) var34.field6481 - var50) * (double) arg1);
                                        }
                                    } else {
                                        double var52 = var38 / var46 * (double) var35.field3132;
                                        double var54 = var40 / var46 * (double) var35.field3132;
                                        double var56 = var42 / var46 * (double) var35.field3132;
                                        if (var35.field3136 == 0) {
                                            var13 += (double) arg1 * var52;
                                            var15 += (double) arg1 * var54;
                                            var17 += (double) arg1 * var56;
                                            var19 = true;
                                        } else {
                                            super.field6493 = (int) ((double) super.field6493 + (double) arg1 * var52);
                                            super.field6486 = (int) ((double) super.field6486 + (double) arg1 * var54);
                                            super.field6488 = (int) ((double) super.field6488 + (double) arg1 * var56);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field7645 != null) {
                for (int var58 = 0; var58 < var8.field7645.length; ++var58) {
                    class467 var59 = (class467) class561.field7542.method1688(5, (long) var8.field7645[var58]);
                    while (var59 != null) {
                        class230 var60 = var59.field6480;
                        double var61 = (double) (var4 - var59.field6483);
                        double var63 = (double) (var5 - var59.field6475);
                        double var65 = (double) (var6 - var59.field6478);
                        double var67 = var65 * var65 + var61 * var61 + var63 * var63;
                        if (var67 > (double) var60.field3127) {
                            var59 = (class467) class561.field7542.method1686((byte) -79);
                        } else {
                            double var69 = Math.sqrt(var67);
                            if (var69 == 0.0D) {
                                var69 = 1.0D;
                            }
                            double var71 = ((double) var59.field6481 * var65 + (double) var59.field6477 * var61 + (double) var60.field3126 * var63) * 65535.0D / ((double) var60.field3132 * var69);
                            if (var71 < (double) var60.field3130) {
                                var59 = (class467) class561.field7542.method1686((byte) -79);
                            } else {
                                double var73 = 0.0D;
                                if (var60.field3129 == 1) {
                                    var73 = var69 / 16.0D * (double) var60.field3131;
                                } else if (var60.field3129 == 2) {
                                    var73 = var69 / 16.0D * (var69 / 16.0D) * (double) var60.field3131;
                                }
                                if (var60.field3143 == 0) {
                                    if (var60.field3136 == 0) {
                                        var13 += ((double) var59.field6477 - var73) * (double) arg1;
                                        var15 += ((double) var60.field3126 - var73) * (double) arg1;
                                        var17 += ((double) var59.field6481 - var73) * (double) arg1;
                                        var19 = true;
                                    } else {
                                        super.field6493 = (int) ((double) super.field6493 + ((double) var59.field6477 - var73) * (double) arg1);
                                        super.field6486 = (int) ((double) super.field6486 + ((double) var60.field3126 - var73) * (double) arg1);
                                        super.field6488 = (int) ((double) super.field6488 + ((double) var59.field6481 - var73) * (double) arg1);
                                    }
                                } else {
                                    double var75 = var61 / var69 * (double) var60.field3132;
                                    double var77 = var63 / var69 * (double) var60.field3132;
                                    double var79 = var65 / var69 * (double) var60.field3132;
                                    if (var60.field3136 == 0) {
                                        var13 += (double) arg1 * var75;
                                        var15 += (double) arg1 * var77;
                                        var17 += (double) arg1 * var79;
                                        var19 = true;
                                    } else {
                                        super.field6493 = (int) ((double) super.field6493 + (double) arg1 * var75);
                                        super.field6486 = (int) ((double) super.field6486 + (double) arg1 * var77);
                                        super.field6488 = (int) ((double) super.field6488 + (double) arg1 * var79);
                                    }
                                }
                                var59 = (class467) class561.field7542.method1686((byte) -79);
                            }
                        }
                    }
                }
            }
            if (var8.field7633 != null) {
                if (var8.field7615 == null) {
                    var8.field7615 = new int[var8.field7633.length];
                    for (int var81 = 0; var81 < var8.field7633.length; ++var81) {
                        class40.method277(var8.field7633[var81], true);
                        var8.field7615[var81] = ((class119) class179.field2380.method3953((long) var8.field7633[var81], 14)).field1725;
                    }
                }
                for (int var82 = 0; var82 < var8.field7615.length; ++var82) {
                    class230 var83 = class413.field5936[var8.field7615[var82]];
                    if (var83.field3136 == 0) {
                        var13 += (double) (var83.field3137 * arg1);
                        var15 += (double) (var83.field3126 * arg1);
                        var17 += (double) (var83.field3125 * arg1);
                        var19 = true;
                    } else {
                        super.field6493 += var83.field3137 * arg1;
                        super.field6486 += var83.field3126 * arg1;
                        super.field6488 += var83.field3125 * arg1;
                    }
                }
            }
            if (var19) {
                while (true) {
                    if (!(var13 > 32767.0D) && !(var15 > 32767.0D) && !(var17 > 32767.0D) && !(var13 < -32767.0D) && !(var15 < -32767.0D) && !(var17 < -32767.0D)) {
                        this.field4876 = (short) ((int) var13);
                        this.field4874 = (short) ((int) var15);
                        this.field4878 = (short) ((int) var17);
                        break;
                    }
                    var13 /= 2.0D;
                    var15 /= 2.0D;
                    var17 /= 2.0D;
                    this.field4877 <<= 1;
                }
            }
            super.field6493 = (int) ((long) super.field6493 + ((long) (this.field4877 << 2) * (long) this.field4876 >> 23) * (long) arg1);
            super.field6486 = (int) ((long) super.field6486 + ((long) (this.field4877 << 2) * (long) this.field4874 >> 23) * (long) arg1);
            super.field6488 = (int) ((long) super.field6488 + ((long) (this.field4877 << 2) * (long) this.field4878 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(Lut;IIIIIIIIIIIZZ)V")
    public class336(class135 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field4879 = arg0;
        super.field6493 = arg1 << 12;
        super.field6486 = arg2 << 12;
        super.field6488 = arg3 << 12;
        super.field6497 = arg9;
        this.field4871 = this.field4873 = (short) arg8;
        super.field6487 = arg10;
        super.field6496 = arg11;
        super.field6498 = arg13;
        this.field4876 = (short) arg4;
        this.field4874 = (short) arg5;
        this.field4878 = (short) arg6;
        this.field4877 = arg7;
        super.field6492 = this.field4879.field1982.field7746;
        this.method2132();
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(Lut;IIIIIIIIIIIZZ)V")
    public final void method2136(class135 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field4879 = arg0;
        super.field6493 = arg1 << 12;
        super.field6486 = arg2 << 12;
        super.field6488 = arg3 << 12;
        super.field6497 = arg9;
        this.field4871 = this.field4873 = (short) arg8;
        super.field6487 = arg10;
        super.field6496 = arg11;
        super.field6498 = arg13;
        this.field4876 = (short) arg4;
        this.field4874 = (short) arg5;
        this.field4878 = (short) arg6;
        this.field4877 = arg7;
        super.field6492 = this.field4879.field1982.field7746;
        this.method2132();
    }
}
