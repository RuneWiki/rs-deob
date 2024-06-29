import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class341 extends class98 {

    @OriginalMember(owner = "client!fe", name = "Z", descriptor = "I")
    private int field4837 = 819;

    @OriginalMember(owner = "client!fe", name = "X", descriptor = "I")
    private int field4835 = 409;

    @OriginalMember(owner = "client!fe", name = "W", descriptor = "I")
    private int field4834 = 1024;

    @OriginalMember(owner = "client!fe", name = "Y", descriptor = "I")
    private int field4836 = 0;

    @OriginalMember(owner = "client!fe", name = "O", descriptor = "I")
    private int field4826 = 1024;

    @OriginalMember(owner = "client!fe", name = "fb", descriptor = "I")
    private int field4843 = 1024;

    @OriginalMember(owner = "client!fe", name = "P", descriptor = "I")
    private int field4827 = 1024;

    @OriginalMember(owner = "client!fe", name = "hb", descriptor = "I")
    private int field4845 = 2048;

    @OriginalMember(owner = "client!fe", name = "gb", descriptor = "I")
    private int field4844 = 0;

    @OriginalMember(owner = "client!fe", name = "N", descriptor = "[[S")
    public static short[][] field4825 = new short[][] { { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10347, 10582, 10429, 10407, 10359, 8414, 9540, 10456, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384, 8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 13766, 13745, 13726, 13890, 13743, 13852, 17602, 18605, 21660, 24000, 24997, 24088, 27972, 25903, 26904, 27193, 27175, 27156, 30020, 28975, 29976, 12482, 13485, 10392, 10692, 10669, 10776, 6717, 6695, 7830, 6971, 6951, 5910, 3389, 3369, 3356, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 } };

    @OriginalMember(owner = "client!fe", name = "L", descriptor = "[Z")
    public static boolean[] field4823 = new boolean[8];

    @OriginalMember(owner = "client!fe", name = "V", descriptor = "I")
    public static int field4833 = 0;

    @OriginalMember(owner = "client!fe", name = "db", descriptor = "[I")
    public static int[] field4841 = new int[14];

    @OriginalMember(owner = "client!fe", name = "M", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!fe", name = "Q", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!fe", name = "R", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!fe", name = "S", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!fe", name = "T", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!fe", name = "U", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!fe", name = "ab", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!fe", name = "cb", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!fe", name = "eb", descriptor = "I")
    private int field4842;

    @OriginalMember(owner = "client!fe", name = "ib", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!fe", name = "jb", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!fe", name = "bb", descriptor = "Ltq;")
    public static class376 field4839;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(IBI)Lon;", line = 4)
    public static final class184 method2186(int arg0, byte arg1, int arg2) {
        ++field4829;
        if (arg1 != 21) {
            return null;
        } else {
            class184 var3 = class282.method1863(arg0, -25835);
            if (~arg2 == 0) {
                return var3;
            } else {
                return var3 != null && var3.field2603 != null && var3.field2603.length > arg2 ? var3.field2603[arg2] : null;
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(Z)V", line = 33)
    public static void method2187(boolean arg0) {
        field4823 = null;
        field4839 = null;
        field4825 = null;
        if (arg0) {
            method2188(83, -104);
        }
        field4841 = null;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V", line = 46)
    public final void method188(int arg0) {
        ++field4830;
        if (arg0 != 1) {
            field4841 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(II)I", line = 62)
    public static final int method2188(int arg0, int arg1) {
        ++field4838;
        if (arg0 != 110) {
            method2188(74, -3);
        }
        if (~arg1 > -97) {
            return 0;
        } else {
            return ~arg1 > -129 ? 2 : 3;
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V", line = 80)
    public class341() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BLjava/util/Random;II[[III)V", line = 84)
    private final void method2189(byte arg0, Random arg1, int arg2, int arg3, int[][] arg4, int arg5, int arg6) {
        ++field4840;
        int var8 = ~this.field4827 < -1 ? -class211.method1428(arg1, this.field4827, 30) + 4096 : 4096;
        int var9 = this.field4843 * this.field4842 >> 12;
        int var10 = this.field4842 + -(~var9 >= -1 ? 0 : class211.method1428(arg1, var9, -120));
        if (~arg5 <= ~class268.field3811) {
            arg5 -= class268.field3811;
        }
        if (var10 > 0) {
            if (arg2 <= 0 || arg6 <= 0) {
                return;
            }
            int var11 = arg6 / 2;
            int var12 = arg2 / 2;
            int var13 = var10 > var11 ? var11 : var10;
            int var14 = ~var12 > ~var10 ? var12 : var10;
            int var15 = arg5 + var13;
            int var16 = -(var13 * 2) + arg6;
            for (int var17 = 0; ~arg2 < ~var17; ++var17) {
                int[] var18 = arg4[arg3 + var17];
                if (var17 < var14) {
                    int var19 = var8 * var17 / var14;
                    if (~this.field4844 == -1) {
                        for (int var20 = 0; ~var13 < ~var20; ++var20) {
                            int var21 = var8 * var20 / var13;
                            var18[class33.method210(class210.field2995, arg5 + var20)] = var18[class33.method210(-var20 + arg6 + arg5 + -1, class210.field2995)] = var19 * var21 >> 12;
                        }
                    } else {
                        for (int var22 = 0; var22 < var13; ++var22) {
                            int var24 = var8 * var22 / var13;
                            var18[class33.method210(class210.field2995, arg5 + var22)] = var18[class33.method210(class210.field2995, arg6 + -1 + arg5 - var22)] = ~var19 >= ~var24 ? var19 : var24;
                        }
                    }
                    if (var15 + var16 > class268.field3811) {
                        int var23 = -var15 + class268.field3811;
                        class316.method2073(var18, var15, var23, var19);
                        class316.method2073(var18, 0, var16 - var23, var19);
                    } else {
                        class316.method2073(var18, var15, var16, var19);
                    }
                } else {
                    int var25 = arg2 - 1 + -var17;
                    if (var14 > var25) {
                        int var26 = var8 * var25 / var14;
                        if (this.field4844 != 0) {
                            for (int var27 = 0; var13 > var27; ++var27) {
                                int var28 = var8 * var27 / var13;
                                var18[class33.method210(arg5 + var27, class210.field2995)] = var18[class33.method210(class210.field2995, arg5 - -arg6 + -var27 - 1)] = ~var26 >= ~var28 ? var26 : var28;
                            }
                        } else {
                            for (int var29 = 0; ~var13 < ~var29; ++var29) {
                                int var31 = var8 * var29 / var13;
                                var18[class33.method210(class210.field2995, arg5 + var29)] = var18[class33.method210(class210.field2995, arg5 + arg6 + -1 + -var29)] = var26 * var31 >> 12;
                            }
                        }
                        if (~class268.field3811 > ~(var15 + var16)) {
                            int var30 = -var15 + class268.field3811;
                            class316.method2073(var18, var15, var30, var26);
                            class316.method2073(var18, 0, -var30 + var16, var26);
                        } else {
                            class316.method2073(var18, var15, var16, var26);
                        }
                    } else {
                        for (int var32 = 0; var13 > var32; ++var32) {
                            var18[class33.method210(arg5 - -var32, class210.field2995)] = var18[class33.method210(arg5 + arg6 + -var32 + -1, class210.field2995)] = var8 * var32 / var13;
                        }
                        if (~class268.field3811 <= ~(var15 + var16)) {
                            class316.method2073(var18, var15, var16, var8);
                        } else {
                            int var33 = -var15 + class268.field3811;
                            class316.method2073(var18, var15, var33, var8);
                            class316.method2073(var18, 0, -var33 + var16, var8);
                        }
                    }
                }
            }
        } else if (~class268.field3811 > ~(arg5 + arg6)) {
            int var34 = -arg5 + class268.field3811;
            for (int var35 = 0; arg2 > var35; ++var35) {
                int[] var36 = arg4[arg3 - -var35];
                class316.method2073(var36, arg5, var34, var8);
                class316.method2073(var36, 0, -var34 + arg6, var8);
            }
        } else {
            for (int var37 = 0; var37 < arg2; ++var37) {
                class316.method2073(arg4[arg3 + var37], arg5, arg6, var8);
            }
        }
        if (arg0 < 84) {
            method2186(85, (byte) -128, 122);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IILjs;)V", line = 299)
    public static final void method2190(int arg0, int arg1, class180 arg2) {
        ++field4831;
        if (class75.field890) {
            arg1 = 0;
            class75.field890 = false;
        }
        if (class261.field3738 == null || !class261.field3738.method1215(arg2, (byte) -110)) {
            class261.field3738 = arg2;
            class42.field517 = class175.method1195(31);
            class1.field2 = arg1;
            class164.field2318 = arg1;
            if (~class164.field2318 != -1) {
                class288.field4043 = class160.field2119;
                class186.field2694 = class181.field2481;
                class71.field837 = class419.field5992;
                class246.field3488 = class306.field4327;
                class296.field4124 = class382.field5353;
                class66.field757 = class397.field5678;
                class225.field3164 = class244.field3456;
                class237.field3368 = class291.field4077;
                class88.field1076 = class42.field519;
                class153.field1897 = class222.field3110;
            } else {
                class164.method1124(4777);
            }
        }
        if (arg0 != -1) {
            field4825 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILdg;I)V", line = 340)
    public final void method81(int arg0, class236 arg1, int arg2) {
        if (arg2 != 0) {
            this.method188(101);
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (~arg0 != -7) {
                                    if (~arg0 != -8) {
                                        if (arg0 == 8) {
                                            this.field4827 = arg1.method1617((byte) 48);
                                        }
                                    } else {
                                        this.field4843 = arg1.method1617((byte) 48);
                                    }
                                } else {
                                    this.field4844 = arg1.method1574(-39);
                                }
                            } else {
                                this.field4826 = arg1.method1617((byte) 48);
                            }
                        } else {
                            this.field4837 = arg1.method1617((byte) 48);
                        }
                    } else {
                        this.field4835 = arg1.method1617((byte) 48);
                    }
                } else {
                    this.field4845 = arg1.method1617((byte) 48);
                }
            } else {
                this.field4834 = arg1.method1617((byte) 48);
            }
        } else {
            this.field4836 = arg1.method1574(-103);
        }
        ++field4824;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZIII)V", line = 448)
    public static final void method2191(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        ++field4832;
        if (arg4 >= arg3) {
            for (int var5 = arg3; ~arg4 < ~var5; ++var5) {
                class291.field4067[var5][arg0] = arg2;
            }
        } else {
            for (int var6 = arg4; var6 < arg3; ++var6) {
                class291.field4067[var6][arg0] = arg2;
            }
        }
        if (!arg1) {
            field4825 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)[I", line = 494)
    public final int[] method83(int arg0, int arg1) {
        ++field4846;
        int[] var3 = super.field1177.method820(arg1, true);
        if (super.field1177.field1610) {
            int[][] var4 = super.field1177.method816(-128);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class268.field3811 * this.field4834 >> 12;
            int var15 = class268.field3811 * this.field4845 >> 12;
            int var16 = class140.field1737 * this.field4835 >> 12;
            int var17 = class140.field1737 * this.field4837 >> 12;
            if (~var17 >= -2) {
                return var4[arg1];
            }
            this.field4842 = class268.field3811 / 8 * this.field4826 >> 12;
            int var18 = class268.field3811 / var14 + 1;
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field4836);
            label128: while (true) {
                while (true) {
                    int var22 = class211.method1428(var21, -var14 + var15, arg0 ^ -102) + var14;
                    int var23 = var16 + class211.method1428(var21, -var16 + var17, -105);
                    int var24 = var8 + var22;
                    if (~var24 < ~class268.field3811) {
                        var22 = class268.field3811 - var8;
                        var24 = class268.field3811;
                    }
                    int var10000;
                    int var25;
                    if (var11) {
                        var25 = 0;
                    } else {
                        int var26 = var9;
                        int[] var27 = var20[var9];
                        int var28 = 0;
                        int var29 = var24 - -var5;
                        if (~var29 > -1) {
                            var29 += class268.field3811;
                        }
                        if (var29 > class268.field3811) {
                            var29 -= class268.field3811;
                        }
                        var25 = var27[2];
                        while (true) {
                            int[] var30 = var20[var26];
                            if (~var30[0] >= ~var29 && ~var29 >= ~var30[1]) {
                                if (var9 != var26) {
                                    int var31 = var5 + var8;
                                    if (~var31 > -1) {
                                        var31 += class268.field3811;
                                    }
                                    if (~var31 < ~class268.field3811) {
                                        var31 -= class268.field3811;
                                    }
                                    for (int var32 = 1; ~var28 <= ~var32; ++var32) {
                                        int[] var40 = var20[(var9 + var32) % var12];
                                        var25 = Math.max(var25, var40[2]);
                                    }
                                    for (int var33 = 0; ~var28 <= ~var33; ++var33) {
                                        int[] var34 = var20[(var9 - -var33) % var12];
                                        int var35 = var34[2];
                                        if (var25 != var35) {
                                            int var36 = var34[0];
                                            int var37 = var34[1];
                                            int var38;
                                            int var39;
                                            if (~var31 > ~var29) {
                                                var38 = Math.max(var31, var36);
                                                var39 = Math.min(var29, var37);
                                            } else if (var36 != 0) {
                                                var38 = Math.max(var31, var36);
                                                var39 = class268.field3811;
                                            } else {
                                                var38 = 0;
                                                var39 = Math.min(var29, var37);
                                            }
                                            this.method2189((byte) 117, var21, -var35 + var25, var35, var4, var7 + var38, -var38 + var39);
                                        }
                                    }
                                }
                                var9 = var26;
                                break;
                            }
                            var10000 = ~var12;
                            ++var26;
                            if (var10000 >= ~var26) {
                                var26 = 0;
                            }
                            ++var28;
                        }
                    }
                    if (~(var23 + var25) < ~class140.field1737) {
                        var23 = -var25 + class140.field1737;
                    } else {
                        var10 = false;
                    }
                    if (class268.field3811 != var24) {
                        int[] var41 = var19[var13++];
                        var41[1] = var24;
                        var41[2] = var25 - -var23;
                        var41[0] = var8;
                        this.method2189((byte) 96, var21, var23, var25, var4, var6 + var8, var22);
                        var8 = var24;
                    } else {
                        this.method2189((byte) 87, var21, var23, var25, var4, var6 + var8, var22);
                        if (var10) {
                            break label128;
                        }
                        var10 = true;
                        int[] var42 = var19[var13++];
                        var42[1] = var24;
                        var42[2] = var25 - -var23;
                        var42[0] = var8;
                        int[][] var43 = var20;
                        var20 = var19;
                        var19 = var43;
                        var12 = var13;
                        var13 = 0;
                        var7 = var6;
                        var6 = class211.method1428(var21, class268.field3811, arg0 ^ 1);
                        var8 = 0;
                        var5 = var6 - var7;
                        int var44 = var5;
                        if (~var5 > -1) {
                            var44 = class268.field3811 + var5;
                        }
                        var9 = 0;
                        if (var44 > class268.field3811) {
                            var44 -= class268.field3811;
                        }
                        while (true) {
                            int[] var45 = var20[var9];
                            if (var45[0] <= var44 && ~var45[1] <= ~var44) {
                                var11 = false;
                                break;
                            }
                            var10000 = ~var12;
                            ++var9;
                            if (var10000 >= ~var9) {
                                var9 = 0;
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != 0) {
            this.field4835 = 102;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIBLqe;Lae;)Lgj;", line = 746)
    public static final class381 method2192(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, class274 arg6, class134 arg7) {
        class152.field1881.field3129 = arg1;
        class152.field1881.field3130 = arg2;
        ++field4847;
        if (arg5 <= 117) {
            field4841 = null;
        }
        class152.field1881.field3125 = arg6 != null;
        class152.field1881.field3133 = arg3;
        class152.field1881.field3128 = arg4;
        class152.field1881.field3124 = arg0;
        class152.field1881.field3126 = arg7.field1620;
        return (class381) class26.field322.method568(class152.field1881, 31746);
    }
}
