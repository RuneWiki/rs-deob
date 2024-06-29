import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public class class495 {

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "I")
    public int field6188;

    @OriginalMember(owner = "client!iba", name = "d", descriptor = "I")
    public int field6190;

    @OriginalMember(owner = "client!iba", name = "f", descriptor = "I")
    public int field6192;

    @OriginalMember(owner = "client!iba", name = "g", descriptor = "I")
    public int field6193;

    @OriginalMember(owner = "client!iba", name = "h", descriptor = "I")
    public int field6194;

    @OriginalMember(owner = "client!iba", name = "i", descriptor = "I")
    public int field6195;

    @OriginalMember(owner = "client!iba", name = "c", descriptor = "[B")
    public byte[] field6189;

    @OriginalMember(owner = "client!iba", name = "e", descriptor = "[B")
    public byte[] field6191;

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "[I")
    public int[] field6187;

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "()[I", line = 5)
    public final int[] method2686() {
        int var1 = this.method2694();
        int[] var2 = new int[var1 * this.method2697()];
        if (this.field6189 == null) {
            for (int var7 = 0; var7 < this.field6195; var7++) {
                int var8 = this.field6193 * var7;
                int var9 = (this.field6192 + var7) * var1 + this.field6190;
                for (int var10 = 0; var10 < this.field6193; var10++) {
                    int var11 = this.field6187[this.field6191[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field6195; var3++) {
                int var4 = this.field6193 * var3;
                int var5 = (this.field6192 + var3) * var1 + this.field6190;
                for (int var6 = 0; var6 < this.field6193; var6++) {
                    var2[var5++] = this.field6189[var4] << 24 | this.field6187[this.field6191[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(I)V", line = 68)
    public final void method2687(int arg0) {
        int var2 = this.method2694();
        int var3 = this.method2697();
        if (this.field6193 == var2 && this.field6195 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field6190) {
            var4 = this.field6190;
        }
        int var5 = arg0;
        if (this.field6190 + arg0 + this.field6193 > var2) {
            var5 = var2 - this.field6190 - this.field6193;
        }
        int var6 = arg0;
        if (arg0 > this.field6192) {
            var6 = this.field6192;
        }
        int var7 = arg0;
        if (this.field6192 + arg0 + this.field6195 > var3) {
            var7 = var3 - this.field6192 - this.field6195;
        }
        int var8 = this.field6193 + var4 + var5;
        int var9 = this.field6195 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field6189 == null) {
            for (int var11 = 0; var11 < this.field6195; var11++) {
                int var12 = this.field6193 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field6193; var14++) {
                    var10[var13++] = this.field6191[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field6195; var16++) {
                int var17 = this.field6193 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field6193; var19++) {
                    var15[var18] = this.field6189[var17];
                    var10[var18++] = this.field6191[var17++];
                }
            }
            this.field6189 = var15;
        }
        this.field6190 -= var4;
        this.field6192 -= var6;
        this.field6188 -= var5;
        this.field6194 -= var7;
        this.field6193 = var8;
        this.field6195 = var9;
        this.field6191 = var10;
    }

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "()V", line = 163)
    public final void method2688() {
        byte[] var1 = new byte[this.field6195 * this.field6193];
        int var2 = 0;
        if (this.field6189 == null) {
            for (int var3 = 0; var3 < this.field6193; var3++) {
                for (int var4 = this.field6195 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field6191[this.field6193 * var4 + var3];
                }
            }
            this.field6191 = var1;
        } else {
            byte[] var5 = new byte[this.field6195 * this.field6193];
            for (int var6 = 0; var6 < this.field6193; var6++) {
                for (int var9 = this.field6195 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field6191[this.field6193 * var9 + var6];
                    var5[var2++] = this.field6189[this.field6193 * var9 + var6];
                }
            }
            this.field6191 = var1;
            this.field6189 = var5;
        }
        int var7 = this.field6192;
        this.field6192 = this.field6190;
        this.field6190 = this.field6194;
        this.field6194 = this.field6188;
        this.field6188 = this.field6192;
        int var8 = this.field6195;
        this.field6195 = this.field6193;
        this.field6193 = var8;
    }

    @OriginalMember(owner = "client!iba", name = "c", descriptor = "()V", line = 227)
    public final void method2689() {
        byte[] var1 = this.field6191;
        if (this.field6189 == null) {
            for (int var2 = (this.field6195 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field6193 * var2;
                int var4 = (this.field6195 - var2 - 1) * this.field6193;
                for (int var5 = -this.field6193; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field6189;
            for (int var8 = (this.field6195 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field6193 * var8;
                int var11 = (this.field6195 - var8 - 1) * this.field6193;
                for (int var12 = -this.field6193; var12 < 0; var12++) {
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
        int var9 = this.field6192;
        this.field6192 = this.field6194;
        this.field6194 = var9;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(Lpfa;I)[Liba;", line = 297)
    public static final class495[] method2690(class275 arg0, int arg1) {
        byte[] var2 = arg0.method1648(-59, arg1);
        return var2 == null ? null : method2700(var2);
    }

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "(I)V", line = 305)
    public final void method2691(int arg0) {
        int var2 = -1;
        if (this.field6187.length < 255) {
            for (int var3 = 0; var3 < this.field6187.length; var3++) {
                if (this.field6187[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field6187.length;
                int[] var4 = new int[this.field6187.length + 1];
                class70.method556(this.field6187, 0, var4, 0, this.field6187.length);
                this.field6187 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field6187.length; var9++) {
                int var13 = this.field6187[var9];
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
        for (int var10 = this.field6195 - 1; var10 > 0; var10--) {
            int var11 = this.field6193 * var10;
            for (int var12 = this.field6193 - 1; var12 > 0; var12--) {
                if (this.field6187[this.field6191[var11 + var12] & 0xFF] == 0 && this.field6187[this.field6191[var11 + var12 - this.field6193 - 1] & 0xFF] != 0) {
                    this.field6191[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!iba", name = "d", descriptor = "()V", line = 412)
    public final void method2692() {
        byte[] var1 = this.field6191;
        if (this.field6189 == null) {
            for (int var2 = this.field6195 - 1; var2 >= 0; var2--) {
                int var3 = this.field6193 * var2;
                int var4 = (var2 + 1) * this.field6193;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field6189;
            for (int var7 = this.field6195 - 1; var7 >= 0; var7--) {
                int var9 = this.field6193 * var7;
                int var10 = (var7 + 1) * this.field6193;
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
        int var8 = this.field6190;
        this.field6190 = this.field6188;
        this.field6188 = var8;
    }

    @OriginalMember(owner = "client!iba", name = "c", descriptor = "(I)V", line = 476)
    public final void method2693(int arg0) {
        int var2 = -1;
        if (this.field6187.length < 255) {
            for (int var3 = 0; var3 < this.field6187.length; var3++) {
                if (this.field6187[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field6187.length;
                int[] var4 = new int[this.field6187.length + 1];
                class70.method556(this.field6187, 0, var4, 0, this.field6187.length);
                this.field6187 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field6187.length; var9++) {
                int var15 = this.field6187[var9];
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
        byte[] var11 = new byte[this.field6195 * this.field6193];
        for (int var12 = 0; var12 < this.field6195; var12++) {
            for (int var13 = 0; var13 < this.field6193; var13++) {
                int var14 = this.field6191[var10] & 0xFF;
                if (this.field6187[var14] == 0) {
                    if (var13 > 0 && this.field6187[this.field6191[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field6187[this.field6191[var10 - this.field6193] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field6193 - 1 && this.field6187[this.field6191[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field6195 - 1 && this.field6187[this.field6191[this.field6193 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field6191 = var11;
    }

    @OriginalMember(owner = "client!iba", name = "e", descriptor = "()I", line = 600)
    public final int method2694() {
        return this.field6193 + this.field6190 + this.field6188;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(Lpfa;II)Liba;", line = 604)
    public static final class495 method2695(class275 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1659(-39, arg2, arg1);
        return var3 == null ? null : method2700(var3)[0];
    }

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "(Lpfa;I)Liba;", line = 614)
    public static final class495 method2696(class275 arg0, int arg1) {
        byte[] var2 = arg0.method1648(124, arg1);
        return var2 == null ? null : method2700(var2)[0];
    }

    @OriginalMember(owner = "client!iba", name = "f", descriptor = "()I", line = 621)
    public final int method2697() {
        return this.field6195 + this.field6192 + this.field6194;
    }

    @OriginalMember(owner = "client!iba", name = "g", descriptor = "()V", line = 625)
    public final void method2698() {
        int var1 = this.method2694();
        int var2 = this.method2697();
        if (this.field6193 == var1 && this.field6195 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field6189 == null) {
            for (int var9 = 0; var9 < this.field6195; var9++) {
                int var10 = this.field6193 * var9;
                int var11 = (this.field6192 + var9) * var1 + this.field6190;
                for (int var12 = 0; var12 < this.field6193; var12++) {
                    var3[var11++] = this.field6191[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field6195; var5++) {
                int var6 = this.field6193 * var5;
                int var7 = (this.field6192 + var5) * var1 + this.field6190;
                for (int var8 = 0; var8 < this.field6193; var8++) {
                    var3[var7] = this.field6191[var6];
                    var4[var7++] = this.field6189[var6++];
                }
            }
            this.field6189 = var4;
        }
        this.field6190 = this.field6188 = this.field6192 = this.field6194 = 0;
        this.field6193 = var1;
        this.field6195 = var2;
        this.field6191 = var3;
    }

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "(Lpfa;II)[Liba;", line = 698)
    public static final class495[] method2699(class275 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1659(-7, arg2, arg1);
        return var3 == null ? null : method2700(var3);
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "([B)[Liba;", line = 706)
    private static final class495[] method2700(byte[] arg0) {
        class572 var1 = new class572(arg0);
        var1.field7313 = arg0.length - 2;
        int var2 = var1.method3031(-1);
        class495[] var3 = new class495[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class495();
        }
        var1.field7313 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method3031(-1);
        int var6 = var1.method3031(-1);
        int var7 = (var1.method3097((byte) 12) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field6190 = var1.method3031(-1);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field6192 = var1.method3031(-1);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field6193 = var1.method3031(-1);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field6195 = var1.method3031(-1);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class495 var32 = var3[var12];
            var32.field6188 = var5 - var32.field6193 - var32.field6190;
            var32.field6194 = var6 - var32.field6195 - var32.field6192;
        }
        var1.field7313 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method3059(1);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field6187 = var13;
        }
        var1.field7313 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class495 var17 = var3[var16];
            int var18 = var17.field6195 * var17.field6193;
            var17.field6191 = new byte[var18];
            int var19 = var1.method3097((byte) 12);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field6189 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field6191[var24] = var1.method3083(255);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field6189[var25] = var1.method3083(255);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field6193; var27++) {
                        for (int var31 = 0; var31 < var17.field6195; var31++) {
                            var17.field6191[var17.field6193 * var31 + var27] = var1.method3083(255);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field6193; var28++) {
                        for (int var29 = 0; var29 < var17.field6195; var29++) {
                            byte var30 = var17.field6189[var17.field6193 * var29 + var28] = var1.method3083(255);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field6189 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field6191[var20] = var1.method3083(255);
                }
            } else {
                for (int var21 = 0; var21 < var17.field6193; var21++) {
                    for (int var22 = 0; var22 < var17.field6195; var22++) {
                        var17.field6191[var17.field6193 * var22 + var21] = var1.method3083(255);
                    }
                }
            }
        }
        return var3;
    }
}
