import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class79 extends class488 {

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "[I")
    public static int[] field1426 = new int[5];

    @OriginalMember(owner = "client!mq", name = "g", descriptor = "Lbv;")
    public static class567 field1429 = new class567("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

    @OriginalMember(owner = "client!mq", name = "i", descriptor = "Liu;")
    public static class517 field1431 = new class517(2, -2);

    @OriginalMember(owner = "client!mq", name = "j", descriptor = "I")
    public static int field1432 = 0;

    @OriginalMember(owner = "client!mq", name = "k", descriptor = "Lbv;")
    public static class567 field1433 = new class567("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

    @OriginalMember(owner = "client!mq", name = "l", descriptor = "Lfea;")
    public static class47 field1434 = new class47();

    @OriginalMember(owner = "client!mq", name = "e", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!mq", name = "f", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!mq", name = "h", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!mq", name = "m", descriptor = "Ljava/lang/String;")
    public static String field1435;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "([Ljava/lang/String;B)[Ljava/lang/String;", line = 3)
    public static final String[] method745(String[] arg0, byte arg1) {
        field1427++;
        if (arg1 >= -4) {
            field1431 = null;
        }
        String[] var2 = new String[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Z)V", line = 29)
    public static void method746(boolean arg0) {
        field1433 = null;
        field1429 = null;
        field1435 = null;
        field1431 = null;
        field1426 = null;
        field1434 = null;
        if (!arg0) {
            method745(null, (byte) 46);
        }
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(I)I", line = 52)
    public static final int method747(int arg0) {
        if (arg0 == 2) {
            field1428++;
            return 2;
        } else {
            return 27;
        }
    }
}
