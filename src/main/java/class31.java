import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public abstract class class31 extends class107 {

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "Z")
    public volatile boolean field675 = true;

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
    public int field677;

    @OriginalMember(owner = "client!eb", name = "w", descriptor = "Lva;")
    public class135 field678;

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "Leb;")
    public class31 field676;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "()I")
    public abstract int method135();

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "([III)V")
    public abstract void method140(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "()Leb;")
    public abstract class31 method120();

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "()Leb;")
    public abstract class31 method116();

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "()I")
    public int method127() {
        return 255;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V")
    public abstract void method117(int arg0);

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "([III)V")
    public final void method234(int[] arg0, int arg1, int arg2) {
        if (this.field675) {
            this.method140(arg0, arg1, arg2);
        } else {
            this.method117(arg2);
        }
    }
}
