import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class647 extends class577 {

    @OriginalMember(owner = "client!of", name = "F", descriptor = "Lqm;")
    private class154 field9053;

    @OriginalMember(owner = "client!of", name = "E", descriptor = "Lmf;")
    private class439 field9052;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "Lpj;")
    private class156 field9034;

    @OriginalMember(owner = "client!of", name = "x", descriptor = "I")
    private int field9045;

    @OriginalMember(owner = "client!of", name = "v", descriptor = "I")
    private int field9043;

    @OriginalMember(owner = "client!of", name = "C", descriptor = "I")
    private int field9050;

    @OriginalMember(owner = "client!of", name = "w", descriptor = "I")
    private int field9044;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "[[F")
    private float[][] field9037;

    @OriginalMember(owner = "client!of", name = "L", descriptor = "[[F")
    private float[][] field9059;

    @OriginalMember(owner = "client!of", name = "s", descriptor = "[[F")
    private float[][] field9040;

    @OriginalMember(owner = "client!of", name = "z", descriptor = "I")
    private int field9047;

    @OriginalMember(owner = "client!of", name = "u", descriptor = "Ldk;")
    private class535 field9042;

    @OriginalMember(owner = "client!of", name = "t", descriptor = "Lhl;")
    private class553 field9041;

    @OriginalMember(owner = "client!of", name = "D", descriptor = "Ljo;")
    private class353 field9051;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "Ljaclib/memory/Stream;")
    private Stream field9039;

    @OriginalMember(owner = "client!of", name = "A", descriptor = "Ljaclib/memory/Stream;")
    private Stream field9048;

    @OriginalMember(owner = "client!of", name = "y", descriptor = "I")
    private int field9046;

    @OriginalMember(owner = "client!of", name = "B", descriptor = "Lbu;")
    public static class21 field9049 = new class21(128, 1);

    @OriginalMember(owner = "client!of", name = "I", descriptor = "Lwv;")
    public static class37 field9056 = new class37(7, 8);

    @OriginalMember(owner = "client!of", name = "K", descriptor = "[I")
    public static int[] field9058 = new int[4];

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    public static int field9033;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "I")
    public static int field9035;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "I")
    public static int field9036;

    @OriginalMember(owner = "client!of", name = "q", descriptor = "I")
    public static int field9038;

    @OriginalMember(owner = "client!of", name = "G", descriptor = "I")
    public static int field9054;

    @OriginalMember(owner = "client!of", name = "J", descriptor = "J")
    public static long field9057;

    @OriginalMember(owner = "client!of", name = "H", descriptor = "Z")
    public static boolean field9055;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "([[ZIIIB)V")
    public final void method3708(boolean[][] arg0, int arg1, int arg2, int arg3, byte arg4) {
        field9035++;
        if (this.field9042 == null) {
            return;
        }
        if (arg4 > -60) {
            method3712(true, null, 15, (byte) -38, -91, -41, true);
        }
        if (this.field9045 > arg2 + arg3 || arg3 - arg2 > this.field9043 || this.field9050 > arg1 + arg2 || arg1 - arg2 > this.field9044) {
            return;
        }
        for (int var6 = this.field9050; var6 <= this.field9044; var6++) {
            for (int var7 = this.field9045; var7 <= this.field9043; var7++) {
                int var8 = var7 - arg3;
                int var9 = var6 - arg1;
                if (var8 > (-arg2) && arg2 > var8 && var9 > -arg2 && arg2 > var9 && arg0[arg2 + var8][arg2 + var9]) {
                    this.field9034.method1153((byte) ((int) (this.field9053.method1057(false) * 255.0F)), (byte) 79);
                    this.field9034.method1178(0, (byte) 100, this.field9041);
                    this.field9034.method1111((byte) 81, this.field9034.field2504);
                    this.field9034.method1091(this.field9047 / 3, this.field9042, 0, 0, this.field9046, class207.field3204, (byte) -29);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
    public static void method3709(int arg0) {
        if (arg0 <= 115) {
            field9056 = null;
        }
        field9056 = null;
        field9049 = null;
        field9058 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ZI)I")
    public static final int method3710(boolean arg0, int arg1) {
        if (arg1 != 0) {
            method3711(-28);
        }
        field9036++;
        int var2 = class763.field10520;
        if (var2 == 0) {
            return arg0 ? 0 : class631.field8874;
        } else if (var2 == 1) {
            return class631.field8874;
        } else if (var2 == 2) {
            return 0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
    public static final void method3711(int arg0) {
        if (arg0 > -26) {
            method3711(-44);
        }
        field9054++;
        int var1 = class287.field4226 * 512 + 256;
        int var2 = class345.field4813 * 512 + 256;
        int var3 = class702.method3970(var1, class368.field5113, -20103, var2) - class778.field10686;
        if (class309.field4420 < 100) {
            if (class614.field8619 < var1) {
                class614.field8619 += class791.field10878 + ((var1 - class614.field8619) * class309.field4420 / 1000);
                if (var1 < class614.field8619) {
                    class614.field8619 = var1;
                }
            }
            if (class614.field8619 > var1) {
                class614.field8619 -= (class614.field8619 - var1) * class309.field4420 / 1000 + class791.field10878;
                if (var1 > class614.field8619) {
                    class614.field8619 = var1;
                }
            }
            if (class546.field7862 < var3) {
                class546.field7862 += (var3 - class546.field7862) * class309.field4420 / 1000 + class791.field10878;
                if (var3 < class546.field7862) {
                    class546.field7862 = var3;
                }
            }
            if (var3 < class546.field7862) {
                class546.field7862 -= (class546.field7862 - var3) * class309.field4420 / 1000 + class791.field10878;
                if (var3 > class546.field7862) {
                    class546.field7862 = var3;
                }
            }
            if (var2 > class472.field6622) {
                class472.field6622 += (var2 - class472.field6622) * class309.field4420 / 1000 + class791.field10878;
                if (var2 < class472.field6622) {
                    class472.field6622 = var2;
                }
            }
            if (var2 < class472.field6622) {
                class472.field6622 -= (class472.field6622 - var2) * class309.field4420 / 1000 + class791.field10878;
                if (class472.field6622 < var2) {
                    class472.field6622 = var2;
                }
            }
        } else {
            class472.field6622 = class345.field4813 * 512 + 256;
            class614.field8619 = class287.field4226 * 512 + 256;
            class546.field7862 = class702.method3970(class614.field8619, class368.field5113, -20103, class472.field6622) - class778.field10686;
        }
        int var4 = class256.field3763 * 512 + 256;
        int var5 = class263.field3856 * 512 + 256;
        int var6 = class702.method3970(var4, class368.field5113, -20103, var5) - class353.field4969;
        int var7 = var4 - class614.field8619;
        int var8 = var6 - class546.field7862;
        int var9 = var5 - class472.field6622;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        int var12 = (int) (-2607.5945876176133D * Math.atan2((double) var7, (double) var9)) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (class589.field8310 < var11) {
            class589.field8310 += (var11 - class589.field8310 >> 3) * class488.field6904 / 1000 + class591.field8329 << 3;
            if (class589.field8310 > var11) {
                class589.field8310 = var11;
            }
        }
        if (class589.field8310 > var11) {
            class589.field8310 -= (class589.field8310 - var11 >> 3) * class488.field6904 / 1000 + class591.field8329 << 3;
            if (var11 > class589.field8310) {
                class589.field8310 = var11;
            }
        }
        int var13 = var12 - class544.field7813;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class544.field7813 += class488.field6904 * var14 / 1000 + class591.field8329 << 3;
            class544.field7813 &= 0x3FFF;
        }
        if (var14 < 0) {
            class544.field7813 -= -var14 * class488.field6904 / 1000 + class591.field8329 << 3;
            class544.field7813 &= 0x3FFF;
        }
        int var15 = var12 - class544.field7813;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        class565.field8018 = 0;
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class544.field7813 = var12;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z[[[BIBIIZ)V")
    public static final void method3712(boolean arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        int var7 = arg0 ? 1 : 0;
        class536.field7716 = 0;
        class215.field3321 = 0;
        class744.field10316++;
        if ((arg5 & 0x2) == 0) {
            for (class421 var8 = class745.field10328[var7]; var8 != null; var8 = var8.field5747) {
                if (!class613.method3560(var8, arg0, arg1, arg2, arg3)) {
                    class565.method3331(var8);
                    if (var8.field5744 != -1) {
                        class216.field3344[class536.field7716++] = var8;
                    }
                }
            }
        }
        if ((arg5 & 0x1) == 0) {
            for (class421 var9 = class338.field4733[var7]; var9 != null; var9 = var9.field5747) {
                if (!class613.method3560(var9, arg0, arg1, arg2, arg3)) {
                    class565.method3331(var9);
                    if (var9.field5744 != -1) {
                        class586.field8280[class215.field3321++] = var9;
                    }
                }
            }
            for (class421 var10 = class695.field9711[var7]; var10 != null; var10 = var10.field5747) {
                if (!class613.method3560(var10, arg0, arg1, arg2, arg3)) {
                    if (var10.method906(-34)) {
                        class565.method3331(var10);
                        if (var10.field5744 != -1) {
                            class586.field8280[class215.field3321++] = var10;
                        }
                    } else {
                        class565.method3331(var10);
                        if (var10.field5744 != -1) {
                            class216.field3344[class536.field7716++] = var10;
                        }
                    }
                }
            }
            if (!arg0) {
                for (int var11 = 0; var11 < class309.field4423; var11++) {
                    if (!class613.method3560(class184.field2830[var11], arg0, arg1, arg2, arg3)) {
                        class565.method3331(class184.field2830[var11]);
                        if (class184.field2830[var11].field5744 != -1) {
                            if (class184.field2830[var11].method906(111)) {
                                class586.field8280[class215.field3321++] = class184.field2830[var11];
                            } else {
                                class216.field3344[class536.field7716++] = class184.field2830[var11];
                            }
                        }
                    }
                }
            }
        }
        if (class536.field7716 > 0) {
            class321.method2070(class216.field3344, 0, class536.field7716 - 1);
            for (int var12 = 0; var12 < class536.field7716; var12++) {
                class630.method3611(class216.field3344[var12], true, arg6);
            }
        }
        if (class434.field5879) {
            class228.field3494.method461(0, null);
        }
        if ((arg5 & 0x2) == 0) {
            for (int var13 = class126.field1953; var13 < class562.field7990; var13++) {
                if (var13 < arg2 || arg1 == null) {
                    int var23 = class735.field10157.length;
                    if (class735.field10157.length + class314.field4473 > class81.field902) {
                        var23 -= class735.field10157.length + class314.field4473 - class81.field902;
                    }
                    int var24 = class735.field10157[0].length;
                    if (class735.field10157[0].length + class446.field6087 > class48.field615) {
                        var24 -= class735.field10157[0].length + class446.field6087 - class48.field615;
                    }
                    boolean[][] var25 = class281.field4084;
                    if (class596.field8361) {
                        if (class712.field9883) {
                            var25 = class631.field8875[var13];
                        }
                        for (int var26 = class616.field8624; var26 < var23; var26++) {
                            int var27 = class314.field4473 + var26 - class616.field8624;
                            for (int var28 = class48.field608; var28 < var24; var28++) {
                                if (class735.field10157[var26][var28] && !class295.method1924(class446.field6087 + var28 - class48.field608, 1, var27, var13)) {
                                    var25[var26][var28] = true;
                                } else {
                                    var25[var26][var28] = false;
                                }
                            }
                        }
                    }
                    if (class712.field9883) {
                        if (arg4 >= 0) {
                            class208.field3219[var13].method1915(0, 0, 0, null, false, arg4, arg5);
                        } else {
                            class208.field3219[var13].method1909(0, 0, 0, null, false, arg5);
                        }
                        for (int var29 = 0; var29 < class652.field9112; var29++) {
                            class747.field10352[var29].method350((byte) 43, new class109(var13 + 1));
                        }
                    } else if (arg4 >= 0) {
                        class208.field3219[var13].method1915(class276.field4007, class296.field4301, class259.field3820, class281.field4084, true, arg4, arg5);
                    } else {
                        class208.field3219[var13].method1909(class276.field4007, class296.field4301, class259.field3820, class281.field4084, true, arg5);
                    }
                } else {
                    int var14 = class735.field10157.length;
                    if (class735.field10157.length + class314.field4473 > class81.field902) {
                        var14 -= class735.field10157.length + class314.field4473 - class81.field902;
                    }
                    int var15 = class735.field10157[0].length;
                    if (class735.field10157[0].length + class446.field6087 > class48.field615) {
                        var15 -= class735.field10157[0].length + class446.field6087 - class48.field615;
                    }
                    boolean[][] var16 = class281.field4084;
                    if (class596.field8361) {
                        if (class712.field9883) {
                            var16 = class631.field8875[var13];
                        }
                        for (int var17 = class616.field8624; var17 < var14; var17++) {
                            int var18 = class314.field4473 + var17 - class616.field8624;
                            for (int var19 = class48.field608; var19 < var15; var19++) {
                                var16[var17][var19] = false;
                                if (class735.field10157[var17][var19]) {
                                    int var20 = class446.field6087 + var19 - class48.field608;
                                    for (int var21 = var13; var21 >= 0; var21--) {
                                        if (class767.field10562[var21][var18][var20] != null && class767.field10562[var21][var18][var20].field585 == var13) {
                                            if ((var21 < arg2 || arg1[var21][var18][var20] != arg3) && !class295.method1924(var20, 1, var18, var13)) {
                                                var16[var17][var19] = true;
                                                break;
                                            }
                                            var16[var17][var19] = false;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class712.field9883) {
                        if (arg4 >= 0) {
                            class208.field3219[var13].method1915(0, 0, 0, null, false, arg4, arg5);
                        } else {
                            class208.field3219[var13].method1909(0, 0, 0, null, false, arg5);
                        }
                        for (int var22 = 0; var22 < class652.field9112; var22++) {
                            class747.field10352[var22].method350((byte) 43, new class109(var13 + 1));
                        }
                    } else if (arg4 >= 0) {
                        class208.field3219[var13].method1915(class276.field4007, class296.field4301, class259.field3820, class281.field4084, false, arg4, arg5);
                    } else {
                        class208.field3219[var13].method1909(class276.field4007, class296.field4301, class259.field3820, class281.field4084, false, arg5);
                    }
                }
            }
        }
        if (class215.field3321 > 0) {
            class562.method3320(class586.field8280, 0, class215.field3321 - 1);
            for (int var30 = 0; var30 < class215.field3321; var30++) {
                class630.method3611(class586.field8280[var30], true, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIBIIII)V")
    private final void method3713(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field9038++;
        long var8 = -1L;
        int var10 = (arg4 << this.field9052.field4285) + arg5;
        int var11 = (arg0 << this.field9052.field4285) + arg6;
        int var12 = this.field9052.method1918(var10, (byte) 126, var11);
        if ((arg5 & 0x7F) == 0 || (arg6 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | 0xFFFFL << 16 & (long) var11 << 16;
            class577 var13 = this.field9051.method2242(var8, -1);
            if (var13 != null) {
                this.method3714((byte) -124, ((class75) var13).field853);
                return;
            }
        }
        short var14 = (short) (this.field9046++);
        if (var8 != -1L) {
            this.field9051.method2241(arg2 ^ 0xFFFFFFAC, var8, new class75(var14));
        }
        float var15;
        float var16;
        float var17;
        if (arg5 == 0 && arg6 == 0) {
            var15 = this.field9037[arg3][arg1];
            var16 = this.field9040[arg3][arg1];
            var17 = this.field9059[arg3][arg1];
        } else if (this.field9052.field4284 == arg5 && arg6 == 0) {
            var15 = this.field9037[arg3 + 1][arg1];
            var16 = this.field9040[arg3 + 1][arg1];
            var17 = this.field9059[arg3 + 1][arg1];
        } else if (this.field9052.field4284 == arg5 && this.field9052.field4284 == arg6) {
            var15 = this.field9037[arg3 + 1][arg1 + 1];
            var17 = this.field9059[arg3 + 1][arg1 + 1];
            var16 = this.field9040[arg3 + 1][arg1 + 1];
        } else if (arg5 == 0 && this.field9052.field4284 == arg6) {
            var17 = this.field9059[arg3][arg1 + 1];
            var16 = this.field9040[arg3][arg1 + 1];
            var15 = this.field9037[arg3][arg1 + 1];
        } else {
            float var18 = (float) arg5 / (float) this.field9052.field4284;
            float var19 = (float) arg6 / (float) this.field9052.field4284;
            float var20 = this.field9037[arg3][arg1];
            float var21 = this.field9040[arg3][arg1];
            float var22 = this.field9059[arg3][arg1];
            float var23 = this.field9037[arg3 + 1][arg1];
            float var24 = this.field9040[arg3 + 1][arg1];
            float var25 = (this.field9037[arg3][arg1 + 1] - var20) * var18 + var20;
            float var26 = (this.field9037[arg3 + 1][arg1 + 1] - var23) * var18 + var23;
            float var27 = (this.field9040[arg3][arg1 + 1] - var21) * var18 + var21;
            float var28 = (this.field9040[arg3 + 1][arg1 + 1] - var24) * var18 + var24;
            float var29 = this.field9059[arg3 + 1][arg1];
            float var30 = (this.field9059[arg3][arg1 + 1] - var22) * var18 + var22;
            float var31 = (this.field9059[arg3 + 1][arg1 + 1] - var29) * var18 + var29;
            var16 = (var28 - var27) * var19 + var27;
            var15 = (var26 - var25) * var19 + var25;
            var17 = (var31 - var30) * var19 + var30;
        }
        float var32 = (float) (this.field9053.method1059(-6131) - var10);
        float var33 = (float) (this.field9053.method1055((byte) -71) - var12);
        float var34 = (float) (this.field9053.method1058(65) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        if (arg2 != -120) {
            method3709(94);
        }
        float var37 = var33 * var36;
        float var38 = var32 * var36;
        float var39 = var34 * var36;
        float var40 = var35 / (float) this.field9053.method1051((byte) -102);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var17 * var39 + var15 * var38 + var16 * var37;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field9053.method1052(false);
        int var45 = (int) ((float) ((var44 & 0xFF188A) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (Stream.method3953()) {
            this.field9039.method3952((float) var10);
            this.field9039.method3952((float) var12);
            this.field9039.method3952((float) var11);
        } else {
            this.field9039.method3949((float) var10);
            this.field9039.method3949((float) var12);
            this.field9039.method3949((float) var11);
        }
        if (this.field9034.field2443 == 0) {
            this.field9039.method3955(var47);
            this.field9039.method3955(var46);
            this.field9039.method3955(var45);
        } else {
            this.field9039.method3955(var45);
            this.field9039.method3955(var46);
            this.field9039.method3955(var47);
        }
        this.field9039.method3955(255);
        this.method3714((byte) -122, var14);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BS)V")
    private final void method3714(byte arg0, short arg1) {
        if (Stream.method3953()) {
            this.field9048.method3947(arg1);
        } else {
            this.field9048.method3954(arg1);
        }
        field9033++;
        int var3 = -18 / ((arg0 + 45) / 60);
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lpj;Lmf;Lqm;[I)V")
    public class647(class156 arg0, class439 arg1, class154 arg2, int[] arg3) {
        this.field9053 = arg2;
        this.field9052 = arg1;
        this.field9034 = arg0;
        int var5 = this.field9053.method1051((byte) -107) - (arg1.field4284 >> 1);
        this.field9045 = this.field9053.method1059(-6131) - var5 >> arg1.field4285;
        this.field9043 = this.field9053.method1059(-6131) + var5 >> arg1.field4285;
        this.field9050 = this.field9053.method1058(102) - var5 >> arg1.field4285;
        this.field9044 = this.field9053.method1058(100) + var5 >> arg1.field4285;
        int var6 = this.field9043 + 1 - this.field9045;
        int var7 = this.field9044 + 1 - this.field9050;
        this.field9037 = new float[var6 + 1][var7 + 1];
        this.field9059 = new float[var6 + 1][var7 + 1];
        this.field9040 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var27 = this.field9050 + var8;
            if (var27 > 0 && this.field9052.field4290 - 1 > var27) {
                for (int var28 = 0; var28 <= var6; var28++) {
                    int var29 = var28 + this.field9045;
                    if (var29 > 0 && var29 < this.field9052.field4289 - 1) {
                        int var30 = arg1.method1904(var27, (byte) 101, var29 + 1) - arg1.method1904(var27, (byte) 16, var29 - 1);
                        int var31 = arg1.method1904(var27 + 1, (byte) -124, var29) - arg1.method1904(var27 - 1, (byte) -128, var29);
                        float var32 = (float) (1.0D / Math.sqrt((double) (var30 * var30 + var31 * var31 + 65536)));
                        this.field9037[var28][var8] = (float) var30 * var32;
                        this.field9040[var28][var8] = var32 * -256.0F;
                        this.field9059[var28][var8] = (float) var31 * var32;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field9050; var10 <= this.field9044; var10++) {
            if (var10 >= 0 && arg1.field4290 > var10) {
                for (int var23 = this.field9045; var23 <= this.field9043; var23++) {
                    if (var23 >= 0 && arg1.field4289 > var23) {
                        int var24 = arg3[var9];
                        int[] var25 = arg1.field5937[var23][var10];
                        if (var25 != null && var24 != 0) {
                            if (var24 == 1) {
                                int var26 = 0;
                                while (var25.length > var26) {
                                    if (var25[var26++] != -1 && var25[var26++] != -1 && var25[var26++] != -1) {
                                        this.field9047 += 3;
                                    }
                                }
                            } else {
                                this.field9047 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field9043 - this.field9045;
            }
        }
        if (this.field9047 <= 0) {
            this.field9042 = null;
            this.field9041 = null;
        } else {
            this.field9051 = new class353(class433.method2595(this.field9047, (byte) -82));
            this.field9042 = this.field9034.method1184(2, false);
            this.field9042.method604(this.field9047, 121);
            NativeHeapBuffer var11 = this.field9034.method1154(false, this.field9047 * 16, 117);
            this.field9039 = new Stream(var11);
            while (true) {
                Buffer var12;
                do {
                    var12 = this.field9042.method605((byte) -71, true);
                } while (var12 == null);
                this.field9048 = new Stream(var12);
                int var13 = 0;
                int var14 = 0;
                for (int var15 = this.field9050; var15 <= this.field9044; var15++) {
                    if (var15 >= 0 && var15 < arg1.field4290) {
                        int var16 = 0;
                        for (int var17 = this.field9045; var17 <= this.field9043; var17++) {
                            if (var17 >= 0 && arg1.field4289 > var17) {
                                int var18 = arg3[var13];
                                int[] var19 = arg1.field5937[var17][var15];
                                if (var19 != null && var18 != 0) {
                                    if (var18 == 1) {
                                        int[] var20 = arg1.field5948[var17][var15];
                                        int[] var21 = arg1.field5949[var17][var15];
                                        int var22 = 0;
                                        label122: while (true) {
                                            while (true) {
                                                if (var19.length <= var22) {
                                                    break label122;
                                                }
                                                if (var19[var22] == -1 || var19[var22 + 1] == -1 || var19[var22 + 2] == -1) {
                                                    var22 += 3;
                                                } else {
                                                    this.method3713(var15, var14, (byte) -120, var16, var17, var20[var22], var21[var22]);
                                                    var22++;
                                                    this.method3713(var15, var14, (byte) -120, var16, var17, var20[var22], var21[var22]);
                                                    var22++;
                                                    this.method3713(var15, var14, (byte) -120, var16, var17, var20[var22], var21[var22]);
                                                    var22++;
                                                }
                                            }
                                        }
                                    } else if (var18 == 3) {
                                        this.method3713(var15, var14, (byte) -120, var16, var17, 0, 0);
                                        this.method3713(var15, var14, (byte) -120, var16, var17, arg1.field4284, 0);
                                        this.method3713(var15, var14, (byte) -120, var16, var17, 0, arg1.field4284);
                                    } else if (var18 == 2) {
                                        this.method3713(var15, var14, (byte) -120, var16, var17, arg1.field4284, 0);
                                        this.method3713(var15, var14, (byte) -120, var16, var17, arg1.field4284, arg1.field4284);
                                        this.method3713(var15, var14, (byte) -120, var16, var17, 0, 0);
                                    } else if (var18 == 5) {
                                        this.method3713(var15, var14, (byte) -120, var16, var17, arg1.field4284, arg1.field4284);
                                        this.method3713(var15, var14, (byte) -120, var16, var17, 0, arg1.field4284);
                                        this.method3713(var15, var14, (byte) -120, var16, var17, arg1.field4284, 0);
                                    } else if (var18 == 4) {
                                        this.method3713(var15, var14, (byte) -120, var16, var17, 0, arg1.field4284);
                                        this.method3713(var15, var14, (byte) -120, var16, var17, 0, 0);
                                        this.method3713(var15, var14, (byte) -120, var16, var17, arg1.field4284, arg1.field4284);
                                    }
                                }
                            }
                            var16++;
                            var13++;
                        }
                    } else {
                        var13 += this.field9043 - this.field9045;
                    }
                    var14++;
                }
                this.field9048.method3945();
                if (this.field9042.method601(-92)) {
                    this.field9039.method3945();
                    this.field9041 = this.field9034.method1074((byte) 46, false);
                    this.field9041.method680(16, 116, var11, this.field9046 * 16);
                    break;
                }
                this.field9039.method3948(0);
                this.field9051.method2240(-111);
            }
        }
        this.field9051 = null;
        this.field9039 = null;
        this.field9048 = null;
        this.field9037 = this.field9040 = this.field9059 = null;
    }
}
