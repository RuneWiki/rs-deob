import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class172 extends class246 {

    @OriginalMember(owner = "client!mc", name = "M", descriptor = "I")
    private int field3000;

    @OriginalMember(owner = "client!mc", name = "N", descriptor = "Lli;")
    private static class209 field3001;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "()V", line = 3)
    public final void method1150() {
        field3001.method1440(false, this.field3000);
    }

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "()V", line = 8)
    public static void method1151() {
        field3001 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "()I", line = 11)
    public final int method1152() {
        return field3001.method1439(this.field3000, 25414);
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "()V", line = 14)
    public final void method1153() {
        field3001.method1438((byte) 125, this.field3000);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 17)
    public final void method1154(Component arg0) throws Exception {
        field3001.method1436(arg0, 28620, class195.field3424, class10.field356);
    }

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "(I)V", line = 20)
    public final void method1155(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        field3001.method1437(arg0, this.field3000, 23735);
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lcb;I)V", line = 25)
    public class172(class270 arg0, int arg1) {
        field3001 = arg0.method1895((byte) 32);
        this.field3000 = arg1;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "()V", line = 30)
    public final void method1156() {
        field3001.method1441(this.field3000, this.field4202);
    }
}
