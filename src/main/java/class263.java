import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class263 {

    @OriginalMember(owner = "client!re", name = "d", descriptor = "J")
    public long field4270 = 0L;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field4267 = 0;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "I")
    public static int field4279 = 1;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public int field4274;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "I")
    public int field4276;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    public int field4278;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "I")
    public int field4280;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "I")
    public int field4283;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "Lsc;")
    public class248 field4275;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "Lsc;")
    public class248 field4281;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)I")
    public static final int method1844(int arg0, int arg1) {
        field4268++;
        if (arg1 != 255) {
            field4271 = -91;
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIB)V")
    public static final void method1845(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 >= -83) {
            method1847(58, (class73) null);
        }
        field4282++;
        class173 var4 = class272.method1896(arg1, false, arg0, arg2);
        if (var4 == null) {
            return;
        }
        class230.field3552 = new int[var4.field2720];
        if (var4.field2716 == 15 || var4.field2716 == 17 || var4.field2716 == 16) {
            int var5 = 0;
            int var6 = 0;
            if (class281.field4569 != null) {
                var5 = class281.field4569.field3734;
                var6 = class281.field4569.field3608;
            }
            class230.field3552[0] = class50.field633 - var5;
            class230.field3552[1] = class71.field1042 - var6;
        }
        class6.field84 = new String[var4.field2726];
        class49.method307(var4, 200000, (byte) -12);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lrb;ZIBLrb;)I")
    public static final int method1846(class210 arg0, boolean arg1, int arg2, byte arg3, class210 arg4) {
        field4273++;
        if (arg2 == 1) {
            int var5 = arg4.field3819;
            int var6 = arg0.field3819;
            if (!arg1) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var6 - var5;
        } else if (arg2 == 2) {
            return class122.method794(0, arg0.method1456(false).field4413, arg4.method1456(false).field4413, class46.field571);
        } else if (arg3 < 106) {
            return 62;
        } else if (arg2 == 3) {
            if (arg0.field3272.equals("-")) {
                if (arg4.field3272.equals("-")) {
                    return 0;
                } else if (arg1) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg4.field3272.equals("-")) {
                return arg1 ? 1 : -1;
            } else {
                return class122.method794(0, arg0.field3272, arg4.field3272, class46.field571);
            }
        } else if (arg2 == 4) {
            if (arg0.method1666(-82)) {
                return arg4.method1666(80) ? 0 : 1;
            } else if (arg4.method1666(84)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 == 5) {
            if (arg0.method1665(-1)) {
                return arg4.method1665(-1) ? 0 : 1;
            } else if (arg4.method1665(-1)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 == 6) {
            if (arg0.method1664(111)) {
                return arg4.method1664(-78) ? 0 : 1;
            } else if (arg4.method1664(-118)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 != 7) {
            return arg0.field3273 - arg4.field3273;
        } else if (arg0.method1660(85)) {
            return arg4.method1660(44) ? 0 : 1;
        } else if (arg4.method1660(114)) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILvl;)V")
    public static final void method1847(int arg0, class73 arg1) {
        field4272++;
        class129.field1860 = arg1.method498(arg0 ^ arg0, "runes");
    }
}
