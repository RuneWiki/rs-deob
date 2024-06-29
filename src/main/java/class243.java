import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class243 extends class190 {

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "Z")
    public boolean field3882 = false;

    @OriginalMember(owner = "client!ui", name = "D", descriptor = "Lpd;")
    public class58 field3886;

    @OriginalMember(owner = "client!ui", name = "E", descriptor = "I")
    public int field3887;

    @OriginalMember(owner = "client!ui", name = "B", descriptor = "I")
    public int field3884;

    @OriginalMember(owner = "client!ui", name = "H", descriptor = "I")
    public int field3890;

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "I")
    public int field3877;

    @OriginalMember(owner = "client!ui", name = "v", descriptor = "S")
    private short field3878;

    @OriginalMember(owner = "client!ui", name = "C", descriptor = "S")
    private short field3885;

    @OriginalMember(owner = "client!ui", name = "x", descriptor = "S")
    private short field3880;

    @OriginalMember(owner = "client!ui", name = "G", descriptor = "S")
    private short field3889;

    @OriginalMember(owner = "client!ui", name = "F", descriptor = "S")
    private short field3888;

    @OriginalMember(owner = "client!ui", name = "A", descriptor = "I")
    private int field3883;

    @OriginalMember(owner = "client!ui", name = "y", descriptor = "I")
    private static int field3881 = 12;

    @OriginalMember(owner = "client!ui", name = "w", descriptor = "I")
    private int field3879;

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "S")
    private short field3876;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "()V")
    private final void method1651() {
        this.field3886.field910.field3968[this.field3876] = null;
        class249.field3966[class249.field3975] = this;
        class249.field3975 = class249.field3975 + 1 & 0x3FF;
        this.field3886 = null;
        this.method1043(268427922);
        this.method1354((byte) -45);
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "()V")
    private final void method1652() {
        int var1 = this.field3886.field910.field3971;
        if (this.field3886.field910.field3968[var1] != null) {
            this.field3886.field910.field3968[var1].method1651();
        }
        this.field3886.field910.field3968[var1] = this;
        this.field3876 = (short) this.field3886.field910.field3971;
        this.field3886.field910.field3971 = var1 + 1 & 0x1FFF;
        this.field3886.field903.method1487(true, this);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lpd;IIIIIIIII)V")
    public final void method1653(class58 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field3886 = arg0;
        this.field3887 = arg1 << field3881;
        this.field3884 = arg2 << field3881;
        this.field3890 = arg3 << field3881;
        this.field3877 = arg9;
        this.field3885 = this.field3878 = (short) arg8;
        this.field3880 = (short) arg4;
        this.field3889 = (short) arg5;
        this.field3888 = (short) arg6;
        this.field3883 = arg7;
        this.method1652();
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(JI)V")
    public final void method1654(long arg0, int arg1) {
        if (this.field3886 == null) {
            return;
        }
        this.field3878 = (short) (this.field3878 - arg1);
        if (this.field3878 <= 0) {
            this.method1651();
            return;
        }
        int var4 = this.field3887 >> field3881;
        int var5 = this.field3884 >> field3881;
        int var6 = this.field3890 >> field3881;
        class249 var7 = this.field3886.field910;
        class172 var8 = this.field3886.field901;
        if (var8.field2647 != 0) {
            if (this.field3885 - this.field3878 <= var8.field2629) {
                int var9 = var8.field2636 * arg1 + (this.field3879 >> 16 & 0xFF) + (this.field3877 >> 8 & 0xFF00);
                int var10 = var8.field2650 * arg1 + (this.field3879 >> 8 & 0xFF) + (this.field3877 & 0xFF00);
                int var11 = var8.field2627 * arg1 + (this.field3877 & 0xFF << 8) + (this.field3879 & 0xFF);
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
                this.field3877 &= 0xFF000000;
                this.field3877 |= ((var11 & 0xFF00) >> 8) + ((var9 & 0xFF00) << 8) + (var10 & 0xFF00);
                this.field3879 &= 0xFF000000;
                this.field3879 |= (var11 & 0xFF) + ((var9 & 0xFF) << 16) + ((var10 & 0xFF) << 8);
            }
            if (this.field3885 - this.field3878 <= var8.field2630) {
                int var12 = var8.field2606 * arg1 + (this.field3879 >> 24 & 0xFF) + (this.field3877 >> 16 & 0xFF00);
                if (var12 < 0) {
                    var12 = 0;
                } else if (var12 > 65535) {
                    var12 = 65535;
                }
                this.field3877 &= 0xFFFFFF;
                this.field3877 |= (var12 & 0xFF00) << 16;
                this.field3879 &= 0xFFFFFF;
                this.field3879 |= (var12 & 0xFF) << 24;
            }
        }
        if (var8.field2597 != -1 && this.field3885 - this.field3878 <= var8.field2642) {
            this.field3883 += var8.field2635 * arg1;
        }
        int var13 = this.field3880;
        int var14 = this.field3889;
        int var15 = this.field3888;
        boolean var16 = false;
        if (var8.field2595 == 1) {
            int var17 = var4 - this.field3886.field902;
            int var18 = var5 - this.field3886.field909;
            int var19 = var6 - this.field3886.field931;
            int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
            long var21 = (long) (var8.field2617 * var20 * arg1);
            this.field3883 = (int) ((long) this.field3883 - ((long) this.field3883 * var21 >> 18));
        } else if (var8.field2595 == 2) {
            int var23 = var4 - this.field3886.field902;
            int var24 = var5 - this.field3886.field909;
            int var25 = var6 - this.field3886.field931;
            int var26 = var25 * var25 + var23 * var23 + var24 * var24;
            long var27 = (long) (var8.field2617 * var26 * arg1);
            this.field3883 = (int) ((long) this.field3883 - ((long) this.field3883 * var27 >> 28));
        }
        class134 var29 = var7.field3978.field27;
        for (class134 var30 = var29.field2006; var30 != var29; var30 = var30.field2006) {
            class43 var57 = (class43) var30;
            class248 var58 = var57.field721.field3136;
            if (var58.field3956 != 1) {
                int var59 = var4 - var57.field717;
                int var60 = var5 - var57.field724;
                int var61 = var6 - var57.field718;
                long var62 = (long) (var61 * var61 + var59 * var59 + var60 * var60);
                if (var62 <= var58.field3950) {
                    int var64 = (int) Math.sqrt((double) var62);
                    if (var64 == 0) {
                        var64 = 1;
                    }
                    long var65 = (long) (var57.field720 * var61 + var57.field719 * var59 + var58.field3949 * var60) * 65535L / (long) (var58.field3957 * var64);
                    if (var65 >= (long) var58.field3955) {
                        int var67 = 0;
                        if (var58.field3939 == 1) {
                            var67 = (var64 >> 4) * var58.field3942;
                        } else if (var58.field3939 == 2) {
                            var67 = (var64 >> 4) * (var64 >> 4) * var58.field3942;
                        }
                        if (var58.field3944 != 0) {
                            int var68 = (var59 << 15) / var64 * var58.field3957;
                            int var69 = (var60 << 15) / var64 * var58.field3957;
                            int var70 = (var61 << 15) / var64 * var58.field3957;
                            if (var58.field3943 == 0) {
                                var13 += arg1 * var68 >> 15;
                                var14 += arg1 * var69 >> 15;
                                var15 += arg1 * var70 >> 15;
                                var16 = true;
                            } else {
                                this.field3887 += arg1 * var68 >> 15;
                                this.field3884 += arg1 * var69 >> 15;
                                this.field3890 += arg1 * var70 >> 15;
                            }
                        } else if (var58.field3943 == 0) {
                            var13 += (var57.field719 - var67) * arg1;
                            var14 += (var58.field3949 - var67) * arg1;
                            var15 += (var57.field720 - var67) * arg1;
                            var16 = true;
                        } else {
                            this.field3887 += (var57.field719 - var67) * arg1;
                            this.field3884 += (var58.field3949 - var67) * arg1;
                            this.field3890 += (var57.field720 - var67) * arg1;
                        }
                    }
                }
            }
        }
        if (var8.field2612 != null) {
            for (int var31 = 0; var31 < var8.field2612.length; var31++) {
                class43 var32 = (class43) class249.field3965.method972((long) var8.field2612[var31], true);
                while (var32 != null) {
                    class248 var33 = var32.field721.field3136;
                    int var34 = var4 - var32.field717;
                    int var35 = var5 - var32.field724;
                    int var36 = var6 - var32.field718;
                    long var37 = (long) (var36 * var36 + var34 * var34 + var35 * var35);
                    if (var37 > var33.field3950) {
                        var32 = (class43) class249.field3965.method973(false);
                    } else {
                        int var39 = (int) Math.sqrt((double) var37);
                        if (var39 == 0) {
                            var39 = 1;
                        }
                        long var40 = (long) (var32.field720 * var36 + var32.field719 * var34 + var33.field3949 * var35) * 65535L / (long) (var33.field3957 * var39);
                        if (var40 < (long) var33.field3955) {
                            var32 = (class43) class249.field3965.method973(false);
                        } else {
                            int var42 = 0;
                            if (var33.field3939 == 1) {
                                var42 = (var39 >> 4) * var33.field3942;
                            } else if (var33.field3939 == 2) {
                                var42 = (var39 >> 4) * (var39 >> 4) * var33.field3942;
                            }
                            if (var33.field3944 != 0) {
                                int var43 = (var34 << 15) / var39 * var33.field3957;
                                int var44 = (var35 << 15) / var39 * var33.field3957;
                                int var45 = (var36 << 15) / var39 * var33.field3957;
                                if (var33.field3943 == 0) {
                                    var13 += arg1 * var43 >> 15;
                                    var14 += arg1 * var44 >> 15;
                                    var15 += arg1 * var45 >> 15;
                                    var16 = true;
                                } else {
                                    this.field3887 += arg1 * var43 >> 15;
                                    this.field3884 += arg1 * var44 >> 15;
                                    this.field3890 += arg1 * var45 >> 15;
                                }
                            } else if (var33.field3943 == 0) {
                                var13 += (var32.field719 - var42) * arg1;
                                var14 += (var33.field3949 - var42) * arg1;
                                var15 += (var32.field720 - var42) * arg1;
                                var16 = true;
                            } else {
                                this.field3887 += (var32.field719 - var42) * arg1;
                                this.field3884 += (var33.field3949 - var42) * arg1;
                                this.field3890 += (var32.field720 - var42) * arg1;
                            }
                            var32 = (class43) class249.field3965.method973(false);
                        }
                    }
                }
            }
        }
        if (var8.field2592 != null) {
            if (var8.field2600 == null) {
                var8.field2600 = new int[var8.field2592.length];
                for (int var46 = 0; var46 < var8.field2592.length; var46++) {
                    class213.method1474(true, var8.field2592[var46]);
                    var8.field2600[var46] = ((class283) class199.field3094.method2043((long) var8.field2592[var46], -1)).field4457;
                }
            }
            for (int var47 = 0; var47 < var8.field2600.length; var47++) {
                class248 var48 = class288.field4502[var8.field2600[var47]];
                if (var48.field3943 == 0) {
                    var13 += var48.field3948 * arg1;
                    var14 += var48.field3949 * arg1;
                    var15 += var48.field3936 * arg1;
                    var16 = true;
                } else {
                    this.field3887 += var48.field3948 * arg1;
                    this.field3884 += var48.field3949 * arg1;
                    this.field3890 += var48.field3936 * arg1;
                }
            }
        }
        if (var16) {
            while (true) {
                if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                    this.field3880 = (short) var13;
                    this.field3889 = (short) var14;
                    this.field3888 = (short) var15;
                    break;
                }
                var13 >>= 0x1;
                var14 >>= 0x1;
                var15 >>= 0x1;
                this.field3883 <<= 0x1;
            }
        }
        this.field3887 = (int) ((long) this.field3887 + ((long) this.field3880 * (long) this.field3883 >> 23) * (long) arg1);
        this.field3884 = (int) ((long) this.field3884 + ((long) this.field3889 * (long) this.field3883 >> 23) * (long) arg1);
        this.field3890 = (int) ((long) this.field3890 + ((long) this.field3888 * (long) this.field3883 >> 23) * (long) arg1);
        int var49 = this.field3887 >> 19;
        int var50 = this.field3890 >> 19;
        int var51 = this.field3884 >> field3881;
        if (var51 > 0 || var51 < -65535 || var49 < 0 || var49 >= class235.field3716 || var50 < 0 || var50 >= class291.field4515) {
            this.method1651();
            return;
        }
        int[][][] var52 = class233.field3684;
        int var53 = var52[var7.field3998][var49][var50];
        int var54;
        if (var7.field3998 < 3) {
            var54 = var52[var7.field3998 + 1][var49][var50];
        } else {
            var54 = var52[var7.field3998][var49][var50] - 1024;
        }
        if (var8.field2591) {
            if (var8.field2619 == -1 && var51 > var53) {
                this.method1651();
                return;
            }
            if (var8.field2619 >= 0 && var51 > var52[var8.field2619][var49][var50]) {
                this.method1651();
                return;
            }
            if (var8.field2594 == -1 && var51 < var54) {
                this.method1651();
                return;
            }
            if (var8.field2594 >= 0 && var51 < var52[var8.field2594 + 1][var49][var50]) {
                this.method1651();
                return;
            }
        }
        if (var49 >= var7.field3997 && var49 <= var7.field3985 && var50 >= var7.field3991 && var50 <= var7.field3984 && var51 <= var7.field3990 && var51 >= var7.field3986) {
            this.field3882 = false;
            return;
        }
        this.field3882 = true;
        byte var55 = 3;
        if (var51 > var52[1][var49][var50]) {
            var55 = 0;
        } else if (var51 > var52[2][var49][var50]) {
            var55 = 1;
        } else if (var51 > var52[3][var49][var50]) {
            var55 = 2;
        } else if (var51 < var52[3][var49][var50] - 1024) {
            this.method1651();
            return;
        }
        class22 var56 = class149.field2210[var55][var49][var50];
        if (var56 == null) {
            var56 = class149.field2210[var55][var49][var50] = new class22(var55, var49, var50);
        }
        if (var56.field356 == null) {
            var56.field356 = new class236();
            var56.field358 = (byte) ((int) (arg0 & 0xFFL));
        } else if ((byte) ((int) (arg0 & 0xFFL)) != var56.field358) {
            var56.field356.method1617(-123);
            var56.field358 = (byte) ((int) (arg0 & 0xFFL));
        }
        var56.field356.method1615(this, -1);
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lpd;IIIIIIIII)V")
    public class243(class58 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field3886 = arg0;
        this.field3887 = arg1 << field3881;
        this.field3884 = arg2 << field3881;
        this.field3890 = arg3 << field3881;
        this.field3877 = arg9;
        this.field3885 = this.field3878 = (short) arg8;
        this.field3880 = (short) arg4;
        this.field3889 = (short) arg5;
        this.field3888 = (short) arg6;
        this.field3883 = arg7;
        this.method1652();
    }
}
