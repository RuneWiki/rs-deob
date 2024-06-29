import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public abstract class class102 extends class134 {

    @OriginalMember(owner = "client!nk", name = "q", descriptor = "Z")
    public volatile boolean field1641 = true;

    @OriginalMember(owner = "client!nk", name = "o", descriptor = "I")
    public int field1639;

    @OriginalMember(owner = "client!nk", name = "p", descriptor = "Lnk;")
    public class102 field1640;

    @OriginalMember(owner = "client!nk", name = "r", descriptor = "Lmh;")
    public class257 field1642;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "()I")
    public int method416() {
        return 255;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "([III)V")
    public final void method742(int[] arg0, int arg1, int arg2) {
        if (this.field1641) {
            this.method110(arg0, arg1, arg2);
        } else {
            this.method112(arg2);
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "()Lnk;")
    public abstract class102 method105();

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "()Lnk;")
    public abstract class102 method109();

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "()I")
    public abstract int method111();

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "([III)V")
    public abstract void method110(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "(I)V")
    public abstract void method112(int arg0);
}
