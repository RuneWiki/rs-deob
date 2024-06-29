import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class218 {

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public int field3139;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public int field3140;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public int field3142;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
    public int field3143;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
    public int field3146;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    public int field3147;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "[B")
    public byte[] field3141;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "[B")
    public byte[] field3145;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "[I")
    public int[] field3144;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V", line = 8)
    public final void method1484(int arg0) {
        int var2 = -1;
        if (this.field3144.length < 255) {
            for (int var3 = 0; var3 < this.field3144.length; var3++) {
                if (this.field3144[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field3144.length;
                int[] var4 = new int[this.field3144.length + 1];
                class201.method1413(this.field3144, 0, var4, 0, this.field3144.length);
                this.field3144 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field3144.length; var9++) {
                int var13 = this.field3144[var9];
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
        for (int var10 = this.field3139 - 1; var10 > 0; var10--) {
            int var11 = this.field3140 * var10;
            for (int var12 = this.field3140 - 1; var12 > 0; var12--) {
                if (this.field3144[this.field3141[var11 + var12] & 0xFF] == 0 && this.field3144[this.field3141[var11 + var12 - this.field3140 - 1] & 0xFF] != 0) {
                    this.field3141[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "([B)[Lbb;", line = 114)
    private static final class218[] method1485(byte[] arg0) {
        class65 var1 = new class65(arg0);
        var1.field827 = arg0.length - 2;
        int var2 = var1.method623((byte) 87);
        class218[] var3 = new class218[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class218();
        }
        var1.field827 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method623((byte) -99);
        int var6 = var1.method623((byte) 96);
        int var7 = (var1.method577(255) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field3142 = var1.method623((byte) 119);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field3146 = var1.method623((byte) 118);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field3140 = var1.method623((byte) 102);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field3139 = var1.method623((byte) 90);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class218 var32 = var3[var12];
            var32.field3143 = var5 - var32.field3140 - var32.field3142;
            var32.field3147 = var6 - var32.field3139 - var32.field3146;
        }
        var1.field827 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method580((byte) 29);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field3144 = var13;
        }
        var1.field827 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class218 var17 = var3[var16];
            int var18 = var17.field3140 * var17.field3139;
            var17.field3141 = new byte[var18];
            int var19 = var1.method577(255);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field3145 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field3141[var24] = var1.method629(false);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field3145[var25] = var1.method629(false);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field3140; var27++) {
                        for (int var31 = 0; var31 < var17.field3139; var31++) {
                            var17.field3141[var17.field3140 * var31 + var27] = var1.method629(false);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field3140; var28++) {
                        for (int var29 = 0; var29 < var17.field3139; var29++) {
                            byte var30 = var17.field3145[var17.field3140 * var29 + var28] = var1.method629(false);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field3145 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field3141[var20] = var1.method629(false);
                }
            } else {
                for (int var21 = 0; var21 < var17.field3140; var21++) {
                    for (int var22 = 0; var22 < var17.field3139; var22++) {
                        var17.field3141[var17.field3140 * var22 + var21] = var1.method629(false);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "()V", line = 322)
    public final void method1486() {
        byte[] var1 = this.field3141;
        if (this.field3145 == null) {
            for (int var2 = this.field3139 - 1; var2 >= 0; var2--) {
                int var3 = this.field3140 * var2;
                int var4 = (var2 + 1) * this.field3140;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field3145;
            for (int var7 = this.field3139 - 1; var7 >= 0; var7--) {
                int var9 = this.field3140 * var7;
                int var10 = (var7 + 1) * this.field3140;
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
        int var8 = this.field3142;
        this.field3142 = this.field3143;
        this.field3143 = var8;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V", line = 385)
    public final void method1487(int arg0) {
        int var2 = -1;
        if (this.field3144.length < 255) {
            for (int var3 = 0; var3 < this.field3144.length; var3++) {
                if (this.field3144[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field3144.length;
                int[] var4 = new int[this.field3144.length + 1];
                class201.method1413(this.field3144, 0, var4, 0, this.field3144.length);
                this.field3144 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field3144.length; var9++) {
                int var15 = this.field3144[var9];
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
        byte[] var11 = new byte[this.field3140 * this.field3139];
        for (int var12 = 0; var12 < this.field3139; var12++) {
            for (int var13 = 0; var13 < this.field3140; var13++) {
                int var14 = this.field3141[var10] & 0xFF;
                if (this.field3144[var14] == 0) {
                    if (var13 > 0 && this.field3144[this.field3141[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field3144[this.field3141[var10 - this.field3140] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field3140 - 1 && this.field3144[this.field3141[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field3139 - 1 && this.field3144[this.field3141[this.field3140 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field3141 = var11;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lfs;II)Lbb;", line = 510)
    public static final class218 method1488(class387 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2363(arg2, arg1, 86);
        return var3 == null ? null : method1485(var3)[0];
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "()[I", line = 519)
    public final int[] method1489() {
        int var1 = this.method1494();
        int[] var2 = new int[var1 * this.method1495()];
        if (this.field3145 == null) {
            for (int var7 = 0; var7 < this.field3139; var7++) {
                int var8 = this.field3140 * var7;
                int var9 = (this.field3146 + var7) * var1 + this.field3142;
                for (int var10 = 0; var10 < this.field3140; var10++) {
                    int var11 = this.field3144[this.field3141[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field3139; var3++) {
                int var4 = this.field3140 * var3;
                int var5 = (this.field3146 + var3) * var1 + this.field3142;
                for (int var6 = 0; var6 < this.field3140; var6++) {
                    var2[var5++] = this.field3145[var4] << 24 | this.field3144[this.field3141[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "()V", line = 582)
    public final void method1490() {
        byte[] var1 = new byte[this.field3140 * this.field3139];
        int var2 = 0;
        if (this.field3145 == null) {
            for (int var3 = 0; var3 < this.field3140; var3++) {
                for (int var4 = this.field3139 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field3141[this.field3140 * var4 + var3];
                }
            }
            this.field3141 = var1;
        } else {
            byte[] var5 = new byte[this.field3140 * this.field3139];
            for (int var6 = 0; var6 < this.field3140; var6++) {
                for (int var9 = this.field3139 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field3141[this.field3140 * var9 + var6];
                    var5[var2++] = this.field3145[this.field3140 * var9 + var6];
                }
            }
            this.field3141 = var1;
            this.field3145 = var5;
        }
        int var7 = this.field3146;
        this.field3146 = this.field3142;
        this.field3142 = this.field3147;
        this.field3147 = this.field3143;
        this.field3143 = this.field3146;
        int var8 = this.field3139;
        this.field3139 = this.field3140;
        this.field3140 = var8;
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "()V", line = 643)
    public final void method1491() {
        byte[] var1 = this.field3141;
        if (this.field3145 == null) {
            for (int var2 = (this.field3139 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field3140 * var2;
                int var4 = (this.field3139 - var2 - 1) * this.field3140;
                for (int var5 = -this.field3140; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field3145;
            for (int var8 = (this.field3139 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field3140 * var8;
                int var11 = (this.field3139 - var8 - 1) * this.field3140;
                for (int var12 = -this.field3140; var12 < 0; var12++) {
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
        int var9 = this.field3146;
        this.field3146 = this.field3147;
        this.field3147 = var9;
    }

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "()V", line = 715)
    public final void method1492() {
        int var1 = this.method1494();
        int var2 = this.method1495();
        if (this.field3140 == var1 && this.field3139 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field3145 == null) {
            for (int var9 = 0; var9 < this.field3139; var9++) {
                int var10 = this.field3140 * var9;
                int var11 = (this.field3146 + var9) * var1 + this.field3142;
                for (int var12 = 0; var12 < this.field3140; var12++) {
                    var3[var11++] = this.field3141[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field3139; var5++) {
                int var6 = this.field3140 * var5;
                int var7 = (this.field3146 + var5) * var1 + this.field3142;
                for (int var8 = 0; var8 < this.field3140; var8++) {
                    var3[var7] = this.field3141[var6];
                    var4[var7++] = this.field3145[var6++];
                }
            }
            this.field3145 = var4;
        }
        this.field3142 = this.field3143 = this.field3146 = this.field3147 = 0;
        this.field3140 = var1;
        this.field3139 = var2;
        this.field3141 = var3;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lfs;I)[Lbb;", line = 783)
    public static final class218[] method1493(class387 arg0, int arg1) {
        byte[] var2 = arg0.method2381(arg1, -1);
        return var2 == null ? null : method1485(var2);
    }

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "()I", line = 792)
    public final int method1494() {
        return this.field3142 + this.field3140 + this.field3143;
    }

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "()I", line = 795)
    public final int method1495() {
        return this.field3146 + this.field3139 + this.field3147;
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V", line = 799)
    public final void method1496(int arg0) {
        int var2 = this.method1494();
        int var3 = this.method1495();
        if (this.field3140 == var2 && this.field3139 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field3142) {
            var4 = this.field3142;
        }
        int var5 = arg0;
        if (this.field3142 + arg0 + this.field3140 > var2) {
            var5 = var2 - this.field3142 - this.field3140;
        }
        int var6 = arg0;
        if (arg0 > this.field3146) {
            var6 = this.field3146;
        }
        int var7 = arg0;
        if (this.field3146 + arg0 + this.field3139 > var3) {
            var7 = var3 - this.field3146 - this.field3139;
        }
        int var8 = this.field3140 + var4 + var5;
        int var9 = this.field3139 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field3145 == null) {
            for (int var11 = 0; var11 < this.field3139; var11++) {
                int var12 = this.field3140 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field3140; var14++) {
                    var10[var13++] = this.field3141[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field3139; var16++) {
                int var17 = this.field3140 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field3140; var19++) {
                    var15[var18] = this.field3145[var17];
                    var10[var18++] = this.field3141[var17++];
                }
            }
            this.field3145 = var15;
        }
        this.field3142 -= var4;
        this.field3146 -= var6;
        this.field3143 -= var5;
        this.field3147 -= var7;
        this.field3140 = var8;
        this.field3139 = var9;
        this.field3141 = var10;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(Lfs;II)[Lbb;", line = 894)
    public static final class218[] method1497(class387 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2363(arg2, arg1, 104);
        return var3 == null ? null : method1485(var3);
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(Lfs;I)Lbb;", line = 902)
    public static final class218 method1498(class387 arg0, int arg1) {
        byte[] var2 = arg0.method2381(arg1, -1);
        return var2 == null ? null : method1485(var2)[0];
    }
}
