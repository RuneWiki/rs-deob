import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class458 extends class185 implements class351 {

    @OriginalMember(owner = "client!bl", name = "F", descriptor = "Ldg;")
    public class283 field6775;

    @OriginalMember(owner = "client!bl", name = "v", descriptor = "Z")
    private boolean field6765;

    @OriginalMember(owner = "client!bl", name = "G", descriptor = "Lvt;")
    public static class197 field6776 = new class197();

    @OriginalMember(owner = "client!bl", name = "s", descriptor = "I")
    public static int field6762;

    @OriginalMember(owner = "client!bl", name = "t", descriptor = "I")
    public static int field6763;

    @OriginalMember(owner = "client!bl", name = "u", descriptor = "I")
    public static int field6764;

    @OriginalMember(owner = "client!bl", name = "w", descriptor = "I")
    public static int field6766;

    @OriginalMember(owner = "client!bl", name = "x", descriptor = "I")
    public static int field6767;

    @OriginalMember(owner = "client!bl", name = "y", descriptor = "I")
    public static int field6768;

    @OriginalMember(owner = "client!bl", name = "z", descriptor = "I")
    public static int field6769;

    @OriginalMember(owner = "client!bl", name = "A", descriptor = "I")
    public static int field6770;

    @OriginalMember(owner = "client!bl", name = "B", descriptor = "I")
    public static int field6771;

    @OriginalMember(owner = "client!bl", name = "C", descriptor = "I")
    public static int field6772;

    @OriginalMember(owner = "client!bl", name = "D", descriptor = "I")
    public static int field6773;

    @OriginalMember(owner = "client!bl", name = "E", descriptor = "I")
    public static int field6774;

    @OriginalMember(owner = "client!bl", name = "H", descriptor = "I")
    public static int field6777;

    @OriginalMember(owner = "client!bl", name = "I", descriptor = "I")
    public static int field6778;

    @OriginalMember(owner = "client!bl", name = "J", descriptor = "I")
    public static int field6779;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)I")
    public final int method20(int arg0) {
        if (arg0 != -30685) {
            this.method10((byte) 62, (class162) null);
        }
        ++field6764;
        return this.field6775.field4059;
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(B)I")
    public final int method5(byte arg0) {
        ++field6762;
        if (arg0 != -65) {
            field6776 = null;
        }
        return this.field6775.field4046;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)I")
    public final int method17(int arg0) {
        int var2 = 80 % ((-41 - arg0) / 61);
        ++field6779;
        return this.field6775.field4053;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZIILer;Lqa;IB)V")
    public final void method19(boolean arg0, int arg1, int arg2, class68 arg3, class162 arg4, int arg5, byte arg6) {
        ++field6768;
        if (arg6 > -105) {
            this.field6775 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILqa;)V")
    public final void method11(int arg0, class162 arg1) {
        if (arg0 < -107) {
            this.field6775.method1829(arg1, 4);
            ++field6771;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V")
    public final void method15(byte arg0) {
        if (arg0 >= -10) {
            this.method5((byte) 100);
        }
        ++field6777;
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(I)Z")
    public final boolean method18(int arg0) {
        ++field6774;
        if (arg0 < 72) {
            this.field6765 = false;
        }
        return false;
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lqa;Lkn;IIIIIZII)V")
    public class458(class162 arg0, class519 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg1.field7657, arg1.field7630);
        this.field6775 = new class283(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
        this.field6765 = ~arg1.field7573 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(B)Z")
    public final boolean method7(byte arg0) {
        ++field6763;
        if (arg0 < 1) {
            this.method19(false, 57, -71, (class68) null, (class162) null, -121, (byte) 45);
        }
        return this.field6775.method1832((byte) -125);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IILqa;B)Z")
    public final boolean method8(int arg0, int arg1, class162 arg2, byte arg3) {
        ++field6772;
        int var5 = -51 % ((-12 - arg3) / 36);
        class121 var6 = this.field6775.method1834(false, arg2, 131072, super.field2756, false, (byte) -23, super.field2749);
        if (var6 == null) {
            return false;
        } else {
            class414 var7 = arg2.method1115();
            var7.method913(super.field2749, super.field2751, super.field2756);
            return var6.method706(arg0, arg1, var7, false);
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(ILqa;)Lnf;")
    public final class405 method12(int arg0, class162 arg1) {
        ++field6770;
        class121 var3 = this.field6775.method1834(false, arg1, 2048, super.field2756, true, (byte) -23, super.field2749);
        if (var3 == null) {
            return null;
        } else {
            class414 var4 = arg1.method1115();
            var4.method913(super.field2749, super.field2751, super.field2756);
            class405 var5 = null;
            if (this.field6765) {
                var5 = class75.method427(1, 0);
            }
            if (this.field6775.field4073 == null) {
                var3.method720(var4, var5 == null ? null : var5.field6108[0], 0);
            } else {
                class389 var6 = this.field6775.field4073.method1369();
                arg1.method1055(var3, var6, var4, var5 != null ? var5.field6108[0] : null, 0);
            }
            if (arg0 <= 120) {
                this.field6765 = false;
            }
            int var7 = super.field2749 >> 7;
            int var8 = super.field2756 >> 7;
            this.field6775.method1836(var7, var8, var8, var7, var3, arg1, -4333, true);
            return var5;
        }
    }

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "(I)V")
    public static void method2744(int arg0) {
        if (arg0 == -191) {
            field6776 = null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BLqa;)V")
    public final void method10(byte arg0, class162 arg1) {
        ++field6766;
        if (arg0 != -32) {
            method2745((byte) -29);
        }
        class121 var3 = this.field6775.method1834(true, arg1, 262144, super.field2756, true, (byte) -23, super.field2749);
        if (var3 != null) {
            int var4 = super.field2749 >> 7;
            int var5 = super.field2756 >> 7;
            this.field6775.method1836(var4, var5, var5, var4, var3, arg1, -4333, false);
        }
    }

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "(B)V")
    public final void method13(byte arg0) {
        ++field6767;
        if (arg0 != -89) {
            this.method10((byte) -65, (class162) null);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILqa;I)Lc;")
    public final class121 method9(int arg0, class162 arg1, int arg2) {
        if (arg2 > -22) {
            this.field6775 = null;
        }
        ++field6773;
        return this.field6775.method1834(false, arg1, arg0, 0, false, (byte) -23, 0);
    }

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "(B)V")
    public static final void method2745(byte arg0) {
        ++field6769;
        if (!class154.field2280) {
            class264.field3869 = true;
            if (class426.field6401.field1013) {
                class382.field5792 = (float) (-128 & (int) class382.field5792 - -191);
            } else {
                class450.field6707 += (24.0F - class450.field6707) / 2.0F;
            }
            if (arg0 < 45) {
                field6776 = null;
            }
            class154.field2280 = true;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lqa;B)V")
    public final void method14(class162 arg0, byte arg1) {
        if (arg1 != 72) {
            field6776 = null;
        }
        ++field6778;
        this.field6775.method1828(arg0, (byte) -88);
    }
}
