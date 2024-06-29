import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class99 {

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "[I")
    private int[] field1811;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "J")
    public static long field1806 = 0L;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "Z")
    public static boolean field1809 = false;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "Li;")
    public static class88 field1804 = class208.method1425(105, "Hidden)2");

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "[[S")
    public static short[][] field1812 = new short[][] { { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 4, 12, 24, 37, 49, 61, 74, 86, -25437, -26445, -27450, 9694, 21824, 123, 111, 99, 17814, 16801, 17837, 16697, 7341, 7496, 5330, 7384, 5268, 3230, 2223, 72, 10277, 8377, 8394, 7384, -22370, -22221, -22196, -22314, -29637, -27434, -29604, -25491, 662, 796, 933, 819, 10258, 6430, 5425, 5314, 10917, 10925, 10935, 10471, 10258, 10524, 10415, 10301, -11108, -11093, -11203, -8034, -5839, -6836, -5934, -32674, -14444, -15455, -15697, -15557, -15424, -11622, -11601, -11450, 7054, 7079, 5056, 6988, 8481, -30054, -30159, -30019, -21734, -21845, -21707, -21690, -21564, -24921, -24775, -24640, 662, 794, 811, 945, 827, 957, 5425, 5314, 11032, 10921, 11183, 11069, 11200, 4775, 3891, 3904, -18792, -19799, -20807, -20677, -20534, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 20366, 21274, 21415, 20401, 6569, 7613, 7630, 6364, 119, 92, 66, 39, 20, 4, 955, 1845, 4032, 7101, 10178, 14272, 17341, 21433, 27581, 30651, -31811, -27717, -24640, -21581, -17603, -13383, 794, 5020, 7062, 1160, 15128, 17940, 30614, -30952, -26728, -23662, -18536, -14440, -9324, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 4, 12, 24, 37, 49, 61, 74, 86, -25437, -26445, -27450, 9694, 21824, 123, 111, 99, 17814, 16801, 17837, 16697, 7341, 7496, 5330, 7384, 5268, 3230, 2223, 72, 10277, 8377, 8394, 7384, -22370, -22221, -22196, -22314, -29637, -27434, -29604, -25491, 662, 796, 933, 819, 10258, 6430, 5425, 5314, 10917, 10925, 10935, 10471, 10258, 10524, 10415, 10301, -11108, -11093, -11203, -8034, -5839, -6836, -5934, -32674, -14444, -15455, -15697, -15557, -15424, -11622, -11601, -11450, 7054, 7079, 5056, 6988, 8481, -30054, -30159, -30019, -21734, -21845, -21707, -21690, -21564, -24921, -24775, -24640, 662, 794, 811, 945, 827, 957, 5425, 5314, 11032, 10921, 11183, 11069, 11200, 4775, 3891, 3904, -18792, -19799, -20807, -20677, -20534, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 20366, 21274, 21415, 20401, 6569, 7613, 7630, 6364, 10347, 10582, 10429, 10407, 10359, 8414, 9540, 10456, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 4, 12, 24, 37, 49, 61, 74, 86, -25437, -26445, -27450, 9694, 21824, 123, 111, 99, 17814, 16801, 17837, 16697, 7341, 7496, 5330, 7384, 5268, 3230, 2223, 72, 10277, 8377, 8394, 7384, -22370, -22221, -22196, -22314, -29637, -27434, -29604, -25491, 662, 796, 933, 819, 10258, 6430, 5425, 5314, 10917, 10925, 10935, 10471, 10258, 10524, 10415, 10301, -11108, -11093, -11203, -8034, -5839, -6836, -5934, -32674, -14444, -15455, -15697, -15557, -15424, -11622, -11601, -11450, 7054, 7079, 5056, 6988, 8481, -30054, -30159, -30019, -21734, -21845, -21707, -21690, -21564, -24921, -24775, -24640, 662, 794, 811, 945, 827, 957, 5425, 5314, 11032, 10921, 11183, 11069, 11200, 4775, 3891, 3904, -18792, -19799, -20807, -20677, -20534, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 20366, 21274, 21415, 20401, 6569, 7613, 7630, 6364, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866 }, { 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384, 8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 12, 24, 37, 49, 61, 74, 86, -25437, -26445, -27450, 9694, 21824, 123, 111, 99, 17814, 16801, 17837, 16697, 7341, 7496, 5330, 7384, 5268, 3230, 2223, 72, 10277, 8377, 8394, 7384, -22370, -22221, -22196, -22314, -29637, -27434, -29604, -25491, 662, 796, 933, 819, 10258, 6430, 5425, 5314, 10917, 10925, 10935, 10471, 10258, 10524, 10415, 10301, -11108, -11093, -11203, -8034, -5839, -6836, -5934, -32674, -14444, -15455, -15697, -15557, -15424, -11622, -11601, -11450, 7054, 7079, 5056, 6988, 8481, -30054, -30159, -30019, -21734, -21845, -21707, -21690, -21564, -24921, -24775, -24640, 662, 794, 811, 945, 827, 957, 5425, 5314, 11032, 10921, 11183, 11069, 11200, 4775, 3891, 3904, -18792, -19799, -20807, -20677, -20534, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 20366, 21274, 21415, 20401, 6569, 7613, 7630, 6364, 13766, 13745, 13726, 13890, 13743, 13852, 17602, 18605, 21660, 24000, 24997, 24088, 27972, 25903, 26904, 27193, 27175, 27156, 30020, 28975, 29976, 12482, 13485, 10392, 10692, 10669, 10776, 6717, 6695, 7830, 6971, 6951, 5910, 3389, 3369, 3356, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 22461, -21571, 11200, 957, -10317, 5056, -31808, 123, 22453, -21579, 11191, 949, -10325, 4023, -31817, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 20366, 20401, 662, 827, 7054, 5056, -21734, -21564, -14444, -15424, 11032, 11200, 4, 123, 61, -18792, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866 } };

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "Li;")
    private static class88 field1815 = class208.method1425(105, "Starting 3d library");

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "Li;")
    public static class88 field1814 = field1815;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "Lbj;")
    public static class22 field1816;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)Z")
    public static final boolean method689(int arg0) {
        field1817++;
        long var1 = class206.method1420(false);
        if (arg0 != 30203) {
            return true;
        }
        int var3 = (int) (var1 - class81.field1456);
        if (var3 > 200) {
            var3 = 200;
        }
        class150.field2918 += var3;
        class81.field1456 = var1;
        if (class231.field4335 == 0 && class203.field3878 == 0 && class220.field4159 == 0 && class208.field3945 == 0) {
            return true;
        } else if (class214.field4035 == null) {
            return false;
        } else {
            try {
                if (class150.field2918 > 30000) {
                    throw new IOException();
                }
                while (class203.field3878 < 20 && class208.field3945 > 0) {
                    class97 var4 = (class97) class241.field4467.method1049(0);
                    class46 var5 = new class46(4);
                    var5.method346(255, 1);
                    var5.method337((int) var4.field1219, (byte) -61);
                    class214.field4035.method913(4, 0, var5.field842, 17492);
                    class151.field2924.method1054(var4.field1219, var4, -1);
                    class208.field3945--;
                    class203.field3878++;
                }
                while (class231.field4335 < 20 && class220.field4159 > 0) {
                    class97 var6 = (class97) class138.field2561.method1383(13753);
                    class46 var7 = new class46(4);
                    var7.method346(arg0 ^ 0x7504, 0);
                    var7.method337((int) var6.field1219, (byte) -61);
                    class214.field4035.method913(4, 0, var7.field842, 17492);
                    var6.method909(arg0 ^ 0x753B);
                    class108.field1953.method1054(var6.field1219, var6, arg0 ^ 0xFFFF8A04);
                    class231.field4335++;
                    class220.field4159--;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = class214.field4035.method911(arg0 - 30202);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    byte var10 = 0;
                    class150.field2918 = 0;
                    if (class53.field990 == null) {
                        var10 = 8;
                    } else if (class28.field473 == 0) {
                        var10 = 1;
                    }
                    if (var10 > 0) {
                        int var11 = var10 - class78.field1408.field831;
                        if (var9 < var11) {
                            var11 = var9;
                        }
                        class214.field4035.method915(class78.field1408.field831, class78.field1408.field842, (byte) -93, var11);
                        if (class18.field294 != 0) {
                            for (int var12 = 0; var12 < var11; var12++) {
                                class78.field1408.field842[class78.field1408.field831 + var12] = (byte) class180.method1287(class78.field1408.field842[class78.field1408.field831 + var12], class18.field294);
                            }
                        }
                        class78.field1408.field831 += var11;
                        if (var10 > class78.field1408.field831) {
                            break;
                        }
                        if (class53.field990 == null) {
                            class78.field1408.field831 = 0;
                            int var13 = class78.field1408.method347(26119);
                            int var14 = class78.field1408.method301(arg0 - 30148);
                            long var15 = (long) ((var13 << 16) + var14);
                            int var17 = class78.field1408.method347(26119);
                            int var18 = class78.field1408.method323((byte) -76);
                            class97 var19 = (class97) class151.field2924.method1051(-1, var15);
                            class138.field2569 = true;
                            if (var19 == null) {
                                var19 = (class97) class108.field1953.method1051(arg0 ^ 0xFFFF8A04, var15);
                                class138.field2569 = false;
                            }
                            if (var19 == null) {
                                throw new IOException();
                            }
                            class53.field990 = var19;
                            int var20 = var17 == 0 ? 5 : 9;
                            class149.field2910 = new class46(var18 + var20 + class53.field990.field1784);
                            class149.field2910.method346(255, var17);
                            class149.field2910.method338(arg0 ^ 0x7DEB7FAB, var18);
                            class78.field1408.field831 = 0;
                            class28.field473 = 8;
                        } else if (class28.field473 == 0) {
                            if (class78.field1408.field842[0] == -1) {
                                class78.field1408.field831 = 0;
                                class28.field473 = 1;
                            } else {
                                class53.field990 = null;
                            }
                        }
                    } else {
                        int var21 = class149.field2910.field842.length - class53.field990.field1784;
                        int var22 = 512 - class28.field473;
                        if (var22 > var21 - class149.field2910.field831) {
                            var22 = var21 - class149.field2910.field831;
                        }
                        if (var9 < var22) {
                            var22 = var9;
                        }
                        class214.field4035.method915(class149.field2910.field831, class149.field2910.field842, (byte) -93, var22);
                        if (class18.field294 != 0) {
                            for (int var23 = 0; var23 < var22; var23++) {
                                class149.field2910.field842[class149.field2910.field831 + var23] = (byte) class180.method1287(class149.field2910.field842[class149.field2910.field831 + var23], class18.field294);
                            }
                        }
                        class149.field2910.field831 += var22;
                        class28.field473 += var22;
                        if (class149.field2910.field831 == var21) {
                            if (class53.field990.field1219 == 16711935L) {
                                class79.field1427 = class149.field2910;
                                for (int var24 = 0; var24 < 256; var24++) {
                                    class22 var25 = class10.field141[var24];
                                    if (var25 != null) {
                                        class79.field1427.field831 = var24 * 8 + 5;
                                        int var26 = class79.field1427.method323((byte) -128);
                                        int var27 = class79.field1427.method323((byte) -128);
                                        var25.method109(var26, 56, var27);
                                    }
                                }
                            } else {
                                class92.field1733.reset();
                                class92.field1733.update(class149.field2910.field842, 0, var21);
                                int var28 = (int) class92.field1733.getValue();
                                if (class53.field990.field1782 != var28) {
                                    try {
                                        class214.field4035.method919(true);
                                    } catch (Exception var30) {
                                    }
                                    class18.field294 = (byte) (Math.random() * 255.0D + 1.0D);
                                    class151.field2940++;
                                    class214.field4035 = null;
                                    return false;
                                }
                                class151.field2940 = 0;
                                class77.field1389 = 0;
                                class53.field990.field1789.method105((int) (class53.field990.field1219 & 0xFFFFL), class149.field2910.field842, class138.field2569, 104, (class53.field990.field1219 & 0xFF0000L) == 16711680L);
                            }
                            class53.field990.method460(true);
                            class28.field473 = 0;
                            if (class138.field2569) {
                                class203.field3878--;
                            } else {
                                class231.field4335--;
                            }
                            class53.field990 = null;
                            class149.field2910 = null;
                        } else {
                            if (class28.field473 != 512) {
                                break;
                            }
                            class28.field473 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var31) {
                try {
                    class214.field4035.method919(true);
                } catch (Exception var29) {
                }
                class77.field1389++;
                class214.field4035 = null;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
    public static final void method690(byte arg0) {
        class200.method1373(arg0 ^ 0xFFFF00E5, class179.field3570);
        class227.field4258++;
        field1813++;
        if (class149.field2907 && class29.field487) {
            int var1 = class28.field471;
            int var2 = var1 - class148.field2793;
            if (class127.field2373 > var2) {
                var2 = class127.field2373;
            }
            int var3 = class239.field4451;
            int var4 = var3 - class207.field3943;
            if (class28.field466 > var4) {
                var4 = class28.field466;
            }
            if (var4 + class179.field3570.field3424 > class28.field466 + class49.field923.field3424) {
                var4 = class28.field466 + class49.field923.field3424 - class179.field3570.field3424;
            }
            int var5 = var4 - class135.field2508;
            int var6 = class179.field3570.field3415;
            if (class179.field3570.field3382 + var2 > class127.field2373 - -class49.field923.field3382) {
                var2 = class127.field2373 + class49.field923.field3382 - class179.field3570.field3382;
            }
            int var7 = var4 + class49.field923.field3417 - class28.field466;
            int var8 = var2 + class49.field923.field3395 - class127.field2373;
            int var9 = var2 - class14.field208;
            if (class227.field4258 > class179.field3570.field3477 && (var9 > var6 || var9 < -var6 || var5 > var6 || -var6 > var5)) {
                class203.field3869 = true;
            }
            if (class179.field3570.field3458 != null && class203.field3869) {
                class39 var10 = new class39();
                var10.field681 = class179.field3570.field3458;
                var10.field691 = var7;
                var10.field694 = var8;
                var10.field678 = class179.field3570;
                class200.method1375(var10, -876775538);
            }
            if (arg0 == -27 && class156.field3018 == 0) {
                if (class203.field3869) {
                    if (class179.field3570.field3414 != null) {
                        class39 var11 = new class39();
                        var11.field681 = class179.field3570.field3414;
                        var11.field678 = class179.field3570;
                        var11.field694 = var8;
                        var11.field691 = var7;
                        var11.field676 = class122.field2219;
                        class200.method1375(var11, -876775538);
                    }
                    if (class122.field2219 != null && class87.method583(0, class179.field3570) != null) {
                        class146.field2749.method30((byte) -74, 135);
                        class42.field709++;
                        class146.field2749.method314(class179.field3570.field3408, (byte) 72);
                        class146.field2749.method316(class179.field3570.field3425, 15728);
                        class146.field2749.method316(class122.field2219.field3425, 15728);
                        class146.field2749.method344(class122.field2219.field3408, (byte) -51);
                    }
                } else if ((class203.field3861 == 1 || class234.method1556(class203.field3864 - 1, -1)) && class203.field3864 > 2) {
                    class136.method906(arg0 + 32795);
                } else if (class203.field3864 > 0) {
                    class175.method1259(2, class203.field3864 - 1);
                }
                class179.field3570 = null;
            }
        } else if (class227.field4258 > 1) {
            class179.field3570 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V")
    public static void method691(boolean arg0) {
        field1804 = null;
        field1814 = null;
        if (arg0) {
            field1814 = null;
        }
        field1816 = null;
        field1812 = null;
        field1815 = null;
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "([I)V")
    public class99(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= arg0.length + (arg0.length >> 1); var2 <<= 0x1) {
        }
        this.field1811 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field1811[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field1811[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field1811[var5 + var5] = arg0[var4];
            this.field1811[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIIIIIIIIZ)Z")
    public static final boolean method692(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        field1807++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class190.field3675[var12][var31] = 0;
                class228.field4269[var12][var31] = 99999999;
            }
        }
        class190.field3675[arg3][arg2] = 99;
        int var13 = arg3;
        class228.field4269[arg3][arg2] = 0;
        int var14 = arg2;
        byte var15 = 0;
        if (arg7 != 8655) {
            field1805 = -43;
        }
        class120.field2205[var15] = arg3;
        int var16 = 0;
        int var32 = var15 + 1;
        class97.field1783[var15] = arg2;
        int[][] var17 = class166.field3202[class149.field2909].field1668;
        boolean var18 = false;
        while (var32 != var16) {
            var14 = class97.field1783[var16];
            var13 = class120.field2205[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg4 == var13 && arg0 == var14) {
                var18 = true;
                break;
            }
            if (arg1 != 0) {
                if ((arg1 < 5 || arg1 == 10) && class166.field3202[class149.field2909].method641(var14, arg1 - 1, arg4, arg0, 1, arg6, var13, 120)) {
                    var18 = true;
                    break;
                }
                if (arg1 < 10 && class166.field3202[class149.field2909].method649(arg6, var13, arg1 - 1, (byte) 117, arg0, 1, var14, arg4)) {
                    var18 = true;
                    break;
                }
            }
            if (arg8 != 0 && arg5 != 0 && class166.field3202[class149.field2909].method651(1, arg0, arg8, arg7 ^ 0x21CE, var14, arg5, var13, arg4, arg10)) {
                var18 = true;
                break;
            }
            int var30 = class228.field4269[var13][var14] + 1;
            if (var13 > 0 && class190.field3675[var13 - 1][var14] == 0 && (var17[var13 - 1][var14] & 0x12C0108) == 0) {
                class120.field2205[var32] = var13 - 1;
                class97.field1783[var32] = var14;
                var32 = var32 + 1 & 0xFFF;
                class190.field3675[var13 - 1][var14] = 2;
                class228.field4269[var13 - 1][var14] = var30;
            }
            if (var13 < 103 && class190.field3675[var13 + 1][var14] == 0 && (var17[var13 + 1][var14] & 0x12C0180) == 0) {
                class120.field2205[var32] = var13 + 1;
                class97.field1783[var32] = var14;
                var32 = var32 + 1 & 0xFFF;
                class190.field3675[var13 + 1][var14] = 8;
                class228.field4269[var13 + 1][var14] = var30;
            }
            if (var14 > 0 && class190.field3675[var13][var14 - 1] == 0 && (var17[var13][var14 - 1] & 0x12C0102) == 0) {
                class120.field2205[var32] = var13;
                class97.field1783[var32] = var14 - 1;
                var32 = var32 + 1 & 0xFFF;
                class190.field3675[var13][var14 - 1] = 1;
                class228.field4269[var13][var14 - 1] = var30;
            }
            if (var14 < 103 && class190.field3675[var13][var14 + 1] == 0 && (var17[var13][var14 + 1] & 0x12C0120) == 0) {
                class120.field2205[var32] = var13;
                class97.field1783[var32] = var14 + 1;
                class190.field3675[var13][var14 + 1] = 4;
                var32 = var32 + 1 & 0xFFF;
                class228.field4269[var13][var14 + 1] = var30;
            }
            if (var13 > 0 && var14 > 0 && class190.field3675[var13 - 1][var14 - 1] == 0 && (var17[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var17[var13 - 1][var14] & 0x12C0108) == 0 && (var17[var13][var14 - 1] & 0x12C0102) == 0) {
                class120.field2205[var32] = var13 - 1;
                class97.field1783[var32] = var14 - 1;
                var32 = var32 + 1 & 0xFFF;
                class190.field3675[var13 - 1][var14 - 1] = 3;
                class228.field4269[var13 - 1][var14 - 1] = var30;
            }
            if (var13 < 103 && var14 > 0 && class190.field3675[var13 + 1][var14 - 1] == 0 && (var17[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var17[var13 + 1][var14] & 0x12C0180) == 0 && (var17[var13][var14 - 1] & 0x12C0102) == 0) {
                class120.field2205[var32] = var13 + 1;
                class97.field1783[var32] = var14 - 1;
                var32 = var32 + 1 & 0xFFF;
                class190.field3675[var13 + 1][var14 - 1] = 9;
                class228.field4269[var13 + 1][var14 - 1] = var30;
            }
            if (var13 > 0 && var14 < 103 && class190.field3675[var13 - 1][var14 + 1] == 0 && (var17[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var17[var13 - 1][var14] & 0x12C0108) == 0 && (var17[var13][var14 + 1] & 0x12C0120) == 0) {
                class120.field2205[var32] = var13 - 1;
                class97.field1783[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class190.field3675[var13 - 1][var14 + 1] = 6;
                class228.field4269[var13 - 1][var14 + 1] = var30;
            }
            if (var13 < 103 && var14 < 103 && class190.field3675[var13 + 1][var14 + 1] == 0 && (var17[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var17[var13 + 1][var14] & 0x12C0180) == 0 && (var17[var13][var14 + 1] & 0x12C0120) == 0) {
                class120.field2205[var32] = var13 + 1;
                class97.field1783[var32] = var14 + 1;
                class190.field3675[var13 + 1][var14 + 1] = 12;
                class228.field4269[var13 + 1][var14 + 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
        }
        class120.field2188 = 0;
        if (!var18) {
            if (!arg11) {
                return false;
            }
            int var19 = 1000;
            int var20 = 100;
            byte var21 = 10;
            for (int var22 = arg4 - var21; var22 <= arg4 + var21; var22++) {
                for (int var23 = arg0 - var21; var23 <= arg0 + var21; var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class228.field4269[var22][var23] < 100) {
                        int var24 = 0;
                        if (var22 < arg4) {
                            var24 = arg4 - var22;
                        } else if (arg8 + arg4 - 1 < var22) {
                            var24 = var22 + 1 - arg4 - arg8;
                        }
                        int var25 = 0;
                        if (var23 < arg0) {
                            var25 = arg0 - var23;
                        } else if (var23 > arg0 + arg5 - 1) {
                            var25 = var23 + 1 - arg0 - arg5;
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (var19 > var26 || var19 == var26 && var20 > class228.field4269[var22][var23]) {
                            var20 = class228.field4269[var22][var23];
                            var19 = var26;
                            var14 = var23;
                            var13 = var22;
                        }
                    }
                }
            }
            if (var19 == 1000) {
                return false;
            }
            if (arg3 == var13 && arg2 == var14) {
                return false;
            }
            class120.field2188 = 1;
        }
        byte var27 = 0;
        class120.field2205[var27] = var13;
        int var33 = var27 + 1;
        class97.field1783[var27] = var14;
        int var28;
        int var29 = var28 = class190.field3675[var13][var14];
        while (arg3 != var13 || arg2 != var14) {
            if (var28 != var29) {
                class120.field2205[var33] = var13;
                var28 = var29;
                class97.field1783[var33++] = var14;
            }
            if ((var29 & 0x1) != 0) {
                var14++;
            } else if ((var29 & 0x4) != 0) {
                var14--;
            }
            if ((var29 & 0x2) != 0) {
                var13++;
            } else if ((var29 & 0x8) != 0) {
                var13--;
            }
            var29 = class190.field3675[var13][var14];
        }
        if (var33 > 0) {
            class248.method1613(arg9, class120.field2205, class97.field1783, var33, 32);
            return true;
        } else if (arg9 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)I")
    public final int method693(int arg0, int arg1) {
        if (arg1 != 3598) {
            return -31;
        }
        field1808++;
        int var3 = (this.field1811.length >> 1) - 1;
        int var4 = var3 & arg0;
        while (true) {
            int var5 = this.field1811[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field1811[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }
}
