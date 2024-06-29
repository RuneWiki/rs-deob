import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public abstract class class50 extends class498 {

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "Lih;")
    public class503 field611;

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!qh", name = "s", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!qh", name = "t", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!qh", name = "u", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!qh", name = "v", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "Lhp;")
    public static class219 field608;

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "Loi;")
    public static class53 field610;

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "Z")
    public boolean field612;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIII)V", line = 8)
    public static final void method394(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            field616++;
            class251 var4 = class140.field1843[arg3][arg1];
            class75.method580(var4 == null ? class43.field497 : var4, arg2 ^ 0xFFFF9110, arg0);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V", line = 26)
    public static void method396(byte arg0) {
        field608 = null;
        if (arg0 <= 111) {
            field608 = null;
        }
        field610 = null;
    }

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "(I)Z", line = 40)
    public final boolean method399(int arg0) {
        if (arg0 != 0) {
            this.field611 = null;
        }
        field615++;
        return false;
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lih;)V", line = 51)
    public class50(class503 arg0) {
        this.field611 = arg0;
    }

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "(I)I", line = 59)
    public final int method400(int arg0) {
        field614++;
        int var2 = -1 % ((37 - arg0) / 47);
        return 1;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)I", line = 69)
    public int method401(boolean arg0) {
        if (!arg0) {
            this.method399(10);
        }
        field609++;
        return 0;
    }

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "(I)Z", line = 83)
    public final boolean method403(int arg0) {
        field613++;
        if (arg0 != 1) {
            this.method400(99);
        }
        return this.field612;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)V")
    public abstract void method393(int arg0, byte arg1);

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)Z")
    public abstract boolean method395(int arg0);

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "(I)Z")
    public abstract boolean method397(int arg0);

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)V")
    public abstract void method398(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)V")
    public abstract void method402(byte arg0);

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lgu;ILgu;I)V")
    public abstract void method404(class417 arg0, int arg1, class417 arg2, int arg3);
}
