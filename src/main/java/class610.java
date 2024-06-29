import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class610 {

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "I")
    public int field8968;

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "I")
    public int field8969;

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "I")
    public int field8971;

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "I")
    public int field8972;

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "I")
    public int field8973;

    @OriginalMember(owner = "client!qr", name = "h", descriptor = "I")
    public int field8975;

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "[B")
    public byte[] field8970;

    @OriginalMember(owner = "client!qr", name = "i", descriptor = "[B")
    public byte[] field8976;

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "[I")
    public int[] field8974;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "()V")
    public final void method3544() {
        byte[] var1 = this.field8976;
        if (this.field8970 == null) {
            for (int var2 = this.field8972 - 1; var2 >= 0; var2--) {
                int var3 = this.field8975 * var2;
                int var4 = (var2 + 1) * this.field8975;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field8970;
            for (int var7 = this.field8972 - 1; var7 >= 0; var7--) {
                int var9 = this.field8975 * var7;
                int var10 = (var7 + 1) * this.field8975;
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
        int var8 = this.field8971;
        this.field8971 = this.field8968;
        this.field8968 = var8;
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "()V")
    public final void method3545() {
        byte[] var1 = this.field8976;
        if (this.field8970 == null) {
            for (int var2 = (this.field8972 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field8975 * var2;
                int var4 = (this.field8972 - var2 - 1) * this.field8975;
                for (int var5 = -this.field8975; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field8970;
            for (int var8 = (this.field8972 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field8975 * var8;
                int var11 = (this.field8972 - var8 - 1) * this.field8975;
                for (int var12 = -this.field8975; var12 < 0; var12++) {
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
        int var9 = this.field8973;
        this.field8973 = this.field8969;
        this.field8969 = var9;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)V")
    public final void method3546(int arg0) {
        int var2 = -1;
        if (this.field8974.length < 255) {
            for (int var3 = 0; var3 < this.field8974.length; var3++) {
                if (this.field8974[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field8974.length;
                int[] var4 = new int[this.field8974.length + 1];
                class473.method2880(this.field8974, 0, var4, 0, this.field8974.length);
                this.field8974 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field8974.length; var9++) {
                int var13 = this.field8974[var9];
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
        for (int var10 = this.field8972 - 1; var10 > 0; var10--) {
            int var11 = this.field8975 * var10;
            for (int var12 = this.field8975 - 1; var12 > 0; var12--) {
                if (this.field8974[this.field8976[var11 + var12] & 0xFF] == 0 && this.field8974[this.field8976[var11 + var12 - this.field8975 - 1] & 0xFF] != 0) {
                    this.field8976[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Ldda;II)[Lqr;")
    public static final class610[] method3547(class597 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3486((byte) -31, arg2, arg1);
        return var3 == null ? null : method3551(var3);
    }

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "()[I")
    public final int[] method3548() {
        int var1 = this.method3558();
        int[] var2 = new int[var1 * this.method3557()];
        if (this.field8970 == null) {
            for (int var7 = 0; var7 < this.field8972; var7++) {
                int var8 = this.field8975 * var7;
                int var9 = (this.field8973 + var7) * var1 + this.field8971;
                for (int var10 = 0; var10 < this.field8975; var10++) {
                    int var11 = this.field8974[this.field8976[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field8972; var3++) {
                int var4 = this.field8975 * var3;
                int var5 = (this.field8973 + var3) * var1 + this.field8971;
                for (int var6 = 0; var6 < this.field8975; var6++) {
                    var2[var5++] = this.field8970[var4] << 24 | this.field8974[this.field8976[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Ldda;I)[Lqr;")
    public static final class610[] method3549(class597 arg0, int arg1) {
        byte[] var2 = arg0.method3469(arg1, 111);
        return var2 == null ? null : method3551(var2);
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)V")
    public final void method3550(int arg0) {
        int var2 = -1;
        if (this.field8974.length < 255) {
            for (int var3 = 0; var3 < this.field8974.length; var3++) {
                if (this.field8974[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field8974.length;
                int[] var4 = new int[this.field8974.length + 1];
                class473.method2880(this.field8974, 0, var4, 0, this.field8974.length);
                this.field8974 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field8974.length; var9++) {
                int var15 = this.field8974[var9];
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
        byte[] var11 = new byte[this.field8975 * this.field8972];
        for (int var12 = 0; var12 < this.field8972; var12++) {
            for (int var13 = 0; var13 < this.field8975; var13++) {
                int var14 = this.field8976[var10] & 0xFF;
                if (this.field8974[var14] == 0) {
                    if (var13 > 0 && this.field8974[this.field8976[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field8974[this.field8976[var10 - this.field8975] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field8975 - 1 && this.field8974[this.field8976[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field8972 - 1 && this.field8974[this.field8976[this.field8975 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field8976 = var11;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "([B)[Lqr;")
    private static final class610[] method3551(byte[] arg0) {
        class428 var1 = new class428(arg0);
        var1.field6221 = arg0.length - 2;
        int var2 = var1.method2620(68);
        class610[] var3 = new class610[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class610();
        }
        var1.field6221 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method2620(122);
        int var6 = var1.method2620(29);
        int var7 = (var1.method2561((byte) -59) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field8971 = var1.method2620(88);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field8973 = var1.method2620(53);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field8975 = var1.method2620(39);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field8972 = var1.method2620(108);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class610 var32 = var3[var12];
            var32.field8968 = var5 - var32.field8975 - var32.field8971;
            var32.field8969 = var6 - var32.field8972 - var32.field8973;
        }
        var1.field6221 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method2601(99);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field8974 = var13;
        }
        var1.field6221 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class610 var17 = var3[var16];
            int var18 = var17.field8975 * var17.field8972;
            var17.field8976 = new byte[var18];
            int var19 = var1.method2561((byte) 112);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field8970 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field8976[var24] = var1.method2570((byte) 57);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field8970[var25] = var1.method2570((byte) 57);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field8975; var27++) {
                        for (int var31 = 0; var31 < var17.field8972; var31++) {
                            var17.field8976[var17.field8975 * var31 + var27] = var1.method2570((byte) 57);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field8975; var28++) {
                        for (int var29 = 0; var29 < var17.field8972; var29++) {
                            byte var30 = var17.field8970[var17.field8975 * var29 + var28] = var1.method2570((byte) 57);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field8970 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field8976[var20] = var1.method2570((byte) 57);
                }
            } else {
                for (int var21 = 0; var21 < var17.field8975; var21++) {
                    for (int var22 = 0; var22 < var17.field8972; var22++) {
                        var17.field8976[var17.field8975 * var22 + var21] = var1.method2570((byte) 57);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(Ldda;I)Lqr;")
    public static final class610 method3552(class597 arg0, int arg1) {
        byte[] var2 = arg0.method3469(arg1, 124);
        return var2 == null ? null : method3551(var2)[0];
    }

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "()V")
    public final void method3553() {
        int var1 = this.method3558();
        int var2 = this.method3557();
        if (this.field8975 == var1 && this.field8972 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field8970 == null) {
            for (int var9 = 0; var9 < this.field8972; var9++) {
                int var10 = this.field8975 * var9;
                int var11 = (this.field8973 + var9) * var1 + this.field8971;
                for (int var12 = 0; var12 < this.field8975; var12++) {
                    var3[var11++] = this.field8976[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field8972; var5++) {
                int var6 = this.field8975 * var5;
                int var7 = (this.field8973 + var5) * var1 + this.field8971;
                for (int var8 = 0; var8 < this.field8975; var8++) {
                    var3[var7] = this.field8976[var6];
                    var4[var7++] = this.field8970[var6++];
                }
            }
            this.field8970 = var4;
        }
        this.field8971 = this.field8968 = this.field8973 = this.field8969 = 0;
        this.field8975 = var1;
        this.field8972 = var2;
        this.field8976 = var3;
    }

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "(I)V")
    public final void method3554(int arg0) {
        int var2 = this.method3558();
        int var3 = this.method3557();
        if (this.field8975 == var2 && this.field8972 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field8971) {
            var4 = this.field8971;
        }
        int var5 = arg0;
        if (this.field8971 + arg0 + this.field8975 > var2) {
            var5 = var2 - this.field8971 - this.field8975;
        }
        int var6 = arg0;
        if (arg0 > this.field8973) {
            var6 = this.field8973;
        }
        int var7 = arg0;
        if (this.field8973 + arg0 + this.field8972 > var3) {
            var7 = var3 - this.field8973 - this.field8972;
        }
        int var8 = this.field8975 + var4 + var5;
        int var9 = this.field8972 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field8970 == null) {
            for (int var11 = 0; var11 < this.field8972; var11++) {
                int var12 = this.field8975 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field8975; var14++) {
                    var10[var13++] = this.field8976[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field8972; var16++) {
                int var17 = this.field8975 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field8975; var19++) {
                    var15[var18] = this.field8970[var17];
                    var10[var18++] = this.field8976[var17++];
                }
            }
            this.field8970 = var15;
        }
        this.field8971 -= var4;
        this.field8973 -= var6;
        this.field8968 -= var5;
        this.field8969 -= var7;
        this.field8975 = var8;
        this.field8972 = var9;
        this.field8976 = var10;
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(Ldda;II)Lqr;")
    public static final class610 method3555(class597 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3486((byte) -58, arg2, arg1);
        return var3 == null ? null : method3551(var3)[0];
    }

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "()V")
    public final void method3556() {
        byte[] var1 = new byte[this.field8975 * this.field8972];
        int var2 = 0;
        if (this.field8970 == null) {
            for (int var3 = 0; var3 < this.field8975; var3++) {
                for (int var4 = this.field8972 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field8976[this.field8975 * var4 + var3];
                }
            }
            this.field8976 = var1;
        } else {
            byte[] var5 = new byte[this.field8975 * this.field8972];
            for (int var6 = 0; var6 < this.field8975; var6++) {
                for (int var9 = this.field8972 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field8976[this.field8975 * var9 + var6];
                    var5[var2++] = this.field8970[this.field8975 * var9 + var6];
                }
            }
            this.field8976 = var1;
            this.field8970 = var5;
        }
        int var7 = this.field8973;
        this.field8973 = this.field8971;
        this.field8971 = this.field8969;
        this.field8969 = this.field8968;
        this.field8968 = this.field8973;
        int var8 = this.field8972;
        this.field8972 = this.field8975;
        this.field8975 = var8;
    }

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "()I")
    public final int method3557() {
        return this.field8973 + this.field8972 + this.field8969;
    }

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "()I")
    public final int method3558() {
        return this.field8975 + this.field8971 + this.field8968;
    }
}
