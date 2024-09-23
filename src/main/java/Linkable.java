import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("v")
public class Linkable {

    @OriginalMember(owner = "v", name = "a", descriptor = "J")
    public long field390;

    @OriginalMember(owner = "v", name = "b", descriptor = "Lv;")
    public Linkable field391;

    @OriginalMember(owner = "v", name = "c", descriptor = "Lv;")
    public Linkable field392;

    @OriginalMember(owner = "v", name = "d", descriptor = "Z")
    public static boolean field393;

    @OriginalMember(owner = "v", name = "a", descriptor = "()V")
    public void method120() {
        if (this.field392 != null) {
            this.field392.field391 = this.field391;
            this.field391.field392 = this.field392;
            this.field391 = null;
            this.field392 = null;
        }
    }
}
