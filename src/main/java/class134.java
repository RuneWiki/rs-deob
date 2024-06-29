import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class134 extends class339 implements class111 {

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "Lpl;")
    public class447 field1900;

    @OriginalMember(owner = "client!ub", name = "Q", descriptor = "Z")
    private boolean field1916;

    @OriginalMember(owner = "client!ub", name = "H", descriptor = "I")
    public static int field1908 = -1;

    @OriginalMember(owner = "client!ub", name = "G", descriptor = "Ljava/lang/String;")
    public static String field1907 = "Loaded config";

    @OriginalMember(owner = "client!ub", name = "P", descriptor = "I")
    public static int field1915 = 0;

    @OriginalMember(owner = "client!ub", name = "R", descriptor = "I")
    public static int field1917 = 100;

    @OriginalMember(owner = "client!ub", name = "V", descriptor = "[I")
    public static int[] field1921 = new int[250];

    @OriginalMember(owner = "client!ub", name = "I", descriptor = "Ljava/lang/String;")
    public static String field1909 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!ub", name = "D", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!ub", name = "F", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!ub", name = "J", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!ub", name = "K", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!ub", name = "M", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!ub", name = "O", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!ub", name = "S", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!ub", name = "T", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!ub", name = "U", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!ub", name = "W", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!ub", name = "X", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!ub", name = "Y", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!ub", name = "Z", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!ub", name = "ab", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "Lr;")
    public static class63 field1897;

    @OriginalMember(owner = "client!ub", name = "B", descriptor = "[I")
    public static int[] field1902;

    @OriginalMember(owner = "client!ub", name = "N", descriptor = "[I")
    public static int[] field1913;

    @OriginalMember(owner = "client!ub", name = "E", descriptor = "[[S")
    public static short[][] field1905;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BILjava/lang/String;IIII)V")
    public static final void method1070(byte arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1904;
        class125 var7 = new class125();
        var7.field1752 = class414.field5793 + arg1;
        var7.field1746 = arg3;
        var7.field1749 = arg5;
        if (arg0 != 97) {
            field1897 = null;
        }
        var7.field1743 = arg6;
        var7.field1747 = arg2;
        var7.field1751 = arg4;
        class121.field1698.method901(false, var7);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BLpe;)V")
    public final void method570(byte arg0, class391 arg1) {
        ++field1926;
        this.field1900.method2781(arg1, -4136);
        int var3 = -90 % ((66 - arg0) / 39);
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lpe;Lkk;IIIIIIIZI)V")
    public class134(class391 arg0, class372 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        super(arg6, arg7, arg8, class398.method2446((byte) 60, arg3, arg2));
        this.field1900 = new class447(arg0, arg1, arg2, arg3, arg4, arg5, super.field4622, super.field4630, arg9, arg10);
        this.field1916 = arg1.field5204 != 0;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lpe;I)V")
    public final void method574(class391 arg0, int arg1) {
        ++field1911;
        if (arg1 != -28992) {
            this.field1900 = null;
        }
        this.field1900.method2783(arg0, (byte) -25);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IILpe;I)Z")
    public final boolean method583(int arg0, int arg1, class391 arg2, int arg3) {
        ++field1906;
        class73 var5 = this.field1900.method2782(super.field4622, arg2, false, arg3, super.field4630, 0, false);
        if (var5 == null) {
            return false;
        } else {
            class156 var6 = arg2.method226();
            var6.method308(super.field4622, super.field4626, super.field4630);
            return var5.method455(arg1, arg0, var6, false);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lpe;B)Lca;")
    public final class415 method572(class391 arg0, byte arg1) {
        ++field1912;
        class73 var3 = this.field1900.method2782(super.field4622, arg0, true, 1024, super.field4630, 0, false);
        if (var3 == null) {
            return null;
        } else {
            class156 var4 = arg0.method226();
            var4.method308(super.field4622, super.field4626, super.field4630);
            if (arg1 > -45) {
                this.method574((class391) null, -5);
            }
            class415 var5 = null;
            if (this.field1916) {
                var5 = class340.method2159(24579, 1);
            }
            if (this.field1900.field6484 != null) {
                class374 var6 = this.field1900.field6484.method489();
                arg0.method166(var3, var6, var4, var5 != null ? var5.field5799[0] : null, 0);
            } else {
                var3.method478(var4, var5 != null ? var5.field5799[0] : null, 0);
            }
            this.field1900.method2776(var3, super.field4622 >> 7, super.field4622 >> 7, super.field4630 >> 7, arg0, super.field4630 >> 7, 13, true);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(B)V")
    public static void method1071(byte arg0) {
        field1913 = null;
        field1921 = null;
        field1902 = null;
        if (arg0 <= 46) {
            field1902 = null;
        }
        field1907 = null;
        field1909 = null;
        field1905 = null;
        field1897 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lpe;II)Lsj;")
    public final class73 method576(class391 arg0, int arg1, int arg2) {
        ++field1903;
        if (arg2 != -2705) {
            this.method580(-23);
        }
        return this.field1900.method2782(0, arg0, false, arg1, 0, 0, false);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILpe;)V")
    public final void method581(int arg0, class391 arg1) {
        ++field1919;
        class73 var3 = this.field1900.method2782(super.field4622, arg1, true, 131072, super.field4630, arg0, true);
        if (var3 != null) {
            this.field1900.method2776(var3, super.field4622 >> 7, super.field4622 >> 7, super.field4630 >> 7, arg1, super.field4630 >> 7, 13, false);
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)I")
    public final int method575(int arg0) {
        if (arg0 != -15863) {
            field1908 = -104;
        }
        ++field1898;
        return this.field1900.field6450;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)I")
    public final int method582(byte arg0) {
        if (arg0 != 22) {
            field1913 = null;
        }
        ++field1899;
        return this.field1900.field6458;
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)Z")
    public final boolean method537(int arg0) {
        ++field1918;
        if (arg0 > -48) {
            this.method535((byte) 60);
        }
        return false;
    }

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "(I)V")
    public static final void method1072(int arg0) {
        class173.field2558 = 0;
        class69.field1029 = false;
        class12.field87 = -1;
        if (arg0 == -2109085497) {
            class421.field5895 = 1;
            class368.field5051 = -3;
            ++field1922;
            class359.field4868 = 0;
            class383.field5366 = 0;
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)Z")
    public final boolean method577(int arg0) {
        if (arg0 != -16528) {
            this.method583(65, 28, (class391) null, -62);
        }
        ++field1924;
        return this.field1900.method2787(-107);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)I")
    public final int method580(int arg0) {
        if (arg0 != 24493) {
            this.method570((byte) 23, (class391) null);
        }
        ++field1923;
        return this.field1900.field6462;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZILhh;Lpe;III)V")
    public final void method532(boolean arg0, int arg1, class184 arg2, class391 arg3, int arg4, int arg5, int arg6) {
        int var8 = -67 % ((76 - arg1) / 38);
        ++field1920;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZBZ)V")
    public static final void method1073(boolean arg0, byte arg1, boolean arg2) {
        if (arg2) {
            ++class162.field2404;
            class30.method345(true);
        }
        if (arg1 <= -82) {
            ++field1896;
            if (arg0) {
                ++class199.field2833;
                class263.method1694(26);
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIII)I")
    public static final int method1074(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1925;
        if (arg1 < 82) {
            field1915 = 86;
        }
        int var5 = -class174.field2564[arg2 * 8192 / arg4] + 65536 >> 1;
        return ((-var5 + 65536) * arg0 >> 16) + (arg3 * var5 >> 16);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
    public final void method573(byte arg0) {
        if (arg0 > -100) {
            method1074(-108, 14, 79, 107, -21);
        }
        ++field1910;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)V")
    public final void method535(byte arg0) {
        ++field1901;
        if (arg0 <= 110) {
            field1915 = -52;
        }
        throw new IllegalStateException();
    }
}
