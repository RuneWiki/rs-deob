import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class66 extends class241 implements class248 {

    @OriginalMember(owner = "client!hk", name = "I", descriptor = "Lik;")
    public class138 field1145;

    @OriginalMember(owner = "client!hk", name = "L", descriptor = "Z")
    private boolean field1147;

    @OriginalMember(owner = "client!hk", name = "B", descriptor = "Ljava/lang/String;")
    public static String field1138 = null;

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "F")
    public static float field1128;

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!hk", name = "w", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!hk", name = "x", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!hk", name = "y", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!hk", name = "z", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!hk", name = "A", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!hk", name = "C", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!hk", name = "D", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!hk", name = "E", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!hk", name = "F", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!hk", name = "G", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!hk", name = "H", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!hk", name = "K", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!hk", name = "O", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!hk", name = "N", descriptor = "Lho;")
    public static class101 field1149;

    @OriginalMember(owner = "client!hk", name = "M", descriptor = "Loa;")
    public static class489 field1148;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(B)I")
    public final int method17(byte arg0) {
        ++field1137;
        int var2 = 98 / ((arg0 - -60) / 40);
        return this.field1145.field2215;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lqa;II)Lc;")
    public final class121 method23(class162 arg0, int arg1, int arg2) {
        if (arg1 != 17793) {
            this.method25((byte) -63, (class162) null);
        }
        ++field1143;
        return this.field1145.method1033(arg1 + -17797, arg2, false, arg0, 0, false, 0);
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(B)V")
    public final void method22(byte arg0) {
        if (arg0 != -3) {
            this.method19((byte) -124);
        }
        ++field1146;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lqa;I)V")
    public final void method9(class162 arg0, int arg1) {
        ++field1141;
        this.field1145.method1028(arg0, (byte) -110);
        if (arg1 > -111) {
            field1138 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILqa;II)Z")
    public final boolean method14(int arg0, class162 arg1, int arg2, int arg3) {
        ++field1136;
        class121 var5 = this.field1145.method1033(-4, arg0, false, arg1, super.field3474, false, super.field3480);
        if (var5 == null) {
            return false;
        } else {
            class414 var6 = arg1.method240();
            var6.method868(super.field3480, super.field3473, super.field3474);
            return var5.method924(arg3, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lat;I)V")
    public static final void method553(class255 arg0, int arg1) {
        ++field1150;
        if (arg1 != -867418649) {
            field1138 = null;
        }
        for (class69 var2 = (class69) class510.field7530.method2427(arg1 + 867418770); var2 != null; var2 = (class69) class510.field7530.method2422(-88)) {
            if (var2.field1188 == arg0) {
                if (var2.field1181 != null) {
                    class45.field837.method2035(var2.field1181);
                    var2.field1181 = null;
                }
                var2.method2090(-1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)I")
    public final int method12(int arg0) {
        if (arg0 != 3765) {
            return 2;
        } else {
            ++field1129;
            return this.field1145.field2203;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)Z")
    public static final boolean method554(int arg0, int arg1, int arg2) {
        int var3 = -26 % ((20 - arg2) / 42);
        ++field1133;
        return ~(arg1 & 458752) != -1 | class21.method176(-107, arg1, arg0) || class33.method350((byte) 68, arg0, arg1);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZLqa;)Lae;")
    public final class163 method13(boolean arg0, class162 arg1) {
        ++field1132;
        class121 var3 = this.field1145.method1033(-4, 2048, true, arg1, super.field3474, arg0, super.field3480);
        if (var3 == null) {
            return null;
        } else {
            class414 var4 = arg1.method240();
            var4.method868(super.field3480, super.field3473, super.field3474);
            class163 var5 = null;
            if (this.field1147) {
                var5 = class483.method2876(1, 0);
            }
            if (this.field1145.field2200 != null) {
                class49 var6 = this.field1145.field2200.method724();
                arg1.method249(var3, var6, var4, var5 != null ? var5.field2516[0] : null, 0);
            } else {
                var3.method927(var4, var5 != null ? var5.field2516[0] : null, 0);
            }
            int var7 = super.field3480 >> 7;
            int var8 = super.field3474 >> 7;
            this.field1145.method1030(var8, (byte) 109, arg1, var7, var7, true, var3, var8);
            return var5;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB)V")
    public static final void method555(int arg0, byte arg1) {
        ++field1139;
        if (~class487.field7218 != ~arg0) {
            class33.field662 = class121.field1966 = class477.field7119[arg0];
            class87.method686(true);
            class54.field942 = new int[class33.field662][class121.field1966];
            class86.field1503 = new int[4][class33.field662 >> 3][class121.field1966 >> 3];
            class511.field7542 = new int[class33.field662][class121.field1966];
            for (int var2 = 0; ~var2 > -5; ++var2) {
                class141.field2244[var2] = class78.method615(class33.field662, false, class121.field1966);
            }
            class413.field6171 = new byte[4][class33.field662][class121.field1966];
            class420.method2541(4, class121.field1966, 64, class33.field662);
            class520.method3106(class4.field109, class121.field1966 >> 3, 0, class33.field662 >> 3);
            class487.field7218 = arg0;
            if (arg1 > -68) {
                method554(61, 2, -128);
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLqa;)V")
    public final void method25(byte arg0, class162 arg1) {
        int var3 = 84 / ((-45 - arg0) / 48);
        ++field1142;
        class121 var4 = this.field1145.method1033(-4, 262144, true, arg1, super.field3474, true, super.field3480);
        if (var4 != null) {
            int var5 = super.field3480 >> 7;
            int var6 = super.field3474 >> 7;
            this.field1145.method1030(var6, (byte) 123, arg1, var5, var5, false, var4, var6);
        }
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(I)V")
    public final void method26(int arg0) {
        ++field1130;
        int var2 = -25 / ((-46 - arg0) / 44);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILqa;)V")
    public final void method15(int arg0, class162 arg1) {
        this.field1145.method1032(arg1, (byte) -113);
        ++field1140;
        if (arg0 != -13300) {
            this.method8(74);
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(Z)Z")
    public final boolean method24(boolean arg0) {
        if (arg0) {
            this.method14(58, (class162) null, 24, -53);
        }
        ++field1131;
        return false;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILqa;ZLto;III)V")
    public final void method18(int arg0, class162 arg1, boolean arg2, class8 arg3, int arg4, int arg5, int arg6) {
        ++field1134;
        if (arg4 == -1) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lqa;Lgm;IIIIIZIII)V")
    public class66(class162 arg0, class79 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, class339.method2170(arg9, 3, arg8));
        this.field1145 = new class138(arg0, arg1, arg8, arg9, arg2, arg3, super.field3480, super.field3474, arg7, arg10);
        this.field1147 = arg1.field1357 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "(B)V")
    public static void method556(byte arg0) {
        field1138 = null;
        if (arg0 == -11) {
            field1149 = null;
            field1148 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)I")
    public final int method19(byte arg0) {
        if (arg0 != -69) {
            method556((byte) 118);
        }
        ++field1135;
        return this.field1145.field2192;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)Z")
    public final boolean method8(int arg0) {
        if (arg0 < 94) {
            return true;
        } else {
            ++field1144;
            return this.field1145.method1034(15361);
        }
    }
}
