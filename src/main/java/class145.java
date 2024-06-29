import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public abstract class class145 extends class176 {

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "Z")
    public volatile boolean field3089 = true;

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "I")
    public int field3090;

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "Lpb;")
    public class137 field3092;

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "Lqa;")
    public class145 field3091;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()I")
    public int method437() {
        return 255;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "()Lqa;")
    public abstract class145 method378();

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "()Lqa;")
    public abstract class145 method373();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([III)V")
    public abstract void method375(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "([III)V")
    public final void method1027(int[] arg0, int arg1, int arg2) {
        if (this.field3089) {
            this.method375(arg0, arg1, arg2);
        } else {
            this.method396(arg2);
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
    public abstract void method396(int arg0);

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "()I")
    public abstract int method404();
}
