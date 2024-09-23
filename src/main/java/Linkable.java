import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("u")
public class Linkable {

    @OriginalMember(owner = "u", name = "a", descriptor = "Z")
    private boolean field289 = true;

    @OriginalMember(owner = "u", name = "e", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "u", name = "b", descriptor = "J")
    public long field290;

    @OriginalMember(owner = "u", name = "c", descriptor = "Lu;")
    public Linkable field291;

    @OriginalMember(owner = "u", name = "d", descriptor = "Lu;")
    public Linkable field292;

    @OriginalMember(owner = "u", name = "a", descriptor = "()V")
    public void method107() {
        if (this.field292 != null) {
            this.field292.field291 = this.field291;
            this.field291.field292 = this.field292;
            this.field291 = null;
            this.field292 = null;
        }
    }
}
