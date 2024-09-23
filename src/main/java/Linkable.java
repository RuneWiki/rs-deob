import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("v")
public class Linkable {

    @OriginalMember(owner = "v", name = "a", descriptor = "B")
    private byte field373 = 114;

    @OriginalMember(owner = "v", name = "b", descriptor = "J")
    public long field374;

    @OriginalMember(owner = "v", name = "c", descriptor = "Lv;")
    public Linkable field375;

    @OriginalMember(owner = "v", name = "d", descriptor = "Lv;")
    public Linkable field376;

    @OriginalMember(owner = "v", name = "e", descriptor = "Z")
    public static boolean field377;

    @OriginalMember(owner = "v", name = "a", descriptor = "()V")
    public void method120() {
        if (this.field376 != null) {
            this.field376.field375 = this.field375;
            this.field375.field376 = this.field376;
            this.field375 = null;
            this.field376 = null;
        }
    }
}
