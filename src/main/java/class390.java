import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class390 {

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "I")
    public int field5427;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "I")
    public int field5426;

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "I")
    public int field5428;

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "()V", line = 5)
    public class390() {
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lcs;)V", line = 7)
    public class390(class390 arg0) {
        this.field5427 = arg0.field5427;
        this.field5426 = arg0.field5426;
        this.field5428 = arg0.field5428;
    }
}
