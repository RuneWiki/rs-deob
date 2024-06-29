import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class115 extends class517 {

    @OriginalMember(owner = "client!uh", name = "D", descriptor = "Ltq;")
    private class452 field1554;

    @OriginalMember(owner = "client!uh", name = "I", descriptor = "S")
    private short field1559;

    @OriginalMember(owner = "client!uh", name = "J", descriptor = "S")
    private short field1560;

    @OriginalMember(owner = "client!uh", name = "F", descriptor = "S")
    private short field1556;

    @OriginalMember(owner = "client!uh", name = "C", descriptor = "S")
    private short field1553;

    @OriginalMember(owner = "client!uh", name = "H", descriptor = "S")
    private short field1558;

    @OriginalMember(owner = "client!uh", name = "E", descriptor = "I")
    private int field1555;

    @OriginalMember(owner = "client!uh", name = "G", descriptor = "I")
    private int field1557;

    @OriginalMember(owner = "client!uh", name = "K", descriptor = "S")
    private short field1561;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "()V", line = 9)
    private final void method771() {
        this.field1554.field6320.field5041[this.field1561] = null;
        class105.field1390[class145.field1913] = this;
        class145.field1913 = class145.field1913 + 1 & 1023;
        this.method1805((byte) 89);
        this.method1355(-17098);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(JI)V", line = 18)
    public final void method772(long arg0, int arg1) {
        this.field1559 = (short) (this.field1559 - arg1);
        if (this.field1559 <= 0) {
            this.method771();
        } else {
            int var4 = super.field7605 >> 12;
            int var5 = super.field7616 >> 12;
            int var6 = super.field7615 >> 12;
            class351 var7 = this.field1554.field6320;
            class155 var8 = this.field1554.field6324;
            if (var8.field2302 != 0) {
                if (this.field1560 - this.field1559 <= var8.field2304) {
                    int var9 = var8.field2253 * arg1 + (super.field7606 >> 8 & 65280) + (this.field1557 >> 16 & 255);
                    int var10 = var8.field2273 * arg1 + (this.field1557 >> 8 & 255) + (super.field7606 & 65280);
                    int var11 = var8.field2282 * arg1 + (super.field7606 << 8 & 65280) + (this.field1557 & 255);
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
                    super.field7606 &= -16777216;
                    super.field7606 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field1557 &= -16777216;
                    this.field1557 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field1560 - this.field1559 <= var8.field2290) {
                    int var12 = var8.field2259 * arg1 + (super.field7606 >> 16 & 65280) + (this.field1557 >> 24 & 255);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field7606 &= 16777215;
                    super.field7606 |= (var12 & 65280) << 16;
                    this.field1557 &= 16777215;
                    this.field1557 |= (var12 & 255) << 24;
                }
            }
            if (var8.field2240 != -1 && this.field1560 - this.field1559 <= var8.field2298) {
                this.field1555 += var8.field2249 * arg1;
            }
            if (var8.field2285 != -1 && this.field1560 - this.field1559 <= var8.field2301) {
                super.field7610 += var8.field2279 * arg1;
            }
            int var13 = this.field1556;
            int var14 = this.field1553;
            int var15 = this.field1558;
            boolean var16 = false;
            if (var8.field2297 == 1) {
                int var17 = var4 - this.field1554.field6330;
                int var18 = var5 - this.field1554.field6331;
                int var19 = var6 - this.field1554.field6319;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field2264 * var20 * arg1);
                this.field1555 = (int) ((long) this.field1555 - ((long) this.field1555 * var21 >> 18));
            } else if (var8.field2297 == 2) {
                int var23 = var4 - this.field1554.field6330;
                int var24 = var5 - this.field1554.field6331;
                int var25 = var6 - this.field1554.field6319;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field2264 * var26 * arg1);
                this.field1555 = (int) ((long) this.field1555 - ((long) this.field1555 * var27 >> 28));
            }
            if (var8.field2280 != null) {
                class498 var29 = var7.field5046.field6378;
                for (class498 var30 = var29.field7055; var29 != var30; var30 = var30.field7055) {
                    class328 var31 = (class328) var30;
                    class509 var32 = var31.field4776;
                    if (var32.field7550 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field2280.length; ++var34) {
                            if (var8.field2280[var34] == var32.field7548) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field4780;
                            int var36 = var5 - var31.field4786;
                            int var37 = var6 - var31.field4774;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field7545) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field4777 * var37 + var31.field4775 * var35 + var32.field7539 * var36) * 65535L / (long) (var32.field7536 * var40);
                                if (var41 >= (long) var32.field7543) {
                                    int var43 = 0;
                                    if (var32.field7552 == 1) {
                                        var43 = (var40 >> 4) * var32.field7547;
                                    } else if (var32.field7552 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field7547;
                                    }
                                    if (var32.field7546 == 0) {
                                        if (var32.field7532 == 0) {
                                            var13 += (var31.field4775 - var43) * arg1;
                                            var14 += (var32.field7539 - var43) * arg1;
                                            var15 += (var31.field4777 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field7605 += (var31.field4775 - var43) * arg1;
                                            super.field7616 += (var32.field7539 - var43) * arg1;
                                            super.field7615 += (var31.field4777 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field7536;
                                        int var45 = (var36 << 15) / var40 * var32.field7536;
                                        int var46 = (var37 << 15) / var40 * var32.field7536;
                                        if (var32.field7532 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field7605 += arg1 * var44 >> 15;
                                            super.field7616 += arg1 * var45 >> 15;
                                            super.field7615 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field2283 != null) {
                for (int var47 = 0; var47 < var8.field2283.length; ++var47) {
                    class328 var48 = (class328) class162.field2400.method173((long) var8.field2283[var47], (byte) 20);
                    while (var48 != null) {
                        class509 var49 = var48.field4776;
                        int var50 = var4 - var48.field4780;
                        int var51 = var5 - var48.field4786;
                        int var52 = var6 - var48.field4774;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field7545) {
                            var48 = (class328) class162.field2400.method176(-1);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field4777 * var52 + var48.field4775 * var50 + var49.field7539 * var51) * 65535L / (long) (var49.field7536 * var55);
                            if (var56 < (long) var49.field7543) {
                                var48 = (class328) class162.field2400.method176(-1);
                            } else {
                                int var58 = 0;
                                if (var49.field7552 == 1) {
                                    var58 = (var55 >> 4) * var49.field7547;
                                } else if (var49.field7552 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field7547;
                                }
                                if (var49.field7546 == 0) {
                                    if (var49.field7532 == 0) {
                                        var13 += (var48.field4775 - var58) * arg1;
                                        var14 += (var49.field7539 - var58) * arg1;
                                        var15 += (var48.field4777 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field7605 += (var48.field4775 - var58) * arg1;
                                        super.field7616 += (var49.field7539 - var58) * arg1;
                                        super.field7615 += (var48.field4777 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field7536;
                                    int var60 = (var51 << 15) / var55 * var49.field7536;
                                    int var61 = (var52 << 15) / var55 * var49.field7536;
                                    if (var49.field7532 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field7605 += arg1 * var59 >> 15;
                                        super.field7616 += arg1 * var60 >> 15;
                                        super.field7615 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class328) class162.field2400.method176(-1);
                            }
                        }
                    }
                }
            }
            if (var8.field2278 != null) {
                if (var8.field2288 == null) {
                    var8.field2288 = new int[var8.field2278.length];
                    for (int var62 = 0; var62 < var8.field2278.length; ++var62) {
                        class169.method1060((byte) -65, var8.field2278[var62]);
                        var8.field2288[var62] = ((class254) class329.field4803.method2405((long) var8.field2278[var62], -78)).field3757;
                    }
                }
                for (int var63 = 0; var63 < var8.field2288.length; ++var63) {
                    class509 var64 = class269.field3922[var8.field2288[var63]];
                    if (var64.field7532 == 0) {
                        var13 += var64.field7534 * arg1;
                        var14 += var64.field7539 * arg1;
                        var15 += var64.field7541 * arg1;
                        var16 = true;
                    } else {
                        super.field7605 += var64.field7534 * arg1;
                        super.field7616 += var64.field7539 * arg1;
                        super.field7615 += var64.field7541 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field1556 = (short) var13;
                        this.field1553 = (short) var14;
                        this.field1558 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field1555 <<= 1;
                }
            }
            super.field7605 = (int) ((long) super.field7605 + ((long) this.field1556 * (long) this.field1555 >> 23) * (long) arg1);
            super.field7616 = (int) ((long) super.field7616 + ((long) this.field1553 * (long) this.field1555 >> 23) * (long) arg1);
            super.field7615 = (int) ((long) super.field7615 + ((long) this.field1558 * (long) this.field1555 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Ltq;IIIIIIIIIIIZZ)V", line = 412)
    public final void method773(class452 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field1554 = arg0;
        super.field7605 = arg1 << 12;
        super.field7616 = arg2 << 12;
        super.field7615 = arg3 << 12;
        super.field7606 = arg9;
        this.field1560 = this.field1559 = (short) arg8;
        super.field7610 = arg10;
        super.field7607 = arg11;
        super.field7611 = arg13;
        this.field1556 = (short) arg4;
        this.field1553 = (short) arg5;
        this.field1558 = (short) arg6;
        this.field1555 = arg7;
        super.field7612 = this.field1554.field6334.field6461;
        this.method775();
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(J)V", line = 432)
    public final void method774(long arg0) {
        int var3 = super.field7605 >> class493.field6970 + 12;
        int var4 = super.field7615 >> class493.field6970 + 12;
        int var5 = super.field7616 >> 12;
        if (var5 <= 0 && var5 >= -262144 && var3 >= 0 && var3 < class6.field109 && var4 >= 0 && var4 < class272.field4032) {
            class351 var6 = this.field1554.field6320;
            class155 var7 = this.field1554.field6324;
            class38[] var8 = class330.field4818;
            int var9 = var8[var6.field5049].method10(var3, var4);
            int var10;
            if (var6.field5049 < class409.field5785 - 1) {
                var10 = var8[var6.field5049 + 1].method10(var3, var4);
            } else {
                var10 = var9 - (8 << class493.field6970);
            }
            if (var7.field2237) {
                if (var7.field2303 == -1 && var5 > var9) {
                    this.method771();
                    return;
                }
                if (var7.field2303 >= 0 && var5 > var8[var7.field2303].method10(var3, var4)) {
                    this.method771();
                    return;
                }
                if (var7.field2242 == -1 && var5 < var10) {
                    this.method771();
                    return;
                }
                if (var7.field2242 >= 0 && var5 < var8[var7.field2242 + 1].method10(var3, var4)) {
                    this.method771();
                    return;
                }
            }
            if (var3 >= var6.field5050 && var3 <= var6.field5048 && var4 >= var6.field5052 && var4 <= var6.field5051 && var5 <= var9 && var5 >= var10) {
                var6.field5055.field4726.method104(this, 24);
            } else {
                int var11;
                for (var11 = class409.field5785 - 1; var11 > 0 && var5 > var8[var11].method10(var3, var4); --var11) {
                }
                if (var11 == 0 && var5 > var8[0].method10(var3, var4)) {
                    this.method771();
                } else if (class409.field5785 - 1 == var11 && var8[var11].method10(var3, var4) - var5 > 8 << class493.field6970) {
                    this.method771();
                } else {
                    class239 var12 = class268.field3910[var11][var3][var4];
                    if (var12 == null) {
                        if (var11 == 0) {
                            var12 = class268.field3910[0][var3][var4] = new class239(0, var3, var4);
                        }
                        boolean var13 = class268.field3910[0][var3][var4].field3483 != null;
                        if (var11 == 3 && var13) {
                            this.method771();
                            return;
                        }
                        for (int var14 = 1; var14 <= var11; ++var14) {
                            if (class268.field3910[var14][var3][var4] == null) {
                                var12 = class268.field3910[var14][var3][var4] = new class239(var14, var3, var4);
                                if (var13) {
                                    ++var12.field3470;
                                }
                            }
                        }
                    }
                    if (var12.field3492 == null) {
                        var12.field3492 = new class324();
                        var12.field3469 = (byte) ((int) (arg0 & 255L));
                    } else if ((byte) ((int) (arg0 & 255L)) != var12.field3469) {
                        var12.field3492.field4726.method106((byte) 54);
                        var12.field3492.field4731 = false;
                        var12.field3469 = (byte) ((int) (arg0 & 255L));
                    }
                    var12.field3492.field4726.method104(this, 24);
                }
            }
        } else {
            this.method771();
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "()V", line = 562)
    private final void method775() {
        int var1 = this.field1554.field6320.field5040;
        if (this.field1554.field6320.field5041[var1] != null) {
            this.field1554.field6320.field5041[var1].method771();
        }
        this.field1554.field6320.field5041[var1] = this;
        this.field1561 = (short) this.field1554.field6320.field5040;
        this.field1554.field6320.field5040 = var1 + 1 & 8191;
        this.field1554.field6317.method2753(4, this);
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Ltq;IIIIIIIIIIIZZ)V", line = 571)
    public class115(class452 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field1554 = arg0;
        super.field7605 = arg1 << 12;
        super.field7616 = arg2 << 12;
        super.field7615 = arg3 << 12;
        super.field7606 = arg9;
        this.field1560 = this.field1559 = (short) arg8;
        super.field7610 = arg10;
        super.field7607 = arg11;
        super.field7611 = arg13;
        this.field1556 = (short) arg4;
        this.field1553 = (short) arg5;
        this.field1558 = (short) arg6;
        this.field1555 = arg7;
        super.field7612 = this.field1554.field6334.field6461;
        this.method775();
    }
}
