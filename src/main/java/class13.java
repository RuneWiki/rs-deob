import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public abstract class class13 extends class123 {

    @OriginalMember(owner = "client!be", name = "J", descriptor = "Z")
    public volatile boolean field286 = true;

    @OriginalMember(owner = "client!be", name = "H", descriptor = "I")
    public int field284;

    @OriginalMember(owner = "client!be", name = "G", descriptor = "Lbe;")
    public class13 field283;

    @OriginalMember(owner = "client!be", name = "I", descriptor = "Lda;")
    public class23 field285;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(I)V")
    public abstract void method112(int arg0);

    @OriginalMember(owner = "client!be", name = "a", descriptor = "()I")
    public int method145() {
        return 255;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "()Lbe;")
    public abstract class13 method110();

    @OriginalMember(owner = "client!be", name = "c", descriptor = "()Lbe;")
    public abstract class13 method113();

    @OriginalMember(owner = "client!be", name = "a", descriptor = "([III)V")
    public final void method146(int[] arg0, int arg1, int arg2) {
        if (this.field286) {
            this.method119(arg0, arg1, arg2);
        } else {
            this.method112(arg2);
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "([III)V")
    public abstract void method119(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!be", name = "d", descriptor = "()I")
    public abstract int method109();
}
