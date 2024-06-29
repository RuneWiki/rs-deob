import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class114 extends class120 {

    @OriginalMember(owner = "client!qd", name = "cb", descriptor = "I")
    public int field2653;

    @OriginalMember(owner = "client!qd", name = "bb", descriptor = "I")
    public int field2652;

    @OriginalMember(owner = "client!qd", name = "W", descriptor = "I")
    public int field2647;

    @OriginalMember(owner = "client!qd", name = "X", descriptor = "I")
    public int field2648;

    @OriginalMember(owner = "client!qd", name = "Z", descriptor = "I")
    public int field2650;

    @OriginalMember(owner = "client!qd", name = "ab", descriptor = "I")
    public int field2651;

    @OriginalMember(owner = "client!qd", name = "Y", descriptor = "[B")
    public byte[] field2649;

    @OriginalMember(owner = "client!qd", name = "db", descriptor = "[I")
    public int[] field2654;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)V")
    public final void method801(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2654.length; var4++) {
            int var5 = this.field2654[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field2654[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field2654[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field2654[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "()V")
    public final void method802() {
        byte[] var1 = new byte[this.field2653 * this.field2647];
        int var2 = 0;
        for (int var3 = this.field2647 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field2653; var4++) {
                var1[var2++] = this.field2649[this.field2653 * var3 + var4];
            }
        }
        this.field2649 = var1;
        this.field2650 = this.field2648 - this.field2647 - this.field2650;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)V")
    public final void method803(int arg0, int arg1) {
        int var3 = this.field2651 + arg0;
        int var4 = this.field2650 + arg1;
        int var5 = class120.field2775 * var4 + var3;
        int var6 = 0;
        int var7 = this.field2647;
        int var8 = this.field2653;
        int var9 = class120.field2775 - var8;
        int var10 = 0;
        if (var4 < class120.field2770) {
            int var11 = class120.field2770 - var4;
            var7 -= var11;
            var4 = class120.field2770;
            var6 += var8 * var11;
            var5 += class120.field2775 * var11;
        }
        if (var4 + var7 > class120.field2773) {
            var7 -= var4 + var7 - class120.field2773;
        }
        if (var3 < class120.field2774) {
            int var12 = class120.field2774 - var3;
            var8 -= var12;
            var3 = class120.field2774;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class120.field2776) {
            int var13 = var3 + var8 - class120.field2776;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method806(class120.field2771, this.field2649, this.field2654, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "()V")
    public final void method804() {
        if (this.field2653 == this.field2652 && this.field2648 == this.field2647) {
            return;
        }
        byte[] var1 = new byte[this.field2652 * this.field2648];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2647; var3++) {
            for (int var4 = 0; var4 < this.field2653; var4++) {
                var1[(this.field2650 + var3) * this.field2652 + this.field2651 + var4] = this.field2649[var2++];
            }
        }
        this.field2649 = var1;
        this.field2653 = this.field2652;
        this.field2647 = this.field2648;
        this.field2651 = 0;
        this.field2650 = 0;
    }

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "()V")
    public final void method805() {
        byte[] var1 = new byte[this.field2653 * this.field2647];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2647; var3++) {
            for (int var4 = this.field2653 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field2649[this.field2653 * var3 + var4];
            }
        }
        this.field2649 = var1;
        this.field2651 = this.field2652 - this.field2653 - this.field2651;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([I[B[IIIIIII)V")
    private static final void method806(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "()Lqd;")
    public final class114 method807() {
        class114 var1 = new class114(this.field2653, this.field2647, this.field2654.length);
        var1.field2652 = this.field2652;
        var1.field2648 = this.field2648;
        var1.field2651 = this.field2651;
        var1.field2650 = this.field2650;
        int var2 = this.field2649.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1.field2649[var3] = this.field2649[var3];
        }
        int var4 = this.field2654.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var1.field2654[var5] = this.field2654[var5];
        }
        return var1;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
    public class114() {
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(III)V")
    private class114(int arg0, int arg1, int arg2) {
        this.field2652 = this.field2653 = arg0;
        this.field2648 = this.field2647 = arg1;
        this.field2651 = this.field2650 = 0;
        this.field2649 = new byte[arg0 * arg1];
        this.field2654 = new int[arg2];
    }
}
