import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class97 extends class462 {

    @OriginalMember(owner = "client!mr", name = "J", descriptor = "Lvd;")
    private class29 field1438;

    @OriginalMember(owner = "client!mr", name = "L", descriptor = "S")
    private short field1440;

    @OriginalMember(owner = "client!mr", name = "I", descriptor = "S")
    private short field1437;

    @OriginalMember(owner = "client!mr", name = "M", descriptor = "S")
    private short field1441;

    @OriginalMember(owner = "client!mr", name = "N", descriptor = "S")
    private short field1442;

    @OriginalMember(owner = "client!mr", name = "G", descriptor = "S")
    private short field1435;

    @OriginalMember(owner = "client!mr", name = "K", descriptor = "I")
    private int field1439;

    @OriginalMember(owner = "client!mr", name = "H", descriptor = "I")
    private int field1436;

    @OriginalMember(owner = "client!mr", name = "F", descriptor = "S")
    private short field1434;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lvd;IIIIIIIIIIIZZ)V", line = 3)
    public final void method646(class29 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field1438 = arg0;
        super.field6911 = arg1 << 12;
        super.field6914 = arg2 << 12;
        super.field6918 = arg3 << 12;
        super.field6917 = arg9;
        this.field1437 = this.field1440 = (short) arg8;
        super.field6910 = arg10;
        super.field6913 = arg11;
        super.field6909 = arg13;
        this.field1441 = (short) arg4;
        this.field1442 = (short) arg5;
        this.field1435 = (short) arg6;
        this.field1439 = arg7;
        super.field6907 = this.field1438.field441.field5984;
        this.method650();
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(J)V", line = 24)
    public final void method647(long arg0) {
        int var3 = super.field6911 >> class10.field179 + 12;
        int var4 = super.field6918 >> class10.field179 + 12;
        int var5 = super.field6914 >> 12;
        if (var5 <= 0 && var5 >= -262144 && var3 >= 0 && var3 < class533.field7842 && var4 >= 0 && var4 < class475.field7051) {
            class228 var6 = this.field1438.field433;
            class296 var7 = this.field1438.field417;
            class23[] var8 = class306.field4447;
            int var9 = var8[var6.field3244].method222(var3, var4);
            int var10;
            if (var6.field3244 < class141.field1892 - 1) {
                var10 = var8[var6.field3244 + 1].method222(var3, var4);
            } else {
                var10 = var9 - (8 << class10.field179);
            }
            if (var7.field4368) {
                if (var7.field4339 == -1 && var5 > var9) {
                    this.method648();
                    return;
                }
                if (var7.field4339 >= 0 && var5 > var8[var7.field4339].method222(var3, var4)) {
                    this.method648();
                    return;
                }
                if (var7.field4330 == -1 && var5 < var10) {
                    this.method648();
                    return;
                }
                if (var7.field4330 >= 0 && var5 < var8[var7.field4330 + 1].method222(var3, var4)) {
                    this.method648();
                    return;
                }
            }
            if (var3 >= var6.field3247 && var3 <= var6.field3242 && var4 >= var6.field3246 && var4 <= var6.field3245 && var5 <= var9 && var5 >= var10) {
                var6.field3243.field1827.method2467(1, this);
            } else {
                int var11;
                for (var11 = class141.field1892 - 1; var11 > 0 && var5 > var8[var11].method222(var3, var4); --var11) {
                }
                if (var11 == 0 && var5 > var8[0].method222(var3, var4)) {
                    this.method648();
                } else if (class141.field1892 - 1 == var11 && var8[var11].method222(var3, var4) - var5 > 8 << class10.field179) {
                    this.method648();
                } else {
                    class452 var12 = class443.field6672[var11][var3][var4];
                    if (var12 == null) {
                        if (var11 == 0) {
                            var12 = class443.field6672[0][var3][var4] = new class452(0, var3, var4);
                        }
                        boolean var13 = class443.field6672[0][var3][var4].field6795 != null;
                        if (var11 == 3 && var13) {
                            this.method648();
                            return;
                        }
                        for (int var14 = 1; var14 <= var11; ++var14) {
                            if (class443.field6672[var14][var3][var4] == null) {
                                var12 = class443.field6672[var14][var3][var4] = new class452(var14, var3, var4);
                                if (var13) {
                                    ++var12.field6810;
                                }
                            }
                        }
                    }
                    if (var12.field6792 == null) {
                        var12.field6792 = new class137();
                        var12.field6808 = (byte) ((int) (arg0 & 255L));
                    } else if ((byte) ((int) (arg0 & 255L)) != var12.field6808) {
                        var12.field6792.field1827.method2469(true);
                        var12.field6792.field1829 = false;
                        var12.field6808 = (byte) ((int) (arg0 & 255L));
                    }
                    var12.field6792.field1827.method2467(1, this);
                }
            }
        } else {
            this.method648();
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "()V", line = 152)
    private final void method648() {
        this.field1438.field433.field3239[this.field1434] = null;
        class457.field6857[class263.field3685] = this;
        class263.field3685 = class263.field3685 + 1 & 1023;
        this.method1184(-85);
        this.method2606(11129);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(JI)V", line = 160)
    public final void method649(long arg0, int arg1) {
        this.field1440 = (short) (this.field1440 - arg1);
        if (this.field1440 <= 0) {
            this.method648();
        } else {
            int var4 = super.field6911 >> 12;
            int var5 = super.field6914 >> 12;
            int var6 = super.field6918 >> 12;
            class228 var7 = this.field1438.field433;
            class296 var8 = this.field1438.field417;
            if (var8.field4307 != 0) {
                if (this.field1437 - this.field1440 <= var8.field4363) {
                    int var9 = var8.field4314 * arg1 + (this.field1436 >> 16 & 255) + (super.field6917 >> 8 & 65280);
                    int var10 = var8.field4328 * arg1 + (this.field1436 >> 8 & 255) + (super.field6917 & 65280);
                    int var11 = var8.field4312 * arg1 + (super.field6917 << 8 & 65280) + (this.field1436 & 255);
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
                    super.field6917 &= -16777216;
                    super.field6917 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field1436 &= -16777216;
                    this.field1436 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field1437 - this.field1440 <= var8.field4349) {
                    int var12 = var8.field4354 * arg1 + (this.field1436 >> 24 & 255) + (super.field6917 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field6917 &= 16777215;
                    super.field6917 |= (var12 & 65280) << 16;
                    this.field1436 &= 16777215;
                    this.field1436 |= (var12 & 255) << 24;
                }
            }
            if (var8.field4306 != -1 && this.field1437 - this.field1440 <= var8.field4320) {
                this.field1439 += var8.field4342 * arg1;
            }
            if (var8.field4372 != -1 && this.field1437 - this.field1440 <= var8.field4366) {
                super.field6910 += var8.field4340 * arg1;
            }
            int var13 = this.field1441;
            int var14 = this.field1442;
            int var15 = this.field1435;
            boolean var16 = false;
            if (var8.field4322 == 1) {
                int var17 = var4 - this.field1438.field420;
                int var18 = var5 - this.field1438.field429;
                int var19 = var6 - this.field1438.field436;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field4375 * var20 * arg1);
                this.field1439 = (int) ((long) this.field1439 - ((long) this.field1439 * var21 >> 18));
            } else if (var8.field4322 == 2) {
                int var23 = var4 - this.field1438.field420;
                int var24 = var5 - this.field1438.field429;
                int var25 = var6 - this.field1438.field436;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field4375 * var26 * arg1);
                this.field1439 = (int) ((long) this.field1439 - ((long) this.field1439 * var27 >> 28));
            }
            if (var8.field4360 != null) {
                class5 var29 = var7.field3240.field906;
                for (class5 var30 = var29.field39; var29 != var30; var30 = var30.field39) {
                    class339 var31 = (class339) var30;
                    class8 var32 = var31.field5248;
                    if (var32.field170 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field4360.length; ++var34) {
                            if (var8.field4360[var34] == var32.field167) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field5258;
                            int var36 = var5 - var31.field5253;
                            int var37 = var6 - var31.field5254;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field165) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field5247 * var37 + var31.field5250 * var35 + var32.field154 * var36) * 65535L / (long) (var32.field163 * var40);
                                if (var41 >= (long) var32.field160) {
                                    int var43 = 0;
                                    if (var32.field161 == 1) {
                                        var43 = (var40 >> 4) * var32.field162;
                                    } else if (var32.field161 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field162;
                                    }
                                    if (var32.field157 == 0) {
                                        if (var32.field168 == 0) {
                                            var13 += (var31.field5250 - var43) * arg1;
                                            var14 += (var32.field154 - var43) * arg1;
                                            var15 += (var31.field5247 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field6911 += (var31.field5250 - var43) * arg1;
                                            super.field6914 += (var32.field154 - var43) * arg1;
                                            super.field6918 += (var31.field5247 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field163;
                                        int var45 = (var36 << 15) / var40 * var32.field163;
                                        int var46 = (var37 << 15) / var40 * var32.field163;
                                        if (var32.field168 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field6911 += arg1 * var44 >> 15;
                                            super.field6914 += arg1 * var45 >> 15;
                                            super.field6918 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field4357 != null) {
                for (int var47 = 0; var47 < var8.field4357.length; ++var47) {
                    class339 var48 = (class339) class429.field6540.method2848((long) var8.field4357[var47], 28059);
                    while (var48 != null) {
                        class8 var49 = var48.field5248;
                        int var50 = var4 - var48.field5258;
                        int var51 = var5 - var48.field5253;
                        int var52 = var6 - var48.field5254;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field165) {
                            var48 = (class339) class429.field6540.method2852(-26849);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field5247 * var52 + var48.field5250 * var50 + var49.field154 * var51) * 65535L / (long) (var49.field163 * var55);
                            if (var56 < (long) var49.field160) {
                                var48 = (class339) class429.field6540.method2852(-26849);
                            } else {
                                int var58 = 0;
                                if (var49.field161 == 1) {
                                    var58 = (var55 >> 4) * var49.field162;
                                } else if (var49.field161 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field162;
                                }
                                if (var49.field157 == 0) {
                                    if (var49.field168 == 0) {
                                        var13 += (var48.field5250 - var58) * arg1;
                                        var14 += (var49.field154 - var58) * arg1;
                                        var15 += (var48.field5247 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field6911 += (var48.field5250 - var58) * arg1;
                                        super.field6914 += (var49.field154 - var58) * arg1;
                                        super.field6918 += (var48.field5247 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field163;
                                    int var60 = (var51 << 15) / var55 * var49.field163;
                                    int var61 = (var52 << 15) / var55 * var49.field163;
                                    if (var49.field168 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field6911 += arg1 * var59 >> 15;
                                        super.field6914 += arg1 * var60 >> 15;
                                        super.field6918 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class339) class429.field6540.method2852(-26849);
                            }
                        }
                    }
                }
            }
            if (var8.field4326 != null) {
                if (var8.field4308 == null) {
                    var8.field4308 = new int[var8.field4326.length];
                    for (int var62 = 0; var62 < var8.field4326.length; ++var62) {
                        class77.method535(var8.field4326[var62], -67);
                        var8.field4308[var62] = ((class160) class138.field1842.method1747((long) var8.field4326[var62], false)).field2088;
                    }
                }
                for (int var63 = 0; var63 < var8.field4308.length; ++var63) {
                    class8 var64 = class180.field2429[var8.field4308[var63]];
                    if (var64.field168 == 0) {
                        var13 += var64.field159 * arg1;
                        var14 += var64.field154 * arg1;
                        var15 += var64.field164 * arg1;
                        var16 = true;
                    } else {
                        super.field6911 += var64.field159 * arg1;
                        super.field6914 += var64.field154 * arg1;
                        super.field6918 += var64.field164 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field1441 = (short) var13;
                        this.field1442 = (short) var14;
                        this.field1435 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field1439 <<= 1;
                }
            }
            super.field6911 = (int) ((long) super.field6911 + ((long) this.field1441 * (long) this.field1439 >> 23) * (long) arg1);
            super.field6914 = (int) ((long) super.field6914 + ((long) this.field1442 * (long) this.field1439 >> 23) * (long) arg1);
            super.field6918 = (int) ((long) super.field6918 + ((long) this.field1435 * (long) this.field1439 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "()V", line = 555)
    private final void method650() {
        int var1 = this.field1438.field433.field3238;
        if (this.field1438.field433.field3239[var1] != null) {
            this.field1438.field433.field3239[var1].method648();
        }
        this.field1438.field433.field3239[var1] = this;
        this.field1434 = (short) this.field1438.field433.field3238;
        this.field1438.field433.field3238 = var1 + 1 & 8191;
        this.field1438.field443.method3045(this, 27);
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lvd;IIIIIIIIIIIZZ)V", line = 571)
    public class97(class29 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field1438 = arg0;
        super.field6911 = arg1 << 12;
        super.field6914 = arg2 << 12;
        super.field6918 = arg3 << 12;
        super.field6917 = arg9;
        this.field1437 = this.field1440 = (short) arg8;
        super.field6910 = arg10;
        super.field6913 = arg11;
        super.field6909 = arg13;
        this.field1441 = (short) arg4;
        this.field1442 = (short) arg5;
        this.field1435 = (short) arg6;
        this.field1439 = arg7;
        super.field6907 = this.field1438.field441.field5984;
        this.method650();
    }
}
