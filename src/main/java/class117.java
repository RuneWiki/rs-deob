import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class117 extends class501 implements class161 {

    @OriginalMember(owner = "client!db", name = "n", descriptor = "Lah;")
    public class191 field1801;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "Z")
    private boolean field1811;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!db", name = "y", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)I")
    public final int method99(byte arg0) {
        if (arg0 != -107) {
            this.method99((byte) -122);
        }
        ++field1799;
        return this.field1801.field2946;
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V")
    public final void method106(int arg0) {
        if (arg0 == -19159) {
            ++field1803;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lza;IIILps;IZ)V")
    public final void method102(class299 arg0, int arg1, int arg2, int arg3, class352 arg4, int arg5, boolean arg6) {
        ++field1805;
        if (arg3 != -750) {
            this.method110(-106, (class299) null);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(B)Z")
    public final boolean method104(byte arg0) {
        ++field1809;
        int var2 = 26 % ((-41 - arg0) / 38);
        return this.field1801.method1328((byte) -93);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lza;III)Z")
    public final boolean method109(class299 arg0, int arg1, int arg2, int arg3) {
        ++field1807;
        if (arg2 < 23) {
            return false;
        } else {
            class289 var5 = this.field1801.method1322(super.field7282, arg0, (byte) -115, false, false, 131072, super.field7279);
            if (var5 == null) {
                return false;
            } else {
                class517 var6 = arg0.method538();
                var6.method951(super.field7282, super.field7284, super.field7279);
                return var5.method638(arg1, arg3, var6, false);
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)I")
    public final int method97(int arg0) {
        if (arg0 <= 82) {
            this.field1811 = true;
        }
        ++field1797;
        return this.field1801.field2917;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lza;Lii;IIIIIZIII)V")
    public class117(class299 arg0, class395 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, class148.method1056(false, arg9, arg8));
        this.field1801 = new class191(arg0, arg1, arg8, arg9, arg2, arg3, super.field7282, super.field7279, arg7, arg10);
        this.field1811 = arg1.field5840 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)I")
    public final int method103(int arg0) {
        if (arg0 >= -10) {
            this.field1801 = null;
        }
        ++field1802;
        return this.field1801.field2951;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lza;B)V")
    public final void method96(class299 arg0, byte arg1) {
        ++field1798;
        this.field1801.method1319(46, arg0);
        if (arg1 <= 78) {
            this.method109((class299) null, -41, -73, 15);
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(ILza;)Lhp;")
    public final class293 method110(int arg0, class299 arg1) {
        if (arg0 != 0) {
            this.field1801 = null;
        }
        ++field1810;
        class289 var3 = this.field1801.method1322(super.field7282, arg1, (byte) -123, true, false, 2048, super.field7279);
        if (var3 == null) {
            return null;
        } else {
            class517 var4 = arg1.method538();
            var4.method951(super.field7282, super.field7284, super.field7279);
            class293 var5 = null;
            if (this.field1811) {
                var5 = class467.method2844(-22755, 1);
            }
            if (this.field1801.field2942 == null) {
                var3.method673(var4, var5 != null ? var5.field4524[0] : null, 0);
            } else {
                class320 var6 = this.field1801.field2942.method2424();
                arg1.method584(var3, var6, var4, var5 == null ? null : var5.field4524[0], 0);
            }
            int var7 = super.field7282 >> 7;
            int var8 = super.field7279 >> 7;
            this.field1801.method1323(var8, -2376, arg1, true, var3, var7, var7, var8);
            return var5;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BLza;)V")
    public final void method100(byte arg0, class299 arg1) {
        this.field1801.method1321(-32004, arg1);
        ++field1804;
        if (arg0 != 51) {
            this.method103(30);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lza;IZ)Le;")
    public final class289 method111(class299 arg0, int arg1, boolean arg2) {
        ++field1800;
        if (!arg2) {
            this.field1801 = null;
        }
        return this.field1801.method1322(0, arg0, (byte) -123, false, false, arg1, 0);
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(I)V")
    public final void method108(int arg0) {
        ++field1808;
        int var2 = -31 % ((48 - arg0) / 37);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(B)Z")
    public final boolean method107(byte arg0) {
        ++field1806;
        if (arg0 != -88) {
            this.method107((byte) -95);
        }
        return false;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILza;)V")
    public final void method98(int arg0, class299 arg1) {
        ++field1812;
        class289 var3 = this.field1801.method1322(super.field7282, arg1, (byte) -118, true, true, 262144, super.field7279);
        if (var3 != null) {
            int var4 = super.field7282 >> 7;
            int var5 = super.field7279 >> 7;
            this.field1801.method1323(var5, -2376, arg1, false, var3, var4, var4, var5);
        }
        if (arg0 != 31203) {
            this.field1811 = true;
        }
    }
}
