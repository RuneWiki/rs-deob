import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class151 extends class117 implements class351 {

    @OriginalMember(owner = "client!ui", name = "x", descriptor = "Ldg;")
    public class283 field2239;

    @OriginalMember(owner = "client!ui", name = "D", descriptor = "Z")
    private boolean field2245;

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "[I")
    public static int[] field2241 = new int[64];

    @OriginalMember(owner = "client!ui", name = "P", descriptor = "I")
    public static int field2256 = 0;

    @OriginalMember(owner = "client!ui", name = "w", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!ui", name = "y", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!ui", name = "A", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!ui", name = "B", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!ui", name = "C", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!ui", name = "E", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!ui", name = "F", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!ui", name = "G", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!ui", name = "H", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!ui", name = "I", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!ui", name = "J", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!ui", name = "K", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!ui", name = "N", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!ui", name = "O", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!ui", name = "Q", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!ui", name = "R", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!ui", name = "M", descriptor = "Lic;")
    public static class491 field2253;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)I")
    public final int method5(byte arg0) {
        if (arg0 != -65) {
            this.method11(41, (class162) null);
        }
        ++field2247;
        return this.field2239.field4046;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(ILqa;)Lnf;")
    public final class405 method12(int arg0, class162 arg1) {
        ++field2251;
        class121 var3 = this.field2239.method1834(false, arg1, 2048, super.field1769, true, (byte) -23, super.field1763);
        if (arg0 <= 120) {
            field2253 = null;
        }
        if (var3 == null) {
            return null;
        } else {
            class414 var4 = arg1.method1115();
            var4.method913(super.field1763, super.field1766, super.field1769);
            class405 var5 = null;
            if (this.field2245) {
                var5 = class75.method427(1, 0);
            }
            if (this.field2239.field4073 == null) {
                var3.method720(var4, var5 == null ? null : var5.field6108[0], 0);
            } else {
                class389 var6 = this.field2239.field4073.method1369();
                arg1.method1055(var3, var6, var4, var5 == null ? null : var5.field6108[0], 0);
            }
            this.field2239.method1836(super.field1762, super.field1765, super.field1771, super.field1770, var3, arg1, -4333, true);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lqa;Lkn;IIIIIZIIIIIII)V")
    public class151(class162 arg0, class519 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field7658 == 1, class186.method1281(arg13, -121, arg12));
        this.field2239 = new class283(arg0, arg1, arg12, arg13, super.field1768, arg3, arg4, arg6, arg7, arg14);
        this.field2245 = ~arg1.field7573 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "(I)I")
    public final int method283(int arg0) {
        if (arg0 != 16490) {
            return -84;
        } else {
            ++field2255;
            return this.field2239.method1831(arg0 + -16573);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IILqa;B)Z")
    public final boolean method8(int arg0, int arg1, class162 arg2, byte arg3) {
        ++field2242;
        int var5 = -118 % ((-12 - arg3) / 36);
        class121 var6 = this.field2239.method1834(false, arg2, 131072, super.field1769, false, (byte) -23, super.field1763);
        if (var6 == null) {
            return false;
        } else {
            class414 var7 = arg2.method1115();
            var7.method913(super.field1763, super.field1766, super.field1769);
            return var6.method706(arg0, arg1, var7, false);
        }
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)Z")
    public final boolean method18(int arg0) {
        ++field2248;
        if (arg0 <= 72) {
            this.method9(121, (class162) null, 52);
        }
        return false;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILqa;)V")
    public final void method11(int arg0, class162 arg1) {
        ++field2254;
        this.field2239.method1829(arg1, 4);
        if (arg0 > -107) {
            this.method12(117, (class162) null);
        }
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(B)V")
    public final void method13(byte arg0) {
        ++field2243;
        if (arg0 != -89) {
            field2241 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BLqa;)V")
    public final void method10(byte arg0, class162 arg1) {
        ++field2257;
        if (arg0 != -32) {
            this.method283(-51);
        }
        class121 var3 = this.field2239.method1834(true, arg1, 262144, super.field1769, true, (byte) -23, super.field1763);
        if (var3 != null) {
            this.field2239.method1836(super.field1762, super.field1765, super.field1771, super.field1770, var3, arg1, -4333, false);
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)I")
    public final int method20(int arg0) {
        ++field2244;
        if (arg0 != -30685) {
            this.field2239 = null;
        }
        return this.field2239.field4059;
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(B)Z")
    public final boolean method7(byte arg0) {
        ++field2252;
        if (arg0 < 1) {
            field2241 = null;
        }
        return this.field2239.method1832((byte) -108);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V")
    public final void method15(byte arg0) {
        ++field2240;
        if (arg0 >= -10) {
            field2253 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)I")
    public final int method17(int arg0) {
        ++field2238;
        int var2 = -88 % ((arg0 - -41) / 61);
        return this.field2239.field4053;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZIILer;Lqa;IB)V")
    public final void method19(boolean arg0, int arg1, int arg2, class68 arg3, class162 arg4, int arg5, byte arg6) {
        if (arg6 >= -105) {
            this.field2245 = false;
        }
        ++field2258;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "(B)V")
    public static void method989(byte arg0) {
        if (arg0 != 18) {
            field2253 = null;
        }
        field2253 = null;
        field2241 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lqa;B)V")
    public final void method14(class162 arg0, byte arg1) {
        ++field2249;
        this.field2239.method1828(arg0, (byte) -88);
        if (arg1 != 72) {
            this.method283(-113);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILqa;I)Lc;")
    public final class121 method9(int arg0, class162 arg1, int arg2) {
        if (arg2 > -22) {
            this.field2239 = null;
        }
        ++field2246;
        return this.field2239.method1834(false, arg1, arg0, 0, false, (byte) -23, 0);
    }
}
