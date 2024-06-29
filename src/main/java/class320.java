import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class320 {

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field4897 = 0;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "Lpi;")
    public static class342 field4902 = new class342("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "J")
    public long field4904;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "Lqg;")
    public class320 field4901;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "Lqg;")
    public class320 field4906;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "Z")
    public static boolean field4899;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "[Lf;")
    public static class529[] field4907;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V")
    public static final void method2087(int arg0, Throwable arg1, String arg2) {
        field4898++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class190.method1325(arg1, true);
            }
            if (arg2 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            class175.method1257(var3, 14660);
            String var4 = class111.method831(var3, ":", (byte) -110, "%3a");
            String var5 = class111.method831(var4, "@", (byte) 124, "%40");
            String var6 = class111.method831(var5, "&", (byte) 35, "%26");
            String var7 = class111.method831(var6, "#", (byte) 119, "%23");
            if (class107.field1781.field4170 != null) {
                class324 var8 = class107.field1781.method1854(arg0, new URL(class107.field1781.field4170.getCodeBase(), "clienterror.ws?c=" + class298.field4251 + "&u=" + class26.field575 + "&v1=" + class293.field4165 + "&v2=" + class293.field4169 + "&e=" + var7));
                while (var8.field4940 == 0) {
                    class71.method583(1L, -83);
                }
                if (var8.field4940 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field4939;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
    public static void method2088(int arg0) {
        if (arg0 != 12118) {
            field4897 = -52;
        }
        field4907 = null;
        field4902 = null;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(B)Z")
    public static final boolean method2089(byte arg0) {
        field4903++;
        if (arg0 == 38) {
            return class363.field5500 > 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V")
    public final void method2090(int arg0) {
        field4900++;
        if (arg0 == -1 && this.field4906 != null) {
            this.field4906.field4901 = this.field4901;
            this.field4901.field4906 = this.field4906;
            this.field4901 = null;
            this.field4906 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(B)Z")
    public final boolean method2091(byte arg0) {
        field4905++;
        if (this.field4906 == null) {
            return false;
        } else {
            int var2 = 43 / ((-arg0 - 61) / 57);
            return true;
        }
    }
}
