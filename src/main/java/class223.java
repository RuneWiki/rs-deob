import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class223 {

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public static int field3493 = 0;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "Lni;")
    public static class23 field3491 = class90.method609((byte) -102);

    @OriginalMember(owner = "client!k", name = "i", descriptor = "I")
    public static volatile int field3495 = 0;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "Lvl;")
    public static class73 field3494;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
    public static final void method1578(int arg0) {
        field3490++;
        class176.field2767.method1510(10283);
        if (arg0 > -88) {
            field3494 = null;
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(I)V")
    public static final void method1579(int arg0) {
        class254.field4148.method1510(10283);
        if (arg0 != -1) {
            method1580(true);
        }
        field3488++;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)V")
    public static void method1580(boolean arg0) {
        field3491 = null;
        if (!arg0) {
            method1579(47);
        }
        field3494 = null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lvl;Lvl;B)V")
    public static final void method1581(class73 arg0, class73 arg1, byte arg2) {
        class180.field2828 = arg0;
        class169.field2600 = arg1;
        field3489++;
        if (arg2 >= -116) {
            method1582(false);
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(Z)V")
    public static final void method1582(boolean arg0) {
        field3487++;
        if (!class63.field911) {
            return;
        }
        class231 var1 = class282.method1942(class71.field1034, class304.field4829, (byte) -117);
        if (var1 != null && var1.field3676 != null) {
            class122 var2 = new class122();
            var2.field1752 = var1;
            var2.field1755 = var1.field3676;
            class122.method795(var2, -118);
        }
        class63.field911 = false;
        class288.field4653 = -1;
        class247.method1761(var1, (byte) -115);
        if (!arg0) {
            method1578(69);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lvl;B)V")
    public static final void method1583(class73 arg0, byte arg1) {
        if (arg1 >= -109) {
            field3494 = null;
        }
        class187.field2936 = arg0;
        field3492++;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method1584(int arg0, int arg1, int arg2, long arg3) {
        class113 var5 = class184.field2892[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field1640 != null && var5.field1640.field4270 == arg3) {
            return true;
        } else if (var5.field1649 != null && var5.field1649.field2551 == arg3) {
            return true;
        } else if (var5.field1650 != null && var5.field1650.field859 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field1646; var6++) {
                if (var5.field1634[var6].field2354 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }
}
