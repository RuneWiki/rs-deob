import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public abstract class class12 extends class86 {

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "Z")
    public volatile boolean field215 = true;

    @OriginalMember(owner = "client!fg", name = "p", descriptor = "I")
    public int field216;

    @OriginalMember(owner = "client!fg", name = "q", descriptor = "Lde;")
    public class110 field217;

    @OriginalMember(owner = "client!fg", name = "r", descriptor = "Lfg;")
    public class12 field218;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "()Lfg;")
    public abstract class12 method123();

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(I)V")
    public abstract void method124(int arg0);

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "()Lfg;")
    public abstract class12 method125();

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "([III)V")
    public abstract void method126(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "()I")
    public abstract int method127();

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "([III)V")
    public final void method128(int[] arg0, int arg1, int arg2) {
        if (this.field215) {
            this.method126(arg0, arg1, arg2);
        } else {
            this.method124(arg2);
        }
    }

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "()I")
    public int method129() {
        return 255;
    }
}
