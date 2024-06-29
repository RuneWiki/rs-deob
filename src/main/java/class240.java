import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class240 extends class7 {

    @OriginalMember(owner = "client!du", name = "E", descriptor = "Lpk;")
    private class135 field3721;

    @OriginalMember(owner = "client!du", name = "F", descriptor = "S")
    private short field3722;

    @OriginalMember(owner = "client!du", name = "I", descriptor = "S")
    private short field3725;

    @OriginalMember(owner = "client!du", name = "G", descriptor = "S")
    private short field3723;

    @OriginalMember(owner = "client!du", name = "K", descriptor = "S")
    private short field3727;

    @OriginalMember(owner = "client!du", name = "H", descriptor = "S")
    private short field3724;

    @OriginalMember(owner = "client!du", name = "M", descriptor = "I")
    private int field3729;

    @OriginalMember(owner = "client!du", name = "L", descriptor = "I")
    private int field3728;

    @OriginalMember(owner = "client!du", name = "J", descriptor = "S")
    private short field3726;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Lpk;IIIIIIIIIIIZZ)V")
    public final void method1572(class135 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field3721 = arg0;
        super.field101 = arg1 << 12;
        super.field102 = arg2 << 12;
        super.field100 = arg3 << 12;
        super.field104 = arg9;
        this.field3725 = this.field3722 = (short) arg8;
        super.field105 = arg10;
        super.field106 = arg11;
        super.field103 = arg13;
        this.field3723 = (short) arg4;
        this.field3727 = (short) arg5;
        this.field3724 = (short) arg6;
        this.field3729 = arg7;
        super.field109 = this.field3721.field2281.field6000;
        this.method1574();
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "()V")
    private final void method1573() {
        this.field3721.field2274.field1124[this.field3726] = null;
        class491.field7196[class329.field4997] = this;
        class329.field4997 = class329.field4997 + 1 & 1023;
        this.method2352((byte) 117);
        this.method804((byte) -80);
    }

    @OriginalMember(owner = "client!du", name = "c", descriptor = "()V")
    private final void method1574() {
        int var1 = this.field3721.field2274.field1128;
        if (this.field3721.field2274.field1124[var1] != null) {
            this.field3721.field2274.field1124[var1].method1573();
        }
        this.field3721.field2274.field1124[var1] = this;
        this.field3726 = (short) this.field3721.field2274.field1128;
        this.field3721.field2274.field1128 = var1 + 1 & 8191;
        this.field3721.field2287.method531((byte) -59, this);
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(J)V")
    public final void method1575(long arg0) {
        int var3 = super.field101 >> class353.field5216 + 12;
        int var4 = super.field100 >> class353.field5216 + 12;
        int var5 = super.field102 >> 12;
        if (var5 <= 0 && var5 >= -262144 && var3 >= 0 && var3 < class493.field7231 && var4 >= 0 && var4 < class220.field3464) {
            class53 var6 = this.field3721.field2274;
            class143 var7 = this.field3721.field2261;
            class38[] var8 = class520.field7560;
            int var9 = var8[var6.field1141].method177(var3, var4);
            int var10;
            if (var6.field1141 < class138.field2320 - 1) {
                var10 = var8[var6.field1141 + 1].method177(var3, var4);
            } else {
                var10 = var9 - (8 << class353.field5216);
            }
            if (var7.field2392) {
                if (var7.field2398 == -1 && var5 > var9) {
                    this.method1573();
                    return;
                }
                if (var7.field2398 >= 0 && var5 > var8[var7.field2398].method177(var3, var4)) {
                    this.method1573();
                    return;
                }
                if (var7.field2423 == -1 && var5 < var10) {
                    this.method1573();
                    return;
                }
                if (var7.field2423 >= 0 && var5 < var8[var7.field2423 + 1].method177(var3, var4)) {
                    this.method1573();
                    return;
                }
            }
            if (var3 >= var6.field1138 && var3 <= var6.field1134 && var4 >= var6.field1139 && var4 <= var6.field1140 && var5 <= var9 && var5 >= var10) {
                var6.field1135.field7340.method1109(-16823, this);
            } else {
                int var11;
                for (var11 = class138.field2320 - 1; var11 > 0 && var5 > var8[var11].method177(var3, var4); --var11) {
                }
                if (var11 == 0 && var5 > var8[0].method177(var3, var4)) {
                    this.method1573();
                } else if (class138.field2320 - 1 == var11 && var8[var11].method177(var3, var4) - var5 > 8 << class353.field5216) {
                    this.method1573();
                } else {
                    class234 var12 = class518.field7511[var11][var3][var4];
                    if (var12 == null) {
                        if (var11 == 0) {
                            var12 = class518.field7511[0][var3][var4] = new class234(0, var3, var4);
                        }
                        boolean var13 = class518.field7511[0][var3][var4].field3621 != null;
                        if (var11 == 3 && var13) {
                            this.method1573();
                            return;
                        }
                        for (int var14 = 1; var14 <= var11; ++var14) {
                            if (class518.field7511[var14][var3][var4] == null) {
                                var12 = class518.field7511[var14][var3][var4] = new class234(var14, var3, var4);
                                if (var13) {
                                    ++var12.field3600;
                                }
                            }
                        }
                    }
                    if (var12.field3615 == null) {
                        var12.field3615 = new class502();
                        var12.field3601 = (byte) ((int) (arg0 & 255L));
                    } else if ((byte) ((int) (arg0 & 255L)) != var12.field3601) {
                        var12.field3615.field7340.method1112((byte) 96);
                        var12.field3615.field7341 = false;
                        var12.field3601 = (byte) ((int) (arg0 & 255L));
                    }
                    var12.field3615.field7340.method1109(-16823, this);
                }
            }
        } else {
            this.method1573();
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(JI)V")
    public final void method1576(long arg0, int arg1) {
        this.field3722 = (short) (this.field3722 - arg1);
        if (this.field3722 <= 0) {
            this.method1573();
        } else {
            int var4 = super.field101 >> 12;
            int var5 = super.field102 >> 12;
            int var6 = super.field100 >> 12;
            class53 var7 = this.field3721.field2274;
            class143 var8 = this.field3721.field2261;
            if (var8.field2368 != 0) {
                if (this.field3725 - this.field3722 <= var8.field2360) {
                    int var9 = var8.field2381 * arg1 + (super.field104 >> 8 & 65280) + (this.field3728 >> 16 & 255);
                    int var10 = var8.field2376 * arg1 + (this.field3728 >> 8 & 255) + (super.field104 & 65280);
                    int var11 = var8.field2416 * arg1 + (super.field104 << 8 & 65280) + (this.field3728 & 255);
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
                    super.field104 &= -16777216;
                    super.field104 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field3728 &= -16777216;
                    this.field3728 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field3725 - this.field3722 <= var8.field2399) {
                    int var12 = var8.field2394 * arg1 + (super.field104 >> 16 & 65280) + (this.field3728 >> 24 & 255);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field104 &= 16777215;
                    super.field104 |= (var12 & 65280) << 16;
                    this.field3728 &= 16777215;
                    this.field3728 |= (var12 & 255) << 24;
                }
            }
            if (var8.field2389 != -1 && this.field3725 - this.field3722 <= var8.field2426) {
                this.field3729 += var8.field2361 * arg1;
            }
            if (var8.field2388 != -1 && this.field3725 - this.field3722 <= var8.field2395) {
                super.field105 += var8.field2401 * arg1;
            }
            int var13 = this.field3723;
            int var14 = this.field3727;
            int var15 = this.field3724;
            boolean var16 = false;
            if (var8.field2383 == 1) {
                int var17 = var4 - this.field3721.field2255;
                int var18 = var5 - this.field3721.field2269;
                int var19 = var6 - this.field3721.field2285;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field2371 * var20 * arg1);
                this.field3729 = (int) ((long) this.field3729 - ((long) this.field3729 * var21 >> 18));
            } else if (var8.field2383 == 2) {
                int var23 = var4 - this.field3721.field2255;
                int var24 = var5 - this.field3721.field2269;
                int var25 = var6 - this.field3721.field2285;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field2371 * var26 * arg1);
                this.field3729 = (int) ((long) this.field3729 - ((long) this.field3729 * var27 >> 28));
            }
            if (var8.field2400 != null) {
                class261 var29 = var7.field1132.field4458;
                for (class261 var30 = var29.field3972; var29 != var30; var30 = var30.field3972) {
                    class129 var31 = (class129) var30;
                    class307 var32 = var31.field2201;
                    if (var32.field4667 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field2400.length; ++var34) {
                            if (var8.field2400[var34] == var32.field4656) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field2196;
                            int var36 = var5 - var31.field2203;
                            int var37 = var6 - var31.field2191;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field4665) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field2202 * var37 + var31.field2194 * var35 + var32.field4653 * var36) * 65535L / (long) (var32.field4654 * var40);
                                if (var41 >= (long) var32.field4669) {
                                    int var43 = 0;
                                    if (var32.field4650 == 1) {
                                        var43 = (var40 >> 4) * var32.field4658;
                                    } else if (var32.field4650 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field4658;
                                    }
                                    if (var32.field4655 == 0) {
                                        if (var32.field4664 == 0) {
                                            var13 += (var31.field2194 - var43) * arg1;
                                            var14 += (var32.field4653 - var43) * arg1;
                                            var15 += (var31.field2202 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field101 += (var31.field2194 - var43) * arg1;
                                            super.field102 += (var32.field4653 - var43) * arg1;
                                            super.field100 += (var31.field2202 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field4654;
                                        int var45 = (var36 << 15) / var40 * var32.field4654;
                                        int var46 = (var37 << 15) / var40 * var32.field4654;
                                        if (var32.field4664 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field101 += arg1 * var44 >> 15;
                                            super.field102 += arg1 * var45 >> 15;
                                            super.field100 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field2422 != null) {
                for (int var47 = 0; var47 < var8.field2422.length; ++var47) {
                    class129 var48 = (class129) class199.field3242.method1242((long) var8.field2422[var47], 20939);
                    while (var48 != null) {
                        class307 var49 = var48.field2201;
                        int var50 = var4 - var48.field2196;
                        int var51 = var5 - var48.field2203;
                        int var52 = var6 - var48.field2191;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field4665) {
                            var48 = (class129) class199.field3242.method1239((byte) -125);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field2202 * var52 + var48.field2194 * var50 + var49.field4653 * var51) * 65535L / (long) (var49.field4654 * var55);
                            if (var56 < (long) var49.field4669) {
                                var48 = (class129) class199.field3242.method1239((byte) 61);
                            } else {
                                int var58 = 0;
                                if (var49.field4650 == 1) {
                                    var58 = (var55 >> 4) * var49.field4658;
                                } else if (var49.field4650 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field4658;
                                }
                                if (var49.field4655 == 0) {
                                    if (var49.field4664 == 0) {
                                        var13 += (var48.field2194 - var58) * arg1;
                                        var14 += (var49.field4653 - var58) * arg1;
                                        var15 += (var48.field2202 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field101 += (var48.field2194 - var58) * arg1;
                                        super.field102 += (var49.field4653 - var58) * arg1;
                                        super.field100 += (var48.field2202 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field4654;
                                    int var60 = (var51 << 15) / var55 * var49.field4654;
                                    int var61 = (var52 << 15) / var55 * var49.field4654;
                                    if (var49.field4664 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field101 += arg1 * var59 >> 15;
                                        super.field102 += arg1 * var60 >> 15;
                                        super.field100 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class129) class199.field3242.method1239((byte) -124);
                            }
                        }
                    }
                }
            }
            if (var8.field2424 != null) {
                if (var8.field2418 == null) {
                    var8.field2418 = new int[var8.field2424.length];
                    for (int var62 = 0; var62 < var8.field2424.length; ++var62) {
                        class293.method1907(var8.field2424[var62], (byte) -98);
                        var8.field2418[var62] = ((class100) class237.field3666.method1622((long) var8.field2424[var62], -105)).field1923;
                    }
                }
                for (int var63 = 0; var63 < var8.field2418.length; ++var63) {
                    class307 var64 = class289.field4431[var8.field2418[var63]];
                    if (var64.field4664 == 0) {
                        var13 += var64.field4670 * arg1;
                        var14 += var64.field4653 * arg1;
                        var15 += var64.field4659 * arg1;
                        var16 = true;
                    } else {
                        super.field101 += var64.field4670 * arg1;
                        super.field102 += var64.field4653 * arg1;
                        super.field100 += var64.field4659 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field3723 = (short) var13;
                        this.field3727 = (short) var14;
                        this.field3724 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field3729 <<= 1;
                }
            }
            super.field101 = (int) ((long) super.field101 + ((long) this.field3723 * (long) this.field3729 >> 23) * (long) arg1);
            super.field102 = (int) ((long) super.field102 + ((long) this.field3727 * (long) this.field3729 >> 23) * (long) arg1);
            super.field100 = (int) ((long) super.field100 + ((long) this.field3724 * (long) this.field3729 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "(Lpk;IIIIIIIIIIIZZ)V")
    public class240(class135 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field3721 = arg0;
        super.field101 = arg1 << 12;
        super.field102 = arg2 << 12;
        super.field100 = arg3 << 12;
        super.field104 = arg9;
        this.field3725 = this.field3722 = (short) arg8;
        super.field105 = arg10;
        super.field106 = arg11;
        super.field103 = arg13;
        this.field3723 = (short) arg4;
        this.field3727 = (short) arg5;
        this.field3724 = (short) arg6;
        this.field3729 = arg7;
        super.field109 = this.field3721.field2281.field6000;
        this.method1574();
    }
}
