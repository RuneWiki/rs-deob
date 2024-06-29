import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class51 {

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "Lwj;")
    public static class270 field618 = new class270(50, 12);

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "[I")
    public static int[] field619 = new int[] { 4, 4, 1, 2, 6, 4, 2, 47, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!pv", name = "d", descriptor = "[I")
    public static int[] field621 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!pv", name = "e", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(ZZZ)V", line = 8)
    public static final void method446(boolean arg0, boolean arg1, boolean arg2) {
        if (arg2) {
            class272.field3757--;
            if (class272.field3757 == 0) {
                class166.field2487 = null;
            }
        }
        field620++;
        if (arg1) {
            class476.field6944--;
            if (class476.field6944 == 0) {
                class40.field506 = null;
            }
        }
        if (arg0) {
            method447(null, false, true, true);
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lq;ZZZ)V", line = 45)
    public static final void method447(class295 arg0, boolean arg1, boolean arg2, boolean arg3) {
        field622++;
        int var4 = arg0.field4055;
        int var5 = (int) arg0.field3615;
        arg0.method1565(0);
        if (arg2) {
            class265.method1587((byte) -125, var4);
        }
        class79.method641(var4, (byte) -63);
        class150 var6 = class60.method497(var5, (byte) -127);
        if (var6 != null) {
            class370.method2222(0, var6);
        }
        class90.method673((byte) 86);
        if (!arg3 && class188.field2723 != -1) {
            class467.method2736(class188.field2723, 9380, 1);
        }
        class105 var7 = new class105(class212.field2960);
        if (!arg1) {
            return;
        }
        for (class295 var8 = (class295) var7.method775(false); var8 != null; var8 = (class295) var7.method778(75)) {
            if (!var8.method1564(4)) {
                var8 = (class295) var7.method775(false);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field4059 == 3) {
                int var9 = (int) var8.field3615;
                if ((var9 >>> 16) == var4) {
                    method447(var8, true, true, arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)V", line = 109)
    public static void method448(byte arg0) {
        if (arg0 != -39) {
            field619 = null;
        }
        field621 = null;
        field618 = null;
        field619 = null;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lgg;Z)Z", line = 126)
    public static final boolean method449(class116 arg0, boolean arg1) {
        boolean var2 = class89.field1302 == class211.field2950;
        int var3 = 0;
        byte var4 = 0;
        byte var5 = 0;
        arg0.method610(7);
        if (arg0.field1729 < 0 || arg0.field1730 < 0 || arg0.field1736 >= class206.field2881 || arg0.field1742 >= class371.field5427) {
            return false;
        }
        for (int var6 = arg0.field1729; var6 <= arg0.field1736; var6++) {
            for (int var9 = arg0.field1730; var9 <= arg0.field1742; var9++) {
                class486 var10 = class307.method1784(arg0.field1738, var6, var9);
                if (var10 != null) {
                    int var11 = 0;
                    if (var6 > arg0.field1729) {
                        var11++;
                    }
                    if (var6 < arg0.field1736) {
                        var11 += 4;
                    }
                    if (var9 > arg0.field1730) {
                        var11 += 8;
                    }
                    if (var9 < arg0.field1742) {
                        var11 += 2;
                    }
                    class164 var12 = class85.method662(var11, (byte) 14, arg0);
                    class164 var13 = var10.field7115;
                    if (var13 == null) {
                        var10.field7115 = var12;
                    } else {
                        while (var13.field2467 != null) {
                            var13 = var13.field2467;
                        }
                        var13.field2467 = var12;
                    }
                    var10.field7099 = (byte) (var10.field7099 | var11);
                    if (var2 && (class257.field3581[var6][var9] & 0xFF000000) != 0) {
                        var3 = class257.field3581[var6][var9];
                        var4 = class12.field192[var6][var9];
                        var5 = class391.field5739[var6][var9];
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var7 = arg0.field1729; var7 <= arg0.field1736; var7++) {
                for (int var8 = arg0.field1730; var8 <= arg0.field1742; var8++) {
                    if ((class257.field3581[var7][var8] & 0xFF000000) == 0) {
                        class257.field3581[var7][var8] = var3;
                        class12.field192[var7][var8] = var4;
                        class391.field5739[var7][var8] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class420.field6132[class304.field4159++] = arg0;
        }
        return true;
    }
}
