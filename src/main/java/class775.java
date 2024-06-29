import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class775 {

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "Lhf;")
    private class413 field10676;

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "I")
    public static int field10675;

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "I")
    public static int field10677;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "Lsu;")
    private class219 field10673;

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "Lvaa;")
    public static class492 field10674;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)Lsu;")
    public final class219 method4249(byte arg0) {
        field10677++;
        class219 var2 = this.field10673;
        if (arg0 < 110) {
            this.method4250(-5);
        }
        if (this.field10676.field5842 == var2) {
            this.field10673 = null;
            return null;
        } else {
            this.field10673 = var2.field3126;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)Lsu;")
    public final class219 method4250(int arg0) {
        field10675++;
        if (arg0 != 10581) {
            this.field10673 = null;
        }
        class219 var2 = this.field10676.field5842.field3126;
        if (this.field10676.field5842 == var2) {
            this.field10673 = null;
            return null;
        } else {
            this.field10673 = var2.field3126;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)V")
    public static void method4251(int arg0) {
        if (arg0 != -7648) {
            field10674 = null;
        }
        field10674 = null;
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "()V")
    public class775() {
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lhf;)V")
    public class775(class413 arg0) {
        this.field10676 = arg0;
    }
}
