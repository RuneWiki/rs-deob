import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class158 {

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "I")
    public int field2385;

    @OriginalMember(owner = "client!dt", name = "d", descriptor = "I")
    public int field2387;

    @OriginalMember(owner = "client!dt", name = "e", descriptor = "I")
    public int field2388;

    @OriginalMember(owner = "client!dt", name = "f", descriptor = "I")
    public int field2389;

    @OriginalMember(owner = "client!dt", name = "h", descriptor = "I")
    public int field2391;

    @OriginalMember(owner = "client!dt", name = "i", descriptor = "I")
    public int field2392;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "[B")
    public byte[] field2384;

    @OriginalMember(owner = "client!dt", name = "g", descriptor = "[B")
    public byte[] field2390;

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "[I")
    public int[] field2386;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "([B)[Ldt;")
    private static final class158[] method1130(byte[] arg0) {
        class303 var1 = new class303(arg0);
        var1.field4333 = arg0.length - 2;
        int var2 = var1.method1868(0);
        class158[] var3 = new class158[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new class158();
        }
        var1.field4333 = arg0.length - var2 * 8 - 7;
        int var5 = var1.method1868(0);
        int var6 = var1.method1868(0);
        int var7 = (var1.method1918((byte) 102) & 0xFF) + 1;
        for (int var8 = 0; var8 < var2; var8++) {
            var3[var8].field2392 = var1.method1868(0);
        }
        for (int var9 = 0; var9 < var2; var9++) {
            var3[var9].field2385 = var1.method1868(0);
        }
        for (int var10 = 0; var10 < var2; var10++) {
            var3[var10].field2391 = var1.method1868(0);
        }
        for (int var11 = 0; var11 < var2; var11++) {
            var3[var11].field2388 = var1.method1868(0);
        }
        for (int var12 = 0; var12 < var2; var12++) {
            class158 var32 = var3[var12];
            var32.field2387 = var5 - var32.field2391 - var32.field2392;
            var32.field2389 = var6 - var32.field2388 - var32.field2385;
        }
        var1.field4333 = arg0.length - var2 * 8 - (var7 - 1) * 3 - 7;
        int[] var13 = new int[var7];
        for (int var14 = 1; var14 < var7; var14++) {
            var13[var14] = var1.method1866(false);
            if (var13[var14] == 0) {
                var13[var14] = 1;
            }
        }
        for (int var15 = 0; var15 < var2; var15++) {
            var3[var15].field2386 = var13;
        }
        var1.field4333 = 0;
        for (int var16 = 0; var16 < var2; var16++) {
            class158 var17 = var3[var16];
            int var18 = var17.field2391 * var17.field2388;
            var17.field2384 = new byte[var18];
            int var19 = var1.method1918((byte) -63);
            if ((var19 & 0x2) != 0) {
                boolean var23 = false;
                var17.field2390 = new byte[var18];
                if ((var19 & 0x1) == 0) {
                    for (int var24 = 0; var24 < var18; var24++) {
                        var17.field2384[var24] = var1.method1899((byte) -118);
                    }
                    for (int var25 = 0; var25 < var18; var25++) {
                        byte var26 = var17.field2390[var25] = var1.method1899((byte) -95);
                        var23 |= var26 != -1;
                    }
                } else {
                    for (int var27 = 0; var27 < var17.field2391; var27++) {
                        for (int var31 = 0; var31 < var17.field2388; var31++) {
                            var17.field2384[var17.field2391 * var31 + var27] = var1.method1899((byte) -103);
                        }
                    }
                    for (int var28 = 0; var28 < var17.field2391; var28++) {
                        for (int var29 = 0; var29 < var17.field2388; var29++) {
                            byte var30 = var17.field2390[var17.field2391 * var29 + var28] = var1.method1899((byte) -117);
                            var23 |= var30 != -1;
                        }
                    }
                }
                if (!var23) {
                    var17.field2390 = null;
                }
            } else if ((var19 & 0x1) == 0) {
                for (int var20 = 0; var20 < var18; var20++) {
                    var17.field2384[var20] = var1.method1899((byte) 121);
                }
            } else {
                for (int var21 = 0; var21 < var17.field2391; var21++) {
                    for (int var22 = 0; var22 < var17.field2388; var22++) {
                        var17.field2384[var17.field2391 * var22 + var21] = var1.method1899((byte) 55);
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "()V")
    public final void method1131() {
        byte[] var1 = new byte[this.field2391 * this.field2388];
        int var2 = 0;
        if (this.field2390 == null) {
            for (int var3 = 0; var3 < this.field2391; var3++) {
                for (int var4 = this.field2388 - 1; var4 >= 0; var4--) {
                    var1[var2++] = this.field2384[this.field2391 * var4 + var3];
                }
            }
            this.field2384 = var1;
        } else {
            byte[] var5 = new byte[this.field2391 * this.field2388];
            for (int var6 = 0; var6 < this.field2391; var6++) {
                for (int var9 = this.field2388 - 1; var9 >= 0; var9--) {
                    var1[var2] = this.field2384[this.field2391 * var9 + var6];
                    var5[var2++] = this.field2390[this.field2391 * var9 + var6];
                }
            }
            this.field2384 = var1;
            this.field2390 = var5;
        }
        int var7 = this.field2385;
        this.field2385 = this.field2392;
        this.field2392 = this.field2389;
        this.field2389 = this.field2387;
        this.field2387 = this.field2385;
        int var8 = this.field2388;
        this.field2388 = this.field2391;
        this.field2391 = var8;
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "()I")
    public final int method1132() {
        return this.field2392 + this.field2391 + this.field2387;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)V")
    public final void method1133(int arg0) {
        int var2 = -1;
        if (this.field2386.length < 255) {
            for (int var3 = 0; var3 < this.field2386.length; var3++) {
                if (this.field2386[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field2386.length;
                int[] var4 = new int[this.field2386.length + 1];
                class486.method2901(this.field2386, 0, var4, 0, this.field2386.length);
                this.field2386 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field2386.length; var9++) {
                int var13 = this.field2386[var9];
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
        for (int var10 = this.field2388 - 1; var10 > 0; var10--) {
            int var11 = this.field2391 * var10;
            for (int var12 = this.field2391 - 1; var12 > 0; var12--) {
                if (this.field2386[this.field2384[var11 + var12] & 0xFF] == 0 && this.field2386[this.field2384[var11 + var12 - this.field2391 - 1] & 0xFF] != 0) {
                    this.field2384[var11 + var12] = (byte) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lhh;II)Ldt;")
    public static final class158 method1134(class84 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method683(arg1, arg2, 5);
        return var3 == null ? null : method1130(var3)[0];
    }

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "()V")
    public final void method1135() {
        byte[] var1 = this.field2384;
        if (this.field2390 == null) {
            for (int var2 = this.field2388 - 1; var2 >= 0; var2--) {
                int var3 = this.field2391 * var2;
                int var4 = (var2 + 1) * this.field2391;
                while (var3 < var4) {
                    var4--;
                    byte var5 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var5;
                    var3++;
                }
            }
        } else {
            byte[] var6 = this.field2390;
            for (int var7 = this.field2388 - 1; var7 >= 0; var7--) {
                int var9 = this.field2391 * var7;
                int var10 = (var7 + 1) * this.field2391;
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
        int var8 = this.field2392;
        this.field2392 = this.field2387;
        this.field2387 = var8;
    }

    @OriginalMember(owner = "client!dt", name = "d", descriptor = "()V")
    public final void method1136() {
        int var1 = this.method1132();
        int var2 = this.method1144();
        if (this.field2391 == var1 && this.field2388 == var2) {
            return;
        }
        byte[] var3 = new byte[var1 * var2];
        if (this.field2390 == null) {
            for (int var9 = 0; var9 < this.field2388; var9++) {
                int var10 = this.field2391 * var9;
                int var11 = (this.field2385 + var9) * var1 + this.field2392;
                for (int var12 = 0; var12 < this.field2391; var12++) {
                    var3[var11++] = this.field2384[var10++];
                }
            }
        } else {
            byte[] var4 = new byte[var1 * var2];
            for (int var5 = 0; var5 < this.field2388; var5++) {
                int var6 = this.field2391 * var5;
                int var7 = (this.field2385 + var5) * var1 + this.field2392;
                for (int var8 = 0; var8 < this.field2391; var8++) {
                    var3[var7] = this.field2384[var6];
                    var4[var7++] = this.field2390[var6++];
                }
            }
            this.field2390 = var4;
        }
        this.field2392 = this.field2387 = this.field2385 = this.field2389 = 0;
        this.field2391 = var1;
        this.field2388 = var2;
        this.field2384 = var3;
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(Lhh;II)[Ldt;")
    public static final class158[] method1137(class84 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method683(arg1, arg2, 5);
        return var3 == null ? null : method1130(var3);
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(I)V")
    public final void method1138(int arg0) {
        int var2 = -1;
        if (this.field2386.length < 255) {
            for (int var3 = 0; var3 < this.field2386.length; var3++) {
                if (this.field2386[var3] == arg0) {
                    var2 = var3;
                    break;
                }
            }
            if (var2 == -1) {
                var2 = this.field2386.length;
                int[] var4 = new int[this.field2386.length + 1];
                class486.method2901(this.field2386, 0, var4, 0, this.field2386.length);
                this.field2386 = var4;
                var4[var2] = arg0;
            }
        } else {
            int var5 = Integer.MAX_VALUE;
            int var6 = arg0 >> 16 & 0xFF;
            int var7 = arg0 >> 8 & 0xFF;
            int var8 = arg0 & 0xFF;
            for (int var9 = 0; var9 < this.field2386.length; var9++) {
                int var15 = this.field2386[var9];
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
        byte[] var11 = new byte[this.field2391 * this.field2388];
        for (int var12 = 0; var12 < this.field2388; var12++) {
            for (int var13 = 0; var13 < this.field2391; var13++) {
                int var14 = this.field2384[var10] & 0xFF;
                if (this.field2386[var14] == 0) {
                    if (var13 > 0 && this.field2386[this.field2384[var10 - 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 > 0 && this.field2386[this.field2384[var10 - this.field2391] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var13 < this.field2391 - 1 && this.field2386[this.field2384[var10 + 1] & 0xFF] != 0) {
                        var14 = var2;
                    } else if (var12 < this.field2388 - 1 && this.field2386[this.field2384[this.field2391 + var10] & 0xFF] != 0) {
                        var14 = var2;
                    }
                }
                var11[var10++] = (byte) var14;
            }
        }
        this.field2384 = var11;
    }

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "(I)V")
    public final void method1139(int arg0) {
        int var2 = this.method1132();
        int var3 = this.method1144();
        if (this.field2391 == var2 && this.field2388 == var3) {
            return;
        }
        int var4 = arg0;
        if (arg0 > this.field2392) {
            var4 = this.field2392;
        }
        int var5 = arg0;
        if (this.field2392 + arg0 + this.field2391 > var2) {
            var5 = var2 - this.field2392 - this.field2391;
        }
        int var6 = arg0;
        if (arg0 > this.field2385) {
            var6 = this.field2385;
        }
        int var7 = arg0;
        if (this.field2385 + arg0 + this.field2388 > var3) {
            var7 = var3 - this.field2385 - this.field2388;
        }
        int var8 = this.field2391 + var4 + var5;
        int var9 = this.field2388 + var6 + var7;
        byte[] var10 = new byte[var8 * var9];
        if (this.field2390 == null) {
            for (int var11 = 0; var11 < this.field2388; var11++) {
                int var12 = this.field2391 * var11;
                int var13 = (var6 + var11) * var8 + var4;
                for (int var14 = 0; var14 < this.field2391; var14++) {
                    var10[var13++] = this.field2384[var12++];
                }
            }
        } else {
            byte[] var15 = new byte[var8 * var9];
            for (int var16 = 0; var16 < this.field2388; var16++) {
                int var17 = this.field2391 * var16;
                int var18 = (var6 + var16) * var8 + var4;
                for (int var19 = 0; var19 < this.field2391; var19++) {
                    var15[var18] = this.field2390[var17];
                    var10[var18++] = this.field2384[var17++];
                }
            }
            this.field2390 = var15;
        }
        this.field2392 -= var4;
        this.field2385 -= var6;
        this.field2387 -= var5;
        this.field2389 -= var7;
        this.field2391 = var8;
        this.field2388 = var9;
        this.field2384 = var10;
    }

    @OriginalMember(owner = "client!dt", name = "e", descriptor = "()V")
    public final void method1140() {
        byte[] var1 = this.field2384;
        if (this.field2390 == null) {
            for (int var2 = (this.field2388 >> 1) - 1; var2 >= 0; var2--) {
                int var3 = this.field2391 * var2;
                int var4 = (this.field2388 - var2 - 1) * this.field2391;
                for (int var5 = -this.field2391; var5 < 0; var5++) {
                    byte var6 = var1[var3];
                    var1[var3] = var1[var4];
                    var1[var4] = var6;
                    var3++;
                    var4++;
                }
            }
        } else {
            byte[] var7 = this.field2390;
            for (int var8 = (this.field2388 >> 1) - 1; var8 >= 0; var8--) {
                int var10 = this.field2391 * var8;
                int var11 = (this.field2388 - var8 - 1) * this.field2391;
                for (int var12 = -this.field2391; var12 < 0; var12++) {
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
        int var9 = this.field2385;
        this.field2385 = this.field2389;
        this.field2389 = var9;
    }

    @OriginalMember(owner = "client!dt", name = "f", descriptor = "()[I")
    public final int[] method1141() {
        int var1 = this.method1132();
        int[] var2 = new int[var1 * this.method1144()];
        if (this.field2390 == null) {
            for (int var7 = 0; var7 < this.field2388; var7++) {
                int var8 = this.field2391 * var7;
                int var9 = (this.field2385 + var7) * var1 + this.field2392;
                for (int var10 = 0; var10 < this.field2391; var10++) {
                    int var11 = this.field2386[this.field2384[var8++] & 0xFF];
                    if (var11 == 0) {
                        var2[var9++] = 0;
                    } else {
                        var2[var9++] = var11 | 0xFF000000;
                    }
                }
            }
        } else {
            for (int var3 = 0; var3 < this.field2388; var3++) {
                int var4 = this.field2391 * var3;
                int var5 = (this.field2385 + var3) * var1 + this.field2392;
                for (int var6 = 0; var6 < this.field2391; var6++) {
                    var2[var5++] = this.field2390[var4] << 24 | this.field2386[this.field2384[var4] & 0xFF];
                    var4++;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lhh;I)Ldt;")
    public static final class158 method1142(class84 arg0, int arg1) {
        byte[] var2 = arg0.method680(true, arg1);
        return var2 == null ? null : method1130(var2)[0];
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(Lhh;I)[Ldt;")
    public static final class158[] method1143(class84 arg0, int arg1) {
        byte[] var2 = arg0.method680(true, arg1);
        return var2 == null ? null : method1130(var2);
    }

    @OriginalMember(owner = "client!dt", name = "g", descriptor = "()I")
    public final int method1144() {
        return this.field2388 + this.field2385 + this.field2389;
    }
}
