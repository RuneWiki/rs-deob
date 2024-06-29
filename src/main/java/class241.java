import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class241 {

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public int field3277;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public int field3278;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public int field3279;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public int field3280;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public int field3282;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public int field3283;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "[B")
    public byte[] field3281;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "[B")
    public byte[] field3285;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "[I")
    public int[] field3284;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lam;I)Lv;", line = 6)
    public static final class241 method1283(class286 arg0, int arg1) {
        byte[] var2 = arg0.method1699(arg1, 123);
        return var2 == null ? null : method1286(var2)[0];
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "()I", line = 14)
    public final int method1284() {
        return this.field3283 + this.field3280 + this.field3277;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V", line = 19)
    public final void method1285(int arg0) {
        int var2 = this.method1292();
        int var3 = this.method1284();
        if (this.field3282 == var2 && this.field3280 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field3278) {
            var4 = this.field3278;
        }
        int var5 = arg0;
        if (this.field3278 + arg0 + this.field3282 > var2) {
            var5 = var2 - this.field3278 - this.field3282;
        }
        int var6 = arg0;
        if (arg0 > this.field3283) {
            var6 = this.field3283;
        }
        int var7 = arg0;
        if (this.field3283 + arg0 + this.field3280 > var3) {
            var7 = var3 - this.field3283 - this.field3280;
        }
        int var8 = this.field3282 + var4 + var5;
        int var9 = this.field3280 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field3281 == null) {
            for (int var11 = 0; var11 < this.field3280; var11++) {
                int var12 = this.field3282 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field3282; var14++) {
                    var10[var13++] = this.field3285[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field3280; var16++) {
                int var17 = this.field3282 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field3282; var19++) {
                    var15[var18] = this.field3281[var17];
                    var10[var18++] = this.field3285[var17++];
                }
            }
            this.field3281 = var15;
        }
        this.field3278 -= var4;
        this.field3283 -= var6;
        this.field3279 -= var5;
        this.field3277 -= var7;
        this.field3282 = var8;
        this.field3280 = var9;
        this.field3285 = var10;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([B)[Lv;", line = 114)
    private static final class241[] method1286(byte[] arg0) {
        class250 var1 = new class250(arg0);
        var1.field3389 = arg0.length - 2;
        int var2 = var1.method1374(-2);
        class241[] var3 = new class241[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class241();
        }
        var1.field3389 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method1374(-2);
        int var6 = var1.method1374(-2);
        int var7 = (var1.method1350(31351) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field3278 = var1.method1374(-2);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field3283 = var1.method1374(-2);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field3282 = var1.method1374(-2);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field3280 = var1.method1374(-2);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class241 var32 = var3[var12];
            var32.field3279 = var5 - var32.field3282 - var32.field3278;
            var32.field3277 = var6 - var32.field3280 - var32.field3283;
        }
        var1.field3389 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method1372(-2);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field3284 = var13;
        }
        var1.field3389 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class241 var17 = var3[var16];
            int var18 = var17.field3282 * var17.field3280;
            var17.field3285 = new byte[var18];
            int var19 = var1.method1350(31351);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field3281 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field3285[var24] = var1.method1363((byte) 9);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field3281[var25] = var1.method1363((byte) 111);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field3282; var27++) {
                        for (int var31 = 0; var31 < var17.field3280; var31++) {
                            var17.field3285[var17.field3282 * var31 + var27] = var1.method1363((byte) -102);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field3282; var28++) {
                        for (int var29 = 0; var29 < var17.field3280; var29++) {
                            byte var30 = var17.field3281[var17.field3282 * var29 + var28] = var1.method1363((byte) 126);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field3281 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field3285[var20] = var1.method1363((byte) -67);
                }
            } else {
                for (int var21 = 0; var21 < var17.field3282; var21++) {
                    for (int var22 = 0; var22 < var17.field3280; var22++) {
                        var17.field3285[var17.field3282 * var22 + var21] = var1.method1363((byte) 113);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "()V", line = 322)
    public final void method1287() {
        byte[] var1 = this.field3285;
        if (this.field3281 == null) {
            for (int var2 = this.field3280 - 1; var2 >= 0; var2--) {
                int var3 = this.field3282 * var2;
                int var4 = (var2 + 1) * this.field3282;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field3281;
            for (int var7 = this.field3280 - 1; var7 >= 0; var7--) {
                int var9 = this.field3282 * var7;
                int var10 = (var7 + 1) * this.field3282;
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
        int var8 = this.field3278;
        this.field3278 = this.field3279;
        this.field3279 = var8;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V", line = 385)
    public final void method1288(int arg0) {
        int var2 = -1;
        if (this.field3284.length < 255) {
            for (int var3 = 0; var3 < this.field3284.length; var3++) {
                if (this.field3284[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field3284.length;
                int[] var4 = new int[this.field3284.length + 1];
                class358.method2184(this.field3284, 0, var4, 0, this.field3284.length);
                this.field3284 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field3284.length; var9++) {
                int var15 = this.field3284[var9];
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
        byte[] var11 = new byte[this.field3282 * this.field3280];
        for (int var12 = 0; var12 < this.field3280; var12++) {
            for (int var13 = 0; var13 < this.field3282; var13++) {
                int var14 = this.field3285[var10] & 0xFF;
                if (this.field3284[var14] == 0) {
                    if (var13 > 0 && this.field3284[this.field3285[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field3284[this.field3285[var10 - this.field3282] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field3282 - 1 && this.field3284[this.field3285[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field3280 - 1 && this.field3284[this.field3285[this.field3282 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field3285 = var11;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lam;II)Lv;", line = 511)
    public static final class241 method1289(class286 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1687(arg2, arg1, 255);
        return var3 == null ? null : method1286(var3)[0];
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "()V", line = 520)
    public final void method1290() {
        byte[] var1 = new byte[this.field3282 * this.field3280];
        int var2 = 0;
        if (this.field3281 == null) {
            for (int var3 = 0; var3 < this.field3282; var3++) {
                for (int var4 = this.field3280 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field3285[this.field3282 * var4 + var3];
                }
            }
            this.field3285 = var1;
        } else {
            byte[] var5 = new byte[this.field3282 * this.field3280];
            for (int var6 = 0; var6 < this.field3282; var6++) {
                for (int var9 = this.field3280 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field3285[this.field3282 * var9 + var6];
                    var5[var2++] = this.field3281[this.field3282 * var9 + var6];
                }
            }
            this.field3285 = var1;
            this.field3281 = var5;
        }
        int var7 = this.field3283;
        this.field3283 = this.field3278;
        this.field3278 = this.field3277;
        this.field3277 = this.field3279;
        this.field3279 = this.field3283;
        int var8 = this.field3280;
        this.field3280 = this.field3282;
        this.field3282 = var8;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(Lam;II)[Lv;", line = 581)
    public static final class241[] method1291(class286 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1687(arg2, arg1, 255);
        return var3 == null ? null : method1286(var3);
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "()I", line = 588)
    public final int method1292() {
        return this.field3282 + this.field3278 + this.field3279;
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(I)V", line = 592)
    public final void method1293(int arg0) {
        int var2 = -1;
        if (this.field3284.length < 255) {
            for (int var3 = 0; var3 < this.field3284.length; var3++) {
                if (this.field3284[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field3284.length;
                int[] var4 = new int[this.field3284.length + 1];
                class358.method2184(this.field3284, 0, var4, 0, this.field3284.length);
                this.field3284 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field3284.length; var9++) {
                int var13 = this.field3284[var9];
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
        for (int var10 = this.field3280 - 1; var10 > 0; var10--) {
            int var11 = this.field3282 * var10;
            for (int var12 = this.field3282 - 1; var12 > 0; var12--) {
                if (this.field3284[this.field3285[var11 + var12] & 0xFF] == 0 && this.field3284[this.field3285[var11 + var12 - this.field3282 - 1] & 0xFF] != 0) {
                    this.field3285[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "()V", line = 697)
    public final void method1294() {
        int var1 = this.method1292();
        int var2 = this.method1284();
        if (this.field3282 == var1 && this.field3280 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field3281 == null) {
            for (int var9 = 0; var9 < this.field3280; var9++) {
                int var10 = this.field3282 * var9;
                int var11 = (this.field3283 + var9) * var1 + this.field3278;
                for (int var12 = 0; var12 < this.field3282; var12++) {
                    var3[var11++] = this.field3285[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field3280; var5++) {
                int var6 = this.field3282 * var5;
                int var7 = (this.field3283 + var5) * var1 + this.field3278;
                for (int var8 = 0; var8 < this.field3282; var8++) {
                    var3[var7] = this.field3285[var6];
                    var4[var7++] = this.field3281[var6++];
                }
            }
            this.field3281 = var4;
        }
        this.field3278 = this.field3279 = this.field3283 = this.field3277 = 0;
        this.field3282 = var1;
        this.field3280 = var2;
        this.field3285 = var3;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(Lam;I)[Lv;", line = 767)
    public static final class241[] method1295(class286 arg0, int arg1) {
        byte[] var2 = arg0.method1699(arg1, 104);
        return var2 == null ? null : method1286(var2);
    }

    @OriginalMember(owner = "client!v", name = "f", descriptor = "()V", line = 777)
    public final void method1296() {
        byte[] var1 = this.field3285;
        if (this.field3281 == null) {
            for (int var2 = (this.field3280 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field3282 * var2;
                int var4 = (this.field3280 - var2 - 1) * this.field3282;
                for (int var5 = -this.field3282; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field3281;
            for (int var8 = (this.field3280 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field3282 * var8;
                int var11 = (this.field3280 - var8 - 1) * this.field3282;
                for (int var12 = -this.field3282; var12 < 0; var12++) {
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
        int var9 = this.field3283;
        this.field3283 = this.field3277;
        this.field3277 = var9;
    }

    @OriginalMember(owner = "client!v", name = "g", descriptor = "()[I", line = 850)
    public final int[] method1297() {
        int var1 = this.method1292();
        int[] var2 = new int[var1 * this.method1284()];
        if (this.field3281 == null) {
            for (int var7 = 0; var7 < this.field3280; var7++) {
                int var8 = this.field3282 * var7;
                int var9 = (this.field3283 + var7) * var1 + this.field3278;
                for (int var10 = 0; var10 < this.field3282; var10++) {
                    int var11 = this.field3284[this.field3285[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field3280; var3++) {
                int var4 = this.field3282 * var3;
                int var5 = (this.field3283 + var3) * var1 + this.field3278;
                for (int var6 = 0; var6 < this.field3282; var6++) {
                    var2[var5++] = this.field3281[var4] << 24 | this.field3284[this.field3285[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }
}
