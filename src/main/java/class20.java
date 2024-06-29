import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!k")
public class class20 extends class12 {

    @OriginalMember(owner = "mapview!k", name = "B", descriptor = "I")
    private int field275 = 0;

    @OriginalMember(owner = "mapview!k", name = "U", descriptor = "[[B")
    private byte[][] field294 = new byte[256][];

    @OriginalMember(owner = "mapview!k", name = "W", descriptor = "Z")
    private boolean field296;

    @OriginalMember(owner = "mapview!k", name = "E", descriptor = "[I")
    private int[] field278;

    @OriginalMember(owner = "mapview!k", name = "G", descriptor = "[I")
    private int[] field280;

    @OriginalMember(owner = "mapview!k", name = "D", descriptor = "[I")
    private int[] field277;

    @OriginalMember(owner = "mapview!k", name = "z", descriptor = "Ln;")
    private static class26 field273 = class9.method82(255, "lre");

    @OriginalMember(owner = "mapview!k", name = "A", descriptor = "Ln;")
    private static class26 field274 = class9.method82(255, "gr3");

    @OriginalMember(owner = "mapview!k", name = "H", descriptor = "Ln;")
    private static class26 field281 = class9.method82(255, "blu");

    @OriginalMember(owner = "mapview!k", name = "F", descriptor = "Ln;")
    private static class26 field279 = class9.method82(255, "or1");

    @OriginalMember(owner = "mapview!k", name = "K", descriptor = "Ln;")
    private static class26 field284 = class9.method82(255, "bla");

    @OriginalMember(owner = "mapview!k", name = "P", descriptor = "Ln;")
    private static class26 field289 = class9.method82(255, "str");

    @OriginalMember(owner = "mapview!k", name = "J", descriptor = "Ln;")
    private static class26 field283 = class9.method82(255, "or3");

    @OriginalMember(owner = "mapview!k", name = "N", descriptor = "Ln;")
    private static class26 field287 = class9.method82(255, "or2");

    @OriginalMember(owner = "mapview!k", name = "R", descriptor = "Ln;")
    private static class26 field291 = class9.method82(255, "gre");

    @OriginalMember(owner = "mapview!k", name = "Q", descriptor = "Ln;")
    private static class26 field290 = class9.method82(255, "dbl");

    @OriginalMember(owner = "mapview!k", name = "S", descriptor = "Ln;")
    private static class26 field292 = class9.method82(255, "cya");

    @OriginalMember(owner = "mapview!k", name = "I", descriptor = "Ln;")
    private static class26 field282 = class9.method82(255, "gr2");

    @OriginalMember(owner = "mapview!k", name = "T", descriptor = "Ln;")
    private static class26 field293 = class9.method82(255, "red");

    @OriginalMember(owner = "mapview!k", name = "C", descriptor = "Ln;")
    private static class26 field276 = class9.method82(255, "whi");

    @OriginalMember(owner = "mapview!k", name = "O", descriptor = "Ln;")
    private static class26 field288 = class9.method82(255, "gr1");

    @OriginalMember(owner = "mapview!k", name = "M", descriptor = "Ln;")
    private static class26 field286 = class9.method82(255, "mag");

    @OriginalMember(owner = "mapview!k", name = "L", descriptor = "Ln;")
    private static class26 field285 = class9.method82(255, "yel");

    @OriginalMember(owner = "mapview!k", name = "V", descriptor = "Ln;")
    private static class26 field295 = class9.method82(255, "dre");

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(Ln;)I", line = 4)
    public final int method142(class26 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field347; var3++) {
            var2 += this.field280[arg0.field354[var3] & 0xFF];
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(Ln;IIIZ)V", line = 22)
    public final void method143(class26 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field296 = false;
        int var6 = arg1;
        if (arg0 == null) {
            return;
        }
        int var7 = arg2 - this.field275;
        for (int var8 = 0; var8 < arg0.field347; var8++) {
            if (arg0.field354[var8] == 64 && var8 + 4 < arg0.field347 && arg0.field354[var8 + 4] == 64) {
                int var9 = this.method144(arg0.method180(var8 + 1, (byte) 112, var8 + 4));
                if (var9 != -1) {
                    arg3 = var9;
                }
                var8 += 4;
            } else {
                int var10 = arg0.field354[var8] & 0xFF;
                if (var10 != 32) {
                    if (arg4) {
                        this.method149(this.field294[var10], arg1 + 1, this.field278[var10] + var7 + 1, this.field280[var10], this.field277[var10], 0);
                    }
                    this.method149(this.field294[var10], arg1, this.field278[var10] + var7, this.field280[var10], this.field277[var10], arg3);
                }
                arg1 += this.field280[var10];
            }
        }
        if (this.field296) {
            class12.method98(var6, (int) ((double) this.field275 * 0.7D) + var7, arg1 - var6, 8388608);
        }
    }

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "(Ln;)I", line = 72)
    private final int method144(class26 arg0) {
        if (arg0.method198(field293, (byte) 108)) {
            return 16711680;
        } else if (arg0.method198(field291, (byte) 123)) {
            return 65280;
        } else if (arg0.method198(field281, (byte) 111)) {
            return 255;
        } else if (arg0.method198(field285, (byte) 115)) {
            return 16776960;
        } else if (arg0.method198(field292, (byte) 109)) {
            return 65535;
        } else if (arg0.method198(field286, (byte) 108)) {
            return 16711935;
        } else if (arg0.method198(field276, (byte) 118)) {
            return 16777215;
        } else if (arg0.method198(field284, (byte) 119)) {
            return 0;
        } else if (arg0.method198(field273, (byte) 115)) {
            return 16748608;
        } else if (arg0.method198(field295, (byte) 121)) {
            return 8388608;
        } else if (arg0.method198(field290, (byte) 110)) {
            return 128;
        } else if (arg0.method198(field279, (byte) 127)) {
            return 16756736;
        } else if (arg0.method198(field287, (byte) 127)) {
            return 16740352;
        } else if (arg0.method198(field283, (byte) 118)) {
            return 16723968;
        } else if (arg0.method198(field288, (byte) 117)) {
            return 12648192;
        } else if (arg0.method198(field282, (byte) 112)) {
            return 8453888;
        } else if (arg0.method198(field274, (byte) 109)) {
            return 4259584;
        } else {
            if (arg0.method198(field289, (byte) 120)) {
                this.field296 = true;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "([I[BIIIIIII)V", line = 130)
    private final void method145(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = -(arg5 >> 2);
        int var11 = -(arg5 & 0x3);
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            for (int var14 = var11; var14 < 0; var14++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "(Ln;III)V", line = 192)
    public final void method146(class26 arg0, int arg1, int arg2, int arg3) {
        this.method150(arg0, arg1 - this.method142(arg0), arg2, arg3);
    }

    @OriginalMember(owner = "mapview!k", name = "b", descriptor = "(Ln;III)V", line = 196)
    public final void method147(class26 arg0, int arg1, int arg2, int arg3) {
        this.method150(arg0, arg1 - this.method142(arg0) / 2, arg2, arg3);
    }

    @OriginalMember(owner = "mapview!k", name = "c", descriptor = "()V", line = 200)
    public static void method148() {
        field293 = null;
        field291 = null;
        field281 = null;
        field285 = null;
        field292 = null;
        field286 = null;
        field276 = null;
        field284 = null;
        field273 = null;
        field295 = null;
        field290 = null;
        field279 = null;
        field287 = null;
        field283 = null;
        field288 = null;
        field282 = null;
        field274 = null;
        field289 = null;
    }

    @OriginalMember(owner = "mapview!k", name = "a", descriptor = "([BIIIII)V", line = 231)
    private final void method149(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class12.field213 * arg2 + arg1;
        int var8 = class12.field213 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class12.field216) {
            int var11 = class12.field216 - arg2;
            arg4 -= var11;
            arg2 = class12.field216;
            var10 += arg3 * var11;
            var7 += class12.field213 * var11;
        }
        if (arg2 + arg4 > class12.field215) {
            arg4 -= arg2 + arg4 - class12.field215;
        }
        if (arg1 < class12.field217) {
            int var12 = class12.field217 - arg1;
            arg3 -= var12;
            arg1 = class12.field217;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class12.field211) {
            int var13 = arg1 + arg3 - class12.field211;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method145(class12.field212, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "mapview!k", name = "<init>", descriptor = "([I[I[I[I[[B)V", line = 392)
    public class20(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        new Random();
        this.field296 = false;
        this.field278 = arg0;
        this.field280 = arg1;
        this.field277 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field294 = arg4;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field278[var10] < var8) {
                var8 = this.field278[var10];
            }
            if (this.field278[var10] + this.field277[var10] > var9) {
                var9 = this.field278[var10] + this.field277[var10];
            }
            byte[] var11 = this.field294[var10];
            int var12 = var11.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11[var13] = (byte) (var11[var13] == var6 ? 0 : 1);
            }
        }
        this.field275 = this.field278[32] + this.field277[32];
    }

    @OriginalMember(owner = "mapview!k", name = "c", descriptor = "(Ln;III)V", line = 333)
    public final void method150(class26 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return;
        }
        int var5 = arg2 - this.field275;
        for (int var6 = 0; var6 < arg0.field347; var6++) {
            int var7 = arg0.field354[var6] & 0xFF;
            if (var7 != 32) {
                this.method149(this.field294[var7], arg1, this.field278[var7] + var5, this.field280[var7], this.field277[var7], arg3);
            }
            arg1 += this.field280[var7];
        }
    }
}
