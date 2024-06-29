import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class372 {

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public int field5686;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public int field5687;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public int field5688;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public int field5689;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public int field5690;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "I")
    public int field5692;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "[B")
    public byte[] field5684;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "[B")
    public byte[] field5685;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "[I")
    public int[] field5691;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "()V")
    public final void method2392() {
        byte[] var1 = this.field5685;
        if (this.field5684 == null) {
            for (int var2 = (this.field5692 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field5688 * var2;
                int var4 = (this.field5692 - var2 - 1) * this.field5688;
                for (int var5 = -this.field5688; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field5684;
            for (int var8 = (this.field5692 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field5688 * var8;
                int var11 = (this.field5692 - var8 - 1) * this.field5688;
                for (int var12 = -this.field5688; var12 < 0; var12++) {
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
        int var9 = this.field5687;
        this.field5687 = this.field5689;
        this.field5689 = var9;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lkea;II)[Laf;")
    public static final class372[] method2393(class203 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1286(arg2, arg1, (byte) -49);
        return var3 == null ? null : method2395(var3);
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "()I")
    public final int method2394() {
        return this.field5692 + this.field5687 + this.field5689;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([B)[Laf;")
    private static final class372[] method2395(byte[] arg0) {
        class194 var1 = new class194(arg0);
        var1.field2610 = arg0.length - 2;
        int var2 = var1.method1220(-66);
        class372[] var3 = new class372[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class372();
        }
        var1.field2610 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method1220(-105);
        int var6 = var1.method1220(121);
        int var7 = (var1.method1177(255) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field5686 = var1.method1220(120);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field5687 = var1.method1220(-84);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field5688 = var1.method1220(-115);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field5692 = var1.method1220(-8);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class372 var32 = var3[var12];
            var32.field5690 = var5 - var32.field5688 - var32.field5686;
            var32.field5689 = var6 - var32.field5692 - var32.field5687;
        }
        var1.field2610 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method1180(-832631516);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field5691 = var13;
        }
        var1.field2610 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class372 var17 = var3[var16];
            int var18 = var17.field5692 * var17.field5688;
            var17.field5685 = new byte[var18];
            int var19 = var1.method1177(255);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field5684 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field5685[var24] = var1.method1213((byte) 61);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field5684[var25] = var1.method1213((byte) 94);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field5688; var27++) {
                        for (int var31 = 0; var31 < var17.field5692; var31++) {
                            var17.field5685[var17.field5688 * var31 + var27] = var1.method1213((byte) 56);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field5688; var28++) {
                        for (int var29 = 0; var29 < var17.field5692; var29++) {
                            byte var30 = var17.field5684[var17.field5688 * var29 + var28] = var1.method1213((byte) 33);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field5684 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field5685[var20] = var1.method1213((byte) 41);
                }
            } else {
                for (int var21 = 0; var21 < var17.field5688; var21++) {
                    for (int var22 = 0; var22 < var17.field5692; var22++) {
                        var17.field5685[var17.field5688 * var22 + var21] = var1.method1213((byte) 53);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "()V")
    public final void method2396() {
        byte[] var1 = this.field5685;
        if (this.field5684 == null) {
            for (int var2 = this.field5692 - 1; var2 >= 0; var2--) {
                int var3 = this.field5688 * var2;
                int var4 = (var2 + 1) * this.field5688;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field5684;
            for (int var7 = this.field5692 - 1; var7 >= 0; var7--) {
                int var9 = this.field5688 * var7;
                int var10 = (var7 + 1) * this.field5688;
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
        int var8 = this.field5686;
        this.field5686 = this.field5690;
        this.field5690 = var8;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
    public final void method2397(int arg0) {
        int var2 = -1;
        if (this.field5691.length < 255) {
            for (int var3 = 0; var3 < this.field5691.length; var3++) {
                if (this.field5691[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field5691.length;
                int[] var4 = new int[this.field5691.length + 1];
                class210.method1325(this.field5691, 0, var4, 0, this.field5691.length);
                this.field5691 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field5691.length; var9++) {
                int var13 = this.field5691[var9];
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
        for (int var10 = this.field5692 - 1; var10 > 0; var10--) {
            int var11 = this.field5688 * var10;
            for (int var12 = this.field5688 - 1; var12 > 0; var12--) {
                if (this.field5691[this.field5685[var11 + var12] & 0xFF] == 0 && this.field5691[this.field5685[var11 + var12 - this.field5688 - 1] & 0xFF] != 0) {
                    this.field5685[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(Lkea;II)Laf;")
    public static final class372 method2398(class203 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1286(arg2, arg1, (byte) -49);
        return var3 == null ? null : method2395(var3)[0];
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "()V")
    public final void method2399() {
        int var1 = this.method2401();
        int var2 = this.method2394();
        if (this.field5688 == var1 && this.field5692 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field5684 == null) {
            for (int var9 = 0; var9 < this.field5692; var9++) {
                int var10 = this.field5688 * var9;
                int var11 = (this.field5687 + var9) * var1 + this.field5686;
                for (int var12 = 0; var12 < this.field5688; var12++) {
                    var3[var11++] = this.field5685[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field5692; var5++) {
                int var6 = this.field5688 * var5;
                int var7 = (this.field5687 + var5) * var1 + this.field5686;
                for (int var8 = 0; var8 < this.field5688; var8++) {
                    var3[var7] = this.field5685[var6];
                    var4[var7++] = this.field5684[var6++];
                }
            }
            this.field5684 = var4;
        }
        this.field5686 = this.field5690 = this.field5687 = this.field5689 = 0;
        this.field5688 = var1;
        this.field5692 = var2;
        this.field5685 = var3;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lkea;I)[Laf;")
    public static final class372[] method2400(class203 arg0, int arg1) {
        byte[] var2 = arg0.method1308((byte) -127, arg1);
        return var2 == null ? null : method2395(var2);
    }

    @OriginalMember(owner = "client!af", name = "e", descriptor = "()I")
    public final int method2401() {
        return this.field5688 + this.field5686 + this.field5690;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V")
    public final void method2402(int arg0) {
        int var2 = this.method2401();
        int var3 = this.method2394();
        if (this.field5688 == var2 && this.field5692 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field5686) {
            var4 = this.field5686;
        }
        int var5 = arg0;
        if (this.field5686 + arg0 + this.field5688 > var2) {
            var5 = var2 - this.field5686 - this.field5688;
        }
        int var6 = arg0;
        if (arg0 > this.field5687) {
            var6 = this.field5687;
        }
        int var7 = arg0;
        if (this.field5687 + arg0 + this.field5692 > var3) {
            var7 = var3 - this.field5687 - this.field5692;
        }
        int var8 = this.field5688 + var4 + var5;
        int var9 = this.field5692 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field5684 == null) {
            for (int var11 = 0; var11 < this.field5692; var11++) {
                int var12 = this.field5688 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field5688; var14++) {
                    var10[var13++] = this.field5685[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field5692; var16++) {
                int var17 = this.field5688 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field5688; var19++) {
                    var15[var18] = this.field5684[var17];
                    var10[var18++] = this.field5685[var17++];
                }
            }
            this.field5684 = var15;
        }
        this.field5686 -= var4;
        this.field5687 -= var6;
        this.field5690 -= var5;
        this.field5689 -= var7;
        this.field5688 = var8;
        this.field5692 = var9;
        this.field5685 = var10;
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(I)V")
    public final void method2403(int arg0) {
        int var2 = -1;
        if (this.field5691.length < 255) {
            for (int var3 = 0; var3 < this.field5691.length; var3++) {
                if (this.field5691[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field5691.length;
                int[] var4 = new int[this.field5691.length + 1];
                class210.method1325(this.field5691, 0, var4, 0, this.field5691.length);
                this.field5691 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field5691.length; var9++) {
                int var15 = this.field5691[var9];
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
        byte[] var11 = new byte[this.field5692 * this.field5688];
        for (int var12 = 0; var12 < this.field5692; var12++) {
            for (int var13 = 0; var13 < this.field5688; var13++) {
                int var14 = this.field5685[var10] & 0xFF;
                if (this.field5691[var14] == 0) {
                    if (var13 > 0 && this.field5691[this.field5685[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field5691[this.field5685[var10 - this.field5688] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field5688 - 1 && this.field5691[this.field5685[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field5692 - 1 && this.field5691[this.field5685[this.field5688 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field5685 = var11;
    }

    @OriginalMember(owner = "client!af", name = "f", descriptor = "()V")
    public final void method2404() {
        byte[] var1 = new byte[this.field5692 * this.field5688];
        int var2 = 0;
        if (this.field5684 == null) {
            for (int var3 = 0; var3 < this.field5688; var3++) {
                for (int var4 = this.field5692 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field5685[this.field5688 * var4 + var3];
                }
            }
            this.field5685 = var1;
        } else {
            byte[] var5 = new byte[this.field5692 * this.field5688];
            for (int var6 = 0; var6 < this.field5688; var6++) {
                for (int var9 = this.field5692 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field5685[this.field5688 * var9 + var6];
                    var5[var2++] = this.field5684[this.field5688 * var9 + var6];
                }
            }
            this.field5685 = var1;
            this.field5684 = var5;
        }
        int var7 = this.field5687;
        this.field5687 = this.field5686;
        this.field5686 = this.field5689;
        this.field5689 = this.field5690;
        this.field5690 = this.field5687;
        int var8 = this.field5692;
        this.field5692 = this.field5688;
        this.field5688 = var8;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(Lkea;I)Laf;")
    public static final class372 method2405(class203 arg0, int arg1) {
        byte[] var2 = arg0.method1308((byte) -126, arg1);
        return var2 == null ? null : method2395(var2)[0];
    }

    @OriginalMember(owner = "client!af", name = "g", descriptor = "()[I")
    public final int[] method2406() {
        int var1 = this.method2401();
        int[] var2 = new int[var1 * this.method2394()];
        if (this.field5684 == null) {
            for (int var7 = 0; var7 < this.field5692; var7++) {
                int var8 = this.field5688 * var7;
                int var9 = (this.field5687 + var7) * var1 + this.field5686;
                for (int var10 = 0; var10 < this.field5688; var10++) {
                    int var11 = this.field5691[this.field5685[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field5692; var3++) {
                int var4 = this.field5688 * var3;
                int var5 = (this.field5687 + var3) * var1 + this.field5686;
                for (int var6 = 0; var6 < this.field5688; var6++) {
                    var2[var5++] = this.field5684[var4] << 24 | this.field5691[this.field5685[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }
}
