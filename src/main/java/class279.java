import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class279 {

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public int field4003;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public int field4005;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public int field4007;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public int field4008;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public int field4009;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public int field4010;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "[B")
    public byte[] field4004;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "[B")
    public byte[] field4006;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "[I")
    public int[] field4011;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "()I", line = 3)
    public final int method1778() {
        return this.field4007 + this.field4005 + this.field4009;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lbu;II)[Lwe;", line = 7)
    public static final class279[] method1779(class17 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method114(arg2, arg1, 126);
        return var3 == null ? null : method1781(var3);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V", line = 15)
    public final void method1780(int arg0) {
        int var2 = this.method1778();
        int var3 = this.method1783();
        if (this.field4005 == var2 && this.field4003 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field4007) {
            var4 = this.field4007;
        }
        int var5 = arg0;
        if (this.field4007 + arg0 + this.field4005 > var2) {
            var5 = var2 - this.field4007 - this.field4005;
        }
        int var6 = arg0;
        if (arg0 > this.field4008) {
            var6 = this.field4008;
        }
        int var7 = arg0;
        if (this.field4008 + arg0 + this.field4003 > var3) {
            var7 = var3 - this.field4008 - this.field4003;
        }
        int var8 = this.field4005 + var4 + var5;
        int var9 = this.field4003 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field4004 == null) {
            for (int var11 = 0; var11 < this.field4003; var11++) {
                int var12 = this.field4005 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field4005; var14++) {
                    var10[var13++] = this.field4006[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field4003; var16++) {
                int var17 = this.field4005 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field4005; var19++) {
                    var15[var18] = this.field4004[var17];
                    var10[var18++] = this.field4006[var17++];
                }
            }
            this.field4004 = var15;
        }
        this.field4007 -= var4;
        this.field4008 -= var6;
        this.field4009 -= var5;
        this.field4010 -= var7;
        this.field4005 = var8;
        this.field4003 = var9;
        this.field4006 = var10;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "([B)[Lwe;", line = 111)
    private static final class279[] method1781(byte[] arg0) {
        class145 var1 = new class145(arg0);
        var1.field2289 = arg0.length - 2;
        int var2 = var1.method1069((byte) -14);
        class279[] var3 = new class279[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class279();
        }
        var1.field2289 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method1069((byte) -56);
        int var6 = var1.method1069((byte) -20);
        int var7 = (var1.method1063((byte) 118) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field4007 = var1.method1069((byte) -87);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field4008 = var1.method1069((byte) -107);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field4005 = var1.method1069((byte) -56);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field4003 = var1.method1069((byte) -69);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class279 var32 = var3[var12];
            var32.field4009 = var5 - var32.field4005 - var32.field4007;
            var32.field4010 = var6 - var32.field4003 - var32.field4008;
        }
        var1.field2289 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method1085(-77);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field4011 = var13;
        }
        var1.field2289 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class279 var17 = var3[var16];
            int var18 = var17.field4005 * var17.field4003;
            var17.field4006 = new byte[var18];
            int var19 = var1.method1063((byte) 115);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field4004 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field4006[var24] = var1.method1093(15);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field4004[var25] = var1.method1093(15);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field4005; var27++) {
                        for (int var31 = 0; var31 < var17.field4003; var31++) {
                            var17.field4006[var17.field4005 * var31 + var27] = var1.method1093(15);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field4005; var28++) {
                        for (int var29 = 0; var29 < var17.field4003; var29++) {
                            byte var30 = var17.field4004[var17.field4005 * var29 + var28] = var1.method1093(15);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field4004 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field4006[var20] = var1.method1093(15);
                }
            } else {
                for (int var21 = 0; var21 < var17.field4005; var21++) {
                    for (int var22 = 0; var22 < var17.field4003; var22++) {
                        var17.field4006[var17.field4005 * var22 + var21] = var1.method1093(15);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V", line = 319)
    public final void method1782(int arg0) {
        int var2 = -1;
        if (this.field4011.length < 255) {
            for (int var3 = 0; var3 < this.field4011.length; var3++) {
                if (this.field4011[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field4011.length;
                int[] var4 = new int[this.field4011.length + 1];
                class73.method591(this.field4011, 0, var4, 0, this.field4011.length);
                this.field4011 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field4011.length; var9++) {
                int var13 = this.field4011[var9];
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
        for (int var10 = this.field4003 - 1; var10 > 0; var10--) {
            int var11 = this.field4005 * var10;
            for (int var12 = this.field4005 - 1; var12 > 0; var12--) {
                if (this.field4011[this.field4006[var11 + var12] & 0xFF] == 0 && this.field4011[this.field4006[var11 + var12 - this.field4005 - 1] & 0xFF] != 0) {
                    this.field4006[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "()I", line = 421)
    public final int method1783() {
        return this.field4008 + this.field4003 + this.field4010;
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "()V", line = 427)
    public final void method1784() {
        byte[] var1 = this.field4006;
        if (this.field4004 == null) {
            for (int var2 = this.field4003 - 1; var2 >= 0; var2--) {
                int var3 = this.field4005 * var2;
                int var4 = (var2 + 1) * this.field4005;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field4004;
            for (int var7 = this.field4003 - 1; var7 >= 0; var7--) {
                int var9 = this.field4005 * var7;
                int var10 = (var7 + 1) * this.field4005;
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
        int var8 = this.field4007;
        this.field4007 = this.field4009;
        this.field4009 = var8;
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "()[I", line = 490)
    public final int[] method1785() {
        int var1 = this.method1778();
        int[] var2 = new int[var1 * this.method1783()];
        if (this.field4004 == null) {
            for (int var7 = 0; var7 < this.field4003; var7++) {
                int var8 = this.field4005 * var7;
                int var9 = (this.field4008 + var7) * var1 + this.field4007;
                for (int var10 = 0; var10 < this.field4005; var10++) {
                    int var11 = this.field4011[this.field4006[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field4003; var3++) {
                int var4 = this.field4005 * var3;
                int var5 = (this.field4008 + var3) * var1 + this.field4007;
                for (int var6 = 0; var6 < this.field4005; var6++) {
                    var2[var5++] = this.field4004[var4] << 24 | this.field4011[this.field4006[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(I)V", line = 553)
    public final void method1786(int arg0) {
        int var2 = -1;
        if (this.field4011.length < 255) {
            for (int var3 = 0; var3 < this.field4011.length; var3++) {
                if (this.field4011[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field4011.length;
                int[] var4 = new int[this.field4011.length + 1];
                class73.method591(this.field4011, 0, var4, 0, this.field4011.length);
                this.field4011 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field4011.length; var9++) {
                int var15 = this.field4011[var9];
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
        byte[] var11 = new byte[this.field4005 * this.field4003];
        for (int var12 = 0; var12 < this.field4003; var12++) {
            for (int var13 = 0; var13 < this.field4005; var13++) {
                int var14 = this.field4006[var10] & 0xFF;
                if (this.field4011[var14] == 0) {
                    if (var13 > 0 && this.field4011[this.field4006[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field4011[this.field4006[var10 - this.field4005] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field4005 - 1 && this.field4011[this.field4006[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field4003 - 1 && this.field4011[this.field4006[this.field4005 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field4006 = var11;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lbu;I)Lwe;", line = 678)
    public static final class279 method1787(class17 arg0, int arg1) {
        byte[] var2 = arg0.method140(arg1, 1);
        return var2 == null ? null : method1781(var2)[0];
    }

    @OriginalMember(owner = "client!we", name = "e", descriptor = "()V", line = 688)
    public final void method1788() {
        byte[] var1 = this.field4006;
        if (this.field4004 == null) {
            for (int var2 = (this.field4003 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field4005 * var2;
                int var4 = (this.field4003 - var2 - 1) * this.field4005;
                for (int var5 = -this.field4005; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field4004;
            for (int var8 = (this.field4003 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field4005 * var8;
                int var11 = (this.field4003 - var8 - 1) * this.field4005;
                for (int var12 = -this.field4005; var12 < 0; var12++) {
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
        int var9 = this.field4008;
        this.field4008 = this.field4010;
        this.field4010 = var9;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(Lbu;II)Lwe;", line = 760)
    public static final class279 method1789(class17 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method114(arg2, arg1, -11);
        return var3 == null ? null : method1781(var3)[0];
    }

    @OriginalMember(owner = "client!we", name = "f", descriptor = "()V", line = 768)
    public final void method1790() {
        byte[] var1 = new byte[this.field4005 * this.field4003];
        int var2 = 0;
        if (this.field4004 == null) {
            for (int var3 = 0; var3 < this.field4005; var3++) {
                for (int var4 = this.field4003 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field4006[this.field4005 * var4 + var3];
                }
            }
            this.field4006 = var1;
        } else {
            byte[] var5 = new byte[this.field4005 * this.field4003];
            for (int var6 = 0; var6 < this.field4005; var6++) {
                for (int var9 = this.field4003 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field4006[this.field4005 * var9 + var6];
                    var5[var2++] = this.field4004[this.field4005 * var9 + var6];
                }
            }
            this.field4006 = var1;
            this.field4004 = var5;
        }
        int var7 = this.field4008;
        this.field4008 = this.field4007;
        this.field4007 = this.field4010;
        this.field4010 = this.field4009;
        this.field4009 = this.field4008;
        int var8 = this.field4003;
        this.field4003 = this.field4005;
        this.field4005 = var8;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(Lbu;I)[Lwe;", line = 832)
    public static final class279[] method1791(class17 arg0, int arg1) {
        byte[] var2 = arg0.method140(arg1, 1);
        return var2 == null ? null : method1781(var2);
    }

    @OriginalMember(owner = "client!we", name = "g", descriptor = "()V", line = 845)
    public final void method1792() {
        int var1 = this.method1778();
        int var2 = this.method1783();
        if (this.field4005 == var1 && this.field4003 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field4004 == null) {
            for (int var9 = 0; var9 < this.field4003; var9++) {
                int var10 = this.field4005 * var9;
                int var11 = (this.field4008 + var9) * var1 + this.field4007;
                for (int var12 = 0; var12 < this.field4005; var12++) {
                    var3[var11++] = this.field4006[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field4003; var5++) {
                int var6 = this.field4005 * var5;
                int var7 = (this.field4008 + var5) * var1 + this.field4007;
                for (int var8 = 0; var8 < this.field4005; var8++) {
                    var3[var7] = this.field4006[var6];
                    var4[var7++] = this.field4004[var6++];
                }
            }
            this.field4004 = var4;
        }
        this.field4007 = this.field4009 = this.field4008 = this.field4010 = 0;
        this.field4005 = var1;
        this.field4003 = var2;
        this.field4006 = var3;
    }
}
