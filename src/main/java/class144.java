import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class144 {

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "I")
    public int field1951;

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "I")
    public int field1952;

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "I")
    public int field1954;

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "I")
    public int field1955;

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "I")
    public int field1957;

    @OriginalMember(owner = "client!tr", name = "i", descriptor = "I")
    public int field1959;

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "[B")
    public byte[] field1953;

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "[B")
    public byte[] field1958;

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "[I")
    public int[] field1956;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "([B)[Ltr;", line = 4)
    private static final class144[] method989(byte[] arg0) {
        class256 var1 = new class256(arg0);
        var1.field3762 = arg0.length - 2;
        int var2 = var1.method1767(1930493576);
        class144[] var3 = new class144[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class144();
        }
        var1.field3762 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method1767(1930493576);
        int var6 = var1.method1767(1930493576);
        int var7 = (var1.method1738((byte) -81) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field1951 = var1.method1767(1930493576);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field1957 = var1.method1767(1930493576);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field1952 = var1.method1767(1930493576);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field1955 = var1.method1767(1930493576);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class144 var32 = var3[var12];
            var32.field1959 = var5 - var32.field1952 - var32.field1951;
            var32.field1954 = var6 - var32.field1955 - var32.field1957;
        }
        var1.field3762 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method1725((byte) 0);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field1956 = var13;
        }
        var1.field3762 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class144 var17 = var3[var16];
            int var18 = var17.field1955 * var17.field1952;
            var17.field1958 = new byte[var18];
            int var19 = var1.method1738((byte) -108);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field1953 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field1958[var24] = var1.method1728((byte) 111);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field1953[var25] = var1.method1728((byte) 84);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field1952; var27++) {
                        for (int var31 = 0; var31 < var17.field1955; var31++) {
                            var17.field1958[var17.field1952 * var31 + var27] = var1.method1728((byte) 112);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field1952; var28++) {
                        for (int var29 = 0; var29 < var17.field1955; var29++) {
                            byte var30 = var17.field1953[var17.field1952 * var29 + var28] = var1.method1728((byte) 88);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field1953 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field1958[var20] = var1.method1728((byte) 80);
                }
            } else {
                for (int var21 = 0; var21 < var17.field1952; var21++) {
                    for (int var22 = 0; var22 < var17.field1955; var22++) {
                        var17.field1958[var17.field1952 * var22 + var21] = var1.method1728((byte) 112);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "()V", line = 211)
    public final void method990() {
        byte[] var1 = new byte[this.field1955 * this.field1952];
        int var2 = 0;
        if (this.field1953 == null) {
            for (int var3 = 0; var3 < this.field1952; var3++) {
                for (int var4 = this.field1955 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field1958[this.field1952 * var4 + var3];
                }
            }
            this.field1958 = var1;
        } else {
            byte[] var5 = new byte[this.field1955 * this.field1952];
            for (int var6 = 0; var6 < this.field1952; var6++) {
                for (int var9 = this.field1955 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field1958[this.field1952 * var9 + var6];
                    var5[var2++] = this.field1953[this.field1952 * var9 + var6];
                }
            }
            this.field1958 = var1;
            this.field1953 = var5;
        }
        int var7 = this.field1957;
        this.field1957 = this.field1951;
        this.field1951 = this.field1954;
        this.field1954 = this.field1959;
        this.field1959 = this.field1957;
        int var8 = this.field1955;
        this.field1955 = this.field1952;
        this.field1952 = var8;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lct;II)Ltr;", line = 271)
    public static final class144 method991(class104 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method715(arg2, (byte) 45, arg1);
        return var3 == null ? null : method989(var3)[0];
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V", line = 280)
    public final void method992(int arg0) {
        int var2 = -1;
        if (this.field1956.length < 255) {
            for (int var3 = 0; var3 < this.field1956.length; var3++) {
                if (this.field1956[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field1956.length;
                int[] var4 = new int[this.field1956.length + 1];
                class224.method1541(this.field1956, 0, var4, 0, this.field1956.length);
                this.field1956 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field1956.length; var9++) {
                int var13 = this.field1956[var9];
                int var14 = var13 >> 16 & 0xFF;
                int var15 = var13 >> 8 & 0xFF;
                int var16 = var13 & 0xFF;
                int var17 = var6 - var14;
                if (var17 < 0) {
                    var17 = -var17;
                }
                int var18 = var7 - var15;
                if (var18 < 0) {
                    var18 = -var18;
                }
                int var19 = var8 - var16;
                if (var19 < 0) {
                    var19 = -var19;
                }
                int var20 = var17 + var18 + var19;
                if (var20 < var5) {
                    var5 = var20;
                    var2 = var9;
                }
            }
        }
        for (int var10 = this.field1955 - 1; var10 > 0; var10--) {
            int var11 = this.field1952 * var10;
            for (int var12 = this.field1952 - 1; var12 > 0; var12--) {
                if (this.field1956[this.field1958[var11 + var12] & 0xFF] == 0 && this.field1956[this.field1958[var11 + var12 - this.field1952 - 1] & 0xFF] != 0) {
                    this.field1958[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(Lct;II)[Ltr;", line = 384)
    public static final class144[] method993(class104 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method715(arg2, (byte) 98, arg1);
        return var3 == null ? null : method989(var3);
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lct;I)Ltr;", line = 395)
    public static final class144 method994(class104 arg0, int arg1) {
        byte[] var2 = arg0.method733(0, arg1);
        return var2 == null ? null : method989(var2)[0];
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(Lct;I)[Ltr;", line = 406)
    public static final class144[] method995(class104 arg0, int arg1) {
        byte[] var2 = arg0.method733(0, arg1);
        return var2 == null ? null : method989(var2);
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "()V", line = 415)
    public final void method996() {
        byte[] var1 = this.field1958;
        if (this.field1953 == null) {
            for (int var2 = this.field1955 - 1; var2 >= 0; var2--) {
                int var3 = this.field1952 * var2;
                int var4 = (var2 + 1) * this.field1952;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field1953;
            for (int var7 = this.field1955 - 1; var7 >= 0; var7--) {
                int var9 = this.field1952 * var7;
                int var10 = (var7 + 1) * this.field1952;
                while (var9 < var10) {
                    var10--;
                    byte var11 = var1[var9];
                    var1[var9] = var1[var10];
                    var1[var10] = var11;
                    byte var12 = var6[var9];
                    var6[var9] = var6[var10];
                    var6[var10] = var12;
                    var9++;
                }
            }
        }
        int var8 = this.field1951;
        this.field1951 = this.field1959;
        this.field1959 = var8;
    }

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "()V", line = 478)
    public final void method997() {
        byte[] var1 = this.field1958;
        if (this.field1953 == null) {
            for (int var2 = (this.field1955 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field1952 * var2;
                int var4 = (this.field1955 - var2 - 1) * this.field1952;
                for (int var5 = -this.field1952; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field1953;
            for (int var8 = (this.field1955 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field1952 * var8;
                int var11 = (this.field1955 - var8 - 1) * this.field1952;
                for (int var12 = -this.field1952; var12 < 0; var12++) {
                    byte var13 = var1[var10];
                    var1[var10] = var1[var11];
                    var1[var11] = var13;
                    byte var14 = var7[var10];
                    var7[var10] = var7[var11];
                    var7[var11] = var14;
                    var10++;
                    var11++;
                }
            }
        }
        int var9 = this.field1957;
        this.field1957 = this.field1954;
        this.field1954 = var9;
    }

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "()I", line = 547)
    public final int method998() {
        return this.field1952 + this.field1951 + this.field1959;
    }

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "()[I", line = 553)
    public final int[] method999() {
        int var1 = this.method998();
        int[] var2 = new int[var1 * this.method1002()];
        if (this.field1953 == null) {
            for (int var7 = 0; var7 < this.field1955; var7++) {
                int var8 = this.field1952 * var7;
                int var9 = (this.field1957 + var7) * var1 + this.field1951;
                for (int var10 = 0; var10 < this.field1952; var10++) {
                    int var11 = this.field1956[this.field1958[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field1955; var3++) {
                int var4 = this.field1952 * var3;
                int var5 = (this.field1957 + var3) * var1 + this.field1951;
                for (int var6 = 0; var6 < this.field1952; var6++) {
                    var2[var5++] = this.field1953[var4] << 24 | this.field1956[this.field1958[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(I)V", line = 616)
    public final void method1000(int arg0) {
        int var2 = this.method998();
        int var3 = this.method1002();
        if (this.field1952 == var2 && this.field1955 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field1951) {
            var4 = this.field1951;
        }
        int var5 = arg0;
        if (this.field1951 + arg0 + this.field1952 > var2) {
            var5 = var2 - this.field1951 - this.field1952;
        }
        int var6 = arg0;
        if (arg0 > this.field1957) {
            var6 = this.field1957;
        }
        int var7 = arg0;
        if (this.field1957 + arg0 + this.field1955 > var3) {
            var7 = var3 - this.field1957 - this.field1955;
        }
        int var8 = this.field1952 + var4 + var5;
        int var9 = this.field1955 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field1953 == null) {
            for (int var11 = 0; var11 < this.field1955; var11++) {
                int var12 = this.field1952 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field1952; var14++) {
                    var10[var13++] = this.field1958[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field1955; var16++) {
                int var17 = this.field1952 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field1952; var19++) {
                    var15[var18] = this.field1953[var17];
                    var10[var18++] = this.field1958[var17++];
                }
            }
            this.field1953 = var15;
        }
        this.field1951 -= var4;
        this.field1957 -= var6;
        this.field1959 -= var5;
        this.field1954 -= var7;
        this.field1952 = var8;
        this.field1955 = var9;
        this.field1958 = var10;
    }

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "(I)V", line = 715)
    public final void method1001(int arg0) {
        int var2 = -1;
        if (this.field1956.length < 255) {
            for (int var3 = 0; var3 < this.field1956.length; var3++) {
                if (this.field1956[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field1956.length;
                int[] var4 = new int[this.field1956.length + 1];
                class224.method1541(this.field1956, 0, var4, 0, this.field1956.length);
                this.field1956 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field1956.length; var9++) {
                int var15 = this.field1956[var9];
                int var16 = var15 >> 16 & 0xFF;
                int var17 = var15 >> 8 & 0xFF;
                int var18 = var15 & 0xFF;
                int var19 = var6 - var16;
                if (var19 < 0) {
                    var19 = -var19;
                }
                int var20 = var7 - var17;
                if (var20 < 0) {
                    var20 = -var20;
                }
                int var21 = var8 - var18;
                if (var21 < 0) {
                    var21 = -var21;
                }
                int var22 = var19 + var20 + var21;
                if (var22 < var5) {
                    var5 = var22;
                    var2 = var9;
                }
            }
        }
        int var10 = 0;
        byte[] var11 = new byte[this.field1955 * this.field1952];
        for (int var12 = 0; var12 < this.field1955; var12++) {
            for (int var13 = 0; var13 < this.field1952; var13++) {
                int var14 = this.field1958[var10] & 0xFF;
                if (this.field1956[var14] == 0) {
                    if (var13 > 0 && this.field1956[this.field1958[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field1956[this.field1958[var10 - this.field1952] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field1952 - 1 && this.field1956[this.field1958[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field1955 - 1 && this.field1956[this.field1958[this.field1952 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field1958 = var11;
    }

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "()I", line = 839)
    public final int method1002() {
        return this.field1957 + this.field1955 + this.field1954;
    }

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "()V", line = 843)
    public final void method1003() {
        int var1 = this.method998();
        int var2 = this.method1002();
        if (this.field1952 == var1 && this.field1955 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field1953 == null) {
            for (int var9 = 0; var9 < this.field1955; var9++) {
                int var10 = this.field1952 * var9;
                int var11 = (this.field1957 + var9) * var1 + this.field1951;
                for (int var12 = 0; var12 < this.field1952; var12++) {
                    var3[var11++] = this.field1958[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field1955; var5++) {
                int var6 = this.field1952 * var5;
                int var7 = (this.field1957 + var5) * var1 + this.field1951;
                for (int var8 = 0; var8 < this.field1952; var8++) {
                    var3[var7] = this.field1958[var6];
                    var4[var7++] = this.field1953[var6++];
                }
            }
            this.field1953 = var4;
        }
        this.field1951 = this.field1959 = this.field1957 = this.field1954 = 0;
        this.field1952 = var1;
        this.field1955 = var2;
        this.field1958 = var3;
    }
}
