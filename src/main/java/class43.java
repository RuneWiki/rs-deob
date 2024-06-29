import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public abstract class class43 extends class237 {

    @OriginalMember(owner = "client!fg", name = "q", descriptor = "Z")
    public volatile boolean field544 = true;

    @OriginalMember(owner = "client!fg", name = "p", descriptor = "I")
    public int field543;

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "Lcb;")
    public class197 field541;

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "Lfg;")
    public class43 field542;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "(I)V")
    public abstract void method236(int arg0);

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "([III)V")
    public abstract void method237(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "()I")
    public abstract int method238();

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "()Lfg;")
    public abstract class43 method239();

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "()I")
    public int method240() {
        return 255;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "([III)V")
    public final void method241(int[] arg0, int arg1, int arg2) {
        if (this.field544) {
            this.method237(arg0, arg1, arg2);
        } else {
            this.method236(arg2);
        }
    }

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "()Lfg;")
    public abstract class43 method242();
}
