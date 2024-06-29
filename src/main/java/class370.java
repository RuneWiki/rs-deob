import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class370 {

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public int field5243;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public int field5245;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public int field5244;

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
    public class370() {
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lra;)V")
    public class370(class370 arg0) {
        this.field5243 = arg0.field5243;
        this.field5245 = arg0.field5245;
        this.field5244 = arg0.field5244;
    }
}
