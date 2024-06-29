import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class46 {

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "Lpd;")
    public static class94 field1122 = class28.method249(49, "@cr2@");

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "Lpd;")
    public static class94 field1134 = class28.method249(70, "Lade Spiel)2Fenster )2 ");

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "Lpd;")
    private static class94 field1131 = class28.method249(94, "purple:");

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "Lpd;")
    public static class94 field1136 = class28.method249(59, "::fpsoff");

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "Lpd;")
    public static class94 field1137 = class28.method249(120, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "Lpd;")
    public static class94 field1133 = field1131;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "Lpd;")
    public static class94 field1128 = class28.method249(104, "Lade Eingabe)2Steuerungsprogramm)3)3)3");

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "Lpd;")
    public static class94 field1123 = class28.method249(-117, "zur-Uck auf die RuneScape)2Webseite gehen");

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
    public static int field1138 = 78;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "Lpd;")
    private static class94 field1139 = class28.method249(-125, "Connecting to server)3)3)3");

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "Lpd;")
    public static class94 field1126 = field1139;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
    public static int field1141 = 10;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "Ls;")
    public static class111 field1135;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "Lad;")
    public static class5 field1140;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V", line = 9)
    public static final void method342(byte arg0) {
        field1129++;
        if (arg0 != -49) {
            field1122 = null;
        }
        try {
            Graphics var1 = class128.field3218.getGraphics();
            class52.field1305.method498(4, 0, (byte) -12, var1);
            class13.field319.method498(357, 0, (byte) -12, var1);
            class105.field2622.method498(4, 722, (byte) -12, var1);
            class14.field356.method498(205, 743, (byte) -12, var1);
            class40.field1026.method498(0, 0, (byte) -12, var1);
            class38.field986.method498(4, 516, (byte) -12, var1);
            class81.field2061.method498(205, 516, (byte) -12, var1);
            class108.field2689.method498(357, 496, (byte) -12, var1);
            class55.field1402.method498(338, 0, (byte) -12, var1);
        } catch (Exception var2) {
            class128.field3218.repaint();
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V", line = 54)
    public static void method343(int arg0) {
        field1137 = null;
        field1135 = null;
        if (arg0 < 72) {
            field1134 = null;
        }
        field1139 = null;
        field1134 = null;
        field1140 = null;
        field1136 = null;
        field1123 = null;
        field1126 = null;
        field1131 = null;
        field1128 = null;
        field1133 = null;
        field1122 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "([BIIZI)V", line = 92)
    public static final void method344(byte[] arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field1125++;
        if (class39.field1017 == null) {
            return;
        }
        if (class86.field2194 >= arg4) {
            class103.field2594 = arg1;
            if (class86.field2194 == 0) {
                class4.field93 = 1;
            } else {
                int var5 = class2.method15(class86.field2194, false);
                int var6 = var5 - client.field490;
                class4.field93 = (var6 + 3600) / arg1;
                if (class4.field93 < 1) {
                    class4.field93 = 1;
                }
            }
            class54.field1365 = arg0;
            class119.field2968 = arg2;
            class86.field2193 = arg3;
        } else if (class4.field93 == 0) {
            class113.method839(arg0, arg3, arg2, 31);
        } else {
            class86.field2193 = arg3;
            class54.field1365 = arg0;
            class119.field2968 = arg2;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ls;ILs;)V", line = 136)
    public static final void method345(class111 arg0, int arg1, class111 arg2) {
        class135.field3310 = arg0;
        field1127++;
        class122.field3079 = arg2;
        class136.field3344 = class135.field3310.method825(true, 3);
        if (arg1 >= -84) {
            field1136 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V", line = 170)
    public static final void method346(int arg0) {
        class6.field111 = true;
        field1130++;
        class39.method296(false);
        if (arg0 != -22711) {
            return;
        }
        if (class45.field1108 != -1) {
            boolean var1 = class113.method838(0, 190, 0, arg0 + 22757, 261, class45.field1108, 1);
            if (!var1) {
                class135.field3323 = true;
            }
        } else if (class42.field1065[class92.field2361] != -1) {
            boolean var2 = class113.method838(0, 190, 0, 17, 261, class42.field1065[class92.field2361], 1);
            if (!var2) {
                class135.field3323 = true;
            }
        }
        if (class62.field1516 && class40.field1035 == 1) {
            if (class67.field1649 == 1) {
                class99.method747(true);
            } else {
                class4.method27((byte) -90);
            }
        }
        class19.method149(false);
    }
}
