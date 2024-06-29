import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public class class320 {

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "I")
    public int field4120;

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "I")
    public int field4121;

    @OriginalMember(owner = "client!tba", name = "c", descriptor = "I")
    public int field4122;

    @OriginalMember(owner = "client!tba", name = "d", descriptor = "I")
    public int field4123;

    @OriginalMember(owner = "client!tba", name = "g", descriptor = "I")
    public int field4126;

    @OriginalMember(owner = "client!tba", name = "h", descriptor = "I")
    public int field4127;

    @OriginalMember(owner = "client!tba", name = "e", descriptor = "[B")
    public byte[] field4124;

    @OriginalMember(owner = "client!tba", name = "f", descriptor = "[B")
    public byte[] field4125;

    @OriginalMember(owner = "client!tba", name = "i", descriptor = "[I")
    public int[] field4128;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "()V")
    public final void method1859() {
        int var1 = this.method1866();
        int var2 = this.method1863();
        if (this.field4122 == var1 && this.field4121 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field4124 == null) {
            for (int var9 = 0; var9 < this.field4121; var9++) {
                int var10 = this.field4122 * var9;
                int var11 = (this.field4123 + var9) * var1 + this.field4127;
                for (int var12 = 0; var12 < this.field4122; var12++) {
                    var3[var11++] = this.field4125[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field4121; var5++) {
                int var6 = this.field4122 * var5;
                int var7 = (this.field4123 + var5) * var1 + this.field4127;
                for (int var8 = 0; var8 < this.field4122; var8++) {
                    var3[var7] = this.field4125[var6];
                    var4[var7++] = this.field4124[var6++];
                }
            }
            this.field4124 = var4;
        }
        this.field4127 = this.field4126 = this.field4123 = this.field4120 = 0;
        this.field4122 = var1;
        this.field4121 = var2;
        this.field4125 = var3;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Lwu;II)[Ltba;")
    public static final class320[] method1860(class557 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3322(arg1, arg2, (byte) 107);
        return var3 == null ? null : method1868(var3);
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Lwu;I)Ltba;")
    public static final class320 method1861(class557 arg0, int arg1) {
        byte[] var2 = arg0.method3318(8941, arg1);
        return var2 == null ? null : method1868(var2)[0];
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(I)V")
    public final void method1862(int arg0) {
        int var2 = -1;
        if (this.field4128.length < 255) {
            for (int var3 = 0; var3 < this.field4128.length; var3++) {
                if (this.field4128[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field4128.length;
                int[] var4 = new int[this.field4128.length + 1];
                class34.method244(this.field4128, 0, var4, 0, this.field4128.length);
                this.field4128 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field4128.length; var9++) {
                int var15 = this.field4128[var9];
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
        byte[] var11 = new byte[this.field4122 * this.field4121];
        for (int var12 = 0; var12 < this.field4121; var12++) {
            for (int var13 = 0; var13 < this.field4122; var13++) {
                int var14 = this.field4125[var10] & 0xFF;
                if (this.field4128[var14] == 0) {
                    if (var13 > 0 && this.field4128[this.field4125[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field4128[this.field4125[var10 - this.field4122] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field4122 - 1 && this.field4128[this.field4125[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field4121 - 1 && this.field4128[this.field4125[this.field4122 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field4125 = var11;
    }

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "()I")
    public final int method1863() {
        return this.field4123 + this.field4121 + this.field4120;
    }

    @OriginalMember(owner = "client!tba", name = "c", descriptor = "()V")
    public final void method1864() {
        byte[] var1 = this.field4125;
        if (this.field4124 == null) {
            for (int var2 = this.field4121 - 1; var2 >= 0; var2--) {
                int var3 = this.field4122 * var2;
                int var4 = (var2 + 1) * this.field4122;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field4124;
            for (int var7 = this.field4121 - 1; var7 >= 0; var7--) {
                int var9 = this.field4122 * var7;
                int var10 = (var7 + 1) * this.field4122;
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
        int var8 = this.field4127;
        this.field4127 = this.field4126;
        this.field4126 = var8;
    }

    @OriginalMember(owner = "client!tba", name = "d", descriptor = "()[I")
    public final int[] method1865() {
        int var1 = this.method1866();
        int[] var2 = new int[var1 * this.method1863()];
        if (this.field4124 == null) {
            for (int var7 = 0; var7 < this.field4121; var7++) {
                int var8 = this.field4122 * var7;
                int var9 = (this.field4123 + var7) * var1 + this.field4127;
                for (int var10 = 0; var10 < this.field4122; var10++) {
                    int var11 = this.field4128[this.field4125[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field4121; var3++) {
                int var4 = this.field4122 * var3;
                int var5 = (this.field4123 + var3) * var1 + this.field4127;
                for (int var6 = 0; var6 < this.field4122; var6++) {
                    var2[var5++] = this.field4124[var4] << 24 | this.field4128[this.field4125[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!tba", name = "e", descriptor = "()I")
    public final int method1866() {
        return this.field4127 + this.field4122 + this.field4126;
    }

    @OriginalMember(owner = "client!tba", name = "f", descriptor = "()V")
    public final void method1867() {
        byte[] var1 = this.field4125;
        if (this.field4124 == null) {
            for (int var2 = (this.field4121 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field4122 * var2;
                int var4 = (this.field4121 - var2 - 1) * this.field4122;
                for (int var5 = -this.field4122; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field4124;
            for (int var8 = (this.field4121 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field4122 * var8;
                int var11 = (this.field4121 - var8 - 1) * this.field4122;
                for (int var12 = -this.field4122; var12 < 0; var12++) {
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
        int var9 = this.field4123;
        this.field4123 = this.field4120;
        this.field4120 = var9;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "([B)[Ltba;")
    private static final class320[] method1868(byte[] arg0) {
        class26 var1 = new class26(arg0);
        var1.field330 = arg0.length - 2;
        int var2 = var1.method193(2);
        class320[] var3 = new class320[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class320();
        }
        var1.field330 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method193(2);
        int var6 = var1.method193(2);
        int var7 = (var1.method194((byte) 119) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field4127 = var1.method193(2);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field4123 = var1.method193(2);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field4122 = var1.method193(2);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field4121 = var1.method193(2);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class320 var32 = var3[var12];
            var32.field4126 = var5 - var32.field4122 - var32.field4127;
            var32.field4120 = var6 - var32.field4121 - var32.field4123;
        }
        var1.field330 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method186((byte) 94);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field4128 = var13;
        }
        var1.field330 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class320 var17 = var3[var16];
            int var18 = var17.field4122 * var17.field4121;
            var17.field4125 = new byte[var18];
            int var19 = var1.method194((byte) 119);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field4124 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field4125[var24] = var1.method195(128);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field4124[var25] = var1.method195(128);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field4122; var27++) {
                        for (int var31 = 0; var31 < var17.field4121; var31++) {
                            var17.field4125[var17.field4122 * var31 + var27] = var1.method195(128);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field4122; var28++) {
                        for (int var29 = 0; var29 < var17.field4121; var29++) {
                            byte var30 = var17.field4124[var17.field4122 * var29 + var28] = var1.method195(128);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field4124 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field4125[var20] = var1.method195(128);
                }
            } else {
                for (int var21 = 0; var21 < var17.field4122; var21++) {
                    for (int var22 = 0; var22 < var17.field4121; var22++) {
                        var17.field4125[var17.field4122 * var22 + var21] = var1.method195(128);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "(Lwu;I)[Ltba;")
    public static final class320[] method1869(class557 arg0, int arg1) {
        byte[] var2 = arg0.method3318(8941, arg1);
        return var2 == null ? null : method1868(var2);
    }

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "(Lwu;II)Ltba;")
    public static final class320 method1870(class557 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3322(arg1, arg2, (byte) 94);
        return var3 == null ? null : method1868(var3)[0];
    }

    @OriginalMember(owner = "client!tba", name = "g", descriptor = "()V")
    public final void method1871() {
        byte[] var1 = new byte[this.field4122 * this.field4121];
        int var2 = 0;
        if (this.field4124 == null) {
            for (int var3 = 0; var3 < this.field4122; var3++) {
                for (int var4 = this.field4121 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field4125[this.field4122 * var4 + var3];
                }
            }
            this.field4125 = var1;
        } else {
            byte[] var5 = new byte[this.field4122 * this.field4121];
            for (int var6 = 0; var6 < this.field4122; var6++) {
                for (int var9 = this.field4121 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field4125[this.field4122 * var9 + var6];
                    var5[var2++] = this.field4124[this.field4122 * var9 + var6];
                }
            }
            this.field4125 = var1;
            this.field4124 = var5;
        }
        int var7 = this.field4123;
        this.field4123 = this.field4127;
        this.field4127 = this.field4120;
        this.field4120 = this.field4126;
        this.field4126 = this.field4123;
        int var8 = this.field4121;
        this.field4121 = this.field4122;
        this.field4122 = var8;
    }

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "(I)V")
    public final void method1872(int arg0) {
        int var2 = this.method1866();
        int var3 = this.method1863();
        if (this.field4122 == var2 && this.field4121 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field4127) {
            var4 = this.field4127;
        }
        int var5 = arg0;
        if (this.field4127 + arg0 + this.field4122 > var2) {
            var5 = var2 - this.field4127 - this.field4122;
        }
        int var6 = arg0;
        if (arg0 > this.field4123) {
            var6 = this.field4123;
        }
        int var7 = arg0;
        if (this.field4123 + arg0 + this.field4121 > var3) {
            var7 = var3 - this.field4123 - this.field4121;
        }
        int var8 = this.field4122 + var4 + var5;
        int var9 = this.field4121 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field4124 == null) {
            for (int var11 = 0; var11 < this.field4121; var11++) {
                int var12 = this.field4122 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field4122; var14++) {
                    var10[var13++] = this.field4125[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field4121; var16++) {
                int var17 = this.field4122 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field4122; var19++) {
                    var15[var18] = this.field4124[var17];
                    var10[var18++] = this.field4125[var17++];
                }
            }
            this.field4124 = var15;
        }
        this.field4127 -= var4;
        this.field4123 -= var6;
        this.field4126 -= var5;
        this.field4120 -= var7;
        this.field4122 = var8;
        this.field4121 = var9;
        this.field4125 = var10;
    }

    @OriginalMember(owner = "client!tba", name = "c", descriptor = "(I)V")
    public final void method1873(int arg0) {
        int var2 = -1;
        if (this.field4128.length < 255) {
            for (int var3 = 0; var3 < this.field4128.length; var3++) {
                if (this.field4128[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field4128.length;
                int[] var4 = new int[this.field4128.length + 1];
                class34.method244(this.field4128, 0, var4, 0, this.field4128.length);
                this.field4128 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field4128.length; var9++) {
                int var13 = this.field4128[var9];
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
        for (int var10 = this.field4121 - 1; var10 > 0; var10--) {
            int var11 = this.field4122 * var10;
            for (int var12 = this.field4122 - 1; var12 > 0; var12--) {
                if (this.field4128[this.field4125[var11 + var12] & 0xFF] == 0 && this.field4128[this.field4125[var11 + var12 - this.field4122 - 1] & 0xFF] != 0) {
                    this.field4125[var11 + var12] = (byte) var2;
                }
            }
        }
    }
}
