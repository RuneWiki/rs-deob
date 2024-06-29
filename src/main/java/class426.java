import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class426 {

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
    public int field6094;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
    public int field6093;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public int field6095;

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V")
    public class426() {
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lnk;)V")
    public class426(class426 arg0) {
        this.field6094 = arg0.field6094;
        this.field6093 = arg0.field6093;
        this.field6095 = arg0.field6095;
    }
}
