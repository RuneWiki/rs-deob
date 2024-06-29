import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class167 {

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field2943 = 0;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field2946 = 0;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "Lj;")
    public class139 field2944;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IILpi;)Lc;")
    public static final class267 method1188(int arg0, int arg1, class181 arg2) {
        if (arg0 != 0) {
            method1188(-68, -53, (class181) null);
        }
        field2945++;
        return class54.method386(arg1, arg2, arg0 ^ 0xFFFFCBBF) ? class255.method1717(true) : null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lpi;Z)V")
    public static final void method1189(class181 arg0, boolean arg1) {
        field2942++;
        if (arg1) {
            field2943 = 51;
        }
        class268.field4635 = arg0.method1320((byte) 63, class238.field4220);
    }
}
