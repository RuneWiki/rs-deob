import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class Linkable {

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    private int field361 = 587;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "J")
    public long field362;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "Lu;")
    public Linkable field363;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "Lu;")
    public Linkable field364;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "Z")
    public static boolean field365;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "()V")
    public void method106() {
        if (this.field364 != null) {
            this.field364.field363 = this.field363;
            this.field363.field364 = this.field364;
            this.field363 = null;
            this.field364 = null;
        }
    }
}
