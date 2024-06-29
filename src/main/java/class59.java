import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class59 extends class114 {

    @OriginalMember(owner = "client!qb", name = "y", descriptor = "I")
    private int field930 = -1;

    @OriginalMember(owner = "client!qb", name = "L", descriptor = "I")
    private int field943 = -1;

    @OriginalMember(owner = "client!qb", name = "x", descriptor = "Ldi;")
    private class179 field929 = null;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
    private int field923 = -32768;

    @OriginalMember(owner = "client!qb", name = "M", descriptor = "Z")
    private boolean field944 = false;

    @OriginalMember(owner = "client!qb", name = "N", descriptor = "I")
    private int field945;

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "I")
    private int field931;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
    private int field920;

    @OriginalMember(owner = "client!qb", name = "G", descriptor = "I")
    private int field938;

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "I")
    private int field927;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
    private int field921;

    @OriginalMember(owner = "client!qb", name = "w", descriptor = "I")
    private int field928;

    @OriginalMember(owner = "client!qb", name = "P", descriptor = "I")
    private int field947;

    @OriginalMember(owner = "client!qb", name = "A", descriptor = "Lcc;")
    private class215 field932;

    @OriginalMember(owner = "client!qb", name = "B", descriptor = "I")
    private int field933;

    @OriginalMember(owner = "client!qb", name = "O", descriptor = "I")
    private int field946;

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "[I")
    public static int[] field926 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!qb", name = "F", descriptor = "Ljava/lang/String;")
    public static String field937 = "Loading fonts - ";

    @OriginalMember(owner = "client!qb", name = "E", descriptor = "Ljl;")
    public static class253 field936 = new class253(16);

    @OriginalMember(owner = "client!qb", name = "R", descriptor = "I")
    public static int field949 = 0;

    @OriginalMember(owner = "client!qb", name = "S", descriptor = "S")
    public static short field950 = 32767;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!qb", name = "C", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!qb", name = "D", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!qb", name = "H", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!qb", name = "I", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!qb", name = "J", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!qb", name = "K", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!qb", name = "Q", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "Ls;")
    private class245 field922;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)V")
    public static void method389(byte arg0) {
        if (arg0 > -9) {
            method389((byte) -67);
        }
        field926 = null;
        field936 = null;
        field937 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZI)Lsk;")
    private final class114 method390(boolean arg0, int arg1) {
        field925++;
        boolean var3 = class67.field1072 != class297.field4695;
        class288 var4 = class274.method1816(45, this.field938);
        if (var4.field4336 != null) {
            var4 = var4.method1906((byte) -115);
        }
        if (var4 == null) {
            this.field943 = this.field928;
            this.field930 = -1;
            return null;
        }
        if (!this.field944 && this.field930 != var4.field4323) {
            this.method394(-85, -1);
        }
        int var5 = this.field921 & 0x3;
        int var6;
        int var7;
        if (~var5 == arg1 || var5 == 3) {
            var7 = var4.field4307;
            var6 = var4.field4383;
        } else {
            var6 = var4.field4307;
            var7 = var4.field4383;
        }
        int var8 = (var6 >> 1) + this.field945;
        int var9 = (var6 + 1 >> 1) + this.field945;
        int var10 = (var7 >> 1) + this.field927;
        int var11 = (var7 + 1 >> 1) + this.field927;
        this.method393(var8 * 128, true, var10 * 128);
        boolean var12 = !var3 && var4.field4309 && (this.field930 != var4.field4323 || (this.field943 != this.field928 || this.field932 != null && (this.field932.field3231 || class258.field3932) && this.field933 != this.field928) && class166.field2550 >= 2);
        if (arg0 && !var12) {
            this.field930 = var4.field4323;
            this.field943 = this.field928;
            return null;
        }
        int[][] var13 = class67.field1072[this.field931];
        int var14 = var13[var10][var8] + var13[var11][var9] - (-var13[var10][var9] - var13[var11][var8]) >> 2;
        int var15 = (this.field927 << 7) + (var7 << 6);
        int var16 = (this.field945 << 7) + (var6 << 6);
        int[][] var17 = null;
        boolean var18 = this.field929 == null;
        if (var3) {
            var17 = class297.field4695[0];
        } else if (this.field931 < 3) {
            var17 = class67.field1072[this.field931 + 1];
        }
        class165 var19;
        if (this.field932 == null) {
            var19 = var4.method1905(arg1 ^ 0xFFFFFCFE, var16, var18 ? class140.field2050 : this.field929, this.field920, var14, this.field921, var15, var13, var12, false, var17);
        } else {
            var19 = var4.method1896(var13, this.field933, var18 ? class140.field2050 : this.field929, this.field921, var17, this.field920, this.field932, var12, var16, arg1 ^ 0x7897, var14, this.field928, var15, this.field946);
        }
        if (var19 == null) {
            this.field943 = this.field928;
            this.field930 = var4.field4323;
            return null;
        } else {
            this.field943 = this.field928;
            this.field930 = var4.field4323;
            return var19.field2542;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IZ)I")
    public static final int method391(int arg0, boolean arg1) {
        if (arg1) {
            method389((byte) -71);
        }
        field924++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIII)V")
    public final void method98(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field941++;
        this.method393(arg4, true, arg3);
    }

    @OriginalMember(owner = "client!qb", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field919++;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIIIIJILs;)V")
    public final void method90(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class245 arg10) {
        field934++;
        class114 var13 = this.method392(1381907206);
        if (var13 != null) {
            var13.method90(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field922);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)Lsk;")
    public final class114 method392(int arg0) {
        if (arg0 != 1381907206) {
            this.method392(-120);
        }
        field940++;
        return this.method390(false, arg0 - 1381907208);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "()I")
    public final int method81() {
        field939++;
        return this.field923;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IZI)V")
    private final void method393(int arg0, boolean arg1, int arg2) {
        field942++;
        if (!arg1) {
            return;
        }
        label90: while (true) {
            if (this.field932 == null) {
                if (this.field944) {
                    return;
                }
                this.method394(-94, -1);
                if (this.field932 == null) {
                    return;
                }
            }
            int var4 = class270.field4058 - this.field947;
            if (var4 > 100 && this.field932.field3218 > 0) {
                int var5 = this.field932.field3215.length - this.field932.field3218;
                while (var5 > this.field928 && this.field932.field3219[this.field928] < var4) {
                    var4 -= this.field932.field3219[this.field928];
                    this.field928++;
                }
                if (var5 <= this.field928) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field932.field3215.length; var7++) {
                        var6 += this.field932.field3219[var7];
                    }
                    var4 %= var6;
                }
                this.field933 = this.field928 + 1;
                if (this.field932.field3215.length <= this.field933) {
                    this.field933 -= this.field932.field3218;
                    if (this.field933 < 0 || this.field933 >= this.field932.field3215.length) {
                        this.field933 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field932.field3219[this.field928] >= var4) {
                            this.field946 = var4;
                            this.field947 = class270.field4058 - var4;
                            return;
                        }
                        client.method966((byte) 52, this.field928, false, arg0, this.field932, arg2);
                        var4 -= this.field932.field3219[this.field928];
                        this.field928++;
                        if (this.field932.field3215.length <= this.field928) {
                            this.field928 -= this.field932.field3218;
                            if (this.field928 < 0 || this.field932.field3215.length <= this.field928) {
                                this.field932 = null;
                                continue label90;
                            }
                        }
                        this.field933 = this.field928 + 1;
                    } while (this.field932.field3215.length > this.field933);
                    this.field933 -= this.field932.field3218;
                } while (this.field933 >= 0 && this.field932.field3215.length > this.field933);
                this.field933 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)V")
    private final void method394(int arg0, int arg1) {
        field935++;
        int var3 = arg1;
        boolean var4 = false;
        if (arg1 == -1) {
            class288 var5 = class274.method1816(100, this.field938);
            class288 var6 = var5;
            if (var5.field4336 != null) {
                var5 = var5.method1906((byte) -116);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field4345 != null) {
                if (this.field932 != null && var5.method1910(true, this.field932.field3230)) {
                    return;
                }
                var3 = var5.method1895(-105);
                if (this.field930 != var5.field4323) {
                    var4 = var5.field4343;
                }
            } else if (var5.field4357 == -1) {
                if (var6 != null && var6.field4345 != null) {
                    if (this.field932 != null && var6.method1910(true, this.field932.field3230)) {
                        return;
                    }
                    var3 = var6.method1895(-61);
                    if (this.field930 != var6.field4323) {
                        var4 = var6.field4343;
                    }
                } else if (var6 != null && var6.field4357 != -1 && this.field930 != var6.field4323) {
                    var3 = var6.field4357;
                    var4 = var6.field4343;
                }
            } else if (this.field930 != var5.field4323) {
                var3 = var5.field4357;
                var4 = var5.field4343;
            }
        }
        if (var3 == -1) {
            this.field932 = null;
            return;
        }
        if (this.field932 == null || this.field932.field3230 != var3) {
            this.field932 = class276.method1829(var3, 29223);
        } else if (this.field932.field3220 == 0) {
            return;
        }
        if (var4) {
            this.field928 = (int) (Math.random() * (double) this.field932.field3215.length);
            this.field946 = (int) (Math.random() * (double) this.field932.field3219[this.field928]) + 1;
        } else {
            this.field928 = 0;
            this.field946 = 1;
        }
        if (arg0 > -74) {
            this.method90(64, -12, -89, 23, -123, -1, -38, 92, -101L, -25, (class245) null);
        }
        this.field933 = this.field928 + 1;
        if (this.field933 < 0 || this.field933 >= this.field932.field3215.length) {
            this.field933 = -1;
        }
        this.field947 = class270.field4058 - this.field946;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(IIIIIIIZLsk;)V")
    public class59(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class114 arg8) {
        this.field945 = arg5;
        this.field931 = arg3;
        this.field920 = arg1;
        this.field938 = arg0;
        this.field927 = arg4;
        this.field921 = arg2;
        if (arg8 != null) {
            this.field944 = true;
            if (arg8 instanceof class59) {
                class59 var10 = (class59) arg8;
                this.field928 = var10.field928;
                this.field947 = var10.field947;
                this.field932 = var10.field932;
                this.field933 = var10.field933;
                this.field946 = var10.field946;
            }
        }
        if (this.field944) {
            this.method394(-86, arg6);
        }
    }
}
