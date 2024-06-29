import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public class class628 {

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "I")
    public int field8932;

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "I")
    public int field8933;

    @OriginalMember(owner = "client!fda", name = "d", descriptor = "I")
    public int field8935;

    @OriginalMember(owner = "client!fda", name = "e", descriptor = "I")
    public int field8936;

    @OriginalMember(owner = "client!fda", name = "f", descriptor = "I")
    public int field8937;

    @OriginalMember(owner = "client!fda", name = "i", descriptor = "I")
    public int field8940;

    @OriginalMember(owner = "client!fda", name = "c", descriptor = "[B")
    public byte[] field8934;

    @OriginalMember(owner = "client!fda", name = "h", descriptor = "[B")
    public byte[] field8939;

    @OriginalMember(owner = "client!fda", name = "g", descriptor = "[I")
    public int[] field8938;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "()V", line = 4)
    public final void method3536() {
        int var1 = this.method3548();
        int var2 = this.method3540();
        if (this.field8936 == var1 && this.field8940 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field8934 == null) {
            for (int var9 = 0; var9 < this.field8940; var9++) {
                int var10 = this.field8936 * var9;
                int var11 = (this.field8935 + var9) * var1 + this.field8933;
                for (int var12 = 0; var12 < this.field8936; var12++) {
                    var3[var11++] = this.field8939[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field8940; var5++) {
                int var6 = this.field8936 * var5;
                int var7 = (this.field8935 + var5) * var1 + this.field8933;
                for (int var8 = 0; var8 < this.field8936; var8++) {
                    var3[var7] = this.field8939[var6];
                    var4[var7++] = this.field8934[var6++];
                }
            }
            this.field8934 = var4;
        }
        this.field8933 = this.field8932 = this.field8935 = this.field8937 = 0;
        this.field8936 = var1;
        this.field8940 = var2;
        this.field8939 = var3;
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(Lvo;I)Lfda;", line = 75)
    public static final class628 method3537(class345 arg0, int arg1) {
        byte[] var2 = arg0.method2086(1024, arg1);
        return var2 == null ? null : method3547(var2)[0];
    }

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "(Lvo;I)[Lfda;", line = 83)
    public static final class628[] method3538(class345 arg0, int arg1) {
        byte[] var2 = arg0.method2086(1024, arg1);
        return var2 == null ? null : method3547(var2);
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(I)V", line = 91)
    public final void method3539(int arg0) {
        int var2 = this.method3548();
        int var3 = this.method3540();
        if (this.field8936 == var2 && this.field8940 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field8933) {
            var4 = this.field8933;
        }
        int var5 = arg0;
        if (this.field8933 + arg0 + this.field8936 > var2) {
            var5 = var2 - this.field8933 - this.field8936;
        }
        int var6 = arg0;
        if (arg0 > this.field8935) {
            var6 = this.field8935;
        }
        int var7 = arg0;
        if (this.field8935 + arg0 + this.field8940 > var3) {
            var7 = var3 - this.field8935 - this.field8940;
        }
        int var8 = this.field8936 + var4 + var5;
        int var9 = this.field8940 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field8934 == null) {
            for (int var11 = 0; var11 < this.field8940; var11++) {
                int var12 = this.field8936 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field8936; var14++) {
                    var10[var13++] = this.field8939[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field8940; var16++) {
                int var17 = this.field8936 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field8936; var19++) {
                    var15[var18] = this.field8934[var17];
                    var10[var18++] = this.field8939[var17++];
                }
            }
            this.field8934 = var15;
        }
        this.field8933 -= var4;
        this.field8935 -= var6;
        this.field8932 -= var5;
        this.field8937 -= var7;
        this.field8936 = var8;
        this.field8940 = var9;
        this.field8939 = var10;
    }

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "()I", line = 187)
    public final int method3540() {
        return this.field8940 + this.field8935 + this.field8937;
    }

    @OriginalMember(owner = "client!fda", name = "c", descriptor = "()V", line = 193)
    public final void method3541() {
        byte[] var1 = new byte[this.field8940 * this.field8936];
        int var2 = 0;
        if (this.field8934 == null) {
            for (int var3 = 0; var3 < this.field8936; var3++) {
                for (int var4 = this.field8940 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field8939[this.field8936 * var4 + var3];
                }
            }
            this.field8939 = var1;
        } else {
            byte[] var5 = new byte[this.field8940 * this.field8936];
            for (int var6 = 0; var6 < this.field8936; var6++) {
                for (int var9 = this.field8940 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field8939[this.field8936 * var9 + var6];
                    var5[var2++] = this.field8934[this.field8936 * var9 + var6];
                }
            }
            this.field8939 = var1;
            this.field8934 = var5;
        }
        int var7 = this.field8935;
        this.field8935 = this.field8933;
        this.field8933 = this.field8937;
        this.field8937 = this.field8932;
        this.field8932 = this.field8935;
        int var8 = this.field8940;
        this.field8940 = this.field8936;
        this.field8936 = var8;
    }

    @OriginalMember(owner = "client!fda", name = "d", descriptor = "()V", line = 256)
    public final void method3542() {
        byte[] var1 = this.field8939;
        if (this.field8934 == null) {
            for (int var2 = this.field8940 - 1; var2 >= 0; var2--) {
                int var3 = this.field8936 * var2;
                int var4 = (var2 + 1) * this.field8936;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field8934;
            for (int var7 = this.field8940 - 1; var7 >= 0; var7--) {
                int var9 = this.field8936 * var7;
                int var10 = (var7 + 1) * this.field8936;
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
        int var8 = this.field8933;
        this.field8933 = this.field8932;
        this.field8932 = var8;
    }

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "(I)V", line = 318)
    public final void method3543(int arg0) {
        int var2 = -1;
        if (this.field8938.length < 255) {
            for (int var3 = 0; var3 < this.field8938.length; var3++) {
                if (this.field8938[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field8938.length;
                int[] var4 = new int[this.field8938.length + 1];
                class553.method3244(this.field8938, 0, var4, 0, this.field8938.length);
                this.field8938 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field8938.length; var9++) {
                int var15 = this.field8938[var9];
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
        byte[] var11 = new byte[this.field8940 * this.field8936];
        for (int var12 = 0; var12 < this.field8940; var12++) {
            for (int var13 = 0; var13 < this.field8936; var13++) {
                int var14 = this.field8939[var10] & 0xFF;
                if (this.field8938[var14] == 0) {
                    if (var13 > 0 && this.field8938[this.field8939[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field8938[this.field8939[var10 - this.field8936] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field8936 - 1 && this.field8938[this.field8939[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field8940 - 1 && this.field8938[this.field8939[this.field8936 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field8939 = var11;
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(Lvo;II)[Lfda;", line = 445)
    public static final class628[] method3544(class345 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2081(-127, arg2, arg1);
        return var3 == null ? null : method3547(var3);
    }

    @OriginalMember(owner = "client!fda", name = "e", descriptor = "()V", line = 454)
    public final void method3545() {
        byte[] var1 = this.field8939;
        if (this.field8934 == null) {
            for (int var2 = (this.field8940 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field8936 * var2;
                int var4 = (this.field8940 - var2 - 1) * this.field8936;
                for (int var5 = -this.field8936; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field8934;
            for (int var8 = (this.field8940 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field8936 * var8;
                int var11 = (this.field8940 - var8 - 1) * this.field8936;
                for (int var12 = -this.field8936; var12 < 0; var12++) {
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
        int var9 = this.field8935;
        this.field8935 = this.field8937;
        this.field8937 = var9;
    }

    @OriginalMember(owner = "client!fda", name = "f", descriptor = "()[I", line = 524)
    public final int[] method3546() {
        int var1 = this.method3548();
        int[] var2 = new int[var1 * this.method3540()];
        if (this.field8934 == null) {
            for (int var7 = 0; var7 < this.field8940; var7++) {
                int var8 = this.field8936 * var7;
                int var9 = (this.field8935 + var7) * var1 + this.field8933;
                for (int var10 = 0; var10 < this.field8936; var10++) {
                    int var11 = this.field8938[this.field8939[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field8940; var3++) {
                int var4 = this.field8936 * var3;
                int var5 = (this.field8935 + var3) * var1 + this.field8933;
                for (int var6 = 0; var6 < this.field8936; var6++) {
                    var2[var5++] = this.field8934[var4] << 24 | this.field8938[this.field8939[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "([B)[Lfda;", line = 588)
    private static final class628[] method3547(byte[] arg0) {
        class465 var1 = new class465(arg0);
        var1.field6710 = arg0.length - 2;
        int var2 = var1.method2755((byte) -93);
        class628[] var3 = new class628[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class628();
        }
        var1.field6710 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method2755((byte) -57);
        int var6 = var1.method2755((byte) -51);
        int var7 = (var1.method2705(-80) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field8933 = var1.method2755((byte) -57);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field8935 = var1.method2755((byte) -86);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field8936 = var1.method2755((byte) -113);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field8940 = var1.method2755((byte) -93);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class628 var32 = var3[var12];
            var32.field8932 = var5 - var32.field8936 - var32.field8933;
            var32.field8937 = var6 - var32.field8940 - var32.field8935;
        }
        var1.field6710 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method2714(true);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field8938 = var13;
        }
        var1.field6710 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class628 var17 = var3[var16];
            int var18 = var17.field8940 * var17.field8936;
            var17.field8939 = new byte[var18];
            int var19 = var1.method2705(-21);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field8934 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field8939[var24] = var1.method2712(-74);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field8934[var25] = var1.method2712(-64);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field8936; var27++) {
                        for (int var31 = 0; var31 < var17.field8940; var31++) {
                            var17.field8939[var17.field8936 * var31 + var27] = var1.method2712(-109);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field8936; var28++) {
                        for (int var29 = 0; var29 < var17.field8940; var29++) {
                            byte var30 = var17.field8934[var17.field8936 * var29 + var28] = var1.method2712(-91);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field8934 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field8939[var20] = var1.method2712(-92);
                }
            } else {
                for (int var21 = 0; var21 < var17.field8936; var21++) {
                    for (int var22 = 0; var22 < var17.field8940; var22++) {
                        var17.field8939[var17.field8936 * var22 + var21] = var1.method2712(-80);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fda", name = "g", descriptor = "()I", line = 794)
    public final int method3548() {
        return this.field8936 + this.field8933 + this.field8932;
    }

    @OriginalMember(owner = "client!fda", name = "c", descriptor = "(I)V", line = 800)
    public final void method3549(int arg0) {
        int var2 = -1;
        if (this.field8938.length < 255) {
            for (int var3 = 0; var3 < this.field8938.length; var3++) {
                if (this.field8938[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field8938.length;
                int[] var4 = new int[this.field8938.length + 1];
                class553.method3244(this.field8938, 0, var4, 0, this.field8938.length);
                this.field8938 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field8938.length; var9++) {
                int var13 = this.field8938[var9];
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
        for (int var10 = this.field8940 - 1; var10 > 0; var10--) {
            int var11 = this.field8936 * var10;
            for (int var12 = this.field8936 - 1; var12 > 0; var12--) {
                if (this.field8938[this.field8939[var11 + var12] & 0xFF] == 0 && this.field8938[this.field8939[var11 + var12 - this.field8936 - 1] & 0xFF] != 0) {
                    this.field8939[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "(Lvo;II)Lfda;", line = 903)
    public static final class628 method3550(class345 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2081(67, arg2, arg1);
        return var3 == null ? null : method3547(var3)[0];
    }
}
