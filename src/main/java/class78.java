import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class78 {

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static volatile int field1332 = 0;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "Lwa;")
    public static class75 field1343 = class66.method560("hitbar_default", false);

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
    public static int field1339 = 0;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "Lwa;")
    public static class75 field1347 = class66.method560("blaugr-Un:", false);

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "Z")
    public static boolean field1344 = false;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "Lwa;")
    public static class75 field1346 = class66.method560("Angreifen", false);

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "Lcb;")
    public static class267 field1335;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "Lcb;")
    public static class267 field1345;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIBI)V", line = 13)
    public static final void method667(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field1337++;
        class156 var5 = class206.method1525(10, -32701, arg0);
        var5.method1183(true);
        var5.field2665 = arg1;
        var5.field2680 = arg2;
        var5.field2674 = arg4;
        if (arg3 >= -66) {
            field1343 = (class75) null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIZII)I", line = 36)
    public static final int method668(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var7 = arg1 & 0x3;
        if ((arg2 & 0x1) == 1) {
            int var8 = arg6;
            arg6 = arg5;
            arg5 = var8;
        }
        field1341++;
        if (!arg4) {
            return -113;
        } else if (var7 == 0) {
            return arg3;
        } else if (var7 == 1) {
            return arg0;
        } else if (var7 == 2) {
            return 1 + 7 - arg6 - arg3;
        } else {
            return 7 + 1 - arg0 - arg5;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)J", line = 76)
    public static final synchronized long method669(int arg0) {
        long var1 = System.currentTimeMillis();
        if (class98.field1623 > var1) {
            class10.field132 += class98.field1623 - var1;
        }
        if (arg0 != 2047) {
            field1340 = -8;
        }
        class98.field1623 = var1;
        field1333++;
        return class10.field132 + var1;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V", line = 98)
    public static final void method670(int arg0) {
        field1338++;
        if (arg0 > -91) {
            return;
        }
        int var1 = class172.field2887 * 128 + 64;
        int var2 = class121.field2029 * 128 + 64;
        int var3 = class32.method217(var1, var2, true, class67.field1174) - class11.field148;
        if (class202.field3418 < 100) {
            if (class9.field121 < var2) {
                class9.field121 += (var2 - class9.field121) * class202.field3418 / 1000 + class81.field1365;
                if (var2 < class9.field121) {
                    class9.field121 = var2;
                }
            }
            if (class9.field121 > var2) {
                class9.field121 -= (class9.field121 - var2) * class202.field3418 / 1000 + class81.field1365;
                if (var2 > class9.field121) {
                    class9.field121 = var2;
                }
            }
            if (class228.field3825 < var3) {
                class228.field3825 += (var3 - class228.field3825) * class202.field3418 / 1000 + class81.field1365;
                if (class228.field3825 > var3) {
                    class228.field3825 = var3;
                }
            }
            if (var1 > class245.field4120) {
                class245.field4120 += class81.field1365 + ((var1 - class245.field4120) * class202.field3418 / 1000);
                if (class245.field4120 > var1) {
                    class245.field4120 = var1;
                }
            }
            if (class228.field3825 > var3) {
                class228.field3825 -= (class228.field3825 - var3) * class202.field3418 / 1000 + class81.field1365;
                if (var3 > class228.field3825) {
                    class228.field3825 = var3;
                }
            }
            if (class245.field4120 > var1) {
                class245.field4120 -= (class245.field4120 - var1) * class202.field3418 / 1000 + class81.field1365;
                if (var1 > class245.field4120) {
                    class245.field4120 = var1;
                }
            }
        } else {
            class9.field121 = class121.field2029 * 128 + 64;
            class245.field4120 = class172.field2887 * 128 + 64;
            class228.field3825 = class32.method217(class245.field4120, class9.field121, true, class67.field1174) - class11.field148;
        }
        int var4 = class152.field2607 * 128 + 64;
        int var5 = class14.field190 * 128 + 64;
        int var6 = class32.method217(var4, var5, true, class67.field1174) - class87.field1432;
        int var7 = var6 - class228.field3825;
        int var8 = var5 - class9.field121;
        int var9 = var4 - class245.field4120;
        int var10 = (int) Math.sqrt((double) (var8 * var8 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var7, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        int var12 = (int) (-325.949D * Math.atan2((double) var9, (double) var8)) & 0x7FF;
        int var13 = var12 - class87.field1433;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class87.field1433 += class123.field2061 * var13 / 1000 + class41.field654;
            class87.field1433 &= 0x7FF;
        }
        if (var11 > class232.field3931) {
            class232.field3931 += class41.field654 + ((var11 - class232.field3931) * class123.field2061 / 1000);
            if (var11 < class232.field3931) {
                class232.field3931 = var11;
            }
        }
        if (var13 < 0) {
            class87.field1433 -= class41.field654 + (-var13 * class123.field2061 / 1000);
            class87.field1433 &= 0x7FF;
        }
        if (class232.field3931 > var11) {
            class232.field3931 -= (class232.field3931 - var11) * class123.field2061 / 1000 + class41.field654;
            if (var11 > class232.field3931) {
                class232.field3931 = var11;
            }
        }
        int var14 = var12 - class87.field1433;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class87.field1433 = var12;
        }
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)V", line = 264)
    public static void method671(int arg0) {
        field1347 = null;
        field1345 = null;
        field1343 = null;
        if (arg0 == 1000) {
            field1346 = null;
            field1335 = null;
        }
    }
}
