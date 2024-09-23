import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("v")
public class Linkable {

    @OriginalMember(owner = "v", name = "d", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "v", name = "a", descriptor = "J")
    public long field378;

    @OriginalMember(owner = "v", name = "b", descriptor = "Lv;")
    public Linkable field379;

    @OriginalMember(owner = "v", name = "c", descriptor = "Lv;")
    public Linkable field380;

    @OriginalMember(owner = "v", name = "a", descriptor = "()V")
    public void method119() {
        if (this.field380 != null) {
            this.field380.field379 = this.field379;
            this.field379.field380 = this.field380;
            this.field379 = null;
            this.field380 = null;
        }
    }
}
