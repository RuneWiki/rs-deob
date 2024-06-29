import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hia")
public class class73 {

    @OriginalMember(owner = "client!hia", name = "c", descriptor = "I")
    public int field1066;

    @OriginalMember(owner = "client!hia", name = "b", descriptor = "I")
    public int field1065;

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "I")
    public int field1064;

    @OriginalMember(owner = "client!hia", name = "<init>", descriptor = "()V", line = 5)
    public class73() {
    }

    @OriginalMember(owner = "client!hia", name = "<init>", descriptor = "(Lhia;)V", line = 7)
    public class73(class73 arg0) {
        this.field1066 = arg0.field1066;
        this.field1065 = arg0.field1065;
        this.field1064 = arg0.field1064;
    }
}
