import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public class class481 {

    @OriginalMember(owner = "client!iga", name = "g", descriptor = "I")
    public int field6970;

    @OriginalMember(owner = "client!iga", name = "e", descriptor = "I")
    public int field6971;

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "I")
    public int field6972;

    @OriginalMember(owner = "client!iga", name = "b", descriptor = "I")
    public int field6974;

    @OriginalMember(owner = "client!iga", name = "d", descriptor = "I")
    public int field6976;

    @OriginalMember(owner = "client!iga", name = "h", descriptor = "I")
    public int field6977;

    @OriginalMember(owner = "client!iga", name = "i", descriptor = "[B")
    public byte[] field6973;

    @OriginalMember(owner = "client!iga", name = "f", descriptor = "[B")
    public byte[] field6975;

    @OriginalMember(owner = "client!iga", name = "c", descriptor = "[I")
    public int[] field6969;

    @OriginalMember(owner = "client!iga", name = "d", descriptor = "()V")
    public final void method3666() {
        int var1 = this.method3670();
        int var2 = this.method3674();
        if (this.field6970 == var1 && this.field6977 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field6973 == null) {
            for (int var9 = 0; var9 < this.field6977; var9++) {
                int var10 = this.field6970 * var9;
                int var11 = (this.field6976 + var9) * var1 + this.field6971;
                for (int var12 = 0; var12 < this.field6970; var12++) {
                    var3[var11++] = this.field6975[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field6977; var5++) {
                int var6 = this.field6970 * var5;
                int var7 = (this.field6976 + var5) * var1 + this.field6971;
                for (int var8 = 0; var8 < this.field6970; var8++) {
                    var3[var7] = this.field6975[var6];
                    var4[var7++] = this.field6973[var6++];
                }
            }
            this.field6973 = var4;
        }
        this.field6971 = this.field6974 = this.field6976 = this.field6972 = 0;
        this.field6970 = var1;
        this.field6977 = var2;
        this.field6975 = var3;
    }

    @OriginalMember(owner = "client!iga", name = "c", descriptor = "(I)V")
    public final void method3667(int arg0) {
        int var2 = -1;
        if (this.field6969.length < 255) {
            for (int var3 = 0; var3 < this.field6969.length; var3++) {
                if (this.field6969[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field6969.length;
                int[] var4 = new int[this.field6969.length + 1];
                class467.method3553(this.field6969, 0, var4, 0, this.field6969.length);
                this.field6969 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field6969.length; var9++) {
                int var15 = this.field6969[var9];
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
        byte[] var11 = new byte[this.field6977 * this.field6970];
        for (int var12 = 0; var12 < this.field6977; var12++) {
            for (int var13 = 0; var13 < this.field6970; var13++) {
                int var14 = this.field6975[var10] & 0xFF;
                if (this.field6969[var14] == 0) {
                    if (var13 > 0 && this.field6969[this.field6975[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field6969[this.field6975[var10 - this.field6970] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field6970 - 1 && this.field6969[this.field6975[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field6977 - 1 && this.field6969[this.field6975[this.field6970 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field6975 = var11;
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(I)V")
    public final void method3668(int arg0) {
        int var2 = -1;
        if (this.field6969.length < 255) {
            for (int var3 = 0; var3 < this.field6969.length; var3++) {
                if (this.field6969[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field6969.length;
                int[] var4 = new int[this.field6969.length + 1];
                class467.method3553(this.field6969, 0, var4, 0, this.field6969.length);
                this.field6969 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field6969.length; var9++) {
                int var13 = this.field6969[var9];
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
        for (int var10 = this.field6977 - 1; var10 > 0; var10--) {
            int var11 = this.field6970 * var10;
            for (int var12 = this.field6970 - 1; var12 > 0; var12--) {
                if (this.field6969[this.field6975[var11 + var12] & 0xFF] == 0 && this.field6969[this.field6975[var11 + var12 - this.field6970 - 1] & 0xFF] != 0) {
                    this.field6975[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(Lla;I)Liga;")
    public static final class481 method3669(class476 arg0, int arg1) {
        byte[] var2 = arg0.method3638(-109, arg1);
        return var2 == null ? null : method3680(var2)[0];
    }

    @OriginalMember(owner = "client!iga", name = "g", descriptor = "()I")
    public final int method3670() {
        return this.field6971 + this.field6970 + this.field6974;
    }

    @OriginalMember(owner = "client!iga", name = "b", descriptor = "(I)V")
    public final void method3671(int arg0) {
        int var2 = this.method3670();
        int var3 = this.method3674();
        if (this.field6970 == var2 && this.field6977 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field6971) {
            var4 = this.field6971;
        }
        int var5 = arg0;
        if (this.field6971 + arg0 + this.field6970 > var2) {
            var5 = var2 - this.field6971 - this.field6970;
        }
        int var6 = arg0;
        if (arg0 > this.field6976) {
            var6 = this.field6976;
        }
        int var7 = arg0;
        if (this.field6976 + arg0 + this.field6977 > var3) {
            var7 = var3 - this.field6976 - this.field6977;
        }
        int var8 = this.field6970 + var4 + var5;
        int var9 = this.field6977 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field6973 == null) {
            for (int var11 = 0; var11 < this.field6977; var11++) {
                int var12 = this.field6970 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field6970; var14++) {
                    var10[var13++] = this.field6975[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field6977; var16++) {
                int var17 = this.field6970 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field6970; var19++) {
                    var15[var18] = this.field6973[var17];
                    var10[var18++] = this.field6975[var17++];
                }
            }
            this.field6973 = var15;
        }
        this.field6971 -= var4;
        this.field6976 -= var6;
        this.field6974 -= var5;
        this.field6972 -= var7;
        this.field6970 = var8;
        this.field6977 = var9;
        this.field6975 = var10;
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "()V")
    public final void method3672() {
        byte[] var1 = this.field6975;
        if (this.field6973 == null) {
            for (int var2 = this.field6977 - 1; var2 >= 0; var2--) {
                int var3 = this.field6970 * var2;
                int var4 = (var2 + 1) * this.field6970;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field6973;
            for (int var7 = this.field6977 - 1; var7 >= 0; var7--) {
                int var9 = this.field6970 * var7;
                int var10 = (var7 + 1) * this.field6970;
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
        int var8 = this.field6971;
        this.field6971 = this.field6974;
        this.field6974 = var8;
    }

    @OriginalMember(owner = "client!iga", name = "b", descriptor = "(Lla;II)[Liga;")
    public static final class481[] method3673(class476 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3632(arg1, arg2, 79);
        return var3 == null ? null : method3680(var3);
    }

    @OriginalMember(owner = "client!iga", name = "b", descriptor = "()I")
    public final int method3674() {
        return this.field6977 + this.field6976 + this.field6972;
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(Lla;II)Liga;")
    public static final class481 method3675(class476 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3632(arg1, arg2, 66);
        return var3 == null ? null : method3680(var3)[0];
    }

    @OriginalMember(owner = "client!iga", name = "e", descriptor = "()V")
    public final void method3676() {
        byte[] var1 = new byte[this.field6977 * this.field6970];
        int var2 = 0;
        if (this.field6973 == null) {
            for (int var3 = 0; var3 < this.field6970; var3++) {
                for (int var4 = this.field6977 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field6975[this.field6970 * var4 + var3];
                }
            }
            this.field6975 = var1;
        } else {
            byte[] var5 = new byte[this.field6977 * this.field6970];
            for (int var6 = 0; var6 < this.field6970; var6++) {
                for (int var9 = this.field6977 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field6975[this.field6970 * var9 + var6];
                    var5[var2++] = this.field6973[this.field6970 * var9 + var6];
                }
            }
            this.field6975 = var1;
            this.field6973 = var5;
        }
        int var7 = this.field6976;
        this.field6976 = this.field6971;
        this.field6971 = this.field6972;
        this.field6972 = this.field6974;
        this.field6974 = this.field6976;
        int var8 = this.field6977;
        this.field6977 = this.field6970;
        this.field6970 = var8;
    }

    @OriginalMember(owner = "client!iga", name = "b", descriptor = "(Lla;I)[Liga;")
    public static final class481[] method3677(class476 arg0, int arg1) {
        byte[] var2 = arg0.method3638(90, arg1);
        return var2 == null ? null : method3680(var2);
    }

    @OriginalMember(owner = "client!iga", name = "c", descriptor = "()[I")
    public final int[] method3678() {
        int var1 = this.method3670();
        int[] var2 = new int[var1 * this.method3674()];
        if (this.field6973 == null) {
            for (int var7 = 0; var7 < this.field6977; var7++) {
                int var8 = this.field6970 * var7;
                int var9 = (this.field6976 + var7) * var1 + this.field6971;
                for (int var10 = 0; var10 < this.field6970; var10++) {
                    int var11 = this.field6969[this.field6975[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field6977; var3++) {
                int var4 = this.field6970 * var3;
                int var5 = (this.field6976 + var3) * var1 + this.field6971;
                for (int var6 = 0; var6 < this.field6970; var6++) {
                    var2[var5++] = this.field6973[var4] << 24 | this.field6969[this.field6975[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!iga", name = "f", descriptor = "()V")
    public final void method3679() {
        byte[] var1 = this.field6975;
        if (this.field6973 == null) {
            for (int var2 = (this.field6977 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field6970 * var2;
                int var4 = (this.field6977 - var2 - 1) * this.field6970;
                for (int var5 = -this.field6970; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field6973;
            for (int var8 = (this.field6977 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field6970 * var8;
                int var11 = (this.field6977 - var8 - 1) * this.field6970;
                for (int var12 = -this.field6970; var12 < 0; var12++) {
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
        int var9 = this.field6976;
        this.field6976 = this.field6972;
        this.field6972 = var9;
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "([B)[Liga;")
    private static final class481[] method3680(byte[] arg0) {
        class163 var1 = new class163(arg0);
        var1.field2201 = arg0.length - 2;
        int var2 = var1.method1445((byte) 112);
        class481[] var3 = new class481[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class481();
        }
        var1.field2201 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method1445((byte) 113);
        int var6 = var1.method1445((byte) 112);
        int var7 = (var1.method1455((byte) 62) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field6971 = var1.method1445((byte) 124);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field6976 = var1.method1445((byte) 107);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field6970 = var1.method1445((byte) 113);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field6977 = var1.method1445((byte) 109);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class481 var32 = var3[var12];
            var32.field6974 = var5 - var32.field6970 - var32.field6971;
            var32.field6972 = var6 - var32.field6977 - var32.field6976;
        }
        var1.field2201 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method1436((byte) 73);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field6969 = var13;
        }
        var1.field2201 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class481 var17 = var3[var16];
            int var18 = var17.field6977 * var17.field6970;
            var17.field6975 = new byte[var18];
            int var19 = var1.method1455((byte) 62);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field6973 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field6975[var24] = var1.method1414(1);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field6973[var25] = var1.method1414(1);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field6970; var27++) {
                        for (int var31 = 0; var31 < var17.field6977; var31++) {
                            var17.field6975[var17.field6970 * var31 + var27] = var1.method1414(1);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field6970; var28++) {
                        for (int var29 = 0; var29 < var17.field6977; var29++) {
                            byte var30 = var17.field6973[var17.field6970 * var29 + var28] = var1.method1414(1);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field6973 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field6975[var20] = var1.method1414(1);
                }
            } else {
                for (int var21 = 0; var21 < var17.field6970; var21++) {
                    for (int var22 = 0; var22 < var17.field6977; var22++) {
                        var17.field6975[var17.field6970 * var22 + var21] = var1.method1414(1);
                    }
                }
            }
        }
        return var3;
    }
}
