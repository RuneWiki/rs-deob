import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public abstract class class156 {

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "Lpi;")
    public static class342 field2451 = new class342("scroll:", "scrollen:", "déroulement:", "rolagem:");

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "Lrn;")
    public static class174 field2454 = new class174(56, 4);

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field2455 = 100;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field2456 = new String[100];

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V", line = 4)
    public static void method1168(int arg0) {
        field2454 = null;
        field2456 = null;
        if (arg0 != 0) {
            method1168(-30);
        }
        field2451 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lbu;Z)V", line = 23)
    public static final void method1172(class17 arg0, boolean arg1) {
        field2450++;
        if (arg1) {
            class256.field3687 = arg0;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lmt;B)V", line = 34)
    public static final void method1173(class271 arg0, byte arg1) {
        field2453++;
        if (arg1 >= -93) {
            method1172(null, false);
        }
        arg0.field3915 = null;
        if (class354.field5411 < 20) {
            class341.field5146.method1636(9, arg0);
            class354.field5411++;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)V", line = 58)
    public static final void method1174(int arg0, int arg1) {
        if (arg0 <= 53) {
            return;
        }
        field2452++;
        if (arg1 < 0 || arg1 > 2) {
            arg1 = 0;
        }
        class148.field2365 = arg1;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)Z")
    public abstract boolean method1169(int arg0);

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)I")
    public abstract int method1170(int arg0);

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)I")
    public abstract int method1171(byte arg0);

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)J")
    public abstract long method1175(int arg0);

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)C")
    public abstract char method1176(byte arg0);
}
