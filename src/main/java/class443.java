import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class443 extends class267 {

    @OriginalMember(owner = "client!ch", name = "G", descriptor = "Lhk;")
    private class201 field6484;

    @OriginalMember(owner = "client!ch", name = "N", descriptor = "S")
    private short field6491;

    @OriginalMember(owner = "client!ch", name = "F", descriptor = "S")
    private short field6483;

    @OriginalMember(owner = "client!ch", name = "L", descriptor = "S")
    private short field6489;

    @OriginalMember(owner = "client!ch", name = "I", descriptor = "S")
    private short field6486;

    @OriginalMember(owner = "client!ch", name = "J", descriptor = "S")
    private short field6487;

    @OriginalMember(owner = "client!ch", name = "M", descriptor = "I")
    private int field6490;

    @OriginalMember(owner = "client!ch", name = "H", descriptor = "I")
    private int field6485;

    @OriginalMember(owner = "client!ch", name = "K", descriptor = "S")
    private short field6488;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "()V", line = 4)
    private final void method2787() {
        int var1 = this.field6484.field2690.field72;
        if (this.field6484.field2690.field70[var1] != null) {
            this.field6484.field2690.field70[var1].method2791();
        }
        this.field6484.field2690.field70[var1] = this;
        this.field6488 = (short) this.field6484.field2690.field72;
        this.field6484.field2690.field72 = var1 + 1 & 8191;
        this.field6484.field2697.method1003(2166, this);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lhk;IIIIIIIIIIIZ)V", line = 19)
    public final void method2788(class201 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        this.field6484 = arg0;
        super.field3849 = arg1 << class156.field2116;
        super.field3862 = arg2 << class156.field2116;
        super.field3860 = arg3 << class156.field2116;
        super.field3853 = arg9;
        this.field6483 = this.field6491 = (short) arg8;
        super.field3861 = arg10;
        super.field3852 = arg11;
        this.field6489 = (short) arg4;
        this.field6486 = (short) arg5;
        this.field6487 = (short) arg6;
        this.field6490 = arg7;
        super.field3856 = this.field6484.field2681.field5182;
        this.method2787();
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(JI)V", line = 38)
    public final void method2789(long arg0, int arg1) {
        this.field6491 = (short) (this.field6491 - arg1);
        if (this.field6491 <= 0) {
            this.method2791();
        } else {
            int var4 = super.field3849 >> class156.field2116;
            int var5 = super.field3862 >> class156.field2116;
            int var6 = super.field3860 >> class156.field2116;
            class6 var7 = this.field6484.field2690;
            class182 var8 = this.field6484.field2685;
            if (var8.field2419 != 0) {
                if (this.field6483 - this.field6491 <= var8.field2471) {
                    int var9 = var8.field2426 * arg1 + (this.field6485 >> 16 & 255) + (super.field3853 >> 8 & 65280);
                    int var10 = var8.field2424 * arg1 + (this.field6485 >> 8 & 255) + (super.field3853 & 65280);
                    int var11 = var8.field2446 * arg1 + (super.field3853 << 8 & 65280) + (this.field6485 & 255);
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
                    super.field3853 &= -16777216;
                    super.field3853 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field6485 &= -16777216;
                    this.field6485 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field6483 - this.field6491 <= var8.field2413) {
                    int var12 = var8.field2428 * arg1 + (this.field6485 >> 24 & 255) + (super.field3853 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field3853 &= 16777215;
                    super.field3853 |= (var12 & 65280) << 16;
                    this.field6485 &= 16777215;
                    this.field6485 |= (var12 & 255) << 24;
                }
            }
            if (var8.field2405 != -1 && this.field6483 - this.field6491 <= var8.field2474) {
                this.field6490 += var8.field2430 * arg1;
            }
            if (var8.field2408 != -1 && this.field6483 - this.field6491 <= var8.field2479) {
                super.field3861 += var8.field2469 * arg1;
            }
            int var13 = this.field6489;
            int var14 = this.field6486;
            int var15 = this.field6487;
            boolean var16 = false;
            if (var8.field2437 == 1) {
                int var17 = var4 - this.field6484.field2675;
                int var18 = var5 - this.field6484.field2695;
                int var19 = var6 - this.field6484.field2680;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field2465 * var20 * arg1);
                this.field6490 = (int) ((long) this.field6490 - ((long) this.field6490 * var21 >> 18));
            } else if (var8.field2437 == 2) {
                int var23 = var4 - this.field6484.field2675;
                int var24 = var5 - this.field6484.field2695;
                int var25 = var6 - this.field6484.field2680;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field2465 * var26 * arg1);
                this.field6490 = (int) ((long) this.field6490 - ((long) this.field6490 * var27 >> 28));
            }
            if (var8.field2422 != null) {
                class45 var29 = var7.field80.field663;
                for (class45 var30 = var29.field636; var29 != var30; var30 = var30.field636) {
                    class27 var31 = (class27) var30;
                    class90 var32 = var31.field385;
                    if (var32.field1260 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field2422.length; ++var34) {
                            if (var8.field2422[var34] == var32.field1268) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field397;
                            int var36 = var5 - var31.field386;
                            int var37 = var6 - var31.field382;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field1269) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field394 * var37 + var31.field387 * var35 + var32.field1261 * var36) * 65535L / (long) (var32.field1272 * var40);
                                if (var41 >= (long) var32.field1257) {
                                    int var43 = 0;
                                    if (var32.field1256 == 1) {
                                        var43 = (var40 >> 4) * var32.field1271;
                                    } else if (var32.field1256 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field1271;
                                    }
                                    if (var32.field1258 == 0) {
                                        if (var32.field1267 == 0) {
                                            var13 += (var31.field387 - var43) * arg1;
                                            var14 += (var32.field1261 - var43) * arg1;
                                            var15 += (var31.field394 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field3849 += (var31.field387 - var43) * arg1;
                                            super.field3862 += (var32.field1261 - var43) * arg1;
                                            super.field3860 += (var31.field394 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field1272;
                                        int var45 = (var36 << 15) / var40 * var32.field1272;
                                        int var46 = (var37 << 15) / var40 * var32.field1272;
                                        if (var32.field1267 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field3849 += arg1 * var44 >> 15;
                                            super.field3862 += arg1 * var45 >> 15;
                                            super.field3860 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field2423 != null) {
                for (int var47 = 0; var47 < var8.field2423.length; ++var47) {
                    class27 var48 = (class27) class87.field1228.method1899(119, (long) var8.field2423[var47]);
                    while (var48 != null) {
                        class90 var49 = var48.field385;
                        int var50 = var4 - var48.field397;
                        int var51 = var5 - var48.field386;
                        int var52 = var6 - var48.field382;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field1269) {
                            var48 = (class27) class87.field1228.method1898(false);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field394 * var52 + var48.field387 * var50 + var49.field1261 * var51) * 65535L / (long) (var49.field1272 * var55);
                            if (var56 < (long) var49.field1257) {
                                var48 = (class27) class87.field1228.method1898(false);
                            } else {
                                int var58 = 0;
                                if (var49.field1256 == 1) {
                                    var58 = (var55 >> 4) * var49.field1271;
                                } else if (var49.field1256 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field1271;
                                }
                                if (var49.field1258 == 0) {
                                    if (var49.field1267 == 0) {
                                        var13 += (var48.field387 - var58) * arg1;
                                        var14 += (var49.field1261 - var58) * arg1;
                                        var15 += (var48.field394 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field3849 += (var48.field387 - var58) * arg1;
                                        super.field3862 += (var49.field1261 - var58) * arg1;
                                        super.field3860 += (var48.field394 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field1272;
                                    int var60 = (var51 << 15) / var55 * var49.field1272;
                                    int var61 = (var52 << 15) / var55 * var49.field1272;
                                    if (var49.field1267 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field3849 += arg1 * var59 >> 15;
                                        super.field3862 += arg1 * var60 >> 15;
                                        super.field3860 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class27) class87.field1228.method1898(false);
                            }
                        }
                    }
                }
            }
            if (var8.field2447 != null) {
                if (var8.field2478 == null) {
                    var8.field2478 = new int[var8.field2447.length];
                    for (int var62 = 0; var62 < var8.field2447.length; ++var62) {
                        class68.method457(var8.field2447[var62], 0);
                        var8.field2478[var62] = ((class279) class3.field38.method384((long) var8.field2447[var62], true)).field4054;
                    }
                }
                for (int var63 = 0; var63 < var8.field2478.length; ++var63) {
                    class90 var64 = class307.field4525[var8.field2478[var63]];
                    if (var64.field1267 == 0) {
                        var13 += var64.field1277 * arg1;
                        var14 += var64.field1261 * arg1;
                        var15 += var64.field1265 * arg1;
                        var16 = true;
                    } else {
                        super.field3849 += var64.field1277 * arg1;
                        super.field3862 += var64.field1261 * arg1;
                        super.field3860 += var64.field1265 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field6489 = (short) var13;
                        this.field6486 = (short) var14;
                        this.field6487 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field6490 <<= 1;
                }
            }
            super.field3849 = (int) ((long) super.field3849 + ((long) this.field6489 * (long) this.field6490 >> 23) * (long) arg1);
            super.field3862 = (int) ((long) super.field3862 + ((long) this.field6486 * (long) this.field6490 >> 23) * (long) arg1);
            super.field3860 = (int) ((long) super.field3860 + ((long) this.field6487 * (long) this.field6490 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(J)V", line = 435)
    public final void method2790(long arg0) {
        int var3 = super.field3849 >> 19;
        int var4 = super.field3860 >> 19;
        int var5 = super.field3862 >> class156.field2116;
        if (var5 <= 0 && var5 >= -65535 && var3 >= 0 && var3 < class104.field1436 && var4 >= 0 && var4 < class214.field2858) {
            class6 var6 = this.field6484.field2690;
            class182 var7 = this.field6484.field2685;
            class351[] var8 = class12.field205;
            int var9 = var8[var6.field82].method742(var3, var4);
            int var10;
            if (var6.field82 < 3) {
                var10 = var8[var6.field82 + 1].method742(var3, var4);
            } else {
                var10 = var9 - 1024;
            }
            if (var7.field2433) {
                if (var7.field2461 == -1 && var5 > var9) {
                    this.method2791();
                    return;
                }
                if (var7.field2461 >= 0 && var5 > var8[var7.field2461].method742(var3, var4)) {
                    this.method2791();
                    return;
                }
                if (var7.field2468 == -1 && var5 < var10) {
                    this.method2791();
                    return;
                }
                if (var7.field2468 >= 0 && var5 < var8[var7.field2468 + 1].method742(var3, var4)) {
                    this.method2791();
                    return;
                }
            }
            if (var3 >= var6.field83 && var3 <= var6.field87 && var4 >= var6.field85 && var4 <= var6.field87 && var5 <= var9 && var5 >= var10) {
                var6.field84.field5092.method2375(true, this);
            } else {
                byte var11 = 3;
                if (var5 > var8[1].method742(var3, var4)) {
                    var11 = 0;
                } else if (var5 > var8[2].method742(var3, var4)) {
                    var11 = 1;
                } else if (var5 > var8[3].method742(var3, var4)) {
                    var11 = 2;
                } else if (var5 < var8[3].method742(var3, var4) - 1024) {
                    this.method2791();
                    return;
                }
                class254 var12 = class213.field2852[var11][var3][var4];
                if (var12 == null) {
                    boolean var13 = class213.field2852[0][var3][var4].field3503 != null;
                    if (var11 == 3 && var13) {
                        this.method2791();
                        return;
                    }
                    for (int var14 = 1; var14 <= var11; ++var14) {
                        if (class213.field2852[var14][var3][var4] == null) {
                            var12 = class213.field2852[var14][var3][var4] = new class254(var14, var3, var4);
                            if (var13) {
                                ++var12.field3507;
                            }
                        }
                    }
                }
                if (var12.field3505 == null) {
                    var12.field3505 = new class352();
                    var12.field3504 = (byte) ((int) (arg0 & 255L));
                } else if ((byte) ((int) (arg0 & 255L)) != var12.field3504) {
                    var12.field3505 = new class352();
                    var12.field3504 = (byte) ((int) (arg0 & 255L));
                }
                var12.field3505.field5092.method2375(true, this);
            }
        } else {
            this.method2791();
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "()V", line = 562)
    private final void method2791() {
        this.field6484.field2690.field70[this.field6488] = null;
        class43.field611[class177.field2344] = this;
        class177.field2344 = class177.field2344 + 1 & 1023;
        this.method686(-14);
        this.method425(-105);
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lhk;IIIIIIIIIIIZ)V", line = 569)
    public class443(class201 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        this.field6484 = arg0;
        super.field3849 = arg1 << class156.field2116;
        super.field3862 = arg2 << class156.field2116;
        super.field3860 = arg3 << class156.field2116;
        super.field3853 = arg9;
        this.field6483 = this.field6491 = (short) arg8;
        super.field3861 = arg10;
        super.field3852 = arg11;
        this.field6489 = (short) arg4;
        this.field6486 = (short) arg5;
        this.field6487 = (short) arg6;
        this.field6490 = arg7;
        super.field3856 = this.field6484.field2681.field5182;
        this.method2787();
    }
}
