import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class446 {

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "Ljava/lang/String;")
    public static String field6389 = null;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "[I")
    public static int[] field6390 = new int[256];

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "Lap;")
    public static class335 field6392;

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "I")
    public static int field6396;

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "Ldq;")
    public static class493 field6397;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
    public static int field6391;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
    public static int field6393;

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
    public static int field6395;

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "Lya;")
    public static class38 field6394;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILvn;B)Lur;")
    public static final class376 method2625(int arg0, class205 arg1, byte arg2) {
        field6395++;
        class376 var3;
        if (class201.field2619 == null) {
            var3 = new class376();
        } else {
            var3 = class201.field2619;
            class201.field2619 = class201.field2619.field4952;
            var3.field4952 = null;
            class157.field1993--;
        }
        var3.field4953 = arg1;
        int var4 = -4 / ((arg2 - 21) / 54);
        var3.field4948 = arg0;
        return var3;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V")
    public static void method2626(byte arg0) {
        field6397 = null;
        field6389 = null;
        field6390 = null;
        if (arg0 != -30) {
            method2625(-55, null, (byte) -33);
        }
        field6392 = null;
        field6394 = null;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(BI)Z")
    public static final boolean method2627(byte arg0, int arg1) {
        if (arg0 == 11) {
            field6391++;
            return arg1 == 0 || arg1 == 1 || arg1 == 2;
        } else {
            return true;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field6390[var0] = var1;
        }
        field6392 = new class335("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");
        new class335("Player ", "Spieler ", "Joueur ", "Jogador ");
        field6396 = 0;
        field6397 = new class493(64, 2);
    }
}
