import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class372 extends class364 implements class351 {

    @OriginalMember(owner = "client!bf", name = "F", descriptor = "Ldg;")
    public class283 field5688;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "Z")
    private boolean field5678;

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "Z")
    public static boolean field5680 = false;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "Lvp;")
    public static class123 field5674 = new class123();

    @OriginalMember(owner = "client!bf", name = "H", descriptor = "I")
    public static int field5690 = 0;

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
    public static int field5672;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
    public static int field5673;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "I")
    public static int field5675;

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
    public static int field5676;

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
    public static int field5677;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "I")
    public static int field5679;

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "I")
    public static int field5681;

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "I")
    public static int field5682;

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "I")
    public static int field5683;

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "I")
    public static int field5684;

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "I")
    public static int field5685;

    @OriginalMember(owner = "client!bf", name = "D", descriptor = "I")
    public static int field5686;

    @OriginalMember(owner = "client!bf", name = "E", descriptor = "I")
    public static int field5687;

    @OriginalMember(owner = "client!bf", name = "G", descriptor = "I")
    public static int field5689;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
    public final void method15(byte arg0) {
        if (arg0 < -10) {
            ++field5682;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILqa;I)Lc;")
    public final class121 method9(int arg0, class162 arg1, int arg2) {
        if (arg2 > -22) {
            field5690 = -81;
        }
        ++field5685;
        return this.field5688.method1834(false, arg1, arg0, 0, false, (byte) -23, 0);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)I")
    public final int method17(int arg0) {
        ++field5689;
        int var2 = -79 % ((arg0 - -41) / 61);
        return this.field5688.field4053;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)I")
    public final int method20(int arg0) {
        if (arg0 != -30685) {
            this.field5678 = true;
        }
        ++field5672;
        return this.field5688.field4059;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(B)I")
    public final int method5(byte arg0) {
        if (arg0 != -65) {
            field5690 = 74;
        }
        ++field5687;
        return this.field5688.field4046;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)Z")
    public final boolean method18(int arg0) {
        if (arg0 <= 72) {
            this.field5678 = false;
        }
        ++field5677;
        return false;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lqa;Lkn;IIIIIZIII)V")
    public class372(class162 arg0, class519 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, class437.method2626(false, arg8, arg9));
        this.field5688 = new class283(arg0, arg1, arg8, arg9, arg2, arg3, super.field5577, super.field5572, arg7, arg10);
        this.field5678 = ~arg1.field7573 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(B)V")
    public final void method13(byte arg0) {
        if (arg0 != -89) {
            this.method10((byte) -102, (class162) null);
        }
        ++field5683;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BLqa;)V")
    public final void method10(byte arg0, class162 arg1) {
        ++field5673;
        class121 var3 = this.field5688.method1834(true, arg1, 262144, super.field5572, true, (byte) -23, super.field5577);
        if (arg0 != -32) {
            field5690 = -62;
        }
        if (var3 != null) {
            int var4 = super.field5577 >> 7;
            int var5 = super.field5572 >> 7;
            this.field5688.method1836(var4, var5, var5, var4, var3, arg1, -4333, false);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IILqa;B)Z")
    public final boolean method8(int arg0, int arg1, class162 arg2, byte arg3) {
        ++field5686;
        class121 var5 = this.field5688.method1834(false, arg2, 131072, super.field5572, false, (byte) -23, super.field5577);
        if (var5 == null) {
            return false;
        } else {
            int var6 = 35 % ((arg3 - -12) / 36);
            class414 var7 = arg2.method1115();
            var7.method913(super.field5577, super.field5571, super.field5572);
            return var5.method706(arg0, arg1, var7, false);
        }
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(B)Z")
    public final boolean method7(byte arg0) {
        ++field5684;
        if (arg0 < 1) {
            field5674 = null;
        }
        return this.field5688.method1832((byte) -119);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lqa;B)V")
    public final void method14(class162 arg0, byte arg1) {
        if (arg1 != 72) {
            this.field5678 = false;
        }
        ++field5681;
        this.field5688.method1828(arg0, (byte) -88);
    }

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "(I)V")
    public static void method2291(int arg0) {
        field5674 = null;
        if (arg0 != 0) {
            field5690 = 49;
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(ILqa;)Lnf;")
    public final class405 method12(int arg0, class162 arg1) {
        ++field5679;
        class121 var3 = this.field5688.method1834(false, arg1, 2048, super.field5572, true, (byte) -23, super.field5577);
        if (var3 == null) {
            return null;
        } else {
            class414 var4 = arg1.method1115();
            if (arg0 < 120) {
                field5690 = -48;
            }
            var4.method913(super.field5577, super.field5571, super.field5572);
            class405 var5 = null;
            if (this.field5678) {
                var5 = class75.method427(1, 0);
            }
            if (this.field5688.field4073 != null) {
                class389 var6 = this.field5688.field4073.method1369();
                arg1.method1055(var3, var6, var4, var5 == null ? null : var5.field6108[0], 0);
            } else {
                var3.method720(var4, var5 == null ? null : var5.field6108[0], 0);
            }
            int var7 = super.field5577 >> 7;
            int var8 = super.field5572 >> 7;
            this.field5688.method1836(var7, var8, var8, var7, var3, arg1, -4333, true);
            return var5;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZIILer;Lqa;IB)V")
    public final void method19(boolean arg0, int arg1, int arg2, class68 arg3, class162 arg4, int arg5, byte arg6) {
        ++field5676;
        if (arg6 > -105) {
            field5690 = -121;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILqa;)V")
    public final void method11(int arg0, class162 arg1) {
        if (arg0 > -107) {
            field5690 = -41;
        }
        ++field5675;
        this.field5688.method1829(arg1, 4);
    }
}
