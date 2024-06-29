import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class497 extends class9 {

    @OriginalMember(owner = "client!ht", name = "C", descriptor = "[I")
    private int[] field6903;

    @OriginalMember(owner = "client!ht", name = "z", descriptor = "[I")
    private int[] field6900;

    @OriginalMember(owner = "client!ht", name = "H", descriptor = "Lal;")
    private class82 field6908;

    @OriginalMember(owner = "client!ht", name = "F", descriptor = "Lal;")
    private class82 field6906;

    @OriginalMember(owner = "client!ht", name = "w", descriptor = "Lal;")
    private class82 field6897;

    @OriginalMember(owner = "client!ht", name = "E", descriptor = "[Lal;")
    private class82[] field6905;

    @OriginalMember(owner = "client!ht", name = "D", descriptor = "Lhba;")
    public static class10 field6904 = new class10(1);

    @OriginalMember(owner = "client!ht", name = "x", descriptor = "I")
    public static int field6898;

    @OriginalMember(owner = "client!ht", name = "y", descriptor = "I")
    public static int field6899;

    @OriginalMember(owner = "client!ht", name = "A", descriptor = "I")
    public static int field6901;

    @OriginalMember(owner = "client!ht", name = "B", descriptor = "I")
    public static int field6902;

    @OriginalMember(owner = "client!ht", name = "G", descriptor = "I")
    public static int field6907;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZILdn;ZLn;I)[F")
    public final float[] method2866(boolean arg0, int arg1, class438 arg2, boolean arg3, class17 arg4, int arg5) {
        class41.field327 = arg2;
        field6902++;
        class58.field552 = arg4;
        for (int var7 = 0; var7 < this.field6905.length; var7++) {
            this.field6905[var7].method487(arg1, arg5, 97);
        }
        class218.method1257((byte) -5, arg1, arg5);
        float[] var8 = new float[arg5 * 4 * arg1];
        int var9 = 0;
        for (int var10 = 0; var10 < arg5; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field6906.field999) {
                int[] var16 = this.field6906.method201(var10, 12218);
                var15 = var16;
                var14 = var16;
                var13 = var16;
            } else {
                int[][] var12 = this.field6906.method481(1000, var10);
                var13 = var12[0];
                var14 = var12[2];
                var15 = var12[1];
            }
            int[] var17;
            if (this.field6897.field999) {
                var17 = this.field6897.method201(var10, 12218);
            } else {
                var17 = this.field6897.method481(1000, var10)[0];
            }
            int[] var18;
            if (this.field6908.field999) {
                var18 = this.field6908.method201(var10, 12218);
            } else {
                var18 = this.field6908.method481(1000, var10)[0];
            }
            if (arg3) {
                var9 = var10 << 2;
            }
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                if ((var20 < 0.0F)) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = var20;
                if (arg3) {
                    var9 += (arg1 << 2) - 4;
                }
            }
        }
        if (arg0) {
            this.method2871(null, 18, null);
        }
        for (int var11 = 0; var11 < this.field6905.length; var11++) {
            this.field6905[var11].method485(-114);
        }
        return var8;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Ln;Ldn;DBIZI)[I")
    public final int[] method2867(class17 arg0, class438 arg1, double arg2, byte arg3, int arg4, boolean arg5, int arg6) {
        field6898++;
        class58.field552 = arg0;
        if (arg3 >= -32) {
            this.field6905 = null;
        }
        class41.field327 = arg1;
        for (int var9 = 0; var9 < this.field6905.length; var9++) {
            this.field6905[var9].method487(arg4, arg6, 96);
        }
        class41.method218(88, arg2);
        class218.method1257((byte) -5, arg4, arg6);
        int[] var10 = new int[arg4 * arg6 * 4];
        int var11 = 0;
        for (int var12 = 0; var12 < arg6; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field6906.field999) {
                int[] var18 = this.field6906.method201(var12, 12218);
                var17 = var18;
                var16 = var18;
                var15 = var18;
            } else {
                int[][] var14 = this.field6906.method481(1000, var12);
                var15 = var14[0];
                var16 = var14[1];
                var17 = var14[2];
            }
            int[] var19;
            if (this.field6897.field999) {
                var19 = this.field6897.method201(var12, 12218);
            } else {
                var19 = this.field6897.method481(1000, var12)[0];
            }
            if (arg5) {
                var11 = var12;
            }
            for (int var20 = arg4 - 1; var20 >= 0; var20--) {
                int var21 = var15[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var16[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var17[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = class281.field3698[var21];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var25 = class281.field3698[var22];
                int var26 = class281.field3698[var23];
                int var27;
                if (var24 == 0 && var25 == 0 && var26 == 0) {
                    var27 = 0;
                } else {
                    var27 = var19[var20] >> 4;
                    if (var27 > 255) {
                        var27 = 255;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                }
                var10[var11++] = (var24 << 16) + var26 + (var25 << 8) + (var27 << 24);
                if (arg5) {
                    var11 += arg4 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field6905.length; var13++) {
            this.field6905[var13].method485(-84);
        }
        return var10;
    }

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "(III)Z")
    public static final boolean method2868(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class237.field2962; var3++) {
            class249 var4 = class601.field8672[var3];
            if (var4.field3187 == 1) {
                int var5 = var4.field3180 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field3192 * var5 >> 8) + var4.field3188;
                    int var7 = (var4.field3189 * var5 >> 8) + var4.field3191;
                    int var8 = (var4.field3181 * var5 >> 8) + var4.field3173;
                    int var9 = (var4.field3176 * var5 >> 8) + var4.field3186;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field3187 == 2) {
                int var10 = arg0 - var4.field3180;
                if (var10 > 0) {
                    int var11 = (var4.field3192 * var10 >> 8) + var4.field3188;
                    int var12 = (var4.field3189 * var10 >> 8) + var4.field3191;
                    int var13 = (var4.field3181 * var10 >> 8) + var4.field3173;
                    int var14 = (var4.field3176 * var10 >> 8) + var4.field3186;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field3187 == 3) {
                int var15 = var4.field3188 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field3174 * var15 >> 8) + var4.field3180;
                    int var17 = (var4.field3175 * var15 >> 8) + var4.field3193;
                    int var18 = (var4.field3181 * var15 >> 8) + var4.field3173;
                    int var19 = (var4.field3176 * var15 >> 8) + var4.field3186;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field3187 == 4) {
                int var20 = arg2 - var4.field3188;
                if (var20 > 0) {
                    int var21 = (var4.field3174 * var20 >> 8) + var4.field3180;
                    int var22 = (var4.field3175 * var20 >> 8) + var4.field3193;
                    int var23 = (var4.field3181 * var20 >> 8) + var4.field3173;
                    int var24 = (var4.field3176 * var20 >> 8) + var4.field3186;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field3187 == 5) {
                int var25 = arg1 - var4.field3173;
                if (var25 > 0) {
                    int var26 = (var4.field3174 * var25 >> 8) + var4.field3180;
                    int var27 = (var4.field3175 * var25 >> 8) + var4.field3193;
                    int var28 = (var4.field3192 * var25 >> 8) + var4.field3188;
                    int var29 = (var4.field3189 * var25 >> 8) + var4.field3191;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZZDILn;BILdn;)[I")
    public final int[] method2869(boolean arg0, boolean arg1, double arg2, int arg3, class17 arg4, byte arg5, int arg6, class438 arg7) {
        class41.field327 = arg7;
        class58.field552 = arg4;
        field6901++;
        for (int var10 = 0; var10 < this.field6905.length; var10++) {
            this.field6905[var10].method487(arg6, arg3, 114);
        }
        class41.method218(88, arg2);
        class218.method1257((byte) -5, arg6, arg3);
        int[] var11 = new int[arg3 * arg6];
        int var12;
        byte var13;
        int var14;
        if (arg1) {
            var12 = arg6 - 1;
            var13 = -1;
            var14 = -1;
        } else {
            var12 = 0;
            var13 = 1;
            var14 = arg6;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg3; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field6906.field999) {
                int[] var22 = this.field6906.method201(var16, 12218);
                var21 = var22;
                var20 = var22;
                var19 = var22;
            } else {
                int[][] var18 = this.field6906.method481(1000, var16);
                var19 = var18[1];
                var20 = var18[0];
                var21 = var18[2];
            }
            if (arg0) {
                var15 = var16;
            }
            for (int var23 = var12; var23 != var14; var23 += var13) {
                int var24 = var20[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var19[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var21[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class281.field3698[var25];
                int var28 = class281.field3698[var24];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class281.field3698[var26];
                int var30 = (var27 << 8) + (var28 << 16) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg0) {
                    var15 += arg6 - 1;
                }
            }
        }
        int var17 = 0;
        if (arg5 >= -88) {
            return null;
        }
        while (var17 < this.field6905.length) {
            this.field6905[var17].method485(-114);
            var17++;
        }
        return var11;
    }

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "(I)V")
    public static void method2870(int arg0) {
        field6904 = null;
        if (arg0 != 6133) {
            field6904 = null;
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Ldn;ILn;)Z")
    public final boolean method2871(class438 arg0, int arg1, class17 arg2) {
        field6907++;
        if (class585.field8494 < arg1) {
            for (int var4 = 0; var4 < this.field6900.length; var4++) {
                if (!arg0.method2566(121, this.field6900[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field6900.length; var5++) {
                if (!arg0.method2563(class585.field8494, (byte) 119, this.field6900[var5])) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field6903.length; var6++) {
            if (!arg2.method118(this.field6903[var6], (byte) 126)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "()V")
    public class497() {
        this.field6903 = new int[0];
        this.field6900 = new int[0];
        this.field6908 = new class35(0);
        this.field6908.field987 = 1;
        this.field6906 = new class35();
        this.field6906.field987 = 1;
        this.field6897 = new class35();
        this.field6905 = new class82[] { this.field6906, this.field6897, this.field6908 };
        this.field6897.field987 = 1;
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(II)Z")
    public static final boolean method2872(int arg0, int arg1) {
        field6899++;
        if (arg1 <= 112) {
            return false;
        } else {
            return arg0 == 6 || arg0 == 8;
        }
    }

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(Los;)V")
    public class497(class374 arg0) {
        int var2 = arg0.method2129(-96);
        int var3 = 0;
        int var4 = 0;
        this.field6905 = new class82[var2];
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class82 var16 = class341.method1905(arg0, 0);
            if (var16.method492(-1) >= 0) {
                var3++;
            }
            if (var16.method480(1) >= 0) {
                var4++;
            }
            int var17 = var16.field980.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method2129(-110);
            }
            this.field6905[var6] = var16;
        }
        this.field6900 = new int[var3];
        this.field6903 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class82 var11 = this.field6905[var9];
            int var12 = var11.field980.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field980[var13] = this.field6905[var5[var9][var13]];
            }
            int var14 = var11.method492(-1);
            int var15 = var11.method480(1);
            if (var14 > 0) {
                this.field6900[var7++] = var14;
            }
            if (var15 > 0) {
                this.field6903[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field6906 = this.field6905[arg0.method2129(-99)];
        this.field6897 = this.field6905[arg0.method2129(-74)];
        Object var10 = null;
        this.field6908 = this.field6905[arg0.method2129(-90)];
    }
}
