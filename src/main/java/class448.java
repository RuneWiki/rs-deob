import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class448 {

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public int field6447;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public int field6445;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public int field6448;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public int field6446;

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V")
    public class448() {
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Ldl;)V")
    public class448(class448 arg0) {
        this.field6447 = arg0.field6447;
        this.field6445 = arg0.field6445;
        this.field6448 = arg0.field6448;
        this.field6446 = arg0.field6446;
    }
}
