import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!f")
public class class11 extends class23 {

    @OriginalMember(owner = "mapview!f", name = "D", descriptor = "[I")
    public int[] field108;

    @OriginalMember(owner = "mapview!f", name = "F", descriptor = "I")
    public int field110;

    @OriginalMember(owner = "mapview!f", name = "E", descriptor = "I")
    public int field109;

    @OriginalMember(owner = "mapview!f", name = "B", descriptor = "I")
    public int field106;

    @OriginalMember(owner = "mapview!f", name = "C", descriptor = "I")
    public int field107;

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "([I[IIIIIII)V", line = 10)
    private static final void method44(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "mapview!f", name = "c", descriptor = "()V", line = 41)
    public final void method45() {
        class23.method125(this.field108, this.field110, this.field109);
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "([I[IIIIIIII)V", line = 48)
    private static final void method46(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(II)V", line = 121)
    public final void method47(int arg0, int arg1) {
        int var3 = this.field107 + arg0;
        int var4 = this.field106 + arg1;
        int var5 = class23.field231 * var4 + var3;
        int var6 = 0;
        int var7 = this.field109;
        int var8 = this.field110;
        int var9 = class23.field231 - var8;
        int var10 = 0;
        if (var4 < class23.field227) {
            int var11 = class23.field227 - var4;
            var7 -= var11;
            var4 = class23.field227;
            var6 += var8 * var11;
            var5 += class23.field231 * var11;
        }
        if (var4 + var7 > class23.field228) {
            var7 -= var4 + var7 - class23.field228;
        }
        if (var3 < class23.field229) {
            int var12 = class23.field229 - var3;
            var8 -= var12;
            var3 = class23.field229;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class23.field232) {
            int var13 = var3 + var8 - class23.field232;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method46(class23.field226, this.field108, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!f", name = "b", descriptor = "(II)V", line = 179)
    public final void method48(int arg0, int arg1) {
        int var3 = this.field107 + arg0;
        int var4 = this.field106 + arg1;
        int var5 = class23.field231 * var4 + var3;
        int var6 = 0;
        int var7 = this.field109;
        int var8 = this.field110;
        int var9 = class23.field231 - var8;
        int var10 = 0;
        if (var4 < class23.field227) {
            int var11 = class23.field227 - var4;
            var7 -= var11;
            var4 = class23.field227;
            var6 += var8 * var11;
            var5 += class23.field231 * var11;
        }
        if (var4 + var7 > class23.field228) {
            var7 -= var4 + var7 - class23.field228;
        }
        if (var3 < class23.field229) {
            int var12 = class23.field229 - var3;
            var8 -= var12;
            var3 = class23.field229;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class23.field232) {
            int var13 = var3 + var8 - class23.field232;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method44(class23.field226, this.field108, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!f", name = "<init>", descriptor = "()V", line = 296)
    protected class11() {
    }

    @OriginalMember(owner = "mapview!f", name = "<init>", descriptor = "(II)V", line = 303)
    public class11(int arg0, int arg1) {
        this.field108 = new int[arg0 * arg1];
        this.field110 = arg0;
        this.field109 = arg1;
        this.field107 = this.field106 = 0;
    }
}
