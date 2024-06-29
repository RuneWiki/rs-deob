import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class129 {

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public int field1731;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public int field1733;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public int field1734;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    public int field1735;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    public int field1737;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
    public int field1739;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "[B")
    public byte[] field1736;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "[B")
    public byte[] field1738;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "[I")
    public int[] field1732;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "([B)[Lfg;", line = 5)
    private static final class129[] method908(byte[] arg0) {
        class645 var1 = new class645(arg0);
        var1.field9084 = arg0.length - 2;
        int var2 = var1.method3712((byte) 3);
        class129[] var3 = new class129[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class129();
        }
        var1.field9084 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method3712((byte) 6);
        int var6 = var1.method3712((byte) -121);
        int var7 = (var1.method3745(-6314) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field1735 = var1.method3712((byte) 40);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field1737 = var1.method3712((byte) -112);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field1734 = var1.method3712((byte) -125);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field1739 = var1.method3712((byte) -121);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class129 var32 = var3[var12];
            var32.field1731 = var5 - var32.field1734 - var32.field1735;
            var32.field1733 = var6 - var32.field1739 - var32.field1737;
        }
        var1.field9084 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method3747((byte) -74);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field1732 = var13;
        }
        var1.field9084 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class129 var17 = var3[var16];
            int var18 = var17.field1739 * var17.field1734;
            var17.field1738 = new byte[var18];
            int var19 = var1.method3745(-6314);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field1736 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field1738[var24] = var1.method3743(true);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field1736[var25] = var1.method3743(true);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field1734; var27++) {
                        for (int var31 = 0; var31 < var17.field1739; var31++) {
                            var17.field1738[var17.field1734 * var31 + var27] = var1.method3743(true);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field1734; var28++) {
                        for (int var29 = 0; var29 < var17.field1739; var29++) {
                            byte var30 = var17.field1736[var17.field1734 * var29 + var28] = var1.method3743(true);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field1736 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field1738[var20] = var1.method3743(true);
                }
            } else {
                for (int var21 = 0; var21 < var17.field1734; var21++) {
                    for (int var22 = 0; var22 < var17.field1739; var22++) {
                        var17.field1738[var17.field1734 * var22 + var21] = var1.method3743(true);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "()V", line = 212)
    public final void method909() {
        int var1 = this.method913();
        int var2 = this.method912();
        if (this.field1734 == var1 && this.field1739 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field1736 == null) {
            for (int var9 = 0; var9 < this.field1739; var9++) {
                int var10 = this.field1734 * var9;
                int var11 = (this.field1737 + var9) * var1 + this.field1735;
                for (int var12 = 0; var12 < this.field1734; var12++) {
                    var3[var11++] = this.field1738[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field1739; var5++) {
                int var6 = this.field1734 * var5;
                int var7 = (this.field1737 + var5) * var1 + this.field1735;
                for (int var8 = 0; var8 < this.field1734; var8++) {
                    var3[var7] = this.field1738[var6];
                    var4[var7++] = this.field1736[var6++];
                }
            }
            this.field1736 = var4;
        }
        this.field1735 = this.field1731 = this.field1737 = this.field1733 = 0;
        this.field1734 = var1;
        this.field1739 = var2;
        this.field1738 = var3;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "()V", line = 280)
    public final void method910() {
        byte[] var1 = new byte[this.field1739 * this.field1734];
        int var2 = 0;
        if (this.field1736 == null) {
            for (int var3 = 0; var3 < this.field1734; var3++) {
                for (int var4 = this.field1739 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field1738[this.field1734 * var4 + var3];
                }
            }
            this.field1738 = var1;
        } else {
            byte[] var5 = new byte[this.field1739 * this.field1734];
            for (int var6 = 0; var6 < this.field1734; var6++) {
                for (int var9 = this.field1739 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field1738[this.field1734 * var9 + var6];
                    var5[var2++] = this.field1736[this.field1734 * var9 + var6];
                }
            }
            this.field1738 = var1;
            this.field1736 = var5;
        }
        int var7 = this.field1737;
        this.field1737 = this.field1735;
        this.field1735 = this.field1733;
        this.field1733 = this.field1731;
        this.field1731 = this.field1737;
        int var8 = this.field1739;
        this.field1739 = this.field1734;
        this.field1734 = var8;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lvd;I)Lfg;", line = 340)
    public static final class129 method911(class39 arg0, int arg1) {
        byte[] var2 = arg0.method226(93, arg1);
        return var2 == null ? null : method908(var2)[0];
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "()I", line = 347)
    public final int method912() {
        return this.field1739 + this.field1737 + this.field1733;
    }

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "()I", line = 350)
    public final int method913() {
        return this.field1735 + this.field1734 + this.field1731;
    }

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "()V", line = 355)
    public final void method914() {
        byte[] var1 = this.field1738;
        if (this.field1736 == null) {
            for (int var2 = this.field1739 - 1; var2 >= 0; var2--) {
                int var3 = this.field1734 * var2;
                int var4 = (var2 + 1) * this.field1734;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field1736;
            for (int var7 = this.field1739 - 1; var7 >= 0; var7--) {
                int var9 = this.field1734 * var7;
                int var10 = (var7 + 1) * this.field1734;
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
        int var8 = this.field1735;
        this.field1735 = this.field1731;
        this.field1731 = var8;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V", line = 419)
    public final void method915(int arg0) {
        int var2 = -1;
        if (this.field1732.length < 255) {
            for (int var3 = 0; var3 < this.field1732.length; var3++) {
                if (this.field1732[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field1732.length;
                int[] var4 = new int[this.field1732.length + 1];
                class319.method2016(this.field1732, 0, var4, 0, this.field1732.length);
                this.field1732 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field1732.length; var9++) {
                int var15 = this.field1732[var9];
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
        byte[] var11 = new byte[this.field1739 * this.field1734];
        for (int var12 = 0; var12 < this.field1739; var12++) {
            for (int var13 = 0; var13 < this.field1734; var13++) {
                int var14 = this.field1738[var10] & 0xFF;
                if (this.field1732[var14] == 0) {
                    if (var13 > 0 && this.field1732[this.field1738[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field1732[this.field1738[var10 - this.field1734] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field1734 - 1 && this.field1732[this.field1738[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field1739 - 1 && this.field1732[this.field1738[this.field1734 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field1738 = var11;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V", line = 546)
    public final void method916(int arg0) {
        int var2 = -1;
        if (this.field1732.length < 255) {
            for (int var3 = 0; var3 < this.field1732.length; var3++) {
                if (this.field1732[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field1732.length;
                int[] var4 = new int[this.field1732.length + 1];
                class319.method2016(this.field1732, 0, var4, 0, this.field1732.length);
                this.field1732 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field1732.length; var9++) {
                int var13 = this.field1732[var9];
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
        for (int var10 = this.field1739 - 1; var10 > 0; var10--) {
            int var11 = this.field1734 * var10;
            for (int var12 = this.field1734 - 1; var12 > 0; var12--) {
                if (this.field1732[this.field1738[var11 + var12] & 0xFF] == 0 && this.field1732[this.field1738[var11 + var12 - this.field1734 - 1] & 0xFF] != 0) {
                    this.field1738[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "()V", line = 651)
    public final void method917() {
        byte[] var1 = this.field1738;
        if (this.field1736 == null) {
            for (int var2 = (this.field1739 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field1734 * var2;
                int var4 = (this.field1739 - var2 - 1) * this.field1734;
                for (int var5 = -this.field1734; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field1736;
            for (int var8 = (this.field1739 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field1734 * var8;
                int var11 = (this.field1739 - var8 - 1) * this.field1734;
                for (int var12 = -this.field1734; var12 < 0; var12++) {
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
        int var9 = this.field1737;
        this.field1737 = this.field1733;
        this.field1733 = var9;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(Lvd;I)[Lfg;", line = 724)
    public static final class129[] method918(class39 arg0, int arg1) {
        byte[] var2 = arg0.method226(40, arg1);
        return var2 == null ? null : method908(var2);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lvd;II)Lfg;", line = 732)
    public static final class129 method919(class39 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method211(true, arg1, arg2);
        return var3 == null ? null : method908(var3)[0];
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(Lvd;II)[Lfg;", line = 741)
    public static final class129[] method920(class39 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method211(true, arg1, arg2);
        return var3 == null ? null : method908(var3);
    }

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "()[I", line = 750)
    public final int[] method921() {
        int var1 = this.method913();
        int[] var2 = new int[var1 * this.method912()];
        if (this.field1736 == null) {
            for (int var7 = 0; var7 < this.field1739; var7++) {
                int var8 = this.field1734 * var7;
                int var9 = (this.field1737 + var7) * var1 + this.field1735;
                for (int var10 = 0; var10 < this.field1734; var10++) {
                    int var11 = this.field1732[this.field1738[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field1739; var3++) {
                int var4 = this.field1734 * var3;
                int var5 = (this.field1737 + var3) * var1 + this.field1735;
                for (int var6 = 0; var6 < this.field1734; var6++) {
                    var2[var5++] = this.field1736[var4] << 24 | this.field1732[this.field1738[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(I)V", line = 813)
    public final void method922(int arg0) {
        int var2 = this.method913();
        int var3 = this.method912();
        if (this.field1734 == var2 && this.field1739 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field1735) {
            var4 = this.field1735;
        }
        int var5 = arg0;
        if (this.field1735 + arg0 + this.field1734 > var2) {
            var5 = var2 - this.field1735 - this.field1734;
        }
        int var6 = arg0;
        if (arg0 > this.field1737) {
            var6 = this.field1737;
        }
        int var7 = arg0;
        if (this.field1737 + arg0 + this.field1739 > var3) {
            var7 = var3 - this.field1737 - this.field1739;
        }
        int var8 = this.field1734 + var4 + var5;
        int var9 = this.field1739 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field1736 == null) {
            for (int var11 = 0; var11 < this.field1739; var11++) {
                int var12 = this.field1734 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field1734; var14++) {
                    var10[var13++] = this.field1738[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field1739; var16++) {
                int var17 = this.field1734 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field1734; var19++) {
                    var15[var18] = this.field1736[var17];
                    var10[var18++] = this.field1738[var17++];
                }
            }
            this.field1736 = var15;
        }
        this.field1735 -= var4;
        this.field1737 -= var6;
        this.field1731 -= var5;
        this.field1733 -= var7;
        this.field1734 = var8;
        this.field1739 = var9;
        this.field1738 = var10;
    }
}
