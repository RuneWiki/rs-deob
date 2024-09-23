import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ib")
public class Pix8 extends Pix2D {

    @OriginalMember(owner = "ib", name = "y", descriptor = "B")
    private byte field587 = 3;

    @OriginalMember(owner = "ib", name = "z", descriptor = "B")
    private byte field588 = 5;

    @OriginalMember(owner = "ib", name = "A", descriptor = "B")
    private byte field589 = -104;

    @OriginalMember(owner = "ib", name = "B", descriptor = "B")
    private byte field590 = -19;

    @OriginalMember(owner = "ib", name = "C", descriptor = "B")
    private byte field591 = -19;

    @OriginalMember(owner = "ib", name = "D", descriptor = "Z")
    private boolean field592 = false;

    @OriginalMember(owner = "ib", name = "K", descriptor = "I")
    public int field599;

    @OriginalMember(owner = "ib", name = "L", descriptor = "I")
    public int field600;

    @OriginalMember(owner = "ib", name = "F", descriptor = "[I")
    public int[] field594;

    @OriginalMember(owner = "ib", name = "I", descriptor = "I")
    public int field597;

    @OriginalMember(owner = "ib", name = "J", descriptor = "I")
    public int field598;

    @OriginalMember(owner = "ib", name = "G", descriptor = "I")
    public int field595;

    @OriginalMember(owner = "ib", name = "H", descriptor = "I")
    public int field596;

    @OriginalMember(owner = "ib", name = "E", descriptor = "[B")
    public byte[] field593;

    @OriginalMember(owner = "ib", name = "x", descriptor = "Z")
    private static boolean field586 = true;

    @OriginalMember(owner = "ib", name = "<init>", descriptor = "(Lub;Ljava/lang/String;I)V")
    public Pix8(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(arg0.method249(arg1 + ".dat", true, null), field586);
        Packet var5 = new Packet(arg0.method249("index.dat", true, null), field586);
        var5.field622 = var4.method210();
        this.field599 = var5.method210();
        this.field600 = var5.method210();
        int var6 = var5.method208();
        this.field594 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field594[var7 + 1] = var5.method212();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field622 += 2;
            var4.field622 += var5.method210() * var5.method210();
            var5.field622++;
        }
        this.field597 = var5.method208();
        this.field598 = var5.method208();
        this.field595 = var5.method210();
        this.field596 = var5.method210();
        int var9 = var5.method208();
        int var10 = this.field596 * this.field595;
        this.field593 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field593[var11] = var4.method209();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field595; var12++) {
                for (int var13 = 0; var13 < this.field596; var13++) {
                    this.field593[this.field595 * var13 + var12] = var4.method209();
                }
            }
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(B)V")
    public void method181(byte arg0) {
        if (arg0 != -128) {
            return;
        }
        this.field599 /= 2;
        this.field600 /= 2;
        byte[] var2 = new byte[this.field600 * this.field599];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field596; var4++) {
            for (int var5 = 0; var5 < this.field595; var5++) {
                var2[(this.field597 + var5 >> 1) + (this.field598 + var4 >> 1) * this.field599] = this.field593[var3++];
            }
        }
        this.field593 = var2;
        this.field595 = this.field599;
        this.field596 = this.field600;
        this.field597 = 0;
        this.field598 = 0;
    }

    @OriginalMember(owner = "ib", name = "c", descriptor = "(Z)V")
    public void method182(boolean arg0) {
        if (this.field599 == this.field595 && this.field600 == this.field596) {
            return;
        }
        byte[] var2 = new byte[this.field600 * this.field599];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field596; var4++) {
            for (int var5 = 0; var5 < this.field595; var5++) {
                var2[(this.field598 + var4) * this.field599 + this.field597 + var5] = this.field593[var3++];
            }
        }
        this.field593 = var2;
        this.field595 = this.field599;
        this.field596 = this.field600;
        this.field597 = 0;
        this.field598 = 0;
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(I)V")
    public void method183(int arg0) {
        byte[] var2 = new byte[this.field596 * this.field595];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field596; var4++) {
            for (int var5 = this.field595 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field593[this.field595 * var4 + var5];
            }
        }
        this.field593 = var2;
        if (arg0 != 1) {
            this.field592 = !this.field592;
        }
        this.field597 = this.field599 - this.field595 - this.field597;
    }

    @OriginalMember(owner = "ib", name = "b", descriptor = "(I)V")
    public void method184(int arg0) {
        byte[] var2 = new byte[this.field596 * this.field595];
        if (arg0 != 0) {
            field586 = !field586;
        }
        int var3 = 0;
        for (int var4 = this.field596 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field595; var5++) {
                var2[var3++] = this.field593[this.field595 * var4 + var5];
            }
        }
        this.field593 = var2;
        this.field598 = this.field600 - this.field596 - this.field598;
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(III)V")
    public void method185(int arg0, int arg1, int arg2) {
        int var4 = this.field597 + arg0;
        int var5 = this.field598 + arg2;
        int var6 = Pix2D.field535 * var5 + var4;
        int var7 = 0;
        int var8 = this.field596;
        int var9 = this.field595;
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
            this.method186(this.field594, var11, var7, this.field589, var10, var6, this.field593, var8, var9, Pix2D.field534);
            if (arg1 == 0) {
                ;
            }
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "([IIIBII[BII[I)V")
    private void method186(int[] arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8, int[] arg9) {
        if (arg3 != -104) {
            this.field592 = !this.field592;
        }
        int var11 = -(arg8 >> 2);
        int var12 = -(arg8 & 0x3);
        for (int var13 = -arg7; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg6[arg2++];
                if (var17 == 0) {
                    arg5++;
                } else {
                    arg9[arg5++] = arg0[var17 & 0xFF];
                }
                byte var18 = arg6[arg2++];
                if (var18 == 0) {
                    arg5++;
                } else {
                    arg9[arg5++] = arg0[var18 & 0xFF];
                }
                byte var19 = arg6[arg2++];
                if (var19 == 0) {
                    arg5++;
                } else {
                    arg9[arg5++] = arg0[var19 & 0xFF];
                }
                byte var20 = arg6[arg2++];
                if (var20 == 0) {
                    arg5++;
                } else {
                    arg9[arg5++] = arg0[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg6[arg2++];
                if (var16 == 0) {
                    arg5++;
                } else {
                    arg9[arg5++] = arg0[var16 & 0xFF];
                }
            }
            arg5 += arg4;
            arg2 += arg1;
        }
    }
}
