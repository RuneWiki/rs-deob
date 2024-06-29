import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class616 {

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "I")
    public int field8867;

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "I")
    public int field8868;

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "I")
    public int field8869;

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "I")
    public int field8870;

    @OriginalMember(owner = "client!ut", name = "f", descriptor = "I")
    public int field8872;

    @OriginalMember(owner = "client!ut", name = "h", descriptor = "I")
    public int field8874;

    @OriginalMember(owner = "client!ut", name = "e", descriptor = "[B")
    public byte[] field8871;

    @OriginalMember(owner = "client!ut", name = "i", descriptor = "[B")
    public byte[] field8875;

    @OriginalMember(owner = "client!ut", name = "g", descriptor = "[I")
    public int[] field8873;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "()V", line = 4)
    public final void method3507() {
        byte[] var1 = new byte[this.field8869 * this.field8868];
        int var2 = 0;
        if (this.field8875 == null) {
            for (int var3 = 0; var3 < this.field8869; var3++) {
                for (int var4 = this.field8868 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field8871[this.field8869 * var4 + var3];
                }
            }
            this.field8871 = var1;
        } else {
            byte[] var5 = new byte[this.field8869 * this.field8868];
            for (int var6 = 0; var6 < this.field8869; var6++) {
                for (int var9 = this.field8868 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field8871[this.field8869 * var9 + var6];
                    var5[var2++] = this.field8875[this.field8869 * var9 + var6];
                }
            }
            this.field8871 = var1;
            this.field8875 = var5;
        }
        int var7 = this.field8874;
        this.field8874 = this.field8870;
        this.field8870 = this.field8867;
        this.field8867 = this.field8872;
        this.field8872 = this.field8874;
        int var8 = this.field8868;
        this.field8868 = this.field8869;
        this.field8869 = var8;
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "()V", line = 67)
    public final void method3508() {
        int var1 = this.method3520();
        int var2 = this.method3512();
        if (this.field8869 == var1 && this.field8868 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field8875 == null) {
            for (int var9 = 0; var9 < this.field8868; var9++) {
                int var10 = this.field8869 * var9;
                int var11 = (this.field8874 + var9) * var1 + this.field8870;
                for (int var12 = 0; var12 < this.field8869; var12++) {
                    var3[var11++] = this.field8871[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field8868; var5++) {
                int var6 = this.field8869 * var5;
                int var7 = (this.field8874 + var5) * var1 + this.field8870;
                for (int var8 = 0; var8 < this.field8869; var8++) {
                    var3[var7] = this.field8871[var6];
                    var4[var7++] = this.field8875[var6++];
                }
            }
            this.field8875 = var4;
        }
        this.field8870 = this.field8872 = this.field8874 = this.field8867 = 0;
        this.field8869 = var1;
        this.field8868 = var2;
        this.field8871 = var3;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lmv;II)Lut;", line = 135)
    public static final class616 method3509(class295 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1844(arg1, 31330, arg2);
        return var3 == null ? null : method3511(var3)[0];
    }

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "()[I", line = 143)
    public final int[] method3510() {
        int var1 = this.method3520();
        int[] var2 = new int[var1 * this.method3512()];
        if (this.field8875 == null) {
            for (int var7 = 0; var7 < this.field8868; var7++) {
                int var8 = this.field8869 * var7;
                int var9 = (this.field8874 + var7) * var1 + this.field8870;
                for (int var10 = 0; var10 < this.field8869; var10++) {
                    int var11 = this.field8873[this.field8871[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field8868; var3++) {
                int var4 = this.field8869 * var3;
                int var5 = (this.field8874 + var3) * var1 + this.field8870;
                for (int var6 = 0; var6 < this.field8869; var6++) {
                    var2[var5++] = this.field8875[var4] << 24 | this.field8873[this.field8871[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "([B)[Lut;", line = 206)
    private static final class616[] method3511(byte[] arg0) {
        class540 var1 = new class540(arg0);
        var1.field7956 = arg0.length - 2;
        int var2 = var1.method3169(26488);
        class616[] var3 = new class616[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class616();
        }
        var1.field7956 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method3169(26488);
        int var6 = var1.method3169(26488);
        int var7 = (var1.method3115(29871) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field8870 = var1.method3169(26488);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field8874 = var1.method3169(26488);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field8869 = var1.method3169(26488);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field8868 = var1.method3169(26488);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class616 var32 = var3[var12];
            var32.field8872 = var5 - var32.field8869 - var32.field8870;
            var32.field8867 = var6 - var32.field8868 - var32.field8874;
        }
        var1.field7956 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method3154((byte) -125);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field8873 = var13;
        }
        var1.field7956 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class616 var17 = var3[var16];
            int var18 = var17.field8869 * var17.field8868;
            var17.field8871 = new byte[var18];
            int var19 = var1.method3115(29871);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field8875 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field8871[var24] = var1.method3128(32767);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field8875[var25] = var1.method3128(32767);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field8869; var27++) {
                        for (int var31 = 0; var31 < var17.field8868; var31++) {
                            var17.field8871[var17.field8869 * var31 + var27] = var1.method3128(32767);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field8869; var28++) {
                        for (int var29 = 0; var29 < var17.field8868; var29++) {
                            byte var30 = var17.field8875[var17.field8869 * var29 + var28] = var1.method3128(32767);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field8875 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field8871[var20] = var1.method3128(32767);
                }
            } else {
                for (int var21 = 0; var21 < var17.field8869; var21++) {
                    for (int var22 = 0; var22 < var17.field8868; var22++) {
                        var17.field8871[var17.field8869 * var22 + var21] = var1.method3128(32767);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "()I", line = 413)
    public final int method3512() {
        return this.field8874 + this.field8868 + this.field8867;
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(Lmv;II)[Lut;", line = 417)
    public static final class616[] method3513(class295 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1844(arg1, 31330, arg2);
        return var3 == null ? null : method3511(var3);
    }

    @OriginalMember(owner = "client!ut", name = "e", descriptor = "()V", line = 426)
    public final void method3514() {
        byte[] var1 = this.field8871;
        if (this.field8875 == null) {
            for (int var2 = this.field8868 - 1; var2 >= 0; var2--) {
                int var3 = this.field8869 * var2;
                int var4 = (var2 + 1) * this.field8869;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field8875;
            for (int var7 = this.field8868 - 1; var7 >= 0; var7--) {
                int var9 = this.field8869 * var7;
                int var10 = (var7 + 1) * this.field8869;
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
        int var8 = this.field8870;
        this.field8870 = this.field8872;
        this.field8872 = var8;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)V", line = 489)
    public final void method3515(int arg0) {
        int var2 = -1;
        if (this.field8873.length < 255) {
            for (int var3 = 0; var3 < this.field8873.length; var3++) {
                if (this.field8873[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field8873.length;
                int[] var4 = new int[this.field8873.length + 1];
                class667.method3740(this.field8873, 0, var4, 0, this.field8873.length);
                this.field8873 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field8873.length; var9++) {
                int var13 = this.field8873[var9];
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
        for (int var10 = this.field8868 - 1; var10 > 0; var10--) {
            int var11 = this.field8869 * var10;
            for (int var12 = this.field8869 - 1; var12 > 0; var12--) {
                if (this.field8873[this.field8871[var11 + var12] & 0xFF] == 0 && this.field8873[this.field8871[var11 + var12 - this.field8869 - 1] & 0xFF] != 0) {
                    this.field8871[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(I)V", line = 595)
    public final void method3516(int arg0) {
        int var2 = this.method3520();
        int var3 = this.method3512();
        if (this.field8869 == var2 && this.field8868 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field8870) {
            var4 = this.field8870;
        }
        int var5 = arg0;
        if (this.field8870 + arg0 + this.field8869 > var2) {
            var5 = var2 - this.field8870 - this.field8869;
        }
        int var6 = arg0;
        if (arg0 > this.field8874) {
            var6 = this.field8874;
        }
        int var7 = arg0;
        if (this.field8874 + arg0 + this.field8868 > var3) {
            var7 = var3 - this.field8874 - this.field8868;
        }
        int var8 = this.field8869 + var4 + var5;
        int var9 = this.field8868 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field8875 == null) {
            for (int var11 = 0; var11 < this.field8868; var11++) {
                int var12 = this.field8869 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field8869; var14++) {
                    var10[var13++] = this.field8871[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field8868; var16++) {
                int var17 = this.field8869 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field8869; var19++) {
                    var15[var18] = this.field8875[var17];
                    var10[var18++] = this.field8871[var17++];
                }
            }
            this.field8875 = var15;
        }
        this.field8870 -= var4;
        this.field8874 -= var6;
        this.field8872 -= var5;
        this.field8867 -= var7;
        this.field8869 = var8;
        this.field8868 = var9;
        this.field8871 = var10;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lmv;I)Lut;", line = 693)
    public static final class616 method3517(class295 arg0, int arg1) {
        byte[] var2 = arg0.method1830(false, arg1);
        return var2 == null ? null : method3511(var2)[0];
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(Lmv;I)[Lut;", line = 701)
    public static final class616[] method3518(class295 arg0, int arg1) {
        byte[] var2 = arg0.method1830(false, arg1);
        return var2 == null ? null : method3511(var2);
    }

    @OriginalMember(owner = "client!ut", name = "f", descriptor = "()V", line = 710)
    public final void method3519() {
        byte[] var1 = this.field8871;
        if (this.field8875 == null) {
            for (int var2 = (this.field8868 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field8869 * var2;
                int var4 = (this.field8868 - var2 - 1) * this.field8869;
                for (int var5 = -this.field8869; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field8875;
            for (int var8 = (this.field8868 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field8869 * var8;
                int var11 = (this.field8868 - var8 - 1) * this.field8869;
                for (int var12 = -this.field8869; var12 < 0; var12++) {
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
        int var9 = this.field8874;
        this.field8874 = this.field8867;
        this.field8867 = var9;
    }

    @OriginalMember(owner = "client!ut", name = "g", descriptor = "()I", line = 782)
    public final int method3520() {
        return this.field8870 + this.field8869 + this.field8872;
    }

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "(I)V", line = 788)
    public final void method3521(int arg0) {
        int var2 = -1;
        if (this.field8873.length < 255) {
            for (int var3 = 0; var3 < this.field8873.length; var3++) {
                if (this.field8873[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field8873.length;
                int[] var4 = new int[this.field8873.length + 1];
                class667.method3740(this.field8873, 0, var4, 0, this.field8873.length);
                this.field8873 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field8873.length; var9++) {
                int var15 = this.field8873[var9];
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
        byte[] var11 = new byte[this.field8869 * this.field8868];
        for (int var12 = 0; var12 < this.field8868; var12++) {
            for (int var13 = 0; var13 < this.field8869; var13++) {
                int var14 = this.field8871[var10] & 0xFF;
                if (this.field8873[var14] == 0) {
                    if (var13 > 0 && this.field8873[this.field8871[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field8873[this.field8871[var10 - this.field8869] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field8869 - 1 && this.field8873[this.field8871[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field8868 - 1 && this.field8873[this.field8871[this.field8869 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field8871 = var11;
    }
}
