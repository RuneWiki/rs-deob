import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class210 {

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public int field3207;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public int field3206;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public int field3205;

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
    public class210() {
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lkf;)V")
    public class210(class210 arg0) {
        this.field3207 = arg0.field3207;
        this.field3206 = arg0.field3206;
        this.field3205 = arg0.field3205;
    }
}
