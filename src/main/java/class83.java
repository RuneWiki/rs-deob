import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class83 {

    @OriginalMember(owner = "client!na", name = "c", descriptor = "Lkc;")
    public static class67 field1965 = class19.method144("Fallen lassen", 102);

    @OriginalMember(owner = "client!na", name = "j", descriptor = "Lkc;")
    public static class67 field1972 = class19.method144("(U3", 100);

    @OriginalMember(owner = "client!na", name = "l", descriptor = "Lkc;")
    public static class67 field1974 = class19.method144("backleft1", 107);

    @OriginalMember(owner = "client!na", name = "e", descriptor = "Lgd;")
    public static class44 field1967 = new class44(50);

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "Lc;")
    public static class15 field1966;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "Lac;")
    public static class4 field1968;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "Lke;")
    public static class69 field1963;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V", line = 12)
    public static void method646(int arg0) {
        field1968 = null;
        field1963 = null;
        field1967 = null;
        field1966 = null;
        field1972 = null;
        if (arg0 <= -34) {
            field1965 = null;
            field1974 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILwd;Lkc;)I", line = 37)
    public static final int method647(int arg0, class140 arg1, class67 arg2) {
        field1964++;
        if (arg0 != 2047) {
            field1966 = null;
        }
        int var3 = arg1.field3347;
        arg1.method1081(arg2.field1572, -2);
        arg1.field3347 += class97.field2188.method257(arg0 ^ 0x63AD, 0, arg2.field1597, arg1.field3347, arg2.field1572, arg1.field3325);
        return arg1.field3347 - var3;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V", line = 65)
    public static final void method648(int arg0) {
        class91.field2115++;
        class111.method840(true, 16693);
        field1973++;
        class50.method417(true, (byte) -82);
        class111.method840(false, 16693);
        class50.method417(false, (byte) 119);
        class91.method711(false);
        class114.method917(-27080);
        if (!class106.field2420) {
            int var1 = class32.field686 + class19.field376 & 0x7FF;
            int var2 = class121.field2847;
            if (class18.field351 / 256 > var2) {
                var2 = class18.field351 / 256;
            }
            if (class119.field2816[4] && class84.field1983[4] + 128 > var2) {
                var2 = class84.field1983[4] + 128;
            }
            class14.method122(class65.field1536, 1300942544, var1, var2, var2 * 3 + 600, class116.field2739, class70.method575(class69.field1640.field1190, 1, class69.field1640.field1260, class112.field2593) - 50);
        }
        int var3;
        if (class106.field2420) {
            var3 = class71.method580(-127);
        } else {
            var3 = class98.method759(-1980124601);
        }
        if (arg0 <= 31) {
            return;
        }
        int var4 = class133.field3164;
        int var5 = class127.field2980;
        int var6 = class74.field1776;
        int var7 = class116.field2737;
        int var8 = class65.field1535;
        for (int var9 = 0; var9 < 5; var9++) {
            if (class119.field2816[var9]) {
                int var10 = (int) ((double) -class31.field655[var9] + Math.random() * (double) (class31.field655[var9] * 2 + 1) + Math.sin((double) class21.field439[var9] / 100.0D * (double) class82.field1951[var9]) * (double) class84.field1983[var9]);
                if (var9 == 3) {
                    class65.field1535 = class65.field1535 + var10 & 0x7FF;
                }
                if (var9 == 1) {
                    class133.field3164 += var10;
                }
                if (var9 == 0) {
                    class127.field2980 += var10;
                }
                if (var9 == 4) {
                    class116.field2737 += var10;
                    if (class116.field2737 < 128) {
                        class116.field2737 = 128;
                    }
                    if (class116.field2737 > 383) {
                        class116.field2737 = 383;
                    }
                }
                if (var9 == 2) {
                    class74.field1776 += var10;
                }
            }
        }
        class10.method89(-54);
        class39.field952 = class80.field1889 - 4;
        class39.field942 = class138.field3298 - 4;
        class39.field959 = 0;
        class39.field958 = true;
        class68.method565();
        class103.field2332.method876(class127.field2980, class133.field3164, class74.field1776, class116.field2737, class65.field1535, var3);
        class103.field2332.method896();
        class125.method975(-4);
        class64.method492((byte) -102);
        ((class117) class105.field2362).method930(class121.field2830, 97);
        class29.method252(false);
        if (class114.field2673 && class91.method722(true, 127, false) == 0) {
            class114.field2673 = false;
        }
        if (class114.field2673) {
            class10.method89(-70);
            class68.method565();
            class108.method827(false, null, class19.field373, -8038);
        }
        class90.method701(false);
        class127.field2980 = var5;
        class65.field1535 = var8;
        class116.field2737 = var7;
        class133.field3164 = var4;
        class74.field1776 = var6;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BLed;)I", line = 190)
    public static final int method649(byte arg0, class33 arg1) {
        if (arg0 == -102) {
            field1969++;
            class46 var2 = (class46) class135.field3245.method462(false, ((long) arg1.field740 << 32) + ((long) arg1.field800));
            return var2 == null ? arg1.field703 : var2.field1119;
        } else {
            return -37;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)I", line = 224)
    public static final int method650(int arg0, int arg1) {
        int var2 = -90 % ((-arg0 - 71) / 53);
        field1970++;
        return (int) (Math.log((double) arg1 * 0.00390625D) * 868.5889638065036D + 0.5D);
    }
}
