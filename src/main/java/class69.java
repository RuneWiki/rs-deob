import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class69 extends class425 {

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "Lpm;")
    public static class349 field919 = new class349("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "Ltj;")
    public static class108 field923;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "Lvj;")
    public class256 field916;

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "Z")
    public boolean field922;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V", line = 4)
    public static final void method424(int arg0) {
        class125 var1 = class356.field5154;
        synchronized (class356.field5154) {
            class356.field5154.method754(0);
        }
        field920++;
        if (arg0 != -3946) {
            field924 = -119;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IZ)V", line = 17)
    private static final void method425(int arg0, boolean arg1) {
        field918++;
        class405.field5681.method91(4, arg0);
        if (!arg1) {
            method428((byte) 78);
        }
        class83.field1056.method91(4, arg0);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)V", line = 29)
    public static final void method426(int arg0, int arg1) {
        class9.field123 = arg1;
        field921++;
        class109.field1413.method102((byte) -75);
        if (arg0 != -693) {
            field923 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(B)V", line = 42)
    public static void method427(byte arg0) {
        field923 = null;
        int var1 = -105 % ((arg0 + 60) / 36);
        field919 = null;
    }

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "(B)V", line = 54)
    public static final void method428(byte arg0) {
        class246.method1716((byte) -87, 5);
        field917++;
        class85.method513(5, 116);
        if (arg0 > -62) {
            return;
        }
        class311.method2094((byte) 95, 5);
        class436.method2722(-16150, 5);
        class315.method2104(17343, 5);
        class70.method433(82, 5);
        class186.method1336(5, -1);
        class70.method432(1, 5);
        class70.method429(5, false);
        class204.method1424((byte) -125, 5);
        class408.method2575(5, 8226);
        class380.method2423((byte) 20, 5);
        class145.method1081(5, (byte) -100);
        class369.method2371((byte) 89, 5);
        class241.method1643(5, (byte) -68);
        class270.method1847(5, true);
        class44.method298(-1, 5);
        method425(5, true);
        class401.method2515((byte) 5, 5);
        class338.method2230(-1, 5);
        class189.method1355(50, 0);
        class449.method2797(5, (byte) 28);
        class405.method2536(5, true);
        class105.field1347.method91(4, 5);
        class353.field5120.method91(4, 5);
        class357.field5163.method91(4, 5);
        class199.field2840.method91(4, 5);
        class424.field6065.method91(4, 5);
    }
}
