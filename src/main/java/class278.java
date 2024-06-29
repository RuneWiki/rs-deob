import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public abstract class class278 extends class141 {

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "Z")
    public volatile boolean field4672 = true;

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "I")
    public int field4670;

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "Lje;")
    public class170 field4669;

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "Ljk;")
    public class278 field4671;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "([III)V", line = 10)
    public final void method1941(int[] arg0, int arg1, int arg2) {
        if (this.field4672) {
            this.method881(arg0, arg1, arg2);
        } else {
            this.method883(arg2);
        }
    }

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "()I", line = 17)
    public int method1695() {
        return 255;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "([III)V")
    public abstract void method881(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "()I")
    public abstract int method878();

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "()Ljk;")
    public abstract class278 method875();

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "()Ljk;")
    public abstract class278 method886();

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(I)V")
    public abstract void method883(int arg0);
}
