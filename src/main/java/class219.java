import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public abstract class class219 extends class163 {

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "Z")
    public volatile boolean field3859 = true;

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "I")
    public int field3861;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "Lcd;")
    public class128 field3860;

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "Lfd;")
    public class219 field3862;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "()I", line = 3)
    public int method918() {
        return 255;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "([III)V", line = 17)
    public final void method1518(int[] arg0, int arg1, int arg2) {
        if (this.field3859) {
            this.method941(arg0, arg1, arg2);
        } else {
            this.method912(arg2);
        }
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(I)V")
    public abstract void method912(int arg0);

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "()Lfd;")
    public abstract class219 method934();

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "()I")
    public abstract int method915();

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "()Lfd;")
    public abstract class219 method913();

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "([III)V")
    public abstract void method941(int[] arg0, int arg1, int arg2);
}
