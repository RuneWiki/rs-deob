import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public abstract class class321 extends class406 {

    @OriginalMember(owner = "client!j", name = "s", descriptor = "Z")
    public volatile boolean field4575 = true;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "I")
    public int field4574;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "Ldm;")
    public class31 field4572;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "Lj;")
    public class321 field4573;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([III)V", line = 7)
    public final void method2097(int[] arg0, int arg1, int arg2) {
        if (this.field4575) {
            this.method1076(arg0, arg1, arg2);
        } else {
            this.method1056(arg2);
        }
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "()I", line = 15)
    public int method1170() {
        return 255;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V")
    public abstract void method1056(int arg0);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()I")
    public abstract int method1079();

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()Lj;")
    public abstract class321 method1078();

    @OriginalMember(owner = "client!j", name = "c", descriptor = "()Lj;")
    public abstract class321 method1060();

    @OriginalMember(owner = "client!j", name = "b", descriptor = "([III)V")
    public abstract void method1076(int[] arg0, int arg1, int arg2);
}
