import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class137 {

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "[F")
    public static float[] field1733 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "[I")
    public static int[] field1736 = new int[2];

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "Laba;")
    public static class158 field1738 = new class158(0, -1);

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIII)V")
    public static final void method908(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 == 1002) {
            class545.method3194(class350.field4679, arg1, arg0);
        } else if (arg3 == 1008) {
            class545.method3194(class214.field2693, arg1, arg0);
        } else if (arg3 == 1012) {
            class545.method3194(class510.field7452, arg1, arg0);
        } else if (arg3 == 1010) {
            class545.method3194(class28.field610, arg1, arg0);
        } else if (arg3 == 1004) {
            class545.method3194(class363.field4824, arg1, arg0);
        }
        if (arg2 >= 30) {
            field1735++;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)J")
    public static final long method909(byte arg0) {
        field1737++;
        if (arg0 != 41) {
            method910(true);
        }
        return class150.field1859.method1965(arg0 ^ 0x28);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V")
    public static void method910(boolean arg0) {
        if (arg0) {
            field1736 = null;
        }
        field1736 = null;
        field1733 = null;
        field1738 = null;
    }
}
