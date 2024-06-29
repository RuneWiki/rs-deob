import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public abstract class class41 extends class89 {

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "Z")
    public volatile boolean field873 = true;

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "I")
    public int field875;

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "Ldh;")
    public class41 field874;

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "Lfh;")
    public class63 field872;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "()Ldh;")
    public abstract class41 method272();

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "()I")
    public int method273() {
        return 255;
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "()Ldh;")
    public abstract class41 method274();

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "([III)V")
    public abstract void method275(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "()I")
    public abstract int method276();

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V")
    public abstract void method277(int arg0);

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "([III)V")
    public final void method278(int[] arg0, int arg1, int arg2) {
        if (this.field873) {
            this.method275(arg0, arg1, arg2);
        } else {
            this.method277(arg2);
        }
    }
}
