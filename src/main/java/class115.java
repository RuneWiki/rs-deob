import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public abstract class class115 extends class5 {

    @OriginalMember(owner = "client!wq", name = "m", descriptor = "Z")
    public volatile boolean field1592 = true;

    @OriginalMember(owner = "client!wq", name = "j", descriptor = "I")
    public int field1589;

    @OriginalMember(owner = "client!wq", name = "k", descriptor = "Lwq;")
    public class115 field1590;

    @OriginalMember(owner = "client!wq", name = "l", descriptor = "Lr;")
    public class123 field1591;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "([III)V")
    public abstract void method708(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "()I")
    public abstract int method709();

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "()Lwq;")
    public abstract class115 method710();

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "()I")
    public int method711() {
        return 255;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V")
    public abstract void method712(int arg0);

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "([III)V")
    public final void method713(int[] arg0, int arg1, int arg2) {
        if (this.field1592) {
            this.method708(arg0, arg1, arg2);
        } else {
            this.method712(arg2);
        }
    }

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "()Lwq;")
    public abstract class115 method714();
}
