import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class302 {

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "Z")
    public static boolean field4610 = false;

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
    public static int field4615 = 0;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "Llm;")
    public static class210 field4609;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)V", line = 6)
    public static final void method2094(int arg0, int arg1) {
        field4611++;
        if (arg0 < -44 && class72.method463(-120, arg1)) {
            class306.method2111(true, class278.field4231[arg1], -1);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V", line = 27)
    public static final void method2095(int arg0) {
        field4608++;
        class168.field2521 = null;
        class133.method979();
        if (arg0 != 0) {
            method2096(80);
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)V", line = 39)
    public static void method2096(int arg0) {
        if (arg0 == 32) {
            field4609 = null;
        }
    }
}
