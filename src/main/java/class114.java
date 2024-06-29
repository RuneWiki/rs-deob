import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class114 extends class33 {

    @OriginalMember(owner = "client!qc", name = "Y", descriptor = "I")
    public int field2722;

    @OriginalMember(owner = "client!qc", name = "Z", descriptor = "I")
    public int field2723;

    @OriginalMember(owner = "client!qc", name = "bb", descriptor = "I")
    public int field2725;

    @OriginalMember(owner = "client!qc", name = "cb", descriptor = "I")
    public int field2726;

    @OriginalMember(owner = "client!qc", name = "db", descriptor = "I")
    public int field2727;

    @OriginalMember(owner = "client!qc", name = "eb", descriptor = "I")
    public int field2728;

    @OriginalMember(owner = "client!qc", name = "ab", descriptor = "[B")
    public byte[] field2724;

    @OriginalMember(owner = "client!qc", name = "fb", descriptor = "[I")
    public int[] field2729;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "()V")
    public final void method893() {
        if (this.field2726 == this.field2723 && this.field2727 == this.field2722) {
            return;
        }
        byte[] var1 = new byte[this.field2727 * this.field2726];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2722; var3++) {
            for (int var4 = 0; var4 < this.field2723; var4++) {
                var1[(this.field2725 + var3) * this.field2726 + this.field2728 + var4] = this.field2724[var2++];
            }
        }
        this.field2724 = var1;
        this.field2723 = this.field2726;
        this.field2722 = this.field2727;
        this.field2728 = 0;
        this.field2725 = 0;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "([I[B[IIIIIII)V")
    private static final void method894(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(III)V")
    public final void method895(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2729.length; var4++) {
            int var5 = this.field2729[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field2729[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field2729[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field2729[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(II)V")
    public final void method896(int arg0, int arg1) {
        int var3 = this.field2728 + arg0;
        int var4 = this.field2725 + arg1;
        int var5 = class33.field862 * var4 + var3;
        int var6 = 0;
        int var7 = this.field2722;
        int var8 = this.field2723;
        int var9 = class33.field862 - var8;
        int var10 = 0;
        if (var4 < class33.field863) {
            int var11 = class33.field863 - var4;
            var7 -= var11;
            var4 = class33.field863;
            var6 += var8 * var11;
            var5 += class33.field862 * var11;
        }
        if (var4 + var7 > class33.field857) {
            var7 -= var4 + var7 - class33.field857;
        }
        if (var3 < class33.field861) {
            int var12 = class33.field861 - var3;
            var8 -= var12;
            var3 = class33.field861;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class33.field859) {
            int var13 = var3 + var8 - class33.field859;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method894(class33.field858, this.field2724, this.field2729, var6, var5, var8, var7, var9, var10);
        }
    }
}
