import java.io.DataInputStream;
import java.net.URL;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class84 {

    @OriginalMember(owner = "client!o", name = "a", descriptor = "Lv;")
    public static class122 field2174 = class55.method425(-61, "gelb:");

    @OriginalMember(owner = "client!o", name = "d", descriptor = "Lv;")
    public static class122 field2177 = class55.method425(-84, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public static int field2176 = 0;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "Lv;")
    private static class122 field2178 = class55.method425(-116, "Bad session id)3");

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public static int field2184 = 0;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "Lv;")
    public static class122 field2179 = class55.method425(-100, "Texturen geladen)3");

    @OriginalMember(owner = "client!o", name = "g", descriptor = "[I")
    public static int[] field2180 = new int[256];

    @OriginalMember(owner = "client!o", name = "n", descriptor = "I")
    public static int field2187 = 0;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "Lv;")
    public static class122 field2190 = field2178;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "Lv;")
    private static class122 field2175 = class55.method425(-113, "Hidden");

    @OriginalMember(owner = "client!o", name = "p", descriptor = "I")
    public static int field2189 = -1;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "Lv;")
    public static class122 field2182 = field2175;

    @OriginalMember(owner = "client!o", name = "r", descriptor = "[I")
    public static int[] field2191 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!o", name = "j", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2183 = new CRC32();

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "[I")
    public static int[] field2186;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "[I")
    public static int[] field2192;

    @OriginalMember(owner = "client!o", name = "t", descriptor = "[[[I")
    public static int[][][] field2193;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IZ)V", line = 12)
    public static final void method676(int arg0, boolean arg1) {
        field2185++;
        if (arg1 || class66.field1697 == null) {
            return;
        }
        if (class28.field723 == 0) {
            if (class38.field992 < 0) {
                return;
            }
            class38.field992 = arg0;
            class66.field1697.method754(arg0, 0, -6427);
        } else if (class14.field359 != null) {
            class70.field1827 = arg0;
            return;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V", line = 47)
    public static void method677(byte arg0) {
        field2193 = null;
        field2182 = null;
        field2192 = null;
        field2175 = null;
        field2180 = null;
        field2179 = null;
        field2186 = null;
        field2177 = null;
        field2190 = null;
        field2174 = null;
        if (arg0 != 39) {
            field2183 = null;
        }
        field2191 = null;
        field2178 = null;
        field2183 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V", line = 121)
    public static final void method678(String arg0, Throwable arg1, int arg2) {
        field2188++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class64.method522(1, arg1);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            class98 var8 = class81.field2125.method450(new URL(class81.field2125.field1497.getCodeBase(), "clienterror.ws?c=" + class83.field2163 + "&u=" + class64.field1673 + "&v1=" + class57.field1506 + "&v2=" + class57.field1493 + "&e=" + var7), -15028);
            while (var8.field2454 == 0) {
                class30.method282((byte) -87, 1L);
            }
            if (var8.field2454 == arg2) {
                DataInputStream var9 = (DataInputStream) var8.field2456;
                var9.read();
                var9.close();
            }
        } catch (Exception var10) {
        }
    }
}
