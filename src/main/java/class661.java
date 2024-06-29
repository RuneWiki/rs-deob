import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public class class661 {

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "I")
    public int field9350;

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "I")
    public int field9351;

    @OriginalMember(owner = "client!aga", name = "d", descriptor = "I")
    public int field9353;

    @OriginalMember(owner = "client!aga", name = "e", descriptor = "I")
    public int field9354;

    @OriginalMember(owner = "client!aga", name = "g", descriptor = "I")
    public int field9356;

    @OriginalMember(owner = "client!aga", name = "h", descriptor = "I")
    public int field9357;

    @OriginalMember(owner = "client!aga", name = "c", descriptor = "[B")
    public byte[] field9352;

    @OriginalMember(owner = "client!aga", name = "f", descriptor = "[B")
    public byte[] field9355;

    @OriginalMember(owner = "client!aga", name = "i", descriptor = "[I")
    public int[] field9358;

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "()V", line = 6)
    public final void method3714() {
        byte[] var1 = this.field9352;
        if (this.field9355 == null) {
            for (int var2 = this.field9353 - 1; var2 >= 0; var2--) {
                int var3 = this.field9351 * var2;
                int var4 = (var2 + 1) * this.field9351;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field9355;
            for (int var7 = this.field9353 - 1; var7 >= 0; var7--) {
                int var9 = this.field9351 * var7;
                int var10 = (var7 + 1) * this.field9351;
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
        int var8 = this.field9354;
        this.field9354 = this.field9350;
        this.field9350 = var8;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(Lpl;II)Laga;", line = 69)
    public static final class661 method3715(class612 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3365(arg2, 45, arg1);
        return var3 == null ? null : method3719(var3)[0];
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(Lpl;I)[Laga;", line = 77)
    public static final class661[] method3716(class612 arg0, int arg1) {
        byte[] var2 = arg0.method3344(95, arg1);
        return var2 == null ? null : method3719(var2);
    }

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "()V", line = 85)
    public final void method3717() {
        int var1 = this.method3718();
        int var2 = this.method3720();
        if (this.field9351 == var1 && this.field9353 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field9355 == null) {
            for (int var9 = 0; var9 < this.field9353; var9++) {
                int var10 = this.field9351 * var9;
                int var11 = (this.field9356 + var9) * var1 + this.field9354;
                for (int var12 = 0; var12 < this.field9351; var12++) {
                    var3[var11++] = this.field9352[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field9353; var5++) {
                int var6 = this.field9351 * var5;
                int var7 = (this.field9356 + var5) * var1 + this.field9354;
                for (int var8 = 0; var8 < this.field9351; var8++) {
                    var3[var7] = this.field9352[var6];
                    var4[var7++] = this.field9355[var6++];
                }
            }
            this.field9355 = var4;
        }
        this.field9354 = this.field9350 = this.field9356 = this.field9357 = 0;
        this.field9351 = var1;
        this.field9353 = var2;
        this.field9352 = var3;
    }

    @OriginalMember(owner = "client!aga", name = "c", descriptor = "()I", line = 154)
    public final int method3718() {
        return this.field9354 + this.field9351 + this.field9350;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "([B)[Laga;", line = 159)
    private static final class661[] method3719(byte[] arg0) {
        class630 var1 = new class630(arg0);
        var1.field8812 = arg0.length - 2;
        int var2 = var1.method3470(13111);
        class661[] var3 = new class661[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class661();
        }
        var1.field8812 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method3470(13111);
        int var6 = var1.method3470(13111);
        int var7 = (var1.method3501(-9268) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field9354 = var1.method3470(13111);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field9356 = var1.method3470(13111);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field9351 = var1.method3470(13111);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field9353 = var1.method3470(13111);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class661 var32 = var3[var12];
            var32.field9350 = var5 - var32.field9351 - var32.field9354;
            var32.field9357 = var6 - var32.field9353 - var32.field9356;
        }
        var1.field8812 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method3517(-1);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field9358 = var13;
        }
        var1.field8812 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class661 var17 = var3[var16];
            int var18 = var17.field9353 * var17.field9351;
            var17.field9352 = new byte[var18];
            int var19 = var1.method3501(-9268);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field9355 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field9352[var24] = var1.method3480(-20933);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field9355[var25] = var1.method3480(-20933);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field9351; var27++) {
                        for (int var31 = 0; var31 < var17.field9353; var31++) {
                            var17.field9352[var17.field9351 * var31 + var27] = var1.method3480(-20933);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field9351; var28++) {
                        for (int var29 = 0; var29 < var17.field9353; var29++) {
                            byte var30 = var17.field9355[var17.field9351 * var29 + var28] = var1.method3480(-20933);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field9355 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field9352[var20] = var1.method3480(-20933);
                }
            } else {
                for (int var21 = 0; var21 < var17.field9351; var21++) {
                    for (int var22 = 0; var22 < var17.field9353; var22++) {
                        var17.field9352[var17.field9351 * var22 + var21] = var1.method3480(-20933);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aga", name = "d", descriptor = "()I", line = 365)
    public final int method3720() {
        return this.field9356 + this.field9353 + this.field9357;
    }

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "(Lpl;I)Laga;", line = 370)
    public static final class661 method3721(class612 arg0, int arg1) {
        byte[] var2 = arg0.method3344(102, arg1);
        return var2 == null ? null : method3719(var2)[0];
    }

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "(Lpl;II)[Laga;", line = 379)
    public static final class661[] method3722(class612 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3365(arg2, 66, arg1);
        return var3 == null ? null : method3719(var3);
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(I)V", line = 387)
    public final void method3723(int arg0) {
        int var2 = -1;
        if (this.field9358.length < 255) {
            for (int var3 = 0; var3 < this.field9358.length; var3++) {
                if (this.field9358[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field9358.length;
                int[] var4 = new int[this.field9358.length + 1];
                class293.method1640(this.field9358, 0, var4, 0, this.field9358.length);
                this.field9358 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field9358.length; var9++) {
                int var15 = this.field9358[var9];
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
        byte[] var11 = new byte[this.field9353 * this.field9351];
        for (int var12 = 0; var12 < this.field9353; var12++) {
            for (int var13 = 0; var13 < this.field9351; var13++) {
                int var14 = this.field9352[var10] & 0xFF;
                if (this.field9358[var14] == 0) {
                    if (var13 > 0 && this.field9358[this.field9352[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field9358[this.field9352[var10 - this.field9351] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field9351 - 1 && this.field9358[this.field9352[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field9353 - 1 && this.field9358[this.field9352[this.field9351 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field9352 = var11;
    }

    @OriginalMember(owner = "client!aga", name = "e", descriptor = "()V", line = 513)
    public final void method3724() {
        byte[] var1 = new byte[this.field9353 * this.field9351];
        int var2 = 0;
        if (this.field9355 == null) {
            for (int var3 = 0; var3 < this.field9351; var3++) {
                for (int var4 = this.field9353 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field9352[this.field9351 * var4 + var3];
                }
            }
            this.field9352 = var1;
        } else {
            byte[] var5 = new byte[this.field9353 * this.field9351];
            for (int var6 = 0; var6 < this.field9351; var6++) {
                for (int var9 = this.field9353 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field9352[this.field9351 * var9 + var6];
                    var5[var2++] = this.field9355[this.field9351 * var9 + var6];
                }
            }
            this.field9352 = var1;
            this.field9355 = var5;
        }
        int var7 = this.field9356;
        this.field9356 = this.field9354;
        this.field9354 = this.field9357;
        this.field9357 = this.field9350;
        this.field9350 = this.field9356;
        int var8 = this.field9353;
        this.field9353 = this.field9351;
        this.field9351 = var8;
    }

    @OriginalMember(owner = "client!aga", name = "f", descriptor = "()[I", line = 574)
    public final int[] method3725() {
        int var1 = this.method3718();
        int[] var2 = new int[var1 * this.method3720()];
        if (this.field9355 == null) {
            for (int var7 = 0; var7 < this.field9353; var7++) {
                int var8 = this.field9351 * var7;
                int var9 = (this.field9356 + var7) * var1 + this.field9354;
                for (int var10 = 0; var10 < this.field9351; var10++) {
                    int var11 = this.field9358[this.field9352[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field9353; var3++) {
                int var4 = this.field9351 * var3;
                int var5 = (this.field9356 + var3) * var1 + this.field9354;
                for (int var6 = 0; var6 < this.field9351; var6++) {
                    var2[var5++] = this.field9355[var4] << 24 | this.field9358[this.field9352[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!aga", name = "g", descriptor = "()V", line = 639)
    public final void method3726() {
        byte[] var1 = this.field9352;
        if (this.field9355 == null) {
            for (int var2 = (this.field9353 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field9351 * var2;
                int var4 = (this.field9353 - var2 - 1) * this.field9351;
                for (int var5 = -this.field9351; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field9355;
            for (int var8 = (this.field9353 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field9351 * var8;
                int var11 = (this.field9353 - var8 - 1) * this.field9351;
                for (int var12 = -this.field9351; var12 < 0; var12++) {
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
        int var9 = this.field9356;
        this.field9356 = this.field9357;
        this.field9357 = var9;
    }

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "(I)V", line = 710)
    public final void method3727(int arg0) {
        int var2 = this.method3718();
        int var3 = this.method3720();
        if (this.field9351 == var2 && this.field9353 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field9354) {
            var4 = this.field9354;
        }
        int var5 = arg0;
        if (this.field9354 + arg0 + this.field9351 > var2) {
            var5 = var2 - this.field9354 - this.field9351;
        }
        int var6 = arg0;
        if (arg0 > this.field9356) {
            var6 = this.field9356;
        }
        int var7 = arg0;
        if (this.field9356 + arg0 + this.field9353 > var3) {
            var7 = var3 - this.field9356 - this.field9353;
        }
        int var8 = this.field9351 + var4 + var5;
        int var9 = this.field9353 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field9355 == null) {
            for (int var11 = 0; var11 < this.field9353; var11++) {
                int var12 = this.field9351 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field9351; var14++) {
                    var10[var13++] = this.field9352[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field9353; var16++) {
                int var17 = this.field9351 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field9351; var19++) {
                    var15[var18] = this.field9355[var17];
                    var10[var18++] = this.field9352[var17++];
                }
            }
            this.field9355 = var15;
        }
        this.field9354 -= var4;
        this.field9356 -= var6;
        this.field9350 -= var5;
        this.field9357 -= var7;
        this.field9351 = var8;
        this.field9353 = var9;
        this.field9352 = var10;
    }

    @OriginalMember(owner = "client!aga", name = "c", descriptor = "(I)V", line = 806)
    public final void method3728(int arg0) {
        int var2 = -1;
        if (this.field9358.length < 255) {
            for (int var3 = 0; var3 < this.field9358.length; var3++) {
                if (this.field9358[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field9358.length;
                int[] var4 = new int[this.field9358.length + 1];
                class293.method1640(this.field9358, 0, var4, 0, this.field9358.length);
                this.field9358 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field9358.length; var9++) {
                int var13 = this.field9358[var9];
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
        for (int var10 = this.field9353 - 1; var10 > 0; var10--) {
            int var11 = this.field9351 * var10;
            for (int var12 = this.field9351 - 1; var12 > 0; var12--) {
                if (this.field9358[this.field9352[var11 + var12] & 0xFF] == 0 && this.field9358[this.field9352[var11 + var12 - this.field9351 - 1] & 0xFF] != 0) {
                    this.field9352[var11 + var12] = (byte) var2;
                }
            }
        }
    }
}
