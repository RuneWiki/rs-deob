import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public class class204 {

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "I")
    public int field2657;

    @OriginalMember(owner = "client!dga", name = "c", descriptor = "I")
    public int field2658;

    @OriginalMember(owner = "client!dga", name = "d", descriptor = "I")
    public int field2659;

    @OriginalMember(owner = "client!dga", name = "g", descriptor = "I")
    public int field2662;

    @OriginalMember(owner = "client!dga", name = "h", descriptor = "I")
    public int field2663;

    @OriginalMember(owner = "client!dga", name = "i", descriptor = "I")
    public int field2664;

    @OriginalMember(owner = "client!dga", name = "e", descriptor = "[B")
    public byte[] field2660;

    @OriginalMember(owner = "client!dga", name = "f", descriptor = "[B")
    public byte[] field2661;

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "[I")
    public int[] field2656;

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lfp;II)[Ldga;", line = 6)
    public static final class204[] method1235(class323 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2100(arg2, (byte) 112, arg1);
        return var3 == null ? null : method1243(var3);
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lfp;I)[Ldga;", line = 17)
    public static final class204[] method1236(class323 arg0, int arg1) {
        byte[] var2 = arg0.method2108(arg1, 0);
        return var2 == null ? null : method1243(var2);
    }

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "(Lfp;II)Ldga;", line = 28)
    public static final class204 method1237(class323 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2100(arg2, (byte) 112, arg1);
        return var3 == null ? null : method1243(var3)[0];
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "()V", line = 36)
    public final void method1238() {
        byte[] var1 = new byte[this.field2664 * this.field2657];
        int var2 = 0;
        if (this.field2660 == null) {
            for (int var3 = 0; var3 < this.field2657; var3++) {
                for (int var4 = this.field2664 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field2661[this.field2657 * var4 + var3];
                }
            }
            this.field2661 = var1;
        } else {
            byte[] var5 = new byte[this.field2664 * this.field2657];
            for (int var6 = 0; var6 < this.field2657; var6++) {
                for (int var9 = this.field2664 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field2661[this.field2657 * var9 + var6];
                    var5[var2++] = this.field2660[this.field2657 * var9 + var6];
                }
            }
            this.field2661 = var1;
            this.field2660 = var5;
        }
        int var7 = this.field2659;
        this.field2659 = this.field2662;
        this.field2662 = this.field2663;
        this.field2663 = this.field2658;
        this.field2658 = this.field2659;
        int var8 = this.field2664;
        this.field2664 = this.field2657;
        this.field2657 = var8;
    }

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "()V", line = 97)
    public final void method1239() {
        byte[] var1 = this.field2661;
        if (this.field2660 == null) {
            for (int var2 = this.field2664 - 1; var2 >= 0; var2--) {
                int var3 = this.field2657 * var2;
                int var4 = (var2 + 1) * this.field2657;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field2660;
            for (int var7 = this.field2664 - 1; var7 >= 0; var7--) {
                int var9 = this.field2657 * var7;
                int var10 = (var7 + 1) * this.field2657;
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
        int var8 = this.field2662;
        this.field2662 = this.field2658;
        this.field2658 = var8;
    }

    @OriginalMember(owner = "client!dga", name = "c", descriptor = "()V", line = 160)
    public final void method1240() {
        byte[] var1 = this.field2661;
        if (this.field2660 == null) {
            for (int var2 = (this.field2664 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field2657 * var2;
                int var4 = (this.field2664 - var2 - 1) * this.field2657;
                for (int var5 = -this.field2657; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field2660;
            for (int var8 = (this.field2664 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field2657 * var8;
                int var11 = (this.field2664 - var8 - 1) * this.field2657;
                for (int var12 = -this.field2657; var12 < 0; var12++) {
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
        int var9 = this.field2659;
        this.field2659 = this.field2663;
        this.field2663 = var9;
    }

    @OriginalMember(owner = "client!dga", name = "d", descriptor = "()I", line = 231)
    public final int method1241() {
        return this.field2664 + this.field2659 + this.field2663;
    }

    @OriginalMember(owner = "client!dga", name = "e", descriptor = "()I", line = 235)
    public final int method1242() {
        return this.field2662 + this.field2657 + this.field2658;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "([B)[Ldga;", line = 239)
    private static final class204[] method1243(byte[] arg0) {
        class675 var1 = new class675(arg0);
        var1.field9146 = arg0.length - 2;
        int var2 = var1.method3757((byte) -65);
        class204[] var3 = new class204[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class204();
        }
        var1.field9146 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method3757((byte) -65);
        int var6 = var1.method3757((byte) -65);
        int var7 = (var1.method3750((byte) 35) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field2662 = var1.method3757((byte) -65);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field2659 = var1.method3757((byte) -65);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field2657 = var1.method3757((byte) -65);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field2664 = var1.method3757((byte) -65);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class204 var32 = var3[var12];
            var32.field2658 = var5 - var32.field2657 - var32.field2662;
            var32.field2663 = var6 - var32.field2664 - var32.field2659;
        }
        var1.field9146 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method3756(false);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field2656 = var13;
        }
        var1.field9146 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class204 var17 = var3[var16];
            int var18 = var17.field2664 * var17.field2657;
            var17.field2661 = new byte[var18];
            int var19 = var1.method3750((byte) 35);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field2660 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field2661[var24] = var1.method3719(1854307120);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field2660[var25] = var1.method3719(1854307120);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field2657; var27++) {
                        for (int var31 = 0; var31 < var17.field2664; var31++) {
                            var17.field2661[var17.field2657 * var31 + var27] = var1.method3719(1854307120);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field2657; var28++) {
                        for (int var29 = 0; var29 < var17.field2664; var29++) {
                            byte var30 = var17.field2660[var17.field2657 * var29 + var28] = var1.method3719(1854307120);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field2660 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field2661[var20] = var1.method3719(1854307120);
                }
            } else {
                for (int var21 = 0; var21 < var17.field2657; var21++) {
                    for (int var22 = 0; var22 < var17.field2664; var22++) {
                        var17.field2661[var17.field2657 * var22 + var21] = var1.method3719(1854307120);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dga", name = "f", descriptor = "()[I", line = 447)
    public final int[] method1244() {
        int var1 = this.method1242();
        int[] var2 = new int[var1 * this.method1241()];
        if (this.field2660 == null) {
            for (int var7 = 0; var7 < this.field2664; var7++) {
                int var8 = this.field2657 * var7;
                int var9 = (this.field2659 + var7) * var1 + this.field2662;
                for (int var10 = 0; var10 < this.field2657; var10++) {
                    int var11 = this.field2656[this.field2661[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field2664; var3++) {
                int var4 = this.field2657 * var3;
                int var5 = (this.field2659 + var3) * var1 + this.field2662;
                for (int var6 = 0; var6 < this.field2657; var6++) {
                    var2[var5++] = this.field2660[var4] << 24 | this.field2656[this.field2661[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(I)V", line = 510)
    public final void method1245(int arg0) {
        int var2 = this.method1242();
        int var3 = this.method1241();
        if (this.field2657 == var2 && this.field2664 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field2662) {
            var4 = this.field2662;
        }
        int var5 = arg0;
        if (this.field2662 + arg0 + this.field2657 > var2) {
            var5 = var2 - this.field2662 - this.field2657;
        }
        int var6 = arg0;
        if (arg0 > this.field2659) {
            var6 = this.field2659;
        }
        int var7 = arg0;
        if (this.field2659 + arg0 + this.field2664 > var3) {
            var7 = var3 - this.field2659 - this.field2664;
        }
        int var8 = this.field2657 + var4 + var5;
        int var9 = this.field2664 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field2660 == null) {
            for (int var11 = 0; var11 < this.field2664; var11++) {
                int var12 = this.field2657 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field2657; var14++) {
                    var10[var13++] = this.field2661[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field2664; var16++) {
                int var17 = this.field2657 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field2657; var19++) {
                    var15[var18] = this.field2660[var17];
                    var10[var18++] = this.field2661[var17++];
                }
            }
            this.field2660 = var15;
        }
        this.field2662 -= var4;
        this.field2659 -= var6;
        this.field2658 -= var5;
        this.field2663 -= var7;
        this.field2657 = var8;
        this.field2664 = var9;
        this.field2661 = var10;
    }

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "(I)V", line = 606)
    public final void method1246(int arg0) {
        int var2 = -1;
        if (this.field2656.length < 255) {
            for (int var3 = 0; var3 < this.field2656.length; var3++) {
                if (this.field2656[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field2656.length;
                int[] var4 = new int[this.field2656.length + 1];
                class255.method1688(this.field2656, 0, var4, 0, this.field2656.length);
                this.field2656 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field2656.length; var9++) {
                int var15 = this.field2656[var9];
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
        byte[] var11 = new byte[this.field2664 * this.field2657];
        for (int var12 = 0; var12 < this.field2664; var12++) {
            for (int var13 = 0; var13 < this.field2657; var13++) {
                int var14 = this.field2661[var10] & 0xFF;
                if (this.field2656[var14] == 0) {
                    if (var13 > 0 && this.field2656[this.field2661[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field2656[this.field2661[var10 - this.field2657] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field2657 - 1 && this.field2656[this.field2661[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field2664 - 1 && this.field2656[this.field2661[this.field2657 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field2661 = var11;
    }

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "(Lfp;I)Ldga;", line = 731)
    public static final class204 method1247(class323 arg0, int arg1) {
        byte[] var2 = arg0.method2108(arg1, 0);
        return var2 == null ? null : method1243(var2)[0];
    }

    @OriginalMember(owner = "client!dga", name = "g", descriptor = "()V", line = 739)
    public final void method1248() {
        int var1 = this.method1242();
        int var2 = this.method1241();
        if (this.field2657 == var1 && this.field2664 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field2660 == null) {
            for (int var9 = 0; var9 < this.field2664; var9++) {
                int var10 = this.field2657 * var9;
                int var11 = (this.field2659 + var9) * var1 + this.field2662;
                for (int var12 = 0; var12 < this.field2657; var12++) {
                    var3[var11++] = this.field2661[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field2664; var5++) {
                int var6 = this.field2657 * var5;
                int var7 = (this.field2659 + var5) * var1 + this.field2662;
                for (int var8 = 0; var8 < this.field2657; var8++) {
                    var3[var7] = this.field2661[var6];
                    var4[var7++] = this.field2660[var6++];
                }
            }
            this.field2660 = var4;
        }
        this.field2662 = this.field2658 = this.field2659 = this.field2663 = 0;
        this.field2657 = var1;
        this.field2664 = var2;
        this.field2661 = var3;
    }

    @OriginalMember(owner = "client!dga", name = "c", descriptor = "(I)V", line = 807)
    public final void method1249(int arg0) {
        int var2 = -1;
        if (this.field2656.length < 255) {
            for (int var3 = 0; var3 < this.field2656.length; var3++) {
                if (this.field2656[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field2656.length;
                int[] var4 = new int[this.field2656.length + 1];
                class255.method1688(this.field2656, 0, var4, 0, this.field2656.length);
                this.field2656 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field2656.length; var9++) {
                int var13 = this.field2656[var9];
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
        for (int var10 = this.field2664 - 1; var10 > 0; var10--) {
            int var11 = this.field2657 * var10;
            for (int var12 = this.field2657 - 1; var12 > 0; var12--) {
                if (this.field2656[this.field2661[var11 + var12] & 0xFF] == 0 && this.field2656[this.field2661[var11 + var12 - this.field2657 - 1] & 0xFF] != 0) {
                    this.field2661[var11 + var12] = (byte) var2;
                }
            }
        }
    }
}
