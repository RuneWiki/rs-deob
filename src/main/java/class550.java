import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class550 {

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "I")
    public int field7867;

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "I")
    public int field7870;

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "I")
    public int field7872;

    @OriginalMember(owner = "client!qo", name = "g", descriptor = "I")
    public int field7873;

    @OriginalMember(owner = "client!qo", name = "h", descriptor = "I")
    public int field7874;

    @OriginalMember(owner = "client!qo", name = "i", descriptor = "I")
    public int field7875;

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "[B")
    public byte[] field7868;

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "[B")
    public byte[] field7869;

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "[I")
    public int[] field7871;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "()[I")
    public final int[] method3111() {
        int var1 = this.method3112();
        int[] var2 = new int[var1 * this.method3120()];
        if (this.field7868 == null) {
            for (int var7 = 0; var7 < this.field7872; var7++) {
                int var8 = this.field7873 * var7;
                int var9 = (this.field7867 + var7) * var1 + this.field7870;
                for (int var10 = 0; var10 < this.field7873; var10++) {
                    int var11 = this.field7871[this.field7869[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field7872; var3++) {
                int var4 = this.field7873 * var3;
                int var5 = (this.field7867 + var3) * var1 + this.field7870;
                for (int var6 = 0; var6 < this.field7873; var6++) {
                    var2[var5++] = this.field7868[var4] << 24 | this.field7871[this.field7869[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "()I")
    public final int method3112() {
        return this.field7873 + this.field7870 + this.field7875;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Ltf;I)Lqo;")
    public static final class550 method3113(class701 arg0, int arg1) {
        byte[] var2 = arg0.method3859((byte) 123, arg1);
        return var2 == null ? null : method3125(var2)[0];
    }

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "()V")
    public final void method3114() {
        byte[] var1 = this.field7869;
        if (this.field7868 == null) {
            for (int var2 = (this.field7872 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field7873 * var2;
                int var4 = (this.field7872 - var2 - 1) * this.field7873;
                for (int var5 = -this.field7873; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field7868;
            for (int var8 = (this.field7872 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field7873 * var8;
                int var11 = (this.field7872 - var8 - 1) * this.field7873;
                for (int var12 = -this.field7873; var12 < 0; var12++) {
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
        int var9 = this.field7867;
        this.field7867 = this.field7874;
        this.field7874 = var9;
    }

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "()V")
    public final void method3115() {
        byte[] var1 = this.field7869;
        if (this.field7868 == null) {
            for (int var2 = this.field7872 - 1; var2 >= 0; var2--) {
                int var3 = this.field7873 * var2;
                int var4 = (var2 + 1) * this.field7873;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field7868;
            for (int var7 = this.field7872 - 1; var7 >= 0; var7--) {
                int var9 = this.field7873 * var7;
                int var10 = (var7 + 1) * this.field7873;
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
        int var8 = this.field7870;
        this.field7870 = this.field7875;
        this.field7875 = var8;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V")
    public final void method3116(int arg0) {
        int var2 = -1;
        if (this.field7871.length < 255) {
            for (int var3 = 0; var3 < this.field7871.length; var3++) {
                if (this.field7871[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field7871.length;
                int[] var4 = new int[this.field7871.length + 1];
                class567.method3215(this.field7871, 0, var4, 0, this.field7871.length);
                this.field7871 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field7871.length; var9++) {
                int var15 = this.field7871[var9];
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
        byte[] var11 = new byte[this.field7873 * this.field7872];
        for (int var12 = 0; var12 < this.field7872; var12++) {
            for (int var13 = 0; var13 < this.field7873; var13++) {
                int var14 = this.field7869[var10] & 0xFF;
                if (this.field7871[var14] == 0) {
                    if (var13 > 0 && this.field7871[this.field7869[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field7871[this.field7869[var10 - this.field7873] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field7873 - 1 && this.field7871[this.field7869[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field7872 - 1 && this.field7871[this.field7869[this.field7873 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field7869 = var11;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Ltf;II)[Lqo;")
    public static final class550[] method3117(class701 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3854((byte) 52, arg1, arg2);
        return var3 == null ? null : method3125(var3);
    }

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "()V")
    public final void method3118() {
        int var1 = this.method3112();
        int var2 = this.method3120();
        if (this.field7873 == var1 && this.field7872 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field7868 == null) {
            for (int var9 = 0; var9 < this.field7872; var9++) {
                int var10 = this.field7873 * var9;
                int var11 = (this.field7867 + var9) * var1 + this.field7870;
                for (int var12 = 0; var12 < this.field7873; var12++) {
                    var3[var11++] = this.field7869[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field7872; var5++) {
                int var6 = this.field7873 * var5;
                int var7 = (this.field7867 + var5) * var1 + this.field7870;
                for (int var8 = 0; var8 < this.field7873; var8++) {
                    var3[var7] = this.field7869[var6];
                    var4[var7++] = this.field7868[var6++];
                }
            }
            this.field7868 = var4;
        }
        this.field7870 = this.field7875 = this.field7867 = this.field7874 = 0;
        this.field7873 = var1;
        this.field7872 = var2;
        this.field7869 = var3;
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(Ltf;I)[Lqo;")
    public static final class550[] method3119(class701 arg0, int arg1) {
        byte[] var2 = arg0.method3859((byte) 123, arg1);
        return var2 == null ? null : method3125(var2);
    }

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "()I")
    public final int method3120() {
        return this.field7872 + this.field7867 + this.field7874;
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(I)V")
    public final void method3121(int arg0) {
        int var2 = this.method3112();
        int var3 = this.method3120();
        if (this.field7873 == var2 && this.field7872 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field7870) {
            var4 = this.field7870;
        }
        int var5 = arg0;
        if (this.field7870 + arg0 + this.field7873 > var2) {
            var5 = var2 - this.field7870 - this.field7873;
        }
        int var6 = arg0;
        if (arg0 > this.field7867) {
            var6 = this.field7867;
        }
        int var7 = arg0;
        if (this.field7867 + arg0 + this.field7872 > var3) {
            var7 = var3 - this.field7867 - this.field7872;
        }
        int var8 = this.field7873 + var4 + var5;
        int var9 = this.field7872 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field7868 == null) {
            for (int var11 = 0; var11 < this.field7872; var11++) {
                int var12 = this.field7873 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field7873; var14++) {
                    var10[var13++] = this.field7869[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field7872; var16++) {
                int var17 = this.field7873 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field7873; var19++) {
                    var15[var18] = this.field7868[var17];
                    var10[var18++] = this.field7869[var17++];
                }
            }
            this.field7868 = var15;
        }
        this.field7870 -= var4;
        this.field7867 -= var6;
        this.field7875 -= var5;
        this.field7874 -= var7;
        this.field7873 = var8;
        this.field7872 = var9;
        this.field7869 = var10;
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(Ltf;II)Lqo;")
    public static final class550 method3122(class701 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3854((byte) 76, arg1, arg2);
        return var3 == null ? null : method3125(var3)[0];
    }

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "(I)V")
    public final void method3123(int arg0) {
        int var2 = -1;
        if (this.field7871.length < 255) {
            for (int var3 = 0; var3 < this.field7871.length; var3++) {
                if (this.field7871[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field7871.length;
                int[] var4 = new int[this.field7871.length + 1];
                class567.method3215(this.field7871, 0, var4, 0, this.field7871.length);
                this.field7871 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field7871.length; var9++) {
                int var13 = this.field7871[var9];
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
        for (int var10 = this.field7872 - 1; var10 > 0; var10--) {
            int var11 = this.field7873 * var10;
            for (int var12 = this.field7873 - 1; var12 > 0; var12--) {
                if (this.field7871[this.field7869[var11 + var12] & 0xFF] == 0 && this.field7871[this.field7869[var11 + var12 - this.field7873 - 1] & 0xFF] != 0) {
                    this.field7869[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "g", descriptor = "()V")
    public final void method3124() {
        byte[] var1 = new byte[this.field7873 * this.field7872];
        int var2 = 0;
        if (this.field7868 == null) {
            for (int var3 = 0; var3 < this.field7873; var3++) {
                for (int var4 = this.field7872 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field7869[this.field7873 * var4 + var3];
                }
            }
            this.field7869 = var1;
        } else {
            byte[] var5 = new byte[this.field7873 * this.field7872];
            for (int var6 = 0; var6 < this.field7873; var6++) {
                for (int var9 = this.field7872 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field7869[this.field7873 * var9 + var6];
                    var5[var2++] = this.field7868[this.field7873 * var9 + var6];
                }
            }
            this.field7869 = var1;
            this.field7868 = var5;
        }
        int var7 = this.field7867;
        this.field7867 = this.field7870;
        this.field7870 = this.field7874;
        this.field7874 = this.field7875;
        this.field7875 = this.field7867;
        int var8 = this.field7872;
        this.field7872 = this.field7873;
        this.field7873 = var8;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "([B)[Lqo;")
    private static final class550[] method3125(byte[] arg0) {
        class115 var1 = new class115(arg0);
        var1.field1218 = arg0.length - 2;
        int var2 = var1.method643((byte) -77);
        class550[] var3 = new class550[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class550();
        }
        var1.field1218 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method643((byte) -77);
        int var6 = var1.method643((byte) -77);
        int var7 = (var1.method620((byte) -127) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field7870 = var1.method643((byte) -77);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field7867 = var1.method643((byte) -77);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field7873 = var1.method643((byte) -77);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field7872 = var1.method643((byte) -77);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class550 var32 = var3[var12];
            var32.field7875 = var5 - var32.field7873 - var32.field7870;
            var32.field7874 = var6 - var32.field7872 - var32.field7867;
        }
        var1.field1218 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method675(-127);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field7871 = var13;
        }
        var1.field1218 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class550 var17 = var3[var16];
            int var18 = var17.field7873 * var17.field7872;
            var17.field7869 = new byte[var18];
            int var19 = var1.method620((byte) 99);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field7868 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field7869[var24] = var1.method657(false);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field7868[var25] = var1.method657(false);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field7873; var27++) {
                        for (int var31 = 0; var31 < var17.field7872; var31++) {
                            var17.field7869[var17.field7873 * var31 + var27] = var1.method657(false);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field7873; var28++) {
                        for (int var29 = 0; var29 < var17.field7872; var29++) {
                            byte var30 = var17.field7868[var17.field7873 * var29 + var28] = var1.method657(false);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field7868 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field7869[var20] = var1.method657(false);
                }
            } else {
                for (int var21 = 0; var21 < var17.field7873; var21++) {
                    for (int var22 = 0; var22 < var17.field7872; var22++) {
                        var17.field7869[var17.field7873 * var22 + var21] = var1.method657(false);
                    }
                }
            }
        }
        return var3;
    }
}
