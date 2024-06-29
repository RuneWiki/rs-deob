import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public abstract class class5 extends class12 {

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "Z")
    public volatile boolean field131 = true;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "I")
    public int field132;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "Ld;")
    public class22 field130;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "Lad;")
    public class5 field129;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "()I")
    public abstract int method47();

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([III)V")
    public abstract void method48(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
    public abstract void method49(int arg0);

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "()Lad;")
    public abstract class5 method50();

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "()I")
    public int method51() {
        return 255;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "([III)V")
    public final void method52(int[] arg0, int arg1, int arg2) {
        if (this.field131) {
            this.method48(arg0, arg1, arg2);
        } else {
            this.method49(arg2);
        }
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "()Lad;")
    public abstract class5 method53();
}
