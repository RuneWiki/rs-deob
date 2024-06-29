import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class409 {

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "Liq;")
    public static class362 field5891 = new class362("Starting 3d Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

    @OriginalMember(owner = "client!vm", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field5895;

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "Liq;")
    public static class362 field5893;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
    public static int field5886;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    public static int field5887;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
    public static int field5888;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
    public static int field5889;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
    public static int field5890;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "I")
    public static int field5892;

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "I")
    public static int field5894;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V")
    public static void method2613(int arg0) {
        if (arg0 == 8685) {
            field5891 = null;
            field5895 = null;
            field5893 = null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILtq;Lul;)V")
    public static final void method2614(int arg0, class376 arg1, class343 arg2) {
        field5894++;
        class347.field4909 = arg2;
        class125.field1533 = arg1;
        if (arg0 != 0) {
            method2615(82, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method2615(int arg0, byte[] arg1) {
        int var2 = 55 / ((32 - arg0) / 63);
        field5889++;
        int var3 = arg1.length;
        byte[] var4 = new byte[var3];
        class316.method2075(arg1, 0, var4, 0, var3);
        return var4;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)I")
    public static final int method2616(byte arg0) {
        field5890++;
        class134 var1 = class151.field1873;
        boolean var2 = false;
        if (class26.field329 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var2 = true;
            var1 = class134.method825(73, (class343) null, (class185) null, 0, var3, 0);
        }
        long var4 = class175.method1195(41);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method673(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class175.method1195(28) - var4);
        var1.method827(0, 0, 100, -110, 100, -16777216);
        if (var2) {
            var1.method824(58);
        }
        int var8 = -103 % ((arg0 + 84) / 41);
        return var7;
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)V")
    public static final void method2617(int arg0) {
        field5888++;
        class311.field4396.method1618(0);
        if (arg0 != -15166) {
            field5893 = null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILjava/lang/String;C)[Ljava/lang/String;")
    public static final String[] method2618(int arg0, String arg1, char arg2) {
        field5886++;
        int var3 = class275.method1822(false, arg2, arg1);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        if (arg0 != 1) {
            method2618(24, (String) null, (char) 65461);
        }
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg1.charAt(var8) != arg2; var8++) {
            }
            var4[var5++] = arg1.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg1.substring(var6);
        return var4;
    }

    static {
        new class362("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
        field5895 = new String[100];
        field5893 = new class362("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");
    }
}
