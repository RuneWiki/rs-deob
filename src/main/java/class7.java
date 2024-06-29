import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public abstract class class7 extends class151 {

    @OriginalMember(owner = "client!af", name = "q", descriptor = "Z")
    public volatile boolean field68 = true;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "I")
    public int field66;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "Lqe;")
    public class179 field67;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "Laf;")
    public class7 field69;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "()Laf;")
    public abstract class7 method24();

    @OriginalMember(owner = "client!af", name = "b", descriptor = "()Laf;")
    public abstract class7 method25();

    @OriginalMember(owner = "client!af", name = "c", descriptor = "()I")
    public abstract int method26();

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(I)V")
    public abstract void method27(int arg0);

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([III)V")
    public final void method28(int[] arg0, int arg1, int arg2) {
        if (this.field68) {
            this.method30(arg0, arg1, arg2);
        } else {
            this.method27(arg2);
        }
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "()I")
    public int method29() {
        return 255;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "([III)V")
    public abstract void method30(int[] arg0, int arg1, int arg2);
}
