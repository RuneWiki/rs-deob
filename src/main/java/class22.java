import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!l")
public class class22 extends class37 {

    @OriginalMember(owner = "mapview!l", name = "J", descriptor = "[I")
    public int[] field250;

    @OriginalMember(owner = "mapview!l", name = "M", descriptor = "I")
    public int field253;

    @OriginalMember(owner = "mapview!l", name = "I", descriptor = "I")
    public int field249;

    @OriginalMember(owner = "mapview!l", name = "K", descriptor = "I")
    public int field251;

    @OriginalMember(owner = "mapview!l", name = "L", descriptor = "I")
    public int field252;

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(II)V", line = 10)
    public final void method127(int arg0, int arg1) {
        int var3 = this.field252 + arg0;
        int var4 = this.field251 + arg1;
        int var5 = class37.field460 * var4 + var3;
        int var6 = 0;
        int var7 = this.field249;
        int var8 = this.field253;
        int var9 = class37.field460 - var8;
        int var10 = 0;
        if (var4 < class37.field459) {
            int var11 = class37.field459 - var4;
            var7 -= var11;
            var4 = class37.field459;
            var6 += var8 * var11;
            var5 += class37.field460 * var11;
        }
        if (var4 + var7 > class37.field454) {
            var7 -= var4 + var7 - class37.field454;
        }
        if (var3 < class37.field457) {
            int var12 = class37.field457 - var3;
            var8 -= var12;
            var3 = class37.field457;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class37.field458) {
            int var13 = var3 + var8 - class37.field458;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method128(class37.field456, this.field250, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "([I[IIIIIIII)V", line = 87)
    private static final void method128(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "(II)V", line = 153)
    public final void method129(int arg0, int arg1) {
        int var3 = this.field252 + arg0;
        int var4 = this.field251 + arg1;
        int var5 = class37.field460 * var4 + var3;
        int var6 = 0;
        int var7 = this.field249;
        int var8 = this.field253;
        int var9 = class37.field460 - var8;
        int var10 = 0;
        if (var4 < class37.field459) {
            int var11 = class37.field459 - var4;
            var7 -= var11;
            var4 = class37.field459;
            var6 += var8 * var11;
            var5 += class37.field460 * var11;
        }
        if (var4 + var7 > class37.field454) {
            var7 -= var4 + var7 - class37.field454;
        }
        if (var3 < class37.field457) {
            int var12 = class37.field457 - var3;
            var8 -= var12;
            var3 = class37.field457;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class37.field458) {
            int var13 = var3 + var8 - class37.field458;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method131(class37.field456, this.field250, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!l", name = "c", descriptor = "()V", line = 209)
    public final void method130() {
        class37.method238(this.field250, this.field253, this.field249);
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "([I[IIIIIII)V", line = 222)
    private static final void method131(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "mapview!l", name = "<init>", descriptor = "()V", line = 274)
    public class22() {
    }

    @OriginalMember(owner = "mapview!l", name = "<init>", descriptor = "(II)V", line = 276)
    public class22(int arg0, int arg1) {
        this.field250 = new int[arg0 * arg1];
        this.field253 = arg0;
        this.field249 = arg1;
        this.field252 = this.field251 = 0;
    }
}
