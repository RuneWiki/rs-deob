import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class309 {

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "I")
    public int field4710;

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "I")
    public int field4712;

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "I")
    public int field4713;

    @OriginalMember(owner = "client!rr", name = "f", descriptor = "I")
    public int field4714;

    @OriginalMember(owner = "client!rr", name = "h", descriptor = "I")
    public int field4716;

    @OriginalMember(owner = "client!rr", name = "i", descriptor = "I")
    public int field4717;

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "[B")
    public byte[] field4711;

    @OriginalMember(owner = "client!rr", name = "g", descriptor = "[B")
    public byte[] field4715;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "[I")
    public int[] field4709;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lum;I)Lrr;", line = 4)
    public static final class309 method2031(class83 arg0, int arg1) {
        byte[] var2 = arg0.method735(arg1, 0);
        return var2 == null ? null : method2039(var2)[0];
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "()I", line = 14)
    public final int method2032() {
        return this.field4717 + this.field4712 + this.field4710;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)V", line = 18)
    public final void method2033(int arg0) {
        int var2 = -1;
        if (this.field4709.length < 255) {
            for (int var3 = 0; var3 < this.field4709.length; var3++) {
                if (this.field4709[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field4709.length;
                int[] var4 = new int[this.field4709.length + 1];
                class325.method2132(this.field4709, 0, var4, 0, this.field4709.length);
                this.field4709 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field4709.length; var9++) {
                int var13 = this.field4709[var9];
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
        for (int var10 = this.field4717 - 1; var10 > 0; var10--) {
            int var11 = this.field4713 * var10;
            for (int var12 = this.field4713 - 1; var12 > 0; var12--) {
                if (this.field4709[this.field4711[var11 + var12] & 0xFF] == 0 && this.field4709[this.field4711[var11 + var12 - this.field4713 - 1] & 0xFF] != 0) {
                    this.field4711[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)V", line = 122)
    public final void method2034(int arg0) {
        int var2 = -1;
        if (this.field4709.length < 255) {
            for (int var3 = 0; var3 < this.field4709.length; var3++) {
                if (this.field4709[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field4709.length;
                int[] var4 = new int[this.field4709.length + 1];
                class325.method2132(this.field4709, 0, var4, 0, this.field4709.length);
                this.field4709 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field4709.length; var9++) {
                int var15 = this.field4709[var9];
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
        byte[] var11 = new byte[this.field4717 * this.field4713];
        for (int var12 = 0; var12 < this.field4717; var12++) {
            for (int var13 = 0; var13 < this.field4713; var13++) {
                int var14 = this.field4711[var10] & 0xFF;
                if (this.field4709[var14] == 0) {
                    if (var13 > 0 && this.field4709[this.field4711[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field4709[this.field4711[var10 - this.field4713] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field4713 - 1 && this.field4709[this.field4711[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field4717 - 1 && this.field4709[this.field4711[this.field4713 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field4711 = var11;
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(I)V", line = 247)
    public final void method2035(int arg0) {
        int var2 = this.method2043();
        int var3 = this.method2032();
        if (this.field4713 == var2 && this.field4717 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field4716) {
            var4 = this.field4716;
        }
        int var5 = arg0;
        if (this.field4716 + arg0 + this.field4713 > var2) {
            var5 = var2 - this.field4716 - this.field4713;
        }
        int var6 = arg0;
        if (arg0 > this.field4712) {
            var6 = this.field4712;
        }
        int var7 = arg0;
        if (this.field4712 + arg0 + this.field4717 > var3) {
            var7 = var3 - this.field4712 - this.field4717;
        }
        int var8 = this.field4713 + var4 + var5;
        int var9 = this.field4717 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field4715 == null) {
            for (int var11 = 0; var11 < this.field4717; var11++) {
                int var12 = this.field4713 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field4713; var14++) {
                    var10[var13++] = this.field4711[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field4717; var16++) {
                int var17 = this.field4713 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field4713; var19++) {
                    var15[var18] = this.field4715[var17];
                    var10[var18++] = this.field4711[var17++];
                }
            }
            this.field4715 = var15;
        }
        this.field4716 -= var4;
        this.field4712 -= var6;
        this.field4714 -= var5;
        this.field4710 -= var7;
        this.field4713 = var8;
        this.field4717 = var9;
        this.field4711 = var10;
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(Lum;I)[Lrr;", line = 342)
    public static final class309[] method2036(class83 arg0, int arg1) {
        byte[] var2 = arg0.method735(arg1, 0);
        return var2 == null ? null : method2039(var2);
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "()V", line = 351)
    public final void method2037() {
        byte[] var1 = new byte[this.field4717 * this.field4713];
        int var2 = 0;
        if (this.field4715 == null) {
            for (int var3 = 0; var3 < this.field4713; var3++) {
                for (int var4 = this.field4717 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field4711[this.field4713 * var4 + var3];
                }
            }
            this.field4711 = var1;
        } else {
            byte[] var5 = new byte[this.field4717 * this.field4713];
            for (int var6 = 0; var6 < this.field4713; var6++) {
                for (int var9 = this.field4717 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field4711[this.field4713 * var9 + var6];
                    var5[var2++] = this.field4715[this.field4713 * var9 + var6];
                }
            }
            this.field4711 = var1;
            this.field4715 = var5;
        }
        int var7 = this.field4712;
        this.field4712 = this.field4716;
        this.field4716 = this.field4710;
        this.field4710 = this.field4714;
        this.field4714 = this.field4712;
        int var8 = this.field4717;
        this.field4717 = this.field4713;
        this.field4713 = var8;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lum;II)Lrr;", line = 411)
    public static final class309 method2038(class83 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method731(0, arg2, arg1);
        return var3 == null ? null : method2039(var3)[0];
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "([B)[Lrr;", line = 421)
    private static final class309[] method2039(byte[] arg0) {
        class194 var1 = new class194(arg0);
        var1.field2982 = arg0.length - 2;
        int var2 = var1.method1396(27);
        class309[] var3 = new class309[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class309();
        }
        var1.field2982 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method1396(108);
        int var6 = var1.method1396(-96);
        int var7 = (var1.method1337((byte) -118) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field4716 = var1.method1396(61);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field4712 = var1.method1396(-114);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field4713 = var1.method1396(-91);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field4717 = var1.method1396(-82);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class309 var32 = var3[var12];
            var32.field4714 = var5 - var32.field4713 - var32.field4716;
            var32.field4710 = var6 - var32.field4717 - var32.field4712;
        }
        var1.field2982 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method1339(-32768);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field4709 = var13;
        }
        var1.field2982 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class309 var17 = var3[var16];
            int var18 = var17.field4717 * var17.field4713;
            var17.field4711 = new byte[var18];
            int var19 = var1.method1337((byte) 75);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field4715 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field4711[var24] = var1.method1398(10);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field4715[var25] = var1.method1398(42);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field4713; var27++) {
                        for (int var31 = 0; var31 < var17.field4717; var31++) {
                            var17.field4711[var17.field4713 * var31 + var27] = var1.method1398(26);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field4713; var28++) {
                        for (int var29 = 0; var29 < var17.field4717; var29++) {
                            byte var30 = var17.field4715[var17.field4713 * var29 + var28] = var1.method1398(62);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field4715 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field4711[var20] = var1.method1398(127);
                }
            } else {
                for (int var21 = 0; var21 < var17.field4713; var21++) {
                    for (int var22 = 0; var22 < var17.field4717; var22++) {
                        var17.field4711[var17.field4713 * var22 + var21] = var1.method1398(32);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "()V", line = 629)
    public final void method2040() {
        byte[] var1 = this.field4711;
        if (this.field4715 == null) {
            for (int var2 = this.field4717 - 1; var2 >= 0; var2--) {
                int var3 = this.field4713 * var2;
                int var4 = (var2 + 1) * this.field4713;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field4715;
            for (int var7 = this.field4717 - 1; var7 >= 0; var7--) {
                int var9 = this.field4713 * var7;
                int var10 = (var7 + 1) * this.field4713;
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
        int var8 = this.field4716;
        this.field4716 = this.field4714;
        this.field4714 = var8;
    }

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "()V", line = 691)
    public final void method2041() {
        int var1 = this.method2043();
        int var2 = this.method2032();
        if (this.field4713 == var1 && this.field4717 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field4715 == null) {
            for (int var9 = 0; var9 < this.field4717; var9++) {
                int var10 = this.field4713 * var9;
                int var11 = (this.field4712 + var9) * var1 + this.field4716;
                for (int var12 = 0; var12 < this.field4713; var12++) {
                    var3[var11++] = this.field4711[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field4717; var5++) {
                int var6 = this.field4713 * var5;
                int var7 = (this.field4712 + var5) * var1 + this.field4716;
                for (int var8 = 0; var8 < this.field4713; var8++) {
                    var3[var7] = this.field4711[var6];
                    var4[var7++] = this.field4715[var6++];
                }
            }
            this.field4715 = var4;
        }
        this.field4716 = this.field4714 = this.field4712 = this.field4710 = 0;
        this.field4713 = var1;
        this.field4717 = var2;
        this.field4711 = var3;
    }

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "()[I", line = 759)
    public final int[] method2042() {
        int var1 = this.method2043();
        int[] var2 = new int[var1 * this.method2032()];
        if (this.field4715 == null) {
            for (int var7 = 0; var7 < this.field4717; var7++) {
                int var8 = this.field4713 * var7;
                int var9 = (this.field4712 + var7) * var1 + this.field4716;
                for (int var10 = 0; var10 < this.field4713; var10++) {
                    int var11 = this.field4709[this.field4711[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field4717; var3++) {
                int var4 = this.field4713 * var3;
                int var5 = (this.field4712 + var3) * var1 + this.field4716;
                for (int var6 = 0; var6 < this.field4713; var6++) {
                    var2[var5++] = this.field4715[var4] << 24 | this.field4709[this.field4711[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!rr", name = "f", descriptor = "()I", line = 824)
    public final int method2043() {
        return this.field4716 + this.field4713 + this.field4714;
    }

    @OriginalMember(owner = "client!rr", name = "g", descriptor = "()V", line = 831)
    public final void method2044() {
        byte[] var1 = this.field4711;
        if (this.field4715 == null) {
            for (int var2 = (this.field4717 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field4713 * var2;
                int var4 = (this.field4717 - var2 - 1) * this.field4713;
                for (int var5 = -this.field4713; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field4715;
            for (int var8 = (this.field4717 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field4713 * var8;
                int var11 = (this.field4717 - var8 - 1) * this.field4713;
                for (int var12 = -this.field4713; var12 < 0; var12++) {
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
        int var9 = this.field4712;
        this.field4712 = this.field4710;
        this.field4710 = var9;
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(Lum;II)[Lrr;", line = 901)
    public static final class309[] method2045(class83 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method731(0, arg2, arg1);
        return var3 == null ? null : method2039(var3);
    }
}
