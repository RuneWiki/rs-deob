import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SSWDZUWQ")
public class class57 {

    @OriginalMember(owner = "client!SSWDZUWQ", name = "a", descriptor = "I")
    private int field1573 = 17532;

    @OriginalMember(owner = "client!SSWDZUWQ", name = "b", descriptor = "J")
    public long field1574;

    @OriginalMember(owner = "client!SSWDZUWQ", name = "c", descriptor = "LSSWDZUWQ;")
    public class57 field1575;

    @OriginalMember(owner = "client!SSWDZUWQ", name = "d", descriptor = "LSSWDZUWQ;")
    public class57 field1576;

    @OriginalMember(owner = "client!SSWDZUWQ", name = "e", descriptor = "Z")
    public static boolean field1577;

    @OriginalMember(owner = "client!SSWDZUWQ", name = "a", descriptor = "()V")
    public void method505() {
        if (this.field1576 != null) {
            this.field1576.field1575 = this.field1575;
            this.field1575.field1576 = this.field1576;
            this.field1575 = null;
            this.field1576 = null;
        }
    }
}
