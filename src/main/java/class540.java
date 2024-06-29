import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class540 {

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "Lke;")
    public static class622 field7584 = new class622(14, -2);

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "I")
    public static int field7579;

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
    public static int field7580;

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
    public static int field7581;

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
    public static int field7582;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "J")
    public long field7577;

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "Ldn;")
    public class540 field7578;

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "Ldn;")
    public class540 field7583;

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "(I)Z")
    public final boolean method3114(int arg0) {
        int var2 = 16 % ((18 - arg0) / 34);
        field7579++;
        return this.field7583 != null;
    }

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "(I)V")
    public static void method3115(int arg0) {
        field7584 = null;
        if (arg0 != -2) {
            method3116(70);
        }
    }

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "(I)V")
    public static final void method3116(int arg0) {
        if (arg0 == 14) {
            field7581++;
            class772.field10654.method2364(1);
        }
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(B)V")
    public final void method3117(byte arg0) {
        int var2 = -59 / ((arg0 + 53) / 32);
        field7580++;
        if (this.field7583 != null) {
            this.field7583.field7578 = this.field7578;
            this.field7578.field7583 = this.field7583;
            this.field7578 = null;
            this.field7583 = null;
        }
    }
}
