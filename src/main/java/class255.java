import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class255 {

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)I")
    public static final int method1530(int arg0, int arg1) {
        field3245++;
        return arg1 == 255 ? arg0 & 0xFF : 6;
    }

    static {
        new class335(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
    }
}
