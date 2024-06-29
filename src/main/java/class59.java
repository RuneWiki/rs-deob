import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!VCTXURSE")
public class class59 extends class35 {

    @OriginalMember(owner = "client!VCTXURSE", name = "x", descriptor = "Z")
    private boolean field1517 = false;

    @OriginalMember(owner = "client!VCTXURSE", name = "y", descriptor = "I")
    private int field1518 = -255;

    @OriginalMember(owner = "client!VCTXURSE", name = "z", descriptor = "I")
    private int field1519 = -822;

    @OriginalMember(owner = "client!VCTXURSE", name = "A", descriptor = "B")
    private byte field1520 = 7;

    @OriginalMember(owner = "client!VCTXURSE", name = "B", descriptor = "I")
    private int field1521 = 179;

    @OriginalMember(owner = "client!VCTXURSE", name = "C", descriptor = "Z")
    private boolean field1522 = false;

    @OriginalMember(owner = "client!VCTXURSE", name = "J", descriptor = "I")
    public int field1529;

    @OriginalMember(owner = "client!VCTXURSE", name = "K", descriptor = "I")
    public int field1530;

    @OriginalMember(owner = "client!VCTXURSE", name = "E", descriptor = "[I")
    public int[] field1524;

    @OriginalMember(owner = "client!VCTXURSE", name = "H", descriptor = "I")
    public int field1527;

    @OriginalMember(owner = "client!VCTXURSE", name = "I", descriptor = "I")
    public int field1528;

    @OriginalMember(owner = "client!VCTXURSE", name = "F", descriptor = "I")
    public int field1525;

    @OriginalMember(owner = "client!VCTXURSE", name = "G", descriptor = "I")
    public int field1526;

    @OriginalMember(owner = "client!VCTXURSE", name = "D", descriptor = "[B")
    public byte[] field1523;

    @OriginalMember(owner = "client!VCTXURSE", name = "<init>", descriptor = "(LSXKKBWPU;Ljava/lang/String;I)V")
    public class59(class50 arg0, String arg1, int arg2) {
        class53 var4 = new class53(arg0.method442(arg1 + ".dat", null), -631);
        class53 var5 = new class53(arg0.method442("index.dat", null), -631);
        var5.field1457 = var4.method470();
        this.field1529 = var5.method470();
        this.field1530 = var5.method470();
        int var6 = var5.method468();
        this.field1524 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field1524[var7 + 1] = var5.method472();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field1457 += 2;
            var4.field1457 += var5.method470() * var5.method470();
            var5.field1457++;
        }
        this.field1527 = var5.method468();
        this.field1528 = var5.method468();
        this.field1525 = var5.method470();
        this.field1526 = var5.method470();
        int var9 = var5.method468();
        int var10 = this.field1526 * this.field1525;
        this.field1523 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1523[var11] = var4.method469();
            }
        } else {
            if (var9 == 1) {
                for (int var12 = 0; var12 < this.field1525; var12++) {
                    for (int var13 = 0; var13 < this.field1526; var13++) {
                        this.field1523[this.field1525 * var13 + var12] = var4.method469();
                    }
                }
            }
            if (class27.field954) {
            }
        }
    }

    @OriginalMember(owner = "client!VCTXURSE", name = "a", descriptor = "(Z)V")
    public void method534(boolean arg0) {
        this.field1529 /= 2;
        if (arg0) {
            this.field1522 = !this.field1522;
        }
        this.field1530 /= 2;
        byte[] var2 = new byte[this.field1530 * this.field1529];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1526; var4++) {
            for (int var5 = 0; var5 < this.field1525; var5++) {
                var2[(this.field1527 + var5 >> 1) + (this.field1528 + var4 >> 1) * this.field1529] = this.field1523[var3++];
            }
        }
        this.field1523 = var2;
        this.field1525 = this.field1529;
        this.field1526 = this.field1530;
        this.field1527 = 0;
        this.field1528 = 0;
    }

    @OriginalMember(owner = "client!VCTXURSE", name = "c", descriptor = "(I)V")
    public void method535(int arg0) {
        if (this.field1529 == this.field1525 && this.field1530 == this.field1526) {
            return;
        }
        byte[] var2 = new byte[this.field1530 * this.field1529];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1526; var4++) {
            for (int var6 = 0; var6 < this.field1525; var6++) {
                var2[(this.field1528 + var4) * this.field1529 + this.field1527 + var6] = this.field1523[var3++];
            }
        }
        this.field1523 = var2;
        this.field1525 = this.field1529;
        int var5 = 32 / arg0;
        this.field1526 = this.field1530;
        this.field1527 = 0;
        this.field1528 = 0;
    }

    @OriginalMember(owner = "client!VCTXURSE", name = "d", descriptor = "(I)V")
    public void method536(int arg0) {
        if (arg0 != 0) {
            this.field1519 = 448;
        }
        byte[] var2 = new byte[this.field1526 * this.field1525];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1526; var4++) {
            for (int var5 = this.field1525 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field1523[this.field1525 * var4 + var5];
            }
        }
        this.field1523 = var2;
        this.field1527 = this.field1529 - this.field1525 - this.field1527;
    }

    @OriginalMember(owner = "client!VCTXURSE", name = "e", descriptor = "(I)V")
    public void method537(int arg0) {
        if (arg0 != 42862) {
            return;
        }
        byte[] var2 = new byte[this.field1526 * this.field1525];
        int var3 = 0;
        for (int var4 = this.field1526 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field1525; var5++) {
                var2[var3++] = this.field1523[this.field1525 * var4 + var5];
            }
        }
        this.field1523 = var2;
        this.field1528 = this.field1530 - this.field1526 - this.field1528;
    }

    @OriginalMember(owner = "client!VCTXURSE", name = "a", descriptor = "(IIII)V")
    public void method538(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field1524.length; var5++) {
            int var6 = this.field1524[var5] >> 16 & 0xFF;
            int var7 = arg2 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field1524[var5] >> 8 & 0xFF;
            int var9 = arg0 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field1524[var5] & 0xFF;
            int var11 = arg1 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field1524[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
        if (arg3 < 3 || arg3 > 3) {
            ;
        }
    }

    @OriginalMember(owner = "client!VCTXURSE", name = "a", descriptor = "(III)V")
    public void method539(int arg0, int arg1, int arg2) {
        int var4 = this.field1527 + arg0;
        int var5 = this.field1528 + arg1;
        int var6 = class35.field1111 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1526;
        int var9 = this.field1525;
        int var10 = class35.field1111 - var9;
        int var11 = 0;
        if (var5 < class35.field1113) {
            int var12 = class35.field1113 - var5;
            var8 -= var12;
            var5 = class35.field1113;
            var7 += var9 * var12;
            var6 += class35.field1111 * var12;
        }
        if (var5 + var8 > class35.field1114) {
            var8 -= var5 + var8 - class35.field1114;
        }
        if (var4 < class35.field1115) {
            int var13 = class35.field1115 - var4;
            var9 -= var13;
            var4 = class35.field1115;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class35.field1116) {
            int var14 = var4 + var9 - class35.field1116;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method540(var6, this.field1521, var9, class35.field1110, this.field1524, this.field1523, var11, var10, var8, var7);
            if (arg2 > 0) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client!VCTXURSE", name = "a", descriptor = "(III[I[I[BIIII)V")
    private void method540(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, byte[] arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = -(arg2 >> 2);
        int var12 = -(arg2 & 0x3);
        int var13 = 33 / arg1;
        for (int var14 = -arg8; var14 < 0; var14++) {
            for (int var15 = var11; var15 < 0; var15++) {
                byte var18 = arg5[arg9++];
                if (var18 == 0) {
                    arg0++;
                } else {
                    arg3[arg0++] = arg4[var18 & 0xFF];
                }
                byte var19 = arg5[arg9++];
                if (var19 == 0) {
                    arg0++;
                } else {
                    arg3[arg0++] = arg4[var19 & 0xFF];
                }
                byte var20 = arg5[arg9++];
                if (var20 == 0) {
                    arg0++;
                } else {
                    arg3[arg0++] = arg4[var20 & 0xFF];
                }
                byte var21 = arg5[arg9++];
                if (var21 == 0) {
                    arg0++;
                } else {
                    arg3[arg0++] = arg4[var21 & 0xFF];
                }
            }
            for (int var16 = var12; var16 < 0; var16++) {
                byte var17 = arg5[arg9++];
                if (var17 == 0) {
                    arg0++;
                } else {
                    arg3[arg0++] = arg4[var17 & 0xFF];
                }
            }
            arg0 += arg7;
            arg9 += arg6;
        }
    }
}
