import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class60 extends class38 {

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
    private final int field1113;

    @OriginalMember(owner = "client!fd", name = "E", descriptor = "I")
    private final int field1130;

    @OriginalMember(owner = "client!fd", name = "y", descriptor = "I")
    private final int field1124;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "I")
    private final int field1115;

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "Ldj;")
    public static class44 field1114 = class89.method650(255, " )2> <col=ffff00>");

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "Ldj;")
    public static class44 field1116 = class89.method650(255, "mem=");

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "[I")
    public static int[] field1112 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "Ldj;")
    public static class44 field1118 = class89.method650(255, "<col=ffffff> )4 ");

    @OriginalMember(owner = "client!fd", name = "B", descriptor = "I")
    public static int field1127 = -1;

    @OriginalMember(owner = "client!fd", name = "F", descriptor = "[I")
    public static int[] field1131 = new int[200];

    @OriginalMember(owner = "client!fd", name = "x", descriptor = "Lje;")
    public static class103 field1123 = new class103();

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!fd", name = "z", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!fd", name = "A", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!fd", name = "C", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!fd", name = "D", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIZ)V")
    public final void method261(int arg0, int arg1, boolean arg2) {
        ++field1120;
        if (arg2) {
            field1118 = null;
        }
        int var4 = this.field1115 * arg0 >> 12;
        int var5 = this.field1130 * arg1 >> 12;
        int var6 = this.field1124 * arg0 >> 12;
        int var7 = this.field1113 * arg1 >> 12;
        method452(var4, super.field676, super.field671, var7, var5, super.field669, true, var6);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIIZI)V")
    private static final void method452(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        if (arg6) {
            ++field1117;
            if (~arg3 == ~arg7) {
                class194.method1245(arg4, arg2, arg1, arg0, arg5, arg7, -32476);
            } else if (~class70.field1337 >= ~(-arg7 + arg0) && ~class70.field1321 <= ~(arg0 + arg7) && -arg3 + arg4 >= class14.field267 && arg3 + arg4 <= class57.field1068) {
                class226.method1487(arg0, arg5, arg2, arg4, arg3, arg1, arg7, 6532);
            } else {
                class197.method1280(arg1, arg4, arg0, arg2, true, arg5, arg7, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)Lei;")
    public static final class54 method453(int arg0) {
        if (class117.field2094 == null) {
            class117.field2094 = new class54();
        }
        ++field1128;
        return arg0 <= 78 ? null : class117.field2094;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
    public static void method454(byte arg0) {
        int var1 = -27 % ((78 - arg0) / 32);
        field1112 = null;
        field1116 = null;
        field1131 = null;
        field1123 = null;
        field1114 = null;
        field1118 = null;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(III)V")
    public final void method259(int arg0, int arg1, int arg2) {
        int var4 = 64 % ((arg0 - -45) / 39);
        ++field1121;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILdj;IZI)V")
    public static final void method455(int arg0, class44 arg1, int arg2, boolean arg3, int arg4) {
        ++field1125;
        class223 var5 = class96.method678(arg3, arg2, arg4);
        if (var5 != null) {
            if (var5.field4095 != null) {
                class140 var6 = new class140();
                var6.field2507 = var5;
                var6.field2504 = arg0;
                var6.field2509 = arg1;
                var6.field2506 = var5.field4095;
                class150.method972(var6, (byte) -127);
            }
            boolean var7 = arg3;
            if (~var5.field4033 < -1) {
                var7 = class2.method19(-74, var5);
            }
            if (var7) {
                if (class2.method12(arg0 + -1, -6, class117.method821(var5, 21064))) {
                    if (arg0 == 1) {
                        ++class201.field3573;
                        class200.field3542.method1170(74, (byte) -113);
                        class200.field3542.method489(arg2, -29);
                        class200.field3542.method510((byte) 101, arg4);
                    }
                    if (arg0 == 2) {
                        ++class236.field4385;
                        class200.field3542.method1170(30, (byte) -79);
                        class200.field3542.method489(arg2, -36);
                        class200.field3542.method510((byte) -93, arg4);
                    }
                    if (~arg0 == -4) {
                        class200.field3542.method1170(130, (byte) -103);
                        ++class199.field3515;
                        class200.field3542.method489(arg2, -101);
                        class200.field3542.method510((byte) 96, arg4);
                    }
                    if (arg0 == 4) {
                        class200.field3542.method1170(201, (byte) -89);
                        class200.field3542.method489(arg2, -105);
                        class200.field3542.method510((byte) 103, arg4);
                        ++class128.field2285;
                    }
                    if (arg0 == 5) {
                        ++class211.field3776;
                        class200.field3542.method1170(220, (byte) -121);
                        class200.field3542.method489(arg2, -44);
                        class200.field3542.method510((byte) -88, arg4);
                    }
                    if (arg0 == 6) {
                        ++class132.field2368;
                        class200.field3542.method1170(137, (byte) -93);
                        class200.field3542.method489(arg2, -52);
                        class200.field3542.method510((byte) 90, arg4);
                    }
                    if (arg0 == 7) {
                        ++field1129;
                        class200.field3542.method1170(191, (byte) -78);
                        class200.field3542.method489(arg2, -79);
                        class200.field3542.method510((byte) 103, arg4);
                    }
                    if (~arg0 == -9) {
                        ++class103.field1877;
                        class200.field3542.method1170(254, (byte) -78);
                        class200.field3542.method489(arg2, -116);
                        class200.field3542.method510((byte) -45, arg4);
                    }
                    if (arg0 == 9) {
                        class200.field3542.method1170(40, (byte) -82);
                        class200.field3542.method489(arg2, -25);
                        class200.field3542.method510((byte) 118, arg4);
                        ++class234.field4351;
                    }
                    if (arg0 == 10) {
                        ++class67.field1265;
                        class200.field3542.method1170(97, (byte) -108);
                        class200.field3542.method489(arg2, -119);
                        class200.field3542.method510((byte) 95, arg4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BII)V")
    public final void method260(byte arg0, int arg1, int arg2) {
        ++field1119;
        int var4 = this.field1124 * arg2 >> 12;
        if (arg0 != -69) {
            this.method259(93, 92, 56);
        }
        int var5 = this.field1115 * arg2 >> 12;
        int var6 = this.field1130 * arg1 >> 12;
        int var7 = this.field1113 * arg1 >> 12;
        class103.method758(var4, var5, var6, (byte) 39, var7, super.field671);
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(IIIIIII)V")
    public class60(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1113 = arg3;
        this.field1130 = arg1;
        this.field1124 = arg2;
        this.field1115 = arg0;
    }
}
