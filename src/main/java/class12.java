import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ga")
public class class12 extends Draw2D {

    @OriginalMember(owner = "mapview!ga", name = "F", descriptor = "[[B")
    private byte[][] field95 = new byte[256][];

    @OriginalMember(owner = "mapview!ga", name = "B", descriptor = "I")
    private int field92 = 0;

    @OriginalMember(owner = "mapview!ga", name = "D", descriptor = "[I")
    private int[] field94;

    @OriginalMember(owner = "mapview!ga", name = "C", descriptor = "[I")
    private int[] field93;

    @OriginalMember(owner = "mapview!ga", name = "A", descriptor = "[I")
    private int[] field91;

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "([BIIIII)V", line = 39)
    private final void method34(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Draw2D.field310 * arg2 + arg1;
        int var8 = Draw2D.field310 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < Draw2D.field312) {
            int var11 = Draw2D.field312 - arg2;
            arg4 -= var11;
            arg2 = Draw2D.field312;
            var10 += arg3 * var11;
            var7 += Draw2D.field310 * var11;
        }
        if (arg2 + arg4 > Draw2D.field307) {
            arg4 -= arg2 + arg4 - Draw2D.field307;
        }
        if (arg1 < Draw2D.field308) {
            int var12 = Draw2D.field308 - arg1;
            arg3 -= var12;
            arg1 = Draw2D.field308;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > Draw2D.field309) {
            int var13 = arg1 + arg3 - Draw2D.field309;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            this.method37(Draw2D.field306, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(Ll;III)V", line = 115)
    public final void method35(class21 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return;
        }
        int var5 = arg2 - this.field92;
        for (int var6 = 0; var6 < arg0.field204; var6++) {
            int var7 = arg0.field197[var6] & 0xFF;
            if (var7 != 32) {
                this.method34(this.field95[var7], arg1, this.field94[var7] + var5, this.field93[var7], this.field91[var7], arg3);
            }
            arg1 += this.field93[var7];
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(Ll;)I", line = 137)
    private final int method36(class21 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field204; var3++) {
            var2 += this.field93[arg0.field197[var3] & 0xFF];
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "([I[BIIIIIII)V", line = 193)
    private final void method37(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!ga", name = "b", descriptor = "(Ll;III)V", line = 252)
    public final void method38(class21 arg0, int arg1, int arg2, int arg3) {
        this.method35(arg0, arg1 - this.method36(arg0) / 2, arg2, arg3);
    }

    @OriginalMember(owner = "mapview!ga", name = "<init>", descriptor = "([I[I[I[I[[B)V", line = 293)
    public class12(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        new Random();
        this.field94 = arg0;
        this.field93 = arg1;
        this.field91 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field95 = arg4;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field94[var10] < var8) {
                var8 = this.field94[var10];
            }
            if (this.field94[var10] + this.field91[var10] > var9) {
                var9 = this.field94[var10] + this.field91[var10];
            }
            byte[] var11 = this.field95[var10];
            int var12 = var11.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11[var13] = (byte) (var11[var13] == var6 ? 0 : 1);
            }
        }
        this.field92 = this.field94[32] + this.field91[32];
    }

    @OriginalMember(owner = "mapview!ga", name = "c", descriptor = "(Ll;III)V", line = 281)
    public final void method39(class21 arg0, int arg1, int arg2, int arg3) {
        this.method35(arg0, arg1 - this.method36(arg0), arg2, arg3);
    }
}
