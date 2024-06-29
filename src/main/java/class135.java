import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class135 extends class100 implements class448 {

    @OriginalMember(owner = "client!pk", name = "Y", descriptor = "B")
    private byte field1788;

    @OriginalMember(owner = "client!pk", name = "J", descriptor = "B")
    private byte field1773;

    @OriginalMember(owner = "client!pk", name = "R", descriptor = "B")
    private byte field1781;

    @OriginalMember(owner = "client!pk", name = "F", descriptor = "Z")
    private boolean field1769;

    @OriginalMember(owner = "client!pk", name = "O", descriptor = "S")
    private short field1778;

    @OriginalMember(owner = "client!pk", name = "Q", descriptor = "Z")
    private boolean field1780;

    @OriginalMember(owner = "client!pk", name = "U", descriptor = "Z")
    private boolean field1784;

    @OriginalMember(owner = "client!pk", name = "K", descriptor = "Li;")
    private class31 field1774;

    @OriginalMember(owner = "client!pk", name = "D", descriptor = "Le;")
    private class373 field1767;

    @OriginalMember(owner = "client!pk", name = "W", descriptor = "Lho;")
    public static class103 field1786 = new class103(65, 7);

    @OriginalMember(owner = "client!pk", name = "E", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!pk", name = "G", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!pk", name = "H", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!pk", name = "I", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!pk", name = "L", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!pk", name = "M", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!pk", name = "N", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!pk", name = "P", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!pk", name = "S", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!pk", name = "T", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!pk", name = "V", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!pk", name = "X", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!pk", name = "Z", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!pk", name = "ab", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!pk", name = "bb", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!pk", name = "cb", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!pk", name = "db", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!pk", name = "eb", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!pk", name = "fb", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)I")
    public final int method46(int arg0) {
        ++field1783;
        int var2 = 43 % ((-18 - arg0) / 42);
        return 65535 & this.field1778;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)I")
    public final int method48(byte arg0) {
        ++field1790;
        return arg0 != -70 ? 2 : this.field1788;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BLza;)V")
    public final void method49(byte arg0, class287 arg1) {
        if (arg0 != -56) {
            method811((class16) null, (class361) null, true);
        }
        ++field1793;
        Object var3 = null;
        class31 var5;
        if (this.field1774 == null && this.field1784) {
            class190 var4 = this.method813(true, arg1, 262144, arg0 + -16431);
            var5 = var4 == null ? null : var4.field2454;
        } else {
            var5 = this.field1774;
            this.field1774 = null;
        }
        if (var5 != null) {
            class378.method2312(var5, this.field1781, super.field1366, super.field1370, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(B)Z")
    public final boolean method38(byte arg0) {
        if (arg0 != -89) {
            field1792 = 90;
        }
        ++field1782;
        return this.field1784;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ll;Lfo;Z)V")
    public static final void method811(class16 arg0, class361 arg1, boolean arg2) {
        class412.field5884 = arg1;
        class190.field2451 = arg0;
        ++field1779;
        if (!arg2) {
            field1786 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIILjava/lang/Class;)V")
    public static final void method812(int arg0, int arg1, int arg2, Class arg3) {
        class498 var4 = class186.field2421[arg0][arg1][arg2];
        if (var4 != null) {
            for (class192 var5 = var4.field7263; var5 != null; var5 = var5.field2469) {
                class279 var6 = var5.field2466;
                if (arg3.isAssignableFrom(var6.getClass()) && var6.field3698 == arg1 && var6.field3688 == arg2) {
                    class212.method1351(var6);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)I")
    public final int method47(int arg0) {
        if (arg0 != -15774) {
            return 41;
        } else {
            ++field1770;
            return this.field1773;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZLza;II)Luu;")
    private final class190 method813(boolean arg0, class287 arg1, int arg2, int arg3) {
        if (arg3 != -16487) {
            this.method49((byte) -77, (class287) null);
        }
        ++field1768;
        class70 var5 = class123.field1593.method2920(65535 & this.field1778, arg3 ^ -2934);
        class38 var6;
        class38 var7;
        if (this.field1780) {
            var6 = class14.field152[0];
            var7 = class378.field5470[this.field1781];
        } else {
            var7 = class14.field152[this.field1781];
            if (this.field1781 < 3) {
                var6 = class14.field152[this.field1781 + 1];
            } else {
                var6 = null;
            }
        }
        return var5.method416(0, var7, arg2, arg0, this.field1788, super.field1370, var6, super.field1371, arg1, super.field1366, this.field1773);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V")
    public final void method45(int arg0) {
        if (this.field1767 != null) {
            this.field1767.method2013();
        }
        if (arg0 == 9479) {
            ++field1785;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILza;BI)Z")
    public final boolean method37(int arg0, class287 arg1, byte arg2, int arg3) {
        if (arg2 > -64) {
            field1786 = null;
        }
        ++field1777;
        class373 var5 = this.method815(131072, arg1, 8377);
        if (var5 != null) {
            class124 var6 = arg1.method1183();
            var6.method743(super.field1366, super.field1371, super.field1370);
            return var5.method2026(arg3, arg0, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILza;)V")
    public final void method44(int arg0, class287 arg1) {
        ++field1776;
        Object var3 = null;
        if (arg0 >= 122) {
            class31 var5;
            if (this.field1774 == null && this.field1784) {
                class190 var4 = this.method813(true, arg1, 262144, -16487);
                var5 = var4 == null ? null : var4.field2454;
            } else {
                var5 = this.field1774;
                this.field1774 = null;
            }
            if (var5 != null) {
                class488.method2957(var5, this.field1781, super.field1366, super.field1370, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "(I)V")
    public static void method814(int arg0) {
        field1786 = null;
        if (arg0 != -1) {
            method814(-100);
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(BLza;)Luc;")
    public final class23 method50(byte arg0, class287 arg1) {
        ++field1772;
        if (this.field1767 == null) {
            return null;
        } else {
            class124 var3 = arg1.method1183();
            var3.method743(super.field1366 - -super.field1375, super.field1371, super.field1370 + super.field1368);
            class23 var4 = null;
            if (this.field1769) {
                var4 = class117.method703(1, 125);
            }
            this.field1767.method2051(var3, var4 != null ? var4.field226[0] : null, 0);
            if (arg0 != -112) {
                this.field1788 = 8;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "(I)I")
    public final int method614(int arg0) {
        if (arg0 < 54) {
            return 62;
        } else {
            ++field1775;
            return this.field1767 == null ? 0 : this.field1767.method2041();
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILza;I)Le;")
    private final class373 method815(int arg0, class287 arg1, int arg2) {
        ++field1787;
        if (arg2 != 8377) {
            this.field1788 = 57;
        }
        if (this.field1767 != null && ~arg1.method1191(this.field1767.method2025(), arg0) == -1) {
            return this.field1767;
        } else {
            class190 var4 = this.method813(false, arg1, arg0, arg2 + -24864);
            return var4 != null ? var4.field2455 : null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(BLza;)V")
    public final void method36(byte arg0, class287 arg1) {
        ++field1795;
        if (arg0 >= -120) {
            field1794 = -1;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IBLza;)Le;")
    public final class373 method39(int arg0, byte arg1, class287 arg2) {
        if (arg1 != -54) {
            field1794 = 54;
        }
        ++field1771;
        return this.method815(arg0, arg2, 8377);
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lza;Ler;IIIIZIIIII)V")
    public class135(class287 arg0, class70 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class434.method2668((byte) 107, arg11, arg10));
        super.field1370 = arg5;
        this.field1788 = (byte) arg10;
        this.field1773 = (byte) arg11;
        super.field1366 = arg3;
        this.field1781 = (byte) arg2;
        this.field1769 = ~arg1.field886 != -1 && !arg6;
        this.field1778 = (short) arg1.field834;
        this.field1780 = arg6;
        this.field1784 = arg0.method1129() && arg1.field820 && !this.field1780 && class319.field4256.method2058(class20.field183, 1) != 0;
        class190 var13 = this.method813(this.field1784, arg0, 2048, -16487);
        if (var13 != null) {
            this.field1774 = var13.field2454;
            this.field1767 = var13.field2455;
        }
    }
}
