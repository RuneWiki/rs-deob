import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class367 extends class597 {

    @OriginalMember(owner = "client!wj", name = "z", descriptor = "Z")
    public boolean field4734 = false;

    @OriginalMember(owner = "client!wj", name = "A", descriptor = "I")
    private int field4735 = 0;

    @OriginalMember(owner = "client!wj", name = "F", descriptor = "I")
    private int field4740 = 0;

    @OriginalMember(owner = "client!wj", name = "w", descriptor = "I")
    private int field4731 = -32768;

    @OriginalMember(owner = "client!wj", name = "P", descriptor = "I")
    private int field4750 = 0;

    @OriginalMember(owner = "client!wj", name = "U", descriptor = "I")
    private int field4755 = -1;

    @OriginalMember(owner = "client!wj", name = "C", descriptor = "I")
    private int field4737;

    @OriginalMember(owner = "client!wj", name = "u", descriptor = "I")
    public int field4729;

    @OriginalMember(owner = "client!wj", name = "M", descriptor = "I")
    private int field4747;

    @OriginalMember(owner = "client!wj", name = "I", descriptor = "Lcu;")
    private class207 field4743;

    @OriginalMember(owner = "client!wj", name = "B", descriptor = "Z")
    public static boolean field4736 = false;

    @OriginalMember(owner = "client!wj", name = "R", descriptor = "Z")
    public static boolean field4752 = false;

    @OriginalMember(owner = "client!wj", name = "S", descriptor = "Lcga;")
    public static class449 field4753 = new class449(47, -1);

    @OriginalMember(owner = "client!wj", name = "v", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!wj", name = "y", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!wj", name = "E", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!wj", name = "G", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!wj", name = "H", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!wj", name = "J", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!wj", name = "K", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!wj", name = "L", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!wj", name = "N", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!wj", name = "O", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!wj", name = "T", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!wj", name = "V", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!wj", name = "W", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!wj", name = "X", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!wj", name = "Y", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!wj", name = "D", descriptor = "Ll;")
    private class18 field4738;

    @OriginalMember(owner = "client!wj", name = "Q", descriptor = "Lhe;")
    public static class345 field4751;

    @OriginalMember(owner = "client!wj", name = "x", descriptor = "[[Lvw;")
    public static class284[][] field4732;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Loa;III)Lba;")
    private final class359 method2135(class650 arg0, int arg1, int arg2, int arg3) {
        ++field4749;
        class561 var5 = class339.field4336.method2158((byte) -25, arg1);
        if (arg3 != 0) {
            return null;
        } else {
            class140 var6 = class252.field3250[super.field8010];
            class140 var7 = ~this.field4747 > -4 ? class252.field3250[this.field4747 + 1] : null;
            return !this.field4734 ? var5.method2982(this.field4735, this.field4740, (byte) 2, super.field8018, var7, super.field8011, arg2, class11.field110, var6, super.field8013, this.field4755, true, arg0) : var5.method2982(0, -1, (byte) 2, super.field8018, var7, super.field8011, arg2, class11.field110, var6, super.field8013, -1, true, arg0);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZLoa;Lnt;IIII)V")
    public final void method135(boolean arg0, class650 arg1, class209 arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4759;
        if (arg6 != 12137) {
            this.finalize();
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)V")
    public final void method2136(int arg0, int arg1) {
        ++field4739;
        if (!this.field4734) {
            int var3 = 12 % ((arg0 - 22) / 60);
            this.field4735 += arg1;
            while (~this.field4743.field2436[this.field4740] > ~this.field4735) {
                this.field4735 -= this.field4743.field2436[this.field4740];
                ++this.field4740;
                if (this.field4743.field2441.length <= this.field4740) {
                    this.field4734 = true;
                    break;
                }
            }
            if (!this.field4734) {
                class526.method2841(-305539927, super.field8010, this.field4743, false, super.field8018, this.field4740, super.field8011);
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(Loa;B)V")
    public final void method7(class650 arg0, byte arg1) {
        ++field4741;
        class359 var3 = this.method2135(arg0, this.field4737, 0, 0);
        if (arg1 == 98) {
            if (var3 != null) {
                class396 var4 = arg0.method470();
                var4.method591(super.field8018, super.field8013, super.field8011);
                this.method2137(arg0, var4, arg1 + -95, var3);
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Loa;Lq;ILba;)V")
    private final void method2137(class650 arg0, class396 arg1, int arg2, class359 arg3) {
        arg3.method2067(arg1);
        ++field4742;
        if (arg2 == 3) {
            class556[] var5 = arg3.method2077();
            class493[] var6 = arg3.method2063();
            if ((this.field4738 == null || this.field4738.field181) && (var5 != null || var6 != null)) {
                this.field4738 = class18.method101(class665.field9027, true);
            }
            if (this.field4738 != null) {
                this.field4738.method111(arg0, (long) class665.field9027, var5, var6, false);
                this.field4738.method103(super.field8010, super.field8017, super.field8005, super.field8014, super.field8008);
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z)V")
    public static final void method2138(boolean arg0) {
        ++field4756;
        class442.field5572 = 0;
        int var1 = class222.field2585.method3097((byte) 12);
        int var2 = class222.field2585.method3084((byte) 65);
        int var3 = class222.field2585.method3096(-54);
        boolean var4 = ~class222.field2585.method3063(0) == -2;
        class693.method3827((byte) -26);
        class107.method752(var1, (byte) 26);
        int var5 = (-class222.field2585.field7313 + class10.field100) / 16;
        class589.field7901 = new int[var5][4];
        for (int var6 = 0; ~var6 > ~var5; ++var6) {
            for (int var10 = 0; ~var10 > -5; ++var10) {
                class589.field7901[var6][var10] = class222.field2585.method3064(-2031091464);
            }
        }
        class14.field139 = new int[var5];
        class576.field7563 = new int[var5];
        if (arg0) {
            class599.field8032 = null;
            class307.field3888 = new int[var5];
            class418.field5342 = new byte[var5][];
            class523.field6614 = new byte[var5][];
            class257.field3289 = null;
            class340.field4340 = new byte[var5][];
            class269.field3416 = new int[var5];
            class552.field6912 = new byte[var5][];
            class657.field8938 = new int[var5];
            int var7 = 0;
            for (int var8 = (var2 - (class85.field1090 >> 4)) / 8; ~var8 >= ~(((class85.field1090 >> 4) + var2) / 8); ++var8) {
                for (int var9 = (-(class656.field8932 >> 4) + var3) / 8; ((class656.field8932 >> 4) + var3) / 8 >= var9; ++var9) {
                    class307.field3888[var7] = (var8 << 8) - -var9;
                    class576.field7563[var7] = class109.field1364.method1651("m" + var8 + "_" + var9, (byte) 77);
                    class269.field3416[var7] = class109.field1364.method1651("l" + var8 + "_" + var9, (byte) 77);
                    class14.field139[var7] = class109.field1364.method1651("um" + var8 + "_" + var9, (byte) 77);
                    class657.field8938[var7] = class109.field1364.method1651("ul" + var8 + "_" + var9, (byte) 77);
                    ++var7;
                }
            }
            class250.method1509(9840, var4, 11, var3, var2);
        }
    }

    @OriginalMember(owner = "client!wj", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field4746;
        if (this.field4738 != null) {
            this.field4738.method110();
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(III)I")
    public static final int method2139(int arg0, int arg1, int arg2) {
        ++field4733;
        if (arg0 != 3) {
            return 99;
        } else {
            return ~arg2 != -2 && arg2 != 3 ? class167.field1959[3 & arg1] : class30.field351[arg1 & 3];
        }
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(Loa;I)Lqt;")
    public final class595 method6(class650 arg0, int arg1) {
        ++field4757;
        return arg1 != -7459 ? null : null;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILoa;)Lww;")
    public final class686 method11(int arg0, class650 arg1) {
        ++field4744;
        class359 var3 = this.method2135(arg1, this.field4737, (this.field4750 != 0 ? 5 : 0) | 2048, 0);
        if (arg0 > -89) {
            this.field4731 = 80;
        }
        if (var3 == null) {
            return null;
        } else {
            if (this.field4750 != 0) {
                var3.method2053(this.field4750 * 2048);
            }
            class396 var4 = arg1.method470();
            var4.method591(super.field8018, super.field8013, super.field8011);
            this.method2137(arg1, var4, 3, var3);
            if (this.field4738 != null) {
                class228 var5 = this.field4738.method105();
                arg1.method427(var3, var5, var4, (class524) null, 0);
            } else {
                var3.method2049(var4, (class524) null, 0);
            }
            this.field4731 = var3.method2084();
            return null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V")
    public static void method2140(byte arg0) {
        field4751 = null;
        if (arg0 == 105) {
            field4753 = null;
            field4732 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(I)Z")
    public final boolean method137(int arg0) {
        if (arg0 > -30) {
            method2138(false);
        }
        ++field4730;
        return false;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
    public final void method2141(int arg0) {
        ++field4758;
        if (this.field4738 != null) {
            this.field4738.method110();
        }
        if (arg0 >= -52) {
            this.method2141(-59);
        }
    }

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "(I)I")
    public final int method2117(int arg0) {
        if (arg0 != 9295) {
            this.field4750 = 98;
        }
        ++field4754;
        return this.field4731;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BILoa;I)Z")
    public final boolean method8(byte arg0, int arg1, class650 arg2, int arg3) {
        int var5 = -127 % ((arg0 - 77) / 40);
        ++field4745;
        return false;
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(B)V")
    public final void method140(byte arg0) {
        ++field4748;
        int var2 = -49 % ((-16 - arg0) / 40);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
    public class367(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field4737 = arg0;
        this.field4729 = arg1 + arg2;
        this.field4750 = arg12;
        this.field4747 = arg4;
        class561 var14 = class339.field4336.method2158((byte) -25, this.field4737);
        int var15 = var14.field7016;
        if (~var15 != 0) {
            this.field4743 = class11.field110.method1141(var15, (byte) -22);
            this.field4734 = false;
        } else {
            this.field4734 = true;
        }
        if (this.field4729 == arg2) {
            class526.method2841(-305539927, super.field8010, this.field4743, false, super.field8018, this.field4740, super.field8011);
        }
    }
}
