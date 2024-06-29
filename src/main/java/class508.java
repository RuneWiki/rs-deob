import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class508 extends class329 {

    @OriginalMember(owner = "client!pp", name = "q", descriptor = "I")
    public static int field6879 = 0;

    @OriginalMember(owner = "client!pp", name = "k", descriptor = "I")
    public static int field6873;

    @OriginalMember(owner = "client!pp", name = "p", descriptor = "I")
    public static int field6878;

    @OriginalMember(owner = "client!pp", name = "r", descriptor = "I")
    public static int field6880;

    @OriginalMember(owner = "client!pp", name = "l", descriptor = "J")
    public long field6874;

    @OriginalMember(owner = "client!pp", name = "n", descriptor = "Lpp;")
    public class508 field6876;

    @OriginalMember(owner = "client!pp", name = "o", descriptor = "Lpp;")
    public class508 field6877;

    @OriginalMember(owner = "client!pp", name = "m", descriptor = "[Lfe;")
    public static class202[] field6875;

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(I)V")
    public static void method2742(int arg0) {
        field6875 = null;
        if (arg0 >= -115) {
            method2742(119);
        }
    }

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "(I)Z")
    public final boolean method2743(int arg0) {
        field6878++;
        int var2 = -39 / ((arg0 + 52) / 56);
        return this.field6877 != null;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)V")
    public final void method2744(byte arg0) {
        field6873++;
        if (this.field6877 == null) {
            return;
        }
        this.field6877.field6876 = this.field6876;
        if (arg0 >= -48) {
            this.method2743(-5);
        }
        this.field6876.field6877 = this.field6877;
        this.field6876 = null;
        this.field6877 = null;
    }
}
