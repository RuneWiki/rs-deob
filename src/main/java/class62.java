import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class62 {

    @OriginalMember(owner = "client!j", name = "c", descriptor = "Lhe;")
    public static class54 field1505 = class6.method58("(Y", false);

    @OriginalMember(owner = "client!j", name = "e", descriptor = "Lhe;")
    private static class54 field1507 = class6.method58("Loading title screen )2 ", false);

    @OriginalMember(owner = "client!j", name = "l", descriptor = "[I")
    public static int[] field1514 = new int[4000];

    @OriginalMember(owner = "client!j", name = "j", descriptor = "Lhe;")
    public static class54 field1512 = class6.method58("::fpsoff", false);

    @OriginalMember(owner = "client!j", name = "k", descriptor = "Lhe;")
    private static class54 field1513 = class6.method58("Invalid loginserver requested)3", false);

    @OriginalMember(owner = "client!j", name = "b", descriptor = "Lhe;")
    public static class54 field1504 = field1513;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "Lhe;")
    public static class54 field1506 = class6.method58(" zuerst von Ihrer Freunde)2Liste(Q", false);

    @OriginalMember(owner = "client!j", name = "m", descriptor = "Lhe;")
    public static class54 field1515 = field1507;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "[I")
    public static int[] field1503;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)Lhe;")
    public static final class54 method491(int arg0, int arg1) {
        field1516++;
        if (arg1 != -1) {
            return null;
        } else if (arg0 < 100000) {
            return class143.method1105(new class54[] { class157.field3586, class147.method1117(arg1 - 11, arg0), class84.field2103 }, -842);
        } else if (arg0 < 10000000) {
            return class143.method1105(new class54[] { class133.field3019, class147.method1117(-16, arg0 / 1000), class146.field3306, class84.field2103 }, -842);
        } else {
            return class143.method1105(new class54[] { class32.field825, class147.method1117(-76, arg0 / 1000000), class63.field1534, class84.field2103 }, -842);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
    public static final void method492(int arg0) {
        field1511++;
        class15.field457.method992(0);
        if (arg0 != 4000) {
            method493(-89);
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V")
    public static void method493(int arg0) {
        field1512 = null;
        field1503 = null;
        field1507 = null;
        field1504 = null;
        field1514 = null;
        field1505 = null;
        field1513 = null;
        if (arg0 != -1) {
            method493(24);
        }
        field1515 = null;
        field1506 = null;
    }
}
