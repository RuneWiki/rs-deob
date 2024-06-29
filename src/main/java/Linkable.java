import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class Linkable {

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    private int field363 = 5;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "J")
    public long field364;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "Lu;")
    public Linkable field365;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "Lu;")
    public Linkable field366;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "Z")
    public static boolean field367;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "()V")
    public void method106() {
        if (this.field366 != null) {
            this.field366.field365 = this.field365;
            this.field365.field366 = this.field366;
            this.field365 = null;
            this.field366 = null;
        }
    }
}
