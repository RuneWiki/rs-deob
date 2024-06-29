import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class81 extends class239 {

    @OriginalMember(owner = "client!hu", name = "I", descriptor = "Lgs;")
    private class33 field1399;

    @OriginalMember(owner = "client!hu", name = "O", descriptor = "S")
    private short field1405;

    @OriginalMember(owner = "client!hu", name = "N", descriptor = "S")
    private short field1404;

    @OriginalMember(owner = "client!hu", name = "J", descriptor = "S")
    private short field1400;

    @OriginalMember(owner = "client!hu", name = "P", descriptor = "S")
    private short field1406;

    @OriginalMember(owner = "client!hu", name = "L", descriptor = "S")
    private short field1402;

    @OriginalMember(owner = "client!hu", name = "M", descriptor = "I")
    private int field1403;

    @OriginalMember(owner = "client!hu", name = "H", descriptor = "I")
    private int field1398;

    @OriginalMember(owner = "client!hu", name = "K", descriptor = "S")
    private short field1401;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lgs;IIIIIIIIIIIZZ)V")
    public final void method585(class33 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field1399 = arg0;
        super.field3596 = arg1 << class305.field4630;
        super.field3609 = arg2 << class305.field4630;
        super.field3601 = arg3 << class305.field4630;
        super.field3598 = arg9;
        this.field1404 = this.field1405 = (short) arg8;
        super.field3606 = arg10;
        super.field3604 = arg11;
        super.field3600 = arg13;
        this.field1400 = (short) arg4;
        this.field1406 = (short) arg5;
        this.field1402 = (short) arg6;
        this.field1403 = arg7;
        super.field3605 = this.field1399.field442.field6098;
        this.method586();
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "()V")
    private final void method586() {
        int var1 = this.field1399.field437.field7288;
        if (this.field1399.field437.field7286[var1] != null) {
            this.field1399.field437.field7286[var1].method589();
        }
        this.field1399.field437.field7286[var1] = this;
        this.field1401 = (short) this.field1399.field437.field7288;
        this.field1399.field437.field7288 = var1 + 1 & 8191;
        this.field1399.field425.method1321((byte) 0, this);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(J)V")
    public final void method587(long arg0) {
        int var3 = super.field3596 >> class239.field3602 + 12;
        int var4 = super.field3601 >> class239.field3602 + 12;
        int var5 = super.field3609 >> class305.field4630;
        if (var5 <= 0 && var5 >= -262144 && var3 >= 0 && var3 < class377.field5492 && var4 >= 0 && var4 < class347.field5132) {
            class477 var6 = this.field1399.field437;
            class389 var7 = this.field1399.field432;
            class343[] var8 = class99.field1801;
            int var9 = var8[var6.field7304].method318(var3, var4);
            int var10;
            if (var6.field7304 < class483.field7381 - 1) {
                var10 = var8[var6.field7304 + 1].method318(var3, var4);
            } else {
                var10 = var9 - (8 << class239.field3602);
            }
            if (var7.field5664) {
                if (var7.field5671 == -1 && var5 > var9) {
                    this.method589();
                    return;
                }
                if (var7.field5671 >= 0 && var5 > var8[var7.field5671].method318(var3, var4)) {
                    this.method589();
                    return;
                }
                if (var7.field5627 == -1 && var5 < var10) {
                    this.method589();
                    return;
                }
                if (var7.field5627 >= 0 && var5 < var8[var7.field5627 + 1].method318(var3, var4)) {
                    this.method589();
                    return;
                }
            }
            if (var3 >= var6.field7300 && var3 <= var6.field7297 && var4 >= var6.field7298 && var4 <= var6.field7301 && var5 <= var9 && var5 >= var10) {
                var6.field7303.field5447.method1077(this, (byte) 28);
            } else {
                int var11;
                for (var11 = class483.field7381 - 1; var11 > 0 && var5 > var8[var11].method318(var3, var4); --var11) {
                }
                if (var11 == 0 && var5 > var8[0].method318(var3, var4)) {
                    this.method589();
                } else if (class483.field7381 - 1 == var11 && var8[var11].method318(var3, var4) - var5 > 8 << class239.field3602) {
                    this.method589();
                } else {
                    class268 var12 = class321.field4830[var11][var3][var4];
                    if (var12 == null) {
                        if (var11 == 0) {
                            var12 = class321.field4830[0][var3][var4] = new class268(0, var3, var4);
                        }
                        boolean var13 = class321.field4830[0][var3][var4].field4049 != null;
                        if (var11 == 3 && var13) {
                            this.method589();
                            return;
                        }
                        for (int var14 = 1; var14 <= var11; ++var14) {
                            if (class321.field4830[var14][var3][var4] == null) {
                                var12 = class321.field4830[var14][var3][var4] = new class268(var14, var3, var4);
                                if (var13) {
                                    ++var12.field4062;
                                }
                            }
                        }
                    }
                    if (var12.field4060 == null) {
                        var12.field4060 = new class372();
                        var12.field4050 = (byte) ((int) (arg0 & 255L));
                    } else if ((byte) ((int) (arg0 & 255L)) != var12.field4050) {
                        var12.field4060.field5447.method1076((byte) -104);
                        var12.field4060.field5449 = false;
                        var12.field4050 = (byte) ((int) (arg0 & 255L));
                    }
                    var12.field4060.field5447.method1077(this, (byte) 28);
                }
            }
        } else {
            this.method589();
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(JI)V")
    public final void method588(long arg0, int arg1) {
        this.field1405 = (short) (this.field1405 - arg1);
        if (this.field1405 <= 0) {
            this.method589();
        } else {
            int var4 = super.field3596 >> class305.field4630;
            int var5 = super.field3609 >> class305.field4630;
            int var6 = super.field3601 >> class305.field4630;
            class477 var7 = this.field1399.field437;
            class389 var8 = this.field1399.field432;
            if (var8.field5647 != 0) {
                if (this.field1404 - this.field1405 <= var8.field5669) {
                    int var9 = var8.field5655 * arg1 + (this.field1398 >> 16 & 255) + (super.field3598 >> 8 & 65280);
                    int var10 = var8.field5648 * arg1 + (this.field1398 >> 8 & 255) + (super.field3598 & 65280);
                    int var11 = var8.field5689 * arg1 + (super.field3598 << 8 & 65280) + (this.field1398 & 255);
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
                    super.field3598 &= -16777216;
                    super.field3598 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field1398 &= -16777216;
                    this.field1398 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field1404 - this.field1405 <= var8.field5660) {
                    int var12 = var8.field5676 * arg1 + (this.field1398 >> 24 & 255) + (super.field3598 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field3598 &= 16777215;
                    super.field3598 |= (var12 & 65280) << 16;
                    this.field1398 &= 16777215;
                    this.field1398 |= (var12 & 255) << 24;
                }
            }
            if (var8.field5624 != -1 && this.field1404 - this.field1405 <= var8.field5680) {
                this.field1403 += var8.field5630 * arg1;
            }
            if (var8.field5666 != -1 && this.field1404 - this.field1405 <= var8.field5654) {
                super.field3606 += var8.field5658 * arg1;
            }
            int var13 = this.field1400;
            int var14 = this.field1406;
            int var15 = this.field1402;
            boolean var16 = false;
            if (var8.field5678 == 1) {
                int var17 = var4 - this.field1399.field445;
                int var18 = var5 - this.field1399.field448;
                int var19 = var6 - this.field1399.field447;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field5683 * var20 * arg1);
                this.field1403 = (int) ((long) this.field1403 - ((long) this.field1403 * var21 >> 18));
            } else if (var8.field5678 == 2) {
                int var23 = var4 - this.field1399.field445;
                int var24 = var5 - this.field1399.field448;
                int var25 = var6 - this.field1399.field447;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field5683 * var26 * arg1);
                this.field1403 = (int) ((long) this.field1403 - ((long) this.field1403 * var27 >> 28));
            }
            if (var8.field5657 != null) {
                class179 var29 = var7.field7296.field45;
                for (class179 var30 = var29.field2799; var29 != var30; var30 = var30.field2799) {
                    class183 var31 = (class183) var30;
                    class447 var32 = var31.field2910;
                    if (var32.field6883 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field5657.length; ++var34) {
                            if (var8.field5657[var34] == var32.field6882) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field2908;
                            int var36 = var5 - var31.field2912;
                            int var37 = var6 - var31.field2906;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field6879) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field2917 * var37 + var31.field2909 * var35 + var32.field6888 * var36) * 65535L / (long) (var32.field6876 * var40);
                                if (var41 >= (long) var32.field6872) {
                                    int var43 = 0;
                                    if (var32.field6874 == 1) {
                                        var43 = (var40 >> 4) * var32.field6880;
                                    } else if (var32.field6874 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field6880;
                                    }
                                    if (var32.field6885 == 0) {
                                        if (var32.field6878 == 0) {
                                            var13 += (var31.field2909 - var43) * arg1;
                                            var14 += (var32.field6888 - var43) * arg1;
                                            var15 += (var31.field2917 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field3596 += (var31.field2909 - var43) * arg1;
                                            super.field3609 += (var32.field6888 - var43) * arg1;
                                            super.field3601 += (var31.field2917 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field6876;
                                        int var45 = (var36 << 15) / var40 * var32.field6876;
                                        int var46 = (var37 << 15) / var40 * var32.field6876;
                                        if (var32.field6878 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field3596 += arg1 * var44 >> 15;
                                            super.field3609 += arg1 * var45 >> 15;
                                            super.field3601 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field5640 != null) {
                for (int var47 = 0; var47 < var8.field5640.length; ++var47) {
                    class183 var48 = (class183) class295.field4482.method2824((long) var8.field5640[var47], -113);
                    while (var48 != null) {
                        class447 var49 = var48.field2910;
                        int var50 = var4 - var48.field2908;
                        int var51 = var5 - var48.field2912;
                        int var52 = var6 - var48.field2906;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field6879) {
                            var48 = (class183) class295.field4482.method2827(19408);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field2917 * var52 + var48.field2909 * var50 + var49.field6888 * var51) * 65535L / (long) (var49.field6876 * var55);
                            if (var56 < (long) var49.field6872) {
                                var48 = (class183) class295.field4482.method2827(19408);
                            } else {
                                int var58 = 0;
                                if (var49.field6874 == 1) {
                                    var58 = (var55 >> 4) * var49.field6880;
                                } else if (var49.field6874 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field6880;
                                }
                                if (var49.field6885 == 0) {
                                    if (var49.field6878 == 0) {
                                        var13 += (var48.field2909 - var58) * arg1;
                                        var14 += (var49.field6888 - var58) * arg1;
                                        var15 += (var48.field2917 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field3596 += (var48.field2909 - var58) * arg1;
                                        super.field3609 += (var49.field6888 - var58) * arg1;
                                        super.field3601 += (var48.field2917 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field6876;
                                    int var60 = (var51 << 15) / var55 * var49.field6876;
                                    int var61 = (var52 << 15) / var55 * var49.field6876;
                                    if (var49.field6878 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field3596 += arg1 * var59 >> 15;
                                        super.field3609 += arg1 * var60 >> 15;
                                        super.field3601 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class183) class295.field4482.method2827(19408);
                            }
                        }
                    }
                }
            }
            if (var8.field5631 != null) {
                if (var8.field5650 == null) {
                    var8.field5650 = new int[var8.field5631.length];
                    for (int var62 = 0; var62 < var8.field5631.length; ++var62) {
                        class90.method664(false, var8.field5631[var62]);
                        var8.field5650[var62] = ((class361) class129.field2071.method2409(false, (long) var8.field5631[var62])).field5334;
                    }
                }
                for (int var63 = 0; var63 < var8.field5650.length; ++var63) {
                    class447 var64 = class150.field2421[var8.field5650[var63]];
                    if (var64.field6878 == 0) {
                        var13 += var64.field6889 * arg1;
                        var14 += var64.field6888 * arg1;
                        var15 += var64.field6871 * arg1;
                        var16 = true;
                    } else {
                        super.field3596 += var64.field6889 * arg1;
                        super.field3609 += var64.field6888 * arg1;
                        super.field3601 += var64.field6871 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field1400 = (short) var13;
                        this.field1406 = (short) var14;
                        this.field1402 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field1403 <<= 1;
                }
            }
            super.field3596 = (int) ((long) super.field3596 + ((long) this.field1400 * (long) this.field1403 >> 23) * (long) arg1);
            super.field3609 = (int) ((long) super.field3609 + ((long) this.field1406 * (long) this.field1403 >> 23) * (long) arg1);
            super.field3601 = (int) ((long) super.field3601 + ((long) this.field1402 * (long) this.field1403 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "()V")
    private final void method589() {
        this.field1399.field437.field7286[this.field1401] = null;
        class442.field6683[class57.field978] = this;
        class57.field978 = class57.field978 + 1 & 1023;
        this.method1297((byte) -123);
        this.method2251(29959);
    }

    @OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Lgs;IIIIIIIIIIIZZ)V")
    public class81(class33 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field1399 = arg0;
        super.field3596 = arg1 << class305.field4630;
        super.field3609 = arg2 << class305.field4630;
        super.field3601 = arg3 << class305.field4630;
        super.field3598 = arg9;
        this.field1404 = this.field1405 = (short) arg8;
        super.field3606 = arg10;
        super.field3604 = arg11;
        super.field3600 = arg13;
        this.field1400 = (short) arg4;
        this.field1406 = (short) arg5;
        this.field1402 = (short) arg6;
        this.field1403 = arg7;
        super.field3605 = this.field1399.field442.field6098;
        this.method586();
    }
}
