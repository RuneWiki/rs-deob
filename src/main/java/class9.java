import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class9 extends class60 {

    @OriginalMember(owner = "client!gf", name = "A", descriptor = "I")
    public int field221;

    @OriginalMember(owner = "client!gf", name = "x", descriptor = "I")
    public int field218;

    @OriginalMember(owner = "client!gf", name = "y", descriptor = "[I")
    public int[] field219;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "[Z")
    public boolean[] field210;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "[I")
    public int[] field212;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "[[I")
    public int[][] field208;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "[I")
    public static int[] field211 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!gf", name = "v", descriptor = "I")
    public static int field216 = 0;

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "I")
    public static int field214 = 0;

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "Lgd;")
    public static class325 field213 = new class325(260);

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!gf", name = "w", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!gf", name = "z", descriptor = "[[[I")
    public static int[][][] field220;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "([ILck;III[[FILig;[[F[[F[[I)V", line = 17)
    public static final void method145(int[] arg0, class253 arg1, int arg2, int arg3, int arg4, float[][] arg5, int arg6, class189 arg7, float[][] arg8, float[][] arg9, int[][] arg10) {
        int[] var11 = new int[arg0.length / 2];
        field215++;
        for (int var12 = 0; var12 < var11.length; var12++) {
            int var13 = arg0[var12 + var12];
            int var14 = arg0[var12 + var12 + 1];
            if (arg4 == 1) {
                int var15 = var13;
                var13 = var14;
                var14 = 128 - var15;
            } else if (arg4 == 2) {
                var14 = 128 - var14;
                var13 = 128 - var13;
            } else if (arg4 == 3) {
                int var16 = var13;
                var13 = 128 - var14;
                var14 = var16;
            }
            float var17;
            float var18;
            float var19;
            if (var13 == 0 && var14 == 0) {
                var17 = arg9[arg3][arg6];
                var18 = arg5[arg3][arg6];
                var19 = arg8[arg3][arg6];
            } else if (var13 == 128 && var14 == 0) {
                var18 = arg5[arg3 + 1][arg6];
                var19 = arg8[arg3 + 1][arg6];
                var17 = arg9[arg3 + 1][arg6];
            } else if (var13 == 128 && var14 == 128) {
                var19 = arg8[arg3 + 1][arg6 + 1];
                var17 = arg9[arg3 + 1][arg6 + 1];
                var18 = arg5[arg3 + 1][arg6 + 1];
            } else if (var13 == 0 && var14 == 128) {
                var19 = arg8[arg3][arg6 + 1];
                var18 = arg5[arg3][arg6 + 1];
                var17 = arg9[arg3][arg6 + 1];
            } else {
                float var20 = arg9[arg3][arg6];
                float var21 = (float) var13 / 128.0F;
                float var22 = arg5[arg3][arg6];
                float var23 = (float) var14 / 128.0F;
                float var24 = (arg5[arg3 + 1][arg6] - var22) * var21 + var22;
                float var25 = arg8[arg3][arg6 + 1];
                float var26 = arg9[arg3][arg6 + 1];
                float var27 = arg8[arg3][arg6];
                float var28 = (arg9[arg3 + 1][arg6] - var20) * var21 + var20;
                float var29 = arg5[arg3][arg6 + 1];
                float var30 = (arg5[arg3 + 1][arg6 + 1] - var29) * var21 + var29;
                float var31 = (arg8[arg3 + 1][arg6] - var27) * var21 + var27;
                float var32 = (arg8[arg3 + 1][arg6 + 1] - var25) * var21 + var25;
                var18 = (var30 - var24) * var23 + var24;
                var19 = (var32 - var31) * var23 + var31;
                float var33 = (arg9[arg3 + 1][arg6 + 1] - var26) * var21 + var26;
                var17 = (var33 - var28) * var23 + var28;
            }
            int var34 = (arg6 << 7) + var14;
            int var35 = (arg3 << 7) + var13;
            int var36 = class220.method1605(-1, arg3, var13, arg10, var14, arg6);
            var11[var12] = arg7.method1365(arg1, var35, var36, var34, var17, var18, var19);
        }
        if (arg2 >= -64) {
            method147(62, (byte) -39, -67);
        }
        arg7.method1363(var11);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V", line = 133)
    public static void method146(int arg0) {
        field220 = (int[][][]) null;
        field211 = null;
        field213 = null;
        int var1 = 39 % ((-arg0 - 40) / 57);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IBI)I", line = 154)
    public static final int method147(int arg0, byte arg1, int arg2) {
        if (arg1 != -75) {
            field220 = (int[][][]) ((int[][][]) null);
        }
        int var3 = arg0 - 1 & arg2 >> 31;
        field209++;
        return ((arg2 >>> 31) + arg2) % arg0 + var3;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIII)Z", line = 165)
    public static final boolean method148(int arg0, int arg1, int arg2, int arg3) {
        if (!class284.method1988(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class85.field1374[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class104.field1720) {
                    if (!class316.method2230(var4, var6, var5)) {
                        return false;
                    }
                    if (!class316.method2230(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class316.method2230(var4, var7, var5)) {
                        return false;
                    }
                    if (!class316.method2230(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class316.method2230(var4, var8, var5)) {
                    return false;
                }
                if (!class316.method2230(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class339.field5231) {
                    if (!class316.method2230(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class316.method2230(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class316.method2230(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class316.method2230(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class316.method2230(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class316.method2230(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class104.field1720) {
                    if (!class316.method2230(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class316.method2230(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class316.method2230(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class316.method2230(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class316.method2230(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class316.method2230(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class339.field5231) {
                    if (!class316.method2230(var4, var6, var5)) {
                        return false;
                    }
                    if (!class316.method2230(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class316.method2230(var4, var7, var5)) {
                        return false;
                    }
                    if (!class316.method2230(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class316.method2230(var4, var8, var5)) {
                    return false;
                }
                if (!class316.method2230(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class316.method2230(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class316.method2230(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class316.method2230(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class316.method2230(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class316.method2230(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZIIIII)V", line = 350)
    public static final void method149(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field217++;
        if (arg4 >= class310.field4897 && arg2 <= class180.field2862 && class104.field1719 <= arg5 && class333.field5188 >= arg1) {
            class61.method496(arg4, arg2, arg1, arg3, -1, arg5);
        } else {
            class253.method1755(arg1, arg2, arg5, -27617, arg3, arg4);
        }
        if (arg0) {
            method146(-4);
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(I[B)V", line = 373)
    public class9(int arg0, byte[] arg1) {
        this.field221 = arg0;
        class1 var3 = new class1(arg1);
        this.field218 = var3.method15((byte) 70);
        this.field219 = new int[this.field218];
        this.field210 = new boolean[this.field218];
        this.field212 = new int[this.field218];
        this.field208 = new int[this.field218][];
        for (int var4 = 0; var4 < this.field218; var4++) {
            this.field219[var4] = var3.method15((byte) 82);
        }
        for (int var5 = 0; var5 < this.field218; var5++) {
            this.field210[var5] = var3.method15((byte) 93) == 1;
        }
        for (int var6 = 0; var6 < this.field218; var6++) {
            this.field212[var6] = var3.method56(19612);
        }
        for (int var7 = 0; var7 < this.field218; var7++) {
            this.field208[var7] = new int[var3.method15((byte) -92)];
        }
        for (int var8 = 0; var8 < this.field218; var8++) {
            for (int var9 = 0; var9 < this.field208[var8].length; var9++) {
                this.field208[var8][var9] = var3.method15((byte) -50);
            }
        }
    }
}
