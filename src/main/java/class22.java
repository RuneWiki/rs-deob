import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class22 extends class521 {

    @OriginalMember(owner = "client!fo", name = "L", descriptor = "Lrba;")
    private class65 field316;

    @OriginalMember(owner = "client!fo", name = "N", descriptor = "S")
    private short field318;

    @OriginalMember(owner = "client!fo", name = "G", descriptor = "S")
    private short field311;

    @OriginalMember(owner = "client!fo", name = "H", descriptor = "S")
    private short field312;

    @OriginalMember(owner = "client!fo", name = "J", descriptor = "S")
    private short field314;

    @OriginalMember(owner = "client!fo", name = "I", descriptor = "S")
    private short field313;

    @OriginalMember(owner = "client!fo", name = "M", descriptor = "I")
    private int field317;

    @OriginalMember(owner = "client!fo", name = "K", descriptor = "I")
    private int field315;

    @OriginalMember(owner = "client!fo", name = "O", descriptor = "S")
    private short field319;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "()V")
    private final void method231() {
        int var1 = this.field316.field904.field8330;
        if (this.field316.field904.field8335[var1] != null) {
            this.field316.field904.field8335[var1].method234();
        }
        this.field316.field904.field8335[var1] = this;
        this.field319 = (short) this.field316.field904.field8330;
        this.field316.field904.field8330 = var1 + 1 & 8191;
        this.field316.field913.method952((byte) 112, this);
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lqa;J)V")
    public final void method232(class167 arg0, long arg1) {
        int var4 = super.field7240 >> class162.field2401 + 12;
        int var5 = super.field7246 >> class162.field2401 + 12;
        int var6 = super.field7242 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class362.field5145 && var5 >= 0 && var5 < class305.field4400) {
            class585 var7 = this.field316.field904;
            class48 var8 = this.field316.field920;
            class542[] var9 = class88.field1594;
            int var10 = var7.field8344;
            class184 var11 = class277.field4051[var7.field8344][var4][var5];
            if (var11 != null) {
                var10 = var11.field2668;
            }
            int var12 = var9[var10].method694(var4, var5);
            int var13;
            if (var10 < class146.field2246 - 1) {
                var13 = var9[var10 + 1].method694(var4, var5);
            } else {
                var13 = var12 - (8 << class162.field2401);
            }
            if (var8.field715) {
                if (var8.field690 == -1 && var6 > var12) {
                    this.method234();
                    return;
                }
                if (var8.field690 >= 0 && var6 > var9[var8.field690].method694(var4, var5)) {
                    this.method234();
                    return;
                }
                if (var8.field725 == -1 && var6 < var13) {
                    this.method234();
                    return;
                }
                if (var8.field725 >= 0 && var6 < var9[var8.field725 + 1].method694(var4, var5)) {
                    this.method234();
                    return;
                }
            }
            if (var4 >= var7.field8338 && var4 <= var7.field8339 && var5 >= var7.field8340 && var5 <= var7.field8342 && var6 <= var12 && var6 >= var13) {
                var7.field8345.field8719.method2801(this, (byte) -38);
            } else {
                int var14;
                for (var14 = class146.field2246 - 1; var14 > 0 && var6 > var9[var14].method694(var4, var5); --var14) {
                }
                if (var14 == 0 && var6 > var9[0].method694(var4, var5)) {
                    this.method234();
                } else if (class146.field2246 - 1 == var14 && var9[var14].method694(var4, var5) - var6 > 8 << class162.field2401) {
                    this.method234();
                } else {
                    class184 var15 = class277.field4051[var14][var4][var5];
                    if (var15 == null) {
                        if (var14 == 0 || class277.field4051[0][var4][var5] == null) {
                            var15 = class277.field4051[0][var4][var5] = new class184(0, var4, var5);
                        }
                        boolean var16 = class277.field4051[0][var4][var5].field2667 != null;
                        if (var14 == 3 && var16) {
                            this.method234();
                            return;
                        }
                        for (int var17 = 1; var17 <= var14; ++var17) {
                            if (class277.field4051[var17][var4][var5] == null) {
                                var15 = class277.field4051[var17][var4][var5] = new class184(var17, var4, var5);
                                if (var16) {
                                    ++var15.field2668;
                                }
                            }
                        }
                    }
                    if (var8.field707) {
                        int var18 = super.field7240 >> 12;
                        int var19 = super.field7246 >> 12;
                        if (var15.field2669 != null) {
                            class120 var20 = var15.field2669.method260(-101, arg0);
                            if (var20 != null && var20.method975(var18, var6, 122, var19)) {
                                this.method234();
                                return;
                            }
                        }
                        if (var15.field2653 != null) {
                            class120 var21 = var15.field2653.method260(-81, arg0);
                            if (var21 != null && var21.method975(var18, var6, 117, var19)) {
                                this.method234();
                                return;
                            }
                        }
                        if (var15.field2662 != null) {
                            class120 var22 = var15.field2662.method260(-95, arg0);
                            if (var22 != null && var22.method975(var18, var6, 124, var19)) {
                                this.method234();
                                return;
                            }
                        }
                        for (class277 var23 = var15.field2675; var23 != null; var23 = var23.field4045) {
                            class120 var24 = var23.field4044.method260(-104, arg0);
                            if (var24 != null && var24.method975(var18, var6, 3, var19)) {
                                this.method234();
                                return;
                            }
                        }
                    }
                    if (var15.field2673 == null) {
                        var15.field2673 = new class616();
                        var15.field2660 = (byte) ((int) (arg1 & 255L));
                    } else if ((byte) ((int) (arg1 & 255L)) != var15.field2660) {
                        var15.field2673.field8719.method2803(27385);
                        var15.field2673.field8726 = false;
                        var15.field2660 = (byte) ((int) (arg1 & 255L));
                    }
                    var15.field2673.field8719.method2801(this, (byte) -55);
                }
            }
        } else {
            this.method234();
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lrba;IIIIIIIIIIIZZ)V")
    public final void method233(class65 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field316 = arg0;
        super.field7240 = arg1 << 12;
        super.field7242 = arg2 << 12;
        super.field7246 = arg3 << 12;
        super.field7235 = arg9;
        this.field311 = this.field318 = (short) arg8;
        super.field7237 = arg10;
        super.field7243 = arg11;
        super.field7245 = arg13;
        this.field312 = (short) arg4;
        this.field314 = (short) arg5;
        this.field313 = (short) arg6;
        this.field317 = arg7;
        super.field7244 = this.field316.field925.field8483;
        this.method231();
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "()V")
    public final void method234() {
        this.field316.field904.field8335[this.field319] = null;
        class358.field5088[class645.field9382] = this;
        class645.field9382 = class645.field9382 + 1 & 1023;
        this.method2753(0);
        this.method2036(true);
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(JI)V")
    public final void method235(long arg0, int arg1) {
        this.field318 = (short) (this.field318 - arg1);
        if (this.field318 <= 0) {
            this.method234();
        } else {
            int var4 = super.field7240 >> 12;
            int var5 = super.field7242 >> 12;
            int var6 = super.field7246 >> 12;
            class585 var7 = this.field316.field904;
            class48 var8 = this.field316.field920;
            if (var8.field732 != 0) {
                if (this.field311 - this.field318 <= var8.field710) {
                    int var9 = var8.field737 * arg1 + (super.field7235 >> 8 & 65280) + (this.field315 >> 16 & 255);
                    int var10 = var8.field716 * arg1 + (this.field315 >> 8 & 255) + (super.field7235 & 65280);
                    int var11 = var8.field684 * arg1 + (super.field7235 << 8 & 65280) + (this.field315 & 255);
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
                    super.field7235 &= -16777216;
                    super.field7235 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field315 &= -16777216;
                    this.field315 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field311 - this.field318 <= var8.field671) {
                    int var12 = var8.field685 * arg1 + (super.field7235 >> 16 & 65280) + (this.field315 >> 24 & 255);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field7235 &= 16777215;
                    super.field7235 |= (var12 & 65280) << 16;
                    this.field315 &= 16777215;
                    this.field315 |= (var12 & 255) << 24;
                }
            }
            if (var8.field675 != -1 && this.field311 - this.field318 <= var8.field704) {
                this.field317 += var8.field673 * arg1;
            }
            if (var8.field691 != -1 && this.field311 - this.field318 <= var8.field687) {
                super.field7237 += var8.field723 * arg1;
            }
            int var13 = this.field312;
            int var14 = this.field314;
            int var15 = this.field313;
            boolean var16 = false;
            if (var8.field674 == 1) {
                int var17 = var4 - this.field316.field896;
                int var18 = var5 - this.field316.field927;
                int var19 = var6 - this.field316.field906;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field722 * var20 * arg1);
                this.field317 = (int) ((long) this.field317 - ((long) this.field317 * var21 >> 18));
            } else if (var8.field674 == 2) {
                int var23 = var4 - this.field316.field896;
                int var24 = var5 - this.field316.field927;
                int var25 = var6 - this.field316.field906;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field722 * var26 * arg1);
                this.field317 = (int) ((long) this.field317 - ((long) this.field317 * var27 >> 28));
            }
            if (var8.field670 != null) {
                class108 var29 = var7.field8336.field659;
                for (class108 var30 = var29.field1802; var29 != var30; var30 = var30.field1802) {
                    class208 var31 = (class208) var30;
                    class251 var32 = var31.field2939;
                    if (var32.field3664 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field670.length; ++var34) {
                            if (var8.field670[var34] == var32.field3665) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field2938;
                            int var36 = var5 - var31.field2937;
                            int var37 = var6 - var31.field2935;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field3669) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field2936 * var37 + var31.field2942 * var35 + var32.field3676 * var36) * 65535L / (long) (var32.field3668 * var40);
                                if (var41 >= (long) var32.field3681) {
                                    int var43 = 0;
                                    if (var32.field3679 == 1) {
                                        var43 = (var40 >> 4) * var32.field3666;
                                    } else if (var32.field3679 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field3666;
                                    }
                                    if (var32.field3672 == 0) {
                                        if (var32.field3675 == 0) {
                                            var13 += (var31.field2942 - var43) * arg1;
                                            var14 += (var32.field3676 - var43) * arg1;
                                            var15 += (var31.field2936 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field7240 += (var31.field2942 - var43) * arg1;
                                            super.field7242 += (var32.field3676 - var43) * arg1;
                                            super.field7246 += (var31.field2936 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field3668;
                                        int var45 = (var36 << 15) / var40 * var32.field3668;
                                        int var46 = (var37 << 15) / var40 * var32.field3668;
                                        if (var32.field3675 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field7240 += arg1 * var44 >> 15;
                                            super.field7242 += arg1 * var45 >> 15;
                                            super.field7246 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field709 != null) {
                for (int var47 = 0; var47 < var8.field709.length; ++var47) {
                    class208 var48 = (class208) class210.field2968.method2467((long) var8.field709[var47], 108);
                    while (var48 != null) {
                        class251 var49 = var48.field2939;
                        int var50 = var4 - var48.field2938;
                        int var51 = var5 - var48.field2937;
                        int var52 = var6 - var48.field2935;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field3669) {
                            var48 = (class208) class210.field2968.method2464(17663);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field2936 * var52 + var48.field2942 * var50 + var49.field3676 * var51) * 65535L / (long) (var49.field3668 * var55);
                            if (var56 < (long) var49.field3681) {
                                var48 = (class208) class210.field2968.method2464(17663);
                            } else {
                                int var58 = 0;
                                if (var49.field3679 == 1) {
                                    var58 = (var55 >> 4) * var49.field3666;
                                } else if (var49.field3679 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field3666;
                                }
                                if (var49.field3672 == 0) {
                                    if (var49.field3675 == 0) {
                                        var13 += (var48.field2942 - var58) * arg1;
                                        var14 += (var49.field3676 - var58) * arg1;
                                        var15 += (var48.field2936 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field7240 += (var48.field2942 - var58) * arg1;
                                        super.field7242 += (var49.field3676 - var58) * arg1;
                                        super.field7246 += (var48.field2936 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field3668;
                                    int var60 = (var51 << 15) / var55 * var49.field3668;
                                    int var61 = (var52 << 15) / var55 * var49.field3668;
                                    if (var49.field3675 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field7240 += arg1 * var59 >> 15;
                                        super.field7242 += arg1 * var60 >> 15;
                                        super.field7246 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class208) class210.field2968.method2464(17663);
                            }
                        }
                    }
                }
            }
            if (var8.field686 != null) {
                if (var8.field726 == null) {
                    var8.field726 = new int[var8.field686.length];
                    for (int var62 = 0; var62 < var8.field686.length; ++var62) {
                        class362.method2189(var8.field686[var62], true);
                        var8.field726[var62] = ((class264) class277.field4041.method740(0, (long) var8.field686[var62])).field3841;
                    }
                }
                for (int var63 = 0; var63 < var8.field726.length; ++var63) {
                    class251 var64 = class602.field8567[var8.field726[var63]];
                    if (var64.field3675 == 0) {
                        var13 += var64.field3670 * arg1;
                        var14 += var64.field3676 * arg1;
                        var15 += var64.field3662 * arg1;
                        var16 = true;
                    } else {
                        super.field7240 += var64.field3670 * arg1;
                        super.field7242 += var64.field3676 * arg1;
                        super.field7246 += var64.field3662 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field312 = (short) var13;
                        this.field314 = (short) var14;
                        this.field313 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field317 <<= 1;
                }
            }
            super.field7240 = (int) ((long) super.field7240 + ((long) this.field312 * (long) this.field317 >> 23) * (long) arg1);
            super.field7242 = (int) ((long) super.field7242 + ((long) this.field314 * (long) this.field317 >> 23) * (long) arg1);
            super.field7246 = (int) ((long) super.field7246 + ((long) this.field313 * (long) this.field317 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lrba;IIIIIIIIIIIZZ)V")
    public class22(class65 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field316 = arg0;
        super.field7240 = arg1 << 12;
        super.field7242 = arg2 << 12;
        super.field7246 = arg3 << 12;
        super.field7235 = arg9;
        this.field311 = this.field318 = (short) arg8;
        super.field7237 = arg10;
        super.field7243 = arg11;
        super.field7245 = arg13;
        this.field312 = (short) arg4;
        this.field314 = (short) arg5;
        this.field313 = (short) arg6;
        this.field317 = arg7;
        super.field7244 = this.field316.field925.field8483;
        this.method231();
    }
}
