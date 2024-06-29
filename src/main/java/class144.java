import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public class class144 extends class450 implements class246 {

    @OriginalMember(owner = "client!pba", name = "E", descriptor = "Z")
    private boolean field1852;

    @OriginalMember(owner = "client!pba", name = "G", descriptor = "Z")
    private boolean field1854;

    @OriginalMember(owner = "client!pba", name = "B", descriptor = "S")
    private short field1849;

    @OriginalMember(owner = "client!pba", name = "H", descriptor = "B")
    private byte field1855;

    @OriginalMember(owner = "client!pba", name = "F", descriptor = "B")
    private byte field1853;

    @OriginalMember(owner = "client!pba", name = "U", descriptor = "B")
    private byte field1868;

    @OriginalMember(owner = "client!pba", name = "S", descriptor = "Z")
    private boolean field1866;

    @OriginalMember(owner = "client!pba", name = "V", descriptor = "Z")
    private boolean field1869;

    @OriginalMember(owner = "client!pba", name = "Z", descriptor = "Lk;")
    private class88 field1873;

    @OriginalMember(owner = "client!pba", name = "z", descriptor = "Lr;")
    public class521 field1847;

    @OriginalMember(owner = "client!pba", name = "ab", descriptor = "Lim;")
    public static class353 field1874 = new class353(32, 10);

    @OriginalMember(owner = "client!pba", name = "db", descriptor = "[I")
    public static int[] field1877;

    @OriginalMember(owner = "client!pba", name = "w", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!pba", name = "x", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!pba", name = "y", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!pba", name = "A", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!pba", name = "C", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!pba", name = "I", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!pba", name = "J", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!pba", name = "K", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!pba", name = "L", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!pba", name = "M", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!pba", name = "N", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!pba", name = "O", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!pba", name = "P", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!pba", name = "Q", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!pba", name = "R", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!pba", name = "T", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!pba", name = "W", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!pba", name = "X", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!pba", name = "Y", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!pba", name = "bb", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!pba", name = "eb", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!pba", name = "cb", descriptor = "J")
    public static long field1876;

    @OriginalMember(owner = "client!pba", name = "D", descriptor = "Lud;")
    private class119 field1851;

    @OriginalMember(owner = "client!pba", name = "fb", descriptor = "[[Z")
    public static boolean[][] field1879;

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(B)Z")
    public final boolean method55(byte arg0) {
        ++field1875;
        int var2 = -120 % ((-20 - arg0) / 32);
        return this.field1869;
    }

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "(ILqa;)Lud;")
    public final class119 method58(int arg0, class167 arg1) {
        int var3 = -118 / ((arg0 - 4) / 47);
        if (this.field1851 == null) {
            this.field1851 = class82.method459(this.method791(0, arg1, -80), super.field6368, super.field6366, super.field6362, (byte) -101);
        }
        ++field1865;
        return this.field1851;
    }

    @OriginalMember(owner = "client!pba", name = "d", descriptor = "(B)V")
    public static void method788(byte arg0) {
        if (arg0 >= -126) {
            method788((byte) -95);
        }
        field1879 = null;
        field1874 = null;
        field1877 = null;
    }

    @OriginalMember(owner = "client!pba", name = "e", descriptor = "(I)Z")
    public final boolean method64(int arg0) {
        if (arg0 != -1) {
            this.method53(75, 70, (class167) null);
        }
        ++field1871;
        return this.field1852;
    }

    @OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(Lqa;Lbu;IIIIIZIIIIIIZ)V")
    public class144(class167 arg0, class137 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field1748 == -2, class523.method2923(true, arg13, arg12));
        this.field1852 = arg14;
        this.field1854 = arg7;
        this.field1849 = (short) arg1.field1679;
        this.field1855 = (byte) arg12;
        this.field1853 = (byte) arg13;
        this.field1868 = (byte) arg3;
        this.field1866 = ~arg1.field1749 != -1 && !arg7;
        this.field1869 = arg0.method951() && arg1.field1725 && !this.field1854 && class501.field6954.method3159(class428.field5845, true) != 0;
        int var16 = 2048;
        if (this.field1852) {
            var16 |= 65536;
        }
        class433 var17 = this.method790(arg0, var16, -10206, this.field1869);
        if (var17 != null) {
            this.field1873 = var17.field5897;
            this.field1847 = var17.field5896;
            if (this.field1852) {
                this.field1847 = this.field1847.method1607((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(IILqa;)Lr;")
    public final class521 method53(int arg0, int arg1, class167 arg2) {
        ++field1867;
        return arg1 != 30307 ? null : this.method791(arg0, arg2, -81);
    }

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "(Lqa;I)V")
    public final void method66(class167 arg0, int arg1) {
        if (arg1 == 0) {
            ++field1844;
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(ILqa;)V")
    public final void method62(int arg0, class167 arg1) {
        ++field1864;
        if (arg0 != 22132) {
            field1879 = null;
        }
        Object var3 = null;
        class88 var5;
        if (this.field1873 == null && this.field1869) {
            class433 var4 = this.method790(arg1, 262144, arg0 ^ -29098, true);
            var5 = var4 == null ? null : var4.field5897;
        } else {
            var5 = this.field1873;
            this.field1873 = null;
        }
        if (var5 != null) {
            class443.method2572(var5, this.field1868, super.field6362, super.field6368, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!pba", name = "h", descriptor = "(I)I")
    public final int method789(int arg0) {
        if (arg0 > -19) {
            this.method791(-47, (class167) null, -52);
        }
        ++field1872;
        return this.field1847 == null ? 15 : this.field1847.method1590() / 4;
    }

    @OriginalMember(owner = "client!pba", name = "d", descriptor = "(I)V")
    public final void method65(int arg0) {
        int var2 = 119 % ((-4 - arg0) / 41);
        if (this.field1847 != null) {
            this.field1847.method1588();
        }
        ++field1858;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(IIILqa;IZLlb;)V")
    public final void method54(int arg0, int arg1, int arg2, class167 arg3, int arg4, boolean arg5, class239 arg6) {
        if (arg1 <= 67) {
            this.method52(107);
        }
        ++field1870;
        if (arg6 instanceof class502) {
            class502 var8 = (class502) arg6;
            if (this.field1847 != null && var8.field6963 != null) {
                this.field1847.method1573(var8.field6963, arg4, arg2, arg0, arg5);
            }
        } else {
            if (arg6 instanceof class144) {
                class144 var9 = (class144) arg6;
                if (this.field1847 != null && var9.field1847 != null) {
                    this.field1847.method1573(var9.field1847, arg4, arg2, arg0, arg5);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pba", name = "c", descriptor = "(B)I")
    public final int method103(byte arg0) {
        ++field1863;
        if (arg0 >= -98) {
            this.method58(-8, (class167) null);
        }
        return this.field1847 == null ? 0 : this.field1847.method1579();
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(Lqa;IIZ)Lvq;")
    private final class433 method790(class167 arg0, int arg1, int arg2, boolean arg3) {
        if (arg2 != -10206) {
            this.field1851 = null;
        }
        ++field1848;
        class137 var5 = class626.field9084.method1093(0, 65535 & this.field1849);
        class544 var6;
        class544 var7;
        if (!this.field1854) {
            var6 = class50.field672[this.field1868];
            if (~this.field1868 > -4) {
                var7 = class50.field672[this.field1868 + 1];
            } else {
                var7 = null;
            }
        } else {
            var6 = class353.field4949[this.field1868];
            var7 = class50.field672[0];
        }
        return var5.method731(super.field6368, var6, super.field6362, this.field1855 == 11 ? 10 : this.field1855, arg1, arg0, super.field6366, -15988, var7, ~this.field1855 == -12 ? this.field1853 + 4 : this.field1853, arg3);
    }

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "(B)V")
    public final void method56(byte arg0) {
        ++field1846;
        this.field1852 = false;
        if (this.field1847 != null) {
            this.field1847.method1583(-65537 & this.field1847.method1601());
        }
        if (arg0 != 52) {
            this.method52(23);
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(BLqa;)Lqba;")
    public final class541 method59(byte arg0, class167 arg1) {
        int var3 = 5 / ((-30 - arg0) / 63);
        ++field1857;
        if (this.field1847 == null) {
            return null;
        } else {
            class105 var4 = arg1.method964();
            var4.method361(super.field6362, super.field6366, super.field6368);
            class541 var5 = null;
            if (this.field1866) {
                var5 = class296.method1818(16711680, 1);
            }
            this.field1847.method1595(var4, var5 == null ? null : var5.field7564[0], 0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(ILqa;I)Lr;")
    private final class521 method791(int arg0, class167 arg1, int arg2) {
        ++field1862;
        if (this.field1847 != null && arg1.method921(this.field1847.method1601(), arg0) == 0) {
            return this.field1847;
        } else {
            if (arg2 > -34) {
                this.field1852 = false;
            }
            class433 var4 = this.method790(arg1, arg0, -10206, false);
            return var4 == null ? null : var4.field5896;
        }
    }

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "(I)I")
    public final int method52(int arg0) {
        if (arg0 != -17817) {
            return -127;
        } else {
            ++field1861;
            return 65535 & this.field1849;
        }
    }

    @OriginalMember(owner = "client!pba", name = "c", descriptor = "(I)I")
    public final int method60(int arg0) {
        if (arg0 != 1901) {
            this.field1869 = true;
        }
        ++field1860;
        return this.field1853;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(Lqa;I)V")
    public final void method61(class167 arg0, int arg1) {
        ++field1845;
        if (arg1 == -9785) {
            Object var3 = null;
            class88 var5;
            if (this.field1873 == null && this.field1869) {
                class433 var4 = this.method790(arg0, 262144, -10206, true);
                var5 = var4 != null ? var4.field5897 : null;
            } else {
                var5 = this.field1873;
                this.field1873 = null;
            }
            if (var5 != null) {
                class68.method388(var5, this.field1868, super.field6362, super.field6368, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(I)I")
    public final int method57(int arg0) {
        if (arg0 != -29185) {
            return -97;
        } else {
            ++field1850;
            return this.field1855;
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(IILqa;I)Z")
    public final boolean method63(int arg0, int arg1, class167 arg2, int arg3) {
        ++field1859;
        if (arg3 >= -35) {
            this.field1853 = -29;
        }
        class521 var5 = this.method791(131072, arg2, -128);
        if (var5 != null) {
            class105 var6 = arg2.method964();
            var6.method361(super.field6362, super.field6366, super.field6368);
            return var5.method1598(arg0, arg1, var6, false);
        } else {
            return false;
        }
    }

    static {
        new class344("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field1877 = new int[13];
    }
}
