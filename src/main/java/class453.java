import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public class class453 extends class152 {

    @OriginalMember(owner = "client!mea", name = "G", descriptor = "[I")
    private int[] field6392;

    @OriginalMember(owner = "client!mea", name = "D", descriptor = "[I")
    private int[] field6389;

    @OriginalMember(owner = "client!mea", name = "x", descriptor = "Laea;")
    private class56 field6383;

    @OriginalMember(owner = "client!mea", name = "v", descriptor = "Laea;")
    private class56 field6381;

    @OriginalMember(owner = "client!mea", name = "B", descriptor = "Laea;")
    private class56 field6387;

    @OriginalMember(owner = "client!mea", name = "z", descriptor = "[Laea;")
    private class56[] field6385;

    @OriginalMember(owner = "client!mea", name = "A", descriptor = "I")
    public static int field6386 = 0;

    @OriginalMember(owner = "client!mea", name = "J", descriptor = "I")
    public static int field6394 = 0;

    @OriginalMember(owner = "client!mea", name = "w", descriptor = "I")
    public static int field6382;

    @OriginalMember(owner = "client!mea", name = "y", descriptor = "I")
    public static int field6384;

    @OriginalMember(owner = "client!mea", name = "C", descriptor = "I")
    public static int field6388;

    @OriginalMember(owner = "client!mea", name = "E", descriptor = "I")
    public static int field6390;

    @OriginalMember(owner = "client!mea", name = "F", descriptor = "I")
    public static int field6391;

    @OriginalMember(owner = "client!mea", name = "H", descriptor = "I")
    public static int field6393;

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(DLbt;IILd;ZI)[I", line = 8)
    public final int[] method2744(double arg0, class48 arg1, int arg2, int arg3, class162 arg4, boolean arg5, int arg6) {
        class105.field1344 = arg4;
        field6390++;
        class722.field10136 = arg1;
        for (int var9 = 0; var9 < this.field6385.length; var9++) {
            this.field6385[var9].method491(-24116, arg6, arg3);
        }
        class664.method3728(0, arg0);
        class216.method1349(false, arg6, arg3);
        int[] var10 = new int[arg3 * arg6];
        int var11 = 0;
        for (int var12 = 0; var12 < arg6; var12++) {
            int[] var16;
            int[] var17;
            int[] var18;
            if (this.field6381.field762) {
                int[] var15 = this.field6381.method145(0, var12);
                var16 = var15;
                var17 = var15;
                var18 = var15;
            } else {
                int[][] var19 = this.field6381.method187((byte) 121, var12);
                var16 = var19[0];
                var18 = var19[2];
                var17 = var19[1];
            }
            int[] var20;
            if (this.field6387.field762) {
                var20 = this.field6387.method145(0, var12);
            } else {
                var20 = this.field6387.method187((byte) 37, var12)[0];
            }
            if (arg5) {
                var11 = var12;
            }
            for (int var21 = arg3 - 1; var21 >= 0; var21--) {
                int var22 = var16[var21] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var17[var21] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = var18[var21] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = class761.field10529[var22];
                int var26 = class761.field10529[var23];
                int var27 = class761.field10529[var24];
                int var28;
                if (var25 == 0 && var26 == 0 && var27 == 0) {
                    var28 = 0;
                } else {
                    var28 = var20[var21] >> 4;
                    if (var28 > 255) {
                        var28 = 255;
                    }
                    if (var28 < 0) {
                        var28 = 0;
                    }
                }
                var10[var11++] = (var25 << 16) + var27 + (var26 << 8) + (var28 << 24);
                if (arg5) {
                    var11 += arg3 - 1;
                }
            }
        }
        int var13 = 70 / ((-arg2 - 50) / 46);
        for (int var14 = 0; var14 < this.field6385.length; var14++) {
            this.field6385[var14].method489(false);
        }
        return var10;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(IIIII)V", line = 142)
    public static final void method2745(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6391++;
        class714 var5 = class350.method2072((long) arg3, arg4, (byte) 118);
        var5.method4043(arg4 + 6372);
        var5.field10018 = arg1;
        var5.field10021 = arg2;
        var5.field10023 = arg0;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(IZBLd;DIZLbt;)[I", line = 156)
    public final int[] method2746(int arg0, boolean arg1, byte arg2, class162 arg3, double arg4, int arg5, boolean arg6, class48 arg7) {
        class105.field1344 = arg3;
        class722.field10136 = arg7;
        field6393++;
        for (int var10 = 0; var10 < this.field6385.length; var10++) {
            this.field6385[var10].method491(-24116, arg0, arg5);
        }
        if (arg2 != -113) {
            return null;
        }
        class664.method3728(arg2 ^ 0xFFFFFF8F, arg4);
        class216.method1349(false, arg0, arg5);
        int[] var11 = new int[arg0 * arg5];
        int var12;
        byte var13;
        int var14;
        if (arg6) {
            var12 = arg5 - 1;
            var13 = -1;
            var14 = -1;
        } else {
            var12 = 0;
            var14 = arg5;
            var13 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg0; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field6381.field762) {
                int[] var18 = this.field6381.method145(0, var16);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field6381.method187((byte) 98, var16);
                var21 = var22[2];
                var19 = var22[0];
                var20 = var22[1];
            }
            if (arg1) {
                var15 = var16;
            }
            for (int var23 = var12; var23 != var14; var23 += var13) {
                int var24 = var19[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var20[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var21[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class761.field10529[var24];
                int var28 = class761.field10529[var25];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class761.field10529[var26];
                int var30 = (var27 << 16) + (var28 << 8) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg1) {
                    var15 += arg5 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field6385.length; var17++) {
            this.field6385[var17].method489(false);
        }
        return var11;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(Ld;Lbt;IIIZ)[F", line = 299)
    public final float[] method2747(class162 arg0, class48 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        class722.field10136 = arg1;
        class105.field1344 = arg0;
        field6382++;
        for (int var7 = 0; var7 < this.field6385.length; var7++) {
            this.field6385[var7].method491(-24116, arg4, arg3);
        }
        class216.method1349(false, arg4, arg3);
        float[] var8 = new float[arg3 * arg4 * 4];
        int var9 = 0;
        for (int var10 = 0; var10 < arg4; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field6381.field762) {
                int[] var12 = this.field6381.method145(0, var10);
                var13 = var12;
                var14 = var12;
                var15 = var12;
            } else {
                int[][] var16 = this.field6381.method187((byte) 74, var10);
                var15 = var16[0];
                var14 = var16[2];
                var13 = var16[1];
            }
            int[] var17;
            if (this.field6387.field762) {
                var17 = this.field6387.method145(0, var10);
            } else {
                var17 = this.field6387.method187((byte) 99, var10)[0];
            }
            if (arg5) {
                var9 = var10 << 2;
            }
            int[] var18;
            if (this.field6383.field762) {
                var18 = this.field6383.method145(~arg2, var10);
            } else {
                var18 = this.field6383.method187((byte) 43, var10)[0];
            }
            for (int var19 = arg3 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                if ((var20 < 0.0F)) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = var20;
                if (arg5) {
                    var9 += (arg3 << 2) - 4;
                }
            }
        }
        if (arg2 != -1) {
            this.field6392 = null;
        }
        for (int var11 = 0; var11 < this.field6385.length; var11++) {
            this.field6385[var11].method489(false);
        }
        return var8;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(IIZLkq;)V", line = 409)
    public static final void method2748(int arg0, int arg1, boolean arg2, class620 arg3) {
        if (arg2) {
            class37.field555 = arg0;
            class213.field2516 = arg3;
            field6388++;
            class398.field5199 = arg1;
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(BLd;Lbt;)Z", line = 434)
    public final boolean method2749(byte arg0, class162 arg1, class48 arg2) {
        field6384++;
        if (arg0 < 76) {
            field6394 = -64;
        }
        if (class543.field7622 >= 0) {
            for (int var4 = 0; var4 < this.field6389.length; var4++) {
                if (!arg2.method443(this.field6389[var4], class543.field7622, true)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field6389.length; var5++) {
                if (!arg2.method433((byte) -85, this.field6389[var5])) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field6392.length; var6++) {
            if (!arg1.method1137(12429, this.field6392[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!mea", name = "<init>", descriptor = "()V", line = 486)
    public class453() {
        this.field6392 = new int[0];
        this.field6389 = new int[0];
        this.field6383 = new class413(0);
        this.field6383.field747 = 1;
        this.field6381 = new class413();
        this.field6381.field747 = 1;
        this.field6387 = new class413();
        this.field6387.field747 = 1;
        this.field6385 = new class56[] { this.field6381, this.field6387, this.field6383 };
    }

    @OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Les;)V", line = 502)
    public class453(class403 arg0) {
        int var2 = arg0.method2396((byte) 107);
        int var3 = 0;
        int var4 = 0;
        this.field6385 = new class56[var2];
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class56 var16 = class753.method4208(arg0, -126);
            if (var16.method494(-1) >= 0) {
                var3++;
            }
            if (var16.method497(27738) >= 0) {
                var4++;
            }
            int var17 = var16.field749.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method2396((byte) 48);
            }
            this.field6385[var6] = var16;
        }
        this.field6389 = new int[var3];
        int var7 = 0;
        this.field6392 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class56 var11 = this.field6385[var9];
            int var12 = var11.field749.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field749[var13] = this.field6385[var5[var9][var13]];
            }
            int var14 = var11.method494(-1);
            int var15 = var11.method497(27738);
            if (var14 > 0) {
                this.field6389[var7++] = var14;
            }
            if (var15 > 0) {
                this.field6392[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field6381 = this.field6385[arg0.method2396((byte) -114)];
        this.field6387 = this.field6385[arg0.method2396((byte) -127)];
        this.field6383 = this.field6385[arg0.method2396((byte) 105)];
        Object var10 = null;
    }
}
