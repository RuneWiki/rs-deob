import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class413 {

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public static int field5853 = 0;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "Lrg;")
    public static class596 field5851 = new class596(13, 3);

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public int field5850;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public int field5852;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public static int field5854;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public int field5855;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field5856;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)V", line = 4)
    public static final void method2398(int arg0, int arg1, int arg2) {
        boolean var3 = class295.field4051[0][arg1][arg2] != null && class295.field4051[0][arg1][arg2].field5534 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class295.field4051[var4][arg1][arg2] == null) {
                class390 var5 = class295.field4051[var4][arg1][arg2] = new class390(var4);
                if (var3) {
                    var5.field5530++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V", line = 30)
    public static void method2399(boolean arg0) {
        if (!arg0) {
            field5851 = null;
        }
        field5851 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V", line = 51)
    public static final void method2400(String arg0, Throwable arg1, byte arg2) {
        field5854++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class449.method2557(arg1, (byte) 125);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            class506.method2892(var3, (byte) -68);
            String var4 = class60.method497(":", var3, "%3a", (byte) -29);
            String var5 = class60.method497("@", var4, "%40", (byte) -29);
            String var6 = class60.method497("&", var5, "%26", (byte) -29);
            String var7 = class60.method497("#", var6, "%23", (byte) -29);
            if (class26.field332 == null) {
                return;
            }
            class70 var8 = class51.field596.method775(new URL(class26.field332.getCodeBase(), "clienterror.ws?c=" + class201.field2847 + "&u=" + client.field3731 + "&v1=" + class105.field1477 + "&v2=" + class105.field1480 + "&e=" + var7), 1);
            while (var8.field948 == 0) {
                class519.method2960(72, 1L);
            }
            if (var8.field948 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field946;
                var9.read();
                var9.close();
            }
        } catch (Exception var10) {
        }
        if (arg2 >= -14) {
            field5851 = null;
        }
    }
}
