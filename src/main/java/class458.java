import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public abstract class class458 extends class320 {

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "Z")
    public volatile boolean field6864 = true;

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "I")
    public int field6863;

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "Ltf;")
    public class192 field6862;

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "Lbl;")
    public class458 field6865;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "([III)V")
    public abstract void method2037(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "()I")
    public int method2729() {
        return 255;
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(I)V")
    public abstract void method2041(int arg0);

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "()Lbl;")
    public abstract class458 method2044();

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "([III)V")
    public final void method2730(int[] arg0, int arg1, int arg2) {
        if (this.field6864) {
            this.method2037(arg0, arg1, arg2);
        } else {
            this.method2041(arg2);
        }
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "()I")
    public abstract int method2034();

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "()Lbl;")
    public abstract class458 method2033();
}
