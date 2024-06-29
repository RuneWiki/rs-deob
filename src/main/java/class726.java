import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class726 {

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "I")
    public int field10179;

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "I")
    public int field10180;

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "I")
    public int field10182;

    @OriginalMember(owner = "client!gu", name = "f", descriptor = "I")
    public int field10184;

    @OriginalMember(owner = "client!gu", name = "h", descriptor = "I")
    public int field10186;

    @OriginalMember(owner = "client!gu", name = "i", descriptor = "I")
    public int field10187;

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "[B")
    public byte[] field10181;

    @OriginalMember(owner = "client!gu", name = "g", descriptor = "[B")
    public byte[] field10185;

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "[I")
    public int[] field10183;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lla;II)Lgu;", line = 4)
    public static final class726 method4002(class422 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2624(0, arg1, arg2);
        return var3 == null ? null : method4011(var3)[0];
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "()[I", line = 12)
    public final int[] method4003() {
        int var1 = this.method4008();
        int[] var2 = new int[var1 * this.method4012()];
        if (this.field10185 == null) {
            for (int var7 = 0; var7 < this.field10186; var7++) {
                int var8 = this.field10184 * var7;
                int var9 = (this.field10182 + var7) * var1 + this.field10179;
                for (int var10 = 0; var10 < this.field10184; var10++) {
                    int var11 = this.field10183[this.field10181[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field10186; var3++) {
                int var4 = this.field10184 * var3;
                int var5 = (this.field10182 + var3) * var1 + this.field10179;
                for (int var6 = 0; var6 < this.field10184; var6++) {
                    var2[var5++] = this.field10185[var4] << 24 | this.field10183[this.field10181[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "()V", line = 79)
    public final void method4004() {
        byte[] var1 = this.field10181;
        if (this.field10185 == null) {
            for (int var2 = (this.field10186 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field10184 * var2;
                int var4 = (this.field10186 - var2 - 1) * this.field10184;
                for (int var5 = -this.field10184; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field10185;
            for (int var8 = (this.field10186 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field10184 * var8;
                int var11 = (this.field10186 - var8 - 1) * this.field10184;
                for (int var12 = -this.field10184; var12 < 0; var12++) {
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
        int var9 = this.field10182;
        this.field10182 = this.field10180;
        this.field10180 = var9;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)V", line = 149)
    public final void method4005(int arg0) {
        int var2 = -1;
        if (this.field10183.length < 255) {
            for (int var3 = 0; var3 < this.field10183.length; var3++) {
                if (this.field10183[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field10183.length;
                int[] var4 = new int[this.field10183.length + 1];
                class571.method3314(this.field10183, 0, var4, 0, this.field10183.length);
                this.field10183 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field10183.length; var9++) {
                int var15 = this.field10183[var9];
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
        byte[] var11 = new byte[this.field10186 * this.field10184];
        for (int var12 = 0; var12 < this.field10186; var12++) {
            for (int var13 = 0; var13 < this.field10184; var13++) {
                int var14 = this.field10181[var10] & 0xFF;
                if (this.field10183[var14] == 0) {
                    if (var13 > 0 && this.field10183[this.field10181[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field10183[this.field10181[var10 - this.field10184] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field10184 - 1 && this.field10183[this.field10181[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field10186 - 1 && this.field10183[this.field10181[this.field10184 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field10181 = var11;
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(Lla;II)[Lgu;", line = 274)
    public static final class726[] method4006(class422 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2624(0, arg1, arg2);
        return var3 == null ? null : method4011(var3);
    }

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "()V", line = 284)
    public final void method4007() {
        int var1 = this.method4008();
        int var2 = this.method4012();
        if (this.field10184 == var1 && this.field10186 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field10185 == null) {
            for (int var9 = 0; var9 < this.field10186; var9++) {
                int var10 = this.field10184 * var9;
                int var11 = (this.field10182 + var9) * var1 + this.field10179;
                for (int var12 = 0; var12 < this.field10184; var12++) {
                    var3[var11++] = this.field10181[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field10186; var5++) {
                int var6 = this.field10184 * var5;
                int var7 = (this.field10182 + var5) * var1 + this.field10179;
                for (int var8 = 0; var8 < this.field10184; var8++) {
                    var3[var7] = this.field10181[var6];
                    var4[var7++] = this.field10185[var6++];
                }
            }
            this.field10185 = var4;
        }
        this.field10179 = this.field10187 = this.field10182 = this.field10180 = 0;
        this.field10184 = var1;
        this.field10186 = var2;
        this.field10181 = var3;
    }

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "()I", line = 353)
    public final int method4008() {
        return this.field10184 + this.field10179 + this.field10187;
    }

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "()V", line = 360)
    public final void method4009() {
        byte[] var1 = new byte[this.field10186 * this.field10184];
        int var2 = 0;
        if (this.field10185 == null) {
            for (int var3 = 0; var3 < this.field10184; var3++) {
                for (int var4 = this.field10186 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field10181[this.field10184 * var4 + var3];
                }
            }
            this.field10181 = var1;
        } else {
            byte[] var5 = new byte[this.field10186 * this.field10184];
            for (int var6 = 0; var6 < this.field10184; var6++) {
                for (int var9 = this.field10186 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field10181[this.field10184 * var9 + var6];
                    var5[var2++] = this.field10185[this.field10184 * var9 + var6];
                }
            }
            this.field10181 = var1;
            this.field10185 = var5;
        }
        int var7 = this.field10182;
        this.field10182 = this.field10179;
        this.field10179 = this.field10180;
        this.field10180 = this.field10187;
        this.field10187 = this.field10182;
        int var8 = this.field10186;
        this.field10186 = this.field10184;
        this.field10184 = var8;
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)V", line = 420)
    public final void method4010(int arg0) {
        int var2 = -1;
        if (this.field10183.length < 255) {
            for (int var3 = 0; var3 < this.field10183.length; var3++) {
                if (this.field10183[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field10183.length;
                int[] var4 = new int[this.field10183.length + 1];
                class571.method3314(this.field10183, 0, var4, 0, this.field10183.length);
                this.field10183 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field10183.length; var9++) {
                int var13 = this.field10183[var9];
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
        for (int var10 = this.field10186 - 1; var10 > 0; var10--) {
            int var11 = this.field10184 * var10;
            for (int var12 = this.field10184 - 1; var12 > 0; var12--) {
                if (this.field10183[this.field10181[var11 + var12] & 0xFF] == 0 && this.field10183[this.field10181[var11 + var12 - this.field10184 - 1] & 0xFF] != 0) {
                    this.field10181[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "([B)[Lgu;", line = 523)
    private static final class726[] method4011(byte[] arg0) {
        class301 var1 = new class301(arg0);
        var1.field4534 = arg0.length - 2;
        int var2 = var1.method1989((byte) -87);
        class726[] var3 = new class726[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class726();
        }
        var1.field4534 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method1989((byte) -120);
        int var6 = var1.method1989((byte) -123);
        int var7 = (var1.method1987(-68) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field10179 = var1.method1989((byte) -67);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field10182 = var1.method1989((byte) -93);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field10184 = var1.method1989((byte) -84);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field10186 = var1.method1989((byte) -50);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class726 var32 = var3[var12];
            var32.field10187 = var5 - var32.field10184 - var32.field10179;
            var32.field10180 = var6 - var32.field10186 - var32.field10182;
        }
        var1.field4534 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method1952(22085);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field10183 = var13;
        }
        var1.field4534 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class726 var17 = var3[var16];
            int var18 = var17.field10186 * var17.field10184;
            var17.field10181 = new byte[var18];
            int var19 = var1.method1987(-64);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field10185 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field10181[var24] = var1.method1984(4);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field10185[var25] = var1.method1984(4);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field10184; var27++) {
                        for (int var31 = 0; var31 < var17.field10186; var31++) {
                            var17.field10181[var17.field10184 * var31 + var27] = var1.method1984(4);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field10184; var28++) {
                        for (int var29 = 0; var29 < var17.field10186; var29++) {
                            byte var30 = var17.field10185[var17.field10184 * var29 + var28] = var1.method1984(4);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field10185 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field10181[var20] = var1.method1984(4);
                }
            } else {
                for (int var21 = 0; var21 < var17.field10184; var21++) {
                    for (int var22 = 0; var22 < var17.field10186; var22++) {
                        var17.field10181[var17.field10184 * var22 + var21] = var1.method1984(4);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gu", name = "f", descriptor = "()I", line = 729)
    public final int method4012() {
        return this.field10186 + this.field10182 + this.field10180;
    }

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "(I)V", line = 734)
    public final void method4013(int arg0) {
        int var2 = this.method4008();
        int var3 = this.method4012();
        if (this.field10184 == var2 && this.field10186 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field10179) {
            var4 = this.field10179;
        }
        int var5 = arg0;
        if (this.field10179 + arg0 + this.field10184 > var2) {
            var5 = var2 - this.field10179 - this.field10184;
        }
        int var6 = arg0;
        if (arg0 > this.field10182) {
            var6 = this.field10182;
        }
        int var7 = arg0;
        if (this.field10182 + arg0 + this.field10186 > var3) {
            var7 = var3 - this.field10182 - this.field10186;
        }
        int var8 = this.field10184 + var4 + var5;
        int var9 = this.field10186 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field10185 == null) {
            for (int var11 = 0; var11 < this.field10186; var11++) {
                int var12 = this.field10184 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field10184; var14++) {
                    var10[var13++] = this.field10181[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field10186; var16++) {
                int var17 = this.field10184 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field10184; var19++) {
                    var15[var18] = this.field10185[var17];
                    var10[var18++] = this.field10181[var17++];
                }
            }
            this.field10185 = var15;
        }
        this.field10179 -= var4;
        this.field10182 -= var6;
        this.field10187 -= var5;
        this.field10180 -= var7;
        this.field10184 = var8;
        this.field10186 = var9;
        this.field10181 = var10;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lla;I)Lgu;", line = 831)
    public static final class726 method4014(class422 arg0, int arg1) {
        byte[] var2 = arg0.method2633(true, arg1);
        return var2 == null ? null : method4011(var2)[0];
    }

    @OriginalMember(owner = "client!gu", name = "g", descriptor = "()V", line = 840)
    public final void method4015() {
        byte[] var1 = this.field10181;
        if (this.field10185 == null) {
            for (int var2 = this.field10186 - 1; var2 >= 0; var2--) {
                int var3 = this.field10184 * var2;
                int var4 = (var2 + 1) * this.field10184;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field10185;
            for (int var7 = this.field10186 - 1; var7 >= 0; var7--) {
                int var9 = this.field10184 * var7;
                int var10 = (var7 + 1) * this.field10184;
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
        int var8 = this.field10179;
        this.field10179 = this.field10187;
        this.field10187 = var8;
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(Lla;I)[Lgu;", line = 902)
    public static final class726[] method4016(class422 arg0, int arg1) {
        byte[] var2 = arg0.method2633(true, arg1);
        return var2 == null ? null : method4011(var2);
    }
}
