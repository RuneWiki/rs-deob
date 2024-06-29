import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class9 extends class107 {

    @OriginalMember(owner = "client!bb", name = "bb", descriptor = "I")
    private int field153 = 0;

    @OriginalMember(owner = "client!bb", name = "Z", descriptor = "[[[I")
    public static int[][][] field151 = new int[4][105][105];

    @OriginalMember(owner = "client!bb", name = "eb", descriptor = "Lrc;")
    private static class105 field156 = class43.method374("wishes to duel with you)3", 0);

    @OriginalMember(owner = "client!bb", name = "vb", descriptor = "I")
    public static int field173 = 0;

    @OriginalMember(owner = "client!bb", name = "wb", descriptor = "I")
    public static int field174 = -1;

    @OriginalMember(owner = "client!bb", name = "lb", descriptor = "I")
    public static int field163 = 50;

    @OriginalMember(owner = "client!bb", name = "Eb", descriptor = "[I")
    public static int[] field182 = new int[field163];

    @OriginalMember(owner = "client!bb", name = "Fb", descriptor = "I")
    public static int field183 = 0;

    @OriginalMember(owner = "client!bb", name = "hb", descriptor = "[I")
    public static int[] field159 = new int[field163];

    @OriginalMember(owner = "client!bb", name = "qb", descriptor = "[I")
    public static int[] field168 = new int[field163];

    @OriginalMember(owner = "client!bb", name = "kb", descriptor = "[I")
    public static int[] field162 = new int[field163];

    @OriginalMember(owner = "client!bb", name = "db", descriptor = "[I")
    public static int[] field155 = new int[field163];

    @OriginalMember(owner = "client!bb", name = "Db", descriptor = "[I")
    public static int[] field181 = new int[field163];

    @OriginalMember(owner = "client!bb", name = "yb", descriptor = "I")
    public static int field176 = 0;

    @OriginalMember(owner = "client!bb", name = "fb", descriptor = "[Lrc;")
    public static class105[] field157 = new class105[field163];

    @OriginalMember(owner = "client!bb", name = "Gb", descriptor = "Lrc;")
    public static class105 field184 = field156;

    @OriginalMember(owner = "client!bb", name = "Ib", descriptor = "[I")
    public static int[] field186 = new int[field163];

    @OriginalMember(owner = "client!bb", name = "gb", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!bb", name = "ib", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!bb", name = "mb", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!bb", name = "nb", descriptor = "I")
    public int field165;

    @OriginalMember(owner = "client!bb", name = "ob", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!bb", name = "pb", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!bb", name = "rb", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!bb", name = "sb", descriptor = "I")
    public int field170;

    @OriginalMember(owner = "client!bb", name = "tb", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!bb", name = "xb", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!bb", name = "zb", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!bb", name = "Ab", descriptor = "I")
    public int field178;

    @OriginalMember(owner = "client!bb", name = "Bb", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!bb", name = "Cb", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!bb", name = "Hb", descriptor = "I")
    public int field185;

    @OriginalMember(owner = "client!bb", name = "ab", descriptor = "Lfc;")
    public static class34 field152;

    @OriginalMember(owner = "client!bb", name = "cb", descriptor = "Lfc;")
    public static class34 field154;

    @OriginalMember(owner = "client!bb", name = "jb", descriptor = "Ljc;")
    public static class57 field161;

    @OriginalMember(owner = "client!bb", name = "ub", descriptor = "Lpb;")
    public static class92 field172;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "(I)[Leb;", line = 8)
    public static final class27[] method115(int arg0) {
        field171++;
        if (arg0 > -80) {
            method118(101);
        }
        class27[] var1 = new class27[class86.field1944];
        for (int var2 = 0; var2 < class86.field1944; var2++) {
            class27 var3 = var1[var2] = new class27();
            var3.field611 = class107.field2460;
            var3.field612 = class113.field2648;
            var3.field609 = class43.field981[var2];
            var3.field615 = class113.field2646[var2];
            var3.field614 = class90.field2059[var2];
            var3.field610 = class50.field1057[var2];
            int var4 = var3.field614 * var3.field610;
            byte[] var5 = class85.field1908[var2];
            var3.field613 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var3.field613[var6] = class58.field1295[class100.method807(255, var5[var6])];
            }
        }
        method118(-1);
        return var1;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IB)V", line = 57)
    private final void method116(int arg0, byte arg1) {
        field167++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = var3;
        if (var5 < var3) {
            var7 = var5;
        }
        double var9 = var3;
        if (var5 > var3) {
            var9 = var5;
        }
        double var11 = (double) (arg0 & 0xFF) / 256.0D;
        if (arg1 <= 58) {
            this.method123(-75);
        }
        if (var9 < var11) {
            var9 = var11;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        if (var7 > var11) {
            var7 = var11;
        }
        double var17 = (var7 + var9) / 2.0D;
        if (var7 != var9) {
            if (var17 < 0.5D) {
                var15 = (var9 - var7) / (var7 + var9);
            }
            if (var3 == var9) {
                var13 = (var5 - var11) / (-var7 + var9);
            } else if (var5 == var9) {
                var13 = (var11 - var3) / (var9 - var7) + 2.0D;
            } else if (var9 == var11) {
                var13 = (var3 - var5) / (var9 - var7) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var9 - var7) / (2.0D - var9 - var7);
            }
        }
        double var19 = var13 / 6.0D;
        this.field165 = (int) (var17 * 256.0D);
        this.field185 = (int) (var15 * 256.0D);
        if (this.field185 < 0) {
            this.field185 = 0;
        } else if (this.field185 > 255) {
            this.field185 = 255;
        }
        if (this.field165 < 0) {
            this.field165 = 0;
        } else if (this.field165 > 255) {
            this.field165 = 255;
        }
        if (var17 > 0.5D) {
            this.field178 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field178 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field178 < 1) {
            this.field178 = 1;
        }
        this.field170 = (int) ((double) this.field178 * var19);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IILb;)V", line = 149)
    public final void method117(int arg0, int arg1, class7 arg2) {
        field160++;
        if (arg0 < 109) {
            return;
        }
        while (true) {
            int var4 = arg2.method96(27023);
            if (var4 == 0) {
                return;
            }
            this.method120(var4, arg1, arg2, true);
        }
    }

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "(I)V", line = 184)
    public static final void method118(int arg0) {
        field180++;
        class50.field1057 = null;
        class43.field981 = null;
        class85.field1908 = null;
        class90.field2059 = null;
        class113.field2646 = null;
        class58.field1295 = null;
        if (arg0 != -1) {
            method119(-14);
        }
    }

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "(I)V", line = 210)
    public static void method119(int arg0) {
        field154 = null;
        field157 = null;
        field181 = null;
        field159 = null;
        field172 = null;
        field161 = null;
        field168 = null;
        field151 = null;
        field182 = null;
        field152 = null;
        field162 = null;
        if (arg0 == 0) {
            field156 = null;
            field155 = null;
            field184 = null;
            field186 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IILb;Z)V", line = 234)
    private final void method120(int arg0, int arg1, class7 arg2, boolean arg3) {
        if (!arg3) {
            method124(null, -27);
        }
        if (arg0 == 1) {
            this.field153 = arg2.method84(95);
        }
        field179++;
    }

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "(I)Z", line = 274)
    public static final boolean method121(int arg0) {
        field166++;
        if (class24.field576 == null) {
            return false;
        }
        try {
            int var1 = class24.field576.method1032((byte) 91);
            if (~var1 == arg0) {
                return false;
            }
            if (class61.field1348 == -1) {
                class24.field576.method1040((byte) 115, class18.field389.field117, 1, 0);
                var1--;
                class18.field389.field143 = 0;
                class61.field1348 = class18.field389.method779(arg0 + 13271);
                class80.field1794 = class66.field1500[class61.field1348];
            }
            if (class80.field1794 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                var1--;
                class24.field576.method1040((byte) 119, class18.field389.field117, 1, 0);
                class80.field1794 = class18.field389.field117[0] & 0xFF;
            }
            if (class80.field1794 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                class24.field576.method1040((byte) 83, class18.field389.field117, 2, 0);
                class18.field389.field143 = 0;
                var1 -= 2;
                class80.field1794 = class18.field389.method101(2);
            }
            if (var1 < class80.field1794) {
                return false;
            }
            class18.field389.field143 = 0;
            class24.field576.method1040((byte) 61, class18.field389.field117, class80.field1794, 0);
            class134.field3291 = class66.field1494;
            class72.field1593 = 0;
            class66.field1494 = class28.field628;
            class28.field628 = class61.field1348;
            if (class61.field1348 == 50) {
                if (class134.field3265 == 12) {
                    class80.field1805 = true;
                }
                class43.field993 = class18.field389.method99((byte) 67);
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 48) {
                class61.method491(false, true);
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 84) {
                class107.method869(arg0 + 57);
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 148) {
                byte var2 = class18.field389.method72(119);
                int var3 = class18.field389.method67(arg0 + 1);
                class86.field1953[var3] = var2;
                if (class16.field337[var3] != var2) {
                    class16.field337[var3] = var2;
                    class61.method490(var3, arg0 + 27);
                    if (class51.field1069 != -1) {
                        class90.field2064 = true;
                    }
                    class80.field1805 = true;
                }
                class130.field3160 = class104.field2351;
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 2) {
                if (class1.field4 != -1) {
                    class118.method955(class1.field4, 3819);
                    class1.field4 = -1;
                }
                class85.field1901 = false;
                class43.field1003 = class43.field992;
                class98.field2257 = 1;
                class90.field2064 = true;
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 77) {
                int var4 = class18.field389.method101(2);
                class134.method1057(23165, var4);
                if (client.field424 != -1) {
                    class118.method955(client.field424, 3819);
                    class80.field1805 = true;
                    class98.field2263 = true;
                    client.field424 = -1;
                }
                if (class95.field2191 != -1) {
                    class118.method955(class95.field2191, 3819);
                    class95.field2191 = -1;
                    class136.method1069((byte) 45, 30);
                }
                if (class31.field746 != -1) {
                    class118.method955(class31.field746, arg0 ^ 0xFFFFF114);
                    class31.field746 = -1;
                }
                if (class18.field418 != -1) {
                    class118.method955(class18.field418, 3819);
                    class18.field418 = -1;
                }
                if (class1.field4 != var4) {
                    class118.method955(class1.field4, 3819);
                    class1.field4 = var4;
                }
                class85.field1909 = -1;
                class71.method603(class1.field4, (byte) 35);
                class61.field1348 = -1;
                class90.field2064 = true;
                return true;
            }
            if (class61.field1348 == 150) {
                long var5 = class18.field389.method71((byte) 109);
                class105 var7 = class45.method383((byte) -122, class18.field389).method835((byte) -35);
                client.method207(class65.method553(var5, arg0 ^ 0x7C50).method844(21975), -88, 6, var7);
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 186) {
                int var8 = class18.field389.method87(-3);
                class98.field2262 = class122.field2991.method313(-102, var8);
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 93) {
                int var9 = class18.field389.method87(arg0 ^ 0x2);
                int var10 = class18.field389.method67(~arg0);
                class119 var11 = class119.method964(65535, var9);
                class61.field1348 = -1;
                var11.field2848 = 1;
                var11.field2884 = var10;
                return true;
            }
            if (class61.field1348 == 240) {
                int var12 = class18.field389.method69((byte) 70);
                if (class51.field1069 != var12) {
                    class118.method955(class51.field1069, 3819);
                    class51.field1069 = var12;
                }
                class90.field2064 = true;
                class71.method603(class51.field1069, (byte) 35);
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 96) {
                class43.field982 = class18.field389.method65(false);
                class106.field2430 = class18.field389.method90(65);
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 243) {
                class106.field2430 = class18.field389.method65(false);
                class43.field982 = class18.field389.method65(false);
                while (class80.field1794 > class18.field389.field143) {
                    class61.field1348 = class18.field389.method96(27023);
                    class126.method1018((byte) -122);
                }
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 60) {
                long var13 = class18.field389.method71((byte) 53);
                int var15 = class18.field389.method101(arg0 ^ 0xFFFFFFFD);
                class105 var16 = class65.method553(var13, arg0 - 31824).method844(arg0 + 21976);
                for (int var17 = 0; var17 < class81.field1817; var17++) {
                    if (class12.field238[var17] == var13) {
                        if (class122.field2994[var17] != var15) {
                            class122.field2994[var17] = var15;
                            class80.field1805 = true;
                            if (var15 > 0) {
                                client.method207(class43.field992, arg0 ^ 0x47, 5, class108.method878(new class105[] { var16, class118.field2758 }, 2867));
                            }
                            if (var15 == 0) {
                                client.method207(class43.field992, arg0 - 122, 5, class108.method878(new class105[] { var16, class108.field2479 }, 2867));
                            }
                        }
                        var16 = null;
                        break;
                    }
                }
                if (var16 != null && class81.field1817 < 200) {
                    class12.field238[class81.field1817] = var13;
                    class86.field1938[class81.field1817] = var16;
                    class122.field2994[class81.field1817] = var15;
                    class81.field1817++;
                    class80.field1805 = true;
                }
                boolean var18 = false;
                while (!var18) {
                    var18 = true;
                    for (int var19 = 0; var19 < class81.field1817 - 1; var19++) {
                        if (class122.field2994[var19] != class76.field1704 && class122.field2994[var19 + 1] == class76.field1704 || class122.field2994[var19] == 0 && class122.field2994[var19 + 1] != 0) {
                            var18 = false;
                            int var20 = class122.field2994[var19];
                            class122.field2994[var19] = class122.field2994[var19 + 1];
                            class122.field2994[var19 + 1] = var20;
                            class105 var21 = class86.field1938[var19];
                            class86.field1938[var19] = class86.field1938[var19 + 1];
                            class86.field1938[var19 + 1] = var21;
                            long var22 = class12.field238[var19];
                            class12.field238[var19] = class12.field238[var19 + 1];
                            class12.field238[var19 + 1] = var22;
                            class80.field1805 = true;
                        }
                    }
                }
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 128) {
                class117.field2738 = true;
                class66.field1498 = class18.field389.method96(27023);
                class41.field924 = class18.field389.method96(27023);
                class22.field544 = class18.field389.method101(2);
                class89.field2051 = class18.field389.method96(arg0 ^ 0xFFFF9670);
                class39.field908 = class18.field389.method96(arg0 ^ 0xFFFF9670);
                if (class39.field908 >= 100) {
                    class78.field1755 = class41.field924 * 128 + 64;
                    class113.field2658 = class66.field1498 * 128 + 64;
                    class10.field214 = class134.method1061(11387, class73.field1619, class113.field2658, class78.field1755) - class22.field544;
                }
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 176) {
                if (client.field424 != -1) {
                    class118.method955(client.field424, arg0 + 3820);
                    client.field424 = -1;
                    class80.field1805 = true;
                    class98.field2263 = true;
                }
                if (class1.field4 != -1) {
                    class118.method955(class1.field4, 3819);
                    class1.field4 = -1;
                    class90.field2064 = true;
                }
                if (class95.field2191 != -1) {
                    class118.method955(class95.field2191, 3819);
                    class95.field2191 = -1;
                    class136.method1069((byte) 45, 30);
                }
                if (class31.field746 != -1) {
                    class118.method955(class31.field746, 3819);
                    class31.field746 = -1;
                }
                if (class18.field418 != -1) {
                    class118.method955(class18.field418, arg0 ^ 0xFFFFF114);
                    class18.field418 = -1;
                }
                class85.field1909 = -1;
                class61.field1348 = -1;
                if (class98.field2257 != 0) {
                    class90.field2064 = true;
                    class98.field2257 = 0;
                }
                return true;
            }
            if (class61.field1348 == 170) {
                int var24 = class18.field389.method103(0);
                if (var24 == 65535) {
                    var24 = -1;
                }
                class90.method744(arg0 + 20429, var24);
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 208) {
                int var25 = class18.field389.method108((byte) -128);
                int var26 = class18.field389.method84(69);
                if (var25 == 65535) {
                    var25 = -1;
                }
                class127.method1022(var26, var25, false);
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 152) {
                class105 var27 = class18.field389.method62((byte) 117);
                int var28 = class18.field389.method90(arg0 ^ 0xFFFFFFB6);
                int var29 = class18.field389.method96(27023);
                if (var28 >= 1 && var28 <= 5) {
                    if (var27.method831(class85.field1919, -21607)) {
                        var27 = null;
                    }
                    class92.field2110[var28 - 1] = var27;
                    class89.field2053[var28 - 1] = var29 == 0;
                }
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 78) {
                if (class1.field4 != -1) {
                    class118.method955(class1.field4, 3819);
                    class1.field4 = -1;
                }
                class98.field2257 = 2;
                class61.field1348 = -1;
                class43.field1003 = class43.field992;
                class85.field1901 = false;
                class90.field2064 = true;
                return true;
            }
            if (class61.field1348 == 226) {
                class80.field1805 = true;
                int var30 = class18.field389.method65(false);
                int var31 = class18.field389.method90(arg0 + 87);
                int var32 = class18.field389.method63(-36);
                class96.field2222[var31] = var32;
                class109.field2508[var31] = var30;
                class116.field2719[var31] = 1;
                for (int var33 = 0; var33 < 98; var33++) {
                    if (class22.field528[var33] <= var32) {
                        class116.field2719[var31] = var33 + 2;
                    }
                }
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 247) {
                int var34 = class18.field389.method103(0);
                int var35 = class18.field389.method80((byte) 26);
                int var36 = class18.field389.method87(-3);
                if (var34 == 65535) {
                    var34 = -1;
                }
                class119 var37 = class119.method964(arg0 + 65536, var36);
                if (var37.field2800) {
                    var37.field2779 = var34;
                    var37.field2882 = var35;
                } else if (var34 == -1) {
                    class61.field1348 = -1;
                    var37.field2848 = 0;
                    return true;
                } else {
                    class31 var38 = class75.method636(var34, 0);
                    var37.field2809 = var38.field756;
                    var37.field2848 = 4;
                    var37.field2869 = var38.field754 * 100 / var35;
                    var37.field2884 = var34;
                    var37.field2823 = var38.field758;
                }
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 232) {
                class17.field361 = class80.field1794 / 8;
                for (int var39 = 0; var39 < class17.field361; var39++) {
                    class37.field866[var39] = class18.field389.method71((byte) 95);
                }
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 74) {
                int var40 = class18.field389.method65(false);
                int var41 = class18.field389.method103(0);
                if (var41 == 65535) {
                    var41 = -1;
                }
                if (class120.field2901[var40] != var41) {
                    class118.method955(class120.field2901[var40], 3819);
                    class120.field2901[var40] = var41;
                }
                class98.field2263 = true;
                class80.field1805 = true;
                class71.method603(class120.field2901[var40], (byte) 35);
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 86) {
                class93.method774(-16);
                class61.field1348 = -1;
                return false;
            }
            if (class61.field1348 == 155) {
                int var42 = class18.field389.method67(0);
                int var43 = class18.field389.method108((byte) -128);
                class134.method1057(arg0 ^ 0xFFFFA582, var43);
                if (var42 != -1) {
                    class134.method1057(23165, var42);
                }
                if (class18.field418 != -1) {
                    class118.method955(class18.field418, 3819);
                    class18.field418 = -1;
                }
                if (client.field424 != -1) {
                    class118.method955(client.field424, 3819);
                    client.field424 = -1;
                }
                if (class1.field4 != -1) {
                    class118.method955(class1.field4, 3819);
                    class1.field4 = -1;
                }
                if (class95.field2191 != var43) {
                    class118.method955(class95.field2191, 3819);
                    class95.field2191 = var43;
                    class136.method1069((byte) 45, 35);
                }
                if (class31.field746 != var43) {
                    class118.method955(class31.field746, arg0 + 3820);
                    class31.field746 = var42;
                }
                class98.field2257 = 0;
                class85.field1909 = -1;
                class71.method603(class95.field2191, (byte) 35);
                class71.method603(class31.field746, (byte) 35);
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 139) {
                long var44 = class18.field389.method71((byte) 85);
                long var46 = (long) class18.field389.method101(2);
                boolean var48 = false;
                long var49 = (long) class18.field389.method84(122);
                int var51 = class18.field389.method96(27023);
                long var52 = (var46 << 32) + var49;
                for (int var54 = 0; var54 < 100; var54++) {
                    if (class126.field3063[var54] == var52) {
                        var48 = true;
                        break;
                    }
                }
                if (var51 <= 1) {
                    for (int var55 = 0; var55 < class17.field361; var55++) {
                        if (class37.field866[var55] == var44) {
                            var48 = true;
                            break;
                        }
                    }
                }
                if (!var48 && class110.field2556 == 0) {
                    class126.field3063[class64.field1443] = var52;
                    class64.field1443 = (class64.field1443 + 1) % 100;
                    class105 var56 = class45.method383((byte) -128, class18.field389).method835((byte) -125);
                    if (var51 == 2 || var51 == 3) {
                        client.method207(class108.method878(new class105[] { class43.field998, class65.method553(var44, -31825).method844(arg0 + 21976) }, arg0 ^ 0xFFFFF4CC), -118, 7, var56);
                    } else if (var51 == 1) {
                        client.method207(class108.method878(new class105[] { class80.field1796, class65.method553(var44, -31825).method844(21975) }, 2867), -42, 7, var56);
                    } else {
                        client.method207(class65.method553(var44, -31825).method844(21975), arg0 - 123, 3, var56);
                    }
                }
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 22) {
                for (int var57 = 0; var57 < class111.field2575; var57++) {
                    class43 var58 = class57.method459((byte) -118, var57);
                    if (var58 != null && var58.field989 == 0) {
                        class86.field1953[var57] = 0;
                        class16.field337[var57] = 0;
                    }
                }
                class61.field1348 = -1;
                class80.field1805 = true;
                if (class51.field1069 != -1) {
                    class90.field2064 = true;
                }
                return true;
            }
            if (class61.field1348 == 252) {
                int var59 = class18.field389.method80((byte) 26);
                int var60 = class18.field389.method95(2104);
                class119 var61 = class119.method964(65535, var59);
                class61.field1348 = -1;
                if (var61.field2844 != var60 || var60 == -1) {
                    var61.field2877 = 0;
                    var61.field2878 = 0;
                    var61.field2844 = var60;
                }
                return true;
            }
            if (class61.field1348 == 145) {
                class134.field3265 = class18.field389.method96(27023);
                class80.field1805 = true;
                class61.field1348 = -1;
                class98.field2263 = true;
                return true;
            }
            if (class61.field1348 == 16) {
                class17.field370 = class18.field389.method96(27023);
                class134.field3270 = class18.field389.method96(27023);
                class55.field1106 = class18.field389.method96(27023);
                class37.field868 = true;
                class61.field1348 = -1;
                class90.field2064 = true;
                return true;
            }
            if (class61.field1348 == 18) {
                class29.field657 = class18.field389.method103(0);
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 95) {
                class105 var62 = class18.field389.method62((byte) 109);
                if (var62.method855(class6.field70, 0)) {
                    class105 var74 = var62.method860(0, false, var62.method834((byte) 127, class18.field413));
                    long var75 = var74.method828(455);
                    boolean var77 = false;
                    for (int var78 = 0; var78 < class17.field361; var78++) {
                        if (class37.field866[var78] == var75) {
                            var77 = true;
                            break;
                        }
                    }
                    if (!var77 && class110.field2556 == 0) {
                        client.method207(var74, -76, 4, class109.field2511);
                    }
                } else if (var62.method855(class57.field1189, 0)) {
                    class105 var63 = var62.method860(0, false, var62.method834((byte) 126, class18.field413));
                    long var64 = var63.method828(455);
                    boolean var66 = false;
                    for (int var67 = 0; var67 < class17.field361; var67++) {
                        if (class37.field866[var67] == var64) {
                            var66 = true;
                            break;
                        }
                    }
                    if (!var66 && class110.field2556 == 0) {
                        client.method207(var63, arg0 ^ 0x32, 8, field184);
                    }
                } else if (var62.method855(class117.field2733, 0)) {
                    class105 var68 = var62.method860(0, false, var62.method834((byte) 127, class18.field413));
                    long var69 = var68.method828(arg0 + 456);
                    boolean var71 = false;
                    for (int var72 = 0; var72 < class17.field361; var72++) {
                        if (class37.field866[var72] == var69) {
                            var71 = true;
                            break;
                        }
                    }
                    if (!var71 && class110.field2556 == 0) {
                        class105 var73 = var62.method860(var62.method834((byte) 125, class18.field413) + 1, false, var62.method863(-125) - 9);
                        client.method207(var68, -83, 8, var73);
                    }
                } else {
                    client.method207(class43.field992, -88, 0, var62);
                }
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 217 || class61.field1348 == 218 || class61.field1348 == 221 || class61.field1348 == 103 || class61.field1348 == 172 || class61.field1348 == 23 || class61.field1348 == 214 || class61.field1348 == 134 || class61.field1348 == 75 || class61.field1348 == 36 || class61.field1348 == 59) {
                class126.method1018((byte) 67);
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 69) {
                class108.field2482 = class18.field389.method96(arg0 ^ 0xFFFF9670);
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 180) {
                class111.field2585 = class18.field389.method96(27023);
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 238) {
                int var79 = class18.field389.method103(0);
                int var80 = class18.field389.method87(-3);
                class119 var81 = class119.method964(65535, var80);
                if (var81 != null && var81.field2811 == 0) {
                    if (var79 < 0) {
                        var79 = 0;
                    }
                    if (var81.field2865 - var81.field2787 < var79) {
                        var79 = var81.field2865 - var81.field2787;
                    }
                    var81.field2838 = var79;
                }
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 250) {
                int var82 = class18.field389.method108((byte) -127);
                int var83 = class18.field389.method104(arg0 - 1698);
                int var84 = class18.field389.method108((byte) -125);
                class119 var85 = class119.method964(65535, var83);
                var85.field2801 = (var82 << 16) + var84;
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 177) {
                int var86 = class18.field389.method103(0);
                class134.method1057(arg0 + 23166, var86);
                if (client.field424 != -1) {
                    class118.method955(client.field424, 3819);
                    client.field424 = -1;
                    class80.field1805 = true;
                    class98.field2263 = true;
                }
                if (class1.field4 != -1) {
                    class118.method955(class1.field4, 3819);
                    class1.field4 = -1;
                    class90.field2064 = true;
                }
                if (class95.field2191 != -1) {
                    class118.method955(class95.field2191, 3819);
                    class95.field2191 = -1;
                    class136.method1069((byte) 45, 30);
                }
                if (class31.field746 != -1) {
                    class118.method955(class31.field746, 3819);
                    class31.field746 = -1;
                }
                if (class18.field418 != var86) {
                    class118.method955(class18.field418, arg0 + 3820);
                    class18.field418 = var86;
                }
                class85.field1909 = -1;
                if (class98.field2257 != 0) {
                    class98.field2257 = 0;
                    class90.field2064 = true;
                }
                class71.method603(class18.field418, (byte) 35);
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 39) {
                int var87 = class18.field389.method108((byte) -124);
                int var88 = class18.field389.method87(arg0 - 2);
                class86.field1953[var87] = var88;
                if (class16.field337[var87] != var88) {
                    class16.field337[var87] = var88;
                    class61.method490(var87, arg0 + 27);
                    class80.field1805 = true;
                    if (class51.field1069 != -1) {
                        class90.field2064 = true;
                    }
                }
                class61.field1348 = -1;
                class130.field3160 = class104.field2351;
                return true;
            }
            if (class61.field1348 == 57) {
                class89.field2049 = class18.field389.method90(125);
                class61.field1348 = -1;
                if (class89.field2049 == class134.field3265) {
                    class80.field1805 = true;
                    if (class89.field2049 == 3) {
                        class134.field3265 = 1;
                    } else {
                        class134.field3265 = 3;
                    }
                }
                return true;
            }
            if (class61.field1348 == 205) {
                int var89 = class18.field389.method101(2);
                int var90 = class18.field389.method96(arg0 ^ 0xFFFF9670);
                int var91 = class18.field389.method101(arg0 + 3);
                class121.method976(var89, var91, var90, (byte) 125);
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 229) {
                int var92 = class18.field389.method96(27023);
                int var93 = class18.field389.method96(arg0 + 27024);
                int var94 = class18.field389.method96(27023);
                int var95 = class18.field389.method96(arg0 + 27024);
                class110.field2553[var92] = true;
                class80.field1797[var92] = var93;
                class113.field2653[var92] = var94;
                class118.field2762[var92] = var95;
                class104.field2358[var92] = 0;
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 200) {
                class88.field2006 = class18.field389.method96(27023);
                class61.field1348 = -1;
                class80.field1805 = true;
                return true;
            }
            if (class61.field1348 == 123) {
                class24.field580 = class18.field389.method67(0) * 30;
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 188) {
                int var96 = class18.field389.method101(2);
                int var97 = class18.field389.method101(2);
                if (class1.field4 != -1) {
                    class118.method955(class1.field4, 3819);
                    class1.field4 = -1;
                    class90.field2064 = true;
                }
                if (class95.field2191 != -1) {
                    class118.method955(class95.field2191, 3819);
                    class95.field2191 = -1;
                    class136.method1069((byte) 45, 30);
                }
                if (class31.field746 != -1) {
                    class118.method955(class31.field746, 3819);
                    class31.field746 = -1;
                }
                if (class18.field418 != var96) {
                    class118.method955(class18.field418, arg0 ^ 0xFFFFF114);
                    class18.field418 = var96;
                }
                if (client.field424 != var97) {
                    class118.method955(client.field424, arg0 + 3820);
                    client.field424 = var97;
                }
                class98.field2263 = true;
                class80.field1805 = true;
                class85.field1909 = -1;
                if (class98.field2257 != 0) {
                    class90.field2064 = true;
                    class98.field2257 = 0;
                }
                class71.method603(class18.field418, (byte) 35);
                class71.method603(client.field424, (byte) 35);
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 52) {
                class80.field1805 = true;
                int var98 = class18.field389.method104(-1699);
                int var99 = class18.field389.method101(arg0 + 3);
                class119 var100;
                if (var98 >= 0) {
                    var100 = class119.method964(65535, var98);
                } else {
                    var100 = null;
                }
                while (class18.field389.field143 < class80.field1794) {
                    int var101 = class18.field389.method66(arg0 - 690477039);
                    int var102 = 0;
                    int var103 = class18.field389.method101(arg0 + 3);
                    if (var103 != 0) {
                        var102 = class18.field389.method96(arg0 + 27024);
                        if (var102 == 255) {
                            var102 = class18.field389.method104(-1699);
                        }
                    }
                    if (var100 != null && var101 >= 0 && var101 < var100.field2770.length) {
                        var100.field2770[var101] = var103;
                        var100.field2804[var101] = var102;
                    }
                    class115.method935(var102, -87, var101, var99, var103 - 1);
                }
                class74.field1640 = class104.field2351;
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 113) {
                class80.field1805 = true;
                int var104 = class18.field389.method104(-1699);
                int var105 = class18.field389.method101(2);
                class119 var106;
                if (var104 >= 0) {
                    var106 = class119.method964(65535, var104);
                } else {
                    var106 = null;
                }
                if (var106 != null) {
                    for (int var107 = 0; var107 < var106.field2770.length; var107++) {
                        var106.field2770[var107] = 0;
                        var106.field2804[var107] = 0;
                    }
                }
                class136.method1067((byte) -8, var105);
                int var108 = class18.field389.method101(arg0 + 3);
                for (int var109 = 0; var109 < var108; var109++) {
                    int var110 = class18.field389.method90(58);
                    if (var110 == 255) {
                        var110 = class18.field389.method63(-71);
                    }
                    int var111 = class18.field389.method67(0);
                    if (var106 != null && var106.field2770.length > var109) {
                        var106.field2770[var109] = var111;
                        var106.field2804[var109] = var110;
                    }
                    class115.method935(var110, -91, var109, var105, var111 - 1);
                }
                class74.field1640 = class104.field2351;
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 143) {
                int var112 = class18.field389.method87(arg0 ^ 0x2);
                class119 var113 = class119.method964(65535, var112);
                for (int var114 = 0; var114 < var113.field2770.length; var114++) {
                    var113.field2770[var114] = -1;
                    var113.field2770[var114] = 0;
                }
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 97) {
                int var115 = class18.field389.method80((byte) 26);
                class119 var116 = class119.method964(65535, var115);
                var116.field2848 = 3;
                var116.field2884 = class119.field2842.field296.method145(-67);
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 207) {
                class43.field982 = class18.field389.method65(false);
                class106.field2430 = class18.field389.method96(27023);
                for (int var117 = class43.field982; var117 < class43.field982 + 8; var117++) {
                    for (int var118 = class106.field2430; var118 < class106.field2430 + 8; var118++) {
                        if (class126.field3060[class73.field1619][var117][var118] != null) {
                            class126.field3060[class73.field1619][var117][var118] = null;
                            class86.method713(var118, var117, 1610612736);
                        }
                    }
                }
                for (class104 var119 = (class104) class130.field3151.method31(1280); var119 != null; var119 = (class104) class130.field3151.method26((byte) 108)) {
                    if (class43.field982 <= var119.field2348 && var119.field2348 < class43.field982 + 8 && class106.field2430 <= var119.field2344 && var119.field2344 < class106.field2430 + 8 && class73.field1619 == var119.field2355) {
                        var119.field2341 = 0;
                    }
                }
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 212) {
                int var120 = class18.field389.method87(-3);
                int var121 = class18.field389.method103(0);
                int var122 = var121 >> 10 & 0x1F;
                int var123 = var121 >> 5 & 0x1F;
                int var124 = var121 & 0x1F;
                class119 var125 = class119.method964(65535, var120);
                class61.field1348 = -1;
                var125.field2817 = (var124 << 3) + (var122 << 19) + (var123 << 11);
                return true;
            }
            if (class61.field1348 == 56) {
                int var126 = class18.field389.method67(0);
                class134.method1057(arg0 ^ 0xFFFFA582, var126);
                if (class1.field4 != -1) {
                    class118.method955(class1.field4, 3819);
                    class1.field4 = -1;
                    class90.field2064 = true;
                }
                if (class95.field2191 != -1) {
                    class118.method955(class95.field2191, 3819);
                    class95.field2191 = -1;
                    class136.method1069((byte) 45, 30);
                }
                if (class31.field746 != -1) {
                    class118.method955(class31.field746, 3819);
                    class31.field746 = -1;
                }
                if (class18.field418 != -1) {
                    class118.method955(class18.field418, 3819);
                    class18.field418 = -1;
                }
                if (client.field424 != var126) {
                    class118.method955(client.field424, 3819);
                    client.field424 = var126;
                }
                class80.field1805 = true;
                class85.field1909 = -1;
                if (class98.field2257 != 0) {
                    class98.field2257 = 0;
                    class90.field2064 = true;
                }
                class98.field2263 = true;
                class71.method603(client.field424, (byte) 35);
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 68) {
                class88.method726(class18.field389, class122.field2991, -4, class80.field1794);
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 29) {
                for (int var127 = 0; var127 < class16.field337.length; var127++) {
                    if (class86.field1953[var127] != class16.field337[var127]) {
                        class16.field337[var127] = class86.field1953[var127];
                        class61.method490(var127, 26);
                        class80.field1805 = true;
                    }
                }
                class130.field3160 = class104.field2351;
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 47) {
                class117.field2738 = false;
                for (int var128 = 0; var128 < 5; var128++) {
                    class110.field2553[var128] = false;
                }
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 5) {
                for (int var129 = 0; var129 < class58.field1303.length; var129++) {
                    if (class58.field1303[var129] != null) {
                        class58.field1303[var129].field1238 = -1;
                    }
                }
                for (int var130 = 0; var130 < class19.field466.length; var130++) {
                    if (class19.field466[var130] != null) {
                        class19.field466[var130].field1238 = -1;
                    }
                }
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 244) {
                int var131 = class18.field389.method67(0);
                int var132 = class18.field389.method87(arg0 ^ 0x2);
                class119 var133 = class119.method964(65535, var132);
                var133.field2848 = 2;
                class61.field1348 = -1;
                var133.field2884 = var131;
                return true;
            }
            if (class61.field1348 == 28) {
                class61.field1348 = -1;
                class12.field243 = 0;
                return true;
            }
            if (class61.field1348 == 171) {
                int var134 = class18.field389.method98(true);
                int var135 = class18.field389.method99((byte) 84);
                int var136 = class18.field389.method63(-44);
                class119 var137 = class119.method964(65535, var136);
                class61.field1348 = -1;
                var137.field2810 = var137.field2788 + var134;
                var137.field2862 = var137.field2849 + var135;
                return true;
            }
            if (class61.field1348 == 31) {
                int var138 = class18.field389.method67(0);
                int var139 = class18.field389.method101(arg0 + 3);
                int var140 = class18.field389.method108((byte) -124);
                int var141 = class18.field389.method63(-107);
                class119 var142 = class119.method964(65535, var141);
                var142.field2809 = var138;
                var142.field2823 = var139;
                var142.field2869 = var140;
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 248) {
                int var143 = class18.field389.method103(0);
                class19.method221(-24, var143);
                class74.field1640 = class104.field2351;
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 43) {
                class61.method491(false, false);
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 201) {
                if (class134.field3265 == 12) {
                    class80.field1805 = true;
                }
                class37.field864 = class18.field389.method96(27023);
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 9) {
                class83.method699((byte) 63);
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 35) {
                class132.field3172 = class18.field389.method96(27023);
                if (class132.field3172 == 1) {
                    class83.field1866 = class18.field389.method101(2);
                }
                if (class132.field3172 >= 2 && class132.field3172 <= 6) {
                    if (class132.field3172 == 2) {
                        class43.field985 = 64;
                        class66.field1485 = 64;
                    }
                    if (class132.field3172 == 3) {
                        class43.field985 = 0;
                        class66.field1485 = 64;
                    }
                    if (class132.field3172 == 4) {
                        class66.field1485 = 64;
                        class43.field985 = 128;
                    }
                    if (class132.field3172 == 5) {
                        class66.field1485 = 0;
                        class43.field985 = 64;
                    }
                    if (class132.field3172 == 6) {
                        class43.field985 = 64;
                        class66.field1485 = 128;
                    }
                    class132.field3172 = 2;
                    class66.field1476 = class18.field389.method101(2);
                    class45.field1018 = class18.field389.method101(2);
                    class23.field559 = class18.field389.method96(arg0 ^ 0xFFFF9670);
                }
                if (class132.field3172 == 10) {
                    class132.field3182 = class18.field389.method101(arg0 ^ 0xFFFFFFFD);
                }
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 157) {
                int var144 = class18.field389.method98(true);
                if (var144 >= 0) {
                    class134.method1057(23165, var144);
                }
                if (class6.field71 != var144) {
                    class118.method955(class6.field71, 3819);
                    class6.field71 = var144;
                }
                class71.method603(class6.field71, (byte) 35);
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 151) {
                int var145 = class18.field389.method90(arg0 + 97);
                int var146 = class18.field389.method65(false);
                int var147 = class18.field389.method106((byte) -108);
                class73.field1619 = var146 >> 1;
                class119.field2842.method469((byte) 57, var147, (var146 & 0x1) == 1, var145);
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 92) {
                class117.field2738 = true;
                class61.field1357 = class18.field389.method96(27023);
                class37.field859 = class18.field389.method96(27023);
                class6.field72 = class18.field389.method101(2);
                class130.field3157 = class18.field389.method96(27023);
                class57.field1208 = class18.field389.method96(27023);
                if (class57.field1208 >= 100) {
                    int var148 = class37.field859 * 128 + 64;
                    int var149 = class61.field1357 * 128 + 64;
                    int var150 = class134.method1061(arg0 + 11388, class73.field1619, var149, var148) - class6.field72;
                    int var151 = var149 - class113.field2658;
                    int var152 = var150 - class10.field214;
                    int var153 = var148 - class78.field1755;
                    int var154 = (int) Math.sqrt((double) (var151 * var151 + var153 * var153));
                    class100.field2291 = (int) (Math.atan2((double) var152, (double) var154) * 325.949D) & 0x7FF;
                    class3.field52 = (int) (-325.949D * Math.atan2((double) var151, (double) var153)) & 0x7FF;
                    if (class100.field2291 < 128) {
                        class100.field2291 = 128;
                    }
                    if (class100.field2291 > 383) {
                        class100.field2291 = 383;
                    }
                }
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 253) {
                int var155 = class18.field389.method104(-1699);
                boolean var156 = class18.field389.method65(false) == 1;
                class119 var157 = class119.method964(arg0 + 65536, var155);
                var157.field2815 = var156;
                class61.field1348 = -1;
                return true;
            }
            if (class61.field1348 == 37) {
                class105 var158 = class18.field389.method62((byte) 111);
                int var159 = class18.field389.method87(arg0 - 2);
                class119 var160 = class119.method964(65535, var159);
                var160.field2864 = var158;
                if (var159 >> 16 == class120.field2901[class134.field3265]) {
                    class80.field1805 = true;
                }
                class61.field1348 = -1;
                return true;
            }
            class19.method225(0, "T1 - " + class61.field1348 + "," + class66.field1494 + "," + class134.field3291 + " - " + class80.field1794, null);
            class93.method774(-16);
        } catch (IOException var164) {
            class110.method909(arg0 - 23358);
        } catch (Exception var165) {
            String var162 = "T2 - " + class61.field1348 + "," + class66.field1494 + "," + class134.field3291 + " - " + class80.field1794 + "," + (class119.field2842.field1281[0] + class23.field562) + "," + (class107.field2466 + class119.field2842.field1261[0]) + " - ";
            for (int var163 = 0; var163 < class80.field1794 && var163 < 50; var163++) {
                var162 = var162 + class18.field389.field117[var163] + ",";
            }
            class19.method225(arg0 + 1, var162, var165);
            class93.method774(-16);
        }
        return true;
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(B)V", line = 2081)
    public static final void method122(byte arg0) {
        field177++;
        class17.field349 = new class74(32);
        if (arg0 < 103) {
            method119(1);
        }
    }

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "(I)V", line = 2101)
    public final void method123(int arg0) {
        if (arg0 != -14304) {
            method124(null, 66);
        }
        field158++;
        this.method116(this.field153, (byte) 64);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lpb;I)I", line = 2115)
    public static final int method124(class92 arg0, int arg1) {
        if (arg1 != -11289) {
            method115(-116);
        }
        field175++;
        int var2 = 0;
        if (arg0.method756(class105.field2396, -30836, class59.field1308)) {
            var2++;
        }
        if (arg0.method756(class111.field2608, arg1 - 19547, class59.field1308)) {
            var2++;
        }
        if (arg0.method756(class76.field1697, -30836, class59.field1308)) {
            var2++;
        }
        if (arg0.method756(class87.field1980, -30836, class59.field1308)) {
            var2++;
        }
        if (arg0.method756(class117.field2744, -30836, class59.field1308)) {
            var2++;
        }
        if (arg0.method756(class58.field1305, -30836, class59.field1308)) {
            var2++;
        }
        if (arg0.method756(class84.field1890, -30836, class59.field1308)) {
            var2++;
        }
        if (arg0.method756(class65.field1455, arg1 ^ 0x546B, class59.field1308)) {
            var2++;
        }
        if (arg0.method756(class26.field607, -30836, class59.field1308)) {
            var2++;
        }
        if (arg0.method756(class98.field2264, -30836, class59.field1308)) {
            var2++;
        }
        if (arg0.method756(class136.field3333, -30836, class59.field1308)) {
            var2++;
        }
        if (arg0.method756(class89.field2047, arg1 - 19547, class59.field1308)) {
            var2++;
        }
        if (arg0.method756(class109.field2501, arg1 ^ 0x546B, class59.field1308)) {
            var2++;
        }
        if (arg0.method756(class59.field1311, -30836, class59.field1308)) {
            var2++;
        }
        if (arg0.method756(class128.field3108, -30836, class59.field1308)) {
            var2++;
        }
        if (arg0.method756(class16.field328, -30836, class59.field1308)) {
            var2++;
        }
        if (arg0.method756(class16.field338, -30836, class59.field1308)) {
            var2++;
        }
        if (arg0.method756(class92.field2148, -30836, class59.field1308)) {
            var2++;
        }
        if (arg0.method756(class6.field78, -30836, class59.field1308)) {
            var2++;
        }
        return var2;
    }
}
