import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class411 {

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    public static int field5937;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    public static int field5938;

    static {
        new class70(64);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;B)V", line = 7)
    public static final void method2578(Throwable arg0, String arg1, byte arg2) {
        field5938++;
        if (arg2 != -68) {
            return;
        }
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class444.method2753(arg0, (byte) 116);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class176.method1161(var3, 116);
            String var4 = class428.method2665(var3, (byte) 109, "%3a", ":");
            String var5 = class428.method2665(var4, (byte) 109, "%40", "@");
            String var6 = class428.method2665(var5, (byte) 109, "%26", "&");
            String var7 = class428.method2665(var6, (byte) 109, "%23", "#");
            if (class267.field3757.field5559 != null) {
                class241 var8 = class267.field3757.method2382(-16704, new URL(class267.field3757.field5559.getCodeBase(), "clienterror.ws?c=" + class223.field3053 + "&u=" + class37.field376 + "&v1=" + class378.field5556 + "&v2=" + class378.field5554 + "&e=" + var7));
                while (var8.field3268 == 0) {
                    class278.method1757(1L, 0);
                }
                if (var8.field3268 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field3270;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }
}
