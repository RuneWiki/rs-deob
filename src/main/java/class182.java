import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class182 {

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field2835 = 0;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
    public static final boolean method1237(String arg0, boolean arg1) {
        field2832++;
        if (arg0 == null) {
            return false;
        }
        if (arg1) {
            method1237((String) null, true);
        }
        for (int var2 = 0; var2 < class268.field4284; var2++) {
            if (arg0.equalsIgnoreCase(class212.field3288[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
    public static final void method1238(int arg0) {
        field2836++;
        class28.field389.method1898((byte) 32);
        if (arg0 != 0) {
            method1238(-83);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)V")
    public static final void method1239(int arg0, int arg1) {
        class281.field4450.method1897(true, arg0);
        field2834++;
        if (arg1 != 0) {
            method1238(63);
        }
    }
}
