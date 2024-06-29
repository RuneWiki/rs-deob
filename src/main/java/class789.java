import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class789 {

    @OriginalMember(owner = "client!eca", name = "d", descriptor = "I")
    public static int field10835 = 0;

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "I")
    public static int field10833;

    @OriginalMember(owner = "client!eca", name = "c", descriptor = "I")
    public static int field10834;

    @OriginalMember(owner = "client!eca", name = "e", descriptor = "I")
    public static int field10836;

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "Lhr;")
    public static class549 field10832;

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(ZIIZI)V")
    public static final void method4318(boolean arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (class145.field1852.field9002.method2258((byte) -102) == 0) {
            class272.method1769(-374497842, false);
        } else {
            class626.field8838 = class145.field1852.field9002.method2258((byte) -101);
            class226.method1559((byte) 74, true, 0);
        }
        field10836++;
        class209.field3043 = arg0;
        class678.field9646 = arg4;
        class510.field7300 = arg2;
        class436.method2618(arg1);
        if (!arg3) {
            field10834 = -9;
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(B)V")
    public static void method4319(byte arg0) {
        if (arg0 == -119) {
            field10832 = null;
        }
    }

    @OriginalMember(owner = "client!eca", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field10833++;
        throw new IllegalStateException();
    }
}
