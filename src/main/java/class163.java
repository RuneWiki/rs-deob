import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public abstract class class163 extends class446 {

    @OriginalMember(owner = "client!eo", name = "x", descriptor = "Z")
    public volatile boolean field2254 = true;

    @OriginalMember(owner = "client!eo", name = "D", descriptor = "Ljs;")
    public static class181 field2260 = new class181(5000);

    @OriginalMember(owner = "client!eo", name = "F", descriptor = "Lkn;")
    public static class442 field2262 = new class442("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

    @OriginalMember(owner = "client!eo", name = "H", descriptor = "F")
    public static float field2264;

    @OriginalMember(owner = "client!eo", name = "y", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!eo", name = "z", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!eo", name = "C", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!eo", name = "w", descriptor = "Lja;")
    public static class152 field2253;

    @OriginalMember(owner = "client!eo", name = "E", descriptor = "Lb;")
    public static class183 field2261;

    @OriginalMember(owner = "client!eo", name = "G", descriptor = "Lnq;")
    public static class268 field2263;

    @OriginalMember(owner = "client!eo", name = "A", descriptor = "Z")
    public boolean field2257;

    @OriginalMember(owner = "client!eo", name = "B", descriptor = "Z")
    public boolean field2258;

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "(I)[B")
    public abstract byte[] method1075(int arg0);

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "(I)V")
    public static void method1076(int arg0) {
        field2263 = null;
        field2262 = null;
        if (arg0 == 512) {
            field2261 = null;
            field2253 = null;
            field2260 = null;
        }
    }

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "(B)V")
    public static final void method1077(byte arg0) {
        field2259++;
        int var1 = class100.method716(arg0 ^ 0xFFFF8A3A);
        if (var1 == 0) {
            class222.field3108 = null;
            class187.method1215((byte) 118, 0);
        } else if (var1 == 1) {
            class442.method2770((byte) 0, false);
            class187.method1215((byte) 109, 512);
            if (class368.field5193 != null) {
                class22.method286((byte) 45);
            }
        } else {
            class442.method2770((byte) (class70.field1025 - 4 & 0xFF), false);
            class187.method1215((byte) 107, 2);
        }
        if (arg0 != 0) {
            field2260 = null;
        }
        class16.field298 = class142.field2034;
    }

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "(I)I")
    public abstract int method1078(int arg0);

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)Lco;")
    public static final class62 method1079(boolean arg0) {
        field2255++;
        if (!arg0) {
            return null;
        } else if (class354.field4833 == null || class100.field1380 == null) {
            return null;
        } else {
            class100.field1380.method2726((byte) 74, class354.field4833);
            class62 var1 = (class62) class100.field1380.method2730(-1);
            if (var1 == null) {
                return null;
            } else {
                class25 var2 = class328.method2113(var1.field851, (byte) -125);
                return var2 != null && var2.field452 && var2.method298((byte) 47) ? var1 : class83.method603((byte) -102);
            }
        }
    }

    static {
        new class442("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
    }
}
