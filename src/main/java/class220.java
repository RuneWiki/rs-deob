import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class220 {

    @OriginalMember(owner = "client!am", name = "k", descriptor = "I")
    public int field3088;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "I")
    public int field3086;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "I")
    public int field3083;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "I")
    public int field3082;

    @OriginalMember(owner = "client!am", name = "m", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!am", name = "l", descriptor = "I")
    public static int field3089;

    static {
        new class375("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
        field3090 = 2;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/lang/String;I)J", line = 3)
    public static final long method1486(String arg0, int arg1) {
        field3084++;
        long var2 = 0L;
        if (arg1 != -48) {
            method1486(null, 39);
        }
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (var6 - 64);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (var6 - 96);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIZ)V", line = 48)
    public static final void method1487(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3089++;
        if (!arg4) {
            return;
        }
        if (class442.field6565 == 1) {
            class129.field1814[class528.field7799 / 100].method1332(class154.field2260 - 8, class515.field7636 + -8);
        }
        if (class442.field6565 == 2) {
            class129.field1814[(class528.field7799 / 100) + 4].method1332(class154.field2260 - 8, class515.field7636 + -8);
        }
        class427.method2564(!arg4);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)[Ldl;", line = 72)
    public static final class48[] method1488(boolean arg0) {
        field3081++;
        return arg0 ? null : new class48[] { class186.field2617, class170.field2468, class430.field6387 };
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lj;III[Z)V", line = 85)
    public static final void method1489(class229 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class455.field6683 == class187.field2632) {
            return;
        }
        int var5 = class204.field2871[arg1].method853(arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class206 var7 = class204.field2871[var6];
                if (var7 != null) {
                    var7.method855(arg0, arg2, var5 - var7.method853(arg2, arg3), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IB)Lam;", line = 115)
    public final class220 method1490(int arg0, byte arg1) {
        field3079++;
        if (arg1 != -71) {
            method1491(true, (byte) 87, 31, -47, -89);
        }
        return new class220(this.field3082, arg0, this.field3088, this.field3083);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ZBIII)V", line = 127)
    public static final void method1491(boolean arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 <= 73) {
            field3090 = -112;
        }
        field3085++;
        if (class109.method719((byte) -118, arg3)) {
            class332.method2140(true, -1, class59.field791[arg3], arg4, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BZZ)V", line = 142)
    public static final void method1492(byte arg0, boolean arg1, boolean arg2) {
        if (arg2) {
            class183.field2585++;
            class5.method47(106);
        }
        field3080++;
        if (arg0 != -125) {
            field3090 = 109;
        }
        if (arg1) {
            class445.field6610++;
            class307.method1976(1);
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(Z)V", line = 164)
    public static final void method1493(boolean arg0) {
        if (!arg0) {
            field3090 = -69;
        }
        class94.field1372 = null;
        class396.field6018 = null;
        class62.field888 = null;
        class192.field2714 = null;
        class138.field2006 = null;
        class170.field2471 = null;
        class408.field6158 = null;
        class487.field7142 = null;
        field3087++;
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(IIII)V", line = 189)
    public class220(int arg0, int arg1, int arg2, int arg3) {
        this.field3088 = arg2;
        this.field3086 = arg1;
        this.field3083 = arg3;
        this.field3082 = arg0;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V", line = 207)
    public static final void method1494(byte arg0) {
        field3078++;
        class423.field6309.method659(111);
        class398.field6048.method1693((byte) 125);
        class75.field1012.method3031(107);
        class56.field755.method2038(-78);
        class410.field6175.method1219(true);
        class84.field1154.method2444(36);
        class260.field3621.method1931(false);
        class275.field3826.method105(false);
        class144.field2075.method647(-82);
        class513.field7614.method104((byte) 121);
        class186.field2620.method2680((byte) -124);
        class471.field6878.method322(73);
        class237.field3377.method355(true);
        class525.field7770.method266(false);
        class209.field2960.method3086((byte) -82);
        class296.field4391.method388(35);
        class496.field7258.method1675(true);
        class64.field896.method2772(-8206);
        class31.field473.method680((byte) 109);
        class128.field1812.method2662(-1008);
        class403.method2472(-13354);
        class333.method2142(false);
        class201.method1399(30487);
        if (class74.field999 != class140.field2031) {
            for (int var1 = 0; var1 < class485.field7124.length; var1++) {
                class485.field7124[var1] = null;
            }
            class491.field7172 = 0;
        }
        class33.method247(-127);
        class433.method2600(-1);
        class444.method2676((byte) 100);
        class181.method1296(-1);
        class382.method2370(0);
        if (arg0 >= -126) {
            method1488(false);
        }
        class291.field4339.method1015((byte) 114);
        class337.field5242.method1085();
        class193.field2736.method2214((byte) -109);
        class425.method2559(128);
        class339.field5360.method2625(-1);
        class512.field7606.method2625(-1);
        class338.field5355.method2625(-1);
        class486.field7135.method2625(-1);
        class29.field459.method2625(-1);
        class255.field3538.method2625(-1);
        class438.field6532.method2625(-1);
        class274.field3819.method2625(-1);
        class113.field1576.method2625(-1);
        class504.field7527.method2625(-1);
        class59.field790.method2625(-1);
        class21.field335.method2625(-1);
        class501.field7486.method2625(-1);
        class119.field1677.method2625(-1);
        class394.field5985.method2625(-1);
        class48.field675.method2625(-1);
        class359.field5553.method2625(-1);
        class354.field5499.method2625(-1);
        class261.field3633.method2625(-1);
        class498.field7275.method2625(-1);
        class99.field1427.method2625(-1);
        class508.field7553.method2625(-1);
        class391.field5943.method2625(-1);
        class149.field2158.method2625(-1);
        class265.field3705.method2625(-1);
        class150.field2169.method2625(-1);
        class33.field522.method2625(-1);
        class86.field1176.method2625(-1);
        class127.field1806.method2625(-1);
        class251.field3477.method2625(-1);
        class224.field3158.method1015((byte) 105);
        class302.field4450.method1015((byte) 121);
        class209.field2947.method1015((byte) 103);
        class130.field1894.method1015((byte) 99);
    }
}
