import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class116 extends class38 {

    @OriginalMember(owner = "client!qe", name = "M", descriptor = "I")
    public int field2567;

    @OriginalMember(owner = "client!qe", name = "N", descriptor = "I")
    public int field2568;

    @OriginalMember(owner = "client!qe", name = "P", descriptor = "I")
    public int field2570;

    @OriginalMember(owner = "client!qe", name = "Q", descriptor = "I")
    public int field2571;

    @OriginalMember(owner = "client!qe", name = "R", descriptor = "I")
    public int field2572;

    @OriginalMember(owner = "client!qe", name = "T", descriptor = "I")
    public int field2574;

    @OriginalMember(owner = "client!qe", name = "O", descriptor = "[B")
    public byte[] field2569;

    @OriginalMember(owner = "client!qe", name = "S", descriptor = "[I")
    public int[] field2573;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "([I[B[IIIIIII)V")
    private static final void method881(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "()V")
    public final void method882() {
        if (this.field2572 == this.field2571 && this.field2574 == this.field2568) {
            return;
        }
        byte[] var1 = new byte[this.field2571 * this.field2568];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2574; var3++) {
            for (int var4 = 0; var4 < this.field2572; var4++) {
                var1[(this.field2570 + var3) * this.field2571 + this.field2567 + var4] = this.field2569[var2++];
            }
        }
        this.field2569 = var1;
        this.field2572 = this.field2571;
        this.field2574 = this.field2568;
        this.field2567 = 0;
        this.field2570 = 0;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)V")
    public final void method883(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2573.length; var4++) {
            int var5 = this.field2573[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field2573[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field2573[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field2573[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)V")
    public final void method884(int arg0, int arg1) {
        int var3 = this.field2567 + arg0;
        int var4 = this.field2570 + arg1;
        int var5 = class38.field924 * var4 + var3;
        int var6 = 0;
        int var7 = this.field2574;
        int var8 = this.field2572;
        int var9 = class38.field924 - var8;
        int var10 = 0;
        if (var4 < class38.field922) {
            int var11 = class38.field922 - var4;
            var7 -= var11;
            var4 = class38.field922;
            var6 += var8 * var11;
            var5 += class38.field924 * var11;
        }
        if (var4 + var7 > class38.field926) {
            var7 -= var4 + var7 - class38.field926;
        }
        if (var3 < class38.field928) {
            int var12 = class38.field928 - var3;
            var8 -= var12;
            var3 = class38.field928;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class38.field925) {
            int var13 = var3 + var8 - class38.field925;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method881(class38.field923, this.field2569, this.field2573, var6, var5, var8, var7, var9, var10);
        }
    }
}
