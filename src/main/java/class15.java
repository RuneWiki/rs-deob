import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class15 {

    @OriginalMember(owner = "client!c", name = "b", descriptor = "Lv;")
    public static class146 field236 = class159.method1226((byte) -37, "lila:");

    @OriginalMember(owner = "client!c", name = "a", descriptor = "Lv;")
    public static class146 field235 = class159.method1226((byte) -37, " Sekunde(Xn(Y -Ubertragen)3");

    @OriginalMember(owner = "client!c", name = "i", descriptor = "[I")
    public static int[] field243 = new int[5];

    @OriginalMember(owner = "client!c", name = "f", descriptor = "[I")
    public static int[] field240 = new int[128];

    @OriginalMember(owner = "client!c", name = "g", descriptor = "Lvf;")
    public static class152 field241 = new class152();

    @OriginalMember(owner = "client!c", name = "m", descriptor = "I")
    public static int field247 = 500;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "[[S")
    public static short[][] field248 = new short[][] { { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 4, 12, 24, 37, 49, 61, 74, 86, -25437, -26445, -27450, 9694, 21824, 123, 111, 99, 17814, 16801, 17837, 16697, 7341, 7496, 5330, 7384, 5268, 3230, 2223, 72, 10277, 8377, 8394, 7384, -22370, -22221, -22196, -22314, -29637, -27434, -29604, -25491, 662, 796, 933, 819, 10258, 6430, 5425, 5314, 10917, 10925, 10935, 10471, 10258, 10524, 10415, 10301, -11108, -11093, -11203, -8034, -5839, -6836, -5934, -32674, -14444, -15455, -15697, -15557, -15424, -11622, -11601, -11450, 7054, 7079, 5056, 6988, 8481, -30054, -30159, -30019, -21734, -21845, -21707, -21690, -21564, -24921, -24775, -24640, 662, 794, 811, 945, 827, 957, 5425, 5314, 11032, 10921, 11183, 11069, 11200, 4775, 3891, 3904, -18792, -19799, -20807, -20677, -20534, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 20366, 21274, 21415, 20401, 6569, 7613, 7630, 6364, 4300, 8412, 3294, 4193, 3303, 123, 111, 99, 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, 14990, 14746, 15779, 15795, 15944, 662, 796, 941, 951, 148, 6936, 5675, 5440, 10014, 11179, 11197, 10894, 10776, 10661, 10795, 10419, -10984, -11095, -11072, 12998, 12731, 11718, -6838, -32318, 4, 12, 24, 37, 49, 61, 74, 86 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 4, 12, 24, 37, 49, 61, 74, 86, -25437, -26445, -27450, 9694, 21824, 123, 111, 99, 17814, 16801, 17837, 16697, 7341, 7496, 5330, 7384, 5268, 3230, 2223, 72, 10277, 8377, 8394, 7384, -22370, -22221, -22196, -22314, -29637, -27434, -29604, -25491, 662, 796, 933, 819, 10258, 6430, 5425, 5314, 10917, 10925, 10935, 10471, 10258, 10524, 10415, 10301, -11108, -11093, -11203, -8034, -5839, -6836, -5934, -32674, -14444, -15455, -15697, -15557, -15424, -11622, -11601, -11450, 7054, 7079, 5056, 6988, 8481, -30054, -30159, -30019, -21734, -21845, -21707, -21690, -21564, -24921, -24775, -24640, 662, 794, 811, 945, 827, 957, 5425, 5314, 11032, 10921, 11183, 11069, 11200, 4775, 3891, 3904, -18792, -19799, -20807, -20677, -20534, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 20366, 21274, 21415, 20401, 6569, 7613, 7630, 6364, 4300, 8412, 3294, 4193, 3303, 123, 111, 99, 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, 14990, 14746, 15779, 15795, 15944, 662, 796, 941, 951, 148, 6936, 5675, 5440, 10014, 11179, 11197, 10894, 10776, 10661, 10795, 10419, -10984, -11095, -11072, 12998, 12731, 11718, -6838, -32318, 4, 12, 24, 37, 49, 61, 74, 86 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 4, 12, 24, 37, 49, 61, 74, 86, -25437, -26445, -27450, 9694, 21824, 123, 111, 99, 17814, 16801, 17837, 16697, 7341, 7496, 5330, 7384, 5268, 3230, 2223, 72, 10277, 8377, 8394, 7384, -22370, -22221, -22196, -22314, -29637, -27434, -29604, -25491, 662, 796, 933, 819, 10258, 6430, 5425, 5314, 10917, 10925, 10935, 10471, 10258, 10524, 10415, 10301, -11108, -11093, -11203, -8034, -5839, -6836, -5934, -32674, -14444, -15455, -15697, -15557, -15424, -11622, -11601, -11450, 7054, 7079, 5056, 6988, 8481, -30054, -30159, -30019, -21734, -21845, -21707, -21690, -21564, -24921, -24775, -24640, 662, 794, 811, 945, 827, 957, 5425, 5314, 11032, 10921, 11183, 11069, 11200, 4775, 3891, 3904, -18792, -19799, -20807, -20677, -20534, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 20366, 21274, 21415, 20401, 6569, 7613, 7630, 6364, 4300, 8412, 3294, 4193, 3303, 123, 111, 99, 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, 14990, 14746, 15779, 15795, 15944, 662, 796, 941, 951, 148, 6936, 5675, 5440, 10014, 11179, 11197, 10894, 10776, 10661, 10795, 10419, -10984, -11095, -11072, 12998, 12731, 11718, -6838, -32318, 4, 12, 24, 37, 49, 61, 74, 86 }, { 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384, 8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 12, 24, 37, 49, 61, 74, 86, -25437, -26445, -27450, 9694, 21824, 123, 111, 99, 17814, 16801, 17837, 16697, 7341, 7496, 5330, 7384, 5268, 3230, 2223, 72, 10277, 8377, 8394, 7384, -22370, -22221, -22196, -22314, -29637, -27434, -29604, -25491, 662, 796, 933, 819, 10258, 6430, 5425, 5314, 10917, 10925, 10935, 10471, 10258, 10524, 10415, 10301, -11108, -11093, -11203, -8034, -5839, -6836, -5934, -32674, -14444, -15455, -15697, -15557, -15424, -11622, -11601, -11450, 7054, 7079, 5056, 6988, 8481, -30054, -30159, -30019, -21734, -21845, -21707, -21690, -21564, -24921, -24775, -24640, 662, 794, 811, 945, 827, 957, 5425, 5314, 11032, 10921, 11183, 11069, 11200, 4775, 3891, 3904, -18792, -19799, -20807, -20677, -20534, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 20366, 21274, 21415, 20401, 6569, 7613, 7630, 6364, 4300, 8412, 3294, 4193, 3303, 123, 111, 99, 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, 14990, 14746, 15779, 15795, 15944, 662, 796, 941, 951, 148, 6936, 5675, 5440, 10014, 11179, 11197, 10894, 10776, 10661, 10795, 10419, -10984, -11095, -11072, 12998, 12731, 11718, -6838, -32318, 4, 12, 24, 37, 49, 61, 74, 86 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 22461, -21571, 11200, 957, -10317, 5056, -31808, 123, 22453, -21579, 11191, 949, -10325, 4023, -31817, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 20366, 20401, 662, 827, 7054, 5056, -21734, -21564, -14444, -15424, 11032, 11200, 4, 123, 61, -18792, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 8412, 8301, 8076, 6936, 5675, 941, 5056, 15795, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };

    @OriginalMember(owner = "client!c", name = "p", descriptor = "Lv;")
    public static class146 field250 = class159.method1226((byte) -37, "sl_flags");

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "Ldc;")
    public static class25 field251;

    @OriginalMember(owner = "client!c", name = "o", descriptor = "Lab;")
    public static class3 field249;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field245;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "Z")
    public static boolean field246;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I[BLne;)V")
    public final void method91(int arg0, byte[] arg1, class95 arg2) {
        field239++;
        if (arg2.field2320[arg2.field2304] != 31 || arg2.field2320[arg2.field2304 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field245 == null) {
            this.field245 = new Inflater(true);
        }
        try {
            this.field245.setInput(arg2.field2320, arg2.field2304 + 10, -arg2.field2304 - 8 + arg2.field2320.length + arg0);
            this.field245.inflate(arg1);
        } catch (Exception var4) {
            this.field245.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field245.reset();
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
    public static void method92(int arg0) {
        field235 = null;
        if (arg0 != 5056) {
            method94(16, null);
        }
        field251 = null;
        field248 = null;
        field240 = null;
        field236 = null;
        field250 = null;
        field241 = null;
        field249 = null;
        field243 = null;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
    public static final void method93(int arg0) {
        field238++;
        class2.method9(2);
        class12.method71(arg0 - 10178);
        class142.method1057(true);
        class5.method44(-119);
        class60.method422(-3);
        class9.method66(false);
        class5.method39(42);
        class121.method918(false);
        class90.method709((byte) -61);
        class46.method318(arg0 - 10164);
        class83.method630(-117);
        class117.method895(1);
        ((class49) class45.field1046).method342((byte) -57);
        class79.field1930.method1050(true);
        if (arg0 != 10266) {
            field240 = null;
        }
        class158.field3635.method591(6);
        class40.field878.method591(arg0 ^ 0x281C);
        class82.field1989.method591(6);
        field251.method591(6);
        class8.field163.method591(6);
        class60.field1377.method591(6);
        class155.field3546.method591(6);
        class3.field89.method591(arg0 - 10260);
        class68.field1557.method591(6);
        class22.field363.method591(6);
        class115.field2689.method591(6);
        class76.field1815.method591(arg0 - 10260);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILef;)V")
    public static final void method94(int arg0, class35 arg1) {
        field242++;
        arg1.field758 = false;
        if (arg1.field809 != -1) {
            class72 var2 = class141.method1052(true, arg1.field809);
            if (var2 == null || var2.field1651 == null) {
                arg1.field809 = -1;
            } else {
                arg1.field772++;
                if (var2.field1651.length > arg1.field793 && arg1.field772 > var2.field1680[arg1.field793]) {
                    arg1.field793++;
                    arg1.field772 = 1;
                    class87.method698(arg1.field793, var2, arg1.field757, (byte) 86, arg1.field790);
                }
                if (arg1.field793 >= var2.field1651.length) {
                    arg1.field793 = 0;
                    arg1.field772 = 0;
                    class87.method698(arg1.field793, var2, arg1.field757, (byte) 86, arg1.field790);
                }
            }
        }
        if (arg1.field817 != -1 && class94.field2229 >= arg1.field764) {
            if (arg1.field804 < 0) {
                arg1.field804 = 0;
            }
            int var3 = class100.method830(arg1.field817, -18626).field2710;
            if (var3 == -1) {
                arg1.field817 = -1;
            } else {
                class72 var4 = class141.method1052(true, var3);
                if (var4 == null || var4.field1651 == null) {
                    arg1.field817 = -1;
                } else {
                    arg1.field759++;
                    if (var4.field1651.length > arg1.field804 && arg1.field759 > var4.field1680[arg1.field804]) {
                        arg1.field759 = 1;
                        arg1.field804++;
                        class87.method698(arg1.field804, var4, arg1.field757, (byte) 86, arg1.field790);
                    }
                    if (var4.field1651.length <= arg1.field804 && (arg1.field804 < 0 || arg1.field804 >= var4.field1651.length)) {
                        arg1.field817 = -1;
                    }
                }
            }
        }
        if (arg1.field753 != -1 && arg1.field791 <= 1) {
            class72 var5 = class141.method1052(true, arg1.field753);
            if (var5.field1669 == 1 && arg1.field773 > 0 && arg1.field766 <= class94.field2229 && arg1.field803 < class94.field2229) {
                arg1.field791 = 1;
                return;
            }
        }
        if (arg1.field753 != arg0 && arg1.field791 == 0) {
            class72 var6 = class141.method1052(true, arg1.field753);
            if (var6 == null || var6.field1651 == null) {
                arg1.field753 = -1;
            } else {
                arg1.field789++;
                if (arg1.field747 < var6.field1651.length && arg1.field789 > var6.field1680[arg1.field747]) {
                    arg1.field789 = 1;
                    arg1.field747++;
                    class87.method698(arg1.field747, var6, arg1.field757, (byte) 86, arg1.field790);
                }
                if (var6.field1651.length <= arg1.field747) {
                    arg1.field747 -= var6.field1682;
                    arg1.field799++;
                    if (arg1.field799 >= var6.field1671) {
                        arg1.field753 = -1;
                    } else if (arg1.field747 >= 0 && var6.field1651.length > arg1.field747) {
                        class87.method698(arg1.field747, var6, arg1.field757, (byte) 86, arg1.field790);
                    } else {
                        arg1.field753 = -1;
                    }
                }
                arg1.field758 = var6.field1653;
            }
        }
        if (arg1.field791 > 0) {
            arg1.field791--;
        }
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
    public class15() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(III)V")
    private class15(int arg0, int arg1, int arg2) {
    }
}
