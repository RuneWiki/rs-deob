import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!f")
public class class10 extends class8 {

    @OriginalMember(owner = "mapview!f", name = "z", descriptor = "[[B")
    private byte[][] field74 = new byte[256][];

    @OriginalMember(owner = "mapview!f", name = "A", descriptor = "I")
    private int field75 = 0;

    @OriginalMember(owner = "mapview!f", name = "C", descriptor = "[I")
    private int[] field77;

    @OriginalMember(owner = "mapview!f", name = "y", descriptor = "[I")
    private int[] field73;

    @OriginalMember(owner = "mapview!f", name = "B", descriptor = "[I")
    private int[] field76;

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "([I[BIIIIIII)V", line = 22)
    private final void method52(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(Lt;)I", line = 86)
    private final int method53(class31 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field339; var3++) {
            var2 += this.field73[arg0.field336[var3] & 0xFF];
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(Lt;III)V", line = 104)
    public final void method54(class31 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return;
        }
        int var5 = arg2 - this.field75;
        for (int var6 = 0; var6 < arg0.field339; var6++) {
            int var7 = arg0.field336[var6] & 0xFF;
            if (var7 != 32) {
                this.method57(this.field74[var7], arg1, this.field77[var7] + var5, this.field73[var7], this.field76[var7], arg3);
            }
            arg1 += this.field73[var7];
        }
    }

    @OriginalMember(owner = "mapview!f", name = "b", descriptor = "(Lt;III)V", line = 143)
    public final void method55(class31 arg0, int arg1, int arg2, int arg3) {
        this.method54(arg0, arg1 - this.method53(arg0) / 2, arg2, arg3);
    }

    @OriginalMember(owner = "mapview!f", name = "<init>", descriptor = "([I[I[I[I[[B)V", line = 293)
    public class10(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        new Random();
        this.field77 = arg0;
        this.field73 = arg1;
        this.field76 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field74 = arg4;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field77[var10] < var8) {
                var8 = this.field77[var10];
            }
            if (this.field77[var10] + this.field76[var10] > var9) {
                var9 = this.field77[var10] + this.field76[var10];
            }
            byte[] var11 = this.field74[var10];
            int var12 = var11.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11[var13] = (byte) (var11[var13] == var6 ? 0 : 1);
            }
        }
        this.field75 = this.field77[32] + this.field76[32];
    }

    @OriginalMember(owner = "mapview!f", name = "c", descriptor = "(Lt;III)V", line = 173)
    public final void method56(class31 arg0, int arg1, int arg2, int arg3) {
        this.method54(arg0, arg1 - this.method53(arg0), arg2, arg3);
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "([BIIIII)V", line = 227)
    private final void method57(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class8.field66 * arg2 + arg1;
        int var8 = class8.field66 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class8.field72) {
            int var11 = class8.field72 - arg2;
            arg4 -= var11;
            arg2 = class8.field72;
            var10 += arg3 * var11;
            var7 += class8.field66 * var11;
        }
        if (arg2 + arg4 > class8.field67) {
            arg4 -= arg2 + arg4 - class8.field67;
        }
        if (arg1 < class8.field69) {
            int var12 = class8.field69 - arg1;
            arg3 -= var12;
            arg1 = class8.field69;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class8.field68) {
            int var13 = arg1 + arg3 - class8.field68;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method52(class8.field71, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }
}
