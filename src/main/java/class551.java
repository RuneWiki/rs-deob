import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class551 extends class222 {

    @OriginalMember(owner = "client!th", name = "r", descriptor = "I")
    private int field8015 = 0;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "I")
    public static int field8013 = 0;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "I")
    public static int field8011;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "I")
    public static int field8012;

    @OriginalMember(owner = "client!th", name = "q", descriptor = "[[[Lcq;")
    public static class433[][][] field8014;

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Ljn;Lko;)V")
    public class551(class668 arg0, class468 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(B)V")
    public static void method3238(byte arg0) {
        field8014 = null;
        if (arg0 > -18) {
            field8014 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BZ)V")
    public final void method893(byte arg0, boolean arg1) {
        ++field8012;
        if (arg0 != -61) {
            field8014 = null;
        }
        int var3 = super.field2899.field9196.method3298(false, class589.field8535, super.field2891.method896()) + super.field2899.field9192;
        int var4 = super.field2899.field9188.method1080(super.field2891.method901(), class6.field60, arg0 ^ -7) - -super.field2899.field9198;
        super.field2891.method3927((float) (super.field2891.method896() / 2 + var3), (float) (var4 + super.field2891.method901() / 2), 4096, this.field8015);
        this.field8015 += ((class468) super.field2899).field6536;
    }
}
