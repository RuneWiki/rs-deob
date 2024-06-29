import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public abstract class class317 extends class324 {

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "Z")
    public volatile boolean field4611 = true;

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "I")
    public int field4609;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "Lbk;")
    public class317 field4612;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "Lqv;")
    public class382 field4610;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "([III)V", line = 5)
    public final void method2080(int[] arg0, int arg1, int arg2) {
        if (this.field4611) {
            this.method930(arg0, arg1, arg2);
        } else {
            this.method929(arg2);
        }
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "()I", line = 24)
    public int method1120() {
        return 255;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "()I")
    public abstract int method935();

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "()Lbk;")
    public abstract class317 method925();

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "()Lbk;")
    public abstract class317 method926();

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "([III)V")
    public abstract void method930(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
    public abstract void method929(int arg0);
}
