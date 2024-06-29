import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class334 extends class669 {

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "F")
    private float field4584 = 0.0F;

    @OriginalMember(owner = "client!vh", name = "v", descriptor = "Lmca;")
    private class29 field4588;

    @OriginalMember(owner = "client!vh", name = "x", descriptor = "[[I")
    public static int[][] field4590 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "Lgj;")
    public static class593 field4582 = new class593();

    @OriginalMember(owner = "client!vh", name = "y", descriptor = "[I")
    public static int[] field4591 = new int[1];

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!vh", name = "u", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!vh", name = "w", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "Ltn;")
    public static class80 field4580;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "(I)V")
    public final void method6(int arg0) {
        ++field4581;
        super.field9490.method845(1, -46);
        super.field9490.method909(class521.field6963, -124, class521.field6963);
        super.field9490.method859((byte) 29, class350.field4792, 0);
        super.field9490.method828(109, class350.field4792, 0);
        super.field9490.method84(1, 22344);
        if (arg0 != -21106) {
            this.field4584 = 1.006065F;
        }
        super.field9490.method897((class430) null, true);
        super.field9490.method845(0, -70);
        super.field9490.method828(95, class350.field4792, 0);
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lej;Lmca;)V")
    public class334(class111 arg0, class29 arg1) {
        super(arg0);
        this.field4588 = arg1;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IILnq;)V")
    public final void method7(int arg0, int arg1, class430 arg2) {
        if (arg1 == -21254) {
            super.field9490.method897(arg2, true);
            ++field4589;
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)Z")
    public final boolean method1(int arg0) {
        if (arg0 != 9567) {
            return false;
        } else {
            ++field4587;
            return this.field4588.method246(16);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
    public final void method1978(int arg0) {
        if (super.field9490.method889(106) == 0) {
            class74 var2 = super.field9490.method830((byte) 90);
            super.field9490.method845(1, 122);
            class74 var3 = super.field9490.method879(0);
            var3.method560(var2);
            var3.method556((byte) 9, 1.0F, 0.125F, 0.125F);
            var3.method568(this.field4584, 0.0F, 82, 0.0F);
            super.field9490.method866(5758, class64.field979);
            super.field9490.method845(0, 125);
        }
        int var4 = -33 % ((57 - arg0) / 42);
        ++field4579;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BII)V")
    public final void method2(byte arg0, int arg1, int arg2) {
        super.field9490.method845(1, 126);
        ++field4585;
        if (arg0 < 77) {
            field4590 = null;
        }
        if ((128 & arg2) != 0) {
            super.field9490.method897((class430) null, true);
        } else if (~(arg1 & 1) == -2) {
            if (this.field4588.field472) {
                this.field4584 = (float) (super.field9490.field1838 % 4000) / 4000.0F;
                super.field9490.method897(this.field4588.field471, true);
            } else {
                int var4 = super.field9490.field1838 % 4000 * 16 / 4000;
                super.field9490.method897(this.field4588.field474[var4], true);
            }
        } else if (this.field4588.field472) {
            super.field9490.method897(this.field4588.field471, true);
        } else {
            super.field9490.method897(this.field4588.field474[0], true);
        }
        super.field9490.method845(0, -29);
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(Z)V")
    public static void method1979(boolean arg0) {
        field4582 = null;
        field4591 = null;
        field4580 = null;
        if (!arg0) {
            method1979(true);
        }
        field4590 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZZ)V")
    public final void method5(boolean arg0, boolean arg1) {
        ++field4583;
        super.field9490.method845(1, -121);
        super.field9490.method909(class32.field520, -124, class586.field7773);
        super.field9490.method60(1, 0, true, arg1, class350.field4792);
        super.field9490.method828(63, class291.field4117, 0);
        super.field9490.method84(0, 22344);
        super.field9490.method845(0, 120);
        super.field9490.method865(-16777216, -83);
        super.field9490.method828(71, class149.field2382, 0);
        this.method1978(106);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZI)V")
    public final void method4(boolean arg0, int arg1) {
        ++field4586;
        if (arg1 != 9512) {
            this.method5(true, false);
        }
        super.field9490.method909(class521.field6963, -118, class586.field7773);
    }
}
