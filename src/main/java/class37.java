import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class37 {

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "Lrd;")
    private static class117 field1067 = class95.method812("From", (byte) 8);

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "Lrd;")
    public static class117 field1071 = class95.method812("Bitte starten Sie eine Mitgliedschaft", (byte) 8);

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "Lrd;")
    public static class117 field1080 = class95.method812(" zuerst von Ihrer Ignorieren)2Liste(Q", (byte) 8);

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "Lrd;")
    public static class117 field1074 = class95.method812("Verbindung konnte nicht hergestellt werden)3", (byte) 8);

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "Lrd;")
    public static class117 field1069 = class95.method812(",Zffentlicher Chat", (byte) 8);

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "Lrd;")
    public static class117 field1085 = null;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "Lrd;")
    private static class117 field1081 = class95.method812(" ", (byte) 8);

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "Lrd;")
    public static class117 field1086 = field1067;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "Lrd;")
    public static class117 field1070 = field1081;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public int field1072;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    public int field1076;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
    public int field1082;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
    public int field1084;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "I")
    public int field1089;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "Lcd;")
    public static class19 field1079;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "Lga;")
    public static class44 field1068;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "Lid;")
    public class60 field1075;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BLge;)V")
    public static final void method450(byte arg0, class47 arg1) {
        if (arg0 != 84) {
            field1074 = null;
        }
        field1078++;
        class53.field1524 = arg1;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lge;III)[Ll;")
    public static final class76[] method451(class47 arg0, int arg1, int arg2, int arg3) {
        field1077++;
        if (class90.method790(arg1, arg0, 16711680, arg3)) {
            if (arg2 != -1) {
                field1086 = null;
            }
            return class144.method1152((byte) 122);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
    public static void method452(int arg0) {
        field1074 = null;
        if (arg0 != 1239) {
            field1070 = null;
        }
        field1085 = null;
        field1067 = null;
        field1079 = null;
        field1080 = null;
        field1068 = null;
        field1086 = null;
        field1071 = null;
        field1070 = null;
        field1069 = null;
        field1081 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIILbf;IIB)V")
    public static final void method453(int arg0, int arg1, int arg2, int arg3, class14 arg4, int arg5, int arg6, byte arg7) {
        if (arg0 >= 0 && arg0 < 104 && arg1 >= 0 && arg1 < 104) {
            class124.field3002[arg2][arg0][arg1] = 0;
            while (true) {
                int var8 = arg4.method153(true);
                if (var8 == 0) {
                    if (arg2 == 0) {
                        class14.field272[0][arg0][arg1] = -class67.method662(arg1 + arg5 + 556238, arg0 + arg3 + 932731, (byte) -112) * 8;
                    } else {
                        class14.field272[arg2][arg0][arg1] = class14.field272[arg2 - 1][arg0][arg1] - 240;
                    }
                    break;
                }
                if (var8 == 1) {
                    int var9 = arg4.method153(true);
                    if (var9 == 1) {
                        var9 = 0;
                    }
                    if (arg2 == 0) {
                        class14.field272[0][arg0][arg1] = -var9 * 8;
                    } else {
                        class14.field272[arg2][arg0][arg1] = class14.field272[arg2 - 1][arg0][arg1] - var9 * 8;
                    }
                    break;
                }
                if (var8 <= 49) {
                    class73.field2049[arg2][arg0][arg1] = arg4.method129((byte) 40);
                    class67.field1899[arg2][arg0][arg1] = (byte) ((var8 - 2) / 4);
                    class94.field2350[arg2][arg0][arg1] = (byte) class66.method660(3, arg6 + var8 - 2);
                } else if (var8 <= 81) {
                    class124.field3002[arg2][arg0][arg1] = (byte) (var8 - 49);
                } else {
                    class49.field1412[arg2][arg0][arg1] = (byte) (var8 - 81);
                }
            }
        } else {
            while (true) {
                int var10 = arg4.method153(true);
                if (var10 == 0) {
                    break;
                }
                if (var10 == 1) {
                    arg4.method153(true);
                    break;
                }
                if (var10 <= 49) {
                    arg4.method153(true);
                }
            }
        }
        if (arg7 != 44) {
            method451(null, 99, -87, 124);
        }
        field1087++;
    }
}
