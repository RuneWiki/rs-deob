import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public abstract class class529 extends class333 {

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "Z")
    public volatile boolean field7450 = true;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    public int field7447;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "Lwea;")
    public class261 field7449;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "Lnj;")
    public class529 field7448;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "([III)V")
    public abstract void method495(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "()I")
    public abstract int method497();

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "()Lnj;")
    public abstract class529 method505();

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "()I")
    public int method2973() {
        return 255;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
    public abstract void method490(int arg0);

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "([III)V")
    public final void method2974(int[] arg0, int arg1, int arg2) {
        if (this.field7450) {
            this.method495(arg0, arg1, arg2);
        } else {
            this.method490(arg2);
        }
    }

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "()Lnj;")
    public abstract class529 method521();
}
