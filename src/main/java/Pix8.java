import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ib")
public class Pix8 extends Pix2D {

    @OriginalMember(owner = "ib", name = "v", descriptor = "Z")
    private boolean field584 = false;

    @OriginalMember(owner = "ib", name = "w", descriptor = "I")
    private int field585 = 45861;

    @OriginalMember(owner = "ib", name = "x", descriptor = "B")
    private byte field586 = 5;

    @OriginalMember(owner = "ib", name = "y", descriptor = "Z")
    private boolean field587 = true;

    @OriginalMember(owner = "ib", name = "F", descriptor = "I")
    public int field594;

    @OriginalMember(owner = "ib", name = "G", descriptor = "I")
    public int field595;

    @OriginalMember(owner = "ib", name = "A", descriptor = "[I")
    public int[] field589;

    @OriginalMember(owner = "ib", name = "D", descriptor = "I")
    public int field592;

    @OriginalMember(owner = "ib", name = "E", descriptor = "I")
    public int field593;

    @OriginalMember(owner = "ib", name = "B", descriptor = "I")
    public int field590;

    @OriginalMember(owner = "ib", name = "C", descriptor = "I")
    public int field591;

    @OriginalMember(owner = "ib", name = "z", descriptor = "[B")
    public byte[] field588;

    @OriginalMember(owner = "ib", name = "<init>", descriptor = "(Lub;Ljava/lang/String;I)V")
    public Pix8(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(363, arg0.read(arg1 + ".dat", null, (byte) 2));
        Packet var5 = new Packet(363, arg0.read("index.dat", null, (byte) 2));
        var5.field622 = var4.method218();
        this.field594 = var5.method218();
        this.field595 = var5.method218();
        int var6 = var5.method216();
        this.field589 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field589[var7 + 1] = var5.method220();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field622 += 2;
            var4.field622 += var5.method218() * var5.method218();
            var5.field622++;
        }
        this.field592 = var5.method216();
        this.field593 = var5.method216();
        this.field590 = var5.method218();
        this.field591 = var5.method218();
        int var9 = var5.method216();
        int var10 = this.field591 * this.field590;
        this.field588 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field588[var11] = var4.method217();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field590; var12++) {
                for (int var13 = 0; var13 < this.field591; var13++) {
                    this.field588[this.field590 * var13 + var12] = var4.method217();
                }
            }
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(Z)V")
    public void method184(boolean arg0) {
        this.field594 /= 2;
        this.field595 /= 2;
        byte[] var2 = new byte[this.field595 * this.field594];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field591; var4++) {
            for (int var5 = 0; var5 < this.field590; var5++) {
                var2[(this.field592 + var5 >> 1) + (this.field593 + var4 >> 1) * this.field594] = this.field588[var3++];
            }
        }
        if (arg0) {
            this.field585 = 197;
        }
        this.field588 = var2;
        this.field590 = this.field594;
        this.field591 = this.field595;
        this.field592 = 0;
        this.field593 = 0;
    }

    @OriginalMember(owner = "ib", name = "c", descriptor = "(I)V")
    public void method185(int arg0) {
        if (this.field594 == this.field590 && this.field595 == this.field591) {
            return;
        }
        byte[] var2 = new byte[this.field595 * this.field594];
        int var3 = 0;
        if (arg0 != 0) {
            this.field584 = !this.field584;
        }
        for (int var4 = 0; var4 < this.field591; var4++) {
            for (int var5 = 0; var5 < this.field590; var5++) {
                var2[(this.field593 + var4) * this.field594 + this.field592 + var5] = this.field588[var3++];
            }
        }
        this.field588 = var2;
        this.field590 = this.field594;
        this.field591 = this.field595;
        this.field592 = 0;
        this.field593 = 0;
    }

    @OriginalMember(owner = "ib", name = "d", descriptor = "(I)V")
    public void method186(int arg0) {
        byte[] var2 = new byte[this.field591 * this.field590];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field591; var4++) {
            for (int var5 = this.field590 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field588[this.field590 * var4 + var5];
            }
        }
        this.field588 = var2;
        this.field592 = this.field594 - this.field590 - this.field592;
        if (arg0 >= 0) {
            ;
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(B)V")
    public void method187(byte arg0) {
        byte[] var2 = new byte[this.field591 * this.field590];
        if (arg0 != -74) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = 0;
        for (int var5 = this.field591 - 1; var5 >= 0; var5--) {
            for (int var6 = 0; var6 < this.field590; var6++) {
                var2[var4++] = this.field588[this.field590 * var5 + var6];
            }
        }
        this.field588 = var2;
        this.field593 = this.field595 - this.field591 - this.field593;
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIIZ)V")
    public void method188(int arg0, int arg1, int arg2, boolean arg3) {
        for (int var5 = 0; var5 < this.field589.length; var5++) {
            int var7 = this.field589[var5] >> 16 & 0xFF;
            int var8 = arg0 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field589[var5] >> 8 & 0xFF;
            int var10 = arg1 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            int var11 = this.field589[var5] & 0xFF;
            int var12 = arg2 + var11;
            if (var12 < 0) {
                var12 = 0;
            } else if (var12 > 255) {
                var12 = 255;
            }
            this.field589[var5] = (var8 << 16) + (var10 << 8) + var12;
        }
        if (!arg3) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIZ)V")
    public void method189(int arg0, int arg1, boolean arg2) {
        int var4 = this.field592 + arg1;
        int var5 = this.field593 + arg0;
        int var6 = Pix2D.field534 * var5 + var4;
        int var7 = 0;
        int var8 = this.field591;
        int var9 = this.field590;
        int var10 = Pix2D.field534 - var9;
        int var11 = 0;
        if (var5 < Pix2D.field536) {
            int var12 = Pix2D.field536 - var5;
            var8 -= var12;
            var5 = Pix2D.field536;
            var7 += var9 * var12;
            var6 += Pix2D.field534 * var12;
        }
        if (var5 + var8 > Pix2D.field537) {
            var8 -= var5 + var8 - Pix2D.field537;
        }
        if (var4 < Pix2D.field538) {
            int var13 = Pix2D.field538 - var4;
            var9 -= var13;
            var4 = Pix2D.field538;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field539) {
            int var14 = var4 + var9 - Pix2D.field539;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method190(Pix2D.field533, var7, var11, this.field588, var8, 0, var9, var6, var10, this.field589);
            if (!arg2) {
                ;
            }
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "([III[BIIIII[I)V")
    private void method190(int[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9) {
        int var11 = -(arg6 >> 2);
        int var12 = -(arg6 & 0x3);
        if (arg5 != 0) {
            return;
        }
        for (int var13 = -arg4; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg3[arg1++];
                if (var17 == 0) {
                    arg7++;
                } else {
                    arg0[arg7++] = arg9[var17 & 0xFF];
                }
                byte var18 = arg3[arg1++];
                if (var18 == 0) {
                    arg7++;
                } else {
                    arg0[arg7++] = arg9[var18 & 0xFF];
                }
                byte var19 = arg3[arg1++];
                if (var19 == 0) {
                    arg7++;
                } else {
                    arg0[arg7++] = arg9[var19 & 0xFF];
                }
                byte var20 = arg3[arg1++];
                if (var20 == 0) {
                    arg7++;
                } else {
                    arg0[arg7++] = arg9[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg3[arg1++];
                if (var16 == 0) {
                    arg7++;
                } else {
                    arg0[arg7++] = arg9[var16 & 0xFF];
                }
            }
            arg7 += arg8;
            arg1 += arg2;
        }
    }
}
