import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public abstract class class224 extends class445 {

    @OriginalMember(owner = "client!ll", name = "v", descriptor = "Z")
    public volatile boolean field2970 = true;

    @OriginalMember(owner = "client!ll", name = "t", descriptor = "I")
    public int field2968;

    @OriginalMember(owner = "client!ll", name = "s", descriptor = "Lll;")
    public class224 field2967;

    @OriginalMember(owner = "client!ll", name = "u", descriptor = "Lls;")
    public class83 field2969;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "([III)V", line = 8)
    public final void method1265(int[] arg0, int arg1, int arg2) {
        if (this.field2970) {
            this.method59(arg0, arg1, arg2);
        } else {
            this.method63(arg2);
        }
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "()I", line = 15)
    public int method290() {
        return 255;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "()Lll;")
    public abstract class224 method56();

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "([III)V")
    public abstract void method59(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)V")
    public abstract void method63(int arg0);

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "()I")
    public abstract int method58();

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "()Lll;")
    public abstract class224 method53();
}
