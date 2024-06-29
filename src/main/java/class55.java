import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public abstract class class55 extends class390 {

    @OriginalMember(owner = "client!er", name = "m", descriptor = "Z")
    public volatile boolean field760 = true;

    @OriginalMember(owner = "client!er", name = "k", descriptor = "I")
    public int field758;

    @OriginalMember(owner = "client!er", name = "j", descriptor = "Lhb;")
    public class433 field757;

    @OriginalMember(owner = "client!er", name = "l", descriptor = "Ler;")
    public class55 field759;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "()I", line = 3)
    public int method449() {
        return 255;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "([III)V", line = 6)
    public final void method450(int[] arg0, int arg1, int arg2) {
        if (this.field760) {
            this.method452(arg0, arg1, arg2);
        } else {
            this.method455(arg2);
        }
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "()I")
    public abstract int method451();

    @OriginalMember(owner = "client!er", name = "b", descriptor = "([III)V")
    public abstract void method452(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!er", name = "c", descriptor = "()Ler;")
    public abstract class55 method453();

    @OriginalMember(owner = "client!er", name = "d", descriptor = "()Ler;")
    public abstract class55 method454();

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(I)V")
    public abstract void method455(int arg0);
}
