import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class Linkable {

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    private int field357 = 916;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "Z")
    private boolean field358 = false;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "J")
    public long field359;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "Lu;")
    public Linkable field360;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "Lu;")
    public Linkable field361;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "Z")
    public static boolean field362;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "()V")
    public void method106() {
        if (this.field361 != null) {
            this.field361.field360 = this.field360;
            this.field360.field361 = this.field361;
            this.field360 = null;
            this.field361 = null;
        }
    }
}
