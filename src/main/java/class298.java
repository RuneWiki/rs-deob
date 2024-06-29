import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class298 {

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "Lml;")
    public static class325 field4078 = new class325(13, 3);

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V")
    public static final void method1898(int arg0) {
        class233.field3289 = new class640[50];
        class202.field2830 = 0;
        if (arg0 != 14562) {
            method1900((byte) 0, '{');
        }
        field4080++;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)V")
    public static void method1899(byte arg0) {
        field4078 = null;
        if (arg0 < 84) {
            method1898(109);
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(BC)Z")
    public static final boolean method1900(byte arg0, char arg1) {
        field4079++;
        if (arg0 <= 3) {
            method1899((byte) 31);
        }
        return arg1 >= '0' && arg1 <= '9';
    }
}
