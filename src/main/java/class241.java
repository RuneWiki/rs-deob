import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aia")
public class class241 implements class316 {

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "I")
    public int field3244;

    @OriginalMember(owner = "client!aia", name = "b", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!aia", name = "c", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(B)Lhv;", line = 3)
    public final class546 method1557(byte arg0) {
        field3245++;
        if (arg0 > -35) {
            this.method1557((byte) -51);
        }
        return class503.field6971;
    }

    @OriginalMember(owner = "client!aia", name = "<init>", descriptor = "(I)V", line = 15)
    public class241(int arg0) {
        this.field3244 = arg0;
    }
}
