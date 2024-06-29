import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class44 extends class117 implements class351 {

    @OriginalMember(owner = "client!dl", name = "G", descriptor = "Z")
    private boolean field689;

    @OriginalMember(owner = "client!dl", name = "ab", descriptor = "S")
    private short field709;

    @OriginalMember(owner = "client!dl", name = "B", descriptor = "Z")
    private boolean field685;

    @OriginalMember(owner = "client!dl", name = "K", descriptor = "B")
    private byte field693;

    @OriginalMember(owner = "client!dl", name = "w", descriptor = "B")
    private byte field680;

    @OriginalMember(owner = "client!dl", name = "I", descriptor = "B")
    private byte field691;

    @OriginalMember(owner = "client!dl", name = "E", descriptor = "Z")
    private boolean field687;

    @OriginalMember(owner = "client!dl", name = "Q", descriptor = "Z")
    private boolean field699;

    @OriginalMember(owner = "client!dl", name = "y", descriptor = "Lj;")
    private class377 field682;

    @OriginalMember(owner = "client!dl", name = "A", descriptor = "Lc;")
    public class121 field684;

    @OriginalMember(owner = "client!dl", name = "O", descriptor = "Lki;")
    public static class498 field697 = new class498(45, 7);

    @OriginalMember(owner = "client!dl", name = "Y", descriptor = "[Loq;")
    public static class239[] field707 = new class239[2048];

    @OriginalMember(owner = "client!dl", name = "bb", descriptor = "[I")
    public static int[] field710 = new int[14];

    @OriginalMember(owner = "client!dl", name = "x", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!dl", name = "z", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!dl", name = "D", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!dl", name = "F", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!dl", name = "H", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!dl", name = "J", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!dl", name = "L", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!dl", name = "M", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!dl", name = "N", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!dl", name = "P", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!dl", name = "R", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!dl", name = "S", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!dl", name = "T", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!dl", name = "U", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!dl", name = "V", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!dl", name = "W", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!dl", name = "X", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!dl", name = "Z", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!dl", name = "cb", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!dl", name = "db", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!dl", name = "eb", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)I", line = 3)
    public final int method20(int arg0) {
        if (arg0 != -30685) {
            this.field709 = -78;
        }
        ++field703;
        return this.field709 & 65535;
    }

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "(B)V", line = 16)
    public final void method13(byte arg0) {
        this.field685 = false;
        if (arg0 != -89) {
            this.method11(-54, (class162) null);
        }
        ++field683;
        if (this.field684 != null) {
            this.field684.method719(this.field684.method738() & -65537);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILqa;)V", line = 32)
    public final void method11(int arg0, class162 arg1) {
        if (arg0 >= -107) {
            this.field693 = -114;
        }
        ++field698;
        Object var3 = null;
        class377 var5;
        if (this.field682 == null && this.field699) {
            class266 var4 = this.method282(true, 59, 262144, arg1);
            var5 = var4 != null ? var4.field3889 : null;
        } else {
            var5 = this.field682;
            this.field682 = null;
        }
        if (var5 != null) {
            class429.method2564(var5, this.field691, super.field1763, super.field1769, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(B)I", line = 60)
    public final int method5(byte arg0) {
        ++field708;
        return arg0 != -65 ? -70 : this.field693;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IILqa;B)Z", line = 72)
    public final boolean method8(int arg0, int arg1, class162 arg2, byte arg3) {
        ++field692;
        int var5 = 63 / ((arg3 - -12) / 36);
        class121 var6 = this.method286(-123, 131072, arg2);
        if (var6 != null) {
            class414 var7 = arg2.method1115();
            var7.method913(super.field1763, super.field1766, super.field1769);
            return var6.method706(arg0, arg1, var7, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lqa;B)V", line = 93)
    public final void method14(class162 arg0, byte arg1) {
        ++field705;
        Object var3 = null;
        class377 var5;
        if (this.field682 == null && this.field699) {
            class266 var4 = this.method282(true, arg1 + -23, 262144, arg0);
            var5 = var4 == null ? null : var4.field3889;
        } else {
            var5 = this.field682;
            this.field682 = null;
        }
        if (var5 != null) {
            class342.method2091(var5, this.field691, super.field1763, super.field1769, (boolean[]) null);
        }
        if (arg1 != 72) {
            this.method281(113);
        }
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(B)Z", line = 124)
    public final boolean method7(byte arg0) {
        ++field700;
        if (arg0 <= 1) {
            this.field691 = 107;
        }
        return this.field699;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BLqa;)V", line = 136)
    public final void method10(byte arg0, class162 arg1) {
        ++field696;
        if (arg0 != -32) {
            this.method13((byte) 107);
        }
    }

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "(I)I", line = 146)
    public final int method281(int arg0) {
        ++field681;
        if (arg0 != -24408) {
            return 94;
        } else {
            return this.field684 != null ? this.field684.method711() / 4 : 15;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZIILqa;)Llp;", line = 157)
    private final class266 method282(boolean arg0, int arg1, int arg2, class162 arg3) {
        if (arg1 < 41) {
            this.method17(71);
        }
        ++field701;
        class519 var5 = class252.field3743.method2686(this.field709 & 65535, (byte) 116);
        class35 var6;
        class35 var7;
        if (this.field689) {
            var6 = class307.field4415[0];
            var7 = class31.field335[this.field691];
        } else {
            if (this.field691 >= 3) {
                var6 = null;
            } else {
                var6 = class307.field4415[this.field691 + 1];
            }
            var7 = class307.field4415[this.field691];
        }
        return var5.method3060(this.field693 == 11 ? 10 : this.field693, ~this.field693 == -12 ? this.field680 + 4 : this.field680, super.field1769, arg0, arg2, var7, super.field1766, arg3, super.field1763, var6, 63);
    }

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "(I)I", line = 187)
    public final int method283(int arg0) {
        ++field695;
        if (arg0 != 16490) {
            return 68;
        } else {
            return this.field684 == null ? 0 : this.field684.method709();
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)I", line = 200)
    public final int method17(int arg0) {
        ++field688;
        int var2 = 56 % ((arg0 - -41) / 61);
        return this.field680;
    }

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "(B)V", line = 210)
    public static final void method284(byte arg0) {
        if (arg0 != -114) {
            field707 = null;
        }
        class285.field4100 = new String[500];
        class397.field5947 = class163.field2401.field3980 - -2 + class163.field2401.field3988;
        ++field713;
        class271.field3944 = class202.field2927.field3980 + 2 + class202.field2927.field3988;
        for (int var1 = 0; ~class285.field4100.length < ~var1; ++var1) {
            class285.field4100[var1] = "";
        }
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lqa;Lkn;IIIIIZIIIIIIZ)V", line = 234)
    public class44(class162 arg0, class519 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field7658 == 1, class150.method982((byte) -85, arg13, arg12));
        this.field689 = arg7;
        this.field709 = (short) arg1.field7580;
        this.field685 = arg14;
        this.field693 = (byte) arg12;
        this.field680 = (byte) arg13;
        this.field691 = (byte) arg3;
        this.field687 = ~arg1.field7573 != -1 && !arg7;
        this.field699 = arg0.method1091() && arg1.field7628 && !this.field689 && ~class426.field6401.method393(class170.field2529, 1) != -1;
        int var16 = 2048;
        if (this.field685) {
            var16 |= 65536;
        }
        class266 var17 = this.method282(this.field699, 67, var16, arg0);
        if (var17 != null) {
            this.field682 = var17.field3889;
            this.field684 = var17.field3890;
            if (this.field685) {
                this.field684 = this.field684.method723((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILqa;I)Lc;", line = 266)
    public final class121 method9(int arg0, class162 arg1, int arg2) {
        if (arg2 > -22) {
            return null;
        } else {
            ++field702;
            return this.method286(-121, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(ILqa;)Lnf;", line = 281)
    public final class405 method12(int arg0, class162 arg1) {
        ++field694;
        if (this.field684 == null) {
            return null;
        } else {
            class414 var3 = arg1.method1115();
            var3.method913(super.field1763, super.field1766, super.field1769);
            class405 var4 = null;
            if (this.field687) {
                var4 = class75.method427(1, 0);
            }
            if (arg0 <= 120) {
                return null;
            } else {
                this.field684.method720(var3, var4 == null ? null : var4.field6108[0], 0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(I)Z", line = 311)
    public final boolean method18(int arg0) {
        if (arg0 <= 72) {
            return true;
        } else {
            ++field686;
            return this.field685;
        }
    }

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "(I)V", line = 323)
    public static void method285(int arg0) {
        field697 = null;
        field710 = null;
        field707 = null;
        if (arg0 != 1) {
            method284((byte) 117);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IILqa;)Lc;", line = 345)
    private final class121 method286(int arg0, int arg1, class162 arg2) {
        ++field704;
        if (this.field684 != null && arg2.method1122(this.field684.method738(), arg1) == 0) {
            return this.field684;
        } else if (arg0 > -108) {
            return null;
        } else {
            class266 var4 = this.method282(false, 52, arg1, arg2);
            return var4 == null ? null : var4.field3890;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZIILer;Lqa;IB)V", line = 365)
    public final void method19(boolean arg0, int arg1, int arg2, class68 arg3, class162 arg4, int arg5, byte arg6) {
        ++field712;
        if (arg6 > -105) {
            this.method5((byte) -64);
        }
        if (arg3 instanceof class2) {
            class2 var8 = (class2) arg3;
            if (this.field684 != null && var8.field11 != null) {
                this.field684.method722(var8.field11, arg1, arg2, arg5, arg0);
            }
        } else {
            if (arg3 instanceof class44) {
                class44 var9 = (class44) arg3;
                if (this.field684 != null && var9.field684 != null) {
                    this.field684.method722(var9.field684, arg1, arg2, arg5, arg0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V", line = 396)
    public final void method15(byte arg0) {
        ++field706;
        if (this.field684 != null) {
            this.field684.method721();
        }
        if (arg0 > -10) {
            this.method10((byte) -123, (class162) null);
        }
    }
}
