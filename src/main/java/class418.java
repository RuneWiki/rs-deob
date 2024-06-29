import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public abstract class class418 extends class626 {

    @OriginalMember(owner = "client!ep", name = "h", descriptor = "Z")
    public volatile boolean field5863 = true;

    @OriginalMember(owner = "client!ep", name = "i", descriptor = "I")
    public int field5864;

    @OriginalMember(owner = "client!ep", name = "k", descriptor = "Lep;")
    public class418 field5866;

    @OriginalMember(owner = "client!ep", name = "j", descriptor = "Lla;")
    public class450 field5865;

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "([III)V", line = 7)
    public final void method2549(int[] arg0, int arg1, int arg2) {
        if (this.field5863) {
            this.method1687(arg0, arg1, arg2);
        } else {
            this.method1663(arg2);
        }
    }

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "()I", line = 21)
    public int method1908() {
        return 255;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "([III)V")
    public abstract void method1687(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "()Lep;")
    public abstract class418 method1696();

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "()I")
    public abstract int method1673();

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "()Lep;")
    public abstract class418 method1693();

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V")
    public abstract void method1663(int arg0);
}
