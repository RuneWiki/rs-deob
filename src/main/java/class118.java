import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class118 extends class205 {

    @OriginalMember(owner = "client!wj", name = "y", descriptor = "Z")
    public static boolean field1815 = false;

    @OriginalMember(owner = "client!wj", name = "x", descriptor = "[I")
    public static int[] field1814 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!wj", name = "t", descriptor = "Z")
    public static boolean field1810 = false;

    @OriginalMember(owner = "client!wj", name = "u", descriptor = "I")
    public int field1811;

    @OriginalMember(owner = "client!wj", name = "v", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!wj", name = "z", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!wj", name = "A", descriptor = "I")
    public int field1817;

    @OriginalMember(owner = "client!wj", name = "B", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!wj", name = "C", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!wj", name = "D", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!wj", name = "E", descriptor = "I")
    public int field1821;

    @OriginalMember(owner = "client!wj", name = "F", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!wj", name = "H", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!wj", name = "I", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!wj", name = "J", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!wj", name = "G", descriptor = "Ltc;")
    public static class73 field1823;

    @OriginalMember(owner = "client!wj", name = "w", descriptor = "Ljava/lang/String;")
    public String field1813;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(Z)I")
    public final int method930(boolean arg0) {
        ++field1825;
        if (!arg0) {
            method937(-39);
        }
        return (int) super.field1039;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)I")
    public final int method931(byte arg0) {
        if (arg0 != 70) {
            this.field1813 = null;
        }
        ++field1822;
        return (int) (super.field1039 >>> 32 & 255L);
    }

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "(B)V")
    public static final void method932(byte arg0) {
        ++field1820;
        if (arg0 == -27) {
            if (class159.field2475 != null) {
                class346.field5112 = new class723();
                class346.field5112.method3990(class564.field7996, (byte) -128, class159.field2475.field6308, class159.field2475, class159.field2475.field6304.method3621(107, class467.field6804));
                class719.field10081 = new Thread(class346.field5112, "");
                class719.field10081.start();
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "(B)V")
    public final void method933(byte arg0) {
        super.field3444 |= Long.MIN_VALUE;
        ++field1818;
        if (~this.method938((byte) -103) == -1L) {
            class718.field10075.method3779(-14068, this);
        }
        if (arg0 < 29) {
            this.method933((byte) -94);
        }
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(II)Z")
    public static final boolean method934(int arg0, int arg1) {
        ++field1824;
        if (class229.field3705[arg0]) {
            return true;
        } else if (!class334.field4889.method2607(arg0, (byte) -86)) {
            return false;
        } else {
            int var2 = class334.field4889.method2615(0, arg0);
            if (~var2 == -1) {
                class229.field3705[arg0] = true;
                return true;
            } else {
                if (class158.field2453[arg0] == null) {
                    class158.field2453[arg0] = new class353[var2];
                }
                if (arg1 < 4) {
                    return false;
                } else {
                    for (int var3 = 0; var2 > var3; ++var3) {
                        if (class158.field2453[arg0][var3] == null) {
                            byte[] var4 = class334.field4889.method2624(0, arg0, var3);
                            if (var4 != null) {
                                class353 var5 = class158.field2453[arg0][var3] = new class353();
                                var5.field5349 = (arg0 << 16) + var3;
                                if (~var4[0] != 0) {
                                    throw new IllegalStateException("if1");
                                }
                                var5.method2254(new class301(var4), 27289);
                            }
                        }
                    }
                    class229.field3705[arg0] = true;
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIIIIBI)V")
    public static final void method935(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        ++field1826;
        if (method934(arg5, 66)) {
            int var10 = 0;
            int var11 = 0;
            if (arg7 > 39) {
                int var12 = 0;
                int var13 = 0;
                int var14 = 0;
                if (class250.field3989) {
                    var14 = class486.field7031;
                    var12 = class750.field10457;
                    var13 = class79.field1155;
                    var10 = class428.field6276;
                    var11 = class613.field8647;
                    class486.field7031 = 1;
                }
                if (class114.field1763[arg5] == null) {
                    class706.method3919((byte) 39, arg2, arg3, arg8, ~arg2 > -1, arg1, arg0, arg6, class158.field2453[arg5], arg4, -1);
                } else {
                    class706.method3919((byte) 113, arg2, arg3, arg8, arg2 < 0, arg1, arg0, arg6, class114.field1763[arg5], arg4, -1);
                }
                if (class250.field3989) {
                    if (~arg2 <= -1 && ~class486.field7031 == -3) {
                        class438.method2696(class613.field8647, class79.field1155, class750.field10457, (byte) 83, class428.field6276);
                    }
                    class613.field8647 = var11;
                    class486.field7031 = var14;
                    class750.field10457 = var12;
                    class79.field1155 = var13;
                    class428.field6276 = var10;
                }
            }
        } else if (arg2 != -1) {
            class6.field66[arg2] = true;
        } else {
            for (int var9 = 0; var9 < 100; ++var9) {
                class6.field66[var9] = true;
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V")
    public final void method936(int arg0) {
        if (arg0 != 0) {
            field1810 = true;
        }
        super.field3444 = super.field3444 & Long.MIN_VALUE | 500L + class18.method109(arg0 + -11121);
        ++field1812;
        class696.field9872.method3779(-14068, this);
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(I)V")
    public static void method937(int arg0) {
        field1823 = null;
        if (arg0 == -15900) {
            field1814 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(II)V")
    public class118(int arg0, int arg1) {
        super.field1039 = (long) arg0 << 32 | (long) arg1;
    }

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "(B)J")
    public final long method938(byte arg0) {
        int var2 = -14 % ((arg0 - 62) / 41);
        ++field1819;
        return super.field3444 & Long.MAX_VALUE;
    }
}
