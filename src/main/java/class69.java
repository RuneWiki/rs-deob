import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ZQSBFHWZ")
public class class69 extends class21 {

    @OriginalMember(owner = "client!ZQSBFHWZ", name = "x", descriptor = "B")
    private byte field1682 = 1;

    @OriginalMember(owner = "client!ZQSBFHWZ", name = "z", descriptor = "I")
    private int field1684 = 279;

    @OriginalMember(owner = "client!ZQSBFHWZ", name = "G", descriptor = "I")
    public int field1691;

    @OriginalMember(owner = "client!ZQSBFHWZ", name = "H", descriptor = "I")
    public int field1692;

    @OriginalMember(owner = "client!ZQSBFHWZ", name = "B", descriptor = "[I")
    public int[] field1686;

    @OriginalMember(owner = "client!ZQSBFHWZ", name = "E", descriptor = "I")
    public int field1689;

    @OriginalMember(owner = "client!ZQSBFHWZ", name = "F", descriptor = "I")
    public int field1690;

    @OriginalMember(owner = "client!ZQSBFHWZ", name = "C", descriptor = "I")
    public int field1687;

    @OriginalMember(owner = "client!ZQSBFHWZ", name = "D", descriptor = "I")
    public int field1688;

    @OriginalMember(owner = "client!ZQSBFHWZ", name = "A", descriptor = "[B")
    public byte[] field1685;

    @OriginalMember(owner = "client!ZQSBFHWZ", name = "y", descriptor = "I")
    private int field1683;

    @OriginalMember(owner = "client!ZQSBFHWZ", name = "<init>", descriptor = "(LFUZJMGZB;Ljava/lang/String;I)V")
    public class69(class19 arg0, String arg1, int arg2) {
        class32 var4 = new class32((byte) 114, arg0.method277(arg1 + ".dat", null));
        class32 var5 = new class32((byte) 114, arg0.method277("index.dat", null));
        var5.field1032 = var4.method371();
        this.field1691 = var5.method371();
        this.field1692 = var5.method371();
        int var6 = var5.method369();
        this.field1686 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field1686[var7 + 1] = var5.method373();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field1032 += 2;
            var4.field1032 += var5.method371() * var5.method371();
            var5.field1032++;
        }
        this.field1689 = var5.method369();
        this.field1690 = var5.method369();
        this.field1687 = var5.method371();
        this.field1688 = var5.method371();
        int var9 = var5.method369();
        int var10 = this.field1688 * this.field1687;
        this.field1685 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1685[var11] = var4.method370();
            }
        } else if (var9 == 1) {
            for (int var12 = 0; var12 < this.field1687; var12++) {
                for (int var13 = 0; var13 < this.field1688; var13++) {
                    this.field1685[this.field1687 * var13 + var12] = var4.method370();
                }
            }
        }
    }

    @OriginalMember(owner = "client!ZQSBFHWZ", name = "b", descriptor = "(I)V")
    public void method581(int arg0) {
        this.field1691 /= 2;
        this.field1692 /= 2;
        byte[] var2 = new byte[this.field1692 * this.field1691];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1688; var4++) {
            for (int var5 = 0; var5 < this.field1687; var5++) {
                var2[(this.field1689 + var5 >> 1) + (this.field1690 + var4 >> 1) * this.field1691] = this.field1685[var3++];
            }
        }
        this.field1685 = var2;
        this.field1687 = this.field1691;
        if (arg0 == 0) {
            this.field1688 = this.field1692;
            this.field1689 = 0;
            this.field1690 = 0;
        }
    }

    @OriginalMember(owner = "client!ZQSBFHWZ", name = "b", descriptor = "(Z)V")
    public void method582(boolean arg0) {
        if (this.field1691 == this.field1687 && this.field1692 == this.field1688) {
            return;
        }
        byte[] var2 = new byte[this.field1692 * this.field1691];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1688; var4++) {
            for (int var6 = 0; var6 < this.field1687; var6++) {
                var2[(this.field1690 + var4) * this.field1691 + this.field1689 + var6] = this.field1685[var3++];
            }
        }
        this.field1685 = var2;
        this.field1687 = this.field1691;
        this.field1688 = this.field1692;
        this.field1689 = 0;
        if (!arg0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        this.field1690 = 0;
    }

    @OriginalMember(owner = "client!ZQSBFHWZ", name = "a", descriptor = "(B)V")
    public void method583(byte arg0) {
        byte[] var2 = new byte[this.field1688 * this.field1687];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1688; var4++) {
            for (int var5 = this.field1687 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field1685[this.field1687 * var4 + var5];
            }
        }
        if (arg0 == 8) {
            this.field1685 = var2;
            this.field1689 = this.field1691 - this.field1687 - this.field1689;
        }
    }

    @OriginalMember(owner = "client!ZQSBFHWZ", name = "c", descriptor = "(I)V")
    public void method584(int arg0) {
        byte[] var2 = new byte[this.field1688 * this.field1687];
        if (arg0 != 33964) {
            return;
        }
        int var3 = 0;
        for (int var4 = this.field1688 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field1687; var5++) {
                var2[var3++] = this.field1685[this.field1687 * var4 + var5];
            }
        }
        this.field1685 = var2;
        this.field1690 = this.field1692 - this.field1688 - this.field1690;
    }

    @OriginalMember(owner = "client!ZQSBFHWZ", name = "a", descriptor = "(IBII)V")
    public void method585(int arg0, byte arg1, int arg2, int arg3) {
        if (this.field1682 != arg1) {
            return;
        }
        boolean var5 = false;
        for (int var6 = 0; var6 < this.field1686.length; var6++) {
            int var7 = this.field1686[var6] >> 16 & 0xFF;
            int var8 = arg2 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field1686[var6] >> 8 & 0xFF;
            int var10 = arg0 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            int var11 = this.field1686[var6] & 0xFF;
            int var12 = arg3 + var11;
            if (var12 < 0) {
                var12 = 0;
            } else if (var12 > 255) {
                var12 = 255;
            }
            this.field1686[var6] = (var8 << 16) + (var10 << 8) + var12;
        }
    }

    @OriginalMember(owner = "client!ZQSBFHWZ", name = "a", descriptor = "(III)V")
    public void method586(int arg0, int arg1, int arg2) {
        int var4 = this.field1689 + arg1;
        int var5 = this.field1690 + arg2;
        int var6 = class21.field932 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1688;
        int var9 = this.field1687;
        int var10 = class21.field932 - var9;
        int var11 = 0;
        if (arg0 != -4899) {
            return;
        }
        if (var5 < class21.field934) {
            int var12 = class21.field934 - var5;
            var8 -= var12;
            var5 = class21.field934;
            var7 += var9 * var12;
            var6 += class21.field932 * var12;
        }
        if (var5 + var8 > class21.field935) {
            var8 -= var5 + var8 - class21.field935;
        }
        if (var4 < class21.field936) {
            int var13 = class21.field936 - var4;
            var9 -= var13;
            var4 = class21.field936;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class21.field937) {
            int var14 = var4 + var9 - class21.field937;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method587(var6, var7, class21.field931, this.field1685, var10, this.field1686, var11, false, var9, var8);
        }
    }

    @OriginalMember(owner = "client!ZQSBFHWZ", name = "a", descriptor = "(II[I[BI[IIZII)V")
    private void method587(int arg0, int arg1, int[] arg2, byte[] arg3, int arg4, int[] arg5, int arg6, boolean arg7, int arg8, int arg9) {
        int var11 = -(arg8 >> 2);
        if (arg7) {
            this.field1683 = 135;
        }
        int var12 = -(arg8 & 0x3);
        for (int var13 = -arg9; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg3[arg1++];
                if (var17 == 0) {
                    arg0++;
                } else {
                    arg2[arg0++] = arg5[var17 & 0xFF];
                }
                byte var18 = arg3[arg1++];
                if (var18 == 0) {
                    arg0++;
                } else {
                    arg2[arg0++] = arg5[var18 & 0xFF];
                }
                byte var19 = arg3[arg1++];
                if (var19 == 0) {
                    arg0++;
                } else {
                    arg2[arg0++] = arg5[var19 & 0xFF];
                }
                byte var20 = arg3[arg1++];
                if (var20 == 0) {
                    arg0++;
                } else {
                    arg2[arg0++] = arg5[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg3[arg1++];
                if (var16 == 0) {
                    arg0++;
                } else {
                    arg2[arg0++] = arg5[var16 & 0xFF];
                }
            }
            arg0 += arg4;
            arg1 += arg6;
        }
    }
}
