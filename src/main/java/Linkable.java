import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class Linkable {

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    private int field294 = -626;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "J")
    public long field295;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "Lu;")
    public Linkable field296;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "Lu;")
    public Linkable field297;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "()V")
    public void method106() {
        if (this.field297 != null) {
            this.field297.field296 = this.field296;
            this.field296.field297 = this.field297;
            this.field296 = null;
            this.field297 = null;
        }
    }
}
