import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class125 {

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "Llga;")
    private class663 field1811 = new class663(64);

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "Lsea;")
    private class648 field1813;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "Lsea;")
    private class648 field1810;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "[I")
    public static int[] field1815 = new int[50];

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "F")
    public static float field1816;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "Lsea;")
    public static class648 field1812;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)Ldaa;")
    public final class11 method899(int arg0, int arg1) {
        field1814++;
        class11 var3 = (class11) this.field1811.method3747((byte) -66, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 < 32768) {
            var4 = this.field1813.method3654(arg1 ^ 0xFFFFC301, 0, arg0);
        } else {
            var4 = this.field1810.method3654(-15615, 0, arg0 & 0x7FFF);
        }
        if (arg1 != 0) {
            method901(-22, (byte) 78);
        }
        class11 var5 = new class11();
        if (var4 != null) {
            var5.method56(new class501(var4), 0);
        }
        if (arg0 >= 32768) {
            var5.method54(32768);
        }
        this.field1811.method3748((long) arg0, var5, 12537);
        return var5;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)Lba;")
    public static final class352 method900(int arg0) {
        field1817++;
        return class674.field9521 == arg0 ? new class352() : class354.field4703[--class674.field9521];
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IB)Z")
    public static final boolean method901(int arg0, byte arg1) {
        field1809++;
        class442.field6115 = arg0 + 1 & 0xFFFF;
        if (arg1 >= -84) {
            method903(null, 54, true, -103, null);
        }
        class43.field509 = true;
        return true;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZLlj;I[IIIII)Lnea;")
    public static final class665 method902(boolean arg0, class565 arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
        field1818++;
        if (arg4 != 34037) {
            method902(true, null, -78, null, -16, 50, 21, 117);
        }
        if (!arg1.field7870 && (!class588.method3342(arg4 ^ 0xFFFF7B7E, arg6) || !class588.method3342(-119, arg2))) {
            return arg1.field7973 ? new class665(arg1, 34037, arg6, arg2, arg0, arg3, arg7, arg5) : new class665(arg1, arg6, arg2, class206.method1334(-1, arg6), class206.method1334(-1, arg2), arg3);
        } else {
            return new class665(arg1, 3553, arg6, arg2, arg0, arg3, arg7, arg5);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lsr;IZILsr;)I")
    public static final int method903(class228 arg0, int arg1, boolean arg2, int arg3, class228 arg4) {
        field1808++;
        if (arg1 == 1) {
            int var5 = arg4.field3532;
            int var6 = arg0.field3532;
            if (!arg2) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg1 == 2) {
            return class365.method2110(arg4.method1446((byte) -118).field7479, -12017, class697.field9900, arg0.method1446((byte) -99).field7479);
        } else if (arg1 == 3) {
            if (arg4.field3171.equals("-")) {
                if (arg0.field3171.equals("-")) {
                    return 0;
                } else if (arg2) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg0.field3171.equals("-")) {
                return arg2 ? 1 : -1;
            } else {
                return class365.method2110(arg4.field3171, -12017, class697.field9900, arg0.field3171);
            }
        } else if (arg1 == 4) {
            if (arg4.method1591(-89)) {
                return arg0.method1591(-25) ? 0 : 1;
            } else if (arg0.method1591(-56)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg1 == 5) {
            if (arg4.method1590(0)) {
                return arg0.method1590(0) ? 0 : 1;
            } else if (arg0.method1590(0)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg1 == 6) {
            if (arg4.method1593(21945)) {
                return arg0.method1593(21945) ? 0 : 1;
            } else if (arg0.method1593(21945)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg1 != 7) {
            if (arg3 > -17) {
                field1812 = null;
            }
            if (arg1 != 8) {
                return arg4.field3173 - arg0.field3173;
            }
            int var7 = arg4.field3172;
            int var8 = arg0.field3172;
            if (arg2) {
                if (var8 == 1000) {
                    var8 = -1;
                }
                if (var7 == 1000) {
                    var7 = -1;
                }
            } else {
                if (var7 == -1) {
                    var7 = 1000;
                }
                if (var8 == -1) {
                    var8 = 1000;
                }
            }
            return var7 - var8;
        } else if (arg4.method1589((byte) -23)) {
            return arg0.method1589((byte) -45) ? 0 : 1;
        } else if (arg0.method1589((byte) 104)) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(ILsea;Lsea;)V")
    public class125(int arg0, class648 arg1, class648 arg2) {
        this.field1813 = arg1;
        this.field1810 = arg2;
        if (this.field1813 != null) {
            this.field1813.method3653(0, true);
        }
        if (this.field1810 != null) {
            this.field1810.method3653(0, true);
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V")
    public static void method904(int arg0) {
        if (arg0 == 0) {
            field1812 = null;
            field1815 = null;
        }
    }
}
