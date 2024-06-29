import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!d")
public class Linkable {

    @OriginalMember(owner = "mapview!d", name = "c", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "Ld;")
    public Linkable field41;

    @OriginalMember(owner = "mapview!d", name = "b", descriptor = "Ld;")
    public Linkable field42;

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "()V")
    public void method23() {
        if (this.field42 != null) {
            this.field42.field41 = this.field41;
            this.field41.field42 = this.field42;
            this.field41 = null;
            this.field42 = null;
        }
    }
}
