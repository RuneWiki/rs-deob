import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class91 {

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "Lui;")
    public static class193 field1122 = new class193();

    @OriginalMember(owner = "client!rv", name = "g", descriptor = "[Lsba;")
    public static class183[] field1126 = new class183[14];

    @OriginalMember(owner = "client!rv", name = "f", descriptor = "Lcea;")
    public static class180 field1125 = new class180("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!rv", name = "e", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!rv", name = "h", descriptor = "J")
    public static long field1127;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZBIZI)I")
    public static final int method553(boolean arg0, byte arg1, int arg2, boolean arg3, int arg4) {
        field1120++;
        class125 var5 = class256.method1445(arg2, (byte) -127, arg0);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < var5.field1535.length; var7++) {
            if (var5.field1535[var7] >= 0 && var5.field1535[var7] < class449.field6217.field4733) {
                class607 var8 = class449.field6217.method2026((byte) -115, var5.field1535[var7]);
                int var9 = var8.method3486(true, class290.field3771.method2793(11, arg4).field5211, arg4);
                if (arg3) {
                    var6 += var5.field1538[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        if (arg1 > -35) {
            field1122 = null;
        }
        return var6;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(ILnf;)V")
    public static final void method554(int arg0, class493 arg1) {
        field1124++;
        class93.field1141 = arg1;
        int var2 = -79 / ((-arg0 - 73) / 33);
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Z)V")
    public static final void method555(boolean arg0) {
        field1123++;
        int var1 = 0;
        for (int var2 = 0; var2 < class106.field1289; var2++) {
            for (int var3 = 0; var3 < class422.field5452; var3++) {
                if (class414.method2363(var3, var2, class383.field5070, (byte) 82, var1, true)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
        if (!arg0) {
            method553(true, (byte) -79, -100, true, 61);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)V")
    public static void method556(int arg0) {
        if (arg0 != 31540) {
            method554(-44, null);
        }
        field1122 = null;
        field1126 = null;
        field1125 = null;
    }
}
