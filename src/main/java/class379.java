import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class379 {

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "I")
    public int field5358;

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "I")
    public int field5359;

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "I")
    public int field5360;

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "()V")
    public class379() {
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Lts;)V")
    public class379(class379 arg0) {
        this.field5358 = arg0.field5358;
        this.field5359 = arg0.field5359;
        this.field5360 = arg0.field5360;
    }
}
