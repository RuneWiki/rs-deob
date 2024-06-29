import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class Linkable {

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "J")
    public long field299;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "Lu;")
    public Linkable field300;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "Lu;")
    public Linkable field301;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "()V")
    public void method108() {
        if (this.field301 != null) {
            this.field301.field300 = this.field300;
            this.field300.field301 = this.field301;
            this.field300 = null;
            this.field301 = null;
        }
    }
}
