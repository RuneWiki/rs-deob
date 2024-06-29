import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class87 {

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public static int field1246 = 0;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "Ll;")
    public static class66 field1247 = new class66(64);

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1251 = "shake:";

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1252 = "Take";

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILec;Lvo;)V", line = 7)
    public static final void method784(int arg0, class181 arg1, class22 arg2) {
        field1248++;
        class77 var3 = arg1.method1407(9921);
        if (var3 == null) {
            return;
        }
        int var4 = var3.field3827;
        int var5 = arg2.field343;
        if (var3.field3827 < var3.field3826) {
            var4 = var3.field3826;
        }
        int var6 = arg2.field345;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        if (arg1.field2841 != null) {
            var7 = class314.field4853.method1192(arg1.field2841, (int[]) null, class209.field3224);
            for (int var10 = 0; var10 < var7; var10++) {
                String var11 = class209.field3224[var10];
                if (var10 < var7 - 1) {
                    var11 = var11.substring(0, var11.length() - 4);
                }
                int var12 = class114.field1754.method2327(var11);
                if (var12 > var8) {
                    var8 = var12;
                }
            }
            var9 = (var7 - 1) * class114.field1754.method2329() + (class114.field1754.method2336() / 2);
        }
        int var13 = arg2.field343;
        if ((class351.field5614 + var4) > var5) {
            var13 = var4 / 2 + class351.field5614 + 5 - (-(var8 / 2) + -var4);
            var5 = class351.field5614 + var4;
        } else if (class351.field5610 - var4 < var5) {
            var5 = class351.field5610 - var4;
            var13 = class351.field5610 - var4 / 2 - (var8 / 2) - var4 - 5;
        }
        int var14 = arg2.field345 - (var9 / 2);
        if (var6 < (class351.field5605 + var4)) {
            var6 = class351.field5605 + var4;
            var14 = var4 / 2 + class351.field5605 + var4 + class114.field1754.method2329();
        } else if ((class351.field5604 - var4) < var6) {
            var6 = class351.field5604 - var4;
            var14 = class351.field5604 - (var4 / 2) - var4 - var9;
        }
        int var15 = var4 >> arg0;
        int var16 = -2;
        int var17 = -2;
        int var18 = (int) (Math.atan2((double) (var5 - arg2.field343), (double) (var6 - arg2.field345)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
        int var19 = -2;
        var3.method706(var3.field3832 << 3, var3.field3825 << 3, (var5 << 4) + var15, (var6 << 4) - -var15, var18, 4096);
        int var20 = -2;
        if (arg1.field2841 != null) {
            var20 = var14 - class114.field1754.method2336() - 3;
            var16 = var13 - (var8 / 2) - 5;
            var17 = var16 + var8 + 10;
            var19 = var20 + var7 * class114.field1754.method2329();
            if (arg1.field2829 != 0) {
                class60.method601(var16, var20, var17 - var16, -var20 + var19, arg1.field2829, arg1.field2829 >>> 24);
            }
            if (arg1.field2847 != 0) {
                class60.method594(var16, var20, var17 - var16, -var20 + var19, arg1.field2847, arg1.field2847 >>> 24);
            }
            for (int var21 = 0; var21 < var7; var21++) {
                String var22 = class209.field3224[var21];
                if (var7 - 1 > var21) {
                    var22 = var22.substring(0, var22.length() - 4);
                }
                class114.field1754.method2330(var22, var13, var14, arg1.field2868, true);
                var14 += class114.field1754.method2329();
            }
        }
        if ((var5 - var15) >= class268.field4137 || class268.field4137 >= (var5 + var15) || class78.field1129 <= var6 - var15 || var6 + var15 <= class78.field1129 && class268.field4137 <= var16 || var17 <= class268.field4137 || var20 >= class78.field1129 || class78.field1129 >= var19) {
            return;
        }
        if (arg1.field2860[4] != null) {
            class268.method1963((short) 1005, arg1.field2844, 0, -1, arg1.field2860[4], (long) arg2.field349, -25900, 0);
        }
        if (arg1.field2860[3] != null) {
            class268.method1963((short) 1003, arg1.field2844, 0, -1, arg1.field2860[3], (long) arg2.field349, arg0 ^ 0xFFFF9AD5, 0);
        }
        if (arg1.field2860[2] != null) {
            class268.method1963((short) 1002, arg1.field2844, 0, -1, arg1.field2860[2], (long) arg2.field349, arg0 - 25901, 0);
        }
        if (arg1.field2860[1] != null) {
            class268.method1963((short) 1004, arg1.field2844, 0, -1, arg1.field2860[1], (long) arg2.field349, -25900, 0);
        }
        if (arg1.field2860[0] != null) {
            class268.method1963((short) 1008, arg1.field2844, 0, -1, arg1.field2860[0], (long) arg2.field349, arg0 - 25901, 0);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)V", line = 163)
    public static final void method785(boolean arg0) {
        class43.field689.method656(0);
        field1250++;
        if (!arg0) {
            field1247 = (class66) null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljn;Lqa;[[F[I[[I[[FBIII[[F)V", line = 175)
    public static final void method786(class186 arg0, class336 arg1, float[][] arg2, int[] arg3, int[][] arg4, float[][] arg5, byte arg6, int arg7, int arg8, int arg9, float[][] arg10) {
        field1249++;
        int[] var11 = new int[arg3.length / 2];
        int var12 = -9 / ((-arg6 - 29) / 51);
        for (int var13 = 0; var13 < var11.length; var13++) {
            int var14 = arg3[var13 + var13];
            int var15 = arg3[var13 + var13 + 1];
            if (arg7 == 1) {
                int var16 = var14;
                var14 = var15;
                var15 = 128 - var16;
            } else if (arg7 == 2) {
                var15 = 128 - var15;
                var14 = 128 - var14;
            } else if (arg7 == 3) {
                int var17 = var14;
                var14 = 128 - var15;
                var15 = var17;
            }
            float var18;
            float var19;
            float var20;
            if (var14 == 0 && var15 == 0) {
                var18 = arg5[arg9][arg8];
                var19 = arg2[arg9][arg8];
                var20 = arg10[arg9][arg8];
            } else if (var14 == 128 && var15 == 0) {
                var18 = arg5[arg9 + 1][arg8];
                var19 = arg2[arg9 + 1][arg8];
                var20 = arg10[arg9 + 1][arg8];
            } else if (var14 == 128 && var15 == 128) {
                var19 = arg2[arg9 + 1][arg8 + 1];
                var20 = arg10[arg9 + 1][arg8 + 1];
                var18 = arg5[arg9 + 1][arg8 + 1];
            } else if (var14 == 0 && var15 == 128) {
                var20 = arg10[arg9][arg8 + 1];
                var18 = arg5[arg9][arg8 + 1];
                var19 = arg2[arg9][arg8 + 1];
            } else {
                float var21 = arg2[arg9][arg8];
                float var22 = arg5[arg9][arg8];
                float var23 = (float) var14 / 128.0F;
                float var24 = (arg2[arg9 + 1][arg8] - var21) * var23 + var21;
                float var25 = (arg5[arg9 + 1][arg8] - var22) * var23 + var22;
                float var26 = arg10[arg9][arg8 + 1];
                float var27 = (arg10[arg9 + 1][arg8 + 1] - var26) * var23 + var26;
                float var28 = arg5[arg9][arg8 + 1];
                float var29 = (float) var15 / 128.0F;
                float var30 = (arg5[arg9 + 1][arg8 + 1] - var28) * var23 + var28;
                var18 = (var30 - var25) * var29 + var25;
                float var31 = arg10[arg9][arg8];
                float var32 = arg2[arg9][arg8 + 1];
                float var33 = (arg10[arg9 + 1][arg8] - var31) * var23 + var31;
                float var34 = (arg2[arg9 + 1][arg8 + 1] - var32) * var23 + var32;
                var19 = (var34 - var24) * var29 + var24;
                var20 = (var27 - var33) * var29 + var33;
            }
            int var35 = (arg9 << 7) + var14;
            int var36 = class131.method1131(arg9, var14, var15, arg8, -2134986041, arg4);
            int var37 = (arg8 << 7) + var15;
            var11[var13] = arg1.method2362(arg0, var35, var36, var37, var20, var18, var19);
        }
        arg1.method2363(var11);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V", line = 296)
    public static void method787(int arg0) {
        field1247 = null;
        field1251 = null;
        if (arg0 >= 81) {
            field1252 = null;
        }
    }
}
