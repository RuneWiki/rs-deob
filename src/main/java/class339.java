import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class339 {

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "Llo;")
    public static class306 field5320 = new class306("Starting 3D Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "Lvv;")
    public static class313 field5325 = null;

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "I")
    public static int field5324 = 0;

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "I")
    public static int field5321;

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "I")
    public static int field5322;

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "Ljava/awt/Font;")
    public static Font field5323;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZIII)I", line = 5)
    public static final int method2144(boolean arg0, int arg1, int arg2, int arg3) {
        field5321++;
        int var4 = arg2 & 0x3;
        if (!arg0) {
            return -90;
        } else if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)Ljava/lang/String;", line = 30)
    public static final String method2145(byte arg0) {
        field5322++;
        String var1 = "www";
        if (class519.field7666 == class255.field4320) {
            var1 = "www-wtrc";
        } else if (class364.field5672 == class255.field4320) {
            var1 = "www-wtqa";
        } else if (class363.field5657 == class255.field4320) {
            var1 = "www-wtwip";
        }
        String var2 = "";
        if (class60.field917 != null) {
            var2 = "/p=" + class60.field917;
        }
        if (arg0 != 125) {
            field5325 = null;
        }
        return "http://" + var1 + "." + class271.field4501.field7861 + ".com/l=" + class300.field4813 + "/a=" + class57.field899 + var2 + "/";
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V", line = 62)
    public static void method2146(int arg0) {
        field5320 = null;
        field5325 = null;
        field5323 = null;
        if (arg0 != -3) {
            method2145((byte) 67);
        }
    }
}
