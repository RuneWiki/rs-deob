import java.security.MessageDigest;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class178 extends class13 {

    @OriginalMember(owner = "client!af", name = "u", descriptor = "I")
    private int field3124 = -1;

    @OriginalMember(owner = "client!af", name = "A", descriptor = "I")
    private int field3130 = -1;

    @OriginalMember(owner = "client!af", name = "v", descriptor = "I")
    private int field3125 = -32768;

    @OriginalMember(owner = "client!af", name = "I", descriptor = "Lqg;")
    private class217 field3137 = null;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "I")
    private int field3122;

    @OriginalMember(owner = "client!af", name = "w", descriptor = "I")
    private int field3126;

    @OriginalMember(owner = "client!af", name = "F", descriptor = "I")
    private int field3134;

    @OriginalMember(owner = "client!af", name = "R", descriptor = "I")
    private int field3146;

    @OriginalMember(owner = "client!af", name = "P", descriptor = "I")
    private int field3144;

    @OriginalMember(owner = "client!af", name = "O", descriptor = "I")
    private int field3143;

    @OriginalMember(owner = "client!af", name = "D", descriptor = "Lc;")
    private class237 field3132;

    @OriginalMember(owner = "client!af", name = "L", descriptor = "I")
    private int field3140;

    @OriginalMember(owner = "client!af", name = "H", descriptor = "I")
    private int field3136;

    @OriginalMember(owner = "client!af", name = "z", descriptor = "[[S")
    public static short[][] field3129 = new short[][] { { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 119, 92, 66, 39, 20, 4, 955, 1845, 4032, 7101, 10178, 14272, 17341, 21433, 27581, 30651, -31811, -27717, -24640, -21581, -17603, -13383, 794, 5020, 7062, 1160, 15128, 17940, 30614, -30952, -26728, -23662, -18536, -14440, -9324, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 119, 92, 66, 39, 20, 4, 955, 1845, 4032, 7101, 10178, 14272, 17341, 21433, 27581, 30651, -31811, -27717, -24640, -21581, -17603, -13383, 794, 5020, 7062, 1160, 15128, 17940, 30614, -30952, -26728, -23662, -18536, -14440, -9324, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 119, 92, 66, 39, 20, 4, 955, 1845, 4032, 7101, 10178, 14272, 17341, 21433, 27581, 30651, -31811, -27717, -24640, -21581, -17603, -13383, 794, 5020, 7062, 1160, 15128, 17940, 30614, -30952, -26728, -23662, -18536, -14440, -9324, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 22461, -21571, 11200, 957, -10317, 5056, -31808, 123, 22453, -21579, 11191, 949, -10325, 4023, -31817, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 10347, 10582, 10429, 10407, 10359, 8414, 9540, 10456, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866 }, { 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384, 8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 13766, 13745, 13726, 13890, 13743, 13852, 17602, 18605, 21660, 24000, 24997, 24088, 27972, 25903, 26904, 27193, 27175, 27156, 30020, 28975, 29976, 12482, 13485, 10392, 10692, 10669, 10776, 6717, 6695, 7830, 6971, 6951, 5910, 3389, 3369, 3356, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866 } };

    @OriginalMember(owner = "client!af", name = "t", descriptor = "I")
    public static int field3123 = -1;

    @OriginalMember(owner = "client!af", name = "Q", descriptor = "[[I")
    public static int[][] field3145 = new int[5][5000];

    @OriginalMember(owner = "client!af", name = "r", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!af", name = "x", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!af", name = "y", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!af", name = "C", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!af", name = "E", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!af", name = "G", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!af", name = "J", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!af", name = "M", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!af", name = "N", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!af", name = "S", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!af", name = "K", descriptor = "[[B")
    public static byte[][] field3139;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIILqf;JZ)V")
    public static final void method1171(int arg0, int arg1, int arg2, int arg3, class13 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class17 var8 = new class17();
        var8.field153 = arg4;
        var8.field147 = arg1 * 128 + 64;
        var8.field150 = arg2 * 128 + 64;
        var8.field151 = arg3;
        var8.field148 = arg5;
        if (class254.field4395[arg0][arg1][arg2] == null) {
            class254.field4395[arg0][arg1][arg2] = new class177(arg0, arg1, arg2);
        }
        class254.field4395[arg0][arg1][arg2].field3101 = var8;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIB)V")
    public final void method47(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.method1175(-10858, (arg1 + (arg0 - arg1 >> 1)) * 128 + 64, ((-arg3 + arg2 >> 1) + arg3) * 128 + 64);
        if (arg4 != -83) {
            method1171(43, 5, 52, 50, null, 63L, false);
        }
        field3147++;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "()I")
    public final int method43() {
        field3138++;
        return this.field3125;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILhh;II)V")
    public static final void method1172(int arg0, class121 arg1, int arg2, int arg3) {
        if ((arg3 & 0x100) != 0) {
            int var4 = class112.field1815.method743(arg0 - 30935);
            int var5 = class112.field1815.method758(true);
            arg1.method92(var5, -1, var4, class133.field2326);
        }
        if ((arg3 & 0x40) != 0) {
            arg1.field227 = class112.field1815.method751((byte) -85);
            if (arg1.field227.method1110(arg0 ^ 0xFF, 0) == 126) {
                arg1.field227 = arg1.field227.method1120(1, arg0 ^ 0x59);
                class229.method1475(arg1.field2000, arg1.field227, -1, 2);
            } else if (class7.field85 == arg1) {
                class229.method1475(arg1.field2000, arg1.field227, -1, 2);
            }
            arg1.field185 = 150;
            arg1.field173 = 0;
            arg1.field215 = 0;
        }
        if ((arg3 & 0x20) != 0) {
            int var6 = class112.field1815.method731(false);
            int var7 = class112.field1815.method762(false);
            if (var6 == 65535) {
                var6 = -1;
            }
            class134.method905(arg1, var7, var6, -17431);
        }
        if ((arg3 & 0x400) != 0) {
            arg1.field167 = class112.field1815.method743(-30935);
            arg1.field210 = class112.field1815.method758(true);
            arg1.field176 = class112.field1815.method758(true);
            arg1.field201 = class112.field1815.method778(128);
            arg1.field214 = class112.field1815.method766(22102) + class133.field2326;
            arg1.field209 = class112.field1815.method731(false) + class133.field2326;
            arg1.field178 = class112.field1815.method762(false);
            arg1.field220 = 0;
            arg1.field228 = 1;
        }
        if ((arg3 & 0x10) != 0) {
            arg1.field207 = class112.field1815.method766(22102);
            arg1.field175 = class112.field1815.method731(false);
        }
        if ((arg3 & 0x1) != 0) {
            int var8 = class112.field1815.method731(false);
            int var9 = class112.field1815.method762(false);
            int var10 = class112.field1815.method743(-30935);
            int var11 = class112.field1815.field1821;
            boolean var12 = (var8 & 0x8000) != 0;
            if (arg1.field2000 != null && arg1.field2001 != null) {
                long var13 = arg1.field2000.method1084(32383);
                boolean var15 = false;
                if (var9 <= 1) {
                    if (!var12 && (class17.field155 == 1 || class95.field1501 == 1)) {
                        var15 = true;
                    } else {
                        for (int var16 = 0; var16 < class173.field3024; var16++) {
                            if (class150.field2626[var16] == var13) {
                                var15 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var15 && class129.field2159 == 0) {
                    class111.field1777.field1821 = 0;
                    int var17 = -1;
                    class112.field1815.method754(0, -4, var10, class111.field1777.field1780);
                    class111.field1777.field1821 = 0;
                    class168 var19;
                    if (var12) {
                        var8 &= 0x7FFF;
                        class34 var18 = class227.method1471(false, class111.field1777);
                        var17 = var18.field421;
                        var19 = var18.field419.method1481((byte) -112, class111.field1777);
                    } else {
                        var19 = class136.method933(class47.method319(32767, class111.field1777).method1103(false));
                    }
                    arg1.field227 = var19.method1086((byte) -125);
                    arg1.field185 = 150;
                    arg1.field215 = var8 >> 8;
                    arg1.field173 = var8 & 0xFF;
                    if (var9 == 2) {
                        class94.method626(class50.method347(2, new class168[] { class163.field2796, arg1.field2000 }), (byte) 79, null, var12 ? 17 : 1, var17, var19);
                    } else if (var9 == 1) {
                        class94.method626(class50.method347(arg0 + 2, new class168[] { class116.field1896, arg1.field2000 }), (byte) 127, null, var12 ? 17 : 1, var17, var19);
                    } else {
                        class94.method626(arg1.field2000, (byte) 107, null, var12 ? 17 : 2, var17, var19);
                    }
                }
            }
            class112.field1815.field1821 = var11 + var10;
        }
        field3121++;
        if ((arg3 & 0x80) != arg0) {
            int var20 = class112.field1815.method758(true);
            int var21 = class112.field1815.method778(arg0 + 128);
            arg1.method92(var21, -1, var20, class133.field2326);
            arg1.field191 = class133.field2326 + 300;
            arg1.field199 = class112.field1815.method758(true);
        }
        if ((arg3 & 0x200) != 0) {
            arg1.field198 = class112.field1815.method766(arg0 + 22102);
            int var22 = class112.field1815.method767(-122);
            arg1.field156 = (var22 & 0xFFFF) + class133.field2326;
            arg1.field183 = 0;
            arg1.field217 = 0;
            if (class133.field2326 < arg1.field156) {
                arg1.field183 = -1;
            }
            arg1.field218 = var22 >> 16;
            if (arg1.field198 == 65535) {
                arg1.field198 = -1;
            }
        }
        if ((arg3 & 0x2) != 0) {
            arg1.field181 = class112.field1815.method772((byte) -50);
            if (arg1.field181 == 65535) {
                arg1.field181 = -1;
            }
        }
        if ((arg3 & 0x8) == 0) {
            return;
        }
        int var23 = class112.field1815.method778(arg0 + 128);
        byte[] var24 = new byte[var23];
        class112 var25 = new class112(var24);
        class112.field1815.method736(var24, (byte) -85, 0, var23);
        class229.field3902[arg2] = var25;
        arg1.method829(var25, 0);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILqe;)Z")
    public static final boolean method1173(int arg0, class168 arg1) {
        field3131++;
        try {
            int var2 = arg1.method1098(-29592, 44);
            if (var2 == -1) {
                return false;
            }
            class168 var3 = arg1.method1078(0, (byte) -75, var2);
            class168 var4 = arg1.method1120(var2 + 1, arg0 ^ 0x11F8);
            MessageDigest var5 = MessageDigest.getInstance("SHA");
            var5.reset();
            var5.update(var3.method1081(117));
            byte[] var6 = var5.digest();
            byte[] var7 = var4.method1096(1);
            class112 var8 = new class112(5000);
            var8.method725(0, var7.length, var7, arg0 ^ 0x72D0948D);
            if (arg0 != 4501) {
                return false;
            }
            var8.field1821 = 0;
            var8.method732(class237.field4048, class60.field828, -3);
            if (var8.field1780[0] != 1) {
                return false;
            }
            for (int var9 = 0; var9 < 20; var9++) {
                if (var8.field1780[var9 + 1] != var6[var9]) {
                    return false;
                }
            }
            return true;
        } catch (Exception var10) {
            return false;
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V")
    public static void method1174(int arg0) {
        field3129 = null;
        field3139 = null;
        if (arg0 == 11200) {
            field3145 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(III)V")
    private final void method1175(int arg0, int arg1, int arg2) {
        if (arg0 != -10858) {
            return;
        }
        if (this.field3132 != null) {
            int var4 = class133.field2326 - this.field3136;
            if (var4 > 100 && this.field3132.field4060 > 0) {
                int var5 = this.field3132.field4065.length - this.field3132.field4060;
                while (var5 > this.field3140 && var4 > this.field3132.field4069[this.field3140]) {
                    var4 -= this.field3132.field4069[this.field3140];
                    this.field3140++;
                }
                if (this.field3140 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field3132.field4065.length; var7++) {
                        var6 += this.field3132.field4069[var7];
                    }
                    var4 %= var6;
                }
            }
            label61: {
                do {
                    do {
                        if (var4 <= this.field3132.field4069[this.field3140]) {
                            break label61;
                        }
                        class122.method830(false, (byte) 122, this.field3140, arg1, arg2, this.field3132);
                        var4 -= this.field3132.field4069[this.field3140];
                        this.field3140++;
                    } while (this.field3132.field4065.length > this.field3140);
                    this.field3140 -= this.field3132.field4060;
                } while (this.field3140 >= 0 && this.field3132.field4065.length > this.field3140);
                this.field3132 = null;
            }
            this.field3136 = class133.field2326 - var4;
        }
        field3128++;
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(I)Lqf;")
    private final class13 method1176(int arg0) {
        field3135++;
        if (arg0 != 20341) {
            field3139 = null;
        }
        return this.method1178(false, -2121);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BI)V")
    public static final void method1177(byte arg0, int arg1) {
        field3142++;
        if (arg0 != -105) {
            field3129 = null;
        }
        class204 var2 = class62.field845;
        synchronized (class62.field845) {
            class123.field2026 = arg1;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method49(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field3127++;
        class13 var11 = this.method1176(20341);
        if (var11 != null) {
            var11.method49(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field3125 = var11.method43();
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZI)Lqf;")
    private final class13 method1178(boolean arg0, int arg1) {
        field3141++;
        if (arg1 != -2121) {
            method1172(124, null, 115, 48);
        }
        boolean var3 = class62.field849 != class23.field275;
        class70 var4 = class190.method1232(this.field3146, 13090);
        if (var4.field1069 != null) {
            var4 = var4.method471(true);
        }
        if (var4 == null) {
            return null;
        }
        int var5 = this.field3122 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var6 = var4.field1059;
            var7 = var4.field1048;
        } else {
            var6 = var4.field1048;
            var7 = var4.field1059;
        }
        int var8 = (var7 + 1 >> 1) + this.field3126;
        int var9 = (var6 >> 1) + this.field3134;
        int var10 = (var6 + 1 >> 1) + this.field3134;
        int var11 = this.field3126 + (var7 >> 1);
        this.method1175(-10858, var11 * 128, var9 * 128);
        boolean var12 = !var3 && var4.field1051 && (this.field3130 != var4.field1073 || this.field3140 != this.field3124 && class112.field1781 >= 2);
        if (arg0 && !var12) {
            return null;
        }
        int[][] var13 = class23.field275[this.field3144];
        int var14 = var13[var8][var9] + var13[var11][var9] + var13[var8][var10] + var13[var11][var10] >> 2;
        int[][] var15 = null;
        if (var3) {
            var15 = class62.field849[0];
        } else if (this.field3144 < 3) {
            var15 = class23.field275[this.field3144 + 1];
        }
        int var16 = (this.field3134 << 7) + (var6 << 6);
        int var17 = (this.field3126 << 7) + (var7 << 6);
        class164 var18;
        if (this.field3132 == null) {
            var18 = var4.method478(var12, false, this.field3143, this.field3137, var14, var15, var16, var13, var17, this.field3122, (byte) 115);
        } else {
            var18 = var4.method476(var13, this.field3132, var15, this.field3143, (byte) -33, this.field3122, var16, var17, var12, this.field3140, var14, this.field3137);
        }
        return var18 == null ? null : var18.field2805;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(IIIIIIIZLqf;)V")
    public class178(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class13 arg8) {
        this.field3122 = arg2;
        this.field3126 = arg4;
        this.field3134 = arg5;
        this.field3146 = arg0;
        this.field3144 = arg3;
        this.field3143 = arg1;
        if (arg6 != -1) {
            this.field3132 = class213.method1370(-1, arg6);
            this.field3140 = 0;
            this.field3136 = class133.field2326 - 1;
            if (this.field3132.field4044 == 0 && arg8 != null && arg8 instanceof class178) {
                class178 var10 = (class178) arg8;
                if (this.field3132 == var10.field3132) {
                    this.field3140 = var10.field3140;
                    this.field3136 = var10.field3136;
                    return;
                }
            }
            if (arg7 && this.field3132.field4060 != -1) {
                this.field3140 = (int) (Math.random() * (double) this.field3132.field4065.length);
                this.field3136 -= (int) (Math.random() * (double) this.field3132.field4069[this.field3140]);
                return;
            }
        }
    }
}
