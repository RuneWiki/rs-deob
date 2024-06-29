import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public class class224 implements class196 {

    @OriginalMember(owner = "client!cca", name = "g", descriptor = "I")
    public int field3113;

    @OriginalMember(owner = "client!cca", name = "e", descriptor = "I")
    public int field3111;

    @OriginalMember(owner = "client!cca", name = "o", descriptor = "I")
    public int field3121;

    @OriginalMember(owner = "client!cca", name = "k", descriptor = "I")
    public int field3117;

    @OriginalMember(owner = "client!cca", name = "f", descriptor = "I")
    public int field3112;

    @OriginalMember(owner = "client!cca", name = "b", descriptor = "I")
    public int field3108;

    @OriginalMember(owner = "client!cca", name = "l", descriptor = "Lor;")
    public class594 field3118;

    @OriginalMember(owner = "client!cca", name = "n", descriptor = "I")
    public int field3120;

    @OriginalMember(owner = "client!cca", name = "c", descriptor = "I")
    public int field3109;

    @OriginalMember(owner = "client!cca", name = "m", descriptor = "Ljava/lang/String;")
    public String field3119;

    @OriginalMember(owner = "client!cca", name = "j", descriptor = "I")
    public int field3116;

    @OriginalMember(owner = "client!cca", name = "p", descriptor = "Lma;")
    public class12 field3122;

    @OriginalMember(owner = "client!cca", name = "d", descriptor = "I")
    public int field3110;

    @OriginalMember(owner = "client!cca", name = "q", descriptor = "Lem;")
    public static class206 field3123 = new class206(8, 0);

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!cca", name = "h", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!cca", name = "i", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!cca", name = "r", descriptor = "Ljba;")
    public static class364 field3124;

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(B)V", line = 9)
    public static final void method1413(byte arg0) throws IOException {
        field3115++;
        if (arg0 != 6 || class589.field8272 == null || class412.field5847 <= 0) {
            return;
        }
        int var1 = 0;
        while (true) {
            class352 var2 = (class352) class118.field1592.method1436(arg0 + 28958);
            if (var2 == null) {
                class683.field9754 += var1;
                class43.field515 = 0;
                return;
            }
            class589.field8272.method1938(arg0 ^ 0x7C, 0, var2.field4686.field6855, var2.field4681);
            var1 += var2.field4681;
            class412.field5847 -= var2.field4681;
            var2.method2340(81);
            var2.field4686.method2841(false);
            var2.method2029(-5);
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(BLfa;Lr;)V", line = 44)
    public static final void method1414(byte arg0, class212 arg1, class166 arg2) {
        field3107++;
        if (class510.field6979 == null) {
            return;
        }
        if (class606.field8432 < 10) {
            if (!class510.field6975.method3625(class510.field6979.field1557, -1)) {
                class606.field8432 = class114.field1580.method3638(false, class510.field6979.field1557) / 10;
                return;
            }
            class622.method3458((byte) 101);
            class606.field8432 = 10;
        }
        if (class606.field8432 == 10) {
            class510.field7012 = class510.field6979.field1547 >> 6 << 6;
            class510.field7003 = class510.field6979.field1562 >> 6 << 6;
            class510.field7009 = (class510.field6979.field1545 >> 6 << 6) + 64 - class510.field7003;
            class510.field7013 = (class510.field6979.field1554 >> 6 << 6) + 64 - class510.field7012;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class510.field6979.method814((class143.field2063.field4047 >> 9) + class613.field8555, class143.field2063.field4053, var3, class498.field6774 + (class143.field2063.field4042 >> 9), -1)) {
                var5 = var3[2] - class510.field7012;
                var4 = var3[1] - class510.field7003;
            }
            if (!class23.field288 && var4 >= 0 && var4 < class510.field7009 && var5 >= 0 && var5 < class510.field7013) {
                int var6 = var4 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var5 + (int) (Math.random() * 10.0D) - 5;
                class670.field9403 = var7;
                class266.field3598 = var6;
            } else if (class201.field2845 == -1 || class664.field9315 == -1) {
                class510.field6979.method811(var3, class510.field6979.field1558 & 0x3FFF, (class510.field6979.field1558 & 0xFFFDB91) >> 14, false);
                class266.field3598 = var3[1] - class510.field7003;
                class670.field9403 = var3[2] - class510.field7012;
            } else {
                class510.field6979.method811(var3, class664.field9315, class201.field2845, false);
                if (var3 != null) {
                    class670.field9403 = var3[2] - class510.field7012;
                    class266.field3598 = var3[1] - class510.field7003;
                }
                class23.field288 = false;
                class664.field9315 = -1;
                class201.field2845 = -1;
            }
            if (class510.field6979.field1553 == 37) {
                class510.field6990 = 3.0F;
                class510.field6991 = 3.0F;
            } else if (class510.field6979.field1553 == 50) {
                class510.field6990 = 4.0F;
                class510.field6991 = 4.0F;
            } else if (class510.field6979.field1553 == 75) {
                class510.field6990 = 6.0F;
                class510.field6991 = 6.0F;
            } else if (class510.field6979.field1553 == 100) {
                class510.field6990 = 8.0F;
                class510.field6991 = 8.0F;
            } else if (class510.field6979.field1553 == 200) {
                class510.field6990 = 16.0F;
                class510.field6991 = 16.0F;
            } else {
                class510.field6990 = 8.0F;
                class510.field6991 = 8.0F;
            }
            class510.field6986 = (int) class510.field6990 >> 1;
            class510.field6983 = class437.method2501((byte) -1, class510.field6986);
            class560.method3127((byte) 101);
            class510.method2910();
            class40.field470 = new class227();
            class510.field6988 += (int) (Math.random() * 5.0D) - 2;
            if (class510.field6988 < -8) {
                class510.field6988 = -8;
            }
            if (class510.field6988 > 8) {
                class510.field6988 = 8;
            }
            class510.field6987 += (int) (Math.random() * 5.0D) - 2;
            if (class510.field6987 < -16) {
                class510.field6987 = -16;
            }
            if (class510.field6987 > 16) {
                class510.field6987 = 16;
            }
            class510.method2920(arg1, class510.field6988 >> 2 << 10, class510.field6987 >> 1);
            class510.field6981.method3707((byte) -18, 256, 1024);
            class510.field6977.method356(false, 256, 256);
            class510.field6974.method2687(4096, 1);
            class333.field4490.method2039(-88, 256);
            class606.field8432 = 20;
        } else if (class606.field8432 == 20) {
            class650.method3662(true, -128);
            class510.method2926(arg2, class510.field6988, class510.field6987);
            class606.field8432 = 60;
            class650.method3662(true, -122);
            class430.method2469(122);
        } else if (class606.field8432 == 60) {
            if (class510.field6975.method3624((byte) 87, class510.field6979.field1557 + "_staticelements")) {
                if (!class510.field6975.method3625(class510.field6979.field1557 + "_staticelements", -1)) {
                    return;
                }
                class510.field6992 = class543.method3067(class510.field6975, class21.field239, (byte) 122, class510.field6979.field1557 + "_staticelements");
            } else {
                class510.field6992 = new class495(0);
            }
            class510.method2919();
            class606.field8432 = 70;
            class650.method3662(true, -123);
            class430.method2469(119);
        } else if (class606.field8432 == 70) {
            class98.field1378 = new class215(arg2, 11, true, class611.field8473);
            class606.field8432 = 73;
            class650.method3662(true, -126);
            class430.method2469(arg0 + 217);
        } else if (class606.field8432 == 73) {
            class670.field9402 = new class215(arg2, 12, true, class611.field8473);
            class606.field8432 = 76;
            class650.method3662(true, -123);
            class430.method2469(arg0 + 215);
        } else if (class606.field8432 == 76) {
            class363.field4779 = new class215(arg2, 14, true, class611.field8473);
            class606.field8432 = 79;
            class650.method3662(true, -125);
            class430.method2469(arg0 ^ 0xFFFFFFDE);
        } else if (class606.field8432 == 79) {
            class266.field3599 = new class215(arg2, 17, true, class611.field8473);
            class606.field8432 = 82;
            class650.method3662(true, arg0 ^ 0x25);
            class430.method2469(123);
        } else if (class606.field8432 == 82) {
            class615.field8584 = new class215(arg2, 19, true, class611.field8473);
            class606.field8432 = 85;
            class650.method3662(true, arg0 - 34);
            class430.method2469(arg0 ^ 0xFFFFFFDF);
        } else if (class606.field8432 == 85) {
            class554.field7470 = new class215(arg2, 22, true, class611.field8473);
            class606.field8432 = 88;
            class650.method3662(true, -128);
            class430.method2469(arg0 ^ 0xFFFFFFDA);
        } else if (class606.field8432 == 88) {
            class311.field4304 = new class215(arg2, 26, true, class611.field8473);
            class606.field8432 = 91;
            class650.method3662(true, -125);
            class430.method2469(123);
        } else {
            class677.field9706 = new class215(arg2, 30, true, class611.field8473);
            class606.field8432 = 100;
            class650.method3662(true, -123);
            if (arg0 == -93) {
                class430.method2469(126);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(I)Loh;", line = 273)
    public final class370 method640(int arg0) {
        field3114++;
        return arg0 == 58 ? class198.field2803 : null;
    }

    @OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(Ljava/lang/String;Lor;Lma;IIIIIIIIII)V", line = 291)
    public class224(String arg0, class594 arg1, class12 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.field3113 = arg3;
        this.field3111 = arg10;
        this.field3121 = arg5;
        this.field3117 = arg8;
        this.field3112 = arg12;
        this.field3108 = arg11;
        this.field3118 = arg1;
        this.field3120 = arg7;
        this.field3109 = arg6;
        this.field3119 = arg0;
        this.field3116 = arg4;
        this.field3122 = arg2;
        this.field3110 = arg9;
    }

    @OriginalMember(owner = "client!cca", name = "b", descriptor = "(B)V", line = 311)
    public static void method1415(byte arg0) {
        field3124 = null;
        int var1 = -1 / ((52 - arg0) / 55);
        field3123 = null;
    }
}
