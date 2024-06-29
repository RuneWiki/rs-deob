import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class32 {

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "Lqk;")
    public static class14 field414 = new class14();

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "I")
    public static int field417 = 0;

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "I")
    public static int field418 = 0;

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "Z")
    public static boolean field419 = false;

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/lang/Throwable;BLjava/lang/String;)V")
    public static final void method177(Throwable arg0, byte arg1, String arg2) {
        field415++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class146.method958(14892, arg0);
            }
            if (arg2 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            class432.method2530(var3, (byte) -97);
            String var4 = class151.method978((byte) -42, "%3a", var3, ":");
            String var5 = class151.method978((byte) -42, "%40", var4, "@");
            String var6 = class151.method978((byte) -42, "%26", var5, "&");
            String var7 = class151.method978((byte) -42, "%23", var6, "#");
            if (class498.field7547.field3929 != null) {
                class180 var8 = class498.field7547.method1580(new URL(class498.field7547.field3929.getCodeBase(), "clienterror.ws?c=" + class213.field3310 + "&u=" + class70.field1230 + "&v1=" + class260.field3947 + "&v2=" + class260.field3935 + "&e=" + var7), 120);
                if (arg1 > -45) {
                    field417 = 76;
                }
                while (var8.field2802 == 0) {
                    class414.method2437(1L, (byte) -122);
                }
                if (var8.field2802 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field2803;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method178(int arg0, int arg1, String arg2) {
        if (arg1 != -21224) {
            return;
        }
        field416++;
        class196.field3096++;
        class400.method2379((byte) -75, class411.field5966);
        class230.field3508.method221(-1, class220.method1343(arg2, (byte) -82) + 1);
        class230.field3508.method237(arg1 + 43603, arg0);
        class230.field3508.method240(arg2, 122);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)V")
    public static void method179(int arg0) {
        if (arg0 != 0) {
            method179(-84);
        }
        field414 = null;
    }
}
