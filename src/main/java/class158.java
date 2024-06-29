import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class158 extends class417 implements class274 {

    @OriginalMember(owner = "client!bu", name = "bb", descriptor = "Z")
    private boolean field2061 = false;

    @OriginalMember(owner = "client!bu", name = "I", descriptor = "Lhw;")
    public class638 field2042;

    @OriginalMember(owner = "client!bu", name = "J", descriptor = "Z")
    private boolean field2043;

    @OriginalMember(owner = "client!bu", name = "Q", descriptor = "I")
    public static int field2050 = 0;

    @OriginalMember(owner = "client!bu", name = "H", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!bu", name = "L", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!bu", name = "M", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!bu", name = "N", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!bu", name = "O", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!bu", name = "P", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!bu", name = "R", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!bu", name = "S", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!bu", name = "T", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!bu", name = "U", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!bu", name = "V", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!bu", name = "W", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!bu", name = "X", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!bu", name = "Y", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!bu", name = "Z", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!bu", name = "ab", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!bu", name = "cb", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!bu", name = "db", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!bu", name = "eb", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!bu", name = "K", descriptor = "Lid;")
    private class486 field2044;

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "(ILha;)Lid;")
    public final class486 method170(int arg0, class570 arg1) {
        int var3 = -93 / ((-9 - arg0) / 63);
        ++field2057;
        return this.field2044;
    }

    @OriginalMember(owner = "client!bu", name = "e", descriptor = "(I)I")
    public final int method747(int arg0) {
        ++field2060;
        return arg0 != 15258 ? -117 : this.field2042.method3443(-1);
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Z)I")
    public final int method1007(boolean arg0) {
        if (!arg0) {
            this.field2043 = true;
        }
        ++field2058;
        return this.field2042.field8100;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(IILha;I)Z")
    public final boolean method179(int arg0, int arg1, class570 arg2, int arg3) {
        ++field2053;
        class299 var5 = this.field2042.method3440(7, 131072, false, arg2, false);
        int var6 = 59 % ((-23 - arg3) / 37);
        if (var5 == null) {
            return false;
        } else {
            class465 var7 = arg2.method948();
            var7.method449(super.field2896, super.field2892, super.field2900);
            return class653.field8360 ? var5.method1233(arg0, arg1, var7, false, 0, class628.field7974) : var5.method1264(arg0, arg1, var7, false, 0);
        }
    }

    @OriginalMember(owner = "client!bu", name = "e", descriptor = "(B)I")
    public final int method745(byte arg0) {
        if (arg0 > -85) {
            field2050 = 95;
        }
        ++field2041;
        return this.field2042.method3437(0);
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)Z")
    public final boolean method1008(byte arg0) {
        ++field2045;
        if (arg0 >= -51) {
            this.method1010(-2);
        }
        return this.field2042.method3444(-2026);
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILmea;)V")
    public final void method1009(int arg0, class702 arg1) {
        if (arg0 != -1993) {
            this.field2042 = null;
        }
        this.field2042.method3442(arg1, (byte) -39);
        ++field2049;
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(ILha;)Lpi;")
    public final class266 method187(int arg0, class570 arg1) {
        ++field2056;
        class299 var3 = this.field2042.method3440(7, 2048, true, arg1, false);
        if (var3 == null) {
            return null;
        } else {
            class465 var4 = arg1.method948();
            if (arg0 != -29562) {
                this.field2042 = null;
            }
            var4.method449(super.field2896, super.field2892, super.field2900);
            class266 var5 = class689.method3680((byte) -15, this.field2043, 1);
            int var6 = super.field2896 >> 9;
            int var7 = super.field2900 >> 9;
            this.field2042.method3438(var7, var3, arg0 ^ -29555, true, var6, var4, arg1, var6, var7);
            if (class653.field8360) {
                var3.method1292(var4, var5.field3533[0], class628.field7974, 0);
            } else {
                var3.method1297(var4, var5.field3533[0], 0);
            }
            if (this.field2042.field8126 != null) {
                class705 var8 = this.field2042.field8126.method2844();
                if (class653.field8360) {
                    arg1.method980(var8, class628.field7974);
                } else {
                    arg1.method912(var8);
                }
            }
            this.field2061 = var3.method1272() || this.field2042.field8126 != null;
            if (this.field2044 != null) {
                class345.method1997(this.field2044, var3, super.field2900, super.field2896, super.field2892, (byte) 108);
            } else {
                this.field2044 = class77.method476(super.field2892, super.field2900, var3, super.field2896, 5);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "(Z)Z")
    public final boolean method738(boolean arg0) {
        ++field2054;
        if (!arg0) {
            this.field2061 = false;
        }
        return this.field2061;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)I")
    public final int method1010(int arg0) {
        ++field2052;
        if (arg0 != -6546) {
            this.method170(-16, (class570) null);
        }
        return this.field2042.field8121;
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(III)V")
    public static final void method1011(int arg0, int arg1, int arg2) {
        class766 var3 = class28.field252[arg0][arg1][arg2];
        if (var3 != null) {
            class733.method3911(var3.field10432);
            class733.method3911(var3.field10430);
            if (var3.field10432 != null) {
                var3.field10432 = null;
            }
            if (var3.field10430 != null) {
                var3.field10430 = null;
            }
        }
    }

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "(B)Z")
    public final boolean method743(byte arg0) {
        if (arg0 > -76) {
            this.field2043 = true;
        }
        ++field2064;
        return false;
    }

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "(B)V")
    public final void method1012(byte arg0) {
        if (arg0 >= 115) {
            ++field2055;
        }
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(B)I")
    public final int method1013(byte arg0) {
        ++field2051;
        int var2 = -61 % ((arg0 - 76) / 36);
        return this.field2042.field8116;
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(Lha;Lih;IIIIIZII)V")
    public class158(class570 arg0, class773 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field10449);
        this.field2042 = new class638(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
        this.field2043 = ~arg1.field10488 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILha;)V")
    public final void method1014(int arg0, class570 arg1) {
        ++field2063;
        this.field2042.method3439(arg1, -5887);
        if (arg0 != -7908) {
            this.method174(true, -75, (byte) -19, (class210) null, (class570) null, -112, -119);
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(BLha;)V")
    public final void method1015(byte arg0, class570 arg1) {
        this.field2042.method3441(arg1, 1);
        ++field2048;
        if (arg0 > -71) {
            this.method1012((byte) 101);
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Lha;I)V")
    public final void method182(class570 arg0, int arg1) {
        ++field2046;
        class299 var3 = this.field2042.method3440(7, 262144, true, arg0, true);
        if (var3 != null) {
            int var4 = super.field2896 >> 9;
            int var5 = super.field2900 >> 9;
            class465 var6 = arg0.method948();
            var6.method449(super.field2896, super.field2892, super.field2900);
            this.field2042.method3438(var5, var3, 11, false, var4, var6, arg0, var4, var5);
        }
        if (arg1 > -87) {
            this.field2061 = false;
        }
    }

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "(I)Z")
    public final boolean method171(int arg0) {
        if (arg0 > -80) {
            this.field2061 = false;
        }
        ++field2047;
        return false;
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(I)V")
    public final void method185(int arg0) {
        if (arg0 == 0) {
            ++field2062;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(ZIBLlq;Lha;II)V")
    public final void method174(boolean arg0, int arg1, byte arg2, class210 arg3, class570 arg4, int arg5, int arg6) {
        ++field2059;
        if (arg2 != -126) {
            this.method187(56, (class570) null);
        }
        throw new IllegalStateException();
    }
}
