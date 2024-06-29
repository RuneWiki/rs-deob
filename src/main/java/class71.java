import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class71 extends class42 {

    @OriginalMember(owner = "client!rv", name = "A", descriptor = "[I")
    public static int[] field1066 = new int[4096];

    @OriginalMember(owner = "client!rv", name = "L", descriptor = "I")
    public static int field1077 = 100;

    @OriginalMember(owner = "client!rv", name = "K", descriptor = "[Ljava/lang/String;")
    public static String[] field1076 = new String[200];

    @OriginalMember(owner = "client!rv", name = "P", descriptor = "[Ljava/lang/String;")
    public static String[] field1081 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!rv", name = "G", descriptor = "Lcr;")
    public static class403 field1072 = null;

    @OriginalMember(owner = "client!rv", name = "N", descriptor = "[I")
    public static int[] field1079 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!rv", name = "X", descriptor = "I")
    public static int field1089 = 0;

    @OriginalMember(owner = "client!rv", name = "n", descriptor = "I")
    public int field1053;

    @OriginalMember(owner = "client!rv", name = "o", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!rv", name = "p", descriptor = "I")
    public int field1055;

    @OriginalMember(owner = "client!rv", name = "q", descriptor = "I")
    public int field1056;

    @OriginalMember(owner = "client!rv", name = "r", descriptor = "I")
    public int field1057;

    @OriginalMember(owner = "client!rv", name = "s", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!rv", name = "t", descriptor = "I")
    public int field1059;

    @OriginalMember(owner = "client!rv", name = "u", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!rv", name = "v", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!rv", name = "w", descriptor = "I")
    public int field1062;

    @OriginalMember(owner = "client!rv", name = "x", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!rv", name = "y", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!rv", name = "z", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!rv", name = "B", descriptor = "I")
    public int field1067;

    @OriginalMember(owner = "client!rv", name = "C", descriptor = "I")
    public int field1068;

    @OriginalMember(owner = "client!rv", name = "D", descriptor = "I")
    public int field1069;

    @OriginalMember(owner = "client!rv", name = "E", descriptor = "I")
    public int field1070;

    @OriginalMember(owner = "client!rv", name = "I", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!rv", name = "J", descriptor = "I")
    public int field1075;

    @OriginalMember(owner = "client!rv", name = "M", descriptor = "I")
    public int field1078;

    @OriginalMember(owner = "client!rv", name = "O", descriptor = "I")
    public int field1080;

    @OriginalMember(owner = "client!rv", name = "R", descriptor = "I")
    public int field1083;

    @OriginalMember(owner = "client!rv", name = "T", descriptor = "I")
    public int field1085;

    @OriginalMember(owner = "client!rv", name = "U", descriptor = "I")
    public int field1086;

    @OriginalMember(owner = "client!rv", name = "W", descriptor = "I")
    public int field1088;

    @OriginalMember(owner = "client!rv", name = "F", descriptor = "Lat;")
    public class255 field1071;

    @OriginalMember(owner = "client!rv", name = "H", descriptor = "Luo;")
    public class404 field1073;

    @OriginalMember(owner = "client!rv", name = "Q", descriptor = "Lpc;")
    public static class473 field1082;

    @OriginalMember(owner = "client!rv", name = "S", descriptor = "Lic;")
    public class491 field1084;

    @OriginalMember(owner = "client!rv", name = "V", descriptor = "Lil;")
    public class7 field1087;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(BLpc;)V", line = 13)
    public static final void method462(byte arg0, class473 arg1) {
        field1061++;
        class484.field6734 = arg1.method2704("p11_full", true);
        class165.field2406 = arg1.method2704("p12_full", true);
        class37.field585 = arg1.method2704("b12_full", true);
        class514.field7591 = arg1.method2704("hitmarks", true);
        class347.field4680 = arg1.method2704("hitbar_default", true);
        class183.field2607 = arg1.method2704("timerbar_default", true);
        class402.field5394 = arg1.method2704("headicons_pk", true);
        class288.field3774 = arg1.method2704("headicons_prayer", true);
        class23.field414 = arg1.method2704("hint_headicons", true);
        class355.field4798 = arg1.method2704("hint_mapmarkers", true);
        class399.field5367 = arg1.method2704("mapflag", true);
        if (arg0 <= 31) {
            field1077 = -12;
        }
        class73.field1107 = arg1.method2704("cross", true);
        class431.field5900 = arg1.method2704("mapdots", true);
        class49.field764 = arg1.method2704("scrollbar", true);
        class296.field3868 = arg1.method2704("name_icons", true);
        class162.field2363 = arg1.method2704("floorshadows", true);
        class56.field878 = arg1.method2704("compass", true);
        class522.field7716 = arg1.method2704("otherlevel", true);
        class292.field3826 = arg1.method2704("hint_mapedge", true);
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)V", line = 42)
    public static void method463(int arg0) {
        field1076 = null;
        field1081 = null;
        if (arg0 == -225) {
            field1072 = null;
            field1079 = null;
            field1066 = null;
            field1082 = null;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(II)I", line = 64)
    public static final int method464(int arg0, int arg1) {
        if (arg1 != 255) {
            field1064 = 112;
        }
        field1054++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(B)V", line = 82)
    public final void method465(byte arg0) {
        this.field1087 = null;
        this.field1084 = null;
        this.field1073 = null;
        field1060++;
        this.field1071 = null;
        if (arg0 >= -18) {
            this.field1057 = 11;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(CII)C", line = 115)
    public static final char method466(char arg0, int arg1, int arg2) {
        if (arg2 <= 28) {
            return (char) 65460;
        }
        field1063++;
        if (arg0 >= 'À' && arg0 <= 'ÿ') {
            if (arg0 >= 'À' && arg0 <= 'Æ') {
                return 'A';
            }
            if (arg0 == 'Ç') {
                return 'C';
            }
            if (arg0 >= 'È' && arg0 <= 'Ë') {
                return 'E';
            }
            if (arg0 >= 'Ì' && arg0 <= 'Ï') {
                return 'I';
            }
            if (arg0 == 'Ñ' && arg1 != 0) {
                return 'N';
            }
            if (arg0 >= 'Ò' && arg0 <= 'Ö') {
                return 'O';
            }
            if (arg0 >= 'Ù' && arg0 <= 'Ü') {
                return 'U';
            }
            if (arg0 == 'Ý') {
                return 'Y';
            }
            if (arg0 == 'ß') {
                return 's';
            }
            if (arg0 >= 'à' && arg0 <= 'æ') {
                return 'a';
            }
            if (arg0 == 'ç') {
                return 'c';
            }
            if (arg0 >= 'è' && arg0 <= 'ë') {
                return 'e';
            }
            if (arg0 >= 'ì' && arg0 <= 'ï') {
                return 'i';
            }
            if (arg0 == 'ñ' && arg1 != 0) {
                return 'n';
            }
            if (arg0 >= 'ò' && arg0 <= 'ö') {
                return 'o';
            }
            if (arg0 >= 'ù' && arg0 <= 'ü') {
                return 'u';
            }
            if (arg0 == 'ý' || arg0 == 'ÿ') {
                return 'y';
            }
        }
        if (arg0 == 'Œ') {
            return 'O';
        } else if (arg0 == 'œ') {
            return 'o';
        } else if (arg0 == 'Ÿ') {
            return 'Y';
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "(B)Lkl;", line = 199)
    public static final class54 method467(byte arg0) {
        field1065++;
        if (arg0 != 89) {
            method467((byte) -88);
        }
        return class6.field161;
    }

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "(I)[Lfr;", line = 217)
    public static final class282[] method468(int arg0) {
        field1074++;
        if (arg0 > -27) {
            field1076 = null;
        }
        return new class282[] { class153.field2232, class499.field6899, class299.field3958 };
    }
}
