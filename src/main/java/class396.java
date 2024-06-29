import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class396 {

    @OriginalMember(owner = "client!au", name = "b", descriptor = "I")
    public int field5694;

    @OriginalMember(owner = "client!au", name = "d", descriptor = "I")
    public int field5696;

    @OriginalMember(owner = "client!au", name = "e", descriptor = "I")
    public int field5697;

    @OriginalMember(owner = "client!au", name = "g", descriptor = "I")
    public int field5699;

    @OriginalMember(owner = "client!au", name = "h", descriptor = "I")
    public int field5700;

    @OriginalMember(owner = "client!au", name = "i", descriptor = "I")
    public int field5701;

    @OriginalMember(owner = "client!au", name = "c", descriptor = "[B")
    public byte[] field5695;

    @OriginalMember(owner = "client!au", name = "f", descriptor = "[B")
    public byte[] field5698;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "[I")
    public int[] field5693;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "()I")
    public final int method2341() {
        return this.field5700 + this.field5699 + this.field5701;
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "()V")
    public final void method2342() {
        byte[] var1 = new byte[this.field5700 * this.field5696];
        int var2 = 0;
        if (this.field5695 == null) {
            for (int var3 = 0; var3 < this.field5696; var3++) {
                for (int var4 = this.field5700 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field5698[this.field5696 * var4 + var3];
                }
            }
            this.field5698 = var1;
        } else {
            byte[] var5 = new byte[this.field5700 * this.field5696];
            for (int var6 = 0; var6 < this.field5696; var6++) {
                for (int var9 = this.field5700 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field5698[this.field5696 * var9 + var6];
                    var5[var2++] = this.field5695[this.field5696 * var9 + var6];
                }
            }
            this.field5698 = var1;
            this.field5695 = var5;
        }
        int var7 = this.field5699;
        this.field5699 = this.field5694;
        this.field5694 = this.field5701;
        this.field5701 = this.field5697;
        this.field5697 = this.field5699;
        int var8 = this.field5700;
        this.field5700 = this.field5696;
        this.field5696 = var8;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(I)V")
    public final void method2343(int arg0) {
        int var2 = -1;
        if (this.field5693.length < 255) {
            for (int var3 = 0; var3 < this.field5693.length; var3++) {
                if (this.field5693[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field5693.length;
                int[] var4 = new int[this.field5693.length + 1];
                class57.method373(this.field5693, 0, var4, 0, this.field5693.length);
                this.field5693 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field5693.length; var9++) {
                int var13 = this.field5693[var9];
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
        for (int var10 = this.field5700 - 1; var10 > 0; var10--) {
            int var11 = this.field5696 * var10;
            for (int var12 = this.field5696 - 1; var12 > 0; var12--) {
                if (this.field5693[this.field5698[var11 + var12] & 0xFF] == 0 && this.field5693[this.field5698[var11 + var12 - this.field5696 - 1] & 0xFF] != 0) {
                    this.field5698[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!au", name = "c", descriptor = "()V")
    public final void method2344() {
        byte[] var1 = this.field5698;
        if (this.field5695 == null) {
            for (int var2 = this.field5700 - 1; var2 >= 0; var2--) {
                int var3 = this.field5696 * var2;
                int var4 = (var2 + 1) * this.field5696;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field5695;
            for (int var7 = this.field5700 - 1; var7 >= 0; var7--) {
                int var9 = this.field5696 * var7;
                int var10 = (var7 + 1) * this.field5696;
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
        int var8 = this.field5694;
        this.field5694 = this.field5697;
        this.field5697 = var8;
    }

    @OriginalMember(owner = "client!au", name = "d", descriptor = "()V")
    public final void method2345() {
        byte[] var1 = this.field5698;
        if (this.field5695 == null) {
            for (int var2 = (this.field5700 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field5696 * var2;
                int var4 = (this.field5700 - var2 - 1) * this.field5696;
                for (int var5 = -this.field5696; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field5695;
            for (int var8 = (this.field5700 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field5696 * var8;
                int var11 = (this.field5700 - var8 - 1) * this.field5696;
                for (int var12 = -this.field5696; var12 < 0; var12++) {
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
        int var9 = this.field5699;
        this.field5699 = this.field5701;
        this.field5701 = var9;
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(I)V")
    public final void method2346(int arg0) {
        int var2 = this.method2349();
        int var3 = this.method2341();
        if (this.field5696 == var2 && this.field5700 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field5694) {
            var4 = this.field5694;
        }
        int var5 = arg0;
        if (this.field5694 + arg0 + this.field5696 > var2) {
            var5 = var2 - this.field5694 - this.field5696;
        }
        int var6 = arg0;
        if (arg0 > this.field5699) {
            var6 = this.field5699;
        }
        int var7 = arg0;
        if (this.field5699 + arg0 + this.field5700 > var3) {
            var7 = var3 - this.field5699 - this.field5700;
        }
        int var8 = this.field5696 + var4 + var5;
        int var9 = this.field5700 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field5695 == null) {
            for (int var11 = 0; var11 < this.field5700; var11++) {
                int var12 = this.field5696 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field5696; var14++) {
                    var10[var13++] = this.field5698[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field5700; var16++) {
                int var17 = this.field5696 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field5696; var19++) {
                    var15[var18] = this.field5695[var17];
                    var10[var18++] = this.field5698[var17++];
                }
            }
            this.field5695 = var15;
        }
        this.field5694 -= var4;
        this.field5699 -= var6;
        this.field5697 -= var5;
        this.field5701 -= var7;
        this.field5696 = var8;
        this.field5700 = var9;
        this.field5698 = var10;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Ldk;II)[Lau;")
    public static final class396[] method2347(class421 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2512(arg1, (byte) -93, arg2);
        return var3 == null ? null : method2354(var3);
    }

    @OriginalMember(owner = "client!au", name = "e", descriptor = "()V")
    public final void method2348() {
        int var1 = this.method2349();
        int var2 = this.method2341();
        if (this.field5696 == var1 && this.field5700 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field5695 == null) {
            for (int var9 = 0; var9 < this.field5700; var9++) {
                int var10 = this.field5696 * var9;
                int var11 = (this.field5699 + var9) * var1 + this.field5694;
                for (int var12 = 0; var12 < this.field5696; var12++) {
                    var3[var11++] = this.field5698[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field5700; var5++) {
                int var6 = this.field5696 * var5;
                int var7 = (this.field5699 + var5) * var1 + this.field5694;
                for (int var8 = 0; var8 < this.field5696; var8++) {
                    var3[var7] = this.field5698[var6];
                    var4[var7++] = this.field5695[var6++];
                }
            }
            this.field5695 = var4;
        }
        this.field5694 = this.field5697 = this.field5699 = this.field5701 = 0;
        this.field5696 = var1;
        this.field5700 = var2;
        this.field5698 = var3;
    }

    @OriginalMember(owner = "client!au", name = "f", descriptor = "()I")
    public final int method2349() {
        return this.field5696 + this.field5694 + this.field5697;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Ldk;I)Lau;")
    public static final class396 method2350(class421 arg0, int arg1) {
        byte[] var2 = arg0.method2496(arg1, -11);
        return var2 == null ? null : method2354(var2)[0];
    }

    @OriginalMember(owner = "client!au", name = "c", descriptor = "(I)V")
    public final void method2351(int arg0) {
        int var2 = -1;
        if (this.field5693.length < 255) {
            for (int var3 = 0; var3 < this.field5693.length; var3++) {
                if (this.field5693[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field5693.length;
                int[] var4 = new int[this.field5693.length + 1];
                class57.method373(this.field5693, 0, var4, 0, this.field5693.length);
                this.field5693 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field5693.length; var9++) {
                int var15 = this.field5693[var9];
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
        byte[] var11 = new byte[this.field5700 * this.field5696];
        for (int var12 = 0; var12 < this.field5700; var12++) {
            for (int var13 = 0; var13 < this.field5696; var13++) {
                int var14 = this.field5698[var10] & 0xFF;
                if (this.field5693[var14] == 0) {
                    if (var13 > 0 && this.field5693[this.field5698[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field5693[this.field5698[var10 - this.field5696] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field5696 - 1 && this.field5693[this.field5698[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field5700 - 1 && this.field5693[this.field5698[this.field5696 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field5698 = var11;
    }

    @OriginalMember(owner = "client!au", name = "g", descriptor = "()[I")
    public final int[] method2352() {
        int var1 = this.method2349();
        int[] var2 = new int[var1 * this.method2341()];
        if (this.field5695 == null) {
            for (int var7 = 0; var7 < this.field5700; var7++) {
                int var8 = this.field5696 * var7;
                int var9 = (this.field5699 + var7) * var1 + this.field5694;
                for (int var10 = 0; var10 < this.field5696; var10++) {
                    int var11 = this.field5693[this.field5698[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field5700; var3++) {
                int var4 = this.field5696 * var3;
                int var5 = (this.field5699 + var3) * var1 + this.field5694;
                for (int var6 = 0; var6 < this.field5696; var6++) {
                    var2[var5++] = this.field5695[var4] << 24 | this.field5693[this.field5698[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(Ldk;II)Lau;")
    public static final class396 method2353(class421 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2512(arg1, (byte) -93, arg2);
        return var3 == null ? null : method2354(var3)[0];
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "([B)[Lau;")
    private static final class396[] method2354(byte[] arg0) {
        class319 var1 = new class319(arg0);
        var1.field4360 = arg0.length - 2;
        int var2 = var1.method1844(-106);
        class396[] var3 = new class396[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class396();
        }
        var1.field4360 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method1844(-127);
        int var6 = var1.method1844(-125);
        int var7 = (var1.method1869(-71) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field5694 = var1.method1844(-104);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field5699 = var1.method1844(-101);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field5696 = var1.method1844(-113);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field5700 = var1.method1844(-126);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class396 var32 = var3[var12];
            var32.field5697 = var5 - var32.field5696 - var32.field5694;
            var32.field5701 = var6 - var32.field5700 - var32.field5699;
        }
        var1.field4360 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method1852(1086280488);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field5693 = var13;
        }
        var1.field4360 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class396 var17 = var3[var16];
            int var18 = var17.field5700 * var17.field5696;
            var17.field5698 = new byte[var18];
            int var19 = var1.method1869(-116);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field5695 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field5698[var24] = var1.method1894(-2018);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field5695[var25] = var1.method1894(-2018);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field5696; var27++) {
                        for (int var31 = 0; var31 < var17.field5700; var31++) {
                            var17.field5698[var17.field5696 * var31 + var27] = var1.method1894(-2018);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field5696; var28++) {
                        for (int var29 = 0; var29 < var17.field5700; var29++) {
                            byte var30 = var17.field5695[var17.field5696 * var29 + var28] = var1.method1894(-2018);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field5695 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field5698[var20] = var1.method1894(-2018);
                }
            } else {
                for (int var21 = 0; var21 < var17.field5696; var21++) {
                    for (int var22 = 0; var22 < var17.field5700; var22++) {
                        var17.field5698[var17.field5696 * var22 + var21] = var1.method1894(-2018);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(Ldk;I)[Lau;")
    public static final class396[] method2355(class421 arg0, int arg1) {
        byte[] var2 = arg0.method2496(arg1, -121);
        return var2 == null ? null : method2354(var2);
    }
}
