import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public abstract class class213 extends class206 {

    @OriginalMember(owner = "client!fq", name = "m", descriptor = "Z")
    public volatile boolean field3264 = true;

    @OriginalMember(owner = "client!fq", name = "l", descriptor = "I")
    public int field3263;

    @OriginalMember(owner = "client!fq", name = "j", descriptor = "Lfq;")
    public class213 field3262;

    @OriginalMember(owner = "client!fq", name = "k", descriptor = "Liha;")
    public class32 field3261;

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "()I", line = 3)
    public int method1870() {
        return 255;
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "([III)V", line = 7)
    public final void method1871(int[] arg0, int arg1, int arg2) {
        if (this.field3264) {
            this.method1156(arg0, arg1, arg2);
        } else {
            this.method1160(arg2);
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "()Lfq;")
    public abstract class213 method1151();

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "()Lfq;")
    public abstract class213 method1158();

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "([III)V")
    public abstract void method1156(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "()I")
    public abstract int method1152();

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
    public abstract void method1160(int arg0);
}
