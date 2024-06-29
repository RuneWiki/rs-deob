import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class95 {

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "Lss;")
    public static class213 field1385 = new class213("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

    @OriginalMember(owner = "client!hs", name = "i", descriptor = "I")
    public static int field1391 = 503;

    @OriginalMember(owner = "client!hs", name = "f", descriptor = "F")
    public static float field1388;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!hs", name = "g", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!hs", name = "h", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!hs", name = "e", descriptor = "Lvt;")
    public static class522 field1387;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)V")
    public static final void method648(byte arg0) {
        class94.field1382 = 0;
        field1383++;
        int var1 = (class358.field5565.field6417 >> 7) + class453.field7018;
        int var2 = 84 / ((arg0 - 26) / 36);
        int var3 = (class358.field5565.field6410 >> 7) + class126.field1718;
        if (var1 >= 3053 && var1 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            class94.field1382 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            class94.field1382 = 1;
        }
        if (class94.field1382 == 1 && var1 >= 3139 && var1 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            class94.field1382 = 0;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILgi;)V")
    public static final void method649(int arg0, class437 arg1) {
        if (arg1.field6729 == 5 && arg1.field6716 != -1) {
            class283.method1905(true, arg1, class19.field198);
        }
        field1384++;
        if (arg0 != -3157) {
            field1385 = null;
        }
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(B)V")
    public static void method650(byte arg0) {
        int var1 = 111 / ((arg0 + 8) / 56);
        field1387 = null;
        field1385 = null;
    }
}
