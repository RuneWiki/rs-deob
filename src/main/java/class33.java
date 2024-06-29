import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public abstract class class33 extends class276 {

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "Z")
    public volatile boolean field521 = true;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
    public int field520;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "Loa;")
    public class33 field518;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "Ldd;")
    public class474 field519;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "([III)V", line = 9)
    public final void method253(int[] arg0, int arg1, int arg2) {
        if (this.field521) {
            this.method252(arg0, arg1, arg2);
        } else {
            this.method251(arg2);
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "()I", line = 20)
    public int method255() {
        return 255;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public abstract void method251(int arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([III)V")
    public abstract void method252(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()Loa;")
    public abstract class33 method254();

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "()Loa;")
    public abstract class33 method256();

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "()I")
    public abstract int method257();
}
