import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class175 {

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public int field2573;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public int field2575;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public int field2576;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public int field2577;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    public int field2578;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public int field2579;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "[B")
    public byte[] field2572;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "[B")
    public byte[] field2574;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "[I")
    public int[] field2571;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "([B)[Lok;")
    private static final class175[] method1101(byte[] arg0) {
        class208 var1 = new class208(arg0);
        var1.field3162 = arg0.length - 2;
        int var2 = var1.method1455(-3387);
        class175[] var3 = new class175[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class175();
        }
        var1.field3162 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method1455(-3387);
        int var6 = var1.method1455(-3387);
        int var7 = (var1.method1445(-72) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field2575 = var1.method1455(-3387);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field2579 = var1.method1455(-3387);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field2576 = var1.method1455(-3387);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field2577 = var1.method1455(-3387);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class175 var32 = var3[var12];
            var32.field2573 = var5 - var32.field2576 - var32.field2575;
            var32.field2578 = var6 - var32.field2577 - var32.field2579;
        }
        var1.field3162 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method1452(3);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field2571 = var13;
        }
        var1.field3162 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class175 var17 = var3[var16];
            int var18 = var17.field2577 * var17.field2576;
            var17.field2574 = new byte[var18];
            int var19 = var1.method1445(22);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field2572 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field2574[var24] = var1.method1427(false);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field2572[var25] = var1.method1427(false);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field2576; var27++) {
                        for (int var31 = 0; var31 < var17.field2577; var31++) {
                            var17.field2574[var17.field2576 * var31 + var27] = var1.method1427(false);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field2576; var28++) {
                        for (int var29 = 0; var29 < var17.field2577; var29++) {
                            byte var30 = var17.field2572[var17.field2576 * var29 + var28] = var1.method1427(false);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field2572 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field2574[var20] = var1.method1427(false);
                }
            } else {
                for (int var21 = 0; var21 < var17.field2576; var21++) {
                    for (int var22 = 0; var22 < var17.field2577; var22++) {
                        var17.field2574[var17.field2576 * var22 + var21] = var1.method1427(false);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
    public final void method1102(int arg0) {
        int var2 = this.method1113();
        int var3 = this.method1105();
        if (this.field2576 == var2 && this.field2577 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field2575) {
            var4 = this.field2575;
        }
        int var5 = arg0;
        if (this.field2575 + arg0 + this.field2576 > var2) {
            var5 = var2 - this.field2575 - this.field2576;
        }
        int var6 = arg0;
        if (arg0 > this.field2579) {
            var6 = this.field2579;
        }
        int var7 = arg0;
        if (this.field2579 + arg0 + this.field2577 > var3) {
            var7 = var3 - this.field2579 - this.field2577;
        }
        int var8 = this.field2576 + var4 + var5;
        int var9 = this.field2577 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field2572 == null) {
            for (int var11 = 0; var11 < this.field2577; var11++) {
                int var12 = this.field2576 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field2576; var14++) {
                    var10[var13++] = this.field2574[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field2577; var16++) {
                int var17 = this.field2576 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field2576; var19++) {
                    var15[var18] = this.field2572[var17];
                    var10[var18++] = this.field2574[var17++];
                }
            }
            this.field2572 = var15;
        }
        this.field2575 -= var4;
        this.field2579 -= var6;
        this.field2573 -= var5;
        this.field2578 -= var7;
        this.field2576 = var8;
        this.field2577 = var9;
        this.field2574 = var10;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lmn;I)[Lok;")
    public static final class175[] method1103(class162 arg0, int arg1) {
        byte[] var2 = arg0.method1010(arg1, (byte) 107);
        return var2 == null ? null : method1101(var2);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "()V")
    public final void method1104() {
        byte[] var1 = new byte[this.field2577 * this.field2576];
        int var2 = 0;
        if (this.field2572 == null) {
            for (int var3 = 0; var3 < this.field2576; var3++) {
                for (int var4 = this.field2577 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field2574[this.field2576 * var4 + var3];
                }
            }
            this.field2574 = var1;
        } else {
            byte[] var5 = new byte[this.field2577 * this.field2576];
            for (int var6 = 0; var6 < this.field2576; var6++) {
                for (int var9 = this.field2577 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field2574[this.field2576 * var9 + var6];
                    var5[var2++] = this.field2572[this.field2576 * var9 + var6];
                }
            }
            this.field2574 = var1;
            this.field2572 = var5;
        }
        int var7 = this.field2579;
        this.field2579 = this.field2575;
        this.field2575 = this.field2578;
        this.field2578 = this.field2573;
        this.field2573 = this.field2579;
        int var8 = this.field2577;
        this.field2577 = this.field2576;
        this.field2576 = var8;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "()I")
    public final int method1105() {
        return this.field2579 + this.field2577 + this.field2578;
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "()V")
    public final void method1106() {
        byte[] var1 = this.field2574;
        if (this.field2572 == null) {
            for (int var2 = (this.field2577 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field2576 * var2;
                int var4 = (this.field2577 - var2 - 1) * this.field2576;
                for (int var5 = -this.field2576; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field2572;
            for (int var8 = (this.field2577 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field2576 * var8;
                int var11 = (this.field2577 - var8 - 1) * this.field2576;
                for (int var12 = -this.field2576; var12 < 0; var12++) {
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
        int var9 = this.field2579;
        this.field2579 = this.field2578;
        this.field2578 = var9;
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "()[I")
    public final int[] method1107() {
        int var1 = this.method1113();
        int[] var2 = new int[var1 * this.method1105()];
        if (this.field2572 == null) {
            for (int var7 = 0; var7 < this.field2577; var7++) {
                int var8 = this.field2576 * var7;
                int var9 = (this.field2579 + var7) * var1 + this.field2575;
                for (int var10 = 0; var10 < this.field2576; var10++) {
                    int var11 = this.field2571[this.field2574[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field2577; var3++) {
                int var4 = this.field2576 * var3;
                int var5 = (this.field2579 + var3) * var1 + this.field2575;
                for (int var6 = 0; var6 < this.field2576; var6++) {
                    var2[var5++] = this.field2572[var4] << 24 | this.field2571[this.field2574[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)V")
    public final void method1108(int arg0) {
        int var2 = -1;
        if (this.field2571.length < 255) {
            for (int var3 = 0; var3 < this.field2571.length; var3++) {
                if (this.field2571[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field2571.length;
                int[] var4 = new int[this.field2571.length + 1];
                class324.method2169(this.field2571, 0, var4, 0, this.field2571.length);
                this.field2571 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field2571.length; var9++) {
                int var15 = this.field2571[var9];
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
        byte[] var11 = new byte[this.field2577 * this.field2576];
        for (int var12 = 0; var12 < this.field2577; var12++) {
            for (int var13 = 0; var13 < this.field2576; var13++) {
                int var14 = this.field2574[var10] & 0xFF;
                if (this.field2571[var14] == 0) {
                    if (var13 > 0 && this.field2571[this.field2574[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field2571[this.field2574[var10 - this.field2576] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field2576 - 1 && this.field2571[this.field2574[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field2577 - 1 && this.field2571[this.field2574[this.field2576 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field2574 = var11;
    }

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "()V")
    public final void method1109() {
        int var1 = this.method1113();
        int var2 = this.method1105();
        if (this.field2576 == var1 && this.field2577 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field2572 == null) {
            for (int var9 = 0; var9 < this.field2577; var9++) {
                int var10 = this.field2576 * var9;
                int var11 = (this.field2579 + var9) * var1 + this.field2575;
                for (int var12 = 0; var12 < this.field2576; var12++) {
                    var3[var11++] = this.field2574[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field2577; var5++) {
                int var6 = this.field2576 * var5;
                int var7 = (this.field2579 + var5) * var1 + this.field2575;
                for (int var8 = 0; var8 < this.field2576; var8++) {
                    var3[var7] = this.field2574[var6];
                    var4[var7++] = this.field2572[var6++];
                }
            }
            this.field2572 = var4;
        }
        this.field2575 = this.field2573 = this.field2579 = this.field2578 = 0;
        this.field2576 = var1;
        this.field2577 = var2;
        this.field2574 = var3;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lmn;II)[Lok;")
    public static final class175[] method1110(class162 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1004(arg1, false, arg2);
        return var3 == null ? null : method1101(var3);
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)V")
    public final void method1111(int arg0) {
        int var2 = -1;
        if (this.field2571.length < 255) {
            for (int var3 = 0; var3 < this.field2571.length; var3++) {
                if (this.field2571[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field2571.length;
                int[] var4 = new int[this.field2571.length + 1];
                class324.method2169(this.field2571, 0, var4, 0, this.field2571.length);
                this.field2571 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field2571.length; var9++) {
                int var13 = this.field2571[var9];
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
        for (int var10 = this.field2577 - 1; var10 > 0; var10--) {
            int var11 = this.field2576 * var10;
            for (int var12 = this.field2576 - 1; var12 > 0; var12--) {
                if (this.field2571[this.field2574[var11 + var12] & 0xFF] == 0 && this.field2571[this.field2574[var11 + var12 - this.field2576 - 1] & 0xFF] != 0) {
                    this.field2574[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(Lmn;I)Lok;")
    public static final class175 method1112(class162 arg0, int arg1) {
        byte[] var2 = arg0.method1010(arg1, (byte) 104);
        return var2 == null ? null : method1101(var2)[0];
    }

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "()I")
    public final int method1113() {
        return this.field2576 + this.field2575 + this.field2573;
    }

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "()V")
    public final void method1114() {
        byte[] var1 = this.field2574;
        if (this.field2572 == null) {
            for (int var2 = this.field2577 - 1; var2 >= 0; var2--) {
                int var3 = this.field2576 * var2;
                int var4 = (var2 + 1) * this.field2576;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field2572;
            for (int var7 = this.field2577 - 1; var7 >= 0; var7--) {
                int var9 = this.field2576 * var7;
                int var10 = (var7 + 1) * this.field2576;
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
        int var8 = this.field2575;
        this.field2575 = this.field2573;
        this.field2573 = var8;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(Lmn;II)Lok;")
    public static final class175 method1115(class162 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1004(arg1, false, arg2);
        return var3 == null ? null : method1101(var3)[0];
    }
}
