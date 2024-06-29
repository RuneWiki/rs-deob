import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public abstract class class52 extends class376 {

    @OriginalMember(owner = "client!ps", name = "n", descriptor = "Lhj;")
    public class338 field777;

    @OriginalMember(owner = "client!ps", name = "m", descriptor = "Z")
    public boolean field776;

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "(I)Z", line = 4)
    public final boolean method347(int arg0) {
        return arg0 >= -17;
    }

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "(B)Z", line = 18)
    public final boolean method350(byte arg0) {
        return arg0 > -19 ? true : this.field776;
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lhj;)V", line = 26)
    public class52(class338 arg0) {
        this.field777 = arg0;
    }

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "()I", line = 39)
    public int method354() {
        return 0;
    }

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "(I)I", line = 46)
    public final int method355(int arg0) {
        if (arg0 != 1) {
            this.field776 = false;
        }
        return 1;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "()V")
    public abstract void method348();

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "()Z")
    public abstract boolean method349();

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(ILrq;Lrq;)V")
    public abstract void method351(int arg0, class195 arg1, class195 arg2);

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(II)V")
    public abstract void method352(int arg0, int arg1);

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "()Z")
    public abstract boolean method353();

    @OriginalMember(owner = "client!ps", name = "e", descriptor = "(I)V")
    public abstract void method356(int arg0);
}
