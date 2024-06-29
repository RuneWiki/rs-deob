import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!VEIVHFHZ")
public class class54 extends class36 {

    @OriginalMember(owner = "client!VEIVHFHZ", name = "A", descriptor = "I")
    private int field1548 = -234;

    @OriginalMember(owner = "client!VEIVHFHZ", name = "B", descriptor = "Z")
    private boolean field1549 = false;

    @OriginalMember(owner = "client!VEIVHFHZ", name = "I", descriptor = "I")
    public int field1556;

    @OriginalMember(owner = "client!VEIVHFHZ", name = "J", descriptor = "I")
    public int field1557;

    @OriginalMember(owner = "client!VEIVHFHZ", name = "D", descriptor = "[I")
    public int[] field1551;

    @OriginalMember(owner = "client!VEIVHFHZ", name = "G", descriptor = "I")
    public int field1554;

    @OriginalMember(owner = "client!VEIVHFHZ", name = "H", descriptor = "I")
    public int field1555;

    @OriginalMember(owner = "client!VEIVHFHZ", name = "E", descriptor = "I")
    public int field1552;

    @OriginalMember(owner = "client!VEIVHFHZ", name = "F", descriptor = "I")
    public int field1553;

    @OriginalMember(owner = "client!VEIVHFHZ", name = "C", descriptor = "[B")
    public byte[] field1550;

    @OriginalMember(owner = "client!VEIVHFHZ", name = "z", descriptor = "I")
    private int field1547;

    @OriginalMember(owner = "client!VEIVHFHZ", name = "<init>", descriptor = "(LXOJZVVDK;Ljava/lang/String;I)V")
    public class54(class60 arg0, String arg1, int arg2) {
        class41 var4 = new class41(888, arg0.method560(arg1 + ".dat", null));
        class41 var5 = new class41(888, arg0.method560("index.dat", null));
        var5.field1241 = var4.method342();
        this.field1556 = var5.method342();
        this.field1557 = var5.method342();
        int var6 = var5.method340();
        this.field1551 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field1551[var7 + 1] = var5.method344();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field1241 += 2;
            var4.field1241 += var5.method342() * var5.method342();
            var5.field1241++;
        }
        this.field1554 = var5.method340();
        this.field1555 = var5.method340();
        this.field1552 = var5.method342();
        this.field1553 = var5.method342();
        int var9 = var5.method340();
        int var10 = this.field1553 * this.field1552;
        this.field1550 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1550[var11] = var4.method341();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field1552; var12++) {
                for (int var13 = 0; var13 < this.field1553; var13++) {
                    this.field1550[this.field1552 * var13 + var12] = var4.method341();
                }
            }
        }
    }

    @OriginalMember(owner = "client!VEIVHFHZ", name = "a", descriptor = "(B)V")
    public void method522(byte arg0) {
        this.field1556 /= 2;
        this.field1557 /= 2;
        if (arg0 != 1) {
            return;
        }
        boolean var2 = false;
        byte[] var3 = new byte[this.field1557 * this.field1556];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field1553; var5++) {
            for (int var6 = 0; var6 < this.field1552; var6++) {
                var3[(this.field1554 + var6 >> 1) + (this.field1555 + var5 >> 1) * this.field1556] = this.field1550[var4++];
            }
        }
        this.field1550 = var3;
        this.field1552 = this.field1556;
        this.field1553 = this.field1557;
        this.field1554 = 0;
        this.field1555 = 0;
    }

    @OriginalMember(owner = "client!VEIVHFHZ", name = "b", descriptor = "(I)V")
    public void method523(int arg0) {
        if (this.field1556 == this.field1552 && this.field1557 == this.field1553) {
            return;
        }
        byte[] var2 = new byte[this.field1557 * this.field1556];
        while (arg0 >= 0) {
            this.field1547 = -105;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1553; var4++) {
            for (int var5 = 0; var5 < this.field1552; var5++) {
                var2[(this.field1555 + var4) * this.field1556 + this.field1554 + var5] = this.field1550[var3++];
            }
        }
        this.field1550 = var2;
        this.field1552 = this.field1556;
        this.field1553 = this.field1557;
        this.field1554 = 0;
        this.field1555 = 0;
    }

    @OriginalMember(owner = "client!VEIVHFHZ", name = "b", descriptor = "(B)V")
    public void method524(byte arg0) {
        byte[] var2 = new byte[this.field1553 * this.field1552];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1553; var4++) {
            for (int var7 = this.field1552 - 1; var7 >= 0; var7--) {
                var2[var3++] = this.field1550[this.field1552 * var4 + var7];
            }
        }
        if (arg0 == 1) {
            boolean var5 = false;
        } else {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        this.field1550 = var2;
        this.field1554 = this.field1556 - this.field1552 - this.field1554;
    }

    @OriginalMember(owner = "client!VEIVHFHZ", name = "c", descriptor = "(I)V")
    public void method525(int arg0) {
        byte[] var2 = new byte[this.field1553 * this.field1552];
        int var3 = 0;
        for (int var4 = this.field1553 - 1; var4 >= 0; var4--) {
            for (int var6 = 0; var6 < this.field1552; var6++) {
                var2[var3++] = this.field1550[this.field1552 * var4 + var6];
            }
        }
        int var5 = 37 / arg0;
        this.field1550 = var2;
        this.field1555 = this.field1557 - this.field1553 - this.field1555;
    }

    @OriginalMember(owner = "client!VEIVHFHZ", name = "a", descriptor = "(ZIII)V")
    public void method526(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg0) {
            this.field1547 = -97;
        }
        for (int var5 = 0; var5 < this.field1551.length; var5++) {
            int var6 = this.field1551[var5] >> 16 & 0xFF;
            int var7 = arg2 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field1551[var5] >> 8 & 0xFF;
            int var9 = arg1 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field1551[var5] & 0xFF;
            int var11 = arg3 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field1551[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
    }

    @OriginalMember(owner = "client!VEIVHFHZ", name = "a", descriptor = "(III)V")
    public void method527(int arg0, int arg1, int arg2) {
        int var4 = this.field1554 + arg1;
        int var5 = this.field1555 + arg0;
        int var6 = class36.field1150 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1553;
        int var9 = this.field1552;
        int var10 = class36.field1150 - var9;
        int var11 = 0;
        while (arg2 >= 0) {
            this.field1549 = !this.field1549;
        }
        if (var5 < class36.field1152) {
            int var12 = class36.field1152 - var5;
            var8 -= var12;
            var5 = class36.field1152;
            var7 += var9 * var12;
            var6 += class36.field1150 * var12;
        }
        if (var5 + var8 > class36.field1153) {
            var8 -= var5 + var8 - class36.field1153;
        }
        if (var4 < class36.field1154) {
            int var13 = class36.field1154 - var4;
            var9 -= var13;
            var4 = class36.field1154;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class36.field1155) {
            int var14 = var4 + var9 - class36.field1155;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method528(var9, this.field1550, var6, var10, class36.field1149, this.field1551, var7, var8, (byte) 5, var11);
        }
    }

    @OriginalMember(owner = "client!VEIVHFHZ", name = "a", descriptor = "(I[BII[I[IIIBI)V")
    private void method528(int arg0, byte[] arg1, int arg2, int arg3, int[] arg4, int[] arg5, int arg6, int arg7, byte arg8, int arg9) {
        int var11 = -(arg0 >> 2);
        int var12 = -(arg0 & 0x3);
        for (int var13 = -arg7; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg1[arg6++];
                if (var17 == 0) {
                    arg2++;
                } else {
                    arg4[arg2++] = arg5[var17 & 0xFF];
                }
                byte var18 = arg1[arg6++];
                if (var18 == 0) {
                    arg2++;
                } else {
                    arg4[arg2++] = arg5[var18 & 0xFF];
                }
                byte var19 = arg1[arg6++];
                if (var19 == 0) {
                    arg2++;
                } else {
                    arg4[arg2++] = arg5[var19 & 0xFF];
                }
                byte var20 = arg1[arg6++];
                if (var20 == 0) {
                    arg2++;
                } else {
                    arg4[arg2++] = arg5[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg1[arg6++];
                if (var16 == 0) {
                    arg2++;
                } else {
                    arg4[arg2++] = arg5[var16 & 0xFF];
                }
            }
            arg2 += arg3;
            arg6 += arg9;
        }
        if (arg8 == 5) {
            ;
        }
    }
}
