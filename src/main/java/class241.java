import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class241 {

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "I")
    public int field3841;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "I")
    public int field3839;

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "I")
    public int field3840;

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "()V", line = 5)
    public class241() {
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Lws;)V", line = 7)
    public class241(class241 arg0) {
        this.field3841 = arg0.field3841;
        this.field3839 = arg0.field3839;
        this.field3840 = arg0.field3840;
    }
}
