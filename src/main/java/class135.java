import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class135 extends class282 {

    @OriginalMember(owner = "client!ac", name = "M", descriptor = "Z")
    public boolean field2144 = false;

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "Lul;")
    public class192 field2139;

    @OriginalMember(owner = "client!ac", name = "L", descriptor = "I")
    public int field2143;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "I")
    public int field2136;

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "I")
    public int field2133;

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "I")
    public int field2135;

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "S")
    private short field2131;

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "S")
    private short field2142;

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "S")
    private short field2138;

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "S")
    private short field2137;

    @OriginalMember(owner = "client!ac", name = "I", descriptor = "S")
    private short field2140;

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "I")
    private int field2134;

    @OriginalMember(owner = "client!ac", name = "J", descriptor = "I")
    private static int field2141 = 12;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "I")
    private int field2130;

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "S")
    private short field2132;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lul;IIIIIIIII)V")
    public final void method948(class192 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field2139 = arg0;
        this.field2143 = arg1 << field2141;
        this.field2136 = arg2 << field2141;
        this.field2133 = arg3 << field2141;
        this.field2135 = arg9;
        this.field2142 = this.field2131 = (short) arg8;
        this.field2138 = (short) arg4;
        this.field2137 = (short) arg5;
        this.field2140 = (short) arg6;
        this.field2134 = arg7;
        this.method949();
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "()V")
    private final void method949() {
        int var1 = this.field2139.field3097.field2789;
        if (this.field2139.field3097.field2776[var1] != null) {
            this.field2139.field3097.field2776[var1].method950();
        }
        this.field2139.field3097.field2776[var1] = this;
        this.field2132 = (short) this.field2139.field3097.field2789;
        this.field2139.field3097.field2789 = var1 + 1 & 0x1FFF;
        this.field2139.field3108.method857(this, 121);
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "()V")
    private final void method950() {
        this.field2139.field3097.field2776[this.field2132] = null;
        class171.field2782[class171.field2780] = this;
        class171.field2780 = class171.field2780 + 1 & 0x3FF;
        this.field2139 = null;
        this.method574(-104);
        this.method1894(false);
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(JI)V")
    public final void method951(long arg0, int arg1) {
        if (this.field2139 == null) {
            return;
        }
        this.field2131 = (short) (this.field2131 - arg1);
        if (this.field2131 <= 0) {
            this.method950();
            return;
        }
        int var4 = this.field2143 >> field2141;
        int var5 = this.field2136 >> field2141;
        int var6 = this.field2133 >> field2141;
        class171 var7 = this.field2139.field3097;
        class286 var8 = this.field2139.field3101;
        if (var8.field4596 != 0) {
            if (this.field2142 - this.field2131 <= var8.field4554) {
                int var9 = var8.field4556 * arg1 + (this.field2135 >> 8 & 0xFF00) + (this.field2130 >> 16 & 0xFF);
                int var10 = var8.field4565 * arg1 + (this.field2130 >> 8 & 0xFF) + (this.field2135 & 0xFF00);
                int var11 = var8.field4551 * arg1 + (this.field2135 & 0xFF << 8) + (this.field2130 & 0xFF);
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
                this.field2135 &= 0xFF000000;
                this.field2135 |= ((var11 & 0xFF00) >> 8) + ((var9 & 0xFF00) << 8) + (var10 & 0xFF00);
                this.field2130 &= 0xFF000000;
                this.field2130 |= (var11 & 0xFF) + ((var9 & 0xFF) << 16) + ((var10 & 0xFF) << 8);
            }
            if (this.field2142 - this.field2131 <= var8.field4595) {
                int var12 = var8.field4594 * arg1 + (this.field2135 >> 16 & 0xFF00) + (this.field2130 >> 24 & 0xFF);
                if (var12 < 0) {
                    var12 = 0;
                } else if (var12 > 65535) {
                    var12 = 65535;
                }
                this.field2135 &= 0xFFFFFF;
                this.field2135 |= (var12 & 0xFF00) << 16;
                this.field2130 &= 0xFFFFFF;
                this.field2130 |= (var12 & 0xFF) << 24;
            }
        }
        if (var8.field4568 != -1 && this.field2142 - this.field2131 <= var8.field4540) {
            this.field2134 += var8.field4558 * arg1;
        }
        int var13 = this.field2138;
        int var14 = this.field2137;
        int var15 = this.field2140;
        boolean var16 = false;
        if (var8.field4593 == 1) {
            int var17 = var4 - this.field2139.field3117;
            int var18 = var5 - this.field2139.field3092;
            int var19 = var6 - this.field2139.field3090;
            int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
            long var21 = (long) (var8.field4587 * var20 * arg1);
            this.field2134 = (int) ((long) this.field2134 - ((long) this.field2134 * var21 >> 18));
        } else if (var8.field4593 == 2) {
            int var23 = var4 - this.field2139.field3117;
            int var24 = var5 - this.field2139.field3092;
            int var25 = var6 - this.field2139.field3090;
            int var26 = var25 * var25 + var23 * var23 + var24 * var24;
            long var27 = (long) (var8.field4587 * var26 * arg1);
            this.field2134 = (int) ((long) this.field2134 - ((long) this.field2134 * var27 >> 28));
        }
        class128 var29 = var7.field2796.field3926;
        for (class128 var30 = var29.field2022; var30 != var29; var30 = var30.field2022) {
            class218 var57 = (class218) var30;
            class245 var58 = var57.field3579.field1103;
            if (var58.field3905 != 1) {
                int var59 = var4 - var57.field3577;
                int var60 = var5 - var57.field3573;
                int var61 = var6 - var57.field3588;
                long var62 = (long) (var61 * var61 + var59 * var59 + var60 * var60);
                if (var62 <= var58.field3899) {
                    int var64 = (int) Math.sqrt((double) var62);
                    if (var64 == 0) {
                        var64 = 1;
                    }
                    long var65 = (long) (var57.field3578 * var61 + var57.field3585 * var59 + var58.field3896 * var60) * 65535L / (long) (var58.field3889 * var64);
                    if (var65 >= (long) var58.field3904) {
                        int var67 = 0;
                        if (var58.field3907 == 1) {
                            var67 = (var64 >> 4) * var58.field3886;
                        } else if (var58.field3907 == 2) {
                            var67 = (var64 >> 4) * (var64 >> 4) * var58.field3886;
                        }
                        if (var58.field3892 != 0) {
                            int var68 = (var59 << 15) / var64 * var58.field3889;
                            int var69 = (var60 << 15) / var64 * var58.field3889;
                            int var70 = (var61 << 15) / var64 * var58.field3889;
                            if (var58.field3885 == 0) {
                                var13 += arg1 * var68 >> 15;
                                var14 += arg1 * var69 >> 15;
                                var15 += arg1 * var70 >> 15;
                                var16 = true;
                            } else {
                                this.field2143 += arg1 * var68 >> 15;
                                this.field2136 += arg1 * var69 >> 15;
                                this.field2133 += arg1 * var70 >> 15;
                            }
                        } else if (var58.field3885 == 0) {
                            var13 += (var57.field3585 - var67) * arg1;
                            var14 += (var58.field3896 - var67) * arg1;
                            var15 += (var57.field3578 - var67) * arg1;
                            var16 = true;
                        } else {
                            this.field2143 += (var57.field3585 - var67) * arg1;
                            this.field2136 += (var58.field3896 - var67) * arg1;
                            this.field2133 += (var57.field3578 - var67) * arg1;
                        }
                    }
                }
            }
        }
        if (var8.field4534 != null) {
            for (int var31 = 0; var31 < var8.field4534.length; var31++) {
                class218 var32 = (class218) class171.field2779.method1941((byte) -49, (long) var8.field4534[var31]);
                while (var32 != null) {
                    class245 var33 = var32.field3579.field1103;
                    int var34 = var4 - var32.field3577;
                    int var35 = var5 - var32.field3573;
                    int var36 = var6 - var32.field3588;
                    long var37 = (long) (var36 * var36 + var34 * var34 + var35 * var35);
                    if (var37 > var33.field3899) {
                        var32 = (class218) class171.field2779.method1938(-108);
                    } else {
                        int var39 = (int) Math.sqrt((double) var37);
                        if (var39 == 0) {
                            var39 = 1;
                        }
                        long var40 = (long) (var32.field3578 * var36 + var32.field3585 * var34 + var33.field3896 * var35) * 65535L / (long) (var33.field3889 * var39);
                        if (var40 < (long) var33.field3904) {
                            var32 = (class218) class171.field2779.method1938(-68);
                        } else {
                            int var42 = 0;
                            if (var33.field3907 == 1) {
                                var42 = (var39 >> 4) * var33.field3886;
                            } else if (var33.field3907 == 2) {
                                var42 = (var39 >> 4) * (var39 >> 4) * var33.field3886;
                            }
                            if (var33.field3892 != 0) {
                                int var43 = (var34 << 15) / var39 * var33.field3889;
                                int var44 = (var35 << 15) / var39 * var33.field3889;
                                int var45 = (var36 << 15) / var39 * var33.field3889;
                                if (var33.field3885 == 0) {
                                    var13 += arg1 * var43 >> 15;
                                    var14 += arg1 * var44 >> 15;
                                    var15 += arg1 * var45 >> 15;
                                    var16 = true;
                                } else {
                                    this.field2143 += arg1 * var43 >> 15;
                                    this.field2136 += arg1 * var44 >> 15;
                                    this.field2133 += arg1 * var45 >> 15;
                                }
                            } else if (var33.field3885 == 0) {
                                var13 += (var32.field3585 - var42) * arg1;
                                var14 += (var33.field3896 - var42) * arg1;
                                var15 += (var32.field3578 - var42) * arg1;
                                var16 = true;
                            } else {
                                this.field2143 += (var32.field3585 - var42) * arg1;
                                this.field2136 += (var33.field3896 - var42) * arg1;
                                this.field2133 += (var32.field3578 - var42) * arg1;
                            }
                            var32 = (class218) class171.field2779.method1938(-35);
                        }
                    }
                }
            }
        }
        if (var8.field4536 != null) {
            if (var8.field4590 == null) {
                var8.field4590 = new int[var8.field4536.length];
                for (int var46 = 0; var46 < var8.field4536.length; var46++) {
                    class180.method1311(var8.field4536[var46], (byte) -79);
                    var8.field4590[var46] = ((class281) class161.field2553.method1059(0, (long) var8.field4536[var46])).field4495;
                }
            }
            for (int var47 = 0; var47 < var8.field4590.length; var47++) {
                class245 var48 = class234.field3776[var8.field4590[var47]];
                if (var48.field3885 == 0) {
                    var13 += var48.field3908 * arg1;
                    var14 += var48.field3896 * arg1;
                    var15 += var48.field3891 * arg1;
                    var16 = true;
                } else {
                    this.field2143 += var48.field3908 * arg1;
                    this.field2136 += var48.field3896 * arg1;
                    this.field2133 += var48.field3891 * arg1;
                }
            }
        }
        if (var16) {
            while (true) {
                if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                    this.field2138 = (short) var13;
                    this.field2137 = (short) var14;
                    this.field2140 = (short) var15;
                    break;
                }
                var13 >>= 0x1;
                var14 >>= 0x1;
                var15 >>= 0x1;
                this.field2134 <<= 0x1;
            }
        }
        this.field2143 = (int) ((long) this.field2143 + ((long) this.field2138 * (long) this.field2134 >> 23) * (long) arg1);
        this.field2136 = (int) ((long) this.field2136 + ((long) this.field2137 * (long) this.field2134 >> 23) * (long) arg1);
        this.field2133 = (int) ((long) this.field2133 + ((long) this.field2140 * (long) this.field2134 >> 23) * (long) arg1);
        int var49 = this.field2143 >> 19;
        int var50 = this.field2133 >> 19;
        int var51 = this.field2136 >> field2141;
        if (var51 > 0 || var51 < -65535 || var49 < 0 || var49 >= class96.field1548 || var50 < 0 || var50 >= class59.field972) {
            this.method950();
            return;
        }
        int[][][] var52 = class267.field4304;
        int var53 = var52[var7.field2810][var49][var50];
        int var54;
        if (var7.field2810 < 3) {
            var54 = var52[var7.field2810 + 1][var49][var50];
        } else {
            var54 = var52[var7.field2810][var49][var50] - 1024;
        }
        if (var8.field4588) {
            if (var8.field4589 == -1 && var51 > var53) {
                this.method950();
                return;
            }
            if (var8.field4589 >= 0 && var51 > var52[var8.field4589][var49][var50]) {
                this.method950();
                return;
            }
            if (var8.field4561 == -1 && var51 < var54) {
                this.method950();
                return;
            }
            if (var8.field4561 >= 0 && var51 < var52[var8.field4561 + 1][var49][var50]) {
                this.method950();
                return;
            }
        }
        if (var49 >= var7.field2808 && var49 <= var7.field2809 && var50 >= var7.field2807 && var50 <= var7.field2805 && var51 <= var7.field2802 && var51 >= var7.field2801) {
            this.field2144 = false;
            return;
        }
        this.field2144 = true;
        byte var55 = 3;
        if (var51 > var52[1][var49][var50]) {
            var55 = 0;
        } else if (var51 > var52[2][var49][var50]) {
            var55 = 1;
        } else if (var51 > var52[3][var49][var50]) {
            var55 = 2;
        } else if (var51 < var52[3][var49][var50] - 1024) {
            this.method950();
            return;
        }
        class151 var56 = class218.field3584[var55][var49][var50];
        if (var56 == null) {
            var56 = class218.field3584[var55][var49][var50] = new class151(var55, var49, var50);
        }
        if (var56.field2366 == null) {
            var56.field2366 = new class176();
            var56.field2345 = (byte) ((int) (arg0 & 0xFFL));
        } else if ((byte) ((int) (arg0 & 0xFFL)) != var56.field2345) {
            var56.field2366.method1286((byte) -98);
            var56.field2345 = (byte) ((int) (arg0 & 0xFFL));
        }
        var56.field2366.method1289((byte) 120, this);
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lul;IIIIIIIII)V")
    public class135(class192 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field2139 = arg0;
        this.field2143 = arg1 << field2141;
        this.field2136 = arg2 << field2141;
        this.field2133 = arg3 << field2141;
        this.field2135 = arg9;
        this.field2142 = this.field2131 = (short) arg8;
        this.field2138 = (short) arg4;
        this.field2137 = (short) arg5;
        this.field2140 = (short) arg6;
        this.field2134 = arg7;
        this.method949();
    }
}
