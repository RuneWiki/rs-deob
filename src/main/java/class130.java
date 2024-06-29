import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class130 extends class196 {

    @OriginalMember(owner = "client!oe", name = "J", descriptor = "I")
    public int field2699;

    @OriginalMember(owner = "client!oe", name = "K", descriptor = "I")
    public int field2700;

    @OriginalMember(owner = "client!oe", name = "L", descriptor = "I")
    public int field2701;

    @OriginalMember(owner = "client!oe", name = "N", descriptor = "I")
    public int field2703;

    @OriginalMember(owner = "client!oe", name = "P", descriptor = "I")
    public int field2705;

    @OriginalMember(owner = "client!oe", name = "Q", descriptor = "I")
    public int field2706;

    @OriginalMember(owner = "client!oe", name = "M", descriptor = "[B")
    public byte[] field2702;

    @OriginalMember(owner = "client!oe", name = "O", descriptor = "[I")
    public int[] field2704;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)V")
    public final void method836(int arg0, int arg1) {
        int var3 = this.field2700 + arg0;
        int var4 = this.field2699 + arg1;
        int var5 = class196.field3872 * var4 + var3;
        int var6 = 0;
        int var7 = this.field2701;
        int var8 = this.field2706;
        int var9 = class196.field3872 - var8;
        int var10 = 0;
        if (var4 < class196.field3873) {
            int var11 = class196.field3873 - var4;
            var7 -= var11;
            var4 = class196.field3873;
            var6 += var8 * var11;
            var5 += class196.field3872 * var11;
        }
        if (var4 + var7 > class196.field3867) {
            var7 -= var4 + var7 - class196.field3867;
        }
        if (var3 < class196.field3870) {
            int var12 = class196.field3870 - var3;
            var8 -= var12;
            var3 = class196.field3870;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class196.field3869) {
            int var13 = var3 + var8 - class196.field3869;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method837(class196.field3871, this.field2702, this.field2704, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([I[B[IIIIIII)V")
    private static final void method837(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)V")
    public final void method838(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2704.length; var4++) {
            int var5 = this.field2704[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field2704[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field2704[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field2704[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
    protected class130() {
    }
}
