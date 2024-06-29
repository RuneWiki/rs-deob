import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class375 {

    @OriginalMember(owner = "client!go", name = "a", descriptor = "I")
    public int field5260;

    @OriginalMember(owner = "client!go", name = "b", descriptor = "I")
    public int field5261;

    @OriginalMember(owner = "client!go", name = "c", descriptor = "I")
    public int field5262;

    @OriginalMember(owner = "client!go", name = "d", descriptor = "I")
    public int field5263;

    @OriginalMember(owner = "client!go", name = "e", descriptor = "I")
    public int field5264;

    @OriginalMember(owner = "client!go", name = "i", descriptor = "I")
    public int field5268;

    @OriginalMember(owner = "client!go", name = "f", descriptor = "[B")
    public byte[] field5265;

    @OriginalMember(owner = "client!go", name = "g", descriptor = "[B")
    public byte[] field5266;

    @OriginalMember(owner = "client!go", name = "h", descriptor = "[I")
    public int[] field5267;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)V")
    public final void method2389(int arg0) {
        int var2 = this.method2400();
        int var3 = this.method2399();
        if (this.field5261 == var2 && this.field5262 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field5263) {
            var4 = this.field5263;
        }
        int var5 = arg0;
        if (this.field5263 + arg0 + this.field5261 > var2) {
            var5 = var2 - this.field5263 - this.field5261;
        }
        int var6 = arg0;
        if (arg0 > this.field5260) {
            var6 = this.field5260;
        }
        int var7 = arg0;
        if (this.field5260 + arg0 + this.field5262 > var3) {
            var7 = var3 - this.field5260 - this.field5262;
        }
        int var8 = this.field5261 + var4 + var5;
        int var9 = this.field5262 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field5265 == null) {
            for (int var11 = 0; var11 < this.field5262; var11++) {
                int var12 = this.field5261 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field5261; var14++) {
                    var10[var13++] = this.field5266[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field5262; var16++) {
                int var17 = this.field5261 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field5261; var19++) {
                    var15[var18] = this.field5265[var17];
                    var10[var18++] = this.field5266[var17++];
                }
            }
            this.field5265 = var15;
        }
        this.field5263 -= var4;
        this.field5260 -= var6;
        this.field5264 -= var5;
        this.field5268 -= var7;
        this.field5261 = var8;
        this.field5262 = var9;
        this.field5266 = var10;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "()V")
    public final void method2390() {
        byte[] var1 = this.field5266;
        if (this.field5265 == null) {
            for (int var2 = this.field5262 - 1; var2 >= 0; var2--) {
                int var3 = this.field5261 * var2;
                int var4 = (var2 + 1) * this.field5261;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field5265;
            for (int var7 = this.field5262 - 1; var7 >= 0; var7--) {
                int var9 = this.field5261 * var7;
                int var10 = (var7 + 1) * this.field5261;
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
        int var8 = this.field5263;
        this.field5263 = this.field5264;
        this.field5264 = var8;
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(I)V")
    public final void method2391(int arg0) {
        int var2 = -1;
        if (this.field5267.length < 255) {
            for (int var3 = 0; var3 < this.field5267.length; var3++) {
                if (this.field5267[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field5267.length;
                int[] var4 = new int[this.field5267.length + 1];
                class316.method2072(this.field5267, 0, var4, 0, this.field5267.length);
                this.field5267 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field5267.length; var9++) {
                int var15 = this.field5267[var9];
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
        byte[] var11 = new byte[this.field5262 * this.field5261];
        for (int var12 = 0; var12 < this.field5262; var12++) {
            for (int var13 = 0; var13 < this.field5261; var13++) {
                int var14 = this.field5266[var10] & 0xFF;
                if (this.field5267[var14] == 0) {
                    if (var13 > 0 && this.field5267[this.field5266[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field5267[this.field5266[var10 - this.field5261] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field5261 - 1 && this.field5267[this.field5266[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field5262 - 1 && this.field5267[this.field5266[this.field5261 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field5266 = var11;
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "()V")
    public final void method2392() {
        int var1 = this.method2400();
        int var2 = this.method2399();
        if (this.field5261 == var1 && this.field5262 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field5265 == null) {
            for (int var9 = 0; var9 < this.field5262; var9++) {
                int var10 = this.field5261 * var9;
                int var11 = (this.field5260 + var9) * var1 + this.field5263;
                for (int var12 = 0; var12 < this.field5261; var12++) {
                    var3[var11++] = this.field5266[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field5262; var5++) {
                int var6 = this.field5261 * var5;
                int var7 = (this.field5260 + var5) * var1 + this.field5263;
                for (int var8 = 0; var8 < this.field5261; var8++) {
                    var3[var7] = this.field5266[var6];
                    var4[var7++] = this.field5265[var6++];
                }
            }
            this.field5265 = var4;
        }
        this.field5263 = this.field5264 = this.field5260 = this.field5268 = 0;
        this.field5261 = var1;
        this.field5262 = var2;
        this.field5266 = var3;
    }

    @OriginalMember(owner = "client!go", name = "c", descriptor = "()[I")
    public final int[] method2393() {
        int var1 = this.method2400();
        int[] var2 = new int[var1 * this.method2399()];
        if (this.field5265 == null) {
            for (int var7 = 0; var7 < this.field5262; var7++) {
                int var8 = this.field5261 * var7;
                int var9 = (this.field5260 + var7) * var1 + this.field5263;
                for (int var10 = 0; var10 < this.field5261; var10++) {
                    int var11 = this.field5267[this.field5266[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field5262; var3++) {
                int var4 = this.field5261 * var3;
                int var5 = (this.field5260 + var3) * var1 + this.field5263;
                for (int var6 = 0; var6 < this.field5261; var6++) {
                    var2[var5++] = this.field5265[var4] << 24 | this.field5267[this.field5266[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Ltq;I)Lgo;")
    public static final class375 method2394(class376 arg0, int arg1) {
        byte[] var2 = arg0.method2420(arg1, -1);
        return var2 == null ? null : method2398(var2)[0];
    }

    @OriginalMember(owner = "client!go", name = "c", descriptor = "(I)V")
    public final void method2395(int arg0) {
        int var2 = -1;
        if (this.field5267.length < 255) {
            for (int var3 = 0; var3 < this.field5267.length; var3++) {
                if (this.field5267[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field5267.length;
                int[] var4 = new int[this.field5267.length + 1];
                class316.method2072(this.field5267, 0, var4, 0, this.field5267.length);
                this.field5267 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field5267.length; var9++) {
                int var13 = this.field5267[var9];
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
        for (int var10 = this.field5262 - 1; var10 > 0; var10--) {
            int var11 = this.field5261 * var10;
            for (int var12 = this.field5261 - 1; var12 > 0; var12--) {
                if (this.field5267[this.field5266[var11 + var12] & 0xFF] == 0 && this.field5267[this.field5266[var11 + var12 - this.field5261 - 1] & 0xFF] != 0) {
                    this.field5266[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "d", descriptor = "()V")
    public final void method2396() {
        byte[] var1 = new byte[this.field5262 * this.field5261];
        int var2 = 0;
        if (this.field5265 == null) {
            for (int var3 = 0; var3 < this.field5261; var3++) {
                for (int var4 = this.field5262 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field5266[this.field5261 * var4 + var3];
                }
            }
            this.field5266 = var1;
        } else {
            byte[] var5 = new byte[this.field5262 * this.field5261];
            for (int var6 = 0; var6 < this.field5261; var6++) {
                for (int var9 = this.field5262 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field5266[this.field5261 * var9 + var6];
                    var5[var2++] = this.field5265[this.field5261 * var9 + var6];
                }
            }
            this.field5266 = var1;
            this.field5265 = var5;
        }
        int var7 = this.field5260;
        this.field5260 = this.field5263;
        this.field5263 = this.field5268;
        this.field5268 = this.field5264;
        this.field5264 = this.field5260;
        int var8 = this.field5262;
        this.field5262 = this.field5261;
        this.field5261 = var8;
    }

    @OriginalMember(owner = "client!go", name = "e", descriptor = "()V")
    public final void method2397() {
        byte[] var1 = this.field5266;
        if (this.field5265 == null) {
            for (int var2 = (this.field5262 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field5261 * var2;
                int var4 = (this.field5262 - var2 - 1) * this.field5261;
                for (int var5 = -this.field5261; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field5265;
            for (int var8 = (this.field5262 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field5261 * var8;
                int var11 = (this.field5262 - var8 - 1) * this.field5261;
                for (int var12 = -this.field5261; var12 < 0; var12++) {
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
        int var9 = this.field5260;
        this.field5260 = this.field5268;
        this.field5268 = var9;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "([B)[Lgo;")
    private static final class375[] method2398(byte[] arg0) {
        class236 var1 = new class236(arg0);
        var1.field3320 = arg0.length - 2;
        int var2 = var1.method1617((byte) 48);
        class375[] var3 = new class375[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class375();
        }
        var1.field3320 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method1617((byte) 48);
        int var6 = var1.method1617((byte) 48);
        int var7 = (var1.method1574(-127) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field5263 = var1.method1617((byte) 48);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field5260 = var1.method1617((byte) 48);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field5261 = var1.method1617((byte) 48);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field5262 = var1.method1617((byte) 48);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class375 var32 = var3[var12];
            var32.field5264 = var5 - var32.field5261 - var32.field5263;
            var32.field5268 = var6 - var32.field5262 - var32.field5260;
        }
        var1.field3320 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method1616(false);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field5267 = var13;
        }
        var1.field3320 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class375 var17 = var3[var16];
            int var18 = var17.field5262 * var17.field5261;
            var17.field5266 = new byte[var18];
            int var19 = var1.method1574(-30);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field5265 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field5266[var24] = var1.method1589(false);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field5265[var25] = var1.method1589(false);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field5261; var27++) {
                        for (int var31 = 0; var31 < var17.field5262; var31++) {
                            var17.field5266[var17.field5261 * var31 + var27] = var1.method1589(false);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field5261; var28++) {
                        for (int var29 = 0; var29 < var17.field5262; var29++) {
                            byte var30 = var17.field5265[var17.field5261 * var29 + var28] = var1.method1589(false);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field5265 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field5266[var20] = var1.method1589(false);
                }
            } else {
                for (int var21 = 0; var21 < var17.field5261; var21++) {
                    for (int var22 = 0; var22 < var17.field5262; var22++) {
                        var17.field5266[var17.field5261 * var22 + var21] = var1.method1589(false);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!go", name = "f", descriptor = "()I")
    public final int method2399() {
        return this.field5262 + this.field5260 + this.field5268;
    }

    @OriginalMember(owner = "client!go", name = "g", descriptor = "()I")
    public final int method2400() {
        return this.field5263 + this.field5261 + this.field5264;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Ltq;II)[Lgo;")
    public static final class375[] method2401(class376 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2431((byte) 90, arg1, arg2);
        return var3 == null ? null : method2398(var3);
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(Ltq;II)Lgo;")
    public static final class375 method2402(class376 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2431((byte) 107, arg1, arg2);
        return var3 == null ? null : method2398(var3)[0];
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(Ltq;I)[Lgo;")
    public static final class375[] method2403(class376 arg0, int arg1) {
        byte[] var2 = arg0.method2420(arg1, -1);
        return var2 == null ? null : method2398(var2);
    }
}
