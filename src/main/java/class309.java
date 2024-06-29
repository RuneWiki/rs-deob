import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class309 {

    @OriginalMember(owner = "client!am", name = "b", descriptor = "Lam;")
    public static class309 field3947 = new class309();

    @OriginalMember(owner = "client!am", name = "d", descriptor = "Lam;")
    public static class309 field3949 = new class309();

    @OriginalMember(owner = "client!am", name = "e", descriptor = "Lam;")
    public static class309 field3950 = new class309();

    @OriginalMember(owner = "client!am", name = "f", descriptor = "Lam;")
    public static class309 field3951 = new class309();

    @OriginalMember(owner = "client!am", name = "h", descriptor = "[[I")
    public static int[][] field3953 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!am", name = "g", descriptor = "Lus;")
    public static class328 field3952 = new class328(20, 16);

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IBIZII)V")
    public static final void method1806(int arg0, byte arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field3948++;
        if (class495.field7002 == null) {
            class458.field6407.method2668(arg5, false, arg2, arg4, arg0, -16777216);
        } else if (class339.field4374.field5790 >= 0 && class339.field4374.field5790 < (class613.field8591 * 512) && class339.field4374.field5784 >= 0 && class1.field3 * 512 > class339.field4374.field5784) {
            class710.field9990++;
            if (class339.field4374 != null && class339.field4374.field5790 - (class339.field4374.method253((byte) -27) - 1) * 256 >> 9 == class333.field4292 && (class339.field4374.field5784 - (class339.field4374.method253((byte) -27) - 1) * 256 >> 9) == class721.field10159) {
                class721.field10159 = -1;
                class333.field4292 = -1;
                class652.method3520(6090);
            }
            class322.method1901(-126);
            if (!arg3) {
                class516.method2961((byte) -93);
            }
            class593.method3290(10);
            class24.method259(arg5, true, 31356, arg2, arg0, arg4);
            int var6 = class192.field2510;
            int var7 = class233.field3019;
            int var8 = class554.field7778;
            int var9 = class297.field3858;
            class468.field6738 = class468.field6736;
            if (class276.field3497 == 1) {
                int var12 = (int) class602.field8360;
                if ((class631.field8765 >> 8) > var12) {
                    var12 = class631.field8765 >> 8;
                }
                if (class488.field6948[4] && var12 < class503.field7078[4] + 128) {
                    var12 = class503.field7078[4] + 128;
                }
                int var13 = (int) class748.field10471 + class401.field5560 & 0x3FFF;
                class595.method3297(false, class592.method3287(false, class339.field4374.field5784, class223.field2946, class339.field4374.field5790) - 200, (var12 >> 3) * 3 + 600 << 2, class742.field10372, var8, class175.field2278, var12, var13);
            } else if (class276.field3497 == 4) {
                int var10 = (int) class602.field8360;
                if (class631.field8765 >> 8 > var10) {
                    var10 = class631.field8765 >> 8;
                }
                if (class488.field6948[4] && var10 < (class503.field7078[4] + 128)) {
                    var10 = class503.field7078[4] + 128;
                }
                int var11 = (int) class748.field10471 & 0x3FFF;
                class595.method3297(false, class592.method3287(false, class418.field5941, class223.field2946, class324.field4135) - 200, (var10 >> 3) * 3 + 600 << 2, class742.field10372, var8, class175.field2278, var10, var11);
            } else if (class276.field3497 == 5) {
                class589.method3274(var8, 100);
            }
            int var14 = class505.field7134;
            int var15 = class524.field7412;
            int var16 = class407.field5744;
            if (arg1 >= -98) {
                field3950 = null;
            }
            int var17 = class411.field5801;
            int var18 = class688.field9781;
            for (int var19 = 0; var19 < 5; var19++) {
                if (class488.field6948[var19]) {
                    int var22 = (int) ((double) (-class154.field1872[var19]) + Math.random() * (double) (class154.field1872[var19] * 2 + 1) + Math.sin((double) class157.field2029[var19] / 100.0D * (double) class332.field4209[var19]) * (double) class503.field7078[var19]);
                    if (var19 == 4) {
                        class411.field5801 += var22;
                        if (class411.field5801 < 1024) {
                            class411.field5801 = 1024;
                        } else if (class411.field5801 > 3072) {
                            class411.field5801 = 3072;
                        }
                    }
                    if (var19 == 2) {
                        class407.field5744 += var22 << 2;
                    }
                    if (var19 == 1) {
                        class524.field7412 += var22 << 2;
                    }
                    if (var19 == 3) {
                        class688.field9781 = class688.field9781 + var22 & 0x3FFF;
                    }
                    if (var19 == 0) {
                        class505.field7134 += var22 << 2;
                    }
                }
            }
            if (class505.field7134 < 0) {
                class505.field7134 = 0;
            }
            if (class505.field7134 > (class90.field1142 << 9) - 1) {
                class505.field7134 = (class90.field1142 << 9) - 1;
            }
            if (class407.field5744 < 0) {
                class407.field5744 = 0;
            }
            if (((class665.field9107 << 9) - 1) < class407.field5744) {
                class407.field5744 = (class665.field9107 << 9) - 1;
            }
            class48.method392(1879718697);
            class160.method990(-1087940572);
            class458.field6407.method131(var6, var9, var6 + var7, var8 + var9);
            class702.method3896(-22, true);
            if (class107.field1323) {
                class430.method2567(class154.field1868, 21855);
                if (class468.field6738 != class143.field1700) {
                    class571.field7967 = true;
                }
                class143.field1700 = class468.field6738;
            } else {
                class458.field6407.method99();
                int var20 = class154.field1868;
                if (class219.field2786 == null) {
                    class458.field6407.method166(var20);
                } else {
                    class219.field2786.method2480(-119, class638.field8829 << 3, class688.field9781, var8, var6, var7, class411.field5801, class458.field6407, var9, var20);
                }
            }
            class384.method2308(-121);
            class261.field3318.method1966(class505.field7134, class524.field7412, class407.field5744, -class411.field5801 & 0x3FFF, -class688.field9781 & 0x3FFF, -class156.field1974 & 0x3FFF);
            class458.field6407.method77(class261.field3318);
            class458.field6407.method117(var7 / 2 + var6, var8 / 2 + var9, class753.field10510 << 1, class753.field10510 << 1);
            class202.method1258(var7 / 2 + var6, var8 / 2 + var9, class753.field10510 << 1, class753.field10510 << 1, 2);
            class443.method2609(-class688.field9781 & 0x3FFF, class407.field5744, -class411.field5801 & 0x3FFF, true, -class156.field1974 & 0x3FFF, class505.field7134, class524.field7412);
            byte var21 = class223.field2944.field588.method329((byte) -124) == 2 ? (byte) class710.field9990 : 1;
            if (class107.field1323) {
                class14.method188(-class156.field1974 & 0x3FFF, 28311, -class688.field9781 & 0x3FFF, -class411.field5801 & 0x3FFF);
                class153.method950(class406.field5734, class339.field4374.field5790 >> 9, true, class223.field2944.field622.method4203((byte) -124) == 0, class339.field4374.field5779 + 1, class751.field10506, class733.field10243, class505.field7134, class407.field5744, var21, 0, class264.field3346, class266.field3368, class495.field6999, class339.field4374.field5784 >> 9, class524.field7412, class468.field6738, class613.field8589);
            } else {
                class579.method3233(class266.field3368, class505.field7134, class524.field7412, class407.field5744, class406.field5734, class264.field3346, class733.field10243, class495.field6999, class613.field8589, class751.field10506, class339.field4374.field5779 + 1, var21, class339.field4374.field5790 >> 9, class339.field4374.field5784 >> 9, class223.field2944.field622.method4203((byte) -123) == 0, true, class306.field3936 ? class468.field6738 : -1, 0, false);
            }
            class384.method2308(-45);
            if (class668.field9150 == 10) {
                class420.method2497((byte) 44, var7, 256, var9, var8, 256, var6);
                class73.method536(var6, var8, 256, var9, var7, 1, 256);
                class174.method1079(var8, 256, 256, var9, false, var6, var7);
                class576.method3227(var8, var7, var9, var6, (byte) 118);
            }
            class603.method3319();
            class505.field7134 = var14;
            class407.field5744 = var16;
            class688.field9781 = var18;
            class411.field5801 = var17;
            class524.field7412 = var15;
            if (class510.field7197 && class101.field1243.method4094(-9692) == 0) {
                class510.field7197 = false;
            }
            if (class510.field7197) {
                class458.field6407.method2668(var9, false, var7, var8, var6, -16777216);
                class760.method4231(false, class619.field8670, class458.field6407, class543.field7644, true, class586.field8137.method3261(class416.field5920, (byte) 82));
            }
            class702.method3896(-54, false);
        } else {
            class458.field6407.method2668(arg5, false, arg2, arg4, arg0, -16777216);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V")
    public static void method1807(byte arg0) {
        field3947 = null;
        field3951 = null;
        if (arg0 != 27) {
            field3947 = null;
        }
        field3950 = null;
        field3952 = null;
        field3953 = null;
        field3949 = null;
    }

    @OriginalMember(owner = "client!am", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3946++;
        throw new IllegalStateException();
    }
}
