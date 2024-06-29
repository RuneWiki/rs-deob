import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class56 {

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "[[Z")
    public static boolean[][] field1110;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I[[IBI[[FI[[FLml;I[[FIIZBIB)V", line = 7)
    public static final void method434(int arg0, int[][] arg1, byte arg2, int arg3, float[][] arg4, int arg5, float[][] arg6, class16 arg7, int arg8, float[][] arg9, int arg10, int arg11, boolean arg12, byte arg13, int arg14, byte arg15) {
        field1109++;
        int var16 = (arg8 << 8) + 255;
        int var17 = (arg14 << 8) + 255;
        if (arg13 != 88) {
            return;
        }
        int[] var18 = class81.field1577[arg15];
        int var19 = (arg10 << 8) + 255;
        int var20 = (arg11 << 8) + 255;
        int[] var21 = null;
        int[] var22 = new int[var18.length >> 1];
        for (int var23 = 0; var23 < var22.length; var23++) {
            var22[var23] = class225.method1491(arg5, var20, arg6, var18[var23 + var23 + 1], var17, arg3, arg4, var18[var23 + var23], 0.0F, 256, false, arg1, var19, var16, arg9, (int[][]) null, arg7, arg2);
        }
        if (arg12) {
            if (arg15 == 1) {
                var21 = new int[6];
                int var42 = class225.method1491(arg5, var20, arg6, 128, var17, arg3, arg4, 64, 0.0F, 256, true, arg1, var19, var16, arg9, (int[][]) null, arg7, arg2);
                int var43 = class225.method1491(arg5, var20, arg6, 64, var17, arg3, arg4, 128, 0.0F, 256, true, arg1, var19, var16, arg9, (int[][]) null, arg7, arg2);
                var21[2] = var22[2];
                var21[3] = var42;
                var21[5] = var22[2];
                var21[0] = var43;
                var21[1] = var42;
                var21[4] = var22[0];
            } else if (arg15 == 2) {
                int var25 = class225.method1491(arg5, var20, arg6, 128, var17, arg3, arg4, 128, 0.0F, arg13 + 168, true, arg1, var19, var16, arg9, (int[][]) null, arg7, arg2);
                var21 = new int[6];
                int var26 = class225.method1491(arg5, var20, arg6, 0, var17, arg3, arg4, 64, 0.0F, 256, true, arg1, var19, var16, arg9, (int[][]) null, arg7, arg2);
                var21[2] = var25;
                var21[1] = var26;
                var21[4] = var22[1];
                var21[3] = var25;
                var21[0] = var22[0];
                var21[5] = var22[0];
            } else if (arg15 == 3) {
                var21 = new int[6];
                int var27 = class225.method1491(arg5, var20, arg6, 128, var17, arg3, arg4, 0, 0.0F, 256, true, arg1, var19, var16, arg9, (int[][]) null, arg7, arg2);
                int var28 = class225.method1491(arg5, var20, arg6, 0, var17, arg3, arg4, 64, 0.0F, 256, true, arg1, var19, var16, arg9, (int[][]) null, arg7, arg2);
                var21[0] = var22[2];
                var21[3] = var27;
                var21[2] = var27;
                var21[4] = var28;
                var21[1] = var22[1];
                var21[5] = var22[2];
            } else if (arg15 == 4) {
                int var29 = class225.method1491(arg5, var20, arg6, 128, var17, arg3, arg4, 0, 0.0F, 256, true, arg1, var19, var16, arg9, (int[][]) null, arg7, arg2);
                var21 = new int[] { var22[3], var29, var22[0] };
            } else if (arg15 == 5) {
                var21 = new int[3];
                int var30 = class225.method1491(arg5, var20, arg6, 128, var17, arg3, arg4, 128, 0.0F, arg13 + 168, true, arg1, var19, var16, arg9, (int[][]) null, arg7, arg2);
                var21[0] = var22[2];
                var21[1] = var30;
                var21[2] = var22[3];
            } else if (arg15 == 6) {
                var21 = new int[6];
                int var31 = class225.method1491(arg5, var20, arg6, 0, var17, arg3, arg4, 128, 0.0F, 256, true, arg1, var19, var16, arg9, (int[][]) null, arg7, arg2);
                int var32 = class225.method1491(arg5, var20, arg6, 128, var17, arg3, arg4, 128, 0.0F, 256, true, arg1, var19, var16, arg9, (int[][]) null, arg7, arg2);
                var21[1] = var31;
                var21[2] = var32;
                var21[0] = var22[3];
                var21[3] = var32;
                var21[4] = var22[0];
                var21[5] = var22[3];
            } else if (arg15 == 7) {
                var21 = new int[6];
                int var33 = class225.method1491(arg5, var20, arg6, 128, var17, arg3, arg4, 0, 0.0F, 256, true, arg1, var19, var16, arg9, (int[][]) null, arg7, arg2);
                int var34 = class225.method1491(arg5, var20, arg6, 0, var17, arg3, arg4, 128, 0.0F, arg13 ^ 0x158, true, arg1, var19, var16, arg9, (int[][]) null, arg7, arg2);
                var21[0] = var22[1];
                var21[1] = var34;
                var21[5] = var22[1];
                var21[2] = var33;
                var21[3] = var33;
                var21[4] = var22[2];
            } else if (arg15 == 8) {
                var21 = new int[3];
                int var41 = class225.method1491(arg5, var20, arg6, 0, var17, arg3, arg4, 0, 0.0F, 256, true, arg1, var19, var16, arg9, (int[][]) null, arg7, arg2);
                var21[2] = var22[4];
                var21[0] = var22[3];
                var21[1] = var41;
            } else if (arg15 == 9) {
                var21 = new int[15];
                int var35 = class225.method1491(arg5, var20, arg6, 64, var17, arg3, arg4, 128, 0.0F, 256, true, arg1, var19, var16, arg9, (int[][]) null, arg7, arg2);
                int var36 = class225.method1491(arg5, var20, arg6, 32, var17, arg3, arg4, 96, 0.0F, 256, true, arg1, var19, var16, arg9, (int[][]) null, arg7, arg2);
                int var37 = class225.method1491(arg5, var20, arg6, 0, var17, arg3, arg4, 64, 0.0F, 256, true, arg1, var19, var16, arg9, (int[][]) null, arg7, arg2);
                var21[0] = var36;
                var21[14] = var37;
                var21[6] = var36;
                var21[2] = var22[4];
                var21[8] = var22[2];
                var21[9] = var36;
                var21[10] = var22[2];
                var21[12] = var36;
                var21[1] = var35;
                var21[13] = var22[1];
                var21[4] = var22[4];
                var21[11] = var22[1];
                var21[3] = var36;
                var21[5] = var22[3];
                var21[7] = var22[3];
            } else if (arg15 == 10) {
                var21 = new int[9];
                int var38 = class225.method1491(arg5, var20, arg6, 128, var17, arg3, arg4, 0, 0.0F, 256, true, arg1, var19, var16, arg9, (int[][]) null, arg7, arg2);
                var21[4] = var38;
                var21[6] = var22[4];
                var21[5] = var22[4];
                var21[0] = var22[2];
                var21[1] = var38;
                var21[2] = var22[3];
                var21[8] = var22[0];
                var21[7] = var38;
                var21[3] = var22[3];
            } else if (arg15 == 11) {
                int var39 = class225.method1491(arg5, var20, arg6, 64, var17, arg3, arg4, 0, 0.0F, arg13 ^ 0x158, true, arg1, var19, var16, arg9, (int[][]) null, arg7, arg2);
                var21 = new int[12];
                int var40 = class225.method1491(arg5, var20, arg6, 64, var17, arg3, arg4, 128, 0.0F, 256, true, arg1, var19, var16, arg9, (int[][]) null, arg7, arg2);
                var21[11] = var40;
                var21[5] = var39;
                var21[8] = var39;
                var21[7] = var40;
                var21[1] = var39;
                var21[10] = var22[1];
                var21[0] = var22[3];
                var21[2] = var22[0];
                var21[6] = var22[2];
                var21[4] = var22[2];
                var21[9] = var22[2];
                var21[3] = var22[3];
            }
        }
        arg7.method116(arg0, arg5, arg3, var22, var21, false);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)[Lfd;", line = 278)
    public static final class206[] method435(int arg0) {
        field1112++;
        if (arg0 > -89) {
            method435(-63);
        }
        class206[] var1 = new class206[class125.field2167];
        for (int var2 = 0; var2 < class125.field2167; var2++) {
            int var3 = class28.field537[var2] * class176.field2833[var2];
            byte[] var4 = class254.field3968[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class274.field4202[class61.method475(255, var4[var6])];
            }
            var1[var2] = new class206(class194.field3127, class321.field4891, class80.field1572[var2], class27.field530[var2], class28.field537[var2], class176.field2833[var2], var5);
        }
        class97.method644((byte) 110);
        return var1;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V", line = 321)
    public static void method436(int arg0) {
        if (arg0 != 3) {
            field1113 = 44;
        }
        field1110 = (boolean[][]) null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZIII[Lu;[B)V", line = 331)
    public static final void method437(boolean arg0, int arg1, int arg2, int arg3, class25[] arg4, byte[] arg5) {
        field1107++;
        class202 var6 = new class202(arg5);
        int var7 = -1;
        while (true) {
            int var8 = var6.method1358(32767);
            if (var8 == 0) {
                int var21 = -95 % ((arg1 - 67) / 50);
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method1296((byte) 91);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 >> 12;
                int var12 = var9 & 0x3F;
                int var13 = var6.method1317((byte) -88);
                int var14 = var13 >> 2;
                int var15 = var9 >> 6 & 0x3F;
                int var16 = var15 + arg2;
                int var17 = var13 & 0x3;
                int var18 = arg3 + var12;
                if (var16 > 0 && var18 > 0 && var16 < 103 && var18 < 103) {
                    class25 var19 = null;
                    if (!arg0) {
                        int var20 = var11;
                        if ((class99.field1749[1][var16][var18] & 0x2) == 2) {
                            var20 = var11 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg4[var20];
                        }
                    }
                    class209.method1417(var11, var19, var18, var7, var16, !arg0, var17, (byte) 4, arg0, var11, var14);
                }
            }
        }
    }
}
