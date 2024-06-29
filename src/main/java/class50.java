import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class50 {

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "I")
    public int field679;

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "I")
    public int field680;

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "I")
    public int field681;

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "()V", line = 5)
    public class50() {
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lfu;)V", line = 7)
    public class50(class50 arg0) {
        this.field679 = arg0.field679;
        this.field680 = arg0.field680;
        this.field681 = arg0.field681;
    }
}
