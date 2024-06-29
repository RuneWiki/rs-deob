import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public abstract class class105 {

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "Lqf;")
    public static class117 field2524 = class72.method514(113, "Spiel)2Engine wird gestartet)3)3)3");

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "Leb;")
    public static class31 field2527 = new class31(50);

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "Lqf;")
    public static class117 field2529 = class72.method514(105, " loggt sich aus)3");

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "Lqf;")
    public static class117 field2532 = class72.method514(107, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field2530 = 0;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "[Lr;")
    public static class118[] field2531;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLjava/lang/Throwable;Ljava/lang/String;)V")
    public static final void method803(byte arg0, Throwable arg1, String arg2) {
        field2526++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class100.method787(true, arg1);
            }
            if (arg2 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class90.field2200.field3267 != null) {
                class7 var8 = class90.field2200.method1069(116, new URL(class90.field2200.field3267.getCodeBase(), "clienterror.ws?c=" + class16.field244 + "&u=" + class82.field1878 + "&v1=" + class137.field3263 + "&v2=" + class137.field3273 + "&e=" + var7));
                while (var8.field108 == 0) {
                    class148.method1183(0, 1L);
                }
                if (arg0 >= -46) {
                    method804((byte) -53);
                }
                if (var8.field108 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field106;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I[B)V")
    public abstract void method417(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)[B")
    public abstract byte[] method416(byte arg0);

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(B)V")
    public static void method804(byte arg0) {
        field2529 = null;
        field2524 = null;
        if (arg0 != 77) {
            method804((byte) 58);
        }
        field2532 = null;
        field2531 = null;
        field2527 = null;
    }
}
