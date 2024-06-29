import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class184 {

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "I")
    public static int field2908 = 0;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
    public static int field2909 = 0;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "I")
    public static int field2907 = -2;

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "I")
    public static int field2913 = 0;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IZLnk;)V", line = 9)
    public static final void method1363(int arg0, boolean arg1, class326 arg2) {
        field2910++;
        if (class73.field1058 || arg1) {
            int var3 = class215.field3300;
            int var4 = var3 * 956 / 503;
            class279.field4329.method132((class151.field2281 - var4) / 2, 0, var4, var3);
            class111.field1679.method322(class151.field2281 / 2 - (class111.field1679.field5047 / 2), 18);
        }
        arg2.method2265(class43.field613, class151.field2281 / 2, class215.field3300 / 2 - 26, 16777215, -1);
        int var5 = class215.field3300 / 2 - 18;
        if (class73.field1058) {
            class175.method1320(class151.field2281 / 2 - 152, var5, 304, 34, 9179409);
            class175.method1320(class151.field2281 / 2 - 151, var5 + 1, 302, 32, 0);
            class175.method1322(class151.field2281 / 2 - 150, var5 + 2, class167.field2710 * 3, 30, 9179409);
            class175.method1322(class151.field2281 / 2 + class167.field2710 * 3 - 150, var5 + 2, 300 - class167.field2710 * 3, 30, 0);
        } else {
            class287.method1981(class151.field2281 / 2 - 152, var5, 304, 34, 9179409);
            class287.method1981(class151.field2281 / 2 - 151, var5 + 1, 302, 32, 0);
            class287.method1987(class151.field2281 / 2 - 150, var5 + 2, class167.field2710 * 3, 30, 9179409);
            class287.method1987(class151.field2281 / 2 + (class167.field2710 * 3) - 150, var5 - -2, 300 - (class167.field2710 * 3), 30, 0);
        }
        arg2.method2265(class327.field5056, class151.field2281 / 2, class215.field3300 / 2 + 4, 16777215, -1);
        if (arg0 != -18671) {
            method1365(false, (class6) null);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(BI)V", line = 53)
    public static final void method1364(byte arg0, int arg1) {
        if (arg0 != 119) {
            method1364((byte) 9, -67);
        }
        field2905++;
        class188 var2 = class147.method1111(-93, arg1, 4);
        var2.method1393((byte) -100);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZLvl;)V", line = 65)
    public static final void method1365(boolean arg0, class6 arg1) {
        field2904++;
        class102.field1482 = 3;
        class197.method1437(-53, true);
        class67.field972 = true;
        class122.field1874 = true;
        class320.field4958 = true;
        class134.field2036 = true;
        class284.field4430 = true;
        class71.field1022 = 127;
        class318.field4915 = true;
        class255.field3884 = true;
        class322.field4976 = true;
        class248.field3745 = 0;
        class309.field4812 = true;
        class142.field2190 = 0;
        class165.field2674 = 2;
        class169.field2735 = 0;
        class258.field3983 = true;
        class311.field4833 = 127;
        class59.field783 = 255;
        class55 var2 = null;
        class25.field272 = 0;
        class267.field4149 = true;
        if (class245.field3715 >= 96) {
            class249.method1700(2);
        } else {
            class249.method1700(0);
        }
        class245.field3705 = 0;
        class7.field112 = false;
        class305.field4698 = true;
        class235.field3578 = false;
        class216.field3321 = 0;
        class146.field2232 = 0;
        class152.field2305 = arg0;
        try {
            class208 var3 = arg1.method64("runescape", -125);
            while (var3.field3185 == 0) {
                class324.method2252(-24861, 1L);
            }
            if (var3.field3185 == 1) {
                var2 = (class55) var3.field3186;
                int var4 = 0;
                byte[] var5 = new byte[(int) var2.method393(29853)];
                while (var5.length > var4) {
                    int var6 = var2.method396(var5, var4, var5.length - var4, (byte) -29);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                    var4 += var6;
                }
                class261.method1834(-54, new class254(var5));
            }
        } catch (Exception var10) {
        }
        try {
            if (var2 != null) {
                var2.method395(1);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILjd;)I", line = 146)
    public static final int method1366(int arg0, class95 arg1) {
        if (arg0 != 2) {
            return 57;
        }
        int var2 = 0;
        field2911++;
        if (arg1.method707(class65.field948, (byte) 53)) {
            var2++;
        }
        if (arg1.method707(class223.field3395, (byte) 16)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IB)V", line = 177)
    public static final void method1367(int arg0, byte arg1) {
        if (arg1 != -115) {
            method1367(72, (byte) -73);
        }
        class188 var2 = class147.method1111(-61, arg0, 12);
        field2912++;
        var2.method1393((byte) -113);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)I", line = 203)
    public static final int method1368(int arg0) {
        int var1 = -35 % ((45 - arg0) / 48);
        field2906++;
        return class28.field321;
    }
}
