import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YPWLUGYN")
public class class66 extends class36 {

    @OriginalMember(owner = "YPWLUGYN", name = "z", descriptor = "I")
    private int field1592 = -334;

    @OriginalMember(owner = "YPWLUGYN", name = "A", descriptor = "I")
    private int field1593 = -515;

    @OriginalMember(owner = "YPWLUGYN", name = "B", descriptor = "Z")
    private boolean field1594 = true;

    @OriginalMember(owner = "YPWLUGYN", name = "C", descriptor = "Z")
    private boolean field1595 = true;

    @OriginalMember(owner = "YPWLUGYN", name = "D", descriptor = "I")
    private int field1596 = 628;

    @OriginalMember(owner = "YPWLUGYN", name = "K", descriptor = "I")
    public int field1603;

    @OriginalMember(owner = "YPWLUGYN", name = "L", descriptor = "I")
    public int field1604;

    @OriginalMember(owner = "YPWLUGYN", name = "F", descriptor = "[I")
    public int[] field1598;

    @OriginalMember(owner = "YPWLUGYN", name = "I", descriptor = "I")
    public int field1601;

    @OriginalMember(owner = "YPWLUGYN", name = "J", descriptor = "I")
    public int field1602;

    @OriginalMember(owner = "YPWLUGYN", name = "G", descriptor = "I")
    public int field1599;

    @OriginalMember(owner = "YPWLUGYN", name = "H", descriptor = "I")
    public int field1600;

    @OriginalMember(owner = "YPWLUGYN", name = "E", descriptor = "[B")
    public byte[] field1597;

    @OriginalMember(owner = "YPWLUGYN", name = "<init>", descriptor = "(LXMRRKSSB;Ljava/lang/String;I)V")
    public class66(class60 arg0, String arg1, int arg2) {
        class62 var4 = new class62(arg0.method465(arg1 + ".dat", null), 49938);
        class62 var5 = new class62(arg0.method465("index.dat", null), 49938);
        var5.field1542 = var4.method480();
        this.field1603 = var5.method480();
        this.field1604 = var5.method480();
        int var6 = var5.method478();
        this.field1598 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field1598[var7 + 1] = var5.method482();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field1542 += 2;
            var4.field1542 += var5.method480() * var5.method480();
            var5.field1542++;
        }
        this.field1601 = var5.method478();
        this.field1602 = var5.method478();
        this.field1599 = var5.method480();
        this.field1600 = var5.method480();
        int var9 = var5.method478();
        int var10 = this.field1600 * this.field1599;
        this.field1597 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1597[var11] = var4.method479();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field1599; var12++) {
                for (int var13 = 0; var13 < this.field1600; var13++) {
                    this.field1597[this.field1599 * var13 + var12] = var4.method479();
                }
            }
        }
    }

    @OriginalMember(owner = "YPWLUGYN", name = "a", descriptor = "(I)V")
    public void method528(int arg0) {
        this.field1603 /= 2;
        this.field1604 /= 2;
        byte[] var2 = new byte[this.field1604 * this.field1603];
        int var3 = 0;
        if (arg0 <= 0) {
            this.field1596 = 315;
        }
        for (int var4 = 0; var4 < this.field1600; var4++) {
            for (int var5 = 0; var5 < this.field1599; var5++) {
                var2[(this.field1601 + var5 >> 1) + (this.field1602 + var4 >> 1) * this.field1603] = this.field1597[var3++];
            }
        }
        this.field1597 = var2;
        this.field1599 = this.field1603;
        this.field1600 = this.field1604;
        this.field1601 = 0;
        this.field1602 = 0;
    }

    @OriginalMember(owner = "YPWLUGYN", name = "b", descriptor = "(Z)V")
    public void method529(boolean arg0) {
        if (this.field1603 == this.field1599 && this.field1604 == this.field1600) {
            return;
        }
        byte[] var2 = new byte[this.field1604 * this.field1603];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1600; var4++) {
            for (int var6 = 0; var6 < this.field1599; var6++) {
                var2[(this.field1602 + var4) * this.field1603 + this.field1601 + var6] = this.field1597[var3++];
            }
        }
        this.field1597 = var2;
        this.field1599 = this.field1603;
        this.field1600 = this.field1604;
        this.field1601 = 0;
        if (!arg0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.field1602 = 0;
    }

    @OriginalMember(owner = "YPWLUGYN", name = "b", descriptor = "(I)V")
    public void method530(int arg0) {
        byte[] var2 = new byte[this.field1600 * this.field1599];
        if (arg0 < 4 || arg0 > 4) {
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1600; var4++) {
            for (int var5 = this.field1599 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field1597[this.field1599 * var4 + var5];
            }
        }
        this.field1597 = var2;
        this.field1601 = this.field1603 - this.field1599 - this.field1601;
    }

    @OriginalMember(owner = "YPWLUGYN", name = "c", descriptor = "(I)V")
    public void method531(int arg0) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        byte[] var3 = new byte[this.field1600 * this.field1599];
        int var4 = 0;
        for (int var5 = this.field1600 - 1; var5 >= 0; var5--) {
            for (int var6 = 0; var6 < this.field1599; var6++) {
                var3[var4++] = this.field1597[this.field1599 * var5 + var6];
            }
        }
        this.field1597 = var3;
        this.field1602 = this.field1604 - this.field1600 - this.field1602;
    }

    @OriginalMember(owner = "YPWLUGYN", name = "a", descriptor = "(IIII)V")
    public void method532(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 21 / arg1;
        for (int var6 = 0; var6 < this.field1598.length; var6++) {
            int var7 = this.field1598[var6] >> 16 & 0xFF;
            int var8 = arg0 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field1598[var6] >> 8 & 0xFF;
            int var10 = arg3 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            int var11 = this.field1598[var6] & 0xFF;
            int var12 = arg2 + var11;
            if (var12 < 0) {
                var12 = 0;
            } else if (var12 > 255) {
                var12 = 255;
            }
            this.field1598[var6] = (var8 << 16) + (var10 << 8) + var12;
        }
    }

    @OriginalMember(owner = "YPWLUGYN", name = "a", descriptor = "(III)V")
    public void method533(int arg0, int arg1, int arg2) {
        int var4 = this.field1601 + arg2;
        if (arg0 != -41075) {
            return;
        }
        int var5 = this.field1602 + arg1;
        int var6 = class36.field1089 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1600;
        int var9 = this.field1599;
        int var10 = class36.field1089 - var9;
        int var11 = 0;
        if (var5 < class36.field1091) {
            int var12 = class36.field1091 - var5;
            var8 -= var12;
            var5 = class36.field1091;
            var7 += var9 * var12;
            var6 += class36.field1089 * var12;
        }
        if (var5 + var8 > class36.field1092) {
            var8 -= var5 + var8 - class36.field1092;
        }
        if (var4 < class36.field1093) {
            int var13 = class36.field1093 - var4;
            var9 -= var13;
            var4 = class36.field1093;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class36.field1094) {
            int var14 = var4 + var9 - class36.field1094;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method534(var11, this.field1598, this.field1597, (byte) 1, var7, var9, class36.field1088, var8, var10, var6);
        }
    }

    @OriginalMember(owner = "YPWLUGYN", name = "a", descriptor = "(I[I[BBII[IIII)V")
    private void method534(int arg0, int[] arg1, byte[] arg2, byte arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9) {
        int var11 = -(arg5 >> 2);
        int var12 = -(arg5 & 0x3);
        for (int var13 = -arg7; var13 < 0; var13++) {
            for (int var15 = var11; var15 < 0; var15++) {
                byte var18 = arg2[arg4++];
                if (var18 == 0) {
                    arg9++;
                } else {
                    arg6[arg9++] = arg1[var18 & 0xFF];
                }
                byte var19 = arg2[arg4++];
                if (var19 == 0) {
                    arg9++;
                } else {
                    arg6[arg9++] = arg1[var19 & 0xFF];
                }
                byte var20 = arg2[arg4++];
                if (var20 == 0) {
                    arg9++;
                } else {
                    arg6[arg9++] = arg1[var20 & 0xFF];
                }
                byte var21 = arg2[arg4++];
                if (var21 == 0) {
                    arg9++;
                } else {
                    arg6[arg9++] = arg1[var21 & 0xFF];
                }
            }
            for (int var16 = var12; var16 < 0; var16++) {
                byte var17 = arg2[arg4++];
                if (var17 == 0) {
                    arg9++;
                } else {
                    arg6[arg9++] = arg1[var17 & 0xFF];
                }
            }
            arg9 += arg8;
            arg4 += arg0;
        }
        if (arg3 != 1) {
            for (int var14 = 1; var14 > 0; var14++) {
            }
        }
    }
}
