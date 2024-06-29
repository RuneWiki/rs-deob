import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class38 {

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "I")
    public int field783;

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "I")
    public int field785;

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "I")
    public int field786;

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "I")
    public int field787;

    @OriginalMember(owner = "client!bt", name = "g", descriptor = "I")
    public int field788;

    @OriginalMember(owner = "client!bt", name = "h", descriptor = "I")
    public int field789;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "[B")
    public byte[] field782;

    @OriginalMember(owner = "client!bt", name = "i", descriptor = "[B")
    public byte[] field790;

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "[I")
    public int[] field784;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "()I")
    public final int method394() {
        return this.field787 + this.field785 + this.field789;
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "()[I")
    public final int[] method395() {
        int var1 = this.method394();
        int[] var2 = new int[var1 * this.method404()];
        if (this.field790 == null) {
            for (int var7 = 0; var7 < this.field783; var7++) {
                int var8 = this.field785 * var7;
                int var9 = (this.field786 + var7) * var1 + this.field787;
                for (int var10 = 0; var10 < this.field785; var10++) {
                    int var11 = this.field784[this.field782[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field783; var3++) {
                int var4 = this.field785 * var3;
                int var5 = (this.field786 + var3) * var1 + this.field787;
                for (int var6 = 0; var6 < this.field785; var6++) {
                    var2[var5++] = this.field790[var4] << 24 | this.field784[this.field782[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lan;I)Lbt;")
    public static final class38 method396(class21 arg0, int arg1) {
        byte[] var2 = arg0.method242(arg1, (byte) -120);
        return var2 == null ? null : method405(var2)[0];
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lan;II)[Lbt;")
    public static final class38[] method397(class21 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method240(arg1, arg2, (byte) -124);
        return var3 == null ? null : method405(var3);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)V")
    public final void method398(int arg0) {
        int var2 = -1;
        if (this.field784.length < 255) {
            for (int var3 = 0; var3 < this.field784.length; var3++) {
                if (this.field784[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field784.length;
                int[] var4 = new int[this.field784.length + 1];
                class416.method2496(this.field784, 0, var4, 0, this.field784.length);
                this.field784 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field784.length; var9++) {
                int var13 = this.field784[var9];
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
        for (int var10 = this.field783 - 1; var10 > 0; var10--) {
            int var11 = this.field785 * var10;
            for (int var12 = this.field785 - 1; var12 > 0; var12--) {
                if (this.field784[this.field782[var11 + var12] & 0xFF] == 0 && this.field784[this.field782[var11 + var12 - this.field785 - 1] & 0xFF] != 0) {
                    this.field782[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(Lan;II)Lbt;")
    public static final class38 method399(class21 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method240(arg1, arg2, (byte) -124);
        return var3 == null ? null : method405(var3)[0];
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)V")
    public final void method400(int arg0) {
        int var2 = -1;
        if (this.field784.length < 255) {
            for (int var3 = 0; var3 < this.field784.length; var3++) {
                if (this.field784[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field784.length;
                int[] var4 = new int[this.field784.length + 1];
                class416.method2496(this.field784, 0, var4, 0, this.field784.length);
                this.field784 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field784.length; var9++) {
                int var15 = this.field784[var9];
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
        byte[] var11 = new byte[this.field785 * this.field783];
        for (int var12 = 0; var12 < this.field783; var12++) {
            for (int var13 = 0; var13 < this.field785; var13++) {
                int var14 = this.field782[var10] & 0xFF;
                if (this.field784[var14] == 0) {
                    if (var13 > 0 && this.field784[this.field782[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field784[this.field782[var10 - this.field785] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field785 - 1 && this.field784[this.field782[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field783 - 1 && this.field784[this.field782[this.field785 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field782 = var11;
    }

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "()V")
    public final void method401() {
        byte[] var1 = new byte[this.field785 * this.field783];
        int var2 = 0;
        if (this.field790 == null) {
            for (int var3 = 0; var3 < this.field785; var3++) {
                for (int var4 = this.field783 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field782[this.field785 * var4 + var3];
                }
            }
            this.field782 = var1;
        } else {
            byte[] var5 = new byte[this.field785 * this.field783];
            for (int var6 = 0; var6 < this.field785; var6++) {
                for (int var9 = this.field783 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field782[this.field785 * var9 + var6];
                    var5[var2++] = this.field790[this.field785 * var9 + var6];
                }
            }
            this.field782 = var1;
            this.field790 = var5;
        }
        int var7 = this.field786;
        this.field786 = this.field787;
        this.field787 = this.field788;
        this.field788 = this.field789;
        this.field789 = this.field786;
        int var8 = this.field783;
        this.field783 = this.field785;
        this.field785 = var8;
    }

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "()V")
    public final void method402() {
        byte[] var1 = this.field782;
        if (this.field790 == null) {
            for (int var2 = this.field783 - 1; var2 >= 0; var2--) {
                int var3 = this.field785 * var2;
                int var4 = (var2 + 1) * this.field785;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field790;
            for (int var7 = this.field783 - 1; var7 >= 0; var7--) {
                int var9 = this.field785 * var7;
                int var10 = (var7 + 1) * this.field785;
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
        int var8 = this.field787;
        this.field787 = this.field789;
        this.field789 = var8;
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(Lan;I)[Lbt;")
    public static final class38[] method403(class21 arg0, int arg1) {
        byte[] var2 = arg0.method242(arg1, (byte) -125);
        return var2 == null ? null : method405(var2);
    }

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "()I")
    public final int method404() {
        return this.field786 + this.field783 + this.field788;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "([B)[Lbt;")
    private static final class38[] method405(byte[] arg0) {
        class11 var1 = new class11(arg0);
        var1.field165 = arg0.length - 2;
        int var2 = var1.method93((byte) 92);
        class38[] var3 = new class38[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class38();
        }
        var1.field165 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method93((byte) 105);
        int var6 = var1.method93((byte) 92);
        int var7 = (var1.method110((byte) 25) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field787 = var1.method93((byte) 109);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field786 = var1.method93((byte) 116);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field785 = var1.method93((byte) 95);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field783 = var1.method93((byte) 91);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class38 var32 = var3[var12];
            var32.field789 = var5 - var32.field785 - var32.field787;
            var32.field788 = var6 - var32.field783 - var32.field786;
        }
        var1.field165 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method89((byte) -20);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field784 = var13;
        }
        var1.field165 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class38 var17 = var3[var16];
            int var18 = var17.field785 * var17.field783;
            var17.field782 = new byte[var18];
            int var19 = var1.method110((byte) 26);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field790 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field782[var24] = var1.method67(65280);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field790[var25] = var1.method67(65280);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field785; var27++) {
                        for (int var31 = 0; var31 < var17.field783; var31++) {
                            var17.field782[var17.field785 * var31 + var27] = var1.method67(65280);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field785; var28++) {
                        for (int var29 = 0; var29 < var17.field783; var29++) {
                            byte var30 = var17.field790[var17.field785 * var29 + var28] = var1.method67(65280);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field790 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field782[var20] = var1.method67(65280);
                }
            } else {
                for (int var21 = 0; var21 < var17.field785; var21++) {
                    for (int var22 = 0; var22 < var17.field783; var22++) {
                        var17.field782[var17.field785 * var22 + var21] = var1.method67(65280);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "()V")
    public final void method406() {
        byte[] var1 = this.field782;
        if (this.field790 == null) {
            for (int var2 = (this.field783 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field785 * var2;
                int var4 = (this.field783 - var2 - 1) * this.field785;
                for (int var5 = -this.field785; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field790;
            for (int var8 = (this.field783 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field785 * var8;
                int var11 = (this.field783 - var8 - 1) * this.field785;
                for (int var12 = -this.field785; var12 < 0; var12++) {
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
        int var9 = this.field786;
        this.field786 = this.field788;
        this.field788 = var9;
    }

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "(I)V")
    public final void method407(int arg0) {
        int var2 = this.method394();
        int var3 = this.method404();
        if (this.field785 == var2 && this.field783 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field787) {
            var4 = this.field787;
        }
        int var5 = arg0;
        if (this.field787 + arg0 + this.field785 > var2) {
            var5 = var2 - this.field787 - this.field785;
        }
        int var6 = arg0;
        if (arg0 > this.field786) {
            var6 = this.field786;
        }
        int var7 = arg0;
        if (this.field786 + arg0 + this.field783 > var3) {
            var7 = var3 - this.field786 - this.field783;
        }
        int var8 = this.field785 + var4 + var5;
        int var9 = this.field783 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field790 == null) {
            for (int var11 = 0; var11 < this.field783; var11++) {
                int var12 = this.field785 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field785; var14++) {
                    var10[var13++] = this.field782[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field783; var16++) {
                int var17 = this.field785 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field785; var19++) {
                    var15[var18] = this.field790[var17];
                    var10[var18++] = this.field782[var17++];
                }
            }
            this.field790 = var15;
        }
        this.field787 -= var4;
        this.field786 -= var6;
        this.field789 -= var5;
        this.field788 -= var7;
        this.field785 = var8;
        this.field783 = var9;
        this.field782 = var10;
    }

    @OriginalMember(owner = "client!bt", name = "g", descriptor = "()V")
    public final void method408() {
        int var1 = this.method394();
        int var2 = this.method404();
        if (this.field785 == var1 && this.field783 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field790 == null) {
            for (int var9 = 0; var9 < this.field783; var9++) {
                int var10 = this.field785 * var9;
                int var11 = (this.field786 + var9) * var1 + this.field787;
                for (int var12 = 0; var12 < this.field785; var12++) {
                    var3[var11++] = this.field782[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field783; var5++) {
                int var6 = this.field785 * var5;
                int var7 = (this.field786 + var5) * var1 + this.field787;
                for (int var8 = 0; var8 < this.field785; var8++) {
                    var3[var7] = this.field782[var6];
                    var4[var7++] = this.field790[var6++];
                }
            }
            this.field790 = var4;
        }
        this.field787 = this.field789 = this.field786 = this.field788 = 0;
        this.field785 = var1;
        this.field783 = var2;
        this.field782 = var3;
    }
}
