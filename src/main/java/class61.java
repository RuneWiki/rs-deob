import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public abstract class class61 {

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "Lvk;")
    public static class67 field970 = new class67(500);

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "Lck;")
    public static class119 field975 = class298.method1987((byte) 95, ": ");

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "Lwi;")
    public static class23 field974;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BLml;)V", line = 4)
    public static final void method449(byte arg0, class134 arg1) {
        field972++;
        int var2 = arg1.field2068;
        if (var2 == 324) {
            if (class94.field1446 == -1) {
                class94.field1446 = arg1.field2073;
                class226.field3612 = arg1.field2186;
            }
            if (class82.field1254.field4156) {
                arg1.field2073 = class94.field1446;
            } else {
                arg1.field2073 = class226.field3612;
            }
            return;
        }
        int var3 = 33 % ((arg0 - 31) / 45);
        if (var2 == 325) {
            if (class94.field1446 == -1) {
                class94.field1446 = arg1.field2073;
                class226.field3612 = arg1.field2186;
            }
            if (class82.field1254.field4156) {
                arg1.field2073 = class226.field3612;
            } else {
                arg1.field2073 = class94.field1446;
            }
        } else if (var2 == 327) {
            arg1.field2170 = 150;
            arg1.field2123 = (int) (Math.sin((double) class1.field15 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field2126 = 5;
            arg1.field2171 = -1;
        } else if (var2 == 328) {
            if (class124.field1917.field4861 == null) {
                arg1.field2171 = 0;
            } else {
                arg1.field2170 = 150;
                arg1.field2123 = (int) (Math.sin((double) class1.field15 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field2126 = 5;
                arg1.field2171 = ((int) class124.field1917.field4861.method786((byte) 112) << 11) + 2047;
                arg1.field2113 = class124.field1917.field4948;
                arg1.field2178 = class124.field1917.field4951;
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BI)V", line = 78)
    public static final void method450(byte arg0, int arg1) {
        field971++;
        if (arg0 == -116) {
            class154.field2469.method491(arg0 + 26, arg1);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lck;Z)Z", line = 97)
    public static final boolean method451(class119 arg0, boolean arg1) {
        if (arg1) {
            field975 = (class119) null;
        }
        field967++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class97.field1482; var2++) {
            if (arg0.method793(class126.field1941[var2], 40)) {
                return true;
            }
        }
        if (arg0.method793(class124.field1917.field4861, 40)) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lfj;ZI)Lck;", line = 127)
    public static final class119 method452(class3 arg0, boolean arg1, int arg2) {
        field968++;
        try {
            class119 var3 = new class119();
            var3.field1825 = arg0.method75(-32768);
            if (!arg1) {
                return (class119) null;
            }
            if (var3.field1825 > arg2) {
                var3.field1825 = arg2;
            }
            var3.field1838 = new byte[var3.field1825];
            arg0.field44 += class210.field3358.method649(0, var3.field1825, 16631, arg0.field44, var3.field1838, arg0.field101);
            return var3;
        } catch (Exception var5) {
            return class96.field1469;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)V", line = 162)
    public static final void method454(int arg0, int arg1) {
        class216.field3482.method491(-127, arg0);
        if (arg1 <= 93) {
            field974 = (class23) null;
        }
        field973++;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/lang/Object;ZZ)[B", line = 174)
    public static final byte[] method455(Object arg0, boolean arg1, boolean arg2) {
        field969++;
        if (arg0 == null) {
            return null;
        } else if (arg2) {
            return (byte[]) null;
        } else if ((arg0 instanceof byte[])) {
            byte[] var4 = (byte[]) ((byte[]) arg0);
            return arg1 ? class254.method1636(var4, (byte) 71) : var4;
        } else if ((arg0 instanceof class245)) {
            class245 var3 = (class245) arg0;
            return var3.method1178(-72);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V", line = 217)
    public static void method456(int arg0) {
        field970 = null;
        field974 = null;
        field975 = null;
        if (arg0 != 500) {
            field974 = (class23) null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ln;I)Ln;")
    public abstract class157 method453(class157 arg0, int arg1);
}
