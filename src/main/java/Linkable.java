import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class Linkable {

    @OriginalMember(owner = "client!u", name = "a", descriptor = "J")
    public long field358;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "Lu;")
    public Linkable field359;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "Lu;")
    public Linkable field360;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "Z")
    public static boolean field361;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "()V")
    public void method106() {
        if (this.field360 != null) {
            this.field360.field359 = this.field359;
            this.field359.field360 = this.field360;
            this.field359 = null;
            this.field360 = null;
        }
    }
}
