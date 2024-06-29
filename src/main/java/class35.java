import java.io.IOException;
import java.net.Socket;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class35 extends class306 {

    @OriginalMember(owner = "client!hj", name = "Q", descriptor = "I")
    private int field403 = 1024;

    @OriginalMember(owner = "client!hj", name = "O", descriptor = "I")
    private int field401 = 1024;

    @OriginalMember(owner = "client!hj", name = "T", descriptor = "I")
    private int field405 = 819;

    @OriginalMember(owner = "client!hj", name = "I", descriptor = "I")
    private int field395 = 1024;

    @OriginalMember(owner = "client!hj", name = "W", descriptor = "I")
    private int field408 = 2048;

    @OriginalMember(owner = "client!hj", name = "X", descriptor = "I")
    private int field409 = 1024;

    @OriginalMember(owner = "client!hj", name = "Z", descriptor = "I")
    private int field411 = 0;

    @OriginalMember(owner = "client!hj", name = "bb", descriptor = "I")
    private int field413 = 0;

    @OriginalMember(owner = "client!hj", name = "ab", descriptor = "I")
    private int field412 = 409;

    @OriginalMember(owner = "client!hj", name = "G", descriptor = "Ljava/lang/String;")
    public static String field393 = "Unable to find ";

    @OriginalMember(owner = "client!hj", name = "P", descriptor = "I")
    public static int field402 = -1;

    @OriginalMember(owner = "client!hj", name = "U", descriptor = "[I")
    public static int[] field406 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

    @OriginalMember(owner = "client!hj", name = "H", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!hj", name = "J", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!hj", name = "K", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!hj", name = "L", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!hj", name = "M", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!hj", name = "N", descriptor = "I")
    private int field400;

    @OriginalMember(owner = "client!hj", name = "S", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!hj", name = "V", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!hj", name = "Y", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILlf;I)V", line = 5)
    public final void method45(int arg0, class143 arg1, int arg2) {
        if (arg0 != -15334) {
            this.method45(-120, (class143) null, -55);
        }
        field407++;
        if (arg2 == 0) {
            this.field413 = arg1.method1043(true);
        } else if (arg2 == 1) {
            this.field403 = arg1.method1051(arg0 + 15335);
        } else if (arg2 == 2) {
            this.field408 = arg1.method1051(1);
        } else if (arg2 == 3) {
            this.field412 = arg1.method1051(1);
        } else if (arg2 == 4) {
            this.field405 = arg1.method1051(1);
        } else if (arg2 == 5) {
            this.field401 = arg1.method1051(1);
        } else if (arg2 == 6) {
            this.field411 = arg1.method1043(true);
        } else if (arg2 == 7) {
            this.field395 = arg1.method1051(1);
        } else if (arg2 == 8) {
            this.field409 = arg1.method1051(1);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)[I", line = 101)
    public final int[] method47(int arg0, int arg1) {
        int[] var3 = this.field4757.method903(arg0, arg1 ^ 0x5C2B3CCC);
        field398++;
        if (arg1 != -1546337535) {
            this.method47(117, -9);
        }
        if (!this.field4757.field1898) {
            return var3;
        }
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[][] var7 = this.field4757.method899(arg1 + 1546337629);
        int var8 = 0;
        int var9 = 0;
        boolean var10 = true;
        boolean var11 = true;
        int var12 = 0;
        int var13 = 0;
        int var14 = class31.field367 * this.field408 >> 12;
        int var15 = class99.field1344 * this.field405 >> 12;
        int var16 = class99.field1344 * this.field412 >> 12;
        int var17 = class31.field367 * this.field403 >> 12;
        if (var15 <= 1) {
            return var7[arg0];
        }
        int var18 = (class31.field367 / var17) + 1;
        int[][] var19 = new int[var18][3];
        this.field400 = class31.field367 / 8 * this.field401 >> 12;
        Random var20 = new Random((long) this.field413);
        int[][] var21 = new int[var18][3];
        while (true) {
            while (true) {
                int var22 = class220.method1534(var14 - var17, var20, 2) + var17;
                int var23 = class220.method1534(var15 - var16, var20, 2) + var16;
                int var24 = var8 + var22;
                if (var24 > class31.field367) {
                    var22 = class31.field367 - var8;
                    var24 = class31.field367;
                }
                int var26;
                if (var11) {
                    var26 = 0;
                } else {
                    int[] var25 = var21[var9];
                    var26 = var25[2];
                    int var27 = 0;
                    int var28 = var9;
                    int var29 = var4 + var24;
                    if (var29 < 0) {
                        var29 += class31.field367;
                    }
                    if (class31.field367 < var29) {
                        var29 -= class31.field367;
                    }
                    while (true) {
                        int[] var30 = var21[var28];
                        if (var29 >= var30[0] && var30[1] >= var29) {
                            if (var9 != var28) {
                                int var31 = var4 + var8;
                                if (var31 < 0) {
                                    var31 += class31.field367;
                                }
                                if (var31 > class31.field367) {
                                    var31 -= class31.field367;
                                }
                                for (int var32 = 1; var32 <= var27; var32++) {
                                    int[] var33 = var21[(var9 + var32) % var13];
                                    var26 = Math.max(var26, var33[2]);
                                }
                                for (int var34 = 0; var34 <= var27; var34++) {
                                    int[] var35 = var21[(var9 + var34) % var13];
                                    int var36 = var35[2];
                                    if (var26 != var36) {
                                        int var37 = var35[1];
                                        int var38 = var35[0];
                                        int var39;
                                        int var40;
                                        if (var31 < var29) {
                                            var39 = Math.max(var31, var38);
                                            var40 = Math.min(var29, var37);
                                        } else if (var38 == 0) {
                                            var39 = 0;
                                            var40 = Math.min(var29, var37);
                                        } else {
                                            var39 = Math.max(var31, var38);
                                            var40 = class31.field367;
                                        }
                                        this.method233(var36, arg1 ^ 0xA3D4C300, var7, var20, var26 - var36, var6 + var39, var40 - var39);
                                    }
                                }
                            }
                            var9 = var28;
                            break;
                        }
                        var28++;
                        if (var28 >= var13) {
                            var28 = 0;
                        }
                        var27++;
                    }
                }
                if (var23 + var26 > class99.field1344) {
                    var23 = class99.field1344 - var26;
                } else {
                    var10 = false;
                }
                if (class31.field367 == var24) {
                    this.method233(var26, arg1 ^ 0xA3D4C300, var7, var20, var23, var5 + var8, var22);
                    if (var10) {
                        return var3;
                    }
                    var6 = var5;
                    var11 = false;
                    var9 = 0;
                    int[][] var42 = var21;
                    int[] var43 = var19[var12++];
                    var13 = var12;
                    var43[0] = var8;
                    var10 = true;
                    var43[1] = var24;
                    var12 = 0;
                    var8 = 0;
                    var21 = var19;
                    var43[2] = var23 + var26;
                    var5 = class220.method1534(class31.field367, var20, 2);
                    var4 = var5 - var6;
                    var19 = var42;
                    int var44 = var4;
                    if (var4 < 0) {
                        var44 = class31.field367 + var4;
                    }
                    if (class31.field367 < var44) {
                        var44 -= class31.field367;
                    }
                    while (true) {
                        int[] var45 = var21[var9];
                        if (var45[0] <= var44 && var44 <= var45[1]) {
                            break;
                        }
                        var9++;
                        if (var9 >= var13) {
                            var9 = 0;
                        }
                    }
                } else {
                    int[] var41 = var19[var12++];
                    var41[0] = var8;
                    var41[1] = var24;
                    var41[2] = var23 + var26;
                    this.method233(var26, 1, var7, var20, var23, var5 + var8, var22);
                    var8 = var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(B)V", line = 350)
    public final void method43(byte arg0) {
        if (arg0 < -103) {
            field399++;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II[[ILjava/util/Random;III)V", line = 360)
    private final void method233(int arg0, int arg1, int[][] arg2, Random arg3, int arg4, int arg5, int arg6) {
        field396++;
        if (arg1 != 1) {
            this.method45(-67, (class143) null, 47);
        }
        int var8 = this.field409 <= 0 ? 4096 : 4096 - class220.method1534(this.field409, arg3, arg1 ^ 0x3);
        int var9 = this.field400 * this.field395 >> 12;
        int var10 = this.field400 - (var9 <= 0 ? 0 : class220.method1534(var9, arg3, arg1 + 1));
        if (arg5 >= class31.field367) {
            arg5 -= class31.field367;
        }
        if (var10 > 0) {
            if (arg4 <= 0 || arg6 <= 0) {
                return;
            }
            int var11 = arg6 / 2;
            int var12 = var10 <= var11 ? var10 : var11;
            int var13 = arg4 / 2;
            int var14 = var13 >= var10 ? var10 : var13;
            int var15 = arg5 + var12;
            int var16 = arg6 - var12 * 2;
            for (int var17 = 0; var17 < arg4; var17++) {
                int[] var18 = arg2[var17 + arg0];
                if (var14 > var17) {
                    int var19 = var8 * var17 / var14;
                    if (this.field411 == 0) {
                        for (int var22 = 0; var22 < var12; var22++) {
                            int var23 = var8 * var22 / var12;
                            var18[class261.method1840(arg5 + var22, class311.field4878)] = var18[class261.method1840(class311.field4878, arg5 + arg6 - var22 - 1)] = var19 * var23 >> 12;
                        }
                    } else {
                        for (int var20 = 0; var20 < var12; var20++) {
                            int var21 = var8 * var20 / var12;
                            var18[class261.method1840(arg5 + var20, class311.field4878)] = var18[class261.method1840(arg5 + arg6 - var20 - 1, class311.field4878)] = var21 < var19 ? var21 : var19;
                        }
                    }
                    if (class31.field367 < var15 + var16) {
                        int var24 = class31.field367 - var15;
                        class8.method49(var18, var15, var24, var19);
                        class8.method49(var18, 0, var16 - var24, var19);
                    } else {
                        class8.method49(var18, var15, var16, var19);
                    }
                } else {
                    int var25 = arg4 - var17 - 1;
                    if (var25 >= var14) {
                        for (int var26 = 0; var26 < var12; var26++) {
                            var18[class261.method1840(class311.field4878, arg5 + var26)] = var18[class261.method1840(class311.field4878, arg5 + arg6 - var26 - 1)] = var8 * var26 / var12;
                        }
                        if (class31.field367 >= (var15 + var16)) {
                            class8.method49(var18, var15, var16, var8);
                        } else {
                            int var27 = class31.field367 - var15;
                            class8.method49(var18, var15, var27, var8);
                            class8.method49(var18, 0, var16 - var27, var8);
                        }
                    } else {
                        int var28 = var8 * var25 / var14;
                        if (this.field411 == 0) {
                            for (int var31 = 0; var31 < var12; var31++) {
                                int var32 = var8 * var31 / var12;
                                var18[class261.method1840(class311.field4878, arg5 + var31)] = var18[class261.method1840(arg5 + arg6 - (var31 + 1), class311.field4878)] = var28 * var32 >> 12;
                            }
                        } else {
                            for (int var29 = 0; var29 < var12; var29++) {
                                int var30 = var8 * var29 / var12;
                                var18[class261.method1840(class311.field4878, arg5 + var29)] = var18[class261.method1840(class311.field4878, arg5 + arg6 - var29 - 1)] = var30 >= var28 ? var28 : var30;
                            }
                        }
                        if ((var15 + var16) > class31.field367) {
                            int var33 = class31.field367 - var15;
                            class8.method49(var18, var15, var33, var28);
                            class8.method49(var18, 0, var16 - var33, var28);
                        } else {
                            class8.method49(var18, var15, var16, var28);
                        }
                    }
                }
            }
        } else if (class31.field367 >= arg5 + arg6) {
            for (int var34 = 0; var34 < arg4; var34++) {
                class8.method49(arg2[arg0 + var34], arg5, arg6, var8);
            }
        } else {
            int var35 = class31.field367 - arg5;
            for (int var36 = 0; var36 < arg4; var36++) {
                int[] var37 = arg2[arg0 + var36];
                class8.method49(var37, arg5, var35, var8);
                class8.method49(var37, 0, arg6 - var35, var8);
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(III[Lhi;IIIIII)V", line = 558)
    public static final void method234(int arg0, int arg1, int arg2, class323[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field404++;
        if (class272.field4317) {
            class239.method1668(arg8, arg1, arg2, arg9);
        } else {
            class343.method2368(arg8, arg1, arg2, arg9);
            class104.method671();
        }
        if (arg5 < 3) {
            return;
        }
        for (int var10 = 0; var10 < arg3.length; var10++) {
            class323 var11 = arg3[var10];
            if (var11 != null && (var11.field5196 == arg4 || arg4 == -1412584499 && class147.field2341 == var11)) {
                int var12;
                if (arg0 == -1) {
                    class213.field3239[class63.field765] = var11.field5029 + arg7;
                    class116.field1612[class63.field765] = var11.field5104 + arg6;
                    class280.field4417[class63.field765] = var11.field5169;
                    class71.field891[class63.field765] = var11.field5174;
                    var12 = class63.field765++;
                } else {
                    var12 = arg0;
                }
                var11.field5190 = class102.field1381;
                var11.field5078 = var12;
                if (!var11.field5172 || !client.method2015(var11)) {
                    if (var11.field5182 > 0) {
                        class120.method781((byte) 98, var11);
                    }
                    int var13 = var11.field5029 + arg7;
                    int var14 = var11.field5104 + arg6;
                    int var15 = var11.field5183;
                    if (class214.field3244 && (client.method2013(var11).field994 != 0 || var11.field5107 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class147.field2341 == var11) {
                        if (arg4 != -1412584499 && !var11.field5035) {
                            class194.field2940 = arg3;
                            class10.field108 = arg6;
                            class50.field575 = arg7;
                            continue;
                        }
                        if (class214.field3245 && class205.field3110) {
                            int var16 = class197.field3009;
                            int var17 = var16 - class247.field3928;
                            int var18 = class128.field1873;
                            int var19 = var18 - class85.field1120;
                            if (var17 < class360.field5703) {
                                var17 = class360.field5703;
                            }
                            if (field402 > var19) {
                                var19 = field402;
                            }
                            if ((field402 + class67.field838.field5174) < (var19 + var11.field5174)) {
                                var19 = field402 + class67.field838.field5174 - var11.field5174;
                            }
                            var14 = var19;
                            if ((class360.field5703 + class67.field838.field5169) < (var11.field5169 + var17)) {
                                var17 = class360.field5703 + class67.field838.field5169 - var11.field5169;
                            }
                            var13 = var17;
                        }
                        if (!var11.field5035) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var22;
                    int var24;
                    int var25;
                    if (var11.field5107 == 2) {
                        var25 = arg9;
                        var22 = arg8;
                        var24 = arg2;
                        var20 = arg1;
                    } else {
                        var20 = arg1 >= var14 ? arg1 : var14;
                        int var21 = var11.field5169 + var13;
                        var22 = var13 > arg8 ? var13 : arg8;
                        int var23 = var11.field5174 + var14;
                        if (var11.field5107 == 9) {
                            var21++;
                            var23++;
                        }
                        var24 = arg2 <= var21 ? arg2 : var21;
                        var25 = var23 >= arg9 ? arg9 : var23;
                    }
                    if (!var11.field5172 || var24 > var22 && var20 < var25) {
                        if (var11.field5182 != 0) {
                            if (var11.field5182 == 1337 || var11.field5182 == 1403) {
                                class131.field1883 = var11;
                                class149.field2367 = var14;
                                class60.field703 = var13;
                                class24.method181(var11.field5174, var11.field5169, var14, var13, true, var11.field5182 == 1403);
                                class302.field4702[var12] = true;
                                if (class272.field4317) {
                                    class239.method1668(arg8, arg1, arg2, arg9);
                                } else {
                                    class343.method2368(arg8, arg1, arg2, arg9);
                                }
                                continue;
                            }
                            if (var11.field5182 == 1338) {
                                if (!var11.method2247(-97)) {
                                    continue;
                                }
                                class316.method2229(var13, var12, var14, 4, var11);
                                if (class272.field4317) {
                                    class239.method1668(arg8, arg1, arg2, arg9);
                                } else {
                                    class343.method2368(arg8, arg1, arg2, arg9);
                                }
                                if (class355.field5641 != 0 && class355.field5641 != 3 || class38.field437 || var22 > class344.field5450 || class190.field2851 < var20 || class344.field5450 >= var24 || class190.field2851 >= var25) {
                                    continue;
                                }
                                int var127 = class190.field2851 - var14;
                                int var128 = class344.field5450 - var13;
                                int var129 = var11.field5175[var127];
                                if (var128 < var129 || (var11.field5093[var127] + var129) < var128) {
                                    continue;
                                }
                                int var130 = var128 - var11.field5169 / 2;
                                int var131 = var127 - var11.field5174 / 2;
                                int var132 = (int) class190.field2855 + class132.field1912 & 0x7FF;
                                int var133 = class104.field1426[var132];
                                int var134 = class104.field1435[var132];
                                int var135 = (class67.field831 + 256) * var134 >> 8;
                                int var136 = (class67.field831 + 256) * var133 >> 8;
                                int var137 = var131 * var136 + (var130 * var135) >> 11;
                                int var138 = var131 * var135 - (var130 * var136) >> 11;
                                int var139 = class11.field113.field3767 - (-var137 - 64) - class11.field113.method412((byte) 80) * 64 >> 7;
                                int var140 = class11.field113.field3763 - (var138 + class11.field113.method412((byte) 122) * 64 - 64) >> 7;
                                if (class101.field1371 && (class139.field2088 & 0x40) != 0) {
                                    class323 var141 = class291.method2078(class225.field3393, class196.field2978, 0);
                                    if (var141 == null) {
                                        class92.method574(8180);
                                    } else {
                                        class67.method413(var139, 0, class5.field48, " ->", class260.field4110, (short) 10, 1L, var140);
                                    }
                                    continue;
                                }
                                if (class199.field3024 == 1) {
                                    class67.method413(var139, 0, -1, "", class212.field3226, (short) 6, 1L, var140);
                                }
                                class67.method413(var139, 0, -1, "", class78.field1032, (short) 28, 1L, var140);
                                continue;
                            }
                            if (var11.field5182 == 1339) {
                                if (var11.method2247(-78)) {
                                    class220.method1533(var13, var14, var11, var12, -109);
                                    if (class272.field4317) {
                                        class239.method1668(arg8, arg1, arg2, arg9);
                                    } else {
                                        class343.method2368(arg8, arg1, arg2, arg9);
                                    }
                                }
                                continue;
                            }
                            if (var11.field5182 == 1400) {
                                class170.method1198(var11.field5169, var14, var11.field5174, var13, 2);
                                class302.field4702[var12] = true;
                                class135.field2012[var12] = true;
                                if (class272.field4317) {
                                    class239.method1668(arg8, arg1, arg2, arg9);
                                } else {
                                    class343.method2368(arg8, arg1, arg2, arg9);
                                }
                                continue;
                            }
                            if (var11.field5182 == 1401) {
                                class309.method2179(var14, (byte) 124, var11.field5174, var11.field5169, var13);
                                class302.field4702[var12] = true;
                                class135.field2012[var12] = true;
                                if (class272.field4317) {
                                    class239.method1668(arg8, arg1, arg2, arg9);
                                } else {
                                    class343.method2368(arg8, arg1, arg2, arg9);
                                }
                                continue;
                            }
                            if (var11.field5182 == 1402) {
                                if (!class272.field4317) {
                                    class271.method1921(var13, false, var14);
                                    class302.field4702[var12] = true;
                                    class135.field2012[var12] = true;
                                }
                                continue;
                            }
                            if (var11.field5182 == 1405) {
                                if (!class226.field3425) {
                                    continue;
                                }
                                int var112 = var14 + 15;
                                int var113 = var11.field5169 + var13;
                                class41.field446.method1672("Fps:" + class14.field141, var113, var112, 16776960, -1);
                                Runtime var114 = Runtime.getRuntime();
                                int var115 = (int) ((var114.totalMemory() - var114.freeMemory()) / 1024L);
                                int var142 = var112 + 15;
                                int var116 = 16776960;
                                if (var115 > 65536) {
                                    var116 = 16711680;
                                }
                                class41.field446.method1672("Mem:" + var115 + "k", var113, var142, var116, -1);
                                var112 = var142 + 15;
                                if (class272.field4317) {
                                    int var117 = 16776960;
                                    int var118 = (class1.field5 + class1.field2 + class1.field6) / 1024;
                                    if (var118 > 65536) {
                                        var117 = 16711680;
                                    }
                                    class41.field446.method1672("Card:" + var118 + "k", var113, var112, var117, -1);
                                    var112 += 15;
                                }
                                int var119 = 16776960;
                                int var120 = 0;
                                int var121 = 0;
                                int var122 = 0;
                                for (int var123 = 0; var123 < 29; var123++) {
                                    var120 += class147.field2337[var123].method1468((byte) -78);
                                    var121 += class147.field2337[var123].method1467(-2);
                                    var122 += class147.field2337[var123].method1477(1779);
                                }
                                int var124 = var122 * 100 / var120;
                                int var125 = var121 * 10000 / var120;
                                String var126 = "Cache:" + class93.method614((long) var125, true, 2, 0, (byte) 124) + "% (" + var124 + "%)";
                                class344.field5463.method1672(var126, var113, var112, var119, -1);
                                var112 += 12;
                                if (class141.field2172 > 0) {
                                    class344.field5463.method1672("Particles: " + class141.field2165 + " / " + class141.field2172, var113, var112, var119, -1);
                                }
                                var112 += 12;
                                class302.field4702[var12] = true;
                                class135.field2012[var12] = true;
                                continue;
                            }
                            if (var11.field5182 == 1406) {
                                class291.field4581 = var13;
                                class349.field5571 = var14;
                                class222.field3358 = var11;
                                continue;
                            }
                        }
                        if (!class38.field437) {
                            if (var11.field5107 == 0 && var11.field5129 && var22 <= class344.field5450 && var20 <= class190.field2851 && class344.field5450 < var24 && class190.field2851 < var25 && !class214.field3244) {
                                class29.field342[0] = class99.field1341;
                                class74.field924 = 1;
                                class105.field1442[0] = 1009;
                                class304.field4734[0] = class161.field2479;
                                class222.field3357[0] = "";
                            }
                            if (var22 <= class344.field5450 && class190.field2851 >= var20 && var24 > class344.field5450 && class190.field2851 < var25) {
                                class352.method2440(var11, class344.field5450 - var13, 119, class190.field2851 - var14);
                            }
                        }
                        if (var11.field5107 == 0) {
                            if (!var11.field5172 && client.method2015(var11) && class131.field1888 != var11) {
                                continue;
                            }
                            if (!var11.field5172) {
                                if (var11.field5188 > var11.field5187 - var11.field5174) {
                                    var11.field5188 = var11.field5187 - var11.field5174;
                                }
                                if (var11.field5188 < 0) {
                                    var11.field5188 = 0;
                                }
                            }
                            if (class272.field4317 && var11.field5182 == 1407) {
                                class152.method1113(var13, var14, var11.field5169, var11.field5174);
                            }
                            method234(var12, var20, var24, arg3, var11.field5073, 36, var14 - var11.field5188, var13 - var11.field5142, var22, var25);
                            if (var11.field5036 != null) {
                                method234(var12, var20, var24, var11.field5036, var11.field5073, 105, var14 - var11.field5188, -var11.field5142 + var13, var22, var25);
                            }
                            class238 var26 = (class238) class88.field1166.method770((long) var11.field5073, 116);
                            if (var26 != null) {
                                if (var26.field3663 == 0 && !class38.field437 && class344.field5450 >= var22 && var20 <= class190.field2851 && var24 > class344.field5450 && class190.field2851 < var25 && !class214.field3244) {
                                    class105.field1442[0] = 1009;
                                    class29.field342[0] = class99.field1341;
                                    class74.field924 = 1;
                                    class222.field3357[0] = "";
                                    class304.field4734[0] = class161.field2479;
                                }
                                class143.method1011(var20, var24, 0, var26.field3658, var13, var12, var14, var22, var25);
                            }
                            if (class272.field4317 && var11.field5182 == 1407) {
                                class152.method1111();
                                class19.field232 = true;
                            }
                            if (class272.field4317) {
                                class239.method1668(arg8, arg1, arg2, arg9);
                            } else {
                                class343.method2368(arg8, arg1, arg2, arg9);
                                class104.method671();
                            }
                        }
                        if (class93.field1212[var12] || class92.field1208 > 1) {
                            if (var11.field5107 == 0 && !var11.field5172 && var11.field5187 > var11.field5174) {
                                class132.method910(var11.field5187, var11.field5169 + var13, var14, var11.field5188, true, var11.field5174);
                            }
                            if (var11.field5107 != 1) {
                                if (var11.field5107 == 2) {
                                    int var27 = 0;
                                    for (int var28 = 0; var28 < var11.field5131; var28++) {
                                        for (int var29 = 0; var29 < var11.field5095; var29++) {
                                            int var30 = (var11.field5071 + 32) * var29 + var13;
                                            int var31 = var14 + ((var11.field5061 + 32) * var28);
                                            if (var27 < 20) {
                                                var30 += var11.field5050[var27];
                                                var31 += var11.field5055[var27];
                                            }
                                            if (var11.field5143[var27] > 0) {
                                                boolean var33 = false;
                                                int var34 = var11.field5143[var27] - 1;
                                                boolean var35 = false;
                                                if ((var30 + 32) > arg8 && arg2 > var30 && var31 + 32 > arg1 && arg9 > var31 || class203.field3088 == var11 && class78.field1028 == var27) {
                                                    class2 var36;
                                                    if (class119.field1662 == 1 && class230.field3483 == var27 && class119.field1663 == var11.field5073) {
                                                        var36 = class19.method142(var11.field5153[var27], var11.field5100, var34, 6272, (class246) null, 0, 2);
                                                    } else {
                                                        var36 = class19.method142(var11.field5153[var27], var11.field5100, var34, 6272, (class246) null, 3153952, 1);
                                                    }
                                                    if (class104.field1429) {
                                                        class302.field4702[var12] = true;
                                                    }
                                                    if (var36 == null) {
                                                        class107.method693(var11, 6);
                                                    } else if (class203.field3088 == var11 && class78.field1028 == var27) {
                                                        int var37 = class197.field3009 - class110.field1517;
                                                        if (var37 < 5 && var37 > -5) {
                                                            var37 = 0;
                                                        }
                                                        int var38 = class128.field1873 - class6.field75;
                                                        if (var38 < 5 && var38 > -5) {
                                                            var38 = 0;
                                                        }
                                                        if (class65.field774 < 5) {
                                                            var37 = 0;
                                                            var38 = 0;
                                                        }
                                                        var36.method13(var30 + var37, var31 + var38, 128);
                                                        if (arg4 != -1) {
                                                            int var39;
                                                            int var40;
                                                            if (class272.field4317) {
                                                                var40 = class239.field3666;
                                                                var39 = class239.field3667;
                                                            } else {
                                                                var39 = class343.field5435;
                                                                var40 = class343.field5433;
                                                            }
                                                            class323 var41 = arg3[arg4 & 0xFFFF];
                                                            if (var40 > (var31 + var38) && var41.field5188 > 0) {
                                                                int var42 = (var40 - var31 - var38) * class266.field4193 / 3;
                                                                if (var42 > (class266.field4193 * 10)) {
                                                                    var42 = class266.field4193 * 10;
                                                                }
                                                                if (var41.field5188 < var42) {
                                                                    var42 = var41.field5188;
                                                                }
                                                                class6.field75 += var42;
                                                                var41.field5188 -= var42;
                                                                class107.method693(var41, 6);
                                                            }
                                                            if (var39 < var31 + var38 + 32 && var41.field5188 < var41.field5187 - var41.field5174) {
                                                                int var43 = (var31 + var38 + 32 - var39) * class266.field4193 / 3;
                                                                if (class266.field4193 * 10 < var43) {
                                                                    var43 = class266.field4193 * 10;
                                                                }
                                                                if (var41.field5187 - var41.field5174 - var41.field5188 < var43) {
                                                                    var43 = var41.field5187 - var41.field5174 - var41.field5188;
                                                                }
                                                                class6.field75 -= var43;
                                                                var41.field5188 += var43;
                                                                class107.method693(var41, 6);
                                                            }
                                                        }
                                                    } else if (class312.field4895 == var11 && class226.field3416 == var27) {
                                                        var36.method13(var30, var31, 128);
                                                    } else {
                                                        var36.method11(var30, var31);
                                                    }
                                                }
                                            } else if (var11.field5151 != null && var27 < 20) {
                                                class2 var32 = var11.method2248(91, var27);
                                                if (var32 != null) {
                                                    var32.method11(var30, var31);
                                                } else if (class72.field907) {
                                                    class107.method693(var11, 6);
                                                }
                                            }
                                            var27++;
                                        }
                                    }
                                } else if (var11.field5107 == 3) {
                                    int var111;
                                    if (class174.method1211(-5, var11)) {
                                        var111 = var11.field5103;
                                        if (class131.field1888 == var11 && var11.field5069 != 0) {
                                            var111 = var11.field5069;
                                        }
                                    } else {
                                        var111 = var11.field5060;
                                        if (class131.field1888 == var11 && var11.field5074 != 0) {
                                            var111 = var11.field5074;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field5094) {
                                            if (class272.field4317) {
                                                class239.method1659(var13, var14, var11.field5169, var11.field5174, var111);
                                            } else {
                                                class343.method2352(var13, var14, var11.field5169, var11.field5174, var111);
                                            }
                                        } else if (class272.field4317) {
                                            class239.method1665(var13, var14, var11.field5169, var11.field5174, var111);
                                        } else {
                                            class343.method2369(var13, var14, var11.field5169, var11.field5174, var111);
                                        }
                                    } else if (var11.field5094) {
                                        if (class272.field4317) {
                                            class239.method1652(var13, var14, var11.field5169, var11.field5174, var111, 256 - (var15 & 0xFF));
                                        } else {
                                            class343.method2364(var13, var14, var11.field5169, var11.field5174, var111, 256 - (var15 & 0xFF));
                                        }
                                    } else if (class272.field4317) {
                                        class239.method1667(var13, var14, var11.field5169, var11.field5174, var111, 256 - (var15 & 0xFF));
                                    } else {
                                        class343.method2361(var13, var14, var11.field5169, var11.field5174, var111, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field5107 == 4) {
                                    class240 var44 = var11.method2251(16839, class55.field647);
                                    if (var44 != null) {
                                        String var45 = var11.field5098;
                                        int var46;
                                        if (class174.method1211(-5, var11)) {
                                            var46 = var11.field5103;
                                            if (class131.field1888 == var11 && var11.field5069 != 0) {
                                                var46 = var11.field5069;
                                            }
                                            if (var11.field5176.length() > 0) {
                                                var45 = var11.field5176;
                                            }
                                        } else {
                                            var46 = var11.field5060;
                                            if (class131.field1888 == var11 && var11.field5074 != 0) {
                                                var46 = var11.field5074;
                                            }
                                        }
                                        if (var11.field5172 && var11.field5195 != -1) {
                                            class309 var47 = class190.method1302(var11.field5195, (byte) 45);
                                            var45 = var47.field4868;
                                            if (var45 == null) {
                                                var45 = "null";
                                            }
                                            if ((var47.field4814 == 1 || var11.field5066 != 1) && var11.field5066 != -1) {
                                                var45 = "<col=ff9040>" + var45 + "</col> x" + class306.method2159(var11.field5066, 4);
                                            }
                                        }
                                        if (class13.field126 == var11) {
                                            var46 = var11.field5060;
                                            var45 = class6.field69;
                                        }
                                        if (!var11.field5172) {
                                            var45 = class17.method128(var11, (byte) 63, var45);
                                        }
                                        var44.method1673(var45, var13, var14, var11.field5169, var11.field5174, var46, var11.field5054 ? 0 : -1, var11.field5019, var11.field5080, var11.field5134);
                                    } else if (class72.field907) {
                                        class107.method693(var11, 6);
                                    }
                                } else if (var11.field5107 == 5) {
                                    if (!var11.field5172) {
                                        class2 var64 = var11.method2249(-67, class174.method1211(-5, var11));
                                        if (var64 != null) {
                                            var64.method11(var13, var14);
                                        } else if (class72.field907) {
                                            class107.method693(var11, 6);
                                        }
                                    } else if (var11.field5184 >= 0) {
                                        class3 var63 = var11.method2255((byte) -127);
                                        if (class272.field4317) {
                                            var63.method24(0, var13, var14, var11.field5169, var11.field5174, var11.field5152, var11.field5167, 0);
                                        } else {
                                            var63.method21(0, var13, var14, var11.field5169, var11.field5174, var11.field5152, var11.field5167, 0);
                                        }
                                    } else {
                                        class2 var48;
                                        if (var11.field5195 == -1) {
                                            var48 = var11.method2249(-126, false);
                                        } else if (var11.field5043 && class11.field113.field813 != null) {
                                            var48 = class19.method142(var11.field5066, var11.field5100, var11.field5195, 6272, class11.field113.field813, var11.field5158, var11.field5045);
                                        } else {
                                            var48 = class19.method142(var11.field5066, var11.field5100, var11.field5195, 6272, (class246) null, var11.field5158, var11.field5045);
                                        }
                                        if (var48 != null) {
                                            int var49 = var48.field17;
                                            int var50 = var48.field16;
                                            if (var11.field5025) {
                                                int var52 = (var49 + var11.field5169 - 1) / var49;
                                                int var53 = (var11.field5174 - (1 - var50)) / var50;
                                                if (class272.field4317) {
                                                    class239.method1661(var13, var14, var11.field5169 + var13, var11.field5174 + var14);
                                                    boolean var56 = class181.method1250(var48.field13, -4);
                                                    boolean var57 = class181.method1250(var48.field24, -4);
                                                    class200 var58 = (class200) var48;
                                                    if (var56 && var57) {
                                                        if (var15 == 0) {
                                                            var58.method1388(var13, var14, var52, var53);
                                                        } else {
                                                            var58.method1393(var13, var14, 256 - (var15 & 0xFF), var52, var53);
                                                        }
                                                    } else if (var56) {
                                                        for (int var59 = 0; var59 < var53; var59++) {
                                                            if (var15 == 0) {
                                                                var58.method1388(var13, var14 + (var50 * var59), var52, 1);
                                                            } else {
                                                                var58.method1393(var13, var50 * var59 + var14, -(var15 & 0xFF) + 256, var52, 1);
                                                            }
                                                        }
                                                    } else if (var57) {
                                                        for (int var60 = 0; var60 < var52; var60++) {
                                                            if (var15 == 0) {
                                                                var58.method1388(var13 + (var49 * var60), var14, 1, var53);
                                                            } else {
                                                                var58.method1393(var49 * var60 + var13, var14, 256 - (var15 & 0xFF), 1, var53);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var61 = 0; var61 < var52; var61++) {
                                                            for (int var62 = 0; var62 < var53; var62++) {
                                                                if (var15 == 0) {
                                                                    var48.method11(var49 * var61 + var13, var50 * var62 + var14);
                                                                } else {
                                                                    var48.method13(var49 * var61 + var13, var14 - -(var50 * var62), 256 - (var15 & 0xFF));
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class239.method1668(arg8, arg1, arg2, arg9);
                                                } else {
                                                    class343.method2359(var13, var14, var11.field5169 + var13, var11.field5174 + var14);
                                                    for (int var54 = 0; var54 < var52; var54++) {
                                                        for (int var55 = 0; var55 < var53; var55++) {
                                                            if (var11.field5166 != 0) {
                                                                var48.method10(var50 / 2 + var50 * var55 + var14, (byte) 101, 4096, var49 / 2 + var49 * var54 + var13, var11.field5166);
                                                            } else if (var15 == 0) {
                                                                var48.method11(var49 * var54 + var13, var50 * var55 + var14);
                                                            } else {
                                                                var48.method13(var13 + (var49 * var54), var50 * var55 + var14, 256 - (var15 & 0xFF));
                                                            }
                                                        }
                                                    }
                                                    class343.method2368(arg8, arg1, arg2, arg9);
                                                }
                                            } else {
                                                int var51 = var11.field5169 * 4096 / var49;
                                                if (var11.field5166 != 0) {
                                                    var48.method10(var11.field5174 / 2 + var14, (byte) 101, var51, var11.field5169 / 2 + var13, var11.field5166);
                                                } else if (var15 != 0) {
                                                    var48.method20(var13, var14, var11.field5169, var11.field5174, 256 - (var15 & 0xFF));
                                                } else if (var11.field5169 == var49 && var11.field5174 == var50) {
                                                    var48.method11(var13, var14);
                                                } else {
                                                    var48.method19(var13, var14, var11.field5169, var11.field5174);
                                                }
                                            }
                                        } else if (class72.field907) {
                                            class107.method693(var11, 6);
                                        }
                                    }
                                } else if (var11.field5107 == 6) {
                                    boolean var92 = class174.method1211(-5, var11);
                                    int var93;
                                    if (var92) {
                                        var93 = var11.field5173;
                                    } else {
                                        var93 = var11.field5026;
                                    }
                                    int var94 = 0;
                                    class362 var95 = null;
                                    if (var11.field5195 != -1) {
                                        class309 var100 = class190.method1302(var11.field5195, (byte) 79);
                                        if (var100 != null) {
                                            class309 var101 = var100.method2189((byte) -124, var11.field5066);
                                            class111 var102 = var93 == -1 ? null : class289.method2067((byte) -105, var93);
                                            if (var11.field5043 && class11.field113.field813 != null) {
                                                var95 = var101.method2188(var11.field5122, class11.field113.field813, (byte) -84, var11.field5021, var11.field5064, var102, 1);
                                            } else {
                                                var95 = var101.method2188(var11.field5122, (class246) null, (byte) -91, var11.field5021, var11.field5064, var102, 1);
                                            }
                                            if (var95 == null) {
                                                class107.method693(var11, 6);
                                            } else {
                                                var94 = -var95.method417() / 2;
                                            }
                                        }
                                    } else if (var11.field5161 == 5) {
                                        if (var11.field5020 == -1) {
                                            var95 = class2.field15.method1739(true, -1, 0, -1, false, 0, (class111) null, -1, (class111) null, -1, (class69[]) null, -12722);
                                        } else {
                                            int var97 = var11.field5020 & 0x7FF;
                                            if (class50.field573 == var97) {
                                                var97 = 2047;
                                            }
                                            class67 var98 = class105.field1443[var97];
                                            class111 var99 = var93 == -1 ? null : class289.method2067((byte) -124, var93);
                                            if (var98 != null && (int) class294.method2093((byte) 100, var98.field848) << 11 == (var11.field5020 & 0xFFFFF800)) {
                                                var95 = var98.field813.method1739(true, 0, 0, -1, false, 0, (class111) null, var11.field5064, var99, -1, (class69[]) null, -12722);
                                            }
                                        }
                                    } else if (var93 == -1) {
                                        var95 = var11.method2244((byte) -89, var92, class11.field113.field813, -1, (class111) null, -1, 0);
                                        if (var95 == null && class72.field907) {
                                            class107.method693(var11, 6);
                                        }
                                    } else {
                                        class111 var96 = class289.method2067((byte) -81, var93);
                                        var95 = var11.method2244((byte) -48, var92, class11.field113.field813, var11.field5122, var96, var11.field5064, var11.field5021);
                                        if (var95 == null && class72.field907) {
                                            class107.method693(var11, 6);
                                        }
                                    }
                                    if (var95 != null) {
                                        int var103;
                                        if (var11.field5067 <= 0) {
                                            var103 = 256;
                                        } else {
                                            var103 = (var11.field5174 << 8) / var11.field5067;
                                        }
                                        int var104;
                                        if (var11.field5168 > 0) {
                                            var104 = (var11.field5169 << 8) / var11.field5168;
                                        } else {
                                            var104 = 256;
                                        }
                                        int var105 = (var11.field5185 * var104 >> 8) + var11.field5169 / 2 + var13;
                                        int var106 = (var11.field5065 * var103 >> 8) + var11.field5174 / 2 + var14;
                                        if (class272.field4317) {
                                            if (var11.field5099) {
                                                class272.method1948(var105, var106, var11.field5121, var11.field5180, var104, var103);
                                            } else {
                                                class272.method1957(var105, var106, var104, var103);
                                                class272.method1936((float) var11.field5111, (float) var11.field5180 * 1.5F);
                                            }
                                            class272.method1938();
                                            class272.method1934(true);
                                            class272.method1940(false);
                                            class77.method494(class164.field2522, 19974);
                                            if (class19.field232) {
                                                class239.method1656();
                                                class272.method1927();
                                                class239.method1668(arg8, arg1, arg2, arg9);
                                                class19.field232 = false;
                                            }
                                            if (var11.field5130) {
                                                class272.method1922();
                                            }
                                            int var107 = class104.field1426[var11.field5032] * var11.field5121 >> 16;
                                            int var108 = class104.field1435[var11.field5032] * var11.field5121 >> 16;
                                            if (var11.field5172) {
                                                var95.method853(0, var11.field5072, var11.field5091, var11.field5032, var11.field5023, var94 + var107 + var11.field5081, var11.field5081 + var108, -1L);
                                            } else {
                                                var95.method853(0, var11.field5072, 0, var11.field5032, 0, var107, var108, -1L);
                                            }
                                            if (var11.field5130) {
                                                class272.method1942();
                                            }
                                        } else {
                                            class104.method670(var105, var106);
                                            int var109 = class104.field1435[var11.field5032] * var11.field5121 >> 16;
                                            int var110 = class104.field1426[var11.field5032] * var11.field5121 >> 16;
                                            if (!var11.field5172) {
                                                var95.method853(0, var11.field5072, 0, var11.field5032, 0, var110, var109, -1L);
                                            } else if (var11.field5099) {
                                                ((class133) var95).method911(0, var11.field5072, var11.field5091, var11.field5032, var11.field5023, var110 - (-var11.field5081 - var94), var109 - -var11.field5081, var11.field5121);
                                            } else {
                                                var95.method853(0, var11.field5072, var11.field5091, var11.field5032, var11.field5023, var11.field5081 + var110 + var94, var11.field5081 + var109, -1L);
                                            }
                                            class104.method674();
                                        }
                                    }
                                } else {
                                    if (var11.field5107 == 7) {
                                        class240 var65 = var11.method2251(16839, class55.field647);
                                        if (var65 == null) {
                                            if (class72.field907) {
                                                class107.method693(var11, 6);
                                            }
                                            continue;
                                        }
                                        int var66 = 0;
                                        for (int var67 = 0; var67 < var11.field5131; var67++) {
                                            for (int var68 = 0; var68 < var11.field5095; var68++) {
                                                if (var11.field5143[var66] > 0) {
                                                    class309 var69 = class190.method1302(var11.field5143[var66] - 1, (byte) 108);
                                                    String var70;
                                                    if (var69.field4814 != 1 && var11.field5153[var66] == 1) {
                                                        var70 = "<col=ff9040>" + var69.field4868 + "</col>";
                                                    } else {
                                                        var70 = "<col=ff9040>" + var69.field4868 + "</col> x" + class306.method2159(var11.field5153[var66], 4);
                                                    }
                                                    int var71 = (var11.field5061 + 12) * var67 + var14;
                                                    int var72 = (var11.field5071 + 115) * var68 + var13;
                                                    if (var11.field5019 == 0) {
                                                        var65.method1685(var70, var72, var71, var11.field5060, var11.field5054 ? 0 : -1);
                                                    } else if (var11.field5019 == 1) {
                                                        var65.method1691(var70, var72 + 57, var71, var11.field5060, var11.field5054 ? 0 : -1);
                                                    } else {
                                                        var65.method1672(var70, var72 + 114, var71, var11.field5060, var11.field5054 ? 0 : -1);
                                                    }
                                                }
                                                var66++;
                                            }
                                        }
                                    }
                                    if (var11.field5107 == 8 && class182.field2744 == var11 && class351.field5607 == class16.field172) {
                                        int var73 = 0;
                                        int var74 = 0;
                                        String var75 = var11.field5098;
                                        class240 var76 = class41.field446;
                                        String var77 = class17.method128(var11, (byte) 63, var75);
                                        while (var77.length() > 0) {
                                            int var78 = var77.indexOf("<br>");
                                            String var79;
                                            if (var78 == -1) {
                                                var79 = var77;
                                                var77 = "";
                                            } else {
                                                var79 = var77.substring(0, var78);
                                                var77 = var77.substring(var78 + 4);
                                            }
                                            int var80 = var76.method1692(var79);
                                            var73 += var76.field3675 + 1;
                                            if (var74 < var80) {
                                                var74 = var80;
                                            }
                                        }
                                        var73 += 7;
                                        var74 += 6;
                                        int var81 = var11.field5174 + var14 + 5;
                                        if (arg9 < var73 + var81) {
                                            var81 = arg9 - var73;
                                        }
                                        int var82 = var13 + var11.field5169 - var74 - 5;
                                        if (var82 < (var13 + 5)) {
                                            var82 = var13 + 5;
                                        }
                                        if ((var74 + var82) > arg2) {
                                            var82 = arg2 - var74;
                                        }
                                        if (class272.field4317) {
                                            class239.method1659(var82, var81, var74, var73, 16777120);
                                            class239.method1665(var82, var81, var74, var73, 0);
                                        } else {
                                            class343.method2352(var82, var81, var74, var73, 16777120);
                                            class343.method2369(var82, var81, var74, var73, 0);
                                        }
                                        int var83 = var76.field3675 + var81 + 2;
                                        String var84 = var11.field5098;
                                        String var85 = class17.method128(var11, (byte) 63, var84);
                                        while (var85.length() > 0) {
                                            int var86 = var85.indexOf("<br>");
                                            String var87;
                                            if (var86 == -1) {
                                                var87 = var85;
                                                var85 = "";
                                            } else {
                                                var87 = var85.substring(0, var86);
                                                var85 = var85.substring(var86 + 4);
                                            }
                                            var76.method1685(var87, var82 + 3, var83, 0, -1);
                                            var83 += var76.field3675 + 1;
                                        }
                                    }
                                    if (var11.field5107 == 9) {
                                        int var88;
                                        int var89;
                                        int var90;
                                        int var91;
                                        if (var11.field5189) {
                                            var91 = var13;
                                            var89 = var14;
                                            var90 = var11.field5169 + var13;
                                            var88 = var11.field5174 + var14;
                                        } else {
                                            var88 = var14;
                                            var89 = var14 + var11.field5174;
                                            var90 = var13 + var11.field5169;
                                            var91 = var13;
                                        }
                                        if (var11.field5109 == 1) {
                                            if (class272.field4317) {
                                                class239.method1653(var91, var88, var90, var89, var11.field5060);
                                            } else {
                                                class343.method2360(var91, var88, var90, var89, var11.field5060);
                                            }
                                        } else if (class272.field4317) {
                                            class239.method1662(var91, var88, var90, var89, var11.field5060, var11.field5109);
                                        } else {
                                            class343.method2378(var91, var88, var90, var89, var11.field5060, var11.field5109);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "(B)V", line = 1866)
    public static final void method235(byte arg0) {
        field397++;
        if (class11.field113 != null && class11.field113.field3767 + 64 - class11.field113.method412((byte) 96) * 64 >> 7 == class309.field4795 && (class11.field113.field3763 + 64 - class11.field113.method412((byte) 108) * 64 >> 7) == class5.field57) {
            class309.field4795 = 0;
            class237.field3650 = false;
        }
        for (int var1 = 0; var1 < 104; var1++) {
            for (int var2 = 0; var2 < 104; var2++) {
                class312.field4888[var1][var2] = 0;
            }
        }
        for (int var3 = 0; var3 < class302.field4704; var3++) {
            class67 var4 = class105.field1443[class80.field1067[var3]];
            if (var4 != null) {
                var4.field3797 = false;
            }
        }
        if (arg0 != 10) {
            field406 = (int[]) null;
        }
        for (int var5 = 0; var5 < class296.field4667; var5++) {
            class231 var6 = class251.field3974[class225.field3392[var5]];
            if (var6 != null) {
                var6.field3797 = false;
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V", line = 1924)
    public class35() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "(I)V", line = 1937)
    public static void method236(int arg0) {
        field406 = null;
        field393 = null;
        if (arg0 != -26211) {
            field393 = (String) null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(Z)V", line = 1963)
    public static final void method237(boolean arg0) {
        field410++;
        if (arg0) {
            field393 = (String) null;
        }
        if (class50.field572 == 0) {
            return;
        }
        try {
            if (++class52.field603 > 1500) {
                if (class147.field2352 != null) {
                    class147.field2352.method1527(124);
                    class147.field2352 = null;
                }
                if (class70.field877 >= 1) {
                    class50.field572 = 0;
                    class30.field353 = -5;
                    return;
                }
                class70.field877++;
                class50.field572 = 1;
                if (class245.field3861 == class218.field3281) {
                    class218.field3281 = class108.field1489;
                } else {
                    class218.field3281 = class245.field3861;
                }
                class52.field603 = 0;
            }
            if (class50.field572 == 1) {
                class24.field282 = class156.field2451.method166((byte) -107, class185.field2792, class218.field3281);
                class50.field572 = 2;
            }
            if (class50.field572 == 2) {
                if (class24.field282.field2419 == 2) {
                    throw new IOException();
                }
                if (class24.field282.field2419 != 1) {
                    return;
                }
                class147.field2352 = new class220((Socket) class24.field282.field2421, class156.field2451);
                class24.field282 = null;
                class147.field2352.method1532(class328.field5282.field2295, 0, 69, class328.field5282.field2260);
                if (class192.field2881 != null) {
                    class192.field2881.method1412(false);
                }
                if (class273.field4330 != null) {
                    class273.field4330.method1412(false);
                }
                int var1 = class147.field2352.method1528(-29741);
                if (class192.field2881 != null) {
                    class192.field2881.method1412(false);
                }
                if (class273.field4330 != null) {
                    class273.field4330.method1412(false);
                }
                if (var1 != 101) {
                    class50.field572 = 0;
                    class30.field353 = var1;
                    class147.field2352.method1527(87);
                    class147.field2352 = null;
                    return;
                }
                class50.field572 = 3;
            }
            if (class50.field572 == 3) {
                if (class147.field2352.method1531((byte) 122) >= 2) {
                    int var2 = class147.field2352.method1528(-29741) << 8 | class147.field2352.method1528(-29741);
                    class132.method907(var2, 5539);
                    if (class196.field2976 != -1) {
                        class50.field572 = 0;
                        class147.field2352.method1527(82);
                        class147.field2352 = null;
                        class85.method541(false);
                        return;
                    }
                    class30.field353 = 6;
                    class50.field572 = 0;
                    class147.field2352.method1527(101);
                    class147.field2352 = null;
                    return;
                }
                return;
            }
        } catch (IOException var4) {
            if (class147.field2352 != null) {
                class147.field2352.method1527(77);
                class147.field2352 = null;
            }
            if (class70.field877 < 1) {
                class50.field572 = 1;
                class70.field877++;
                if (class245.field3861 == class218.field3281) {
                    class218.field3281 = class108.field1489;
                } else {
                    class218.field3281 = class245.field3861;
                }
                class52.field603 = 0;
            } else {
                class50.field572 = 0;
                class30.field353 = -4;
            }
        }
    }
}
