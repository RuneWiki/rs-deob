import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public abstract class class156 extends class129 {

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "Z")
    public volatile boolean field2935 = true;

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "I")
    public int field2936;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "Lpg;")
    public class156 field2934;

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "Lsf;")
    public class185 field2937;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "()I")
    public abstract int method115();

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "([III)V")
    public abstract void method108(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "([III)V")
    public final void method1031(int[] arg0, int arg1, int arg2) {
        if (this.field2935) {
            this.method108(arg0, arg1, arg2);
        } else {
            this.method91(arg2);
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "()Lpg;")
    public abstract class156 method116();

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "()I")
    public int method962() {
        return 255;
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)V")
    public abstract void method91(int arg0);

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "()Lpg;")
    public abstract class156 method101();
}
