import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class3 extends class405 {

    @OriginalMember(owner = "client!ar", name = "x", descriptor = "[I")
    private int[] field25;

    @OriginalMember(owner = "client!ar", name = "p", descriptor = "[I")
    private int[] field17;

    @OriginalMember(owner = "client!ar", name = "B", descriptor = "Lvn;")
    private class263 field29;

    @OriginalMember(owner = "client!ar", name = "w", descriptor = "Lvn;")
    private class263 field24;

    @OriginalMember(owner = "client!ar", name = "z", descriptor = "Lvn;")
    private class263 field27;

    @OriginalMember(owner = "client!ar", name = "y", descriptor = "[Lvn;")
    private class263[] field26;

    @OriginalMember(owner = "client!ar", name = "t", descriptor = "Lfh;")
    public static class192 field21 = new class192();

    @OriginalMember(owner = "client!ar", name = "A", descriptor = "[F")
    public static float[] field28 = new float[4];

    @OriginalMember(owner = "client!ar", name = "q", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!ar", name = "r", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!ar", name = "s", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!ar", name = "u", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!ar", name = "v", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!ar", name = "C", descriptor = "Lok;")
    public static class74 field30;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lga;ILok;IDIZ)[I")
    public final int[] method9(class243 arg0, int arg1, class74 arg2, int arg3, double arg4, int arg5, boolean arg6) {
        class119.field1822 = arg0;
        field19++;
        class446.field6578 = arg2;
        for (int var9 = 0; var9 < this.field26.length; var9++) {
            this.field26[var9].method399(arg5, (byte) -22, arg3);
        }
        class312.method1964(arg4, (byte) 109);
        class275.method1714(79, arg3, arg5);
        int[] var10 = new int[arg3 * arg5 * 4];
        int var11 = 0;
        int var12 = 0;
        if (arg1 > -78) {
            return null;
        }
        while (arg3 > var12) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field24.field3927) {
                int[] var18 = this.field24.method33(var12, (byte) 122);
                var15 = var18;
                var17 = var18;
                var16 = var18;
            } else {
                int[][] var14 = this.field24.method34(var12, (byte) -88);
                var15 = var14[1];
                var16 = var14[0];
                var17 = var14[2];
            }
            int[] var19;
            if (this.field27.field3927) {
                var19 = this.field27.method33(var12, (byte) 48);
            } else {
                var19 = this.field27.method34(var12, (byte) -104)[0];
            }
            if (arg6) {
                var11 = var12;
            }
            for (int var20 = arg5 - 1; var20 >= 0; var20--) {
                int var21 = var16[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var15[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var17[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = class36.field500[var21];
                int var25 = class36.field500[var22];
                int var26 = class36.field500[var23];
                int var27;
                if (var24 == 0 && var25 == 0 && var26 == 0) {
                    var27 = 0;
                } else {
                    var27 = var19[var20] >> 4;
                    if (var27 > 255) {
                        var27 = 255;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                }
                var10[var11++] = (var24 << 16) + var26 + (var25 << 8) + (var27 << 24);
                if (arg6) {
                    var11 += arg5 - 1;
                }
            }
            var12++;
        }
        for (int var13 = 0; var13 < this.field26.length; var13++) {
            this.field26[var13].method398(true);
        }
        return var10;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lok;BLga;)Z")
    public final boolean method10(class74 arg0, byte arg1, class243 arg2) {
        field18++;
        if (class474.field6985 >= 0) {
            for (int var4 = 0; var4 < this.field25.length; var4++) {
                if (!arg0.method538(class474.field6985, 100, this.field25[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field25.length; var5++) {
                if (!arg0.method551(98, this.field25[var5])) {
                    return false;
                }
            }
        }
        if (arg1 <= 35) {
            this.method11(-0.26855241037886135D, -17, true, null, null, -72, 22, false);
        }
        for (int var6 = 0; var6 < this.field17.length; var6++) {
            if (!arg2.method1482((byte) 118, this.field17[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(DIZLga;Lok;IIZ)[I")
    public final int[] method11(double arg0, int arg1, boolean arg2, class243 arg3, class74 arg4, int arg5, int arg6, boolean arg7) {
        class446.field6578 = arg4;
        class119.field1822 = arg3;
        field23++;
        if (arg6 != 1) {
            method12(null, -43);
        }
        for (int var10 = 0; var10 < this.field26.length; var10++) {
            this.field26[var10].method399(arg1, (byte) 120, arg5);
        }
        class312.method1964(arg0, (byte) 119);
        class275.method1714(84, arg5, arg1);
        int[] var11 = new int[arg1 * arg5];
        int var12;
        int var13;
        byte var14;
        if (arg2) {
            var13 = arg1 - 1;
            var14 = -1;
            var12 = -1;
        } else {
            var12 = arg1;
            var13 = 0;
            var14 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg5; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field24.field3927) {
                int[] var18 = this.field24.method33(var16, (byte) 66);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field24.method34(var16, (byte) -94);
                var21 = var22[1];
                var19 = var22[2];
                var20 = var22[0];
            }
            if (arg7) {
                var15 = var16;
            }
            for (int var23 = var13; var23 != var12; var23 += var14) {
                int var24 = var20[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var21[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var19[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class36.field500[var25];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class36.field500[var24];
                int var29 = class36.field500[var26];
                int var30 = (var28 << 16) + (var27 << 8) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg7) {
                    var15 += arg1 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field26.length; var17++) {
            this.field26[var17].method398(true);
        }
        return var11;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lgk;I)Lnb;")
    public static final class226 method12(class468 arg0, int arg1) {
        field20++;
        if (arg1 != 0) {
            field30 = null;
        }
        return new class226(arg0.method2745(arg1 - 1), arg0.method2745(-1), arg0.method2745(arg1 - 1), arg0.method2745(-1), arg0.method2745(~arg1), arg0.method2745(-1), arg0.method2745(-1), arg0.method2745(-1), arg0.method2759(arg1 ^ 0x726F9370), arg0.method2765(127));
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILga;Lok;ZIZ)[F")
    public final float[] method13(int arg0, class243 arg1, class74 arg2, boolean arg3, int arg4, boolean arg5) {
        class446.field6578 = arg2;
        if (arg5) {
            field21 = null;
        }
        class119.field1822 = arg1;
        field22++;
        for (int var7 = 0; var7 < this.field26.length; var7++) {
            this.field26[var7].method399(arg4, (byte) -113, arg0);
        }
        class275.method1714(98, arg0, arg4);
        float[] var8 = new float[arg4 * 4 * arg0];
        int var9 = 0;
        for (int var10 = 0; var10 < arg0; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field24.field3927) {
                int[] var12 = this.field24.method33(var10, (byte) 63);
                var13 = var12;
                var14 = var12;
                var15 = var12;
            } else {
                int[][] var16 = this.field24.method34(var10, (byte) -103);
                var13 = var16[2];
                var14 = var16[1];
                var15 = var16[0];
            }
            int[] var17;
            if (this.field27.field3927) {
                var17 = this.field27.method33(var10, (byte) 41);
            } else {
                var17 = this.field27.method34(var10, (byte) -108)[0];
            }
            if (arg3) {
                var9 = var10 << 2;
            }
            int[] var18;
            if (this.field29.field3927) {
                var18 = this.field29.method33(var10, (byte) 127);
            } else {
                var18 = this.field29.method34(var10, (byte) -74)[0];
            }
            for (int var19 = arg4 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                if (var20 < 0.0F) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = var20;
                if (arg3) {
                    var9 += (arg4 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field26.length; var11++) {
            this.field26[var11].method398(true);
        }
        return var8;
    }

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "(B)V")
    public static void method14(byte arg0) {
        field28 = null;
        int var1 = 94 % ((arg0 + 14) / 49);
        field30 = null;
        field21 = null;
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "()V")
    public class3() {
        this.field25 = new int[0];
        this.field17 = new int[0];
        this.field29 = new class495(0);
        this.field29.field3928 = 1;
        this.field24 = new class495();
        this.field24.field3928 = 1;
        this.field27 = new class495();
        this.field27.field3928 = 1;
        this.field26 = new class263[] { this.field24, this.field27, this.field29 };
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lgk;)V")
    public class3(class468 arg0) {
        int var2 = arg0.method2765(59);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field26 = new class263[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class263 var16 = class481.method2871(arg0, -5668);
            if (var16.method555(false) >= 0) {
                var3++;
            }
            if (var16.method400(-31427) >= 0) {
                var4++;
            }
            int var17 = var16.field3929.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method2765(80);
            }
            this.field26[var6] = var16;
        }
        this.field25 = new int[var3];
        this.field17 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class263 var11 = this.field26[var9];
            int var12 = var11.field3929.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field3929[var13] = this.field26[var5[var9][var13]];
            }
            int var14 = var11.method555(false);
            int var15 = var11.method400(-31427);
            if (var14 > 0) {
                this.field25[var7++] = var14;
            }
            if (var15 > 0) {
                this.field17[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field24 = this.field26[arg0.method2765(54)];
        this.field27 = this.field26[arg0.method2765(59)];
        Object var10 = null;
        this.field29 = this.field26[arg0.method2765(82)];
    }
}
