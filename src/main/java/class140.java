import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class140 extends class241 {

    @OriginalMember(owner = "client!ka", name = "t", descriptor = "Lcf;")
    private class92 field1938 = new class92();

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "Lfu;")
    public class42 field1933;

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "[[I")
    private int[][] field1935;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
    public int field1931;

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "I")
    public int field1952;

    @OriginalMember(owner = "client!ka", name = "y", descriptor = "I")
    public int field1943;

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "[[[I")
    private int[][][] field1950;

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "[[[Lul;")
    private class302[][][] field1949;

    @OriginalMember(owner = "client!ka", name = "w", descriptor = "[[[I")
    public int[][][] field1941;

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "[[[I")
    public int[][][] field1946;

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "[[[I")
    private int[][][] field1937;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "[[[I")
    private int[][][] field1932;

    @OriginalMember(owner = "client!ka", name = "E", descriptor = "[[S")
    public short[][] field1948;

    @OriginalMember(owner = "client!ka", name = "J", descriptor = "[[B")
    private byte[][] field1953;

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "[[B")
    private byte[][] field1958;

    @OriginalMember(owner = "client!ka", name = "W", descriptor = "[[F")
    private float[][] field1966;

    @OriginalMember(owner = "client!ka", name = "N", descriptor = "[[F")
    private float[][] field1957;

    @OriginalMember(owner = "client!ka", name = "Q", descriptor = "[[F")
    private float[][] field1960;

    @OriginalMember(owner = "client!ka", name = "U", descriptor = "Lwk;")
    private class155 field1964;

    @OriginalMember(owner = "client!ka", name = "u", descriptor = "Lcr;")
    private class109 field1939;

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "Lkk;")
    public static class161 field1940 = new class161(1);

    @OriginalMember(owner = "client!ka", name = "z", descriptor = "[F")
    private static float[] field1944 = new float[16];

    @OriginalMember(owner = "client!ka", name = "D", descriptor = "[I")
    private static int[] field1947 = new int[1];

    @OriginalMember(owner = "client!ka", name = "B", descriptor = "[I")
    private static int[] field1945 = new int[1];

    @OriginalMember(owner = "client!ka", name = "T", descriptor = "[I")
    private static int[] field1963 = new int[1];

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "I")
    private int field1934;

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
    private int field1936;

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "I")
    private static int field1951;

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "I")
    private int field1959;

    @OriginalMember(owner = "client!ka", name = "S", descriptor = "I")
    private int field1962;

    @OriginalMember(owner = "client!ka", name = "K", descriptor = "Lfm;")
    public class170 field1954;

    @OriginalMember(owner = "client!ka", name = "M", descriptor = "Lfm;")
    private class170 field1956;

    @OriginalMember(owner = "client!ka", name = "R", descriptor = "Lfm;")
    public class170 field1961;

    @OriginalMember(owner = "client!ka", name = "X", descriptor = "Lfm;")
    public class170 field1967;

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "Lpc;")
    private class171 field1965;

    @OriginalMember(owner = "client!ka", name = "L", descriptor = "[Lul;")
    private class302[] field1955;

    @OriginalMember(owner = "client!ka", name = "x", descriptor = "[[[I")
    private int[][][] field1942;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(Ldh;IIIIZ)V")
    public final void method589(class183 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field1939 != null && arg0 != null) {
            int var7 = arg1 - (this.field1933.field588 * arg2 >> 8) >> this.field1933.field570;
            int var8 = arg3 - (this.field1933.field634 * arg2 >> 8) >> this.field1933.field570;
            this.field1939.method868(var8, arg0, (byte) 105, var7);
        }
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(II)I")
    public final int method590(int arg0, int arg1) {
        int var3 = arg0 >> this.field1952;
        int var4 = arg1 >> this.field1952;
        if (var3 < 0 || var4 < 0 || var3 > this.field3518 - 1 || var4 > this.field3517 - 1) {
            return 0;
        }
        int var5 = arg0 & this.field1943 - 1;
        int var6 = arg1 & this.field1943 - 1;
        int var7 = (this.field1943 - var5) * this.field1935[var3][var4] + this.field1935[var3 + 1][var4] * var5 >> this.field1952;
        int var8 = (this.field1943 - var5) * this.field1935[var3][var4 + 1] + this.field1935[var3 + 1][var4 + 1] * var5 >> this.field1952;
        return (this.field1943 - var6) * var7 + var6 * var8 >> this.field1952;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ldh;IIIIZ)Z")
    public final boolean method583(class183 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field1939 == null || arg0 == null) {
            return false;
        } else {
            int var7 = arg1 - (this.field1933.field588 * arg2 >> 8) >> 3;
            int var8 = arg3 - (this.field1933.field634 * arg2 >> 8) >> 3;
            return this.field1939.method863(var8, 13823, arg0, var7);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)V")
    public final void method588(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method585(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        if (this.field1959 <= 0) {
            return;
        }
        opengl var9 = this.field1933.field557;
        this.field1933.method317();
        this.field1933.method412(false);
        this.field1933.method339(false);
        this.field1933.method313(false);
        this.field1933.method388(false);
        this.field1933.method349(0);
        this.field1933.method347(-2);
        this.field1933.method303((class375) null);
        field1944[0] = (float) arg2 / ((float) this.field1943 * 128.0F * (float) this.field1933.field572);
        field1944[1] = 0.0F;
        field1944[2] = 0.0F;
        field1944[3] = 0.0F;
        field1944[4] = 0.0F;
        field1944[5] = (float) arg2 / ((float) this.field1943 * 128.0F * (float) this.field1933.field576);
        field1944[6] = 0.0F;
        field1944[7] = 0.0F;
        field1944[8] = 0.0F;
        field1944[9] = 0.0F;
        field1944[10] = 0.0F;
        field1944[11] = 0.0F;
        field1944[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field1933.field572;
        field1944[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field1933.field576;
        field1944[14] = 0.0F;
        field1944[15] = 1.0F;
        var9.glMatrixMode(5889);
        var9.glLoadMatrixf(field1944, 0);
        field1944[0] = 1.0F;
        field1944[1] = 0.0F;
        field1944[2] = 0.0F;
        field1944[3] = 0.0F;
        field1944[4] = 0.0F;
        field1944[5] = 0.0F;
        field1944[6] = 1.0F;
        field1944[7] = 0.0F;
        field1944[8] = 0.0F;
        field1944[9] = 1.0F;
        field1944[10] = 0.0F;
        field1944[11] = 0.0F;
        field1944[12] = 0.0F;
        field1944[13] = 0.0F;
        field1944[14] = 0.0F;
        field1944[15] = 1.0F;
        var9.glMatrixMode(5888);
        var9.glLoadMatrixf(field1944, 0);
        if ((this.field1931 & 0x7) == 0) {
            this.field1933.method339(false);
        } else {
            this.field1933.method339(true);
            this.field1933.method293();
        }
        this.field1933.method406(this.field1967, this.field1954, this.field1956, this.field1961);
        if (field1940.field2262.length < this.field1934 * 2) {
            field1940 = new class161(this.field1934 * 2);
        } else {
            field1940.field2298 = 0;
        }
        int var10 = 0;
        if (this.field1933.field622) {
            for (int var11 = arg4; var11 < arg6; var11++) {
                int var12 = this.field3518 * var11 + arg3;
                for (int var13 = arg3; var13 < arg5; var13++) {
                    if (arg7[var13 - arg3][var11 - arg4]) {
                        short[] var14 = this.field1948[var12];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field1940.method1173(var14[var15] & 0xFFFF, (byte) 119);
                                var10++;
                            }
                        }
                    }
                    var12++;
                }
            }
        } else {
            for (int var16 = arg4; var16 < arg6; var16++) {
                int var17 = this.field3518 * var16 + arg3;
                for (int var18 = arg3; var18 < arg5; var18++) {
                    if (arg7[var18 - arg3][var16 - arg4]) {
                        short[] var19 = this.field1948[var17];
                        if (var19 != null) {
                            for (int var20 = 0; var20 < var19.length; var20++) {
                                field1940.method1196(var19[var20] & 0xFFFF, (byte) -110);
                                var10++;
                            }
                        }
                    }
                    var17++;
                }
            }
        }
        if (var10 > 0) {
            class351 var21 = new class351(this.field1933, 5123, field1940.field2262, field1940.field2298);
            this.field1933.method312(var21, 4, 0, var10);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Llc;II)V")
    private final void method1017(class451 arg0, int arg1, int arg2) {
        int[] var4 = this.field1941[arg1][arg2];
        int[] var5 = this.field1946[arg1][arg2];
        int var6 = var4.length;
        if (field1945.length < var6) {
            field1945 = new int[var6];
            field1947 = new int[var6];
        }
        for (int var7 = 0; var7 < var6; var7++) {
            field1945[var7] = (var4[var7] & 0xFF) >> this.field1933.field570;
            field1947[var7] = (var5[var7] & 0xFF) >> this.field1933.field570;
        }
        int var8 = 0;
        while (var8 < var6) {
            int var9 = field1945[var8];
            int var10 = field1947[var8++];
            int var11 = field1945[var8];
            int var12 = field1947[var8++];
            int var13 = field1945[var8];
            int var14 = field1947[var8++];
            if ((var9 - var11) * (var12 - var14) - (var12 - var10) * (var13 - var11) > 0) {
                arg0.method2727(var13, var12, var10, (byte) -32, var9, var11, var14);
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILdh;)Ldh;")
    public final class183 method586(int arg0, int arg1, class183 arg2) {
        if ((this.field1953[arg0][arg1] & 0x1) == 0) {
            return null;
        }
        int var4 = this.field1943 >> this.field1933.field570;
        class451 var5 = (class451) arg2;
        class451 var6;
        if (var5 != null && var5.method2725(-1053994096, var4, var4)) {
            var6 = var5;
            var5.method2724((byte) -42);
        } else {
            var6 = new class451(this.field1933, var4, var4);
        }
        var6.method2728(var4, 0, 0, var4, (byte) 123);
        this.method1017(var6, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Lfu;IIII[[I[[II)V")
    public class140(class42 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4);
        this.field1933 = arg0;
        this.field1935 = arg5;
        this.field1931 = arg2;
        while (arg7 > 1) {
            this.field1952++;
            arg7 >>= 0x1;
        }
        this.field1943 = 0x1 << this.field1952;
        this.field1950 = new int[arg3][arg4][];
        this.field1949 = new class302[arg3][arg4][];
        this.field1941 = new int[arg3][arg4][];
        this.field1946 = new int[arg3][arg4][];
        this.field1937 = new int[arg3][arg4][];
        this.field1932 = new int[arg3][arg4][];
        this.field1948 = new short[arg3 * arg4][];
        this.field1953 = new byte[arg3][arg4];
        this.field1958 = new byte[arg3 + 1][arg4 + 1];
        this.field1966 = new float[this.field3518 + 1][this.field3517 + 1];
        this.field1957 = new float[this.field3518 + 1][this.field3517 + 1];
        this.field1960 = new float[this.field3518 + 1][this.field3517 + 1];
        for (int var9 = 1; var9 < this.field3517; var9++) {
            for (int var10 = 1; var10 < this.field3518; var10++) {
                int var11 = arg6[var10 + 1][var9] - arg6[var10 - 1][var9];
                int var12 = arg6[var10][var9 + 1] - arg6[var10][var9 - 1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + var11 * var11 + 65536)));
                this.field1966[var10][var9] = (float) var11 * var13;
                this.field1957[var10][var9] = var13 * -256.0F;
                this.field1960[var10][var9] = (float) var12 * var13;
            }
        }
        this.field1964 = new class155(128);
        if ((this.field1931 & 0x10) != 0) {
            this.field1939 = new class109(this.field1933, this);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lnq;[I)V")
    public final void method577(class104 arg0, int[] arg1) {
        this.field1938.method766(new class446(this.field1933, this, arg0, arg1), -1);
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(Ldh;IIIIZ)V")
    public final void method582(class183 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field1939 != null && arg0 != null) {
            int var7 = arg1 - (this.field1933.field588 * arg2 >> 8) >> this.field1933.field570;
            int var8 = arg3 - (this.field1933.field634 * arg2 >> 8) >> this.field1933.field570;
            this.field1939.method866((byte) 94, arg0, var7, var8);
        }
    }

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "(II)I")
    public final int method591(int arg0, int arg1) {
        return this.field1935[arg0][arg1];
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)V")
    public final void method576(int arg0, int arg1, int arg2) {
        if ((this.field1958[arg0][arg1] & 0xFF) < arg2) {
            this.field1958[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method578(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 == null ? null : new int[var18 * 3];
        int[] var26 = arg5 == null ? null : new int[var18 * 3];
        int var27 = 0;
        for (int var28 = 0; var28 < var18; var28++) {
            int var29 = arg6[var28];
            int var30 = arg7[var28];
            int var31 = arg8[var28];
            var19[var27] = arg2[var29];
            var20[var27] = arg4[var29];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
            if (arg3 != null) {
                var25[var27] = arg3[var29];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var29];
            }
            var27++;
            var19[var27] = arg2[var30];
            var20[var27] = arg4[var30];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
            if (arg3 != null) {
                var25[var27] = arg3[var30];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var30];
            }
            var27++;
            var19[var27] = arg2[var31];
            var20[var27] = arg4[var31];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            var27++;
        }
        this.method579(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()V")
    public final void method580() {
        if (this.field1959 > 0) {
            byte[][] var1 = new byte[this.field3518 + 1][this.field3517 + 1];
            for (int var2 = 1; var2 < this.field3518; var2++) {
                for (int var3 = 1; var3 < this.field3517; var3++) {
                    var1[var2][var3] = (byte) ((this.field1958[var2][var3] >> 1) + (this.field1958[var2][var3 + 1] >> 3) + (this.field1958[var2][var3 - 1] >> 2) + (this.field1958[var2 - 1][var3] >> 2) + (this.field1958[var2 + 1][var3] >> 3));
                }
            }
            this.field1955 = new class302[this.field1964.method1106(false)];
            this.field1964.method1096(this.field1955, (byte) 37);
            for (int var4 = 0; var4 < this.field1955.length; var4++) {
                this.field1955[var4].method1943(this.field1959, (byte) 45);
            }
            int var5 = 24;
            if (this.field1942 != null) {
                var5 += 4;
            }
            if ((this.field1931 & 0x7) != 0) {
                var5 += 12;
            }
            ByteBuffer var6 = ByteBuffer.allocateDirect(this.field1959 * var5).order(ByteOrder.nativeOrder());
            class302[] var7 = new class302[this.field1959];
            class155 var8 = new class155(class2.method10(-1, this.field1959));
            class302[] var9 = new class302[this.field1962];
            for (int var10 = 0; var10 < this.field3518; var10++) {
                for (int var11 = 0; var11 < this.field3517; var11++) {
                    if (this.field1937[var10][var11] != null) {
                        class302[] var12 = this.field1949[var10][var11];
                        int[] var13 = this.field1941[var10][var11];
                        int[] var14 = this.field1946[var10][var11];
                        int[] var15 = this.field1932[var10][var11];
                        int[] var16 = this.field1937[var10][var11];
                        int[] var17 = this.field1950 == null ? null : this.field1950[var10][var11];
                        int[] var18 = this.field1942 == null ? null : this.field1942[var10][var11];
                        if (var15 == null) {
                            var15 = var16;
                        }
                        float var19 = this.field1966[var10][var11];
                        float var20 = this.field1957[var10][var11];
                        float var21 = this.field1960[var10][var11];
                        float var22 = this.field1966[var10][var11 + 1];
                        float var23 = this.field1957[var10][var11 + 1];
                        float var24 = this.field1960[var10][var11 + 1];
                        float var25 = this.field1966[var10 + 1][var11 + 1];
                        float var26 = this.field1957[var10 + 1][var11 + 1];
                        float var27 = this.field1960[var10 + 1][var11 + 1];
                        float var28 = this.field1966[var10 + 1][var11];
                        float var29 = this.field1957[var10 + 1][var11];
                        float var30 = this.field1960[var10 + 1][var11];
                        int var31 = var1[var10][var11] & 0xFF;
                        int var32 = var1[var10][var11 + 1] & 0xFF;
                        int var33 = var1[var10 + 1][var11 + 1] & 0xFF;
                        int var34 = var1[var10 + 1][var11] & 0xFF;
                        int var35 = 0;
                        label314: for (int var36 = 0; var36 < var16.length; var36++) {
                            class302 var37 = var12[var36];
                            for (int var38 = 0; var38 < var35; var38++) {
                                if (var9[var38] == var37) {
                                    continue label314;
                                }
                            }
                            var9[var35++] = var37;
                        }
                        short[] var39 = this.field1948[this.field3518 * var11 + var10] = new short[var16.length];
                        for (int var40 = 0; var40 < var16.length; var40++) {
                            int var41 = (var10 << this.field1952) + var13[var40];
                            int var42 = (var11 << this.field1952) + var14[var40];
                            int var43 = var16[var40];
                            int var44 = var15[var40];
                            int var45 = var17 == null ? 0 : var17[var40];
                            long var46 = (long) var44 << 48 | (long) var43 << 32 | (long) (var41 << 16) | (long) var42;
                            int var48 = var13[var40];
                            int var49 = var14[var40];
                            byte var50 = 74;
                            int var51 = 0;
                            float var52 = 1.0F;
                            float var53;
                            float var54;
                            float var55;
                            int var56;
                            if (var48 == 0 && var49 == 0) {
                                var53 = var19;
                                var54 = var20;
                                var55 = var21;
                                var56 = var50 - var31;
                            } else if (var48 == 0 && this.field1943 == var49) {
                                var53 = var22;
                                var54 = var23;
                                var55 = var24;
                                var56 = var50 - var32;
                            } else if (this.field1943 == var48 && this.field1943 == var49) {
                                var53 = var25;
                                var54 = var26;
                                var55 = var27;
                                var56 = var50 - var33;
                            } else if (this.field1943 == var48 && var49 == 0) {
                                var53 = var28;
                                var54 = var29;
                                var55 = var30;
                                var56 = var50 - var34;
                            } else {
                                float var57 = (float) var48 / (float) this.field1943;
                                float var58 = (float) var49 / (float) this.field1943;
                                float var59 = (var28 - var19) * var57 + var19;
                                float var60 = (var29 - var20) * var57 + var20;
                                float var61 = (var30 - var21) * var57 + var21;
                                float var62 = (var25 - var22) * var57 + var22;
                                float var63 = (var26 - var23) * var57 + var23;
                                float var64 = (var27 - var24) * var57 + var24;
                                var53 = (var62 - var59) * var58 + var59;
                                var54 = (var63 - var60) * var58 + var60;
                                var55 = (var64 - var61) * var58 + var61;
                                int var65 = ((var34 - var31) * var48 >> this.field1952) + var31;
                                int var66 = ((var33 - var32) * var48 >> this.field1952) + var32;
                                var56 = var50 - (((var66 - var65) * var49 >> this.field1952) + var65);
                            }
                            if (var43 != -1) {
                                int var67 = (var43 & 0x7F) * var56 >> 7;
                                if (var67 < 2) {
                                    var67 = 2;
                                } else if (var67 > 126) {
                                    var67 = 126;
                                }
                                var51 = class439.field6229[var43 & 0xFF80 | var67];
                                if ((this.field1931 & 0x7) == 0) {
                                    float var68 = this.field1933.field675[2] * var55 + this.field1933.field675[0] * var53 + this.field1933.field675[1] * var54;
                                    var52 = this.field1933.field616 + var68 * (var68 > 0.0F ? this.field1933.field628 : this.field1933.field618);
                                }
                            }
                            class449 var69 = var8.method1104(-125, var46);
                            int var80;
                            if (var69 == null) {
                                int var71;
                                if (var43 == var44) {
                                    var71 = var51;
                                } else {
                                    int var70 = (var44 & 0x7F) * var56 >> 7;
                                    if (var70 < 2) {
                                        var70 = 2;
                                    } else if (var70 > 126) {
                                        var70 = 126;
                                    }
                                    var71 = class439.field6229[var44 & 0xFF80 | var70];
                                    if ((this.field1931 & 0x7) == 0) {
                                        float var72 = this.field1933.field675[2] * var55 + this.field1933.field675[0] * var53 + this.field1933.field675[1] * var54;
                                        float var73 = this.field1933.field616 + var52 * (var52 > 0.0F ? this.field1933.field628 : this.field1933.field618);
                                        int var74 = var71 >> 16 & 0xFF;
                                        int var75 = var71 >> 8 & 0xFF;
                                        int var76 = var71 & 0xFF;
                                        int var77 = (int) ((float) var74 * var73);
                                        if (var77 < 0) {
                                            var77 = 0;
                                        } else if (var77 > 255) {
                                            var77 = 255;
                                        }
                                        int var78 = (int) ((float) var75 * var73);
                                        if (var78 < 0) {
                                            var78 = 0;
                                        } else if (var78 > 255) {
                                            var78 = 255;
                                        }
                                        int var79 = (int) ((float) var76 * var73);
                                        if (var79 < 0) {
                                            var79 = 0;
                                        } else if (var79 > 255) {
                                            var79 = 255;
                                        }
                                        var71 = var77 << 16 | var78 << 8 | var79;
                                    }
                                }
                                var6.putFloat((float) var41);
                                var6.putFloat((float) (this.method590(var41, var42) + var45));
                                var6.putFloat((float) var42);
                                var6.put((byte) (var71 >> 16));
                                var6.put((byte) (var71 >> 8));
                                var6.put((byte) var71);
                                var6.put((byte) -1);
                                var6.putFloat((float) var41);
                                var6.putFloat((float) var42);
                                if (this.field1942 != null) {
                                    var6.putFloat(var18 == null ? 0.0F : (float) var18[var40]);
                                }
                                if ((this.field1931 & 0x7) != 0) {
                                    var6.putFloat(var53);
                                    var6.putFloat(var54);
                                    var6.putFloat(var55);
                                }
                                var80 = this.field1936++;
                                var39[var40] = (short) var80;
                                if (var43 != -1) {
                                    var7[var80] = var12[var40];
                                }
                                var8.method1100(new class434(var39[var40]), -113, var46);
                            } else {
                                var39[var40] = ((class434) var69).field6139;
                                var80 = var39[var40] & 0xFFFF;
                                if (var43 != -1 && var12[var40].field6382 < var7[var80].field6382) {
                                    var7[var80] = var12[var40];
                                }
                            }
                            for (int var81 = 0; var81 < var35; var81++) {
                                var9[var81].method1942(var56, var51, var52, var80, (byte) -69);
                            }
                            this.field1934++;
                        }
                    }
                }
            }
            for (int var82 = 0; var82 < this.field1936; var82++) {
                class302 var83 = var7[var82];
                if (var83 != null) {
                    var83.method1939((byte) -77, var82);
                }
            }
            for (int var84 = 0; var84 < this.field3518; var84++) {
                for (int var85 = 0; var85 < this.field3517; var85++) {
                    short[] var86 = this.field1948[this.field3518 * var85 + var84];
                    if (var86 != null) {
                        int var87 = 0;
                        int var88 = 0;
                        while (var88 < var86.length) {
                            int var89 = var86[var88++] & 0xFFFF;
                            int var90 = var86[var88++] & 0xFFFF;
                            int var91 = var86[var88++] & 0xFFFF;
                            class302 var92 = var7[var89];
                            class302 var93 = var7[var90];
                            class302 var94 = var7[var91];
                            class302 var95 = null;
                            if (var92 != null) {
                                var92.method1941(var85, (byte) -63, var87, var84);
                                var95 = var92;
                            }
                            if (var93 != null) {
                                var93.method1941(var85, (byte) -80, var87, var84);
                                if (var95 == null || var93.field6382 < var95.field6382) {
                                    var95 = var93;
                                }
                            }
                            if (var94 != null) {
                                var94.method1941(var85, (byte) -65, var87, var84);
                                if (var95 == null || var94.field6382 < var95.field6382) {
                                    var95 = var94;
                                }
                            }
                            if (var95 != null) {
                                if (var92 != null) {
                                    var95.method1939((byte) -77, var89);
                                }
                                if (var93 != null) {
                                    var95.method1939((byte) -77, var90);
                                }
                                if (var94 != null) {
                                    var95.method1939((byte) -77, var91);
                                }
                                var95.method1941(var85, (byte) -75, var87, var84);
                            }
                            var87++;
                        }
                    }
                }
            }
            var6.flip();
            this.field1965 = this.field1933.method434(var5, var6, false);
            this.field1967 = new class170(this.field1933, this.field1965, 5126, 3, 0);
            this.field1956 = new class170(this.field1933, this.field1965, 5121, 4, 12);
            byte var96;
            if (this.field1942 == null) {
                this.field1961 = new class170(this.field1933, this.field1965, 5126, 2, 16);
                var96 = 24;
            } else {
                this.field1961 = new class170(this.field1933, this.field1965, 5126, 3, 16);
                var96 = 28;
            }
            if ((this.field1931 & 0x7) != 0) {
                this.field1954 = new class170(this.field1933, this.field1965, 5126, 3, var96);
            }
            long[] var97 = new long[this.field1955.length];
            for (int var98 = 0; var98 < this.field1955.length; var98++) {
                class302 var99 = this.field1955[var98];
                var97[var98] = var99.field6382;
                var99.method1944(this.field1936, (byte) 0);
            }
            class211.method1434(this.field1955, (byte) -51, var97);
            if (this.field1939 != null) {
                this.field1939.method862((byte) 110);
            }
        } else {
            this.field1939 = null;
        }
        this.field1941 = this.field1946 = (int[][][]) null;
        this.field1942 = (int[][][]) null;
        this.field1932 = (int[][][]) null;
        this.field1950 = (int[][][]) null;
        this.field1949 = (class302[][][]) null;
        this.field1937 = (int[][][]) null;
        this.field1958 = (byte[][]) null;
        this.field1964 = null;
        this.field1966 = this.field1957 = this.field1960 = (float[][]) null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method579(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg5 != null && this.field1942 == null) {
            this.field1942 = new int[this.field3518][this.field3517][];
        }
        if (arg3 != null && this.field1950 == null) {
            this.field1950 = new int[this.field3518][this.field3517][];
        }
        this.field1941[arg0][arg1] = arg2;
        this.field1946[arg0][arg1] = arg4;
        this.field1937[arg0][arg1] = arg6;
        this.field1932[arg0][arg1] = arg7;
        if (this.field1942 != null) {
            this.field1942[arg0][arg1] = arg5;
        }
        if (this.field1950 != null) {
            this.field1950[arg0][arg1] = arg3;
        }
        class302[] var15 = this.field1949[arg0][arg1] = new class302[arg6.length];
        for (int var16 = 0; var16 < arg6.length; var16++) {
            long var17 = (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28 | (long) (arg9[var16] << 14) | (long) arg8[var16];
            class449 var19;
            for (var19 = this.field1964.method1104(-128, var17); var19 != null; var19 = this.field1964.method1099((byte) 97)) {
                class302 var20 = (class302) var19;
                if (arg8[var16] == var20.field4271 && (float) arg9[var16] == var20.field4270 && var20.field4267 == arg10 && var20.field4272 == arg11 && var20.field4273 == arg12) {
                    break;
                }
            }
            if (var19 == null) {
                var15[var16] = new class302(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field1964.method1100(var15[var16], -13, var17);
            } else {
                var15[var16] = (class302) var19;
            }
        }
        if (arg13) {
            this.field1953[arg0][arg1] = (byte) (this.field1953[arg0][arg1] | 0x1);
        }
        if (arg6.length > this.field1962) {
            this.field1962 = arg6.length;
        }
        this.field1959 += arg6.length;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(III[[ZZ)V")
    public final void method587(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        if (this.field1955 == null) {
            return;
        }
        float var6 = this.field1933.field691;
        float var7 = this.field1933.field594;
        int var8 = arg2 + arg2 + 1;
        int var9 = var8 * var8;
        if (field1963.length < var9) {
            field1963 = new int[var9];
        }
        if (field1940.field2262.length < this.field1934 * 2) {
            field1940 = new class161(this.field1934 * 2);
        }
        int var10 = arg0 - arg2;
        int var11 = var10;
        if (var10 < 0) {
            var10 = 0;
        }
        int var12 = arg1 - arg2;
        int var13 = var12;
        if (var12 < 0) {
            var12 = 0;
        }
        int var14 = arg0 + arg2;
        if (var14 > this.field3518 - 1) {
            var14 = this.field3518 - 1;
        }
        int var15 = arg1 + arg2;
        if (var15 > this.field3517 - 1) {
            var15 = this.field3517 - 1;
        }
        field1951 = 0;
        for (int var16 = var10; var16 <= var14; var16++) {
            boolean[] var17 = arg3[var16 - var11];
            for (int var18 = var12; var18 <= var15; var18++) {
                if (var17[var18 - var13]) {
                    field1963[field1951++] = this.field3518 * var18 + var16;
                }
            }
        }
        this.field1933.method290();
        this.field1933.method339((this.field1931 & 0x7) != 0);
        for (int var19 = 0; var19 < this.field1955.length; var19++) {
            this.field1955[var19].method1940(field1951, false, field1963);
        }
        if (!this.field1938.method765(-68)) {
            int var20 = this.field1933.field599;
            int var21 = this.field1933.field651;
            this.field1933.method296(0, var21);
            this.field1933.method378(var7, var6 - 4.0F);
            this.field1933.method339(false);
            this.field1933.method388(false);
            this.field1933.method349(130);
            this.field1933.method347(-2);
            this.field1933.method303(this.field1933.field615);
            this.field1933.method353(8448, 7681);
            this.field1933.method335(0, 34166, 770);
            this.field1933.method289(0, 34167, 770);
            for (class449 var22 = this.field1938.method775(1); var22 != null; var22 = this.field1938.method763(0)) {
                class446 var23 = (class446) var22;
                var23.method2705(arg1, -17263, arg0, arg3, arg2);
            }
            this.field1933.method335(0, 5890, 768);
            this.field1933.method289(0, 5890, 770);
            this.field1933.method303((class375) null);
            this.field1933.method296(var20, var21);
        }
        if (this.field1939 != null) {
            this.field1933.method378(var7, var6 - 8.0F);
            this.field1933.method290();
            this.field1933.method406(this.field1967, (class170) null, (class170) null, this.field1961);
            this.field1939.method864(arg0, arg3, -105, arg2, arg4, arg1);
        }
        this.field1933.method378(var7, var6);
    }
}
