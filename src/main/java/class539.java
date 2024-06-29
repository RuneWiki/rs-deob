import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class539 {

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public static int field7310 = -1;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field7312 = 0;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "Lsu;")
    public static class192 field7307 = new class192();

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "Lhs;")
    public static class295 field7316 = new class295(7, 1);

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
    public static int field7317 = 1;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field7308;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field7309;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field7313;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public static int field7314;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "J")
    public long field7311;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "Lia;")
    public class539 field7306;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "Lia;")
    public class539 field7315;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V")
    public static final void method2968(int arg0) {
        field7313++;
        int var1 = 0;
        int var2 = 120 / ((arg0 - 45) / 47);
        while (var1 < 5) {
            class459.field6496[var1] = false;
            var1++;
        }
        class648.field9190 = 0;
        class292.field4398 = -1;
        class576.field7745 = 0;
        class24.field326 = -1;
        class670.field9445 = 1;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)Z")
    public static final boolean method2969(int arg0, int arg1, int arg2) {
        field7308++;
        if (arg2 != 1024) {
            field7312 = -121;
        }
        return (arg1 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V")
    public static void method2970(boolean arg0) {
        field7307 = null;
        if (arg0) {
            method2968(109);
        }
        field7316 = null;
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "(I)V")
    public final void method2971(int arg0) {
        field7314++;
        if (this.field7306 == null) {
            return;
        }
        this.field7306.field7315 = this.field7315;
        this.field7315.field7306 = this.field7306;
        if (arg0 != 1) {
            method2968(-82);
        }
        this.field7306 = null;
        this.field7315 = null;
    }

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)Z")
    public final boolean method2972(int arg0) {
        field7309++;
        if (this.field7306 == null) {
            return false;
        } else if (arg0 == 1) {
            return true;
        } else {
            return true;
        }
    }
}
