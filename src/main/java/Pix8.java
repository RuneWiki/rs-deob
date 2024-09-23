import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ib")
public class Pix8 extends Pix2D {

    @OriginalMember(owner = "ib", name = "v", descriptor = "Z")
    private boolean field572 = false;

    @OriginalMember(owner = "ib", name = "w", descriptor = "Z")
    private boolean field573 = false;

    @OriginalMember(owner = "ib", name = "x", descriptor = "I")
    private int field574 = 129;

    @OriginalMember(owner = "ib", name = "y", descriptor = "I")
    private int field575 = -25737;

    @OriginalMember(owner = "ib", name = "z", descriptor = "Z")
    private boolean field576 = false;

    @OriginalMember(owner = "ib", name = "G", descriptor = "I")
    public int field583;

    @OriginalMember(owner = "ib", name = "H", descriptor = "I")
    public int field584;

    @OriginalMember(owner = "ib", name = "B", descriptor = "[I")
    public int[] field578;

    @OriginalMember(owner = "ib", name = "E", descriptor = "I")
    public int field581;

    @OriginalMember(owner = "ib", name = "F", descriptor = "I")
    public int field582;

    @OriginalMember(owner = "ib", name = "C", descriptor = "I")
    public int field579;

    @OriginalMember(owner = "ib", name = "D", descriptor = "I")
    public int field580;

    @OriginalMember(owner = "ib", name = "A", descriptor = "[B")
    public byte[] field577;

    @OriginalMember(owner = "ib", name = "<init>", descriptor = "(Lub;Ljava/lang/String;I)V")
    public Pix8(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(arg0.method242((byte) 6, null, arg1 + ".dat"), 4);
        Packet var5 = new Packet(arg0.method242((byte) 6, null, "index.dat"), 4);
        var5.field606 = var4.method203();
        this.field583 = var5.method203();
        this.field584 = var5.method203();
        int var6 = var5.method201();
        this.field578 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field578[var7 + 1] = var5.method205();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field606 += 2;
            var4.field606 += var5.method203() * var5.method203();
            var5.field606++;
        }
        this.field581 = var5.method201();
        this.field582 = var5.method201();
        this.field579 = var5.method203();
        this.field580 = var5.method203();
        int var9 = var5.method201();
        int var10 = this.field580 * this.field579;
        this.field577 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field577[var11] = var4.method202();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field579; var12++) {
                for (int var13 = 0; var13 < this.field580; var13++) {
                    this.field577[this.field579 * var13 + var12] = var4.method202();
                }
            }
        }
    }

    @OriginalMember(owner = "ib", name = "c", descriptor = "(I)V")
    public void method176(int arg0) {
        this.field583 /= 2;
        this.field584 /= 2;
        byte[] var2 = new byte[this.field584 * this.field583];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field580; var4++) {
            for (int var6 = 0; var6 < this.field579; var6++) {
                var2[(this.field581 + var6 >> 1) + (this.field582 + var4 >> 1) * this.field583] = this.field577[var3++];
            }
        }
        this.field577 = var2;
        this.field579 = this.field583;
        this.field580 = this.field584;
        this.field581 = 0;
        int var5 = 43 / arg0;
        this.field582 = 0;
    }

    @OriginalMember(owner = "ib", name = "d", descriptor = "(I)V")
    public void method177(int arg0) {
        if (this.field583 == this.field579 && this.field584 == this.field580) {
            return;
        }
        byte[] var2 = new byte[this.field584 * this.field583];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field580; var4++) {
            for (int var5 = 0; var5 < this.field579; var5++) {
                var2[(this.field582 + var4) * this.field583 + this.field581 + var5] = this.field577[var3++];
            }
        }
        this.field577 = var2;
        this.field579 = this.field583;
        this.field580 = this.field584;
        while (arg0 >= 0) {
            this.field572 = !this.field572;
        }
        this.field581 = 0;
        this.field582 = 0;
    }

    @OriginalMember(owner = "ib", name = "e", descriptor = "(I)V")
    public void method178(int arg0) {
        byte[] var2 = new byte[this.field580 * this.field579];
        int var3 = 0;
        if (this.field575 != arg0) {
            this.field572 = !this.field572;
        }
        for (int var4 = 0; var4 < this.field580; var4++) {
            for (int var5 = this.field579 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field577[this.field579 * var4 + var5];
            }
        }
        this.field577 = var2;
        this.field581 = this.field583 - this.field579 - this.field581;
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(Z)V")
    public void method179(boolean arg0) {
        byte[] var2 = new byte[this.field580 * this.field579];
        int var3 = 0;
        for (int var4 = this.field580 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field579; var5++) {
                var2[var3++] = this.field577[this.field579 * var4 + var5];
            }
        }
        this.field577 = var2;
        this.field582 = this.field584 - this.field580 - this.field582;
        if (arg0) {
            this.field576 = !this.field576;
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(III)V")
    public void method180(int arg0, int arg1, int arg2) {
        int var4 = this.field581 + arg2;
        int var5 = this.field582 + arg0;
        int var6 = Pix2D.field523 * var5 + var4;
        int var7 = 0;
        int var8 = this.field580;
        int var9 = this.field579;
        int var10 = Pix2D.field523 - var9;
        int var11 = 0;
        if (var5 < Pix2D.field525) {
            int var12 = Pix2D.field525 - var5;
            var8 -= var12;
            var5 = Pix2D.field525;
            var7 += var9 * var12;
            var6 += Pix2D.field523 * var12;
        }
        if (var5 + var8 > Pix2D.field526) {
            var8 -= var5 + var8 - Pix2D.field526;
        }
        if (var4 < Pix2D.field527) {
            int var13 = Pix2D.field527 - var4;
            var9 -= var13;
            var4 = Pix2D.field527;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field528) {
            int var14 = var4 + var9 - Pix2D.field528;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method181(var8, var7, var11, Pix2D.field522, this.field578, this.field577, (byte) 0, var10, var6, var9);
            int var15 = 3 / arg1;
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(III[I[I[BBIII)V")
    private void method181(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, byte[] arg5, byte arg6, int arg7, int arg8, int arg9) {
        if (arg6 == 0) {
            boolean var11 = false;
        } else {
            this.field572 = !this.field572;
        }
        int var12 = -(arg9 >> 2);
        int var13 = -(arg9 & 0x3);
        for (int var14 = -arg0; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                byte var18 = arg5[arg1++];
                if (var18 == 0) {
                    arg8++;
                } else {
                    arg3[arg8++] = arg4[var18 & 0xFF];
                }
                byte var19 = arg5[arg1++];
                if (var19 == 0) {
                    arg8++;
                } else {
                    arg3[arg8++] = arg4[var19 & 0xFF];
                }
                byte var20 = arg5[arg1++];
                if (var20 == 0) {
                    arg8++;
                } else {
                    arg3[arg8++] = arg4[var20 & 0xFF];
                }
                byte var21 = arg5[arg1++];
                if (var21 == 0) {
                    arg8++;
                } else {
                    arg3[arg8++] = arg4[var21 & 0xFF];
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                byte var17 = arg5[arg1++];
                if (var17 == 0) {
                    arg8++;
                } else {
                    arg3[arg8++] = arg4[var17 & 0xFF];
                }
            }
            arg8 += arg7;
            arg1 += arg2;
        }
    }
}
