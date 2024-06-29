import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class331 extends class481 implements class161 {

    @OriginalMember(owner = "client!ce", name = "N", descriptor = "Z")
    private boolean field5007;

    @OriginalMember(owner = "client!ce", name = "F", descriptor = "B")
    private byte field4999;

    @OriginalMember(owner = "client!ce", name = "B", descriptor = "Z")
    private boolean field4995;

    @OriginalMember(owner = "client!ce", name = "G", descriptor = "B")
    private byte field5000;

    @OriginalMember(owner = "client!ce", name = "O", descriptor = "S")
    private short field5008;

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "Z")
    private boolean field4993;

    @OriginalMember(owner = "client!ce", name = "P", descriptor = "Z")
    private boolean field5009;

    @OriginalMember(owner = "client!ce", name = "y", descriptor = "Li;")
    private class200 field4992;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "Le;")
    private class289 field4982;

    @OriginalMember(owner = "client!ce", name = "K", descriptor = "[I")
    public static int[] field5004 = new int[5];

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "I")
    public static int field4983;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "I")
    public static int field4986;

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!ce", name = "x", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!ce", name = "A", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!ce", name = "C", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!ce", name = "D", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!ce", name = "E", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!ce", name = "H", descriptor = "I")
    public static int field5001;

    @OriginalMember(owner = "client!ce", name = "I", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!ce", name = "J", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!ce", name = "L", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!ce", name = "M", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!ce", name = "Q", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(ILza;)Lhp;", line = 4)
    public final class293 method110(int arg0, class299 arg1) {
        ++field4996;
        if (this.field4982 == null) {
            return null;
        } else {
            class517 var3 = arg1.method538();
            var3.method951(super.field7058, super.field7052, super.field7061);
            class293 var4 = null;
            if (this.field5007) {
                var4 = class467.method2844(arg0 + -22755, 1);
            }
            this.field4982.method673(var3, var4 == null ? null : var4.field4524[0], arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lza;III)Z", line = 27)
    public final boolean method109(class299 arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 23) {
            return false;
        } else {
            ++field4997;
            class289 var5 = this.method2165(131072, arg0, true);
            if (var5 != null) {
                class517 var6 = arg0.method538();
                var6.method951(super.field7058, super.field7052, super.field7061);
                return var5.method638(arg1, arg3, var6, false);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)Z", line = 52)
    public static final boolean method2161(int arg0, int arg1, int arg2) {
        int var3 = -50 / ((arg0 - -36) / 39);
        ++field4984;
        return ~(1408 & arg1) != -1;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lza;IIILps;IZ)V", line = 71)
    public final void method102(class299 arg0, int arg1, int arg2, int arg3, class352 arg4, int arg5, boolean arg6) {
        if (arg3 == -750) {
            ++field5001;
            if (arg4 instanceof class331) {
                class331 var8 = (class331) arg4;
                if (this.field4982 != null && var8.field4982 != null) {
                    this.field4982.method625(var8.field4982, arg2, arg1, arg5, arg6);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(III)B", line = 91)
    public static final byte method2162(int arg0, int arg1, int arg2) {
        ++field5006;
        if (arg2 != 9) {
            return 0;
        } else {
            if (arg0 != 2) {
                field5004 = null;
            }
            return (byte) ((1 & arg1) != 0 ? 2 : 1);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)I", line = 110)
    public final int method99(byte arg0) {
        ++field4994;
        if (arg0 != -107) {
            method2164((byte) -38, -19, 103, (class511) null, -125);
        }
        return 65535 & this.field5008;
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)V", line = 121)
    public final void method106(int arg0) {
        if (arg0 != -19159) {
            this.method100((byte) 117, (class299) null);
        }
        if (this.field4982 != null) {
            this.field4982.method657();
        }
        ++field4989;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)I", line = 140)
    public final int method97(int arg0) {
        ++field5010;
        if (arg0 < 82) {
            field5004 = null;
        }
        return this.field4999;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BLza;)V", line = 151)
    public final void method100(byte arg0, class299 arg1) {
        ++field4987;
        if (arg0 != 51) {
            this.method99((byte) 88);
        }
        Object var3 = null;
        class200 var5;
        if (this.field4992 == null && this.field5009) {
            class396 var4 = this.method2163(true, (byte) 109, 262144, arg1);
            var5 = var4 == null ? null : var4.field5850;
        } else {
            var5 = this.field4992;
            this.field4992 = null;
        }
        if (var5 != null) {
            class470.method2852(var5, this.field5000, super.field7058, super.field7061, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZBILza;)Lhw;", line = 179)
    private final class396 method2163(boolean arg0, byte arg1, int arg2, class299 arg3) {
        ++field5002;
        if (arg1 <= 61) {
            return null;
        } else {
            class395 var5 = class247.field3693.method2281(65535 & this.field5008, -9380);
            class11 var6;
            class11 var7;
            if (!this.field4995) {
                var6 = class274.field4306[this.field5000];
                if (~this.field5000 <= -4) {
                    var7 = null;
                } else {
                    var7 = class274.field4306[this.field5000 + 1];
                }
            } else {
                var6 = class288.field4475[this.field5000];
                var7 = class274.field4306[0];
            }
            return var5.method2499(var6, arg2, 22, super.field7052, super.field7061, arg3, this.field4999, arg0, super.field7058, (byte) -71, var7);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lza;IZ)Le;", line = 211)
    public final class289 method111(class299 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            return null;
        } else {
            ++field5005;
            return this.method2165(arg1, arg0, true);
        }
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)V", line = 223)
    public final void method108(int arg0) {
        this.field4993 = false;
        ++field4991;
        int var2 = 44 % ((arg0 - 48) / 37);
        if (this.field4982 != null) {
            this.field4982.method662(-65537 & this.field4982.method679());
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)I", line = 238)
    public final int method103(int arg0) {
        ++field4998;
        return arg0 > -10 ? -101 : 22;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BIILsj;I)V", line = 250)
    public static final void method2164(byte arg0, int arg1, int arg2, class511 arg3, int arg4) {
        ++field4986;
        int var5 = arg3.field7654[0];
        int var6 = arg3.field7653[0];
        if (var5 >= 0 && ~var5 > ~class338.field5076 && ~var6 <= -1 && ~var6 > ~class250.field4077) {
            if (arg2 >= 0 && arg2 < class338.field5076 && arg1 >= 0 && ~arg1 > ~class250.field4077) {
                int var7 = class22.method137(-4, var6, arg2, arg1, class106.field1619, var5, 0, 0, true, 99999999, 0, 0, class463.field6857[arg3.field1274], class338.field5073, arg3.method3045(0));
                if (~var7 <= -2) {
                    if (~var7 >= -4) {
                        if (arg4 > -4) {
                            field5004 = null;
                        }
                        for (int var8 = 0; ~(var7 - 1) < ~var8; ++var8) {
                            arg3.method3042(class338.field5073[var8], 127, arg0, class106.field1619[var8]);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILza;)V", line = 287)
    public final void method98(int arg0, class299 arg1) {
        if (arg0 == 31203) {
            ++field4985;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILza;Z)Le;", line = 298)
    private final class289 method2165(int arg0, class299 arg1, boolean arg2) {
        if (!arg2) {
            this.field4995 = false;
        }
        ++field4990;
        if (this.field4982 != null && arg1.method589(this.field4982.method679(), arg0) == 0) {
            return this.field4982;
        } else {
            class396 var4 = this.method2163(false, (byte) 92, arg0, arg1);
            return var4 == null ? null : var4.field5853;
        }
    }

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "(B)V", line = 319)
    public static void method2166(byte arg0) {
        if (arg0 <= 103) {
            field5004 = null;
        }
        field5004 = null;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lza;Lii;IIIIZIZ)V", line = 332)
    public class331(class299 arg0, class395 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field5837, arg1.field5775, arg1.field5789);
        super.field7058 = arg3;
        this.field5007 = arg1.field5840 != 0 && !arg6;
        this.field4999 = (byte) arg7;
        super.field7061 = arg5;
        this.field4995 = arg6;
        this.field5000 = (byte) arg2;
        this.field5008 = (short) arg1.field5831;
        this.field4993 = arg8;
        this.field5009 = arg0.method573() && arg1.field5801 && !this.field4995 && ~class40.field667.method1836(127, class108.field1631) != -1;
        int var10 = 2048;
        if (this.field4993) {
            var10 |= 65536;
        }
        class396 var11 = this.method2163(this.field5009, (byte) 85, var10, arg0);
        if (var11 != null) {
            this.field4992 = var11.field5850;
            this.field4982 = var11.field5853;
            if (this.field4993) {
                this.field4982 = this.field4982.method669((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(B)Z", line = 365)
    public final boolean method107(byte arg0) {
        ++field4983;
        if (arg0 != -88) {
            this.field5000 = 58;
        }
        return this.field4993;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)Z", line = 376)
    public final boolean method104(byte arg0) {
        ++field5003;
        int var2 = 19 / ((arg0 - -41) / 38);
        return this.field5009;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lza;B)V", line = 389)
    public final void method96(class299 arg0, byte arg1) {
        if (arg1 <= 78) {
            this.field5007 = false;
        }
        ++field4988;
        Object var3 = null;
        class200 var5;
        if (this.field4992 == null && this.field5009) {
            class396 var4 = this.method2163(true, (byte) 89, 262144, arg0);
            var5 = var4 == null ? null : var4.field5850;
        } else {
            var5 = this.field4992;
            this.field4992 = null;
        }
        if (var5 != null) {
            class205.method1434(var5, this.field5000, super.field7058, super.field7061, (boolean[]) null);
        }
    }
}
