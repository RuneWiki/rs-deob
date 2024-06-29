import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!h")
public class class15 extends class30 {

    @OriginalMember(owner = "mapview!h", name = "l", descriptor = "Ld;")
    public static class7 field147 = class37.method242("Herbalist", 1333943984);

    @OriginalMember(owner = "mapview!h", name = "n", descriptor = "Ld;")
    public static class7 field149 = class37.method242("Candle Shop", 1333943984);

    @OriginalMember(owner = "mapview!h", name = "m", descriptor = "Ld;")
    public static class7 field148 = class37.method242("download", 1333943984);

    @OriginalMember(owner = "mapview!h", name = "p", descriptor = "I")
    public static int field151 = 0;

    @OriginalMember(owner = "mapview!h", name = "q", descriptor = "Ld;")
    public static class7 field152 = class37.method242("Loading )3)3)3", 1333943984);

    @OriginalMember(owner = "mapview!h", name = "s", descriptor = "I")
    public static int field154 = 0;

    @OriginalMember(owner = "mapview!h", name = "t", descriptor = "I")
    public static int field155 = 500;

    @OriginalMember(owner = "mapview!h", name = "u", descriptor = "Ld;")
    public static class7 field156 = class37.method242("Estate Agent", 1333943984);

    @OriginalMember(owner = "mapview!h", name = "r", descriptor = "[J")
    public static long[] field153 = new long[32];

    @OriginalMember(owner = "mapview!h", name = "o", descriptor = "I")
    public static int field150 = 0;

    @OriginalMember(owner = "mapview!h", name = "v", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(III)V", line = 17)
    public static final void method109(int arg0, int arg1, int arg2) {
        class16.field158 = arg0 >> arg1;
        class34.field485 = arg0 & 0x3F;
        class34.field478 = arg2 >> 6;
        class32.field465 = arg2 & 0x3F;
        class16.field166 = (class34.field485 << 6) + class32.field465;
        class30.method215(-10399);
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/Throwable;)V", line = 96)
    public static final void method110(String arg0, byte arg1, Throwable arg2) {
        try {
            if (arg1 != -34) {
                field153 = null;
            }
            String var3 = "";
            if (arg2 != null) {
                var3 = class28.method208((byte) 111, arg2);
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
            class33 var8 = class28.field398.method34((byte) 9, new URL(class28.field398.field66.getCodeBase(), "clienterror.ws?c=" + class29.field431 + "&u=" + class11.field110 + "&v1=" + class5.field77 + "&v2=" + class5.field71 + "&e=" + var7));
            while (var8.field472 == 0) {
                class1.method8(104, 1L);
            }
            if (var8.field472 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field476;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "mapview!h", name = "c", descriptor = "(I)V", line = 164)
    public static void method111(int arg0) {
        if (arg0 != 500) {
            method110(null, (byte) 86, null);
        }
        field156 = null;
        field147 = null;
        field149 = null;
        field152 = null;
        field153 = null;
        field148 = null;
    }

    @OriginalMember(owner = "mapview!h", name = "a", descriptor = "([Ld;B)Ld;", line = 184)
    public static final class7 method112(class7[] arg0, byte arg1) {
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        if (arg1 != -64) {
            method112(null, (byte) -23);
        }
        return class35.method233(0, 0, arg0, arg0.length);
    }
}
