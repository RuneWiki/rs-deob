import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class167 extends class67 {

    @OriginalMember(owner = "client!sd", name = "L", descriptor = "I")
    public static int field3308 = 0;

    @OriginalMember(owner = "client!sd", name = "Q", descriptor = "Led;")
    private static class43 field3313 = class191.method1219("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3", false);

    @OriginalMember(owner = "client!sd", name = "T", descriptor = "I")
    public static int field3316 = 0;

    @OriginalMember(owner = "client!sd", name = "H", descriptor = "[I")
    public static int[] field3305 = new int[128];

    @OriginalMember(owner = "client!sd", name = "P", descriptor = "Led;")
    public static class43 field3312 = class191.method1219(":duelstake:", false);

    @OriginalMember(owner = "client!sd", name = "V", descriptor = "I")
    public static int field3318 = 0;

    @OriginalMember(owner = "client!sd", name = "E", descriptor = "Led;")
    public static class43 field3302 = class191.method1219("Texturen geladen)3", false);

    @OriginalMember(owner = "client!sd", name = "Z", descriptor = "Led;")
    public static class43 field3322 = class191.method1219(" ", false);

    @OriginalMember(owner = "client!sd", name = "D", descriptor = "Led;")
    public static class43 field3301 = field3313;

    @OriginalMember(owner = "client!sd", name = "jb", descriptor = "Led;")
    public static class43 field3332 = class191.method1219("Schlie-8en", false);

    @OriginalMember(owner = "client!sd", name = "ib", descriptor = "Led;")
    public static class43 field3331 = class191.method1219("::gc", false);

    @OriginalMember(owner = "client!sd", name = "X", descriptor = "Lma;")
    public static class110 field3320 = new class110();

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "I")
    public int field3294;

    @OriginalMember(owner = "client!sd", name = "z", descriptor = "I")
    public int field3297;

    @OriginalMember(owner = "client!sd", name = "A", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!sd", name = "B", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!sd", name = "C", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!sd", name = "G", descriptor = "I")
    public int field3304;

    @OriginalMember(owner = "client!sd", name = "I", descriptor = "I")
    public int field3306;

    @OriginalMember(owner = "client!sd", name = "K", descriptor = "I")
    public int field3307;

    @OriginalMember(owner = "client!sd", name = "M", descriptor = "I")
    public int field3309;

    @OriginalMember(owner = "client!sd", name = "N", descriptor = "I")
    public int field3310;

    @OriginalMember(owner = "client!sd", name = "O", descriptor = "I")
    public int field3311;

    @OriginalMember(owner = "client!sd", name = "R", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!sd", name = "S", descriptor = "I")
    public int field3315;

    @OriginalMember(owner = "client!sd", name = "U", descriptor = "I")
    public int field3317;

    @OriginalMember(owner = "client!sd", name = "Y", descriptor = "I")
    public int field3321;

    @OriginalMember(owner = "client!sd", name = "cb", descriptor = "I")
    public int field3325;

    @OriginalMember(owner = "client!sd", name = "db", descriptor = "I")
    public int field3326;

    @OriginalMember(owner = "client!sd", name = "eb", descriptor = "I")
    public int field3327;

    @OriginalMember(owner = "client!sd", name = "fb", descriptor = "I")
    public int field3328;

    @OriginalMember(owner = "client!sd", name = "gb", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!sd", name = "hb", descriptor = "I")
    public int field3330;

    @OriginalMember(owner = "client!sd", name = "kb", descriptor = "I")
    public int field3333;

    @OriginalMember(owner = "client!sd", name = "ab", descriptor = "Lob;")
    public static class129 field3323;

    @OriginalMember(owner = "client!sd", name = "W", descriptor = "Lve;")
    public class195 field3319;

    @OriginalMember(owner = "client!sd", name = "F", descriptor = "Lbh;")
    public class19 field3303;

    @OriginalMember(owner = "client!sd", name = "y", descriptor = "Le;")
    public class39 field3296;

    @OriginalMember(owner = "client!sd", name = "bb", descriptor = "Lgf;")
    public class62 field3324;

    @OriginalMember(owner = "client!sd", name = "x", descriptor = "Lhh;")
    public static class73 field3295;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)I")
    public static final int method1032(int arg0, int arg1, int arg2) {
        int var3 = 17 / ((arg2 - 47) / 48);
        field3300++;
        class174 var4 = (class174) class90.field1792.method75((long) arg0, -79);
        if (var4 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = 0; var6 < var4.field3468.length; var6++) {
                if (var4.field3462[var6] == arg1) {
                    var5 += var4.field3468[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IB)V")
    public static final void method1033(int arg0, byte arg1) {
        field3292++;
        if (arg0 == -3) {
            class84.method514(41, class36.field683, class117.field2290, class108.field2094);
        } else if (arg0 == -2) {
            class84.method514(55, class36.field668, class36.field697, class16.field241);
        } else if (arg0 == -1) {
            class84.method514(45, class36.field652, class51.field1021, class108.field2088);
        } else if (arg0 == 3) {
            class84.method514(-101, class36.field656, class36.field667, class110.field2125);
        } else if (arg0 == 4) {
            class84.method514(-95, class36.field700, class49.field982, class60.field1236);
        } else if (arg0 == 5) {
            class84.method514(-119, class36.field674, class33.field612, class34.field626);
        } else if (arg0 == 6) {
            class84.method514(45, class36.field648, class88.field1722, class76.field1518);
        } else if (arg0 == 7) {
            class84.method514(-76, class36.field688, class46.field928, class194.field3803);
        } else if (arg0 == 8) {
            class84.method514(24, class36.field695, class194.field3799, class44.field881);
        } else if (arg0 == 9) {
            class84.method514(-82, class36.field659, class44.field873, class60.field1239);
        } else if (arg0 == 10) {
            class84.method514(124, class36.field679, class194.field3800, class143.field2950);
        } else if (arg0 == 11) {
            class84.method514(-89, class36.field687, class159.field3223, class71.field1406);
        } else if (arg0 == 12) {
            class84.method514(-108, class36.field653, class48.field962, class170.field3389);
        } else if (arg0 == 13) {
            class84.method514(-127, class36.field689, class49.field1000, class108.field2070);
        } else if (arg0 == 14) {
            class84.method514(-107, class36.field660, class13.field188, class189.field3707);
        } else if (arg0 == 16) {
            class84.method514(70, class36.field666, class29.field539, class64.field1316);
        } else if (arg0 == 17) {
            class84.method514(-118, class36.field678, class125.field2485, class89.field1737);
        } else if (arg0 == 18) {
            class84.method514(-84, class36.field690, class73.field1452, class32.field604);
        } else if (arg0 == 19) {
            class84.method514(19, class194.field3798, class175.field3475, class207.field4047);
        } else if (arg0 == 20) {
            class84.method514(-96, class36.field681, class137.field2848, class108.field2085);
        } else if (arg0 == 22) {
            class84.method514(-87, class36.field672, class68.field1360, class39.field742);
        } else if (arg0 == 23) {
            class84.method514(89, class36.field657, class13.field194, class189.field3708);
        } else if (arg0 == 24) {
            class84.method514(78, class36.field651, class26.field475, class145.field2987);
        } else if (arg0 == 25) {
            class84.method514(-105, class36.field682, class157.field3188, class108.field2091);
        } else if (arg0 == 26) {
            class84.method514(67, class36.field673, class156.field3147, class156.field3158);
        } else if (arg0 == 27) {
            class84.method514(-115, class36.field663, class36.field698, class106.field2027);
        } else {
            class84.method514(100, class36.field655, class32.field594, class108.field2086);
        }
        class35.method197((byte) -100, 10);
        if (arg1 < 56) {
            field3332 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "(I)V")
    public final void method1034(int arg0) {
        this.field3319 = null;
        this.field3324 = null;
        this.field3303 = null;
        this.field3296 = null;
        field3314++;
        if (arg0 >= -64) {
            field3301 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "(I)V")
    public static void method1035(int arg0) {
        field3305 = null;
        field3332 = null;
        field3323 = null;
        field3313 = null;
        field3295 = null;
        if (arg0 >= -34) {
            return;
        }
        field3320 = null;
        field3301 = null;
        field3312 = null;
        field3331 = null;
        field3322 = null;
        field3302 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "([Led;Z)Led;")
    public static final class43 method1036(class43[] arg0, boolean arg1) {
        if (!arg1) {
            field3312 = null;
        }
        field3293++;
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        return class80.method495(arg0, 0, arg0.length, 255);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIII)I")
    public static final int method1037(int arg0, int arg1, int arg2, int arg3) {
        field3298++;
        if (arg0 != 27824) {
            method1037(-13, -123, -21, 89);
        }
        if (arg1 > 243) {
            arg2 >>= 0x4;
        } else if (arg1 > 217) {
            arg2 >>= 0x3;
        } else if (arg1 > 192) {
            arg2 >>= 0x2;
        } else if (arg1 > 179) {
            arg2 >>= 0x1;
        }
        return (arg3 >> 2 << 10) + (arg2 >> 5 << 7) + (arg1 >> 1);
    }
}
