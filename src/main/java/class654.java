import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class654 extends class18 implements class532 {

    @OriginalMember(owner = "client!dq", name = "y", descriptor = "B")
    private byte field8845;

    @OriginalMember(owner = "client!dq", name = "t", descriptor = "Z")
    private boolean field8840;

    @OriginalMember(owner = "client!dq", name = "O", descriptor = "B")
    private byte field8861;

    @OriginalMember(owner = "client!dq", name = "J", descriptor = "Z")
    private boolean field8856;

    @OriginalMember(owner = "client!dq", name = "D", descriptor = "B")
    private byte field8850;

    @OriginalMember(owner = "client!dq", name = "W", descriptor = "S")
    private short field8868;

    @OriginalMember(owner = "client!dq", name = "R", descriptor = "Z")
    private boolean field8863;

    @OriginalMember(owner = "client!dq", name = "z", descriptor = "Lw;")
    private class276 field8846;

    @OriginalMember(owner = "client!dq", name = "A", descriptor = "Lba;")
    private class358 field8847;

    @OriginalMember(owner = "client!dq", name = "G", descriptor = "Lcu;")
    public static class206 field8853 = new class206(58, 5);

    @OriginalMember(owner = "client!dq", name = "U", descriptor = "I")
    public static int field8866 = 0;

    @OriginalMember(owner = "client!dq", name = "S", descriptor = "I")
    public static int field8864 = 0;

    @OriginalMember(owner = "client!dq", name = "u", descriptor = "I")
    public static int field8841;

    @OriginalMember(owner = "client!dq", name = "v", descriptor = "I")
    public static int field8842;

    @OriginalMember(owner = "client!dq", name = "w", descriptor = "I")
    public static int field8843;

    @OriginalMember(owner = "client!dq", name = "x", descriptor = "I")
    public static int field8844;

    @OriginalMember(owner = "client!dq", name = "B", descriptor = "I")
    public static int field8848;

    @OriginalMember(owner = "client!dq", name = "C", descriptor = "I")
    public static int field8849;

    @OriginalMember(owner = "client!dq", name = "E", descriptor = "I")
    public static int field8851;

    @OriginalMember(owner = "client!dq", name = "H", descriptor = "I")
    public static int field8854;

    @OriginalMember(owner = "client!dq", name = "I", descriptor = "I")
    public static int field8855;

    @OriginalMember(owner = "client!dq", name = "K", descriptor = "I")
    public static int field8857;

    @OriginalMember(owner = "client!dq", name = "L", descriptor = "I")
    public static int field8858;

    @OriginalMember(owner = "client!dq", name = "M", descriptor = "I")
    public static int field8859;

    @OriginalMember(owner = "client!dq", name = "N", descriptor = "I")
    public static int field8860;

    @OriginalMember(owner = "client!dq", name = "Q", descriptor = "I")
    public static int field8862;

    @OriginalMember(owner = "client!dq", name = "T", descriptor = "I")
    public static int field8865;

    @OriginalMember(owner = "client!dq", name = "V", descriptor = "I")
    public static int field8867;

    @OriginalMember(owner = "client!dq", name = "X", descriptor = "I")
    public static int field8869;

    @OriginalMember(owner = "client!dq", name = "F", descriptor = "Ldd;")
    private class660 field8852;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Z)V")
    public final void method144(boolean arg0) {
        if (this.field8847 != null) {
            this.field8847.method1913();
        }
        if (arg0) {
            this.method145((byte) -80, (class651) null);
        }
        ++field8855;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)Z")
    public final boolean method150(byte arg0) {
        if (arg0 > -34) {
            return false;
        } else {
            ++field8865;
            return this.field8863;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Loa;BI)Lba;")
    public final class358 method137(class651 arg0, byte arg1, int arg2) {
        ++field8844;
        if (arg1 != -47) {
            this.method144(true);
        }
        return this.method3580(arg2, (byte) -101, arg0);
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(B)I")
    public final int method151(byte arg0) {
        if (arg0 != 78) {
            return -10;
        } else {
            ++field8842;
            return this.field8861;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILoa;)Ldd;")
    public final class660 method143(int arg0, class651 arg1) {
        if (this.field8852 == null) {
            this.field8852 = class516.method2881(super.field309, true, this.method3580(0, (byte) -2, arg1), super.field300, super.field305);
        }
        if (arg0 != 31358) {
            return null;
        } else {
            ++field8859;
            return this.field8852;
        }
    }

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "(B)I")
    public final int method188(byte arg0) {
        if (arg0 <= 73) {
            this.method147((class651) null, true);
        }
        ++field8851;
        return this.field8847 == null ? 0 : this.field8847.method1939();
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Loa;B)V")
    public final void method148(class651 arg0, byte arg1) {
        if (arg1 != 70) {
            this.method138((class651) null, 36);
        }
        ++field8862;
        Object var3 = null;
        class276 var5;
        if (this.field8846 == null && this.field8863) {
            class392 var4 = this.method3582(262144, arg0, -118, true);
            var5 = var4 != null ? var4.field5170 : null;
        } else {
            var5 = this.field8846;
            this.field8846 = null;
        }
        if (var5 != null) {
            class486.method2723(var5, this.field8845, super.field300, super.field305, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "(Z)V")
    public static void method3579(boolean arg0) {
        if (arg0) {
            field8866 = 2;
        }
        field8853 = null;
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(Z)I")
    public final int method146(boolean arg0) {
        ++field8857;
        return arg0 ? -15 : this.field8868 & 65535;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Loa;I)V")
    public final void method138(class651 arg0, int arg1) {
        if (arg1 != 2215) {
            this.method138((class651) null, 55);
        }
        ++field8869;
        Object var3 = null;
        class276 var5;
        if (this.field8846 == null && this.field8863) {
            class392 var4 = this.method3582(262144, arg0, arg1 ^ -2267, true);
            var5 = var4 == null ? null : var4.field5170;
        } else {
            var5 = this.field8846;
            this.field8846 = null;
        }
        if (var5 != null) {
            class232.method1447(var5, this.field8845, super.field300, super.field305, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "(Z)I")
    public final int method152(boolean arg0) {
        ++field8854;
        return !arg0 ? -20 : this.field8850;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IBLoa;)Lba;")
    private final class358 method3580(int arg0, byte arg1, class651 arg2) {
        ++field8867;
        if (this.field8847 != null && arg2.method376(this.field8847.method1945(), arg0) == 0) {
            return this.field8847;
        } else {
            int var4 = -15 / ((-59 - arg1) / 42);
            class392 var5 = this.method3582(arg0, arg2, -127, false);
            return var5 != null ? var5.field5169 : null;
        }
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Loa;Lbd;IIIIZIIIII)V")
    public class654(class651 arg0, class58 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class176.method1185(arg11, arg10, -114));
        this.field8845 = (byte) arg2;
        this.field8840 = arg6;
        super.field300 = arg3;
        this.field8861 = (byte) arg10;
        this.field8856 = ~arg1.field816 != -1 && !arg6;
        this.field8850 = (byte) arg11;
        super.field305 = arg5;
        this.field8868 = (short) arg1.field824;
        this.field8863 = arg0.method404() && arg1.field877 && !this.field8840 && ~class344.field4718.method2329(108, class571.field7587) != -1;
        class392 var13 = this.method3582(2048, arg0, -127, this.field8863);
        if (var13 != null) {
            this.field8846 = var13.field5170;
            this.field8847 = var13.field5169;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)V")
    public static final void method3581(int arg0, String arg1, int arg2, String arg3) {
        class126.field2096 = arg2;
        class173.field2675 = arg0;
        ++field8860;
        class512.method2848(arg3, (byte) -115, false, arg1);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(BLoa;)Lpe;")
    public final class571 method145(byte arg0, class651 arg1) {
        ++field8848;
        if (this.field8847 == null) {
            return null;
        } else {
            class397 var3 = arg1.method455();
            var3.method576(super.field303 + super.field300, super.field309, super.field305 + super.field297);
            class571 var4 = null;
            if (this.field8856) {
                var4 = class157.method1100((byte) -112, 1);
            }
            this.field8847.method1947(var3, var4 == null ? null : var4.field7581[0], 0);
            if (arg0 != 124) {
                this.method137((class651) null, (byte) 23, 34);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(BILoa;I)Z")
    public final boolean method149(byte arg0, int arg1, class651 arg2, int arg3) {
        int var5 = -109 % ((-26 - arg0) / 38);
        ++field8843;
        class358 var6 = this.method3580(131072, (byte) 116, arg2);
        if (var6 != null) {
            class397 var7 = arg2.method455();
            var7.method576(super.field300, super.field309, super.field305);
            return var6.method1931(arg3, arg1, var7, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILoa;IZ)Lun;")
    private final class392 method3582(int arg0, class651 arg1, int arg2, boolean arg3) {
        ++field8849;
        if (arg2 > -117) {
            return null;
        } else {
            class58 var5 = class470.field6288.method1258(this.field8868 & 65535, (byte) -85);
            class139 var6;
            class139 var7;
            if (this.field8840) {
                var6 = class684.field9625[0];
                var7 = class467.field6283[this.field8845];
            } else {
                var7 = class684.field9625[this.field8845];
                if (~this.field8845 <= -4) {
                    var6 = null;
                } else {
                    var6 = class684.field9625[this.field8845 + 1];
                }
            }
            return var5.method472(var6, super.field300, super.field305, arg0, super.field309, arg1, (byte) -114, arg3, this.field8861, var7, this.field8850);
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Loa;Z)V")
    public final void method147(class651 arg0, boolean arg1) {
        if (arg1) {
            ++field8841;
        }
    }
}
