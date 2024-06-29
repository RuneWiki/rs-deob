import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class88 {

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1440 = "Allocating memory";

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "[I")
    public static int[] field1442 = new int[25];

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1444 = "K";

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field1441 = new String[100];

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "Lfm;")
    public static class93 field1443;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    public static void method600(int arg0) {
        field1443 = null;
        field1442 = null;
        field1440 = null;
        field1444 = null;
        field1441 = null;
        if (arg0 != -1) {
            field1441 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIJI)Z")
    public static final boolean method601(int arg0, int arg1, long arg2, int arg3) {
        if (arg3 >= -7) {
            method601(69, 21, 93L, -13);
        }
        field1445++;
        int var5 = ((int) arg2 & 0x39D4C1) >> 20;
        int var6 = (int) arg2 >> 14 & 0x1F;
        int var7 = Integer.MAX_VALUE & (int) (arg2 >>> 32);
        if (var6 == 10 || var6 == 11 || var6 == 22) {
            class158 var8 = class5.method29(var7, true);
            int var9 = var8.field2521;
            int var10;
            int var11;
            if (var5 == 0 || var5 == 2) {
                var11 = var8.field2487;
                var10 = var8.field2507;
            } else {
                var10 = var8.field2487;
                var11 = var8.field2507;
            }
            if (var5 != 0) {
                var9 = (var9 >> 4 - var5) + (var9 << var5 & 0xF);
            }
            class223.method1526(class239.field3829.field704[0], true, var9, class239.field3829.field709[0], arg1, 122, 0, var10, var11, 0, arg0);
        } else {
            class223.method1526(class239.field3829.field704[0], true, 0, class239.field3829.field709[0], arg1, 108, var6 + 1, 0, 0, var5, arg0);
        }
        return true;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)V")
    public static final void method602(int arg0, int arg1, int arg2) {
        field1438++;
        class175 var3 = class182.method1317(6, arg2, false);
        var3.method1279((byte) -80);
        var3.field2855 = arg0;
        if (arg1 > -12) {
            method601(-121, -18, -4L, -17);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZIZIZILoh;IZ)Lbl;")
    public static final class146 method603(boolean arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, class264 arg6, int arg7, boolean arg8) {
        class115 var9 = class81.method562(arg1, -20358);
        field1439++;
        if (arg3 > 1 && var9.field1821 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg3 >= var9.field1792[var11] && var9.field1792[var11] != 0) {
                    var10 = var9.field1821[var11];
                }
            }
            if (var10 != -1) {
                var9 = class81.method562(var10, -20358);
            }
        }
        class31 var12 = var9.method816(arg6, 124);
        if (var12 == null) {
            return null;
        }
        class232 var13 = null;
        if (var9.field1780 != -1) {
            var13 = (class232) method603(true, var9.field1818, false, 10, false, 1, arg6, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1801 != -1) {
            var13 = (class232) method603(false, var9.field1824, false, arg3, arg4, arg5, arg6, arg7, true);
            if (var13 == null) {
                return null;
            }
        }
        int var14 = class127.field2006;
        int[] var15 = class127.field2007;
        int var16 = class127.field2005;
        int[] var17 = new int[4];
        class127.method887(var17);
        class232 var18 = new class232(36, 32);
        class127.method894(var18.field3733, 36, 32);
        class302.method2008();
        class302.method1995(16, 16);
        class302.field4827 = arg4;
        int var19 = var9.field1830;
        if (arg0) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg5 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class302.field4824[var9.field1779] * var19 >> 16;
        int var21 = class302.field4823[var9.field1779] * var19 >> 16;
        var12.method168(0, var9.field1852, var9.field1825, var9.field1779, var9.field1834, var21 - (var12.method15() / 2 - var9.field1783), var20 - -var9.field1783, -1L);
        if (arg5 >= 1) {
            var18.method1557(1);
            if (arg5 >= 2) {
                var18.method1557(16777215);
            }
            class127.method894(var18.field3733, 36, 32);
        }
        if (arg7 != 0) {
            var18.method1562(arg7);
        }
        if (var9.field1780 != -1) {
            var13.method1026(0, 0);
        } else if (var9.field1801 != -1) {
            class127.method894(var13.field3733, 36, 32);
            var18.method1026(0, 0);
            var18 = var13;
        }
        if (arg2 && (var9.field1794 == 1 || arg3 != 1) && arg3 != -1) {
            class149.field2329.method645(class71.method487(1000000, arg3), 0, 9, 16776960, 1);
        }
        class127.method894(var15, var14, var16);
        class127.method902(var17);
        class302.method2008();
        class302.field4827 = true;
        return var18;
    }
}
