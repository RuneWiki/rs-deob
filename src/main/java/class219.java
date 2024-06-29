import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class219 extends class124 {

    @OriginalMember(owner = "client!tm", name = "Kc", descriptor = "I")
    public int field3598 = -1;

    @OriginalMember(owner = "client!tm", name = "Qc", descriptor = "I")
    public int field3604 = -1;

    @OriginalMember(owner = "client!tm", name = "Xc", descriptor = "I")
    public int field3611 = -1;

    @OriginalMember(owner = "client!tm", name = "Fc", descriptor = "I")
    public int field3593 = 0;

    @OriginalMember(owner = "client!tm", name = "Wc", descriptor = "I")
    public int field3610 = 255;

    @OriginalMember(owner = "client!tm", name = "Rc", descriptor = "I")
    public int field3605 = 0;

    @OriginalMember(owner = "client!tm", name = "Tc", descriptor = "B")
    private byte field3607 = 0;

    @OriginalMember(owner = "client!tm", name = "cd", descriptor = "I")
    public int field3616 = -1;

    @OriginalMember(owner = "client!tm", name = "C", descriptor = "I")
    public int field3586 = 0;

    @OriginalMember(owner = "client!tm", name = "dd", descriptor = "I")
    public int field3617 = -1;

    @OriginalMember(owner = "client!tm", name = "bd", descriptor = "Z")
    public boolean field3615 = false;

    @OriginalMember(owner = "client!tm", name = "Pc", descriptor = "I")
    public int field3603 = 0;

    @OriginalMember(owner = "client!tm", name = "id", descriptor = "I")
    public int field3622 = -1;

    @OriginalMember(owner = "client!tm", name = "Oc", descriptor = "B")
    private byte field3602 = 0;

    @OriginalMember(owner = "client!tm", name = "gd", descriptor = "I")
    public int field3620 = 0;

    @OriginalMember(owner = "client!tm", name = "jd", descriptor = "I")
    public int field3623 = -1;

    @OriginalMember(owner = "client!tm", name = "zc", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!tm", name = "Bc", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!tm", name = "Cc", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!tm", name = "Dc", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!tm", name = "Ec", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!tm", name = "Gc", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!tm", name = "Hc", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!tm", name = "Ic", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!tm", name = "Jc", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!tm", name = "Mc", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!tm", name = "Sc", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!tm", name = "Uc", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!tm", name = "Vc", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!tm", name = "Yc", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!tm", name = "Zc", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!tm", name = "ad", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!tm", name = "ed", descriptor = "I")
    private int field3618;

    @OriginalMember(owner = "client!tm", name = "fd", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!tm", name = "hd", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!tm", name = "Lc", descriptor = "Lhe;")
    public class208 field3599;

    @OriginalMember(owner = "client!tm", name = "kd", descriptor = "Lmo;")
    public static class447 field3624;

    @OriginalMember(owner = "client!tm", name = "Ac", descriptor = "Ljava/lang/String;")
    public String field3588;

    @OriginalMember(owner = "client!tm", name = "Nc", descriptor = "Ljava/lang/String;")
    public String field3601;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "(B)V")
    public static void method1562(byte arg0) {
        if (arg0 != -44) {
            method1568(-85, -125);
        }
        field3624 = null;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IZLe;)Z")
    private final boolean method1563(int arg0, boolean arg1, class312 arg2) {
        ++field3621;
        int var4 = arg0;
        class349 var5 = this.method912(-5);
        class417 var6 = super.field1878 != -1 && ~super.field1880 == -1 ? class156.method1099(super.field1878, 123) : null;
        class417 var7 = super.field1851 == -1 || this.field3615 || super.field1831 && var6 != null ? null : class156.method1099(super.field1851, 112);
        int var8 = var5.field5395;
        int var9 = var5.field5380;
        if (var8 != 0 || ~var9 != -1 || ~var5.field5408 != -1 || ~var5.field5412 != -1) {
            arg0 |= 7;
        }
        super.field1918[0] = this.field3599.method1470(super.field1835, super.field1893, super.field1885, super.field1875, super.field1883, var7, 5, super.field1876, arg0, arg2, super.field1845, var6, true);
        int var10 = class209.method1479(15795);
        if (~class27.field314 > -97 && var10 > 50) {
            class12.method118((byte) -73);
        }
        if (class348.field5355 != 0 && ~var10 > -51) {
            int var11 = -var10 + 50;
            while (~class376.field5686 > ~var11) {
                class321.field5015[class376.field5686] = new byte[102400];
                ++class376.field5686;
            }
            while (~var11 > ~class376.field5686) {
                --class376.field5686;
                class321.field5015[class376.field5686] = null;
            }
        } else if (~class348.field5355 != -1) {
            class321.field5015 = new byte[50][];
            class376.field5686 = 0;
        }
        if (super.field1918[0] == null) {
            return false;
        } else {
            super.field1896 = super.field1918[0].method57();
            this.method907(super.field1918[0], 0);
            int var12 = super.field1870.method1032(-94);
            super.field1850 = 0;
            super.field1836 = 0;
            super.field1838 = 0;
            if (~var8 == -1 && ~var9 == -1) {
                this.method917(this.method903(-106) << 7, var12, this.method903(-118) << 7, 127);
            } else {
                this.method917(var9, var12, var8, 111);
                if (~super.field1836 != -1) {
                    super.field1918[0].method42(super.field1836);
                }
                if (~super.field1838 != -1) {
                    super.field1918[0].method18(super.field1838);
                }
                if (~super.field1850 != -1) {
                    super.field1918[0].method51(0, super.field1850, 0);
                }
            }
            super.field1918[1] = null;
            if (arg1) {
                return false;
            } else {
                if (!this.field3615 && ~super.field1873 != 0 && ~super.field1879 != 0) {
                    class379 var13 = class115.method839((byte) -57, super.field1873);
                    class348 var14 = var13.method2415(super.field1867, super.field1879, (!var13.field5728 ? 2 : 7) | var4, -108, arg2, super.field1866);
                    if (var14 != null) {
                        var14.method51(0, -super.field1826, 0);
                        if (var13.field5728 && (~var8 != -1 || var9 != 0)) {
                            if (super.field1836 != 0) {
                                var14.method42(super.field1836);
                            }
                            if (super.field1838 != 0) {
                                var14.method18(super.field1838);
                            }
                            if (~super.field1850 != -1) {
                                var14.method51(0, super.field1850, 0);
                            }
                        }
                        super.field1918[1] = var14;
                    }
                }
                super.field1918[2] = null;
                if (!this.field3615 && super.field1904 != null) {
                    if (class183.field2987 >= super.field1900) {
                        super.field1904 = null;
                    }
                    if (class183.field2987 >= super.field1908 && super.field1900 > class183.field2987) {
                        class348 var15 = super.field1904.method200(arg2, var4 | 7, (byte) -52);
                        if (var15 != null) {
                            var15.method51(-super.field724 + super.field1902, -super.field721 + super.field1901, -super.field722 + super.field1910);
                            if (~var12 != -1) {
                                var15.method41(-var12 & 16383);
                            }
                            super.field1918[2] = var15;
                        }
                    }
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Ljg;I)V")
    public final void method1564(class186 arg0, int arg1) {
        ++field3594;
        arg0.field3044 = 0;
        int var3 = arg0.method1322(false);
        int var4 = var3 & 1;
        if (arg1 > -125) {
            this.method903(38);
        }
        boolean var5 = (var3 & 2) != 0;
        boolean var6 = ~(var3 & 4) != -1;
        int var7 = super.method903(-36);
        this.method910(((var3 & 57) >> 3) + 1, -13034);
        this.field3602 = (byte) ((197 & var3) >> 6);
        super.field724 += (this.method903(-50) + -var7) * 64;
        super.field722 += (this.method903(-71) + -var7) * 64;
        this.field3607 = arg0.method1327((byte) -111);
        this.field3616 = arg0.method1327((byte) -100);
        this.field3611 = arg0.method1327((byte) -97);
        int var8 = -1;
        this.field3586 = 0;
        int[] var9 = new int[12];
        for (int var10 = 0; ~var10 > -13; ++var10) {
            int var11 = arg0.method1322(false);
            if (var11 == 0) {
                var9[var10] = 0;
            } else {
                int var12 = arg0.method1322(false);
                int var13 = (var11 << 8) - -var12;
                if (var10 == 0 && ~var13 == -65536) {
                    var8 = arg0.method1272((byte) -92);
                    this.field3586 = arg0.method1322(false);
                    break;
                }
                if (~var13 <= -32769) {
                    int var27 = class369.field5596[var13 + -32768];
                    var9[var10] = class35.method227(var27, 1073741824);
                    int var28 = class155.method1092(true, var27).field1332;
                    if (~var28 != -1) {
                        this.field3586 = var28;
                    }
                } else {
                    var9[var10] = class35.method227(Integer.MIN_VALUE, var13 - 256);
                }
            }
        }
        int[] var14 = new int[5];
        for (int var15 = 0; var15 < 5; ++var15) {
            int var26 = arg0.method1322(false);
            if (var26 < 0 || class343.field5287[var15].length <= var26) {
                var26 = 0;
            }
            var14[var15] = var26;
        }
        this.field3618 = arg0.method1272((byte) -122);
        this.field3601 = arg0.method1270(-9970);
        if (!var5) {
            this.field3588 = this.field3601;
        } else {
            this.field3588 = arg0.method1270(-9970);
        }
        this.field3603 = arg0.method1322(false);
        if (!var6) {
            this.field3605 = 0;
            this.field3593 = arg0.method1322(false);
            this.field3604 = arg0.method1322(false);
            if (~this.field3604 == -256) {
                this.field3604 = -1;
            }
        } else {
            this.field3605 = arg0.method1272((byte) -66);
            this.field3593 = this.field3603;
            this.field3604 = -1;
        }
        int var16 = this.field3620;
        this.field3620 = arg0.method1322(false);
        if (~this.field3620 != -1) {
            int var17 = this.field3622;
            int var18 = this.field3598;
            int var19 = this.field3617;
            int var20 = this.field3623;
            int var21 = this.field3610;
            this.field3622 = arg0.method1272((byte) -105);
            this.field3598 = arg0.method1272((byte) -82);
            this.field3617 = arg0.method1272((byte) -93);
            this.field3623 = arg0.method1272((byte) -113);
            this.field3610 = arg0.method1322(false);
            if (this.field3620 != var16 || this.field3622 != var17 || this.field3598 != var18 || ~this.field3617 != ~var19 || ~this.field3623 != ~var20 || ~this.field3610 != ~var21) {
                class47.method301(this, 1115716268);
            }
        } else {
            class340.method2233((byte) -26, this);
        }
        if (this.field3599 == null) {
            this.field3599 = new class208();
        }
        int var22 = this.field3599.field3330;
        int[] var23 = this.field3599.field3342;
        this.field3599.method1461(var8, 3, var14, this.method309((byte) -125), var9, ~var4 == -2);
        if (~var8 != ~var22) {
            super.field724 = super.field1906[0] * 128 - -(this.method903(-43) * 64);
            super.field722 = super.field1916[0] * 128 + 64 * this.method903(-66);
        }
        if (super.field1868 == 2047 && var23 != null) {
            for (int var24 = 0; var14.length > var24; ++var24) {
                if (var14[var24] != var23[var24]) {
                    class265.method1811(250);
                    break;
                }
            }
        }
        if (super.field1907 != null) {
            super.field1907.method491();
        }
        if (super.field1851 != -1 && super.field1831) {
            class349 var25 = this.method912(-5);
            if (!var25.method2282(0, super.field1851)) {
                super.field1831 = false;
                super.field1851 = -1;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lpg;IIIILe;Lid;I)V")
    private final void method1565(class435 arg0, int arg1, int arg2, int arg3, int arg4, class312 arg5, class348 arg6, int arg7) {
        ++field3608;
        int var9 = arg1 * arg1 + arg7 * arg7;
        if (var9 >= 16 && ~var9 >= ~arg2) {
            int var10 = (int) (Math.atan2((double) arg1, (double) arg7) * 2607.5945876176133D) & 16383;
            if (arg4 != 1) {
                this.field3610 = 93;
            }
            class348 var11 = class403.method2536(super.field722, super.field1838, super.field721, super.field1850, arg5, arg3, arg6, super.field724, true, var10, super.field1836);
            if (var11 != null) {
                arg5.method571(false);
                var11.method26(arg0, (class170) null, 0);
                arg5.method571(true);
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZI)Ljava/lang/String;")
    public final String method1566(boolean arg0, int arg1) {
        ++field3597;
        String var3 = "";
        if (class252.field4108 != null) {
            var3 = var3 + class252.field4108[this.field3602];
        }
        if (arg1 != -13847) {
            return null;
        } else {
            if (class114.field1574 != null && class114.field1574[this.field3602] != -1) {
                class378 var4 = class145.method1049(arg1 + 13954, class114.field1574[this.field3602]);
                if (var4.field5708 == 's') {
                    var3 = var3 + var4.method2403((byte) 71, this.field3607 & 255);
                } else {
                    class272.method1845(new Throwable(), 121, "gdn1");
                    class114.field1574[this.field3602] = -1;
                }
            }
            String var5;
            if (arg0) {
                var5 = var3 + this.field3601;
            } else {
                var5 = var3 + this.field3588;
            }
            if (class409.field6047 != null) {
                var5 = var5 + class409.field6047[this.field3602];
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(Z)Z")
    public final boolean method1567(boolean arg0) {
        ++field3595;
        if (arg0) {
            return true;
        } else {
            return this.field3599 != null;
        }
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(B)I")
    public final int method309(byte arg0) {
        if (arg0 != -125) {
            this.field3611 = 107;
        }
        ++field3612;
        return this.field3618;
    }

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "(II)V")
    public static final void method1568(int arg0, int arg1) {
        if (arg1 >= -13) {
            field3624 = null;
        }
        ++field3613;
        class368.field5580.method337(arg0, (byte) -113);
    }

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "(I)I")
    public final int method314(int arg0) {
        if (arg0 != 27647) {
            this.method309((byte) -39);
        }
        ++field3587;
        return super.field1896;
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(I)Z")
    public final boolean method186(int arg0) {
        if (arg0 != 0) {
            this.method184(-28, (class312) null, 58, 73, false, (class120) null, 123);
        }
        ++field3591;
        return false;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IZIII)V")
    public final void method1569(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        ++field3592;
        super.method902(arg4, arg0, arg1, false, this.method903(arg2 + -14241), arg3);
        if (arg2 != 14160) {
            this.method184(1, (class312) null, 21, -25, true, (class120) null, 3);
        }
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(ZI)Ljava/lang/String;")
    public final String method1570(boolean arg0, int arg1) {
        ++field3590;
        if (arg1 != 255) {
            this.field3618 = -92;
        }
        return !arg0 ? this.field3588 : this.field3601;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(Le;B)V")
    public final void method196(class312 arg0, byte arg1) {
        ++field3609;
        if (this.field3599 != null) {
            if (super.field1914 || this.method1563(0, false, arg0)) {
                this.method905((byte) -94, super.field1918, super.field1914, arg0);
                if (arg1 >= -66) {
                    this.field3599 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Le;Z)Lum;")
    public final class306 method189(class312 arg0, boolean arg1) {
        ++field3589;
        if (!arg1) {
            this.field3602 = -117;
        }
        if (this.field3599 != null && this.method1563(1024, false, arg0)) {
            class435 var3 = arg0.method713();
            int var4 = super.field1870.method1032(-117);
            var3.method1991(var4);
            var3.method1995(super.field724, super.field721, super.field722);
            float var5 = arg0.method583();
            float var6 = arg0.method629();
            if (class183.field2984) {
                class349 var7 = this.method912(-5);
                if (var7.field5399 && (this.field3599.field3330 == -1 || class395.method2493(!arg1, this.field3599.field3330).field3750)) {
                    class417 var8 = ~super.field1878 != 0 && ~super.field1880 == -1 ? class156.method1099(super.field1878, 58) : null;
                    class417 var9 = ~super.field1851 == 0 || this.field3615 || super.field1831 && var8 != null ? null : class156.method1099(super.field1851, 119);
                    class348 var10 = class144.method1047(super.field1918[0], 1, arg0, super.field1838, super.field1850, super.field1836, 240, var9 == null ? var8 : var9, 160, super.field1869, 0, 0, var9 != null ? super.field1875 : super.field1845, var4, (byte) 1);
                    if (var10 != null) {
                        arg0.method619(var5, var6 - 128.0F);
                        arg0.method571(false);
                        var10.method26(var3, (class170) null, 0);
                        arg0.method571(true);
                    }
                }
            }
            if (class261.field4201 == this) {
                arg0.method619(var5, var6 + -144.0F);
                var3.method1984(super.field724, super.field721, super.field722);
                for (int var11 = class256.field4144.length + -1; var11 >= 0; --var11) {
                    class136 var12 = class256.field4144[var11];
                    if (var12 != null && ~var12.field2129 != 0) {
                        if (var12.field2124 == 1 && ~var12.field2121 <= -1 && ~class39.field499.length < ~var12.field2121) {
                            class50 var13 = class39.field499[var12.field2121];
                            if (var13 != null) {
                                int var14 = var13.field724 / 32 + -(class261.field4201.field724 / 32);
                                int var15 = var13.field722 / 32 + -(class261.field4201.field722 / 32);
                                this.method1565(var3, var14, 360000, var12.field2129, 1, arg0, super.field1918[0], var15);
                            }
                        }
                        if (var12.field2124 == 2) {
                            int var16 = (-class409.field6048 + var12.field2126) * 4 - (-2 - -(class261.field4201.field724 / 32));
                            int var17 = (-class444.field6481 + var12.field2131) * 4 + 2 + -(class261.field4201.field722 / 32);
                            int var18 = var12.field2125 * 4;
                            int var19 = var18 * var18;
                            this.method1565(var3, var16, var19, var12.field2129, 1, arg0, super.field1918[0], var17);
                        }
                        if (~var12.field2124 == -11 && ~var12.field2121 <= -1 && ~var12.field2121 > ~class216.field3517.length) {
                            class219 var20 = class216.field3517[var12.field2121];
                            if (var20 != null) {
                                int var21 = var20.field724 / 32 + -(class261.field4201.field724 / 32);
                                int var22 = var20.field722 / 32 + -(class261.field4201.field722 / 32);
                                this.method1565(var3, var21, 360000, var12.field2129, 1, arg0, super.field1918[0], var22);
                            }
                        }
                    }
                }
                var3.method1991(var4);
                var3.method1995(super.field724, super.field721, super.field722);
            }
            arg0.method619(var5, var6);
            class306 var23 = class203.method1443(-74, super.field1918.length);
            if (super.field1907 == null) {
                arg0.method668(super.field1918, var3, var23.field4856, class261.field4201 == this ? 1 : 0);
            } else {
                class198 var24 = super.field1907.method489();
                arg0.method687(super.field1918, var24, var3, var23.field4856, class261.field4201 != this ? 0 : 1);
            }
            this.method905((byte) -94, super.field1918, false, arg0);
            if (super.field1918[2] != null) {
                if (var4 != 0) {
                    super.field1918[2].method41(var4);
                }
                super.field1918[2].method51(-super.field1902 + super.field724, -super.field1901 + super.field721, -super.field1910 + super.field722);
            }
            return var23;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "(I)I")
    public final int method322(int arg0) {
        if (arg0 != -26228) {
            this.field3599 = null;
        }
        ++field3619;
        return -1;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILe;IIZLhm;I)V")
    public final void method184(int arg0, class312 arg1, int arg2, int arg3, boolean arg4, class120 arg5, int arg6) {
        if (arg3 != 0) {
            this.method314(96);
        }
        ++field3606;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIILe;)Z")
    public final boolean method188(int arg0, int arg1, int arg2, class312 arg3) {
        ++field3596;
        if (this.field3599 != null && this.method1563(65536, false, arg3)) {
            if (arg1 != 65536) {
                this.method1569(49, false, 92, 101, 80);
            }
            class435 var5 = arg3.method713();
            int var6 = super.field1870.method1032(arg1 + -65629);
            var5.method1991(var6);
            var5.method1995(super.field724, super.field721, super.field722);
            for (int var7 = 0; super.field1918.length > var7; ++var7) {
                if (super.field1918[var7] != null && super.field1918[var7].method39(arg0, arg2, var5, true)) {
                    return true;
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)I")
    public final int method903(int arg0) {
        if (arg0 >= -32) {
            this.field3615 = true;
        }
        ++field3600;
        return this.field3599 != null && ~this.field3599.field3330 != 0 ? class395.method2493(false, this.field3599.field3330).field3779 : super.method903(-50);
    }

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "(I)V")
    public final void method193(int arg0) {
        ++field3614;
        if (arg0 == 0) {
            throw new IllegalStateException();
        }
    }
}
