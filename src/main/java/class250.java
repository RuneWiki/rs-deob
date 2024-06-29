import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class250 {

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public int field3597;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public int field3599;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public int field3598;

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
    public class250() {
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lsb;)V")
    public class250(class250 arg0) {
        this.field3597 = arg0.field3597;
        this.field3599 = arg0.field3599;
        this.field3598 = arg0.field3598;
    }
}
