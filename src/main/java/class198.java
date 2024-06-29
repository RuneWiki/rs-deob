import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public abstract class class198 extends class35 {

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "Z")
    public volatile boolean field3176 = true;

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "I")
    public int field3179;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "Lwa;")
    public class161 field3177;

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "Laj;")
    public class198 field3178;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "()I", line = 13)
    public int method1266() {
        return 255;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "([III)V", line = 20)
    public final void method1267(int[] arg0, int arg1, int arg2) {
        if (this.field3176) {
            this.method1227(arg0, arg1, arg2);
        } else {
            this.method1228(arg2);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "()Laj;")
    public abstract class198 method1235();

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "()Laj;")
    public abstract class198 method1234();

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "()I")
    public abstract int method1233();

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
    public abstract void method1228(int arg0);

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "([III)V")
    public abstract void method1227(int[] arg0, int arg1, int arg2);
}
