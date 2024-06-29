import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class214 extends class306 {

    @OriginalMember(owner = "client!gl", name = "U", descriptor = "I")
    private int field3254 = 1;

    @OriginalMember(owner = "client!gl", name = "S", descriptor = "I")
    private int field3252 = 1;

    @OriginalMember(owner = "client!gl", name = "L", descriptor = "Z")
    public static boolean field3245 = false;

    @OriginalMember(owner = "client!gl", name = "I", descriptor = "Ljava/lang/String;")
    public static String field3243 = "yellow:";

    @OriginalMember(owner = "client!gl", name = "J", descriptor = "Z")
    public static boolean field3244 = false;

    @OriginalMember(owner = "client!gl", name = "M", descriptor = "I")
    public static int field3246 = 0;

    @OriginalMember(owner = "client!gl", name = "T", descriptor = "I")
    public static int field3253 = 0;

    @OriginalMember(owner = "client!gl", name = "W", descriptor = "[Lui;")
    public static class293[] field3256 = new class293[14];

    @OriginalMember(owner = "client!gl", name = "G", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!gl", name = "H", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!gl", name = "O", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!gl", name = "P", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!gl", name = "Q", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!gl", name = "R", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!gl", name = "V", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!gl", name = "X", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!gl", name = "Y", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!gl", name = "N", descriptor = "[[[I")
    public static int[][][] field3247;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(IIII)V", line = 4)
    public static final void method1490(int arg0, int arg1, int arg2, int arg3) {
        field3242++;
        class279 var4 = class147.method1085(arg2, arg3 ^ 0xFFFFB404, arg3);
        var4.method1989(arg3 - 9);
        var4.field4388 = arg0;
        var4.field4394 = arg1;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZIIIIII)I", line = 16)
    public static final int method1491(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3250++;
        if (arg0) {
            return 11;
        }
        if ((arg4 & 0x1) == 1) {
            int var7 = arg6;
            arg6 = arg1;
            arg1 = var7;
        }
        int var8 = arg5 & 0x3;
        if (var8 == 0) {
            return arg2;
        } else if (var8 == 1) {
            return arg3;
        } else if (var8 == 2) {
            return 8 - arg6 - arg2;
        } else {
            return 1 - (arg1 - (7 - arg3));
        }
    }

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "(I)I", line = 48)
    public static final int method1492(int arg0) {
        if (arg0 != 14) {
            method1493((Throwable) null, (String) null);
        }
        field3258++;
        return 14;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Led;", line = 64)
    public static final class326 method1493(Throwable arg0, String arg1) {
        field3257++;
        class326 var2;
        if ((arg0 instanceof class326)) {
            var2 = (class326) arg0;
            var2.field5221 = var2.field5221 + ' ' + arg1;
        } else {
            var2 = new class326(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)[I", line = 89)
    public final int[] method47(int arg0, int arg1) {
        field3251++;
        if (arg1 != -1546337535) {
            method1495(32, -73, 56, -101, 78, (class294) null, 12, -77L, true);
        }
        int[] var3 = this.field4757.method903(arg0, -94);
        if (this.field4757.field1898) {
            int var4 = this.field3254 + this.field3254 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field3252 + this.field3252 + 1;
            int[][] var7 = new int[var6][];
            int var8 = 65536 / var6;
            for (int var9 = arg0 - this.field3252; var9 <= this.field3252 + arg0; var9++) {
                int[] var10 = this.method2161(var9 & class56.field663, (byte) 124, 0);
                int var11 = 0;
                for (int var12 = -this.field3254; var12 <= this.field3254; var12++) {
                    var11 += var10[class311.field4878 & var12];
                }
                int[] var13 = new int[class31.field367];
                int var14 = 0;
                while (class31.field367 > var14) {
                    var13[var14] = var5 * var11 >> 16;
                    int var15 = var11 - var10[var14 - this.field3254 & class311.field4878];
                    var14++;
                    var11 = var10[class311.field4878 & this.field3254 + var14] + var15;
                }
                var7[this.field3252 + var9 - arg0] = var13;
            }
            for (int var16 = 0; var16 < class31.field367; var16++) {
                int var17 = 0;
                for (int var18 = 0; var18 < var6; var18++) {
                    var17 += var7[var18][var16];
                }
                var3[var16] = var8 * var17 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "(B)V", line = 176)
    public static final void method1494(byte arg0) {
        class122.method789((byte) -85);
        class302.method2128(2);
        class234.method1619((byte) 82);
        field3255++;
        class314.method2217(-13945);
        class127.method869(91);
        class256.method1805((byte) -32);
        class255.method1801((byte) -99);
        class236.method1636((byte) -30);
        class260.method1834(0);
        class232.method1604((byte) 117);
        class132.method909((byte) -96);
        class57.method340(1);
        class349.method2425(1024);
        class301.method2121((byte) 30);
        class245.method1731(false);
        class199.method1386(-1);
        class197.method1376((byte) 16);
        class75.method470(-1);
        class180.method1247(1);
        class346.method2404(2);
        class194.method1344((byte) 92);
        if (arg0 == 0) {
            class110.field1516.method378(arg0 ^ 0x0);
            class290.field4561.method378(0);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIIILio;IJZ)Z", line = 209)
    public static final boolean method1495(int arg0, int arg1, int arg2, int arg3, int arg4, class294 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class237.method1646(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIIIIIIIIIBI)V", line = 253)
    public static final void method1496(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, byte arg11, int arg12) {
        class60 var13 = new class60();
        var13.field715 = arg6;
        var13.field700 = arg1;
        var13.field705 = arg4;
        var13.field709 = arg2;
        var13.field701 = arg12;
        var13.field717 = arg3;
        var13.field706 = arg8;
        var13.field716 = arg10;
        var13.field704 = arg0;
        field3241++;
        var13.field707 = arg5;
        var13.field702 = arg7;
        var13.field697 = arg9;
        if (arg11 >= -1) {
            method1494((byte) 95);
        }
        class315.field4945.method1814(var13, true);
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V", line = 279)
    public class214() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILlf;I)V", line = 301)
    public final void method45(int arg0, class143 arg1, int arg2) {
        if (arg0 != -15334) {
            return;
        }
        if (arg2 == 0) {
            this.field3254 = arg1.method1043(true);
        } else if (arg2 == 1) {
            this.field3252 = arg1.method1043(true);
        } else if (arg2 == 2) {
            this.field4759 = arg1.method1043(true) == 1;
        }
        field3249++;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IB)[[I", line = 342)
    public final int[][] method681(int arg0, byte arg1) {
        field3248++;
        if (arg1 != -119) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field4752.method1866(arg0, arg1 ^ 0xFFFFFF89);
        if (this.field4752.field4179) {
            int var4 = this.field3252 + this.field3252 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field3254 + this.field3254 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = arg0 - this.field3252; var9 <= (this.field3252 + arg0); var9++) {
                int[][] var10 = this.method2160(0, (byte) 121, class56.field663 & var9);
                int[][] var11 = new int[3][class31.field367];
                int var12 = 0;
                int var13 = 0;
                int var14 = 0;
                int[] var15 = var10[0];
                int[] var16 = var10[1];
                int[] var17 = var10[2];
                for (int var18 = -this.field3254; var18 <= this.field3254; var18++) {
                    int var19 = class311.field4878 & var18;
                    var14 += var16[var19];
                    var12 += var17[var19];
                    var13 += var15[var19];
                }
                int[] var20 = var11[0];
                int[] var21 = var11[1];
                int[] var22 = var11[2];
                int var23 = 0;
                while (var23 < class31.field367) {
                    var20[var23] = var7 * var13 >> 16;
                    var21[var23] = var7 * var14 >> 16;
                    var22[var23] = var7 * var12 >> 16;
                    int var24 = class311.field4878 & var23 - this.field3254;
                    var23++;
                    int var25 = var14 - var16[var24];
                    int var26 = var13 - var15[var24];
                    int var27 = var12 - var17[var24];
                    int var28 = var23 + this.field3254 & class311.field4878;
                    var13 = var15[var28] + var26;
                    var14 = var16[var28] + var25;
                    var12 = var17[var28] + var27;
                }
                var8[this.field3252 + var9 - arg0] = var11;
            }
            int[] var29 = var3[0];
            int[] var30 = var3[2];
            int[] var31 = var3[1];
            for (int var32 = 0; var32 < class31.field367; var32++) {
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = 0; var36 < var4; var36++) {
                    int[][] var37 = var8[var36];
                    var34 += var37[1][var32];
                    var35 += var37[2][var32];
                    var33 += var37[0][var32];
                }
                var29[var32] = var5 * var33 >> 16;
                var31[var32] = var5 * var34 >> 16;
                var30[var32] = var5 * var35 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "(I)V", line = 475)
    public static void method1497(int arg0) {
        field3247 = (int[][][]) null;
        field3243 = null;
        if (arg0 >= -79) {
            method1490(58, -112, 3, -15);
        }
        field3256 = null;
    }
}
