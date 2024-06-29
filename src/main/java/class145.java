import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class145 {

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public int field2038;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public int field2039;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public int field2040;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public int field2041;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public int field2043;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "I")
    public int field2046;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "[B")
    public byte[] field2042;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "[B")
    public byte[] field2045;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "[I")
    public int[] field2044;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "()V")
    public final void method852() {
        byte[] var1 = new byte[this.field2043 * this.field2038];
        int var2 = 0;
        if (this.field2042 == null) {
            for (int var3 = 0; var3 < this.field2043; var3++) {
                for (int var4 = this.field2038 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field2045[this.field2043 * var4 + var3];
                }
            }
            this.field2045 = var1;
        } else {
            byte[] var5 = new byte[this.field2043 * this.field2038];
            for (int var6 = 0; var6 < this.field2043; var6++) {
                for (int var9 = this.field2038 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field2045[this.field2043 * var9 + var6];
                    var5[var2++] = this.field2042[this.field2043 * var9 + var6];
                }
            }
            this.field2045 = var1;
            this.field2042 = var5;
        }
        int var7 = this.field2046;
        this.field2046 = this.field2041;
        this.field2041 = this.field2039;
        this.field2039 = this.field2040;
        this.field2040 = this.field2046;
        int var8 = this.field2038;
        this.field2038 = this.field2043;
        this.field2043 = var8;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "()I")
    public final int method853() {
        return this.field2043 + this.field2041 + this.field2040;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lra;II)Lcl;")
    public static final class145 method854(class57 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method361(arg1, 87, arg2);
        return var3 == null ? null : method857(var3)[0];
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "()V")
    public final void method855() {
        byte[] var1 = this.field2045;
        if (this.field2042 == null) {
            for (int var2 = this.field2038 - 1; var2 >= 0; var2--) {
                int var3 = this.field2043 * var2;
                int var4 = (var2 + 1) * this.field2043;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field2042;
            for (int var7 = this.field2038 - 1; var7 >= 0; var7--) {
                int var9 = this.field2043 * var7;
                int var10 = (var7 + 1) * this.field2043;
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
        int var8 = this.field2041;
        this.field2041 = this.field2040;
        this.field2040 = var8;
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "()V")
    public final void method856() {
        int var1 = this.method853();
        int var2 = this.method863();
        if (this.field2043 == var1 && this.field2038 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field2042 == null) {
            for (int var9 = 0; var9 < this.field2038; var9++) {
                int var10 = this.field2043 * var9;
                int var11 = (this.field2046 + var9) * var1 + this.field2041;
                for (int var12 = 0; var12 < this.field2043; var12++) {
                    var3[var11++] = this.field2045[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field2038; var5++) {
                int var6 = this.field2043 * var5;
                int var7 = (this.field2046 + var5) * var1 + this.field2041;
                for (int var8 = 0; var8 < this.field2043; var8++) {
                    var3[var7] = this.field2045[var6];
                    var4[var7++] = this.field2042[var6++];
                }
            }
            this.field2042 = var4;
        }
        this.field2041 = this.field2040 = this.field2046 = this.field2039 = 0;
        this.field2043 = var1;
        this.field2038 = var2;
        this.field2045 = var3;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "([B)[Lcl;")
    private static final class145[] method857(byte[] arg0) {
        class211 var1 = new class211(arg0);
        var1.field2888 = arg0.length - 2;
        int var2 = var1.method1355(32136);
        class145[] var3 = new class145[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class145();
        }
        var1.field2888 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method1355(32136);
        int var6 = var1.method1355(32136);
        int var7 = (var1.method1342((byte) -127) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field2041 = var1.method1355(32136);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field2046 = var1.method1355(32136);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field2043 = var1.method1355(32136);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field2038 = var1.method1355(32136);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class145 var32 = var3[var12];
            var32.field2040 = var5 - var32.field2043 - var32.field2041;
            var32.field2039 = var6 - var32.field2038 - var32.field2046;
        }
        var1.field2888 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method1353(85);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field2044 = var13;
        }
        var1.field2888 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class145 var17 = var3[var16];
            int var18 = var17.field2043 * var17.field2038;
            var17.field2045 = new byte[var18];
            int var19 = var1.method1342((byte) -127);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field2042 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field2045[var24] = var1.method1373((byte) 30);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field2042[var25] = var1.method1373((byte) 30);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field2043; var27++) {
                        for (int var31 = 0; var31 < var17.field2038; var31++) {
                            var17.field2045[var17.field2043 * var31 + var27] = var1.method1373((byte) 30);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field2043; var28++) {
                        for (int var29 = 0; var29 < var17.field2038; var29++) {
                            byte var30 = var17.field2042[var17.field2043 * var29 + var28] = var1.method1373((byte) 30);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field2042 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field2045[var20] = var1.method1373((byte) 30);
                }
            } else {
                for (int var21 = 0; var21 < var17.field2043; var21++) {
                    for (int var22 = 0; var22 < var17.field2038; var22++) {
                        var17.field2045[var17.field2043 * var22 + var21] = var1.method1373((byte) 30);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
    public final void method858(int arg0) {
        int var2 = this.method853();
        int var3 = this.method863();
        if (this.field2043 == var2 && this.field2038 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field2041) {
            var4 = this.field2041;
        }
        int var5 = arg0;
        if (this.field2041 + arg0 + this.field2043 > var2) {
            var5 = var2 - this.field2041 - this.field2043;
        }
        int var6 = arg0;
        if (arg0 > this.field2046) {
            var6 = this.field2046;
        }
        int var7 = arg0;
        if (this.field2046 + arg0 + this.field2038 > var3) {
            var7 = var3 - this.field2046 - this.field2038;
        }
        int var8 = this.field2043 + var4 + var5;
        int var9 = this.field2038 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field2042 == null) {
            for (int var11 = 0; var11 < this.field2038; var11++) {
                int var12 = this.field2043 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field2043; var14++) {
                    var10[var13++] = this.field2045[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field2038; var16++) {
                int var17 = this.field2043 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field2043; var19++) {
                    var15[var18] = this.field2042[var17];
                    var10[var18++] = this.field2045[var17++];
                }
            }
            this.field2042 = var15;
        }
        this.field2041 -= var4;
        this.field2046 -= var6;
        this.field2040 -= var5;
        this.field2039 -= var7;
        this.field2043 = var8;
        this.field2038 = var9;
        this.field2045 = var10;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V")
    public final void method859(int arg0) {
        int var2 = -1;
        if (this.field2044.length < 255) {
            for (int var3 = 0; var3 < this.field2044.length; var3++) {
                if (this.field2044[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field2044.length;
                int[] var4 = new int[this.field2044.length + 1];
                class408.method2573(this.field2044, 0, var4, 0, this.field2044.length);
                this.field2044 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field2044.length; var9++) {
                int var13 = this.field2044[var9];
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
        for (int var10 = this.field2038 - 1; var10 > 0; var10--) {
            int var11 = this.field2043 * var10;
            for (int var12 = this.field2043 - 1; var12 > 0; var12--) {
                if (this.field2044[this.field2045[var11 + var12] & 0xFF] == 0 && this.field2044[this.field2045[var11 + var12 - this.field2043 - 1] & 0xFF] != 0) {
                    this.field2045[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lra;I)[Lcl;")
    public static final class145[] method860(class57 arg0, int arg1) {
        byte[] var2 = arg0.method348(arg1, 0);
        return var2 == null ? null : method857(var2);
    }

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "()[I")
    public final int[] method861() {
        int var1 = this.method853();
        int[] var2 = new int[var1 * this.method863()];
        if (this.field2042 == null) {
            for (int var7 = 0; var7 < this.field2038; var7++) {
                int var8 = this.field2043 * var7;
                int var9 = (this.field2046 + var7) * var1 + this.field2041;
                for (int var10 = 0; var10 < this.field2043; var10++) {
                    int var11 = this.field2044[this.field2045[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field2038; var3++) {
                int var4 = this.field2043 * var3;
                int var5 = (this.field2046 + var3) * var1 + this.field2041;
                for (int var6 = 0; var6 < this.field2043; var6++) {
                    var2[var5++] = this.field2042[var4] << 24 | this.field2044[this.field2045[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(Lra;I)Lcl;")
    public static final class145 method862(class57 arg0, int arg1) {
        byte[] var2 = arg0.method348(arg1, 0);
        return var2 == null ? null : method857(var2)[0];
    }

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "()I")
    public final int method863() {
        return this.field2046 + this.field2038 + this.field2039;
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)V")
    public final void method864(int arg0) {
        int var2 = -1;
        if (this.field2044.length < 255) {
            for (int var3 = 0; var3 < this.field2044.length; var3++) {
                if (this.field2044[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field2044.length;
                int[] var4 = new int[this.field2044.length + 1];
                class408.method2573(this.field2044, 0, var4, 0, this.field2044.length);
                this.field2044 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field2044.length; var9++) {
                int var15 = this.field2044[var9];
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
        byte[] var11 = new byte[this.field2043 * this.field2038];
        for (int var12 = 0; var12 < this.field2038; var12++) {
            for (int var13 = 0; var13 < this.field2043; var13++) {
                int var14 = this.field2045[var10] & 0xFF;
                if (this.field2044[var14] == 0) {
                    if (var13 > 0 && this.field2044[this.field2045[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field2044[this.field2045[var10 - this.field2043] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field2043 - 1 && this.field2044[this.field2045[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field2038 - 1 && this.field2044[this.field2045[this.field2043 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field2045 = var11;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(Lra;II)[Lcl;")
    public static final class145[] method865(class57 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method361(arg1, 110, arg2);
        return var3 == null ? null : method857(var3);
    }

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "()V")
    public final void method866() {
        byte[] var1 = this.field2045;
        if (this.field2042 == null) {
            for (int var2 = (this.field2038 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field2043 * var2;
                int var4 = (this.field2038 - var2 - 1) * this.field2043;
                for (int var5 = -this.field2043; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field2042;
            for (int var8 = (this.field2038 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field2043 * var8;
                int var11 = (this.field2038 - var8 - 1) * this.field2043;
                for (int var12 = -this.field2043; var12 < 0; var12++) {
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
        int var9 = this.field2046;
        this.field2046 = this.field2039;
        this.field2039 = var9;
    }
}
