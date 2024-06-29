import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class195 {

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "Lns;")
    private class406 field2329;

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "I")
    public static int field2330 = 0;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!pq", name = "h", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "Lofa;")
    public static class332 field2333;

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "Ltm;")
    private class392 field2332;

    @OriginalMember(owner = "client!pq", name = "g", descriptor = "[[[Llha;")
    public static class624[][][] field2334;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)V", line = 8)
    public static void method1082(int arg0) {
        if (arg0 == 0) {
            field2333 = null;
            field2334 = null;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Z)Ltm;", line = 20)
    public final class392 method1083(boolean arg0) {
        if (!arg0) {
            return null;
        }
        field2335++;
        class392 var2 = this.field2329.field5735.field5555;
        if (this.field2329.field5735 == var2) {
            this.field2332 = null;
            return null;
        } else {
            this.field2332 = var2.field5555;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)Ltm;", line = 49)
    public final class392 method1084(int arg0) {
        if (arg0 != 0) {
            method1082(-48);
        }
        field2328++;
        class392 var2 = this.field2332;
        if (this.field2329.field5735 == var2) {
            this.field2332 = null;
            return null;
        } else {
            this.field2332 = var2.field5555;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "()V", line = 68)
    public class195() {
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lns;)V", line = 74)
    public class195(class406 arg0) {
        this.field2329 = arg0;
    }
}
