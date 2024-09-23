import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XHDQQNIR")
public class class68 extends class53 {

    @OriginalMember(owner = "XHDQQNIR", name = "z", descriptor = "I")
    private int field1670 = 178;

    @OriginalMember(owner = "XHDQQNIR", name = "A", descriptor = "I")
    private int field1671 = -752;

    @OriginalMember(owner = "XHDQQNIR", name = "B", descriptor = "Z")
    private boolean field1672 = false;

    @OriginalMember(owner = "XHDQQNIR", name = "C", descriptor = "B")
    private byte field1673 = 5;

    @OriginalMember(owner = "XHDQQNIR", name = "D", descriptor = "I")
    private int field1674 = 18;

    @OriginalMember(owner = "XHDQQNIR", name = "K", descriptor = "I")
    public int field1681;

    @OriginalMember(owner = "XHDQQNIR", name = "L", descriptor = "I")
    public int field1682;

    @OriginalMember(owner = "XHDQQNIR", name = "F", descriptor = "[I")
    public int[] field1676;

    @OriginalMember(owner = "XHDQQNIR", name = "I", descriptor = "I")
    public int field1679;

    @OriginalMember(owner = "XHDQQNIR", name = "J", descriptor = "I")
    public int field1680;

    @OriginalMember(owner = "XHDQQNIR", name = "G", descriptor = "I")
    public int field1677;

    @OriginalMember(owner = "XHDQQNIR", name = "H", descriptor = "I")
    public int field1678;

    @OriginalMember(owner = "XHDQQNIR", name = "E", descriptor = "[B")
    public byte[] field1675;

    @OriginalMember(owner = "XHDQQNIR", name = "<init>", descriptor = "(LRVLWVPJQ;Ljava/lang/String;I)V")
    public class68(class50 arg0, String arg1, int arg2) {
        class55 var4 = new class55(741, arg0.method424(arg1 + ".dat", null));
        class55 var5 = new class55(741, arg0.method424("index.dat", null));
        var5.field1456 = var4.method457();
        this.field1681 = var5.method457();
        this.field1682 = var5.method457();
        int var6 = var5.method455();
        this.field1676 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field1676[var7 + 1] = var5.method459();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.field1456 += 2;
            var4.field1456 += var5.method457() * var5.method457();
            var5.field1456++;
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
        } else {
            if (var9 == 1) {
                for (int var12 = 0; var12 < this.field1677; var12++) {
                    for (int var13 = 0; var13 < this.field1678; var13++) {
                        this.field1675[this.field1677 * var13 + var12] = var4.method456();
                    }
                }
            }
            if (class40.field1193) {
            }
        }
    }

    @OriginalMember(owner = "XHDQQNIR", name = "c", descriptor = "(I)V")
    public void method550(int arg0) {
        this.field1681 /= 2;
        if (arg0 != 23483) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field1682 /= 2;
        byte[] var3 = new byte[this.field1682 * this.field1681];
        int var4 = 0;
        for (int var5 = 0; var5 < this.field1678; var5++) {
            for (int var6 = 0; var6 < this.field1677; var6++) {
                var3[(this.field1679 + var6 >> 1) + (this.field1680 + var5 >> 1) * this.field1681] = this.field1675[var4++];
            }
        }
        this.field1675 = var3;
        this.field1677 = this.field1681;
        this.field1678 = this.field1682;
        this.field1679 = 0;
        this.field1680 = 0;
    }

    @OriginalMember(owner = "XHDQQNIR", name = "d", descriptor = "(I)V")
    public void method551(int arg0) {
        if (this.field1681 == this.field1677 && this.field1682 == this.field1678) {
            return;
        }
        byte[] var2 = new byte[this.field1682 * this.field1681];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1678; var4++) {
            for (int var6 = 0; var6 < this.field1677; var6++) {
                var2[(this.field1680 + var4) * this.field1681 + this.field1679 + var6] = this.field1675[var3++];
            }
        }
        this.field1675 = var2;
        this.field1677 = this.field1681;
        this.field1678 = this.field1682;
        this.field1679 = 0;
        int var5 = 35 / arg0;
        this.field1680 = 0;
    }

    @OriginalMember(owner = "XHDQQNIR", name = "e", descriptor = "(I)V")
    public void method552(int arg0) {
        byte[] var2 = new byte[this.field1678 * this.field1677];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1678; var4++) {
            for (int var5 = this.field1677 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field1675[this.field1677 * var4 + var5];
            }
        }
        this.field1675 = var2;
        this.field1679 = this.field1681 - this.field1677 - this.field1679;
        if (arg0 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "XHDQQNIR", name = "a", descriptor = "(B)V")
    public void method553(byte arg0) {
        byte[] var2 = new byte[this.field1678 * this.field1677];
        int var3 = 0;
        if (arg0 != -104) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        for (int var5 = this.field1678 - 1; var5 >= 0; var5--) {
            for (int var6 = 0; var6 < this.field1677; var6++) {
                var2[var3++] = this.field1675[this.field1677 * var5 + var6];
            }
        }
        this.field1675 = var2;
        this.field1680 = this.field1682 - this.field1678 - this.field1680;
    }

    @OriginalMember(owner = "XHDQQNIR", name = "a", descriptor = "(IBII)V")
    public void method554(int arg0, byte arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field1676.length; var5++) {
            int var7 = this.field1676[var5] >> 16 & 0xFF;
            int var8 = arg3 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field1676[var5] >> 8 & 0xFF;
            int var10 = arg0 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            int var11 = this.field1676[var5] & 0xFF;
            int var12 = arg2 + var11;
            if (var12 < 0) {
                var12 = 0;
            } else if (var12 > 255) {
                var12 = 255;
            }
            this.field1676[var5] = (var8 << 16) + (var10 << 8) + var12;
        }
        if (arg1 != 85) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
    }

    @OriginalMember(owner = "XHDQQNIR", name = "a", descriptor = "(III)V")
    public void method555(int arg0, int arg1, int arg2) {
        int var4 = this.field1679 + arg0;
        int var5 = this.field1680 + arg1;
        int var6 = class53.field1372 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1678;
        int var9 = this.field1677;
        int var10 = class53.field1372 - var9;
        int var11 = 0;
        while (arg2 >= 0) {
            for (int var15 = 1; var15 > 0; var15++) {
            }
        }
        if (var5 < class53.field1374) {
            int var12 = class53.field1374 - var5;
            var8 -= var12;
            var5 = class53.field1374;
            var7 += var9 * var12;
            var6 += class53.field1372 * var12;
        }
        if (var5 + var8 > class53.field1375) {
            var8 -= var5 + var8 - class53.field1375;
        }
        if (var4 < class53.field1376) {
            int var13 = class53.field1376 - var4;
            var9 -= var13;
            var4 = class53.field1376;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class53.field1377) {
            int var14 = var4 + var9 - class53.field1377;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method556((byte) 7, var7, class53.field1371, var10, var11, this.field1675, var8, var9, var6, this.field1676);
        }
    }

    @OriginalMember(owner = "XHDQQNIR", name = "a", descriptor = "(BI[III[BIII[I)V")
    private void method556(byte arg0, int arg1, int[] arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8, int[] arg9) {
        if (arg0 == 7) {
            boolean var11 = false;
        } else {
            this.field1674 = -278;
        }
        int var12 = -(arg7 >> 2);
        int var13 = -(arg7 & 0x3);
        for (int var14 = -arg6; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                byte var18 = arg5[arg1++];
                if (var18 == 0) {
                    arg8++;
                } else {
                    arg2[arg8++] = arg9[var18 & 0xFF];
                }
                byte var19 = arg5[arg1++];
                if (var19 == 0) {
                    arg8++;
                } else {
                    arg2[arg8++] = arg9[var19 & 0xFF];
                }
                byte var20 = arg5[arg1++];
                if (var20 == 0) {
                    arg8++;
                } else {
                    arg2[arg8++] = arg9[var20 & 0xFF];
                }
                byte var21 = arg5[arg1++];
                if (var21 == 0) {
                    arg8++;
                } else {
                    arg2[arg8++] = arg9[var21 & 0xFF];
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                byte var17 = arg5[arg1++];
                if (var17 == 0) {
                    arg8++;
                } else {
                    arg2[arg8++] = arg9[var17 & 0xFF];
                }
            }
            arg8 += arg3;
            arg1 += arg4;
        }
    }
}
