import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class33 {

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "I")
    public static int field348 = 0;

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "Lng;")
    public static class226 field346 = new class226(8);

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "Lqa;")
    public static class162 field345;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)V")
    public static void method188(int arg0) {
        field346 = null;
        field345 = null;
        if (arg0 != -26) {
            field346 = null;
        }
    }
}
