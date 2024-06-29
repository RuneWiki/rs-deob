import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public class class495 {

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "I")
    public int field6899;

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "I")
    public int field6900;

    @OriginalMember(owner = "client!pga", name = "c", descriptor = "I")
    public int field6901;

    @OriginalMember(owner = "client!pga", name = "e", descriptor = "I")
    public int field6903;

    @OriginalMember(owner = "client!pga", name = "f", descriptor = "I")
    public int field6904;

    @OriginalMember(owner = "client!pga", name = "h", descriptor = "I")
    public int field6906;

    @OriginalMember(owner = "client!pga", name = "d", descriptor = "[B")
    public byte[] field6902;

    @OriginalMember(owner = "client!pga", name = "i", descriptor = "[B")
    public byte[] field6907;

    @OriginalMember(owner = "client!pga", name = "g", descriptor = "[I")
    public int[] field6905;

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(I)V")
    public final void method2873(int arg0) {
        int var2 = -1;
        if (this.field6905.length < 255) {
            for (int var3 = 0; var3 < this.field6905.length; var3++) {
                if (this.field6905[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field6905.length;
                int[] var4 = new int[this.field6905.length + 1];
                class252.method1544(this.field6905, 0, var4, 0, this.field6905.length);
                this.field6905 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field6905.length; var9++) {
                int var13 = this.field6905[var9];
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
        for (int var10 = this.field6906 - 1; var10 > 0; var10--) {
            int var11 = this.field6899 * var10;
            for (int var12 = this.field6899 - 1; var12 > 0; var12--) {
                if (this.field6905[this.field6907[var11 + var12] & 0xFF] == 0 && this.field6905[this.field6907[var11 + var12 - this.field6899 - 1] & 0xFF] != 0) {
                    this.field6907[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Ljn;II)Lpga;")
    public static final class495 method2874(class668 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3800(arg2, arg1, (byte) -92);
        return var3 == null ? null : method2887(var3)[0];
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "()I")
    public final int method2875() {
        return this.field6906 + this.field6900 + this.field6904;
    }

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "()V")
    public final void method2876() {
        int var1 = this.method2882();
        int var2 = this.method2875();
        if (this.field6899 == var1 && this.field6906 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field6902 == null) {
            for (int var9 = 0; var9 < this.field6906; var9++) {
                int var10 = this.field6899 * var9;
                int var11 = (this.field6900 + var9) * var1 + this.field6901;
                for (int var12 = 0; var12 < this.field6899; var12++) {
                    var3[var11++] = this.field6907[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field6906; var5++) {
                int var6 = this.field6899 * var5;
                int var7 = (this.field6900 + var5) * var1 + this.field6901;
                for (int var8 = 0; var8 < this.field6899; var8++) {
                    var3[var7] = this.field6907[var6];
                    var4[var7++] = this.field6902[var6++];
                }
            }
            this.field6902 = var4;
        }
        this.field6901 = this.field6903 = this.field6900 = this.field6904 = 0;
        this.field6899 = var1;
        this.field6906 = var2;
        this.field6907 = var3;
    }

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "(Ljn;II)[Lpga;")
    public static final class495[] method2877(class668 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3800(arg2, arg1, (byte) -92);
        return var3 == null ? null : method2887(var3);
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Ljn;I)[Lpga;")
    public static final class495[] method2878(class668 arg0, int arg1) {
        byte[] var2 = arg0.method3811(123, arg1);
        return var2 == null ? null : method2887(var2);
    }

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "(I)V")
    public final void method2879(int arg0) {
        int var2 = -1;
        if (this.field6905.length < 255) {
            for (int var3 = 0; var3 < this.field6905.length; var3++) {
                if (this.field6905[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field6905.length;
                int[] var4 = new int[this.field6905.length + 1];
                class252.method1544(this.field6905, 0, var4, 0, this.field6905.length);
                this.field6905 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field6905.length; var9++) {
                int var15 = this.field6905[var9];
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
        byte[] var11 = new byte[this.field6906 * this.field6899];
        for (int var12 = 0; var12 < this.field6906; var12++) {
            for (int var13 = 0; var13 < this.field6899; var13++) {
                int var14 = this.field6907[var10] & 0xFF;
                if (this.field6905[var14] == 0) {
                    if (var13 > 0 && this.field6905[this.field6907[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field6905[this.field6907[var10 - this.field6899] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field6899 - 1 && this.field6905[this.field6907[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field6906 - 1 && this.field6905[this.field6907[this.field6899 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field6907 = var11;
    }

    @OriginalMember(owner = "client!pga", name = "c", descriptor = "(I)V")
    public final void method2880(int arg0) {
        int var2 = this.method2882();
        int var3 = this.method2875();
        if (this.field6899 == var2 && this.field6906 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field6901) {
            var4 = this.field6901;
        }
        int var5 = arg0;
        if (this.field6901 + arg0 + this.field6899 > var2) {
            var5 = var2 - this.field6901 - this.field6899;
        }
        int var6 = arg0;
        if (arg0 > this.field6900) {
            var6 = this.field6900;
        }
        int var7 = arg0;
        if (this.field6900 + arg0 + this.field6906 > var3) {
            var7 = var3 - this.field6900 - this.field6906;
        }
        int var8 = this.field6899 + var4 + var5;
        int var9 = this.field6906 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field6902 == null) {
            for (int var11 = 0; var11 < this.field6906; var11++) {
                int var12 = this.field6899 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field6899; var14++) {
                    var10[var13++] = this.field6907[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field6906; var16++) {
                int var17 = this.field6899 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field6899; var19++) {
                    var15[var18] = this.field6902[var17];
                    var10[var18++] = this.field6907[var17++];
                }
            }
            this.field6902 = var15;
        }
        this.field6901 -= var4;
        this.field6900 -= var6;
        this.field6903 -= var5;
        this.field6904 -= var7;
        this.field6899 = var8;
        this.field6906 = var9;
        this.field6907 = var10;
    }

    @OriginalMember(owner = "client!pga", name = "c", descriptor = "()V")
    public final void method2881() {
        byte[] var1 = this.field6907;
        if (this.field6902 == null) {
            for (int var2 = this.field6906 - 1; var2 >= 0; var2--) {
                int var3 = this.field6899 * var2;
                int var4 = (var2 + 1) * this.field6899;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field6902;
            for (int var7 = this.field6906 - 1; var7 >= 0; var7--) {
                int var9 = this.field6899 * var7;
                int var10 = (var7 + 1) * this.field6899;
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
        int var8 = this.field6901;
        this.field6901 = this.field6903;
        this.field6903 = var8;
    }

    @OriginalMember(owner = "client!pga", name = "d", descriptor = "()I")
    public final int method2882() {
        return this.field6901 + this.field6899 + this.field6903;
    }

    @OriginalMember(owner = "client!pga", name = "e", descriptor = "()[I")
    public final int[] method2883() {
        int var1 = this.method2882();
        int[] var2 = new int[var1 * this.method2875()];
        if (this.field6902 == null) {
            for (int var7 = 0; var7 < this.field6906; var7++) {
                int var8 = this.field6899 * var7;
                int var9 = (this.field6900 + var7) * var1 + this.field6901;
                for (int var10 = 0; var10 < this.field6899; var10++) {
                    int var11 = this.field6905[this.field6907[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field6906; var3++) {
                int var4 = this.field6899 * var3;
                int var5 = (this.field6900 + var3) * var1 + this.field6901;
                for (int var6 = 0; var6 < this.field6899; var6++) {
                    var2[var5++] = this.field6902[var4] << 24 | this.field6905[this.field6907[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!pga", name = "f", descriptor = "()V")
    public final void method2884() {
        byte[] var1 = new byte[this.field6906 * this.field6899];
        int var2 = 0;
        if (this.field6902 == null) {
            for (int var3 = 0; var3 < this.field6899; var3++) {
                for (int var4 = this.field6906 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field6907[this.field6899 * var4 + var3];
                }
            }
            this.field6907 = var1;
        } else {
            byte[] var5 = new byte[this.field6906 * this.field6899];
            for (int var6 = 0; var6 < this.field6899; var6++) {
                for (int var9 = this.field6906 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field6907[this.field6899 * var9 + var6];
                    var5[var2++] = this.field6902[this.field6899 * var9 + var6];
                }
            }
            this.field6907 = var1;
            this.field6902 = var5;
        }
        int var7 = this.field6900;
        this.field6900 = this.field6901;
        this.field6901 = this.field6904;
        this.field6904 = this.field6903;
        this.field6903 = this.field6900;
        int var8 = this.field6906;
        this.field6906 = this.field6899;
        this.field6899 = var8;
    }

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "(Ljn;I)Lpga;")
    public static final class495 method2885(class668 arg0, int arg1) {
        byte[] var2 = arg0.method3811(124, arg1);
        return var2 == null ? null : method2887(var2)[0];
    }

    @OriginalMember(owner = "client!pga", name = "g", descriptor = "()V")
    public final void method2886() {
        byte[] var1 = this.field6907;
        if (this.field6902 == null) {
            for (int var2 = (this.field6906 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field6899 * var2;
                int var4 = (this.field6906 - var2 - 1) * this.field6899;
                for (int var5 = -this.field6899; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field6902;
            for (int var8 = (this.field6906 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field6899 * var8;
                int var11 = (this.field6906 - var8 - 1) * this.field6899;
                for (int var12 = -this.field6899; var12 < 0; var12++) {
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
        int var9 = this.field6900;
        this.field6900 = this.field6904;
        this.field6904 = var9;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "([B)[Lpga;")
    private static final class495[] method2887(byte[] arg0) {
        class389 var1 = new class389(arg0);
        var1.field5195 = arg0.length - 2;
        int var2 = var1.method2260(-124);
        class495[] var3 = new class495[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class495();
        }
        var1.field5195 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method2260(-58);
        int var6 = var1.method2260(-76);
        int var7 = (var1.method2229(255) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field6901 = var1.method2260(-109);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field6900 = var1.method2260(-85);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field6899 = var1.method2260(-38);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field6906 = var1.method2260(-56);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class495 var32 = var3[var12];
            var32.field6903 = var5 - var32.field6899 - var32.field6901;
            var32.field6904 = var6 - var32.field6906 - var32.field6900;
        }
        var1.field5195 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method2258(-3);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field6905 = var13;
        }
        var1.field5195 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class495 var17 = var3[var16];
            int var18 = var17.field6906 * var17.field6899;
            var17.field6907 = new byte[var18];
            int var19 = var1.method2229(255);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field6902 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field6907[var24] = var1.method2249((byte) -70);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field6902[var25] = var1.method2249((byte) -70);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field6899; var27++) {
                        for (int var31 = 0; var31 < var17.field6906; var31++) {
                            var17.field6907[var17.field6899 * var31 + var27] = var1.method2249((byte) -70);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field6899; var28++) {
                        for (int var29 = 0; var29 < var17.field6906; var29++) {
                            byte var30 = var17.field6902[var17.field6899 * var29 + var28] = var1.method2249((byte) -70);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field6902 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field6907[var20] = var1.method2249((byte) -70);
                }
            } else {
                for (int var21 = 0; var21 < var17.field6899; var21++) {
                    for (int var22 = 0; var22 < var17.field6906; var22++) {
                        var17.field6907[var17.field6899 * var22 + var21] = var1.method2249((byte) -70);
                    }
                }
            }
        }
        return var3;
    }
}
