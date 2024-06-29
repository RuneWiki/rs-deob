import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class122 {

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field2108 = new String[100];

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "Le;")
    public static class342 field2110 = new class342(64);

    @OriginalMember(owner = "client!rm", name = "l", descriptor = "[[S")
    public static short[][] field2116 = new short[][] { { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10347, 10582, 10429, 10407, 10359, 8414, 9540, 10456, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384, 8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 13766, 13745, 13726, 13890, 13743, 13852, 17602, 18605, 21660, 24000, 24997, 24088, 27972, 25903, 26904, 27193, 27175, 27156, 30020, 28975, 29976, 12482, 13485, 10392, 10692, 10669, 10776, 6717, 6695, 7830, 6971, 6951, 5910, 3389, 3369, 3356, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 } };

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!rm", name = "k", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!rm", name = "m", descriptor = "[I")
    public static int[] field2117;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(BLjava/lang/String;)I", line = 4)
    public static final int method786(byte arg0, String arg1) {
        field2115++;
        if (class222.field3517 == null || arg1.length() == 0) {
            return -1;
        }
        if (arg0 <= 15) {
            method787((byte) -112);
        }
        for (int var2 = 0; var2 < class222.field3517.field3672; var2++) {
            if (class38.method299(class208.method1407(class222.field3517.field3673[var2], "<br>", " ", -70), arg1, 0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)[Loj;", line = 32)
    public static final class283[] method787(byte arg0) {
        field2105++;
        class283[] var1 = new class283[class125.field2167];
        for (int var2 = 0; var2 < class125.field2167; var2++) {
            int var3 = class28.field537[var2] * class176.field2833[var2];
            byte[] var4 = class254.field3968[var2];
            if (class61.field1178[var2]) {
                byte[] var5 = class114.field2014[var2];
                int[] var6 = new int[var3];
                for (int var7 = 0; var7 < var3; var7++) {
                    var6[var7] = class212.method1434(class61.method475(-16777216, var5[var7] << 24), class274.field4202[class61.method475(var4[var7], 255)]);
                }
                if (class249.field3893) {
                    var1[var2] = new class98(class194.field3127, class321.field4891, class80.field1572[var2], class27.field530[var2], class28.field537[var2], class176.field2833[var2], var6);
                } else {
                    var1[var2] = new class300(class194.field3127, class321.field4891, class80.field1572[var2], class27.field530[var2], class28.field537[var2], class176.field2833[var2], var6);
                }
            } else {
                int[] var8 = new int[var3];
                for (int var9 = 0; var9 < var3; var9++) {
                    var8[var9] = class274.field4202[class61.method475(255, var4[var9])];
                }
                if (class249.field3893) {
                    var1[var2] = new class137(class194.field3127, class321.field4891, class80.field1572[var2], class27.field530[var2], class28.field537[var2], class176.field2833[var2], var8);
                } else {
                    var1[var2] = new class206(class194.field3127, class321.field4891, class80.field1572[var2], class27.field530[var2], class28.field537[var2], class176.field2833[var2], var8);
                }
            }
        }
        int var10 = 2 / ((arg0 + 39) / 57);
        class97.method644((byte) 111);
        return var1;
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(B)V", line = 94)
    public static void method788(byte arg0) {
        field2110 = null;
        field2117 = null;
        if (arg0 == -55) {
            field2108 = null;
            field2116 = (short[][]) null;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(BLbm;)V", line = 110)
    public static final void method789(byte arg0, class307 arg1) {
        field2111++;
        if (class255.field3993) {
            return;
        }
        if (class249.field3893) {
            class115.method754();
        } else {
            class270.method1800();
        }
        if (arg0 <= 59) {
            return;
        }
        class285.field4416 = class43.method326(arg1, class336.field5162, 5);
        int var2 = class134.field2257;
        int var3 = var2 * 956 / 503;
        class285.field4416.method905((class88.field1658 - var3) / 2, 0, var3, var2);
        class31.field582 = class149.method975(arg1, class9.field191, 0);
        class31.field582.method717(class88.field1658 / 2 - class31.field582.field1968 / 2, 18);
        class255.field3993 = true;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 138)
    public static final void method790(Component arg0, int arg1) {
        field2113++;
        Method var2 = class124.field2152;
        if (arg1 > -48) {
            field2108 = (String[]) null;
        }
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg0.addKeyListener(class277.field4249);
        arg0.addFocusListener(class277.field4249);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIIZ)V", line = 161)
    public static final void method791(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var5 = -76 % ((34 - arg2) / 39);
        field2114++;
        if (class165.method1056(arg1, (byte) 24)) {
            class77.method570(arg3, arg4, arg0, class138.field2300[arg1], -1, 0);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIII)V", line = 180)
    public static final void method792(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2106++;
        if (arg1 >= class147.field2416 && arg1 <= class259.field4024) {
            int var5 = class8.method73(8, class186.field3028, class59.field1162, arg3);
            int var6 = class8.method73(8, class186.field3028, class59.field1162, arg2);
            class165.method1054(arg1, (byte) -90, var5, arg0, var6);
        }
        if (arg4 > -7) {
            method792(-93, 80, 104, -67, 36);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V", line = 200)
    public static final void method793(int arg0) {
        field2107++;
        if (arg0 != 70) {
            method795(59, -103, 81, (class31) null, 43, -81, (byte) 31, 34, 93);
        }
        class159.field2598.method1884(-22054);
        class200.field3198.method1884(-22054);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lkl;IIII)V", line = 212)
    public static final void method794(class68 arg0, int arg1, int arg2, int arg3, int arg4) {
        field2112++;
        if (class249.field3893) {
            class115.method757(arg2, arg3, arg0.field1416 + arg2, arg0.field1414 + arg3);
        }
        if (class313.field4757 < 3) {
            if (class249.field3893) {
                ((class137) class187.field3031).method897(arg2, arg3, arg0.field1416, arg0.field1414, class187.field3031.field4377 / 2, class187.field3031.field4383 / 2, (int) class95.field1709, 256, (class137) arg0.method528((byte) 105, false));
            } else {
                ((class206) class187.field3031).method1382(arg2, arg3, arg0.field1416, arg0.field1414, class187.field3031.field4377 / 2, class187.field3031.field4383 / 2, (int) class95.field1709, 256, arg0.field1403, arg0.field1317);
            }
        } else if (class249.field3893) {
            class283 var5 = arg0.method528((byte) 82, false);
            if (var5 != null) {
                var5.method901(arg2, arg3);
            }
        } else {
            class270.method1817(arg2, arg3, 0, arg0.field1403, arg0.field1317);
        }
        class220.field3490[arg1] = true;
        if (arg4 != 0) {
            method794((class68) null, -86, 92, -24, 99);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIILga;IIBII)V", line = 249)
    public static final void method795(int arg0, int arg1, int arg2, class31 arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        field2109++;
        int var9 = arg0 & 0x3;
        if (arg6 >= -122) {
            method789((byte) 86, (class307) null);
        }
        int var10;
        int var11;
        if (var9 == 1 || var9 == 3) {
            var10 = arg3.field616;
            var11 = arg3.field589;
        } else {
            var10 = arg3.field589;
            var11 = arg3.field616;
        }
        int var12;
        int var13;
        if (arg1 + var10 > 104) {
            var12 = arg1;
            var13 = arg1 + 1;
        } else {
            var13 = (var10 + 1 >> 1) + arg1;
            var12 = (var10 >> 1) + arg1;
        }
        int var14;
        int var15;
        if ((arg2 + var11) <= 104) {
            var14 = arg2 + (var11 >> 1);
            var15 = (var11 + 1 >> 1) + arg2;
        } else {
            var15 = arg2 + 1;
            var14 = arg2;
        }
        int var16 = (arg1 << 7) + (var10 << 6);
        int var17 = (arg2 << 7) + (var11 << 6);
        int[][] var18 = class45.field923[arg8];
        int var19 = 0;
        int var20 = var18[var12][var14] + var18[var13][var14] + var18[var12][var15] + var18[var13][var15] >> 2;
        if (arg8 != 0) {
            int[][] var21 = class45.field923[0];
            var19 = var20 - (var21[var12][var14] + var21[var12][var15] - (-var21[var13][var14] - var21[var13][var15]) >> 2);
        }
        int[][] var22 = (int[][]) null;
        if (arg8 < 3) {
            var22 = class45.field923[arg8 + 1];
        }
        class15 var23 = arg3.method245(var16, var17, true, arg0, arg7, 0, var22, var18, var20, (class113) null, false);
        class60.method469(var23.field282, var16 - arg5, var19, var17 - arg4);
    }
}
