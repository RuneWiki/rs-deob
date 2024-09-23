import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("t")
public class Linkable {

    @OriginalMember(owner = "t", name = "d", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "t", name = "a", descriptor = "J")
    public long field273;

    @OriginalMember(owner = "t", name = "b", descriptor = "Lt;")
    public Linkable field274;

    @OriginalMember(owner = "t", name = "c", descriptor = "Lt;")
    public Linkable field275;

    @OriginalMember(owner = "t", name = "a", descriptor = "()V")
    public void method89() {
        if (this.field275 != null) {
            this.field275.field274 = this.field274;
            this.field274.field275 = this.field275;
            this.field274 = null;
            this.field275 = null;
        }
    }
}
