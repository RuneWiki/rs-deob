import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class366 {

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public int field5249;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public int field5250;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public int field5251;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public int field5252;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public int field5253;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public int field5254;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "[B")
    public byte[] field5255;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "[B")
    public byte[] field5256;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "[I")
    public int[] field5248;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lpq;I)[Lme;", line = 4)
    public static final class366[] method2242(class159 arg0, int arg1) {
        byte[] var2 = arg0.method1082((byte) 33, arg1);
        return var2 == null ? null : method2251(var2);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "()[I", line = 13)
    public final int[] method2243() {
        int var1 = this.method2255();
        int[] var2 = new int[var1 * this.method2244()];
        if (this.field5255 == null) {
            for (int var7 = 0; var7 < this.field5253; var7++) {
                int var8 = this.field5252 * var7;
                int var9 = (this.field5251 + var7) * var1 + this.field5250;
                for (int var10 = 0; var10 < this.field5252; var10++) {
                    int var11 = this.field5248[this.field5256[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field5253; var3++) {
                int var4 = this.field5252 * var3;
                int var5 = (this.field5251 + var3) * var1 + this.field5250;
                for (int var6 = 0; var6 < this.field5252; var6++) {
                    var2[var5++] = this.field5255[var4] << 24 | this.field5248[this.field5256[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "()I", line = 75)
    public final int method2244() {
        return this.field5253 + this.field5251 + this.field5249;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lpq;II)Lme;", line = 80)
    public static final class366 method2245(class159 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1087(arg1, arg2, 1);
        return var3 == null ? null : method2251(var3)[0];
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "()V", line = 89)
    public final void method2246() {
        byte[] var1 = this.field5256;
        if (this.field5255 == null) {
            for (int var2 = (this.field5253 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field5252 * var2;
                int var4 = (this.field5253 - var2 - 1) * this.field5252;
                for (int var5 = -this.field5252; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field5255;
            for (int var8 = (this.field5253 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field5252 * var8;
                int var11 = (this.field5253 - var8 - 1) * this.field5252;
                for (int var12 = -this.field5252; var12 < 0; var12++) {
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
        int var9 = this.field5251;
        this.field5251 = this.field5249;
        this.field5249 = var9;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(Lpq;I)Lme;", line = 161)
    public static final class366 method2247(class159 arg0, int arg1) {
        byte[] var2 = arg0.method1082((byte) 33, arg1);
        return var2 == null ? null : method2251(var2)[0];
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(Lpq;II)[Lme;", line = 172)
    public static final class366[] method2248(class159 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1087(arg1, arg2, 1);
        return var3 == null ? null : method2251(var3);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V", line = 182)
    public final void method2249(int arg0) {
        int var2 = this.method2255();
        int var3 = this.method2244();
        if (this.field5252 == var2 && this.field5253 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field5250) {
            var4 = this.field5250;
        }
        int var5 = arg0;
        if (this.field5250 + arg0 + this.field5252 > var2) {
            var5 = var2 - this.field5250 - this.field5252;
        }
        int var6 = arg0;
        if (arg0 > this.field5251) {
            var6 = this.field5251;
        }
        int var7 = arg0;
        if (this.field5251 + arg0 + this.field5253 > var3) {
            var7 = var3 - this.field5251 - this.field5253;
        }
        int var8 = this.field5252 + var4 + var5;
        int var9 = this.field5253 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field5255 == null) {
            for (int var11 = 0; var11 < this.field5253; var11++) {
                int var12 = this.field5252 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field5252; var14++) {
                    var10[var13++] = this.field5256[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field5253; var16++) {
                int var17 = this.field5252 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field5252; var19++) {
                    var15[var18] = this.field5255[var17];
                    var10[var18++] = this.field5256[var17++];
                }
            }
            this.field5255 = var15;
        }
        this.field5250 -= var4;
        this.field5251 -= var6;
        this.field5254 -= var5;
        this.field5249 -= var7;
        this.field5252 = var8;
        this.field5253 = var9;
        this.field5256 = var10;
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "()V", line = 277)
    public final void method2250() {
        byte[] var1 = new byte[this.field5253 * this.field5252];
        int var2 = 0;
        if (this.field5255 == null) {
            for (int var3 = 0; var3 < this.field5252; var3++) {
                for (int var4 = this.field5253 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field5256[this.field5252 * var4 + var3];
                }
            }
            this.field5256 = var1;
        } else {
            byte[] var5 = new byte[this.field5253 * this.field5252];
            for (int var6 = 0; var6 < this.field5252; var6++) {
                for (int var9 = this.field5253 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field5256[this.field5252 * var9 + var6];
                    var5[var2++] = this.field5255[this.field5252 * var9 + var6];
                }
            }
            this.field5256 = var1;
            this.field5255 = var5;
        }
        int var7 = this.field5251;
        this.field5251 = this.field5250;
        this.field5250 = this.field5249;
        this.field5249 = this.field5254;
        this.field5254 = this.field5251;
        int var8 = this.field5253;
        this.field5253 = this.field5252;
        this.field5252 = var8;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([B)[Lme;", line = 338)
    private static final class366[] method2251(byte[] arg0) {
        class138 var1 = new class138(arg0);
        var1.field1745 = arg0.length - 2;
        int var2 = var1.method922((byte) -127);
        class366[] var3 = new class366[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class366();
        }
        var1.field1745 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method922((byte) -122);
        int var6 = var1.method922((byte) -128);
        int var7 = (var1.method957((byte) -89) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field5250 = var1.method922((byte) -113);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field5251 = var1.method922((byte) -115);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field5252 = var1.method922((byte) -115);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field5253 = var1.method922((byte) -128);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class366 var32 = var3[var12];
            var32.field5254 = var5 - var32.field5252 - var32.field5250;
            var32.field5249 = var6 - var32.field5253 - var32.field5251;
        }
        var1.field1745 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method904(127);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field5248 = var13;
        }
        var1.field1745 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class366 var17 = var3[var16];
            int var18 = var17.field5253 * var17.field5252;
            var17.field5256 = new byte[var18];
            int var19 = var1.method957((byte) -106);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field5255 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field5256[var24] = var1.method950(false);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field5255[var25] = var1.method950(false);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field5252; var27++) {
                        for (int var31 = 0; var31 < var17.field5253; var31++) {
                            var17.field5256[var17.field5252 * var31 + var27] = var1.method950(false);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field5252; var28++) {
                        for (int var29 = 0; var29 < var17.field5253; var29++) {
                            byte var30 = var17.field5255[var17.field5252 * var29 + var28] = var1.method950(false);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field5255 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field5256[var20] = var1.method950(false);
                }
            } else {
                for (int var21 = 0; var21 < var17.field5252; var21++) {
                    for (int var22 = 0; var22 < var17.field5253; var22++) {
                        var17.field5256[var17.field5252 * var22 + var21] = var1.method950(false);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V", line = 546)
    public final void method2252(int arg0) {
        int var2 = -1;
        if (this.field5248.length < 255) {
            for (int var3 = 0; var3 < this.field5248.length; var3++) {
                if (this.field5248[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field5248.length;
                int[] var4 = new int[this.field5248.length + 1];
                class657.method3636(this.field5248, 0, var4, 0, this.field5248.length);
                this.field5248 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field5248.length; var9++) {
                int var13 = this.field5248[var9];
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
        for (int var10 = this.field5253 - 1; var10 > 0; var10--) {
            int var11 = this.field5252 * var10;
            for (int var12 = this.field5252 - 1; var12 > 0; var12--) {
                if (this.field5248[this.field5256[var11 + var12] & 0xFF] == 0 && this.field5248[this.field5256[var11 + var12 - this.field5252 - 1] & 0xFF] != 0) {
                    this.field5256[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(I)V", line = 649)
    public final void method2253(int arg0) {
        int var2 = -1;
        if (this.field5248.length < 255) {
            for (int var3 = 0; var3 < this.field5248.length; var3++) {
                if (this.field5248[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field5248.length;
                int[] var4 = new int[this.field5248.length + 1];
                class657.method3636(this.field5248, 0, var4, 0, this.field5248.length);
                this.field5248 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field5248.length; var9++) {
                int var15 = this.field5248[var9];
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
        byte[] var11 = new byte[this.field5253 * this.field5252];
        for (int var12 = 0; var12 < this.field5253; var12++) {
            for (int var13 = 0; var13 < this.field5252; var13++) {
                int var14 = this.field5256[var10] & 0xFF;
                if (this.field5248[var14] == 0) {
                    if (var13 > 0 && this.field5248[this.field5256[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field5248[this.field5256[var10 - this.field5252] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field5252 - 1 && this.field5248[this.field5256[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field5253 - 1 && this.field5248[this.field5256[this.field5252 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field5256 = var11;
    }

    @OriginalMember(owner = "client!me", name = "e", descriptor = "()V", line = 774)
    public final void method2254() {
        int var1 = this.method2255();
        int var2 = this.method2244();
        if (this.field5252 == var1 && this.field5253 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field5255 == null) {
            for (int var9 = 0; var9 < this.field5253; var9++) {
                int var10 = this.field5252 * var9;
                int var11 = (this.field5251 + var9) * var1 + this.field5250;
                for (int var12 = 0; var12 < this.field5252; var12++) {
                    var3[var11++] = this.field5256[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field5253; var5++) {
                int var6 = this.field5252 * var5;
                int var7 = (this.field5251 + var5) * var1 + this.field5250;
                for (int var8 = 0; var8 < this.field5252; var8++) {
                    var3[var7] = this.field5256[var6];
                    var4[var7++] = this.field5255[var6++];
                }
            }
            this.field5255 = var4;
        }
        this.field5250 = this.field5254 = this.field5251 = this.field5249 = 0;
        this.field5252 = var1;
        this.field5253 = var2;
        this.field5256 = var3;
    }

    @OriginalMember(owner = "client!me", name = "f", descriptor = "()I", line = 843)
    public final int method2255() {
        return this.field5252 + this.field5250 + this.field5254;
    }

    @OriginalMember(owner = "client!me", name = "g", descriptor = "()V", line = 848)
    public final void method2256() {
        byte[] var1 = this.field5256;
        if (this.field5255 == null) {
            for (int var2 = this.field5253 - 1; var2 >= 0; var2--) {
                int var3 = this.field5252 * var2;
                int var4 = (var2 + 1) * this.field5252;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field5255;
            for (int var7 = this.field5253 - 1; var7 >= 0; var7--) {
                int var9 = this.field5252 * var7;
                int var10 = (var7 + 1) * this.field5252;
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
        int var8 = this.field5250;
        this.field5250 = this.field5254;
        this.field5254 = var8;
    }
}
