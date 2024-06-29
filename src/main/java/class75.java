import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class75 extends class237 implements class106 {

    @OriginalMember(owner = "client!hh", name = "G", descriptor = "Lnt;")
    public class134 field933;

    @OriginalMember(owner = "client!hh", name = "v", descriptor = "Z")
    private boolean field922;

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!hh", name = "s", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!hh", name = "t", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!hh", name = "u", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!hh", name = "w", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!hh", name = "x", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!hh", name = "y", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!hh", name = "z", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!hh", name = "B", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!hh", name = "C", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!hh", name = "D", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!hh", name = "E", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!hh", name = "F", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!hh", name = "H", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!hh", name = "I", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "Lb;")
    public static class201 field916;

    @OriginalMember(owner = "client!hh", name = "A", descriptor = "[Lae;")
    public static class150[] field927;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)I")
    public final int method119(byte arg0) {
        ++field925;
        if (arg0 < 13) {
            field927 = null;
        }
        return this.field933.field1763;
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lnp;Ldq;IIIIIZIII)V")
    public class75(class313 arg0, class453 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, class318.method2041(arg8, (byte) 111, arg9));
        this.field933 = new class134(arg0, arg1, arg8, arg9, arg2, arg3, super.field3556, super.field3563, arg7, arg10);
        this.field922 = ~arg1.field6366 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIILnp;)Z")
    public final boolean method113(int arg0, int arg1, int arg2, class313 arg3) {
        ++field934;
        class491 var5 = this.field933.method848(super.field3556, false, arg3, 10, false, super.field3563, 65536);
        if (var5 == null) {
            return false;
        } else {
            class282 var6 = arg3.method601();
            var6.method1019(super.field3556, super.field3567, super.field3563);
            if (arg1 < 16) {
                field916 = null;
            }
            return var5.method1339(arg0, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "(I)V")
    public static void method439(int arg0) {
        field916 = null;
        if (arg0 != 705384839) {
            method441(-17);
        }
        field927 = null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILnp;)V")
    public final void method109(int arg0, class313 arg1) {
        if (arg0 > -126) {
            this.method119((byte) 123);
        }
        this.field933.method847((byte) -80, arg1);
        ++field929;
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)V")
    public final void method246(int arg0) {
        if (arg0 == -1) {
            ++field932;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(ILnp;)Lql;")
    public final class477 method120(int arg0, class313 arg1) {
        ++field917;
        class491 var3 = this.field933.method848(super.field3556, false, arg1, 10, true, super.field3563, 1024);
        if (var3 == null) {
            return null;
        } else {
            class282 var4 = arg1.method601();
            var4.method1019(super.field3556, super.field3567, super.field3563);
            if (arg0 != 0) {
                this.field933 = null;
            }
            class477 var5 = null;
            if (this.field922) {
                var5 = class96.method543(1, (byte) 71);
            }
            if (this.field933.field1774 == null) {
                var3.method1323(var4, var5 == null ? null : var5.field6696[0], 0);
            } else {
                class207 var6 = this.field933.field1774.method552();
                arg1.method646(var3, var6, var4, var5 != null ? var5.field6696[0] : null, 0);
            }
            this.field933.method845(true, super.field3556 >> 7, super.field3563 >> 7, arg1, super.field3556 >> 7, -125, var3, super.field3563 >> 7);
            return var5;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lnp;B)V")
    public final void method103(class313 arg0, byte arg1) {
        ++field921;
        if (arg1 <= -95) {
            class491 var3 = this.field933.method848(super.field3556, true, arg0, 10, true, super.field3563, 131072);
            if (var3 != null) {
                this.field933.method845(false, super.field3556 >> 7, super.field3563 >> 7, arg0, super.field3556 >> 7, -125, var3, super.field3563 >> 7);
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILin;ILnp;BZI)V")
    public final void method247(int arg0, class54 arg1, int arg2, class313 arg3, byte arg4, boolean arg5, int arg6) {
        int var8 = 18 / ((20 - arg4) / 38);
        ++field919;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lnp;BI)Lf;")
    public final class491 method115(class313 arg0, byte arg1, int arg2) {
        if (arg1 <= 70) {
            this.method247(-105, (class54) null, 61, (class313) null, (byte) 98, true, -107);
        }
        ++field931;
        return this.field933.method848(0, false, arg0, 10, false, 0, arg2);
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
    public final void method111(int arg0) {
        ++field930;
        if (arg0 < 56) {
            this.method247(24, (class54) null, -50, (class313) null, (byte) -55, false, -32);
        }
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)I")
    public final int method104(int arg0) {
        ++field923;
        if (arg0 != 31249) {
            field916 = null;
        }
        return this.field933.field1755;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIII)V")
    public static final void method440(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field918;
        if (arg3 > -61) {
            field916 = null;
        }
        class489 var5 = class116.method731(-625541408, 10, arg2);
        var5.method2863(255);
        var5.field6890 = arg4;
        var5.field6895 = arg0;
        var5.field6892 = arg1;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lnp;I)V")
    public final void method114(class313 arg0, int arg1) {
        ++field924;
        this.field933.method846(arg0, arg1 ^ 26961);
        if (arg1 != -26920) {
            field916 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)Z")
    public final boolean method116(byte arg0) {
        ++field926;
        return arg0 > -40 ? false : this.field933.method843((byte) 56);
    }

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "(I)Z")
    public final boolean method249(int arg0) {
        ++field928;
        if (arg0 >= -105) {
            this.method113(-125, 125, 93, (class313) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "(I)V")
    public static final void method441(int arg0) {
        int var1 = 40 % ((arg0 - -53) / 57);
        ++field920;
        class197.field2877 = null;
        class451.field6249 = null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)I")
    public final int method106(int arg0) {
        if (arg0 != 12181) {
            field916 = null;
        }
        ++field935;
        return this.field933.field1770;
    }
}
