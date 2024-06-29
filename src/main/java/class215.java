import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class215 {

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public int field3091;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public int field3093;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public int field3094;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public int field3092;

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
    public class215() {
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lwb;)V")
    public class215(class215 arg0) {
        this.field3091 = arg0.field3091;
        this.field3093 = arg0.field3093;
        this.field3094 = arg0.field3094;
        this.field3092 = arg0.field3092;
    }
}
