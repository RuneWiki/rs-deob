import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class92 {

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "I")
    public int field1125;

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "I")
    public int field1126;

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "I")
    public int field1128;

    @OriginalMember(owner = "client!tq", name = "g", descriptor = "I")
    public int field1131;

    @OriginalMember(owner = "client!tq", name = "h", descriptor = "I")
    public int field1132;

    @OriginalMember(owner = "client!tq", name = "i", descriptor = "I")
    public int field1133;

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "[B")
    public byte[] field1129;

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "[B")
    public byte[] field1130;

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "[I")
    public int[] field1127;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lga;II)Ltq;", line = 7)
    public static final class92 method506(class332 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1938(arg2, arg1, -17);
        return var3 == null ? null : method509(var3)[0];
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "()I", line = 14)
    public final int method507() {
        return this.field1132 + this.field1125 + this.field1131;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lga;I)Ltq;", line = 20)
    public static final class92 method508(class332 arg0, int arg1) {
        byte[] var2 = arg0.method1946(0, arg1);
        return var2 == null ? null : method509(var2)[0];
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "([B)[Ltq;", line = 29)
    private static final class92[] method509(byte[] arg0) {
        class157 var1 = new class157(arg0);
        var1.field2219 = arg0.length - 2;
        int var2 = var1.method963(-125);
        class92[] var3 = new class92[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class92();
        }
        var1.field2219 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method963(-127);
        int var6 = var1.method963(-120);
        int var7 = (var1.method930(255) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field1125 = var1.method963(-120);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field1126 = var1.method963(-119);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field1132 = var1.method963(-120);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field1128 = var1.method963(-124);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class92 var32 = var3[var12];
            var32.field1131 = var5 - var32.field1132 - var32.field1125;
            var32.field1133 = var6 - var32.field1128 - var32.field1126;
        }
        var1.field2219 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method933((byte) 1);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field1127 = var13;
        }
        var1.field2219 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class92 var17 = var3[var16];
            int var18 = var17.field1132 * var17.field1128;
            var17.field1130 = new byte[var18];
            int var19 = var1.method930(255);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field1129 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field1130[var24] = var1.method969(3);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field1129[var25] = var1.method969(3);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field1132; var27++) {
                        for (int var31 = 0; var31 < var17.field1128; var31++) {
                            var17.field1130[var17.field1132 * var31 + var27] = var1.method969(3);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field1132; var28++) {
                        for (int var29 = 0; var29 < var17.field1128; var29++) {
                            byte var30 = var17.field1129[var17.field1132 * var29 + var28] = var1.method969(3);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field1129 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field1130[var20] = var1.method969(3);
                }
            } else {
                for (int var21 = 0; var21 < var17.field1132; var21++) {
                    for (int var22 = 0; var22 < var17.field1128; var22++) {
                        var17.field1130[var17.field1132 * var22 + var21] = var1.method969(3);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "()V", line = 236)
    public final void method510() {
        byte[] var1 = new byte[this.field1132 * this.field1128];
        int var2 = 0;
        if (this.field1129 == null) {
            for (int var3 = 0; var3 < this.field1132; var3++) {
                for (int var4 = this.field1128 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field1130[this.field1132 * var4 + var3];
                }
            }
            this.field1130 = var1;
        } else {
            byte[] var5 = new byte[this.field1132 * this.field1128];
            for (int var6 = 0; var6 < this.field1132; var6++) {
                for (int var9 = this.field1128 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field1130[this.field1132 * var9 + var6];
                    var5[var2++] = this.field1129[this.field1132 * var9 + var6];
                }
            }
            this.field1130 = var1;
            this.field1129 = var5;
        }
        int var7 = this.field1126;
        this.field1126 = this.field1125;
        this.field1125 = this.field1133;
        this.field1133 = this.field1131;
        this.field1131 = this.field1126;
        int var8 = this.field1128;
        this.field1128 = this.field1132;
        this.field1132 = var8;
    }

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "()V", line = 298)
    public final void method511() {
        byte[] var1 = this.field1130;
        if (this.field1129 == null) {
            for (int var2 = (this.field1128 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field1132 * var2;
                int var4 = (this.field1128 - var2 - 1) * this.field1132;
                for (int var5 = -this.field1132; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field1129;
            for (int var8 = (this.field1128 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field1132 * var8;
                int var11 = (this.field1128 - var8 - 1) * this.field1132;
                for (int var12 = -this.field1132; var12 < 0; var12++) {
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
        int var9 = this.field1126;
        this.field1126 = this.field1133;
        this.field1133 = var9;
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(Lga;II)[Ltq;", line = 368)
    public static final class92[] method512(class332 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1938(arg2, arg1, -17);
        return var3 == null ? null : method509(var3);
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(Lga;I)[Ltq;", line = 378)
    public static final class92[] method513(class332 arg0, int arg1) {
        byte[] var2 = arg0.method1946(0, arg1);
        return var2 == null ? null : method509(var2);
    }

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "()I", line = 385)
    public final int method514() {
        return this.field1128 + this.field1126 + this.field1133;
    }

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "()V", line = 390)
    public final void method515() {
        byte[] var1 = this.field1130;
        if (this.field1129 == null) {
            for (int var2 = this.field1128 - 1; var2 >= 0; var2--) {
                int var3 = this.field1132 * var2;
                int var4 = (var2 + 1) * this.field1132;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field1129;
            for (int var7 = this.field1128 - 1; var7 >= 0; var7--) {
                int var9 = this.field1132 * var7;
                int var10 = (var7 + 1) * this.field1132;
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
        int var8 = this.field1125;
        this.field1125 = this.field1131;
        this.field1131 = var8;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V", line = 454)
    public final void method516(int arg0) {
        int var2 = -1;
        if (this.field1127.length < 255) {
            for (int var3 = 0; var3 < this.field1127.length; var3++) {
                if (this.field1127[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field1127.length;
                int[] var4 = new int[this.field1127.length + 1];
                class2.method10(this.field1127, 0, var4, 0, this.field1127.length);
                this.field1127 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field1127.length; var9++) {
                int var15 = this.field1127[var9];
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
        byte[] var11 = new byte[this.field1132 * this.field1128];
        for (int var12 = 0; var12 < this.field1128; var12++) {
            for (int var13 = 0; var13 < this.field1132; var13++) {
                int var14 = this.field1130[var10] & 0xFF;
                if (this.field1127[var14] == 0) {
                    if (var13 > 0 && this.field1127[this.field1130[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field1127[this.field1130[var10 - this.field1132] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field1132 - 1 && this.field1127[this.field1130[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field1128 - 1 && this.field1127[this.field1130[this.field1132 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field1130 = var11;
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(I)V", line = 581)
    public final void method517(int arg0) {
        int var2 = -1;
        if (this.field1127.length < 255) {
            for (int var3 = 0; var3 < this.field1127.length; var3++) {
                if (this.field1127[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field1127.length;
                int[] var4 = new int[this.field1127.length + 1];
                class2.method10(this.field1127, 0, var4, 0, this.field1127.length);
                this.field1127 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field1127.length; var9++) {
                int var13 = this.field1127[var9];
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
        for (int var10 = this.field1128 - 1; var10 > 0; var10--) {
            int var11 = this.field1132 * var10;
            for (int var12 = this.field1132 - 1; var12 > 0; var12--) {
                if (this.field1127[this.field1130[var11 + var12] & 0xFF] == 0 && this.field1127[this.field1130[var11 + var12 - this.field1132 - 1] & 0xFF] != 0) {
                    this.field1130[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "(I)V", line = 685)
    public final void method518(int arg0) {
        int var2 = this.method507();
        int var3 = this.method514();
        if (this.field1132 == var2 && this.field1128 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field1125) {
            var4 = this.field1125;
        }
        int var5 = arg0;
        if (this.field1125 + arg0 + this.field1132 > var2) {
            var5 = var2 - this.field1125 - this.field1132;
        }
        int var6 = arg0;
        if (arg0 > this.field1126) {
            var6 = this.field1126;
        }
        int var7 = arg0;
        if (this.field1126 + arg0 + this.field1128 > var3) {
            var7 = var3 - this.field1126 - this.field1128;
        }
        int var8 = this.field1132 + var4 + var5;
        int var9 = this.field1128 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field1129 == null) {
            for (int var11 = 0; var11 < this.field1128; var11++) {
                int var12 = this.field1132 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field1132; var14++) {
                    var10[var13++] = this.field1130[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field1128; var16++) {
                int var17 = this.field1132 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field1132; var19++) {
                    var15[var18] = this.field1129[var17];
                    var10[var18++] = this.field1130[var17++];
                }
            }
            this.field1129 = var15;
        }
        this.field1125 -= var4;
        this.field1126 -= var6;
        this.field1131 -= var5;
        this.field1133 -= var7;
        this.field1132 = var8;
        this.field1128 = var9;
        this.field1130 = var10;
    }

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "()[I", line = 782)
    public final int[] method519() {
        int var1 = this.method507();
        int[] var2 = new int[var1 * this.method514()];
        if (this.field1129 == null) {
            for (int var7 = 0; var7 < this.field1128; var7++) {
                int var8 = this.field1132 * var7;
                int var9 = (this.field1126 + var7) * var1 + this.field1125;
                for (int var10 = 0; var10 < this.field1132; var10++) {
                    int var11 = this.field1127[this.field1130[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field1128; var3++) {
                int var4 = this.field1132 * var3;
                int var5 = (this.field1126 + var3) * var1 + this.field1125;
                for (int var6 = 0; var6 < this.field1132; var6++) {
                    var2[var5++] = this.field1129[var4] << 24 | this.field1127[this.field1130[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!tq", name = "g", descriptor = "()V", line = 845)
    public final void method520() {
        int var1 = this.method507();
        int var2 = this.method514();
        if (this.field1132 == var1 && this.field1128 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field1129 == null) {
            for (int var9 = 0; var9 < this.field1128; var9++) {
                int var10 = this.field1132 * var9;
                int var11 = (this.field1126 + var9) * var1 + this.field1125;
                for (int var12 = 0; var12 < this.field1132; var12++) {
                    var3[var11++] = this.field1130[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field1128; var5++) {
                int var6 = this.field1132 * var5;
                int var7 = (this.field1126 + var5) * var1 + this.field1125;
                for (int var8 = 0; var8 < this.field1132; var8++) {
                    var3[var7] = this.field1130[var6];
                    var4[var7++] = this.field1129[var6++];
                }
            }
            this.field1129 = var4;
        }
        this.field1125 = this.field1131 = this.field1126 = this.field1133 = 0;
        this.field1132 = var1;
        this.field1128 = var2;
        this.field1130 = var3;
    }
}
