import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class174 {

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public int field2774;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
    public int field2777;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    public int field2778;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public int field2780;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public int field2781;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public int field2782;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "[B")
    public byte[] field2776;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "[B")
    public byte[] field2779;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "[I")
    public int[] field2775;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lgda;I)[Luh;")
    public static final class174[] method1603(class58 arg0, int arg1) {
        byte[] var2 = arg0.method587(arg1, true);
        return var2 == null ? null : method1607(var2);
    }

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "()V")
    public final void method1604() {
        int var1 = this.method1610();
        int var2 = this.method1611();
        if (this.field2781 == var1 && this.field2782 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field2779 == null) {
            for (int var9 = 0; var9 < this.field2782; var9++) {
                int var10 = this.field2781 * var9;
                int var11 = (this.field2778 + var9) * var1 + this.field2774;
                for (int var12 = 0; var12 < this.field2781; var12++) {
                    var3[var11++] = this.field2776[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field2782; var5++) {
                int var6 = this.field2781 * var5;
                int var7 = (this.field2778 + var5) * var1 + this.field2774;
                for (int var8 = 0; var8 < this.field2781; var8++) {
                    var3[var7] = this.field2776[var6];
                    var4[var7++] = this.field2779[var6++];
                }
            }
            this.field2779 = var4;
        }
        this.field2774 = this.field2777 = this.field2778 = this.field2780 = 0;
        this.field2781 = var1;
        this.field2782 = var2;
        this.field2776 = var3;
    }

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "()[I")
    public final int[] method1605() {
        int var1 = this.method1610();
        int[] var2 = new int[var1 * this.method1611()];
        if (this.field2779 == null) {
            for (int var7 = 0; var7 < this.field2782; var7++) {
                int var8 = this.field2781 * var7;
                int var9 = (this.field2778 + var7) * var1 + this.field2774;
                for (int var10 = 0; var10 < this.field2781; var10++) {
                    int var11 = this.field2775[this.field2776[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field2782; var3++) {
                int var4 = this.field2781 * var3;
                int var5 = (this.field2778 + var3) * var1 + this.field2774;
                for (int var6 = 0; var6 < this.field2781; var6++) {
                    var2[var5++] = this.field2779[var4] << 24 | this.field2775[this.field2776[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "()V")
    public final void method1606() {
        byte[] var1 = this.field2776;
        if (this.field2779 == null) {
            for (int var2 = this.field2782 - 1; var2 >= 0; var2--) {
                int var3 = this.field2781 * var2;
                int var4 = (var2 + 1) * this.field2781;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field2779;
            for (int var7 = this.field2782 - 1; var7 >= 0; var7--) {
                int var9 = this.field2781 * var7;
                int var10 = (var7 + 1) * this.field2781;
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
        int var8 = this.field2774;
        this.field2774 = this.field2777;
        this.field2777 = var8;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "([B)[Luh;")
    private static final class174[] method1607(byte[] arg0) {
        class176 var1 = new class176(arg0);
        var1.field2799 = arg0.length - 2;
        int var2 = var1.method1687((byte) -95);
        class174[] var3 = new class174[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class174();
        }
        var1.field2799 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method1687((byte) -96);
        int var6 = var1.method1687((byte) -62);
        int var7 = (var1.method1645((byte) -108) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field2774 = var1.method1687((byte) -41);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field2778 = var1.method1687((byte) -40);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field2781 = var1.method1687((byte) -79);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field2782 = var1.method1687((byte) -43);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class174 var32 = var3[var12];
            var32.field2777 = var5 - var32.field2781 - var32.field2774;
            var32.field2780 = var6 - var32.field2782 - var32.field2778;
        }
        var1.field2799 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method1685(false);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field2775 = var13;
        }
        var1.field2799 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class174 var17 = var3[var16];
            int var18 = var17.field2782 * var17.field2781;
            var17.field2776 = new byte[var18];
            int var19 = var1.method1645((byte) -85);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field2779 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field2776[var24] = var1.method1672(-34);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field2779[var25] = var1.method1672(110);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field2781; var27++) {
                        for (int var31 = 0; var31 < var17.field2782; var31++) {
                            var17.field2776[var17.field2781 * var31 + var27] = var1.method1672(127);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field2781; var28++) {
                        for (int var29 = 0; var29 < var17.field2782; var29++) {
                            byte var30 = var17.field2779[var17.field2781 * var29 + var28] = var1.method1672(110);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field2779 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field2776[var20] = var1.method1672(119);
                }
            } else {
                for (int var21 = 0; var21 < var17.field2781; var21++) {
                    for (int var22 = 0; var22 < var17.field2782; var22++) {
                        var17.field2776[var17.field2781 * var22 + var21] = var1.method1672(-42);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lgda;II)Luh;")
    public static final class174 method1608(class58 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method604((byte) 33, arg2, arg1);
        return var3 == null ? null : method1607(var3)[0];
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(Lgda;I)Luh;")
    public static final class174 method1609(class58 arg0, int arg1) {
        byte[] var2 = arg0.method587(arg1, true);
        return var2 == null ? null : method1607(var2)[0];
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "()I")
    public final int method1610() {
        return this.field2781 + this.field2774 + this.field2777;
    }

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "()I")
    public final int method1611() {
        return this.field2782 + this.field2778 + this.field2780;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V")
    public final void method1612(int arg0) {
        int var2 = -1;
        if (this.field2775.length < 255) {
            for (int var3 = 0; var3 < this.field2775.length; var3++) {
                if (this.field2775[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field2775.length;
                int[] var4 = new int[this.field2775.length + 1];
                class405.method3262(this.field2775, 0, var4, 0, this.field2775.length);
                this.field2775 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field2775.length; var9++) {
                int var15 = this.field2775[var9];
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
        byte[] var11 = new byte[this.field2782 * this.field2781];
        for (int var12 = 0; var12 < this.field2782; var12++) {
            for (int var13 = 0; var13 < this.field2781; var13++) {
                int var14 = this.field2776[var10] & 0xFF;
                if (this.field2775[var14] == 0) {
                    if (var13 > 0 && this.field2775[this.field2776[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field2775[this.field2776[var10 - this.field2781] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field2781 - 1 && this.field2775[this.field2776[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field2782 - 1 && this.field2775[this.field2776[this.field2781 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field2776 = var11;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(Lgda;II)[Luh;")
    public static final class174[] method1613(class58 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method604((byte) 25, arg2, arg1);
        return var3 == null ? null : method1607(var3);
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "()V")
    public final void method1614() {
        byte[] var1 = this.field2776;
        if (this.field2779 == null) {
            for (int var2 = (this.field2782 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field2781 * var2;
                int var4 = (this.field2782 - var2 - 1) * this.field2781;
                for (int var5 = -this.field2781; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field2779;
            for (int var8 = (this.field2782 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field2781 * var8;
                int var11 = (this.field2782 - var8 - 1) * this.field2781;
                for (int var12 = -this.field2781; var12 < 0; var12++) {
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
        int var9 = this.field2778;
        this.field2778 = this.field2780;
        this.field2780 = var9;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
    public final void method1615(int arg0) {
        int var2 = -1;
        if (this.field2775.length < 255) {
            for (int var3 = 0; var3 < this.field2775.length; var3++) {
                if (this.field2775[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field2775.length;
                int[] var4 = new int[this.field2775.length + 1];
                class405.method3262(this.field2775, 0, var4, 0, this.field2775.length);
                this.field2775 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field2775.length; var9++) {
                int var13 = this.field2775[var9];
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
        for (int var10 = this.field2782 - 1; var10 > 0; var10--) {
            int var11 = this.field2781 * var10;
            for (int var12 = this.field2781 - 1; var12 > 0; var12--) {
                if (this.field2775[this.field2776[var11 + var12] & 0xFF] == 0 && this.field2775[this.field2776[var11 + var12 - this.field2781 - 1] & 0xFF] != 0) {
                    this.field2776[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "()V")
    public final void method1616() {
        byte[] var1 = new byte[this.field2782 * this.field2781];
        int var2 = 0;
        if (this.field2779 == null) {
            for (int var3 = 0; var3 < this.field2781; var3++) {
                for (int var4 = this.field2782 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field2776[this.field2781 * var4 + var3];
                }
            }
            this.field2776 = var1;
        } else {
            byte[] var5 = new byte[this.field2782 * this.field2781];
            for (int var6 = 0; var6 < this.field2781; var6++) {
                for (int var9 = this.field2782 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field2776[this.field2781 * var9 + var6];
                    var5[var2++] = this.field2779[this.field2781 * var9 + var6];
                }
            }
            this.field2776 = var1;
            this.field2779 = var5;
        }
        int var7 = this.field2778;
        this.field2778 = this.field2774;
        this.field2774 = this.field2780;
        this.field2780 = this.field2777;
        this.field2777 = this.field2778;
        int var8 = this.field2782;
        this.field2782 = this.field2781;
        this.field2781 = var8;
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(I)V")
    public final void method1617(int arg0) {
        int var2 = this.method1610();
        int var3 = this.method1611();
        if (this.field2781 == var2 && this.field2782 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field2774) {
            var4 = this.field2774;
        }
        int var5 = arg0;
        if (this.field2774 + arg0 + this.field2781 > var2) {
            var5 = var2 - this.field2774 - this.field2781;
        }
        int var6 = arg0;
        if (arg0 > this.field2778) {
            var6 = this.field2778;
        }
        int var7 = arg0;
        if (this.field2778 + arg0 + this.field2782 > var3) {
            var7 = var3 - this.field2778 - this.field2782;
        }
        int var8 = this.field2781 + var4 + var5;
        int var9 = this.field2782 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field2779 == null) {
            for (int var11 = 0; var11 < this.field2782; var11++) {
                int var12 = this.field2781 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field2781; var14++) {
                    var10[var13++] = this.field2776[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field2782; var16++) {
                int var17 = this.field2781 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field2781; var19++) {
                    var15[var18] = this.field2779[var17];
                    var10[var18++] = this.field2776[var17++];
                }
            }
            this.field2779 = var15;
        }
        this.field2774 -= var4;
        this.field2778 -= var6;
        this.field2777 -= var5;
        this.field2780 -= var7;
        this.field2781 = var8;
        this.field2782 = var9;
        this.field2776 = var10;
    }
}
