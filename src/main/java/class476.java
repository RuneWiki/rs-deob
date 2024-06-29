import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class476 {

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
    public int field6926;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
    public int field6928;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
    public int field6930;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
    public int field6931;

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "I")
    public int field6932;

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "I")
    public int field6933;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "[B")
    public byte[] field6925;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "[B")
    public byte[] field6927;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "[I")
    public int[] field6929;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "()I")
    public final int method2842() {
        return this.field6933 + this.field6931 + this.field6930;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "()[I")
    public final int[] method2843() {
        int var1 = this.method2842();
        int[] var2 = new int[var1 * this.method2856()];
        if (this.field6925 == null) {
            for (int var7 = 0; var7 < this.field6928; var7++) {
                int var8 = this.field6933 * var7;
                int var9 = (this.field6926 + var7) * var1 + this.field6931;
                for (int var10 = 0; var10 < this.field6933; var10++) {
                    int var11 = this.field6929[this.field6927[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field6928; var3++) {
                int var4 = this.field6933 * var3;
                int var5 = (this.field6926 + var3) * var1 + this.field6931;
                for (int var6 = 0; var6 < this.field6933; var6++) {
                    var2[var5++] = this.field6925[var4] << 24 | this.field6929[this.field6927[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "()V")
    public final void method2844() {
        byte[] var1 = new byte[this.field6933 * this.field6928];
        int var2 = 0;
        if (this.field6925 == null) {
            for (int var3 = 0; var3 < this.field6933; var3++) {
                for (int var4 = this.field6928 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field6927[this.field6933 * var4 + var3];
                }
            }
            this.field6927 = var1;
        } else {
            byte[] var5 = new byte[this.field6933 * this.field6928];
            for (int var6 = 0; var6 < this.field6933; var6++) {
                for (int var9 = this.field6928 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field6927[this.field6933 * var9 + var6];
                    var5[var2++] = this.field6925[this.field6933 * var9 + var6];
                }
            }
            this.field6927 = var1;
            this.field6925 = var5;
        }
        int var7 = this.field6926;
        this.field6926 = this.field6931;
        this.field6931 = this.field6932;
        this.field6932 = this.field6930;
        this.field6930 = this.field6926;
        int var8 = this.field6928;
        this.field6928 = this.field6933;
        this.field6933 = var8;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lns;II)Lrl;")
    public static final class476 method2845(class438 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2650(arg2, -39, arg1);
        return var3 == null ? null : method2848(var3)[0];
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V")
    public final void method2846(int arg0) {
        int var2 = this.method2842();
        int var3 = this.method2856();
        if (this.field6933 == var2 && this.field6928 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field6931) {
            var4 = this.field6931;
        }
        int var5 = arg0;
        if (this.field6931 + arg0 + this.field6933 > var2) {
            var5 = var2 - this.field6931 - this.field6933;
        }
        int var6 = arg0;
        if (arg0 > this.field6926) {
            var6 = this.field6926;
        }
        int var7 = arg0;
        if (this.field6926 + arg0 + this.field6928 > var3) {
            var7 = var3 - this.field6926 - this.field6928;
        }
        int var8 = this.field6933 + var4 + var5;
        int var9 = this.field6928 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field6925 == null) {
            for (int var11 = 0; var11 < this.field6928; var11++) {
                int var12 = this.field6933 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field6933; var14++) {
                    var10[var13++] = this.field6927[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field6928; var16++) {
                int var17 = this.field6933 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field6933; var19++) {
                    var15[var18] = this.field6925[var17];
                    var10[var18++] = this.field6927[var17++];
                }
            }
            this.field6925 = var15;
        }
        this.field6931 -= var4;
        this.field6926 -= var6;
        this.field6930 -= var5;
        this.field6932 -= var7;
        this.field6933 = var8;
        this.field6928 = var9;
        this.field6927 = var10;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(Lns;II)[Lrl;")
    public static final class476[] method2847(class438 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2650(arg2, -41, arg1);
        return var3 == null ? null : method2848(var3);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "([B)[Lrl;")
    private static final class476[] method2848(byte[] arg0) {
        class91 var1 = new class91(arg0);
        var1.field1292 = arg0.length - 2;
        int var2 = var1.method631(10494);
        class476[] var3 = new class476[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class476();
        }
        var1.field1292 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method631(10494);
        int var6 = var1.method631(10494);
        int var7 = (var1.method618((byte) 100) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field6931 = var1.method631(10494);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field6926 = var1.method631(10494);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field6933 = var1.method631(10494);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field6928 = var1.method631(10494);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class476 var32 = var3[var12];
            var32.field6930 = var5 - var32.field6933 - var32.field6931;
            var32.field6932 = var6 - var32.field6928 - var32.field6926;
        }
        var1.field1292 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method641(32455);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field6929 = var13;
        }
        var1.field1292 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class476 var17 = var3[var16];
            int var18 = var17.field6933 * var17.field6928;
            var17.field6927 = new byte[var18];
            int var19 = var1.method618((byte) 100);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field6925 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field6927[var24] = var1.method619((byte) -23);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field6925[var25] = var1.method619((byte) -23);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field6933; var27++) {
                        for (int var31 = 0; var31 < var17.field6928; var31++) {
                            var17.field6927[var17.field6933 * var31 + var27] = var1.method619((byte) -23);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field6933; var28++) {
                        for (int var29 = 0; var29 < var17.field6928; var29++) {
                            byte var30 = var17.field6925[var17.field6933 * var29 + var28] = var1.method619((byte) -23);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field6925 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field6927[var20] = var1.method619((byte) -23);
                }
            } else {
                for (int var21 = 0; var21 < var17.field6933; var21++) {
                    for (int var22 = 0; var22 < var17.field6928; var22++) {
                        var17.field6927[var17.field6933 * var22 + var21] = var1.method619((byte) -23);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "()V")
    public final void method2849() {
        byte[] var1 = this.field6927;
        if (this.field6925 == null) {
            for (int var2 = this.field6928 - 1; var2 >= 0; var2--) {
                int var3 = this.field6933 * var2;
                int var4 = (var2 + 1) * this.field6933;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field6925;
            for (int var7 = this.field6928 - 1; var7 >= 0; var7--) {
                int var9 = this.field6933 * var7;
                int var10 = (var7 + 1) * this.field6933;
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
        int var8 = this.field6931;
        this.field6931 = this.field6930;
        this.field6930 = var8;
    }

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "()V")
    public final void method2850() {
        byte[] var1 = this.field6927;
        if (this.field6925 == null) {
            for (int var2 = (this.field6928 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field6933 * var2;
                int var4 = (this.field6928 - var2 - 1) * this.field6933;
                for (int var5 = -this.field6933; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field6925;
            for (int var8 = (this.field6928 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field6933 * var8;
                int var11 = (this.field6928 - var8 - 1) * this.field6933;
                for (int var12 = -this.field6933; var12 < 0; var12++) {
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
        int var9 = this.field6926;
        this.field6926 = this.field6932;
        this.field6932 = var9;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)V")
    public final void method2851(int arg0) {
        int var2 = -1;
        if (this.field6929.length < 255) {
            for (int var3 = 0; var3 < this.field6929.length; var3++) {
                if (this.field6929[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field6929.length;
                int[] var4 = new int[this.field6929.length + 1];
                class361.method2284(this.field6929, 0, var4, 0, this.field6929.length);
                this.field6929 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field6929.length; var9++) {
                int var15 = this.field6929[var9];
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
        byte[] var11 = new byte[this.field6933 * this.field6928];
        for (int var12 = 0; var12 < this.field6928; var12++) {
            for (int var13 = 0; var13 < this.field6933; var13++) {
                int var14 = this.field6927[var10] & 0xFF;
                if (this.field6929[var14] == 0) {
                    if (var13 > 0 && this.field6929[this.field6927[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field6929[this.field6927[var10 - this.field6933] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field6933 - 1 && this.field6929[this.field6927[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field6928 - 1 && this.field6929[this.field6927[this.field6933 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field6927 = var11;
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(I)V")
    public final void method2852(int arg0) {
        int var2 = -1;
        if (this.field6929.length < 255) {
            for (int var3 = 0; var3 < this.field6929.length; var3++) {
                if (this.field6929[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field6929.length;
                int[] var4 = new int[this.field6929.length + 1];
                class361.method2284(this.field6929, 0, var4, 0, this.field6929.length);
                this.field6929 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field6929.length; var9++) {
                int var13 = this.field6929[var9];
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
        for (int var10 = this.field6928 - 1; var10 > 0; var10--) {
            int var11 = this.field6933 * var10;
            for (int var12 = this.field6933 - 1; var12 > 0; var12--) {
                if (this.field6929[this.field6927[var11 + var12] & 0xFF] == 0 && this.field6929[this.field6927[var11 + var12 - this.field6933 - 1] & 0xFF] != 0) {
                    this.field6927[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "()V")
    public final void method2853() {
        int var1 = this.method2842();
        int var2 = this.method2856();
        if (this.field6933 == var1 && this.field6928 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field6925 == null) {
            for (int var9 = 0; var9 < this.field6928; var9++) {
                int var10 = this.field6933 * var9;
                int var11 = (this.field6926 + var9) * var1 + this.field6931;
                for (int var12 = 0; var12 < this.field6933; var12++) {
                    var3[var11++] = this.field6927[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field6928; var5++) {
                int var6 = this.field6933 * var5;
                int var7 = (this.field6926 + var5) * var1 + this.field6931;
                for (int var8 = 0; var8 < this.field6933; var8++) {
                    var3[var7] = this.field6927[var6];
                    var4[var7++] = this.field6925[var6++];
                }
            }
            this.field6925 = var4;
        }
        this.field6931 = this.field6930 = this.field6926 = this.field6932 = 0;
        this.field6933 = var1;
        this.field6928 = var2;
        this.field6927 = var3;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lns;I)[Lrl;")
    public static final class476[] method2854(class438 arg0, int arg1) {
        byte[] var2 = arg0.method2638(true, arg1);
        return var2 == null ? null : method2848(var2);
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(Lns;I)Lrl;")
    public static final class476 method2855(class438 arg0, int arg1) {
        byte[] var2 = arg0.method2638(true, arg1);
        return var2 == null ? null : method2848(var2)[0];
    }

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "()I")
    public final int method2856() {
        return this.field6928 + this.field6926 + this.field6932;
    }
}
