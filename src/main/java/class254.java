import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public abstract class class254 extends class154 {

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "Z")
    public volatile boolean field4365 = true;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
    public int field4364;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "Lpd;")
    public class254 field4363;

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "Lw;")
    public class269 field4366;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "()I", line = 5)
    public int method158() {
        return 255;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "([III)V", line = 10)
    public final void method1717(int[] arg0, int arg1, int arg2) {
        if (this.field4365) {
            this.method113(arg0, arg1, arg2);
        } else {
            this.method114(arg2);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "([III)V")
    public abstract void method113(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
    public abstract void method114(int arg0);

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "()Lpd;")
    public abstract class254 method110();

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "()I")
    public abstract int method120();

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "()Lpd;")
    public abstract class254 method121();
}
