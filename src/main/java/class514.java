import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public abstract class class514 extends class496 {

    @OriginalMember(owner = "client!ft", name = "k", descriptor = "Z")
    public volatile boolean field7615 = true;

    @OriginalMember(owner = "client!ft", name = "j", descriptor = "I")
    public int field7614;

    @OriginalMember(owner = "client!ft", name = "l", descriptor = "Lqw;")
    public class305 field7616;

    @OriginalMember(owner = "client!ft", name = "i", descriptor = "Lft;")
    public class514 field7613;

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "([III)V", line = 9)
    public final void method3059(int[] arg0, int arg1, int arg2) {
        if (this.field7615) {
            this.method1425(arg0, arg1, arg2);
        } else {
            this.method1434(arg2);
        }
    }

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "()I", line = 19)
    public int method1418() {
        return 255;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "()I")
    public abstract int method1419();

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "([III)V")
    public abstract void method1425(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)V")
    public abstract void method1434(int arg0);

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "()Lft;")
    public abstract class514 method1437();

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "()Lft;")
    public abstract class514 method1397();
}
