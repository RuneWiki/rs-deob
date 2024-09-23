import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ib")
public class Pix8 extends Pix2D {

    @OriginalMember(owner = "ib", name = "x", descriptor = "Z")
    private boolean field588 = false;

    @OriginalMember(owner = "ib", name = "y", descriptor = "Z")
    private boolean field589 = true;

    @OriginalMember(owner = "ib", name = "z", descriptor = "I")
    private int field590 = -638;

    @OriginalMember(owner = "ib", name = "G", descriptor = "I")
    public int field597;

    @OriginalMember(owner = "ib", name = "H", descriptor = "I")
    public int field598;

    @OriginalMember(owner = "ib", name = "B", descriptor = "[I")
    public int[] field592;

    @OriginalMember(owner = "ib", name = "E", descriptor = "I")
    public int field595;

    @OriginalMember(owner = "ib", name = "F", descriptor = "I")
    public int field596;

    @OriginalMember(owner = "ib", name = "C", descriptor = "I")
    public int field593;

    @OriginalMember(owner = "ib", name = "D", descriptor = "I")
    public int field594;

    @OriginalMember(owner = "ib", name = "A", descriptor = "[B")
    public byte[] field591;

    @OriginalMember(owner = "ib", name = "w", descriptor = "B")
    private static byte field587 = 4;

    @OriginalMember(owner = "ib", name = "<init>", descriptor = "(Lub;Ljava/lang/String;I)V")
    public Pix8(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(arg0.method250(field587, arg1 + ".dat", null), 0);
        Packet var5 = new Packet(arg0.method250(field587, "index.dat", null), 0);
        var5.field623 = var4.method211();
        this.field597 = var5.method211();
        this.field598 = var5.method211();
        int var6 = var5.method209();
        this.field592 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field592[var7 + 1] = var5.method213();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field623 += 2;
            var4.field623 += var5.method211() * var5.method211();
            var5.field623++;
        }
        this.field595 = var5.method209();
        this.field596 = var5.method209();
        this.field593 = var5.method211();
        this.field594 = var5.method211();
        int var9 = var5.method209();
        int var10 = this.field594 * this.field593;
        this.field591 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field591[var11] = var4.method210();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field593; var12++) {
                for (int var13 = 0; var13 < this.field594; var13++) {
                    this.field591[this.field593 * var13 + var12] = var4.method210();
                }
            }
        }
    }

    @OriginalMember(owner = "ib", name = "b", descriptor = "(Z)V")
    public void method182(boolean arg0) {
        this.field597 /= 2;
        this.field598 /= 2;
        byte[] var2 = new byte[this.field598 * this.field597];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field594; var4++) {
            for (int var5 = 0; var5 < this.field593; var5++) {
                var2[(this.field595 + var5 >> 1) + (this.field596 + var4 >> 1) * this.field597] = this.field591[var3++];
            }
        }
        this.field591 = var2;
        this.field593 = this.field597;
        this.field594 = this.field598;
        if (arg0) {
            this.field588 = !this.field588;
        }
        this.field595 = 0;
        this.field596 = 0;
    }

    @OriginalMember(owner = "ib", name = "c", descriptor = "(Z)V")
    public void method183(boolean arg0) {
        if (this.field597 == this.field593 && this.field598 == this.field594) {
            return;
        }
        byte[] var2 = new byte[this.field598 * this.field597];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field594; var4++) {
            for (int var5 = 0; var5 < this.field593; var5++) {
                var2[(this.field596 + var4) * this.field597 + this.field595 + var5] = this.field591[var3++];
            }
        }
        this.field591 = var2;
        this.field593 = this.field597;
        this.field594 = this.field598;
        if (!arg0) {
            this.field588 = !this.field588;
        }
        this.field595 = 0;
        this.field596 = 0;
    }

    @OriginalMember(owner = "ib", name = "d", descriptor = "(Z)V")
    public void method184(boolean arg0) {
        byte[] var2 = new byte[this.field594 * this.field593];
        int var3 = 0;
        if (!arg0) {
            return;
        }
        for (int var4 = 0; var4 < this.field594; var4++) {
            for (int var5 = this.field593 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field591[this.field593 * var4 + var5];
            }
        }
        this.field591 = var2;
        this.field595 = this.field597 - this.field593 - this.field595;
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(I)V")
    public void method185(int arg0) {
        byte[] var2 = new byte[this.field594 * this.field593];
        int var3 = 0;
        for (int var4 = this.field594 - 1; var4 >= 0; var4--) {
            for (int var6 = 0; var6 < this.field593; var6++) {
                var2[var3++] = this.field591[this.field593 * var4 + var6];
            }
        }
        this.field591 = var2;
        while (arg0 >= 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.field596 = this.field598 - this.field594 - this.field596;
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IZI)V")
    public void method186(int arg0, boolean arg1, int arg2) {
        int var4 = this.field595 + arg2;
        if (!arg1) {
            this.field588 = !this.field588;
        }
        int var5 = this.field596 + arg0;
        int var6 = Pix2D.field540 * var5 + var4;
        int var7 = 0;
        int var8 = this.field594;
        int var9 = this.field593;
        int var10 = Pix2D.field540 - var9;
        int var11 = 0;
        if (var5 < Pix2D.field542) {
            int var12 = Pix2D.field542 - var5;
            var8 -= var12;
            var5 = Pix2D.field542;
            var7 += var9 * var12;
            var6 += Pix2D.field540 * var12;
        }
        if (var5 + var8 > Pix2D.field543) {
            var8 -= var5 + var8 - Pix2D.field543;
        }
        if (var4 < Pix2D.field544) {
            int var13 = Pix2D.field544 - var4;
            var9 -= var13;
            var4 = Pix2D.field544;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field545) {
            int var14 = var4 + var9 - Pix2D.field545;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method187(var7, this.field591, var8, var11, var6, this.field592, 13667, Pix2D.field539, var10, var9);
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(I[BIII[II[III)V")
    private void method187(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int[] arg7, int arg8, int arg9) {
        int var11 = -(arg9 >> 2);
        if (arg6 != 13667) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        int var13 = -(arg9 & 0x3);
        for (int var14 = -arg2; var14 < 0; var14++) {
            for (int var15 = var11; var15 < 0; var15++) {
                byte var18 = arg1[arg0++];
                if (var18 == 0) {
                    arg4++;
                } else {
                    arg7[arg4++] = arg5[var18 & 0xFF];
                }
                byte var19 = arg1[arg0++];
                if (var19 == 0) {
                    arg4++;
                } else {
                    arg7[arg4++] = arg5[var19 & 0xFF];
                }
                byte var20 = arg1[arg0++];
                if (var20 == 0) {
                    arg4++;
                } else {
                    arg7[arg4++] = arg5[var20 & 0xFF];
                }
                byte var21 = arg1[arg0++];
                if (var21 == 0) {
                    arg4++;
                } else {
                    arg7[arg4++] = arg5[var21 & 0xFF];
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                byte var17 = arg1[arg0++];
                if (var17 == 0) {
                    arg4++;
                } else {
                    arg7[arg4++] = arg5[var17 & 0xFF];
                }
            }
            arg4 += arg8;
            arg0 += arg3;
        }
    }
}
