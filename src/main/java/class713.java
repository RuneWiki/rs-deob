import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class713 extends class126 {

    @OriginalMember(owner = "client!vm", name = "I", descriptor = "Lfg;")
    public class139 field9732;

    @OriginalMember(owner = "client!vm", name = "G", descriptor = "S")
    private short field9730;

    @OriginalMember(owner = "client!vm", name = "C", descriptor = "S")
    private short field9726;

    @OriginalMember(owner = "client!vm", name = "D", descriptor = "S")
    private short field9727;

    @OriginalMember(owner = "client!vm", name = "B", descriptor = "S")
    private short field9725;

    @OriginalMember(owner = "client!vm", name = "F", descriptor = "S")
    private short field9729;

    @OriginalMember(owner = "client!vm", name = "H", descriptor = "I")
    private int field9731;

    @OriginalMember(owner = "client!vm", name = "J", descriptor = "I")
    private int field9733;

    @OriginalMember(owner = "client!vm", name = "E", descriptor = "S")
    private short field9728;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lfg;IIIIIIIIIIIZZ)V", line = 5)
    public final void method3949(class139 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field9732 = arg0;
        super.field1725 = arg1 << 12;
        super.field1729 = arg2 << 12;
        super.field1730 = arg3 << 12;
        super.field1727 = arg9;
        this.field9726 = this.field9730 = (short) arg8;
        super.field1726 = arg10;
        super.field1733 = arg11;
        super.field1728 = arg13;
        this.field9727 = (short) arg4;
        this.field9725 = (short) arg5;
        this.field9729 = (short) arg6;
        this.field9731 = arg7;
        super.field1723 = this.field9732.field1870.field4151;
        this.method3950();
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "()V", line = 26)
    private final void method3950() {
        int var1 = this.field9732.field1874.field2036;
        if (this.field9732.field1874.field2037[var1] != null) {
            this.field9732.field1874.field2037[var1].method3953();
        }
        this.field9732.field1874.field2037[var1] = this;
        this.field9728 = (short) this.field9732.field1874.field2036;
        this.field9732.field1874.field2036 = var1 + 1 & 8191;
        this.field9732.field1875.method2188((byte) 31, this);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lha;J)V", line = 37)
    public final void method3951(class66 arg0, long arg1) {
        int var4 = super.field1725 >> class478.field6717 + 12;
        int var5 = super.field1730 >> class478.field6717 + 12;
        int var6 = super.field1729 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class196.field2540 && var5 >= 0 && var5 < class247.field3229) {
            class150 var7 = this.field9732.field1874;
            class212 var8 = this.field9732.field1869;
            class295[] var9 = class645.field8694;
            int var10 = var7.field2046;
            class194 var11 = class443.field6387[var7.field2046][var4][var5];
            if (var11 != null) {
                var10 = var11.field2521;
            }
            int var12 = var9[var10].method1898(var5, var4, (byte) -91);
            int var13;
            if (var10 < class504.field7090 - 1) {
                var13 = var9[var10 + 1].method1898(var5, var4, (byte) -17);
            } else {
                var13 = var12 - (8 << class478.field6717);
            }
            if (var8.field2764) {
                if (var8.field2728 == -1 && var6 > var12) {
                    this.method3953();
                    return;
                }
                if (var8.field2728 >= 0 && var6 > var9[var8.field2728].method1898(var5, var4, (byte) -126)) {
                    this.method3953();
                    return;
                }
                if (var8.field2785 == -1 && var6 < var13) {
                    this.method3953();
                    return;
                }
                if (var8.field2785 >= 0 && var6 < var9[var8.field2785 + 1].method1898(var5, var4, (byte) -16)) {
                    this.method3953();
                    return;
                }
            }
            int var14;
            for (var14 = class504.field7090 - 1; var14 > 0 && var6 > var9[var14].method1898(var5, var4, (byte) -4); --var14) {
            }
            if (var8.field2729 && var14 == 0 && var6 > var9[0].method1898(var5, var4, (byte) -68)) {
                this.method3953();
            } else if (class504.field7090 - 1 == var14 && var9[var14].method1898(var5, var4, (byte) -11) - var6 > 8 << class478.field6717) {
                this.method3953();
            } else {
                class194 var15 = class443.field6387[var14][var4][var5];
                if (var15 == null) {
                    if (var14 == 0 || class443.field6387[0][var4][var5] == null) {
                        var15 = class443.field6387[0][var4][var5] = new class194(0);
                    }
                    boolean var16 = class443.field6387[0][var4][var5].field2526 != null;
                    if (var14 == 3 && var16) {
                        this.method3953();
                        return;
                    }
                    for (int var17 = 1; var17 <= var14; ++var17) {
                        if (class443.field6387[var17][var4][var5] == null) {
                            var15 = class443.field6387[var17][var4][var5] = new class194(var17);
                            if (var16) {
                                ++var15.field2521;
                            }
                        }
                    }
                }
                if (var8.field2716) {
                    int var18 = super.field1725 >> 12;
                    int var19 = super.field1730 >> 12;
                    if (var15.field2527 != null) {
                        class398 var20 = var15.field2527.method119(arg0, (byte) -54);
                        if (var20 != null && var20.method2430(115, var18, var6, var19)) {
                            this.method3953();
                            return;
                        }
                    }
                    if (var15.field2523 != null) {
                        class398 var21 = var15.field2523.method119(arg0, (byte) -47);
                        if (var21 != null && var21.method2430(119, var18, var6, var19)) {
                            this.method3953();
                            return;
                        }
                    }
                    if (var15.field2519 != null) {
                        class398 var22 = var15.field2519.method119(arg0, (byte) -51);
                        if (var22 != null && var22.method2430(110, var18, var6, var19)) {
                            this.method3953();
                            return;
                        }
                    }
                    for (class511 var23 = var15.field2525; var23 != null; var23 = var23.field7127) {
                        class398 var24 = var23.field7126.method119(arg0, (byte) -48);
                        if (var24 != null && var24.method2430(112, var18, var6, var19)) {
                            this.method3953();
                            return;
                        }
                    }
                }
                var7.field2043.field7972.method1833((byte) -93, this);
            }
        } else {
            this.method3953();
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(JI)V", line = 213)
    public final void method3952(long arg0, int arg1) {
        this.field9730 = (short) (this.field9730 - arg1);
        if (this.field9730 <= 0) {
            this.method3953();
        } else {
            int var4 = super.field1725 >> 12;
            int var5 = super.field1729 >> 12;
            int var6 = super.field1730 >> 12;
            class150 var7 = this.field9732.field1874;
            class212 var8 = this.field9732.field1869;
            if (var8.field2778 != 0) {
                if (this.field9726 - this.field9730 <= var8.field2754) {
                    int var9 = var8.field2746 * arg1 + (this.field9733 >> 16 & 255) + (super.field1727 >> 8 & 65280);
                    int var10 = var8.field2780 * arg1 + (this.field9733 >> 8 & 255) + (super.field1727 & 65280);
                    int var11 = var8.field2784 * arg1 + (super.field1727 << 8 & 65280) + (this.field9733 & 255);
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
                    super.field1727 &= -16777216;
                    super.field1727 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field9733 &= -16777216;
                    this.field9733 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field9726 - this.field9730 <= var8.field2761) {
                    int var12 = var8.field2779 * arg1 + (this.field9733 >> 24 & 255) + (super.field1727 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field1727 &= 16777215;
                    super.field1727 |= (var12 & 65280) << 16;
                    this.field9733 &= 16777215;
                    this.field9733 |= (var12 & 255) << 24;
                }
            }
            if (var8.field2781 != -1 && this.field9726 - this.field9730 <= var8.field2772) {
                this.field9731 += var8.field2768 * arg1;
            }
            if (var8.field2766 != -1 && this.field9726 - this.field9730 <= var8.field2743) {
                super.field1726 += var8.field2783 * arg1;
            }
            double var13 = (double) this.field9727;
            double var15 = (double) this.field9725;
            double var17 = (double) this.field9729;
            boolean var19 = false;
            if (var8.field2752 == 1) {
                int var20 = var4 - this.field9732.field1878.field9913;
                int var21 = var5 - this.field9732.field1878.field9921;
                int var22 = var6 - this.field9732.field1878.field9926;
                int var23 = (int) Math.sqrt((double) (var22 * var22 + var20 * var20 + var21 * var21)) >> 2;
                long var24 = (long) (var8.field2773 * var23 * arg1);
                this.field9731 = (int) ((long) this.field9731 - ((long) this.field9731 * var24 >> 18));
            } else if (var8.field2752 == 2) {
                int var26 = var4 - this.field9732.field1878.field9913;
                int var27 = var5 - this.field9732.field1878.field9921;
                int var28 = var6 - this.field9732.field1878.field9926;
                int var29 = var28 * var28 + var26 * var26 + var27 * var27;
                long var30 = (long) (var8.field2773 * var29 * arg1);
                this.field9731 = (int) ((long) this.field9731 - ((long) this.field9731 * var30 >> 28));
            }
            if (var8.field2740 != null) {
                class159 var32 = var7.field2041.field1194;
                for (class159 var33 = var32.field2139; var32 != var33; var33 = var33.field2139) {
                    class620 var34 = (class620) var33;
                    class708 var35 = var34.field8391;
                    if (var35.field9688 != 1) {
                        boolean var36 = false;
                        for (int var37 = 0; var37 < var8.field2740.length; ++var37) {
                            if (var8.field2740[var37] == var35.field9683) {
                                var36 = true;
                                break;
                            }
                        }
                        if (var36) {
                            double var38 = (double) (var4 - var34.field8393);
                            double var40 = (double) (var5 - var34.field8398);
                            double var42 = (double) (var6 - var34.field8392);
                            double var44 = var42 * var42 + var38 * var38 + var40 * var40;
                            if (!(var44 > (double) var35.field9673)) {
                                double var46 = Math.sqrt(var44);
                                if (var46 == 0.0D) {
                                    var46 = 1.0D;
                                }
                                double var48 = ((double) var34.field8389 * var42 + (double) var34.field8386 * var38 + (double) var35.field9680 * var40) * 65535.0D / ((double) var35.field9690 * var46);
                                if (!(var48 < (double) var35.field9687)) {
                                    double var50 = 0.0D;
                                    if (var35.field9681 == 1) {
                                        var50 = var46 / 16.0D * (double) var35.field9677;
                                    } else if (var35.field9681 == 2) {
                                        var50 = var46 / 16.0D * (var46 / 16.0D) * (double) var35.field9677;
                                    }
                                    if (var35.field9679 == 0) {
                                        if (var35.field9678 == 0) {
                                            var13 += ((double) var34.field8386 - var50) * (double) arg1;
                                            var15 += ((double) var35.field9680 - var50) * (double) arg1;
                                            var17 += ((double) var34.field8389 - var50) * (double) arg1;
                                            var19 = true;
                                        } else {
                                            super.field1725 = (int) ((double) super.field1725 + ((double) var34.field8386 - var50) * (double) arg1);
                                            super.field1729 = (int) ((double) super.field1729 + ((double) var35.field9680 - var50) * (double) arg1);
                                            super.field1730 = (int) ((double) super.field1730 + ((double) var34.field8389 - var50) * (double) arg1);
                                        }
                                    } else {
                                        double var52 = var38 / var46 * (double) var35.field9690;
                                        double var54 = var40 / var46 * (double) var35.field9690;
                                        double var56 = var42 / var46 * (double) var35.field9690;
                                        if (var35.field9678 == 0) {
                                            var13 += (double) arg1 * var52;
                                            var15 += (double) arg1 * var54;
                                            var17 += (double) arg1 * var56;
                                            var19 = true;
                                        } else {
                                            super.field1725 = (int) ((double) super.field1725 + (double) arg1 * var52);
                                            super.field1729 = (int) ((double) super.field1729 + (double) arg1 * var54);
                                            super.field1730 = (int) ((double) super.field1730 + (double) arg1 * var56);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field2765 != null) {
                for (int var58 = 0; var58 < var8.field2765.length; ++var58) {
                    class620 var59 = (class620) class716.field9758.method2282((byte) 90, (long) var8.field2765[var58]);
                    while (var59 != null) {
                        class708 var60 = var59.field8391;
                        double var61 = (double) (var4 - var59.field8393);
                        double var63 = (double) (var5 - var59.field8398);
                        double var65 = (double) (var6 - var59.field8392);
                        double var67 = var65 * var65 + var61 * var61 + var63 * var63;
                        if (var67 > (double) var60.field9673) {
                            var59 = (class620) class716.field9758.method2280(0);
                        } else {
                            double var69 = Math.sqrt(var67);
                            if (var69 == 0.0D) {
                                var69 = 1.0D;
                            }
                            double var71 = ((double) var59.field8389 * var65 + (double) var59.field8386 * var61 + (double) var60.field9680 * var63) * 65535.0D / ((double) var60.field9690 * var69);
                            if (var71 < (double) var60.field9687) {
                                var59 = (class620) class716.field9758.method2280(0);
                            } else {
                                double var73 = 0.0D;
                                if (var60.field9681 == 1) {
                                    var73 = var69 / 16.0D * (double) var60.field9677;
                                } else if (var60.field9681 == 2) {
                                    var73 = var69 / 16.0D * (var69 / 16.0D) * (double) var60.field9677;
                                }
                                if (var60.field9679 == 0) {
                                    if (var60.field9678 == 0) {
                                        var13 += ((double) var59.field8386 - var73) * (double) arg1;
                                        var15 += ((double) var60.field9680 - var73) * (double) arg1;
                                        var17 += ((double) var59.field8389 - var73) * (double) arg1;
                                        var19 = true;
                                    } else {
                                        super.field1725 = (int) ((double) super.field1725 + ((double) var59.field8386 - var73) * (double) arg1);
                                        super.field1729 = (int) ((double) super.field1729 + ((double) var60.field9680 - var73) * (double) arg1);
                                        super.field1730 = (int) ((double) super.field1730 + ((double) var59.field8389 - var73) * (double) arg1);
                                    }
                                } else {
                                    double var75 = var61 / var69 * (double) var60.field9690;
                                    double var77 = var63 / var69 * (double) var60.field9690;
                                    double var79 = var65 / var69 * (double) var60.field9690;
                                    if (var60.field9678 == 0) {
                                        var13 += (double) arg1 * var75;
                                        var15 += (double) arg1 * var77;
                                        var17 += (double) arg1 * var79;
                                        var19 = true;
                                    } else {
                                        super.field1725 = (int) ((double) super.field1725 + (double) arg1 * var75);
                                        super.field1729 = (int) ((double) super.field1729 + (double) arg1 * var77);
                                        super.field1730 = (int) ((double) super.field1730 + (double) arg1 * var79);
                                    }
                                }
                                var59 = (class620) class716.field9758.method2280(0);
                            }
                        }
                    }
                }
            }
            if (var8.field2775 != null) {
                if (var8.field2725 == null) {
                    var8.field2725 = new int[var8.field2775.length];
                    for (int var81 = 0; var81 < var8.field2775.length; ++var81) {
                        class482.method2834(var8.field2775[var81], false);
                        var8.field2725[var81] = ((class445) class86.field1216.method1248(122, (long) var8.field2775[var81])).field6408;
                    }
                }
                for (int var82 = 0; var82 < var8.field2725.length; ++var82) {
                    class708 var83 = class681.field9109[var8.field2725[var82]];
                    if (var83.field9678 == 0) {
                        var13 += (double) (var83.field9682 * arg1);
                        var15 += (double) (var83.field9680 * arg1);
                        var17 += (double) (var83.field9684 * arg1);
                        var19 = true;
                    } else {
                        super.field1725 += var83.field9682 * arg1;
                        super.field1729 += var83.field9680 * arg1;
                        super.field1730 += var83.field9684 * arg1;
                    }
                }
            }
            if (var19) {
                while (true) {
                    if (!(var13 > 32767.0D) && !(var15 > 32767.0D) && !(var17 > 32767.0D) && !(var13 < -32767.0D) && !(var15 < -32767.0D) && !(var17 < -32767.0D)) {
                        this.field9727 = (short) ((int) var13);
                        this.field9725 = (short) ((int) var15);
                        this.field9729 = (short) ((int) var17);
                        break;
                    }
                    var13 /= 2.0D;
                    var15 /= 2.0D;
                    var17 /= 2.0D;
                    this.field9731 <<= 1;
                }
            }
            super.field1725 = (int) ((long) super.field1725 + ((long) (this.field9731 << 2) * (long) this.field9727 >> 23) * (long) arg1);
            super.field1729 = (int) ((long) super.field1729 + ((long) (this.field9731 << 2) * (long) this.field9725 >> 23) * (long) arg1);
            super.field1730 = (int) ((long) super.field1730 + ((long) (this.field9731 << 2) * (long) this.field9729 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "()V", line = 610)
    public final void method3953() {
        this.field9732.field1874.field2037[this.field9728] = null;
        class341.field4772[class109.field1522] = this;
        class109.field1522 = class109.field1522 + 1 & 1023;
        this.method3310(30305);
        this.method2701(-105);
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lfg;IIIIIIIIIIIZZ)V", line = 616)
    public class713(class139 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field9732 = arg0;
        super.field1725 = arg1 << 12;
        super.field1729 = arg2 << 12;
        super.field1730 = arg3 << 12;
        super.field1727 = arg9;
        this.field9726 = this.field9730 = (short) arg8;
        super.field1726 = arg10;
        super.field1733 = arg11;
        super.field1728 = arg13;
        this.field9727 = (short) arg4;
        this.field9725 = (short) arg5;
        this.field9729 = (short) arg6;
        this.field9731 = arg7;
        super.field1723 = this.field9732.field1870.field4151;
        this.method3950();
    }
}
