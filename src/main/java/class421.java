import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public abstract class class421 {

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "Ljava/lang/String;")
    public static String field6114 = "Connection lost.";

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field6118 = 0;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field6112 = 0;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field6116 = 0;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field6115 = 0;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
    public static int field6124 = 0;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field6113;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public static int field6119;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public static int field6120;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
    public static int field6122;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
    public static int field6123;

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
    public static int field6125;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "Los;")
    public static class129 field6121;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "Lir;")
    public static class185 field6117;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILir;Lir;)V", line = 4)
    public static final void method2648(int arg0, class185 arg1, class185 arg2) {
        class333.field4897 = arg2;
        field6119++;
        class353.field5234 = arg1;
        class24.field439 = class353.field5234.method1225(3, (byte) 27);
        if (arg0 > -26) {
            field6112 = -110;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V", line = 32)
    public static void method2649(byte arg0) {
        field6114 = null;
        int var1 = -106 % ((-arg0 - 85) / 39);
        field6117 = null;
        field6121 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIB)V", line = 47)
    public static final void method2650(int arg0, int arg1, byte arg2) {
        if (arg2 != 34) {
            method2651(67, (class341) null);
        }
        field6113++;
        class440 var3 = class186.method1241(0, 15, (byte) 56);
        var3.method2756(arg2 - 1369656562);
        var3.field6375 = arg0;
        var3.field6374 = arg1;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILfb;)Lrq;", line = 67)
    public static final class169 method2651(int arg0, class341 arg1) {
        field6122++;
        if (arg0 != 0) {
            field6116 = 99;
        }
        return new class169(arg1.method2212(-2), arg1.method2212(arg0 ^ 0xFFFFFFFE), arg1.method2212(-2), arg1.method2212(-2), arg1.method2212(-2), arg1.method2212(-2), arg1.method2212(arg0 - 2), arg1.method2212(-2), arg1.method2249(32767), arg1.method2233((byte) 104));
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ltj;I)V", line = 84)
    public static final void method2652(class298 arg0, int arg1) {
        field6123++;
        if (class402.field5874 < 2 && class117.field1526 == 0 && !class263.field3862) {
            return;
        }
        String var2;
        if (class117.field1526 == 1 && class402.field5874 < 2) {
            var2 = class429.field6239 + class74.field1041 + class369.field5455 + " ->";
        } else if (class263.field3862 && class402.field5874 < 2) {
            var2 = class298.field4505 + class74.field1041 + class396.field5787 + " ->";
        } else if (class396.field5779 && class277.field4063[81] && class402.field5874 > 2) {
            var2 = class84.method687((class138) class186.field2547.field3397.field6090.field6090, -1);
        } else {
            class138 var3 = (class138) class186.field2547.field3397.field6090;
            var2 = class84.method687(var3, -1);
            int[] var4 = null;
            if (class267.method1784(var3.field1777, (byte) -78)) {
                var4 = class129.method915(127, (int) var3.field1780).field2026;
            } else if (class386.method2504((byte) 126, var3.field1777)) {
                class163 var5 = class388.field5670[(int) var3.field1780];
                if (var5 != null) {
                    var4 = var5.field2206.field2596;
                }
            } else if (class246.method1608(-59, var3.field1777)) {
                if (var3.field1777 == 1011) {
                    var4 = class372.method2447((int) var3.field1780, (byte) 104).field2911;
                } else {
                    var4 = class372.method2447((int) (var3.field1780 >>> 32 & 0x7FFFFFFFL), (byte) -94).field2911;
                }
            }
            if (var4 != null) {
                var2 = var2 + class368.method2426(var4, 121);
            }
        }
        if (class402.field5874 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class402.field5874 - 2) + class278.field4084;
        }
        if (class228.field3140 != null) {
            class129 var7 = class228.field3140.method1622(8130, arg0);
            if (var7 == null) {
                var7 = class199.field2756;
            }
            var7.method911((byte) -125, class40.field619, class228.field3140.field3560, class228.field3140.field3659, class64.field966, class210.field2850, class228.field3140.field3483, class269.field3987, class228.field3140.field3531, class407.field5923, class228.field3140.field3564, class11.field194, var2, class424.field6180, class228.field3140.field3587);
            class435.method2723(class269.field3987[3], (byte) 93, class269.field3987[2], class269.field3987[1], class269.field3987[0]);
        } else if (class169.field2290 != null && class396.field5783 == 0) {
            int var6 = class199.field2756.method908(class384.field5624 + 16, class424.field6180, class11.field194, 0, class407.field5923, class27.field468 + 4, (byte) -120, 16777215, var2, class64.field966);
            class435.method2723(16, (byte) 64, var6 + class233.field3232.method2695(-1, var2), class384.field5624, class27.field468 + 4);
        }
        if (arg1 > -38) {
            method2650(26, 70, (byte) 15);
        }
    }
}
