import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class117 {

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "[I")
    public static int[] field1986 = new int[5];

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "D")
    public static double field1988 = -1.0D;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1995 = null;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "Ljj;")
    public static class134 field1990;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "Z")
    public static boolean field1992;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IC)B")
    public static final byte method828(int arg0, char arg1) {
        int var2 = 79 / ((arg0 + 5) / 46);
        field1989++;
        byte var3;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            var3 = (byte) arg1;
        } else if (arg1 == '€') {
            var3 = -128;
        } else if (arg1 == '‚') {
            var3 = -126;
        } else if (arg1 == 'ƒ') {
            var3 = -125;
        } else if (arg1 == '„') {
            var3 = -124;
        } else if (arg1 == '…') {
            var3 = -123;
        } else if (arg1 == '†') {
            var3 = -122;
        } else if (arg1 == '‡') {
            var3 = -121;
        } else if (arg1 == 'ˆ') {
            var3 = -120;
        } else if (arg1 == '‰') {
            var3 = -119;
        } else if (arg1 == 'Š') {
            var3 = -118;
        } else if (arg1 == '‹') {
            var3 = -117;
        } else if (arg1 == 'Œ') {
            var3 = -116;
        } else if (arg1 == 'Ž') {
            var3 = -114;
        } else if (arg1 == '‘') {
            var3 = -111;
        } else if (arg1 == '’') {
            var3 = -110;
        } else if (arg1 == '“') {
            var3 = -109;
        } else if (arg1 == '”') {
            var3 = -108;
        } else if (arg1 == '•') {
            var3 = -107;
        } else if (arg1 == '–') {
            var3 = -106;
        } else if (arg1 == '—') {
            var3 = -105;
        } else if (arg1 == '˜') {
            var3 = -104;
        } else if (arg1 == '™') {
            var3 = -103;
        } else if (arg1 == 'š') {
            var3 = -102;
        } else if (arg1 == '›') {
            var3 = -101;
        } else if (arg1 == 'œ') {
            var3 = -100;
        } else if (arg1 == 'ž') {
            var3 = -98;
        } else if (arg1 == 'Ÿ') {
            var3 = -97;
        } else {
            var3 = 63;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
    public static void method829(byte arg0) {
        field1986 = null;
        if (arg0 != 84) {
            field1990 = null;
        }
        field1995 = null;
        field1990 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)V")
    public static final void method830(int arg0, int arg1) {
        field1991++;
        class202.field3248--;
        if (class202.field3248 == arg1) {
            return;
        }
        class56.method429(class152.field2464, arg1 + 1, class152.field2464, arg1, class202.field3248 - arg1);
        class56.method429(class162.field2633, arg1 + 1, class162.field2633, arg1, class202.field3248 - arg1);
        if (arg0 > -125) {
            return;
        }
        class56.method434(class3.field36, arg1 + 1, class3.field36, arg1, class202.field3248 - arg1);
        class56.method436(class23.field291, arg1 + 1, class23.field291, arg1, class202.field3248 - arg1);
        class56.method433(class109.field1892, arg1 + 1, class109.field1892, arg1, class202.field3248 - arg1);
        class56.method434(class270.field4368, arg1 + 1, class270.field4368, arg1, class202.field3248 - arg1);
        class56.method434(class23.field284, arg1 + 1, class23.field284, arg1, class202.field3248 - arg1);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BI)V")
    public static final void method831(byte arg0, int arg1) {
        class11.field156 = 3;
        if (arg0 != 103) {
            method832(-116, 17, false, (class219) null, -42, (class219) null, false);
        }
        class144.field2330 = arg1;
        class129.field2165 = 20;
        field1987++;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIZLfd;ILfd;Z)I")
    public static final int method832(int arg0, int arg1, boolean arg2, class219 arg3, int arg4, class219 arg5, boolean arg6) {
        if (arg1 > -48) {
            field1986 = null;
        }
        field1993++;
        int var7 = class229.method1523(arg5, true, arg3, arg2, arg4);
        if (var7 != 0) {
            return arg2 ? -var7 : var7;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var8 = class229.method1523(arg5, true, arg3, arg6, arg0);
            return arg6 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)Ljava/lang/String;")
    public static final String method833(byte arg0) {
        String var1 = "www";
        if (class92.field1312 != 0) {
            var1 = "www-wtqa";
        }
        if (arg0 != -77) {
            method833((byte) 124);
        }
        String var2 = "";
        if (class236.field3762 != null) {
            var2 = "/p=" + class236.field3762;
        }
        field1985++;
        return "http://" + var1 + ".runescape.com/l=" + class261.field4147 + "/a=" + class286.field4561 + var2 + "/";
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)Lwe;")
    public static final class43 method834(boolean arg0) {
        int var1 = class263.field4168[0] * class207.field3348[0];
        field1994++;
        byte[] var2 = class168.field2726[0];
        class43 var5;
        if (class130.field2181[0]) {
            int[] var6 = new int[var1];
            byte[] var7 = class106.field1851[0];
            for (int var8 = 0; var8 < var1; var8++) {
                var6[var8] = class45.method348(class131.field2187[class204.method1369(255, var2[var8])], class204.method1369(var7[var8], 255) << 24);
            }
            var5 = new class24(class88.field1215, class64.field904, class70.field968[0], class249.field3993[0], class207.field3348[0], class263.field4168[0], var6);
        } else {
            int[] var3 = new int[var1];
            for (int var4 = 0; var4 < var1; var4++) {
                var3[var4] = class131.field2187[class204.method1369(255, var2[var4])];
            }
            var5 = new class43(class88.field1215, class64.field904, class70.field968[0], class249.field3993[0], class207.field3348[0], class263.field4168[0], var3);
        }
        if (arg0) {
            field1992 = false;
        }
        class111.method804(0);
        return var5;
    }
}
