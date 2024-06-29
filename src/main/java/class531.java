import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class531 {

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "I")
    public int field7814;

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "I")
    public int field7815;

    @OriginalMember(owner = "client!mp", name = "f", descriptor = "I")
    public int field7818;

    @OriginalMember(owner = "client!mp", name = "g", descriptor = "I")
    public int field7819;

    @OriginalMember(owner = "client!mp", name = "h", descriptor = "I")
    public int field7820;

    @OriginalMember(owner = "client!mp", name = "i", descriptor = "I")
    public int field7821;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "[B")
    public byte[] field7813;

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "[B")
    public byte[] field7817;

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "[I")
    public int[] field7816;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)V", line = 5)
    public final void method3120(int arg0) {
        int var2 = -1;
        if (this.field7816.length < 255) {
            for (int var3 = 0; var3 < this.field7816.length; var3++) {
                if (this.field7816[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field7816.length;
                int[] var4 = new int[this.field7816.length + 1];
                class416.method2487(this.field7816, 0, var4, 0, this.field7816.length);
                this.field7816 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field7816.length; var9++) {
                int var15 = this.field7816[var9];
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
        byte[] var11 = new byte[this.field7821 * this.field7815];
        for (int var12 = 0; var12 < this.field7815; var12++) {
            for (int var13 = 0; var13 < this.field7821; var13++) {
                int var14 = this.field7817[var10] & 0xFF;
                if (this.field7816[var14] == 0) {
                    if (var13 > 0 && this.field7816[this.field7817[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field7816[this.field7817[var10 - this.field7821] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field7821 - 1 && this.field7816[this.field7817[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field7815 - 1 && this.field7816[this.field7817[this.field7821 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field7817 = var11;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "()V", line = 131)
    public final void method3121() {
        byte[] var1 = this.field7817;
        if (this.field7813 == null) {
            for (int var2 = this.field7815 - 1; var2 >= 0; var2--) {
                int var3 = this.field7821 * var2;
                int var4 = (var2 + 1) * this.field7821;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field7813;
            for (int var7 = this.field7815 - 1; var7 >= 0; var7--) {
                int var9 = this.field7821 * var7;
                int var10 = (var7 + 1) * this.field7821;
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
        int var8 = this.field7814;
        this.field7814 = this.field7818;
        this.field7818 = var8;
    }

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "()I", line = 192)
    public final int method3122() {
        return this.field7821 + this.field7814 + this.field7818;
    }

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "()V", line = 196)
    public final void method3123() {
        byte[] var1 = new byte[this.field7821 * this.field7815];
        int var2 = 0;
        if (this.field7813 == null) {
            for (int var3 = 0; var3 < this.field7821; var3++) {
                for (int var4 = this.field7815 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field7817[this.field7821 * var4 + var3];
                }
            }
            this.field7817 = var1;
        } else {
            byte[] var5 = new byte[this.field7821 * this.field7815];
            for (int var6 = 0; var6 < this.field7821; var6++) {
                for (int var9 = this.field7815 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field7817[this.field7821 * var9 + var6];
                    var5[var2++] = this.field7813[this.field7821 * var9 + var6];
                }
            }
            this.field7817 = var1;
            this.field7813 = var5;
        }
        int var7 = this.field7820;
        this.field7820 = this.field7814;
        this.field7814 = this.field7819;
        this.field7819 = this.field7818;
        this.field7818 = this.field7820;
        int var8 = this.field7815;
        this.field7815 = this.field7821;
        this.field7821 = var8;
    }

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "()V", line = 258)
    public final void method3124() {
        byte[] var1 = this.field7817;
        if (this.field7813 == null) {
            for (int var2 = (this.field7815 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field7821 * var2;
                int var4 = (this.field7815 - var2 - 1) * this.field7821;
                for (int var5 = -this.field7821; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field7813;
            for (int var8 = (this.field7815 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field7821 * var8;
                int var11 = (this.field7815 - var8 - 1) * this.field7821;
                for (int var12 = -this.field7821; var12 < 0; var12++) {
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
        int var9 = this.field7820;
        this.field7820 = this.field7819;
        this.field7819 = var9;
    }

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "(I)V", line = 331)
    public final void method3125(int arg0) {
        int var2 = this.method3122();
        int var3 = this.method3130();
        if (this.field7821 == var2 && this.field7815 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field7814) {
            var4 = this.field7814;
        }
        int var5 = arg0;
        if (this.field7814 + arg0 + this.field7821 > var2) {
            var5 = var2 - this.field7814 - this.field7821;
        }
        int var6 = arg0;
        if (arg0 > this.field7820) {
            var6 = this.field7820;
        }
        int var7 = arg0;
        if (this.field7820 + arg0 + this.field7815 > var3) {
            var7 = var3 - this.field7820 - this.field7815;
        }
        int var8 = this.field7821 + var4 + var5;
        int var9 = this.field7815 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field7813 == null) {
            for (int var11 = 0; var11 < this.field7815; var11++) {
                int var12 = this.field7821 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field7821; var14++) {
                    var10[var13++] = this.field7817[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field7815; var16++) {
                int var17 = this.field7821 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field7821; var19++) {
                    var15[var18] = this.field7813[var17];
                    var10[var18++] = this.field7817[var17++];
                }
            }
            this.field7813 = var15;
        }
        this.field7814 -= var4;
        this.field7820 -= var6;
        this.field7818 -= var5;
        this.field7819 -= var7;
        this.field7821 = var8;
        this.field7815 = var9;
        this.field7817 = var10;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lvh;I)Lmp;", line = 427)
    public static final class531 method3126(class240 arg0, int arg1) {
        byte[] var2 = arg0.method1388(arg1, (byte) -52);
        return var2 == null ? null : method3133(var2)[0];
    }

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "()V", line = 436)
    public final void method3127() {
        int var1 = this.method3122();
        int var2 = this.method3130();
        if (this.field7821 == var1 && this.field7815 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field7813 == null) {
            for (int var9 = 0; var9 < this.field7815; var9++) {
                int var10 = this.field7821 * var9;
                int var11 = (this.field7820 + var9) * var1 + this.field7814;
                for (int var12 = 0; var12 < this.field7821; var12++) {
                    var3[var11++] = this.field7817[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field7815; var5++) {
                int var6 = this.field7821 * var5;
                int var7 = (this.field7820 + var5) * var1 + this.field7814;
                for (int var8 = 0; var8 < this.field7821; var8++) {
                    var3[var7] = this.field7817[var6];
                    var4[var7++] = this.field7813[var6++];
                }
            }
            this.field7813 = var4;
        }
        this.field7814 = this.field7818 = this.field7820 = this.field7819 = 0;
        this.field7821 = var1;
        this.field7815 = var2;
        this.field7817 = var3;
    }

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "(Lvh;I)[Lmp;", line = 505)
    public static final class531[] method3128(class240 arg0, int arg1) {
        byte[] var2 = arg0.method1388(arg1, (byte) -45);
        return var2 == null ? null : method3133(var2);
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lvh;II)[Lmp;", line = 514)
    public static final class531[] method3129(class240 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1411(true, arg2, arg1);
        return var3 == null ? null : method3133(var3);
    }

    @OriginalMember(owner = "client!mp", name = "f", descriptor = "()I", line = 521)
    public final int method3130() {
        return this.field7820 + this.field7815 + this.field7819;
    }

    @OriginalMember(owner = "client!mp", name = "g", descriptor = "()[I", line = 525)
    public final int[] method3131() {
        int var1 = this.method3122();
        int[] var2 = new int[var1 * this.method3130()];
        if (this.field7813 == null) {
            for (int var7 = 0; var7 < this.field7815; var7++) {
                int var8 = this.field7821 * var7;
                int var9 = (this.field7820 + var7) * var1 + this.field7814;
                for (int var10 = 0; var10 < this.field7821; var10++) {
                    int var11 = this.field7816[this.field7817[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field7815; var3++) {
                int var4 = this.field7821 * var3;
                int var5 = (this.field7820 + var3) * var1 + this.field7814;
                for (int var6 = 0; var6 < this.field7821; var6++) {
                    var2[var5++] = this.field7813[var4] << 24 | this.field7816[this.field7817[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "(I)V", line = 592)
    public final void method3132(int arg0) {
        int var2 = -1;
        if (this.field7816.length < 255) {
            for (int var3 = 0; var3 < this.field7816.length; var3++) {
                if (this.field7816[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field7816.length;
                int[] var4 = new int[this.field7816.length + 1];
                class416.method2487(this.field7816, 0, var4, 0, this.field7816.length);
                this.field7816 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field7816.length; var9++) {
                int var13 = this.field7816[var9];
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
        for (int var10 = this.field7815 - 1; var10 > 0; var10--) {
            int var11 = this.field7821 * var10;
            for (int var12 = this.field7821 - 1; var12 > 0; var12--) {
                if (this.field7816[this.field7817[var11 + var12] & 0xFF] == 0 && this.field7816[this.field7817[var11 + var12 - this.field7821 - 1] & 0xFF] != 0) {
                    this.field7817[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "([B)[Lmp;", line = 695)
    private static final class531[] method3133(byte[] arg0) {
        class365 var1 = new class365(arg0);
        var1.field5069 = arg0.length - 2;
        int var2 = var1.method2062((byte) 14);
        class531[] var3 = new class531[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class531();
        }
        var1.field5069 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method2062((byte) 14);
        int var6 = var1.method2062((byte) 14);
        int var7 = (var1.method2099(255) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field7814 = var1.method2062((byte) 14);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field7820 = var1.method2062((byte) 14);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field7821 = var1.method2062((byte) 14);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field7815 = var1.method2062((byte) 14);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class531 var32 = var3[var12];
            var32.field7818 = var5 - var32.field7821 - var32.field7814;
            var32.field7819 = var6 - var32.field7815 - var32.field7820;
        }
        var1.field5069 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method2111(-2);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field7816 = var13;
        }
        var1.field5069 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class531 var17 = var3[var16];
            int var18 = var17.field7821 * var17.field7815;
            var17.field7817 = new byte[var18];
            int var19 = var1.method2099(255);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field7813 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field7817[var24] = var1.method2081((byte) -95);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field7813[var25] = var1.method2081((byte) -114);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field7821; var27++) {
                        for (int var31 = 0; var31 < var17.field7815; var31++) {
                            var17.field7817[var17.field7821 * var31 + var27] = var1.method2081((byte) -103);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field7821; var28++) {
                        for (int var29 = 0; var29 < var17.field7815; var29++) {
                            byte var30 = var17.field7813[var17.field7821 * var29 + var28] = var1.method2081((byte) 120);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field7813 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field7817[var20] = var1.method2081((byte) -60);
                }
            } else {
                for (int var21 = 0; var21 < var17.field7821; var21++) {
                    for (int var22 = 0; var22 < var17.field7815; var22++) {
                        var17.field7817[var17.field7821 * var22 + var21] = var1.method2081((byte) 106);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "(Lvh;II)Lmp;", line = 902)
    public static final class531 method3134(class240 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1411(true, arg2, arg1);
        return var3 == null ? null : method3133(var3)[0];
    }
}
