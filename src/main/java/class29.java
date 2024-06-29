import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class29 extends class130 {

    @OriginalMember(owner = "client!e", name = "Z", descriptor = "I")
    public int field692;

    @OriginalMember(owner = "client!e", name = "bb", descriptor = "I")
    public int field694;

    @OriginalMember(owner = "client!e", name = "cb", descriptor = "I")
    public int field695;

    @OriginalMember(owner = "client!e", name = "db", descriptor = "I")
    public int field696;

    @OriginalMember(owner = "client!e", name = "eb", descriptor = "I")
    public int field697;

    @OriginalMember(owner = "client!e", name = "fb", descriptor = "I")
    public int field698;

    @OriginalMember(owner = "client!e", name = "ab", descriptor = "[B")
    public byte[] field693;

    @OriginalMember(owner = "client!e", name = "Y", descriptor = "[I")
    public int[] field691;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([I[B[IIIIIII)V")
    private static final void method222(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = var9; var12 < 0; var12++) {
                byte var15 = arg1[arg3++];
                if (var15 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2[var15 & 0xFF];
                }
                byte var16 = arg1[arg3++];
                if (var16 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2[var16 & 0xFF];
                }
                byte var17 = arg1[arg3++];
                if (var17 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2[var17 & 0xFF];
                }
                byte var18 = arg1[arg3++];
                if (var18 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2[var18 & 0xFF];
                }
            }
            for (int var13 = var10; var13 < 0; var13++) {
                byte var14 = arg1[arg3++];
                if (var14 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2[var14 & 0xFF];
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(III)V")
    public final void method223(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field691.length; var4++) {
            int var5 = this.field691[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field691[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field691[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field691[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(II)V")
    public final void method224(int arg0, int arg1) {
        int var3 = this.field692 + arg0;
        int var4 = this.field696 + arg1;
        int var5 = class130.field2958 * var4 + var3;
        int var6 = 0;
        int var7 = this.field695;
        int var8 = this.field698;
        int var9 = class130.field2958 - var8;
        int var10 = 0;
        if (var4 < class130.field2962) {
            int var11 = class130.field2962 - var4;
            var7 -= var11;
            var4 = class130.field2962;
            var6 += var8 * var11;
            var5 += class130.field2958 * var11;
        }
        if (var4 + var7 > class130.field2961) {
            var7 -= var4 + var7 - class130.field2961;
        }
        if (var3 < class130.field2960) {
            int var12 = class130.field2960 - var3;
            var8 -= var12;
            var3 = class130.field2960;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class130.field2963) {
            int var13 = var3 + var8 - class130.field2963;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method222(class130.field2959, this.field693, this.field691, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "()V")
    public final void method225() {
        if (this.field698 == this.field694 && this.field697 == this.field695) {
            return;
        }
        byte[] var1 = new byte[this.field697 * this.field694];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field695; var3++) {
            for (int var4 = 0; var4 < this.field698; var4++) {
                var1[(this.field696 + var3) * this.field694 + this.field692 + var4] = this.field693[var2++];
            }
        }
        this.field693 = var1;
        this.field698 = this.field694;
        this.field695 = this.field697;
        this.field692 = 0;
        this.field696 = 0;
    }
}
