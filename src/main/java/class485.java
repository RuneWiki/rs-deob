import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class485 extends class45 {

    @OriginalMember(owner = "client!bs", name = "H", descriptor = "Los;")
    private class308 field7082;

    @OriginalMember(owner = "client!bs", name = "M", descriptor = "S")
    private short field7086;

    @OriginalMember(owner = "client!bs", name = "G", descriptor = "S")
    private short field7081;

    @OriginalMember(owner = "client!bs", name = "J", descriptor = "S")
    private short field7084;

    @OriginalMember(owner = "client!bs", name = "N", descriptor = "S")
    private short field7087;

    @OriginalMember(owner = "client!bs", name = "F", descriptor = "S")
    private short field7080;

    @OriginalMember(owner = "client!bs", name = "I", descriptor = "I")
    private int field7083;

    @OriginalMember(owner = "client!bs", name = "E", descriptor = "I")
    private int field7079;

    @OriginalMember(owner = "client!bs", name = "K", descriptor = "S")
    private short field7085;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(J)V", line = 7)
    public final void method2943(long arg0) {
        int var3 = super.field536 >> class94.field1144 + 12;
        int var4 = super.field530 >> class94.field1144 + 12;
        int var5 = super.field535 >> class319.field4054;
        if (var5 <= 0 && var5 >= -262144 && var3 >= 0 && var3 < class470.field6825 && var4 >= 0 && var4 < class105.field1336) {
            class67 var6 = this.field7082.field3926;
            class343 var7 = this.field7082.field3925;
            class143[] var8 = class520.field7520;
            int var9 = var8[var6.field876].method399(var3, var4);
            int var10;
            if (var6.field876 < class524.field7753 - 1) {
                var10 = var8[var6.field876 + 1].method399(var3, var4);
            } else {
                var10 = var9 - (8 << class94.field1144);
            }
            if (var7.field4364) {
                if (var7.field4396 == -1 && var5 > var9) {
                    this.method2947();
                    return;
                }
                if (var7.field4396 >= 0 && var5 > var8[var7.field4396].method399(var3, var4)) {
                    this.method2947();
                    return;
                }
                if (var7.field4391 == -1 && var5 < var10) {
                    this.method2947();
                    return;
                }
                if (var7.field4391 >= 0 && var5 < var8[var7.field4391 + 1].method399(var3, var4)) {
                    this.method2947();
                    return;
                }
            }
            if (var3 >= var6.field870 && var3 <= var6.field874 && var4 >= var6.field875 && var4 <= var6.field877 && var5 <= var9 && var5 >= var10) {
                var6.field872.field7487.method1834(this, (byte) 116);
            } else {
                int var11;
                for (var11 = class524.field7753 - 1; var11 > 0 && var5 > var8[var11].method399(var3, var4); --var11) {
                }
                if (var11 == 0 && var5 > var8[0].method399(var3, var4)) {
                    this.method2947();
                } else if (class524.field7753 - 1 == var11 && var8[var11].method399(var3, var4) - var5 > 8 << class94.field1144) {
                    this.method2947();
                } else {
                    class490 var12 = class125.field1664[var11][var3][var4];
                    if (var12 == null) {
                        if (var11 == 0) {
                            var12 = class125.field1664[0][var3][var4] = new class490(0, var3, var4);
                        }
                        boolean var13 = class125.field1664[0][var3][var4].field7146 != null;
                        if (var11 == 3 && var13) {
                            this.method2947();
                            return;
                        }
                        for (int var14 = 1; var14 <= var11; ++var14) {
                            if (class125.field1664[var14][var3][var4] == null) {
                                var12 = class125.field1664[var14][var3][var4] = new class490(var14, var3, var4);
                                if (var13) {
                                    ++var12.field7140;
                                }
                            }
                        }
                    }
                    if (var12.field7134 == null) {
                        var12.field7134 = new class517();
                        var12.field7125 = (byte) ((int) (arg0 & 255L));
                    } else if ((byte) ((int) (arg0 & 255L)) != var12.field7125) {
                        var12.field7134.field7487.method1829(19386);
                        var12.field7134.field7493 = false;
                        var12.field7125 = (byte) ((int) (arg0 & 255L));
                    }
                    var12.field7134.field7487.method1834(this, (byte) 116);
                }
            }
        } else {
            this.method2947();
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(JI)V", line = 139)
    public final void method2944(long arg0, int arg1) {
        this.field7086 = (short) (this.field7086 - arg1);
        if (this.field7086 <= 0) {
            this.method2947();
        } else {
            int var4 = super.field536 >> class319.field4054;
            int var5 = super.field535 >> class319.field4054;
            int var6 = super.field530 >> class319.field4054;
            class67 var7 = this.field7082.field3926;
            class343 var8 = this.field7082.field3925;
            if (var8.field4363 != 0) {
                if (this.field7081 - this.field7086 <= var8.field4343) {
                    int var9 = var8.field4390 * arg1 + (this.field7079 >> 16 & 255) + (super.field529 >> 8 & 65280);
                    int var10 = var8.field4380 * arg1 + (this.field7079 >> 8 & 255) + (super.field529 & 65280);
                    int var11 = var8.field4370 * arg1 + (super.field529 << 8 & 65280) + (this.field7079 & 255);
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
                    super.field529 &= -16777216;
                    super.field529 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field7079 &= -16777216;
                    this.field7079 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field7081 - this.field7086 <= var8.field4350) {
                    int var12 = var8.field4344 * arg1 + (this.field7079 >> 24 & 255) + (super.field529 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field529 &= 16777215;
                    super.field529 |= (var12 & 65280) << 16;
                    this.field7079 &= 16777215;
                    this.field7079 |= (var12 & 255) << 24;
                }
            }
            if (var8.field4373 != -1 && this.field7081 - this.field7086 <= var8.field4389) {
                this.field7083 += var8.field4388 * arg1;
            }
            if (var8.field4331 != -1 && this.field7081 - this.field7086 <= var8.field4356) {
                super.field534 += var8.field4349 * arg1;
            }
            int var13 = this.field7084;
            int var14 = this.field7087;
            int var15 = this.field7080;
            boolean var16 = false;
            if (var8.field4351 == 1) {
                int var17 = var4 - this.field7082.field3922;
                int var18 = var5 - this.field7082.field3924;
                int var19 = var6 - this.field7082.field3947;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field4372 * var20 * arg1);
                this.field7083 = (int) ((long) this.field7083 - ((long) this.field7083 * var21 >> 18));
            } else if (var8.field4351 == 2) {
                int var23 = var4 - this.field7082.field3922;
                int var24 = var5 - this.field7082.field3924;
                int var25 = var6 - this.field7082.field3947;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field4372 * var26 * arg1);
                this.field7083 = (int) ((long) this.field7083 - ((long) this.field7083 * var27 >> 28));
            }
            if (var8.field4347 != null) {
                class383 var29 = var7.field868.field268;
                for (class383 var30 = var29.field5042; var29 != var30; var30 = var30.field5042) {
                    class93 var31 = (class93) var30;
                    class174 var32 = var31.field1133;
                    if (var32.field2252 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field4347.length; ++var34) {
                            if (var8.field4347[var34] == var32.field2260) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field1135;
                            int var36 = var5 - var31.field1138;
                            int var37 = var6 - var31.field1134;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field2255) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field1139 * var37 + var31.field1131 * var35 + var32.field2263 * var36) * 65535L / (long) (var32.field2267 * var40);
                                if (var41 >= (long) var32.field2256) {
                                    int var43 = 0;
                                    if (var32.field2264 == 1) {
                                        var43 = (var40 >> 4) * var32.field2258;
                                    } else if (var32.field2264 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field2258;
                                    }
                                    if (var32.field2265 == 0) {
                                        if (var32.field2270 == 0) {
                                            var13 += (var31.field1131 - var43) * arg1;
                                            var14 += (var32.field2263 - var43) * arg1;
                                            var15 += (var31.field1139 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field536 += (var31.field1131 - var43) * arg1;
                                            super.field535 += (var32.field2263 - var43) * arg1;
                                            super.field530 += (var31.field1139 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field2267;
                                        int var45 = (var36 << 15) / var40 * var32.field2267;
                                        int var46 = (var37 << 15) / var40 * var32.field2267;
                                        if (var32.field2270 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field536 += arg1 * var44 >> 15;
                                            super.field535 += arg1 * var45 >> 15;
                                            super.field530 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field4375 != null) {
                for (int var47 = 0; var47 < var8.field4375.length; ++var47) {
                    class93 var48 = (class93) class491.field7152.method2798(-1, (long) var8.field4375[var47]);
                    while (var48 != null) {
                        class174 var49 = var48.field1133;
                        int var50 = var4 - var48.field1135;
                        int var51 = var5 - var48.field1138;
                        int var52 = var6 - var48.field1134;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field2255) {
                            var48 = (class93) class491.field7152.method2796(101);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field1139 * var52 + var48.field1131 * var50 + var49.field2263 * var51) * 65535L / (long) (var49.field2267 * var55);
                            if (var56 < (long) var49.field2256) {
                                var48 = (class93) class491.field7152.method2796(86);
                            } else {
                                int var58 = 0;
                                if (var49.field2264 == 1) {
                                    var58 = (var55 >> 4) * var49.field2258;
                                } else if (var49.field2264 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field2258;
                                }
                                if (var49.field2265 == 0) {
                                    if (var49.field2270 == 0) {
                                        var13 += (var48.field1131 - var58) * arg1;
                                        var14 += (var49.field2263 - var58) * arg1;
                                        var15 += (var48.field1139 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field536 += (var48.field1131 - var58) * arg1;
                                        super.field535 += (var49.field2263 - var58) * arg1;
                                        super.field530 += (var48.field1139 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field2267;
                                    int var60 = (var51 << 15) / var55 * var49.field2267;
                                    int var61 = (var52 << 15) / var55 * var49.field2267;
                                    if (var49.field2270 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field536 += arg1 * var59 >> 15;
                                        super.field535 += arg1 * var60 >> 15;
                                        super.field530 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class93) class491.field7152.method2796(91);
                            }
                        }
                    }
                }
            }
            if (var8.field4329 != null) {
                if (var8.field4337 == null) {
                    var8.field4337 = new int[var8.field4329.length];
                    for (int var62 = 0; var62 < var8.field4329.length; ++var62) {
                        class400.method2374(-38, var8.field4329[var62]);
                        var8.field4337[var62] = ((class101) class40.field509.method2022(-1, (long) var8.field4329[var62])).field1222;
                    }
                }
                for (int var63 = 0; var63 < var8.field4337.length; ++var63) {
                    class174 var64 = class423.field5989[var8.field4337[var63]];
                    if (var64.field2270 == 0) {
                        var13 += var64.field2253 * arg1;
                        var14 += var64.field2263 * arg1;
                        var15 += var64.field2254 * arg1;
                        var16 = true;
                    } else {
                        super.field536 += var64.field2253 * arg1;
                        super.field535 += var64.field2263 * arg1;
                        super.field530 += var64.field2254 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field7084 = (short) var13;
                        this.field7087 = (short) var14;
                        this.field7080 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field7083 <<= 1;
                }
            }
            super.field536 = (int) ((long) super.field536 + ((long) this.field7084 * (long) this.field7083 >> 23) * (long) arg1);
            super.field535 = (int) ((long) super.field535 + ((long) this.field7087 * (long) this.field7083 >> 23) * (long) arg1);
            super.field530 = (int) ((long) super.field530 + ((long) this.field7080 * (long) this.field7083 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Los;IIIIIIIIIIIZZ)V", line = 533)
    public final void method2945(class308 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field7082 = arg0;
        super.field536 = arg1 << class319.field4054;
        super.field535 = arg2 << class319.field4054;
        super.field530 = arg3 << class319.field4054;
        super.field529 = arg9;
        this.field7081 = this.field7086 = (short) arg8;
        super.field534 = arg10;
        super.field532 = arg11;
        super.field537 = arg13;
        this.field7084 = (short) arg4;
        this.field7087 = (short) arg5;
        this.field7080 = (short) arg6;
        this.field7083 = arg7;
        super.field531 = this.field7082.field3941.field4312;
        this.method2946();
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "()V", line = 553)
    private final void method2946() {
        int var1 = this.field7082.field3926.field867;
        if (this.field7082.field3926.field865[var1] != null) {
            this.field7082.field3926.field865[var1].method2947();
        }
        this.field7082.field3926.field865[var1] = this;
        this.field7085 = (short) this.field7082.field3926.field867;
        this.field7082.field3926.field867 = var1 + 1 & 8191;
        this.field7082.field3913.method2099(this, 80);
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "()V", line = 564)
    private final void method2947() {
        this.field7082.field3926.field865[this.field7085] = null;
        class47.field576[class151.field1898] = this;
        class151.field1898 = class151.field1898 + 1 & 1023;
        this.method603(0);
        this.method1083(false);
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Los;IIIIIIIIIIIZZ)V", line = 571)
    public class485(class308 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field7082 = arg0;
        super.field536 = arg1 << class319.field4054;
        super.field535 = arg2 << class319.field4054;
        super.field530 = arg3 << class319.field4054;
        super.field529 = arg9;
        this.field7081 = this.field7086 = (short) arg8;
        super.field534 = arg10;
        super.field532 = arg11;
        super.field537 = arg13;
        this.field7084 = (short) arg4;
        this.field7087 = (short) arg5;
        this.field7080 = (short) arg6;
        this.field7083 = arg7;
        super.field531 = this.field7082.field3941.field4312;
        this.method2946();
    }
}
