import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public abstract class class24 extends class46 {

    @OriginalMember(owner = "client!p", name = "q", descriptor = "Z")
    public volatile boolean field390 = true;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "I")
    public int field389;

    @OriginalMember(owner = "client!p", name = "r", descriptor = "Lp;")
    public class24 field391;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "Lva;")
    public class255 field388;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([III)V", line = 3)
    public final void method231(int[] arg0, int arg1, int arg2) {
        if (this.field390) {
            this.method234(arg0, arg1, arg2);
        } else {
            this.method235(arg2);
        }
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "()I", line = 18)
    public int method236() {
        return 255;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()Lp;")
    public abstract class24 method232();

    @OriginalMember(owner = "client!p", name = "b", descriptor = "()Lp;")
    public abstract class24 method233();

    @OriginalMember(owner = "client!p", name = "b", descriptor = "([III)V")
    public abstract void method234(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(I)V")
    public abstract void method235(int arg0);

    @OriginalMember(owner = "client!p", name = "d", descriptor = "()I")
    public abstract int method237();
}
