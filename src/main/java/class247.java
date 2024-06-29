import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public abstract class class247 extends class171 {

    @OriginalMember(owner = "client!t", name = "q", descriptor = "Z")
    public volatile boolean field4089 = true;

    @OriginalMember(owner = "client!t", name = "t", descriptor = "I")
    public int field4092;

    @OriginalMember(owner = "client!t", name = "r", descriptor = "Lek;")
    public class178 field4090;

    @OriginalMember(owner = "client!t", name = "s", descriptor = "Lt;")
    public class247 field4091;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "([III)V", line = 6)
    public final void method1801(int[] arg0, int arg1, int arg2) {
        if (this.field4089) {
            this.method307(arg0, arg1, arg2);
        } else {
            this.method303(arg2);
        }
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "()I", line = 18)
    public int method1147() {
        return 255;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "()Lt;")
    public abstract class247 method298();

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(I)V")
    public abstract void method303(int arg0);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([III)V")
    public abstract void method307(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!t", name = "b", descriptor = "()I")
    public abstract int method304();

    @OriginalMember(owner = "client!t", name = "d", descriptor = "()Lt;")
    public abstract class247 method301();
}
