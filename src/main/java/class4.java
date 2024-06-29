import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class4 {

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "[I")
    private int[] field56;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "[I")
    private int[] field58;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "Lbh;")
    private class261 field66;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "Lbh;")
    private class261 field67;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "[Lbh;")
    private class261[] field65;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "Z")
    public static boolean field59 = true;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "[Z")
    public static boolean[] field62 = new boolean[100];

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "Z")
    public static boolean field63;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BLqe;Lrg;)Z", line = 5)
    public final boolean method23(byte arg0, class176 arg1, class88 arg2) {
        field61++;
        int var4 = 0;
        int var5 = 24 / ((arg0) / 41);
        while (this.field56.length > var4) {
            if (!arg2.method634(-19044, this.field56[var4])) {
                return false;
            }
            var4++;
        }
        for (int var6 = 0; var6 < this.field58.length; var6++) {
            if (!arg1.method981((byte) 16, this.field58[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V", line = 37)
    public static void method24(boolean arg0) {
        field62 = null;
        if (!arg0) {
            method24(true);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZLqe;Lrg;ZDIII)[I", line = 68)
    public final int[] method25(boolean arg0, class176 arg1, class88 arg2, boolean arg3, double arg4, int arg5, int arg6, int arg7) {
        if (arg7 != -20239) {
            this.method26(-1.752971265629992D, 49, (class176) null, 41, -57, false, (class88) null);
        }
        class47.method279((byte) -76, arg4);
        int[] var10 = new int[arg5 * arg6];
        field60++;
        class60.field942 = arg1;
        class240.field4000 = arg2;
        class42.method257(arg5, arg6, arg7 + 20253);
        for (int var11 = 0; var11 < this.field65.length; var11++) {
            this.field65[var11].method1818(arg6, arg5, (byte) 26);
        }
        int var12;
        byte var13;
        int var14;
        if (arg3) {
            var12 = arg5 - 1;
            var13 = -1;
            var14 = -1;
        } else {
            var12 = 0;
            var14 = arg5;
            var13 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg6; var16++) {
            if (arg0) {
                var15 = var16;
            }
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field66.field4434) {
                int[] var17 = this.field66.method21((byte) 32, var16);
                var18 = var17;
                var19 = var17;
                var20 = var17;
            } else {
                int[][] var21 = this.field66.method13(true, var16);
                var18 = var21[0];
                var20 = var21[1];
                var19 = var21[2];
            }
            for (int var22 = var12; var22 != var14; var22 += var13) {
                int var23 = var20[var22] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = var18[var22] >> 4;
                if (var23 < 0) {
                    var23 = 0;
                }
                int var25 = var19[var22] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                if (var24 > 255) {
                    var24 = 255;
                }
                int var26 = class195.field3213[var25];
                if (var24 < 0) {
                    var24 = 0;
                }
                int var27 = class195.field3213[var23];
                int var28 = class195.field3213[var24];
                var10[var15++] = (var27 << 8) + (var28 << 16) + var26;
                if (arg0) {
                    var15 += arg5 - 1;
                }
            }
        }
        for (int var29 = 0; var29 < this.field65.length; var29++) {
            this.field65[var29].method832(true);
        }
        return var10;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(DILqe;IIZLrg;)[B", line = 199)
    public final byte[] method26(double arg0, int arg1, class176 arg2, int arg3, int arg4, boolean arg5, class88 arg6) {
        field57++;
        class47.method279((byte) -114, arg0);
        class240.field4000 = arg6;
        class60.field942 = arg2;
        if (arg3 != 4) {
            return (byte[]) null;
        }
        class42.method257(arg4, arg1, 106);
        for (int var9 = 0; var9 < this.field65.length; var9++) {
            this.field65[var9].method1818(arg1, arg4, (byte) 26);
        }
        int var10 = 0;
        byte[] var11 = new byte[arg1 * arg4 * 4];
        for (int var12 = 0; var12 < arg1; var12++) {
            if (arg5) {
                var10 = var12 << 2;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field66.field4434) {
                int[] var13 = this.field66.method21((byte) -12, var12);
                var14 = var13;
                var15 = var13;
                var16 = var13;
            } else {
                int[][] var17 = this.field66.method13(true, var12);
                var15 = var17[2];
                var16 = var17[1];
                var14 = var17[0];
            }
            int[] var18;
            if (this.field67.field4434) {
                var18 = this.field67.method21((byte) -6, var12);
            } else {
                var18 = this.field67.method13(true, var12)[0];
            }
            for (int var19 = arg4 - 1; var19 >= 0; var19--) {
                int var20 = var16[var19] >> 4;
                int var21 = var14[var19] >> 4;
                int var22 = var15[var19] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = class195.field3213[var22];
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var24 = class195.field3213[var21];
                if (var20 < 0) {
                    var20 = 0;
                }
                int var25 = class195.field3213[var20];
                int var26;
                if (var24 == 0 && var25 == 0 && var23 == 0) {
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
                var11[var10++] = (byte) var24;
                var11[var10++] = (byte) var25;
                var11[var10++] = (byte) var23;
                var11[var10++] = (byte) var26;
                if (arg5) {
                    var10 += (arg4 << 2) - 4;
                }
            }
        }
        for (int var27 = 0; var27 < this.field65.length; var27++) {
            this.field65[var27].method832(true);
        }
        return var11;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V", line = 357)
    public class4() {
        this.field56 = new int[0];
        this.field58 = new int[0];
        this.field66 = new class196();
        this.field66.field4435 = 1;
        this.field67 = new class196();
        this.field65 = new class261[] { this.field66, this.field67 };
        this.field67.field4435 = 1;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lpb;)V", line = 370)
    public class4(class70 arg0) {
        int var2 = arg0.method481(0);
        this.field65 = new class261[var2];
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class261 var7 = class196.method1403(arg0, true);
            if (var7.method1823(false) >= 0) {
                var3++;
            }
            if (var7.method833((byte) 64) >= 0) {
                var4++;
            }
            int var8 = var7.field4417.length;
            var5[var6] = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                var5[var6][var9] = arg0.method481(0);
            }
            this.field65[var6] = var7;
        }
        this.field58 = new int[var4];
        int var10 = 0;
        this.field56 = new int[var3];
        int var11 = 0;
        for (int var12 = 0; var12 < var2; var12++) {
            class261 var13 = this.field65[var12];
            int var14 = var13.field4417.length;
            for (int var15 = 0; var15 < var14; var15++) {
                var13.field4417[var15] = this.field65[var5[var12][var15]];
            }
            int var16 = var13.method1823(false);
            int var17 = var13.method833((byte) 118);
            if (var16 > 0) {
                this.field56[var11++] = var16;
            }
            if (var17 > 0) {
                this.field58[var10++] = var17;
            }
            var5[var12] = null;
        }
        this.field66 = this.field65[arg0.method481(0)];
        this.field67 = this.field65[arg0.method481(0)];
        int[][] var18 = (int[][]) null;
    }
}
