import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class2 implements class203 {

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V", line = 3)
    public final void method11(int arg0) {
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "()V", line = 5)
    public final void method12() {
        if (class308.field5243) {
            class55.method399(true);
        }
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "()V", line = 10)
    public final void method13() {
        if (class308.field5243) {
            class55.method399(false);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "()I", line = 15)
    public final int method14() {
        return 0;
    }
}
