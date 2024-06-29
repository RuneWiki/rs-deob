import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class134 extends class56 {

    @OriginalMember(owner = "client!hi", name = "W", descriptor = "Ljava/lang/Object;")
    private Object field2599;

    @OriginalMember(owner = "client!hi", name = "Q", descriptor = "Lhh;")
    public static class163 field2593 = class137.method1065("_labels", 17);

    @OriginalMember(owner = "client!hi", name = "V", descriptor = "[I")
    public static int[] field2598 = new int[2];

    @OriginalMember(owner = "client!hi", name = "T", descriptor = "Lhh;")
    public static class163 field2596 = class137.method1065("<col=ffff00>", 17);

    @OriginalMember(owner = "client!hi", name = "M", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2589 = Calendar.getInstance();

    @OriginalMember(owner = "client!hi", name = "L", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!hi", name = "N", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!hi", name = "O", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!hi", name = "P", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!hi", name = "R", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!hi", name = "S", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!hi", name = "X", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!hi", name = "Y", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!hi", name = "U", descriptor = "Lie;")
    public static class221 field2597;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public final Object method392(int arg0) {
        if (arg0 != 4) {
            field2593 = null;
        }
        field2592++;
        return this.field2599;
    }

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "(B)V")
    public static final void method1053(byte arg0) {
        field2595++;
        class130.field2516.method111((byte) -52);
        if (arg0 < 27) {
            field2597 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lhh;B)I")
    public static final int method1054(class163 arg0, byte arg1) {
        field2588++;
        if (arg0 == null) {
            return -1;
        }
        if (arg1 != -74) {
            method1053((byte) -99);
        }
        for (int var2 = 0; var2 < class155.field2889; var2++) {
            if (arg0.method1228(class46.field769[var2], arg1 - 43)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "(B)Z")
    public final boolean method398(byte arg0) {
        field2594++;
        return arg0 != -79;
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class134(Object arg0) {
        this.field2599 = arg0;
    }

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "(B)V")
    public static void method1055(byte arg0) {
        if (arg0 != 47) {
            method1054((class163) null, (byte) -31);
        }
        field2597 = null;
        field2589 = null;
        field2596 = null;
        field2598 = null;
        field2593 = null;
    }
}
