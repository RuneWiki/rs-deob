import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public abstract class class608 extends class593 {

    @OriginalMember(owner = "client!iq", name = "F", descriptor = "Loo;")
    public static class629 field8601 = new class629(0, 3);

    @OriginalMember(owner = "client!iq", name = "J", descriptor = "Lqe;")
    public static class469 field8605 = new class469(28, 2);

    @OriginalMember(owner = "client!iq", name = "N", descriptor = "I")
    public static int field8609 = -1;

    @OriginalMember(owner = "client!iq", name = "M", descriptor = "Loo;")
    public static class629 field8608 = new class629(6, 5);

    @OriginalMember(owner = "client!iq", name = "z", descriptor = "I")
    public static int field8595;

    @OriginalMember(owner = "client!iq", name = "A", descriptor = "I")
    public static int field8596;

    @OriginalMember(owner = "client!iq", name = "B", descriptor = "I")
    public static int field8597;

    @OriginalMember(owner = "client!iq", name = "C", descriptor = "I")
    public static int field8598;

    @OriginalMember(owner = "client!iq", name = "D", descriptor = "I")
    public static int field8599;

    @OriginalMember(owner = "client!iq", name = "E", descriptor = "I")
    public static int field8600;

    @OriginalMember(owner = "client!iq", name = "G", descriptor = "I")
    public static int field8602;

    @OriginalMember(owner = "client!iq", name = "H", descriptor = "I")
    public static int field8603;

    @OriginalMember(owner = "client!iq", name = "I", descriptor = "I")
    public static int field8604;

    @OriginalMember(owner = "client!iq", name = "K", descriptor = "I")
    public static int field8606;

    @OriginalMember(owner = "client!iq", name = "L", descriptor = "I")
    public static int field8607;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)V")
    public static void method3526(byte arg0) {
        if (arg0 == 29) {
            field8601 = null;
            field8605 = null;
            field8608 = null;
        }
    }

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "(I)Z")
    public final boolean method85(int arg0) {
        ++field8598;
        int var2 = 41 % ((16 - arg0) / 58);
        return class464.field6819[(super.field8423 >> class459.field6769) - (-class60.field843 + class736.field10315)][(super.field8428 >> class459.field6769) - class116.field1600 - -class60.field843];
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lsca;I)Lsca;")
    public static final class46 method3527(class46 arg0, int arg1) {
        ++field8606;
        if (arg1 != 28) {
            field8601 = null;
        }
        class46 var2 = client.method1887(arg0);
        if (var2 == null) {
            var2 = arg0.field593;
        }
        return var2;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILvs;ZILha;II)V")
    public final void method737(int arg0, class593 arg1, boolean arg2, int arg3, class60 arg4, int arg5, int arg6) {
        ++field8604;
        if (arg0 == 8616) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)V")
    public static final void method3528(int arg0) {
        if (arg0 != 1) {
            method3526((byte) 111);
        }
        ++field8603;
        class645.field9099 = true;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(I[Lraa;)I")
    public final int method84(int arg0, class609[] arg1) {
        ++field8597;
        return arg0 <= 24 ? 111 : this.method3463(super.field8428 >> class459.field6769, arg1, false, super.field8423 >> class459.field6769);
    }

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "(I)V")
    public final void method741(int arg0) {
        ++field8599;
        if (arg0 < -93) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(Lha;I)Z")
    public final boolean method79(class60 arg0, int arg1) {
        ++field8602;
        if (arg1 != 9721) {
            field8608 = null;
        }
        class754 var3 = class149.method1105(super.field8429, super.field8423 >> class459.field6769, super.field8428 >> class459.field6769);
        return var3 != null && var3.field10542.field1629 ? class573.method3317(var3.field10542.method315((byte) 106) + this.method315((byte) 106), (byte) 66, super.field8429, super.field8428 >> class459.field6769, super.field8423 >> class459.field6769) : class361.method2249(super.field8428 >> class459.field6769, 64, super.field8423 >> class459.field6769, super.field8429);
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(IIIII)V")
    public class608(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super.field8417 = (byte) arg4;
        super.field8423 = arg0;
        super.field8428 = arg2;
        super.field8429 = (byte) arg3;
        super.field8421 = arg1;
    }

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "(B)Z")
    public final boolean method738(byte arg0) {
        if (arg0 != 88) {
            method3529(99, -82, -79);
        }
        ++field8600;
        return false;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(III)Lma;")
    public static final class12 method3529(int arg0, int arg1, int arg2) {
        class186 var3 = class80.field1136[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2834;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIIIBII)I")
    public static final int method3530(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        if (~(arg0 & 1) == -2) {
            int var7 = arg2;
            arg2 = arg5;
            arg5 = var7;
        }
        if (arg4 != 51) {
            method3528(13);
        }
        int var8 = arg3 & 3;
        ++field8595;
        if (~var8 == -1) {
            return arg1;
        } else if (~var8 == -2) {
            return arg6;
        } else {
            return ~var8 == -3 ? -arg1 + -arg2 + 1 + 7 : 8 - arg6 + -arg5;
        }
    }
}
