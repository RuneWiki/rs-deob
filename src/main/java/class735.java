import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public abstract class class735 {

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field9970;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field9971;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "Lwm;")
    public static class30 field9972;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "[Ls;")
    public static class358[] field9973;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IB)Z", line = 7)
    public static final boolean method3997(int arg0, byte arg1) {
        field9971++;
        if (arg1 > -81) {
            field9972 = null;
        }
        return (arg0 & -arg0) == arg0;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V", line = 20)
    public static void method3998(byte arg0) {
        field9973 = null;
        if (arg0 != -5) {
            method3999((byte) 52, null);
        }
        field9972 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BLtn;)I", line = 31)
    public static final int method3999(byte arg0, class749 arg1) {
        if (arg0 != -85) {
            method3998((byte) 12);
        }
        field9970++;
        if (class276.field3599 == arg1) {
            return 6407;
        } else if (class417.field5505 == arg1) {
            return 6408;
        } else if (class483.field6239 == arg1) {
            return 6406;
        } else if (class104.field1407 == arg1) {
            return 6409;
        } else if (class470.field6127 == arg1) {
            return 6410;
        } else if (class238.field3237 == arg1) {
            return 6145;
        } else {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)J")
    public abstract long method1568(int arg0);
}
