import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public abstract class class209 extends class86 {

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "Z")
    public volatile boolean field3573 = true;

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "I")
    public int field3570;

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "Lrb;")
    public class209 field3571;

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "Lck;")
    public class224 field3572;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "([III)V", line = 3)
    public final void method1383(int[] arg0, int arg1, int arg2) {
        if (this.field3573) {
            this.method161(arg0, arg1, arg2);
        } else {
            this.method148(arg2);
        }
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "()I", line = 16)
    public int method315() {
        return 255;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "([III)V")
    public abstract void method161(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "()I")
    public abstract int method140();

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "()Lrb;")
    public abstract class209 method158();

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(I)V")
    public abstract void method148(int arg0);

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "()Lrb;")
    public abstract class209 method147();
}
