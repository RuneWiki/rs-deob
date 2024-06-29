import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class258 extends class128 {

    @OriginalMember(owner = "client!pr", name = "I", descriptor = "Lwg;")
    private class245 field3516;

    @OriginalMember(owner = "client!pr", name = "G", descriptor = "S")
    private short field3514;

    @OriginalMember(owner = "client!pr", name = "C", descriptor = "S")
    private short field3510;

    @OriginalMember(owner = "client!pr", name = "E", descriptor = "S")
    private short field3512;

    @OriginalMember(owner = "client!pr", name = "D", descriptor = "S")
    private short field3511;

    @OriginalMember(owner = "client!pr", name = "F", descriptor = "S")
    private short field3513;

    @OriginalMember(owner = "client!pr", name = "H", descriptor = "I")
    private int field3515;

    @OriginalMember(owner = "client!pr", name = "J", descriptor = "I")
    private int field3517;

    @OriginalMember(owner = "client!pr", name = "B", descriptor = "S")
    private short field3509;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(J)V")
    public final void method1614(long arg0) {
        int var3 = super.field1789 >> 19;
        int var4 = super.field1786 >> 19;
        int var5 = super.field1792 >> class420.field6036;
        if (var5 <= 0 && var5 >= -65535 && var3 >= 0 && var3 < class158.field2245 && var4 >= 0 && var4 < class52.field598) {
            class389 var6 = this.field3516.field3323;
            class41 var7 = this.field3516.field3318;
            class319[] var8 = class132.field1814;
            int var9 = var8[var6.field5711].method1990(var3, var4);
            int var10;
            if (var6.field5711 < 3) {
                var10 = var8[var6.field5711 + 1].method1990(var3, var4);
            } else {
                var10 = var9 - 1024;
            }
            if (var7.field466) {
                if (var7.field480 == -1 && var5 > var9) {
                    this.method1618();
                    return;
                }
                if (var7.field480 >= 0 && var5 > var8[var7.field480].method1990(var3, var4)) {
                    this.method1618();
                    return;
                }
                if (var7.field492 == -1 && var5 < var10) {
                    this.method1618();
                    return;
                }
                if (var7.field492 >= 0 && var5 < var8[var7.field492 + 1].method1990(var3, var4)) {
                    this.method1618();
                    return;
                }
            }
            if (var3 >= var6.field5707 && var3 <= var6.field5709 && var4 >= var6.field5710 && var4 <= var6.field5709 && var5 <= var9 && var5 >= var10) {
                var6.field5712.field3845.method2558((byte) -104, this);
            } else {
                byte var11 = 3;
                if (var5 > var8[1].method1990(var3, var4)) {
                    var11 = 0;
                } else if (var5 > var8[2].method1990(var3, var4)) {
                    var11 = 1;
                } else if (var5 > var8[3].method1990(var3, var4)) {
                    var11 = 2;
                } else if (var5 < var8[3].method1990(var3, var4) - 1024) {
                    this.method1618();
                    return;
                }
                class302 var12 = class19.field202[var11][var3][var4];
                if (var12 == null) {
                    boolean var13 = class19.field202[0][var3][var4].field4327 != null;
                    if (var11 == 3 && var13) {
                        this.method1618();
                        return;
                    }
                    for (int var14 = 1; var14 <= var11; ++var14) {
                        if (class19.field202[var14][var3][var4] == null) {
                            var12 = class19.field202[var14][var3][var4] = new class302(var14, var3, var4);
                            if (var13) {
                                ++var12.field4303;
                            }
                        }
                    }
                }
                if (var12.field4322 == null) {
                    var12.field4322 = new class271();
                    var12.field4329 = (byte) ((int) (arg0 & 255L));
                } else if ((byte) ((int) (arg0 & 255L)) != var12.field4329) {
                    var12.field4322 = new class271();
                    var12.field4329 = (byte) ((int) (arg0 & 255L));
                }
                var12.field4322.field3845.method2558((byte) -101, this);
            }
        } else {
            this.method1618();
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(JI)V")
    public final void method1615(long arg0, int arg1) {
        this.field3514 = (short) (this.field3514 - arg1);
        if (this.field3514 <= 0) {
            this.method1618();
        } else {
            int var4 = super.field1789 >> class420.field6036;
            int var5 = super.field1792 >> class420.field6036;
            int var6 = super.field1786 >> class420.field6036;
            class389 var7 = this.field3516.field3323;
            class41 var8 = this.field3516.field3318;
            if (var8.field474 != 0) {
                if (this.field3510 - this.field3514 <= var8.field477) {
                    int var9 = var8.field438 * arg1 + (this.field3517 >> 16 & 255) + (super.field1795 >> 8 & 65280);
                    int var10 = var8.field452 * arg1 + (this.field3517 >> 8 & 255) + (super.field1795 & 65280);
                    int var11 = var8.field475 * arg1 + (super.field1795 << 8 & 65280) + (this.field3517 & 255);
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
                    super.field1795 &= -16777216;
                    super.field1795 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field3517 &= -16777216;
                    this.field3517 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field3510 - this.field3514 <= var8.field501) {
                    int var12 = var8.field455 * arg1 + (this.field3517 >> 24 & 255) + (super.field1795 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field1795 &= 16777215;
                    super.field1795 |= (var12 & 65280) << 16;
                    this.field3517 &= 16777215;
                    this.field3517 |= (var12 & 255) << 24;
                }
            }
            if (var8.field457 != -1 && this.field3510 - this.field3514 <= var8.field499) {
                this.field3515 += var8.field485 * arg1;
            }
            if (var8.field496 != -1 && this.field3510 - this.field3514 <= var8.field503) {
                super.field1794 += var8.field449 * arg1;
            }
            int var13 = this.field3512;
            int var14 = this.field3511;
            int var15 = this.field3513;
            boolean var16 = false;
            if (var8.field441 == 1) {
                int var17 = var4 - this.field3516.field3302;
                int var18 = var5 - this.field3516.field3300;
                int var19 = var6 - this.field3516.field3301;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field463 * var20 * arg1);
                this.field3515 = (int) ((long) this.field3515 - ((long) this.field3515 * var21 >> 18));
            } else if (var8.field441 == 2) {
                int var23 = var4 - this.field3516.field3302;
                int var24 = var5 - this.field3516.field3300;
                int var25 = var6 - this.field3516.field3301;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field463 * var26 * arg1);
                this.field3515 = (int) ((long) this.field3515 - ((long) this.field3515 * var27 >> 28));
            }
            if (var8.field440 != null) {
                class359 var29 = var7.field5705.field2358;
                for (class359 var30 = var29.field5243; var29 != var30; var30 = var30.field5243) {
                    class155 var31 = (class155) var30;
                    class134 var32 = var31.field2213;
                    if (var32.field1863 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field440.length; ++var34) {
                            if (var8.field440[var34] == var32.field1865) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field2204;
                            int var36 = var5 - var31.field2205;
                            int var37 = var6 - var31.field2210;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field1862) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field2215 * var37 + var31.field2209 * var35 + var32.field1872 * var36) * 65535L / (long) (var32.field1861 * var40);
                                if (var41 >= (long) var32.field1869) {
                                    int var43 = 0;
                                    if (var32.field1878 == 1) {
                                        var43 = (var40 >> 4) * var32.field1870;
                                    } else if (var32.field1878 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field1870;
                                    }
                                    if (var32.field1880 == 0) {
                                        if (var32.field1873 == 0) {
                                            var13 += (var31.field2209 - var43) * arg1;
                                            var14 += (var32.field1872 - var43) * arg1;
                                            var15 += (var31.field2215 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field1789 += (var31.field2209 - var43) * arg1;
                                            super.field1792 += (var32.field1872 - var43) * arg1;
                                            super.field1786 += (var31.field2215 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field1861;
                                        int var45 = (var36 << 15) / var40 * var32.field1861;
                                        int var46 = (var37 << 15) / var40 * var32.field1861;
                                        if (var32.field1873 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field1789 += arg1 * var44 >> 15;
                                            super.field1792 += arg1 * var45 >> 15;
                                            super.field1786 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field472 != null) {
                for (int var47 = 0; var47 < var8.field472.length; ++var47) {
                    class155 var48 = (class155) class369.field5410.method2736(true, (long) var8.field472[var47]);
                    while (var48 != null) {
                        class134 var49 = var48.field2213;
                        int var50 = var4 - var48.field2204;
                        int var51 = var5 - var48.field2205;
                        int var52 = var6 - var48.field2210;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field1862) {
                            var48 = (class155) class369.field5410.method2737(-1);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field2215 * var52 + var48.field2209 * var50 + var49.field1872 * var51) * 65535L / (long) (var49.field1861 * var55);
                            if (var56 < (long) var49.field1869) {
                                var48 = (class155) class369.field5410.method2737(-1);
                            } else {
                                int var58 = 0;
                                if (var49.field1878 == 1) {
                                    var58 = (var55 >> 4) * var49.field1870;
                                } else if (var49.field1878 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field1870;
                                }
                                if (var49.field1880 == 0) {
                                    if (var49.field1873 == 0) {
                                        var13 += (var48.field2209 - var58) * arg1;
                                        var14 += (var49.field1872 - var58) * arg1;
                                        var15 += (var48.field2215 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field1789 += (var48.field2209 - var58) * arg1;
                                        super.field1792 += (var49.field1872 - var58) * arg1;
                                        super.field1786 += (var48.field2215 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field1861;
                                    int var60 = (var51 << 15) / var55 * var49.field1861;
                                    int var61 = (var52 << 15) / var55 * var49.field1861;
                                    if (var49.field1873 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field1789 += arg1 * var59 >> 15;
                                        super.field1792 += arg1 * var60 >> 15;
                                        super.field1786 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class155) class369.field5410.method2737(-1);
                            }
                        }
                    }
                }
            }
            if (var8.field482 != null) {
                if (var8.field444 == null) {
                    var8.field444 = new int[var8.field482.length];
                    for (int var62 = 0; var62 < var8.field482.length; ++var62) {
                        class334.method2146(var8.field482[var62], -8239);
                        var8.field444[var62] = ((class193) class147.field2061.method1204((byte) -79, (long) var8.field482[var62])).field2631;
                    }
                }
                for (int var63 = 0; var63 < var8.field444.length; ++var63) {
                    class134 var64 = class102.field1154[var8.field444[var63]];
                    if (var64.field1873 == 0) {
                        var13 += var64.field1879 * arg1;
                        var14 += var64.field1872 * arg1;
                        var15 += var64.field1877 * arg1;
                        var16 = true;
                    } else {
                        super.field1789 += var64.field1879 * arg1;
                        super.field1792 += var64.field1872 * arg1;
                        super.field1786 += var64.field1877 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field3512 = (short) var13;
                        this.field3511 = (short) var14;
                        this.field3513 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field3515 <<= 1;
                }
            }
            super.field1789 = (int) ((long) super.field1789 + ((long) this.field3512 * (long) this.field3515 >> 23) * (long) arg1);
            super.field1792 = (int) ((long) super.field1792 + ((long) this.field3511 * (long) this.field3515 >> 23) * (long) arg1);
            super.field1786 = (int) ((long) super.field1786 + ((long) this.field3513 * (long) this.field3515 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lwg;IIIIIIIIIIIZ)V")
    public final void method1616(class245 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        this.field3516 = arg0;
        super.field1789 = arg1 << class420.field6036;
        super.field1792 = arg2 << class420.field6036;
        super.field1786 = arg3 << class420.field6036;
        super.field1795 = arg9;
        this.field3510 = this.field3514 = (short) arg8;
        super.field1794 = arg10;
        super.field1788 = arg11;
        this.field3512 = (short) arg4;
        this.field3511 = (short) arg5;
        this.field3513 = (short) arg6;
        this.field3515 = arg7;
        super.field1787 = this.field3516.field3325.field345;
        this.method1617();
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "()V")
    private final void method1617() {
        int var1 = this.field3516.field3323.field5698;
        if (this.field3516.field3323.field5699[var1] != null) {
            this.field3516.field3323.field5699[var1].method1618();
        }
        this.field3516.field3323.field5699[var1] = this;
        this.field3509 = (short) this.field3516.field3323.field5698;
        this.field3516.field3323.field5698 = var1 + 1 & 8191;
        this.field3516.field3313.method1605(this, -14638);
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "()V")
    private final void method1618() {
        this.field3516.field3323.field5699[this.field3509] = null;
        class402.field5866[class404.field5892] = this;
        class404.field5892 = class404.field5892 + 1 & 1023;
        this.method96(3);
        this.method475(71);
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lwg;IIIIIIIIIIIZ)V")
    public class258(class245 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        this.field3516 = arg0;
        super.field1789 = arg1 << class420.field6036;
        super.field1792 = arg2 << class420.field6036;
        super.field1786 = arg3 << class420.field6036;
        super.field1795 = arg9;
        this.field3510 = this.field3514 = (short) arg8;
        super.field1794 = arg10;
        super.field1788 = arg11;
        this.field3512 = (short) arg4;
        this.field3511 = (short) arg5;
        this.field3513 = (short) arg6;
        this.field3515 = arg7;
        super.field1787 = this.field3516.field3325.field345;
        this.method1617();
    }
}
