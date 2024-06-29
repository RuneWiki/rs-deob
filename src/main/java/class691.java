import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class691 {

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "Z")
    public boolean field9332 = false;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    public int field9328 = -1;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "Z")
    public boolean field9331 = false;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "I")
    public int field9335 = -1;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
    public int field9329 = 5;

    @OriginalMember(owner = "client!hg", name = "t", descriptor = "Z")
    public boolean field9344 = false;

    @OriginalMember(owner = "client!hg", name = "B", descriptor = "I")
    public int field9352 = -1;

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "I")
    public int field9339 = -1;

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "I")
    public int field9338 = 2;

    @OriginalMember(owner = "client!hg", name = "A", descriptor = "I")
    public int field9351 = -1;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "I")
    public int field9334 = 99;

    @OriginalMember(owner = "client!hg", name = "H", descriptor = "Z")
    public boolean field9358 = false;

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "Z")
    public static boolean field9337 = false;

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "Lmu;")
    public static class303 field9340 = new class303(4, 1);

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    public static int field9325;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
    public static int field9330;

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "I")
    public static int field9333;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
    public static int field9336;

    @OriginalMember(owner = "client!hg", name = "w", descriptor = "I")
    public static int field9347;

    @OriginalMember(owner = "client!hg", name = "x", descriptor = "I")
    public static int field9348;

    @OriginalMember(owner = "client!hg", name = "y", descriptor = "I")
    public static int field9349;

    @OriginalMember(owner = "client!hg", name = "F", descriptor = "I")
    public static int field9356;

    @OriginalMember(owner = "client!hg", name = "I", descriptor = "I")
    public int field9359;

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "Llfa;")
    public class116 field9341;

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "Lis;")
    public static class503 field9342;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "[I")
    public int[] field9326;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "[I")
    public int[] field9327;

    @OriginalMember(owner = "client!hg", name = "s", descriptor = "[I")
    public int[] field9343;

    @OriginalMember(owner = "client!hg", name = "v", descriptor = "[I")
    public static int[] field9346;

    @OriginalMember(owner = "client!hg", name = "z", descriptor = "[I")
    private int[] field9350;

    @OriginalMember(owner = "client!hg", name = "E", descriptor = "[I")
    public int[] field9355;

    @OriginalMember(owner = "client!hg", name = "G", descriptor = "[I")
    public int[] field9357;

    @OriginalMember(owner = "client!hg", name = "C", descriptor = "[Z")
    public boolean[] field9353;

    @OriginalMember(owner = "client!hg", name = "u", descriptor = "[[I")
    public static int[][] field9345;

    @OriginalMember(owner = "client!hg", name = "D", descriptor = "[[I")
    public int[][] field9354;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIZ)I", line = 13)
    public final int method3860(int arg0, int arg1, int arg2, boolean arg3) {
        field9330++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field9327[arg2];
        class172 var8 = null;
        class172 var9 = this.field9341.method1025(var7 >> 16, 3);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field9331 || class133.field2243) && arg0 != -1 && arg0 < this.field9327.length) {
            int var11 = this.field9327[arg0];
            var8 = this.field9341.method1025(var11 >> 16, 3);
            var6 = var11 & 0xFFFF;
        }
        if (arg1 <= 96) {
            return 11;
        }
        if (this.field9332) {
            var5 |= 0x200;
        }
        if (var9.method1292(var10, 0)) {
            var5 |= 0x80;
        }
        if (var9.method1291(var10, 14)) {
            var5 |= 0x100;
        }
        if (var9.method1287((byte) -110, var10)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method1292(var6, 0)) {
                var5 |= 0x80;
            }
            if (var8.method1291(var6, 14)) {
                var5 |= 0x100;
            }
            if (var8.method1287((byte) -127, var6)) {
                var5 |= 0x400;
            }
        }
        if (this.field9350 != null && arg3) {
            if (arg2 < this.field9350.length) {
                int var12 = this.field9350[arg2];
                if (var12 != 65535) {
                    class172 var13 = this.field9341.method1025(var12 >> 16, 3);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method1292(var14, 0)) {
                            var5 |= 0x80;
                        }
                        if (var13.method1291(var14, 14)) {
                            var5 |= 0x100;
                        }
                        if (var13.method1287((byte) -103, var14)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field9331 || class133.field2243) && arg0 != -1 && arg0 < this.field9350.length) {
                int var15 = this.field9350[arg0];
                if (var15 != 65535) {
                    class172 var16 = this.field9341.method1025(var15 >> 16, 3);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method1292(var17, 0)) {
                            var5 |= 0x80;
                        }
                        if (var16.method1291(var17, 14)) {
                            var5 |= 0x100;
                        }
                        if (var16.method1287((byte) -93, var17)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lcea;II)V", line = 137)
    private final void method3861(class215 arg0, int arg1, int arg2) {
        if (arg2 != -14861) {
            return;
        }
        if (arg1 == 1) {
            int var4 = arg0.method1478(842397944);
            this.field9357 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field9357[var5] = arg0.method1478(842397944);
            }
            this.field9327 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field9327[var6] = arg0.method1478(842397944);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field9327[var7] += arg0.method1478(842397944) << 16;
            }
        } else if (arg1 == 2) {
            this.field9328 = arg0.method1478(arg2 ^ 0xCDCA3D0B);
        } else if (arg1 == 3) {
            this.field9353 = new boolean[256];
            int var8 = arg0.method1535(255);
            for (int var9 = 0; var9 < var8; var9++) {
                this.field9353[arg0.method1535(255)] = true;
            }
        } else if (arg1 == 5) {
            this.field9329 = arg0.method1535(arg2 + 15116);
        } else if (arg1 == 6) {
            this.field9339 = arg0.method1478(842397944);
        } else if (arg1 == 7) {
            this.field9351 = arg0.method1478(842397944);
        } else if (arg1 == 8) {
            this.field9334 = arg0.method1535(255);
        } else if (arg1 == 9) {
            this.field9352 = arg0.method1535(arg2 + 15116);
        } else if (arg1 == 10) {
            this.field9335 = arg0.method1535(arg2 ^ 0xFFFFC50C);
        } else if (arg1 == 11) {
            this.field9338 = arg0.method1535(255);
        } else if (arg1 == 12) {
            int var10 = arg0.method1535(arg2 ^ 0xFFFFC50C);
            this.field9350 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field9350[var11] = arg0.method1478(842397944);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field9350[var12] = (arg0.method1478(842397944) << 16) + this.field9350[var12];
            }
        } else if (arg1 == 13) {
            int var13 = arg0.method1478(842397944);
            this.field9354 = new int[var13][];
            for (int var14 = 0; var14 < var13; var14++) {
                int var15 = arg0.method1535(255);
                if (var15 > 0) {
                    this.field9354[var14] = new int[var15];
                    this.field9354[var14][0] = arg0.method1499(-1);
                    for (int var16 = 1; var16 < var15; var16++) {
                        this.field9354[var14][var16] = arg0.method1478(842397944);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field9332 = true;
        } else if (arg1 == 15) {
            this.field9331 = true;
        } else if (arg1 == 16) {
            this.field9344 = true;
        } else if (arg1 == 18) {
            this.field9358 = true;
        } else if (arg1 == 19) {
            if (this.field9343 == null) {
                this.field9343 = new int[this.field9354.length];
                for (int var17 = 0; var17 < this.field9354.length; var17++) {
                    this.field9343[var17] = 255;
                }
            }
            this.field9343[arg0.method1535(255)] = arg0.method1535(class710.method3948(arg2, -15092));
        } else if (arg1 == 20) {
            if (this.field9326 == null || this.field9355 == null) {
                this.field9326 = new int[this.field9354.length];
                this.field9355 = new int[this.field9354.length];
                for (int var18 = 0; var18 < this.field9354.length; var18++) {
                    this.field9326[var18] = 256;
                    this.field9355[var18] = 256;
                }
            }
            int var19 = arg0.method1535(255);
            this.field9326[var19] = arg0.method1478(842397944);
            this.field9355[var19] = arg0.method1478(842397944);
        }
        field9347++;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)V", line = 374)
    public static void method3862(boolean arg0) {
        field9346 = null;
        field9340 = null;
        field9345 = null;
        if (arg0) {
            method3865(-22, -54, -101, -115, -107, 90, 13, -47);
        }
        field9342 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lka;IIBIIII)Lka;", line = 389)
    public final class472 method3863(class472 arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field9356++;
        int var9 = this.field9357[arg4];
        int var10 = this.field9327[arg4];
        class172 var11 = this.field9341.method1025(var10 >> 16, 3);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg0.method504(arg3, arg7, true);
        }
        class172 var13 = null;
        if ((this.field9331 || class133.field2243) && arg2 != -1 && arg2 < this.field9327.length) {
            int var14 = this.field9327[arg2];
            var13 = this.field9341.method1025(var14 >> 16, 3);
            arg2 = var14 & 0xFFFF;
        }
        if (this.field9332) {
            arg7 |= 0x200;
        }
        if (var11.method1292(var12, arg6 - 663780816)) {
            arg7 |= 0x80;
        }
        if (var11.method1291(var12, arg6 ^ 0x27907DDE)) {
            arg7 |= 0x100;
        }
        if (var11.method1287((byte) -126, var12)) {
            arg7 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method1292(arg2, 0)) {
                arg7 |= 0x80;
            }
            if (var13.method1291(arg2, 14)) {
                arg7 |= 0x100;
            }
            if (var13.method1287((byte) -125, arg2)) {
                arg7 |= 0x400;
            }
        }
        int var15 = arg7 | 0x20;
        if (arg6 != 663780816) {
            this.field9351 = -72;
        }
        class472 var16 = arg0.method504(arg3, var15, true);
        var16.method2784(var12, var9, var13, arg1, var11, false, this.field9332, arg2, arg5 - 1);
        return var16;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lcea;Z)V", line = 454)
    public final void method3864(class215 arg0, boolean arg1) {
        field9333++;
        while (true) {
            int var3 = arg0.method1535(255);
            if (var3 == 0) {
                if (arg1) {
                    this.field9357 = null;
                    return;
                } else {
                    return;
                }
            }
            this.method3861(arg0, var3, -14861);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIIIII)V", line = 474)
    public static final void method3865(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field9349++;
        int var8 = arg4 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class722.field9802 - class199.field2907) * var8 / 100 + class199.field2907;
        int var10 = arg7 * var9 >> 8;
        class58.field1146 = class58.field1151 * var9 >> 8;
        int var11 = 16384 - arg0 & 0x3FFF;
        int var12 = 16384 - arg2 & 0x3FFF;
        if (arg5 != -19360) {
            field9342 = null;
        }
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class255.field3698[var11] * -var10 >> 14;
            var15 = class255.field3695[var11] * var10 >> 14;
        }
        if (var12 != 0) {
            var13 = class255.field3698[var12] * var15 >> 14;
            var15 = class255.field3695[var12] * var15 >> 14;
        }
        class600.field8231 = arg2;
        class546.field7523 = 0;
        class275.field3870 = arg3 - var15;
        class458.field6444 = arg1 - var14;
        class108.field1896 = arg6 - var13;
        class634.field8721 = arg0;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILka;IIII)Lka;", line = 528)
    public final class472 method3866(int arg0, class472 arg1, int arg2, int arg3, int arg4, int arg5) {
        field9336++;
        int var7 = this.field9357[arg5];
        int var8 = this.field9327[arg5];
        class172 var9 = this.field9341.method1025(var8 >> 16, 3);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg1.method504((byte) 1, arg4, true);
        }
        class172 var11 = null;
        if ((this.field9331 || class133.field2243) && arg2 != -1 && this.field9327.length > arg2) {
            int var12 = this.field9327[arg2];
            var11 = this.field9341.method1025(var12 >> 16, 3);
            arg2 = var12 & 0xFFFF;
        }
        class172 var13 = null;
        class172 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field9350 != null) {
            if (this.field9350.length > arg5) {
                var15 = this.field9350[arg5];
                if (var15 != 65535) {
                    var13 = this.field9341.method1025(var15 >> 16, 3);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field9331 || class133.field2243) && arg2 != -1 && this.field9350.length > arg2) {
                var16 = this.field9350[arg2];
                if (var16 != 65535) {
                    var14 = this.field9341.method1025(var16 >> 16, 3);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field9332) {
            arg4 |= 0x200;
        }
        if (var9.method1292(var10, 0)) {
            arg4 |= 0x80;
        }
        if (var9.method1291(var10, 14)) {
            arg4 |= 0x100;
        }
        if (var9.method1287((byte) -102, var10)) {
            arg4 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method1292(var15, 0)) {
                arg4 |= 0x80;
            }
            if (var13.method1291(var15, 14)) {
                arg4 |= 0x100;
            }
            if (var13.method1287((byte) -109, var15)) {
                arg4 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method1292(arg2, 0)) {
                arg4 |= 0x80;
            }
            if (var11.method1291(arg2, 14)) {
                arg4 |= 0x100;
            }
            if (var11.method1287((byte) -114, arg2)) {
                arg4 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method1292(var16, 0)) {
                arg4 |= 0x80;
            }
            if (var14.method1291(var16, 14)) {
                arg4 |= 0x100;
            }
            if (var14.method1287((byte) -109, var16)) {
                arg4 |= 0x400;
            }
        }
        int var17 = arg4 | 0x20;
        class472 var18 = arg1.method504((byte) 1, var17, true);
        int var19 = -33 / ((49 - arg0) / 45);
        var18.method2784(var10, var7, var11, 0, var9, false, this.field9332, arg2, arg3 - 1);
        if (var13 != null) {
            var18.method2784(var15, var7, var14, 0, var13, false, this.field9332, var16, arg3 - 1);
        }
        return var18;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V", line = 663)
    public final void method3867(byte arg0) {
        field9348++;
        if (this.field9352 == -1) {
            if (this.field9353 == null) {
                this.field9352 = 0;
            } else {
                this.field9352 = 2;
            }
        }
        if (this.field9335 == -1) {
            if (this.field9353 == null) {
                this.field9335 = 0;
            } else {
                this.field9335 = 2;
            }
        }
        int var2 = -41 / ((arg0 - 45) / 49);
    }
}
