import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("u")
public class Linkable {

    @OriginalMember(owner = "u", name = "a", descriptor = "J")
    public long field358;

    @OriginalMember(owner = "u", name = "b", descriptor = "Lu;")
    public Linkable field359;

    @OriginalMember(owner = "u", name = "c", descriptor = "Lu;")
    public Linkable field360;

    @OriginalMember(owner = "u", name = "d", descriptor = "Z")
    public static boolean field361;

    @OriginalMember(owner = "u", name = "a", descriptor = "()V")
    public void method106() {
        if (this.field360 != null) {
            this.field360.field359 = this.field359;
            this.field359.field360 = this.field360;
            this.field359 = null;
            this.field360 = null;
        }
    }
}
