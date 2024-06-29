import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public abstract class class105 extends class44 {

    @OriginalMember(owner = "client!le", name = "m", descriptor = "Z")
    public volatile boolean field1925 = true;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    public int field1927;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "Lle;")
    public class105 field1926;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "Lfh;")
    public class56 field1928;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
    public abstract void method116(int arg0);

    @OriginalMember(owner = "client!le", name = "a", descriptor = "()I")
    public abstract int method113();

    @OriginalMember(owner = "client!le", name = "a", descriptor = "([III)V")
    public final void method579(int[] arg0, int arg1, int arg2) {
        if (this.field1925) {
            this.method119(arg0, arg1, arg2);
        } else {
            this.method116(arg2);
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "()I")
    public int method580() {
        return 255;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "([III)V")
    public abstract void method119(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!le", name = "c", descriptor = "()Lle;")
    public abstract class105 method117();

    @OriginalMember(owner = "client!le", name = "d", descriptor = "()Lle;")
    public abstract class105 method109();
}
