import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class4 {

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "I")
    public int field33;

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "I")
    public int field35;

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "I")
    public int field36;

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "I")
    public int field37;

    @OriginalMember(owner = "client!ft", name = "f", descriptor = "I")
    public int field38;

    @OriginalMember(owner = "client!ft", name = "i", descriptor = "I")
    public int field41;

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "[B")
    public byte[] field34;

    @OriginalMember(owner = "client!ft", name = "g", descriptor = "[B")
    public byte[] field39;

    @OriginalMember(owner = "client!ft", name = "h", descriptor = "[I")
    public int[] field40;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "([B)[Lft;", line = 7)
    private static final class4[] method14(byte[] arg0) {
        class391 var1 = new class391(arg0);
        var1.field5719 = arg0.length - 2;
        int var2 = var1.method2353((byte) 87);
        class4[] var3 = new class4[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class4();
        }
        var1.field5719 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method2353((byte) 117);
        int var6 = var1.method2353((byte) 81);
        int var7 = (var1.method2348(-2) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field37 = var1.method2353((byte) 118);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field33 = var1.method2353((byte) 76);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field41 = var1.method2353((byte) 80);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field36 = var1.method2353((byte) 122);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class4 var32 = var3[var12];
            var32.field38 = var5 - var32.field41 - var32.field37;
            var32.field35 = var6 - var32.field36 - var32.field33;
        }
        var1.field5719 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method2338(true);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field40 = var13;
        }
        var1.field5719 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class4 var17 = var3[var16];
            int var18 = var17.field41 * var17.field36;
            var17.field34 = new byte[var18];
            int var19 = var1.method2348(-2);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field39 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field34[var24] = var1.method2337(-1);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field39[var25] = var1.method2337(-1);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field41; var27++) {
                        for (int var31 = 0; var31 < var17.field36; var31++) {
                            var17.field34[var17.field41 * var31 + var27] = var1.method2337(-1);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field41; var28++) {
                        for (int var29 = 0; var29 < var17.field36; var29++) {
                            byte var30 = var17.field39[var17.field41 * var29 + var28] = var1.method2337(-1);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field39 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field34[var20] = var1.method2337(-1);
                }
            } else {
                for (int var21 = 0; var21 < var17.field41; var21++) {
                    for (int var22 = 0; var22 < var17.field36; var22++) {
                        var17.field34[var17.field41 * var22 + var21] = var1.method2337(-1);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "()V", line = 214)
    public final void method15() {
        byte[] var1 = new byte[this.field41 * this.field36];
        int var2 = 0;
        if (this.field39 == null) {
            for (int var3 = 0; var3 < this.field41; var3++) {
                for (int var4 = this.field36 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field34[this.field41 * var4 + var3];
                }
            }
            this.field34 = var1;
        } else {
            byte[] var5 = new byte[this.field41 * this.field36];
            for (int var6 = 0; var6 < this.field41; var6++) {
                for (int var9 = this.field36 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field34[this.field41 * var9 + var6];
                    var5[var2++] = this.field39[this.field41 * var9 + var6];
                }
            }
            this.field34 = var1;
            this.field39 = var5;
        }
        int var7 = this.field33;
        this.field33 = this.field37;
        this.field37 = this.field35;
        this.field35 = this.field38;
        this.field38 = this.field33;
        int var8 = this.field36;
        this.field36 = this.field41;
        this.field41 = var8;
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "()V", line = 275)
    public final void method16() {
        int var1 = this.method18();
        int var2 = this.method20();
        if (this.field41 == var1 && this.field36 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field39 == null) {
            for (int var9 = 0; var9 < this.field36; var9++) {
                int var10 = this.field41 * var9;
                int var11 = (this.field33 + var9) * var1 + this.field37;
                for (int var12 = 0; var12 < this.field41; var12++) {
                    var3[var11++] = this.field34[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field36; var5++) {
                int var6 = this.field41 * var5;
                int var7 = (this.field33 + var5) * var1 + this.field37;
                for (int var8 = 0; var8 < this.field41; var8++) {
                    var3[var7] = this.field34[var6];
                    var4[var7++] = this.field39[var6++];
                }
            }
            this.field39 = var4;
        }
        this.field37 = this.field38 = this.field33 = this.field35 = 0;
        this.field41 = var1;
        this.field36 = var2;
        this.field34 = var3;
    }

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "()[I", line = 343)
    public final int[] method17() {
        int var1 = this.method18();
        int[] var2 = new int[var1 * this.method20()];
        if (this.field39 == null) {
            for (int var7 = 0; var7 < this.field36; var7++) {
                int var8 = this.field41 * var7;
                int var9 = (this.field33 + var7) * var1 + this.field37;
                for (int var10 = 0; var10 < this.field41; var10++) {
                    int var11 = this.field40[this.field34[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field36; var3++) {
                int var4 = this.field41 * var3;
                int var5 = (this.field33 + var3) * var1 + this.field37;
                for (int var6 = 0; var6 < this.field41; var6++) {
                    var2[var5++] = this.field39[var4] << 24 | this.field40[this.field34[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "()I", line = 406)
    public final int method18() {
        return this.field41 + this.field37 + this.field38;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lmg;I)Lft;", line = 410)
    public static final class4 method19(class101 arg0, int arg1) {
        byte[] var2 = arg0.method742(arg1, 1);
        return var2 == null ? null : method14(var2)[0];
    }

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "()I", line = 418)
    public final int method20() {
        return this.field36 + this.field33 + this.field35;
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(Lmg;I)[Lft;", line = 423)
    public static final class4[] method21(class101 arg0, int arg1) {
        byte[] var2 = arg0.method742(arg1, 1);
        return var2 == null ? null : method14(var2);
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lmg;II)Lft;", line = 432)
    public static final class4 method22(class101 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method727(arg2, arg1, 113);
        return var3 == null ? null : method14(var3)[0];
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)V", line = 441)
    public final void method23(int arg0) {
        int var2 = -1;
        if (this.field40.length < 255) {
            for (int var3 = 0; var3 < this.field40.length; var3++) {
                if (this.field40[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field40.length;
                int[] var4 = new int[this.field40.length + 1];
                class91.method680(this.field40, 0, var4, 0, this.field40.length);
                this.field40 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field40.length; var9++) {
                int var13 = this.field40[var9];
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
        for (int var10 = this.field36 - 1; var10 > 0; var10--) {
            int var11 = this.field41 * var10;
            for (int var12 = this.field41 - 1; var12 > 0; var12--) {
                if (this.field40[this.field34[var11 + var12] & 0xFF] == 0 && this.field40[this.field34[var11 + var12 - this.field41 - 1] & 0xFF] != 0) {
                    this.field34[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(Lmg;II)[Lft;", line = 545)
    public static final class4[] method24(class101 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method727(arg2, arg1, 51);
        return var3 == null ? null : method14(var3);
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(I)V", line = 554)
    public final void method25(int arg0) {
        int var2 = this.method18();
        int var3 = this.method20();
        if (this.field41 == var2 && this.field36 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field37) {
            var4 = this.field37;
        }
        int var5 = arg0;
        if (this.field37 + arg0 + this.field41 > var2) {
            var5 = var2 - this.field37 - this.field41;
        }
        int var6 = arg0;
        if (arg0 > this.field33) {
            var6 = this.field33;
        }
        int var7 = arg0;
        if (this.field33 + arg0 + this.field36 > var3) {
            var7 = var3 - this.field33 - this.field36;
        }
        int var8 = this.field41 + var4 + var5;
        int var9 = this.field36 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field39 == null) {
            for (int var11 = 0; var11 < this.field36; var11++) {
                int var12 = this.field41 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field41; var14++) {
                    var10[var13++] = this.field34[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field36; var16++) {
                int var17 = this.field41 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field41; var19++) {
                    var15[var18] = this.field39[var17];
                    var10[var18++] = this.field34[var17++];
                }
            }
            this.field39 = var15;
        }
        this.field37 -= var4;
        this.field33 -= var6;
        this.field38 -= var5;
        this.field35 -= var7;
        this.field41 = var8;
        this.field36 = var9;
        this.field34 = var10;
    }

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "(I)V", line = 651)
    public final void method26(int arg0) {
        int var2 = -1;
        if (this.field40.length < 255) {
            for (int var3 = 0; var3 < this.field40.length; var3++) {
                if (this.field40[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field40.length;
                int[] var4 = new int[this.field40.length + 1];
                class91.method680(this.field40, 0, var4, 0, this.field40.length);
                this.field40 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field40.length; var9++) {
                int var15 = this.field40[var9];
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
        byte[] var11 = new byte[this.field41 * this.field36];
        for (int var12 = 0; var12 < this.field36; var12++) {
            for (int var13 = 0; var13 < this.field41; var13++) {
                int var14 = this.field34[var10] & 0xFF;
                if (this.field40[var14] == 0) {
                    if (var13 > 0 && this.field40[this.field34[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field40[this.field34[var10 - this.field41] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field41 - 1 && this.field40[this.field34[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field36 - 1 && this.field40[this.field34[this.field41 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field34 = var11;
    }

    @OriginalMember(owner = "client!ft", name = "f", descriptor = "()V", line = 777)
    public final void method27() {
        byte[] var1 = this.field34;
        if (this.field39 == null) {
            for (int var2 = this.field36 - 1; var2 >= 0; var2--) {
                int var3 = this.field41 * var2;
                int var4 = (var2 + 1) * this.field41;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field39;
            for (int var7 = this.field36 - 1; var7 >= 0; var7--) {
                int var9 = this.field41 * var7;
                int var10 = (var7 + 1) * this.field41;
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
        int var8 = this.field37;
        this.field37 = this.field38;
        this.field38 = var8;
    }

    @OriginalMember(owner = "client!ft", name = "g", descriptor = "()V", line = 842)
    public final void method28() {
        byte[] var1 = this.field34;
        if (this.field39 == null) {
            for (int var2 = (this.field36 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field41 * var2;
                int var4 = (this.field36 - var2 - 1) * this.field41;
                for (int var5 = -this.field41; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field39;
            for (int var8 = (this.field36 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field41 * var8;
                int var11 = (this.field36 - var8 - 1) * this.field41;
                for (int var12 = -this.field41; var12 < 0; var12++) {
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
        int var9 = this.field33;
        this.field33 = this.field35;
        this.field35 = var9;
    }
}
