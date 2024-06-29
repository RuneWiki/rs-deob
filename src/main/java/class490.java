import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class490 extends class41 {

    @OriginalMember(owner = "client!dq", name = "K", descriptor = "Laf;")
    private class297 field7256;

    @OriginalMember(owner = "client!dq", name = "L", descriptor = "S")
    private short field7257;

    @OriginalMember(owner = "client!dq", name = "N", descriptor = "S")
    private short field7259;

    @OriginalMember(owner = "client!dq", name = "I", descriptor = "S")
    private short field7254;

    @OriginalMember(owner = "client!dq", name = "O", descriptor = "S")
    private short field7260;

    @OriginalMember(owner = "client!dq", name = "M", descriptor = "S")
    private short field7258;

    @OriginalMember(owner = "client!dq", name = "J", descriptor = "I")
    private int field7255;

    @OriginalMember(owner = "client!dq", name = "H", descriptor = "I")
    private int field7253;

    @OriginalMember(owner = "client!dq", name = "G", descriptor = "S")
    private short field7252;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(JI)V", line = 3)
    public final void method2915(long arg0, int arg1) {
        this.field7257 = (short) (this.field7257 - arg1);
        if (this.field7257 <= 0) {
            this.method2917();
        } else {
            int var4 = super.field738 >> class267.field3840;
            int var5 = super.field743 >> class267.field3840;
            int var6 = super.field745 >> class267.field3840;
            class94 var7 = this.field7256.field4228;
            class21 var8 = this.field7256.field4214;
            if (var8.field424 != 0) {
                if (this.field7259 - this.field7257 <= var8.field369) {
                    int var9 = var8.field364 * arg1 + (this.field7253 >> 16 & 255) + (super.field735 >> 8 & 65280);
                    int var10 = var8.field362 * arg1 + (this.field7253 >> 8 & 255) + (super.field735 & 65280);
                    int var11 = var8.field391 * arg1 + (super.field735 << 8 & 65280) + (this.field7253 & 255);
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
                    super.field735 &= -16777216;
                    super.field735 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field7253 &= -16777216;
                    this.field7253 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field7259 - this.field7257 <= var8.field410) {
                    int var12 = var8.field411 * arg1 + (this.field7253 >> 24 & 255) + (super.field735 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field735 &= 16777215;
                    super.field735 |= (var12 & 65280) << 16;
                    this.field7253 &= 16777215;
                    this.field7253 |= (var12 & 255) << 24;
                }
            }
            if (var8.field379 != -1 && this.field7259 - this.field7257 <= var8.field367) {
                this.field7255 += var8.field396 * arg1;
            }
            if (var8.field412 != -1 && this.field7259 - this.field7257 <= var8.field392) {
                super.field744 += var8.field395 * arg1;
            }
            int var13 = this.field7254;
            int var14 = this.field7260;
            int var15 = this.field7258;
            boolean var16 = false;
            if (var8.field377 == 1) {
                int var17 = var4 - this.field7256.field4244;
                int var18 = var5 - this.field7256.field4217;
                int var19 = var6 - this.field7256.field4241;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field398 * var20 * arg1);
                this.field7255 = (int) ((long) this.field7255 - ((long) this.field7255 * var21 >> 18));
            } else if (var8.field377 == 2) {
                int var23 = var4 - this.field7256.field4244;
                int var24 = var5 - this.field7256.field4217;
                int var25 = var6 - this.field7256.field4241;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field398 * var26 * arg1);
                this.field7255 = (int) ((long) this.field7255 - ((long) this.field7255 * var27 >> 28));
            }
            if (var8.field376 != null) {
                class320 var29 = var7.field1591.field5929;
                for (class320 var30 = var29.field4901; var29 != var30; var30 = var30.field4901) {
                    class372 var31 = (class372) var30;
                    class146 var32 = var31.field5654;
                    if (var32.field2340 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field376.length; ++var34) {
                            if (var8.field376[var34] == var32.field2333) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field5650;
                            int var36 = var5 - var31.field5656;
                            int var37 = var6 - var31.field5652;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field2330) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field5649 * var37 + var31.field5645 * var35 + var32.field2332 * var36) * 65535L / (long) (var32.field2324 * var40);
                                if (var41 >= (long) var32.field2339) {
                                    int var43 = 0;
                                    if (var32.field2334 == 1) {
                                        var43 = (var40 >> 4) * var32.field2338;
                                    } else if (var32.field2334 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field2338;
                                    }
                                    if (var32.field2323 == 0) {
                                        if (var32.field2337 == 0) {
                                            var13 += (var31.field5645 - var43) * arg1;
                                            var14 += (var32.field2332 - var43) * arg1;
                                            var15 += (var31.field5649 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field738 += (var31.field5645 - var43) * arg1;
                                            super.field743 += (var32.field2332 - var43) * arg1;
                                            super.field745 += (var31.field5649 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field2324;
                                        int var45 = (var36 << 15) / var40 * var32.field2324;
                                        int var46 = (var37 << 15) / var40 * var32.field2324;
                                        if (var32.field2337 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field738 += arg1 * var44 >> 15;
                                            super.field743 += arg1 * var45 >> 15;
                                            super.field745 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field416 != null) {
                for (int var47 = 0; var47 < var8.field416.length; ++var47) {
                    class372 var48 = (class372) class334.field5047.method3102((byte) -42, (long) var8.field416[var47]);
                    while (var48 != null) {
                        class146 var49 = var48.field5654;
                        int var50 = var4 - var48.field5650;
                        int var51 = var5 - var48.field5656;
                        int var52 = var6 - var48.field5652;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field2330) {
                            var48 = (class372) class334.field5047.method3100(-1601818136);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field5649 * var52 + var48.field5645 * var50 + var49.field2332 * var51) * 65535L / (long) (var49.field2324 * var55);
                            if (var56 < (long) var49.field2339) {
                                var48 = (class372) class334.field5047.method3100(-1601818136);
                            } else {
                                int var58 = 0;
                                if (var49.field2334 == 1) {
                                    var58 = (var55 >> 4) * var49.field2338;
                                } else if (var49.field2334 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field2338;
                                }
                                if (var49.field2323 == 0) {
                                    if (var49.field2337 == 0) {
                                        var13 += (var48.field5645 - var58) * arg1;
                                        var14 += (var49.field2332 - var58) * arg1;
                                        var15 += (var48.field5649 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field738 += (var48.field5645 - var58) * arg1;
                                        super.field743 += (var49.field2332 - var58) * arg1;
                                        super.field745 += (var48.field5649 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field2324;
                                    int var60 = (var51 << 15) / var55 * var49.field2324;
                                    int var61 = (var52 << 15) / var55 * var49.field2324;
                                    if (var49.field2337 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field738 += arg1 * var59 >> 15;
                                        super.field743 += arg1 * var60 >> 15;
                                        super.field745 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class372) class334.field5047.method3100(-1601818136);
                            }
                        }
                    }
                }
            }
            if (var8.field378 != null) {
                if (var8.field408 == null) {
                    var8.field408 = new int[var8.field378.length];
                    for (int var62 = 0; var62 < var8.field378.length; ++var62) {
                        class42.method415(-107, var8.field378[var62]);
                        var8.field408[var62] = ((class451) class394.field5954.method171((byte) 64, (long) var8.field378[var62])).field6742;
                    }
                }
                for (int var63 = 0; var63 < var8.field408.length; ++var63) {
                    class146 var64 = class468.field6970[var8.field408[var63]];
                    if (var64.field2337 == 0) {
                        var13 += var64.field2327 * arg1;
                        var14 += var64.field2332 * arg1;
                        var15 += var64.field2325 * arg1;
                        var16 = true;
                    } else {
                        super.field738 += var64.field2327 * arg1;
                        super.field743 += var64.field2332 * arg1;
                        super.field745 += var64.field2325 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field7254 = (short) var13;
                        this.field7260 = (short) var14;
                        this.field7258 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field7255 <<= 1;
                }
            }
            super.field738 = (int) ((long) super.field738 + ((long) this.field7254 * (long) this.field7255 >> 23) * (long) arg1);
            super.field743 = (int) ((long) super.field743 + ((long) this.field7260 * (long) this.field7255 >> 23) * (long) arg1);
            super.field745 = (int) ((long) super.field745 + ((long) this.field7258 * (long) this.field7255 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(J)V", line = 399)
    public final void method2916(long arg0) {
        int var3 = super.field738 >> class426.field6345 + 12;
        int var4 = super.field745 >> class426.field6345 + 12;
        int var5 = super.field743 >> class267.field3840;
        if (var5 <= 0 && var5 >= -262144 && var3 >= 0 && var3 < class151.field2408 && var4 >= 0 && var4 < class261.field3792) {
            class94 var6 = this.field7256.field4228;
            class21 var7 = this.field7256.field4214;
            class35[] var8 = class88.field1546;
            int var9 = var8[var6.field1600].method376(var3, var4);
            int var10;
            if (var6.field1600 < class190.field2830 - 1) {
                var10 = var8[var6.field1600 + 1].method376(var3, var4);
            } else {
                var10 = var9 - (8 << class426.field6345);
            }
            if (var7.field355) {
                if (var7.field422 == -1 && var5 > var9) {
                    this.method2917();
                    return;
                }
                if (var7.field422 >= 0 && var5 > var8[var7.field422].method376(var3, var4)) {
                    this.method2917();
                    return;
                }
                if (var7.field382 == -1 && var5 < var10) {
                    this.method2917();
                    return;
                }
                if (var7.field382 >= 0 && var5 < var8[var7.field382 + 1].method376(var3, var4)) {
                    this.method2917();
                    return;
                }
            }
            if (var3 >= var6.field1601 && var3 <= var6.field1599 && var4 >= var6.field1597 && var4 <= var6.field1594 && var5 <= var9 && var5 >= var10) {
                var6.field1596.field892.method1532(this, 7);
            } else {
                int var11;
                for (var11 = class190.field2830 - 1; var11 > 0 && var5 > var8[var11].method376(var3, var4); --var11) {
                }
                if (var11 == 0 && var5 > var8[0].method376(var3, var4)) {
                    this.method2917();
                } else if (class190.field2830 - 1 == var11 && var8[var11].method376(var3, var4) - var5 > 8 << class426.field6345) {
                    this.method2917();
                } else {
                    class429 var12 = class380.field5761[var11][var3][var4];
                    if (var12 == null) {
                        if (var11 == 0) {
                            var12 = class380.field5761[0][var3][var4] = new class429(0, var3, var4);
                        }
                        boolean var13 = class380.field5761[0][var3][var4].field6389 != null;
                        if (var11 == 3 && var13) {
                            this.method2917();
                            return;
                        }
                        for (int var14 = 1; var14 <= var11; ++var14) {
                            if (class380.field5761[var14][var3][var4] == null) {
                                var12 = class380.field5761[var14][var3][var4] = new class429(var14, var3, var4);
                                if (var13) {
                                    ++var12.field6368;
                                }
                            }
                        }
                    }
                    if (var12.field6381 == null) {
                        var12.field6381 = new class49();
                        var12.field6379 = (byte) ((int) (arg0 & 255L));
                    } else if ((byte) ((int) (arg0 & 255L)) != var12.field6379) {
                        var12.field6381.field892.method1535((byte) -40);
                        var12.field6381.field898 = false;
                        var12.field6379 = (byte) ((int) (arg0 & 255L));
                    }
                    var12.field6381.field892.method1532(this, 7);
                }
            }
        } else {
            this.method2917();
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "()V", line = 528)
    private final void method2917() {
        this.field7256.field4228.field1585[this.field7252] = null;
        class160.field2480[class320.field4897] = this;
        class320.field4897 = class320.field4897 + 1 & 1023;
        this.method360(true);
        this.method1047(-2886);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Laf;IIIIIIIIIIIZZ)V", line = 536)
    public final void method2918(class297 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field7256 = arg0;
        super.field738 = arg1 << class267.field3840;
        super.field743 = arg2 << class267.field3840;
        super.field745 = arg3 << class267.field3840;
        super.field735 = arg9;
        this.field7259 = this.field7257 = (short) arg8;
        super.field744 = arg10;
        super.field741 = arg11;
        super.field740 = arg13;
        this.field7254 = (short) arg4;
        this.field7260 = (short) arg5;
        this.field7258 = (short) arg6;
        this.field7255 = arg7;
        super.field746 = this.field7256.field4222.field555;
        this.method2919();
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "()V", line = 561)
    private final void method2919() {
        int var1 = this.field7256.field4228.field1586;
        if (this.field7256.field4228.field1585[var1] != null) {
            this.field7256.field4228.field1585[var1].method2917();
        }
        this.field7256.field4228.field1585[var1] = this;
        this.field7252 = (short) this.field7256.field4228.field1586;
        this.field7256.field4228.field1586 = var1 + 1 & 8191;
        this.field7256.field4225.method1636(9, this);
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Laf;IIIIIIIIIIIZZ)V", line = 571)
    public class490(class297 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field7256 = arg0;
        super.field738 = arg1 << class267.field3840;
        super.field743 = arg2 << class267.field3840;
        super.field745 = arg3 << class267.field3840;
        super.field735 = arg9;
        this.field7259 = this.field7257 = (short) arg8;
        super.field744 = arg10;
        super.field741 = arg11;
        super.field740 = arg13;
        this.field7254 = (short) arg4;
        this.field7260 = (short) arg5;
        this.field7258 = (short) arg6;
        this.field7255 = arg7;
        super.field746 = this.field7256.field4222.field555;
        this.method2919();
    }
}
