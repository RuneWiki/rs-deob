import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class164 extends class344 implements class670 {

    @OriginalMember(owner = "client!wp", name = "z", descriptor = "Lpq;")
    public class177 field1960;

    @OriginalMember(owner = "client!wp", name = "x", descriptor = "Z")
    private boolean field1958;

    @OriginalMember(owner = "client!wp", name = "y", descriptor = "Lpr;")
    public static class407 field1959 = new class407(108, -2);

    @OriginalMember(owner = "client!wp", name = "H", descriptor = "[I")
    public static int[] field1968 = new int[14];

    @OriginalMember(owner = "client!wp", name = "M", descriptor = "I")
    public static int field1972 = 0;

    @OriginalMember(owner = "client!wp", name = "I", descriptor = "B")
    public static byte field1969;

    @OriginalMember(owner = "client!wp", name = "p", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!wp", name = "q", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!wp", name = "s", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!wp", name = "t", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!wp", name = "u", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!wp", name = "v", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!wp", name = "w", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!wp", name = "A", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!wp", name = "B", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!wp", name = "C", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!wp", name = "D", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!wp", name = "E", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!wp", name = "F", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!wp", name = "G", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!wp", name = "J", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!wp", name = "L", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!wp", name = "N", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!wp", name = "r", descriptor = "Lgr;")
    private class396 field1952;

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "(B)I", line = 4)
    public final int method443(byte arg0) {
        ++field1954;
        int var2 = -82 % ((arg0 - -82) / 37);
        return this.field1960.field2145;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IILoa;I)Z", line = 14)
    public final boolean method457(int arg0, int arg1, class635 arg2, int arg3) {
        ++field1956;
        if (arg1 != 1) {
            this.method444((byte) 19);
        }
        class350 var5 = this.field1960.method1041(super.field4472, false, arg2, true, 131072, super.field4478, false);
        if (var5 == null) {
            return false;
        } else {
            class389 var6 = arg2.method297();
            var6.method228(super.field4478, super.field4476, super.field4472);
            return var5.method910(arg3, arg0, var6, false);
        }
    }

    @OriginalMember(owner = "client!wp", name = "f", descriptor = "(I)V", line = 34)
    public static void method993(int arg0) {
        field1968 = null;
        if (arg0 != 262144) {
            method993(-91);
        }
        field1959 = null;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILoa;)Lgr;", line = 46)
    public final class396 method450(int arg0, class635 arg1) {
        ++field1970;
        int var3 = 8 % ((47 - arg0) / 34);
        return this.field1952;
    }

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "(B)Z", line = 57)
    public final boolean method449(byte arg0) {
        if (arg0 != -126) {
            field1969 = -67;
        }
        ++field1963;
        return false;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)V", line = 68)
    public final void method452(int arg0) {
        ++field1950;
        if (arg0 != 29877) {
            this.field1952 = null;
        }
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(Loa;I)Lok;", line = 80)
    public final class231 method442(class635 arg0, int arg1) {
        ++field1957;
        class350 var3 = this.field1960.method1041(super.field4472, false, arg0, true, 2048, super.field4478, true);
        if (var3 == null) {
            return null;
        } else {
            class389 var4 = arg0.method297();
            var4.method228(super.field4478, super.field4476, super.field4472);
            class231 var5 = null;
            if (this.field1958) {
                var5 = class526.method2993(1, 32671);
            }
            int var6 = super.field4478 >> 9;
            int var7 = super.field4472 >> 9;
            this.field1960.method1034(var7, var6, var6, var4, var7, arg0, arg1 + 122, var3, true);
            if (this.field1960.field2126 == null) {
                var3.method904(var4, var5 == null ? null : var5.field2947[0], 0);
            } else {
                class211 var8 = this.field1960.field2126.method1241();
                arg0.method301(var3, var8, var4, var5 == null ? null : var5.field2947[0], 0);
            }
            if (arg1 != 0) {
                this.method455(-74, 127, (class635) null);
            }
            if (this.field1952 == null) {
                this.field1952 = class426.method2298(super.field4478, var3, 12409, super.field4472, super.field4476);
            } else {
                class644.method3611(var3, super.field4478, this.field1952, (byte) -58, super.field4472, super.field4476);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(I)Z", line = 126)
    public final boolean method454(int arg0) {
        if (arg0 < 49) {
            return true;
        } else {
            ++field1966;
            return this.field1960.method1032(-28959);
        }
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(B)I", line = 137)
    public final int method447(byte arg0) {
        if (arg0 != -91) {
            field1968 = null;
        }
        ++field1953;
        return this.field1960.field2139;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZIZIILfl;Loa;)V", line = 149)
    public final void method453(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, class673 arg5, class635 arg6) {
        if (arg2) {
            this.method447((byte) -69);
        }
        ++field1964;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Loa;I)V", line = 160)
    public final void method456(class635 arg0, int arg1) {
        this.field1960.method1040(262144, arg0);
        ++field1967;
        if (arg1 < 97) {
            field1969 = -72;
        }
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(Loa;Lbfa;IIIIIZII)V", line = 172)
    public class164(class635 arg0, class335 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg1.field4411, arg1.field4360, arg1.field4328);
        this.field1960 = new class177(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
        this.field1958 = ~arg1.field4407 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "(Loa;I)V", line = 185)
    public final void method451(class635 arg0, int arg1) {
        ++field1951;
        if (arg1 != 31055) {
            this.field1960 = null;
        }
        class350 var3 = this.field1960.method1041(super.field4472, true, arg0, true, 262144, super.field4478, true);
        if (var3 != null) {
            int var4 = super.field4478 >> 9;
            int var5 = super.field4472 >> 9;
            class389 var6 = arg0.method297();
            var6.method228(super.field4478, super.field4476, super.field4472);
            this.field1960.method1034(var5, var4, var4, var6, var5, arg0, 127, var3, false);
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IILoa;)Lba;", line = 209)
    public final class350 method455(int arg0, int arg1, class635 arg2) {
        if (arg1 > -20) {
            this.method443((byte) 91);
        }
        ++field1955;
        return this.field1960.method1041(0, false, arg2, true, arg0, 0, false);
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Loa;B)V", line = 220)
    public final void method446(class635 arg0, byte arg1) {
        if (arg1 < -126) {
            ++field1971;
            this.field1960.method1033(arg0, (byte) 89);
        }
    }

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "(I)V", line = 236)
    public final void method448(int arg0) {
        int var2 = -89 / ((12 - arg0) / 56);
        ++field1961;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)I", line = 254)
    public final int method444(byte arg0) {
        ++field1962;
        int var2 = 9 % ((arg0 - 7) / 46);
        return this.field1960.field2153;
    }
}
