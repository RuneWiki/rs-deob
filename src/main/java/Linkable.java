import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("u")
public class Linkable {

    @OriginalMember(owner = "u", name = "a", descriptor = "Z")
    private boolean field360 = true;

    @OriginalMember(owner = "u", name = "b", descriptor = "J")
    public long field361;

    @OriginalMember(owner = "u", name = "c", descriptor = "Lu;")
    public Linkable field362;

    @OriginalMember(owner = "u", name = "d", descriptor = "Lu;")
    public Linkable field363;

    @OriginalMember(owner = "u", name = "e", descriptor = "Z")
    public static boolean field364;

    @OriginalMember(owner = "u", name = "a", descriptor = "()V")
    public void method106() {
        if (this.field363 != null) {
            this.field363.field362 = this.field362;
            this.field362.field363 = this.field363;
            this.field362 = null;
            this.field363 = null;
        }
    }
}
