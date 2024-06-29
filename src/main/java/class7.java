import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!d")
public class class7 extends class15 {

    @OriginalMember(owner = "mapview!d", name = "H", descriptor = "[I")
    public int[] field52;

    @OriginalMember(owner = "mapview!d", name = "J", descriptor = "I")
    public int field54;

    @OriginalMember(owner = "mapview!d", name = "I", descriptor = "I")
    public int field53;

    @OriginalMember(owner = "mapview!d", name = "F", descriptor = "I")
    public int field50;

    @OriginalMember(owner = "mapview!d", name = "G", descriptor = "I")
    public int field51;

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "([I[IIIIIIII)V", line = 19)
    private static final void method29(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(II)V", line = 79)
    public final void method30(int arg0, int arg1) {
        int var3 = this.field51 + arg0;
        int var4 = this.field50 + arg1;
        int var5 = class15.field139 * var4 + var3;
        int var6 = 0;
        int var7 = this.field53;
        int var8 = this.field54;
        int var9 = class15.field139 - var8;
        int var10 = 0;
        if (var4 < class15.field134) {
            int var11 = class15.field134 - var4;
            var7 -= var11;
            var4 = class15.field134;
            var6 += var8 * var11;
            var5 += class15.field139 * var11;
        }
        if (var4 + var7 > class15.field136) {
            var7 -= var4 + var7 - class15.field136;
        }
        if (var3 < class15.field135) {
            int var12 = class15.field135 - var3;
            var8 -= var12;
            var3 = class15.field135;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class15.field133) {
            int var13 = var3 + var8 - class15.field133;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method32(class15.field138, this.field52, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!d", name = "c", descriptor = "()V", line = 143)
    public final void method31() {
        class15.method79(this.field52, this.field54, this.field53);
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "([I[IIIIIII)V", line = 151)
    private static final void method32(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "mapview!d", name = "b", descriptor = "(II)V", line = 214)
    public final void method33(int arg0, int arg1) {
        int var3 = this.field51 + arg0;
        int var4 = this.field50 + arg1;
        int var5 = class15.field139 * var4 + var3;
        int var6 = 0;
        int var7 = this.field53;
        int var8 = this.field54;
        int var9 = class15.field139 - var8;
        int var10 = 0;
        if (var4 < class15.field134) {
            int var11 = class15.field134 - var4;
            var7 -= var11;
            var4 = class15.field134;
            var6 += var8 * var11;
            var5 += class15.field139 * var11;
        }
        if (var4 + var7 > class15.field136) {
            var7 -= var4 + var7 - class15.field136;
        }
        if (var3 < class15.field135) {
            int var12 = class15.field135 - var3;
            var8 -= var12;
            var3 = class15.field135;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class15.field133) {
            int var13 = var3 + var8 - class15.field133;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method29(class15.field138, this.field52, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!d", name = "<init>", descriptor = "()V", line = 277)
    public class7() {
    }

    @OriginalMember(owner = "mapview!d", name = "<init>", descriptor = "(II)V", line = 283)
    public class7(int arg0, int arg1) {
        this.field52 = new int[arg0 * arg1];
        this.field54 = arg0;
        this.field53 = arg1;
        this.field51 = this.field50 = 0;
    }
}
