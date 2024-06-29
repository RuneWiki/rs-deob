import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class368 extends class351 {

    @OriginalMember(owner = "client!wr", name = "P", descriptor = "I")
    private int field5233;

    @OriginalMember(owner = "client!wr", name = "O", descriptor = "Lpg;")
    private static class112 field5232;

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "()V")
    public static void method2346() {
        field5232 = null;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)V")
    public final void method18(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field5232.method972(this.field5233, arg0, 6654);
        }
    }

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "()V")
    public final void method19() {
        field5232.method971((byte) -88, this.field5233);
    }

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "()I")
    public final int method17() {
        return field5232.method970(22109, this.field5233);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "()V")
    public final void method21() {
        field5232.method967(this.field5233, super.field4997);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method20(Component arg0) throws Exception {
        field5232.method969(arg0, class122.field1929, class326.field4692, (byte) 93);
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lvj;I)V")
    public class368(class177 arg0, int arg1) {
        field5232 = arg0.method1392(-1);
        this.field5233 = arg1;
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "()V")
    public final void method16() {
        field5232.method968(true, this.field5233);
    }
}
