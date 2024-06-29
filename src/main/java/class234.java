import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class234 {

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    public static int field3535 = 0;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "Lhk;")
    public static class127 field3537;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZB)V")
    public static final void method1537(boolean arg0, byte arg1) {
        int var2 = -102 / ((-arg1 - 14) / 54);
        field3528++;
        if (arg0 != class27.field340) {
            class27.field340 = arg0;
            class4.method17(-1);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BI)V")
    public static final void method1538(byte arg0, int arg1) {
        if (arg0 != 93) {
            method1539(-27);
        }
        field3532++;
        class177.field2479.method536(92, arg1);
        class62.field858.method536(-116, arg1);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public static final void method1539(int arg0) {
        class224.field3396.method544(false);
        field3527++;
        if (arg0 != -811) {
            field3529 = -36;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V")
    public static final void method1540(byte arg0) {
        if (arg0 != 111) {
            field3535 = 96;
        }
        if (class168.field2333 != -1) {
            class204.method1295(-1, class168.field2333, 999814092, -1);
            class168.field2333 = -1;
        }
        field3533++;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIILsa;Lsa;IIIIJ)V")
    public static final void method1541(int arg0, int arg1, int arg2, int arg3, class268 arg4, class268 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class228 var12 = new class228();
        var12.field3453 = arg10;
        var12.field3450 = arg1 * 128 + 64;
        var12.field3451 = arg2 * 128 + 64;
        var12.field3452 = arg3;
        var12.field3459 = arg4;
        var12.field3463 = arg5;
        var12.field3460 = arg6;
        var12.field3462 = arg7;
        var12.field3446 = arg8;
        var12.field3457 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class194.field2682[var13][arg1][arg2] == null) {
                class194.field2682[var13][arg1][arg2] = new class89(var13, arg1, arg2);
            }
        }
        class194.field2682[arg0][arg1][arg2].field1235 = var12;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lse;B)V")
    public static final void method1542(class211 arg0, byte arg1) {
        field3530++;
        if (arg1 <= 78) {
            field3526 = -68;
        }
        class211 var2 = class139.method940(0, arg0);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class275.field4263;
            var4 = class197.field2739;
        } else {
            var4 = var2.field3166;
            var3 = var2.field3112;
        }
        class13.method83(false, var3, arg0, var4, 124);
        class148.method999(var3, -951136957, var4, arg0);
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)V")
    public static final void method1543(byte arg0) {
        if (arg0 > -116) {
            method1540((byte) 61);
        }
        class101.field1406.method544(false);
        field3525++;
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(B)V")
    public static void method1544(byte arg0) {
        if (arg0 <= 105) {
            method1545(29, 27, 56, 19L);
        }
        field3537 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method1545(int arg0, int arg1, int arg2, long arg3) {
        class89 var5 = class194.field2682[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field1244 != null && var5.field1244.field2719 == arg3) {
            return true;
        } else if (var5.field1235 != null && var5.field1235.field3453 == arg3) {
            return true;
        } else if (var5.field1237 != null && var5.field1237.field322 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field1240; var6++) {
                if (var5.field1226[var6].field2753 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }
}
