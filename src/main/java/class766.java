import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sia")
public abstract class class766 extends class101 {

    @OriginalMember(owner = "client!sia", name = "o", descriptor = "Z")
    public volatile boolean field10577 = true;

    @OriginalMember(owner = "client!sia", name = "q", descriptor = "I")
    public int field10579;

    @OriginalMember(owner = "client!sia", name = "n", descriptor = "Lus;")
    public class1 field10576;

    @OriginalMember(owner = "client!sia", name = "p", descriptor = "Lsia;")
    public class766 field10578;

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "()Lsia;")
    public abstract class766 method595();

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(I)V")
    public abstract void method596(int arg0);

    @OriginalMember(owner = "client!sia", name = "b", descriptor = "()I")
    public abstract int method591();

    @OriginalMember(owner = "client!sia", name = "c", descriptor = "()I")
    public int method3895() {
        return 255;
    }

    @OriginalMember(owner = "client!sia", name = "d", descriptor = "()Lsia;")
    public abstract class766 method592();

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "([III)V")
    public abstract void method593(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sia", name = "b", descriptor = "([III)V")
    public final void method4248(int[] arg0, int arg1, int arg2) {
        if (this.field10577) {
            this.method593(arg0, arg1, arg2);
        } else {
            this.method596(arg2);
        }
    }
}
