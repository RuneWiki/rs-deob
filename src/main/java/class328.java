import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class328 {

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public int field4776;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public int field4777;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public int field4779;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    public int field4780;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
    public int field4783;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
    public int field4784;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "[B")
    public byte[] field4778;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "[B")
    public byte[] field4781;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "[I")
    public int[] field4782;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "()V")
    public final void method1968() {
        int var1 = this.method1973();
        int var2 = this.method1981();
        if (this.field4776 == var1 && this.field4780 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field4781 == null) {
            for (int var9 = 0; var9 < this.field4780; var9++) {
                int var10 = this.field4776 * var9;
                int var11 = (this.field4784 + var9) * var1 + this.field4779;
                for (int var12 = 0; var12 < this.field4776; var12++) {
                    var3[var11++] = this.field4778[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field4780; var5++) {
                int var6 = this.field4776 * var5;
                int var7 = (this.field4784 + var5) * var1 + this.field4779;
                for (int var8 = 0; var8 < this.field4776; var8++) {
                    var3[var7] = this.field4778[var6];
                    var4[var7++] = this.field4781[var6++];
                }
            }
            this.field4781 = var4;
        }
        this.field4779 = this.field4777 = this.field4784 = this.field4783 = 0;
        this.field4776 = var1;
        this.field4780 = var2;
        this.field4778 = var3;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
    public final void method1969(int arg0) {
        int var2 = this.method1973();
        int var3 = this.method1981();
        if (this.field4776 == var2 && this.field4780 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field4779) {
            var4 = this.field4779;
        }
        int var5 = arg0;
        if (this.field4779 + arg0 + this.field4776 > var2) {
            var5 = var2 - this.field4779 - this.field4776;
        }
        int var6 = arg0;
        if (arg0 > this.field4784) {
            var6 = this.field4784;
        }
        int var7 = arg0;
        if (this.field4784 + arg0 + this.field4780 > var3) {
            var7 = var3 - this.field4784 - this.field4780;
        }
        int var8 = this.field4776 + var4 + var5;
        int var9 = this.field4780 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field4781 == null) {
            for (int var11 = 0; var11 < this.field4780; var11++) {
                int var12 = this.field4776 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field4776; var14++) {
                    var10[var13++] = this.field4778[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field4780; var16++) {
                int var17 = this.field4776 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field4776; var19++) {
                    var15[var18] = this.field4781[var17];
                    var10[var18++] = this.field4778[var17++];
                }
            }
            this.field4781 = var15;
        }
        this.field4779 -= var4;
        this.field4784 -= var6;
        this.field4777 -= var5;
        this.field4783 -= var7;
        this.field4776 = var8;
        this.field4780 = var9;
        this.field4778 = var10;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lhe;I)Lpi;")
    public static final class328 method1970(class239 arg0, int arg1) {
        byte[] var2 = arg0.method1465(0, arg1);
        return var2 == null ? null : method1975(var2)[0];
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "()V")
    public final void method1971() {
        byte[] var1 = this.field4778;
        if (this.field4781 == null) {
            for (int var2 = this.field4780 - 1; var2 >= 0; var2--) {
                int var3 = this.field4776 * var2;
                int var4 = (var2 + 1) * this.field4776;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field4781;
            for (int var7 = this.field4780 - 1; var7 >= 0; var7--) {
                int var9 = this.field4776 * var7;
                int var10 = (var7 + 1) * this.field4776;
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
        int var8 = this.field4779;
        this.field4779 = this.field4777;
        this.field4777 = var8;
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "()V")
    public final void method1972() {
        byte[] var1 = new byte[this.field4780 * this.field4776];
        int var2 = 0;
        if (this.field4781 == null) {
            for (int var3 = 0; var3 < this.field4776; var3++) {
                for (int var4 = this.field4780 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field4778[this.field4776 * var4 + var3];
                }
            }
            this.field4778 = var1;
        } else {
            byte[] var5 = new byte[this.field4780 * this.field4776];
            for (int var6 = 0; var6 < this.field4776; var6++) {
                for (int var9 = this.field4780 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field4778[this.field4776 * var9 + var6];
                    var5[var2++] = this.field4781[this.field4776 * var9 + var6];
                }
            }
            this.field4778 = var1;
            this.field4781 = var5;
        }
        int var7 = this.field4784;
        this.field4784 = this.field4779;
        this.field4779 = this.field4783;
        this.field4783 = this.field4777;
        this.field4777 = this.field4784;
        int var8 = this.field4780;
        this.field4780 = this.field4776;
        this.field4776 = var8;
    }

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "()I")
    public final int method1973() {
        return this.field4779 + this.field4776 + this.field4777;
    }

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "()[I")
    public final int[] method1974() {
        int var1 = this.method1973();
        int[] var2 = new int[var1 * this.method1981()];
        if (this.field4781 == null) {
            for (int var7 = 0; var7 < this.field4780; var7++) {
                int var8 = this.field4776 * var7;
                int var9 = (this.field4784 + var7) * var1 + this.field4779;
                for (int var10 = 0; var10 < this.field4776; var10++) {
                    int var11 = this.field4782[this.field4778[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field4780; var3++) {
                int var4 = this.field4776 * var3;
                int var5 = (this.field4784 + var3) * var1 + this.field4779;
                for (int var6 = 0; var6 < this.field4776; var6++) {
                    var2[var5++] = this.field4781[var4] << 24 | this.field4782[this.field4778[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "([B)[Lpi;")
    private static final class328[] method1975(byte[] arg0) {
        class156 var1 = new class156(arg0);
        var1.field2018 = arg0.length - 2;
        int var2 = var1.method993((byte) -91);
        class328[] var3 = new class328[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class328();
        }
        var1.field2018 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method993((byte) -77);
        int var6 = var1.method993((byte) -82);
        int var7 = (var1.method941((byte) 123) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field4779 = var1.method993((byte) -106);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field4784 = var1.method993((byte) -39);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field4776 = var1.method993((byte) -87);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field4780 = var1.method993((byte) -83);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class328 var32 = var3[var12];
            var32.field4777 = var5 - var32.field4776 - var32.field4779;
            var32.field4783 = var6 - var32.field4780 - var32.field4784;
        }
        var1.field2018 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method943(1295851312);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field4782 = var13;
        }
        var1.field2018 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class328 var17 = var3[var16];
            int var18 = var17.field4780 * var17.field4776;
            var17.field4778 = new byte[var18];
            int var19 = var1.method941((byte) 124);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field4781 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field4778[var24] = var1.method946(81);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field4781[var25] = var1.method946(115);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field4776; var27++) {
                        for (int var31 = 0; var31 < var17.field4780; var31++) {
                            var17.field4778[var17.field4776 * var31 + var27] = var1.method946(77);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field4776; var28++) {
                        for (int var29 = 0; var29 < var17.field4780; var29++) {
                            byte var30 = var17.field4781[var17.field4776 * var29 + var28] = var1.method946(102);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field4781 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field4778[var20] = var1.method946(50);
                }
            } else {
                for (int var21 = 0; var21 < var17.field4776; var21++) {
                    for (int var22 = 0; var22 < var17.field4780; var22++) {
                        var17.field4778[var17.field4776 * var22 + var21] = var1.method946(29);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lhe;II)[Lpi;")
    public static final class328[] method1976(class239 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1470(4, arg2, arg1);
        return var3 == null ? null : method1975(var3);
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)V")
    public final void method1977(int arg0) {
        int var2 = -1;
        if (this.field4782.length < 255) {
            for (int var3 = 0; var3 < this.field4782.length; var3++) {
                if (this.field4782[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field4782.length;
                int[] var4 = new int[this.field4782.length + 1];
                class268.method1641(this.field4782, 0, var4, 0, this.field4782.length);
                this.field4782 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field4782.length; var9++) {
                int var13 = this.field4782[var9];
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
        for (int var10 = this.field4780 - 1; var10 > 0; var10--) {
            int var11 = this.field4776 * var10;
            for (int var12 = this.field4776 - 1; var12 > 0; var12--) {
                if (this.field4782[this.field4778[var11 + var12] & 0xFF] == 0 && this.field4782[this.field4778[var11 + var12 - this.field4776 - 1] & 0xFF] != 0) {
                    this.field4778[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(Lhe;II)Lpi;")
    public static final class328 method1978(class239 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1470(4, arg2, arg1);
        return var3 == null ? null : method1975(var3)[0];
    }

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "()V")
    public final void method1979() {
        byte[] var1 = this.field4778;
        if (this.field4781 == null) {
            for (int var2 = (this.field4780 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field4776 * var2;
                int var4 = (this.field4780 - var2 - 1) * this.field4776;
                for (int var5 = -this.field4776; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field4781;
            for (int var8 = (this.field4780 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field4776 * var8;
                int var11 = (this.field4780 - var8 - 1) * this.field4776;
                for (int var12 = -this.field4776; var12 < 0; var12++) {
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
        int var9 = this.field4784;
        this.field4784 = this.field4783;
        this.field4783 = var9;
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(I)V")
    public final void method1980(int arg0) {
        int var2 = -1;
        if (this.field4782.length < 255) {
            for (int var3 = 0; var3 < this.field4782.length; var3++) {
                if (this.field4782[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field4782.length;
                int[] var4 = new int[this.field4782.length + 1];
                class268.method1641(this.field4782, 0, var4, 0, this.field4782.length);
                this.field4782 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field4782.length; var9++) {
                int var15 = this.field4782[var9];
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
        byte[] var11 = new byte[this.field4780 * this.field4776];
        for (int var12 = 0; var12 < this.field4780; var12++) {
            for (int var13 = 0; var13 < this.field4776; var13++) {
                int var14 = this.field4778[var10] & 0xFF;
                if (this.field4782[var14] == 0) {
                    if (var13 > 0 && this.field4782[this.field4778[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field4782[this.field4778[var10 - this.field4776] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field4776 - 1 && this.field4782[this.field4778[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field4780 - 1 && this.field4782[this.field4778[this.field4776 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field4778 = var11;
    }

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "()I")
    public final int method1981() {
        return this.field4784 + this.field4780 + this.field4783;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(Lhe;I)[Lpi;")
    public static final class328[] method1982(class239 arg0, int arg1) {
        byte[] var2 = arg0.method1465(0, arg1);
        return var2 == null ? null : method1975(var2);
    }
}
