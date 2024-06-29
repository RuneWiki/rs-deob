import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class294 extends class225 {

    @OriginalMember(owner = "client!tg", name = "G", descriptor = "[I")
    private int[] field4218;

    @OriginalMember(owner = "client!tg", name = "w", descriptor = "[I")
    private int[] field4208;

    @OriginalMember(owner = "client!tg", name = "M", descriptor = "Lfa;")
    private class398 field4223;

    @OriginalMember(owner = "client!tg", name = "y", descriptor = "Lfa;")
    private class398 field4210;

    @OriginalMember(owner = "client!tg", name = "A", descriptor = "Lfa;")
    private class398 field4212;

    @OriginalMember(owner = "client!tg", name = "I", descriptor = "[Lfa;")
    private class398[] field4220;

    @OriginalMember(owner = "client!tg", name = "E", descriptor = "I")
    public static int field4216 = 0;

    @OriginalMember(owner = "client!tg", name = "N", descriptor = "Ljava/lang/String;")
    public static String field4224 = "red:";

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!tg", name = "B", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!tg", name = "C", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!tg", name = "D", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!tg", name = "F", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!tg", name = "J", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!tg", name = "L", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!tg", name = "x", descriptor = "Lwl;")
    public static class273 field4209;

    @OriginalMember(owner = "client!tg", name = "H", descriptor = "[S")
    public static short[] field4219;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(Z)V")
    public static void method2007(boolean arg0) {
        field4224 = null;
        if (arg0) {
            method2012(93, 121);
        }
        field4219 = null;
        field4209 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IILlm;ZIDLfh;Z)[I")
    public final int[] method2008(int arg0, int arg1, class347 arg2, boolean arg3, int arg4, double arg5, class210 arg6, boolean arg7) {
        class94.field1354 = arg2;
        class198.field2638 = arg6;
        field4214++;
        for (int var10 = 0; var10 < this.field4220.length; var10++) {
            this.field4220[var10].method1274(arg1, arg4, -256);
        }
        class442.method2785(arg5, false);
        class226.method1308((byte) -59, arg1, arg4);
        int[] var11 = new int[arg1 * arg4];
        int var12;
        int var13;
        byte var14;
        if (arg3) {
            var12 = arg1 - 1;
            var13 = -1;
            var14 = -1;
        } else {
            var12 = 0;
            var13 = arg1;
            var14 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg4; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field4210.field5931) {
                int[] var18 = this.field4210.method95(var16, 0);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field4210.method99(var16, 2);
                var19 = var22[2];
                var20 = var22[1];
                var21 = var22[0];
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
                int var27 = class442.field6470[var25];
                int var28 = class442.field6470[var24];
                int var29 = class442.field6470[var26];
                int var30 = (var28 << 16) - (-(var27 << 8) - var29);
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg7) {
                    var15 += arg1 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field4220.length; var17++) {
            this.field4220[var17].method1273(-62);
        }
        if (arg0 >= -26) {
            this.field4223 = null;
        }
        return var11;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZZB)V")
    public static final void method2009(boolean arg0, boolean arg1, byte arg2) {
        if (arg1) {
            class379.field5523--;
            if (class379.field5523 == 0) {
                class349.field5050 = null;
            }
        }
        field4215++;
        if (arg2 != -81) {
            field4224 = null;
        }
        if (!arg0) {
            return;
        }
        class416.field6107--;
        if (class416.field6107 == 0) {
            class291.field4168 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILlm;IZLfh;B)[F")
    public final float[] method2010(int arg0, class347 arg1, int arg2, boolean arg3, class210 arg4, byte arg5) {
        if (arg5 != -41) {
            field4216 = -82;
        }
        class94.field1354 = arg1;
        field4221++;
        class198.field2638 = arg4;
        for (int var7 = 0; var7 < this.field4220.length; var7++) {
            this.field4220[var7].method1274(arg2, arg0, -256);
        }
        class226.method1308((byte) -116, arg2, arg0);
        float[] var8 = new float[arg0 * arg2 * 4];
        int var9 = 0;
        for (int var10 = 0; var10 < arg0; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field4210.field5931) {
                int[] var16 = this.field4210.method95(var10, 0);
                var13 = var16;
                var15 = var16;
                var14 = var16;
            } else {
                int[][] var12 = this.field4210.method99(var10, 2);
                var13 = var12[0];
                var14 = var12[2];
                var15 = var12[1];
            }
            int[] var17;
            if (this.field4212.field5931) {
                var17 = this.field4212.method95(var10, 0);
            } else {
                var17 = this.field4212.method99(var10, 2)[0];
            }
            int[] var18;
            if (this.field4223.field5931) {
                var18 = this.field4223.method95(var10, 0);
            } else {
                var18 = this.field4223.method99(var10, arg5 + 43)[0];
            }
            if (arg3) {
                var9 = var10 << 2;
            }
            for (int var19 = arg2 - 1; var19 >= 0; var19--) {
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
                if (arg3) {
                    var9 += (arg2 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field4220.length; var11++) {
            this.field4220[var11].method1273(-43);
        }
        return var8;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lfh;Llm;I)Z")
    public final boolean method2011(class210 arg0, class347 arg1, int arg2) {
        field4222++;
        if (class84.field1210 <= 0) {
            for (int var4 = 0; var4 < this.field4208.length; var4++) {
                if (!arg1.method2257(true, this.field4208[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field4208.length; var5++) {
                if (!arg1.method2263(class84.field1210, this.field4208[var5], 113)) {
                    return false;
                }
            }
        }
        for (int var6 = arg2; var6 < this.field4218.length; var6++) {
            if (!arg0.method184(this.field4218[var6], arg2 ^ 0x38DC)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)Lfn;")
    public static final class318 method2012(int arg0, int arg1) {
        field4217++;
        int var2 = 96 % ((arg0 + 23) / 33);
        class318 var3 = (class318) class93.field1329.method1137((long) arg1, 2108653711);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class89.field1244.method2261(arg1, 29, 122);
        class318 var5 = new class318();
        if (var4 != null) {
            var5.method2142(false, new class228(var4), arg1);
        }
        class93.field1329.method1144((long) arg1, var5, -3480);
        return var5;
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V")
    public class294() {
        this.field4218 = new int[0];
        this.field4208 = new int[0];
        this.field4223 = new class229(0);
        this.field4223.field5918 = 1;
        this.field4210 = new class229();
        this.field4210.field5918 = 1;
        this.field4212 = new class229();
        this.field4212.field5918 = 1;
        this.field4220 = new class398[] { this.field4210, this.field4212, this.field4223 };
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lfh;DIZILlm;Z)[I")
    public final int[] method2013(class210 arg0, double arg1, int arg2, boolean arg3, int arg4, class347 arg5, boolean arg6) {
        class94.field1354 = arg5;
        class198.field2638 = arg0;
        field4211++;
        for (int var9 = 0; var9 < this.field4220.length; var9++) {
            this.field4220[var9].method1274(arg2, arg4, -256);
        }
        class442.method2785(arg1, arg3);
        class226.method1308((byte) 92, arg2, arg4);
        int[] var10 = new int[arg2 * 4 * arg4];
        int var11 = 0;
        for (int var12 = 0; var12 < arg4; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field4210.field5931) {
                int[] var14 = this.field4210.method95(var12, 0);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field4210.method99(var12, 2);
                var16 = var18[1];
                var15 = var18[0];
                var17 = var18[2];
            }
            if (arg6) {
                var11 = var12;
            }
            int[] var19;
            if (this.field4212.field5931) {
                var19 = this.field4212.method95(var12, 0);
            } else {
                var19 = this.field4212.method99(var12, 2)[0];
            }
            for (int var20 = arg2 - 1; var20 >= 0; var20--) {
                int var21 = var15[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var16[var20] >> 4;
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
                int var24 = class442.field6470[var21];
                int var25 = class442.field6470[var22];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class442.field6470[var23];
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
                if (arg6) {
                    var11 += arg2 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field4220.length; var13++) {
            this.field4220[var13].method1273(-32);
        }
        return var10;
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lnj;)V")
    public class294(class228 arg0) {
        int var2 = arg0.method1348(-115);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field4220 = new class398[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class398 var16 = class377.method2445(true, arg0);
            if (var16.method2476((byte) -21) >= 0) {
                var3++;
            }
            if (var16.method1279(false) >= 0) {
                var4++;
            }
            int var17 = var16.field5936.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1348(-102);
            }
            this.field4220[var6] = var16;
        }
        this.field4208 = new int[var3];
        int var7 = 0;
        this.field4218 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class398 var11 = this.field4220[var9];
            int var12 = var11.field5936.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field5936[var13] = this.field4220[var5[var9][var13]];
            }
            int var14 = var11.method2476((byte) -21);
            int var15 = var11.method1279(false);
            if (var14 > 0) {
                this.field4208[var7++] = var14;
            }
            if (var15 > 0) {
                this.field4218[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field4210 = this.field4220[arg0.method1348(-119)];
        this.field4212 = this.field4220[arg0.method1348(-124)];
        Object var10 = null;
        this.field4223 = this.field4220[arg0.method1348(-122)];
    }
}
