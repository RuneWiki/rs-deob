import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!o")
public class class26 extends RuntimeException {

    @OriginalMember(owner = "mapview!o", name = "h", descriptor = "Ljava/lang/String;")
    public String field365;

    @OriginalMember(owner = "mapview!o", name = "f", descriptor = "Ljava/lang/Throwable;")
    public Throwable field363;

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "Lw;")
    public static class38 field358 = class35.method219("Tannery", true);

    @OriginalMember(owner = "mapview!o", name = "e", descriptor = "I")
    public static int field362 = 0;

    @OriginalMember(owner = "mapview!o", name = "g", descriptor = "Lw;")
    public static class38 field364 = class35.method219("Furnace", true);

    @OriginalMember(owner = "mapview!o", name = "c", descriptor = "Lw;")
    public static class38 field360 = class35.method219("Switch to ", true);

    @OriginalMember(owner = "mapview!o", name = "b", descriptor = "I")
    public static int field359 = 0;

    @OriginalMember(owner = "mapview!o", name = "l", descriptor = "I")
    public static int field369 = 0;

    @OriginalMember(owner = "mapview!o", name = "k", descriptor = "Lw;")
    public static class38 field368 = class35.method219("Fur Trader", true);

    @OriginalMember(owner = "mapview!o", name = "m", descriptor = "I")
    public static int field370 = 1;

    @OriginalMember(owner = "mapview!o", name = "d", descriptor = "Lw;")
    public static class38 field361 = class35.method219("sprites", true);

    @OriginalMember(owner = "mapview!o", name = "i", descriptor = "I")
    public static volatile int field366 = 0;

    @OriginalMember(owner = "mapview!o", name = "n", descriptor = "Lw;")
    public static class38 field371 = class35.method219("Loom", true);

    @OriginalMember(owner = "mapview!o", name = "o", descriptor = "[Z")
    public static boolean[] field372 = new boolean[112];

    @OriginalMember(owner = "mapview!o", name = "p", descriptor = "Lw;")
    public static class38 field373 = class35.method219("Jewellery", true);

    @OriginalMember(owner = "mapview!o", name = "j", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(B)V", line = 5)
    public static void method163(byte arg0) {
        field373 = null;
        field361 = null;
        field372 = null;
        field368 = null;
        field371 = null;
        if (arg0 != -92) {
            method165(null, 77, null);
        }
        field360 = null;
        field364 = null;
        field358 = null;
    }

    @OriginalMember(owner = "mapview!o", name = "b", descriptor = "(B)B", line = 27)
    public static final byte method164(byte arg0) {
        if (arg0 != -56) {
            method165(null, 82, null);
        }
        return class23.field241 == null ? 0 : class23.field241[mapview.field257];
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Throwable;)V", line = 75)
    public static final void method165(String arg0, int arg1, Throwable arg2) {
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class18.method104((byte) -42, arg2);
            }
            if (arg0 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class6.field44.field230 == null) {
                return;
            }
            class21 var8 = class6.field44.method127(-126, new URL(class6.field44.field230.getCodeBase(), "clienterror.ws?c=" + class10.field89 + "&u=" + class4.field22 + "&v1=" + class22.field224 + "&v2=" + class22.field222 + "&e=" + var7));
            while (var8.field215 == 0) {
                class8.method36(1L, 10);
            }
            if (var8.field215 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field219;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
        if (arg1 > -71) {
            field360 = null;
        }
    }

    @OriginalMember(owner = "mapview!o", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 141)
    public class26(Throwable arg0, String arg1) {
        this.field365 = arg1;
        this.field363 = arg0;
    }
}
