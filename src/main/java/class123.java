import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class123 extends class16 {

    @OriginalMember(owner = "client!cf", name = "Pb", descriptor = "I")
    public int field2060 = 0;

    @OriginalMember(owner = "client!cf", name = "Xb", descriptor = "I")
    public int field2068 = 0;

    @OriginalMember(owner = "client!cf", name = "Ub", descriptor = "I")
    private int field2065 = 0;

    @OriginalMember(owner = "client!cf", name = "Yb", descriptor = "I")
    public int field2069 = -1;

    @OriginalMember(owner = "client!cf", name = "Wb", descriptor = "S")
    private short field2067 = 0;

    @OriginalMember(owner = "client!cf", name = "ac", descriptor = "I")
    public int field2071 = -1;

    @OriginalMember(owner = "client!cf", name = "fc", descriptor = "Z")
    public boolean field2076 = false;

    @OriginalMember(owner = "client!cf", name = "nc", descriptor = "I")
    public int field2084 = -1;

    @OriginalMember(owner = "client!cf", name = "dc", descriptor = "I")
    public int field2074 = 0;

    @OriginalMember(owner = "client!cf", name = "pc", descriptor = "I")
    public int field2086 = -1;

    @OriginalMember(owner = "client!cf", name = "qc", descriptor = "I")
    public int field2087 = 0;

    @OriginalMember(owner = "client!cf", name = "Vb", descriptor = "I")
    public int field2066 = -1;

    @OriginalMember(owner = "client!cf", name = "Ac", descriptor = "S")
    private short field2097 = 0;

    @OriginalMember(owner = "client!cf", name = "kc", descriptor = "I")
    public int field2081 = 0;

    @OriginalMember(owner = "client!cf", name = "rc", descriptor = "I")
    public int field2088 = 0;

    @OriginalMember(owner = "client!cf", name = "wc", descriptor = "I")
    public int field2093 = -1;

    @OriginalMember(owner = "client!cf", name = "xc", descriptor = "I")
    public int field2094 = 0;

    @OriginalMember(owner = "client!cf", name = "ec", descriptor = "Lmh;")
    public static class128 field2075 = class22.method156(126, "loginscreen");

    @OriginalMember(owner = "client!cf", name = "cc", descriptor = "Lvf;")
    public static class296 field2073 = new class296();

    @OriginalMember(owner = "client!cf", name = "tc", descriptor = "[F")
    public static float[] field2090 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

    @OriginalMember(owner = "client!cf", name = "yc", descriptor = "Lvf;")
    public static class296 field2095 = new class296();

    @OriginalMember(owner = "client!cf", name = "Mb", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!cf", name = "Nb", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!cf", name = "Ob", descriptor = "I")
    public int field2059;

    @OriginalMember(owner = "client!cf", name = "Qb", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!cf", name = "Rb", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!cf", name = "Sb", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!cf", name = "Tb", descriptor = "I")
    public int field2064;

    @OriginalMember(owner = "client!cf", name = "Zb", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!cf", name = "bc", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!cf", name = "gc", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!cf", name = "jc", descriptor = "I")
    public int field2080;

    @OriginalMember(owner = "client!cf", name = "lc", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!cf", name = "mc", descriptor = "I")
    public int field2083;

    @OriginalMember(owner = "client!cf", name = "oc", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!cf", name = "sc", descriptor = "I")
    public int field2089;

    @OriginalMember(owner = "client!cf", name = "uc", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!cf", name = "vc", descriptor = "I")
    public int field2092;

    @OriginalMember(owner = "client!cf", name = "zc", descriptor = "I")
    public int field2096;

    @OriginalMember(owner = "client!cf", name = "ic", descriptor = "Lmh;")
    public class128 field2079;

    @OriginalMember(owner = "client!cf", name = "Lb", descriptor = "Lja;")
    public class60 field2056;

    @OriginalMember(owner = "client!cf", name = "hc", descriptor = "Lgk;")
    public class6 field2078;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIILja;IIIIII)V", line = 4)
    private final void method749(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class60 arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field2072++;
        int var14 = arg0 * arg0 + arg4 * arg4;
        if (arg9 != 5 || var14 < 16 || var14 > 360000) {
            return;
        }
        int var15 = (int) (Math.atan2((double) arg4, (double) arg0) * 325.949D) & 0x7FF;
        class60 var16 = class114.method690(this.field415, var15, -50, arg1, this.field478, arg6, this.field418);
        if (var16 == null) {
            return;
        }
        if (!class247.field4247) {
            var16.method201(0, arg10, arg5, arg12, arg8, arg2, arg11, arg7, -1L);
            return;
        }
        float var17 = class247.method1697();
        float var18 = class247.method1714();
        class247.method1688();
        class247.method1716(var17, var18 - 150.0F);
        var16.method201(0, arg10, arg5, arg12, arg8, arg2, arg11, arg7, -1L);
        class247.method1692();
        class247.method1716(var17, var18);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZII)V", line = 45)
    public final void method750(int arg0, boolean arg1, int arg2, int arg3) {
        super.method127(this.method118(-1), 0, arg0, arg1, arg3);
        if (arg2 == -65536) {
            field2057++;
        }
    }

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "(I)V", line = 57)
    public static void method751(int arg0) {
        field2090 = null;
        field2075 = null;
        field2095 = null;
        int var1 = 80 / ((66 - arg0) / 60);
        field2073 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILem;IILfb;II)V", line = 90)
    public static final void method752(int arg0, class10 arg1, int arg2, int arg3, class55 arg4, int arg5, int arg6) {
        field2091++;
        if (arg4 == null) {
            return;
        }
        int var7 = class216.field3803 + class118.field1997 & 0x7FF;
        int var8 = Math.max(arg1.field260 / 2, arg1.field226 / arg3) + 10;
        int var9 = arg2 * arg2 + arg6 * arg6;
        if ((var8 * var8) < var9) {
            return;
        }
        int var10 = class141.field2424[var7];
        int var11 = class141.field2411[var7];
        int var12 = var10 * 256 / (class145.field2480 + 256);
        int var13 = var11 * 256 / (class145.field2480 + 256);
        int var14 = arg6 * var13 - arg2 * var12 >> 16;
        int var15 = arg6 * var12 + (arg2 * var13) >> 16;
        if (class247.field4247) {
            ((class40) arg4).method281(arg1.field260 / 2 + arg0 + var15 - (arg4.field1065 / 2), arg5 - (-(arg1.field226 / 2) - -var14) + -(arg4.field1062 / 2), (class40) arg1.method82((byte) 78, false));
        } else {
            ((class231) arg4).method1584(var15 + arg0 + (arg1.field260 / 2) - (arg4.field1065 / 2), arg1.field226 / 2 + -var14 + arg5 + -(arg4.field1062 / 2), arg1.field268, arg1.field289);
        }
    }

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "(I)Lmh;", line = 124)
    public final class128 method753(int arg0) {
        field2085++;
        class128 var2 = this.field2079;
        if (class36.field742 != null) {
            var2 = class28.method177((byte) -71, new class128[] { class36.field742[this.field2065], var2 });
        }
        if (arg0 > -43) {
            this.method118(84);
        }
        if (class210.field3722 != null) {
            var2 = class28.method177((byte) -104, new class128[] { var2, class210.field3722[this.field2065] });
        }
        return var2;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lbg;B)V", line = 153)
    public final void method754(class194 arg0, byte arg1) {
        field2082++;
        arg0.field3380 = 0;
        int var3 = arg0.method1325(7627);
        int var4 = var3 & 0x1;
        if ((var3 & 0x2) == 2) {
            this.field2067 = (short) (arg0.method1325(7627) << 2);
            this.field2097 = (short) (arg0.method1325(7627) << 2);
        } else {
            this.field2067 = 0;
            this.field2097 = 0;
        }
        boolean var5 = (var3 & 0x4) != 0;
        int[] var6 = new int[12];
        int var7 = -1;
        int var8 = super.method118(-1);
        this.method126(-120, (var3 >> 3 & 0x7) + 1);
        this.field2065 = (var3 & 0xD4) >> 6;
        this.field478 += (this.method118(-1) - var8) * 64;
        this.field418 += (this.method118(-1) - var8) * 64;
        this.field2086 = arg0.method1326((byte) 125);
        this.field2069 = arg0.method1326((byte) 105);
        this.field2087 = 0;
        for (int var9 = 0; var9 < 12; var9++) {
            int var10 = arg0.method1325(7627);
            if (var10 == 0) {
                var6[var9] = 0;
            } else {
                int var11 = arg0.method1325(7627);
                int var12 = (var10 << 8) + var11;
                if (var9 == 0 && var12 == 65535) {
                    var7 = arg0.method1308(-108);
                    break;
                }
                if (var12 >= 32768) {
                    int var13 = class315.field5345[var12 - 32768];
                    var6[var9] = class279.method1951(1073741824, var13);
                    int var14 = class180.method1226(false, var13).field3488;
                    if (var14 != 0) {
                        this.field2087 = var14;
                    }
                } else {
                    var6[var9] = class279.method1951(Integer.MIN_VALUE, var12 - 256);
                }
            }
        }
        int[] var15 = new int[5];
        for (int var16 = 0; var16 < 5; var16++) {
            int var17 = arg0.method1325(7627);
            if (var17 < 0 || var17 >= class151.field2603[var16].length) {
                var17 = 0;
            }
            var15[var16] = var17;
        }
        this.field482 = arg0.method1308(-104);
        if (this.field482 == 65535) {
            this.field482 = -1;
        }
        this.field481 = arg0.method1308(-98);
        if (this.field481 == 65535) {
            this.field481 = -1;
        }
        this.field439 = this.field481;
        this.field425 = arg0.method1308(-25);
        if (this.field425 == 65535) {
            this.field425 = -1;
        }
        this.field467 = arg0.method1308(-22);
        if (this.field467 == 65535) {
            this.field467 = -1;
        }
        this.field455 = arg0.method1308(-114);
        if (this.field455 == 65535) {
            this.field455 = -1;
        }
        this.field443 = arg0.method1308(-114);
        if (this.field443 == 65535) {
            this.field443 = -1;
        }
        this.field449 = arg0.method1308(-50);
        if (this.field449 == 65535) {
            this.field449 = -1;
        }
        long var18 = arg0.method1321(20169);
        this.field2079 = class260.method1827(true, var18).method850(55);
        this.field2081 = arg0.method1325(7627);
        if (var5) {
            this.field2060 = arg0.method1308(-21);
            this.field2074 = this.field2081;
            this.field2093 = -1;
        } else {
            this.field2060 = 0;
            this.field2074 = arg0.method1325(7627);
            this.field2093 = arg0.method1325(7627);
            if (this.field2093 == 255) {
                this.field2093 = -1;
            }
        }
        int var20 = this.field2068;
        this.field2068 = arg0.method1325(7627);
        if (this.field2068 == 0) {
            class249.method1730(this, -111);
        } else {
            int var21 = this.field2066;
            int var22 = this.field2071;
            int var23 = this.field2084;
            this.field2066 = arg0.method1308(-53);
            this.field2071 = arg0.method1308(-63);
            this.field2084 = arg0.method1308(-26);
            if (this.field2068 != var20 || this.field2066 != var21 || this.field2071 != var22 || this.field2084 != var23) {
                class146.method981(this, 86);
            }
        }
        if (this.field2078 == null) {
            this.field2078 = new class6();
        }
        int var24 = 80 / ((arg1 - 17) / 63);
        int var25 = this.field2078.field124;
        this.field2078.method39(var15, var7, 26943, var6, var4 == 1);
        if (var7 != var25) {
            this.field478 = this.field450[0] * 128 + (this.method118(-1) * 64);
            this.field418 = this.field422[0] * 128 + (this.method118(-1) * 64);
        }
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(III)Lvk;", line = 342)
    public static final class161 method755(int arg0, int arg1, int arg2) {
        class150 var3 = class182.field3184[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2565;
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)I", line = 354)
    public final int method118(int arg0) {
        if (arg0 == -1) {
            field2063++;
            return this.field2078 == null || this.field2078.field124 == -1 ? super.method118(-1) : class203.method1411(false, this.field2078.field124).field3706;
        } else {
            return 125;
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "()I", line = 370)
    public final int method204() {
        field2077++;
        return this.field424;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)V", line = 385)
    public static final void method756(int arg0, byte arg1) {
        class246.field4195.method1833(arg0, (byte) 109);
        if (arg1 != 31) {
            method751(-123);
        }
        field2062++;
        class264.field4573.method1833(arg0, (byte) 99);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIZII)Lfb;", line = 398)
    public static final class55 method757(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field2061++;
        int var7 = (arg2 << 17) + (arg3 ? 65536 : 0) + (arg5 - -(arg1 << 19));
        long var8 = (long) arg0 * 3147483667L + ((long) var7 * 3849834839L);
        class55 var10 = (class55) class169.field2936.method1836(var8, 0);
        if (var10 != null) {
            return var10;
        }
        class141.field2408 = false;
        if (arg4 != 21254) {
            method752(-42, (class10) null, 35, -75, (class55) null, 50, -53);
        }
        class55 var11 = class188.method1265(false, (byte) -119, arg1, arg0, arg2, arg3, arg5, false);
        if (var11 != null && !class141.field2408) {
            class169.field2936.method1835((byte) -81, var8, var11);
        }
        return var11;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIIIIJ)V", line = 430)
    public final void method201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field2070++;
        if (this.field2078 == null) {
            return;
        }
        class1 var11 = this.field451 != -1 && this.field463 == 0 ? class167.method1091(-31, this.field451) : null;
        class1 var12 = this.field474 == -1 || this.field2076 || this.field482 == this.field474 && var11 != null ? null : class167.method1091(126, this.field474);
        class60 var13 = this.field2078.method38(this.field461, var11, this.field444, -72, var12);
        if (var13 == null) {
            return;
        }
        this.field424 = var13.method204();
        if (class114.field1916 && (this.field2078.field124 == -1 || class203.method1411(false, this.field2078.field124).field3657)) {
            class60 var14 = class103.method637(var13, this.field418, this.field445, arg0, 0, 0, 240, this.field415, (byte) -113, var12 == null ? var11 : var12, 160, var12 == null ? this.field461 : this.field444, 1, this.field478);
            if (class247.field4247) {
                float var15 = class247.method1697();
                float var16 = class247.method1714();
                class247.method1688();
                class247.method1716(var15, var16 - 150.0F);
                var14.method201(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
                class247.method1692();
                class247.method1716(var15, var16);
            } else {
                var14.method201(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
            }
        }
        if (class163.field2796 == this) {
            for (int var17 = class260.field4489.length - 1; var17 >= 0; var17--) {
                class199 var18 = class260.field4489[var17];
                if (var18 != null && var18.field3472 != -1) {
                    if (var18.field3475 == 1 && var18.field3466 >= 0 && var18.field3466 < class201.field3560.length) {
                        class115 var19 = class201.field3560[var18.field3466];
                        if (var19 != null) {
                            int var20 = var19.field478 / 32 - class163.field2796.field478 / 32;
                            int var21 = var19.field418 / 32 - class163.field2796.field418 / 32;
                            this.method749(var21, var18.field3472, arg5, arg0, var20, arg2, var13, arg7, arg4, 5, arg1, arg6, arg3);
                        }
                    }
                    if (var18.field3475 == 2) {
                        int var22 = (var18.field3471 - class4.field72) * 4 + 2 - (class163.field2796.field418 / 32);
                        int var23 = (var18.field3478 - class221.field3889) * 4 + 2 - (class163.field2796.field478 / 32);
                        this.method749(var22, var18.field3472, arg5, arg0, var23, arg2, var13, arg7, arg4, 5, arg1, arg6, arg3);
                    }
                    if (var18.field3475 == 10 && var18.field3466 >= 0 && class140.field2405.length > var18.field3466) {
                        class123 var24 = class140.field2405[var18.field3466];
                        if (var24 != null) {
                            int var25 = var24.field478 / 32 - class163.field2796.field478 / 32;
                            int var26 = var24.field418 / 32 - (class163.field2796.field418 / 32);
                            this.method749(var26, var18.field3472, arg5, arg0, var25, arg2, var13, arg7, arg4, 5, arg1, arg6, arg3);
                        }
                    }
                }
            }
        }
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        if (this.field2067 != 0 && this.field2097 != 0) {
            int var30 = class141.field2411[arg0];
            short var31 = this.field2067;
            short var32 = this.field2097;
            int var33 = class141.field2424[arg0];
            int var34 = -var31 / 2;
            int var35 = -var32 / 2;
            int var36 = var30 * var34 + var33 * var35 >> 16;
            int var37 = var31 / 2;
            int var38 = var30 * var35 - (var33 * var34) >> 16;
            int var39 = -var32 / 2;
            int var40 = var30 * var39 - (var33 * var37) >> 16;
            int var41 = var33 * var39 + (var30 * var37) >> 16;
            int var42 = var32 / 2;
            int var43 = -var31 / 2;
            int var44 = var30 * var43 + var33 * var42 >> 16;
            int var45 = var30 * var42 - (var33 * var43) >> 16;
            int var46 = var31 / 2;
            int var47 = class64.method427(this.field478 + var36, this.field418 + var38, class133.field2315, (byte) 118);
            int var48 = class64.method427(this.field478 + var41, this.field418 - -var40, class133.field2315, (byte) 99);
            int var49 = var32 / 2;
            int var50 = var30 * var46 + var33 * var49 >> 16;
            int var51 = var30 * var49 - (var33 * var46) >> 16;
            int var52 = class64.method427(this.field478 + var44, this.field418 + var45, class133.field2315, (byte) 94);
            int var53 = var47 >= var48 ? var48 : var47;
            int var54 = var52 > var47 ? var47 : var52;
            int var55 = class64.method427(this.field478 + var50, this.field418 + var51, class133.field2315, (byte) 110);
            int var56 = var47 + var55;
            if (var48 + var52 < var56) {
                var56 = var48 + var52;
            }
            int var57 = var55 > var52 ? var52 : var55;
            int var58 = var48 >= var55 ? var55 : var48;
            var27 = (int) (Math.atan2((double) (var53 - var57), (double) var32) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                var13.method208(var27);
            }
            var28 = (int) (Math.atan2((double) (var54 - var58), (double) var31) * 325.95D) & 0x7FF;
            if (var28 != 0) {
                var13.method181(var28);
            }
            var29 = (var56 >> 1) - this.field415;
            if (var29 != 0) {
                var13.method186(0, var29, 0);
            }
        }
        class60 var59 = null;
        if (!this.field2076 && this.field416 != -1 && this.field475 != -1) {
            class133 var60 = class169.method1134(2, this.field416);
            var59 = var60.method887(this.field475, (byte) 118);
            if (var59 != null) {
                var59.method186(0, -this.field466, 0);
                if (var60.field2323) {
                    if (var27 != 0) {
                        var59.method208(var27);
                    }
                    if (var28 != 0) {
                        var59.method181(var28);
                    }
                    if (var29 != 0) {
                        var59.method186(0, var29, 0);
                    }
                }
            }
        }
        class60 var61 = null;
        if (!this.field2076 && this.field2056 != null) {
            if (class293.field5011 >= this.field2094) {
                this.field2056 = null;
            }
            if (this.field2088 <= class293.field5011 && this.field2094 > class293.field5011) {
                var61 = this.field2056;
                var61.method186(this.field2092 - this.field478, -this.field415 + this.field2064, this.field2083 - this.field418);
                if (this.field476 == 512) {
                    var61.method192();
                } else if (this.field476 == 1024) {
                    var61.method189();
                } else if (this.field476 == 1536) {
                    var61.method197();
                }
            }
        }
        if (class247.field4247) {
            var13.field1123 = true;
            var13.method201(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            if (var59 != null) {
                var59.field1123 = true;
                var59.method201(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            }
        } else {
            if (var59 != null) {
                var13 = ((class29) var13).method183(var59);
            }
            if (var61 != null) {
                var13 = ((class29) var13).method183(var61);
            }
            var13.field1123 = true;
            var13.method201(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
        if (var61 == null) {
            return;
        }
        if (this.field476 == 512) {
            var61.method197();
        } else if (this.field476 == 1024) {
            var61.method189();
        } else if (this.field476 == 1536) {
            var61.method192();
        }
        var61.method186(this.field478 - this.field2092, this.field415 - this.field2064, this.field418 - this.field2083);
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(Z)Z", line = 729)
    public final boolean method122(boolean arg0) {
        if (arg0) {
            field2075 = (class128) null;
        }
        field2058++;
        return this.field2078 != null;
    }
}
