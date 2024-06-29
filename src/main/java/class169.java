import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class169 extends class141 {

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "Lab;")
    public static class148 field2347 = new class148();

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "Z")
    public static boolean field2350 = false;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "I")
    public static int field2349 = 0;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "Z")
    public static boolean field2343;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "[Lag;")
    public static class189[] field2346;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
    public static void method1108(int arg0) {
        field2347 = null;
        field2346 = null;
        if (arg0 >= -36) {
            method1109(false, (byte) 120, (class235) null, (class182) null, (class235) null);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZBLhc;Lhg;Lhc;)V")
    public static final void method1109(boolean arg0, byte arg1, class235 arg2, class182 arg3, class235 arg4) {
        field2344++;
        if (arg1 <= 99) {
            method1108(-99);
        }
        class125.field1749 = arg0;
        class15.field153 = arg2;
        class278.field4319 = arg4;
        int var5 = class278.field4319.method1561(-24367) - 1;
        class127.field1805 = var5 * 256 + class278.field4319.method1577(var5, -6339);
        class200.field2781 = new String[] { null, null, null, null, class108.field1505 };
        class173.field2416 = new String[] { null, null, class195.field2700, null, null };
        class156.field2163 = arg3;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZI)Lo;")
    public static final class254 method1110(boolean arg0, int arg1) {
        field2341++;
        return arg0 ? (class254) class229.field3473.method23(216, (long) arg1) : null;
    }
}
