import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class126 extends class74 {

    @OriginalMember(owner = "client!hk", name = "R", descriptor = "I")
    private int field1971 = 3072;

    @OriginalMember(owner = "client!hk", name = "X", descriptor = "I")
    private int field1976 = 2048;

    @OriginalMember(owner = "client!hk", name = "W", descriptor = "I")
    private int field1975 = 1024;

    @OriginalMember(owner = "client!hk", name = "bb", descriptor = "Lta;")
    public static class262 field1980 = new class262(30);

    @OriginalMember(owner = "client!hk", name = "db", descriptor = "Ljava/lang/String;")
    public static String field1982 = null;

    @OriginalMember(owner = "client!hk", name = "cb", descriptor = "I")
    public static int field1981 = -1;

    @OriginalMember(owner = "client!hk", name = "fb", descriptor = "Ljava/lang/String;")
    public static String field1984 = "K";

    @OriginalMember(owner = "client!hk", name = "gb", descriptor = "I")
    public static int field1985 = 0;

    @OriginalMember(owner = "client!hk", name = "eb", descriptor = "I")
    public static int field1983 = -1;

    @OriginalMember(owner = "client!hk", name = "ib", descriptor = "Z")
    public static volatile boolean field1987 = true;

    @OriginalMember(owner = "client!hk", name = "hb", descriptor = "[I")
    public static int[] field1986 = new int[2];

    @OriginalMember(owner = "client!hk", name = "M", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!hk", name = "N", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!hk", name = "P", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!hk", name = "Q", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!hk", name = "S", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!hk", name = "U", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!hk", name = "Y", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!hk", name = "Z", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!hk", name = "ab", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!hk", name = "T", descriptor = "Luf;")
    public static class176 field1973;

    @OriginalMember(owner = "client!hk", name = "O", descriptor = "[Ljava/lang/String;")
    public static String[] field1968;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(IB)V")
    public static final void method895(int arg0, byte arg1) {
        if (arg1 == 67) {
            class16.field263.method1778(arg0, -66);
            ++field1967;
        }
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V")
    public class126() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIZIII)V")
    public static final void method896(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        ++field1978;
        ++class17.field278;
        class135.method950(arg1 ^ arg1);
        if (!arg2) {
            class15.method153(0, -155);
            class210.method1406(0, false, true, 1);
            if (class251.field3866 == 0) {
                for (int var6 = 1; ~var6 >= -6; ++var6) {
                    class210.method1406(var6, false, false, 1);
                    class210.method1406(var6, true, false, 1);
                    class15.method153(var6, -155);
                }
            } else {
                for (int var7 = 1; var7 <= 5; ++var7) {
                    class15.method153(var7, -155);
                    class210.method1406(var7, false, false, 1);
                    class210.method1406(var7, true, false, 1);
                }
            }
        } else {
            class210.method1406(0, false, false, 1);
        }
        if (!arg2) {
            class265.method1806((byte) -92);
        }
        class207.method1380(0);
        if (class6.field111 != 1) {
            if (class6.field111 == 5) {
                class215.method1432(arg0, -16543);
            }
        } else {
            int var8 = (int) class161.field2460;
            if (var8 < class85.field1403 / 256) {
                var8 = class85.field1403 / 256;
            }
            int var9 = 2047 & (int) class276.field4334 - -class208.field3238;
            if (class98.field1567[4] && var8 < class160.field2450[4] + 128) {
                var8 = class160.field2450[4] + 128;
            }
            class212.method1422(var9, arg0, var8, (byte) 122, var8 * 3 + 600, class136.field2117, -50 + class224.method1502((byte) -127, class274.field4318, class261.field4058.field4123, class261.field4058.field4176), class262.field4095);
        }
        int var10 = class295.field4631;
        int var11 = class266.field4245;
        int var12 = class69.field1100;
        int var13 = class25.field373;
        int var14 = class142.field2182;
        for (int var15 = 0; ~var15 > -6; ++var15) {
            if (class98.field1567[var15]) {
                int var22 = (int) ((double) (-class165.field2504[var15]) + Math.random() * (double) (class165.field2504[var15] * 2 + 1) + Math.sin((double) class289.field4561[var15] / 100.0D * (double) class247.field3826[var15]) * (double) class160.field2450[var15]);
                if (var15 == 1) {
                    class295.field4631 += var22;
                }
                if (var15 == 3) {
                    class142.field2182 = class142.field2182 + var22 & 2047;
                }
                if (~var15 == -1) {
                    class266.field4245 += var22;
                }
                if (var15 == 4) {
                    class25.field373 += var22;
                    if (~class25.field373 > -129) {
                        class25.field373 = 128;
                    }
                    if (class25.field373 > 383) {
                        class25.field373 = 383;
                    }
                }
                if (~var15 == -3) {
                    class69.field1100 += var22;
                }
            }
        }
        class55.method450(arg1 ^ 3996);
        class201.method1351(arg5, arg4, arg3 + arg5, arg0 + arg4);
        class97.method765();
        if (class69.field1097 < 0) {
            class201.method1333(arg5, arg4, arg3, arg0, 0);
        } else {
            class96 var16 = class127.method905((byte) 39, class188.field3013, class167.field2528, class224.field3523, class69.field1097);
            var16.method745(class177.field2651, arg5, arg4, arg3, arg0, class25.field373, class142.field2182, 0);
        }
        if (!class64.field1025 && class155.field2362 >= arg5 && class155.field2362 < arg3 + arg5 && class287.field4525 >= arg4 && arg0 + arg4 > class287.field4525) {
            class263.field4113 = 0;
            class161.field2461 = true;
            int var17 = class160.field2452;
            int var18 = class285.field4486;
            class277.field4362 = (-arg5 + class155.field2362) * (-var17 + var18) / arg3 + var17;
            int var19 = class254.field3901;
            int var20 = class124.field1960;
            class231.field3602 = (-arg4 + class287.field4525) * (-var19 + var20) / arg0 + var19;
        } else {
            class161.field2461 = false;
            class263.field4113 = 0;
        }
        class130.method916(arg1 ^ -3972);
        byte var21 = class79.method624((byte) 77) == 2 ? (byte) class17.field278 : 1;
        class221.method1480(class266.field4245, class295.field4631, class69.field1100, class25.field373, class142.field2182, class140.field2150, class23.field335, field1986, class163.field2487, class259.field3958, class121.field1862, class274.field4318 - -1, var21, class261.field4058.field4176 >> 7, class261.field4058.field4123 >> 7);
        class130.method916(-113);
        class257.method1709();
        class85.method691(arg4, arg0, 256, arg5, arg3, 256, (byte) -59);
        class108.method815(256, arg5, 0, arg0, arg3, 256, arg4);
        ((class287) class97.field1547).method1927(class127.field1996, -80);
        class243.method1647(arg4, arg3, arg5, (byte) -37, arg0);
        class69.field1100 = var12;
        class266.field4245 = var11;
        class25.field373 = var13;
        class142.field2182 = var14;
        class295.field4631 = var10;
        if (class130.field2019 && class9.field190.method1568((byte) 85) == 0) {
            class130.field2019 = false;
        }
        if (class130.field2019) {
            class201.method1333(arg5, arg4, arg3, arg0, 0);
            class263.method1789((byte) 64, false, class55.field848);
        }
        if (!arg2 && !class130.field2019 && !class64.field1025 && ~arg5 >= ~class155.field2362 && arg5 - -arg3 > class155.field2362 && ~class287.field4525 <= ~arg4 && ~class287.field4525 > ~(arg0 + arg4)) {
            class271.method1829(class155.field2362, 106, arg5, arg0, arg4, class287.field4525, arg3);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)[I")
    public final int[] method448(int arg0, int arg1) {
        if (arg0 != 4) {
            this.method448(-90, 61);
        }
        ++field1972;
        int[] var3 = super.field1254.method1328((byte) -108, arg1);
        if (super.field1254.field3118) {
            int[] var4 = this.method590(0, 0, arg1);
            for (int var5 = 0; ~var5 > ~class178.field2662; ++var5) {
                var3[var5] = (var4[var5] * this.field1976 >> 12) + this.field1975;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(Z)V")
    public final void method493(boolean arg0) {
        ++field1966;
        if (arg0) {
            this.field1976 = -37;
        }
        this.field1976 = -this.field1975 + this.field1971;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(II)V")
    public static final void method897(int arg0, int arg1) {
        ++field1970;
        if (class103.method784(-1, arg1)) {
            class188[] var2 = class261.field4006[arg1];
            for (int var3 = arg0; var3 < var2.length; ++var3) {
                class188 var4 = var2[var3];
                if (var4 != null) {
                    var4.field2868 = 1;
                    var4.field2974 = 0;
                    var4.field2833 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "(Z)V")
    public static void method898(boolean arg0) {
        field1980 = null;
        field1986 = null;
        field1982 = null;
        if (!arg0) {
            field1968 = null;
            field1973 = null;
            field1984 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB)[[I")
    public final int[][] method82(int arg0, byte arg1) {
        ++field1977;
        if (arg1 > -112) {
            method900(-3, -5, 52, 118, 56);
        }
        int[][] var3 = super.field1248.method269(false, arg0);
        if (super.field1248.field550) {
            int[][] var4 = this.method592(arg0, 0, 120);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; ~var11 > ~class178.field2662; ++var11) {
                var8[var11] = this.field1975 - -(var5[var11] * this.field1976 >> 12);
                var10[var11] = (var7[var11] * this.field1976 >> 12) + this.field1975;
                var9[var11] = (var6[var11] * this.field1976 >> 12) + this.field1975;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Luf;BLuf;)V")
    public static final void method899(class176 arg0, byte arg1, class176 arg2) {
        int var3 = 42 / ((-44 - arg1) / 36);
        class99.field1585 = arg2;
        class222.field3470 = arg0;
        ++field1974;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLf;I)V")
    public final void method80(byte arg0, class37 arg1, int arg2) {
        ++field1979;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field1245 = ~arg1.method333((byte) -59) == -2;
                }
            } else {
                this.field1971 = arg1.method293(124);
            }
        } else {
            this.field1975 = arg1.method293(122);
        }
        if (arg0 != -79) {
            method898(true);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIII)I")
    public static final int method900(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = -class97.field1556[arg0 * 1024 / arg3] + 65536 >> 1;
        ++field1969;
        if (arg2 != -6) {
            field1983 = 125;
        }
        return ((-var5 + 65536) * arg4 >> 16) + (arg1 * var5 >> 16);
    }
}
