import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class46 {

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "J")
    public static volatile long field892 = 0L;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public static int field891 = -1;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public static int field893 = 0;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "Lqd;")
    public static class40 field895 = null;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "Lqd;")
    public static class40 field896 = class147.method1106("settings", (byte) -69);

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V", line = 52)
    public static void method419(int arg0) {
        field896 = null;
        if (arg0 != 255) {
            method419(-117);
        }
        field895 = null;
    }
}
