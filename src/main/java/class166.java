import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class166 {

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    private int field2992;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "[[I")
    private int[][] field2991;

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "I")
    private int field2999;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "Lud;")
    public static class279 field2996 = class130.method1024(")4l=", 255);

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "Lse;")
    public static class12 field2993 = new class12();

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "Lud;")
    private static class279 field3003 = class130.method1024("Loading textures )2 ", 255);

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "Lud;")
    public static class279 field3004 = field3003;

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "Lud;")
    public static class279 field3002 = class130.method1024("tremblement:", 255);

    @OriginalMember(owner = "client!dh", name = "t", descriptor = "Lhc;")
    public static class171 field3005 = new class171(32);

    @OriginalMember(owner = "client!dh", name = "u", descriptor = "Lud;")
    public static class279 field3006 = class130.method1024("Suche nach Updates )2 ", 255);

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!dh", name = "v", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)I", line = 5)
    public final int method1292(int arg0, int arg1) {
        field2994++;
        if (arg1 != -3606) {
            method1297(39, 70, -106, (int[][]) ((int[][]) null), 85, 38, true, 28, (float[][]) ((float[][]) null), 97, -35, (float[][]) ((float[][]) null), (int[][]) ((int[][]) null), -86, -85, (float[][]) ((float[][]) null), 0.47100726F, (class168) null);
        }
        if (this.field2991 != null) {
            arg0 = ((int) ((long) this.field2992 * (long) arg0 / (long) this.field2999)) + 6;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(II)V", line = 23)
    public static final void method1293(int arg0, int arg1) {
        for (class314 var2 = class262.field4668.method609(-26368); var2 != null; var2 = class262.field4668.method604(2)) {
            if (((long) arg1) == (var2.field5539 >> 48 & 0xFFFFL)) {
                var2.method2221(true);
            }
        }
        field2987++;
        if (arg0 != 0) {
            method1303(-67, 109, 114, -70);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V", line = 49)
    public static final void method1294(int arg0) {
        class236.field4108 = 0;
        class174.field3139 = 0;
        class53.method487((byte) 112);
        class284.method2034((byte) 92);
        field2986++;
        class237.method1706(34);
        class33.method296((byte) -90);
        for (int var1 = 0; var1 < class236.field4108; var1++) {
            int var2 = class73.field1433[var1];
            if (class8.field279 != class96.field1780[var2].field84) {
                if (class96.field1780[var2].field4199 > 0) {
                    class271.method1935(class96.field1780[var2], 100);
                }
                class96.field1780[var2] = null;
            }
        }
        if (class264.field4741 != class287.field5106.field1142) {
            throw new RuntimeException("gpp1 pos:" + class287.field5106.field1142 + " psize:" + class264.field4741);
        }
        if (arg0 != -32679) {
            method1293(-117, -61);
        }
        for (int var3 = 0; var3 < class103.field1931; var3++) {
            if (class96.field1780[class252.field4503[var3]] == null) {
                throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class103.field1931);
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V", line = 101)
    public static final void method1295(int arg0) {
        if (arg0 < 47) {
            method1299(-105);
        }
        class111.field2046.method1338((byte) -114);
        field2998++;
        class265.field4774.method1338((byte) -103);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILud;)I", line = 114)
    public static final int method1296(int arg0, class279 arg1) {
        field2990++;
        if (class62.field1274 == null || arg1.method1984(8) == 0) {
            return -1;
        } else if (arg0 < 71) {
            return -120;
        } else {
            for (int var2 = 0; var2 < class62.field1274.field2429; var2++) {
                if (class62.field1274.field2438[var2].method2007((byte) -119, class311.field5506, class96.field1787).method1974(arg1, -28089)) {
                    return var2;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(III[[IIIZI[[FII[[F[[III[[FFLvk;)I", line = 142)
    public static final int method1297(int arg0, int arg1, int arg2, int[][] arg3, int arg4, int arg5, boolean arg6, int arg7, float[][] arg8, int arg9, int arg10, float[][] arg11, int[][] arg12, int arg13, int arg14, float[][] arg15, float arg16, class168 arg17) {
        if (arg10 == 1) {
            int var19 = arg14;
            arg14 = arg0;
            arg0 = 128 - var19;
        } else if (arg10 == 2) {
            arg0 = 128 - arg0;
            arg14 = 128 - arg14;
        } else if (arg10 == 3) {
            int var18 = arg14;
            arg14 = 128 - arg0;
            arg0 = var18;
        }
        if (arg1 != 1) {
            method1296(53, (class279) null);
        }
        field2988++;
        float var20;
        float var21;
        int var22;
        float var23;
        if (arg14 == 0 && arg0 == 0) {
            var20 = arg15[arg2][arg7];
            var21 = arg11[arg2][arg7];
            var22 = arg5;
            var23 = arg8[arg2][arg7];
        } else if (arg14 == 128 && arg0 == 0) {
            var22 = arg9;
            var20 = arg15[arg2 + 1][arg7];
            var23 = arg8[arg2 + 1][arg7];
            var21 = arg11[arg2 + 1][arg7];
        } else if (arg14 == 128 && arg0 == 128) {
            var23 = arg8[arg2 + 1][arg7 + 1];
            var20 = arg15[arg2 + 1][arg7 + 1];
            var22 = arg13;
            var21 = arg11[arg2 + 1][arg7 + 1];
        } else if (arg14 == 0 && arg0 == 128) {
            var23 = arg8[arg2][arg7 + 1];
            var22 = arg4;
            var20 = arg15[arg2][arg7 + 1];
            var21 = arg11[arg2][arg7 + 1];
        } else {
            float var24 = arg8[arg2][arg7];
            float var25 = arg11[arg2][arg7];
            float var26 = arg15[arg2][arg7];
            float var27 = (float) arg0 / 128.0F;
            float var28 = (float) arg14 / 128.0F;
            float var29 = (arg11[arg2 + 1][arg7] - var25) * var28 + var25;
            float var30 = (arg8[arg2 + 1][arg7] - var24) * var28 + var24;
            float var31 = (arg15[arg2 + 1][arg7] - var26) * var28 + var26;
            float var32 = arg11[arg2][arg7 + 1];
            float var33 = (arg11[arg2 + 1][arg7 + 1] - var32) * var28 + var32;
            var21 = (var33 - var29) * var27 + var29;
            float var34 = arg8[arg2][arg7 + 1];
            float var35 = (arg8[arg2 + 1][arg7 + 1] - var34) * var28 + var34;
            var23 = (var35 - var30) * var27 + var30;
            float var36 = arg15[arg2][arg7 + 1];
            float var37 = (arg15[arg2 + 1][arg7 + 1] - var36) * var28 + var36;
            int var38 = class73.method637(arg9, arg14, arg5, (byte) -128);
            int var39 = class73.method637(arg13, arg14, arg4, (byte) -128);
            var22 = class73.method637(var39, arg0, var38, (byte) -128);
            var20 = (var37 - var31) * var27 + var31;
        }
        int var40 = (arg7 << 7) + arg0;
        int var41 = (arg2 << 7) + arg14;
        int var42 = class41.method357(arg12, true, arg2, arg0, arg14, arg7);
        return arg17.method1311(var41, var42, var40, var21, var23, var20, arg6 ? var22 & 0xFFFFFF00 : var22, arg3 == null ? 0.0F : (float) (var42 - class41.method357(arg3, true, arg2, arg0, arg14, arg7)) / arg16);
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(II)I", line = 256)
    public final int method1298(int arg0, int arg1) {
        field3001++;
        if (arg1 >= -114) {
            method1297(-30, 17, 114, (int[][]) ((int[][]) null), -109, 106, false, -98, (float[][]) ((float[][]) null), -51, 14, (float[][]) ((float[][]) null), (int[][]) ((int[][]) null), 10, -40, (float[][]) ((float[][]) null), 0.85422695F, (class168) null);
        }
        if (this.field2991 != null) {
            arg0 = (int) ((long) this.field2992 * (long) arg0 / (long) this.field2999);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(I)V", line = 271)
    public static void method1299(int arg0) {
        field3002 = null;
        if (arg0 != -25506) {
            method1297(-74, -16, -43, (int[][]) ((int[][]) null), -14, 84, true, 69, (float[][]) ((float[][]) null), -86, -30, (float[][]) ((float[][]) null), (int[][]) ((int[][]) null), 2, 58, (float[][]) ((float[][]) null), -1.2837126F, (class168) null);
        }
        field3005 = null;
        field3003 = null;
        field2996 = null;
        field2993 = null;
        field3006 = null;
        field3004 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BI)I", line = 291)
    public static final int method1300(byte arg0, int arg1) {
        field2997++;
        if (arg0 != -18) {
            method1294(45);
        }
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "(I)V", line = 305)
    public static final void method1301(int arg0) {
        field2989++;
        int var1 = -38 / ((arg0 + 30) / 49);
        for (class121 var2 = (class121) class107.field1996.method2248(110); var2 != null; var2 = (class121) class107.field1996.method2240(1138)) {
            class249 var3 = var2.field2176;
            if (class287.field5134 != var3.field4429 || var3.field4419) {
                var2.method2221(true);
            } else if (class8.field279 >= var3.field4424) {
                var3.method1781(class121.field2187, -108);
                if (var3.field4419) {
                    var2.method2221(true);
                } else {
                    class320.method2251(var3.field4429, var3.field4420, var3.field4447, var3.field4433, 60, var3, 0, -1L, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B[B)[B", line = 337)
    public final byte[] method1302(byte arg0, byte[] arg1) {
        if (arg0 != -26) {
            method1301(73);
        }
        field3000++;
        if (this.field2991 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field2992 / (long) this.field2999) + 14;
            int var4 = 0;
            int[] var5 = new int[var3];
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var8 = arg1[var7];
                int[] var9 = this.field2991[var6];
                for (int var10 = 0; var10 < 14; var10++) {
                    var5[var4 + var10] += var9[var10] * var8;
                }
                int var11 = this.field2992 + var6;
                int var12 = var11 / this.field2999;
                var4 += var12;
                var6 = var11 - this.field2999 * var12;
            }
            arg1 = new byte[var3];
            for (int var13 = 0; var13 < var3; var13++) {
                int var14 = var5[var13] + 32768 >> 16;
                if (var14 < -128) {
                    arg1[var13] = -128;
                } else if (var14 <= 127) {
                    arg1[var13] = (byte) var14;
                } else {
                    arg1[var13] = 127;
                }
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIII)Z", line = 406)
    public static final boolean method1303(int arg0, int arg1, int arg2, int arg3) {
        if (class42.method361(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class213.method1564(var4 + 1, class165.field2970[arg0][arg1][arg2] + arg3, var5 + 1) && class213.method1564(var4 + 128 - 1, class165.field2970[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class213.method1564(var4 + 128 - 1, class165.field2970[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class213.method1564(var4 + 1, class165.field2970[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(II)V", line = 419)
    public class166(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class174.method1350(arg1, arg0, (byte) 5);
            int var4 = arg1 / var3;
            this.field2992 = var4;
            int var5 = arg0 / var3;
            this.field2991 = new int[var5][14];
            this.field2999 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field2991[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var4 / (double) var5;
                if (var10 < 0) {
                    var10 = 0;
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
}
