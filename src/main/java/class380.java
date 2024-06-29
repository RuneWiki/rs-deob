import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class380 extends class177 {

    @OriginalMember(owner = "client!cm", name = "q", descriptor = "I")
    public static int field5338 = 0;

    @OriginalMember(owner = "client!cm", name = "s", descriptor = "[C")
    public static char[] field5340 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!cm", name = "p", descriptor = "I")
    public static int field5337;

    @OriginalMember(owner = "client!cm", name = "r", descriptor = "I")
    public static int field5339;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)V")
    public static void method2364(int arg0) {
        if (arg0 != -2) {
            field5340 = null;
        }
        field5340 = null;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V")
    public static final void method2365(int arg0, String arg1, Throwable arg2) {
        field5337++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class438.method2723(arg2, -1);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class407.method2512(var3, arg0 ^ 0xA709FA76);
            String var4 = class167.method1261(var3, (byte) 123, "%3a", ":");
            String var5 = class167.method1261(var4, (byte) -120, "%40", "@");
            String var6 = class167.method1261(var5, (byte) 96, "%26", "&");
            String var7 = class167.method1261(var6, (byte) 96, "%23", "#");
            if (class284.field3809.field4117 != null) {
                class242 var8 = class284.field3809.method1939(new URL(class284.field3809.field4117.getCodeBase(), "clienterror.ws?c=" + class386.field5440 + "&u=" + class77.field1155 + "&v1=" + class304.field4121 + "&v2=" + class304.field4118 + "&e=" + var7), 4);
                while (var8.field3345 == 0) {
                    class229.method1541(89, 1L);
                }
                if (~var8.field3345 == arg0) {
                    DataInputStream var9 = (DataInputStream) var8.field3341;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)Z")
    public static final boolean method2366(byte arg0) {
        field5339++;
        class63 var1 = (class63) class268.field3613.field2454.field5348;
        if (var1 == null || class268.field3613.field2454 == var1) {
            return false;
        }
        if (var1.field966 >= 2000) {
            var1.field966 -= 2000;
        }
        if (arg0 == -61) {
            return var1.field966 == 1011;
        } else {
            return false;
        }
    }
}
