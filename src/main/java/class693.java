import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class693 {

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "I")
    public static int field9691 = 0;

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "[F")
    public static float[] field9690 = new float[2];

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "I")
    public static int field9693;

    @OriginalMember(owner = "client!ws", name = "f", descriptor = "I")
    public static int field9694;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "Lka;")
    public class283 field9689;

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "Lr;")
    public class706 field9692;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V", line = 8)
    public static void method3939(int arg0) {
        if (arg0 == 2) {
            field9690 = null;
        }
    }
}
