import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class467 {

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "[I")
    public static int[] field6462 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "[I")
    public static int[] field6463 = new int[5];

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "Lgd;")
    public static class206 field6464 = new class206("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "F")
    public static float field6466;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
    public static int field6461;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "[Ljd;")
    public static class139[] field6465;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V")
    public static void method2746(byte arg0) {
        field6465 = null;
        field6463 = null;
        field6462 = null;
        field6464 = null;
        if (arg0 <= 82) {
            field6462 = null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(BLr;)I")
    public static final int method2747(byte arg0, class110 arg1) {
        field6461++;
        int var2 = 0;
        if (arg1.method700((byte) 85, class295.field3941)) {
            var2++;
        }
        if (arg1.method700((byte) 119, class16.field228)) {
            var2++;
        }
        if (arg1.method700((byte) -88, class230.field3060)) {
            var2++;
        }
        if (arg1.method700((byte) -110, class257.field3425)) {
            var2++;
        }
        if (arg1.method700((byte) -83, class202.field2744)) {
            var2++;
        }
        if (arg1.method700((byte) 94, class109.field1628)) {
            var2++;
        }
        if (arg1.method700((byte) 124, class94.field1379)) {
            var2++;
        }
        if (arg1.method700((byte) 120, class356.field4915)) {
            var2++;
        }
        if (arg1.method700((byte) -22, class422.field5733)) {
            var2++;
        }
        if (arg0 >= -91) {
            field6465 = null;
        }
        if (arg1.method700((byte) 94, class272.field3623)) {
            var2++;
        }
        if (arg1.method700((byte) 86, class64.field853)) {
            var2++;
        }
        if (arg1.method700((byte) -102, class195.field2635)) {
            var2++;
        }
        if (arg1.method700((byte) 90, class246.field3286)) {
            var2++;
        }
        if (arg1.method700((byte) -72, class196.field2670)) {
            var2++;
        }
        if (arg1.method700((byte) 107, class302.field4028)) {
            var2++;
        }
        if (arg1.method700((byte) 80, class295.field3944)) {
            var2++;
        }
        return var2;
    }
}
