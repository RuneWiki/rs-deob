import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class344 {

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public int field4746 = 1;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    public static int field4750 = 1401;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "Z")
    public static boolean field4753;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "C")
    public char field4743;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "I")
    public static int field4752;

    static {
        new class151("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
        field4753 = false;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lkk;I)V", line = 4)
    public final void method2138(class161 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1172((byte) -115);
            if (var3 == 0) {
                if (arg1 <= 21) {
                    field4753 = false;
                }
                field4749++;
                return;
            }
            this.method2141(-2, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(CI)Z", line = 28)
    public static final boolean method2139(char arg0, int arg1) {
        field4747++;
        if (arg1 <= 59) {
            field4750 = 11;
        }
        return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)V", line = 40)
    public static final void method2140(int arg0, int arg1) {
        field4748++;
        int var2 = class364.field5010 - class345.field4774;
        if (var2 >= 100) {
            class390.field5393 = 1;
            return;
        }
        int var3 = (int) class421.field5826;
        if (class334.field4649 >> 8 > var3) {
            var3 = class334.field4649 >> 8;
        }
        if (class394.field5441[4] && var3 < (class138.field1915[4] + 128)) {
            var3 = class138.field1915[4] + 128;
        }
        int var4 = (int) class91.field1281 + class270.field3935 & 0x3FFF;
        class329.method2059((var3 >> 3) * 3 + 600, class108.field1520, var3, var4, 255, class407.method2440(class262.field3781.field4537, -16490, class262.field3781.field4530, class387.field5306) - 50, arg0, class279.field4006);
        float var5 = 1.0F - (float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F;
        int var6 = -83 / ((arg1 + 82) / 44);
        class366.field5028 = (int) ((float) (class366.field5028 - class149.field2056) * var5 + (float) class149.field2056);
        class184.field2784 = (int) ((float) (class184.field2784 - class133.field1867) * var5 + (float) class133.field1867);
        class135.field1884 = (int) ((float) (class135.field1884 - class412.field5653) * var5 + (float) class412.field5653);
        class303.field4302 = (int) ((float) (class303.field4302 - class314.field4446) * var5 + (float) class314.field4446);
        int var7 = class103.field1455 - class442.field6271;
        if (var7 > 8192) {
            var7 -= 16384;
        } else if (var7 < -8192) {
            var7 += 16384;
        }
        class103.field1455 = (int) ((float) var7 * var5 + (float) class442.field6271);
        class103.field1455 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILkk;)V", line = 88)
    private final void method2141(int arg0, int arg1, class161 arg2) {
        if (~arg1 == arg0) {
            this.field4743 = class441.method2681(16, arg2.method1152(-1910700904));
        } else if (arg1 == 2) {
            this.field4746 = 0;
        }
        field4752++;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)V", line = 105)
    public static final void method2142(boolean arg0) {
        if (arg0) {
            return;
        }
        if (class135.field1885 >= 0) {
            long var1 = class10.method51(-3183);
            class135.field1885 = (int) ((long) class135.field1885 - (var1 - class221.field3190));
            if (class135.field1885 > 0) {
                int var3 = (class135.field1885 << 8) / class95.field1337;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                class249.field3595 = ((class30.field311 & 0xFF00) * var3 + (class46.field707.field6834 & 0xFF00) * var4 & 0xFF0000) + ((class30.field311 & 0xFF00FF) * var3 + (class46.field707.field6834 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
                float var6 = 1.0F - var5;
                class469.field6612 = class137.field1913 * var3 + class46.field707.field6823 * var4 >> 8;
                class174.field2653 = (class46.field707.field6832 - class329.field4560) * var6 + class329.field4560;
                class95.field1338 = (class46.field707.field6835 - class25.field269) * var6 + class25.field269;
                class491.field6929 = (class46.field707.field6836 - class130.field1780) * var6 + class130.field1780;
                class475.field6701 = (class46.field707.field6830 - class238.field3489) * var6 + class238.field3489;
                class227.field3266 = ((class67.field979 & 0xFF00FF) * var3 + ((class46.field707.field6827 & 0xFF00FF) * var4) & 0xFF00FF00) + ((class67.field979 & 0xFF00) * var3 + (class46.field707.field6827 & 0xFF00) * var4 & 0xFF0000) >>> 8;
                class318.field4498 = (class46.field707.field6829 - class466.field6568) * var6 + class466.field6568;
                class352.field4845 = (class46.field707.field6825 - class236.field3435) * var6 + class236.field3435;
                if (class61.field888 != class46.field707.field6839) {
                    class31.field331 = class266.field3835.method410(class61.field888, class46.field707.field6839, var6, class31.field331);
                }
            } else {
                class249.field3595 = class46.field707.field6834;
                class352.field4845 = class46.field707.field6825;
                class491.field6929 = class46.field707.field6836;
                class174.field2653 = class46.field707.field6832;
                class135.field1885 = -1;
                class31.field331 = class46.field707.field6839;
                class469.field6612 = class46.field707.field6823;
                class227.field3266 = class46.field707.field6827;
                class475.field6701 = class46.field707.field6830;
                class95.field1338 = class46.field707.field6835;
                class318.field4498 = class46.field707.field6829;
            }
            class221.field3190 = var1;
        }
        field4751++;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BC)C", line = 171)
    public static final char method2143(byte arg0, char arg1) {
        field4745++;
        if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else {
            int var2 = 91 % ((-arg0 - 1) / 42);
            if (arg1 == 'ß') {
                return 's';
            } else if (arg1 == 'Œ') {
                return 'E';
            } else {
                return (char) (arg1 == 'œ' ? 'e' : '\u0000');
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)[Lrc;", line = 211)
    public static final class108[] method2144(int arg0) {
        field4744++;
        int var1 = -94 / ((arg0 - 48) / 53);
        return new class108[] { class71.field1031, class93.field1311, class390.field5396, class225.field3248, class187.field2800, class312.field4407, class391.field5400, class384.field5259, class167.field2426, class414.field5680, class213.field3093, class176.field2668, class211.field3074, class20.field218, class462.field6531, class94.field1315, class341.field4707, class388.field5318, class207.field3039, class480.field6797, class345.field4761, class223.field3221, class158.field2250, class102.field1430, class196.field2904, class397.field5455, class312.field4418, class34.field349, class96.field1347, class22.field250, class129.field1769, class389.field5373, class193.field2869, class443.field6297, class432.field6112, class377.field5195, class271.field3942, class395.field5447, class481.field6809, class39.field525, class168.field2436, class490.field6909, class129.field1771, class411.field5625, class230.field3381, class350.field4831, class142.field1976, class303.field4309, class343.field4739, class292.field4128, class183.field2754, class56.field823, class233.field3401, class357.field4932, class482.field6819, class102.field1433, class444.field6315, class398.field5460, class279.field4004, class143.field1998, class95.field1332, class48.field732, class21.field223, class399.field5465, class79.field1166, class174.field2645, class407.field5552, class462.field6530, class401.field5506, class296.field4180, class111.field1564, class370.field5096, class41.field539, class164.field2393, class143.field1997, class419.field5816, class255.field3672, class227.field3268, class161.field2306, class334.field4650, class436.field6192, class379.field5211, class401.field5500, class149.field2039, class166.field2420, class368.field5065, class98.field1389, class149.field2057, class105.field1475, class265.field3820, class354.field4864, class319.field4506, class336.field4664, class412.field5649, class404.field5534, class76.field1121, class472.field6647, class141.field1973, class373.field5135, class175.field2657, class418.field5728, class310.field4400, class66.field966, class405.field5539, class305.field4327 };
    }
}
