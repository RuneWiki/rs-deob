import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class191 extends class18 {

    @OriginalMember(owner = "client!vp", name = "J", descriptor = "Leu;")
    public class482 field2636;

    @OriginalMember(owner = "client!vp", name = "I", descriptor = "S")
    private short field2635;

    @OriginalMember(owner = "client!vp", name = "F", descriptor = "S")
    private short field2632;

    @OriginalMember(owner = "client!vp", name = "G", descriptor = "S")
    private short field2633;

    @OriginalMember(owner = "client!vp", name = "D", descriptor = "S")
    private short field2630;

    @OriginalMember(owner = "client!vp", name = "E", descriptor = "S")
    private short field2631;

    @OriginalMember(owner = "client!vp", name = "H", descriptor = "I")
    private int field2634;

    @OriginalMember(owner = "client!vp", name = "K", descriptor = "I")
    private int field2637;

    @OriginalMember(owner = "client!vp", name = "L", descriptor = "S")
    private short field2638;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "()V", line = 4)
    private final void method1280() {
        int var1 = this.field2636.field6540.field7173;
        if (this.field2636.field6540.field7166[var1] != null) {
            this.field2636.field6540.field7166[var1].method1283();
        }
        this.field2636.field6540.field7166[var1] = this;
        this.field2638 = (short) this.field2636.field6540.field7173;
        this.field2636.field6540.field7173 = var1 + 1 & 8191;
        this.field2636.field6538.method166(-8839, this);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lha;J)V", line = 19)
    public final void method1281(class60 arg0, long arg1) {
        int var4 = super.field333 >> class480.field6531 + 12;
        int var5 = super.field338 >> class480.field6531 + 12;
        int var6 = super.field339 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class289.field3784 && var5 >= 0 && var5 < class463.field6223) {
            class509 var7 = this.field2636.field6540;
            class115 var8 = this.field2636.field6550;
            class282[] var9 = class195.field2669;
            int var10 = var7.field7178;
            class14 var11 = class197.field2689[var7.field7178][var4][var5];
            if (var11 != null) {
                var10 = var11.field288;
            }
            int var12 = var9[var10].method1677(var5, (byte) 30, var4);
            int var13;
            if (var10 < class29.field515 - 1) {
                var13 = var9[var10 + 1].method1677(var5, (byte) 19, var4);
            } else {
                var13 = var12 - (8 << class480.field6531);
            }
            if (var8.field1683) {
                if (var8.field1663 == -1 && var6 > var12) {
                    this.method1283();
                    return;
                }
                if (var8.field1663 >= 0 && var6 > var9[var8.field1663].method1677(var5, (byte) 21, var4)) {
                    this.method1283();
                    return;
                }
                if (var8.field1676 == -1 && var6 < var13) {
                    this.method1283();
                    return;
                }
                if (var8.field1676 >= 0 && var6 < var9[var8.field1676 + 1].method1677(var5, (byte) 121, var4)) {
                    this.method1283();
                    return;
                }
            }
            int var14;
            for (var14 = class29.field515 - 1; var14 > 0 && var6 > var9[var14].method1677(var5, (byte) 114, var4); --var14) {
            }
            if (var8.field1667 && var14 == 0 && var6 > var9[0].method1677(var5, (byte) 52, var4)) {
                this.method1283();
            } else if (class29.field515 - 1 == var14 && var9[var14].method1677(var5, (byte) 103, var4) - var6 > 8 << class480.field6531) {
                this.method1283();
            } else {
                class14 var15 = class197.field2689[var14][var4][var5];
                if (var15 == null) {
                    if (var14 == 0 || class197.field2689[0][var4][var5] == null) {
                        var15 = class197.field2689[0][var4][var5] = new class14(0);
                    }
                    boolean var16 = class197.field2689[0][var4][var5].field282 != null;
                    if (var14 == 3 && var16) {
                        this.method1283();
                        return;
                    }
                    for (int var17 = 1; var17 <= var14; ++var17) {
                        if (class197.field2689[var17][var4][var5] == null) {
                            var15 = class197.field2689[var17][var4][var5] = new class14(var17);
                            if (var16) {
                                ++var15.field288;
                            }
                        }
                    }
                }
                if (var8.field1708) {
                    int var18 = super.field333 >> 12;
                    int var19 = super.field338 >> 12;
                    if (var15.field278 != null) {
                        class428 var20 = var15.field278.method750(-92, arg0);
                        if (var20 != null && var20.method2455(var19, var18, var6, true)) {
                            this.method1283();
                            return;
                        }
                    }
                    if (var15.field283 != null) {
                        class428 var21 = var15.field283.method750(-53, arg0);
                        if (var21 != null && var21.method2455(var19, var18, var6, true)) {
                            this.method1283();
                            return;
                        }
                    }
                    if (var15.field279 != null) {
                        class428 var22 = var15.field279.method750(-74, arg0);
                        if (var22 != null && var22.method2455(var19, var18, var6, true)) {
                            this.method1283();
                            return;
                        }
                    }
                    for (class621 var23 = var15.field289; var23 != null; var23 = var23.field8560) {
                        class428 var24 = var23.field8559.method750(-79, arg0);
                        if (var24 != null && var24.method2455(var19, var18, var6, true)) {
                            this.method1283();
                            return;
                        }
                    }
                }
                var7.field7176.field10344.method2958(true, this);
            }
        } else {
            this.method1283();
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Leu;IIIIIIIIIIIZZ)V", line = 194)
    public final void method1282(class482 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field2636 = arg0;
        super.field333 = arg1 << 12;
        super.field339 = arg2 << 12;
        super.field338 = arg3 << 12;
        super.field337 = arg9;
        this.field2632 = this.field2635 = (short) arg8;
        super.field330 = arg10;
        super.field335 = arg11;
        super.field334 = arg13;
        this.field2633 = (short) arg4;
        this.field2630 = (short) arg5;
        this.field2631 = (short) arg6;
        this.field2634 = arg7;
        super.field332 = this.field2636.field6542.field8011;
        this.method1280();
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "()V", line = 213)
    public final void method1283() {
        this.field2636.field6540.field7166[this.field2638] = null;
        class676.field9443[class162.field2230] = this;
        class162.field2230 = class162.field2230 + 1 & 1023;
        this.method3835(0);
        this.method889((byte) 92);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(JI)V", line = 222)
    public final void method1284(long arg0, int arg1) {
        this.field2635 = (short) (this.field2635 - arg1);
        if (this.field2635 <= 0) {
            this.method1283();
        } else {
            int var4 = super.field333 >> 12;
            int var5 = super.field339 >> 12;
            int var6 = super.field338 >> 12;
            class509 var7 = this.field2636.field6540;
            class115 var8 = this.field2636.field6550;
            if (var8.field1673 != 0) {
                if (this.field2632 - this.field2635 <= var8.field1709) {
                    int var9 = var8.field1689 * arg1 + (this.field2637 >> 16 & 255) + (super.field337 >> 8 & 65280);
                    int var10 = var8.field1641 * arg1 + (this.field2637 >> 8 & 255) + (super.field337 & 65280);
                    int var11 = var8.field1690 * arg1 + (super.field337 << 8 & 65280) + (this.field2637 & 255);
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
                    super.field337 &= -16777216;
                    super.field337 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field2637 &= -16777216;
                    this.field2637 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field2632 - this.field2635 <= var8.field1659) {
                    int var12 = var8.field1694 * arg1 + (this.field2637 >> 24 & 255) + (super.field337 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field337 &= 16777215;
                    super.field337 |= (var12 & 65280) << 16;
                    this.field2637 &= 16777215;
                    this.field2637 |= (var12 & 255) << 24;
                }
            }
            if (var8.field1644 != -1 && this.field2632 - this.field2635 <= var8.field1681) {
                this.field2634 += var8.field1677 * arg1;
            }
            if (var8.field1674 != -1 && this.field2632 - this.field2635 <= var8.field1651) {
                super.field330 += var8.field1662 * arg1;
            }
            double var13 = (double) this.field2633;
            double var15 = (double) this.field2630;
            double var17 = (double) this.field2631;
            boolean var19 = false;
            if (var8.field1696 == 1) {
                int var20 = var4 - this.field2636.field6549.field1823;
                int var21 = var5 - this.field2636.field6549.field1830;
                int var22 = var6 - this.field2636.field6549.field1829;
                int var23 = (int) Math.sqrt((double) (var22 * var22 + var20 * var20 + var21 * var21)) >> 2;
                long var24 = (long) (var8.field1653 * var23 * arg1);
                this.field2634 = (int) ((long) this.field2634 - ((long) this.field2634 * var24 >> 18));
            } else if (var8.field1696 == 2) {
                int var26 = var4 - this.field2636.field6549.field1823;
                int var27 = var5 - this.field2636.field6549.field1830;
                int var28 = var6 - this.field2636.field6549.field1829;
                int var29 = var28 * var28 + var26 * var26 + var27 * var27;
                long var30 = (long) (var8.field1653 * var29 * arg1);
                this.field2634 = (int) ((long) this.field2634 - ((long) this.field2634 * var30 >> 28));
            }
            if (var8.field1685 != null) {
                class168 var32 = var7.field7175.field9083;
                for (class168 var33 = var32.field2336; var32 != var33; var33 = var33.field2336) {
                    class422 var34 = (class422) var33;
                    class160 var35 = var34.field5361;
                    if (var35.field2205 != 1) {
                        boolean var36 = false;
                        for (int var37 = 0; var37 < var8.field1685.length; ++var37) {
                            if (var8.field1685[var37] == var35.field2206) {
                                var36 = true;
                                break;
                            }
                        }
                        if (var36) {
                            double var38 = (double) (var4 - var34.field5355);
                            double var40 = (double) (var5 - var34.field5362);
                            double var42 = (double) (var6 - var34.field5358);
                            double var44 = var42 * var42 + var38 * var38 + var40 * var40;
                            if (!(var44 > (double) var35.field2209)) {
                                double var46 = Math.sqrt(var44);
                                if (var46 == 0.0D) {
                                    var46 = 1.0D;
                                }
                                double var48 = ((double) var34.field5354 * var42 + (double) var34.field5364 * var38 + (double) var35.field2193 * var40) * 65535.0D / ((double) var35.field2197 * var46);
                                if (!(var48 < (double) var35.field2212)) {
                                    double var50 = 0.0D;
                                    if (var35.field2204 == 1) {
                                        var50 = var46 / 16.0D * (double) var35.field2208;
                                    } else if (var35.field2204 == 2) {
                                        var50 = var46 / 16.0D * (var46 / 16.0D) * (double) var35.field2208;
                                    }
                                    if (var35.field2202 == 0) {
                                        if (var35.field2196 == 0) {
                                            var13 += ((double) var34.field5364 - var50) * (double) arg1;
                                            var15 += ((double) var35.field2193 - var50) * (double) arg1;
                                            var17 += ((double) var34.field5354 - var50) * (double) arg1;
                                            var19 = true;
                                        } else {
                                            super.field333 = (int) ((double) super.field333 + ((double) var34.field5364 - var50) * (double) arg1);
                                            super.field339 = (int) ((double) super.field339 + ((double) var35.field2193 - var50) * (double) arg1);
                                            super.field338 = (int) ((double) super.field338 + ((double) var34.field5354 - var50) * (double) arg1);
                                        }
                                    } else {
                                        double var52 = var38 / var46 * (double) var35.field2197;
                                        double var54 = var40 / var46 * (double) var35.field2197;
                                        double var56 = var42 / var46 * (double) var35.field2197;
                                        if (var35.field2196 == 0) {
                                            var13 += (double) arg1 * var52;
                                            var15 += (double) arg1 * var54;
                                            var17 += (double) arg1 * var56;
                                            var19 = true;
                                        } else {
                                            super.field333 = (int) ((double) super.field333 + (double) arg1 * var52);
                                            super.field339 = (int) ((double) super.field339 + (double) arg1 * var54);
                                            super.field338 = (int) ((double) super.field338 + (double) arg1 * var56);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field1670 != null) {
                for (int var58 = 0; var58 < var8.field1670.length; ++var58) {
                    class422 var59 = (class422) class417.field5308.method1953((long) var8.field1670[var58], -3462);
                    while (var59 != null) {
                        class160 var60 = var59.field5361;
                        double var61 = (double) (var4 - var59.field5355);
                        double var63 = (double) (var5 - var59.field5362);
                        double var65 = (double) (var6 - var59.field5358);
                        double var67 = var65 * var65 + var61 * var61 + var63 * var63;
                        if (var67 > (double) var60.field2209) {
                            var59 = (class422) class417.field5308.method1952(-3);
                        } else {
                            double var69 = Math.sqrt(var67);
                            if (var69 == 0.0D) {
                                var69 = 1.0D;
                            }
                            double var71 = ((double) var59.field5354 * var65 + (double) var59.field5364 * var61 + (double) var60.field2193 * var63) * 65535.0D / ((double) var60.field2197 * var69);
                            if (var71 < (double) var60.field2212) {
                                var59 = (class422) class417.field5308.method1952(-3);
                            } else {
                                double var73 = 0.0D;
                                if (var60.field2204 == 1) {
                                    var73 = var69 / 16.0D * (double) var60.field2208;
                                } else if (var60.field2204 == 2) {
                                    var73 = var69 / 16.0D * (var69 / 16.0D) * (double) var60.field2208;
                                }
                                if (var60.field2202 == 0) {
                                    if (var60.field2196 == 0) {
                                        var13 += ((double) var59.field5364 - var73) * (double) arg1;
                                        var15 += ((double) var60.field2193 - var73) * (double) arg1;
                                        var17 += ((double) var59.field5354 - var73) * (double) arg1;
                                        var19 = true;
                                    } else {
                                        super.field333 = (int) ((double) super.field333 + ((double) var59.field5364 - var73) * (double) arg1);
                                        super.field339 = (int) ((double) super.field339 + ((double) var60.field2193 - var73) * (double) arg1);
                                        super.field338 = (int) ((double) super.field338 + ((double) var59.field5354 - var73) * (double) arg1);
                                    }
                                } else {
                                    double var75 = var61 / var69 * (double) var60.field2197;
                                    double var77 = var63 / var69 * (double) var60.field2197;
                                    double var79 = var65 / var69 * (double) var60.field2197;
                                    if (var60.field2196 == 0) {
                                        var13 += (double) arg1 * var75;
                                        var15 += (double) arg1 * var77;
                                        var17 += (double) arg1 * var79;
                                        var19 = true;
                                    } else {
                                        super.field333 = (int) ((double) super.field333 + (double) arg1 * var75);
                                        super.field339 = (int) ((double) super.field339 + (double) arg1 * var77);
                                        super.field338 = (int) ((double) super.field338 + (double) arg1 * var79);
                                    }
                                }
                                var59 = (class422) class417.field5308.method1952(-3);
                            }
                        }
                    }
                }
            }
            if (var8.field1665 != null) {
                if (var8.field1693 == null) {
                    var8.field1693 = new int[var8.field1665.length];
                    for (int var81 = 0; var81 < var8.field1665.length; ++var81) {
                        class409.method2286((byte) -105, var8.field1665[var81]);
                        var8.field1693[var81] = ((class393) class599.field8345.method1160((long) var8.field1665[var81], 120)).field4992;
                    }
                }
                for (int var82 = 0; var82 < var8.field1693.length; ++var82) {
                    class160 var83 = class667.field9379[var8.field1693[var82]];
                    if (var83.field2196 == 0) {
                        var13 += (double) (var83.field2201 * arg1);
                        var15 += (double) (var83.field2193 * arg1);
                        var17 += (double) (var83.field2199 * arg1);
                        var19 = true;
                    } else {
                        super.field333 += var83.field2201 * arg1;
                        super.field339 += var83.field2193 * arg1;
                        super.field338 += var83.field2199 * arg1;
                    }
                }
            }
            if (var19) {
                while (true) {
                    if (!(var13 > 32767.0D) && !(var15 > 32767.0D) && !(var17 > 32767.0D) && !(var13 < -32767.0D) && !(var15 < -32767.0D) && !(var17 < -32767.0D)) {
                        this.field2633 = (short) ((int) var13);
                        this.field2630 = (short) ((int) var15);
                        this.field2631 = (short) ((int) var17);
                        break;
                    }
                    var13 /= 2.0D;
                    var15 /= 2.0D;
                    var17 /= 2.0D;
                    this.field2634 <<= 1;
                }
            }
            super.field333 = (int) ((long) super.field333 + ((long) (this.field2634 << 2) * (long) this.field2633 >> 23) * (long) arg1);
            super.field339 = (int) ((long) super.field339 + ((long) (this.field2634 << 2) * (long) this.field2630 >> 23) * (long) arg1);
            super.field338 = (int) ((long) super.field338 + ((long) (this.field2634 << 2) * (long) this.field2631 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Leu;IIIIIIIIIIIZZ)V", line = 616)
    public class191(class482 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field2636 = arg0;
        super.field333 = arg1 << 12;
        super.field339 = arg2 << 12;
        super.field338 = arg3 << 12;
        super.field337 = arg9;
        this.field2632 = this.field2635 = (short) arg8;
        super.field330 = arg10;
        super.field335 = arg11;
        super.field334 = arg13;
        this.field2633 = (short) arg4;
        this.field2630 = (short) arg5;
        this.field2631 = (short) arg6;
        this.field2634 = arg7;
        super.field332 = this.field2636.field6542.field8011;
        this.method1280();
    }
}
