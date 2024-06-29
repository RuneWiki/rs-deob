import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class523 {

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public int field7704;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public int field7706;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public int field7707;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public int field7709;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public int field7710;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public int field7711;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "[B")
    public byte[] field7705;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "[B")
    public byte[] field7708;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "[I")
    public int[] field7712;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lqs;I)Lwh;", line = 4)
    public static final class523 method3085(class496 arg0, int arg1) {
        byte[] var2 = arg0.method2942(arg1, -10365);
        return var2 == null ? null : method3095(var2)[0];
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "()V", line = 12)
    public final void method3086() {
        byte[] var1 = new byte[this.field7709 * this.field7707];
        int var2 = 0;
        if (this.field7708 == null) {
            for (int var3 = 0; var3 < this.field7707; var3++) {
                for (int var4 = this.field7709 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field7705[this.field7707 * var4 + var3];
                }
            }
            this.field7705 = var1;
        } else {
            byte[] var5 = new byte[this.field7709 * this.field7707];
            for (int var6 = 0; var6 < this.field7707; var6++) {
                for (int var9 = this.field7709 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field7705[this.field7707 * var9 + var6];
                    var5[var2++] = this.field7708[this.field7707 * var9 + var6];
                }
            }
            this.field7705 = var1;
            this.field7708 = var5;
        }
        int var7 = this.field7711;
        this.field7711 = this.field7710;
        this.field7710 = this.field7706;
        this.field7706 = this.field7704;
        this.field7704 = this.field7711;
        int var8 = this.field7709;
        this.field7709 = this.field7707;
        this.field7707 = var8;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "()I", line = 75)
    public final int method3087() {
        return this.field7710 + this.field7707 + this.field7704;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V", line = 79)
    public final void method3088(int arg0) {
        int var2 = -1;
        if (this.field7712.length < 255) {
            for (int var3 = 0; var3 < this.field7712.length; var3++) {
                if (this.field7712[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field7712.length;
                int[] var4 = new int[this.field7712.length + 1];
                class85.method612(this.field7712, 0, var4, 0, this.field7712.length);
                this.field7712 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field7712.length; var9++) {
                int var15 = this.field7712[var9];
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
        byte[] var11 = new byte[this.field7709 * this.field7707];
        for (int var12 = 0; var12 < this.field7709; var12++) {
            for (int var13 = 0; var13 < this.field7707; var13++) {
                int var14 = this.field7705[var10] & 0xFF;
                if (this.field7712[var14] == 0) {
                    if (var13 > 0 && this.field7712[this.field7705[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field7712[this.field7705[var10 - this.field7707] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field7707 - 1 && this.field7712[this.field7705[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field7709 - 1 && this.field7712[this.field7705[this.field7707 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field7705 = var11;
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "()V", line = 205)
    public final void method3089() {
        int var1 = this.method3087();
        int var2 = this.method3099();
        if (this.field7707 == var1 && this.field7709 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field7708 == null) {
            for (int var9 = 0; var9 < this.field7709; var9++) {
                int var10 = this.field7707 * var9;
                int var11 = (this.field7711 + var9) * var1 + this.field7710;
                for (int var12 = 0; var12 < this.field7707; var12++) {
                    var3[var11++] = this.field7705[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field7709; var5++) {
                int var6 = this.field7707 * var5;
                int var7 = (this.field7711 + var5) * var1 + this.field7710;
                for (int var8 = 0; var8 < this.field7707; var8++) {
                    var3[var7] = this.field7705[var6];
                    var4[var7++] = this.field7708[var6++];
                }
            }
            this.field7708 = var4;
        }
        this.field7710 = this.field7704 = this.field7711 = this.field7706 = 0;
        this.field7707 = var1;
        this.field7709 = var2;
        this.field7705 = var3;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lqs;II)[Lwh;", line = 273)
    public static final class523[] method3090(class496 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2926(arg2, -87, arg1);
        return var3 == null ? null : method3095(var3);
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(Lqs;I)[Lwh;", line = 284)
    public static final class523[] method3091(class496 arg0, int arg1) {
        byte[] var2 = arg0.method2942(arg1, -10365);
        return var2 == null ? null : method3095(var2);
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "()V", line = 294)
    public final void method3092() {
        byte[] var1 = this.field7705;
        if (this.field7708 == null) {
            for (int var2 = (this.field7709 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field7707 * var2;
                int var4 = (this.field7709 - var2 - 1) * this.field7707;
                for (int var5 = -this.field7707; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field7708;
            for (int var8 = (this.field7709 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field7707 * var8;
                int var11 = (this.field7709 - var8 - 1) * this.field7707;
                for (int var12 = -this.field7707; var12 < 0; var12++) {
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
        int var9 = this.field7711;
        this.field7711 = this.field7706;
        this.field7706 = var9;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(Lqs;II)Lwh;", line = 364)
    public static final class523 method3093(class496 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2926(arg2, -65, arg1);
        return var3 == null ? null : method3095(var3)[0];
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)V", line = 373)
    public final void method3094(int arg0) {
        int var2 = this.method3087();
        int var3 = this.method3099();
        if (this.field7707 == var2 && this.field7709 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field7710) {
            var4 = this.field7710;
        }
        int var5 = arg0;
        if (this.field7710 + arg0 + this.field7707 > var2) {
            var5 = var2 - this.field7710 - this.field7707;
        }
        int var6 = arg0;
        if (arg0 > this.field7711) {
            var6 = this.field7711;
        }
        int var7 = arg0;
        if (this.field7711 + arg0 + this.field7709 > var3) {
            var7 = var3 - this.field7711 - this.field7709;
        }
        int var8 = this.field7707 + var4 + var5;
        int var9 = this.field7709 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field7708 == null) {
            for (int var11 = 0; var11 < this.field7709; var11++) {
                int var12 = this.field7707 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field7707; var14++) {
                    var10[var13++] = this.field7705[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field7709; var16++) {
                int var17 = this.field7707 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field7707; var19++) {
                    var15[var18] = this.field7708[var17];
                    var10[var18++] = this.field7705[var17++];
                }
            }
            this.field7708 = var15;
        }
        this.field7710 -= var4;
        this.field7711 -= var6;
        this.field7704 -= var5;
        this.field7706 -= var7;
        this.field7707 = var8;
        this.field7709 = var9;
        this.field7705 = var10;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "([B)[Lwh;", line = 469)
    private static final class523[] method3095(byte[] arg0) {
        class23 var1 = new class23(arg0);
        var1.field301 = arg0.length - 2;
        int var2 = var1.method132(47);
        class523[] var3 = new class523[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class523();
        }
        var1.field301 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method132(64);
        int var6 = var1.method132(94);
        int var7 = (var1.method126((byte) -124) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field7710 = var1.method132(108);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field7711 = var1.method132(107);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field7707 = var1.method132(80);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field7709 = var1.method132(116);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class523 var32 = var3[var12];
            var32.field7704 = var5 - var32.field7707 - var32.field7710;
            var32.field7706 = var6 - var32.field7709 - var32.field7711;
        }
        var1.field301 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method181(118);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field7712 = var13;
        }
        var1.field301 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class523 var17 = var3[var16];
            int var18 = var17.field7709 * var17.field7707;
            var17.field7705 = new byte[var18];
            int var19 = var1.method126((byte) -96);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field7708 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field7705[var24] = var1.method167(-2);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field7708[var25] = var1.method167(-2);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field7707; var27++) {
                        for (int var31 = 0; var31 < var17.field7709; var31++) {
                            var17.field7705[var17.field7707 * var31 + var27] = var1.method167(-2);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field7707; var28++) {
                        for (int var29 = 0; var29 < var17.field7709; var29++) {
                            byte var30 = var17.field7708[var17.field7707 * var29 + var28] = var1.method167(-2);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field7708 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field7705[var20] = var1.method167(-2);
                }
            } else {
                for (int var21 = 0; var21 < var17.field7707; var21++) {
                    for (int var22 = 0; var22 < var17.field7709; var22++) {
                        var17.field7705[var17.field7707 * var22 + var21] = var1.method167(-2);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "()[I", line = 677)
    public final int[] method3096() {
        int var1 = this.method3087();
        int[] var2 = new int[var1 * this.method3099()];
        if (this.field7708 == null) {
            for (int var7 = 0; var7 < this.field7709; var7++) {
                int var8 = this.field7707 * var7;
                int var9 = (this.field7711 + var7) * var1 + this.field7710;
                for (int var10 = 0; var10 < this.field7707; var10++) {
                    int var11 = this.field7712[this.field7705[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field7709; var3++) {
                int var4 = this.field7707 * var3;
                int var5 = (this.field7711 + var3) * var1 + this.field7710;
                for (int var6 = 0; var6 < this.field7707; var6++) {
                    var2[var5++] = this.field7708[var4] << 24 | this.field7712[this.field7705[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "()V", line = 742)
    public final void method3097() {
        byte[] var1 = this.field7705;
        if (this.field7708 == null) {
            for (int var2 = this.field7709 - 1; var2 >= 0; var2--) {
                int var3 = this.field7707 * var2;
                int var4 = (var2 + 1) * this.field7707;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field7708;
            for (int var7 = this.field7709 - 1; var7 >= 0; var7--) {
                int var9 = this.field7707 * var7;
                int var10 = (var7 + 1) * this.field7707;
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
        int var8 = this.field7710;
        this.field7710 = this.field7704;
        this.field7704 = var8;
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)V", line = 804)
    public final void method3098(int arg0) {
        int var2 = -1;
        if (this.field7712.length < 255) {
            for (int var3 = 0; var3 < this.field7712.length; var3++) {
                if (this.field7712[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field7712.length;
                int[] var4 = new int[this.field7712.length + 1];
                class85.method612(this.field7712, 0, var4, 0, this.field7712.length);
                this.field7712 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field7712.length; var9++) {
                int var13 = this.field7712[var9];
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
        for (int var10 = this.field7709 - 1; var10 > 0; var10--) {
            int var11 = this.field7707 * var10;
            for (int var12 = this.field7707 - 1; var12 > 0; var12--) {
                if (this.field7712[this.field7705[var11 + var12] & 0xFF] == 0 && this.field7712[this.field7705[var11 + var12 - this.field7707 - 1] & 0xFF] != 0) {
                    this.field7705[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "()I", line = 906)
    public final int method3099() {
        return this.field7711 + this.field7709 + this.field7706;
    }
}
