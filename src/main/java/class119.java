import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class119 extends class213 {

    @OriginalMember(owner = "client!la", name = "Z", descriptor = "Lvd;")
    private class222 field2260 = class132.field2550;

    @OriginalMember(owner = "client!la", name = "V", descriptor = "I")
    public static int field2256 = 0;

    @OriginalMember(owner = "client!la", name = "S", descriptor = "I")
    public static int field2253 = 0;

    @OriginalMember(owner = "client!la", name = "Y", descriptor = "Lig;")
    public static class93 field2259 = new class93(64);

    @OriginalMember(owner = "client!la", name = "bb", descriptor = "[[S")
    public static short[][] field2262 = new short[][] { { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 4, 12, 24, 37, 49, 61, 74, 86, -25437, -26445, -27450, 9694, 21824, 123, 111, 99, 17814, 16801, 17837, 16697, 7341, 7496, 5330, 7384, 5268, 3230, 2223, 72, 10277, 8377, 8394, 7384, -22370, -22221, -22196, -22314, -29637, -27434, -29604, -25491, 662, 796, 933, 819, 10258, 6430, 5425, 5314, 10917, 10925, 10935, 10471, 10258, 10524, 10415, 10301, -11108, -11093, -11203, -8034, -5839, -6836, -5934, -32674, -14444, -15455, -15697, -15557, -15424, -11622, -11601, -11450, 7054, 7079, 5056, 6988, 8481, -30054, -30159, -30019, -21734, -21845, -21707, -21690, -21564, -24921, -24775, -24640, 662, 794, 811, 945, 827, 957, 5425, 5314, 11032, 10921, 11183, 11069, 11200, 4775, 3891, 3904, -18792, -19799, -20807, -20677, -20534, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 20366, 21274, 21415, 20401, 6569, 7613, 7630, 6364, 4300, 8412, 3294, 4193, 3303, 123, 111, 99, 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, 14990, 14746, 15779, 15795, 15944, 662, 796, 941, 951, 148, 6936, 5675, 5440, 10014, 11179, 11197, 10894, 10776, 10661, 10795, 10419, -10984, -11095, -11072, 12998, 12731, 11718, -6838, -32318, 4, 12, 24, 37, 49, 61, 74, 86 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 4, 12, 24, 37, 49, 61, 74, 86, -25437, -26445, -27450, 9694, 21824, 123, 111, 99, 17814, 16801, 17837, 16697, 7341, 7496, 5330, 7384, 5268, 3230, 2223, 72, 10277, 8377, 8394, 7384, -22370, -22221, -22196, -22314, -29637, -27434, -29604, -25491, 662, 796, 933, 819, 10258, 6430, 5425, 5314, 10917, 10925, 10935, 10471, 10258, 10524, 10415, 10301, -11108, -11093, -11203, -8034, -5839, -6836, -5934, -32674, -14444, -15455, -15697, -15557, -15424, -11622, -11601, -11450, 7054, 7079, 5056, 6988, 8481, -30054, -30159, -30019, -21734, -21845, -21707, -21690, -21564, -24921, -24775, -24640, 662, 794, 811, 945, 827, 957, 5425, 5314, 11032, 10921, 11183, 11069, 11200, 4775, 3891, 3904, -18792, -19799, -20807, -20677, -20534, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 20366, 21274, 21415, 20401, 6569, 7613, 7630, 6364, 4300, 8412, 3294, 4193, 3303, 123, 111, 99, 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, 14990, 14746, 15779, 15795, 15944, 662, 796, 941, 951, 148, 6936, 5675, 5440, 10014, 11179, 11197, 10894, 10776, 10661, 10795, 10419, -10984, -11095, -11072, 12998, 12731, 11718, -6838, -32318, 4, 12, 24, 37, 49, 61, 74, 86 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 4, 12, 24, 37, 49, 61, 74, 86, -25437, -26445, -27450, 9694, 21824, 123, 111, 99, 17814, 16801, 17837, 16697, 7341, 7496, 5330, 7384, 5268, 3230, 2223, 72, 10277, 8377, 8394, 7384, -22370, -22221, -22196, -22314, -29637, -27434, -29604, -25491, 662, 796, 933, 819, 10258, 6430, 5425, 5314, 10917, 10925, 10935, 10471, 10258, 10524, 10415, 10301, -11108, -11093, -11203, -8034, -5839, -6836, -5934, -32674, -14444, -15455, -15697, -15557, -15424, -11622, -11601, -11450, 7054, 7079, 5056, 6988, 8481, -30054, -30159, -30019, -21734, -21845, -21707, -21690, -21564, -24921, -24775, -24640, 662, 794, 811, 945, 827, 957, 5425, 5314, 11032, 10921, 11183, 11069, 11200, 4775, 3891, 3904, -18792, -19799, -20807, -20677, -20534, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 20366, 21274, 21415, 20401, 6569, 7613, 7630, 6364, 4300, 8412, 3294, 4193, 3303, 123, 111, 99, 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, 14990, 14746, 15779, 15795, 15944, 662, 796, 941, 951, 148, 6936, 5675, 5440, 10014, 11179, 11197, 10894, 10776, 10661, 10795, 10419, -10984, -11095, -11072, 12998, 12731, 11718, -6838, -32318, 4, 12, 24, 37, 49, 61, 74, 86 }, { 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384, 8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 12, 24, 37, 49, 61, 74, 86, -25437, -26445, -27450, 9694, 21824, 123, 111, 99, 17814, 16801, 17837, 16697, 7341, 7496, 5330, 7384, 5268, 3230, 2223, 72, 10277, 8377, 8394, 7384, -22370, -22221, -22196, -22314, -29637, -27434, -29604, -25491, 662, 796, 933, 819, 10258, 6430, 5425, 5314, 10917, 10925, 10935, 10471, 10258, 10524, 10415, 10301, -11108, -11093, -11203, -8034, -5839, -6836, -5934, -32674, -14444, -15455, -15697, -15557, -15424, -11622, -11601, -11450, 7054, 7079, 5056, 6988, 8481, -30054, -30159, -30019, -21734, -21845, -21707, -21690, -21564, -24921, -24775, -24640, 662, 794, 811, 945, 827, 957, 5425, 5314, 11032, 10921, 11183, 11069, 11200, 4775, 3891, 3904, -18792, -19799, -20807, -20677, -20534, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 20366, 21274, 21415, 20401, 6569, 7613, 7630, 6364, 4300, 8412, 3294, 4193, 3303, 123, 111, 99, 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, 14990, 14746, 15779, 15795, 15944, 662, 796, 941, 951, 148, 6936, 5675, 5440, 10014, 11179, 11197, 10894, 10776, 10661, 10795, 10419, -10984, -11095, -11072, 12998, 12731, 11718, -6838, -32318, 4, 12, 24, 37, 49, 61, 74, 86 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 22461, -21571, 11200, 957, -10317, 5056, -31808, 123, 22453, -21579, 11191, 949, -10325, 4023, -31817, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 20366, 20401, 662, 827, 7054, 5056, -21734, -21564, -14444, -15424, 11032, 11200, 4, 123, 61, -18792, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 8412, 8301, 8076, 6936, 5675, 941, 5056, 15795, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };

    @OriginalMember(owner = "client!la", name = "L", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!la", name = "M", descriptor = "I")
    private int field2247;

    @OriginalMember(owner = "client!la", name = "N", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!la", name = "P", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!la", name = "Q", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!la", name = "R", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!la", name = "T", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!la", name = "U", descriptor = "I")
    public int field2255;

    @OriginalMember(owner = "client!la", name = "X", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!la", name = "ab", descriptor = "I")
    public int field2261;

    @OriginalMember(owner = "client!la", name = "O", descriptor = "Lwd;")
    private class232 field2249;

    @OriginalMember(owner = "client!la", name = "W", descriptor = "Lab;")
    public static class3 field2257;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)I")
    public static final int method758(int arg0, int arg1, int arg2) {
        field2246++;
        class208 var3 = (class208) class78.field1505.method1520((long) arg1, arg0 ^ 0x15);
        if (var3 == null) {
            return 0;
        } else if (~arg2 == arg0) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field3865.length; var5++) {
                if (var3.field3868[var5] == arg2) {
                    var4 += var3.field3865[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZI)I")
    public final int method759(boolean arg0, int arg1) {
        field2251++;
        if (this.field2249 == null) {
            return this.field2247;
        }
        class139 var3 = (class139) this.field2249.method1520((long) arg1, 26);
        if (var3 == null) {
            return this.field2247;
        } else if (arg0) {
            return -19;
        } else {
            return var3.field2687;
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(Z)V")
    public static void method760(boolean arg0) {
        if (!arg0) {
            field2259 = null;
            field2262 = null;
            field2257 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(II)Z")
    public static final boolean method761(int arg0, int arg1) {
        field2258++;
        if (arg1 != -19731) {
            field2253 = -124;
        }
        return (arg0 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lka;B)V")
    public final void method762(class109 arg0, byte arg1) {
        int var3 = -64 % ((arg1 - 12) / 54);
        field2248++;
        while (true) {
            int var4 = arg0.method662((byte) -115);
            if (var4 == 0) {
                return;
            }
            this.method763(arg0, var4, (byte) -106);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lka;IB)V")
    private final void method763(class109 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field2255 = arg0.method662((byte) -91);
        } else if (arg1 == 2) {
            this.field2261 = arg0.method662((byte) -113);
        } else if (arg1 == 3) {
            this.field2260 = arg0.method674(-90);
        } else if (arg1 == 4) {
            this.field2247 = arg0.method710(28908);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg0.method675(2);
            this.field2249 = new class232(class175.method1105(var4, 109));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method710(28908);
                class132 var7;
                if (arg1 == 5) {
                    var7 = new class35(arg0.method674(-36));
                } else {
                    var7 = new class139(arg0.method710(28908));
                }
                this.field2249.method1519(true, var7, (long) var6);
            }
        }
        field2250++;
        if (arg2 >= -19) {
            this.method762(null, (byte) -89);
        }
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(II)Lvd;")
    public final class222 method764(int arg0, int arg1) {
        field2254++;
        if (this.field2249 == null) {
            return this.field2260;
        }
        class35 var3 = (class35) this.field2249.method1520((long) arg1, 71);
        if (var3 == null) {
            return this.field2260;
        } else {
            if (arg0 != 5056) {
                this.method763(null, -24, (byte) -119);
            }
            return var3.field764;
        }
    }

    @OriginalMember(owner = "client!la", name = "f", descriptor = "(I)Z")
    public static final boolean method765(int arg0) {
        field2252++;
        if (arg0 != 200) {
            field2257 = null;
        }
        long var1 = class135.method849(true);
        int var3 = (int) (var1 - class62.field1146);
        if (var3 > 200) {
            var3 = 200;
        }
        class62.field1146 = var1;
        class124.field2375 += var3;
        if (class200.field3643 == 0 && class192.field3534 == 0 && class114.field2162 == 0 && class116.field2216 == 0) {
            return true;
        } else if (class54.field1023 == null) {
            return false;
        } else {
            try {
                if (class124.field2375 > 30000) {
                    throw new IOException();
                }
                while (class192.field3534 < 20 && class116.field2216 > 0) {
                    class212 var4 = (class212) class116.field2224.method1517(0);
                    class109 var5 = new class109(4);
                    var5.method676(1, (byte) -3);
                    var5.method677((byte) -113, (int) var4.field2555);
                    class54.field1023.method785(0, arg0 ^ 0xC8, var5.field2006, 4);
                    class218.field4045.method1519(true, var4, var4.field2555);
                    class192.field3534++;
                    class116.field2216--;
                }
                while (class200.field3643 < 20 && class114.field2162 > 0) {
                    class212 var6 = (class212) class157.field3012.method1291(470);
                    class109 var7 = new class109(4);
                    var7.method676(0, (byte) -3);
                    var7.method677((byte) -98, (int) var6.field2555);
                    class54.field1023.method785(0, 0, var7.field2006, 4);
                    var6.method1362(-2);
                    class218.field4048.method1519(true, var6, var6.field2555);
                    class200.field3643++;
                    class114.field2162--;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = class54.field1023.method786(92);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    class124.field2375 = 0;
                    byte var10 = 0;
                    if (class105.field1938 == null) {
                        var10 = 8;
                    } else if (class106.field1967 == 0) {
                        var10 = 1;
                    }
                    if (var10 > 0) {
                        int var11 = var10 - class75.field1469.field2053;
                        if (var9 < var11) {
                            var11 = var9;
                        }
                        class54.field1023.method783((byte) 127, class75.field1469.field2053, class75.field1469.field2006, var11);
                        if (class60.field1121 != 0) {
                            for (int var12 = 0; var12 < var11; var12++) {
                                class75.field1469.field2006[class75.field1469.field2053 + var12] = (byte) class168.method1082(class75.field1469.field2006[class75.field1469.field2053 + var12], class60.field1121);
                            }
                        }
                        class75.field1469.field2053 += var11;
                        if (class75.field1469.field2053 < var10) {
                            break;
                        }
                        if (class105.field1938 == null) {
                            class75.field1469.field2053 = 0;
                            int var13 = class75.field1469.method662((byte) -109);
                            int var14 = class75.field1469.method675(2);
                            int var15 = class75.field1469.method662((byte) -117);
                            long var16 = (long) ((var13 << 16) + var14);
                            int var18 = class75.field1469.method710(28908);
                            class212 var19 = (class212) class218.field4045.method1520(var16, 43);
                            class6.field99 = true;
                            if (var19 == null) {
                                var19 = (class212) class218.field4048.method1520(var16, 94);
                                class6.field99 = false;
                            }
                            if (var19 == null) {
                                throw new IOException();
                            }
                            class105.field1938 = var19;
                            int var20 = var15 == 0 ? 5 : 9;
                            class152.field2934 = new class109(var18 + var20 + class105.field1938.field3936);
                            class152.field2934.method676(var15, (byte) -3);
                            class152.field2934.method684(var18, -84);
                            class106.field1967 = 8;
                            class75.field1469.field2053 = 0;
                        } else if (class106.field1967 == 0) {
                            if (class75.field1469.field2006[0] == -1) {
                                class106.field1967 = 1;
                                class75.field1469.field2053 = 0;
                            } else {
                                class105.field1938 = null;
                            }
                        }
                    } else {
                        int var21 = class152.field2934.field2006.length - class105.field1938.field3936;
                        int var22 = 512 - class106.field1967;
                        if (var21 - class152.field2934.field2053 < var22) {
                            var22 = var21 - class152.field2934.field2053;
                        }
                        if (var22 > var9) {
                            var22 = var9;
                        }
                        class54.field1023.method783((byte) -72, class152.field2934.field2053, class152.field2934.field2006, var22);
                        if (class60.field1121 != 0) {
                            for (int var23 = 0; var23 < var22; var23++) {
                                class152.field2934.field2006[class152.field2934.field2053 + var23] = (byte) class168.method1082(class152.field2934.field2006[class152.field2934.field2053 + var23], class60.field1121);
                            }
                        }
                        class152.field2934.field2053 += var22;
                        class106.field1967 += var22;
                        if (class152.field2934.field2053 == var21) {
                            if (class105.field1938.field2555 == 16711935L) {
                                class58.field1084 = class152.field2934;
                                for (int var24 = 0; var24 < 256; var24++) {
                                    class223 var25 = class121.field2280[var24];
                                    if (var25 != null) {
                                        class58.field1084.field2053 = var24 * 8 + 5;
                                        int var26 = class58.field1084.method710(arg0 ^ 0x7024);
                                        int var27 = class58.field1084.method710(28908);
                                        var25.method1463(var26, var27, false);
                                    }
                                }
                            } else {
                                class204.field3760.reset();
                                class204.field3760.update(class152.field2934.field2006, 0, var21);
                                int var28 = (int) class204.field3760.getValue();
                                if (class105.field1938.field3942 != var28) {
                                    try {
                                        class54.field1023.method784(5000);
                                    } catch (Exception var30) {
                                    }
                                    class60.field1121 = (byte) (Math.random() * 255.0D + 1.0D);
                                    class54.field1023 = null;
                                    class118.field2231++;
                                    return false;
                                }
                                class118.field2231 = 0;
                                class177.field3310 = 0;
                                class105.field1938.field3938.method1462(-1267907032, class152.field2934.field2006, (int) (class105.field1938.field2555 & 0xFFFFL), class6.field99, (class105.field1938.field2555 & 0xFF0000L) == 16711680L);
                            }
                            class105.field1938.method826(arg0 - 22301);
                            class105.field1938 = null;
                            class106.field1967 = 0;
                            class152.field2934 = null;
                            if (class6.field99) {
                                class192.field3534--;
                            } else {
                                class200.field3643--;
                            }
                        } else {
                            if (class106.field1967 != 512) {
                                break;
                            }
                            class106.field1967 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var31) {
                try {
                    class54.field1023.method784(arg0 + 4800);
                } catch (Exception var29) {
                }
                class177.field3310++;
                class54.field1023 = null;
                return false;
            }
        }
    }
}
