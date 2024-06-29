import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public abstract class class298 extends class35 {

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "Z")
    public volatile boolean field4405 = true;

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "I")
    public int field4404;

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "Lem;")
    public class142 field4403;

    @OriginalMember(owner = "client!wm", name = "l", descriptor = "Lwm;")
    public class298 field4406;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "([III)V", line = 5)
    public final void method2068(int[] arg0, int arg1, int arg2) {
        if (this.field4405) {
            this.method187(arg0, arg1, arg2);
        } else {
            this.method173(arg2);
        }
    }

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "()I", line = 24)
    public int method180() {
        return 255;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "()Lwm;")
    public abstract class298 method206();

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(I)V")
    public abstract void method173(int arg0);

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "()Lwm;")
    public abstract class298 method183();

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "()I")
    public abstract int method185();

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "([III)V")
    public abstract void method187(int[] arg0, int arg1, int arg2);
}
