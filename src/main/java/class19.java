import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class19 {

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    public static int field227 = 0;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public static int field231 = 0;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "Ljava/lang/String;")
    public static String field232 = "flash2:";

    @OriginalMember(owner = "client!be", name = "d", descriptor = "F")
    public static float field230;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V", line = 7)
    public static void method121(int arg0) {
        int var1 = 119 / ((arg0 + 61) / 35);
        field232 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;B)V", line = 36)
    public static final void method122(Throwable arg0, String arg1, byte arg2) {
        field228++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class266.method1869(false, arg0);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class279.method1946(true, var3);
            String var4 = class11.method54(var3, (byte) -113, "%3a", ":");
            String var5 = class11.method54(var4, (byte) -109, "%40", "@");
            String var6 = class11.method54(var5, (byte) -113, "%26", "&");
            if (arg2 > -94) {
                method122((Throwable) null, (String) null, (byte) 71);
            }
            String var7 = class11.method54(var6, (byte) -107, "%23", "#");
            if (class135.field2054.field3963 == null) {
                return;
            }
            class227 var8 = class135.field2054.method1769((byte) -84, new URL(class135.field2054.field3963.getCodeBase(), "clienterror.ws?c=" + class196.field2954 + "&u=" + class321.field4850 + "&v1=" + class262.field3965 + "&v2=" + class262.field3957 + "&e=" + var7));
            while (var8.field3456 == 0) {
                class93.method662(-553, 1L);
            }
            if (var8.field3456 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field3452;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }
}
