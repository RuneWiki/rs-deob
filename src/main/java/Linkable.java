import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("u")
public class Linkable {

    @OriginalMember(owner = "u", name = "a", descriptor = "Z")
    private boolean field365 = true;

    @OriginalMember(owner = "u", name = "b", descriptor = "J")
    public long field366;

    @OriginalMember(owner = "u", name = "c", descriptor = "Lu;")
    public Linkable field367;

    @OriginalMember(owner = "u", name = "d", descriptor = "Lu;")
    public Linkable field368;

    @OriginalMember(owner = "u", name = "e", descriptor = "Z")
    public static boolean field369;

    @OriginalMember(owner = "u", name = "a", descriptor = "()V")
    public void method106() {
        if (this.field368 != null) {
            this.field368.field367 = this.field367;
            this.field367.field368 = this.field368;
            this.field367 = null;
            this.field368 = null;
        }
    }
}
