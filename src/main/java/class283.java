import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public abstract class class283 extends class270 {

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "Z")
    public volatile boolean field3595 = true;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    public int field3596;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "Lcd;")
    public class283 field3598;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "Lcp;")
    public class661 field3597;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
    public abstract void method639(int arg0);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "()I")
    public abstract int method671();

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([III)V")
    public final void method1614(int[] arg0, int arg1, int arg2) {
        if (this.field3595) {
            this.method657(arg0, arg1, arg2);
        } else {
            this.method639(arg2);
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "()I")
    public int method935() {
        return 255;
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "()Lcd;")
    public abstract class283 method651();

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "()Lcd;")
    public abstract class283 method650();

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "([III)V")
    public abstract void method657(int[] arg0, int arg1, int arg2);
}
