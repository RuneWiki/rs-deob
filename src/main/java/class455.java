import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class455 extends class336 implements class438 {

    @OriginalMember(owner = "client!rf", name = "N", descriptor = "Loh;")
    public class443 field6722;

    @OriginalMember(owner = "client!rf", name = "D", descriptor = "Z")
    private boolean field6712;

    @OriginalMember(owner = "client!rf", name = "F", descriptor = "[I")
    public static int[] field6714 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!rf", name = "L", descriptor = "Lbn;")
    public static class160 field6720 = new class160(61, 3);

    @OriginalMember(owner = "client!rf", name = "W", descriptor = "[Lwc;")
    public static class380[] field6731 = new class380[2048];

    @OriginalMember(owner = "client!rf", name = "X", descriptor = "[Ljava/lang/String;")
    public static String[] field6732 = new String[100];

    @OriginalMember(owner = "client!rf", name = "Z", descriptor = "I")
    public static int field6734 = 0;

    @OriginalMember(owner = "client!rf", name = "Y", descriptor = "[Ljava/lang/String;")
    public static String[] field6733 = new String[200];

    @OriginalMember(owner = "client!rf", name = "U", descriptor = "Z")
    public static boolean field6729 = false;

    @OriginalMember(owner = "client!rf", name = "z", descriptor = "I")
    public static int field6708;

    @OriginalMember(owner = "client!rf", name = "A", descriptor = "I")
    public static int field6709;

    @OriginalMember(owner = "client!rf", name = "B", descriptor = "I")
    public static int field6710;

    @OriginalMember(owner = "client!rf", name = "C", descriptor = "I")
    public static int field6711;

    @OriginalMember(owner = "client!rf", name = "E", descriptor = "I")
    public static int field6713;

    @OriginalMember(owner = "client!rf", name = "G", descriptor = "I")
    public static int field6715;

    @OriginalMember(owner = "client!rf", name = "H", descriptor = "I")
    public static int field6716;

    @OriginalMember(owner = "client!rf", name = "I", descriptor = "I")
    public static int field6717;

    @OriginalMember(owner = "client!rf", name = "J", descriptor = "I")
    public static int field6718;

    @OriginalMember(owner = "client!rf", name = "K", descriptor = "I")
    public static int field6719;

    @OriginalMember(owner = "client!rf", name = "M", descriptor = "I")
    public static int field6721;

    @OriginalMember(owner = "client!rf", name = "O", descriptor = "I")
    public static int field6723;

    @OriginalMember(owner = "client!rf", name = "P", descriptor = "I")
    public static int field6724;

    @OriginalMember(owner = "client!rf", name = "R", descriptor = "I")
    public static int field6726;

    @OriginalMember(owner = "client!rf", name = "S", descriptor = "I")
    public static int field6727;

    @OriginalMember(owner = "client!rf", name = "T", descriptor = "I")
    public static int field6728;

    @OriginalMember(owner = "client!rf", name = "Q", descriptor = "[I")
    public static int[] field6725;

    @OriginalMember(owner = "client!rf", name = "V", descriptor = "[[[J")
    public static long[][][] field6730;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILfp;)Luq;")
    public final class241 method2(int arg0, class9 arg1) {
        ++field6713;
        class143 var3 = this.field6722.method2718(false, super.field4954, true, super.field4951, arg1, 1024, false);
        if (var3 == null) {
            return null;
        } else {
            class187 var4 = arg1.method145();
            var4.method831(super.field4954, super.field4952, super.field4951);
            class241 var5 = null;
            if (this.field6712) {
                var5 = class395.method2485(-29083, 1);
            }
            if (arg0 > -125) {
                field6714 = null;
            }
            if (this.field6722.field6437 != null) {
                class400 var6 = this.field6722.field6437.method2076();
                arg1.method166(var3, var6, var4, var5 == null ? null : var5.field3578[0], 0);
            } else {
                var3.method947(var4, var5 == null ? null : var5.field3578[0], 0);
            }
            this.field6722.method2720(super.field4959, (byte) 105, super.field4950, super.field4957, true, arg1, var3, super.field4961);
            return var5;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lfp;II)Lbi;")
    public final class143 method11(class9 arg0, int arg1, int arg2) {
        ++field6719;
        return arg2 != -23109 ? null : this.field6722.method2718(false, 0, false, 0, arg0, arg1, false);
    }

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "(I)V")
    public final void method33(int arg0) {
        if (arg0 < 109) {
            this.method32((class9) null, (class309) null, false, -51, 96, -64, 77);
        }
        ++field6718;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lfp;Z)V")
    public final void method10(class9 arg0, boolean arg1) {
        if (!arg1) {
            this.field6722.method2726(18143, arg0);
            ++field6715;
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(ILfp;)V")
    public final void method14(int arg0, class9 arg1) {
        if (arg0 != -7561) {
            this.method14(-85, (class9) null);
        }
        ++field6717;
        class143 var3 = this.field6722.method2718(true, super.field4954, true, super.field4951, arg1, 131072, false);
        if (var3 != null) {
            this.field6722.method2720(super.field4959, (byte) 101, super.field4950, super.field4957, false, arg1, var3, super.field4961);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "([BI)[B")
    public static final byte[] method2821(byte[] arg0, int arg1) {
        ++field6708;
        int var2 = -66 / ((arg1 - -13) / 45);
        int var3 = arg0.length;
        byte[] var4 = new byte[var3];
        class224.method1539(arg0, 0, var4, 0, var3);
        return var4;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)I")
    public final int method1(int arg0) {
        ++field6710;
        if (arg0 >= -72) {
            field6734 = -105;
        }
        return this.field6722.field6465;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)I")
    public final int method9(byte arg0) {
        if (arg0 < 102) {
            this.method6(39);
        }
        ++field6724;
        return this.field6722.field6453;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lfp;Lje;ZIIII)V")
    public final void method32(class9 arg0, class309 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 >= -31) {
            field6734 = 12;
        }
        ++field6727;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lfp;I)V")
    public final void method7(class9 arg0, int arg1) {
        if (arg1 <= 98) {
            this.method33(-17);
        }
        this.field6722.method2724(arg0, 104);
        ++field6728;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)Z")
    public final boolean method15(boolean arg0) {
        ++field6716;
        if (!arg0) {
            field6731 = null;
        }
        return this.field6722.method2729(70);
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lfp;Lgn;IIIIIIIZIIIII)V")
    public class455(class9 arg0, class178 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg4, arg6, arg7, arg8, arg10, arg11, arg12, arg13, arg1.field2529 == 1, class296.method1969(arg3, true, arg2));
        this.field6722 = new class443(arg0, arg1, arg2, arg3, super.field4960, arg5, arg6, arg8, arg9, arg14);
        this.field6712 = arg1.field2479 != 0 && !arg9;
    }

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "(B)Z")
    public final boolean method34(byte arg0) {
        int var2 = -40 / ((-19 - arg0) / 44);
        ++field6711;
        return false;
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(I)I")
    public final int method6(int arg0) {
        ++field6721;
        if (arg0 != -20839) {
            this.method32((class9) null, (class309) null, true, 78, -50, -72, 48);
        }
        return this.field6722.field6462;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIILcl;)V")
    public static final void method2822(int arg0, int arg1, int arg2, class323 arg3) {
        class369 var4 = class186.method1275(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field5346 = arg3;
        }
    }

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "(B)I")
    public final int method268(byte arg0) {
        ++field6709;
        return arg0 >= -101 ? 109 : this.field6722.method2728(25997);
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V")
    public final void method4(int arg0) {
        if (arg0 != -27030) {
            field6725 = null;
        }
        ++field6726;
    }

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "(B)V")
    public static void method2823(byte arg0) {
        field6730 = null;
        field6731 = null;
        field6733 = null;
        if (arg0 <= 91) {
            method2823((byte) 114);
        }
        field6725 = null;
        field6720 = null;
        field6732 = null;
        field6714 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lfp;III)Z")
    public final boolean method5(class9 arg0, int arg1, int arg2, int arg3) {
        ++field6723;
        if (arg2 != -754) {
            field6729 = true;
        }
        class143 var5 = this.field6722.method2718(false, super.field4954, false, super.field4951, arg0, 65536, false);
        if (var5 == null) {
            return false;
        } else {
            class187 var6 = arg0.method145();
            var6.method831(super.field4954, super.field4952, super.field4951);
            return var5.method988(arg3, arg1, var6, false);
        }
    }
}
