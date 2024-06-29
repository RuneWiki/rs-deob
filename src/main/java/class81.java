import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class81 {

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
    public int field1974 = 0;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
    public int field1977 = 0;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "Z")
    public static boolean field1964 = false;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "[Z")
    public static boolean[] field1968 = new boolean[5];

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "Lae;")
    private static class6 field1970 = class64.method474(124, "Classic");

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "Lae;")
    private static class6 field1976 = class64.method474(104, "Add friend");

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "Lae;")
    public static class6 field1971 = class64.method474(116, "Regeln versto-8en hat)3");

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "Lae;")
    public static class6 field1966 = field1976;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "Lae;")
    public static class6 field1981 = field1970;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public int field1961;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public int field1962;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public int field1965;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    public int field1972;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "I")
    public int field1979;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "Lte;")
    public static class121 field1973;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "Lgd;")
    public class42 field1980;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "Ll;")
    public static class71 field1967;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IB)Lae;", line = 7)
    public static final class6 method690(int arg0, byte arg1) {
        field1975++;
        if (arg1 < 26) {
            return null;
        } else if (arg0 < 100000) {
            return class114.method942((byte) 71, arg0);
        } else if (arg0 < 10000000) {
            return class85.method731(new class6[] { class114.method942((byte) 71, arg0 / 1000), class67.field1484 }, 14569);
        } else {
            return class85.method731(new class6[] { class114.method942((byte) 71, arg0 / 1000000), class32.field784 }, 14569);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V", line = 36)
    public static final void method691(int arg0) {
        if (arg0 != -19093) {
            return;
        }
        field1978++;
        if (class108.field2590 == null) {
            return;
        }
        if (class49.field1094 < 0) {
            if (class87.field2102 > 0) {
                class87.field2102--;
                if (class87.field2102 == 0) {
                    if (class51.field1155 == null) {
                        class108.field2590.method363(256, (byte) 53);
                    } else {
                        class108.field2590.method363(class134.field3267, (byte) 124);
                        class49.field1094 = class134.field3267;
                        class108.field2590.method361(class134.field3267, class51.field1155, (byte) 126, class61.field1343);
                        class51.field1155 = null;
                    }
                    class130.field3160 = 0;
                }
            }
        } else if (class87.field2102 > 0) {
            class130.field3160 += class105.field2503;
            class108.field2590.method360(class130.field3160, class49.field1094, arg0 ^ 0xFFFFB56B);
            class87.field2102--;
            if (class87.field2102 == 0) {
                class108.field2590.method365(false);
                class49.field1094 = -1;
                class87.field2102 = 20;
            }
        }
        class108.field2590.method364(0);
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(IB)I", line = 96)
    public static final int method692(int arg0, byte arg1) {
        field1982++;
        class63 var2 = class40.method341(arg0, (byte) -124);
        int var3 = var2.field1376;
        if (arg1 != -83) {
            field1964 = true;
        }
        int var4 = var2.field1379;
        int var5 = class32.field799[var4 - var3];
        int var6 = var2.field1372;
        return class133.field3245[var6] >> var3 & var5;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lte;B)Lte;", line = 121)
    public static final class121 method693(class121 arg0, byte arg1) {
        if (arg1 >= -106) {
            method690(41, (byte) 36);
        }
        class121 var2 = arg0.method993((byte) 94);
        field1963++;
        if (var2 == null) {
            var2 = arg0.field2904;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)V", line = 167)
    public static void method694(boolean arg0) {
        field1976 = null;
        field1981 = null;
        field1968 = null;
        field1967 = null;
        field1970 = null;
        field1966 = null;
        field1971 = null;
        if (arg0) {
            field1968 = null;
        }
        field1973 = null;
    }
}
