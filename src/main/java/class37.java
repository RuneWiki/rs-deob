import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class37 extends class164 implements class351 {

    @OriginalMember(owner = "client!ec", name = "E", descriptor = "Ltd;")
    public class107 field594;

    @OriginalMember(owner = "client!ec", name = "Q", descriptor = "Z")
    private boolean field605;

    @OriginalMember(owner = "client!ec", name = "A", descriptor = "Lwe;")
    public static class24 field590 = new class24(64);

    @OriginalMember(owner = "client!ec", name = "N", descriptor = "I")
    public static int field603 = 0;

    @OriginalMember(owner = "client!ec", name = "B", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!ec", name = "C", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!ec", name = "D", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!ec", name = "F", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!ec", name = "G", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!ec", name = "H", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!ec", name = "I", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!ec", name = "K", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!ec", name = "L", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!ec", name = "M", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!ec", name = "S", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!ec", name = "T", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!ec", name = "U", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!ec", name = "O", descriptor = "Lor;")
    public static class296 field604;

    @OriginalMember(owner = "client!ec", name = "R", descriptor = "[[[B")
    public static byte[][][] field606;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BILnr;)Lqc;")
    public final class95 method147(byte arg0, int arg1, class437 arg2) {
        int var4 = 99 % ((arg0 - -32) / 61);
        ++field602;
        return this.field594.method739(arg1, arg2, 0, 0, false, false, -73);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)Z")
    public final boolean method146(byte arg0) {
        if (arg0 <= 102) {
            this.method156((class437) null, true);
        }
        ++field593;
        return this.field594.method743(-1724944720);
    }

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "(I)I")
    public final int method293(int arg0) {
        int var2 = -37 / ((39 - arg0) / 50);
        ++field596;
        return this.field594.method748((byte) -39);
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(Lnr;Z)Lg;")
    public final class433 method145(class437 arg0, boolean arg1) {
        ++field591;
        class95 var3 = this.field594.method739(1024, arg0, super.field2132, super.field2135, true, false, 75);
        if (var3 == null) {
            return null;
        } else {
            class116 var4 = arg0.method2026();
            var4.method809(super.field2133 + super.field2132, super.field2129, super.field2135 + super.field2127);
            class433 var5 = null;
            if (this.field605) {
                var5 = class436.method2758(1, 12300);
            }
            if (this.field594.field1468 != null) {
                class125 var6 = this.field594.field1468.method1783();
                arg0.method2162(var3, var6, var4, var5 != null ? var5.field6381[0] : null, 0);
            } else {
                var3.method602(var4, var5 == null ? null : var5.field6381[0], 0);
            }
            this.field594.method738(super.field2132 >> 7, true, super.field2135 >> 7, var3, arg0, super.field2135 >> 7, arg1, super.field2132 >> 7);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(B)I")
    public final int method148(byte arg0) {
        if (arg0 != -68) {
            field590 = null;
        }
        ++field608;
        return this.field594.field1458;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lnr;I)V")
    public final void method161(class437 arg0, int arg1) {
        ++field598;
        if (arg1 != 0) {
            this.method148((byte) 56);
        }
        class95 var3 = this.field594.method739(131072, arg0, super.field2132, super.field2135, true, false, arg1 ^ 104);
        if (var3 != null) {
            this.field594.method738(super.field2132 >> 7, false, super.field2135 >> 7, var3, arg0, super.field2135 >> 7, false, super.field2132 >> 7);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V")
    public static void method294(boolean arg0) {
        field604 = null;
        if (arg0) {
            method294(true);
        }
        field590 = null;
        field606 = null;
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(B)V")
    public final void method158(byte arg0) {
        if (arg0 != 6) {
            this.field594 = null;
        }
        ++field607;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)I")
    public final int method160(int arg0) {
        ++field601;
        if (arg0 != -22056) {
            this.method146((byte) 117);
        }
        return this.field594.field1456;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)I")
    public final int method150(byte arg0) {
        if (arg0 >= -110) {
            return -89;
        } else {
            ++field600;
            return this.field594.field1455;
        }
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lnr;Lta;IIIIIIIZIIII)V")
    public class37(class437 arg0, class404 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg6, arg7, arg8, arg10, arg11, arg12, class335.method2225(arg2, arg3, true));
        this.field594 = new class107(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg13);
        this.field605 = ~arg1.field6009 != -1 && !arg9;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lnr;Z)V")
    public final void method156(class437 arg0, boolean arg1) {
        if (arg1) {
            field604 = null;
        }
        this.field594.method742(arg0, 4);
        ++field592;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILnr;II)Z")
    public final boolean method159(int arg0, class437 arg1, int arg2, int arg3) {
        ++field597;
        class95 var5 = this.field594.method739(65536, arg1, super.field2132, super.field2135, false, false, -23);
        if (arg3 < 12) {
            this.method160(-97);
        }
        if (var5 == null) {
            return false;
        } else {
            class116 var6 = arg1.method2026();
            var6.method809(super.field2133 + super.field2132, super.field2129, super.field2135 - -super.field2127);
            return var5.method619(arg2, arg0, var6, false);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILnr;)V")
    public final void method154(int arg0, class437 arg1) {
        this.field594.method749(arg1, (byte) -5);
        if (arg0 != 25510) {
            this.method160(-120);
        }
        ++field595;
    }
}
