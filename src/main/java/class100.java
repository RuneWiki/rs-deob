import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class100 {

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "I")
    public int field1414;

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "I")
    public int field1413;

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "I")
    public int field1415;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "I")
    public int field1412;

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "()V")
    public class100() {
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Lbs;)V")
    public class100(class100 arg0) {
        this.field1414 = arg0.field1414;
        this.field1413 = arg0.field1413;
        this.field1415 = arg0.field1415;
        this.field1412 = arg0.field1412;
    }
}
