import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class271 {

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    public int field3763 = -1;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "[I")
    public static int[] field3759 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "Z")
    public static boolean field3762 = false;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "[I")
    public static int[] field3764 = new int[32];

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "Lks;")
    public class253 field3760;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "[I")
    public int[] field3766;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "[Ljava/lang/String;")
    public String[] field3761;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
    public static void method1774(int arg0) {
        field3764 = null;
        field3759 = null;
        if (arg0 != 2) {
            method1774(9);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lko;I)V")
    public static final void method1775(class294 arg0, int arg1) {
        field3758++;
        class199 var2 = null;
        try {
            if (arg1 <= 20) {
                method1774(-13);
            }
            class283 var3 = arg0.method1906(2);
            while (var3.field3998 == 0) {
                class349.method2219(1L, -20);
            }
            if (var3.field3998 == 1) {
                var2 = (class199) var3.field3999;
                class11 var4 = class418.method2622(109);
                var2.method1301(0, var4.field230, 52, var4.field191);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method1304(0);
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V")
    public static final void method1776(int arg0, Throwable arg1, String arg2) {
        field3765++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class296.method1937((byte) 43, arg1);
            }
            if (arg2 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            class326.method2097(var3, false);
            String var4 = class292.method1890(":", var3, (byte) -51, "%3a");
            String var5 = class292.method1890("@", var4, (byte) 123, "%40");
            String var6 = class292.method1890("&", var5, (byte) 96, "%26");
            String var7 = class292.method1890("#", var6, (byte) -91, "%23");
            if (class229.field3330.field4121 != null) {
                class283 var8 = class229.field3330.method1911(new URL(class229.field3330.field4121.getCodeBase(), "clienterror.ws?c=" + class418.field5936 + "&u=" + class393.field5635 + "&v1=" + class294.field4116 + "&v2=" + class294.field4123 + "&e=" + var7), (byte) -81);
                if (arg0 != -2296) {
                    method1776(78, (Throwable) null, (String) null);
                }
                while (var8.field3998 == 0) {
                    class349.method2219(1L, -20);
                }
                if (var8.field3998 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field3999;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }
}
