import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class80 {

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "Z")
    public static boolean field1188 = false;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "Lss;")
    public static class213 field1191 = new class213("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "Lss;")
    public static class213 field1192 = new class213("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "F")
    public static float field1185;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
    public static void method572(int arg0) {
        field1192 = null;
        if (arg0 <= 17) {
            field1189 = 51;
        }
        field1191 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)V")
    public static final void method573(boolean arg0) {
        class231.field3825.method2189(false);
        field1190++;
        class457.field7046.method2189(false);
        class34.field344.method2189(false);
        class81.field1196.method2189(arg0);
        class434.field6553.method2189(arg0);
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
    public static final void method574(int arg0) {
        class171.field2494 = true;
        if (arg0 <= 46) {
            method573(true);
        }
        field1187++;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;B)V")
    public static final void method575(Throwable arg0, String arg1, byte arg2) {
        field1193++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class169.method1074(-92, arg0);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class519.method3110((byte) 93, var3);
            String var4 = class421.method2689("%3a", var3, ":", (byte) -91);
            String var5 = class421.method2689("%40", var4, "@", (byte) 123);
            String var6 = class421.method2689("%26", var5, "&", (byte) -120);
            String var7 = class421.method2689("%23", var6, "#", (byte) -70);
            if (class243.field3945.field27 == null) {
                return;
            }
            class495 var8 = class243.field3945.method25(121, new URL(class243.field3945.field27.getCodeBase(), "clienterror.ws?c=" + class150.field2016 + "&u=" + class51.field697 + "&v1=" + class2.field29 + "&v2=" + class2.field10 + "&e=" + var7));
            while (var8.field7458 == 0) {
                class208.method1464((byte) -102, 1L);
            }
            if (var8.field7458 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field7462;
                var9.read();
                var9.close();
            }
        } catch (Exception var10) {
        }
        if (arg2 >= -28) {
            method572(57);
        }
    }
}
