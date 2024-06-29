import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public abstract class class15 extends class259 {

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "Z")
    public volatile boolean field167 = true;

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
    public int field166;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "Lrk;")
    public class15 field164;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "Lhd;")
    public class310 field165;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "()Lrk;")
    public abstract class15 method101();

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "()I")
    public abstract int method102();

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "(I)V")
    public abstract void method103(int arg0);

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "([III)V")
    public abstract void method104(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "()I")
    public int method105() {
        return 255;
    }

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "()Lrk;")
    public abstract class15 method106();

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "([III)V")
    public final void method107(int[] arg0, int arg1, int arg2) {
        if (this.field167) {
            this.method104(arg0, arg1, arg2);
        } else {
            this.method103(arg2);
        }
    }
}
