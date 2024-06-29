import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class178 {

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "I")
    public static int field2732 = 0;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "[I")
    public static int[] field2734 = new int[1];

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lhfa;IZ)V", line = 3)
    public static final void method1195(class287 arg0, int arg1, boolean arg2) {
        field2736++;
        if (class398.field5290 >= 400) {
            return;
        }
        class419 var3 = arg0.field4052;
        if (var3.field5753 != null) {
            var3 = var3.method2401(false, class80.field1261);
            if (var3 == null) {
                return;
            }
        }
        if (!var3.field5734) {
            return;
        }
        String var4 = var3.field5777;
        if (var3.field5775 != 0) {
            String var5 = class488.field6599 == class392.field5166 ? class72.field1094.method546(class516.field6892, (byte) -35) : class72.field1092.method546(class516.field6892, (byte) -35);
            var4 = var4 + class326.method1960(var3.field5775, class199.field2897.field5401, -1) + " (" + var5 + var3.field5775 + ")";
        }
        if (arg1 != 0) {
            method1198(null, -31, (byte) -90);
        }
        if (class400.field5305 && !arg2) {
            class538 var6 = class2.field26 == -1 ? null : class282.field4001.method3062((byte) -117, class2.field26);
            if ((class658.field9093 & 0x2) != 0 && (var6 == null || var3.method2397(0, var6.field7101, class2.field26) != var6.field7101)) {
                class138.field2227++;
                class483.method2701(0, false, true, class214.field3060 + " -> <col=ffff00>" + var4, (long) arg0.field5633, 57, 0, -1, class425.field5847, class680.field9585, 6967);
            }
        }
        if (!arg2) {
            String[] var7 = var3.field5727;
            if (class618.field8202) {
                var7 = class232.method1448(var7, 84);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (var3.field5730 == 0 || !var7[var8].equalsIgnoreCase(class72.field1087.method546(class516.field6892, (byte) -35)))) {
                        byte var9 = 0;
                        int var10 = class294.field4165;
                        if (var8 == 0) {
                            var9 = 48;
                        }
                        if (var8 == 1) {
                            var9 = 15;
                        }
                        if (var8 == 2) {
                            var9 = 22;
                        }
                        if (var8 == 3) {
                            var9 = 46;
                        }
                        if (var3.field5759 == var8) {
                            var10 = var3.field5748;
                        }
                        if (var8 == 4) {
                            var9 = 59;
                        }
                        if (var3.field5794 == var8) {
                            var10 = var3.field5787;
                        }
                        class325.field4500++;
                        class483.method2701(0, false, true, "<col=ffff00>" + var4, (long) arg0.field5633, var9, 0, -1, var7[var8].equalsIgnoreCase(class72.field1087.method546(class516.field6892, (byte) -35)) ? var3.field5751 : var10, var7[var8], 6967);
                    }
                }
            }
            if (var3.field5730 == 1 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].equalsIgnoreCase(class72.field1087.method546(class516.field6892, (byte) -35))) {
                        short var12 = 0;
                        if (var3.field5775 > class199.field2897.field5401) {
                            var12 = 2000;
                        }
                        short var13 = 0;
                        if (var11 == 0) {
                            var13 = 48;
                        }
                        if (var11 == 1) {
                            var13 = 15;
                        }
                        if (var11 == 2) {
                            var13 = 22;
                        }
                        if (var11 == 3) {
                            var13 = 46;
                        }
                        if (var11 == 4) {
                            var13 = 59;
                        }
                        if (var13 != 0) {
                            var13 += var12;
                        }
                        class313.field4302++;
                        class483.method2701(0, false, true, "<col=ffff00>" + var4, (long) arg0.field5633, var13, 0, -1, var3.field5751, var7[var11], 6967);
                    }
                }
            }
        }
        class654.field8858++;
        class483.method2701(0, arg2, true, "<col=ffff00>" + var4, (long) arg0.field5633, 1003, 0, -1, class383.field5116, class72.field1086.method546(class516.field6892, (byte) -35), 6967);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V", line = 178)
    public static void method1196(int arg0) {
        field2734 = null;
        if (arg0 != 0) {
            field2732 = 92;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(BI)V", line = 188)
    public static final void method1197(byte arg0, int arg1) {
        field2733++;
        if (class464.field6266 == arg1) {
            return;
        }
        class34.field530 = class34.field531 = class381.field5093[arg1];
        class515.method2879(-128);
        class572.field7595 = new int[class34.field530][class34.field531];
        class223.field3136 = new int[class34.field530][class34.field531];
        class242.field3381 = new int[4][class34.field530 >> 3][class34.field531 >> 3];
        for (int var2 = 0; var2 < 4; var2++) {
            class591.field7820[var2] = class209.method1342(58, class34.field530, class34.field531);
        }
        class431.field5903 = new byte[4][class34.field530][class34.field531];
        class502.method2788(class34.field531, class34.field530, 8, 4);
        class124.method965(class34.field530 >> 3, class34.field531 >> 3, class10.field197, -120);
        if (arg0 < 11) {
            method1197((byte) 25, 61);
        }
        class464.field6266 = arg1;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lgba;IB)I", line = 224)
    public static final int method1198(class625 arg0, int arg1, byte arg2) {
        field2735++;
        if (arg2 >= -119) {
            field2732 = -7;
        }
        if (!client.method1701(arg0).method349(107, arg1) && arg0.field8413 == null) {
            return -1;
        } else if (arg0.field8334 == null || arg0.field8334.length <= arg1) {
            return -1;
        } else {
            return arg0.field8334[arg1];
        }
    }
}
