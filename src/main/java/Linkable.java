import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("u")
public class Linkable {

    @OriginalMember(owner = "u", name = "a", descriptor = "Z")
    private boolean field358 = false;

    @OriginalMember(owner = "u", name = "b", descriptor = "J")
    public long field359;

    @OriginalMember(owner = "u", name = "c", descriptor = "Lu;")
    public Linkable field360;

    @OriginalMember(owner = "u", name = "d", descriptor = "Lu;")
    public Linkable field361;

    @OriginalMember(owner = "u", name = "e", descriptor = "Z")
    public static boolean field362;

    @OriginalMember(owner = "u", name = "a", descriptor = "()V")
    public void method106() {
        if (this.field361 != null) {
            this.field361.field360 = this.field360;
            this.field360.field361 = this.field361;
            this.field360 = null;
            this.field361 = null;
        }
    }
}
