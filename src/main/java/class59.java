import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class59 extends class130 {

    @OriginalMember(owner = "client!gd", name = "W", descriptor = "I")
    public int field1100;

    @OriginalMember(owner = "client!gd", name = "Z", descriptor = "I")
    public int field1103;

    @OriginalMember(owner = "client!gd", name = "ab", descriptor = "I")
    public int field1104;

    @OriginalMember(owner = "client!gd", name = "bb", descriptor = "I")
    public int field1105;

    @OriginalMember(owner = "client!gd", name = "cb", descriptor = "I")
    public int field1106;

    @OriginalMember(owner = "client!gd", name = "db", descriptor = "I")
    public int field1107;

    @OriginalMember(owner = "client!gd", name = "X", descriptor = "[B")
    public byte[] field1101;

    @OriginalMember(owner = "client!gd", name = "Y", descriptor = "[I")
    public int[] field1102;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([I[B[IIIIIIII)V")
    private static final void method369(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = 256 - arg9;
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = -arg5; var12 < 0; var12++) {
                byte var13 = arg1[arg3++];
                if (var13 == 0) {
                    arg4++;
                } else {
                    int var14 = arg2[var13 & 0xFF];
                    int var15 = arg0[arg4];
                    arg0[arg4++] = ((var14 & 0xFF00FF) * arg9 + (var15 & 0xFF00FF) * var10 & 0xFF00FF00) + ((var14 & 0xFF00) * arg9 + (var15 & 0xFF00) * var10 & 0xFF0000) >> 8;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(II)V")
    public final void method370(int arg0, int arg1) {
        int var3 = this.field1100 + arg0;
        int var4 = this.field1107 + arg1;
        int var5 = class130.field2424 * var4 + var3;
        int var6 = 0;
        int var7 = this.field1103;
        int var8 = this.field1105;
        int var9 = class130.field2424 - var8;
        int var10 = 0;
        if (var4 < class130.field2425) {
            int var11 = class130.field2425 - var4;
            var7 -= var11;
            var4 = class130.field2425;
            var6 += var8 * var11;
            var5 += class130.field2424 * var11;
        }
        if (var4 + var7 > class130.field2428) {
            var7 -= var4 + var7 - class130.field2428;
        }
        if (var3 < class130.field2422) {
            int var12 = class130.field2422 - var3;
            var8 -= var12;
            var3 = class130.field2422;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class130.field2423) {
            int var13 = var3 + var8 - class130.field2423;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method372(class130.field2426, this.field1101, this.field1102, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)V")
    public final void method371(int arg0, int arg1, int arg2) {
        int var4 = this.field1100 + arg0;
        int var5 = this.field1107 + arg1;
        int var6 = class130.field2424 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1103;
        int var9 = this.field1105;
        int var10 = class130.field2424 - var9;
        int var11 = 0;
        if (var5 < class130.field2425) {
            int var12 = class130.field2425 - var5;
            var8 -= var12;
            var5 = class130.field2425;
            var7 += var9 * var12;
            var6 += class130.field2424 * var12;
        }
        if (var5 + var8 > class130.field2428) {
            var8 -= var5 + var8 - class130.field2428;
        }
        if (var4 < class130.field2422) {
            int var13 = class130.field2422 - var4;
            var9 -= var13;
            var4 = class130.field2422;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class130.field2423) {
            int var14 = var4 + var9 - class130.field2423;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method369(class130.field2426, this.field1101, this.field1102, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "([I[B[IIIIIIII)V")
    private static final void method372(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = -(arg6 >> 2);
        int var11 = -(arg6 & 0x3);
        for (int var12 = -arg7; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                byte var16 = arg1[arg4++];
                if (var16 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg2[var16 & 0xFF];
                }
                byte var17 = arg1[arg4++];
                if (var17 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg2[var17 & 0xFF];
                }
                byte var18 = arg1[arg4++];
                if (var18 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg2[var18 & 0xFF];
                }
                byte var19 = arg1[arg4++];
                if (var19 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg2[var19 & 0xFF];
                }
            }
            for (int var14 = var11; var14 < 0; var14++) {
                byte var15 = arg1[arg4++];
                if (var15 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg2[var15 & 0xFF];
                }
            }
            arg5 += arg8;
            arg4 += arg9;
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(III)V")
    public final void method373(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1102.length; var4++) {
            int var5 = this.field1102[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field1102[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field1102[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field1102[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V")
    protected class59() {
    }
}
