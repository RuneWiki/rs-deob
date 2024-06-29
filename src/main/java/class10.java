import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!fa")
public class class10 extends class25 {

    @OriginalMember(owner = "mapview!fa", name = "D", descriptor = "[[B")
    private byte[][] field199 = new byte[256][];

    @OriginalMember(owner = "mapview!fa", name = "U", descriptor = "I")
    private int field216 = 0;

    @OriginalMember(owner = "mapview!fa", name = "V", descriptor = "Z")
    private boolean field217;

    @OriginalMember(owner = "mapview!fa", name = "B", descriptor = "[I")
    private int[] field197;

    @OriginalMember(owner = "mapview!fa", name = "S", descriptor = "[I")
    private int[] field214;

    @OriginalMember(owner = "mapview!fa", name = "Q", descriptor = "[I")
    private int[] field212;

    @OriginalMember(owner = "mapview!fa", name = "y", descriptor = "Lj;")
    private static class17 field194 = class30.method190(-93, "gr3");

    @OriginalMember(owner = "mapview!fa", name = "F", descriptor = "Lj;")
    private static class17 field201 = class30.method190(-124, "yel");

    @OriginalMember(owner = "mapview!fa", name = "H", descriptor = "Lj;")
    private static class17 field203 = class30.method190(-118, "or1");

    @OriginalMember(owner = "mapview!fa", name = "A", descriptor = "Lj;")
    private static class17 field196 = class30.method190(-106, "cya");

    @OriginalMember(owner = "mapview!fa", name = "I", descriptor = "Lj;")
    private static class17 field204 = class30.method190(-119, "blu");

    @OriginalMember(owner = "mapview!fa", name = "L", descriptor = "Lj;")
    private static class17 field207 = class30.method190(-102, "dre");

    @OriginalMember(owner = "mapview!fa", name = "E", descriptor = "Lj;")
    private static class17 field200 = class30.method190(-99, "gr1");

    @OriginalMember(owner = "mapview!fa", name = "P", descriptor = "Lj;")
    private static class17 field211 = class30.method190(-127, "dbl");

    @OriginalMember(owner = "mapview!fa", name = "C", descriptor = "Lj;")
    private static class17 field198 = class30.method190(-115, "bla");

    @OriginalMember(owner = "mapview!fa", name = "O", descriptor = "Lj;")
    private static class17 field210 = class30.method190(-117, "red");

    @OriginalMember(owner = "mapview!fa", name = "R", descriptor = "Lj;")
    private static class17 field213 = class30.method190(-111, "or2");

    @OriginalMember(owner = "mapview!fa", name = "M", descriptor = "Lj;")
    private static class17 field208 = class30.method190(-90, "gr2");

    @OriginalMember(owner = "mapview!fa", name = "N", descriptor = "Lj;")
    private static class17 field209 = class30.method190(-107, "gre");

    @OriginalMember(owner = "mapview!fa", name = "z", descriptor = "Lj;")
    private static class17 field195 = class30.method190(-108, "mag");

    @OriginalMember(owner = "mapview!fa", name = "K", descriptor = "Lj;")
    private static class17 field206 = class30.method190(-94, "whi");

    @OriginalMember(owner = "mapview!fa", name = "J", descriptor = "Lj;")
    private static class17 field205 = class30.method190(-99, "or3");

    @OriginalMember(owner = "mapview!fa", name = "G", descriptor = "Lj;")
    private static class17 field202 = class30.method190(-100, "str");

    @OriginalMember(owner = "mapview!fa", name = "T", descriptor = "Lj;")
    private static class17 field215 = class30.method190(-123, "lre");

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(Lj;III)V", line = 15)
    public final void method88(class17 arg0, int arg1, int arg2, int arg3) {
        this.method90(arg0, arg1 - this.method94(arg0), arg2, arg3);
    }

    @OriginalMember(owner = "mapview!fa", name = "c", descriptor = "()V", line = 21)
    public static void method89() {
        field210 = null;
        field209 = null;
        field204 = null;
        field201 = null;
        field196 = null;
        field195 = null;
        field206 = null;
        field198 = null;
        field215 = null;
        field207 = null;
        field211 = null;
        field203 = null;
        field213 = null;
        field205 = null;
        field200 = null;
        field208 = null;
        field194 = null;
        field202 = null;
    }

    @OriginalMember(owner = "mapview!fa", name = "b", descriptor = "(Lj;III)V", line = 43)
    public final void method90(class17 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return;
        }
        int var5 = arg2 - this.field216;
        for (int var6 = 0; var6 < arg0.field268; var6++) {
            int var7 = arg0.field263[var6] & 0xFF;
            if (var7 != 32) {
                this.method91(this.field199[var7], arg1, this.field197[var7] + var5, this.field214[var7], this.field212[var7], arg3);
            }
            arg1 += this.field214[var7];
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "([BIIIII)V", line = 71)
    private final void method91(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class25.field330 * arg2 + arg1;
        int var8 = class25.field330 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class25.field324) {
            int var11 = class25.field324 - arg2;
            arg4 -= var11;
            arg2 = class25.field324;
            var10 += arg3 * var11;
            var7 += class25.field330 * var11;
        }
        if (arg2 + arg4 > class25.field329) {
            arg4 -= arg2 + arg4 - class25.field329;
        }
        if (arg1 < class25.field326) {
            int var12 = class25.field326 - arg1;
            arg3 -= var12;
            arg1 = class25.field326;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class25.field328) {
            int var13 = arg1 + arg3 - class25.field328;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method93(class25.field325, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(Lj;)I", line = 142)
    private final int method92(class17 arg0) {
        if (arg0.method134(field210, true)) {
            return 16711680;
        } else if (arg0.method134(field209, true)) {
            return 65280;
        } else if (arg0.method134(field204, true)) {
            return 255;
        } else if (arg0.method134(field201, true)) {
            return 16776960;
        } else if (arg0.method134(field196, true)) {
            return 65535;
        } else if (arg0.method134(field195, true)) {
            return 16711935;
        } else if (arg0.method134(field206, true)) {
            return 16777215;
        } else if (arg0.method134(field198, true)) {
            return 0;
        } else if (arg0.method134(field215, true)) {
            return 16748608;
        } else if (arg0.method134(field207, true)) {
            return 8388608;
        } else if (arg0.method134(field211, true)) {
            return 128;
        } else if (arg0.method134(field203, true)) {
            return 16756736;
        } else if (arg0.method134(field213, true)) {
            return 16740352;
        } else if (arg0.method134(field205, true)) {
            return 16723968;
        } else if (arg0.method134(field200, true)) {
            return 12648192;
        } else if (arg0.method134(field208, true)) {
            return 8453888;
        } else if (arg0.method134(field194, true)) {
            return 4259584;
        } else {
            if (arg0.method134(field202, true)) {
                this.field217 = true;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "<init>", descriptor = "([I[I[I[I[[B)V", line = 395)
    public class10(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        new Random();
        this.field217 = false;
        this.field197 = arg0;
        this.field214 = arg1;
        this.field212 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field199 = arg4;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field197[var10] < var8) {
                var8 = this.field197[var10];
            }
            if (this.field212[var10] + this.field197[var10] > var9) {
                var9 = this.field212[var10] + this.field197[var10];
            }
            byte[] var11 = this.field199[var10];
            int var12 = var11.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11[var13] = (byte) (var11[var13] == var6 ? 0 : 1);
            }
        }
        this.field216 = this.field212[32] + this.field197[32];
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "([I[BIIIIIII)V", line = 203)
    private final void method93(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!fa", name = "b", descriptor = "(Lj;)I", line = 282)
    public final int method94(class17 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field268; var3++) {
            var2 += this.field214[arg0.field263[var3] & 0xFF];
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!fa", name = "c", descriptor = "(Lj;III)V", line = 319)
    public final void method95(class17 arg0, int arg1, int arg2, int arg3) {
        this.method90(arg0, arg1 - this.method94(arg0) / 2, arg2, arg3);
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(Lj;IIIZ)V", line = 341)
    public final void method96(class17 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field217 = false;
        int var6 = arg1;
        if (arg0 == null) {
            return;
        }
        int var7 = arg2 - this.field216;
        for (int var8 = 0; var8 < arg0.field268; var8++) {
            if (arg0.field263[var8] == 64 && var8 + 4 < arg0.field268 && arg0.field263[var8 + 4] == 64) {
                int var9 = this.method92(arg0.method116(var8 + 4, var8 + 1, -108));
                if (var9 != -1) {
                    arg3 = var9;
                }
                var8 += 4;
            } else {
                int var10 = arg0.field263[var8] & 0xFF;
                if (var10 != 32) {
                    if (arg4) {
                        this.method91(this.field199[var10], arg1 + 1, this.field197[var10] + var7 + 1, this.field214[var10], this.field212[var10], 0);
                    }
                    this.method91(this.field199[var10], arg1, this.field197[var10] + var7, this.field214[var10], this.field212[var10], arg3);
                }
                arg1 += this.field214[var10];
            }
        }
        if (this.field217) {
            class25.method168(var6, (int) ((double) this.field216 * 0.7D) + var7, arg1 - var6, 8388608);
        }
    }
}
