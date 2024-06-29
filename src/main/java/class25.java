import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class25 {

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public int field437;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    public int field438;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public int field439;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    public int field440;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    public int field442;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "I")
    public int field444;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "[B")
    public byte[] field441;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "[B")
    public byte[] field445;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "[I")
    public int[] field443;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "()V", line = 5)
    public final void method218() {
        byte[] var1 = this.field445;
        if (this.field441 == null) {
            for (int var2 = (this.field438 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field442 * var2;
                int var4 = (this.field438 - var2 - 1) * this.field442;
                for (int var5 = -this.field442; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field441;
            for (int var8 = (this.field438 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field442 * var8;
                int var11 = (this.field438 - var8 - 1) * this.field442;
                for (int var12 = -this.field442; var12 < 0; var12++) {
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
        int var9 = this.field437;
        this.field437 = this.field440;
        this.field440 = var9;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "()I", line = 74)
    public final int method219() {
        return this.field438 + this.field437 + this.field440;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lqj;I)Ln;", line = 82)
    public static final class25 method220(class238 arg0, int arg1) {
        byte[] var2 = arg0.method1466(arg1, 119);
        return var2 == null ? null : method221(var2)[0];
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "([B)[Ln;", line = 91)
    private static final class25[] method221(byte[] arg0) {
        class265 var1 = new class265(arg0);
        var1.field3915 = arg0.length - 2;
        int var2 = var1.method1685(8104);
        class25[] var3 = new class25[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class25();
        }
        var1.field3915 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method1685(8104);
        int var6 = var1.method1685(8104);
        int var7 = (var1.method1697(127) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field444 = var1.method1685(8104);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field437 = var1.method1685(8104);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field442 = var1.method1685(8104);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field438 = var1.method1685(8104);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class25 var32 = var3[var12];
            var32.field439 = var5 - var32.field442 - var32.field444;
            var32.field440 = var6 - var32.field438 - var32.field437;
        }
        var1.field3915 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method1691(false);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field443 = var13;
        }
        var1.field3915 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class25 var17 = var3[var16];
            int var18 = var17.field442 * var17.field438;
            var17.field445 = new byte[var18];
            int var19 = var1.method1697(-113);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field441 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field445[var24] = var1.method1708((byte) 127);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field441[var25] = var1.method1708((byte) 127);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field442; var27++) {
                        for (int var31 = 0; var31 < var17.field438; var31++) {
                            var17.field445[var17.field442 * var31 + var27] = var1.method1708((byte) 127);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field442; var28++) {
                        for (int var29 = 0; var29 < var17.field438; var29++) {
                            byte var30 = var17.field441[var17.field442 * var29 + var28] = var1.method1708((byte) 127);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field441 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field445[var20] = var1.method1708((byte) 127);
                }
            } else {
                for (int var21 = 0; var21 < var17.field442; var21++) {
                    for (int var22 = 0; var22 < var17.field438; var22++) {
                        var17.field445[var17.field442 * var22 + var21] = var1.method1708((byte) 127);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lqj;II)[Ln;", line = 299)
    public static final class25[] method222(class238 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1472(arg2, arg1, 0);
        return var3 == null ? null : method221(var3);
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "()V", line = 308)
    public final void method223() {
        int var1 = this.method227();
        int var2 = this.method219();
        if (this.field442 == var1 && this.field438 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field441 == null) {
            for (int var9 = 0; var9 < this.field438; var9++) {
                int var10 = this.field442 * var9;
                int var11 = (this.field437 + var9) * var1 + this.field444;
                for (int var12 = 0; var12 < this.field442; var12++) {
                    var3[var11++] = this.field445[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field438; var5++) {
                int var6 = this.field442 * var5;
                int var7 = (this.field437 + var5) * var1 + this.field444;
                for (int var8 = 0; var8 < this.field442; var8++) {
                    var3[var7] = this.field445[var6];
                    var4[var7++] = this.field441[var6++];
                }
            }
            this.field441 = var4;
        }
        this.field444 = this.field439 = this.field437 = this.field440 = 0;
        this.field442 = var1;
        this.field438 = var2;
        this.field445 = var3;
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "()V", line = 376)
    public final void method224() {
        byte[] var1 = new byte[this.field442 * this.field438];
        int var2 = 0;
        if (this.field441 == null) {
            for (int var3 = 0; var3 < this.field442; var3++) {
                for (int var4 = this.field438 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field445[this.field442 * var4 + var3];
                }
            }
            this.field445 = var1;
        } else {
            byte[] var5 = new byte[this.field442 * this.field438];
            for (int var6 = 0; var6 < this.field442; var6++) {
                for (int var9 = this.field438 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field445[this.field442 * var9 + var6];
                    var5[var2++] = this.field441[this.field442 * var9 + var6];
                }
            }
            this.field445 = var1;
            this.field441 = var5;
        }
        int var7 = this.field437;
        this.field437 = this.field444;
        this.field444 = this.field440;
        this.field440 = this.field439;
        this.field439 = this.field437;
        int var8 = this.field438;
        this.field438 = this.field442;
        this.field442 = var8;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(Lqj;II)Ln;", line = 439)
    public static final class25 method225(class238 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1472(arg2, arg1, 0);
        return var3 == null ? null : method221(var3)[0];
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V", line = 447)
    public final void method226(int arg0) {
        int var2 = -1;
        if (this.field443.length < 255) {
            for (int var3 = 0; var3 < this.field443.length; var3++) {
                if (this.field443[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field443.length;
                int[] var4 = new int[this.field443.length + 1];
                class111.method775(this.field443, 0, var4, 0, this.field443.length);
                this.field443 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field443.length; var9++) {
                int var13 = this.field443[var9];
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
        for (int var10 = this.field438 - 1; var10 > 0; var10--) {
            int var11 = this.field442 * var10;
            for (int var12 = this.field442 - 1; var12 > 0; var12--) {
                if (this.field443[this.field445[var11 + var12] & 0xFF] == 0 && this.field443[this.field445[var11 + var12 - this.field442 - 1] & 0xFF] != 0) {
                    this.field445[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "e", descriptor = "()I", line = 549)
    public final int method227() {
        return this.field444 + this.field442 + this.field439;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(Lqj;I)[Ln;", line = 555)
    public static final class25[] method228(class238 arg0, int arg1) {
        byte[] var2 = arg0.method1466(arg1, 30);
        return var2 == null ? null : method221(var2);
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V", line = 563)
    public final void method229(int arg0) {
        int var2 = this.method227();
        int var3 = this.method219();
        if (this.field442 == var2 && this.field438 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field444) {
            var4 = this.field444;
        }
        int var5 = arg0;
        if (this.field444 + arg0 + this.field442 > var2) {
            var5 = var2 - this.field444 - this.field442;
        }
        int var6 = arg0;
        if (arg0 > this.field437) {
            var6 = this.field437;
        }
        int var7 = arg0;
        if (this.field437 + arg0 + this.field438 > var3) {
            var7 = var3 - this.field437 - this.field438;
        }
        int var8 = this.field442 + var4 + var5;
        int var9 = this.field438 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field441 == null) {
            for (int var11 = 0; var11 < this.field438; var11++) {
                int var12 = this.field442 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field442; var14++) {
                    var10[var13++] = this.field445[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field438; var16++) {
                int var17 = this.field442 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field442; var19++) {
                    var15[var18] = this.field441[var17];
                    var10[var18++] = this.field445[var17++];
                }
            }
            this.field441 = var15;
        }
        this.field444 -= var4;
        this.field437 -= var6;
        this.field439 -= var5;
        this.field440 -= var7;
        this.field442 = var8;
        this.field438 = var9;
        this.field445 = var10;
    }

    @OriginalMember(owner = "client!n", name = "f", descriptor = "()V", line = 660)
    public final void method230() {
        byte[] var1 = this.field445;
        if (this.field441 == null) {
            for (int var2 = this.field438 - 1; var2 >= 0; var2--) {
                int var3 = this.field442 * var2;
                int var4 = (var2 + 1) * this.field442;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field441;
            for (int var7 = this.field438 - 1; var7 >= 0; var7--) {
                int var9 = this.field442 * var7;
                int var10 = (var7 + 1) * this.field442;
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
        int var8 = this.field444;
        this.field444 = this.field439;
        this.field439 = var8;
    }

    @OriginalMember(owner = "client!n", name = "g", descriptor = "()[I", line = 723)
    public final int[] method231() {
        int var1 = this.method227();
        int[] var2 = new int[var1 * this.method219()];
        if (this.field441 == null) {
            for (int var7 = 0; var7 < this.field438; var7++) {
                int var8 = this.field442 * var7;
                int var9 = (this.field437 + var7) * var1 + this.field444;
                for (int var10 = 0; var10 < this.field442; var10++) {
                    int var11 = this.field443[this.field445[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field438; var3++) {
                int var4 = this.field442 * var3;
                int var5 = (this.field437 + var3) * var1 + this.field444;
                for (int var6 = 0; var6 < this.field442; var6++) {
                    var2[var5++] = this.field441[var4] << 24 | this.field443[this.field445[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(I)V", line = 788)
    public final void method232(int arg0) {
        int var2 = -1;
        if (this.field443.length < 255) {
            for (int var3 = 0; var3 < this.field443.length; var3++) {
                if (this.field443[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field443.length;
                int[] var4 = new int[this.field443.length + 1];
                class111.method775(this.field443, 0, var4, 0, this.field443.length);
                this.field443 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field443.length; var9++) {
                int var15 = this.field443[var9];
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
        byte[] var11 = new byte[this.field442 * this.field438];
        for (int var12 = 0; var12 < this.field438; var12++) {
            for (int var13 = 0; var13 < this.field442; var13++) {
                int var14 = this.field445[var10] & 0xFF;
                if (this.field443[var14] == 0) {
                    if (var13 > 0 && this.field443[this.field445[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field443[this.field445[var10 - this.field442] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field442 - 1 && this.field443[this.field445[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field438 - 1 && this.field443[this.field445[this.field442 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field445 = var11;
    }
}
