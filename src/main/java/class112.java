import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class112 extends class108 {

    @OriginalMember(owner = "client!aj", name = "A", descriptor = "B")
    public byte field2063 = 0;

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "Z")
    private boolean field2055 = false;

    @OriginalMember(owner = "client!aj", name = "G", descriptor = "I")
    public int field2069 = 0;

    @OriginalMember(owner = "client!aj", name = "V", descriptor = "I")
    public int field2084 = 0;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "[I")
    public int[] field2047;

    @OriginalMember(owner = "client!aj", name = "R", descriptor = "[I")
    public int[] field2080;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "[I")
    public int[] field2052;

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "[I")
    private int[] field2051;

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "[I")
    public int[] field2054;

    @OriginalMember(owner = "client!aj", name = "K", descriptor = "[I")
    public int[] field2073;

    @OriginalMember(owner = "client!aj", name = "bb", descriptor = "[I")
    public int[] field2090;

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "[B")
    public byte[] field2056;

    @OriginalMember(owner = "client!aj", name = "eb", descriptor = "[B")
    public byte[] field2093;

    @OriginalMember(owner = "client!aj", name = "I", descriptor = "[B")
    public byte[] field2071;

    @OriginalMember(owner = "client!aj", name = "P", descriptor = "[S")
    public short[] field2078;

    @OriginalMember(owner = "client!aj", name = "M", descriptor = "[S")
    public short[] field2075;

    @OriginalMember(owner = "client!aj", name = "F", descriptor = "[B")
    public byte[] field2068;

    @OriginalMember(owner = "client!aj", name = "Z", descriptor = "[I")
    private int[] field2088;

    @OriginalMember(owner = "client!aj", name = "v", descriptor = "[B")
    public byte[] field2058;

    @OriginalMember(owner = "client!aj", name = "C", descriptor = "[S")
    public short[] field2065;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "[S")
    public short[] field2048;

    @OriginalMember(owner = "client!aj", name = "J", descriptor = "[S")
    public short[] field2072;

    @OriginalMember(owner = "client!aj", name = "fb", descriptor = "[S")
    private short[] field2094;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "[S")
    private short[] field2049;

    @OriginalMember(owner = "client!aj", name = "Q", descriptor = "[S")
    private short[] field2079;

    @OriginalMember(owner = "client!aj", name = "N", descriptor = "[B")
    private byte[] field2076;

    @OriginalMember(owner = "client!aj", name = "U", descriptor = "[B")
    private byte[] field2083;

    @OriginalMember(owner = "client!aj", name = "cb", descriptor = "[B")
    private byte[] field2091;

    @OriginalMember(owner = "client!aj", name = "S", descriptor = "[B")
    private byte[] field2081;

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "[B")
    private byte[] field2057;

    @OriginalMember(owner = "client!aj", name = "X", descriptor = "I")
    public int field2086;

    @OriginalMember(owner = "client!aj", name = "T", descriptor = "[[I")
    public int[][] field2082;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "[[I")
    public int[][] field2046;

    @OriginalMember(owner = "client!aj", name = "y", descriptor = "[Lcf;")
    public class225[] field2061;

    @OriginalMember(owner = "client!aj", name = "z", descriptor = "[Lfa;")
    public class82[] field2062;

    @OriginalMember(owner = "client!aj", name = "L", descriptor = "[Lcf;")
    public class225[] field2074;

    @OriginalMember(owner = "client!aj", name = "Y", descriptor = "S")
    public short field2087;

    @OriginalMember(owner = "client!aj", name = "w", descriptor = "S")
    public short field2059;

    @OriginalMember(owner = "client!aj", name = "E", descriptor = "[I")
    private static int[] field2067 = new int[10000];

    @OriginalMember(owner = "client!aj", name = "O", descriptor = "I")
    private static int field2077 = 0;

    @OriginalMember(owner = "client!aj", name = "W", descriptor = "[I")
    private static int[] field2085 = new int[10000];

    @OriginalMember(owner = "client!aj", name = "B", descriptor = "[I")
    private static int[] field2064 = class240.field4162;

    @OriginalMember(owner = "client!aj", name = "ab", descriptor = "[I")
    private static int[] field2089 = class240.field4176;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "S")
    private short field2050;

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "S")
    private short field2053;

    @OriginalMember(owner = "client!aj", name = "x", descriptor = "S")
    private short field2060;

    @OriginalMember(owner = "client!aj", name = "D", descriptor = "S")
    private short field2066;

    @OriginalMember(owner = "client!aj", name = "H", descriptor = "S")
    private short field2070;

    @OriginalMember(owner = "client!aj", name = "db", descriptor = "S")
    private short field2092;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(III)V")
    public final void method855(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field2064[arg2];
            int var5 = field2089[arg2];
            for (int var6 = 0; var6 < this.field2084; var6++) {
                int var7 = this.field2080[var6] * var4 + this.field2047[var6] * var5 >> 16;
                this.field2080[var6] = this.field2080[var6] * var5 - this.field2047[var6] * var4 >> 16;
                this.field2047[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field2064[arg0];
            int var9 = field2089[arg0];
            for (int var10 = 0; var10 < this.field2084; var10++) {
                int var11 = this.field2080[var10] * var9 - this.field2052[var10] * var8 >> 16;
                this.field2052[var10] = this.field2080[var10] * var8 + this.field2052[var10] * var9 >> 16;
                this.field2080[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field2064[arg1];
        int var13 = field2089[arg1];
        for (int var14 = 0; var14 < this.field2084; var14++) {
            int var15 = this.field2052[var14] * var12 + this.field2047[var14] * var13 >> 16;
            this.field2052[var14] = this.field2052[var14] * var13 - this.field2047[var14] * var12 >> 16;
            this.field2047[var14] = var15;
        }
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "()V")
    public final void method856() {
        for (int var1 = 0; var1 < this.field2084; var1++) {
            int var2 = this.field2052[var1];
            this.field2052[var1] = this.field2047[var1];
            this.field2047[var1] = -var2;
        }
        this.method865();
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(III)V")
    public final void method857(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2084; var4++) {
            this.field2047[var4] += arg0;
            this.field2080[var4] += arg1;
            this.field2052[var4] += arg2;
        }
        this.method865();
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
    public final void method858(int arg0) {
        int var2 = field2064[arg0];
        int var3 = field2089[arg0];
        for (int var4 = 0; var4 < this.field2084; var4++) {
            int var5 = this.field2052[var4] * var2 + this.field2047[var4] * var3 >> 16;
            this.field2052[var4] = this.field2052[var4] * var3 - this.field2047[var4] * var2 >> 16;
            this.field2047[var4] = var5;
        }
        this.method865();
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "()V")
    public final void method859() {
        if (this.field2061 != null) {
            return;
        }
        this.field2061 = new class225[this.field2084];
        for (int var1 = 0; var1 < this.field2084; var1++) {
            this.field2061[var1] = new class225();
        }
        for (int var2 = 0; var2 < this.field2069; var2++) {
            int var3 = this.field2054[var2];
            int var4 = this.field2073[var2];
            int var5 = this.field2090[var2];
            int var6 = this.field2047[var4] - this.field2047[var3];
            int var7 = this.field2080[var4] - this.field2080[var3];
            int var8 = this.field2052[var4] - this.field2052[var3];
            int var9 = this.field2047[var5] - this.field2047[var3];
            int var10 = this.field2080[var5] - this.field2080[var3];
            int var11 = this.field2052[var5] - this.field2052[var3];
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
            if (this.field2056 == null) {
                var19 = 0;
            } else {
                var19 = this.field2056[var2];
            }
            if (var19 == 0) {
                class225 var20 = this.field2061[var3];
                var20.field3822 += var16;
                var20.field3833 += var17;
                var20.field3827 += var18;
                var20.field3824++;
                class225 var21 = this.field2061[var4];
                var21.field3822 += var16;
                var21.field3833 += var17;
                var21.field3827 += var18;
                var21.field3824++;
                class225 var22 = this.field2061[var5];
                var22.field3822 += var16;
                var22.field3833 += var17;
                var22.field3827 += var18;
                var22.field3824++;
            } else if (var19 == 1) {
                if (this.field2062 == null) {
                    this.field2062 = new class82[this.field2069];
                }
                class82 var23 = this.field2062[var2] = new class82();
                var23.field1377 = var16;
                var23.field1394 = var17;
                var23.field1387 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "()I")
    public final int method50() {
        if (!this.field2055) {
            this.method864();
        }
        return this.field2092;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "()Z")
    public final boolean method831() {
        return true;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "([B)V")
    private final void method860(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class239 var4 = new class239(arg0);
        class239 var5 = new class239(arg0);
        class239 var6 = new class239(arg0);
        class239 var7 = new class239(arg0);
        class239 var8 = new class239(arg0);
        var4.field4124 = arg0.length - 18;
        int var9 = var4.method1663((byte) -49);
        int var10 = var4.method1663((byte) -65);
        int var11 = var4.method1651(4139);
        int var12 = var4.method1651(4139);
        int var13 = var4.method1651(4139);
        int var14 = var4.method1651(4139);
        int var15 = var4.method1651(4139);
        int var16 = var4.method1651(4139);
        int var17 = var4.method1663((byte) -51);
        int var18 = var4.method1663((byte) 95);
        int var19 = var4.method1663((byte) -102);
        int var20 = var4.method1663((byte) 65);
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
        this.field2084 = var9;
        this.field2069 = var10;
        this.field2086 = var11;
        this.field2047 = new int[var9];
        this.field2080 = new int[var9];
        this.field2052 = new int[var9];
        this.field2054 = new int[var10];
        this.field2073 = new int[var10];
        this.field2090 = new int[var10];
        if (var11 > 0) {
            this.field2058 = new byte[var11];
            this.field2065 = new short[var11];
            this.field2048 = new short[var11];
            this.field2072 = new short[var11];
        }
        if (var16 == 1) {
            this.field2051 = new int[var9];
        }
        if (var12 == 1) {
            this.field2056 = new byte[var10];
            this.field2068 = new byte[var10];
            this.field2075 = new short[var10];
        }
        if (var13 == 255) {
            this.field2093 = new byte[var10];
        } else {
            this.field2063 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2071 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2088 = new int[var10];
        }
        this.field2078 = new short[var10];
        var4.field4124 = var21;
        var5.field4124 = var36;
        var6.field4124 = var38;
        var7.field4124 = var40;
        var8.field4124 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var62 = var4.method1651(4139);
            int var63 = 0;
            if ((var62 & 0x1) != 0) {
                var63 = var5.method1640(-49152);
            }
            int var64 = 0;
            if ((var62 & 0x2) != 0) {
                var64 = var6.method1640(-49152);
            }
            int var65 = 0;
            if ((var62 & 0x4) != 0) {
                var65 = var7.method1640(-49152);
            }
            this.field2047[var46] = var43 + var63;
            this.field2080[var46] = var44 + var64;
            this.field2052[var46] = var45 + var65;
            var43 = this.field2047[var46];
            var44 = this.field2080[var46];
            var45 = this.field2052[var46];
            if (var16 == 1) {
                this.field2051[var46] = var8.method1651(4139);
            }
        }
        var4.field4124 = var32;
        var5.field4124 = var28;
        var6.field4124 = var26;
        var7.field4124 = var30;
        var8.field4124 = var27;
        for (int var47 = 0; var47 < var10; var47++) {
            this.field2078[var47] = (short) var4.method1663((byte) 80);
            if (var12 == 1) {
                int var61 = var5.method1651(4139);
                if ((var61 & 0x1) == 1) {
                    this.field2056[var47] = 1;
                    var2 = true;
                } else {
                    this.field2056[var47] = 0;
                }
                if ((var61 & 0x2) == 2) {
                    this.field2068[var47] = (byte) (var61 >> 2);
                    this.field2075[var47] = this.field2078[var47];
                    this.field2078[var47] = 127;
                    if (this.field2075[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2068[var47] = -1;
                    this.field2075[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field2093[var47] = var6.method1656(38);
            }
            if (var14 == 1) {
                this.field2071[var47] = var7.method1656(-55);
            }
            if (var15 == 1) {
                this.field2088[var47] = var8.method1651(4139);
            }
        }
        var4.field4124 = var25;
        var5.field4124 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; var52++) {
            int var57 = var5.method1651(4139);
            if (var57 == 1) {
                var48 = var4.method1640(-49152) + var51;
                var49 = var4.method1640(-49152) + var48;
                var50 = var4.method1640(-49152) + var49;
                var51 = var50;
                this.field2054[var52] = var48;
                this.field2073[var52] = var49;
                this.field2090[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method1640(-49152) + var51;
                var51 = var50;
                this.field2054[var52] = var48;
                this.field2073[var52] = var49;
                this.field2090[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method1640(-49152) + var51;
                var51 = var50;
                this.field2054[var52] = var48;
                this.field2073[var52] = var49;
                this.field2090[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method1640(-49152) + var51;
                var51 = var50;
                this.field2054[var52] = var48;
                this.field2073[var52] = var60;
                this.field2090[var52] = var50;
            }
        }
        var4.field4124 = var34;
        for (int var53 = 0; var53 < var11; var53++) {
            this.field2058[var53] = 0;
            this.field2065[var53] = (short) var4.method1663((byte) -113);
            this.field2048[var53] = (short) var4.method1663((byte) 98);
            this.field2072[var53] = (short) var4.method1663((byte) -119);
        }
        if (this.field2068 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; var55++) {
                int var56 = this.field2068[var55] & 0xFF;
                if (var56 != 255) {
                    if ((this.field2065[var56] & 0xFFFF) == this.field2054[var55] && (this.field2048[var56] & 0xFFFF) == this.field2073[var55] && (this.field2072[var56] & 0xFFFF) == this.field2090[var55]) {
                        this.field2068[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field2068 = null;
            }
        }
        if (!var3) {
            this.field2075 = null;
        }
        if (!var2) {
            this.field2056 = null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "()V")
    public final void method861() {
        for (int var1 = 0; var1 < this.field2084; var1++) {
            this.field2052[var1] = -this.field2052[var1];
        }
        for (int var2 = 0; var2 < this.field2069; var2++) {
            int var3 = this.field2054[var2];
            this.field2054[var2] = this.field2090[var2];
            this.field2090[var2] = var3;
        }
        this.method865();
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIII)Lra;")
    public final class35 method862(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class255(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(SS)V")
    public final void method863(short arg0, short arg1) {
        if (this.field2075 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2069; var3++) {
            if (this.field2075[var3] == arg0) {
                this.field2075[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "()V")
    private final void method864() {
        if (this.field2055) {
            return;
        }
        this.field2055 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field2084; var7++) {
            int var8 = this.field2047[var7];
            int var9 = this.field2080[var7];
            int var10 = this.field2052[var7];
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
        this.field2060 = (short) var1;
        this.field2053 = (short) var4;
        this.field2092 = (short) var2;
        this.field2066 = (short) var5;
        this.field2070 = (short) var3;
        this.field2050 = (short) var6;
    }

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "()V")
    private final void method865() {
        this.field2061 = null;
        this.field2074 = null;
        this.field2062 = null;
        this.field2055 = false;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "([[IIIIII)V")
    private final void method866(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method868(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method868(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method868(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method868(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method877(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method882(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method857(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "([B)V")
    private final void method867(byte[] arg0) {
        class239 var2 = new class239(arg0);
        class239 var3 = new class239(arg0);
        class239 var4 = new class239(arg0);
        class239 var5 = new class239(arg0);
        class239 var6 = new class239(arg0);
        class239 var7 = new class239(arg0);
        class239 var8 = new class239(arg0);
        var2.field4124 = arg0.length - 23;
        int var9 = var2.method1663((byte) -85);
        int var10 = var2.method1663((byte) 74);
        int var11 = var2.method1651(4139);
        int var12 = var2.method1651(4139);
        int var13 = var2.method1651(4139);
        int var14 = var2.method1651(4139);
        int var15 = var2.method1651(4139);
        int var16 = var2.method1651(4139);
        int var17 = var2.method1651(4139);
        int var18 = var2.method1663((byte) 75);
        int var19 = var2.method1663((byte) 97);
        int var20 = var2.method1663((byte) 100);
        int var21 = var2.method1663((byte) -125);
        int var22 = var2.method1663((byte) -77);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field2058 = new byte[var11];
            var2.field4124 = 0;
            for (int var26 = 0; var26 < var11; var26++) {
                byte var27 = this.field2058[var26] = var2.method1656(85);
                if (var27 == 0) {
                    var23++;
                }
                if (var27 >= 1 && var27 <= 3) {
                    var24++;
                }
                if (var27 == 2) {
                    var25++;
                }
            }
        }
        int var30 = var9 + var11;
        int var31 = var30;
        if (var12 == 1) {
            var30 += var10;
        }
        int var33 = var10 + var30;
        int var34 = var33;
        if (var13 == 255) {
            var33 += var10;
        }
        int var35 = var33;
        if (var15 == 1) {
            var33 += var10;
        }
        int var36 = var33;
        if (var17 == 1) {
            var33 += var9;
        }
        int var37 = var33;
        if (var14 == 1) {
            var33 += var10;
        }
        int var39 = var21 + var33;
        int var40 = var39;
        if (var16 == 1) {
            var39 += var10 * 2;
        }
        int var42 = var22 + var39;
        int var44 = var10 * 2 + var42;
        int var46 = var18 + var44;
        int var48 = var19 + var46;
        int var50 = var20 + var48;
        int var52 = var23 * 6 + var50;
        int var54 = var24 * 6 + var52;
        int var56 = var24 * 6 + var54;
        int var58 = var24 + var56;
        int var60 = var24 + var58;
        int var62 = var25 * 2 + var24 + var60;
        this.field2084 = var9;
        this.field2069 = var10;
        this.field2086 = var11;
        this.field2047 = new int[var9];
        this.field2080 = new int[var9];
        this.field2052 = new int[var9];
        this.field2054 = new int[var10];
        this.field2073 = new int[var10];
        this.field2090 = new int[var10];
        if (var17 == 1) {
            this.field2051 = new int[var9];
        }
        if (var12 == 1) {
            this.field2056 = new byte[var10];
        }
        if (var13 == 255) {
            this.field2093 = new byte[var10];
        } else {
            this.field2063 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2071 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2088 = new int[var10];
        }
        if (var16 == 1) {
            this.field2075 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field2068 = new byte[var10];
        }
        this.field2078 = new short[var10];
        if (var11 > 0) {
            this.field2065 = new short[var11];
            this.field2048 = new short[var11];
            this.field2072 = new short[var11];
            if (var24 > 0) {
                this.field2094 = new short[var24];
                this.field2049 = new short[var24];
                this.field2079 = new short[var24];
                this.field2076 = new byte[var24];
                this.field2083 = new byte[var24];
                this.field2091 = new byte[var24];
            }
            if (var25 > 0) {
                this.field2081 = new byte[var25];
                this.field2057 = new byte[var25];
            }
        }
        var2.field4124 = var11;
        var3.field4124 = var44;
        var4.field4124 = var46;
        var5.field4124 = var48;
        var6.field4124 = var36;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        for (int var66 = 0; var66 < var9; var66++) {
            int var79 = var2.method1651(4139);
            int var80 = 0;
            if ((var79 & 0x1) != 0) {
                var80 = var3.method1640(-49152);
            }
            int var81 = 0;
            if ((var79 & 0x2) != 0) {
                var81 = var4.method1640(-49152);
            }
            int var82 = 0;
            if ((var79 & 0x4) != 0) {
                var82 = var5.method1640(-49152);
            }
            this.field2047[var66] = var63 + var80;
            this.field2080[var66] = var64 + var81;
            this.field2052[var66] = var65 + var82;
            var63 = this.field2047[var66];
            var64 = this.field2080[var66];
            var65 = this.field2052[var66];
            if (var17 == 1) {
                this.field2051[var66] = var6.method1651(4139);
            }
        }
        var2.field4124 = var42;
        var3.field4124 = var31;
        var4.field4124 = var34;
        var5.field4124 = var37;
        var6.field4124 = var35;
        var7.field4124 = var40;
        var8.field4124 = var39;
        for (int var67 = 0; var67 < var10; var67++) {
            this.field2078[var67] = (short) var2.method1663((byte) -44);
            if (var12 == 1) {
                this.field2056[var67] = var3.method1656(88);
            }
            if (var13 == 255) {
                this.field2093[var67] = var4.method1656(-107);
            }
            if (var14 == 1) {
                this.field2071[var67] = var5.method1656(47);
            }
            if (var15 == 1) {
                this.field2088[var67] = var6.method1651(4139);
            }
            if (var16 == 1) {
                this.field2075[var67] = (short) (var7.method1663((byte) -97) - 1);
            }
            if (this.field2068 != null) {
                if (this.field2075[var67] == -1) {
                    this.field2068[var67] = -1;
                } else {
                    this.field2068[var67] = (byte) (var8.method1651(4139) - 1);
                }
            }
        }
        var2.field4124 = var33;
        var3.field4124 = var30;
        int var68 = 0;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        for (int var72 = 0; var72 < var10; var72++) {
            int var75 = var3.method1651(4139);
            if (var75 == 1) {
                var68 = var2.method1640(-49152) + var71;
                var69 = var2.method1640(-49152) + var68;
                var70 = var2.method1640(-49152) + var69;
                var71 = var70;
                this.field2054[var72] = var68;
                this.field2073[var72] = var69;
                this.field2090[var72] = var70;
            }
            if (var75 == 2) {
                var69 = var70;
                var70 = var2.method1640(-49152) + var71;
                var71 = var70;
                this.field2054[var72] = var68;
                this.field2073[var72] = var69;
                this.field2090[var72] = var70;
            }
            if (var75 == 3) {
                var68 = var70;
                var70 = var2.method1640(-49152) + var71;
                var71 = var70;
                this.field2054[var72] = var68;
                this.field2073[var72] = var69;
                this.field2090[var72] = var70;
            }
            if (var75 == 4) {
                int var78 = var68;
                var68 = var69;
                var69 = var78;
                var70 = var2.method1640(-49152) + var71;
                var71 = var70;
                this.field2054[var72] = var68;
                this.field2073[var72] = var78;
                this.field2090[var72] = var70;
            }
        }
        var2.field4124 = var50;
        var3.field4124 = var52;
        var4.field4124 = var54;
        var5.field4124 = var56;
        var6.field4124 = var58;
        var7.field4124 = var60;
        for (int var73 = 0; var73 < var11; var73++) {
            int var74 = this.field2058[var73] & 0xFF;
            if (var74 == 0) {
                this.field2065[var73] = (short) var2.method1663((byte) 89);
                this.field2048[var73] = (short) var2.method1663((byte) -68);
                this.field2072[var73] = (short) var2.method1663((byte) -120);
            }
            if (var74 == 1) {
                this.field2065[var73] = (short) var3.method1663((byte) -62);
                this.field2048[var73] = (short) var3.method1663((byte) 114);
                this.field2072[var73] = (short) var3.method1663((byte) 66);
                this.field2094[var73] = (short) var4.method1663((byte) -82);
                this.field2049[var73] = (short) var4.method1663((byte) 126);
                this.field2079[var73] = (short) var4.method1663((byte) -88);
                this.field2076[var73] = var5.method1656(-52);
                this.field2083[var73] = var6.method1656(-113);
                this.field2091[var73] = var7.method1656(-125);
            }
            if (var74 == 2) {
                this.field2065[var73] = (short) var3.method1663((byte) -108);
                this.field2048[var73] = (short) var3.method1663((byte) -81);
                this.field2072[var73] = (short) var3.method1663((byte) -105);
                this.field2094[var73] = (short) var4.method1663((byte) -105);
                this.field2049[var73] = (short) var4.method1663((byte) 98);
                this.field2079[var73] = (short) var4.method1663((byte) 100);
                this.field2076[var73] = var5.method1656(105);
                this.field2083[var73] = var6.method1656(109);
                this.field2091[var73] = var7.method1656(-72);
                this.field2081[var73] = var7.method1656(103);
                this.field2057[var73] = var7.method1656(-83);
            }
            if (var74 == 3) {
                this.field2065[var73] = (short) var3.method1663((byte) 74);
                this.field2048[var73] = (short) var3.method1663((byte) 75);
                this.field2072[var73] = (short) var3.method1663((byte) -102);
                this.field2094[var73] = (short) var4.method1663((byte) 84);
                this.field2049[var73] = (short) var4.method1663((byte) -55);
                this.field2079[var73] = (short) var4.method1663((byte) 119);
                this.field2076[var73] = var5.method1656(-50);
                this.field2083[var73] = var6.method1656(121);
                this.field2091[var73] = var7.method1656(37);
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "([[III)I")
    private static final int method868(int[][] arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II[[I[[IIIIZZ)Laj;")
    public final class112 method869(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method864();
        int var10 = this.field2060 + arg4;
        int var11 = this.field2053 + arg4;
        int var12 = this.field2070 + arg6;
        int var13 = this.field2050 + arg6;
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
        class112 var18;
        if (arg7) {
            var18 = new class112();
            var18.field2084 = this.field2084;
            var18.field2069 = this.field2069;
            var18.field2086 = this.field2086;
            var18.field2054 = this.field2054;
            var18.field2073 = this.field2073;
            var18.field2090 = this.field2090;
            var18.field2056 = this.field2056;
            var18.field2093 = this.field2093;
            var18.field2071 = this.field2071;
            var18.field2068 = this.field2068;
            var18.field2078 = this.field2078;
            var18.field2075 = this.field2075;
            var18.field2063 = this.field2063;
            var18.field2058 = this.field2058;
            var18.field2065 = this.field2065;
            var18.field2048 = this.field2048;
            var18.field2072 = this.field2072;
            var18.field2094 = this.field2094;
            var18.field2049 = this.field2049;
            var18.field2079 = this.field2079;
            var18.field2076 = this.field2076;
            var18.field2083 = this.field2083;
            var18.field2091 = this.field2091;
            var18.field2081 = this.field2081;
            var18.field2057 = this.field2057;
            var18.field2051 = this.field2051;
            var18.field2088 = this.field2088;
            var18.field2082 = this.field2082;
            var18.field2046 = this.field2046;
            var18.field2087 = this.field2087;
            var18.field2059 = this.field2059;
            var18.field2061 = this.field2061;
            var18.field2062 = this.field2062;
            var18.field2074 = this.field2074;
            if (arg0 == 3) {
                var18.field2047 = class83.method586(this.field2047, -61);
                var18.field2080 = class83.method586(this.field2080, -39);
                var18.field2052 = class83.method586(this.field2052, -96);
            } else {
                var18.field2047 = this.field2047;
                var18.field2080 = new int[var18.field2084];
                var18.field2052 = this.field2052;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field2084; var19++) {
                int var20 = this.field2047[var19] + arg4;
                int var21 = this.field2052[var19] + arg6;
                int var22 = var20 & 0x7F;
                int var23 = var21 & 0x7F;
                int var24 = var20 >> 7;
                int var25 = var21 >> 7;
                int var26 = (128 - var22) * arg2[var24][var25] + arg2[var24 + 1][var25] * var22 >> 7;
                int var27 = (128 - var22) * arg2[var24][var25 + 1] + arg2[var24 + 1][var25 + 1] * var22 >> 7;
                int var28 = (128 - var23) * var26 + var23 * var27 >> 7;
                var18.field2080[var19] = this.field2080[var19] + var28 - arg5;
            }
        } else if (arg0 == 2) {
            for (int var29 = 0; var29 < var18.field2084; var29++) {
                int var30 = (this.field2080[var29] << 16) / this.field2092;
                if (var30 < arg1) {
                    int var31 = this.field2047[var29] + arg4;
                    int var32 = this.field2052[var29] + arg6;
                    int var33 = var31 & 0x7F;
                    int var34 = var32 & 0x7F;
                    int var35 = var31 >> 7;
                    int var36 = var32 >> 7;
                    int var37 = (128 - var33) * arg2[var35][var36] + arg2[var35 + 1][var36] * var33 >> 7;
                    int var38 = (128 - var33) * arg2[var35][var36 + 1] + arg2[var35 + 1][var36 + 1] * var33 >> 7;
                    int var39 = (128 - var34) * var37 + var34 * var38 >> 7;
                    var18.field2080[var29] = (arg1 - var30) * (var39 - arg5) / arg1 + this.field2080[var29];
                } else {
                    var18.field2080[var29] = this.field2080[var29];
                }
            }
        } else if (arg0 == 3) {
            int var40 = (arg1 & 0xFF) * 4;
            int var41 = (arg1 >> 8 & 0xFF) * 4;
            this.method866(arg2, arg4, arg5, arg6, var40, var41);
        } else if (arg0 == 4) {
            int var42 = this.field2066 - this.field2092;
            for (int var43 = 0; var43 < this.field2084; var43++) {
                int var44 = this.field2047[var43] + arg4;
                int var45 = this.field2052[var43] + arg6;
                int var46 = var44 & 0x7F;
                int var47 = var45 & 0x7F;
                int var48 = var44 >> 7;
                int var49 = var45 >> 7;
                int var50 = (128 - var46) * arg3[var48][var49] + arg3[var48 + 1][var49] * var46 >> 7;
                int var51 = (128 - var46) * arg3[var48][var49 + 1] + arg3[var48 + 1][var49 + 1] * var46 >> 7;
                int var52 = (128 - var47) * var50 + var47 * var51 >> 7;
                var18.field2080[var43] = var52 + this.field2080[var43] + var42 - arg5;
            }
        } else if (arg0 == 5) {
            int var53 = this.field2066 - this.field2092;
            for (int var54 = 0; var54 < this.field2084; var54++) {
                int var55 = this.field2047[var54] + arg4;
                int var56 = this.field2052[var54] + arg6;
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
                var18.field2080[var54] = ((this.field2080[var54] << 8) / var53 * var67 >> 8) - (arg5 - var63);
            }
        }
        if (arg8) {
            var18.method865();
        } else {
            this.field2055 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Laj;I)I")
    private final int method870(class112 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field2047[arg1];
        int var5 = arg0.field2080[arg1];
        int var6 = arg0.field2052[arg1];
        for (int var7 = 0; var7 < this.field2084; var7++) {
            if (this.field2047[var7] == var4 && this.field2080[var7] == var5 && this.field2052[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field2047[this.field2084] = var4;
            this.field2080[this.field2084] = var5;
            this.field2052[this.field2084] = var6;
            if (arg0.field2051 != null) {
                this.field2051[this.field2084] = arg0.field2051[arg1];
            }
            var3 = this.field2084++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "()Laj;")
    public final class112 method871() {
        class112 var1 = new class112();
        if (this.field2056 != null) {
            var1.field2056 = new byte[this.field2069];
            for (int var2 = 0; var2 < this.field2069; var2++) {
                var1.field2056[var2] = this.field2056[var2];
            }
        }
        var1.field2084 = this.field2084;
        var1.field2069 = this.field2069;
        var1.field2086 = this.field2086;
        var1.field2047 = this.field2047;
        var1.field2080 = this.field2080;
        var1.field2052 = this.field2052;
        var1.field2054 = this.field2054;
        var1.field2073 = this.field2073;
        var1.field2090 = this.field2090;
        var1.field2093 = this.field2093;
        var1.field2071 = this.field2071;
        var1.field2068 = this.field2068;
        var1.field2078 = this.field2078;
        var1.field2075 = this.field2075;
        var1.field2063 = this.field2063;
        var1.field2058 = this.field2058;
        var1.field2065 = this.field2065;
        var1.field2048 = this.field2048;
        var1.field2072 = this.field2072;
        var1.field2094 = this.field2094;
        var1.field2049 = this.field2049;
        var1.field2079 = this.field2079;
        var1.field2076 = this.field2076;
        var1.field2083 = this.field2083;
        var1.field2091 = this.field2091;
        var1.field2081 = this.field2081;
        var1.field2057 = this.field2057;
        var1.field2051 = this.field2051;
        var1.field2088 = this.field2088;
        var1.field2082 = this.field2082;
        var1.field2046 = this.field2046;
        var1.field2061 = this.field2061;
        var1.field2062 = this.field2062;
        var1.field2087 = this.field2087;
        var1.field2059 = this.field2059;
        return var1;
    }

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "()V")
    public final void method872() {
        int var10002;
        if (this.field2051 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2084; var3++) {
                int var7 = this.field2051[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field2082 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; var4++) {
                this.field2082[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field2084) {
                int var6 = this.field2051[var5];
                this.field2082[var6][var1[var6]++] = var5++;
            }
            this.field2051 = null;
        }
        if (this.field2088 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2069; var10++) {
            int var14 = this.field2088[var10];
            var10002 = var8[var14]++;
            if (var14 > var9) {
                var9 = var14;
            }
        }
        this.field2046 = new int[var9 + 1][];
        for (int var11 = 0; var11 <= var9; var11++) {
            this.field2046[var11] = new int[var8[var11]];
            var8[var11] = 0;
        }
        int var12 = 0;
        while (var12 < this.field2069) {
            int var13 = this.field2088[var12];
            this.field2046[var13][var8[var13]++] = var12++;
        }
        this.field2088 = null;
    }

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "()V")
    public final void method873() {
        for (int var1 = 0; var1 < this.field2084; var1++) {
            int var2 = this.field2047[var1];
            this.field2047[var1] = this.field2052[var1];
            this.field2052[var1] = -var2;
        }
        this.method865();
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(IIIII)Lee;")
    public final class255 method874(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class255(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lff;II)Laj;")
    public static final class112 method875(class3 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method23(arg2, 103, arg1);
        return var3 == null ? null : new class112(var3);
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(III)I")
    public final int method876(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2084; var4++) {
            if (this.field2047[var4] == arg0 && this.field2080[var4] == arg1 && this.field2052[var4] == arg2) {
                return var4;
            }
        }
        this.field2047[this.field2084] = arg0;
        this.field2080[this.field2084] = arg1;
        this.field2052[this.field2084] = arg2;
        return this.field2084++;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
    private final void method877(int arg0) {
        int var2 = field2064[arg0];
        int var3 = field2089[arg0];
        for (int var4 = 0; var4 < this.field2084; var4++) {
            int var5 = this.field2080[var4] * var3 - this.field2052[var4] * var2 >> 16;
            this.field2052[var4] = this.field2080[var4] * var2 + this.field2052[var4] * var3 >> 16;
            this.field2080[var4] = var5;
        }
        this.method865();
    }

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "()V")
    public final void method878() {
        this.field2051 = null;
        this.field2088 = null;
        this.field2082 = null;
        this.field2046 = null;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(SS)V")
    public final void method879(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2069; var3++) {
            if (this.field2078[var3] == arg0) {
                this.field2078[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lnb;IIIZ)V")
    public final void method832(class108 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class112 var6 = (class112) arg0;
        var6.method864();
        var6.method859();
        field2077++;
        int var7 = 0;
        int[] var8 = var6.field2047;
        int var9 = var6.field2084;
        for (int var10 = 0; var10 < this.field2084; var10++) {
            class225 var13 = this.field2061[var10];
            if (var13.field3824 != 0) {
                int var14 = this.field2080[var10] - arg2;
                if (var14 >= var6.field2092 && var14 <= var6.field2066) {
                    int var15 = this.field2047[var10] - arg1;
                    if (var15 >= var6.field2060 && var15 <= var6.field2053) {
                        int var16 = this.field2052[var10] - arg3;
                        if (var16 >= var6.field2070 && var16 <= var6.field2050) {
                            for (int var17 = 0; var17 < var9; var17++) {
                                class225 var18 = var6.field2061[var17];
                                if (var8[var17] == var15 && var6.field2052[var17] == var16 && var6.field2080[var17] == var14 && var18.field3824 != 0) {
                                    if (this.field2074 == null) {
                                        this.field2074 = new class225[this.field2084];
                                    }
                                    if (var6.field2074 == null) {
                                        var6.field2074 = new class225[var9];
                                    }
                                    class225 var19 = this.field2074[var10];
                                    if (var19 == null) {
                                        var19 = this.field2074[var10] = new class225(var13);
                                    }
                                    class225 var20 = var6.field2074[var17];
                                    if (var20 == null) {
                                        var20 = var6.field2074[var17] = new class225(var18);
                                    }
                                    var19.field3822 += var18.field3822;
                                    var19.field3833 += var18.field3833;
                                    var19.field3827 += var18.field3827;
                                    var19.field3824 += var18.field3824;
                                    var20.field3822 += var13.field3822;
                                    var20.field3833 += var13.field3833;
                                    var20.field3827 += var13.field3827;
                                    var20.field3824 += var13.field3824;
                                    var7++;
                                    field2067[var10] = field2077;
                                    field2085[var17] = field2077;
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
        for (int var11 = 0; var11 < this.field2069; var11++) {
            if (field2067[this.field2054[var11]] == field2077 && field2067[this.field2073[var11]] == field2077 && field2067[this.field2090[var11]] == field2077) {
                if (this.field2056 == null) {
                    this.field2056 = new byte[this.field2069];
                }
                this.field2056[var11] = 2;
            }
        }
        for (int var12 = 0; var12 < var6.field2069; var12++) {
            if (field2085[var6.field2054[var12]] == field2077 && field2085[var6.field2073[var12]] == field2077 && field2085[var6.field2090[var12]] == field2077) {
                if (var6.field2056 == null) {
                    var6.field2056 = new byte[var6.field2069];
                }
                var6.field2056[var12] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "()V")
    public static void method880() {
        field2067 = null;
        field2085 = null;
        field2064 = null;
        field2089 = null;
    }

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "(III)V")
    public final void method881(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2084; var4++) {
            this.field2047[var4] = this.field2047[var4] * arg0 / 128;
            this.field2080[var4] = this.field2080[var4] * arg1 / 128;
            this.field2052[var4] = this.field2052[var4] * arg2 / 128;
        }
        this.method865();
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(I)V")
    private final void method882(int arg0) {
        int var2 = field2064[arg0];
        int var3 = field2089[arg0];
        for (int var4 = 0; var4 < this.field2084; var4++) {
            int var5 = this.field2080[var4] * var2 + this.field2047[var4] * var3 >> 16;
            this.field2080[var4] = this.field2080[var4] * var3 - this.field2047[var4] * var2 >> 16;
            this.field2047[var4] = var5;
        }
        this.method865();
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIBSB)I")
    public final int method883(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field2054[this.field2069] = arg0;
        this.field2073[this.field2069] = arg1;
        this.field2090[this.field2069] = arg2;
        this.field2056[this.field2069] = arg3;
        this.field2068[this.field2069] = -1;
        this.field2078[this.field2069] = arg4;
        this.field2075[this.field2069] = -1;
        this.field2071[this.field2069] = arg5;
        return this.field2069++;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(III)Lnb;")
    public final class108 method829(int arg0, int arg1, int arg2) {
        return this.method862(this.field2087, this.field2059, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method52(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
    }

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "()V")
    public final void method884() {
        for (int var1 = 0; var1 < this.field2084; var1++) {
            this.field2047[var1] = -this.field2047[var1];
            this.field2052[var1] = -this.field2052[var1];
        }
        this.method865();
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V")
    private class112() {
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "([B)V")
    private class112(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method867(arg0);
        } else {
            this.method860(arg0);
        }
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(III)V")
    public class112(int arg0, int arg1, int arg2) {
        this.field2047 = new int[arg0];
        this.field2080 = new int[arg0];
        this.field2052 = new int[arg0];
        this.field2051 = new int[arg0];
        this.field2054 = new int[arg1];
        this.field2073 = new int[arg1];
        this.field2090 = new int[arg1];
        this.field2056 = new byte[arg1];
        this.field2093 = new byte[arg1];
        this.field2071 = new byte[arg1];
        this.field2078 = new short[arg1];
        this.field2075 = new short[arg1];
        this.field2068 = new byte[arg1];
        this.field2088 = new int[arg1];
        if (arg2 > 0) {
            this.field2058 = new byte[arg2];
            this.field2065 = new short[arg2];
            this.field2048 = new short[arg2];
            this.field2072 = new short[arg2];
            this.field2094 = new short[arg2];
            this.field2049 = new short[arg2];
            this.field2079 = new short[arg2];
            this.field2076 = new byte[arg2];
            this.field2083 = new byte[arg2];
            this.field2091 = new byte[arg2];
            this.field2081 = new byte[arg2];
            this.field2057 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "([Laj;I)V")
    public class112(class112[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field2084 = 0;
        this.field2069 = 0;
        this.field2086 = 0;
        this.field2063 = -1;
        for (int var9 = 0; var9 < arg1; var9++) {
            class112 var15 = arg0[var9];
            if (var15 != null) {
                this.field2084 += var15.field2084;
                this.field2069 += var15.field2069;
                this.field2086 += var15.field2086;
                if (var15.field2093 == null) {
                    if (this.field2063 == -1) {
                        this.field2063 = var15.field2063;
                    }
                    if (this.field2063 != var15.field2063) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var15.field2056 != null;
                var5 |= var15.field2071 != null;
                var6 |= var15.field2088 != null;
                var7 |= var15.field2075 != null;
                var8 |= var15.field2068 != null;
            }
        }
        this.field2047 = new int[this.field2084];
        this.field2080 = new int[this.field2084];
        this.field2052 = new int[this.field2084];
        this.field2051 = new int[this.field2084];
        this.field2054 = new int[this.field2069];
        this.field2073 = new int[this.field2069];
        this.field2090 = new int[this.field2069];
        if (var3) {
            this.field2056 = new byte[this.field2069];
        }
        if (var4) {
            this.field2093 = new byte[this.field2069];
        }
        if (var5) {
            this.field2071 = new byte[this.field2069];
        }
        if (var6) {
            this.field2088 = new int[this.field2069];
        }
        if (var7) {
            this.field2075 = new short[this.field2069];
        }
        if (var8) {
            this.field2068 = new byte[this.field2069];
        }
        this.field2078 = new short[this.field2069];
        if (this.field2086 > 0) {
            this.field2058 = new byte[this.field2086];
            this.field2065 = new short[this.field2086];
            this.field2048 = new short[this.field2086];
            this.field2072 = new short[this.field2086];
            this.field2094 = new short[this.field2086];
            this.field2049 = new short[this.field2086];
            this.field2079 = new short[this.field2086];
            this.field2076 = new byte[this.field2086];
            this.field2083 = new byte[this.field2086];
            this.field2091 = new byte[this.field2086];
            this.field2081 = new byte[this.field2086];
            this.field2057 = new byte[this.field2086];
        }
        this.field2084 = 0;
        this.field2069 = 0;
        this.field2086 = 0;
        for (int var10 = 0; var10 < arg1; var10++) {
            class112 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field2069; var12++) {
                    if (var3 && var11.field2056 != null) {
                        this.field2056[this.field2069] = var11.field2056[var12];
                    }
                    if (var4) {
                        if (var11.field2093 == null) {
                            this.field2093[this.field2069] = var11.field2063;
                        } else {
                            this.field2093[this.field2069] = var11.field2093[var12];
                        }
                    }
                    if (var5 && var11.field2071 != null) {
                        this.field2071[this.field2069] = var11.field2071[var12];
                    }
                    if (var6 && var11.field2088 != null) {
                        this.field2088[this.field2069] = var11.field2088[var12];
                    }
                    if (var7) {
                        if (var11.field2075 == null) {
                            this.field2075[this.field2069] = -1;
                        } else {
                            this.field2075[this.field2069] = var11.field2075[var12];
                        }
                    }
                    if (var8) {
                        if (var11.field2068 == null || var11.field2068[var12] == -1) {
                            this.field2068[this.field2069] = -1;
                        } else {
                            this.field2068[this.field2069] = (byte) (var11.field2068[var12] + this.field2086);
                        }
                    }
                    this.field2078[this.field2069] = var11.field2078[var12];
                    this.field2054[this.field2069] = this.method870(var11, var11.field2054[var12]);
                    this.field2073[this.field2069] = this.method870(var11, var11.field2073[var12]);
                    this.field2090[this.field2069] = this.method870(var11, var11.field2090[var12]);
                    this.field2069++;
                }
                for (int var13 = 0; var13 < var11.field2086; var13++) {
                    byte var14 = this.field2058[this.field2086] = var11.field2058[var13];
                    if (var14 == 0) {
                        this.field2065[this.field2086] = (short) this.method870(var11, var11.field2065[var13]);
                        this.field2048[this.field2086] = (short) this.method870(var11, var11.field2048[var13]);
                        this.field2072[this.field2086] = (short) this.method870(var11, var11.field2072[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field2065[this.field2086] = var11.field2065[var13];
                        this.field2048[this.field2086] = var11.field2048[var13];
                        this.field2072[this.field2086] = var11.field2072[var13];
                        this.field2094[this.field2086] = var11.field2094[var13];
                        this.field2049[this.field2086] = var11.field2049[var13];
                        this.field2079[this.field2086] = var11.field2079[var13];
                        this.field2076[this.field2086] = var11.field2076[var13];
                        this.field2083[this.field2086] = var11.field2083[var13];
                        this.field2091[this.field2086] = var11.field2091[var13];
                    }
                    if (var14 == 2) {
                        this.field2081[this.field2086] = var11.field2081[var13];
                        this.field2057[this.field2086] = var11.field2057[var13];
                    }
                    this.field2086++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Laj;ZZZZ)V")
    public class112(class112 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2084 = arg0.field2084;
        this.field2069 = arg0.field2069;
        this.field2086 = arg0.field2086;
        if (arg1) {
            this.field2047 = arg0.field2047;
            this.field2080 = arg0.field2080;
            this.field2052 = arg0.field2052;
        } else {
            this.field2047 = new int[this.field2084];
            this.field2080 = new int[this.field2084];
            this.field2052 = new int[this.field2084];
            for (int var6 = 0; var6 < this.field2084; var6++) {
                this.field2047[var6] = arg0.field2047[var6];
                this.field2080[var6] = arg0.field2080[var6];
                this.field2052[var6] = arg0.field2052[var6];
            }
        }
        if (arg2) {
            this.field2078 = arg0.field2078;
        } else {
            this.field2078 = new short[this.field2069];
            for (int var7 = 0; var7 < this.field2069; var7++) {
                this.field2078[var7] = arg0.field2078[var7];
            }
        }
        if (arg3 || arg0.field2075 == null) {
            this.field2075 = arg0.field2075;
        } else {
            this.field2075 = new short[this.field2069];
            for (int var8 = 0; var8 < this.field2069; var8++) {
                this.field2075[var8] = arg0.field2075[var8];
            }
        }
        if (arg4) {
            this.field2071 = arg0.field2071;
        } else {
            this.field2071 = new byte[this.field2069];
            if (arg0.field2071 == null) {
                for (int var9 = 0; var9 < this.field2069; var9++) {
                    this.field2071[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2069; var10++) {
                    this.field2071[var10] = arg0.field2071[var10];
                }
            }
        }
        this.field2054 = arg0.field2054;
        this.field2073 = arg0.field2073;
        this.field2090 = arg0.field2090;
        this.field2056 = arg0.field2056;
        this.field2093 = arg0.field2093;
        this.field2068 = arg0.field2068;
        this.field2063 = arg0.field2063;
        this.field2058 = arg0.field2058;
        this.field2065 = arg0.field2065;
        this.field2048 = arg0.field2048;
        this.field2072 = arg0.field2072;
        this.field2094 = arg0.field2094;
        this.field2049 = arg0.field2049;
        this.field2079 = arg0.field2079;
        this.field2076 = arg0.field2076;
        this.field2083 = arg0.field2083;
        this.field2091 = arg0.field2091;
        this.field2081 = arg0.field2081;
        this.field2057 = arg0.field2057;
        this.field2051 = arg0.field2051;
        this.field2088 = arg0.field2088;
        this.field2082 = arg0.field2082;
        this.field2046 = arg0.field2046;
        this.field2061 = arg0.field2061;
        this.field2062 = arg0.field2062;
        this.field2074 = arg0.field2074;
        this.field2087 = arg0.field2087;
        this.field2059 = arg0.field2059;
    }
}
