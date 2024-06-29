import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class486 implements class215 {

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
    public int field6716;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
    public static int field6712 = 0;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "[I")
    public static int[] field6717 = new int[1];

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public static int field6710;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field6711;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
    public static int field6713;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
    public static int field6714;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public static int field6715;

    @OriginalMember(owner = "client!ul", name = "toString", descriptor = "()Ljava/lang/String;", line = 9)
    public final String toString() {
        field6714++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IILka;II)Ltja;", line = 26)
    public static final class491 method2885(int arg0, int arg1, class231 arg2, int arg3, int arg4) {
        if (arg4 == 29289) {
            field6713++;
            return arg2 == null ? null : new class491(arg0, arg1, arg3, arg2.method1577(), arg2.method1544(), arg2.method1583(), arg2.method1576(), arg2.method1567(), arg2.method1566(), arg2.method1537());
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(III)Z", line = 43)
    public static final boolean method2886(int arg0, int arg1, int arg2) {
        field6711++;
        if (arg2 == -1) {
            return (arg1 & 0x400) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(III)V", line = 54)
    public static final void method2887(int arg0, int arg1, int arg2) {
        field6715++;
        class17 var3 = class245.method1634(arg0, (long) arg2, 14);
        var3.method66((byte) 39);
        var3.field107 = arg1;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V", line = 65)
    public static final void method2888(byte arg0) {
        if (arg0 <= 11) {
            method2885(-125, 59, null, -113, 26);
        }
        class482.field6661.method314(-2);
        field6710++;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V", line = 83)
    public static void method2889(int arg0) {
        if (arg0 > 112) {
            field6717 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 93)
    public class486(String arg0, int arg1) {
        this.field6716 = arg1;
    }
}
