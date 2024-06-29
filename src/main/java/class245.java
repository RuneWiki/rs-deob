import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class245 extends class281 {

    @OriginalMember(owner = "client!ue", name = "G", descriptor = "[I")
    private int[] field3308;

    @OriginalMember(owner = "client!ue", name = "E", descriptor = "[I")
    private int[] field3306;

    @OriginalMember(owner = "client!ue", name = "F", descriptor = "Lle;")
    private class325 field3307;

    @OriginalMember(owner = "client!ue", name = "B", descriptor = "Lle;")
    private class325 field3304;

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "Lle;")
    private class325 field3300;

    @OriginalMember(owner = "client!ue", name = "L", descriptor = "[Lle;")
    private class325[] field3313;

    @OriginalMember(owner = "client!ue", name = "C", descriptor = "Lml;")
    public static class410 field3305 = new class410("", 15);

    @OriginalMember(owner = "client!ue", name = "H", descriptor = "Ljw;")
    public static class581 field3309 = new class581(108, -1);

    @OriginalMember(owner = "client!ue", name = "I", descriptor = "[[B")
    public static byte[][] field3310 = new byte[50][];

    @OriginalMember(owner = "client!ue", name = "J", descriptor = "Lmga;")
    public static class739 field3311 = new class739(33, 3);

    @OriginalMember(owner = "client!ue", name = "M", descriptor = "Ljw;")
    public static class581 field3314 = new class581(32, -1);

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!ue", name = "A", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!ue", name = "K", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!ue", name = "P", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!ue", name = "N", descriptor = "Lu;")
    public static class80 field3315;

    @OriginalMember(owner = "client!ue", name = "O", descriptor = "[[Z")
    public static boolean[][] field3316;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(B)V", line = 9)
    public static void method1575(byte arg0) {
        field3316 = null;
        int var1 = -13 / ((-arg0 - 2) / 57);
        field3315 = null;
        field3310 = null;
        field3309 = null;
        field3314 = null;
        field3311 = null;
        field3305 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ld;Laj;B)Z", line = 25)
    public final boolean method1576(class161 arg0, class333 arg1, byte arg2) {
        field3301++;
        if (class150.field2089 >= 0) {
            for (int var4 = 0; var4 < this.field3308.length; var4++) {
                if (!arg1.method2120(-5241, this.field3308[var4], class150.field2089)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field3308.length; var5++) {
                if (!arg1.method2104(102, this.field3308[var5])) {
                    return false;
                }
            }
        }
        int var6 = -79 % ((arg2 + 52) / 50);
        for (int var7 = 0; var7 < this.field3306.length; var7++) {
            if (!arg0.method1173(true, this.field3306[var7])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZZILaj;Ld;I)[F", line = 85)
    public final float[] method1577(boolean arg0, boolean arg1, int arg2, class333 arg3, class161 arg4, int arg5) {
        field3303++;
        class15.field226 = arg3;
        class2.field5 = arg4;
        for (int var7 = 0; var7 < this.field3313.length; var7++) {
            this.field3313[var7].method414(arg5, arg2, -8740);
        }
        class160.method1172(arg5, arg2, -68);
        if (arg1) {
            this.method1576(null, null, (byte) -40);
        }
        float[] var8 = new float[arg2 * arg5 * 4];
        int var9 = 0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field3304.field4738) {
                int[] var16 = this.field3304.method100((byte) 125, var10);
                var14 = var16;
                var15 = var16;
                var13 = var16;
            } else {
                int[][] var12 = this.field3304.method360(var10, (byte) -9);
                var13 = var12[1];
                var14 = var12[0];
                var15 = var12[2];
            }
            int[] var17;
            if (this.field3300.field4738) {
                var17 = this.field3300.method100((byte) 30, var10);
            } else {
                var17 = this.field3300.method360(var10, (byte) -9)[0];
            }
            int[] var18;
            if (this.field3307.field4738) {
                var18 = this.field3307.method100((byte) 80, var10);
            } else {
                var18 = this.field3307.method360(var10, (byte) -9)[0];
            }
            if (arg0) {
                var9 = var10 << 2;
            }
            for (int var19 = arg5 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                if ((var20 < 0.0F)) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = var20;
                if (arg0) {
                    var9 += (arg5 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field3313.length; var11++) {
            this.field3313[var11].method417(-31278);
        }
        return var8;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Laj;IZDLd;ZIZ)[I", line = 206)
    public final int[] method1578(class333 arg0, int arg1, boolean arg2, double arg3, class161 arg4, boolean arg5, int arg6, boolean arg7) {
        class2.field5 = arg4;
        class15.field226 = arg0;
        field3302++;
        for (int var10 = 0; var10 < this.field3313.length; var10++) {
            this.field3313[var10].method414(arg1, arg6, -8740);
        }
        class379.method2421(90, arg3);
        class160.method1172(arg1, arg6, -47);
        int[] var11 = new int[arg1 * arg6];
        byte var12;
        int var13;
        int var14;
        if (arg2) {
            var12 = -1;
            var13 = arg1 - 1;
            var14 = -1;
        } else {
            var14 = arg1;
            var13 = 0;
            var12 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg6; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field3304.field4738) {
                int[] var22 = this.field3304.method100((byte) 60, var16);
                var21 = var22;
                var19 = var22;
                var20 = var22;
            } else {
                int[][] var18 = this.field3304.method360(var16, (byte) -9);
                var19 = var18[2];
                var20 = var18[0];
                var21 = var18[1];
            }
            if (arg5) {
                var15 = var16;
            }
            for (int var23 = var13; var23 != var14; var23 += var12) {
                int var24 = var20[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var21[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var19[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class342.field4931[var24];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class342.field4931[var25];
                int var29 = class342.field4931[var26];
                int var30 = (var27 << 16) + (var28 << 8) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg5) {
                    var15 += arg1 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field3313.length; var17++) {
            this.field3313[var17].method417(-31278);
        }
        if (arg7) {
            this.method1579(43, -1.1499622467650181D, false, null, null, 36, 5);
        }
        return var11;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IDZLaj;Ld;II)[I", line = 351)
    public final int[] method1579(int arg0, double arg1, boolean arg2, class333 arg3, class161 arg4, int arg5, int arg6) {
        field3312++;
        class2.field5 = arg4;
        class15.field226 = arg3;
        for (int var9 = 0; var9 < this.field3313.length; var9++) {
            this.field3313[var9].method414(arg6, arg0, -8740);
        }
        class379.method2421(82, arg1);
        class160.method1172(arg6, arg0, 106);
        int[] var10 = new int[arg0 * arg6];
        int var11 = 0;
        if (arg5 < 66) {
            field3310 = null;
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field3304.field4738) {
                int[] var14 = this.field3304.method100((byte) 42, var12);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field3304.method360(var12, (byte) -9);
                var15 = var18[0];
                var17 = var18[1];
                var16 = var18[2];
            }
            if (arg2) {
                var11 = var12;
            }
            int[] var19;
            if (this.field3300.field4738) {
                var19 = this.field3300.method100((byte) 70, var12);
            } else {
                var19 = this.field3300.method360(var12, (byte) -9)[0];
            }
            for (int var20 = arg6 - 1; var20 >= 0; var20--) {
                int var21 = var15[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var17[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var16[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = class342.field4931[var22];
                int var25 = class342.field4931[var21];
                int var26 = class342.field4931[var23];
                int var27;
                if (var25 == 0 && var24 == 0 && var26 == 0) {
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
                var10[var11++] = (var24 << 8) + ((var27 << 24) + (var25 << 16)) + var26;
                if (arg2) {
                    var11 += arg6 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field3313.length; var13++) {
            this.field3313[var13].method417(-31278);
        }
        return var10;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V", line = 488)
    public class245() {
        this.field3308 = new int[0];
        this.field3306 = new int[0];
        this.field3307 = new class344(0);
        this.field3307.field4739 = 1;
        this.field3304 = new class344();
        this.field3304.field4739 = 1;
        this.field3300 = new class344();
        this.field3313 = new class325[] { this.field3304, this.field3300, this.field3307 };
        this.field3300.field4739 = 1;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Ljp;)V", line = 503)
    public class245(class376 arg0) {
        int var2 = arg0.method2398(-1372747256);
        int var3 = 0;
        int var4 = 0;
        this.field3313 = new class325[var2];
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class325 var16 = class183.method1271(0, arg0);
            if (var16.method2064((byte) -17) >= 0) {
                var3++;
            }
            if (var16.method416((byte) -113) >= 0) {
                var4++;
            }
            int var17 = var16.field4729.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method2398(-1372747256);
            }
            this.field3313[var6] = var16;
        }
        this.field3308 = new int[var3];
        this.field3306 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class325 var11 = this.field3313[var9];
            int var12 = var11.field4729.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field4729[var13] = this.field3313[var5[var9][var13]];
            }
            int var14 = var11.method2064((byte) -17);
            int var15 = var11.method416((byte) -78);
            if (var14 > 0) {
                this.field3308[var7++] = var14;
            }
            if (var15 > 0) {
                this.field3306[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field3304 = this.field3313[arg0.method2398(-1372747256)];
        this.field3300 = this.field3313[arg0.method2398(-1372747256)];
        this.field3307 = this.field3313[arg0.method2398(-1372747256)];
        Object var10 = null;
    }
}
