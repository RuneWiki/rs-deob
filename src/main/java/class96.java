import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class96 {

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public int field1319;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public int field1320;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public int field1322;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public int field1323;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public int field1326;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public int field1327;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "[B")
    public byte[] field1321;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "[B")
    public byte[] field1325;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "[I")
    public int[] field1324;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "()I", line = 4)
    public final int method738() {
        return this.field1326 + this.field1322 + this.field1320;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lij;II)Ljf;", line = 8)
    public static final class96 method739(class316 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1926(0, arg2, arg1);
        return var3 == null ? null : method745(var3)[0];
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "()V", line = 17)
    public final void method740() {
        byte[] var1 = new byte[this.field1327 * this.field1326];
        int var2 = 0;
        if (this.field1321 == null) {
            for (int var3 = 0; var3 < this.field1327; var3++) {
                for (int var4 = this.field1326 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field1325[this.field1327 * var4 + var3];
                }
            }
            this.field1325 = var1;
        } else {
            byte[] var5 = new byte[this.field1327 * this.field1326];
            for (int var6 = 0; var6 < this.field1327; var6++) {
                for (int var9 = this.field1326 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field1325[this.field1327 * var9 + var6];
                    var5[var2++] = this.field1321[this.field1327 * var9 + var6];
                }
            }
            this.field1325 = var1;
            this.field1321 = var5;
        }
        int var7 = this.field1322;
        this.field1322 = this.field1319;
        this.field1319 = this.field1320;
        this.field1320 = this.field1323;
        this.field1323 = this.field1322;
        int var8 = this.field1326;
        this.field1326 = this.field1327;
        this.field1327 = var8;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V", line = 78)
    public final void method741(int arg0) {
        int var2 = -1;
        if (this.field1324.length < 255) {
            for (int var3 = 0; var3 < this.field1324.length; var3++) {
                if (this.field1324[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field1324.length;
                int[] var4 = new int[this.field1324.length + 1];
                class79.method639(this.field1324, 0, var4, 0, this.field1324.length);
                this.field1324 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field1324.length; var9++) {
                int var15 = this.field1324[var9];
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
        byte[] var11 = new byte[this.field1327 * this.field1326];
        for (int var12 = 0; var12 < this.field1326; var12++) {
            for (int var13 = 0; var13 < this.field1327; var13++) {
                int var14 = this.field1325[var10] & 0xFF;
                if (this.field1324[var14] == 0) {
                    if (var13 > 0 && this.field1324[this.field1325[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field1324[this.field1325[var10 - this.field1327] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field1327 - 1 && this.field1324[this.field1325[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field1326 - 1 && this.field1324[this.field1325[this.field1327 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field1325 = var11;
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "()V", line = 203)
    public final void method742() {
        int var1 = this.method749();
        int var2 = this.method738();
        if (this.field1327 == var1 && this.field1326 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field1321 == null) {
            for (int var9 = 0; var9 < this.field1326; var9++) {
                int var10 = this.field1327 * var9;
                int var11 = (this.field1322 + var9) * var1 + this.field1319;
                for (int var12 = 0; var12 < this.field1327; var12++) {
                    var3[var11++] = this.field1325[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field1326; var5++) {
                int var6 = this.field1327 * var5;
                int var7 = (this.field1322 + var5) * var1 + this.field1319;
                for (int var8 = 0; var8 < this.field1327; var8++) {
                    var3[var7] = this.field1325[var6];
                    var4[var7++] = this.field1321[var6++];
                }
            }
            this.field1321 = var4;
        }
        this.field1319 = this.field1323 = this.field1322 = this.field1320 = 0;
        this.field1327 = var1;
        this.field1326 = var2;
        this.field1325 = var3;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V", line = 272)
    public final void method743(int arg0) {
        int var2 = this.method749();
        int var3 = this.method738();
        if (this.field1327 == var2 && this.field1326 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field1319) {
            var4 = this.field1319;
        }
        int var5 = arg0;
        if (this.field1319 + arg0 + this.field1327 > var2) {
            var5 = var2 - this.field1319 - this.field1327;
        }
        int var6 = arg0;
        if (arg0 > this.field1322) {
            var6 = this.field1322;
        }
        int var7 = arg0;
        if (this.field1322 + arg0 + this.field1326 > var3) {
            var7 = var3 - this.field1322 - this.field1326;
        }
        int var8 = this.field1327 + var4 + var5;
        int var9 = this.field1326 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field1321 == null) {
            for (int var11 = 0; var11 < this.field1326; var11++) {
                int var12 = this.field1327 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field1327; var14++) {
                    var10[var13++] = this.field1325[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field1326; var16++) {
                int var17 = this.field1327 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field1327; var19++) {
                    var15[var18] = this.field1321[var17];
                    var10[var18++] = this.field1325[var17++];
                }
            }
            this.field1321 = var15;
        }
        this.field1319 -= var4;
        this.field1322 -= var6;
        this.field1323 -= var5;
        this.field1320 -= var7;
        this.field1327 = var8;
        this.field1326 = var9;
        this.field1325 = var10;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lij;I)Ljf;", line = 369)
    public static final class96 method744(class316 arg0, int arg1) {
        byte[] var2 = arg0.method1908((byte) -102, arg1);
        return var2 == null ? null : method745(var2)[0];
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "([B)[Ljf;", line = 379)
    private static final class96[] method745(byte[] arg0) {
        class366 var1 = new class366(arg0);
        var1.field5048 = arg0.length - 2;
        int var2 = var1.method2297(13352);
        class96[] var3 = new class96[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class96();
        }
        var1.field5048 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method2297(13352);
        int var6 = var1.method2297(13352);
        int var7 = (var1.method2306((byte) 86) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field1319 = var1.method2297(13352);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field1322 = var1.method2297(13352);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field1327 = var1.method2297(13352);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field1326 = var1.method2297(13352);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class96 var32 = var3[var12];
            var32.field1323 = var5 - var32.field1327 - var32.field1319;
            var32.field1320 = var6 - var32.field1326 - var32.field1322;
        }
        var1.field5048 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method2263((byte) 10);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field1324 = var13;
        }
        var1.field5048 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class96 var17 = var3[var16];
            int var18 = var17.field1327 * var17.field1326;
            var17.field1325 = new byte[var18];
            int var19 = var1.method2306((byte) 124);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field1321 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field1325[var24] = var1.method2289((byte) -77);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field1321[var25] = var1.method2289((byte) -77);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field1327; var27++) {
                        for (int var31 = 0; var31 < var17.field1326; var31++) {
                            var17.field1325[var17.field1327 * var31 + var27] = var1.method2289((byte) -77);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field1327; var28++) {
                        for (int var29 = 0; var29 < var17.field1326; var29++) {
                            byte var30 = var17.field1321[var17.field1327 * var29 + var28] = var1.method2289((byte) -77);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field1321 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field1325[var20] = var1.method2289((byte) -77);
                }
            } else {
                for (int var21 = 0; var21 < var17.field1327; var21++) {
                    for (int var22 = 0; var22 < var17.field1326; var22++) {
                        var17.field1325[var17.field1327 * var22 + var21] = var1.method2289((byte) -77);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V", line = 587)
    public final void method746(int arg0) {
        int var2 = -1;
        if (this.field1324.length < 255) {
            for (int var3 = 0; var3 < this.field1324.length; var3++) {
                if (this.field1324[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field1324.length;
                int[] var4 = new int[this.field1324.length + 1];
                class79.method639(this.field1324, 0, var4, 0, this.field1324.length);
                this.field1324 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field1324.length; var9++) {
                int var13 = this.field1324[var9];
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
        for (int var10 = this.field1326 - 1; var10 > 0; var10--) {
            int var11 = this.field1327 * var10;
            for (int var12 = this.field1327 - 1; var12 > 0; var12--) {
                if (this.field1324[this.field1325[var11 + var12] & 0xFF] == 0 && this.field1324[this.field1325[var11 + var12 - this.field1327 - 1] & 0xFF] != 0) {
                    this.field1325[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "()V", line = 693)
    public final void method747() {
        byte[] var1 = this.field1325;
        if (this.field1321 == null) {
            for (int var2 = this.field1326 - 1; var2 >= 0; var2--) {
                int var3 = this.field1327 * var2;
                int var4 = (var2 + 1) * this.field1327;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field1321;
            for (int var7 = this.field1326 - 1; var7 >= 0; var7--) {
                int var9 = this.field1327 * var7;
                int var10 = (var7 + 1) * this.field1327;
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
        int var8 = this.field1319;
        this.field1319 = this.field1323;
        this.field1323 = var8;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(Lij;II)[Ljf;", line = 755)
    public static final class96[] method748(class316 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1926(0, arg2, arg1);
        return var3 == null ? null : method745(var3);
    }

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "()I", line = 763)
    public final int method749() {
        return this.field1327 + this.field1319 + this.field1323;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(Lij;I)[Ljf;", line = 767)
    public static final class96[] method750(class316 arg0, int arg1) {
        byte[] var2 = arg0.method1908((byte) -49, arg1);
        return var2 == null ? null : method745(var2);
    }

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "()[I", line = 775)
    public final int[] method751() {
        int var1 = this.method749();
        int[] var2 = new int[var1 * this.method738()];
        if (this.field1321 == null) {
            for (int var7 = 0; var7 < this.field1326; var7++) {
                int var8 = this.field1327 * var7;
                int var9 = (this.field1322 + var7) * var1 + this.field1319;
                for (int var10 = 0; var10 < this.field1327; var10++) {
                    int var11 = this.field1324[this.field1325[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field1326; var3++) {
                int var4 = this.field1327 * var3;
                int var5 = (this.field1322 + var3) * var1 + this.field1319;
                for (int var6 = 0; var6 < this.field1327; var6++) {
                    var2[var5++] = this.field1321[var4] << 24 | this.field1324[this.field1325[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "()V", line = 841)
    public final void method752() {
        byte[] var1 = this.field1325;
        if (this.field1321 == null) {
            for (int var2 = (this.field1326 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field1327 * var2;
                int var4 = (this.field1326 - var2 - 1) * this.field1327;
                for (int var5 = -this.field1327; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field1321;
            for (int var8 = (this.field1326 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field1327 * var8;
                int var11 = (this.field1326 - var8 - 1) * this.field1327;
                for (int var12 = -this.field1327; var12 < 0; var12++) {
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
        int var9 = this.field1322;
        this.field1322 = this.field1320;
        this.field1320 = var9;
    }
}
