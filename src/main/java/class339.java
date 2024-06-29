import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class339 extends class367 implements class231 {

    @OriginalMember(owner = "client!rp", name = "x", descriptor = "S")
    private short field4861;

    @OriginalMember(owner = "client!rp", name = "w", descriptor = "B")
    private byte field4860;

    @OriginalMember(owner = "client!rp", name = "R", descriptor = "Z")
    private boolean field4881;

    @OriginalMember(owner = "client!rp", name = "L", descriptor = "Z")
    private boolean field4875;

    @OriginalMember(owner = "client!rp", name = "D", descriptor = "B")
    private byte field4867;

    @OriginalMember(owner = "client!rp", name = "E", descriptor = "B")
    private byte field4868;

    @OriginalMember(owner = "client!rp", name = "C", descriptor = "Z")
    private boolean field4866;

    @OriginalMember(owner = "client!rp", name = "B", descriptor = "Lk;")
    private class88 field4865;

    @OriginalMember(owner = "client!rp", name = "N", descriptor = "Lr;")
    private class519 field4877;

    @OriginalMember(owner = "client!rp", name = "H", descriptor = "I")
    public static int field4871 = 0;

    @OriginalMember(owner = "client!rp", name = "U", descriptor = "[I")
    public static int[] field4884 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!rp", name = "t", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!rp", name = "u", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!rp", name = "v", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!rp", name = "y", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!rp", name = "z", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!rp", name = "A", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!rp", name = "F", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!rp", name = "G", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!rp", name = "I", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!rp", name = "J", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!rp", name = "K", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!rp", name = "O", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!rp", name = "P", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!rp", name = "Q", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!rp", name = "S", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!rp", name = "T", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!rp", name = "V", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!rp", name = "M", descriptor = "Lkm;")
    private class120 field4876;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lqa;B)V")
    public final void method266(class167 arg0, byte arg1) {
        ++field4883;
        if (arg1 != -40) {
            this.field4866 = false;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(ZLqa;)V")
    public final void method268(boolean arg0, class167 arg1) {
        ++field4885;
        if (!arg0) {
            field4857 = 113;
        }
        Object var3 = null;
        class88 var5;
        if (this.field4865 == null && this.field4866) {
            class380 var4 = this.method2083(arg1, true, 262144, 0);
            var5 = var4 == null ? null : var4.field5591;
        } else {
            var5 = this.field4865;
            this.field4865 = null;
        }
        if (var5 != null) {
            class246.method1566(var5, this.field4860, super.field5209, super.field5198, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)I")
    public final int method258(byte arg0) {
        if (arg0 != -36) {
            this.method262(-14);
        }
        ++field4863;
        return this.field4867;
    }

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "(B)V")
    public static void method2081(byte arg0) {
        int var1 = -40 % ((-3 - arg0) / 52);
        field4884 = null;
    }

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "(I)V")
    public final void method270(int arg0) {
        int var2 = -8 % ((arg0 - -1) / 47);
        if (this.field4877 != null) {
            this.field4877.method1357();
        }
        ++field4862;
    }

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "(B)I")
    public final int method261(byte arg0) {
        ++field4858;
        if (arg0 >= -116) {
            return -67;
        } else {
            return this.field4877 == null ? 0 : this.field4877.method1390();
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(BILqa;)Lr;")
    private final class519 method2082(byte arg0, int arg1, class167 arg2) {
        ++field4859;
        if (this.field4877 != null && ~arg2.method560(this.field4877.method1373(), arg1) == -1) {
            return this.field4877;
        } else if (arg0 >= -39) {
            return null;
        } else {
            class380 var4 = this.method2083(arg2, false, arg1, 0);
            return var4 != null ? var4.field5589 : null;
        }
    }

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "(I)Z")
    public final boolean method262(int arg0) {
        ++field4864;
        if (arg0 != -21131) {
            this.method268(false, (class167) null);
        }
        return this.field4866;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lqa;I)Lbi;")
    public final class465 method267(class167 arg0, int arg1) {
        ++field4879;
        if (this.field4877 == null) {
            return null;
        } else {
            class105 var3 = arg0.method637();
            var3.method884(super.field5209 + super.field5200, super.field5207, super.field5204 + super.field5198);
            if (arg1 != 2) {
                this.field4868 = 87;
            }
            class465 var4 = null;
            if (this.field4875) {
                var4 = class603.method3437((byte) -22, 1);
            }
            this.field4877.method1379(var3, var4 != null ? var4.field6707[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(ILqa;)Lkm;")
    public final class120 method260(int arg0, class167 arg1) {
        if (arg0 > -50) {
            this.method270(78);
        }
        ++field4878;
        if (this.field4876 == null) {
            this.field4876 = class577.method3298(this.method2082((byte) -65, 0, arg1), super.field5209, super.field5198, (byte) 83, super.field5207);
        }
        return this.field4876;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lqa;ZII)Lep;")
    private final class380 method2083(class167 arg0, boolean arg1, int arg2, int arg3) {
        ++field4869;
        class370 var5 = class552.field7819.method2890(arg3, this.field4861 & 65535);
        class542 var6;
        class542 var7;
        if (!this.field4881) {
            var6 = class587.field8363[this.field4860];
            if (this.field4860 < 3) {
                var7 = class587.field8363[this.field4860 + 1];
            } else {
                var7 = null;
            }
        } else {
            var7 = class587.field8363[0];
            var6 = class73.field1360[this.field4860];
        }
        return var5.method2246(92, this.field4868, var6, var7, this.field4867, super.field5209, arg1, super.field5198, arg2, arg0, super.field5207);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(BLqa;II)Z")
    public final boolean method263(byte arg0, class167 arg1, int arg2, int arg3) {
        ++field4882;
        class519 var5 = this.method2082((byte) -81, 131072, arg1);
        if (arg0 != 29) {
            return false;
        } else if (var5 != null) {
            class105 var6 = arg1.method637();
            var6.method884(super.field5209, super.field5207, super.field5198);
            return var5.method1399(arg2, arg3, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)I")
    public final int method269(int arg0) {
        if (arg0 != -13265) {
            this.method264(14);
        }
        ++field4874;
        return this.field4868;
    }

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lqa;Ltk;IIIIZIIIII)V")
    public class339(class167 arg0, class370 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class180.method1220((byte) -17, arg10, arg11));
        this.field4861 = (short) arg1.field5335;
        this.field4860 = (byte) arg2;
        this.field4881 = arg6;
        this.field4875 = arg1.field5276 != 0 && !arg6;
        super.field5198 = arg5;
        super.field5209 = arg3;
        this.field4867 = (byte) arg11;
        this.field4868 = (byte) arg10;
        this.field4866 = arg0.method594() && arg1.field5353 && !this.field4881 && ~class202.field2854.method3143(class646.field9388, 0) != -1;
        class380 var13 = this.method2083(arg0, this.field4866, 2048, 0);
        if (var13 != null) {
            this.field4865 = var13.field5591;
            this.field4877 = var13.field5589;
        }
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)I")
    public final int method264(int arg0) {
        ++field4873;
        return arg0 != -25792 ? 52 : this.field4861 & 65535;
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(II)Z")
    public static final boolean method2084(int arg0, int arg1) {
        ++field4872;
        if (arg1 != 0) {
            field4884 = null;
        }
        return arg0 == 6 || ~arg0 == -9;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILqa;)V")
    public final void method255(int arg0, class167 arg1) {
        ++field4870;
        int var3 = 122 / ((-46 - arg0) / 42);
        Object var4 = null;
        class88 var6;
        if (this.field4865 == null && this.field4866) {
            class380 var5 = this.method2083(arg1, true, 262144, 0);
            var6 = var5 == null ? null : var5.field5591;
        } else {
            var6 = this.field4865;
            this.field4865 = null;
        }
        if (var6 != null) {
            class371.method2255(var6, this.field4860, super.field5209, super.field5198, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILqa;Z)Lr;")
    public final class519 method254(int arg0, class167 arg1, boolean arg2) {
        if (arg2) {
            this.field4866 = true;
        }
        ++field4880;
        return this.method2082((byte) -92, arg0, arg1);
    }
}
