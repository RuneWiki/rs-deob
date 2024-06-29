import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public abstract class class281 extends class179 {

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "Z")
    public volatile boolean field4260 = true;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
    public int field4263;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "Lwg;")
    public class281 field4262;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "Lcp;")
    public class489 field4261;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "()I")
    public abstract int method639();

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "()Lwg;")
    public abstract class281 method652();

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)V")
    public abstract void method633(int arg0);

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "()I")
    public int method1712() {
        return 255;
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "()Lwg;")
    public abstract class281 method650();

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "([III)V")
    public final void method1713(int[] arg0, int arg1, int arg2) {
        if (this.field4260) {
            this.method643(arg0, arg1, arg2);
        } else {
            this.method633(arg2);
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "([III)V")
    public abstract void method643(int[] arg0, int arg1, int arg2);
}
