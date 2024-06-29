import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class185 extends class164 {

    @OriginalMember(owner = "client!os", name = "L", descriptor = "Lld;")
    private class81 field2907;

    @OriginalMember(owner = "client!os", name = "M", descriptor = "S")
    private short field2908;

    @OriginalMember(owner = "client!os", name = "H", descriptor = "S")
    private short field2903;

    @OriginalMember(owner = "client!os", name = "N", descriptor = "S")
    private short field2909;

    @OriginalMember(owner = "client!os", name = "O", descriptor = "S")
    private short field2910;

    @OriginalMember(owner = "client!os", name = "K", descriptor = "S")
    private short field2906;

    @OriginalMember(owner = "client!os", name = "G", descriptor = "I")
    private int field2902;

    @OriginalMember(owner = "client!os", name = "J", descriptor = "I")
    private int field2905;

    @OriginalMember(owner = "client!os", name = "I", descriptor = "S")
    private short field2904;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "()V", line = 5)
    private final void method1255() {
        this.field2907.field1414.field2140[this.field2904] = null;
        class219.field3791[class74.field1267] = this;
        class74.field1267 = class74.field1267 + 1 & 1023;
        this.method695(-106);
        this.method3068((byte) -77);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(J)V", line = 15)
    public final void method1256(long arg0) {
        int var3 = super.field2599 >> class276.field4534 + 12;
        int var4 = super.field2595 >> class276.field4534 + 12;
        int var5 = super.field2602 >> 12;
        if (var5 <= 0 && var5 >= -262144 && var3 >= 0 && var3 < class236.field4089 && var4 >= 0 && var4 < class276.field4537) {
            class122 var6 = this.field2907.field1414;
            class153 var7 = this.field2907.field1418;
            class220[] var8 = class360.field5592;
            int var9 = var8[var6.field2146].method1516(var3, var4);
            int var10;
            if (var6.field2146 < class76.field1315 - 1) {
                var10 = var8[var6.field2146 + 1].method1516(var3, var4);
            } else {
                var10 = var9 - (8 << class276.field4534);
            }
            if (var7.field2452) {
                if (var7.field2478 == -1 && var5 > var9) {
                    this.method1255();
                    return;
                }
                if (var7.field2478 >= 0 && var5 > var8[var7.field2478].method1516(var3, var4)) {
                    this.method1255();
                    return;
                }
                if (var7.field2438 == -1 && var5 < var10) {
                    this.method1255();
                    return;
                }
                if (var7.field2438 >= 0 && var5 < var8[var7.field2438 + 1].method1516(var3, var4)) {
                    this.method1255();
                    return;
                }
            }
            if (var3 >= var6.field2150 && var3 <= var6.field2148 && var4 >= var6.field2149 && var4 <= var6.field2145 && var5 <= var9 && var5 >= var10) {
                var6.field2147.field976.method2466(-78, this);
            } else {
                int var11;
                for (var11 = class76.field1315 - 1; var11 > 0 && var5 > var8[var11].method1516(var3, var4); --var11) {
                }
                if (var11 == 0 && var5 > var8[0].method1516(var3, var4)) {
                    this.method1255();
                } else if (class76.field1315 - 1 == var11 && var8[var11].method1516(var3, var4) - var5 > 8 << class276.field4534) {
                    this.method1255();
                } else {
                    class465 var12 = class66.field977[var11][var3][var4];
                    if (var12 == null) {
                        if (var11 == 0) {
                            var12 = class66.field977[0][var3][var4] = new class465(0, var3, var4);
                        }
                        boolean var13 = class66.field977[0][var3][var4].field6912 != null;
                        if (var11 == 3 && var13) {
                            this.method1255();
                            return;
                        }
                        for (int var14 = 1; var14 <= var11; ++var14) {
                            if (class66.field977[var14][var3][var4] == null) {
                                var12 = class66.field977[var14][var3][var4] = new class465(var14, var3, var4);
                                if (var13) {
                                    ++var12.field6916;
                                }
                            }
                        }
                    }
                    if (var12.field6910 == null) {
                        var12.field6910 = new class66();
                        var12.field6894 = (byte) ((int) (arg0 & 255L));
                    } else if ((byte) ((int) (arg0 & 255L)) != var12.field6894) {
                        var12.field6910.field976.method2463(27274);
                        var12.field6910.field984 = false;
                        var12.field6894 = (byte) ((int) (arg0 & 255L));
                    }
                    var12.field6910.field976.method2466(-100, this);
                }
            }
        } else {
            this.method1255();
        }
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "()V", line = 147)
    private final void method1257() {
        int var1 = this.field2907.field1414.field2137;
        if (this.field2907.field1414.field2140[var1] != null) {
            this.field2907.field1414.field2140[var1].method1255();
        }
        this.field2907.field1414.field2140[var1] = this;
        this.field2904 = (short) this.field2907.field1414.field2137;
        this.field2907.field1414.field2137 = var1 + 1 & 8191;
        this.field2907.field1405.method567(this, 255);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lld;IIIIIIIIIIIZZ)V", line = 159)
    public final void method1258(class81 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field2907 = arg0;
        super.field2599 = arg1 << 12;
        super.field2602 = arg2 << 12;
        super.field2595 = arg3 << 12;
        super.field2600 = arg9;
        this.field2903 = this.field2908 = (short) arg8;
        super.field2594 = arg10;
        super.field2601 = arg11;
        super.field2605 = arg13;
        this.field2909 = (short) arg4;
        this.field2910 = (short) arg5;
        this.field2906 = (short) arg6;
        this.field2902 = arg7;
        super.field2596 = this.field2907.field1413.field5410;
        this.method1257();
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Lld;IIIIIIIIIIIZZ)V", line = 177)
    public class185(class81 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field2907 = arg0;
        super.field2599 = arg1 << 12;
        super.field2602 = arg2 << 12;
        super.field2595 = arg3 << 12;
        super.field2600 = arg9;
        this.field2903 = this.field2908 = (short) arg8;
        super.field2594 = arg10;
        super.field2601 = arg11;
        super.field2605 = arg13;
        this.field2909 = (short) arg4;
        this.field2910 = (short) arg5;
        this.field2906 = (short) arg6;
        this.field2902 = arg7;
        super.field2596 = this.field2907.field1413.field5410;
        this.method1257();
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(JI)V", line = 197)
    public final void method1259(long arg0, int arg1) {
        this.field2908 = (short) (this.field2908 - arg1);
        if (this.field2908 <= 0) {
            this.method1255();
        } else {
            int var4 = super.field2599 >> 12;
            int var5 = super.field2602 >> 12;
            int var6 = super.field2595 >> 12;
            class122 var7 = this.field2907.field1414;
            class153 var8 = this.field2907.field1418;
            if (var8.field2453 != 0) {
                if (this.field2903 - this.field2908 <= var8.field2474) {
                    int var9 = var8.field2487 * arg1 + (this.field2905 >> 16 & 255) + (super.field2600 >> 8 & 65280);
                    int var10 = var8.field2493 * arg1 + (this.field2905 >> 8 & 255) + (super.field2600 & 65280);
                    int var11 = var8.field2462 * arg1 + (super.field2600 << 8 & 65280) + (this.field2905 & 255);
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
                    super.field2600 &= -16777216;
                    super.field2600 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field2905 &= -16777216;
                    this.field2905 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field2903 - this.field2908 <= var8.field2459) {
                    int var12 = var8.field2495 * arg1 + (this.field2905 >> 24 & 255) + (super.field2600 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field2600 &= 16777215;
                    super.field2600 |= (var12 & 65280) << 16;
                    this.field2905 &= 16777215;
                    this.field2905 |= (var12 & 255) << 24;
                }
            }
            if (var8.field2435 != -1 && this.field2903 - this.field2908 <= var8.field2444) {
                this.field2902 += var8.field2448 * arg1;
            }
            if (var8.field2471 != -1 && this.field2903 - this.field2908 <= var8.field2463) {
                super.field2594 += var8.field2485 * arg1;
            }
            int var13 = this.field2909;
            int var14 = this.field2910;
            int var15 = this.field2906;
            boolean var16 = false;
            if (var8.field2470 == 1) {
                int var17 = var4 - this.field2907.field1419;
                int var18 = var5 - this.field2907.field1425;
                int var19 = var6 - this.field2907.field1430;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field2458 * var20 * arg1);
                this.field2902 = (int) ((long) this.field2902 - ((long) this.field2902 * var21 >> 18));
            } else if (var8.field2470 == 2) {
                int var23 = var4 - this.field2907.field1419;
                int var24 = var5 - this.field2907.field1425;
                int var25 = var6 - this.field2907.field1430;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field2458 * var26 * arg1);
                this.field2902 = (int) ((long) this.field2902 - ((long) this.field2902 * var27 >> 28));
            }
            if (var8.field2488 != null) {
                class276 var29 = var7.field2143.field6207;
                for (class276 var30 = var29.field4535; var29 != var30; var30 = var30.field4535) {
                    class282 var31 = (class282) var30;
                    class115 var32 = var31.field4613;
                    if (var32.field2041 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field2488.length; ++var34) {
                            if (var8.field2488[var34] == var32.field2029) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field4608;
                            int var36 = var5 - var31.field4612;
                            int var37 = var6 - var31.field4604;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field2050) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field4606 * var37 + var31.field4605 * var35 + var32.field2044 * var36) * 65535L / (long) (var32.field2043 * var40);
                                if (var41 >= (long) var32.field2045) {
                                    int var43 = 0;
                                    if (var32.field2031 == 1) {
                                        var43 = (var40 >> 4) * var32.field2040;
                                    } else if (var32.field2031 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field2040;
                                    }
                                    if (var32.field2042 == 0) {
                                        if (var32.field2047 == 0) {
                                            var13 += (var31.field4605 - var43) * arg1;
                                            var14 += (var32.field2044 - var43) * arg1;
                                            var15 += (var31.field4606 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field2599 += (var31.field4605 - var43) * arg1;
                                            super.field2602 += (var32.field2044 - var43) * arg1;
                                            super.field2595 += (var31.field4606 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field2043;
                                        int var45 = (var36 << 15) / var40 * var32.field2043;
                                        int var46 = (var37 << 15) / var40 * var32.field2043;
                                        if (var32.field2047 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field2599 += arg1 * var44 >> 15;
                                            super.field2602 += arg1 * var45 >> 15;
                                            super.field2595 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field2436 != null) {
                for (int var47 = 0; var47 < var8.field2436.length; ++var47) {
                    class282 var48 = (class282) class253.field4307.method978((byte) -40, (long) var8.field2436[var47]);
                    while (var48 != null) {
                        class115 var49 = var48.field4613;
                        int var50 = var4 - var48.field4608;
                        int var51 = var5 - var48.field4612;
                        int var52 = var6 - var48.field4604;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field2050) {
                            var48 = (class282) class253.field4307.method979(-27732);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field4606 * var52 + var48.field4605 * var50 + var49.field2044 * var51) * 65535L / (long) (var49.field2043 * var55);
                            if (var56 < (long) var49.field2045) {
                                var48 = (class282) class253.field4307.method979(-27732);
                            } else {
                                int var58 = 0;
                                if (var49.field2031 == 1) {
                                    var58 = (var55 >> 4) * var49.field2040;
                                } else if (var49.field2031 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field2040;
                                }
                                if (var49.field2042 == 0) {
                                    if (var49.field2047 == 0) {
                                        var13 += (var48.field4605 - var58) * arg1;
                                        var14 += (var49.field2044 - var58) * arg1;
                                        var15 += (var48.field4606 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field2599 += (var48.field4605 - var58) * arg1;
                                        super.field2602 += (var49.field2044 - var58) * arg1;
                                        super.field2595 += (var48.field4606 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field2043;
                                    int var60 = (var51 << 15) / var55 * var49.field2043;
                                    int var61 = (var52 << 15) / var55 * var49.field2043;
                                    if (var49.field2047 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field2599 += arg1 * var59 >> 15;
                                        super.field2602 += arg1 * var60 >> 15;
                                        super.field2595 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class282) class253.field4307.method979(-27732);
                            }
                        }
                    }
                }
            }
            if (var8.field2499 != null) {
                if (var8.field2483 == null) {
                    var8.field2483 = new int[var8.field2499.length];
                    for (int var62 = 0; var62 < var8.field2499.length; ++var62) {
                        class69.method485(var8.field2499[var62], 124);
                        var8.field2483[var62] = ((class22) class220.field3798.method2516((long) var8.field2499[var62], -1)).field238;
                    }
                }
                for (int var63 = 0; var63 < var8.field2483.length; ++var63) {
                    class115 var64 = class123.field2158[var8.field2483[var63]];
                    if (var64.field2047 == 0) {
                        var13 += var64.field2038 * arg1;
                        var14 += var64.field2044 * arg1;
                        var15 += var64.field2030 * arg1;
                        var16 = true;
                    } else {
                        super.field2599 += var64.field2038 * arg1;
                        super.field2602 += var64.field2044 * arg1;
                        super.field2595 += var64.field2030 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field2909 = (short) var13;
                        this.field2910 = (short) var14;
                        this.field2906 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field2902 <<= 1;
                }
            }
            super.field2599 = (int) ((long) super.field2599 + ((long) this.field2909 * (long) this.field2902 >> 23) * (long) arg1);
            super.field2602 = (int) ((long) super.field2602 + ((long) this.field2910 * (long) this.field2902 >> 23) * (long) arg1);
            super.field2595 = (int) ((long) super.field2595 + ((long) this.field2906 * (long) this.field2902 >> 23) * (long) arg1);
        }
    }
}
