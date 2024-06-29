import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class104 {

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
    public int field1590;

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "I")
    public int field1591;

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "I")
    public int field1592;

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "I")
    public int field1593;

    @OriginalMember(owner = "client!ho", name = "h", descriptor = "I")
    public int field1594;

    @OriginalMember(owner = "client!ho", name = "i", descriptor = "I")
    public int field1595;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "[B")
    public byte[] field1587;

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "[B")
    public byte[] field1589;

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "[I")
    public int[] field1588;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "()[I", line = 5)
    public final int[] method754() {
        int var1 = this.method766();
        int[] var2 = new int[var1 * this.method768()];
        if (this.field1589 == null) {
            for (int var7 = 0; var7 < this.field1594; var7++) {
                int var8 = this.field1590 * var7;
                int var9 = (this.field1595 + var7) * var1 + this.field1592;
                for (int var10 = 0; var10 < this.field1590; var10++) {
                    int var11 = this.field1588[this.field1587[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field1594; var3++) {
                int var4 = this.field1590 * var3;
                int var5 = (this.field1595 + var3) * var1 + this.field1592;
                for (int var6 = 0; var6 < this.field1590; var6++) {
                    var2[var5++] = this.field1589[var4] << 24 | this.field1588[this.field1587[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "()V", line = 70)
    public final void method755() {
        byte[] var1 = this.field1587;
        if (this.field1589 == null) {
            for (int var2 = this.field1594 - 1; var2 >= 0; var2--) {
                int var3 = this.field1590 * var2;
                int var4 = (var2 + 1) * this.field1590;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field1589;
            for (int var7 = this.field1594 - 1; var7 >= 0; var7--) {
                int var9 = this.field1590 * var7;
                int var10 = (var7 + 1) * this.field1590;
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
        int var8 = this.field1592;
        this.field1592 = this.field1593;
        this.field1593 = var8;
    }

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "()V", line = 136)
    public final void method756() {
        byte[] var1 = this.field1587;
        if (this.field1589 == null) {
            for (int var2 = (this.field1594 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field1590 * var2;
                int var4 = (this.field1594 - var2 - 1) * this.field1590;
                for (int var5 = -this.field1590; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field1589;
            for (int var8 = (this.field1594 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field1590 * var8;
                int var11 = (this.field1594 - var8 - 1) * this.field1590;
                for (int var12 = -this.field1590; var12 < 0; var12++) {
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
        int var9 = this.field1595;
        this.field1595 = this.field1591;
        this.field1591 = var9;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lci;I)[Lho;", line = 206)
    public static final class104[] method757(class320 arg0, int arg1) {
        byte[] var2 = arg0.method2029(arg1, false);
        return var2 == null ? null : method764(var2);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V", line = 214)
    public final void method758(int arg0) {
        int var2 = -1;
        if (this.field1588.length < 255) {
            for (int var3 = 0; var3 < this.field1588.length; var3++) {
                if (this.field1588[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field1588.length;
                int[] var4 = new int[this.field1588.length + 1];
                class282.method1824(this.field1588, 0, var4, 0, this.field1588.length);
                this.field1588 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field1588.length; var9++) {
                int var13 = this.field1588[var9];
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
        for (int var10 = this.field1594 - 1; var10 > 0; var10--) {
            int var11 = this.field1590 * var10;
            for (int var12 = this.field1590 - 1; var12 > 0; var12--) {
                if (this.field1588[this.field1587[var11 + var12] & 0xFF] == 0 && this.field1588[this.field1587[var11 + var12 - this.field1590 - 1] & 0xFF] != 0) {
                    this.field1587[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "()V", line = 319)
    public final void method759() {
        byte[] var1 = new byte[this.field1594 * this.field1590];
        int var2 = 0;
        if (this.field1589 == null) {
            for (int var3 = 0; var3 < this.field1590; var3++) {
                for (int var4 = this.field1594 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field1587[this.field1590 * var4 + var3];
                }
            }
            this.field1587 = var1;
        } else {
            byte[] var5 = new byte[this.field1594 * this.field1590];
            for (int var6 = 0; var6 < this.field1590; var6++) {
                for (int var9 = this.field1594 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field1587[this.field1590 * var9 + var6];
                    var5[var2++] = this.field1589[this.field1590 * var9 + var6];
                }
            }
            this.field1587 = var1;
            this.field1589 = var5;
        }
        int var7 = this.field1595;
        this.field1595 = this.field1592;
        this.field1592 = this.field1591;
        this.field1591 = this.field1593;
        this.field1593 = this.field1595;
        int var8 = this.field1594;
        this.field1594 = this.field1590;
        this.field1590 = var8;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lci;II)[Lho;", line = 379)
    public static final class104[] method760(class320 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2037(arg2, (byte) -111, arg1);
        return var3 == null ? null : method764(var3);
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)V", line = 387)
    public final void method761(int arg0) {
        int var2 = -1;
        if (this.field1588.length < 255) {
            for (int var3 = 0; var3 < this.field1588.length; var3++) {
                if (this.field1588[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field1588.length;
                int[] var4 = new int[this.field1588.length + 1];
                class282.method1824(this.field1588, 0, var4, 0, this.field1588.length);
                this.field1588 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field1588.length; var9++) {
                int var15 = this.field1588[var9];
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
        byte[] var11 = new byte[this.field1594 * this.field1590];
        for (int var12 = 0; var12 < this.field1594; var12++) {
            for (int var13 = 0; var13 < this.field1590; var13++) {
                int var14 = this.field1587[var10] & 0xFF;
                if (this.field1588[var14] == 0) {
                    if (var13 > 0 && this.field1588[this.field1587[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field1588[this.field1587[var10 - this.field1590] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field1590 - 1 && this.field1588[this.field1587[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field1594 - 1 && this.field1588[this.field1587[this.field1590 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field1587 = var11;
    }

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "(I)V", line = 513)
    public final void method762(int arg0) {
        int var2 = this.method766();
        int var3 = this.method768();
        if (this.field1590 == var2 && this.field1594 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field1592) {
            var4 = this.field1592;
        }
        int var5 = arg0;
        if (this.field1592 + arg0 + this.field1590 > var2) {
            var5 = var2 - this.field1592 - this.field1590;
        }
        int var6 = arg0;
        if (arg0 > this.field1595) {
            var6 = this.field1595;
        }
        int var7 = arg0;
        if (this.field1595 + arg0 + this.field1594 > var3) {
            var7 = var3 - this.field1595 - this.field1594;
        }
        int var8 = this.field1590 + var4 + var5;
        int var9 = this.field1594 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field1589 == null) {
            for (int var11 = 0; var11 < this.field1594; var11++) {
                int var12 = this.field1590 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field1590; var14++) {
                    var10[var13++] = this.field1587[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field1594; var16++) {
                int var17 = this.field1590 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field1590; var19++) {
                    var15[var18] = this.field1589[var17];
                    var10[var18++] = this.field1587[var17++];
                }
            }
            this.field1589 = var15;
        }
        this.field1592 -= var4;
        this.field1595 -= var6;
        this.field1593 -= var5;
        this.field1591 -= var7;
        this.field1590 = var8;
        this.field1594 = var9;
        this.field1587 = var10;
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(Lci;I)Lho;", line = 608)
    public static final class104 method763(class320 arg0, int arg1) {
        byte[] var2 = arg0.method2029(arg1, false);
        return var2 == null ? null : method764(var2)[0];
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "([B)[Lho;", line = 616)
    private static final class104[] method764(byte[] arg0) {
        class519 var1 = new class519(arg0);
        var1.field7558 = arg0.length - 2;
        int var2 = var1.method3018(566990904);
        class104[] var3 = new class104[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class104();
        }
        var1.field7558 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method3018(566990904);
        int var6 = var1.method3018(566990904);
        int var7 = (var1.method3072((byte) -127) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field1592 = var1.method3018(566990904);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field1595 = var1.method3018(566990904);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field1590 = var1.method3018(566990904);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field1594 = var1.method3018(566990904);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class104 var32 = var3[var12];
            var32.field1593 = var5 - var32.field1590 - var32.field1592;
            var32.field1591 = var6 - var32.field1594 - var32.field1595;
        }
        var1.field7558 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method3040((byte) -3);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field1588 = var13;
        }
        var1.field7558 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class104 var17 = var3[var16];
            int var18 = var17.field1594 * var17.field1590;
            var17.field1587 = new byte[var18];
            int var19 = var1.method3072((byte) -123);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field1589 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field1587[var24] = var1.method3034((byte) -40);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field1589[var25] = var1.method3034((byte) -47);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field1590; var27++) {
                        for (int var31 = 0; var31 < var17.field1594; var31++) {
                            var17.field1587[var17.field1590 * var31 + var27] = var1.method3034((byte) 116);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field1590; var28++) {
                        for (int var29 = 0; var29 < var17.field1594; var29++) {
                            byte var30 = var17.field1589[var17.field1590 * var29 + var28] = var1.method3034((byte) 91);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field1589 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field1587[var20] = var1.method3034((byte) -86);
                }
            } else {
                for (int var21 = 0; var21 < var17.field1590; var21++) {
                    for (int var22 = 0; var22 < var17.field1594; var22++) {
                        var17.field1587[var17.field1590 * var22 + var21] = var1.method3034((byte) 96);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "()V", line = 825)
    public final void method765() {
        int var1 = this.method766();
        int var2 = this.method768();
        if (this.field1590 == var1 && this.field1594 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field1589 == null) {
            for (int var9 = 0; var9 < this.field1594; var9++) {
                int var10 = this.field1590 * var9;
                int var11 = (this.field1595 + var9) * var1 + this.field1592;
                for (int var12 = 0; var12 < this.field1590; var12++) {
                    var3[var11++] = this.field1587[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field1594; var5++) {
                int var6 = this.field1590 * var5;
                int var7 = (this.field1595 + var5) * var1 + this.field1592;
                for (int var8 = 0; var8 < this.field1590; var8++) {
                    var3[var7] = this.field1587[var6];
                    var4[var7++] = this.field1589[var6++];
                }
            }
            this.field1589 = var4;
        }
        this.field1592 = this.field1593 = this.field1595 = this.field1591 = 0;
        this.field1590 = var1;
        this.field1594 = var2;
        this.field1587 = var3;
    }

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "()I", line = 892)
    public final int method766() {
        return this.field1592 + this.field1590 + this.field1593;
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(Lci;II)Lho;", line = 896)
    public static final class104 method767(class320 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2037(arg2, (byte) -123, arg1);
        return var3 == null ? null : method764(var3)[0];
    }

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "()I", line = 909)
    public final int method768() {
        return this.field1595 + this.field1594 + this.field1591;
    }
}
