import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 extends class364 implements class351 {

    @OriginalMember(owner = "client!ro", name = "r", descriptor = "Z")
    private boolean field8;

    @OriginalMember(owner = "client!ro", name = "K", descriptor = "B")
    private byte field27;

    @OriginalMember(owner = "client!ro", name = "q", descriptor = "B")
    private byte field7;

    @OriginalMember(owner = "client!ro", name = "D", descriptor = "S")
    private short field20;

    @OriginalMember(owner = "client!ro", name = "F", descriptor = "B")
    private byte field22;

    @OriginalMember(owner = "client!ro", name = "M", descriptor = "Z")
    private boolean field29;

    @OriginalMember(owner = "client!ro", name = "z", descriptor = "Z")
    private boolean field16;

    @OriginalMember(owner = "client!ro", name = "L", descriptor = "Z")
    private boolean field28;

    @OriginalMember(owner = "client!ro", name = "Q", descriptor = "Lj;")
    private class377 field33;

    @OriginalMember(owner = "client!ro", name = "u", descriptor = "Lc;")
    public class121 field11;

    @OriginalMember(owner = "client!ro", name = "N", descriptor = "[I")
    public static int[] field30 = new int[4];

    @OriginalMember(owner = "client!ro", name = "S", descriptor = "J")
    public static volatile long field35;

    @OriginalMember(owner = "client!ro", name = "R", descriptor = "F")
    public static float field34;

    @OriginalMember(owner = "client!ro", name = "t", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!ro", name = "v", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!ro", name = "w", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!ro", name = "x", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!ro", name = "y", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!ro", name = "A", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!ro", name = "B", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!ro", name = "C", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!ro", name = "E", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!ro", name = "G", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!ro", name = "H", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!ro", name = "I", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!ro", name = "J", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!ro", name = "O", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!ro", name = "P", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!ro", name = "p", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!ro", name = "s", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lqa;IZI)Llp;")
    private final class266 method4(class162 arg0, int arg1, boolean arg2, int arg3) {
        ++field13;
        class519 var5 = class252.field3743.method2686(65535 & this.field20, (byte) 92);
        if (arg1 > -10) {
            this.field22 = 1;
        }
        class35 var6;
        class35 var7;
        if (!this.field29) {
            if (this.field7 >= 3) {
                var6 = null;
            } else {
                var6 = class307.field4415[this.field7 + 1];
            }
            var7 = class307.field4415[this.field7];
        } else {
            var7 = class31.field335[this.field7];
            var6 = class307.field4415[0];
        }
        return var5.method3060(this.field27, this.field22, super.field5572, arg2, arg3, var7, super.field5571, arg0, super.field5577, var6, 103);
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(B)I")
    public final int method5(byte arg0) {
        if (arg0 != -65) {
            field34 = 0.7689399F;
        }
        ++field18;
        return this.field27;
    }

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "(B)V")
    public static void method6(byte arg0) {
        field30 = null;
        if (arg0 >= -90) {
            field35 = 54L;
        }
    }

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "(B)Z")
    public final boolean method7(byte arg0) {
        if (arg0 < 1) {
            return false;
        } else {
            ++field23;
            return this.field28;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IILqa;B)Z")
    public final boolean method8(int arg0, int arg1, class162 arg2, byte arg3) {
        int var5 = -23 / ((arg3 - -12) / 36);
        ++field17;
        class121 var6 = this.method16((byte) -82, arg2, 131072);
        if (var6 != null) {
            class414 var7 = arg2.method1115();
            var7.method913(super.field5577, super.field5571, super.field5572);
            return var6.method706(arg0, arg1, var7, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILqa;I)Lc;")
    public final class121 method9(int arg0, class162 arg1, int arg2) {
        if (arg2 > -22) {
            return null;
        } else {
            ++field19;
            return this.method16((byte) -123, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(Lqa;Lkn;IIIIZIIZ)V")
    public class2(class162 arg0, class519 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class229.method1570(arg7, 0, arg8));
        this.field8 = arg9;
        this.field27 = (byte) arg7;
        super.field5572 = arg5;
        this.field7 = (byte) arg2;
        this.field20 = (short) arg1.field7580;
        this.field22 = (byte) arg8;
        super.field5577 = arg3;
        this.field29 = arg6;
        this.field16 = arg1.field7573 != 0 && !arg6;
        this.field28 = arg0.method1091() && arg1.field7628 && !this.field29 && ~class426.field6401.method393(class170.field2529, 1) != -1;
        int var11 = 2048;
        if (this.field8) {
            var11 |= 65536;
        }
        class266 var12 = this.method4(arg0, -95, this.field28, var11);
        if (var12 != null) {
            this.field33 = var12.field3889;
            this.field11 = var12.field3890;
            if (this.field8) {
                this.field11 = this.field11.method723((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(BLqa;)V")
    public final void method10(byte arg0, class162 arg1) {
        ++field12;
        if (arg0 != -32) {
            field35 = 100L;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILqa;)V")
    public final void method11(int arg0, class162 arg1) {
        ++field9;
        if (arg0 >= -107) {
            this.field22 = -93;
        }
        Object var3 = null;
        class377 var5;
        if (this.field33 == null && this.field28) {
            class266 var4 = this.method4(arg1, -39, true, 262144);
            var5 = var4 != null ? var4.field3889 : null;
        } else {
            var5 = this.field33;
            this.field33 = null;
        }
        if (var5 != null) {
            class429.method2564(var5, this.field7, super.field5577, super.field5572, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(ILqa;)Lnf;")
    public final class405 method12(int arg0, class162 arg1) {
        ++field26;
        if (this.field11 == null) {
            return null;
        } else {
            if (arg0 <= 120) {
                this.field29 = true;
            }
            class414 var3 = arg1.method1115();
            var3.method913(super.field5577, super.field5571, super.field5572);
            class405 var4 = null;
            if (this.field16) {
                var4 = class75.method427(1, 0);
            }
            this.field11.method720(var3, var4 == null ? null : var4.field6108[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "(B)V")
    public final void method13(byte arg0) {
        if (arg0 != -89) {
            this.field28 = true;
        }
        ++field24;
        this.field8 = false;
        if (this.field11 != null) {
            this.field11.method719(this.field11.method738() & -65537);
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lqa;B)V")
    public final void method14(class162 arg0, byte arg1) {
        if (arg1 == 72) {
            ++field31;
            Object var3 = null;
            class377 var5;
            if (this.field33 == null && this.field28) {
                class266 var4 = this.method4(arg0, -75, true, 262144);
                var5 = var4 != null ? var4.field3889 : null;
            } else {
                var5 = this.field33;
                this.field33 = null;
            }
            if (var5 != null) {
                class342.method2091(var5, this.field7, super.field5577, super.field5572, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)V")
    public final void method15(byte arg0) {
        if (this.field11 != null) {
            this.field11.method721();
        }
        if (arg0 > -10) {
            this.field7 = -27;
        }
        ++field14;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(BLqa;I)Lc;")
    private final class121 method16(byte arg0, class162 arg1, int arg2) {
        ++field21;
        if (this.field11 != null && arg1.method1122(this.field11.method738(), arg2) == 0) {
            return this.field11;
        } else {
            if (arg0 > -44) {
                this.method7((byte) 38);
            }
            class266 var4 = this.method4(arg1, -83, false, arg2);
            return var4 != null ? var4.field3890 : null;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)I")
    public final int method17(int arg0) {
        int var2 = -3 % ((-41 - arg0) / 61);
        ++field15;
        return this.field22;
    }

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "(I)Z")
    public final boolean method18(int arg0) {
        if (arg0 < 72) {
            return false;
        } else {
            ++field32;
            return this.field8;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZIILer;Lqa;IB)V")
    public final void method19(boolean arg0, int arg1, int arg2, class68 arg3, class162 arg4, int arg5, byte arg6) {
        if (arg6 > -105) {
            this.field29 = false;
        }
        ++field25;
        if (arg3 instanceof class2) {
            class2 var8 = (class2) arg3;
            if (this.field11 != null && var8.field11 != null) {
                this.field11.method722(var8.field11, arg1, arg2, arg5, arg0);
            }
        } else {
            if (arg3 instanceof class44) {
                class44 var9 = (class44) arg3;
                if (this.field11 != null && var9.field684 != null) {
                    this.field11.method722(var9.field684, arg1, arg2, arg5, arg0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(I)I")
    public final int method20(int arg0) {
        ++field6;
        if (arg0 != -30685) {
            this.field33 = null;
        }
        return 65535 & this.field20;
    }

    static {
        new class202("", 76);
        field35 = 0L;
    }
}
