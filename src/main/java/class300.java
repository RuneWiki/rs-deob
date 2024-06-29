import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class300 extends class5 {

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "J")
    public long field4617;

    @OriginalMember(owner = "client!mj", name = "A", descriptor = "I")
    public static int field4622 = 0;

    @OriginalMember(owner = "client!mj", name = "D", descriptor = "Ljava/lang/String;")
    public static String field4624 = "Loaded input handler";

    @OriginalMember(owner = "client!mj", name = "w", descriptor = "[I")
    public static int[] field4618 = new int[2];

    @OriginalMember(owner = "client!mj", name = "y", descriptor = "[[S")
    public static short[][] field4620 = new short[][] { { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10347, 10582, 10429, 10407, 10359, 8414, 9540, 10456, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384, 8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 13766, 13745, 13726, 13890, 13743, 13852, 17602, 18605, 21660, 24000, 24997, 24088, 27972, 25903, 26904, 27193, 27175, 27156, 30020, 28975, 29976, 12482, 13485, 10392, 10692, 10669, 10776, 6717, 6695, 7830, 6971, 6951, 5910, 3389, 3369, 3356, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 } };

    @OriginalMember(owner = "client!mj", name = "F", descriptor = "[[I")
    public static int[][] field4625 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "F")
    public static float field4615;

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!mj", name = "x", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!mj", name = "z", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!mj", name = "B", descriptor = "Lnk;")
    public static class326 field4623;

    @OriginalMember(owner = "client!mj", name = "G", descriptor = "[[Z")
    public static boolean[][] field4626;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)V", line = 4)
    public static void method2064(boolean arg0) {
        field4623 = null;
        field4626 = (boolean[][]) null;
        field4625 = (int[][]) null;
        field4620 = (short[][]) null;
        field4618 = null;
        field4624 = null;
        if (!arg0) {
            field4620 = (short[][]) ((short[][]) null);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIII)V", line = 22)
    public static final void method2065(int arg0, int arg1, int arg2, int arg3) {
        class79 var4 = class213.field3262[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class158 var5 = var4.field1175;
        if (var5 != null) {
            var5.field2401 = var5.field2401 * arg3 / 16;
            var5.field2396 = var5.field2396 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(I)V", line = 41)
    public static final void method2066(int arg0) {
        field4621++;
        if (class163.field2649 == null) {
            return;
        }
        if (class215.field3299 < 10) {
            if (!class311.field4829.method686(class163.field2649.field4049, (byte) 62)) {
                class215.field3299 = class172.field2773.method704(class163.field2649.field4049, (byte) 98) / 10;
                return;
            }
            class71.method502(0);
            class215.field3299 = 10;
        }
        if (class215.field3299 == 10) {
            class176.field2822 = class163.field2649.field4046 >> 6 << 6;
            class196.field3024 = class163.field2649.field4036 >> 6 << 6;
            class229.field3494 = (class163.field2649.field4043 >> 6 << 6) + 64 - class176.field2822;
            class243.field3691 = (class163.field2649.field4039 >> 6 << 6) + 64 - class196.field3024;
            int[] var2 = class163.field2649.method1842(class327.field5054 + (class39.field575.field4713 >> 7), class265.field4112, class293.field4522 + (class39.field575.field4731 >> 7), (byte) 104);
            int var3 = -1;
            int var4 = -1;
            if (var2 != null) {
                var3 = var2[1] - class196.field3024;
                var4 = class229.field3494 + class176.field2822 - var2[2] - 1;
            }
            if (var3 >= 0 && var3 < class243.field3691 && var4 >= 0 && class229.field3494 > var4) {
                int var5 = var4 + (int) (Math.random() * 10.0D) - 5;
                int var6 = var3 + (int) (Math.random() * 10.0D) - 5;
                class49.field680 = var5;
                class8.field119 = var6;
            } else if (class141.field2176 == -1 || class49.field676 == -1) {
                int[] var8 = class163.field2649.method1838((byte) 62, class163.field2649.field4032 & 0x3FFF, class163.field2649.field4032 >> 14 & 0x3FFF);
                class8.field119 = var8[1] - class196.field3024;
                class49.field680 = class229.field3494 + class176.field2822 - var8[2] - 1;
            } else {
                int[] var7 = class163.field2649.method1838((byte) 62, class49.field676, class141.field2176);
                class49.field676 = -1;
                class141.field2176 = -1;
                if (var7 != null) {
                    class8.field119 = var7[1] - class196.field3024;
                    class49.field680 = class229.field3494 + class176.field2822 - var7[2] - 1;
                }
            }
            if (class163.field2649.field4037 == 37) {
                class198.field3035 = 3.0F;
                class341.field5303 = 3.0F;
            } else if (class163.field2649.field4037 == 50) {
                class198.field3035 = 4.0F;
                class341.field5303 = 4.0F;
            } else if (class163.field2649.field4037 == 75) {
                class198.field3035 = 6.0F;
                class341.field5303 = 6.0F;
            } else if (class163.field2649.field4037 == 100) {
                class198.field3035 = 8.0F;
                class341.field5303 = 8.0F;
            } else if (class163.field2649.field4037 == 200) {
                class198.field3035 = 16.0F;
                class341.field5303 = 16.0F;
            } else {
                class198.field3035 = 8.0F;
                class341.field5303 = 8.0F;
            }
            class7.method73(-13969);
            int var9 = class243.field3691 >> 6;
            int var10 = class245.field3716 >> 1;
            int var11 = class229.field3494 >> 6;
            class147.field2234 = new byte[var9][var11][];
            class217.field3330 = new int[var9][var11][];
            class209.field3194 = new byte[var9][var11][];
            class332.field5171 = new int[class303.field4642 + 1];
            class158.field2408 = new byte[var9][var11][];
            class210.field3221 = new byte[var9][var11][];
            class335.field5214 = new int[var9][var11][];
            class157.field2389 = new int[var9][var11][];
            class240.field3653 = new byte[var9][var11][];
            int var12 = class219.field3353 >> 2 << 10;
            class327.method2286(var12, -1, var10);
            class215.field3299 = 20;
        } else if (class215.field3299 == 20) {
            class168.method1274(new class254(class311.field4829.method711(class163.field2649.field4049, 8, "underlay")), 73);
            class215.field3299 = 30;
            class264.method1855(25, true);
            class168.method1272(119);
        } else if (class215.field3299 == 30) {
            class226.method1608(new class254(class311.field4829.method711(class163.field2649.field4049, 8, "overlay")), 64);
            class215.field3299 = 40;
            class168.method1272(111);
        } else {
            int var1 = 54 % ((-arg0 - 82) / 42);
            if (class215.field3299 == 40) {
                class69.method492(124, new class254(class311.field4829.method711(class163.field2649.field4049, 8, "overlay2")));
                class215.field3299 = 50;
                class168.method1272(101);
            } else if (class215.field3299 == 50) {
                class101.method761(-1, new class254(class311.field4829.method711(class163.field2649.field4049, 8, "loc")));
                class215.field3299 = 60;
                class264.method1855(25, true);
                class168.method1272(87);
            } else if (class215.field3299 == 60) {
                if (class311.field4829.method712(class163.field2649.field4049 + "_labels", 9)) {
                    if (!class311.field4829.method686(class163.field2649.field4049 + "_labels", (byte) 65)) {
                        return;
                    }
                    class228.field3489 = class94.method683(class311.field4829, class163.field2649.field4049 + "_labels", (byte) -44);
                } else {
                    class228.field3489 = new class25(0);
                }
                class215.field3299 = 70;
                class168.method1272(101);
            } else if (class215.field3299 == 70) {
                class281.field4374 = new class310(11, true, class102.field1480);
                class215.field3299 = 73;
                class264.method1855(25, true);
                class168.method1272(97);
            } else if (class215.field3299 == 73) {
                class82.field1205 = new class310(12, true, class102.field1480);
                class215.field3299 = 76;
                class264.method1855(25, true);
                class168.method1272(83);
            } else if (class215.field3299 == 76) {
                class268.field4172 = new class310(14, true, class102.field1480);
                class215.field3299 = 79;
                class264.method1855(25, true);
                class168.method1272(113);
            } else if (class215.field3299 == 79) {
                class312.field4842 = new class310(17, true, class102.field1480);
                class215.field3299 = 82;
                class264.method1855(25, true);
                class168.method1272(80);
            } else if (class215.field3299 == 82) {
                class311.field4834 = new class310(19, true, class102.field1480);
                class215.field3299 = 85;
                class264.method1855(25, true);
                class168.method1272(119);
            } else if (class215.field3299 == 85) {
                class222.field3381 = new class310(22, true, class102.field1480);
                class215.field3299 = 88;
                class264.method1855(25, true);
                class168.method1272(95);
            } else if (class215.field3299 == 88) {
                class309.field4815 = new class310(26, true, class102.field1480);
                class215.field3299 = 91;
                class264.method1855(25, true);
                class168.method1272(112);
            } else {
                class84.field1228 = new class310(30, true, class102.field1480);
                class215.field3299 = 100;
                class264.method1855(25, true);
                class168.method1272(116);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZI)[B", line = 294)
    public static final byte[] method2067(boolean arg0, int arg1) {
        field4619++;
        if (arg0) {
            return (byte[]) null;
        }
        class290 var2 = (class290) class94.field1328.method730((long) arg1, (byte) 90);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class101.method764(var7, (byte) 121, var4);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class290(var3);
            class94.field1328.method734((byte) -14, (long) arg1, var2);
        }
        return var2.field4473;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BI)I", line = 344)
    public static final int method2068(byte arg0, int arg1) {
        field4616++;
        if (arg0 >= -91) {
            field4623 = (class326) null;
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V", line = 360)
    public class300() {
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(J)V", line = 365)
    public class300(long arg0) {
        this.field4617 = arg0;
    }
}
