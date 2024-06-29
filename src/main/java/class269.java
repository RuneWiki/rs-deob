import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class269 extends class161 {

    @OriginalMember(owner = "client!qg", name = "R", descriptor = "Lob;")
    private class440 field3822;

    @OriginalMember(owner = "client!qg", name = "N", descriptor = "S")
    private short field3818;

    @OriginalMember(owner = "client!qg", name = "P", descriptor = "S")
    private short field3820;

    @OriginalMember(owner = "client!qg", name = "K", descriptor = "S")
    private short field3815;

    @OriginalMember(owner = "client!qg", name = "L", descriptor = "S")
    private short field3816;

    @OriginalMember(owner = "client!qg", name = "M", descriptor = "S")
    private short field3817;

    @OriginalMember(owner = "client!qg", name = "J", descriptor = "I")
    private int field3814;

    @OriginalMember(owner = "client!qg", name = "Q", descriptor = "I")
    private int field3821;

    @OriginalMember(owner = "client!qg", name = "O", descriptor = "S")
    private short field3819;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lob;IIIIIIIIIIIZ)V")
    public final void method1785(class440 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        this.field3822 = arg0;
        super.field2124 = arg1 << class300.field4214;
        super.field2135 = arg2 << class300.field4214;
        super.field2136 = arg3 << class300.field4214;
        super.field2125 = arg9;
        this.field3820 = this.field3818 = (short) arg8;
        super.field2132 = arg10;
        super.field2128 = arg11;
        this.field3815 = (short) arg4;
        this.field3816 = (short) arg5;
        this.field3817 = (short) arg6;
        this.field3814 = arg7;
        super.field2141 = this.field3822.field6288.field525;
        this.method1789();
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "()V")
    private final void method1786() {
        this.field3822.field6311.field2960[this.field3819] = null;
        class81.field943[class408.field5882] = this;
        class408.field5882 = class408.field5882 + 1 & 1023;
        this.method2635(-13388);
        this.method1753(false);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(J)V")
    public final void method1787(long arg0) {
        int var3 = super.field2124 >> 19;
        int var4 = super.field2136 >> 19;
        int var5 = super.field2135 >> class300.field4214;
        if (var5 <= 0 && var5 >= -65535 && var3 >= 0 && var3 < class415.field5953 && var4 >= 0 && var4 < class299.field4190) {
            class209 var6 = this.field3822.field6311;
            class313 var7 = this.field3822.field6286;
            class327[] var8 = class161.field2122;
            int var9 = var8[var6.field2975].method328(var3, var4);
            int var10;
            if (var6.field2975 < 3) {
                var10 = var8[var6.field2975 + 1].method328(var3, var4);
            } else {
                var10 = var9 - 1024;
            }
            if (var7.field4446) {
                if (var7.field4425 == -1 && var5 > var9) {
                    this.method1786();
                    return;
                }
                if (var7.field4425 >= 0 && var5 > var8[var7.field4425].method328(var3, var4)) {
                    this.method1786();
                    return;
                }
                if (var7.field4486 == -1 && var5 < var10) {
                    this.method1786();
                    return;
                }
                if (var7.field4486 >= 0 && var5 < var8[var7.field4486 + 1].method328(var3, var4)) {
                    this.method1786();
                    return;
                }
            }
            if (var3 >= var6.field2971 && var3 <= var6.field2976 && var4 >= var6.field2972 && var4 <= var6.field2976 && var5 <= var9 && var5 >= var10) {
                var6.field2974.field725.method433((byte) 110, this);
            } else {
                byte var11 = 3;
                if (var5 > var8[1].method328(var3, var4)) {
                    var11 = 0;
                } else if (var5 > var8[2].method328(var3, var4)) {
                    var11 = 1;
                } else if (var5 > var8[3].method328(var3, var4)) {
                    var11 = 2;
                } else if (var5 < var8[3].method328(var3, var4) - 1024) {
                    this.method1786();
                    return;
                }
                class193 var12 = class250.field3570[var11][var3][var4];
                if (var12 == null) {
                    boolean var13 = class250.field3570[0][var3][var4].field2773 != null;
                    if (var11 == 3 && var13) {
                        this.method1786();
                        return;
                    }
                    for (int var14 = 1; var14 <= var11; ++var14) {
                        if (class250.field3570[var14][var3][var4] == null) {
                            var12 = class250.field3570[var14][var3][var4] = new class193(var14, var3, var4);
                            if (var13) {
                                ++var12.field2789;
                            }
                        }
                    }
                }
                if (var12.field2785 == null) {
                    var12.field2785 = new class63();
                    var12.field2778 = (byte) ((int) (arg0 & 255L));
                } else if ((byte) ((int) (arg0 & 255L)) != var12.field2778) {
                    var12.field2785 = new class63();
                    var12.field2778 = (byte) ((int) (arg0 & 255L));
                }
                var12.field2785.field725.method433((byte) 110, this);
            }
        } else {
            this.method1786();
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(JI)V")
    public final void method1788(long arg0, int arg1) {
        this.field3818 = (short) (this.field3818 - arg1);
        if (this.field3818 <= 0) {
            this.method1786();
        } else {
            int var4 = super.field2124 >> class300.field4214;
            int var5 = super.field2135 >> class300.field4214;
            int var6 = super.field2136 >> class300.field4214;
            class209 var7 = this.field3822.field6311;
            class313 var8 = this.field3822.field6286;
            if (var8.field4482 != 0) {
                if (this.field3820 - this.field3818 <= var8.field4441) {
                    int var9 = var8.field4477 * arg1 + (this.field3821 >> 16 & 255) + (super.field2125 >> 8 & 65280);
                    int var10 = var8.field4424 * arg1 + (this.field3821 >> 8 & 255) + (super.field2125 & 65280);
                    int var11 = var8.field4481 * arg1 + (super.field2125 << 8 & 65280) + (this.field3821 & 255);
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
                    super.field2125 &= -16777216;
                    super.field2125 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field3821 &= -16777216;
                    this.field3821 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field3820 - this.field3818 <= var8.field4418) {
                    int var12 = var8.field4474 * arg1 + (this.field3821 >> 24 & 255) + (super.field2125 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field2125 &= 16777215;
                    super.field2125 |= (var12 & 65280) << 16;
                    this.field3821 &= 16777215;
                    this.field3821 |= (var12 & 255) << 24;
                }
            }
            if (var8.field4466 != -1 && this.field3820 - this.field3818 <= var8.field4429) {
                this.field3814 += var8.field4442 * arg1;
            }
            if (var8.field4447 != -1 && this.field3820 - this.field3818 <= var8.field4411) {
                super.field2132 += var8.field4437 * arg1;
            }
            int var13 = this.field3815;
            int var14 = this.field3816;
            int var15 = this.field3817;
            boolean var16 = false;
            if (var8.field4448 == 1) {
                int var17 = var4 - this.field3822.field6314;
                int var18 = var5 - this.field3822.field6294;
                int var19 = var6 - this.field3822.field6297;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field4452 * var20 * arg1);
                this.field3814 = (int) ((long) this.field3814 - ((long) this.field3814 * var21 >> 18));
            } else if (var8.field4448 == 2) {
                int var23 = var4 - this.field3822.field6314;
                int var24 = var5 - this.field3822.field6294;
                int var25 = var6 - this.field3822.field6297;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field4452 * var26 * arg1);
                this.field3814 = (int) ((long) this.field3814 - ((long) this.field3814 * var27 >> 28));
            }
            if (var8.field4440 != null) {
                class406 var29 = var7.field2969.field1104;
                for (class406 var30 = var29.field5862; var29 != var30; var30 = var30.field5862) {
                    class385 var31 = (class385) var30;
                    class261 var32 = var31.field5430;
                    if (var32.field3725 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field4440.length; ++var34) {
                            if (var8.field4440[var34] == var32.field3731) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field5428;
                            int var36 = var5 - var31.field5432;
                            int var37 = var6 - var31.field5429;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field3728) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field5441 * var37 + var31.field5426 * var35 + var32.field3716 * var36) * 65535L / (long) (var32.field3715 * var40);
                                if (var41 >= (long) var32.field3721) {
                                    int var43 = 0;
                                    if (var32.field3719 == 1) {
                                        var43 = (var40 >> 4) * var32.field3717;
                                    } else if (var32.field3719 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field3717;
                                    }
                                    if (var32.field3729 == 0) {
                                        if (var32.field3713 == 0) {
                                            var13 += (var31.field5426 - var43) * arg1;
                                            var14 += (var32.field3716 - var43) * arg1;
                                            var15 += (var31.field5441 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field2124 += (var31.field5426 - var43) * arg1;
                                            super.field2135 += (var32.field3716 - var43) * arg1;
                                            super.field2136 += (var31.field5441 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field3715;
                                        int var45 = (var36 << 15) / var40 * var32.field3715;
                                        int var46 = (var37 << 15) / var40 * var32.field3715;
                                        if (var32.field3713 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field2124 += arg1 * var44 >> 15;
                                            super.field2135 += arg1 * var45 >> 15;
                                            super.field2136 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field4463 != null) {
                for (int var47 = 0; var47 < var8.field4463.length; ++var47) {
                    class385 var48 = (class385) class216.field3049.method547(-12822, (long) var8.field4463[var47]);
                    while (var48 != null) {
                        class261 var49 = var48.field5430;
                        int var50 = var4 - var48.field5428;
                        int var51 = var5 - var48.field5432;
                        int var52 = var6 - var48.field5429;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field3728) {
                            var48 = (class385) class216.field3049.method548((byte) 77);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field5441 * var52 + var48.field5426 * var50 + var49.field3716 * var51) * 65535L / (long) (var49.field3715 * var55);
                            if (var56 < (long) var49.field3721) {
                                var48 = (class385) class216.field3049.method548((byte) 94);
                            } else {
                                int var58 = 0;
                                if (var49.field3719 == 1) {
                                    var58 = (var55 >> 4) * var49.field3717;
                                } else if (var49.field3719 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field3717;
                                }
                                if (var49.field3729 == 0) {
                                    if (var49.field3713 == 0) {
                                        var13 += (var48.field5426 - var58) * arg1;
                                        var14 += (var49.field3716 - var58) * arg1;
                                        var15 += (var48.field5441 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field2124 += (var48.field5426 - var58) * arg1;
                                        super.field2135 += (var49.field3716 - var58) * arg1;
                                        super.field2136 += (var48.field5441 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field3715;
                                    int var60 = (var51 << 15) / var55 * var49.field3715;
                                    int var61 = (var52 << 15) / var55 * var49.field3715;
                                    if (var49.field3713 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field2124 += arg1 * var59 >> 15;
                                        super.field2135 += arg1 * var60 >> 15;
                                        super.field2136 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class385) class216.field3049.method548((byte) 85);
                            }
                        }
                    }
                }
            }
            if (var8.field4454 != null) {
                if (var8.field4419 == null) {
                    var8.field4419 = new int[var8.field4454.length];
                    for (int var62 = 0; var62 < var8.field4454.length; ++var62) {
                        class8.method63(var8.field4454[var62], true);
                        var8.field4419[var62] = ((class25) class267.field3804.method1888((long) var8.field4454[var62], (byte) -30)).field311;
                    }
                }
                for (int var63 = 0; var63 < var8.field4419.length; ++var63) {
                    class261 var64 = class334.field4731[var8.field4419[var63]];
                    if (var64.field3713 == 0) {
                        var13 += var64.field3726 * arg1;
                        var14 += var64.field3716 * arg1;
                        var15 += var64.field3724 * arg1;
                        var16 = true;
                    } else {
                        super.field2124 += var64.field3726 * arg1;
                        super.field2135 += var64.field3716 * arg1;
                        super.field2136 += var64.field3724 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field3815 = (short) var13;
                        this.field3816 = (short) var14;
                        this.field3817 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field3814 <<= 1;
                }
            }
            super.field2124 = (int) ((long) super.field2124 + ((long) this.field3815 * (long) this.field3814 >> 23) * (long) arg1);
            super.field2135 = (int) ((long) super.field2135 + ((long) this.field3816 * (long) this.field3814 >> 23) * (long) arg1);
            super.field2136 = (int) ((long) super.field2136 + ((long) this.field3817 * (long) this.field3814 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "()V")
    private final void method1789() {
        int var1 = this.field3822.field6311.field2965;
        if (this.field3822.field6311.field2960[var1] != null) {
            this.field3822.field6311.field2960[var1].method1786();
        }
        this.field3822.field6311.field2960[var1] = this;
        this.field3819 = (short) this.field3822.field6311.field2965;
        this.field3822.field6311.field2965 = var1 + 1 & 8191;
        this.field3822.field6290.method2511(-9, this);
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Lob;IIIIIIIIIIIZ)V")
    public class269(class440 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        this.field3822 = arg0;
        super.field2124 = arg1 << class300.field4214;
        super.field2135 = arg2 << class300.field4214;
        super.field2136 = arg3 << class300.field4214;
        super.field2125 = arg9;
        this.field3820 = this.field3818 = (short) arg8;
        super.field2132 = arg10;
        super.field2128 = arg11;
        this.field3815 = (short) arg4;
        this.field3816 = (short) arg5;
        this.field3817 = (short) arg6;
        this.field3814 = arg7;
        super.field2141 = this.field3822.field6288.field525;
        this.method1789();
    }
}
