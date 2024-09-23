import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DZSIRBWX")
public class class15 extends class31 {

    @OriginalMember(owner = "DZSIRBWX", name = "y", descriptor = "Z")
    private boolean field699 = false;

    @OriginalMember(owner = "DZSIRBWX", name = "z", descriptor = "I")
    private int field700 = 540;

    @OriginalMember(owner = "DZSIRBWX", name = "A", descriptor = "I")
    private int field701 = 2;

    @OriginalMember(owner = "DZSIRBWX", name = "B", descriptor = "Z")
    private boolean field702 = false;

    @OriginalMember(owner = "DZSIRBWX", name = "I", descriptor = "I")
    public int field709;

    @OriginalMember(owner = "DZSIRBWX", name = "J", descriptor = "I")
    public int field710;

    @OriginalMember(owner = "DZSIRBWX", name = "D", descriptor = "[I")
    public int[] field704;

    @OriginalMember(owner = "DZSIRBWX", name = "G", descriptor = "I")
    public int field707;

    @OriginalMember(owner = "DZSIRBWX", name = "H", descriptor = "I")
    public int field708;

    @OriginalMember(owner = "DZSIRBWX", name = "E", descriptor = "I")
    public int field705;

    @OriginalMember(owner = "DZSIRBWX", name = "F", descriptor = "I")
    public int field706;

    @OriginalMember(owner = "DZSIRBWX", name = "C", descriptor = "[B")
    public byte[] field703;

    @OriginalMember(owner = "DZSIRBWX", name = "<init>", descriptor = "(LOTSGNSQM;Ljava/lang/String;I)V")
    public class15(class41 arg0, String arg1, int arg2) {
        class68 var4 = new class68(arg0.method376(arg1 + ".dat", null), -103);
        class68 var5 = new class68(arg0.method376("index.dat", null), -103);
        var5.field1612 = var4.method551();
        this.field709 = var5.method551();
        this.field710 = var5.method551();
        int var6 = var5.method549();
        this.field704 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field704[var7 + 1] = var5.method553();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field1612 += 2;
            var4.field1612 += var5.method551() * var5.method551();
            var5.field1612++;
        }
        this.field707 = var5.method549();
        this.field708 = var5.method549();
        this.field705 = var5.method551();
        this.field706 = var5.method551();
        int var9 = var5.method549();
        int var10 = this.field706 * this.field705;
        this.field703 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field703[var11] = var4.method550();
            }
        } else {
            if (var9 == 1) {
                for (int var12 = 0; var12 < this.field705; var12++) {
                    for (int var13 = 0; var13 < this.field706; var13++) {
                        this.field703[this.field705 * var13 + var12] = var4.method550();
                    }
                }
            }
            if (class72.field1713) {
            }
        }
    }

    @OriginalMember(owner = "DZSIRBWX", name = "a", descriptor = "(B)V")
    public void method187(byte arg0) {
        this.field709 /= 2;
        this.field710 /= 2;
        byte[] var2 = new byte[this.field710 * this.field709];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field706; var4++) {
            for (int var5 = 0; var5 < this.field705; var5++) {
                var2[(this.field707 + var5 >> 1) + (this.field708 + var4 >> 1) * this.field709] = this.field703[var3++];
            }
        }
        if (arg0 != 17) {
            return;
        }
        this.field703 = var2;
        this.field705 = this.field709;
        this.field706 = this.field710;
        this.field707 = 0;
        this.field708 = 0;
    }

    @OriginalMember(owner = "DZSIRBWX", name = "b", descriptor = "(B)V")
    public void method188(byte arg0) {
        if (this.field709 == this.field705 && this.field710 == this.field706) {
            return;
        }
        byte[] var2 = new byte[this.field710 * this.field709];
        if (arg0 != 45) {
            this.field700 = -488;
        }
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

    @OriginalMember(owner = "DZSIRBWX", name = "b", descriptor = "(I)V")
    public void method189(int arg0) {
        byte[] var2 = new byte[this.field706 * this.field705];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field706; var4++) {
            for (int var5 = this.field705 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field703[this.field705 * var4 + var5];
            }
        }
        if (arg0 >= 0) {
            this.field699 = !this.field699;
        }
        this.field703 = var2;
        this.field707 = this.field709 - this.field705 - this.field707;
    }

    @OriginalMember(owner = "DZSIRBWX", name = "b", descriptor = "(Z)V")
    public void method190(boolean arg0) {
        byte[] var2 = new byte[this.field706 * this.field705];
        int var3 = 0;
        for (int var4 = this.field706 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field705; var5++) {
                var2[var3++] = this.field703[this.field705 * var4 + var5];
            }
        }
        if (arg0) {
            this.field702 = !this.field702;
        }
        this.field703 = var2;
        this.field708 = this.field710 - this.field706 - this.field708;
    }

    @OriginalMember(owner = "DZSIRBWX", name = "a", descriptor = "(IIII)V")
    public void method191(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field704.length; var5++) {
            int var6 = this.field704[var5] >> 16 & 0xFF;
            int var7 = arg2 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field704[var5] >> 8 & 0xFF;
            int var9 = arg3 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field704[var5] & 0xFF;
            int var11 = arg0 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field704[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
        if (arg1 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "DZSIRBWX", name = "a", descriptor = "(III)V")
    public void method192(int arg0, int arg1, int arg2) {
        int var4 = this.field707 + arg1;
        int var5 = this.field708 + arg0;
        int var6 = class31.field954 * var5 + var4;
        int var7 = 0;
        if (arg2 != 49598) {
            return;
        }
        int var8 = this.field706;
        int var9 = this.field705;
        int var10 = class31.field954 - var9;
        int var11 = 0;
        if (var5 < class31.field956) {
            int var12 = class31.field956 - var5;
            var8 -= var12;
            var5 = class31.field956;
            var7 += var9 * var12;
            var6 += class31.field954 * var12;
        }
        if (var5 + var8 > class31.field957) {
            var8 -= var5 + var8 - class31.field957;
        }
        if (var4 < class31.field958) {
            int var13 = class31.field958 - var4;
            var9 -= var13;
            var4 = class31.field958;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class31.field959) {
            int var14 = var4 + var9 - class31.field959;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method193(var9, var11, class31.field953, this.field703, var8, var6, 3, var7, this.field704, var10);
        }
    }

    @OriginalMember(owner = "DZSIRBWX", name = "a", descriptor = "(II[I[BIIII[II)V")
    private void method193(int arg0, int arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9) {
        int var11 = -(arg0 >> 2);
        if (arg6 != 3) {
            this.field700 = 188;
        }
        int var12 = -(arg0 & 0x3);
        for (int var13 = -arg4; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg3[arg7++];
                if (var17 == 0) {
                    arg5++;
                } else {
                    arg2[arg5++] = arg8[var17 & 0xFF];
                }
                byte var18 = arg3[arg7++];
                if (var18 == 0) {
                    arg5++;
                } else {
                    arg2[arg5++] = arg8[var18 & 0xFF];
                }
                byte var19 = arg3[arg7++];
                if (var19 == 0) {
                    arg5++;
                } else {
                    arg2[arg5++] = arg8[var19 & 0xFF];
                }
                byte var20 = arg3[arg7++];
                if (var20 == 0) {
                    arg5++;
                } else {
                    arg2[arg5++] = arg8[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg3[arg7++];
                if (var16 == 0) {
                    arg5++;
                } else {
                    arg2[arg5++] = arg8[var16 & 0xFF];
                }
            }
            arg5 += arg9;
            arg7 += arg1;
        }
    }
}
