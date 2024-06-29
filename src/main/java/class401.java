import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class401 {

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public int field6094;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public int field6096;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public int field6093;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public int field6095;

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V", line = 6)
    public class401() {
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lce;)V", line = 8)
    public class401(class401 arg0) {
        this.field6094 = arg0.field6094;
        this.field6096 = arg0.field6096;
        this.field6093 = arg0.field6093;
        this.field6095 = arg0.field6095;
    }
}
