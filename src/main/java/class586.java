import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class586 {

    @OriginalMember(owner = "client!am", name = "c", descriptor = "I")
    public int field8343;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    public int field8342;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    public int field8344;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public int field8341;

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "()V")
    public class586() {
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lam;)V")
    public class586(class586 arg0) {
        this.field8343 = arg0.field8343;
        this.field8342 = arg0.field8342;
        this.field8344 = arg0.field8344;
        this.field8341 = arg0.field8341;
    }
}
