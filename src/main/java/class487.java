import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class487 extends class404 implements class147 {

    @OriginalMember(owner = "client!pt", name = "G", descriptor = "Ls;")
    public class253 field6767;

    @OriginalMember(owner = "client!pt", name = "E", descriptor = "Z")
    private boolean field6765;

    @OriginalMember(owner = "client!pt", name = "A", descriptor = "Lsu;")
    public static class192 field6761 = new class192();

    @OriginalMember(owner = "client!pt", name = "F", descriptor = "[[I")
    public static int[][] field6766 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!pt", name = "u", descriptor = "I")
    public static int field6755;

    @OriginalMember(owner = "client!pt", name = "v", descriptor = "I")
    public static int field6756;

    @OriginalMember(owner = "client!pt", name = "w", descriptor = "I")
    public static int field6757;

    @OriginalMember(owner = "client!pt", name = "x", descriptor = "I")
    public static int field6758;

    @OriginalMember(owner = "client!pt", name = "y", descriptor = "I")
    public static int field6759;

    @OriginalMember(owner = "client!pt", name = "z", descriptor = "I")
    public static int field6760;

    @OriginalMember(owner = "client!pt", name = "B", descriptor = "I")
    public static int field6762;

    @OriginalMember(owner = "client!pt", name = "C", descriptor = "I")
    public static int field6763;

    @OriginalMember(owner = "client!pt", name = "H", descriptor = "I")
    public static int field6768;

    @OriginalMember(owner = "client!pt", name = "I", descriptor = "I")
    public static int field6769;

    @OriginalMember(owner = "client!pt", name = "J", descriptor = "I")
    public static int field6770;

    @OriginalMember(owner = "client!pt", name = "K", descriptor = "I")
    public static int field6771;

    @OriginalMember(owner = "client!pt", name = "L", descriptor = "I")
    public static int field6772;

    @OriginalMember(owner = "client!pt", name = "M", descriptor = "I")
    public static int field6773;

    @OriginalMember(owner = "client!pt", name = "N", descriptor = "I")
    public static int field6774;

    @OriginalMember(owner = "client!pt", name = "D", descriptor = "Lac;")
    private class496 field6764;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Loa;B)Lac;", line = 3)
    public final class496 method551(class638 arg0, byte arg1) {
        if (arg1 >= -62) {
            this.field6767 = null;
        }
        ++field6770;
        return this.field6764;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(ZLoa;)V", line = 14)
    public final void method552(boolean arg0, class638 arg1) {
        ++field6769;
        class352 var3 = this.field6767.method1563(true, arg1, super.field5716, false, super.field5720, 262144, arg0);
        if (var3 != null) {
            int var4 = super.field5716 >> 9;
            int var5 = super.field5720 >> 9;
            class391 var6 = arg1.method401();
            var6.method1288(super.field5716, super.field5717, super.field5720);
            this.field6767.method1565(var4, var6, arg1, var5, 0, var5, var4, false, var3);
        }
    }

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "(I)Z", line = 37)
    public final boolean method562(int arg0) {
        ++field6774;
        if (arg0 != 29008) {
            field6761 = null;
        }
        return this.field6767.method1567((byte) -84);
    }

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "(III)Z", line = 50)
    public static final boolean method2741(int arg0, int arg1, int arg2) {
        if (arg0 < 54) {
            field6761 = null;
        }
        ++field6762;
        return (arg2 & 384) != 0;
    }

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "(BLoa;)V", line = 64)
    public final void method561(byte arg0, class638 arg1) {
        if (arg0 != 111) {
            this.method560(93);
        }
        this.field6767.method1557(arg1, 28393);
        ++field6773;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)I", line = 77)
    public final int method554(int arg0) {
        ++field6759;
        if (arg0 != -18971) {
            field6766 = null;
        }
        return this.field6767.field3569;
    }

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Loa;Llt;IIIIIZIIIIII)V", line = 89)
    public class487(class638 arg0, class620 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg4, arg5, arg6, arg8, arg9, arg10, class233.method1474(arg12, arg11, false));
        this.field6767 = new class253(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
        this.field6765 = ~arg1.field8592 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(BLoa;)V", line = 109)
    public final void method556(byte arg0, class638 arg1) {
        if (arg0 <= 5) {
            method2741(-14, -63, 106);
        }
        this.field6767.method1568(true, arg1);
        ++field6768;
    }

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "(I)V", line = 121)
    public final void method550(int arg0) {
        ++field6772;
        if (arg0 >= -4) {
            this.method575(-72);
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IILoa;)Lba;", line = 132)
    public final class352 method548(int arg0, int arg1, class638 arg2) {
        if (arg0 != -585) {
            field6761 = null;
        }
        ++field6755;
        return this.field6767.method1563(true, arg2, 0, false, 0, arg1, false);
    }

    @OriginalMember(owner = "client!pt", name = "h", descriptor = "(I)I", line = 143)
    public final int method575(int arg0) {
        if (arg0 >= -117) {
            return 114;
        } else {
            ++field6756;
            return this.field6767.method1559((byte) -120);
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IILoa;I)Z", line = 156)
    public final boolean method559(int arg0, int arg1, class638 arg2, int arg3) {
        if (arg1 != -8003) {
            return true;
        } else {
            ++field6771;
            class352 var5 = this.field6767.method1563(true, arg2, super.field5716, false, super.field5720, 131072, false);
            if (var5 == null) {
                return false;
            } else {
                class391 var6 = arg2.method401();
                var6.method1288(super.field5716 - -super.field5715, super.field5717, super.field5720 + super.field5718);
                return var5.method237(arg0, arg3, var6, false);
            }
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILoa;)Lwc;", line = 175)
    public final class60 method555(int arg0, class638 arg1) {
        ++field6763;
        class352 var3 = this.field6767.method1563(true, arg1, super.field5716, false, super.field5720, 2048, true);
        if (var3 == null) {
            return null;
        } else {
            class391 var4 = arg1.method401();
            var4.method1288(super.field5716 - -super.field5715, super.field5717, super.field5720 + super.field5718);
            class60 var5 = null;
            if (this.field6765) {
                var5 = class450.method2583(1, false);
            }
            int var6 = super.field5716 >> 9;
            int var7 = super.field5720 >> 9;
            this.field6767.method1565(var6, var4, arg1, var7, arg0, var7, var6, true, var3);
            if (this.field6767.field3574 != null) {
                class281 var8 = this.field6767.field3574.method2288();
                arg1.method434(var3, var8, var4, var5 == null ? null : var5.field818[0], 0);
            } else {
                var3.method205(var4, var5 == null ? null : var5.field818[0], 0);
            }
            if (this.field6764 == null) {
                this.field6764 = class687.method3783(super.field5716, super.field5717, var3, super.field5720, -108);
            } else {
                class403.method2302(super.field5720, false, super.field5717, super.field5716, this.field6764, var3);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)V", line = 219)
    public static void method2742(byte arg0) {
        field6766 = null;
        field6761 = null;
        if (arg0 != -60) {
            field6766 = null;
        }
    }

    @OriginalMember(owner = "client!pt", name = "e", descriptor = "(I)I", line = 234)
    public final int method549(int arg0) {
        ++field6758;
        if (arg0 != 12352) {
            this.method559(33, 66, (class638) null, -36);
        }
        return this.field6767.field3548;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Loa;ZLjp;)I", line = 245)
    public static final int method2743(class638 arg0, boolean arg1, class323 arg2) {
        if (arg1) {
            method2743((class638) null, false, (class323) null);
        }
        ++field6757;
        if (arg2.field4780 != -1) {
            return arg2.field4780;
        } else {
            if (~arg2.field4775 != 0) {
                class269 var3 = arg0.field9050.method588(-26679, !arg0.method385() ? arg2.field4769 : arg2.field4775);
                if (!var3.field3821) {
                    return var3.field3817;
                }
            }
            return arg2.field4767;
        }
    }

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "(I)I", line = 270)
    public final int method560(int arg0) {
        if (arg0 != 15654) {
            method2743((class638) null, false, (class323) null);
        }
        ++field6760;
        return this.field6767.field3562;
    }
}
