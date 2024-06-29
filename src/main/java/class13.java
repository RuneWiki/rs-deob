import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!g")
public class class13 extends class12 {

    @OriginalMember(owner = "mapview!g", name = "D", descriptor = "[I")
    public int[] field222;

    @OriginalMember(owner = "mapview!g", name = "B", descriptor = "I")
    public int field220;

    @OriginalMember(owner = "mapview!g", name = "A", descriptor = "I")
    public int field219;

    @OriginalMember(owner = "mapview!g", name = "C", descriptor = "I")
    public int field221;

    @OriginalMember(owner = "mapview!g", name = "z", descriptor = "I")
    public int field218;

    @OriginalMember(owner = "mapview!g", name = "c", descriptor = "()V", line = 19)
    public final void method104() {
        class12.method94(this.field222, this.field220, this.field219);
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(II)V", line = 50)
    public final void method105(int arg0, int arg1) {
        int var3 = this.field218 + arg0;
        int var4 = this.field221 + arg1;
        int var5 = class12.field213 * var4 + var3;
        int var6 = 0;
        int var7 = this.field219;
        int var8 = this.field220;
        int var9 = class12.field213 - var8;
        int var10 = 0;
        if (var4 < class12.field216) {
            int var11 = class12.field216 - var4;
            var7 -= var11;
            var4 = class12.field216;
            var6 += var8 * var11;
            var5 += class12.field213 * var11;
        }
        if (var4 + var7 > class12.field215) {
            var7 -= var4 + var7 - class12.field215;
        }
        if (var3 < class12.field217) {
            int var12 = class12.field217 - var3;
            var8 -= var12;
            var3 = class12.field217;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class12.field211) {
            int var13 = var3 + var8 - class12.field211;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method106(class12.field212, this.field222, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "([I[IIIIIII)V", line = 108)
    private static final void method106(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "([I[IIIIIIII)V", line = 137)
    private static final void method107(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!g", name = "b", descriptor = "(II)V", line = 210)
    public final void method108(int arg0, int arg1) {
        int var3 = this.field218 + arg0;
        int var4 = this.field221 + arg1;
        int var5 = class12.field213 * var4 + var3;
        int var6 = 0;
        int var7 = this.field219;
        int var8 = this.field220;
        int var9 = class12.field213 - var8;
        int var10 = 0;
        if (var4 < class12.field216) {
            int var11 = class12.field216 - var4;
            var7 -= var11;
            var4 = class12.field216;
            var6 += var8 * var11;
            var5 += class12.field213 * var11;
        }
        if (var4 + var7 > class12.field215) {
            var7 -= var4 + var7 - class12.field215;
        }
        if (var3 < class12.field217) {
            int var12 = class12.field217 - var3;
            var8 -= var12;
            var3 = class12.field217;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class12.field211) {
            int var13 = var3 + var8 - class12.field211;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method107(class12.field212, this.field222, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!g", name = "<init>", descriptor = "()V", line = 267)
    public class13() {
    }

    @OriginalMember(owner = "mapview!g", name = "<init>", descriptor = "(II)V", line = 272)
    public class13(int arg0, int arg1) {
        this.field222 = new int[arg0 * arg1];
        this.field220 = arg0;
        this.field219 = arg1;
        this.field218 = this.field221 = 0;
    }
}
