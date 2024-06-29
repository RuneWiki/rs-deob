import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class78 {

    @OriginalMember(owner = "client!n", name = "d", descriptor = "Lmc;")
    private static class75 field1956 = class30.method234(true, "Enter name of friend to add to list");

    @OriginalMember(owner = "client!n", name = "j", descriptor = "I")
    public static int field1962 = 0;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "Lmc;")
    public static class75 field1953 = field1956;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "[I")
    public static int[] field1955 = new int[1000];

    @OriginalMember(owner = "client!n", name = "m", descriptor = "I")
    public static int field1965 = -1;

    @OriginalMember(owner = "client!n", name = "u", descriptor = "Lmc;")
    private static class75 field1973 = class30.method234(true, "scroll:");

    @OriginalMember(owner = "client!n", name = "x", descriptor = "Lmc;")
    public static class75 field1976 = class30.method234(true, "Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

    @OriginalMember(owner = "client!n", name = "n", descriptor = "I")
    public static int field1966 = 0;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "Lmc;")
    public static class75 field1957 = field1973;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "Lmc;")
    private static class75 field1959 = class30.method234(true, "Starting game engine)3)3)3");

    @OriginalMember(owner = "client!n", name = "l", descriptor = "Lmc;")
    public static class75 field1964 = field1959;

    @OriginalMember(owner = "client!n", name = "v", descriptor = "[I")
    public static int[] field1974 = new int[25];

    @OriginalMember(owner = "client!n", name = "z", descriptor = "Lmc;")
    public static class75 field1978 = class30.method234(true, "null");

    @OriginalMember(owner = "client!n", name = "f", descriptor = "Lmc;")
    public static class75 field1958 = class30.method234(true, "");

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "I")
    public int field1960;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "I")
    public int field1968;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "I")
    public int field1969;

    @OriginalMember(owner = "client!n", name = "r", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "I")
    public int field1971;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "I")
    public int field1972;

    @OriginalMember(owner = "client!n", name = "w", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!n", name = "y", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "Lvb;")
    public static class124 field1967;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "Lkd;")
    public class64 field1961;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)V", line = 9)
    public static void method665(boolean arg0) {
        field1964 = null;
        field1974 = null;
        field1958 = null;
        field1957 = null;
        field1953 = null;
        field1955 = null;
        field1967 = null;
        field1956 = null;
        field1959 = null;
        field1976 = null;
        if (arg0) {
            field1978 = null;
            field1973 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IBI)Z", line = 37)
    public static final boolean method666(int arg0, byte arg1, int arg2) {
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg1 < 114) {
            method667(31L, 12);
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        field1954++;
        class59 var3 = class50.method387(-26274, arg0);
        return var3.method470((byte) 73, arg2);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(JI)Lmc;", line = 94)
    public static final class75 method667(long arg0, int arg1) {
        field1963++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            if (arg1 >= -88) {
                method667(127L, 61);
            }
            int var3 = 0;
            long var4 = arg0;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            byte[] var6 = new byte[var3];
            while (arg0 != 0L) {
                long var8 = arg0;
                arg0 /= 37L;
                var3--;
                var6[var3] = class71.field1817[(int) (var8 - arg0 * 37L)];
            }
            class75 var7 = new class75();
            var7.field1912 = var6;
            var7.field1869 = var6.length;
            return var7;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V", line = 167)
    public static final void method668(byte arg0) {
        if (class110.field2780) {
            class110.field2780 = false;
            class76.method659(247);
            class35.field841 = true;
            class55.field1350 = true;
            class108.field2743 = true;
            class30.field681 = true;
        }
        field1975++;
        class15.method102((byte) 104);
        if (class15.field283 && class90.field2218 == 1) {
            class108.field2743 = true;
        }
        if (class36.field868 != -1) {
            boolean var1 = class58.method468(-34, class36.field868);
            if (var1) {
                class108.field2743 = true;
            }
        }
        int var2 = -121 % ((arg0 - 38) / 35);
        if (class44.field1063 == 2) {
            class108.field2743 = true;
        }
        if (class37.field885 == 2) {
            class108.field2743 = true;
        }
        if (class108.field2743) {
            class108.field2743 = false;
            class56.method458((byte) 82);
        }
        if (class130.field3161 == -1) {
            class111.field2804.field2493 = class47.field1124 - class6.field93 - 77;
            if (class90.field2200 > 448 && class90.field2200 < 560 && class45.field1104 > 332) {
                class45.method348(463, class90.field2200 - 17, class45.field1104 + -357, class47.field1124, 8, class111.field2804, -1, 77, 0);
            }
            int var3 = class47.field1124 - class111.field2804.field2493 - 77;
            if (var3 < 0) {
                var3 = 0;
            }
            if (var3 > class47.field1124 - 77) {
                var3 = class47.field1124 - 77;
            }
            if (class6.field93 != var3) {
                class35.field841 = true;
                class6.field93 = var3;
            }
        }
        if (class130.field3161 == -1 && class128.field3124 == 3) {
            class111.field2804.field2493 = class104.field2642;
            int var4 = class10.field218 * 14 + 7;
            if (class90.field2200 > 448 && class90.field2200 < 560 && class45.field1104 > 332) {
                class45.method348(463, class90.field2200 - 17, class45.field1104 + -357, var4, 8, class111.field2804, -1, 77, 0);
            }
            int var5 = class111.field2804.field2493;
            if (var5 < 0) {
                var5 = 0;
            }
            if (var5 > var4 - 77) {
                var5 = var4 - 77;
            }
            if (class104.field2642 != var5) {
                class35.field841 = true;
                class104.field2642 = var5;
            }
        }
        if (class130.field3161 != -1) {
            boolean var6 = class58.method468(-48, class130.field3161);
            if (var6) {
                class35.field841 = true;
            }
        }
        if (class44.field1063 == 3) {
            class35.field841 = true;
        }
        if (class37.field885 == 3) {
            class35.field841 = true;
        }
        if (class32.field732 != null) {
            class35.field841 = true;
        }
        if (class15.field283 && class90.field2218 == 2) {
            class35.field841 = true;
        }
        if (class35.field841) {
            class35.field841 = false;
            class96.method809(8388608);
        }
        class34.method265(-1);
        if (class43.field1032 != -1) {
            class30.field681 = true;
        }
        if (class30.field681) {
            if (class43.field1032 != -1 && class43.field1032 == class130.field3167) {
                class47.field1129++;
                class43.field1032 = -1;
                class118.field2923.method707(-128, 30);
                class118.field2923.method493((byte) 88, class130.field3167);
            }
            class30.field681 = false;
            class58.field1471 = true;
            class126.method999(class36.field868 == -1, class34.field781 % 20 < 10 ? -1 : class43.field1032, class15.field289, (byte) -106, class130.field3167);
        }
        if (class55.field1350) {
            class58.field1471 = true;
            class55.field1350 = false;
            class128.method1005((byte) 106, class71.field1814, class37.field894, class114.field2869, class76.field1932);
        }
        class24.method167(true, class52.field1315.field1233, class52.field1315.field1242, class71.field1802, class99.field2510);
        class71.field1802 = 0;
    }
}
