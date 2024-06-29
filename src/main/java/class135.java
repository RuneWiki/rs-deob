import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class135 extends class28 {

    @OriginalMember(owner = "client!g", name = "I", descriptor = "Llk;")
    private class504 field2129;

    @OriginalMember(owner = "client!g", name = "M", descriptor = "S")
    private short field2133;

    @OriginalMember(owner = "client!g", name = "L", descriptor = "S")
    private short field2132;

    @OriginalMember(owner = "client!g", name = "Q", descriptor = "S")
    private short field2137;

    @OriginalMember(owner = "client!g", name = "P", descriptor = "S")
    private short field2136;

    @OriginalMember(owner = "client!g", name = "J", descriptor = "S")
    private short field2130;

    @OriginalMember(owner = "client!g", name = "N", descriptor = "I")
    private int field2134;

    @OriginalMember(owner = "client!g", name = "O", descriptor = "I")
    private int field2135;

    @OriginalMember(owner = "client!g", name = "K", descriptor = "S")
    private short field2131;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "()V")
    public final void method910() {
        this.field2129.field7037.field6679[this.field2131] = null;
        class10.field113[class182.field2579] = this;
        class182.field2579 = class182.field2579 + 1 & 1023;
        this.method939(101);
        this.method3457(60);
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "()V")
    private final void method911() {
        int var1 = this.field2129.field7037.field6685;
        if (this.field2129.field7037.field6679[var1] != null) {
            this.field2129.field7037.field6679[var1].method910();
        }
        this.field2129.field7037.field6679[var1] = this;
        this.field2131 = (short) this.field2129.field7037.field6685;
        this.field2129.field7037.field6685 = var1 + 1 & 8191;
        this.field2129.field7013.method3145(this, Integer.MAX_VALUE);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lqa;J)V")
    public final void method912(class207 arg0, long arg1) {
        int var4 = super.field468 >> class272.field3786 + 12;
        int var5 = super.field479 >> class272.field3786 + 12;
        int var6 = super.field478 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class332.field4447 && var5 >= 0 && var5 < class34.field624) {
            class475 var7 = this.field2129.field7037;
            class337 var8 = this.field2129.field7039;
            class174[] var9 = class590.field8430;
            int var10 = var7.field6694;
            class622 var11 = class356.field4807[var7.field6694][var4][var5];
            if (var11 != null) {
                var10 = var11.field8970;
            }
            int var12 = var9[var10].method1104(var4, var5);
            int var13;
            if (var10 < class395.field5610 - 1) {
                var13 = var9[var10 + 1].method1104(var4, var5);
            } else {
                var13 = var12 - (8 << class272.field3786);
            }
            if (var8.field4511) {
                if (var8.field4504 == -1 && var6 > var12) {
                    this.method910();
                    return;
                }
                if (var8.field4504 >= 0 && var6 > var9[var8.field4504].method1104(var4, var5)) {
                    this.method910();
                    return;
                }
                if (var8.field4496 == -1 && var6 < var13) {
                    this.method910();
                    return;
                }
                if (var8.field4496 >= 0 && var6 < var9[var8.field4496 + 1].method1104(var4, var5)) {
                    this.method910();
                    return;
                }
            }
            if (var4 >= var7.field6692 && var4 <= var7.field6691 && var5 >= var7.field6690 && var5 <= var7.field6689 && var6 <= var12 && var6 >= var13) {
                var7.field6693.field3798.method1454(this, (byte) 115);
            } else {
                int var14;
                for (var14 = class395.field5610 - 1; var14 > 0 && var6 > var9[var14].method1104(var4, var5); --var14) {
                }
                if (var14 == 0 && var6 > var9[0].method1104(var4, var5)) {
                    this.method910();
                } else if (class395.field5610 - 1 == var14 && var9[var14].method1104(var4, var5) - var6 > 8 << class272.field3786) {
                    this.method910();
                } else {
                    class622 var15 = class356.field4807[var14][var4][var5];
                    if (var15 == null) {
                        if (var14 == 0 || class356.field4807[0][var4][var5] == null) {
                            var15 = class356.field4807[0][var4][var5] = new class622(0, var4, var5);
                        }
                        boolean var16 = class356.field4807[0][var4][var5].field8967 != null;
                        if (var14 == 3 && var16) {
                            this.method910();
                            return;
                        }
                        for (int var17 = 1; var17 <= var14; ++var17) {
                            if (class356.field4807[var17][var4][var5] == null) {
                                var15 = class356.field4807[var17][var4][var5] = new class622(var17, var4, var5);
                                if (var16) {
                                    ++var15.field8970;
                                }
                            }
                        }
                    }
                    if (var8.field4549) {
                        int var18 = super.field468 >> 12;
                        int var19 = super.field479 >> 12;
                        if (var15.field8985 != null) {
                            class611 var20 = var15.field8985.method490(false, arg0);
                            if (var20 != null && var20.method3573(var6, var18, var19, 2090313793)) {
                                this.method910();
                                return;
                            }
                        }
                        if (var15.field8982 != null) {
                            class611 var21 = var15.field8982.method490(false, arg0);
                            if (var21 != null && var21.method3573(var6, var18, var19, 2090313793)) {
                                this.method910();
                                return;
                            }
                        }
                        if (var15.field8979 != null) {
                            class611 var22 = var15.field8979.method490(false, arg0);
                            if (var22 != null && var22.method3573(var6, var18, var19, 2090313793)) {
                                this.method910();
                                return;
                            }
                        }
                        for (class559 var23 = var15.field8973; var23 != null; var23 = var23.field7736) {
                            class611 var24 = var23.field7742.method490(false, arg0);
                            if (var24 != null && var24.method3573(var6, var18, var19, 2090313793)) {
                                this.method910();
                                return;
                            }
                        }
                    }
                    if (var15.field8986 == null) {
                        var15.field8986 = new class274();
                        var15.field8971 = (byte) ((int) (arg1 & 255L));
                    } else if ((byte) ((int) (arg1 & 255L)) != var15.field8971) {
                        var15.field8986.field3798.method1460((byte) -123);
                        var15.field8986.field3803 = false;
                        var15.field8971 = (byte) ((int) (arg1 & 255L));
                    }
                    var15.field8986.field3798.method1454(this, (byte) 97);
                }
            }
        } else {
            this.method910();
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Llk;IIIIIIIIIIIZZ)V")
    public final void method913(class504 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field2129 = arg0;
        super.field468 = arg1 << 12;
        super.field478 = arg2 << 12;
        super.field479 = arg3 << 12;
        super.field480 = arg9;
        this.field2132 = this.field2133 = (short) arg8;
        super.field475 = arg10;
        super.field469 = arg11;
        super.field481 = arg13;
        this.field2137 = (short) arg4;
        this.field2136 = (short) arg5;
        this.field2130 = (short) arg6;
        this.field2134 = arg7;
        super.field473 = this.field2129.field7031.field2842;
        this.method911();
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(JI)V")
    public final void method914(long arg0, int arg1) {
        this.field2133 = (short) (this.field2133 - arg1);
        if (this.field2133 <= 0) {
            this.method910();
        } else {
            int var4 = super.field468 >> 12;
            int var5 = super.field478 >> 12;
            int var6 = super.field479 >> 12;
            class475 var7 = this.field2129.field7037;
            class337 var8 = this.field2129.field7039;
            if (var8.field4542 != 0) {
                if (this.field2132 - this.field2133 <= var8.field4560) {
                    int var9 = var8.field4507 * arg1 + (super.field480 >> 8 & 65280) + (this.field2135 >> 16 & 255);
                    int var10 = var8.field4501 * arg1 + (this.field2135 >> 8 & 255) + (super.field480 & 65280);
                    int var11 = var8.field4556 * arg1 + (super.field480 << 8 & 65280) + (this.field2135 & 255);
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
                    super.field480 &= -16777216;
                    super.field480 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field2135 &= -16777216;
                    this.field2135 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field2132 - this.field2133 <= var8.field4503) {
                    int var12 = var8.field4558 * arg1 + (super.field480 >> 16 & 65280) + (this.field2135 >> 24 & 255);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field480 &= 16777215;
                    super.field480 |= (var12 & 65280) << 16;
                    this.field2135 &= 16777215;
                    this.field2135 |= (var12 & 255) << 24;
                }
            }
            if (var8.field4527 != -1 && this.field2132 - this.field2133 <= var8.field4535) {
                this.field2134 += var8.field4524 * arg1;
            }
            if (var8.field4502 != -1 && this.field2132 - this.field2133 <= var8.field4499) {
                super.field475 += var8.field4529 * arg1;
            }
            int var13 = this.field2137;
            int var14 = this.field2136;
            int var15 = this.field2130;
            boolean var16 = false;
            if (var8.field4565 == 1) {
                int var17 = var4 - this.field2129.field7041;
                int var18 = var5 - this.field2129.field7033;
                int var19 = var6 - this.field2129.field7018;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field4498 * var20 * arg1);
                this.field2134 = (int) ((long) this.field2134 - ((long) this.field2134 * var21 >> 18));
            } else if (var8.field4565 == 2) {
                int var23 = var4 - this.field2129.field7041;
                int var24 = var5 - this.field2129.field7033;
                int var25 = var6 - this.field2129.field7018;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field4498 * var26 * arg1);
                this.field2134 = (int) ((long) this.field2134 - ((long) this.field2134 * var27 >> 28));
            }
            if (var8.field4537 != null) {
                class176 var29 = var7.field6687.field892;
                for (class176 var30 = var29.field2516; var29 != var30; var30 = var30.field2516) {
                    class192 var31 = (class192) var30;
                    class630 var32 = var31.field2717;
                    if (var32.field9219 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field4537.length; ++var34) {
                            if (var8.field4537[var34] == var32.field9229) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field2718;
                            int var36 = var5 - var31.field2728;
                            int var37 = var6 - var31.field2720;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field9217) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field2729 * var37 + var31.field2716 * var35 + var32.field9226 * var36) * 65535L / (long) (var32.field9212 * var40);
                                if (var41 >= (long) var32.field9220) {
                                    int var43 = 0;
                                    if (var32.field9227 == 1) {
                                        var43 = (var40 >> 4) * var32.field9222;
                                    } else if (var32.field9227 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field9222;
                                    }
                                    if (var32.field9209 == 0) {
                                        if (var32.field9218 == 0) {
                                            var13 += (var31.field2716 - var43) * arg1;
                                            var14 += (var32.field9226 - var43) * arg1;
                                            var15 += (var31.field2729 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field468 += (var31.field2716 - var43) * arg1;
                                            super.field478 += (var32.field9226 - var43) * arg1;
                                            super.field479 += (var31.field2729 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field9212;
                                        int var45 = (var36 << 15) / var40 * var32.field9212;
                                        int var46 = (var37 << 15) / var40 * var32.field9212;
                                        if (var32.field9218 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field468 += arg1 * var44 >> 15;
                                            super.field478 += arg1 * var45 >> 15;
                                            super.field479 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field4550 != null) {
                for (int var47 = 0; var47 < var8.field4550.length; ++var47) {
                    class192 var48 = (class192) class556.field7671.method2911((long) var8.field4550[var47], -1);
                    while (var48 != null) {
                        class630 var49 = var48.field2717;
                        int var50 = var4 - var48.field2718;
                        int var51 = var5 - var48.field2728;
                        int var52 = var6 - var48.field2720;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field9217) {
                            var48 = (class192) class556.field7671.method2909(114);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field2729 * var52 + var48.field2716 * var50 + var49.field9226 * var51) * 65535L / (long) (var49.field9212 * var55);
                            if (var56 < (long) var49.field9220) {
                                var48 = (class192) class556.field7671.method2909(125);
                            } else {
                                int var58 = 0;
                                if (var49.field9227 == 1) {
                                    var58 = (var55 >> 4) * var49.field9222;
                                } else if (var49.field9227 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field9222;
                                }
                                if (var49.field9209 == 0) {
                                    if (var49.field9218 == 0) {
                                        var13 += (var48.field2716 - var58) * arg1;
                                        var14 += (var49.field9226 - var58) * arg1;
                                        var15 += (var48.field2729 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field468 += (var48.field2716 - var58) * arg1;
                                        super.field478 += (var49.field9226 - var58) * arg1;
                                        super.field479 += (var48.field2729 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field9212;
                                    int var60 = (var51 << 15) / var55 * var49.field9212;
                                    int var61 = (var52 << 15) / var55 * var49.field9212;
                                    if (var49.field9218 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field468 += arg1 * var59 >> 15;
                                        super.field478 += arg1 * var60 >> 15;
                                        super.field479 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class192) class556.field7671.method2909(121);
                            }
                        }
                    }
                }
            }
            if (var8.field4495 != null) {
                if (var8.field4562 == null) {
                    var8.field4562 = new int[var8.field4495.length];
                    for (int var62 = 0; var62 < var8.field4495.length; ++var62) {
                        class368.method2207(var8.field4495[var62], 20919);
                        var8.field4562[var62] = ((class10) class397.field5663.method1242(0, (long) var8.field4495[var62])).field106;
                    }
                }
                for (int var63 = 0; var63 < var8.field4562.length; ++var63) {
                    class630 var64 = class176.field2521[var8.field4562[var63]];
                    if (var64.field9218 == 0) {
                        var13 += var64.field9224 * arg1;
                        var14 += var64.field9226 * arg1;
                        var15 += var64.field9211 * arg1;
                        var16 = true;
                    } else {
                        super.field468 += var64.field9224 * arg1;
                        super.field478 += var64.field9226 * arg1;
                        super.field479 += var64.field9211 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field2137 = (short) var13;
                        this.field2136 = (short) var14;
                        this.field2130 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field2134 <<= 1;
                }
            }
            super.field468 = (int) ((long) super.field468 + ((long) this.field2137 * (long) this.field2134 >> 23) * (long) arg1);
            super.field478 = (int) ((long) super.field478 + ((long) this.field2136 * (long) this.field2134 >> 23) * (long) arg1);
            super.field479 = (int) ((long) super.field479 + ((long) this.field2130 * (long) this.field2134 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Llk;IIIIIIIIIIIZZ)V")
    public class135(class504 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field2129 = arg0;
        super.field468 = arg1 << 12;
        super.field478 = arg2 << 12;
        super.field479 = arg3 << 12;
        super.field480 = arg9;
        this.field2132 = this.field2133 = (short) arg8;
        super.field475 = arg10;
        super.field469 = arg11;
        super.field481 = arg13;
        this.field2137 = (short) arg4;
        this.field2136 = (short) arg5;
        this.field2130 = (short) arg6;
        this.field2134 = arg7;
        super.field473 = this.field2129.field7031.field2842;
        this.method911();
    }
}
