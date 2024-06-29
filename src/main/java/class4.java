import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ba")
public class class4 extends class20 {

    @OriginalMember(owner = "mapview!ba", name = "x", descriptor = "[[B")
    private byte[][] field91 = new byte[256][];

    @OriginalMember(owner = "mapview!ba", name = "z", descriptor = "I")
    private int field93 = 0;

    @OriginalMember(owner = "mapview!ba", name = "A", descriptor = "[I")
    private int[] field94;

    @OriginalMember(owner = "mapview!ba", name = "w", descriptor = "[I")
    private int[] field90;

    @OriginalMember(owner = "mapview!ba", name = "y", descriptor = "[I")
    private int[] field92;

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(Lk;III)V", line = 5)
    public final void method46(class21 arg0, int arg1, int arg2, int arg3) {
        this.method48(arg0, arg1 - this.method47(arg0), arg2, arg3);
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(Lk;)I", line = 23)
    private final int method47(class21 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field256; var3++) {
            var2 += this.field90[arg0.field259[var3] & 0xFF];
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!ba", name = "b", descriptor = "(Lk;III)V", line = 63)
    public final void method48(class21 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return;
        }
        int var5 = arg2 - this.field93;
        for (int var6 = 0; var6 < arg0.field256; var6++) {
            int var7 = arg0.field259[var6] & 0xFF;
            if (var7 != 32) {
                this.method50(this.field91[var7], arg1, this.field94[var7] + var5, this.field90[var7], this.field92[var7], arg3);
            }
            arg1 += this.field90[var7];
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "([I[BIIIIIII)V", line = 109)
    private final void method49(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!ba", name = "<init>", descriptor = "([I[I[I[I[[B)V", line = 293)
    public class4(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        new Random();
        this.field94 = arg0;
        this.field90 = arg1;
        this.field92 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field91 = arg4;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field94[var10] < var8) {
                var8 = this.field94[var10];
            }
            if (this.field94[var10] + this.field92[var10] > var9) {
                var9 = this.field94[var10] + this.field92[var10];
            }
            byte[] var11 = this.field91[var10];
            int var12 = var11.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11[var13] = (byte) (var11[var13] == var6 ? 0 : 1);
            }
        }
        this.field93 = this.field94[32] + this.field92[32];
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "([BIIIII)V", line = 210)
    private final void method50(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = class20.field248 * arg2 + arg1;
        int var8 = class20.field248 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class20.field246) {
            int var11 = class20.field246 - arg2;
            arg4 -= var11;
            arg2 = class20.field246;
            var10 += arg3 * var11;
            var7 += class20.field248 * var11;
        }
        if (arg2 + arg4 > class20.field249) {
            arg4 -= arg2 + arg4 - class20.field249;
        }
        if (arg1 < class20.field251) {
            int var12 = class20.field251 - arg1;
            arg3 -= var12;
            arg1 = class20.field251;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class20.field252) {
            int var13 = arg1 + arg3 - class20.field252;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method49(class20.field247, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "c", descriptor = "(Lk;III)V", line = 287)
    public final void method51(class21 arg0, int arg1, int arg2, int arg3) {
        this.method48(arg0, arg1 - this.method47(arg0) / 2, arg2, arg3);
    }
}
