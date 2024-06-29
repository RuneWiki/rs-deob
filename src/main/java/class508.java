import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class508 {

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "I")
    public int field7014;

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "I")
    public int field7015;

    @OriginalMember(owner = "client!eu", name = "d", descriptor = "I")
    public int field7016;

    @OriginalMember(owner = "client!eu", name = "e", descriptor = "I")
    public int field7017;

    @OriginalMember(owner = "client!eu", name = "h", descriptor = "I")
    public int field7020;

    @OriginalMember(owner = "client!eu", name = "i", descriptor = "I")
    public int field7021;

    @OriginalMember(owner = "client!eu", name = "f", descriptor = "[B")
    public byte[] field7018;

    @OriginalMember(owner = "client!eu", name = "g", descriptor = "[B")
    public byte[] field7019;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "[I")
    public int[] field7013;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "()I")
    public final int method2936() {
        return this.field7016 + this.field7014 + this.field7021;
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "()V")
    public final void method2937() {
        int var1 = this.method2938();
        int var2 = this.method2936();
        if (this.field7017 == var1 && this.field7014 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field7019 == null) {
            for (int var9 = 0; var9 < this.field7014; var9++) {
                int var10 = this.field7017 * var9;
                int var11 = (this.field7016 + var9) * var1 + this.field7020;
                for (int var12 = 0; var12 < this.field7017; var12++) {
                    var3[var11++] = this.field7018[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field7014; var5++) {
                int var6 = this.field7017 * var5;
                int var7 = (this.field7016 + var5) * var1 + this.field7020;
                for (int var8 = 0; var8 < this.field7017; var8++) {
                    var3[var7] = this.field7018[var6];
                    var4[var7++] = this.field7019[var6++];
                }
            }
            this.field7019 = var4;
        }
        this.field7020 = this.field7015 = this.field7016 = this.field7021 = 0;
        this.field7017 = var1;
        this.field7014 = var2;
        this.field7018 = var3;
    }

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "()I")
    public final int method2938() {
        return this.field7020 + this.field7017 + this.field7015;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)V")
    public final void method2939(int arg0) {
        int var2 = -1;
        if (this.field7013.length < 255) {
            for (int var3 = 0; var3 < this.field7013.length; var3++) {
                if (this.field7013[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field7013.length;
                int[] var4 = new int[this.field7013.length + 1];
                class278.method1798(this.field7013, 0, var4, 0, this.field7013.length);
                this.field7013 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field7013.length; var9++) {
                int var13 = this.field7013[var9];
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
        for (int var10 = this.field7014 - 1; var10 > 0; var10--) {
            int var11 = this.field7017 * var10;
            for (int var12 = this.field7017 - 1; var12 > 0; var12--) {
                if (this.field7013[this.field7018[var11 + var12] & 0xFF] == 0 && this.field7013[this.field7018[var11 + var12 - this.field7017 - 1] & 0xFF] != 0) {
                    this.field7018[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "([B)[Leu;")
    private static final class508[] method2940(byte[] arg0) {
        class376 var1 = new class376(arg0);
        var1.field5459 = arg0.length - 2;
        int var2 = var1.method2359(-1);
        class508[] var3 = new class508[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class508();
        }
        var1.field5459 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method2359(-1);
        int var6 = var1.method2359(-1);
        int var7 = (var1.method2398(-1372747256) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field7020 = var1.method2359(-1);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field7016 = var1.method2359(-1);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field7017 = var1.method2359(-1);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field7014 = var1.method2359(-1);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class508 var32 = var3[var12];
            var32.field7015 = var5 - var32.field7017 - var32.field7020;
            var32.field7021 = var6 - var32.field7014 - var32.field7016;
        }
        var1.field5459 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method2373(1223262424);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field7013 = var13;
        }
        var1.field5459 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class508 var17 = var3[var16];
            int var18 = var17.field7017 * var17.field7014;
            var17.field7018 = new byte[var18];
            int var19 = var1.method2398(-1372747256);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field7019 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field7018[var24] = var1.method2387((byte) 106);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field7019[var25] = var1.method2387((byte) -109);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field7017; var27++) {
                        for (int var31 = 0; var31 < var17.field7014; var31++) {
                            var17.field7018[var17.field7017 * var31 + var27] = var1.method2387((byte) 91);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field7017; var28++) {
                        for (int var29 = 0; var29 < var17.field7014; var29++) {
                            byte var30 = var17.field7019[var17.field7017 * var29 + var28] = var1.method2387((byte) -75);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field7019 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field7018[var20] = var1.method2387((byte) 67);
                }
            } else {
                for (int var21 = 0; var21 < var17.field7017; var21++) {
                    for (int var22 = 0; var22 < var17.field7014; var22++) {
                        var17.field7018[var17.field7017 * var22 + var21] = var1.method2387((byte) 127);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(I)V")
    public final void method2941(int arg0) {
        int var2 = this.method2938();
        int var3 = this.method2936();
        if (this.field7017 == var2 && this.field7014 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field7020) {
            var4 = this.field7020;
        }
        int var5 = arg0;
        if (this.field7020 + arg0 + this.field7017 > var2) {
            var5 = var2 - this.field7020 - this.field7017;
        }
        int var6 = arg0;
        if (arg0 > this.field7016) {
            var6 = this.field7016;
        }
        int var7 = arg0;
        if (this.field7016 + arg0 + this.field7014 > var3) {
            var7 = var3 - this.field7016 - this.field7014;
        }
        int var8 = this.field7017 + var4 + var5;
        int var9 = this.field7014 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field7019 == null) {
            for (int var11 = 0; var11 < this.field7014; var11++) {
                int var12 = this.field7017 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field7017; var14++) {
                    var10[var13++] = this.field7018[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field7014; var16++) {
                int var17 = this.field7017 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field7017; var19++) {
                    var15[var18] = this.field7019[var17];
                    var10[var18++] = this.field7018[var17++];
                }
            }
            this.field7019 = var15;
        }
        this.field7020 -= var4;
        this.field7016 -= var6;
        this.field7015 -= var5;
        this.field7021 -= var7;
        this.field7017 = var8;
        this.field7014 = var9;
        this.field7018 = var10;
    }

    @OriginalMember(owner = "client!eu", name = "d", descriptor = "()V")
    public final void method2942() {
        byte[] var1 = this.field7018;
        if (this.field7019 == null) {
            for (int var2 = this.field7014 - 1; var2 >= 0; var2--) {
                int var3 = this.field7017 * var2;
                int var4 = (var2 + 1) * this.field7017;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field7019;
            for (int var7 = this.field7014 - 1; var7 >= 0; var7--) {
                int var9 = this.field7017 * var7;
                int var10 = (var7 + 1) * this.field7017;
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
        int var8 = this.field7020;
        this.field7020 = this.field7015;
        this.field7015 = var8;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Laj;I)[Leu;")
    public static final class508[] method2943(class333 arg0, int arg1) {
        byte[] var2 = arg0.method2114(arg1, false);
        return var2 == null ? null : method2940(var2);
    }

    @OriginalMember(owner = "client!eu", name = "e", descriptor = "()[I")
    public final int[] method2944() {
        int var1 = this.method2938();
        int[] var2 = new int[var1 * this.method2936()];
        if (this.field7019 == null) {
            for (int var7 = 0; var7 < this.field7014; var7++) {
                int var8 = this.field7017 * var7;
                int var9 = (this.field7016 + var7) * var1 + this.field7020;
                for (int var10 = 0; var10 < this.field7017; var10++) {
                    int var11 = this.field7013[this.field7018[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field7014; var3++) {
                int var4 = this.field7017 * var3;
                int var5 = (this.field7016 + var3) * var1 + this.field7020;
                for (int var6 = 0; var6 < this.field7017; var6++) {
                    var2[var5++] = this.field7019[var4] << 24 | this.field7013[this.field7018[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "(I)V")
    public final void method2945(int arg0) {
        int var2 = -1;
        if (this.field7013.length < 255) {
            for (int var3 = 0; var3 < this.field7013.length; var3++) {
                if (this.field7013[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field7013.length;
                int[] var4 = new int[this.field7013.length + 1];
                class278.method1798(this.field7013, 0, var4, 0, this.field7013.length);
                this.field7013 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field7013.length; var9++) {
                int var15 = this.field7013[var9];
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
        byte[] var11 = new byte[this.field7017 * this.field7014];
        for (int var12 = 0; var12 < this.field7014; var12++) {
            for (int var13 = 0; var13 < this.field7017; var13++) {
                int var14 = this.field7018[var10] & 0xFF;
                if (this.field7013[var14] == 0) {
                    if (var13 > 0 && this.field7013[this.field7018[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field7013[this.field7018[var10 - this.field7017] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field7017 - 1 && this.field7013[this.field7018[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field7014 - 1 && this.field7013[this.field7018[this.field7017 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field7018 = var11;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Laj;II)[Leu;")
    public static final class508[] method2946(class333 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2095(arg2, arg1, 1);
        return var3 == null ? null : method2940(var3);
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(Laj;I)Leu;")
    public static final class508 method2947(class333 arg0, int arg1) {
        byte[] var2 = arg0.method2114(arg1, false);
        return var2 == null ? null : method2940(var2)[0];
    }

    @OriginalMember(owner = "client!eu", name = "f", descriptor = "()V")
    public final void method2948() {
        byte[] var1 = new byte[this.field7017 * this.field7014];
        int var2 = 0;
        if (this.field7019 == null) {
            for (int var3 = 0; var3 < this.field7017; var3++) {
                for (int var4 = this.field7014 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field7018[this.field7017 * var4 + var3];
                }
            }
            this.field7018 = var1;
        } else {
            byte[] var5 = new byte[this.field7017 * this.field7014];
            for (int var6 = 0; var6 < this.field7017; var6++) {
                for (int var9 = this.field7014 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field7018[this.field7017 * var9 + var6];
                    var5[var2++] = this.field7019[this.field7017 * var9 + var6];
                }
            }
            this.field7018 = var1;
            this.field7019 = var5;
        }
        int var7 = this.field7016;
        this.field7016 = this.field7020;
        this.field7020 = this.field7021;
        this.field7021 = this.field7015;
        this.field7015 = this.field7016;
        int var8 = this.field7014;
        this.field7014 = this.field7017;
        this.field7017 = var8;
    }

    @OriginalMember(owner = "client!eu", name = "g", descriptor = "()V")
    public final void method2949() {
        byte[] var1 = this.field7018;
        if (this.field7019 == null) {
            for (int var2 = (this.field7014 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field7017 * var2;
                int var4 = (this.field7014 - var2 - 1) * this.field7017;
                for (int var5 = -this.field7017; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field7019;
            for (int var8 = (this.field7014 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field7017 * var8;
                int var11 = (this.field7014 - var8 - 1) * this.field7017;
                for (int var12 = -this.field7017; var12 < 0; var12++) {
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
        int var9 = this.field7016;
        this.field7016 = this.field7021;
        this.field7021 = var9;
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(Laj;II)Leu;")
    public static final class508 method2950(class333 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2095(arg2, arg1, 1);
        return var3 == null ? null : method2940(var3)[0];
    }
}
