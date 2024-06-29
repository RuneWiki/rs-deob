import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public abstract class class168 extends class73 {

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "Z")
    public volatile boolean field3126 = true;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "I")
    public int field3125;

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "Lhf;")
    public class168 field3127;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "Lkd;")
    public class62 field3124;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "()I")
    public abstract int method347();

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "([III)V")
    public abstract void method356(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V")
    public abstract void method354(int arg0);

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "()Lhf;")
    public abstract class168 method336();

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "([III)V")
    public final void method1209(int[] arg0, int arg1, int arg2) {
        if (this.field3126) {
            this.method356(arg0, arg1, arg2);
        } else {
            this.method354(arg2);
        }
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "()I")
    public int method676() {
        return 255;
    }

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "()Lhf;")
    public abstract class168 method342();
}
