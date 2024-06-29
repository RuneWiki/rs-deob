import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class364 {

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public int field5027;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public int field5025;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public int field5026;

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V", line = 5)
    public class364() {
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Leg;)V", line = 7)
    public class364(class364 arg0) {
        this.field5027 = arg0.field5027;
        this.field5025 = arg0.field5025;
        this.field5026 = arg0.field5026;
    }
}
