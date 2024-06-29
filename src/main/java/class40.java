import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public abstract class class40 extends class146 {

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "Z")
    public volatile boolean field948 = true;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "I")
    public int field946;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "Lfd;")
    public class40 field945;

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "Lne;")
    public class95 field947;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "()I")
    public abstract int method87();

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "([III)V")
    public final void method321(int[] arg0, int arg1, int arg2) {
        if (this.field948) {
            this.method116(arg0, arg1, arg2);
        } else {
            this.method104(arg2);
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "([III)V")
    public abstract void method116(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "()Lfd;")
    public abstract class40 method113();

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(I)V")
    public abstract void method104(int arg0);

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "()Lfd;")
    public abstract class40 method106();

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "()I")
    public int method322() {
        return 255;
    }
}
