import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("v")
public class Linkable {

    @OriginalMember(owner = "v", name = "a", descriptor = "J")
    public long field372;

    @OriginalMember(owner = "v", name = "b", descriptor = "Lv;")
    public Linkable field373;

    @OriginalMember(owner = "v", name = "c", descriptor = "Lv;")
    public Linkable field374;

    @OriginalMember(owner = "v", name = "d", descriptor = "Z")
    public static boolean field375;

    @OriginalMember(owner = "v", name = "a", descriptor = "()V")
    public void method120() {
        if (this.field374 != null) {
            this.field374.field373 = this.field373;
            this.field373.field374 = this.field374;
            this.field373 = null;
            this.field374 = null;
        }
    }
}
