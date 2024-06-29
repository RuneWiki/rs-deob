import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class321 extends class275 {

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "[J")
    public static long[] field4929 = new long[32];

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    public static int field4924 = 0;

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "[[S")
    public static short[][] field4932 = new short[][] { { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10347, 10582, 10429, 10407, 10359, 8414, 9540, 10456, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384, 8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 13766, 13745, 13726, 13890, 13743, 13852, 17602, 18605, 21660, 24000, 24997, 24088, 27972, 25903, 26904, 27193, 27175, 27156, 30020, 28975, 29976, 12482, 13485, 10392, 10692, 10669, 10776, 6717, 6695, 7830, 6971, 6951, 5910, 3389, 3369, 3356, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 } };

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4923 = "K";

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "Z")
    public static boolean field4926 = true;

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field4935 = null;

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "Ljava/lang/String;")
    public static String field4936 = "";

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "F")
    public static float field4931;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V", line = 8)
    public static void method2233(int arg0) {
        field4923 = null;
        if (arg0 != 6814) {
            field4935 = (String[]) null;
        }
        field4932 = (short[][]) null;
        field4929 = null;
        field4935 = null;
        field4936 = null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)V", line = 24)
    public static final void method2234(int arg0, int arg1) {
        field4927++;
        class285.field4489.method1236(-495037017, arg1);
        if (arg0 <= 91) {
            method2234(-84, -76);
        }
        class264.field4165.method1236(-495037017, arg1);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lcc;IILbi;III)V", line = 41)
    public static final void method2235(class263 arg0, int arg1, int arg2, class91 arg3, int arg4, int arg5, int arg6) {
        field4934++;
        if (arg3 == null) {
            return;
        }
        int var7 = (int) class280.field4344 + class227.field3248 & 0x7FF;
        int var8 = Math.max(arg0.field3989 / 2, arg0.field4096 / arg2) + 10;
        int var9 = arg1 * arg1 + (arg6 * arg6);
        if (var9 > (var8 * var8)) {
            return;
        }
        int var10 = class215.field3024[var7];
        int var11 = var10 * 256 / (class196.field2807 + 256);
        int var12 = class215.field3017[var7];
        int var13 = var12 * 256 / (class196.field2807 + 256);
        int var14 = arg6 * var11 + (arg1 * var13) >> 16;
        int var15 = arg6 * var13 - arg1 * var11 >> 16;
        if (class250.field3787) {
            ((class202) arg3).method1386(arg0.field3989 / 2 + var14 + arg5 - (arg3.field1135 / 2), arg0.field4096 / 2 + arg4 - arg3.field1140 / 2 + -var15, (class202) arg0.method1892(19709, false));
        } else {
            ((class189) arg3).method1312(arg0.field3989 / 2 + (arg5 + var14) - arg3.field1135 / 2, -(arg3.field1140 / 2) + -var15 + arg4 - -(arg0.field4096 / 2), arg0.field4015, arg0.field4101);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIII)V", line = 80)
    public static final void method2236(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class286 var5 = (class286) class229.field3337.method1537((long) arg3, arg2 - 28755);
        if (var5 == null) {
            var5 = new class286();
            class229.field3337.method1541(false, var5, (long) arg3);
        }
        if (var5.field4498.length <= arg4) {
            int[] var6 = new int[arg4 + 1];
            int[] var7 = new int[arg4 + 1];
            for (int var8 = 0; var8 < var5.field4498.length; var8++) {
                var6[var8] = var5.field4498[var8];
                var7[var8] = var5.field4502[var8];
            }
            for (int var9 = var5.field4498.length; var9 < arg4; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field4498 = var6;
            var5.field4502 = var7;
        }
        var5.field4498[arg4] = arg1;
        if (arg2 == 6047) {
            var5.field4502[arg4] = arg0;
            field4928++;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "([IIIIII)V", line = 131)
    public static final void method2237(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class225 var6 = class158.field2184[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class57 var7 = var6.field3203;
        if (var7 != null) {
            int var8 = var7.field691;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class290 var10 = var6.field3218;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field4559;
        int var12 = var10.field4546;
        int var13 = var10.field4549;
        int var14 = var10.field4542;
        int[] var15 = class249.field3776[var11];
        int[] var16 = class81.field1045[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)V", line = 230)
    public static final void method2238(int arg0) {
        int var1 = -98 % ((66 - arg0) / 34);
        class223.field3150 = null;
        class153.field2105 = (byte[][]) null;
        class54.field664 = null;
        class134.field1854 = null;
        class120.field1681 = null;
        field4930++;
        class264.field4159 = null;
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)V", line = 254)
    public static final void method2239(int arg0) {
        field4925++;
        if (class239.field3585 == 0) {
            return;
        }
        try {
            if (++class292.field4581 > 2000) {
                if (class236.field3463 != null) {
                    class236.field3463.method1096((byte) 62);
                    class236.field3463 = null;
                }
                if (class307.field4747 >= 1) {
                    class272.field4272 = -5;
                    class239.field3585 = 0;
                    return;
                }
                class307.field4747++;
                class239.field3585 = 1;
                class292.field4581 = 0;
                if (class152.field2095 == class15.field200) {
                    class152.field2095 = class307.field4746;
                } else {
                    class152.field2095 = class15.field200;
                }
            }
            int var1 = 113 / ((arg0 + 15) / 56);
            if (class239.field3585 == 1) {
                class163.field2259 = class9.field131.method1915(class320.field4916, class152.field2095, false);
                class239.field3585 = 2;
            }
            if (class239.field3585 == 2) {
                if (class163.field2259.field238 == 2) {
                    throw new IOException();
                }
                if (class163.field2259.field238 != 1) {
                    return;
                }
                class236.field3463 = new class167((Socket) class163.field2259.field241, class9.field131);
                class163.field2259 = null;
                class236.field3463.method1097(class140.field1954.field1388, 0, true, class140.field1954.field1400);
                if (class170.field2380 != null) {
                    class170.field2380.method1717(-7234);
                }
                if (class224.field3186 != null) {
                    class224.field3186.method1717(-7234);
                }
                int var2 = class236.field3463.method1094((byte) 67);
                if (class170.field2380 != null) {
                    class170.field2380.method1717(-7234);
                }
                if (class224.field3186 != null) {
                    class224.field3186.method1717(-7234);
                }
                if (var2 != 21) {
                    class239.field3585 = 0;
                    class272.field4272 = var2;
                    class236.field3463.method1096((byte) 81);
                    class236.field3463 = null;
                    return;
                }
                class239.field3585 = 3;
            }
            if (class239.field3585 == 3) {
                if (class236.field3463.method1091((byte) 18) < 1) {
                    return;
                }
                class35.field416 = new String[class236.field3463.method1094((byte) 67)];
                class239.field3585 = 4;
            }
            if (class239.field3585 == 4) {
                if (class236.field3463.method1091((byte) 18) < (class35.field416.length * 8)) {
                    return;
                }
                class307.field4742.field1400 = 0;
                class236.field3463.method1092(0, class35.field416.length * 8, -1, class307.field4742.field1388);
                for (int var3 = 0; var3 < class35.field416.length; var3++) {
                    class35.field416[var3] = class248.method1783(class307.field4742.method651(-13052), 0);
                }
                class272.field4272 = 21;
                class239.field3585 = 0;
                class236.field3463.method1096((byte) 67);
                class236.field3463 = null;
                return;
            }
        } catch (IOException var5) {
            if (class236.field3463 != null) {
                class236.field3463.method1096((byte) 111);
                class236.field3463 = null;
            }
            if (class307.field4747 >= 1) {
                class272.field4272 = -4;
                class239.field3585 = 0;
            } else {
                class239.field3585 = 1;
                class292.field4581 = 0;
                class307.field4747++;
                if (class152.field2095 == class15.field200) {
                    class152.field2095 = class307.field4746;
                } else {
                    class152.field2095 = class15.field200;
                }
            }
        }
    }
}
