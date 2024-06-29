import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class293 {

    @OriginalMember(owner = "client!os", name = "b", descriptor = "I")
    public static int field4174 = -1;

    @OriginalMember(owner = "client!os", name = "d", descriptor = "I")
    public static int field4176 = 0;

    @OriginalMember(owner = "client!os", name = "f", descriptor = "Lak;")
    public static class222 field4178 = new class222(6, 0, 4, 2);

    @OriginalMember(owner = "client!os", name = "a", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!os", name = "c", descriptor = "Llp;")
    public class255 field4175;

    @OriginalMember(owner = "client!os", name = "e", descriptor = "Lit;")
    public static class439 field4177;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V", line = 15)
    public static void method1765(int arg0) {
        field4177 = null;
        if (arg0 != 4) {
            method1765(1);
        }
        field4178 = null;
    }
}
