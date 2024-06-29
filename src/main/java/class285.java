import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class285 {

    @OriginalMember(owner = "client!de", name = "d", descriptor = "[I")
    public static int[] field4499 = new int[8];

    @OriginalMember(owner = "client!de", name = "b", descriptor = "Lbi;")
    public static class104 field4497 = new class104(58, 2);

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "Lmn;")
    public static class162 field4501;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "[J")
    public static long[] field4500;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIZZ)V")
    public static final void method1926(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        if (!arg3) {
            method1926(78, 112, 126, true, true);
        }
        if (class452.field7013 == 0) {
            class94.method642(17795, false);
        } else {
            class396.field5991 = class452.field7013;
            class196.method1341(0, 6670);
        }
        field4498++;
        class257.field4156 = arg1;
        class122.field1663 = arg2;
        class244.field3958 = arg4;
        class194.method1206(arg0);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
    public static void method1927(byte arg0) {
        if (arg0 != -116) {
            method1928((byte) -127);
        }
        field4500 = null;
        field4499 = null;
        field4497 = null;
        field4501 = null;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(B)Z")
    public static final boolean method1928(byte arg0) {
        field4496++;
        int var1 = 15 % ((59 - arg0) / 52);
        return class174.field2565 == 0 ? class453.field7022.method404(-1) : true;
    }
}
