import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class71 {

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    private int field1678 = 65000;

    @OriginalMember(owner = "client!le", name = "t", descriptor = "Lr;")
    private class100 field1686 = null;

    @OriginalMember(owner = "client!le", name = "r", descriptor = "Lr;")
    private class100 field1684 = null;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "I")
    private int field1682;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "Lva;")
    private static class121 field1669 = class107.method797("Loaded update list", -10983);

    @OriginalMember(owner = "client!le", name = "n", descriptor = "[I")
    public static int[] field1680 = new int[2048];

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    public static int field1675 = 0;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "Lva;")
    public static class121 field1683 = field1669;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "Lva;")
    public static class121 field1667 = class107.method797("backleft2", -10983);

    @OriginalMember(owner = "client!le", name = "g", descriptor = "Lva;")
    private static class121 field1673 = class107.method797("Enter name of player to add to list", -10983);

    @OriginalMember(owner = "client!le", name = "m", descriptor = "Z")
    public static boolean field1679 = false;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "Lva;")
    public static class121 field1681 = field1673;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!le", name = "s", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!le", name = "u", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!le", name = "v", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "Lr;")
    public static class100 field1671;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "Z")
    public static boolean field1676;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IB)V", line = 5)
    public static final void method490(int arg0, byte arg1) {
        field1670++;
        if (arg0 < 0) {
            return;
        }
        int var2 = class46.field1074[arg0];
        int var3 = class25.field635[arg0];
        int var4 = class35.field844[arg0];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        int var5 = class41.field933[arg0];
        if (class1.field16 != 0 && var4 != 1002) {
            class1.field16 = 0;
            class9.field140 = true;
        }
        if (var4 == 38) {
            class60.field1437.method622(64, true);
            class60.field1437.method824(-921469304, var3);
            class60.field1437.method850(var2, (byte) 119);
            class60.field1437.method862((byte) 91, var5);
            class126.field2884 = 2;
            class77.field1788 = var3;
            class66.field1598 = var2;
            class22.field591 = 0;
            if (var3 >> 16 == class26.field659) {
                class126.field2884 = 1;
            }
            class16.field321++;
            if (var3 >> 16 == class90.field2038) {
                class126.field2884 = 3;
            }
        }
        if (var4 == 54) {
            class77 var6 = class127.field2895[var5];
            if (var6 != null) {
                class115.method880(false, var6.field730[0], 25, 1, 0, 2, 0, 1, var6.field767[0], class62.field1494.field767[0], 0, class62.field1494.field730[0]);
                class66.field1592 = class15.field280;
                class97.field2171 = class82.field1909;
                class41.field952 = 0;
                class92.field2094++;
                class12.field229 = 2;
                class60.field1437.method622(112, true);
                class60.field1437.method867((byte) -66, class25.field636);
                class60.field1437.method856(96, var5);
            }
        }
        if (var4 == 19) {
            class77 var7 = class127.field2895[var5];
            if (var7 != null) {
                class96.field2138++;
                class115.method880(false, var7.field730[0], 25, 1, 0, 2, 0, 1, var7.field767[0], class62.field1494.field767[0], 0, class62.field1494.field730[0]);
                class66.field1592 = class15.field280;
                class41.field952 = 0;
                class97.field2171 = class82.field1909;
                class12.field229 = 2;
                class60.field1437.method622(98, true);
                class60.field1437.method839(var5, -9129);
            }
        }
        if (var4 == 28) {
            class125.method982(-108, class118.field2676);
            class9.field140 = true;
            class118.field2676 = -1;
        }
        if (var4 == 21) {
            boolean var8 = class115.method880(false, var3, 25, 0, 0, 2, 0, 0, var2, class62.field1494.field767[0], 0, class62.field1494.field730[0]);
            if (!var8) {
                class115.method880(false, var3, 25, 1, 0, 2, 0, 1, var2, class62.field1494.field767[0], 0, class62.field1494.field730[0]);
            }
            class97.field2171 = class82.field1909;
            class41.field952 = 0;
            class52.field1211++;
            class66.field1592 = class15.field280;
            class12.field229 = 2;
            class60.field1437.method622(28, true);
            class60.field1437.method839(var3 + class9.field132, -9129);
            class60.field1437.method839(var5, -9129);
            class60.field1437.method839(class129.field2977 + var2, -9129);
        }
        if (var4 == 46) {
            class23.field608++;
            boolean var10 = class115.method880(false, var3, 25, 0, 0, 2, 0, 0, var2, class62.field1494.field767[0], 0, class62.field1494.field730[0]);
            if (!var10) {
                class115.method880(false, var3, 25, 1, 0, 2, 0, 1, var2, class62.field1494.field767[0], 0, class62.field1494.field730[0]);
            }
            class66.field1592 = class15.field280;
            class41.field952 = 0;
            class97.field2171 = class82.field1909;
            class12.field229 = 2;
            class60.field1437.method622(5, true);
            class60.field1437.method862((byte) 91, var5);
            class60.field1437.method850(class9.field132 + var3, (byte) 83);
            class60.field1437.method856(96, class129.field2977 + var2);
        }
        if (var4 == 1003) {
            class50 var12 = class8.field110[var5];
            if (var12 != null) {
                class16 var13 = var12.field1183;
                if (var13.field311 != null) {
                    var13 = var13.method131((byte) 2);
                }
                if (var13 != null) {
                    class61.field1474++;
                    class60.field1437.method622(121, true);
                    class60.field1437.method839(var13.field334, -9129);
                }
            }
        }
        if (var4 == 9) {
            class50 var14 = class8.field110[var5];
            if (var14 != null) {
                class115.method880(false, var14.field730[0], 25, 1, 0, 2, 0, 1, var14.field767[0], class62.field1494.field767[0], 0, class62.field1494.field730[0]);
                class41.field952 = 0;
                class66.field1592 = class15.field280;
                class128.field2953++;
                class12.field229 = 2;
                class97.field2171 = class82.field1909;
                class60.field1437.method622(181, true);
                class60.field1437.method850(var5, (byte) 61);
            }
        }
        if (var4 == 6) {
            class99.field2201++;
            class60.field1437.method622(161, true);
            class60.field1437.method856(96, var5);
            class60.field1437.method850(var2, (byte) 59);
            class60.field1437.method824(-921469304, var3);
            class66.field1598 = var2;
            class126.field2884 = 2;
            class77.field1788 = var3;
            if (var3 >> 16 == class26.field659) {
                class126.field2884 = 1;
            }
            if (var3 >> 16 == class90.field2038) {
                class126.field2884 = 3;
            }
            class22.field591 = 0;
        }
        if (var4 == 12) {
            class60.field1437.method622(131, true);
            class101.field2250++;
            class60.field1437.method839(var5, -9129);
            class60.field1437.method856(96, class26.field668);
            class60.field1437.method862((byte) 91, class95.field2123);
            class60.field1437.method850(var2, (byte) 89);
            class60.field1437.method867((byte) -66, var3);
            class60.field1437.method867((byte) -66, class14.field261);
            class66.field1598 = var2;
            class126.field2884 = 2;
            if (var3 >> 16 == class26.field659) {
                class126.field2884 = 1;
            }
            if (var3 >> 16 == class90.field2038) {
                class126.field2884 = 3;
            }
            class77.field1788 = var3;
            class22.field591 = 0;
        }
        if (var4 == 1) {
            class50 var15 = class8.field110[var5];
            if (var15 != null) {
                class115.method880(false, var15.field730[0], 25, 1, 0, 2, 0, 1, var15.field767[0], class62.field1494.field767[0], 0, class62.field1494.field730[0]);
                class12.field229 = 2;
                class61.field1473++;
                class66.field1592 = class15.field280;
                class41.field952 = 0;
                class97.field2171 = class82.field1909;
                class60.field1437.method622(242, true);
                class60.field1437.method839(var5, -9129);
                class60.field1437.method850(class95.field2123, (byte) 114);
                class60.field1437.method850(class26.field668, (byte) 79);
                class60.field1437.method860((byte) -70, class14.field261);
            }
        }
        if (var4 == 40 && class77.method529(var3, var5, -121, var2)) {
            class60.field1437.method622(252, true);
            class120.field2762++;
            class60.field1437.method862((byte) 91, class129.field2977 + var2);
            class60.field1437.method856(96, var5 >> 14 & 0x7FFF);
            class60.field1437.method839(class9.field132 + var3, -9129);
            class60.field1437.method840(-11129, class25.field636);
        }
        if (var4 == 25) {
            class77 var16 = class127.field2895[var5];
            if (var16 != null) {
                class115.method880(false, var16.field730[0], 25, 1, 0, 2, 0, 1, var16.field767[0], class62.field1494.field767[0], 0, class62.field1494.field730[0]);
                class41.field952 = 0;
                class12.field229 = 2;
                class66.field1592 = class15.field280;
                class97.field2171 = class82.field1909;
                class82.field1904++;
                class60.field1437.method622(175, true);
                class60.field1437.method850(var5, (byte) 117);
            }
        }
        if (var4 == 55) {
            class121 var17 = class21.field564[arg0];
            int var18 = var17.method950(-2, class95.field2115);
            if (var18 != -1) {
                int var19 = -1;
                long var20 = var17.method965(63, var18 + 5).method955(false).method932(118);
                for (int var22 = 0; var22 < class8.field119; var22++) {
                    if (class92.field2092[var22] == var20) {
                        var19 = var22;
                        break;
                    }
                }
                if (var19 != -1 && class41.field951[var19] > 0) {
                    class40.field902 = true;
                    class18.field402 = class18.field415;
                    class13.field239 = 3;
                    class1.field16 = 0;
                    class9.field140 = true;
                    class108.field2460 = class92.field2092[var19];
                    class18.field395 = class113.method866((byte) -116, new class121[] { class34.field820, class128.field2962[var19] });
                }
            }
        }
        if (var4 == 56) {
            class77.method529(var3, var5, -128, var2);
            class60.field1437.method622(201, true);
            class77.field1768++;
            class60.field1437.method856(96, class9.field132 + var3);
            class60.field1437.method839(class129.field2977 + var2, -9129);
            class60.field1437.method850(var5 >> 14 & 0x7FFF, (byte) 118);
        }
        if (var4 == 39) {
            class50 var23 = class8.field110[var5];
            if (var23 != null) {
                class115.method880(false, var23.field730[0], 25, 1, 0, 2, 0, 1, var23.field767[0], class62.field1494.field767[0], 0, class62.field1494.field730[0]);
                class12.field229 = 2;
                class66.field1592 = class15.field280;
                class56.field1278++;
                class97.field2171 = class82.field1909;
                class41.field952 = 0;
                class60.field1437.method622(178, true);
                class60.field1437.method850(var5, (byte) 97);
            }
        }
        if (var4 == 45) {
            class50 var24 = class8.field110[var5];
            if (var24 != null) {
                class23.field601++;
                class115.method880(false, var24.field730[0], 25, 1, 0, 2, 0, 1, var24.field767[0], class62.field1494.field767[0], 0, class62.field1494.field730[0]);
                class66.field1592 = class15.field280;
                class41.field952 = 0;
                class97.field2171 = class82.field1909;
                class12.field229 = 2;
                class60.field1437.method622(147, true);
                class60.field1437.method862((byte) 91, var5);
            }
        }
        if (var4 == 18) {
            class29.field788++;
            class60.field1437.method622(10, true);
            class60.field1437.method840(-11129, var3);
            class60.field1437.method856(96, var2);
            class60.field1437.method856(96, var5);
            class126.field2884 = 2;
            if (var3 >> 16 == class26.field659) {
                class126.field2884 = 1;
            }
            if (var3 >> 16 == class90.field2038) {
                class126.field2884 = 3;
            }
            class22.field591 = 0;
            class66.field1598 = var2;
            class77.field1788 = var3;
        }
        if (var4 == 47) {
            class77 var25 = class127.field2895[var5];
            if (var25 != null) {
                class115.method880(false, var25.field730[0], 25, 1, 0, 2, 0, 1, var25.field767[0], class62.field1494.field767[0], 0, class62.field1494.field730[0]);
                class41.field952 = 0;
                class12.field229 = 2;
                class66.field1592 = class15.field280;
                class54.field1242++;
                class97.field2171 = class82.field1909;
                class60.field1437.method622(47, true);
                class60.field1437.method850(var5, (byte) 79);
            }
        }
        if (var4 == 1004) {
            class77.method529(var3, var5, -118, var2);
            class16.field347++;
            class60.field1437.method622(212, true);
            class60.field1437.method856(96, class9.field132 + var3);
            class60.field1437.method839(var5 >> 14 & 0x7FFF, -9129);
            class60.field1437.method856(96, class129.field2977 + var2);
        }
        if (var4 == 3) {
            class60.field1437.method622(146, true);
            class60.field1437.method839(var5, -9129);
            class45.field1037++;
            class60.field1437.method840(-11129, var3);
            class60.field1437.method856(96, var2);
            class126.field2884 = 2;
            class77.field1788 = var3;
            class22.field591 = 0;
            class66.field1598 = var2;
            if (var3 >> 16 == class26.field659) {
                class126.field2884 = 1;
            }
            if (var3 >> 16 == class90.field2038) {
                class126.field2884 = 3;
            }
        }
        if (var4 == 1005) {
            class60.field1437.method622(233, true);
            class14.field267++;
            class60.field1437.method850(var5, (byte) 90);
        }
        if (var4 == 23) {
            class118.field2681++;
            boolean var26 = class115.method880(false, var3, 25, 0, 0, 2, 0, 0, var2, class62.field1494.field767[0], 0, class62.field1494.field730[0]);
            if (!var26) {
                class115.method880(false, var3, 25, 1, 0, 2, 0, 1, var2, class62.field1494.field767[0], 0, class62.field1494.field730[0]);
            }
            class66.field1592 = class15.field280;
            class41.field952 = 0;
            class97.field2171 = class82.field1909;
            class12.field229 = 2;
            class60.field1437.method622(80, true);
            class60.field1437.method862((byte) 91, var5);
            class60.field1437.method839(class129.field2977 + var2, -9129);
            class60.field1437.method839(class9.field132 + var3, -9129);
        }
        int var28 = 32 % ((arg1 - 64) / 35);
        if (var4 == 14) {
            boolean var29 = class115.method880(false, var3, 25, 0, 0, 2, 0, 0, var2, class62.field1494.field767[0], 0, class62.field1494.field730[0]);
            class27.field675++;
            if (!var29) {
                class115.method880(false, var3, 25, 1, 0, 2, 0, 1, var2, class62.field1494.field767[0], 0, class62.field1494.field730[0]);
            }
            class97.field2171 = class82.field1909;
            class41.field952 = 0;
            class66.field1592 = class15.field280;
            class12.field229 = 2;
            class60.field1437.method622(162, true);
            class60.field1437.method839(class9.field132 + var3, -9129);
            class60.field1437.method867((byte) -66, class14.field261);
            class60.field1437.method839(var2 + class129.field2977, -9129);
            class60.field1437.method839(class95.field2123, -9129);
            class60.field1437.method850(class26.field668, (byte) 113);
            class60.field1437.method862((byte) 91, var5);
        }
        if (var4 == 7) {
            class62.field1504++;
            boolean var31 = class115.method880(false, var3, 25, 0, 0, 2, 0, 0, var2, class62.field1494.field767[0], 0, class62.field1494.field730[0]);
            if (!var31) {
                class115.method880(false, var3, 25, 1, 0, 2, 0, 1, var2, class62.field1494.field767[0], 0, class62.field1494.field730[0]);
            }
            class12.field229 = 2;
            class97.field2171 = class82.field1909;
            class66.field1592 = class15.field280;
            class41.field952 = 0;
            class60.field1437.method622(202, true);
            class60.field1437.method862((byte) 91, class9.field132 + var3);
            class60.field1437.method860((byte) -70, class25.field636);
            class60.field1437.method839(class129.field2977 + var2, -9129);
            class60.field1437.method850(var5, (byte) 83);
        }
        if (var4 == 29) {
            class85.field1968++;
            class60.field1437.method622(2, true);
            class60.field1437.method862((byte) 91, var5);
            class60.field1437.method824(-921469304, var3);
            class60.field1437.method862((byte) 91, var2);
            class126.field2884 = 2;
            class22.field591 = 0;
            if (var3 >> 16 == class26.field659) {
                class126.field2884 = 1;
            }
            class77.field1788 = var3;
            class66.field1598 = var2;
            if (var3 >> 16 == class90.field2038) {
                class126.field2884 = 3;
            }
        }
        if (var4 == 52) {
            class77 var33 = class127.field2895[var5];
            if (var33 != null) {
                client.field436++;
                class115.method880(false, var33.field730[0], 25, 1, 0, 2, 0, 1, var33.field767[0], class62.field1494.field767[0], 0, class62.field1494.field730[0]);
                class12.field229 = 2;
                class66.field1592 = class15.field280;
                class41.field952 = 0;
                class97.field2171 = class82.field1909;
                class60.field1437.method622(86, true);
                class60.field1437.method850(var5, (byte) 76);
            }
        }
        if (var4 == 37 && class77.method529(var3, var5, -93, var2)) {
            class114.field2585++;
            class60.field1437.method622(68, true);
            class60.field1437.method839(class9.field132 + var3, -9129);
            class60.field1437.method850(class95.field2123, (byte) 78);
            class60.field1437.method862((byte) 91, class26.field668);
            class60.field1437.method856(96, var2 + class129.field2977);
            class60.field1437.method840(-11129, class14.field261);
            class60.field1437.method862((byte) 91, var5 >> 14 & 0x7FFF);
        }
        if (var4 == 33) {
            class50 var34 = class8.field110[var5];
            if (var34 != null) {
                class121.field2803++;
                class115.method880(false, var34.field730[0], 25, 1, 0, 2, 0, 1, var34.field767[0], class62.field1494.field767[0], 0, class62.field1494.field730[0]);
                class66.field1592 = class15.field280;
                class97.field2171 = class82.field1909;
                class12.field229 = 2;
                class41.field952 = 0;
                class60.field1437.method622(37, true);
                class60.field1437.method856(96, var5);
            }
        }
        if (var4 == 34) {
            class79.field1844++;
            boolean var35 = class115.method880(false, var3, 25, 0, 0, 2, 0, 0, var2, class62.field1494.field767[0], 0, class62.field1494.field730[0]);
            if (!var35) {
                class115.method880(false, var3, 25, 1, 0, 2, 0, 1, var2, class62.field1494.field767[0], 0, class62.field1494.field730[0]);
            }
            class41.field952 = 0;
            class97.field2171 = class82.field1909;
            class12.field229 = 2;
            class66.field1592 = class15.field280;
            class60.field1437.method622(183, true);
            class60.field1437.method839(var2 + class129.field2977, -9129);
            class60.field1437.method856(96, var5);
            class60.field1437.method850(class9.field132 + var3, (byte) 115);
        }
        if (var4 == 13) {
            if (class100.field2245) {
                class58.field1348.method764(var2 - 4, var3 + -4);
            } else {
                class58.field1348.method764(class15.field280 - 4, class82.field1909 + -4);
            }
        }
        if (var4 == 27) {
            class26.field668 = var2;
            class14.field261 = var3;
            class95.field2123 = var5;
            class114.field2564 = 1;
            class45.field1054 = class113.method866((byte) -91, new class121[] { client.field435, class114.method872((byte) 121, var5).field2708, class95.field2115 });
            class22.field573 = 0;
            class97.field2168 = true;
            if (class45.field1054 == null) {
                class45.field1054 = class86.field1996;
            }
            return;
        }
        if (var4 == 51) {
            class52.method373(true);
        }
        if (var4 == 32) {
            class60.field1437.method622(189, true);
            class60.field1437.method867((byte) -66, var3);
            class92.field2104++;
            class19 var37 = class125.method979(var3, 65535);
            if (var37.field508 != null && var37.field508[0][0] == 5) {
                int var38 = var37.field508[0][1];
                if (class90.field2045[var38] != var37.field456[0]) {
                    class90.field2045[var38] = var37.field456[0];
                    class29.method227(8, var38);
                    class97.field2168 = true;
                }
            }
        }
        if (var4 == 20) {
            class50.field1174++;
            class60.field1437.method622(109, true);
            class60.field1437.method867((byte) -66, var3);
            class60.field1437.method839(var5, -9129);
            class60.field1437.method850(var2, (byte) 101);
            class126.field2884 = 2;
            class66.field1598 = var2;
            class77.field1788 = var3;
            class22.field591 = 0;
            if (var3 >> 16 == class26.field659) {
                class126.field2884 = 1;
            }
            if (var3 >> 16 == class90.field2038) {
                class126.field2884 = 3;
            }
        }
        if (var4 == 53) {
            class77.method529(var3, var5, -106, var2);
            class115.field2602++;
            class60.field1437.method622(184, true);
            class60.field1437.method839(class129.field2977 + var2, -9129);
            class60.field1437.method839(var5 >> 14 & 0x7FFF, -9129);
            class60.field1437.method856(96, var3 + class9.field132);
        }
        if (var4 == 1006) {
            class19 var39 = class125.method979(var3, 65535);
            if (var39 == null || var39.field487[var2] < 100000) {
                class60.field1437.method622(233, true);
                class14.field267++;
                class60.field1437.method850(var5, (byte) 113);
            } else {
                class62.method448(class18.field415, class113.method866((byte) -68, new class121[] { class35.method242(var39.field487[var2], 10), class85.field1970, class114.method872((byte) 121, var5).field2708 }), 0, false);
            }
        }
        if (var4 == 2) {
            class119.field2712++;
            class77.method529(var3, var5, -77, var2);
            class60.field1437.method622(159, true);
            class60.field1437.method862((byte) 91, class129.field2977 + var2);
            class60.field1437.method856(96, var5 >> 14 & 0x7FFF);
            class60.field1437.method862((byte) 91, class9.field132 + var3);
        }
        if (var4 == 22 && !class126.field2883) {
            class60.field1437.method622(72, true);
            class126.field2883 = true;
            class43.field989++;
        }
        if (var4 == 5) {
            class77 var40 = class127.field2895[var5];
            if (var40 != null) {
                class57.field1333++;
                class115.method880(false, var40.field730[0], 25, 1, 0, 2, 0, 1, var40.field767[0], class62.field1494.field767[0], 0, class62.field1494.field730[0]);
                class41.field952 = 0;
                class12.field229 = 2;
                class97.field2171 = class82.field1909;
                class66.field1592 = class15.field280;
                class60.field1437.method622(244, true);
                class60.field1437.method862((byte) 91, var5);
            }
        }
        if (var4 == 50) {
            class50 var41 = class8.field110[var5];
            if (var41 != null) {
                class115.method880(false, var41.field730[0], 25, 1, 0, 2, 0, 1, var41.field767[0], class62.field1494.field767[0], 0, class62.field1494.field730[0]);
                class12.field229 = 2;
                class97.field2171 = class82.field1909;
                class92.field2084++;
                class41.field952 = 0;
                class66.field1592 = class15.field280;
                class60.field1437.method622(90, true);
                class60.field1437.method867((byte) -66, class25.field636);
                class60.field1437.method850(var5, (byte) 116);
            }
        }
        if (var4 == 49) {
            class44.field1018++;
            class60.field1437.method622(107, true);
            class60.field1437.method860((byte) -70, class25.field636);
            class60.field1437.method839(var5, -9129);
            class60.field1437.method860((byte) -70, var3);
            class60.field1437.method856(96, var2);
            class77.field1788 = var3;
            class22.field591 = 0;
            class126.field2884 = 2;
            if (var3 >> 16 == class26.field659) {
                class126.field2884 = 1;
            }
            class66.field1598 = var2;
            if (var3 >> 16 == class90.field2038) {
                class126.field2884 = 3;
            }
        }
        if (var4 == 31) {
            class77 var42 = class127.field2895[var5];
            if (var42 != null) {
                class118.field2690++;
                class115.method880(false, var42.field730[0], 25, 1, 0, 2, 0, 1, var42.field767[0], class62.field1494.field767[0], 0, class62.field1494.field730[0]);
                class97.field2171 = class82.field1909;
                class66.field1592 = class15.field280;
                class12.field229 = 2;
                class41.field952 = 0;
                class60.field1437.method622(253, true);
                class60.field1437.method839(var5, -9129);
                class60.field1437.method867((byte) -66, class14.field261);
                class60.field1437.method839(class95.field2123, -9129);
                class60.field1437.method839(class26.field668, -9129);
            }
        }
        if (var4 == 8) {
            class19 var43 = class125.method979(var3, 65535);
            boolean var44 = true;
            if (var43.field518 > 0) {
                var44 = class127.method992((byte) -53, var43);
            }
            if (var44) {
                class60.field1437.method622(189, true);
                class92.field2104++;
                class60.field1437.method867((byte) -66, var3);
            }
        }
        if (var4 == 24 || var4 == 35) {
            class121 var45 = class21.field564[arg0];
            int var46 = var45.method950(-2, class95.field2115);
            if (var46 != -1) {
                class121 var47 = var45.method965(63, var46 + 5).method955(false);
                class121 var48 = var47.method937(107).method963(-14767);
                boolean var49 = false;
                for (int var50 = 0; var50 < class13.field231; var50++) {
                    class77 var51 = class127.field2895[field1680[var50]];
                    if (var51 != null && var51.field1766 != null && var51.field1766.method940(var48, (byte) 20)) {
                        class115.method880(false, var51.field730[0], 25, 1, 0, 2, 0, 1, var51.field767[0], class62.field1494.field767[0], 0, class62.field1494.field730[0]);
                        var49 = true;
                        if (var4 == 24) {
                            class60.field1437.method622(244, true);
                            class57.field1333++;
                            class60.field1437.method862((byte) 91, field1680[var50]);
                        }
                        if (var4 == 35) {
                            client.field436++;
                            class60.field1437.method622(86, true);
                            class60.field1437.method850(field1680[var50], (byte) 62);
                        }
                        break;
                    }
                }
                if (!var49) {
                    class62.method448(class18.field415, class113.method866((byte) -45, new class121[] { class59.field1410, var48 }), 0, false);
                }
            }
        }
        if (var4 == 4) {
            class19 var52 = class125.method979(var3, 65535);
            class25.field636 = var3;
            class107.field2426 = var52.field512;
            class22.field573 = 1;
            class114.field2564 = 0;
            class97.field2168 = true;
            class59.field1407 = class113.method866((byte) -86, new class121[] { var52.field469, class62.field1512, var52.field454, class95.field2115 });
            if (class107.field2426 == 16) {
                class25.field630 = true;
                class28.field716 = 3;
                class97.field2168 = true;
            }
            return;
        }
        if (var4 == 11) {
            class60.field1437.method622(166, true);
            class16.field314++;
            class60.field1437.method839(var2, -9129);
            class60.field1437.method867((byte) -66, var3);
            class60.field1437.method839(var5, -9129);
            class126.field2884 = 2;
            class77.field1788 = var3;
            if (var3 >> 16 == class26.field659) {
                class126.field2884 = 1;
            }
            class22.field591 = 0;
            if (var3 >> 16 == class90.field2038) {
                class126.field2884 = 3;
            }
            class66.field1598 = var2;
        }
        if (var4 == 44) {
            class121 var53 = class21.field564[arg0];
            int var54 = var53.method950(-2, class95.field2115);
            if (var54 != -1) {
                if (class26.field659 == -1) {
                    class52.method373(true);
                    if (class8.field109 != -1) {
                        class18.field383 = var53.method965(63, var54 + 5).method955(false);
                        client.field431 = false;
                        class47.field1123 = class26.field659 = class8.field109;
                    }
                } else {
                    class62.method448(class18.field415, class69.field1658, 0, false);
                }
            }
        }
        if (var4 == 1001) {
            class42.field958++;
            class60.field1437.method622(74, true);
            class60.field1437.method862((byte) 91, var5 >> 14 & 0x7FFF);
        }
        if (var4 == 17 || var4 == 15 || var4 == 48 || var4 == 30) {
            class121 var55 = class21.field564[arg0];
            int var56 = var55.method950(-2, class95.field2115);
            if (var56 != -1) {
                long var57 = var55.method965(63, var56 + 5).method955(false).method932(107);
                if (var4 == 17) {
                    class95.method645(-118, var57);
                }
                if (var4 == 15) {
                    class62.method449(var57, 7159);
                }
                if (var4 == 48) {
                    class80.method553(var57, -19259);
                }
                if (var4 == 30) {
                    class125.method981(22793, var57);
                }
            }
        }
        if (var4 == 43) {
            class60.field1437.method622(189, true);
            class92.field2104++;
            class60.field1437.method867((byte) -66, var3);
            class19 var59 = class125.method979(var3, 65535);
            if (var59.field508 != null && var59.field508[0][0] == 5) {
                int var60 = var59.field508[0][1];
                class90.field2045[var60] = 1 - class90.field2045[var60];
                class29.method227(8, var60);
                class97.field2168 = true;
            }
        }
        if (var4 == 16) {
            class60.field1437.method622(240, true);
            class60.field1437.method840(-11129, var3);
            class50.field1180++;
            class60.field1437.method839(var5, -9129);
            class60.field1437.method862((byte) 91, var2);
            class77.field1788 = var3;
            class22.field591 = 0;
            class66.field1598 = var2;
            class126.field2884 = 2;
            if (var3 >> 16 == class26.field659) {
                class126.field2884 = 1;
            }
            if (var3 >> 16 == class90.field2038) {
                class126.field2884 = 3;
            }
        }
        if (var4 == 10) {
            boolean var61 = class115.method880(false, var3, 25, 0, 0, 2, 0, 0, var2, class62.field1494.field767[0], 0, class62.field1494.field730[0]);
            if (!var61) {
                class115.method880(false, var3, 25, 1, 0, 2, 0, 1, var2, class62.field1494.field767[0], 0, class62.field1494.field730[0]);
            }
            class66.field1592 = class15.field280;
            class97.field2171 = class82.field1909;
            class77.field1771++;
            class12.field229 = 2;
            class41.field952 = 0;
            class60.field1437.method622(99, true);
            class60.field1437.method862((byte) 91, var3 + class9.field132);
            class60.field1437.method856(96, class129.field2977 + var2);
            class60.field1437.method856(96, var5);
        }
        if (var4 == 36) {
            class60.field1437.method622(148, true);
            class60.field1437.method840(-11129, var3);
            class114.field2566++;
            class60.field1437.method856(96, var5);
            class60.field1437.method862((byte) 91, var2);
            class126.field2884 = 2;
            class77.field1788 = var3;
            if (var3 >> 16 == class26.field659) {
                class126.field2884 = 1;
            }
            class22.field591 = 0;
            class66.field1598 = var2;
            if (var3 >> 16 == class90.field2038) {
                class126.field2884 = 3;
            }
        }
        if (var4 == 42) {
            class1.field1++;
            class60.field1437.method622(249, true);
            class60.field1437.method856(96, var2);
            class60.field1437.method839(var5, -9129);
            class60.field1437.method824(-921469304, var3);
            class22.field591 = 0;
            class66.field1598 = var2;
            class126.field2884 = 2;
            class77.field1788 = var3;
            if (var3 >> 16 == class26.field659) {
                class126.field2884 = 1;
            }
            if (var3 >> 16 == class90.field2038) {
                class126.field2884 = 3;
            }
        }
        if (var4 == 26) {
            class77.method529(var3, var5, -103, var2);
            class60.field1437.method622(213, true);
            class60.field1437.method850(class9.field132 + var3, (byte) 61);
            class16.field332++;
            class60.field1437.method850(var5 >> 14 & 0x7FFF, (byte) 109);
            class60.field1437.method862((byte) 91, class129.field2977 + var2);
        }
        if (var4 == 41) {
            class50 var63 = class8.field110[var5];
            if (var63 != null) {
                class101.field2255++;
                class115.method880(false, var63.field730[0], 25, 1, 0, 2, 0, 1, var63.field767[0], class62.field1494.field767[0], 0, class62.field1494.field730[0]);
                class97.field2171 = class82.field1909;
                class41.field952 = 0;
                class12.field229 = 2;
                class66.field1592 = class15.field280;
                class60.field1437.method622(153, true);
                class60.field1437.method850(var5, (byte) 64);
            }
        }
        if (class114.field2564 != 0) {
            class114.field2564 = 0;
            class97.field2168 = true;
        }
        if (class22.field573 != 0) {
            class22.field573 = 0;
            class97.field2168 = true;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZLva;ILva;)V", line = 1152)
    public static final void method491(boolean arg0, class121 arg1, int arg2, class121 arg3) {
        field1668++;
        if (class48.field1149) {
            class48.field1149 = false;
            class18.method148(false);
            class45.method302(arg2 - 1962);
            class37.method255(-18443);
            class81.method556((byte) -54);
            class16.method132(class4.field69, class19.field492, class63.field1526, (byte) 106, class119.field2757);
            class43.method286(-1, -14659, class42.field956, class28.field716, class69.field1651 == -1);
            class9.field151 = true;
            class28.field708 = true;
            class9.field146 = true;
        }
        class53.method379(-123);
        short var4 = 151;
        int var6 = var4 - 3;
        class119.field2757.method893(arg3, 257, var6, 0);
        class119.field2757.method893(arg3, 256, var6 - 1, 16777215);
        if (arg2 != 1932) {
            field1675 = 119;
        }
        if (arg1 != null) {
            var6 += 15;
            if (arg0) {
                int var5 = class119.field2757.method898(arg1) + 4;
                class55.method401(257 - var5 / 2, var6 - 11, var5, 11, 0);
            }
            class119.field2757.method893(arg1, 257, var6, 0);
            class119.field2757.method893(arg1, 256, var6 - 1, 16777215);
        }
        class90.method613(4);
    }

    @OriginalMember(owner = "client!le", name = "toString", descriptor = "()Ljava/lang/String;", line = 1198)
    public final String toString() {
        field1688++;
        return "Cache:" + this.field1682;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V", line = 1211)
    public static void method492(int arg0) {
        field1683 = null;
        field1669 = null;
        field1671 = null;
        field1680 = null;
        field1673 = null;
        field1681 = null;
        field1667 = null;
        if (arg0 != 0) {
            field1667 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V", line = 1230)
    public static final void method493(byte arg0) {
        field1677++;
        Object var1 = class108.field2458;
        synchronized (class108.field2458) {
            if (class90.field2035 != 0) {
                class90.field2035 = 1;
                try {
                    class108.field2458.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
        if (arg0 <= 79) {
            method491(false, null, 50, null);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZIII[B)Z", line = 1252)
    private final boolean method494(boolean arg0, int arg1, int arg2, int arg3, byte[] arg4) {
        field1672++;
        class100 var6 = this.field1686;
        synchronized (this.field1686) {
            try {
                int var7;
                if (arg0) {
                    if ((long) (arg1 * 6 + 6) > this.field1684.method682(17)) {
                        return false;
                    }
                    this.field1684.method678(3, (long) (arg1 * 6));
                    this.field1684.method681(6, -94, class107.field2428, 0);
                    var7 = ((class107.field2428[3] & 0xFF) << 16) + (class107.field2428[5] & 0xFF) + ((class107.field2428[4] & 0xFF) << 8);
                    if (var7 <= 0 || (long) var7 > this.field1686.method682(17) / 520L) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field1686.method682(17) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class107.field2428[0] = (byte) (arg2 >> 16);
                int var10 = 0;
                class107.field2428[1] = (byte) (arg2 >> 8);
                int var11 = 0;
                if (arg3 <= 2) {
                    this.field1686 = null;
                }
                class107.field2428[2] = (byte) arg2;
                class107.field2428[3] = (byte) (var7 >> 16);
                class107.field2428[4] = (byte) (var7 >> 8);
                class107.field2428[5] = (byte) var7;
                this.field1684.method678(3, (long) (arg1 * 6));
                this.field1684.method680(class107.field2428, 0, 6, true);
                while (arg2 > var10) {
                    int var12 = 0;
                    if (arg0) {
                        label109: {
                            this.field1686.method678(3, (long) (var7 * 520));
                            try {
                                this.field1686.method681(8, -121, class107.field2428, 0);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = (class107.field2428[6] & 0xFF) + ((class107.field2428[5] & 0xFF) << 8) + ((class107.field2428[4] & 0xFF) << 16);
                            int var13 = ((class107.field2428[0] & 0xFF) << 8) + (class107.field2428[1] & 0xFF);
                            int var14 = class107.field2428[7] & 0xFF;
                            int var15 = ((class107.field2428[2] & 0xFF) << 8) + (class107.field2428[3] & 0xFF);
                            if (arg1 == var13 && var11 == var15 && this.field1682 == var14) {
                                if (var12 >= 0 && this.field1686.method682(17) / 520L >= (long) var12) {
                                    break label109;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field1686.method682(17) + 519L) / 520L);
                        arg0 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class107.field2428[0] = (byte) (arg1 >> 8);
                    if (arg2 - var10 <= 512) {
                        var12 = 0;
                    }
                    class107.field2428[1] = (byte) arg1;
                    class107.field2428[2] = (byte) (var11 >> 8);
                    int var18 = arg2 - var10;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    class107.field2428[3] = (byte) var11;
                    class107.field2428[4] = (byte) (var12 >> 16);
                    class107.field2428[5] = (byte) (var12 >> 8);
                    var11++;
                    class107.field2428[6] = (byte) var12;
                    class107.field2428[7] = (byte) this.field1682;
                    this.field1686.method678(3, (long) (var7 * 520));
                    var7 = var12;
                    this.field1686.method680(class107.field2428, 0, 8, true);
                    this.field1686.method680(arg4, var10, var18, true);
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(ILr;Lr;I)V", line = 1532)
    public class71(int arg0, class100 arg1, class100 arg2, int arg3) {
        this.field1686 = arg1;
        this.field1678 = arg3;
        this.field1684 = arg2;
        this.field1682 = arg0;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II)[B", line = 1396)
    public final byte[] method495(int arg0, int arg1) {
        field1687++;
        class100 var3 = this.field1686;
        synchronized (this.field1686) {
            try {
                if ((long) (arg0 * 6 + 6) > this.field1684.method682(17)) {
                    return null;
                }
                this.field1684.method678(3, (long) (arg0 * 6));
                this.field1684.method681(6, -112, class107.field2428, 0);
                int var5 = (class107.field2428[5] & 0xFF) + (((class107.field2428[3] & 0xFF) << 16) + ((class107.field2428[4] & 0xFF) << 8));
                int var6 = ((class107.field2428[1] & 0xFF) << 8) + ((class107.field2428[0] & 0xFF) << 16) + (class107.field2428[2] & 0xFF);
                if (var6 < 0 || this.field1678 < var6) {
                    return null;
                } else if (var5 > 0 && this.field1686.method682(17) / 520L >= (long) var5) {
                    int var9 = 0;
                    if (arg1 != -1319) {
                        this.method495(16, 111);
                    }
                    byte[] var10 = new byte[var6];
                    int var11 = 0;
                    while (var6 > var9) {
                        if (var5 == 0) {
                            return null;
                        }
                        this.field1686.method678(3, (long) (var5 * 520));
                        int var13 = var6 - var9;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field1686.method681(var13 + 8, 77, class107.field2428, 0);
                        int var14 = (class107.field2428[6] & 0xFF) + ((class107.field2428[4] & 0xFF) << 16) + ((class107.field2428[5] & 0xFF) << 8);
                        int var15 = ((class107.field2428[2] & 0xFF) << 8) + (class107.field2428[3] & 0xFF);
                        int var16 = ((class107.field2428[0] & 0xFF) << 8) + (class107.field2428[1] & 0xFF);
                        int var17 = class107.field2428[7] & 0xFF;
                        if (arg0 == var16 && var11 == var15 && this.field1682 == var17) {
                            if (var14 >= 0 && (long) var14 <= this.field1686.method682(arg1 + 1336) / 520L) {
                                var5 = var14;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var10[var9++] = class107.field2428[var20 + 8];
                                }
                                var11++;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var10;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "([BBII)Z", line = 1493)
    public final boolean method496(byte[] arg0, byte arg1, int arg2, int arg3) {
        field1685++;
        class100 var5 = this.field1686;
        synchronized (this.field1686) {
            if (arg3 < 0 || arg3 > this.field1678) {
                throw new IllegalArgumentException();
            }
            if (arg1 != 72) {
                field1667 = null;
            }
            boolean var6 = this.method494(true, arg2, arg3, 90, arg0);
            if (!var6) {
                var6 = this.method494(false, arg2, arg3, arg1 - 40, arg0);
            }
            return var6;
        }
    }
}
