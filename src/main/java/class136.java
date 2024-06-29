import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class136 {

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public int field1832;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public int field1834;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public int field1835;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    public int field1836;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public int field1837;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    public int field1838;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "[B")
    public byte[] field1830;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "[B")
    public byte[] field1833;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "[I")
    public int[] field1831;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ldn;II)Lne;", line = 5)
    public static final class136 method945(class201 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1313((byte) -115, arg1, arg2);
        return var3 == null ? null : method947(var3)[0];
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V", line = 14)
    public final void method946(int arg0) {
        int var2 = -1;
        if (this.field1831.length < 255) {
            for (int var3 = 0; var3 < this.field1831.length; var3++) {
                if (this.field1831[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field1831.length;
                int[] var4 = new int[this.field1831.length + 1];
                class526.method3116(this.field1831, 0, var4, 0, this.field1831.length);
                this.field1831 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field1831.length; var9++) {
                int var13 = this.field1831[var9];
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
        for (int var10 = this.field1832 - 1; var10 > 0; var10--) {
            int var11 = this.field1837 * var10;
            for (int var12 = this.field1837 - 1; var12 > 0; var12--) {
                if (this.field1831[this.field1833[var11 + var12] & 0xFF] == 0 && this.field1831[this.field1833[var11 + var12 - this.field1837 - 1] & 0xFF] != 0) {
                    this.field1833[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "([B)[Lne;", line = 117)
    private static final class136[] method947(byte[] arg0) {
        class88 var1 = new class88(arg0);
        var1.field1176 = arg0.length - 2;
        int var2 = var1.method568((byte) 110);
        class136[] var3 = new class136[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class136();
        }
        var1.field1176 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method568((byte) 110);
        int var6 = var1.method568((byte) 110);
        int var7 = (var1.method617(2) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field1835 = var1.method568((byte) 110);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field1834 = var1.method568((byte) 110);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field1837 = var1.method568((byte) 110);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field1832 = var1.method568((byte) 110);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class136 var32 = var3[var12];
            var32.field1838 = var5 - var32.field1837 - var32.field1835;
            var32.field1836 = var6 - var32.field1832 - var32.field1834;
        }
        var1.field1176 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method584(255);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field1831 = var13;
        }
        var1.field1176 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class136 var17 = var3[var16];
            int var18 = var17.field1837 * var17.field1832;
            var17.field1833 = new byte[var18];
            int var19 = var1.method617(2);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field1830 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field1833[var24] = var1.method575(-107);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field1830[var25] = var1.method575(-84);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field1837; var27++) {
                        for (int var31 = 0; var31 < var17.field1832; var31++) {
                            var17.field1833[var17.field1837 * var31 + var27] = var1.method575(-95);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field1837; var28++) {
                        for (int var29 = 0; var29 < var17.field1832; var29++) {
                            byte var30 = var17.field1830[var17.field1837 * var29 + var28] = var1.method575(-122);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field1830 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field1833[var20] = var1.method575(-73);
                }
            } else {
                for (int var21 = 0; var21 < var17.field1837; var21++) {
                    for (int var22 = 0; var22 < var17.field1832; var22++) {
                        var17.field1833[var17.field1837 * var22 + var21] = var1.method575(-19);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V", line = 325)
    public final void method948(int arg0) {
        int var2 = this.method955();
        int var3 = this.method952();
        if (this.field1837 == var2 && this.field1832 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field1835) {
            var4 = this.field1835;
        }
        int var5 = arg0;
        if (this.field1835 + arg0 + this.field1837 > var2) {
            var5 = var2 - this.field1835 - this.field1837;
        }
        int var6 = arg0;
        if (arg0 > this.field1834) {
            var6 = this.field1834;
        }
        int var7 = arg0;
        if (this.field1834 + arg0 + this.field1832 > var3) {
            var7 = var3 - this.field1834 - this.field1832;
        }
        int var8 = this.field1837 + var4 + var5;
        int var9 = this.field1832 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field1830 == null) {
            for (int var11 = 0; var11 < this.field1832; var11++) {
                int var12 = this.field1837 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field1837; var14++) {
                    var10[var13++] = this.field1833[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field1832; var16++) {
                int var17 = this.field1837 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field1837; var19++) {
                    var15[var18] = this.field1830[var17];
                    var10[var18++] = this.field1833[var17++];
                }
            }
            this.field1830 = var15;
        }
        this.field1835 -= var4;
        this.field1834 -= var6;
        this.field1838 -= var5;
        this.field1836 -= var7;
        this.field1837 = var8;
        this.field1832 = var9;
        this.field1833 = var10;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "()V", line = 421)
    public final void method949() {
        byte[] var1 = this.field1833;
        if (this.field1830 == null) {
            for (int var2 = (this.field1832 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field1837 * var2;
                int var4 = (this.field1832 - var2 - 1) * this.field1837;
                for (int var5 = -this.field1837; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field1830;
            for (int var8 = (this.field1832 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field1837 * var8;
                int var11 = (this.field1832 - var8 - 1) * this.field1837;
                for (int var12 = -this.field1837; var12 < 0; var12++) {
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
        int var9 = this.field1834;
        this.field1834 = this.field1836;
        this.field1836 = var9;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ldn;I)[Lne;", line = 494)
    public static final class136[] method950(class201 arg0, int arg1) {
        byte[] var2 = arg0.method1320(arg1, 1);
        return var2 == null ? null : method947(var2);
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "()V", line = 504)
    public final void method951() {
        int var1 = this.method955();
        int var2 = this.method952();
        if (this.field1837 == var1 && this.field1832 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field1830 == null) {
            for (int var9 = 0; var9 < this.field1832; var9++) {
                int var10 = this.field1837 * var9;
                int var11 = (this.field1834 + var9) * var1 + this.field1835;
                for (int var12 = 0; var12 < this.field1837; var12++) {
                    var3[var11++] = this.field1833[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field1832; var5++) {
                int var6 = this.field1837 * var5;
                int var7 = (this.field1834 + var5) * var1 + this.field1835;
                for (int var8 = 0; var8 < this.field1837; var8++) {
                    var3[var7] = this.field1833[var6];
                    var4[var7++] = this.field1830[var6++];
                }
            }
            this.field1830 = var4;
        }
        this.field1835 = this.field1838 = this.field1834 = this.field1836 = 0;
        this.field1837 = var1;
        this.field1832 = var2;
        this.field1833 = var3;
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "()I", line = 571)
    public final int method952() {
        return this.field1834 + this.field1832 + this.field1836;
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "()V", line = 579)
    public final void method953() {
        byte[] var1 = this.field1833;
        if (this.field1830 == null) {
            for (int var2 = this.field1832 - 1; var2 >= 0; var2--) {
                int var3 = this.field1837 * var2;
                int var4 = (var2 + 1) * this.field1837;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field1830;
            for (int var7 = this.field1832 - 1; var7 >= 0; var7--) {
                int var9 = this.field1837 * var7;
                int var10 = (var7 + 1) * this.field1837;
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
        int var8 = this.field1835;
        this.field1835 = this.field1838;
        this.field1838 = var8;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(Ldn;II)[Lne;", line = 641)
    public static final class136[] method954(class201 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1313((byte) -107, arg1, arg2);
        return var3 == null ? null : method947(var3);
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "()I", line = 648)
    public final int method955() {
        return this.field1837 + this.field1835 + this.field1838;
    }

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "()[I", line = 652)
    public final int[] method956() {
        int var1 = this.method955();
        int[] var2 = new int[var1 * this.method952()];
        if (this.field1830 == null) {
            for (int var7 = 0; var7 < this.field1832; var7++) {
                int var8 = this.field1837 * var7;
                int var9 = (this.field1834 + var7) * var1 + this.field1835;
                for (int var10 = 0; var10 < this.field1837; var10++) {
                    int var11 = this.field1831[this.field1833[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field1832; var3++) {
                int var4 = this.field1837 * var3;
                int var5 = (this.field1834 + var3) * var1 + this.field1835;
                for (int var6 = 0; var6 < this.field1837; var6++) {
                    var2[var5++] = this.field1830[var4] << 24 | this.field1831[this.field1833[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)V", line = 717)
    public final void method957(int arg0) {
        int var2 = -1;
        if (this.field1831.length < 255) {
            for (int var3 = 0; var3 < this.field1831.length; var3++) {
                if (this.field1831[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field1831.length;
                int[] var4 = new int[this.field1831.length + 1];
                class526.method3116(this.field1831, 0, var4, 0, this.field1831.length);
                this.field1831 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field1831.length; var9++) {
                int var15 = this.field1831[var9];
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
        byte[] var11 = new byte[this.field1837 * this.field1832];
        for (int var12 = 0; var12 < this.field1832; var12++) {
            for (int var13 = 0; var13 < this.field1837; var13++) {
                int var14 = this.field1833[var10] & 0xFF;
                if (this.field1831[var14] == 0) {
                    if (var13 > 0 && this.field1831[this.field1833[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field1831[this.field1833[var10 - this.field1837] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field1837 - 1 && this.field1831[this.field1833[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field1832 - 1 && this.field1831[this.field1833[this.field1837 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field1833 = var11;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(Ldn;I)Lne;", line = 842)
    public static final class136 method958(class201 arg0, int arg1) {
        byte[] var2 = arg0.method1320(arg1, 1);
        return var2 == null ? null : method947(var2)[0];
    }

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "()V", line = 853)
    public final void method959() {
        byte[] var1 = new byte[this.field1837 * this.field1832];
        int var2 = 0;
        if (this.field1830 == null) {
            for (int var3 = 0; var3 < this.field1837; var3++) {
                for (int var4 = this.field1832 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field1833[this.field1837 * var4 + var3];
                }
            }
            this.field1833 = var1;
        } else {
            byte[] var5 = new byte[this.field1837 * this.field1832];
            for (int var6 = 0; var6 < this.field1837; var6++) {
                for (int var9 = this.field1832 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field1833[this.field1837 * var9 + var6];
                    var5[var2++] = this.field1830[this.field1837 * var9 + var6];
                }
            }
            this.field1833 = var1;
            this.field1830 = var5;
        }
        int var7 = this.field1834;
        this.field1834 = this.field1835;
        this.field1835 = this.field1836;
        this.field1836 = this.field1838;
        this.field1838 = this.field1834;
        int var8 = this.field1832;
        this.field1832 = this.field1837;
        this.field1837 = var8;
    }
}
