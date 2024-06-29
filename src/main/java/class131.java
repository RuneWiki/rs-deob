import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class131 {

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field2165 = 0;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public static int field2170 = 0;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field2162 = new String[100];

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "([IIIIII)V")
    public static final void method972(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class174 var6 = class90.field1498[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class256 var7 = var6.field2818;
        if (var7 != null) {
            int var8 = var7.field4325;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class52 var10 = var6.field2808;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field883;
        int var12 = var10.field890;
        int var13 = var10.field876;
        int var14 = var10.field878;
        int[] var15 = class93.field1522[var11];
        int[] var16 = class126.field2106[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
    public static final void method973(byte arg0) {
        class15.field305.method97(121);
        if (arg0 < -79) {
            field2161++;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILaj;IILaj;)Lme;")
    public static final class165 method974(int arg0, class151 arg1, int arg2, int arg3, class151 arg4) {
        if (arg2 == 0) {
            field2163++;
            return class167.method1242(arg1, arg3, arg0, arg2 + 64) ? class310.method2085((byte) 123, arg4.method1149(arg0, (byte) 68, arg3)) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Laj;I)V")
    public static final void method975(class151 arg0, int arg1) {
        field2167++;
        if (class42.field635) {
            return;
        }
        class211.method1481();
        class55.field974 = method977(arg1 ^ 0x7599, class109.field1789, arg0);
        int var2 = class182.field2901;
        int var3 = var2 * 956 / 503;
        class55.field974.method661((class155.field2567 - var3) / 2, 0, var3, var2);
        class110.field1827 = class141.method1047(arg1, class260.field4374, arg0);
        class110.field1827.method1650(class155.field2567 / 2 - (class110.field1827.field4225 / 2), 18);
        class42.field635 = true;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public static final void method976(int arg0) {
        field2166++;
        if (arg0 != -22869) {
            field2170 = 60;
        }
        class228.field3853.method97(105);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IILaj;)Lmd;")
    private static final class273 method977(int arg0, int arg1, class151 arg2) {
        if (arg0 != 30105) {
            field2165 = 43;
        }
        field2164++;
        return class313.method2118(arg2, (byte) -67, arg1) ? class171.method1273((byte) 116) : null;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V")
    public static void method978(int arg0) {
        if (arg0 == 227) {
            field2162 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIZI)V")
    public static final void method979(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg3) {
            field2162 = null;
        }
        if (class23.field423 <= arg1 && arg1 <= class272.field4552) {
            int var5 = class243.method1742(class55.field972, 0, class240.field4053, arg4);
            int var6 = class243.method1742(class55.field972, 0, class240.field4053, arg2);
            class221.method1568(false, arg0, var6, var5, arg1);
        }
        field2169++;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZIIIBLck;)V")
    public static final void method980(boolean arg0, int arg1, int arg2, int arg3, byte arg4, class163 arg5) {
        field2168++;
        if (class295.field4841 >= 50 || arg5 == null || arg5.field2648 == null || arg3 >= arg5.field2648.length || arg5.field2648[arg3] == null) {
            return;
        }
        int var6 = arg5.field2648[arg3][0];
        if (arg4 > -58) {
            method974(69, (class151) null, -71, -98, (class151) null);
        }
        int var7 = var6 & 0x1F;
        int var8 = var6 >> 8;
        if (arg5.field2648[arg3].length > 1) {
            int var9 = (int) ((double) arg5.field2648[arg3].length * Math.random());
            if (var9 > 0) {
                var8 = arg5.field2648[arg3][var9];
            }
        }
        int var10 = (var6 & 0xE3) >> 5;
        if (var7 == 0) {
            if (arg0) {
                class1.method4(255, var10, 0, var8, 23492);
            }
        } else if (class292.field4785 != 0) {
            int var11 = (arg2 - 64) / 128;
            class28.field487[class295.field4841] = var8;
            class23.field427[class295.field4841] = var10;
            class15.field312[class295.field4841] = 0;
            int var12 = (arg1 - 64) / 128;
            class196.field3167[class295.field4841] = null;
            class95.field1548[class295.field4841] = 255;
            class221.field3714[class295.field4841] = (var11 << 16) + (var12 << 8) + var7;
            class295.field4841++;
        }
    }
}
