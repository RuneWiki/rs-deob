import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public abstract class class250 {

    @OriginalMember(owner = "client!mo", name = "l", descriptor = "[[I")
    public static int[][] field3718 = new int[5][5000];

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "I")
    public int field3708;

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
    public int field3711;

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "I")
    public int field3713;

    @OriginalMember(owner = "client!mo", name = "i", descriptor = "I")
    public int field3715;

    @OriginalMember(owner = "client!mo", name = "j", descriptor = "I")
    public int field3716;

    @OriginalMember(owner = "client!mo", name = "k", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!mo", name = "m", descriptor = "I")
    public int field3719;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "Lvl;")
    public static class165 field3707;

    @OriginalMember(owner = "client!mo", name = "h", descriptor = "Lin;")
    public static class177 field3714;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V", line = 10)
    public static final void method1835(int arg0) {
        if (class119.field1675 != null) {
            class119.field1675.method538(true);
        }
        if (class28.field396 != null) {
            class28.field396.method538(true);
        }
        class333.method2343((byte) -101, 2, class177.field2547, 22050);
        class119.field1675 = class299.method2126(22050, class54.field787, 2, 0, class306.field4585);
        class119.field1675.method533(class170.field2457, 1);
        class28.field396 = class299.method2126(2048, class54.field787, 12, 1, class306.field4585);
        class28.field396.method533(class179.field2576, 1);
        field3712++;
        int var1 = -31 % ((-arg0 - 41) / 60);
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)V", line = 34)
    public static void method1836(boolean arg0) {
        if (!arg0) {
            method1837(79, -4);
        }
        field3707 = null;
        field3718 = (int[][]) null;
        field3714 = null;
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(II)V", line = 57)
    public static final void method1837(int arg0, int arg1) {
        field3710++;
        if (class194.field2819 == arg0) {
            return;
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        if (class194.field2819 == 0) {
            class290.method2091(-5);
        }
        if (arg0 == 40) {
            class303.method2139(-1490424168);
        }
        if (arg0 != arg1 && class94.field1321 != null) {
            class94.field1321.method1555(false);
            class94.field1321 = null;
        }
        if (arg0 == 25 || arg0 == 28) {
            class165.field2352 = 0;
            class14.field213 = 1;
            class157.field2268 = 0;
            class99.field1409 = 0;
            class91.field1263 = 1;
            class213.method1536((byte) 124, true);
        }
        if (arg0 == 25 || arg0 == 10) {
            class255.method1870((byte) -90);
        }
        if (arg0 == 5) {
            class291.method2094(class216.field3184, (byte) 108);
        } else {
            class117.method873((byte) -121);
        }
        boolean var3 = class194.field2819 == 5 || class194.field2819 == 10 || class194.field2819 == 28;
        if (var2 != var3) {
            if (var2) {
                class150.field2187 = class291.field4406;
                if (class267.field4077 == 0) {
                    class261.method1931(arg1 - 40, 2);
                } else {
                    class143.method1030(class332.field5085, 255, 2, class291.field4406, 0, 66, false);
                }
                class57.field841.method233(-2, false);
            } else {
                class261.method1931(0, 2);
                class57.field841.method233(-2, true);
            }
        }
        if (class141.field2031 && (arg0 == 25 || arg0 == 28 || arg0 == 40)) {
            class141.method1002();
        }
        class194.field2819 = arg0;
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)V", line = 141)
    public static final void method1838(int arg0) {
        class270.field4101.method1410(-121);
        class274.field4153.method2392((byte) 96);
        field3709++;
        if (arg0 <= -49) {
            class203.field2978.method2392((byte) 78);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)V")
    public abstract void method1482(int arg0, int arg1);

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(III)V")
    public abstract void method1483(int arg0, int arg1, int arg2);
}
