import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class502 extends class421 {

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "Lig;")
    public class677 field6990;

    @OriginalMember(owner = "client!nd", name = "K", descriptor = "S")
    private short field6997;

    @OriginalMember(owner = "client!nd", name = "F", descriptor = "S")
    private short field6993;

    @OriginalMember(owner = "client!nd", name = "D", descriptor = "S")
    private short field6991;

    @OriginalMember(owner = "client!nd", name = "I", descriptor = "S")
    private short field6996;

    @OriginalMember(owner = "client!nd", name = "E", descriptor = "S")
    private short field6992;

    @OriginalMember(owner = "client!nd", name = "G", descriptor = "I")
    private int field6994;

    @OriginalMember(owner = "client!nd", name = "H", descriptor = "I")
    private int field6995;

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "S")
    private short field6989;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lig;IIIIIIIIIIIZZ)V")
    public final void method3023(class677 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field6990 = arg0;
        super.field5919 = arg1 << 12;
        super.field5926 = arg2 << 12;
        super.field5922 = arg3 << 12;
        super.field5921 = arg9;
        this.field6993 = this.field6997 = (short) arg8;
        super.field5920 = arg10;
        super.field5924 = arg11;
        super.field5925 = arg13;
        this.field6991 = (short) arg4;
        this.field6996 = (short) arg5;
        this.field6992 = (short) arg6;
        this.field6994 = arg7;
        super.field5923 = this.field6990.field9394.field539;
        this.method3026();
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(JI)V")
    public final void method3024(long arg0, int arg1) {
        this.field6997 = (short) (this.field6997 - arg1);
        if (this.field6997 <= 0) {
            this.method3027();
        } else {
            int var4 = super.field5919 >> 12;
            int var5 = super.field5926 >> 12;
            int var6 = super.field5922 >> 12;
            class689 var7 = this.field6990.field9391;
            class623 var8 = this.field6990.field9381;
            if (var8.field8367 != 0) {
                if (this.field6993 - this.field6997 <= var8.field8381) {
                    int var9 = var8.field8374 * arg1 + (this.field6995 >> 16 & 255) + (super.field5921 >> 8 & 65280);
                    int var10 = var8.field8384 * arg1 + (this.field6995 >> 8 & 255) + (super.field5921 & 65280);
                    int var11 = var8.field8355 * arg1 + (super.field5921 << 8 & 65280) + (this.field6995 & 255);
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
                    super.field5921 &= -16777216;
                    super.field5921 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field6995 &= -16777216;
                    this.field6995 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field6993 - this.field6997 <= var8.field8369) {
                    int var12 = var8.field8398 * arg1 + (this.field6995 >> 24 & 255) + (super.field5921 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field5921 &= 16777215;
                    super.field5921 |= (var12 & 65280) << 16;
                    this.field6995 &= 16777215;
                    this.field6995 |= (var12 & 255) << 24;
                }
            }
            if (var8.field8392 != -1 && this.field6993 - this.field6997 <= var8.field8393) {
                this.field6994 += var8.field8396 * arg1;
            }
            if (var8.field8364 != -1 && this.field6993 - this.field6997 <= var8.field8353) {
                super.field5920 += var8.field8395 * arg1;
            }
            double var13 = (double) this.field6991;
            double var15 = (double) this.field6996;
            double var17 = (double) this.field6992;
            boolean var19 = false;
            if (var8.field8399 == 1) {
                int var20 = var4 - this.field6990.field9389.field1965;
                int var21 = var5 - this.field6990.field9389.field1972;
                int var22 = var6 - this.field6990.field9389.field1964;
                int var23 = (int) Math.sqrt((double) (var22 * var22 + var20 * var20 + var21 * var21)) >> 2;
                long var24 = (long) (var8.field8334 * var23 * arg1);
                this.field6994 = (int) ((long) this.field6994 - ((long) this.field6994 * var24 >> 18));
            } else if (var8.field8399 == 2) {
                int var26 = var4 - this.field6990.field9389.field1965;
                int var27 = var5 - this.field6990.field9389.field1972;
                int var28 = var6 - this.field6990.field9389.field1964;
                int var29 = var28 * var28 + var26 * var26 + var27 * var27;
                long var30 = (long) (var8.field8334 * var29 * arg1);
                this.field6994 = (int) ((long) this.field6994 - ((long) this.field6994 * var30 >> 28));
            }
            if (var8.field8346 != null) {
                class71 var32 = var7.field9590.field8670;
                for (class71 var33 = var32.field1077; var32 != var33; var33 = var33.field1077) {
                    class14 var34 = (class14) var33;
                    class209 var35 = var34.field130;
                    if (var35.field2729 != 1) {
                        boolean var36 = false;
                        for (int var37 = 0; var37 < var8.field8346.length; ++var37) {
                            if (var8.field8346[var37] == var35.field2715) {
                                var36 = true;
                                break;
                            }
                        }
                        if (var36) {
                            double var38 = (double) (var4 - var34.field134);
                            double var40 = (double) (var5 - var34.field129);
                            double var42 = (double) (var6 - var34.field135);
                            double var44 = var42 * var42 + var38 * var38 + var40 * var40;
                            if (!(var44 > (double) var35.field2730)) {
                                double var46 = Math.sqrt(var44);
                                if (var46 == 0.0D) {
                                    var46 = 1.0D;
                                }
                                double var48 = ((double) var34.field132 * var42 + (double) var34.field131 * var38 + (double) var35.field2726 * var40) * 65535.0D / ((double) var35.field2714 * var46);
                                if (!(var48 < (double) var35.field2733)) {
                                    double var50 = 0.0D;
                                    if (var35.field2719 == 1) {
                                        var50 = var46 / 16.0D * (double) var35.field2718;
                                    } else if (var35.field2719 == 2) {
                                        var50 = var46 / 16.0D * (var46 / 16.0D) * (double) var35.field2718;
                                    }
                                    if (var35.field2731 == 0) {
                                        if (var35.field2725 == 0) {
                                            var13 += ((double) var34.field131 - var50) * (double) arg1;
                                            var15 += ((double) var35.field2726 - var50) * (double) arg1;
                                            var17 += ((double) var34.field132 - var50) * (double) arg1;
                                            var19 = true;
                                        } else {
                                            super.field5919 = (int) ((double) super.field5919 + ((double) var34.field131 - var50) * (double) arg1);
                                            super.field5926 = (int) ((double) super.field5926 + ((double) var35.field2726 - var50) * (double) arg1);
                                            super.field5922 = (int) ((double) super.field5922 + ((double) var34.field132 - var50) * (double) arg1);
                                        }
                                    } else {
                                        double var52 = var38 / var46 * (double) var35.field2714;
                                        double var54 = var40 / var46 * (double) var35.field2714;
                                        double var56 = var42 / var46 * (double) var35.field2714;
                                        if (var35.field2725 == 0) {
                                            var13 += (double) arg1 * var52;
                                            var15 += (double) arg1 * var54;
                                            var17 += (double) arg1 * var56;
                                            var19 = true;
                                        } else {
                                            super.field5919 = (int) ((double) super.field5919 + (double) arg1 * var52);
                                            super.field5926 = (int) ((double) super.field5926 + (double) arg1 * var54);
                                            super.field5922 = (int) ((double) super.field5922 + (double) arg1 * var56);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field8388 != null) {
                for (int var58 = 0; var58 < var8.field8388.length; ++var58) {
                    class14 var59 = (class14) class524.field7279.method533((long) var8.field8388[var58], true);
                    while (var59 != null) {
                        class209 var60 = var59.field130;
                        double var61 = (double) (var4 - var59.field134);
                        double var63 = (double) (var5 - var59.field129);
                        double var65 = (double) (var6 - var59.field135);
                        double var67 = var65 * var65 + var61 * var61 + var63 * var63;
                        if (var67 > (double) var60.field2730) {
                            var59 = (class14) class524.field7279.method534((byte) -123);
                        } else {
                            double var69 = Math.sqrt(var67);
                            if (var69 == 0.0D) {
                                var69 = 1.0D;
                            }
                            double var71 = ((double) var59.field132 * var65 + (double) var59.field131 * var61 + (double) var60.field2726 * var63) * 65535.0D / ((double) var60.field2714 * var69);
                            if (var71 < (double) var60.field2733) {
                                var59 = (class14) class524.field7279.method534((byte) -123);
                            } else {
                                double var73 = 0.0D;
                                if (var60.field2719 == 1) {
                                    var73 = var69 / 16.0D * (double) var60.field2718;
                                } else if (var60.field2719 == 2) {
                                    var73 = var69 / 16.0D * (var69 / 16.0D) * (double) var60.field2718;
                                }
                                if (var60.field2731 == 0) {
                                    if (var60.field2725 == 0) {
                                        var13 += ((double) var59.field131 - var73) * (double) arg1;
                                        var15 += ((double) var60.field2726 - var73) * (double) arg1;
                                        var17 += ((double) var59.field132 - var73) * (double) arg1;
                                        var19 = true;
                                    } else {
                                        super.field5919 = (int) ((double) super.field5919 + ((double) var59.field131 - var73) * (double) arg1);
                                        super.field5926 = (int) ((double) super.field5926 + ((double) var60.field2726 - var73) * (double) arg1);
                                        super.field5922 = (int) ((double) super.field5922 + ((double) var59.field132 - var73) * (double) arg1);
                                    }
                                } else {
                                    double var75 = var61 / var69 * (double) var60.field2714;
                                    double var77 = var63 / var69 * (double) var60.field2714;
                                    double var79 = var65 / var69 * (double) var60.field2714;
                                    if (var60.field2725 == 0) {
                                        var13 += (double) arg1 * var75;
                                        var15 += (double) arg1 * var77;
                                        var17 += (double) arg1 * var79;
                                        var19 = true;
                                    } else {
                                        super.field5919 = (int) ((double) super.field5919 + (double) arg1 * var75);
                                        super.field5926 = (int) ((double) super.field5926 + (double) arg1 * var77);
                                        super.field5922 = (int) ((double) super.field5922 + (double) arg1 * var79);
                                    }
                                }
                                var59 = (class14) class524.field7279.method534((byte) -123);
                            }
                        }
                    }
                }
            }
            if (var8.field8352 != null) {
                if (var8.field8373 == null) {
                    var8.field8373 = new int[var8.field8352.length];
                    for (int var81 = 0; var81 < var8.field8352.length; ++var81) {
                        class266.method1814((byte) 119, var8.field8352[var81]);
                        var8.field8373[var81] = ((class27) class526.field7306.method812(119, (long) var8.field8352[var81])).field347;
                    }
                }
                for (int var82 = 0; var82 < var8.field8373.length; ++var82) {
                    class209 var83 = class70.field1066[var8.field8373[var82]];
                    if (var83.field2725 == 0) {
                        var13 += (double) (var83.field2723 * arg1);
                        var15 += (double) (var83.field2726 * arg1);
                        var17 += (double) (var83.field2717 * arg1);
                        var19 = true;
                    } else {
                        super.field5919 += var83.field2723 * arg1;
                        super.field5926 += var83.field2726 * arg1;
                        super.field5922 += var83.field2717 * arg1;
                    }
                }
            }
            if (var19) {
                while (true) {
                    if (!(var13 > 32767.0D) && !(var15 > 32767.0D) && !(var17 > 32767.0D) && !(var13 < -32767.0D) && !(var15 < -32767.0D) && !(var17 < -32767.0D)) {
                        this.field6991 = (short) ((int) var13);
                        this.field6996 = (short) ((int) var15);
                        this.field6992 = (short) ((int) var17);
                        break;
                    }
                    var13 /= 2.0D;
                    var15 /= 2.0D;
                    var17 /= 2.0D;
                    this.field6994 <<= 1;
                }
            }
            super.field5919 = (int) ((long) super.field5919 + ((long) (this.field6994 << 2) * (long) this.field6991 >> 23) * (long) arg1);
            super.field5926 = (int) ((long) super.field5926 + ((long) (this.field6994 << 2) * (long) this.field6996 >> 23) * (long) arg1);
            super.field5922 = (int) ((long) super.field5922 + ((long) (this.field6994 << 2) * (long) this.field6992 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lha;J)V")
    public final void method3025(class548 arg0, long arg1) {
        int var4 = super.field5919 >> class371.field5241 + 12;
        int var5 = super.field5922 >> class371.field5241 + 12;
        int var6 = super.field5926 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class61.field877 && var5 >= 0 && var5 < class713.field9959) {
            class689 var7 = this.field6990.field9391;
            class623 var8 = this.field6990.field9381;
            class341[] var9 = class433.field6043;
            int var10 = var7.field9596;
            class262 var11 = class137.field1948[var7.field9596][var4][var5];
            if (var11 != null) {
                var10 = var11.field3852;
            }
            int var12 = var9[var10].method2171(var5, var4, 31);
            int var13;
            if (var10 < class370.field5229 - 1) {
                var13 = var9[var10 + 1].method2171(var5, var4, 31);
            } else {
                var13 = var12 - (8 << class371.field5241);
            }
            if (var8.field8400) {
                if (var8.field8376 == -1 && var6 > var12) {
                    this.method3027();
                    return;
                }
                if (var8.field8376 >= 0 && var6 > var9[var8.field8376].method2171(var5, var4, 31)) {
                    this.method3027();
                    return;
                }
                if (var8.field8350 == -1 && var6 < var13) {
                    this.method3027();
                    return;
                }
                if (var8.field8350 >= 0 && var6 < var9[var8.field8350 + 1].method2171(var5, var4, 31)) {
                    this.method3027();
                    return;
                }
            }
            int var14;
            for (var14 = class370.field5229 - 1; var14 > 0 && var6 > var9[var14].method2171(var5, var4, 31); --var14) {
            }
            if (var8.field8336 && var14 == 0 && var6 > var9[0].method2171(var5, var4, 31)) {
                this.method3027();
            } else if (class370.field5229 - 1 == var14 && var9[var14].method2171(var5, var4, 31) - var6 > 8 << class371.field5241) {
                this.method3027();
            } else {
                class262 var15 = class137.field1948[var14][var4][var5];
                if (var15 == null) {
                    if (var14 == 0 || class137.field1948[0][var4][var5] == null) {
                        var15 = class137.field1948[0][var4][var5] = new class262(0);
                    }
                    boolean var16 = class137.field1948[0][var4][var5].field3847 != null;
                    if (var14 == 3 && var16) {
                        this.method3027();
                        return;
                    }
                    for (int var17 = 1; var17 <= var14; ++var17) {
                        if (class137.field1948[var17][var4][var5] == null) {
                            var15 = class137.field1948[var17][var4][var5] = new class262(var17);
                            if (var16) {
                                ++var15.field3852;
                            }
                        }
                    }
                }
                if (var8.field8340) {
                    int var18 = super.field5919 >> 12;
                    int var19 = super.field5922 >> 12;
                    if (var15.field3845 != null) {
                        class613 var20 = var15.field3845.method653(arg0, (byte) 13);
                        if (var20 != null && var20.method3477(var19, 8, var6, var18)) {
                            this.method3027();
                            return;
                        }
                    }
                    if (var15.field3842 != null) {
                        class613 var21 = var15.field3842.method653(arg0, (byte) 13);
                        if (var21 != null && var21.method3477(var19, 8, var6, var18)) {
                            this.method3027();
                            return;
                        }
                    }
                    if (var15.field3844 != null) {
                        class613 var22 = var15.field3844.method653(arg0, (byte) 13);
                        if (var22 != null && var22.method3477(var19, 8, var6, var18)) {
                            this.method3027();
                            return;
                        }
                    }
                    for (class638 var23 = var15.field3846; var23 != null; var23 = var23.field8564) {
                        class613 var24 = var23.field8567.method653(arg0, (byte) 13);
                        if (var24 != null && var24.method3477(var19, 8, var6, var18)) {
                            this.method3027();
                            return;
                        }
                    }
                }
                var7.field9594.field1384.method3031(this, 0);
            }
        } else {
            this.method3027();
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "()V")
    private final void method3026() {
        int var1 = this.field6990.field9391.field9584;
        if (this.field6990.field9391.field9585[var1] != null) {
            this.field6990.field9391.field9585[var1].method3027();
        }
        this.field6990.field9391.field9585[var1] = this;
        this.field6989 = (short) this.field6990.field9391.field9584;
        this.field6990.field9391.field9584 = var1 + 1 & 8191;
        this.field6990.field9382.method1643(this, 127);
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "()V")
    public final void method3027() {
        this.field6990.field9391.field9585[this.field6989] = null;
        class223.field3012[class199.field2664] = this;
        class199.field2664 = class199.field2664 + 1 & 1023;
        this.method3012(116);
        this.method434((byte) -6);
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Lig;IIIIIIIIIIIZZ)V")
    public class502(class677 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field6990 = arg0;
        super.field5919 = arg1 << 12;
        super.field5926 = arg2 << 12;
        super.field5922 = arg3 << 12;
        super.field5921 = arg9;
        this.field6993 = this.field6997 = (short) arg8;
        super.field5920 = arg10;
        super.field5924 = arg11;
        super.field5925 = arg13;
        this.field6991 = (short) arg4;
        this.field6996 = (short) arg5;
        this.field6992 = (short) arg6;
        this.field6994 = arg7;
        super.field5923 = this.field6990.field9394.field539;
        this.method3026();
    }
}
