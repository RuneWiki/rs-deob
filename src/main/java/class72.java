import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class72 {

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public int field1050;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
    public int field1052;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public int field1051;

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "()V")
    public class72() {
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lul;)V")
    public class72(class72 arg0) {
        this.field1050 = arg0.field1050;
        this.field1052 = arg0.field1052;
        this.field1051 = arg0.field1051;
    }
}
