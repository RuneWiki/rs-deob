import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class144 extends class83 {

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "[I")
    public int[] field2464 = new int[1];

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "[I")
    public int[] field2461 = new int[] { -1 };

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "I")
    public static int field2462 = -1;

    @OriginalMember(owner = "client!ji", name = "t", descriptor = "[[S")
    public static short[][] field2467 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!ji", name = "s", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!ji", name = "u", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!ji", name = "v", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!ji", name = "w", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIILtb;IJ)Z")
    public static final boolean method999(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class184 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class274.method1800(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)V")
    public static void method1000(int arg0) {
        if (arg0 <= 125) {
            field2462 = -82;
        }
        field2467 = null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method1001(int arg0, String arg1) {
        field2465++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = arg0; var2 < class90.field1589; var2++) {
            if (arg1.equalsIgnoreCase(class155.field2598[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method1002(String arg0, byte arg1) {
        field2470++;
        class204.field3339 = arg0;
        if (class127.field2238.field2294 == null) {
            return;
        }
        try {
            String var2 = class127.field2238.field2294.getParameter("cookieprefix");
            String var3 = class127.field2238.field2294.getParameter("cookiehost");
            if (arg1 > -116) {
                method1004(-42, 39, 9, 84, -22, 40, -120, 72, 103, -76);
            }
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class246.method1648(-58, class232.method1544((byte) -103) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class94.method605("document.cookie=\"" + var5 + "\"", 28436, class127.field2238.field2294);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)I")
    public static final int method1003(int arg0, int arg1) {
        field2466++;
        if (arg0 != 1625386855) {
            method999(76, 99, 87, -34, -101, -24, (class184) null, -107, -108L);
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1004(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg9 != -32436) {
            return;
        }
        if (arg1 == arg4 && arg0 == arg8 && arg2 == arg7 && arg3 == arg5) {
            class157.method1081(arg2, arg0, arg6, arg4, 1686341260, arg5);
        } else {
            int var10 = arg4;
            int var11 = arg0;
            int var12 = arg4 * 3;
            int var13 = arg0 * 3;
            int var14 = arg1 * 3;
            int var15 = arg7 * 3;
            int var16 = arg8 * 3;
            int var17 = arg3 * 3;
            int var18 = arg2 + var14 - var15 - arg4;
            int var19 = arg5 + var16 - var17 - arg0;
            int var20 = var15 + var12 - var14 - var14;
            int var21 = var14 - var12;
            int var22 = var17 + var13 - var16 - var16;
            int var23 = var16 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var24;
                int var31 = var23 * var24;
                int var32 = var22 * var25;
                int var33 = arg4 + (var27 + var30 + var29 >> 12);
                int var34 = (var28 + var32 + var31 >> 12) + arg0;
                class157.method1081(var33, var11, arg6, var10, arg9 + 1686373696, var34);
                var11 = var34;
                var10 = var33;
            }
        }
        field2468++;
    }
}
