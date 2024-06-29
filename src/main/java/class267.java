import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class267 {

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public static int field4360 = 0;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "I")
    public static int field4371 = 0;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public static int field4364 = -1;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "Ljava/lang/String;")
    public static String field4374 = "Loaded sprites";

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    public int field4366;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "I")
    public int field4367;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "I")
    public int field4369;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "I")
    public int field4373;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "J")
    public long field4372;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "Lml;")
    public class152 field4359;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "Lml;")
    public class152 field4361;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "Lml;")
    public class152 field4362;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "Lme;")
    public static class210 field4363;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I[[I)V", line = 6)
    public static final void method1870(int arg0, int[][] arg1) {
        class232.field3799 = arg1;
        if (arg0 != 32332) {
            field4364 = 39;
        }
        field4358++;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V", line = 24)
    public static final void method1871(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class209 var20 = new class209(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class353.field5644[var21][arg1][arg2] == null) {
                    class353.field5644[var21][arg1][arg2] = new class312(var21, arg1, arg2);
                }
            }
            class353.field5644[arg0][arg1][arg2].field5087 = var20;
        } else if (arg3 == 1) {
            class209 var22 = new class209(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class353.field5644[var23][arg1][arg2] == null) {
                    class353.field5644[var23][arg1][arg2] = new class312(var23, arg1, arg2);
                }
            }
            class353.field5644[arg0][arg1][arg2].field5087 = var22;
        } else {
            class165 var24 = new class165(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class353.field5644[var25][arg1][arg2] == null) {
                    class353.field5644[var25][arg1][arg2] = new class312(var25, arg1, arg2);
                }
            }
            class353.field5644[arg0][arg1][arg2].field5094 = var24;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V", line = 84)
    public static void method1872(int arg0) {
        field4374 = null;
        if (arg0 >= -24) {
            field4371 = -126;
        }
        field4363 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BZ)V", line = 96)
    public static final void method1873(byte arg0, boolean arg1) {
        if (arg1) {
            if (class88.field1566 != -1) {
                class342.method2415(class88.field1566, -111);
            }
            for (class355 var2 = (class355) class34.field758.method2345((byte) 35); var2 != null; var2 = (class355) class34.field758.method2336(-75)) {
                class6.method44(var2, true, (byte) -66);
            }
            class88.field1566 = -1;
            class34.field758 = new class328(8);
            class298.method2135(arg0 ^ 0x4D48B64A);
            class88.field1566 = class345.field5508;
            class316.method2278(false, 0);
            class264.method1855(91);
            class92.method702(2000000, class88.field1566);
        }
        field4357++;
        class229.field3756 = -1;
        class202.method1384((byte) -126, class151.field2568);
        class96.field1750 = new class98();
        if (arg0 != 122) {
            method1873((byte) -89, false);
        }
        class96.field1750.field199 = 3000;
        class96.field1750.field213 = 3000;
        if (!class241.field4016 && class141.field2383 == 0) {
            class145.method987(true, class99.field1828);
            class311.method2260(10, arg0 ^ 0xFFFFB222);
            return;
        }
        if (class69.field1280 == 2) {
            class223.field3693 = class358.field5699 << 7;
            class16.field462 = class253.field4163 << 7;
        } else {
            class314.method2272(23549);
        }
        if (class241.field4016) {
            class215.method1500(arg0 ^ 0xFFFFFFE2);
        }
        class351.method2502((byte) -110);
        class311.method2260(28, -19880);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IB)Z", line = 156)
    public static final boolean method1874(int arg0, byte arg1) {
        field4368++;
        if (class232.field3797[arg0]) {
            return true;
        }
        if (arg1 != 12) {
            method1874(110, (byte) -40);
        }
        if (!class198.field3319.method1399(arg0, 0)) {
            return false;
        }
        int var2 = class198.field3319.method1417(true, arg0);
        if (var2 == 0) {
            class232.field3797[arg0] = true;
            return true;
        }
        if (class178.field2938[arg0] == null) {
            class178.field2938[arg0] = new class181[var2];
        }
        for (int var3 = 0; var3 < var2; var3++) {
            if (class178.field2938[arg0][var3] == null) {
                byte[] var4 = class198.field3319.method1404(arg0, var3, (byte) -100);
                if (var4 != null) {
                    class181 var5 = class178.field2938[arg0][var3] = new class181();
                    var5.field3103 = (arg0 << 16) + var3;
                    if (var4[0] == -1) {
                        var5.method1278(new class146(var4), -24027);
                    } else {
                        var5.method1270((byte) 66, new class146(var4));
                    }
                }
            }
        }
        class232.field3797[arg0] = true;
        return true;
    }
}
