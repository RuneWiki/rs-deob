import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class543 {

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "I")
    public int field7373;

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "I")
    public int field7374;

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "I")
    public int field7375;

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "I")
    public int field7377;

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "I")
    public int field7379;

    @OriginalMember(owner = "client!kq", name = "i", descriptor = "I")
    public int field7381;

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "[B")
    public byte[] field7378;

    @OriginalMember(owner = "client!kq", name = "h", descriptor = "[B")
    public byte[] field7380;

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "[I")
    public int[] field7376;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "()V", line = 6)
    public final void method2980() {
        byte[] var1 = this.field7378;
        if (this.field7380 == null) {
            for (int var2 = (this.field7373 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field7377 * var2;
                int var4 = (this.field7373 - var2 - 1) * this.field7377;
                for (int var5 = -this.field7377; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field7380;
            for (int var8 = (this.field7373 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field7377 * var8;
                int var11 = (this.field7373 - var8 - 1) * this.field7377;
                for (int var12 = -this.field7377; var12 < 0; var12++) {
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
        int var9 = this.field7374;
        this.field7374 = this.field7379;
        this.field7379 = var9;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lpj;I)Lkq;", line = 79)
    public static final class543 method2981(class132 arg0, int arg1) {
        byte[] var2 = arg0.method938(arg1, (byte) -53);
        return var2 == null ? null : method2986(var2)[0];
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lpj;II)[Lkq;", line = 87)
    public static final class543[] method2982(class132 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method940(arg1, arg2, 0);
        return var3 == null ? null : method2986(var3);
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(Lpj;I)[Lkq;", line = 95)
    public static final class543[] method2983(class132 arg0, int arg1) {
        byte[] var2 = arg0.method938(arg1, (byte) -53);
        return var2 == null ? null : method2986(var2);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V", line = 109)
    public final void method2984(int arg0) {
        int var2 = -1;
        if (this.field7376.length < 255) {
            for (int var3 = 0; var3 < this.field7376.length; var3++) {
                if (this.field7376[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field7376.length;
                int[] var4 = new int[this.field7376.length + 1];
                class282.method1703(this.field7376, 0, var4, 0, this.field7376.length);
                this.field7376 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field7376.length; var9++) {
                int var13 = this.field7376[var9];
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
        for (int var10 = this.field7373 - 1; var10 > 0; var10--) {
            int var11 = this.field7377 * var10;
            for (int var12 = this.field7377 - 1; var12 > 0; var12--) {
                if (this.field7376[this.field7378[var11 + var12] & 0xFF] == 0 && this.field7376[this.field7378[var11 + var12 - this.field7377 - 1] & 0xFF] != 0) {
                    this.field7378[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)V", line = 213)
    public final void method2985(int arg0) {
        int var2 = this.method2992();
        int var3 = this.method2989();
        if (this.field7377 == var2 && this.field7373 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field7375) {
            var4 = this.field7375;
        }
        int var5 = arg0;
        if (this.field7375 + arg0 + this.field7377 > var2) {
            var5 = var2 - this.field7375 - this.field7377;
        }
        int var6 = arg0;
        if (arg0 > this.field7374) {
            var6 = this.field7374;
        }
        int var7 = arg0;
        if (this.field7374 + arg0 + this.field7373 > var3) {
            var7 = var3 - this.field7374 - this.field7373;
        }
        int var8 = this.field7377 + var4 + var5;
        int var9 = this.field7373 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field7380 == null) {
            for (int var11 = 0; var11 < this.field7373; var11++) {
                int var12 = this.field7377 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field7377; var14++) {
                    var10[var13++] = this.field7378[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field7373; var16++) {
                int var17 = this.field7377 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field7377; var19++) {
                    var15[var18] = this.field7380[var17];
                    var10[var18++] = this.field7378[var17++];
                }
            }
            this.field7380 = var15;
        }
        this.field7375 -= var4;
        this.field7374 -= var6;
        this.field7381 -= var5;
        this.field7379 -= var7;
        this.field7377 = var8;
        this.field7373 = var9;
        this.field7378 = var10;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "([B)[Lkq;", line = 309)
    private static final class543[] method2986(byte[] arg0) {
        class96 var1 = new class96(arg0);
        var1.field1301 = arg0.length - 2;
        int var2 = var1.method743((byte) -70);
        class543[] var3 = new class543[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class543();
        }
        var1.field1301 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method743((byte) -94);
        int var6 = var1.method743((byte) -55);
        int var7 = (var1.method718(-54) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field7375 = var1.method743((byte) -23);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field7374 = var1.method743((byte) -99);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field7377 = var1.method743((byte) -117);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field7373 = var1.method743((byte) -15);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class543 var32 = var3[var12];
            var32.field7381 = var5 - var32.field7377 - var32.field7375;
            var32.field7379 = var6 - var32.field7373 - var32.field7374;
        }
        var1.field1301 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method736(-128);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field7376 = var13;
        }
        var1.field1301 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class543 var17 = var3[var16];
            int var18 = var17.field7377 * var17.field7373;
            var17.field7378 = new byte[var18];
            int var19 = var1.method718(-111);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field7380 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field7378[var24] = var1.method748(-813976688);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field7380[var25] = var1.method748(-813976688);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field7377; var27++) {
                        for (int var31 = 0; var31 < var17.field7373; var31++) {
                            var17.field7378[var17.field7377 * var31 + var27] = var1.method748(-813976688);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field7377; var28++) {
                        for (int var29 = 0; var29 < var17.field7373; var29++) {
                            byte var30 = var17.field7380[var17.field7377 * var29 + var28] = var1.method748(-813976688);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field7380 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field7378[var20] = var1.method748(-813976688);
                }
            } else {
                for (int var21 = 0; var21 < var17.field7377; var21++) {
                    for (int var22 = 0; var22 < var17.field7373; var22++) {
                        var17.field7378[var17.field7377 * var22 + var21] = var1.method748(-813976688);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "()V", line = 516)
    public final void method2987() {
        byte[] var1 = new byte[this.field7377 * this.field7373];
        int var2 = 0;
        if (this.field7380 == null) {
            for (int var3 = 0; var3 < this.field7377; var3++) {
                for (int var4 = this.field7373 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field7378[this.field7377 * var4 + var3];
                }
            }
            this.field7378 = var1;
        } else {
            byte[] var5 = new byte[this.field7377 * this.field7373];
            for (int var6 = 0; var6 < this.field7377; var6++) {
                for (int var9 = this.field7373 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field7378[this.field7377 * var9 + var6];
                    var5[var2++] = this.field7380[this.field7377 * var9 + var6];
                }
            }
            this.field7378 = var1;
            this.field7380 = var5;
        }
        int var7 = this.field7374;
        this.field7374 = this.field7375;
        this.field7375 = this.field7379;
        this.field7379 = this.field7381;
        this.field7381 = this.field7374;
        int var8 = this.field7373;
        this.field7373 = this.field7377;
        this.field7377 = var8;
    }

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "()V", line = 577)
    public final void method2988() {
        byte[] var1 = this.field7378;
        if (this.field7380 == null) {
            for (int var2 = this.field7373 - 1; var2 >= 0; var2--) {
                int var3 = this.field7377 * var2;
                int var4 = (var2 + 1) * this.field7377;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field7380;
            for (int var7 = this.field7373 - 1; var7 >= 0; var7--) {
                int var9 = this.field7377 * var7;
                int var10 = (var7 + 1) * this.field7377;
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
        int var8 = this.field7375;
        this.field7375 = this.field7381;
        this.field7381 = var8;
    }

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "()I", line = 638)
    public final int method2989() {
        return this.field7374 + this.field7373 + this.field7379;
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(Lpj;II)Lkq;", line = 642)
    public static final class543 method2990(class132 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method940(arg1, arg2, 0);
        return var3 == null ? null : method2986(var3)[0];
    }

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "()[I", line = 650)
    public final int[] method2991() {
        int var1 = this.method2992();
        int[] var2 = new int[var1 * this.method2989()];
        if (this.field7380 == null) {
            for (int var7 = 0; var7 < this.field7373; var7++) {
                int var8 = this.field7377 * var7;
                int var9 = (this.field7374 + var7) * var1 + this.field7375;
                for (int var10 = 0; var10 < this.field7377; var10++) {
                    int var11 = this.field7376[this.field7378[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field7373; var3++) {
                int var4 = this.field7377 * var3;
                int var5 = (this.field7374 + var3) * var1 + this.field7375;
                for (int var6 = 0; var6 < this.field7377; var6++) {
                    var2[var5++] = this.field7380[var4] << 24 | this.field7376[this.field7378[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "()I", line = 713)
    public final int method2992() {
        return this.field7377 + this.field7375 + this.field7381;
    }

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "(I)V", line = 717)
    public final void method2993(int arg0) {
        int var2 = -1;
        if (this.field7376.length < 255) {
            for (int var3 = 0; var3 < this.field7376.length; var3++) {
                if (this.field7376[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field7376.length;
                int[] var4 = new int[this.field7376.length + 1];
                class282.method1703(this.field7376, 0, var4, 0, this.field7376.length);
                this.field7376 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field7376.length; var9++) {
                int var15 = this.field7376[var9];
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
        byte[] var11 = new byte[this.field7377 * this.field7373];
        for (int var12 = 0; var12 < this.field7373; var12++) {
            for (int var13 = 0; var13 < this.field7377; var13++) {
                int var14 = this.field7378[var10] & 0xFF;
                if (this.field7376[var14] == 0) {
                    if (var13 > 0 && this.field7376[this.field7378[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field7376[this.field7378[var10 - this.field7377] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field7377 - 1 && this.field7376[this.field7378[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field7373 - 1 && this.field7376[this.field7378[this.field7377 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field7378 = var11;
    }

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "()V", line = 842)
    public final void method2994() {
        int var1 = this.method2992();
        int var2 = this.method2989();
        if (this.field7377 == var1 && this.field7373 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field7380 == null) {
            for (int var9 = 0; var9 < this.field7373; var9++) {
                int var10 = this.field7377 * var9;
                int var11 = (this.field7374 + var9) * var1 + this.field7375;
                for (int var12 = 0; var12 < this.field7377; var12++) {
                    var3[var11++] = this.field7378[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field7373; var5++) {
                int var6 = this.field7377 * var5;
                int var7 = (this.field7374 + var5) * var1 + this.field7375;
                for (int var8 = 0; var8 < this.field7377; var8++) {
                    var3[var7] = this.field7378[var6];
                    var4[var7++] = this.field7380[var6++];
                }
            }
            this.field7380 = var4;
        }
        this.field7375 = this.field7381 = this.field7374 = this.field7379 = 0;
        this.field7377 = var1;
        this.field7373 = var2;
        this.field7378 = var3;
    }
}
