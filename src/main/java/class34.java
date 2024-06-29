import java.awt.Font;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!s")
public abstract class class34 {

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "Lt;")
    public static class36 field469 = class3.method8(13631, "Jewellery");

    @OriginalMember(owner = "mapview!s", name = "c", descriptor = "Lt;")
    public static class36 field471 = class3.method8(13631, "mapscene");

    @OriginalMember(owner = "mapview!s", name = "b", descriptor = "Lt;")
    public static class36 field470 = class3.method8(13631, " map");

    @OriginalMember(owner = "mapview!s", name = "d", descriptor = "I")
    public static volatile int field472 = 0;

    @OriginalMember(owner = "mapview!s", name = "g", descriptor = "I")
    public static volatile int field475 = -1;

    @OriginalMember(owner = "mapview!s", name = "f", descriptor = "I")
    public static int field474 = 0;

    @OriginalMember(owner = "mapview!s", name = "j", descriptor = "Lt;")
    public static class36 field478 = class3.method8(13631, "Brewery");

    @OriginalMember(owner = "mapview!s", name = "e", descriptor = "Lt;")
    public static class36 field473 = class3.method8(13631, "Summoning Obelisk");

    @OriginalMember(owner = "mapview!s", name = "h", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "mapview!s", name = "i", descriptor = "Ljava/awt/Font;")
    public static Font field477;

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(Z)V", line = 10)
    public static void method190(boolean arg0) {
        if (arg0) {
            field469 = null;
        }
        field478 = null;
        field470 = null;
        field473 = null;
        field471 = null;
        field469 = null;
        field477 = null;
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V", line = 41)
    public static final void method191(String arg0, Throwable arg1, int arg2) {
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class39.method244(arg1, (byte) -100);
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
            if (class28.field412.field155 == null) {
                return;
            }
            class13 var8 = class28.field412.method64(new URL(class28.field412.field155.getCodeBase(), "clienterror.ws?c=" + class1.field5 + "&u=" + class39.field520 + "&v1=" + class11.field150 + "&v2=" + class11.field157 + "&e=" + var7), 4);
            if (arg2 > -62) {
                method190(false);
            }
            while (var8.field165 == 0) {
                mapview.method140(1L, 124);
            }
            if (var8.field165 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field169;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(II[BI)I", line = 93)
    public static final int method192(int arg0, int arg1, byte[] arg2, int arg3) {
        int var4 = arg1;
        for (int var5 = arg0; var5 < arg3; var5++) {
            var4 = class40.field528[(var4 ^ arg2[var5]) & 0xFF] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(ZII)I")
    public abstract int method182(boolean arg0, int arg1, int arg2);
}
