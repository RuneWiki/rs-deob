import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!YNSWJIIM")
public class class67 {

    @OriginalMember(owner = "client!YNSWJIIM", name = "a", descriptor = "J")
    public long field1685;

    @OriginalMember(owner = "client!YNSWJIIM", name = "b", descriptor = "LYNSWJIIM;")
    public class67 field1686;

    @OriginalMember(owner = "client!YNSWJIIM", name = "c", descriptor = "LYNSWJIIM;")
    public class67 field1687;

    @OriginalMember(owner = "client!YNSWJIIM", name = "d", descriptor = "Z")
    public static boolean field1688;

    @OriginalMember(owner = "client!YNSWJIIM", name = "a", descriptor = "()V")
    public void method588() {
        if (this.field1687 != null) {
            this.field1687.field1686 = this.field1686;
            this.field1686.field1687 = this.field1687;
            this.field1686 = null;
            this.field1687 = null;
        }
    }
}
