import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public abstract class class9 extends class176 {

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "Z")
    public volatile boolean field105 = true;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "I")
    public int field102;

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "Lti;")
    public class373 field103;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "Lff;")
    public class9 field104;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "()I")
    public int method50() {
        return 255;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "()I")
    public abstract int method51();

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "()Lff;")
    public abstract class9 method52();

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "()Lff;")
    public abstract class9 method53();

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public abstract void method54(int arg0);

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "([III)V")
    public abstract void method55(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "([III)V")
    public final void method56(int[] arg0, int arg1, int arg2) {
        if (this.field105) {
            this.method55(arg0, arg1, arg2);
        } else {
            this.method54(arg2);
        }
    }
}
