import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class551 extends class293 implements class289 {

    @OriginalMember(owner = "client!vq", name = "w", descriptor = "Lkd;")
    public class156 field7530;

    @OriginalMember(owner = "client!vq", name = "L", descriptor = "Z")
    private boolean field7545;

    @OriginalMember(owner = "client!vq", name = "G", descriptor = "[F")
    public static float[] field7540 = new float[4];

    @OriginalMember(owner = "client!vq", name = "t", descriptor = "I")
    public static int field7527;

    @OriginalMember(owner = "client!vq", name = "u", descriptor = "I")
    public static int field7528;

    @OriginalMember(owner = "client!vq", name = "v", descriptor = "I")
    public static int field7529;

    @OriginalMember(owner = "client!vq", name = "x", descriptor = "I")
    public static int field7531;

    @OriginalMember(owner = "client!vq", name = "y", descriptor = "I")
    public static int field7532;

    @OriginalMember(owner = "client!vq", name = "z", descriptor = "I")
    public static int field7533;

    @OriginalMember(owner = "client!vq", name = "B", descriptor = "I")
    public static int field7535;

    @OriginalMember(owner = "client!vq", name = "C", descriptor = "I")
    public static int field7536;

    @OriginalMember(owner = "client!vq", name = "D", descriptor = "I")
    public static int field7537;

    @OriginalMember(owner = "client!vq", name = "E", descriptor = "I")
    public static int field7538;

    @OriginalMember(owner = "client!vq", name = "F", descriptor = "I")
    public static int field7539;

    @OriginalMember(owner = "client!vq", name = "H", descriptor = "I")
    public static int field7541;

    @OriginalMember(owner = "client!vq", name = "I", descriptor = "I")
    public static int field7542;

    @OriginalMember(owner = "client!vq", name = "J", descriptor = "I")
    public static int field7543;

    @OriginalMember(owner = "client!vq", name = "K", descriptor = "I")
    public static int field7544;

    @OriginalMember(owner = "client!vq", name = "M", descriptor = "I")
    public static int field7546;

    @OriginalMember(owner = "client!vq", name = "N", descriptor = "I")
    public static int field7547;

    @OriginalMember(owner = "client!vq", name = "A", descriptor = "Lvg;")
    private class162 field7534;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Z)Z")
    public final boolean method122(boolean arg0) {
        ++field7539;
        if (arg0) {
            this.field7530 = null;
        }
        return this.field7530.method1042(77);
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(Z)V")
    public final void method132(boolean arg0) {
        if (!arg0) {
            this.method122(true);
        }
        ++field7533;
    }

    @OriginalMember(owner = "client!vq", name = "h", descriptor = "(I)V")
    public static void method3091(int arg0) {
        if (arg0 != 21268) {
            method3091(60);
        }
        field7540 = null;
    }

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "(I)Z")
    public final boolean method135(int arg0) {
        if (arg0 != 0) {
            this.field7530 = null;
        }
        ++field7536;
        return false;
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(ILoa;)V")
    public final void method129(int arg0, class689 arg1) {
        ++field7531;
        this.field7530.method1041((byte) -85, arg1);
        if (arg0 != 27921) {
            this.method122(true);
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Loa;B)Llt;")
    public final class95 method136(class689 arg0, byte arg1) {
        ++field7542;
        class629 var3 = this.field7530.method1039(true, 2048, super.field3929, super.field3917, 0, arg0, false);
        if (var3 == null) {
            return null;
        } else {
            if (arg1 >= -47) {
                field7540 = null;
            }
            class111 var4 = arg0.method1972();
            var4.method609(super.field3929, super.field3930, super.field3917);
            class95 var5 = null;
            if (this.field7545) {
                var5 = class429.method2472(1, (byte) -86);
            }
            this.field7530.method1040(arg0, var4, super.field3928, super.field3923, var3, super.field3921, super.field3920, (byte) -75, true);
            if (this.field7530.field1943 != null) {
                class309 var6 = this.field7530.field1943.method721();
                arg0.method1892(var3, var6, var4, var5 != null ? var5.field1175[0] : null, 0);
            } else {
                var3.method665(var4, var5 != null ? var5.field1175[0] : null, 0);
            }
            if (this.field7534 == null) {
                this.field7534 = class440.method2525(255, var3, super.field3929, super.field3930, super.field3917);
            } else {
                class611.method3365(super.field3930, 96, super.field3929, var3, this.field7534, super.field3917);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(BLoa;)Lvg;")
    public final class162 method134(byte arg0, class689 arg1) {
        if (arg0 <= 121) {
            return null;
        } else {
            ++field7547;
            return this.field7534;
        }
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(BLoa;)V")
    public final void method123(byte arg0, class689 arg1) {
        if (arg0 > 91) {
            ++field7528;
            class629 var3 = this.field7530.method1039(true, 262144, super.field3929, super.field3917, 0, arg1, true);
            if (var3 != null) {
                class111 var4 = arg1.method1972();
                var4.method609(super.field3929, super.field3930, super.field3917);
                this.field7530.method1040(arg1, var4, super.field3928, super.field3923, var3, super.field3921, super.field3920, (byte) -72, false);
            }
        }
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Loa;Luca;IIIIIZIIIIIII)V")
    public class551(class689 arg0, class252 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field3415 == 1, class40.method244(arg12, arg13, 19218));
        this.field7530 = new class156(arg0, arg1, arg12, arg13, super.field3925, arg3, arg4, arg6, arg7, arg14);
        this.field7545 = ~arg1.field3453 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "(I)V")
    public final void method127(int arg0) {
        ++field7546;
        if (arg0 >= 118) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIILoa;)Z")
    public final boolean method137(int arg0, int arg1, int arg2, class689 arg3) {
        ++field7541;
        class629 var5 = this.field7530.method1039(false, 131072, super.field3929, super.field3917, 0, arg3, false);
        if (var5 == null) {
            return false;
        } else {
            if (arg2 < 117) {
                this.method123((byte) -43, (class689) null);
            }
            class111 var6 = arg3.method1972();
            var6.method609(super.field3929, super.field3930, super.field3917);
            return var5.method695(arg0, arg1, var6, false);
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)I")
    public final int method128(byte arg0) {
        if (arg0 <= 35) {
            return -73;
        } else {
            ++field7544;
            return this.field7530.field1952;
        }
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)I")
    public final int method130(int arg0) {
        if (arg0 != -5582) {
            return 105;
        } else {
            ++field7538;
            return this.field7530.field1960;
        }
    }

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "(I)I")
    public final int method1738(int arg0) {
        if (arg0 != 3891) {
            this.field7545 = true;
        }
        ++field7537;
        return this.field7530.method1038((byte) 107);
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(ILoa;)V")
    public final void method131(int arg0, class689 arg1) {
        this.field7530.method1037(106, arg1);
        if (arg0 != -20929) {
            this.method137(-118, -98, -47, (class689) null);
        }
        ++field7543;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)I")
    public final int method126(int arg0) {
        if (arg0 != 20377) {
            return -72;
        } else {
            ++field7527;
            return this.field7530.field1961;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lbo;ILoa;IIIZ)V")
    public final void method133(class631 arg0, int arg1, class689 arg2, int arg3, int arg4, int arg5, boolean arg6) {
        ++field7529;
        if (arg4 != -8763) {
            this.method136((class689) null, (byte) -7);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IILoa;)Lba;")
    public final class629 method124(int arg0, int arg1, class689 arg2) {
        ++field7532;
        if (arg1 != 17925) {
            this.method132(false);
        }
        return this.field7530.method1039(false, arg0, 0, 0, 0, arg2, false);
    }
}
