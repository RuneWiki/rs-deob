import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class114 extends class265 {

    @OriginalMember(owner = "client!vj", name = "A", descriptor = "I")
    public int field2053 = 0;

    @OriginalMember(owner = "client!vj", name = "P", descriptor = "I")
    public int field2068 = 0;

    @OriginalMember(owner = "client!vj", name = "M", descriptor = "B")
    public byte field2065 = 0;

    @OriginalMember(owner = "client!vj", name = "db", descriptor = "Z")
    private boolean field2082 = false;

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "[I")
    public int[] field2041;

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "[I")
    public int[] field2042;

    @OriginalMember(owner = "client!vj", name = "Z", descriptor = "[I")
    public int[] field2078;

    @OriginalMember(owner = "client!vj", name = "G", descriptor = "[I")
    private int[] field2059;

    @OriginalMember(owner = "client!vj", name = "N", descriptor = "[I")
    public int[] field2066;

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "[I")
    public int[] field2044;

    @OriginalMember(owner = "client!vj", name = "I", descriptor = "[I")
    public int[] field2061;

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "[B")
    public byte[] field2048;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "[B")
    public byte[] field2038;

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "[B")
    public byte[] field2049;

    @OriginalMember(owner = "client!vj", name = "O", descriptor = "[S")
    public short[] field2067;

    @OriginalMember(owner = "client!vj", name = "X", descriptor = "[S")
    public short[] field2076;

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "[B")
    public byte[] field2046;

    @OriginalMember(owner = "client!vj", name = "bb", descriptor = "[I")
    private int[] field2080;

    @OriginalMember(owner = "client!vj", name = "T", descriptor = "[B")
    public byte[] field2072;

    @OriginalMember(owner = "client!vj", name = "J", descriptor = "[S")
    public short[] field2062;

    @OriginalMember(owner = "client!vj", name = "Q", descriptor = "[S")
    public short[] field2069;

    @OriginalMember(owner = "client!vj", name = "F", descriptor = "[S")
    public short[] field2058;

    @OriginalMember(owner = "client!vj", name = "K", descriptor = "[S")
    private short[] field2063;

    @OriginalMember(owner = "client!vj", name = "Y", descriptor = "[S")
    private short[] field2077;

    @OriginalMember(owner = "client!vj", name = "E", descriptor = "[S")
    private short[] field2057;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "[B")
    private byte[] field2035;

    @OriginalMember(owner = "client!vj", name = "D", descriptor = "[B")
    private byte[] field2056;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "[B")
    private byte[] field2039;

    @OriginalMember(owner = "client!vj", name = "U", descriptor = "[B")
    private byte[] field2073;

    @OriginalMember(owner = "client!vj", name = "S", descriptor = "[B")
    private byte[] field2071;

    @OriginalMember(owner = "client!vj", name = "y", descriptor = "I")
    public int field2051;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "[[I")
    public int[][] field2036;

    @OriginalMember(owner = "client!vj", name = "x", descriptor = "[[I")
    public int[][] field2050;

    @OriginalMember(owner = "client!vj", name = "H", descriptor = "[Ln;")
    public class16[] field2060;

    @OriginalMember(owner = "client!vj", name = "R", descriptor = "[Ldb;")
    public class17[] field2070;

    @OriginalMember(owner = "client!vj", name = "L", descriptor = "[Ln;")
    public class16[] field2064;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "S")
    public short field2037;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "S")
    public short field2040;

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "[I")
    private static int[] field2047 = new int[10000];

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "[I")
    private static int[] field2045 = class146.field2545;

    @OriginalMember(owner = "client!vj", name = "z", descriptor = "[I")
    private static int[] field2052 = new int[10000];

    @OriginalMember(owner = "client!vj", name = "W", descriptor = "I")
    private static int field2075 = 0;

    @OriginalMember(owner = "client!vj", name = "ab", descriptor = "[I")
    private static int[] field2079 = class146.field2541;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "S")
    private short field2034;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "S")
    private short field2043;

    @OriginalMember(owner = "client!vj", name = "B", descriptor = "S")
    private short field2054;

    @OriginalMember(owner = "client!vj", name = "C", descriptor = "S")
    private short field2055;

    @OriginalMember(owner = "client!vj", name = "V", descriptor = "S")
    private short field2074;

    @OriginalMember(owner = "client!vj", name = "cb", descriptor = "S")
    private short field2081;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "()V")
    private final void method804() {
        if (this.field2082) {
            return;
        }
        this.field2082 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field2068; var7++) {
            int var8 = this.field2041[var7];
            int var9 = this.field2042[var7];
            int var10 = this.field2078[var7];
            if (var8 < var1) {
                var1 = var8;
            }
            if (var8 > var4) {
                var4 = var8;
            }
            if (var9 < var2) {
                var2 = var9;
            }
            if (var9 > var5) {
                var5 = var9;
            }
            if (var10 < var3) {
                var3 = var10;
            }
            if (var10 > var6) {
                var6 = var10;
            }
        }
        this.field2054 = (short) var1;
        this.field2055 = (short) var4;
        this.field2043 = (short) var2;
        this.field2074 = (short) var5;
        this.field2081 = (short) var3;
        this.field2034 = (short) var6;
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "()Lvj;")
    public final class114 method805() {
        class114 var1 = new class114();
        if (this.field2048 != null) {
            var1.field2048 = new byte[this.field2053];
            for (int var2 = 0; var2 < this.field2053; var2++) {
                var1.field2048[var2] = this.field2048[var2];
            }
        }
        var1.field2068 = this.field2068;
        var1.field2053 = this.field2053;
        var1.field2051 = this.field2051;
        var1.field2041 = this.field2041;
        var1.field2042 = this.field2042;
        var1.field2078 = this.field2078;
        var1.field2066 = this.field2066;
        var1.field2044 = this.field2044;
        var1.field2061 = this.field2061;
        var1.field2038 = this.field2038;
        var1.field2049 = this.field2049;
        var1.field2046 = this.field2046;
        var1.field2067 = this.field2067;
        var1.field2076 = this.field2076;
        var1.field2065 = this.field2065;
        var1.field2072 = this.field2072;
        var1.field2062 = this.field2062;
        var1.field2069 = this.field2069;
        var1.field2058 = this.field2058;
        var1.field2063 = this.field2063;
        var1.field2077 = this.field2077;
        var1.field2057 = this.field2057;
        var1.field2035 = this.field2035;
        var1.field2056 = this.field2056;
        var1.field2039 = this.field2039;
        var1.field2073 = this.field2073;
        var1.field2071 = this.field2071;
        var1.field2059 = this.field2059;
        var1.field2080 = this.field2080;
        var1.field2036 = this.field2036;
        var1.field2050 = this.field2050;
        var1.field2060 = this.field2060;
        var1.field2070 = this.field2070;
        var1.field2037 = this.field2037;
        var1.field2040 = this.field2040;
        return var1;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(IIIII)Lik;")
    public final class256 method806(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class239(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II[[I[[IIIIZZ)Lvj;")
    public final class114 method807(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method804();
        int var10 = this.field2054 + arg4;
        int var11 = this.field2055 + arg4;
        int var12 = this.field2081 + arg6;
        int var13 = this.field2034 + arg6;
        if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (var10 < 0 || var11 + 128 >> 7 >= arg2.length || var12 < 0 || var13 + 128 >> 7 >= arg2[0].length)) {
            return this;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return this;
            }
            if (var10 < 0 || var11 + 128 >> 7 >= arg3.length || var12 < 0 || var13 + 128 >> 7 >= arg3[0].length) {
                return this;
            }
        } else {
            int var14 = var10 >> 7;
            int var15 = var11 + 127 >> 7;
            int var16 = var12 >> 7;
            int var17 = var13 + 127 >> 7;
            if (arg2[var14][var16] == arg5 && arg2[var15][var16] == arg5 && arg2[var14][var17] == arg5 && arg2[var15][var17] == arg5) {
                return this;
            }
        }
        class114 var18;
        if (arg7) {
            var18 = new class114();
            var18.field2068 = this.field2068;
            var18.field2053 = this.field2053;
            var18.field2051 = this.field2051;
            var18.field2066 = this.field2066;
            var18.field2044 = this.field2044;
            var18.field2061 = this.field2061;
            var18.field2048 = this.field2048;
            var18.field2038 = this.field2038;
            var18.field2049 = this.field2049;
            var18.field2046 = this.field2046;
            var18.field2067 = this.field2067;
            var18.field2076 = this.field2076;
            var18.field2065 = this.field2065;
            var18.field2072 = this.field2072;
            var18.field2062 = this.field2062;
            var18.field2069 = this.field2069;
            var18.field2058 = this.field2058;
            var18.field2063 = this.field2063;
            var18.field2077 = this.field2077;
            var18.field2057 = this.field2057;
            var18.field2035 = this.field2035;
            var18.field2056 = this.field2056;
            var18.field2039 = this.field2039;
            var18.field2073 = this.field2073;
            var18.field2071 = this.field2071;
            var18.field2059 = this.field2059;
            var18.field2080 = this.field2080;
            var18.field2036 = this.field2036;
            var18.field2050 = this.field2050;
            var18.field2037 = this.field2037;
            var18.field2040 = this.field2040;
            var18.field2060 = this.field2060;
            var18.field2070 = this.field2070;
            var18.field2064 = this.field2064;
            if (arg0 == 3) {
                var18.field2041 = class50.method371(0, this.field2041);
                var18.field2042 = class50.method371(0, this.field2042);
                var18.field2078 = class50.method371(0, this.field2078);
            } else {
                var18.field2041 = this.field2041;
                var18.field2042 = new int[var18.field2068];
                var18.field2078 = this.field2078;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field2068; var19++) {
                int var20 = this.field2041[var19] + arg4;
                int var21 = this.field2078[var19] + arg6;
                int var22 = var20 & 0x7F;
                int var23 = var21 & 0x7F;
                int var24 = var20 >> 7;
                int var25 = var21 >> 7;
                int var26 = (128 - var22) * arg2[var24][var25] + arg2[var24 + 1][var25] * var22 >> 7;
                int var27 = (128 - var22) * arg2[var24][var25 + 1] + arg2[var24 + 1][var25 + 1] * var22 >> 7;
                int var28 = (128 - var23) * var26 + var23 * var27 >> 7;
                var18.field2042[var19] = this.field2042[var19] + var28 - arg5;
            }
        } else if (arg0 == 2) {
            for (int var29 = 0; var29 < var18.field2068; var29++) {
                int var30 = (this.field2042[var29] << 16) / this.field2043;
                if (var30 < arg1) {
                    int var31 = this.field2041[var29] + arg4;
                    int var32 = this.field2078[var29] + arg6;
                    int var33 = var31 & 0x7F;
                    int var34 = var32 & 0x7F;
                    int var35 = var31 >> 7;
                    int var36 = var32 >> 7;
                    int var37 = (128 - var33) * arg2[var35][var36] + arg2[var35 + 1][var36] * var33 >> 7;
                    int var38 = (128 - var33) * arg2[var35][var36 + 1] + arg2[var35 + 1][var36 + 1] * var33 >> 7;
                    int var39 = (128 - var34) * var37 + var34 * var38 >> 7;
                    var18.field2042[var29] = (arg1 - var30) * (var39 - arg5) / arg1 + this.field2042[var29];
                } else {
                    var18.field2042[var29] = this.field2042[var29];
                }
            }
        } else if (arg0 == 3) {
            int var40 = (arg1 & 0xFF) * 4;
            int var41 = (arg1 >> 8 & 0xFF) * 4;
            this.method826(arg2, arg4, arg5, arg6, var40, var41);
        } else if (arg0 == 4) {
            int var42 = this.field2074 - this.field2043;
            for (int var43 = 0; var43 < this.field2068; var43++) {
                int var44 = this.field2041[var43] + arg4;
                int var45 = this.field2078[var43] + arg6;
                int var46 = var44 & 0x7F;
                int var47 = var45 & 0x7F;
                int var48 = var44 >> 7;
                int var49 = var45 >> 7;
                int var50 = (128 - var46) * arg3[var48][var49] + arg3[var48 + 1][var49] * var46 >> 7;
                int var51 = (128 - var46) * arg3[var48][var49 + 1] + arg3[var48 + 1][var49 + 1] * var46 >> 7;
                int var52 = (128 - var47) * var50 + var47 * var51 >> 7;
                var18.field2042[var43] = var52 + this.field2042[var43] + var42 - arg5;
            }
        } else if (arg0 == 5) {
            int var53 = this.field2074 - this.field2043;
            for (int var54 = 0; var54 < this.field2068; var54++) {
                int var55 = this.field2041[var54] + arg4;
                int var56 = this.field2078[var54] + arg6;
                int var57 = var55 & 0x7F;
                int var58 = var56 & 0x7F;
                int var59 = var55 >> 7;
                int var60 = var56 >> 7;
                int var61 = (128 - var57) * arg2[var59][var60] + arg2[var59 + 1][var60] * var57 >> 7;
                int var62 = (128 - var57) * arg2[var59][var60 + 1] + arg2[var59 + 1][var60 + 1] * var57 >> 7;
                int var63 = (128 - var58) * var61 + var58 * var62 >> 7;
                int var64 = (128 - var57) * arg3[var59][var60] + arg3[var59 + 1][var60] * var57 >> 7;
                int var65 = (128 - var57) * arg3[var59][var60 + 1] + arg3[var59 + 1][var60 + 1] * var57 >> 7;
                int var66 = (128 - var58) * var64 + var58 * var65 >> 7;
                int var67 = var63 - var66;
                var18.field2042[var54] = ((this.field2042[var54] << 8) / var53 * var67 >> 8) - (arg5 - var63);
            }
        }
        if (arg8) {
            var18.method809();
        } else {
            this.field2082 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(III)V")
    public final void method808(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2068; var4++) {
            this.field2041[var4] = this.field2041[var4] * arg0 / 128;
            this.field2042[var4] = this.field2042[var4] * arg1 / 128;
            this.field2078[var4] = this.field2078[var4] * arg2 / 128;
        }
        this.method809();
    }

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "()V")
    private final void method809() {
        this.field2060 = null;
        this.field2064 = null;
        this.field2070 = null;
        this.field2082 = false;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lvj;IS)I")
    private final int method810(class114 arg0, int arg1, short arg2) {
        int var4 = arg0.field2041[arg1];
        int var5 = arg0.field2042[arg1];
        int var6 = arg0.field2078[arg1];
        for (int var7 = 0; var7 < this.field2068; var7++) {
            if (this.field2041[var7] == var4 && this.field2042[var7] == var5 && this.field2078[var7] == var6) {
                return var7;
            }
        }
        this.field2041[this.field2068] = var4;
        this.field2042[this.field2068] = var5;
        this.field2078[this.field2068] = var6;
        if (arg0.field2059 != null) {
            this.field2059[this.field2068] = arg0.field2059[arg1];
        }
        return this.field2068++;
    }

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "()V")
    public static void method811() {
        field2052 = null;
        field2047 = null;
        field2045 = null;
        field2079 = null;
    }

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "()V")
    public final void method812() {
        this.field2059 = null;
        this.field2080 = null;
        this.field2036 = null;
        this.field2050 = null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
    private final void method813(int arg0) {
        int var2 = field2045[arg0];
        int var3 = field2079[arg0];
        for (int var4 = 0; var4 < this.field2068; var4++) {
            int var5 = this.field2042[var4] * var2 + this.field2041[var4] * var3 >> 16;
            this.field2042[var4] = this.field2042[var4] * var3 - this.field2041[var4] * var2 >> 16;
            this.field2041[var4] = var5;
        }
        this.method809();
    }

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "()V")
    public final void method814() {
        for (int var1 = 0; var1 < this.field2068; var1++) {
            int var2 = this.field2078[var1];
            this.field2078[var1] = this.field2041[var1];
            this.field2041[var1] = -var2;
        }
        this.method809();
    }

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "()V")
    public final void method815() {
        for (int var1 = 0; var1 < this.field2068; var1++) {
            this.field2078[var1] = -this.field2078[var1];
        }
        for (int var2 = 0; var2 < this.field2053; var2++) {
            int var3 = this.field2066[var2];
            this.field2066[var2] = this.field2061[var2];
            this.field2061[var2] = var3;
        }
        this.method809();
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "()I")
    public final int method426() {
        if (!this.field2082) {
            this.method804();
        }
        return this.field2043;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "([[III)I")
    private static final int method816(int[][] arg0, int arg1, int arg2) {
        int var3 = arg1 >> 7;
        int var4 = arg2 >> 7;
        if (var3 < 0 || var4 < 0 || var3 >= arg0.length || var4 >= arg0[0].length) {
            return 0;
        }
        int var5 = arg1 & 0x7F;
        int var6 = arg2 & 0x7F;
        int var7 = (128 - var5) * arg0[var3][var4] + arg0[var3 + 1][var4] * var5 >> 7;
        int var8 = (128 - var5) * arg0[var3][var4 + 1] + arg0[var3 + 1][var4 + 1] * var5 >> 7;
        return (128 - var6) * var7 + var6 * var8 >> 7;
    }

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "()V")
    public final void method817() {
        for (int var1 = 0; var1 < this.field2068; var1++) {
            int var2 = this.field2041[var1];
            this.field2041[var1] = this.field2078[var1];
            this.field2078[var1] = -var2;
        }
        this.method809();
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(SS)V")
    public final void method818(short arg0, short arg1) {
        if (this.field2076 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2053; var3++) {
            if (this.field2076[var3] == arg0) {
                this.field2076[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ltg;II)Lvj;")
    public static final class114 method819(class180 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1258(arg1, arg2, (byte) 99);
        return var3 == null ? null : new class114(var3);
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(IIIII)Lci;")
    public final class239 method820(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class239(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "()V")
    public final void method821() {
        for (int var1 = 0; var1 < this.field2068; var1++) {
            this.field2041[var1] = -this.field2041[var1];
            this.field2078[var1] = -this.field2078[var1];
        }
        this.method809();
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(III)V")
    public final void method822(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2068; var4++) {
            this.field2041[var4] += arg0;
            this.field2042[var4] += arg1;
            this.field2078[var4] += arg2;
        }
        this.method809();
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIIIIJILla;)V")
    public final void method427(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class95 arg10) {
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)V")
    public final void method823(int arg0) {
        int var2 = field2045[arg0];
        int var3 = field2079[arg0];
        for (int var4 = 0; var4 < this.field2068; var4++) {
            int var5 = this.field2078[var4] * var2 + this.field2041[var4] * var3 >> 16;
            this.field2078[var4] = this.field2078[var4] * var3 - this.field2041[var4] * var2 >> 16;
            this.field2041[var4] = var5;
        }
        this.method809();
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "([B)V")
    private final void method824(byte[] arg0) {
        class25 var2 = new class25(arg0);
        class25 var3 = new class25(arg0);
        class25 var4 = new class25(arg0);
        class25 var5 = new class25(arg0);
        class25 var6 = new class25(arg0);
        class25 var7 = new class25(arg0);
        class25 var8 = new class25(arg0);
        var2.field481 = arg0.length - 23;
        int var9 = var2.method193((byte) 77);
        int var10 = var2.method193((byte) 77);
        int var11 = var2.method189((byte) -103);
        int var12 = var2.method189((byte) -103);
        boolean var13 = (var12 & 0x1) == 1;
        boolean var14 = (var12 & 0x2) == 2;
        int var15 = var2.method189((byte) -103);
        int var16 = var2.method189((byte) -103);
        int var17 = var2.method189((byte) -103);
        int var18 = var2.method189((byte) -103);
        int var19 = var2.method189((byte) -103);
        int var20 = var2.method193((byte) 77);
        int var21 = var2.method193((byte) 77);
        int var22 = var2.method193((byte) 77);
        int var23 = var2.method193((byte) 77);
        int var24 = var2.method193((byte) 77);
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (var11 > 0) {
            this.field2072 = new byte[var11];
            var2.field481 = 0;
            for (int var28 = 0; var28 < var11; var28++) {
                byte var29 = this.field2072[var28] = var2.method200(32768);
                if (var29 == 0) {
                    var25++;
                }
                if (var29 >= 1 && var29 <= 3) {
                    var26++;
                }
                if (var29 == 2) {
                    var27++;
                }
            }
        }
        int var32 = var9 + var11;
        int var33 = var32;
        if (var13) {
            var32 += var10;
        }
        int var35 = var10 + var32;
        int var36 = var35;
        if (var15 == 255) {
            var35 += var10;
        }
        int var37 = var35;
        if (var17 == 1) {
            var35 += var10;
        }
        int var38 = var35;
        if (var19 == 1) {
            var35 += var9;
        }
        int var39 = var35;
        if (var16 == 1) {
            var35 += var10;
        }
        int var41 = var23 + var35;
        int var42 = var41;
        if (var18 == 1) {
            var41 += var10 * 2;
        }
        int var44 = var24 + var41;
        int var46 = var10 * 2 + var44;
        int var48 = var20 + var46;
        int var50 = var21 + var48;
        int var52 = var22 + var50;
        int var54 = var25 * 6 + var52;
        int var56 = var26 * 6 + var54;
        int var58 = var26 * 6 + var56;
        int var60 = var26 + var58;
        int var62 = var26 + var60;
        int var64 = var27 * 2 + var26 + var62;
        this.field2068 = var9;
        this.field2053 = var10;
        this.field2051 = var11;
        this.field2041 = new int[var9];
        this.field2042 = new int[var9];
        this.field2078 = new int[var9];
        this.field2066 = new int[var10];
        this.field2044 = new int[var10];
        this.field2061 = new int[var10];
        if (var19 == 1) {
            this.field2059 = new int[var9];
        }
        if (var13) {
            this.field2048 = new byte[var10];
        }
        if (var15 == 255) {
            this.field2038 = new byte[var10];
        } else {
            this.field2065 = (byte) var15;
        }
        if (var16 == 1) {
            this.field2049 = new byte[var10];
        }
        if (var17 == 1) {
            this.field2080 = new int[var10];
        }
        if (var18 == 1) {
            this.field2076 = new short[var10];
        }
        if (var18 == 1 && var11 > 0) {
            this.field2046 = new byte[var10];
        }
        this.field2067 = new short[var10];
        if (var11 > 0) {
            this.field2062 = new short[var11];
            this.field2069 = new short[var11];
            this.field2058 = new short[var11];
            if (var26 > 0) {
                this.field2063 = new short[var26];
                this.field2077 = new short[var26];
                this.field2057 = new short[var26];
                this.field2035 = new byte[var26];
                this.field2056 = new byte[var26];
                this.field2039 = new byte[var26];
            }
            if (var27 > 0) {
                this.field2073 = new byte[var27];
                this.field2071 = new byte[var27];
            }
        }
        var2.field481 = var11;
        var3.field481 = var46;
        var4.field481 = var48;
        var5.field481 = var50;
        var6.field481 = var38;
        int var66 = 0;
        int var67 = 0;
        int var68 = 0;
        for (int var69 = 0; var69 < var9; var69++) {
            int var84 = var2.method189((byte) -103);
            int var85 = 0;
            if ((var84 & 0x1) != 0) {
                var85 = var3.method204(113);
            }
            int var86 = 0;
            if ((var84 & 0x2) != 0) {
                var86 = var4.method204(-38);
            }
            int var87 = 0;
            if ((var84 & 0x4) != 0) {
                var87 = var5.method204(106);
            }
            this.field2041[var69] = var66 + var85;
            this.field2042[var69] = var67 + var86;
            this.field2078[var69] = var68 + var87;
            var66 = this.field2041[var69];
            var67 = this.field2042[var69];
            var68 = this.field2078[var69];
            if (var19 == 1) {
                this.field2059[var69] = var6.method189((byte) -103);
            }
        }
        var2.field481 = var44;
        var3.field481 = var33;
        var4.field481 = var36;
        var5.field481 = var39;
        var6.field481 = var37;
        var7.field481 = var42;
        var8.field481 = var41;
        for (int var70 = 0; var70 < var10; var70++) {
            this.field2067[var70] = (short) var2.method193((byte) 77);
            if (var13) {
                this.field2048[var70] = var3.method200(32768);
            }
            if (var15 == 255) {
                this.field2038[var70] = var4.method200(32768);
            }
            if (var16 == 1) {
                this.field2049[var70] = var5.method200(32768);
            }
            if (var17 == 1) {
                this.field2080[var70] = var6.method189((byte) -103);
            }
            if (var18 == 1) {
                this.field2076[var70] = (short) (var7.method193((byte) 77) - 1);
            }
            if (this.field2046 != null) {
                if (this.field2076[var70] == -1) {
                    this.field2046[var70] = -1;
                } else {
                    this.field2046[var70] = (byte) (var8.method189((byte) -103) - 1);
                }
            }
        }
        var2.field481 = var35;
        var3.field481 = var32;
        int var71 = 0;
        int var72 = 0;
        int var73 = 0;
        int var74 = 0;
        for (int var75 = 0; var75 < var10; var75++) {
            int var80 = var3.method189((byte) -103);
            if (var80 == 1) {
                var71 = var2.method204(-81) + var74;
                var72 = var2.method204(104) + var71;
                var73 = var2.method204(-66) + var72;
                var74 = var73;
                this.field2066[var75] = var71;
                this.field2044[var75] = var72;
                this.field2061[var75] = var73;
            }
            if (var80 == 2) {
                var72 = var73;
                var73 = var2.method204(-77) + var74;
                var74 = var73;
                this.field2066[var75] = var71;
                this.field2044[var75] = var72;
                this.field2061[var75] = var73;
            }
            if (var80 == 3) {
                var71 = var73;
                var73 = var2.method204(-99) + var74;
                var74 = var73;
                this.field2066[var75] = var71;
                this.field2044[var75] = var72;
                this.field2061[var75] = var73;
            }
            if (var80 == 4) {
                int var83 = var71;
                var71 = var72;
                var72 = var83;
                var73 = var2.method204(118) + var74;
                var74 = var73;
                this.field2066[var75] = var71;
                this.field2044[var75] = var83;
                this.field2061[var75] = var73;
            }
        }
        var2.field481 = var52;
        var3.field481 = var54;
        var4.field481 = var56;
        var5.field481 = var58;
        var6.field481 = var60;
        var7.field481 = var62;
        for (int var76 = 0; var76 < var11; var76++) {
            int var79 = this.field2072[var76] & 0xFF;
            if (var79 == 0) {
                this.field2062[var76] = (short) var2.method193((byte) 77);
                this.field2069[var76] = (short) var2.method193((byte) 77);
                this.field2058[var76] = (short) var2.method193((byte) 77);
            }
            if (var79 == 1) {
                this.field2062[var76] = (short) var3.method193((byte) 77);
                this.field2069[var76] = (short) var3.method193((byte) 77);
                this.field2058[var76] = (short) var3.method193((byte) 77);
                this.field2063[var76] = (short) var4.method193((byte) 77);
                this.field2077[var76] = (short) var4.method193((byte) 77);
                this.field2057[var76] = (short) var4.method193((byte) 77);
                this.field2035[var76] = var5.method200(32768);
                this.field2056[var76] = var6.method200(32768);
                this.field2039[var76] = var7.method200(32768);
            }
            if (var79 == 2) {
                this.field2062[var76] = (short) var3.method193((byte) 77);
                this.field2069[var76] = (short) var3.method193((byte) 77);
                this.field2058[var76] = (short) var3.method193((byte) 77);
                this.field2063[var76] = (short) var4.method193((byte) 77);
                this.field2077[var76] = (short) var4.method193((byte) 77);
                this.field2057[var76] = (short) var4.method193((byte) 77);
                this.field2035[var76] = var5.method200(32768);
                this.field2056[var76] = var6.method200(32768);
                this.field2039[var76] = var7.method200(32768);
                this.field2073[var76] = var7.method200(32768);
                this.field2071[var76] = var7.method200(32768);
            }
            if (var79 == 3) {
                this.field2062[var76] = (short) var3.method193((byte) 77);
                this.field2069[var76] = (short) var3.method193((byte) 77);
                this.field2058[var76] = (short) var3.method193((byte) 77);
                this.field2063[var76] = (short) var4.method193((byte) 77);
                this.field2077[var76] = (short) var4.method193((byte) 77);
                this.field2057[var76] = (short) var4.method193((byte) 77);
                this.field2035[var76] = var5.method200(32768);
                this.field2056[var76] = var6.method200(32768);
                this.field2039[var76] = var7.method200(32768);
            }
        }
        if (!var14) {
            return;
        }
        var2.field481 = var64;
        int var77 = var2.method189((byte) -103);
        if (var77 > 0) {
            var2.field481 += var77 * 4;
        }
        int var78 = var2.method189((byte) -103);
        if (var78 > 0) {
            var2.field481 += var78 * 4;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "()Z")
    public final boolean method825() {
        return true;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "([[IIIIII)V")
    private final void method826(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method816(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method816(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method816(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method816(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method833(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method813(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method822(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIII)V")
    public final void method429(int arg0, int arg1, int arg2, int arg3, int arg4) {
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lrk;IIIZ)V")
    public final void method827(class265 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class114 var6 = (class114) arg0;
        var6.method804();
        var6.method829();
        field2075++;
        int var7 = 0;
        int[] var8 = var6.field2041;
        int var9 = var6.field2068;
        for (int var10 = 0; var10 < this.field2068; var10++) {
            class16 var13 = this.field2060[var10];
            if (var13.field301 != 0) {
                int var14 = this.field2042[var10] - arg2;
                if (var14 >= var6.field2043 && var14 <= var6.field2074) {
                    int var15 = this.field2041[var10] - arg1;
                    if (var15 >= var6.field2054 && var15 <= var6.field2055) {
                        int var16 = this.field2078[var10] - arg3;
                        if (var16 >= var6.field2081 && var16 <= var6.field2034) {
                            for (int var17 = 0; var17 < var9; var17++) {
                                class16 var18 = var6.field2060[var17];
                                if (var8[var17] == var15 && var6.field2078[var17] == var16 && var6.field2042[var17] == var14 && var18.field301 != 0) {
                                    if (this.field2064 == null) {
                                        this.field2064 = new class16[this.field2068];
                                    }
                                    if (var6.field2064 == null) {
                                        var6.field2064 = new class16[var9];
                                    }
                                    class16 var19 = this.field2064[var10];
                                    if (var19 == null) {
                                        var19 = this.field2064[var10] = new class16(var13);
                                    }
                                    class16 var20 = var6.field2064[var17];
                                    if (var20 == null) {
                                        var20 = var6.field2064[var17] = new class16(var18);
                                    }
                                    var19.field307 += var18.field307;
                                    var19.field300 += var18.field300;
                                    var19.field311 += var18.field311;
                                    var19.field301 += var18.field301;
                                    var20.field307 += var13.field307;
                                    var20.field300 += var13.field300;
                                    var20.field311 += var13.field311;
                                    var20.field301 += var13.field301;
                                    var7++;
                                    field2052[var10] = field2075;
                                    field2047[var17] = field2075;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var7 < 3 || !arg4) {
            return;
        }
        for (int var11 = 0; var11 < this.field2053; var11++) {
            if (field2052[this.field2066[var11]] == field2075 && field2052[this.field2044[var11]] == field2075 && field2052[this.field2061[var11]] == field2075) {
                if (this.field2048 == null) {
                    this.field2048 = new byte[this.field2053];
                }
                this.field2048[var11] = 2;
            }
        }
        for (int var12 = 0; var12 < var6.field2053; var12++) {
            if (field2047[var6.field2066[var12]] == field2075 && field2047[var6.field2044[var12]] == field2075 && field2047[var6.field2061[var12]] == field2075) {
                if (var6.field2048 == null) {
                    var6.field2048 = new byte[var6.field2053];
                }
                var6.field2048[var12] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(III)Lrk;")
    public final class265 method828(int arg0, int arg1, int arg2) {
        return this.method806(this.field2037, this.field2040, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "()V")
    public final void method829() {
        if (this.field2060 != null) {
            return;
        }
        this.field2060 = new class16[this.field2068];
        for (int var1 = 0; var1 < this.field2068; var1++) {
            this.field2060[var1] = new class16();
        }
        for (int var2 = 0; var2 < this.field2053; var2++) {
            int var3 = this.field2066[var2];
            int var4 = this.field2044[var2];
            int var5 = this.field2061[var2];
            int var6 = this.field2041[var4] - this.field2041[var3];
            int var7 = this.field2042[var4] - this.field2042[var3];
            int var8 = this.field2078[var4] - this.field2078[var3];
            int var9 = this.field2041[var5] - this.field2041[var3];
            int var10 = this.field2042[var5] - this.field2042[var3];
            int var11 = this.field2078[var5] - this.field2078[var3];
            int var12 = var7 * var11 - var8 * var10;
            int var13 = var8 * var9 - var6 * var11;
            int var14;
            for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 0x1) {
                var12 >>= 0x1;
                var13 >>= 0x1;
            }
            int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
            if (var15 <= 0) {
                var15 = 1;
            }
            int var16 = var12 * 256 / var15;
            int var17 = var13 * 256 / var15;
            int var18 = var14 * 256 / var15;
            byte var19;
            if (this.field2048 == null) {
                var19 = 0;
            } else {
                var19 = this.field2048[var2];
            }
            if (var19 == 0) {
                class16 var20 = this.field2060[var3];
                var20.field307 += var16;
                var20.field300 += var17;
                var20.field311 += var18;
                var20.field301++;
                class16 var21 = this.field2060[var4];
                var21.field307 += var16;
                var21.field300 += var17;
                var21.field311 += var18;
                var21.field301++;
                class16 var22 = this.field2060[var5];
                var22.field307 += var16;
                var22.field300 += var17;
                var22.field311 += var18;
                var22.field301++;
            } else if (var19 == 1) {
                if (this.field2070 == null) {
                    this.field2070 = new class17[this.field2053];
                }
                class17 var23 = this.field2070[var2] = new class17();
                var23.field317 = var16;
                var23.field312 = var17;
                var23.field322 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIBSB)I")
    public final int method830(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field2066[this.field2053] = arg0;
        this.field2044[this.field2053] = arg1;
        this.field2061[this.field2053] = arg2;
        this.field2048[this.field2053] = arg3;
        this.field2046[this.field2053] = -1;
        this.field2067[this.field2053] = arg4;
        this.field2076[this.field2053] = -1;
        this.field2049[this.field2053] = arg5;
        return this.field2053++;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "([B)V")
    private final void method831(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class25 var4 = new class25(arg0);
        class25 var5 = new class25(arg0);
        class25 var6 = new class25(arg0);
        class25 var7 = new class25(arg0);
        class25 var8 = new class25(arg0);
        var4.field481 = arg0.length - 18;
        int var9 = var4.method193((byte) 77);
        int var10 = var4.method193((byte) 77);
        int var11 = var4.method189((byte) -103);
        int var12 = var4.method189((byte) -103);
        int var13 = var4.method189((byte) -103);
        int var14 = var4.method189((byte) -103);
        int var15 = var4.method189((byte) -103);
        int var16 = var4.method189((byte) -103);
        int var17 = var4.method193((byte) 77);
        int var18 = var4.method193((byte) 77);
        int var19 = var4.method193((byte) 77);
        int var20 = var4.method193((byte) 77);
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field2068 = var9;
        this.field2053 = var10;
        this.field2051 = var11;
        this.field2041 = new int[var9];
        this.field2042 = new int[var9];
        this.field2078 = new int[var9];
        this.field2066 = new int[var10];
        this.field2044 = new int[var10];
        this.field2061 = new int[var10];
        if (var11 > 0) {
            this.field2072 = new byte[var11];
            this.field2062 = new short[var11];
            this.field2069 = new short[var11];
            this.field2058 = new short[var11];
        }
        if (var16 == 1) {
            this.field2059 = new int[var9];
        }
        if (var12 == 1) {
            this.field2048 = new byte[var10];
            this.field2046 = new byte[var10];
            this.field2076 = new short[var10];
        }
        if (var13 == 255) {
            this.field2038 = new byte[var10];
        } else {
            this.field2065 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2049 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2080 = new int[var10];
        }
        this.field2067 = new short[var10];
        var4.field481 = var21;
        var5.field481 = var36;
        var6.field481 = var38;
        var7.field481 = var40;
        var8.field481 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var62 = var4.method189((byte) -103);
            int var63 = 0;
            if ((var62 & 0x1) != 0) {
                var63 = var5.method204(102);
            }
            int var64 = 0;
            if ((var62 & 0x2) != 0) {
                var64 = var6.method204(-14);
            }
            int var65 = 0;
            if ((var62 & 0x4) != 0) {
                var65 = var7.method204(110);
            }
            this.field2041[var46] = var43 + var63;
            this.field2042[var46] = var44 + var64;
            this.field2078[var46] = var45 + var65;
            var43 = this.field2041[var46];
            var44 = this.field2042[var46];
            var45 = this.field2078[var46];
            if (var16 == 1) {
                this.field2059[var46] = var8.method189((byte) -103);
            }
        }
        var4.field481 = var32;
        var5.field481 = var28;
        var6.field481 = var26;
        var7.field481 = var30;
        var8.field481 = var27;
        for (int var47 = 0; var47 < var10; var47++) {
            this.field2067[var47] = (short) var4.method193((byte) 77);
            if (var12 == 1) {
                int var61 = var5.method189((byte) -103);
                if ((var61 & 0x1) == 1) {
                    this.field2048[var47] = 1;
                    var2 = true;
                } else {
                    this.field2048[var47] = 0;
                }
                if ((var61 & 0x2) == 2) {
                    this.field2046[var47] = (byte) (var61 >> 2);
                    this.field2076[var47] = this.field2067[var47];
                    this.field2067[var47] = 127;
                    if (this.field2076[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2046[var47] = -1;
                    this.field2076[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field2038[var47] = var6.method200(32768);
            }
            if (var14 == 1) {
                this.field2049[var47] = var7.method200(32768);
            }
            if (var15 == 1) {
                this.field2080[var47] = var8.method189((byte) -103);
            }
        }
        var4.field481 = var25;
        var5.field481 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; var52++) {
            int var57 = var5.method189((byte) -103);
            if (var57 == 1) {
                var48 = var4.method204(116) + var51;
                var49 = var4.method204(103) + var48;
                var50 = var4.method204(-105) + var49;
                var51 = var50;
                this.field2066[var52] = var48;
                this.field2044[var52] = var49;
                this.field2061[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method204(-19) + var51;
                var51 = var50;
                this.field2066[var52] = var48;
                this.field2044[var52] = var49;
                this.field2061[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method204(99) + var51;
                var51 = var50;
                this.field2066[var52] = var48;
                this.field2044[var52] = var49;
                this.field2061[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method204(101) + var51;
                var51 = var50;
                this.field2066[var52] = var48;
                this.field2044[var52] = var60;
                this.field2061[var52] = var50;
            }
        }
        var4.field481 = var34;
        for (int var53 = 0; var53 < var11; var53++) {
            this.field2072[var53] = 0;
            this.field2062[var53] = (short) var4.method193((byte) 77);
            this.field2069[var53] = (short) var4.method193((byte) 77);
            this.field2058[var53] = (short) var4.method193((byte) 77);
        }
        if (this.field2046 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; var55++) {
                int var56 = this.field2046[var55] & 0xFF;
                if (var56 != 255) {
                    if ((this.field2062[var56] & 0xFFFF) == this.field2066[var55] && (this.field2069[var56] & 0xFFFF) == this.field2044[var55] && (this.field2058[var56] & 0xFFFF) == this.field2061[var55]) {
                        this.field2046[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field2046 = null;
            }
        }
        if (!var3) {
            this.field2076 = null;
        }
        if (!var2) {
            this.field2048 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(III)I")
    public final int method832(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2068; var4++) {
            if (this.field2041[var4] == arg0 && this.field2042[var4] == arg1 && this.field2078[var4] == arg2) {
                return var4;
            }
        }
        this.field2041[this.field2068] = arg0;
        this.field2042[this.field2068] = arg1;
        this.field2078[this.field2068] = arg2;
        return this.field2068++;
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)V")
    private final void method833(int arg0) {
        int var2 = field2045[arg0];
        int var3 = field2079[arg0];
        for (int var4 = 0; var4 < this.field2068; var4++) {
            int var5 = this.field2042[var4] * var3 - this.field2078[var4] * var2 >> 16;
            this.field2078[var4] = this.field2078[var4] * var3 + this.field2042[var4] * var2 >> 16;
            this.field2042[var4] = var5;
        }
        this.method809();
    }

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "()V")
    public final void method834() {
        int var10002;
        if (this.field2059 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2068; var3++) {
                int var7 = this.field2059[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field2036 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; var4++) {
                this.field2036[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field2068) {
                int var6 = this.field2059[var5];
                this.field2036[var6][var1[var6]++] = var5++;
            }
            this.field2059 = null;
        }
        if (this.field2080 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2053; var10++) {
            int var14 = this.field2080[var10];
            var10002 = var8[var14]++;
            if (var14 > var9) {
                var9 = var14;
            }
        }
        this.field2050 = new int[var9 + 1][];
        for (int var11 = 0; var11 <= var9; var11++) {
            this.field2050[var11] = new int[var8[var11]];
            var8[var11] = 0;
        }
        int var12 = 0;
        while (var12 < this.field2053) {
            int var13 = this.field2080[var12];
            this.field2050[var13][var8[var13]++] = var12++;
        }
        this.field2080 = null;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(SS)V")
    public final void method835(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2053; var3++) {
            if (this.field2067[var3] == arg0) {
                this.field2067[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V")
    private class114() {
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "([B)V")
    private class114(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method824(arg0);
        } else {
            this.method831(arg0);
        }
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(III)V")
    public class114(int arg0, int arg1, int arg2) {
        this.field2041 = new int[arg0];
        this.field2042 = new int[arg0];
        this.field2078 = new int[arg0];
        this.field2059 = new int[arg0];
        this.field2066 = new int[arg1];
        this.field2044 = new int[arg1];
        this.field2061 = new int[arg1];
        this.field2048 = new byte[arg1];
        this.field2038 = new byte[arg1];
        this.field2049 = new byte[arg1];
        this.field2067 = new short[arg1];
        this.field2076 = new short[arg1];
        this.field2046 = new byte[arg1];
        this.field2080 = new int[arg1];
        if (arg2 > 0) {
            this.field2072 = new byte[arg2];
            this.field2062 = new short[arg2];
            this.field2069 = new short[arg2];
            this.field2058 = new short[arg2];
            this.field2063 = new short[arg2];
            this.field2077 = new short[arg2];
            this.field2057 = new short[arg2];
            this.field2035 = new byte[arg2];
            this.field2056 = new byte[arg2];
            this.field2039 = new byte[arg2];
            this.field2073 = new byte[arg2];
            this.field2071 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "([Lvj;I)V")
    public class114(class114[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field2068 = 0;
        this.field2053 = 0;
        this.field2051 = 0;
        boolean var9 = false;
        boolean var10 = false;
        this.field2065 = -1;
        for (int var11 = 0; var11 < arg1; var11++) {
            class114 var20 = arg0[var11];
            if (var20 != null) {
                this.field2068 += var20.field2068;
                this.field2053 += var20.field2053;
                this.field2051 += var20.field2051;
                if (var20.field2038 == null) {
                    if (this.field2065 == -1) {
                        this.field2065 = var20.field2065;
                    }
                    if (this.field2065 != var20.field2065) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var20.field2048 != null;
                var5 |= var20.field2049 != null;
                var6 |= var20.field2080 != null;
                var7 |= var20.field2076 != null;
                var8 |= var20.field2046 != null;
            }
        }
        this.field2041 = new int[this.field2068];
        this.field2042 = new int[this.field2068];
        this.field2078 = new int[this.field2068];
        this.field2059 = new int[this.field2068];
        this.field2066 = new int[this.field2053];
        this.field2044 = new int[this.field2053];
        this.field2061 = new int[this.field2053];
        if (var3) {
            this.field2048 = new byte[this.field2053];
        }
        if (var4) {
            this.field2038 = new byte[this.field2053];
        }
        if (var5) {
            this.field2049 = new byte[this.field2053];
        }
        if (var6) {
            this.field2080 = new int[this.field2053];
        }
        if (var7) {
            this.field2076 = new short[this.field2053];
        }
        if (var8) {
            this.field2046 = new byte[this.field2053];
        }
        this.field2067 = new short[this.field2053];
        if (this.field2051 > 0) {
            this.field2072 = new byte[this.field2051];
            this.field2062 = new short[this.field2051];
            this.field2069 = new short[this.field2051];
            this.field2058 = new short[this.field2051];
            this.field2063 = new short[this.field2051];
            this.field2077 = new short[this.field2051];
            this.field2057 = new short[this.field2051];
            this.field2035 = new byte[this.field2051];
            this.field2056 = new byte[this.field2051];
            this.field2039 = new byte[this.field2051];
            this.field2073 = new byte[this.field2051];
            this.field2071 = new byte[this.field2051];
        }
        this.field2068 = 0;
        this.field2053 = 0;
        this.field2051 = 0;
        boolean var12 = false;
        boolean var13 = false;
        for (int var14 = 0; var14 < arg1; var14++) {
            short var15 = (short) (0x1 << var14);
            class114 var16 = arg0[var14];
            if (var16 != null) {
                for (int var17 = 0; var17 < var16.field2053; var17++) {
                    if (var3 && var16.field2048 != null) {
                        this.field2048[this.field2053] = var16.field2048[var17];
                    }
                    if (var4) {
                        if (var16.field2038 == null) {
                            this.field2038[this.field2053] = var16.field2065;
                        } else {
                            this.field2038[this.field2053] = var16.field2038[var17];
                        }
                    }
                    if (var5 && var16.field2049 != null) {
                        this.field2049[this.field2053] = var16.field2049[var17];
                    }
                    if (var6 && var16.field2080 != null) {
                        this.field2080[this.field2053] = var16.field2080[var17];
                    }
                    if (var7) {
                        if (var16.field2076 == null) {
                            this.field2076[this.field2053] = -1;
                        } else {
                            this.field2076[this.field2053] = var16.field2076[var17];
                        }
                    }
                    if (var8) {
                        if (var16.field2046 == null || var16.field2046[var17] == -1) {
                            this.field2046[this.field2053] = -1;
                        } else {
                            this.field2046[this.field2053] = (byte) (var16.field2046[var17] + this.field2051);
                        }
                    }
                    this.field2067[this.field2053] = var16.field2067[var17];
                    this.field2066[this.field2053] = this.method810(var16, var16.field2066[var17], var15);
                    this.field2044[this.field2053] = this.method810(var16, var16.field2044[var17], var15);
                    this.field2061[this.field2053] = this.method810(var16, var16.field2061[var17], var15);
                    this.field2053++;
                }
                for (int var18 = 0; var18 < var16.field2051; var18++) {
                    byte var19 = this.field2072[this.field2051] = var16.field2072[var18];
                    if (var19 == 0) {
                        this.field2062[this.field2051] = (short) this.method810(var16, var16.field2062[var18], var15);
                        this.field2069[this.field2051] = (short) this.method810(var16, var16.field2069[var18], var15);
                        this.field2058[this.field2051] = (short) this.method810(var16, var16.field2058[var18], var15);
                    }
                    if (var19 >= 1 && var19 <= 3) {
                        this.field2062[this.field2051] = var16.field2062[var18];
                        this.field2069[this.field2051] = var16.field2069[var18];
                        this.field2058[this.field2051] = var16.field2058[var18];
                        this.field2063[this.field2051] = var16.field2063[var18];
                        this.field2077[this.field2051] = var16.field2077[var18];
                        this.field2057[this.field2051] = var16.field2057[var18];
                        this.field2035[this.field2051] = var16.field2035[var18];
                        this.field2056[this.field2051] = var16.field2056[var18];
                        this.field2039[this.field2051] = var16.field2039[var18];
                    }
                    if (var19 == 2) {
                        this.field2073[this.field2051] = var16.field2073[var18];
                        this.field2071[this.field2051] = var16.field2071[var18];
                    }
                    this.field2051++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lvj;ZZZZ)V")
    public class114(class114 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2068 = arg0.field2068;
        this.field2053 = arg0.field2053;
        this.field2051 = arg0.field2051;
        if (arg1) {
            this.field2041 = arg0.field2041;
            this.field2042 = arg0.field2042;
            this.field2078 = arg0.field2078;
        } else {
            this.field2041 = new int[this.field2068];
            this.field2042 = new int[this.field2068];
            this.field2078 = new int[this.field2068];
            for (int var6 = 0; var6 < this.field2068; var6++) {
                this.field2041[var6] = arg0.field2041[var6];
                this.field2042[var6] = arg0.field2042[var6];
                this.field2078[var6] = arg0.field2078[var6];
            }
        }
        if (arg2) {
            this.field2067 = arg0.field2067;
        } else {
            this.field2067 = new short[this.field2053];
            for (int var7 = 0; var7 < this.field2053; var7++) {
                this.field2067[var7] = arg0.field2067[var7];
            }
        }
        if (arg3 || arg0.field2076 == null) {
            this.field2076 = arg0.field2076;
        } else {
            this.field2076 = new short[this.field2053];
            for (int var8 = 0; var8 < this.field2053; var8++) {
                this.field2076[var8] = arg0.field2076[var8];
            }
        }
        if (arg4) {
            this.field2049 = arg0.field2049;
        } else {
            this.field2049 = new byte[this.field2053];
            if (arg0.field2049 == null) {
                for (int var9 = 0; var9 < this.field2053; var9++) {
                    this.field2049[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2053; var10++) {
                    this.field2049[var10] = arg0.field2049[var10];
                }
            }
        }
        this.field2066 = arg0.field2066;
        this.field2044 = arg0.field2044;
        this.field2061 = arg0.field2061;
        this.field2048 = arg0.field2048;
        this.field2038 = arg0.field2038;
        this.field2046 = arg0.field2046;
        this.field2065 = arg0.field2065;
        this.field2072 = arg0.field2072;
        this.field2062 = arg0.field2062;
        this.field2069 = arg0.field2069;
        this.field2058 = arg0.field2058;
        this.field2063 = arg0.field2063;
        this.field2077 = arg0.field2077;
        this.field2057 = arg0.field2057;
        this.field2035 = arg0.field2035;
        this.field2056 = arg0.field2056;
        this.field2039 = arg0.field2039;
        this.field2073 = arg0.field2073;
        this.field2071 = arg0.field2071;
        this.field2059 = arg0.field2059;
        this.field2080 = arg0.field2080;
        this.field2036 = arg0.field2036;
        this.field2050 = arg0.field2050;
        this.field2060 = arg0.field2060;
        this.field2070 = arg0.field2070;
        this.field2064 = arg0.field2064;
        this.field2037 = arg0.field2037;
        this.field2040 = arg0.field2040;
    }
}
