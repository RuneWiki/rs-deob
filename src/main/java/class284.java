import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class284 {

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "I")
    public int field4533;

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "I")
    public int field4534;

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "I")
    public int field4535;

    @OriginalMember(owner = "client!wt", name = "e", descriptor = "I")
    public int field4536;

    @OriginalMember(owner = "client!wt", name = "f", descriptor = "I")
    public int field4537;

    @OriginalMember(owner = "client!wt", name = "i", descriptor = "I")
    public int field4540;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "[B")
    public byte[] field4532;

    @OriginalMember(owner = "client!wt", name = "h", descriptor = "[B")
    public byte[] field4539;

    @OriginalMember(owner = "client!wt", name = "g", descriptor = "[I")
    public int[] field4538;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "([B)[Lwt;", line = 13)
    private static final class284[] method2016(byte[] arg0) {
        class6 var1 = new class6(arg0);
        var1.field57 = arg0.length - 2;
        int var2 = var1.method67(12021);
        class284[] var3 = new class284[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class284();
        }
        var1.field57 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method67(12021);
        int var6 = var1.method67(12021);
        int var7 = (var1.method70(-9059) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field4533 = var1.method67(12021);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field4540 = var1.method67(12021);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field4535 = var1.method67(12021);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field4537 = var1.method67(12021);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class284 var32 = var3[var12];
            var32.field4534 = var5 - var32.field4535 - var32.field4533;
            var32.field4536 = var6 - var32.field4537 - var32.field4540;
        }
        var1.field57 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method86(-53);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field4538 = var13;
        }
        var1.field57 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class284 var17 = var3[var16];
            int var18 = var17.field4537 * var17.field4535;
            var17.field4532 = new byte[var18];
            int var19 = var1.method70(-9059);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field4539 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field4532[var24] = var1.method81(true);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field4539[var25] = var1.method81(true);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field4535; var27++) {
                        for (int var31 = 0; var31 < var17.field4537; var31++) {
                            var17.field4532[var17.field4535 * var31 + var27] = var1.method81(true);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field4535; var28++) {
                        for (int var29 = 0; var29 < var17.field4537; var29++) {
                            byte var30 = var17.field4539[var17.field4535 * var29 + var28] = var1.method81(true);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field4539 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field4532[var20] = var1.method81(true);
                }
            } else {
                for (int var21 = 0; var21 < var17.field4535; var21++) {
                    for (int var22 = 0; var22 < var17.field4537; var22++) {
                        var17.field4532[var17.field4535 * var22 + var21] = var1.method81(true);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "()V", line = 221)
    public final void method2017() {
        int var1 = this.method2024();
        int var2 = this.method2025();
        if (this.field4535 == var1 && this.field4537 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field4539 == null) {
            for (int var9 = 0; var9 < this.field4537; var9++) {
                int var10 = this.field4535 * var9;
                int var11 = (this.field4540 + var9) * var1 + this.field4533;
                for (int var12 = 0; var12 < this.field4535; var12++) {
                    var3[var11++] = this.field4532[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field4537; var5++) {
                int var6 = this.field4535 * var5;
                int var7 = (this.field4540 + var5) * var1 + this.field4533;
                for (int var8 = 0; var8 < this.field4535; var8++) {
                    var3[var7] = this.field4532[var6];
                    var4[var7++] = this.field4539[var6++];
                }
            }
            this.field4539 = var4;
        }
        this.field4533 = this.field4534 = this.field4540 = this.field4536 = 0;
        this.field4535 = var1;
        this.field4537 = var2;
        this.field4532 = var3;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lri;II)[Lwt;", line = 289)
    public static final class284[] method2018(class97 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method926(arg1, -126, arg2);
        return var3 == null ? null : method2016(var3);
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V", line = 297)
    public final void method2019(int arg0) {
        int var2 = -1;
        if (this.field4538.length < 255) {
            for (int var3 = 0; var3 < this.field4538.length; var3++) {
                if (this.field4538[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field4538.length;
                int[] var4 = new int[this.field4538.length + 1];
                class398.method2565(this.field4538, 0, var4, 0, this.field4538.length);
                this.field4538 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field4538.length; var9++) {
                int var15 = this.field4538[var9];
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
        byte[] var11 = new byte[this.field4537 * this.field4535];
        for (int var12 = 0; var12 < this.field4537; var12++) {
            for (int var13 = 0; var13 < this.field4535; var13++) {
                int var14 = this.field4532[var10] & 0xFF;
                if (this.field4538[var14] == 0) {
                    if (var13 > 0 && this.field4538[this.field4532[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field4538[this.field4532[var10 - this.field4535] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field4535 - 1 && this.field4538[this.field4532[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field4537 - 1 && this.field4538[this.field4532[this.field4535 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field4532 = var11;
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "()V", line = 423)
    public final void method2020() {
        byte[] var1 = this.field4532;
        if (this.field4539 == null) {
            for (int var2 = (this.field4537 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field4535 * var2;
                int var4 = (this.field4537 - var2 - 1) * this.field4535;
                for (int var5 = -this.field4535; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field4539;
            for (int var8 = (this.field4537 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field4535 * var8;
                int var11 = (this.field4537 - var8 - 1) * this.field4535;
                for (int var12 = -this.field4535; var12 < 0; var12++) {
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
        int var9 = this.field4540;
        this.field4540 = this.field4536;
        this.field4536 = var9;
    }

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "()V", line = 494)
    public final void method2021() {
        byte[] var1 = this.field4532;
        if (this.field4539 == null) {
            for (int var2 = this.field4537 - 1; var2 >= 0; var2--) {
                int var3 = this.field4535 * var2;
                int var4 = (var2 + 1) * this.field4535;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field4539;
            for (int var7 = this.field4537 - 1; var7 >= 0; var7--) {
                int var9 = this.field4535 * var7;
                int var10 = (var7 + 1) * this.field4535;
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
        int var8 = this.field4533;
        this.field4533 = this.field4534;
        this.field4534 = var8;
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(I)V", line = 558)
    public final void method2022(int arg0) {
        int var2 = this.method2024();
        int var3 = this.method2025();
        if (this.field4535 == var2 && this.field4537 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field4533) {
            var4 = this.field4533;
        }
        int var5 = arg0;
        if (this.field4533 + arg0 + this.field4535 > var2) {
            var5 = var2 - this.field4533 - this.field4535;
        }
        int var6 = arg0;
        if (arg0 > this.field4540) {
            var6 = this.field4540;
        }
        int var7 = arg0;
        if (this.field4540 + arg0 + this.field4537 > var3) {
            var7 = var3 - this.field4540 - this.field4537;
        }
        int var8 = this.field4535 + var4 + var5;
        int var9 = this.field4537 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field4539 == null) {
            for (int var11 = 0; var11 < this.field4537; var11++) {
                int var12 = this.field4535 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field4535; var14++) {
                    var10[var13++] = this.field4532[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field4537; var16++) {
                int var17 = this.field4535 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field4535; var19++) {
                    var15[var18] = this.field4539[var17];
                    var10[var18++] = this.field4532[var17++];
                }
            }
            this.field4539 = var15;
        }
        this.field4533 -= var4;
        this.field4540 -= var6;
        this.field4534 -= var5;
        this.field4536 -= var7;
        this.field4535 = var8;
        this.field4537 = var9;
        this.field4532 = var10;
    }

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "(I)V", line = 653)
    public final void method2023(int arg0) {
        int var2 = -1;
        if (this.field4538.length < 255) {
            for (int var3 = 0; var3 < this.field4538.length; var3++) {
                if (this.field4538[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field4538.length;
                int[] var4 = new int[this.field4538.length + 1];
                class398.method2565(this.field4538, 0, var4, 0, this.field4538.length);
                this.field4538 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field4538.length; var9++) {
                int var13 = this.field4538[var9];
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
        for (int var10 = this.field4537 - 1; var10 > 0; var10--) {
            int var11 = this.field4535 * var10;
            for (int var12 = this.field4535 - 1; var12 > 0; var12--) {
                if (this.field4538[this.field4532[var11 + var12] & 0xFF] == 0 && this.field4538[this.field4532[var11 + var12 - this.field4535 - 1] & 0xFF] != 0) {
                    this.field4532[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "()I", line = 756)
    public final int method2024() {
        return this.field4535 + this.field4533 + this.field4534;
    }

    @OriginalMember(owner = "client!wt", name = "e", descriptor = "()I", line = 759)
    public final int method2025() {
        return this.field4540 + this.field4537 + this.field4536;
    }

    @OriginalMember(owner = "client!wt", name = "f", descriptor = "()V", line = 763)
    public final void method2026() {
        byte[] var1 = new byte[this.field4537 * this.field4535];
        int var2 = 0;
        if (this.field4539 == null) {
            for (int var3 = 0; var3 < this.field4535; var3++) {
                for (int var4 = this.field4537 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field4532[this.field4535 * var4 + var3];
                }
            }
            this.field4532 = var1;
        } else {
            byte[] var5 = new byte[this.field4537 * this.field4535];
            for (int var6 = 0; var6 < this.field4535; var6++) {
                for (int var9 = this.field4537 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field4532[this.field4535 * var9 + var6];
                    var5[var2++] = this.field4539[this.field4535 * var9 + var6];
                }
            }
            this.field4532 = var1;
            this.field4539 = var5;
        }
        int var7 = this.field4540;
        this.field4540 = this.field4533;
        this.field4533 = this.field4536;
        this.field4536 = this.field4534;
        this.field4534 = this.field4540;
        int var8 = this.field4537;
        this.field4537 = this.field4535;
        this.field4535 = var8;
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(Lri;II)Lwt;", line = 823)
    public static final class284 method2027(class97 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method926(arg1, -126, arg2);
        return var3 == null ? null : method2016(var3)[0];
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lri;I)[Lwt;", line = 831)
    public static final class284[] method2028(class97 arg0, int arg1) {
        byte[] var2 = arg0.method952(79, arg1);
        return var2 == null ? null : method2016(var2);
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(Lri;I)Lwt;", line = 840)
    public static final class284 method2029(class97 arg0, int arg1) {
        byte[] var2 = arg0.method952(97, arg1);
        return var2 == null ? null : method2016(var2)[0];
    }

    @OriginalMember(owner = "client!wt", name = "g", descriptor = "()[I", line = 850)
    public final int[] method2030() {
        int var1 = this.method2024();
        int[] var2 = new int[var1 * this.method2025()];
        if (this.field4539 == null) {
            for (int var7 = 0; var7 < this.field4537; var7++) {
                int var8 = this.field4535 * var7;
                int var9 = (this.field4540 + var7) * var1 + this.field4533;
                for (int var10 = 0; var10 < this.field4535; var10++) {
                    int var11 = this.field4538[this.field4532[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field4537; var3++) {
                int var4 = this.field4535 * var3;
                int var5 = (this.field4540 + var3) * var1 + this.field4533;
                for (int var6 = 0; var6 < this.field4535; var6++) {
                    var2[var5++] = this.field4539[var4] << 24 | this.field4538[this.field4532[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }
}
