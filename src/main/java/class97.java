import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class97 {

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public static int field1563 = 128;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "Lce;")
    public static class126 field1567 = class206.method1445(-7923, "blanc:");

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "Lce;")
    public static class126 field1565 = class206.method1445(-7923, "event_opbase");

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "Lce;")
    public static class126 field1566 = class206.method1445(-7923, " est d-Bj-9 dans votre liste d(Wamis)3");

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "Lce;")
    public static class126 field1568 = class206.method1445(-7923, "Connect-B au serveur de mise -9 jour");

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "Lcc;")
    public static class313 field1562;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V", line = 4)
    public static final void method659(int arg0) {
        if (class147.field2706.toLowerCase().indexOf("microsoft") == -1) {
            class317.field5432[93] = 43;
            class317.field5432[46] = 72;
            class317.field5432[59] = 57;
            class317.field5432[92] = 74;
            class317.field5432[45] = 26;
            class317.field5432[61] = 27;
            class317.field5432[44] = 71;
            if (class147.field2724 == null) {
                class317.field5432[192] = 58;
                class317.field5432[222] = 59;
            } else {
                class317.field5432[192] = 28;
                class317.field5432[520] = 59;
                class317.field5432[222] = 58;
            }
            class317.field5432[47] = 73;
            class317.field5432[91] = 42;
        } else {
            class317.field5432[188] = 71;
            class317.field5432[192] = 58;
            class317.field5432[223] = 28;
            class317.field5432[190] = 72;
            class317.field5432[221] = 43;
            class317.field5432[189] = 26;
            class317.field5432[220] = 74;
            class317.field5432[219] = 42;
            class317.field5432[222] = 59;
            class317.field5432[186] = 57;
            class317.field5432[187] = 27;
            class317.field5432[191] = 73;
        }
        field1564++;
        if (arg0 != 24916) {
            field1568 = (class126) null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BII)V", line = 61)
    public static final void method660(byte arg0, int arg1, int arg2) {
        field1569++;
        int var3 = arg1;
        if (arg1 > 25) {
            var3 = 25;
        }
        arg1--;
        int var4 = class205.field3520[arg1];
        int var5 = class140.field2564[arg1];
        if (arg2 == 0) {
            class51.field788++;
            class103.field1645.method1238(152, 60);
            class103.field1645.method933(arg0 ^ 0xFFFFFFDE, var3 + var3 + 3);
        }
        if (arg2 == 1) {
            class224.field3786++;
            class103.field1645.method1238(212, 114);
            class103.field1645.method933(-3, var3 + var3 + 3 + 14);
        }
        if (arg2 == 2) {
            class103.field1645.method1238(224, arg0 + 45);
            class103.field1645.method933(-3, var3 + var3 + 3);
            class199.field3400++;
        }
        class103.field1645.method976(class217.field3655[82] ? 1 : 0, -13817);
        class103.field1645.method935(var5 + class138.field2473, 1668921832);
        if (arg0 != 35) {
            field1566 = (class126) null;
        }
        class27.field378 = class205.field3520[0];
        class165.field2953 = class140.field2564[0];
        for (int var6 = 1; var6 < var3; var6++) {
            arg1--;
            class103.field1645.method933(-3, class205.field3520[arg1] - var4);
            class103.field1645.method953((byte) -119, class140.field2564[arg1] - var5);
        }
        class103.field1645.method935(class58.field914 + var4, 1668921832);
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)V", line = 158)
    public static void method661(int arg0) {
        field1562 = null;
        field1568 = null;
        field1567 = null;
        if (arg0 != 255) {
            field1567 = (class126) null;
        }
        field1565 = null;
        field1566 = null;
    }
}
