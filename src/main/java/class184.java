import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class184 extends class36 {

    @OriginalMember(owner = "client!jf", name = "C", descriptor = "[I")
    private int[] field2303;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "[I")
    private int[] field2292;

    @OriginalMember(owner = "client!jf", name = "A", descriptor = "Luh;")
    private class145 field2301;

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "Luh;")
    private class145 field2293;

    @OriginalMember(owner = "client!jf", name = "y", descriptor = "Luh;")
    private class145 field2299;

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "[Luh;")
    private class145[] field2295;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "Lcda;")
    public static class149 field2291 = null;

    @OriginalMember(owner = "client!jf", name = "B", descriptor = "I")
    public static int field2302 = 0;

    @OriginalMember(owner = "client!jf", name = "E", descriptor = "F")
    public static float field2305;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!jf", name = "z", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!jf", name = "D", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "[[S")
    public static short[][] field2290;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V", line = 6)
    public static void method1073(int arg0) {
        field2290 = null;
        field2291 = null;
        if (arg0 != 0) {
            method1079(true, null);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIZLe;Lkea;)[F", line = 24)
    public final float[] method1074(int arg0, int arg1, int arg2, boolean arg3, class462 arg4, class203 arg5) {
        field2300++;
        if (arg0 != -1) {
            method1079(true, null);
        }
        class177.field2184 = arg4;
        class126.field1558 = arg5;
        for (int var7 = 0; var7 < this.field2295.length; var7++) {
            this.field2295[var7].method871(arg0 ^ 0xFF, arg2, arg1);
        }
        class39.method205(arg1, arg2, 100);
        float[] var8 = new float[arg1 * arg2 * 4];
        int var9 = 0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field2293.field1790) {
                int[] var12 = this.field2293.method27(false, var10);
                var13 = var12;
                var14 = var12;
                var15 = var12;
            } else {
                int[][] var16 = this.field2293.method75((byte) -113, var10);
                var14 = var16[2];
                var13 = var16[1];
                var15 = var16[0];
            }
            int[] var17;
            if (this.field2299.field1790) {
                var17 = this.field2299.method27(false, var10);
            } else {
                var17 = this.field2299.method75((byte) -87, var10)[0];
            }
            int[] var18;
            if (this.field2301.field1790) {
                var18 = this.field2301.method27(false, var10);
            } else {
                var18 = this.field2301.method75((byte) -30, var10)[0];
            }
            if (arg3) {
                var9 = var10 << 2;
            }
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                if (var20 < 0.0F) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = var20;
                if (arg3) {
                    var9 += (arg1 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field2295.length; var11++) {
            this.field2295[var11].method76(-1);
        }
        return var8;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(DLe;Lkea;ZIIIZ)[I", line = 139)
    public final int[] method1075(double arg0, class462 arg1, class203 arg2, boolean arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field2304++;
        class126.field1558 = arg2;
        if (arg6 != -1) {
            return null;
        }
        class177.field2184 = arg1;
        for (int var10 = 0; var10 < this.field2295.length; var10++) {
            this.field2295[var10].method871(-256, arg4, arg5);
        }
        class456.method2818(arg0, -10042);
        class39.method205(arg5, arg4, arg6 + 103);
        int[] var11 = new int[arg4 * arg5];
        int var12;
        int var13;
        byte var14;
        if (arg3) {
            var13 = -1;
            var14 = -1;
            var12 = arg5 - 1;
        } else {
            var12 = 0;
            var13 = arg5;
            var14 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg4; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field2293.field1790) {
                int[] var22 = this.field2293.method27(false, var16);
                var19 = var22;
                var21 = var22;
                var20 = var22;
            } else {
                int[][] var18 = this.field2293.method75((byte) -64, var16);
                var19 = var18[2];
                var20 = var18[1];
                var21 = var18[0];
            }
            if (arg7) {
                var15 = var16;
            }
            for (int var23 = var12; var23 != var13; var23 += var14) {
                int var24 = var21[var23] >> 4;
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
                int var26 = var19[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var27 = class566.field8079[var24];
                int var28 = class566.field8079[var25];
                int var29 = class566.field8079[var26];
                int var30 = (var27 << 16) + var29 + (var28 << 8);
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg7) {
                    var15 += arg5 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field2295.length; var17++) {
            this.field2295[var17].method76(-1);
        }
        return var11;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILe;ZDZILkea;)[I", line = 274)
    public final int[] method1076(int arg0, class462 arg1, boolean arg2, double arg3, boolean arg4, int arg5, class203 arg6) {
        field2297++;
        class177.field2184 = arg1;
        class126.field1558 = arg6;
        for (int var9 = 0; var9 < this.field2295.length; var9++) {
            this.field2295[var9].method871(-256, arg5, arg0);
        }
        class456.method2818(arg3, -10042);
        class39.method205(arg0, arg5, 93);
        int[] var10 = new int[arg0 * arg5 * 4];
        int var11 = 0;
        for (int var12 = 0; var12 < arg5; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field2293.field1790) {
                int[] var14 = this.field2293.method27(false, var12);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field2293.method75((byte) -49, var12);
                var15 = var18[1];
                var16 = var18[2];
                var17 = var18[0];
            }
            int[] var19;
            if (this.field2299.field1790) {
                var19 = this.field2299.method27(!arg2, var12);
            } else {
                var19 = this.field2299.method75((byte) -40, var12)[0];
            }
            if (arg4) {
                var11 = var12;
            }
            for (int var20 = arg0 - 1; var20 >= 0; var20--) {
                int var21 = var17[var20] >> 4;
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
                int var23 = var16[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = class566.field8079[var21];
                int var25 = class566.field8079[var22];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class566.field8079[var23];
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
                var10[var11++] = (var24 << 16) + (var25 << 8) + (var27 << 24) + var26;
                if (arg4) {
                    var11 += arg0 - 1;
                }
            }
        }
        if (!arg2) {
            field2305 = 2.4131522F;
        }
        for (int var13 = 0; var13 < this.field2295.length; var13++) {
            this.field2295[var13].method76(-1);
        }
        return var10;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIBI)V", line = 413)
    public static final void method1077(int arg0, int arg1, byte arg2, int arg3) {
        field2296++;
        if (arg2 > -121) {
            return;
        }
        int var4 = class595.field8694.field6562 * arg3 >> 8;
        if (var4 != 0 && arg1 != -1) {
            class254.method1692(arg1, (byte) -60, class498.field7254, 0, false, var4);
            class93.field1095 = true;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Le;BLkea;)Z", line = 437)
    public final boolean method1078(class462 arg0, byte arg1, class203 arg2) {
        field2294++;
        if (arg1 != 106) {
            this.method1076(54, null, false, -0.8850815513823561D, false, 108, null);
        }
        if (class198.field2673 >= 0) {
            for (int var4 = 0; var4 < this.field2292.length; var4++) {
                if (!arg2.method1284(class198.field2673, (byte) 52, this.field2292[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field2292.length; var5++) {
                if (!arg2.method1311(this.field2292[var5], (byte) -93)) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field2303.length; var6++) {
            if (!arg0.method436(this.field2303[var6], -5686)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z[B)Z", line = 491)
    public static final boolean method1079(boolean arg0, byte[] arg1) {
        field2298++;
        class194 var2 = new class194(arg1);
        int var3 = var2.method1177(255);
        if (var3 != 2) {
            return false;
        } else if (arg0) {
            boolean var4 = var2.method1177(255) == 1;
            if (var4) {
                class89.method571(var2, 1);
            }
            class496.method2976(-112, var2);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V", line = 519)
    public class184() {
        this.field2303 = new int[0];
        this.field2292 = new int[0];
        this.field2301 = new class5(0);
        this.field2301.field1787 = 1;
        this.field2293 = new class5();
        this.field2293.field1787 = 1;
        this.field2299 = new class5();
        this.field2299.field1787 = 1;
        this.field2295 = new class145[] { this.field2293, this.field2299, this.field2301 };
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lrt;)V", line = 536)
    public class184(class194 arg0) {
        int var2 = arg0.method1177(255);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field2295 = new class145[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class145 var16 = class202.method1278(arg0, true);
            if (var16.method74(9104) >= 0) {
                var3++;
            }
            if (var16.method868(-1) >= 0) {
                var4++;
            }
            int var17 = var16.field1796.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1177(255);
            }
            this.field2295[var6] = var16;
        }
        this.field2292 = new int[var3];
        this.field2303 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class145 var11 = this.field2295[var9];
            int var12 = var11.field1796.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field1796[var13] = this.field2295[var5[var9][var13]];
            }
            int var14 = var11.method74(9104);
            int var15 = var11.method868(-1);
            if (var14 > 0) {
                this.field2292[var7++] = var14;
            }
            if (var15 > 0) {
                this.field2303[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field2293 = this.field2295[arg0.method1177(255)];
        this.field2299 = this.field2295[arg0.method1177(255)];
        Object var10 = null;
        this.field2301 = this.field2295[arg0.method1177(255)];
    }
}
