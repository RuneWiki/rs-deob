import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class249 extends class255 implements class196 {

    @OriginalMember(owner = "client!hp", name = "t", descriptor = "Lpd;")
    public class433 field3447;

    @OriginalMember(owner = "client!hp", name = "x", descriptor = "Z")
    private boolean field3451;

    @OriginalMember(owner = "client!hp", name = "K", descriptor = "Z")
    public static boolean field3464;

    @OriginalMember(owner = "client!hp", name = "I", descriptor = "Lpg;")
    public static class492 field3462;

    @OriginalMember(owner = "client!hp", name = "u", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!hp", name = "v", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!hp", name = "w", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!hp", name = "y", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!hp", name = "z", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!hp", name = "A", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!hp", name = "B", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!hp", name = "C", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!hp", name = "D", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!hp", name = "E", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!hp", name = "F", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!hp", name = "G", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!hp", name = "H", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!hp", name = "J", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!hp", name = "L", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!hp", name = "N", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!hp", name = "M", descriptor = "[I")
    public static int[] field3466;

    @OriginalMember(owner = "client!hp", name = "h", descriptor = "(I)V")
    public static void method1636(int arg0) {
        field3462 = null;
        field3466 = null;
        if (arg0 != 1540776839) {
            field3457 = 125;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lqa;I)Lpj;")
    public final class507 method51(class496 arg0, int arg1) {
        ++field3454;
        if (arg1 != -150) {
            return null;
        } else {
            class201 var3 = this.field3447.method2590(true, 10, arg0, false, super.field3533, 2048, super.field3534);
            if (var3 == null) {
                return null;
            } else {
                class23 var4 = arg0.method1088();
                var4.method185(super.field3534 + super.field3531, super.field3532, super.field3533 + super.field3525);
                class507 var5 = null;
                if (this.field3451) {
                    var5 = class82.method527(1, 1761171873);
                }
                if (this.field3447.field6448 == null) {
                    var3.method318(var4, var5 == null ? null : var5.field7549[0], 0);
                } else {
                    class258 var6 = this.field3447.field6448.method870();
                    arg0.method1047(var3, var6, var4, var5 == null ? null : var5.field7549[0], 0);
                }
                int var7 = super.field3534 >> 7;
                int var8 = super.field3533 >> 7;
                this.field3447.method2589(var8, var7, true, var7, var8, arg0, true, var3);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)I")
    public final int method66(int arg0) {
        if (arg0 != -7234) {
            field3467 = -93;
        }
        ++field3459;
        return this.field3447.field6421;
    }

    @OriginalMember(owner = "client!hp", name = "g", descriptor = "(I)I")
    public final int method509(int arg0) {
        ++field3461;
        if (arg0 != -4) {
            method1636(50);
        }
        return this.field3447.method2601(-101);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)I")
    public final int method63(byte arg0) {
        ++field3465;
        return arg0 != 63 ? -89 : this.field3447.field6432;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(BLqa;)V")
    public final void method55(byte arg0, class496 arg1) {
        this.field3447.method2598(56, arg1);
        if (arg0 <= -31) {
            ++field3448;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILqa;)V")
    public final void method67(int arg0, class496 arg1) {
        int var3 = 16 % ((arg0 - 59) / 60);
        this.field3447.method2599((byte) 86, arg1);
        ++field3460;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)I")
    public final int method50(int arg0) {
        if (arg0 != 25707) {
            this.method56(96, -4, -124, (class496) null);
        }
        ++field3449;
        return this.field3447.field6429;
    }

    @OriginalMember(owner = "client!hp", name = "i", descriptor = "(I)V")
    public static final void method1637(int arg0) {
        if (class337.field5242 != null) {
            class404.field6112.method2362((byte) 87);
            class56.method378();
            class413.method2508(false);
            class220.method1493(true);
            class140.method935(115);
            class492.method2923((byte) 19);
            if (class429.field6384 != null) {
                class429.field6384.method3119(-51);
            }
            class454.method2733((byte) -98);
            class220.method1494((byte) -128);
            class102.method687(true);
            class530.method3131(false, 64);
            class11.method96(0);
            for (int var1 = 0; var1 < 2048; ++var1) {
                class322 var5 = class439.field6539[var1];
                if (var5 != null) {
                    var5.field5341 = null;
                    for (int var6 = 0; var5.field5346.length > var6; ++var6) {
                        var5.field5346[var6] = null;
                    }
                }
            }
            for (int var2 = 0; class151.field2174.length > var2; ++var2) {
                class194 var3 = class151.field2174[var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field5346.length; ++var4) {
                        var3.field5346[var4] = null;
                    }
                }
            }
            class337.field5242.method2954((byte) -121);
            class337.field5242 = null;
        }
        int var7 = 85 % ((arg0 - -59) / 63);
        ++field3453;
    }

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "(B)V")
    public final void method59(byte arg0) {
        int var2 = -73 % ((arg0 - 27) / 63);
        ++field3452;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIILqa;)Z")
    public final boolean method56(int arg0, int arg1, int arg2, class496 arg3) {
        ++field3455;
        class201 var5 = this.field3447.method2590(false, arg1 + 7, arg3, false, super.field3533, 131072, super.field3534);
        if (arg1 != 3) {
            this.method51((class496) null, 3);
        }
        if (var5 == null) {
            return false;
        } else {
            class23 var6 = arg3.method1088();
            var6.method185(super.field3534 + super.field3531, super.field3532, super.field3533 + super.field3525);
            return var5.method310(arg0, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(BLqa;)V")
    public final void method62(byte arg0, class496 arg1) {
        ++field3456;
        if (arg0 != -126) {
            field3462 = null;
        }
        class201 var3 = this.field3447.method2590(true, 10, arg1, false, super.field3533, 262144, super.field3534);
        if (var3 != null) {
            int var4 = super.field3534 >> 7;
            int var5 = super.field3533 >> 7;
            this.field3447.method2589(var5, var4, false, var4, var5, arg1, true, var3);
        }
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(B)Z")
    public final boolean method60(byte arg0) {
        if (arg0 > -108) {
            field3467 = -31;
        }
        ++field3450;
        return this.field3447.method2593(10);
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lqa;Leu;IIIIIZIIIIII)V")
    public class249(class496 arg0, class130 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg4, arg5, arg6, arg8, arg9, arg10, class164.method1162(arg11, (byte) 78, arg12));
        this.field3447 = new class433(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
        this.field3451 = arg1.field1886 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILqa;B)Lc;")
    public final class201 method53(int arg0, class496 arg1, byte arg2) {
        int var4 = -82 / ((arg2 - -62) / 39);
        ++field3463;
        return this.field3447.method2590(false, 10, arg1, false, 0, arg0, 0);
    }

    static {
        new class375(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
        field3464 = false;
        field3462 = new class492(36, -2);
    }
}
