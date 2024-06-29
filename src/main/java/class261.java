import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public class class261 {

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "I")
    public int field3412;

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "I")
    public int field3413;

    @OriginalMember(owner = "client!sda", name = "c", descriptor = "I")
    public int field3414;

    @OriginalMember(owner = "client!sda", name = "<init>", descriptor = "()V")
    public class261() {
    }

    @OriginalMember(owner = "client!sda", name = "<init>", descriptor = "(Lsda;)V")
    public class261(class261 arg0) {
        this.field3412 = arg0.field3412;
        this.field3413 = arg0.field3413;
        this.field3414 = arg0.field3414;
    }
}
