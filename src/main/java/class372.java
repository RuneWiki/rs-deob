import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class372 {

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public int field5251 = -1;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    public int field5256 = -1;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
    public int field5260 = 5;

    @OriginalMember(owner = "client!qg", name = "y", descriptor = "Z")
    public boolean field5275 = false;

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "I")
    public int field5276 = -1;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "Z")
    public boolean field5262 = false;

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "I")
    public int field5269 = 99;

    @OriginalMember(owner = "client!qg", name = "u", descriptor = "I")
    public int field5271 = 2;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "Z")
    public boolean field5261 = false;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "Z")
    public boolean field5259 = false;

    @OriginalMember(owner = "client!qg", name = "w", descriptor = "I")
    public int field5273 = -1;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public int field5258 = -1;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "I")
    public static int field5266 = -1;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "I")
    public static int field5270 = field5263 >> 2;

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "I")
    public static int field5272 = -60;

    @OriginalMember(owner = "client!qg", name = "D", descriptor = "I")
    public static int field5280 = field5263;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "Lcs;")
    public static class351 field5257 = new class351(12, 8);

    @OriginalMember(owner = "client!qg", name = "I", descriptor = "Lcs;")
    public static class351 field5285 = new class351(81, 7);

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public int field5252;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "I")
    public static int field5274;

    @OriginalMember(owner = "client!qg", name = "A", descriptor = "I")
    public static int field5277;

    @OriginalMember(owner = "client!qg", name = "C", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!qg", name = "E", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!qg", name = "H", descriptor = "Lp;")
    public class157 field5284;

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "[I")
    private int[] field5268;

    @OriginalMember(owner = "client!qg", name = "B", descriptor = "[I")
    public int[] field5278;

    @OriginalMember(owner = "client!qg", name = "G", descriptor = "[I")
    public int[] field5283;

    @OriginalMember(owner = "client!qg", name = "F", descriptor = "[Z")
    public boolean[] field5282;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "[[I")
    public int[][] field5255;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
    public final void method2226(int arg0) {
        if (this.field5258 == -1) {
            if (this.field5282 == null) {
                this.field5258 = 0;
            } else {
                this.field5258 = 2;
            }
        }
        if (arg0 != 2) {
            field5280 = 108;
        }
        field5265++;
        if (this.field5273 != -1) {
            return;
        }
        if (this.field5282 == null) {
            this.field5273 = 0;
        } else {
            this.field5273 = 2;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIZI)I")
    public final int method2227(int arg0, int arg1, boolean arg2, int arg3) {
        field5267++;
        if (arg3 != 128) {
            return -74;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field5278[arg0];
        class13 var8 = null;
        class13 var9 = this.field5284.method949(var7 >> 16, 80);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field5261 || class399.field5582) && arg1 != -1 && arg1 < this.field5278.length) {
            int var11 = this.field5278[arg1];
            var8 = this.field5284.method949(var11 >> 16, 106);
            var6 = var11 & 0xFFFF;
        }
        if (this.field5262) {
            var5 |= 0x200;
        }
        if (var9.method114(false, var10)) {
            var5 |= 0x80;
        }
        if (var9.method111(24279, var10)) {
            var5 |= 0x100;
        }
        if (var8 != null) {
            if (var8.method114(false, var6)) {
                var5 |= 0x80;
            }
            if (var8.method111(24279, var6)) {
                var5 |= 0x100;
            }
        }
        if (this.field5268 != null && arg2) {
            if (this.field5268.length > arg0) {
                int var12 = this.field5268[arg0];
                if (var12 != 65535) {
                    class13 var13 = this.field5284.method949(var12 >> 16, arg3 - 51);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method114(false, var14)) {
                            var5 |= 0x80;
                        }
                        if (var13.method111(arg3 + 24151, var14)) {
                            var5 |= 0x100;
                        }
                    }
                }
            }
            if ((this.field5261 || class399.field5582) && arg1 != -1 && this.field5268.length > arg1) {
                int var15 = this.field5268[arg1];
                if (var15 != 65535) {
                    class13 var16 = this.field5284.method949(var15 >> 16, arg3 ^ 0xE5);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method114(false, var17)) {
                            var5 |= 0x80;
                        }
                        if (var16.method111(arg3 ^ 0x5E57, var17)) {
                            var5 |= 0x100;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)I")
    public static final int method2228(int arg0) {
        field5277++;
        if (class131.field1839) {
            return 0;
        }
        if (arg0 >= -65) {
            field5270 = 35;
        }
        if (class410.method2404(-1)) {
            return class460.field6481 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Llk;I)V")
    public final void method2229(class425 arg0, int arg1) {
        field5253++;
        if (arg1 != -8356) {
            return;
        }
        while (true) {
            int var3 = arg0.method2503(true);
            if (var3 == 0) {
                return;
            }
            this.method2233((byte) -112, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIILab;I)Lab;")
    public final class232 method2230(int arg0, int arg1, int arg2, int arg3, class232 arg4, int arg5) {
        field5254++;
        int var7 = this.field5283[arg0];
        int var8 = this.field5278[arg0];
        class13 var9 = this.field5284.method949(var8 >> 16, 80);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg4.method51((byte) 1, arg5, true);
        }
        class13 var11 = null;
        if ((this.field5261 || class399.field5582) && arg2 != -1 && arg2 < this.field5278.length) {
            int var12 = this.field5278[arg2];
            var11 = this.field5284.method949(var12 >> 16, 52);
            arg2 = var12 & 0xFFFF;
        }
        class13 var13 = null;
        class13 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field5268 != null) {
            if (this.field5268.length > arg0) {
                var15 = this.field5268[arg0];
                if (var15 != 65535) {
                    var13 = this.field5284.method949(var15 >> 16, 90);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field5261 || class399.field5582) && arg2 != -1 && arg2 < this.field5268.length) {
                var16 = this.field5268[arg2];
                if (var16 != 65535) {
                    var14 = this.field5284.method949(var16 >> 16, 79);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field5262) {
            arg5 |= 0x200;
        }
        if (var9.method114(false, var10)) {
            arg5 |= 0x80;
        }
        if (var9.method111(24279, var10)) {
            arg5 |= 0x100;
        }
        if (var13 != null) {
            if (var13.method114(false, var15)) {
                arg5 |= 0x80;
            }
            if (var13.method111(24279, var15)) {
                arg5 |= 0x100;
            }
        }
        if (var11 != null) {
            if (var11.method114(false, arg2)) {
                arg5 |= 0x80;
            }
            if (var11.method111(24279, arg2)) {
                arg5 |= 0x100;
            }
        }
        if (var14 != null) {
            if (var14.method114(false, var16)) {
                arg5 |= 0x80;
            }
            if (var14.method111(24279, var16)) {
                arg5 |= 0x100;
            }
        }
        int var17 = arg5 | 0x20;
        class232 var18 = arg4.method51((byte) 1, var17, true);
        var18.method1457(var9, var10, arg2, this.field5262, var7, var11, arg1 - 1, (byte) -91, 0);
        if (arg3 >= -24) {
            return null;
        } else {
            if (var13 != null) {
                var18.method1457(var13, var15, var16, this.field5262, var7, var14, arg1 - 1, (byte) -91, 0);
            }
            return var18;
        }
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(I)V")
    public static void method2231(int arg0) {
        field5257 = null;
        if (arg0 == 29607) {
            field5285 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIB)I")
    public static final int method2232(int arg0, int arg1, byte arg2) {
        field5264++;
        if (arg0 == 4 || arg0 == 5) {
            return class133.field1879[arg1 & 0x3];
        } else {
            if (arg2 != -79) {
                method2232(-32, -120, (byte) -65);
            }
            return 256;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BILlk;)V")
    private final void method2233(byte arg0, int arg1, class425 arg2) {
        field5279++;
        int var4 = -65 / ((arg0 + 72) / 35);
        if (arg1 == 1) {
            int var5 = arg2.method2508(true);
            this.field5283 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field5283[var6] = arg2.method2508(true);
            }
            this.field5278 = new int[var5];
            for (int var7 = 0; var7 < var5; var7++) {
                this.field5278[var7] = arg2.method2508(true);
            }
            for (int var8 = 0; var8 < var5; var8++) {
                this.field5278[var8] += arg2.method2508(true) << 16;
            }
        } else if (arg1 == 2) {
            this.field5251 = arg2.method2508(true);
        } else if (arg1 == 3) {
            this.field5282 = new boolean[256];
            int var9 = arg2.method2503(true);
            for (int var10 = 0; var10 < var9; var10++) {
                this.field5282[arg2.method2503(true)] = true;
            }
        } else if (arg1 == 4) {
            this.field5275 = true;
        } else if (arg1 == 5) {
            this.field5260 = arg2.method2503(true);
        } else if (arg1 == 6) {
            this.field5276 = arg2.method2508(true);
        } else if (arg1 == 7) {
            this.field5256 = arg2.method2508(true);
        } else if (arg1 == 8) {
            this.field5269 = arg2.method2503(true);
        } else if (arg1 == 9) {
            this.field5258 = arg2.method2503(true);
        } else if (arg1 == 10) {
            this.field5273 = arg2.method2503(true);
        } else if (arg1 == 11) {
            this.field5271 = arg2.method2503(true);
        } else if (arg1 == 12) {
            int var15 = arg2.method2503(true);
            this.field5268 = new int[var15];
            for (int var16 = 0; var16 < var15; var16++) {
                this.field5268[var16] = arg2.method2508(true);
            }
            for (int var17 = 0; var17 < var15; var17++) {
                this.field5268[var17] += arg2.method2508(true) << 16;
            }
        } else if (arg1 == 13) {
            int var11 = arg2.method2508(true);
            this.field5255 = new int[var11][];
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = arg2.method2503(true);
                if (var13 > 0) {
                    this.field5255[var12] = new int[var13];
                    this.field5255[var12][0] = arg2.method2498(3);
                    for (int var14 = 1; var14 < var13; var14++) {
                        this.field5255[var12][var14] = arg2.method2508(true);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field5262 = true;
        } else if (arg1 == 15) {
            this.field5261 = true;
        } else if (arg1 == 16) {
            this.field5259 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BILab;IIIII)Lab;")
    public final class232 method2234(byte arg0, int arg1, class232 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5281++;
        if (arg6 != -20232) {
            this.field5278 = null;
        }
        int var9 = this.field5283[arg3];
        int var10 = this.field5278[arg3];
        class13 var11 = this.field5284.method949(var10 >> 16, 96);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg2.method51(arg0, arg1, true);
        }
        class13 var13 = null;
        if ((this.field5261 || class399.field5582) && arg4 != -1 && this.field5278.length > arg4) {
            int var14 = this.field5278[arg4];
            var13 = this.field5284.method949(var14 >> 16, 86);
            arg4 = var14 & 0xFFFF;
        }
        if (this.field5262) {
            arg1 |= 0x200;
        }
        if (var11.method114(false, var12)) {
            arg1 |= 0x80;
        }
        if (var11.method111(24279, var12)) {
            arg1 |= 0x100;
        }
        if (var13 != null) {
            if (var13.method114(false, arg4)) {
                arg1 |= 0x80;
            }
            if (var13.method111(24279, arg4)) {
                arg1 |= 0x100;
            }
        }
        int var15 = arg1 | 0x20;
        class232 var16 = arg2.method51(arg0, var15, true);
        var16.method1457(var11, var12, arg4, this.field5262, var9, var13, arg7 - 1, (byte) -91, arg5);
        return var16;
    }
}
