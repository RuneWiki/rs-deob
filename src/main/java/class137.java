import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class137 {

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "Lbe;")
    public static class235 field2440 = new class235(8);

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "[I")
    public static int[] field2441 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "[[I")
    public static int[][] field2448 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "[[S")
    public static short[][] field2452 = new short[][] { { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 119, 92, 66, 39, 20, 4, 955, 1845, 4032, 7101, 10178, 14272, 17341, 21433, 27581, 30651, -31811, -27717, -24640, -21581, -17603, -13383, 794, 5020, 7062, 1160, 15128, 17940, 30614, -30952, -26728, -23662, -18536, -14440, -9324, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 119, 92, 66, 39, 20, 4, 955, 1845, 4032, 7101, 10178, 14272, 17341, 21433, 27581, 30651, -31811, -27717, -24640, -21581, -17603, -13383, 794, 5020, 7062, 1160, 15128, 17940, 30614, -30952, -26728, -23662, -18536, -14440, -9324, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 119, 92, 66, 39, 20, 4, 955, 1845, 4032, 7101, 10178, 14272, 17341, 21433, 27581, 30651, -31811, -27717, -24640, -21581, -17603, -13383, 794, 5020, 7062, 1160, 15128, 17940, 30614, -30952, -26728, -23662, -18536, -14440, -9324, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 22461, -21571, 11200, 957, -10317, 5056, -31808, 123, 22453, -21579, 11191, 949, -10325, 4023, -31817, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 10347, 10582, 10429, 10407, 10359, 8414, 9540, 10456, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866 }, { 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384, 8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 13766, 13745, 13726, 13890, 13743, 13852, 17602, 18605, 21660, 24000, 24997, 24088, 27972, 25903, 26904, 27193, 27175, 27156, 30020, 28975, 29976, 12482, 13485, 10392, 10692, 10669, 10776, 6717, 6695, 7830, 6971, 6951, 5910, 3389, 3369, 3356, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866 } };

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public int field2439;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    public int field2442;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public int field2443;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
    public int field2445;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "I")
    public int field2449;

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
    public int field2451;

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!nf", name = "q", descriptor = "I")
    public int field2454;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "Lgg;")
    public static class34 field2444;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "[B")
    public byte[] field2438;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "[B")
    public byte[] field2450;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)J", line = 5)
    public static final long method1071(int arg0, int arg1, int arg2) {
        class225 var3 = class288.field4856[arg0][arg1][arg2];
        return var3 == null || var3.field3775 == null ? 0L : var3.field3775.field2461;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V", line = 25)
    public static void method1072(int arg0) {
        field2448 = (int[][]) null;
        field2444 = null;
        field2441 = null;
        field2452 = (short[][]) null;
        int var1 = -28 % ((arg0 - 69) / 54);
        field2440 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)I", line = 45)
    public static final int method1073(byte arg0) {
        if (arg0 != 16) {
            field2444 = (class34) null;
        }
        field2446++;
        try {
            if (++class82.field1435 > 1500) {
                throw new IOException();
            }
            if (class87.field1552 == 0) {
                if (class300.method2048((byte) 18) - 5000L < class89.field1593) {
                    return 0;
                }
                class89.field1593 = class300.method2048((byte) 18);
                class71.field1132 = client.field1903.method237(class156.field2745, -6303, class83.field1441);
                class87.field1552 = 1;
            }
            if (class87.field1552 == 1) {
                if (class71.field1132.field2934 == 2) {
                    throw new IOException();
                }
                if (class71.field1132.field2934 != 1) {
                    return -1;
                }
                class116.field2054 = new class267((Socket) class71.field1132.field2933, client.field1903);
                class187.field3229.field1653 = 0;
                class71.field1132 = null;
                int var1 = 0;
                if (class245.field4081) {
                    var1 = class293.field4935;
                }
                class187.field3229.method753(78, true);
                class187.field3229.method730(false, var1);
                class116.field2054.method1827(0, -114, class187.field3229.field1681, class187.field3229.field1653);
                if (class268.field4484 != null) {
                    class268.field4484.method458((byte) -74);
                }
                if (class247.field4100 != null) {
                    class247.field4100.method458((byte) -74);
                }
                int var2 = class116.field2054.method1832(25831);
                if (class268.field4484 != null) {
                    class268.field4484.method458((byte) -74);
                }
                if (class247.field4100 != null) {
                    class247.field4100.method458((byte) -74);
                }
                if (var2 != 0) {
                    if (class116.field2054 != null) {
                        class116.field2054.method1829((byte) 4);
                        class116.field2054 = null;
                    }
                    class305.field5144++;
                    if (class305.field5144 <= 4) {
                        class87.field1552 = 0;
                        if (class171.field2962 == class156.field2745) {
                            class156.field2745 = class19.field310;
                        } else {
                            class156.field2745 = class171.field2962;
                        }
                        class82.field1435 = 0;
                        return -1;
                    }
                    class264.method1810(-52);
                    return var2;
                }
                class87.field1552 = 2;
            }
            if (class87.field1552 == 2) {
                if (class116.field2054.method1826(97) < 2) {
                    return -1;
                }
                class180.field3086 = class116.field2054.method1832(arg0 ^ 0x64F7);
                class180.field3086 <<= 0x8;
                class180.field3086 += class116.field2054.method1832(arg0 + 25815);
                class87.field1552 = 3;
                class313.field5286 = new byte[class180.field3086];
            }
            if (class87.field1552 == 3) {
                int var3 = class116.field2054.method1826(99);
                if (var3 < 1) {
                    return -1;
                }
                if ((class180.field3086 - class70.field1112) < var3) {
                    var3 = class180.field3086 - class70.field1112;
                }
                class116.field2054.method1830(var3, (byte) 115, class313.field5286, class70.field1112);
                class70.field1112 += var3;
                if (class180.field3086 > class70.field1112) {
                    return -1;
                }
                class23.method196(arg0 + 42, class313.field5286);
                int var4 = 0;
                class13.field220 = new class223[class317.field5351];
                for (int var5 = class40.field657; var5 <= class114.field2040; var5++) {
                    class223 var6 = class31.method256((byte) 101, var5);
                    if (var6 != null) {
                        class13.field220[var4++] = var6;
                    }
                }
                class116.field2054.method1829((byte) 4);
                class116.field2054 = null;
                class264.method1810(-85);
                return 0;
            }
        } catch (IOException var8) {
            if (class116.field2054 != null) {
                class116.field2054.method1829((byte) 4);
                class116.field2054 = null;
            }
            class305.field5144++;
            if (class305.field5144 > 4) {
                class264.method1810(85);
                return 1000;
            }
            class87.field1552 = 0;
            if (class171.field2962 == class156.field2745) {
                class156.field2745 = class19.field310;
            } else {
                class156.field2745 = class171.field2962;
            }
            class82.field1435 = 0;
        }
        return -1;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V", line = 228)
    public static final void method1074(int arg0) {
        if (arg0 == 3503) {
            field2447++;
            class269.field4499 = null;
            class210.method1544();
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZLb;)Lic;", line = 250)
    public static final class20 method1075(boolean arg0, class94 arg1) {
        if (arg0) {
            field2440 = (class235) null;
        }
        class20 var2 = new class20();
        var2.field322 = arg1.method761((byte) 108);
        var2.field320 = class190.method1415(var2.field322, 6047);
        field2453++;
        return var2;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lhc;IIIIIIZ)V", line = 266)
    public static final void method1076(class164 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field2902.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var10 = arg0.field2902[var9] - class201.field3418;
            int var11 = arg0.field2896[var9] - class31.field523;
            int var12 = arg0.field2912[var9] - class156.field2748;
            int var13 = arg3 * var12 + arg4 * var10 >> 16;
            int var14 = arg4 * var12 - arg3 * var10 >> 16;
            int var16 = arg2 * var11 - arg1 * var14 >> 16;
            int var17 = arg1 * var11 + arg2 * var14 >> 16;
            if (var17 < 50) {
                return;
            }
            if (arg0.field2907 != null) {
                class164.field2903[var9] = var13;
                class164.field2911[var9] = var16;
                class164.field2900[var9] = var17;
            }
            class164.field2908[var9] = (var13 << 9) / var17 + class312.field5263;
            class164.field2904[var9] = (var16 << 9) / var17 + class312.field5261;
        }
        class312.field5270 = 0;
        int var19 = arg0.field2914.length;
        for (int var20 = 0; var20 < var19; var20++) {
            int var21 = arg0.field2914[var20];
            int var22 = arg0.field2894[var20];
            int var23 = arg0.field2915[var20];
            int var24 = class164.field2908[var21];
            int var25 = class164.field2908[var22];
            int var26 = class164.field2908[var23];
            int var27 = class164.field2904[var21];
            int var28 = class164.field2904[var22];
            int var29 = class164.field2904[var23];
            if ((var24 - var25) * (var29 - var28) - (var26 - var25) * (var27 - var28) > 0) {
                if (class302.field5073 && class247.method1734(class312.field5263 + class123.field2226, class314.field5300 + class312.field5261, var27, var28, var29, var24, var25, var26)) {
                    class302.field5095 = arg5;
                    class286.field4828 = arg6;
                }
                if (!class117.field2159 && !arg7) {
                    class312.field5259 = false;
                    if (var24 < 0 || var25 < 0 || var26 < 0 || var24 > class312.field5260 || var25 > class312.field5260 || var26 > class312.field5260) {
                        class312.field5259 = true;
                    }
                    if (arg0.field2907 == null || arg0.field2907[var20] == -1) {
                        if (arg0.field2905[var20] != 12345678) {
                            class312.method2129(var27, var28, var29, var24, var25, var26, arg0.field2905[var20], arg0.field2910[var20], arg0.field2899[var20]);
                        }
                    } else if (!class247.field4090) {
                        int var30 = class312.field5271.method157(arg0.field2907[var20], false);
                        class312.method2129(var27, var28, var29, var24, var25, var26, class148.method1176(var30, arg0.field2905[var20]), class148.method1176(var30, arg0.field2910[var20]), class148.method1176(var30, arg0.field2899[var20]));
                    } else if (arg0.field2898) {
                        class312.method2131(var27, var28, var29, var24, var25, var26, arg0.field2905[var20], arg0.field2910[var20], arg0.field2899[var20], class164.field2903[0], class164.field2903[1], class164.field2903[3], class164.field2911[0], class164.field2911[1], class164.field2911[3], class164.field2900[0], class164.field2900[1], class164.field2900[3], arg0.field2907[var20]);
                    } else {
                        class312.method2131(var27, var28, var29, var24, var25, var26, arg0.field2905[var20], arg0.field2910[var20], arg0.field2899[var20], class164.field2903[var21], class164.field2903[var22], class164.field2903[var23], class164.field2911[var21], class164.field2911[var22], class164.field2911[var23], class164.field2900[var21], class164.field2900[var22], class164.field2900[var23], arg0.field2907[var20]);
                    }
                }
            }
        }
    }
}
