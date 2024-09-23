import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ib")
public class Pix8 extends Pix2D {

    @OriginalMember(owner = "ib", name = "v", descriptor = "Z")
    private boolean field579 = false;

    @OriginalMember(owner = "ib", name = "w", descriptor = "I")
    private int field580 = 868;

    @OriginalMember(owner = "ib", name = "x", descriptor = "I")
    private int field581 = 5;

    @OriginalMember(owner = "ib", name = "E", descriptor = "I")
    public int field588;

    @OriginalMember(owner = "ib", name = "F", descriptor = "I")
    public int field589;

    @OriginalMember(owner = "ib", name = "z", descriptor = "[I")
    public int[] field583;

    @OriginalMember(owner = "ib", name = "C", descriptor = "I")
    public int field586;

    @OriginalMember(owner = "ib", name = "D", descriptor = "I")
    public int field587;

    @OriginalMember(owner = "ib", name = "A", descriptor = "I")
    public int field584;

    @OriginalMember(owner = "ib", name = "B", descriptor = "I")
    public int field585;

    @OriginalMember(owner = "ib", name = "y", descriptor = "[B")
    public byte[] field582;

    @OriginalMember(owner = "ib", name = "<init>", descriptor = "(Lub;Ljava/lang/String;I)V")
    public Pix8(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(575, arg0.method250(null, 3, arg1 + ".dat"));
        Packet var5 = new Packet(575, arg0.method250(null, 3, "index.dat"));
        var5.field612 = var4.method211();
        this.field588 = var5.method211();
        this.field589 = var5.method211();
        int var6 = var5.method209();
        this.field583 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field583[var7 + 1] = var5.method213();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field612 += 2;
            var4.field612 += var5.method211() * var5.method211();
            var5.field612++;
        }
        this.field586 = var5.method209();
        this.field587 = var5.method209();
        this.field584 = var5.method211();
        this.field585 = var5.method211();
        int var9 = var5.method209();
        int var10 = this.field585 * this.field584;
        this.field582 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field582[var11] = var4.method210();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field584; var12++) {
                for (int var13 = 0; var13 < this.field585; var13++) {
                    this.field582[this.field584 * var13 + var12] = var4.method210();
                }
            }
        }
    }

    @OriginalMember(owner = "ib", name = "c", descriptor = "(Z)V")
    public void method182(boolean arg0) {
        this.field588 /= 2;
        this.field589 /= 2;
        if (arg0) {
            return;
        }
        byte[] var2 = new byte[this.field589 * this.field588];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field585; var4++) {
            for (int var5 = 0; var5 < this.field584; var5++) {
                var2[(this.field586 + var5 >> 1) + (this.field587 + var4 >> 1) * this.field588] = this.field582[var3++];
            }
        }
        this.field582 = var2;
        this.field584 = this.field588;
        this.field585 = this.field589;
        this.field586 = 0;
        this.field587 = 0;
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(I)V")
    public void method183(int arg0) {
        if (this.field588 == this.field584 && this.field589 == this.field585) {
            return;
        }
        byte[] var2 = new byte[this.field589 * this.field588];
        int var3 = 0;
        if (arg0 >= 0) {
            this.field580 = -35;
        }
        for (int var4 = 0; var4 < this.field585; var4++) {
            for (int var5 = 0; var5 < this.field584; var5++) {
                var2[(this.field587 + var4) * this.field588 + this.field586 + var5] = this.field582[var3++];
            }
        }
        this.field582 = var2;
        this.field584 = this.field588;
        this.field585 = this.field589;
        this.field586 = 0;
        this.field587 = 0;
    }

    @OriginalMember(owner = "ib", name = "b", descriptor = "(I)V")
    public void method184(int arg0) {
        byte[] var2 = new byte[this.field585 * this.field584];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field585; var4++) {
            for (int var6 = this.field584 - 1; var6 >= 0; var6--) {
                var2[var3++] = this.field582[this.field584 * var4 + var6];
            }
        }
        int var5 = 76 / arg0;
        this.field582 = var2;
        this.field586 = this.field588 - this.field584 - this.field586;
    }

    @OriginalMember(owner = "ib", name = "c", descriptor = "(I)V")
    public void method185(int arg0) {
        byte[] var2 = new byte[this.field585 * this.field584];
        int var3 = 0;
        for (int var4 = this.field585 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field584; var5++) {
                var2[var3++] = this.field582[this.field584 * var4 + var5];
            }
        }
        if (arg0 == 2) {
            this.field582 = var2;
            this.field587 = this.field589 - this.field585 - this.field587;
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(III)V")
    public void method186(int arg0, int arg1, int arg2) {
        int var4 = this.field586 + arg0;
        int var5 = this.field587 + arg1;
        int var6 = Pix2D.field533 * var5 + var4;
        int var7 = 0;
        int var8 = this.field585;
        int var9 = this.field584;
        int var10 = Pix2D.field533 - var9;
        int var11 = 0;
        if (arg2 >= 0) {
            return;
        }
        if (var5 < Pix2D.field535) {
            int var12 = Pix2D.field535 - var5;
            var8 -= var12;
            var5 = Pix2D.field535;
            var7 += var9 * var12;
            var6 += Pix2D.field533 * var12;
        }
        if (var5 + var8 > Pix2D.field536) {
            var8 -= var5 + var8 - Pix2D.field536;
        }
        if (var4 < Pix2D.field537) {
            int var13 = Pix2D.field537 - var4;
            var9 -= var13;
            var4 = Pix2D.field537;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field538) {
            int var14 = var4 + var9 - Pix2D.field538;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method187(this.field582, var9, this.field583, var11, var8, Pix2D.field532, var6, var10, false, var7);
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "([BI[III[IIIZI)V")
    private void method187(byte[] arg0, int arg1, int[] arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, boolean arg8, int arg9) {
        if (arg8) {
            this.field579 = !this.field579;
        }
        int var11 = -(arg1 >> 2);
        int var12 = -(arg1 & 0x3);
        for (int var13 = -arg4; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg0[arg9++];
                if (var17 == 0) {
                    arg6++;
                } else {
                    arg5[arg6++] = arg2[var17 & 0xFF];
                }
                byte var18 = arg0[arg9++];
                if (var18 == 0) {
                    arg6++;
                } else {
                    arg5[arg6++] = arg2[var18 & 0xFF];
                }
                byte var19 = arg0[arg9++];
                if (var19 == 0) {
                    arg6++;
                } else {
                    arg5[arg6++] = arg2[var19 & 0xFF];
                }
                byte var20 = arg0[arg9++];
                if (var20 == 0) {
                    arg6++;
                } else {
                    arg5[arg6++] = arg2[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg0[arg9++];
                if (var16 == 0) {
                    arg6++;
                } else {
                    arg5[arg6++] = arg2[var16 & 0xFF];
                }
            }
            arg6 += arg7;
            arg9 += arg3;
        }
    }
}
