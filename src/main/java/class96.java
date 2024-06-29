import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public abstract class class96 extends class291 {

    @OriginalMember(owner = "client!fc", name = "Q", descriptor = "Z")
    public volatile boolean field1500 = true;

    @OriginalMember(owner = "client!fc", name = "N", descriptor = "Leg;")
    public static class37 field1498 = class174.method1167("null", 73);

    @OriginalMember(owner = "client!fc", name = "V", descriptor = "Z")
    public static boolean field1505 = false;

    @OriginalMember(owner = "client!fc", name = "Y", descriptor = "Leg;")
    private static class37 field1508 = class174.method1167("", -48);

    @OriginalMember(owner = "client!fc", name = "R", descriptor = "I")
    public static int field1501 = 0;

    @OriginalMember(owner = "client!fc", name = "X", descriptor = "I")
    public static int field1507 = 100;

    @OriginalMember(owner = "client!fc", name = "O", descriptor = "[I")
    public static int[] field1499 = new int[256];

    @OriginalMember(owner = "client!fc", name = "Z", descriptor = "Leg;")
    public static class37 field1509 = field1508;

    @OriginalMember(owner = "client!fc", name = "bb", descriptor = "Leg;")
    public static class37 field1511 = class174.method1167("(Udns", 79);

    @OriginalMember(owner = "client!fc", name = "U", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!fc", name = "W", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!fc", name = "ab", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!fc", name = "S", descriptor = "Z")
    public boolean field1502;

    @OriginalMember(owner = "client!fc", name = "T", descriptor = "Z")
    public boolean field1503;

    @OriginalMember(owner = "client!fc", name = "M", descriptor = "[Lrk;")
    public static class14[] field1497;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "(I)[B")
    public abstract byte[] method618(int arg0);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BZ)V")
    public static final void method623(byte arg0, boolean arg1) {
        field1504++;
        if (arg1 == class49.field770) {
            return;
        }
        if (arg0 != -78) {
            method625(-19);
        }
        class49.field770 = arg1;
        class37.method249(false);
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V")
    public static final void method624(byte arg0) {
        field1510++;
        if (class265.field4655 == 2) {
            if (class24.field353 == class1.field12 && class274.field4805 == class233.field4030) {
                class265.field4655 = 0;
                if (class56.field877 && class158.field2625[81] && class159.field2661 > 2) {
                    class271.method1821(2, class159.field2661 - 2);
                } else {
                    class271.method1821(2, class159.field2661 - 1);
                }
            }
        } else if (class24.field353 == class163.field2685 && class274.field4805 == class110.field1837) {
            class265.field4655 = 0;
            if (class56.field877 && class158.field2625[81] && class159.field2661 > 2) {
                class271.method1821(2, class159.field2661 - 2);
            } else {
                class271.method1821(2, class159.field2661 - 1);
            }
        } else {
            class233.field4030 = class110.field1837;
            class265.field4655 = 2;
            class1.field12 = class163.field2685;
        }
        if (arg0 > -27) {
            field1499 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "(I)V")
    public static void method625(int arg0) {
        field1497 = null;
        if (arg0 != -3) {
            field1511 = null;
        }
        field1511 = null;
        field1499 = null;
        field1498 = null;
        field1509 = null;
        field1508 = null;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(Z)I")
    public abstract int method621(boolean arg0);

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)I")
    public static int method626(int arg0, int arg1) {
        return arg0 & arg1;
    }
}
