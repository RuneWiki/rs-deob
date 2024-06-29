import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class380 {

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public int field5087;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public int field5088;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    public int field5085;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public int field5086;

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "()V", line = 6)
    public class380() {
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lwl;)V", line = 8)
    public class380(class380 arg0) {
        this.field5087 = arg0.field5087;
        this.field5088 = arg0.field5088;
        this.field5085 = arg0.field5085;
        this.field5086 = arg0.field5086;
    }
}
