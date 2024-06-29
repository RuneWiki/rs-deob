import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class126 extends class332 {

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
    public int field1733;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "[Lae;")
    public class294[] field1734;

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(I[Lae;)V", line = 4)
    public class126(int arg0, class294[] arg1) {
        this.field1733 = arg0;
        this.field1734 = arg1;
    }
}
