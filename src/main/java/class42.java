import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public abstract class class42 extends class161 {

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "Z")
    public volatile boolean field712 = true;

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "I")
    public int field710;

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "Lth;")
    public class110 field711;

    @OriginalMember(owner = "client!ji", name = "s", descriptor = "Lji;")
    public class42 field713;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "()Lji;")
    public abstract class42 method37();

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "()I")
    public int method322() {
        return 255;
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "()I")
    public abstract int method27();

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "([III)V")
    public final void method323(int[] arg0, int arg1, int arg2) {
        if (this.field712) {
            this.method20(arg0, arg1, arg2);
        } else {
            this.method21(arg2);
        }
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "([III)V")
    public abstract void method20(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "()Lji;")
    public abstract class42 method3();

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(I)V")
    public abstract void method21(int arg0);
}
