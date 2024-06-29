import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public abstract class class118 extends class166 {

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "Z")
    public volatile boolean field2444 = true;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
    public int field2446;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "Lnb;")
    public class118 field2447;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "Lie;")
    public class77 field2445;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "([III)V")
    public abstract void method234(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "()Lnb;")
    public abstract class118 method232();

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V")
    public abstract void method236(int arg0);

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "([III)V")
    public final void method742(int[] arg0, int arg1, int arg2) {
        if (this.field2444) {
            this.method234(arg0, arg1, arg2);
        } else {
            this.method236(arg2);
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "()Lnb;")
    public abstract class118 method231();

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "()I")
    public int method743() {
        return 255;
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "()I")
    public abstract int method235();
}
