import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class392 extends class260 {

    @OriginalMember(owner = "client!wu", name = "n", descriptor = "Lso;")
    public static class494 field5395 = new class494(1350);

    @OriginalMember(owner = "client!wu", name = "h", descriptor = "I")
    public static int field5389;

    @OriginalMember(owner = "client!wu", name = "i", descriptor = "I")
    public static int field5390;

    @OriginalMember(owner = "client!wu", name = "j", descriptor = "I")
    public static int field5391;

    @OriginalMember(owner = "client!wu", name = "k", descriptor = "I")
    public static int field5392;

    @OriginalMember(owner = "client!wu", name = "l", descriptor = "I")
    public static int field5393;

    @OriginalMember(owner = "client!wu", name = "m", descriptor = "I")
    public static int field5394;

    @OriginalMember(owner = "client!wu", name = "o", descriptor = "I")
    public static int field5396;

    @OriginalMember(owner = "client!wu", name = "p", descriptor = "I")
    public static int field5397;

    @OriginalMember(owner = "client!wu", name = "r", descriptor = "I")
    public static int field5399;

    @OriginalMember(owner = "client!wu", name = "q", descriptor = "[[I")
    public static int[][] field5398;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)V", line = 3)
    public final void method126(int arg0) {
        if (super.field3829.field10098.method1591(113) && !class613.method3561(super.field3829.field10098.method1588(-59), -1)) {
            super.field3828 = 0;
        }
        ++field5392;
        if (super.field3828 < 0 || ~super.field3828 < -2) {
            super.field3828 = this.method123(4377);
        }
        if (arg0 < 102) {
            field5395 = null;
        }
    }

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "(II)I", line = 21)
    public final int method129(int arg0, int arg1) {
        ++field5391;
        return !class613.method3561(super.field3829.field10098.method1588(arg0 ^ 69), arg0) ? 3 : 1;
    }

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Lgn;)V", line = 32)
    public class392(class729 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "(I)V", line = 36)
    public static void method2425(int arg0) {
        if (arg0 != 0) {
            field5398 = null;
        }
        field5395 = null;
        field5398 = null;
    }

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(ILgn;)V", line = 47)
    public class392(int arg0, class729 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "(I)I", line = 50)
    public final int method2426(int arg0) {
        if (arg0 > -14) {
            return 107;
        } else {
            ++field5394;
            return super.field3828;
        }
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(I)I", line = 61)
    public final int method123(int arg0) {
        ++field5389;
        if (arg0 != 4377) {
            field5395 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(III)V", line = 74)
    public static final void method2427(int arg0, int arg1, int arg2) {
        ++field5399;
        if (arg1 > -82) {
            method2425(99);
        }
        class67.field823 = -class117.field1806 + arg2;
        class138.field2063 = -class117.field1804 + arg0;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IB)V", line = 88)
    public final void method128(int arg0, byte arg1) {
        super.field3828 = arg0;
        ++field5390;
        if (arg1 != 122) {
            this.method128(127, (byte) 83);
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIIBI)Z", line = 107)
    public static final boolean method2428(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        ++field5396;
        if (arg4 < 36) {
            method2427(-120, 63, -61);
        }
        for (int var6 = arg3; arg2 >= var6; ++var6) {
            for (int var7 = arg5; arg0 >= var7; ++var7) {
                if (~class663.field9226[var6][var7] == ~arg1 && class9.field81[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wu", name = "f", descriptor = "(I)Z", line = 140)
    public final boolean method2429(int arg0) {
        ++field5393;
        if (arg0 < 73) {
            this.method2426(81);
        }
        return class613.method3561(super.field3829.field10098.method1588(-83), -1);
    }
}
