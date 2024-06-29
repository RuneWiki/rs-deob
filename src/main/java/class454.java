import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class454 extends class215 {

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "Ljava/net/Socket;")
    private Socket field6546;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "Lle;")
    private class470 field6540;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "Ljv;")
    private class687 field6541;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "Lid;")
    public static class388 field6543 = new class388();

    @OriginalMember(owner = "client!gh", name = "A", descriptor = "[[S")
    private static short[][] field6555 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019, 7072, 3990, 309, 910, 9509, 9117, 3600, 16442, -32601, 22020, 2694, -22264, 10281, 3869, -28007, 10764, 8974, 3745, 10269, 914, 8629, -26438, 26779, -15208, 8728, 2982, -25718, 918, 6842, -25030, -5462, -14833, -22386, 8, -22468, -27479, -11237, 21664, 45, -24054, -27207, -22887, -30051, 20003, 21584, -31426, 28990, -11219, 6353, -25560, -25458, -14182, -11006, -27365, 3241, 7457, 8899, 13760, 4565, 11711, 10436, 8103, 2604, 13740, -28232, -26333, -23910, -31403, -32352, -29812, -29909, -24137, 925, 1181, 3865, 6049, 8582, 1804, 4887, -5372, 15011, 20785, 7591, 9528, 21770, 14094, 6930, 14635, 5911, 6463, 10124, 17935, 3218, 262, 5413, -27579, -25189, -26331, -28236, -28144, -23804, -23261, -23013, -19045, 5419, 6332, 5665, 2450, 3617, 8638, 5178, 10374, 6819, 7434, 150, 2446, 9647, -27504, -27586, -31695, 11142, 18704, 10775, 21898, 10554, 9492, 11811, 11140, -15978, -24180, -32498, -29288, 29084, -9579, -18799, -27122, 913, 6024, 2966, -5238, 6542, 15240, 10, 39, 3986, 2324, 6030, -31709, 512, 33, 9394, -4833, 28967, -25290, 30866, 13466, -28403, -24022, -14042, -22472, -18166, 20493, -27626, -22266, -1784, -31473, 9612, 7324, 646, 778, 786, 800, -624, -3198, -8164, 1678, 29068, 22412, -32253, 29075, 22404, -22006, 3974, 7054, 10376, 3222, 8070, 12, 1930, 2, -22481, 4884, 5797, 5900, 6, 40, 1932, 5638, 8466, -25537 }, { 25485, 9105, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019, 7072, 3990, 309, 910, 9509, 9117, 3600, 16442, -32601, 22020, 2694, -22264, 10281, 3869, -28007, 10764, 8974, 3745, 10269, 914, 8629, -26438, 26779, -15208, 8728, 2982, -25718, 918, 6842, -25030, -5462, -14833, -22386, 8, -22468, -27479, -11237, 21664, 45, -24054, -27207, -22887, -30051, 20003, 21584, -31426, 28990, -11219, 6353, -25560, -25458, -14182, -11006, -27365, 3241, 7457, 8899, 13760, 4565, 11711, 10436, 8103, 2604, 13740, -28232, -26333, -23910, -31403, -32352, -29812, -29909, -24137, 925, 1181, 3865, 6049, 8582, 1804, 4887, -5372, 15011, 20785, 7591, 9528, 21770, 14094, 6930, 14635, 5911, 6463, 10124, 17935, 3218, 262, 5413, -27579, -25189, -26331, -28236, -28144, -23804, -23261, -23013, -19045, 5419, 6332, 5665, 2450, 3617, 8638, 5178, 10374, 6819, 7434, 150, 2446, 9647, -27504, -27586, -31695, 11142, 18704, 10775, 21898, 10554, 9492, 11811, 11140, -15978, -24180, -32498, -29288, 29084, -9579, -18799, -27122, 913, 6024, 2966, -5238, 6542, 15240, 10, 39, 3986, 2324, 6030, -31709, 512, 33, 9394, -4833, 28967, -25290, 30866, 13466, -28403, -24022, -14042, -22472, -18166, 20493, -27626, -22266, -1784, -31473, 9612, 7324, 646, 778, 786, 800, -624, -3198, -8164, 1678, 29068, 22412, -32253, 29075, 22404, -22006, 3974, 7054, 10376, 3222, 8070, 12, 1930, 2, -22481, 4884, 5797, 5900, 6, 40, 1932, 5638, 8466, -25537 }, { 4620, 11140, 6433, 6, 4752, 10264, 7072, 3990, 309, 910, 9509, 9117, 3600, 16442, -32601, 22020, 2694, -22264, 10281, 3869, -28007, 10764, 8974, 3745, 10269, 914, 8629, -26438, 26779, -15208, 8728, 2982, -25718, 918, 6842, -25030, -5462, -14833, -22386, 8, -22468, -27479, -11237, 21664, 45, -24054, -27207, -22887, -30051, 20003, 21584, -31426, 28990, -11219, 6353, -25560, -25458, -14182, -11006, -27365, 3241, 7457, 8899, 13760, 4565, 11711, 10436, 8103, 2604, 13740, -28232, -26333, -23910, -31403, -32352, -29812, -29909, -24137, 925, 1181, 3865, 6049, 8582, 1804, 4887, -5372, 15011, 20785, 7591, 9528, 21770, 14094, 6930, 14635, 5911, 6463, 10124, 17935, 3218, 262, 5413, -27579, -25189, -26331, -28236, -28144, -23804, -23261, -23013, -19045, 5419, 6332, 5665, 2450, 3617, 8638, 5178, 10374, 6819, 7434, 150, 2446, 9647, -27504, -27586, -31695, 11142, 18704, 10775, 21898, 10554, 9492, 11811, 11140, -15978, -24180, -32498, -29288, 29084, -9579, -18799, -27122, 913, 6024, 2966, -5238, 6542, 15240, 10, 39, 3986, 2324, 6030, -31709, 512, 33, 9394, -4833, 28967, -25290, 30866, 13466, -28403, -24022, -14042, -22472, -18166, 20493, -27626, -22266, -1784, -31473, 9612, 7324, 646, 778, 786, 800, -624, -3198, -8164, 1678, 29068, 22412, -32253, 29075, 22404, -22006, 3974, 7054, 10376, 3222, 8070, 12, 1930, 2, -22481, 4884, 5797, 5900, 6, 40, 1932, 5638, 8466, -25537 }, { 4540, 4529, 5674, 5667, 5785, 6802, 8072, 4562, 4437, 4317, 5896, 4488 } };

    @OriginalMember(owner = "client!gh", name = "z", descriptor = "[I")
    public static int[] field6554 = new int[32];

    @OriginalMember(owner = "client!gh", name = "w", descriptor = "[[S")
    private static short[][] field6551 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010, 7085, 4001, 317, 918, 9517, 9125, 3608, 16450, -32593, 22026, 2700, -22256, 10289, 3877, -27999, 10770, 8982, 3753, 10275, 924, 8637, -26428, 26785, -15202, 8736, 2994, -25710, 928, 6859, -25016, -5449, -14823, -23401, 12, -22456, -27471, -11229, 21673, 57, -24046, -27190, -22877, -30041, 20013, 21596, -31414, 29000, -11209, 6361, -25552, -25450, -14174, -10998, -27357, 3249, 7465, 8913, 13774, 4584, 11728, 10454, 8123, 2619, 13756, -28220, -26323, -23901, -31385, -32342, -29806, -29902, -24128, 933, 1189, 3873, 6057, 8590, 1812, 4895, -5366, 15019, 20793, 7599, 9536, 21778, 14102, 6938, 14648, 5919, 6472, 10128, 17940, 3226, 267, 5421, -27570, -25177, -26319, -28217, -28132, -23792, -23249, -23001, -19033, 5427, 6340, 5673, 2458, 3625, 8646, 5186, 10382, 6826, 7442, 158, 2454, 9655, -27496, -27578, -31687, 11146, 18712, 10785, 21902, 10566, 9500, 11819, 11144, -15965, -24170, -32488, -29277, 29097, -9567, -18794, -27116, 921, 6028, 2974, -5230, 6550, 15244, 14, 49, 3994, 2332, 6038, -31701, 520, 41, 9402, -4825, 28978, -25278, 30876, 13475, -28395, -24010, -14027, -22454, -18158, 20503, -27618, -22258, -1776, -31468, 9616, 7333, 650, 784, 796, 813, -616, -3194, -8152, 1686, 29074, 22422, -32245, 29084, 22411, -22000, 3982, 7062, 10382, 3230, 8076, 20, 1936, 10, -22473, 4892, 5805, 5904, 10, 48, 1936, 5640, 8472, -25529 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010, 7085, 4001, 317, 918, 9517, 9125, 3608, 16450, -32593, 22026, 2700, -22256, 10289, 3877, -27999, 10770, 8982, 3753, 10275, 924, 8637, -26428, 26785, -15202, 8736, 2994, -25710, 928, 6859, -25016, -5449, -14823, -23401, 12, -22456, -27471, -11229, 21673, 57, -24046, -27190, -22877, -30041, 20013, 21596, -31414, 29000, -11209, 6361, -25552, -25450, -14174, -10998, -27357, 3249, 7465, 8913, 13774, 4584, 11728, 10454, 8123, 2619, 13756, -28220, -26323, -23901, -31385, -32342, -29806, -29902, -24128, 933, 1189, 3873, 6057, 8590, 1812, 4895, -5366, 15019, 20793, 7599, 9536, 21778, 14102, 6938, 14648, 5919, 6472, 10128, 17940, 3226, 267, 5421, -27570, -25177, -26319, -28217, -28132, -23792, -23249, -23001, -19033, 5427, 6340, 5673, 2458, 3625, 8646, 5186, 10382, 6826, 7442, 158, 2454, 9655, -27496, -27578, -31687, 11146, 18712, 10785, 21902, 10566, 9500, 11819, 11144, -15965, -24170, -32488, -29277, 29097, -9567, -18794, -27116, 921, 6028, 2974, -5230, 6550, 15244, 14, 49, 3994, 2332, 6038, -31701, 520, 41, 9402, -4825, 28978, -25278, 30876, 13475, -28395, -24010, -14027, -22454, -18158, 20503, -27618, -22258, -1776, -31468, 9616, 7333, 650, 784, 796, 813, -616, -3194, -8152, 1686, 29074, 22422, -32245, 29084, 22411, -22000, 3982, 7062, 10382, 3230, 8076, 20, 1936, 10, -22473, 4892, 5805, 5904, 10, 48, 1936, 5640, 8472, -25529 }, { 4626, 11146, 6439, 12, 4758, 10270, 7085, 4001, 317, 918, 9517, 9125, 3608, 16450, -32593, 22026, 2700, -22256, 10289, 3877, -27999, 10770, 8982, 3753, 10275, 924, 8637, -26428, 26785, -15202, 8736, 2994, -25710, 928, 6859, -25016, -5449, -14823, -23401, 12, -22456, -27471, -11229, 21673, 57, -24046, -27190, -22877, -30041, 20013, 21596, -31414, 29000, -11209, 6361, -25552, -25450, -14174, -10998, -27357, 3249, 7465, 8913, 13774, 4584, 11728, 10454, 8123, 2619, 13756, -28220, -26323, -23901, -31385, -32342, -29806, -29902, -24128, 933, 1189, 3873, 6057, 8590, 1812, 4895, -5366, 15019, 20793, 7599, 9536, 21778, 14102, 6938, 14648, 5919, 6472, 10128, 17940, 3226, 267, 5421, -27570, -25177, -26319, -28217, -28132, -23792, -23249, -23001, -19033, 5427, 6340, 5673, 2458, 3625, 8646, 5186, 10382, 6826, 7442, 158, 2454, 9655, -27496, -27578, -31687, 11146, 18712, 10785, 21902, 10566, 9500, 11819, 11144, -15965, -24170, -32488, -29277, 29097, -9567, -18794, -27116, 921, 6028, 2974, -5230, 6550, 15244, 14, 49, 3994, 2332, 6038, -31701, 520, 41, 9402, -4825, 28978, -25278, 30876, 13475, -28395, -24010, -14027, -22454, -18158, 20503, -27618, -22258, -1776, -31468, 9616, 7333, 650, 784, 796, 813, -616, -3194, -8152, 1686, 29074, 22422, -32245, 29084, 22411, -22000, 3982, 7062, 10382, 3230, 8076, 20, 1936, 10, -22473, 4892, 5805, 5904, 10, 48, 1936, 5640, 8472, -25529 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574, 4444, 4328, 7052, 4490 } };

    @OriginalMember(owner = "client!gh", name = "y", descriptor = "[[S")
    private static short[][] field6553 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!gh", name = "x", descriptor = "[[[S")
    public static short[][][] field6552 = new short[][][] { field6551, field6555, field6553 };

    @OriginalMember(owner = "client!gh", name = "B", descriptor = "Lvg;")
    public static class622 field6556 = new class622(2, 5);

    @OriginalMember(owner = "client!gh", name = "C", descriptor = "I")
    public static int field6557 = 0;

    @OriginalMember(owner = "client!gh", name = "D", descriptor = "J")
    public static long field6558 = -1L;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public static int field6536;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
    public static int field6537;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    public static int field6538;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
    public static int field6539;

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
    public static int field6542;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
    public static int field6544;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "I")
    public static int field6545;

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "I")
    public static int field6547;

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "I")
    public static int field6548;

    @OriginalMember(owner = "client!gh", name = "u", descriptor = "I")
    public static int field6549;

    @OriginalMember(owner = "client!gh", name = "v", descriptor = "Lew;")
    public static class226 field6550;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V", line = 5)
    public final void method1361(byte arg0) {
        this.field6540.method2707(31355);
        if (arg0 != -54) {
            method2665(-69, -116, (byte) 61);
        }
        field6539++;
        this.field6541.method3850(arg0 ^ 0xFFFFFFCE);
    }

    @OriginalMember(owner = "client!gh", name = "finalize", descriptor = "()V", line = 18)
    protected final void finalize() {
        this.method1362((byte) -116);
        field6548++;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BLjava/lang/String;)V", line = 26)
    public static final void method2662(byte arg0, String arg1) {
        field6537++;
        if (arg0 != -69) {
            return;
        }
        class433.field6283 = arg1;
        if (class551.field8116 == null) {
            return;
        }
        try {
            String var2 = class551.field8116.getParameter("cookieprefix");
            String var3 = class551.field8116.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg1.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class614.method3494(-8287, class60.method371(false) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class101.method726(class551.field8116, "document.cookie=\"" + var5 + "\"", -24044);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(B)V", line = 64)
    public final void method1362(byte arg0) {
        field6536++;
        try {
            this.field6546.close();
            int var2 = -110 / ((-arg0 - 52) / 47);
        } catch (IOException var3) {
        }
        this.field6540.method2708((byte) -108);
        this.field6541.method3851(-32296);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)Z", line = 79)
    public final boolean method1359(int arg0, int arg1) throws IOException {
        field6547++;
        if (arg0 >= -73) {
            method2664(91);
        }
        return this.field6540.method2710(arg1, -123);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIB)Z", line = 92)
    public static final boolean method2663(int arg0, int arg1, byte arg2) {
        field6542++;
        if (arg2 == -107) {
            return (arg0 & 0x21) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)V", line = 103)
    public static void method2664(int arg0) {
        field6543 = null;
        field6555 = null;
        field6553 = null;
        field6551 = null;
        field6554 = null;
        field6552 = null;
        field6550 = null;
        if (arg0 != -22386) {
            field6555 = null;
        }
        field6556 = null;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(IIB)V", line = 125)
    public static final void method2665(int arg0, int arg1, byte arg2) {
        field6545++;
        if (class55.field844 < class55.field842) {
            class55.field844 = (float) ((double) class55.field844 / 30.0D + (double) class55.field844);
            if (class55.field844 > class55.field842) {
                class55.field844 = class55.field842;
            }
            class103.method734((byte) 0);
            class55.field847 = (int) class55.field844 >> 1;
            class55.field846 = class693.method3906(class55.field847, 18724);
        } else if (class55.field842 < class55.field844) {
            class55.field844 = (float) ((double) class55.field844 - (double) class55.field844 / 30.0D);
            if (class55.field842 > class55.field844) {
                class55.field844 = class55.field842;
            }
            class103.method734((byte) -89);
            class55.field847 = (int) class55.field844 >> 1;
            class55.field846 = class693.method3906(class55.field847, 18724);
        }
        if (class519.field7277 != -1 && class425.field6217 != -1) {
            int var3 = class519.field7277 - class108.field1617;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class425.field6217 - class19.field375;
            class108.field1617 += var3;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class19.field375 += var4;
            if (var3 == 0 && var4 == 0) {
                class519.field7277 = -1;
                class425.field6217 = -1;
            }
            class103.method734((byte) 38);
        }
        if (arg2 != 123) {
            field6556 = null;
        }
        if (class606.field8764 <= 0) {
            class164.field2305 = -1;
            class280.field3710 = -1;
        } else {
            class405.field6057--;
            if (class405.field6057 == 0) {
                class606.field8764--;
                class405.field6057 = 100;
            }
        }
        if (!class22.field401 || class507.field7162 == null) {
            return;
        }
        for (class51 var5 = (class51) class507.field7162.method1904(false); var5 != null; var5 = (class51) class507.field7162.method1901(107)) {
            class168 var6 = class55.field834.method2757(var5.field798.field6142, (byte) -46);
            if (var5.method305(arg0, arg1, 114)) {
                if (var6.field2375 != null) {
                    if (var6.field2375[4] != null) {
                        class621.method3581(var6.field2375[4], 0, 1011, (long) var5.field798.field6142, var6.field2380, (byte) 127, var6.field2362, false, -1, -1, true);
                    }
                    if (var6.field2375[3] != null) {
                        class621.method3581(var6.field2375[3], 0, 1004, (long) var5.field798.field6142, var6.field2380, (byte) 127, var6.field2362, false, -1, -1, true);
                    }
                    if (var6.field2375[2] != null) {
                        class621.method3581(var6.field2375[2], 0, 1009, (long) var5.field798.field6142, var6.field2380, (byte) 127, var6.field2362, false, -1, -1, true);
                    }
                    if (var6.field2375[1] != null) {
                        class621.method3581(var6.field2375[1], 0, 1012, (long) var5.field798.field6142, var6.field2380, (byte) 127, var6.field2362, false, -1, -1, true);
                    }
                    if (var6.field2375[0] != null) {
                        class621.method3581(var6.field2375[0], 0, 1002, (long) var5.field798.field6142, var6.field2380, (byte) 127, var6.field2362, false, -1, -1, true);
                    }
                }
                if (!var5.field798.field6140) {
                    var5.field798.field6140 = true;
                    class195.method1263(class657.field9383, var5.field798.field6142, var6.field2380);
                }
                if (var5.field798.field6140) {
                    class195.method1263(class236.field3110, var5.field798.field6142, var6.field2380);
                }
            } else if (var5.field798.field6140) {
                var5.field798.field6140 = false;
                class195.method1263(class103.field1538, var5.field798.field6142, var6.field2380);
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Ljava/net/Socket;I)V", line = 262)
    public class454(Socket arg0, int arg1) throws IOException {
        this.field6546 = arg0;
        this.field6546.setSoTimeout(30000);
        this.field6546.setTcpNoDelay(true);
        this.field6540 = new class470(this.field6546.getInputStream(), arg1);
        this.field6541 = new class687(this.field6546.getOutputStream(), arg1);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZI[BI)I", line = 275)
    public final int method1356(boolean arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg0) {
            field6552 = null;
        }
        field6549++;
        return this.field6540.method2712(0, arg2, arg3, arg1);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZII[B)V", line = 286)
    public final void method1363(boolean arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (!arg0) {
            this.field6541.method3848(arg2, arg1, 121, arg3);
            field6544++;
        }
    }
}
