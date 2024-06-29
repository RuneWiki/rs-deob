import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class144 {

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "Z")
    public static boolean field2355 = false;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "Z")
    public static boolean field2356 = false;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lrn;I)V", line = 23)
    public static final void method1188(class18 arg0, int arg1) {
        field2357++;
        class363.field5748 = arg0;
        if (arg1 != -14363) {
            method1188((class18) null, 49);
        }
    }
}
