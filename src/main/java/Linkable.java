import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("v")
public class Linkable {

    @OriginalMember(owner = "v", name = "a", descriptor = "I")
    private int field368 = 3;

    @OriginalMember(owner = "v", name = "e", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "v", name = "b", descriptor = "J")
    public long field369;

    @OriginalMember(owner = "v", name = "c", descriptor = "Lv;")
    public Linkable field370;

    @OriginalMember(owner = "v", name = "d", descriptor = "Lv;")
    public Linkable field371;

    @OriginalMember(owner = "v", name = "a", descriptor = "()V")
    public void method119() {
        if (this.field371 != null) {
            this.field371.field370 = this.field370;
            this.field370.field371 = this.field371;
            this.field370 = null;
            this.field371 = null;
        }
    }
}
