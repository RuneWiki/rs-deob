import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class123 {

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "[I")
    private int[] field1918;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "[I")
    private int[] field1923;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "Lrh;")
    private class110 field1912;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "Lrh;")
    private class110 field1919;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "[Lrh;")
    private class110[] field1915;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "Lfe;")
    public static class248 field1920 = new class248(128);

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
    public static int field1926 = -1;

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "I")
    public static int field1927 = 0;

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "I")
    public static int field1929 = 0;

    @OriginalMember(owner = "client!tf", name = "t", descriptor = "J")
    public static long field1931 = 0L;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "[I")
    public static int[] field1928;

    @OriginalMember(owner = "client!tf", name = "s", descriptor = "[[[B")
    public static byte[][][] field1930;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Llm;IZZLse;IDI)[I", line = 6)
    public final int[] method886(class210 arg0, int arg1, boolean arg2, boolean arg3, class105 arg4, int arg5, double arg6, int arg7) {
        field1925++;
        int[] var10 = new int[arg1 * arg5];
        class57.method377(arg6, (byte) 116);
        class190.field2830 = arg0;
        class126.field1971 = arg4;
        class257.method1741(arg5, 31497, arg1);
        for (int var11 = 0; var11 < this.field1915.length; var11++) {
            this.field1915[var11].method765(arg5, arg1, arg7 ^ 0x120);
        }
        int var12;
        int var13;
        byte var14;
        if (arg2) {
            var12 = arg1 - 1;
            var13 = -1;
            var14 = -1;
        } else {
            var12 = 0;
            var13 = arg1;
            var14 = 1;
        }
        int var15 = arg7;
        for (int var16 = 0; var16 < arg5; var16++) {
            if (arg3) {
                var15 = var16;
            }
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field1912.field1705) {
                int[] var17 = this.field1912.method46(1, var16);
                var18 = var17;
                var19 = var17;
                var20 = var17;
            } else {
                int[][] var21 = this.field1912.method445(var16, false);
                var19 = var21[0];
                var18 = var21[1];
                var20 = var21[2];
            }
            for (int var22 = var12; var22 != var13; var22 += var14) {
                int var23 = var19[var22] >> 4;
                int var24 = var18[var22] >> 4;
                int var25 = var20[var22] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = class185.field2765[var25];
                int var27 = class185.field2765[var23];
                int var28 = class185.field2765[var24];
                var10[var15++] = (var27 << 16) + (var28 << 8) + var26;
                if (arg3) {
                    var15 += arg1 - 1;
                }
            }
        }
        for (int var29 = 0; var29 < this.field1915.length; var29++) {
            this.field1915[var29].method768(-3321);
        }
        return var10;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)V", line = 136)
    public static void method887(boolean arg0) {
        field1930 = (byte[][][]) null;
        field1920 = null;
        field1928 = null;
        if (!arg0) {
            method891(113, 43);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIDLse;IZLlm;)[B", line = 152)
    public final byte[] method888(int arg0, int arg1, double arg2, class105 arg3, int arg4, boolean arg5, class210 arg6) {
        if (arg0 != 4) {
            field1920 = (class248) null;
        }
        field1913++;
        byte[] var9 = new byte[arg1 * arg4 * 4];
        class57.method377(arg2, (byte) 117);
        class126.field1971 = arg3;
        class190.field2830 = arg6;
        class257.method1741(arg1, 31497, arg4);
        for (int var10 = 0; var10 < this.field1915.length; var10++) {
            this.field1915[var10].method765(arg1, arg4, 288);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            if (arg5) {
                var11 = var12 << 2;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field1912.field1705) {
                int[] var17 = this.field1912.method46(arg0 - 3, var12);
                var14 = var17;
                var15 = var17;
                var16 = var17;
            } else {
                int[][] var13 = this.field1912.method445(var12, false);
                var14 = var13[0];
                var15 = var13[1];
                var16 = var13[2];
            }
            int[] var18;
            if (this.field1919.field1705) {
                var18 = this.field1919.method46(1, var12);
            } else {
                var18 = this.field1919.method445(var12, false)[0];
            }
            for (int var19 = arg4 - 1; var19 >= 0; var19--) {
                int var20 = var14[var19] >> 4;
                int var21 = var16[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                int var22 = var15[var19] >> 4;
                if (var20 < 0) {
                    var20 = 0;
                }
                if (var21 > 255) {
                    var21 = 255;
                }
                int var23 = class185.field2765[var20];
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var24 = class185.field2765[var22];
                int var25 = class185.field2765[var21];
                int var26;
                if (var23 == 0 && var24 == 0 && var25 == 0) {
                    var26 = 0;
                } else {
                    var26 = var18[var19] >> 4;
                    if (var26 > 255) {
                        var26 = 255;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                }
                var9[var11++] = (byte) var23;
                var9[var11++] = (byte) var24;
                var9[var11++] = (byte) var25;
                var9[var11++] = (byte) var26;
                if (arg5) {
                    var11 += (arg4 << 2) - 4;
                }
            }
        }
        for (int var27 = 0; var27 < this.field1915.length; var27++) {
            this.field1915[var27].method768(-3321);
        }
        return var9;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lse;Llm;I)Z", line = 296)
    public final boolean method889(class105 arg0, class210 arg1, int arg2) {
        field1914++;
        if (class193.field2887 > arg2) {
            for (int var4 = 0; var4 < this.field1918.length; var4++) {
                if (!arg1.method1463(class193.field2887, (byte) -55, this.field1918[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field1918.length; var5++) {
                if (!arg1.method1431(this.field1918[var5], -104)) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field1923.length; var6++) {
            if (!arg0.method736(false, this.field1923[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z[BI)Ljava/lang/Object;", line = 347)
    public static final Object method890(boolean arg0, byte[] arg1, int arg2) {
        if (arg2 != -12641) {
            field1931 = 50L;
        }
        field1916++;
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136 && !class124.field1940) {
            try {
                class278 var3 = (class278) Class.forName("pb").getDeclaredConstructor().newInstance();
                var3.method1943(arg1, (byte) -32);
                return var3;
            } catch (Throwable var5) {
                class124.field1940 = true;
            }
        }
        return arg0 ? class235.method1613(arg1, 354978147) : arg1;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)V", line = 382)
    public static final void method891(int arg0, int arg1) {
        if (arg1 <= -109) {
            field1917++;
            class169 var2 = class101.method712(arg0, 11, 2089666400);
            var2.method1178((byte) 110);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILlm;II)[Lle;", line = 396)
    public static final class127[] method892(int arg0, class210 arg1, int arg2, int arg3) {
        if (arg3 == -1) {
            field1921++;
            return class249.method1680(arg0, arg1, arg2, (byte) 71) ? class36.method252(0) : null;
        } else {
            return (class127[]) null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V", line = 413)
    public class123() {
        this.field1918 = new int[0];
        this.field1923 = new int[0];
        this.field1912 = new class171();
        this.field1912.field1702 = 1;
        this.field1919 = new class171();
        this.field1919.field1702 = 1;
        this.field1915 = new class110[] { this.field1912, this.field1919 };
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lre;)V", line = 428)
    public class123(class263 arg0) {
        int var2 = arg0.method1787(false);
        int var3 = 0;
        this.field1915 = new class110[var2];
        int var4 = 0;
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class110 var7 = class256.method1740((byte) -80, arg0);
            if (var7.method766(32224) >= 0) {
                var3++;
            }
            if (var7.method767(0) >= 0) {
                var4++;
            }
            int var8 = var7.field1703.length;
            var5[var6] = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                var5[var6][var9] = arg0.method1787(false);
            }
            this.field1915[var6] = var7;
        }
        this.field1918 = new int[var3];
        int var10 = 0;
        this.field1923 = new int[var4];
        int var11 = 0;
        for (int var12 = 0; var12 < var2; var12++) {
            class110 var13 = this.field1915[var12];
            int var14 = var13.field1703.length;
            for (int var15 = 0; var15 < var14; var15++) {
                var13.field1703[var15] = this.field1915[var5[var12][var15]];
            }
            int var16 = var13.method766(32224);
            int var17 = var13.method767(0);
            if (var16 > 0) {
                this.field1918[var10++] = var16;
            }
            if (var17 > 0) {
                this.field1923[var11++] = var17;
            }
            var5[var12] = null;
        }
        this.field1912 = this.field1915[arg0.method1787(false)];
        int[][] var18 = (int[][]) null;
        this.field1919 = this.field1915[arg0.method1787(false)];
    }
}
