import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("u")
public class Linkable {

    @OriginalMember(owner = "u", name = "d", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "u", name = "a", descriptor = "J")
    public long field292;

    @OriginalMember(owner = "u", name = "b", descriptor = "Lu;")
    public Linkable field293;

    @OriginalMember(owner = "u", name = "c", descriptor = "Lu;")
    public Linkable field294;

    @OriginalMember(owner = "u", name = "a", descriptor = "()V")
    public void method108() {
        if (this.field294 != null) {
            this.field294.field293 = this.field293;
            this.field293.field294 = this.field294;
            this.field293 = null;
            this.field294 = null;
        }
    }
}
