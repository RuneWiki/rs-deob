import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public abstract class class40 extends class83 {

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "Z")
    public volatile boolean field596 = true;

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "I")
    public int field599;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "Lge;")
    public class249 field597;

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "Lok;")
    public class40 field598;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "([III)V")
    public abstract void method257(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)V")
    public abstract void method253(int arg0);

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "()I")
    public abstract int method256();

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "()Lok;")
    public abstract class40 method252();

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "()Lok;")
    public abstract class40 method251();

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "()I")
    public int method268() {
        return 255;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "([III)V")
    public final void method269(int[] arg0, int arg1, int arg2) {
        if (this.field596) {
            this.method257(arg0, arg1, arg2);
        } else {
            this.method253(arg2);
        }
    }
}
