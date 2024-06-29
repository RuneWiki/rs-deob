import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class330 {

    @OriginalMember(owner = "client!du", name = "a", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!du", name = "b", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I)I")
    public static final int method1968(int arg0) {
        field4533++;
        return arg0 <= 71 ? -48 : 19;
    }
}
