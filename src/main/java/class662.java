import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class662 extends class117 {

    @OriginalMember(owner = "client!qt", name = "U", descriptor = "J")
    public static long field9219 = 0L;

    @OriginalMember(owner = "client!qt", name = "P", descriptor = "I")
    public static int field9214;

    @OriginalMember(owner = "client!qt", name = "Q", descriptor = "I")
    public static int field9215;

    @OriginalMember(owner = "client!qt", name = "R", descriptor = "I")
    public static int field9216;

    @OriginalMember(owner = "client!qt", name = "S", descriptor = "I")
    public static int field9217;

    @OriginalMember(owner = "client!qt", name = "T", descriptor = "I")
    public static int field9218;

    @OriginalMember(owner = "client!qt", name = "V", descriptor = "I")
    public static int field9220;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIILrja;)V", line = 4)
    public static final void method3775(int arg0, int arg1, int arg2, class114 arg3) {
        class601.field8423[arg2][arg1] = arg3;
        field9217++;
        if (arg0 != -16777216) {
            method3777((byte) 127);
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lpf;II)V", line = 15)
    public static final void method3776(class607 arg0, int arg1, int arg2) {
        field9216++;
        if (class565.field8020 >= 50 || arg0 == null || arg0.field8517 == null || arg1 >= arg0.field8517.length || arg0.field8517[arg1] == null) {
            return;
        }
        int var3 = 101 % ((26 - arg2) / 54);
        int var4 = arg0.field8517[arg1][0];
        int var5 = var4 >> 8;
        int var6 = (var4 & 0xF2) >> 5;
        if (arg0.field8517[arg1].length > 1) {
            int var7 = (int) (Math.random() * (double) arg0.field8517[arg1].length);
            if (var7 > 0) {
                var5 = arg0.field8517[arg1][var7];
            }
        }
        int var8 = 256;
        if (arg0.field8498 != null && arg0.field8518 != null) {
            var8 = class298.method1938(arg0.field8518[arg1], arg0.field8498[arg1], (byte) -26);
        }
        if (arg0.field8499) {
            class355.method2259(var8, true, 255, 0, false, var5, var6);
        } else {
            class442.method2635(255, -104, 0, var6, var5, var8);
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)Ljava/lang/String;", line = 59)
    public static final String method3777(byte arg0) {
        field9214++;
        String var1 = "www";
        if (class300.field4326 == class211.field3264) {
            var1 = "www-wtrc";
        } else if (class394.field5419 == class300.field4326) {
            var1 = "www-wtqa";
        } else if (class300.field4326 == class189.field2913) {
            var1 = "www-wtwip";
        }
        String var2 = "";
        if (class357.field5022 != null) {
            var2 = "/p=" + class357.field5022;
        }
        int var3 = 62 / ((-arg0 - 36) / 53);
        return "http://" + var1 + "." + class60.field734.field3719 + ".com/l=" + class140.field2081 + "/a=" + class467.field6560 + var2 + "/";
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(ILha;)V", line = 93)
    public static final void method3778(int arg0, class65 arg1) {
        field9218++;
        int var2 = 0;
        int var3 = 0;
        if (class195.field2997) {
            var2 = class493.method2933((byte) -122);
            var3 = class242.method1613(8220);
        }
        int var4 = class109.field1608 + var2;
        int var5 = class407.field5549 + var3;
        int var6 = class54.field679;
        int var7 = class42.field549 - 3;
        byte var8 = 20;
        class690.method3900(class620.field8685.method3580(class140.field2081, 12), class54.field679, var8, 0, class109.field1608 + var2, arg1, class42.field549, class407.field5549 + var3);
        int var9 = var2 + class152.field2154.method2646(9);
        int var10 = class152.field2154.method2650((byte) -123) + var3;
        if (class378.field5223) {
            int var11 = 0;
            for (class753 var12 = (class753) class371.field5135.method636(256); var12 != null; var12 = (class753) class371.field5135.method637(false)) {
                int var16 = var11 * 16 + var8 + var5 + 13;
                if ((class109.field1608 + var2) < var9 && var9 < class109.field1608 + var2 + class54.field679 && var10 > (var16 - 13) && var16 + 4 > var10 && (var12.field10409 > 1 || ((class746) var12.field10411.field923.field1600).field10336)) {
                    arg1.method495(class109.field1608 + var2, var16 + -12, class54.field679, 16, 255 - class330.field4626 << 24 | class301.field4344, 1);
                }
                var11++;
            }
            if (class280.field4071 != null) {
                class690.method3900(class280.field4071.field10408, class545.field7847, var8, 0, class55.field705, arg1, class295.field4298, class724.field10026);
                int var13 = 0;
                for (class746 var14 = (class746) class280.field4071.field10411.method636(256); var14 != null; var14 = (class746) class280.field4071.field10411.method637(false)) {
                    int var15 = var13 * 16 + class724.field10026 + var8 + 13;
                    if (class55.field705 < var9 && (class55.field705 + class545.field7847) > var9 && var10 > (var15 - 13) && var10 < var15 + 4 && var14.field10336) {
                        arg1.method495(class55.field705, var15 - 12, class545.field7847, 16, 255 - class330.field4626 << 24 | class301.field4344, 1);
                    }
                    var13++;
                }
                class30.method252(class545.field7847, arg1, class55.field705, class724.field10026, 5308, class295.field4298, var8);
            }
        } else {
            int var17 = 0;
            for (class746 var18 = (class746) class239.field3583.method1731((byte) -113); var18 != null; var18 = (class746) class239.field3583.method1724(0)) {
                int var28 = (class618.field8644 - (var17 + 1)) * 16 + var5 + var8 + 13;
                if ((class109.field1608 + var2) < var9 && class109.field1608 + var2 + class54.field679 > var9 && (var28 - 13) < var10 && var10 < var28 + 4 && var18.field10336) {
                    arg1.method495(class109.field1608 + var2, var28 + -12, class54.field679, 16, class301.field4344 | 255 - class330.field4626 << 24, 1);
                }
                var17++;
            }
        }
        class30.method252(class54.field679, arg1, class109.field1608 + var2, class407.field5549 + var3, arg0 + 5312, class42.field549, var8);
        if (class378.field5223) {
            int var22 = 0;
            for (class753 var23 = (class753) class371.field5135.method636(arg0 ^ 0xFFFFFEFC); var23 != null; var23 = (class753) class371.field5135.method637(false)) {
                int var27 = var22 * 16 + class407.field5549 + var8 + var3 + 13;
                var22++;
                if (var23.field10409 == 1) {
                    class564.method3327(class42.field549, var9, class109.field1608 + var2, arg1, (byte) -93, class407.field5549 + var3, var10, class789.field10825 | 0xFF000000, class54.field679, class665.field9264 | 0xFF000000, var27, (class746) var23.field10411.field923.field1600);
                } else {
                    class404.method2483(var23, class42.field549, 1, class109.field1608 + var2, var10, arg1, class789.field10825 | 0xFF000000, class54.field679, class407.field5549 + var3, class665.field9264 | 0xFF000000, var9, var27);
                }
            }
            if (class280.field4071 != null) {
                int var24 = 0;
                for (class746 var25 = (class746) class280.field4071.field10411.method636(256); var25 != null; var25 = (class746) class280.field4071.field10411.method637(false)) {
                    int var26 = class724.field10026 + var8 + var24 * 16 + 13;
                    class564.method3327(class295.field4298, var9, class55.field705, arg1, (byte) -55, class724.field10026, var10, class789.field10825 | 0xFF000000, class545.field7847, class665.field9264 | 0xFF000000, var26, var25);
                    var24++;
                }
                class453.method2706(class55.field705, arg0 + 4, class295.field4298, class724.field10026, class545.field7847);
            }
        } else {
            int var19 = 0;
            for (class746 var20 = (class746) class239.field3583.method1731((byte) -108); var20 != null; var20 = (class746) class239.field3583.method1724(0)) {
                int var21 = (class618.field8644 - var19 - 1) * 16 + var5 + var8 + 13;
                class564.method3327(var7, var9, var4, arg1, (byte) -71, var5, var10, class789.field10825 | 0xFF000000, var6, class665.field9264 | 0xFF000000, var21, var20);
                var19++;
            }
        }
        class453.method2706(class109.field1608 + var2, arg0 ^ arg0, class42.field549, class407.field5549 + var3, class54.field679);
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lwia;BLha;)V", line = 270)
    public static final void method3779(class791 arg0, byte arg1, class65 arg2) {
        field9220++;
        class1[] var3 = class1.method14(arg0, class656.field9144, 0);
        class33.field447 = new class241[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class33.field447[var4] = arg2.method551(var3[var4], true);
        }
        class1[] var5 = class1.method14(arg0, class10.field204, 0);
        class503.field7118 = new class241[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class503.field7118[var6] = arg2.method551(var5[var6], true);
        }
        class1[] var7 = class1.method14(arg0, class632.field8876, 0);
        class273.field3950 = new class241[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class273.field3950[var8] = arg2.method551(var7[var8], true);
        }
        class1[] var9 = class1.method14(arg0, class445.field6055, 0);
        class564.field8003 = new class241[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class564.field8003[var10] = arg2.method551(var9[var10], true);
        }
        class1[] var11 = class1.method14(arg0, class622.field8742, 0);
        class67.field822 = new class241[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class67.field822[var12] = arg2.method551(var11[var12], true);
        }
        class1[] var13 = class1.method14(arg0, class471.field6613, 0);
        class454.field6372 = new class241[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class454.field6372[var14] = arg2.method551(var13[var14], true);
        }
        class1[] var15 = class1.method14(arg0, class219.field3383, 0);
        class703.field9801 = new class241[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class703.field9801[var16] = arg2.method551(var15[var16], true);
        }
        class1[] var17 = class1.method14(arg0, class89.field1007, 0);
        class530.field7673 = new class241[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class530.field7673[var18] = arg2.method551(var17[var18], true);
        }
        class1[] var19 = class1.method14(arg0, class103.field1190, 0);
        class652.field9096 = new class241[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class652.field9096[var20] = arg2.method551(var19[var20], true);
        }
        class1[] var21 = class1.method14(arg0, class290.field4245, 0);
        class578.field8145 = new class241[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class578.field8145[var22] = arg2.method551(var21[var22], true);
        }
        class1[] var23 = class1.method14(arg0, class479.field6735, 0);
        class463.field6535 = new class241[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class463.field6535[var24] = arg2.method551(var23[var24], true);
        }
        class1[] var25 = class1.method14(arg0, class358.field5029, 0);
        class459.field6425 = new class241[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class459.field6425[var26] = arg2.method551(var25[var26], true);
        }
        if (arg1 <= 13) {
            method3776(null, 72, 88);
        }
        class488.field6897 = arg2.method551(class1.method5(arg0, class737.field10171, 0), true);
        class84.field927 = arg2.method551(class1.method5(arg0, class576.field8126, 0), true);
        class1[] var27 = class1.method14(arg0, class209.field3241, 0);
        class413.field5628 = new class241[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class413.field5628[var28] = arg2.method551(var27[var28], true);
        }
    }
}
