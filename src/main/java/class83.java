import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class83 extends class281 {

    @OriginalMember(owner = "client!vf", name = "H", descriptor = "Lbq;")
    private class158 field1032;

    @OriginalMember(owner = "client!vf", name = "I", descriptor = "S")
    private short field1033;

    @OriginalMember(owner = "client!vf", name = "M", descriptor = "S")
    private short field1037;

    @OriginalMember(owner = "client!vf", name = "G", descriptor = "S")
    private short field1031;

    @OriginalMember(owner = "client!vf", name = "P", descriptor = "S")
    private short field1039;

    @OriginalMember(owner = "client!vf", name = "L", descriptor = "S")
    private short field1036;

    @OriginalMember(owner = "client!vf", name = "K", descriptor = "I")
    private int field1035;

    @OriginalMember(owner = "client!vf", name = "O", descriptor = "I")
    private int field1038;

    @OriginalMember(owner = "client!vf", name = "J", descriptor = "S")
    private short field1034;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(JI)V")
    public final void method511(long arg0, int arg1) {
        this.field1033 = (short) (this.field1033 - arg1);
        if (this.field1033 <= 0) {
            this.method512();
        } else {
            int var4 = super.field4506 >> class142.field2255;
            int var5 = super.field4503 >> class142.field2255;
            int var6 = super.field4494 >> class142.field2255;
            class78 var7 = this.field1032.field2513;
            class121 var8 = this.field1032.field2486;
            if (var8.field1714 != 0) {
                if (this.field1037 - this.field1033 <= var8.field1682) {
                    int var9 = var8.field1686 * arg1 + (this.field1038 >> 16 & 255) + (super.field4496 >> 8 & 65280);
                    int var10 = var8.field1715 * arg1 + (this.field1038 >> 8 & 255) + (super.field4496 & 65280);
                    int var11 = var8.field1651 * arg1 + (super.field4496 << 8 & 65280) + (this.field1038 & 255);
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
                    super.field4496 &= -16777216;
                    super.field4496 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field1038 &= -16777216;
                    this.field1038 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field1037 - this.field1033 <= var8.field1716) {
                    int var12 = var8.field1699 * arg1 + (this.field1038 >> 24 & 255) + (super.field4496 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field4496 &= 16777215;
                    super.field4496 |= (var12 & 65280) << 16;
                    this.field1038 &= 16777215;
                    this.field1038 |= (var12 & 255) << 24;
                }
            }
            if (var8.field1694 != -1 && this.field1037 - this.field1033 <= var8.field1670) {
                this.field1035 += var8.field1652 * arg1;
            }
            if (var8.field1671 != -1 && this.field1037 - this.field1033 <= var8.field1705) {
                super.field4505 += var8.field1711 * arg1;
            }
            int var13 = this.field1031;
            int var14 = this.field1039;
            int var15 = this.field1036;
            boolean var16 = false;
            if (var8.field1717 == 1) {
                int var17 = var4 - this.field1032.field2511;
                int var18 = var5 - this.field1032.field2500;
                int var19 = var6 - this.field1032.field2517;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field1704 * var20 * arg1);
                this.field1035 = (int) ((long) this.field1035 - ((long) this.field1035 * var21 >> 18));
            } else if (var8.field1717 == 2) {
                int var23 = var4 - this.field1032.field2511;
                int var24 = var5 - this.field1032.field2500;
                int var25 = var6 - this.field1032.field2517;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field1704 * var26 * arg1);
                this.field1035 = (int) ((long) this.field1035 - ((long) this.field1035 * var27 >> 28));
            }
            if (var8.field1687 != null) {
                class161 var29 = var7.field978.field459;
                for (class161 var30 = var29.field2537; var29 != var30; var30 = var30.field2537) {
                    class297 var31 = (class297) var30;
                    class203 var32 = var31.field4716;
                    if (var32.field3258 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field1687.length; ++var34) {
                            if (var8.field1687[var34] == var32.field3270) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field4720;
                            int var36 = var5 - var31.field4714;
                            int var37 = var6 - var31.field4721;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field3274) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field4722 * var37 + var31.field4718 * var35 + var32.field3259 * var36) * 65535L / (long) (var32.field3251 * var40);
                                if (var41 >= (long) var32.field3265) {
                                    int var43 = 0;
                                    if (var32.field3273 == 1) {
                                        var43 = (var40 >> 4) * var32.field3254;
                                    } else if (var32.field3273 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field3254;
                                    }
                                    if (var32.field3272 == 0) {
                                        if (var32.field3275 == 0) {
                                            var13 += (var31.field4718 - var43) * arg1;
                                            var14 += (var32.field3259 - var43) * arg1;
                                            var15 += (var31.field4722 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field4506 += (var31.field4718 - var43) * arg1;
                                            super.field4503 += (var32.field3259 - var43) * arg1;
                                            super.field4494 += (var31.field4722 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field3251;
                                        int var45 = (var36 << 15) / var40 * var32.field3251;
                                        int var46 = (var37 << 15) / var40 * var32.field3251;
                                        if (var32.field3275 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field4506 += arg1 * var44 >> 15;
                                            super.field4503 += arg1 * var45 >> 15;
                                            super.field4494 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field1688 != null) {
                for (int var47 = 0; var47 < var8.field1688.length; ++var47) {
                    class297 var48 = (class297) class221.field3660.method2538(-1, (long) var8.field1688[var47]);
                    while (var48 != null) {
                        class203 var49 = var48.field4716;
                        int var50 = var4 - var48.field4720;
                        int var51 = var5 - var48.field4714;
                        int var52 = var6 - var48.field4721;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field3274) {
                            var48 = (class297) class221.field3660.method2539(82);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field4722 * var52 + var48.field4718 * var50 + var49.field3259 * var51) * 65535L / (long) (var49.field3251 * var55);
                            if (var56 < (long) var49.field3265) {
                                var48 = (class297) class221.field3660.method2539(10);
                            } else {
                                int var58 = 0;
                                if (var49.field3273 == 1) {
                                    var58 = (var55 >> 4) * var49.field3254;
                                } else if (var49.field3273 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field3254;
                                }
                                if (var49.field3272 == 0) {
                                    if (var49.field3275 == 0) {
                                        var13 += (var48.field4718 - var58) * arg1;
                                        var14 += (var49.field3259 - var58) * arg1;
                                        var15 += (var48.field4722 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field4506 += (var48.field4718 - var58) * arg1;
                                        super.field4503 += (var49.field3259 - var58) * arg1;
                                        super.field4494 += (var48.field4722 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field3251;
                                    int var60 = (var51 << 15) / var55 * var49.field3251;
                                    int var61 = (var52 << 15) / var55 * var49.field3251;
                                    if (var49.field3275 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field4506 += arg1 * var59 >> 15;
                                        super.field4503 += arg1 * var60 >> 15;
                                        super.field4494 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class297) class221.field3660.method2539(77);
                            }
                        }
                    }
                }
            }
            if (var8.field1650 != null) {
                if (var8.field1648 == null) {
                    var8.field1648 = new int[var8.field1650.length];
                    for (int var62 = 0; var62 < var8.field1650.length; ++var62) {
                        class180.method1235(-30827, var8.field1650[var62]);
                        var8.field1648[var62] = ((class160) class203.field3267.method1770(-880, (long) var8.field1650[var62])).field2527;
                    }
                }
                for (int var63 = 0; var63 < var8.field1648.length; ++var63) {
                    class203 var64 = class412.field6105[var8.field1648[var63]];
                    if (var64.field3275 == 0) {
                        var13 += var64.field3257 * arg1;
                        var14 += var64.field3259 * arg1;
                        var15 += var64.field3249 * arg1;
                        var16 = true;
                    } else {
                        super.field4506 += var64.field3257 * arg1;
                        super.field4503 += var64.field3259 * arg1;
                        super.field4494 += var64.field3249 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field1031 = (short) var13;
                        this.field1039 = (short) var14;
                        this.field1036 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field1035 <<= 1;
                }
            }
            super.field4506 = (int) ((long) super.field4506 + ((long) this.field1031 * (long) this.field1035 >> 23) * (long) arg1);
            super.field4503 = (int) ((long) super.field4503 + ((long) this.field1039 * (long) this.field1035 >> 23) * (long) arg1);
            super.field4494 = (int) ((long) super.field4494 + ((long) this.field1036 * (long) this.field1035 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "()V")
    private final void method512() {
        this.field1032.field2513.field972[this.field1034] = null;
        class421.field6222[class270.field4337] = this;
        class270.field4337 = class270.field4337 + 1 & 1023;
        this.method2100(-83);
        this.method992(3);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lbq;IIIIIIIIIIIZ)V")
    public final void method513(class158 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        this.field1032 = arg0;
        super.field4506 = arg1 << class142.field2255;
        super.field4503 = arg2 << class142.field2255;
        super.field4494 = arg3 << class142.field2255;
        super.field4496 = arg9;
        this.field1037 = this.field1033 = (short) arg8;
        super.field4505 = arg10;
        super.field4495 = arg11;
        this.field1031 = (short) arg4;
        this.field1039 = (short) arg5;
        this.field1036 = (short) arg6;
        this.field1035 = arg7;
        super.field4497 = this.field1032.field2493.field159;
        this.method515();
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(J)V")
    public final void method514(long arg0) {
        int var3 = super.field4506 >> 19;
        int var4 = super.field4494 >> 19;
        int var5 = super.field4503 >> class142.field2255;
        if (var5 <= 0 && var5 >= -65535 && var3 >= 0 && var3 < class156.field2449 && var4 >= 0 && var4 < class361.field5513) {
            class78 var6 = this.field1032.field2513;
            class121 var7 = this.field1032.field2486;
            class129[] var8 = class275.field4396;
            int var9 = var8[var6.field980].method779(var3, var4);
            int var10;
            if (var6.field980 < 3) {
                var10 = var8[var6.field980 + 1].method779(var3, var4);
            } else {
                var10 = var9 - 1024;
            }
            if (var7.field1668) {
                if (var7.field1647 == -1 && var5 > var9) {
                    this.method512();
                    return;
                }
                if (var7.field1647 >= 0 && var5 > var8[var7.field1647].method779(var3, var4)) {
                    this.method512();
                    return;
                }
                if (var7.field1676 == -1 && var5 < var10) {
                    this.method512();
                    return;
                }
                if (var7.field1676 >= 0 && var5 < var8[var7.field1676 + 1].method779(var3, var4)) {
                    this.method512();
                    return;
                }
            }
            if (var3 >= var6.field983 && var3 <= var6.field979 && var4 >= var6.field985 && var4 <= var6.field979 && var5 <= var9 && var5 >= var10) {
                var6.field981.field3189.method2180(this, 64);
            } else {
                byte var11 = 3;
                if (var5 > var8[1].method779(var3, var4)) {
                    var11 = 0;
                } else if (var5 > var8[2].method779(var3, var4)) {
                    var11 = 1;
                } else if (var5 > var8[3].method779(var3, var4)) {
                    var11 = 2;
                } else if (var5 < var8[3].method779(var3, var4) - 1024) {
                    this.method512();
                    return;
                }
                class232 var12 = class423.field6252[var11][var3][var4];
                if (var12 == null) {
                    boolean var13 = class423.field6252[0][var3][var4].field3863 != null;
                    if (var11 == 3 && var13) {
                        this.method512();
                        return;
                    }
                    for (int var14 = 1; var14 <= var11; ++var14) {
                        if (class423.field6252[var14][var3][var4] == null) {
                            var12 = class423.field6252[var14][var3][var4] = new class232(var14, var3, var4);
                            if (var13) {
                                ++var12.field3879;
                            }
                        }
                    }
                }
                if (var12.field3865 == null) {
                    var12.field3865 = new class198();
                    var12.field3875 = (byte) ((int) (arg0 & 255L));
                } else if ((byte) ((int) (arg0 & 255L)) != var12.field3875) {
                    var12.field3865 = new class198();
                    var12.field3875 = (byte) ((int) (arg0 & 255L));
                }
                var12.field3865.field3189.method2180(this, 64);
            }
        } else {
            this.method512();
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "()V")
    private final void method515() {
        int var1 = this.field1032.field2513.field968;
        if (this.field1032.field2513.field972[var1] != null) {
            this.field1032.field2513.field972[var1].method512();
        }
        this.field1032.field2513.field972[var1] = this;
        this.field1034 = (short) this.field1032.field2513.field968;
        this.field1032.field2513.field968 = var1 + 1 & 8191;
        this.field1032.field2499.method2442(this, (byte) 126);
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lbq;IIIIIIIIIIIZ)V")
    public class83(class158 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        this.field1032 = arg0;
        super.field4506 = arg1 << class142.field2255;
        super.field4503 = arg2 << class142.field2255;
        super.field4494 = arg3 << class142.field2255;
        super.field4496 = arg9;
        this.field1037 = this.field1033 = (short) arg8;
        super.field4505 = arg10;
        super.field4495 = arg11;
        this.field1031 = (short) arg4;
        this.field1039 = (short) arg5;
        this.field1036 = (short) arg6;
        this.field1035 = arg7;
        super.field4497 = this.field1032.field2493.field159;
        this.method515();
    }
}
