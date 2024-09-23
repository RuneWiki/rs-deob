import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ib")
public class Pix8 extends Pix2D {

    @OriginalMember(owner = "ib", name = "x", descriptor = "Z")
    private boolean field594 = true;

    @OriginalMember(owner = "ib", name = "y", descriptor = "I")
    private int field595 = 19303;

    @OriginalMember(owner = "ib", name = "z", descriptor = "I")
    private int field596 = -638;

    @OriginalMember(owner = "ib", name = "G", descriptor = "I")
    public int field603;

    @OriginalMember(owner = "ib", name = "H", descriptor = "I")
    public int field604;

    @OriginalMember(owner = "ib", name = "B", descriptor = "[I")
    public int[] field598;

    @OriginalMember(owner = "ib", name = "E", descriptor = "I")
    public int field601;

    @OriginalMember(owner = "ib", name = "F", descriptor = "I")
    public int field602;

    @OriginalMember(owner = "ib", name = "C", descriptor = "I")
    public int field599;

    @OriginalMember(owner = "ib", name = "D", descriptor = "I")
    public int field600;

    @OriginalMember(owner = "ib", name = "A", descriptor = "[B")
    public byte[] field597;

    @OriginalMember(owner = "ib", name = "<init>", descriptor = "(Lub;Ljava/lang/String;I)V")
    public Pix8(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet((byte) 64, arg0.method257(null, arg1 + ".dat", -31149));
        Packet var5 = new Packet((byte) 64, arg0.method257(null, "index.dat", -31149));
        var5.field624 = var4.method218();
        this.field603 = var5.method218();
        this.field604 = var5.method218();
        int var6 = var5.method216();
        this.field598 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field598[var7 + 1] = var5.method220();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field624 += 2;
            var4.field624 += var5.method218() * var5.method218();
            var5.field624++;
        }
        this.field601 = var5.method216();
        this.field602 = var5.method216();
        this.field599 = var5.method218();
        this.field600 = var5.method218();
        int var9 = var5.method216();
        int var10 = this.field600 * this.field599;
        this.field597 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field597[var11] = var4.method217();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field599; var12++) {
                for (int var13 = 0; var13 < this.field600; var13++) {
                    this.field597[this.field599 * var13 + var12] = var4.method217();
                }
            }
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(Z)V")
    public void method184(boolean arg0) {
        this.field603 /= 2;
        this.field604 /= 2;
        if (!arg0) {
            this.field596 = 10;
        }
        byte[] var2 = new byte[this.field604 * this.field603];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field600; var4++) {
            for (int var5 = 0; var5 < this.field599; var5++) {
                var2[(this.field601 + var5 >> 1) + (this.field602 + var4 >> 1) * this.field603] = this.field597[var3++];
            }
        }
        this.field597 = var2;
        this.field599 = this.field603;
        this.field600 = this.field604;
        this.field601 = 0;
        this.field602 = 0;
    }

    @OriginalMember(owner = "ib", name = "c", descriptor = "(I)V")
    public void method185(int arg0) {
        if (this.field603 == this.field599 && this.field604 == this.field600) {
            return;
        }
        byte[] var2 = new byte[this.field604 * this.field603];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field600; var4++) {
            for (int var6 = 0; var6 < this.field599; var6++) {
                var2[(this.field602 + var4) * this.field603 + this.field601 + var6] = this.field597[var3++];
            }
        }
        this.field597 = var2;
        this.field599 = this.field603;
        if (arg0 != -20585) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.field600 = this.field604;
        this.field601 = 0;
        this.field602 = 0;
    }

    @OriginalMember(owner = "ib", name = "d", descriptor = "(I)V")
    public void method186(int arg0) {
        byte[] var2 = new byte[this.field600 * this.field599];
        if (arg0 != 0) {
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field600; var4++) {
            for (int var5 = this.field599 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field597[this.field599 * var4 + var5];
            }
        }
        this.field597 = var2;
        this.field601 = this.field603 - this.field599 - this.field601;
    }

    @OriginalMember(owner = "ib", name = "e", descriptor = "(I)V")
    public void method187(int arg0) {
        byte[] var2 = new byte[this.field600 * this.field599];
        int var3 = 0;
        for (int var4 = this.field600 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field599; var5++) {
                var2[var3++] = this.field597[this.field599 * var4 + var5];
            }
        }
        this.field597 = var2;
        this.field602 = this.field604 - this.field600 - this.field602;
        if (arg0 != 0) {
            this.field595 = -437;
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIII)V")
    public void method188(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field598.length; var5++) {
            int var6 = this.field598[var5] >> 16 & 0xFF;
            int var7 = arg3 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field598[var5] >> 8 & 0xFF;
            int var9 = arg1 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field598[var5] & 0xFF;
            int var11 = arg0 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field598[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
        if (arg2 < 9 || arg2 > 9) {
            ;
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(III)V")
    public void method189(int arg0, int arg1, int arg2) {
        while (arg1 >= 0) {
            for (int var15 = 1; var15 > 0; var15++) {
            }
        }
        int var4 = this.field601 + arg2;
        int var5 = this.field602 + arg0;
        int var6 = Pix2D.field545 * var5 + var4;
        int var7 = 0;
        int var8 = this.field600;
        int var9 = this.field599;
        int var10 = Pix2D.field545 - var9;
        int var11 = 0;
        if (var5 < Pix2D.field547) {
            int var12 = Pix2D.field547 - var5;
            var8 -= var12;
            var5 = Pix2D.field547;
            var7 += var9 * var12;
            var6 += Pix2D.field545 * var12;
        }
        if (var5 + var8 > Pix2D.field548) {
            var8 -= var5 + var8 - Pix2D.field548;
        }
        if (var4 < Pix2D.field549) {
            int var13 = Pix2D.field549 - var4;
            var9 -= var13;
            var4 = Pix2D.field549;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field550) {
            int var14 = var4 + var9 - Pix2D.field550;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method190(Pix2D.field544, var7, var6, var10, 0, var11, this.field597, var9, var8, this.field598);
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "([IIIIII[BII[I)V")
    private void method190(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8, int[] arg9) {
        int var11 = -(arg7 >> 2);
        int var12 = -(arg7 & 0x3);
        for (int var13 = -arg8; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg6[arg1++];
                if (var17 == 0) {
                    arg2++;
                } else {
                    arg0[arg2++] = arg9[var17 & 0xFF];
                }
                byte var18 = arg6[arg1++];
                if (var18 == 0) {
                    arg2++;
                } else {
                    arg0[arg2++] = arg9[var18 & 0xFF];
                }
                byte var19 = arg6[arg1++];
                if (var19 == 0) {
                    arg2++;
                } else {
                    arg0[arg2++] = arg9[var19 & 0xFF];
                }
                byte var20 = arg6[arg1++];
                if (var20 == 0) {
                    arg2++;
                } else {
                    arg0[arg2++] = arg9[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg6[arg1++];
                if (var16 == 0) {
                    arg2++;
                } else {
                    arg0[arg2++] = arg9[var16 & 0xFF];
                }
            }
            arg2 += arg3;
            arg1 += arg5;
        }
        if (arg4 == 0) {
            ;
        }
    }
}
