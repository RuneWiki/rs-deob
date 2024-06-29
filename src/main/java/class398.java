import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public abstract class class398 extends class42 {

    @OriginalMember(owner = "client!po", name = "o", descriptor = "Z")
    public volatile boolean field5651 = true;

    @OriginalMember(owner = "client!po", name = "r", descriptor = "I")
    public int field5654;

    @OriginalMember(owner = "client!po", name = "p", descriptor = "Ljs;")
    public class223 field5652;

    @OriginalMember(owner = "client!po", name = "q", descriptor = "Lpo;")
    public class398 field5653;

    @OriginalMember(owner = "client!po", name = "b", descriptor = "([III)V", line = 16)
    public final void method2392(int[] arg0, int arg1, int arg2) {
        if (this.field5651) {
            this.method717(arg0, arg1, arg2);
        } else {
            this.method697(arg2);
        }
    }

    @OriginalMember(owner = "client!po", name = "d", descriptor = "()I", line = 24)
    public int method702() {
        return 255;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "([III)V")
    public abstract void method717(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!po", name = "a", descriptor = "()I")
    public abstract int method692();

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V")
    public abstract void method697(int arg0);

    @OriginalMember(owner = "client!po", name = "b", descriptor = "()Lpo;")
    public abstract class398 method693();

    @OriginalMember(owner = "client!po", name = "c", descriptor = "()Lpo;")
    public abstract class398 method700();
}
