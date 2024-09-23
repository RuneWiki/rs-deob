import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("WWONSPNF")
public class class62 {

    @OriginalMember(owner = "WWONSPNF", name = "a", descriptor = "J")
    public long field1587;

    @OriginalMember(owner = "WWONSPNF", name = "b", descriptor = "LWWONSPNF;")
    public class62 field1588;

    @OriginalMember(owner = "WWONSPNF", name = "c", descriptor = "LWWONSPNF;")
    public class62 field1589;

    @OriginalMember(owner = "WWONSPNF", name = "d", descriptor = "Z")
    public static boolean field1590;

    @OriginalMember(owner = "WWONSPNF", name = "a", descriptor = "()V")
    public void method555() {
        if (this.field1589 != null) {
            this.field1589.field1588 = this.field1588;
            this.field1588.field1589 = this.field1589;
            this.field1588 = null;
            this.field1589 = null;
        }
    }
}
