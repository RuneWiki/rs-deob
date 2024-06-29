import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public class class518 {

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "I")
    public int field7195;

    @OriginalMember(owner = "client!fba", name = "e", descriptor = "I")
    public int field7199;

    @OriginalMember(owner = "client!fba", name = "f", descriptor = "I")
    public int field7200;

    @OriginalMember(owner = "client!fba", name = "g", descriptor = "I")
    public int field7201;

    @OriginalMember(owner = "client!fba", name = "h", descriptor = "I")
    public int field7202;

    @OriginalMember(owner = "client!fba", name = "i", descriptor = "I")
    public int field7203;

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "[B")
    public byte[] field7196;

    @OriginalMember(owner = "client!fba", name = "c", descriptor = "[B")
    public byte[] field7197;

    @OriginalMember(owner = "client!fba", name = "d", descriptor = "[I")
    public int[] field7198;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)V", line = 6)
    public final void method2916(int arg0) {
        int var2 = -1;
        if (this.field7198.length < 255) {
            for (int var3 = 0; var3 < this.field7198.length; var3++) {
                if (this.field7198[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field7198.length;
                int[] var4 = new int[this.field7198.length + 1];
                class164.method1146(this.field7198, 0, var4, 0, this.field7198.length);
                this.field7198 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field7198.length; var9++) {
                int var13 = this.field7198[var9];
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
        for (int var10 = this.field7195 - 1; var10 > 0; var10--) {
            int var11 = this.field7202 * var10;
            for (int var12 = this.field7202 - 1; var12 > 0; var12--) {
                if (this.field7198[this.field7197[var11 + var12] & 0xFF] == 0 && this.field7198[this.field7197[var11 + var12 - this.field7202 - 1] & 0xFF] != 0) {
                    this.field7197[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lgp;I)Lfba;", line = 112)
    public static final class518 method2917(class561 arg0, int arg1) {
        byte[] var2 = arg0.method3177(0, arg1);
        return var2 == null ? null : method2929(var2)[0];
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "()V", line = 123)
    public final void method2918() {
        byte[] var1 = this.field7197;
        if (this.field7196 == null) {
            for (int var2 = (this.field7195 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field7202 * var2;
                int var4 = (this.field7195 - var2 - 1) * this.field7202;
                for (int var5 = -this.field7202; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field7196;
            for (int var8 = (this.field7195 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field7202 * var8;
                int var11 = (this.field7195 - var8 - 1) * this.field7202;
                for (int var12 = -this.field7202; var12 < 0; var12++) {
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
        int var9 = this.field7200;
        this.field7200 = this.field7201;
        this.field7201 = var9;
    }

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "(I)V", line = 195)
    public final void method2919(int arg0) {
        int var2 = this.method2923();
        int var3 = this.method2927();
        if (this.field7202 == var2 && this.field7195 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field7199) {
            var4 = this.field7199;
        }
        int var5 = arg0;
        if (this.field7199 + arg0 + this.field7202 > var2) {
            var5 = var2 - this.field7199 - this.field7202;
        }
        int var6 = arg0;
        if (arg0 > this.field7200) {
            var6 = this.field7200;
        }
        int var7 = arg0;
        if (this.field7200 + arg0 + this.field7195 > var3) {
            var7 = var3 - this.field7200 - this.field7195;
        }
        int var8 = this.field7202 + var4 + var5;
        int var9 = this.field7195 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field7196 == null) {
            for (int var11 = 0; var11 < this.field7195; var11++) {
                int var12 = this.field7202 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field7202; var14++) {
                    var10[var13++] = this.field7197[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field7195; var16++) {
                int var17 = this.field7202 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field7202; var19++) {
                    var15[var18] = this.field7196[var17];
                    var10[var18++] = this.field7197[var17++];
                }
            }
            this.field7196 = var15;
        }
        this.field7199 -= var4;
        this.field7200 -= var6;
        this.field7203 -= var5;
        this.field7201 -= var7;
        this.field7202 = var8;
        this.field7195 = var9;
        this.field7197 = var10;
    }

    @OriginalMember(owner = "client!fba", name = "c", descriptor = "(I)V", line = 291)
    public final void method2920(int arg0) {
        int var2 = -1;
        if (this.field7198.length < 255) {
            for (int var3 = 0; var3 < this.field7198.length; var3++) {
                if (this.field7198[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field7198.length;
                int[] var4 = new int[this.field7198.length + 1];
                class164.method1146(this.field7198, 0, var4, 0, this.field7198.length);
                this.field7198 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field7198.length; var9++) {
                int var15 = this.field7198[var9];
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
        byte[] var11 = new byte[this.field7202 * this.field7195];
        for (int var12 = 0; var12 < this.field7195; var12++) {
            for (int var13 = 0; var13 < this.field7202; var13++) {
                int var14 = this.field7197[var10] & 0xFF;
                if (this.field7198[var14] == 0) {
                    if (var13 > 0 && this.field7198[this.field7197[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field7198[this.field7197[var10 - this.field7202] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field7202 - 1 && this.field7198[this.field7197[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field7195 - 1 && this.field7198[this.field7197[this.field7202 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field7197 = var11;
    }

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "()[I", line = 416)
    public final int[] method2921() {
        int var1 = this.method2923();
        int[] var2 = new int[var1 * this.method2927()];
        if (this.field7196 == null) {
            for (int var7 = 0; var7 < this.field7195; var7++) {
                int var8 = this.field7202 * var7;
                int var9 = (this.field7200 + var7) * var1 + this.field7199;
                for (int var10 = 0; var10 < this.field7202; var10++) {
                    int var11 = this.field7198[this.field7197[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field7195; var3++) {
                int var4 = this.field7202 * var3;
                int var5 = (this.field7200 + var3) * var1 + this.field7199;
                for (int var6 = 0; var6 < this.field7202; var6++) {
                    var2[var5++] = this.field7196[var4] << 24 | this.field7198[this.field7197[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lgp;II)Lfba;", line = 479)
    public static final class518 method2922(class561 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3175(arg2, (byte) -53, arg1);
        return var3 == null ? null : method2929(var3)[0];
    }

    @OriginalMember(owner = "client!fba", name = "c", descriptor = "()I", line = 488)
    public final int method2923() {
        return this.field7202 + this.field7199 + this.field7203;
    }

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "(Lgp;II)[Lfba;", line = 492)
    public static final class518[] method2924(class561 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3175(arg2, (byte) -53, arg1);
        return var3 == null ? null : method2929(var3);
    }

    @OriginalMember(owner = "client!fba", name = "d", descriptor = "()V", line = 500)
    public final void method2925() {
        int var1 = this.method2923();
        int var2 = this.method2927();
        if (this.field7202 == var1 && this.field7195 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field7196 == null) {
            for (int var9 = 0; var9 < this.field7195; var9++) {
                int var10 = this.field7202 * var9;
                int var11 = (this.field7200 + var9) * var1 + this.field7199;
                for (int var12 = 0; var12 < this.field7202; var12++) {
                    var3[var11++] = this.field7197[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field7195; var5++) {
                int var6 = this.field7202 * var5;
                int var7 = (this.field7200 + var5) * var1 + this.field7199;
                for (int var8 = 0; var8 < this.field7202; var8++) {
                    var3[var7] = this.field7197[var6];
                    var4[var7++] = this.field7196[var6++];
                }
            }
            this.field7196 = var4;
        }
        this.field7199 = this.field7203 = this.field7200 = this.field7201 = 0;
        this.field7202 = var1;
        this.field7195 = var2;
        this.field7197 = var3;
    }

    @OriginalMember(owner = "client!fba", name = "e", descriptor = "()V", line = 569)
    public final void method2926() {
        byte[] var1 = this.field7197;
        if (this.field7196 == null) {
            for (int var2 = this.field7195 - 1; var2 >= 0; var2--) {
                int var3 = this.field7202 * var2;
                int var4 = (var2 + 1) * this.field7202;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field7196;
            for (int var7 = this.field7195 - 1; var7 >= 0; var7--) {
                int var9 = this.field7202 * var7;
                int var10 = (var7 + 1) * this.field7202;
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
        int var8 = this.field7199;
        this.field7199 = this.field7203;
        this.field7203 = var8;
    }

    @OriginalMember(owner = "client!fba", name = "f", descriptor = "()I", line = 631)
    public final int method2927() {
        return this.field7200 + this.field7195 + this.field7201;
    }

    @OriginalMember(owner = "client!fba", name = "g", descriptor = "()V", line = 636)
    public final void method2928() {
        byte[] var1 = new byte[this.field7202 * this.field7195];
        int var2 = 0;
        if (this.field7196 == null) {
            for (int var3 = 0; var3 < this.field7202; var3++) {
                for (int var4 = this.field7195 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field7197[this.field7202 * var4 + var3];
                }
            }
            this.field7197 = var1;
        } else {
            byte[] var5 = new byte[this.field7202 * this.field7195];
            for (int var6 = 0; var6 < this.field7202; var6++) {
                for (int var9 = this.field7195 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field7197[this.field7202 * var9 + var6];
                    var5[var2++] = this.field7196[this.field7202 * var9 + var6];
                }
            }
            this.field7197 = var1;
            this.field7196 = var5;
        }
        int var7 = this.field7200;
        this.field7200 = this.field7199;
        this.field7199 = this.field7201;
        this.field7201 = this.field7203;
        this.field7203 = this.field7200;
        int var8 = this.field7195;
        this.field7195 = this.field7202;
        this.field7202 = var8;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "([B)[Lfba;", line = 696)
    private static final class518[] method2929(byte[] arg0) {
        class268 var1 = new class268(arg0);
        var1.field3913 = arg0.length - 2;
        int var2 = var1.method1745(32132);
        class518[] var3 = new class518[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class518();
        }
        var1.field3913 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method1745(32132);
        int var6 = var1.method1745(32132);
        int var7 = (var1.method1738(255) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field7199 = var1.method1745(32132);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field7200 = var1.method1745(32132);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field7202 = var1.method1745(32132);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field7195 = var1.method1745(32132);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class518 var32 = var3[var12];
            var32.field7203 = var5 - var32.field7202 - var32.field7199;
            var32.field7201 = var6 - var32.field7195 - var32.field7200;
        }
        var1.field3913 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method1700((byte) 44);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field7198 = var13;
        }
        var1.field3913 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class518 var17 = var3[var16];
            int var18 = var17.field7202 * var17.field7195;
            var17.field7197 = new byte[var18];
            int var19 = var1.method1738(255);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field7196 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field7197[var24] = var1.method1714(-31536);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field7196[var25] = var1.method1714(-31536);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field7202; var27++) {
                        for (int var31 = 0; var31 < var17.field7195; var31++) {
                            var17.field7197[var17.field7202 * var31 + var27] = var1.method1714(-31536);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field7202; var28++) {
                        for (int var29 = 0; var29 < var17.field7195; var29++) {
                            byte var30 = var17.field7196[var17.field7202 * var29 + var28] = var1.method1714(-31536);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field7196 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field7197[var20] = var1.method1714(-31536);
                }
            } else {
                for (int var21 = 0; var21 < var17.field7202; var21++) {
                    for (int var22 = 0; var22 < var17.field7195; var22++) {
                        var17.field7197[var17.field7202 * var22 + var21] = var1.method1714(-31536);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "(Lgp;I)[Lfba;", line = 905)
    public static final class518[] method2930(class561 arg0, int arg1) {
        byte[] var2 = arg0.method3177(0, arg1);
        return var2 == null ? null : method2929(var2);
    }
}
