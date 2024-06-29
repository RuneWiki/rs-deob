import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class290 extends class242 {

    @OriginalMember(owner = "client!hm", name = "R", descriptor = "Lvi;")
    private class319 field4249;

    @OriginalMember(owner = "client!hm", name = "Q", descriptor = "S")
    private short field4248;

    @OriginalMember(owner = "client!hm", name = "S", descriptor = "S")
    private short field4250;

    @OriginalMember(owner = "client!hm", name = "P", descriptor = "S")
    private short field4247;

    @OriginalMember(owner = "client!hm", name = "O", descriptor = "S")
    private short field4246;

    @OriginalMember(owner = "client!hm", name = "T", descriptor = "S")
    private short field4251;

    @OriginalMember(owner = "client!hm", name = "N", descriptor = "I")
    private int field4245;

    @OriginalMember(owner = "client!hm", name = "M", descriptor = "I")
    private int field4244;

    @OriginalMember(owner = "client!hm", name = "L", descriptor = "S")
    private short field4243;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(J)V")
    public final void method1939(long arg0) {
        int var3 = super.field3593 >> 19;
        int var4 = super.field3587 >> 19;
        int var5 = super.field3584 >> class401.field5798;
        if (var5 <= 0 && var5 >= -65535 && var3 >= 0 && var3 < class329.field4899 && var4 >= 0 && var4 < class380.field5590) {
            class314 var6 = this.field4249.field4698;
            class370 var7 = this.field4249.field4689;
            class378[] var8 = class215.field3069;
            int var9 = var8[var6.field4610].method1429(var3, var4);
            int var10;
            if (var6.field4610 < class204.field2870 - 1) {
                var10 = var8[var6.field4610 + 1].method1429(var3, var4);
            } else {
                var10 = var9 - 1024;
            }
            if (var7.field5368) {
                if (var7.field5415 == -1 && var5 > var9) {
                    this.method1940();
                    return;
                }
                if (var7.field5415 >= 0 && var5 > var8[var7.field5415].method1429(var3, var4)) {
                    this.method1940();
                    return;
                }
                if (var7.field5372 == -1 && var5 < var10) {
                    this.method1940();
                    return;
                }
                if (var7.field5372 >= 0 && var5 < var8[var7.field5372 + 1].method1429(var3, var4)) {
                    this.method1940();
                    return;
                }
            }
            if (var3 >= var6.field4607 && var3 <= var6.field4608 && var4 >= var6.field4613 && var4 <= var6.field4614 && var5 <= var9 && var5 >= var10) {
                var6.field4612.field5781.method2495(false, this);
            } else {
                int var11;
                for (var11 = class204.field2870 - 1; var11 > 0 && var5 > var8[var11].method1429(var3, var4); --var11) {
                }
                if (class204.field2870 - 1 == var11 && var8[var11].method1429(var3, var4) - var5 > 1024) {
                    this.method1940();
                } else {
                    class369 var12 = class178.field2530[var11][var3][var4];
                    if (var12 == null) {
                        boolean var13 = class178.field2530[0][var3][var4].field5351 != null;
                        if (var11 == 3 && var13) {
                            this.method1940();
                            return;
                        }
                        for (int var14 = 1; var14 <= var11; ++var14) {
                            if (class178.field2530[var14][var3][var4] == null) {
                                var12 = class178.field2530[var14][var3][var4] = new class369(var14, var3, var4);
                                if (var13) {
                                    ++var12.field5352;
                                }
                            }
                        }
                    }
                    if (var12.field5339 == null) {
                        var12.field5339 = new class400();
                        var12.field5343 = (byte) ((int) (arg0 & 255L));
                    } else if ((byte) ((int) (arg0 & 255L)) != var12.field5343) {
                        var12.field5339 = new class400();
                        var12.field5343 = (byte) ((int) (arg0 & 255L));
                    }
                    var12.field5339.field5781.method2495(false, this);
                }
            }
        } else {
            this.method1940();
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "()V")
    private final void method1940() {
        this.field4249.field4698.field4603[this.field4243] = null;
        class452.field6675[class295.field4294] = this;
        class295.field4294 = class295.field4294 + 1 & 1023;
        this.method2611(-1);
        this.method332((byte) -105);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lvi;IIIIIIIIIIIZ)V")
    public final void method1941(class319 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        this.field4249 = arg0;
        super.field3593 = arg1 << class401.field5798;
        super.field3584 = arg2 << class401.field5798;
        super.field3587 = arg3 << class401.field5798;
        super.field3597 = arg9;
        this.field4250 = this.field4248 = (short) arg8;
        super.field3592 = arg10;
        super.field3585 = arg11;
        this.field4247 = (short) arg4;
        this.field4246 = (short) arg5;
        this.field4251 = (short) arg6;
        this.field4245 = arg7;
        super.field3586 = this.field4249.field4683.field1818;
        this.method1943();
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(JI)V")
    public final void method1942(long arg0, int arg1) {
        this.field4248 = (short) (this.field4248 - arg1);
        if (this.field4248 <= 0) {
            this.method1940();
        } else {
            int var4 = super.field3593 >> class401.field5798;
            int var5 = super.field3584 >> class401.field5798;
            int var6 = super.field3587 >> class401.field5798;
            class314 var7 = this.field4249.field4698;
            class370 var8 = this.field4249.field4689;
            if (var8.field5356 != 0) {
                if (this.field4250 - this.field4248 <= var8.field5377) {
                    int var9 = var8.field5370 * arg1 + (this.field4244 >> 16 & 255) + (super.field3597 >> 8 & 65280);
                    int var10 = var8.field5419 * arg1 + (this.field4244 >> 8 & 255) + (super.field3597 & 65280);
                    int var11 = var8.field5391 * arg1 + (super.field3597 << 8 & 65280) + (this.field4244 & 255);
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
                    super.field3597 &= -16777216;
                    super.field3597 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field4244 &= -16777216;
                    this.field4244 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field4250 - this.field4248 <= var8.field5366) {
                    int var12 = var8.field5411 * arg1 + (this.field4244 >> 24 & 255) + (super.field3597 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field3597 &= 16777215;
                    super.field3597 |= (var12 & 65280) << 16;
                    this.field4244 &= 16777215;
                    this.field4244 |= (var12 & 255) << 24;
                }
            }
            if (var8.field5417 != -1 && this.field4250 - this.field4248 <= var8.field5394) {
                this.field4245 += var8.field5382 * arg1;
            }
            if (var8.field5376 != -1 && this.field4250 - this.field4248 <= var8.field5362) {
                super.field3592 += var8.field5375 * arg1;
            }
            int var13 = this.field4247;
            int var14 = this.field4246;
            int var15 = this.field4251;
            boolean var16 = false;
            if (var8.field5380 == 1) {
                int var17 = var4 - this.field4249.field4706;
                int var18 = var5 - this.field4249.field4678;
                int var19 = var6 - this.field4249.field4684;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field5397 * var20 * arg1);
                this.field4245 = (int) ((long) this.field4245 - ((long) this.field4245 * var21 >> 18));
            } else if (var8.field5380 == 2) {
                int var23 = var4 - this.field4249.field4706;
                int var24 = var5 - this.field4249.field4678;
                int var25 = var6 - this.field4249.field4684;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field5397 * var26 * arg1);
                this.field4245 = (int) ((long) this.field4245 - ((long) this.field4245 * var27 >> 28));
            }
            if (var8.field5396 != null) {
                class264 var29 = var7.field4606.field5735;
                for (class264 var30 = var29.field3906; var29 != var30; var30 = var30.field3906) {
                    class266 var31 = (class266) var30;
                    class281 var32 = var31.field3953;
                    if (var32.field4120 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field5396.length; ++var34) {
                            if (var8.field5396[var34] == var32.field4121) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field3949;
                            int var36 = var5 - var31.field3943;
                            int var37 = var6 - var31.field3952;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field4123) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field3948 * var37 + var31.field3950 * var35 + var32.field4138 * var36) * 65535L / (long) (var32.field4130 * var40);
                                if (var41 >= (long) var32.field4118) {
                                    int var43 = 0;
                                    if (var32.field4128 == 1) {
                                        var43 = (var40 >> 4) * var32.field4139;
                                    } else if (var32.field4128 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field4139;
                                    }
                                    if (var32.field4134 == 0) {
                                        if (var32.field4133 == 0) {
                                            var13 += (var31.field3950 - var43) * arg1;
                                            var14 += (var32.field4138 - var43) * arg1;
                                            var15 += (var31.field3948 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field3593 += (var31.field3950 - var43) * arg1;
                                            super.field3584 += (var32.field4138 - var43) * arg1;
                                            super.field3587 += (var31.field3948 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field4130;
                                        int var45 = (var36 << 15) / var40 * var32.field4130;
                                        int var46 = (var37 << 15) / var40 * var32.field4130;
                                        if (var32.field4133 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field3593 += arg1 * var44 >> 15;
                                            super.field3584 += arg1 * var45 >> 15;
                                            super.field3587 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field5427 != null) {
                for (int var47 = 0; var47 < var8.field5427.length; ++var47) {
                    class266 var48 = (class266) class31.field430.method318((long) var8.field5427[var47], 123);
                    while (var48 != null) {
                        class281 var49 = var48.field3953;
                        int var50 = var4 - var48.field3949;
                        int var51 = var5 - var48.field3943;
                        int var52 = var6 - var48.field3952;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field4123) {
                            var48 = (class266) class31.field430.method314(-1);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field3948 * var52 + var48.field3950 * var50 + var49.field4138 * var51) * 65535L / (long) (var49.field4130 * var55);
                            if (var56 < (long) var49.field4118) {
                                var48 = (class266) class31.field430.method314(-1);
                            } else {
                                int var58 = 0;
                                if (var49.field4128 == 1) {
                                    var58 = (var55 >> 4) * var49.field4139;
                                } else if (var49.field4128 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field4139;
                                }
                                if (var49.field4134 == 0) {
                                    if (var49.field4133 == 0) {
                                        var13 += (var48.field3950 - var58) * arg1;
                                        var14 += (var49.field4138 - var58) * arg1;
                                        var15 += (var48.field3948 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field3593 += (var48.field3950 - var58) * arg1;
                                        super.field3584 += (var49.field4138 - var58) * arg1;
                                        super.field3587 += (var48.field3948 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field4130;
                                    int var60 = (var51 << 15) / var55 * var49.field4130;
                                    int var61 = (var52 << 15) / var55 * var49.field4130;
                                    if (var49.field4133 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field3593 += arg1 * var59 >> 15;
                                        super.field3584 += arg1 * var60 >> 15;
                                        super.field3587 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class266) class31.field430.method314(-1);
                            }
                        }
                    }
                }
            }
            if (var8.field5409 != null) {
                if (var8.field5374 == null) {
                    var8.field5374 = new int[var8.field5409.length];
                    for (int var62 = 0; var62 < var8.field5409.length; ++var62) {
                        class152.method1041(0, var8.field5409[var62]);
                        var8.field5374[var62] = ((class13) class271.field4014.method609((long) var8.field5409[var62], 86)).field214;
                    }
                }
                for (int var63 = 0; var63 < var8.field5374.length; ++var63) {
                    class281 var64 = class244.field3620[var8.field5374[var63]];
                    if (var64.field4133 == 0) {
                        var13 += var64.field4127 * arg1;
                        var14 += var64.field4138 * arg1;
                        var15 += var64.field4135 * arg1;
                        var16 = true;
                    } else {
                        super.field3593 += var64.field4127 * arg1;
                        super.field3584 += var64.field4138 * arg1;
                        super.field3587 += var64.field4135 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field4247 = (short) var13;
                        this.field4246 = (short) var14;
                        this.field4251 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field4245 <<= 1;
                }
            }
            super.field3593 = (int) ((long) super.field3593 + ((long) this.field4247 * (long) this.field4245 >> 23) * (long) arg1);
            super.field3584 = (int) ((long) super.field3584 + ((long) this.field4246 * (long) this.field4245 >> 23) * (long) arg1);
            super.field3587 = (int) ((long) super.field3587 + ((long) this.field4251 * (long) this.field4245 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "()V")
    private final void method1943() {
        int var1 = this.field4249.field4698.field4602;
        if (this.field4249.field4698.field4603[var1] != null) {
            this.field4249.field4698.field4603[var1].method1940();
        }
        this.field4249.field4698.field4603[var1] = this;
        this.field4243 = (short) this.field4249.field4698.field4602;
        this.field4249.field4698.field4602 = var1 + 1 & 8191;
        this.field4249.field4693.method2024(10, this);
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lvi;IIIIIIIIIIIZ)V")
    public class290(class319 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        this.field4249 = arg0;
        super.field3593 = arg1 << class401.field5798;
        super.field3584 = arg2 << class401.field5798;
        super.field3587 = arg3 << class401.field5798;
        super.field3597 = arg9;
        this.field4250 = this.field4248 = (short) arg8;
        super.field3592 = arg10;
        super.field3585 = arg11;
        this.field4247 = (short) arg4;
        this.field4246 = (short) arg5;
        this.field4251 = (short) arg6;
        this.field4245 = arg7;
        super.field3586 = this.field4249.field4683.field1818;
        this.method1943();
    }
}
