import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class226 {

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "Li;")
    public static class203 field3812 = new class203(64);

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "Lwa;")
    public static class75 field3816 = class66.method560("(U", false);

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "[Z")
    public static boolean[] field3815 = new boolean[100];

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "Lg;")
    public static class149 field3817;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "[[B")
    public static byte[][] field3814;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)[Lqj;", line = 9)
    public static final class238[] method1658(byte arg0) {
        field3808++;
        if (arg0 > -126) {
            method1661((byte) -54);
        }
        class238[] var1 = new class238[class149.field2563];
        for (int var2 = 0; var2 < class149.field2563; var2++) {
            var1[var2] = new class49(class263.field4571, class76.field1321, class85.field1404[var2], class232.field3934[var2], class210.field3590[var2], class287.field4936[var2], class42.field687[var2], class191.field3184);
        }
        class235.method1713(0);
        return var1;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)Lje;", line = 50)
    public static final class68 method1659(int arg0) {
        field3809++;
        if (arg0 != -7507) {
            method1658((byte) -94);
        }
        class68 var1 = new class68(class263.field4571, class76.field1321, class85.field1404[0], class232.field3934[0], class210.field3590[0], class287.field4936[0], class42.field687[0], class191.field3184);
        class235.method1713(0);
        return var1;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIZIIII)V", line = 64)
    public static final void method1660(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field3811++;
        int var7 = arg6 + arg5;
        for (int var8 = arg6; var8 < var7; var8++) {
            class150.method1151(7, class63.field1096[var8], arg1, arg0, arg3);
        }
        int var9 = arg4 - arg5;
        for (int var10 = arg4; var10 > var9; var10--) {
            class150.method1151(7, class63.field1096[var10], arg1, arg0, arg3);
        }
        int var11 = arg1 + arg5;
        int var12 = arg3 - arg5;
        if (!arg2) {
            method1658((byte) -120);
        }
        for (int var13 = var7; var13 <= var9; var13++) {
            int[] var14 = class63.field1096[var13];
            class150.method1151(7, var14, arg1, arg0, var11);
            class150.method1151(7, var14, var12, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(B)V", line = 108)
    public static final void method1661(byte arg0) {
        field3810++;
        boolean var1 = true;
        class136.method1040(32, false);
        class282.field4867 = 0;
        for (int var2 = 0; var2 < class267.field4595.length; var2++) {
            if (class88.field1459[var2] != -1 && class267.field4595[var2] == null) {
                class267.field4595[var2] = class121.field2039.method1911(class88.field1459[var2], 0, -72);
                if (class267.field4595[var2] == null) {
                    class282.field4867++;
                    var1 = false;
                }
            }
            if (class202.field3410[var2] != -1 && class109.field1876[var2] == null) {
                class109.field1876[var2] = class121.field2039.method1907(class197.field3300[var2], class202.field3410[var2], 0, (byte) 72);
                if (class109.field1876[var2] == null) {
                    var1 = false;
                    class282.field4867++;
                }
            }
            if (class37.field543[var2] != -1 && field3814[var2] == null) {
                field3814[var2] = class121.field2039.method1911(class37.field543[var2], 0, -72);
                if (field3814[var2] == null) {
                    class282.field4867++;
                    var1 = false;
                }
            }
            if (class90.field1484[var2] != -1 && class294.field5055[var2] == null) {
                class294.field5055[var2] = class121.field2039.method1911(class90.field1484[var2], 0, -83);
                if (class294.field5055[var2] == null) {
                    var1 = false;
                    class282.field4867++;
                }
            }
            if (class24.field317 != null && class176.field2954[var2] == null && class24.field317[var2] != -1) {
                class176.field2954[var2] = class121.field2039.method1907(class197.field3300[var2], class24.field317[var2], 0, (byte) 72);
                if (class176.field2954[var2] == null) {
                    var1 = false;
                    class282.field4867++;
                }
            }
        }
        if (class152.field2619 == null || !class249.field4199.method1909(class66.method562((byte) 119, new class75[] { class152.field2619.field2974, class252.field4234 }), 0)) {
            class13.field179 = null;
        } else if (class249.field4199.method1896(class66.method562((byte) -29, new class75[] { class152.field2619.field2974, class252.field4234 }), -4570)) {
            class13.field179 = class112.method869(class66.method562((byte) -105, new class75[] { class152.field2619.field2974, class252.field4234 }), class249.field4199, 8958);
        } else {
            var1 = false;
            class282.field4867++;
        }
        if (!var1) {
            class65.field1129 = 1;
            return;
        }
        int var3 = 45 / ((-arg0 - 36) / 55);
        boolean var4 = true;
        class55.field916 = 0;
        for (int var5 = 0; var5 < class267.field4595.length; var5++) {
            byte[] var6 = class109.field1876[var5];
            if (var6 != null) {
                int var7 = (class288.field4952[var5] >> 8) * 64 - class275.field4737;
                int var8 = (class288.field4952[var5] & 0xFF) * 64 - class175.field2939;
                if (class151.field2605) {
                    var7 = 10;
                    var8 = 10;
                }
                var4 &= class216.method1590(var7, var8, var6, true);
            }
            byte[] var9 = class294.field5055[var5];
            if (var9 != null) {
                int var10 = (class288.field4952[var5] >> 8) * 64 - class275.field4737;
                int var11 = (class288.field4952[var5] & 0xFF) * 64 - class175.field2939;
                if (class151.field2605) {
                    var10 = 10;
                    var11 = 10;
                }
                var4 &= class216.method1590(var10, var11, var9, true);
            }
        }
        if (!var4) {
            class65.field1129 = 2;
            return;
        }
        if (class65.field1129 != 0) {
            class145.method1110(class66.method562((byte) 120, new class75[] { class282.field4861, class30.field445 }), -1, true);
        }
        class54.method393((byte) 43);
        boolean var12 = false;
        class182.method1342(-72);
        class301.method2069();
        for (int var13 = 0; var13 < class267.field4595.length; var13++) {
            if (class294.field5055[var13] != null || field3814[var13] != null) {
                var12 = true;
                break;
            }
        }
        if (!class167.field2816) {
            var12 = false;
        }
        if (var12) {
            class115.method882(1);
        } else {
            class171.method1264();
        }
        for (int var14 = 0; var14 < 4; var14++) {
            class286.field4931[var14].method815(64);
        }
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 104; var16++) {
                for (int var17 = 0; var17 < 104; var17++) {
                    class204.field3459[var15][var16][var17] = 0;
                }
            }
        }
        class31.method211((byte) 84, false);
        class18.field243.method578();
        for (int var18 = 0; var18 < 13; var18++) {
            for (int var19 = 0; var19 < 13; var19++) {
                class18.field242[var18][var19].field2443 = true;
            }
        }
        class209.method1543();
        class168.method1242((byte) -68);
        class54.method393((byte) 43);
        System.gc();
        class136.method1040(32, true);
        class229.method1675(false, 97);
        if (!class151.field2605) {
            class97.method750((byte) 114, false);
            class136.method1040(32, true);
            int var20 = class279.field4831.field3236[0] >> 3;
            int var21 = class279.field4831.field3205[0] >> 3;
            class218.method1595(var20, (byte) 57, var21);
            class292.method2036((byte) -71, false);
            if (class176.field2954 != null) {
                class251.method1804(false);
            }
        }
        if (class151.field2605) {
            class42.method282((byte) -67, false);
            class136.method1040(32, true);
            int var22 = class279.field4831.field3236[0] >> 3;
            int var23 = class279.field4831.field3205[0] >> 3;
            class218.method1595(var22, (byte) -122, var23);
            class67.method571(false, (byte) 86);
        }
        class182.method1342(-72);
        class136.method1040(32, true);
        class154.method1176(true, class286.field4931, false);
        class209.method1547();
        class136.method1040(32, true);
        int var24 = class151.field2586;
        if (class67.field1174 < var24) {
            var24 = class67.field1174;
        }
        if (var24 < (class67.field1174 - 1)) {
            int var25 = class67.field1174 - 1;
        }
        if (class300.method2067(-12461)) {
            class118.method901(0);
        } else {
            class118.method901(class151.field2586);
        }
        class221.method1620(-124);
        if (var12) {
            class258.method1844(true);
            class229.method1675(true, 103);
            if (!class151.field2605) {
                class97.method750((byte) 99, true);
                class136.method1040(32, true);
                class292.method2036((byte) -101, true);
            }
            if (class151.field2605) {
                class42.method282((byte) -123, true);
                class136.method1040(32, true);
                class67.method571(true, (byte) 86);
            }
            class182.method1342(-111);
            class136.method1040(32, true);
            class154.method1176(true, class286.field4931, true);
            class136.method1040(32, true);
            class221.method1620(-119);
            class258.method1844(false);
        }
        for (int var26 = 0; var26 < 13; var26++) {
            for (int var27 = 0; var27 < 13; var27++) {
                class18.field242[var26][var27].method1095(class53.field879[0], var26 * 8, var27 * 8);
            }
        }
        for (int var28 = 0; var28 < 104; var28++) {
            for (int var29 = 0; var29 < 104; var29++) {
                class90.method712(var28, 128, var29);
            }
        }
        class63.method544(65);
        class54.method393((byte) 43);
        class295.method2051((byte) 85);
        class182.method1342(-123);
        if (class211.field3601 != null && class35.field513 != null && class118.field2003 == 25) {
            class170.field2857++;
            class89.field1470.method87(65280, 138);
            class89.field1470.method510(1057001181, -107);
        }
        if (!class151.field2605) {
            int var30 = (class59.field984 - 6) / 8;
            int var31 = (class59.field984 + 6) / 8;
            int var32 = (class104.field1759 - 6) / 8;
            int var33 = (class104.field1759 + 6) / 8;
            for (int var34 = var30 - 1; var34 <= var31 + 1; var34++) {
                for (int var35 = var32 - 1; var35 <= var33 + 1; var35++) {
                    if (var30 > var34 || var34 > var31 || var35 < var32 || var35 > var33) {
                        class121.field2039.method1894((byte) -111, class66.method562((byte) -59, new class75[] { class63.field1105, class67.method565(94, var34), class233.field3940, class67.method565(46, var35) }));
                        class121.field2039.method1894((byte) -111, class66.method562((byte) 118, new class75[] { class106.field1788, class67.method565(30, var34), class233.field3940, class67.method565(116, var35) }));
                    }
                }
            }
        }
        if (class118.field2003 == 28) {
            class52.method380(74, 10);
        } else {
            class52.method380(102, 30);
            if (class35.field513 != null) {
                class89.field1470.method87(65280, 70);
            }
        }
        class54.method393((byte) 43);
        class259.method1850(14);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lah;I)V", line = 604)
    public static final void method1662(class194 arg0, int arg1) {
        if (class143.field2463 == arg0.field3214 || arg0.field3204 == -1 || arg0.field3268 != 0 || arg0.field3260 + 1 > class302.method2082(arg0.field3204, 43).field361[arg0.field3234]) {
            int var2 = arg0.field3214 - arg0.field3249;
            int var3 = class143.field2463 - arg0.field3249;
            int var4 = arg0.field3239 * 128 + arg0.method739(0) * 64;
            int var5 = arg0.field3207 * 128 + arg0.method739(0) * 64;
            int var6 = arg0.field3242 * 128 + arg0.method739(0) * 64;
            int var7 = arg0.field3253 * 128 + arg0.method739(arg1 + 24772) * 64;
            arg0.field3218 = ((var2 - var3) * var5 + var3 * var7) / var2;
            arg0.field3259 = ((var2 - var3) * var4 + var3 * var6) / var2;
        }
        if (arg1 != -24772) {
            method1661((byte) -49);
        }
        arg0.field3231 = 0;
        if (arg0.field3258 == 0) {
            arg0.field3206 = 1024;
        }
        if (arg0.field3258 == 1) {
            arg0.field3206 = 1536;
        }
        field3807++;
        if (arg0.field3258 == 2) {
            arg0.field3206 = 0;
        }
        if (arg0.field3258 == 3) {
            arg0.field3206 = 512;
        }
        arg0.field3274 = arg0.field3206;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)V", line = 658)
    public static void method1663(boolean arg0) {
        if (arg0) {
            field3812 = (class203) null;
        }
        field3817 = null;
        field3812 = null;
        field3815 = null;
        field3816 = null;
        field3814 = (byte[][]) null;
    }
}
