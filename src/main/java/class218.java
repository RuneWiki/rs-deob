import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class218 {

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "I")
    public int field3088;

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "I")
    public int field3090;

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "I")
    public int field3089;

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "()V", line = 5)
    public class218() {
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lcs;)V", line = 7)
    public class218(class218 arg0) {
        this.field3088 = arg0.field3088;
        this.field3090 = arg0.field3090;
        this.field3089 = arg0.field3089;
    }
}
