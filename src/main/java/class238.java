import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class238 {

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public int field3385;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public int field3386;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public int field3387;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public int field3388;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public int field3389;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public int field3392;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "[B")
    public byte[] field3390;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "[B")
    public byte[] field3391;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "[I")
    public int[] field3393;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lnq;II)Llg;", line = 6)
    public static final class238 method1606(class268 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1745(arg2, (byte) 99, arg1);
        return var3 == null ? null : method1613(var3)[0];
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "()[I", line = 14)
    public final int[] method1607() {
        int var1 = this.method1615();
        int[] var2 = new int[var1 * this.method1609()];
        if (this.field3391 == null) {
            for (int var7 = 0; var7 < this.field3392; var7++) {
                int var8 = this.field3388 * var7;
                int var9 = (this.field3387 + var7) * var1 + this.field3385;
                for (int var10 = 0; var10 < this.field3388; var10++) {
                    int var11 = this.field3393[this.field3390[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field3392; var3++) {
                int var4 = this.field3388 * var3;
                int var5 = (this.field3387 + var3) * var1 + this.field3385;
                for (int var6 = 0; var6 < this.field3388; var6++) {
                    var2[var5++] = this.field3391[var4] << 24 | this.field3393[this.field3390[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V", line = 77)
    public final void method1608(int arg0) {
        int var2 = -1;
        if (this.field3393.length < 255) {
            for (int var3 = 0; var3 < this.field3393.length; var3++) {
                if (this.field3393[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field3393.length;
                int[] var4 = new int[this.field3393.length + 1];
                class36.method348(this.field3393, 0, var4, 0, this.field3393.length);
                this.field3393 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field3393.length; var9++) {
                int var13 = this.field3393[var9];
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
        for (int var10 = this.field3392 - 1; var10 > 0; var10--) {
            int var11 = this.field3388 * var10;
            for (int var12 = this.field3388 - 1; var12 > 0; var12--) {
                if (this.field3393[this.field3390[var11 + var12] & 0xFF] == 0 && this.field3393[this.field3390[var11 + var12 - this.field3388 - 1] & 0xFF] != 0) {
                    this.field3390[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "()I", line = 179)
    public final int method1609() {
        return this.field3392 + this.field3387 + this.field3386;
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "()V", line = 184)
    public final void method1610() {
        byte[] var1 = new byte[this.field3392 * this.field3388];
        int var2 = 0;
        if (this.field3391 == null) {
            for (int var3 = 0; var3 < this.field3388; var3++) {
                for (int var4 = this.field3392 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field3390[this.field3388 * var4 + var3];
                }
            }
            this.field3390 = var1;
        } else {
            byte[] var5 = new byte[this.field3392 * this.field3388];
            for (int var6 = 0; var6 < this.field3388; var6++) {
                for (int var9 = this.field3392 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field3390[this.field3388 * var9 + var6];
                    var5[var2++] = this.field3391[this.field3388 * var9 + var6];
                }
            }
            this.field3390 = var1;
            this.field3391 = var5;
        }
        int var7 = this.field3387;
        this.field3387 = this.field3385;
        this.field3385 = this.field3386;
        this.field3386 = this.field3389;
        this.field3389 = this.field3387;
        int var8 = this.field3392;
        this.field3392 = this.field3388;
        this.field3388 = var8;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V", line = 244)
    public final void method1611(int arg0) {
        int var2 = this.method1615();
        int var3 = this.method1609();
        if (this.field3388 == var2 && this.field3392 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field3385) {
            var4 = this.field3385;
        }
        int var5 = arg0;
        if (this.field3385 + arg0 + this.field3388 > var2) {
            var5 = var2 - this.field3385 - this.field3388;
        }
        int var6 = arg0;
        if (arg0 > this.field3387) {
            var6 = this.field3387;
        }
        int var7 = arg0;
        if (this.field3387 + arg0 + this.field3392 > var3) {
            var7 = var3 - this.field3387 - this.field3392;
        }
        int var8 = this.field3388 + var4 + var5;
        int var9 = this.field3392 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field3391 == null) {
            for (int var11 = 0; var11 < this.field3392; var11++) {
                int var12 = this.field3388 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field3388; var14++) {
                    var10[var13++] = this.field3390[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field3392; var16++) {
                int var17 = this.field3388 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field3388; var19++) {
                    var15[var18] = this.field3391[var17];
                    var10[var18++] = this.field3390[var17++];
                }
            }
            this.field3391 = var15;
        }
        this.field3385 -= var4;
        this.field3387 -= var6;
        this.field3389 -= var5;
        this.field3386 -= var7;
        this.field3388 = var8;
        this.field3392 = var9;
        this.field3390 = var10;
    }

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "()V", line = 340)
    public final void method1612() {
        byte[] var1 = this.field3390;
        if (this.field3391 == null) {
            for (int var2 = (this.field3392 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field3388 * var2;
                int var4 = (this.field3392 - var2 - 1) * this.field3388;
                for (int var5 = -this.field3388; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field3391;
            for (int var8 = (this.field3392 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field3388 * var8;
                int var11 = (this.field3392 - var8 - 1) * this.field3388;
                for (int var12 = -this.field3388; var12 < 0; var12++) {
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
        int var9 = this.field3387;
        this.field3387 = this.field3386;
        this.field3386 = var9;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "([B)[Llg;", line = 411)
    private static final class238[] method1613(byte[] arg0) {
        class11 var1 = new class11(arg0);
        var1.field191 = arg0.length - 2;
        int var2 = var1.method174(255);
        class238[] var3 = new class238[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class238();
        }
        var1.field191 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method174(255);
        int var6 = var1.method174(255);
        int var7 = (var1.method172((byte) 52) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field3385 = var1.method174(255);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field3387 = var1.method174(255);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field3388 = var1.method174(255);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field3392 = var1.method174(255);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class238 var32 = var3[var12];
            var32.field3389 = var5 - var32.field3388 - var32.field3385;
            var32.field3386 = var6 - var32.field3392 - var32.field3387;
        }
        var1.field191 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method208(27308);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field3393 = var13;
        }
        var1.field191 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class238 var17 = var3[var16];
            int var18 = var17.field3392 * var17.field3388;
            var17.field3390 = new byte[var18];
            int var19 = var1.method172((byte) 52);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field3391 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field3390[var24] = var1.method162(-4436);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field3391[var25] = var1.method162(-4436);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field3388; var27++) {
                        for (int var31 = 0; var31 < var17.field3392; var31++) {
                            var17.field3390[var17.field3388 * var31 + var27] = var1.method162(-4436);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field3388; var28++) {
                        for (int var29 = 0; var29 < var17.field3392; var29++) {
                            byte var30 = var17.field3391[var17.field3388 * var29 + var28] = var1.method162(-4436);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field3391 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field3390[var20] = var1.method162(-4436);
                }
            } else {
                for (int var21 = 0; var21 < var17.field3388; var21++) {
                    for (int var22 = 0; var22 < var17.field3392; var22++) {
                        var17.field3390[var17.field3388 * var22 + var21] = var1.method162(-4436);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lnq;I)Llg;", line = 620)
    public static final class238 method1614(class268 arg0, int arg1) {
        byte[] var2 = arg0.method1757(-3, arg1);
        return var2 == null ? null : method1613(var2)[0];
    }

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "()I", line = 628)
    public final int method1615() {
        return this.field3388 + this.field3385 + this.field3389;
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)V", line = 633)
    public final void method1616(int arg0) {
        int var2 = -1;
        if (this.field3393.length < 255) {
            for (int var3 = 0; var3 < this.field3393.length; var3++) {
                if (this.field3393[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field3393.length;
                int[] var4 = new int[this.field3393.length + 1];
                class36.method348(this.field3393, 0, var4, 0, this.field3393.length);
                this.field3393 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field3393.length; var9++) {
                int var15 = this.field3393[var9];
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
        byte[] var11 = new byte[this.field3392 * this.field3388];
        for (int var12 = 0; var12 < this.field3392; var12++) {
            for (int var13 = 0; var13 < this.field3388; var13++) {
                int var14 = this.field3390[var10] & 0xFF;
                if (this.field3393[var14] == 0) {
                    if (var13 > 0 && this.field3393[this.field3390[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field3393[this.field3390[var10 - this.field3388] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field3388 - 1 && this.field3393[this.field3390[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field3392 - 1 && this.field3393[this.field3390[this.field3388 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field3390 = var11;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(Lnq;II)[Llg;", line = 758)
    public static final class238[] method1617(class268 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1745(arg2, (byte) 64, arg1);
        return var3 == null ? null : method1613(var3);
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(Lnq;I)[Llg;", line = 767)
    public static final class238[] method1618(class268 arg0, int arg1) {
        byte[] var2 = arg0.method1757(-3, arg1);
        return var2 == null ? null : method1613(var2);
    }

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "()V", line = 777)
    public final void method1619() {
        byte[] var1 = this.field3390;
        if (this.field3391 == null) {
            for (int var2 = this.field3392 - 1; var2 >= 0; var2--) {
                int var3 = this.field3388 * var2;
                int var4 = (var2 + 1) * this.field3388;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field3391;
            for (int var7 = this.field3392 - 1; var7 >= 0; var7--) {
                int var9 = this.field3388 * var7;
                int var10 = (var7 + 1) * this.field3388;
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
        int var8 = this.field3385;
        this.field3385 = this.field3389;
        this.field3389 = var8;
    }

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "()V", line = 841)
    public final void method1620() {
        int var1 = this.method1615();
        int var2 = this.method1609();
        if (this.field3388 == var1 && this.field3392 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field3391 == null) {
            for (int var9 = 0; var9 < this.field3392; var9++) {
                int var10 = this.field3388 * var9;
                int var11 = (this.field3387 + var9) * var1 + this.field3385;
                for (int var12 = 0; var12 < this.field3388; var12++) {
                    var3[var11++] = this.field3390[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field3392; var5++) {
                int var6 = this.field3388 * var5;
                int var7 = (this.field3387 + var5) * var1 + this.field3385;
                for (int var8 = 0; var8 < this.field3388; var8++) {
                    var3[var7] = this.field3390[var6];
                    var4[var7++] = this.field3391[var6++];
                }
            }
            this.field3391 = var4;
        }
        this.field3385 = this.field3389 = this.field3387 = this.field3386 = 0;
        this.field3388 = var1;
        this.field3392 = var2;
        this.field3390 = var3;
    }
}
