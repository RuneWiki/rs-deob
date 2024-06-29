import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ZXDQRRNS")
public class class72 extends class8 {

    @OriginalMember(owner = "client!ZXDQRRNS", name = "w", descriptor = "Z")
    private boolean field1721 = false;

    @OriginalMember(owner = "client!ZXDQRRNS", name = "y", descriptor = "B")
    private byte field1723 = 9;

    @OriginalMember(owner = "client!ZXDQRRNS", name = "z", descriptor = "Z")
    private boolean field1724 = true;

    @OriginalMember(owner = "client!ZXDQRRNS", name = "G", descriptor = "I")
    public int field1731;

    @OriginalMember(owner = "client!ZXDQRRNS", name = "H", descriptor = "I")
    public int field1732;

    @OriginalMember(owner = "client!ZXDQRRNS", name = "B", descriptor = "[I")
    public int[] field1726;

    @OriginalMember(owner = "client!ZXDQRRNS", name = "E", descriptor = "I")
    public int field1729;

    @OriginalMember(owner = "client!ZXDQRRNS", name = "F", descriptor = "I")
    public int field1730;

    @OriginalMember(owner = "client!ZXDQRRNS", name = "C", descriptor = "I")
    public int field1727;

    @OriginalMember(owner = "client!ZXDQRRNS", name = "D", descriptor = "I")
    public int field1728;

    @OriginalMember(owner = "client!ZXDQRRNS", name = "A", descriptor = "[B")
    public byte[] field1725;

    @OriginalMember(owner = "client!ZXDQRRNS", name = "x", descriptor = "I")
    private int field1722;

    @OriginalMember(owner = "client!ZXDQRRNS", name = "<init>", descriptor = "(LWEMOPWVJ;Ljava/lang/String;I)V")
    public class72(class62 arg0, String arg1, int arg2) {
        class52 var4 = new class52(arg0.method559(arg1 + ".dat", null), true);
        class52 var5 = new class52(arg0.method559("index.dat", null), true);
        var5.field1434 = var4.method463();
        this.field1731 = var5.method463();
        this.field1732 = var5.method463();
        int var6 = var5.method461();
        this.field1726 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field1726[var7 + 1] = var5.method465();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field1434 += 2;
            var4.field1434 += var5.method463() * var5.method463();
            var5.field1434++;
        }
        this.field1729 = var5.method461();
        this.field1730 = var5.method461();
        this.field1727 = var5.method463();
        this.field1728 = var5.method463();
        int var9 = var5.method461();
        int var10 = this.field1728 * this.field1727;
        this.field1725 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1725[var11] = var4.method462();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field1727; var12++) {
                for (int var13 = 0; var13 < this.field1728; var13++) {
                    this.field1725[this.field1727 * var13 + var12] = var4.method462();
                }
            }
        }
    }

    @OriginalMember(owner = "client!ZXDQRRNS", name = "c", descriptor = "(I)V")
    public void method594(int arg0) {
        this.field1731 /= 2;
        if (arg0 >= 0) {
            return;
        }
        this.field1732 /= 2;
        byte[] var2 = new byte[this.field1732 * this.field1731];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1728; var4++) {
            for (int var5 = 0; var5 < this.field1727; var5++) {
                var2[(this.field1729 + var5 >> 1) + (this.field1730 + var4 >> 1) * this.field1731] = this.field1725[var3++];
            }
        }
        this.field1725 = var2;
        this.field1727 = this.field1731;
        this.field1728 = this.field1732;
        this.field1729 = 0;
        this.field1730 = 0;
    }

    @OriginalMember(owner = "client!ZXDQRRNS", name = "d", descriptor = "(I)V")
    public void method595(int arg0) {
        if (this.field1731 == this.field1727 && this.field1732 == this.field1728) {
            return;
        }
        byte[] var2 = new byte[this.field1732 * this.field1731];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1728; var4++) {
            for (int var6 = 0; var6 < this.field1727; var6++) {
                var2[(this.field1730 + var4) * this.field1731 + this.field1729 + var6] = this.field1725[var3++];
            }
        }
        this.field1725 = var2;
        this.field1727 = this.field1731;
        this.field1728 = this.field1732;
        this.field1729 = 0;
        int var5 = 18 / arg0;
        this.field1730 = 0;
    }

    @OriginalMember(owner = "client!ZXDQRRNS", name = "e", descriptor = "(I)V")
    public void method596(int arg0) {
        byte[] var2 = new byte[this.field1728 * this.field1727];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1728; var4++) {
            for (int var5 = this.field1727 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field1725[this.field1727 * var4 + var5];
            }
        }
        this.field1725 = var2;
        if (arg0 != -6360) {
            this.field1722 = -431;
        }
        this.field1729 = this.field1731 - this.field1727 - this.field1729;
    }

    @OriginalMember(owner = "client!ZXDQRRNS", name = "f", descriptor = "(I)V")
    public void method597(int arg0) {
        byte[] var2 = new byte[this.field1728 * this.field1727];
        int var3 = 0;
        for (int var4 = this.field1728 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field1727; var5++) {
                var2[var3++] = this.field1725[this.field1727 * var4 + var5];
            }
        }
        if (arg0 == 0) {
            this.field1725 = var2;
            this.field1730 = this.field1732 - this.field1728 - this.field1730;
        }
    }

    @OriginalMember(owner = "client!ZXDQRRNS", name = "a", descriptor = "(IIII)V")
    public void method598(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field1726.length; var5++) {
            int var6 = this.field1726[var5] >> 16 & 0xFF;
            int var7 = arg3 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field1726[var5] >> 8 & 0xFF;
            int var9 = arg1 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field1726[var5] & 0xFF;
            int var11 = arg0 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field1726[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
        while (arg2 >= 0) {
            this.field1722 = 243;
        }
    }

    @OriginalMember(owner = "client!ZXDQRRNS", name = "a", descriptor = "(IIB)V")
    public void method599(int arg0, int arg1, byte arg2) {
        if (arg2 != 0) {
            return;
        }
        boolean var4 = false;
        int var5 = this.field1729 + arg1;
        int var6 = this.field1730 + arg0;
        int var7 = class8.field582 * var6 + var5;
        int var8 = 0;
        int var9 = this.field1728;
        int var10 = this.field1727;
        int var11 = class8.field582 - var10;
        int var12 = 0;
        if (var6 < class8.field584) {
            int var13 = class8.field584 - var6;
            var9 -= var13;
            var6 = class8.field584;
            var8 += var10 * var13;
            var7 += class8.field582 * var13;
        }
        if (var6 + var9 > class8.field585) {
            var9 -= var6 + var9 - class8.field585;
        }
        if (var5 < class8.field586) {
            int var14 = class8.field586 - var5;
            var10 -= var14;
            var5 = class8.field586;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class8.field587) {
            int var15 = var5 + var10 - class8.field587;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method600(var10, true, this.field1725, var8, var11, this.field1726, var12, var7, var9, class8.field581);
        }
    }

    @OriginalMember(owner = "client!ZXDQRRNS", name = "a", descriptor = "(IZ[BII[IIII[I)V")
    private void method600(int arg0, boolean arg1, byte[] arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int[] arg9) {
        int var11 = -(arg0 >> 2);
        int var12 = -(arg0 & 0x3);
        if (!arg1) {
            this.field1722 = -285;
        }
        for (int var13 = -arg8; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg2[arg3++];
                if (var17 == 0) {
                    arg7++;
                } else {
                    arg9[arg7++] = arg5[var17 & 0xFF];
                }
                byte var18 = arg2[arg3++];
                if (var18 == 0) {
                    arg7++;
                } else {
                    arg9[arg7++] = arg5[var18 & 0xFF];
                }
                byte var19 = arg2[arg3++];
                if (var19 == 0) {
                    arg7++;
                } else {
                    arg9[arg7++] = arg5[var19 & 0xFF];
                }
                byte var20 = arg2[arg3++];
                if (var20 == 0) {
                    arg7++;
                } else {
                    arg9[arg7++] = arg5[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg2[arg3++];
                if (var16 == 0) {
                    arg7++;
                } else {
                    arg9[arg7++] = arg5[var16 & 0xFF];
                }
            }
            arg7 += arg4;
            arg3 += arg6;
        }
    }
}
