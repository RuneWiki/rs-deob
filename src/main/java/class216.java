import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class216 extends class170 {

    @OriginalMember(owner = "client!nj", name = "U", descriptor = "I")
    private int field3793 = 2048;

    @OriginalMember(owner = "client!nj", name = "R", descriptor = "I")
    private int field3790 = 819;

    @OriginalMember(owner = "client!nj", name = "bb", descriptor = "I")
    private int field3800 = 1024;

    @OriginalMember(owner = "client!nj", name = "db", descriptor = "I")
    private int field3802 = 1024;

    @OriginalMember(owner = "client!nj", name = "S", descriptor = "I")
    private int field3791 = 409;

    @OriginalMember(owner = "client!nj", name = "cb", descriptor = "I")
    private int field3801 = 1024;

    @OriginalMember(owner = "client!nj", name = "fb", descriptor = "I")
    private int field3804 = 1024;

    @OriginalMember(owner = "client!nj", name = "jb", descriptor = "I")
    private int field3808 = 0;

    @OriginalMember(owner = "client!nj", name = "lb", descriptor = "I")
    private int field3810 = 0;

    @OriginalMember(owner = "client!nj", name = "W", descriptor = "Lmh;")
    public static class128 field3795 = class22.method156(124, "blaugr-Un:");

    @OriginalMember(owner = "client!nj", name = "eb", descriptor = "I")
    public static int field3803 = 0;

    @OriginalMember(owner = "client!nj", name = "Z", descriptor = "I")
    public static int field3798 = 1;

    @OriginalMember(owner = "client!nj", name = "gb", descriptor = "Lmh;")
    public static class128 field3805 = class22.method156(127, "mapflag");

    @OriginalMember(owner = "client!nj", name = "hb", descriptor = "[S")
    public static short[] field3806 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!nj", name = "ib", descriptor = "[Z")
    public static boolean[] field3807 = new boolean[8];

    @OriginalMember(owner = "client!nj", name = "T", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!nj", name = "V", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!nj", name = "X", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!nj", name = "Y", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!nj", name = "ab", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!nj", name = "kb", descriptor = "I")
    private int field3809;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lem;ZIII)V", line = 6)
    public static final void method1491(class10 arg0, boolean arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0.field260;
        int var6 = arg0.field226;
        if (arg0.field271 == 0) {
            arg0.field260 = arg0.field327;
        } else if (arg0.field271 == 1) {
            arg0.field260 = arg4 - arg0.field327;
        } else if (arg0.field271 == 2) {
            arg0.field260 = arg0.field327 * arg4 >> 14;
        } else if (arg0.field271 == 3) {
            if (arg0.field288 == 2) {
                arg0.field260 = arg0.field327 * 32 + ((arg0.field327 - 1) * arg0.field364);
            } else if (arg0.field288 == 7) {
                arg0.field260 = (arg0.field327 - 1) * arg0.field364 + arg0.field327 * 115;
            }
        }
        if (arg0.field272 == 0) {
            arg0.field226 = arg0.field229;
        } else if (arg0.field272 == 1) {
            arg0.field226 = arg2 - arg0.field229;
        } else if (arg0.field272 == 2) {
            arg0.field226 = arg0.field229 * arg2 >> 14;
        } else if (arg0.field272 == 3) {
            if (arg0.field288 == 2) {
                arg0.field226 = arg0.field229 * 32 + ((arg0.field229 - 1) * arg0.field223);
            } else if (arg0.field288 == 7) {
                arg0.field226 = (arg0.field229 - 1) * arg0.field223 + arg0.field229 * 12;
            }
        }
        field3797++;
        if (arg0.field271 == 4) {
            arg0.field260 = arg0.field226 * arg0.field208 / arg0.field297;
        }
        if (arg0.field272 == 4) {
            arg0.field226 = arg0.field297 * arg0.field260 / arg0.field208;
        }
        if (class3.field57 && (client.method1657(arg0) != 0 || arg0.field288 == 0)) {
            if (arg0.field226 < 5 && arg0.field260 < 5) {
                arg0.field260 = 5;
                arg0.field226 = 5;
            } else {
                if (arg0.field226 <= 0) {
                    arg0.field226 = 5;
                }
                if (arg0.field260 <= 0) {
                    arg0.field260 = 5;
                }
            }
        }
        if (arg0.field222 == 1337) {
            class266.field4621 = arg0;
        }
        if (arg3 != -5348) {
            field3805 = (class128) null;
        }
        if (arg1 && arg0.field306 != null && (arg0.field260 != var5 || arg0.field226 != var6)) {
            class102 var7 = new class102();
            var7.field1738 = arg0;
            var7.field1743 = arg0.field306;
            class123.field2073.method2029((byte) -34, var7);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIILjava/util/Random;I[[II)V", line = 109)
    private final void method1492(int arg0, int arg1, int arg2, Random arg3, int arg4, int[][] arg5, int arg6) {
        field3792++;
        int var8 = this.field3802 <= 0 ? 4096 : 4096 - class103.method638((byte) 15, this.field3802, arg3);
        int var9 = this.field3809 * this.field3800 >> 12;
        int var10 = this.field3809 - (var9 > 0 ? class103.method638((byte) 15, var9, arg3) : 0);
        if (arg6 >= class185.field3225) {
            arg6 -= class185.field3225;
        }
        if (var10 > 0) {
            if (arg4 <= 0 || arg2 <= 0) {
                return;
            }
            int var15 = arg2 / 2;
            int var16 = arg4 / 2;
            int var17 = var15 >= var10 ? var10 : var15;
            int var18 = var10 <= var16 ? var10 : var16;
            int var19 = arg6 + var17;
            int var20 = arg2 - (var17 * 2);
            for (int var21 = 0; var21 < arg4; var21++) {
                int[] var22 = arg5[arg1 + var21];
                if (var21 < var18) {
                    int var23 = var8 * var21 / var18;
                    if (this.field3810 == 0) {
                        for (int var26 = 0; var26 < var17; var26++) {
                            int var27 = var8 * var26 / var17;
                            var22[class238.method1622(class5.field94, arg6 + var26)] = var22[class238.method1622(arg6 + arg2 - var26 - 1, class5.field94)] = var23 * var27 >> 12;
                        }
                    } else {
                        for (int var24 = 0; var24 < var17; var24++) {
                            int var25 = var8 * var24 / var17;
                            var22[class238.method1622(class5.field94, arg6 + var24)] = var22[class238.method1622(class5.field94, arg6 - (-arg2 + var24) - 1)] = var23 <= var25 ? var23 : var25;
                        }
                    }
                    if (class185.field3225 < (var19 + var20)) {
                        int var28 = class185.field3225 - var19;
                        class224.method1543(var22, var19, var28, var23);
                        class224.method1543(var22, 0, var20 - var28, var23);
                    } else {
                        class224.method1543(var22, var19, var20, var23);
                    }
                } else {
                    int var29 = arg4 - var21 - 1;
                    if (var18 <= var29) {
                        for (int var30 = 0; var30 < var17; var30++) {
                            var22[class238.method1622(arg6 + var30, class5.field94)] = var22[class238.method1622(arg2 + arg6 - var30 - 1, class5.field94)] = var8 * var30 / var17;
                        }
                        if (class185.field3225 >= var19 + var20) {
                            class224.method1543(var22, var19, var20, var8);
                        } else {
                            int var31 = class185.field3225 - var19;
                            class224.method1543(var22, var19, var31, var8);
                            class224.method1543(var22, 0, var20 - var31, var8);
                        }
                    } else {
                        int var32 = var8 * var29 / var18;
                        if (this.field3810 == 0) {
                            for (int var35 = 0; var35 < var17; var35++) {
                                int var36 = var8 * var35 / var17;
                                var22[class238.method1622(arg6 + var35, class5.field94)] = var22[class238.method1622(class5.field94, arg2 + arg6 - (var35 - -1))] = var32 * var36 >> 12;
                            }
                        } else {
                            for (int var33 = 0; var33 < var17; var33++) {
                                int var34 = var8 * var33 / var17;
                                var22[class238.method1622(arg6 + var33, class5.field94)] = var22[class238.method1622(arg6 + arg2 - var33 - 1, class5.field94)] = var32 <= var34 ? var32 : var34;
                            }
                        }
                        if ((var19 + var20) <= class185.field3225) {
                            class224.method1543(var22, var19, var20, var32);
                        } else {
                            int var37 = class185.field3225 - var19;
                            class224.method1543(var22, var19, var37, var32);
                            class224.method1543(var22, 0, var20 - var37, var32);
                        }
                    }
                }
            }
        } else if (class185.field3225 >= arg2 + arg6) {
            for (int var11 = 0; var11 < arg4; var11++) {
                class224.method1543(arg5[arg1 + var11], arg6, arg2, var8);
            }
        } else {
            int var12 = class185.field3225 - arg6;
            for (int var13 = 0; var13 < arg4; var13++) {
                int[] var14 = arg5[arg1 + var13];
                class224.method1543(var14, arg6, var12, var8);
                class224.method1543(var14, 0, arg2 - var12, var8);
            }
        }
        if (arg0 < 77) {
            method1491((class10) null, true, -105, -111, 74);
        }
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V", line = 697)
    public class216() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILbg;B)V", line = 329)
    public final void method63(int arg0, class194 arg1, byte arg2) {
        field3794++;
        if (arg0 == 0) {
            this.field3808 = arg1.method1325(arg2 ^ 0x1DC6);
        } else if (arg0 == 1) {
            this.field3804 = arg1.method1308(-128);
        } else if (arg0 == 2) {
            this.field3793 = arg1.method1308(-46);
        } else if (arg0 == 3) {
            this.field3791 = arg1.method1308(-85);
        } else if (arg0 == 4) {
            this.field3790 = arg1.method1308(arg2 - 51);
        } else if (arg0 == 5) {
            this.field3801 = arg1.method1308(arg2 ^ 0xFFFFFFD5);
        } else if (arg0 == 6) {
            this.field3810 = arg1.method1325(7627);
        } else if (arg0 == 7) {
            this.field3800 = arg1.method1308(-30);
        } else if (arg0 == 8) {
            this.field3802 = arg1.method1308(arg2 ^ 0xFFFFFFAF);
        }
        if (arg2 != 13) {
            this.field3809 = 13;
        }
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)V", line = 425)
    public final void method267(int arg0) {
        field3796++;
        if (arg0 != -2718) {
            field3807 = (boolean[]) null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BI)[I", line = 442)
    public final int[] method69(byte arg0, int arg1) {
        if (arg0 != 85) {
            this.method1492(-95, -116, -19, (Random) null, -39, (int[][]) ((int[][]) null), -90);
        }
        int[] var3 = this.field2977.method1838(false, arg1);
        field3799++;
        if (!this.field2977.field4552) {
            return var3;
        }
        int[][] var4 = this.field2977.method1840(102);
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        boolean var9 = true;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = class185.field3225 * this.field3804 >> 12;
        boolean var14 = true;
        int var15 = class185.field3225 * this.field3793 >> 12;
        int var16 = class12.field390 * this.field3791 >> 12;
        int var17 = class12.field390 * this.field3790 >> 12;
        if (var17 <= 1) {
            return var4[arg1];
        }
        int var18 = class185.field3225 / var13 + 1;
        int[][] var19 = new int[var18][3];
        this.field3809 = class185.field3225 / 8 * this.field3801 >> 12;
        int[][] var20 = new int[var18][3];
        Random var21 = new Random((long) this.field3808);
        while (true) {
            while (true) {
                int var22 = var13 + class103.method638((byte) 15, var15 - var13, var21);
                int var23 = class103.method638((byte) 15, var17 - var16, var21) + var16;
                int var24 = var7 + var22;
                if (class185.field3225 < var24) {
                    var22 = class185.field3225 - var7;
                    var24 = class185.field3225;
                }
                int var27;
                if (var9) {
                    var27 = 0;
                } else {
                    int var25 = var11;
                    int[] var26 = var20[var11];
                    var27 = var26[2];
                    int var28 = 0;
                    int var29 = var5 + var24;
                    if (var29 < 0) {
                        var29 += class185.field3225;
                    }
                    if (var29 > class185.field3225) {
                        var29 -= class185.field3225;
                    }
                    while (true) {
                        int[] var30 = var20[var25];
                        if (var29 >= var30[0] && var29 <= var30[1]) {
                            if (var11 != var25) {
                                int var31 = var5 + var7;
                                if (var31 < 0) {
                                    var31 += class185.field3225;
                                }
                                if (class185.field3225 < var31) {
                                    var31 -= class185.field3225;
                                }
                                for (int var32 = 1; var32 <= var28; var32++) {
                                    int[] var33 = var20[(var11 + var32) % var10];
                                    var27 = Math.max(var27, var33[2]);
                                }
                                for (int var34 = 0; var34 <= var28; var34++) {
                                    int[] var35 = var20[(var11 + var34) % var10];
                                    int var36 = var35[2];
                                    if (var27 != var36) {
                                        int var37 = var35[0];
                                        int var38 = var35[1];
                                        int var39;
                                        int var40;
                                        if (var31 < var29) {
                                            var40 = Math.max(var31, var37);
                                            var39 = Math.min(var29, var38);
                                        } else if (var37 == 0) {
                                            var39 = Math.min(var29, var38);
                                            var40 = 0;
                                        } else {
                                            var40 = Math.max(var31, var37);
                                            var39 = class185.field3225;
                                        }
                                        this.method1492(106, var36, var39 - var40, var21, var27 - var36, var4, var6 + var40);
                                    }
                                }
                            }
                            var11 = var25;
                            break;
                        }
                        var28++;
                        var25++;
                        if (var25 >= var10) {
                            var25 = 0;
                        }
                    }
                }
                if ((var27 + var23) > class12.field390) {
                    var23 = class12.field390 - var27;
                } else {
                    var14 = false;
                }
                if (class185.field3225 == var24) {
                    this.method1492(120, var27, var22, var21, var23, var4, var7 + var8);
                    if (var14) {
                        return var3;
                    }
                    int[][] var41 = var20;
                    var14 = true;
                    var11 = 0;
                    var6 = var8;
                    int[] var42 = var19[var12++];
                    var42[0] = var7;
                    var42[2] = var27 + var23;
                    var7 = 0;
                    var9 = false;
                    var10 = var12;
                    var42[1] = var24;
                    var20 = var19;
                    var8 = class103.method638((byte) 15, class185.field3225, var21);
                    var19 = var41;
                    var5 = var8 - var6;
                    var12 = 0;
                    int var43 = var5;
                    if (var5 < 0) {
                        var43 = class185.field3225 + var5;
                    }
                    if (class185.field3225 < var43) {
                        var43 -= class185.field3225;
                    }
                    while (true) {
                        int[] var44 = var20[var11];
                        if (var43 >= var44[0] && var44[1] >= var43) {
                            break;
                        }
                        var11++;
                        if (var10 <= var11) {
                            var11 = 0;
                        }
                    }
                } else {
                    int[] var45 = var19[var12++];
                    var45[2] = var23 + var27;
                    var45[1] = var24;
                    var45[0] = var7;
                    this.method1492(85, var27, var22, var21, var23, var4, var7 + var8);
                    var7 = var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "(B)V", line = 738)
    public static void method1493(byte arg0) {
        field3805 = null;
        field3795 = null;
        field3806 = null;
        if (arg0 <= 32) {
            method1493((byte) -73);
        }
        field3807 = null;
    }
}
