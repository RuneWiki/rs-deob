import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class632 {

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
    public int field8747 = 0;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "I")
    public int field8753 = 0;

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "Z")
    private boolean field8755 = false;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "Ltca;")
    public static class141 field8743 = new class141(7, 2);

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
    public int field8739;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public int field8740;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    public static int field8742;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    public static int field8744;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
    private int field8746;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
    public int field8748;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
    public static int field8749;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
    public int field8750;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
    public int field8751;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "I")
    public int field8752;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "I")
    public static int field8754;

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
    public int field8756;

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "I")
    public int field8757;

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "I")
    public int field8758;

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
    public static int field8759;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "J")
    public long field8741;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "Lbj;")
    public static class479 field8745;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILio;I)V", line = 12)
    private final void method3503(int arg0, class157 arg1, int arg2) {
        if (arg0 != -31531) {
            method3505((byte) 40);
        }
        field8744++;
        if (arg2 == 1) {
            this.field8746 = arg1.method963(arg0 + 31409);
        } else if (arg2 == 2) {
            arg1.method930(255);
        } else if (arg2 == 3) {
            this.field8756 = arg1.method908(false);
            this.field8739 = arg1.method908(false);
            this.field8748 = arg1.method908(false);
        } else if (arg2 == 4) {
            this.field8757 = arg1.method930(255);
            this.field8751 = arg1.method908(false);
        } else if (arg2 == 6) {
            this.field8740 = arg1.method930(255);
        } else if (arg2 == 8) {
            this.field8753 = 1;
            return;
        } else if (arg2 == 9) {
            this.field8747 = 1;
            return;
        } else if (arg2 == 10) {
            this.field8755 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lio;Z)V", line = 73)
    public final void method3504(class157 arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        while (true) {
            int var3 = arg0.method930(255);
            if (var3 == 0) {
                field8759++;
                return;
            }
            this.method3503(-31531, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V", line = 99)
    public static void method3505(byte arg0) {
        field8745 = null;
        field8743 = null;
        if (arg0 != 15) {
            method3508((byte) -112);
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(B)V", line = 114)
    public final void method3506(byte arg0) {
        field8754++;
        this.field8752 = class240.field3177[this.field8746 << 3];
        long var2 = (long) this.field8756;
        long var4 = (long) this.field8739;
        long var6 = (long) this.field8748;
        this.field8750 = (int) Math.sqrt((double) (var2 * var2 + var4 * var4 + (var6 * var6)));
        if (this.field8751 == 0) {
            this.field8751 = 1;
        }
        if (this.field8757 == 0) {
            this.field8741 = 2147483647L;
        } else if (this.field8757 == 1) {
            this.field8741 = (this.field8750 * 8 / this.field8751);
            this.field8741 *= this.field8741;
        } else if (this.field8757 == 2) {
            this.field8741 = (this.field8750 * 8 / this.field8751);
        }
        int var8 = 80 % ((62 - arg0) / 34);
        if (this.field8755) {
            this.field8750 *= -1;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;", line = 156)
    public static final Class method3507(String arg0, int arg1) throws ClassNotFoundException {
        field8742++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else {
            if (arg1 != 0) {
                method3508((byte) -90);
            }
            if (arg0.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg0.equals("F")) {
                return Float.TYPE;
            } else if (arg0.equals("D")) {
                return Double.TYPE;
            } else if (arg0.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(B)V", line = 194)
    public static final void method3508(byte arg0) {
        field8749++;
        class208.method1319(-21306, false);
        class46.field560 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class361.field4785.length; var2++) {
            if (class245.field3207[var2] != -1 && class361.field4785[var2] == null) {
                class361.field4785[var2] = class543.field7433.method1938(0, class245.field3207[var2], -17);
                if (class361.field4785[var2] == null) {
                    var1 = false;
                    class46.field560++;
                }
            }
            if (class229.field2972[var2] != -1 && class611.field8486[var2] == null) {
                class611.field8486[var2] = class543.field7433.method1937(class581.field7947[var2], class229.field2972[var2], 0, 0);
                if (class611.field8486[var2] == null) {
                    var1 = false;
                    class46.field560++;
                }
            }
            if (class552.field7545[var2] != -1 && class297.field3929[var2] == null) {
                class297.field3929[var2] = class543.field7433.method1938(0, class552.field7545[var2], -17);
                if (class297.field3929[var2] == null) {
                    class46.field560++;
                    var1 = false;
                }
            }
            if (class311.field4201[var2] != -1 && class37.field506[var2] == null) {
                class37.field506[var2] = class543.field7433.method1938(0, class311.field4201[var2], -17);
                if (class37.field506[var2] == null) {
                    class46.field560++;
                    var1 = false;
                }
            }
            if (class502.field6923 != null && class191.field2645[var2] == null && class502.field6923[var2] != -1) {
                class191.field2645[var2] = class543.field7433.method1937(class581.field7947[var2], class502.field6923[var2], 0, 0);
                if (class191.field2645[var2] == null) {
                    var1 = false;
                    class46.field560++;
                }
            }
        }
        if (class448.field5932 == null) {
            if (class202.field2719 == null || !class688.field9713.method1943(class202.field2719.field3814 + "_staticelements", -1)) {
                class448.field5932 = new class592(0);
            } else if (class688.field9713.method1961(class202.field2719.field3814 + "_staticelements", false)) {
                class448.field5932 = class461.method2577(class414.field5431, 0, class202.field2719.field3814 + "_staticelements", class688.field9713);
            } else {
                class46.field560++;
                var1 = false;
            }
        }
        if (!var1) {
            class117.field1491 = 1;
            return;
        }
        class623.field8632 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class361.field4785.length; var4++) {
            byte[] var22 = class611.field8486[var4];
            if (var22 != null) {
                int var23 = (class126.field1760[var4] >> 8) * 64 - class125.field1745;
                int var24 = (class126.field1760[var4] & 0xFF) * 64 - class4.field23;
                if (class391.field5236 != 0) {
                    var24 = 10;
                    var23 = 10;
                }
                var3 &= class448.method2520(var23, var24, class703.field9886, var22, class431.field5789, false);
            }
            byte[] var25 = class37.field506[var4];
            if (var25 != null) {
                int var26 = (class126.field1760[var4] >> 8) * 64 - class125.field1745;
                int var27 = (class126.field1760[var4] & 0xFF) * 64 - class4.field23;
                if (class391.field5236 != 0) {
                    var27 = 10;
                    var26 = 10;
                }
                var3 &= class448.method2520(var26, var27, class703.field9886, var25, class431.field5789, false);
            }
        }
        if (!var3) {
            class117.field1491 = 2;
            return;
        }
        if (class117.field1491 != 0) {
            class591.method3268(class325.field4382, class146.field1963, true, class371.field4891.method2141(class422.field5539, true) + "<br>(100%)", class401.field5319, false);
        }
        class276.method1656(-896460184);
        class80.method430((byte) -105);
        boolean var5 = false;
        if (class146.field1963.method1135() && class602.field8408.field4322) {
            for (int var6 = 0; var6 < class361.field4785.length; var6++) {
                if (class37.field506[var6] != null || class297.field3929[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class602.field8408.field4328) {
            var7 = class323.field4360[class422.field5538];
        } else {
            var7 = class402.field5324[class422.field5538];
        }
        if (class146.field1963.method1071()) {
            var7++;
        }
        class484.method2784(class146.field1963, class233.field3104, 9, 4, class703.field9886, class431.field5789, var7, var5, class146.field1963.method1133() > 0);
        if (class303.field4023) {
            class143.method818(class399.field5300);
        } else {
            class143.method818(null);
        }
        for (int var8 = 0; var8 < 4; var8++) {
            class322.field4302[var8].method3281(0);
        }
        class641.method3546(true);
        class547.method3065((byte) 125, false);
        class324.method1881(true);
        class540.field7410 = false;
        class292.field3855 = null;
        class276.method1656(-896460184);
        System.gc();
        class208.method1319(-21306, true);
        class572.method3159((byte) 43);
        class190.field2639 = class602.field8408.method1870((byte) -127, class618.field8566);
        class586.field8102 = class602.field8408.field4322;
        class27.field401 = client.field9616 >= 96;
        class34.field489 = class602.field8408.method1868(class618.field8566, 1);
        class653.field9302 = !class602.field8408.field4340;
        class643.field8886 = class602.field8408.method3554(class618.field8566, (byte) -127) ? -1 : class32.field454;
        class629.field8712 = class15.method98((byte) 72, class618.field8566) || class602.field8408.field4319;
        int var9 = -96 / ((-arg0 - 24) / 41);
        class375.field4971 = class602.field8408.field4311;
        class327.field4403 = new class235(4, class703.field9886, class431.field5789, false);
        if (class391.field5236 == 0) {
            class346.method2063((byte) -86, class327.field4403, class361.field4785);
        } else {
            class234.method1448(class361.field4785, -538, class327.field4403);
        }
        class193.method1265((byte) 119, class703.field9886 >> 4, class431.field5789 >> 4);
        class669.method3800((byte) -82);
        if (var5) {
            class385.method2208(true);
            class257.field3369 = new class235(1, class703.field9886, class431.field5789, true);
            if (class391.field5236 == 0) {
                class346.method2063((byte) -77, class257.field3369, class297.field3929);
                class208.method1319(-21306, true);
            } else {
                class234.method1448(class297.field3929, -538, class257.field3369);
                class208.method1319(-21306, true);
            }
            class257.field3369.method468(0, 0, class327.field4403.field1034[0]);
            class257.field3369.method464(null, class146.field1963, null, (byte) 109);
            class385.method2208(false);
        }
        class327.field4403.method464(var5 ? class257.field3369.field1034 : null, class146.field1963, class322.field4302, (byte) 109);
        if (class391.field5236 == 0) {
            class208.method1319(-21306, true);
            class498.method2828(class611.field8486, 12579, class327.field4403);
            if (class191.field2645 != null) {
                class102.method569(0);
            }
        } else {
            class208.method1319(-21306, true);
            class15.method96(class611.field8486, 62523003, class327.field4403);
        }
        class80.method430((byte) -81);
        if (client.field9616 < 96) {
            class616.method3405(-110);
        }
        class208.method1319(-21306, true);
        class327.field4403.method461(-64, class146.field1963, var5 ? class446.field5914[0] : null, null);
        class327.field4403.method1459(4, false, class146.field1963);
        class208.method1319(-21306, true);
        if (var5) {
            class385.method2208(true);
            class208.method1319(-21306, true);
            if (class391.field5236 == 0) {
                class498.method2828(class37.field506, 12579, class257.field3369);
            } else {
                class15.method96(class37.field506, 62523003, class257.field3369);
            }
            class80.method430((byte) -102);
            class208.method1319(-21306, true);
            class257.field3369.method461(-64, class146.field1963, null, class454.field5981[0]);
            class257.field3369.method1459(4, true, class146.field1963);
            class208.method1319(-21306, true);
            class385.method2208(false);
        }
        class467.method2600((byte) 48);
        int var10 = class327.field4403.field3120;
        if (var10 > class298.field3942) {
            var10 = class298.field3942;
        }
        if (class298.field3942 - 1 > var10) {
            var10 = class298.field3942 - 1;
        }
        if (class602.field8408.method3554(class618.field8566, (byte) -118)) {
            class482.method2777(0);
        } else {
            class482.method2777(var10);
        }
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var20 = 0; var20 < class703.field9886; var20++) {
                for (int var21 = 0; var21 < class431.field5789; var21++) {
                    class215.method1369(-1257869271, var20, var21, var11);
                }
            }
        }
        class254.method1537((byte) 116);
        class276.method1656(-896460184);
        class291.method1728(true);
        class80.method430((byte) 95);
        class593.method3283((byte) 54);
        if (class190.field2630 != null && class163.field2346 != null && class576.field7861 == 11) {
            class158.field2273++;
            class229 var12 = class97.method550(class71.field841, false, class460.field6023);
            var12.field2971.method958(0, 1057001181);
            class307.method1805(var12, -14704);
        }
        if (class391.field5236 == 0) {
            int var13 = (class312.field4205 - (class703.field9886 >> 4)) / 8;
            int var14 = ((class703.field9886 >> 4) + class312.field4205) / 8;
            int var15 = (class523.field7257 - (class431.field5789 >> 4)) / 8;
            int var16 = (class523.field7257 + (class431.field5789 >> 4)) / 8;
            for (int var17 = var13 - 1; var17 <= (var14 + 1); var17++) {
                for (int var18 = var15 - 1; var18 <= var16 + 1; var18++) {
                    if (var17 < var13 || var14 < var17 || var15 > var18 || var18 > var16) {
                        class543.field7433.method1940((byte) 120, "m" + var17 + "_" + var18);
                        class543.field7433.method1940((byte) 120, "l" + var17 + "_" + var18);
                    }
                }
            }
        }
        if (class576.field7861 == 4) {
            class28.method182(3, 29697);
        } else if (class576.field7861 == 8) {
            class28.method182(7, 29697);
        } else {
            class28.method182(10, 29697);
            if (class163.field2346 != null) {
                class229 var19 = class97.method550(class71.field841, false, class79.field930);
                class307.method1805(var19, -14704);
            }
        }
        class519.method2946(20799);
        class276.method1656(-896460184);
        class49.method259(95);
        if (class624.field8640) {
            class592.method3278((byte) -59, "Took: " + (class529.method2982((byte) -69) - class94.field1135) + "ms");
            class624.field8640 = false;
        }
    }
}
