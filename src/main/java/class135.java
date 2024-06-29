import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public class class135 {

    @OriginalMember(owner = "client!lca", name = "c", descriptor = "I")
    public int field1855;

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "I")
    public int field1854;

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "I")
    public int field1853;

    @OriginalMember(owner = "client!lca", name = "<init>", descriptor = "()V", line = 5)
    public class135() {
    }

    @OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(Llca;)V", line = 7)
    public class135(class135 arg0) {
        this.field1855 = arg0.field1855;
        this.field1854 = arg0.field1854;
        this.field1853 = arg0.field1853;
    }
}
