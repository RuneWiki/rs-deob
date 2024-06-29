import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public abstract class class437 extends class406 {

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "Lao;")
    public class157 field6280;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "Z")
    public boolean field6279;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(Z)I", line = 4)
    public final int method2732(boolean arg0) {
        return arg0 ? -3 : 1;
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(B)Z", line = 17)
    public final boolean method2735(byte arg0) {
        if (arg0 <= 20) {
            this.method2739(-33);
        }
        return this.field6279;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "()I", line = 29)
    public int method2736() {
        return 0;
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)Z", line = 38)
    public final boolean method2739(int arg0) {
        if (arg0 != -28247) {
            this.field6279 = false;
        }
        return false;
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lao;)V", line = 48)
    public class437(class157 arg0) {
        this.field6280 = arg0;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "()V")
    public abstract void method2733();

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILrj;Lrj;)V")
    public abstract void method2734(int arg0, class354 arg1, class354 arg2);

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V")
    public abstract void method2737(int arg0);

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)V")
    public abstract void method2738(int arg0, int arg1);

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "()Z")
    public abstract boolean method2740();

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "()Z")
    public abstract boolean method2741();
}
