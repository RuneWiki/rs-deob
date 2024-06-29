import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class220 {

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "[I")
    public static int[] field3281 = new int[32];

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "I")
    public static int field3283 = 0;

    @OriginalMember(owner = "client!oq", name = "e", descriptor = "I")
    public static int field3284 = 0;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "Lcl;")
    public static class160 field3282;

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "Lk;")
    public static class365 field3285;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Z)V")
    public static void method1403(boolean arg0) {
        if (arg0) {
            method1403(true);
        }
        field3282 = null;
        field3285 = null;
        field3281 = null;
    }

    static {
        new class326(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
    }
}
