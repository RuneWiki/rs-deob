import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class232 {

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "I")
    public int field3097;

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "I")
    public int field3098;

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "I")
    public int field3099;

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "I")
    public int field3101;

    @OriginalMember(owner = "client!wn", name = "g", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Led;Z)I", line = 10)
    public static final int method1443(class116 arg0, boolean arg1) {
        field3096++;
        if (class630.field8719 == arg0) {
            return 5890;
        } else if (class502.field6912 == arg0) {
            return 34167;
        } else if (class533.field7324 == arg0) {
            return 34168;
        } else if (class137.field1869 == arg0) {
            return 34166;
        } else if (arg1) {
            return -29;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lkba;B)V", line = 44)
    public static final void method1444(class573 arg0, byte arg1) {
        if (arg1 >= -103) {
            method1444(null, (byte) -54);
        }
        field3100++;
        class502 var2 = (class502) class140.field1903.method3057(1, (long) arg0.field3010);
        if (var2 == null) {
            class519.method2943(arg0.field385, arg0, null, 0, arg0.field3088[0], arg0.field3086[0], true, null);
        } else {
            var2.method2853((byte) -94);
        }
    }
}
