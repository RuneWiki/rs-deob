import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class370 extends class459 implements class326 {

    @OriginalMember(owner = "client!tk", name = "p", descriptor = "I")
    private int field5150;

    @OriginalMember(owner = "client!tk", name = "o", descriptor = "Lim;")
    public static class353 field5149 = new class353(87, -1);

    @OriginalMember(owner = "client!tk", name = "u", descriptor = "Lbv;")
    public static class568 field5155 = new class568();

    @OriginalMember(owner = "client!tk", name = "y", descriptor = "I")
    public static int field5159 = 0;

    @OriginalMember(owner = "client!tk", name = "w", descriptor = "Ldh;")
    public static class321 field5157 = new class321("", 14);

    @OriginalMember(owner = "client!tk", name = "z", descriptor = "[I")
    public static int[] field5160 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!tk", name = "C", descriptor = "I")
    public static int field5162 = 13156520;

    @OriginalMember(owner = "client!tk", name = "A", descriptor = "Lim;")
    public static class353 field5161 = new class353(28, 2);

    @OriginalMember(owner = "client!tk", name = "n", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!tk", name = "q", descriptor = "I")
    public static int field5151;

    @OriginalMember(owner = "client!tk", name = "r", descriptor = "I")
    public static int field5152;

    @OriginalMember(owner = "client!tk", name = "s", descriptor = "I")
    public static int field5153;

    @OriginalMember(owner = "client!tk", name = "t", descriptor = "I")
    public static int field5154;

    @OriginalMember(owner = "client!tk", name = "v", descriptor = "I")
    public static int field5156;

    @OriginalMember(owner = "client!tk", name = "x", descriptor = "I")
    public static int field5158;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B[BII)V")
    public final void method173(byte arg0, byte[] arg1, int arg2, int arg3) {
        this.method2660(false, arg1, arg3);
        ++field5158;
        this.field5150 = arg2;
        int var5 = -120 % ((-60 - arg0) / 62);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)I")
    public final int method172(int arg0) {
        if (arg0 != 10903) {
            field5161 = null;
        }
        ++field5154;
        return this.field5150;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)J")
    public final long method169(int arg0) {
        ++field5152;
        if (arg0 != 21445) {
            this.method877((byte) 34);
        }
        return 0L;
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Luq;I[BIZ)V")
    public class370(class313 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field5150 = arg1;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)I")
    public final int method171(boolean arg0) {
        ++field5148;
        return !arg0 ? 75 : super.field6550;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIIFFFI)[F")
    public static final float[] method2263(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6, int arg7) {
        ++field5151;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg2 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg2 * 0.024543693F));
        var8[3] = 0.0F;
        if (arg1 != -1) {
            method2265(false);
        }
        var8[1] = 0.0F;
        var8[0] = var10;
        float var12 = 1.0F - var10;
        var8[7] = 0.0F;
        var8[5] = 0.0F;
        var8[4] = 1.0F;
        var8[2] = var11;
        var8[6] = -var11;
        var8[8] = var10;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = (float) arg0 / 32767.0F;
        float var16 = 0.0F;
        float var17 = -((float) Math.sqrt((double) (-(var15 * var15) + 1.0F)));
        float var18 = -var15 + 1.0F;
        float var19 = (float) Math.sqrt((double) (arg3 * arg3 + arg7 * arg7));
        if (var19 == 0.0F && var15 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var16 = (float) arg7 / var19;
                var14 = (float) (-arg3) / var19;
            }
            var13[5] = var14 * var17;
            var13[1] = var16 * var17;
            var13[6] = var14 * var16 * var18;
            var13[0] = var14 * var14 * var18 + var15;
            var13[4] = var15;
            var13[3] = -var16 * var17;
            var13[2] = var14 * var16 * var18;
            var13[8] = var16 * var16 * var18 + var15;
            var13[7] = -var14 * var17;
            var9[0] = var8[2] * var13[6] + var8[1] * var13[3] + var8[0] * var13[0];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
            var9[2] = var8[2] * var13[8] + var8[1] * var13[5] + var8[0] * var13[2];
            var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
            var9[5] = var8[5] * var13[8] + var8[4] * var13[5] + var8[3] * var13[2];
            var9[6] = var8[8] * var13[6] + var8[7] * var13[3] + var8[6] * var13[0];
            var9[7] = var8[8] * var13[7] + var8[6] * var13[1] + var8[7] * var13[4];
            var9[8] = var8[8] * var13[8] + var8[7] * var13[5] + var8[6] * var13[2];
        }
        var9[5] *= arg5;
        var9[6] *= arg4;
        var9[0] *= arg6;
        var9[3] *= arg5;
        var9[4] *= arg5;
        var9[1] *= arg6;
        var9[8] *= arg4;
        var9[7] *= arg4;
        var9[2] *= arg6;
        return var9;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(B)V")
    public final void method877(byte arg0) {
        if (arg0 == -11) {
            super.field6551.method1948(this, true);
            ++field5153;
        }
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "(I)V")
    public static void method2264(int arg0) {
        field5149 = null;
        field5155 = null;
        field5160 = null;
        field5161 = null;
        if (arg0 != 1) {
            method2264(97);
        }
        field5157 = null;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(Z)V")
    public static final void method2265(boolean arg0) {
        class95.field1280.method3178(-8299);
        ++field5156;
        class266.field3405.method3178(-8299);
        if (arg0) {
            field5161 = null;
        }
        for (class245 var1 = (class245) class57.field760.method3188((byte) -100); var1 != null; var1 = (class245) class57.field760.method3182((byte) -92)) {
            int var18 = var1.field3094;
            if (var18 < 1000) {
                var1.method589(-8880);
                if (~var18 != -31 && var18 != 22 && ~var18 != -9 && var18 != 10 && ~var18 != -6 && ~var18 != -61 && ~var18 != -3) {
                    class95.field1280.method3181(var1, !arg0);
                } else {
                    class266.field3405.method3181(var1, true);
                }
            }
        }
        class95.field1280.method3183(class57.field760, -91);
        class266.field3405.method3183(class57.field760, -126);
        if (class50.field673 > 1) {
            if (class592.field8560 && class634.field9227.method2004((byte) -78, 81) && ~class50.field673 < -3) {
                class84.field1136 = (class245) class57.field760.field7933.field1399.field1399;
            } else {
                class84.field1136 = (class245) class57.field760.field7933.field1399;
            }
        } else {
            class84.field1136 = null;
        }
        int var2 = -1;
        class7 var3 = (class7) class644.field9336.method3188((byte) -100);
        if (var3 != null) {
            var2 = var3.method29((byte) -91);
        }
        if (class264.field3373) {
            if (~var2 == 0) {
                int var4 = class343.field4760.method100((byte) -123);
                int var5 = class343.field4760.method92(8);
                if (~(class431.field5868 + -10) < ~var4 || var4 > class431.field5868 - -class641.field9318 + 10 || var5 < class423.field5739 + -10 || ~var5 < ~(class81.field1095 + class423.field5739 + 10)) {
                    class24.method150(42);
                }
            }
            if (~var2 == -1) {
                int var6 = class431.field5868;
                int var7 = class423.field5739;
                int var8 = class641.field9318;
                int var9 = var3.method27(2);
                int var10 = var3.method32(32679);
                int var11 = -1;
                for (int var12 = 0; ~class50.field673 < ~var12; ++var12) {
                    if (!class641.field9319) {
                        int var16 = (-var12 + class50.field673 - 1) * 16 + var7 + 31;
                        if (~var6 > ~var9 && ~(var6 + var8) < ~var9 && var16 + -13 < var10 && var10 < var16 + 3) {
                            var11 = var12;
                        }
                    } else {
                        int var17 = (class50.field673 - (var12 + 1)) * 16 + (var7 - -33);
                        if (~var9 < ~var6 && ~(var6 + var8) < ~var9 && var10 > var17 + -13 && ~(var17 + 4) < ~var10) {
                            var11 = var12;
                        }
                    }
                }
                if (var11 != -1) {
                    int var13 = 0;
                    class273 var14 = new class273(class57.field760);
                    for (class245 var15 = (class245) var14.method1669(-25264); var15 != null; var15 = (class245) var14.method1670((byte) 114)) {
                        if (~var11 == ~var13) {
                            class637.method3670(1, var9, var10, var15);
                        }
                        ++var13;
                    }
                }
                class24.method150(-124);
                return;
            }
        } else {
            if (~var2 == -1 && (~class598.field8641 == -2 && class50.field673 > 2 || class179.method1105((byte) 3))) {
                var2 = 2;
            }
            if (var2 == 2 && class50.field673 > 0 && var3 != null) {
                if (class15.field162 == null && ~class538.field7521 == -1) {
                    class165.method894(var3.method32(32679), (byte) -119, var3.method27(2));
                } else {
                    class396.field5469 = 2;
                }
            }
            if (~var2 == -1 && class50.field673 > 0) {
                class495.method2781(81);
            }
            if (class15.field162 != null || ~class538.field7521 != -1) {
                return;
            }
            class396.field5469 = 0;
            class228.field2928 = null;
        }
    }
}
