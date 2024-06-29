import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class211 extends class30 {

    @OriginalMember(owner = "client!vd", name = "N", descriptor = "I")
    private int field4074 = 0;

    @OriginalMember(owner = "client!vd", name = "P", descriptor = "I")
    private int field4076 = -1;

    @OriginalMember(owner = "client!vd", name = "S", descriptor = "I")
    public static int field4079 = 255;

    @OriginalMember(owner = "client!vd", name = "X", descriptor = "[[S")
    public static short[][] field4084 = new short[][] { { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 4, 12, 24, 37, 49, 61, 74, 86, -25437, -26445, -27450, 9694, 21824, 123, 111, 99, 17814, 16801, 17837, 16697, 7341, 7496, 5330, 7384, 5268, 3230, 2223, 72, 10277, 8377, 8394, 7384, -22370, -22221, -22196, -22314, -29637, -27434, -29604, -25491, 662, 796, 933, 819, 10258, 6430, 5425, 5314, 10917, 10925, 10935, 10471, 10258, 10524, 10415, 10301, -11108, -11093, -11203, -8034, -5839, -6836, -5934, -32674, -14444, -15455, -15697, -15557, -15424, -11622, -11601, -11450, 7054, 7079, 5056, 6988, 8481, -30054, -30159, -30019, -21734, -21845, -21707, -21690, -21564, -24921, -24775, -24640, 662, 794, 811, 945, 827, 957, 5425, 5314, 11032, 10921, 11183, 11069, 11200, 4775, 3891, 3904, -18792, -19799, -20807, -20677, -20534, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 20366, 21274, 21415, 20401, 6569, 7613, 7630, 6364, 4300, 8412, 3294, 4193, 3303, 123, 111, 99, 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, 14990, 14746, 15779, 15795, 15944, 662, 796, 941, 951, 148, 6936, 5675, 5440, 10014, 11179, 11197, 10894, 10776, 10661, 10795, 10419, -10984, -11095, -11072, 12998, 12731, 11718, -6838, -32318, 4, 12, 24, 37, 49, 61, 74, 86 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 4, 12, 24, 37, 49, 61, 74, 86, -25437, -26445, -27450, 9694, 21824, 123, 111, 99, 17814, 16801, 17837, 16697, 7341, 7496, 5330, 7384, 5268, 3230, 2223, 72, 10277, 8377, 8394, 7384, -22370, -22221, -22196, -22314, -29637, -27434, -29604, -25491, 662, 796, 933, 819, 10258, 6430, 5425, 5314, 10917, 10925, 10935, 10471, 10258, 10524, 10415, 10301, -11108, -11093, -11203, -8034, -5839, -6836, -5934, -32674, -14444, -15455, -15697, -15557, -15424, -11622, -11601, -11450, 7054, 7079, 5056, 6988, 8481, -30054, -30159, -30019, -21734, -21845, -21707, -21690, -21564, -24921, -24775, -24640, 662, 794, 811, 945, 827, 957, 5425, 5314, 11032, 10921, 11183, 11069, 11200, 4775, 3891, 3904, -18792, -19799, -20807, -20677, -20534, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 20366, 21274, 21415, 20401, 6569, 7613, 7630, 6364, 4300, 8412, 3294, 4193, 3303, 123, 111, 99, 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, 14990, 14746, 15779, 15795, 15944, 662, 796, 941, 951, 148, 6936, 5675, 5440, 10014, 11179, 11197, 10894, 10776, 10661, 10795, 10419, -10984, -11095, -11072, 12998, 12731, 11718, -6838, -32318, 4, 12, 24, 37, 49, 61, 74, 86 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 4, 12, 24, 37, 49, 61, 74, 86, -25437, -26445, -27450, 9694, 21824, 123, 111, 99, 17814, 16801, 17837, 16697, 7341, 7496, 5330, 7384, 5268, 3230, 2223, 72, 10277, 8377, 8394, 7384, -22370, -22221, -22196, -22314, -29637, -27434, -29604, -25491, 662, 796, 933, 819, 10258, 6430, 5425, 5314, 10917, 10925, 10935, 10471, 10258, 10524, 10415, 10301, -11108, -11093, -11203, -8034, -5839, -6836, -5934, -32674, -14444, -15455, -15697, -15557, -15424, -11622, -11601, -11450, 7054, 7079, 5056, 6988, 8481, -30054, -30159, -30019, -21734, -21845, -21707, -21690, -21564, -24921, -24775, -24640, 662, 794, 811, 945, 827, 957, 5425, 5314, 11032, 10921, 11183, 11069, 11200, 4775, 3891, 3904, -18792, -19799, -20807, -20677, -20534, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 20366, 21274, 21415, 20401, 6569, 7613, 7630, 6364, 4300, 8412, 3294, 4193, 3303, 123, 111, 99, 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, 14990, 14746, 15779, 15795, 15944, 662, 796, 941, 951, 148, 6936, 5675, 5440, 10014, 11179, 11197, 10894, 10776, 10661, 10795, 10419, -10984, -11095, -11072, 12998, 12731, 11718, -6838, -32318, 4, 12, 24, 37, 49, 61, 74, 86 }, { 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384, 8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 12, 24, 37, 49, 61, 74, 86, -25437, -26445, -27450, 9694, 21824, 123, 111, 99, 17814, 16801, 17837, 16697, 7341, 7496, 5330, 7384, 5268, 3230, 2223, 72, 10277, 8377, 8394, 7384, -22370, -22221, -22196, -22314, -29637, -27434, -29604, -25491, 662, 796, 933, 819, 10258, 6430, 5425, 5314, 10917, 10925, 10935, 10471, 10258, 10524, 10415, 10301, -11108, -11093, -11203, -8034, -5839, -6836, -5934, -32674, -14444, -15455, -15697, -15557, -15424, -11622, -11601, -11450, 7054, 7079, 5056, 6988, 8481, -30054, -30159, -30019, -21734, -21845, -21707, -21690, -21564, -24921, -24775, -24640, 662, 794, 811, 945, 827, 957, 5425, 5314, 11032, 10921, 11183, 11069, 11200, 4775, 3891, 3904, -18792, -19799, -20807, -20677, -20534, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 20366, 21274, 21415, 20401, 6569, 7613, 7630, 6364, 4300, 8412, 3294, 4193, 3303, 123, 111, 99, 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, 14990, 14746, 15779, 15795, 15944, 662, 796, 941, 951, 148, 6936, 5675, 5440, 10014, 11179, 11197, 10894, 10776, 10661, 10795, 10419, -10984, -11095, -11072, 12998, 12731, 11718, -6838, -32318, 4, 12, 24, 37, 49, 61, 74, 86 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 22461, -21571, 11200, 957, -10317, 5056, -31808, 123, 22453, -21579, 11191, 949, -10325, 4023, -31817, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 20366, 20401, 662, 827, 7054, 5056, -21734, -21564, -14444, -15424, 11032, 11200, 4, 123, 61, -18792, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 8412, 8301, 8076, 6936, 5675, 941, 5056, 15795, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };

    @OriginalMember(owner = "client!vd", name = "W", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4083 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!vd", name = "cb", descriptor = "Lrd;")
    private static class173 field4089 = class133.method843("cyan:", -72);

    @OriginalMember(owner = "client!vd", name = "db", descriptor = "[I")
    public static int[] field4090 = new int[32];

    @OriginalMember(owner = "client!vd", name = "eb", descriptor = "Lrd;")
    public static class173 field4091 = class133.method843("p12_full", 26);

    @OriginalMember(owner = "client!vd", name = "ab", descriptor = "Lrd;")
    public static class173 field4087 = field4089;

    @OriginalMember(owner = "client!vd", name = "bb", descriptor = "Lrd;")
    public static class173 field4088 = field4089;

    @OriginalMember(owner = "client!vd", name = "fb", descriptor = "I")
    public static int field4092 = 0;

    @OriginalMember(owner = "client!vd", name = "gb", descriptor = "Lrd;")
    public static class173 field4093 = class133.method843("hint_headicons", -82);

    @OriginalMember(owner = "client!vd", name = "K", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!vd", name = "L", descriptor = "I")
    public int field4072;

    @OriginalMember(owner = "client!vd", name = "M", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!vd", name = "O", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!vd", name = "Q", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!vd", name = "R", descriptor = "I")
    public int field4078;

    @OriginalMember(owner = "client!vd", name = "U", descriptor = "I")
    public int field4081;

    @OriginalMember(owner = "client!vd", name = "V", descriptor = "I")
    public int field4082;

    @OriginalMember(owner = "client!vd", name = "Y", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!vd", name = "Z", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!vd", name = "T", descriptor = "[Lsa;")
    public static class180[] field4080;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(II)V")
    private final void method1384(int arg0, int arg1) {
        double var3 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        if (arg0 <= 84) {
            field4083 = null;
        }
        field4071++;
        double var5 = 0.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var11 = var9;
        double var13 = var9;
        if (var3 < var9) {
            var13 = var3;
        }
        if (var13 > var7) {
            var13 = var7;
        }
        if (var9 < var3) {
            var11 = var3;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var15 = 0.0D;
        double var17 = (var11 + var13) / 2.0D;
        if (var11 != var13) {
            if (var17 < 0.5D) {
                var15 = (var11 - var13) / (var11 + var13);
            }
            if (var9 == var11) {
                var5 = (var3 - var7) / (-var13 + var11);
            } else if (var3 == var11) {
                var5 = (var7 - var9) / (-var13 + var11) + 2.0D;
            } else if (var7 == var11) {
                var5 = (var9 - var3) / (-var13 + var11) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var13) / (2.0D - var11 - var13);
            }
        }
        this.field4081 = (int) (var17 * 256.0D);
        if (this.field4081 < 0) {
            this.field4081 = 0;
        } else if (this.field4081 > 255) {
            this.field4081 = 255;
        }
        double var19 = var5 / 6.0D;
        this.field4082 = (int) (var15 * 256.0D);
        if (var17 > 0.5D) {
            this.field4072 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field4072 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field4082 < 0) {
            this.field4082 = 0;
        } else if (this.field4082 > 255) {
            this.field4082 = 255;
        }
        if (this.field4072 < 1) {
            this.field4072 = 1;
        }
        this.field4078 = (int) ((double) this.field4072 * var19);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lmb;III)V")
    private final void method1385(class121 arg0, int arg1, int arg2, int arg3) {
        field4075++;
        if (~arg2 == arg3) {
            this.field4074 = arg0.method780(arg3 ^ 0xFF00FFFE);
            this.method1384(123, this.field4074);
        } else if (arg2 == 2) {
            this.field4076 = arg0.method755((byte) -93);
            if (this.field4076 == 65535) {
                this.field4076 = -1;
                return;
            }
        } else if (arg2 == 3) {
            arg0.method755((byte) -116);
            return;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZ)V")
    public static final void method1386(int arg0, boolean arg1) {
        field4077++;
        int var2 = 0;
        if (arg0 != -2) {
            method1388((byte) 109);
        }
        while (class66.field1291 > var2) {
            class120 var3 = client.field632[class139.field2597[var2]];
            long var4 = (long) class139.field2597[var2] << 32 | 0x20000000L;
            if (var3 != null && var3.method727(true) && var3.field2215.field916 == arg1 && var3.field2215.method317(arg0 ^ 0xFFFFFF96)) {
                int var6 = var3.field2801 >> 7;
                int var7 = var3.field2820 >> 7;
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    label72: {
                        if (var3.field2754 == 1 && (var3.field2820 & 0x7F) == 64 && (var3.field2801 & 0x7F) == 64) {
                            if (class199.field3877[var7][var6] == class41.field851) {
                                break label72;
                            }
                            class199.field3877[var7][var6] = class41.field851;
                        }
                        if (!var3.field2215.field918) {
                            var4 |= Long.MIN_VALUE;
                        }
                        var3.field2757 = class56.method361(class172.field3347, (var3.field2754 - 1) * 64 + var3.field2801, (byte) 97, (var3.field2754 - 1) * 64 + var3.field2820);
                        class55.method357(class172.field3347, var3.field2820, var3.field2801, var3.field2757, (var3.field2754 - 1) * 64 + 60, var3, var3.field2786, var4, var3.field2810);
                    }
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lmb;BI)V")
    public final void method1387(class121 arg0, byte arg1, int arg2) {
        if (arg1 < 3) {
            field4091 = null;
        }
        while (true) {
            int var4 = arg0.method751((byte) 97);
            if (var4 == 0) {
                field4085++;
                return;
            }
            this.method1385(arg0, arg2, var4, -2);
        }
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(B)V")
    public static void method1388(byte arg0) {
        field4088 = null;
        int var1 = -72 / ((arg0 - 49) / 52);
        field4083 = null;
        field4093 = null;
        field4090 = null;
        field4080 = null;
        field4084 = null;
        field4091 = null;
        field4089 = null;
        field4087 = null;
    }
}
