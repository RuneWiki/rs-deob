import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!n")
public class class26 {

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "I")
    public static int field368 = 0;

    @OriginalMember(owner = "mapview!n", name = "e", descriptor = "I")
    public static int field372 = 0;

    @OriginalMember(owner = "mapview!n", name = "f", descriptor = "Ld;")
    public static class7 field373 = class38.method251((byte) -106, "Potters Wheel");

    @OriginalMember(owner = "mapview!n", name = "d", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "mapview!n", name = "g", descriptor = "J")
    public long field374;

    @OriginalMember(owner = "mapview!n", name = "b", descriptor = "Ln;")
    public class26 field369;

    @OriginalMember(owner = "mapview!n", name = "c", descriptor = "Ln;")
    public class26 field370;

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(B)V", line = 15)
    public static void method197(byte arg0) {
        field373 = null;
        if (arg0 != 29) {
            field373 = null;
        }
    }

    @OriginalMember(owner = "mapview!n", name = "b", descriptor = "(B)V", line = 32)
    public final void method198(byte arg0) {
        if (arg0 != -64) {
            method200((byte) 57);
        }
        if (this.field370 != null) {
            this.field370.field369 = this.field369;
            this.field369.field370 = this.field370;
            this.field370 = null;
            this.field369 = null;
        }
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/Throwable;)V", line = 61)
    public static final void method199(boolean arg0, String arg1, Throwable arg2) {
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class24.method169(2, arg2);
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
            if (class28.field392.field17 == null) {
                return;
            }
            if (arg0) {
                method199(true, null, null);
            }
            class34 var8 = class28.field392.method13(0, new URL(class28.field392.field17.getCodeBase(), "clienterror.ws?c=" + class11.field132 + "&u=" + class25.field267 + "&v1=" + class3.field25 + "&v2=" + class3.field24 + "&e=" + var7));
            while (var8.field460 == 0) {
                class28.method205(1L, (byte) 120);
            }
            if (var8.field460 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field458;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "mapview!n", name = "c", descriptor = "(B)B", line = 126)
    public static final byte method200(byte arg0) {
        int var1 = 114 / ((73 - arg0) / 45);
        return class31.field446 == null ? 0 : class31.field446[class2.field10];
    }
}
