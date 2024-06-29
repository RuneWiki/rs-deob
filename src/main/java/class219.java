import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class219 {

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    public int field2887;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    public int field2886;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public int field2885;

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "()V", line = 5)
    public class219() {
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lml;)V", line = 7)
    public class219(class219 arg0) {
        this.field2887 = arg0.field2887;
        this.field2886 = arg0.field2886;
        this.field2885 = arg0.field2885;
    }
}
