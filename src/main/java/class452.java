import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class452 extends class446 {

    @OriginalMember(owner = "client!mp", name = "J", descriptor = "Lva;")
    private class287 field6582;

    @OriginalMember(owner = "client!mp", name = "O", descriptor = "S")
    private short field6587;

    @OriginalMember(owner = "client!mp", name = "N", descriptor = "S")
    private short field6586;

    @OriginalMember(owner = "client!mp", name = "M", descriptor = "S")
    private short field6585;

    @OriginalMember(owner = "client!mp", name = "Q", descriptor = "S")
    private short field6589;

    @OriginalMember(owner = "client!mp", name = "L", descriptor = "S")
    private short field6584;

    @OriginalMember(owner = "client!mp", name = "K", descriptor = "I")
    private int field6583;

    @OriginalMember(owner = "client!mp", name = "S", descriptor = "I")
    private int field6590;

    @OriginalMember(owner = "client!mp", name = "P", descriptor = "S")
    private short field6588;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lva;IIIIIIIIIIIZ)V", line = 3)
    public final void method2824(class287 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        this.field6582 = arg0;
        super.field6432 = arg1 << class249.field3454;
        super.field6427 = arg2 << class249.field3454;
        super.field6430 = arg3 << class249.field3454;
        super.field6437 = arg9;
        this.field6586 = this.field6587 = (short) arg8;
        super.field6426 = arg10;
        super.field6431 = arg11;
        this.field6585 = (short) arg4;
        this.field6589 = (short) arg5;
        this.field6584 = (short) arg6;
        this.field6583 = arg7;
        super.field6429 = this.field6582.field3977.field1996;
        this.method2828();
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "()V", line = 25)
    private final void method2825() {
        this.field6582.field3955.field2131[this.field6588] = null;
        class207.field2794[class97.field1486] = this;
        class97.field1486 = class97.field1486 + 1 & 1023;
        this.method2552(-1);
        this.method1928(42);
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(J)V", line = 33)
    public final void method2826(long arg0) {
        int var3 = super.field6432 >> 19;
        int var4 = super.field6430 >> 19;
        int var5 = super.field6427 >> class249.field3454;
        if (var5 <= 0 && var5 >= -65535 && var3 >= 0 && var3 < class386.field5629 && var4 >= 0 && var4 < class371.field5311) {
            class147 var6 = this.field6582.field3955;
            class97 var7 = this.field6582.field3968;
            class156[] var8 = class249.field3456;
            int var9 = var8[var6.field2145].method275(var3, var4);
            int var10;
            if (var6.field2145 < 3) {
                var10 = var8[var6.field2145 + 1].method275(var3, var4);
            } else {
                var10 = var9 - 1024;
            }
            if (var7.field1498) {
                if (var7.field1483 == -1 && var5 > var9) {
                    this.method2825();
                    return;
                }
                if (var7.field1483 >= 0 && var5 > var8[var7.field1483].method275(var3, var4)) {
                    this.method2825();
                    return;
                }
                if (var7.field1504 == -1 && var5 < var10) {
                    this.method2825();
                    return;
                }
                if (var7.field1504 >= 0 && var5 < var8[var7.field1504 + 1].method275(var3, var4)) {
                    this.method2825();
                    return;
                }
            }
            if (var3 >= var6.field2144 && var3 <= var6.field2142 && var4 >= var6.field2139 && var4 <= var6.field2142 && var5 <= var9 && var5 >= var10) {
                var6.field2143.field3559.method2768(this, (byte) 123);
            } else {
                byte var11 = 3;
                if (var5 > var8[1].method275(var3, var4)) {
                    var11 = 0;
                } else if (var5 > var8[2].method275(var3, var4)) {
                    var11 = 1;
                } else if (var5 > var8[3].method275(var3, var4)) {
                    var11 = 2;
                } else if (var5 < var8[3].method275(var3, var4) - 1024) {
                    this.method2825();
                    return;
                }
                class142 var12 = class5.field79[var11][var3][var4];
                if (var12 == null) {
                    boolean var13 = class5.field79[0][var3][var4].field2041 != null;
                    if (var11 == 3 && var13) {
                        this.method2825();
                        return;
                    }
                    for (int var14 = 1; var14 <= var11; ++var14) {
                        if (class5.field79[var14][var3][var4] == null) {
                            var12 = class5.field79[var14][var3][var4] = new class142(var14, var3, var4);
                            if (var13) {
                                ++var12.field2053;
                            }
                        }
                    }
                }
                if (var12.field2051 == null) {
                    var12.field2051 = new class260();
                    var12.field2039 = (byte) ((int) (arg0 & 255L));
                } else if ((byte) ((int) (arg0 & 255L)) != var12.field2039) {
                    var12.field2051 = new class260();
                    var12.field2039 = (byte) ((int) (arg0 & 255L));
                }
                var12.field2051.field3559.method2768(this, (byte) 123);
            }
        } else {
            this.method2825();
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(JI)V", line = 163)
    public final void method2827(long arg0, int arg1) {
        this.field6587 = (short) (this.field6587 - arg1);
        if (this.field6587 <= 0) {
            this.method2825();
        } else {
            int var4 = super.field6432 >> class249.field3454;
            int var5 = super.field6427 >> class249.field3454;
            int var6 = super.field6430 >> class249.field3454;
            class147 var7 = this.field6582.field3955;
            class97 var8 = this.field6582.field3968;
            if (var8.field1441 != 0) {
                if (this.field6586 - this.field6587 <= var8.field1474) {
                    int var9 = var8.field1445 * arg1 + (this.field6590 >> 16 & 255) + (super.field6437 >> 8 & 65280);
                    int var10 = var8.field1461 * arg1 + (this.field6590 >> 8 & 255) + (super.field6437 & 65280);
                    int var11 = var8.field1489 * arg1 + (super.field6437 << 8 & 65280) + (this.field6590 & 255);
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
                    super.field6437 &= -16777216;
                    super.field6437 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field6590 &= -16777216;
                    this.field6590 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field6586 - this.field6587 <= var8.field1502) {
                    int var12 = var8.field1465 * arg1 + (this.field6590 >> 24 & 255) + (super.field6437 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field6437 &= 16777215;
                    super.field6437 |= (var12 & 65280) << 16;
                    this.field6590 &= 16777215;
                    this.field6590 |= (var12 & 255) << 24;
                }
            }
            if (var8.field1501 != -1 && this.field6586 - this.field6587 <= var8.field1479) {
                this.field6583 += var8.field1432 * arg1;
            }
            if (var8.field1448 != -1 && this.field6586 - this.field6587 <= var8.field1430) {
                super.field6426 += var8.field1480 * arg1;
            }
            int var13 = this.field6585;
            int var14 = this.field6589;
            int var15 = this.field6584;
            boolean var16 = false;
            if (var8.field1484 == 1) {
                int var17 = var4 - this.field6582.field3975;
                int var18 = var5 - this.field6582.field3987;
                int var19 = var6 - this.field6582.field3983;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field1462 * var20 * arg1);
                this.field6583 = (int) ((long) this.field6583 - ((long) this.field6583 * var21 >> 18));
            } else if (var8.field1484 == 2) {
                int var23 = var4 - this.field6582.field3975;
                int var24 = var5 - this.field6582.field3987;
                int var25 = var6 - this.field6582.field3983;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field1462 * var26 * arg1);
                this.field6583 = (int) ((long) this.field6583 - ((long) this.field6583 * var27 >> 28));
            }
            if (var8.field1476 != null) {
                class376 var29 = var7.field2137.field2720;
                for (class376 var30 = var29.field5365; var29 != var30; var30 = var30.field5365) {
                    class157 var31 = (class157) var30;
                    class160 var32 = var31.field2220;
                    if (var32.field2252 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field1476.length; ++var34) {
                            if (var8.field1476[var34] == var32.field2261) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field2223;
                            int var36 = var5 - var31.field2225;
                            int var37 = var6 - var31.field2233;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field2258) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field2219 * var37 + var31.field2226 * var35 + var32.field2246 * var36) * 65535L / (long) (var32.field2251 * var40);
                                if (var41 >= (long) var32.field2247) {
                                    int var43 = 0;
                                    if (var32.field2263 == 1) {
                                        var43 = (var40 >> 4) * var32.field2243;
                                    } else if (var32.field2263 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field2243;
                                    }
                                    if (var32.field2253 == 0) {
                                        if (var32.field2259 == 0) {
                                            var13 += (var31.field2226 - var43) * arg1;
                                            var14 += (var32.field2246 - var43) * arg1;
                                            var15 += (var31.field2219 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field6432 += (var31.field2226 - var43) * arg1;
                                            super.field6427 += (var32.field2246 - var43) * arg1;
                                            super.field6430 += (var31.field2219 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field2251;
                                        int var45 = (var36 << 15) / var40 * var32.field2251;
                                        int var46 = (var37 << 15) / var40 * var32.field2251;
                                        if (var32.field2259 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field6432 += arg1 * var44 >> 15;
                                            super.field6427 += arg1 * var45 >> 15;
                                            super.field6430 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field1440 != null) {
                for (int var47 = 0; var47 < var8.field1440.length; ++var47) {
                    class157 var48 = (class157) class398.field5816.method948(1, (long) var8.field1440[var47]);
                    while (var48 != null) {
                        class160 var49 = var48.field2220;
                        int var50 = var4 - var48.field2223;
                        int var51 = var5 - var48.field2225;
                        int var52 = var6 - var48.field2233;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field2258) {
                            var48 = (class157) class398.field5816.method952((byte) 30);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field2219 * var52 + var48.field2226 * var50 + var49.field2246 * var51) * 65535L / (long) (var49.field2251 * var55);
                            if (var56 < (long) var49.field2247) {
                                var48 = (class157) class398.field5816.method952((byte) 30);
                            } else {
                                int var58 = 0;
                                if (var49.field2263 == 1) {
                                    var58 = (var55 >> 4) * var49.field2243;
                                } else if (var49.field2263 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field2243;
                                }
                                if (var49.field2253 == 0) {
                                    if (var49.field2259 == 0) {
                                        var13 += (var48.field2226 - var58) * arg1;
                                        var14 += (var49.field2246 - var58) * arg1;
                                        var15 += (var48.field2219 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field6432 += (var48.field2226 - var58) * arg1;
                                        super.field6427 += (var49.field2246 - var58) * arg1;
                                        super.field6430 += (var48.field2219 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field2251;
                                    int var60 = (var51 << 15) / var55 * var49.field2251;
                                    int var61 = (var52 << 15) / var55 * var49.field2251;
                                    if (var49.field2259 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field6432 += arg1 * var59 >> 15;
                                        super.field6427 += arg1 * var60 >> 15;
                                        super.field6430 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class157) class398.field5816.method952((byte) 30);
                            }
                        }
                    }
                }
            }
            if (var8.field1452 != null) {
                if (var8.field1453 == null) {
                    var8.field1453 = new int[var8.field1452.length];
                    for (int var62 = 0; var62 < var8.field1452.length; ++var62) {
                        class54.method368(var8.field1452[var62], (byte) 109);
                        var8.field1453[var62] = ((class23) class426.field6116.method1412((byte) -54, (long) var8.field1452[var62])).field316;
                    }
                }
                for (int var63 = 0; var63 < var8.field1453.length; ++var63) {
                    class160 var64 = class450.field6526[var8.field1453[var63]];
                    if (var64.field2259 == 0) {
                        var13 += var64.field2260 * arg1;
                        var14 += var64.field2246 * arg1;
                        var15 += var64.field2254 * arg1;
                        var16 = true;
                    } else {
                        super.field6432 += var64.field2260 * arg1;
                        super.field6427 += var64.field2246 * arg1;
                        super.field6430 += var64.field2254 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field6585 = (short) var13;
                        this.field6589 = (short) var14;
                        this.field6584 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field6583 <<= 1;
                }
            }
            super.field6432 = (int) ((long) super.field6432 + ((long) this.field6585 * (long) this.field6583 >> 23) * (long) arg1);
            super.field6427 = (int) ((long) super.field6427 + ((long) this.field6589 * (long) this.field6583 >> 23) * (long) arg1);
            super.field6430 = (int) ((long) super.field6430 + ((long) this.field6584 * (long) this.field6583 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "()V", line = 558)
    private final void method2828() {
        int var1 = this.field6582.field3955.field2136;
        if (this.field6582.field3955.field2131[var1] != null) {
            this.field6582.field3955.field2131[var1].method2825();
        }
        this.field6582.field3955.field2131[var1] = this;
        this.field6588 = (short) this.field6582.field3955.field2136;
        this.field6582.field3955.field2136 = var1 + 1 & 8191;
        this.field6582.field3957.method2310(this, -12918);
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Lva;IIIIIIIIIIIZ)V", line = 569)
    public class452(class287 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        this.field6582 = arg0;
        super.field6432 = arg1 << class249.field3454;
        super.field6427 = arg2 << class249.field3454;
        super.field6430 = arg3 << class249.field3454;
        super.field6437 = arg9;
        this.field6586 = this.field6587 = (short) arg8;
        super.field6426 = arg10;
        super.field6431 = arg11;
        this.field6585 = (short) arg4;
        this.field6589 = (short) arg5;
        this.field6584 = (short) arg6;
        this.field6583 = arg7;
        super.field6429 = this.field6582.field3977.field1996;
        this.method2828();
    }
}
