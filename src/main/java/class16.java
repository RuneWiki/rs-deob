import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public abstract class class16 extends class24 {

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "Z")
    public volatile boolean field180 = true;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "I")
    public int field181;

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "Lrh;")
    public class16 field179;

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "Lsa;")
    public class250 field182;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "()I", line = 9)
    public int method69() {
        return 255;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "([III)V", line = 12)
    public final void method70(int[] arg0, int arg1, int arg2) {
        if (this.field180) {
            this.method73(arg0, arg1, arg2);
        } else {
            this.method68(arg2);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "()I")
    public abstract int method67();

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V")
    public abstract void method68(int arg0);

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "()Lrh;")
    public abstract class16 method71();

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "()Lrh;")
    public abstract class16 method72();

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "([III)V")
    public abstract void method73(int[] arg0, int arg1, int arg2);
}
