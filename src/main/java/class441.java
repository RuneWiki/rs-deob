import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class441 {

    @OriginalMember(owner = "client!up", name = "b", descriptor = "I")
    public int field6461;

    @OriginalMember(owner = "client!up", name = "c", descriptor = "I")
    public int field6462;

    @OriginalMember(owner = "client!up", name = "d", descriptor = "I")
    public int field6463;

    @OriginalMember(owner = "client!up", name = "f", descriptor = "I")
    public int field6465;

    @OriginalMember(owner = "client!up", name = "g", descriptor = "I")
    public int field6466;

    @OriginalMember(owner = "client!up", name = "h", descriptor = "I")
    public int field6467;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "[B")
    public byte[] field6460;

    @OriginalMember(owner = "client!up", name = "e", descriptor = "[B")
    public byte[] field6464;

    @OriginalMember(owner = "client!up", name = "i", descriptor = "[I")
    public int[] field6468;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(I)V")
    public final void method2766(int arg0) {
        int var2 = this.method2767();
        int var3 = this.method2769();
        if (this.field6466 == var2 && this.field6462 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field6461) {
            var4 = this.field6461;
        }
        int var5 = arg0;
        if (this.field6461 + arg0 + this.field6466 > var2) {
            var5 = var2 - this.field6461 - this.field6466;
        }
        int var6 = arg0;
        if (arg0 > this.field6467) {
            var6 = this.field6467;
        }
        int var7 = arg0;
        if (this.field6467 + arg0 + this.field6462 > var3) {
            var7 = var3 - this.field6467 - this.field6462;
        }
        int var8 = this.field6466 + var4 + var5;
        int var9 = this.field6462 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field6460 == null) {
            for (int var11 = 0; var11 < this.field6462; var11++) {
                int var12 = this.field6466 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field6466; var14++) {
                    var10[var13++] = this.field6464[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field6462; var16++) {
                int var17 = this.field6466 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field6466; var19++) {
                    var15[var18] = this.field6460[var17];
                    var10[var18++] = this.field6464[var17++];
                }
            }
            this.field6460 = var15;
        }
        this.field6461 -= var4;
        this.field6467 -= var6;
        this.field6465 -= var5;
        this.field6463 -= var7;
        this.field6466 = var8;
        this.field6462 = var9;
        this.field6464 = var10;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "()I")
    public final int method2767() {
        return this.field6466 + this.field6461 + this.field6465;
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "()V")
    public final void method2768() {
        int var1 = this.method2767();
        int var2 = this.method2769();
        if (this.field6466 == var1 && this.field6462 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field6460 == null) {
            for (int var9 = 0; var9 < this.field6462; var9++) {
                int var10 = this.field6466 * var9;
                int var11 = (this.field6467 + var9) * var1 + this.field6461;
                for (int var12 = 0; var12 < this.field6466; var12++) {
                    var3[var11++] = this.field6464[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field6462; var5++) {
                int var6 = this.field6466 * var5;
                int var7 = (this.field6467 + var5) * var1 + this.field6461;
                for (int var8 = 0; var8 < this.field6466; var8++) {
                    var3[var7] = this.field6464[var6];
                    var4[var7++] = this.field6460[var6++];
                }
            }
            this.field6460 = var4;
        }
        this.field6461 = this.field6465 = this.field6467 = this.field6463 = 0;
        this.field6466 = var1;
        this.field6462 = var2;
        this.field6464 = var3;
    }

    @OriginalMember(owner = "client!up", name = "c", descriptor = "()I")
    public final int method2769() {
        return this.field6467 + this.field6462 + this.field6463;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Llm;I)[Lup;")
    public static final class441[] method2770(class347 arg0, int arg1) {
        byte[] var2 = arg0.method2266((byte) 68, arg1);
        return var2 == null ? null : method2771(var2);
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "([B)[Lup;")
    private static final class441[] method2771(byte[] arg0) {
        class228 var1 = new class228(arg0);
        var1.field3029 = arg0.length - 2;
        int var2 = var1.method1343(255);
        class441[] var3 = new class441[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class441();
        }
        var1.field3029 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method1343(255);
        int var6 = var1.method1343(255);
        int var7 = (var1.method1348(-108) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field6461 = var1.method1343(255);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field6467 = var1.method1343(255);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field6466 = var1.method1343(255);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field6462 = var1.method1343(255);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class441 var32 = var3[var12];
            var32.field6465 = var5 - var32.field6466 - var32.field6461;
            var32.field6463 = var6 - var32.field6462 - var32.field6467;
        }
        var1.field3029 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method1333((byte) -128);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field6468 = var13;
        }
        var1.field3029 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class441 var17 = var3[var16];
            int var18 = var17.field6466 * var17.field6462;
            var17.field6464 = new byte[var18];
            int var19 = var1.method1348(-109);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field6460 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field6464[var24] = var1.method1349(3);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field6460[var25] = var1.method1349(3);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field6466; var27++) {
                        for (int var31 = 0; var31 < var17.field6462; var31++) {
                            var17.field6464[var17.field6466 * var31 + var27] = var1.method1349(3);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field6466; var28++) {
                        for (int var29 = 0; var29 < var17.field6462; var29++) {
                            byte var30 = var17.field6460[var17.field6466 * var29 + var28] = var1.method1349(3);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field6460 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field6464[var20] = var1.method1349(3);
                }
            } else {
                for (int var21 = 0; var21 < var17.field6466; var21++) {
                    for (int var22 = 0; var22 < var17.field6462; var22++) {
                        var17.field6464[var17.field6466 * var22 + var21] = var1.method1349(3);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(I)V")
    public final void method2772(int arg0) {
        int var2 = -1;
        if (this.field6468.length < 255) {
            for (int var3 = 0; var3 < this.field6468.length; var3++) {
                if (this.field6468[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field6468.length;
                int[] var4 = new int[this.field6468.length + 1];
                class60.method422(this.field6468, 0, var4, 0, this.field6468.length);
                this.field6468 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field6468.length; var9++) {
                int var13 = this.field6468[var9];
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
        for (int var10 = this.field6462 - 1; var10 > 0; var10--) {
            int var11 = this.field6466 * var10;
            for (int var12 = this.field6466 - 1; var12 > 0; var12--) {
                if (this.field6468[this.field6464[var11 + var12] & 0xFF] == 0 && this.field6468[this.field6464[var11 + var12 - this.field6466 - 1] & 0xFF] != 0) {
                    this.field6464[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!up", name = "d", descriptor = "()V")
    public final void method2773() {
        byte[] var1 = this.field6464;
        if (this.field6460 == null) {
            for (int var2 = this.field6462 - 1; var2 >= 0; var2--) {
                int var3 = this.field6466 * var2;
                int var4 = (var2 + 1) * this.field6466;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field6460;
            for (int var7 = this.field6462 - 1; var7 >= 0; var7--) {
                int var9 = this.field6466 * var7;
                int var10 = (var7 + 1) * this.field6466;
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
        int var8 = this.field6461;
        this.field6461 = this.field6465;
        this.field6465 = var8;
    }

    @OriginalMember(owner = "client!up", name = "c", descriptor = "(I)V")
    public final void method2774(int arg0) {
        int var2 = -1;
        if (this.field6468.length < 255) {
            for (int var3 = 0; var3 < this.field6468.length; var3++) {
                if (this.field6468[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field6468.length;
                int[] var4 = new int[this.field6468.length + 1];
                class60.method422(this.field6468, 0, var4, 0, this.field6468.length);
                this.field6468 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field6468.length; var9++) {
                int var15 = this.field6468[var9];
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
        byte[] var11 = new byte[this.field6466 * this.field6462];
        for (int var12 = 0; var12 < this.field6462; var12++) {
            for (int var13 = 0; var13 < this.field6466; var13++) {
                int var14 = this.field6464[var10] & 0xFF;
                if (this.field6468[var14] == 0) {
                    if (var13 > 0 && this.field6468[this.field6464[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field6468[this.field6464[var10 - this.field6466] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field6466 - 1 && this.field6468[this.field6464[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field6462 - 1 && this.field6468[this.field6464[this.field6466 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field6464 = var11;
    }

    @OriginalMember(owner = "client!up", name = "e", descriptor = "()[I")
    public final int[] method2775() {
        int var1 = this.method2767();
        int[] var2 = new int[var1 * this.method2769()];
        if (this.field6460 == null) {
            for (int var7 = 0; var7 < this.field6462; var7++) {
                int var8 = this.field6466 * var7;
                int var9 = (this.field6467 + var7) * var1 + this.field6461;
                for (int var10 = 0; var10 < this.field6466; var10++) {
                    int var11 = this.field6468[this.field6464[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field6462; var3++) {
                int var4 = this.field6466 * var3;
                int var5 = (this.field6467 + var3) * var1 + this.field6461;
                for (int var6 = 0; var6 < this.field6466; var6++) {
                    var2[var5++] = this.field6460[var4] << 24 | this.field6468[this.field6464[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(Llm;I)Lup;")
    public static final class441 method2776(class347 arg0, int arg1) {
        byte[] var2 = arg0.method2266((byte) 65, arg1);
        return var2 == null ? null : method2771(var2)[0];
    }

    @OriginalMember(owner = "client!up", name = "f", descriptor = "()V")
    public final void method2777() {
        byte[] var1 = this.field6464;
        if (this.field6460 == null) {
            for (int var2 = (this.field6462 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field6466 * var2;
                int var4 = (this.field6462 - var2 - 1) * this.field6466;
                for (int var5 = -this.field6466; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field6460;
            for (int var8 = (this.field6462 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field6466 * var8;
                int var11 = (this.field6462 - var8 - 1) * this.field6466;
                for (int var12 = -this.field6466; var12 < 0; var12++) {
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
        int var9 = this.field6467;
        this.field6467 = this.field6463;
        this.field6463 = var9;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Llm;II)Lup;")
    public static final class441 method2778(class347 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2261(arg2, arg1, 108);
        return var3 == null ? null : method2771(var3)[0];
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(Llm;II)[Lup;")
    public static final class441[] method2779(class347 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2261(arg2, arg1, 84);
        return var3 == null ? null : method2771(var3);
    }

    @OriginalMember(owner = "client!up", name = "g", descriptor = "()V")
    public final void method2780() {
        byte[] var1 = new byte[this.field6466 * this.field6462];
        int var2 = 0;
        if (this.field6460 == null) {
            for (int var3 = 0; var3 < this.field6466; var3++) {
                for (int var4 = this.field6462 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field6464[this.field6466 * var4 + var3];
                }
            }
            this.field6464 = var1;
        } else {
            byte[] var5 = new byte[this.field6466 * this.field6462];
            for (int var6 = 0; var6 < this.field6466; var6++) {
                for (int var9 = this.field6462 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field6464[this.field6466 * var9 + var6];
                    var5[var2++] = this.field6460[this.field6466 * var9 + var6];
                }
            }
            this.field6464 = var1;
            this.field6460 = var5;
        }
        int var7 = this.field6467;
        this.field6467 = this.field6461;
        this.field6461 = this.field6463;
        this.field6463 = this.field6465;
        this.field6465 = this.field6467;
        int var8 = this.field6462;
        this.field6462 = this.field6466;
        this.field6466 = var8;
    }
}
