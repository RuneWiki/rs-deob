import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public class class342 {

    @OriginalMember(owner = "client!bfa", name = "c", descriptor = "J")
    public static long field4709 = (long) (Math.random() * 9.999999999E9D);

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(III)Z")
    public static final boolean method2066(int arg0, int arg1, int arg2) {
        field4708++;
        if (arg0 >= -125) {
            field4709 = -35L;
        }
        return class189.method1239(false, arg1, arg2) | (arg1 & 0x40000) != 0 || class271.method1648(0, arg2, arg1);
    }
}
