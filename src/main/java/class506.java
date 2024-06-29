import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class506 {

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "I")
    public int field6645;

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "I")
    public int field6646;

    @OriginalMember(owner = "client!aw", name = "f", descriptor = "I")
    public int field6650;

    @OriginalMember(owner = "client!aw", name = "g", descriptor = "I")
    public int field6651;

    @OriginalMember(owner = "client!aw", name = "h", descriptor = "I")
    public int field6652;

    @OriginalMember(owner = "client!aw", name = "i", descriptor = "I")
    public int field6653;

    @OriginalMember(owner = "client!aw", name = "c", descriptor = "[B")
    public byte[] field6647;

    @OriginalMember(owner = "client!aw", name = "e", descriptor = "[B")
    public byte[] field6649;

    @OriginalMember(owner = "client!aw", name = "d", descriptor = "[I")
    public int[] field6648;

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "([B)[Law;")
    private static final class506[] method2723(byte[] arg0) {
        class418 var1 = new class418(arg0);
        var1.field5367 = arg0.length - 2;
        int var2 = var1.method2393(-30727);
        class506[] var3 = new class506[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class506();
        }
        var1.field5367 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method2393(-30727);
        int var6 = var1.method2393(-30727);
        int var7 = (var1.method2396(124) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field6646 = var1.method2393(-30727);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field6652 = var1.method2393(-30727);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field6651 = var1.method2393(-30727);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field6650 = var1.method2393(-30727);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class506 var32 = var3[var12];
            var32.field6645 = var5 - var32.field6651 - var32.field6646;
            var32.field6653 = var6 - var32.field6650 - var32.field6652;
        }
        var1.field5367 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method2364(-127);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field6648 = var13;
        }
        var1.field5367 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class506 var17 = var3[var16];
            int var18 = var17.field6651 * var17.field6650;
            var17.field6647 = new byte[var18];
            int var19 = var1.method2396(-128);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field6649 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field6647[var24] = var1.method2387((byte) -74);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field6649[var25] = var1.method2387((byte) -92);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field6651; var27++) {
                        for (int var31 = 0; var31 < var17.field6650; var31++) {
                            var17.field6647[var17.field6651 * var31 + var27] = var1.method2387((byte) -89);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field6651; var28++) {
                        for (int var29 = 0; var29 < var17.field6650; var29++) {
                            byte var30 = var17.field6649[var17.field6651 * var29 + var28] = var1.method2387((byte) -53);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field6649 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field6647[var20] = var1.method2387((byte) 111);
                }
            } else {
                for (int var21 = 0; var21 < var17.field6651; var21++) {
                    for (int var22 = 0; var22 < var17.field6650; var22++) {
                        var17.field6647[var17.field6651 * var22 + var21] = var1.method2387((byte) -26);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lpe;I)Law;")
    public static final class506 method2724(class615 arg0, int arg1) {
        byte[] var2 = arg0.method3365(arg1, (byte) 125);
        return var2 == null ? null : method2723(var2)[0];
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "()I")
    public final int method2725() {
        return this.field6652 + this.field6650 + this.field6653;
    }

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "()I")
    public final int method2726() {
        return this.field6651 + this.field6646 + this.field6645;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)V")
    public final void method2727(int arg0) {
        int var2 = this.method2726();
        int var3 = this.method2725();
        if (this.field6651 == var2 && this.field6650 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field6646) {
            var4 = this.field6646;
        }
        int var5 = arg0;
        if (this.field6646 + arg0 + this.field6651 > var2) {
            var5 = var2 - this.field6646 - this.field6651;
        }
        int var6 = arg0;
        if (arg0 > this.field6652) {
            var6 = this.field6652;
        }
        int var7 = arg0;
        if (this.field6652 + arg0 + this.field6650 > var3) {
            var7 = var3 - this.field6652 - this.field6650;
        }
        int var8 = this.field6651 + var4 + var5;
        int var9 = this.field6650 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field6649 == null) {
            for (int var11 = 0; var11 < this.field6650; var11++) {
                int var12 = this.field6651 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field6651; var14++) {
                    var10[var13++] = this.field6647[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field6650; var16++) {
                int var17 = this.field6651 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field6651; var19++) {
                    var15[var18] = this.field6649[var17];
                    var10[var18++] = this.field6647[var17++];
                }
            }
            this.field6649 = var15;
        }
        this.field6646 -= var4;
        this.field6652 -= var6;
        this.field6645 -= var5;
        this.field6653 -= var7;
        this.field6651 = var8;
        this.field6650 = var9;
        this.field6647 = var10;
    }

    @OriginalMember(owner = "client!aw", name = "c", descriptor = "()V")
    public final void method2728() {
        byte[] var1 = this.field6647;
        if (this.field6649 == null) {
            for (int var2 = (this.field6650 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field6651 * var2;
                int var4 = (this.field6650 - var2 - 1) * this.field6651;
                for (int var5 = -this.field6651; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field6649;
            for (int var8 = (this.field6650 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field6651 * var8;
                int var11 = (this.field6650 - var8 - 1) * this.field6651;
                for (int var12 = -this.field6651; var12 < 0; var12++) {
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
        int var9 = this.field6652;
        this.field6652 = this.field6653;
        this.field6653 = var9;
    }

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(I)V")
    public final void method2729(int arg0) {
        int var2 = -1;
        if (this.field6648.length < 255) {
            for (int var3 = 0; var3 < this.field6648.length; var3++) {
                if (this.field6648[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field6648.length;
                int[] var4 = new int[this.field6648.length + 1];
                class443.method2517(this.field6648, 0, var4, 0, this.field6648.length);
                this.field6648 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field6648.length; var9++) {
                int var15 = this.field6648[var9];
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
        byte[] var11 = new byte[this.field6651 * this.field6650];
        for (int var12 = 0; var12 < this.field6650; var12++) {
            for (int var13 = 0; var13 < this.field6651; var13++) {
                int var14 = this.field6647[var10] & 0xFF;
                if (this.field6648[var14] == 0) {
                    if (var13 > 0 && this.field6648[this.field6647[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field6648[this.field6647[var10 - this.field6651] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field6651 - 1 && this.field6648[this.field6647[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field6650 - 1 && this.field6648[this.field6647[this.field6651 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field6647 = var11;
    }

    @OriginalMember(owner = "client!aw", name = "d", descriptor = "()[I")
    public final int[] method2730() {
        int var1 = this.method2726();
        int[] var2 = new int[var1 * this.method2725()];
        if (this.field6649 == null) {
            for (int var7 = 0; var7 < this.field6650; var7++) {
                int var8 = this.field6651 * var7;
                int var9 = (this.field6652 + var7) * var1 + this.field6646;
                for (int var10 = 0; var10 < this.field6651; var10++) {
                    int var11 = this.field6648[this.field6647[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field6650; var3++) {
                int var4 = this.field6651 * var3;
                int var5 = (this.field6652 + var3) * var1 + this.field6646;
                for (int var6 = 0; var6 < this.field6651; var6++) {
                    var2[var5++] = this.field6649[var4] << 24 | this.field6648[this.field6647[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lpe;II)[Law;")
    public static final class506[] method2731(class615 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3346(-1, arg1, arg2);
        return var3 == null ? null : method2723(var3);
    }

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(Lpe;II)Law;")
    public static final class506 method2732(class615 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3346(-1, arg1, arg2);
        return var3 == null ? null : method2723(var3)[0];
    }

    @OriginalMember(owner = "client!aw", name = "e", descriptor = "()V")
    public final void method2733() {
        byte[] var1 = this.field6647;
        if (this.field6649 == null) {
            for (int var2 = this.field6650 - 1; var2 >= 0; var2--) {
                int var3 = this.field6651 * var2;
                int var4 = (var2 + 1) * this.field6651;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field6649;
            for (int var7 = this.field6650 - 1; var7 >= 0; var7--) {
                int var9 = this.field6651 * var7;
                int var10 = (var7 + 1) * this.field6651;
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
        int var8 = this.field6646;
        this.field6646 = this.field6645;
        this.field6645 = var8;
    }

    @OriginalMember(owner = "client!aw", name = "f", descriptor = "()V")
    public final void method2734() {
        int var1 = this.method2726();
        int var2 = this.method2725();
        if (this.field6651 == var1 && this.field6650 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field6649 == null) {
            for (int var9 = 0; var9 < this.field6650; var9++) {
                int var10 = this.field6651 * var9;
                int var11 = (this.field6652 + var9) * var1 + this.field6646;
                for (int var12 = 0; var12 < this.field6651; var12++) {
                    var3[var11++] = this.field6647[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field6650; var5++) {
                int var6 = this.field6651 * var5;
                int var7 = (this.field6652 + var5) * var1 + this.field6646;
                for (int var8 = 0; var8 < this.field6651; var8++) {
                    var3[var7] = this.field6647[var6];
                    var4[var7++] = this.field6649[var6++];
                }
            }
            this.field6649 = var4;
        }
        this.field6646 = this.field6645 = this.field6652 = this.field6653 = 0;
        this.field6651 = var1;
        this.field6650 = var2;
        this.field6647 = var3;
    }

    @OriginalMember(owner = "client!aw", name = "g", descriptor = "()V")
    public final void method2735() {
        byte[] var1 = new byte[this.field6651 * this.field6650];
        int var2 = 0;
        if (this.field6649 == null) {
            for (int var3 = 0; var3 < this.field6651; var3++) {
                for (int var4 = this.field6650 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field6647[this.field6651 * var4 + var3];
                }
            }
            this.field6647 = var1;
        } else {
            byte[] var5 = new byte[this.field6651 * this.field6650];
            for (int var6 = 0; var6 < this.field6651; var6++) {
                for (int var9 = this.field6650 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field6647[this.field6651 * var9 + var6];
                    var5[var2++] = this.field6649[this.field6651 * var9 + var6];
                }
            }
            this.field6647 = var1;
            this.field6649 = var5;
        }
        int var7 = this.field6652;
        this.field6652 = this.field6646;
        this.field6646 = this.field6653;
        this.field6653 = this.field6645;
        this.field6645 = this.field6652;
        int var8 = this.field6650;
        this.field6650 = this.field6651;
        this.field6651 = var8;
    }

    @OriginalMember(owner = "client!aw", name = "c", descriptor = "(I)V")
    public final void method2736(int arg0) {
        int var2 = -1;
        if (this.field6648.length < 255) {
            for (int var3 = 0; var3 < this.field6648.length; var3++) {
                if (this.field6648[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field6648.length;
                int[] var4 = new int[this.field6648.length + 1];
                class443.method2517(this.field6648, 0, var4, 0, this.field6648.length);
                this.field6648 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field6648.length; var9++) {
                int var13 = this.field6648[var9];
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
        for (int var10 = this.field6650 - 1; var10 > 0; var10--) {
            int var11 = this.field6651 * var10;
            for (int var12 = this.field6651 - 1; var12 > 0; var12--) {
                if (this.field6648[this.field6647[var11 + var12] & 0xFF] == 0 && this.field6648[this.field6647[var11 + var12 - this.field6651 - 1] & 0xFF] != 0) {
                    this.field6647[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(Lpe;I)[Law;")
    public static final class506[] method2737(class615 arg0, int arg1) {
        byte[] var2 = arg0.method3365(arg1, (byte) 83);
        return var2 == null ? null : method2723(var2);
    }
}
