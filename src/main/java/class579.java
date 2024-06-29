import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class579 extends class128 {

    @OriginalMember(owner = "client!iu", name = "G", descriptor = "Lij;")
    public class426 field7590;

    @OriginalMember(owner = "client!iu", name = "J", descriptor = "S")
    private short field7593;

    @OriginalMember(owner = "client!iu", name = "L", descriptor = "S")
    private short field7595;

    @OriginalMember(owner = "client!iu", name = "E", descriptor = "S")
    private short field7588;

    @OriginalMember(owner = "client!iu", name = "F", descriptor = "S")
    private short field7589;

    @OriginalMember(owner = "client!iu", name = "I", descriptor = "S")
    private short field7592;

    @OriginalMember(owner = "client!iu", name = "H", descriptor = "I")
    private int field7591;

    @OriginalMember(owner = "client!iu", name = "K", descriptor = "I")
    private int field7594;

    @OriginalMember(owner = "client!iu", name = "D", descriptor = "S")
    private short field7587;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "()V", line = 4)
    public final void method3173() {
        this.field7590.field5868.field223[this.field7587] = null;
        class573.field7529[class155.field2365] = this;
        class155.field2365 = class155.field2365 + 1 & 1023;
        this.method2815(-124);
        this.method1961(-11364);
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lha;J)V", line = 12)
    public final void method3174(class59 arg0, long arg1) {
        int var4 = super.field2110 >> class140.field2224 + 12;
        int var5 = super.field2111 >> class140.field2224 + 12;
        int var6 = super.field2107 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class735.field10163 && var5 >= 0 && var5 < class143.field2290) {
            class17 var7 = this.field7590.field5868;
            class258 var8 = this.field7590.field5867;
            class282[] var9 = class507.field6771;
            int var10 = var7.field230;
            class701 var11 = class660.field8718[var7.field230][var4][var5];
            if (var11 != null) {
                var10 = var11.field9730;
            }
            int var12 = var9[var10].method1742(var4, 89, var5);
            int var13;
            if (var10 < class225.field3201 - 1) {
                var13 = var9[var10 + 1].method1742(var4, 119, var5);
            } else {
                var13 = var12 - (8 << class140.field2224);
            }
            if (var8.field3552) {
                if (var8.field3579 == -1 && var6 > var12) {
                    this.method3173();
                    return;
                }
                if (var8.field3579 >= 0 && var6 > var9[var8.field3579].method1742(var4, 48, var5)) {
                    this.method3173();
                    return;
                }
                if (var8.field3572 == -1 && var6 < var13) {
                    this.method3173();
                    return;
                }
                if (var8.field3572 >= 0 && var6 < var9[var8.field3572 + 1].method1742(var4, 113, var5)) {
                    this.method3173();
                    return;
                }
            }
            int var14;
            for (var14 = class225.field3201 - 1; var14 > 0 && var6 > var9[var14].method1742(var4, 89, var5); --var14) {
            }
            if (var8.field3576 && var14 == 0 && var6 > var9[0].method1742(var4, 75, var5)) {
                this.method3173();
            } else if (class225.field3201 - 1 == var14 && var9[var14].method1742(var4, 120, var5) - var6 > 8 << class140.field2224) {
                this.method3173();
            } else {
                class701 var15 = class660.field8718[var14][var4][var5];
                if (var15 == null) {
                    if (var14 == 0 || class660.field8718[0][var4][var5] == null) {
                        var15 = class660.field8718[0][var4][var5] = new class701(0);
                    }
                    boolean var16 = class660.field8718[0][var4][var5].field9744 != null;
                    if (var14 == 3 && var16) {
                        this.method3173();
                        return;
                    }
                    for (int var17 = 1; var17 <= var14; ++var17) {
                        if (class660.field8718[var17][var4][var5] == null) {
                            var15 = class660.field8718[var17][var4][var5] = new class701(var17);
                            if (var16) {
                                ++var15.field9730;
                            }
                        }
                    }
                }
                if (var8.field3557) {
                    int var18 = super.field2110 >> 12;
                    int var19 = super.field2111 >> 12;
                    if (var15.field9729 != null) {
                        class642 var20 = var15.field9729.method808((byte) -105, arg0);
                        if (var20 != null && var20.method3523(var6, (byte) 127, var19, var18)) {
                            this.method3173();
                            return;
                        }
                    }
                    if (var15.field9739 != null) {
                        class642 var21 = var15.field9739.method808((byte) -101, arg0);
                        if (var21 != null && var21.method3523(var6, (byte) -51, var19, var18)) {
                            this.method3173();
                            return;
                        }
                    }
                    if (var15.field9738 != null) {
                        class642 var22 = var15.field9738.method808((byte) -93, arg0);
                        if (var22 != null && var22.method3523(var6, (byte) 93, var19, var18)) {
                            this.method3173();
                            return;
                        }
                    }
                    for (class10 var23 = var15.field9742; var23 != null; var23 = var23.field174) {
                        class642 var24 = var23.field170.method808((byte) -127, arg0);
                        if (var24 != null && var24.method3523(var6, (byte) 40, var19, var18)) {
                            this.method3173();
                            return;
                        }
                    }
                }
                var7.field228.field5411.method139(98, this);
            }
        } else {
            this.method3173();
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(JI)V", line = 185)
    public final void method3175(long arg0, int arg1) {
        this.field7593 = (short) (this.field7593 - arg1);
        if (this.field7593 <= 0) {
            this.method3173();
        } else {
            int var4 = super.field2110 >> 12;
            int var5 = super.field2107 >> 12;
            int var6 = super.field2111 >> 12;
            class17 var7 = this.field7590.field5868;
            class258 var8 = this.field7590.field5867;
            if (var8.field3526 != 0) {
                if (this.field7595 - this.field7593 <= var8.field3539) {
                    int var9 = var8.field3601 * arg1 + (this.field7594 >> 16 & 255) + (super.field2113 >> 8 & 65280);
                    int var10 = var8.field3555 * arg1 + (this.field7594 >> 8 & 255) + (super.field2113 & 65280);
                    int var11 = var8.field3596 * arg1 + (super.field2113 << 8 & 65280) + (this.field7594 & 255);
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
                    super.field2113 &= -16777216;
                    super.field2113 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field7594 &= -16777216;
                    this.field7594 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field7595 - this.field7593 <= var8.field3585) {
                    int var12 = var8.field3574 * arg1 + (this.field7594 >> 24 & 255) + (super.field2113 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field2113 &= 16777215;
                    super.field2113 |= (var12 & 65280) << 16;
                    this.field7594 &= 16777215;
                    this.field7594 |= (var12 & 255) << 24;
                }
            }
            if (var8.field3590 != -1 && this.field7595 - this.field7593 <= var8.field3548) {
                this.field7591 += var8.field3593 * arg1;
            }
            if (var8.field3571 != -1 && this.field7595 - this.field7593 <= var8.field3554) {
                super.field2112 += var8.field3547 * arg1;
            }
            double var13 = (double) this.field7588;
            double var15 = (double) this.field7589;
            double var17 = (double) this.field7592;
            boolean var19 = false;
            if (var8.field3541 == 1) {
                int var20 = var4 - this.field7590.field5864.field674;
                int var21 = var5 - this.field7590.field5864.field669;
                int var22 = var6 - this.field7590.field5864.field677;
                int var23 = (int) Math.sqrt((double) (var22 * var22 + var20 * var20 + var21 * var21)) >> 2;
                long var24 = (long) (var8.field3553 * var23 * arg1);
                this.field7591 = (int) ((long) this.field7591 - ((long) this.field7591 * var24 >> 18));
            } else if (var8.field3541 == 2) {
                int var26 = var4 - this.field7590.field5864.field674;
                int var27 = var5 - this.field7590.field5864.field669;
                int var28 = var6 - this.field7590.field5864.field677;
                int var29 = var28 * var28 + var26 * var26 + var27 * var27;
                long var30 = (long) (var8.field3553 * var29 * arg1);
                this.field7591 = (int) ((long) this.field7591 - ((long) this.field7591 * var30 >> 28));
            }
            if (var8.field3600 != null) {
                class656 var32 = var7.field226.field24;
                for (class656 var33 = var32.field8677; var32 != var33; var33 = var33.field8677) {
                    class404 var34 = (class404) var33;
                    class259 var35 = var34.field5634;
                    if (var35.field3614 != 1) {
                        boolean var36 = false;
                        for (int var37 = 0; var37 < var8.field3600.length; ++var37) {
                            if (var8.field3600[var37] == var35.field3620) {
                                var36 = true;
                                break;
                            }
                        }
                        if (var36) {
                            double var38 = (double) (var4 - var34.field5638);
                            double var40 = (double) (var5 - var34.field5639);
                            double var42 = (double) (var6 - var34.field5632);
                            double var44 = var42 * var42 + var38 * var38 + var40 * var40;
                            if (!(var44 > (double) var35.field3610)) {
                                double var46 = Math.sqrt(var44);
                                if (var46 == 0.0D) {
                                    var46 = 1.0D;
                                }
                                double var48 = ((double) var34.field5628 * var42 + (double) var34.field5633 * var38 + (double) var35.field3606 * var40) * 65535.0D / ((double) var35.field3608 * var46);
                                if (!(var48 < (double) var35.field3615)) {
                                    double var50 = 0.0D;
                                    if (var35.field3602 == 1) {
                                        var50 = var46 / 16.0D * (double) var35.field3622;
                                    } else if (var35.field3602 == 2) {
                                        var50 = var46 / 16.0D * (var46 / 16.0D) * (double) var35.field3622;
                                    }
                                    if (var35.field3605 == 0) {
                                        if (var35.field3619 == 0) {
                                            var13 += ((double) var34.field5633 - var50) * (double) arg1;
                                            var15 += ((double) var35.field3606 - var50) * (double) arg1;
                                            var17 += ((double) var34.field5628 - var50) * (double) arg1;
                                            var19 = true;
                                        } else {
                                            super.field2110 = (int) ((double) super.field2110 + ((double) var34.field5633 - var50) * (double) arg1);
                                            super.field2107 = (int) ((double) super.field2107 + ((double) var35.field3606 - var50) * (double) arg1);
                                            super.field2111 = (int) ((double) super.field2111 + ((double) var34.field5628 - var50) * (double) arg1);
                                        }
                                    } else {
                                        double var52 = var38 / var46 * (double) var35.field3608;
                                        double var54 = var40 / var46 * (double) var35.field3608;
                                        double var56 = var42 / var46 * (double) var35.field3608;
                                        if (var35.field3619 == 0) {
                                            var13 += (double) arg1 * var52;
                                            var15 += (double) arg1 * var54;
                                            var17 += (double) arg1 * var56;
                                            var19 = true;
                                        } else {
                                            super.field2110 = (int) ((double) super.field2110 + (double) arg1 * var52);
                                            super.field2107 = (int) ((double) super.field2107 + (double) arg1 * var54);
                                            super.field2111 = (int) ((double) super.field2111 + (double) arg1 * var56);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field3569 != null) {
                for (int var58 = 0; var58 < var8.field3569.length; ++var58) {
                    class404 var59 = (class404) class705.field9779.method2551((long) var8.field3569[var58], 23574);
                    while (var59 != null) {
                        class259 var60 = var59.field5634;
                        double var61 = (double) (var4 - var59.field5638);
                        double var63 = (double) (var5 - var59.field5639);
                        double var65 = (double) (var6 - var59.field5632);
                        double var67 = var65 * var65 + var61 * var61 + var63 * var63;
                        if (var67 > (double) var60.field3610) {
                            var59 = (class404) class705.field9779.method2548(6594);
                        } else {
                            double var69 = Math.sqrt(var67);
                            if (var69 == 0.0D) {
                                var69 = 1.0D;
                            }
                            double var71 = ((double) var59.field5628 * var65 + (double) var59.field5633 * var61 + (double) var60.field3606 * var63) * 65535.0D / ((double) var60.field3608 * var69);
                            if (var71 < (double) var60.field3615) {
                                var59 = (class404) class705.field9779.method2548(6594);
                            } else {
                                double var73 = 0.0D;
                                if (var60.field3602 == 1) {
                                    var73 = var69 / 16.0D * (double) var60.field3622;
                                } else if (var60.field3602 == 2) {
                                    var73 = var69 / 16.0D * (var69 / 16.0D) * (double) var60.field3622;
                                }
                                if (var60.field3605 == 0) {
                                    if (var60.field3619 == 0) {
                                        var13 += ((double) var59.field5633 - var73) * (double) arg1;
                                        var15 += ((double) var60.field3606 - var73) * (double) arg1;
                                        var17 += ((double) var59.field5628 - var73) * (double) arg1;
                                        var19 = true;
                                    } else {
                                        super.field2110 = (int) ((double) super.field2110 + ((double) var59.field5633 - var73) * (double) arg1);
                                        super.field2107 = (int) ((double) super.field2107 + ((double) var60.field3606 - var73) * (double) arg1);
                                        super.field2111 = (int) ((double) super.field2111 + ((double) var59.field5628 - var73) * (double) arg1);
                                    }
                                } else {
                                    double var75 = var61 / var69 * (double) var60.field3608;
                                    double var77 = var63 / var69 * (double) var60.field3608;
                                    double var79 = var65 / var69 * (double) var60.field3608;
                                    if (var60.field3619 == 0) {
                                        var13 += (double) arg1 * var75;
                                        var15 += (double) arg1 * var77;
                                        var17 += (double) arg1 * var79;
                                        var19 = true;
                                    } else {
                                        super.field2110 = (int) ((double) super.field2110 + (double) arg1 * var75);
                                        super.field2107 = (int) ((double) super.field2107 + (double) arg1 * var77);
                                        super.field2111 = (int) ((double) super.field2111 + (double) arg1 * var79);
                                    }
                                }
                                var59 = (class404) class705.field9779.method2548(6594);
                            }
                        }
                    }
                }
            }
            if (var8.field3577 != null) {
                if (var8.field3529 == null) {
                    var8.field3529 = new int[var8.field3577.length];
                    for (int var81 = 0; var81 < var8.field3577.length; ++var81) {
                        class278.method1670(115, var8.field3577[var81]);
                        var8.field3529[var81] = ((class651) class91.field1100.method2135((long) var8.field3577[var81], (byte) 31)).field8636;
                    }
                }
                for (int var82 = 0; var82 < var8.field3529.length; ++var82) {
                    class259 var83 = class225.field3207[var8.field3529[var82]];
                    if (var83.field3619 == 0) {
                        var13 += (double) (var83.field3613 * arg1);
                        var15 += (double) (var83.field3606 * arg1);
                        var17 += (double) (var83.field3617 * arg1);
                        var19 = true;
                    } else {
                        super.field2110 += var83.field3613 * arg1;
                        super.field2107 += var83.field3606 * arg1;
                        super.field2111 += var83.field3617 * arg1;
                    }
                }
            }
            if (var19) {
                while (true) {
                    if (!(var13 > 32767.0D) && !(var15 > 32767.0D) && !(var17 > 32767.0D) && !(var13 < -32767.0D) && !(var15 < -32767.0D) && !(var17 < -32767.0D)) {
                        this.field7588 = (short) ((int) var13);
                        this.field7589 = (short) ((int) var15);
                        this.field7592 = (short) ((int) var17);
                        break;
                    }
                    var13 /= 2.0D;
                    var15 /= 2.0D;
                    var17 /= 2.0D;
                    this.field7591 <<= 1;
                }
            }
            super.field2110 = (int) ((long) super.field2110 + ((long) (this.field7591 << 2) * (long) this.field7588 >> 23) * (long) arg1);
            super.field2107 = (int) ((long) super.field2107 + ((long) (this.field7591 << 2) * (long) this.field7589 >> 23) * (long) arg1);
            super.field2111 = (int) ((long) super.field2111 + ((long) (this.field7591 << 2) * (long) this.field7592 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lij;IIIIIIIIIIIZZ)V", line = 582)
    public final void method3176(class426 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field7590 = arg0;
        super.field2110 = arg1 << 12;
        super.field2107 = arg2 << 12;
        super.field2111 = arg3 << 12;
        super.field2113 = arg9;
        this.field7595 = this.field7593 = (short) arg8;
        super.field2112 = arg10;
        super.field2115 = arg11;
        super.field2114 = arg13;
        this.field7588 = (short) arg4;
        this.field7589 = (short) arg5;
        this.field7592 = (short) arg6;
        this.field7591 = arg7;
        super.field2104 = this.field7590.field5862.field10134;
        this.method3177();
    }

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "()V", line = 603)
    private final void method3177() {
        int var1 = this.field7590.field5868.field217;
        if (this.field7590.field5868.field223[var1] != null) {
            this.field7590.field5868.field223[var1].method3173();
        }
        this.field7590.field5868.field223[var1] = this;
        this.field7587 = (short) this.field7590.field5868.field217;
        this.field7590.field5868.field217 = var1 + 1 & 8191;
        this.field7590.field5861.method3870(this, 0);
    }

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Lij;IIIIIIIIIIIZZ)V", line = 616)
    public class579(class426 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field7590 = arg0;
        super.field2110 = arg1 << 12;
        super.field2107 = arg2 << 12;
        super.field2111 = arg3 << 12;
        super.field2113 = arg9;
        this.field7595 = this.field7593 = (short) arg8;
        super.field2112 = arg10;
        super.field2115 = arg11;
        super.field2114 = arg13;
        this.field7588 = (short) arg4;
        this.field7589 = (short) arg5;
        this.field7592 = (short) arg6;
        this.field7591 = arg7;
        super.field2104 = this.field7590.field5862.field10134;
        this.method3177();
    }
}
