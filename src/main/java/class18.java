import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class18 {

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public int field241;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public int field242;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public int field244;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public int field245;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public int field247;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public int field248;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "[B")
    public byte[] field240;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "[B")
    public byte[] field243;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "[I")
    public int[] field246;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "()I")
    public final int method106() {
        return this.field245 + this.field242 + this.field248;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lqj;II)[Lnc;")
    public static final class18[] method107(class296 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1920(arg2, false, arg1);
        return var3 == null ? null : method109(var3);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lqj;I)[Lnc;")
    public static final class18[] method108(class296 arg0, int arg1) {
        byte[] var2 = arg0.method1904(arg1, 255);
        return var2 == null ? null : method109(var2);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([B)[Lnc;")
    private static final class18[] method109(byte[] arg0) {
        class371 var1 = new class371(arg0);
        var1.field5273 = arg0.length - 2;
        int var2 = var1.method2403((byte) 59);
        class18[] var3 = new class18[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class18();
        }
        var1.field5273 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method2403((byte) 54);
        int var6 = var1.method2403((byte) 41);
        int var7 = (var1.method2429(0) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field244 = var1.method2403((byte) 47);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field245 = var1.method2403((byte) 86);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field247 = var1.method2403((byte) 94);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field242 = var1.method2403((byte) 66);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class18 var32 = var3[var12];
            var32.field241 = var5 - var32.field247 - var32.field244;
            var32.field248 = var6 - var32.field242 - var32.field245;
        }
        var1.field5273 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method2425(86);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field246 = var13;
        }
        var1.field5273 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class18 var17 = var3[var16];
            int var18 = var17.field247 * var17.field242;
            var17.field240 = new byte[var18];
            int var19 = var1.method2429(0);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field243 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field240[var24] = var1.method2418(-21337);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field243[var25] = var1.method2418(-21337);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field247; var27++) {
                        for (int var31 = 0; var31 < var17.field242; var31++) {
                            var17.field240[var17.field247 * var31 + var27] = var1.method2418(-21337);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field247; var28++) {
                        for (int var29 = 0; var29 < var17.field242; var29++) {
                            byte var30 = var17.field243[var17.field247 * var29 + var28] = var1.method2418(-21337);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field243 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field240[var20] = var1.method2418(-21337);
                }
            } else {
                for (int var21 = 0; var21 < var17.field247; var21++) {
                    for (int var22 = 0; var22 < var17.field242; var22++) {
                        var17.field240[var17.field247 * var22 + var21] = var1.method2418(-21337);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "()V")
    public final void method110() {
        int var1 = this.method111();
        int var2 = this.method106();
        if (this.field247 == var1 && this.field242 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field243 == null) {
            for (int var9 = 0; var9 < this.field242; var9++) {
                int var10 = this.field247 * var9;
                int var11 = (this.field245 + var9) * var1 + this.field244;
                for (int var12 = 0; var12 < this.field247; var12++) {
                    var3[var11++] = this.field240[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field242; var5++) {
                int var6 = this.field247 * var5;
                int var7 = (this.field245 + var5) * var1 + this.field244;
                for (int var8 = 0; var8 < this.field247; var8++) {
                    var3[var7] = this.field240[var6];
                    var4[var7++] = this.field243[var6++];
                }
            }
            this.field243 = var4;
        }
        this.field244 = this.field241 = this.field245 = this.field248 = 0;
        this.field247 = var1;
        this.field242 = var2;
        this.field240 = var3;
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "()I")
    public final int method111() {
        return this.field247 + this.field244 + this.field241;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
    public final void method112(int arg0) {
        int var2 = -1;
        if (this.field246.length < 255) {
            for (int var3 = 0; var3 < this.field246.length; var3++) {
                if (this.field246[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field246.length;
                int[] var4 = new int[this.field246.length + 1];
                class150.method1022(this.field246, 0, var4, 0, this.field246.length);
                this.field246 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field246.length; var9++) {
                int var13 = this.field246[var9];
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
        for (int var10 = this.field242 - 1; var10 > 0; var10--) {
            int var11 = this.field247 * var10;
            for (int var12 = this.field247 - 1; var12 > 0; var12--) {
                if (this.field246[this.field240[var11 + var12] & 0xFF] == 0 && this.field246[this.field240[var11 + var12 - this.field247 - 1] & 0xFF] != 0) {
                    this.field240[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "()[I")
    public final int[] method113() {
        int var1 = this.method111();
        int[] var2 = new int[var1 * this.method106()];
        if (this.field243 == null) {
            for (int var7 = 0; var7 < this.field242; var7++) {
                int var8 = this.field247 * var7;
                int var9 = (this.field245 + var7) * var1 + this.field244;
                for (int var10 = 0; var10 < this.field247; var10++) {
                    int var11 = this.field246[this.field240[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field242; var3++) {
                int var4 = this.field247 * var3;
                int var5 = (this.field245 + var3) * var1 + this.field244;
                for (int var6 = 0; var6 < this.field247; var6++) {
                    var2[var5++] = this.field243[var4] << 24 | this.field246[this.field240[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "()V")
    public final void method114() {
        byte[] var1 = new byte[this.field247 * this.field242];
        int var2 = 0;
        if (this.field243 == null) {
            for (int var3 = 0; var3 < this.field247; var3++) {
                for (int var4 = this.field242 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field240[this.field247 * var4 + var3];
                }
            }
            this.field240 = var1;
        } else {
            byte[] var5 = new byte[this.field247 * this.field242];
            for (int var6 = 0; var6 < this.field247; var6++) {
                for (int var9 = this.field242 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field240[this.field247 * var9 + var6];
                    var5[var2++] = this.field243[this.field247 * var9 + var6];
                }
            }
            this.field240 = var1;
            this.field243 = var5;
        }
        int var7 = this.field245;
        this.field245 = this.field244;
        this.field244 = this.field248;
        this.field248 = this.field241;
        this.field241 = this.field245;
        int var8 = this.field242;
        this.field242 = this.field247;
        this.field247 = var8;
    }

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "()V")
    public final void method115() {
        byte[] var1 = this.field240;
        if (this.field243 == null) {
            for (int var2 = this.field242 - 1; var2 >= 0; var2--) {
                int var3 = this.field247 * var2;
                int var4 = (var2 + 1) * this.field247;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field243;
            for (int var7 = this.field242 - 1; var7 >= 0; var7--) {
                int var9 = this.field247 * var7;
                int var10 = (var7 + 1) * this.field247;
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
        int var8 = this.field244;
        this.field244 = this.field241;
        this.field241 = var8;
    }

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "()V")
    public final void method116() {
        byte[] var1 = this.field240;
        if (this.field243 == null) {
            for (int var2 = (this.field242 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field247 * var2;
                int var4 = (this.field242 - var2 - 1) * this.field247;
                for (int var5 = -this.field247; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field243;
            for (int var8 = (this.field242 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field247 * var8;
                int var11 = (this.field242 - var8 - 1) * this.field247;
                for (int var12 = -this.field247; var12 < 0; var12++) {
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
        int var9 = this.field245;
        this.field245 = this.field248;
        this.field248 = var9;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
    public final void method117(int arg0) {
        int var2 = -1;
        if (this.field246.length < 255) {
            for (int var3 = 0; var3 < this.field246.length; var3++) {
                if (this.field246[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field246.length;
                int[] var4 = new int[this.field246.length + 1];
                class150.method1022(this.field246, 0, var4, 0, this.field246.length);
                this.field246 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field246.length; var9++) {
                int var15 = this.field246[var9];
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
        byte[] var11 = new byte[this.field247 * this.field242];
        for (int var12 = 0; var12 < this.field242; var12++) {
            for (int var13 = 0; var13 < this.field247; var13++) {
                int var14 = this.field240[var10] & 0xFF;
                if (this.field246[var14] == 0) {
                    if (var13 > 0 && this.field246[this.field240[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field246[this.field240[var10 - this.field247] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field247 - 1 && this.field246[this.field240[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field242 - 1 && this.field246[this.field240[this.field247 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field240 = var11;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(Lqj;I)Lnc;")
    public static final class18 method118(class296 arg0, int arg1) {
        byte[] var2 = arg0.method1904(arg1, 255);
        return var2 == null ? null : method109(var2)[0];
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(Lqj;II)Lnc;")
    public static final class18 method119(class296 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1920(arg2, false, arg1);
        return var3 == null ? null : method109(var3)[0];
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V")
    public final void method120(int arg0) {
        int var2 = this.method111();
        int var3 = this.method106();
        if (this.field247 == var2 && this.field242 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field244) {
            var4 = this.field244;
        }
        int var5 = arg0;
        if (this.field244 + arg0 + this.field247 > var2) {
            var5 = var2 - this.field244 - this.field247;
        }
        int var6 = arg0;
        if (arg0 > this.field245) {
            var6 = this.field245;
        }
        int var7 = arg0;
        if (this.field245 + arg0 + this.field242 > var3) {
            var7 = var3 - this.field245 - this.field242;
        }
        int var8 = this.field247 + var4 + var5;
        int var9 = this.field242 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field243 == null) {
            for (int var11 = 0; var11 < this.field242; var11++) {
                int var12 = this.field247 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field247; var14++) {
                    var10[var13++] = this.field240[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field242; var16++) {
                int var17 = this.field247 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field247; var19++) {
                    var15[var18] = this.field243[var17];
                    var10[var18++] = this.field240[var17++];
                }
            }
            this.field243 = var15;
        }
        this.field244 -= var4;
        this.field245 -= var6;
        this.field241 -= var5;
        this.field248 -= var7;
        this.field247 = var8;
        this.field242 = var9;
        this.field240 = var10;
    }
}
