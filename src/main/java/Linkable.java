import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class Linkable {

    @OriginalMember(owner = "client!u", name = "a", descriptor = "J")
    public long field360;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "Lu;")
    public Linkable field361;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "Lu;")
    public Linkable field362;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "Z")
    public static boolean field363;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "()V")
    public void method106() {
        if (this.field362 != null) {
            this.field362.field361 = this.field361;
            this.field361.field362 = this.field362;
            this.field361 = null;
            this.field362 = null;
        }
    }
}
