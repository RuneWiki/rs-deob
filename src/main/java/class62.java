import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class62 extends class166 {

    @OriginalMember(owner = "client!qc", name = "F", descriptor = "I")
    private int field1289 = -1;

    @OriginalMember(owner = "client!qc", name = "H", descriptor = "I")
    private int field1291 = -32768;

    @OriginalMember(owner = "client!qc", name = "G", descriptor = "I")
    private int field1290 = -1;

    @OriginalMember(owner = "client!qc", name = "K", descriptor = "Lfe;")
    private class155 field1294 = null;

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "I")
    private int field1278;

    @OriginalMember(owner = "client!qc", name = "L", descriptor = "I")
    private int field1295;

    @OriginalMember(owner = "client!qc", name = "y", descriptor = "I")
    private int field1282;

    @OriginalMember(owner = "client!qc", name = "x", descriptor = "I")
    private int field1281;

    @OriginalMember(owner = "client!qc", name = "O", descriptor = "I")
    private int field1298;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
    private int field1272;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "Lfc;")
    private class31 field1271;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
    private int field1277;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
    private int field1270;

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "Lia;")
    public static class257 field1279 = class28.method234(-105, "<col=c0ff00>");

    @OriginalMember(owner = "client!qc", name = "C", descriptor = "I")
    public static int field1286 = 0;

    @OriginalMember(owner = "client!qc", name = "M", descriptor = "Lia;")
    public static class257 field1296 = class28.method234(-103, "::errortest");

    @OriginalMember(owner = "client!qc", name = "N", descriptor = "[I")
    public static int[] field1297 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!qc", name = "w", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!qc", name = "A", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!qc", name = "B", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!qc", name = "D", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!qc", name = "E", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!qc", name = "I", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!qc", name = "J", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!qc", name = "P", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "[I")
    public static int[] field1276;

    @OriginalMember(owner = "client!qc", name = "z", descriptor = "[[B")
    public static byte[][] field1283;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lme;III)V")
    public static final void method463(class44 arg0, int arg1, int arg2, int arg3) {
        field1292++;
        if (class9.field177 != 0 && class9.field177 != 3 || !arg0.method338((byte) 113)) {
            return;
        }
        int var4 = arg0.field1010[arg2];
        if (arg3 != 7829) {
            field1283 = null;
        }
        if (var4 > arg1 || (arg0.field974[arg2] + var4) < arg1) {
            return;
        }
        int var5 = arg2 - arg0.field981 / 2;
        int var6 = class25.field479 + class215.field3648 & 0x7FF;
        int var7 = arg1 - arg0.field926 / 2;
        int var8 = class101.field1872[var6];
        int var9 = (class95.field1796 + 256) * var8 >> 8;
        int var10 = class101.field1871[var6];
        int var11 = (class95.field1796 + 256) * var10 >> 8;
        int var12 = var5 * var11 - var7 * var9 >> 11;
        int var13 = var5 * var9 + var7 * var11 >> 11;
        int var14 = class137.field2441.field4177 + var13 >> 7;
        int var15 = class137.field2441.field4143 - var12 >> 7;
        boolean var16 = class178.method1199(class137.field2441.field4119[0], (byte) 124, var14, 0, 0, 0, var15, class137.field2441.field4182[0], 0, true, 1, 0);
        if (!var16) {
            return;
        }
        class205.field3524.method1023(arg3 ^ 0x2D1E, var7);
        class205.field3524.method1023(13195, var5);
        class205.field3524.method1065(class25.field479, 1210792072);
        class205.field3524.method1023(arg3 + 5366, 57);
        class205.field3524.method1023(13195, class215.field3648);
        class205.field3524.method1023(arg3 + 5366, class95.field1796);
        class205.field3524.method1023(13195, 89);
        class205.field3524.method1065(class137.field2441.field4177, 1210792072);
        class205.field3524.method1065(class137.field2441.field4143, 1210792072);
        class205.field3524.method1023(13195, class71.field1392);
        class205.field3524.method1023(13195, 63);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method3(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        class166 var11 = this.method467(1);
        field1293++;
        if (var11 != null) {
            var11.method3(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field1291 = var11.method2();
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(III)V")
    private final void method464(int arg0, int arg1, int arg2) {
        if (this.field1271 != null) {
            int var4 = class7.field153 - this.field1277;
            if (var4 > 100 && this.field1271.field586 > 0) {
                int var5 = this.field1271.field589.length - this.field1271.field586;
                while (var5 > this.field1270 && this.field1271.field603[this.field1270] < var4) {
                    var4 -= this.field1271.field603[this.field1270];
                    this.field1270++;
                }
                if (this.field1270 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field1271.field589.length; var7++) {
                        var6 += this.field1271.field603[var7];
                    }
                    var4 %= var6;
                }
            }
            label62: {
                do {
                    do {
                        if (this.field1271.field603[this.field1270] >= var4) {
                            break label62;
                        }
                        class132.method918(arg0, false, this.field1270, this.field1271, arg1 - 93, arg2);
                        var4 -= this.field1271.field603[this.field1270];
                        this.field1270++;
                    } while (this.field1271.field589.length > this.field1270);
                    this.field1270 -= this.field1271.field586;
                } while (this.field1270 >= 0 && this.field1271.field589.length > this.field1270);
                this.field1271 = null;
            }
            this.field1277 = class7.field153 - var4;
        }
        if (arg1 == -1) {
            field1274++;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V")
    public static void method465(boolean arg0) {
        field1283 = null;
        if (!arg0) {
            method463((class44) null, 105, -13, -67);
        }
        field1279 = null;
        field1276 = null;
        field1296 = null;
        field1297 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
    public static final void method466(byte arg0) {
        int[] var1 = new int[class148.field2573];
        field1280++;
        int var2 = 0;
        for (int var3 = 0; var3 < class148.field2573; var3++) {
            class14 var5 = class156.method1090(var3, 0);
            if (var5.field276 >= 0 || var5.field289 >= 0) {
                var1[var2++] = var3;
            }
        }
        class226.field3802 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class226.field3802[var4] = var1[var4];
        }
        if (arg0 <= 89) {
            field1276 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)Lij;")
    private final class166 method467(int arg0) {
        field1285++;
        if (arg0 != 1) {
            this.field1298 = 32;
        }
        return this.method470(false, -66);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIZ)V")
    public final void method468(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1287++;
        this.method464(((arg1 - arg0 >> 1) + arg0) * 128 + 64, -1, ((-arg2 + arg3 >> 1) + arg2) * 128 + 64);
        if (arg4) {
            this.field1282 = -62;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIII)V")
    public static final void method469(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1288++;
        if (arg2 != -23262) {
            return;
        }
        for (int var6 = arg1; var6 <= arg1 + arg5; var6++) {
            for (int var11 = arg3; var11 <= arg3 + arg4; var11++) {
                if (var11 >= 0 && var11 < 104 && var6 >= 0 && var6 < 104) {
                    class2.field64[arg0][var11][var6] = 127;
                }
            }
        }
        for (int var7 = arg1; var7 < (arg1 + arg5); var7++) {
            for (int var10 = arg3; var10 < arg3 + arg4; var10++) {
                if (var10 >= 0 && var10 < 104 && var7 >= 0 && var7 < 104) {
                    class243.field4208[arg0][var10][var7] = arg0 > 0 ? class243.field4208[arg0 - 1][var10][var7] : 0;
                }
            }
        }
        if (arg3 > 0 && arg3 < 104) {
            for (int var8 = arg1 + 1; var8 < arg1 + arg5; var8++) {
                if (var8 >= 0 && var8 < 104) {
                    class243.field4208[arg0][arg3][var8] = class243.field4208[arg0][arg3 - 1][var8];
                }
            }
        }
        if (arg1 > 0 && arg1 < 104) {
            for (int var9 = arg3 + 1; var9 < arg3 + arg4; var9++) {
                if (var9 >= 0 && var9 < 104) {
                    class243.field4208[arg0][var9][arg1] = class243.field4208[arg0][var9][arg1 - 1];
                }
            }
        }
        if (arg3 < 0 || arg1 < 0 || arg3 >= 104 || arg1 >= 104) {
            return;
        }
        if (arg0 == 0) {
            if (arg3 > 0 && class243.field4208[arg0][arg3 - 1][arg1] != 0) {
                class243.field4208[arg0][arg3][arg1] = class243.field4208[arg0][arg3 - 1][arg1];
                return;
            }
            if (arg1 > 0 && class243.field4208[arg0][arg3][arg1 - 1] != 0) {
                class243.field4208[arg0][arg3][arg1] = class243.field4208[arg0][arg3][arg1 - 1];
                return;
            }
            if (arg3 > 0 && arg1 > 0 && class243.field4208[arg0][arg3 - 1][arg1 - 1] != 0) {
                class243.field4208[arg0][arg3][arg1] = class243.field4208[arg0][arg3 - 1][arg1 - 1];
                return;
            }
        } else if (arg3 <= 0 || class243.field4208[arg0][arg3 - 1][arg1] == class243.field4208[arg0 - 1][arg3 - 1][arg1]) {
            if (arg1 > 0 && class243.field4208[arg0][arg3][arg1 - 1] != class243.field4208[arg0 - 1][arg3][arg1 - 1]) {
                class243.field4208[arg0][arg3][arg1] = class243.field4208[arg0][arg3][arg1 - 1];
                return;
            }
            if (arg3 > 0 && arg1 > 0 && class243.field4208[arg0 - 1][arg3 - 1][arg1 - 1] != class243.field4208[arg0][arg3 - 1][arg1 - 1]) {
                class243.field4208[arg0][arg3][arg1] = class243.field4208[arg0][arg3 - 1][arg1 - 1];
                return;
            }
            return;
        } else {
            class243.field4208[arg0][arg3][arg1] = class243.field4208[arg0][arg3 - 1][arg1];
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZI)Lij;")
    private final class166 method470(boolean arg0, int arg1) {
        boolean var3 = class243.field4208 != class159.field2793;
        field1299++;
        class233 var4 = class5.method96(this.field1278, false);
        if (var4.field3952 != null) {
            var4 = var4.method1537((byte) 87);
        }
        if (var4 == null) {
            return null;
        }
        int var5 = this.field1295 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var7 = var4.field3986;
            var6 = var4.field3950;
        } else {
            var6 = var4.field3986;
            var7 = var4.field3950;
        }
        int var8 = (var7 + 1 >> 1) + this.field1272;
        int var9 = this.field1298 + (var6 + 1 >> 1);
        int var10 = this.field1272 + (var7 >> 1);
        int var11 = (var6 >> 1) + this.field1298;
        this.method464(var11 * 128, -1, var10 * 128);
        if (arg1 > -39) {
            this.field1291 = 70;
        }
        boolean var12 = !var3 && var4.field3961 && (this.field1290 != var4.field4019 || this.field1289 != this.field1270 && class25.field488 >= 2);
        if (arg0 && !var12) {
            return null;
        }
        int[][] var13 = class243.field4208[this.field1282];
        int var14 = (this.field1298 << 7) + (var6 << 6);
        int var15 = var13[var10][var9] + var13[var10][var11] + var13[var8][var11] + var13[var8][var9] >> 2;
        int var16 = (this.field1272 << 7) + (var7 << 6);
        int[][] var17 = null;
        if (var3) {
            var17 = class159.field2793[0];
        } else if (this.field1282 < 3) {
            var17 = class243.field4208[this.field1282 + 1];
        }
        boolean var18 = this.field1294 == null;
        class187 var19;
        if (this.field1271 == null) {
            var19 = var4.method1531(false, var18 ? class242.field4199 : this.field1294, this.field1281, var12, var16, this.field1295, 98, var13, var15, var14, var17);
        } else {
            var19 = var4.method1532(this.field1271, this.field1281, this.field1295, this.field1270, var14, var13, var16, var18 ? class242.field4199 : this.field1294, var17, var12, 912871939, var15);
        }
        return var19 == null ? null : var19.field3242;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "()I")
    public final int method2() {
        field1269++;
        return this.field1291;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZILmb;Lmb;I)Lqh;")
    public static final class205 method471(boolean arg0, int arg1, class178 arg2, class178 arg3, int arg4) {
        field1284++;
        if (arg4 != -25023) {
            field1297 = null;
        }
        int[] var5 = arg2.method1226(arg1, (byte) 59);
        boolean var6 = true;
        for (int var7 = 0; var7 < var5.length; var7++) {
            byte[] var8 = arg2.method1216(arg1, var5[var7], (byte) -23);
            if (var8 == null) {
                var6 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg0) {
                    var10 = arg3.method1216(0, var9, (byte) -23);
                } else {
                    var10 = arg3.method1216(var9, 0, (byte) -23);
                }
                if (var10 == null) {
                    var6 = false;
                }
            }
        }
        if (!var6) {
            return null;
        }
        try {
            return new class205(arg2, arg3, arg1, arg0);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(IIIIIIIZLij;)V")
    public class62(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class166 arg8) {
        this.field1278 = arg0;
        this.field1295 = arg2;
        this.field1282 = arg3;
        this.field1281 = arg1;
        this.field1298 = arg5;
        this.field1272 = arg4;
        if (arg6 != -1) {
            this.field1271 = class186.method1263(0, arg6);
            this.field1277 = class7.field153 - 1;
            this.field1270 = 0;
            if (this.field1271.field583 == 0 && arg8 != null && arg8 instanceof class62) {
                class62 var10 = (class62) arg8;
                if (this.field1271 == var10.field1271) {
                    this.field1270 = var10.field1270;
                    this.field1277 = var10.field1277;
                    return;
                }
            }
            if (arg7 && this.field1271.field586 != -1) {
                this.field1270 = (int) ((double) this.field1271.field589.length * Math.random());
                this.field1277 -= (int) ((double) this.field1271.field603[this.field1270] * Math.random());
                return;
            }
        }
    }
}
