import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class379 extends class356 {

    @OriginalMember(owner = "client!nv", name = "F", descriptor = "[I")
    private int[] field4928;

    @OriginalMember(owner = "client!nv", name = "I", descriptor = "[I")
    private int[] field4931;

    @OriginalMember(owner = "client!nv", name = "G", descriptor = "Lcc;")
    private class666 field4929;

    @OriginalMember(owner = "client!nv", name = "H", descriptor = "Lcc;")
    private class666 field4930;

    @OriginalMember(owner = "client!nv", name = "A", descriptor = "Lcc;")
    private class666 field4923;

    @OriginalMember(owner = "client!nv", name = "x", descriptor = "[Lcc;")
    private class666[] field4920;

    @OriginalMember(owner = "client!nv", name = "y", descriptor = "[[I")
    public static int[][] field4921 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!nv", name = "v", descriptor = "Lkfa;")
    public static class549 field4918 = new class549(14, 11);

    @OriginalMember(owner = "client!nv", name = "w", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!nv", name = "B", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!nv", name = "C", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!nv", name = "D", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!nv", name = "E", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!nv", name = "u", descriptor = "Ljo;")
    public static class303 field4917;

    @OriginalMember(owner = "client!nv", name = "z", descriptor = "[[[B")
    public static byte[][][] field4922;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(BLe;Ljo;)Z")
    public final boolean method2074(byte arg0, class486 arg1, class303 arg2) {
        field4924++;
        if (class22.field204 >= 0) {
            for (int var4 = 0; var4 < this.field4931.length; var4++) {
                if (!arg2.method1739(class22.field204, this.field4931[var4], -2)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field4931.length; var5++) {
                if (!arg2.method1711(this.field4931[var5], 1)) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field4928.length; var6++) {
            if (!arg1.method843(this.field4928[var6], 31340)) {
                return false;
            }
        }
        if (arg0 > -61) {
            this.method2076(0.39098996942248004D, true, -104, null, -108, null, -10, true);
        }
        return true;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZIILe;Ljo;I)[F")
    public final float[] method2075(boolean arg0, int arg1, int arg2, class486 arg3, class303 arg4, int arg5) {
        field4927++;
        class19.field169 = arg3;
        class169.field2029 = arg4;
        for (int var7 = 0; var7 < this.field4920.length; var7++) {
            this.field4920[var7].method2649(arg5 ^ 0xA2030DC6, arg2, arg1);
        }
        class625.method3502(arg1, (byte) 32, arg2);
        float[] var8 = new float[arg1 * arg2 * 4];
        int var9 = 0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field4930.field9465) {
                int[] var16 = this.field4930.method122(-29, var10);
                var13 = var16;
                var14 = var16;
                var15 = var16;
            } else {
                int[][] var12 = this.field4930.method1251(var10, (byte) 98);
                var13 = var12[2];
                var14 = var12[1];
                var15 = var12[0];
            }
            int[] var17;
            if (this.field4923.field9465) {
                var17 = this.field4923.method122(-32, var10);
            } else {
                var17 = this.field4923.method1251(var10, (byte) 98)[0];
            }
            int[] var18;
            if (this.field4929.field9465) {
                var18 = this.field4929.method122(-25, var10);
            } else {
                var18 = this.field4929.method1251(var10, (byte) 98)[0];
            }
            if (arg0) {
                var9 = var10 << 2;
            }
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                if (var20 < 0.0F) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = var20;
                if (arg0) {
                    var9 += (arg1 << 2) - 4;
                }
            }
        }
        if (arg5 == -1576858206) {
            for (int var11 = 0; var11 < this.field4920.length; var11++) {
                this.field4920[var11].method2081(21456);
            }
            return var8;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(DZILe;ILjo;IZ)[I")
    public final int[] method2076(double arg0, boolean arg1, int arg2, class486 arg3, int arg4, class303 arg5, int arg6, boolean arg7) {
        class169.field2029 = arg5;
        field4926++;
        class19.field169 = arg3;
        if (arg6 != 255) {
            return null;
        }
        for (int var10 = 0; var10 < this.field4920.length; var10++) {
            this.field4920[var10].method2649(104, arg2, arg4);
        }
        class25.method125(arg0, (byte) -28);
        class625.method3502(arg4, (byte) 79, arg2);
        int[] var11 = new int[arg2 * arg4];
        byte var12;
        int var13;
        int var14;
        if (arg1) {
            var12 = -1;
            var13 = arg4 - 1;
            var14 = -1;
        } else {
            var13 = 0;
            var12 = 1;
            var14 = arg4;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg2; var16++) {
            if (arg7) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field4930.field9465) {
                int[] var22 = this.field4930.method122(-97, var16);
                var19 = var22;
                var20 = var22;
                var21 = var22;
            } else {
                int[][] var18 = this.field4930.method1251(var16, (byte) 98);
                var19 = var18[2];
                var20 = var18[1];
                var21 = var18[0];
            }
            for (int var23 = var13; var23 != var14; var23 += var12) {
                int var24 = var21[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var20[var23] >> 4;
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
                int var27 = class170.field2039[var25];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class170.field2039[var24];
                int var29 = class170.field2039[var26];
                int var30 = (var28 << 16) + (var27 << 8) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg7) {
                    var15 += arg4 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field4920.length; var17++) {
            this.field4920[var17].method2081(21456);
        }
        return var11;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lnfa;[BBI)Luaa;")
    public static final class103 method2077(class621 arg0, byte[] arg1, byte arg2, int arg3) {
        if (arg2 > -76) {
            field4918 = null;
        }
        field4919++;
        if (arg1 == null) {
            return null;
        }
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg3, var4);
        OpenGL.glProgramRawARB(arg3, 34933, arg1);
        OpenGL.glGetIntegerv(34379, class358.field4697, 0);
        if (class358.field4697[0] == -1) {
            OpenGL.glBindProgramARB(arg3, 0);
            return new class103(arg0, arg3, var4);
        } else {
            OpenGL.glBindProgramARB(arg3, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)V")
    public static void method2078(byte arg0) {
        field4922 = null;
        field4921 = null;
        field4918 = null;
        int var1 = -63 / ((arg0 - 11) / 53);
        field4917 = null;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(DZLjo;IBLe;I)[I")
    public final int[] method2079(double arg0, boolean arg1, class303 arg2, int arg3, byte arg4, class486 arg5, int arg6) {
        field4925++;
        class19.field169 = arg5;
        class169.field2029 = arg2;
        for (int var9 = 0; var9 < this.field4920.length; var9++) {
            this.field4920[var9].method2649(94, arg3, arg6);
        }
        if (arg4 != 35) {
            this.method2074((byte) -30, null, null);
        }
        class25.method125(arg0, (byte) -28);
        class625.method3502(arg6, (byte) 44, arg3);
        int[] var10 = new int[arg3 * arg6 * 4];
        int var11 = 0;
        for (int var12 = 0; var12 < arg3; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field4930.field9465) {
                int[] var14 = this.field4930.method122(-88, var12);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field4930.method1251(var12, (byte) 98);
                var15 = var18[0];
                var16 = var18[2];
                var17 = var18[1];
            }
            int[] var19;
            if (this.field4923.field9465) {
                var19 = this.field4923.method122(-123, var12);
            } else {
                var19 = this.field4923.method1251(var12, (byte) 98)[0];
            }
            if (arg1) {
                var11 = var12;
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
                int var24 = class170.field2039[var22];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var25 = class170.field2039[var21];
                int var26 = class170.field2039[var23];
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
                var10[var11++] = (var25 << 16) + (var27 << 24) + (var24 << 8) + var26;
                if (arg1) {
                    var11 += arg6 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field4920.length; var13++) {
            this.field4920[var13].method2081(21456);
        }
        return var10;
    }

    @OriginalMember(owner = "client!nv", name = "<init>", descriptor = "()V")
    public class379() {
        this.field4928 = new int[0];
        this.field4931 = new int[0];
        this.field4929 = new class507(0);
        this.field4929.field9474 = 1;
        this.field4930 = new class507();
        this.field4930.field9474 = 1;
        this.field4923 = new class507();
        this.field4923.field9474 = 1;
        this.field4920 = new class666[] { this.field4930, this.field4923, this.field4929 };
    }

    @OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Liaa;)V")
    public class379(class452 arg0) {
        int var2 = arg0.method2541(79);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field4920 = new class666[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class666 var16 = class373.method2050(arg0, -30661);
            if (var16.method2083(1) >= 0) {
                var3++;
            }
            if (var16.method2648(-1) >= 0) {
                var4++;
            }
            int var17 = var16.field9464.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method2541(72);
            }
            this.field4920[var6] = var16;
        }
        this.field4931 = new int[var3];
        this.field4928 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class666 var11 = this.field4920[var9];
            int var12 = var11.field9464.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field9464[var13] = this.field4920[var5[var9][var13]];
            }
            int var14 = var11.method2083(1);
            int var15 = var11.method2648(-1);
            if (var14 > 0) {
                this.field4931[var7++] = var14;
            }
            if (var15 > 0) {
                this.field4928[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field4930 = this.field4920[arg0.method2541(121)];
        this.field4923 = this.field4920[arg0.method2541(48)];
        this.field4929 = this.field4920[arg0.method2541(45)];
        Object var10 = null;
    }
}
