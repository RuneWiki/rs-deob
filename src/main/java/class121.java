import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class121 extends class324 {

    @OriginalMember(owner = "client!jr", name = "I", descriptor = "Loea;")
    public class621 field1579;

    @OriginalMember(owner = "client!jr", name = "L", descriptor = "S")
    private short field1582;

    @OriginalMember(owner = "client!jr", name = "H", descriptor = "S")
    private short field1578;

    @OriginalMember(owner = "client!jr", name = "K", descriptor = "S")
    private short field1581;

    @OriginalMember(owner = "client!jr", name = "J", descriptor = "S")
    private short field1580;

    @OriginalMember(owner = "client!jr", name = "M", descriptor = "S")
    private short field1583;

    @OriginalMember(owner = "client!jr", name = "P", descriptor = "I")
    private int field1586;

    @OriginalMember(owner = "client!jr", name = "O", descriptor = "I")
    private int field1585;

    @OriginalMember(owner = "client!jr", name = "N", descriptor = "S")
    private short field1584;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Loea;IIIIIIIIIIIZZ)V", line = 3)
    public final void method899(class621 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field1579 = arg0;
        super.field4854 = arg1 << 12;
        super.field4857 = arg2 << 12;
        super.field4855 = arg3 << 12;
        super.field4861 = arg9;
        this.field1578 = this.field1582 = (short) arg8;
        super.field4860 = arg10;
        super.field4853 = arg11;
        super.field4856 = arg13;
        this.field1581 = (short) arg4;
        this.field1580 = (short) arg5;
        this.field1583 = (short) arg6;
        this.field1586 = arg7;
        super.field4864 = this.field1579.field8748.field5007;
        this.method900();
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "()V", line = 26)
    private final void method900() {
        int var1 = this.field1579.field8754.field349;
        if (this.field1579.field8754.field351[var1] != null) {
            this.field1579.field8754.field351[var1].method902();
        }
        this.field1579.field8754.field351[var1] = this;
        this.field1584 = (short) this.field1579.field8754.field349;
        this.field1579.field8754.field349 = var1 + 1 & 8191;
        this.field1579.field8750.method2026((byte) 51, this);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(JI)V", line = 38)
    public final void method901(long arg0, int arg1) {
        this.field1582 = (short) (this.field1582 - arg1);
        if (this.field1582 <= 0) {
            this.method902();
        } else {
            int var4 = super.field4854 >> 12;
            int var5 = super.field4857 >> 12;
            int var6 = super.field4855 >> 12;
            class24 var7 = this.field1579.field8754;
            class550 var8 = this.field1579.field8759;
            if (var8.field7803 != 0) {
                if (this.field1578 - this.field1582 <= var8.field7782) {
                    int var9 = var8.field7813 * arg1 + (super.field4861 >> 8 & 65280) + (this.field1585 >> 16 & 255);
                    int var10 = var8.field7791 * arg1 + (this.field1585 >> 8 & 255) + (super.field4861 & 65280);
                    int var11 = var8.field7774 * arg1 + (super.field4861 << 8 & 65280) + (this.field1585 & 255);
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
                    super.field4861 &= -16777216;
                    super.field4861 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field1585 &= -16777216;
                    this.field1585 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field1578 - this.field1582 <= var8.field7761) {
                    int var12 = var8.field7789 * arg1 + (super.field4861 >> 16 & 65280) + (this.field1585 >> 24 & 255);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field4861 &= 16777215;
                    super.field4861 |= (var12 & 65280) << 16;
                    this.field1585 &= 16777215;
                    this.field1585 |= (var12 & 255) << 24;
                }
            }
            if (var8.field7794 != -1 && this.field1578 - this.field1582 <= var8.field7768) {
                this.field1586 += var8.field7785 * arg1;
            }
            if (var8.field7812 != -1 && this.field1578 - this.field1582 <= var8.field7821) {
                super.field4860 += var8.field7756 * arg1;
            }
            double var13 = (double) this.field1581;
            double var15 = (double) this.field1580;
            double var17 = (double) this.field1583;
            boolean var19 = false;
            if (var8.field7787 == 1) {
                int var20 = var4 - this.field1579.field8753.field5680;
                int var21 = var5 - this.field1579.field8753.field5684;
                int var22 = var6 - this.field1579.field8753.field5683;
                int var23 = (int) Math.sqrt((double) (var22 * var22 + var20 * var20 + var21 * var21)) >> 2;
                long var24 = (long) (var8.field7799 * var23 * arg1);
                this.field1586 = (int) ((long) this.field1586 - ((long) this.field1586 * var24 >> 18));
            } else if (var8.field7787 == 2) {
                int var26 = var4 - this.field1579.field8753.field5680;
                int var27 = var5 - this.field1579.field8753.field5684;
                int var28 = var6 - this.field1579.field8753.field5683;
                int var29 = var28 * var28 + var26 * var26 + var27 * var27;
                long var30 = (long) (var8.field7799 * var29 * arg1);
                this.field1586 = (int) ((long) this.field1586 - ((long) this.field1586 * var30 >> 28));
            }
            if (var8.field7804 != null) {
                class540 var32 = var7.field357.field5911;
                for (class540 var33 = var32.field7578; var32 != var33; var33 = var33.field7578) {
                    class462 var34 = (class462) var33;
                    class771 var35 = var34.field6598;
                    if (var35.field10630 != 1) {
                        boolean var36 = false;
                        for (int var37 = 0; var37 < var8.field7804.length; ++var37) {
                            if (var8.field7804[var37] == var35.field10628) {
                                var36 = true;
                                break;
                            }
                        }
                        if (var36) {
                            double var38 = (double) (var4 - var34.field6600);
                            double var40 = (double) (var5 - var34.field6597);
                            double var42 = (double) (var6 - var34.field6602);
                            double var44 = var42 * var42 + var38 * var38 + var40 * var40;
                            if (!(var44 > (double) var35.field10641)) {
                                double var46 = Math.sqrt(var44);
                                if (var46 == 0.0D) {
                                    var46 = 1.0D;
                                }
                                double var48 = ((double) var34.field6601 * var42 + (double) var34.field6594 * var38 + (double) var35.field10625 * var40) * 65535.0D / ((double) var35.field10627 * var46);
                                if (!(var48 < (double) var35.field10632)) {
                                    double var50 = 0.0D;
                                    if (var35.field10633 == 1) {
                                        var50 = var46 / 16.0D * (double) var35.field10637;
                                    } else if (var35.field10633 == 2) {
                                        var50 = var46 / 16.0D * (var46 / 16.0D) * (double) var35.field10637;
                                    }
                                    if (var35.field10639 == 0) {
                                        if (var35.field10635 == 0) {
                                            var13 += ((double) var34.field6594 - var50) * (double) arg1;
                                            var15 += ((double) var35.field10625 - var50) * (double) arg1;
                                            var17 += ((double) var34.field6601 - var50) * (double) arg1;
                                            var19 = true;
                                        } else {
                                            super.field4854 = (int) ((double) super.field4854 + ((double) var34.field6594 - var50) * (double) arg1);
                                            super.field4857 = (int) ((double) super.field4857 + ((double) var35.field10625 - var50) * (double) arg1);
                                            super.field4855 = (int) ((double) super.field4855 + ((double) var34.field6601 - var50) * (double) arg1);
                                        }
                                    } else {
                                        double var52 = var38 / var46 * (double) var35.field10627;
                                        double var54 = var40 / var46 * (double) var35.field10627;
                                        double var56 = var42 / var46 * (double) var35.field10627;
                                        if (var35.field10635 == 0) {
                                            var13 += (double) arg1 * var52;
                                            var15 += (double) arg1 * var54;
                                            var17 += (double) arg1 * var56;
                                            var19 = true;
                                        } else {
                                            super.field4854 = (int) ((double) super.field4854 + (double) arg1 * var52);
                                            super.field4857 = (int) ((double) super.field4857 + (double) arg1 * var54);
                                            super.field4855 = (int) ((double) super.field4855 + (double) arg1 * var56);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field7762 != null) {
                for (int var58 = 0; var58 < var8.field7762.length; ++var58) {
                    class462 var59 = (class462) class614.field8678.method3316((long) var8.field7762[var58], 7958);
                    while (var59 != null) {
                        class771 var60 = var59.field6598;
                        double var61 = (double) (var4 - var59.field6600);
                        double var63 = (double) (var5 - var59.field6597);
                        double var65 = (double) (var6 - var59.field6602);
                        double var67 = var65 * var65 + var61 * var61 + var63 * var63;
                        if (var67 > (double) var60.field10641) {
                            var59 = (class462) class614.field8678.method3319(-1);
                        } else {
                            double var69 = Math.sqrt(var67);
                            if (var69 == 0.0D) {
                                var69 = 1.0D;
                            }
                            double var71 = ((double) var59.field6601 * var65 + (double) var59.field6594 * var61 + (double) var60.field10625 * var63) * 65535.0D / ((double) var60.field10627 * var69);
                            if (var71 < (double) var60.field10632) {
                                var59 = (class462) class614.field8678.method3319(-1);
                            } else {
                                double var73 = 0.0D;
                                if (var60.field10633 == 1) {
                                    var73 = var69 / 16.0D * (double) var60.field10637;
                                } else if (var60.field10633 == 2) {
                                    var73 = var69 / 16.0D * (var69 / 16.0D) * (double) var60.field10637;
                                }
                                if (var60.field10639 == 0) {
                                    if (var60.field10635 == 0) {
                                        var13 += ((double) var59.field6594 - var73) * (double) arg1;
                                        var15 += ((double) var60.field10625 - var73) * (double) arg1;
                                        var17 += ((double) var59.field6601 - var73) * (double) arg1;
                                        var19 = true;
                                    } else {
                                        super.field4854 = (int) ((double) super.field4854 + ((double) var59.field6594 - var73) * (double) arg1);
                                        super.field4857 = (int) ((double) super.field4857 + ((double) var60.field10625 - var73) * (double) arg1);
                                        super.field4855 = (int) ((double) super.field4855 + ((double) var59.field6601 - var73) * (double) arg1);
                                    }
                                } else {
                                    double var75 = var61 / var69 * (double) var60.field10627;
                                    double var77 = var63 / var69 * (double) var60.field10627;
                                    double var79 = var65 / var69 * (double) var60.field10627;
                                    if (var60.field10635 == 0) {
                                        var13 += (double) arg1 * var75;
                                        var15 += (double) arg1 * var77;
                                        var17 += (double) arg1 * var79;
                                        var19 = true;
                                    } else {
                                        super.field4854 = (int) ((double) super.field4854 + (double) arg1 * var75);
                                        super.field4857 = (int) ((double) super.field4857 + (double) arg1 * var77);
                                        super.field4855 = (int) ((double) super.field4855 + (double) arg1 * var79);
                                    }
                                }
                                var59 = (class462) class614.field8678.method3319(-1);
                            }
                        }
                    }
                }
            }
            if (var8.field7798 != null) {
                if (var8.field7750 == null) {
                    var8.field7750 = new int[var8.field7798.length];
                    for (int var81 = 0; var81 < var8.field7798.length; ++var81) {
                        class202.method1453(-128, var8.field7798[var81]);
                        var8.field7750[var81] = ((class633) class200.field2940.method380((byte) -3, (long) var8.field7798[var81])).field8932;
                    }
                }
                for (int var82 = 0; var82 < var8.field7750.length; ++var82) {
                    class771 var83 = class286.field4385[var8.field7750[var82]];
                    if (var83.field10635 == 0) {
                        var13 += (double) (var83.field10629 * arg1);
                        var15 += (double) (var83.field10625 * arg1);
                        var17 += (double) (var83.field10640 * arg1);
                        var19 = true;
                    } else {
                        super.field4854 += var83.field10629 * arg1;
                        super.field4857 += var83.field10625 * arg1;
                        super.field4855 += var83.field10640 * arg1;
                    }
                }
            }
            if (var19) {
                while (true) {
                    if (!(var13 > 32767.0D) && !(var15 > 32767.0D) && !(var17 > 32767.0D) && !(var13 < -32767.0D) && !(var15 < -32767.0D) && !(var17 < -32767.0D)) {
                        this.field1581 = (short) ((int) var13);
                        this.field1580 = (short) ((int) var15);
                        this.field1583 = (short) ((int) var17);
                        break;
                    }
                    var13 /= 2.0D;
                    var15 /= 2.0D;
                    var17 /= 2.0D;
                    this.field1586 <<= 1;
                }
            }
            super.field4854 = (int) ((long) super.field4854 + ((long) (this.field1586 << 2) * (long) this.field1581 >> 23) * (long) arg1);
            super.field4857 = (int) ((long) super.field4857 + ((long) (this.field1586 << 2) * (long) this.field1580 >> 23) * (long) arg1);
            super.field4855 = (int) ((long) super.field4855 + ((long) (this.field1586 << 2) * (long) this.field1583 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "()V", line = 433)
    public final void method902() {
        this.field1579.field8754.field351[this.field1584] = null;
        class653.field9220[class48.field688] = this;
        class48.field688 = class48.field688 + 1 & 1023;
        this.method592(2);
        this.method1495((byte) -92);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lha;J)V", line = 442)
    public final void method903(class66 arg0, long arg1) {
        int var4 = super.field4854 >> class310.field4616 + 12;
        int var5 = super.field4855 >> class310.field4616 + 12;
        int var6 = super.field4857 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class151.field2074 && var5 >= 0 && var5 < class12.field249) {
            class24 var7 = this.field1579.field8754;
            class550 var8 = this.field1579.field8759;
            class292[] var9 = class622.field8777;
            int var10 = var7.field359;
            class379 var11 = class378.field5427[var7.field359][var4][var5];
            if (var11 != null) {
                var10 = var11.field5440;
            }
            int var12 = var9[var10].method1976(var4, -1, var5);
            int var13;
            if (var10 < class456.field6545 - 1) {
                var13 = var9[var10 + 1].method1976(var4, -1, var5);
            } else {
                var13 = var12 - (8 << class310.field4616);
            }
            if (var8.field7819) {
                if (var8.field7797 == -1 && var6 > var12) {
                    this.method902();
                    return;
                }
                if (var8.field7797 >= 0 && var6 > var9[var8.field7797].method1976(var4, -1, var5)) {
                    this.method902();
                    return;
                }
                if (var8.field7749 == -1 && var6 < var13) {
                    this.method902();
                    return;
                }
                if (var8.field7749 >= 0 && var6 < var9[var8.field7749 + 1].method1976(var4, -1, var5)) {
                    this.method902();
                    return;
                }
            }
            int var14;
            for (var14 = class456.field6545 - 1; var14 > 0 && var6 > var9[var14].method1976(var4, -1, var5); --var14) {
            }
            if (var8.field7784 && var14 == 0 && var6 > var9[0].method1976(var4, -1, var5)) {
                this.method902();
            } else if (class456.field6545 - 1 == var14 && var9[var14].method1976(var4, -1, var5) - var6 > 8 << class310.field4616) {
                this.method902();
            } else {
                class379 var15 = class378.field5427[var14][var4][var5];
                if (var15 == null) {
                    if (var14 == 0 || class378.field5427[0][var4][var5] == null) {
                        var15 = class378.field5427[0][var4][var5] = new class379(0);
                    }
                    boolean var16 = class378.field5427[0][var4][var5].field5431 != null;
                    if (var14 == 3 && var16) {
                        this.method902();
                        return;
                    }
                    for (int var17 = 1; var17 <= var14; ++var17) {
                        if (class378.field5427[var17][var4][var5] == null) {
                            var15 = class378.field5427[var17][var4][var5] = new class379(var17);
                            if (var16) {
                                ++var15.field5440;
                            }
                        }
                    }
                }
                if (var8.field7776) {
                    int var18 = super.field4854 >> 12;
                    int var19 = super.field4855 >> 12;
                    if (var15.field5439 != null) {
                        class733 var20 = var15.field5439.method255(arg0, (byte) 31);
                        if (var20 != null && var20.method4103(var18, var19, (byte) -85, var6)) {
                            this.method902();
                            return;
                        }
                    }
                    if (var15.field5430 != null) {
                        class733 var21 = var15.field5430.method255(arg0, (byte) 86);
                        if (var21 != null && var21.method4103(var18, var19, (byte) -93, var6)) {
                            this.method902();
                            return;
                        }
                    }
                    if (var15.field5446 != null) {
                        class733 var22 = var15.field5446.method255(arg0, (byte) 48);
                        if (var22 != null && var22.method4103(var18, var19, (byte) -91, var6)) {
                            this.method902();
                            return;
                        }
                    }
                    for (class393 var23 = var15.field5437; var23 != null; var23 = var23.field5574) {
                        class733 var24 = var23.field5578.method255(arg0, (byte) -115);
                        if (var24 != null && var24.method4103(var18, var19, (byte) -52, var6)) {
                            this.method902();
                            return;
                        }
                    }
                }
                var7.field362.field6311.method1002(-2, this);
            }
        } else {
            this.method902();
        }
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Loea;IIIIIIIIIIIZZ)V", line = 616)
    public class121(class621 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field1579 = arg0;
        super.field4854 = arg1 << 12;
        super.field4857 = arg2 << 12;
        super.field4855 = arg3 << 12;
        super.field4861 = arg9;
        this.field1578 = this.field1582 = (short) arg8;
        super.field4860 = arg10;
        super.field4853 = arg11;
        super.field4856 = arg13;
        this.field1581 = (short) arg4;
        this.field1580 = (short) arg5;
        this.field1583 = (short) arg6;
        this.field1586 = arg7;
        super.field4864 = this.field1579.field8748.field5007;
        this.method900();
    }
}
