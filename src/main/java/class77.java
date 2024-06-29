import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public abstract class class77 extends class79 {

    @OriginalMember(owner = "client!fg", name = "x", descriptor = "Z")
    public volatile boolean field1193 = true;

    @OriginalMember(owner = "client!fg", name = "v", descriptor = "I")
    public int field1191;

    @OriginalMember(owner = "client!fg", name = "w", descriptor = "Lef;")
    public class149 field1192;

    @OriginalMember(owner = "client!fg", name = "y", descriptor = "Lfg;")
    public class77 field1194;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "([III)V", line = 5)
    public final void method544(int[] arg0, int arg1, int arg2) {
        if (this.field1193) {
            this.method458(arg0, arg1, arg2);
        } else {
            this.method468(arg2);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "()I", line = 14)
    public int method545() {
        return 255;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "([III)V")
    public abstract void method458(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V")
    public abstract void method468(int arg0);

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "()Lfg;")
    public abstract class77 method462();

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "()Lfg;")
    public abstract class77 method466();

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "()I")
    public abstract int method469();
}
