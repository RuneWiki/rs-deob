import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class18 {

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "[I")
    public static int[] field282 = new int[500];

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "[I")
    public static int[] field281 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "Ljf;")
    public static class229 field286 = class212.method1457((byte) 78, "event_opbase");

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "Ljf;")
    private static class229 field291 = class212.method1457((byte) 64, " more options");

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "Ljf;")
    public static class229 field288 = field291;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "Lrj;")
    public class18 field276;

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "Lrj;")
    public class18 field287;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V", line = 4)
    public final void method172(int arg0) {
        field277++;
        if (arg0 != 338) {
            field282 = (int[]) null;
        }
        if (this.field276 != null) {
            this.field276.field287 = this.field287;
            this.field287.field276 = this.field276;
            this.field276 = null;
            this.field287 = null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)I", line = 22)
    public static final int method173(byte arg0) {
        field279++;
        if (arg0 < 109) {
            field281 = (int[]) null;
        }
        if ((double) class160.field2716 == 3.0D) {
            return 37;
        } else if ((double) class160.field2716 == 4.0D) {
            return 50;
        } else if ((double) class160.field2716 == 6.0D) {
            return 75;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "([[F[[FLdb;I[ILwk;II[[FI[[I)V", line = 54)
    public static final void method174(float[][] arg0, float[][] arg1, class186 arg2, int arg3, int[] arg4, class176 arg5, int arg6, int arg7, float[][] arg8, int arg9, int[][] arg10) {
        field278++;
        if (arg6 < 41) {
            field288 = (class229) null;
        }
        int[] var11 = new int[arg4.length / 2];
        for (int var12 = 0; var12 < var11.length; var12++) {
            int var13 = arg4[var12 + var12];
            int var14 = arg4[var12 + var12 + 1];
            if (arg7 == 1) {
                int var15 = var13;
                var13 = var14;
                var14 = 128 - var15;
            } else if (arg7 == 2) {
                var14 = 128 - var14;
                var13 = 128 - var13;
            } else if (arg7 == 3) {
                int var16 = var13;
                var13 = 128 - var14;
                var14 = var16;
            }
            float var17;
            float var18;
            float var19;
            if (var13 == 0 && var14 == 0) {
                var17 = arg1[arg3][arg9];
                var18 = arg0[arg3][arg9];
                var19 = arg8[arg3][arg9];
            } else if (var13 == 128 && var14 == 0) {
                var19 = arg8[arg3 + 1][arg9];
                var17 = arg1[arg3 + 1][arg9];
                var18 = arg0[arg3 + 1][arg9];
            } else if (var13 == 128 && var14 == 128) {
                var19 = arg8[arg3 + 1][arg9 + 1];
                var18 = arg0[arg3 + 1][arg9 + 1];
                var17 = arg1[arg3 + 1][arg9 + 1];
            } else if (var13 == 0 && var14 == 128) {
                var19 = arg8[arg3][arg9 + 1];
                var18 = arg0[arg3][arg9 + 1];
                var17 = arg1[arg3][arg9 + 1];
            } else {
                float var20 = arg0[arg3][arg9];
                float var21 = arg8[arg3][arg9];
                float var22 = arg1[arg3][arg9];
                float var23 = (float) var13 / 128.0F;
                float var24 = (arg0[arg3 + 1][arg9] - var20) * var23 + var20;
                float var25 = (arg1[arg3 + 1][arg9] - var22) * var23 + var22;
                float var26 = (arg8[arg3 + 1][arg9] - var21) * var23 + var21;
                float var27 = (float) var14 / 128.0F;
                float var28 = arg1[arg3][arg9 + 1];
                float var29 = (arg1[arg3 + 1][arg9 + 1] - var28) * var23 + var28;
                float var30 = arg0[arg3][arg9 + 1];
                float var31 = (arg0[arg3 + 1][arg9 + 1] - var30) * var23 + var30;
                var17 = (var29 - var25) * var27 + var25;
                var18 = (var31 - var24) * var27 + var24;
                float var32 = arg8[arg3][arg9 + 1];
                float var33 = (arg8[arg3 + 1][arg9 + 1] - var32) * var23 + var32;
                var19 = (var33 - var26) * var27 + var26;
            }
            int var34 = (arg3 << 7) + var13;
            int var35 = (arg9 << 7) + var14;
            int var36 = class107.method732(arg9, arg10, false, var14, var13, arg3);
            var11[var12] = arg5.method1193(arg2, var34, var36, var35, var19, var17, var18);
        }
        arg5.method1194(var11);
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)V", line = 171)
    public static final void method175(int arg0) {
        if (arg0 <= 31) {
            field286 = (class229) null;
        }
        class27.field481 = null;
        class321.field5433 = null;
        field285++;
        class8.field86 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BI)V", line = 186)
    public static final void method176(byte arg0, int arg1) {
        class52.field907.method231((byte) 113, arg1);
        if (arg0 == 81) {
            field289++;
        }
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(I)V", line = 205)
    public static void method177(int arg0) {
        if (arg0 >= -102) {
            return;
        }
        field281 = null;
        field291 = null;
        field286 = null;
        field288 = null;
        field282 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZBLjf;)V", line = 220)
    public static final void method178(boolean arg0, byte arg1, class229 arg2) {
        if (arg1 != -4) {
            method176((byte) -124, -54);
        }
        byte var3 = 4;
        field290++;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class249.field4385.method942(arg2, 250);
        int var7 = class249.field4385.method955(arg2, 250) * 13;
        if (class108.field1900) {
            class163.method1102(var5 - var3, -var3 + var4, var3 + var6 + var3, var3 + var3 + var7, 0);
            class163.method1098(var5 - var3, var4 - var3, var3 + var6 + var3, var3 + var7 + var3, 16777215);
        } else {
            class114.method803(var5 - var3, -var3 + var4, var3 + var3 + var6, var3 + var7 - -var3, 0);
            class114.method805(var5 - var3, var4 - var3, var6 + var3 + var3, var3 + var3 + var7, 16777215);
        }
        class249.field4385.method961(arg2, var5, var4, var6, var7, 16777215, -1, 1, 1, 0);
        class122.method872(var5 - var3, var4 - var3, var3 + var3 + var6, 0, var3 + var7 + var3);
        if (!arg0) {
            class47.method405(var6, true, var7, var5, var4);
        } else if (class108.field1900) {
            class108.method759();
        } else {
            try {
                Graphics var8 = class299.field5100.getGraphics();
                class172.field2977.method188(0, (byte) 42, 0, var8);
            } catch (Exception var10) {
                class299.field5100.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(B)V", line = 279)
    public static final void method179(byte arg0) {
        if (arg0 != 101) {
            method173((byte) -16);
        }
        if (class180.field3124 != null) {
            class180.field3124.method402(0);
        }
        field283++;
        if (class244.field4353 != null) {
            class244.field4353.method402(arg0 - 101);
        }
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(B)V", line = 310)
    public static final void method180(byte arg0) {
        class257.method1832((byte) 11, 0, 0);
        field280++;
        if (arg0 >= -31) {
            field281 = (int[]) null;
        }
    }
}
