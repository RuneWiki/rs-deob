import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public abstract class class444 extends class376 {

    @OriginalMember(owner = "client!pn", name = "m", descriptor = "Z")
    public volatile boolean field6414 = true;

    @OriginalMember(owner = "client!pn", name = "o", descriptor = "I")
    public int field6416;

    @OriginalMember(owner = "client!pn", name = "p", descriptor = "Lrr;")
    public class203 field6417;

    @OriginalMember(owner = "client!pn", name = "n", descriptor = "Lpn;")
    public class444 field6415;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "([III)V")
    public abstract void method196(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "()I")
    public abstract int method208();

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "()Lpn;")
    public abstract class444 method179();

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "(I)V")
    public abstract void method198(int arg0);

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "()I")
    public int method674() {
        return 255;
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "([III)V")
    public final void method2776(int[] arg0, int arg1, int arg2) {
        if (this.field6414) {
            this.method196(arg0, arg1, arg2);
        } else {
            this.method198(arg2);
        }
    }

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "()Lpn;")
    public abstract class444 method180();
}
