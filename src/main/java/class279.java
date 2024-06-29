import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public class class279 {

    @OriginalMember(owner = "client!pda", name = "d", descriptor = "I")
    public int field4076;

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "I")
    public int field4073;

    @OriginalMember(owner = "client!pda", name = "c", descriptor = "I")
    public int field4075;

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "I")
    public int field4074;

    @OriginalMember(owner = "client!pda", name = "<init>", descriptor = "()V", line = 6)
    public class279() {
    }

    @OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(Lpda;)V", line = 8)
    public class279(class279 arg0) {
        this.field4076 = arg0.field4076;
        this.field4073 = arg0.field4073;
        this.field4075 = arg0.field4075;
        this.field4074 = arg0.field4074;
    }
}
