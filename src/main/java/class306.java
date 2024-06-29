import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public abstract class class306 extends class184 {

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "Z")
    public volatile boolean field4329 = true;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
    public int field4330;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "Lqha;")
    public class104 field4328;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "Lca;")
    public class306 field4331;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "([III)V")
    public final void method1932(int[] arg0, int arg1, int arg2) {
        if (this.field4329) {
            this.method1491(arg0, arg1, arg2);
        } else {
            this.method1482(arg2);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "()Lca;")
    public abstract class306 method1485();

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public abstract void method1482(int arg0);

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "()I")
    public int method1933() {
        return 255;
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "()Lca;")
    public abstract class306 method1488();

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "()I")
    public abstract int method1497();

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "([III)V")
    public abstract void method1491(int[] arg0, int arg1, int arg2);
}
