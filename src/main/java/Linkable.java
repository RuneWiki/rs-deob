import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("u")
public class Linkable {

    @OriginalMember(owner = "u", name = "d", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "u", name = "a", descriptor = "J")
    public long field299;

    @OriginalMember(owner = "u", name = "b", descriptor = "Lu;")
    public Linkable field300;

    @OriginalMember(owner = "u", name = "c", descriptor = "Lu;")
    public Linkable field301;

    @OriginalMember(owner = "u", name = "a", descriptor = "()V")
    public void method108() {
        if (this.field301 != null) {
            this.field301.field300 = this.field300;
            this.field300.field301 = this.field301;
            this.field300 = null;
            this.field301 = null;
        }
    }
}
