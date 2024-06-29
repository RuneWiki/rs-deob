import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public abstract class class228 extends class314 {

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "Z")
    public volatile boolean field3981 = true;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
    public int field3979;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "Lgj;")
    public class228 field3980;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "Lan;")
    public class319 field3978;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "()I", line = 4)
    public int method696() {
        return 255;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "([III)V", line = 13)
    public final void method1651(int[] arg0, int arg1, int arg2) {
        if (this.field3981) {
            this.method117(arg0, arg1, arg2);
        } else {
            this.method131(arg2);
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "()Lgj;")
    public abstract class228 method140();

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V")
    public abstract void method131(int arg0);

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "()Lgj;")
    public abstract class228 method133();

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "([III)V")
    public abstract void method117(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "()I")
    public abstract int method102();
}
