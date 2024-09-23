import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("v")
public class Linkable {

    @OriginalMember(owner = "v", name = "a", descriptor = "J")
    public long field362;

    @OriginalMember(owner = "v", name = "b", descriptor = "Lv;")
    public Linkable field363;

    @OriginalMember(owner = "v", name = "c", descriptor = "Lv;")
    public Linkable field364;

    @OriginalMember(owner = "v", name = "d", descriptor = "Z")
    public static boolean field365;

    @OriginalMember(owner = "v", name = "a", descriptor = "()V")
    public void method118() {
        if (this.field364 != null) {
            this.field364.field363 = this.field363;
            this.field363.field364 = this.field364;
            this.field363 = null;
            this.field364 = null;
        }
    }
}
