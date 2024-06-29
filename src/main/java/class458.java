import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public abstract class class458 extends class504 {

    @OriginalMember(owner = "client!hca", name = "k", descriptor = "I")
    public static int field6219 = 0;

    @OriginalMember(owner = "client!hca", name = "j", descriptor = "I")
    public static int field6218 = 1;

    @OriginalMember(owner = "client!hca", name = "l", descriptor = "I")
    public static int field6220 = 0;

    @OriginalMember(owner = "client!hca", name = "i", descriptor = "I")
    public static int field6217;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(B)I")
    public abstract int method1655(byte arg0);

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "(B)I")
    public abstract int method1654(byte arg0);

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)I")
    public abstract int method1650(int arg0);

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "(I)I")
    public abstract int method1649(int arg0);

    @OriginalMember(owner = "client!hca", name = "d", descriptor = "(B)J")
    public abstract long method1651(byte arg0);

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(Loa;B)V")
    public static final void method2612(class651 arg0, byte arg1) {
        field6217++;
        int var2 = class259.field3566;
        int var3 = class340.field4703;
        int var4 = class483.field6540;
        int var5 = class342.field4707 - 3;
        byte var6 = 20;
        if (class52.field726 == null || class58.field813 == null) {
            if (class658.field9155.method2549(class70.field1045, arg1 + 2900) && class658.field9155.method2549(class117.field1998, arg1 + 2900)) {
                class52.field726 = arg0.method440(class500.method2770(class658.field9155, class70.field1045, 0), true);
                class500 var7 = class500.method2770(class658.field9155, class117.field1998, 0);
                class58.field813 = arg0.method440(var7, true);
                var7.method2775();
                class360.field4871 = arg0.method440(var7, true);
            } else {
                arg0.method415(var2, var3, var4, var6, class269.field3756 | 255 - class172.field2658 << 24, 1);
            }
        }
        if (class52.field726 != null && class58.field813 != null) {
            int var8 = (var4 - class58.field813.method1035() * 2) / class52.field726.method1035();
            for (int var9 = 0; var9 < var8; var9++) {
                class52.field726.method2637(class58.field813.method1035() + var2 + (var9 * class52.field726.method1035()), var3);
            }
            class58.field813.method2637(var2, var3);
            class360.field4871.method2637(var4 + var2 - class360.field4871.method1035(), var3);
        }
        class450.field6177.method1288((byte) 83, var2 + 3, class96.field1460 | 0xFF000000, -1, class72.field1088.method546(class516.field6892, (byte) -35), var3 + 14);
        arg0.method415(var2, var3 + var6, var4, var5 - var6, class269.field3756 | 255 - class172.field2658 << 24, 1);
        int var10 = class164.field2564.method1110((byte) 91);
        int var11 = class164.field2564.method1113(-6387);
        int var12 = 0;
        for (class117 var13 = (class117) class480.field6411.method3257(-43); var13 != null; var13 = (class117) class480.field6411.method3263((byte) -85)) {
            int var31 = var3 - (-var6 - (-var12 + -1 + class398.field5290) * 16 - 13);
            var12++;
            if (var2 < var10 && var2 + var4 > var10 && var11 > var31 - 13 && var11 < (var31 + 4) && var13.field2004) {
                arg0.method415(var2, var31 - 12, var4, 16, class157.field2485 | 255 - class1.field7 << 24, 1);
            }
        }
        if ((class446.field6100 == null || class439.field6040 == null || class36.field550 == null) && class658.field9155.method2549(class335.field4656, arg1 ^ 0xBB4) && class658.field9155.method2549(class677.field9567, 3015) && class658.field9155.method2549(class88.field1329, 3015)) {
            class500 var14 = class500.method2770(class658.field9155, class677.field9567, 0);
            class439.field6040 = arg0.method440(var14, true);
            var14.method2775();
            class26.field433 = arg0.method440(var14, true);
            class446.field6100 = arg0.method440(class500.method2770(class658.field9155, class335.field4656, 0), true);
            class500 var15 = class500.method2770(class658.field9155, class88.field1329, 0);
            class36.field550 = arg0.method440(var15, true);
            var15.method2775();
            class386.field5133 = arg0.method440(var15, true);
        }
        int var16 = 0;
        if (class446.field6100 != null && class439.field6040 != null && class36.field550 != null) {
            int var17 = (var4 - class36.field550.method1035() * 2) / class446.field6100.method1035();
            for (int var18 = 0; var18 < var17; var18++) {
                class446.field6100.method2637(var2 + class36.field550.method1035() + (var18 * class446.field6100.method1035()), -class446.field6100.method1028() + var5 + var3);
            }
            int var19 = (var5 - (var6 + class36.field550.method1028())) / class439.field6040.method1028();
            for (int var20 = 0; var20 < var19; var20++) {
                class439.field6040.method2637(var2, var6 + (var3 + (var20 * class439.field6040.method1028())));
                class26.field433.method2637(var2 + var4 - class26.field433.method1035(), var3 + (var6 - -(var20 * class439.field6040.method1028())));
            }
            class36.field550.method2637(var2, var3 + var5 - class36.field550.method1028());
            class386.field5133.method2637(var4 + var2 - class36.field550.method1035(), var3 - -var5 + -class36.field550.method1028());
        }
        if (arg1 != 115) {
            field6218 = 125;
        }
        for (class117 var21 = (class117) class480.field6411.method3257(arg1 ^ 0xFFFFFF9F); var21 != null; var21 = (class117) class480.field6411.method3263((byte) -80)) {
            int var22 = var3 - (-var6 - ((class398.field5290 - var16 - 1) * 16 + 13));
            int var23 = class96.field1460 | 0xFF000000;
            if (var10 > var2 && var2 + var4 > var10 && var22 - 13 < var11 && var11 < (var22 + 4) && var21.field2004) {
                var23 = class73.field1133 | 0xFF000000;
            }
            int[] var24 = null;
            if (class702.method3886(var21.field1993, (byte) 34)) {
                var24 = class193.field2826.method1047((int) var21.field1996, -1).field7654;
            } else if (var21.field1992 != -1) {
                var24 = class193.field2826.method1047(var21.field1992, -1).field7654;
            } else if (class264.method1611(var21.field1993, false)) {
                class280 var27 = (class280) class616.field8143.method2918((long) ((int) var21.field1996), (byte) 32);
                if (var27 != null) {
                    class287 var28 = var27.field3983;
                    class419 var29 = var28.field4052;
                    if (var29.field5753 != null) {
                        var29 = var29.method2401(false, class80.field1261);
                    }
                    if (var29 != null) {
                        var24 = var29.field5791;
                    }
                }
            } else if (class407.method2336(var21.field1993, (byte) -117)) {
                Object var25 = null;
                class58 var26;
                if (var21.field1993 == 1010) {
                    var26 = class470.field6288.method1258((int) var21.field1996, (byte) -21);
                } else {
                    var26 = class470.field6288.method1258((int) (var21.field1996 >>> 32 & 0x7FFFFFFFL), (byte) -110);
                }
                if (var26.field888 != null) {
                    var26 = var26.method486((byte) -113, class80.field1261);
                }
                if (var26 != null) {
                    var24 = var26.field811;
                }
            }
            String var30 = class690.method3834(var21, (byte) -106);
            if (var24 != null) {
                var30 = var30 + class179.method1201(arg1 ^ 0xFFFFAD05, var24);
            }
            class450.field6177.method1300(0, var22, var2 + 3, class651.field8812, arg1 - 115, class690.field9713, var30, var23);
            if (var21.field2000) {
                class628.field8474.method2637(class193.field2823.method2847(var30, (byte) -126) + var2 + 5, var22 + -12);
            }
            var16++;
        }
        class92.method727(class483.field6540, (byte) -61, class340.field4703, class259.field3566, class342.field4707);
    }
}
