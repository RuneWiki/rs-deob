import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class363 extends class477 implements class532 {

    @OriginalMember(owner = "client!lp", name = "K", descriptor = "B")
    private byte field4911;

    @OriginalMember(owner = "client!lp", name = "j", descriptor = "Z")
    private boolean field4884;

    @OriginalMember(owner = "client!lp", name = "I", descriptor = "S")
    private short field4909;

    @OriginalMember(owner = "client!lp", name = "n", descriptor = "B")
    private byte field4888;

    @OriginalMember(owner = "client!lp", name = "G", descriptor = "Z")
    private boolean field4907;

    @OriginalMember(owner = "client!lp", name = "J", descriptor = "B")
    private byte field4910;

    @OriginalMember(owner = "client!lp", name = "m", descriptor = "Z")
    private boolean field4887;

    @OriginalMember(owner = "client!lp", name = "C", descriptor = "Z")
    private boolean field4903;

    @OriginalMember(owner = "client!lp", name = "A", descriptor = "Lba;")
    public class358 field4901;

    @OriginalMember(owner = "client!lp", name = "u", descriptor = "Lw;")
    private class276 field4895;

    @OriginalMember(owner = "client!lp", name = "l", descriptor = "Llj;")
    public static class570 field4886 = new class570(15, 0, 1, 0);

    @OriginalMember(owner = "client!lp", name = "L", descriptor = "Z")
    public static boolean field4912 = false;

    @OriginalMember(owner = "client!lp", name = "o", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!lp", name = "p", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!lp", name = "q", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!lp", name = "r", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!lp", name = "s", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!lp", name = "t", descriptor = "I")
    public static int field4894;

    @OriginalMember(owner = "client!lp", name = "v", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!lp", name = "w", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!lp", name = "x", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!lp", name = "y", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!lp", name = "z", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!lp", name = "B", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!lp", name = "D", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!lp", name = "E", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!lp", name = "F", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!lp", name = "H", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!lp", name = "M", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!lp", name = "N", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!lp", name = "O", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!lp", name = "P", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!lp", name = "k", descriptor = "Ldd;")
    private class660 field4885;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Loa;Z)V", line = 4)
    public final void method147(class651 arg0, boolean arg1) {
        ++field4902;
        if (!arg1) {
            this.field4884 = true;
        }
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(B)I", line = 16)
    public final int method151(byte arg0) {
        if (arg0 != 78) {
            return 62;
        } else {
            ++field4892;
            return this.field4888;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Z)V", line = 29)
    public final void method144(boolean arg0) {
        if (this.field4901 != null) {
            this.field4901.method1913();
        }
        if (arg0) {
            method2145(-55);
        }
        ++field4905;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILoa;B)Lba;", line = 45)
    private final class358 method2144(int arg0, class651 arg1, byte arg2) {
        ++field4893;
        if (this.field4901 != null && arg1.method376(this.field4901.method1945(), arg0) == 0) {
            return this.field4901;
        } else {
            if (arg2 != 4) {
                this.field4909 = 116;
            }
            class392 var4 = this.method2148(-123, false, arg1, arg0);
            return var4 != null ? var4.field5169 : null;
        }
    }

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "(B)V", line = 66)
    public final void method142(byte arg0) {
        this.field4887 = false;
        if (arg0 == -77) {
            ++field4906;
            if (this.field4901 != null) {
                this.field4901.method1899(-65537 & this.field4901.method1945());
            }
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILoa;ILni;ZZI)V", line = 84)
    public final void method141(int arg0, class651 arg1, int arg2, class487 arg3, boolean arg4, boolean arg5, int arg6) {
        if (arg3 instanceof class363) {
            class363 var8 = (class363) arg3;
            if (this.field4901 != null && var8.field4901 != null) {
                this.field4901.method1923(var8.field4901, arg0, arg2, arg6, arg4);
            }
        } else if (arg3 instanceof class268) {
            class268 var9 = (class268) arg3;
            if (this.field4901 != null && var9.field3721 != null) {
                this.field4901.method1923(var9.field3721, arg0, arg2, arg6, arg4);
            }
        }
        ++field4904;
        if (!arg5) {
            this.field4901 = null;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)Z", line = 116)
    public final boolean method150(byte arg0) {
        if (arg0 >= -34) {
            this.field4903 = false;
        }
        ++field4899;
        return this.field4903;
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(Z)I", line = 128)
    public final int method146(boolean arg0) {
        ++field4914;
        if (arg0) {
            method2146((byte) -22);
        }
        return 65535 & this.field4909;
    }

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "(Z)I", line = 145)
    public final int method152(boolean arg0) {
        if (!arg0) {
            this.method144(false);
        }
        ++field4898;
        return this.field4910;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILoa;)Ldd;", line = 156)
    public final class660 method143(int arg0, class651 arg1) {
        ++field4915;
        if (arg0 != 31358) {
            field4886 = null;
        }
        if (this.field4885 == null) {
            this.field4885 = class516.method2881(super.field6355, true, this.method2144(0, arg1, (byte) 4), super.field6359, super.field6361);
        }
        return this.field4885;
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)V", line = 172)
    public static void method2145(int arg0) {
        field4886 = null;
        int var1 = 54 % ((arg0 - -14) / 50);
    }

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "(B)V", line = 182)
    public static final void method2146(byte arg0) {
        if (arg0 < 61) {
            field4912 = false;
        }
        ++field4894;
        class8.field192 = new class117(class72.field1068.method546(class516.field6892, (byte) -35), "", class428.field5883, 1001, -1, 0L, 0, 0, true, false);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Loa;I)V", line = 197)
    public final void method138(class651 arg0, int arg1) {
        ++field4891;
        Object var3 = null;
        if (arg1 == 2215) {
            class276 var5;
            if (this.field4895 == null && this.field4903) {
                class392 var4 = this.method2148(-23, true, arg0, 262144);
                var5 = var4 == null ? null : var4.field5170;
            } else {
                var5 = this.field4895;
                this.field4895 = null;
            }
            if (var5 != null) {
                class232.method1447(var5, this.field4911, super.field6359, super.field6361, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(BILoa;I)Z", line = 224)
    public final boolean method149(byte arg0, int arg1, class651 arg2, int arg3) {
        int var5 = -68 % ((-26 - arg0) / 38);
        ++field4897;
        class358 var6 = this.method2144(131072, arg2, (byte) 4);
        if (var6 != null) {
            class397 var7 = arg2.method455();
            var7.method576(super.field6359, super.field6355, super.field6361);
            return var6.method1931(arg3, arg1, var7, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Loa;B)V", line = 244)
    public final void method148(class651 arg0, byte arg1) {
        ++field4900;
        Object var3 = null;
        if (arg1 != 70) {
            this.method145((byte) 50, (class651) null);
        }
        class276 var5;
        if (this.field4895 == null && this.field4903) {
            class392 var4 = this.method2148(-109, true, arg0, 262144);
            var5 = var4 == null ? null : var4.field5170;
        } else {
            var5 = this.field4895;
            this.field4895 = null;
        }
        if (var5 != null) {
            class486.method2723(var5, this.field4911, super.field6359, super.field6361, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Loa;BI)Lba;", line = 274)
    public final class358 method137(class651 arg0, byte arg1, int arg2) {
        ++field4889;
        if (arg1 != -47) {
            this.field4903 = true;
        }
        return this.method2144(arg2, arg0, (byte) 4);
    }

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Loa;Lbd;IIIIZIIZ)V", line = 285)
    public class363(class651 arg0, class58 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class47.method322(arg8, arg7, 123));
        this.field4911 = (byte) arg2;
        super.field6361 = arg5;
        this.field4884 = arg6;
        super.field6359 = arg3;
        this.field4909 = (short) arg1.field824;
        this.field4888 = (byte) arg7;
        this.field4907 = arg1.field816 != 0 && !arg6;
        this.field4910 = (byte) arg8;
        this.field4887 = arg9;
        this.field4903 = arg0.method404() && arg1.field877 && !this.field4884 && ~class344.field4718.method2329(108, class571.field7587) != -1;
        int var11 = 2048;
        if (this.field4887) {
            var11 |= 65536;
        }
        class392 var12 = this.method2148(-106, this.field4903, arg0, var11);
        if (var12 != null) {
            this.field4901 = var12.field5169;
            this.field4895 = var12.field5170;
            if (this.field4887) {
                this.field4901 = this.field4901.method1519((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)Z", line = 320)
    public final boolean method139(int arg0) {
        if (arg0 != 2) {
            this.method147((class651) null, false);
        }
        ++field4896;
        return this.field4887;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(BLoa;)Lpe;", line = 333)
    public final class571 method145(byte arg0, class651 arg1) {
        ++field4916;
        if (this.field4901 == null) {
            return null;
        } else {
            class397 var3 = arg1.method455();
            if (arg0 != 124) {
                return null;
            } else {
                var3.method576(super.field6359, super.field6355, super.field6361);
                class571 var4 = null;
                if (this.field4907) {
                    var4 = class157.method1100((byte) -118, 1);
                }
                this.field4901.method1947(var3, var4 != null ? var4.field7581[0] : null, 0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "(I)V", line = 359)
    public static final void method2147(int arg0) {
        class247.field3441 = new class267(8);
        ++field4890;
        class666.field9456 = 0;
        for (class485 var1 = (class485) class98.field1476.method328(0); var1 != null; var1 = (class485) class98.field1476.method331((byte) 116)) {
            var1.method2716();
        }
        int var2 = 98 % ((arg0 - -65) / 44);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IZLoa;I)Lun;", line = 381)
    private final class392 method2148(int arg0, boolean arg1, class651 arg2, int arg3) {
        if (arg0 >= -9) {
            this.method143(74, (class651) null);
        }
        ++field4913;
        class58 var5 = class470.field6288.method1258(this.field4909 & 65535, (byte) -40);
        class139 var6;
        class139 var7;
        if (this.field4884) {
            var6 = class467.field6283[this.field4911];
            var7 = class684.field9625[0];
        } else {
            if (~this.field4911 <= -4) {
                var7 = null;
            } else {
                var7 = class684.field9625[this.field4911 + 1];
            }
            var6 = class684.field9625[this.field4911];
        }
        return var5.method472(var7, super.field6359, super.field6361, arg3, super.field6355, arg2, (byte) -112, arg1, this.field4888, var6, this.field4910);
    }
}
