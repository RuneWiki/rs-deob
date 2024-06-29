import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class468 extends class74 {

    @OriginalMember(owner = "client!rl", name = "K", descriptor = "Log;")
    private class424 field6599;

    @OriginalMember(owner = "client!rl", name = "L", descriptor = "S")
    private short field6600;

    @OriginalMember(owner = "client!rl", name = "I", descriptor = "S")
    private short field6597;

    @OriginalMember(owner = "client!rl", name = "N", descriptor = "S")
    private short field6602;

    @OriginalMember(owner = "client!rl", name = "D", descriptor = "S")
    private short field6595;

    @OriginalMember(owner = "client!rl", name = "J", descriptor = "S")
    private short field6598;

    @OriginalMember(owner = "client!rl", name = "H", descriptor = "I")
    private int field6596;

    @OriginalMember(owner = "client!rl", name = "M", descriptor = "I")
    private int field6601;

    @OriginalMember(owner = "client!rl", name = "O", descriptor = "S")
    private short field6603;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(J)V")
    public final void method2752(long arg0) {
        int var3 = super.field913 >> 19;
        int var4 = super.field910 >> 19;
        int var5 = super.field907 >> class138.field1823;
        if (var5 <= 0 && var5 >= -65535 && var3 >= 0 && var3 < class287.field4186 && var4 >= 0 && var4 < class360.field5188) {
            class97 var6 = this.field6599.field5954;
            class182 var7 = this.field6599.field5942;
            class426[] var8 = class53.field725;
            int var9 = var8[var6.field1253].method1218(var3, var4);
            int var10;
            if (var6.field1253 < class314.field4441 - 1) {
                var10 = var8[var6.field1253 + 1].method1218(var3, var4);
            } else {
                var10 = var9 - 1024;
            }
            if (var7.field2647) {
                if (var7.field2662 == -1 && var5 > var9) {
                    this.method2754();
                    return;
                }
                if (var7.field2662 >= 0 && var5 > var8[var7.field2662].method1218(var3, var4)) {
                    this.method2754();
                    return;
                }
                if (var7.field2650 == -1 && var5 < var10) {
                    this.method2754();
                    return;
                }
                if (var7.field2650 >= 0 && var5 < var8[var7.field2650 + 1].method1218(var3, var4)) {
                    this.method2754();
                    return;
                }
            }
            if (var3 >= var6.field1254 && var3 <= var6.field1251 && var4 >= var6.field1248 && var4 <= var6.field1250 && var5 <= var9 && var5 >= var10) {
                var6.field1252.field3161.method1517(this, -70);
            } else {
                int var11;
                for (var11 = class314.field4441 - 1; var11 > 0 && var5 > var8[var11].method1218(var3, var4); --var11) {
                }
                if (class314.field4441 - 1 == var11 && var8[var11].method1218(var3, var4) - var5 > 1024) {
                    this.method2754();
                } else {
                    class88 var12 = class330.field4786[var11][var3][var4];
                    if (var12 == null) {
                        if (var11 == 0) {
                            var12 = class330.field4786[0][var3][var4] = new class88(0, var3, var4);
                        }
                        boolean var13 = class330.field4786[0][var3][var4].field1088 != null;
                        if (var11 == 3 && var13) {
                            this.method2754();
                            return;
                        }
                        for (int var14 = 1; var14 <= var11; ++var14) {
                            if (class330.field4786[var14][var3][var4] == null) {
                                var12 = class330.field4786[var14][var3][var4] = new class88(var14, var3, var4);
                                if (var13) {
                                    ++var12.field1080;
                                }
                            }
                        }
                    }
                    if (var12.field1081 == null) {
                        var12.field1081 = new class207();
                        var12.field1069 = (byte) ((int) (arg0 & 255L));
                    } else if ((byte) ((int) (arg0 & 255L)) != var12.field1069) {
                        var12.field1081 = new class207();
                        var12.field1069 = (byte) ((int) (arg0 & 255L));
                    }
                    var12.field1081.field3161.method1517(this, -124);
                }
            }
        } else {
            this.method2754();
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Log;IIIIIIIIIIIZ)V")
    public final void method2753(class424 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        this.field6599 = arg0;
        super.field913 = arg1 << class138.field1823;
        super.field907 = arg2 << class138.field1823;
        super.field910 = arg3 << class138.field1823;
        super.field909 = arg9;
        this.field6597 = this.field6600 = (short) arg8;
        super.field911 = arg10;
        super.field915 = arg11;
        this.field6602 = (short) arg4;
        this.field6595 = (short) arg5;
        this.field6598 = (short) arg6;
        this.field6596 = arg7;
        super.field906 = this.field6599.field5951.field4265;
        this.method2755();
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "()V")
    private final void method2754() {
        this.field6599.field5954.field1243[this.field6603] = null;
        class164.field2424[class167.field2444] = this;
        class167.field2444 = class167.field2444 + 1 & 1023;
        this.method738((byte) -2);
        this.method2438((byte) 30);
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "()V")
    private final void method2755() {
        int var1 = this.field6599.field5954.field1239;
        if (this.field6599.field5954.field1243[var1] != null) {
            this.field6599.field5954.field1243[var1].method2754();
        }
        this.field6599.field5954.field1243[var1] = this;
        this.field6603 = (short) this.field6599.field5954.field1239;
        this.field6599.field5954.field1239 = var1 + 1 & 8191;
        this.field6599.field5922.method1444(this, (byte) 122);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(JI)V")
    public final void method2756(long arg0, int arg1) {
        this.field6600 = (short) (this.field6600 - arg1);
        if (this.field6600 <= 0) {
            this.method2754();
        } else {
            int var4 = super.field913 >> class138.field1823;
            int var5 = super.field907 >> class138.field1823;
            int var6 = super.field910 >> class138.field1823;
            class97 var7 = this.field6599.field5954;
            class182 var8 = this.field6599.field5942;
            if (var8.field2676 != 0) {
                if (this.field6597 - this.field6600 <= var8.field2637) {
                    int var9 = var8.field2675 * arg1 + (super.field909 >> 8 & 65280) + (this.field6601 >> 16 & 255);
                    int var10 = var8.field2656 * arg1 + (this.field6601 >> 8 & 255) + (super.field909 & 65280);
                    int var11 = var8.field2698 * arg1 + (super.field909 << 8 & 65280) + (this.field6601 & 255);
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
                    super.field909 &= -16777216;
                    super.field909 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field6601 &= -16777216;
                    this.field6601 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field6597 - this.field6600 <= var8.field2688) {
                    int var12 = var8.field2697 * arg1 + (super.field909 >> 16 & 65280) + (this.field6601 >> 24 & 255);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field909 &= 16777215;
                    super.field909 |= (var12 & 65280) << 16;
                    this.field6601 &= 16777215;
                    this.field6601 |= (var12 & 255) << 24;
                }
            }
            if (var8.field2654 != -1 && this.field6597 - this.field6600 <= var8.field2646) {
                this.field6596 += var8.field2691 * arg1;
            }
            if (var8.field2693 != -1 && this.field6597 - this.field6600 <= var8.field2658) {
                super.field911 += var8.field2660 * arg1;
            }
            int var13 = this.field6602;
            int var14 = this.field6595;
            int var15 = this.field6598;
            boolean var16 = false;
            if (var8.field2667 == 1) {
                int var17 = var4 - this.field6599.field5947;
                int var18 = var5 - this.field6599.field5927;
                int var19 = var6 - this.field6599.field5933;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field2665 * var20 * arg1);
                this.field6596 = (int) ((long) this.field6596 - ((long) this.field6596 * var21 >> 18));
            } else if (var8.field2667 == 2) {
                int var23 = var4 - this.field6599.field5947;
                int var24 = var5 - this.field6599.field5927;
                int var25 = var6 - this.field6599.field5933;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field2665 * var26 * arg1);
                this.field6596 = (int) ((long) this.field6596 - ((long) this.field6596 * var27 >> 28));
            }
            if (var8.field2666 != null) {
                class238 var29 = var7.field1246.field6838;
                for (class238 var30 = var29.field3575; var29 != var30; var30 = var30.field3575) {
                    class131 var31 = (class131) var30;
                    class258 var32 = var31.field1711;
                    if (var32.field3766 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field2666.length; ++var34) {
                            if (var8.field2666[var34] == var32.field3777) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field1717;
                            int var36 = var5 - var31.field1707;
                            int var37 = var6 - var31.field1713;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field3787) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field1714 * var37 + var31.field1716 * var35 + var32.field3788 * var36) * 65535L / (long) (var32.field3771 * var40);
                                if (var41 >= (long) var32.field3780) {
                                    int var43 = 0;
                                    if (var32.field3768 == 1) {
                                        var43 = (var40 >> 4) * var32.field3767;
                                    } else if (var32.field3768 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field3767;
                                    }
                                    if (var32.field3776 == 0) {
                                        if (var32.field3774 == 0) {
                                            var13 += (var31.field1716 - var43) * arg1;
                                            var14 += (var32.field3788 - var43) * arg1;
                                            var15 += (var31.field1714 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field913 += (var31.field1716 - var43) * arg1;
                                            super.field907 += (var32.field3788 - var43) * arg1;
                                            super.field910 += (var31.field1714 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field3771;
                                        int var45 = (var36 << 15) / var40 * var32.field3771;
                                        int var46 = (var37 << 15) / var40 * var32.field3771;
                                        if (var32.field3774 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field913 += arg1 * var44 >> 15;
                                            super.field907 += arg1 * var45 >> 15;
                                            super.field910 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field2636 != null) {
                for (int var47 = 0; var47 < var8.field2636.length; ++var47) {
                    class131 var48 = (class131) class404.field5695.method242((long) var8.field2636[var47], -127);
                    while (var48 != null) {
                        class258 var49 = var48.field1711;
                        int var50 = var4 - var48.field1717;
                        int var51 = var5 - var48.field1707;
                        int var52 = var6 - var48.field1713;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field3787) {
                            var48 = (class131) class404.field5695.method243(-1);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field1714 * var52 + var48.field1716 * var50 + var49.field3788 * var51) * 65535L / (long) (var49.field3771 * var55);
                            if (var56 < (long) var49.field3780) {
                                var48 = (class131) class404.field5695.method243(-1);
                            } else {
                                int var58 = 0;
                                if (var49.field3768 == 1) {
                                    var58 = (var55 >> 4) * var49.field3767;
                                } else if (var49.field3768 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field3767;
                                }
                                if (var49.field3776 == 0) {
                                    if (var49.field3774 == 0) {
                                        var13 += (var48.field1716 - var58) * arg1;
                                        var14 += (var49.field3788 - var58) * arg1;
                                        var15 += (var48.field1714 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field913 += (var48.field1716 - var58) * arg1;
                                        super.field907 += (var49.field3788 - var58) * arg1;
                                        super.field910 += (var48.field1714 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field3771;
                                    int var60 = (var51 << 15) / var55 * var49.field3771;
                                    int var61 = (var52 << 15) / var55 * var49.field3771;
                                    if (var49.field3774 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field913 += arg1 * var59 >> 15;
                                        super.field907 += arg1 * var60 >> 15;
                                        super.field910 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class131) class404.field5695.method243(-1);
                            }
                        }
                    }
                }
            }
            if (var8.field2668 != null) {
                if (var8.field2690 == null) {
                    var8.field2690 = new int[var8.field2668.length];
                    for (int var62 = 0; var62 < var8.field2668.length; ++var62) {
                        class452.method2641(var8.field2668[var62], 2);
                        var8.field2690[var62] = ((class324) class441.field6098.method2761((long) var8.field2668[var62], (byte) -112)).field4676;
                    }
                }
                for (int var63 = 0; var63 < var8.field2690.length; ++var63) {
                    class258 var64 = class37.field483[var8.field2690[var63]];
                    if (var64.field3774 == 0) {
                        var13 += var64.field3773 * arg1;
                        var14 += var64.field3788 * arg1;
                        var15 += var64.field3775 * arg1;
                        var16 = true;
                    } else {
                        super.field913 += var64.field3773 * arg1;
                        super.field907 += var64.field3788 * arg1;
                        super.field910 += var64.field3775 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field6602 = (short) var13;
                        this.field6595 = (short) var14;
                        this.field6598 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field6596 <<= 1;
                }
            }
            super.field913 = (int) ((long) super.field913 + ((long) this.field6602 * (long) this.field6596 >> 23) * (long) arg1);
            super.field907 = (int) ((long) super.field907 + ((long) this.field6595 * (long) this.field6596 >> 23) * (long) arg1);
            super.field910 = (int) ((long) super.field910 + ((long) this.field6598 * (long) this.field6596 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Log;IIIIIIIIIIIZ)V")
    public class468(class424 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        this.field6599 = arg0;
        super.field913 = arg1 << class138.field1823;
        super.field907 = arg2 << class138.field1823;
        super.field910 = arg3 << class138.field1823;
        super.field909 = arg9;
        this.field6597 = this.field6600 = (short) arg8;
        super.field911 = arg10;
        super.field915 = arg11;
        this.field6602 = (short) arg4;
        this.field6595 = (short) arg5;
        this.field6598 = (short) arg6;
        this.field6596 = arg7;
        super.field906 = this.field6599.field5951.field4265;
        this.method2755();
    }
}
