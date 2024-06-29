import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!e")
public class class9 extends class19 {

    @OriginalMember(owner = "mapview!e", name = "F", descriptor = "[I")
    public int[] field101;

    @OriginalMember(owner = "mapview!e", name = "B", descriptor = "I")
    public int field97;

    @OriginalMember(owner = "mapview!e", name = "E", descriptor = "I")
    public int field100;

    @OriginalMember(owner = "mapview!e", name = "D", descriptor = "I")
    public int field99;

    @OriginalMember(owner = "mapview!e", name = "C", descriptor = "I")
    public int field98;

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(II)V", line = 13)
    public final void method86(int arg0, int arg1) {
        int var3 = this.field98 + arg0;
        int var4 = this.field99 + arg1;
        int var5 = class19.field201 * var4 + var3;
        int var6 = 0;
        int var7 = this.field100;
        int var8 = this.field97;
        int var9 = class19.field201 - var8;
        int var10 = 0;
        if (var4 < class19.field202) {
            int var11 = class19.field202 - var4;
            var7 -= var11;
            var4 = class19.field202;
            var6 += var8 * var11;
            var5 += class19.field201 * var11;
        }
        if (var4 + var7 > class19.field204) {
            var7 -= var4 + var7 - class19.field204;
        }
        if (var3 < class19.field205) {
            int var12 = class19.field205 - var3;
            var8 -= var12;
            var3 = class19.field205;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class19.field206) {
            int var13 = var3 + var8 - class19.field206;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method89(class19.field203, this.field101, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "([I[IIIIIIII)V", line = 69)
    private static final void method87(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = var9; var12 < 0; var12++) {
                int var13 = arg1[arg3++];
                if (var13 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var13;
                }
                int var14 = arg1[arg3++];
                if (var14 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var14;
                }
                int var15 = arg1[arg3++];
                if (var15 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var15;
                }
                int var16 = arg1[arg3++];
                if (var16 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var16;
                }
            }
            for (int var17 = var10; var17 < 0; var17++) {
                int var18 = arg1[arg3++];
                if (var18 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var18;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "mapview!e", name = "b", descriptor = "(II)V", line = 151)
    public final void method88(int arg0, int arg1) {
        int var3 = this.field98 + arg0;
        int var4 = this.field99 + arg1;
        int var5 = class19.field201 * var4 + var3;
        int var6 = 0;
        int var7 = this.field100;
        int var8 = this.field97;
        int var9 = class19.field201 - var8;
        int var10 = 0;
        if (var4 < class19.field202) {
            int var11 = class19.field202 - var4;
            var7 -= var11;
            var4 = class19.field202;
            var6 += var8 * var11;
            var5 += class19.field201 * var11;
        }
        if (var4 + var7 > class19.field204) {
            var7 -= var4 + var7 - class19.field204;
        }
        if (var3 < class19.field205) {
            int var12 = class19.field205 - var3;
            var8 -= var12;
            var3 = class19.field205;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class19.field206) {
            int var13 = var3 + var8 - class19.field206;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method87(class19.field203, this.field101, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "([I[IIIIIII)V", line = 240)
    private static final void method89(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = -arg5; var8 < 0; var8++) {
            int var9 = arg3 + arg4 - 3;
            while (arg3 < var9) {
                arg0[arg3++] = arg1[arg2++];
                arg0[arg3++] = arg1[arg2++];
                arg0[arg3++] = arg1[arg2++];
                arg0[arg3++] = arg1[arg2++];
            }
            var9 += 3;
            while (arg3 < var9) {
                arg0[arg3++] = arg1[arg2++];
            }
            arg3 += arg6;
            arg2 += arg7;
        }
    }

    @OriginalMember(owner = "mapview!e", name = "c", descriptor = "()V", line = 267)
    public final void method90() {
        class19.method136(this.field101, this.field97, this.field100);
    }

    @OriginalMember(owner = "mapview!e", name = "<init>", descriptor = "()V", line = 278)
    public class9() {
    }

    @OriginalMember(owner = "mapview!e", name = "<init>", descriptor = "(II)V", line = 280)
    public class9(int arg0, int arg1) {
        this.field101 = new int[arg0 * arg1];
        this.field97 = arg0;
        this.field100 = arg1;
        this.field98 = this.field99 = 0;
    }
}
