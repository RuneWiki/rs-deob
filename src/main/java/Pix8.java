import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ib")
public class Pix8 extends Pix2D {

    @OriginalMember(owner = "ib", name = "x", descriptor = "Z")
    private boolean field585 = false;

    @OriginalMember(owner = "ib", name = "y", descriptor = "I")
    private int field586 = -12745;

    @OriginalMember(owner = "ib", name = "z", descriptor = "Z")
    private boolean field587 = true;

    @OriginalMember(owner = "ib", name = "A", descriptor = "I")
    private int field588 = -937;

    @OriginalMember(owner = "ib", name = "B", descriptor = "Z")
    private boolean field589 = true;

    @OriginalMember(owner = "ib", name = "I", descriptor = "I")
    public int field596;

    @OriginalMember(owner = "ib", name = "J", descriptor = "I")
    public int field597;

    @OriginalMember(owner = "ib", name = "D", descriptor = "[I")
    public int[] field591;

    @OriginalMember(owner = "ib", name = "G", descriptor = "I")
    public int field594;

    @OriginalMember(owner = "ib", name = "H", descriptor = "I")
    public int field595;

    @OriginalMember(owner = "ib", name = "E", descriptor = "I")
    public int field592;

    @OriginalMember(owner = "ib", name = "F", descriptor = "I")
    public int field593;

    @OriginalMember(owner = "ib", name = "C", descriptor = "[B")
    public byte[] field590;

    @OriginalMember(owner = "ib", name = "<init>", descriptor = "(Lub;Ljava/lang/String;I)V")
    public Pix8(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(0, arg0.method250(arg1 + ".dat", null, 8));
        Packet var5 = new Packet(0, arg0.method250("index.dat", null, 8));
        var5.field621 = var4.method211();
        this.field596 = var5.method211();
        this.field597 = var5.method211();
        int var6 = var5.method209();
        this.field591 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field591[var7 + 1] = var5.method213();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field621 += 2;
            var4.field621 += var5.method211() * var5.method211();
            var5.field621++;
        }
        this.field594 = var5.method209();
        this.field595 = var5.method209();
        this.field592 = var5.method211();
        this.field593 = var5.method211();
        int var9 = var5.method209();
        int var10 = this.field593 * this.field592;
        this.field590 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field590[var11] = var4.method210();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field592; var12++) {
                for (int var13 = 0; var13 < this.field593; var13++) {
                    this.field590[this.field592 * var13 + var12] = var4.method210();
                }
            }
        }
    }

    @OriginalMember(owner = "ib", name = "c", descriptor = "(I)V")
    public void method182(int arg0) {
        this.field596 /= 2;
        this.field597 /= 2;
        byte[] var2 = new byte[this.field597 * this.field596];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field593; var4++) {
            for (int var5 = 0; var5 < this.field592; var5++) {
                var2[(this.field594 + var5 >> 1) + (this.field595 + var4 >> 1) * this.field596] = this.field590[var3++];
            }
        }
        this.field590 = var2;
        if (this.field586 != arg0) {
            this.field585 = !this.field585;
        }
        this.field592 = this.field596;
        this.field593 = this.field597;
        this.field594 = 0;
        this.field595 = 0;
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(Z)V")
    public void method183(boolean arg0) {
        if (this.field596 == this.field592 && this.field597 == this.field593) {
            return;
        }
        byte[] var2 = new byte[this.field597 * this.field596];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field593; var4++) {
            for (int var5 = 0; var5 < this.field592; var5++) {
                var2[(this.field595 + var4) * this.field596 + this.field594 + var5] = this.field590[var3++];
            }
        }
        if (arg0) {
            this.field586 = 161;
        }
        this.field590 = var2;
        this.field592 = this.field596;
        this.field593 = this.field597;
        this.field594 = 0;
        this.field595 = 0;
    }

    @OriginalMember(owner = "ib", name = "b", descriptor = "(Z)V")
    public void method184(boolean arg0) {
        byte[] var2 = new byte[this.field593 * this.field592];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field593; var4++) {
            for (int var6 = this.field592 - 1; var6 >= 0; var6--) {
                var2[var3++] = this.field590[this.field592 * var4 + var6];
            }
        }
        if (arg0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.field590 = var2;
        this.field594 = this.field596 - this.field592 - this.field594;
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(B)V")
    public void method185(byte arg0) {
        if (arg0 != 92) {
            return;
        }
        byte[] var2 = new byte[this.field593 * this.field592];
        int var3 = 0;
        for (int var4 = this.field593 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field592; var5++) {
                var2[var3++] = this.field590[this.field592 * var4 + var5];
            }
        }
        this.field590 = var2;
        this.field595 = this.field597 - this.field593 - this.field595;
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(III)V")
    public void method186(int arg0, int arg1, int arg2) {
        int var4 = this.field594 + arg1;
        int var5 = this.field595 + arg2;
        int var6 = Pix2D.field535 * var5 + var4;
        int var7 = 0;
        int var8 = this.field593;
        int var9 = this.field592;
        int var10 = Pix2D.field535 - var9;
        int var11 = 0;
        if (var5 < Pix2D.field537) {
            int var12 = Pix2D.field537 - var5;
            var8 -= var12;
            var5 = Pix2D.field537;
            var7 += var9 * var12;
            var6 += Pix2D.field535 * var12;
        }
        if (var5 + var8 > Pix2D.field538) {
            var8 -= var5 + var8 - Pix2D.field538;
        }
        if (var4 < Pix2D.field539) {
            int var13 = Pix2D.field539 - var4;
            var9 -= var13;
            var4 = Pix2D.field539;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field540) {
            int var14 = var4 + var9 - Pix2D.field540;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method187(0, this.field591, var6, var8, var7, var11, var9, var10, Pix2D.field534, this.field590);
            if (arg0 >= 0) {
                this.field585 = !this.field585;
            }
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(I[IIIIIII[I[B)V")
    private void method187(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, byte[] arg9) {
        int var11 = -(arg6 >> 2);
        int var12 = -(arg6 & 0x3);
        if (arg0 != 0) {
            this.field588 = 389;
        }
        for (int var13 = -arg3; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg9[arg4++];
                if (var17 == 0) {
                    arg2++;
                } else {
                    arg8[arg2++] = arg1[var17 & 0xFF];
                }
                byte var18 = arg9[arg4++];
                if (var18 == 0) {
                    arg2++;
                } else {
                    arg8[arg2++] = arg1[var18 & 0xFF];
                }
                byte var19 = arg9[arg4++];
                if (var19 == 0) {
                    arg2++;
                } else {
                    arg8[arg2++] = arg1[var19 & 0xFF];
                }
                byte var20 = arg9[arg4++];
                if (var20 == 0) {
                    arg2++;
                } else {
                    arg8[arg2++] = arg1[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg9[arg4++];
                if (var16 == 0) {
                    arg2++;
                } else {
                    arg8[arg2++] = arg1[var16 & 0xFF];
                }
            }
            arg2 += arg7;
            arg4 += arg5;
        }
    }
}
