import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CDEGFOQA")
public class class4 {

    @OriginalMember(owner = "CDEGFOQA", name = "a", descriptor = "J")
    public long field54;

    @OriginalMember(owner = "CDEGFOQA", name = "b", descriptor = "LCDEGFOQA;")
    public class4 field55;

    @OriginalMember(owner = "CDEGFOQA", name = "c", descriptor = "LCDEGFOQA;")
    public class4 field56;

    @OriginalMember(owner = "CDEGFOQA", name = "d", descriptor = "Z")
    public static boolean field57;

    @OriginalMember(owner = "CDEGFOQA", name = "a", descriptor = "()V")
    public void method19() {
        if (this.field56 != null) {
            this.field56.field55 = this.field55;
            this.field55.field56 = this.field56;
            this.field55 = null;
            this.field56 = null;
        }
    }
}
