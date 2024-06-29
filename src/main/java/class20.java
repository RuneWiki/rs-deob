import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class20 extends class90 {

    @OriginalMember(owner = "client!ce", name = "eb", descriptor = "I")
    public int field570;

    @OriginalMember(owner = "client!ce", name = "fb", descriptor = "I")
    public int field571;

    @OriginalMember(owner = "client!ce", name = "gb", descriptor = "I")
    public int field572;

    @OriginalMember(owner = "client!ce", name = "ib", descriptor = "I")
    public int field574;

    @OriginalMember(owner = "client!ce", name = "kb", descriptor = "I")
    public int field576;

    @OriginalMember(owner = "client!ce", name = "lb", descriptor = "I")
    public int field577;

    @OriginalMember(owner = "client!ce", name = "hb", descriptor = "[B")
    public byte[] field573;

    @OriginalMember(owner = "client!ce", name = "jb", descriptor = "[I")
    public int[] field575;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)V")
    public final void method161(int arg0, int arg1) {
        int var3 = this.field571 + arg0;
        int var4 = this.field576 + arg1;
        int var5 = class90.field2205 * var4 + var3;
        int var6 = 0;
        int var7 = this.field577;
        int var8 = this.field574;
        int var9 = class90.field2205 - var8;
        int var10 = 0;
        if (var4 < class90.field2210) {
            int var11 = class90.field2210 - var4;
            var7 -= var11;
            var4 = class90.field2210;
            var6 += var8 * var11;
            var5 += class90.field2205 * var11;
        }
        if (var4 + var7 > class90.field2207) {
            var7 -= var4 + var7 - class90.field2207;
        }
        if (var3 < class90.field2208) {
            int var12 = class90.field2208 - var3;
            var8 -= var12;
            var3 = class90.field2208;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class90.field2204) {
            int var13 = var3 + var8 - class90.field2204;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method164(class90.field2206, this.field573, this.field575, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)V")
    public final void method162(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field575.length; var4++) {
            int var5 = this.field575[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field575[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field575[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field575[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "()V")
    public final void method163() {
        if (this.field574 == this.field572 && this.field577 == this.field570) {
            return;
        }
        byte[] var1 = new byte[this.field572 * this.field570];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field577; var3++) {
            for (int var4 = 0; var4 < this.field574; var4++) {
                var1[(this.field576 + var3) * this.field572 + this.field571 + var4] = this.field573[var2++];
            }
        }
        this.field573 = var1;
        this.field574 = this.field572;
        this.field577 = this.field570;
        this.field571 = 0;
        this.field576 = 0;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "([I[B[IIIIIII)V")
    private static final void method164(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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
