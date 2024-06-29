import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class120 {

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "I")
    public static int field1448 = 0;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!fv", name = "f", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "Lfp;")
    public static class323 field1447;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(III)I")
    public final int method826(int arg0, int arg1, int arg2) {
        field1449++;
        int var4 = arg2 >= class172.field2348 ? arg2 : class172.field2348;
        if (class29.field380 == this) {
            return 0;
        }
        if (arg1 != 0) {
            this.method826(29, 54, 64);
        }
        if (class211.field2786 == this) {
            return var4 - arg0;
        } else if (class638.field8770 == this) {
            return (var4 - arg0) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!fv", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1451++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)V")
    public static void method827(int arg0) {
        if (arg0 != 2) {
            method827(-13);
        }
        field1447 = null;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(ZIB)V")
    public static final void method828(boolean arg0, int arg1, byte arg2) {
        field1450++;
        if (arg2 != 95) {
            field1446 = 34;
        }
        class95 var3 = class71.method589(arg0, arg2 - 9949, arg1);
        if (var3 != null) {
            var3.method1185(-82);
        }
    }
}
