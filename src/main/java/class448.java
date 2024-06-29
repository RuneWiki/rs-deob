import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class448 {

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "Z")
    public static boolean field6146 = false;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field6143;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field6144;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field6145;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field6147;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public static int field6148;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field6149;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)Z")
    public final boolean method2601(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            field6144++;
            return class218.field3219 == this | class15.field219 == this;
        }
    }

    @OriginalMember(owner = "client!ad", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6143++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lfl;B)I")
    public static final int method2602(class771 arg0, byte arg1) {
        field6145++;
        int var2 = arg0.field10668;
        class540 var3 = arg0.method2347(16383);
        if (arg0.field5249 == -1 || arg0.field5262) {
            var2 = arg0.field10655;
        } else if (arg0.field5249 == var3.field7368 || arg0.field5249 == var3.field7337 || arg0.field5249 == var3.field7359 || arg0.field5249 == var3.field7357) {
            var2 = arg0.field10665;
        } else if (arg0.field5249 == var3.field7372 || arg0.field5249 == var3.field7351 || arg0.field5249 == var3.field7366 || arg0.field5249 == var3.field7336) {
            var2 = arg0.field10660;
        }
        return arg1 < 12 ? -33 : var2;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)Z")
    public static final boolean method2603(int arg0, int arg1, int arg2) {
        if (arg1 != 32) {
            method2602(null, (byte) 59);
        }
        field6149++;
        return (arg2 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Llia;")
    public static final class505 method2604(Throwable arg0, String arg1) {
        field6147++;
        class505 var2;
        if (arg0 instanceof class505) {
            var2 = (class505) arg0;
            var2.field6885 = var2.field6885 + ' ' + arg1;
        } else {
            var2 = new class505(arg0, arg1);
        }
        return var2;
    }
}
