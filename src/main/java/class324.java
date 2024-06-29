import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class324 extends class273 {

    @OriginalMember(owner = "client!tm", name = "R", descriptor = "I")
    private int field5042 = 1024;

    @OriginalMember(owner = "client!tm", name = "Q", descriptor = "I")
    private int field5041 = 0;

    @OriginalMember(owner = "client!tm", name = "M", descriptor = "I")
    private int field5038 = 2048;

    @OriginalMember(owner = "client!tm", name = "V", descriptor = "I")
    private int field5046 = 1024;

    @OriginalMember(owner = "client!tm", name = "X", descriptor = "I")
    private int field5048 = 1024;

    @OriginalMember(owner = "client!tm", name = "P", descriptor = "I")
    private int field5040 = 0;

    @OriginalMember(owner = "client!tm", name = "K", descriptor = "I")
    private int field5036 = 819;

    @OriginalMember(owner = "client!tm", name = "N", descriptor = "I")
    private int field5039 = 409;

    @OriginalMember(owner = "client!tm", name = "T", descriptor = "I")
    private int field5044 = 1024;

    @OriginalMember(owner = "client!tm", name = "Z", descriptor = "I")
    public static int field5050 = -1;

    @OriginalMember(owner = "client!tm", name = "L", descriptor = "I")
    private int field5037;

    @OriginalMember(owner = "client!tm", name = "S", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!tm", name = "U", descriptor = "I")
    public static int field5045;

    @OriginalMember(owner = "client!tm", name = "W", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!tm", name = "Y", descriptor = "I")
    public static int field5049;

    @OriginalMember(owner = "client!tm", name = "ab", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!tm", name = "bb", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "()V", line = 5)
    public class324() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)V", line = 10)
    public final void method349(int arg0) {
        field5052++;
        if (arg0 != 1) {
            this.method2190((byte) -62, -93, (int[][]) ((int[][]) null), (Random) null, 25, -1, -128);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(BILgn;)V", line = 47)
    public final void method167(byte arg0, int arg1, class303 arg2) {
        if (arg1 == 0) {
            this.field5040 = arg2.method2043((byte) -111);
        } else if (arg1 == 1) {
            this.field5046 = arg2.method1994(false);
        } else if (arg1 == 2) {
            this.field5038 = arg2.method1994(false);
        } else if (arg1 == 3) {
            this.field5039 = arg2.method1994(false);
        } else if (arg1 == 4) {
            this.field5036 = arg2.method1994(false);
        } else if (arg1 == 5) {
            this.field5042 = arg2.method1994(false);
        } else if (arg1 == 6) {
            this.field5041 = arg2.method2043((byte) -111);
        } else if (arg1 == 7) {
            this.field5044 = arg2.method1994(false);
        } else if (arg1 == 8) {
            this.field5048 = arg2.method1994(false);
        }
        field5049++;
        if (arg0 <= 27) {
            this.method2190((byte) -122, 108, (int[][]) ((int[][]) null), (Random) null, 13, 32, -26);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)[I", line = 127)
    public final int[] method331(int arg0, int arg1) {
        if (arg1 != -14650) {
            this.field5040 = -12;
        }
        int[] var3 = this.field4204.method365(arg0, arg1 + 14650);
        field5047++;
        if (!this.field4204.field792) {
            return var3;
        }
        int[][] var4 = this.field4204.method368(arg1 + 35028);
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        boolean var9 = true;
        int var10 = 0;
        boolean var11 = true;
        int var12 = class27.field346 * this.field5046 >> 12;
        int var13 = 0;
        int var14 = 0;
        int var15 = class27.field346 * this.field5038 >> 12;
        int var16 = class99.field1533 * this.field5039 >> 12;
        int var17 = class99.field1533 * this.field5036 >> 12;
        if (var17 <= 1) {
            return var4[arg0];
        }
        this.field5037 = class27.field346 / 8 * this.field5042 >> 12;
        int var18 = class27.field346 / var12 + 1;
        Random var19 = new Random((long) this.field5040);
        int[][] var20 = new int[var18][3];
        int[][] var21 = new int[var18][3];
        while (true) {
            while (true) {
                int var22 = class7.method39((byte) 57, var19, var15 - var12) + var12;
                int var23 = class7.method39((byte) 57, var19, var17 - var16) + var16;
                int var24 = var7 + var22;
                if (var24 > class27.field346) {
                    var24 = class27.field346;
                    var22 = class27.field346 - var7;
                }
                int var28;
                if (var11) {
                    var28 = 0;
                } else {
                    int var25 = 0;
                    int[] var26 = var20[var10];
                    int var27 = var10;
                    var28 = var26[2];
                    int var29 = var6 + var24;
                    if (var29 < 0) {
                        var29 += class27.field346;
                    }
                    if (class27.field346 < var29) {
                        var29 -= class27.field346;
                    }
                    while (true) {
                        int[] var30 = var20[var27];
                        if (var29 >= var30[0] && var29 <= var30[1]) {
                            if (var10 != var27) {
                                int var31 = var7 + var6;
                                if (var31 < 0) {
                                    var31 += class27.field346;
                                }
                                if (var31 > class27.field346) {
                                    var31 -= class27.field346;
                                }
                                for (int var32 = 1; var32 <= var25; var32++) {
                                    int[] var33 = var20[(var10 + var32) % var13];
                                    var28 = Math.max(var28, var33[2]);
                                }
                                for (int var34 = 0; var34 <= var25; var34++) {
                                    int[] var35 = var20[(var10 + var34) % var13];
                                    int var36 = var35[2];
                                    if (var28 != var36) {
                                        int var37 = var35[0];
                                        int var38 = var35[1];
                                        int var39;
                                        int var40;
                                        if (var31 < var29) {
                                            var39 = Math.max(var31, var37);
                                            var40 = Math.min(var29, var38);
                                        } else if (var37 == 0) {
                                            var40 = Math.min(var29, var38);
                                            var39 = 0;
                                        } else {
                                            var39 = Math.max(var31, var37);
                                            var40 = class27.field346;
                                        }
                                        this.method2190((byte) -11, var28 - var36, var4, var19, var40 - var39, var8 + var39, var36);
                                    }
                                }
                            }
                            var10 = var27;
                            break;
                        }
                        var25++;
                        var27++;
                        if (var27 >= var13) {
                            var27 = 0;
                        }
                    }
                }
                if (class99.field1533 < (var23 + var28)) {
                    var23 = class99.field1533 - var28;
                } else {
                    var9 = false;
                }
                if (class27.field346 == var24) {
                    this.method2190((byte) -11, var23, var4, var19, var22, var7 + var5, var28);
                    if (var9) {
                        return var3;
                    }
                    var9 = true;
                    int[] var42 = var21[var14++];
                    int[][] var43 = var20;
                    var42[2] = var23 + var28;
                    var10 = 0;
                    var20 = var21;
                    var42[1] = var24;
                    var42[0] = var7;
                    var13 = var14;
                    var21 = var43;
                    var14 = 0;
                    var8 = var5;
                    var11 = false;
                    var7 = 0;
                    var5 = class7.method39((byte) 57, var19, class27.field346);
                    var6 = var5 - var8;
                    int var44 = var6;
                    if (var6 < 0) {
                        var44 = class27.field346 + var6;
                    }
                    if (var44 > class27.field346) {
                        var44 -= class27.field346;
                    }
                    while (true) {
                        int[] var45 = var20[var10];
                        if (var45[0] <= var44 && var45[1] >= var44) {
                            break;
                        }
                        var10++;
                        if (var10 >= var13) {
                            var10 = 0;
                        }
                    }
                } else {
                    int[] var41 = var21[var14++];
                    var41[2] = var23 + var28;
                    var41[1] = var24;
                    var41[0] = var7;
                    this.method2190((byte) -11, var23, var4, var19, var22, var5 + var7, var28);
                    var7 = var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(BI[[ILjava/util/Random;III)V", line = 372)
    private final void method2190(byte arg0, int arg1, int[][] arg2, Random arg3, int arg4, int arg5, int arg6) {
        int var8 = this.field5048 > 0 ? 4096 - class7.method39((byte) 57, arg3, this.field5048) : 4096;
        field5051++;
        int var9 = this.field5044 * this.field5037 >> 12;
        if (arg0 != -11) {
            this.method331(-63, -123);
        }
        int var10 = this.field5037 - (var9 > 0 ? class7.method39((byte) 57, arg3, var9) : 0);
        if (arg5 >= class27.field346) {
            arg5 -= class27.field346;
        }
        if (var10 > 0) {
            if (arg1 <= 0 || arg4 <= 0) {
                return;
            }
            int var15 = arg1 / 2;
            int var16 = arg4 / 2;
            int var17 = var16 < var10 ? var16 : var10;
            int var18 = var10 <= var15 ? var10 : var15;
            int var19 = arg5 + var17;
            int var20 = arg4 - var17 * 2;
            for (int var21 = 0; var21 < arg1; var21++) {
                int[] var22 = arg2[arg6 + var21];
                if (var18 <= var21) {
                    int var23 = arg1 - var21 - 1;
                    if (var18 <= var23) {
                        for (int var24 = 0; var24 < var17; var24++) {
                            var22[class311.method2135(class197.field2963, arg5 + var24)] = var22[class311.method2135(class197.field2963, arg5 + arg4 - var24 - 1)] = var8 * var24 / var17;
                        }
                        if (var19 + var20 <= class27.field346) {
                            class223.method1500(var22, var19, var20, var8);
                        } else {
                            int var25 = class27.field346 - var19;
                            class223.method1500(var22, var19, var25, var8);
                            class223.method1500(var22, 0, var20 - var25, var8);
                        }
                    } else {
                        int var26 = var8 * var23 / var18;
                        if (this.field5041 == 0) {
                            for (int var29 = 0; var29 < var17; var29++) {
                                int var30 = var8 * var29 / var17;
                                var22[class311.method2135(arg5 + var29, class197.field2963)] = var22[class311.method2135(class197.field2963, arg5 + arg4 - var29 - 1)] = var26 * var30 >> 12;
                            }
                        } else {
                            for (int var27 = 0; var27 < var17; var27++) {
                                int var28 = var8 * var27 / var17;
                                var22[class311.method2135(class197.field2963, arg5 + var27)] = var22[class311.method2135(class197.field2963, arg5 + arg4 - var27 - 1)] = var26 <= var28 ? var26 : var28;
                            }
                        }
                        if (class27.field346 >= (var19 + var20)) {
                            class223.method1500(var22, var19, var20, var26);
                        } else {
                            int var31 = class27.field346 - var19;
                            class223.method1500(var22, var19, var31, var26);
                            class223.method1500(var22, 0, var20 - var31, var26);
                        }
                    }
                } else {
                    int var32 = var8 * var21 / var18;
                    if (this.field5041 == 0) {
                        for (int var35 = 0; var35 < var17; var35++) {
                            int var36 = var8 * var35 / var17;
                            var22[class311.method2135(class197.field2963, arg5 + var35)] = var22[class311.method2135(arg4 + arg5 - (var35 + 1), class197.field2963)] = var32 * var36 >> 12;
                        }
                    } else {
                        for (int var33 = 0; var33 < var17; var33++) {
                            int var34 = var8 * var33 / var17;
                            var22[class311.method2135(class197.field2963, arg5 + var33)] = var22[class311.method2135(class197.field2963, arg4 + arg5 - var33 - 1)] = var32 <= var34 ? var32 : var34;
                        }
                    }
                    if ((var19 + var20) <= class27.field346) {
                        class223.method1500(var22, var19, var20, var32);
                    } else {
                        int var37 = class27.field346 - var19;
                        class223.method1500(var22, var19, var37, var32);
                        class223.method1500(var22, 0, var20 - var37, var32);
                    }
                }
            }
        } else if ((arg4 + arg5) > class27.field346) {
            int var11 = class27.field346 - arg5;
            for (int var12 = 0; var12 < arg1; var12++) {
                int[] var13 = arg2[arg6 + var12];
                class223.method1500(var13, arg5, var11, var8);
                class223.method1500(var13, 0, arg4 - var11, var8);
            }
        } else {
            for (int var14 = 0; var14 < arg1; var14++) {
                class223.method1500(arg2[arg6 + var14], arg5, arg4, var8);
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIILjava/lang/String;ZZZJILjava/lang/String;)V", line = 573)
    public static final void method2191(int arg0, int arg1, int arg2, int arg3, String arg4, boolean arg5, boolean arg6, boolean arg7, long arg8, int arg9, String arg10) {
        field5045++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class303 var14 = new class303(128);
        var14.method2034(-112, 10);
        var14.method2044(1247686728, (arg6 ? 4 : 0) | (arg5 ? 1 : 0) | (arg7 ? 2 : 0));
        if (arg3 >= -120) {
            method2191(18, 46, -37, -54, (String) null, false, true, false, -47L, -74, (String) null);
        }
        var14.method2023(arg8, 119);
        var14.method2013(var12[0], -126);
        var14.method2057(-117, arg10);
        var14.method2013(var12[1], -110);
        var14.method2044(1247686728, class123.field1928);
        var14.method2034(-114, arg9);
        var14.method2034(-54, arg1);
        var14.method2013(var12[2], -66);
        var14.method2044(1247686728, arg0);
        var14.method2044(1247686728, arg2);
        var14.method2013(var12[3], -79);
        var14.method2024(32069, class44.field623, class52.field738);
        class303 var15 = new class303(350);
        var15.method2057(90, arg4);
        int var16 = 8 - (class332.method2279(75, arg4) % 8);
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method2034(-11, (int) (Math.random() * 255.0D));
        }
        var15.method1995(var12, false);
        class265.field4095.field4679 = 0;
        class265.field4095.method2034(-23, 22);
        class265.field4095.method2044(1247686728, var15.field4679 + var14.field4679 + 2);
        class265.field4095.method2044(1247686728, 538);
        class265.field4095.method2060(var14.field4716, -1927867096, var14.field4679, 0);
        class265.field4095.method2060(var15.field4716, -1927867096, var15.field4679, 0);
        class109.field1693 = 0;
        class286.field4385 = 0;
        class19.field265 = 1;
        class285.field4375 = -3;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZLwf;Lwf;Lwf;)V", line = 666)
    public static final void method2192(boolean arg0, class306 arg1, class306 arg2, class306 arg3) {
        if (!arg0) {
            method2191(101, 92, -91, 121, (String) null, true, false, false, 12L, 106, (String) null);
        }
        class105.field1615 = arg3;
        field5043++;
        class154.field2421 = arg1;
        class133.field2096 = arg2;
    }
}
