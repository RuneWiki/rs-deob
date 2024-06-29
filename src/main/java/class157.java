import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class157 extends class381 implements class351 {

    @OriginalMember(owner = "client!jj", name = "O", descriptor = "Ltd;")
    public class107 field2067;

    @OriginalMember(owner = "client!jj", name = "M", descriptor = "Z")
    private boolean field2065;

    @OriginalMember(owner = "client!jj", name = "I", descriptor = "Lop;")
    public static class353 field2061 = new class353(64);

    @OriginalMember(owner = "client!jj", name = "Q", descriptor = "Lsf;")
    public static class143 field2069 = new class143(32);

    @OriginalMember(owner = "client!jj", name = "S", descriptor = "[[I")
    public static int[][] field2071 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!jj", name = "R", descriptor = "J")
    public static long field2070 = 0L;

    @OriginalMember(owner = "client!jj", name = "T", descriptor = "Ljava/lang/String;")
    public static String field2072 = "scroll:";

    @OriginalMember(owner = "client!jj", name = "N", descriptor = "C")
    public static char field2066;

    @OriginalMember(owner = "client!jj", name = "w", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!jj", name = "x", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!jj", name = "y", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!jj", name = "A", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!jj", name = "B", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!jj", name = "C", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!jj", name = "D", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!jj", name = "E", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!jj", name = "F", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!jj", name = "G", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!jj", name = "H", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!jj", name = "J", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!jj", name = "K", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!jj", name = "L", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!jj", name = "P", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lnr;Z)V")
    public final void method156(class437 arg0, boolean arg1) {
        this.field2067.method742(arg0, 4);
        ++field2049;
        if (arg1) {
            field2072 = null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(Lnr;Z)Lg;")
    public final class433 method145(class437 arg0, boolean arg1) {
        ++field2057;
        class95 var3 = this.field2067.method739(1024, arg0, super.field5712, super.field5710, true, false, -62);
        if (var3 == null) {
            return null;
        } else {
            class116 var4 = arg0.method2026();
            var4.method809(super.field5712, super.field5714, super.field5710);
            class433 var5 = null;
            if (this.field2065) {
                var5 = class436.method2758(1, 12300);
            }
            if (this.field2067.field1468 != null) {
                class125 var6 = this.field2067.field1468.method1783();
                arg0.method2162(var3, var6, var4, var5 == null ? null : var5.field6381[0], 0);
            } else {
                var3.method602(var4, var5 == null ? null : var5.field6381[0], 0);
            }
            this.field2067.method738(super.field5712 >> 7, true, super.field5710 >> 7, var3, arg0, super.field5710 >> 7, arg1, super.field5712 >> 7);
            return var5;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)Z")
    public final boolean method146(byte arg0) {
        ++field2063;
        return arg0 <= 102 ? true : this.field2067.method743(-1724944720);
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(I)V")
    public final void method163(int arg0) {
        if (arg0 == 0) {
            ++field2054;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(B)I")
    public final int method150(byte arg0) {
        ++field2051;
        if (arg0 >= -110) {
            this.method156((class437) null, false);
        }
        return this.field2067.field1455;
    }

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "(B)Z")
    public final boolean method151(byte arg0) {
        if (arg0 != -115) {
            return true;
        } else {
            ++field2058;
            return false;
        }
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(B)V")
    public final void method158(byte arg0) {
        if (arg0 != 6) {
            this.method146((byte) -41);
        }
        ++field2052;
    }

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "(I)V")
    public static void method1000(int arg0) {
        field2069 = null;
        if (arg0 != 1) {
            method1002(52, (class351) null, (byte) -39, 115);
        }
        field2061 = null;
        field2071 = null;
        field2072 = null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BLnr;IIZLcb;I)V")
    public final void method153(byte arg0, class437 arg1, int arg2, int arg3, boolean arg4, class387 arg5, int arg6) {
        if (arg0 < -116) {
            ++field2056;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1001(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 == arg2 && arg3 == arg4) {
            if (!class54.method374(arg0, arg1, arg3)) {
                return false;
            } else {
                int var6 = arg1 << 7;
                int var7 = arg3 << 7;
                return class447.method2814(var6 + 1, class88.field1226[arg0].method781(arg1, arg3) + arg5, var7 + 1) && class447.method2814(var6 + 128 - 1, class88.field1226[arg0].method781(arg1 + 1, arg3) + arg5, var7 + 1) && class447.method2814(var6 + 128 - 1, class88.field1226[arg0].method781(arg1 + 1, arg3 + 1) + arg5, var7 + 128 - 1) && class447.method2814(var6 + 1, class88.field1226[arg0].method781(arg1, arg3 + 1) + arg5, var7 + 128 - 1);
            }
        } else {
            for (int var8 = arg1; var8 <= arg2; ++var8) {
                for (int var14 = arg3; var14 <= arg4; ++var14) {
                    if (class63.field900[arg0][var8][var14] == -class246.field3431) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class88.field1226[arg0].method781(arg1, arg3) + arg5;
            if (!class447.method2814(var9, var11, var10)) {
                return false;
            } else {
                int var12 = (arg2 << 7) - 1;
                if (!class447.method2814(var12, var11, var10)) {
                    return false;
                } else {
                    int var13 = (arg4 << 7) - 1;
                    if (!class447.method2814(var9, var11, var13)) {
                        return false;
                    } else if (!class447.method2814(var12, var11, var13)) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILnr;)V")
    public final void method154(int arg0, class437 arg1) {
        this.field2067.method749(arg1, (byte) -5);
        if (arg0 != 25510) {
            field2070 = -67L;
        }
        ++field2059;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BILnr;)Lqc;")
    public final class95 method147(byte arg0, int arg1, class437 arg2) {
        ++field2068;
        int var4 = 56 % ((arg0 - -32) / 61);
        return this.field2067.method739(arg1, arg2, 0, 0, false, false, -95);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lnr;I)V")
    public final void method161(class437 arg0, int arg1) {
        if (arg1 != 0) {
            this.method147((byte) 42, -27, (class437) null);
        }
        ++field2050;
        class95 var3 = this.field2067.method739(131072, arg0, super.field5712, super.field5710, true, true, 83);
        if (var3 != null) {
            this.field2067.method738(super.field5712 >> 7, false, super.field5710 >> 7, var3, arg0, super.field5710 >> 7, false, super.field5712 >> 7);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILim;BI)J")
    public static final long method1002(int arg0, class351 arg1, byte arg2, int arg3) {
        ++field2064;
        long var4 = 4194304L;
        long var6 = 2147483648L;
        if (arg2 != -108) {
            field2071 = null;
        }
        long var8 = Long.MIN_VALUE;
        class404 var10 = class165.method1020(arg1.method150((byte) -111), 115);
        long var11 = (long) (arg1.method160(-22056) << 14 | arg0 | arg3 << 7 | arg1.method148((byte) -68) << 20 | 1073741824);
        if (~var10.field6009 == -1) {
            var11 |= var8;
        }
        if (var10.field6049 == 1) {
            var11 |= var4;
        }
        if (var10.field6026) {
            var11 |= var6;
        }
        return var11 | (long) arg1.method150((byte) -112) << 32;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILnr;II)Z")
    public final boolean method159(int arg0, class437 arg1, int arg2, int arg3) {
        ++field2062;
        if (arg3 <= 12) {
            this.method156((class437) null, true);
        }
        class95 var5 = this.field2067.method739(65536, arg1, super.field5712, super.field5710, false, false, -42);
        if (var5 == null) {
            return false;
        } else {
            class116 var6 = arg1.method2026();
            var6.method809(super.field5712, super.field5714, super.field5710);
            return var5.method619(arg2, arg0, var6, false);
        }
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lnr;Lta;IIIIIIZI)V")
    public class157(class437 arg0, class404 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        super(arg5, arg6, arg7, arg1.field6024, arg1.field6026);
        this.field2067 = new class107(arg0, arg1, 22, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
        this.field2065 = arg1.field6009 != 0 && !arg8;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)I")
    public final int method160(int arg0) {
        if (arg0 != -22056) {
            field2071 = null;
        }
        ++field2055;
        return this.field2067.field1456;
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(B)I")
    public final int method148(byte arg0) {
        if (arg0 != -68) {
            return -126;
        } else {
            ++field2053;
            return this.field2067.field1458;
        }
    }
}
