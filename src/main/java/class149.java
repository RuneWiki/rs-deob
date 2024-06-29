import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public abstract class class149 extends class287 {

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "Z")
    public volatile boolean field2562 = true;

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "I")
    public int field2560;

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "Lej;")
    public class149 field2561;

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "Lhm;")
    public class19 field2559;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "([III)V", line = 8)
    public final void method1000(int[] arg0, int arg1, int arg2) {
        if (this.field2562) {
            this.method392(arg0, arg1, arg2);
        } else {
            this.method388(arg2);
        }
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "()I", line = 16)
    public int method1001() {
        return 255;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V")
    public abstract void method388(int arg0);

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "()Lej;")
    public abstract class149 method387();

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "()I")
    public abstract int method398();

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "()Lej;")
    public abstract class149 method397();

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "([III)V")
    public abstract void method392(int[] arg0, int arg1, int arg2);
}
