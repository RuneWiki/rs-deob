import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("u")
public class Linkable {

    @OriginalMember(owner = "u", name = "a", descriptor = "J")
    public long field286;

    @OriginalMember(owner = "u", name = "b", descriptor = "Lu;")
    public Linkable field287;

    @OriginalMember(owner = "u", name = "c", descriptor = "Lu;")
    public Linkable field288;

    @OriginalMember(owner = "u", name = "d", descriptor = "Z")
    public static boolean field289;

    @OriginalMember(owner = "u", name = "a", descriptor = "()V")
    public void method104() {
        if (this.field288 != null) {
            this.field288.field287 = this.field287;
            this.field287.field288 = this.field288;
            this.field287 = null;
            this.field288 = null;
        }
    }
}
