import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class370 extends class27 {

    @OriginalMember(owner = "client!hq", name = "J", descriptor = "Lmq;")
    private class53 field5405;

    @OriginalMember(owner = "client!hq", name = "M", descriptor = "S")
    private short field5408;

    @OriginalMember(owner = "client!hq", name = "N", descriptor = "S")
    private short field5409;

    @OriginalMember(owner = "client!hq", name = "H", descriptor = "S")
    private short field5403;

    @OriginalMember(owner = "client!hq", name = "F", descriptor = "S")
    private short field5401;

    @OriginalMember(owner = "client!hq", name = "G", descriptor = "S")
    private short field5402;

    @OriginalMember(owner = "client!hq", name = "K", descriptor = "I")
    private int field5406;

    @OriginalMember(owner = "client!hq", name = "I", descriptor = "I")
    private int field5404;

    @OriginalMember(owner = "client!hq", name = "L", descriptor = "S")
    private short field5407;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "()V")
    private final void method2225() {
        this.field5405.field696.field4989[this.field5407] = null;
        class6.field66[class414.field6157] = this;
        class414.field6157 = class414.field6157 + 1 & 1023;
        this.method2759((byte) -25);
        this.method1872((byte) -70);
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(J)V")
    public final void method2226(long arg0) {
        int var3 = super.field354 >> 19;
        int var4 = super.field353 >> 19;
        int var5 = super.field355 >> class150.field2075;
        if (var5 <= 0 && var5 >= -65535 && var3 >= 0 && var3 < class275.field4206 && var4 >= 0 && var4 < class265.field4044) {
            class336 var6 = this.field5405.field696;
            class192 var7 = this.field5405.field697;
            class143[] var8 = class307.field4638;
            int var9 = var8[var6.field5003].method92(var3, var4);
            int var10;
            if (var6.field5003 < class56.field750 - 1) {
                var10 = var8[var6.field5003 + 1].method92(var3, var4);
            } else {
                var10 = var9 - 1024;
            }
            if (var7.field2870) {
                if (var7.field2885 == -1 && var5 > var9) {
                    this.method2225();
                    return;
                }
                if (var7.field2885 >= 0 && var5 > var8[var7.field2885].method92(var3, var4)) {
                    this.method2225();
                    return;
                }
                if (var7.field2883 == -1 && var5 < var10) {
                    this.method2225();
                    return;
                }
                if (var7.field2883 >= 0 && var5 < var8[var7.field2883 + 1].method92(var3, var4)) {
                    this.method2225();
                    return;
                }
            }
            if (var3 >= var6.field5006 && var3 <= var6.field5000 && var4 >= var6.field5004 && var4 <= var6.field5002 && var5 <= var9 && var5 >= var10) {
                var6.field5005.field6454.method513(this, 20319);
            } else {
                int var11;
                for (var11 = class56.field750 - 1; var11 > 0 && var5 > var8[var11].method92(var3, var4); --var11) {
                }
                if (class56.field750 - 1 == var11 && var8[var11].method92(var3, var4) - var5 > 1024) {
                    this.method2225();
                } else {
                    class13 var12 = class277.field4216[var11][var3][var4];
                    if (var12 == null) {
                        boolean var13 = class277.field4216[0][var3][var4].field146 != null;
                        if (var11 == 3 && var13) {
                            this.method2225();
                            return;
                        }
                        for (int var14 = 1; var14 <= var11; ++var14) {
                            if (class277.field4216[var14][var3][var4] == null) {
                                var12 = class277.field4216[var14][var3][var4] = new class13(var14, var3, var4);
                                if (var13) {
                                    ++var12.field150;
                                }
                            }
                        }
                    }
                    if (var12.field159 == null) {
                        var12.field159 = new class439();
                        var12.field156 = (byte) ((int) (arg0 & 255L));
                    } else if ((byte) ((int) (arg0 & 255L)) != var12.field156) {
                        var12.field159 = new class439();
                        var12.field156 = (byte) ((int) (arg0 & 255L));
                    }
                    var12.field159.field6454.method513(this, 20319);
                }
            }
        } else {
            this.method2225();
        }
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "()V")
    private final void method2227() {
        int var1 = this.field5405.field696.field4994;
        if (this.field5405.field696.field4989[var1] != null) {
            this.field5405.field696.field4989[var1].method2225();
        }
        this.field5405.field696.field4989[var1] = this;
        this.field5407 = (short) this.field5405.field696.field4994;
        this.field5405.field696.field4994 = var1 + 1 & 8191;
        this.field5405.field689.method2125(this, -29983);
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(JI)V")
    public final void method2228(long arg0, int arg1) {
        this.field5408 = (short) (this.field5408 - arg1);
        if (this.field5408 <= 0) {
            this.method2225();
        } else {
            int var4 = super.field354 >> class150.field2075;
            int var5 = super.field355 >> class150.field2075;
            int var6 = super.field353 >> class150.field2075;
            class336 var7 = this.field5405.field696;
            class192 var8 = this.field5405.field697;
            if (var8.field2862 != 0) {
                if (this.field5409 - this.field5408 <= var8.field2858) {
                    int var9 = var8.field2865 * arg1 + (this.field5404 >> 16 & 255) + (super.field352 >> 8 & 65280);
                    int var10 = var8.field2901 * arg1 + (this.field5404 >> 8 & 255) + (super.field352 & 65280);
                    int var11 = var8.field2854 * arg1 + (super.field352 << 8 & 65280) + (this.field5404 & 255);
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
                    super.field352 &= -16777216;
                    super.field352 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field5404 &= -16777216;
                    this.field5404 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field5409 - this.field5408 <= var8.field2899) {
                    int var12 = var8.field2920 * arg1 + (this.field5404 >> 24 & 255) + (super.field352 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field352 &= 16777215;
                    super.field352 |= (var12 & 65280) << 16;
                    this.field5404 &= 16777215;
                    this.field5404 |= (var12 & 255) << 24;
                }
            }
            if (var8.field2886 != -1 && this.field5409 - this.field5408 <= var8.field2904) {
                this.field5406 += var8.field2882 * arg1;
            }
            if (var8.field2890 != -1 && this.field5409 - this.field5408 <= var8.field2906) {
                super.field350 += var8.field2888 * arg1;
            }
            int var13 = this.field5403;
            int var14 = this.field5401;
            int var15 = this.field5402;
            boolean var16 = false;
            if (var8.field2853 == 1) {
                int var17 = var4 - this.field5405.field703;
                int var18 = var5 - this.field5405.field717;
                int var19 = var6 - this.field5405.field685;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field2915 * var20 * arg1);
                this.field5406 = (int) ((long) this.field5406 - ((long) this.field5406 * var21 >> 18));
            } else if (var8.field2853 == 2) {
                int var23 = var4 - this.field5405.field703;
                int var24 = var5 - this.field5405.field717;
                int var25 = var6 - this.field5405.field685;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field2915 * var26 * arg1);
                this.field5406 = (int) ((long) this.field5406 - ((long) this.field5406 * var27 >> 28));
            }
            if (var8.field2893 != null) {
                class97 var29 = var7.field4997.field5946;
                for (class97 var30 = var29.field1331; var29 != var30; var30 = var30.field1331) {
                    class298 var31 = (class298) var30;
                    class291 var32 = var31.field4504;
                    if (var32.field4429 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field2893.length; ++var34) {
                            if (var8.field2893[var34] == var32.field4435) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field4516;
                            int var36 = var5 - var31.field4503;
                            int var37 = var6 - var31.field4508;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field4424) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field4518 * var37 + var31.field4510 * var35 + var32.field4423 * var36) * 65535L / (long) (var32.field4433 * var40);
                                if (var41 >= (long) var32.field4420) {
                                    int var43 = 0;
                                    if (var32.field4428 == 1) {
                                        var43 = (var40 >> 4) * var32.field4418;
                                    } else if (var32.field4428 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field4418;
                                    }
                                    if (var32.field4417 == 0) {
                                        if (var32.field4425 == 0) {
                                            var13 += (var31.field4510 - var43) * arg1;
                                            var14 += (var32.field4423 - var43) * arg1;
                                            var15 += (var31.field4518 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field354 += (var31.field4510 - var43) * arg1;
                                            super.field355 += (var32.field4423 - var43) * arg1;
                                            super.field353 += (var31.field4518 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field4433;
                                        int var45 = (var36 << 15) / var40 * var32.field4433;
                                        int var46 = (var37 << 15) / var40 * var32.field4433;
                                        if (var32.field4425 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field354 += arg1 * var44 >> 15;
                                            super.field355 += arg1 * var45 >> 15;
                                            super.field353 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field2867 != null) {
                for (int var47 = 0; var47 < var8.field2867.length; ++var47) {
                    class298 var48 = (class298) class19.field257.method2155((long) var8.field2867[var47], (byte) -74);
                    while (var48 != null) {
                        class291 var49 = var48.field4504;
                        int var50 = var4 - var48.field4516;
                        int var51 = var5 - var48.field4503;
                        int var52 = var6 - var48.field4508;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field4424) {
                            var48 = (class298) class19.field257.method2150(-10958);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field4518 * var52 + var48.field4510 * var50 + var49.field4423 * var51) * 65535L / (long) (var49.field4433 * var55);
                            if (var56 < (long) var49.field4420) {
                                var48 = (class298) class19.field257.method2150(-10958);
                            } else {
                                int var58 = 0;
                                if (var49.field4428 == 1) {
                                    var58 = (var55 >> 4) * var49.field4418;
                                } else if (var49.field4428 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field4418;
                                }
                                if (var49.field4417 == 0) {
                                    if (var49.field4425 == 0) {
                                        var13 += (var48.field4510 - var58) * arg1;
                                        var14 += (var49.field4423 - var58) * arg1;
                                        var15 += (var48.field4518 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field354 += (var48.field4510 - var58) * arg1;
                                        super.field355 += (var49.field4423 - var58) * arg1;
                                        super.field353 += (var48.field4518 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field4433;
                                    int var60 = (var51 << 15) / var55 * var49.field4433;
                                    int var61 = (var52 << 15) / var55 * var49.field4433;
                                    if (var49.field4425 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field354 += arg1 * var59 >> 15;
                                        super.field355 += arg1 * var60 >> 15;
                                        super.field353 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class298) class19.field257.method2150(-10958);
                            }
                        }
                    }
                }
            }
            if (var8.field2913 != null) {
                if (var8.field2887 == null) {
                    var8.field2887 = new int[var8.field2913.length];
                    for (int var62 = 0; var62 < var8.field2913.length; ++var62) {
                        class128.method751(-31686, var8.field2913[var62]);
                        var8.field2887[var62] = ((class350) class243.field3648.method2302((long) var8.field2913[var62], 23576)).field5202;
                    }
                }
                for (int var63 = 0; var63 < var8.field2887.length; ++var63) {
                    class291 var64 = class25.field323[var8.field2887[var63]];
                    if (var64.field4425 == 0) {
                        var13 += var64.field4434 * arg1;
                        var14 += var64.field4423 * arg1;
                        var15 += var64.field4426 * arg1;
                        var16 = true;
                    } else {
                        super.field354 += var64.field4434 * arg1;
                        super.field355 += var64.field4423 * arg1;
                        super.field353 += var64.field4426 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field5403 = (short) var13;
                        this.field5401 = (short) var14;
                        this.field5402 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field5406 <<= 1;
                }
            }
            super.field354 = (int) ((long) super.field354 + ((long) this.field5403 * (long) this.field5406 >> 23) * (long) arg1);
            super.field355 = (int) ((long) super.field355 + ((long) this.field5401 * (long) this.field5406 >> 23) * (long) arg1);
            super.field353 = (int) ((long) super.field353 + ((long) this.field5402 * (long) this.field5406 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lmq;IIIIIIIIIIIZ)V")
    public final void method2229(class53 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        this.field5405 = arg0;
        super.field354 = arg1 << class150.field2075;
        super.field355 = arg2 << class150.field2075;
        super.field353 = arg3 << class150.field2075;
        super.field352 = arg9;
        this.field5409 = this.field5408 = (short) arg8;
        super.field350 = arg10;
        super.field349 = arg11;
        this.field5403 = (short) arg4;
        this.field5401 = (short) arg5;
        this.field5402 = (short) arg6;
        this.field5406 = arg7;
        super.field348 = this.field5405.field701.field3315;
        this.method2227();
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lmq;IIIIIIIIIIIZ)V")
    public class370(class53 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        this.field5405 = arg0;
        super.field354 = arg1 << class150.field2075;
        super.field355 = arg2 << class150.field2075;
        super.field353 = arg3 << class150.field2075;
        super.field352 = arg9;
        this.field5409 = this.field5408 = (short) arg8;
        super.field350 = arg10;
        super.field349 = arg11;
        this.field5403 = (short) arg4;
        this.field5401 = (short) arg5;
        this.field5402 = (short) arg6;
        this.field5406 = arg7;
        super.field348 = this.field5405.field701.field3315;
        this.method2227();
    }
}
