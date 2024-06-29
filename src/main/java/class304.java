import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public abstract class class304 extends class223 {

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "Z")
    public volatile boolean field4328 = true;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
    public int field4326;

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "Lti;")
    public class304 field4327;

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "Law;")
    public class54 field4329;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "([III)V")
    public abstract void method147(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "()I")
    public int method153() {
        return 255;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "()Lti;")
    public abstract class304 method173();

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "([III)V")
    public final void method1896(int[] arg0, int arg1, int arg2) {
        if (this.field4328) {
            this.method147(arg0, arg1, arg2);
        } else {
            this.method136(arg2);
        }
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "()I")
    public abstract int method143();

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "()Lti;")
    public abstract class304 method151();

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
    public abstract void method136(int arg0);
}
