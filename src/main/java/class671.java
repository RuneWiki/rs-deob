import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class671 extends class299 implements class556 {

    @OriginalMember(owner = "client!sh", name = "B", descriptor = "Lvea;")
    private class404 field9543;

    @OriginalMember(owner = "client!sh", name = "v", descriptor = "I")
    public static int field9537;

    @OriginalMember(owner = "client!sh", name = "w", descriptor = "I")
    public static int field9538;

    @OriginalMember(owner = "client!sh", name = "x", descriptor = "I")
    public static int field9539;

    @OriginalMember(owner = "client!sh", name = "y", descriptor = "I")
    public static int field9540;

    @OriginalMember(owner = "client!sh", name = "z", descriptor = "I")
    public static int field9541;

    @OriginalMember(owner = "client!sh", name = "A", descriptor = "I")
    public static int field9542;

    @OriginalMember(owner = "client!sh", name = "D", descriptor = "I")
    public static int field9545;

    @OriginalMember(owner = "client!sh", name = "E", descriptor = "I")
    public static int field9546;

    @OriginalMember(owner = "client!sh", name = "F", descriptor = "I")
    public static int field9547;

    @OriginalMember(owner = "client!sh", name = "C", descriptor = "Laga;")
    public static class658 field9544;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)Z")
    public final boolean method2145(boolean arg0) {
        if (arg0) {
            method3811(-77, -66, -21);
        }
        ++field9537;
        return super.method1754(0, super.field3965.field7116);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)I")
    public final int method1755(int arg0) {
        ++field9547;
        return arg0 != 16383 ? -48 : super.method1755(arg0);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)Lvea;")
    public final class404 method2144(byte arg0) {
        if (arg0 != 93) {
            this.method1758((byte) 119);
        }
        ++field9541;
        return this.field9543;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)Z")
    public static final boolean method3811(int arg0, int arg1, int arg2) {
        if (arg1 != 27187) {
            method3814((class27) null, -75, 89, -47);
        }
        ++field9538;
        return ~(384 & arg2) != -1;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;")
    public final Buffer method2143(boolean arg0, byte arg1) {
        if (arg1 != 77) {
            return null;
        } else {
            ++field9542;
            return super.method1762(super.field3965.field7116, arg0, arg1 ^ 10125);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)V")
    public final void method1765(int arg0, int arg1) {
        super.method1765(this.field9543.field5334 * arg0, arg1);
        ++field9539;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)V")
    public final void method1758(byte arg0) {
        ++field9546;
        int var2 = 119 % ((arg0 - 67) / 38);
        super.method1758((byte) 125);
    }

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "(B)V")
    public static void method3812(byte arg0) {
        field9544 = null;
        if (arg0 != -34) {
            field9545 = -113;
        }
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lqi;Lvea;Z)V")
    public class671(class510 arg0, class404 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        this.field9543 = arg1;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIIII)Z")
    public static final boolean method3813(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field9540;
        if (!class611.field8479) {
            return false;
        } else if (~class469.field6278 > -101) {
            return false;
        } else if (~arg5 == ~arg6 && ~arg1 == ~arg4) {
            if (!class454.method2559(arg6, arg0, arg2 + 1, arg4)) {
                return false;
            } else {
                int var7 = arg6 << class62.field762;
                int var8 = arg4 << class62.field762;
                if (class246.method1500(class246.field3214[arg0].method1611(arg6, true, arg4), var7, 0, class458.field6012, class458.field6012, arg3, var8)) {
                    ++class209.field2791;
                    return true;
                } else {
                    return false;
                }
            }
        } else {
            for (int var9 = arg6; ~var9 >= ~arg5; ++var9) {
                for (int var12 = arg4; arg1 >= var12; ++var12) {
                    if (class685.field9689[arg0][var9][var12] == -class132.field1841) {
                        return false;
                    }
                }
            }
            int var10 = (arg6 << class62.field762) - -1;
            int var11 = (arg4 << class62.field762) + 2;
            if (!class246.method1500(class246.field3214[arg0].method1611(arg6, true, arg4), var10, arg2, (arg1 - arg4 - -1) * class458.field6012, (arg5 - (arg6 + -1)) * class458.field6012, arg3, var11)) {
                return false;
            } else {
                ++class209.field2791;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lir;III)V")
    public static final void method3814(class27 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class329.field4421) {
            class207 var4 = class153.field2168[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field2765 != null && var4.field2765.method166(0)) {
                arg0.method169(0, var4.field2765, true, 0, class377.field4985, class458.field6012, (byte) -128);
            }
        }
        if (arg3 < class329.field4421) {
            class207 var5 = class153.field2168[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field2765 != null && var5.field2765.method166(0)) {
                arg0.method169(class458.field6012, var5.field2765, true, 0, class377.field4985, 0, (byte) -119);
            }
        }
        if (arg2 < class329.field4421 && arg3 < class641.field8846) {
            class207 var6 = class153.field2168[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field2765 != null && var6.field2765.method166(0)) {
                arg0.method169(class458.field6012, var6.field2765, true, 0, class377.field4985, class458.field6012, (byte) -119);
            }
        }
        if (arg2 < class329.field4421 && arg3 > 0) {
            class207 var7 = class153.field2168[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field2765 != null && var7.field2765.method166(0)) {
                arg0.method169(-class458.field6012, var7.field2765, true, 0, class377.field4985, class458.field6012, (byte) -119);
            }
        }
    }
}
