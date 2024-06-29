import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class81 extends class152 {

    @OriginalMember(owner = "client!jk", name = "R", descriptor = "Ljava/lang/Object;")
    private Object field1356;

    @OriginalMember(owner = "client!jk", name = "X", descriptor = "Lwa;")
    public static class75 field1362 = class66.method560("headicons_pk", false);

    @OriginalMember(owner = "client!jk", name = "W", descriptor = "I")
    public static int field1361 = -1;

    @OriginalMember(owner = "client!jk", name = "Y", descriptor = "[Leg;")
    public static class285[] field1363 = new class285[100];

    @OriginalMember(owner = "client!jk", name = "Z", descriptor = "Lwa;")
    public static class75 field1364 = class66.method560("Mem:", false);

    @OriginalMember(owner = "client!jk", name = "S", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!jk", name = "T", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!jk", name = "V", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!jk", name = "ab", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!jk", name = "bb", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!jk", name = "U", descriptor = "Lcb;")
    public static class267 field1359;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "(I)Z", line = 20)
    public final boolean method679(int arg0) {
        if (arg0 == -1) {
            field1360++;
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "(I)Ljava/lang/Object;", line = 32)
    public final Object method680(int arg0) {
        if (arg0 != 17439) {
            field1363 = (class285[]) null;
        }
        field1358++;
        return this.field1356;
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(Z)V", line = 67)
    public static void method681(boolean arg0) {
        field1363 = null;
        field1364 = null;
        if (arg0) {
            field1362 = null;
            field1359 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "([JB[I)V", line = 84)
    public static final void method682(long[] arg0, byte arg1, int[] arg2) {
        class133.method1033(-109, arg0, arg0.length - 1, arg2, 0);
        field1357++;
        if (arg1 >= -43) {
            field1365 = -81;
        }
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 94)
    public class81(Object arg0) {
        this.field1356 = arg0;
    }
}
