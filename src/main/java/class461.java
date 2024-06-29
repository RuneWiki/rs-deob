import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public abstract class class461 extends class147 {

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "Z")
    public volatile boolean field6503 = true;

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "I")
    public int field6505;

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "Lim;")
    public class378 field6502;

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "Lrk;")
    public class461 field6504;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "()Lrk;")
    public abstract class461 method516();

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "()Lrk;")
    public abstract class461 method517();

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "()I")
    public int method1549() {
        return 255;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "([III)V")
    public final void method2718(int[] arg0, int arg1, int arg2) {
        if (this.field6503) {
            this.method513(arg0, arg1, arg2);
        } else {
            this.method512(arg2);
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)V")
    public abstract void method512(int arg0);

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "()I")
    public abstract int method511();

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "([III)V")
    public abstract void method513(int[] arg0, int arg1, int arg2);
}
