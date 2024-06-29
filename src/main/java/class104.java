import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public abstract class class104 extends class107 {

    @OriginalMember(owner = "client!th", name = "v", descriptor = "Z")
    public volatile boolean field1723 = true;

    @OriginalMember(owner = "client!th", name = "w", descriptor = "I")
    public int field1724;

    @OriginalMember(owner = "client!th", name = "y", descriptor = "Lth;")
    public class104 field1726;

    @OriginalMember(owner = "client!th", name = "x", descriptor = "Luh;")
    public class94 field1725;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "()I")
    public int method604() {
        return 255;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "([III)V")
    public abstract void method498(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!th", name = "b", descriptor = "()Lth;")
    public abstract class104 method490();

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(I)V")
    public abstract void method496(int arg0);

    @OriginalMember(owner = "client!th", name = "b", descriptor = "([III)V")
    public final void method751(int[] arg0, int arg1, int arg2) {
        if (this.field1723) {
            this.method498(arg0, arg1, arg2);
        } else {
            this.method496(arg2);
        }
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "()Lth;")
    public abstract class104 method493();

    @OriginalMember(owner = "client!th", name = "d", descriptor = "()I")
    public abstract int method491();
}
