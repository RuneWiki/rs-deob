import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!q")
public class class30 extends class15 {

    @OriginalMember(owner = "mapview!q", name = "L", descriptor = "[I")
    public int[] field395;

    @OriginalMember(owner = "mapview!q", name = "O", descriptor = "I")
    public int field398;

    @OriginalMember(owner = "mapview!q", name = "P", descriptor = "I")
    public int field399;

    @OriginalMember(owner = "mapview!q", name = "N", descriptor = "I")
    public int field397;

    @OriginalMember(owner = "mapview!q", name = "M", descriptor = "I")
    public int field396;

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "([I[IIIIIIII)V", line = 7)
    private static final void method220(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(II)V", line = 101)
    public final void method221(int arg0, int arg1) {
        int var3 = this.field396 + arg0;
        int var4 = this.field397 + arg1;
        int var5 = class15.field175 * var4 + var3;
        int var6 = 0;
        int var7 = this.field399;
        int var8 = this.field398;
        int var9 = class15.field175 - var8;
        int var10 = 0;
        if (var4 < class15.field173) {
            int var11 = class15.field173 - var4;
            var7 -= var11;
            var4 = class15.field173;
            var6 += var8 * var11;
            var5 += class15.field175 * var11;
        }
        if (var4 + var7 > class15.field171) {
            var7 -= var4 + var7 - class15.field171;
        }
        if (var3 < class15.field174) {
            int var12 = class15.field174 - var3;
            var8 -= var12;
            var3 = class15.field174;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class15.field176) {
            int var13 = var3 + var8 - class15.field176;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method220(class15.field172, this.field395, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!q", name = "c", descriptor = "()V", line = 165)
    public final void method222() {
        class15.method92(this.field395, this.field398, this.field399);
    }

    @OriginalMember(owner = "mapview!q", name = "b", descriptor = "(II)V", line = 173)
    public final void method223(int arg0, int arg1) {
        int var3 = this.field396 + arg0;
        int var4 = this.field397 + arg1;
        int var5 = class15.field175 * var4 + var3;
        int var6 = 0;
        int var7 = this.field399;
        int var8 = this.field398;
        int var9 = class15.field175 - var8;
        int var10 = 0;
        if (var4 < class15.field173) {
            int var11 = class15.field173 - var4;
            var7 -= var11;
            var4 = class15.field173;
            var6 += var8 * var11;
            var5 += class15.field175 * var11;
        }
        if (var4 + var7 > class15.field171) {
            var7 -= var4 + var7 - class15.field171;
        }
        if (var3 < class15.field174) {
            int var12 = class15.field174 - var3;
            var8 -= var12;
            var3 = class15.field174;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class15.field176) {
            int var13 = var3 + var8 - class15.field176;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method224(class15.field172, this.field395, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "([I[IIIIIII)V", line = 246)
    private static final void method224(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "mapview!q", name = "<init>", descriptor = "()V", line = 271)
    public class30() {
    }

    @OriginalMember(owner = "mapview!q", name = "<init>", descriptor = "(II)V", line = 276)
    public class30(int arg0, int arg1) {
        this.field395 = new int[arg0 * arg1];
        this.field398 = arg0;
        this.field399 = arg1;
        this.field396 = this.field397 = 0;
    }
}
