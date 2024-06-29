import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!CSUKQTYW")
public class class8 {

    @OriginalMember(owner = "client!CSUKQTYW", name = "a", descriptor = "J")
    public long field614;

    @OriginalMember(owner = "client!CSUKQTYW", name = "b", descriptor = "LCSUKQTYW;")
    public class8 field615;

    @OriginalMember(owner = "client!CSUKQTYW", name = "c", descriptor = "LCSUKQTYW;")
    public class8 field616;

    @OriginalMember(owner = "client!CSUKQTYW", name = "d", descriptor = "Z")
    public static boolean field617;

    @OriginalMember(owner = "client!CSUKQTYW", name = "a", descriptor = "()V")
    public void method221() {
        if (this.field616 != null) {
            this.field616.field615 = this.field615;
            this.field615.field616 = this.field616;
            this.field615 = null;
            this.field616 = null;
        }
    }
}
