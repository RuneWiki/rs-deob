import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class59 extends class52 {

    @OriginalMember(owner = "client!bl", name = "F", descriptor = "Lth;")
    private class184 field739;

    @OriginalMember(owner = "client!bl", name = "E", descriptor = "S")
    private short field738;

    @OriginalMember(owner = "client!bl", name = "J", descriptor = "S")
    private short field743;

    @OriginalMember(owner = "client!bl", name = "D", descriptor = "S")
    private short field737;

    @OriginalMember(owner = "client!bl", name = "G", descriptor = "S")
    private short field740;

    @OriginalMember(owner = "client!bl", name = "K", descriptor = "S")
    private short field744;

    @OriginalMember(owner = "client!bl", name = "I", descriptor = "I")
    private int field742;

    @OriginalMember(owner = "client!bl", name = "H", descriptor = "I")
    private int field741;

    @OriginalMember(owner = "client!bl", name = "L", descriptor = "S")
    private short field745;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lth;IIIIIIIIIIIZ)V", line = 6)
    public final void method305(class184 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        this.field739 = arg0;
        super.field678 = arg1 << class92.field1149;
        super.field674 = arg2 << class92.field1149;
        super.field675 = arg3 << class92.field1149;
        super.field684 = arg9;
        this.field743 = this.field738 = (short) arg8;
        super.field679 = arg10;
        super.field673 = arg11;
        this.field737 = (short) arg4;
        this.field740 = (short) arg5;
        this.field744 = (short) arg6;
        this.field742 = arg7;
        super.field676 = this.field739.field2398.field1454;
        this.method308();
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(J)V", line = 26)
    public final void method306(long arg0) {
        int var3 = super.field678 >> 19;
        int var4 = super.field675 >> 19;
        int var5 = super.field674 >> class92.field1149;
        if (var5 <= 0 && var5 >= -65535 && var3 >= 0 && var3 < class176.field2122 && var4 >= 0 && var4 < class225.field3116) {
            class380 var6 = this.field739.field2388;
            class217 var7 = this.field739.field2395;
            class443[] var8 = class398.field5667;
            int var9 = var8[var6.field5392].method1861(var3, var4);
            int var10;
            if (var6.field5392 < class346.field4937 - 1) {
                var10 = var8[var6.field5392 + 1].method1861(var3, var4);
            } else {
                var10 = var9 - 1024;
            }
            if (var7.field3040) {
                if (var7.field2990 == -1 && var5 > var9) {
                    this.method307();
                    return;
                }
                if (var7.field2990 >= 0 && var5 > var8[var7.field2990].method1861(var3, var4)) {
                    this.method307();
                    return;
                }
                if (var7.field3017 == -1 && var5 < var10) {
                    this.method307();
                    return;
                }
                if (var7.field3017 >= 0 && var5 < var8[var7.field3017 + 1].method1861(var3, var4)) {
                    this.method307();
                    return;
                }
            }
            if (var3 >= var6.field5388 && var3 <= var6.field5387 && var4 >= var6.field5389 && var4 <= var6.field5394 && var5 <= var9 && var5 >= var10) {
                var6.field5391.field599.method588(4096, this);
            } else {
                int var11;
                for (var11 = class346.field4937 - 1; var11 > 0 && var5 > var8[var11].method1861(var3, var4); --var11) {
                }
                if (class346.field4937 - 1 == var11 && var8[var11].method1861(var3, var4) - var5 > 1024) {
                    this.method307();
                } else {
                    class263 var12 = class293.field4356[var11][var3][var4];
                    if (var12 == null) {
                        boolean var13 = class293.field4356[0][var3][var4].field3788 != null;
                        if (var11 == 3 && var13) {
                            this.method307();
                            return;
                        }
                        for (int var14 = 1; var14 <= var11; ++var14) {
                            if (class293.field4356[var14][var3][var4] == null) {
                                var12 = class293.field4356[var14][var3][var4] = new class263(var14, var3, var4);
                                if (var13) {
                                    ++var12.field3792;
                                }
                            }
                        }
                    }
                    if (var12.field3791 == null) {
                        var12.field3791 = new class46();
                        var12.field3800 = (byte) ((int) (arg0 & 255L));
                    } else if ((byte) ((int) (arg0 & 255L)) != var12.field3800) {
                        var12.field3791 = new class46();
                        var12.field3800 = (byte) ((int) (arg0 & 255L));
                    }
                    var12.field3791.field599.method588(4096, this);
                }
            }
        } else {
            this.method307();
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "()V", line = 145)
    private final void method307() {
        this.field739.field2388.field5378[this.field745] = null;
        class28.field369[class199.field2769] = this;
        class199.field2769 = class199.field2769 + 1 & 1023;
        this.method2550(false);
        this.method1977(true);
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "()V", line = 154)
    private final void method308() {
        int var1 = this.field739.field2388.field5379;
        if (this.field739.field2388.field5378[var1] != null) {
            this.field739.field2388.field5378[var1].method307();
        }
        this.field739.field2388.field5378[var1] = this;
        this.field745 = (short) this.field739.field2388.field5379;
        this.field739.field2388.field5379 = var1 + 1 & 8191;
        this.field739.field2370.method2336(this, (byte) -56);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(JI)V", line = 164)
    public final void method309(long arg0, int arg1) {
        this.field738 = (short) (this.field738 - arg1);
        if (this.field738 <= 0) {
            this.method307();
        } else {
            int var4 = super.field678 >> class92.field1149;
            int var5 = super.field674 >> class92.field1149;
            int var6 = super.field675 >> class92.field1149;
            class380 var7 = this.field739.field2388;
            class217 var8 = this.field739.field2395;
            if (var8.field3015 != 0) {
                if (this.field743 - this.field738 <= var8.field2995) {
                    int var9 = var8.field3002 * arg1 + (this.field741 >> 16 & 255) + (super.field684 >> 8 & 65280);
                    int var10 = var8.field3008 * arg1 + (this.field741 >> 8 & 255) + (super.field684 & 65280);
                    int var11 = var8.field3038 * arg1 + (super.field684 << 8 & 65280) + (this.field741 & 255);
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
                    super.field684 &= -16777216;
                    super.field684 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field741 &= -16777216;
                    this.field741 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field743 - this.field738 <= var8.field3024) {
                    int var12 = var8.field2997 * arg1 + (this.field741 >> 24 & 255) + (super.field684 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field684 &= 16777215;
                    super.field684 |= (var12 & 65280) << 16;
                    this.field741 &= 16777215;
                    this.field741 |= (var12 & 255) << 24;
                }
            }
            if (var8.field3012 != -1 && this.field743 - this.field738 <= var8.field2991) {
                this.field742 += var8.field3009 * arg1;
            }
            if (var8.field3044 != -1 && this.field743 - this.field738 <= var8.field2989) {
                super.field679 += var8.field3027 * arg1;
            }
            int var13 = this.field737;
            int var14 = this.field740;
            int var15 = this.field744;
            boolean var16 = false;
            if (var8.field3056 == 1) {
                int var17 = var4 - this.field739.field2390;
                int var18 = var5 - this.field739.field2392;
                int var19 = var6 - this.field739.field2367;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field3043 * var20 * arg1);
                this.field742 = (int) ((long) this.field742 - ((long) this.field742 * var21 >> 18));
            } else if (var8.field3056 == 2) {
                int var23 = var4 - this.field739.field2390;
                int var24 = var5 - this.field739.field2392;
                int var25 = var6 - this.field739.field2367;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field3043 * var26 * arg1);
                this.field742 = (int) ((long) this.field742 - ((long) this.field742 * var27 >> 28));
            }
            if (var8.field3048 != null) {
                class147 var29 = var7.field5385.field1985;
                for (class147 var30 = var29.field1779; var29 != var30; var30 = var30.field1779) {
                    class53 var31 = (class53) var30;
                    class172 var32 = var31.field688;
                    if (var32.field2055 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field3048.length; ++var34) {
                            if (var8.field3048[var34] == var32.field2063) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field694;
                            int var36 = var5 - var31.field691;
                            int var37 = var6 - var31.field690;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field2069) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field693 * var37 + var31.field695 * var35 + var32.field2075 * var36) * 65535L / (long) (var32.field2058 * var40);
                                if (var41 >= (long) var32.field2059) {
                                    int var43 = 0;
                                    if (var32.field2073 == 1) {
                                        var43 = (var40 >> 4) * var32.field2060;
                                    } else if (var32.field2073 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field2060;
                                    }
                                    if (var32.field2067 == 0) {
                                        if (var32.field2061 == 0) {
                                            var13 += (var31.field695 - var43) * arg1;
                                            var14 += (var32.field2075 - var43) * arg1;
                                            var15 += (var31.field693 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field678 += (var31.field695 - var43) * arg1;
                                            super.field674 += (var32.field2075 - var43) * arg1;
                                            super.field675 += (var31.field693 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field2058;
                                        int var45 = (var36 << 15) / var40 * var32.field2058;
                                        int var46 = (var37 << 15) / var40 * var32.field2058;
                                        if (var32.field2061 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field678 += arg1 * var44 >> 15;
                                            super.field674 += arg1 * var45 >> 15;
                                            super.field675 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field3000 != null) {
                for (int var47 = 0; var47 < var8.field3000.length; ++var47) {
                    class53 var48 = (class53) class101.field1227.method2400(false, (long) var8.field3000[var47]);
                    while (var48 != null) {
                        class172 var49 = var48.field688;
                        int var50 = var4 - var48.field694;
                        int var51 = var5 - var48.field691;
                        int var52 = var6 - var48.field690;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field2069) {
                            var48 = (class53) class101.field1227.method2395(-6246);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field693 * var52 + var48.field695 * var50 + var49.field2075 * var51) * 65535L / (long) (var49.field2058 * var55);
                            if (var56 < (long) var49.field2059) {
                                var48 = (class53) class101.field1227.method2395(-6246);
                            } else {
                                int var58 = 0;
                                if (var49.field2073 == 1) {
                                    var58 = (var55 >> 4) * var49.field2060;
                                } else if (var49.field2073 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field2060;
                                }
                                if (var49.field2067 == 0) {
                                    if (var49.field2061 == 0) {
                                        var13 += (var48.field695 - var58) * arg1;
                                        var14 += (var49.field2075 - var58) * arg1;
                                        var15 += (var48.field693 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field678 += (var48.field695 - var58) * arg1;
                                        super.field674 += (var49.field2075 - var58) * arg1;
                                        super.field675 += (var48.field693 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field2058;
                                    int var60 = (var51 << 15) / var55 * var49.field2058;
                                    int var61 = (var52 << 15) / var55 * var49.field2058;
                                    if (var49.field2061 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field678 += arg1 * var59 >> 15;
                                        super.field674 += arg1 * var60 >> 15;
                                        super.field675 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class53) class101.field1227.method2395(-6246);
                            }
                        }
                    }
                }
            }
            if (var8.field3019 != null) {
                if (var8.field3051 == null) {
                    var8.field3051 = new int[var8.field3019.length];
                    for (int var62 = 0; var62 < var8.field3019.length; ++var62) {
                        class140.method664(var8.field3019[var62], (byte) -123);
                        var8.field3051[var62] = ((class363) class86.field1056.method233(-108, (long) var8.field3019[var62])).field5221;
                    }
                }
                for (int var63 = 0; var63 < var8.field3051.length; ++var63) {
                    class172 var64 = class44.field566[var8.field3051[var63]];
                    if (var64.field2061 == 0) {
                        var13 += var64.field2076 * arg1;
                        var14 += var64.field2075 * arg1;
                        var15 += var64.field2074 * arg1;
                        var16 = true;
                    } else {
                        super.field678 += var64.field2076 * arg1;
                        super.field674 += var64.field2075 * arg1;
                        super.field675 += var64.field2074 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field737 = (short) var13;
                        this.field740 = (short) var14;
                        this.field744 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field742 <<= 1;
                }
            }
            super.field678 = (int) ((long) super.field678 + ((long) this.field737 * (long) this.field742 >> 23) * (long) arg1);
            super.field674 = (int) ((long) super.field674 + ((long) this.field740 * (long) this.field742 >> 23) * (long) arg1);
            super.field675 = (int) ((long) super.field675 + ((long) this.field744 * (long) this.field742 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lth;IIIIIIIIIIIZ)V", line = 560)
    public class59(class184 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        this.field739 = arg0;
        super.field678 = arg1 << class92.field1149;
        super.field674 = arg2 << class92.field1149;
        super.field675 = arg3 << class92.field1149;
        super.field684 = arg9;
        this.field743 = this.field738 = (short) arg8;
        super.field679 = arg10;
        super.field673 = arg11;
        this.field737 = (short) arg4;
        this.field740 = (short) arg5;
        this.field744 = (short) arg6;
        this.field742 = arg7;
        super.field676 = this.field739.field2398.field1454;
        this.method308();
    }
}
