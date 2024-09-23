import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("v")
public class Linkable {

    @OriginalMember(owner = "v", name = "a", descriptor = "J")
    public long field366;

    @OriginalMember(owner = "v", name = "b", descriptor = "Lv;")
    public Linkable field367;

    @OriginalMember(owner = "v", name = "c", descriptor = "Lv;")
    public Linkable field368;

    @OriginalMember(owner = "v", name = "d", descriptor = "Z")
    public static boolean field369;

    @OriginalMember(owner = "v", name = "a", descriptor = "()V")
    public void method118() {
        if (this.field368 != null) {
            this.field368.field367 = this.field367;
            this.field367.field368 = this.field368;
            this.field367 = null;
            this.field368 = null;
        }
    }
}
