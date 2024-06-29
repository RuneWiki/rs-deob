import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!d")
public class class7 extends class23 {

    @OriginalMember(owner = "mapview!d", name = "w", descriptor = "I")
    private int field128 = 0;

    @OriginalMember(owner = "mapview!d", name = "v", descriptor = "[[B")
    private byte[][] field127 = new byte[256][];

    @OriginalMember(owner = "mapview!d", name = "x", descriptor = "[I")
    private int[] field129;

    @OriginalMember(owner = "mapview!d", name = "z", descriptor = "[I")
    private int[] field131;

    @OriginalMember(owner = "mapview!d", name = "y", descriptor = "[I")
    private int[] field130;

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(Lt;III)V", line = 14)
    public final void method50(class31 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return;
        }
        int var5 = arg2 - this.field128;
        for (int var6 = 0; var6 < arg0.field345; var6++) {
            int var7 = arg0.field349[var6] & 0xFF;
            if (var7 != 32) {
                this.method55(this.field127[var7], arg1, this.field129[var7] + var5, this.field131[var7], this.field130[var7], arg3);
            }
            arg1 += this.field131[var7];
        }
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "([I[BIIIIIII)V", line = 52)
    private final void method51(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!d", name = "b", descriptor = "(Lt;III)V", line = 139)
    public final void method52(class31 arg0, int arg1, int arg2, int arg3) {
        this.method50(arg0, arg1 - this.method54(arg0) / 2, arg2, arg3);
    }

    @OriginalMember(owner = "mapview!d", name = "c", descriptor = "(Lt;III)V", line = 163)
    public final void method53(class31 arg0, int arg1, int arg2, int arg3) {
        this.method50(arg0, arg1 - this.method54(arg0), arg2, arg3);
    }

    @OriginalMember(owner = "mapview!d", name = "<init>", descriptor = "([I[I[I[I[[B)V", line = 293)
    public class7(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        new Random();
        this.field129 = arg0;
        this.field131 = arg1;
        this.field130 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field127 = arg4;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field129[var10] < var8) {
                var8 = this.field129[var10];
            }
            if (this.field130[var10] + this.field129[var10] > var9) {
                var9 = this.field130[var10] + this.field129[var10];
            }
            byte[] var11 = this.field127[var10];
            int var12 = var11.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11[var13] = (byte) (var11[var13] == var6 ? 0 : 1);
            }
        }
        this.field128 = this.field130[32] + this.field129[32];
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(Lt;)I", line = 182)
    private final int method54(class31 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field345; var3++) {
            var2 += this.field131[arg0.field349[var3] & 0xFF];
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "([BIIIII)V", line = 218)
    private final void method55(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class23.field269 * arg2 + arg1;
        int var8 = class23.field269 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class23.field274) {
            int var11 = class23.field274 - arg2;
            arg4 -= var11;
            arg2 = class23.field274;
            var10 += arg3 * var11;
            var7 += class23.field269 * var11;
        }
        if (arg2 + arg4 > class23.field273) {
            arg4 -= arg2 + arg4 - class23.field273;
        }
        if (arg1 < class23.field272) {
            int var12 = class23.field272 - arg1;
            arg3 -= var12;
            arg1 = class23.field272;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class23.field275) {
            int var13 = arg1 + arg3 - class23.field275;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method51(class23.field270, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }
}
