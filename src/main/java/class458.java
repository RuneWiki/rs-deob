import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class458 extends class624 implements class83 {

    @OriginalMember(owner = "client!np", name = "P", descriptor = "Z")
    private boolean field6529 = false;

    @OriginalMember(owner = "client!np", name = "J", descriptor = "Lui;")
    public class210 field6523;

    @OriginalMember(owner = "client!np", name = "W", descriptor = "Z")
    private boolean field6536;

    @OriginalMember(owner = "client!np", name = "F", descriptor = "I")
    public static int field6519;

    @OriginalMember(owner = "client!np", name = "G", descriptor = "I")
    public static int field6520;

    @OriginalMember(owner = "client!np", name = "I", descriptor = "I")
    public static int field6522;

    @OriginalMember(owner = "client!np", name = "K", descriptor = "I")
    public static int field6524;

    @OriginalMember(owner = "client!np", name = "L", descriptor = "I")
    public static int field6525;

    @OriginalMember(owner = "client!np", name = "M", descriptor = "I")
    public static int field6526;

    @OriginalMember(owner = "client!np", name = "N", descriptor = "I")
    public static int field6527;

    @OriginalMember(owner = "client!np", name = "O", descriptor = "I")
    public static int field6528;

    @OriginalMember(owner = "client!np", name = "Q", descriptor = "I")
    public static int field6530;

    @OriginalMember(owner = "client!np", name = "R", descriptor = "I")
    public static int field6531;

    @OriginalMember(owner = "client!np", name = "S", descriptor = "I")
    public static int field6532;

    @OriginalMember(owner = "client!np", name = "T", descriptor = "I")
    public static int field6533;

    @OriginalMember(owner = "client!np", name = "V", descriptor = "I")
    public static int field6535;

    @OriginalMember(owner = "client!np", name = "X", descriptor = "I")
    public static int field6537;

    @OriginalMember(owner = "client!np", name = "Y", descriptor = "I")
    public static int field6538;

    @OriginalMember(owner = "client!np", name = "Z", descriptor = "I")
    public static int field6539;

    @OriginalMember(owner = "client!np", name = "ab", descriptor = "I")
    public static int field6540;

    @OriginalMember(owner = "client!np", name = "bb", descriptor = "I")
    public static int field6541;

    @OriginalMember(owner = "client!np", name = "U", descriptor = "Luc;")
    public static class27 field6534;

    @OriginalMember(owner = "client!np", name = "H", descriptor = "Lbm;")
    private class98 field6521;

    @OriginalMember(owner = "client!np", name = "h", descriptor = "(B)V")
    public static void method2749(byte arg0) {
        if (arg0 >= -101) {
            method2749((byte) -80);
        }
        field6534 = null;
    }

    @OriginalMember(owner = "client!np", name = "f", descriptor = "(I)I")
    public final int method530(int arg0) {
        ++field6541;
        return arg0 >= -38 ? 68 : this.field6523.method1467(0);
    }

    @OriginalMember(owner = "client!np", name = "c", descriptor = "(B)I")
    public final int method846(byte arg0) {
        if (arg0 != -105) {
            this.method843(true);
        }
        ++field6525;
        return this.field6523.field3203;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lr;BII)Z")
    public final boolean method444(class167 arg0, byte arg1, int arg2, int arg3) {
        int var5 = 42 / ((arg1 - -30) / 36);
        ++field6519;
        class55 var6 = this.field6523.method1470(131072, (byte) 119, super.field9815, arg0, false, false, super.field9806);
        if (var6 == null) {
            return false;
        } else {
            class396 var7 = arg0.method53();
            var7.method905(super.field9806, super.field9809, super.field9815);
            return class7.field521 ? var6.method318(arg2, arg3, var7, false, class477.field6857) : var6.method358(arg2, arg3, var7, false);
        }
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(ILr;)Lfe;")
    public final class531 method449(int arg0, class167 arg1) {
        ++field6540;
        class55 var3 = this.field6523.method1470(2048, (byte) 108, super.field9815, arg1, false, true, super.field9806);
        if (var3 == null) {
            return null;
        } else {
            class396 var4 = arg1.method53();
            if (arg0 != 92160000) {
                return null;
            } else {
                var4.method905(super.field9806, super.field9809, super.field9815);
                class531 var5 = null;
                if (this.field6536) {
                    var5 = class370.method2347(1, (byte) -121);
                }
                int var6 = super.field9806 >> 9;
                int var7 = super.field9815 >> 9;
                this.field6523.method1473(var6, var6, var7, arg1, var4, var7, var3, 0, true);
                if (!class7.field521) {
                    var3.method334(var4, var5 == null ? null : var5.field7451[0], 0);
                } else {
                    var3.method317(var4, var5 == null ? null : var5.field7451[0], class477.field6857, 0);
                }
                if (this.field6523.field3222 != null) {
                    class518 var8 = this.field6523.field3222.method582();
                    if (class7.field521) {
                        arg1.method72(var8, class477.field6857);
                    } else {
                        arg1.method123(var8);
                    }
                }
                this.field6529 = var3.method363() || this.field6523.field3222 != null;
                if (this.field6521 != null) {
                    class653.method3724(super.field9806, super.field9809, 30955, var3, this.field6521, super.field9815);
                } else {
                    this.field6521 = class86.method857(super.field9815, -1, super.field9809, var3, super.field9806);
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Z)V")
    public final void method843(boolean arg0) {
        if (arg0) {
            ++field6531;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(BLr;)V")
    public final void method842(byte arg0, class167 arg1) {
        ++field6539;
        if (arg0 <= 60) {
            method2749((byte) -21);
        }
        this.field6523.method1463(false, arg1);
    }

    @OriginalMember(owner = "client!np", name = "d", descriptor = "(I)Z")
    public final boolean method524(int arg0) {
        int var2 = -127 % ((-36 - arg0) / 53);
        ++field6538;
        return this.field6529;
    }

    @OriginalMember(owner = "client!np", name = "c", descriptor = "(Z)I")
    public final int method523(boolean arg0) {
        ++field6524;
        if (!arg0) {
            this.field6536 = true;
        }
        return this.field6523.method1472(114);
    }

    @OriginalMember(owner = "client!np", name = "e", descriptor = "(B)Z")
    public final boolean method522(byte arg0) {
        ++field6532;
        return arg0 != -36 ? false : false;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(ILr;)Lbm;")
    public final class98 method450(int arg0, class167 arg1) {
        if (arg0 != -29645) {
            this.field6536 = false;
        }
        ++field6520;
        return this.field6521;
    }

    @OriginalMember(owner = "client!np", name = "g", descriptor = "(I)Z")
    public final boolean method447(int arg0) {
        ++field6537;
        return arg0 >= -15 ? false : false;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IILgfa;IILr;Z)V")
    public final void method455(int arg0, int arg1, class697 arg2, int arg3, int arg4, class167 arg5, boolean arg6) {
        ++field6535;
        if (arg1 != -1008) {
            this.method447(113);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Lr;Lbd;IIIIIZIII)V")
    public class458(class167 arg0, class56 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class51.method628(arg9, (byte) 103, arg8));
        this.field6523 = new class210(arg0, arg1, arg8, arg9, super.field9814, arg3, super.field9806, super.field9815, arg7, arg10);
        this.field6536 = ~arg1.field1290 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!np", name = "e", descriptor = "(I)V")
    public final void method448(int arg0) {
        if (arg0 < -12) {
            ++field6526;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(B)I")
    public final int method844(byte arg0) {
        int var2 = -51 / ((43 - arg0) / 44);
        ++field6528;
        return this.field6523.field3193;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(ZLr;)V")
    public final void method463(boolean arg0, class167 arg1) {
        ++field6533;
        if (arg0) {
            field6534 = null;
        }
        class55 var3 = this.field6523.method1470(262144, (byte) 98, super.field9815, arg1, true, true, super.field9806);
        if (var3 != null) {
            int var4 = super.field9806 >> 9;
            int var5 = super.field9815 >> 9;
            class396 var6 = arg1.method53();
            var6.method905(super.field9806, super.field9809, super.field9815);
            this.field6523.method1473(var4, var4, var5, arg1, var6, var5, var3, 0, false);
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lr;Z)V")
    public final void method840(class167 arg0, boolean arg1) {
        if (arg1) {
            field6534 = null;
        }
        this.field6523.method1464(arg0, -1);
        ++field6527;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)Z")
    public final boolean method845(int arg0) {
        ++field6530;
        if (arg0 <= 73) {
            this.field6529 = false;
        }
        return this.field6523.method1468((byte) 40);
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(B)I")
    public final int method841(byte arg0) {
        ++field6522;
        if (arg0 != 52) {
            this.method845(30);
        }
        return this.field6523.field3212;
    }
}
