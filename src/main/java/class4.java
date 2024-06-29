import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ba")
public class class4 extends class31 {

    @OriginalMember(owner = "mapview!ba", name = "F", descriptor = "[I")
    public int[] field31;

    @OriginalMember(owner = "mapview!ba", name = "E", descriptor = "I")
    public int field30;

    @OriginalMember(owner = "mapview!ba", name = "H", descriptor = "I")
    public int field33;

    @OriginalMember(owner = "mapview!ba", name = "D", descriptor = "I")
    public int field29;

    @OriginalMember(owner = "mapview!ba", name = "G", descriptor = "I")
    public int field32;

    @OriginalMember(owner = "mapview!ba", name = "b", descriptor = "(II)V", line = 4)
    public final void method13(int arg0, int arg1) {
        int var3 = this.field32 + arg0;
        int var4 = this.field29 + arg1;
        int var5 = class31.field428 * var4 + var3;
        int var6 = 0;
        int var7 = this.field33;
        int var8 = this.field30;
        int var9 = class31.field428 - var8;
        int var10 = 0;
        if (var4 < class31.field432) {
            int var11 = class31.field432 - var4;
            var7 -= var11;
            var4 = class31.field432;
            var6 += var8 * var11;
            var5 += class31.field428 * var11;
        }
        if (var4 + var7 > class31.field433) {
            var7 -= var4 + var7 - class31.field433;
        }
        if (var3 < class31.field430) {
            int var12 = class31.field430 - var3;
            var8 -= var12;
            var3 = class31.field430;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class31.field431) {
            int var13 = var3 + var8 - class31.field431;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method14(class31.field434, this.field31, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "([I[IIIIIIII)V", line = 74)
    private static final void method14(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!ba", name = "c", descriptor = "(II)V", line = 140)
    public final void method15(int arg0, int arg1) {
        int var3 = this.field32 + arg0;
        int var4 = this.field29 + arg1;
        int var5 = class31.field428 * var4 + var3;
        int var6 = 0;
        int var7 = this.field33;
        int var8 = this.field30;
        int var9 = class31.field428 - var8;
        int var10 = 0;
        if (var4 < class31.field432) {
            int var11 = class31.field432 - var4;
            var7 -= var11;
            var4 = class31.field432;
            var6 += var8 * var11;
            var5 += class31.field428 * var11;
        }
        if (var4 + var7 > class31.field433) {
            var7 -= var4 + var7 - class31.field433;
        }
        if (var3 < class31.field430) {
            int var12 = class31.field430 - var3;
            var8 -= var12;
            var3 = class31.field430;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class31.field431) {
            int var13 = var3 + var8 - class31.field431;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method17(class31.field434, this.field31, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "c", descriptor = "()V", line = 229)
    public final void method16() {
        class31.method222(this.field31, this.field30, this.field33);
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "([I[IIIIIII)V", line = 244)
    private static final void method17(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "mapview!ba", name = "<init>", descriptor = "()V", line = 278)
    public class4() {
    }

    @OriginalMember(owner = "mapview!ba", name = "<init>", descriptor = "(II)V", line = 280)
    public class4(int arg0, int arg1) {
        this.field31 = new int[arg0 * arg1];
        this.field30 = arg0;
        this.field33 = arg1;
        this.field32 = this.field29 = 0;
    }
}
