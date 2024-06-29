import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class195 {

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "Ldv;")
    public class608 field2529 = new class608();

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "[I")
    public static int[] field2532 = new int[14];

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "Z")
    public static boolean field2530 = false;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "Lpaa;")
    public static class317 field2533 = new class317(0, -1);

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "Ldv;")
    private class608 field2535;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IB)I")
    public static final int method1247(int arg0, byte arg1) {
        field2525++;
        return arg1 == -18 ? arg0 >>> 10 : 127;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)Z")
    public static final boolean method1248(int arg0, int arg1, int arg2) {
        field2526++;
        int var3 = -121 / ((arg0 - 4) / 39);
        return false;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V")
    public static void method1249(byte arg0) {
        field2532 = null;
        field2533 = null;
        if (arg0 >= -121) {
            method1251(-90);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)I")
    public final int method1250(boolean arg0) {
        if (!arg0) {
            this.field2535 = null;
        }
        field2527++;
        int var2 = 0;
        class608 var3 = this.field2529.field8742;
        while (this.field2529 != var3) {
            var3 = var3.field8742;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
    public static final void method1251(int arg0) {
        field2528++;
        if (class294.field3824 == 6) {
            class294.field3824 = arg0;
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)Ldv;")
    public final class608 method1252(int arg0) {
        if (arg0 != 0) {
            field2533 = null;
        }
        field2538++;
        class608 var2 = this.field2535;
        if (this.field2529 == var2) {
            this.field2535 = null;
            return null;
        } else {
            this.field2535 = var2.field8742;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZLdv;)V")
    public final void method1253(boolean arg0, class608 arg1) {
        if (!arg0) {
            this.method1250(true);
        }
        field2537++;
        if (arg1.field8739 != null) {
            arg1.method3482(7744);
        }
        arg1.field8742 = this.field2529;
        arg1.field8739 = this.field2529.field8739;
        arg1.field8739.field8742 = arg1;
        arg1.field8742.field8739 = arg1;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(Z)Ldv;")
    public final class608 method1254(boolean arg0) {
        field2536++;
        class608 var2 = this.field2529.field8742;
        if (this.field2529 == var2) {
            this.field2535 = null;
            return null;
        }
        if (arg0) {
            method1248(73, 88, -113);
        }
        this.field2535 = var2.field8742;
        return var2;
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)V")
    public final void method1255(int arg0) {
        field2531++;
        while (true) {
            class608 var2 = this.field2529.field8742;
            if (this.field2529 == var2) {
                int var3 = 7 / ((arg0 + 58) / 62);
                this.field2535 = null;
                return;
            }
            var2.method3482(7744);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZLbl;)Z")
    public static final boolean method1256(boolean arg0, class297 arg1) {
        field2534++;
        if (arg1 == null) {
            return false;
        }
        if (!arg0) {
            field2532 = null;
        }
        if (!arg1.field3869) {
            return false;
        } else if (!arg1.method1822((byte) -109, class614.field8828)) {
            return false;
        } else if (class163.field2072.method3476((long) arg1.field3882, (byte) 28) == null) {
            return class464.field6599.method3476((long) arg1.field3859, (byte) 28) == null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
    public class195() {
        this.field2529.field8742 = this.field2529;
        this.field2529.field8739 = this.field2529;
    }
}
