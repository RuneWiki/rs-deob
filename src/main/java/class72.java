import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class72 {

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "I")
    public int field993;

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "I")
    public int field994;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "I")
    public int field992;

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "()V", line = 5)
    public class72() {
    }

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lrv;)V", line = 7)
    public class72(class72 arg0) {
        this.field993 = arg0.field993;
        this.field994 = arg0.field994;
        this.field992 = arg0.field992;
    }
}
