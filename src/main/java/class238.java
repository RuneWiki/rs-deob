import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class238 extends class151 {

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "I")
    public int field4301;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
    public int field4300;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    public static int field4294 = -1;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "[[S")
    public static short[][] field4295 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "Lmb;")
    public static class132 field4298 = class166.method1092("hint_headicons", 113);

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "[S")
    public static short[] field4296 = new short[256];

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "[J")
    public static long[] field4306 = new long[1000];

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIBIIII)V")
    public static final void method1505(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field4304++;
        if (class137.method933(256, arg0) && arg3 > 41) {
            class119.method793(class97.field1866[arg0], arg4, arg2, -1, true, arg6, arg1, arg5, arg7);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIII)V")
    public static final void method1506(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4297++;
        for (int var6 = arg4; var6 <= arg1 + arg4; var6++) {
            for (int var11 = arg2; var11 <= arg2 + arg3; var11++) {
                if (var11 >= 0 && var11 < 104 && var6 >= 0 && var6 < 104) {
                    class226.field4101[arg0][var11][var6] = 127;
                }
            }
        }
        if (arg5 > -98) {
            method1511(30, -92);
        }
        for (int var7 = arg4; var7 < arg1 + arg4; var7++) {
            for (int var10 = arg2; var10 < arg2 + arg3; var10++) {
                if (var10 >= 0 && var10 < 104 && var7 >= 0 && var7 < 104) {
                    class190.field3531[arg0][var10][var7] = arg0 > 0 ? class190.field3531[arg0 - 1][var10][var7] : 0;
                }
            }
        }
        if (arg2 > 0 && arg2 < 104) {
            for (int var8 = arg4 + 1; var8 < arg1 + arg4; var8++) {
                if (var8 >= 0 && var8 < 104) {
                    class190.field3531[arg0][arg2][var8] = class190.field3531[arg0][arg2 - 1][var8];
                }
            }
        }
        if (arg4 > 0 && arg4 < 104) {
            for (int var9 = arg2 + 1; var9 < arg2 + arg3; var9++) {
                if (var9 >= 0 && var9 < 104) {
                    class190.field3531[arg0][var9][arg4] = class190.field3531[arg0][var9][arg4 - 1];
                }
            }
        }
        if (arg2 < 0 || arg4 < 0 || arg2 >= 104 || arg4 >= 104) {
            return;
        }
        if (arg0 == 0) {
            if (arg2 > 0 && class190.field3531[arg0][arg2 - 1][arg4] != 0) {
                class190.field3531[arg0][arg2][arg4] = class190.field3531[arg0][arg2 - 1][arg4];
                return;
            }
            if (arg4 > 0 && class190.field3531[arg0][arg2][arg4 - 1] != 0) {
                class190.field3531[arg0][arg2][arg4] = class190.field3531[arg0][arg2][arg4 - 1];
                return;
            }
            if (arg2 > 0 && arg4 > 0 && class190.field3531[arg0][arg2 - 1][arg4 - 1] != 0) {
                class190.field3531[arg0][arg2][arg4] = class190.field3531[arg0][arg2 - 1][arg4 - 1];
                return;
            }
        } else if (arg2 <= 0 || class190.field3531[arg0 - 1][arg2 - 1][arg4] == class190.field3531[arg0][arg2 - 1][arg4]) {
            if (arg4 > 0 && class190.field3531[arg0 - 1][arg2][arg4 - 1] != class190.field3531[arg0][arg2][arg4 - 1]) {
                class190.field3531[arg0][arg2][arg4] = class190.field3531[arg0][arg2][arg4 - 1];
                return;
            }
            if (arg2 > 0 && arg4 > 0 && class190.field3531[arg0 - 1][arg2 - 1][arg4 - 1] != class190.field3531[arg0][arg2 - 1][arg4 - 1]) {
                class190.field3531[arg0][arg2][arg4] = class190.field3531[arg0][arg2 - 1][arg4 - 1];
                return;
            }
            return;
        } else {
            class190.field3531[arg0][arg2][arg4] = class190.field3531[arg0][arg2 - 1][arg4];
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lpb;B)V")
    public static final void method1507(class165 arg0, byte arg1) {
        field4299++;
        class15.field228 = arg0;
        class122.field2294 = class15.field228.method1068(16, 0);
        if (arg1 != -64) {
            field4295 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIILmb;)V")
    public static final void method1508(int arg0, int arg1, int arg2, int arg3, class132 arg4) {
        field4307++;
        class96 var5 = class102.method631((byte) 72, arg0, arg3);
        if (var5 == null) {
            return;
        }
        if (var5.field1790 != null) {
            class123 var6 = new class123();
            var6.field2299 = var5;
            var6.field2311 = arg4;
            var6.field2307 = arg2;
            var6.field2310 = var5.field1790;
            class155.method1010(var6, 200000);
        }
        boolean var7 = true;
        if (var5.field1805 > 0) {
            var7 = class108.method692(arg1 ^ 0xFFFFFDC5, var5);
        }
        if (!var7 || !class39.method274(arg2 - 1, 119, class170.method1113(var5, (byte) -50))) {
            return;
        }
        if (arg2 == 1) {
            class39.field636++;
            class64.field1054.method660(147, arg1 ^ 0x238);
            class64.field1054.method726((byte) -51, arg3);
            class64.field1054.method715(arg1 ^ 0x25F, arg0);
        }
        if (arg2 == 2) {
            client.field546++;
            class64.field1054.method660(66, arg1 ^ 0x238);
            class64.field1054.method726((byte) -63, arg3);
            class64.field1054.method715(64, arg0);
        }
        if (arg2 == 3) {
            class64.field1054.method660(36, 3);
            class64.field1054.method726((byte) 124, arg3);
            class46.field795++;
            class64.field1054.method715(arg1 ^ 0x218, arg0);
        }
        if (arg2 == 4) {
            class235.field4251++;
            class64.field1054.method660(235, arg1 - 568);
            class64.field1054.method726((byte) 89, arg3);
            class64.field1054.method715(105, arg0);
        }
        if (arg2 == 5) {
            class64.field1054.method660(1, arg1 - 568);
            class110.field2095++;
            class64.field1054.method726((byte) 97, arg3);
            class64.field1054.method715(64, arg0);
        }
        if (arg2 == 6) {
            class64.field1054.method660(0, arg1 - 568);
            class64.field1054.method726((byte) 115, arg3);
            class64.field1054.method715(64, arg0);
            class91.field1603++;
        }
        if (arg2 == 7) {
            class64.field1054.method660(159, 3);
            class110.field2064++;
            class64.field1054.method726((byte) 124, arg3);
            class64.field1054.method715(38, arg0);
        }
        if (arg2 == 8) {
            class130.field2399++;
            class64.field1054.method660(61, arg1 - 568);
            class64.field1054.method726((byte) 109, arg3);
            class64.field1054.method715(arg1 - 547, arg0);
        }
        if (arg2 == 9) {
            class64.field1054.method660(133, 3);
            class64.field1054.method726((byte) 105, arg3);
            class64.field1054.method715(23, arg0);
            class140.field2626++;
        }
        if (arg2 == 10) {
            class65.field1070++;
            class64.field1054.method660(185, 3);
            class64.field1054.method726((byte) 117, arg3);
            class64.field1054.method715(119, arg0);
        }
        if (arg1 != 571) {
            method1505(-32, -15, 55, (byte) -55, -80, -6, 72, 78);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BI)Lmb;")
    public static final class132 method1509(byte arg0, int arg1) {
        field4303++;
        if (arg0 >= -101) {
            method1505(72, 81, 99, (byte) 41, -30, 4, -53, -68);
        }
        return class187.method1197(new class132[] { class132.method889(arg1 >> 24 & 0xFF, (byte) 105), class106.field1991, class132.method889(arg1 >> 16 & 0xFF, (byte) 90), class106.field1991, class132.method889(arg1 >> 8 & 0xFF, (byte) 89), class106.field1991, class132.method889(arg1 & 0xFF, (byte) 101) }, -118);
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(II)V")
    public class238(int arg0, int arg1) {
        this.field4301 = arg0;
        this.field4300 = arg1;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V")
    public static void method1510(boolean arg0) {
        field4298 = null;
        if (arg0) {
            field4294 = -105;
        }
        field4306 = null;
        field4296 = null;
        field4295 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)V")
    public static final void method1511(int arg0, int arg1) {
        field4302++;
        if (arg0 != -11474) {
            field4298 = null;
        }
        if (arg1 == 37) {
            class53.field902 = 3.0D;
        } else if (arg1 == 50) {
            class53.field902 = 4.0D;
        } else if (arg1 == 75) {
            class53.field902 = 6.0D;
        } else {
            class53.field902 = 8.0D;
        }
        class210.field3862 = -1;
        class210.field3862 = -1;
    }
}
