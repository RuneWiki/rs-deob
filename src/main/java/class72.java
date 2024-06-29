import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class72 {

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "[I")
    private int[] field1053;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "[I")
    private int[] field1062;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "F")
    public static float field1060;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    private int field1045;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    private int field1049;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    private int field1050;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    private int field1056;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "Lph;")
    public static class361 field1061;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZLnk;III[[FBI[[FB[[II[[FII)V", line = 9)
    public static final void method593(int arg0, boolean arg1, class224 arg2, int arg3, int arg4, int arg5, float[][] arg6, byte arg7, int arg8, float[][] arg9, byte arg10, int[][] arg11, int arg12, float[][] arg13, int arg14, int arg15) {
        field1051++;
        int var16 = (arg4 << 8) + 255;
        int var17 = (arg5 << 8) + 255;
        int var18 = (arg12 << 8) + 255;
        int var19 = (arg0 << 8) + 255;
        int[] var20 = class149.field2175[arg10];
        int var21 = 110 % ((arg8 + 86) / 37);
        int[] var22 = null;
        int[] var23 = new int[var20.length >> 1];
        for (int var24 = 0; var24 < var23.length; var24++) {
            var23[var24] = class259.method1902(arg7, false, arg9, arg6, 0.0F, arg2, arg13, var19, arg11, arg15, var20[var24 + var24], (int[][]) null, var20[var24 + var24 + 1], var17, var16, var18, (byte) 37, arg14);
        }
        if (arg1) {
            if (arg10 == 1) {
                var22 = new int[6];
                int var26 = class259.method1902(arg7, true, arg9, arg6, 0.0F, arg2, arg13, var19, arg11, arg15, 64, (int[][]) null, 128, var17, var16, var18, (byte) 50, arg14);
                int var27 = class259.method1902(arg7, true, arg9, arg6, 0.0F, arg2, arg13, var19, arg11, arg15, 128, (int[][]) null, 64, var17, var16, var18, (byte) 74, arg14);
                var22[1] = var26;
                var22[3] = var26;
                var22[0] = var27;
                var22[2] = var23[2];
                var22[5] = var23[2];
                var22[4] = var23[0];
            } else if (arg10 == 2) {
                var22 = new int[6];
                int var28 = class259.method1902(arg7, true, arg9, arg6, 0.0F, arg2, arg13, var19, arg11, arg15, 128, (int[][]) null, 128, var17, var16, var18, (byte) 119, arg14);
                int var29 = class259.method1902(arg7, true, arg9, arg6, 0.0F, arg2, arg13, var19, arg11, arg15, 64, (int[][]) null, 0, var17, var16, var18, (byte) 54, arg14);
                var22[3] = var28;
                var22[2] = var28;
                var22[0] = var23[0];
                var22[5] = var23[0];
                var22[1] = var29;
                var22[4] = var23[1];
            } else if (arg10 == 3) {
                var22 = new int[6];
                int var43 = class259.method1902(arg7, true, arg9, arg6, 0.0F, arg2, arg13, var19, arg11, arg15, 0, (int[][]) null, 128, var17, var16, var18, (byte) 88, arg14);
                int var44 = class259.method1902(arg7, true, arg9, arg6, 0.0F, arg2, arg13, var19, arg11, arg15, 64, (int[][]) null, 0, var17, var16, var18, (byte) 119, arg14);
                var22[4] = var44;
                var22[0] = var23[2];
                var22[2] = var43;
                var22[5] = var23[2];
                var22[1] = var23[1];
                var22[3] = var43;
            } else if (arg10 == 4) {
                var22 = new int[3];
                int var42 = class259.method1902(arg7, true, arg9, arg6, 0.0F, arg2, arg13, var19, arg11, arg15, 0, (int[][]) null, 128, var17, var16, var18, (byte) 68, arg14);
                var22[1] = var42;
                var22[0] = var23[3];
                var22[2] = var23[0];
            } else if (arg10 == 5) {
                int var30 = class259.method1902(arg7, true, arg9, arg6, 0.0F, arg2, arg13, var19, arg11, arg15, 128, (int[][]) null, 128, var17, var16, var18, (byte) 115, arg14);
                var22 = new int[] { var23[2], var30, var23[3] };
            } else if (arg10 == 6) {
                var22 = new int[6];
                int var31 = class259.method1902(arg7, true, arg9, arg6, 0.0F, arg2, arg13, var19, arg11, arg15, 128, (int[][]) null, 0, var17, var16, var18, (byte) 83, arg14);
                int var32 = class259.method1902(arg7, true, arg9, arg6, 0.0F, arg2, arg13, var19, arg11, arg15, 128, (int[][]) null, 128, var17, var16, var18, (byte) 65, arg14);
                var22[0] = var23[3];
                var22[4] = var23[0];
                var22[2] = var32;
                var22[1] = var31;
                var22[3] = var32;
                var22[5] = var23[3];
            } else if (arg10 == 7) {
                var22 = new int[6];
                int var40 = class259.method1902(arg7, true, arg9, arg6, 0.0F, arg2, arg13, var19, arg11, arg15, 0, (int[][]) null, 128, var17, var16, var18, (byte) 95, arg14);
                int var41 = class259.method1902(arg7, true, arg9, arg6, 0.0F, arg2, arg13, var19, arg11, arg15, 128, (int[][]) null, 0, var17, var16, var18, (byte) 112, arg14);
                var22[2] = var40;
                var22[0] = var23[1];
                var22[4] = var23[2];
                var22[3] = var40;
                var22[1] = var41;
                var22[5] = var23[1];
            } else if (arg10 == 8) {
                var22 = new int[3];
                int var33 = class259.method1902(arg7, true, arg9, arg6, 0.0F, arg2, arg13, var19, arg11, arg15, 0, (int[][]) null, 0, var17, var16, var18, (byte) 51, arg14);
                var22[0] = var23[3];
                var22[2] = var23[4];
                var22[1] = var33;
            } else if (arg10 == 9) {
                var22 = new int[15];
                int var37 = class259.method1902(arg7, true, arg9, arg6, 0.0F, arg2, arg13, var19, arg11, arg15, 128, (int[][]) null, 64, var17, var16, var18, (byte) 111, arg14);
                int var38 = class259.method1902(arg7, true, arg9, arg6, 0.0F, arg2, arg13, var19, arg11, arg15, 96, (int[][]) null, 32, var17, var16, var18, (byte) 67, arg14);
                int var39 = class259.method1902(arg7, true, arg9, arg6, 0.0F, arg2, arg13, var19, arg11, arg15, 64, (int[][]) null, 0, var17, var16, var18, (byte) 127, arg14);
                var22[14] = var39;
                var22[9] = var38;
                var22[12] = var38;
                var22[1] = var37;
                var22[0] = var38;
                var22[3] = var38;
                var22[11] = var23[1];
                var22[2] = var23[4];
                var22[10] = var23[2];
                var22[5] = var23[3];
                var22[7] = var23[3];
                var22[6] = var38;
                var22[13] = var23[1];
                var22[8] = var23[2];
                var22[4] = var23[4];
            } else if (arg10 == 10) {
                var22 = new int[9];
                int var34 = class259.method1902(arg7, true, arg9, arg6, 0.0F, arg2, arg13, var19, arg11, arg15, 0, (int[][]) null, 128, var17, var16, var18, (byte) 44, arg14);
                var22[0] = var23[2];
                var22[1] = var34;
                var22[4] = var34;
                var22[2] = var23[3];
                var22[6] = var23[4];
                var22[7] = var34;
                var22[5] = var23[4];
                var22[3] = var23[3];
                var22[8] = var23[0];
            } else if (arg10 == 11) {
                int var35 = class259.method1902(arg7, true, arg9, arg6, 0.0F, arg2, arg13, var19, arg11, arg15, 0, (int[][]) null, 64, var17, var16, var18, (byte) 39, arg14);
                var22 = new int[12];
                int var36 = class259.method1902(arg7, true, arg9, arg6, 0.0F, arg2, arg13, var19, arg11, arg15, 128, (int[][]) null, 64, var17, var16, var18, (byte) 59, arg14);
                var22[1] = var35;
                var22[7] = var36;
                var22[11] = var36;
                var22[0] = var23[3];
                var22[3] = var23[3];
                var22[5] = var35;
                var22[2] = var23[0];
                var22[4] = var23[2];
                var22[6] = var23[2];
                var22[10] = var23[1];
                var22[9] = var23[2];
                var22[8] = var35;
            }
        }
        arg2.method1641(arg3, arg14, arg15, var23, var22, false);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V", line = 285)
    public static void method594(byte arg0) {
        if (arg0 > -54) {
            field1055 = -93;
        }
        field1061 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V", line = 298)
    private final void method595(int arg0) {
        if (arg0 != 2016591945) {
            this.method596(42);
        }
        field1054++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var11 = var9 ^ var8 << 11;
            int var12 = var7 + var8;
            int var13 = var6 + var11;
            int var14 = var12 ^ var7 >>> 2;
            int var15 = var5 + var14;
            int var16 = var7 + var13;
            int var17 = var16 ^ var13 << 8;
            int var18 = var4 + var17;
            int var19 = var13 + var15;
            var6 = var19 ^ var15 >>> 16;
            int var20 = var15 + var18;
            int var21 = var3 + var6;
            var5 = var20 ^ var18 << 10;
            int var22 = var2 + var5;
            int var23 = var18 + var21;
            var4 = var23 ^ var21 >>> 4;
            int var24 = var21 + var22;
            int var25 = var4 + var11;
            var3 = var24 ^ var22 << 8;
            var8 = var3 + var14;
            int var26 = var22 + var25;
            var2 = var26 ^ var25 >>> 9;
            var9 = var8 + var25;
            var7 = var2 + var17;
        }
        for (int var27 = 0; var27 < 256; var27 += 8) {
            int var28 = this.field1062[var27 + 6] + var3;
            int var29 = this.field1062[var27 + 1] + var8;
            int var30 = this.field1062[var27 + 4] + var5;
            int var31 = this.field1062[var27 + 5] + var4;
            int var32 = this.field1062[var27 + 2] + var7;
            int var33 = this.field1062[var27] + var9;
            int var34 = this.field1062[var27 + 7] + var2;
            int var35 = this.field1062[var27 + 3] + var6;
            int var36 = var33 ^ var29 << 11;
            int var37 = var29 + var32;
            int var38 = var37 ^ var32 >>> 2;
            int var39 = var35 + var36;
            int var40 = var32 + var39;
            int var41 = var40 ^ var39 << 8;
            int var42 = var31 + var41;
            int var43 = var30 + var38;
            int var44 = var39 + var43;
            var6 = var44 ^ var43 >>> 16;
            int var45 = var6 + var28;
            int var46 = var42 + var43;
            var5 = var46 ^ var42 << 10;
            int var47 = var42 + var45;
            var4 = var47 ^ var45 >>> 4;
            int var48 = var4 + var36;
            int var49 = var5 + var34;
            int var50 = var45 + var49;
            var3 = var50 ^ var49 << 8;
            var8 = var3 + var38;
            int var51 = var48 + var49;
            var2 = var51 ^ var48 >>> 9;
            var7 = var2 + var41;
            var9 = var8 + var48;
            this.field1053[var27] = var9;
            this.field1053[var27 + 1] = var8;
            this.field1053[var27 + 2] = var7;
            this.field1053[var27 + 3] = var6;
            this.field1053[var27 + 4] = var5;
            this.field1053[var27 + 5] = var4;
            this.field1053[var27 + 6] = var3;
            this.field1053[var27 + 7] = var2;
        }
        for (int var52 = 0; var52 < 256; var52 += 8) {
            int var53 = this.field1053[var52 + 4] + var5;
            int var54 = this.field1053[var52] + var9;
            int var55 = this.field1053[var52 + 6] + var3;
            int var56 = this.field1053[var52 + 3] + var6;
            int var57 = this.field1053[var52 + 7] + var2;
            int var58 = this.field1053[var52 + 2] + var7;
            int var59 = this.field1053[var52 + 5] + var4;
            int var60 = this.field1053[var52 + 1] + var8;
            int var61 = var54 ^ var60 << 11;
            int var62 = var56 + var61;
            int var63 = var58 + var60;
            int var64 = var63 ^ var58 >>> 2;
            int var65 = var58 + var62;
            int var66 = var53 + var64;
            int var67 = var65 ^ var62 << 8;
            int var68 = var59 + var67;
            int var69 = var62 + var66;
            var6 = var69 ^ var66 >>> 16;
            int var70 = var6 + var55;
            int var71 = var66 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var5 + var57;
            int var73 = var68 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var4 + var61;
            int var75 = var70 + var72;
            var3 = var75 ^ var72 << 8;
            var8 = var3 + var64;
            int var76 = var72 + var74;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var67;
            this.field1053[var52] = var9;
            this.field1053[var52 + 1] = var8;
            this.field1053[var52 + 2] = var7;
            this.field1053[var52 + 3] = var6;
            this.field1053[var52 + 4] = var5;
            this.field1053[var52 + 5] = var4;
            this.field1053[var52 + 6] = var3;
            this.field1053[var52 + 7] = var2;
        }
        this.method597(-11618);
        this.field1056 = 256;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)I", line = 449)
    public final int method596(int arg0) {
        field1046++;
        if (arg0 != 768) {
            this.field1056 = -122;
        }
        if (this.field1056-- == 0) {
            this.method597(-11618);
            this.field1056 = 255;
        }
        return this.field1062[this.field1056];
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)V", line = 469)
    private final void method597(int arg0) {
        field1048++;
        this.field1045 += ++this.field1049;
        if (arg0 != -11618) {
            return;
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field1053[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field1050 ^= this.field1050 << 13;
                } else {
                    this.field1050 ^= this.field1050 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field1050 ^= this.field1050 << 2;
            } else {
                this.field1050 ^= this.field1050 >>> 16;
            }
            this.field1050 += this.field1053[var2 + 128 & 0xFF];
            int var4;
            this.field1053[var2] = var4 = this.field1050 + this.field1053[class287.method2076(1020, var3) >> 2] + this.field1045;
            this.field1062[var2] = this.field1045 = this.field1053[class287.method2076(255, var4 >> 8 >> 2)] + var3;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IILhc;IIII)Lhc;", line = 513)
    public static final class151 method598(int arg0, int arg1, class151 arg2, int arg3, int arg4, int arg5, int arg6) {
        field1052++;
        long var7 = (long) arg6;
        class151 var9 = (class151) class265.field4049.method461((byte) 120, var7);
        if (var9 == null) {
            class46 var10 = class46.method377(class307.field4597, arg6, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method393(64, 768, -50, -10, -50);
            class265.field4049.method460(var9, -26089, var7);
        }
        int var11 = arg2.method1067();
        int var12 = arg2.method1074();
        int var13 = arg2.method1080();
        int var14 = 40 / ((arg4 - 24) / 32);
        int var15 = arg2.method1088();
        class151 var16 = var9.method1082(true, true, true);
        if (arg1 != 0) {
            var16.method1068(arg1);
        }
        if (class141.field2031) {
            class218 var17 = (class218) var16;
            if (class71.method584(class321.field4835, arg0 + var11, -106, arg5 + var13) != arg3 || arg3 != class71.method584(class321.field4835, arg0 + var12, 67, arg5 + var15)) {
                for (int var18 = 0; var18 < var17.field3228; var18++) {
                    var17.field3246[var18] += class71.method584(class321.field4835, var17.field3244[var18] + arg0, -79, var17.field3214[var18] + arg5) - arg3;
                }
                var17.field3208.field4282 = false;
                var17.field3222.field2640 = false;
            }
        } else {
            class317 var19 = (class317) var16;
            if (arg3 != class71.method584(class321.field4835, arg0 + var11, -74, arg5 + var13) || class71.method584(class321.field4835, arg0 + var12, -110, arg5 + var15) != arg3) {
                for (int var20 = 0; var20 < var19.field4733; var20++) {
                    var19.field4718[var20] += class71.method584(class321.field4835, var19.field4725[var20] + arg0, -72, var19.field4709[var20] + arg5) - arg3;
                }
                var19.field4726 = false;
            }
        }
        return var16;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILph;Lph;)I", line = 592)
    public static final int method599(int arg0, class361 arg1, class361 arg2) {
        field1058++;
        int var3 = arg0;
        if (arg1.method2514((byte) 108, class304.field4561)) {
            var3 = arg0 + 1;
        }
        if (arg1.method2514((byte) 87, class203.field2993)) {
            var3++;
        }
        if (arg1.method2514((byte) 12, class347.field5366)) {
            var3++;
        }
        if (arg2.method2514((byte) 18, class304.field4561)) {
            var3++;
        }
        if (arg2.method2514((byte) 8, class203.field2993)) {
            var3++;
        }
        if (arg2.method2514((byte) 119, class347.field5366)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IILqf;IIIII)V", line = 625)
    public static final void method600(int arg0, int arg1, class359 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1063++;
        if (arg0 != -104285653) {
            field1060 = -1.6081871F;
        }
        int var8 = arg7 * arg7 + (arg5 * arg5);
        if (arg3 < var8) {
            return;
        }
        int var9 = Math.min(arg2.field5506 / 2, arg2.field5560 / 2);
        if (var9 * var9 >= var8) {
            class257.method1894(arg2, arg4, arg0 ^ 0x637452B, arg5, arg1, class318.field4793[arg6], arg7);
            return;
        }
        var9 -= 10;
        int var10;
        if (class86.field1208 == 4) {
            var10 = (int) class36.field535 & 0x7FF;
        } else {
            var10 = (int) class36.field535 + class298.field4460 & 0x7FF;
        }
        int var11 = class345.field5343[var10];
        int var12 = class345.field5339[var10];
        if (class86.field1208 != 4) {
            var12 = var12 * 256 / (class281.field4271 + 256);
            var11 = var11 * 256 / (class281.field4271 + 256);
        }
        int var13 = arg5 * var12 + arg7 * var11 >> 16;
        int var14 = arg5 * var11 - (arg7 * var12) >> 16;
        double var15 = Math.atan2((double) var13, (double) var14);
        int var17 = (int) ((double) var9 * Math.sin(var15));
        int var18 = (int) (Math.cos(var15) * (double) var9);
        if (class141.field2031) {
            ((class325) class177.field2552[arg6]).method2249(240, 240, (arg2.field5506 / 2 + arg1 + var17) * 16, (arg2.field5560 / 2 + arg4 - var18) * 16, (int) (var15 * 10430.378D), 4096);
        } else {
            ((class118) class177.field2552[arg6]).method648(arg2.field5506 / 2 + var17 + arg1 - 10, arg2.field5560 / 2 + arg4 + -var18 + -10, 20, 20, 15, 15, var15, 256);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)V", line = 681)
    public static final void method601(int arg0, int arg1) {
        class95 var2 = class227.method1699(1, -1855723168, arg0);
        field1057++;
        var2.method743(0);
        int var3 = 109 / ((83 - arg1) / 42);
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V", line = 694)
    private class72() {
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "([I)V", line = 696)
    public class72(int[] arg0) {
        this.field1053 = new int[256];
        this.field1062 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1062[var2] = arg0[var2];
        }
        this.method595(2016591945);
    }
}
