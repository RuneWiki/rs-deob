import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class70 extends class182 {

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "Lsg;")
    public static class169 field1307 = class165.method1060("null", 1536);

    @OriginalMember(owner = "client!hf", name = "A", descriptor = "[I")
    public static int[] field1312 = new int[128];

    @OriginalMember(owner = "client!hf", name = "z", descriptor = "Lcb;")
    public static class22 field1311 = new class22();

    @OriginalMember(owner = "client!hf", name = "D", descriptor = "I")
    public static int field1315 = 0;

    @OriginalMember(owner = "client!hf", name = "F", descriptor = "Lsg;")
    public static class169 field1317 = class165.method1060("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", 1536);

    @OriginalMember(owner = "client!hf", name = "G", descriptor = "Lsg;")
    private static class169 field1318 = class165.method1060("Players", 1536);

    @OriginalMember(owner = "client!hf", name = "C", descriptor = "Lsg;")
    public static class169 field1314 = field1318;

    @OriginalMember(owner = "client!hf", name = "H", descriptor = "Lsg;")
    public static class169 field1319 = class165.method1060(":duelreq:", 1536);

    @OriginalMember(owner = "client!hf", name = "I", descriptor = "I")
    public static int field1320 = 0;

    @OriginalMember(owner = "client!hf", name = "E", descriptor = "B")
    public byte field1316;

    @OriginalMember(owner = "client!hf", name = "w", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!hf", name = "x", descriptor = "I")
    public int field1309;

    @OriginalMember(owner = "client!hf", name = "B", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "Lsg;")
    public class169 field1306;

    @OriginalMember(owner = "client!hf", name = "y", descriptor = "[[S")
    public static short[][] field1310;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "(I)V")
    public static void method435(int arg0) {
        field1310 = null;
        field1311 = null;
        field1317 = null;
        field1318 = null;
        field1312 = null;
        field1319 = null;
        field1307 = null;
        field1314 = null;
        if (arg0 <= 113) {
            method435(-78);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lqf;I)I")
    public static final int method436(class150 arg0, int arg1) {
        field1308++;
        class6 var2 = (class6) class204.field4003.method1045(((long) arg0.field2878 << 32) + ((long) arg0.field2850), (byte) -77);
        int var3 = 116 / ((arg1 + 34) / 52);
        return var2 == null ? arg0.field2858 : var2.field121;
    }
}
