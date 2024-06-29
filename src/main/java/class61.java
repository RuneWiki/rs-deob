import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class61 extends class53 {

    @OriginalMember(owner = "client!hl", name = "P", descriptor = "I")
    private int field1067 = 819;

    @OriginalMember(owner = "client!hl", name = "Q", descriptor = "I")
    private int field1068 = 1024;

    @OriginalMember(owner = "client!hl", name = "cb", descriptor = "I")
    private int field1080 = 1024;

    @OriginalMember(owner = "client!hl", name = "W", descriptor = "I")
    private int field1074 = 409;

    @OriginalMember(owner = "client!hl", name = "T", descriptor = "I")
    private int field1071 = 0;

    @OriginalMember(owner = "client!hl", name = "X", descriptor = "I")
    private int field1075 = 1024;

    @OriginalMember(owner = "client!hl", name = "M", descriptor = "I")
    private int field1064 = 2048;

    @OriginalMember(owner = "client!hl", name = "hb", descriptor = "I")
    private int field1085 = 1024;

    @OriginalMember(owner = "client!hl", name = "kb", descriptor = "I")
    private int field1088 = 0;

    @OriginalMember(owner = "client!hl", name = "O", descriptor = "I")
    public static int field1066 = 0;

    @OriginalMember(owner = "client!hl", name = "fb", descriptor = "Lwa;")
    public static class75 field1083 = class66.method560(" )2> ", false);

    @OriginalMember(owner = "client!hl", name = "R", descriptor = "I")
    public static int field1069 = -1;

    @OriginalMember(owner = "client!hl", name = "V", descriptor = "[[S")
    public static short[][] field1073 = new short[][] { { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 119, 92, 66, 39, 20, 4, 955, 1845, 4032, 7101, 10178, 14272, 17341, 21433, 27581, 30651, -31811, -27717, -24640, -21581, -17603, -13383, 794, 5020, 7062, 1160, 15128, 17940, 30614, -30952, -26728, -23662, -18536, -14440, -9324, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 119, 92, 66, 39, 20, 4, 955, 1845, 4032, 7101, 10178, 14272, 17341, 21433, 27581, 30651, -31811, -27717, -24640, -21581, -17603, -13383, 794, 5020, 7062, 1160, 15128, 17940, 30614, -30952, -26728, -23662, -18536, -14440, -9324, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 119, 92, 66, 39, 20, 4, 955, 1845, 4032, 7101, 10178, 14272, 17341, 21433, 27581, 30651, -31811, -27717, -24640, -21581, -17603, -13383, 794, 5020, 7062, 1160, 15128, 17940, 30614, -30952, -26728, -23662, -18536, -14440, -9324, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 22461, -21571, 11200, 957, -10317, 5056, -31808, 123, 22453, -21579, 11191, 949, -10325, 4023, -31817, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 10347, 10582, 10429, 10407, 10359, 8414, 9540, 10456, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866 }, { 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384, 8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 13766, 13745, 13726, 13890, 13743, 13852, 17602, 18605, 21660, 24000, 24997, 24088, 27972, 25903, 26904, 27193, 27175, 27156, 30020, 28975, 29976, 12482, 13485, 10392, 10692, 10669, 10776, 6717, 6695, 7830, 6971, 6951, 5910, 3389, 3369, 3356, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866 } };

    @OriginalMember(owner = "client!hl", name = "eb", descriptor = "I")
    public static int field1082 = 0;

    @OriginalMember(owner = "client!hl", name = "jb", descriptor = "Lwa;")
    public static class75 field1087 = class66.method560("::fpsoff", false);

    @OriginalMember(owner = "client!hl", name = "lb", descriptor = "J")
    public static long field1089 = 0L;

    @OriginalMember(owner = "client!hl", name = "S", descriptor = "I")
    public static int field1070 = 0;

    @OriginalMember(owner = "client!hl", name = "Y", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!hl", name = "Z", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!hl", name = "ab", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!hl", name = "bb", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!hl", name = "db", descriptor = "I")
    private int field1081;

    @OriginalMember(owner = "client!hl", name = "gb", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!hl", name = "ib", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!hl", name = "mb", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!hl", name = "nb", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!hl", name = "N", descriptor = "Lre;")
    public static class262 field1065;

    @OriginalMember(owner = "client!hl", name = "U", descriptor = "[Lbh;")
    public static class258[] field1072;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "(I)[Lcm;", line = 5)
    public static final class181[] method537(int arg0) {
        if (arg0 != 9907) {
            return (class181[]) null;
        }
        field1078++;
        class181[] var1 = new class181[class149.field2563];
        for (int var2 = 0; var2 < class149.field2563; var2++) {
            byte[] var3 = class42.field687[var2];
            int var4 = class287.field4936[var2] * class210.field3590[var2];
            int[] var5 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var5[var6] = class191.field3184[class235.method1710(255, var3[var6])];
            }
            var1[var2] = new class181(class263.field4571, class76.field1321, class85.field1404[var2], class232.field3934[var2], class210.field3590[var2], class287.field4936[var2], var5);
        }
        class235.method1713(0);
        return var1;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(B)V", line = 42)
    public final void method56(byte arg0) {
        if (arg0 == -79) {
            field1084++;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/util/Random;IIII[[II)V", line = 57)
    private final void method538(Random arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int arg6) {
        field1079++;
        int var8 = this.field1075 > 0 ? 4096 - class29.method197(arg0, true, this.field1075) : 4096;
        int var9 = this.field1081 * this.field1080 >> 12;
        int var10 = this.field1081 - (var9 <= 0 ? 0 : class29.method197(arg0, true, var9));
        if (arg3 >= class269.field4644) {
            arg3 -= class269.field4644;
        }
        if (var10 > 0) {
            if (arg4 <= 0 || arg6 <= 0) {
                return;
            }
            int var11 = arg4 / 2;
            int var12 = arg6 / 2;
            int var13 = var10 <= var12 ? var10 : var12;
            int var14 = arg3 + var13;
            int var15 = arg6 - (var13 * 2);
            int var16 = var11 >= var10 ? var10 : var11;
            for (int var17 = 0; var17 < arg4; var17++) {
                int[] var18 = arg5[arg2 + var17];
                if (var17 < var16) {
                    int var19 = var8 * var17 / var16;
                    if (this.field1071 == 0) {
                        for (int var20 = 0; var20 < var13; var20++) {
                            int var21 = var8 * var20 / var13;
                            var18[class235.method1710(class157.field2697, arg3 + var20)] = var18[class235.method1710(class157.field2697, arg3 + arg6 - var20 - 1)] = var19 * var21 >> 12;
                        }
                    } else {
                        for (int var22 = 0; var22 < var13; var22++) {
                            int var23 = var8 * var22 / var13;
                            var18[class235.method1710(arg3 + var22, class157.field2697)] = var18[class235.method1710(arg3 + arg6 - (var22 - -1), class157.field2697)] = var23 >= var19 ? var19 : var23;
                        }
                    }
                    if (class269.field4644 >= var14 + var15) {
                        class231.method1691(var18, var14, var15, var19);
                    } else {
                        int var24 = class269.field4644 - var14;
                        class231.method1691(var18, var14, var24, var19);
                        class231.method1691(var18, 0, var15 - var24, var19);
                    }
                } else {
                    int var25 = arg4 - (var17 + 1);
                    if (var25 >= var16) {
                        for (int var26 = 0; var26 < var13; var26++) {
                            var18[class235.method1710(class157.field2697, arg3 + var26)] = var18[class235.method1710(class157.field2697, arg3 + arg6 - var26 - 1)] = var8 * var26 / var13;
                        }
                        if (class269.field4644 < (var14 + var15)) {
                            int var27 = class269.field4644 - var14;
                            class231.method1691(var18, var14, var27, var8);
                            class231.method1691(var18, 0, var15 - var27, var8);
                        } else {
                            class231.method1691(var18, var14, var15, var8);
                        }
                    } else {
                        int var28 = var8 * var25 / var16;
                        if (this.field1071 == 0) {
                            for (int var29 = 0; var29 < var13; var29++) {
                                int var30 = var8 * var29 / var13;
                                var18[class235.method1710(arg3 + var29, class157.field2697)] = var18[class235.method1710(arg3 + arg6 - var29 - 1, class157.field2697)] = var28 * var30 >> 12;
                            }
                        } else {
                            for (int var31 = 0; var31 < var13; var31++) {
                                int var32 = var8 * var31 / var13;
                                var18[class235.method1710(class157.field2697, arg3 + var31)] = var18[class235.method1710(class157.field2697, arg6 + arg3 - var31 - 1)] = var28 <= var32 ? var28 : var32;
                            }
                        }
                        if (class269.field4644 >= (var14 + var15)) {
                            class231.method1691(var18, var14, var15, var28);
                        } else {
                            int var33 = class269.field4644 - var14;
                            class231.method1691(var18, var14, var33, var28);
                            class231.method1691(var18, 0, var15 - var33, var28);
                        }
                    }
                }
            }
        } else if (class269.field4644 < arg3 + arg6) {
            int var34 = class269.field4644 - arg3;
            for (int var35 = 0; var35 < arg4; var35++) {
                int[] var36 = arg5[arg2 + var35];
                class231.method1691(var36, arg3, var34, var8);
                class231.method1691(var36, 0, arg6 - var34, var8);
            }
        } else {
            for (int var37 = 0; var37 < arg4; var37++) {
                class231.method1691(arg5[arg2 + var37], arg3, arg6, var8);
            }
        }
        if (arg1 != 4300) {
            field1073 = (short[][]) ((short[][]) null);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZIIILcb;Z)V", line = 254)
    public static final void method539(boolean arg0, int arg1, int arg2, int arg3, class267 arg4, boolean arg5) {
        class139.field2413 = 1;
        if (arg0) {
            field1087 = (class75) null;
        }
        class235.field3968 = arg5;
        class127.field2212 = arg4;
        class5.field57 = arg3;
        class136.field2338 = 10000;
        field1077++;
        class147.field2556 = arg2;
        class76.field1318 = arg1;
    }

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "(I)V", line = 273)
    public static void method540(int arg0) {
        field1083 = null;
        field1073 = (short[][]) null;
        field1065 = null;
        if (arg0 == 0) {
            field1087 = null;
            field1072 = null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(II)I", line = 292)
    public static final int method541(int arg0, int arg1) {
        if (arg1 != 14866) {
            field1065 = (class262) null;
        }
        field1076++;
        return (arg0 & 0x1EAFB4) >> 18;
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V", line = 745)
    public class61() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILja;Z)V", line = 348)
    public final void method54(int arg0, class60 arg1, boolean arg2) {
        if (arg0 == 0) {
            this.field1088 = arg1.method501(0);
        } else if (arg0 == 1) {
            this.field1068 = arg1.method485((byte) -2);
        } else if (arg0 == 2) {
            this.field1064 = arg1.method485((byte) -2);
        } else if (arg0 == 3) {
            this.field1074 = arg1.method485((byte) -2);
        } else if (arg0 == 4) {
            this.field1067 = arg1.method485((byte) -2);
        } else if (arg0 == 5) {
            this.field1085 = arg1.method485((byte) -2);
        } else if (arg0 == 6) {
            this.field1071 = arg1.method501(0);
        } else if (arg0 == 7) {
            this.field1080 = arg1.method485((byte) -2);
        } else if (arg0 == 8) {
            this.field1075 = arg1.method485((byte) -2);
        }
        field1091++;
        if (!arg2) {
            this.field1088 = 73;
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(II)[I", line = 426)
    public final int[] method59(int arg0, int arg1) {
        int[] var3 = this.field878.method1603(arg1, (byte) 114);
        field1086++;
        if (arg0 != -15196) {
            this.field1074 = 9;
        }
        if (!this.field878.field3749) {
            return var3;
        }
        int[][] var4 = this.field878.method1602((byte) -96);
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        boolean var9 = true;
        int var10 = 0;
        boolean var11 = true;
        int var12 = 0;
        int var13 = class269.field4644 * this.field1068 >> 12;
        int var14 = 0;
        int var15 = class269.field4644 * this.field1064 >> 12;
        int var16 = class303.field5189 * this.field1074 >> 12;
        int var17 = class303.field5189 * this.field1067 >> 12;
        if (var17 <= 1) {
            return var4[arg1];
        }
        int var18 = (class269.field4644 / var13) + 1;
        this.field1081 = class269.field4644 / 8 * this.field1085 >> 12;
        int[][] var19 = new int[var18][3];
        int[][] var20 = new int[var18][3];
        Random var21 = new Random((long) this.field1088);
        while (true) {
            while (true) {
                int var22 = var13 + class29.method197(var21, true, var15 - var13);
                int var23 = class29.method197(var21, true, var17 - var16) + var16;
                int var24 = var8 + var22;
                if (var24 > class269.field4644) {
                    var24 = class269.field4644;
                    var22 = class269.field4644 - var8;
                }
                int var25;
                if (var11) {
                    var25 = 0;
                } else {
                    int[] var26 = var20[var7];
                    int var27 = var7;
                    var25 = var26[2];
                    int var28 = 0;
                    int var29 = var5 + var24;
                    if (var29 < 0) {
                        var29 += class269.field4644;
                    }
                    if (class269.field4644 < var29) {
                        var29 -= class269.field4644;
                    }
                    while (true) {
                        int[] var30 = var20[var27];
                        if (var29 >= var30[0] && var30[1] >= var29) {
                            if (var7 != var27) {
                                int var31 = var5 + var8;
                                if (var31 < 0) {
                                    var31 += class269.field4644;
                                }
                                if (class269.field4644 < var31) {
                                    var31 -= class269.field4644;
                                }
                                for (int var32 = 1; var32 <= var28; var32++) {
                                    int[] var33 = var20[(var7 + var32) % var12];
                                    var25 = Math.max(var25, var33[2]);
                                }
                                for (int var34 = 0; var34 <= var28; var34++) {
                                    int[] var35 = var20[(var7 + var34) % var12];
                                    int var36 = var35[2];
                                    if (var25 != var36) {
                                        int var37 = var35[0];
                                        int var38 = var35[1];
                                        int var39;
                                        int var40;
                                        if (var29 > var31) {
                                            var39 = Math.max(var31, var37);
                                            var40 = Math.min(var29, var38);
                                        } else if (var37 == 0) {
                                            var40 = Math.min(var29, var38);
                                            var39 = 0;
                                        } else {
                                            var39 = Math.max(var31, var37);
                                            var40 = class269.field4644;
                                        }
                                        this.method538(var21, 4300, var36, var39 + var10, -var36 + var25, var4, var40 - var39);
                                    }
                                }
                            }
                            var7 = var27;
                            break;
                        }
                        var28++;
                        var27++;
                        if (var27 >= var12) {
                            var27 = 0;
                        }
                    }
                }
                if (class303.field5189 >= var25 + var23) {
                    var9 = false;
                } else {
                    var23 = class303.field5189 - var25;
                }
                if (class269.field4644 == var24) {
                    this.method538(var21, 4300, var25, var6 + var8, var23, var4, var22);
                    if (var9) {
                        return var3;
                    }
                    var10 = var6;
                    var9 = true;
                    var11 = false;
                    var7 = 0;
                    int[][] var42 = var20;
                    var20 = var19;
                    int[] var43 = var19[var14++];
                    var12 = var14;
                    var43[0] = var8;
                    var43[2] = var23 + var25;
                    var43[1] = var24;
                    var14 = 0;
                    var8 = 0;
                    var6 = class29.method197(var21, true, class269.field4644);
                    var5 = var6 - var10;
                    var19 = var42;
                    int var44 = var5;
                    if (var5 < 0) {
                        var44 = class269.field4644 + var5;
                    }
                    if (class269.field4644 < var44) {
                        var44 -= class269.field4644;
                    }
                    while (true) {
                        int[] var45 = var20[var7];
                        if (var44 >= var45[0] && var44 <= var45[1]) {
                            break;
                        }
                        var7++;
                        if (var7 >= var12) {
                            var7 = 0;
                        }
                    }
                } else {
                    int[] var41 = var19[var14++];
                    var41[1] = var24;
                    var41[0] = var8;
                    var41[2] = var23 + var25;
                    this.method538(var21, 4300, var25, var6 + var8, var23, var4, var22);
                    var8 = var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lcb;Lie;IZLcb;)V", line = 694)
    public static final void method542(class267 arg0, class80 arg1, int arg2, boolean arg3, class267 arg4) {
        field1090++;
        class2.field19 = arg3;
        if (arg2 != -2070355540) {
            field1070 = 10;
        }
        class191.field3186 = arg0;
        class66.field1140 = arg4;
        int var5 = class191.field3186.method1912((byte) 87) - 1;
        class259.field4343 = class191.field3186.method1914(98, var5) + var5 * 256;
        class269.field4645 = arg1;
    }
}
