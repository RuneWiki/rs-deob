import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class327 extends class312 {

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "Lpu;")
    public static class179 field4940 = new class179("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "[Z")
    public static boolean[] field4946 = new boolean[100];

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "I")
    public static int field4952 = 0;

    @OriginalMember(owner = "client!sg", name = "x", descriptor = "[I")
    public static int[] field4955 = new int[25];

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "I")
    public static int field4949 = 0;

    @OriginalMember(owner = "client!sg", name = "z", descriptor = "I")
    public static int field4957 = 0;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "Lpu;")
    public static class179 field4944 = new class179("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    public int field4939;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    public int field4941;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
    public int field4943;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!sg", name = "w", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!sg", name = "y", descriptor = "I")
    public int field4956;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "Lbn;")
    public static class307 field4947;

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "Lwl;")
    public class521 field4951;

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "[Z")
    public static boolean[] field4950;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)Lfi;", line = 5)
    public static final class38 method2148(int arg0, int arg1, int arg2) {
        if (arg1 != -7153) {
            method2148(-67, -36, 13);
        }
        field4942++;
        class38 var3 = class159.method1143(-357225936, arg0);
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field610 == null || arg2 >= var3.field610.length) {
            return null;
        } else {
            return var3.field610[arg2];
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IBI)Z", line = 35)
    public static final boolean method2149(int arg0, byte arg1, int arg2) {
        field4953++;
        if (arg1 == 53) {
            return class178.method1256(13775, arg0, arg2) | (arg0 & 0x70000) != 0 || class303.method2004(arg1 ^ 0x50, arg0, arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIII)Lwl;", line = 51)
    public static final class521 method2150(int arg0, int arg1, int arg2, int arg3) {
        field4954++;
        class281 var4 = class348.field5192[arg2][arg0][arg1];
        if (var4 == null) {
            return null;
        }
        if (arg3 != -1866993209) {
            method2150(-4, 102, 89, -56);
        }
        class521 var5 = null;
        int var6 = -1;
        for (class21 var7 = var4.field4381; var7 != null; var7 = var7.field235) {
            class76 var8 = var7.field240;
            if (var8 instanceof class521) {
                class521 var9 = (class521) var8;
                int var10 = (var9.method3045(0) - 1) * 64 + 60;
                int var11 = var9.field1275 - var10 >> 7;
                int var12 = var9.field1279 - var10 >> 7;
                int var13 = var9.field1275 + var10 >> 7;
                int var14 = var9.field1279 + var10 >> 7;
                if (arg0 >= var11 && var12 <= arg1 && arg0 <= var13 && arg1 <= var14) {
                    int var15 = (var13 + 1 - arg0) * (var14 + 1 - arg1);
                    if (var6 < var15) {
                        var6 = var15;
                        var5 = var9;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V", line = 116)
    public static void method2151(int arg0) {
        field4940 = null;
        if (arg0 != 16571) {
            return;
        }
        field4955 = null;
        field4950 = null;
        field4947 = null;
        field4944 = null;
        field4946 = null;
    }
}
