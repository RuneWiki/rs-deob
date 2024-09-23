import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kb")
public class Pix8 extends Pix2D {

    @OriginalMember(owner = "kb", name = "w", descriptor = "Z")
    private boolean field695 = false;

    @OriginalMember(owner = "kb", name = "x", descriptor = "Z")
    private boolean field696 = true;

    @OriginalMember(owner = "kb", name = "y", descriptor = "I")
    private int field697 = -43533;

    @OriginalMember(owner = "kb", name = "z", descriptor = "Z")
    private boolean field698 = false;

    @OriginalMember(owner = "kb", name = "A", descriptor = "I")
    private int field699 = -16521;

    @OriginalMember(owner = "kb", name = "H", descriptor = "I")
    public int field706;

    @OriginalMember(owner = "kb", name = "I", descriptor = "I")
    public int field707;

    @OriginalMember(owner = "kb", name = "C", descriptor = "[I")
    public int[] field701;

    @OriginalMember(owner = "kb", name = "F", descriptor = "I")
    public int field704;

    @OriginalMember(owner = "kb", name = "G", descriptor = "I")
    public int field705;

    @OriginalMember(owner = "kb", name = "D", descriptor = "I")
    public int field702;

    @OriginalMember(owner = "kb", name = "E", descriptor = "I")
    public int field703;

    @OriginalMember(owner = "kb", name = "B", descriptor = "[B")
    public byte[] field700;

    @OriginalMember(owner = "kb", name = "<init>", descriptor = "(Lyb;Ljava/lang/String;I)V")
    public Pix8(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(45427, arg0.method309(arg1 + ".dat", null));
        Packet var5 = new Packet(45427, arg0.method309("index.dat", null));
        var5.field736 = var4.method241();
        this.field706 = var5.method241();
        this.field707 = var5.method241();
        int var6 = var5.method239();
        this.field701 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field701[var7 + 1] = var5.method243();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field736 += 2;
            var4.field736 += var5.method241() * var5.method241();
            var5.field736++;
        }
        this.field704 = var5.method239();
        this.field705 = var5.method239();
        this.field702 = var5.method241();
        this.field703 = var5.method241();
        int var9 = var5.method239();
        int var10 = this.field703 * this.field702;
        this.field700 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field700[var11] = var4.method240();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field702; var12++) {
                for (int var13 = 0; var13 < this.field703; var13++) {
                    this.field700[this.field702 * var13 + var12] = var4.method240();
                }
            }
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(B)V")
    public void method207(byte arg0) {
        this.field706 /= 2;
        this.field707 /= 2;
        byte[] var2 = new byte[this.field707 * this.field706];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field703; var4++) {
            for (int var5 = 0; var5 < this.field702; var5++) {
                var2[(this.field704 + var5 >> 1) + (this.field705 + var4 >> 1) * this.field706] = this.field700[var3++];
            }
        }
        this.field700 = var2;
        this.field702 = this.field706;
        if (arg0 == 8) {
            this.field703 = this.field707;
            this.field704 = 0;
            this.field705 = 0;
        }
    }

    @OriginalMember(owner = "kb", name = "c", descriptor = "(I)V")
    public void method208(int arg0) {
        if (this.field706 == this.field702 && this.field707 == this.field703) {
            return;
        }
        byte[] var2 = new byte[this.field707 * this.field706];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field703; var4++) {
            for (int var5 = 0; var5 < this.field702; var5++) {
                var2[(this.field705 + var4) * this.field706 + this.field704 + var5] = this.field700[var3++];
            }
        }
        this.field700 = var2;
        this.field702 = this.field706;
        this.field703 = this.field707;
        this.field704 = 0;
        if (arg0 != 31507) {
            this.field695 = !this.field695;
        }
        this.field705 = 0;
    }

    @OriginalMember(owner = "kb", name = "d", descriptor = "(I)V")
    public void method209(int arg0) {
        byte[] var2 = new byte[this.field703 * this.field702];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field703; var4++) {
            for (int var6 = this.field702 - 1; var6 >= 0; var6--) {
                var2[var3++] = this.field700[this.field702 * var4 + var6];
            }
        }
        this.field700 = var2;
        this.field704 = this.field706 - this.field702 - this.field704;
        int var5 = 53 / arg0;
    }

    @OriginalMember(owner = "kb", name = "b", descriptor = "(B)V")
    public void method210(byte arg0) {
        byte[] var2 = new byte[this.field703 * this.field702];
        if (arg0 != 6) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = 0;
        for (int var5 = this.field703 - 1; var5 >= 0; var5--) {
            for (int var6 = 0; var6 < this.field702; var6++) {
                var2[var4++] = this.field700[this.field702 * var5 + var6];
            }
        }
        this.field700 = var2;
        this.field705 = this.field707 - this.field703 - this.field705;
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(IIII)V")
    public void method211(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            return;
        }
        for (int var5 = 0; var5 < this.field701.length; var5++) {
            int var6 = this.field701[var5] >> 16 & 0xFF;
            int var7 = arg3 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field701[var5] >> 8 & 0xFF;
            int var9 = arg0 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field701[var5] & 0xFF;
            int var11 = arg1 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field701[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "(III)V")
    public void method212(int arg0, int arg1, int arg2) {
        int var4 = this.field704 + arg2;
        int var5 = this.field705 + arg0;
        int var6 = Pix2D.field645 * var5 + var4;
        int var7 = 0;
        int var8 = this.field703;
        int var9 = this.field702;
        int var10 = Pix2D.field645 - var9;
        int var11 = 0;
        if (this.field697 != arg1) {
            this.field696 = !this.field696;
        }
        if (var5 < Pix2D.field647) {
            int var12 = Pix2D.field647 - var5;
            var8 -= var12;
            var5 = Pix2D.field647;
            var7 += var9 * var12;
            var6 += Pix2D.field645 * var12;
        }
        if (var5 + var8 > Pix2D.field648) {
            var8 -= var5 + var8 - Pix2D.field648;
        }
        if (var4 < Pix2D.field649) {
            int var13 = Pix2D.field649 - var4;
            var9 -= var13;
            var4 = Pix2D.field649;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field650) {
            int var14 = var4 + var9 - Pix2D.field650;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method213(Pix2D.field644, var9, var7, var8, this.field700, false, var10, var11, this.field701, var6);
        }
    }

    @OriginalMember(owner = "kb", name = "a", descriptor = "([IIII[BZII[II)V")
    private void method213(int[] arg0, int arg1, int arg2, int arg3, byte[] arg4, boolean arg5, int arg6, int arg7, int[] arg8, int arg9) {
        if (arg5) {
            this.field696 = !this.field696;
        }
        int var11 = -(arg1 >> 2);
        int var12 = -(arg1 & 0x3);
        for (int var13 = -arg3; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg4[arg2++];
                if (var17 == 0) {
                    arg9++;
                } else {
                    arg0[arg9++] = arg8[var17 & 0xFF];
                }
                byte var18 = arg4[arg2++];
                if (var18 == 0) {
                    arg9++;
                } else {
                    arg0[arg9++] = arg8[var18 & 0xFF];
                }
                byte var19 = arg4[arg2++];
                if (var19 == 0) {
                    arg9++;
                } else {
                    arg0[arg9++] = arg8[var19 & 0xFF];
                }
                byte var20 = arg4[arg2++];
                if (var20 == 0) {
                    arg9++;
                } else {
                    arg0[arg9++] = arg8[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg4[arg2++];
                if (var16 == 0) {
                    arg9++;
                } else {
                    arg0[arg9++] = arg8[var16 & 0xFF];
                }
            }
            arg9 += arg6;
            arg2 += arg7;
        }
    }
}
