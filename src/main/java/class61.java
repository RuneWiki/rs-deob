import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!WEHUNTCT")
public class class61 extends class21 {

    @OriginalMember(owner = "client!WEHUNTCT", name = "l", descriptor = "I")
    private int field1607 = -12;

    @OriginalMember(owner = "client!WEHUNTCT", name = "k", descriptor = "I")
    public int field1606;

    @OriginalMember(owner = "client!WEHUNTCT", name = "m", descriptor = "I")
    public int field1608;

    @OriginalMember(owner = "client!WEHUNTCT", name = "a", descriptor = "(Z)LIYSWJGDE;")
    public final class19 method2(boolean arg0) {
        class56 var2 = class56.method544(this.field1606);
        if (!arg0) {
            this.field1607 = 230;
        }
        return var2.method550(this.field1608);
    }
}
