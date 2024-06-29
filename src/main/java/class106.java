import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class106 {

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "I")
    public int field1331 = 0;

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "Lkp;")
    public static class464 field1327 = new class464();

    @OriginalMember(owner = "client!cq", name = "g", descriptor = "I")
    public static int field1332 = -1;

    @OriginalMember(owner = "client!cq", name = "h", descriptor = "Lwca;")
    public static class311 field1333 = null;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!cq", name = "i", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)I")
    public static final int method624(int arg0, int arg1) {
        if (arg0 == -29287) {
            field1329++;
            return arg1 & 0x7F;
        } else {
            return 37;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V")
    public static void method625(int arg0) {
        field1327 = null;
        if (arg0 != -5) {
            field1332 = 57;
        }
        field1333 = null;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lcd;B)V")
    public static final void method626(class86 arg0, byte arg1) {
        field1330++;
        boolean var2 = false;
        if (class576.field8505 == arg0.field1004 || arg0.field1024 == -1 || arg0.field1079 != 0) {
            var2 = true;
        } else {
            class224 var3 = class470.field7205.method3498(false, arg0.field1024);
            if (var3.field3309 || var3.field3307[arg0.field1057] < (arg0.field1008 + 1)) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg0.field1004 - arg0.field1045;
            int var5 = class576.field8505 - arg0.field1045;
            int var6 = arg0.field1015 * 128 + arg0.method514(0) * 64;
            int var7 = arg0.field1030 * 128 + (arg0.method514(0) * 64);
            int var8 = arg0.field1018 * 128 + (arg0.method514(0) * 64);
            int var9 = arg0.field1040 * 128 + arg0.method514(0) * 64;
            arg0.field3464 = ((var4 - var5) * var6 + var5 * var8) / var4;
            arg0.field3463 = ((var4 - var5) * var7 + (var5 * var9)) / var4;
        }
        arg0.field1096 = 0;
        if (arg0.field1077 == 0) {
            arg0.method502(8192, false, false);
        }
        if (arg0.field1077 == 1) {
            arg0.method502(12288, false, false);
        }
        int var10 = -23 / ((-arg1 - 9) / 63);
        if (arg0.field1077 == 2) {
            arg0.method502(0, false, false);
        }
        if (arg0.field1077 == 3) {
            arg0.method502(4096, false, false);
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lps;B)V")
    public final void method627(class428 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method2561((byte) 107);
            if (var3 == 0) {
                field1328++;
                if (arg1 < 97) {
                    field1327 = null;
                    return;
                }
                return;
            }
            this.method629(31232, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(BIIILjava/lang/String;)V")
    public static final void method628(byte arg0, int arg1, int arg2, int arg3, String arg4) {
        field1326++;
        class311 var5 = class240.method1540(arg3, arg2, true);
        if (var5 == null) {
            return;
        }
        if (var5.field4651 != null) {
            class355 var6 = new class355();
            var6.field5160 = var5.field4651;
            var6.field5150 = var5;
            var6.field5156 = arg4;
            var6.field5153 = arg1;
            class330.method2072(var6);
        }
        if (class192.field2903 != 9 || !client.method3619(var5).method3522((byte) 35, arg1 - 1)) {
            return;
        }
        if (arg1 == 1) {
            class613.field8999++;
            class165.method1046(-3466, class296.field4331);
            class524.method3094(arg3, -80, var5.field4661, arg2);
        }
        if (arg1 == 2) {
            class165.method1046(-3466, class453.field6615);
            class228.field3351++;
            class524.method3094(arg3, 102, var5.field4661, arg2);
        }
        if (arg1 == 3) {
            class515.field7630++;
            class165.method1046(-3466, class372.field5393);
            class524.method3094(arg3, 127, var5.field4661, arg2);
        }
        if (arg1 == 4) {
            class165.method1046(-3466, class465.field6711);
            class261.field3838++;
            class524.method3094(arg3, 80, var5.field4661, arg2);
        }
        if (arg1 == 5) {
            class371.field5370++;
            class165.method1046(-3466, class253.field3690);
            class524.method3094(arg3, 104, var5.field4661, arg2);
        }
        if (arg1 == 6) {
            class597.field8823++;
            class165.method1046(-3466, class346.field5038);
            class524.method3094(arg3, -81, var5.field4661, arg2);
        }
        if (arg1 == 7) {
            class165.method1046(-3466, class1.field6);
            class215.field3173++;
            class524.method3094(arg3, -104, var5.field4661, arg2);
        }
        if (arg1 == 8) {
            class165.method1046(-3466, class207.field3080);
            class159.field2120++;
            class524.method3094(arg3, -106, var5.field4661, arg2);
        }
        int var7 = 69 % ((-arg0 - 16) / 48);
        if (arg1 == 9) {
            class77.field896++;
            class165.method1046(-3466, class395.field5740);
            class524.method3094(arg3, -91, var5.field4661, arg2);
        }
        if (arg1 == 10) {
            class561.field8322++;
            class165.method1046(-3466, class446.field6500);
            class524.method3094(arg3, -108, var5.field4661, arg2);
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IILps;)V")
    private final void method629(int arg0, int arg1, class428 arg2) {
        if (arg0 != 31232) {
            field1327 = null;
        }
        field1334++;
        if (arg1 == 5) {
            this.field1331 = arg2.method2620(arg0 ^ 0x7A3C);
        }
    }
}
