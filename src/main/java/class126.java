import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class126 {

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
    public int field1765;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
    public int field1766;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    public int field1767;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "I")
    public int field1768;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "I")
    public int field1770;

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "I")
    public int field1771;

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "[B")
    public byte[] field1769;

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "[B")
    public byte[] field1773;

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "[I")
    public int[] field1772;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "()V")
    public final void method884() {
        byte[] var1 = this.field1773;
        if (this.field1769 == null) {
            for (int var2 = (this.field1771 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field1767 * var2;
                int var4 = (this.field1771 - var2 - 1) * this.field1767;
                for (int var5 = -this.field1767; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field1769;
            for (int var8 = (this.field1771 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field1767 * var8;
                int var11 = (this.field1771 - var8 - 1) * this.field1767;
                for (int var12 = -this.field1767; var12 < 0; var12++) {
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
        int var9 = this.field1770;
        this.field1770 = this.field1768;
        this.field1768 = var9;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "([B)[Lqm;")
    private static final class126[] method885(byte[] arg0) {
        class148 var1 = new class148(arg0);
        var1.field2177 = arg0.length - 2;
        int var2 = var1.method1045(true);
        class126[] var3 = new class126[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class126();
        }
        var1.field2177 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method1045(true);
        int var6 = var1.method1045(true);
        int var7 = (var1.method1032((byte) -33) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field1766 = var1.method1045(true);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field1770 = var1.method1045(true);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field1767 = var1.method1045(true);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field1771 = var1.method1045(true);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class126 var32 = var3[var12];
            var32.field1765 = var5 - var32.field1767 - var32.field1766;
            var32.field1768 = var6 - var32.field1771 - var32.field1770;
        }
        var1.field2177 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method1028((byte) 123);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field1772 = var13;
        }
        var1.field2177 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class126 var17 = var3[var16];
            int var18 = var17.field1771 * var17.field1767;
            var17.field1773 = new byte[var18];
            int var19 = var1.method1032((byte) -33);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field1769 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field1773[var24] = var1.method1062(-21188);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field1769[var25] = var1.method1062(-21188);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field1767; var27++) {
                        for (int var31 = 0; var31 < var17.field1771; var31++) {
                            var17.field1773[var17.field1767 * var31 + var27] = var1.method1062(-21188);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field1767; var28++) {
                        for (int var29 = 0; var29 < var17.field1771; var29++) {
                            byte var30 = var17.field1769[var17.field1767 * var29 + var28] = var1.method1062(-21188);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field1769 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field1773[var20] = var1.method1062(-21188);
                }
            } else {
                for (int var21 = 0; var21 < var17.field1767; var21++) {
                    for (int var22 = 0; var22 < var17.field1771; var22++) {
                        var17.field1773[var17.field1767 * var22 + var21] = var1.method1062(-21188);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V")
    public final void method886(int arg0) {
        int var2 = -1;
        if (this.field1772.length < 255) {
            for (int var3 = 0; var3 < this.field1772.length; var3++) {
                if (this.field1772[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field1772.length;
                int[] var4 = new int[this.field1772.length + 1];
                class648.method3736(this.field1772, 0, var4, 0, this.field1772.length);
                this.field1772 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field1772.length; var9++) {
                int var13 = this.field1772[var9];
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
        for (int var10 = this.field1771 - 1; var10 > 0; var10--) {
            int var11 = this.field1767 * var10;
            for (int var12 = this.field1767 - 1; var12 > 0; var12--) {
                if (this.field1772[this.field1773[var11 + var12] & 0xFF] == 0 && this.field1772[this.field1773[var11 + var12 - this.field1767 - 1] & 0xFF] != 0) {
                    this.field1773[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "()I")
    public final int method887() {
        return this.field1771 + this.field1770 + this.field1768;
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "()V")
    public final void method888() {
        int var1 = this.method898();
        int var2 = this.method887();
        if (this.field1767 == var1 && this.field1771 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field1769 == null) {
            for (int var9 = 0; var9 < this.field1771; var9++) {
                int var10 = this.field1767 * var9;
                int var11 = (this.field1770 + var9) * var1 + this.field1766;
                for (int var12 = 0; var12 < this.field1767; var12++) {
                    var3[var11++] = this.field1773[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field1771; var5++) {
                int var6 = this.field1767 * var5;
                int var7 = (this.field1770 + var5) * var1 + this.field1766;
                for (int var8 = 0; var8 < this.field1767; var8++) {
                    var3[var7] = this.field1773[var6];
                    var4[var7++] = this.field1769[var6++];
                }
            }
            this.field1769 = var4;
        }
        this.field1766 = this.field1765 = this.field1770 = this.field1768 = 0;
        this.field1767 = var1;
        this.field1771 = var2;
        this.field1773 = var3;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lkda;II)[Lqm;")
    public static final class126[] method889(class328 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1966(arg2, arg1, true);
        return var3 == null ? null : method885(var3);
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)V")
    public final void method890(int arg0) {
        int var2 = this.method898();
        int var3 = this.method887();
        if (this.field1767 == var2 && this.field1771 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field1766) {
            var4 = this.field1766;
        }
        int var5 = arg0;
        if (this.field1766 + arg0 + this.field1767 > var2) {
            var5 = var2 - this.field1766 - this.field1767;
        }
        int var6 = arg0;
        if (arg0 > this.field1770) {
            var6 = this.field1770;
        }
        int var7 = arg0;
        if (this.field1770 + arg0 + this.field1771 > var3) {
            var7 = var3 - this.field1770 - this.field1771;
        }
        int var8 = this.field1767 + var4 + var5;
        int var9 = this.field1771 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field1769 == null) {
            for (int var11 = 0; var11 < this.field1771; var11++) {
                int var12 = this.field1767 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field1767; var14++) {
                    var10[var13++] = this.field1773[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field1771; var16++) {
                int var17 = this.field1767 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field1767; var19++) {
                    var15[var18] = this.field1769[var17];
                    var10[var18++] = this.field1773[var17++];
                }
            }
            this.field1769 = var15;
        }
        this.field1766 -= var4;
        this.field1770 -= var6;
        this.field1765 -= var5;
        this.field1768 -= var7;
        this.field1767 = var8;
        this.field1771 = var9;
        this.field1773 = var10;
    }

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "()V")
    public final void method891() {
        byte[] var1 = this.field1773;
        if (this.field1769 == null) {
            for (int var2 = this.field1771 - 1; var2 >= 0; var2--) {
                int var3 = this.field1767 * var2;
                int var4 = (var2 + 1) * this.field1767;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field1769;
            for (int var7 = this.field1771 - 1; var7 >= 0; var7--) {
                int var9 = this.field1767 * var7;
                int var10 = (var7 + 1) * this.field1767;
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
        int var8 = this.field1766;
        this.field1766 = this.field1765;
        this.field1765 = var8;
    }

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "()V")
    public final void method892() {
        byte[] var1 = new byte[this.field1771 * this.field1767];
        int var2 = 0;
        if (this.field1769 == null) {
            for (int var3 = 0; var3 < this.field1767; var3++) {
                for (int var4 = this.field1771 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field1773[this.field1767 * var4 + var3];
                }
            }
            this.field1773 = var1;
        } else {
            byte[] var5 = new byte[this.field1771 * this.field1767];
            for (int var6 = 0; var6 < this.field1767; var6++) {
                for (int var9 = this.field1771 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field1773[this.field1767 * var9 + var6];
                    var5[var2++] = this.field1769[this.field1767 * var9 + var6];
                }
            }
            this.field1773 = var1;
            this.field1769 = var5;
        }
        int var7 = this.field1770;
        this.field1770 = this.field1766;
        this.field1766 = this.field1768;
        this.field1768 = this.field1765;
        this.field1765 = this.field1770;
        int var8 = this.field1771;
        this.field1771 = this.field1767;
        this.field1767 = var8;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lkda;I)[Lqm;")
    public static final class126[] method893(class328 arg0, int arg1) {
        byte[] var2 = arg0.method1984(1670, arg1);
        return var2 == null ? null : method885(var2);
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(Lkda;I)Lqm;")
    public static final class126 method894(class328 arg0, int arg1) {
        byte[] var2 = arg0.method1984(1670, arg1);
        return var2 == null ? null : method885(var2)[0];
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(I)V")
    public final void method895(int arg0) {
        int var2 = -1;
        if (this.field1772.length < 255) {
            for (int var3 = 0; var3 < this.field1772.length; var3++) {
                if (this.field1772[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field1772.length;
                int[] var4 = new int[this.field1772.length + 1];
                class648.method3736(this.field1772, 0, var4, 0, this.field1772.length);
                this.field1772 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field1772.length; var9++) {
                int var15 = this.field1772[var9];
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
        byte[] var11 = new byte[this.field1771 * this.field1767];
        for (int var12 = 0; var12 < this.field1771; var12++) {
            for (int var13 = 0; var13 < this.field1767; var13++) {
                int var14 = this.field1773[var10] & 0xFF;
                if (this.field1772[var14] == 0) {
                    if (var13 > 0 && this.field1772[this.field1773[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field1772[this.field1773[var10 - this.field1767] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field1767 - 1 && this.field1772[this.field1773[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field1771 - 1 && this.field1772[this.field1773[this.field1767 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field1773 = var11;
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(Lkda;II)Lqm;")
    public static final class126 method896(class328 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1966(arg2, arg1, true);
        return var3 == null ? null : method885(var3)[0];
    }

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "()[I")
    public final int[] method897() {
        int var1 = this.method898();
        int[] var2 = new int[var1 * this.method887()];
        if (this.field1769 == null) {
            for (int var7 = 0; var7 < this.field1771; var7++) {
                int var8 = this.field1767 * var7;
                int var9 = (this.field1770 + var7) * var1 + this.field1766;
                for (int var10 = 0; var10 < this.field1767; var10++) {
                    int var11 = this.field1772[this.field1773[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field1771; var3++) {
                int var4 = this.field1767 * var3;
                int var5 = (this.field1770 + var3) * var1 + this.field1766;
                for (int var6 = 0; var6 < this.field1767; var6++) {
                    var2[var5++] = this.field1769[var4] << 24 | this.field1772[this.field1773[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "()I")
    public final int method898() {
        return this.field1767 + this.field1766 + this.field1765;
    }
}
