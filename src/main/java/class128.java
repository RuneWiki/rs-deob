import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class128 {

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "Lsa;")
    public class137 field2483 = new class137();

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "Lad;")
    public static class43 field2488 = new class43(64);

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
    public static int field2492 = -2;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "Lhh;")
    private static class163 field2491 = class137.method1065("Close", 17);

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "Lhh;")
    public static class163 field2494 = class137.method1065(")4g", 17);

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "[I")
    public static int[] field2495 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "J")
    public static long field2498 = 0L;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "Lhh;")
    public static class163 field2489 = field2491;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "Lsa;")
    private class137 field2499;

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "Lfj;")
    public static class90 field2496;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)Lsa;")
    public final class137 method1013(byte arg0) {
        field2482++;
        class137 var2 = this.field2499;
        if (arg0 != 21) {
            field2491 = null;
        }
        if (this.field2483 == var2) {
            this.field2499 = null;
            return null;
        } else {
            this.field2499 = var2.field2648;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZLsa;)V")
    public final void method1014(boolean arg0, class137 arg1) {
        if (arg1.field2648 != null) {
            arg1.method1063(90);
        }
        arg1.field2645 = this.field2483.field2645;
        arg1.field2648 = this.field2483;
        arg1.field2648.field2645 = arg1;
        if (!arg0) {
            arg1.field2645.field2648 = arg1;
            field2490++;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)I")
    public final int method1015(int arg0) {
        if (arg0 != -14406) {
            return 93;
        }
        field2484++;
        int var2 = 0;
        class137 var3 = this.field2483.field2645;
        while (this.field2483 != var3) {
            var3 = var3.field2645;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(B)Lsa;")
    public final class137 method1016(byte arg0) {
        field2486++;
        if (arg0 != -31) {
            field2491 = null;
        }
        class137 var2 = this.field2499;
        if (this.field2483 == var2) {
            this.field2499 = null;
            return null;
        } else {
            this.field2499 = var2.field2645;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)Lsa;")
    public final class137 method1017(int arg0) {
        field2487++;
        if (arg0 <= 40) {
            return null;
        }
        class137 var2 = this.field2483.field2645;
        if (this.field2483 == var2) {
            this.field2499 = null;
            return null;
        } else {
            this.field2499 = var2.field2645;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BLsa;)V")
    public final void method1018(byte arg0, class137 arg1) {
        if (arg0 < 61) {
            this.method1022(false);
        }
        field2500++;
        if (arg1.field2648 != null) {
            arg1.method1063(108);
        }
        arg1.field2645 = this.field2483;
        arg1.field2648 = this.field2483.field2648;
        arg1.field2648.field2645 = arg1;
        arg1.field2645.field2648 = arg1;
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(B)Lsa;")
    public final class137 method1019(byte arg0) {
        if (arg0 != -5) {
            field2495 = null;
        }
        field2485++;
        class137 var2 = this.field2483.field2645;
        if (this.field2483 == var2) {
            return null;
        } else {
            var2.method1063(115);
            return var2;
        }
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)V")
    public static void method1020(int arg0) {
        field2491 = null;
        field2494 = null;
        field2488 = null;
        if (arg0 != 15288) {
            method1020(65);
        }
        field2496 = null;
        field2489 = null;
        field2495 = null;
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "(B)V")
    public final void method1021(byte arg0) {
        int var2 = 18 / ((arg0 + 2) / 45);
        while (true) {
            class137 var3 = this.field2483.field2645;
            if (this.field2483 == var3) {
                field2497++;
                this.field2499 = null;
                return;
            }
            var3.method1063(124);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)Lsa;")
    public final class137 method1022(boolean arg0) {
        field2493++;
        class137 var2 = this.field2483.field2648;
        if (arg0) {
            return null;
        } else if (this.field2483 == var2) {
            this.field2499 = null;
            return null;
        } else {
            this.field2499 = var2.field2648;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
    public class128() {
        this.field2483.field2645 = this.field2483;
        this.field2483.field2648 = this.field2483;
    }
}
