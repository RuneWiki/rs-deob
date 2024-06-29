import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class64 extends class447 {

    @OriginalMember(owner = "client!gm", name = "F", descriptor = "[I")
    private int[] field997;

    @OriginalMember(owner = "client!gm", name = "I", descriptor = "[I")
    private int[] field1000;

    @OriginalMember(owner = "client!gm", name = "N", descriptor = "Lfm;")
    private class436 field1005;

    @OriginalMember(owner = "client!gm", name = "P", descriptor = "Lfm;")
    private class436 field1007;

    @OriginalMember(owner = "client!gm", name = "J", descriptor = "Lfm;")
    private class436 field1001;

    @OriginalMember(owner = "client!gm", name = "Q", descriptor = "[Lfm;")
    private class436[] field1008;

    @OriginalMember(owner = "client!gm", name = "v", descriptor = "Z")
    public static boolean field988 = false;

    @OriginalMember(owner = "client!gm", name = "u", descriptor = "[I")
    public static int[] field987 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!gm", name = "G", descriptor = "Ljava/lang/String;")
    public static String field998 = "red:";

    @OriginalMember(owner = "client!gm", name = "O", descriptor = "[Lbl;")
    public static class387[] field1006 = new class387[14];

    @OriginalMember(owner = "client!gm", name = "w", descriptor = "I")
    public static int field989 = 0;

    @OriginalMember(owner = "client!gm", name = "z", descriptor = "I")
    public static int field992 = -60;

    @OriginalMember(owner = "client!gm", name = "y", descriptor = "I")
    public static int field991 = 0;

    @OriginalMember(owner = "client!gm", name = "K", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!gm", name = "L", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!gm", name = "M", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!gm", name = "R", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!gm", name = "S", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!gm", name = "x", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!gm", name = "C", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!gm", name = "D", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!gm", name = "H", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!gm", name = "A", descriptor = "Lwe;")
    public static class233 field993;

    @OriginalMember(owner = "client!gm", name = "B", descriptor = "Lqj;")
    public static class296 field994;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZIILqj;Lsr;I)[F", line = 7)
    public final float[] method429(boolean arg0, int arg1, int arg2, class296 arg3, class136 arg4, int arg5) {
        class123.field1725 = arg4;
        field996++;
        class182.field2541 = arg3;
        for (int var7 = 0; var7 < this.field1008.length; var7++) {
            this.field1008[var7].method2684(arg2, (byte) -38, arg5);
        }
        class63.method427(arg5, arg2, (byte) 36);
        float[] var8 = new float[arg2 * 4 * arg5];
        int var9 = 0;
        for (int var10 = 0; var10 < arg5; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field1007.field6256) {
                int[] var12 = this.field1007.method14(var10, arg1 + 33819);
                var13 = var12;
                var14 = var12;
                var15 = var12;
            } else {
                int[][] var16 = this.field1007.method85(-13348, var10);
                var13 = var16[1];
                var15 = var16[0];
                var14 = var16[2];
            }
            int[] var17;
            if (this.field1001.field6256) {
                var17 = this.field1001.method14(var10, 18338);
            } else {
                var17 = this.field1001.method85(-13348, var10)[0];
            }
            if (arg0) {
                var9 = var10 << 2;
            }
            int[] var18;
            if (this.field1005.field6256) {
                var18 = this.field1005.method14(var10, arg1 ^ 0xFFFF8425);
            } else {
                var18 = this.field1005.method85(-13348, var10)[0];
            }
            for (int var19 = arg2 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                if ((var20 < 0.0F)) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = var20;
                if (arg0) {
                    var9 += (arg2 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field1008.length; var11++) {
            this.field1008[var11].method1668(arg1 + 15495);
        }
        if (arg1 != -15481) {
            method436(29, 29, 31);
        }
        return var8;
    }

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "(I)Z", line = 131)
    public static final boolean method430(int arg0) {
        if (arg0 != 0) {
            method436(-115, 52, -86);
        }
        field990++;
        return class378.field5394;
    }

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "(I)V", line = 142)
    public static void method431(int arg0) {
        field987 = null;
        field1006 = null;
        field994 = null;
        field993 = null;
        field998 = null;
        if (arg0 != 1648896848) {
            field993 = null;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lsr;Lqj;I)Z", line = 156)
    public final boolean method432(class136 arg0, class296 arg1, int arg2) {
        field1003++;
        if (class198.field2739 <= 0) {
            for (int var4 = 0; var4 < this.field1000.length; var4++) {
                if (!arg1.method1898(this.field1000[var4], 126)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field1000.length; var5++) {
                if (!arg1.method1897(class198.field2739, -76, this.field1000[var5])) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field997.length; var6++) {
            if (!arg0.method610((byte) 0, this.field997[var6])) {
                return false;
            }
        }
        if (arg2 <= 108) {
            field994 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Laa;Lqj;I)V", line = 211)
    public static final void method433(class281 arg0, class296 arg1, int arg2) {
        field1009++;
        class18[] var3 = class18.method107(arg1, class94.field1407, 0);
        class71.field1099 = new class130[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class71.field1099[var4] = arg0.method1807(var3[var4], true);
        }
        class18[] var5 = class18.method107(arg1, class326.field4450, 0);
        class261.field3571 = new class130[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class261.field3571[var6] = arg0.method1807(var5[var6], true);
        }
        class18[] var7 = class18.method107(arg1, class60.field838, 0);
        class401.field5855 = new class130[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class401.field5855[var8] = arg0.method1807(var7[var8], true);
        }
        class18[] var9 = class18.method107(arg1, class169.field2406, 0);
        class129.field1805 = new class130[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class129.field1805[var10] = arg0.method1807(var9[var10], true);
        }
        class18[] var11 = class18.method107(arg1, client.field2331, 0);
        class154.field2183 = new class130[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class154.field2183[var12] = arg0.method1807(var11[var12], true);
        }
        class18[] var13 = class18.method107(arg1, class237.field3226, 0);
        class11.field150 = new class130[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class11.field150[var14] = arg0.method1807(var13[var14], true);
        }
        class18[] var15 = class18.method107(arg1, class48.field734, 0);
        class276.field3746 = new class130[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class276.field3746[var16] = arg0.method1807(var15[var16], true);
        }
        class18[] var17 = class18.method107(arg1, class9.field140, 0);
        class32.field500 = new class130[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class32.field500[var18] = arg0.method1807(var17[var18], true);
        }
        class18[] var19 = class18.method107(arg1, class24.field321, 0);
        class157.field2230 = new class130[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class157.field2230[var20] = arg0.method1807(var19[var20], true);
        }
        class18[] var21 = class18.method107(arg1, class232.field3122, 0);
        class312.field4258 = new class130[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class312.field4258[var22] = arg0.method1807(var21[var22], true);
        }
        class18[] var23 = class18.method107(arg1, class305.field4196, 0);
        class369.field5183 = new class130[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class369.field5183[var24] = arg0.method1807(var23[var24], true);
        }
        class18[] var25 = class18.method107(arg1, class427.field6122, 0);
        class140.field1992 = new class130[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class140.field1992[var26] = arg0.method1807(var25[var26], true);
        }
        class18[] var27 = class18.method107(arg1, class166.field2373, 0);
        class197.field2730 = new class130[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class197.field2730[var28] = arg0.method1807(var27[var28], true);
        }
        if (arg2 != 16568) {
            field992 = 55;
        }
        class382.field5408 = arg0.method1807(class18.method119(arg1, class431.field6204, 0), true);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IDLqj;BIZLsr;)[I", line = 354)
    public final int[] method434(int arg0, double arg1, class296 arg2, byte arg3, int arg4, boolean arg5, class136 arg6) {
        class182.field2541 = arg2;
        class123.field1725 = arg6;
        field999++;
        for (int var9 = 0; var9 < this.field1008.length; var9++) {
            this.field1008[var9].method2684(arg4, (byte) -125, arg0);
        }
        class189.method1237((byte) -74, arg1);
        class63.method427(arg0, arg4, (byte) 36);
        int[] var10 = new int[arg0 * arg4 * 4];
        int var11 = 0;
        for (int var12 = 0; var12 < arg0; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field1007.field6256) {
                int[] var14 = this.field1007.method14(var12, 18338);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field1007.method85(-13348, var12);
                var16 = var18[1];
                var17 = var18[0];
                var15 = var18[2];
            }
            if (arg5) {
                var11 = var12;
            }
            int[] var19;
            if (this.field1001.field6256) {
                var19 = this.field1001.method14(var12, 18338);
            } else {
                var19 = this.field1001.method85(-13348, var12)[0];
            }
            for (int var20 = arg4 - 1; var20 >= 0; var20--) {
                int var21 = var17[var20] >> 4;
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
                int var23 = var15[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = class69.field1080[var21];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var25 = class69.field1080[var22];
                int var26 = class69.field1080[var23];
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
                var10[var11++] = (var24 << 16) + (var25 << 8) + (var27 << 24) + var26;
                if (arg5) {
                    var11 += arg4 - 1;
                }
            }
        }
        if (arg3 >= -108) {
            return null;
        } else {
            for (int var13 = 0; var13 < this.field1008.length; var13++) {
                this.field1008[var13].method1668(14);
            }
            return var10;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lsr;ZLqj;DZIIZ)[I", line = 492)
    public final int[] method435(class136 arg0, boolean arg1, class296 arg2, double arg3, boolean arg4, int arg5, int arg6, boolean arg7) {
        class123.field1725 = arg0;
        field1004++;
        class182.field2541 = arg2;
        for (int var10 = 0; var10 < this.field1008.length; var10++) {
            this.field1008[var10].method2684(arg6, (byte) -97, arg5);
        }
        class189.method1237((byte) -74, arg3);
        class63.method427(arg5, arg6, (byte) 36);
        int[] var11 = new int[arg5 * arg6];
        if (arg1) {
            method430(109);
        }
        int var12;
        byte var13;
        int var14;
        if (arg4) {
            var12 = -1;
            var13 = -1;
            var14 = arg6 - 1;
        } else {
            var14 = 0;
            var12 = arg6;
            var13 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg5; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field1007.field6256) {
                int[] var18 = this.field1007.method14(var16, 18338);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field1007.method85(-13348, var16);
                var21 = var22[2];
                var19 = var22[1];
                var20 = var22[0];
            }
            if (arg7) {
                var15 = var16;
            }
            for (int var23 = var14; var23 != var12; var23 += var13) {
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
                int var27 = class69.field1080[var25];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class69.field1080[var24];
                int var29 = class69.field1080[var26];
                int var30 = (var27 << 8) + ((var28 << 16) + var29);
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg7) {
                    var15 += arg6 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field1008.length; var17++) {
            this.field1008[var17].method1668(14);
        }
        return var11;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(III)V", line = 633)
    public static final void method436(int arg0, int arg1, int arg2) {
        field1002++;
        class399 var3 = class269.method1655(arg1, arg2, arg1 - 101);
        var3.method2583((byte) 71);
        var3.field5842 = arg0;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(BI)V", line = 664)
    public static final void method437(byte arg0, int arg1) {
        int var2 = -94 % ((arg0 - 68) / 32);
        class176.field2485.method1254(arg1, 126);
        field1010++;
        class248.field3438.method1254(arg1, 118);
    }

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "(B)V", line = 676)
    public static final void method438(byte arg0) {
        class190 var1 = class154.field2168;
        synchronized (class154.field2168) {
            int var2 = -89 % ((-arg0 - 12) / 53);
            class154.field2168.method1249(1);
        }
        field995++;
        class190 var3 = class229.field3061;
        synchronized (class229.field3061) {
            class229.field3061.method1249(1);
        }
        class190 var4 = class68.field1058;
        synchronized (class68.field1058) {
            class68.field1058.method1249(1);
        }
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "()V", line = 693)
    public class64() {
        this.field997 = new int[0];
        this.field1000 = new int[0];
        this.field1005 = new class58(0);
        this.field1005.field6261 = 1;
        this.field1007 = new class58();
        this.field1007.field6261 = 1;
        this.field1001 = new class58();
        this.field1008 = new class436[] { this.field1007, this.field1001, this.field1005 };
        this.field1001.field6261 = 1;
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Leb;)V", line = 708)
    public class64(class371 arg0) {
        int var2 = arg0.method2429(0);
        int var3 = 0;
        int var4 = 0;
        this.field1008 = new class436[var2];
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class436 var16 = class322.method2037((byte) 107, arg0);
            if (var16.method1667(-1) >= 0) {
                var3++;
            }
            if (var16.method2682((byte) 98) >= 0) {
                var4++;
            }
            int var17 = var16.field6270.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method2429(0);
            }
            this.field1008[var6] = var16;
        }
        this.field1000 = new int[var3];
        int var7 = 0;
        this.field997 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class436 var11 = this.field1008[var9];
            int var12 = var11.field6270.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field6270[var13] = this.field1008[var5[var9][var13]];
            }
            int var14 = var11.method1667(-1);
            int var15 = var11.method2682((byte) 98);
            if (var14 > 0) {
                this.field1000[var7++] = var14;
            }
            if (var15 > 0) {
                this.field997[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field1007 = this.field1008[arg0.method2429(0)];
        this.field1001 = this.field1008[arg0.method2429(0)];
        this.field1005 = this.field1008[arg0.method2429(0)];
        Object var10 = null;
    }
}
