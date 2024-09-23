import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("u")
public class Linkable {

    @OriginalMember(owner = "u", name = "d", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "u", name = "a", descriptor = "J")
    public long field298;

    @OriginalMember(owner = "u", name = "b", descriptor = "Lu;")
    public Linkable field299;

    @OriginalMember(owner = "u", name = "c", descriptor = "Lu;")
    public Linkable field300;

    @OriginalMember(owner = "u", name = "a", descriptor = "()V")
    public void method107() {
        if (this.field300 != null) {
            this.field300.field299 = this.field299;
            this.field299.field300 = this.field300;
            this.field299 = null;
            this.field300 = null;
        }
    }
}
