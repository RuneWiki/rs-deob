import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public abstract class class258 extends class59 {

    @OriginalMember(owner = "client!cm", name = "y", descriptor = "Z")
    public volatile boolean field4125 = true;

    @OriginalMember(owner = "client!cm", name = "x", descriptor = "I")
    public int field4124;

    @OriginalMember(owner = "client!cm", name = "w", descriptor = "Lcm;")
    public class258 field4123;

    @OriginalMember(owner = "client!cm", name = "v", descriptor = "Log;")
    public class42 field4122;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "()I", line = 3)
    public int method1524() {
        return 255;
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "([III)V", line = 11)
    public final void method1826(int[] arg0, int arg1, int arg2) {
        if (this.field4125) {
            this.method1072(arg0, arg1, arg2);
        } else {
            this.method1054(arg2);
        }
    }

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "(I)V")
    public abstract void method1054(int arg0);

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "([III)V")
    public abstract void method1072(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "()I")
    public abstract int method1067();

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "()Lcm;")
    public abstract class258 method1070();

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "()Lcm;")
    public abstract class258 method1075();
}
