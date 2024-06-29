import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!h")
public class class8 extends class5 {

    @OriginalMember(owner = "mapview!h", name = "v", descriptor = "I")
    public int field65;

    @OriginalMember(owner = "mapview!h", name = "w", descriptor = "I")
    public int field66;

    @OriginalMember(owner = "mapview!h", name = "q", descriptor = "[I")
    public int[] field60;

    @OriginalMember(owner = "mapview!h", name = "t", descriptor = "I")
    public int field63;

    @OriginalMember(owner = "mapview!h", name = "u", descriptor = "I")
    public int field64;

    @OriginalMember(owner = "mapview!h", name = "r", descriptor = "I")
    public int field61;

    @OriginalMember(owner = "mapview!h", name = "s", descriptor = "I")
    public int field62;

    @OriginalMember(owner = "mapview!h", name = "p", descriptor = "[B")
    public byte[] field59;

    @OriginalMember(owner = "mapview!h", name = "<init>", descriptor = "(Lo;Ljava/lang/String;I)V")
    public class8(class15 arg0, String arg1, int arg2) {
        class10 var4 = new class10(arg0.method62(arg1 + ".dat", null));
        class10 var5 = new class10(arg0.method62("index.dat", null));
        var5.field77 = var4.method47();
        this.field65 = var5.method47();
        this.field66 = var5.method47();
        int var6 = var5.method45();
        this.field60 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field60[var7 + 1] = var5.method49();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field77 += 2;
            var4.field77 += var5.method47() * var5.method47();
            var5.field77++;
        }
        this.field63 = var5.method45();
        this.field64 = var5.method45();
        this.field61 = var5.method47();
        this.field62 = var5.method47();
        int var9 = var5.method45();
        int var10 = this.field62 * this.field61;
        this.field59 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field59[var11] = var4.method46();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field61; var12++) {
                for (int var13 = 0; var13 < this.field62; var13++) {
                    this.field59[this.field61 * var13 + var12] = var4.method46();
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!h", name = "d", descriptor = "(IIII)V")
    public void method36(int arg0, int arg1, int arg2, int arg3) {
        try {
            int var5 = this.field61;
            int var6 = this.field62;
            int var7 = 0;
            int var8 = 0;
            int var9 = (var5 << 16) / arg2;
            int var10 = (var6 << 16) / arg3;
            int var11 = this.field65;
            int var12 = this.field66;
            int var13 = (var11 << 16) / arg2;
            int var14 = (var12 << 16) / arg3;
            int var15 = (this.field63 * arg2 + var11 - 1) / var11 + arg0;
            int var16 = (this.field64 * arg3 + var12 - 1) / var12 + arg1;
            if (this.field63 * arg2 % var11 != 0) {
                var7 = (var11 - this.field63 * arg2 % var11 << 16) / arg2;
            }
            if (this.field64 * arg3 % var12 != 0) {
                var8 = (var12 - this.field64 * arg3 % var12 << 16) / arg3;
            }
            int var17 = (this.field61 - (var7 >> 16)) * arg2 / var11;
            int var18 = (this.field62 - (var8 >> 16)) * arg3 / var12;
            int var19 = class5.field38 * var16 + var15;
            int var20 = class5.field38 - var17;
            if (var16 < class5.field40) {
                int var21 = class5.field40 - var16;
                var18 -= var21;
                var16 = 0;
                var19 += class5.field38 * var21;
                var8 += var14 * var21;
            }
            if (var16 + var18 > class5.field41) {
                var18 -= var16 + var18 - class5.field41;
            }
            if (var15 < class5.field42) {
                int var22 = class5.field42 - var15;
                var17 -= var22;
                var15 = 0;
                var19 += var22;
                var7 += var13 * var22;
                var20 += var22;
            }
            if (var15 + var17 > class5.field43) {
                int var23 = var15 + var17 - class5.field43;
                var17 -= var23;
                var20 += var23;
            }
            this.method37(class5.field37, this.field59, this.field60, var7, var8, var19, var20, var17, var18, var13, var14, var5);
        } catch (Exception var25) {
            System.out.println("error in sprite clipping routine");
        }
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "([I[B[IIIIIIIIII)V")
    private void method37(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        try {
            int var13 = arg3;
            for (int var14 = -arg8; var14 < 0; var14++) {
                int var15 = (arg4 >> 16) * arg11;
                for (int var16 = -arg7; var16 < 0; var16++) {
                    byte var17 = arg1[(arg3 >> 16) + var15];
                    if (var17 == 0) {
                        arg5++;
                    } else {
                        arg0[arg5++] = arg2[var17 & 0xFF];
                    }
                    arg3 += arg9;
                }
                arg4 += arg10;
                arg3 = var13;
                arg5 += arg6;
            }
        } catch (Exception var19) {
            System.out.println("error in plot_scale");
        }
    }
}
