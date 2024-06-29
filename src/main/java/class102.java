import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public abstract class class102 extends class393 {

    @OriginalMember(owner = "client!af", name = "n", descriptor = "Z")
    public volatile boolean field1370 = true;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "I")
    public int field1371;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "Laf;")
    public class102 field1369;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "Li;")
    public class83 field1372;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([III)V", line = 5)
    public final void method690(int[] arg0, int arg1, int arg2) {
        if (this.field1370) {
            this.method170(arg0, arg1, arg2);
        } else {
            this.method172(arg2);
        }
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "()I", line = 15)
    public int method691() {
        return 255;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "()Laf;")
    public abstract class102 method165();

    @OriginalMember(owner = "client!af", name = "b", descriptor = "()Laf;")
    public abstract class102 method167();

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V")
    public abstract void method172(int arg0);

    @OriginalMember(owner = "client!af", name = "d", descriptor = "()I")
    public abstract int method164();

    @OriginalMember(owner = "client!af", name = "b", descriptor = "([III)V")
    public abstract void method170(int[] arg0, int arg1, int arg2);
}
