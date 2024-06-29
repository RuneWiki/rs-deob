import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class309 extends class177 {

    @OriginalMember(owner = "client!vf", name = "H", descriptor = "I")
    private int field4808 = 1024;

    @OriginalMember(owner = "client!vf", name = "C", descriptor = "I")
    private int field4803 = 819;

    @OriginalMember(owner = "client!vf", name = "O", descriptor = "I")
    private int field4814 = 2048;

    @OriginalMember(owner = "client!vf", name = "R", descriptor = "I")
    private int field4817 = 409;

    @OriginalMember(owner = "client!vf", name = "V", descriptor = "I")
    private int field4821 = 1024;

    @OriginalMember(owner = "client!vf", name = "F", descriptor = "I")
    private int field4806 = 1024;

    @OriginalMember(owner = "client!vf", name = "P", descriptor = "I")
    private int field4815 = 0;

    @OriginalMember(owner = "client!vf", name = "ab", descriptor = "I")
    private int field4826 = 1024;

    @OriginalMember(owner = "client!vf", name = "bb", descriptor = "I")
    private int field4827 = 0;

    @OriginalMember(owner = "client!vf", name = "E", descriptor = "Ljava/lang/String;")
    public static String field4805 = null;

    @OriginalMember(owner = "client!vf", name = "G", descriptor = "[I")
    public static int[] field4807 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!vf", name = "K", descriptor = "Ljava/lang/String;")
    public static String field4811 = "M";

    @OriginalMember(owner = "client!vf", name = "W", descriptor = "Ljava/lang/String;")
    public static String field4822 = "Face here";

    @OriginalMember(owner = "client!vf", name = "I", descriptor = "Ljava/lang/String;")
    public static String field4809 = "Loaded update list";

    @OriginalMember(owner = "client!vf", name = "D", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!vf", name = "J", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!vf", name = "M", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!vf", name = "N", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!vf", name = "Q", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!vf", name = "S", descriptor = "I")
    private int field4818;

    @OriginalMember(owner = "client!vf", name = "U", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!vf", name = "X", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!vf", name = "Y", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!vf", name = "Z", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!vf", name = "T", descriptor = "Lek;")
    public static class184 field4819;

    @OriginalMember(owner = "client!vf", name = "cb", descriptor = "Lcb;")
    public static class283 field4828;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(Lhb;B)Ldk;", line = 4)
    public static final class212 method2138(class35 arg0, byte arg1) {
        field4810++;
        if (arg1 <= 99) {
            field4805 = (String) null;
        }
        return new class212(arg0.method260((byte) 110), arg0.method260((byte) -55), arg0.method260((byte) -66), arg0.method260((byte) 105), arg0.method269(false), arg0.method269(false), arg0.method273(65280));
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIILjava/util/Random;[[III)V", line = 21)
    private final void method2139(int arg0, int arg1, int arg2, Random arg3, int[][] arg4, int arg5, int arg6) {
        field4824++;
        int var8 = this.field4806 <= 0 ? 4096 : 4096 - class66.method561(true, arg3, this.field4806);
        int var9 = this.field4821 * this.field4818 >> 12;
        int var10 = this.field4818 - (~var9 >= arg1 ? 0 : class66.method561(true, arg3, var9));
        if (class287.field4415 <= arg2) {
            arg2 -= class287.field4415;
        }
        if (var10 > 0) {
            if (arg6 <= 0 || arg0 <= 0) {
                return;
            }
            int var15 = arg6 / 2;
            int var16 = arg0 / 2;
            int var17 = var10 > var16 ? var16 : var10;
            int var18 = var10 > var15 ? var15 : var10;
            int var19 = arg2 + var17;
            int var20 = arg0 - var17 * 2;
            for (int var21 = 0; var21 < arg6; var21++) {
                int[] var22 = arg4[arg5 + var21];
                if (var21 >= var18) {
                    int var23 = arg6 - var21 - 1;
                    if (var18 > var23) {
                        int var24 = var8 * var23 / var18;
                        if (this.field4827 == 0) {
                            for (int var27 = 0; var27 < var17; var27++) {
                                int var28 = var8 * var27 / var17;
                                var22[class142.method1078(arg2 + var27, class133.field2090)] = var22[class142.method1078(arg0 + arg2 - var27 - 1, class133.field2090)] = var24 * var28 >> 12;
                            }
                        } else {
                            for (int var25 = 0; var25 < var17; var25++) {
                                int var26 = var8 * var25 / var17;
                                var22[class142.method1078(arg2 + var25, class133.field2090)] = var22[class142.method1078(arg2 + arg0 - var25 - 1, class133.field2090)] = var24 <= var26 ? var24 : var26;
                            }
                        }
                        if (class287.field4415 < var19 + var20) {
                            int var29 = class287.field4415 - var19;
                            class151.method1116(var22, var19, var29, var24);
                            class151.method1116(var22, 0, var20 - var29, var24);
                        } else {
                            class151.method1116(var22, var19, var20, var24);
                        }
                    } else {
                        for (int var30 = 0; var30 < var17; var30++) {
                            var22[class142.method1078(class133.field2090, arg2 + var30)] = var22[class142.method1078(class133.field2090, arg2 + arg0 - var30 - 1)] = var8 * var30 / var17;
                        }
                        if (class287.field4415 < (var19 + var20)) {
                            int var31 = class287.field4415 - var19;
                            class151.method1116(var22, var19, var31, var8);
                            class151.method1116(var22, 0, var20 - var31, var8);
                        } else {
                            class151.method1116(var22, var19, var20, var8);
                        }
                    }
                } else {
                    int var32 = var8 * var21 / var18;
                    if (this.field4827 == 0) {
                        for (int var35 = 0; var35 < var17; var35++) {
                            int var36 = var8 * var35 / var17;
                            var22[class142.method1078(arg2 + var35, class133.field2090)] = var22[class142.method1078(class133.field2090, arg0 + arg2 - var35 - 1)] = var32 * var36 >> 12;
                        }
                    } else {
                        for (int var33 = 0; var33 < var17; var33++) {
                            int var34 = var8 * var33 / var17;
                            var22[class142.method1078(arg2 + var33, class133.field2090)] = var22[class142.method1078(class133.field2090, arg0 + arg2 - var33 - 1)] = var32 <= var34 ? var32 : var34;
                        }
                    }
                    if (var19 + var20 <= class287.field4415) {
                        class151.method1116(var22, var19, var20, var32);
                    } else {
                        int var37 = class287.field4415 - var19;
                        class151.method1116(var22, var19, var37, var32);
                        class151.method1116(var22, 0, var20 - var37, var32);
                    }
                }
            }
        } else if (arg2 + arg0 > class287.field4415) {
            int var11 = class287.field4415 - arg2;
            for (int var12 = 0; var12 < arg6; var12++) {
                int[] var13 = arg4[arg5 + var12];
                class151.method1116(var13, arg2, var11, var8);
                class151.method1116(var13, 0, arg0 - var11, var8);
            }
        } else {
            for (int var14 = 0; var14 < arg6; var14++) {
                class151.method1116(arg4[arg5 + var14], arg2, arg0, var8);
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)V", line = 212)
    public static void method2140(int arg0) {
        field4807 = null;
        field4819 = null;
        field4822 = null;
        field4805 = null;
        field4809 = null;
        field4828 = null;
        if (arg0 != 0) {
            field4828 = (class283) null;
        }
        field4811 = null;
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V", line = 249)
    public class309() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 233)
    public static final void method2141(String arg0, boolean arg1) {
        field4825++;
        int var2 = class130.method994(arg0, (byte) -124);
        if (var2 != -1) {
            if (arg1) {
                field4807 = (int[]) null;
            }
            class222.method1586(126, class213.field3390.field125[var2], class213.field3390.field109[var2]);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V", line = 254)
    public final void method465(int arg0) {
        int var2 = -13 % ((-arg0 - 6) / 43);
        field4812++;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZC)Z", line = 268)
    public static final boolean method2142(boolean arg0, char arg1) {
        field4823++;
        if (arg0) {
            field4811 = (String) null;
        }
        if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        } else if (arg1 >= ' ' && arg1 <= 'ÿ') {
            return true;
        } else {
            return arg1 == '€' || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(III)V", line = 306)
    public static final void method2143(int arg0, int arg1, int arg2) {
        field4813++;
        if (arg2 == 4 && !class289.field4541) {
            arg2 = 2;
            arg0 = 2;
        }
        if (class304.field4755 != arg2) {
            if (class201.field3197) {
                return;
            }
            if (class304.field4755 != 0) {
                class249.field3738[class304.field4755].method73();
            }
            if (arg2 != 0) {
                class8 var3 = class249.field3738[arg2];
                var3.method70();
                var3.method72(arg0);
            }
            class170.field2539 = arg0;
            class304.field4755 = arg2;
        } else if (arg2 != 0 && class170.field2539 != arg0) {
            class249.field3738[arg2].method72(arg0);
            class170.field2539 = arg0;
        }
        if (arg1 > -97) {
            field4822 = (String) null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)[I", line = 352)
    public final int[] method95(int arg0, int arg1) {
        field4816++;
        int[] var3 = this.field2652.method1481(arg1, (byte) -107);
        if (arg0 >= -52) {
            return (int[]) null;
        } else if (this.field2652.field3287) {
            int[][] var4 = this.field2652.method1480((byte) -65);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            boolean var9 = true;
            int var10 = 0;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class287.field4415 * this.field4826 >> 12;
            int var15 = class282.field4361 * this.field4817 >> 12;
            int var16 = class287.field4415 * this.field4814 >> 12;
            int var17 = class282.field4361 * this.field4803 >> 12;
            if (var17 <= 1) {
                return var4[arg1];
            }
            this.field4818 = class287.field4415 / 8 * this.field4808 >> 12;
            int var18 = class287.field4415 / var14 + 1;
            int[][] var19 = new int[var18][3];
            Random var20 = new Random((long) this.field4815);
            int[][] var21 = new int[var18][3];
            while (true) {
                while (true) {
                    int var22 = class66.method561(true, var20, var16 - var14) + var14;
                    int var23 = class66.method561(true, var20, var17 - var15) + var15;
                    int var24 = var7 + var22;
                    if (class287.field4415 < var24) {
                        var22 = class287.field4415 - var7;
                        var24 = class287.field4415;
                    }
                    int var25;
                    if (var11) {
                        var25 = 0;
                    } else {
                        int var26 = var10;
                        int[] var27 = var21[var10];
                        var25 = var27[2];
                        int var28 = 0;
                        int var29 = var24 + var5;
                        if (var29 < 0) {
                            var29 += class287.field4415;
                        }
                        if (var29 > class287.field4415) {
                            var29 -= class287.field4415;
                        }
                        while (true) {
                            int[] var30 = var21[var26];
                            if (var30[0] <= var29 && var29 <= var30[1]) {
                                if (var10 != var26) {
                                    int var31 = var5 + var7;
                                    if (var31 < 0) {
                                        var31 += class287.field4415;
                                    }
                                    if (var31 > class287.field4415) {
                                        var31 -= class287.field4415;
                                    }
                                    for (int var32 = 1; var32 <= var28; var32++) {
                                        int[] var33 = var21[(var10 + var32) % var12];
                                        var25 = Math.max(var25, var33[2]);
                                    }
                                    for (int var34 = 0; var34 <= var28; var34++) {
                                        int[] var35 = var21[(var10 + var34) % var12];
                                        int var36 = var35[2];
                                        if (var25 != var36) {
                                            int var37 = var35[0];
                                            int var38 = var35[1];
                                            int var39;
                                            int var40;
                                            if (var29 > var31) {
                                                var39 = Math.max(var31, var37);
                                                var40 = Math.min(var29, var38);
                                            } else if (var37 == 0) {
                                                var39 = 0;
                                                var40 = Math.min(var29, var38);
                                            } else {
                                                var39 = Math.max(var31, var37);
                                                var40 = class287.field4415;
                                            }
                                            this.method2139(var40 - var39, -1, var6 + var39, var20, var4, var36, var25 - var36);
                                        }
                                    }
                                }
                                var10 = var26;
                                break;
                            }
                            var28++;
                            var26++;
                            if (var26 >= var12) {
                                var26 = 0;
                            }
                        }
                    }
                    if (var23 + var25 > class282.field4361) {
                        var23 = class282.field4361 - var25;
                    } else {
                        var9 = false;
                    }
                    if (class287.field4415 == var24) {
                        this.method2139(var22, -1, var7 + var8, var20, var4, var25, var23);
                        if (var9) {
                            return var3;
                        }
                        var11 = false;
                        int[] var41 = var19[var13++];
                        var41[1] = var24;
                        var41[0] = var7;
                        var6 = var8;
                        int[][] var42 = var21;
                        var9 = true;
                        var10 = 0;
                        var41[2] = var23 + var25;
                        var21 = var19;
                        var8 = class66.method561(true, var20, class287.field4415);
                        var5 = var8 - var6;
                        var19 = var42;
                        var12 = var13;
                        var13 = 0;
                        var7 = 0;
                        int var43 = var5;
                        if (var5 < 0) {
                            var43 = class287.field4415 + var5;
                        }
                        if (class287.field4415 < var43) {
                            var43 -= class287.field4415;
                        }
                        while (true) {
                            int[] var44 = var21[var10];
                            if (var43 >= var44[0] && var44[1] >= var43) {
                                break;
                            }
                            var10++;
                            if (var10 >= var12) {
                                var10 = 0;
                            }
                        }
                    } else {
                        int[] var45 = var19[var13++];
                        var45[2] = var23 + var25;
                        var45[0] = var7;
                        var45[1] = var24;
                        this.method2139(var22, -1, var7 + var8, var20, var4, var25, var23);
                        var7 = var24;
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lhb;II)V", line = 640)
    public final void method97(class35 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field4815 = arg0.method273(arg1 ^ 0xFFFF4673);
        } else if (arg2 == 1) {
            this.field4826 = arg0.method300(-1394191632);
        } else if (arg2 == 2) {
            this.field4814 = arg0.method300(-1394191632);
        } else if (arg2 == 3) {
            this.field4817 = arg0.method300(-1394191632);
        } else if (arg2 == 4) {
            this.field4803 = arg0.method300(-1394191632);
        } else if (arg2 == 5) {
            this.field4808 = arg0.method300(-1394191632);
        } else if (arg2 == 6) {
            this.field4827 = arg0.method273(65280);
        } else if (arg2 == 7) {
            this.field4821 = arg0.method300(-1394191632);
        } else if (arg2 == 8) {
            this.field4806 = arg0.method300(arg1 - 1394173571);
        }
        if (arg1 != -18061) {
            field4811 = (String) null;
        }
        field4804++;
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(III)V", line = 713)
    public static final void method2144(int arg0, int arg1, int arg2) {
        field4820++;
        class45.field706[arg2] = arg1;
        if (arg0 != -377) {
            return;
        }
        class58 var3 = (class58) class30.field385.method203(1710, (long) arg2);
        if (var3 == null) {
            class58 var4 = new class58(4611686018427387905L);
            class30.field385.method208(var4, (long) arg2, arg0 + 377);
        } else if (var3.field859 != 4611686018427387905L) {
            var3.field859 = class234.method1650((byte) -115) + 500L | 0x4000000000000000L;
        }
    }
}
