import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class311 extends class94 {

    @OriginalMember(owner = "client!qv", name = "S", descriptor = "Lll;")
    private class247 field4160;

    @OriginalMember(owner = "client!qv", name = "W", descriptor = "S")
    private short field4164;

    @OriginalMember(owner = "client!qv", name = "Z", descriptor = "S")
    private short field4167;

    @OriginalMember(owner = "client!qv", name = "R", descriptor = "S")
    private short field4159;

    @OriginalMember(owner = "client!qv", name = "V", descriptor = "S")
    private short field4163;

    @OriginalMember(owner = "client!qv", name = "U", descriptor = "S")
    private short field4162;

    @OriginalMember(owner = "client!qv", name = "X", descriptor = "I")
    private int field4165;

    @OriginalMember(owner = "client!qv", name = "Y", descriptor = "I")
    private int field4166;

    @OriginalMember(owner = "client!qv", name = "T", descriptor = "S")
    private short field4161;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(J)V")
    public final void method1853(long arg0) {
        int var3 = super.field1130 >> class351.field4688 + 12;
        int var4 = super.field1122 >> class351.field4688 + 12;
        int var5 = super.field1135 >> 12;
        if (var5 <= 0 && var5 >= -262144 && var3 >= 0 && var3 < class515.field7487 && var4 >= 0 && var4 < class114.field1494) {
            class46 var6 = this.field4160.field3270;
            class342 var7 = this.field4160.field3266;
            class38[] var8 = class152.field1993;
            int var9 = var8[var6.field482].method217(var3, var4);
            int var10;
            if (var6.field482 < class478.field7065 - 1) {
                var10 = var8[var6.field482 + 1].method217(var3, var4);
            } else {
                var10 = var9 - (8 << class351.field4688);
            }
            if (var7.field4547) {
                if (var7.field4531 == -1 && var5 > var9) {
                    this.method1854();
                    return;
                }
                if (var7.field4531 >= 0 && var5 > var8[var7.field4531].method217(var3, var4)) {
                    this.method1854();
                    return;
                }
                if (var7.field4520 == -1 && var5 < var10) {
                    this.method1854();
                    return;
                }
                if (var7.field4520 >= 0 && var5 < var8[var7.field4520 + 1].method217(var3, var4)) {
                    this.method1854();
                    return;
                }
            }
            if (var3 >= var6.field486 && var3 <= var6.field481 && var4 >= var6.field483 && var4 <= var6.field487 && var5 <= var9 && var5 >= var10) {
                var6.field484.field4453.method2518(1165053482, this);
            } else {
                int var11;
                for (var11 = class478.field7065 - 1; var11 > 0 && var5 > var8[var11].method217(var3, var4); --var11) {
                }
                if (var11 == 0 && var5 > var8[0].method217(var3, var4)) {
                    this.method1854();
                } else if (class478.field7065 - 1 == var11 && var8[var11].method217(var3, var4) - var5 > 8 << class351.field4688) {
                    this.method1854();
                } else {
                    class498 var12 = class186.field2421[var11][var3][var4];
                    if (var12 == null) {
                        if (var11 == 0) {
                            var12 = class186.field2421[0][var3][var4] = new class498(0, var3, var4);
                        }
                        boolean var13 = class186.field2421[0][var3][var4].field7276 != null;
                        if (var11 == 3 && var13) {
                            this.method1854();
                            return;
                        }
                        for (int var14 = 1; var14 <= var11; ++var14) {
                            if (class186.field2421[var14][var3][var4] == null) {
                                var12 = class186.field2421[var14][var3][var4] = new class498(var14, var3, var4);
                                if (var13) {
                                    ++var12.field7262;
                                }
                            }
                        }
                    }
                    if (var12.field7265 == null) {
                        var12.field7265 = new class336();
                        var12.field7272 = (byte) ((int) (arg0 & 255L));
                    } else if ((byte) ((int) (arg0 & 255L)) != var12.field7272) {
                        var12.field7265.field4453.method2515(127);
                        var12.field7265.field4455 = false;
                        var12.field7272 = (byte) ((int) (arg0 & 255L));
                    }
                    var12.field7265.field4453.method2518(1165053482, this);
                }
            }
        } else {
            this.method1854();
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "()V")
    private final void method1854() {
        this.field4160.field3270.field474[this.field4161] = null;
        class60.field693[class237.field3157] = this;
        class237.field3157 = class237.field3157 + 1 & 1023;
        this.method1239(107);
        this.method2325(true);
    }

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "()V")
    private final void method1855() {
        int var1 = this.field4160.field3270.field471;
        if (this.field4160.field3270.field474[var1] != null) {
            this.field4160.field3270.field474[var1].method1854();
        }
        this.field4160.field3270.field474[var1] = this;
        this.field4161 = (short) this.field4160.field3270.field471;
        this.field4160.field3270.field471 = var1 + 1 & 8191;
        this.field4160.field3262.method286((byte) 123, this);
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(JI)V")
    public final void method1856(long arg0, int arg1) {
        this.field4164 = (short) (this.field4164 - arg1);
        if (this.field4164 <= 0) {
            this.method1854();
        } else {
            int var4 = super.field1130 >> 12;
            int var5 = super.field1135 >> 12;
            int var6 = super.field1122 >> 12;
            class46 var7 = this.field4160.field3270;
            class342 var8 = this.field4160.field3266;
            if (var8.field4570 != 0) {
                if (this.field4167 - this.field4164 <= var8.field4585) {
                    int var9 = var8.field4530 * arg1 + (super.field1133 >> 8 & 65280) + (this.field4166 >> 16 & 255);
                    int var10 = var8.field4571 * arg1 + (this.field4166 >> 8 & 255) + (super.field1133 & 65280);
                    int var11 = var8.field4581 * arg1 + (super.field1133 << 8 & 65280) + (this.field4166 & 255);
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
                    super.field1133 &= -16777216;
                    super.field1133 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field4166 &= -16777216;
                    this.field4166 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field4167 - this.field4164 <= var8.field4580) {
                    int var12 = var8.field4583 * arg1 + (super.field1133 >> 16 & 65280) + (this.field4166 >> 24 & 255);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field1133 &= 16777215;
                    super.field1133 |= (var12 & 65280) << 16;
                    this.field4166 &= 16777215;
                    this.field4166 |= (var12 & 255) << 24;
                }
            }
            if (var8.field4525 != -1 && this.field4167 - this.field4164 <= var8.field4527) {
                this.field4165 += var8.field4521 * arg1;
            }
            if (var8.field4565 != -1 && this.field4167 - this.field4164 <= var8.field4518) {
                super.field1129 += var8.field4522 * arg1;
            }
            int var13 = this.field4159;
            int var14 = this.field4163;
            int var15 = this.field4162;
            boolean var16 = false;
            if (var8.field4536 == 1) {
                int var17 = var4 - this.field4160.field3252;
                int var18 = var5 - this.field4160.field3249;
                int var19 = var6 - this.field4160.field3239;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field4551 * var20 * arg1);
                this.field4165 = (int) ((long) this.field4165 - ((long) this.field4165 * var21 >> 18));
            } else if (var8.field4536 == 2) {
                int var23 = var4 - this.field4160.field3252;
                int var24 = var5 - this.field4160.field3249;
                int var25 = var6 - this.field4160.field3239;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field4551 * var26 * arg1);
                this.field4165 = (int) ((long) this.field4165 - ((long) this.field4165 * var27 >> 28));
            }
            if (var8.field4562 != null) {
                class435 var29 = var7.field479.field2165;
                for (class435 var30 = var29.field6344; var29 != var30; var30 = var30.field6344) {
                    class255 var31 = (class255) var30;
                    class178 var32 = var31.field3389;
                    if (var32.field2298 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field4562.length; ++var34) {
                            if (var8.field4562[var34] == var32.field2296) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field3393;
                            int var36 = var5 - var31.field3394;
                            int var37 = var6 - var31.field3392;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field2292) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field3386 * var37 + var31.field3390 * var35 + var32.field2290 * var36) * 65535L / (long) (var32.field2293 * var40);
                                if (var41 >= (long) var32.field2299) {
                                    int var43 = 0;
                                    if (var32.field2302 == 1) {
                                        var43 = (var40 >> 4) * var32.field2301;
                                    } else if (var32.field2302 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field2301;
                                    }
                                    if (var32.field2297 == 0) {
                                        if (var32.field2294 == 0) {
                                            var13 += (var31.field3390 - var43) * arg1;
                                            var14 += (var32.field2290 - var43) * arg1;
                                            var15 += (var31.field3386 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field1130 += (var31.field3390 - var43) * arg1;
                                            super.field1135 += (var32.field2290 - var43) * arg1;
                                            super.field1122 += (var31.field3386 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field2293;
                                        int var45 = (var36 << 15) / var40 * var32.field2293;
                                        int var46 = (var37 << 15) / var40 * var32.field2293;
                                        if (var32.field2294 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field1130 += arg1 * var44 >> 15;
                                            super.field1135 += arg1 * var45 >> 15;
                                            super.field1122 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field4573 != null) {
                for (int var47 = 0; var47 < var8.field4573.length; ++var47) {
                    class255 var48 = (class255) class519.field7654.method2165(-1, (long) var8.field4573[var47]);
                    while (var48 != null) {
                        class178 var49 = var48.field3389;
                        int var50 = var4 - var48.field3393;
                        int var51 = var5 - var48.field3394;
                        int var52 = var6 - var48.field3392;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field2292) {
                            var48 = (class255) class519.field7654.method2163(-1);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field3386 * var52 + var48.field3390 * var50 + var49.field2290 * var51) * 65535L / (long) (var49.field2293 * var55);
                            if (var56 < (long) var49.field2299) {
                                var48 = (class255) class519.field7654.method2163(-1);
                            } else {
                                int var58 = 0;
                                if (var49.field2302 == 1) {
                                    var58 = (var55 >> 4) * var49.field2301;
                                } else if (var49.field2302 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field2301;
                                }
                                if (var49.field2297 == 0) {
                                    if (var49.field2294 == 0) {
                                        var13 += (var48.field3390 - var58) * arg1;
                                        var14 += (var49.field2290 - var58) * arg1;
                                        var15 += (var48.field3386 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field1130 += (var48.field3390 - var58) * arg1;
                                        super.field1135 += (var49.field2290 - var58) * arg1;
                                        super.field1122 += (var48.field3386 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field2293;
                                    int var60 = (var51 << 15) / var55 * var49.field2293;
                                    int var61 = (var52 << 15) / var55 * var49.field2293;
                                    if (var49.field2294 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field1130 += arg1 * var59 >> 15;
                                        super.field1135 += arg1 * var60 >> 15;
                                        super.field1122 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class255) class519.field7654.method2163(-1);
                            }
                        }
                    }
                }
            }
            if (var8.field4564 != null) {
                if (var8.field4544 == null) {
                    var8.field4544 = new int[var8.field4564.length];
                    for (int var62 = 0; var62 < var8.field4564.length; ++var62) {
                        class468.method2859((byte) -116, var8.field4564[var62]);
                        var8.field4544[var62] = ((class488) class342.field4572.method295((long) var8.field4564[var62], -106)).field7162;
                    }
                }
                for (int var63 = 0; var63 < var8.field4544.length; ++var63) {
                    class178 var64 = class5.field46[var8.field4544[var63]];
                    if (var64.field2294 == 0) {
                        var13 += var64.field2304 * arg1;
                        var14 += var64.field2290 * arg1;
                        var15 += var64.field2286 * arg1;
                        var16 = true;
                    } else {
                        super.field1130 += var64.field2304 * arg1;
                        super.field1135 += var64.field2290 * arg1;
                        super.field1122 += var64.field2286 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field4159 = (short) var13;
                        this.field4163 = (short) var14;
                        this.field4162 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field4165 <<= 1;
                }
            }
            super.field1130 = (int) ((long) super.field1130 + ((long) this.field4159 * (long) this.field4165 >> 23) * (long) arg1);
            super.field1135 = (int) ((long) super.field1135 + ((long) this.field4163 * (long) this.field4165 >> 23) * (long) arg1);
            super.field1122 = (int) ((long) super.field1122 + ((long) this.field4162 * (long) this.field4165 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lll;IIIIIIIIIIIZZ)V")
    public final void method1857(class247 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field4160 = arg0;
        super.field1130 = arg1 << 12;
        super.field1135 = arg2 << 12;
        super.field1122 = arg3 << 12;
        super.field1133 = arg9;
        this.field4167 = this.field4164 = (short) arg8;
        super.field1129 = arg10;
        super.field1124 = arg11;
        super.field1127 = arg13;
        this.field4159 = (short) arg4;
        this.field4163 = (short) arg5;
        this.field4162 = (short) arg6;
        this.field4165 = arg7;
        super.field1126 = this.field4160.field3259.field1892;
        this.method1855();
    }

    @OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(Lll;IIIIIIIIIIIZZ)V")
    public class311(class247 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field4160 = arg0;
        super.field1130 = arg1 << 12;
        super.field1135 = arg2 << 12;
        super.field1122 = arg3 << 12;
        super.field1133 = arg9;
        this.field4167 = this.field4164 = (short) arg8;
        super.field1129 = arg10;
        super.field1124 = arg11;
        super.field1127 = arg13;
        this.field4159 = (short) arg4;
        this.field4163 = (short) arg5;
        this.field4162 = (short) arg6;
        this.field4165 = arg7;
        super.field1126 = this.field4160.field3259.field1892;
        this.method1855();
    }
}
