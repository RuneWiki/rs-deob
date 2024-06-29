import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BLBQHZXT")
public class class3 {

    @OriginalMember(owner = "client!BLBQHZXT", name = "a", descriptor = "J")
    public long field48;

    @OriginalMember(owner = "client!BLBQHZXT", name = "b", descriptor = "LBLBQHZXT;")
    public class3 field49;

    @OriginalMember(owner = "client!BLBQHZXT", name = "c", descriptor = "LBLBQHZXT;")
    public class3 field50;

    @OriginalMember(owner = "client!BLBQHZXT", name = "d", descriptor = "Z")
    public static boolean field51;

    @OriginalMember(owner = "client!BLBQHZXT", name = "a", descriptor = "()V")
    public void method14() {
        if (this.field50 != null) {
            this.field50.field49 = this.field49;
            this.field49.field50 = this.field50;
            this.field49 = null;
            this.field50 = null;
        }
    }
}
