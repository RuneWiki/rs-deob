import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public abstract class class261 {

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field3569 = -1;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "[I")
    public static int[] field3572 = new int[5];

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field3567 = new String[100];

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field3576;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "[Llf;")
    public static class130[] field3571;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IILie;IIIIIIBI)Z", line = 8)
    public static final boolean method1605(int arg0, int arg1, class4 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9, int arg10) {
        field3575++;
        if (arg9 != 20) {
            return true;
        }
        int var11 = arg8;
        int var12 = arg7;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg8 - var13;
        class395.field5777[var13][var14] = 99;
        int var16 = arg7 - var14;
        class137.field1949[var13][var14] = 0;
        byte var17 = 0;
        class170.field2425[var17] = arg8;
        int var18 = 0;
        int var26 = var17 + 1;
        class189.field2626[var17] = arg7;
        int[][] var19 = arg2.field53;
        while (var26 != var18) {
            var12 = class189.field2626[var18];
            var11 = class170.field2425[var18];
            int var20 = var12 - var16;
            var18 = var18 + 1 & 0xFFF;
            int var21 = var11 - var15;
            int var22 = var11 - arg2.field62;
            int var23 = var12 - arg2.field55;
            if (arg1 == -4) {
                if (arg10 == var11 && arg6 == var12) {
                    class318.field4372 = var11;
                    class396.field5784 = var12;
                    return true;
                }
            } else if (arg1 == -3) {
                if (class414.method2652(arg0, -82, var11, arg6, 2, arg4, arg10, var12, 2)) {
                    class318.field4372 = var11;
                    class396.field5784 = var12;
                    return true;
                }
            } else if (arg1 == -2) {
                if (arg2.method26(var11, arg10, 2, arg4, var12, 2, arg3, arg0, arg6, true)) {
                    class396.field5784 = var12;
                    class318.field4372 = var11;
                    return true;
                }
            } else if (arg1 == -1) {
                if (arg2.method25(var11, arg4, var12, 102, arg0, arg3, 2, arg10, arg6)) {
                    class318.field4372 = var11;
                    class396.field5784 = var12;
                    return true;
                }
            } else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
                if (arg2.method37(var12, arg1, arg6, var11, arg5, true, 2, arg10)) {
                    class318.field4372 = var11;
                    class396.field5784 = var12;
                    return true;
                }
            } else if (arg2.method34(2, var12, arg1, arg10, arg6, arg5, arg9 ^ 0x78, var11)) {
                class318.field4372 = var11;
                class396.field5784 = var12;
                return true;
            }
            int var25 = class137.field1949[var21][var20] + 1;
            if (var21 > 0 && class395.field5777[var21 - 1][var20] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class170.field2425[var26] = var11 - 1;
                class189.field2626[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class395.field5777[var21 - 1][var20] = 2;
                class137.field1949[var21 - 1][var20] = var25;
            }
            if (var21 < 126 && class395.field5777[var21 + 1][var20] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class170.field2425[var26] = var11 + 1;
                class189.field2626[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class395.field5777[var21 + 1][var20] = 8;
                class137.field1949[var21 + 1][var20] = var25;
            }
            if (var20 > 0 && class395.field5777[var21][var20 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class170.field2425[var26] = var11;
                class189.field2626[var26] = var12 - 1;
                class395.field5777[var21][var20 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class137.field1949[var21][var20 - 1] = var25;
            }
            if (var20 < 126 && class395.field5777[var21][var20 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class170.field2425[var26] = var11;
                class189.field2626[var26] = var12 + 1;
                class395.field5777[var21][var20 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class137.field1949[var21][var20 + 1] = var25;
            }
            if (var21 > 0 && var20 > 0 && class395.field5777[var21 - 1][var20 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class170.field2425[var26] = var11 - 1;
                class189.field2626[var26] = var12 - 1;
                class395.field5777[var21 - 1][var20 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class137.field1949[var21 - 1][var20 - 1] = var25;
            }
            if (var21 < 126 && var20 > 0 && class395.field5777[var21 + 1][var20 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class170.field2425[var26] = var11 + 1;
                class189.field2626[var26] = var12 - 1;
                class395.field5777[var21 + 1][var20 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class137.field1949[var21 + 1][var20 - 1] = var25;
            }
            if (var21 > 0 && var20 < 126 && class395.field5777[var21 - 1][var20 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class170.field2425[var26] = var11 - 1;
                class189.field2626[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class395.field5777[var21 - 1][var20 + 1] = 6;
                class137.field1949[var21 - 1][var20 + 1] = var25;
            }
            if (var21 < 126 && var20 < 126 && class395.field5777[var21 + 1][var20 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class170.field2425[var26] = var11 + 1;
                class189.field2626[var26] = var12 + 1;
                class395.field5777[var21 + 1][var20 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class137.field1949[var21 + 1][var20 + 1] = var25;
            }
        }
        class396.field5784 = var12;
        class318.field4372 = var11;
        return false;
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(I)V", line = 363)
    public static void method1606(int arg0) {
        int var1 = 40 % ((-arg0 - 37) / 61);
        field3572 = null;
        field3571 = null;
        field3567 = null;
        field3576 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIZIII)V", line = 380)
    public static final void method1607(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg4; var6 < (arg3 + arg4); var6++) {
            for (int var9 = arg0; var9 < (arg0 + arg1); var9++) {
                if (var9 >= 0 && var9 < class432.field6220 && var6 >= 0 && var6 < class267.field3646) {
                    class418.field6051[arg5][var9][var6] = arg5 > 0 ? class418.field6051[arg5 - 1][var9][var6] - 240 : 0;
                }
            }
        }
        field3573++;
        if (arg0 > 0 && arg0 < class432.field6220) {
            for (int var7 = arg4 + 1; var7 < arg3 + arg4; var7++) {
                if (var7 >= 0 && var7 < class267.field3646) {
                    class418.field6051[arg5][arg0][var7] = class418.field6051[arg5][arg0 - 1][var7];
                }
            }
        }
        if (arg4 > 0 && arg4 < class267.field3646) {
            for (int var8 = arg0 + 1; var8 < (arg0 + arg1); var8++) {
                if (var8 >= 0 && var8 < class432.field6220) {
                    class418.field6051[arg5][var8][arg4] = class418.field6051[arg5][var8][arg4 - 1];
                }
            }
        }
        if (arg0 >= 0 && arg4 >= 0 && class432.field6220 > arg0 && class267.field3646 > arg4) {
            if (arg5 == 0) {
                if (arg0 > 0 && class418.field6051[arg5][arg0 - 1][arg4] != 0) {
                    class418.field6051[arg5][arg0][arg4] = class418.field6051[arg5][arg0 - 1][arg4];
                } else if (arg4 > 0 && class418.field6051[arg5][arg0][arg4 - 1] != 0) {
                    class418.field6051[arg5][arg0][arg4] = class418.field6051[arg5][arg0][arg4 - 1];
                } else if (arg0 > 0 && arg4 > 0 && class418.field6051[arg5][arg0 - 1][arg4 - 1] != 0) {
                    class418.field6051[arg5][arg0][arg4] = class418.field6051[arg5][arg0 - 1][arg4 - 1];
                }
            } else if (arg0 > 0 && class418.field6051[arg5 - 1][arg0 - 1][arg4] != class418.field6051[arg5][arg0 - 1][arg4]) {
                class418.field6051[arg5][arg0][arg4] = class418.field6051[arg5][arg0 - 1][arg4];
            } else if (arg4 > 0 && class418.field6051[arg5][arg0][arg4 - 1] != class418.field6051[arg5 - 1][arg0][arg4 - 1]) {
                class418.field6051[arg5][arg0][arg4] = class418.field6051[arg5][arg0][arg4 - 1];
            } else if (arg0 > 0 && arg4 > 0 && class418.field6051[arg5 - 1][arg0 - 1][arg4 - 1] != class418.field6051[arg5][arg0 - 1][arg4 - 1]) {
                class418.field6051[arg5][arg0][arg4] = class418.field6051[arg5][arg0 - 1][arg4 - 1];
            }
        }
        if (!arg2) {
            field3569 = 90;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 477)
    public static final String method1608(int arg0, long arg1) {
        field3568++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                var6.append(class16.field196[(int) (var8 - arg1 * 37L)]);
            }
            int var7 = -55 / ((arg0 - 4) / 45);
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZ)V", line = 521)
    public static final void method1609(int arg0, boolean arg1) {
        if (arg1) {
            field3567 = null;
        }
        field3570++;
        class399 var2 = class269.method1655(7, arg0, -64);
        var2.method2582(0);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "([III[[B[[B[I[BI)I", line = 542)
    public static final int method1610(int[] arg0, int arg1, int arg2, byte[][] arg3, byte[][] arg4, int[] arg5, byte[] arg6, int arg7) {
        field3574++;
        int var8 = arg0[arg7];
        int var9 = var8 + arg5[arg7];
        int var10 = arg0[arg2];
        int var11 = 94 % ((42 - arg1) / 62);
        int var12 = arg5[arg2] + var10;
        int var13 = var8;
        if (var8 < var10) {
            var13 = var10;
        }
        int var14 = var9;
        if (var9 > var12) {
            var14 = var12;
        }
        int var15 = arg6[arg7] & 0xFF;
        if ((arg6[arg2] & 0xFF) < var15) {
            var15 = arg6[arg2] & 0xFF;
        }
        byte[] var16 = arg4[arg7];
        byte[] var17 = arg3[arg2];
        int var18 = var13 - var8;
        int var19 = var13 - var10;
        for (int var20 = var13; var20 < var14; var20++) {
            int var21 = var16[var18++] + var17[var19++];
            if (var15 > var21) {
                var15 = var21;
            }
        }
        return -var15;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public abstract void method886(int arg0);

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "([I)V")
    public abstract void method889(int[] arg0);

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "()V")
    public abstract void method893();

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)V")
    public abstract void method883(int arg0);

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "(I)V")
    public abstract void method890(int arg0);

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(III[I)V")
    public abstract void method881(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "(I)V")
    public abstract void method891(int arg0);

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(III)V")
    public abstract void method888(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIII)V")
    public abstract void method887(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lci;)V")
    public abstract void method884(class261 arg0);

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(III)V")
    public abstract void method882(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "(I)V")
    public abstract void method892(int arg0);
}
