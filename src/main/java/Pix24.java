import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!h")
public class Pix24 extends Draw2D {

    @OriginalMember(owner = "mapview!h", name = "p", descriptor = "[I")
    public int[] field60;

    @OriginalMember(owner = "mapview!h", name = "u", descriptor = "I")
    public int field65;

    @OriginalMember(owner = "mapview!h", name = "q", descriptor = "I")
    public int field61;

    @OriginalMember(owner = "mapview!h", name = "v", descriptor = "I")
    public int field66;

    @OriginalMember(owner = "mapview!h", name = "r", descriptor = "I")
    public int field62;

    @OriginalMember(owner = "mapview!h", name = "t", descriptor = "I")
    public int field64;

    @OriginalMember(owner = "mapview!h", name = "s", descriptor = "I")
    public int field63;

    @OriginalMember(owner = "mapview!h", name = "c", descriptor = "()V")
    public void method42() {
        Draw2D.method29(this.field60, this.field61, this.field62);
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(II)V")
    public void method43(int arg0, int arg1) {
        int var3 = this.field63 + arg0;
        int var4 = this.field64 + arg1;
        int var5 = Draw2D.field46 * var4 + var3;
        int var6 = 0;
        int var7 = this.field62;
        int var8 = this.field61;
        int var9 = Draw2D.field46 - var8;
        int var10 = 0;
        if (var4 < Draw2D.field48) {
            int var11 = Draw2D.field48 - var4;
            var7 -= var11;
            var4 = Draw2D.field48;
            var6 += var8 * var11;
            var5 += Draw2D.field46 * var11;
        }
        if (var4 + var7 > Draw2D.field49) {
            var7 -= var4 + var7 - Draw2D.field49;
        }
        if (var3 < Draw2D.field50) {
            int var12 = Draw2D.field50 - var3;
            var8 -= var12;
            var3 = Draw2D.field50;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > Draw2D.field51) {
            int var13 = var3 + var8 - Draw2D.field51;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            this.method44(Draw2D.field45, this.field60, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method44(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = -(arg5 >> 2);
        int var11 = -(arg5 & 0x3);
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                int var16 = arg1[arg3++];
                if (var16 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var16;
                }
                int var17 = arg1[arg3++];
                if (var17 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var17;
                }
                int var18 = arg1[arg3++];
                if (var18 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var18;
                }
                int var19 = arg1[arg3++];
                if (var19 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var19;
                }
            }
            for (int var14 = var11; var14 < 0; var14++) {
                int var15 = arg1[arg3++];
                if (var15 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var15;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "mapview!h", name = "<init>", descriptor = "(II)V")
    public Pix24(int arg0, int arg1) {
        this.field60 = new int[arg0 * arg1];
        this.field61 = this.field65 = arg0;
        this.field62 = this.field66 = arg1;
        this.field63 = this.field64 = 0;
    }

    @OriginalMember(owner = "mapview!h", name = "<init>", descriptor = "(Lp;Ljava/lang/String;I)V")
    public Pix24(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(arg0.method76(arg1 + ".dat", null));
        Packet var5 = new Packet(arg0.method76("index.dat", null));
        var5.field87 = var4.method57();
        this.field65 = var5.method57();
        this.field66 = var5.method57();
        int var6 = var5.method55();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method60();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field87 += 2;
            var4.field87 += var5.method57() * var5.method57();
            var5.field87++;
        }
        this.field63 = var5.method55();
        this.field64 = var5.method55();
        this.field61 = var5.method57();
        this.field62 = var5.method57();
        int var10 = var5.method55();
        int var11 = this.field62 * this.field61;
        this.field60 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field60[var12] = var7[var4.method55()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field61; var13++) {
                for (int var14 = 0; var14 < this.field62; var14++) {
                    this.field60[this.field61 * var14 + var13] = var7[var4.method55()];
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!h", name = "b", descriptor = "(II)V")
    public void method45(int arg0, int arg1) {
        int var3 = this.field63 + arg0;
        int var4 = this.field64 + arg1;
        int var5 = Draw2D.field46 * var4 + var3;
        int var6 = 0;
        int var7 = this.field62;
        int var8 = this.field61;
        int var9 = Draw2D.field46 - var8;
        int var10 = 0;
        if (var4 < Draw2D.field48) {
            int var11 = Draw2D.field48 - var4;
            var7 -= var11;
            var4 = Draw2D.field48;
            var6 += var8 * var11;
            var5 += Draw2D.field46 * var11;
        }
        if (var4 + var7 > Draw2D.field49) {
            var7 -= var4 + var7 - Draw2D.field49;
        }
        if (var3 < Draw2D.field50) {
            int var12 = Draw2D.field50 - var3;
            var8 -= var12;
            var3 = Draw2D.field50;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > Draw2D.field51) {
            int var13 = var3 + var8 - Draw2D.field51;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            this.method46(Draw2D.field45, this.field60, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "([I[IIIIIII)V")
    private void method46(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = -(arg4 >> 2);
        int var10 = -(arg4 & 0x3);
        for (int var11 = -arg5; var11 < 0; var11++) {
            for (int var12 = var9; var12 < 0; var12++) {
                arg0[arg3++] = arg1[arg2++];
                arg0[arg3++] = arg1[arg2++];
                arg0[arg3++] = arg1[arg2++];
                arg0[arg3++] = arg1[arg2++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                arg0[arg3++] = arg1[arg2++];
            }
            arg3 += arg6;
            arg2 += arg7;
        }
    }
}
