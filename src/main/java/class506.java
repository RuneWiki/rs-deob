import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class506 {

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public int field7489;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public int field7491;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public int field7492;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public int field7494;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public int field7495;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public int field7497;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "[B")
    public byte[] field7490;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "[B")
    public byte[] field7493;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "[I")
    public int[] field7496;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "()I")
    public final int method3010() {
        return this.field7497 + this.field7495 + this.field7491;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "()V")
    public final void method3011() {
        byte[] var1 = new byte[this.field7495 * this.field7489];
        int var2 = 0;
        if (this.field7493 == null) {
            for (int var3 = 0; var3 < this.field7495; var3++) {
                for (int var4 = this.field7489 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field7490[this.field7495 * var4 + var3];
                }
            }
            this.field7490 = var1;
        } else {
            byte[] var5 = new byte[this.field7495 * this.field7489];
            for (int var6 = 0; var6 < this.field7495; var6++) {
                for (int var9 = this.field7489 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field7490[this.field7495 * var9 + var6];
                    var5[var2++] = this.field7493[this.field7495 * var9 + var6];
                }
            }
            this.field7490 = var1;
            this.field7493 = var5;
        }
        int var7 = this.field7492;
        this.field7492 = this.field7497;
        this.field7497 = this.field7494;
        this.field7494 = this.field7491;
        this.field7491 = this.field7492;
        int var8 = this.field7489;
        this.field7489 = this.field7495;
        this.field7495 = var8;
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "()V")
    public final void method3012() {
        byte[] var1 = this.field7490;
        if (this.field7493 == null) {
            for (int var2 = (this.field7489 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field7495 * var2;
                int var4 = (this.field7489 - var2 - 1) * this.field7495;
                for (int var5 = -this.field7495; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field7493;
            for (int var8 = (this.field7489 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field7495 * var8;
                int var11 = (this.field7489 - var8 - 1) * this.field7495;
                for (int var12 = -this.field7495; var12 < 0; var12++) {
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
        int var9 = this.field7492;
        this.field7492 = this.field7494;
        this.field7494 = var9;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
    public final void method3013(int arg0) {
        int var2 = this.method3010();
        int var3 = this.method3022();
        if (this.field7495 == var2 && this.field7489 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field7497) {
            var4 = this.field7497;
        }
        int var5 = arg0;
        if (this.field7497 + arg0 + this.field7495 > var2) {
            var5 = var2 - this.field7497 - this.field7495;
        }
        int var6 = arg0;
        if (arg0 > this.field7492) {
            var6 = this.field7492;
        }
        int var7 = arg0;
        if (this.field7492 + arg0 + this.field7489 > var3) {
            var7 = var3 - this.field7492 - this.field7489;
        }
        int var8 = this.field7495 + var4 + var5;
        int var9 = this.field7489 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field7493 == null) {
            for (int var11 = 0; var11 < this.field7489; var11++) {
                int var12 = this.field7495 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field7495; var14++) {
                    var10[var13++] = this.field7490[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field7489; var16++) {
                int var17 = this.field7495 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field7495; var19++) {
                    var15[var18] = this.field7493[var17];
                    var10[var18++] = this.field7490[var17++];
                }
            }
            this.field7493 = var15;
        }
        this.field7497 -= var4;
        this.field7492 -= var6;
        this.field7491 -= var5;
        this.field7494 -= var7;
        this.field7495 = var8;
        this.field7489 = var9;
        this.field7490 = var10;
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "()V")
    public final void method3014() {
        int var1 = this.method3010();
        int var2 = this.method3022();
        if (this.field7495 == var1 && this.field7489 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field7493 == null) {
            for (int var9 = 0; var9 < this.field7489; var9++) {
                int var10 = this.field7495 * var9;
                int var11 = (this.field7492 + var9) * var1 + this.field7497;
                for (int var12 = 0; var12 < this.field7495; var12++) {
                    var3[var11++] = this.field7490[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field7489; var5++) {
                int var6 = this.field7495 * var5;
                int var7 = (this.field7492 + var5) * var1 + this.field7497;
                for (int var8 = 0; var8 < this.field7495; var8++) {
                    var3[var7] = this.field7490[var6];
                    var4[var7++] = this.field7493[var6++];
                }
            }
            this.field7493 = var4;
        }
        this.field7497 = this.field7491 = this.field7492 = this.field7494 = 0;
        this.field7495 = var1;
        this.field7489 = var2;
        this.field7490 = var3;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
    public final void method3015(int arg0) {
        int var2 = -1;
        if (this.field7496.length < 255) {
            for (int var3 = 0; var3 < this.field7496.length; var3++) {
                if (this.field7496[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field7496.length;
                int[] var4 = new int[this.field7496.length + 1];
                class182.method1139(this.field7496, 0, var4, 0, this.field7496.length);
                this.field7496 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field7496.length; var9++) {
                int var13 = this.field7496[var9];
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
        for (int var10 = this.field7489 - 1; var10 > 0; var10--) {
            int var11 = this.field7495 * var10;
            for (int var12 = this.field7495 - 1; var12 > 0; var12--) {
                if (this.field7496[this.field7490[var11 + var12] & 0xFF] == 0 && this.field7496[this.field7490[var11 + var12 - this.field7495 - 1] & 0xFF] != 0) {
                    this.field7490[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "()V")
    public final void method3016() {
        byte[] var1 = this.field7490;
        if (this.field7493 == null) {
            for (int var2 = this.field7489 - 1; var2 >= 0; var2--) {
                int var3 = this.field7495 * var2;
                int var4 = (var2 + 1) * this.field7495;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field7493;
            for (int var7 = this.field7489 - 1; var7 >= 0; var7--) {
                int var9 = this.field7495 * var7;
                int var10 = (var7 + 1) * this.field7495;
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
        int var8 = this.field7497;
        this.field7497 = this.field7491;
        this.field7491 = var8;
    }

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "()[I")
    public final int[] method3017() {
        int var1 = this.method3010();
        int[] var2 = new int[var1 * this.method3022()];
        if (this.field7493 == null) {
            for (int var7 = 0; var7 < this.field7489; var7++) {
                int var8 = this.field7495 * var7;
                int var9 = (this.field7492 + var7) * var1 + this.field7497;
                for (int var10 = 0; var10 < this.field7495; var10++) {
                    int var11 = this.field7496[this.field7490[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field7489; var3++) {
                int var4 = this.field7495 * var3;
                int var5 = (this.field7492 + var3) * var1 + this.field7497;
                for (int var6 = 0; var6 < this.field7495; var6++) {
                    var2[var5++] = this.field7493[var4] << 24 | this.field7496[this.field7490[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Loi;II)Ldd;")
    public static final class506 method3018(class53 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method426(arg1, (byte) 9, arg2);
        return var3 == null ? null : method3019(var3)[0];
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "([B)[Ldd;")
    private static final class506[] method3019(byte[] arg0) {
        class403 var1 = new class403(arg0);
        var1.field5665 = arg0.length - 2;
        int var2 = var1.method2338(0);
        class506[] var3 = new class506[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class506();
        }
        var1.field5665 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method2338(0);
        int var6 = var1.method2338(0);
        int var7 = (var1.method2357((byte) 123) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field7497 = var1.method2338(0);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field7492 = var1.method2338(0);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field7495 = var1.method2338(0);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field7489 = var1.method2338(0);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class506 var32 = var3[var12];
            var32.field7491 = var5 - var32.field7495 - var32.field7497;
            var32.field7494 = var6 - var32.field7489 - var32.field7492;
        }
        var1.field5665 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method2323((byte) 100);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field7496 = var13;
        }
        var1.field5665 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class506 var17 = var3[var16];
            int var18 = var17.field7495 * var17.field7489;
            var17.field7490 = new byte[var18];
            int var19 = var1.method2357((byte) 115);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field7493 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field7490[var24] = var1.method2359(12);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field7493[var25] = var1.method2359(94);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field7495; var27++) {
                        for (int var31 = 0; var31 < var17.field7489; var31++) {
                            var17.field7490[var17.field7495 * var31 + var27] = var1.method2359(-109);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field7495; var28++) {
                        for (int var29 = 0; var29 < var17.field7489; var29++) {
                            byte var30 = var17.field7493[var17.field7495 * var29 + var28] = var1.method2359(49);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field7493 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field7490[var20] = var1.method2359(-128);
                }
            } else {
                for (int var21 = 0; var21 < var17.field7495; var21++) {
                    for (int var22 = 0; var22 < var17.field7489; var22++) {
                        var17.field7490[var17.field7495 * var22 + var21] = var1.method2359(-99);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Loi;I)Ldd;")
    public static final class506 method3020(class53 arg0, int arg1) {
        byte[] var2 = arg0.method421(arg1, 1);
        return var2 == null ? null : method3019(var2)[0];
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(Loi;II)[Ldd;")
    public static final class506[] method3021(class53 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method426(arg1, (byte) 9, arg2);
        return var3 == null ? null : method3019(var3);
    }

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "()I")
    public final int method3022() {
        return this.field7492 + this.field7489 + this.field7494;
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V")
    public final void method3023(int arg0) {
        int var2 = -1;
        if (this.field7496.length < 255) {
            for (int var3 = 0; var3 < this.field7496.length; var3++) {
                if (this.field7496[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field7496.length;
                int[] var4 = new int[this.field7496.length + 1];
                class182.method1139(this.field7496, 0, var4, 0, this.field7496.length);
                this.field7496 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field7496.length; var9++) {
                int var15 = this.field7496[var9];
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
        byte[] var11 = new byte[this.field7495 * this.field7489];
        for (int var12 = 0; var12 < this.field7489; var12++) {
            for (int var13 = 0; var13 < this.field7495; var13++) {
                int var14 = this.field7490[var10] & 0xFF;
                if (this.field7496[var14] == 0) {
                    if (var13 > 0 && this.field7496[this.field7490[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field7496[this.field7490[var10 - this.field7495] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field7495 - 1 && this.field7496[this.field7490[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field7489 - 1 && this.field7496[this.field7490[this.field7495 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field7490 = var11;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(Loi;I)[Ldd;")
    public static final class506[] method3024(class53 arg0, int arg1) {
        byte[] var2 = arg0.method421(arg1, 1);
        return var2 == null ? null : method3019(var2);
    }
}
