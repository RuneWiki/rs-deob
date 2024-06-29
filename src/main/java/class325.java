import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class325 {

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public int field4329;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public int field4331;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
    public int field4332;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public int field4333;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    public int field4335;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public int field4336;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "[B")
    public byte[] field4330;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "[B")
    public byte[] field4337;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "[I")
    public int[] field4334;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
    public final void method1809(int arg0) {
        int var2 = -1;
        if (this.field4334.length < 255) {
            for (int var3 = 0; var3 < this.field4334.length; var3++) {
                if (this.field4334[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field4334.length;
                int[] var4 = new int[this.field4334.length + 1];
                class380.method2332(this.field4334, 0, var4, 0, this.field4334.length);
                this.field4334 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field4334.length; var9++) {
                int var15 = this.field4334[var9];
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
        byte[] var11 = new byte[this.field4333 * this.field4331];
        for (int var12 = 0; var12 < this.field4333; var12++) {
            for (int var13 = 0; var13 < this.field4331; var13++) {
                int var14 = this.field4337[var10] & 0xFF;
                if (this.field4334[var14] == 0) {
                    if (var13 > 0 && this.field4334[this.field4337[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field4334[this.field4337[var10 - this.field4331] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field4331 - 1 && this.field4334[this.field4337[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field4333 - 1 && this.field4334[this.field4337[this.field4331 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field4337 = var11;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "()V")
    public final void method1810() {
        byte[] var1 = new byte[this.field4333 * this.field4331];
        int var2 = 0;
        if (this.field4330 == null) {
            for (int var3 = 0; var3 < this.field4331; var3++) {
                for (int var4 = this.field4333 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field4337[this.field4331 * var4 + var3];
                }
            }
            this.field4337 = var1;
        } else {
            byte[] var5 = new byte[this.field4333 * this.field4331];
            for (int var6 = 0; var6 < this.field4331; var6++) {
                for (int var9 = this.field4333 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field4337[this.field4331 * var9 + var6];
                    var5[var2++] = this.field4330[this.field4331 * var9 + var6];
                }
            }
            this.field4337 = var1;
            this.field4330 = var5;
        }
        int var7 = this.field4329;
        this.field4329 = this.field4336;
        this.field4336 = this.field4335;
        this.field4335 = this.field4332;
        this.field4332 = this.field4329;
        int var8 = this.field4333;
        this.field4333 = this.field4331;
        this.field4331 = var8;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lr;I)Ldk;")
    public static final class325 method1811(class110 arg0, int arg1) {
        byte[] var2 = arg0.method695(arg1, -115);
        return var2 == null ? null : method1814(var2)[0];
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)V")
    public final void method1812(int arg0) {
        int var2 = -1;
        if (this.field4334.length < 255) {
            for (int var3 = 0; var3 < this.field4334.length; var3++) {
                if (this.field4334[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field4334.length;
                int[] var4 = new int[this.field4334.length + 1];
                class380.method2332(this.field4334, 0, var4, 0, this.field4334.length);
                this.field4334 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field4334.length; var9++) {
                int var13 = this.field4334[var9];
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
        for (int var10 = this.field4333 - 1; var10 > 0; var10--) {
            int var11 = this.field4331 * var10;
            for (int var12 = this.field4331 - 1; var12 > 0; var12--) {
                if (this.field4334[this.field4337[var11 + var12] & 0xFF] == 0 && this.field4334[this.field4337[var11 + var12 - this.field4331 - 1] & 0xFF] != 0) {
                    this.field4337[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(Lr;I)[Ldk;")
    public static final class325[] method1813(class110 arg0, int arg1) {
        byte[] var2 = arg0.method695(arg1, -112);
        return var2 == null ? null : method1814(var2);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "([B)[Ldk;")
    private static final class325[] method1814(byte[] arg0) {
        class32 var1 = new class32(arg0);
        var1.field456 = arg0.length - 2;
        int var2 = var1.method215((byte) 101);
        class325[] var3 = new class325[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class325();
        }
        var1.field456 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method215((byte) 108);
        int var6 = var1.method215((byte) 113);
        int var7 = (var1.method201((byte) -118) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field4336 = var1.method215((byte) 113);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field4329 = var1.method215((byte) 92);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field4331 = var1.method215((byte) 114);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field4333 = var1.method215((byte) 113);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class325 var32 = var3[var12];
            var32.field4332 = var5 - var32.field4331 - var32.field4336;
            var32.field4335 = var6 - var32.field4333 - var32.field4329;
        }
        var1.field456 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method219(-110);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field4334 = var13;
        }
        var1.field456 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class325 var17 = var3[var16];
            int var18 = var17.field4333 * var17.field4331;
            var17.field4337 = new byte[var18];
            int var19 = var1.method201((byte) -108);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field4330 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field4337[var24] = var1.method211(29861);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field4330[var25] = var1.method211(29861);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field4331; var27++) {
                        for (int var31 = 0; var31 < var17.field4333; var31++) {
                            var17.field4337[var17.field4331 * var31 + var27] = var1.method211(29861);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field4331; var28++) {
                        for (int var29 = 0; var29 < var17.field4333; var29++) {
                            byte var30 = var17.field4330[var17.field4331 * var29 + var28] = var1.method211(29861);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field4330 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field4337[var20] = var1.method211(29861);
                }
            } else {
                for (int var21 = 0; var21 < var17.field4331; var21++) {
                    for (int var22 = 0; var22 < var17.field4333; var22++) {
                        var17.field4337[var17.field4331 * var22 + var21] = var1.method211(29861);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "()I")
    public final int method1815() {
        return this.field4336 + this.field4331 + this.field4332;
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "()V")
    public final void method1816() {
        int var1 = this.method1815();
        int var2 = this.method1818();
        if (this.field4331 == var1 && this.field4333 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field4330 == null) {
            for (int var9 = 0; var9 < this.field4333; var9++) {
                int var10 = this.field4331 * var9;
                int var11 = (this.field4329 + var9) * var1 + this.field4336;
                for (int var12 = 0; var12 < this.field4331; var12++) {
                    var3[var11++] = this.field4337[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field4333; var5++) {
                int var6 = this.field4331 * var5;
                int var7 = (this.field4329 + var5) * var1 + this.field4336;
                for (int var8 = 0; var8 < this.field4331; var8++) {
                    var3[var7] = this.field4337[var6];
                    var4[var7++] = this.field4330[var6++];
                }
            }
            this.field4330 = var4;
        }
        this.field4336 = this.field4332 = this.field4329 = this.field4335 = 0;
        this.field4331 = var1;
        this.field4333 = var2;
        this.field4337 = var3;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lr;II)Ldk;")
    public static final class325 method1817(class110 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method702((byte) -114, arg2, arg1);
        return var3 == null ? null : method1814(var3)[0];
    }

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "()I")
    public final int method1818() {
        return this.field4333 + this.field4329 + this.field4335;
    }

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "()V")
    public final void method1819() {
        byte[] var1 = this.field4337;
        if (this.field4330 == null) {
            for (int var2 = this.field4333 - 1; var2 >= 0; var2--) {
                int var3 = this.field4331 * var2;
                int var4 = (var2 + 1) * this.field4331;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field4330;
            for (int var7 = this.field4333 - 1; var7 >= 0; var7--) {
                int var9 = this.field4331 * var7;
                int var10 = (var7 + 1) * this.field4331;
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
        int var8 = this.field4336;
        this.field4336 = this.field4332;
        this.field4332 = var8;
    }

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "()[I")
    public final int[] method1820() {
        int var1 = this.method1815();
        int[] var2 = new int[var1 * this.method1818()];
        if (this.field4330 == null) {
            for (int var7 = 0; var7 < this.field4333; var7++) {
                int var8 = this.field4331 * var7;
                int var9 = (this.field4329 + var7) * var1 + this.field4336;
                for (int var10 = 0; var10 < this.field4331; var10++) {
                    int var11 = this.field4334[this.field4337[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field4333; var3++) {
                int var4 = this.field4331 * var3;
                int var5 = (this.field4329 + var3) * var1 + this.field4336;
                for (int var6 = 0; var6 < this.field4331; var6++) {
                    var2[var5++] = this.field4330[var4] << 24 | this.field4334[this.field4337[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(I)V")
    public final void method1821(int arg0) {
        int var2 = this.method1815();
        int var3 = this.method1818();
        if (this.field4331 == var2 && this.field4333 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field4336) {
            var4 = this.field4336;
        }
        int var5 = arg0;
        if (this.field4336 + arg0 + this.field4331 > var2) {
            var5 = var2 - this.field4336 - this.field4331;
        }
        int var6 = arg0;
        if (arg0 > this.field4329) {
            var6 = this.field4329;
        }
        int var7 = arg0;
        if (this.field4329 + arg0 + this.field4333 > var3) {
            var7 = var3 - this.field4329 - this.field4333;
        }
        int var8 = this.field4331 + var4 + var5;
        int var9 = this.field4333 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field4330 == null) {
            for (int var11 = 0; var11 < this.field4333; var11++) {
                int var12 = this.field4331 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field4331; var14++) {
                    var10[var13++] = this.field4337[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field4333; var16++) {
                int var17 = this.field4331 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field4331; var19++) {
                    var15[var18] = this.field4330[var17];
                    var10[var18++] = this.field4337[var17++];
                }
            }
            this.field4330 = var15;
        }
        this.field4336 -= var4;
        this.field4329 -= var6;
        this.field4332 -= var5;
        this.field4335 -= var7;
        this.field4331 = var8;
        this.field4333 = var9;
        this.field4337 = var10;
    }

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "()V")
    public final void method1822() {
        byte[] var1 = this.field4337;
        if (this.field4330 == null) {
            for (int var2 = (this.field4333 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field4331 * var2;
                int var4 = (this.field4333 - var2 - 1) * this.field4331;
                for (int var5 = -this.field4331; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field4330;
            for (int var8 = (this.field4333 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field4331 * var8;
                int var11 = (this.field4333 - var8 - 1) * this.field4331;
                for (int var12 = -this.field4331; var12 < 0; var12++) {
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
        int var9 = this.field4329;
        this.field4329 = this.field4335;
        this.field4335 = var9;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(Lr;II)[Ldk;")
    public static final class325[] method1823(class110 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method702((byte) -121, arg2, arg1);
        return var3 == null ? null : method1814(var3);
    }
}
