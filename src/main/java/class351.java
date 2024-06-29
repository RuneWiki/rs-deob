import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class351 {

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public int field5166;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public int field5167;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public int field5168;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public int field5170;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public int field5171;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public int field5172;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "[B")
    public byte[] field5173;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "[B")
    public byte[] field5174;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "[I")
    public int[] field5169;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Llt;II)Lfd;")
    public static final class351 method2132(class458 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2715(arg2, arg1, false);
        return var3 == null ? null : method2146(var3)[0];
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "()I")
    public final int method2133() {
        return this.field5171 + this.field5168 + this.field5167;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "()V")
    public final void method2134() {
        byte[] var1 = this.field5173;
        if (this.field5174 == null) {
            for (int var2 = (this.field5168 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field5166 * var2;
                int var4 = (this.field5168 - var2 - 1) * this.field5166;
                for (int var5 = -this.field5166; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field5174;
            for (int var8 = (this.field5168 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field5166 * var8;
                int var11 = (this.field5168 - var8 - 1) * this.field5166;
                for (int var12 = -this.field5166; var12 < 0; var12++) {
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
        int var9 = this.field5171;
        this.field5171 = this.field5167;
        this.field5167 = var9;
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "()[I")
    public final int[] method2135() {
        int var1 = this.method2143();
        int[] var2 = new int[var1 * this.method2133()];
        if (this.field5174 == null) {
            for (int var7 = 0; var7 < this.field5168; var7++) {
                int var8 = this.field5166 * var7;
                int var9 = (this.field5171 + var7) * var1 + this.field5170;
                for (int var10 = 0; var10 < this.field5166; var10++) {
                    int var11 = this.field5169[this.field5173[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field5168; var3++) {
                int var4 = this.field5166 * var3;
                int var5 = (this.field5171 + var3) * var1 + this.field5170;
                for (int var6 = 0; var6 < this.field5166; var6++) {
                    var2[var5++] = this.field5174[var4] << 24 | this.field5169[this.field5173[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "()V")
    public final void method2136() {
        int var1 = this.method2143();
        int var2 = this.method2133();
        if (this.field5166 == var1 && this.field5168 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field5174 == null) {
            for (int var9 = 0; var9 < this.field5168; var9++) {
                int var10 = this.field5166 * var9;
                int var11 = (this.field5171 + var9) * var1 + this.field5170;
                for (int var12 = 0; var12 < this.field5166; var12++) {
                    var3[var11++] = this.field5173[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field5168; var5++) {
                int var6 = this.field5166 * var5;
                int var7 = (this.field5171 + var5) * var1 + this.field5170;
                for (int var8 = 0; var8 < this.field5166; var8++) {
                    var3[var7] = this.field5173[var6];
                    var4[var7++] = this.field5174[var6++];
                }
            }
            this.field5174 = var4;
        }
        this.field5170 = this.field5172 = this.field5171 = this.field5167 = 0;
        this.field5166 = var1;
        this.field5168 = var2;
        this.field5173 = var3;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(Llt;II)[Lfd;")
    public static final class351[] method2137(class458 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2715(arg2, arg1, false);
        return var3 == null ? null : method2146(var3);
    }

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "()V")
    public final void method2138() {
        byte[] var1 = this.field5173;
        if (this.field5174 == null) {
            for (int var2 = this.field5168 - 1; var2 >= 0; var2--) {
                int var3 = this.field5166 * var2;
                int var4 = (var2 + 1) * this.field5166;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field5174;
            for (int var7 = this.field5168 - 1; var7 >= 0; var7--) {
                int var9 = this.field5166 * var7;
                int var10 = (var7 + 1) * this.field5166;
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
        int var8 = this.field5170;
        this.field5170 = this.field5172;
        this.field5172 = var8;
    }

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "()V")
    public final void method2139() {
        byte[] var1 = new byte[this.field5168 * this.field5166];
        int var2 = 0;
        if (this.field5174 == null) {
            for (int var3 = 0; var3 < this.field5166; var3++) {
                for (int var4 = this.field5168 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field5173[this.field5166 * var4 + var3];
                }
            }
            this.field5173 = var1;
        } else {
            byte[] var5 = new byte[this.field5168 * this.field5166];
            for (int var6 = 0; var6 < this.field5166; var6++) {
                for (int var9 = this.field5168 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field5173[this.field5166 * var9 + var6];
                    var5[var2++] = this.field5174[this.field5166 * var9 + var6];
                }
            }
            this.field5173 = var1;
            this.field5174 = var5;
        }
        int var7 = this.field5171;
        this.field5171 = this.field5170;
        this.field5170 = this.field5167;
        this.field5167 = this.field5172;
        this.field5172 = this.field5171;
        int var8 = this.field5168;
        this.field5168 = this.field5166;
        this.field5166 = var8;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
    public final void method2140(int arg0) {
        int var2 = this.method2143();
        int var3 = this.method2133();
        if (this.field5166 == var2 && this.field5168 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field5170) {
            var4 = this.field5170;
        }
        int var5 = arg0;
        if (this.field5170 + arg0 + this.field5166 > var2) {
            var5 = var2 - this.field5170 - this.field5166;
        }
        int var6 = arg0;
        if (arg0 > this.field5171) {
            var6 = this.field5171;
        }
        int var7 = arg0;
        if (this.field5171 + arg0 + this.field5168 > var3) {
            var7 = var3 - this.field5171 - this.field5168;
        }
        int var8 = this.field5166 + var4 + var5;
        int var9 = this.field5168 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field5174 == null) {
            for (int var11 = 0; var11 < this.field5168; var11++) {
                int var12 = this.field5166 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field5166; var14++) {
                    var10[var13++] = this.field5173[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field5168; var16++) {
                int var17 = this.field5166 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field5166; var19++) {
                    var15[var18] = this.field5174[var17];
                    var10[var18++] = this.field5173[var17++];
                }
            }
            this.field5174 = var15;
        }
        this.field5170 -= var4;
        this.field5171 -= var6;
        this.field5172 -= var5;
        this.field5167 -= var7;
        this.field5166 = var8;
        this.field5168 = var9;
        this.field5173 = var10;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V")
    public final void method2141(int arg0) {
        int var2 = -1;
        if (this.field5169.length < 255) {
            for (int var3 = 0; var3 < this.field5169.length; var3++) {
                if (this.field5169[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field5169.length;
                int[] var4 = new int[this.field5169.length + 1];
                class356.method2182(this.field5169, 0, var4, 0, this.field5169.length);
                this.field5169 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field5169.length; var9++) {
                int var13 = this.field5169[var9];
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
        for (int var10 = this.field5168 - 1; var10 > 0; var10--) {
            int var11 = this.field5166 * var10;
            for (int var12 = this.field5166 - 1; var12 > 0; var12--) {
                if (this.field5169[this.field5173[var11 + var12] & 0xFF] == 0 && this.field5169[this.field5173[var11 + var12 - this.field5166 - 1] & 0xFF] != 0) {
                    this.field5173[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Llt;I)[Lfd;")
    public static final class351[] method2142(class458 arg0, int arg1) {
        byte[] var2 = arg0.method2734(arg1, (byte) 78);
        return var2 == null ? null : method2146(var2);
    }

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "()I")
    public final int method2143() {
        return this.field5170 + this.field5166 + this.field5172;
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)V")
    public final void method2144(int arg0) {
        int var2 = -1;
        if (this.field5169.length < 255) {
            for (int var3 = 0; var3 < this.field5169.length; var3++) {
                if (this.field5169[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field5169.length;
                int[] var4 = new int[this.field5169.length + 1];
                class356.method2182(this.field5169, 0, var4, 0, this.field5169.length);
                this.field5169 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field5169.length; var9++) {
                int var15 = this.field5169[var9];
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
        byte[] var11 = new byte[this.field5168 * this.field5166];
        for (int var12 = 0; var12 < this.field5168; var12++) {
            for (int var13 = 0; var13 < this.field5166; var13++) {
                int var14 = this.field5173[var10] & 0xFF;
                if (this.field5169[var14] == 0) {
                    if (var13 > 0 && this.field5169[this.field5173[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field5169[this.field5173[var10 - this.field5166] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field5166 - 1 && this.field5169[this.field5173[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field5168 - 1 && this.field5169[this.field5173[this.field5166 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field5173 = var11;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(Llt;I)Lfd;")
    public static final class351 method2145(class458 arg0, int arg1) {
        byte[] var2 = arg0.method2734(arg1, (byte) 78);
        return var2 == null ? null : method2146(var2)[0];
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "([B)[Lfd;")
    private static final class351[] method2146(byte[] arg0) {
        class40 var1 = new class40(arg0);
        var1.field585 = arg0.length - 2;
        int var2 = var1.method254((byte) -48);
        class351[] var3 = new class351[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class351();
        }
        var1.field585 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method254((byte) -37);
        int var6 = var1.method254((byte) -78);
        int var7 = (var1.method257((byte) 25) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field5170 = var1.method254((byte) -73);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field5171 = var1.method254((byte) -31);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field5166 = var1.method254((byte) -42);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field5168 = var1.method254((byte) -115);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class351 var32 = var3[var12];
            var32.field5172 = var5 - var32.field5166 - var32.field5170;
            var32.field5167 = var6 - var32.field5168 - var32.field5171;
        }
        var1.field585 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method224(-2);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field5169 = var13;
        }
        var1.field585 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class351 var17 = var3[var16];
            int var18 = var17.field5168 * var17.field5166;
            var17.field5173 = new byte[var18];
            int var19 = var1.method257((byte) 34);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field5174 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field5173[var24] = var1.method262(-2);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field5174[var25] = var1.method262(-2);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field5166; var27++) {
                        for (int var31 = 0; var31 < var17.field5168; var31++) {
                            var17.field5173[var17.field5166 * var31 + var27] = var1.method262(-2);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field5166; var28++) {
                        for (int var29 = 0; var29 < var17.field5168; var29++) {
                            byte var30 = var17.field5174[var17.field5166 * var29 + var28] = var1.method262(-2);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field5174 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field5173[var20] = var1.method262(-2);
                }
            } else {
                for (int var21 = 0; var21 < var17.field5166; var21++) {
                    for (int var22 = 0; var22 < var17.field5168; var22++) {
                        var17.field5173[var17.field5166 * var22 + var21] = var1.method262(-2);
                    }
                }
            }
        }
        return var3;
    }
}
