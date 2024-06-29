import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class267 {

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public int field3778;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public int field3780;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
    public int field3782;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public int field3783;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
    public int field3784;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
    public int field3785;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "[B")
    public byte[] field3777;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "[B")
    public byte[] field3781;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "[I")
    public int[] field3779;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "()I", line = 4)
    public final int method1769() {
        return this.field3785 + this.field3784 + this.field3780;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V", line = 10)
    public final void method1770(int arg0) {
        int var2 = -1;
        if (this.field3779.length < 255) {
            for (int var3 = 0; var3 < this.field3779.length; var3++) {
                if (this.field3779[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field3779.length;
                int[] var4 = new int[this.field3779.length + 1];
                class363.method2320(this.field3779, 0, var4, 0, this.field3779.length);
                this.field3779 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field3779.length; var9++) {
                int var13 = this.field3779[var9];
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
        for (int var10 = this.field3778 - 1; var10 > 0; var10--) {
            int var11 = this.field3784 * var10;
            for (int var12 = this.field3784 - 1; var12 > 0; var12--) {
                if (this.field3779[this.field3781[var11 + var12] & 0xFF] == 0 && this.field3779[this.field3781[var11 + var12 - this.field3784 - 1] & 0xFF] != 0) {
                    this.field3781[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lin;I)Lrh;", line = 114)
    public static final class267 method1771(class91 arg0, int arg1) {
        byte[] var2 = arg0.method868((byte) 73, arg1);
        return var2 == null ? null : method1776(var2)[0];
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V", line = 122)
    public final void method1772(int arg0) {
        int var2 = this.method1769();
        int var3 = this.method1781();
        if (this.field3784 == var2 && this.field3778 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field3785) {
            var4 = this.field3785;
        }
        int var5 = arg0;
        if (this.field3785 + arg0 + this.field3784 > var2) {
            var5 = var2 - this.field3785 - this.field3784;
        }
        int var6 = arg0;
        if (arg0 > this.field3782) {
            var6 = this.field3782;
        }
        int var7 = arg0;
        if (this.field3782 + arg0 + this.field3778 > var3) {
            var7 = var3 - this.field3782 - this.field3778;
        }
        int var8 = this.field3784 + var4 + var5;
        int var9 = this.field3778 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field3777 == null) {
            for (int var11 = 0; var11 < this.field3778; var11++) {
                int var12 = this.field3784 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field3784; var14++) {
                    var10[var13++] = this.field3781[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field3778; var16++) {
                int var17 = this.field3784 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field3784; var19++) {
                    var15[var18] = this.field3777[var17];
                    var10[var18++] = this.field3781[var17++];
                }
            }
            this.field3777 = var15;
        }
        this.field3785 -= var4;
        this.field3782 -= var6;
        this.field3780 -= var5;
        this.field3783 -= var7;
        this.field3784 = var8;
        this.field3778 = var9;
        this.field3781 = var10;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "()V", line = 219)
    public final void method1773() {
        byte[] var1 = this.field3781;
        if (this.field3777 == null) {
            for (int var2 = (this.field3778 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field3784 * var2;
                int var4 = (this.field3778 - var2 - 1) * this.field3784;
                for (int var5 = -this.field3784; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field3777;
            for (int var8 = (this.field3778 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field3784 * var8;
                int var11 = (this.field3778 - var8 - 1) * this.field3784;
                for (int var12 = -this.field3784; var12 < 0; var12++) {
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
        int var9 = this.field3782;
        this.field3782 = this.field3783;
        this.field3783 = var9;
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)V", line = 289)
    public final void method1774(int arg0) {
        int var2 = -1;
        if (this.field3779.length < 255) {
            for (int var3 = 0; var3 < this.field3779.length; var3++) {
                if (this.field3779[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field3779.length;
                int[] var4 = new int[this.field3779.length + 1];
                class363.method2320(this.field3779, 0, var4, 0, this.field3779.length);
                this.field3779 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field3779.length; var9++) {
                int var15 = this.field3779[var9];
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
        byte[] var11 = new byte[this.field3784 * this.field3778];
        for (int var12 = 0; var12 < this.field3778; var12++) {
            for (int var13 = 0; var13 < this.field3784; var13++) {
                int var14 = this.field3781[var10] & 0xFF;
                if (this.field3779[var14] == 0) {
                    if (var13 > 0 && this.field3779[this.field3781[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field3779[this.field3781[var10 - this.field3784] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field3784 - 1 && this.field3779[this.field3781[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field3778 - 1 && this.field3779[this.field3781[this.field3784 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field3781 = var11;
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "()[I", line = 417)
    public final int[] method1775() {
        int var1 = this.method1769();
        int[] var2 = new int[var1 * this.method1781()];
        if (this.field3777 == null) {
            for (int var7 = 0; var7 < this.field3778; var7++) {
                int var8 = this.field3784 * var7;
                int var9 = (this.field3782 + var7) * var1 + this.field3785;
                for (int var10 = 0; var10 < this.field3784; var10++) {
                    int var11 = this.field3779[this.field3781[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field3778; var3++) {
                int var4 = this.field3784 * var3;
                int var5 = (this.field3782 + var3) * var1 + this.field3785;
                for (int var6 = 0; var6 < this.field3784; var6++) {
                    var2[var5++] = this.field3777[var4] << 24 | this.field3779[this.field3781[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "([B)[Lrh;", line = 481)
    private static final class267[] method1776(byte[] arg0) {
        class215 var1 = new class215(arg0);
        var1.field3109 = arg0.length - 2;
        int var2 = var1.method1478(842397944);
        class267[] var3 = new class267[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class267();
        }
        var1.field3109 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method1478(842397944);
        int var6 = var1.method1478(842397944);
        int var7 = (var1.method1535(255) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field3785 = var1.method1478(842397944);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field3782 = var1.method1478(842397944);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field3784 = var1.method1478(842397944);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field3778 = var1.method1478(842397944);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class267 var32 = var3[var12];
            var32.field3780 = var5 - var32.field3784 - var32.field3785;
            var32.field3783 = var6 - var32.field3778 - var32.field3782;
        }
        var1.field3109 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method1499(-1);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field3779 = var13;
        }
        var1.field3109 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class267 var17 = var3[var16];
            int var18 = var17.field3784 * var17.field3778;
            var17.field3781 = new byte[var18];
            int var19 = var1.method1535(255);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field3777 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field3781[var24] = var1.method1536(-118);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field3777[var25] = var1.method1536(-89);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field3784; var27++) {
                        for (int var31 = 0; var31 < var17.field3778; var31++) {
                            var17.field3781[var17.field3784 * var31 + var27] = var1.method1536(-84);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field3784; var28++) {
                        for (int var29 = 0; var29 < var17.field3778; var29++) {
                            byte var30 = var17.field3777[var17.field3784 * var29 + var28] = var1.method1536(-122);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field3777 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field3781[var20] = var1.method1536(-126);
                }
            } else {
                for (int var21 = 0; var21 < var17.field3784; var21++) {
                    for (int var22 = 0; var22 < var17.field3778; var22++) {
                        var17.field3781[var17.field3784 * var22 + var21] = var1.method1536(-96);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "()V", line = 691)
    public final void method1777() {
        byte[] var1 = this.field3781;
        if (this.field3777 == null) {
            for (int var2 = this.field3778 - 1; var2 >= 0; var2--) {
                int var3 = this.field3784 * var2;
                int var4 = (var2 + 1) * this.field3784;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field3777;
            for (int var7 = this.field3778 - 1; var7 >= 0; var7--) {
                int var9 = this.field3784 * var7;
                int var10 = (var7 + 1) * this.field3784;
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
        int var8 = this.field3785;
        this.field3785 = this.field3780;
        this.field3780 = var8;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lin;II)[Lrh;", line = 754)
    public static final class267[] method1778(class91 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method863(-1860, arg1, arg2);
        return var3 == null ? null : method1776(var3);
    }

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "()V", line = 762)
    public final void method1779() {
        byte[] var1 = new byte[this.field3784 * this.field3778];
        int var2 = 0;
        if (this.field3777 == null) {
            for (int var3 = 0; var3 < this.field3784; var3++) {
                for (int var4 = this.field3778 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field3781[this.field3784 * var4 + var3];
                }
            }
            this.field3781 = var1;
        } else {
            byte[] var5 = new byte[this.field3784 * this.field3778];
            for (int var6 = 0; var6 < this.field3784; var6++) {
                for (int var9 = this.field3778 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field3781[this.field3784 * var9 + var6];
                    var5[var2++] = this.field3777[this.field3784 * var9 + var6];
                }
            }
            this.field3781 = var1;
            this.field3777 = var5;
        }
        int var7 = this.field3782;
        this.field3782 = this.field3785;
        this.field3785 = this.field3783;
        this.field3783 = this.field3780;
        this.field3780 = this.field3782;
        int var8 = this.field3778;
        this.field3778 = this.field3784;
        this.field3784 = var8;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(Lin;II)Lrh;", line = 826)
    public static final class267 method1780(class91 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method863(-1860, arg1, arg2);
        return var3 == null ? null : method1776(var3)[0];
    }

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "()I", line = 833)
    public final int method1781() {
        return this.field3782 + this.field3778 + this.field3783;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(Lin;I)[Lrh;", line = 837)
    public static final class267[] method1782(class91 arg0, int arg1) {
        byte[] var2 = arg0.method868((byte) 73, arg1);
        return var2 == null ? null : method1776(var2);
    }

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "()V", line = 845)
    public final void method1783() {
        int var1 = this.method1769();
        int var2 = this.method1781();
        if (this.field3784 == var1 && this.field3778 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field3777 == null) {
            for (int var9 = 0; var9 < this.field3778; var9++) {
                int var10 = this.field3784 * var9;
                int var11 = (this.field3782 + var9) * var1 + this.field3785;
                for (int var12 = 0; var12 < this.field3784; var12++) {
                    var3[var11++] = this.field3781[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field3778; var5++) {
                int var6 = this.field3784 * var5;
                int var7 = (this.field3782 + var5) * var1 + this.field3785;
                for (int var8 = 0; var8 < this.field3784; var8++) {
                    var3[var7] = this.field3781[var6];
                    var4[var7++] = this.field3777[var6++];
                }
            }
            this.field3777 = var4;
        }
        this.field3785 = this.field3780 = this.field3782 = this.field3783 = 0;
        this.field3784 = var1;
        this.field3778 = var2;
        this.field3781 = var3;
    }
}
