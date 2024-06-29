import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class441 extends class202 implements class161 {

    @OriginalMember(owner = "client!cm", name = "D", descriptor = "Z")
    private boolean field6552;

    @OriginalMember(owner = "client!cm", name = "ab", descriptor = "S")
    private short field6575;

    @OriginalMember(owner = "client!cm", name = "I", descriptor = "B")
    private byte field6557;

    @OriginalMember(owner = "client!cm", name = "z", descriptor = "Z")
    private boolean field6548;

    @OriginalMember(owner = "client!cm", name = "N", descriptor = "B")
    private byte field6562;

    @OriginalMember(owner = "client!cm", name = "Q", descriptor = "B")
    private byte field6565;

    @OriginalMember(owner = "client!cm", name = "T", descriptor = "Z")
    private boolean field6568;

    @OriginalMember(owner = "client!cm", name = "cb", descriptor = "Li;")
    private class200 field6577;

    @OriginalMember(owner = "client!cm", name = "W", descriptor = "Le;")
    private class289 field6571;

    @OriginalMember(owner = "client!cm", name = "M", descriptor = "[I")
    public static int[] field6561 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!cm", name = "L", descriptor = "[B")
    public static byte[] field6560 = new byte[2048];

    @OriginalMember(owner = "client!cm", name = "A", descriptor = "I")
    public static int field6549;

    @OriginalMember(owner = "client!cm", name = "B", descriptor = "I")
    public static int field6550;

    @OriginalMember(owner = "client!cm", name = "C", descriptor = "I")
    public static int field6551;

    @OriginalMember(owner = "client!cm", name = "E", descriptor = "I")
    public static int field6553;

    @OriginalMember(owner = "client!cm", name = "F", descriptor = "I")
    public static int field6554;

    @OriginalMember(owner = "client!cm", name = "G", descriptor = "I")
    public static int field6555;

    @OriginalMember(owner = "client!cm", name = "H", descriptor = "I")
    public static int field6556;

    @OriginalMember(owner = "client!cm", name = "J", descriptor = "I")
    public static int field6558;

    @OriginalMember(owner = "client!cm", name = "K", descriptor = "I")
    public static int field6559;

    @OriginalMember(owner = "client!cm", name = "O", descriptor = "I")
    public static int field6563;

    @OriginalMember(owner = "client!cm", name = "P", descriptor = "I")
    public static int field6564;

    @OriginalMember(owner = "client!cm", name = "R", descriptor = "I")
    public static int field6566;

    @OriginalMember(owner = "client!cm", name = "S", descriptor = "I")
    public static int field6567;

    @OriginalMember(owner = "client!cm", name = "U", descriptor = "I")
    public static int field6569;

    @OriginalMember(owner = "client!cm", name = "V", descriptor = "I")
    public static int field6570;

    @OriginalMember(owner = "client!cm", name = "X", descriptor = "I")
    public static int field6572;

    @OriginalMember(owner = "client!cm", name = "Z", descriptor = "I")
    public static int field6574;

    @OriginalMember(owner = "client!cm", name = "bb", descriptor = "I")
    public static int field6576;

    @OriginalMember(owner = "client!cm", name = "db", descriptor = "I")
    public static int field6578;

    @OriginalMember(owner = "client!cm", name = "Y", descriptor = "Lla;")
    public static class310 field6573;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(ILza;)Lhp;", line = 4)
    public final class293 method110(int arg0, class299 arg1) {
        ++field6564;
        if (this.field6571 == null) {
            return null;
        } else {
            class517 var3 = arg1.method538();
            var3.method951(super.field3126 - -super.field3131, super.field3133, super.field3120 + super.field3114);
            class293 var4 = null;
            if (this.field6552) {
                var4 = class467.method2844(-22755, 1);
            }
            this.field6571.method673(var3, var4 == null ? null : var4.field4524[0], arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)I", line = 28)
    public final int method99(byte arg0) {
        if (arg0 != -107) {
            return 19;
        } else {
            ++field6578;
            return 65535 & this.field6575;
        }
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(Z)V", line = 40)
    public static final void method2723(boolean arg0) {
        class14.method83((byte) -110);
        ++field6556;
        if (!arg0) {
            field6561 = null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(III)V", line = 52)
    public static final void method2724(int arg0, int arg1, int arg2) {
        ++field6566;
        int var3 = -61 % ((57 - arg1) / 53);
        if (class401.field5923 == class268.field4258) {
            if (!class64.method432(-2, 1, (byte) -123, 0, arg2, 1, false, arg0, 0)) {
                class64.method432(-3, 1, (byte) 89, 0, arg2, 1, false, arg0, 0);
            }
        } else if (!class64.method432(-3, 1, (byte) 90, 0, arg2, 1, false, arg0, 0)) {
            class64.method432(-2, 1, (byte) 118, 0, arg2, 1, false, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lza;ZIZ)Lhw;", line = 77)
    private final class396 method2725(class299 arg0, boolean arg1, int arg2, boolean arg3) {
        ++field6576;
        class395 var5 = class247.field3693.method2281(this.field6575 & 65535, -9380);
        class11 var6;
        class11 var7;
        if (!this.field6548) {
            if (~this.field6565 > -4) {
                var6 = class274.field4306[this.field6565 + 1];
            } else {
                var6 = null;
            }
            var7 = class274.field4306[this.field6565];
        } else {
            var6 = class274.field4306[0];
            var7 = class288.field4475[this.field6565];
        }
        if (!arg3) {
            this.method111((class299) null, 26, false);
        }
        return var5.method2499(var7, arg2, this.field6562, super.field3133, super.field3114, arg0, this.field6557, arg1, super.field3126, (byte) 47, var6);
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)I", line = 108)
    public final int method103(int arg0) {
        ++field6549;
        if (arg0 >= -10) {
            this.method110(-2, (class299) null);
        }
        return this.field6562;
    }

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "(B)I", line = 121)
    public final int method1421(byte arg0) {
        ++field6551;
        int var2 = 64 % ((-48 - arg0) / 35);
        return this.field6571 != null ? this.field6571.method654() : 0;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)I", line = 134)
    public final int method97(int arg0) {
        ++field6550;
        if (arg0 <= 82) {
            this.field6557 = 101;
        }
        return this.field6557;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILza;)V", line = 147)
    public final void method98(int arg0, class299 arg1) {
        if (arg0 != 31203) {
            this.method2725((class299) null, true, -45, true);
        }
        ++field6555;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lza;B)V", line = 164)
    public final void method96(class299 arg0, byte arg1) {
        ++field6574;
        Object var3 = null;
        class200 var5;
        if (this.field6577 == null && this.field6568) {
            class396 var4 = this.method2725(arg0, true, 262144, true);
            var5 = var4 != null ? var4.field5850 : null;
        } else {
            var5 = this.field6577;
            this.field6577 = null;
        }
        if (var5 != null) {
            class205.method1434(var5, this.field6565, super.field3126, super.field3114, (boolean[]) null);
        }
        if (arg1 < 78) {
            method2724(68, -117, 6);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(BLza;)V", line = 193)
    public final void method100(byte arg0, class299 arg1) {
        if (arg0 != 51) {
            this.method100((byte) 63, (class299) null);
        }
        ++field6567;
        Object var3 = null;
        class200 var5;
        if (this.field6577 == null && this.field6568) {
            class396 var4 = this.method2725(arg1, true, 262144, true);
            var5 = var4 != null ? var4.field5850 : null;
        } else {
            var5 = this.field6577;
            this.field6577 = null;
        }
        if (var5 != null) {
            class470.method2852(var5, this.field6565, super.field3126, super.field3114, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILza;I)Le;", line = 227)
    private final class289 method2726(int arg0, class299 arg1, int arg2) {
        ++field6558;
        if (this.field6571 != null && ~arg1.method589(this.field6571.method679(), arg2) == -1) {
            return this.field6571;
        } else {
            if (arg0 != 28118) {
                this.method96((class299) null, (byte) -45);
            }
            class396 var4 = this.method2725(arg1, false, arg2, true);
            return var4 == null ? null : var4.field5853;
        }
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(Z)V", line = 248)
    public static void method2727(boolean arg0) {
        field6561 = null;
        if (!arg0) {
            field6561 = null;
        }
        field6560 = null;
        field6573 = null;
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(I)V", line = 261)
    public final void method106(int arg0) {
        ++field6572;
        if (arg0 != -19159) {
            field6560 = null;
        }
        if (this.field6571 != null) {
            this.field6571.method657();
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lza;IZ)Le;", line = 275)
    public final class289 method111(class299 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field6570 = 16;
        }
        ++field6569;
        return this.method2726(28118, arg0, arg1);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lza;III)Z", line = 291)
    public final boolean method109(class299 arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 23) {
            return true;
        } else {
            ++field6559;
            class289 var5 = this.method2726(28118, arg0, 131072);
            if (var5 != null) {
                class517 var6 = arg0.method538();
                var6.method951(super.field3126, super.field3133, super.field3114);
                return var5.method638(arg1, arg3, var6, false);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "(Z)V", line = 312)
    public static final void method2728(boolean arg0) {
        if (class417.field6133 == null || class480.field7043 == null) {
            class417.field6133 = new int[256];
            class480.field7043 = new int[256];
            for (int var1 = 0; var1 < 256; ++var1) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class417.field6133[var1] = (int) (4096.0D * Math.sin(var2));
                class480.field7043[var1] = (int) (4096.0D * Math.cos(var2));
            }
        }
        if (arg0) {
            method2723(false);
        }
        ++field6553;
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(B)Z", line = 348)
    public final boolean method104(byte arg0) {
        ++field6554;
        int var2 = 69 / ((arg0 - -41) / 38);
        return this.field6568;
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Lza;Lii;IIIIZIIIII)V", line = 359)
    public class441(class299 arg0, class395 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class467.method2847(arg11, arg10, (byte) 90));
        this.field6552 = ~arg1.field5840 != -1 && !arg6;
        this.field6575 = (short) arg1.field5831;
        this.field6557 = (byte) arg11;
        super.field3114 = arg5;
        this.field6548 = arg6;
        this.field6562 = (byte) arg10;
        super.field3126 = arg3;
        this.field6565 = (byte) arg2;
        this.field6568 = arg0.method573() && arg1.field5801 && !this.field6548 && ~class40.field667.method1836(127, class108.field1631) != -1;
        class396 var13 = this.method2725(arg0, this.field6568, 2048, true);
        if (var13 != null) {
            this.field6577 = var13.field5850;
            this.field6571 = var13.field5853;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ZII)V", line = 385)
    public static final void method2729(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            method2728(false);
        }
        ++field6563;
        class188 var3 = class10.method48((byte) 64, 6, arg1);
        var3.method1308(false);
        var3.field2873 = arg2;
    }
}
