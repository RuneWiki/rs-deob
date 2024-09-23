import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("u")
public class Linkable {

    @OriginalMember(owner = "u", name = "a", descriptor = "Z")
    private boolean field356 = false;

    @OriginalMember(owner = "u", name = "b", descriptor = "J")
    public long field357;

    @OriginalMember(owner = "u", name = "c", descriptor = "Lu;")
    public Linkable field358;

    @OriginalMember(owner = "u", name = "d", descriptor = "Lu;")
    public Linkable field359;

    @OriginalMember(owner = "u", name = "e", descriptor = "Z")
    public static boolean field360;

    @OriginalMember(owner = "u", name = "a", descriptor = "()V")
    public void method106() {
        if (this.field359 != null) {
            this.field359.field358 = this.field358;
            this.field358.field359 = this.field359;
            this.field358 = null;
            this.field359 = null;
        }
    }
}
