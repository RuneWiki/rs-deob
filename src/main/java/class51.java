import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class51 {

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "Lja;")
    public static class62 field1172 = class30.method243(43, "Ihr Spielkonto wird bereits benutzt)3");

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "Lja;")
    public static class62 field1174 = class30.method243(43, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "Lja;")
    private static class62 field1176 = class30.method243(43, "wave:");

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "Lja;")
    private static class62 field1179 = class30.method243(43, "Loading textures )2 ");

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "Lja;")
    public static class62 field1175 = class30.method243(43, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "Z")
    public static boolean field1169 = false;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "Lja;")
    public static class62 field1170 = field1176;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "Lja;")
    public static class62 field1177 = class30.method243(43, "und Ihr Passwort ein)3");

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "Z")
    public static boolean field1173 = false;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "Lja;")
    public static class62 field1184 = field1176;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "Z")
    public static boolean field1181 = false;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "Lja;")
    public static class62 field1185 = field1179;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "Lpd;")
    public static class108 field1171;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lhe;Z)Lja;")
    public static final class62 method354(class54 arg0, boolean arg1) {
        field1182++;
        if (class79.method627(-106, class22.method171(arg0, (byte) -118)) == 0) {
            return null;
        }
        if (!arg1) {
            field1185 = null;
        }
        if (arg0.field1246 == null || arg0.field1246.method464((byte) 120).method460((byte) 38) == 0) {
            return class77.field1900 ? class8.field228 : null;
        } else {
            return arg0.field1246;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
    public static final void method355(int arg0) {
        field1183++;
        for (int var1 = arg0; var1 < class34.field814; var1++) {
            int var2 = class38.field894[var1];
            class115 var3 = class52.field1200[var2];
            int var4 = class38.field879.method1025(arg0 + 255);
            if ((var4 & 0x40) != 0) {
                var4 += class38.field879.method1025(255) << 8;
            }
            client.method161(var4, var3, true, var2);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILpd;)V")
    public static final void method356(int arg0, class108 arg1) {
        field1178++;
        if (arg0 == 0) {
            class57.field1430 = arg1;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
    public static void method357(byte arg0) {
        field1177 = null;
        field1172 = null;
        if (arg0 <= 17) {
            return;
        }
        field1179 = null;
        field1176 = null;
        field1171 = null;
        field1175 = null;
        field1185 = null;
        field1184 = null;
        field1174 = null;
        field1170 = null;
    }
}
