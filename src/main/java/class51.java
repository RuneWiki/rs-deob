import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class51 extends class141 {

    @OriginalMember(owner = "client!hb", name = "P", descriptor = "I")
    public int field1166;

    @OriginalMember(owner = "client!hb", name = "R", descriptor = "I")
    public int field1168;

    @OriginalMember(owner = "client!hb", name = "S", descriptor = "I")
    public int field1169;

    @OriginalMember(owner = "client!hb", name = "U", descriptor = "I")
    public int field1170;

    @OriginalMember(owner = "client!hb", name = "V", descriptor = "I")
    public int field1171;

    @OriginalMember(owner = "client!hb", name = "X", descriptor = "I")
    public int field1172;

    @OriginalMember(owner = "client!hb", name = "O", descriptor = "[B")
    public byte[] field1165;

    @OriginalMember(owner = "client!hb", name = "Q", descriptor = "[I")
    public int[] field1167;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "()V")
    public final void method399() {
        if (this.field1170 == this.field1168 && this.field1172 == this.field1169) {
            return;
        }
        byte[] var1 = new byte[this.field1170 * this.field1169];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field1172; var3++) {
            for (int var4 = 0; var4 < this.field1168; var4++) {
                var1[(this.field1166 + var3) * this.field1170 + this.field1171 + var4] = this.field1165[var2++];
            }
        }
        this.field1165 = var1;
        this.field1168 = this.field1170;
        this.field1172 = this.field1169;
        this.field1171 = 0;
        this.field1166 = 0;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(II)V")
    public final void method400(int arg0, int arg1) {
        int var3 = this.field1171 + arg0;
        int var4 = this.field1166 + arg1;
        int var5 = class141.field3242 * var4 + var3;
        int var6 = 0;
        int var7 = this.field1172;
        int var8 = this.field1168;
        int var9 = class141.field3242 - var8;
        int var10 = 0;
        if (var4 < class141.field3238) {
            int var11 = class141.field3238 - var4;
            var7 -= var11;
            var4 = class141.field3238;
            var6 += var8 * var11;
            var5 += class141.field3242 * var11;
        }
        if (var4 + var7 > class141.field3241) {
            var7 -= var4 + var7 - class141.field3241;
        }
        if (var3 < class141.field3240) {
            int var12 = class141.field3240 - var3;
            var8 -= var12;
            var3 = class141.field3240;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class141.field3243) {
            int var13 = var3 + var8 - class141.field3243;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method401(class141.field3239, this.field1165, this.field1167, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "([I[B[IIIIIII)V")
    private static final void method401(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(III)V")
    public final void method402(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1167.length; var4++) {
            int var5 = this.field1167[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field1167[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field1167[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field1167[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }
}
