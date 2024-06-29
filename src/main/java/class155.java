import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class155 extends class349 implements class351 {

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "Ltd;")
    public class107 field2022;

    @OriginalMember(owner = "client!mk", name = "C", descriptor = "Z")
    private boolean field2031;

    @OriginalMember(owner = "client!mk", name = "D", descriptor = "I")
    public static int field2032 = 0;

    @OriginalMember(owner = "client!mk", name = "y", descriptor = "F")
    public static float field2027 = 1024.0F;

    @OriginalMember(owner = "client!mk", name = "B", descriptor = "Ljava/lang/String;")
    public static String field2030 = "";

    @OriginalMember(owner = "client!mk", name = "I", descriptor = "I")
    public static int field2037 = -1;

    @OriginalMember(owner = "client!mk", name = "G", descriptor = "[Ljava/lang/String;")
    public static String[] field2035 = new String[100];

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!mk", name = "w", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!mk", name = "x", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!mk", name = "A", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!mk", name = "E", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!mk", name = "F", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!mk", name = "H", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!mk", name = "J", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!mk", name = "K", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!mk", name = "L", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!mk", name = "M", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!mk", name = "N", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!mk", name = "O", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!mk", name = "P", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lnr;Lta;IIIIIIIZI)V", line = 3)
    public class155(class437 arg0, class404 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        super(arg6, arg7, arg8, class165.method1023(arg2, 10036, arg3));
        this.field2022 = new class107(arg0, arg1, arg2, arg3, arg4, arg5, super.field5179, super.field5175, arg9, arg10);
        this.field2031 = arg1.field6009 != 0 && !arg9;
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(B)I", line = 17)
    public final int method148(byte arg0) {
        if (arg0 != -68) {
            field2037 = -96;
        }
        ++field2039;
        return this.field2022.field1458;
    }

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "(B)V", line = 33)
    public final void method158(byte arg0) {
        ++field2038;
        if (arg0 != 6) {
            this.method156((class437) null, false);
        }
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(B)I", line = 43)
    public final int method150(byte arg0) {
        ++field2041;
        return arg0 >= -110 ? -92 : this.field2022.field1455;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)V", line = 54)
    public static void method996(boolean arg0) {
        if (arg0) {
            method996(true);
        }
        field2035 = null;
        field2030 = null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lnr;Z)V", line = 70)
    public final void method156(class437 arg0, boolean arg1) {
        this.field2022.method742(arg0, 4);
        if (!arg1) {
            ++field2043;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)Z", line = 83)
    public final boolean method146(byte arg0) {
        ++field2040;
        if (arg0 < 102) {
            field2030 = null;
        }
        return this.field2022.method743(-1724944720);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BLnr;IIZLcb;I)V", line = 94)
    public final void method153(byte arg0, class437 arg1, int arg2, int arg3, boolean arg4, class387 arg5, int arg6) {
        if (arg0 >= -116) {
            method998(-49, -98, -52, 4, false, 24, 83, (class249) null);
        }
        ++field2036;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)Z", line = 105)
    public static final boolean method997(int arg0, int arg1) {
        if (arg0 != -25976) {
            method997(-119, -111);
        }
        ++field2033;
        class420.field6243 = 65535 & arg1 + 1;
        class449.field6560 = true;
        return true;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BILnr;)Lqc;", line = 126)
    public final class95 method147(byte arg0, int arg1, class437 arg2) {
        int var4 = 75 / ((arg0 - -32) / 61);
        ++field2029;
        return this.field2022.method739(arg1, arg2, 0, 0, false, false, 76);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lnr;I)V", line = 139)
    public final void method161(class437 arg0, int arg1) {
        ++field2025;
        class95 var3 = this.field2022.method739(131072, arg0, super.field5179, super.field5175, true, true, -51);
        if (arg1 == 0) {
            if (var3 != null) {
                this.field2022.method738(super.field5179 >> 7, false, super.field5175 >> 7, var3, arg0, super.field5175 >> 7, false, super.field5179 >> 7);
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)I", line = 154)
    public final int method160(int arg0) {
        if (arg0 != -22056) {
            this.method151((byte) 10);
        }
        ++field2024;
        return this.field2022.field1456;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILnr;II)Z", line = 165)
    public final boolean method159(int arg0, class437 arg1, int arg2, int arg3) {
        ++field2044;
        class95 var5 = this.field2022.method739(65536, arg1, super.field5179, super.field5175, false, false, 62);
        if (var5 == null) {
            return false;
        } else {
            if (arg3 <= 12) {
                field2027 = 0.51757944F;
            }
            class116 var6 = arg1.method2026();
            var6.method809(super.field5179, super.field5182, super.field5175);
            return var5.method619(arg2, arg0, var6, false);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILnr;)V", line = 186)
    public final void method154(int arg0, class437 arg1) {
        if (arg0 != 25510) {
            this.method159(-24, (class437) null, -120, -78);
        }
        this.field2022.method749(arg1, (byte) -5);
        ++field2023;
    }

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "(B)Z", line = 197)
    public final boolean method151(byte arg0) {
        ++field2028;
        if (arg0 != -115) {
            field2030 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "(I)V", line = 215)
    public final void method163(int arg0) {
        if (arg0 != 0) {
            this.method150((byte) 6);
        }
        ++field2026;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(Lnr;Z)Lg;", line = 232)
    public final class433 method145(class437 arg0, boolean arg1) {
        ++field2034;
        class95 var3 = this.field2022.method739(1024, arg0, super.field5179, super.field5175, true, arg1, 109);
        if (var3 == null) {
            return null;
        } else {
            class116 var4 = arg0.method2026();
            var4.method809(super.field5179, super.field5182, super.field5175);
            class433 var5 = null;
            if (this.field2031) {
                var5 = class436.method2758(1, 12300);
            }
            if (this.field2022.field1468 != null) {
                class125 var6 = this.field2022.field1468.method1783();
                arg0.method2162(var3, var6, var4, var5 != null ? var5.field6381[0] : null, 0);
            } else {
                var3.method602(var4, var5 == null ? null : var5.field6381[0], 0);
            }
            this.field2022.method738(super.field5179 >> 7, true, super.field5175 >> 7, var3, arg0, super.field5175 >> 7, arg1, super.field5179 >> 7);
            return var5;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIIZIILro;)V", line = 266)
    public static final void method998(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, class249 arg7) {
        if (arg7.field3637 == 2) {
            int var8 = 99999;
            int var9 = 0;
            int var10 = 0;
            for (int var11 = 0; ~var11 > ~arg7.field3489; ++var11) {
                for (int var12 = 0; arg7.field3607 > var12; ++var12) {
                    int var13 = (32 - -arg7.field3499) * var12 + arg1;
                    int var14 = (arg7.field3581 + 32) * var11 + arg5;
                    if (var10 < 20) {
                        var14 += arg7.field3504[var10];
                        var13 += arg7.field3490[var10];
                    }
                    if (~arg7.field3567[var10] < -1 && (~arg0 > ~(var13 - -32) && ~var13 > ~arg3 && ~arg6 > ~(var14 + 32) && ~arg2 < ~var14 || class229.field3246 == arg7 && ~class396.field5948 == ~var10)) {
                        if (~var10 < ~var9) {
                            var9 = var10;
                        }
                        if (~var8 < ~var10) {
                            var8 = var10;
                        }
                    }
                    ++var10;
                }
            }
            class419.method2697(var9, var8, class35.field574, 120, arg7);
        } else if (~arg7.field3637 == -6 && ~arg7.field3588 != 0) {
            class323.method1999(6, arg7, class35.field574);
        }
        ++field2042;
        if (!arg4) {
            field2030 = null;
        }
    }
}
