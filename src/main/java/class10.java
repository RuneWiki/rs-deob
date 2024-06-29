import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class10 {

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public int field181;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public int field183;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public int field185;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public int field186;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    public int field187;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public int field188;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "[B")
    public byte[] field180;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "[B")
    public byte[] field182;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "[I")
    public int[] field184;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lir;II)[Lok;", line = 4)
    public static final class10[] method75(class185 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1235(arg1, false, arg2);
        return var3 == null ? null : method79(var3);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "()I", line = 11)
    public final int method76() {
        return this.field188 + this.field187 + this.field181;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "()V", line = 15)
    public final void method77() {
        byte[] var1 = new byte[this.field187 * this.field183];
        int var2 = 0;
        if (this.field180 == null) {
            for (int var3 = 0; var3 < this.field183; var3++) {
                for (int var4 = this.field187 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field182[this.field183 * var4 + var3];
                }
            }
            this.field182 = var1;
        } else {
            byte[] var5 = new byte[this.field187 * this.field183];
            for (int var6 = 0; var6 < this.field183; var6++) {
                for (int var9 = this.field187 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field182[this.field183 * var9 + var6];
                    var5[var2++] = this.field180[this.field183 * var9 + var6];
                }
            }
            this.field182 = var1;
            this.field180 = var5;
        }
        int var7 = this.field188;
        this.field188 = this.field186;
        this.field186 = this.field181;
        this.field181 = this.field185;
        this.field185 = this.field188;
        int var8 = this.field187;
        this.field187 = this.field183;
        this.field183 = var8;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V", line = 75)
    public final void method78(int arg0) {
        int var2 = -1;
        if (this.field184.length < 255) {
            for (int var3 = 0; var3 < this.field184.length; var3++) {
                if (this.field184[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field184.length;
                int[] var4 = new int[this.field184.length + 1];
                class206.method1357(this.field184, 0, var4, 0, this.field184.length);
                this.field184 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field184.length; var9++) {
                int var13 = this.field184[var9];
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
        for (int var10 = this.field187 - 1; var10 > 0; var10--) {
            int var11 = this.field183 * var10;
            for (int var12 = this.field183 - 1; var12 > 0; var12--) {
                if (this.field184[this.field182[var11 + var12] & 0xFF] == 0 && this.field184[this.field182[var11 + var12 - this.field183 - 1] & 0xFF] != 0) {
                    this.field182[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "([B)[Lok;", line = 178)
    private static final class10[] method79(byte[] arg0) {
        class341 var1 = new class341(arg0);
        var1.field5049 = arg0.length - 2;
        int var2 = var1.method2239(-1076227960);
        class10[] var3 = new class10[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class10();
        }
        var1.field5049 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method2239(-1076227960);
        int var6 = var1.method2239(-1076227960);
        int var7 = (var1.method2233((byte) 104) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field186 = var1.method2239(-1076227960);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field188 = var1.method2239(-1076227960);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field183 = var1.method2239(-1076227960);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field187 = var1.method2239(-1076227960);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class10 var32 = var3[var12];
            var32.field185 = var5 - var32.field183 - var32.field186;
            var32.field181 = var6 - var32.field187 - var32.field188;
        }
        var1.field5049 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method2249(32767);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field184 = var13;
        }
        var1.field5049 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class10 var17 = var3[var16];
            int var18 = var17.field187 * var17.field183;
            var17.field182 = new byte[var18];
            int var19 = var1.method2233((byte) 104);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field180 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field182[var24] = var1.method2211(255);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field180[var25] = var1.method2211(255);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field183; var27++) {
                        for (int var31 = 0; var31 < var17.field187; var31++) {
                            var17.field182[var17.field183 * var31 + var27] = var1.method2211(255);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field183; var28++) {
                        for (int var29 = 0; var29 < var17.field187; var29++) {
                            byte var30 = var17.field180[var17.field183 * var29 + var28] = var1.method2211(255);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field180 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field182[var20] = var1.method2211(255);
                }
            } else {
                for (int var21 = 0; var21 < var17.field183; var21++) {
                    for (int var22 = 0; var22 < var17.field187; var22++) {
                        var17.field182[var17.field183 * var22 + var21] = var1.method2211(255);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lir;I)Lok;", line = 388)
    public static final class10 method80(class185 arg0, int arg1) {
        byte[] var2 = arg0.method1234(arg1, (byte) 76);
        return var2 == null ? null : method79(var2)[0];
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "()I", line = 395)
    public final int method81() {
        return this.field186 + this.field183 + this.field185;
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "()V", line = 400)
    public final void method82() {
        int var1 = this.method81();
        int var2 = this.method76();
        if (this.field183 == var1 && this.field187 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field180 == null) {
            for (int var9 = 0; var9 < this.field187; var9++) {
                int var10 = this.field183 * var9;
                int var11 = (this.field188 + var9) * var1 + this.field186;
                for (int var12 = 0; var12 < this.field183; var12++) {
                    var3[var11++] = this.field182[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field187; var5++) {
                int var6 = this.field183 * var5;
                int var7 = (this.field188 + var5) * var1 + this.field186;
                for (int var8 = 0; var8 < this.field183; var8++) {
                    var3[var7] = this.field182[var6];
                    var4[var7++] = this.field180[var6++];
                }
            }
            this.field180 = var4;
        }
        this.field186 = this.field185 = this.field188 = this.field181 = 0;
        this.field183 = var1;
        this.field187 = var2;
        this.field182 = var3;
    }

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "()V", line = 469)
    public final void method83() {
        byte[] var1 = this.field182;
        if (this.field180 == null) {
            for (int var2 = (this.field187 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field183 * var2;
                int var4 = (this.field187 - var2 - 1) * this.field183;
                for (int var5 = -this.field183; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field180;
            for (int var8 = (this.field187 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field183 * var8;
                int var11 = (this.field187 - var8 - 1) * this.field183;
                for (int var12 = -this.field183; var12 < 0; var12++) {
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
        int var9 = this.field188;
        this.field188 = this.field181;
        this.field181 = var9;
    }

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "()[I", line = 539)
    public final int[] method84() {
        int var1 = this.method81();
        int[] var2 = new int[var1 * this.method76()];
        if (this.field180 == null) {
            for (int var7 = 0; var7 < this.field187; var7++) {
                int var8 = this.field183 * var7;
                int var9 = (this.field188 + var7) * var1 + this.field186;
                for (int var10 = 0; var10 < this.field183; var10++) {
                    int var11 = this.field184[this.field182[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field187; var3++) {
                int var4 = this.field183 * var3;
                int var5 = (this.field188 + var3) * var1 + this.field186;
                for (int var6 = 0; var6 < this.field183; var6++) {
                    var2[var5++] = this.field180[var4] << 24 | this.field184[this.field182[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)V", line = 609)
    public final void method85(int arg0) {
        int var2 = -1;
        if (this.field184.length < 255) {
            for (int var3 = 0; var3 < this.field184.length; var3++) {
                if (this.field184[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field184.length;
                int[] var4 = new int[this.field184.length + 1];
                class206.method1357(this.field184, 0, var4, 0, this.field184.length);
                this.field184 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field184.length; var9++) {
                int var15 = this.field184[var9];
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
        byte[] var11 = new byte[this.field187 * this.field183];
        for (int var12 = 0; var12 < this.field187; var12++) {
            for (int var13 = 0; var13 < this.field183; var13++) {
                int var14 = this.field182[var10] & 0xFF;
                if (this.field184[var14] == 0) {
                    if (var13 > 0 && this.field184[this.field182[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field184[this.field182[var10 - this.field183] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field183 - 1 && this.field184[this.field182[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field187 - 1 && this.field184[this.field182[this.field183 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field182 = var11;
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)V", line = 735)
    public final void method86(int arg0) {
        int var2 = this.method81();
        int var3 = this.method76();
        if (this.field183 == var2 && this.field187 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field186) {
            var4 = this.field186;
        }
        int var5 = arg0;
        if (this.field186 + arg0 + this.field183 > var2) {
            var5 = var2 - this.field186 - this.field183;
        }
        int var6 = arg0;
        if (arg0 > this.field188) {
            var6 = this.field188;
        }
        int var7 = arg0;
        if (this.field188 + arg0 + this.field187 > var3) {
            var7 = var3 - this.field188 - this.field187;
        }
        int var8 = this.field183 + var4 + var5;
        int var9 = this.field187 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field180 == null) {
            for (int var11 = 0; var11 < this.field187; var11++) {
                int var12 = this.field183 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field183; var14++) {
                    var10[var13++] = this.field182[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field187; var16++) {
                int var17 = this.field183 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field183; var19++) {
                    var15[var18] = this.field180[var17];
                    var10[var18++] = this.field182[var17++];
                }
            }
            this.field180 = var15;
        }
        this.field186 -= var4;
        this.field188 -= var6;
        this.field185 -= var5;
        this.field181 -= var7;
        this.field183 = var8;
        this.field187 = var9;
        this.field182 = var10;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(Lir;I)[Lok;", line = 830)
    public static final class10[] method87(class185 arg0, int arg1) {
        byte[] var2 = arg0.method1234(arg1, (byte) 76);
        return var2 == null ? null : method79(var2);
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(Lir;II)Lok;", line = 838)
    public static final class10 method88(class185 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1235(arg1, false, arg2);
        return var3 == null ? null : method79(var3)[0];
    }

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "()V", line = 851)
    public final void method89() {
        byte[] var1 = this.field182;
        if (this.field180 == null) {
            for (int var2 = this.field187 - 1; var2 >= 0; var2--) {
                int var3 = this.field183 * var2;
                int var4 = (var2 + 1) * this.field183;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field180;
            for (int var7 = this.field187 - 1; var7 >= 0; var7--) {
                int var9 = this.field183 * var7;
                int var10 = (var7 + 1) * this.field183;
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
        int var8 = this.field186;
        this.field186 = this.field185;
        this.field185 = var8;
    }
}
