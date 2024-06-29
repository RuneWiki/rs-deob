import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 extends class132 {

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "Ltg;")
    public static class184 field75 = class135.method812("Regeln versto-8en hat)3", 3);

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "Ltg;")
    public static class184 field78 = class135.method812("<col=ff0000>", 3);

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "Ltg;")
    private static class184 field84 = class135.method812("Jan", 3);

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "I")
    public static int field80 = 0;

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "Ltg;")
    public static class184 field87 = class135.method812("Standort", 3);

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "Ltg;")
    private static class184 field88 = class135.method812("Jul", 3);

    @OriginalMember(owner = "client!ad", name = "B", descriptor = "Ltg;")
    private static class184 field91 = class135.method812("May", 3);

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "Ltg;")
    public static class184 field90 = class135.method812("<col=ffff00>", 3);

    @OriginalMember(owner = "client!ad", name = "F", descriptor = "Ltg;")
    private static class184 field95 = class135.method812("white:", 3);

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "Ltg;")
    public static class184 field76 = field95;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "Ltg;")
    private static class184 field82 = class135.method812("Oct", 3);

    @OriginalMember(owner = "client!ad", name = "K", descriptor = "Ltg;")
    private static class184 field100 = class135.method812("Jun", 3);

    @OriginalMember(owner = "client!ad", name = "H", descriptor = "Ltg;")
    private static class184 field97 = class135.method812("Feb", 3);

    @OriginalMember(owner = "client!ad", name = "E", descriptor = "Ltg;")
    private static class184 field94 = class135.method812("Sep", 3);

    @OriginalMember(owner = "client!ad", name = "I", descriptor = "Ltg;")
    private static class184 field98 = class135.method812("Mar", 3);

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "Ltg;")
    public static class184 field89 = field95;

    @OriginalMember(owner = "client!ad", name = "N", descriptor = "Ltg;")
    private static class184 field103 = class135.method812("Dec", 3);

    @OriginalMember(owner = "client!ad", name = "O", descriptor = "Ltg;")
    private static class184 field104 = class135.method812("Nov", 3);

    @OriginalMember(owner = "client!ad", name = "P", descriptor = "Ltg;")
    private static class184 field105 = class135.method812("Aug", 3);

    @OriginalMember(owner = "client!ad", name = "S", descriptor = "Ltg;")
    private static class184 field108 = class135.method812("Apr", 3);

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "[Ltg;")
    public static class184[] field81 = new class184[] { field84, field97, field98, field108, field91, field100, field88, field105, field94, field82, field104, field103 };

    @OriginalMember(owner = "client!ad", name = "Q", descriptor = "I")
    public int field106;

    @OriginalMember(owner = "client!ad", name = "R", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
    public int field79;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!ad", name = "C", descriptor = "I")
    public int field92;

    @OriginalMember(owner = "client!ad", name = "D", descriptor = "I")
    public int field93;

    @OriginalMember(owner = "client!ad", name = "J", descriptor = "I")
    public int field99;

    @OriginalMember(owner = "client!ad", name = "L", descriptor = "Lrh;")
    public class167 field101;

    @OriginalMember(owner = "client!ad", name = "M", descriptor = "Lrh;")
    public class167 field102;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "Ltg;")
    public class184 field77;

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "[Lsc;")
    public static class171[] field86;

    @OriginalMember(owner = "client!ad", name = "G", descriptor = "[Ljava/lang/Object;")
    public Object[] field96;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)Z")
    public static final boolean method36(byte arg0, int arg1) {
        field107++;
        if (arg0 > -60) {
            method36((byte) 86, 55);
        }
        return (arg1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
    public static void method37(int arg0) {
        field108 = null;
        field78 = null;
        field91 = null;
        field100 = null;
        field103 = null;
        field95 = null;
        if (arg0 != 23127) {
            field104 = null;
        }
        field75 = null;
        field84 = null;
        field89 = null;
        field87 = null;
        field105 = null;
        field88 = null;
        field86 = null;
        field94 = null;
        field90 = null;
        field98 = null;
        field104 = null;
        field76 = null;
        field97 = null;
        field82 = null;
        field81 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Throwable;)V")
    public static final void method38(byte arg0, String arg1, Throwable arg2) {
        field83++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class127.method764(arg2, false);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (arg0 < -17 && class141.field2559.field2658 != null) {
                class96 var8 = class141.field2559.method901((byte) 120, new URL(class141.field2559.field2658.getCodeBase(), "clienterror.ws?c=" + class3.field65 + "&u=" + class103.field1893 + "&v1=" + class147.field2651 + "&v2=" + class147.field2652 + "&e=" + var7));
                while (var8.field1765 == 0) {
                    class151.method926((byte) 101, 1L);
                }
                if (var8.field1765 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field1767;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }
}
