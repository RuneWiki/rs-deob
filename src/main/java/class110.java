import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class110 {

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public static int field1741 = -1;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field1739 = 1;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    private int field1736;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public int field1740;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public int field1748;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "J")
    public static long field1743;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "Lsa;")
    public static class109 field1747;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "Lui;")
    public static class266 field1738;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "Lqc;")
    public static class4 field1746;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V", line = 7)
    public static void method872(boolean arg0) {
        field1738 = null;
        if (!arg0) {
            field1741 = 49;
        }
        field1746 = null;
        field1747 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZILhb;)V", line = 21)
    private final void method873(int arg0, boolean arg1, int arg2, class35 arg3) {
        if (arg1) {
            return;
        }
        field1749++;
        if (arg2 == 1) {
            this.field1736 = arg3.method300(-1394191632);
        } else if (arg2 == 2) {
            this.field1748 = arg3.method273(65280);
            this.field1740 = arg3.method273(65280);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)I", line = 44)
    public static final int method874(byte arg0) {
        field1742++;
        if (class304.field4755 == 0) {
            return 0;
        } else {
            if (arg0 > -103) {
                method877((byte) 126, -92, (float[][]) ((float[][]) null), -81, -99, (int[][]) ((int[][]) null), (byte) -67, -123, -16, true, 34, (float[][]) ((float[][]) null), (float[][]) ((float[][]) null), (class123) null, -71, 45);
            }
            return class249.field3738[class304.field4755].method71();
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILhb;I)V", line = 61)
    public final void method875(int arg0, class35 arg1, int arg2) {
        if (arg0 != 23295) {
            method874((byte) -19);
        }
        while (true) {
            int var4 = arg1.method273(arg0 ^ 0xA5FF);
            if (var4 == 0) {
                field1737++;
                return;
            }
            this.method873(arg2, false, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)Lvd;", line = 89)
    public final class134 method876(byte arg0) {
        if (arg0 != 70) {
            return (class134) null;
        }
        field1733++;
        class134 var2 = (class134) class106.field1623.method1432((byte) 106, (long) this.field1736);
        if (var2 != null) {
            return var2;
        }
        class134 var3 = class232.method1645(1, class137.field2136, this.field1736, 0);
        if (var3 != null) {
            class106.field1623.method1436(false, var3, (long) this.field1736);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BI[[FII[[IBIIZI[[F[[FLjn;II)V", line = 111)
    public static final void method877(byte arg0, int arg1, float[][] arg2, int arg3, int arg4, int[][] arg5, byte arg6, int arg7, int arg8, boolean arg9, int arg10, float[][] arg11, float[][] arg12, class123 arg13, int arg14, int arg15) {
        field1734++;
        int var16 = (arg10 << 8) + 255;
        int var17 = (arg7 << 8) + 255;
        int var18 = (arg3 << 8) + 255;
        int var19 = (arg4 << 8) + 255;
        int[] var20 = class138.field2155[arg0];
        int[] var21 = new int[var20.length >> 1];
        for (int var22 = 0; var22 < var21.length; var22++) {
            var21[var22] = class203.method1467(var20[var22 + var22], arg13, 108, var19, arg11, var20[var22 + var22 + 1], arg6, arg5, arg12, arg14, var16, (int[][]) null, var18, 0.0F, false, arg1, arg2, var17);
        }
        if (arg15 != -11108) {
            field1746 = (class4) null;
        }
        int[] var23 = null;
        if (arg9) {
            if (arg0 == 1) {
                var23 = new int[6];
                int var42 = class203.method1467(64, arg13, -69, var19, arg11, 128, arg6, arg5, arg12, arg14, var16, (int[][]) null, var18, 0.0F, true, arg1, arg2, var17);
                int var43 = class203.method1467(128, arg13, 123, var19, arg11, 64, arg6, arg5, arg12, arg14, var16, (int[][]) null, var18, 0.0F, true, arg1, arg2, var17);
                var23[2] = var21[2];
                var23[1] = var42;
                var23[3] = var42;
                var23[0] = var43;
                var23[5] = var21[2];
                var23[4] = var21[0];
            } else if (arg0 == 2) {
                var23 = new int[6];
                int var25 = class203.method1467(128, arg13, 39, var19, arg11, 128, arg6, arg5, arg12, arg14, var16, (int[][]) null, var18, 0.0F, true, arg1, arg2, var17);
                int var26 = class203.method1467(64, arg13, -123, var19, arg11, 0, arg6, arg5, arg12, arg14, var16, (int[][]) null, var18, 0.0F, true, arg1, arg2, var17);
                var23[2] = var25;
                var23[3] = var25;
                var23[0] = var21[0];
                var23[1] = var26;
                var23[4] = var21[1];
                var23[5] = var21[0];
            } else if (arg0 == 3) {
                var23 = new int[6];
                int var40 = class203.method1467(0, arg13, -127, var19, arg11, 128, arg6, arg5, arg12, arg14, var16, (int[][]) null, var18, 0.0F, true, arg1, arg2, var17);
                int var41 = class203.method1467(64, arg13, arg15 + 11204, var19, arg11, 0, arg6, arg5, arg12, arg14, var16, (int[][]) null, var18, 0.0F, true, arg1, arg2, var17);
                var23[0] = var21[2];
                var23[1] = var21[1];
                var23[4] = var41;
                var23[2] = var40;
                var23[3] = var40;
                var23[5] = var21[2];
            } else if (arg0 == 4) {
                int var27 = class203.method1467(0, arg13, arg15 ^ 0xFFFFD485, var19, arg11, 128, arg6, arg5, arg12, arg14, var16, (int[][]) null, var18, 0.0F, true, arg1, arg2, var17);
                var23 = new int[] { var21[3], var27, var21[0] };
            } else if (arg0 == 5) {
                var23 = new int[3];
                int var39 = class203.method1467(128, arg13, 22, var19, arg11, 128, arg6, arg5, arg12, arg14, var16, (int[][]) null, var18, 0.0F, true, arg1, arg2, var17);
                var23[0] = var21[2];
                var23[2] = var21[3];
                var23[1] = var39;
            } else if (arg0 == 6) {
                var23 = new int[6];
                int var37 = class203.method1467(128, arg13, -75, var19, arg11, 0, arg6, arg5, arg12, arg14, var16, (int[][]) null, var18, 0.0F, true, arg1, arg2, var17);
                int var38 = class203.method1467(128, arg13, -108, var19, arg11, 128, arg6, arg5, arg12, arg14, var16, (int[][]) null, var18, 0.0F, true, arg1, arg2, var17);
                var23[2] = var38;
                var23[0] = var21[3];
                var23[3] = var38;
                var23[4] = var21[0];
                var23[5] = var21[3];
                var23[1] = var37;
            } else if (arg0 == 7) {
                int var35 = class203.method1467(0, arg13, arg15 ^ 0xFFFFD4BA, var19, arg11, 128, arg6, arg5, arg12, arg14, var16, (int[][]) null, var18, 0.0F, true, arg1, arg2, var17);
                int var36 = class203.method1467(128, arg13, -71, var19, arg11, 0, arg6, arg5, arg12, arg14, var16, (int[][]) null, var18, 0.0F, true, arg1, arg2, var17);
                var23 = new int[] { var21[1], var36, var35, var35, var21[2], var21[1] };
            } else if (arg0 == 8) {
                var23 = new int[3];
                int var28 = class203.method1467(0, arg13, -74, var19, arg11, 0, arg6, arg5, arg12, arg14, var16, (int[][]) null, var18, 0.0F, true, arg1, arg2, var17);
                var23[1] = var28;
                var23[2] = var21[4];
                var23[0] = var21[3];
            } else if (arg0 == 9) {
                var23 = new int[15];
                int var32 = class203.method1467(128, arg13, -75, var19, arg11, 64, arg6, arg5, arg12, arg14, var16, (int[][]) null, var18, 0.0F, true, arg1, arg2, var17);
                int var33 = class203.method1467(96, arg13, 68, var19, arg11, 32, arg6, arg5, arg12, arg14, var16, (int[][]) null, var18, 0.0F, true, arg1, arg2, var17);
                int var34 = class203.method1467(64, arg13, -103, var19, arg11, 0, arg6, arg5, arg12, arg14, var16, (int[][]) null, var18, 0.0F, true, arg1, arg2, var17);
                var23[0] = var33;
                var23[9] = var33;
                var23[1] = var32;
                var23[2] = var21[4];
                var23[3] = var33;
                var23[10] = var21[2];
                var23[7] = var21[3];
                var23[14] = var34;
                var23[6] = var33;
                var23[13] = var21[1];
                var23[5] = var21[3];
                var23[12] = var33;
                var23[11] = var21[1];
                var23[8] = var21[2];
                var23[4] = var21[4];
            } else if (arg0 == 10) {
                var23 = new int[9];
                int var29 = class203.method1467(0, arg13, arg15 + 11041, var19, arg11, 128, arg6, arg5, arg12, arg14, var16, (int[][]) null, var18, 0.0F, true, arg1, arg2, var17);
                var23[1] = var29;
                var23[7] = var29;
                var23[4] = var29;
                var23[6] = var21[4];
                var23[0] = var21[2];
                var23[8] = var21[0];
                var23[2] = var21[3];
                var23[3] = var21[3];
                var23[5] = var21[4];
            } else if (arg0 == 11) {
                var23 = new int[12];
                int var30 = class203.method1467(0, arg13, arg15 + 11153, var19, arg11, 64, arg6, arg5, arg12, arg14, var16, (int[][]) null, var18, 0.0F, true, arg1, arg2, var17);
                int var31 = class203.method1467(128, arg13, -71, var19, arg11, 64, arg6, arg5, arg12, arg14, var16, (int[][]) null, var18, 0.0F, true, arg1, arg2, var17);
                var23[11] = var31;
                var23[5] = var30;
                var23[7] = var31;
                var23[0] = var21[3];
                var23[1] = var30;
                var23[3] = var21[3];
                var23[10] = var21[1];
                var23[8] = var30;
                var23[2] = var21[0];
                var23[4] = var21[2];
                var23[9] = var21[2];
                var23[6] = var21[2];
            }
        }
        arg13.method944(arg8, arg14, arg1, var21, var23, false);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILtg;)V", line = 393)
    public static final void method878(int arg0, class314 arg1) {
        if (arg0 == 2) {
            field1735++;
            class268.field4027 = arg1;
        }
    }
}
