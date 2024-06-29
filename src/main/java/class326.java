import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class326 {

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field5340 = 0;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "Z")
    public static boolean field5344 = false;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "Ljava/lang/String;")
    public static String field5345 = "cyan:";

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field5341;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field5342;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public static int field5346;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "Lvd;")
    public static class23 field5343;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;Z)V", line = 6)
    public static final void method2328(Throwable arg0, String arg1, boolean arg2) {
        field5341++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class280.method1992(-54, arg0);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class350.method2456(var3, -125);
            String var4 = class181.method1263(119, var3, ":", "%3a");
            String var5 = class181.method1263(122, var4, "@", "%40");
            String var6 = class181.method1263(125, var5, "&", "%26");
            String var7 = class181.method1263(121, var6, "#", "%23");
            if (class148.field2394.field4515 == null) {
                return;
            }
            class158 var8 = class148.field2394.method1945(52, new URL(class148.field2394.field4515.getCodeBase(), "clienterror.ws?c=" + class79.field1174 + "&u=" + class65.field960 + "&v1=" + class274.field4513 + "&v2=" + class274.field4505 + "&e=" + var7));
            while (var8.field2542 == 0) {
                class177.method1246(1L, -32644);
            }
            if (var8.field2542 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field2538;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
        if (!arg2) {
            method2330(-24);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lnm;I)V", line = 60)
    public static final void method2329(class221 arg0, int arg1) {
        field5346++;
        if (arg1 != 0) {
            method2330(63);
        }
        class345.field5528 = arg0;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V", line = 94)
    public static void method2330(int arg0) {
        field5343 = null;
        if (arg0 < -53) {
            field5345 = null;
        }
    }
}
