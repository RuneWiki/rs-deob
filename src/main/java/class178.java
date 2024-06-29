import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public abstract class class178 extends class119 {

    @OriginalMember(owner = "client!tf", name = "s", descriptor = "Z")
    public volatile boolean field3384 = true;

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "I")
    public int field3382;

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "Ltf;")
    public class178 field3383;

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "Lwe;")
    public class204 field3381;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "()Ltf;")
    public abstract class178 method310();

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "()Ltf;")
    public abstract class178 method345();

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "()I")
    public int method339() {
        return 255;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "([III)V")
    public final void method1152(int[] arg0, int arg1, int arg2) {
        if (this.field3384) {
            this.method320(arg0, arg1, arg2);
        } else {
            this.method333(arg2);
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V")
    public abstract void method333(int arg0);

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "([III)V")
    public abstract void method320(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "()I")
    public abstract int method334();
}
