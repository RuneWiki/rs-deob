import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class85 {

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    private int field2129;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "[[I")
    private int[][] field2130;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    private int field2125;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "[I")
    public static int[] field2124 = new int[2000];

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "[Lic;")
    public static class59[] field2131 = new class59[100];

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "[I")
    public static int[] field2126 = new int[32];

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public static int field2127 = 0;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "Lud;")
    public static class143 field2135 = new class143(5000);

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "Lic;")
    public static class59 field2138 = class59.method433(0, "gelb:");

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "I")
    public static int field2140 = 0;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "Lpb;")
    public static class106 field2139 = new class106();

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "Lic;")
    public static class59 field2142 = class59.method433(0, "Bitte versuchen Sie es in ");

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "Lic;")
    public static class59 field2141 = class59.method433(0, "Okay");

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "[I")
    public static int[] field2143 = new int[128];

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "[Lwf;")
    public static class159[] field2137;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIB)I")
    private static final int method698(int arg0, int arg1, byte arg2) {
        if (arg2 >= -50) {
            field2141 = null;
        }
        if (arg0 > arg1) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        while (arg0 != 0) {
            int var4 = arg1 % arg0;
            arg1 = arg0;
            arg0 = var4;
        }
        field2128++;
        return arg1;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B[B)[B")
    public final byte[] method699(byte arg0, byte[] arg1) {
        if (this.field2130 != null) {
            int var3 = 0;
            int var4 = 0;
            int var5 = (int) ((long) arg1.length * (long) this.field2125 / (long) this.field2129) + 14;
            int[] var6 = new int[var5];
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field2130[var4];
                for (int var12 = 0; var12 < 14; var12++) {
                    var6[var3 + var12] += var11[var12] * var10;
                }
                int var13 = this.field2125 + var4;
                int var14 = var13 / this.field2129;
                var3 += var14;
                var4 = var13 - this.field2129 * var14;
            }
            arg1 = new byte[var5];
            for (int var8 = 0; var8 < var5; var8++) {
                int var9 = var6[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 > 127) {
                    arg1[var8] = 127;
                } else {
                    arg1[var8] = (byte) var9;
                }
            }
        }
        field2136++;
        if (arg0 <= 49) {
            field2141 = null;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(II)V")
    public class85(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = method698(arg1, arg0, (byte) -96);
            int var4 = arg0 / var3;
            this.field2129 = var4;
            this.field2130 = new int[var4][14];
            int var5 = arg1 / var3;
            this.field2125 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field2130[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                double var12 = (double) var5 / (double) var4;
                if (var11 > 14) {
                    var11 = 14;
                }
                while (var11 > var10) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILub;Lub;)V")
    public static final void method700(int arg0, class141 arg1, class141 arg2) {
        field2133++;
        if (class136.field3021) {
            class82.method678((byte) 97, arg2, arg1);
        } else if (arg0 == 271) {
            if (class64.field1635 == 0 || class64.field1635 == 5) {
                byte var3 = 20;
                arg1.method1146(class120.field2767, 382, 245 - var3, 16777215, -1);
                int var4 = 253 - var3;
                class129.method997(230, var4, 304, 34, 9179409);
                class129.method997(231, var4 + 1, 302, 32, 0);
                class129.method988(232, var4 + 2, class77.field1890 * 3, 30, 9179409);
                class129.method988(class77.field1890 * 3 + 232, var4 + 2, 300 - class77.field1890 * 3, 30, 0);
                arg1.method1146(class90.field2288, 382, 276 - var3, 16777215, -1);
            }
            if (class64.field1635 == 20) {
                class64.field1634.method111(382 - class64.field1634.field440 / 2, -(class64.field1634.field442 / 2) + 271);
                short var5 = 211;
                arg1.method1146(class90.field2296, 382, var5, 16776960, 0);
                int var23 = var5 + 15;
                arg1.method1146(class90.field2286, 382, var23, 16776960, 0);
                int var24 = var23 + 15;
                arg1.method1146(class90.field2297, 382, var24, 16776960, 0);
                int var25 = var24 + 15;
                int var26 = var25 + 10;
                arg1.method1134(class46.method358(new class59[] { class18.field348, class156.method1150(class90.field2295) }, (byte) -75), 272, var26, 16777215, 0);
                int var27 = var26 + 15;
                arg1.method1134(class46.method358(new class59[] { class22.field528, class90.field2290.method444(-58) }, (byte) -75), 274, var27, 16777215, 0);
                int var28 = var27 + 15;
            }
            if (class64.field1635 == 10) {
                class64.field1634.method111(202, 171);
                if (class16.field305 == 0) {
                    short var6 = 291;
                    short var7 = 251;
                    short var8 = 302;
                    arg1.method1146(class21.field476, 382, var7, 16776960, 0);
                    int var29 = var7 + 30;
                    class82.field2050.method111(var8 - 73, var6 - 20);
                    arg1.method1155(class36.field958, var8 - 73, var6 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                    short var9 = 462;
                    class82.field2050.method111(var9 - 73, var6 - 20);
                    arg1.method1155(class46.field1187, var9 - 73, var6 + -20, 144, 40, 16777215, 0, 1, 1, 0);
                } else if (class16.field305 == 2) {
                    short var13 = 211;
                    arg1.method1146(class90.field2296, 382, var13, 16776960, 0);
                    int var34 = var13 + 15;
                    short var14 = 302;
                    arg1.method1146(class90.field2286, 382, var34, 16776960, 0);
                    int var35 = var34 + 15;
                    arg1.method1146(class90.field2297, 382, var35, 16776960, 0);
                    int var36 = var35 + 15;
                    int var37 = var36 + 10;
                    boolean var15;
                    if (class134.field2978 == 0 && class23.field561 % 40 < 20 && class127.field2890) {
                        var15 = true;
                    } else {
                        var15 = false;
                    }
                    arg1.method1134(class46.method358(new class59[] { class18.field348, class156.method1150(class90.field2295), var15 ? class147.field3183 : class90.field2294 }, (byte) -75), 272, var37, 16777215, 0);
                    short var16 = 321;
                    var34 = var37 + 15;
                    boolean var17;
                    if (class134.field2978 == 1 && class23.field561 % 40 < 20 && class127.field2890) {
                        var17 = true;
                    } else {
                        var17 = false;
                    }
                    arg1.method1134(class46.method358(new class59[] { class22.field528, class90.field2290.method444(-58), var17 ? class147.field3183 : class90.field2294 }, (byte) -75), 274, var34, 16777215, 0);
                    var34 += 15;
                    class82.field2050.method111(var14 - 73, var16 - 20);
                    arg1.method1146(class143.field3140, var14, var16 + 5, 16777215, 0);
                    short var18 = 462;
                    class82.field2050.method111(var18 - 73, var16 - 20);
                    arg1.method1146(class65.field1639, var18, var16 + 5, 16777215, 0);
                } else if (class16.field305 == 3) {
                    short var10 = 236;
                    arg1.method1146(class115.field2712, 382, 211, 16776960, 0);
                    short var11 = 382;
                    arg1.method1146(class100.field2467, 382, var10, 16777215, 0);
                    int var30 = var10 + 15;
                    arg1.method1146(class5.field116, 382, var30, 16777215, 0);
                    int var31 = var30 + 15;
                    short var12 = 321;
                    arg1.method1146(class73.field1801, 382, var31, 16777215, 0);
                    int var32 = var31 + 15;
                    arg1.method1146(class139.field3107, 382, var32, 16777215, 0);
                    int var33 = var32 + 15;
                    class82.field2050.method111(var11 - 73, var12 + -20);
                    arg1.method1146(class65.field1639, var11, var12 + 5, 16777215, 0);
                }
            }
            if (class59.field1415 != 1) {
                if (class64.field1631 > 0) {
                    class31.method247(class64.field1631, -1);
                    class64.field1631 = 0;
                }
                class3.method13(106);
            }
            class53.field1319[class90.field2289 ? 1 : 0].method111(725, 463);
            if (class64.field1635 > 5 && class52.field1300 != 2 && class136.field3013 == 0) {
                if (class49.field1238 == null) {
                    class49.field1238 = class95.method785(112, class3.field67, class100.field2476, class90.field2294);
                } else {
                    byte var19 = 5;
                    byte var20 = 100;
                    short var21 = 463;
                    byte var22 = 35;
                    class49.field1238.method111(var19, var21);
                    arg1.method1146(class46.method358(new class59[] { class81.field2014, class120.field2777, class46.method361(class9.field179, 90) }, (byte) -75), var20 / 2 + var19, var21 + -2 - -(var22 / 2), 16777215, 0);
                    if (class54.field1337 == null) {
                        arg2.method1146(class26.field660, var20 / 2 + var19, var22 / 2 + var21 + 12, 16777215, 0);
                    } else {
                        arg2.method1146(class59.field1450, var19 + var20 / 2, var22 / 2 + var21 + 12, 16777215, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)I")
    public final int method701(int arg0, int arg1) {
        if (this.field2130 != null) {
            arg0 = (int) ((long) this.field2125 * (long) arg0 / (long) this.field2129);
        }
        field2134++;
        if (arg1 != 5641) {
            this.field2129 = 83;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)I")
    public final int method702(int arg0, int arg1) {
        int var3 = -46 / ((-arg1 - 13) / 35);
        if (this.field2130 != null) {
            arg0 = (int) ((long) this.field2125 * (long) arg0 / (long) this.field2129) + 6;
        }
        field2132++;
        return arg0;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V")
    public static void method703(byte arg0) {
        field2135 = null;
        int var1 = 15 / ((arg0 - 40) / 35);
        field2124 = null;
        field2141 = null;
        field2137 = null;
        field2126 = null;
        field2139 = null;
        field2138 = null;
        field2142 = null;
        field2143 = null;
        field2131 = null;
    }
}
