import java.awt.Canvas;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class156 extends class76 {

    @OriginalMember(owner = "client!db", name = "lb", descriptor = "I")
    private int field2725 = 16;

    @OriginalMember(owner = "client!db", name = "kb", descriptor = "I")
    private int field2724 = 0;

    @OriginalMember(owner = "client!db", name = "qb", descriptor = "I")
    private int field2730 = 4096;

    @OriginalMember(owner = "client!db", name = "cb", descriptor = "I")
    private int field2716 = 0;

    @OriginalMember(owner = "client!db", name = "sb", descriptor = "I")
    private int field2732 = 2000;

    @OriginalMember(owner = "client!db", name = "Y", descriptor = "I")
    public static int field2712 = 5063219;

    @OriginalMember(owner = "client!db", name = "fb", descriptor = "[Lse;")
    public static class12[] field2719 = new class12[4];

    @OriginalMember(owner = "client!db", name = "pb", descriptor = "I")
    public static int field2729 = 0;

    @OriginalMember(owner = "client!db", name = "tb", descriptor = "Lia;")
    private static class257 field2733 = class28.method234(-27, "scroll:");

    @OriginalMember(owner = "client!db", name = "ib", descriptor = "Lia;")
    public static class257 field2722 = field2733;

    @OriginalMember(owner = "client!db", name = "jb", descriptor = "Lia;")
    public static class257 field2723 = field2733;

    @OriginalMember(owner = "client!db", name = "bb", descriptor = "Lw;")
    public static class82 field2715 = new class82(64);

    @OriginalMember(owner = "client!db", name = "ub", descriptor = "Lia;")
    public static class257 field2734 = class28.method234(86, "Mitglieder)2Welt");

    @OriginalMember(owner = "client!db", name = "yb", descriptor = "I")
    public static int field2738 = 0;

    @OriginalMember(owner = "client!db", name = "zb", descriptor = "Lia;")
    private static class257 field2739 = class28.method234(-20, "level)2");

    @OriginalMember(owner = "client!db", name = "Ab", descriptor = "[[S")
    public static short[][] field2740 = new short[][] { { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 119, 92, 66, 39, 20, 4, 955, 1845, 4032, 7101, 10178, 14272, 17341, 21433, 27581, 30651, -31811, -27717, -24640, -21581, -17603, -13383, 794, 5020, 7062, 1160, 15128, 17940, 30614, -30952, -26728, -23662, -18536, -14440, -9324, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 119, 92, 66, 39, 20, 4, 955, 1845, 4032, 7101, 10178, 14272, 17341, 21433, 27581, 30651, -31811, -27717, -24640, -21581, -17603, -13383, 794, 5020, 7062, 1160, 15128, 17940, 30614, -30952, -26728, -23662, -18536, -14440, -9324, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 119, 92, 66, 39, 20, 4, 955, 1845, 4032, 7101, 10178, 14272, 17341, 21433, 27581, 30651, -31811, -27717, -24640, -21581, -17603, -13383, 794, 5020, 7062, 1160, 15128, 17940, 30614, -30952, -26728, -23662, -18536, -14440, -9324, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 22461, -21571, 11200, 957, -10317, 5056, -31808, 123, 22453, -21579, 11191, 949, -10325, 4023, -31817, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 10347, 10582, 10429, 10407, 10359, 8414, 9540, 10456, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866 }, { 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384, 8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 13766, 13745, 13726, 13890, 13743, 13852, 17602, 18605, 21660, 24000, 24997, 24088, 27972, 25903, 26904, 27193, 27175, 27156, 30020, 28975, 29976, 12482, 13485, 10392, 10692, 10669, 10776, 6717, 6695, 7830, 6971, 6951, 5910, 3389, 3369, 3356, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866 } };

    @OriginalMember(owner = "client!db", name = "vb", descriptor = "I")
    public static int field2735 = 0;

    @OriginalMember(owner = "client!db", name = "Bb", descriptor = "I")
    public static int field2741 = -1;

    @OriginalMember(owner = "client!db", name = "Cb", descriptor = "I")
    public static int field2742 = 0;

    @OriginalMember(owner = "client!db", name = "wb", descriptor = "Z")
    public static boolean field2736 = false;

    @OriginalMember(owner = "client!db", name = "xb", descriptor = "Lia;")
    public static class257 field2737 = field2739;

    @OriginalMember(owner = "client!db", name = "Db", descriptor = "Lia;")
    public static class257 field2743 = class28.method234(-116, " loggt sich ein)3");

    @OriginalMember(owner = "client!db", name = "Z", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!db", name = "ab", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!db", name = "db", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!db", name = "eb", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!db", name = "gb", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!db", name = "hb", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!db", name = "mb", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!db", name = "nb", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!db", name = "rb", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!db", name = "ob", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field2728;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIZII)V")
    public static final void method1089(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        ++field2731;
        int var7 = class34.method290(class255.field4371, arg3, class40.field834, -256);
        int var8 = class34.method290(class255.field4371, arg6, class40.field834, -256);
        int var9 = class34.method290(class145.field2540, arg1, class123.field2211, -256);
        int var10 = class34.method290(class145.field2540, arg0, class123.field2211, -256);
        int var11 = class34.method290(class255.field4371, arg3 + arg5, class40.field834, -256);
        int var12 = class34.method290(class255.field4371, -arg5 + arg6, class40.field834, -256);
        for (int var13 = var7; var11 > var13; ++var13) {
            class94.method692(class185.field3220[var13], (byte) -122, var9, arg2, var10);
        }
        if (!arg4) {
            field2715 = null;
        }
        for (int var14 = var8; var12 < var14; --var14) {
            class94.method692(class185.field3220[var14], (byte) 32, var9, arg2, var10);
        }
        int var15 = class34.method290(class145.field2540, arg1 + arg5, class123.field2211, -256);
        int var16 = class34.method290(class145.field2540, -arg5 + arg0, class123.field2211, -256);
        for (int var17 = var11; var12 >= var17; ++var17) {
            int[] var18 = class185.field3220[var17];
            class94.method692(var18, (byte) 21, var9, arg2, var15);
            class94.method692(var18, (byte) 77, var16, arg2, var10);
        }
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
    public class156() {
        super(0, true);
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(II)Lqf;")
    public static final class14 method1090(int arg0, int arg1) {
        ++field2714;
        class14 var2 = (class14) class44.field994.method836(arg1 + -121, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class20.field416.method1197(class68.method523(28305, arg0), class209.method1408(90, arg0), arg1 + -2);
            class14 var4 = new class14();
            var4.field282 = arg0;
            if (var3 != null) {
                var4.method139(-109, new class152(var3));
            }
            var4.method151(false);
            if (var4.field287 != -1) {
                var4.method141(method1090(var4.field287, 0), arg1 ^ -37, method1090(var4.field262, 0));
            }
            if (~var4.field275 != arg1) {
                var4.method153(arg1 + 1, method1090(var4.field275, 0), method1090(var4.field260, arg1));
            }
            if (!class208.field3556 && var4.field309) {
                var4.field317 = null;
                var4.field283 = 0;
                var4.field295 = class246.field4267;
                var4.field293 = null;
                var4.field270 = false;
            }
            class44.field994.method832(var4, (long) arg0, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(B)V")
    public final void method209(byte arg0) {
        ++field2721;
        class251.method1645((byte) 106);
        if (arg0 != 111) {
            field2737 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILjb;)V")
    public static final void method1091(int arg0, class107 arg1) {
        if (arg0 > -43) {
            field2738 = 67;
        }
        if (~class217.field3675 == -1 || ~class217.field3675 == -6) {
            byte var2 = 20;
            arg1.method794(class56.field1187, 382, -var2 + 245, 16777215, -1);
            int var3 = -var2 + 253;
            class23.method208(230, var3, 304, 34, 9179409);
            class23.method208(231, var3 + 1, 302, 32, 0);
            class23.method198(232, var3 - -2, class236.field4046 * 3, 30, 9179409);
            class23.method198(class236.field4046 * 3 + 232, var3 - -2, -(class236.field4046 * 3) + 300, 30, 0);
            arg1.method794(class112.field2044, 382, 276 - var2, 16777215, -1);
        }
        ++field2720;
    }

    @OriginalMember(owner = "client!db", name = "e", descriptor = "(II)Z")
    public static final boolean method1092(int arg0, int arg1) {
        if (arg1 != -1) {
            return true;
        } else {
            ++field2727;
            return ~(arg0 >> 31 & 1) != -1;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIILmb;)Z")
    public static final boolean method1093(int arg0, int arg1, int arg2, class178 arg3) {
        int var4 = -113 / ((arg1 - 24) / 51);
        ++field2717;
        byte[] var5 = arg3.method1197(arg2, arg0, -2);
        if (var5 == null) {
            return false;
        } else {
            class56.method425(var5, 97);
            return true;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lk;BI)V")
    public final void method158(class152 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (arg2 == 4) {
                            this.field2730 = arg0.method1063(-17162);
                        }
                    } else {
                        this.field2724 = arg0.method1063(-17162);
                    }
                } else {
                    this.field2725 = arg0.method1051((byte) 125);
                }
            } else {
                this.field2732 = arg0.method1063(-17162);
            }
        } else {
            this.field2716 = arg0.method1051((byte) 93);
        }
        ++field2726;
        if (arg1 >= -86) {
            this.method158((class152) null, (byte) 8, 111);
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(II)[I")
    public final int[] method169(int arg0, int arg1) {
        ++field2713;
        if (arg0 != -9351) {
            return null;
        } else {
            int[] var3 = super.field1467.method1182((byte) -48, arg1);
            if (super.field1467.field2980) {
                int var4 = this.field2730 >> 1;
                int[][] var5 = super.field1467.method1180((byte) -117);
                Random var6 = new Random((long) this.field2716);
                for (int var7 = 0; this.field2732 > var7; ++var7) {
                    int var8 = ~this.field2730 < -1 ? this.field2724 - -class8.method112(var6, this.field2730, -113) + -var4 : this.field2724;
                    int var9 = class8.method112(var6, class96.field1807, -124);
                    int var10 = class8.method112(var6, class13.field249, -125);
                    int var11 = (4093 & var8) >> 4;
                    int var12 = (class106.field1962[var11] * this.field2725 >> 12) + var9;
                    int var13 = (class205.field3514[var11] * this.field2725 >> 12) + var10;
                    int var14 = var13 - var10;
                    int var15 = -var9 + var12;
                    if (~var15 != -1 || var14 != 0) {
                        if (~var15 > -1) {
                            var15 = -var15;
                        }
                        if (var14 < 0) {
                            var14 = -var14;
                        }
                        boolean var16 = var14 > var15;
                        if (var16) {
                            int var17 = var9;
                            var9 = var10;
                            var10 = var17;
                            int var18 = var12;
                            var12 = var13;
                            var13 = var18;
                        }
                        if (var12 < var9) {
                            int var19 = var9;
                            var9 = var12;
                            int var20 = var10;
                            var10 = var13;
                            var12 = var19;
                            var13 = var20;
                        }
                        int var21 = var12 - var9;
                        int var22 = var10;
                        int var23 = -var10 + var13;
                        int var24 = -var21 / 2;
                        if (var23 < 0) {
                            var23 = -var23;
                        }
                        int var25 = 2048 / var21;
                        int var26 = 1024 - (class8.method112(var6, 4096, arg0 + 9226) >> 2);
                        int var27 = var13 <= var10 ? -1 : 1;
                        for (int var28 = var9; var12 > var28; ++var28) {
                            var24 += var23;
                            int var29 = var26 - (-1024 - (var28 - var9) * var25);
                            int var30 = class157.field2753 & var28;
                            int var31 = class105.field1950 & var22;
                            if (!var16) {
                                var5[var30][var31] = var29;
                            } else {
                                var5[var31][var30] = var29;
                            }
                            if (var24 > 0) {
                                var22 -= -var27;
                                var24 -= var21;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(B)V")
    public static void method1094(byte arg0) {
        field2733 = null;
        field2743 = null;
        field2719 = null;
        field2723 = null;
        field2728 = null;
        if (arg0 != -125) {
            field2741 = -4;
        }
        field2734 = null;
        field2737 = null;
        field2722 = null;
        field2715 = null;
        field2740 = null;
        field2739 = null;
    }
}
