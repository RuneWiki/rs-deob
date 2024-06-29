import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public abstract class class273 extends class154 {

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "Z")
    public volatile boolean field4348 = true;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
    public int field4350;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "Lrg;")
    public class273 field4349;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "Lm;")
    public class46 field4351;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "([III)V")
    public abstract void method914(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "()I")
    public abstract int method911();

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "()I")
    public int method1778() {
        return 255;
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "()Lrg;")
    public abstract class273 method917();

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "([III)V")
    public final void method1779(int[] arg0, int arg1, int arg2) {
        if (this.field4348) {
            this.method914(arg0, arg1, arg2);
        } else {
            this.method918(arg2);
        }
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(I)V")
    public abstract void method918(int arg0);

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "()Lrg;")
    public abstract class273 method912();
}
