import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class340 {

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public int field5114;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public int field5115;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public int field5117;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public int field5118;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public int field5119;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
    public int field5120;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "[B")
    public byte[] field5113;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "[B")
    public byte[] field5116;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "[I")
    public int[] field5112;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lph;I)[Lef;", line = 7)
    public static final class340[] method2135(class459 arg0, int arg1) {
        byte[] var2 = arg0.method2760((byte) -104, arg1);
        return var2 == null ? null : method2141(var2);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V", line = 15)
    public final void method2136(int arg0) {
        int var2 = this.method2140();
        int var3 = this.method2138();
        if (this.field5114 == var2 && this.field5115 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field5119) {
            var4 = this.field5119;
        }
        int var5 = arg0;
        if (this.field5119 + arg0 + this.field5114 > var2) {
            var5 = var2 - this.field5119 - this.field5114;
        }
        int var6 = arg0;
        if (arg0 > this.field5118) {
            var6 = this.field5118;
        }
        int var7 = arg0;
        if (this.field5118 + arg0 + this.field5115 > var3) {
            var7 = var3 - this.field5118 - this.field5115;
        }
        int var8 = this.field5114 + var4 + var5;
        int var9 = this.field5115 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field5116 == null) {
            for (int var11 = 0; var11 < this.field5115; var11++) {
                int var12 = this.field5114 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field5114; var14++) {
                    var10[var13++] = this.field5113[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field5115; var16++) {
                int var17 = this.field5114 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field5114; var19++) {
                    var15[var18] = this.field5116[var17];
                    var10[var18++] = this.field5113[var17++];
                }
            }
            this.field5116 = var15;
        }
        this.field5119 -= var4;
        this.field5118 -= var6;
        this.field5117 -= var5;
        this.field5120 -= var7;
        this.field5114 = var8;
        this.field5115 = var9;
        this.field5113 = var10;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(Lph;I)Lef;", line = 110)
    public static final class340 method2137(class459 arg0, int arg1) {
        byte[] var2 = arg0.method2760((byte) -77, arg1);
        return var2 == null ? null : method2141(var2)[0];
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "()I", line = 117)
    public final int method2138() {
        return this.field5118 + this.field5115 + this.field5120;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lph;II)Lef;", line = 121)
    public static final class340 method2139(class459 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2757(arg1, arg2, (byte) -127);
        return var3 == null ? null : method2141(var3)[0];
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "()I", line = 128)
    public final int method2140() {
        return this.field5119 + this.field5114 + this.field5117;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "([B)[Lef;", line = 135)
    private static final class340[] method2141(byte[] arg0) {
        class289 var1 = new class289(arg0);
        var1.field4399 = arg0.length - 2;
        int var2 = var1.method1841((byte) 6);
        class340[] var3 = new class340[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class340();
        }
        var1.field4399 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method1841((byte) -122);
        int var6 = var1.method1841((byte) -2);
        int var7 = (var1.method1858(-3256) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field5119 = var1.method1841((byte) 73);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field5118 = var1.method1841((byte) -128);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field5114 = var1.method1841((byte) -7);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field5115 = var1.method1841((byte) -121);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class340 var32 = var3[var12];
            var32.field5117 = var5 - var32.field5114 - var32.field5119;
            var32.field5120 = var6 - var32.field5115 - var32.field5118;
        }
        var1.field4399 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method1863(94);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field5112 = var13;
        }
        var1.field4399 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class340 var17 = var3[var16];
            int var18 = var17.field5115 * var17.field5114;
            var17.field5113 = new byte[var18];
            int var19 = var1.method1858(-3256);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field5116 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field5113[var24] = var1.method1816(true);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field5116[var25] = var1.method1816(true);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field5114; var27++) {
                        for (int var31 = 0; var31 < var17.field5115; var31++) {
                            var17.field5113[var17.field5114 * var31 + var27] = var1.method1816(true);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field5114; var28++) {
                        for (int var29 = 0; var29 < var17.field5115; var29++) {
                            byte var30 = var17.field5116[var17.field5114 * var29 + var28] = var1.method1816(true);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field5116 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field5113[var20] = var1.method1816(true);
                }
            } else {
                for (int var21 = 0; var21 < var17.field5114; var21++) {
                    for (int var22 = 0; var22 < var17.field5115; var22++) {
                        var17.field5113[var17.field5114 * var22 + var21] = var1.method1816(true);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V", line = 343)
    public final void method2142(int arg0) {
        int var2 = -1;
        if (this.field5112.length < 255) {
            for (int var3 = 0; var3 < this.field5112.length; var3++) {
                if (this.field5112[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field5112.length;
                int[] var4 = new int[this.field5112.length + 1];
                class394.method2447(this.field5112, 0, var4, 0, this.field5112.length);
                this.field5112 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field5112.length; var9++) {
                int var13 = this.field5112[var9];
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
        for (int var10 = this.field5115 - 1; var10 > 0; var10--) {
            int var11 = this.field5114 * var10;
            for (int var12 = this.field5114 - 1; var12 > 0; var12--) {
                if (this.field5112[this.field5113[var11 + var12] & 0xFF] == 0 && this.field5112[this.field5113[var11 + var12 - this.field5114 - 1] & 0xFF] != 0) {
                    this.field5113[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)V", line = 446)
    public final void method2143(int arg0) {
        int var2 = -1;
        if (this.field5112.length < 255) {
            for (int var3 = 0; var3 < this.field5112.length; var3++) {
                if (this.field5112[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field5112.length;
                int[] var4 = new int[this.field5112.length + 1];
                class394.method2447(this.field5112, 0, var4, 0, this.field5112.length);
                this.field5112 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field5112.length; var9++) {
                int var15 = this.field5112[var9];
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
        byte[] var11 = new byte[this.field5115 * this.field5114];
        for (int var12 = 0; var12 < this.field5115; var12++) {
            for (int var13 = 0; var13 < this.field5114; var13++) {
                int var14 = this.field5113[var10] & 0xFF;
                if (this.field5112[var14] == 0) {
                    if (var13 > 0 && this.field5112[this.field5113[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field5112[this.field5113[var10 - this.field5114] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field5114 - 1 && this.field5112[this.field5113[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field5115 - 1 && this.field5112[this.field5113[this.field5114 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field5113 = var11;
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "()V", line = 572)
    public final void method2144() {
        int var1 = this.method2140();
        int var2 = this.method2138();
        if (this.field5114 == var1 && this.field5115 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field5116 == null) {
            for (int var9 = 0; var9 < this.field5115; var9++) {
                int var10 = this.field5114 * var9;
                int var11 = (this.field5118 + var9) * var1 + this.field5119;
                for (int var12 = 0; var12 < this.field5114; var12++) {
                    var3[var11++] = this.field5113[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field5115; var5++) {
                int var6 = this.field5114 * var5;
                int var7 = (this.field5118 + var5) * var1 + this.field5119;
                for (int var8 = 0; var8 < this.field5114; var8++) {
                    var3[var7] = this.field5113[var6];
                    var4[var7++] = this.field5116[var6++];
                }
            }
            this.field5116 = var4;
        }
        this.field5119 = this.field5117 = this.field5118 = this.field5120 = 0;
        this.field5114 = var1;
        this.field5115 = var2;
        this.field5113 = var3;
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "()V", line = 642)
    public final void method2145() {
        byte[] var1 = this.field5113;
        if (this.field5116 == null) {
            for (int var2 = (this.field5115 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field5114 * var2;
                int var4 = (this.field5115 - var2 - 1) * this.field5114;
                for (int var5 = -this.field5114; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field5116;
            for (int var8 = (this.field5115 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field5114 * var8;
                int var11 = (this.field5115 - var8 - 1) * this.field5114;
                for (int var12 = -this.field5114; var12 < 0; var12++) {
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
        int var9 = this.field5118;
        this.field5118 = this.field5120;
        this.field5120 = var9;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(Lph;II)[Lef;", line = 714)
    public static final class340[] method2146(class459 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2757(arg1, arg2, (byte) -121);
        return var3 == null ? null : method2141(var3);
    }

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "()V", line = 722)
    public final void method2147() {
        byte[] var1 = new byte[this.field5115 * this.field5114];
        int var2 = 0;
        if (this.field5116 == null) {
            for (int var3 = 0; var3 < this.field5114; var3++) {
                for (int var4 = this.field5115 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field5113[this.field5114 * var4 + var3];
                }
            }
            this.field5113 = var1;
        } else {
            byte[] var5 = new byte[this.field5115 * this.field5114];
            for (int var6 = 0; var6 < this.field5114; var6++) {
                for (int var9 = this.field5115 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field5113[this.field5114 * var9 + var6];
                    var5[var2++] = this.field5116[this.field5114 * var9 + var6];
                }
            }
            this.field5113 = var1;
            this.field5116 = var5;
        }
        int var7 = this.field5118;
        this.field5118 = this.field5119;
        this.field5119 = this.field5120;
        this.field5120 = this.field5117;
        this.field5117 = this.field5118;
        int var8 = this.field5115;
        this.field5115 = this.field5114;
        this.field5114 = var8;
    }

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "()V", line = 785)
    public final void method2148() {
        byte[] var1 = this.field5113;
        if (this.field5116 == null) {
            for (int var2 = this.field5115 - 1; var2 >= 0; var2--) {
                int var3 = this.field5114 * var2;
                int var4 = (var2 + 1) * this.field5114;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field5116;
            for (int var7 = this.field5115 - 1; var7 >= 0; var7--) {
                int var9 = this.field5114 * var7;
                int var10 = (var7 + 1) * this.field5114;
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
        int var8 = this.field5119;
        this.field5119 = this.field5117;
        this.field5117 = var8;
    }

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "()[I", line = 847)
    public final int[] method2149() {
        int var1 = this.method2140();
        int[] var2 = new int[var1 * this.method2138()];
        if (this.field5116 == null) {
            for (int var7 = 0; var7 < this.field5115; var7++) {
                int var8 = this.field5114 * var7;
                int var9 = (this.field5118 + var7) * var1 + this.field5119;
                for (int var10 = 0; var10 < this.field5114; var10++) {
                    int var11 = this.field5112[this.field5113[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field5115; var3++) {
                int var4 = this.field5114 * var3;
                int var5 = (this.field5118 + var3) * var1 + this.field5119;
                for (int var6 = 0; var6 < this.field5114; var6++) {
                    var2[var5++] = this.field5116[var4] << 24 | this.field5112[this.field5113[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }
}
