import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class211 {

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "[I")
    public static int[] field3310 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "[I")
    public static int[] field3315 = new int[100];

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)Ljj;", line = 5)
    public static final class159 method1539(int arg0, int arg1) {
        field3312++;
        class159 var2 = (class159) class38.field578.method2288((long) arg0, (byte) 118);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class140.field2262.method967(arg0, arg1, 65280);
        class159 var4 = new class159(var3);
        var4.method1471(class92.field1505, (int[]) null);
        class38.field578.method2281(0, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILam;ZZIIZII)Lwd;", line = 25)
    public static final class88 method1540(int arg0, class270 arg1, boolean arg2, boolean arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        field3311++;
        class135 var9 = class188.method1361(true, arg0);
        if (arg7 > 1 && var9.field2177 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (var9.field2146[var11] <= arg7 && var9.field2146[var11] != 0) {
                    var10 = var9.field2177[var11];
                }
            }
            if (var10 != -1) {
                var9 = class188.method1361(true, var10);
            }
        }
        class271 var12 = var9.method1034(arg1, arg5 + 1);
        if (var12 == null) {
            return null;
        }
        class317 var13 = null;
        if (var9.field2185 != -1) {
            var13 = (class317) method1540(var9.field2178, arg1, true, true, 0, -1, false, 10, 1);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2174 != -1) {
            var13 = (class317) method1540(var9.field2148, arg1, false, true, arg4, -1, false, arg7, arg8);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class33.field503;
        int var15 = class33.field506;
        int[] var16 = new int[4];
        int var17 = class33.field509;
        class33.method300(var16);
        class317 var18 = new class317(36, 32);
        class33.method299(var18.field4988, 36, 32);
        class40.method368();
        class40.method367(16, 16);
        class40.field611 = false;
        int var19 = var9.field2204;
        if (arg2) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg8 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class40.field612[var9.field2157] * var19 >> 16;
        int var21 = class40.field619[var9.field2157] * var19 >> 16;
        var12.method756(0, var9.field2167, var9.field2169, var9.field2157, var9.field2205, var20 + var9.field2132 - (var12.method137() / 2), var21 - -var9.field2132, (long) arg5);
        if (arg8 >= 1) {
            var18.method2242(1);
            if (arg8 >= 2) {
                var18.method2242(16777215);
            }
            class33.method299(var18.field4988, 36, 32);
        }
        if (arg4 != 0) {
            var18.method2249(arg4);
        }
        if (var9.field2185 != -1) {
            var13.method698(0, 0);
        } else if (var9.field2174 != -1) {
            class33.method299(var13.field4988, 36, 32);
            var18.method698(0, 0);
            var18 = var13;
        }
        if (arg6 && (var9.field2198 == 1 || arg7 != 1) && arg7 != -1) {
            class201.field3104.method1480(class79.method619(95, arg7), 0, 9, 16776960, 1);
        }
        class33.method299(var14, var15, var17);
        class33.method290(var16);
        class40.method368();
        class40.field611 = true;
        return class162.field2623 && !arg3 ? new class196(var18) : var18;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V", line = 155)
    public static void method1541(byte arg0) {
        field3310 = null;
        field3315 = null;
        int var1 = -101 / ((arg0 - 16) / 54);
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(B)Lpb;", line = 182)
    public static final class85 method1542(byte arg0) {
        field3317++;
        try {
            if (arg0 != 51) {
                method1540(61, (class270) null, false, true, -96, 77, true, -29, -127);
            }
            return (class85) Class.forName("kk").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }
}
