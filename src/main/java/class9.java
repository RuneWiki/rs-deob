import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DEITBGVL")
public class class9 extends class22 {

    @OriginalMember(owner = "DEITBGVL", name = "z", descriptor = "I")
    private int field602 = 7;

    @OriginalMember(owner = "DEITBGVL", name = "A", descriptor = "I")
    private int field603 = 22736;

    @OriginalMember(owner = "DEITBGVL", name = "B", descriptor = "Z")
    private boolean field604 = true;

    @OriginalMember(owner = "DEITBGVL", name = "C", descriptor = "I")
    private int field605 = -668;

    @OriginalMember(owner = "DEITBGVL", name = "D", descriptor = "Z")
    private boolean field606 = false;

    @OriginalMember(owner = "DEITBGVL", name = "K", descriptor = "I")
    public int field613;

    @OriginalMember(owner = "DEITBGVL", name = "L", descriptor = "I")
    public int field614;

    @OriginalMember(owner = "DEITBGVL", name = "F", descriptor = "[I")
    public int[] field608;

    @OriginalMember(owner = "DEITBGVL", name = "I", descriptor = "I")
    public int field611;

    @OriginalMember(owner = "DEITBGVL", name = "J", descriptor = "I")
    public int field612;

    @OriginalMember(owner = "DEITBGVL", name = "G", descriptor = "I")
    public int field609;

    @OriginalMember(owner = "DEITBGVL", name = "H", descriptor = "I")
    public int field610;

    @OriginalMember(owner = "DEITBGVL", name = "E", descriptor = "[B")
    public byte[] field607;

    @OriginalMember(owner = "DEITBGVL", name = "<init>", descriptor = "(LQKFGLETG;Ljava/lang/String;I)V")
    public class9(class50 arg0, String arg1, int arg2) {
        class68 var4 = new class68((byte) 9, arg0.method402(arg1 + ".dat", null));
        class68 var5 = new class68((byte) 9, arg0.method402("index.dat", null));
        var5.field1643 = var4.method536();
        this.field613 = var5.method536();
        this.field614 = var5.method536();
        int var6 = var5.method534();
        this.field608 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field608[var7 + 1] = var5.method538();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field1643 += 2;
            var4.field1643 += var5.method536() * var5.method536();
            var5.field1643++;
        }
        this.field611 = var5.method534();
        this.field612 = var5.method534();
        this.field609 = var5.method536();
        this.field610 = var5.method536();
        int var9 = var5.method534();
        int var10 = this.field610 * this.field609;
        this.field607 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field607[var11] = var4.method535();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field609; var12++) {
                for (int var13 = 0; var13 < this.field610; var13++) {
                    this.field607[this.field609 * var13 + var12] = var4.method535();
                }
            }
        }
    }

    @OriginalMember(owner = "DEITBGVL", name = "c", descriptor = "(I)V")
    public void method161(int arg0) {
        this.field613 /= 2;
        this.field614 /= 2;
        if (arg0 < 3 || arg0 > 3) {
            this.field604 = !this.field604;
        }
        byte[] var2 = new byte[this.field614 * this.field613];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field610; var4++) {
            for (int var5 = 0; var5 < this.field609; var5++) {
                var2[(this.field611 + var5 >> 1) + (this.field612 + var4 >> 1) * this.field613] = this.field607[var3++];
            }
        }
        this.field607 = var2;
        this.field609 = this.field613;
        this.field610 = this.field614;
        this.field611 = 0;
        this.field612 = 0;
    }

    @OriginalMember(owner = "DEITBGVL", name = "a", descriptor = "(B)V")
    public void method162(byte arg0) {
        if (this.field613 == this.field609 && this.field614 == this.field610) {
            return;
        }
        byte[] var2 = new byte[this.field614 * this.field613];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field610; var4++) {
            for (int var5 = 0; var5 < this.field609; var5++) {
                var2[(this.field612 + var4) * this.field613 + this.field611 + var5] = this.field607[var3++];
            }
        }
        this.field607 = var2;
        this.field609 = this.field613;
        this.field610 = this.field614;
        this.field611 = 0;
        this.field612 = 0;
        if (arg0 != -125) {
            this.field604 = !this.field604;
        }
    }

    @OriginalMember(owner = "DEITBGVL", name = "d", descriptor = "(I)V")
    public void method163(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        byte[] var3 = new byte[this.field610 * this.field609];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field610; var5++) {
            for (int var6 = this.field609 - 1; var6 >= 0; var6--) {
                var3[var4++] = this.field607[this.field609 * var5 + var6];
            }
        }
        this.field607 = var3;
        this.field611 = this.field613 - this.field609 - this.field611;
    }

    @OriginalMember(owner = "DEITBGVL", name = "e", descriptor = "(I)V")
    public void method164(int arg0) {
        byte[] var2 = new byte[this.field610 * this.field609];
        int var3 = 0;
        if (arg0 >= 0) {
            return;
        }
        for (int var4 = this.field610 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field609; var5++) {
                var2[var3++] = this.field607[this.field609 * var4 + var5];
            }
        }
        this.field607 = var2;
        this.field612 = this.field614 - this.field610 - this.field612;
    }

    @OriginalMember(owner = "DEITBGVL", name = "a", descriptor = "(IBII)V")
    public void method165(int arg0, byte arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field608.length; var5++) {
            int var6 = this.field608[var5] >> 16 & 0xFF;
            int var7 = arg2 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field608[var5] >> 8 & 0xFF;
            int var9 = arg3 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field608[var5] & 0xFF;
            int var11 = arg0 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field608[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
        if (arg1 == -79) {
            ;
        }
    }

    @OriginalMember(owner = "DEITBGVL", name = "a", descriptor = "(IIB)V")
    public void method166(int arg0, int arg1, byte arg2) {
        int var4 = this.field611 + arg1;
        int var5 = this.field612 + arg0;
        int var6 = class22.field841 * var5 + var4;
        int var7 = 0;
        int var8 = this.field610;
        int var9 = this.field609;
        int var10 = class22.field841 - var9;
        int var11 = 0;
        if (arg2 != 35) {
            this.field606 = !this.field606;
        }
        if (var5 < class22.field843) {
            int var12 = class22.field843 - var5;
            var8 -= var12;
            var5 = class22.field843;
            var7 += var9 * var12;
            var6 += class22.field841 * var12;
        }
        if (var5 + var8 > class22.field844) {
            var8 -= var5 + var8 - class22.field844;
        }
        if (var4 < class22.field845) {
            int var13 = class22.field845 - var4;
            var9 -= var13;
            var4 = class22.field845;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class22.field846) {
            int var14 = var4 + var9 - class22.field846;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method167(this.field605, class22.field840, var11, var9, this.field608, var7, var6, var8, var10, this.field607);
        }
    }

    @OriginalMember(owner = "DEITBGVL", name = "a", descriptor = "(I[III[IIIII[B)V")
    private void method167(int arg0, int[] arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, byte[] arg9) {
        int var11 = -(arg3 >> 2);
        while (arg0 >= 0) {
            for (int var21 = 1; var21 > 0; var21++) {
            }
        }
        int var12 = -(arg3 & 0x3);
        for (int var13 = -arg7; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg9[arg5++];
                if (var17 == 0) {
                    arg6++;
                } else {
                    arg1[arg6++] = arg4[var17 & 0xFF];
                }
                byte var18 = arg9[arg5++];
                if (var18 == 0) {
                    arg6++;
                } else {
                    arg1[arg6++] = arg4[var18 & 0xFF];
                }
                byte var19 = arg9[arg5++];
                if (var19 == 0) {
                    arg6++;
                } else {
                    arg1[arg6++] = arg4[var19 & 0xFF];
                }
                byte var20 = arg9[arg5++];
                if (var20 == 0) {
                    arg6++;
                } else {
                    arg1[arg6++] = arg4[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg9[arg5++];
                if (var16 == 0) {
                    arg6++;
                } else {
                    arg1[arg6++] = arg4[var16 & 0xFF];
                }
            }
            arg6 += arg8;
            arg5 += arg2;
        }
    }
}
