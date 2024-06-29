import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public abstract class class270 extends class337 {

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "Z")
    public volatile boolean field3929 = true;

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "I")
    public int field3930;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "Lhf;")
    public class270 field3928;

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "Lwl;")
    public class280 field3931;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "([III)V", line = 5)
    public final void method1780(int[] arg0, int arg1, int arg2) {
        if (this.field3929) {
            this.method583(arg0, arg1, arg2);
        } else {
            this.method566(arg2);
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "()I", line = 12)
    public int method568() {
        return 255;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "()Lhf;")
    public abstract class270 method585();

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "([III)V")
    public abstract void method583(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "()Lhf;")
    public abstract class270 method563();

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "()I")
    public abstract int method576();

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
    public abstract void method566(int arg0);
}
