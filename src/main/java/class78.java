import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class78 {

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field1418 = 0;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "Lqk;")
    public static class207 field1414 = class24.method212(255, "blinken1:");

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "Lqk;")
    public static class207 field1422 = class24.method212(255, "rect_debug=");

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "[B")
    public static byte[] field1424 = new byte[520];

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
    public static volatile int field1426 = 0;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "Ldd;")
    public static class132 field1415 = new class132();

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "Z")
    public static boolean field1427 = false;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "Lqk;")
    public static class207 field1428 = class24.method212(255, "Ablegen");

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
    public static int field1429 = -1;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "Lpk;")
    public static class99 field1425;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "Z")
    public static boolean field1417;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
    public static void method590(byte arg0) {
        field1425 = null;
        field1422 = null;
        field1414 = null;
        field1428 = null;
        field1415 = null;
        if (arg0 >= -28) {
            field1427 = true;
        }
        field1424 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BI)Z")
    public static final boolean method591(byte arg0, int arg1) {
        field1423++;
        class260 var2 = class97.method689((byte) 113, arg1);
        if (var2 == null) {
            return false;
        } else if (class229.field4193 == 1 || class229.field4193 == 2 || class164.field2903 == 2) {
            byte[] var3 = var2.field4639.method1451(-119);
            class89.field1607 = new String(var3, 0, var3.length);
            class173.field3089 = var2.field4631;
            if (class164.field2903 != 0) {
                class6.field93 = class173.field3089 + 40000;
                class223.field4076 = class6.field93;
                class147.field2527 = class173.field3089 + 50000;
            }
            return true;
        } else {
            class207 var4 = class13.field186;
            if (class164.field2903 != 0) {
                var4 = class105.method757(false, new class207[] { class71.field1259, class262.method1815(var2.field4631 + 7000, (byte) -110) });
            }
            class207 var5 = class13.field186;
            if (class121.field2093 != null) {
                var5 = class105.method757(false, new class207[] { class167.field2932, class121.field2093 });
            }
            int var6 = 127 / ((arg0 + 2) / 42);
            class207 var7 = class105.method757(false, new class207[] { class71.field1272, var2.field4639, var4, class102.field1837, class262.method1815(class272.field4795, (byte) 90), class271.field4790, class262.method1815(class156.field2737, (byte) -117), var5, class224.field4088, class24.field460 ? class124.field2169 : class28.field573, class199.field3498, class97.field1714 ? class124.field2169 : class28.field573, class92.field1631, class213.field3774 ? class124.field2169 : class28.field573 });
            try {
                class136.field2347.getAppletContext().showDocument(var7.method1466(-126), "_self");
                return true;
            } catch (Exception var8) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZIZIZ)Lpk;")
    public static final class99 method592(boolean arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        field1420++;
        if (arg3 != -17265) {
            method593(-80, (int[]) null);
        }
        class81 var5 = null;
        if (class177.field3185 != null) {
            var5 = new class81(arg1, class177.field3185, class22.field357[arg1], 1000000);
        }
        class247.field4478[arg1] = class47.field929.method627(arg1, var5, class115.field1992, class280.method1901(arg3, -19125));
        if (arg2) {
            class247.field4478[arg1].method1217((byte) 105);
        }
        return new class99(class247.field4478[arg1], arg0, arg4);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I[I)[I")
    public static final int[] method593(int arg0, int[] arg1) {
        field1419++;
        if (arg1 == null) {
            return null;
        } else if (arg0 >= -87) {
            return null;
        } else {
            int[] var2 = new int[arg1.length];
            class274.method1861(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILpk;II)Z")
    public static final boolean method594(int arg0, class99 arg1, int arg2, int arg3) {
        field1412++;
        byte[] var4 = arg1.method705(arg0, arg3, -1);
        if (var4 == null) {
            return false;
        } else {
            int var5 = -58 / ((arg2 - 62) / 40);
            class82.method616(false, var4);
            return true;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BIIIIII)V")
    public static final void method595(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class59.method431((byte) 113, arg6);
        field1413++;
        int var7 = arg6;
        int var8 = 0;
        int var9 = -arg6;
        int var10 = arg6 - arg4;
        int var11 = -1;
        int[] var12 = class15.field238[arg1];
        int var13 = -1;
        if (var10 < 0) {
            var10 = 0;
        }
        int var14 = -var10;
        int var15 = var10;
        if (arg0 < 27) {
            return;
        }
        int var16 = arg2 - var10;
        class215.method1544(arg2 - arg6, var16, var12, arg5, -29);
        int var17 = arg2 + var10;
        class215.method1544(var16, var17, var12, arg3, 105);
        class215.method1544(var17, arg2 + arg6, var12, arg5, 86);
        while (var8 < var7) {
            var13 += 2;
            var11 += 2;
            var14 += var11;
            var9 += var13;
            if (var14 >= 0 && var15 >= 1) {
                class14.field235[var15] = var8;
                var15--;
                var14 -= var15 << 1;
            }
            var8++;
            if (var9 >= 0) {
                var7--;
                if (var7 < var10) {
                    int[] var18 = class15.field238[arg1 - var7];
                    int var19 = class14.field235[var7];
                    int[] var20 = class15.field238[arg1 + var7];
                    int var21 = arg2 + var8;
                    int var22 = arg2 + var19;
                    int var23 = arg2 - var8;
                    int var24 = arg2 - var19;
                    class215.method1544(var23, var24, var20, arg5, -27);
                    class215.method1544(var24, var22, var20, arg3, -19);
                    class215.method1544(var22, var21, var20, arg5, 88);
                    class215.method1544(var23, var24, var18, arg5, -21);
                    class215.method1544(var24, var22, var18, arg3, 103);
                    class215.method1544(var22, var21, var18, arg5, 119);
                } else {
                    int[] var25 = class15.field238[arg1 + var7];
                    int[] var26 = class15.field238[arg1 - var7];
                    int var27 = arg2 + var8;
                    int var28 = arg2 - var8;
                    class215.method1544(var28, var27, var25, arg5, 126);
                    class215.method1544(var28, var27, var26, arg5, -112);
                }
                var9 -= var7 << 1;
            }
            int var29 = arg2 - var7;
            int var30 = arg2 + var7;
            int[] var31 = class15.field238[arg1 + var8];
            int[] var32 = class15.field238[arg1 - var8];
            if (var10 <= var8) {
                class215.method1544(var29, var30, var31, arg5, 108);
                class215.method1544(var29, var30, var32, arg5, 81);
            } else {
                int var33 = var15 < var8 ? class14.field235[var8] : var15;
                int var34 = arg2 + var33;
                int var35 = arg2 - var33;
                class215.method1544(var29, var35, var31, arg5, -101);
                class215.method1544(var35, var34, var31, arg3, 86);
                class215.method1544(var34, var30, var31, arg5, -122);
                class215.method1544(var29, var35, var32, arg5, -81);
                class215.method1544(var35, var34, var32, arg3, 108);
                class215.method1544(var34, var30, var32, arg5, -2);
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIII)V")
    public static final void method596(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class204.field3602 = arg0;
        field1421++;
        class88.field1599 = arg3;
        class204.field3580 = arg2;
        class124.field2158 = arg1;
        if (arg4 != 1517971617) {
            method590((byte) -20);
        }
    }
}
