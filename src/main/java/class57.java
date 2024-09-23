import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("TKCVVLIT")
public class class57 extends class13 {

    @OriginalMember(owner = "TKCVVLIT", name = "v", descriptor = "Z")
    private boolean field1577 = false;

    @OriginalMember(owner = "TKCVVLIT", name = "w", descriptor = "I")
    private int field1578 = 6;

    @OriginalMember(owner = "TKCVVLIT", name = "x", descriptor = "I")
    private int field1579 = -15216;

    @OriginalMember(owner = "TKCVVLIT", name = "y", descriptor = "Z")
    private boolean field1580 = true;

    @OriginalMember(owner = "TKCVVLIT", name = "z", descriptor = "Z")
    private boolean field1581 = false;

    @OriginalMember(owner = "TKCVVLIT", name = "A", descriptor = "I")
    private int field1582 = 365;

    @OriginalMember(owner = "TKCVVLIT", name = "B", descriptor = "I")
    private int field1583 = -619;

    @OriginalMember(owner = "TKCVVLIT", name = "I", descriptor = "I")
    public int field1590;

    @OriginalMember(owner = "TKCVVLIT", name = "J", descriptor = "I")
    public int field1591;

    @OriginalMember(owner = "TKCVVLIT", name = "D", descriptor = "[I")
    public int[] field1585;

    @OriginalMember(owner = "TKCVVLIT", name = "G", descriptor = "I")
    public int field1588;

    @OriginalMember(owner = "TKCVVLIT", name = "H", descriptor = "I")
    public int field1589;

    @OriginalMember(owner = "TKCVVLIT", name = "E", descriptor = "I")
    public int field1586;

    @OriginalMember(owner = "TKCVVLIT", name = "F", descriptor = "I")
    public int field1587;

    @OriginalMember(owner = "TKCVVLIT", name = "C", descriptor = "[B")
    public byte[] field1584;

    @OriginalMember(owner = "TKCVVLIT", name = "<init>", descriptor = "(LMNPBQFWE;Ljava/lang/String;I)V")
    public class57(class37 arg0, String arg1, int arg2) {
        class3 var4 = new class3(false, arg0.method429(arg1 + ".dat", null));
        class3 var5 = new class3(false, arg0.method429("index.dat", null));
        var5.field20 = var4.method17();
        this.field1590 = var5.method17();
        this.field1591 = var5.method17();
        int var6 = var5.method15();
        this.field1585 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field1585[var7 + 1] = var5.method19();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field20 += 2;
            var4.field20 += var5.method17() * var5.method17();
            var5.field20++;
        }
        this.field1588 = var5.method15();
        this.field1589 = var5.method15();
        this.field1586 = var5.method17();
        this.field1587 = var5.method17();
        int var9 = var5.method15();
        int var10 = this.field1587 * this.field1586;
        this.field1584 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1584[var11] = var4.method16();
            }
        } else {
            if (var9 == 1) {
                for (int var12 = 0; var12 < this.field1586; var12++) {
                    for (int var13 = 0; var13 < this.field1587; var13++) {
                        this.field1584[this.field1586 * var13 + var12] = var4.method16();
                    }
                }
            }
            if (class38.field1228) {
            }
        }
    }

    @OriginalMember(owner = "TKCVVLIT", name = "a", descriptor = "(I)V")
    public void method513(int arg0) {
        this.field1590 /= 2;
        this.field1591 /= 2;
        byte[] var2 = new byte[this.field1591 * this.field1590];
        if (this.field1578 != arg0) {
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1587; var4++) {
            for (int var5 = 0; var5 < this.field1586; var5++) {
                var2[(this.field1588 + var5 >> 1) + (this.field1589 + var4 >> 1) * this.field1590] = this.field1584[var3++];
            }
        }
        this.field1584 = var2;
        this.field1586 = this.field1590;
        this.field1587 = this.field1591;
        this.field1588 = 0;
        this.field1589 = 0;
    }

    @OriginalMember(owner = "TKCVVLIT", name = "b", descriptor = "(I)V")
    public void method514(int arg0) {
        if (this.field1590 == this.field1586 && this.field1591 == this.field1587) {
            return;
        }
        byte[] var2 = new byte[this.field1591 * this.field1590];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1587; var4++) {
            for (int var6 = 0; var6 < this.field1586; var6++) {
                var2[(this.field1589 + var4) * this.field1590 + this.field1588 + var6] = this.field1584[var3++];
            }
        }
        this.field1584 = var2;
        this.field1586 = this.field1590;
        this.field1587 = this.field1591;
        this.field1588 = 0;
        this.field1589 = 0;
        if (this.field1579 != arg0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
    }

    @OriginalMember(owner = "TKCVVLIT", name = "c", descriptor = "(I)V")
    public void method515(int arg0) {
        byte[] var2 = new byte[this.field1587 * this.field1586];
        int var3 = 0;
        if (arg0 <= 0) {
            this.field1582 = 466;
        }
        for (int var4 = 0; var4 < this.field1587; var4++) {
            for (int var5 = this.field1586 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field1584[this.field1586 * var4 + var5];
            }
        }
        this.field1584 = var2;
        this.field1588 = this.field1590 - this.field1586 - this.field1588;
    }

    @OriginalMember(owner = "TKCVVLIT", name = "d", descriptor = "(I)V")
    public void method516(int arg0) {
        byte[] var2 = new byte[this.field1587 * this.field1586];
        int var3 = 0;
        for (int var4 = this.field1587 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field1586; var5++) {
                var2[var3++] = this.field1584[this.field1586 * var4 + var5];
            }
        }
        this.field1584 = var2;
        this.field1589 = this.field1591 - this.field1587 - this.field1589;
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "TKCVVLIT", name = "a", descriptor = "(IIII)V")
    public void method517(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field1585.length; var5++) {
            int var6 = this.field1585[var5] >> 16 & 0xFF;
            int var7 = arg0 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field1585[var5] >> 8 & 0xFF;
            int var9 = arg3 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field1585[var5] & 0xFF;
            int var11 = arg1 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field1585[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
        if (arg2 != 0) {
            this.field1583 = -247;
        }
    }

    @OriginalMember(owner = "TKCVVLIT", name = "a", descriptor = "(IIZ)V")
    public void method518(int arg0, int arg1, boolean arg2) {
        int var4 = this.field1588 + arg0;
        int var5 = this.field1589 + arg1;
        int var6 = class13.field710 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1587;
        int var9 = this.field1586;
        int var10 = class13.field710 - var9;
        int var11 = 0;
        if (var5 < class13.field712) {
            int var12 = class13.field712 - var5;
            var8 -= var12;
            var5 = class13.field712;
            var7 += var9 * var12;
            var6 += class13.field710 * var12;
        }
        if (var5 + var8 > class13.field713) {
            var8 -= var5 + var8 - class13.field713;
        }
        if (var4 < class13.field714) {
            int var13 = class13.field714 - var4;
            var9 -= var13;
            var4 = class13.field714;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class13.field715) {
            int var14 = var4 + var9 - class13.field715;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method519(this.field1584, var10, var11, -26981, var7, var8, this.field1585, class13.field709, var9, var6);
            if (arg2) {
                ;
            }
        }
    }

    @OriginalMember(owner = "TKCVVLIT", name = "a", descriptor = "([BIIIII[I[III)V")
    private void method519(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7, int arg8, int arg9) {
        int var11 = -(arg8 >> 2);
        int var12 = -(arg8 & 0x3);
        if (arg3 != -26981) {
            return;
        }
        for (int var13 = -arg5; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg0[arg4++];
                if (var17 == 0) {
                    arg9++;
                } else {
                    arg7[arg9++] = arg6[var17 & 0xFF];
                }
                byte var18 = arg0[arg4++];
                if (var18 == 0) {
                    arg9++;
                } else {
                    arg7[arg9++] = arg6[var18 & 0xFF];
                }
                byte var19 = arg0[arg4++];
                if (var19 == 0) {
                    arg9++;
                } else {
                    arg7[arg9++] = arg6[var19 & 0xFF];
                }
                byte var20 = arg0[arg4++];
                if (var20 == 0) {
                    arg9++;
                } else {
                    arg7[arg9++] = arg6[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg0[arg4++];
                if (var16 == 0) {
                    arg9++;
                } else {
                    arg7[arg9++] = arg6[var16 & 0xFF];
                }
            }
            arg9 += arg1;
            arg4 += arg2;
        }
    }
}
