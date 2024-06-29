import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class3 {

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
    public int field10;

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "I")
    public int field12;

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "I")
    public int field14;

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "I")
    public int field15;

    @OriginalMember(owner = "client!dp", name = "h", descriptor = "I")
    public int field16;

    @OriginalMember(owner = "client!dp", name = "i", descriptor = "I")
    public int field17;

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "[B")
    public byte[] field11;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "[B")
    public byte[] field9;

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "[I")
    public int[] field13;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "()V")
    public final void method9() {
        byte[] var1 = this.field11;
        if (this.field9 == null) {
            for (int var2 = this.field14 - 1; var2 >= 0; var2--) {
                int var3 = this.field15 * var2;
                int var4 = (var2 + 1) * this.field15;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field9;
            for (int var7 = this.field14 - 1; var7 >= 0; var7--) {
                int var9 = this.field15 * var7;
                int var10 = (var7 + 1) * this.field15;
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
        int var8 = this.field12;
        this.field12 = this.field17;
        this.field17 = var8;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Ldn;I)[Ldp;")
    public static final class3[] method10(class438 arg0, int arg1) {
        byte[] var2 = arg0.method2560(arg1, -6914);
        return var2 == null ? null : method13(var2);
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "()V")
    public final void method11() {
        int var1 = this.method15();
        int var2 = this.method20();
        if (this.field15 == var1 && this.field14 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field9 == null) {
            for (int var9 = 0; var9 < this.field14; var9++) {
                int var10 = this.field15 * var9;
                int var11 = (this.field10 + var9) * var1 + this.field12;
                for (int var12 = 0; var12 < this.field15; var12++) {
                    var3[var11++] = this.field11[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field14; var5++) {
                int var6 = this.field15 * var5;
                int var7 = (this.field10 + var5) * var1 + this.field12;
                for (int var8 = 0; var8 < this.field15; var8++) {
                    var3[var7] = this.field11[var6];
                    var4[var7++] = this.field9[var6++];
                }
            }
            this.field9 = var4;
        }
        this.field12 = this.field17 = this.field10 = this.field16 = 0;
        this.field15 = var1;
        this.field14 = var2;
        this.field11 = var3;
    }

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "()V")
    public final void method12() {
        byte[] var1 = this.field11;
        if (this.field9 == null) {
            for (int var2 = (this.field14 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field15 * var2;
                int var4 = (this.field14 - var2 - 1) * this.field15;
                for (int var5 = -this.field15; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field9;
            for (int var8 = (this.field14 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field15 * var8;
                int var11 = (this.field14 - var8 - 1) * this.field15;
                for (int var12 = -this.field15; var12 < 0; var12++) {
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
        int var9 = this.field10;
        this.field10 = this.field16;
        this.field16 = var9;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "([B)[Ldp;")
    private static final class3[] method13(byte[] arg0) {
        class374 var1 = new class374(arg0);
        var1.field4966 = arg0.length - 2;
        int var2 = var1.method2136(false);
        class3[] var3 = new class3[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class3();
        }
        var1.field4966 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method2136(false);
        int var6 = var1.method2136(false);
        int var7 = (var1.method2129(-86) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field12 = var1.method2136(false);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field10 = var1.method2136(false);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field15 = var1.method2136(false);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field14 = var1.method2136(false);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class3 var32 = var3[var12];
            var32.field17 = var5 - var32.field15 - var32.field12;
            var32.field16 = var6 - var32.field14 - var32.field10;
        }
        var1.field4966 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method2128(true);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field13 = var13;
        }
        var1.field4966 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class3 var17 = var3[var16];
            int var18 = var17.field15 * var17.field14;
            var17.field11 = new byte[var18];
            int var19 = var1.method2129(-127);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field9 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field11[var24] = var1.method2124(-127);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field9[var25] = var1.method2124(82);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field15; var27++) {
                        for (int var31 = 0; var31 < var17.field14; var31++) {
                            var17.field11[var17.field15 * var31 + var27] = var1.method2124(-124);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field15; var28++) {
                        for (int var29 = 0; var29 < var17.field14; var29++) {
                            byte var30 = var17.field9[var17.field15 * var29 + var28] = var1.method2124(-121);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field9 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field11[var20] = var1.method2124(-122);
                }
            } else {
                for (int var21 = 0; var21 < var17.field15; var21++) {
                    for (int var22 = 0; var22 < var17.field14; var22++) {
                        var17.field11[var17.field15 * var22 + var21] = var1.method2124(100);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Ldn;II)[Ldp;")
    public static final class3[] method14(class438 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2558(100, arg2, arg1);
        return var3 == null ? null : method13(var3);
    }

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "()I")
    public final int method15() {
        return this.field15 + this.field12 + this.field17;
    }

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "()V")
    public final void method16() {
        byte[] var1 = new byte[this.field15 * this.field14];
        int var2 = 0;
        if (this.field9 == null) {
            for (int var3 = 0; var3 < this.field15; var3++) {
                for (int var4 = this.field14 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field11[this.field15 * var4 + var3];
                }
            }
            this.field11 = var1;
        } else {
            byte[] var5 = new byte[this.field15 * this.field14];
            for (int var6 = 0; var6 < this.field15; var6++) {
                for (int var9 = this.field14 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field11[this.field15 * var9 + var6];
                    var5[var2++] = this.field9[this.field15 * var9 + var6];
                }
            }
            this.field11 = var1;
            this.field9 = var5;
        }
        int var7 = this.field10;
        this.field10 = this.field12;
        this.field12 = this.field16;
        this.field16 = this.field17;
        this.field17 = this.field10;
        int var8 = this.field14;
        this.field14 = this.field15;
        this.field15 = var8;
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(Ldn;I)Ldp;")
    public static final class3 method17(class438 arg0, int arg1) {
        byte[] var2 = arg0.method2560(arg1, -6914);
        return var2 == null ? null : method13(var2)[0];
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(Ldn;II)Ldp;")
    public static final class3 method18(class438 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2558(100, arg2, arg1);
        return var3 == null ? null : method13(var3)[0];
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
    public final void method19(int arg0) {
        int var2 = -1;
        if (this.field13.length < 255) {
            for (int var3 = 0; var3 < this.field13.length; var3++) {
                if (this.field13[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field13.length;
                int[] var4 = new int[this.field13.length + 1];
                class345.method1931(this.field13, 0, var4, 0, this.field13.length);
                this.field13 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field13.length; var9++) {
                int var13 = this.field13[var9];
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
        for (int var10 = this.field14 - 1; var10 > 0; var10--) {
            int var11 = this.field15 * var10;
            for (int var12 = this.field15 - 1; var12 > 0; var12--) {
                if (this.field13[this.field11[var11 + var12] & 0xFF] == 0 && this.field13[this.field11[var11 + var12 - this.field15 - 1] & 0xFF] != 0) {
                    this.field11[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "()I")
    public final int method20() {
        return this.field14 + this.field10 + this.field16;
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)V")
    public final void method21(int arg0) {
        int var2 = -1;
        if (this.field13.length < 255) {
            for (int var3 = 0; var3 < this.field13.length; var3++) {
                if (this.field13[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field13.length;
                int[] var4 = new int[this.field13.length + 1];
                class345.method1931(this.field13, 0, var4, 0, this.field13.length);
                this.field13 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field13.length; var9++) {
                int var15 = this.field13[var9];
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
        byte[] var11 = new byte[this.field15 * this.field14];
        for (int var12 = 0; var12 < this.field14; var12++) {
            for (int var13 = 0; var13 < this.field15; var13++) {
                int var14 = this.field11[var10] & 0xFF;
                if (this.field13[var14] == 0) {
                    if (var13 > 0 && this.field13[this.field11[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field13[this.field11[var10 - this.field15] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field15 - 1 && this.field13[this.field11[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field14 - 1 && this.field13[this.field11[this.field15 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field11 = var11;
    }

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "()[I")
    public final int[] method22() {
        int var1 = this.method15();
        int[] var2 = new int[var1 * this.method20()];
        if (this.field9 == null) {
            for (int var7 = 0; var7 < this.field14; var7++) {
                int var8 = this.field15 * var7;
                int var9 = (this.field10 + var7) * var1 + this.field12;
                for (int var10 = 0; var10 < this.field15; var10++) {
                    int var11 = this.field13[this.field11[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field14; var3++) {
                int var4 = this.field15 * var3;
                int var5 = (this.field10 + var3) * var1 + this.field12;
                for (int var6 = 0; var6 < this.field15; var6++) {
                    var2[var5++] = this.field9[var4] << 24 | this.field13[this.field11[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "(I)V")
    public final void method23(int arg0) {
        int var2 = this.method15();
        int var3 = this.method20();
        if (this.field15 == var2 && this.field14 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field12) {
            var4 = this.field12;
        }
        int var5 = arg0;
        if (this.field12 + arg0 + this.field15 > var2) {
            var5 = var2 - this.field12 - this.field15;
        }
        int var6 = arg0;
        if (arg0 > this.field10) {
            var6 = this.field10;
        }
        int var7 = arg0;
        if (this.field10 + arg0 + this.field14 > var3) {
            var7 = var3 - this.field10 - this.field14;
        }
        int var8 = this.field15 + var4 + var5;
        int var9 = this.field14 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field9 == null) {
            for (int var11 = 0; var11 < this.field14; var11++) {
                int var12 = this.field15 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field15; var14++) {
                    var10[var13++] = this.field11[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field14; var16++) {
                int var17 = this.field15 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field15; var19++) {
                    var15[var18] = this.field9[var17];
                    var10[var18++] = this.field11[var17++];
                }
            }
            this.field9 = var15;
        }
        this.field12 -= var4;
        this.field10 -= var6;
        this.field17 -= var5;
        this.field16 -= var7;
        this.field15 = var8;
        this.field14 = var9;
        this.field11 = var10;
    }
}
