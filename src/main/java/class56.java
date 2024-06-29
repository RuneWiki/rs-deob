import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class56 extends class138 {

    @OriginalMember(owner = "client!i", name = "db", descriptor = "I")
    public int field1234;

    @OriginalMember(owner = "client!i", name = "eb", descriptor = "I")
    public int field1235;

    @OriginalMember(owner = "client!i", name = "fb", descriptor = "I")
    public int field1236;

    @OriginalMember(owner = "client!i", name = "gb", descriptor = "I")
    public int field1237;

    @OriginalMember(owner = "client!i", name = "hb", descriptor = "I")
    public int field1238;

    @OriginalMember(owner = "client!i", name = "jb", descriptor = "I")
    public int field1240;

    @OriginalMember(owner = "client!i", name = "ib", descriptor = "[B")
    public byte[] field1239;

    @OriginalMember(owner = "client!i", name = "kb", descriptor = "[I")
    public int[] field1241;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(II)V")
    public final void method430(int arg0, int arg1) {
        int var3 = this.field1238 + arg0;
        int var4 = this.field1240 + arg1;
        int var5 = class138.field3248 * var4 + var3;
        int var6 = 0;
        int var7 = this.field1234;
        int var8 = this.field1237;
        int var9 = class138.field3248 - var8;
        int var10 = 0;
        if (var4 < class138.field3249) {
            int var11 = class138.field3249 - var4;
            var7 -= var11;
            var4 = class138.field3249;
            var6 += var8 * var11;
            var5 += class138.field3248 * var11;
        }
        if (var4 + var7 > class138.field3250) {
            var7 -= var4 + var7 - class138.field3250;
        }
        if (var3 < class138.field3252) {
            int var12 = class138.field3252 - var3;
            var8 -= var12;
            var3 = class138.field3252;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class138.field3251) {
            int var13 = var3 + var8 - class138.field3251;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method432(class138.field3254, this.field1239, this.field1241, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "()V")
    public final void method431() {
        if (this.field1237 == this.field1235 && this.field1236 == this.field1234) {
            return;
        }
        byte[] var1 = new byte[this.field1236 * this.field1235];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field1234; var3++) {
            for (int var4 = 0; var4 < this.field1237; var4++) {
                var1[(this.field1240 + var3) * this.field1235 + this.field1238 + var4] = this.field1239[var2++];
            }
        }
        this.field1239 = var1;
        this.field1237 = this.field1235;
        this.field1234 = this.field1236;
        this.field1238 = 0;
        this.field1240 = 0;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([I[B[IIIIIII)V")
    private static final void method432(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III)V")
    public final void method433(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1241.length; var4++) {
            int var5 = this.field1241[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field1241[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field1241[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field1241[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }
}
