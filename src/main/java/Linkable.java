import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("u")
public class Linkable {

    @OriginalMember(owner = "u", name = "a", descriptor = "I")
    private int field294 = -626;

    @OriginalMember(owner = "u", name = "e", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "u", name = "b", descriptor = "J")
    public long field295;

    @OriginalMember(owner = "u", name = "c", descriptor = "Lu;")
    public Linkable field296;

    @OriginalMember(owner = "u", name = "d", descriptor = "Lu;")
    public Linkable field297;

    @OriginalMember(owner = "u", name = "a", descriptor = "()V")
    public void method106() {
        if (this.field297 != null) {
            this.field297.field296 = this.field296;
            this.field296.field297 = this.field297;
            this.field296 = null;
            this.field297 = null;
        }
    }
}
