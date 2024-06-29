import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public abstract class class162 extends class26 {

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "Z")
    public volatile boolean field2310 = true;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
    public int field2307;

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "Ltf;")
    public class162 field2309;

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "Leb;")
    public class43 field2308;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "()I", line = 6)
    public int method801() {
        return 255;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "([III)V", line = 14)
    public final void method1231(int[] arg0, int arg1, int arg2) {
        if (this.field2310) {
            this.method286(arg0, arg1, arg2);
        } else {
            this.method282(arg2);
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V")
    public abstract void method282(int arg0);

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "()I")
    public abstract int method289();

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "([III)V")
    public abstract void method286(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "()Ltf;")
    public abstract class162 method285();

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "()Ltf;")
    public abstract class162 method284();
}
