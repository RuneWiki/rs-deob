import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class136 extends class233 implements class18 {

    @OriginalMember(owner = "client!fm", name = "V", descriptor = "B")
    private byte field1832;

    @OriginalMember(owner = "client!fm", name = "y", descriptor = "Z")
    private boolean field1809;

    @OriginalMember(owner = "client!fm", name = "I", descriptor = "B")
    private byte field1819;

    @OriginalMember(owner = "client!fm", name = "s", descriptor = "Z")
    private boolean field1803;

    @OriginalMember(owner = "client!fm", name = "H", descriptor = "S")
    private short field1818;

    @OriginalMember(owner = "client!fm", name = "N", descriptor = "B")
    private byte field1824;

    @OriginalMember(owner = "client!fm", name = "v", descriptor = "Z")
    private boolean field1806;

    @OriginalMember(owner = "client!fm", name = "w", descriptor = "Z")
    private boolean field1807;

    @OriginalMember(owner = "client!fm", name = "M", descriptor = "Lwp;")
    public class292 field1823;

    @OriginalMember(owner = "client!fm", name = "C", descriptor = "Lqn;")
    private class380 field1813;

    @OriginalMember(owner = "client!fm", name = "R", descriptor = "Ljg;")
    public static class241 field1828;

    @OriginalMember(owner = "client!fm", name = "T", descriptor = "Lnn;")
    public static class151 field1830;

    @OriginalMember(owner = "client!fm", name = "W", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!fm", name = "q", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!fm", name = "r", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!fm", name = "t", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!fm", name = "u", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!fm", name = "x", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!fm", name = "z", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!fm", name = "A", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!fm", name = "B", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!fm", name = "D", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!fm", name = "E", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!fm", name = "G", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!fm", name = "J", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!fm", name = "K", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!fm", name = "L", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!fm", name = "O", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!fm", name = "P", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!fm", name = "Q", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!fm", name = "S", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!fm", name = "U", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!fm", name = "F", descriptor = "Ldr;")
    public static class261 field1816;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Ldr;IB)Lwp;")
    public final class292 method12(class261 arg0, int arg1, byte arg2) {
        int var4 = -74 % ((46 - arg2) / 47);
        ++field1802;
        return this.method852(-1, arg1, arg0);
    }

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "(Ldr;I)Lkq;")
    public final class70 method10(class261 arg0, int arg1) {
        if (arg1 != 7) {
            this.method12((class261) null, -65, (byte) -11);
        }
        ++field1815;
        if (this.field1823 == null) {
            return null;
        } else {
            class361 var3 = arg0.method434();
            var3.method611(super.field3525, super.field3528, super.field3524);
            class70 var4 = null;
            if (this.field1809) {
                var4 = class383.method2309(127, 1);
            }
            this.field1823.method1282(var3, var4 == null ? null : var4.field899[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)I")
    public final int method9(int arg0) {
        ++field1827;
        if (arg0 < 26) {
            this.field1807 = false;
        }
        return this.field1832;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Ldr;I)V")
    public final void method6(class261 arg0, int arg1) {
        ++field1808;
        if (arg1 >= -68) {
            method851(26);
        }
        Object var3 = null;
        class380 var5;
        if (this.field1813 == null && this.field1807) {
            class221 var4 = this.method853(arg0, true, 131072, -120);
            var5 = var4 != null ? var4.field3366 : null;
        } else {
            var5 = this.field1813;
            this.field1813 = null;
        }
        if (var5 != null) {
            class85.method557(var5, this.field1819, super.field3525, super.field3524, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "(I)V")
    public static void method851(int arg0) {
        field1830 = null;
        if (arg0 != -1) {
            method854(118, (byte) 110, -50);
        }
        field1816 = null;
        field1828 = null;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IILdr;)Lwp;")
    private final class292 method852(int arg0, int arg1, class261 arg2) {
        ++field1826;
        if (this.field1823 != null && ~arg2.method372(this.field1823.method1274(), arg1) == -1) {
            return this.field1823;
        } else {
            if (arg0 != -1) {
                method854(91, (byte) -117, 112);
            }
            class221 var4 = this.method853(arg2, false, arg1, -125);
            return var4 == null ? null : var4.field3362;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Z)I")
    public final int method7(boolean arg0) {
        if (!arg0) {
            method854(-56, (byte) -93, -51);
        }
        ++field1820;
        return this.field1818 & 65535;
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Ldr;Lfq;IIIIZIIZ)V")
    public class136(class261 arg0, class85 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class422.method2608(arg7, arg8, (byte) 33));
        this.field1832 = (byte) arg7;
        this.field1809 = ~arg1.field1184 != -1 && !arg6;
        super.field3525 = (short) arg3;
        this.field1819 = (byte) arg2;
        this.field1803 = arg6;
        this.field1818 = (short) arg1.field1156;
        super.field3524 = (short) arg5;
        this.field1824 = (byte) arg8;
        this.field1806 = arg9;
        this.field1807 = arg0.method427() && arg1.field1158 && !this.field1803 && class97.field1334 != 0;
        int var11 = 1024;
        if (this.field1806) {
            var11 |= 32768;
        }
        class221 var12 = this.method853(arg0, this.field1807, var11, -116);
        if (var12 != null) {
            this.field1823 = var12.field3362;
            this.field1813 = var12.field3366;
            if (this.field1806) {
                this.field1823 = this.field1823.method1264((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZILla;IIILdr;)V")
    public final void method117(boolean arg0, int arg1, class269 arg2, int arg3, int arg4, int arg5, class261 arg6) {
        if (arg1 != 0) {
            this.method10((class261) null, -47);
        }
        if (arg2 instanceof class136) {
            class136 var8 = (class136) arg2;
            if (this.field1823 != null && var8.field1823 != null) {
                this.field1823.method1273(var8.field1823, arg3, arg4, arg5, arg0);
            }
        } else if (arg2 instanceof class17) {
            class17 var9 = (class17) arg2;
            if (this.field1823 != null && var9.field247 != null) {
                this.field1823.method1273(var9.field247, arg3, arg4, arg5, arg0);
            }
        }
        ++field1805;
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(Z)Z")
    public final boolean method112(boolean arg0) {
        if (!arg0) {
            return false;
        } else {
            ++field1829;
            return this.field1806;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Ldr;ZII)Luq;")
    private final class221 method853(class261 arg0, boolean arg1, int arg2, int arg3) {
        ++field1810;
        if (arg3 > -113) {
            return null;
        } else {
            class85 var5 = class411.method2575(0, 65535 & this.field1818);
            class143 var6;
            class143 var7;
            if (this.field1803) {
                var6 = class85.field1201[0];
                var7 = class154.field2118[this.field1819];
            } else {
                if (~this.field1819 <= -4) {
                    var6 = null;
                } else {
                    var6 = class85.field1201[this.field1819 - -1];
                }
                var7 = class85.field1201[this.field1819];
            }
            return var5.method538(var6, -128, super.field3524, this.field1824, this.field1832, var7, arg2, super.field3528, arg0, super.field3525, arg1);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)I")
    public final int method3(byte arg0) {
        if (arg0 > -3) {
            this.method853((class261) null, false, -38, -73);
        }
        ++field1801;
        return this.field1824;
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(B)V")
    public final void method116(byte arg0) {
        this.field1806 = false;
        ++field1822;
        if (this.field1823 != null) {
            this.field1823.method1277(-32769 & this.field1823.method1274());
        }
        if (arg0 > -45) {
            this.field1832 = -9;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(BLdr;)V")
    public final void method2(byte arg0, class261 arg1) {
        ++field1825;
        Object var3 = null;
        class380 var5;
        if (this.field1813 == null && this.field1807) {
            class221 var4 = this.method853(arg1, true, 131072, arg0 + -203);
            var5 = var4 == null ? null : var4.field3366;
        } else {
            var5 = this.field1813;
            this.field1813 = null;
        }
        if (var5 != null) {
            class177.method1080(var5, this.field1819, super.field3525, super.field3524, (boolean[]) null);
        }
        if (arg0 != 76) {
            this.method9(9);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IILdr;I)Z")
    public final boolean method4(int arg0, int arg1, class261 arg2, int arg3) {
        if (arg3 != 2) {
            return true;
        } else {
            ++field1812;
            class292 var5 = this.method852(-1, 65536, arg2);
            if (var5 != null) {
                class361 var6 = arg2.method434();
                var6.method611(super.field3525, super.field3528, super.field3524);
                return var5.method1297(arg0, arg1, var6, false);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IBI)Lfb;")
    public static final class32 method854(int arg0, byte arg1, int arg2) {
        if (arg1 <= 77) {
            field1804 = -68;
        }
        ++field1821;
        class32 var3 = (class32) class70.field904.method2302((long) arg0 << 32 | (long) arg2, 23576);
        if (var3 == null) {
            var3 = new class32(arg0, arg2);
            class70.field904.method2301(62, var3, var3.field1339);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)Z")
    public final boolean method1(int arg0) {
        int var2 = -11 % ((-1 - arg0) / 46);
        ++field1811;
        return this.field1807;
    }

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "(Ldr;I)V")
    public final void method15(class261 arg0, int arg1) {
        if (arg1 <= 114) {
            this.field1807 = false;
        }
        ++field1814;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILeq;Ldr;)I")
    public static final int method855(int arg0, class446 arg1, class261 arg2) {
        ++field1831;
        if (~arg1.field6576 == arg0) {
            if (arg1.field6562 != -1) {
                class154 var3 = class362.field5334.method180(!arg2.method398() ? arg1.field6577 : arg1.field6562, arg0 + -115);
                if (!var3.field2129) {
                    return var3.field2134;
                }
            }
            return arg1.field6564;
        } else {
            return arg1.field6576;
        }
    }

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "(I)V")
    public final void method11(int arg0) {
        if (arg0 != -21910) {
            this.method4(-14, 9, (class261) null, -55);
        }
        if (this.field1823 != null) {
            this.field1823.method1249();
        }
        ++field1817;
    }

    static {
        new class151("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
        field1828 = new class241(32);
        field1830 = new class151("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");
        field1833 = -1;
    }
}
