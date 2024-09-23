import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("hb")
public class Pix8 extends Pix2D {

    @OriginalMember(owner = "hb", name = "v", descriptor = "Z")
    private boolean field555 = false;

    @OriginalMember(owner = "hb", name = "w", descriptor = "Z")
    private boolean field556 = false;

    @OriginalMember(owner = "hb", name = "D", descriptor = "I")
    public int field563;

    @OriginalMember(owner = "hb", name = "E", descriptor = "I")
    public int field564;

    @OriginalMember(owner = "hb", name = "y", descriptor = "[I")
    public int[] field558;

    @OriginalMember(owner = "hb", name = "B", descriptor = "I")
    public int field561;

    @OriginalMember(owner = "hb", name = "C", descriptor = "I")
    public int field562;

    @OriginalMember(owner = "hb", name = "z", descriptor = "I")
    public int field559;

    @OriginalMember(owner = "hb", name = "A", descriptor = "I")
    public int field560;

    @OriginalMember(owner = "hb", name = "x", descriptor = "[B")
    public byte[] field557;

    @OriginalMember(owner = "hb", name = "u", descriptor = "I")
    private int field554;

    @OriginalMember(owner = "hb", name = "<init>", descriptor = "(ILtb;Ljava/lang/String;I)V")
    public Pix8(int arg0, Jagfile arg1, String arg2, int arg3) {
        Packet var5 = new Packet(arg1.method225(0, null, arg2 + ".dat"), (byte) 63);
        Packet var6 = new Packet(arg1.method225(0, null, "index.dat"), (byte) 63);
        var6.field586 = var5.method187();
        this.field563 = var6.method187();
        this.field564 = var6.method187();
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        int var7 = var6.method185();
        this.field558 = new int[var7];
        for (int var8 = 0; var8 < var7 - 1; var8++) {
            this.field558[var8 + 1] = var6.method189();
        }
        for (int var9 = 0; var9 < arg3; var9++) {
            var6.field586 += 2;
            var5.field586 += var6.method187() * var6.method187();
            var6.field586++;
        }
        this.field561 = var6.method185();
        this.field562 = var6.method185();
        this.field559 = var6.method187();
        this.field560 = var6.method187();
        int var10 = var6.method185();
        int var11 = this.field560 * this.field559;
        this.field557 = new byte[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field557[var12] = var5.method186();
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field559; var13++) {
                for (int var14 = 0; var14 < this.field560; var14++) {
                    this.field557[this.field559 * var14 + var13] = var5.method186();
                }
            }
        }
    }

    @OriginalMember(owner = "hb", name = "b", descriptor = "(I)V")
    public void method162(int arg0) {
        this.field563 /= 2;
        this.field564 /= 2;
        byte[] var2 = new byte[this.field564 * this.field563];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field560; var4++) {
            for (int var5 = 0; var5 < this.field559; var5++) {
                var2[(this.field561 + var5 >> 1) + (this.field562 + var4 >> 1) * this.field563] = this.field557[var3++];
            }
        }
        this.field557 = var2;
        this.field559 = this.field563;
        if (arg0 == 45133) {
            this.field560 = this.field564;
            this.field561 = 0;
            this.field562 = 0;
        }
    }

    @OriginalMember(owner = "hb", name = "c", descriptor = "(I)V")
    public void method163(int arg0) {
        if (arg0 != -42137) {
            this.field554 = 182;
        }
        if (this.field563 == this.field559 && this.field564 == this.field560) {
            return;
        }
        byte[] var2 = new byte[this.field564 * this.field563];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field560; var4++) {
            for (int var5 = 0; var5 < this.field559; var5++) {
                var2[(this.field562 + var4) * this.field563 + this.field561 + var5] = this.field557[var3++];
            }
        }
        this.field557 = var2;
        this.field559 = this.field563;
        this.field560 = this.field564;
        this.field561 = 0;
        this.field562 = 0;
    }

    @OriginalMember(owner = "hb", name = "d", descriptor = "(I)V")
    public void method164(int arg0) {
        byte[] var2 = new byte[this.field560 * this.field559];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field560; var4++) {
            for (int var5 = this.field559 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field557[this.field559 * var4 + var5];
            }
        }
        this.field557 = var2;
        if (arg0 < 5 || arg0 > 5) {
            this.field554 = -96;
        }
        this.field561 = this.field563 - this.field559 - this.field561;
    }

    @OriginalMember(owner = "hb", name = "e", descriptor = "(I)V")
    public void method165(int arg0) {
        byte[] var2 = new byte[this.field560 * this.field559];
        int var3 = 0;
        for (int var4 = this.field560 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field559; var5++) {
                var2[var3++] = this.field557[this.field559 * var4 + var5];
            }
        }
        if (arg0 <= 0) {
            this.field556 = !this.field556;
        }
        this.field557 = var2;
        this.field562 = this.field564 - this.field560 - this.field562;
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IZI)V")
    public void method166(int arg0, boolean arg1, int arg2) {
        int var4 = this.field561 + arg0;
        if (!arg1) {
            this.field554 = -150;
        }
        int var5 = this.field562 + arg2;
        int var6 = Pix2D.field507 * var5 + var4;
        int var7 = 0;
        int var8 = this.field560;
        int var9 = this.field559;
        int var10 = Pix2D.field507 - var9;
        int var11 = 0;
        if (var5 < Pix2D.field509) {
            int var12 = Pix2D.field509 - var5;
            var8 -= var12;
            var5 = Pix2D.field509;
            var7 += var9 * var12;
            var6 += Pix2D.field507 * var12;
        }
        if (var5 + var8 > Pix2D.field510) {
            var8 -= var5 + var8 - Pix2D.field510;
        }
        if (var4 < Pix2D.field511) {
            int var13 = Pix2D.field511 - var4;
            var9 -= var13;
            var4 = Pix2D.field511;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field512) {
            int var14 = var4 + var9 - Pix2D.field512;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method167(var8, this.field557, this.field558, var9, var6, var7, Pix2D.field506, 92, var10, var11);
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(I[B[IIII[IIII)V")
    private void method167(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9) {
        int var11 = -(arg3 >> 2);
        int var12 = -(arg3 & 0x3);
        for (int var13 = -arg0; var13 < 0; var13++) {
            for (int var15 = var11; var15 < 0; var15++) {
                byte var18 = arg1[arg5++];
                if (var18 == 0) {
                    arg4++;
                } else {
                    arg6[arg4++] = arg2[var18 & 0xFF];
                }
                byte var19 = arg1[arg5++];
                if (var19 == 0) {
                    arg4++;
                } else {
                    arg6[arg4++] = arg2[var19 & 0xFF];
                }
                byte var20 = arg1[arg5++];
                if (var20 == 0) {
                    arg4++;
                } else {
                    arg6[arg4++] = arg2[var20 & 0xFF];
                }
                byte var21 = arg1[arg5++];
                if (var21 == 0) {
                    arg4++;
                } else {
                    arg6[arg4++] = arg2[var21 & 0xFF];
                }
            }
            for (int var16 = var12; var16 < 0; var16++) {
                byte var17 = arg1[arg5++];
                if (var17 == 0) {
                    arg4++;
                } else {
                    arg6[arg4++] = arg2[var17 & 0xFF];
                }
            }
            arg4 += arg8;
            arg5 += arg9;
        }
        int var14 = 70 / arg7;
    }
}
