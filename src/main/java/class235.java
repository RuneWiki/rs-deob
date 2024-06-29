import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class235 {

    @OriginalMember(owner = "client!km", name = "d", descriptor = "[I")
    public static int[] field3488 = new int[6];

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "Lrb;")
    public static class234 field3486;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;B)V")
    public static final void method1598(Throwable arg0, String arg1, byte arg2) {
        field3487++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class437.method2623(arg0, 1);
            }
            if (arg2 <= 22) {
                method1598(null, null, (byte) 35);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class268.method1769(14, var3);
            String var4 = class397.method2399(var3, ":", 120, "%3a");
            String var5 = class397.method2399(var4, "@", 63, "%40");
            String var6 = class397.method2399(var5, "&", 71, "%26");
            String var7 = class397.method2399(var6, "#", 98, "%23");
            if (class183.field2679.field6462 != null) {
                class281 var8 = class183.field2679.method2586(new URL(class183.field2679.field6462.getCodeBase(), "clienterror.ws?c=" + class527.field7802 + "&u=" + class422.field6346 + "&v1=" + class432.field6461 + "&v2=" + class432.field6457 + "&e=" + var7), 19);
                while (var8.field4032 == 0) {
                    class246.method1659((byte) 117, 1L);
                }
                if (var8.field4032 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field4030;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Z)V")
    public static void method1599(boolean arg0) {
        field3488 = null;
        field3486 = null;
        if (arg0) {
            method1599(false);
        }
    }
}
