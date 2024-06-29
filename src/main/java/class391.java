import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public class class391 extends class663 {

    @OriginalMember(owner = "client!mea", name = "G", descriptor = "Lru;")
    public class176 field5218;

    @OriginalMember(owner = "client!mea", name = "H", descriptor = "S")
    private short field5219;

    @OriginalMember(owner = "client!mea", name = "C", descriptor = "S")
    private short field5214;

    @OriginalMember(owner = "client!mea", name = "I", descriptor = "S")
    private short field5220;

    @OriginalMember(owner = "client!mea", name = "J", descriptor = "S")
    private short field5221;

    @OriginalMember(owner = "client!mea", name = "D", descriptor = "S")
    private short field5215;

    @OriginalMember(owner = "client!mea", name = "F", descriptor = "I")
    private int field5217;

    @OriginalMember(owner = "client!mea", name = "E", descriptor = "I")
    private int field5216;

    @OriginalMember(owner = "client!mea", name = "K", descriptor = "S")
    private short field5222;

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(JI)V")
    public final void method2135(long arg0, int arg1) {
        this.field5219 = (short) (this.field5219 - arg1);
        if (this.field5219 <= 0) {
            this.method2137();
        } else {
            int var4 = super.field9426 >> 12;
            int var5 = super.field9421 >> 12;
            int var6 = super.field9423 >> 12;
            class202 var7 = this.field5218.field2122;
            class478 var8 = this.field5218.field2125;
            if (var8.field7004 != 0) {
                if (this.field5214 - this.field5219 <= var8.field6964) {
                    int var9 = var8.field7002 * arg1 + (super.field9427 >> 8 & 65280) + (this.field5216 >> 16 & 255);
                    int var10 = var8.field6965 * arg1 + (this.field5216 >> 8 & 255) + (super.field9427 & 65280);
                    int var11 = var8.field7027 * arg1 + (super.field9427 << 8 & 65280) + (this.field5216 & 255);
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
                    super.field9427 &= -16777216;
                    super.field9427 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field5216 &= -16777216;
                    this.field5216 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field5214 - this.field5219 <= var8.field7010) {
                    int var12 = var8.field7003 * arg1 + (super.field9427 >> 16 & 65280) + (this.field5216 >> 24 & 255);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field9427 &= 16777215;
                    super.field9427 |= (var12 & 65280) << 16;
                    this.field5216 &= 16777215;
                    this.field5216 |= (var12 & 255) << 24;
                }
            }
            if (var8.field7008 != -1 && this.field5214 - this.field5219 <= var8.field6971) {
                this.field5217 += var8.field6978 * arg1;
            }
            if (var8.field6961 != -1 && this.field5214 - this.field5219 <= var8.field6958) {
                super.field9418 += var8.field7000 * arg1;
            }
            int var13 = this.field5220;
            int var14 = this.field5221;
            int var15 = this.field5215;
            boolean var16 = false;
            if (var8.field6977 == 1) {
                int var17 = var4 - this.field5218.field2097;
                int var18 = var5 - this.field5218.field2112;
                int var19 = var6 - this.field5218.field2094;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18)) >> 2;
                long var21 = (long) (var8.field7015 * var20 * arg1);
                this.field5217 = (int) ((long) this.field5217 - ((long) this.field5217 * var21 >> 18));
            } else if (var8.field6977 == 2) {
                int var23 = var4 - this.field5218.field2097;
                int var24 = var5 - this.field5218.field2112;
                int var25 = var6 - this.field5218.field2094;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field7015 * var26 * arg1);
                this.field5217 = (int) ((long) this.field5217 - ((long) this.field5217 * var27 >> 28));
            }
            if (var8.field7005 != null) {
                class270 var29 = var7.field2477.field7992;
                for (class270 var30 = var29.field3394; var29 != var30; var30 = var30.field3394) {
                    class636 var31 = (class636) var30;
                    class138 var32 = var31.field8996;
                    if (var32.field1583 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field7005.length; ++var34) {
                            if (var8.field7005[var34] == var32.field1577) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field8997;
                            int var36 = var5 - var31.field8998;
                            int var37 = var6 - var31.field9002;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field1582) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field8999 * var37 + var31.field8995 * var35 + var32.field1570 * var36) * 65535L / (long) (var32.field1579 * var40);
                                if (var41 >= (long) var32.field1585) {
                                    int var43 = 0;
                                    if (var32.field1575 == 1) {
                                        var43 = (var40 >> 4) * var32.field1581;
                                    } else if (var32.field1575 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field1581;
                                    }
                                    if (var32.field1574 == 0) {
                                        if (var32.field1578 == 0) {
                                            var13 += (var31.field8995 - var43) * arg1;
                                            var14 += (var32.field1570 - var43) * arg1;
                                            var15 += (var31.field8999 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field9426 += (var31.field8995 - var43) * arg1;
                                            super.field9421 += (var32.field1570 - var43) * arg1;
                                            super.field9423 += (var31.field8999 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field1579;
                                        int var45 = (var36 << 15) / var40 * var32.field1579;
                                        int var46 = (var37 << 15) / var40 * var32.field1579;
                                        if (var32.field1578 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field9426 += arg1 * var44 >> 15;
                                            super.field9421 += arg1 * var45 >> 15;
                                            super.field9423 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field7016 != null) {
                for (int var47 = 0; var47 < var8.field7016.length; ++var47) {
                    class636 var48 = (class636) class592.field8416.method1486((long) var8.field7016[var47], (byte) 127);
                    while (var48 != null) {
                        class138 var49 = var48.field8996;
                        int var50 = var4 - var48.field8997;
                        int var51 = var5 - var48.field8998;
                        int var52 = var6 - var48.field9002;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field1582) {
                            var48 = (class636) class592.field8416.method1485(10522);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field8999 * var52 + var48.field8995 * var50 + var49.field1570 * var51) * 65535L / (long) (var49.field1579 * var55);
                            if (var56 < (long) var49.field1585) {
                                var48 = (class636) class592.field8416.method1485(10522);
                            } else {
                                int var58 = 0;
                                if (var49.field1575 == 1) {
                                    var58 = (var55 >> 4) * var49.field1581;
                                } else if (var49.field1575 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field1581;
                                }
                                if (var49.field1574 == 0) {
                                    if (var49.field1578 == 0) {
                                        var13 += (var48.field8995 - var58) * arg1;
                                        var14 += (var49.field1570 - var58) * arg1;
                                        var15 += (var48.field8999 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field9426 += (var48.field8995 - var58) * arg1;
                                        super.field9421 += (var49.field1570 - var58) * arg1;
                                        super.field9423 += (var48.field8999 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field1579;
                                    int var60 = (var51 << 15) / var55 * var49.field1579;
                                    int var61 = (var52 << 15) / var55 * var49.field1579;
                                    if (var49.field1578 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field9426 += arg1 * var59 >> 15;
                                        super.field9421 += arg1 * var60 >> 15;
                                        super.field9423 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class636) class592.field8416.method1485(10522);
                            }
                        }
                    }
                }
            }
            if (var8.field6994 != null) {
                if (var8.field7018 == null) {
                    var8.field7018 = new int[var8.field6994.length];
                    for (int var62 = 0; var62 < var8.field6994.length; ++var62) {
                        class692.method3830(var8.field6994[var62], (byte) 23);
                        var8.field7018[var62] = ((class337) class38.field417.method3234((byte) -79, (long) var8.field6994[var62])).field4415;
                    }
                }
                for (int var63 = 0; var63 < var8.field7018.length; ++var63) {
                    class138 var64 = class286.field3662[var8.field7018[var63]];
                    if (var64.field1578 == 0) {
                        var13 += var64.field1568 * arg1;
                        var14 += var64.field1570 * arg1;
                        var15 += var64.field1586 * arg1;
                        var16 = true;
                    } else {
                        super.field9426 += var64.field1568 * arg1;
                        super.field9421 += var64.field1570 * arg1;
                        super.field9423 += var64.field1586 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field5220 = (short) var13;
                        this.field5221 = (short) var14;
                        this.field5215 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field5217 <<= 1;
                }
            }
            super.field9426 = (int) ((long) super.field9426 + ((long) (this.field5217 << 2) * (long) this.field5220 >> 23) * (long) arg1);
            super.field9421 = (int) ((long) super.field9421 + ((long) (this.field5217 << 2) * (long) this.field5221 >> 23) * (long) arg1);
            super.field9423 = (int) ((long) super.field9423 + ((long) (this.field5217 << 2) * (long) this.field5215 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(Loa;J)V")
    public final void method2136(class635 arg0, long arg1) {
        int var4 = super.field9426 >> class8.field70 + 12;
        int var5 = super.field9423 >> class8.field70 + 12;
        int var6 = super.field9421 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class181.field2222 && var5 >= 0 && var5 < class272.field3451) {
            class202 var7 = this.field5218.field2122;
            class478 var8 = this.field5218.field2125;
            class137[] var9 = class628.field8912;
            int var10 = var7.field2480;
            class287 var11 = class97.field1074[var7.field2480][var4][var5];
            if (var11 != null) {
                var10 = var11.field3685;
            }
            int var12 = var9[var10].method253(var4, var5);
            int var13;
            if (var10 < class337.field4416 - 1) {
                var13 = var9[var10 + 1].method253(var4, var5);
            } else {
                var13 = var12 - (8 << class8.field70);
            }
            if (var8.field7023) {
                if (var8.field7017 == -1 && var6 > var12) {
                    this.method2137();
                    return;
                }
                if (var8.field7017 >= 0 && var6 > var9[var8.field7017].method253(var4, var5)) {
                    this.method2137();
                    return;
                }
                if (var8.field6981 == -1 && var6 < var13) {
                    this.method2137();
                    return;
                }
                if (var8.field6981 >= 0 && var6 < var9[var8.field6981 + 1].method253(var4, var5)) {
                    this.method2137();
                    return;
                }
            }
            if (var4 >= var7.field2479 && var4 <= var7.field2485 && var5 >= var7.field2481 && var5 <= var7.field2484 && var6 <= var12 && var6 >= var13) {
                var7.field2482.field2558.method3126(115, this);
            } else {
                int var14;
                for (var14 = class337.field4416 - 1; var14 > 0 && var6 > var9[var14].method253(var4, var5); --var14) {
                }
                if (var8.field7021 && var14 == 0 && var6 > var9[0].method253(var4, var5)) {
                    this.method2137();
                } else if (class337.field4416 - 1 == var14 && var9[var14].method253(var4, var5) - var6 > 8 << class8.field70) {
                    this.method2137();
                } else {
                    class287 var15 = class97.field1074[var14][var4][var5];
                    if (var15 == null) {
                        if (var14 == 0 || class97.field1074[0][var4][var5] == null) {
                            var15 = class97.field1074[0][var4][var5] = new class287(0, var4, var5);
                        }
                        boolean var16 = class97.field1074[0][var4][var5].field3688 != null;
                        if (var14 == 3 && var16) {
                            this.method2137();
                            return;
                        }
                        for (int var17 = 1; var17 <= var14; ++var17) {
                            if (class97.field1074[var17][var4][var5] == null) {
                                var15 = class97.field1074[var17][var4][var5] = new class287(var17, var4, var5);
                                if (var16) {
                                    ++var15.field3685;
                                }
                            }
                        }
                    }
                    if (var8.field6982) {
                        int var18 = super.field9426 >> 12;
                        int var19 = super.field9423 >> 12;
                        if (var15.field3697 != null) {
                            class396 var20 = var15.field3697.method450(94, arg0);
                            if (var20 != null && var20.method2167(var6, var18, (byte) 116, var19)) {
                                this.method2137();
                                return;
                            }
                        }
                        if (var15.field3690 != null) {
                            class396 var21 = var15.field3690.method450(-25, arg0);
                            if (var21 != null && var21.method2167(var6, var18, (byte) 50, var19)) {
                                this.method2137();
                                return;
                            }
                        }
                        if (var15.field3686 != null) {
                            class396 var22 = var15.field3686.method450(96, arg0);
                            if (var22 != null && var22.method2167(var6, var18, (byte) 46, var19)) {
                                this.method2137();
                                return;
                            }
                        }
                        for (class60 var23 = var15.field3680; var23 != null; var23 = var23.field623) {
                            class396 var24 = var23.field625.method450(-41, arg0);
                            if (var24 != null && var24.method2167(var6, var18, (byte) 61, var19)) {
                                this.method2137();
                                return;
                            }
                        }
                    }
                    if (var15.field3681 == null) {
                        var15.field3681 = new class211();
                        var15.field3683 = (byte) ((int) (arg1 & 255L));
                    } else if ((byte) ((int) (arg1 & 255L)) != var15.field3683) {
                        var15.field3681.field2558.method3125(0);
                        var15.field3681.field2562 = false;
                        var15.field3683 = (byte) ((int) (arg1 & 255L));
                    }
                    var15.field3681.field2558.method3126(113, this);
                }
            }
        } else {
            this.method2137();
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "()V")
    public final void method2137() {
        this.field5218.field2122.field2474[this.field5222] = null;
        class554.field7899[class73.field765] = this;
        class73.field765 = class73.field765 + 1 & 1023;
        this.method1374((byte) -101);
        this.method1901(false);
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(Lru;IIIIIIIIIIIZZ)V")
    public final void method2138(class176 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field5218 = arg0;
        super.field9426 = arg1 << 12;
        super.field9421 = arg2 << 12;
        super.field9423 = arg3 << 12;
        super.field9427 = arg9;
        this.field5214 = this.field5219 = (short) arg8;
        super.field9418 = arg10;
        super.field9425 = arg11;
        super.field9419 = arg13;
        this.field5220 = (short) arg4;
        this.field5221 = (short) arg5;
        this.field5215 = (short) arg6;
        this.field5217 = arg7;
        super.field9428 = this.field5218.field2118.field4880;
        this.method2139();
    }

    @OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Lru;IIIIIIIIIIIZZ)V")
    public class391(class176 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field5218 = arg0;
        super.field9426 = arg1 << 12;
        super.field9421 = arg2 << 12;
        super.field9423 = arg3 << 12;
        super.field9427 = arg9;
        this.field5214 = this.field5219 = (short) arg8;
        super.field9418 = arg10;
        super.field9425 = arg11;
        super.field9419 = arg13;
        this.field5220 = (short) arg4;
        this.field5221 = (short) arg5;
        this.field5215 = (short) arg6;
        this.field5217 = arg7;
        super.field9428 = this.field5218.field2118.field4880;
        this.method2139();
    }

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "()V")
    private final void method2139() {
        int var1 = this.field5218.field2122.field2468;
        if (this.field5218.field2122.field2474[var1] != null) {
            this.field5218.field2122.field2474[var1].method2137();
        }
        this.field5218.field2122.field2474[var1] = this;
        this.field5222 = (short) this.field5218.field2122.field2468;
        this.field5218.field2122.field2468 = var1 + 1 & 8191;
        this.field5218.field2106.method87(82, this);
    }
}
