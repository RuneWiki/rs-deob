import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class720 {

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
    public int field10024;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public int field10025;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
    public int field10026;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    public int field10028;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
    public int field10029;

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "I")
    public int field10031;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "[B")
    public byte[] field10023;

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "[B")
    public byte[] field10030;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "[I")
    public int[] field10027;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "()V")
    public final void method4033() {
        byte[] var1 = this.field10023;
        if (this.field10030 == null) {
            for (int var2 = (this.field10029 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field10028 * var2;
                int var4 = (this.field10029 - var2 - 1) * this.field10028;
                for (int var5 = -this.field10028; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field10030;
            for (int var8 = (this.field10029 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field10028 * var8;
                int var11 = (this.field10029 - var8 - 1) * this.field10028;
                for (int var12 = -this.field10028; var12 < 0; var12++) {
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
        int var9 = this.field10031;
        this.field10031 = this.field10025;
        this.field10025 = var9;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lwu;II)Ljn;")
    public static final class720 method4034(class376 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2218((byte) 125, arg1, arg2);
        return var3 == null ? null : method4042(var3)[0];
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "()[I")
    public final int[] method4035() {
        int var1 = this.method4043();
        int[] var2 = new int[var1 * this.method4041()];
        if (this.field10030 == null) {
            for (int var7 = 0; var7 < this.field10029; var7++) {
                int var8 = this.field10028 * var7;
                int var9 = (this.field10031 + var7) * var1 + this.field10024;
                for (int var10 = 0; var10 < this.field10028; var10++) {
                    int var11 = this.field10027[this.field10023[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field10029; var3++) {
                int var4 = this.field10028 * var3;
                int var5 = (this.field10031 + var3) * var1 + this.field10024;
                for (int var6 = 0; var6 < this.field10028; var6++) {
                    var2[var5++] = this.field10030[var4] << 24 | this.field10027[this.field10023[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V")
    public final void method4036(int arg0) {
        int var2 = -1;
        if (this.field10027.length < 255) {
            for (int var3 = 0; var3 < this.field10027.length; var3++) {
                if (this.field10027[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field10027.length;
                int[] var4 = new int[this.field10027.length + 1];
                class335.method2016(this.field10027, 0, var4, 0, this.field10027.length);
                this.field10027 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field10027.length; var9++) {
                int var15 = this.field10027[var9];
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
        byte[] var11 = new byte[this.field10029 * this.field10028];
        for (int var12 = 0; var12 < this.field10029; var12++) {
            for (int var13 = 0; var13 < this.field10028; var13++) {
                int var14 = this.field10023[var10] & 0xFF;
                if (this.field10027[var14] == 0) {
                    if (var13 > 0 && this.field10027[this.field10023[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field10027[this.field10023[var10 - this.field10028] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field10028 - 1 && this.field10027[this.field10023[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field10029 - 1 && this.field10027[this.field10023[this.field10028 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field10023 = var11;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lwu;I)Ljn;")
    public static final class720 method4037(class376 arg0, int arg1) {
        byte[] var2 = arg0.method2226(-1, arg1);
        return var2 == null ? null : method4042(var2)[0];
    }

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "()V")
    public final void method4038() {
        byte[] var1 = new byte[this.field10029 * this.field10028];
        int var2 = 0;
        if (this.field10030 == null) {
            for (int var3 = 0; var3 < this.field10028; var3++) {
                for (int var4 = this.field10029 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field10023[this.field10028 * var4 + var3];
                }
            }
            this.field10023 = var1;
        } else {
            byte[] var5 = new byte[this.field10029 * this.field10028];
            for (int var6 = 0; var6 < this.field10028; var6++) {
                for (int var9 = this.field10029 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field10023[this.field10028 * var9 + var6];
                    var5[var2++] = this.field10030[this.field10028 * var9 + var6];
                }
            }
            this.field10023 = var1;
            this.field10030 = var5;
        }
        int var7 = this.field10031;
        this.field10031 = this.field10024;
        this.field10024 = this.field10025;
        this.field10025 = this.field10026;
        this.field10026 = this.field10031;
        int var8 = this.field10029;
        this.field10029 = this.field10028;
        this.field10028 = var8;
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)V")
    public final void method4039(int arg0) {
        int var2 = this.method4043();
        int var3 = this.method4041();
        if (this.field10028 == var2 && this.field10029 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field10024) {
            var4 = this.field10024;
        }
        int var5 = arg0;
        if (this.field10024 + arg0 + this.field10028 > var2) {
            var5 = var2 - this.field10024 - this.field10028;
        }
        int var6 = arg0;
        if (arg0 > this.field10031) {
            var6 = this.field10031;
        }
        int var7 = arg0;
        if (this.field10031 + arg0 + this.field10029 > var3) {
            var7 = var3 - this.field10031 - this.field10029;
        }
        int var8 = this.field10028 + var4 + var5;
        int var9 = this.field10029 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field10030 == null) {
            for (int var11 = 0; var11 < this.field10029; var11++) {
                int var12 = this.field10028 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field10028; var14++) {
                    var10[var13++] = this.field10023[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field10029; var16++) {
                int var17 = this.field10028 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field10028; var19++) {
                    var15[var18] = this.field10030[var17];
                    var10[var18++] = this.field10023[var17++];
                }
            }
            this.field10030 = var15;
        }
        this.field10024 -= var4;
        this.field10031 -= var6;
        this.field10026 -= var5;
        this.field10025 -= var7;
        this.field10028 = var8;
        this.field10029 = var9;
        this.field10023 = var10;
    }

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "(I)V")
    public final void method4040(int arg0) {
        int var2 = -1;
        if (this.field10027.length < 255) {
            for (int var3 = 0; var3 < this.field10027.length; var3++) {
                if (this.field10027[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field10027.length;
                int[] var4 = new int[this.field10027.length + 1];
                class335.method2016(this.field10027, 0, var4, 0, this.field10027.length);
                this.field10027 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field10027.length; var9++) {
                int var13 = this.field10027[var9];
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
        for (int var10 = this.field10029 - 1; var10 > 0; var10--) {
            int var11 = this.field10028 * var10;
            for (int var12 = this.field10028 - 1; var12 > 0; var12--) {
                if (this.field10027[this.field10023[var11 + var12] & 0xFF] == 0 && this.field10027[this.field10023[var11 + var12 - this.field10028 - 1] & 0xFF] != 0) {
                    this.field10023[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "()I")
    public final int method4041() {
        return this.field10031 + this.field10029 + this.field10025;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "([B)[Ljn;")
    private static final class720[] method4042(byte[] arg0) {
        class677 var1 = new class677(arg0);
        var1.field9419 = arg0.length - 2;
        int var2 = var1.method3807(-1);
        class720[] var3 = new class720[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class720();
        }
        var1.field9419 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method3807(-1);
        int var6 = var1.method3807(-1);
        int var7 = (var1.method3821((byte) 95) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field10024 = var1.method3807(-1);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field10031 = var1.method3807(-1);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field10028 = var1.method3807(-1);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field10029 = var1.method3807(-1);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class720 var32 = var3[var12];
            var32.field10026 = var5 - var32.field10028 - var32.field10024;
            var32.field10025 = var6 - var32.field10029 - var32.field10031;
        }
        var1.field9419 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method3833(255);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field10027 = var13;
        }
        var1.field9419 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class720 var17 = var3[var16];
            int var18 = var17.field10029 * var17.field10028;
            var17.field10023 = new byte[var18];
            int var19 = var1.method3821((byte) -78);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field10030 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field10023[var24] = var1.method3811(102);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field10030[var25] = var1.method3811(49);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field10028; var27++) {
                        for (int var31 = 0; var31 < var17.field10029; var31++) {
                            var17.field10023[var17.field10028 * var31 + var27] = var1.method3811(82);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field10028; var28++) {
                        for (int var29 = 0; var29 < var17.field10029; var29++) {
                            byte var30 = var17.field10030[var17.field10028 * var29 + var28] = var1.method3811(127);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field10030 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field10023[var20] = var1.method3811(91);
                }
            } else {
                for (int var21 = 0; var21 < var17.field10028; var21++) {
                    for (int var22 = 0; var22 < var17.field10029; var22++) {
                        var17.field10023[var17.field10028 * var22 + var21] = var1.method3811(103);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "()I")
    public final int method4043() {
        return this.field10028 + this.field10024 + this.field10026;
    }

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "()V")
    public final void method4044() {
        byte[] var1 = this.field10023;
        if (this.field10030 == null) {
            for (int var2 = this.field10029 - 1; var2 >= 0; var2--) {
                int var3 = this.field10028 * var2;
                int var4 = (var2 + 1) * this.field10028;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field10030;
            for (int var7 = this.field10029 - 1; var7 >= 0; var7--) {
                int var9 = this.field10028 * var7;
                int var10 = (var7 + 1) * this.field10028;
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
        int var8 = this.field10024;
        this.field10024 = this.field10026;
        this.field10026 = var8;
    }

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "()V")
    public final void method4045() {
        int var1 = this.method4043();
        int var2 = this.method4041();
        if (this.field10028 == var1 && this.field10029 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field10030 == null) {
            for (int var9 = 0; var9 < this.field10029; var9++) {
                int var10 = this.field10028 * var9;
                int var11 = (this.field10031 + var9) * var1 + this.field10024;
                for (int var12 = 0; var12 < this.field10028; var12++) {
                    var3[var11++] = this.field10023[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field10029; var5++) {
                int var6 = this.field10028 * var5;
                int var7 = (this.field10031 + var5) * var1 + this.field10024;
                for (int var8 = 0; var8 < this.field10028; var8++) {
                    var3[var7] = this.field10023[var6];
                    var4[var7++] = this.field10030[var6++];
                }
            }
            this.field10030 = var4;
        }
        this.field10024 = this.field10026 = this.field10031 = this.field10025 = 0;
        this.field10028 = var1;
        this.field10029 = var2;
        this.field10023 = var3;
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(Lwu;I)[Ljn;")
    public static final class720[] method4046(class376 arg0, int arg1) {
        byte[] var2 = arg0.method2226(-1, arg1);
        return var2 == null ? null : method4042(var2);
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(Lwu;II)[Ljn;")
    public static final class720[] method4047(class376 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2218((byte) 113, arg1, arg2);
        return var3 == null ? null : method4042(var3);
    }
}
