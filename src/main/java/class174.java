import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public abstract class class174 extends class403 {

    @OriginalMember(owner = "client!bq", name = "C", descriptor = "Liq;")
    public class396 field2380;

    @OriginalMember(owner = "client!bq", name = "D", descriptor = "I")
    public int field2381;

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Liq;I)V", line = 8)
    public class174(class396 arg0, int arg1) {
        this.field2380 = arg0;
        this.field2381 = arg1;
    }

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(I)Z")
    public abstract boolean method1005(int arg0);

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method1006(byte arg0);
}
