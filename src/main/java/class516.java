import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public class class516 extends class354 {

    @OriginalMember(owner = "client!nga", name = "m", descriptor = "I")
    public static int field7234 = 0;

    @OriginalMember(owner = "client!nga", name = "n", descriptor = "F")
    public static float field7235;

    @OriginalMember(owner = "client!nga", name = "h", descriptor = "I")
    public static int field7229;

    @OriginalMember(owner = "client!nga", name = "j", descriptor = "I")
    public static int field7231;

    @OriginalMember(owner = "client!nga", name = "k", descriptor = "I")
    public static int field7232;

    @OriginalMember(owner = "client!nga", name = "l", descriptor = "I")
    public static int field7233;

    @OriginalMember(owner = "client!nga", name = "p", descriptor = "I")
    public static int field7237;

    @OriginalMember(owner = "client!nga", name = "q", descriptor = "I")
    public static int field7238;

    @OriginalMember(owner = "client!nga", name = "o", descriptor = "Lqba;")
    public static class409 field7236;

    @OriginalMember(owner = "client!nga", name = "i", descriptor = "Ltl;")
    public static class621 field7230;

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "(II)I")
    public final int method391(int arg0, int arg1) {
        if (arg0 != 3) {
            field7235 = 0.09142739F;
        }
        ++field7237;
        if (super.field4544.method4149((byte) 33)) {
            return 3;
        } else {
            return super.field4544.method4153(-9) == class211.field2791 ? 1 : 3;
        }
    }

    @OriginalMember(owner = "client!nga", name = "c", descriptor = "(I)Z")
    public final boolean method3000(int arg0) {
        ++field7232;
        if (super.field4544.method4149((byte) 33)) {
            return false;
        } else {
            int var2 = -8 / ((arg0 - -34) / 41);
            return super.field4544.method4153(-9) == class211.field2791;
        }
    }

    @OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(ILwo;)V")
    public class516(int arg0, class746 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Z)V")
    public static void method3001(boolean arg0) {
        field7236 = null;
        if (arg0) {
            field7230 = null;
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(I)V")
    public final void method388(int arg0) {
        ++field7231;
        if (super.field4544.method4153(-9) != class211.field2791) {
            super.field4545 = 1;
        } else if (super.field4544.method4149((byte) 33)) {
            super.field4545 = 0;
        }
        if (~super.field4545 != -1 && ~super.field4545 != -2) {
            super.field4545 = this.method393((byte) -55);
        }
        if (arg0 != 6384) {
            field7236 = null;
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(ILs;)V")
    public static final void method3002(int arg0, class282 arg1) {
        class195.field2669[arg0] = arg1;
    }

    @OriginalMember(owner = "client!nga", name = "c", descriptor = "(II)V")
    public final void method389(int arg0, int arg1) {
        ++field7229;
        super.field4545 = arg1;
        if (arg0 != -1) {
            field7235 = -0.4951775F;
        }
    }

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "(B)I")
    public final int method3003(byte arg0) {
        ++field7233;
        int var2 = 63 % ((arg0 - 7) / 45);
        return super.field4545;
    }

    @OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(Lwo;)V")
    public class516(class746 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(B)I")
    public final int method393(byte arg0) {
        int var2 = 60 / ((37 - arg0) / 63);
        ++field7238;
        return 1;
    }
}
