import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class115 {

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "Lof;")
    private class242 field1995 = new class242(256);

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "Lof;")
    private class242 field1998 = new class242(256);

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "Lik;")
    private class262 field1994;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "Lik;")
    private class262 field1992;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "Lsf;")
    public static class108 field1987 = class140.method973(255, " est d-Bj-9 dans votre liste noire)3");

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIB[I)Ltd;", line = 4)
    private final class244 method818(int arg0, int arg1, byte arg2, int[] arg3) {
        field1991++;
        int var5 = ((arg1 & 0xD0000FFF) << 4 | arg1 >>> 12) ^ arg0;
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        class244 var9 = (class244) this.field1998.method1676(var7, (byte) -72);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class275 var10 = class275.method1985(this.field1992, arg1, arg0);
            if (arg2 >= -22) {
                return (class244) null;
            } else if (var10 == null) {
                return null;
            } else {
                class244 var11 = var10.method1987();
                this.field1998.method1681(1, var11, var7);
                if (arg3 != null) {
                    arg3[0] -= var11.field4230.length;
                }
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "([IIIB)Ltd;", line = 49)
    private final class244 method819(int[] arg0, int arg1, int arg2, byte arg3) {
        field1996++;
        int var5 = arg2 ^ ((arg1 & 0xA0000FFF) << 4 | arg1 >>> 12);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class244 var9 = (class244) this.field1998.method1676(var7, (byte) -72);
        if (var9 != null) {
            return var9;
        } else if (arg0 != null && arg0[0] <= 0) {
            return null;
        } else if (arg3 == -123) {
            class127 var10 = (class127) this.field1995.method1676(var7, (byte) -71);
            if (var10 == null) {
                var10 = class127.method882(this.field1994, arg1, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field1995.method1681(1, var10, var7);
            }
            class244 var11 = var10.method873(arg0);
            if (var11 == null) {
                return null;
            } else {
                var10.method1325(0);
                this.field1998.method1681(arg3 + 124, var11, var7);
                return var11;
            }
        } else {
            return (class244) null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z[II)Ltd;", line = 98)
    public final class244 method820(boolean arg0, int[] arg1, int arg2) {
        if (arg0) {
            return (class244) null;
        }
        field1990++;
        if (this.field1992.method1879(0) == 1) {
            return this.method818(arg2, 0, (byte) -81, arg1);
        } else if (this.field1992.method1876(arg2, (byte) -124) == 1) {
            return this.method818(0, arg2, (byte) -31, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lgk;BLof;)Lcl;", line = 120)
    public static final class133 method821(class7 arg0, byte arg1, class242 arg2) {
        if (arg1 != -58) {
            method823(83, (byte) 127, 54, 119, -109, 37);
        }
        field1993++;
        long var3 = ((long) arg0.field84 << 56) + ((long) arg0.field79 << 32) + (long) ((arg0.field77 - -1 << 16) + arg0.field91);
        class133 var5 = (class133) arg2.method1676(var3, (byte) -93);
        if (var5 == null) {
            var5 = new class133(arg0.field77, (float) arg0.field91, true, false, arg0.field79);
            arg2.method1681(1, var5, var3);
        }
        return var5;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V", line = 142)
    public static void method822(int arg0) {
        field1987 = null;
        int var1 = 125 % ((arg0 - 29) / 55);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IBIIII)V", line = 156)
    public static final void method823(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field1997++;
        int var6 = -43 % ((arg1 + 55) / 40);
        if (arg0 == arg4) {
            class158.method1100(24636, arg4, arg2, arg5, arg3);
        } else if (class260.field4593 <= arg3 - arg4 && class79.field1202 >= (arg3 + arg4) && arg5 - arg0 >= class266.field4677 && class166.field2984 >= (arg0 + arg5)) {
            class233.method1627(arg3, arg0, arg5, arg2, (byte) -84, arg4);
        } else {
            class315.method2195(arg5, arg0, arg3, arg4, -624, arg2);
        }
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lik;Lik;)V", line = 234)
    public class115(class262 arg0, class262 arg1) {
        this.field1994 = arg1;
        this.field1992 = arg0;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I[IB)Ltd;", line = 201)
    public final class244 method824(int arg0, int[] arg1, byte arg2) {
        field1988++;
        if (this.field1994.method1879(0) == 1) {
            return this.method819(arg1, 0, arg0, (byte) -123);
        } else if (this.field1994.method1876(arg0, (byte) -103) == 1) {
            return this.method819(arg1, arg0, 0, (byte) -123);
        } else {
            if (arg2 <= 66) {
                this.field1995 = (class242) null;
            }
            throw new RuntimeException();
        }
    }
}
