import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("VUMXQDFQ")
public class class57 extends class50 {

    @OriginalMember(owner = "VUMXQDFQ", name = "C", descriptor = "Z")
    private boolean field1467 = false;

    @OriginalMember(owner = "VUMXQDFQ", name = "D", descriptor = "I")
    private int field1468 = 1;

    @OriginalMember(owner = "VUMXQDFQ", name = "E", descriptor = "I")
    private int field1469 = -613;

    @OriginalMember(owner = "VUMXQDFQ", name = "F", descriptor = "I")
    private int field1470 = 491;

    @OriginalMember(owner = "VUMXQDFQ", name = "G", descriptor = "B")
    private byte field1471 = 3;

    @OriginalMember(owner = "VUMXQDFQ", name = "N", descriptor = "I")
    public int field1478;

    @OriginalMember(owner = "VUMXQDFQ", name = "O", descriptor = "I")
    public int field1479;

    @OriginalMember(owner = "VUMXQDFQ", name = "I", descriptor = "[I")
    public int[] field1473;

    @OriginalMember(owner = "VUMXQDFQ", name = "L", descriptor = "I")
    public int field1476;

    @OriginalMember(owner = "VUMXQDFQ", name = "M", descriptor = "I")
    public int field1477;

    @OriginalMember(owner = "VUMXQDFQ", name = "J", descriptor = "I")
    public int field1474;

    @OriginalMember(owner = "VUMXQDFQ", name = "K", descriptor = "I")
    public int field1475;

    @OriginalMember(owner = "VUMXQDFQ", name = "H", descriptor = "[B")
    public byte[] field1472;

    @OriginalMember(owner = "VUMXQDFQ", name = "<init>", descriptor = "(LXRWUKRPO;Ljava/lang/String;I)V")
    public class57(class65 arg0, String arg1, int arg2) {
        class21 var4 = new class21(arg0.method581(arg1 + ".dat", null), -49015);
        class21 var5 = new class21(arg0.method581("index.dat", null), -49015);
        var5.field818 = var4.method246();
        this.field1478 = var5.method246();
        this.field1479 = var5.method246();
        int var6 = var5.method244();
        this.field1473 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field1473[var7 + 1] = var5.method248();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field818 += 2;
            var4.field818 += var5.method246() * var5.method246();
            var5.field818++;
        }
        this.field1476 = var5.method244();
        this.field1477 = var5.method244();
        this.field1474 = var5.method246();
        this.field1475 = var5.method246();
        int var9 = var5.method244();
        int var10 = this.field1475 * this.field1474;
        this.field1472 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1472[var11] = var4.method245();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field1474; var12++) {
                for (int var13 = 0; var13 < this.field1475; var13++) {
                    this.field1472[this.field1474 * var13 + var12] = var4.method245();
                }
            }
        }
    }

    @OriginalMember(owner = "VUMXQDFQ", name = "c", descriptor = "(I)V")
    public void method537(int arg0) {
        this.field1478 /= 2;
        this.field1479 /= 2;
        byte[] var2 = new byte[this.field1479 * this.field1478];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1475; var4++) {
            for (int var6 = 0; var6 < this.field1474; var6++) {
                var2[(this.field1476 + var6 >> 1) + (this.field1477 + var4 >> 1) * this.field1478] = this.field1472[var3++];
            }
        }
        this.field1472 = var2;
        if (this.field1468 != arg0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.field1474 = this.field1478;
        this.field1475 = this.field1479;
        this.field1476 = 0;
        this.field1477 = 0;
    }

    @OriginalMember(owner = "VUMXQDFQ", name = "d", descriptor = "(I)V")
    public void method538(int arg0) {
        if (arg0 >= 0 || this.field1478 == this.field1474 && this.field1479 == this.field1475) {
            return;
        }
        byte[] var2 = new byte[this.field1479 * this.field1478];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1475; var4++) {
            for (int var5 = 0; var5 < this.field1474; var5++) {
                var2[(this.field1477 + var4) * this.field1478 + this.field1476 + var5] = this.field1472[var3++];
            }
        }
        this.field1472 = var2;
        this.field1474 = this.field1478;
        this.field1475 = this.field1479;
        this.field1476 = 0;
        this.field1477 = 0;
    }

    @OriginalMember(owner = "VUMXQDFQ", name = "e", descriptor = "(I)V")
    public void method539(int arg0) {
        if (arg0 <= 0) {
            return;
        }
        byte[] var2 = new byte[this.field1475 * this.field1474];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1475; var4++) {
            for (int var5 = this.field1474 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field1472[this.field1474 * var4 + var5];
            }
        }
        this.field1472 = var2;
        this.field1476 = this.field1478 - this.field1474 - this.field1476;
    }

    @OriginalMember(owner = "VUMXQDFQ", name = "a", descriptor = "(B)V")
    public void method540(byte arg0) {
        byte[] var2 = new byte[this.field1475 * this.field1474];
        int var3 = 0;
        for (int var4 = this.field1475 - 1; var4 >= 0; var4--) {
            for (int var6 = 0; var6 < this.field1474; var6++) {
                var2[var3++] = this.field1472[this.field1474 * var4 + var6];
            }
        }
        this.field1472 = var2;
        this.field1477 = this.field1479 - this.field1475 - this.field1477;
        if (arg0 == 2) {
            boolean var5 = false;
        } else {
            this.field1467 = !this.field1467;
        }
    }

    @OriginalMember(owner = "VUMXQDFQ", name = "a", descriptor = "(IIIB)V")
    public void method541(int arg0, int arg1, int arg2, byte arg3) {
        for (int var5 = 0; var5 < this.field1473.length; var5++) {
            int var6 = this.field1473[var5] >> 16 & 0xFF;
            int var7 = arg2 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field1473[var5] >> 8 & 0xFF;
            int var9 = arg1 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field1473[var5] & 0xFF;
            int var11 = arg0 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field1473[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
        if (arg3 != -77) {
            this.field1468 = 438;
        }
    }

    @OriginalMember(owner = "VUMXQDFQ", name = "a", descriptor = "(III)V")
    public void method542(int arg0, int arg1, int arg2) {
        int var4 = this.field1476 + arg0;
        int var5 = this.field1477 + arg2;
        int var6 = class50.field1279 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1475;
        int var9 = this.field1474;
        int var10 = class50.field1279 - var9;
        int var11 = 0;
        int var12 = 50 / arg1;
        if (var5 < class50.field1281) {
            int var13 = class50.field1281 - var5;
            var8 -= var13;
            var5 = class50.field1281;
            var7 += var9 * var13;
            var6 += class50.field1279 * var13;
        }
        if (var5 + var8 > class50.field1282) {
            var8 -= var5 + var8 - class50.field1282;
        }
        if (var4 < class50.field1283) {
            int var14 = class50.field1283 - var4;
            var9 -= var14;
            var4 = class50.field1283;
            var7 += var14;
            var6 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (var4 + var9 > class50.field1284) {
            int var15 = var4 + var9 - class50.field1284;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            this.method543(var7, var6, var11, var8, var9, this.field1472, class50.field1278, var10, this.field1473, -3950);
        }
    }

    @OriginalMember(owner = "VUMXQDFQ", name = "a", descriptor = "(IIIII[B[II[II)V")
    private void method543(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int[] arg6, int arg7, int[] arg8, int arg9) {
        int var11 = -(arg4 >> 2);
        int var12 = -(arg4 & 0x3);
        for (int var13 = -arg3; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg5[arg0++];
                if (var17 == 0) {
                    arg1++;
                } else {
                    arg6[arg1++] = arg8[var17 & 0xFF];
                }
                byte var18 = arg5[arg0++];
                if (var18 == 0) {
                    arg1++;
                } else {
                    arg6[arg1++] = arg8[var18 & 0xFF];
                }
                byte var19 = arg5[arg0++];
                if (var19 == 0) {
                    arg1++;
                } else {
                    arg6[arg1++] = arg8[var19 & 0xFF];
                }
                byte var20 = arg5[arg0++];
                if (var20 == 0) {
                    arg1++;
                } else {
                    arg6[arg1++] = arg8[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg5[arg0++];
                if (var16 == 0) {
                    arg1++;
                } else {
                    arg6[arg1++] = arg8[var16 & 0xFF];
                }
            }
            arg1 += arg7;
            arg0 += arg2;
        }
        if (arg9 == -3950) {
            ;
        }
    }
}
