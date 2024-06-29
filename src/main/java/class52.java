import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class52 {

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "[Lpd;")
    public static class108[] field1067 = new class108[32768];

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "[[B")
    public static byte[][] field1070 = new byte[1000][];

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "Lpe;")
    public static class109 field1071 = class141.method1120("<col=ff9040>", 0);

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "Lbc;")
    public static class11 field1066 = new class11(30);

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "Lpe;")
    private static class109 field1072 = class141.method1120("Your friend list is full)3 Max of 100 for free users)1 and 200 for members", 0);

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public static int field1075 = 0;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "Lpe;")
    private static class109 field1078 = class141.method1120("wishes to trade with you)3", 0);

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "Lpe;")
    public static class109 field1077 = class141.method1120("Ihr Spielkonto wird bereits benutzt)3", 0);

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "Lpe;")
    public static class109 field1081 = field1078;

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "Lpe;")
    public static class109 field1084 = field1072;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "Lpe;")
    public static class109 field1080 = class141.method1120("auf der Hautpseite)3", 0);

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "Lpe;")
    public static class109 field1082 = class141.method1120("Lade Benutzeroberfl-=che )2 ", 0);

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "[S")
    public static short[] field1083;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
    public static final void method431(byte arg0) {
        field1068++;
        for (int var1 = 0; var1 < class131.field2885; var1++) {
            int var2 = class139.field3035[var1];
            class108 var3 = field1067[var2];
            if (var3 != null) {
                class8.method79(var3.field2265.field2490, 10637, var3);
            }
        }
        if (arg0 != 34) {
            method432((byte) -25);
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V")
    public static void method432(byte arg0) {
        field1066 = null;
        field1077 = null;
        field1067 = null;
        field1082 = null;
        field1071 = null;
        field1081 = null;
        field1078 = null;
        field1070 = null;
        field1080 = null;
        if (arg0 > -81) {
            field1082 = null;
        }
        field1084 = null;
        field1083 = null;
        field1072 = null;
    }
}
