import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class48 {

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    private int field864;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "[[I")
    private int[][] field865;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    private int field867;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "Z")
    public static boolean field868 = true;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "[I")
    public static int[] field866 = new int[100];

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
    public static int field875 = 0;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "Lsg;")
    private static class169 field876 = class165.method1060("Username: ", 1536);

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "Lsg;")
    public static class169 field872 = field876;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "Lsg;")
    public static class169 field874 = class165.method1060("Bitte versuchen Sie es erneut)3", 1536);

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "[Z")
    public static boolean[] field871;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V")
    public static final void method302(byte arg0) {
        field869++;
        if (class70.field1315 == 0) {
            class196.field3840 = new class133(4, 104, 104, class139.field2588);
            for (int var1 = 0; var1 < 4; var1++) {
                client.field575[var1] = new class191(104, 104);
            }
            class87.field1598 = new class18(512, 512);
            class43.field811 = class43.field808;
            class55.field1006 = 5;
            class70.field1315 = 20;
        } else if (class70.field1315 == 20) {
            int[] var2 = new int[9];
            for (int var3 = 0; var3 < 9; var3++) {
                int var4 = var3 * 32 + 15 + 128;
                int var5 = class12.field279[var4];
                int var6 = var4 * 3 + 600;
                var2[var3] = var5 * var6 >> 16;
            }
            class133.method866(var2, 500, 800, 512, 334, 25, 3500);
            class55.field1006 = 10;
            class70.field1315 = 30;
            class43.field811 = class205.field4010;
        } else if (class70.field1315 == 30) {
            class127.field2374 = class206.method1341(0, (byte) 104, false, true, true);
            class94.field1750 = class206.method1341(1, (byte) 114, false, true, true);
            class8.field221 = class206.method1341(2, (byte) 96, true, true, false);
            class201.field3916 = class206.method1341(3, (byte) -12, false, true, true);
            class62.field1143 = class206.method1341(4, (byte) 110, false, true, true);
            class137.field2555 = class206.method1341(5, (byte) -55, true, true, true);
            class201.field3923 = class206.method1341(6, (byte) -59, true, false, true);
            class187.field3632 = class206.method1341(7, (byte) -92, false, true, true);
            class104.field1907 = class206.method1341(8, (byte) 88, false, true, true);
            class16.field339 = class206.method1341(9, (byte) 99, true, true, false);
            class125.field2288 = class206.method1341(10, (byte) 125, false, true, true);
            class142.field2655 = class206.method1341(11, (byte) 109, false, true, true);
            class45.field842 = class206.method1341(12, (byte) -70, false, true, true);
            class29.field602 = class206.method1341(13, (byte) 93, true, true, false);
            class183.field3562 = class206.method1341(14, (byte) 106, false, false, true);
            class89.field1629 = class206.method1341(15, (byte) -57, false, true, true);
            class70.field1315 = 40;
            class43.field811 = class43.field801;
            class55.field1006 = 20;
        } else if (class70.field1315 == 40) {
            byte var7 = 0;
            int var8 = var7 + class127.field2374.method966(100) * 4 / 100;
            int var9 = var8 + class94.field1750.method966(100) * 4 / 100;
            int var10 = var9 + class8.field221.method966(100) * 2 / 100;
            int var11 = var10 + class201.field3916.method966(100) * 2 / 100;
            int var12 = var11 + class62.field1143.method966(100) * 6 / 100;
            int var13 = var12 + class137.field2555.method966(100) * 4 / 100;
            int var14 = var13 + class201.field3923.method966(100) * 2 / 100;
            int var15 = var14 + class187.field3632.method966(100) * 60 / 100;
            int var16 = var15 + class104.field1907.method966(100) * 2 / 100;
            int var17 = var16 + class16.field339.method966(100) * 2 / 100;
            int var18 = var17 + class125.field2288.method966(100) * 2 / 100;
            int var19 = var18 + class142.field2655.method966(100) * 2 / 100;
            int var20 = var19 + class45.field842.method966(100) * 2 / 100;
            int var21 = var20 + class29.field602.method966(100) * 2 / 100;
            int var22 = var21 + class183.field3562.method966(100) * 2 / 100;
            int var23 = var22 + class89.field1629.method966(100) * 2 / 100;
            if (var23 == 100) {
                class43.field811 = class199.field3896;
                class70.field1315 = 45;
                class55.field1006 = 30;
            } else {
                if (var23 != 0) {
                    class43.field811 = class165.method1058(0, new class169[] { class15.field321, class2.method18((byte) -62, var23), class37.field714 });
                }
                class55.field1006 = 30;
            }
        } else if (class70.field1315 == 45) {
            class104.method613(2, !class105.field1925, 22050, (byte) -32);
            class167 var24 = new class167();
            var24.method1073(9, -125, 128);
            class20.field438 = class127.method823(22050, class163.field3134, class1.field4, 0, 31091);
            class20.field438.method1224(var24, -112);
            class191.method1264(class62.field1143, -1, class183.field3562, var24, class89.field1629);
            class149.field2762 = class127.method823(2048, class163.field3134, class1.field4, 1, 31091);
            class175.field3425 = new class198();
            class149.field2762.method1224(class175.field3425, -113);
            class172.field3319 = new class48(22050, class70.field1313);
            class43.field811 = class183.field3563;
            class70.field1315 = 50;
            class55.field1006 = 35;
        } else if (class70.field1315 == 50) {
            int var25 = 0;
            if (class114.field2087 == null) {
                class114.field2087 = class45.method284((byte) -72, class182.field3541, class45.field838, class104.field1907, class29.field602);
            } else {
                var25++;
            }
            if (class137.field2547 == null) {
                class137.field2547 = class114.field2087;
            } else {
                var25++;
            }
            if (class96.field1823 == null) {
                class96.field1823 = class45.method284((byte) -72, class110.field2011, class45.field838, class104.field1907, class29.field602);
            } else {
                var25++;
            }
            if (class98.field1839 == null) {
                class98.field1839 = class45.method284((byte) -72, class76.field1445, class45.field838, class104.field1907, class29.field602);
            } else {
                var25++;
            }
            if (var25 < 4) {
                class43.field811 = class165.method1058(0, new class169[] { class179.field3486, class2.method18((byte) -62, var25 * 100 / 4), class37.field714 });
                class55.field1006 = 40;
            } else {
                class43.field811 = class180.field3502;
                class55.field1006 = 40;
                class70.field1315 = 60;
            }
        } else if (class70.field1315 == 60) {
            int var26 = class3.method27(class104.field1907, class125.field2288, 0);
            int var27 = class206.method1340(-95);
            if (var26 < var27) {
                class43.field811 = class165.method1058(0, new class169[] { class86.field1585, class2.method18((byte) -62, var26 * 100 / var27), class37.field714 });
                class55.field1006 = 50;
            } else {
                class55.field1006 = 50;
                class43.field811 = class43.field803;
                class140.method933((byte) 126, 5);
                class70.field1315 = 70;
            }
        } else if (class70.field1315 == 70) {
            if (class8.field221.method568(-27628)) {
                class49.method308((byte) -61, class8.field221);
                class156.method1014(class8.field221, 7);
                class68.method429(true, class8.field221, class187.field3632);
                class98.method585((byte) -96, class187.field3632, class105.field1925, class8.field221);
                class135.method917((byte) 60, class187.field3632, class8.field221);
                class32.method222(class8.field221, (byte) -125, class175.field3398, class187.field3632, class137.field2547);
                class158.method1016((byte) -101, class8.field221, class127.field2374, class94.field1750);
                class10.method57(class187.field3632, 0, class8.field221);
                class11.method61(class8.field221, -30994);
                class143.method947(16, class8.field221);
                class176.method1178(-106, class29.field602, class201.field3916, class104.field1907, class187.field3632);
                class136.method919((byte) 125, class8.field221);
                class95.method574(-9306, class8.field221);
                class43.field811 = class82.field1503;
                class70.field1315 = 80;
                class55.field1006 = 60;
            } else {
                class43.field811 = class165.method1058(0, new class169[] { class41.field779, class2.method18((byte) -62, class8.field221.method970(true)), class37.field714 });
                class55.field1006 = 60;
            }
        } else if (class70.field1315 == 80) {
            int var28 = 0;
            if (class65.field1224 == null) {
                class65.field1224 = class90.method530(class104.field1907, class29.field605, class45.field838, 25722);
            } else {
                var28++;
            }
            if (class62.field1149 == null) {
                class62.field1149 = class90.method530(class104.field1907, class19.field429, class45.field838, 25722);
            } else {
                var28++;
            }
            if (class62.field1144 == null) {
                class62.field1144 = class16.method90(class193.field3812, class45.field838, class104.field1907, 0);
            } else {
                var28++;
            }
            if (class172.field3322 == null) {
                class172.field3322 = class189.method1250(8526, class104.field1907, class4.field80, class45.field838);
            } else {
                var28++;
            }
            if (class94.field1760 == null) {
                class94.field1760 = class189.method1250(8526, class104.field1907, class51.field927, class45.field838);
            } else {
                var28++;
            }
            if (class6.field132 == null) {
                class6.field132 = class189.method1250(8526, class104.field1907, class1.field26, class45.field838);
            } else {
                var28++;
            }
            if (class151.field2909 == null) {
                class151.field2909 = class189.method1250(8526, class104.field1907, class20.field433, class45.field838);
            } else {
                var28++;
            }
            if (class190.field3754 == null) {
                class190.field3754 = class189.method1250(8526, class104.field1907, class58.field1097, class45.field838);
            } else {
                var28++;
            }
            if (class112.field2053 == null) {
                class112.field2053 = class189.method1250(8526, class104.field1907, class137.field2550, class45.field838);
            } else {
                var28++;
            }
            if (class95.field1787 == null) {
                class95.field1787 = class189.method1250(8526, class104.field1907, class80.field1479, class45.field838);
            } else {
                var28++;
            }
            if (class123.field2268 == null) {
                class123.field2268 = class189.method1250(8526, class104.field1907, class162.field3116, class45.field838);
            } else {
                var28++;
            }
            if (client.field582 == null) {
                client.field582 = class16.method90(class88.field1608, class45.field838, class104.field1907, 0);
            } else {
                var28++;
            }
            if (class37.field735 == null) {
                class37.field735 = class16.method90(class131.field2431, class45.field838, class104.field1907, 0);
            } else {
                var28++;
            }
            if (class115.field2103 == null) {
                class115.field2103 = class204.method1324(class142.field2656, 118, class104.field1907, class45.field838);
            } else {
                var28++;
            }
            if (var28 < 14) {
                class43.field811 = class165.method1058(0, new class169[] { class132.field2444, class2.method18((byte) -62, var28 * 100 / 14), class37.field714 });
                class55.field1006 = 70;
            } else {
                class117.field2173 = class37.field735;
                class62.field1149.method112();
                int var29 = (int) (Math.random() * 21.0D) - 10;
                int var30 = (int) (Math.random() * 21.0D) - 10;
                int var31 = (int) (Math.random() * 41.0D) - 20;
                int var32 = (int) (Math.random() * 21.0D) - 10;
                for (int var33 = 0; var33 < class172.field3322.length; var33++) {
                    class172.field3322[var33].method116(var31 + var32, var30 + var31, var29 + var31);
                }
                class62.field1144[0].method373(var31 + var32, var30 + var31, var29 + var31);
                class75.method462(33);
                class70.field1315 = 90;
                class55.field1006 = 70;
                class43.field811 = class96.field1817;
            }
        } else if (arg0 >= 31) {
            if (class70.field1315 == 90) {
                if (class16.field339.method568(-27628)) {
                    class103 var34 = new class103(class16.field339, class104.field1907, 20, class105.field1925 ? 64 : 128);
                    class12.method68(var34);
                    class12.method66(0.7F);
                    class55.field1006 = 90;
                    class43.field811 = class177.field3467;
                    class70.field1315 = 110;
                } else {
                    class43.field811 = class165.method1058(0, new class169[] { client.field583, class2.method18((byte) -62, class16.field339.method970(true)), class37.field714 });
                    class55.field1006 = 90;
                }
            } else if (class70.field1315 == 110) {
                class62.field1150 = new class86();
                class163.field3134.method676(0, class62.field1150, 10);
                class70.field1315 = 120;
                class55.field1006 = 94;
                class43.field811 = class57.field1067;
            } else if (class70.field1315 == 120) {
                if (class125.field2288.method561(103, class165.field3171, class45.field838)) {
                    class69 var35 = new class69(class125.field2288.method559(class45.field838, 0, class165.field3171));
                    class138.method927(50, var35);
                    class43.field811 = class81.field1484;
                    class55.field1006 = 96;
                    class70.field1315 = 130;
                } else {
                    class43.field811 = class165.method1058(0, new class169[] { class107.field1955, class87.field1600 });
                    class55.field1006 = 96;
                }
            } else if (class70.field1315 == 130) {
                if (!class201.field3916.method568(-27628)) {
                    class43.field811 = class165.method1058(0, new class169[] { class6.field130, class2.method18((byte) -62, class201.field3916.method970(true) * 4 / 5), class37.field714 });
                    class55.field1006 = 100;
                } else if (!class45.field842.method568(-27628)) {
                    class43.field811 = class165.method1058(0, new class169[] { class6.field130, class2.method18((byte) -62, class45.field842.method970(true) / 6 + 80), class37.field714 });
                    class55.field1006 = 100;
                } else if (class29.field602.method568(-27628)) {
                    class55.field1006 = 100;
                    class70.field1315 = 140;
                    class43.field811 = class177.field3456;
                } else {
                    class43.field811 = class165.method1058(0, new class169[] { class6.field130, class2.method18((byte) -62, class29.field602.method970(true) / 20 + 96), class37.field714 });
                    class55.field1006 = 100;
                }
            } else if (class70.field1315 == 140) {
                class140.method933((byte) -97, 10);
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B[B)[B")
    public final byte[] method303(byte arg0, byte[] arg1) {
        if (this.field865 != null) {
            int var3 = 0;
            int var4 = (int) ((long) arg1.length * (long) this.field864 / (long) this.field867) + 14;
            int var5 = 0;
            int[] var6 = new int[var4];
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field865[var3];
                for (int var12 = 0; var12 < 14; var12++) {
                    var6[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field864 + var3;
                int var14 = var13 / this.field867;
                var5 += var14;
                var3 = var13 - this.field867 * var14;
            }
            arg1 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                int var9 = var6[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 > 127) {
                    arg1[var8] = 127;
                } else {
                    arg1[var8] = (byte) var9;
                }
            }
        }
        field873++;
        return arg0 >= -39 ? null : arg1;
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(II)V")
    private class48(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class26.method185(-1, arg0, arg1);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field864 = var5;
            this.field865 = new int[var4][14];
            this.field867 = var4;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field865[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                double var12 = (double) var5 / (double) var4;
                if (var11 > 14) {
                    var11 = 14;
                }
                while (var10 < var11) {
                    double var14 = var12;
                    double var16 = ((double) var10 - var8) * 3.141592653589793D;
                    if (var16 < -1.0E-4D || var16 > 1.0E-4D) {
                        var14 = var12 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZ)I")
    public final int method304(int arg0, boolean arg1) {
        if (this.field865 != null) {
            arg0 = (int) ((long) this.field864 * (long) arg0 / (long) this.field867) + 6;
        }
        if (!arg1) {
            this.method303((byte) -29, null);
        }
        field863++;
        return arg0;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)I")
    public final int method305(int arg0, int arg1) {
        if (arg1 != 100) {
            field874 = null;
        }
        if (this.field865 != null) {
            arg0 = (int) ((long) this.field864 * (long) arg0 / (long) this.field867);
        }
        field870++;
        return arg0;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)V")
    public static void method306(byte arg0) {
        field872 = null;
        field874 = null;
        if (arg0 < -99) {
            field871 = null;
            field876 = null;
            field866 = null;
        }
    }
}
