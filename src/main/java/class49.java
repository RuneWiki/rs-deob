import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public abstract class class49 extends class145 {

    @OriginalMember(owner = "client!h", name = "A", descriptor = "Z")
    public volatile boolean field1248 = true;

    @OriginalMember(owner = "client!h", name = "x", descriptor = "I")
    public int field1245;

    @OriginalMember(owner = "client!h", name = "z", descriptor = "Lrd;")
    public class122 field1247;

    @OriginalMember(owner = "client!h", name = "y", descriptor = "Lh;")
    public class49 field1246;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "()I", line = 6)
    public int method547() {
        return 255;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "([III)V", line = 13)
    public final void method548(int[] arg0, int arg1, int arg2) {
        if (this.field1248) {
            this.method193(arg0, arg1, arg2);
        } else {
            this.method163(arg2);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "()Lh;")
    public abstract class49 method159();

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(I)V")
    public abstract void method163(int arg0);

    @OriginalMember(owner = "client!h", name = "c", descriptor = "()I")
    public abstract int method164();

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([III)V")
    public abstract void method193(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!h", name = "d", descriptor = "()Lh;")
    public abstract class49 method171();
}
