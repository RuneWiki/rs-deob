import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("FDCAWVRL")
public class class21 extends class46 {

    @OriginalMember(owner = "FDCAWVRL", name = "z", descriptor = "Z")
    private boolean field697 = true;

    @OriginalMember(owner = "FDCAWVRL", name = "A", descriptor = "I")
    private int field698 = -3381;

    @OriginalMember(owner = "FDCAWVRL", name = "C", descriptor = "I")
    private int field700 = 47773;

    @OriginalMember(owner = "FDCAWVRL", name = "D", descriptor = "Z")
    private boolean field701 = false;

    @OriginalMember(owner = "FDCAWVRL", name = "E", descriptor = "Z")
    private boolean field702 = false;

    @OriginalMember(owner = "FDCAWVRL", name = "L", descriptor = "I")
    public int field709;

    @OriginalMember(owner = "FDCAWVRL", name = "M", descriptor = "I")
    public int field710;

    @OriginalMember(owner = "FDCAWVRL", name = "G", descriptor = "[I")
    public int[] field704;

    @OriginalMember(owner = "FDCAWVRL", name = "J", descriptor = "I")
    public int field707;

    @OriginalMember(owner = "FDCAWVRL", name = "K", descriptor = "I")
    public int field708;

    @OriginalMember(owner = "FDCAWVRL", name = "H", descriptor = "I")
    public int field705;

    @OriginalMember(owner = "FDCAWVRL", name = "I", descriptor = "I")
    public int field706;

    @OriginalMember(owner = "FDCAWVRL", name = "F", descriptor = "[B")
    public byte[] field703;

    @OriginalMember(owner = "FDCAWVRL", name = "B", descriptor = "I")
    private int field699;

    @OriginalMember(owner = "FDCAWVRL", name = "<init>", descriptor = "(LVSUYIIVA;Ljava/lang/String;I)V")
    public class21(class62 arg0, String arg1, int arg2) {
        class8 var4 = new class8(arg0.method570(arg1 + ".dat", null), 792);
        class8 var5 = new class8(arg0.method570("index.dat", null), 792);
        var5.field72 = var4.method32();
        this.field709 = var5.method32();
        this.field710 = var5.method32();
        int var6 = var5.method30();
        this.field704 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field704[var7 + 1] = var5.method34();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field72 += 2;
            var4.field72 += var5.method32() * var5.method32();
            var5.field72++;
        }
        this.field707 = var5.method30();
        this.field708 = var5.method30();
        this.field705 = var5.method32();
        this.field706 = var5.method32();
        int var9 = var5.method30();
        int var10 = this.field706 * this.field705;
        this.field703 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field703[var11] = var4.method31();
            }
        } else {
            if (var9 == 1) {
                for (int var12 = 0; var12 < this.field705; var12++) {
                    for (int var13 = 0; var13 < this.field706; var13++) {
                        this.field703[this.field705 * var13 + var12] = var4.method31();
                    }
                }
            }
            if (class67.field1668) {
            }
        }
    }

    @OriginalMember(owner = "FDCAWVRL", name = "a", descriptor = "(Z)V")
    public void method270(boolean arg0) {
        this.field709 /= 2;
        if (arg0) {
            return;
        }
        this.field710 /= 2;
        byte[] var2 = new byte[this.field710 * this.field709];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field706; var4++) {
            for (int var5 = 0; var5 < this.field705; var5++) {
                var2[(this.field707 + var5 >> 1) + (this.field708 + var4 >> 1) * this.field709] = this.field703[var3++];
            }
        }
        this.field703 = var2;
        this.field705 = this.field709;
        this.field706 = this.field710;
        this.field707 = 0;
        this.field708 = 0;
    }

    @OriginalMember(owner = "FDCAWVRL", name = "b", descriptor = "(I)V")
    public void method271(int arg0) {
        if (arg0 != 6 || this.field709 == this.field705 && this.field710 == this.field706) {
            return;
        }
        byte[] var2 = new byte[this.field710 * this.field709];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field706; var4++) {
            for (int var5 = 0; var5 < this.field705; var5++) {
                var2[(this.field708 + var4) * this.field709 + this.field707 + var5] = this.field703[var3++];
            }
        }
        this.field703 = var2;
        this.field705 = this.field709;
        this.field706 = this.field710;
        this.field707 = 0;
        this.field708 = 0;
    }

    @OriginalMember(owner = "FDCAWVRL", name = "c", descriptor = "(I)V")
    public void method272(int arg0) {
        byte[] var2 = new byte[this.field706 * this.field705];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field706; var4++) {
            for (int var5 = this.field705 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field703[this.field705 * var4 + var5];
            }
        }
        this.field703 = var2;
        this.field707 = this.field709 - this.field705 - this.field707;
        if (arg0 >= 0) {
            this.field700 = -244;
        }
    }

    @OriginalMember(owner = "FDCAWVRL", name = "d", descriptor = "(I)V")
    public void method273(int arg0) {
        byte[] var2 = new byte[this.field706 * this.field705];
        int var3 = 0;
        for (int var4 = this.field706 - 1; var4 >= 0; var4--) {
            for (int var6 = 0; var6 < this.field705; var6++) {
                var2[var3++] = this.field703[this.field705 * var4 + var6];
            }
        }
        this.field703 = var2;
        this.field708 = this.field710 - this.field706 - this.field708;
        while (arg0 >= 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
    }

    @OriginalMember(owner = "FDCAWVRL", name = "a", descriptor = "(IIBI)V")
    public void method274(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 == 3) {
            boolean var5 = false;
        } else {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        for (int var7 = 0; var7 < this.field704.length; var7++) {
            int var8 = this.field704[var7] >> 16 & 0xFF;
            int var9 = arg1 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field704[var7] >> 8 & 0xFF;
            int var11 = arg3 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            int var12 = this.field704[var7] & 0xFF;
            int var13 = arg0 + var12;
            if (var13 < 0) {
                var13 = 0;
            } else if (var13 > 255) {
                var13 = 255;
            }
            this.field704[var7] = (var9 << 16) + (var11 << 8) + var13;
        }
    }

    @OriginalMember(owner = "FDCAWVRL", name = "a", descriptor = "(III)V")
    public void method275(int arg0, int arg1, int arg2) {
        int var4 = this.field707 + arg0;
        int var5 = this.field708 + arg1;
        if (arg2 < 9 || arg2 > 9) {
            this.field698 = -468;
        }
        int var6 = class46.field1162 * var5 + var4;
        int var7 = 0;
        int var8 = this.field706;
        int var9 = this.field705;
        int var10 = class46.field1162 - var9;
        int var11 = 0;
        if (var5 < class46.field1164) {
            int var12 = class46.field1164 - var5;
            var8 -= var12;
            var5 = class46.field1164;
            var7 += var9 * var12;
            var6 += class46.field1162 * var12;
        }
        if (var5 + var8 > class46.field1165) {
            var8 -= var5 + var8 - class46.field1165;
        }
        if (var4 < class46.field1166) {
            int var13 = class46.field1166 - var4;
            var9 -= var13;
            var4 = class46.field1166;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class46.field1167) {
            int var14 = var4 + var9 - class46.field1167;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method276(var9, var7, this.field703, class46.field1161, this.field699, var11, var10, var6, this.field704, var8);
        }
    }

    @OriginalMember(owner = "FDCAWVRL", name = "a", descriptor = "(II[B[IIIII[II)V")
    private void method276(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9) {
        int var11 = -(arg0 >> 2);
        int var12 = -(arg0 & 0x3);
        for (int var13 = -arg9; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg2[arg1++];
                if (var17 == 0) {
                    arg7++;
                } else {
                    arg3[arg7++] = arg8[var17 & 0xFF];
                }
                byte var18 = arg2[arg1++];
                if (var18 == 0) {
                    arg7++;
                } else {
                    arg3[arg7++] = arg8[var18 & 0xFF];
                }
                byte var19 = arg2[arg1++];
                if (var19 == 0) {
                    arg7++;
                } else {
                    arg3[arg7++] = arg8[var19 & 0xFF];
                }
                byte var20 = arg2[arg1++];
                if (var20 == 0) {
                    arg7++;
                } else {
                    arg3[arg7++] = arg8[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg2[arg1++];
                if (var16 == 0) {
                    arg7++;
                } else {
                    arg3[arg7++] = arg8[var16 & 0xFF];
                }
            }
            arg7 += arg6;
            arg1 += arg5;
        }
        if (arg4 != 0) {
            this.field699 = 460;
        }
    }
}
