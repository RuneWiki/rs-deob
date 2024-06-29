import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class139 {

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public int field1680;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public int field1679;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public int field1678;

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V", line = 5)
    public class139() {
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lai;)V", line = 7)
    public class139(class139 arg0) {
        this.field1680 = arg0.field1680;
        this.field1679 = arg0.field1679;
        this.field1678 = arg0.field1678;
    }
}
