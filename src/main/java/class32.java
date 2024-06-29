import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public class class32 extends class193 {

    @OriginalMember(owner = "client!rea", name = "A", descriptor = "Llh;")
    public class344 field462;

    @OriginalMember(owner = "client!rea", name = "B", descriptor = "S")
    private short field463;

    @OriginalMember(owner = "client!rea", name = "G", descriptor = "S")
    private short field468;

    @OriginalMember(owner = "client!rea", name = "F", descriptor = "S")
    private short field467;

    @OriginalMember(owner = "client!rea", name = "D", descriptor = "S")
    private short field465;

    @OriginalMember(owner = "client!rea", name = "y", descriptor = "S")
    private short field460;

    @OriginalMember(owner = "client!rea", name = "E", descriptor = "I")
    private int field466;

    @OriginalMember(owner = "client!rea", name = "C", descriptor = "I")
    private int field464;

    @OriginalMember(owner = "client!rea", name = "z", descriptor = "S")
    private short field461;

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "()V", line = 4)
    public final void method290() {
        this.field462.field4828.field8985[this.field461] = null;
        class117.field1867[class7.field74] = this;
        class7.field74 = class7.field74 + 1 & 1023;
        this.method3421(3);
        this.method1678(false);
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(Lr;J)V", line = 12)
    public final void method291(class98 arg0, long arg1) {
        int var4 = super.field2998 >> class49.field637 + 12;
        int var5 = super.field2992 >> class49.field637 + 12;
        int var6 = super.field2994 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class33.field474 && var5 >= 0 && var5 < class687.field9758) {
            class635 var7 = this.field462.field4828;
            class571 var8 = this.field462.field4818;
            class682[] var9 = class687.field9745;
            int var10 = var7.field8993;
            class293 var11 = class541.field7946[var7.field8993][var4][var5];
            if (var11 != null) {
                var10 = var11.field4101;
            }
            int var12 = var9[var10].method3858(var5, var4, (byte) 26);
            int var13;
            if (var10 < class596.field8626 - 1) {
                var13 = var9[var10 + 1].method3858(var5, var4, (byte) 126);
            } else {
                var13 = var12 - (8 << class49.field637);
            }
            if (var8.field8359) {
                if (var8.field8362 == -1 && var6 > var12) {
                    this.method290();
                    return;
                }
                if (var8.field8362 >= 0 && var6 > var9[var8.field8362].method3858(var5, var4, (byte) 81)) {
                    this.method290();
                    return;
                }
                if (var8.field8364 == -1 && var6 < var13) {
                    this.method290();
                    return;
                }
                if (var8.field8364 >= 0 && var6 < var9[var8.field8364 + 1].method3858(var5, var4, (byte) 27)) {
                    this.method290();
                    return;
                }
            }
            int var14;
            for (var14 = class596.field8626 - 1; var14 > 0 && var6 > var9[var14].method3858(var5, var4, (byte) 25); --var14) {
            }
            if (var8.field8400 && var14 == 0 && var6 > var9[0].method3858(var5, var4, (byte) 48)) {
                this.method290();
            } else if (class596.field8626 - 1 == var14 && var9[var14].method3858(var5, var4, (byte) 72) - var6 > 8 << class49.field637) {
                this.method290();
            } else {
                class293 var15 = class541.field7946[var14][var4][var5];
                if (var15 == null) {
                    if (var14 == 0 || class541.field7946[0][var4][var5] == null) {
                        var15 = class541.field7946[0][var4][var5] = new class293(0);
                    }
                    boolean var16 = class541.field7946[0][var4][var5].field4098 != null;
                    if (var14 == 3 && var16) {
                        this.method290();
                        return;
                    }
                    for (int var17 = 1; var17 <= var14; ++var17) {
                        if (class541.field7946[var17][var4][var5] == null) {
                            var15 = class541.field7946[var17][var4][var5] = new class293(var17);
                            if (var16) {
                                ++var15.field4101;
                            }
                        }
                    }
                }
                if (var8.field8404) {
                    int var18 = super.field2998 >> 12;
                    int var19 = super.field2992 >> 12;
                    if (var15.field4091 != null) {
                        class203 var20 = var15.field4091.method631(1, arg0);
                        if (var20 != null && var20.method1411(-88, var19, var18, var6)) {
                            this.method290();
                            return;
                        }
                    }
                    if (var15.field4095 != null) {
                        class203 var21 = var15.field4095.method631(1, arg0);
                        if (var21 != null && var21.method1411(-126, var19, var18, var6)) {
                            this.method290();
                            return;
                        }
                    }
                    if (var15.field4084 != null) {
                        class203 var22 = var15.field4084.method631(1, arg0);
                        if (var22 != null && var22.method1411(62, var19, var18, var6)) {
                            this.method290();
                            return;
                        }
                    }
                    for (class198 var23 = var15.field4097; var23 != null; var23 = var23.field3078) {
                        class203 var24 = var23.field3085.method631(1, arg0);
                        if (var24 != null && var24.method1411(59, var19, var18, var6)) {
                            this.method290();
                            return;
                        }
                    }
                }
                var7.field8991.field3898.method272(this, 28386);
            }
        } else {
            this.method290();
        }
    }

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "()V", line = 186)
    private final void method292() {
        int var1 = this.field462.field4828.field8987;
        if (this.field462.field4828.field8985[var1] != null) {
            this.field462.field4828.field8985[var1].method290();
        }
        this.field462.field4828.field8985[var1] = this;
        this.field461 = (short) this.field462.field4828.field8987;
        this.field462.field4828.field8987 = var1 + 1 & 8191;
        this.field462.field4822.method3307(0, this);
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(JI)V", line = 196)
    public final void method293(long arg0, int arg1) {
        this.field463 = (short) (this.field463 - arg1);
        if (this.field463 <= 0) {
            this.method290();
        } else {
            int var4 = super.field2998 >> 12;
            int var5 = super.field2994 >> 12;
            int var6 = super.field2992 >> 12;
            class635 var7 = this.field462.field4828;
            class571 var8 = this.field462.field4818;
            if (var8.field8374 != 0) {
                if (this.field468 - this.field463 <= var8.field8378) {
                    int var9 = var8.field8373 * arg1 + (this.field464 >> 16 & 255) + (super.field2996 >> 8 & 65280);
                    int var10 = var8.field8340 * arg1 + (this.field464 >> 8 & 255) + (super.field2996 & 65280);
                    int var11 = var8.field8350 * arg1 + (super.field2996 << 8 & 65280) + (this.field464 & 255);
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
                    super.field2996 &= -16777216;
                    super.field2996 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field464 &= -16777216;
                    this.field464 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field468 - this.field463 <= var8.field8353) {
                    int var12 = var8.field8398 * arg1 + (this.field464 >> 24 & 255) + (super.field2996 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field2996 &= 16777215;
                    super.field2996 |= (var12 & 65280) << 16;
                    this.field464 &= 16777215;
                    this.field464 |= (var12 & 255) << 24;
                }
            }
            if (var8.field8365 != -1 && this.field468 - this.field463 <= var8.field8366) {
                this.field466 += var8.field8371 * arg1;
            }
            if (var8.field8363 != -1 && this.field468 - this.field463 <= var8.field8399) {
                super.field2987 += var8.field8360 * arg1;
            }
            double var13 = (double) this.field467;
            double var15 = (double) this.field465;
            double var17 = (double) this.field460;
            boolean var19 = false;
            if (var8.field8369 == 1) {
                int var20 = var4 - this.field462.field4831.field9648;
                int var21 = var5 - this.field462.field4831.field9646;
                int var22 = var6 - this.field462.field4831.field9640;
                int var23 = (int) Math.sqrt((double) (var22 * var22 + var20 * var20 + var21 * var21)) >> 2;
                long var24 = (long) (var8.field8388 * var23 * arg1);
                this.field466 = (int) ((long) this.field466 - ((long) this.field466 * var24 >> 18));
            } else if (var8.field8369 == 2) {
                int var26 = var4 - this.field462.field4831.field9648;
                int var27 = var5 - this.field462.field4831.field9646;
                int var28 = var6 - this.field462.field4831.field9640;
                int var29 = var28 * var28 + var26 * var26 + var27 * var27;
                long var30 = (long) (var8.field8388 * var29 * arg1);
                this.field466 = (int) ((long) this.field466 - ((long) this.field466 * var30 >> 28));
            }
            if (var8.field8381 != null) {
                class435 var32 = var7.field8990.field9799;
                for (class435 var33 = var32.field6259; var32 != var33; var33 = var33.field6259) {
                    class584 var34 = (class584) var33;
                    class102 var35 = var34.field8549;
                    if (var35.field1675 != 1) {
                        boolean var36 = false;
                        for (int var37 = 0; var37 < var8.field8381.length; ++var37) {
                            if (var8.field8381[var37] == var35.field1663) {
                                var36 = true;
                                break;
                            }
                        }
                        if (var36) {
                            double var38 = (double) (var4 - var34.field8552);
                            double var40 = (double) (var5 - var34.field8550);
                            double var42 = (double) (var6 - var34.field8556);
                            double var44 = var42 * var42 + var38 * var38 + var40 * var40;
                            if (!(var44 > (double) var35.field1666)) {
                                double var46 = Math.sqrt(var44);
                                if (var46 == 0.0D) {
                                    var46 = 1.0D;
                                }
                                double var48 = ((double) var34.field8551 * var42 + (double) var34.field8554 * var38 + (double) var35.field1660 * var40) * 65535.0D / ((double) var35.field1656 * var46);
                                if (!(var48 < (double) var35.field1676)) {
                                    double var50 = 0.0D;
                                    if (var35.field1655 == 1) {
                                        var50 = var46 / 16.0D * (double) var35.field1661;
                                    } else if (var35.field1655 == 2) {
                                        var50 = var46 / 16.0D * (var46 / 16.0D) * (double) var35.field1661;
                                    }
                                    if (var35.field1671 == 0) {
                                        if (var35.field1672 == 0) {
                                            var13 += ((double) var34.field8554 - var50) * (double) arg1;
                                            var15 += ((double) var35.field1660 - var50) * (double) arg1;
                                            var17 += ((double) var34.field8551 - var50) * (double) arg1;
                                            var19 = true;
                                        } else {
                                            super.field2998 = (int) ((double) super.field2998 + ((double) var34.field8554 - var50) * (double) arg1);
                                            super.field2994 = (int) ((double) super.field2994 + ((double) var35.field1660 - var50) * (double) arg1);
                                            super.field2992 = (int) ((double) super.field2992 + ((double) var34.field8551 - var50) * (double) arg1);
                                        }
                                    } else {
                                        double var52 = var38 / var46 * (double) var35.field1656;
                                        double var54 = var40 / var46 * (double) var35.field1656;
                                        double var56 = var42 / var46 * (double) var35.field1656;
                                        if (var35.field1672 == 0) {
                                            var13 += (double) arg1 * var52;
                                            var15 += (double) arg1 * var54;
                                            var17 += (double) arg1 * var56;
                                            var19 = true;
                                        } else {
                                            super.field2998 = (int) ((double) super.field2998 + (double) arg1 * var52);
                                            super.field2994 = (int) ((double) super.field2994 + (double) arg1 * var54);
                                            super.field2992 = (int) ((double) super.field2992 + (double) arg1 * var56);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field8395 != null) {
                for (int var58 = 0; var58 < var8.field8395.length; ++var58) {
                    class584 var59 = (class584) class5.field46.method3867((long) var8.field8395[var58], 0);
                    while (var59 != null) {
                        class102 var60 = var59.field8549;
                        double var61 = (double) (var4 - var59.field8552);
                        double var63 = (double) (var5 - var59.field8550);
                        double var65 = (double) (var6 - var59.field8556);
                        double var67 = var65 * var65 + var61 * var61 + var63 * var63;
                        if (var67 > (double) var60.field1666) {
                            var59 = (class584) class5.field46.method3865(110);
                        } else {
                            double var69 = Math.sqrt(var67);
                            if (var69 == 0.0D) {
                                var69 = 1.0D;
                            }
                            double var71 = ((double) var59.field8551 * var65 + (double) var59.field8554 * var61 + (double) var60.field1660 * var63) * 65535.0D / ((double) var60.field1656 * var69);
                            if (var71 < (double) var60.field1676) {
                                var59 = (class584) class5.field46.method3865(61);
                            } else {
                                double var73 = 0.0D;
                                if (var60.field1655 == 1) {
                                    var73 = var69 / 16.0D * (double) var60.field1661;
                                } else if (var60.field1655 == 2) {
                                    var73 = var69 / 16.0D * (var69 / 16.0D) * (double) var60.field1661;
                                }
                                if (var60.field1671 == 0) {
                                    if (var60.field1672 == 0) {
                                        var13 += ((double) var59.field8554 - var73) * (double) arg1;
                                        var15 += ((double) var60.field1660 - var73) * (double) arg1;
                                        var17 += ((double) var59.field8551 - var73) * (double) arg1;
                                        var19 = true;
                                    } else {
                                        super.field2998 = (int) ((double) super.field2998 + ((double) var59.field8554 - var73) * (double) arg1);
                                        super.field2994 = (int) ((double) super.field2994 + ((double) var60.field1660 - var73) * (double) arg1);
                                        super.field2992 = (int) ((double) super.field2992 + ((double) var59.field8551 - var73) * (double) arg1);
                                    }
                                } else {
                                    double var75 = var61 / var69 * (double) var60.field1656;
                                    double var77 = var63 / var69 * (double) var60.field1656;
                                    double var79 = var65 / var69 * (double) var60.field1656;
                                    if (var60.field1672 == 0) {
                                        var13 += (double) arg1 * var75;
                                        var15 += (double) arg1 * var77;
                                        var17 += (double) arg1 * var79;
                                        var19 = true;
                                    } else {
                                        super.field2998 = (int) ((double) super.field2998 + (double) arg1 * var75);
                                        super.field2994 = (int) ((double) super.field2994 + (double) arg1 * var77);
                                        super.field2992 = (int) ((double) super.field2992 + (double) arg1 * var79);
                                    }
                                }
                                var59 = (class584) class5.field46.method3865(72);
                            }
                        }
                    }
                }
            }
            if (var8.field8347 != null) {
                if (var8.field8339 == null) {
                    var8.field8339 = new int[var8.field8347.length];
                    for (int var81 = 0; var81 < var8.field8347.length; ++var81) {
                        class648.method3636(var8.field8347[var81], false);
                        var8.field8339[var81] = ((class83) class492.field7065.method2818(-22803, (long) var8.field8347[var81])).field1264;
                    }
                }
                for (int var82 = 0; var82 < var8.field8339.length; ++var82) {
                    class102 var83 = class689.field9776[var8.field8339[var82]];
                    if (var83.field1672 == 0) {
                        var13 += (double) (var83.field1664 * arg1);
                        var15 += (double) (var83.field1660 * arg1);
                        var17 += (double) (var83.field1669 * arg1);
                        var19 = true;
                    } else {
                        super.field2998 += var83.field1664 * arg1;
                        super.field2994 += var83.field1660 * arg1;
                        super.field2992 += var83.field1669 * arg1;
                    }
                }
            }
            if (var19) {
                while (true) {
                    if (!(var13 > 32767.0D) && !(var15 > 32767.0D) && !(var17 > 32767.0D) && !(var13 < -32767.0D) && !(var15 < -32767.0D) && !(var17 < -32767.0D)) {
                        this.field467 = (short) ((int) var13);
                        this.field465 = (short) ((int) var15);
                        this.field460 = (short) ((int) var17);
                        break;
                    }
                    var13 /= 2.0D;
                    var15 /= 2.0D;
                    var17 /= 2.0D;
                    this.field466 <<= 1;
                }
            }
            super.field2998 = (int) ((long) super.field2998 + ((long) (this.field466 << 2) * (long) this.field467 >> 23) * (long) arg1);
            super.field2994 = (int) ((long) super.field2994 + ((long) (this.field466 << 2) * (long) this.field465 >> 23) * (long) arg1);
            super.field2992 = (int) ((long) super.field2992 + ((long) (this.field466 << 2) * (long) this.field460 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(Llh;IIIIIIIIIIIZZ)V", line = 597)
    public final void method294(class344 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field462 = arg0;
        super.field2998 = arg1 << 12;
        super.field2994 = arg2 << 12;
        super.field2992 = arg3 << 12;
        super.field2996 = arg9;
        this.field468 = this.field463 = (short) arg8;
        super.field2987 = arg10;
        super.field2995 = arg11;
        super.field2997 = arg13;
        this.field467 = (short) arg4;
        this.field465 = (short) arg5;
        this.field460 = (short) arg6;
        this.field466 = arg7;
        super.field2991 = this.field462.field4825.field62;
        this.method292();
    }

    @OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(Llh;IIIIIIIIIIIZZ)V", line = 616)
    public class32(class344 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field462 = arg0;
        super.field2998 = arg1 << 12;
        super.field2994 = arg2 << 12;
        super.field2992 = arg3 << 12;
        super.field2996 = arg9;
        this.field468 = this.field463 = (short) arg8;
        super.field2987 = arg10;
        super.field2995 = arg11;
        super.field2997 = arg13;
        this.field467 = (short) arg4;
        this.field465 = (short) arg5;
        this.field460 = (short) arg6;
        this.field466 = arg7;
        super.field2991 = this.field462.field4825.field62;
        this.method292();
    }
}
