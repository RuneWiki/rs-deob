import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class204 {

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field3060 = 100;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field3062 = 0;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public static final void method1207(int arg0) {
        field3061++;
        class398.field5938.method1485(-22032);
        if (arg0 != 0) {
            field3062 = 127;
        }
    }
}
