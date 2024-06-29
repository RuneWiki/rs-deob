import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public abstract class class79 extends class182 {

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "Z")
    public volatile boolean field1467 = true;

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "I")
    public int field1469;

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "Ldg;")
    public class36 field1468;

    @OriginalMember(owner = "client!ig", name = "u", descriptor = "Lig;")
    public class79 field1466;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "()Lig;")
    public abstract class79 method480();

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "()Lig;")
    public abstract class79 method481();

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "([III)V")
    public abstract void method482(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "()I")
    public int method483() {
        return 255;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "([III)V")
    public final void method484(int[] arg0, int arg1, int arg2) {
        if (this.field1467) {
            this.method482(arg0, arg1, arg2);
        } else {
            this.method485(arg2);
        }
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)V")
    public abstract void method485(int arg0);

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "()I")
    public abstract int method486();
}
