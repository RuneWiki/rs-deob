import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!qa")
public class class31 extends class37 {

    @OriginalMember(owner = "mapview!qa", name = "I", descriptor = "[I")
    public int[] field442;

    @OriginalMember(owner = "mapview!qa", name = "J", descriptor = "I")
    public int field443;

    @OriginalMember(owner = "mapview!qa", name = "F", descriptor = "I")
    public int field440;

    @OriginalMember(owner = "mapview!qa", name = "K", descriptor = "I")
    public int field444;

    @OriginalMember(owner = "mapview!qa", name = "H", descriptor = "I")
    public int field441;

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "(II)V", line = 11)
    public final void method177(int arg0, int arg1) {
        int var3 = this.field441 + arg0;
        int var4 = this.field444 + arg1;
        int var5 = class37.field502 * var4 + var3;
        int var6 = 0;
        int var7 = this.field440;
        int var8 = this.field443;
        int var9 = class37.field502 - var8;
        int var10 = 0;
        if (var4 < class37.field503) {
            int var11 = class37.field503 - var4;
            var7 -= var11;
            var4 = class37.field503;
            var6 += var8 * var11;
            var5 += class37.field502 * var11;
        }
        if (var4 + var7 > class37.field506) {
            var7 -= var4 + var7 - class37.field506;
        }
        if (var3 < class37.field505) {
            int var12 = class37.field505 - var3;
            var8 -= var12;
            var3 = class37.field505;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class37.field504) {
            int var13 = var3 + var8 - class37.field504;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method178(class37.field501, this.field442, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "([I[IIIIIII)V", line = 85)
    private static final void method178(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "([I[IIIIIIII)V", line = 124)
    private static final void method179(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!qa", name = "b", descriptor = "(II)V", line = 193)
    public final void method180(int arg0, int arg1) {
        int var3 = this.field441 + arg0;
        int var4 = this.field444 + arg1;
        int var5 = class37.field502 * var4 + var3;
        int var6 = 0;
        int var7 = this.field440;
        int var8 = this.field443;
        int var9 = class37.field502 - var8;
        int var10 = 0;
        if (var4 < class37.field503) {
            int var11 = class37.field503 - var4;
            var7 -= var11;
            var4 = class37.field503;
            var6 += var8 * var11;
            var5 += class37.field502 * var11;
        }
        if (var4 + var7 > class37.field506) {
            var7 -= var4 + var7 - class37.field506;
        }
        if (var3 < class37.field505) {
            int var12 = class37.field505 - var3;
            var8 -= var12;
            var3 = class37.field505;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class37.field504) {
            int var13 = var3 + var8 - class37.field504;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method179(class37.field501, this.field442, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!qa", name = "c", descriptor = "()V", line = 263)
    public final void method181() {
        class37.method232(this.field442, this.field443, this.field440);
    }

    @OriginalMember(owner = "mapview!qa", name = "<init>", descriptor = "()V", line = 295)
    protected class31() {
    }

    @OriginalMember(owner = "mapview!qa", name = "<init>", descriptor = "(II)V", line = 302)
    public class31(int arg0, int arg1) {
        this.field442 = new int[arg0 * arg1];
        this.field443 = arg0;
        this.field440 = arg1;
        this.field441 = this.field444 = 0;
    }
}
