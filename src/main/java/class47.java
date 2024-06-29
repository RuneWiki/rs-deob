import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class47 extends class71 {

    @OriginalMember(owner = "client!fa", name = "Q", descriptor = "I")
    public int field1140;

    @OriginalMember(owner = "client!fa", name = "T", descriptor = "I")
    public int field1143;

    @OriginalMember(owner = "client!fa", name = "U", descriptor = "I")
    public int field1144;

    @OriginalMember(owner = "client!fa", name = "V", descriptor = "I")
    public int field1145;

    @OriginalMember(owner = "client!fa", name = "W", descriptor = "I")
    public int field1146;

    @OriginalMember(owner = "client!fa", name = "X", descriptor = "I")
    public int field1147;

    @OriginalMember(owner = "client!fa", name = "S", descriptor = "[B")
    public byte[] field1142;

    @OriginalMember(owner = "client!fa", name = "R", descriptor = "[I")
    public int[] field1141;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)V")
    public final void method334(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1141.length; var4++) {
            int var5 = this.field1141[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field1141[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field1141[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field1141[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)V")
    public final void method335(int arg0, int arg1) {
        int var3 = this.field1145 + arg0;
        int var4 = this.field1143 + arg1;
        int var5 = class71.field1755 * var4 + var3;
        int var6 = 0;
        int var7 = this.field1144;
        int var8 = this.field1147;
        int var9 = class71.field1755 - var8;
        int var10 = 0;
        if (var4 < class71.field1756) {
            int var11 = class71.field1756 - var4;
            var7 -= var11;
            var4 = class71.field1756;
            var6 += var8 * var11;
            var5 += class71.field1755 * var11;
        }
        if (var4 + var7 > class71.field1757) {
            var7 -= var4 + var7 - class71.field1757;
        }
        if (var3 < class71.field1754) {
            int var12 = class71.field1754 - var3;
            var8 -= var12;
            var3 = class71.field1754;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class71.field1760) {
            int var13 = var3 + var8 - class71.field1760;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method336(class71.field1759, this.field1142, this.field1141, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
    protected class47() {
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "([I[B[IIIIIII)V")
    private static final void method336(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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
