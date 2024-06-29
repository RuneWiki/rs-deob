import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public abstract class class156 extends class61 {

    @OriginalMember(owner = "client!af", name = "l", descriptor = "Z")
    public volatile boolean field2805 = true;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    public int field2804;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "Laf;")
    public class156 field2806;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "Ljk;")
    public class73 field2803;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(I)V")
    public abstract void method996(int arg0);

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([III)V")
    public abstract void method995(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!af", name = "a", descriptor = "()Laf;")
    public abstract class156 method1004();

    @OriginalMember(owner = "client!af", name = "b", descriptor = "()I")
    public int method1024() {
        return 255;
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "()I")
    public abstract int method993();

    @OriginalMember(owner = "client!af", name = "b", descriptor = "([III)V")
    public final void method1025(int[] arg0, int arg1, int arg2) {
        if (this.field2805) {
            this.method995(arg0, arg1, arg2);
        } else {
            this.method996(arg2);
        }
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "()Laf;")
    public abstract class156 method994();
}
