import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class613 {

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "Llc;")
    public static class435 field8760 = new class435(30, 7);

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "S")
    public static short field8761 = 32767;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field8754;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field8755;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field8756;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field8757;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field8758;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "Lla;")
    public static class423 field8759;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)Lg;")
    public static final class592 method3569(int arg0, int arg1) {
        field8755++;
        if (class615.field8768 && arg1 >= class536.field7790 && class560.field8127 >= arg1) {
            return arg0 == 32767 ? class142.field1940[arg1 - class536.field7790] : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)Z")
    public final boolean method3570(int arg0) {
        field8758++;
        return arg0 <= 108 ? false : class19.field179 == this | class38.field426 == this;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V")
    public static void method3571(boolean arg0) {
        field8759 = null;
        field8760 = null;
        if (!arg0) {
            field8760 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8754++;
        throw new IllegalStateException();
    }
}
