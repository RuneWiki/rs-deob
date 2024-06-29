import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class418 {

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public int field5792;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public int field5794;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public int field5796;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public int field5797;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public int field5799;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public int field5800;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "[B")
    public byte[] field5793;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "[B")
    public byte[] field5798;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "[I")
    public int[] field5795;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "()[I")
    public final int[] method2460() {
        int var1 = this.method2467();
        int[] var2 = new int[var1 * this.method2469()];
        if (this.field5798 == null) {
            for (int var7 = 0; var7 < this.field5792; var7++) {
                int var8 = this.field5796 * var7;
                int var9 = (this.field5799 + var7) * var1 + this.field5794;
                for (int var10 = 0; var10 < this.field5796; var10++) {
                    int var11 = this.field5795[this.field5793[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field5792; var3++) {
                int var4 = this.field5796 * var3;
                int var5 = (this.field5799 + var3) * var1 + this.field5794;
                for (int var6 = 0; var6 < this.field5796; var6++) {
                    var2[var5++] = this.field5798[var4] << 24 | this.field5795[this.field5793[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "()V")
    public final void method2461() {
        byte[] var1 = this.field5793;
        if (this.field5798 == null) {
            for (int var2 = this.field5792 - 1; var2 >= 0; var2--) {
                int var3 = this.field5796 * var2;
                int var4 = (var2 + 1) * this.field5796;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field5798;
            for (int var7 = this.field5792 - 1; var7 >= 0; var7--) {
                int var9 = this.field5796 * var7;
                int var10 = (var7 + 1) * this.field5796;
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
        int var8 = this.field5794;
        this.field5794 = this.field5797;
        this.field5797 = var8;
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "()V")
    public final void method2462() {
        int var1 = this.method2467();
        int var2 = this.method2469();
        if (this.field5796 == var1 && this.field5792 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field5798 == null) {
            for (int var9 = 0; var9 < this.field5792; var9++) {
                int var10 = this.field5796 * var9;
                int var11 = (this.field5799 + var9) * var1 + this.field5794;
                for (int var12 = 0; var12 < this.field5796; var12++) {
                    var3[var11++] = this.field5793[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field5792; var5++) {
                int var6 = this.field5796 * var5;
                int var7 = (this.field5799 + var5) * var1 + this.field5794;
                for (int var8 = 0; var8 < this.field5796; var8++) {
                    var3[var7] = this.field5793[var6];
                    var4[var7++] = this.field5798[var6++];
                }
            }
            this.field5798 = var4;
        }
        this.field5794 = this.field5797 = this.field5799 = this.field5800 = 0;
        this.field5796 = var1;
        this.field5792 = var2;
        this.field5793 = var3;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public final void method2463(int arg0) {
        int var2 = -1;
        if (this.field5795.length < 255) {
            for (int var3 = 0; var3 < this.field5795.length; var3++) {
                if (this.field5795[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field5795.length;
                int[] var4 = new int[this.field5795.length + 1];
                class171.method1262(this.field5795, 0, var4, 0, this.field5795.length);
                this.field5795 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field5795.length; var9++) {
                int var13 = this.field5795[var9];
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
        for (int var10 = this.field5792 - 1; var10 > 0; var10--) {
            int var11 = this.field5796 * var10;
            for (int var12 = this.field5796 - 1; var12 > 0; var12--) {
                if (this.field5795[this.field5793[var11 + var12] & 0xFF] == 0 && this.field5795[this.field5793[var11 + var12 - this.field5796 - 1] & 0xFF] != 0) {
                    this.field5793[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lgga;I)Lde;")
    public static final class418 method2464(class513 arg0, int arg1) {
        byte[] var2 = arg0.method2988(arg1, 0);
        return var2 == null ? null : method2473(var2)[0];
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
    public final void method2465(int arg0) {
        int var2 = -1;
        if (this.field5795.length < 255) {
            for (int var3 = 0; var3 < this.field5795.length; var3++) {
                if (this.field5795[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field5795.length;
                int[] var4 = new int[this.field5795.length + 1];
                class171.method1262(this.field5795, 0, var4, 0, this.field5795.length);
                this.field5795 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field5795.length; var9++) {
                int var15 = this.field5795[var9];
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
        byte[] var11 = new byte[this.field5796 * this.field5792];
        for (int var12 = 0; var12 < this.field5792; var12++) {
            for (int var13 = 0; var13 < this.field5796; var13++) {
                int var14 = this.field5793[var10] & 0xFF;
                if (this.field5795[var14] == 0) {
                    if (var13 > 0 && this.field5795[this.field5793[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field5795[this.field5793[var10 - this.field5796] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field5796 - 1 && this.field5795[this.field5793[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field5792 - 1 && this.field5795[this.field5793[this.field5796 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field5793 = var11;
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(I)V")
    public final void method2466(int arg0) {
        int var2 = this.method2467();
        int var3 = this.method2469();
        if (this.field5796 == var2 && this.field5792 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field5794) {
            var4 = this.field5794;
        }
        int var5 = arg0;
        if (this.field5794 + arg0 + this.field5796 > var2) {
            var5 = var2 - this.field5794 - this.field5796;
        }
        int var6 = arg0;
        if (arg0 > this.field5799) {
            var6 = this.field5799;
        }
        int var7 = arg0;
        if (this.field5799 + arg0 + this.field5792 > var3) {
            var7 = var3 - this.field5799 - this.field5792;
        }
        int var8 = this.field5796 + var4 + var5;
        int var9 = this.field5792 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field5798 == null) {
            for (int var11 = 0; var11 < this.field5792; var11++) {
                int var12 = this.field5796 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field5796; var14++) {
                    var10[var13++] = this.field5793[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field5792; var16++) {
                int var17 = this.field5796 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field5796; var19++) {
                    var15[var18] = this.field5798[var17];
                    var10[var18++] = this.field5793[var17++];
                }
            }
            this.field5798 = var15;
        }
        this.field5794 -= var4;
        this.field5799 -= var6;
        this.field5797 -= var5;
        this.field5800 -= var7;
        this.field5796 = var8;
        this.field5792 = var9;
        this.field5793 = var10;
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "()I")
    public final int method2467() {
        return this.field5796 + this.field5794 + this.field5797;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lgga;II)Lde;")
    public static final class418 method2468(class513 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3019(arg1, arg2, 104);
        return var3 == null ? null : method2473(var3)[0];
    }

    @OriginalMember(owner = "client!de", name = "e", descriptor = "()I")
    public final int method2469() {
        return this.field5799 + this.field5792 + this.field5800;
    }

    @OriginalMember(owner = "client!de", name = "f", descriptor = "()V")
    public final void method2470() {
        byte[] var1 = this.field5793;
        if (this.field5798 == null) {
            for (int var2 = (this.field5792 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field5796 * var2;
                int var4 = (this.field5792 - var2 - 1) * this.field5796;
                for (int var5 = -this.field5796; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field5798;
            for (int var8 = (this.field5792 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field5796 * var8;
                int var11 = (this.field5792 - var8 - 1) * this.field5796;
                for (int var12 = -this.field5796; var12 < 0; var12++) {
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
        int var9 = this.field5799;
        this.field5799 = this.field5800;
        this.field5800 = var9;
    }

    @OriginalMember(owner = "client!de", name = "g", descriptor = "()V")
    public final void method2471() {
        byte[] var1 = new byte[this.field5796 * this.field5792];
        int var2 = 0;
        if (this.field5798 == null) {
            for (int var3 = 0; var3 < this.field5796; var3++) {
                for (int var4 = this.field5792 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field5793[this.field5796 * var4 + var3];
                }
            }
            this.field5793 = var1;
        } else {
            byte[] var5 = new byte[this.field5796 * this.field5792];
            for (int var6 = 0; var6 < this.field5796; var6++) {
                for (int var9 = this.field5792 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field5793[this.field5796 * var9 + var6];
                    var5[var2++] = this.field5798[this.field5796 * var9 + var6];
                }
            }
            this.field5793 = var1;
            this.field5798 = var5;
        }
        int var7 = this.field5799;
        this.field5799 = this.field5794;
        this.field5794 = this.field5800;
        this.field5800 = this.field5797;
        this.field5797 = this.field5799;
        int var8 = this.field5792;
        this.field5792 = this.field5796;
        this.field5796 = var8;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(Lgga;II)[Lde;")
    public static final class418[] method2472(class513 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3019(arg1, arg2, 63);
        return var3 == null ? null : method2473(var3);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "([B)[Lde;")
    private static final class418[] method2473(byte[] arg0) {
        class431 var1 = new class431(arg0);
        var1.field5983 = arg0.length - 2;
        int var2 = var1.method2565((byte) -94);
        class418[] var3 = new class418[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class418();
        }
        var1.field5983 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method2565((byte) -83);
        int var6 = var1.method2565((byte) -119);
        int var7 = (var1.method2557(14929) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field5794 = var1.method2565((byte) -113);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field5799 = var1.method2565((byte) -83);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field5796 = var1.method2565((byte) -84);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field5792 = var1.method2565((byte) -91);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class418 var32 = var3[var12];
            var32.field5797 = var5 - var32.field5796 - var32.field5794;
            var32.field5800 = var6 - var32.field5792 - var32.field5799;
        }
        var1.field5983 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method2515(25);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field5795 = var13;
        }
        var1.field5983 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class418 var17 = var3[var16];
            int var18 = var17.field5796 * var17.field5792;
            var17.field5793 = new byte[var18];
            int var19 = var1.method2557(14929);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field5798 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field5793[var24] = var1.method2529(126);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field5798[var25] = var1.method2529(103);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field5796; var27++) {
                        for (int var31 = 0; var31 < var17.field5792; var31++) {
                            var17.field5793[var17.field5796 * var31 + var27] = var1.method2529(44);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field5796; var28++) {
                        for (int var29 = 0; var29 < var17.field5792; var29++) {
                            byte var30 = var17.field5798[var17.field5796 * var29 + var28] = var1.method2529(63);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field5798 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field5793[var20] = var1.method2529(38);
                }
            } else {
                for (int var21 = 0; var21 < var17.field5796; var21++) {
                    for (int var22 = 0; var22 < var17.field5792; var22++) {
                        var17.field5793[var17.field5796 * var22 + var21] = var1.method2529(75);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(Lgga;I)[Lde;")
    public static final class418[] method2474(class513 arg0, int arg1) {
        byte[] var2 = arg0.method2988(arg1, 0);
        return var2 == null ? null : method2473(var2);
    }
}
