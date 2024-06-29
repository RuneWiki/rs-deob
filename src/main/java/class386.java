import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class386 extends class169 implements class401 {

    @OriginalMember(owner = "client!bi", name = "T", descriptor = "S")
    private short field5825;

    @OriginalMember(owner = "client!bi", name = "D", descriptor = "Z")
    private boolean field5810;

    @OriginalMember(owner = "client!bi", name = "R", descriptor = "B")
    private byte field5823;

    @OriginalMember(owner = "client!bi", name = "M", descriptor = "Z")
    private boolean field5818;

    @OriginalMember(owner = "client!bi", name = "S", descriptor = "B")
    private byte field5824;

    @OriginalMember(owner = "client!bi", name = "P", descriptor = "B")
    private byte field5821;

    @OriginalMember(owner = "client!bi", name = "C", descriptor = "Z")
    private boolean field5809;

    @OriginalMember(owner = "client!bi", name = "I", descriptor = "Lt;")
    private class398 field5814;

    @OriginalMember(owner = "client!bi", name = "X", descriptor = "Lba;")
    private class502 field5829;

    @OriginalMember(owner = "client!bi", name = "y", descriptor = "[I")
    public static int[] field5805 = new int[6];

    @OriginalMember(owner = "client!bi", name = "H", descriptor = "I")
    public static int field5813 = 0;

    @OriginalMember(owner = "client!bi", name = "A", descriptor = "[I")
    public static int[] field5807 = new int[25];

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "I")
    public static int field5804;

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "I")
    public static int field5806;

    @OriginalMember(owner = "client!bi", name = "B", descriptor = "I")
    public static int field5808;

    @OriginalMember(owner = "client!bi", name = "F", descriptor = "I")
    public static int field5811;

    @OriginalMember(owner = "client!bi", name = "G", descriptor = "I")
    public static int field5812;

    @OriginalMember(owner = "client!bi", name = "J", descriptor = "I")
    public static int field5815;

    @OriginalMember(owner = "client!bi", name = "K", descriptor = "I")
    public static int field5816;

    @OriginalMember(owner = "client!bi", name = "L", descriptor = "I")
    public static int field5817;

    @OriginalMember(owner = "client!bi", name = "N", descriptor = "I")
    public static int field5819;

    @OriginalMember(owner = "client!bi", name = "O", descriptor = "I")
    public static int field5820;

    @OriginalMember(owner = "client!bi", name = "Q", descriptor = "I")
    public static int field5822;

    @OriginalMember(owner = "client!bi", name = "U", descriptor = "I")
    public static int field5826;

    @OriginalMember(owner = "client!bi", name = "V", descriptor = "I")
    public static int field5827;

    @OriginalMember(owner = "client!bi", name = "W", descriptor = "I")
    public static int field5828;

    @OriginalMember(owner = "client!bi", name = "Y", descriptor = "I")
    public static int field5830;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILya;II)Z")
    public final boolean method233(int arg0, class11 arg1, int arg2, int arg3) {
        ++field5806;
        if (arg2 != 2) {
            return false;
        } else {
            class398 var5 = this.method2310(124, 131072, arg1);
            if (var5 != null) {
                class511 var6 = arg1.method66();
                var6.method1307(super.field2487, super.field2482, super.field2488);
                return var5.method655(arg0, arg3, var6, false);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lya;Lpf;IIIIZIIIII)V")
    public class386(class11 arg0, class486 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class68.method479(arg11, (byte) 39, arg10));
        this.field5825 = (short) arg1.field7207;
        this.field5810 = arg1.field7230 != 0 && !arg6;
        this.field5823 = (byte) arg10;
        this.field5818 = arg6;
        this.field5824 = (byte) arg11;
        this.field5821 = (byte) arg2;
        super.field2487 = arg3;
        super.field2488 = arg5;
        this.field5809 = arg0.method77() && arg1.field7152 && !this.field5818 && class454.field6661.method509(class113.field1723, -2) != 0;
        class126 var13 = this.method2312(this.field5809, (byte) 85, arg0, 2048);
        if (var13 != null) {
            this.field5814 = var13.field1903;
            this.field5829 = var13.field1897;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLya;)V")
    public final void method231(byte arg0, class11 arg1) {
        if (arg0 == 33) {
            ++field5820;
            Object var3 = null;
            class502 var5;
            if (this.field5829 == null && this.field5809) {
                class126 var4 = this.method2312(true, (byte) 85, arg1, 262144);
                var5 = var4 == null ? null : var4.field1897;
            } else {
                var5 = this.field5829;
                this.field5829 = null;
            }
            if (var5 != null) {
                class174.method1197(var5, this.field5821, super.field2487, super.field2488, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IILya;)Lt;")
    private final class398 method2310(int arg0, int arg1, class11 arg2) {
        ++field5808;
        int var4 = 35 / ((81 - arg0) / 37);
        if (this.field5814 != null && ~arg2.method160(this.field5814.method626(), arg1) == -1) {
            return this.field5814;
        } else {
            class126 var5 = this.method2312(false, (byte) 85, arg2, arg1);
            return var5 == null ? null : var5.field1903;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lya;B)V")
    public final void method225(class11 arg0, byte arg1) {
        ++field5811;
        Object var3 = null;
        class502 var5;
        if (this.field5829 == null && this.field5809) {
            class126 var4 = this.method2312(true, (byte) 85, arg0, 262144);
            var5 = var4 == null ? null : var4.field1897;
        } else {
            var5 = this.field5829;
            this.field5829 = null;
        }
        if (var5 != null) {
            class489.method2918(var5, this.field5821, super.field2487, super.field2488, (boolean[]) null);
        }
        int var6 = 70 / ((42 - arg1) / 36);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)I")
    public final int method222(byte arg0) {
        ++field5819;
        if (arg0 > -99) {
            this.method225((class11) null, (byte) -31);
        }
        return this.field5823;
    }

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "(I)V")
    public static void method2311(int arg0) {
        field5805 = null;
        if (arg0 != 262144) {
            field5807 = null;
        }
        field5807 = null;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(Lya;I)Lmo;")
    public final class268 method238(class11 arg0, int arg1) {
        ++field5830;
        if (this.field5814 == null) {
            return null;
        } else {
            class511 var3 = arg0.method66();
            var3.method1307(super.field2487 - -super.field2490, super.field2482, super.field2493 + super.field2488);
            class268 var4 = null;
            if (arg1 != -1) {
                this.field5823 = 123;
            }
            if (this.field5810) {
                var4 = class281.method1757(0, 1);
            }
            this.field5814.method640(var3, var4 == null ? null : var4.field3992[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(B)I")
    public final int method921(byte arg0) {
        ++field5815;
        if (arg0 >= -109) {
            return 99;
        } else {
            return this.field5814 != null ? this.field5814.method635() : 0;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lya;I)V")
    public final void method234(class11 arg0, int arg1) {
        ++field5826;
        if (arg1 != 28007) {
            this.field5823 = -16;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZBLya;I)Lro;")
    private final class126 method2312(boolean arg0, byte arg1, class11 arg2, int arg3) {
        ++field5817;
        if (arg1 != 85) {
            this.method229(true);
        }
        class486 var5 = class119.field1824.method248(65535 & this.field5825, 30);
        class337 var6;
        class337 var7;
        if (this.field5818) {
            var6 = class213.field3048[0];
            var7 = class420.field6281[this.field5821];
        } else {
            var7 = class213.field3048[this.field5821];
            if (~this.field5821 > -4) {
                var6 = class213.field3048[this.field5821 + 1];
            } else {
                var6 = null;
            }
        }
        return var5.method2900(arg3, arg0, super.field2482, this.field5824, super.field2487, arg2, var7, this.field5823, var6, true, super.field2488);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)Z")
    public final boolean method232(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            ++field5822;
            return this.field5809;
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)I")
    public final int method240(int arg0) {
        ++field5816;
        return arg0 != -15578 ? 14 : this.field5825 & 65535;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)I")
    public final int method223(int arg0) {
        ++field5804;
        return arg0 != -19634 ? 12 : this.field5824;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILya;I)Lt;")
    public final class398 method241(int arg0, class11 arg1, int arg2) {
        ++field5827;
        int var4 = -41 / ((arg2 - 62) / 42);
        return this.method2310(-93, arg0, arg1);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIB)I")
    public static final int method2313(int arg0, int arg1, byte arg2) {
        ++field5828;
        int var3 = arg0 >>> 31;
        return arg2 != 49 ? -27 : (arg0 + var3) / arg1 + -var3;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(Z)V")
    public final void method229(boolean arg0) {
        if (this.field5814 != null) {
            this.field5814.method624();
        }
        if (arg0) {
            this.method223(-45);
        }
        ++field5812;
    }
}
