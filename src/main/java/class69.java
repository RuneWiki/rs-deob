import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class69 extends class140 {

    @OriginalMember(owner = "client!k", name = "R", descriptor = "I")
    public int field1382;

    @OriginalMember(owner = "client!k", name = "S", descriptor = "I")
    public int field1383;

    @OriginalMember(owner = "client!k", name = "U", descriptor = "I")
    public int field1385;

    @OriginalMember(owner = "client!k", name = "V", descriptor = "I")
    public int field1386;

    @OriginalMember(owner = "client!k", name = "W", descriptor = "I")
    public int field1387;

    @OriginalMember(owner = "client!k", name = "Y", descriptor = "I")
    public int field1389;

    @OriginalMember(owner = "client!k", name = "T", descriptor = "[B")
    public byte[] field1384;

    @OriginalMember(owner = "client!k", name = "X", descriptor = "[I")
    public int[] field1388;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(III)V")
    public final void method537(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1388.length; var4++) {
            int var5 = this.field1388[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field1388[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field1388[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field1388[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "([I[B[IIIIIII)V")
    private static final void method538(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(II)V")
    public final void method539(int arg0, int arg1) {
        int var3 = this.field1389 + arg0;
        int var4 = this.field1387 + arg1;
        int var5 = class140.field3046 * var4 + var3;
        int var6 = 0;
        int var7 = this.field1382;
        int var8 = this.field1386;
        int var9 = class140.field3046 - var8;
        int var10 = 0;
        if (var4 < class140.field3047) {
            int var11 = class140.field3047 - var4;
            var7 -= var11;
            var4 = class140.field3047;
            var6 += var8 * var11;
            var5 += class140.field3046 * var11;
        }
        if (var4 + var7 > class140.field3052) {
            var7 -= var4 + var7 - class140.field3052;
        }
        if (var3 < class140.field3049) {
            int var12 = class140.field3049 - var3;
            var8 -= var12;
            var3 = class140.field3049;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class140.field3050) {
            int var13 = var3 + var8 - class140.field3050;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method538(class140.field3051, this.field1384, this.field1388, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!k", name = "d", descriptor = "()V")
    public final void method540() {
        if (this.field1386 == this.field1385 && this.field1383 == this.field1382) {
            return;
        }
        byte[] var1 = new byte[this.field1385 * this.field1383];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field1382; var3++) {
            for (int var4 = 0; var4 < this.field1386; var4++) {
                var1[(this.field1387 + var3) * this.field1385 + this.field1389 + var4] = this.field1384[var2++];
            }
        }
        this.field1384 = var1;
        this.field1386 = this.field1385;
        this.field1382 = this.field1383;
        this.field1389 = 0;
        this.field1387 = 0;
    }
}
