import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class Linkable {

    @OriginalMember(owner = "client!u", name = "a", descriptor = "Z")
    private boolean field356 = false;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "J")
    public long field357;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "Lu;")
    public Linkable field358;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "Lu;")
    public Linkable field359;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "Z")
    public static boolean field360;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "()V")
    public void method106() {
        if (this.field359 != null) {
            this.field359.field358 = this.field358;
            this.field358.field359 = this.field359;
            this.field358 = null;
            this.field359 = null;
        }
    }
}
