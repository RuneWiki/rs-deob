import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class368 {

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public int field5555;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public int field5556;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public int field5558;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public int field5559;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public int field5560;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    public int field5561;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "[B")
    public byte[] field5554;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "[B")
    public byte[] field5557;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "[I")
    public int[] field5553;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "([B)[Lff;", line = 4)
    private static final class368[] method2262(byte[] arg0) {
        class446 var1 = new class446(arg0);
        var1.field6315 = arg0.length - 2;
        int var2 = var1.method2631(2530);
        class368[] var3 = new class368[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class368();
        }
        var1.field6315 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method2631(2530);
        int var6 = var1.method2631(2530);
        int var7 = (var1.method2628(49152) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field5560 = var1.method2631(2530);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field5555 = var1.method2631(2530);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field5561 = var1.method2631(2530);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field5559 = var1.method2631(2530);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class368 var32 = var3[var12];
            var32.field5556 = var5 - var32.field5561 - var32.field5560;
            var32.field5558 = var6 - var32.field5559 - var32.field5555;
        }
        var1.field6315 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method2613(-25778);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field5553 = var13;
        }
        var1.field6315 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class368 var17 = var3[var16];
            int var18 = var17.field5561 * var17.field5559;
            var17.field5554 = new byte[var18];
            int var19 = var1.method2628(49152);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field5557 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field5554[var24] = var1.method2642(true);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field5557[var25] = var1.method2642(true);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field5561; var27++) {
                        for (int var31 = 0; var31 < var17.field5559; var31++) {
                            var17.field5554[var17.field5561 * var31 + var27] = var1.method2642(true);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field5561; var28++) {
                        for (int var29 = 0; var29 < var17.field5559; var29++) {
                            byte var30 = var17.field5557[var17.field5561 * var29 + var28] = var1.method2642(true);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field5557 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field5554[var20] = var1.method2642(true);
                }
            } else {
                for (int var21 = 0; var21 < var17.field5561; var21++) {
                    for (int var22 = 0; var22 < var17.field5559; var22++) {
                        var17.field5554[var17.field5561 * var22 + var21] = var1.method2642(true);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "()I", line = 212)
    public final int method2263() {
        return this.field5561 + this.field5560 + this.field5556;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "()V", line = 218)
    public final void method2264() {
        byte[] var1 = this.field5554;
        if (this.field5557 == null) {
            for (int var2 = this.field5559 - 1; var2 >= 0; var2--) {
                int var3 = this.field5561 * var2;
                int var4 = (var2 + 1) * this.field5561;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field5557;
            for (int var7 = this.field5559 - 1; var7 >= 0; var7--) {
                int var9 = this.field5561 * var7;
                int var10 = (var7 + 1) * this.field5561;
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
        int var8 = this.field5560;
        this.field5560 = this.field5556;
        this.field5556 = var8;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lui;II)Lff;", line = 282)
    public static final class368 method2265(class451 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2691(arg2, arg1, 0);
        return var3 == null ? null : method2262(var3)[0];
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V", line = 292)
    public final void method2266(int arg0) {
        int var2 = this.method2263();
        int var3 = this.method2271();
        if (this.field5561 == var2 && this.field5559 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field5560) {
            var4 = this.field5560;
        }
        int var5 = arg0;
        if (this.field5560 + arg0 + this.field5561 > var2) {
            var5 = var2 - this.field5560 - this.field5561;
        }
        int var6 = arg0;
        if (arg0 > this.field5555) {
            var6 = this.field5555;
        }
        int var7 = arg0;
        if (this.field5555 + arg0 + this.field5559 > var3) {
            var7 = var3 - this.field5555 - this.field5559;
        }
        int var8 = this.field5561 + var4 + var5;
        int var9 = this.field5559 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field5557 == null) {
            for (int var11 = 0; var11 < this.field5559; var11++) {
                int var12 = this.field5561 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field5561; var14++) {
                    var10[var13++] = this.field5554[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field5559; var16++) {
                int var17 = this.field5561 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field5561; var19++) {
                    var15[var18] = this.field5557[var17];
                    var10[var18++] = this.field5554[var17++];
                }
            }
            this.field5557 = var15;
        }
        this.field5560 -= var4;
        this.field5555 -= var6;
        this.field5556 -= var5;
        this.field5558 -= var7;
        this.field5561 = var8;
        this.field5559 = var9;
        this.field5554 = var10;
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "()V", line = 387)
    public final void method2267() {
        int var1 = this.method2263();
        int var2 = this.method2271();
        if (this.field5561 == var1 && this.field5559 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field5557 == null) {
            for (int var9 = 0; var9 < this.field5559; var9++) {
                int var10 = this.field5561 * var9;
                int var11 = (this.field5555 + var9) * var1 + this.field5560;
                for (int var12 = 0; var12 < this.field5561; var12++) {
                    var3[var11++] = this.field5554[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field5559; var5++) {
                int var6 = this.field5561 * var5;
                int var7 = (this.field5555 + var5) * var1 + this.field5560;
                for (int var8 = 0; var8 < this.field5561; var8++) {
                    var3[var7] = this.field5554[var6];
                    var4[var7++] = this.field5557[var6++];
                }
            }
            this.field5557 = var4;
        }
        this.field5560 = this.field5556 = this.field5555 = this.field5558 = 0;
        this.field5561 = var1;
        this.field5559 = var2;
        this.field5554 = var3;
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "()V", line = 458)
    public final void method2268() {
        byte[] var1 = this.field5554;
        if (this.field5557 == null) {
            for (int var2 = (this.field5559 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field5561 * var2;
                int var4 = (this.field5559 - var2 - 1) * this.field5561;
                for (int var5 = -this.field5561; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field5557;
            for (int var8 = (this.field5559 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field5561 * var8;
                int var11 = (this.field5559 - var8 - 1) * this.field5561;
                for (int var12 = -this.field5561; var12 < 0; var12++) {
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
        int var9 = this.field5555;
        this.field5555 = this.field5558;
        this.field5558 = var9;
    }

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "()V", line = 528)
    public final void method2269() {
        byte[] var1 = new byte[this.field5561 * this.field5559];
        int var2 = 0;
        if (this.field5557 == null) {
            for (int var3 = 0; var3 < this.field5561; var3++) {
                for (int var4 = this.field5559 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field5554[this.field5561 * var4 + var3];
                }
            }
            this.field5554 = var1;
        } else {
            byte[] var5 = new byte[this.field5561 * this.field5559];
            for (int var6 = 0; var6 < this.field5561; var6++) {
                for (int var9 = this.field5559 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field5554[this.field5561 * var9 + var6];
                    var5[var2++] = this.field5557[this.field5561 * var9 + var6];
                }
            }
            this.field5554 = var1;
            this.field5557 = var5;
        }
        int var7 = this.field5555;
        this.field5555 = this.field5560;
        this.field5560 = this.field5558;
        this.field5558 = this.field5556;
        this.field5556 = this.field5555;
        int var8 = this.field5559;
        this.field5559 = this.field5561;
        this.field5561 = var8;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V", line = 588)
    public final void method2270(int arg0) {
        int var2 = -1;
        if (this.field5553.length < 255) {
            for (int var3 = 0; var3 < this.field5553.length; var3++) {
                if (this.field5553[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field5553.length;
                int[] var4 = new int[this.field5553.length + 1];
                class149.method1009(this.field5553, 0, var4, 0, this.field5553.length);
                this.field5553 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field5553.length; var9++) {
                int var15 = this.field5553[var9];
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
        byte[] var11 = new byte[this.field5561 * this.field5559];
        for (int var12 = 0; var12 < this.field5559; var12++) {
            for (int var13 = 0; var13 < this.field5561; var13++) {
                int var14 = this.field5554[var10] & 0xFF;
                if (this.field5553[var14] == 0) {
                    if (var13 > 0 && this.field5553[this.field5554[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field5553[this.field5554[var10 - this.field5561] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field5561 - 1 && this.field5553[this.field5554[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field5559 - 1 && this.field5553[this.field5554[this.field5561 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field5554 = var11;
    }

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "()I", line = 715)
    public final int method2271() {
        return this.field5559 + this.field5555 + this.field5558;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lui;I)Lff;", line = 719)
    public static final class368 method2272(class451 arg0, int arg1) {
        byte[] var2 = arg0.method2667((byte) -127, arg1);
        return var2 == null ? null : method2262(var2)[0];
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)V", line = 727)
    public final void method2273(int arg0) {
        int var2 = -1;
        if (this.field5553.length < 255) {
            for (int var3 = 0; var3 < this.field5553.length; var3++) {
                if (this.field5553[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field5553.length;
                int[] var4 = new int[this.field5553.length + 1];
                class149.method1009(this.field5553, 0, var4, 0, this.field5553.length);
                this.field5553 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field5553.length; var9++) {
                int var13 = this.field5553[var9];
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
        for (int var10 = this.field5559 - 1; var10 > 0; var10--) {
            int var11 = this.field5561 * var10;
            for (int var12 = this.field5561 - 1; var12 > 0; var12--) {
                if (this.field5553[this.field5554[var11 + var12] & 0xFF] == 0 && this.field5553[this.field5554[var11 + var12 - this.field5561 - 1] & 0xFF] != 0) {
                    this.field5554[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(Lui;II)[Lff;", line = 834)
    public static final class368[] method2274(class451 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2691(arg2, arg1, 0);
        return var3 == null ? null : method2262(var3);
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(Lui;I)[Lff;", line = 842)
    public static final class368[] method2275(class451 arg0, int arg1) {
        byte[] var2 = arg0.method2667((byte) -114, arg1);
        return var2 == null ? null : method2262(var2);
    }

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "()[I", line = 850)
    public final int[] method2276() {
        int var1 = this.method2263();
        int[] var2 = new int[var1 * this.method2271()];
        if (this.field5557 == null) {
            for (int var7 = 0; var7 < this.field5559; var7++) {
                int var8 = this.field5561 * var7;
                int var9 = (this.field5555 + var7) * var1 + this.field5560;
                for (int var10 = 0; var10 < this.field5561; var10++) {
                    int var11 = this.field5553[this.field5554[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field5559; var3++) {
                int var4 = this.field5561 * var3;
                int var5 = (this.field5555 + var3) * var1 + this.field5560;
                for (int var6 = 0; var6 < this.field5561; var6++) {
                    var2[var5++] = this.field5557[var4] << 24 | this.field5553[this.field5554[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }
}
