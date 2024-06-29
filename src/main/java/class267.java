import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public abstract class class267 extends class120 {

    @OriginalMember(owner = "client!of", name = "o", descriptor = "Z")
    public volatile boolean field4279 = true;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "I")
    public int field4277;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "Lgh;")
    public class24 field4278;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "Lof;")
    public class267 field4276;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(I)V")
    public abstract void method707(int arg0);

    @OriginalMember(owner = "client!of", name = "a", descriptor = "()I")
    public int method1748() {
        return 255;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "()I")
    public abstract int method710();

    @OriginalMember(owner = "client!of", name = "c", descriptor = "()Lof;")
    public abstract class267 method717();

    @OriginalMember(owner = "client!of", name = "d", descriptor = "()Lof;")
    public abstract class267 method713();

    @OriginalMember(owner = "client!of", name = "a", descriptor = "([III)V")
    public abstract void method712(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!of", name = "b", descriptor = "([III)V")
    public final void method1819(int[] arg0, int arg1, int arg2) {
        if (this.field4279) {
            this.method712(arg0, arg1, arg2);
        } else {
            this.method707(arg2);
        }
    }
}
