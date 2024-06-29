import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public abstract class class194 extends class128 {

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "Z")
    public volatile boolean field3149 = true;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
    public int field3150;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "Lpd;")
    public class194 field3148;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "Lri;")
    public class283 field3147;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "()I")
    public abstract int method729();

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "()Lpd;")
    public abstract class194 method728();

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "()I")
    public int method724() {
        return 255;
    }

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)V")
    public abstract void method723(int arg0);

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "([III)V")
    public abstract void method734(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "([III)V")
    public final void method1365(int[] arg0, int arg1, int arg2) {
        if (this.field3149) {
            this.method734(arg0, arg1, arg2);
        } else {
            this.method723(arg2);
        }
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "()Lpd;")
    public abstract class194 method714();
}
