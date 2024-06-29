import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class338 {

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "I")
    public int field4340;

    @OriginalMember(owner = "client!tda", name = "c", descriptor = "I")
    public int field4341;

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "I")
    public int field4339;

    @OriginalMember(owner = "client!tda", name = "<init>", descriptor = "()V")
    public class338() {
    }

    @OriginalMember(owner = "client!tda", name = "<init>", descriptor = "(Ltda;)V")
    public class338(class338 arg0) {
        this.field4340 = arg0.field4340;
        this.field4341 = arg0.field4341;
        this.field4339 = arg0.field4339;
    }
}
