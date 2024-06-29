import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class197 {

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "[I")
    public static int[] field3585 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)I")
    public static int method1442(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
    public static void method1443(int arg0) {
        field3585 = null;
        if (arg0 != 2) {
            field3585 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILfh;)V")
    public static final void method1444(int arg0, class128 arg1) {
        field3582++;
        if ((arg1.field2385.length - arg1.field2379) < 1) {
            return;
        }
        int var2 = arg1.method937(false);
        if (var2 < 0 || var2 > 3) {
            return;
        }
        byte var3;
        if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (var3 > arg1.field2385.length - arg1.field2379) {
            return;
        }
        class10.field88 = arg1.method937(false);
        if (class10.field88 < 1) {
            class10.field88 = 1;
        } else if (class10.field88 > 4) {
            class10.field88 = 4;
        }
        class20.method119((byte) 44, arg1.method937(false) == 1);
        class45.field649 = arg1.method937(false) == 1;
        class64.field1246 = arg1.method937(false) == 1;
        class57.field1030 = arg1.method937(false) == 1;
        class119.field2249 = arg1.method937(false) == 1;
        class222.field4033 = arg1.method937(false) == 1;
        class9.field63 = arg1.method937(false) == 1;
        class233.field4261 = arg1.method937(false) == 1;
        class191.field3461 = arg1.method937(false);
        if (class191.field3461 > 2) {
            class191.field3461 = 2;
        }
        if (var2 < 2) {
            class91.field1712 = arg1.method937(false) == 1;
            arg1.method937(false);
        } else {
            class91.field1712 = arg1.method937(false) == 1;
        }
        int var4 = 43 / ((58 - arg0) / 45);
        class133.field2476 = arg1.method937(false) == 1;
        class250.field4537 = arg1.method937(false) == 1;
        class44.field627 = arg1.method937(false);
        if (class44.field627 > 2) {
            class44.field627 = 2;
        }
        class95.field1784 = arg1.method937(false) == 1;
        class91.field1726 = arg1.method937(false);
        if (class91.field1726 > 127) {
            class91.field1726 = 127;
        }
        class81.field1554 = arg1.method937(false);
        class11.field105 = arg1.method937(false);
        if (class11.field105 > 127) {
            class11.field105 = 127;
        }
        if (var2 >= 1) {
            class23.field334 = arg1.method912(-95);
            class98.field1852 = arg1.method912(95);
        }
        if (var2 >= 3) {
            class144.field2679 = arg1.method937(false) == 1;
        }
    }
}
