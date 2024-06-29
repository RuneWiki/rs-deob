import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class208 extends class271 {

    @OriginalMember(owner = "client!en", name = "H", descriptor = "[I")
    private int[] field2970;

    @OriginalMember(owner = "client!en", name = "N", descriptor = "[I")
    private int[] field2976;

    @OriginalMember(owner = "client!en", name = "P", descriptor = "Lqb;")
    private class148 field2978;

    @OriginalMember(owner = "client!en", name = "I", descriptor = "Lqb;")
    private class148 field2971;

    @OriginalMember(owner = "client!en", name = "S", descriptor = "Lqb;")
    private class148 field2980;

    @OriginalMember(owner = "client!en", name = "C", descriptor = "[Lqb;")
    private class148[] field2965;

    @OriginalMember(owner = "client!en", name = "J", descriptor = "[I")
    public static int[] field2972 = new int[2048];

    @OriginalMember(owner = "client!en", name = "B", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!en", name = "D", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!en", name = "E", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!en", name = "F", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!en", name = "G", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!en", name = "K", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!en", name = "L", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!en", name = "M", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!en", name = "O", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!en", name = "Q", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!en", name = "T", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!en", name = "U", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ZILm;Lic;IB)[F")
    public final float[] method1396(boolean arg0, int arg1, class126 arg2, class491 arg3, int arg4, byte arg5) {
        class67.field1032 = arg3;
        class470.field6933 = arg2;
        field2975++;
        for (int var7 = 0; var7 < this.field2965.length; var7++) {
            this.field2965[var7].method428(arg4, (byte) -126, arg1);
        }
        class374.method2297(arg4, true, arg1);
        float[] var8 = new float[arg4 * 4 * arg1];
        int var9 = 0;
        for (int var10 = 0; var10 < arg1; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field2971.field2183) {
                int[] var12 = this.field2971.method25(-108, var10);
                var13 = var12;
                var14 = var12;
                var15 = var12;
            } else {
                int[][] var16 = this.field2971.method27(true, var10);
                var15 = var16[1];
                var13 = var16[0];
                var14 = var16[2];
            }
            int[] var17;
            if (this.field2980.field2183) {
                var17 = this.field2980.method25(-112, var10);
            } else {
                var17 = this.field2980.method27(true, var10)[0];
            }
            if (arg0) {
                var9 = var10 << 2;
            }
            int[] var18;
            if (this.field2978.field2183) {
                var18 = this.field2978.method25(-86, var10);
            } else {
                var18 = this.field2978.method27(true, var10)[0];
            }
            for (int var19 = arg4 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                if (var20 < 0.0F) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = var20;
                if (arg0) {
                    var9 += (arg4 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field2965.length; var11++) {
            this.field2965[var11].method424((byte) -92);
        }
        if (arg5 < 101) {
            this.method1406(true, 20, 1.168048774523292D, -61, 53, null, null);
        }
        return var8;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V")
    public static final void method1397(int arg0) {
        field2969++;
        int var1 = 0;
        if (arg0 != 1) {
            field2973 = 28;
        }
        for (int var2 = 0; var2 < class30.field323; var2++) {
            for (int var3 = 0; var3 < class182.field2661; var3++) {
                if (class425.method2548(var1, arg0 + 255, var2, class108.field1553, true, var3)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IZ)Z")
    public static final boolean method1398(int arg0, boolean arg1) {
        field2982++;
        if (!arg1) {
            return true;
        } else if (arg0 == 58 || arg0 == 22 || arg0 == 20 || arg0 == 50 || arg0 == 2) {
            return true;
        } else {
            return arg0 == 12 || arg0 == 1004;
        }
    }

    @OriginalMember(owner = "client!en", name = "f", descriptor = "(I)V")
    public static void method1399(int arg0) {
        field2972 = null;
        if (arg0 != -513) {
            field2973 = 54;
        }
    }

    @OriginalMember(owner = "client!en", name = "g", descriptor = "(I)V")
    public static final void method1400(int arg0) {
        if (arg0 != -16) {
            return;
        }
        field2974++;
        if (class347.field4998) {
            return;
        }
        class264.field3869 = true;
        if (class426.field6401.field1013) {
            class24.field262 = ((int) class24.field262 - 17 & 0xFFFFFFF0);
        } else {
            class244.field3608 += (-12.0F - class244.field3608) / 2.0F;
        }
        class347.field4998 = true;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lm;ILic;)Z")
    public final boolean method1401(class126 arg0, int arg1, class491 arg2) {
        field2966++;
        if (arg1 != -3487) {
            field2973 = 24;
        }
        if (class371.field5670 >= 0) {
            for (int var4 = 0; var4 < this.field2976.length; var4++) {
                if (!arg2.method2922(this.field2976[var4], class371.field5670, true)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field2976.length; var5++) {
                if (!arg2.method2924((byte) -125, this.field2976[var5])) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field2970.length; var6++) {
            if (!arg0.method839(this.field2970[var6], (byte) 56)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIB)V")
    public static final void method1402(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg3 > arg1) {
            class415.method2491(arg3, arg1, class339.field4800[arg2], arg0, -31541);
        } else {
            class415.method2491(arg1, arg3, class339.field4800[arg2], arg0, -31541);
        }
        if (arg4 == 121) {
            field2967++;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ZLic;DZLm;III)[I")
    public final int[] method1403(boolean arg0, class491 arg1, double arg2, boolean arg3, class126 arg4, int arg5, int arg6, int arg7) {
        class67.field1032 = arg1;
        field2968++;
        class470.field6933 = arg4;
        for (int var10 = 0; var10 < this.field2965.length; var10++) {
            this.field2965[var10].method428(arg7, (byte) 44, arg5);
        }
        class482.method2860(arg2, -117);
        class374.method2297(arg7, true, arg5);
        int[] var11 = new int[arg5 * arg7];
        byte var12;
        int var13;
        int var14;
        if (arg3) {
            var13 = -1;
            var14 = arg7 - 1;
            var12 = -1;
        } else {
            var12 = 1;
            var13 = arg7;
            var14 = 0;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg5; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field2971.field2183) {
                int[] var22 = this.field2971.method25(-92, var16);
                var21 = var22;
                var19 = var22;
                var20 = var22;
            } else {
                int[][] var18 = this.field2971.method27(true, var16);
                var19 = var18[2];
                var20 = var18[1];
                var21 = var18[0];
            }
            if (arg0) {
                var15 = var16;
            }
            for (int var23 = var14; var23 != var13; var23 += var12) {
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
                int var27 = class70.field1058[var24];
                int var28 = class70.field1058[var25];
                int var29 = class70.field1058[var26];
                int var30 = (var28 << 8) + (var27 << 16) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg0) {
                    var15 += arg7 - 1;
                }
            }
        }
        if (arg6 != -1) {
            this.method1396(false, -95, null, null, 55, (byte) -101);
        }
        for (int var17 = 0; var17 < this.field2965.length; var17++) {
            this.field2965[var17].method424((byte) -111);
        }
        return var11;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIZIII)I")
    public static final int method1404(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if ((arg2 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg6;
            arg6 = var7;
        }
        if (arg3) {
            return -99;
        }
        field2964++;
        int var8 = arg0 & 0x3;
        if (var8 == 0) {
            return arg5;
        } else if (var8 == 1) {
            return arg4;
        } else if (var8 == 2) {
            return 7 + 1 - arg5 - arg1;
        } else {
            return 7 + 1 - arg4 - arg6;
        }
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "()V")
    public class208() {
        this.field2970 = new int[0];
        this.field2976 = new int[0];
        this.field2978 = new class385(0);
        this.field2978.field2196 = 1;
        this.field2971 = new class385();
        this.field2971.field2196 = 1;
        this.field2980 = new class385();
        this.field2980.field2196 = 1;
        this.field2965 = new class148[] { this.field2971, this.field2980, this.field2978 };
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method1405(byte arg0, String arg1) {
        field2977++;
        int var2 = arg1.length();
        int var3 = -54 / (arg0 / 32);
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            var4 = (var4 << 5) + class291.method1862(arg1.charAt(var5), 24237) - var4;
        }
        return var4;
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Ldh;)V")
    public class208(class209 arg0) {
        int var2 = arg0.method1428(32122);
        int var3 = 0;
        int var4 = 0;
        this.field2965 = new class148[var2];
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class148 var16 = class434.method2613((byte) 76, arg0);
            if (var16.method973((byte) 35) >= 0) {
                var3++;
            }
            if (var16.method426((byte) 94) >= 0) {
                var4++;
            }
            int var17 = var16.field2197.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1428(32122);
            }
            this.field2965[var6] = var16;
        }
        this.field2976 = new int[var3];
        int var7 = 0;
        this.field2970 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class148 var11 = this.field2965[var9];
            int var12 = var11.field2197.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field2197[var13] = this.field2965[var5[var9][var13]];
            }
            int var14 = var11.method973((byte) 35);
            int var15 = var11.method426((byte) -48);
            if (var14 > 0) {
                this.field2976[var7++] = var14;
            }
            if (var15 > 0) {
                this.field2970[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field2971 = this.field2965[arg0.method1428(32122)];
        this.field2980 = this.field2965[arg0.method1428(32122)];
        Object var10 = null;
        this.field2978 = this.field2965[arg0.method1428(32122)];
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ZIDIILm;Lic;)[I")
    public final int[] method1406(boolean arg0, int arg1, double arg2, int arg3, int arg4, class126 arg5, class491 arg6) {
        field2981++;
        class67.field1032 = arg6;
        class470.field6933 = arg5;
        for (int var9 = 0; var9 < this.field2965.length; var9++) {
            this.field2965[var9].method428(arg4, (byte) -127, arg3);
        }
        class482.method2860(arg2, -79);
        class374.method2297(arg4, true, arg3);
        int[] var10 = new int[arg3 * arg4 * 4];
        int var11 = 0;
        if (arg1 != -6282) {
            method1400(27);
        }
        for (int var12 = 0; var12 < arg3; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field2971.field2183) {
                int[] var14 = this.field2971.method25(arg1 + 6187, var12);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field2971.method27(true, var12);
                var17 = var18[2];
                var15 = var18[1];
                var16 = var18[0];
            }
            if (arg0) {
                var11 = var12;
            }
            int[] var19;
            if (this.field2980.field2183) {
                var19 = this.field2980.method25(arg1 + 6215, var12);
            } else {
                var19 = this.field2980.method27(true, var12)[0];
            }
            for (int var20 = arg4 - 1; var20 >= 0; var20--) {
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
                int var24 = class70.field1058[var22];
                int var25 = class70.field1058[var21];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class70.field1058[var23];
                int var27;
                if (var25 == 0 && var24 == 0 && var26 == 0) {
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
                var10[var11++] = (var24 << 8) + var26 + (var25 << 16) + (var27 << 24);
                if (arg0) {
                    var11 += arg4 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field2965.length; var13++) {
            this.field2965[var13].method424((byte) -84);
        }
        return var10;
    }
}
