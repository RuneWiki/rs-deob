import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 extends class141 {

    @OriginalMember(owner = "client!ad", name = "M", descriptor = "I")
    private int field53;

    @OriginalMember(owner = "client!ad", name = "N", descriptor = "Lcf;")
    private static class29 field54;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "()V")
    public final void method15() {
        field54.method210((byte) 76, this.field53);
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
    public final void method13(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field54.method213(27, arg0, this.field53);
        }
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "()I")
    public final int method14() {
        return field54.method215((byte) -76, this.field53);
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "()V")
    public final void method17() {
        field54.method214(this.field53, super.field2651);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method16(Component arg0) throws Exception {
        field54.method212(class96.field1728, -96, arg0, client.field533);
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "()V")
    public static void method22() {
        field54 = null;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "()V")
    public final void method12() {
        field54.method211(this.field53, -13684);
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lhf;I)V")
    public class5(class83 arg0, int arg1) {
        field54 = arg0.method508((byte) -112);
        this.field53 = arg1;
    }
}
