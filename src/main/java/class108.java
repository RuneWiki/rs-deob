import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class108 {

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public int field1772;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public int field1771;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public int field1773;

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
    public class108() {
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lra;)V")
    public class108(class108 arg0) {
        this.field1772 = arg0.field1772;
        this.field1771 = arg0.field1771;
        this.field1773 = arg0.field1773;
    }
}
