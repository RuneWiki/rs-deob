import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public abstract class class22 extends class16 {

    @OriginalMember(owner = "client!d", name = "C", descriptor = "Z")
    public volatile boolean field408 = true;

    @OriginalMember(owner = "client!d", name = "D", descriptor = "I")
    public int field409;

    @OriginalMember(owner = "client!d", name = "B", descriptor = "Lce;")
    public class20 field407;

    @OriginalMember(owner = "client!d", name = "A", descriptor = "Ld;")
    public class22 field406;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "()Ld;")
    public abstract class22 method153();

    @OriginalMember(owner = "client!d", name = "b", descriptor = "()I")
    public abstract int method154();

    @OriginalMember(owner = "client!d", name = "a", descriptor = "([III)V")
    public final void method155(int[] arg0, int arg1, int arg2) {
        if (this.field408) {
            this.method156(arg0, arg1, arg2);
        } else {
            this.method158(arg2);
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "([III)V")
    public abstract void method156(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!d", name = "c", descriptor = "()I")
    public int method157() {
        return 255;
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(I)V")
    public abstract void method158(int arg0);

    @OriginalMember(owner = "client!d", name = "d", descriptor = "()Ld;")
    public abstract class22 method159();
}
