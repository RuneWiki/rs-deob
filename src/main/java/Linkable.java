import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("u")
public class Linkable {

    @OriginalMember(owner = "u", name = "a", descriptor = "I")
    private int field364 = 28878;

    @OriginalMember(owner = "u", name = "b", descriptor = "J")
    public long field365;

    @OriginalMember(owner = "u", name = "c", descriptor = "Lu;")
    public Linkable field366;

    @OriginalMember(owner = "u", name = "d", descriptor = "Lu;")
    public Linkable field367;

    @OriginalMember(owner = "u", name = "e", descriptor = "Z")
    public static boolean field368;

    @OriginalMember(owner = "u", name = "a", descriptor = "()V")
    public void method106() {
        if (this.field367 != null) {
            this.field367.field366 = this.field366;
            this.field366.field367 = this.field367;
            this.field366 = null;
            this.field367 = null;
        }
    }
}
