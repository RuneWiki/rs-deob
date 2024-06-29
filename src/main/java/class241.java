import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class241 {

    @OriginalMember(owner = "client!u", name = "c", descriptor = "Lwa;")
    public static class75 field4070 = class66.method560("Lade Titelbild )2 ", false);

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field4069 = 0;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lcb;Lcb;I)V", line = 15)
    public static final void method1757(class267 arg0, class267 arg1, int arg2) {
        field4068++;
        if (arg2 >= 117) {
            class244.field4107 = arg0;
            class81.field1359 = arg1;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V", line = 28)
    public static void method1758(byte arg0) {
        field4070 = null;
        if (arg0 != 112) {
            method1757((class267) null, (class267) null, -53);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIII)V", line = 52)
    public static final void method1759(int arg0, int arg1, int arg2, int arg3) {
        field4071++;
        class156 var4 = class206.method1525(11, -32701, arg0);
        if (arg2 == -22323) {
            var4.method1183(true);
            var4.field2665 = arg1;
            var4.field2680 = arg3;
        }
    }
}
