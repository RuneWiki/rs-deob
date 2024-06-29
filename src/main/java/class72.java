import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class72 {

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "I")
    public int field891;

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "I")
    public int field893;

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "I")
    public int field894;

    @OriginalMember(owner = "client!ju", name = "e", descriptor = "I")
    public int field895;

    @OriginalMember(owner = "client!ju", name = "f", descriptor = "I")
    public int field896;

    @OriginalMember(owner = "client!ju", name = "g", descriptor = "I")
    public int field897;

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "[B")
    public byte[] field892;

    @OriginalMember(owner = "client!ju", name = "h", descriptor = "[B")
    public byte[] field898;

    @OriginalMember(owner = "client!ju", name = "i", descriptor = "[I")
    public int[] field899;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "()I")
    public final int method418() {
        return this.field896 + this.field893 + this.field895;
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "()[I")
    public final int[] method419() {
        int var1 = this.method418();
        int[] var2 = new int[var1 * this.method429()];
        if (this.field892 == null) {
            for (int var7 = 0; var7 < this.field897; var7++) {
                int var8 = this.field893 * var7;
                int var9 = (this.field891 + var7) * var1 + this.field896;
                for (int var10 = 0; var10 < this.field893; var10++) {
                    int var11 = this.field899[this.field898[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field897; var3++) {
                int var4 = this.field893 * var3;
                int var5 = (this.field891 + var3) * var1 + this.field896;
                for (int var6 = 0; var6 < this.field893; var6++) {
                    var2[var5++] = this.field892[var4] << 24 | this.field899[this.field898[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "()V")
    public final void method420() {
        int var1 = this.method418();
        int var2 = this.method429();
        if (this.field893 == var1 && this.field897 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field892 == null) {
            for (int var9 = 0; var9 < this.field897; var9++) {
                int var10 = this.field893 * var9;
                int var11 = (this.field891 + var9) * var1 + this.field896;
                for (int var12 = 0; var12 < this.field893; var12++) {
                    var3[var11++] = this.field898[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field897; var5++) {
                int var6 = this.field893 * var5;
                int var7 = (this.field891 + var5) * var1 + this.field896;
                for (int var8 = 0; var8 < this.field893; var8++) {
                    var3[var7] = this.field898[var6];
                    var4[var7++] = this.field892[var6++];
                }
            }
            this.field892 = var4;
        }
        this.field896 = this.field895 = this.field891 = this.field894 = 0;
        this.field893 = var1;
        this.field897 = var2;
        this.field898 = var3;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)V")
    public final void method421(int arg0) {
        int var2 = -1;
        if (this.field899.length < 255) {
            for (int var3 = 0; var3 < this.field899.length; var3++) {
                if (this.field899[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field899.length;
                int[] var4 = new int[this.field899.length + 1];
                class415.method2445(this.field899, 0, var4, 0, this.field899.length);
                this.field899 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field899.length; var9++) {
                int var13 = this.field899[var9];
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
        for (int var10 = this.field897 - 1; var10 > 0; var10--) {
            int var11 = this.field893 * var10;
            for (int var12 = this.field893 - 1; var12 > 0; var12--) {
                if (this.field899[this.field898[var11 + var12] & 0xFF] == 0 && this.field899[this.field898[var11 + var12 - this.field893 - 1] & 0xFF] != 0) {
                    this.field898[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lb;I)[Lju;")
    public static final class72[] method422(class201 arg0, int arg1) {
        byte[] var2 = arg0.method1228(arg1, 81);
        return var2 == null ? null : method428(var2);
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lb;II)Lju;")
    public static final class72 method423(class201 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1257(arg2, arg1, 24558);
        return var3 == null ? null : method428(var3)[0];
    }

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "()V")
    public final void method424() {
        byte[] var1 = this.field898;
        if (this.field892 == null) {
            for (int var2 = (this.field897 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field893 * var2;
                int var4 = (this.field897 - var2 - 1) * this.field893;
                for (int var5 = -this.field893; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field892;
            for (int var8 = (this.field897 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field893 * var8;
                int var11 = (this.field897 - var8 - 1) * this.field893;
                for (int var12 = -this.field893; var12 < 0; var12++) {
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
        int var9 = this.field891;
        this.field891 = this.field894;
        this.field894 = var9;
    }

    @OriginalMember(owner = "client!ju", name = "e", descriptor = "()V")
    public final void method425() {
        byte[] var1 = this.field898;
        if (this.field892 == null) {
            for (int var2 = this.field897 - 1; var2 >= 0; var2--) {
                int var3 = this.field893 * var2;
                int var4 = (var2 + 1) * this.field893;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field892;
            for (int var7 = this.field897 - 1; var7 >= 0; var7--) {
                int var9 = this.field893 * var7;
                int var10 = (var7 + 1) * this.field893;
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
        int var8 = this.field896;
        this.field896 = this.field895;
        this.field895 = var8;
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(I)V")
    public final void method426(int arg0) {
        int var2 = -1;
        if (this.field899.length < 255) {
            for (int var3 = 0; var3 < this.field899.length; var3++) {
                if (this.field899[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field899.length;
                int[] var4 = new int[this.field899.length + 1];
                class415.method2445(this.field899, 0, var4, 0, this.field899.length);
                this.field899 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field899.length; var9++) {
                int var15 = this.field899[var9];
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
        byte[] var11 = new byte[this.field897 * this.field893];
        for (int var12 = 0; var12 < this.field897; var12++) {
            for (int var13 = 0; var13 < this.field893; var13++) {
                int var14 = this.field898[var10] & 0xFF;
                if (this.field899[var14] == 0) {
                    if (var13 > 0 && this.field899[this.field898[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field899[this.field898[var10 - this.field893] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field893 - 1 && this.field899[this.field898[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field897 - 1 && this.field899[this.field898[this.field893 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field898 = var11;
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(Lb;I)Lju;")
    public static final class72 method427(class201 arg0, int arg1) {
        byte[] var2 = arg0.method1228(arg1, 80);
        return var2 == null ? null : method428(var2)[0];
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "([B)[Lju;")
    private static final class72[] method428(byte[] arg0) {
        class276 var1 = new class276(arg0);
        var1.field4021 = arg0.length - 2;
        int var2 = var1.method1729(65280);
        class72[] var3 = new class72[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class72();
        }
        var1.field4021 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method1729(65280);
        int var6 = var1.method1729(65280);
        int var7 = (var1.method1701(-23121) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field896 = var1.method1729(65280);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field891 = var1.method1729(65280);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field893 = var1.method1729(65280);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field897 = var1.method1729(65280);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class72 var32 = var3[var12];
            var32.field895 = var5 - var32.field893 - var32.field896;
            var32.field894 = var6 - var32.field897 - var32.field891;
        }
        var1.field4021 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method1748(false);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field899 = var13;
        }
        var1.field4021 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class72 var17 = var3[var16];
            int var18 = var17.field897 * var17.field893;
            var17.field898 = new byte[var18];
            int var19 = var1.method1701(-23121);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field892 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field898[var24] = var1.method1715((byte) -105);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field892[var25] = var1.method1715((byte) 55);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field893; var27++) {
                        for (int var31 = 0; var31 < var17.field897; var31++) {
                            var17.field898[var17.field893 * var31 + var27] = var1.method1715((byte) 86);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field893; var28++) {
                        for (int var29 = 0; var29 < var17.field897; var29++) {
                            byte var30 = var17.field892[var17.field893 * var29 + var28] = var1.method1715((byte) -114);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field892 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field898[var20] = var1.method1715((byte) 87);
                }
            } else {
                for (int var21 = 0; var21 < var17.field893; var21++) {
                    for (int var22 = 0; var22 < var17.field897; var22++) {
                        var17.field898[var17.field893 * var22 + var21] = var1.method1715((byte) -105);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ju", name = "f", descriptor = "()I")
    public final int method429() {
        return this.field897 + this.field891 + this.field894;
    }

    @OriginalMember(owner = "client!ju", name = "g", descriptor = "()V")
    public final void method430() {
        byte[] var1 = new byte[this.field897 * this.field893];
        int var2 = 0;
        if (this.field892 == null) {
            for (int var3 = 0; var3 < this.field893; var3++) {
                for (int var4 = this.field897 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field898[this.field893 * var4 + var3];
                }
            }
            this.field898 = var1;
        } else {
            byte[] var5 = new byte[this.field897 * this.field893];
            for (int var6 = 0; var6 < this.field893; var6++) {
                for (int var9 = this.field897 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field898[this.field893 * var9 + var6];
                    var5[var2++] = this.field892[this.field893 * var9 + var6];
                }
            }
            this.field898 = var1;
            this.field892 = var5;
        }
        int var7 = this.field891;
        this.field891 = this.field896;
        this.field896 = this.field894;
        this.field894 = this.field895;
        this.field895 = this.field891;
        int var8 = this.field897;
        this.field897 = this.field893;
        this.field893 = var8;
    }

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "(I)V")
    public final void method431(int arg0) {
        int var2 = this.method418();
        int var3 = this.method429();
        if (this.field893 == var2 && this.field897 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field896) {
            var4 = this.field896;
        }
        int var5 = arg0;
        if (this.field896 + arg0 + this.field893 > var2) {
            var5 = var2 - this.field896 - this.field893;
        }
        int var6 = arg0;
        if (arg0 > this.field891) {
            var6 = this.field891;
        }
        int var7 = arg0;
        if (this.field891 + arg0 + this.field897 > var3) {
            var7 = var3 - this.field891 - this.field897;
        }
        int var8 = this.field893 + var4 + var5;
        int var9 = this.field897 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field892 == null) {
            for (int var11 = 0; var11 < this.field897; var11++) {
                int var12 = this.field893 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field893; var14++) {
                    var10[var13++] = this.field898[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field897; var16++) {
                int var17 = this.field893 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field893; var19++) {
                    var15[var18] = this.field892[var17];
                    var10[var18++] = this.field898[var17++];
                }
            }
            this.field892 = var15;
        }
        this.field896 -= var4;
        this.field891 -= var6;
        this.field895 -= var5;
        this.field894 -= var7;
        this.field893 = var8;
        this.field897 = var9;
        this.field898 = var10;
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(Lb;II)[Lju;")
    public static final class72[] method432(class201 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1257(arg2, arg1, 24558);
        return var3 == null ? null : method428(var3);
    }
}
