import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public abstract class class417 extends class418 {

    @OriginalMember(owner = "client!mq", name = "l", descriptor = "Z")
    public volatile boolean field6085 = true;

    @OriginalMember(owner = "client!mq", name = "k", descriptor = "I")
    public int field6084;

    @OriginalMember(owner = "client!mq", name = "n", descriptor = "Lfe;")
    public class363 field6087;

    @OriginalMember(owner = "client!mq", name = "m", descriptor = "Lmq;")
    public class417 field6086;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "([III)V")
    public final void method2630(int[] arg0, int arg1, int arg2) {
        if (this.field6085) {
            this.method165(arg0, arg1, arg2);
        } else {
            this.method187(arg2);
        }
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(I)V")
    public abstract void method187(int arg0);

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "([III)V")
    public abstract void method165(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "()Lmq;")
    public abstract class417 method189();

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "()Lmq;")
    public abstract class417 method156();

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "()I")
    public int method1741() {
        return 255;
    }

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "()I")
    public abstract int method152();
}
