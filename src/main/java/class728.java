import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class728 {

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public int field10128;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public int field10129;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public int field10130;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public int field10132;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public int field10135;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
    public int field10136;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "[B")
    public byte[] field10133;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "[B")
    public byte[] field10134;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "[I")
    public int[] field10131;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "()V", line = 8)
    public final void method4053() {
        byte[] var1 = this.field10134;
        if (this.field10133 == null) {
            for (int var2 = (this.field10132 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field10135 * var2;
                int var4 = (this.field10132 - var2 - 1) * this.field10135;
                for (int var5 = -this.field10135; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field10133;
            for (int var8 = (this.field10132 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field10135 * var8;
                int var11 = (this.field10132 - var8 - 1) * this.field10135;
                for (int var12 = -this.field10135; var12 < 0; var12++) {
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
        int var9 = this.field10128;
        this.field10128 = this.field10130;
        this.field10130 = var9;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lnd;I)Lhb;", line = 78)
    public static final class728 method4054(class547 arg0, int arg1) {
        byte[] var2 = arg0.method3166((byte) 125, arg1);
        return var2 == null ? null : method4060(var2)[0];
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "()I", line = 85)
    public final int method4055() {
        return this.field10135 + this.field10129 + this.field10136;
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "()[I", line = 92)
    public final int[] method4056() {
        int var1 = this.method4055();
        int[] var2 = new int[var1 * this.method4061()];
        if (this.field10133 == null) {
            for (int var7 = 0; var7 < this.field10132; var7++) {
                int var8 = this.field10135 * var7;
                int var9 = (this.field10128 + var7) * var1 + this.field10129;
                for (int var10 = 0; var10 < this.field10135; var10++) {
                    int var11 = this.field10131[this.field10134[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field10132; var3++) {
                int var4 = this.field10135 * var3;
                int var5 = (this.field10128 + var3) * var1 + this.field10129;
                for (int var6 = 0; var6 < this.field10135; var6++) {
                    var2[var5++] = this.field10133[var4] << 24 | this.field10131[this.field10134[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "()V", line = 155)
    public final void method4057() {
        byte[] var1 = new byte[this.field10135 * this.field10132];
        int var2 = 0;
        if (this.field10133 == null) {
            for (int var3 = 0; var3 < this.field10135; var3++) {
                for (int var4 = this.field10132 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field10134[this.field10135 * var4 + var3];
                }
            }
            this.field10134 = var1;
        } else {
            byte[] var5 = new byte[this.field10135 * this.field10132];
            for (int var6 = 0; var6 < this.field10135; var6++) {
                for (int var9 = this.field10132 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field10134[this.field10135 * var9 + var6];
                    var5[var2++] = this.field10133[this.field10135 * var9 + var6];
                }
            }
            this.field10134 = var1;
            this.field10133 = var5;
        }
        int var7 = this.field10128;
        this.field10128 = this.field10129;
        this.field10129 = this.field10130;
        this.field10130 = this.field10136;
        this.field10136 = this.field10128;
        int var8 = this.field10132;
        this.field10132 = this.field10135;
        this.field10135 = var8;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(Lnd;I)[Lhb;", line = 216)
    public static final class728[] method4058(class547 arg0, int arg1) {
        byte[] var2 = arg0.method3166((byte) 125, arg1);
        return var2 == null ? null : method4060(var2);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lnd;II)Lhb;", line = 224)
    public static final class728 method4059(class547 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3153(arg2, 0, arg1);
        return var3 == null ? null : method4060(var3)[0];
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "([B)[Lhb;", line = 234)
    private static final class728[] method4060(byte[] arg0) {
        class461 var1 = new class461(arg0);
        var1.field6193 = arg0.length - 2;
        int var2 = var1.method2566(-2);
        class728[] var3 = new class728[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class728();
        }
        var1.field6193 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method2566(-2);
        int var6 = var1.method2566(-2);
        int var7 = (var1.method2600((byte) -126) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field10129 = var1.method2566(-2);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field10128 = var1.method2566(-2);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field10135 = var1.method2566(-2);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field10132 = var1.method2566(-2);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class728 var32 = var3[var12];
            var32.field10136 = var5 - var32.field10135 - var32.field10129;
            var32.field10130 = var6 - var32.field10132 - var32.field10128;
        }
        var1.field6193 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method2576((byte) 88);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field10131 = var13;
        }
        var1.field6193 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class728 var17 = var3[var16];
            int var18 = var17.field10135 * var17.field10132;
            var17.field10134 = new byte[var18];
            int var19 = var1.method2600((byte) -128);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field10133 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field10134[var24] = var1.method2601(0);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field10133[var25] = var1.method2601(0);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field10135; var27++) {
                        for (int var31 = 0; var31 < var17.field10132; var31++) {
                            var17.field10134[var17.field10135 * var31 + var27] = var1.method2601(0);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field10135; var28++) {
                        for (int var29 = 0; var29 < var17.field10132; var29++) {
                            byte var30 = var17.field10133[var17.field10135 * var29 + var28] = var1.method2601(0);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field10133 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field10134[var20] = var1.method2601(0);
                }
            } else {
                for (int var21 = 0; var21 < var17.field10135; var21++) {
                    for (int var22 = 0; var22 < var17.field10132; var22++) {
                        var17.field10134[var17.field10135 * var22 + var21] = var1.method2601(0);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "()I", line = 440)
    public final int method4061() {
        return this.field10132 + this.field10128 + this.field10130;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V", line = 444)
    public final void method4062(int arg0) {
        int var2 = this.method4055();
        int var3 = this.method4061();
        if (this.field10135 == var2 && this.field10132 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field10129) {
            var4 = this.field10129;
        }
        int var5 = arg0;
        if (this.field10129 + arg0 + this.field10135 > var2) {
            var5 = var2 - this.field10129 - this.field10135;
        }
        int var6 = arg0;
        if (arg0 > this.field10128) {
            var6 = this.field10128;
        }
        int var7 = arg0;
        if (this.field10128 + arg0 + this.field10132 > var3) {
            var7 = var3 - this.field10128 - this.field10132;
        }
        int var8 = this.field10135 + var4 + var5;
        int var9 = this.field10132 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field10133 == null) {
            for (int var11 = 0; var11 < this.field10132; var11++) {
                int var12 = this.field10135 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field10135; var14++) {
                    var10[var13++] = this.field10134[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field10132; var16++) {
                int var17 = this.field10135 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field10135; var19++) {
                    var15[var18] = this.field10133[var17];
                    var10[var18++] = this.field10134[var17++];
                }
            }
            this.field10133 = var15;
        }
        this.field10129 -= var4;
        this.field10128 -= var6;
        this.field10136 -= var5;
        this.field10130 -= var7;
        this.field10135 = var8;
        this.field10132 = var9;
        this.field10134 = var10;
    }

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "()V", line = 541)
    public final void method4063() {
        byte[] var1 = this.field10134;
        if (this.field10133 == null) {
            for (int var2 = this.field10132 - 1; var2 >= 0; var2--) {
                int var3 = this.field10135 * var2;
                int var4 = (var2 + 1) * this.field10135;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field10133;
            for (int var7 = this.field10132 - 1; var7 >= 0; var7--) {
                int var9 = this.field10135 * var7;
                int var10 = (var7 + 1) * this.field10135;
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
        int var8 = this.field10129;
        this.field10129 = this.field10136;
        this.field10136 = var8;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V", line = 603)
    public final void method4064(int arg0) {
        int var2 = -1;
        if (this.field10131.length < 255) {
            for (int var3 = 0; var3 < this.field10131.length; var3++) {
                if (this.field10131[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field10131.length;
                int[] var4 = new int[this.field10131.length + 1];
                class135.method995(this.field10131, 0, var4, 0, this.field10131.length);
                this.field10131 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field10131.length; var9++) {
                int var15 = this.field10131[var9];
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
        byte[] var11 = new byte[this.field10135 * this.field10132];
        for (int var12 = 0; var12 < this.field10132; var12++) {
            for (int var13 = 0; var13 < this.field10135; var13++) {
                int var14 = this.field10134[var10] & 0xFF;
                if (this.field10131[var14] == 0) {
                    if (var13 > 0 && this.field10131[this.field10134[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field10131[this.field10134[var10 - this.field10135] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field10135 - 1 && this.field10131[this.field10134[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field10132 - 1 && this.field10131[this.field10134[this.field10135 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field10134 = var11;
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V", line = 729)
    public final void method4065(int arg0) {
        int var2 = -1;
        if (this.field10131.length < 255) {
            for (int var3 = 0; var3 < this.field10131.length; var3++) {
                if (this.field10131[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field10131.length;
                int[] var4 = new int[this.field10131.length + 1];
                class135.method995(this.field10131, 0, var4, 0, this.field10131.length);
                this.field10131 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field10131.length; var9++) {
                int var13 = this.field10131[var9];
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
        for (int var10 = this.field10132 - 1; var10 > 0; var10--) {
            int var11 = this.field10135 * var10;
            for (int var12 = this.field10135 - 1; var12 > 0; var12--) {
                if (this.field10131[this.field10134[var11 + var12] & 0xFF] == 0 && this.field10131[this.field10134[var11 + var12 - this.field10135 - 1] & 0xFF] != 0) {
                    this.field10134[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "()V", line = 832)
    public final void method4066() {
        int var1 = this.method4055();
        int var2 = this.method4061();
        if (this.field10135 == var1 && this.field10132 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field10133 == null) {
            for (int var9 = 0; var9 < this.field10132; var9++) {
                int var10 = this.field10135 * var9;
                int var11 = (this.field10128 + var9) * var1 + this.field10129;
                for (int var12 = 0; var12 < this.field10135; var12++) {
                    var3[var11++] = this.field10134[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field10132; var5++) {
                int var6 = this.field10135 * var5;
                int var7 = (this.field10128 + var5) * var1 + this.field10129;
                for (int var8 = 0; var8 < this.field10135; var8++) {
                    var3[var7] = this.field10134[var6];
                    var4[var7++] = this.field10133[var6++];
                }
            }
            this.field10133 = var4;
        }
        this.field10129 = this.field10136 = this.field10128 = this.field10130 = 0;
        this.field10135 = var1;
        this.field10132 = var2;
        this.field10134 = var3;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(Lnd;II)[Lhb;", line = 903)
    public static final class728[] method4067(class547 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3153(arg2, 0, arg1);
        return var3 == null ? null : method4060(var3);
    }
}
