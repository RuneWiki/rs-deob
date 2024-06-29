import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!WGRALUSQ")
public class class66 extends class67 {

    @OriginalMember(owner = "client!WGRALUSQ", name = "y", descriptor = "I")
    private int field1666 = 3;

    @OriginalMember(owner = "client!WGRALUSQ", name = "z", descriptor = "I")
    private int field1667 = 2276;

    @OriginalMember(owner = "client!WGRALUSQ", name = "A", descriptor = "I")
    private int field1668 = 4;

    @OriginalMember(owner = "client!WGRALUSQ", name = "B", descriptor = "Z")
    private boolean field1669 = false;

    @OriginalMember(owner = "client!WGRALUSQ", name = "C", descriptor = "B")
    private byte field1670 = 7;

    @OriginalMember(owner = "client!WGRALUSQ", name = "D", descriptor = "I")
    private int field1671 = 3;

    @OriginalMember(owner = "client!WGRALUSQ", name = "E", descriptor = "Z")
    private boolean field1672 = false;

    @OriginalMember(owner = "client!WGRALUSQ", name = "F", descriptor = "Z")
    private boolean field1673 = false;

    @OriginalMember(owner = "client!WGRALUSQ", name = "G", descriptor = "Z")
    private boolean field1674 = true;

    @OriginalMember(owner = "client!WGRALUSQ", name = "N", descriptor = "I")
    public int field1681;

    @OriginalMember(owner = "client!WGRALUSQ", name = "O", descriptor = "I")
    public int field1682;

    @OriginalMember(owner = "client!WGRALUSQ", name = "I", descriptor = "[I")
    public int[] field1676;

    @OriginalMember(owner = "client!WGRALUSQ", name = "L", descriptor = "I")
    public int field1679;

    @OriginalMember(owner = "client!WGRALUSQ", name = "M", descriptor = "I")
    public int field1680;

    @OriginalMember(owner = "client!WGRALUSQ", name = "J", descriptor = "I")
    public int field1677;

    @OriginalMember(owner = "client!WGRALUSQ", name = "K", descriptor = "I")
    public int field1678;

    @OriginalMember(owner = "client!WGRALUSQ", name = "H", descriptor = "[B")
    public byte[] field1675;

    @OriginalMember(owner = "client!WGRALUSQ", name = "<init>", descriptor = "(LESUFCMYV;Ljava/lang/String;I)V")
    public class66(class11 arg0, String arg1, int arg2) {
        class53 var4 = new class53(arg0.method205(arg1 + ".dat", null), (byte) -17);
        class53 var5 = new class53(arg0.method205("index.dat", null), (byte) -17);
        var5.field1539 = var4.method457();
        this.field1681 = var5.method457();
        this.field1682 = var5.method457();
        int var6 = var5.method455();
        this.field1676 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field1676[var7 + 1] = var5.method459();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field1539 += 2;
            var4.field1539 += var5.method457() * var5.method457();
            var5.field1539++;
        }
        this.field1679 = var5.method455();
        this.field1680 = var5.method455();
        this.field1677 = var5.method457();
        this.field1678 = var5.method457();
        int var9 = var5.method455();
        int var10 = this.field1678 * this.field1677;
        this.field1675 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1675[var11] = var4.method456();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field1677; var12++) {
                for (int var13 = 0; var13 < this.field1678; var13++) {
                    this.field1675[this.field1677 * var13 + var12] = var4.method456();
                }
            }
        }
    }

    @OriginalMember(owner = "client!WGRALUSQ", name = "b", descriptor = "(B)V")
    public void method561(byte arg0) {
        this.field1681 /= 2;
        this.field1682 /= 2;
        byte[] var2 = new byte[this.field1682 * this.field1681];
        int var3 = 0;
        if (this.field1670 == arg0) {
            boolean var4 = false;
        } else {
            this.field1666 = 130;
        }
        for (int var5 = 0; var5 < this.field1678; var5++) {
            for (int var6 = 0; var6 < this.field1677; var6++) {
                var2[(this.field1679 + var6 >> 1) + (this.field1680 + var5 >> 1) * this.field1681] = this.field1675[var3++];
            }
        }
        this.field1675 = var2;
        this.field1677 = this.field1681;
        this.field1678 = this.field1682;
        this.field1679 = 0;
        this.field1680 = 0;
    }

    @OriginalMember(owner = "client!WGRALUSQ", name = "a", descriptor = "(I)V")
    public void method562(int arg0) {
        if (arg0 != -12580) {
            this.field1674 = !this.field1674;
        }
        if (this.field1681 == this.field1677 && this.field1682 == this.field1678) {
            return;
        }
        byte[] var2 = new byte[this.field1682 * this.field1681];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1678; var4++) {
            for (int var5 = 0; var5 < this.field1677; var5++) {
                var2[(this.field1680 + var4) * this.field1681 + this.field1679 + var5] = this.field1675[var3++];
            }
        }
        this.field1675 = var2;
        this.field1677 = this.field1681;
        this.field1678 = this.field1682;
        this.field1679 = 0;
        this.field1680 = 0;
    }

    @OriginalMember(owner = "client!WGRALUSQ", name = "b", descriptor = "(I)V")
    public void method563(int arg0) {
        byte[] var2 = new byte[this.field1678 * this.field1677];
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = 0;
        for (int var5 = 0; var5 < this.field1678; var5++) {
            for (int var6 = this.field1677 - 1; var6 >= 0; var6--) {
                var2[var4++] = this.field1675[this.field1677 * var5 + var6];
            }
        }
        this.field1675 = var2;
        this.field1679 = this.field1681 - this.field1677 - this.field1679;
    }

    @OriginalMember(owner = "client!WGRALUSQ", name = "c", descriptor = "(I)V")
    public void method564(int arg0) {
        byte[] var2 = new byte[this.field1678 * this.field1677];
        int var3 = 0;
        if (arg0 != 0) {
            this.field1666 = 283;
        }
        for (int var4 = this.field1678 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field1677; var5++) {
                var2[var3++] = this.field1675[this.field1677 * var4 + var5];
            }
        }
        this.field1675 = var2;
        this.field1680 = this.field1682 - this.field1678 - this.field1680;
    }

    @OriginalMember(owner = "client!WGRALUSQ", name = "a", descriptor = "(IIII)V")
    public void method565(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field1676.length; var5++) {
            int var6 = this.field1676[var5] >> 16 & 0xFF;
            int var7 = arg3 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field1676[var5] >> 8 & 0xFF;
            int var9 = arg0 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field1676[var5] & 0xFF;
            int var11 = arg1 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field1676[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
        if (arg2 <= 0) {
            this.field1667 = 149;
        }
    }

    @OriginalMember(owner = "client!WGRALUSQ", name = "a", descriptor = "(III)V")
    public void method566(int arg0, int arg1, int arg2) {
        int var4 = this.field1679 + arg0;
        int var5 = this.field1680 + arg2;
        int var6 = class67.field1688 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1678;
        int var9 = this.field1677;
        int var10 = class67.field1688 - var9;
        int var11 = 0;
        if (var5 < class67.field1690) {
            int var12 = class67.field1690 - var5;
            var8 -= var12;
            var5 = class67.field1690;
            var7 += var9 * var12;
            var6 += class67.field1688 * var12;
        }
        if (var5 + var8 > class67.field1691) {
            var8 -= var5 + var8 - class67.field1691;
        }
        if (var4 < class67.field1692) {
            int var13 = class67.field1692 - var4;
            var9 -= var13;
            var4 = class67.field1692;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class67.field1693) {
            int var14 = var4 + var9 - class67.field1693;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method567(var9, var7, class67.field1687, this.field1676, var10, this.field1675, var6, var11, false, var8);
            if (arg1 == 22912) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client!WGRALUSQ", name = "a", descriptor = "(II[I[II[BIIZI)V")
    private void method567(int arg0, int arg1, int[] arg2, int[] arg3, int arg4, byte[] arg5, int arg6, int arg7, boolean arg8, int arg9) {
        int var11 = -(arg0 >> 2);
        int var12 = -(arg0 & 0x3);
        for (int var13 = -arg9; var13 < 0; var13++) {
            for (int var15 = var11; var15 < 0; var15++) {
                byte var18 = arg5[arg1++];
                if (var18 == 0) {
                    arg6++;
                } else {
                    arg2[arg6++] = arg3[var18 & 0xFF];
                }
                byte var19 = arg5[arg1++];
                if (var19 == 0) {
                    arg6++;
                } else {
                    arg2[arg6++] = arg3[var19 & 0xFF];
                }
                byte var20 = arg5[arg1++];
                if (var20 == 0) {
                    arg6++;
                } else {
                    arg2[arg6++] = arg3[var20 & 0xFF];
                }
                byte var21 = arg5[arg1++];
                if (var21 == 0) {
                    arg6++;
                } else {
                    arg2[arg6++] = arg3[var21 & 0xFF];
                }
            }
            for (int var16 = var12; var16 < 0; var16++) {
                byte var17 = arg5[arg1++];
                if (var17 == 0) {
                    arg6++;
                } else {
                    arg2[arg6++] = arg3[var17 & 0xFF];
                }
            }
            arg6 += arg4;
            arg1 += arg7;
        }
        if (arg8) {
            for (int var14 = 1; var14 > 0; var14++) {
            }
        }
    }
}
