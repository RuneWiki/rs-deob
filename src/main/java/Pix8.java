import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!i")
public class Pix8 extends Draw2D {

    @OriginalMember(owner = "mapview!i", name = "v", descriptor = "I")
    public int field73;

    @OriginalMember(owner = "mapview!i", name = "w", descriptor = "I")
    public int field74;

    @OriginalMember(owner = "mapview!i", name = "q", descriptor = "[I")
    public int[] field68;

    @OriginalMember(owner = "mapview!i", name = "t", descriptor = "I")
    public int field71;

    @OriginalMember(owner = "mapview!i", name = "u", descriptor = "I")
    public int field72;

    @OriginalMember(owner = "mapview!i", name = "r", descriptor = "I")
    public int field69;

    @OriginalMember(owner = "mapview!i", name = "s", descriptor = "I")
    public int field70;

    @OriginalMember(owner = "mapview!i", name = "p", descriptor = "[B")
    public byte[] field67;

    @OriginalMember(owner = "mapview!i", name = "<init>", descriptor = "(Lp;Ljava/lang/String;I)V")
    public Pix8(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(arg0.method76(arg1 + ".dat", null));
        Packet var5 = new Packet(arg0.method76("index.dat", null));
        var5.field87 = var4.method57();
        this.field73 = var5.method57();
        this.field74 = var5.method57();
        int var6 = var5.method55();
        this.field68 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field68[var7 + 1] = var5.method60();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field87 += 2;
            var4.field87 += var5.method57() * var5.method57();
            var5.field87++;
        }
        this.field71 = var5.method55();
        this.field72 = var5.method55();
        this.field69 = var5.method57();
        this.field70 = var5.method57();
        int var9 = var5.method55();
        int var10 = this.field70 * this.field69;
        this.field67 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field67[var11] = var4.method56();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field69; var12++) {
                for (int var13 = 0; var13 < this.field70; var13++) {
                    this.field67[this.field69 * var13 + var12] = var4.method56();
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!i", name = "d", descriptor = "(IIII)V")
    public void method47(int arg0, int arg1, int arg2, int arg3) {
        try {
            int var5 = this.field69;
            int var6 = this.field70;
            int var7 = 0;
            int var8 = 0;
            int var9 = (var5 << 16) / arg2;
            int var10 = (var6 << 16) / arg3;
            int var11 = this.field73;
            int var12 = this.field74;
            int var13 = (var11 << 16) / arg2;
            int var14 = (var12 << 16) / arg3;
            int var15 = (this.field71 * arg2 + var11 - 1) / var11 + arg0;
            int var16 = (this.field72 * arg3 + var12 - 1) / var12 + arg1;
            if (this.field71 * arg2 % var11 != 0) {
                var7 = (var11 - this.field71 * arg2 % var11 << 16) / arg2;
            }
            if (this.field72 * arg3 % var12 != 0) {
                var8 = (var12 - this.field72 * arg3 % var12 << 16) / arg3;
            }
            int var17 = (this.field69 - (var7 >> 16)) * arg2 / var11;
            int var18 = (this.field70 - (var8 >> 16)) * arg3 / var12;
            int var19 = Draw2D.field46 * var16 + var15;
            int var20 = Draw2D.field46 - var17;
            if (var16 < Draw2D.field48) {
                int var21 = Draw2D.field48 - var16;
                var18 -= var21;
                var16 = 0;
                var19 += Draw2D.field46 * var21;
                var8 += var14 * var21;
            }
            if (var16 + var18 > Draw2D.field49) {
                var18 -= var16 + var18 - Draw2D.field49;
            }
            if (var15 < Draw2D.field50) {
                int var22 = Draw2D.field50 - var15;
                var17 -= var22;
                var15 = 0;
                var19 += var22;
                var7 += var13 * var22;
                var20 += var22;
            }
            if (var15 + var17 > Draw2D.field51) {
                int var23 = var15 + var17 - Draw2D.field51;
                var17 -= var23;
                var20 += var23;
            }
            this.method48(Draw2D.field45, this.field67, this.field68, var7, var8, var19, var20, var17, var18, var13, var14, var5);
        } catch (Exception var25) {
            System.out.println("error in sprite clipping routine");
        }
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "([I[B[IIIIIIIIII)V")
    private void method48(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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
