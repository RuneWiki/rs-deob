import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class492 {

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public int field7204;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public int field7203;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public int field7202;

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V")
    public class492() {
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Lih;)V")
    public class492(class492 arg0) {
        this.field7204 = arg0.field7204;
        this.field7203 = arg0.field7203;
        this.field7202 = arg0.field7202;
    }
}
