import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class358 {

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "Lkp;")
    public static class507 field4562 = null;

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field4566;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lpl;I[ILpl;)V", line = 6)
    public static final void method1970(class612 arg0, int arg1, int[] arg2, class612 arg3) {
        if (arg2 != null) {
            class286.field3558 = arg2;
        }
        if (arg1 < 76) {
            field4567 = -54;
        }
        field4565++;
        class83.field1174 = arg3;
        class337.field4323 = arg0;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V", line = 22)
    public static final void method1971(int arg0) {
        class472.field5995.method2406(18385);
        field4564++;
        class84.field1187.method2406(18385);
        class376.field4740.method2406(18385);
        class376.field4747.method2406(18385);
        if (arg0 < 101) {
            field4566 = null;
        }
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)V", line = 39)
    public static void method1972(int arg0) {
        field4562 = null;
        if (arg0 == 6407) {
            field4566 = null;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IB)I", line = 52)
    public static final int method1973(int arg0, byte arg1) {
        field4563++;
        if (arg0 == 6406) {
            return 1;
        } else if (arg0 == 6409) {
            return 1;
        } else if (arg0 == 32841) {
            return 1;
        } else if (arg0 == 6410) {
            return 2;
        } else if (arg0 == 6407) {
            return 3;
        } else if (arg0 == 6408) {
            return 4;
        } else {
            if (arg1 >= -45) {
                method1970(null, -110, null, null);
            }
            throw new IllegalArgumentException("");
        }
    }
}
