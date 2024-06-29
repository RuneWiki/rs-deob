import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class32 {

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "I")
    public int field406;

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "I")
    public int field407;

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "I")
    public int field409;

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "I")
    public int field408;

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "()V", line = 6)
    public class32() {
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lvo;)V", line = 8)
    public class32(class32 arg0) {
        this.field406 = arg0.field406;
        this.field407 = arg0.field407;
        this.field409 = arg0.field409;
        this.field408 = arg0.field408;
    }
}
