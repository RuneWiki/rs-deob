import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class233 extends class287 {

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
    public int field3633;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)Lok;", line = 9)
    public static final class107 method1673(int arg0, int arg1) {
        field3634++;
        class107 var2 = (class107) class79.field1075.method1351((long) arg0, 63);
        if (var2 != null) {
            return var2;
        } else if (arg1 < 125) {
            return (class107) null;
        } else {
            byte[] var3 = class7.field144.method1813(arg0, 32, true);
            class107 var4 = new class107();
            if (var3 != null) {
                var4.method736(false, new class6(var3));
            }
            var4.method730(5854);
            class79.field1075.method1347(var4, (long) arg0, (byte) -112);
            return var4;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(III)Lig;", line = 36)
    public static final class102 method1674(int arg0, int arg1, int arg2) {
        class124 var3 = class83.field1138[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class102 var4 = var3.field1775;
            var3.field1775 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIBIIIIILmm;)V", line = 49)
    public static final void method1675(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class121 arg8) {
        int var9 = arg5 & 0x3;
        field3637++;
        if (arg2 != 95) {
            field3635 = 120;
        }
        int var10;
        int var11;
        if (var9 == 1 || var9 == 3) {
            var10 = arg8.field1734;
            var11 = arg8.field1724;
        } else {
            var10 = arg8.field1724;
            var11 = arg8.field1734;
        }
        int var12 = (arg1 << 7) + (var11 << 6);
        int var13;
        int var14;
        if ((arg0 + var10) > 104) {
            var13 = arg0 + 1;
            var14 = arg0;
        } else {
            var14 = (var10 >> 1) + arg0;
            var13 = (var10 + 1 >> 1) + arg0;
        }
        int var15;
        int var16;
        if (arg1 + var11 <= 104) {
            var15 = (var11 >> 1) + arg1;
            var16 = (var11 + 1 >> 1) + arg1;
        } else {
            var15 = arg1;
            var16 = arg1 + 1;
        }
        int var17 = (arg0 << 7) + (var10 << 6);
        int[][] var18 = class172.field2843[arg7];
        int var19 = 0;
        int var20 = var18[var13][var16] + var18[var14][var15] - (-var18[var13][var15] + -var18[var14][var16]) >> 2;
        if (arg7 != 0) {
            int[][] var21 = class172.field2843[0];
            var19 = var20 - (var21[var14][var15] + var21[var13][var16] - (-var21[var13][var15] - var21[var14][var16]) >> 2);
        }
        int[][] var22 = (int[][]) null;
        if (arg7 < 3) {
            var22 = class172.field2843[arg7 + 1];
        }
        class120 var23 = arg8.method870(var18, -113, var20, arg4, false, var22, true, var17, arg5, var12, (class201) null);
        class8.method104(var23.field1669, var17 - arg3, var19, var12 - arg6);
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V", line = 125)
    public class233() {
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "([BZI)I", line = 130)
    public static final int method1676(byte[] arg0, boolean arg1, int arg2) {
        if (arg1) {
            field3636 = -56;
        }
        field3632++;
        return class195.method1448(120, 0, arg2, arg0);
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(I)V", line = 141)
    public class233(int arg0) {
        this.field3633 = arg0;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIZ)I", line = 150)
    public static final int method1677(int arg0, int arg1, int arg2, boolean arg3) {
        field3638++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            if (!arg3) {
                field3635 = 62;
            }
            return arg0;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I[[F[[FLrb;[[F[[IIILvb;[IB)V", line = 172)
    public static final void method1678(int arg0, float[][] arg1, float[][] arg2, class155 arg3, float[][] arg4, int[][] arg5, int arg6, int arg7, class79 arg8, int[] arg9, byte arg10) {
        field3639++;
        int[] var11 = new int[arg9.length / 2];
        if (arg10 <= 63) {
            method1673(-50, 36);
        }
        for (int var12 = 0; var12 < var11.length; var12++) {
            int var13 = arg9[var12 + var12];
            int var14 = arg9[var12 + var12 + 1];
            if (arg0 == 1) {
                int var15 = var13;
                var13 = var14;
                var14 = 128 - var15;
            } else if (arg0 == 2) {
                var14 = 128 - var14;
                var13 = 128 - var13;
            } else if (arg0 == 3) {
                int var16 = var13;
                var13 = 128 - var14;
                var14 = var16;
            }
            float var17;
            float var18;
            float var19;
            if (var13 == 0 && var14 == 0) {
                var17 = arg4[arg7][arg6];
                var18 = arg1[arg7][arg6];
                var19 = arg2[arg7][arg6];
            } else if (var13 == 128 && var14 == 0) {
                var17 = arg4[arg7 + 1][arg6];
                var19 = arg2[arg7 + 1][arg6];
                var18 = arg1[arg7 + 1][arg6];
            } else if (var13 == 128 && var14 == 128) {
                var17 = arg4[arg7 + 1][arg6 + 1];
                var19 = arg2[arg7 + 1][arg6 + 1];
                var18 = arg1[arg7 + 1][arg6 + 1];
            } else if (var13 == 0 && var14 == 128) {
                var17 = arg4[arg7][arg6 + 1];
                var19 = arg2[arg7][arg6 + 1];
                var18 = arg1[arg7][arg6 + 1];
            } else {
                float var20 = arg1[arg7][arg6];
                float var21 = arg2[arg7][arg6];
                float var22 = arg4[arg7][arg6];
                float var23 = (float) var13 / 128.0F;
                float var24 = arg4[arg7][arg6 + 1];
                float var25 = (arg4[arg7 + 1][arg6 + 1] - var24) * var23 + var24;
                float var26 = (arg4[arg7 + 1][arg6] - var22) * var23 + var22;
                float var27 = (float) var14 / 128.0F;
                var17 = (var25 - var26) * var27 + var26;
                float var28 = arg2[arg7][arg6 + 1];
                float var29 = (arg2[arg7 + 1][arg6] - var21) * var23 + var21;
                float var30 = (arg2[arg7 + 1][arg6 + 1] - var28) * var23 + var28;
                var19 = (var30 - var29) * var27 + var29;
                float var31 = arg1[arg7][arg6 + 1];
                float var32 = (arg1[arg7 + 1][arg6] - var20) * var23 + var20;
                float var33 = (arg1[arg7 + 1][arg6 + 1] - var31) * var23 + var31;
                var18 = (var33 - var32) * var27 + var32;
            }
            int var34 = (arg7 << 7) + var13;
            int var35 = (arg6 << 7) + var14;
            int var36 = class249.method1793(false, arg6, arg5, var14, arg7, var13);
            var11[var12] = arg3.method1123(arg8, var34, var36, var35, var17, var19, var18);
        }
        arg3.method1126(var11);
    }
}
