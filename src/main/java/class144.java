import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class144 extends class56 {

    @OriginalMember(owner = "client!ue", name = "M", descriptor = "I")
    public int field3280;

    @OriginalMember(owner = "client!ue", name = "N", descriptor = "I")
    public int field3281;

    @OriginalMember(owner = "client!ue", name = "O", descriptor = "I")
    public int field3282;

    @OriginalMember(owner = "client!ue", name = "Q", descriptor = "I")
    public int field3284;

    @OriginalMember(owner = "client!ue", name = "R", descriptor = "I")
    public int field3285;

    @OriginalMember(owner = "client!ue", name = "T", descriptor = "I")
    public int field3287;

    @OriginalMember(owner = "client!ue", name = "S", descriptor = "[B")
    public byte[] field3286;

    @OriginalMember(owner = "client!ue", name = "P", descriptor = "[I")
    public int[] field3283;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "()V")
    public final void method1063() {
        if (this.field3281 == this.field3280 && this.field3287 == this.field3285) {
            return;
        }
        byte[] var1 = new byte[this.field3285 * this.field3281];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3287; var3++) {
            for (int var4 = 0; var4 < this.field3280; var4++) {
                var1[(this.field3282 + var3) * this.field3281 + this.field3284 + var4] = this.field3286[var2++];
            }
        }
        this.field3286 = var1;
        this.field3280 = this.field3281;
        this.field3287 = this.field3285;
        this.field3284 = 0;
        this.field3282 = 0;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)V")
    public final void method1064(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3283.length; var4++) {
            int var5 = this.field3283[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field3283[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field3283[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field3283[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)V")
    public final void method1065(int arg0, int arg1) {
        int var3 = this.field3284 + arg0;
        int var4 = this.field3282 + arg1;
        int var5 = class56.field1265 * var4 + var3;
        int var6 = 0;
        int var7 = this.field3287;
        int var8 = this.field3280;
        int var9 = class56.field1265 - var8;
        int var10 = 0;
        if (var4 < class56.field1266) {
            int var11 = class56.field1266 - var4;
            var7 -= var11;
            var4 = class56.field1266;
            var6 += var8 * var11;
            var5 += class56.field1265 * var11;
        }
        if (var4 + var7 > class56.field1270) {
            var7 -= var4 + var7 - class56.field1270;
        }
        if (var3 < class56.field1268) {
            int var12 = class56.field1268 - var3;
            var8 -= var12;
            var3 = class56.field1268;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class56.field1267) {
            int var13 = var3 + var8 - class56.field1267;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method1066(class56.field1269, this.field3286, this.field3283, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "([I[B[IIIIIII)V")
    private static final void method1066(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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
}
